package com.tencent.p014mm.sdk.platformtools;

import p206nj.C88957l;

/* renamed from: com.tencent.mm.sdk.platformtools.WeChatCommonLibs */
public class WeChatCommonLibs {
    private static volatile boolean sLoaded;

    public static void load() {
        Class<WeChatCommonLibs> cls = WeChatCommonLibs.class;
        if (!sLoaded) {
            C88957l.m111079o("commonimgdec", cls.getClassLoader());
            C88957l.m111079o("wechatcommon", cls.getClassLoader());
            sLoaded = true;
        }
    }
}
