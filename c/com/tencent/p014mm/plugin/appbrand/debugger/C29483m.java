package com.tencent.p014mm.plugin.appbrand.debugger;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29199d3;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86301e;
import ei3.C86522b;
import java.util.Map;
import p910lj.C76701a;
import zt3.C119157j;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.debugger.m */
public final class C29483m extends C86301e implements C29480i {

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.m$a */
    public static final class C29484a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f80341d;

        public C29484a(String str) {
            this.f80341d = str;
        }

        public final void run() {
            Context context = MMApplicationContext.getContext();
            C76701a.makeText(context, (CharSequence) "小程序monkey test: xml 解析出错，请检查内容及格式是否正确\n\n" + this.f80341d, 1).show();
        }
    }

    /* renamed from: Op */
    public void mo56727Op(Context context, String str) {
        C29199d3.C29201d dVar;
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            Map<String, String> map = null;
            try {
                map = XmlParser.parseXml(str, "sysmsg", (String) null);
            } catch (Exception unused) {
            }
            if (map == null) {
                ((C119157j) C119157j.f356862d).mo183895z(new C29484a(str));
                return;
            }
            String str2 = map.get(".sysmsg.$type");
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z && (dVar = C29199d3.f79843d.get(str2)) != null) {
                dVar.mo56511b(str, map);
            }
        }
    }
}
