package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import gy3.C8479f0;
import nk2.C21641f;

/* renamed from: jk2.m */
public final class C117357m implements C21641f.C21646e {

    /* renamed from: a */
    public final /* synthetic */ C8479f0<Bundle> f351344a;

    /* renamed from: b */
    public final /* synthetic */ C1256g<Bundle> f351345b;

    public C117357m(C8479f0<Bundle> f0Var, C1256g<Bundle> gVar) {
        this.f351344a = f0Var;
        this.f351345b = gVar;
    }

    /* renamed from: a */
    public void mo33913a(String str) {
        ((Bundle) this.f351344a.f27484d).putBoolean("result", false);
        C1256g<Bundle> gVar = this.f351345b;
        if (gVar != null) {
            gVar.mo894a(this.f351344a.f27484d);
        }
    }

    /* renamed from: b */
    public void mo33914b() {
        ((Bundle) this.f351344a.f27484d).putBoolean("result", true);
        C1256g<Bundle> gVar = this.f351345b;
        if (gVar != null) {
            gVar.mo894a(this.f351344a.f27484d);
        }
    }
}
