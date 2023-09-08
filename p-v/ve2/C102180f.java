package ve2;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import hd0.C98429r0;
import i21.C98590g;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p556hw.C98548d;
import p682rz.C101487r;
import xe2.C102630a;

/* renamed from: ve2.f */
public final class C102180f extends C102179e {

    /* renamed from: h */
    public final C98127h f300871h = new C98127h();

    /* renamed from: i */
    public String f300872i = "";

    /* renamed from: ve2.f$a */
    public static final class C102181a implements C98127h.C98128a {

        /* renamed from: d */
        public final /* synthetic */ C102180f f300873d;

        public C102181a(C102180f fVar) {
            this.f300873d = fVar;
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            C102180f fVar = this.f300873d;
            fVar.f300870g = j;
            fVar.mo141720f();
            Log.m105924i("MicroMsg.C2CVideoMsgTask", "c2c video pre download progress, msgId:" + this.f300873d.f300868e.getMsgId() + ", msgSvrId:" + this.f300873d.f300869f + "offset:" + this.f300873d.f300870g + ", total:" + j2);
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            int i2 = i;
            Class cls = C98548d.class;
            if (i2 == 0) {
                C102180f fVar = this.f300873d;
                long j = fVar.f300869f;
                String o2 = fVar.f300868e.mo142473o2();
                C87412m.m108593f(o2, "msgDbItem.fromUser");
                String str2 = "taskInfo.filename";
                ((C98590g) C86312j.m106911c(C98590g.class)).bq0(3, j, o2, (long) this.f300873d.f300868e.mo142471m2(), (long) this.f300873d.f300868e.mo142480u2(), (long) this.f300873d.f300868e.mo142472n2(), this.f300873d.f300868e.getCreateTime());
                if (((C98548d) C86312j.m106911c(cls)).mo137919EB() != null) {
                    String str3 = this.f300873d.f300871h.f287683S;
                    C87412m.m108593f(str3, str2);
                    C98429r0.m127806L(str3, (int) this.f300873d.f300870g);
                }
                C102179e.m134640e(this.f300873d, 1, 0, 2, (Object) null);
                return;
            }
            String str4 = "taskInfo.filename";
            if (((C98548d) C86312j.m106911c(cls)).mo137919EB() != null) {
                String str5 = this.f300873d.f300871h.f287683S;
                C87412m.m108593f(str5, str4);
                long j2 = this.f300873d.f300870g;
                C98429r0.m127834y(str5);
            }
            this.f300873d.mo141719d(2, i2);
        }

        public void onDataAvailable(String str, long j, long j2) {
        }

        public void onM3U8Ready(String str, String str2) {
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102180f(C102630a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "msgDbItem");
    }

    /* renamed from: a */
    public void mo141716a(int i) {
        if (!Util.isNullOrNil(this.f300871h.field_mediaId)) {
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126983g(this.f300872i, (Object[]) null);
            C102179e.m134640e(this, i, 0, 2, (Object) null);
            Log.m105924i("MicroMsg.C2CVideoMsgTask", "c2c pre download video task cancel: msgSvrId:" + this.f300869f + ", msgId:" + this.f300868e.getMsgId());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f6  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141717c() {
        /*
            r18 = this;
            r1 = r18
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r0)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            xe2.a r3 = r1.f300868e
            java.lang.String r3 = r3.mo142473o2()
            long r4 = r1.f300869f
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.h30(r3, r4)
            java.lang.Class<hw.d> r3 = p556hw.C98548d.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            hw.d r3 = (p556hw.C98548d) r3
            hw.d$a r3 = r3.mo137919EB()
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x017e
            long r8 = r2.getMsgId()
            hd0.x$c r3 = (hd0.C98438x.C98441c) r3
            java.lang.ref.WeakReference<hd0.x> r10 = r3.f288733a
            java.lang.Object r10 = r10.get()
            hd0.x r10 = (hd0.C98438x) r10
            if (r10 != 0) goto L_0x004f
            java.lang.String r0 = "MicroMsg.PreloadVideoService"
            java.lang.String r3 = "onVideoPreload, try preload msgId = %s, preload service is null"
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r10[r4] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r10)
            goto L_0x017f
        L_0x004f:
            java.util.LinkedList<com.tencent.mm.storage.f4> r11 = r10.f288719a
            com.tencent.mm.pointers.PBool r12 = new com.tencent.mm.pointers.PBool
            r12.<init>()
            monitor-enter(r11)
            java.util.Iterator r13 = r11.iterator()     // Catch:{ all -> 0x017b }
        L_0x005b:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x017b }
            if (r14 == 0) goto L_0x007d
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x017b }
            com.tencent.mm.storage.f4 r14 = (com.tencent.p014mm.storage.C72963f4) r14     // Catch:{ all -> 0x017b }
            boolean r15 = hd0.C98438x.m127861c(r10, r14, r12)     // Catch:{ all -> 0x017b }
            boolean r7 = r12.value     // Catch:{ all -> 0x017b }
            if (r7 == 0) goto L_0x0072
            r13.remove()     // Catch:{ all -> 0x017b }
        L_0x0072:
            if (r15 == 0) goto L_0x005b
            long r16 = r14.getMsgId()     // Catch:{ all -> 0x017b }
            int r7 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x005b
            goto L_0x007e
        L_0x007d:
            r14 = r6
        L_0x007e:
            monitor-exit(r11)     // Catch:{ all -> 0x017b }
            if (r14 != 0) goto L_0x0091
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r14 = r0.b00(r8)
        L_0x0091:
            java.lang.String r0 = "MicroMsg.PreloadVideoService"
            java.lang.String r7 = r14.f230724G
            eb0.z3$$h r7 = eb0.C75604z3.m90851w(r7)
            if (r7 != 0) goto L_0x00ae
            java.lang.Object[] r7 = new java.lang.Object[r5]
            int r3 = r3.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7[r4] = r3
            java.lang.String r3 = "%d msgsource is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r7)
            goto L_0x017f
        L_0x00ae:
            java.lang.String r3 = r14.mo108765s2()
            hd0.n0 r7 = hd0.C98429r0.m127818i(r3)
            if (r7 != 0) goto L_0x00ba
            goto L_0x017f
        L_0x00ba:
            java.lang.String r8 = r7.mo137705i()
            java.lang.String r9 = "msg"
            java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r8, r9, r6)
            java.lang.String r9 = "cdntra parse video recv xml failed"
            if (r8 != 0) goto L_0x00ce
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r9)
            goto L_0x017f
        L_0x00ce:
            java.lang.String r10 = ".msg.videomsg.$cdnvideourl"
            java.lang.Object r10 = r8.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x00e1
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r9)
            goto L_0x017f
        L_0x00e1:
            java.lang.String r9 = ".msg.videomsg.$length"
            java.lang.Object r9 = r8.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r4)
            java.lang.String r11 = ".msg.videomsg.$md5"
            java.lang.Object r11 = r8.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = ".msg.videomsg.$newmd5"
            java.lang.Object r12 = r8.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = ".msg.videomsg.$aeskey"
            java.lang.Object r12 = r8.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = ".msg.videomsg.$fileparam"
            java.lang.Object r8 = r8.get(r13)
            java.lang.String r8 = (java.lang.String) r8
            long r13 = r7.f288563j
            java.lang.String r15 = r7.mo137707k()
            java.lang.String r6 = r7.mo137700d()
            java.lang.String r4 = "downvideo"
            java.lang.String r4 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r4, r13, r15, r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r6 == 0) goto L_0x0132
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r4 = r7.mo137700d()
            r6 = 0
            r3[r6] = r4
            java.lang.String r4 = "cdntra genClientId failed not use cdn file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r4, r3)
            goto L_0x017e
        L_0x0132:
            hd0.o0 r0 = hd0.C98398h0.Bx0()
            java.lang.String r0 = r0.mo137728q(r3)
            int r6 = r7.f288562i
            r13 = 199(0xc7, float:2.79E-43)
            if (r6 == r13) goto L_0x0147
            r13 = 123(0x7b, float:1.72E-43)
            if (r6 != r13) goto L_0x0145
            goto L_0x0147
        L_0x0145:
            r6 = 0
            goto L_0x0148
        L_0x0147:
            r6 = 2
        L_0x0148:
            hw.a r13 = new hw.a
            r13.<init>(r6)
            r13.f288996b = r3
            r13.f288997c = r11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r13.f288998d = r3
            r13.mo137911h(r12)
            r13.mo137917n(r8)
            r13.mo137913j(r0)
            r13.mo137914k(r4)
            r0 = 2
            int r3 = xb0.C102609h.wx0(r0, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r13.mo137915l(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r13.mo137916m(r0)
            r13.mo137912i(r10)
            r6 = r13
            goto L_0x017f
        L_0x017b:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x017b }
            throw r0
        L_0x017e:
            r6 = 0
        L_0x017f:
            if (r6 == 0) goto L_0x01eb
            int r0 = r6.f288995a
            r3 = 2
            if (r0 != r3) goto L_0x018d
            r0 = 5
            r2 = 0
            r4 = 0
            ve2.C102179e.m134640e(r1, r0, r2, r3, r4)
            return
        L_0x018d:
            gi.h r0 = r1.f300871h
            java.lang.String r3 = r6.f288996b
            r0.f287683S = r3
            java.lang.String r3 = r6.f288997c
            r0.f287685T = r3
            java.lang.Integer r0 = r6.f288998d
            if (r0 == 0) goto L_0x01a3
            int r0 = r0.intValue()
            gi.h r3 = r1.f300871h
            r3.f287687U = r0
        L_0x01a3:
            gi.h r0 = r1.f300871h
            java.lang.String r3 = r6.mo137907d()
            r0.field_mediaId = r3
            gi.h r0 = r1.f300871h
            java.lang.String r3 = r6.mo137906c()
            r0.field_fullpath = r3
            java.lang.Integer r0 = r6.mo137909f()
            if (r0 == 0) goto L_0x01c1
            int r0 = r0.intValue()
            gi.h r3 = r1.f300871h
            r3.field_totalLen = r0
        L_0x01c1:
            gi.h r0 = r1.f300871h
            java.lang.String r3 = r6.mo137904a()
            r0.field_aesKey = r3
            gi.h r0 = r1.f300871h
            java.lang.String r3 = r6.mo137905b()
            r0.field_fileId = r3
            gi.h r0 = r1.f300871h
            java.lang.String r3 = r6.mo137910g()
            r0.field_wxmsgparam = r3
            java.lang.Integer r0 = r6.mo137908e()
            if (r0 == 0) goto L_0x01eb
            int r0 = r0.intValue()
            gi.h r3 = r1.f300871h
            r3.field_requestVideoFormat = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r4 = r0
            goto L_0x01ec
        L_0x01eb:
            r4 = 0
        L_0x01ec:
            r0 = 4
            if (r4 != 0) goto L_0x01f6
            r3 = 0
            r4 = 0
            r6 = 2
            ve2.C102179e.m134640e(r1, r0, r3, r6, r4)
            return
        L_0x01f6:
            r6 = 2
            gi.h r3 = r1.f300871h
            long r7 = r1.f300869f
            r3.f287680Q0 = r7
            java.lang.String r4 = "task_NetScenePreloadVideo"
            r3.f287660d = r4
            r3.f287689V = r6
            java.lang.String r4 = r2.mo108768t()
            r3.f287693X = r4
            gi.h r3 = r1.f300871h
            java.lang.String r4 = r2.mo101010p2()
            r3.f287691W = r4
            gi.h r3 = r1.f300871h
            java.lang.String r4 = r2.mo101010p2()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r4)
            if (r4 == 0) goto L_0x022f
            java.lang.Class<a11.b> r4 = a11.C39478b.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            a11.b r4 = (a11.C39478b) r4
            java.lang.String r6 = r2.mo101010p2()
            int r4 = r4.mo62080p1(r6)
            goto L_0x0230
        L_0x022f:
            r4 = 1
        L_0x0230:
            r3.f287695Y = r4
            gi.h r3 = r1.f300871h
            r4 = 100
            r3.field_preloadRatio = r4
            r3.field_fileType = r0
            r0 = 2
            r3.field_priority = r0
            java.lang.String r2 = r2.mo101010p2()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            r3.field_chattype = r2
            gi.h r2 = r1.f300871h
            r2.f287654K = r0
            r2.field_autostart = r5
            xe2.a r0 = r1.f300868e
            int r0 = r0.mo142472n2()
            if (r0 != r5) goto L_0x025a
            gi.h r0 = r1.f300871h
            r0.f287664h = r5
            goto L_0x025f
        L_0x025a:
            gi.h r0 = r1.f300871h
            r2 = 2
            r0.f287664h = r2
        L_0x025f:
            gi.h r0 = r1.f300871h
            ve2.f$a r2 = new ve2.f$a
            r2.<init>(r1)
            r0.f287704f1 = r2
            java.lang.String r0 = r0.field_mediaId
            java.lang.String r2 = "taskInfo.field_mediaId"
            gy3.C87412m.m108593f(r0, r2)
            r1.f300872i = r0
            java.lang.String r0 = "MicroMsg.C2CVideoMsgTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "pre download video: svrId:"
            r2.append(r3)
            long r3 = r1.f300869f
            r2.append(r3)
            java.lang.String r3 = ", msgId:"
            r2.append(r3)
            xe2.a r3 = r1.f300868e
            long r3 = r3.getMsgId()
            r2.append(r3)
            java.lang.String r3 = ", mediaId:"
            r2.append(r3)
            java.lang.String r3 = r1.f300872i
            r2.append(r3)
            java.lang.String r3 = "， filename:"
            r2.append(r3)
            gi.h r3 = r1.f300871h
            java.lang.String r3 = r3.f287683S
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.Class<ke2.c> r0 = ke2.C99129c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ke2.c r0 = (ke2.C99129c) r0
            r0.requireAccountInitialized()
            xe2.b r0 = r0.f290673z
            xe2.a r2 = r1.f300868e
            java.lang.String r2 = r2.mo142476r2()
            java.lang.String r3 = "msgDbItem.msgItemId"
            gy3.C87412m.m108593f(r2, r3)
            r3 = 2
            r0.mo142290g3(r2, r3)
            java.lang.Class<rz.r> r0 = p682rz.C101487r.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            rz.r r0 = (p682rz.C101487r) r0
            rz.n r0 = r0.mo140795W6()
            gi.h r2 = r1.f300871h
            com.tencent.mm.modelcdntran.e0 r0 = (com.tencent.p014mm.modelcdntran.C92755e0) r0
            r3 = 0
            r0.mo126981e(r2, r3)
            java.lang.Class<i21.g> r0 = i21.C98590g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r2 = r0
            i21.g r2 = (i21.C98590g) r2
            r3 = 3
            long r5 = r1.f300869f
            xe2.a r0 = r1.f300868e
            java.lang.String r7 = r0.mo142473o2()
            java.lang.String r0 = "msgDbItem.fromUser"
            gy3.C87412m.m108593f(r7, r0)
            xe2.a r0 = r1.f300868e
            int r0 = r0.mo142471m2()
            long r8 = (long) r0
            xe2.a r0 = r1.f300868e
            int r0 = r0.mo142480u2()
            long r10 = (long) r0
            xe2.a r0 = r1.f300868e
            int r0 = r0.mo142472n2()
            long r12 = (long) r0
            xe2.a r0 = r1.f300868e
            long r14 = r0.getCreateTime()
            r2.mo137961JT(r3, r5, r7, r8, r10, r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve2.C102180f.mo141717c():void");
    }
}
