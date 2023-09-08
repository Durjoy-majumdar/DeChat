package com.tencent.p014mm.plugin.downloader.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader.model.C29847b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.downloader.model.c */
public class C29852c implements Runnable {
    public C29852c(C29847b.C29849b.C29850a aVar) {
    }

    public void run() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.cv5), 0).show();
    }
}
