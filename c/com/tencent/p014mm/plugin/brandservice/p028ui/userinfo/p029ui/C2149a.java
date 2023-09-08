package com.tencent.p014mm.plugin.brandservice.p028ui.userinfo.p029ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.Scopes;
import ey0.C7948a;
import gy3.C87412m;
import jq3.C60897k;
import jq3.C9493c;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a */
public final class C2149a implements C60897k<C7948a> {
    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C60897k.C9501a.m9192a(this, view, (C7948a) cVar, i);
        return false;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C7948a) cVar, i);
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        C7948a aVar = (C7948a) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "data");
        if (!aVar.f26635e) {
            Intent intent = new Intent();
            String str = aVar.f26634d.f137427g;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            intent.putExtra("Contact_User", str);
            String str3 = aVar.f26634d.f137428h;
            if (str3 != null) {
                str2 = str3;
            }
            intent.putExtra("Contact_Nick", str2);
            C88144b.m109791i(view.getContext(), Scopes.PROFILE, ".ui.newbizinfo.NewBizInfoSettingUI", intent, (Bundle) null);
        }
    }
}
