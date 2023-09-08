package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import fy3.C32226l;
import ht1.C98522w3;
import java.util.HashMap;
import qo3.C77398g;
import rx3.C13598b0;
import wc3.C78541w;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.b1$$d */
public final /* synthetic */ class b1$$d implements C32226l {

    /* renamed from: d */
    public final /* synthetic */ C94163b1 f271999d;

    public /* synthetic */ b1$$d(C94163b1 b1Var) {
        this.f271999d = b1Var;
    }

    public final Object invoke(Object obj) {
        C94163b1 b1Var = this.f271999d;
        String str = (String) obj;
        b1Var.getClass();
        Activity activity = b1Var.f271948d;
        C77398g jb02 = ((C78541w) C86312j.m106911c(C78541w.class)).jb0(activity, str, (View) null, activity.getResources().getString(C0966R.string.f361261il0), new b1$$f(b1Var, str));
        b1Var.f271985H = jb02;
        jb02.show();
        HashMap hashMap = new HashMap();
        hashMap.put("chat_name", str);
        ((C98522w3) C86312j.m106911c(C98522w3.class)).mo3990Ai((View) null, true, false, "forward_recent_user_in_menu_in_poi_page", hashMap);
        return C13598b0.f38549a;
    }
}
