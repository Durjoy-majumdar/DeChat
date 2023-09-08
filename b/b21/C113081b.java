package b21;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.ReInitVoiceOffLineSynthesizerEvent;
import com.tencent.p014mm.plugin.collect.model.voice.C115313d;
import com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import e21.C116642q;
import e21.C116660y;
import e21.C45539l0;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C89349b;
import tc0.C77885p;
import te3.C64334dz2;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: b21.b */
public class C113081b extends C86301e {

    /* renamed from: d */
    public boolean f338485d = false;

    /* renamed from: b21.b$a */
    public class C28247a implements C11385n {
        public C28247a(C113081b bVar) {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(304, this);
            if (i != 0 || i2 != 0) {
                Log.m105924i("MicroMsg.SubCoreCollect", "set sound fail!");
            }
        }
    }

    public static C113081b yx0() {
        return (C113081b) C86312j.m106911c(C113081b.class);
    }

    public boolean Ax0() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_F2F_RING_TONE_STRING, "");
        long k = C75592q0.m90781k();
        if (Util.isNullOrNil(str) || str.equals("in.caf")) {
            return (k & 32768) != 0;
        }
        Log.m105924i("MicroMsg.SubCoreCollect", "old version switch is open, sync to new version");
        C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(k | 32768));
        C64334dz2 dz22 = new C64334dz2();
        dz22.f182905d = 1;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(209, dz22));
        return true;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C89349b bVar = C116660y.f349800q;
        F2fRcvVoiceOffLineLogic d = F2fRcvVoiceOffLineLogic.m162050d();
        if (d.f345535h) {
            Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "onNotifyChange()：is already init()");
            return;
        }
        yx0().Ax0();
        Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "onNotifyChange()");
        d.mo175086k(true);
        d.f345535h = true;
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C116660y.m164524O();
        F2fRcvVoiceOffLineLogic d = F2fRcvVoiceOffLineLogic.m162050d();
        d.getClass();
        Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "destroy()");
        try {
            C115313d dVar = d.f345529b;
            if (dVar != null) {
                dVar.mo175098a();
            }
        } catch (Exception e) {
            Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "destroy() synthesizer.destroy() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
        IListener<CheckResUpdateCacheFileEvent> iListener = d.f345533f;
        if (iListener != null) {
            iListener.dead();
        }
        IListener<ReInitVoiceOffLineSynthesizerEvent> iListener2 = d.f345534g;
        if (iListener2 != null) {
            iListener2.dead();
        }
        F2fRcvVoiceOffLineLogic.f345523i = false;
    }

    public void vx0() {
        xx0("in.caf");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_F2F_RING_TONE_STRING, "in.caf");
    }

    public void wx0() {
        xx0("cash.caf");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_F2F_RING_TONE_STRING, "cash.caf");
    }

    public final void xx0(String str) {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(304, new C28247a(this));
        C45539l0 l0Var = new C45539l0(3, Util.nullAs(str, ""));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(l0Var);
    }

    public C116642q zx0() {
        C86709a0.m107523b().mo121108c();
        return C116642q.INSTANCE;
    }
}
