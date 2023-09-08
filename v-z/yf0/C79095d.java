package yf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import p823sg.C90193h;

/* renamed from: yf0.d */
public class C79095d {

    /* renamed from: a */
    public C79097b f232243a;

    /* renamed from: b */
    public String f232244b;

    /* renamed from: c */
    public String f232245c;

    /* renamed from: d */
    public long f232246d;

    /* renamed from: e */
    public C98124g.C98125a f232247e;

    /* renamed from: yf0.d$a */
    public class C79096a implements C98124g.C98125a {
        public C79096a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            String str2 = str;
            int i2 = i;
            C98121d dVar2 = dVar;
            if (i2 == -21005) {
                Log.m105919d("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str2, Integer.valueOf(i), cVar, dVar2);
                return 0;
            } else if (dVar2 != null && dVar2.field_retCode == 0) {
                Log.m105925i("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str2, Integer.valueOf(i), cVar, dVar2);
                C79097b bVar = C79095d.this.f232243a;
                String str3 = dVar2.field_fileUrl;
                String str4 = dVar2.field_thumbUrl;
                bVar.mo93834a(str3, 1, str4, 1, "upload_" + str2, dVar2.field_filemd5);
                Log.m105924i("MicroMsg.Aa.AAImagUpload", "uploadsns cdndone pass: " + (System.currentTimeMillis() - C79095d.this.f232246d) + " " + dVar2.field_filemd5);
                return 0;
            } else if (dVar2 != null && dVar2.field_retCode != 0) {
                Log.m105925i("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str2, Integer.valueOf(i), cVar, dVar2);
                C79095d.this.f232243a.mo93835e(3, -1, "doScene failed");
                return 0;
            } else if (i2 != 0) {
                Log.m105925i("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str2, Integer.valueOf(i), cVar, dVar2);
                C79095d.this.f232243a.mo93835e(3, -1, "doScene failed");
                return 0;
            } else {
                Log.m105919d("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str2, Integer.valueOf(i), cVar, dVar2);
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }
    }

    /* renamed from: yf0.d$b */
    public interface C79097b {
        /* renamed from: a */
        void mo93834a(String str, int i, String str2, int i2, String str3, String str4);

        /* renamed from: e */
        void mo93835e(int i, int i2, String str);
    }

    public C79095d(String str, C79097b bVar) {
        this.f232246d = 0;
        this.f232247e = new C79096a();
        this.f232246d = System.currentTimeMillis();
        this.f232244b = str;
        this.f232243a = bVar;
        String f = Util.isNullOrNil(str) ? "" : C90193h.m112878f(this.f232244b.getBytes());
        this.f232245c = f;
        Log.m105925i("MicroMsg.Aa.AAImagUpload", "AAImagUpload imgPath:%s mediaId:%s", str, f);
    }

    /* renamed from: a */
    public boolean mo109030a() {
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_AAImagUpload";
        gVar.f287662f = this.f232247e;
        gVar.field_mediaId = this.f232245c;
        gVar.field_fullpath = this.f232244b;
        gVar.field_thumbpath = "";
        gVar.field_fileType = 20301;
        gVar.field_talker = "";
        gVar.field_priority = 2;
        gVar.field_needStorage = true;
        gVar.field_isStreamMedia = false;
        gVar.field_appType = 249;
        gVar.field_bzScene = 2;
        if (((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar)) {
            return true;
        }
        Log.m105921e("MicroMsg.Aa.AAImagUpload", "cdntra addSendTask failed. mediaId:%s", this.f232245c);
        return false;
    }
}
