FROM httpd:2.4-alpine
COPY build/ /usr/local/apache2/htdocs/
RUN sed -i '/LoadModule rewrite_module/s/^#//g' /usr/local/apache2/conf/httpd.conf  \
    && sed -i 's#AllowOverride [Nn]one#AllowOverride All#' /usr/local/apache2/conf/httpd.conf