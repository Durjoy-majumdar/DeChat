package nw3;

import nw3.C109804j;

/* renamed from: nw3.w */
public class C109820w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f328737d;

    /* renamed from: e */
    public final /* synthetic */ int f328738e;

    /* renamed from: f */
    public final /* synthetic */ C109804j f328739f;

    public C109820w(C109804j jVar, String str, int i) {
        this.f328739f = jVar;
        this.f328737d = str;
        this.f328738e = i;
    }

    public void run() {
        synchronized (this.f328739f.f328705a) {
            for (C109804j.C109807c i : this.f328739f.f328705a) {
                i.mo161052i(this.f328737d, this.f328738e);
            }
        }
    }
}
