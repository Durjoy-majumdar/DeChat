package hd0;

import bp3.C104160f;
import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fd3.C97867h;
import h81.C32735h;
import ig3.C98692n;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p1081gi.C98121d;
import p753xp.C102704b;
import p867wp.C102479b;
import sf0.C90188n0;
import te3.C52197z04;
import uf0.C102015b;
import uf0.C102016c;
import xc3.C102616b;
import xc3.C102617c;

/* renamed from: hd0.v */
public class C98435v extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f288698d;

    /* renamed from: e */
    public C47350c f288699e;

    /* renamed from: f */
    public String f288700f = null;

    /* renamed from: g */
    public int f288701g;

    /* renamed from: h */
    public String f288702h;

    /* renamed from: i */
    public C98121d f288703i;

    /* renamed from: j */
    public C92834j f288704j;

    /* renamed from: n */
    public C98408n0 f288705n;

    /* renamed from: o */
    public String f288706o;

    /* renamed from: p */
    public C98408n0 f288707p;

    /* renamed from: q */
    public C98121d f288708q;

    /* renamed from: r */
    public C102616b f288709r;

    /* renamed from: s */
    public C97867h.C97868a f288710s;

    public C98435v(String str, int i, C98121d dVar, C92834j jVar) {
        boolean z = false;
        this.f288701g = 0;
        this.f288703i = null;
        this.f288704j = null;
        this.f288710s = new v$$b(this);
        Assert.assertTrue(str != null);
        Assert.assertTrue(jVar != null ? true : z);
        this.f288700f = str;
        this.f288703i = dVar;
        this.f288704j = jVar;
        this.f288701g = i;
    }

    /* renamed from: j1 */
    public static int m127850j1(C98435v vVar) {
        int i;
        int i2;
        C98435v vVar2 = vVar;
        vVar.getClass();
        String q = C98398h0.Bx0().mo137728q(vVar2.f288705n.mo137700d());
        if (!C102016c.m134339a(q)) {
            Log.m105929w("MicroMsg.NetSceneUploadVideoOriginCgi", "%s check preload length but it not mp4.", vVar.mo137769m1());
            return 0;
        }
        C102015b bVar = new C102015b();
        long a = bVar.mo141510a(q);
        long j = bVar.f300397a;
        if (a < 131072 && a > 0 && (i2 = vVar2.f288705n.f288566m) > 5) {
            long j2 = bVar.f300398b;
            if (j2 > 0 && j > 0) {
                i = ((int) j) + ((int) ((j2 * 5) / ((long) i2)));
                if (i <= 131072) {
                    i += 131072;
                }
                Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s check preload length[%d] moovPos[%d %d] duration[%d] filelen[%d]", vVar.mo137769m1(), Integer.valueOf(i), Long.valueOf(a), Long.valueOf(j), Integer.valueOf(vVar2.f288705n.f288566m), Long.valueOf(bVar.f300398b));
                return i;
            }
        }
        i = 0;
        Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s check preload length[%d] moovPos[%d %d] duration[%d] filelen[%d]", vVar.mo137769m1(), Integer.valueOf(i), Long.valueOf(a), Long.valueOf(j), Integer.valueOf(vVar2.f288705n.f288566m), Long.valueOf(bVar.f300398b));
        return i;
    }

    public void cancel() {
        C102616b bVar = this.f288709r;
        if (bVar != null) {
            bVar.mo137190c();
        }
        super.cancel();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r18, ob0.C11385n r19) {
        /*
            r17 = this;
            r6 = r17
            java.lang.String r0 = r6.f288700f
            hd0.n0 r0 = hd0.C98429r0.m127818i(r0)
            java.lang.String r7 = "MicroMsg.NetSceneUploadVideoOriginCgi"
            if (r0 != 0) goto L_0x002a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Get info Failed file:"
            r0.append(r1)
            java.lang.String r1 = r6.f288700f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            com.tencent.mm.modelimage.j r0 = r6.f288704j
            r1 = 3
            r2 = -1
            r0.mo127120a(r1, r2)
            return r2
        L_0x002a:
            r6.f288705n = r0
            r1 = r19
            r6.f288698d = r1
            boolean r1 = hd0.C98429r0.m127831v()
            r8 = 0
            if (r1 == 0) goto L_0x0253
            gi.d r1 = r6.f288703i
            if (r1 != 0) goto L_0x003d
            goto L_0x0253
        L_0x003d:
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.y04 r2 = new te3.y04
            r2.<init>()
            r1.f127066a = r2
            te3.z04 r2 = new te3.z04
            r2.<init>()
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/sendvideouploadmsg"
            r1.f127068c = r2
            r2 = 6828(0x1aac, float:9.568E-42)
            r1.f127069d = r2
            r2 = 39
            r1.f127070e = r2
            r2 = 1000000039(0x3b9aca27, float:0.0047238055)
            r1.f127071f = r2
            ob0.c r1 = r1.mo72403a()
            r6.f288699e = r1
            ob0.c$c r1 = r1.f127055a
            pe3.a r1 = r1.f127080a
            te3.y04 r1 = (te3.C101869y04) r1
            java.lang.String r2 = r6.f288700f
            r1.f299900d = r2
            java.lang.String r2 = eb0.C75592q0.m90789s()
            r1.f299901e = r2
            gi.d r2 = r6.f288703i
            java.lang.String r3 = r2.field_toUser
            r1.f299902f = r3
            java.lang.String r3 = r2.field_fileId
            r1.f299903g = r3
            java.lang.String r3 = r2.field_aesKey
            r1.f299904h = r3
            int r2 = r2.field_thumbimgLength
            r1.f299905i = r2
            hd0.o0 r2 = hd0.C98398h0.Bx0()
            java.lang.String r3 = r6.f288700f
            java.lang.String r2 = r2.mo137729r(r3)
            android.graphics.BitmapFactory$Options r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r2)
            r4 = 1
            if (r3 == 0) goto L_0x00a3
            int r2 = r3.outWidth
            r1.f299907n = r2
            int r2 = r3.outHeight
            r1.f299906j = r2
            goto L_0x00ac
        L_0x00a3:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r8] = r2
            java.lang.String r2 = "cdntra getImageOptions for thumb failed path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r2, r3)
        L_0x00ac:
            int r2 = r0.f288566m
            r1.f299908o = r2
            java.lang.String r2 = r6.f288700f
            hd0.n0 r2 = hd0.C98429r0.m127818i(r2)
            r3 = 0
            if (r2 == 0) goto L_0x00fe
            java.lang.String r5 = r2.f288542J
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x00c4
            java.lang.String r2 = r2.f288542J
            goto L_0x00ff
        L_0x00c4:
            long r9 = r2.f288541I
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x00e9
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)     // Catch:{ all -> 0x00e7 }
            f62.k0 r5 = (f62.C75700k0) r5     // Catch:{ all -> 0x00e7 }
            g62.l r5 = r5.mo96095LE()     // Catch:{ all -> 0x00e7 }
            long r9 = r2.f288541I     // Catch:{ all -> 0x00e7 }
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5     // Catch:{ all -> 0x00e7 }
            com.tencent.mm.storage.f4 r2 = r5.b00(r9)     // Catch:{ all -> 0x00e7 }
            java.lang.String r2 = r2.f230724G     // Catch:{ all -> 0x00e7 }
            java.lang.String r2 = eb0.C75569c4.m90685r(r2)     // Catch:{ all -> 0x00e7 }
            goto L_0x00ff
        L_0x00e7:
            goto L_0x00fe
        L_0x00e9:
            java.lang.String r2 = r2.mo137702f()
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106456q(r2)
            java.lang.Class<gw.k> r5 = p159gw.C98252k.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            gw.k r5 = (p159gw.C98252k) r5
            java.lang.String r2 = r5.pc0(r2)
            goto L_0x00ff
        L_0x00fe:
            r2 = r3
        L_0x00ff:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r9 = r6.f288701g
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r8] = r9
            r5[r4] = r2
            java.lang.String r9 = "createVideoMsgSource preLoadLength: %s, forward uuid %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r5)
            int r5 = r6.f288701g
            if (r5 <= 0) goto L_0x0183
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r5 <= r9) goto L_0x011a
            goto L_0x0183
        L_0x011a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "<msgsource>"
            r5.append(r9)
            java.lang.String r9 = "<videopreloadlen>"
            r5.append(r9)
            int r9 = r6.f288701g
            r5.append(r9)
            java.lang.String r9 = "</videopreloadlen>"
            r5.append(r9)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r9 != 0) goto L_0x016c
            java.lang.String r9 = "<"
            r5.append(r9)
            java.lang.String r10 = "sec_msg_node"
            r5.append(r10)
            java.lang.String r11 = ">"
            r5.append(r11)
            r5.append(r9)
            java.lang.String r9 = "uuid"
            r5.append(r9)
            r5.append(r11)
            r5.append(r2)
            java.lang.String r2 = "</"
            r5.append(r2)
            r5.append(r9)
            r5.append(r11)
            r5.append(r2)
            r5.append(r10)
            r5.append(r11)
        L_0x016c:
            java.lang.String r2 = "</msgsource>"
            r5.append(r2)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 354(0x162, double:1.75E-321)
            r12 = 35
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            java.lang.String r2 = r5.toString()
            goto L_0x0192
        L_0x0183:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 == 0) goto L_0x018e
            java.lang.String r2 = eb0.C75569c4.m90679l()
            goto L_0x0192
        L_0x018e:
            java.lang.String r2 = eb0.C75569c4.m90680m(r2)
        L_0x0192:
            r1.f299909p = r2
            hd0.o0 r2 = hd0.C98398h0.Bx0()
            java.lang.String r5 = r6.f288700f
            java.lang.String r2 = r2.mo137728q(r5)
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106456q(r2)
            r1.f299910q = r2
            int r2 = r0.f288566m
            r1.f299912s = r2
            gi.d r2 = r6.f288703i
            java.lang.String r2 = r2.field_fileId
            r1.f299919z = r2
            java.lang.String r2 = r0.mo137705i()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01bd
            java.lang.String r2 = r0.mo137705i()
            goto L_0x01ce
        L_0x01bd:
            java.lang.String r2 = r0.f288543K
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01cc
            java.lang.String r2 = r0.f288543K
            java.lang.String r2 = com.tencent.p014mm.modelimage.C80999a.m98902b(r2)
            goto L_0x01ce
        L_0x01cc:
            java.lang.String r2 = ""
        L_0x01ce:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 != 0) goto L_0x0226
            java.lang.String r5 = r0.mo137705i()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x01ed
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r8] = r2
            java.lang.String r5 = "uploadVideo video.recvXml is empty and update: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r4)
            r0.f288575v = r2
            hd0.C98429r0.m127808N(r0)
        L_0x01ed:
            com.tencent.mm.modelimage.a r4 = com.tencent.p014mm.modelimage.C80999a.m98903c(r2)
            if (r4 == 0) goto L_0x020b
            java.lang.String r5 = r4.f237927a
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x020b
            java.lang.String r5 = r4.f237927a
            r1.f299915v = r5
            java.lang.String r5 = r4.f237928b
            r1.f299918y = r5
            java.lang.String r5 = r4.f237930d
            r1.f299917x = r5
            java.lang.String r4 = r4.f237929c
            r1.f299916w = r4
        L_0x020b:
            java.lang.String r4 = r1.f299904h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0226
            java.lang.String r4 = "msg"
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r4, r3)
            if (r2 == 0) goto L_0x0226
            java.lang.String r3 = ".msg.videomsg.$cdnthumbaeskey"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r1.f299904h = r2
        L_0x0226:
            java.lang.String r2 = r0.f288546N
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x024a
            java.lang.String r2 = r0.f288546N
            hd0.n0 r2 = hd0.C98429r0.m127818i(r2)
            if (r2 == 0) goto L_0x024a
            hd0.o0 r3 = hd0.C98398h0.Bx0()
            java.lang.String r0 = r0.f288546N
            java.lang.String r0 = r3.mo137728q(r0)
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106456q(r0)
            r1.f299913t = r0
            int r0 = r2.f288566m
            r1.f299914u = r0
        L_0x024a:
            ob0.c r0 = r6.f288699e
            r1 = r18
            int r0 = r6.dispatch(r1, r0, r6)
            return r0
        L_0x0253:
            r1 = 3
            r2 = 0
            r4 = 0
            java.lang.String r3 = ""
            r0 = r17
            r5 = r17
            r0.mo137770n1(r1, r2, r3, r4, r5)
            java.lang.String r0 = "do not send place holder cgi, just go video upload"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98435v.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getType() {
        return 6828;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f7 A[SYNTHETIC, Splitter:B:33:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fe A[SYNTHETIC, Splitter:B:37:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0118 A[SYNTHETIC, Splitter:B:48:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011f A[SYNTHETIC, Splitter:B:52:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016c A[SYNTHETIC, Splitter:B:64:0x016c] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0173 A[SYNTHETIC, Splitter:B:68:0x0173] */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo137767k1(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r17
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r1)
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r0 = r2.mo119974l()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "send"
            r4.append(r5)
            java.lang.String r5 = r2.getName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>((com.tencent.p014mm.vfs.C86009m1) r0, (java.lang.String) r4)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            long r5 = r2.mo119980r()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "MicroMsg.NetSceneUploadVideoOriginCgi"
            java.lang.String r7 = "getSendThumbnailPath:origin file: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r7, r0)
            r7 = 0
            long r8 = r2.mo119980r()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r10 = 32768(0x8000, double:1.61895E-319)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f3
            boolean r0 = r3.mo119967g()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "dst file %s exist!"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r9 = r3.mo119971i()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r8[r6] = r9     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r0, r8)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r8 = r7
            r0 = 1
            goto L_0x00f5
        L_0x005e:
            java.lang.String r0 = r2.mo119971i()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            android.graphics.BitmapFactory$Options r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r0)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r8 = "getSendThumbnailPath:options %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            if (r0 != 0) goto L_0x0070
            java.lang.String r10 = "null"
            goto L_0x008d
        L_0x0070:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r10.<init>()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r11 = ""
            r10.append(r11)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            int r11 = r0.outWidth     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r10.append(r11)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r11 = "-"
            r10.append(r11)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            int r11 = r0.outHeight     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r10.append(r11)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
        L_0x008d:
            r9[r6] = r10     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r9)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r8 = 288(0x120, float:4.04E-43)
            if (r0 == 0) goto L_0x00cd
            int r9 = r0.outWidth     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            if (r9 > r8) goto L_0x009e
            int r0 = r0.outHeight     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            if (r0 <= r8) goto L_0x00cd
        L_0x009e:
            java.lang.String r9 = r2.mo119971i()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r10 = 288(0x120, float:4.04E-43)
            r11 = 288(0x120, float:4.04E-43)
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r13 = 60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r0.<init>()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            com.tencent.mm.vfs.m1 r8 = r3.mo119974l()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r8 = r8.mo119971i()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r0.append(r8)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r8 = "/"
            r0.append(r8)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r14 = r0.toString()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r15 = r3.getName()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail((java.lang.String) r9, (int) r10, (int) r11, (android.graphics.Bitmap.CompressFormat) r12, (int) r13, (java.lang.String) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r8 = r7
            goto L_0x00f5
        L_0x00cd:
            java.io.InputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106422D(r2)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r0 = 0
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r9, r0, r8, r8)     // Catch:{ Exception -> 0x00ef, all -> 0x00ea }
            if (r0 == 0) goto L_0x00e7
            java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106426H(r3)     // Catch:{ Exception -> 0x00ef, all -> 0x00ea }
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00ef, all -> 0x00ea }
            r10 = 60
            boolean r0 = r0.compress(r8, r10, r7)     // Catch:{ Exception -> 0x00ef, all -> 0x00ea }
            r8 = r7
            r7 = r9
            goto L_0x00f5
        L_0x00e7:
            r8 = r7
            r7 = r9
            goto L_0x00f4
        L_0x00ea:
            r0 = move-exception
            r8 = r7
            r7 = r9
            goto L_0x016a
        L_0x00ef:
            r0 = move-exception
            r8 = r7
            r7 = r9
            goto L_0x0109
        L_0x00f3:
            r8 = r7
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            if (r7 == 0) goto L_0x00fc
            r7.close()     // Catch:{ IOException -> 0x00fb }
            goto L_0x00fc
        L_0x00fb:
        L_0x00fc:
            if (r8 == 0) goto L_0x0125
            r8.close()     // Catch:{ IOException -> 0x0102 }
            goto L_0x0125
        L_0x0102:
            goto L_0x0125
        L_0x0104:
            r0 = move-exception
            r8 = r7
            goto L_0x016a
        L_0x0107:
            r0 = move-exception
            r8 = r7
        L_0x0109:
            java.lang.String r9 = "exception: %s"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0169 }
            r10[r6] = r0     // Catch:{ all -> 0x0169 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r9, r10)     // Catch:{ all -> 0x0169 }
            if (r7 == 0) goto L_0x011d
            r7.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x011d
        L_0x011c:
        L_0x011d:
            if (r8 == 0) goto L_0x0124
            r8.close()     // Catch:{ IOException -> 0x0123 }
            goto L_0x0124
        L_0x0123:
        L_0x0124:
            r0 = 0
        L_0x0125:
            r7 = 2
            r8 = 3
            if (r0 == 0) goto L_0x014b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = r16.mo137769m1()
            r0[r6] = r1
            long r1 = r3.mo119980r()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r4] = r1
            java.lang.String r1 = r3.mo119971i()
            r0[r7] = r1
            java.lang.String r1 = "%s compress success: length=%d | path=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            java.lang.String r0 = r3.mo119971i()
            return r0
        L_0x014b:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r3 = r16.mo137769m1()
            r0[r6] = r3
            long r8 = r2.mo119980r()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r0[r4] = r3
            java.lang.String r2 = r2.mo119971i()
            r0[r7] = r2
            java.lang.String r2 = "%s compress fail: origin length=%d | path=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            return r1
        L_0x0169:
            r0 = move-exception
        L_0x016a:
            if (r7 == 0) goto L_0x0171
            r7.close()     // Catch:{ IOException -> 0x0170 }
            goto L_0x0171
        L_0x0170:
        L_0x0171:
            if (r8 == 0) goto L_0x0176
            r8.close()     // Catch:{ IOException -> 0x0176 }
        L_0x0176:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98435v.mo137767k1(java.lang.String):java.lang.String");
    }

    /* renamed from: l1 */
    public final void mo137768l1(C98408n0 n0Var, C98121d dVar, C98121d dVar2) {
        C102479b bVar;
        C98408n0 i;
        C98408n0 n0Var2 = n0Var;
        C98121d dVar3 = dVar;
        C98121d dVar4 = dVar2;
        Class cls = C102704b.class;
        n0Var2.f288564k = Util.nowSecond();
        n0Var2.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
        n0Var2.f288548P = 2098436;
        C98429r0.m127808N(n0Var);
        String str = n0Var2.f288546N;
        if (C98429r0.m127830u() && dVar4 != null && !Util.isNullOrNil(str) && (i = C98429r0.m127818i(str)) != null) {
            i.f288564k = Util.nowSecond();
            i.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
            i.f288548P = 1284;
            C98429r0.m127808N(i);
        }
        C98692n.f289404a.mo138102c(this.f288700f);
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f288705n.f288567n);
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_video_retransmit_use_link_enable, C104160f.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1) {
            z = true;
        }
        if (z) {
            if (dVar3 != null) {
                String q = C98398h0.Bx0().mo137728q(this.f288700f);
                String r = C98398h0.Bx0().mo137729r(this.f288700f);
                if (C86013q1.m106450k(q)) {
                    if (Util.isNullOrNil(n0Var.mo137702f())) {
                        String q2 = C86013q1.m106456q(r);
                        bVar = ((C102704b) C86312j.m106911c(cls)).mo138751as(q, b002.getType(), dVar3.field_filemd5, (byte[]) null);
                        C102479b as = ((C102704b) C86312j.m106911c(cls)).mo138751as(r, b002.getType(), q2, (byte[]) null);
                        Log.m105924i("MicroMsg.NetSceneUploadVideoOriginCgi", "check video thumb dup, fileName = " + this.f288700f + " result = " + as.f301760a);
                    } else {
                        bVar = ((C102704b) C86312j.m106911c(cls)).mo138752mP(this.f288705n.mo137702f(), q, r, b002.getType(), this.f288705n.f288566m, C86013q1.m106456q(this.f288705n.mo137702f()));
                    }
                    Log.m105924i("MicroMsg.NetSceneUploadVideoOriginCgi", "check video dup, fileName = " + this.f288700f + " result = " + bVar.f301760a);
                }
            }
            if (dVar4 != null && !Util.isNullOrNil(str)) {
                String q3 = C98398h0.Bx0().mo137728q(str);
                if (C86013q1.m106450k(q3)) {
                    C102479b as4 = ((C102704b) C86312j.m106911c(cls)).mo138751as(q3, b002.getType(), dVar4.field_filemd5, (byte[]) null);
                    Log.m105924i("MicroMsg.NetSceneUploadVideoOriginCgi", "check video dup origin, fileName = " + this.f288700f + " result = " + as4.f301760a);
                }
            }
        }
    }

    /* renamed from: m1 */
    public final String mo137769m1() {
        return this.f288700f + "_" + hashCode();
    }

    /* renamed from: n1 */
    public final void mo137770n1(int i, int i2, String str, C52197z04 z042, C117747y yVar) {
        int i3;
        C52197z04 z043 = z042;
        this.f288705n.f288564k = Util.nowSecond();
        if (z043 != null) {
            this.f288705n.f288556c = z043.f145625d;
            this.f288702h = z043.f145626e;
        }
        Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s dkmsgid  set svrmsgid %d -> %d", mo137769m1(), Long.valueOf(this.f288705n.f288556c), Integer.valueOf(C90188n0.f258951s));
        if (10007 == C90188n0.f258950r && (i3 = C90188n0.f258951s) != 0) {
            C98408n0 n0Var = this.f288705n;
            if (n0Var.f288556c != 0) {
                n0Var.f288556c = (long) i3;
                C90188n0.f258951s = 0;
            }
        }
        C98408n0 n0Var2 = this.f288705n;
        n0Var2.f288548P = 1028;
        C98429r0.m127808N(n0Var2);
        if (z043 != null) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f288705n.mo137707k());
            if (((z1Var == null || ((int) z1Var.f108320R1) <= 0) ? false : z1Var.mo62916m3()) || C72996z1.m85793A5(this.f288705n.mo137707k())) {
                Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s upload to biz :%s", mo137769m1(), this.f288705n.mo137707k());
                if (this.f288705n.f288556c < 0) {
                    Log.m105920e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: finish video invaild MSGSVRID :" + this.f288705n.f288556c + " file:" + this.f288700f + " toUser:" + this.f288705n.mo137707k());
                    C98429r0.m127799E(this.f288700f);
                    this.f288704j.mo127120a(3, -1);
                }
            } else {
                Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s not upload to biz", mo137769m1());
                if (this.f288705n.f288556c <= 0) {
                    Log.m105920e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: finish video invaild MSGSVRID :" + this.f288705n.f288556c + " file:" + this.f288700f + " toUser:" + this.f288705n.mo137707k());
                    C98429r0.m127799E(this.f288700f);
                    this.f288704j.mo127120a(3, -1);
                }
            }
        }
        String q = C98398h0.Bx0().mo137728q(this.f288700f);
        String k1 = mo137767k1(C98398h0.Bx0().mo137729r(this.f288700f));
        C97867h hVar = new C97867h();
        hVar.f287089h = this.f288705n.f288567n;
        hVar.f287084c = this.f288710s;
        hVar.f287083b = 2;
        hVar.f287082a = 4;
        hVar.f287085d = q;
        hVar.f287086e = k1;
        C102616b L50 = ((C102617c) C86312j.m106911c(C102617c.class)).L50();
        this.f288709r = L50;
        L50.mo137189b(hVar);
        int i4 = i;
        this.f288698d.onSceneEnd(i, i2, str, yVar);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cdntra onGYNetEnd errtype[%d %d]", mo137769m1(), Integer.valueOf(i2), Integer.valueOf(i3));
        C52197z04 z042 = (C52197z04) ((C47350c) uVar).f127056b.f127083a;
        C98408n0 i4 = C98429r0.m127818i(this.f288700f);
        this.f288705n = i4;
        if (i4 == null) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd Get INFO FAILED :" + this.f288700f);
            this.f288698d.onSceneEnd(i2, i3, str, this);
            this.f288704j.mo127120a(3, -1);
        } else if (i2 == 4 && i3 == 102) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoOriginCgi", "summersafecdn ERR: MM_ERR_GET_AESKEY_FAILED errtype:" + i2 + " errCode:" + i3 + "  file:" + this.f288700f + " user:" + this.f288705n.mo137707k());
            this.f288698d.onSceneEnd(i2, i3, str, this);
            this.f288704j.mo127120a(i2, i3);
        } else if (i2 == 4 && i3 == -22) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd BLACK  errtype:" + i2 + " errCode:" + i3 + "  file:" + this.f288700f + " user:" + this.f288705n.mo137707k());
            C98429r0.m127798D(this.f288700f);
            this.f288698d.onSceneEnd(i2, i3, str, this);
            this.f288704j.mo127120a(i2, i3);
        } else if (i2 == 4 && i3 != 0) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd SERVER FAILED errtype:" + i2 + " errCode:" + i3 + "  file:" + this.f288700f + " user:" + this.f288705n.mo137707k());
            C98429r0.m127799E(this.f288700f);
            this.f288698d.onSceneEnd(i2, i3, str, this);
            this.f288704j.mo127120a(i2, i3);
        } else if (i2 == 0 && i3 == 0) {
            mo137770n1(i2, i3, str, z042, this);
        } else {
            Log.m105920e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + i2 + " errCode:" + i3 + "  file:" + this.f288700f + " user:" + this.f288705n.mo137707k());
            C98429r0.m127799E(this.f288700f);
            this.f288698d.onSceneEnd(i2, i3, str, this);
            this.f288704j.mo127120a(i2, i3);
        }
    }

    public int securityLimitCount() {
        return 1;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        C98429r0.m127799E(this.f288700f);
    }
}
