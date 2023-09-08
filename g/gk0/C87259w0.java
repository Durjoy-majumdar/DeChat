package gk0;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WAPhoneAuthActionLogStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandRedirectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import java.io.UnsupportedEncodingException;
import nj3.C76879j;
import p206nj.C117627q;
import p225rc.C89916g;
import p225rc.g$$e;
import rx3.C13598b0;
import zq0.C91891k0;
import zq0.C91894m;

/* renamed from: gk0.w0 */
public class C87259w0 extends C91894m {

    /* renamed from: gk0.w0$a */
    public class C87260a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f252979d;

        /* renamed from: e */
        public final /* synthetic */ C32226l f252980e;

        /* renamed from: gk0.w0$a$a */
        public class C87261a implements g$$e {
            public C87261a() {
            }

            /* renamed from: a */
            public void mo1626a(int i, Intent intent) {
                C87260a.this.f252980e.invoke(Integer.valueOf(i));
            }
        }

        public C87260a(C87259w0 w0Var, Context context, C32226l lVar) {
            this.f252979d = context;
            this.f252980e = lVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(this.f252979d, AppBrandRedirectUI.class);
            intent.putExtra("key_from_scene", 0);
            C89916g.m112446a(this.f252979d).mo124236j(intent, new C87261a());
        }
    }

    /* renamed from: gk0.w0$b */
    public class C87262b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l f252982d;

        public C87262b(C87259w0 w0Var, C32226l lVar) {
            this.f252982d = lVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f252982d.invoke(0);
        }
    }

    /* renamed from: a */
    public void mo121661a(Context context) {
        if (context instanceof MMActivity) {
            ((MMActivity) context).hideVKB();
        }
    }

    /* renamed from: c */
    public SpannableString mo121662c(Context context, String str, String str2) {
        String string = context.getString(C0966R.string.a7t);
        String format = String.format(context.getString(C0966R.string.a7u), new Object[]{string});
        WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
        bVar.f239557a = str;
        bVar.f239567k = str2;
        bVar.f239566j = 8;
        WxaExposedParams a = bVar.mo113977a();
        String str3 = C83727p2.f244372d;
        String str4 = "";
        if (Util.isNullOrNil(a.f239539d)) {
            Log.m105920e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl fail, null or nil appId");
        } else {
            try {
                str4 = String.format(C83727p2.f244373e, new Object[]{a.f239539d, C117627q.m165909b(Util.nullAsNil(a.f239549q), "UTF-8"), Integer.valueOf(a.f239548p), Integer.valueOf(Util.nullAsInt(Integer.valueOf(a.f239545j), -1)), Integer.valueOf(Util.nullAsInt(Integer.valueOf(a.f239546n), -1))});
            } catch (UnsupportedEncodingException unused) {
                Log.m105920e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl encode fail, invalid arguments");
            }
        }
        C8328a aVar = new C8328a(str4);
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(aVar, format.indexOf(string), format.indexOf(string) + string.length(), 18);
        return spannableString;
    }

    /* renamed from: h */
    public void mo121663h(Context context, C32226l<? super Integer, C13598b0> lVar) {
        C76879j.m92718L(context, false, context.getString(C0966R.string.f7696oi), context.getString(C0966R.string.f7697oj), context.getString(C0966R.string.f7704or), context.getString(C0966R.string.f7926wf), new C87260a(this, context, lVar), new C87262b(this, lVar), C0966R.color.f3536x0, C0966R.color.f3536x0);
    }

    /* renamed from: j */
    public void mo121664j(C91891k0 k0Var) {
        WAPhoneAuthActionLogStruct wAPhoneAuthActionLogStruct = new WAPhoneAuthActionLogStruct();
        wAPhoneAuthActionLogStruct.f236486d = k0Var.f263091a;
        wAPhoneAuthActionLogStruct.f236487e = k0Var.f263092b;
        wAPhoneAuthActionLogStruct.f236488f = k0Var.f263093c;
        wAPhoneAuthActionLogStruct.f236489g = k0Var.f263094d;
        wAPhoneAuthActionLogStruct.f236490h = k0Var.f263095e;
        wAPhoneAuthActionLogStruct.f236491i = k0Var.f263096f;
        wAPhoneAuthActionLogStruct.f236492j = k0Var.f263097g;
        wAPhoneAuthActionLogStruct.f236493k = k0Var.f263098h;
        wAPhoneAuthActionLogStruct.f236494l = k0Var.f263099i;
        wAPhoneAuthActionLogStruct.f236495m = k0Var.f263100j;
        wAPhoneAuthActionLogStruct.f236496n = k0Var.f263101k;
        wAPhoneAuthActionLogStruct.f236497o = k0Var.f263102l;
        long j = k0Var.f263115y;
        wAPhoneAuthActionLogStruct.f236498p = j;
        wAPhoneAuthActionLogStruct.f236499q = k0Var.f263104n;
        wAPhoneAuthActionLogStruct.f236500r = k0Var.f263105o;
        wAPhoneAuthActionLogStruct.f236501s = k0Var.f263106p;
        wAPhoneAuthActionLogStruct.f236502t = k0Var.f263107q;
        wAPhoneAuthActionLogStruct.f236503u = k0Var.f263108r;
        wAPhoneAuthActionLogStruct.f236504v = k0Var.f263109s;
        wAPhoneAuthActionLogStruct.f236505w = k0Var.f263110t;
        wAPhoneAuthActionLogStruct.f236506x = k0Var.f263111u;
        wAPhoneAuthActionLogStruct.f236507y = k0Var.f263112v;
        wAPhoneAuthActionLogStruct.f236508z = k0Var.f263113w;
        wAPhoneAuthActionLogStruct.f236481A = k0Var.f263114x;
        wAPhoneAuthActionLogStruct.f236482B = j;
        wAPhoneAuthActionLogStruct.f236483C = k0Var.f263116z;
        wAPhoneAuthActionLogStruct.f236484D = wAPhoneAuthActionLogStruct.mo86045b("appid", k0Var.f263089A, true);
        wAPhoneAuthActionLogStruct.f236485E = wAPhoneAuthActionLogStruct.mo86045b("phoneNumber", k0Var.f263090B, true);
        wAPhoneAuthActionLogStruct.mo86054n();
    }
}
