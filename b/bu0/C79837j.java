package bu0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import lu3.C88656g;
import zt3.C119157j;

/* renamed from: bu0.j */
public class C79837j extends C79840l {

    /* renamed from: bu0.j$a */
    public class C79838a implements C88656g {
        public C79838a() {
        }

        public String getKey() {
            return "Base64IconLoader";
        }

        public void run() {
            try {
                C79837j jVar = C79837j.this;
                byte[] decode = Base64.decode(jVar.f233988a, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                if (decodeByteArray == null) {
                    jVar.f233990c.mo110023a("Failed to load icon via base64 icon", jVar);
                }
                C79837j jVar2 = C79837j.this;
                C79842m mVar = jVar2.f233993f;
                if (mVar != null) {
                    mVar.mo110010a(decodeByteArray, jVar2);
                }
            } catch (Exception unused) {
                C79837j jVar3 = C79837j.this;
                jVar3.f233990c.mo110023a("Failed to load icon via base64 icon", jVar3);
            }
        }
    }

    public C79837j(String str, C79839k kVar) {
        super(str, kVar);
    }

    /* renamed from: b */
    public void mo110025b() {
        if (this.f233988a != null) {
            ((C119157j) C119157j.f356862d).mo183875f(new C79838a());
            return;
        }
        this.f233990c.mo110023a("Failed to load icon via base64 icon", this);
    }
}
