DESCRIPTION = "Simple C code example"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=838c366f69b72c5df05c96dff79b35f2"

SRCREV = "e53d5cd4498c76ca8c58e18d0d14891d20f67eab"
SRC_URI = "git://github.com/fbertux/${BPN}.git;protocol=https"

S = "${WORKDIR}/git"

do_compile() {
    ${CC} ${PN}.c -o ${PN}
}

do_install() {
    install -Dm 0755 ${PN} ${D}${bindir}/${PN}
}
