FROM alpine AS base
COPY ./name.sh .
RUN chmod +x name.sh

FROM base
CMD ["/bin/sh", "-c", "./name.sh"]