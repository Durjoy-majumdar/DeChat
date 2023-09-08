package nk2;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: nk2.c */
public final class C21639c<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C21635b f61257d;

    public C21639c(C21635b bVar) {
        this.f61257d = bVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        int i = ((IPCInteger) obj).f10313d;
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "errorCode " + i);
        C21635b bVar = this.f61257d;
        bVar.f61245g.f60676d = i;
        if (i == 1) {
            bVar.mo33891Ir();
        }
        C21635b bVar2 = this.f61257d;
        bVar2.ev0(bVar2.f61245g);
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "HandleStartUpCheck end");
    }
}
