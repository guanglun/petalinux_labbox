#!/bin/sh

echo 906 > /sys/class/gpio/export
echo 919 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio906/direction
echo out > /sys/class/gpio/gpio919/direction
echo 0 > /sys/class/gpio/gpio906/value
echo 0 > /sys/class/gpio/gpio919/value