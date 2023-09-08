package ju0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.MD5;
import gy3.C87412m;
import io0.C33370f;
import p301cd.C92416i;
import z04.C119027c;

/* renamed from: ju0.i */
public final class C99037i extends C99035b {

    /* renamed from: b */
    public static final C99037i f290336b = new C99037i();

    /* renamed from: b */
    public final C86009m1 mo138383b(C86009m1 m1Var, C86009m1 m1Var2) {
        C86009m1 m1Var3 = new C86009m1(m1Var, m1Var2.getName());
        Log.m105918d("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, originFile: " + m1Var2 + ", newFile: " + m1Var3);
        C33370f fVar = C33370f.f90435a;
        if (fVar.mo59107a(m1Var3)) {
            Log.m105918d("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, newFile already exist");
            return m1Var3;
        } else if (!m1Var2.mo119967g()) {
            Log.m105928w("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, originFile not exist");
            return null;
        } else if (0 > C86013q1.m106443d(m1Var2.mo119971i(), m1Var3.mo119971i(), false)) {
            Log.m105928w("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, copy fail");
            return null;
        } else if (fVar.mo59108b(m1Var3)) {
            return m1Var3;
        } else {
            Log.m105928w("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, record newFile fail");
            return null;
        }
    }

    /* renamed from: c */
    public final String mo138384c(C92416i iVar) {
        byte[] bytes = iVar.mo21064a().getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        return MD5.getMessageDigest(bytes);
    }
}
