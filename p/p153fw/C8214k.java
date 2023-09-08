package p153fw;

import android.content.Context;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6684b2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6688l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import p159gw.C8463i;
import p159gw.C8464j;

@C86522b
/* renamed from: fw.k */
public class C8214k extends C86301e implements C8464j {
    public C8463i aq0(Context context) {
        if (C6688l0.f24047f == null) {
            Log.m105928w("MicroMsg.HeadingPitchService", "HeadingPitchSensorMgr.instance == null, init here");
            C6688l0 l0Var = new C6688l0();
            C6684b2.m6985a(l0Var);
            C6688l0.f24047f = l0Var;
            l0Var.mo7611d(context);
            C6688l0.f24047f = l0Var;
        }
        return C6688l0.f24047f;
    }

    public C8463i do0() {
        return new C6688l0();
    }
}
