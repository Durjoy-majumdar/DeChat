package uq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p599lr.C61381b;
import p663qo.C101213l;
import qo1.C63289e;
import te3.zr4;
import u60.C65220d;
import u60.C65234n;

/* renamed from: uq1.r */
public final class C65458r extends C65220d {

    /* renamed from: f */
    public final String f188350f;

    /* renamed from: g */
    public final String f188351g = "Finder.FinderUploadLiveCoverImageTask";

    /* renamed from: h */
    public String f188352h = "";

    /* renamed from: i */
    public String f188353i = "";

    /* renamed from: j */
    public C98121d f188354j;

    /* renamed from: n */
    public final C65459a f188355n = new C65459a(this);

    /* renamed from: uq1.r$a */
    public static final class C65459a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C65458r f188356d;

        public C65459a(C65458r rVar) {
            this.f188356d = rVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            String str2;
            C65234n nVar = C65234n.Fail;
            String str3 = this.f188356d.f188351g;
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i);
            if (dVar == null || (str2 = dVar.toString()) == null) {
                str2 = "null";
            }
            objArr[2] = str2;
            Log.m105925i(str3, "on cdn callback mediaId = %s, startRet = %d, sceneResult %s", objArr);
            if (i != 0) {
                Log.m105921e(this.f188356d.f188351g, "start failed : %d, media id is :%s", Integer.valueOf(i), str);
                if (i != -21005) {
                    this.f188356d.mo11853b(nVar);
                }
                return 0;
            }
            if (!Util.isNullOrNil(str) && dVar != null) {
                Log.m105925i(this.f188356d.f188351g, "retCode %d, fileId %s, url %s", Integer.valueOf(dVar.field_retCode), dVar.field_fileId, dVar.field_fileUrl);
                if (dVar.field_retCode != 0) {
                    this.f188356d.mo11853b(nVar);
                } else {
                    C65458r rVar = this.f188356d;
                    String str4 = dVar.field_fileUrl;
                    C87412m.m108593f(str4, "sceneResult.field_fileUrl");
                    rVar.getClass();
                    rVar.f188352h = str4;
                    C65458r rVar2 = this.f188356d;
                    String str5 = dVar.field_thumbUrl;
                    C87412m.m108593f(str5, "sceneResult.field_thumbUrl");
                    rVar2.getClass();
                    rVar2.f188353i = str5;
                    C65458r rVar3 = this.f188356d;
                    rVar3.f188354j = dVar;
                    rVar3.mo11853b(C65234n.OK);
                }
            }
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

    public C65458r(String str, String str2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, "userName");
        this.f188350f = str;
    }

    /* renamed from: a */
    public void mo11852a() {
        if (!C86013q1.m106450k(this.f188350f)) {
            String str = this.f188351g;
            Log.m105918d(str, "path " + this.f188350f + " is not file");
            mo11853b(C65234n.Fail);
            return;
        }
        C98124g gVar = new C98124g();
        gVar.f287662f = this.f188355n;
        gVar.field_mediaId = MD5Util.getMD5String(this.f188350f);
        gVar.field_fullpath = this.f188350f;
        gVar.field_thumbpath = C63289e.C63290a.m74586a(((C61381b) C86312j.m106911c(C61381b.class)).Xs0(), this.f188350f, (zr4) null, 2, (Object) null);
        gVar.field_talker = "";
        gVar.field_needStorage = true;
        gVar.field_fileType = 20304;
        gVar.field_appType = 251;
        gVar.field_bzScene = 2;
        gVar.f287673t = 60;
        gVar.f287674u = 300;
        gVar.field_priority = 2;
        ((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar);
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f188350f;
    }
}
