DESCRIPTION = "SDL example"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=838c366f69b72c5df05c96dff79b35f2"

DEPENDS = "libsdl2"

SRCREV = "4610fe3841f99d8c24d9417f585cd2df0544fe72"
SRC_URI = "git://github.com/fbertux/${BPN}.git;protocol=https"

S = "${WORKDIR}/git"

inherit pkgconfig

do_compile() {
    oe_runmake
}

do_install() {
    install -Dm 0755 ${S}/main ${D}${bindir}/${PN}
    install -Dm 0644 ${S}/grumpy-cat.bmp ${D}${datadir}/${PN}/grumpy-cat.bmp
}

FILES_${PN} += "${datadir}"
