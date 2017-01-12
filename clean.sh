#!/bin/bash
# delete idea out directory
find ./ -name "out" -type d -exec rm -rf {} \;
# delete netbean build directory
find ./ -name "build" -type d -exec rm -rf {} \;
