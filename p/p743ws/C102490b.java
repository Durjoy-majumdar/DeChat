package p743ws;

import android.graphics.Bitmap;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72925s;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0;
import di3.C86301e;
import ei3.C86522b;
import java.lang.ref.WeakReference;
import java.util.Vector;
import p755xs.C102720b;
import p755xs.C102721c;
import sf0.C101592a0;
import sf0.C101594c0;

@C86522b
/* renamed from: ws.b */
public class C102490b extends C86301e implements C102720b {
    public boolean Bm0(C102720b.C78973a aVar) {
        return C101594c0.f297417b.remove(aVar);
    }

    /* renamed from: Fa */
    public C102721c mo142101Fa(int i, C102721c.C102722a aVar) {
        C96880s0 s0Var = new C96880s0(i);
        s0Var.f283861l = aVar;
        return s0Var;
    }

    /* renamed from: J7 */
    public Bitmap mo142102J7(String str, int i, int i2) {
        Vector<WeakReference<C102720b.C78973a>> vector = C101594c0.f297416a;
        return C101594c0.C101596b.m133444f(str, i, i2);
    }

    public boolean Lu0(C102720b.C78973a aVar) {
        return C101594c0.f297416a.add(new WeakReference(aVar));
    }

    /* renamed from: N6 */
    public Bitmap mo142104N6(C101592a0 a0Var) {
        return C101594c0.m133439c(a0Var);
    }

    /* renamed from: Ou */
    public Bitmap mo142105Ou(String str) {
        Vector<WeakReference<C102720b.C78973a>> vector = C101594c0.f297416a;
        return C101594c0.C101596b.m133443e(str);
    }

    /* renamed from: PK */
    public C101592a0 mo142106PK(String str, String str2, int i, int i2) {
        return new C72925s(str, str2, i, i2);
    }

    public boolean U70(C102720b.C78973a aVar) {
        C101594c0.f297417b.remove(aVar);
        return C101594c0.f297417b.add(aVar);
    }
}
