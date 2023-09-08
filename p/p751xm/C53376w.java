package p751xm;

import android.content.Context;
import com.tencent.p014mm.pluginsdk.model.app.C44547a2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import p763ym.C39073u;

@C86522b
/* renamed from: xm.w */
public class C53376w extends C86301e implements C39073u {
    /* renamed from: Ap */
    public void mo61916Ap(Context context) {
        C44547a2.m48943c().mo69335e(context);
    }

    /* renamed from: eR */
    public void mo61917eR() {
        C44547a2 c = C44547a2.m48943c();
        c.getClass();
        if (C86709a0.m107522a()) {
            c.f120801a = false;
            c.f120802b = false;
        }
    }

    public void reset() {
        C44547a2 c = C44547a2.m48943c();
        c.getClass();
        Log.m105924i("MicroMsg.SuggestionAppListLogic", "reset getServiceAppList");
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119680N(352276, 0);
        c.f120808h = 0;
        c.f120807g = true;
    }
}
