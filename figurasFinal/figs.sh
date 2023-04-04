#! /bin/bash
xclip -o -selection c > /opt/figurasFinal/nombreFiguras.txt
cd /opt/figurasFinal
java star | xclip -i -selection c
