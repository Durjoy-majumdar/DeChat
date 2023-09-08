package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import s62.C101554f;

/* renamed from: com.tencent.mm.ui.chatting.gallery.r0 */
public class C97121r0 implements Runnable {
    public C97121r0(ImageGalleryVideoHandler imageGalleryVideoHandler) {
    }

    public void run() {
        String c = C101554f.m133318c();
        if (!Util.isNullOrNil(c)) {
            C115669n.INSTANCE.kvStat(14092, c);
        } else {
            C115669n.INSTANCE.kvStat(14092, "0");
        }
    }
}
