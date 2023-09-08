package u62;

import a72.C16436a;
import android.view.Surface;
import b72.C16754b;
import c72.C16866b;
import s62.C22299d;
import t62.C22438a;

/* renamed from: u62.e */
public interface C22595e {

    /* renamed from: u62.e$a */
    public static final class C22596a {
        /* renamed from: a */
        public static /* synthetic */ String m26412a(C22595e eVar, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                return eVar.mo35698b(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTagPrefix");
        }
    }

    /* renamed from: V2 */
    C16754b mo22573V2();

    /* renamed from: a */
    boolean mo35697a();

    /* renamed from: b */
    String mo35698b(String str);

    /* renamed from: c */
    C16436a mo35699c();

    /* renamed from: d */
    C22299d mo35700d();

    /* renamed from: e */
    C22438a mo35701e();

    /* renamed from: f */
    C16866b mo22574f();

    int getPlayerState();

    Surface getSurface();

    void setPlayerState(int i);

    void setSurface(Surface surface);
}
