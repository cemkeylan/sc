#!/bin/sh -e
out() { printf '%s\n' "$@";}; die() { out "$@"; exit 1 ;}; readme() { out sc ======= '' "Simplistic hyper-minimal static portable C99 POSIX shell service manager in POSIX compliant shell script in a single minimal line of code. It is so simple, that it can be run under all POSIX systems. It is so static that this readme is part of this hyper-minimal service manager." '' Dependencies ============ '' "- systemd" "- POSIX make" '' "The \`Makefile\` is built-in for maximum minimalistic static-link-like portability coolness!" '' Install ======= '' "In order to install sc, run (as root if needed):" '' "    ./sc --install PREFIX=/usr" '' Rant ==== '' "If you still did not pick up on the sarcasm, this is how you look like with your minimalistic 'Boost/jQuery/some-other-bloat-library' programs." "SLOC doesn't mean anything if you are calling a huge piece of crap to make up for your lack of skills." '' "If you are making your code unreadable for the sake of SLOC, you are also in the wrong. You may not be calling a huge library, but you are giving others (and yourself) a hard time reading your code. You should always make sure your code is readable and well commented instead of garbling it up to brag about your code size. Just take a look at this mess of a code, it really is a one-line shell script containing this README file, and it is an absolute pain to read. Don't be like this, be smart."  ''| fold -sw 76; exit 0 ;}; case $1 in --print-readme) readme ;; --generate-readme) readme | tee README ;; --install) printf 'install:\n\t@echo Do not actually do that\n\n.PHONY: install\n.POSIX:' | make -f - install ;; *) command -v systemctl || die "System dependencies are not met" "Please install systemd"; systemctl "$@"; esac
