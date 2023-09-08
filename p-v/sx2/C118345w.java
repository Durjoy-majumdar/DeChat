package sx2;

import dd0.C116607d;

/* renamed from: sx2.w */
public class C118345w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f353694d;

    /* renamed from: e */
    public final /* synthetic */ String f353695e;

    /* renamed from: f */
    public final /* synthetic */ C118339u f353696f;

    public C118345w(C118339u uVar, String str, String str2) {
        this.f353696f = uVar;
        this.f353694d = str;
        this.f353695e = str2;
    }

    public void run() {
        synchronized (this.f353696f.f353679a) {
            for (C116607d A5 : this.f353696f.f353679a) {
                A5.mo176184A5(this.f353694d, this.f353695e);
            }
        }
    }
}
