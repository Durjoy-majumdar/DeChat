package h30;

import a40.C79462a;
import f30.C86705b;
import g30.C87122a;

public final /* synthetic */ class b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f253312d;

    /* renamed from: e */
    public final /* synthetic */ C79462a.C79463a f253313e;

    /* renamed from: f */
    public final /* synthetic */ C87122a f253314f;

    /* renamed from: g */
    public final /* synthetic */ C86705b f253315g;

    /* renamed from: h */
    public final /* synthetic */ long f253316h;

    public /* synthetic */ b$$a(boolean z, C79462a.C79463a aVar, C87122a aVar2, C86705b bVar, long j) {
        this.f253312d = z;
        this.f253313e = aVar;
        this.f253314f = aVar2;
        this.f253315g = bVar;
        this.f253316h = j;
    }

    public final void run() {
        boolean z = this.f253312d;
        C79462a.C79463a aVar = this.f253313e;
        C87122a aVar2 = this.f253314f;
        C86705b bVar = this.f253315g;
        long j = this.f253316h;
        if (aVar != null) {
            z = true;
            if (((double) aVar.mo109459a(1)) <= 0.5d) {
                z = false;
            }
        }
        aVar2.mo121569b(bVar, j, z);
    }
}
