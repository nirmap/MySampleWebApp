#!/usr/bin/env bash

sudo export DISPLAY=:0 
sudo Xvfb :0 -ac -screen 0 1024x768x24 &
