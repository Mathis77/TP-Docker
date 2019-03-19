# Based on alpine v3.4 image
FROM alpine:3.4

# Run some commands and commit the result as a new image's layer
# It install nginx server and php5 and create a folder nginx in /run
RUN apk --update add nginx php5-fpm && \
    mkdir -p /run/nginx

# Copy the www folder into the www folder of the container
# Same goes for the others
# Actually, ADD instruction is going to copies new files, directories or remote file URLs
#   and adds them to the filesystem of the image
ADD www /www
ADD nginx.conf /etc/nginx/
ADD php-fpm.conf /etc/php5/php-fpm.conf
ADD run.sh /run.sh

# Declare environments variables
ENV LISTEN_PORT=80

# Define the listening port
# The last command should run a script
EXPOSE 80
CMD /run.sh
