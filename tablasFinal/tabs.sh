#! /bin/bash
xclip -o -selection c > /opt/tablasFinal/lisNum.txt
cd /opt/tablasFinal
java star | xclip -i -selection c
