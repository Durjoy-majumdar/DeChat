package wz0;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import hz0.C76251l;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;

/* renamed from: wz0.a */
public class C78740a {

    /* renamed from: a */
    public static List<WeakReference<C78742b>> f230442a = new ArrayList();

    /* renamed from: wz0.a$a */
    public class C78741a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ String f230443d;

        /* renamed from: e */
        public final /* synthetic */ String f230444e;

        public C78741a(String str, String str2) {
            this.f230443d = str;
            this.f230444e = str2;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C78742b bVar;
            C78742b bVar2;
            C78742b bVar3;
            C78742b bVar4;
            if (i == -21005) {
                Log.m105925i("MicroMsg.CDNDownloadHelpper", "duplicate request, ignore this request, media id is %s", str);
                return 0;
            } else if (i != 0) {
                Log.m105921e("MicroMsg.CDNDownloadHelpper", "start failed : %d, media id is :%s", Integer.valueOf(i), str);
                for (int i2 = 0; i2 < ((ArrayList) C78740a.f230442a).size(); i2++) {
                    WeakReference weakReference = (WeakReference) ((ArrayList) C78740a.f230442a).get(i2);
                    if (!(weakReference == null || (bVar4 = (C78742b) weakReference.get()) == null)) {
                        bVar4.mo23387J6(this.f230443d);
                    }
                }
                return 0;
            } else if (cVar != null) {
                Log.m105925i("MicroMsg.CDNDownloadHelpper", "progressInfo : %s", cVar.toString());
                long j = cVar.field_toltalLength;
                long j2 = 100;
                long j3 = j > 0 ? (cVar.field_finishedLength * 100) / j : 0;
                if (j3 < 0) {
                    j2 = 0;
                } else if (j3 <= 100) {
                    j2 = j3;
                }
                for (int i3 = 0; i3 < ((ArrayList) C78740a.f230442a).size(); i3++) {
                    WeakReference weakReference2 = (WeakReference) ((ArrayList) C78740a.f230442a).get(i3);
                    if (!(weakReference2 == null || (bVar3 = (C78742b) weakReference2.get()) == null)) {
                        bVar3.mo23389q5(this.f230443d, (int) j2, 100);
                    }
                }
                return 0;
            } else {
                if (dVar != null) {
                    int i4 = dVar.field_retCode;
                    if (i4 != 0) {
                        Log.m105921e("MicroMsg.CDNDownloadHelpper", "cdntra clientid:%s , sceneResult.retCode:%d , sceneResult[%s]", str, Integer.valueOf(i4), dVar);
                        for (int i5 = 0; i5 < ((ArrayList) C78740a.f230442a).size(); i5++) {
                            WeakReference weakReference3 = (WeakReference) ((ArrayList) C78740a.f230442a).get(i5);
                            if (!(weakReference3 == null || (bVar2 = (C78742b) weakReference3.get()) == null)) {
                                bVar2.mo23387J6(this.f230443d);
                            }
                        }
                    } else {
                        Log.m105925i("MicroMsg.CDNDownloadHelpper", "cdn trans suceess, sceneResult[%s]", dVar);
                        for (int i6 = 0; i6 < ((ArrayList) C78740a.f230442a).size(); i6++) {
                            WeakReference weakReference4 = (WeakReference) ((ArrayList) C78740a.f230442a).get(i6);
                            if (!(weakReference4 == null || (bVar = (C78742b) weakReference4.get()) == null)) {
                                bVar.mo23388j5(this.f230443d, this.f230444e);
                            }
                        }
                    }
                }
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            Log.m105925i("MicroMsg.CDNDownloadHelpper", "getCdnAuthInfo, mediaId = %s", str);
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            Log.m105925i("MicroMsg.CDNDownloadHelpper", "decodePrepareResponse, mediaId = %s", str);
            return null;
        }
    }

    /* renamed from: wz0.a$b */
    public interface C78742b {
        /* renamed from: J6 */
        void mo23387J6(String str);

        /* renamed from: j5 */
        void mo23388j5(String str, String str2);

        /* renamed from: q5 */
        void mo23389q5(String str, int i, int i2);
    }

    /* renamed from: a */
    public static void m95079a(String str, String str2, int i, int i2) {
        String str3;
        C78742b bVar;
        C78742b bVar2;
        if (str == null || str2 == null || i == 0) {
            Log.m105920e("MicroMsg.CDNDownloadHelpper", "the params is wrongful");
            return;
        }
        String mD5String = MD5Util.getMD5String(str);
        C86009m1 m1Var = new C86009m1(C76251l.f223367c);
        if (!m1Var.mo119987x()) {
            Log.m105924i("MicroMsg.CDNDownloadHelpper", "mkdirs failed.File is exist = " + m1Var.mo119967g());
        }
        String str4 = i2 == 2 ? ".jpeg" : ".mp4";
        if (m1Var.mo119971i().endsWith("/")) {
            str3 = m1Var.mo119971i() + mD5String + str4;
        } else {
            str3 = m1Var.mo119971i() + "/" + mD5String + str4;
        }
        int i3 = 0;
        Log.m105925i("MicroMsg.CDNDownloadHelpper", "get file path from capture file name : %s == %s", mD5String, str3);
        Log.m105925i("MicroMsg.CDNDownloadHelpper", "before downloadVideoFromCDN fieldId:%s, aseKey:%s, dataLength:%d, type:%d, filePath:%s", str, str2, Integer.valueOf(i), Integer.valueOf(i2), str3);
        Log.m105924i("MicroMsg.CDNDownloadHelpper", "read file length = " + C86013q1.m106451l(str3));
        if (!C86013q1.m106450k(str3) || C86013q1.m106451l(str3) != ((long) i)) {
            Log.m105925i("MicroMsg.CDNDownloadHelpper", "filePath:%s is't exist, so download from CDN", str3);
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_CDNDownloadHelpper";
            gVar.f287662f = new C78741a(str, str3);
            gVar.f287661e = false;
            gVar.field_mediaId = C1297x.m1387b("cardgiftfile", Util.nowMilliSecond(), str, str);
            gVar.field_fullpath = str3;
            gVar.field_totalLen = i;
            gVar.field_fileType = CdnLogic.kMediaTypeBeatificFile;
            gVar.field_fileId = str;
            gVar.field_aesKey = str2;
            gVar.field_priority = 2;
            gVar.field_needStorage = true;
            boolean xf02 = ((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar);
            Log.m105925i("MicroMsg.CDNDownloadHelpper", "add download cdn task : %b, fileId : %s", Boolean.valueOf(xf02), gVar.field_fileId);
            if (!xf02) {
                while (i3 < ((ArrayList) f230442a).size()) {
                    WeakReference weakReference = (WeakReference) ((ArrayList) f230442a).get(i3);
                    if (!(weakReference == null || (bVar = (C78742b) weakReference.get()) == null)) {
                        bVar.mo23387J6(str);
                    }
                    i3++;
                }
                Log.m105920e("MicroMsg.CDNDownloadHelpper", "can't download from cdn!!!");
                return;
            }
            return;
        }
        while (i3 < ((ArrayList) f230442a).size()) {
            WeakReference weakReference2 = (WeakReference) ((ArrayList) f230442a).get(i3);
            if (!(weakReference2 == null || (bVar2 = (C78742b) weakReference2.get()) == null)) {
                bVar2.mo23388j5(str, str3);
            }
            i3++;
        }
    }

    /* renamed from: b */
    public static void m95080b(C78742b bVar) {
        if (f230442a == null) {
            f230442a = new ArrayList();
        }
        if (bVar == null) {
            Log.m105920e("MicroMsg.CDNDownloadHelpper", "ICDNDownloadCallback is null");
            return;
        }
        Log.m105925i("MicroMsg.CDNDownloadHelpper", "register:%d", Integer.valueOf(bVar.hashCode()));
        f230442a.add(new WeakReference(bVar));
    }

    /* renamed from: c */
    public static void m95081c(C78742b bVar) {
        C78742b bVar2;
        if (f230442a != null && bVar != null) {
            int i = 0;
            Log.m105925i("MicroMsg.CDNDownloadHelpper", "unregister:%d", Integer.valueOf(bVar.hashCode()));
            while (i < f230442a.size()) {
                WeakReference weakReference = f230442a.get(i);
                if (weakReference == null || (bVar2 = (C78742b) weakReference.get()) == null || !bVar2.equals(bVar)) {
                    i++;
                } else {
                    f230442a.remove(weakReference);
                    return;
                }
            }
        }
    }
}
