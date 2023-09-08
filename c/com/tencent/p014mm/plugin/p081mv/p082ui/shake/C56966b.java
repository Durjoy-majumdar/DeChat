package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import lu3.C34379c;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.b */
public class C56966b implements Runnable {

    /* renamed from: d */
    public int f163164d;

    /* renamed from: e */
    public final /* synthetic */ MusicMainUINew f163165e;

    public C56966b(MusicMainUINew musicMainUINew) {
        this.f163165e = musicMainUINew;
        this.f163164d = musicMainUINew.f163143g.intValue();
    }

    public void run() {
        int i = this.f163164d + 100;
        this.f163164d = i;
        MusicMainUINew musicMainUINew = this.f163165e;
        if (i >= musicMainUINew.f163155v) {
            C34379c<?> cVar = musicMainUINew.f163157x;
            if (cVar != null) {
                cVar.cancel(true);
                return;
            }
            return;
        }
        C56987s sVar = musicMainUINew.f163142f;
        if (sVar != null) {
            sVar.f163206i = i;
            C61926c.m72668M(new C56992t(sVar, i));
        }
    }
}
