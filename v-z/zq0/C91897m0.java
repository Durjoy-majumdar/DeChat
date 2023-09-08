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
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.appbrand.utils.C2048s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import js0.C88024r;
import p224ra.C89909e;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C89782m0;
import rx3.C13598b0;
import te3.C51476u04;
import te3.C51625v04;
import zp0.C16377l;
import zq0.C91910r;

/* renamed from: zq0.m0 */
public final class C91897m0 {

    /* renamed from: a */
    public final Context f263124a;

    /* renamed from: b */
    public final String f263125b;

    /* renamed from: c */
    public C91891k0 f263126c;

    /* renamed from: d */
    public final PhoneItem f263127d;

    /* renamed from: e */
    public final C91910r.C91911a f263128e;

    /* renamed from: f */
    public View f263129f;

    /* renamed from: g */
    public EditText f263130g;

    /* renamed from: h */
    public TextView f263131h;

    /* renamed from: i */
    public TextView f263132i;

    /* renamed from: j */
    public C91898a f263133j;

    /* renamed from: k */
    public final int f263134k = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: l */
    public final int f263135l = 1000;

    /* renamed from: zq0.m0$a */
    public final class C91898a extends CountDownTimer {
        public C91898a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            C91897m0.this.mo125732h();
        }

        public void onTick(long j) {
            C91897m0 m0Var = C91897m0.this;
            TextView textView = m0Var.f263131h;
            if (textView != null) {
                Context context = m0Var.f263124a;
                textView.setText(context.getString(C0966R.string.f7700om, new Object[]{"" + (j / ((long) 1000))}));
            }
        }
    }

    /* renamed from: zq0.m0$b */
    public static final class C91899b extends C87413o implements C32226l<C51625v04, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ProgressDialog f263137d;

        /* renamed from: e */
        public final /* synthetic */ C91897m0 f263138e;

        /* renamed from: f */
        public final /* synthetic */ boolean f263139f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91899b(ProgressDialog progressDialog, C91897m0 m0Var, boolean z) {
            super(1);
            this.f263137d = progressDialog;
            this.f263138e = m0Var;
            this.f263139f = z;
        }

        public Object invoke(Object obj) {
            C51625v04 v042 = (C51625v04) obj;
            this.f263137d.dismiss();
            if (v042 == null) {
                Log.m105920e("MicroMsg.PhoneNumberVerifyCodeDialog", "getPhoneNumber SendVerifyCode cgi failed");
                MMHandlerThread.postToMainThread(new C91904n0(this.f263138e));
                C91897m0.m115410a(this.f263138e, "SendVerifyCode cgi fail");
            } else {
                Log.m105924i("MicroMsg.PhoneNumberVerifyCodeDialog", "SendVerifyCode cgi success");
                MMHandlerThread.postToMainThread(new C91907o0(this.f263139f, this.f263138e, v042));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.m0$c */
    public static final class C91900c extends C87413o implements C32226l<C51625v04, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C91897m0 f263140d;

        /* renamed from: e */
        public final /* synthetic */ ProgressDialog f263141e;

        /* renamed from: f */
        public final /* synthetic */ boolean f263142f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91900c(C91897m0 m0Var, ProgressDialog progressDialog, boolean z) {
            super(1);
            this.f263140d = m0Var;
            this.f263141e = progressDialog;
            this.f263142f = z;
        }

        public Object invoke(Object obj) {
            C51625v04 v042 = (C51625v04) obj;
            C88024r.m109572b(new C91908p0(this.f263141e));
            if (v042 == null) {
                Log.m105920e("MicroMsg.PhoneNumberVerifyCodeDialog", "getPhoneNumber SendVerifyCode cgi failed");
                C91897m0.m115410a(this.f263140d, "SendVerifyCode cgi fail");
                MMHandlerThread.postToMainThread(new C91909q0(this.f263140d));
            } else {
                Log.m105924i("MicroMsg.PhoneNumberVerifyCodeDialog", "SendVerifyCode cgi success");
                MMHandlerThread.postToMainThread(new C91912r0(this.f263142f, this.f263140d, v042));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.m0$d */
    public static final class C91901d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91897m0 f263143d;

        public C91901d(C91897m0 m0Var) {
            this.f263143d = m0Var;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C91897m0.m115410a(this.f263143d, "fail");
        }
    }

    /* renamed from: zq0.m0$e */
    public static final class C91902e extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ C91897m0 f263144d;

        public C91902e(C91897m0 m0Var) {
            this.f263144d = m0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$updateSendText$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "arg0");
            Log.m105924i("MicroMsg.PhoneNumberVerifyCodeDialog", "click the resend spanBuilder, do resend sms");
            C91897m0 m0Var = this.f263144d;
            if (m0Var.f263127d.f245277j) {
                m0Var.mo125729e(false);
            } else {
                Log.m105920e("MicroMsg.PhoneNumberVerifyCodeDialog", "allow_send_sms is false, show send_verify_code_frequent error");
                C91897m0 m0Var2 = this.f263144d;
                String string = m0Var2.f263124a.getString(C0966R.string.f7703oq);
                C87412m.m108593f(string, "context.getString(R.stri…end_verify_code_frequent)");
                m0Var2.mo125730f(string);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$updateSendText$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91897m0(android.content.Context r2, java.lang.String r3, zq0.C91891k0 r4, java.lang.String r5, com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem r6, zq0.C91910r.C91911a r7) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "ext_desc"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r5 = "phoneItem"
            gy3.C87412m.m108594g(r6, r5)
            r1.<init>()
            r1.f263124a = r2
            r1.f263125b = r3
            r1.f263126c = r4
            r1.f263127d = r6
            r1.f263128e = r7
            r3 = 60000(0xea60, float:8.4078E-41)
            r1.f263134k = r3
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.f263135l = r3
            java.lang.String r3 = "layout_inflater"
            java.lang.Object r2 = r2.getSystemService(r3)
            java.lang.String r3 = "null cannot be cast to non-null type android.view.LayoutInflater"
            gy3.C87412m.m108592e(r2, r3)
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
            r3 = 2131493169(0x7f0c0131, float:1.860981E38)
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r4)
            r1.f263129f = r2
            if (r2 == 0) goto L_0x004e
            r3 = 2131297182(0x7f09039e, float:1.8212302E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.EditText r2 = (android.widget.EditText) r2
            goto L_0x004f
        L_0x004e:
            r2 = r4
        L_0x004f:
            r1.f263130g = r2
            android.view.View r2 = r1.f263129f
            if (r2 == 0) goto L_0x005f
            r3 = 2131297183(0x7f09039f, float:1.8212304E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            goto L_0x0060
        L_0x005f:
            r2 = r4
        L_0x0060:
            r1.f263132i = r2
            android.view.View r2 = r1.f263129f
            if (r2 == 0) goto L_0x0070
            r3 = 2131297159(0x7f090387, float:1.8212255E38)
            android.view.View r2 = r2.findViewById(r3)
            r4 = r2
            android.widget.TextView r4 = (android.widget.TextView) r4
        L_0x0070:
            r1.f263131h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zq0.C91897m0.<init>(android.content.Context, java.lang.String, zq0.k0, java.lang.String, com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem, zq0.r$a):void");
    }

    /* renamed from: a */
    public static final void m115410a(C91897m0 m0Var, String str) {
        m0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("errMsg", str);
        C91910r.C91911a aVar = m0Var.f263128e;
        if (aVar != null) {
            aVar.mo121653a(false, hashMap);
        }
    }

    /* renamed from: b */
    public static final void m115411b(C91897m0 m0Var, int i, String str, String str2, String str3, String str4) {
        m0Var.getClass();
        Log.m105925i("MicroMsg.PhoneNumberVerifyCodeDialog", "handleCheckVerifyCodeStatus:%d", Integer.valueOf(i));
        if (i == 0) {
            C91891k0 k0Var = m0Var.f263126c;
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
            C91910r.C91911a aVar = m0Var.f263128e;
            if (aVar != null) {
                aVar.mo121653a(true, hashMap);
            }
        } else if (i == 1) {
            String string = m0Var.f263124a.getString(C0966R.string.f7703oq);
            C87412m.m108593f(string, "context.getString(R.stri…end_verify_code_frequent)");
            m0Var.mo125730f(string);
            C91891k0 k0Var2 = m0Var.f263126c;
            if (k0Var2 != null) {
                Long valueOf2 = Long.valueOf(k0Var2.f263116z);
                C87412m.m108591d(valueOf2);
                k0Var2.f263116z = valueOf2.longValue() + 1;
            }
        } else if (i == 3 || i == 4) {
            Context context = m0Var.f263124a;
            C2048s0.m2000b(context, context.getString(C0966R.string.f7705os), "", false, new C91928y0(m0Var));
            C91891k0 k0Var3 = m0Var.f263126c;
            if (k0Var3 != null) {
                Long valueOf3 = Long.valueOf(k0Var3.f263116z);
                C87412m.m108591d(valueOf3);
                k0Var3.f263116z = valueOf3.longValue() + 1;
            }
        } else {
            String string2 = m0Var.f263124a.getString(C0966R.string.f7706ov);
            C87412m.m108593f(string2, "context.getString(R.stri…_number_verify_code_fail)");
            m0Var.mo125730f(string2);
            C91891k0 k0Var4 = m0Var.f263126c;
            if (k0Var4 != null) {
                Long valueOf4 = Long.valueOf(k0Var4.f263116z);
                C87412m.m108591d(valueOf4);
                k0Var4.f263116z = valueOf4.longValue() + 1;
            }
        }
    }

    /* renamed from: c */
    public static final void m115412c(C91897m0 m0Var, int i) {
        m0Var.getClass();
        Log.m105925i("MicroMsg.PhoneNumberVerifyCodeDialog", "handleSendVerifyCodeStatus:%d", Integer.valueOf(i));
        if (i == 0) {
            Log.m105924i("MicroMsg.PhoneNumberVerifyCodeDialog", "startSmsListener");
            C91898a aVar = m0Var.f263133j;
            if (aVar != null) {
                aVar.cancel();
            } else {
                m0Var.f263133j = new C91898a((long) m0Var.f263134k, (long) m0Var.f263135l);
            }
            C91898a aVar2 = m0Var.f263133j;
            if (aVar2 != null) {
                aVar2.start();
            }
        } else if (i == 1) {
            String string = m0Var.f263124a.getString(C0966R.string.f7702op);
            C87412m.m108593f(string, "context.getString(R.stri…er_send_verify_code_fail)");
            m0Var.mo125730f(string);
        } else if (i == 2) {
            String string2 = m0Var.f263124a.getString(C0966R.string.f7703oq);
            C87412m.m108593f(string2, "context.getString(R.stri…end_verify_code_frequent)");
            m0Var.mo125730f(string2);
        } else {
            String string3 = m0Var.f263124a.getString(C0966R.string.f7702op);
            C87412m.m108593f(string3, "context.getString(R.stri…er_send_verify_code_fail)");
            m0Var.mo125730f(string3);
        }
    }

    /* renamed from: d */
    public static final void m115413d(C91897m0 m0Var) {
        EditText editText = m0Var.f263130g;
        if (editText != null) {
            editText.setText("");
        }
        TextView textView = m0Var.f263132i;
        if (textView != null) {
            textView.setText(m0Var.f263124a.getString(C0966R.string.f7707ow, new Object[]{m0Var.f263127d.f245272e}));
        }
        m0Var.mo125732h();
        View view = m0Var.f263129f;
        if (view != null) {
            ViewParent viewParent = null;
            if (view.getParent() instanceof ViewGroup) {
                View view2 = m0Var.f263129f;
                if (view2 != null) {
                    viewParent = view2.getParent();
                }
                C87412m.m108592e(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) viewParent).removeView(m0Var.f263129f);
            }
        }
        Context context = m0Var.f263124a;
        C77389a aVar = new C77389a();
        aVar.f225644a = context.getString(C0966R.string.f7710oz);
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.mo107544z(m0Var.f263129f, -1);
        gVar.setOnDismissListener(new C91851b1(m0Var));
        gVar.mo107542x(m0Var.f263124a.getString(C0966R.string.a8h), false, new C91854c1(m0Var));
        gVar.mo107539t(m0Var.f263124a.getString(C0966R.string.a8i), true, new C91859d1(m0Var));
        gVar.show();
        View view3 = m0Var.f263129f;
        if (view3 != null) {
            view3.post(new C91848a1(m0Var));
        }
    }

    /* renamed from: e */
    public final void mo125729e(boolean z) {
        Class<C51625v04> cls = C51625v04.class;
        Class cls2 = C16377l.class;
        Log.m105924i("MicroMsg.PhoneNumberVerifyCodeDialog", "doSendVerifyCode");
        Context context = this.f263124a;
        C89782m0 c = C89782m0.m112252c(context, context.getString(C0966R.string.a87), true, (DialogInterface.OnCancelListener) null);
        PhoneItem phoneItem = this.f263127d;
        if (phoneItem.f245278n) {
            String str = this.f263125b;
            String str2 = phoneItem.f245271d;
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "mobile");
            C91899b bVar = new C91899b(c, this, z);
            C51476u04 u042 = new C51476u04();
            u042.f142531d = str;
            u042.f142532e = str2;
            ((C16377l) C89909e.m112436a(cls2)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/sendverifycode", str, u042, cls).mo123061d(new C91881i(bVar)).mo123065b(new C16393j(bVar));
            return;
        }
        String str3 = this.f263125b;
        String str4 = phoneItem.f245271d;
        C87412m.m108594g(str3, "appId");
        C87412m.m108594g(str4, "mobile");
        C91900c cVar = new C91900c(this, c, z);
        C51476u04 u043 = new C51476u04();
        u043.f142531d = str3;
        u043.f142532e = str4;
        ((C16377l) C89909e.m112436a(cls2)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/customphone/sendverifycode", str3, u043, cls).mo123061d(new C91874g(cVar)).mo123065b(new C16392h(cVar));
    }

    /* renamed from: f */
    public final void mo125730f(String str) {
        mo125731g();
        C2048s0.m2000b(this.f263124a, str, "", false, new C91901d(this));
    }

    /* renamed from: g */
    public final void mo125731g() {
        Log.m105924i("MicroMsg.PhoneNumberVerifyCodeDialog", "stopSmsListener");
        C91898a aVar = this.f263133j;
        if (aVar != null) {
            aVar.cancel();
        }
    }

    /* renamed from: h */
    public final void mo125732h() {
        String string = this.f263124a.getString(C0966R.string.f7698ok);
        C87412m.m108593f(string, "context.getString(R.stri…_not_receive_verify_code)");
        String string2 = this.f263124a.getString(C0966R.string.f7701oo);
        C87412m.m108593f(string2, "context.getString(R.stri…umber_resend_verify_code)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(string);
        spannableStringBuilder.append(string2);
        int length = string.length();
        int length2 = string2.length() + length;
        spannableStringBuilder.setSpan(new C91902e(this), length, length2, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f263124a.getResources().getColor(C0966R.color.f2958ae)), length, length2, 17);
        TextView textView = this.f263131h;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        }
        TextView textView2 = this.f263131h;
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
