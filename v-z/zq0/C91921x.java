package zq0;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import ar0.C67103c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView;
import com.tencent.p014mm.plugin.appbrand.utils.C2048s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import js0.C88024r;
import p224ra.C89909e;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C89782m0;
import rx3.C13598b0;
import te3.C51476u04;
import te3.C51625v04;
import te3.C64537lv;
import te3.C90427mv;
import zp0.C16377l;

/* renamed from: zq0.x */
public final class C91921x implements C79424p {

    /* renamed from: a */
    public final Context f263174a;

    /* renamed from: b */
    public final String f263175b;

    /* renamed from: c */
    public final C32224a<C13598b0> f263176c;

    /* renamed from: d */
    public C79425q f263177d;

    /* renamed from: zq0.x$a */
    public static final class C91922a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91921x f263178d;

        /* renamed from: e */
        public final /* synthetic */ String f263179e;

        public C91922a(C91921x xVar, String str) {
            this.f263178d = xVar;
            this.f263179e = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            MMFormVerifyCodeInputView mMFormVerifyCodeInputView;
            C91921x xVar = this.f263178d;
            String str = this.f263179e;
            xVar.getClass();
            Log.m105924i("PhoneNumberAddLogic", "sendSms appId:" + xVar.f263175b + ", mobile:" + str);
            C79425q qVar = xVar.f263177d;
            if (!(qVar == null || (mMFormVerifyCodeInputView = ((C79408f0) qVar).f232931d) == null)) {
                mMFormVerifyCodeInputView.f197157h.setVisibility(8);
                mMFormVerifyCodeInputView.f197156g.setVisibility(0);
                mMFormVerifyCodeInputView.f197156g.setText(mMFormVerifyCodeInputView.getContext().getString(C0966R.string.a7d, new Object[]{Integer.valueOf(mMFormVerifyCodeInputView.f197162p)}));
                MTimerHandler mTimerHandler = mMFormVerifyCodeInputView.f197164r;
                if (mTimerHandler != null) {
                    mTimerHandler.stopTimer();
                    mMFormVerifyCodeInputView.f197164r.startTimer(1000);
                } else if (mMFormVerifyCodeInputView.getContext() != null) {
                    MTimerHandler mTimerHandler2 = new MTimerHandler(mMFormVerifyCodeInputView.getContext().getMainLooper(), (MTimerHandler.CallBack) new C67103c(mMFormVerifyCodeInputView), true);
                    mMFormVerifyCodeInputView.f197164r = mTimerHandler2;
                    mTimerHandler2.startTimer(1000);
                } else {
                    MTimerHandler mTimerHandler3 = mMFormVerifyCodeInputView.f197164r;
                    if (mTimerHandler3 != null) {
                        mTimerHandler3.stopTimer();
                    }
                }
            }
            Context context = xVar.f263174a;
            Long l = null;
            C89782m0 c = C89782m0.m112252c(context, context.getString(C0966R.string.a87), true, (DialogInterface.OnCancelListener) null);
            C91893l0 l0Var = C91893l0.f263119a;
            C91891k0 a = l0Var.mo125719a(xVar.f263175b);
            if (a != null) {
                C91891k0 a2 = l0Var.mo125719a(xVar.f263175b);
                if (a2 != null) {
                    l = Long.valueOf(a2.f263102l);
                }
                C87412m.m108591d(l);
                a.f263102l = l.longValue() + 1;
            }
            String str2 = xVar.f263175b;
            C87412m.m108594g(str2, "appId");
            C87412m.m108594g(str, "mobile");
            C91850b0 b0Var = new C91850b0(xVar, c);
            C51476u04 u042 = new C51476u04();
            u042.f142531d = str2;
            u042.f142532e = str;
            ((C16377l) C89909e.m112436a(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/customphone/sendverifycode", str2, u042, C51625v04.class).mo123061d(new C91874g(b0Var)).mo123065b(new C16392h(b0Var));
        }
    }

    /* renamed from: zq0.x$b */
    public static final class C91923b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C91923b f263180d = new C91923b();

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: zq0.x$c */
    public static final class C91924c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C91924c f263181d = new C91924c();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: zq0.x$d */
    public static final class C91925d extends C87413o implements C32226l<C90427mv, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C91921x f263182d;

        /* renamed from: e */
        public final /* synthetic */ boolean f263183e;

        /* renamed from: f */
        public final /* synthetic */ String f263184f;

        /* renamed from: g */
        public final /* synthetic */ ProgressDialog f263185g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91925d(C91921x xVar, boolean z, String str, ProgressDialog progressDialog) {
            super(1);
            this.f263182d = xVar;
            this.f263183e = z;
            this.f263184f = str;
            this.f263185g = progressDialog;
        }

        public Object invoke(Object obj) {
            C90427mv mvVar = (C90427mv) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("verifyCode success:");
            sb.append(mvVar != null);
            Log.m105924i("PhoneNumberAddLogic", sb.toString());
            if (mvVar != null) {
                Log.m105925i("PhoneNumberAddLogic", "checkVerifyCode:%d", Integer.valueOf(mvVar.f259700d));
                MMHandlerThread.postToMainThread(new C91852c0(mvVar, this.f263182d, this.f263183e, this.f263184f));
            } else {
                MMHandlerThread.postToMainThread(new C91858d0(this.f263182d));
            }
            C88024r.m109572b(new C91860e0(this.f263185g));
            return C13598b0.f38549a;
        }
    }

    public C91921x(Context context, String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(context, "mContext");
        C87412m.m108594g(str, "mAppId");
        C87412m.m108594g(aVar, "onDone");
        this.f263174a = context;
        this.f263175b = str;
        this.f263176c = aVar;
    }

    /* renamed from: a */
    public void mo109395a(String str) {
        C87412m.m108594g(str, "mobile");
        if (!Util.isNullOrNil(str)) {
            Context context = this.f263174a;
            String str2 = this.f263174a.getString(C0966R.string.f7709oy) + str;
            String string = this.f263174a.getString(C0966R.string.f7708ox);
            String string2 = this.f263174a.getString(C0966R.string.a8h);
            String string3 = this.f263174a.getString(C0966R.string.a8i);
            C91922a aVar = new C91922a(this, str);
            C91923b bVar = C91923b.f263180d;
            C77389a aVar2 = new C77389a();
            aVar2.f225644a = string;
            aVar2.f225660q = str2;
            aVar2.f225663t = string2;
            aVar2.f225620C = aVar;
            aVar2.f225664u = string3;
            aVar2.f225621D = bVar;
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar2);
            gVar.show();
            return;
        }
        String string4 = this.f263174a.getString(C0966R.string.a7x);
        C87412m.m108593f(string4, "mContext.getString(R.str…_number_format_err_title)");
        mo125752c(string4);
    }

    /* renamed from: b */
    public void mo109396b(boolean z, String str, String str2) {
        C87412m.m108594g(str, "mobile");
        C87412m.m108594g(str2, "code");
        C91893l0 l0Var = C91893l0.f263119a;
        C91891k0 a = l0Var.mo125719a(this.f263175b);
        if (a != null) {
            C91891k0 a2 = l0Var.mo125719a(this.f263175b);
            Long valueOf = a2 != null ? Long.valueOf(a2.f263105o) : null;
            C87412m.m108591d(valueOf);
            a.f263105o = valueOf.longValue() + 1;
        }
        if (z) {
            C91891k0 a3 = l0Var.mo125719a(this.f263175b);
            if (a3 != null) {
                C91891k0 a4 = l0Var.mo125719a(this.f263175b);
                Long valueOf2 = a4 != null ? Long.valueOf(a4.f263108r) : null;
                C87412m.m108591d(valueOf2);
                a3.f263108r = valueOf2.longValue() + 1;
            }
        } else {
            C91891k0 a5 = l0Var.mo125719a(this.f263175b);
            if (a5 != null) {
                C91891k0 a6 = l0Var.mo125719a(this.f263175b);
                Long valueOf3 = a6 != null ? Long.valueOf(a6.f263109s) : null;
                C87412m.m108591d(valueOf3);
                a5.f263109s = valueOf3.longValue() + 1;
            }
        }
        Log.m105924i("PhoneNumberAddLogic", "verifyCode mAppId:" + this.f263175b + ", mobile:" + str + " code:" + str2);
        Context context = this.f263174a;
        C89782m0 c = C89782m0.m112252c(context, context.getString(C0966R.string.a89), true, (DialogInterface.OnCancelListener) null);
        String str3 = this.f263175b;
        C87412m.m108594g(str3, "appId");
        C91925d dVar = new C91925d(this, z, str, c);
        C64537lv lvVar = new C64537lv();
        lvVar.f184160d = str3;
        lvVar.f184161e = str;
        lvVar.f184162f = str2;
        ((C16377l) C89909e.m112436a(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/customphone/checkverifycode", str3, lvVar, C90427mv.class).mo123061d(new C91849b(dVar)).mo123065b(new C16390c(dVar));
    }

    /* renamed from: c */
    public final void mo125752c(String str) {
        Context context = this.f263174a;
        C2048s0.m1999a(context, str, context.getString(C0966R.string.f7699ol), C91924c.f263181d);
    }

    public View getView() {
        C79425q qVar = this.f263177d;
        if (qVar != null) {
            return ((C79408f0) qVar).f232930c;
        }
        return null;
    }

    public void init() {
        this.f263177d = new C79408f0(this.f263174a, this);
        C91893l0.f263119a.mo125720b(this.f263175b);
    }

    public void uninit() {
        MMFormVerifyCodeInputView mMFormVerifyCodeInputView;
        C79425q qVar = this.f263177d;
        if (!(qVar == null || (mMFormVerifyCodeInputView = ((C79408f0) qVar).f232931d) == null)) {
            MTimerHandler mTimerHandler = mMFormVerifyCodeInputView.f197164r;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            mMFormVerifyCodeInputView.f197155f.setText("");
            mMFormVerifyCodeInputView.f197156g.setVisibility(8);
            mMFormVerifyCodeInputView.f197163q = mMFormVerifyCodeInputView.f197162p;
            mMFormVerifyCodeInputView.f197157h.setVisibility(0);
        }
        C91893l0.f263119a.mo125721c(this.f263175b);
    }
}
