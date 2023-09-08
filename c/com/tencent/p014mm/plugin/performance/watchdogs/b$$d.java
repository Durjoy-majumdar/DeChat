package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.b$$d */
public enum b$$d {
    FD_TYPE_ANNON_INODE_EVENT("anon_inode:\\[event.*\\]"),
    FD_TYPE_ANNON_INODE_DMABUF(".*dmabuf.*"),
    FD_TYPE_ANNON_INODE_GRALLOC("anon_inode:gralloc.*"),
    FD_TYPE_ANNON_INODE_MALITL("anon_inode:malitl.*"),
    FD_TYPE_SOCKET(".*socket:.*"),
    FD_TYPE_PIPE(".*pipe:[0-9]*"),
    FD_TYPE_PATH_DATA_MM_FILES_MMKV("/data/.*/" + MMApplicationContext.getApplicationId() + "/files/mmkv/.*"),
    FD_TYPE_PATH_DATA_MM_FILES_KVCOMM("/data/.*/" + MMApplicationContext.getApplicationId() + "/files/kvcomm/.*"),
    FD_TYPE_PATH_DATA_MM_FILES_XLOG("/data/.*/" + MMApplicationContext.getApplicationId() + "/files/xlog/.*"),
    FD_TYPE_PATH_DATA_MM_FILES_OTHERS("/data/.*/" + MMApplicationContext.getApplicationId() + "/files/.*"),
    FD_TYPE_PATH_DATA_MM_MICRO_MSG("/data/.*/" + MMApplicationContext.getApplicationId() + "/MicroMsg/.*"),
    FD_TYPE_PATH_DATA_MM_OTHERS("/data/.*/" + MMApplicationContext.getApplicationId() + "/.*"),
    FD_TYPE_PATH_EXT_AC_VOICE(".*/MicroMsg/[0-9a-eA-E]+/voice2/.*"),
    FD_TYPE_PATH_EXT_AC_VIDEO(".*/MicroMsg/[0-9a-eA-E]+/video/.*"),
    FD_TYPE_PATH_EXT_AC_ATTACHMENT(".*/MicroMsg/[0-9a-eA-E]+/attachment/.*"),
    FD_TYPE_PATH_EXT_AC_IMAGE(".*/MicroMsg/[0-9a-eA-E]+/image[2]?/.*"),
    FD_TYPE_PATH_EXT_AC_OTHERS(".*/MicroMsg/[0-9a-eA-E]+/.*"),
    FD_TYPE_PATH_EXT_OTHERS(".*/MicroMsg/.*"),
    FD_TYPE_PATH_SYSTEM_FRAMEWORK("/system/framework/.*"),
    FD_TYPE_PATH_DEV_ASHMEM("/dev/ashmem"),
    FD_TYPE_PATH_DEV_OTHERS("/dev/.*"),
    FD_TYPE_RAW_PATH("/proc/[0-9]*/fd/[0-9]*"),
    FD_TYPE_OTHERS(".*");
    

    /* renamed from: d */
    public final String f248642d;

    /* access modifiers changed from: public */
    b$$d(String str) {
        this.f248642d = str;
    }
}
