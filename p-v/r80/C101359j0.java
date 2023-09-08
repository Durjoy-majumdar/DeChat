package r80;

import android.graphics.Rect;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87413o;
import r80.C89903h;
import rx3.C13598b0;

/* renamed from: r80.j0 */
public final class C101359j0 implements C89903h.C89904a {

    /* renamed from: a */
    public static final C101359j0 f296927a = new C101359j0();

    /* renamed from: r80.j0$a */
    public static final class C101360a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89903h.C89905b f296928d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101360a(C89903h.C89905b bVar) {
            super(1);
            this.f296928d = bVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C89903h.C89905b bVar = this.f296928d;
            if (bVar != null) {
                bVar.mo114978a(str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public C89903h mo140842a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, C89903h.C89905b bVar) {
        String str3 = str == null ? "" : str;
        String str4 = str2 == null ? "" : str2;
        C101360a aVar = r0;
        C101360a aVar2 = new C101360a(bVar);
        return new C110538r((String) null, str3, 1, str4, (Rect) null, 0, 0, i, i2, i3, 48000, 44100, 1, i4, 0, 0, false, false, i5, i6, false, 0, (C32226l) null, aVar, 7340032, (C8480h) null);
    }
}
