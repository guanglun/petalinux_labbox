#
# This file is the cpu1 recipe.
#

SUMMARY = "Simple cpu1 application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://cpu1.elf"
S = "${WORKDIR}"
INSANE_SKIP_${PN} = "arch"

do_install() {
	install -d ${D}/lib/firmware
	install -m 0644 ${S}/cpu1.elf ${D}/lib/firmware/cpu1.elf
}
FILES_${PN} = "/lib/firmware/cpu1.elf"