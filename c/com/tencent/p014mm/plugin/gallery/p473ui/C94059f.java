package com.tencent.p014mm.plugin.gallery.p473ui;

import com.tencent.p014mm.plugin.gallery.p473ui.C94061h;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;

/* renamed from: com.tencent.mm.plugin.gallery.ui.f */
public class C94059f implements C96875r0.C96876a {

    /* renamed from: d */
    public final /* synthetic */ C94061h.C94065d f271572d;

    /* renamed from: e */
    public final /* synthetic */ C94061h f271573e;

    public C94059f(C94061h hVar, C94061h.C94065d dVar) {
        this.f271573e = hVar;
        this.f271572d = dVar;
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        return 0;
    }

    public void onCompletion() {
        this.f271573e.mo129064l(this.f271572d);
        this.f271572d.f271599f.stop();
    }

    public void onError(int i, int i2) {
        this.f271573e.mo129064l(this.f271572d);
    }

    public void onPrepared() {
        this.f271572d.f271599f.start();
        C94061h hVar = this.f271573e;
        C94061h.C94065d dVar = this.f271572d;
        hVar.getClass();
        dVar.f271599f.setVisibility(0);
        dVar.f271597d.setVisibility(8);
        dVar.f271596c.setVisibility(8);
        dVar.f271595b.setVisibility(8);
        hVar.f271584s.sendMessageDelayed(hVar.f271584s.obtainMessage(1, dVar), 500);
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
    }
}
