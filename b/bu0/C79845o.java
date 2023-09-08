package bu0;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import lb0.C88394b;

/* renamed from: bu0.o */
public class C79845o extends C79840l {

    /* renamed from: bu0.o$a */
    public class C79846a implements C88394b.C88411m {
        public C79846a() {
        }

        /* renamed from: b */
        public void mo1907b() {
            C79845o oVar = C79845o.this;
            oVar.f233990c.mo110023a("Failed to load icon via network", oVar);
        }

        /* renamed from: d */
        public void mo1908d() {
        }

        public String key() {
            return C79845o.this.f233988a;
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            C79845o oVar = C79845o.this;
            C79842m mVar = oVar.f233993f;
            if (mVar != null) {
                mVar.mo110010a(bitmap, oVar);
            }
        }
    }

    public C79845o(String str, C79839k kVar, C81925i2 i2Var) {
        super(str, kVar, i2Var);
    }

    /* renamed from: b */
    public void mo110025b() {
        String str = this.f233988a;
        if (str != null) {
            String str2 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122796o(new C79846a(), str, (C88394b.C88408j) null);
        }
    }
}
