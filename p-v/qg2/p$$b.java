package qg2;

import ob0.C117747y;

public final /* synthetic */ class p$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C77335p f225484d;

    /* renamed from: e */
    public final /* synthetic */ int f225485e;

    /* renamed from: f */
    public final /* synthetic */ int f225486f;

    /* renamed from: g */
    public final /* synthetic */ String f225487g;

    /* renamed from: h */
    public final /* synthetic */ C117747y f225488h;

    public /* synthetic */ p$$b(C77335p pVar, int i, int i2, String str, C117747y yVar) {
        this.f225484d = pVar;
        this.f225485e = i;
        this.f225486f = i2;
        this.f225487g = str;
        this.f225488h = yVar;
    }

    public final void run() {
        C77335p pVar = this.f225484d;
        pVar.f225464e.onSceneEnd(this.f225485e, this.f225486f, this.f225487g, this.f225488h);
    }
}
