package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import ep0.C86630a;
import java.io.InputStream;
import java.util.Map;
import lb0.C88394b;
import p1043ua.C90624c;
import p210o.C11323a;
import zi0.C91755a;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.k */
public class C83542k extends C90624c {

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.k$a */
    public class C83543a implements C88394b.C88411m {

        /* renamed from: d */
        public final /* synthetic */ C91755a.C91757b f244065d;

        public C83543a(C83542k kVar, C91755a.C91757b bVar) {
            this.f244065d = bVar;
        }

        /* renamed from: b */
        public void mo1907b() {
            C91755a.C91757b bVar = this.f244065d;
            if (bVar != null) {
                bVar.mo125629a((Bitmap) null);
            }
        }

        /* renamed from: d */
        public void mo1908d() {
        }

        public String key() {
            return "WxaIcon" + hashCode();
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            if (this.f244065d != null) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.f244065d.mo125629a((Bitmap) null);
                } else {
                    this.f244065d.mo125629a(bitmap);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.k$b */
    public class C83544b implements C11323a<InputStream, Void> {

        /* renamed from: a */
        public final /* synthetic */ C91755a.C91758c f244066a;

        public C83544b(C83542k kVar, C91755a.C91758c cVar) {
            this.f244066a = cVar;
        }

        public Object apply(Object obj) {
            InputStream inputStream = (InputStream) obj;
            C91755a.C91758c cVar = this.f244066a;
            if (cVar == null) {
                return null;
            }
            cVar.mo121428a(inputStream);
            return null;
        }
    }

    /* renamed from: N0 */
    public void mo115839N0(String str, Map<String, String> map, C91755a.C91758c cVar) {
        String str2 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122799r(str, map, new C83544b(this, cVar));
    }

    /* renamed from: P0 */
    public Bitmap mo115833P0(String str, Rect rect, C91755a.C91757b bVar) {
        if (!mo115834Q0(str)) {
            return null;
        }
        C86630a aVar = rect != null ? new C86630a(rect.left, rect.top, rect.width(), rect.height()) : null;
        String str2 = C88394b.f255384g;
        C88394b bVar2 = C88394b.C88418q.f255427a;
        Bitmap g = bVar2.mo122791g(str, aVar);
        if (g == null) {
            bVar2.mo122797p(new C83543a(this, bVar), str, (C88394b.C88408j) null, aVar);
        }
        return g;
    }

    /* renamed from: Q0 */
    public boolean mo115834Q0(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || lowerCase.startsWith(HttpWrapperBase.PROTOCAL_HTTPS);
    }
}
