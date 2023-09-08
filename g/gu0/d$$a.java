package gu0;

import p284zb.C91627a;

public final /* synthetic */ class d$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87388d f253250d;

    /* renamed from: e */
    public final /* synthetic */ int f253251e;

    /* renamed from: f */
    public final /* synthetic */ C91627a f253252f;

    public /* synthetic */ d$$a(C87388d dVar, int i, C91627a aVar) {
        this.f253250d = dVar;
        this.f253251e = i;
        this.f253252f = aVar;
    }

    public final void run() {
        C87388d dVar = this.f253250d;
        int i = this.f253251e;
        C91627a aVar = this.f253252f;
        dVar.getClass();
        aVar.f262485b.mo112428b();
        aVar.f262484a.notifyDestroy();
        dVar.f253246f.remove(i);
    }
}
