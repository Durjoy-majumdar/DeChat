package np1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import kotlin.Result;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import wx3.C15601d;

/* renamed from: np1.j0 */
public final class C11255j0 implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f33182d;

    /* renamed from: e */
    public final /* synthetic */ C15601d<Boolean> f33183e;

    public C11255j0(C8477a0 a0Var, C15601d<? super Boolean> dVar) {
        this.f33182d = a0Var;
        this.f33183e = dVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C87412m.m108594g(str, "mediaId");
        Log.m105924i("ShoppingUtil", "fetchEcResource mediaId " + str + " startRet " + i + " sceneResult " + dVar + " onlyCheckExist " + z);
        if (dVar == null) {
            Log.m105924i("ShoppingUtil", "fetchEcResource skip fetch pag callback, sceneResult == null");
            C8477a0 a0Var = this.f33182d;
            if (!a0Var.f27482d) {
                a0Var.f27482d = true;
                C15601d<Boolean> dVar2 = this.f33183e;
                Result.Companion companion = Result.Companion;
                dVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            }
            return 0;
        } else if (dVar.field_retCode != 0) {
            Log.m105928w("ShoppingUtil", "fetchEcResource skip fetch pag callback, fetch pag fail:" + dVar.field_retCode);
            C8477a0 a0Var2 = this.f33182d;
            if (!a0Var2.f27482d) {
                a0Var2.f27482d = true;
                C15601d<Boolean> dVar3 = this.f33183e;
                Result.Companion companion2 = Result.Companion;
                dVar3.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            }
            return 0;
        } else {
            C8477a0 a0Var3 = this.f33182d;
            if (!a0Var3.f27482d) {
                a0Var3.f27482d = true;
                C15601d<Boolean> dVar4 = this.f33183e;
                Result.Companion companion3 = Result.Companion;
                dVar4.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            }
            return 0;
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(byteArrayOutputStream, "buff");
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(bArr, "inbuf");
        return new byte[0];
    }
}
