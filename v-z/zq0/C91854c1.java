package zq0;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.appbrand.utils.C2048s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p224ra.C89909e;
import qo3.C89782m0;
import te3.C64537lv;
import te3.C90427mv;
import zp0.C16377l;

/* renamed from: zq0.c1 */
public final class C91854c1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91897m0 f262999d;

    /* renamed from: zq0.c1$a */
    public static final class C91855a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C91855a f263000d = new C91855a();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: zq0.c1$b */
    public static final class C91856b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C91856b f263001d = new C91856b();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public C91854c1(C91897m0 m0Var) {
        this.f262999d = m0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Editable text;
        Editable text2;
        Editable text3;
        Object[] objArr = new Object[1];
        EditText editText = this.f262999d.f263130g;
        Integer num = null;
        boolean z = false;
        objArr[0] = editText != null ? editText.getText() : null;
        Log.m105925i("MicroMsg.PhoneNumberVerifyCodeDialog", "to verify sms %s", objArr);
        EditText editText2 = this.f262999d.f263130g;
        if (!(editText2 == null || (text3 = editText2.getText()) == null || text3.length() != 6)) {
            z = true;
        }
        if (z) {
            dialogInterface.dismiss();
            this.f262999d.mo125731g();
            C91897m0 m0Var = this.f262999d;
            View view = m0Var.f263129f;
            if (view != null) {
                view.post(new C91930z0(m0Var));
            }
            C91897m0 m0Var2 = this.f262999d;
            EditText editText3 = m0Var2.f263130g;
            String valueOf = String.valueOf(editText3 != null ? editText3.getText() : null);
            Class<C90427mv> cls = C90427mv.class;
            Class cls2 = C16377l.class;
            Log.m105924i("MicroMsg.PhoneNumberVerifyCodeDialog", "doVerifyCode");
            C91891k0 k0Var = m0Var2.f263126c;
            if (k0Var != null) {
                Long valueOf2 = Long.valueOf(k0Var.f263114x);
                C87412m.m108591d(valueOf2);
                k0Var.f263114x = valueOf2.longValue() + 1;
            }
            Context context = m0Var2.f263124a;
            C89782m0 c = C89782m0.m112252c(context, context.getString(C0966R.string.a89), true, (DialogInterface.OnCancelListener) null);
            PhoneItem phoneItem = m0Var2.f263127d;
            if (phoneItem.f245278n) {
                String str = m0Var2.f263125b;
                String str2 = phoneItem.f245271d;
                C87412m.m108594g(str, "appId");
                C87412m.m108594g(str2, "mobile");
                C91917u0 u0Var = new C91917u0(c, m0Var2);
                C64537lv lvVar = new C64537lv();
                lvVar.f184160d = str;
                lvVar.f184161e = str2;
                lvVar.f184162f = valueOf;
                ((C16377l) C89909e.m112436a(cls2)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/checkverifycode", str, lvVar, cls).mo123061d(new C91857d(u0Var)).mo123065b(new C16391e(u0Var));
                return;
            }
            String str3 = m0Var2.f263125b;
            String str4 = phoneItem.f245271d;
            C87412m.m108594g(str3, "appId");
            C87412m.m108594g(str4, "mobile");
            C91926x0 x0Var = new C91926x0(c, m0Var2);
            C64537lv lvVar2 = new C64537lv();
            lvVar2.f184160d = str3;
            lvVar2.f184161e = str4;
            lvVar2.f184162f = valueOf;
            ((C16377l) C89909e.m112436a(cls2)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/customphone/checkverifycode", str3, lvVar2, cls).mo123061d(new C91849b(x0Var)).mo123065b(new C16390c(x0Var));
            return;
        }
        EditText editText4 = this.f262999d.f263130g;
        Integer valueOf3 = (editText4 == null || (text2 = editText4.getText()) == null) ? null : Integer.valueOf(text2.length());
        C87412m.m108591d(valueOf3);
        if (valueOf3.intValue() == 0) {
            Log.m105920e("MicroMsg.PhoneNumberVerifyCodeDialog", "code is empty");
            Context context2 = this.f262999d.f263124a;
            C2048s0.m1999a(context2, context2.getString(C0966R.string.muk), this.f262999d.f263124a.getString(C0966R.string.f7699ol), C91855a.f263000d);
            return;
        }
        EditText editText5 = this.f262999d.f263130g;
        if (!(editText5 == null || (text = editText5.getText()) == null)) {
            num = Integer.valueOf(text.length());
        }
        C87412m.m108591d(num);
        if (num.intValue() < 6) {
            Log.m105920e("MicroMsg.PhoneNumberVerifyCodeDialog", "code is length is < 6");
            Context context3 = this.f262999d.f263124a;
            C2048s0.m1999a(context3, context3.getString(C0966R.string.mul), this.f262999d.f263124a.getString(C0966R.string.f7699ol), C91856b.f263001d);
        }
    }
}
