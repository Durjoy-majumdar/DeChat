package com.tencent.p014mm.plugin.appbrand;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import mb0.C10773b;
import p003ay.C0235b;
import p823sg.C90193h;

@C86522b(creator = C1940m2.class, dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.m2 */
public class C1940m2 extends C86301e implements C10773b {

    /* renamed from: com.tencent.mm.plugin.appbrand.m2$a */
    public static class C1941a {

        /* renamed from: a */
        public static C1940m2 f11819a = new C1940m2();
    }

    public Intent Dp0(String str, int i, String str2, String str3, String[] strArr, String str4, int i2, int i3) {
        Class cls = C0235b.class;
        boolean z = Build.VERSION.SDK_INT >= 26;
        String ah = ((C0235b) C86312j.m106911c(cls)).mo263ah(str2, z);
        if (Util.isNullOrNil(ah)) {
            return null;
        }
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3;
        }
        StringBuilder sb = new StringBuilder();
        for (String append : strArr) {
            sb.append(append);
        }
        String f = C90193h.m112878f(("" + str2 + sb.toString()).getBytes());
        Intent intent = new Intent("com.tencent.mm.action.WX_SHORTCUT");
        intent.putExtra("type", i3);
        intent.putExtra("id", ah);
        intent.putExtra("ext_info", ((C0235b) C86312j.m106911c(cls)).mo263ah(str4, z));
        intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, ((C0235b) C86312j.m106911c(cls)).mo260E7(str4, "" + i2));
        intent.putExtra("digest", f);
        intent.putExtra("ext_info_1", i);
        intent.setPackage(str);
        intent.addFlags(67108864);
        return intent;
    }
}
