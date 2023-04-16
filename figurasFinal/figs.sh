#! /bin/bash
xclip -o -selection c > /opt/figurasFinal/figureNames.txt
cd /opt/figurasFinal
gmake | xclip -i -selection c
