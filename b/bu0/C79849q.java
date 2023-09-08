package bu0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.vfs.C86009m1;
import lu3.C88656g;
import zt3.C119157j;

/* renamed from: bu0.q */
public class C79849q extends C79840l {

    /* renamed from: bu0.q$a */
    public class C79850a implements C88656g {
        public C79850a() {
        }

        public String getKey() {
            return "TempFileIconLoader";
        }

        public void run() {
            C86009m1 absoluteFile = C79849q.this.f233989b.getFileSystem().getAbsoluteFile(C79849q.this.f233988a);
            if (absoluteFile == null) {
                C79849q qVar = C79849q.this;
                qVar.f233990c.mo110023a("Failed to load icon via temp file", qVar);
                return;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(absoluteFile.mo119976n());
            if (decodeFile != null) {
                C79849q qVar2 = C79849q.this;
                C79842m mVar = qVar2.f233993f;
                if (mVar != null) {
                    mVar.mo110010a(decodeFile, qVar2);
                    return;
                }
                return;
            }
            C79849q qVar3 = C79849q.this;
            qVar3.f233990c.mo110023a("Failed to load icon via temp file", qVar3);
        }
    }

    public C79849q(String str, C79839k kVar, C81925i2 i2Var) {
        super(str, kVar, i2Var);
    }

    /* renamed from: b */
    public void mo110025b() {
        if (this.f233989b.getFileSystem() == null || this.f233988a == null) {
            this.f233990c.mo110023a("Failed to load icon via temp file", this);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C79850a());
    }
}
