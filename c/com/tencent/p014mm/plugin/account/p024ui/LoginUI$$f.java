package com.tencent.p014mm.plugin.account.p024ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import tc2.C118418g;
import tc2.C77890f;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$f */
public class LoginUI$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean[] f344630d;

    /* renamed from: e */
    public final /* synthetic */ LoginUI f344631e;

    public LoginUI$$f(LoginUI loginUI, boolean[] zArr) {
        this.f344631e = loginUI;
        this.f344630d = zArr;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f344630d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            this.f344631e.f344607I = C77890f.m94019a(2);
            C118418g gVar = C118418g.INSTANCE;
            gVar.Ud0("ce_login_id", "<LoginByID>", this.f344631e.f344607I);
            gVar.mo175827n9("ce_login_id", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
            gVar.ec0("ce_login_id");
        }
        LoginUI loginUI = this.f344631e;
        int i = LoginUI.f344598K;
        loginUI.mo174670J7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
