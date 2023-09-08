package ok1;

import a14.C53916l;
import a14.C53921m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import kotlin.Result;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: ok1.b */
public final class C11425b {

    /* renamed from: a */
    public static final C11425b f33607a = new C11425b();

    /* renamed from: ok1.b$a */
    public static final class C11426a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C53916l<String> f33608d;

        public C11426a(C53916l<? super String> lVar) {
            this.f33608d = lVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            if (dVar == null) {
                return 0;
            }
            Log.m105924i("FinderLiveUploadUtil", "[uploadImage] upload end");
            if (dVar.field_retCode != 0 || Util.isNullOrNil(dVar.field_fileUrl)) {
                this.f33608d.resumeWith(Result.m168114constructorimpl((Object) null));
                return 0;
            }
            C53916l<String> lVar = this.f33608d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(dVar.field_fileUrl));
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

    /* renamed from: a */
    public final Object mo11425a(String str, C15601d<? super String> dVar) {
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        boolean z = false;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            }
        }
        if (!z || !C86013q1.m106450k(str)) {
            Log.m105924i("FinderLiveUploadUtil", "[uploadImage] upload end");
            mVar.resumeWith(Result.m168114constructorimpl((Object) null));
        } else {
            C98124g gVar = new C98124g();
            gVar.field_mediaId = "upload_" + MD5Util.getMD5String(str);
            gVar.field_fullpath = str;
            gVar.field_thumbpath = str;
            gVar.field_needStorage = true;
            gVar.field_fileType = 20304;
            gVar.field_appType = 251;
            gVar.field_bzScene = 2;
            gVar.f287673t = 300;
            gVar.f287674u = 300;
            gVar.field_priority = 2;
            gVar.f287662f = new C11426a(mVar);
            ((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar);
        }
        return mVar.mo74608o();
    }
}
