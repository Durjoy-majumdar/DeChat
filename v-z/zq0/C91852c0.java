package zq0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p224ra.C89909e;
import rx3.C13598b0;
import te3.C90427mv;
import te3.cm4;
import te3.dm4;
import zp0.C16377l;

/* renamed from: zq0.c0 */
public final class C91852c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90427mv f262988d;

    /* renamed from: e */
    public final /* synthetic */ C91921x f262989e;

    /* renamed from: f */
    public final /* synthetic */ boolean f262990f;

    /* renamed from: g */
    public final /* synthetic */ String f262991g;

    /* renamed from: zq0.c0$a */
    public static final class C91853a extends C87413o implements C32226l<dm4, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f262992d;

        /* renamed from: e */
        public final /* synthetic */ String f262993e;

        /* renamed from: f */
        public final /* synthetic */ String f262994f;

        /* renamed from: g */
        public final /* synthetic */ String f262995g;

        /* renamed from: h */
        public final /* synthetic */ String f262996h;

        /* renamed from: i */
        public final /* synthetic */ String f262997i;

        /* renamed from: j */
        public final /* synthetic */ C91921x f262998j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91853a(String str, String str2, String str3, String str4, String str5, String str6, C91921x xVar) {
            super(1);
            this.f262992d = str;
            this.f262993e = str2;
            this.f262994f = str3;
            this.f262995g = str4;
            this.f262996h = str5;
            this.f262997i = str6;
            this.f262998j = xVar;
        }

        public Object invoke(Object obj) {
            dm4 dm4 = (dm4) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("updateUserPhone success:");
            sb.append(dm4 != null);
            Log.m105924i("PhoneNumberAddLogic", sb.toString());
            if (dm4 != null) {
                C91919w wVar = C91919w.f263170a;
                String str = this.f262992d;
                String str2 = this.f262993e;
                C87412m.m108593f(str2, "showMobile");
                String str3 = this.f262994f;
                C87412m.m108593f(str3, "encryptedData");
                String str4 = this.f262995g;
                C87412m.m108593f(str4, "iv");
                wVar.mo125746a(new PhoneItem(str, str2, str3, str4, this.f262996h, false, false, false, true, this.f262997i, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (C8480h) null));
                this.f262998j.f263176c.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    public C91852c0(C90427mv mvVar, C91921x xVar, boolean z, String str) {
        this.f262988d = mvVar;
        this.f262989e = xVar;
        this.f262990f = z;
        this.f262991g = str;
    }

    public final void run() {
        int i = this.f262988d.f259700d;
        Long l = null;
        if (i == 0) {
            C91893l0 l0Var = C91893l0.f263119a;
            C91891k0 a = l0Var.mo125719a(this.f262989e.f263175b);
            if (a != null) {
                C91891k0 a2 = l0Var.mo125719a(this.f262989e.f263175b);
                if (a2 != null) {
                    l = Long.valueOf(a2.f263106p);
                }
                C87412m.m108591d(l);
                a.f263106p = l.longValue() + 1;
            }
            C90427mv mvVar = this.f262988d;
            String str = mvVar.f259701e;
            String str2 = mvVar.f259702f;
            String str3 = mvVar.f259703g;
            String str4 = mvVar.f259704h;
            String str5 = str4 == null ? "" : str4;
            String str6 = mvVar.f259705i;
            String str7 = str6 == null ? "" : str6;
            if (this.f262990f) {
                String str8 = this.f262989e.f263175b;
                String str9 = this.f262991g;
                C87412m.m108594g(str8, "appId");
                C87412m.m108594g(str9, "mobile");
                C91853a aVar = new C91853a(this.f262991g, str3, str, str2, str5, str7, this.f262989e);
                cm4 cm4 = new cm4();
                cm4.f131830d = str8;
                cm4.f131831e = str9;
                cm4.f131832f = 0;
                ((C16377l) C89909e.m112436a(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/customphone/updateuserphone", str8, cm4, dm4.class).mo123061d(new C91890k(aVar)).mo123065b(new C16394l(aVar));
                return;
            }
            C91919w wVar = C91919w.f263170a;
            String str10 = this.f262991g;
            C87412m.m108593f(str3, "showMobile");
            C87412m.m108593f(str, "encryptedData");
            C87412m.m108593f(str2, "iv");
            wVar.mo125746a(new PhoneItem(str10, str3, str, str2, str5, false, false, false, true, str7, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (C8480h) null));
            this.f262989e.f263176c.invoke();
        } else if (i == 1) {
            C91893l0 l0Var2 = C91893l0.f263119a;
            C91891k0 a3 = l0Var2.mo125719a(this.f262989e.f263175b);
            if (a3 != null) {
                C91891k0 a4 = l0Var2.mo125719a(this.f262989e.f263175b);
                if (a4 != null) {
                    l = Long.valueOf(a4.f263107q);
                }
                C87412m.m108591d(l);
                a3.f263107q = l.longValue() + 1;
            }
            C91921x xVar = this.f262989e;
            String string = xVar.f263174a.getString(C0966R.string.f7703oq);
            C87412m.m108593f(string, "mContext.getString(R.str…end_verify_code_frequent)");
            xVar.mo125752c(string);
        } else if (i == 3) {
            C91893l0 l0Var3 = C91893l0.f263119a;
            C91891k0 a5 = l0Var3.mo125719a(this.f262989e.f263175b);
            if (a5 != null) {
                C91891k0 a6 = l0Var3.mo125719a(this.f262989e.f263175b);
                if (a6 != null) {
                    l = Long.valueOf(a6.f263107q);
                }
                C87412m.m108591d(l);
                a5.f263107q = l.longValue() + 1;
            }
            C91921x xVar2 = this.f262989e;
            String string2 = xVar2.f263174a.getString(C0966R.string.f7705os);
            C87412m.m108593f(string2, "mContext.getString(R.str…number_verify_code_error)");
            xVar2.mo125752c(string2);
        } else {
            C91893l0 l0Var4 = C91893l0.f263119a;
            C91891k0 a7 = l0Var4.mo125719a(this.f262989e.f263175b);
            if (a7 != null) {
                C91891k0 a8 = l0Var4.mo125719a(this.f262989e.f263175b);
                if (a8 != null) {
                    l = Long.valueOf(a8.f263107q);
                }
                C87412m.m108591d(l);
                a7.f263107q = l.longValue() + 1;
            }
            C91921x xVar3 = this.f262989e;
            String string3 = xVar3.f263174a.getString(C0966R.string.f7706ov);
            C87412m.m108593f(string3, "mContext.getString(R.str…_number_verify_code_fail)");
            xVar3.mo125752c(string3);
        }
    }
}
