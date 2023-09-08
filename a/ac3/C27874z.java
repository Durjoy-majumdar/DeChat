package ac3;

import com.tencent.p014mm.autogen.mmdata.rpt.WeVisionModelResStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WevisionSwitchResStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f62.C31922b1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import ob0.C35136m;
import qr3.C110470e;
import sk2.C101643c;
import sx3.C110818d0;

/* renamed from: ac3.z */
public final class C27874z implements C31922b1 {

    /* renamed from: ac3.z$a */
    public static final class C27875a extends C87413o implements C32226l<String, CharSequence> {

        /* renamed from: d */
        public static final C27875a f77022d = new C27875a();

        public C27875a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return str;
        }
    }

    /* renamed from: ac3.z$b */
    public static final class C27876b extends C87413o implements C32226l<String, CharSequence> {

        /* renamed from: d */
        public static final C27876b f77023d = new C27876b();

        public C27876b() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return str;
        }
    }

    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C87412m.m108594g(map, "values");
        C87412m.m108594g(aVar, "addMsgInfo");
        Log.m105924i("MicroMsg.WeVisModelMgr", "sysMsg consume: " + str + ", " + C110818d0.m150921S(map.keySet(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C27875a.f77022d, 31, (Object) null) + ", " + C110818d0.m150921S(map.values(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C27876b.f77023d, 31, (Object) null));
        String str2 = map.get(".sysmsg.mmcvswitch.retry");
        int i = 0;
        if (!(str2 == null || str2.length() == 0)) {
            i = Util.safeParseInt(str2);
        }
        if (i == 1) {
            WeVisionModelResStruct weVisionModelResStruct = new WeVisionModelResStruct();
            if (C110470e.f330363a == 0) {
                C110470e.f330363a = 2011400;
            }
            weVisionModelResStruct.f79225d = C110470e.f330363a;
            weVisionModelResStruct.f79233l = ((C101643c) C86312j.m106911c(C101643c.class)).mo140873UJ();
            weVisionModelResStruct.f79231j = 3;
            Log.m105924i("MicroMsg.WeVisionModelReporter", "reportSysMsgCgi: " + weVisionModelResStruct.mo1006q());
            weVisionModelResStruct.mo86054n();
            C27862u0.f77002a.mo55650e(0);
            return null;
        } else if (i != 2) {
            return null;
        } else {
            C39538h0 h0Var = C39538h0.f106157d;
            h0Var.getClass();
            WevisionSwitchResStruct wevisionSwitchResStruct = new WevisionSwitchResStruct();
            if (C110470e.f330363a == 0) {
                C110470e.f330363a = 2011400;
            }
            wevisionSwitchResStruct.f79234d = C110470e.f330363a;
            wevisionSwitchResStruct.f79236f = 3;
            wevisionSwitchResStruct.mo86054n();
            h0Var.Nq0();
            return null;
        }
    }
}
