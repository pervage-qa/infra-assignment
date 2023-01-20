FROM alpine AS base
COPY /multi-stage/name.sh .
RUN chmod +x name.sh

FROM base
CMD ["/bin/sh", "-c", "./name.sh"]