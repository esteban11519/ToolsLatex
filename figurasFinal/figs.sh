#! /bin/bash
xclip -o -selection c > /opt/figurasFinal/figureNames.txt
cd /opt/figurasFinal
gmake
java Start | xclip -i -selection c
