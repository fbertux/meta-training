DESCRIPTION = "Autotools example"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=838c366f69b72c5df05c96dff79b35f2"

SRCREV = "1ee6714b88df91dd44c9aae6d9264a7e7325ce3e"
SRC_URI = "git://github.com/fbertux/${BPN}.git;protocol=https"

S = "${WORKDIR}/git"

inherit autotools
