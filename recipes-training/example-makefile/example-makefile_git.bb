DESCRIPTION = "Makefile example"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=838c366f69b72c5df05c96dff79b35f2"

SRCREV = "2c0f9eacec6c886991563f092519a55e1c74dc92"
SRC_URI = "git://github.com/fbertux/${BPN}.git;protocol=https"

S = "${WORKDIR}/git"

do_configure[noexec] = "1"

do_compile() {
    oe_runmake
}

do_install() {
    oe_runmake DESTDIR=${D} install
}
