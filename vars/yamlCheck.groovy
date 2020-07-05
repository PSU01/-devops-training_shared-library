#!/usr/bin/env groovy

def call() {
   sh 'yamllint --version'
   sh 'yamllint \${WORKSPACE}'
}
