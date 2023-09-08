package w50;

import a14.C53916l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8477a0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import kotlin.Result;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: w50.l */
public final class C15046l implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ String f41183d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f41184e;

    /* renamed from: f */
    public final /* synthetic */ C53916l<Boolean> f41185f;

    public C15046l(String str, C8477a0 a0Var, C53916l<? super Boolean> lVar) {
        this.f41183d = str;
        this.f41184e = a0Var;
        this.f41185f = lVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C87412m.m108594g(str, "mediaId");
        StringBuilder sb = new StringBuilder();
        sb.append("#downloadCdnResV2 cdncallback, mediaId:");
        sb.append(str);
        sb.append(", startRet:");
        sb.append(i);
        sb.append(", ");
        sb.append(dVar != null ? Integer.valueOf(dVar.field_retCode) : null);
        Log.m105924i("LiveMakeupUtil", sb.toString());
        if (dVar == null) {
            return 0;
        }
        if (dVar.field_retCode == 0) {
            Log.m105924i("LiveMakeupUtil", "#downloadCdnResV2 success, fileExist:" + C86013q1.m106450k(this.f41183d));
            C8477a0 a0Var = this.f41184e;
            if (!a0Var.f27482d) {
                a0Var.f27482d = true;
                C53916l<Boolean> lVar = this.f41185f;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            }
        } else {
            Log.m105924i("LiveMakeupUtil", "#downloadCdnResV2 failed, " + dVar.field_retCode);
            C8477a0 a0Var2 = this.f41184e;
            if (!a0Var2.f27482d) {
                a0Var2.f27482d = true;
                C53916l<Boolean> lVar2 = this.f41185f;
                Result.Companion companion2 = Result.Companion;
                lVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            }
        }
        return 0;
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
