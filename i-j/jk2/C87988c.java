package jk2;

import android.os.Bundle;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nk2.C21641f;

/* renamed from: jk2.c */
public final class C87988c implements C21641f.C21644c {

    /* renamed from: a */
    public final /* synthetic */ C1256g<Bundle> f254591a;

    public C87988c(C1256g<Bundle> gVar) {
        this.f254591a = gVar;
    }

    /* renamed from: a */
    public void mo33912a(boolean z, String str) {
        C87412m.m108594g(str, MJTextResolver.KEY_DEVICE_NAME);
        Log.m105925i("MicroMsg.Rtos.RtosWatchLoginUI", "onChannelReady %b %s", Boolean.valueOf(z), str);
        Bundle bundle = new Bundle();
        bundle.putBoolean("result", z);
        bundle.putString("device_name", str);
        C1256g<Bundle> gVar = this.f254591a;
        if (gVar != null) {
            gVar.mo894a(bundle);
        }
    }
}
