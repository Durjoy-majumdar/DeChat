package zq0;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import at0.C79630a;
import br0.C79774c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import fy3.C32226l;
import gt0.C76064q0;
import gt0.C87362k;
import gt0.C87370k0;
import gt0.C87375o0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import js0.C88024r;
import p224ra.C89909e;
import qo3.C89782m0;
import rx3.C13598b0;
import te3.C51476u04;
import te3.C51625v04;
import te3.C64537lv;
import te3.C90427mv;
import wq0.C91070i;
import zp0.C16377l;
import zq0.C91910r;

/* renamed from: zq0.e1 */
public final class C91861e1 implements C87370k0, C91070i {

    /* renamed from: d */
    public final Context f263006d;

    /* renamed from: e */
    public final C79774c f263007e;

    /* renamed from: f */
    public final String f263008f;

    /* renamed from: g */
    public C91891k0 f263009g;

    /* renamed from: h */
    public final PhoneItem f263010h;

    /* renamed from: i */
    public final C91910r.C91911a f263011i;

    /* renamed from: j */
    public C87375o0 f263012j;

    /* renamed from: n */
    public final int f263013n;

    /* renamed from: o */
    public int f263014o;

    /* renamed from: p */
    public final View f263015p;

    /* renamed from: q */
    public final FrameLayout f263016q;

    /* renamed from: r */
    public final EditVerifyCodeViewNew f263017r;

    /* renamed from: s */
    public final TextView f263018s;

    /* renamed from: t */
    public final TextView f263019t;

    /* renamed from: u */
    public final TextView f263020u;

    /* renamed from: v */
    public C91866d f263021v;

    /* renamed from: zq0.e1$a */
    public static final class C91862a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91861e1 f263022d;

        public C91862a(C91861e1 e1Var) {
            this.f263022d = e1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialogNew$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C91861e1 e1Var = this.f263022d;
            e1Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("errMsg", "user cancel");
            C91910r.C91911a aVar = e1Var.f263011i;
            if (aVar != null) {
                aVar.mo121653a(false, hashMap);
            }
            C91861e1 e1Var2 = this.f263022d;
            C87375o0 o0Var = e1Var2.f263012j;
            if (o0Var != null) {
                o0Var.mo121777a(e1Var2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialogNew$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zq0.e1$b */
    public static final class C91863b implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C91861e1 f263023d;

        /* renamed from: zq0.e1$b$a */
        public static final class C91864a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C91861e1 f263024d;

            public C91864a(C91861e1 e1Var) {
                this.f263024d = e1Var;
            }

            public final void run() {
                this.f263024d.f263016q.getLayoutParams().height = this.f263024d.f263014o;
            }
        }

        public C91863b(C91861e1 e1Var) {
            this.f263023d = e1Var;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int abs = Math.abs(i4 - i2);
            C91861e1 e1Var = this.f263023d;
            int i9 = e1Var.f263014o;
            if (abs > i9 && i9 >= e1Var.f263013n) {
                e1Var.f263016q.post(new C91864a(e1Var));
            }
        }
    }

    /* renamed from: zq0.e1$c */
    public static final class C91865c implements EditVerifyCodeViewNew.C68735b {

        /* renamed from: a */
        public final /* synthetic */ C91861e1 f263025a;

        public C91865c(C91861e1 e1Var) {
            this.f263025a = e1Var;
        }

        /* renamed from: a */
        public final void mo94543a(String str) {
            C91861e1 e1Var = this.f263025a;
            EditVerifyCodeViewNew editVerifyCodeViewNew = e1Var.f263017r;
            String text = editVerifyCodeViewNew != null ? editVerifyCodeViewNew.getText() : null;
            if (text == null) {
                text = "";
            }
            e1Var.getClass();
            Class<C90427mv> cls = C90427mv.class;
            Class cls2 = C16377l.class;
            Log.m105924i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "doVerifyCode: code:" + text);
            C91891k0 k0Var = e1Var.f263009g;
            if (k0Var != null) {
                Long valueOf = Long.valueOf(k0Var.f263114x);
                C87412m.m108591d(valueOf);
                k0Var.f263114x = valueOf.longValue() + 1;
            }
            Context context = e1Var.f263006d;
            C89782m0 c = C89782m0.m112252c(context, context.getString(C0966R.string.a89), true, (DialogInterface.OnCancelListener) null);
            PhoneItem phoneItem = e1Var.f263010h;
            if (phoneItem.f245278n) {
                String str2 = e1Var.f263008f;
                String str3 = phoneItem.f245271d;
                C87412m.m108594g(str2, "appId");
                C87412m.m108594g(str3, "mobile");
                C91885i1 i1Var = new C91885i1(e1Var, c);
                C64537lv lvVar = new C64537lv();
                lvVar.f184160d = str2;
                lvVar.f184161e = str3;
                lvVar.f184162f = text;
                ((C16377l) C89909e.m112436a(cls2)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/checkverifycode", str2, lvVar, cls).mo123061d(new C91857d(i1Var)).mo123065b(new C16391e(i1Var));
                return;
            }
            String str4 = e1Var.f263008f;
            String str5 = phoneItem.f245271d;
            C87412m.m108594g(str4, "appId");
            C87412m.m108594g(str5, "mobile");
            C91892k1 k1Var = new C91892k1(c, e1Var);
            C64537lv lvVar2 = new C64537lv();
            lvVar2.f184160d = str4;
            lvVar2.f184161e = str5;
            lvVar2.f184162f = text;
            ((C16377l) C89909e.m112436a(cls2)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/customphone/checkverifycode", str4, lvVar2, cls).mo123061d(new C91849b(k1Var)).mo123065b(new C16390c(k1Var));
        }
    }

    /* renamed from: zq0.e1$d */
    public final class C91866d extends CountDownTimer {
        public C91866d(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            C91861e1.this.mo125690f();
        }

        public void onTick(long j) {
            C91861e1 e1Var = C91861e1.this;
            TextView textView = e1Var.f263018s;
            Context context = e1Var.f263006d;
            textView.setText(context.getString(C0966R.string.f7700om, new Object[]{"" + (j / ((long) 1000))}));
        }
    }

    /* renamed from: zq0.e1$e */
    public static final class C91867e extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ C91861e1 f263027d;

        public C91867e(C91861e1 e1Var) {
            this.f263027d = e1Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialogNew$resetSendCodeTextToResend$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "arg0");
            C91861e1 e1Var = this.f263027d;
            if (e1Var.f263010h.f245277j) {
                e1Var.mo125692h();
            } else {
                String string = e1Var.f263006d.getString(C0966R.string.f7703oq);
                C87412m.m108593f(string, "context.getString(R.stri…end_verify_code_frequent)");
                e1Var.mo125691g(string);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialogNew$resetSendCodeTextToResend$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zq0.e1$f */
    public static final class C91868f extends C87413o implements C32226l<C51625v04, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C91861e1 f263028d;

        /* renamed from: e */
        public final /* synthetic */ ProgressDialog f263029e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91868f(C91861e1 e1Var, ProgressDialog progressDialog) {
            super(1);
            this.f263028d = e1Var;
            this.f263029e = progressDialog;
        }

        public Object invoke(Object obj) {
            C88024r.m109572b(new C91873f1((C51625v04) obj, this.f263028d, this.f263029e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.e1$g */
    public static final class C91869g extends C87413o implements C32226l<C51625v04, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C91861e1 f263030d;

        /* renamed from: e */
        public final /* synthetic */ ProgressDialog f263031e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91869g(C91861e1 e1Var, ProgressDialog progressDialog) {
            super(1);
            this.f263030d = e1Var;
            this.f263031e = progressDialog;
        }

        public Object invoke(Object obj) {
            C88024r.m109572b(new C91876g1((C51625v04) obj, this.f263030d, this.f263031e));
            return C13598b0.f38549a;
        }
    }

    public C91861e1(Context context, int i, C79774c cVar, String str, C91891k0 k0Var, PhoneItem phoneItem, C91910r.C91911a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "windowAndroid");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(phoneItem, "phoneItem");
        this.f263006d = context;
        this.f263007e = cVar;
        this.f263008f = str;
        this.f263009g = k0Var;
        this.f263010h = phoneItem;
        this.f263011i = aVar;
        int a = C74942w4.m89784a(context, v2helper.VOIP_ENC_HEIGHT_LV1);
        a = a < i ? i : a;
        this.f263013n = a;
        this.f263014o = mo125689e();
        Log.m105925i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "candidateMinHeight:%d", Integer.valueOf(i));
        View inflate = View.inflate(context, C0966R.C0971layout.d7b, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, R.layou…mber_verify_dialog, null)");
        this.f263015p = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.f357461nf1);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…nd_verify_code_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.f263016q = frameLayout;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.f6026v8);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.…p_brand_verify_code_view)");
        EditVerifyCodeViewNew editVerifyCodeViewNew = (EditVerifyCodeViewNew) findViewById2;
        this.f263017r = editVerifyCodeViewNew;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.nic);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.…p_brand_verify_code_desc)");
        this.f263018s = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f357462o51);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.…verify_code_phone_number)");
        this.f263019t = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.f357463o52);
        C87412m.m108593f(findViewById5, "rootView.findViewById(R.…_brand_verify_code_title)");
        this.f263020u = (TextView) findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.f357460nf0);
        C87412m.m108593f(findViewById6, "rootView.findViewById(R.…p_brand_verify_code_back)");
        ((ImageView) findViewById6).setOnClickListener(new C91862a(this));
        frameLayout.setMinimumHeight(a);
        frameLayout.addOnLayoutChangeListener(new C91863b(this));
        editVerifyCodeViewNew.setCodeEditCompleteListener(new C91865c(this));
    }

    /* renamed from: a */
    public static final void m115362a(C91861e1 e1Var, int i) {
        e1Var.getClass();
        Log.m105925i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "processSendSmsResp:%d", Integer.valueOf(i));
        if (i == 0) {
            Log.m105924i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "startSmsListener");
            C91866d dVar = e1Var.f263021v;
            if (dVar != null) {
                dVar.cancel();
            } else {
                e1Var.f263021v = new C91866d(60000, 1000);
            }
            C91866d dVar2 = e1Var.f263021v;
            if (dVar2 != null) {
                dVar2.start();
            }
        } else if (i == 1) {
            e1Var.mo125693i();
            String string = e1Var.f263006d.getString(C0966R.string.f7702op);
            C87412m.m108593f(string, "context.getString(R.stri…er_send_verify_code_fail)");
            e1Var.mo125691g(string);
        } else if (i == 2) {
            e1Var.mo125693i();
            String string2 = e1Var.f263006d.getString(C0966R.string.f7703oq);
            C87412m.m108593f(string2, "context.getString(R.stri…end_verify_code_frequent)");
            e1Var.mo125691g(string2);
        } else {
            e1Var.mo125693i();
            String string3 = e1Var.f263006d.getString(C0966R.string.f7702op);
            C87412m.m108593f(string3, "context.getString(R.stri…er_send_verify_code_fail)");
            e1Var.mo125691g(string3);
        }
    }

    /* renamed from: c */
    public static final void m115363c(C91861e1 e1Var, int i, String str, String str2, String str3, String str4) {
        e1Var.getClass();
        boolean z = true;
        Log.m105925i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "processVerifyCodeResp:%d", Integer.valueOf(i));
        if (i == 0) {
            C91891k0 k0Var = e1Var.f263009g;
            if (k0Var != null) {
                Long valueOf = Long.valueOf(k0Var.f263115y);
                C87412m.m108591d(valueOf);
                k0Var.f263115y = valueOf.longValue() + 1;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("errMsg", "ok");
            if (str == null) {
                str = "";
            }
            hashMap.put("encryptedData", str);
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("iv", str2);
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("cloud_id", str3);
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("data", str4);
            C91910r.C91911a aVar = e1Var.f263011i;
            if (aVar != null) {
                aVar.mo121653a(true, hashMap);
            }
            e1Var.dismiss();
        } else if (i == 1) {
            e1Var.mo125693i();
            String string = e1Var.f263006d.getString(C0966R.string.f7702op);
            C87412m.m108593f(string, "context.getString(R.stri…er_send_verify_code_fail)");
            e1Var.mo125691g(string);
            C91891k0 k0Var2 = e1Var.f263009g;
            if (k0Var2 != null) {
                Long valueOf2 = Long.valueOf(k0Var2.f263116z);
                C87412m.m108591d(valueOf2);
                k0Var2.f263116z = valueOf2.longValue() + 1;
            }
        } else {
            if (!(i == 3 || i == 4)) {
                z = false;
            }
            if (z) {
                e1Var.mo125693i();
                String string2 = e1Var.f263006d.getString(C0966R.string.f7705os);
                C87412m.m108593f(string2, "context.getString(R.stri…number_verify_code_error)");
                e1Var.mo125691g(string2);
                C91891k0 k0Var3 = e1Var.f263009g;
                if (k0Var3 != null) {
                    Long valueOf3 = Long.valueOf(k0Var3.f263116z);
                    C87412m.m108591d(valueOf3);
                    k0Var3.f263116z = valueOf3.longValue() + 1;
                    return;
                }
                return;
            }
            e1Var.mo125693i();
            String string3 = e1Var.f263006d.getString(C0966R.string.f7706ov);
            C87412m.m108593f(string3, "context.getString(R.stri…_number_verify_code_fail)");
            e1Var.mo125691g(string3);
            C91891k0 k0Var4 = e1Var.f263009g;
            if (k0Var4 != null) {
                Long valueOf4 = Long.valueOf(k0Var4.f263116z);
                C87412m.m108591d(valueOf4);
                k0Var4.f263116z = valueOf4.longValue() + 1;
            }
        }
    }

    /* renamed from: A */
    public void mo36936A(int i) {
        mo125687d();
        this.f263014o = mo125689e();
    }

    /* renamed from: b */
    public void mo36937b() {
        C79630a.m96708a(this.f263015p);
    }

    public void cancel() {
    }

    /* renamed from: d */
    public final void mo125687d() {
        Object systemService = this.f263006d.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager != null) {
            C76064q0 q0Var = C76064q0.f222911a;
            Context context = this.f263015p.getContext();
            C87412m.m108593f(context, "contentView.context");
            q0Var.mo106274a(context, this.f263015p, (View) null, windowManager.getDefaultDisplay().getRotation(), this.f263007e, false);
        }
    }

    public void dismiss() {
        C87375o0 o0Var = this.f263012j;
        if (o0Var != null) {
            o0Var.mo121777a(this);
        }
    }

    /* renamed from: e */
    public final int mo125689e() {
        int i = (int) (((float) this.f263006d.getResources().getDisplayMetrics().heightPixels) * (2 == this.f263006d.getResources().getConfiguration().orientation ? 1.0f : 0.75f));
        Log.m105924i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "calculateMaxHeight, maxHeight: " + i);
        return i;
    }

    /* renamed from: f */
    public final void mo125690f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f263006d.getString(C0966R.string.f7701oo));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new C91867e(this), 0, length, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f263006d.getResources().getColor(C0966R.color.f2958ae)), 0, length, 17);
        this.f263018s.setText(spannableStringBuilder);
        this.f263018s.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: g */
    public final void mo125691g(String str) {
        this.f263017r.setText("");
        this.f263020u.setText(str);
        this.f263020u.setTextColor(this.f263006d.getResources().getColor(C0966R.color.Red_90));
        mo125690f();
    }

    public View getContentView() {
        return this.f263015p;
    }

    public int getPosition() {
        return 2;
    }

    /* renamed from: h */
    public final void mo125692h() {
        Class<C51625v04> cls = C51625v04.class;
        Class cls2 = C16377l.class;
        this.f263017r.setText("");
        this.f263020u.setText(this.f263006d.getResources().getText(C0966R.string.cst));
        this.f263020u.setTextColor(this.f263006d.getResources().getColor(C0966R.color.a7f));
        this.f263019t.setText(this.f263006d.getString(C0966R.string.f7707ow, new Object[]{this.f263010h.f245272e}));
        Context context = this.f263006d;
        C89782m0 c = C89782m0.m112252c(context, context.getString(C0966R.string.a87), true, (DialogInterface.OnCancelListener) null);
        PhoneItem phoneItem = this.f263010h;
        if (phoneItem.f245278n) {
            String str = this.f263008f;
            String str2 = phoneItem.f245271d;
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "mobile");
            C91868f fVar = new C91868f(this, c);
            C51476u04 u042 = new C51476u04();
            u042.f142531d = str;
            u042.f142532e = str2;
            ((C16377l) C89909e.m112436a(cls2)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/sendverifycode", str, u042, cls).mo123061d(new C91881i(fVar)).mo123065b(new C16393j(fVar));
            return;
        }
        String str3 = this.f263008f;
        String str4 = phoneItem.f245271d;
        C87412m.m108594g(str3, "appId");
        C87412m.m108594g(str4, "mobile");
        C91869g gVar = new C91869g(this, c);
        C51476u04 u043 = new C51476u04();
        u043.f142531d = str3;
        u043.f142532e = str4;
        ((C16377l) C89909e.m112436a(cls2)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/customphone/sendverifycode", str3, u043, cls).mo123061d(new C91874g(gVar)).mo123065b(new C16392h(gVar));
    }

    /* renamed from: i */
    public final void mo125693i() {
        Log.m105924i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "stopSmsListener");
        C91866d dVar = this.f263021v;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
        this.f263012j = o0Var;
        mo125687d();
    }

    /* renamed from: k */
    public boolean mo36950k() {
        return false;
    }

    /* renamed from: m */
    public boolean mo36951m() {
        return true;
    }

    /* renamed from: o */
    public void mo121451o(C81879g gVar) {
        C87412m.m108594g(gVar, "component");
        ((C87362k) C91070i.C91071a.m114253a(this, gVar)).mo121778b(this);
        mo125692h();
    }

    public void onCancel() {
    }

    /* renamed from: w */
    public boolean mo36953w() {
        return false;
    }
}
