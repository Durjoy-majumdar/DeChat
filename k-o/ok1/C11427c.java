package ok1;

import a14.C53916l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayOutputStream;
import kotlin.Result;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import rx3.C13604l;

/* renamed from: ok1.c */
public final class C11427c implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C53916l<C13604l<String, String>> f33609d;

    public C11427c(C53916l<? super C13604l<String, String>> lVar) {
        this.f33609d = lVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        if (dVar == null) {
            return 0;
        }
        Log.m105924i("FinderLiveUploadUtil", "[uploadVideoFile] upload end, sceneResult = " + dVar);
        if (dVar.field_retCode != 0 || Util.isNullOrNil(dVar.field_fileUrl)) {
            this.f33609d.resumeWith(Result.m168114constructorimpl((Object) null));
            return 0;
        }
        C53916l<C13604l<String, String>> lVar = this.f33609d;
        Result.Companion companion = Result.Companion;
        lVar.resumeWith(Result.m168114constructorimpl(new C13604l(dVar.field_fileUrl, dVar.field_thumbUrl)));
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return null;
    }
}
