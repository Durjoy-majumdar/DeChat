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

/* renamed from: uq1.p */
public final class C65453p extends C65220d {

    /* renamed from: f */
    public final String f188338f;

    /* renamed from: g */
    public String f188339g = "";

    /* renamed from: h */
    public final C65454a f188340h = new C65454a(this);

    /* renamed from: uq1.p$a */
    public static final class C65454a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C65453p f188341d;

        public C65454a(C65453p pVar) {
            this.f188341d = pVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            String str2;
            C65234n nVar = C65234n.Fail;
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i);
            if (dVar == null || (str2 = dVar.toString()) == null) {
                str2 = "null";
            }
            objArr[2] = str2;
            Log.m105925i("Finder.UploadActivityCoverTask", "on cdn callback mediaId = %s, startRet = %d, sceneResult %s", objArr);
            if (i != 0) {
                Log.m105921e("Finder.UploadActivityCoverTask", "start failed : %d, media id is :%s", Integer.valueOf(i), str);
                if (i != -21005) {
                    this.f188341d.mo11853b(nVar);
                }
                return 0;
            }
            if (!Util.isNullOrNil(str) && dVar != null) {
                Log.m105925i("Finder.UploadActivityCoverTask", "retCode %d, fileId %s, url %s", Integer.valueOf(dVar.field_retCode), dVar.field_fileId, dVar.field_fileUrl);
                if (dVar.field_retCode != 0) {
                    this.f188341d.mo11853b(nVar);
                    return 0;
                }
                C65453p pVar = this.f188341d;
                String str3 = dVar.field_fileUrl;
                C87412m.m108593f(str3, "sceneResult.field_fileUrl");
                pVar.getClass();
                pVar.f188339g = str3;
                this.f188341d.mo11853b(C65234n.OK);
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

    public C65453p(String str) {
        C87412m.m108594g(str, "path");
        this.f188338f = str;
    }

    /* renamed from: a */
    public void mo11852a() {
        this.f188339g = "";
        if (!C86013q1.m106450k(this.f188338f)) {
            Log.m105918d("Finder.UploadActivityCoverTask", "path " + this.f188338f + " is not file");
            mo11853b(C65234n.Fail);
            return;
        }
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_FinderUploadCoverImageTask";
        gVar.f287662f = this.f188340h;
        gVar.field_mediaId = MD5Util.getMD5String(this.f188338f);
        gVar.field_fullpath = this.f188338f;
        gVar.field_thumbpath = C63289e.C63290a.m74586a(((C61381b) C86312j.m106911c(C61381b.class)).Xs0(), this.f188338f, (zr4) null, 2, (Object) null);
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
        return this.f188338f;
    }
}
