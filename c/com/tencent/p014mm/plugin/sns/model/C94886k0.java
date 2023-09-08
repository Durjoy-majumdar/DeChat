package com.tencent.p014mm.plugin.sns.model;

import android.os.Message;
import as2.C28128e;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97624e3;
import f40.C86709a0;
import fm0.C8136w;
import gv2.C98242p;
import h81.C32735h;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lc3.C10485b;
import ms2.C47094b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import os2.C100420w;
import os2.C100421x;
import p1072al.C92042f;
import p260wk.C102457e;
import pc0.C118000d0;
import pe3.C89349b;
import qe3.C101126c1;
import sf0.C48374j0;
import te3.C50886px;
import te3.C51018qv3;
import te3.C51101rf2;
import te3.C52156yq3;
import te3.k84;
import te3.l84;
import te3.m64;
import te3.n64;
import te3.w64;

/* renamed from: com.tencent.mm.plugin.sns.model.k0 */
public class C94886k0 extends C117747y implements C1311n {

    /* renamed from: h */
    public static List<C97624e3> f274960h = new LinkedList();

    /* renamed from: i */
    public static C47094b f274961i;

    /* renamed from: j */
    public static boolean f274962j = true;

    /* renamed from: d */
    public String f274963d = "";

    /* renamed from: e */
    public C47350c f274964e;

    /* renamed from: f */
    public C11385n f274965f;

    /* renamed from: g */
    public C94887a f274966g = new C94887a();

    /* renamed from: com.tencent.mm.plugin.sns.model.k0$a */
    public class C94887a {

        /* renamed from: a */
        public LinkedList<C50886px> f274967a;

        /* renamed from: b */
        public MMHandler f274968b = new C94888a();

        /* renamed from: com.tencent.mm.plugin.sns.model.k0$a$a */
        public class C94888a extends MMHandler {

            /* renamed from: com.tencent.mm.plugin.sns.model.k0$a$a$a */
            public class C94889a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C50886px f274971d;

                public C94889a(C50886px pxVar) {
                    this.f274971d = pxVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:11:0x0086 A[Catch:{ Exception -> 0x014f }] */
                /* JADX WARNING: Removed duplicated region for block: B:33:0x012a A[Catch:{ Exception -> 0x014f }] */
                /* JADX WARNING: Removed duplicated region for block: B:35:0x0135 A[SYNTHETIC, Splitter:B:35:0x0135] */
                /* JADX WARNING: Removed duplicated region for block: B:42:0x015e  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r17 = this;
                        r1 = r17
                        java.lang.String r2 = "run"
                        java.lang.String r3 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1$1"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                        com.tencent.mm.plugin.sns.model.k0$a$a r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.C94887a.C94888a.this
                        com.tencent.mm.plugin.sns.model.k0$a r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.C94887a.this
                        com.tencent.mm.plugin.sns.model.k0 r4 = com.tencent.p014mm.plugin.sns.model.C94886k0.this
                        te3.px r5 = r1.f274971d
                        com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f274968b
                        r4.getClass()
                        java.lang.String r6 = ","
                        java.lang.String r7 = "MicroMsg.NetSceneNewSyncAlbum"
                        java.lang.String r8 = "processSnsObject"
                        java.lang.String r9 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
                        com.tencent.mm.protocal.protobuf.SnsObject r12 = new com.tencent.mm.protocal.protobuf.SnsObject     // Catch:{ Exception -> 0x014f }
                        r12.<init>()     // Catch:{ Exception -> 0x014f }
                        te3.qv3 r5 = r5.f140038e     // Catch:{ Exception -> 0x014f }
                        pe3.b r5 = r5.f140574f     // Catch:{ Exception -> 0x014f }
                        byte[] r5 = r5.mo123703f()     // Catch:{ Exception -> 0x014f }
                        pe3.a r5 = r12.parseFrom(r5)     // Catch:{ Exception -> 0x014f }
                        com.tencent.mm.protocal.protobuf.SnsObject r5 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r5     // Catch:{ Exception -> 0x014f }
                        java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x014f }
                        te3.qv3 r13 = r5.ObjectDesc     // Catch:{ Exception -> 0x014f }
                        pe3.b r13 = r13.f140574f     // Catch:{ Exception -> 0x014f }
                        byte[] r13 = r13.mo123703f()     // Catch:{ Exception -> 0x014f }
                        r12.<init>(r13)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r13 = "<contentStyle><![CDATA[1]]></contentStyle>"
                        int r13 = r12.indexOf(r13)     // Catch:{ Exception -> 0x014f }
                        if (r13 >= 0) goto L_0x0056
                        java.lang.String r13 = "<contentStyle>1</contentStyle>"
                        int r12 = r12.indexOf(r13)     // Catch:{ Exception -> 0x014f }
                        if (r12 < 0) goto L_0x0054
                        goto L_0x0056
                    L_0x0054:
                        r12 = 0
                        goto L_0x0057
                    L_0x0056:
                        r12 = 1
                    L_0x0057:
                        java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
                        r13.<init>()     // Catch:{ Exception -> 0x014f }
                        java.lang.String r14 = "snsSync "
                        r13.append(r14)     // Catch:{ Exception -> 0x014f }
                        long r14 = r5.f283891Id     // Catch:{ Exception -> 0x014f }
                        r13.append(r14)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r14 = " "
                        r13.append(r14)     // Catch:{ Exception -> 0x014f }
                        long r14 = r5.f283891Id     // Catch:{ Exception -> 0x014f }
                        java.lang.String r14 = vr2.C102236a0.m134765q0(r14)     // Catch:{ Exception -> 0x014f }
                        r13.append(r14)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r14 = " isPhoto "
                        r13.append(r14)     // Catch:{ Exception -> 0x014f }
                        r13.append(r12)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x014f }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)     // Catch:{ Exception -> 0x014f }
                        if (r12 == 0) goto L_0x011e
                        long r12 = r5.f283891Id     // Catch:{ Exception -> 0x014f }
                        java.lang.String r12 = vr2.C102236a0.m134765q0(r12)     // Catch:{ Exception -> 0x014f }
                        os2.d0 r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()     // Catch:{ Exception -> 0x014f }
                        java.lang.String r14 = r5.Username     // Catch:{ Exception -> 0x014f }
                        os2.c0 r13 = r13.mo139782Yt(r14)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r14 = r13.field_newerIds     // Catch:{ Exception -> 0x014f }
                        boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ Exception -> 0x014f }
                        if (r14 != 0) goto L_0x0115
                        java.lang.String r14 = r13.field_newerIds     // Catch:{ Exception -> 0x014f }
                        java.lang.String[] r14 = r14.split(r6)     // Catch:{ Exception -> 0x014f }
                        r15 = 0
                        r16 = 1
                    L_0x00a7:
                        int r10 = r14.length     // Catch:{ Exception -> 0x014f }
                        if (r15 >= r10) goto L_0x00b7
                        r10 = r14[r15]     // Catch:{ Exception -> 0x014f }
                        boolean r10 = r12.equals(r10)     // Catch:{ Exception -> 0x014f }
                        if (r10 == 0) goto L_0x00b4
                        r16 = 0
                    L_0x00b4:
                        int r15 = r15 + 1
                        goto L_0x00a7
                    L_0x00b7:
                        r15 = r12
                        r10 = 0
                    L_0x00b9:
                        r11 = 2
                        if (r10 >= r11) goto L_0x00d8
                        int r11 = r14.length     // Catch:{ Exception -> 0x014f }
                        if (r10 >= r11) goto L_0x00d8
                        if (r16 == 0) goto L_0x00d8
                        java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
                        r11.<init>()     // Catch:{ Exception -> 0x014f }
                        r11.append(r15)     // Catch:{ Exception -> 0x014f }
                        r11.append(r6)     // Catch:{ Exception -> 0x014f }
                        r15 = r14[r10]     // Catch:{ Exception -> 0x014f }
                        r11.append(r15)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r15 = r11.toString()     // Catch:{ Exception -> 0x014f }
                        int r10 = r10 + 1
                        goto L_0x00b9
                    L_0x00d8:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
                        r6.<init>()     // Catch:{ Exception -> 0x014f }
                        java.lang.String r10 = "snsync newerIds "
                        r6.append(r10)     // Catch:{ Exception -> 0x014f }
                        long r10 = r5.f283891Id     // Catch:{ Exception -> 0x014f }
                        r6.append(r10)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r10 = " S: "
                        r6.append(r10)     // Catch:{ Exception -> 0x014f }
                        r6.append(r12)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r10 = " list "
                        r6.append(r10)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r10 = r13.field_newerIds     // Catch:{ Exception -> 0x014f }
                        r6.append(r10)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r10 = " newer "
                        r6.append(r10)     // Catch:{ Exception -> 0x014f }
                        r6.append(r15)     // Catch:{ Exception -> 0x014f }
                        java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x014f }
                        com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r6)     // Catch:{ Exception -> 0x014f }
                        if (r16 == 0) goto L_0x011e
                        os2.d0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()     // Catch:{ Exception -> 0x014f }
                        java.lang.String r10 = r5.Username     // Catch:{ Exception -> 0x014f }
                        r6.mo139785bO(r10, r15)     // Catch:{ Exception -> 0x014f }
                        goto L_0x011e
                    L_0x0115:
                        os2.d0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()     // Catch:{ Exception -> 0x014f }
                        java.lang.String r10 = r5.Username     // Catch:{ Exception -> 0x014f }
                        r6.mo139785bO(r10, r12)     // Catch:{ Exception -> 0x014f }
                    L_0x011e:
                        os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ Exception -> 0x014f }
                        long r10 = r5.f283891Id     // Catch:{ Exception -> 0x014f }
                        boolean r6 = r6.fq0(r10)     // Catch:{ Exception -> 0x014f }
                        if (r6 == 0) goto L_0x0135
                        java.lang.String r0 = "this item has in your sns pass it"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x014f }
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
                        r4 = 0
                        goto L_0x015b
                    L_0x0135:
                        com.tencent.mm.autogen.events.SnsNewSyncObjectEvent r6 = new com.tencent.mm.autogen.events.SnsNewSyncObjectEvent     // Catch:{ Exception -> 0x014f }
                        r6.<init>()     // Catch:{ Exception -> 0x014f }
                        r6.publish()     // Catch:{ Exception -> 0x014f }
                        com.tencent.mm.sdk.platformtools.MMHandler r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()     // Catch:{ Exception -> 0x014f }
                        com.tencent.mm.plugin.sns.model.i0 r10 = new com.tencent.mm.plugin.sns.model.i0     // Catch:{ Exception -> 0x014f }
                        r10.<init>(r4, r5, r0)     // Catch:{ Exception -> 0x014f }
                        r6.post(r10)     // Catch:{ Exception -> 0x014f }
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
                        r4 = 0
                        r10 = 1
                        goto L_0x015c
                    L_0x014f:
                        r0 = move-exception
                        r4 = 0
                        java.lang.Object[] r5 = new java.lang.Object[r4]
                        java.lang.String r6 = ""
                        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r5)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
                    L_0x015b:
                        r10 = 0
                    L_0x015c:
                        if (r10 != 0) goto L_0x0167
                        com.tencent.mm.plugin.sns.model.k0$a$a r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.C94887a.C94888a.this
                        com.tencent.mm.plugin.sns.model.k0$a r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.C94887a.this
                        com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f274968b
                        r0.sendEmptyMessage(r4)
                    L_0x0167:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94886k0.C94887a.C94888a.C94889a.run():void");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.model.k0$a$a$b */
            public class C94890b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C50886px f274973d;

                public C94890b(C50886px pxVar) {
                    this.f274973d = pxVar;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e0, code lost:
                    r2 = iu2.C60631e.class;
                    r3 = i40.C60247c.f171776h;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:0x00e4, code lost:
                    monitor-enter(r3);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
                    f40.C86709a0.m107523b().mo121108c();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f2, code lost:
                    if (i40.C60247c.class.isAssignableFrom(r2) == false) goto L_0x013f;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f4, code lost:
                    r2 = new androidx.lifecycle.C54209k0((androidx.lifecycle.C0123n0) f40.C86709a0.m107523b().f251755f, (androidx.lifecycle.C54209k0.C54210b) new i40.C60247c.C60248a.C60249a()).mo75002a(r2);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
                    monitor-exit(r3);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:26:0x0109, code lost:
                    ((iu2.C98802d) ((iu2.C60631e) r2).mo85233d3(iu2.C98802d.class)).mo138178i3(r14, com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion.getUPDATE());
                    r2 = r16;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:27:0x0125, code lost:
                    if (gv2.C98242p.m126942d(r2.f298787u, 2) != false) goto L_0x0129;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:28:0x0127, code lost:
                    r3 = true;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x0129, code lost:
                    r3 = false;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:30:0x012a, code lost:
                    com.tencent.p014mm.plugin.sns.model.C94866e1.ly0().post(new com.tencent.p014mm.plugin.sns.model.C94884j0(r11, r3, r2, r0));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:31:0x0136, code lost:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:34:0x0146, code lost:
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:9:0x007a, code lost:
                    r16 = r10;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r17 = this;
                        r1 = r17
                        java.lang.String r0 = "run"
                        java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1$2"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
                        com.tencent.mm.plugin.sns.model.k0$a$a r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.C94887a.C94888a.this
                        com.tencent.mm.plugin.sns.model.k0$a r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.C94887a.this
                        com.tencent.mm.plugin.sns.model.k0 r11 = com.tencent.p014mm.plugin.sns.model.C94886k0.this
                        te3.px r2 = r1.f274973d
                        com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f274968b
                        r11.getClass()
                        java.lang.String r3 = "processSnsAction"
                        java.lang.String r4 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                        r12 = 1
                        r13 = 0
                        te3.n64 r3 = new te3.n64     // Catch:{ Exception -> 0x014a }
                        r3.<init>()     // Catch:{ Exception -> 0x014a }
                        te3.qv3 r2 = r2.f140038e     // Catch:{ Exception -> 0x014a }
                        pe3.b r2 = r2.f140574f     // Catch:{ Exception -> 0x014a }
                        byte[] r2 = r2.mo123703f()     // Catch:{ Exception -> 0x014a }
                        pe3.a r2 = r3.parseFrom(r2)     // Catch:{ Exception -> 0x014a }
                        r3 = r2
                        te3.n64 r3 = (te3.n64) r3     // Catch:{ Exception -> 0x014a }
                        long r14 = r3.f298897d     // Catch:{ Exception -> 0x014a }
                        long r7 = r3.f298898e     // Catch:{ Exception -> 0x014a }
                        te3.m64 r10 = r3.f298899f     // Catch:{ Exception -> 0x014a }
                        java.lang.String r2 = r3.f298901h     // Catch:{ Exception -> 0x014a }
                        if (r2 != 0) goto L_0x0041
                        java.lang.String r2 = ""
                    L_0x0041:
                        r9 = r2
                        java.lang.String r2 = "MicroMsg.NetSceneNewSyncAlbum"
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014a }
                        r4.<init>()     // Catch:{ Exception -> 0x014a }
                        java.lang.String r5 = "process action "
                        r4.append(r5)     // Catch:{ Exception -> 0x014a }
                        int r5 = r10.f298777h     // Catch:{ Exception -> 0x014a }
                        r4.append(r5)     // Catch:{ Exception -> 0x014a }
                        java.lang.String r5 = " "
                        r4.append(r5)     // Catch:{ Exception -> 0x014a }
                        r4.append(r14)     // Catch:{ Exception -> 0x014a }
                        java.lang.String r5 = " "
                        r4.append(r5)     // Catch:{ Exception -> 0x014a }
                        r4.append(r9)     // Catch:{ Exception -> 0x014a }
                        java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x014a }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ Exception -> 0x014a }
                        int r2 = r10.f298777h     // Catch:{ Exception -> 0x014a }
                        switch(r2) {
                            case 9: goto L_0x00d6;
                            case 10: goto L_0x00cb;
                            case 11: goto L_0x00c0;
                            case 12: goto L_0x00b5;
                            case 13: goto L_0x00aa;
                            case 14: goto L_0x00a0;
                            case 15: goto L_0x0084;
                            case 16: goto L_0x007e;
                            case 17: goto L_0x0077;
                            default: goto L_0x0070;
                        }     // Catch:{ Exception -> 0x014a }
                    L_0x0070:
                        r16 = r10
                        com.tencent.p014mm.plugin.sns.model.C94886k0.m120342p1(r3)     // Catch:{ Exception -> 0x014a }
                        goto L_0x00e0
                    L_0x0077:
                        r11.mo131064r1(r14)     // Catch:{ Exception -> 0x014a }
                    L_0x007a:
                        r16 = r10
                        goto L_0x00e0
                    L_0x007e:
                        te3.yq3 r2 = r10.f298788v     // Catch:{ Exception -> 0x014a }
                        r11.mo131063q1(r14, r2, r3)     // Catch:{ Exception -> 0x014a }
                        goto L_0x007a
                    L_0x0084:
                        os2.C35299v.m40634b(r14)     // Catch:{ Exception -> 0x014a }
                        os2.e0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ Exception -> 0x014a }
                        com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r2.mo139806SE(r14)     // Catch:{ Exception -> 0x014a }
                        com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r2.getTimeLine()     // Catch:{ Exception -> 0x014a }
                        r3.showFlag = r12     // Catch:{ Exception -> 0x014a }
                        r2.setTimeLine(r3)     // Catch:{ Exception -> 0x014a }
                        os2.e0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ Exception -> 0x014a }
                        r3.yu0(r14, r2)     // Catch:{ Exception -> 0x014a }
                        goto L_0x007a
                    L_0x00a0:
                        r2 = r11
                        r4 = r10
                        r5 = r14
                        r16 = r10
                        r10 = r0
                        r2.mo131061n1(r3, r4, r5, r7, r9, r10)     // Catch:{ Exception -> 0x014a }
                        goto L_0x00e0
                    L_0x00aa:
                        r16 = r10
                        r2 = r11
                        r4 = r16
                        r5 = r14
                        r10 = r0
                        r2.mo131062o1(r3, r4, r5, r7, r9, r10)     // Catch:{ Exception -> 0x014a }
                        goto L_0x00e0
                    L_0x00b5:
                        r16 = r10
                        r2 = r11
                        r4 = r16
                        r5 = r14
                        r10 = r0
                        r2.mo131059l1(r3, r4, r5, r7, r9, r10)     // Catch:{ Exception -> 0x014a }
                        goto L_0x00e0
                    L_0x00c0:
                        r16 = r10
                        r2 = r11
                        r4 = r16
                        r5 = r14
                        r10 = r0
                        r2.mo131065s1(r3, r4, r5, r7, r9, r10)     // Catch:{ Exception -> 0x014a }
                        goto L_0x00e0
                    L_0x00cb:
                        r16 = r10
                        r2 = r11
                        r4 = r16
                        r5 = r14
                        r10 = r0
                        r2.mo131058k1(r3, r4, r5, r7, r9, r10)     // Catch:{ Exception -> 0x014a }
                        goto L_0x00e0
                    L_0x00d6:
                        r16 = r10
                        r2 = r11
                        r4 = r16
                        r5 = r14
                        r10 = r0
                        r2.mo131060m1(r3, r4, r5, r7, r9, r10)     // Catch:{ Exception -> 0x014a }
                    L_0x00e0:
                        java.lang.Class<iu2.e> r2 = iu2.C60631e.class
                        byte[] r3 = i40.C60247c.f171776h     // Catch:{ Exception -> 0x014a }
                        monitor-enter(r3)     // Catch:{ Exception -> 0x014a }
                        f40.e r4 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0147 }
                        r4.mo121108c()     // Catch:{ all -> 0x0147 }
                        java.lang.Class<i40.c> r4 = i40.C60247c.class
                        boolean r4 = r4.isAssignableFrom(r2)     // Catch:{ all -> 0x0147 }
                        if (r4 == 0) goto L_0x013f
                        androidx.lifecycle.k0 r4 = new androidx.lifecycle.k0     // Catch:{ all -> 0x0147 }
                        f40.e r5 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0147 }
                        f40.a r5 = r5.f251755f     // Catch:{ all -> 0x0147 }
                        i40.c$a$a r6 = new i40.c$a$a     // Catch:{ all -> 0x0147 }
                        r6.<init>()     // Catch:{ all -> 0x0147 }
                        r4.<init>((androidx.lifecycle.C0123n0) r5, (androidx.lifecycle.C54209k0.C54210b) r6)     // Catch:{ all -> 0x0147 }
                        androidx.lifecycle.i0 r2 = r4.mo75002a(r2)     // Catch:{ all -> 0x0147 }
                        monitor-exit(r3)     // Catch:{ Exception -> 0x014a }
                        iu2.e r2 = (iu2.C60631e) r2     // Catch:{ Exception -> 0x014a }
                        java.lang.Class<iu2.d> r3 = iu2.C98802d.class
                        com.tencent.mm.sdk.storage.mvvm.MvvmStorage r2 = r2.mo85233d3(r3)     // Catch:{ Exception -> 0x014a }
                        iu2.d r2 = (iu2.C98802d) r2     // Catch:{ Exception -> 0x014a }
                        com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r3 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion     // Catch:{ Exception -> 0x014a }
                        com.tencent.mm.sdk.storage.observer.StorageEventId r3 = r3.getUPDATE()     // Catch:{ Exception -> 0x014a }
                        r2.mo138178i3(r14, r3)     // Catch:{ Exception -> 0x014a }
                        r2 = r16
                        int r3 = r2.f298787u     // Catch:{ Exception -> 0x014a }
                        r4 = 2
                        boolean r3 = gv2.C98242p.m126942d(r3, r4)     // Catch:{ Exception -> 0x014a }
                        if (r3 != 0) goto L_0x0129
                        r3 = 1
                        goto L_0x012a
                    L_0x0129:
                        r3 = 0
                    L_0x012a:
                        com.tencent.mm.sdk.platformtools.MMHandler r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()     // Catch:{ Exception -> 0x014a }
                        com.tencent.mm.plugin.sns.model.j0 r5 = new com.tencent.mm.plugin.sns.model.j0     // Catch:{ Exception -> 0x014a }
                        r5.<init>(r11, r3, r2, r0)     // Catch:{ Exception -> 0x014a }
                        r4.post(r5)     // Catch:{ Exception -> 0x014a }
                        java.lang.String r0 = "processSnsAction"
                        java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                        goto L_0x015d
                    L_0x013f:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0147 }
                        java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
                        r0.<init>(r2)     // Catch:{ all -> 0x0147 }
                        throw r0     // Catch:{ all -> 0x0147 }
                    L_0x0147:
                        r0 = move-exception
                        monitor-exit(r3)     // Catch:{ Exception -> 0x014a }
                        throw r0     // Catch:{ Exception -> 0x014a }
                    L_0x014a:
                        r0 = move-exception
                        java.lang.String r2 = "MicroMsg.NetSceneNewSyncAlbum"
                        java.lang.String r3 = ""
                        java.lang.Object[] r4 = new java.lang.Object[r13]
                        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
                        java.lang.String r0 = "processSnsAction"
                        java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                        r12 = 0
                    L_0x015d:
                        if (r12 != 0) goto L_0x0168
                        com.tencent.mm.plugin.sns.model.k0$a$a r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.C94887a.C94888a.this
                        com.tencent.mm.plugin.sns.model.k0$a r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.C94887a.this
                        com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f274968b
                        r0.sendEmptyMessage(r13)
                    L_0x0168:
                        java.lang.String r0 = "run"
                        java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1$2"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94886k0.C94887a.C94888a.C94890b.run():void");
                }
            }

            public C94888a() {
            }

            public void handleMessage(Message message) {
                SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
                C86709a0.m107528h();
                if (!C86709a0.m107523b().mo121114l()) {
                    SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
                    return;
                }
                LinkedList<C50886px> linkedList = C94887a.this.f274967a;
                if (linkedList == null || linkedList.isEmpty()) {
                    C94886k0 k0Var = C94886k0.this;
                    k0Var.getClass();
                    SnsMethodCalculate.markStartTimeMs("processEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                    C47350c cVar = k0Var.f274964e;
                    l84 l84 = (l84) cVar.f127056b.f127083a;
                    k84 k84 = (k84) cVar.f127055a.f127080a;
                    byte[] c = C101126c1.m132546c(k84.f136615e.f140574f.mo123703f(), l84.f137258f.f140574f.mo123703f());
                    if (c != null && c.length > 0) {
                        C118000d0.f352701a.mo182758c(c, true);
                    }
                    k84.f136615e.mo73350k(c);
                    if ((k84.f136614d & l84.f137257e) == 0) {
                        k0Var.f274965f.onSceneEnd(0, 0, "", k0Var);
                        SnsMethodCalculate.markEndTimeMs("processEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                    } else {
                        k0Var.doScene(k0Var.dispatcher(), k0Var.f274965f);
                        SnsMethodCalculate.markEndTimeMs("processEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                    }
                    SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
                    return;
                }
                C50886px first = C94887a.this.f274967a.getFirst();
                Log.m105918d("MicroMsg.NetSceneNewSyncAlbum", "cmdId = " + first.f140037d);
                C94887a.this.f274967a.removeFirst();
                int i = first.f140037d;
                if (i == 45) {
                    C94866e1.my0().post(new C94889a(first));
                } else if (i != 46) {
                    C94887a.this.f274968b.sendEmptyMessage(0);
                } else {
                    C94866e1.my0().post(new C94890b(first));
                }
                SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
            }
        }

        public C94887a() {
        }
    }

    public C94886k0(int i) {
        Log.m105925i("MicroMsg.NetSceneNewSyncAlbum", "NetSceneSnsSync %d", Integer.valueOf(i));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new k84();
        bVar.f127067b = new l84();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnssync";
        bVar.f127069d = JsApiCheckIsSupportFaceDetect.CTRL_INDEX;
        bVar.f127070e = 102;
        bVar.f127071f = 1000000102;
        C47350c a = bVar.mo72403a();
        this.f274964e = a;
        ((k84) a.f127055a.f127080a).f136614d = i;
        this.f274963d = C75592q0.m90789s();
        if (f274962j) {
            SnsMethodCalculate.markStartTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            C86709a0.m107528h();
            sb.append(C86709a0.m107535s().f251807e);
            sb.append("ad_1100007");
            String sb4 = sb.toString();
            Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "filepath to list  " + sb4);
            byte[] O = C86013q1.m106433O(sb4, 0, -1);
            if (O == null) {
                SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            } else {
                try {
                    f274961i = (C47094b) new C47094b().parseFrom(O);
                    Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "fileToList " + (System.currentTimeMillis() - currentTimeMillis));
                    if (f274961i == null) {
                        Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId parser error");
                    } else {
                        Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId size " + f274961i.f126556d.size());
                    }
                    SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", e, "", new Object[0]);
                    C86013q1.m106447h(sb4);
                    SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                }
            }
            f274962j = false;
        }
    }

    /* renamed from: j1 */
    public static void m120341j1() {
        SnsMethodCalculate.markStartTimeMs("notifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        for (C97624e3 next : f274960h) {
            if (next != null) {
                next.mo25929y0();
            }
        }
        SnsMethodCalculate.markEndTimeMs("notifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r2v0, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x013b A[Catch:{ Exception -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01c1 A[Catch:{ Exception -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x022f  */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m120342p1(te3.n64 r24) {
        /*
            r0 = r24
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            java.lang.String r8 = "MicroMsg.NetSceneNewSyncAlbum"
            java.lang.String r9 = "processNormalAction"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            r11 = 0
            te3.m64 r12 = r0.f298899f     // Catch:{ Exception -> 0x023f }
            long r13 = r0.f298897d     // Catch:{ Exception -> 0x023f }
            java.lang.String r2 = r0.f298901h     // Catch:{ Exception -> 0x023f }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ Exception -> 0x023f }
            long r6 = r0.f298898e     // Catch:{ Exception -> 0x023f }
            k40.a r2 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x023f }
            lc3.b r2 = (lc3.C10485b) r2     // Catch:{ Exception -> 0x023f }
            pj.f r2 = r2.vh0()     // Catch:{ Exception -> 0x023f }
            java.lang.String r3 = "SnsAdNotifyLimit"
            java.lang.String r2 = r2.mo107405c(r3)     // Catch:{ Exception -> 0x023f }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r11)     // Catch:{ Exception -> 0x023f }
            k40.a r2 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x023f }
            lc3.b r2 = (lc3.C10485b) r2     // Catch:{ Exception -> 0x023f }
            pj.f r2 = r2.vh0()     // Catch:{ Exception -> 0x023f }
            java.lang.String r3 = "SnsAdNotifyLikeTimeLimit"
            java.lang.String r2 = r2.mo107405c(r3)     // Catch:{ Exception -> 0x023f }
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r11)     // Catch:{ Exception -> 0x023f }
            k40.a r1 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x023f }
            lc3.b r1 = (lc3.C10485b) r1     // Catch:{ Exception -> 0x023f }
            pj.f r1 = r1.vh0()     // Catch:{ Exception -> 0x023f }
            java.lang.String r2 = "SnsAdNotifyCommentTimeLimit"
            java.lang.String r1 = r1.mo107405c(r2)     // Catch:{ Exception -> 0x023f }
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r11)     // Catch:{ Exception -> 0x023f }
            java.lang.String r1 = " snsId: "
            r2 = 7
            r11 = 8
            r16 = r6
            java.lang.String r7 = " "
            if (r5 > 0) goto L_0x0073
            if (r4 > 0) goto L_0x0073
            if (r3 <= 0) goto L_0x0067
            goto L_0x0073
        L_0x0067:
            r11 = r5
            r21 = r16
            r23 = r9
            r9 = r1
            r1 = r10
            r10 = r7
            r7 = r23
            goto L_0x00f7
        L_0x0073:
            int r6 = r12.f298777h     // Catch:{ Exception -> 0x023f }
            if (r6 == r11) goto L_0x0079
            if (r6 != r2) goto L_0x0067
        L_0x0079:
            r18 = 1
            r6 = r1
            r1 = r13
            r19 = r3
            r3 = r24
            r20 = r4
            r4 = r5
            r11 = r5
            r5 = r20
            r21 = r16
            r16 = r9
            r9 = r6
            r6 = r19
            r17 = r10
            r10 = r7
            r7 = r18
            boolean r1 = com.tencent.p014mm.plugin.sns.model.C94833a.m120149b(r1, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0239 }
            if (r1 != 0) goto L_0x00f3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec }
            r1.<init>()     // Catch:{ Exception -> 0x00ec }
            java.lang.String r2 = "pass the comment clientId "
            r1.append(r2)     // Catch:{ Exception -> 0x00ec }
            r1.append(r15)     // Catch:{ Exception -> 0x00ec }
            r1.append(r9)     // Catch:{ Exception -> 0x00ec }
            r1.append(r13)     // Catch:{ Exception -> 0x00ec }
            r1.append(r10)     // Catch:{ Exception -> 0x00ec }
            long r2 = r12.f298785s     // Catch:{ Exception -> 0x00ec }
            r1.append(r2)     // Catch:{ Exception -> 0x00ec }
            r1.append(r10)     // Catch:{ Exception -> 0x00ec }
            int r2 = r12.f298782p     // Catch:{ Exception -> 0x00ec }
            r1.append(r2)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r2 = " actionLimit:"
            r1.append(r2)     // Catch:{ Exception -> 0x00ec }
            r1.append(r11)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r2 = " actionLikeTimeLimit:"
            r1.append(r2)     // Catch:{ Exception -> 0x00ec }
            r2 = r20
            r1.append(r2)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r2 = " actionCommentTimeLimit:"
            r1.append(r2)     // Catch:{ Exception -> 0x00ec }
            r2 = r19
            r1.append(r2)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)     // Catch:{ Exception -> 0x00ec }
            com.tencent.p014mm.plugin.sns.model.C94833a.m120166s(r13, r0)     // Catch:{ Exception -> 0x00ec }
            r7 = r16
            r1 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r1)
        L_0x00ea:
            r1 = 0
            return r1
        L_0x00ec:
            r0 = move-exception
            r1 = r17
            r9 = r16
            goto L_0x0241
        L_0x00f3:
            r7 = r16
            r1 = r17
        L_0x00f7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0236 }
            r2.<init>()     // Catch:{ Exception -> 0x0236 }
            java.lang.String r3 = "processNormalAction clientId "
            r2.append(r3)     // Catch:{ Exception -> 0x0236 }
            r2.append(r15)     // Catch:{ Exception -> 0x0236 }
            r2.append(r9)     // Catch:{ Exception -> 0x0236 }
            r2.append(r13)     // Catch:{ Exception -> 0x0236 }
            r2.append(r10)     // Catch:{ Exception -> 0x0236 }
            long r3 = r12.f298785s     // Catch:{ Exception -> 0x0236 }
            r2.append(r3)     // Catch:{ Exception -> 0x0236 }
            r2.append(r10)     // Catch:{ Exception -> 0x0236 }
            int r3 = r12.f298782p     // Catch:{ Exception -> 0x0236 }
            r2.append(r3)     // Catch:{ Exception -> 0x0236 }
            java.lang.String r3 = " actionLimit: "
            r2.append(r3)     // Catch:{ Exception -> 0x0236 }
            r2.append(r11)     // Catch:{ Exception -> 0x0236 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0236 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)     // Catch:{ Exception -> 0x0236 }
            os2.x r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0236 }
            java.lang.String r5 = r12.f298773d     // Catch:{ Exception -> 0x0236 }
            int r6 = r12.f298779j     // Catch:{ Exception -> 0x0236 }
            r3 = r13
            r9 = r7
            r7 = r15
            boolean r2 = r2.mo139890SE(r3, r5, r6, r7)     // Catch:{ Exception -> 0x0234 }
            if (r2 != 0) goto L_0x022f
            te3.m64 r2 = r0.f298900g     // Catch:{ Exception -> 0x0234 }
            os2.w r3 = new os2.w     // Catch:{ Exception -> 0x0234 }
            r3.<init>()     // Catch:{ Exception -> 0x0234 }
            r3.field_snsID = r13     // Catch:{ Exception -> 0x0234 }
            r4 = r21
            r3.field_parentID = r4     // Catch:{ Exception -> 0x0234 }
            int r4 = r12.f298779j     // Catch:{ Exception -> 0x0234 }
            r3.field_createTime = r4     // Catch:{ Exception -> 0x0234 }
            java.lang.String r4 = r12.f298773d     // Catch:{ Exception -> 0x0234 }
            r3.field_talker = r4     // Catch:{ Exception -> 0x0234 }
            int r4 = r12.f298777h     // Catch:{ Exception -> 0x0234 }
            r3.field_type = r4     // Catch:{ Exception -> 0x0234 }
            byte[] r4 = r12.toByteArray()     // Catch:{ Exception -> 0x0234 }
            r3.field_curActionBuf = r4     // Catch:{ Exception -> 0x0234 }
            byte[] r2 = r2.toByteArray()     // Catch:{ Exception -> 0x0234 }
            r3.field_refActionBuf = r2     // Catch:{ Exception -> 0x0234 }
            r3.field_clientId = r15     // Catch:{ Exception -> 0x0234 }
            int r2 = r12.f298787u     // Catch:{ Exception -> 0x0234 }
            r4 = 2
            boolean r2 = gv2.C98242p.m126942d(r2, r4)     // Catch:{ Exception -> 0x0234 }
            r5 = 1
            if (r2 == 0) goto L_0x016e
            r2 = 1
            goto L_0x016f
        L_0x016e:
            r2 = 0
        L_0x016f:
            r3.field_isSilence = r2     // Catch:{ Exception -> 0x0234 }
            int r2 = r12.f298777h     // Catch:{ Exception -> 0x0234 }
            r6 = 8
            if (r2 == r6) goto L_0x018b
            r6 = 7
            if (r2 != r6) goto L_0x017b
            goto L_0x018b
        L_0x017b:
            int r2 = r12.f298782p     // Catch:{ Exception -> 0x0234 }
            long r6 = (long) r2     // Catch:{ Exception -> 0x0234 }
            r3.field_commentSvrID = r6     // Catch:{ Exception -> 0x0234 }
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120380r(r13, r0)     // Catch:{ Exception -> 0x0234 }
            if (r0 != 0) goto L_0x01b9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            goto L_0x00ea
        L_0x018b:
            long r6 = r12.f298785s     // Catch:{ Exception -> 0x0234 }
            r3.field_commentSvrID = r6     // Catch:{ Exception -> 0x0234 }
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94833a.m120166s(r13, r0)     // Catch:{ Exception -> 0x0234 }
            if (r0 != 0) goto L_0x01b9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0234 }
            r0.<init>()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r2 = "pass comment ID "
            r0.append(r2)     // Catch:{ Exception -> 0x0234 }
            long r4 = r3.field_snsID     // Catch:{ Exception -> 0x0234 }
            r0.append(r4)     // Catch:{ Exception -> 0x0234 }
            r0.append(r10)     // Catch:{ Exception -> 0x0234 }
            long r2 = r3.field_commentSvrID     // Catch:{ Exception -> 0x0234 }
            r0.append(r2)     // Catch:{ Exception -> 0x0234 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0234 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ Exception -> 0x0234 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            goto L_0x00ea
        L_0x01b9:
            java.util.LinkedList<te3.c74> r0 = r12.f298789w     // Catch:{ Exception -> 0x0234 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)     // Catch:{ Exception -> 0x0234 }
            if (r0 != 0) goto L_0x0217
            java.util.LinkedList<te3.c74> r0 = r12.f298789w     // Catch:{ Exception -> 0x0234 }
            r2 = 0
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0215 }
            if (r0 == 0) goto L_0x0217
            java.util.LinkedList<te3.c74> r0 = r12.f298789w     // Catch:{ Exception -> 0x0215 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0215 }
            te3.c74 r0 = (te3.c74) r0     // Catch:{ Exception -> 0x0234 }
            com.tencent.mm.storage.emotion.EmojiInfo r0 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120364b(r0)     // Catch:{ Exception -> 0x0234 }
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()     // Catch:{ Exception -> 0x0234 }
            wh3.g r2 = r2.mo57717d()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r6 = r0.field_md5     // Catch:{ Exception -> 0x0234 }
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r2.mo142044TO(r6)     // Catch:{ Exception -> 0x0234 }
            if (r2 != 0) goto L_0x0217
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()     // Catch:{ Exception -> 0x0234 }
            wh3.g r2 = r2.mo57717d()     // Catch:{ Exception -> 0x0234 }
            r2.insert(r0)     // Catch:{ Exception -> 0x0234 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ Exception -> 0x0234 }
            if (r2 != 0) goto L_0x020e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE     // Catch:{ Exception -> 0x0234 }
            if (r2 != 0) goto L_0x020e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x0234 }
            if (r2 != 0) goto L_0x020e
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0234 }
            h81.h r2 = (h81.C32735h) r2     // Catch:{ Exception -> 0x0234 }
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_sns_emoji_auto_download     // Catch:{ Exception -> 0x0234 }
            r7 = 0
            int r2 = r2.mo58779Qe(r6, r7)     // Catch:{ Exception -> 0x0234 }
            if (r2 != r5) goto L_0x0217
        L_0x020e:
            wk.e r2 = p260wk.C102457e.f301712a     // Catch:{ Exception -> 0x0234 }
            r6 = 0
            r2.mo142073e(r0, r6)     // Catch:{ Exception -> 0x0234 }
            goto L_0x0217
        L_0x0215:
            r0 = move-exception
            goto L_0x0242
        L_0x0217:
            os2.x r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0234 }
            r0.insert(r3)     // Catch:{ Exception -> 0x0234 }
            os2.x r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0234 }
            int r2 = r12.f298787u     // Catch:{ Exception -> 0x0234 }
            boolean r2 = gv2.C98242p.m126942d(r2, r4)     // Catch:{ Exception -> 0x0234 }
            r0.mo139891TE(r13, r2)     // Catch:{ Exception -> 0x0234 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            return r5
        L_0x022f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            goto L_0x00ea
        L_0x0234:
            r0 = move-exception
            goto L_0x0241
        L_0x0236:
            r0 = move-exception
            r9 = r7
            goto L_0x0241
        L_0x0239:
            r0 = move-exception
            r9 = r16
            r1 = r17
            goto L_0x0241
        L_0x023f:
            r0 = move-exception
            r1 = r10
        L_0x0241:
            r2 = 0
        L_0x0242:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r4, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94886k0.m120342p1(te3.n64):boolean");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        byte[] a = C118000d0.f352701a.mo182756a();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(a);
        C47350c cVar = this.f274964e;
        ((k84) cVar.f127055a.f127080a).f136615e = qv32;
        this.f274965f = nVar;
        int dispatch = dispatch(gVar, cVar, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return JsApiCheckIsSupportFaceDetect.CTRL_INDEX;
    }

    /* renamed from: k1 */
    public final boolean mo131058k1(n64 n64, m64 m64, long j, long j2, String str, MMHandler mMHandler) {
        SnsMethodCalculate.markStartTimeMs("processAdCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        C100420w qq = C94866e1.Tx0().mo139897qq(j, m64.f298785s, m64.f298777h);
        if (qq != null) {
            qq.mo139887m2();
            boolean update = C94866e1.Tx0().update(qq.systemRowid, qq);
            C94897n1.m120375m(j, n64);
            Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", " setdel ad flag  " + update);
            SnsMethodCalculate.markEndTimeMs("processAdCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("processAdCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    /* renamed from: l1 */
    public final boolean mo131059l1(n64 n64, m64 m64, long j, long j2, String str, MMHandler mMHandler) {
        SnsMethodCalculate.markStartTimeMs("processAdSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        C100421x Tx0 = C94866e1.Tx0();
        String str2 = m64.f298773d;
        Tx0.getClass();
        SnsMethodCalculate.markStartTimeMs("setCommentDeleted", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        String str3 = " update SnsComment set commentflag = 1 where snsID = " + j + " and " + "talker" + " = '" + Util.escapeSqlValue(str2) + "'";
        Log.m105924i("MicroMsg.SnsCommentStorage", "set sns del  by username " + str3);
        boolean execSQL = Tx0.f294191d.execSQL("SnsComment", str3);
        if (execSQL) {
            Tx0.doNotify();
        }
        SnsMethodCalculate.markEndTimeMs("setCommentDeleted", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "processAdSnsDelAction " + execSQL);
        C94897n1.m120375m(j, n64);
        SnsMethodCalculate.markEndTimeMs("processAdSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    /* renamed from: m1 */
    public final boolean mo131060m1(n64 n64, m64 m64, long j, long j2, String str, MMHandler mMHandler) {
        m64 m642 = m64;
        long j3 = j;
        SnsMethodCalculate.markStartTimeMs("processCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        C100421x Tx0 = C94866e1.Tx0();
        int i = m642.f298777h;
        C100420w qq = Tx0.mo139897qq(j, (long) m642.f298782p, i);
        if (qq != null) {
            qq.mo139887m2();
            boolean update = C94866e1.Tx0().update(qq.systemRowid, qq);
            int i2 = C94897n1.f274990d;
            SnsMethodCalculate.markStartTimeMs("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            Log.m105924i("MicroMsg.SnsInfoStorageLogic", "deleteComment");
            m64 m643 = n64.f298899f;
            if (m643.f298777h != 9) {
                SnsMethodCalculate.markEndTimeMs("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            } else {
                SnsInfo SE = C94866e1.Yx0().mo139806SE(j3);
                if (SE == null) {
                    SnsMethodCalculate.markEndTimeMs("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                } else {
                    try {
                        SnsObject snsObject = (SnsObject) new SnsObject().parseFrom(SE.field_attrBuf);
                        snsObject.f283891Id = j3;
                        Iterator<w64> it = snsObject.CommentUserList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            w64 next = it.next();
                            if (next.f299709j == m643.f298782p && !Util.isNullOrNil(next.f299703d)) {
                                if (!next.f299703d.equals(m643.f298773d)) {
                                    if (next.f299703d.equals(C75592q0.m90789s())) {
                                        if (next.f299703d.equals(C75592q0.m90789s())) {
                                            Log.m105925i("MicroMsg.SnsInfoStorageLogic", "commentUsername:%s, actionUsername:%s, markDeleteFlag:%s", next.f299703d, m643.f298773d, Integer.valueOf(next.f299709j));
                                            next.f299715s = 1;
                                        }
                                    }
                                }
                                Log.m105925i("MicroMsg.SnsInfoStorageLogic", "commentUsername:%s, actionUsername:%s, removeComment:%s", next.f299703d, m643.f298773d, Integer.valueOf(next.f299709j));
                                snsObject.CommentUserList.remove(next);
                            }
                        }
                        SE.setAttrBuf(snsObject.toByteArray());
                        C94866e1.Yx0().xs0(snsObject.f283891Id, SE);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e, "", new Object[0]);
                    }
                    SnsMethodCalculate.markEndTimeMs("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                }
            }
            Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", " setdel flag  " + update);
            SnsMethodCalculate.markEndTimeMs("processCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("processCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return false;
    }

    /* renamed from: n1 */
    public final boolean mo131061n1(n64 n64, m64 m64, long j, long j2, String str, MMHandler mMHandler) {
        m64 m642 = m64;
        long j3 = j;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        try {
            Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "processGrabHbAction clientId " + str2 + " snsId: " + j3 + " " + m642.f298785s + " " + m642.f298782p);
            if (!C94866e1.Tx0().mo139890SE(j, m642.f298773d, m642.f298779j, str)) {
                m64 m643 = n64.f298900g;
                C100420w wVar = new C100420w();
                wVar.field_snsID = j3;
                wVar.field_parentID = j2;
                wVar.field_createTime = m642.f298779j;
                wVar.field_talker = m642.f298773d;
                wVar.field_type = m642.f298777h;
                wVar.field_curActionBuf = m64.toByteArray();
                wVar.field_refActionBuf = m643.toByteArray();
                wVar.field_clientId = str2;
                wVar.field_commentSvrID = (long) m642.f298782p;
                C51101rf2 rf22 = new C51101rf2();
                Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "curAction.HBBuffer " + m642.f298786t);
                rf22.parseFrom(C48374j0.m53715d(m642.f298786t));
                Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "hbbuffer  " + rf22.f140881d);
                C94866e1.Tx0().insert(wVar);
                SnsMethodCalculate.markEndTimeMs("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                return true;
            }
            SnsMethodCalculate.markEndTimeMs("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return false;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + e.getMessage());
            Log.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return false;
        }
    }

    /* renamed from: o1 */
    public final boolean mo131062o1(n64 n64, m64 m64, long j, long j2, String str, MMHandler mMHandler) {
        n64 n642 = n64;
        m64 m642 = m64;
        long j3 = j;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        try {
            Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "processHbAction clientId " + str2 + " snsId: " + j3 + " " + m642.f298785s + " " + m642.f298782p);
            if (!C28128e.m38101c()) {
                Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "passed because close lucky");
                SnsMethodCalculate.markEndTimeMs("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                return false;
            }
            if (!C94866e1.Tx0().mo139890SE(j, m642.f298773d, m642.f298779j, str)) {
                m64 m643 = n642.f298900g;
                C100420w wVar = new C100420w();
                wVar.field_snsID = j3;
                wVar.field_parentID = j2;
                wVar.field_createTime = m642.f298779j;
                wVar.field_talker = m642.f298773d;
                wVar.field_type = m642.f298777h;
                wVar.field_curActionBuf = m64.toByteArray();
                wVar.field_refActionBuf = m643.toByteArray();
                wVar.field_clientId = str2;
                wVar.field_commentSvrID = (long) m642.f298782p;
                Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "curAction.HBBuffer " + m642.f298786t);
                C94897n1.m120381s(j3, n642);
                SnsMethodCalculate.markStartTimeMs("notifyHbReward", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                for (C97624e3 next : f274960h) {
                    if (next != null) {
                        next.mo25910l4(j3);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("notifyHbReward", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                C94866e1.Tx0().insert(wVar);
                SnsMethodCalculate.markEndTimeMs("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                return true;
            }
            SnsMethodCalculate.markEndTimeMs("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return false;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + e.getMessage());
            Log.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return false;
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C89349b bVar;
        byte[] c;
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        Log.m105918d("MicroMsg.NetSceneNewSyncAlbum", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (i2 == 0 && i3 == 0) {
            C47350c cVar = (C47350c) uVar;
            l84 l84 = (l84) cVar.f127056b.f127083a;
            LinkedList<C50886px> linkedList = l84.f137256d.f140594e;
            if (linkedList == null || linkedList.size() <= 0) {
                C51018qv3 qv32 = l84.f137258f;
                if (!(qv32 == null || (bVar = qv32.f140574f) == null || (c = C101126c1.m132546c(((k84) cVar.f127055a.f127080a).f136615e.f140574f.mo123703f(), bVar.mo123703f())) == null || c.length <= 0)) {
                    C118000d0.f352701a.mo182758c(c, true);
                }
                this.f274965f.onSceneEnd(i2, i3, str, this);
            } else {
                Log.m105918d("MicroMsg.NetSceneNewSyncAlbum", "cmlList size:" + linkedList.size());
                C94887a aVar = this.f274966g;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("delaWithCmdList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler");
                aVar.f274967a = linkedList;
                aVar.f274968b.sendEmptyMessage(0);
                SnsMethodCalculate.markEndTimeMs("delaWithCmdList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler");
            }
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return;
        }
        this.f274965f.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
    }

    /* renamed from: q1 */
    public final void mo131063q1(long j, C52156yq3 yq32, n64 n64) {
        long j2;
        C100420w wVar;
        m64 m64;
        m64 m642;
        long j3 = j;
        C52156yq3 yq33 = yq32;
        n64 n642 = n64;
        Class cls = C10485b.class;
        SnsMethodCalculate.markStartTimeMs("processSnsAdAtCommentAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        if (C94835a0.m120174j1(j)) {
            C94835a0 a0Var = new C94835a0(j3, 2, yq33);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(a0Var);
        }
        m64 m643 = n642.f298899f;
        String nullAsNil = Util.nullAsNil(n642.f298901h);
        long j4 = n642.f298898e;
        int i = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("SnsAdNotifyLimit"), 0);
        int i2 = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("SnsAdNotifyLikeTimeLimit"), 0);
        int i3 = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("SnsAdNotifyCommentTimeLimit"), 0);
        if (yq33 != null) {
            j2 = j4;
            Log.m105925i("MicroMsg.NetSceneNewSyncAlbum", "processAdAtAction clientId %s, snsId %s, aid64 %s, aid %s, commentId %s, actionLimit %s", nullAsNil, Long.valueOf(j), Long.valueOf(yq33.f145470i), Integer.valueOf(yq33.f145465d), Integer.valueOf(m643.f298782p), Integer.valueOf(i));
            if (yq33.f145470i == 0 && yq33.f145465d == 0) {
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 4);
            }
        } else {
            j2 = j4;
            Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "remindFriendsInfo is null!");
            C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 3);
        }
        long j5 = j2;
        String str = nullAsNil;
        if (!C94866e1.Tx0().mo139890SE(j, m643.f298773d, m643.f298779j, nullAsNil)) {
            m64 m644 = n642.f298900g;
            C100420w wVar2 = new C100420w();
            wVar2.field_snsID = j3;
            wVar2.field_parentID = j5;
            wVar2.field_createTime = m643.f298779j;
            wVar2.field_talker = m643.f298773d;
            wVar2.field_type = m643.f298777h;
            wVar2.field_curActionBuf = m643.toByteArray();
            wVar2.field_refActionBuf = m644.toByteArray();
            wVar2.field_clientId = str;
            wVar2.field_isSilence = C98242p.m126942d(m643.f298787u, 2) ? 1 : 0;
            wVar2.field_commentSvrID = m643.f298785s;
            if (C94866e1.zx0().mo139862Yt(j3)) {
                if (i > 0 || i2 > 0 || i3 > 0) {
                    wVar = wVar2;
                    m642 = m643;
                    if (!C94833a.m120149b(j, n64, i, i2, i3, true)) {
                        Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "check comment fail, pass comment ID " + wVar.field_snsID + " " + wVar.field_commentSvrID);
                        SnsMethodCalculate.markEndTimeMs("processSnsAdAtCommentAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                        return;
                    }
                } else {
                    wVar = wVar2;
                    m642 = m643;
                }
                try {
                    if (!C94833a.m120166s(j3, n642)) {
                        Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "pass comment ID " + wVar.field_snsID + " " + wVar.field_commentSvrID);
                        SnsMethodCalculate.markEndTimeMs("processSnsAdAtCommentAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                        return;
                    }
                    m64 = m642;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", e, "", new Object[0]);
                }
            } else {
                wVar = wVar2;
                m64 = m643;
            }
            if (!Util.isNullOrNil((List) m64.f298789w) && m64.f298789w.get(0) != null) {
                EmojiInfo b = C94897n1.m120364b(m64.f298789w.get(0));
                if (C30790w2.m39221h().mo57717d().mo142044TO(b.field_md5) == null) {
                    C30790w2.m39221h().mo57717d().insert(b);
                    if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_emoji_auto_download, 0) == 1) {
                        C102457e.f301712a.mo142073e(b, (C92042f) null);
                    }
                }
            }
            C94866e1.Tx0().insert(wVar);
            C94866e1.Tx0().mo139891TE(j3, C98242p.m126942d(m64.f298787u, 2));
        }
        SnsMethodCalculate.markEndTimeMs("processSnsAdAtCommentAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e A[Catch:{ all -> 0x00a3 }] */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo131064r1(long r14) {
        /*
            r13 = this;
            java.lang.String r0 = "processSnsAdFeedsForceDelAction snsId="
            java.lang.String r1 = ", snsId="
            java.lang.String r2 = "MicroMsg.NetSceneNewSyncAlbum"
            java.lang.String r3 = "processSnsAdFeedsForceDelAction"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 0
            r6 = 0
            java.lang.String r7 = vr2.C102236a0.m134765q0(r14)     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r8.<init>()     // Catch:{ all -> 0x0072 }
            r8.append(r0)     // Catch:{ all -> 0x0072 }
            r8.append(r7)     // Catch:{ all -> 0x0072 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0072 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)     // Catch:{ all -> 0x0072 }
            os2.j r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()     // Catch:{ all -> 0x0072 }
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r8 = r8.mo139864jo(r14)     // Catch:{ all -> 0x0072 }
            if (r8 == 0) goto L_0x0042
            com.tencent.mm.plugin.sns.storage.ADInfo r9 = r8.getAdInfo()     // Catch:{ all -> 0x0072 }
            com.tencent.mm.plugin.sns.storage.ADXml r6 = r8.getAdXml()     // Catch:{ all -> 0x003d }
            r12 = r9
            r9 = r6
            r6 = r12
            goto L_0x0043
        L_0x003d:
            r0 = move-exception
            r12 = r9
            r9 = r6
            r6 = r12
            goto L_0x0078
        L_0x0042:
            r9 = r6
        L_0x0043:
            boolean r10 = rq2.C101418d.m133073c(r8)     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r11.<init>()     // Catch:{ all -> 0x006d }
            r11.append(r0)     // Catch:{ all -> 0x006d }
            r11.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = ", delSucc="
            r11.append(r0)     // Catch:{ all -> 0x006d }
            r11.append(r10)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = ", adSnsInfo==null?"
            r11.append(r0)     // Catch:{ all -> 0x006d }
            if (r8 != 0) goto L_0x0062
            r5 = 1
        L_0x0062:
            r11.append(r5)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x006d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x006d }
            goto L_0x0098
        L_0x006d:
            r0 = move-exception
            r5 = r10
            goto L_0x0078
        L_0x0070:
            r0 = move-exception
            goto L_0x0078
        L_0x0072:
            r0 = move-exception
            goto L_0x0077
        L_0x0074:
            r0 = move-exception
            java.lang.String r7 = ""
        L_0x0077:
            r9 = r6
        L_0x0078:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "processSnsAdFeedsForceDelAction exp="
            r8.append(r10)
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            r8.append(r1)
            r8.append(r7)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r10 = r5
        L_0x0098:
            r0 = 3
            vr2.C102259p.m134829b(r0, r14, r6, r9)     // Catch:{ all -> 0x00a3 }
            if (r10 == 0) goto L_0x00c3
            r0 = 4
            vr2.C102259p.m134829b(r0, r14, r6, r9)     // Catch:{ all -> 0x00a3 }
            goto L_0x00c3
        L_0x00a3:
            r14 = move-exception
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "processSnsAdFeedsForceDelAction report exp="
            r15.append(r0)
            java.lang.String r14 = r14.toString()
            r15.append(r14)
            r15.append(r1)
            r15.append(r7)
            java.lang.String r14 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r14)
        L_0x00c3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94886k0.mo131064r1(long):void");
    }

    /* renamed from: s1 */
    public final boolean mo131065s1(n64 n64, m64 m64, long j, long j2, String str, MMHandler mMHandler) {
        SnsMethodCalculate.markStartTimeMs("processSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        C100421x Tx0 = C94866e1.Tx0();
        Tx0.getClass();
        SnsMethodCalculate.markStartTimeMs("updateSnsDel", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        String str2 = " update SnsComment set commentflag = 2 where snsID = " + j;
        Log.m105924i("MicroMsg.SnsCommentStorage", "set sns del " + str2);
        boolean execSQL = Tx0.f294191d.execSQL("SnsComment", str2);
        if (execSQL) {
            Tx0.doNotify();
        }
        SnsMethodCalculate.markEndTimeMs("updateSnsDel", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "processSnsDelAction " + execSQL);
        SnsMethodCalculate.markEndTimeMs("processSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    public int securityLimitCount() {
        SnsMethodCalculate.markStartTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        SnsMethodCalculate.markEndTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return 10;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        SnsMethodCalculate.markStartTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        y$$d y__d = y$$d.EOk;
        SnsMethodCalculate.markEndTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return y__d;
    }

    public boolean uniqueInNetsceneQueue() {
        SnsMethodCalculate.markStartTimeMs("uniqueInNetsceneQueue", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        SnsMethodCalculate.markEndTimeMs("uniqueInNetsceneQueue", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }
}
