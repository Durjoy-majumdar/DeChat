package com.tencent.p014mm.plugin.webview.luggage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.luggage.m0 */
public class C6007m0 extends C85514l0 {

    /* renamed from: u */
    public View f22252u;

    /* renamed from: v */
    public View f22253v;

    /* renamed from: w */
    public TextView f22254w = ((TextView) this.f22253v.findViewById(C0966R.C0970id.mx6));

    public C6007m0(Context context, View view) {
        super(context);
        this.f22252u = view;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f360071ci2, this, false);
        this.f22253v = inflate;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = inflate;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f22253v.setBackgroundResource(C0966R.color.akq);
        mo118900f(this.f22253v, view);
    }

    /* renamed from: g */
    public void mo6967g() {
        setPullDownEnabled(false);
        View view = this.f22253v;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setTransparent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setTransparent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f22252u.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    public void setBgColor(int i) {
        ((ViewGroup) this.f22253v.getParent()).setBackgroundColor(i);
    }

    public void setCurrentUrl(String str) {
        if (!Util.isNullOrNil(str)) {
            String host = Uri.parse(str).getHost();
            if (Util.isNullOrNil(host)) {
                this.f22254w.setVisibility(8);
                return;
            }
            String string = getContext().getString(C0966R.string.lga, new Object[]{host});
            this.f22254w.setVisibility(0);
            this.f22254w.setText(string);
            return;
        }
        this.f22254w.setVisibility(8);
    }

    public void setPullDownViewVisibility(int i) {
        View view = this.f22253v;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setPullDownViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setPullDownViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
