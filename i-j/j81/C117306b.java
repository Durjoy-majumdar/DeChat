package j81;

import c91.C113255a;
import c91.C113256b;
import com.tencent.p014mm.sdk.platformtools.Log;
import k81.C117390a;
import sf0.C90189z;
import v81.C118667b;

/* renamed from: j81.b */
public class C117306b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118667b f351186d;

    /* renamed from: e */
    public final /* synthetic */ C117302a f351187e;

    public C117306b(C117302a aVar, C118667b bVar) {
        this.f351187e = aVar;
        this.f351186d = bVar;
    }

    public void run() {
        ((C117390a) this.f351187e.f351172e).mo182072a(this.f351186d.f355080a);
        ((C117390a) this.f351187e.f351173f).mo182072a(this.f351186d.f355080a);
        C113256b bVar = this.f351187e.f351174g;
        C118667b bVar2 = this.f351186d;
        C90189z.C90190a aVar = bVar.f338868a;
        if (aVar != null && bVar2 != null) {
            new C113255a(aVar, bVar2.f355080a, bVar2.f355084e).mo165799a();
            Log.m105924i("EdgeComputingDataStorage", "[EdgeComputingDataStorage] clearAllData configID : " + bVar2.f355080a);
        }
    }
}
