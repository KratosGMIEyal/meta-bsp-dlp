DESCRIPTION = "Bit Service"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Apache-2.0;md5=6f2e58f9db926d1d557f69da36ac4b7c"

SRC_URI = "file://mtp-controller "

S = "${WORKDIR}"


do_install() {

    
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/mtp-controller ${D}${bindir}/mtp-controller

}



