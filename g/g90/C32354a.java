package g90;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f72.C97842b;
import gy3.C87412m;
import h81.C32735h;
import java.util.List;
import p156gj.C87203t;
import z04.C112550d0;

/* renamed from: g90.a */
public final class C32354a {

    /* renamed from: a */
    public final int f85860a;

    /* renamed from: b */
    public final boolean f85861b;

    /* renamed from: c */
    public final int f85862c;

    /* renamed from: d */
    public final String f85863d;

    /* renamed from: e */
    public final List<String> f85864e;

    public C32354a(Context context) {
        Class cls = C32735h.class;
        C87412m.m108594g(context, "context");
        this.f85860a = C97842b.m126299p(context) / 1024;
        this.f85861b = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_multi_record, true);
        this.f85862c = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multi_record_ram_enable, 5000);
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_multi_record_model_black, "");
        this.f85863d = Y60;
        C87412m.m108593f(Y60, "blackModelList");
        this.f85864e = C112550d0.m153784T(Y60, new char[]{';'}, false, 0, 6, (Object) null);
    }

    /* renamed from: a */
    public final boolean mo58581a() {
        for (String b : this.f85864e) {
            if (C87412m.m108589b(b, C87203t.m108275k())) {
                Log.m105924i("MicroMsg.DaemonChecker", "disable by blackModelList Build.MODEL:" + C87203t.m108275k());
                return false;
            }
        }
        if (this.f85860a >= this.f85862c) {
            return true;
        }
        Log.m105924i("MicroMsg.DaemonChecker", "disable by lower ram:" + this.f85860a + "  config:" + this.f85862c);
        return false;
    }
}
