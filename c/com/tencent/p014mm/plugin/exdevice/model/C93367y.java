package com.tencent.p014mm.plugin.exdevice.model;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.tencent.p014mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent;
import com.tencent.p014mm.autogen.events.GetSnsTimeLineObjectEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.exdevice.model.C2242s0;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import hd0.C98410o0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ob0.C11385n;
import p1081gi.C98124g;
import p158gt.C98201k;
import p682rz.C101488s;
import p763ym.C53543s;
import te3.C101766ct2;
import te3.C101771dt2;
import te3.C101804kv2;
import te3.C48759at2;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.model.y */
public class C93367y implements C11385n {

    /* renamed from: A */
    public HashMap<String, Boolean> f269434A = new HashMap<>();

    /* renamed from: B */
    public C2242s0.C2243a f269435B;

    /* renamed from: C */
    public C2242s0.C2243a f269436C;

    /* renamed from: D */
    public C2242s0.C2243a f269437D;

    /* renamed from: E */
    public C2242s0.C2243a f269438E;

    /* renamed from: F */
    public C93356d f269439F;

    /* renamed from: G */
    public Runnable f269440G = new C93368a();

    /* renamed from: H */
    public String f269441H;

    /* renamed from: I */
    public C101766ct2 f269442I;

    /* renamed from: J */
    public String f269443J;

    /* renamed from: K */
    public String f269444K;

    /* renamed from: L */
    public int f269445L;

    /* renamed from: M */
    public C98124g.C98125a f269446M = new C93369b();

    /* renamed from: N */
    public HashMap<Integer, String> f269447N = new HashMap<>();

    /* renamed from: d */
    public boolean f269448d = false;

    /* renamed from: e */
    public boolean f269449e = false;

    /* renamed from: f */
    public boolean f269450f = false;

    /* renamed from: g */
    public boolean f269451g = false;

    /* renamed from: h */
    public long f269452h;

    /* renamed from: i */
    public String f269453i;

    /* renamed from: j */
    public String f269454j;

    /* renamed from: n */
    public String f269455n;

    /* renamed from: o */
    public boolean f269456o = false;

    /* renamed from: p */
    public boolean f269457p = false;

    /* renamed from: q */
    public HashMap<String, C93366l1> f269458q = new HashMap<>();

    /* renamed from: r */
    public C101766ct2 f269459r;

    /* renamed from: s */
    public String f269460s = "";

    /* renamed from: t */
    public long f269461t;

    /* renamed from: u */
    public long f269462u;

    /* renamed from: v */
    public List<C53753b> f269463v;

    /* renamed from: w */
    public List<C53753b> f269464w = new ArrayList();

    /* renamed from: x */
    public List<C48759at2> f269465x;

    /* renamed from: y */
    public HashMap<String, String> f269466y = new HashMap<>();

    /* renamed from: z */
    public HashMap<String, Integer> f269467z = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.exdevice.model.y$a */
    public class C93368a implements Runnable {
        public C93368a() {
        }

        public void run() {
            String str;
            String str2;
            try {
                String str3 = C112760b.m154239k() + String.format("%s%d.%s", new Object[]{"image", Integer.valueOf(C93367y.this.f269441H.hashCode()), "jpg"});
                byte[] d = C93365i.m117887d(C93367y.this.f269441H);
                if (d != null) {
                    C93367y.this.mo128157f(BitmapFactory.decodeByteArray(d, 0, d.length), str3);
                    C93367y.this.f269454j = str3;
                    if (str3 != null || C86013q1.m106450k(str3)) {
                        int i = -1;
                        C101771dt2 dt22 = new C101771dt2();
                        String str4 = C93367y.this.f269454j;
                        String str5 = null;
                        if (str4 == null || str4.length() <= 0) {
                            str2 = null;
                            str = null;
                        } else {
                            Uri n = C116299g2.m163858n(str4);
                            String path = n.getPath();
                            if (path != null) {
                                String k = C116299g2.m163855k(path, false, false);
                                if (!n.getPath().equals(k)) {
                                    n = n.buildUpon().path(k).build();
                                }
                            }
                            str2 = n.getPath();
                            int lastIndexOf = str2.lastIndexOf("/");
                            if (lastIndexOf >= 0) {
                                str2 = str2.substring(lastIndexOf + 1);
                            }
                            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                            long j = 0;
                            if (l.mo177810a()) {
                                C86001b0 q = l.f348991a.mo119945q(l.f348992b);
                                if (q != null) {
                                    j = q.f250473c;
                                }
                            }
                            i = (int) j;
                            str5 = str2.substring(str2.lastIndexOf(".") + 1, str2.length());
                            str = C86013q1.m106456q(str4);
                            Log.m105925i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "downloadImageRunnable filePath %s", str4);
                            Log.m105925i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "downloadImageRunnable fileSize %s", Integer.valueOf(i));
                            Log.m105925i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "downloadImageRunnable fileMd5 %s", str);
                        }
                        dt22.f298128d = str5;
                        dt22.f298129e = str2;
                        dt22.f298130f = i;
                        dt22.f298131g = str;
                        C93367y yVar = C93367y.this;
                        C101766ct2 ct22 = yVar.f269442I;
                        ct22.f298052g = dt22;
                        ct22.f298049d = 3;
                        C86709a0.m107529k().f251779b.mo123460f(new C55638w0(ct22, yVar.f269443J, yVar.f269444K, yVar.f269445L));
                        return;
                    }
                    Log.m105920e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "mSnsImagePath is null or file not exist!");
                    C93365i.m117894k(C93367y.this.f269444K, "send_data_failed");
                    return;
                }
                Log.m105920e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get image error !");
                C93365i.m117894k(C93367y.this.f269444K, "send_data_failed");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.y$b */
    public class C93369b implements C98124g.C98125a {
        public C93369b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0130 A[Catch:{ Exception -> 0x0067 }] */
        /* renamed from: g0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1773g0(java.lang.String r5, int r6, p1081gi.C98120c r7, p1081gi.C98121d r8, boolean r9) {
            /*
                r4 = this;
                r5 = 5
                java.lang.Object[] r5 = new java.lang.Object[r5]
                com.tencent.mm.plugin.exdevice.model.y r9 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this
                java.lang.String r9 = r9.f269460s
                r0 = 0
                r5[r0] = r9
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r9 = 1
                r5[r9] = r6
                r6 = 2
                r5[r6] = r7
                r6 = 3
                r5[r6] = r8
                com.tencent.mm.plugin.exdevice.model.y r6 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this
                boolean r6 = r6.f269456o
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                r1 = 4
                r5[r1] = r6
                java.lang.String r6 = "MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice"
                java.lang.String r1 = "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] sentToCloud:[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r1, r5)
                if (r7 == 0) goto L_0x006a
                long r1 = r7.field_finishedLength     // Catch:{ Exception -> 0x0067 }
                float r5 = (float) r1     // Catch:{ Exception -> 0x0067 }
                long r1 = r7.field_toltalLength     // Catch:{ Exception -> 0x0067 }
                float r7 = (float) r1     // Catch:{ Exception -> 0x0067 }
                float r5 = r5 / r7
                r7 = 1120403456(0x42c80000, float:100.0)
                float r5 = r5 * r7
                int r5 = (int) r5     // Catch:{ Exception -> 0x0067 }
                java.lang.String r7 = "sent to cloud progress %d"
                java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0067 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0067 }
                r1[r0] = r2     // Catch:{ Exception -> 0x0067 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r1)     // Catch:{ Exception -> 0x0067 }
                r7 = 100
                if (r5 < r7) goto L_0x004b
                r5 = 99
            L_0x004b:
                com.tencent.mm.plugin.exdevice.model.y r7 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this     // Catch:{ Exception -> 0x0067 }
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.exdevice.model.l1> r7 = r7.f269458q     // Catch:{ Exception -> 0x0067 }
                java.util.Set r7 = r7.keySet()     // Catch:{ Exception -> 0x0067 }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x0067 }
            L_0x0057:
                boolean r1 = r7.hasNext()     // Catch:{ Exception -> 0x0067 }
                if (r1 == 0) goto L_0x006a
                java.lang.Object r1 = r7.next()     // Catch:{ Exception -> 0x0067 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0067 }
                com.tencent.p014mm.plugin.exdevice.model.C93365i.m117893j(r1, r5)     // Catch:{ Exception -> 0x0067 }
                goto L_0x0057
            L_0x0067:
                r5 = move-exception
                goto L_0x0160
            L_0x006a:
                if (r8 == 0) goto L_0x0169
                com.tencent.mm.plugin.exdevice.model.y r5 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this     // Catch:{ Exception -> 0x0067 }
                boolean r7 = r5.f269456o     // Catch:{ Exception -> 0x0067 }
                if (r7 == 0) goto L_0x0169
                r5.f269451g = r0     // Catch:{ Exception -> 0x0067 }
                te3.ct2 r5 = new te3.ct2     // Catch:{ Exception -> 0x0067 }
                r5.<init>()     // Catch:{ Exception -> 0x0067 }
                com.tencent.mm.plugin.exdevice.model.y r7 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this     // Catch:{ Exception -> 0x0067 }
                long r1 = r7.f269452h     // Catch:{ Exception -> 0x0067 }
                r7.mo128153b(r5, r1)     // Catch:{ Exception -> 0x0067 }
                com.tencent.mm.plugin.exdevice.model.y r7 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this     // Catch:{ Exception -> 0x0067 }
                r7.f269456o = r0     // Catch:{ Exception -> 0x0067 }
                java.lang.Class<f62.k0> r7 = f62.C75700k0.class
                k40.a r7 = f40.C86709a0.m107533q(r7)     // Catch:{ Exception -> 0x0067 }
                f62.k0 r7 = (f62.C75700k0) r7     // Catch:{ Exception -> 0x0067 }
                g62.l r7 = r7.mo96095LE()     // Catch:{ Exception -> 0x0067 }
                com.tencent.mm.plugin.exdevice.model.y r1 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this     // Catch:{ Exception -> 0x0067 }
                long r1 = r1.f269452h     // Catch:{ Exception -> 0x0067 }
                com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7     // Catch:{ Exception -> 0x0067 }
                com.tencent.mm.storage.f4 r7 = r7.b00(r1)     // Catch:{ Exception -> 0x0067 }
                java.lang.Boolean r1 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117890g(r7)     // Catch:{ Exception -> 0x0067 }
                boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0067 }
                if (r1 != 0) goto L_0x00ec
                java.lang.Boolean r1 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117888e(r7)     // Catch:{ Exception -> 0x0067 }
                boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0067 }
                if (r1 == 0) goto L_0x00af
                goto L_0x00ec
            L_0x00af:
                java.lang.Boolean r1 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117889f(r7)     // Catch:{ Exception -> 0x0067 }
                boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0067 }
                if (r1 == 0) goto L_0x00d1
                te3.bt2 r7 = r5.f298053h     // Catch:{ Exception -> 0x0067 }
                java.lang.String r1 = r8.field_aesKey     // Catch:{ Exception -> 0x0067 }
                r7.f297988i = r1     // Catch:{ Exception -> 0x0067 }
                java.lang.String r1 = r8.field_fileId     // Catch:{ Exception -> 0x0067 }
                r7.f297987h = r1     // Catch:{ Exception -> 0x0067 }
                java.lang.String r8 = r8.field_fileUrl     // Catch:{ Exception -> 0x0067 }
                r7.f297989j = r8     // Catch:{ Exception -> 0x0067 }
                java.lang.String r7 = "file_msg.url:[%s]"
                java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0067 }
                r1[r0] = r8     // Catch:{ Exception -> 0x0067 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r1)     // Catch:{ Exception -> 0x0067 }
                goto L_0x011c
            L_0x00d1:
                java.lang.Boolean r7 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117891h(r7)     // Catch:{ Exception -> 0x0067 }
                boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x0067 }
                if (r7 == 0) goto L_0x011c
                te3.ht2 r7 = r5.f298055j     // Catch:{ Exception -> 0x0067 }
                java.lang.String r8 = r8.field_fileUrl     // Catch:{ Exception -> 0x0067 }
                r7.f298357g = r8     // Catch:{ Exception -> 0x0067 }
                java.lang.String r7 = "video_msg.url:[%s]"
                java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0067 }
                r1[r0] = r8     // Catch:{ Exception -> 0x0067 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r1)     // Catch:{ Exception -> 0x0067 }
                goto L_0x011c
            L_0x00ec:
                te3.dt2 r7 = r5.f298052g     // Catch:{ Exception -> 0x0067 }
                java.lang.String r1 = r8.field_aesKey     // Catch:{ Exception -> 0x0067 }
                r7.f298133i = r1     // Catch:{ Exception -> 0x0067 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0067 }
                r1.<init>()     // Catch:{ Exception -> 0x0067 }
                com.tencent.mm.plugin.exdevice.model.y r2 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this     // Catch:{ Exception -> 0x0067 }
                long r2 = r2.f269462u     // Catch:{ Exception -> 0x0067 }
                r1.append(r2)     // Catch:{ Exception -> 0x0067 }
                java.lang.String r2 = ""
                r1.append(r2)     // Catch:{ Exception -> 0x0067 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0067 }
                r7.f298135n = r1     // Catch:{ Exception -> 0x0067 }
                te3.dt2 r7 = r5.f298052g     // Catch:{ Exception -> 0x0067 }
                java.lang.String r1 = r8.field_fileId     // Catch:{ Exception -> 0x0067 }
                r7.f298132h = r1     // Catch:{ Exception -> 0x0067 }
                java.lang.String r8 = r8.field_fileUrl     // Catch:{ Exception -> 0x0067 }
                r7.f298134j = r8     // Catch:{ Exception -> 0x0067 }
                java.lang.String r7 = "image_msg.url:[%s]"
                java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0067 }
                r1[r0] = r8     // Catch:{ Exception -> 0x0067 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r1)     // Catch:{ Exception -> 0x0067 }
            L_0x011c:
                com.tencent.mm.plugin.exdevice.model.y r7 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this     // Catch:{ Exception -> 0x0067 }
                r7.f269459r = r5     // Catch:{ Exception -> 0x0067 }
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.exdevice.model.l1> r7 = r7.f269458q     // Catch:{ Exception -> 0x0067 }
                java.util.Set r7 = r7.keySet()     // Catch:{ Exception -> 0x0067 }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x0067 }
            L_0x012a:
                boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x0067 }
                if (r8 == 0) goto L_0x0158
                java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x0067 }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0067 }
                com.tencent.mm.plugin.exdevice.model.y r1 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this     // Catch:{ Exception -> 0x0067 }
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.exdevice.model.l1> r1 = r1.f269458q     // Catch:{ Exception -> 0x0067 }
                java.lang.Object r1 = r1.get(r8)     // Catch:{ Exception -> 0x0067 }
                com.tencent.mm.plugin.exdevice.model.l1 r1 = (com.tencent.p014mm.plugin.exdevice.model.C93366l1) r1     // Catch:{ Exception -> 0x0067 }
                if (r1 != 0) goto L_0x0143
                goto L_0x012a
            L_0x0143:
                boolean r2 = r1.f269431n     // Catch:{ Exception -> 0x0067 }
                if (r2 != 0) goto L_0x012a
                com.tencent.mm.plugin.exdevice.model.w0 r2 = new com.tencent.mm.plugin.exdevice.model.w0     // Catch:{ Exception -> 0x0067 }
                java.lang.String r1 = r1.f269425e     // Catch:{ Exception -> 0x0067 }
                r2.<init>(r5, r1, r8, r9)     // Catch:{ Exception -> 0x0067 }
                f40.g r8 = f40.C86709a0.m107529k()     // Catch:{ Exception -> 0x0067 }
                ob0.b0 r8 = r8.f251779b     // Catch:{ Exception -> 0x0067 }
                r8.mo123460f(r2)     // Catch:{ Exception -> 0x0067 }
                goto L_0x012a
            L_0x0158:
                com.tencent.mm.plugin.exdevice.model.y r5 = com.tencent.p014mm.plugin.exdevice.model.C93367y.this     // Catch:{ Exception -> 0x0067 }
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.exdevice.model.l1> r5 = r5.f269458q     // Catch:{ Exception -> 0x0067 }
                r5.clear()     // Catch:{ Exception -> 0x0067 }
                goto L_0x0169
            L_0x0160:
                java.lang.Object[] r7 = new java.lang.Object[r9]
                r7[r0] = r5
                java.lang.String r5 = "cdnCallback Exception %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r5, r7)
            L_0x0169:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C93367y.C93369b.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "getCdnAuthInfo mediaId = " + str);
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "decodePrepareResponse ");
            return bArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C93367y(long r5) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f269448d = r0
            r4.f269449e = r0
            r4.f269450f = r0
            r4.f269451g = r0
            r4.f269456o = r0
            r4.f269457p = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.f269458q = r1
            java.lang.String r1 = ""
            r4.f269460s = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f269464w = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.f269466y = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.f269467z = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.f269434A = r1
            com.tencent.mm.plugin.exdevice.model.y$a r1 = new com.tencent.mm.plugin.exdevice.model.y$a
            r1.<init>()
            r4.f269440G = r1
            com.tencent.mm.plugin.exdevice.model.y$b r1 = new com.tencent.mm.plugin.exdevice.model.y$b
            r1.<init>()
            r4.f269446M = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.f269447N = r1
            com.tencent.mm.plugin.exdevice.model.d r1 = new com.tencent.mm.plugin.exdevice.model.d
            r1.<init>(r5)
            r4.f269439F = r1
            java.util.List<z71.b> r5 = r4.f269464w
            r5.clear()
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r4.f269466y
            r5.clear()
            java.util.HashMap<java.lang.String, java.lang.Boolean> r5 = r4.f269434A
            r5.clear()
            z71.c r5 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            java.util.List r5 = r5.mo74329Lo()
            r4.f269463v = r5
            z71.g r5 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Ex0()
            r5.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.database.Cursor r5 = r5.getAll()
            if (r5 == 0) goto L_0x00b2
            boolean r1 = r5.moveToFirst()
            if (r1 == 0) goto L_0x00b2
        L_0x0084:
            z71.f r1 = new z71.f
            r1.<init>()
            r1.convertFrom(r5)
            te3.at2 r2 = new te3.at2
            r2.<init>()
            int r3 = r1.field_deviceType
            r2.f130757d = r3
            java.lang.String r3 = r1.field_deviceId
            r2.f130758e = r3
            java.lang.String r3 = r1.field_iconUrl
            r2.f130760g = r3
            java.lang.String r3 = r1.field_nickName
            r2.f130759f = r3
            java.lang.String r1 = r1.field_supportMsgTypeList
            java.util.LinkedList r1 = d81.C45288e.m50138i(r1)
            r2.f130761h = r1
            r6.add(r2)
            boolean r1 = r5.moveToNext()
            if (r1 != 0) goto L_0x0084
        L_0x00b2:
            if (r5 == 0) goto L_0x00b7
            r5.close()
        L_0x00b7:
            r4.f269465x = r6
            java.util.List<z71.b> r5 = r4.f269463v
            if (r5 == 0) goto L_0x00c3
            int r5 = r5.size()
            if (r5 > 0) goto L_0x00cd
        L_0x00c3:
            java.util.List<te3.at2> r5 = r4.f269465x
            if (r5 == 0) goto L_0x016c
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x016c
        L_0x00cd:
            java.util.List<z71.b> r5 = r4.f269463v
            int r5 = r5.size()
        L_0x00d3:
            if (r0 >= r5) goto L_0x010a
            java.util.List<z71.b> r6 = r4.f269463v
            java.lang.Object r6 = r6.get(r0)
            z71.b r6 = (z71.C53753b) r6
            java.lang.String r6 = r6.f150091H
            java.lang.String r1 = "internet_to_device"
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x0107
            java.util.List<z71.b> r6 = r4.f269463v
            java.lang.Object r6 = r6.get(r0)
            z71.b r6 = (z71.C53753b) r6
            java.lang.String r6 = r6.f150091H
            java.lang.String r1 = "wechat_to_device"
            boolean r6 = r6.contains(r1)
            if (r6 != 0) goto L_0x0107
            java.util.List<z71.b> r6 = r4.f269464w
            java.util.List<z71.b> r1 = r4.f269463v
            java.lang.Object r1 = r1.get(r0)
            z71.b r1 = (z71.C53753b) r1
            r6.add(r1)
        L_0x0107:
            int r0 = r0 + 1
            goto L_0x00d3
        L_0x010a:
            java.lang.String r5 = "MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice"
            java.lang.String r6 = "callbackRegister"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            com.tencent.mm.plugin.exdevice.model.z r6 = new com.tencent.mm.plugin.exdevice.model.z
            r6.<init>(r4)
            r4.f269438E = r6
            com.tencent.mm.plugin.exdevice.model.a0 r6 = new com.tencent.mm.plugin.exdevice.model.a0
            r6.<init>(r4)
            r4.f269435B = r6
            com.tencent.mm.plugin.exdevice.model.b0 r6 = new com.tencent.mm.plugin.exdevice.model.b0
            r6.<init>(r4)
            r4.f269436C = r6
            com.tencent.mm.plugin.exdevice.model.c0 r6 = new com.tencent.mm.plugin.exdevice.model.c0
            r6.<init>(r4)
            r4.f269437D = r6
            f40.g r6 = f40.C86709a0.m107529k()
            ob0.b0 r6 = r6.f251779b
            r0 = 1717(0x6b5, float:2.406E-42)
            r6.mo123455a(r0, r4)
            com.tencent.mm.plugin.exdevice.model.s0 r6 = com.tencent.p014mm.plugin.exdevice.model.C2242s0.m2051a()
            r0 = 14
            com.tencent.mm.plugin.exdevice.model.s0$a r1 = r4.f269435B
            r6.mo2132c(r0, r1)
            com.tencent.mm.plugin.exdevice.model.s0 r6 = com.tencent.p014mm.plugin.exdevice.model.C2242s0.m2051a()
            r0 = 12
            com.tencent.mm.plugin.exdevice.model.s0$a r1 = r4.f269436C
            r6.mo2132c(r0, r1)
            com.tencent.mm.plugin.exdevice.model.s0 r6 = com.tencent.p014mm.plugin.exdevice.model.C2242s0.m2051a()
            r0 = 13
            com.tencent.mm.plugin.exdevice.model.s0$a r1 = r4.f269437D
            r6.mo2132c(r0, r1)
            com.tencent.mm.plugin.exdevice.model.s0 r6 = com.tencent.p014mm.plugin.exdevice.model.C2242s0.m2051a()
            r0 = 15
            com.tencent.mm.plugin.exdevice.model.s0$a r1 = r4.f269438E
            r6.mo2132c(r0, r1)
            java.lang.String r6 = "initWCLanDeviceLib..."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice.initWCLanDeviceLib()
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C93367y.<init>(long):void");
    }

    /* renamed from: a */
    public static void m117899a(C93367y yVar, List list) {
        yVar.getClass();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("deviceType", ((C53753b) list.get(i)).field_deviceType);
            hashMap.put("deviceID", ((C53753b) list.get(i)).field_deviceID);
            hashMap.put("displayName", C93365i.m117886c((C53753b) list.get(i)));
            hashMap.put("iconUrl", ((C53753b) list.get(i)).f150114z);
            hashMap.put("ability", ((C53753b) list.get(i)).f150091H);
            hashMap.put("abilityInf", ((C53753b) list.get(i)).f150092I);
            arrayList.add(hashMap);
        }
        ExDeviceScanNetworkDeviceResultEvent exDeviceScanNetworkDeviceResultEvent = new ExDeviceScanNetworkDeviceResultEvent();
        ExDeviceScanNetworkDeviceResultEvent.C92483a aVar = exDeviceScanNetworkDeviceResultEvent.f264720d;
        aVar.f264722a = arrayList;
        aVar.f264723b = yVar.f269465x;
        exDeviceScanNetworkDeviceResultEvent.publish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        r13 = r13.f348991a.mo119945q(r13.f348992b);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo128153b(te3.C101766ct2 r20, long r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            java.lang.Class<ym.l> r3 = p763ym.C79138l.class
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            r5 = r19
            java.lang.String r6 = r5.mo128155d(r1)
            java.lang.String r9 = "MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice"
            r10 = 0
            r11 = 0
            r12 = 1
            if (r6 == 0) goto L_0x00a1
            int r13 = r6.length()
            if (r13 <= 0) goto L_0x00a1
            android.net.Uri r13 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r14 = r13.getPath()
            if (r14 == 0) goto L_0x003f
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r11, r11)
            java.lang.String r15 = r13.getPath()
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x003f
            android.net.Uri$Builder r13 = r13.buildUpon()
            android.net.Uri$Builder r13 = r13.path(r14)
            android.net.Uri r13 = r13.build()
        L_0x003f:
            java.lang.String r14 = r13.getPath()
            java.lang.String r15 = "/"
            int r15 = r14.lastIndexOf(r15)
            if (r15 >= 0) goto L_0x004c
            goto L_0x0051
        L_0x004c:
            int r15 = r15 + r12
            java.lang.String r14 = r14.substring(r15)
        L_0x0051:
            com.tencent.mm.vfs.f0 r15 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r13 = r15.mo177799l(r13, r10)
            boolean r15 = r13.mo177810a()
            if (r15 != 0) goto L_0x005e
            goto L_0x0068
        L_0x005e:
            com.tencent.mm.vfs.FileSystem$c r15 = r13.f348991a
            java.lang.String r13 = r13.f348992b
            com.tencent.mm.vfs.b0 r13 = r15.mo119945q(r13)
            if (r13 != 0) goto L_0x006b
        L_0x0068:
            r7 = 0
            goto L_0x006d
        L_0x006b:
            long r7 = r13.f250473c
        L_0x006d:
            int r8 = (int) r7
            java.lang.String r7 = "."
            int r7 = r14.lastIndexOf(r7)
            int r7 = r7 + r12
            int r13 = r14.length()
            java.lang.String r7 = r14.substring(r7, r13)
            java.lang.String r13 = com.tencent.p014mm.vfs.C86013q1.m106456q(r6)
            java.lang.Object[] r15 = new java.lang.Object[r12]
            r15[r11] = r6
            java.lang.String r6 = "filePath %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r15)
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            r6[r11] = r15
            java.lang.String r15 = "fileSize %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r15, r6)
            java.lang.Object[] r6 = new java.lang.Object[r12]
            r6[r11] = r13
            java.lang.String r15 = "fileMd5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r15, r6)
            goto L_0x00a5
        L_0x00a1:
            r8 = -1
            r7 = r10
            r13 = r7
            r14 = r13
        L_0x00a5:
            k40.a r6 = f40.C86709a0.m107533q(r4)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r1 = r6.b00(r1)
            long r15 = r1.getMsgId()
            r17 = 0
            int r2 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x00c6
            java.lang.String r0 = "msgInfo or msgInfo.getMsgId() = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
            return r11
        L_0x00c6:
            int r2 = r1.getType()
            r6 = 3
            if (r2 == r6) goto L_0x0205
            r15 = 62
            r12 = 6
            if (r2 == r15) goto L_0x01f2
            r7 = 268435505(0x10000031, float:2.5243696E-29)
            r15 = 2
            if (r2 == r7) goto L_0x0122
            r7 = 1040187441(0x3e000031, float:0.12500073)
            if (r2 == r7) goto L_0x0122
            r7 = 1090519089(0x41000031, float:8.000047)
            if (r2 == r7) goto L_0x0122
            r7 = 48
            if (r2 == r7) goto L_0x00ed
            r4 = 49
            if (r2 == r4) goto L_0x0122
        L_0x00ea:
            r0 = 1
            goto L_0x0218
        L_0x00ed:
            k40.a r2 = f40.C86709a0.m107533q(r4)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            java.lang.String r1 = r1.getContent()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4$e r1 = r2.Tx0(r1)
            te3.et2 r2 = new te3.et2
            r2.<init>()
            double r3 = r1.f212704b
            float r3 = (float) r3
            r2.f298203d = r3
            double r3 = r1.f212705c
            float r3 = (float) r3
            r2.f298204e = r3
            int r3 = r1.f212706d
            float r3 = (float) r3
            r2.f298205f = r3
            java.lang.String r3 = r1.f212707e
            r2.f298206g = r3
            java.lang.String r1 = r1.f212708f
            r2.f298207h = r1
            r0.f298051f = r2
            r0.f298049d = r15
            goto L_0x00ea
        L_0x0122:
            java.lang.String r1 = r1.getContent()
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r10)
            if (r1 != 0) goto L_0x0132
            java.lang.String r0 = "get content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            return r11
        L_0x0132:
            int r2 = r1.f195582i
            if (r2 == r6) goto L_0x01a4
            r4 = 76
            if (r2 != r4) goto L_0x013b
            goto L_0x01a4
        L_0x013b:
            if (r2 != r12) goto L_0x0154
            te3.bt2 r2 = new te3.bt2
            r2.<init>()
            java.lang.String r3 = r1.f195602n
            r2.f297983d = r3
            java.lang.String r1 = r1.f195570f
            r2.f297984e = r1
            r2.f297985f = r8
            r2.f297986g = r13
            r0.f298053h = r2
            r1 = 4
            r0.f298049d = r1
            goto L_0x00ea
        L_0x0154:
            r4 = 5
            if (r2 != r4) goto L_0x018c
            te3.gt2 r2 = new te3.gt2
            r2.<init>()
            java.lang.String r6 = r1.f195586j
            r2.f298304d = r6
            java.lang.String r6 = r1.f195570f
            r2.f298305e = r6
            java.lang.String r6 = r1.f195574g
            r2.f298306f = r6
            java.lang.String r6 = r1.f195484F
            r2.f298307g = r6
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0186
            java.lang.String r6 = r1.f195562d
            di3.d r3 = di3.C86312j.m106911c(r3)
            ym.l r3 = (p763ym.C79138l) r3
            int r1 = r1.f195480E
            com.tencent.mm.pluginsdk.model.app.j r1 = r3.mo74003UV(r6, r1)
            if (r1 == 0) goto L_0x0186
            java.lang.String r1 = r1.field_appName
            r2.f298307g = r1
        L_0x0186:
            r0.f298054i = r2
            r0.f298049d = r4
            goto L_0x00ea
        L_0x018c:
            if (r2 != r15) goto L_0x00ea
            te3.dt2 r1 = new te3.dt2
            r1.<init>()
            java.lang.String r2 = "jpg"
            r1.f298128d = r2
            r1.f298129e = r14
            r1.f298130f = r8
            r1.f298131g = r13
            r0.f298052g = r1
            r0.f298049d = r6
            goto L_0x00ea
        L_0x01a4:
            te3.ft2 r2 = new te3.ft2
            r2.<init>()
            java.lang.String r4 = r1.f195570f
            r2.f298260d = r4
            java.lang.String r4 = r1.f195574g
            r2.f298261e = r4
            java.lang.String r4 = r1.f195586j
            r2.f298263g = r4
            java.lang.String r4 = r1.f195590k
            r2.f298264h = r4
            java.lang.String r4 = r1.f195530T
            r2.f298265i = r4
            java.lang.String r4 = r1.f195533U
            r2.f298266j = r4
            java.lang.String r4 = r1.f195484F
            r2.f298267n = r4
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x01df
            java.lang.String r4 = r1.f195562d
            di3.d r3 = di3.C86312j.m106911c(r3)
            ym.l r3 = (p763ym.C79138l) r3
            int r6 = r1.f195480E
            com.tencent.mm.pluginsdk.model.app.j r3 = r3.mo74003UV(r4, r6)
            if (r3 == 0) goto L_0x01df
            java.lang.String r3 = r3.field_appName
            r2.f298267n = r3
        L_0x01df:
            java.lang.String r3 = r1.f195503K
            r2.f298268o = r3
            int r3 = r1.f195506L
            r2.f298269p = r3
            java.lang.String r1 = r1.f195527S
            r2.f298270q = r1
            r0.f298050e = r2
            r1 = 1
            r0.f298049d = r1
            goto L_0x00ea
        L_0x01f2:
            te3.ht2 r1 = new te3.ht2
            r1.<init>()
            r1.f298354d = r7
            r1.f298355e = r8
            r1.f298356f = r13
            r1.f298358h = r14
            r0.f298055j = r1
            r0.f298049d = r12
            goto L_0x00ea
        L_0x0205:
            te3.dt2 r1 = new te3.dt2
            r1.<init>()
            r1.f298128d = r7
            r1.f298129e = r14
            r1.f298130f = r8
            r1.f298131g = r13
            r0.f298052g = r1
            r0.f298049d = r6
            goto L_0x00ea
        L_0x0218:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C93367y.mo128153b(te3.ct2, long):boolean");
    }

    /* renamed from: c */
    public final C101804kv2 mo128154c(TimeLineObject timeLineObject, String str) {
        Iterator<C101804kv2> it = timeLineObject.ContentObj.f298427h.iterator();
        while (it.hasNext()) {
            C101804kv2 next = it.next();
            if (next.f298689d.equals(this.f269455n)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final String mo128155d(long j) {
        int i;
        Class cls = C98201k.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        if (b002.getMsgId() == 0) {
            return "";
        }
        int type = b002.getType();
        String content = b002.getContent();
        if (b002.mo101020w3()) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(content, (String) null);
            if (u != null && ((i = u.f195582i) == 6 || i == 2)) {
                C72683d qq = ((C72684e) ((C53543s) C86312j.m106911c(C53543s.class)).mo74024KZ()).mo100154qq(u.f195606o);
                if (qq != null) {
                    return qq.field_fileFullPath;
                }
                Log.m105920e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "getFilePath attInfo is null");
                return "";
            } else if (u == null) {
                return "";
            } else {
                int i2 = u.f195582i;
                if (i2 != 3 && i2 != 5) {
                    return "";
                }
                this.f269449e = true;
                return "";
            }
        } else if (type == 3) {
            C92836k uP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127198uP(b002);
            if (uP == null) {
                return "";
            }
            String CZ = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127161CZ(uP.f267378e);
            if (!Util.isNullOrNil(CZ)) {
                return CZ;
            }
            return ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127161CZ(uP.f267380g);
        } else if (type == 62) {
            return ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137728q(b002.mo108765s2());
        } else if (type != 48) {
            return "";
        } else {
            this.f269449e = true;
            return "";
        }
    }

    /* renamed from: e */
    public TimeLineObject mo128156e() {
        GetSnsTimeLineObjectEvent getSnsTimeLineObjectEvent = new GetSnsTimeLineObjectEvent();
        getSnsTimeLineObjectEvent.f264897d.f264899a = this.f269453i;
        getSnsTimeLineObjectEvent.publish();
        return getSnsTimeLineObjectEvent.f264898e.f264900a;
    }

    /* renamed from: f */
    public void mo128157f(Bitmap bitmap, String str) {
        OutputStream outputStream = null;
        try {
            outputStream = C86013q1.m106429K(str, false);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, outputStream);
            outputStream.flush();
            try {
                outputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e, "", new Object[0]);
            }
        } catch (IOException e2) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "Exception in saveImageToFile !");
            C93365i.m117894k(this.f269444K, "send_data_failed");
            Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e2, "", new Object[0]);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e3) {
                    Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e3, "", new Object[0]);
                }
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                    Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e4, "", new Object[0]);
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r9 = r9.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r9, int r10, java.lang.String r11, ob0.C117747y r12) {
        /*
            r8 = this;
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r4 = 1
            r1[r4] = r2
            r2 = 2
            r1[r2] = r11
            java.lang.String r5 = "MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice"
            java.lang.String r6 = "onSceneEnd errType = %d, errCode = %d ,errMsg = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r1)
            if (r12 != 0) goto L_0x0025
            java.lang.String r9 = "scene is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
            return
        L_0x0025:
            boolean r1 = r12 instanceof com.tencent.p014mm.plugin.exdevice.model.C55638w0
            if (r1 == 0) goto L_0x0194
            com.tencent.mm.plugin.exdevice.model.w0 r12 = (com.tencent.p014mm.plugin.exdevice.model.C55638w0) r12
            java.lang.String r1 = "send_data_failed"
            if (r9 != 0) goto L_0x017a
            if (r10 == 0) goto L_0x0034
            goto L_0x017a
        L_0x0034:
            ob0.c r9 = r12.f158352e
            if (r9 == 0) goto L_0x0041
            ob0.c$d r9 = r9.f127056b
            pe3.a r9 = r9.f127083a
            if (r9 == 0) goto L_0x0041
            te3.ui4 r9 = (te3.ui4) r9
            goto L_0x0042
        L_0x0041:
            r9 = 0
        L_0x0042:
            java.lang.String r9 = r9.f142869d
            int r10 = r12.f158354g
            if (r4 != r10) goto L_0x0052
            java.lang.String r9 = r12.f158353f
            java.lang.String r10 = "send_data_sucess"
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r9, r10)
            goto L_0x0194
        L_0x0052:
            java.lang.String r10 = r12.f158353f
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r8.f269466y
            java.lang.Object r11 = r11.get(r10)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "send_data_sending"
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r10, r12)
            boolean r12 = r8.f269450f
            if (r12 == 0) goto L_0x006d
            java.lang.String r12 = r8.f269453i
            if (r12 == 0) goto L_0x006d
            java.lang.String r12 = r8.f269454j
            goto L_0x0073
        L_0x006d:
            long r6 = r8.f269452h
            java.lang.String r12 = r8.mo128155d(r6)
        L_0x0073:
            if (r11 == 0) goto L_0x0170
            int r0 = r11.length()
            if (r0 != 0) goto L_0x007d
            goto L_0x0170
        L_0x007d:
            boolean r0 = r8.f269448d
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "onItemClick stop scan..."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice.stopScanWCLanDevice()
            r8.f269448d = r4
        L_0x008c:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r8.f269434A
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto L_0x00a2
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r8.f269434A
            java.lang.Object r0 = r0.get(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c8
        L_0x00a2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "connectWCLanDevice mDeviceInfo: "
            r0.append(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            byte[] r0 = r11.getBytes()
            int r0 = com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice.connectWCLanDevice(r0, r4)
            if (r0 == 0) goto L_0x00c8
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r10, r1)
            java.lang.String r0 = "connectWCLanDevice error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x00c8:
            boolean r0 = r8.f269449e
            if (r0 == 0) goto L_0x010d
            byte[] r11 = r11.getBytes()
            byte[] r9 = r9.getBytes()
            int r9 = com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice.useWCLanDeviceService(r11, r9)
            if (r9 == 0) goto L_0x0102
            java.util.HashMap<java.lang.Integer, java.lang.String> r11 = r8.f269447N
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r11.put(r12, r10)
            java.util.HashMap<java.lang.String, java.lang.Integer> r11 = r8.f269467z
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r11.put(r10, r12)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "get useWCLanDeviceService mCallBackCmdId: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            goto L_0x0194
        L_0x0102:
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r10, r1)
            java.lang.String r9 = "useWCLanDeviceService error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
            goto L_0x0194
        L_0x010d:
            if (r12 == 0) goto L_0x0167
            int r0 = r12.length()
            if (r0 != 0) goto L_0x0116
            goto L_0x0167
        L_0x0116:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r12
            java.lang.String r2 = "sendDataToNearFieldDevice %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            java.lang.String r12 = p823sg.C48380r.m53726a(r12, r3)
            byte[] r11 = r11.getBytes()
            byte[] r9 = r9.getBytes()
            byte[] r12 = r12.getBytes()
            int r9 = com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice.sendFileToWCLanDevice(r11, r9, r12)
            if (r9 == 0) goto L_0x015d
            java.util.HashMap<java.lang.Integer, java.lang.String> r11 = r8.f269447N
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r11.put(r12, r10)
            java.util.HashMap<java.lang.String, java.lang.Integer> r11 = r8.f269467z
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r11.put(r10, r12)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "get sendFileToWCLanDevice mCallBackCmdId ="
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r9)
            goto L_0x0194
        L_0x015d:
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r10, r1)
            java.lang.String r9 = "sendFileToWCLanDevice error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
            goto L_0x0194
        L_0x0167:
            java.lang.String r9 = "file path is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r10, r1)
            goto L_0x0194
        L_0x0170:
            java.lang.String r9 = "mDeviceInfo error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r10, r1)
            goto L_0x0194
        L_0x017a:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r3] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0[r4] = r9
            r0[r2] = r11
            java.lang.String r9 = "NetSceneGetAppMsgInfo onSceneEnd, errType(%d) errCode(%d) errMsg(%s)."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r9, r0)
            java.lang.String r9 = r12.f158353f
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r9, r1)
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C93367y.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
