package com.tencent.p014mm.plugin.wepkg.utils;

import com.tencent.p014mm.plugin.wepkg.model.C44523r;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.wepkg.utils.c */
public class C44535c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f120769d;

    public C44535c(WepkgListener wepkgListener, List list) {
        this.f120769d = list;
    }

    public void run() {
        int i = 0;
        while (i < this.f120769d.size() && i < 5) {
            C44523r.m48890b().mo69301d((String) this.f120769d.get(i), false);
            i++;
        }
    }
}
