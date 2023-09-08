package vi0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import p1081gi.C98124g;
import p663qo.C101213l;

/* renamed from: vi0.b */
public class C22759b {

    /* renamed from: a */
    public Vector<C22763e> f65470a = new Vector<>();

    /* renamed from: b */
    public Vector<C22762d> f65471b = new Vector<>();

    /* renamed from: c */
    public C98124g.C98125a f65472c = new C22760a();

    /* renamed from: vi0.b$a */
    public class C22760a implements C98124g.C98125a {
        public C22760a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
        /* renamed from: g0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1773g0(java.lang.String r22, int r23, p1081gi.C98120c r24, p1081gi.C98121d r25, boolean r26) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r2 = r23
                r3 = r24
                r4 = r25
                r5 = 4
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r7 = 0
                r6[r7] = r1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r23)
                r9 = 1
                r6[r9] = r8
                java.lang.String r8 = "null"
                if (r3 != 0) goto L_0x001d
                r10 = r8
                goto L_0x0021
            L_0x001d:
                java.lang.String r10 = r24.toString()
            L_0x0021:
                r11 = 2
                r6[r11] = r10
                if (r4 != 0) goto L_0x0027
                goto L_0x002b
            L_0x0027:
                java.lang.String r8 = r25.toString()
            L_0x002b:
                r10 = 3
                r6[r10] = r8
                java.lang.String r8 = "MicroMsg.AppbrandCdnService"
                java.lang.String r12 = "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r6)
                vi0.c r6 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.zx0()
                r6.getClass()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
                r13 = 0
                if (r12 == 0) goto L_0x004c
                java.lang.String r6 = "MicroMsg.AppbrandMediaCdnItemManager"
                java.lang.String r12 = "getItemByMediaID error, media id is null or nil"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r12)
            L_0x004a:
                r12 = r13
                goto L_0x006e
            L_0x004c:
                java.util.HashMap<java.lang.String, vi0.a> r6 = r6.f65474a
                java.util.Collection r6 = r6.values()
                java.util.Iterator r6 = r6.iterator()
            L_0x0056:
                boolean r12 = r6.hasNext()
                if (r12 == 0) goto L_0x004a
                java.lang.Object r12 = r6.next()
                vi0.a r12 = (vi0.C22757a) r12
                java.lang.String r14 = r12.f65467d
                java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r14)
                boolean r14 = r14.equals(r1)
                if (r14 == 0) goto L_0x0056
            L_0x006e:
                if (r12 != 0) goto L_0x007a
                java.lang.Object[] r2 = new java.lang.Object[r9]
                r2[r7] = r1
                java.lang.String r1 = "get item by media id failed, media is : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r1, r2)
                return r7
            L_0x007a:
                r6 = -21005(0xffffffffffffadf3, float:NaN)
                if (r2 != r6) goto L_0x0088
                java.lang.Object[] r2 = new java.lang.Object[r9]
                r2[r7] = r1
                java.lang.String r1 = "duplicate request, ignore this request, media id is %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r2)
                return r7
            L_0x0088:
                if (r2 == 0) goto L_0x00a4
                java.lang.Object[] r3 = new java.lang.Object[r11]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
                r3[r7] = r2
                r3[r9] = r1
                java.lang.String r1 = "start failed : %d, media id is :%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r1, r3)
                vi0.b r1 = vi0.C22759b.this
                java.lang.String r2 = r12.f65464a
                java.lang.String r3 = r12.f65467d
                vi0.C22759b.m26656a(r1, r7, r2, r3, r13)
                return r7
            L_0x00a4:
                if (r3 == 0) goto L_0x0126
                java.lang.Object[] r1 = new java.lang.Object[r9]
                java.lang.String r2 = r24.toString()
                r1[r7] = r2
                java.lang.String r2 = "progressInfo : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r1)
                long r1 = r3.field_toltalLength
                r13 = 100
                r15 = 0
                int r4 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
                if (r4 <= 0) goto L_0x00c3
                long r3 = r3.field_finishedLength
                long r3 = r3 * r13
                long r3 = r3 / r1
                goto L_0x00c4
            L_0x00c3:
                r3 = r15
            L_0x00c4:
                int r1 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
                if (r1 >= 0) goto L_0x00ca
                r13 = r15
                goto L_0x00d0
            L_0x00ca:
                int r1 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                if (r1 <= 0) goto L_0x00cf
                goto L_0x00d0
            L_0x00cf:
                r13 = r3
            L_0x00d0:
                vi0.b r1 = vi0.C22759b.this
                boolean r2 = r12.f65469f
                int r3 = (int) r13
                java.lang.String r4 = r12.f65464a
                java.lang.String r6 = r12.f65467d
                r1.getClass()
                r12 = 5
                java.lang.Object[] r12 = new java.lang.Object[r12]
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
                r12[r7] = r13
                java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
                r12[r9] = r13
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                r12[r11] = r9
                r12[r10] = r4
                r12[r5] = r6
                java.lang.String r5 = "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r12)
                java.util.Vector<vi0.d> r5 = r1.f65471b
                if (r5 == 0) goto L_0x0125
                int r5 = r5.size()
                if (r5 <= 0) goto L_0x0125
                java.util.Vector<vi0.d> r1 = r1.f65471b
                java.util.Iterator r1 = r1.iterator()
            L_0x010a:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0125
                java.lang.Object r5 = r1.next()
                r15 = r5
                vi0.d r15 = (vi0.C22762d) r15
                r17 = 0
                r16 = r2
                r18 = r3
                r19 = r4
                r20 = r6
                r15.mo22159R(r16, r17, r18, r19, r20)
                goto L_0x010a
            L_0x0125:
                return r7
            L_0x0126:
                if (r4 == 0) goto L_0x0184
                int r2 = r4.field_retCode
                if (r2 == 0) goto L_0x0147
                java.lang.Object[] r3 = new java.lang.Object[r10]
                r3[r7] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r3[r9] = r1
                r3[r11] = r4
                java.lang.String r1 = "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r1, r3)
                vi0.b r1 = vi0.C22759b.this
                java.lang.String r2 = r12.f65464a
                java.lang.String r3 = r12.f65467d
                vi0.C22759b.m26656a(r1, r7, r2, r3, r13)
                goto L_0x0184
            L_0x0147:
                java.lang.Object[] r2 = new java.lang.Object[r9]
                r2[r7] = r1
                java.lang.String r1 = "cdn trans suceess, media id : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r2)
                vi0.a$a r1 = r12.f65468e
                if (r1 != 0) goto L_0x015b
                vi0.a$a r1 = new vi0.a$a
                r1.<init>()
                r12.f65468e = r1
            L_0x015b:
                vi0.a$a r1 = r12.f65468e
                java.lang.String r2 = r4.field_aesKey
                r1.field_aesKey = r2
                java.lang.String r2 = r4.field_fileId
                r1.field_fileId = r2
                java.lang.String r3 = r4.field_fileUrl
                r1.field_fileUrl = r3
                long r3 = r4.field_fileLength
                int r4 = (int) r3
                r1.field_fileLength = r4
                r12.f65466c = r2
                vi0.c r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.zx0()
                r1.mo35859a(r12)
                vi0.b r1 = vi0.C22759b.this
                java.lang.String r2 = r12.f65464a
                java.lang.String r3 = r12.f65466c
                vi0.a$a r4 = r12.f65468e
                java.lang.String r4 = r4.field_fileUrl
                vi0.C22759b.m26656a(r1, r9, r2, r3, r4)
            L_0x0184:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: vi0.C22759b.C22760a.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            Log.m105925i("MicroMsg.AppbrandCdnService", "getCdnAuthInfo, mediaId = %s", str);
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            Log.m105925i("MicroMsg.AppbrandCdnService", "decodePrepareResponse, mediaId = %s", str);
            return null;
        }
    }

    public C22759b() {
        new HashMap();
    }

    /* renamed from: a */
    public static void m26656a(C22759b bVar, boolean z, String str, String str2, String str3) {
        Vector<C22763e> vector = bVar.f65470a;
        if (vector != null && vector.size() > 0) {
            Iterator<C22763e> it = bVar.f65470a.iterator();
            while (it.hasNext()) {
                it.next().mo22160a(z, str, str2, str3);
            }
        }
    }

    /* renamed from: b */
    public boolean mo35858b(String str) {
        C22757a aVar;
        C22761c zx02 = C81161g2.zx0();
        zx02.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppbrandMediaCdnItemManager", "get by local id error, local id is null or nil");
            aVar = null;
        } else {
            aVar = zx02.f65474a.get(str);
        }
        if (aVar != null) {
            return ((C101213l) C86312j.m106911c(C101213l.class)).gn0(aVar.f65467d);
        }
        Log.m105921e("MicroMsg.AppbrandCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", str);
        return false;
    }
}
