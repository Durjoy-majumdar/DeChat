package fi1;

import a14.C53916l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fi1.C59092a;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import kotlin.Result;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: fi1.b */
public final class C59096b implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ String f169058d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<C59092a.C59093a> f169059e;

    public C59096b(String str, C53916l<? super C59092a.C59093a> lVar) {
        this.f169058d = str;
        this.f169059e = lVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C87412m.m108594g(str, "mediaId");
        String str2 = C59092a.f169056a;
        StringBuilder sb = new StringBuilder();
        sb.append("cdncallback, mediaId:");
        sb.append(str);
        sb.append(", startRet:");
        sb.append(i);
        sb.append(", ");
        sb.append(dVar != null ? Integer.valueOf(dVar.field_retCode) : null);
        Log.m105924i("Finder.FinderInteractiveGiftLoader", sb.toString());
        if (dVar == null) {
            return 0;
        }
        if (dVar.field_retCode == 0) {
            Log.m105924i("Finder.FinderInteractiveGiftLoader", "success, fileExist:" + C86013q1.m106450k(this.f169058d));
            C53916l<C59092a.C59093a> lVar = this.f169059e;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(new C59092a.C59093a.C59095b(this.f169058d)));
        } else {
            Log.m105924i("Finder.FinderInteractiveGiftLoader", "failed, " + dVar.field_retCode);
            C53916l<C59092a.C59093a> lVar2 = this.f169059e;
            Result.Companion companion2 = Result.Companion;
            lVar2.resumeWith(Result.m168114constructorimpl(new C59092a.C59093a.C59094a(dVar.field_retCode)));
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
