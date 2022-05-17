FROM azul/zulu-openjdk:17-jre-headless
RUN apt-get update -qq && \
    apt-get upgrade -y -qq \
    apt-get -qq -y dist-upgrade && \
    apt -y autoremove && \
    rm -rf /var/lib/apt/lists/*
