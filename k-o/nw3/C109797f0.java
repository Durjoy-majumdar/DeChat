package nw3;

import nw3.C109804j;

/* renamed from: nw3.f0 */
public class C109797f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f328662d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f328663e;

    /* renamed from: f */
    public final /* synthetic */ C109804j f328664f;

    public C109797f0(C109804j jVar, String str, byte[] bArr) {
        this.f328664f = jVar;
        this.f328662d = str;
        this.f328663e = bArr;
    }

    public void run() {
        synchronized (this.f328664f.f328705a) {
            for (C109804j.C109807c q : this.f328664f.f328705a) {
                q.mo161060q(this.f328662d, this.f328663e);
            }
        }
    }
}
