package tf0;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60206u1;
import lc3.C10485b;
import up1.C37521f;
import z04.C112550d0;

@C86522b
/* renamed from: tf0.s0 */
public final class C37047s0 extends C86301e implements C60206u1 {

    /* renamed from: d */
    public boolean f98206d;

    /* renamed from: Ab */
    public int mo60943Ab() {
        return C37521f.f99374d.mo61198x();
    }

    public boolean Cw0() {
        return this.f98206d;
    }

    /* renamed from: Dg */
    public int mo60945Dg() {
        C37521f.f99374d.getClass();
        return C37521f.f99402g1.mo60266n().intValue();
    }

    public int Hl0() {
        return C37521f.f99374d.mo61151E();
    }

    public boolean I70() {
        C37521f.f99374d.getClass();
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_use_daemon_record, 0) == 1;
    }

    /* renamed from: Lk */
    public int mo60948Lk() {
        C37521f.f99374d.getClass();
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_high_record_bitrate, 10000000);
    }

    /* renamed from: UK */
    public int mo60949UK() {
        C37521f.f99374d.getClass();
        return C37521f.f99455m3.mo60266n().intValue();
    }

    /* renamed from: Yw */
    public int mo60950Yw() {
        return C37521f.f99374d.mo61199y();
    }

    /* renamed from: g1 */
    public VideoTransPara mo60951g1() {
        return C37521f.f99374d.mo61162P();
    }

    /* renamed from: g8 */
    public void mo60952g8(boolean z) {
        Log.m105924i("FinderConfigFeatureService", "setAutoScrollStatus = " + z);
        this.f98206d = z;
    }

    /* renamed from: lE */
    public int mo60953lE() {
        C37521f.f99374d.getClass();
        return C37521f.f99464n3.mo60266n().intValue();
    }

    public int rh0() {
        C37521f.f99374d.getClass();
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderFeedCompressPicLevel");
        if (c == null || c.length() == 0) {
            return 90;
        }
        Log.m105918d("FinderConfig", "FinderFeedCompressPicLevel=" + c);
        C87412m.m108593f(c, "info");
        return Util.safeParseInt(C112550d0.m153799i0(c).toString());
    }

    /* renamed from: tD */
    public VideoTransPara mo60955tD() {
        return C37521f.f99374d.mo61161O();
    }
}
