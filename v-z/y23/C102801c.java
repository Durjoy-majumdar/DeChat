package y23;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: y23.c */
public final class C102801c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C102799b f303497d;

    /* renamed from: e */
    public final /* synthetic */ long f303498e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102801c(C102799b bVar, long j) {
        super(0);
        this.f303497d = bVar;
        this.f303498e = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: f23.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: f23.b$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: f23.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: f23.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: f23.b$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r21 = this;
            r0 = r21
            y23.b r1 = r0.f303497d
            boolean r1 = r1.f303495g
            r2 = 1
            if (r1 == 0) goto L_0x000c
            r4 = r2
            goto L_0x000e
        L_0x000c:
            r4 = 4
        L_0x000e:
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct
            r1.<init>()
            f23.b r6 = new f23.b
            r6.<init>()
            y23.b r6 = r0.f303497d
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r6 = r6.f303493e
            java.lang.Class<q23.a> r7 = q23.C110351a.class
            lh2.g0 r6 = r6.mo151221j(r7)
            q23.a r6 = (q23.C110351a) r6
            if (r6 == 0) goto L_0x002b
            java.util.ArrayList r6 = r6.mo161846D()
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            y23.b r8 = r0.f303497d
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r8 = r8.f303493e
            java.lang.Class<v23.f> r9 = v23.C111348f.class
            lh2.g0 r8 = r8.mo151221j(r9)
            v23.f r8 = (v23.C111348f) r8
            if (r8 == 0) goto L_0x016a
            sp3.k r8 = r8.f333357h
            if (r8 == 0) goto L_0x016a
            y23.b r12 = r0.f303497d
            com.tencent.mm.plugin.vlog.model.p0 r13 = x23.C102552a.m135387a(r8)
            f23.b r14 = r12.f303494f
            java.util.ArrayList<f23.b$e> r14 = r14.f286948a
            r14.clear()
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r14 = r13.f282570c
            java.util.Iterator r14 = r14.iterator()
            r17 = r8
            r7 = 0
            r9 = 0
        L_0x0057:
            boolean r18 = r14.hasNext()
            r15 = 2
            if (r18 == 0) goto L_0x0101
            java.lang.Object r16 = r14.next()
            r11 = r16
            com.tencent.mm.plugin.vlog.model.q0 r11 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r11
            r16 = r14
            int r14 = r11.f316491b
            if (r14 != r15) goto L_0x0095
            long r9 = r9 + r2
            f23.b$f r14 = new f23.b$f
            r14.<init>()
            sp3.c r15 = r11.f316501l
            float r15 = r15.f331468f
            r14.f286963f = r15
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r15 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r2 = r11.f316490a
            rw.m$a r2 = r15.mo129930b(r2)
            if (r2 == 0) goto L_0x0092
            int r3 = r2.f180529e
            r14.f286962e = r3
            float r3 = r2.f180527c
            r14.f286961d = r3
            int r3 = r2.f180534j
            r14.f286964g = r3
            int r2 = r2.f180532h
            r14.f286965h = r2
        L_0x0092:
            r2 = 1
            goto L_0x00a4
        L_0x0095:
            r2 = 1
            if (r14 != r2) goto L_0x00a1
            r2 = 1
            long r7 = r7 + r2
            f23.b$d r14 = new f23.b$d
            r14.<init>()
            goto L_0x00a4
        L_0x00a1:
            r2 = 1
            r14 = 0
        L_0x00a4:
            if (r14 != 0) goto L_0x00a7
            goto L_0x00ab
        L_0x00a7:
            int r15 = r11.f316491b
            r14.f286958a = r15
        L_0x00ab:
            if (r14 == 0) goto L_0x00ba
            java.util.ArrayList<java.lang.Integer> r15 = r14.f286959b
            if (r15 == 0) goto L_0x00ba
            int r2 = r11.f316495f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15.add(r2)
        L_0x00ba:
            if (r14 == 0) goto L_0x00c9
            java.util.ArrayList<java.lang.Integer> r2 = r14.f286959b
            if (r2 == 0) goto L_0x00c9
            int r3 = r11.f316496g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
        L_0x00c9:
            if (r14 == 0) goto L_0x00dd
            java.util.ArrayList<java.lang.Long> r2 = r14.f286960c
            if (r2 == 0) goto L_0x00dd
            sp3.c r3 = r11.f316501l
            r19 = r7
            long r7 = r3.f331464b
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r2.add(r3)
            goto L_0x00df
        L_0x00dd:
            r19 = r7
        L_0x00df:
            if (r14 == 0) goto L_0x00f0
            java.util.ArrayList<java.lang.Long> r2 = r14.f286960c
            if (r2 == 0) goto L_0x00f0
            sp3.c r3 = r11.f316501l
            long r7 = r3.f331465c
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r2.add(r3)
        L_0x00f0:
            if (r14 == 0) goto L_0x00f9
            f23.b r2 = r12.f303494f
            java.util.ArrayList<f23.b$e> r2 = r2.f286948a
            r2.add(r14)
        L_0x00f9:
            r14 = r16
            r7 = r19
            r2 = 1
            goto L_0x0057
        L_0x0101:
            T r2 = r12.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r2 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) r2
            if (r2 != 0) goto L_0x0108
            goto L_0x010b
        L_0x0108:
            r3 = 1
            r2.f265753r = r3
        L_0x010b:
            if (r2 != 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r2.f265741f = r9
        L_0x0110:
            if (r2 != 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r2.f265742g = r7
        L_0x0115:
            if (r2 != 0) goto L_0x0118
            goto L_0x0123
        L_0x0118:
            boolean r3 = r13.f282576i
            if (r3 == 0) goto L_0x011f
            r7 = 1
            goto L_0x0121
        L_0x011f:
            r7 = 0
        L_0x0121:
            r2.f265748m = r7
        L_0x0123:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r17
            java.util.ArrayList<sp3.c> r3 = r3.f331511l
            java.util.Iterator r3 = r3.iterator()
        L_0x0130:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x015d
            java.lang.Object r7 = r3.next()
            sp3.c r7 = (sp3.C110801c) r7
            int r8 = r7.f331483u
            if (r8 != r15) goto L_0x0130
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            i33.b r9 = i33.C98595b.f289089a
            java.lang.String r7 = r7.f331482t
            int r7 = r9.mo137984b(r7)
            r8.append(r7)
            r7 = 35
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r2.append(r7)
            goto L_0x0130
        L_0x015d:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "VideoGOPStr"
            r7 = 1
            java.lang.String r2 = r1.mo86045b(r3, r2, r7)
            r1.f265752q = r2
        L_0x016a:
            y23.b r1 = r0.f303497d
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r1 = r1.f303493e
            java.lang.Class<j23.a> r2 = j23.C108531a.class
            lh2.g0 r1 = r1.mo151221j(r2)
            j23.a r1 = (j23.C108531a) r1
            if (r1 == 0) goto L_0x01ad
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = r1.f324881p
            if (r1 == 0) goto L_0x01ad
            y23.b r2 = r0.f303497d
            T r3 = r2.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r3 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) r3
            if (r3 != 0) goto L_0x0185
            goto L_0x018a
        L_0x0185:
            int r7 = r1.f163821p
            long r7 = (long) r7
            r3.f265756u = r7
        L_0x018a:
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r1.f163830y
            if (r7 == 0) goto L_0x01a5
            long r7 = r7.f164794id
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.getUnsignedLongString(r7)
            T r2 = r2.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r2 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) r2
            if (r2 != 0) goto L_0x019b
            goto L_0x01ad
        L_0x019b:
            java.lang.String r3 = "MusicFeedid"
            r7 = 1
            java.lang.String r1 = r2.mo86045b(r3, r1, r7)
            r2.f265755t = r1
            goto L_0x01ad
        L_0x01a5:
            if (r3 != 0) goto L_0x01a8
            goto L_0x01ad
        L_0x01a8:
            int r1 = r1.f163813e
            long r1 = (long) r1
            r3.f265754s = r1
        L_0x01ad:
            y23.b r1 = r0.f303497d
            T r1 = r1.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) r1
            if (r1 != 0) goto L_0x01b6
            goto L_0x01c1
        L_0x01b6:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getIOSNetType((android.content.Context) r2)
            long r2 = (long) r2
            r1.f265749n = r2
        L_0x01c1:
            y23.b r1 = r0.f303497d
            T r2 = r1.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r2 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) r2
            if (r2 != 0) goto L_0x01ca
            goto L_0x01cc
        L_0x01ca:
            r2.f265746k = r4
        L_0x01cc:
            if (r6 != 0) goto L_0x01da
            if (r2 != 0) goto L_0x01d4
            r3 = 0
            goto L_0x02ea
        L_0x01d4:
            r3 = 0
            r2.f265743h = r3
            goto L_0x02ea
        L_0x01da:
            r3 = 0
            f23.b r2 = r1.f303494f
            java.util.ArrayList<f23.b$a> r2 = r2.f286949b
            r2.clear()
            java.util.Iterator r2 = r6.iterator()
        L_0x01e7:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x02dc
            java.lang.Object r5 = r2.next()
            ai2.a r5 = (ai2.C92007a) r5
            ai2.d r7 = r5.f263402a
            int r7 = r7.ordinal()
            java.lang.String r8 = "/"
            r9 = 0
            java.lang.String r10 = ""
            if (r7 == 0) goto L_0x025d
            r11 = 5
            if (r7 == r11) goto L_0x020a
            f23.b$a r7 = new f23.b$a
            r7.<init>()
            goto L_0x02af
        L_0x020a:
            f23.b$b r7 = new f23.b$b
            r7.<init>()
            boolean r11 = r5 instanceof ai2.C92010c
            if (r11 == 0) goto L_0x0217
            r11 = r5
            ai2.c r11 = (ai2.C92010c) r11
            goto L_0x0218
        L_0x0217:
            r11 = 0
        L_0x0218:
            if (r11 == 0) goto L_0x0220
            java.lang.String r11 = r11.f263435j
            if (r11 != 0) goto L_0x021f
            goto L_0x0220
        L_0x021f:
            r10 = r11
        L_0x0220:
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)
            java.lang.String r11 = r10.getPath()
            if (r11 == 0) goto L_0x0244
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r9, r9)
            java.lang.String r11 = r10.getPath()
            boolean r11 = r11.equals(r9)
            if (r11 != 0) goto L_0x0244
            android.net.Uri$Builder r10 = r10.buildUpon()
            android.net.Uri$Builder r9 = r10.path(r9)
            android.net.Uri r10 = r9.build()
        L_0x0244:
            java.lang.String r9 = r10.getPath()
            int r8 = r9.lastIndexOf(r8)
            if (r8 >= 0) goto L_0x024f
            goto L_0x0255
        L_0x024f:
            int r8 = r8 + 1
            java.lang.String r9 = r9.substring(r8)
        L_0x0255:
            java.lang.String r8 = "VFSFile((it as? CaptionItem)?.font ?: \"\").name"
            gy3.C87412m.m108593f(r9, r8)
            r7.f286954c = r9
            goto L_0x02af
        L_0x025d:
            f23.b$b r7 = new f23.b$b
            r7.<init>()
            boolean r11 = r5 instanceof ai2.C92025s
            if (r11 == 0) goto L_0x026a
            r11 = r5
            ai2.s r11 = (ai2.C92025s) r11
            goto L_0x026b
        L_0x026a:
            r11 = 0
        L_0x026b:
            if (r11 == 0) goto L_0x0273
            java.lang.String r11 = r11.f263530k
            if (r11 != 0) goto L_0x0272
            goto L_0x0273
        L_0x0272:
            r10 = r11
        L_0x0273:
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)
            java.lang.String r11 = r10.getPath()
            if (r11 == 0) goto L_0x0297
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r9, r9)
            java.lang.String r11 = r10.getPath()
            boolean r11 = r11.equals(r9)
            if (r11 != 0) goto L_0x0297
            android.net.Uri$Builder r10 = r10.buildUpon()
            android.net.Uri$Builder r9 = r10.path(r9)
            android.net.Uri r10 = r9.build()
        L_0x0297:
            java.lang.String r9 = r10.getPath()
            int r8 = r9.lastIndexOf(r8)
            if (r8 >= 0) goto L_0x02a2
            goto L_0x02a8
        L_0x02a2:
            int r8 = r8 + 1
            java.lang.String r9 = r9.substring(r8)
        L_0x02a8:
            java.lang.String r8 = "VFSFile((it as? TextItem)?.font ?: \"\").name"
            gy3.C87412m.m108593f(r9, r8)
            r7.f286954c = r9
        L_0x02af:
            ai2.d r8 = r5.f263402a
            int r8 = r8.f263445d
            r7.f286952a = r8
            java.util.ArrayList<java.lang.Long> r8 = r7.f286953b
            ci2.d r9 = r5.f263404c
            long r9 = r9.mo146049c()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8.add(r9)
            java.util.ArrayList<java.lang.Long> r8 = r7.f286953b
            ci2.d r5 = r5.f263404c
            long r9 = r5.mo146048b()
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r8.add(r5)
            f23.b r5 = r1.f303494f
            java.util.ArrayList<f23.b$a> r5 = r5.f286949b
            r5.add(r7)
            goto L_0x01e7
        L_0x02dc:
            T r1 = r1.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) r1
            if (r1 != 0) goto L_0x02e3
            goto L_0x02ea
        L_0x02e3:
            int r2 = r6.size()
            long r5 = (long) r2
            r1.f265743h = r5
        L_0x02ea:
            y23.b r1 = r0.f303497d
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r1 = r1.f303493e
            java.lang.Class<j23.a> r2 = j23.C108531a.class
            lh2.g0 r1 = r1.mo151221j(r2)
            j23.a r1 = (j23.C108531a) r1
            if (r1 == 0) goto L_0x02fb
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = r1.f324881p
            goto L_0x02fc
        L_0x02fb:
            r1 = 0
        L_0x02fc:
            if (r1 == 0) goto L_0x0301
            r2 = 1
            goto L_0x0302
        L_0x0301:
            r2 = r3
        L_0x0302:
            y23.b r1 = r0.f303497d
            T r4 = r1.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r4 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) r4
            if (r4 != 0) goto L_0x030b
            goto L_0x030d
        L_0x030b:
            r4.f265744i = r2
        L_0x030d:
            if (r4 != 0) goto L_0x0310
            goto L_0x0314
        L_0x0310:
            long r2 = r0.f303498e
            r4.f265745j = r2
        L_0x0314:
            r1.mo164103h()
            y23.b r1 = r0.f303497d
            r2 = 0
            r1.f336503d = r2
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct
            r2.<init>()
            r1.f336503d = r2
            f23.b r2 = new f23.b
            r2.<init>()
            r1.f303494f = r2
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y23.C102801c.invoke():java.lang.Object");
    }
}
