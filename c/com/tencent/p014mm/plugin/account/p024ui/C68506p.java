package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import k20.C9556a;
import nj3.C11184p0;
import p910lj.C76701a;
import qe3.C89625d;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.p */
public class C68506p implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ Context f196779d;

    /* renamed from: e */
    public final /* synthetic */ String f196780e;

    /* renamed from: f */
    public final /* synthetic */ String f196781f;

    /* renamed from: g */
    public final /* synthetic */ String f196782g;

    public C68506p(Context context, String str, String str2, String str3) {
        this.f196779d = context;
        this.f196780e = str;
        this.f196781f = str2;
        this.f196782g = str3;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C78595a.m94985e("F100_100_QQ");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(this.f196779d.getClass().getName());
            sb.append(",");
            sb.append("F100_100_QQ");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("F100_100_QQ"));
            sb.append(",");
            sb.append(1);
            C78595a.m94983c(10645, true, sb.toString());
            Context context = this.f196779d;
            C68507q.m80766a(context, context.getString(C0966R.string.k85));
        } else if (itemId == 2) {
            C78595a.m94985e("F100_100_Email");
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107523b();
            sb4.append(C86718e.m107547e());
            sb4.append(",");
            sb4.append(this.f196779d.getClass().getName());
            sb4.append(",");
            sb4.append("F100_100_Email");
            sb4.append(",");
            C86709a0.m107523b();
            sb4.append(C86718e.m107548f("F100_100_Email"));
            sb4.append(",");
            sb4.append(1);
            C78595a.m94983c(10645, true, sb4.toString());
            C68507q.m80766a(this.f196779d, this.f196779d.getString(C0966R.string.gcz) + LocaleUtil.getApplicationLanguage());
        } else if (itemId == 4) {
            Context context2 = this.f196779d;
            String str2 = this.f196780e;
            String str3 = this.f196781f;
            String str4 = this.f196782g;
            C78595a.m94985e("F100_100_phone");
            StringBuilder sb5 = new StringBuilder();
            C86709a0.m107523b();
            sb5.append(C86718e.m107547e());
            sb5.append(",");
            sb5.append(context2.getClass().getName());
            sb5.append(",");
            sb5.append("F100_100_phone");
            sb5.append(",");
            C86709a0.m107523b();
            sb5.append(C86718e.m107548f("F100_100_phone"));
            sb5.append(",");
            sb5.append(1);
            C78595a.m94983c(10645, true, sb5.toString());
            if (C89625d.f257845k) {
                C76701a.makeText(context2, (CharSequence) context2.getString(C0966R.string.f7560jn), 0).show();
                return;
            }
            Intent intent = new Intent(context2, MobileInputUI.class);
            if (str3 != null) {
                int indexOf = str3.indexOf("+");
                if (indexOf != -1 && str3.length() > 0) {
                    str3 = str3.substring(indexOf + 1);
                }
                intent.putExtra("couttry_code", str3);
            }
            if (str2 != null) {
                intent.putExtra("country_name", str2);
            }
            if (str4 != null) {
                intent.putExtra("bindmcontact_shortmobile", str4);
            }
            intent.putExtra("mobile_input_purpose", 1);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/ForgotPwdMenu", "loginBySMS", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/plugin/account/ui/ForgotPwdMenu", "loginBySMS", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (itemId == 8) {
            String string = this.f196779d.getString(C0966R.string.lit);
            if (LocaleUtil.getApplicationLanguage().equals("zh_CN")) {
                str = string + "zh_CN";
            } else {
                str = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fll) + "/cgi-bin/newreadtemplate?t=help_center/w_index&Channel=Client&lang=";
            }
            C68507q.m80766a(this.f196779d, str);
        }
    }
}
