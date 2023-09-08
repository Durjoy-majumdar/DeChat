package com.tencent.p014mm.plugin.appbrand.config;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.config.C81652f;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import hp3.C87581a;
import java.util.List;
import kr0.C76629w0;
import lp3.C88633e;
import lp3.C88643g;
import nr3.C89060f;
import zt3.C119157j;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.config.g */
public final class C81654g extends C86301e implements C76629w0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.config.g$a */
    public class C81655a implements C81662k.C81671h<WxaAttributes> {

        /* renamed from: a */
        public final /* synthetic */ C76629w0.C61144a f239688a;

        public C81655a(C81654g gVar, C76629w0.C61144a aVar) {
            this.f239688a = aVar;
        }

        /* renamed from: a */
        public void mo113997a(C81662k.C81671h.C81672a aVar, Object obj) {
            WxaAttributes wxaAttributes = (WxaAttributes) obj;
            C76629w0.C61144a aVar2 = this.f239688a;
            if (aVar2 != null) {
                aVar2.mo21208a(wxaAttributes);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.g$b */
    public class C81656b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f239689d;

        /* renamed from: e */
        public final /* synthetic */ C76629w0.C61144a f239690e;

        public C81656b(String str, C76629w0.C61144a aVar) {
            this.f239689d = str;
            this.f239690e = aVar;
        }

        public void run() {
            String str = this.f239689d;
            WxaAttributes wxaAttributes = null;
            Pair j = C81662k.m100191j(str, false, (C81662k.C81676l) null, new C81677l(str, (C81662k.C81673i) null), (PBool) null);
            if (this.f239690e != null) {
                if (j.first != null) {
                    wxaAttributes = C81654g.this.mo106881XX(this.f239689d);
                }
                this.f239690e.mo21208a(wxaAttributes);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.g$c */
    public class C81657c implements C87581a<WxaAttributes, String> {

        /* renamed from: a */
        public final /* synthetic */ String f239692a;

        public C81657c(String str) {
            this.f239692a = str;
        }

        public Object call(Object obj) {
            String str = (String) obj;
            C81654g.this.mo106884tG(this.f239692a, new C81659h(this, C88643g.m110545c()));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.g$d */
    public class C81658d implements C81662k.C81671h<WxaAttributes> {

        /* renamed from: a */
        public final /* synthetic */ C76629w0.C61144a f239694a;

        public C81658d(C81654g gVar, C76629w0.C61144a aVar) {
            this.f239694a = aVar;
        }

        /* renamed from: a */
        public void mo113997a(C81662k.C81671h.C81672a aVar, Object obj) {
            WxaAttributes wxaAttributes = (WxaAttributes) obj;
            C76629w0.C61144a aVar2 = this.f239694a;
            if (aVar2 != null) {
                aVar2.mo21208a(wxaAttributes);
            }
        }
    }

    public void Aj0(List<String> list) {
        if (!Util.isNullOrNil((List) list)) {
            Log.m105925i("MicroMsg.AppBrand.WxaAttrExportService", "batchSync list %s", Util.listToString(list, ", "));
            C81662k.m100184c(list, C81652f.C81653a.WXA_CUSTOMER_SERVICE, (C81662k.C81674j) null);
        }
    }

    /* renamed from: CE */
    public void mo106878CE(String str, C76629w0.C61144a aVar) {
        C81662k.m100192k(str, true, new C81658d(this, aVar), (C81662k.C81673i) null);
    }

    /* renamed from: N2 */
    public WxaAttributes mo106879N2(String str) {
        return C81161g2.Cx0().mo114000LL(str, new String[0]);
    }

    public void Ws0(String str, C76629w0.C61144a aVar) {
        ((C119157j) C119157j.f356862d).mo183875f(new C81656b(str, aVar));
    }

    /* renamed from: XX */
    public WxaAttributes mo106881XX(String str) {
        return C81161g2.Cx0().mo114011mL(str, new String[0]);
    }

    /* renamed from: cH */
    public C88633e<WxaAttributes> mo106882cH(String str) {
        return C89060f.m111323b(str).mo123062e(new C81657c(str));
    }

    /* renamed from: cZ */
    public String mo106883cZ(String str) {
        return TextUtils.isEmpty(str) ? "" : C81661j.m100180e(str);
    }

    /* renamed from: tG */
    public void mo106884tG(String str, C76629w0.C61144a aVar) {
        C81662k.m100192k(str, false, new C81655a(this, aVar), (C81662k.C81673i) null);
    }
}
