FROM maven:3.8.6-jdk-11

WORKDIR /apps/qa
RUN chmod -R 777 /apps/qa

# Install tools.
RUN apt update -y & apt install -y wget unzip
ARG DEBIAN_FRONTEND=noninteractive
RUN apt-get install -y tzdata

# Install Chrome.
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add -
RUN sh -c 'echo "deb http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google-chrome.list'
RUN apt-get update
RUN apt-get install -y google-chrome-stable

# Install ChromeDriver.
RUN wget -N https://chromedriver.storage.googleapis.com/105.0.5195.19/chromedriver_linux64.zip -P ~/
RUN unzip ~/chromedriver_linux64.zip -d ~/
RUN rm ~/chromedriver_linux64.zip
RUN mv -f ~/chromedriver /usr/local/bin/chromedriver
RUN chmod +x /usr/local/bin/chromedriver

ENV env_browser_param Chrome

COPY src /apps/qa/src
COPY pom.xml /apps/qa
COPY chromeRun.xml /apps/qa

ENTRYPOINT mvn test -Dbrowser_param=${env_browser_param}