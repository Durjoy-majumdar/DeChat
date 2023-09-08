package bu0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.InputStream;
import lu3.C88656g;
import zt3.C119157j;

/* renamed from: bu0.p */
public class C79847p extends C79840l {

    /* renamed from: bu0.p$a */
    public class C79848a implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f233997d;

        public C79848a(AppBrandRuntime appBrandRuntime) {
            this.f233997d = appBrandRuntime;
        }

        public String getKey() {
            return "PackageIconLoader";
        }

        public void run() {
            InputStream m = C81247g3.m99557m(this.f233997d, C79847p.this.f233988a);
            Bitmap decodeStream = BitmapFactory.decodeStream(m);
            if (decodeStream == null) {
                C79847p pVar = C79847p.this;
                pVar.f233990c.mo110023a("Failed to load icon via package path", pVar);
            } else {
                C79847p pVar2 = C79847p.this;
                C79842m mVar = pVar2.f233993f;
                if (mVar != null) {
                    mVar.mo110010a(decodeStream, pVar2);
                }
            }
            if (m != null) {
                Util.qualityClose(m);
            }
        }
    }

    public C79847p(String str, C79839k kVar, C81925i2 i2Var) {
        super(str, kVar, i2Var);
    }

    /* renamed from: b */
    public void mo110025b() {
        AppBrandRuntime runtime = this.f233989b.getRuntime();
        if (runtime != null && this.f233988a != null) {
            ((C119157j) C119157j.f356862d).mo183875f(new C79848a(runtime));
        }
    }
}
