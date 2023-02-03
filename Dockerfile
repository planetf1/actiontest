# trivial demo to test actions
ARG EGERIA_BASE_IMAGE
ARG EGERIA_VERSION
FROM ${EGERIA_BASE_IMAGE}:${EGERIA_VERSION}
RUN echo "hello world"
