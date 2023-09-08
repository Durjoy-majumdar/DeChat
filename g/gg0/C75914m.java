package gg0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMobileUI;
import ig0.C76343k;

/* renamed from: gg0.m */
public class C75914m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f222587d;

    /* renamed from: e */
    public final /* synthetic */ BindMobileUI f222588e;

    public C75914m(BindMobileUI bindMobileUI, String str) {
        this.f222588e = bindMobileUI;
        this.f222587d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        BindMobileUI bindMobileUI = this.f222588e;
        String str = this.f222587d;
        if (bindMobileUI.f196466j == null) {
            bindMobileUI.f196466j = new C76343k(C76343k.C76348e.BINDMOBILE, bindMobileUI, new C75915n(bindMobileUI, str));
        }
        bindMobileUI.f196466j.mo106573d(str);
        if (bindMobileUI.f196460A) {
            bindMobileUI.f196466j.f223602n = false;
        }
    }
}
