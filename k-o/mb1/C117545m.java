package mb1;

import au1.C0222b;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import lb1.C117473c;
import mb1.C109601i;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import tc2.C118418g;

/* renamed from: mb1.m */
public class C117545m {

    /* renamed from: a */
    public String f351665a;

    /* renamed from: b */
    public float f351666b;

    /* renamed from: c */
    public int f351667c;

    /* renamed from: d */
    public int f351668d;

    /* renamed from: e */
    public int f351669e;

    /* renamed from: f */
    public C109608a f351670f;

    /* renamed from: g */
    public byte[] f351671g;

    /* renamed from: h */
    public long f351672h = System.currentTimeMillis();

    /* renamed from: mb1.m$a */
    public interface C109608a {
    }

    /* renamed from: mb1.m$b */
    public class C109609b implements C98124g.C98125a {

        /* renamed from: d */
        public String f328153d;

        public C109609b(String str, String str2, C109605k kVar) {
            this.f328153d = str;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C98121d dVar2 = dVar;
            Log.m105925i("MicroMsg.FaceCheckVideoRecordMgr", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar2);
            int i2 = dVar2 == null ? -1 : dVar2.field_retCode;
            C0222b.m164c().f9716i = i2;
            C0222b.m164c().f9718k = System.currentTimeMillis() - C117545m.this.f351672h;
            C0222b.m173l("rspCdn", Integer.valueOf(i2));
            if (dVar2 != null && dVar2.field_retCode == 0) {
                Log.m105924i("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video done. now upload");
                C117545m mVar = C117545m.this;
                String str2 = this.f328153d;
                String str3 = dVar2.field_fileId;
                String str4 = dVar2.field_aesKey;
                C109608a aVar = mVar.f351670f;
                if (aVar != null) {
                    byte[] bArr = mVar.f351671g;
                    Log.m105925i("MicroMsg.FaceCheckActionMgr", "onUploadFinish, fileName: %s, fileId: %s, aesKey: %s", str2, str2, str3, str4);
                    C115669n.INSTANCE.idkeyStat(917, 50, 1, false);
                    C109603j jVar = C109601i.this.f328123g;
                    jVar.getClass();
                    Log.m105925i("MicroMsg.FaceCheckActionMgr", "requestCheckAction, fileName: %s, fileId: %s, aesKey: %s needSignContract:%s ", str2, str3, str4, Boolean.valueOf(jVar.f328145z));
                    C0222b.m172k("reqVerify");
                    C117473c cVar2 = new C117473c(jVar.f328133n, jVar.f328134o, jVar.f328135p, str3, str4, jVar.f328128f, jVar.f328136q, jVar.f328129g, bArr, jVar.f328145z, 1, 0, 0.0d, 0.0d);
                    C86709a0.m107524d().mo123455a(2726, jVar);
                    C86709a0.m107524d().mo123460f(cVar2);
                }
            } else if (dVar2 != null) {
                Log.m105929w("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar2);
                C86013q1.m106447h(this.f328153d);
                C115669n.INSTANCE.idkeyStat(917, 51, 1, false);
                C109608a aVar2 = C117545m.this.f351670f;
                if (aVar2 != null) {
                    ((C109601i.C109602a) aVar2).mo160809a();
                }
                return 0;
            } else if (i != 0) {
                Log.m105929w("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar2);
                C115669n.INSTANCE.idkeyStat(917, 51, 1, false);
                C86013q1.m106447h(this.f328153d);
                C109608a aVar3 = C117545m.this.f351670f;
                if (aVar3 != null) {
                    ((C109601i.C109602a) aVar3).mo160809a();
                }
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    public C117545m(String str, float f, int i, int i2, int i3) {
        this.f351665a = str;
        this.f351666b = f;
        this.f351667c = i;
        this.f351668d = i2;
        this.f351669e = i3;
        Log.m105925i("MicroMsg.FaceCheckVideoRecordMgr", "create FaceCheckVideoRecordMgr, reductionRatio: %s, orientation: %s, cameraFrameWidth: %s, cameraFrameHeight: %s", Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: a */
    public final void mo182279a(String str) {
        String q = C86013q1.m106456q(str);
        Log.m105925i("MicroMsg.FaceCheckVideoRecordMgr", "MD5ForSignatureString：%s", q);
        byte[] bytes = q.getBytes();
        PByteArray pByteArray = new PByteArray();
        if (C118418g.INSTANCE.mo175808ZU(1, bytes, 0, bytes.length, pByteArray)) {
            this.f351671g = pByteArray.value;
            return;
        }
        Log.m105924i("MicroMsg.FaceCheckVideoRecordMgr", "digitalSignature failed");
        this.f351671g = bytes;
    }

    /* renamed from: b */
    public final void mo182280b(String str) {
        Log.m105925i("MicroMsg.FaceCheckVideoRecordMgr", "doUploadVideoFile: %s", str);
        this.f351672h = System.currentTimeMillis();
        String str2 = this.f351665a;
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_FaceCheckVideoRecordMgr";
        gVar.f287662f = new C109609b(str, str2, (C109605k) null);
        gVar.field_mediaId = C85191v.m105068g(str);
        gVar.field_fullpath = str;
        gVar.field_thumbpath = "";
        gVar.field_fileType = 5;
        gVar.field_talker = "";
        gVar.field_priority = 2;
        gVar.field_needStorage = false;
        gVar.field_isStreamMedia = false;
        gVar.field_appType = 1;
        gVar.field_bzScene = 0;
        gVar.field_largesvideo = 0;
        gVar.f287663g = 5;
        C0222b.m172k("reqCdn");
        if (!((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar)) {
            Log.m105921e("MicroMsg.FaceCheckVideoRecordMgr", "hy: video task info failed. clientid:%s", gVar.field_mediaId);
            C86013q1.m106447h(str);
            C0222b.m172k("cdnFailTask");
            C109608a aVar = this.f351670f;
            if (aVar != null) {
                ((C109601i.C109602a) aVar).mo160809a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo182281c(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "AES"
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r7)
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            r7.<init>((java.lang.String) r8)
            boolean r8 = r1.mo119967g()
            if (r8 == 0) goto L_0x00b5
            boolean r8 = r1.mo119978p()
            if (r8 == 0) goto L_0x00b5
            com.tencent.mm.vfs.m1 r8 = r7.mo119974l()
            boolean r8 = r8.mo119967g()
            if (r8 != 0) goto L_0x0029
            com.tencent.mm.vfs.m1 r8 = r7.mo119974l()
            r8.mo119987x()
        L_0x0029:
            r7.mo119964e()
            r8 = 0
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106422D(r1)     // Catch:{ Exception -> 0x009e, all -> 0x0098 }
            java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106426H(r7)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            java.lang.String r2 = "UTF-8"
            byte[] r2 = r6.getBytes(r2)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            byte[] r2 = r3.getEncoded()     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            java.lang.String r0 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r6 = 1
            r0.init(r6, r3, r2)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x0082 }
        L_0x0065:
            int r0 = r6.read(r8)     // Catch:{ Exception -> 0x0082 }
            r2 = -1
            if (r0 == r2) goto L_0x0074
            r2 = 0
            r7.write(r8, r2, r0)     // Catch:{ Exception -> 0x0082 }
            r7.flush()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0065
        L_0x0074:
            if (r7 == 0) goto L_0x0079
            r7.close()
        L_0x0079:
            r6.close()
            if (r1 == 0) goto L_0x00b5
            r1.close()
            goto L_0x00b5
        L_0x0082:
            r8 = move-exception
            goto L_0x00a3
        L_0x0084:
            r6 = move-exception
            r4 = r8
            r8 = r6
            r6 = r4
            goto L_0x00a5
        L_0x0089:
            r6 = move-exception
            r4 = r8
            r8 = r6
            r6 = r4
            goto L_0x00a3
        L_0x008e:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            goto L_0x00a5
        L_0x0093:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            goto L_0x00a3
        L_0x0098:
            r6 = move-exception
            r7 = r8
            r1 = r7
            r8 = r6
            r6 = r1
            goto L_0x00a5
        L_0x009e:
            r6 = move-exception
            r7 = r8
            r1 = r7
            r8 = r6
            r6 = r1
        L_0x00a3:
            throw r8     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r8 = move-exception
        L_0x00a5:
            if (r7 == 0) goto L_0x00aa
            r7.close()
        L_0x00aa:
            if (r6 == 0) goto L_0x00af
            r6.close()
        L_0x00af:
            if (r1 == 0) goto L_0x00b4
            r1.close()
        L_0x00b4:
            throw r8
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb1.C117545m.mo182281c(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
