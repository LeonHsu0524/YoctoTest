DESCRIPTION = "ADLINK BSP Image with XFCE X Window"

LICENSE = "MIT"

IMAGE_FEATURES += " package-management ssh-server-dropbear hwcodecs"

inherit core-image

REQUIRED_DISTRO_FEATURES = "x11"

IMAGE_INSTALL += "packagegroup-core-x11 \
     	 	  packagegroup-xfce-base "
		  
export IMAGE_BASENAME = "adlink-xfce-x86"

### XFCE Tools
IMAGE_INSTALL_append = " garcon epiphany sysprof xfce4-screenshooter ristretto xfce4-taskmanager xfce4-appfinder xfce-dusk-gtk3 xfceshutdown "

## SEMA applications
IMAGE_INSTALL_append = " sema semagui-desktop trolltech startupconfig"
                 


