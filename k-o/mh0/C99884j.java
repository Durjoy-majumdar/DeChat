package mh0;

import com.tencent.mars.cdn.CdnLogic;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87413o;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.List;
import mh0.C99879i;
import p434ig.C98671a;
import p434ig.C98672d;
import p434ig.C98674g;
import rx3.C13604l;

/* renamed from: mh0.j */
public final class C99884j implements CdnLogic.UploadCallback {

    /* renamed from: d */
    public final /* synthetic */ C99879i.C99881b f292669d;

    /* renamed from: e */
    public final /* synthetic */ C98674g f292670e;

    /* renamed from: f */
    public final /* synthetic */ C99862a f292671f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<CdnLogic.CheckHitFileInfo> f292672g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList<C98672d> f292673h;

    /* renamed from: i */
    public final /* synthetic */ boolean f292674i;

    /* renamed from: j */
    public final /* synthetic */ boolean f292675j;

    /* renamed from: n */
    public final /* synthetic */ boolean f292676n;

    /* renamed from: o */
    public final /* synthetic */ C98671a f292677o;

    /* renamed from: mh0.j$a */
    public static final class C99885a extends C87413o implements C32226l<CdnLogic.CheckHitFileInfo, CharSequence> {

        /* renamed from: d */
        public static final C99885a f292678d = new C99885a();

        public C99885a() {
            super(1);
        }

        public Object invoke(Object obj) {
            CdnLogic.CheckHitFileInfo checkHitFileInfo = (CdnLogic.CheckHitFileInfo) obj;
            return checkHitFileInfo.fileid + '_' + checkHitFileInfo.filemd5 + '_' + checkHitFileInfo.filetype;
        }
    }

    /* renamed from: mh0.j$b */
    public static final class C99886b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f292679a;

        /* renamed from: b */
        public final /* synthetic */ C99879i.C99881b f292680b;

        /* renamed from: c */
        public final /* synthetic */ C98674g f292681c;

        /* renamed from: d */
        public final /* synthetic */ C99862a f292682d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<CdnLogic.CheckHitFileInfo> f292683e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList<C98672d> f292684f;

        /* renamed from: g */
        public final /* synthetic */ boolean f292685g;

        /* renamed from: h */
        public final /* synthetic */ boolean f292686h;

        /* renamed from: i */
        public final /* synthetic */ boolean f292687i;

        /* renamed from: j */
        public final /* synthetic */ C98671a f292688j;

        /* renamed from: k */
        public final /* synthetic */ List<C13604l<CdnLogic.CheckHitFileInfo, C98672d>> f292689k;

        /* renamed from: l */
        public final /* synthetic */ CdnLogic.C2CUploadResult f292690l;

        public C99886b(C8477a0 a0Var, C99884j jVar, C99879i.C99881b bVar, C98674g gVar, C99862a aVar, ArrayList<CdnLogic.CheckHitFileInfo> arrayList, ArrayList<C98672d> arrayList2, boolean z, boolean z2, boolean z3, C98671a aVar2, List<? extends C13604l<? extends CdnLogic.CheckHitFileInfo, ? extends C98672d>> list, CdnLogic.C2CUploadResult c2CUploadResult) {
            this.f292679a = a0Var;
            this.f292680b = bVar;
            this.f292681c = gVar;
            this.f292682d = aVar;
            this.f292683e = arrayList;
            this.f292684f = arrayList2;
            this.f292685g = z;
            this.f292686h = z2;
            this.f292687i = z3;
            this.f292688j = aVar2;
            this.f292689k = list;
            this.f292690l = c2CUploadResult;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0041, code lost:
            r5 = r5.f126389d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x022e  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x0241  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x0246  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x0250  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x0267  */
        /* JADX WARNING: Removed duplicated region for block: B:174:0x0231 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00e2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                ob0.b$c r1 = (ob0.C89132b.C89134c) r1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "get response, pb = "
                r2.append(r3)
                java.lang.String r3 = "rsp"
                gy3.C87412m.m108593f(r1, r3)
                org.json.JSONObject r3 = o40.C61937h.m72709h(r1)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.AlbumMsgSendService"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                gy3.a0 r3 = r0.f292679a
                r4 = 0
                r3.f27482d = r4
                java.util.List<rx3.l<com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo, ig.d>> r3 = r0.f292689k
                int r5 = r1.f256794b
                r7 = 1
                if (r5 != 0) goto L_0x0079
                int r5 = r1.f256793a
                if (r5 != 0) goto L_0x0079
                T r5 = r1.f256796d
                mh0.x r5 = (mh0.C47028x) r5
                if (r5 == 0) goto L_0x004e
                java.util.LinkedList<mh0.d0> r5 = r5.f126389d
                if (r5 == 0) goto L_0x004e
                boolean r5 = r5.isEmpty()
                r5 = r5 ^ r7
                if (r5 != r7) goto L_0x004e
                r5 = 1
                goto L_0x004f
            L_0x004e:
                r5 = 0
            L_0x004f:
                if (r5 == 0) goto L_0x0079
                if (r3 == 0) goto L_0x005c
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x005d
            L_0x005c:
                r3 = 0
            L_0x005d:
                T r5 = r1.f256796d
                mh0.x r5 = (mh0.C47028x) r5
                if (r5 == 0) goto L_0x0070
                java.util.LinkedList<mh0.d0> r5 = r5.f126389d
                if (r5 == 0) goto L_0x0070
                int r5 = r5.size()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x0071
            L_0x0070:
                r5 = 0
            L_0x0071:
                boolean r3 = gy3.C87412m.m108589b(r3, r5)
                if (r3 == 0) goto L_0x0079
                r3 = 1
                goto L_0x007a
            L_0x0079:
                r3 = 0
            L_0x007a:
                if (r3 == 0) goto L_0x007d
                goto L_0x007e
            L_0x007d:
                r1 = 0
            L_0x007e:
                r3 = 4
                r5 = 2
                if (r1 == 0) goto L_0x0241
                T r1 = r1.f256796d
                mh0.x r1 = (mh0.C47028x) r1
                if (r1 == 0) goto L_0x0241
                java.util.LinkedList<mh0.d0> r1 = r1.f126389d
                if (r1 == 0) goto L_0x0241
                java.util.List<rx3.l<com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo, ig.d>> r8 = r0.f292689k
                mh0.a r9 = r0.f292682d
                java.util.Iterator r1 = r1.iterator()
                r10 = 0
            L_0x0095:
                boolean r11 = r1.hasNext()
                if (r11 == 0) goto L_0x023c
                java.lang.Object r11 = r1.next()
                int r12 = r10 + 1
                if (r10 < 0) goto L_0x0237
                mh0.d0 r11 = (mh0.C47025d0) r11
                if (r8 == 0) goto L_0x00d1
                java.util.Iterator r10 = r8.iterator()
            L_0x00ab:
                boolean r13 = r10.hasNext()
                if (r13 == 0) goto L_0x00c7
                java.lang.Object r13 = r10.next()
                r14 = r13
                rx3.l r14 = (rx3.C13604l) r14
                A r14 = r14.f38555d
                com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo r14 = (com.tencent.mars.cdn.CdnLogic.CheckHitFileInfo) r14
                java.lang.String r14 = r14.fileid
                java.lang.String r15 = r11.f126382d
                boolean r14 = gy3.C87412m.m108589b(r14, r15)
                if (r14 == 0) goto L_0x00ab
                goto L_0x00c8
            L_0x00c7:
                r13 = 0
            L_0x00c8:
                rx3.l r13 = (rx3.C13604l) r13
                if (r13 == 0) goto L_0x00d1
                B r10 = r13.f38556e
                ig.d r10 = (p434ig.C98672d) r10
                goto L_0x00d2
            L_0x00d1:
                r10 = 0
            L_0x00d2:
                java.lang.String r13 = r11.f126382d
                if (r13 == 0) goto L_0x00df
                int r13 = r13.length()
                if (r13 != 0) goto L_0x00dd
                goto L_0x00df
            L_0x00dd:
                r13 = 0
                goto L_0x00e0
            L_0x00df:
                r13 = 1
            L_0x00e0:
                if (r13 != 0) goto L_0x022b
                java.lang.String r13 = r11.f126383e
                if (r13 == 0) goto L_0x00ef
                int r13 = r13.length()
                if (r13 != 0) goto L_0x00ed
                goto L_0x00ef
            L_0x00ed:
                r13 = 0
                goto L_0x00f0
            L_0x00ef:
                r13 = 1
            L_0x00f0:
                if (r13 == 0) goto L_0x00f4
                goto L_0x022b
            L_0x00f4:
                mh0.n r13 = r9.mo55365D()
                java.util.ArrayList r13 = r13.mo139238A()
                boolean r14 = r13 instanceof java.util.Collection
                if (r14 == 0) goto L_0x0107
                boolean r14 = r13.isEmpty()
                if (r14 == 0) goto L_0x0107
                goto L_0x0124
            L_0x0107:
                java.util.Iterator r13 = r13.iterator()
            L_0x010b:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x0124
                java.lang.Object r14 = r13.next()
                mh0.q r14 = (mh0.C99893q) r14
                int r14 = r14.mo55376A()
                if (r14 != 0) goto L_0x011f
                r14 = 1
                goto L_0x0120
            L_0x011f:
                r14 = 0
            L_0x0120:
                if (r14 == 0) goto L_0x010b
                r13 = 0
                goto L_0x0125
            L_0x0124:
                r13 = 1
            L_0x0125:
                if (r13 == 0) goto L_0x0137
                java.lang.Class<rz.r> r13 = p682rz.C101487r.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                rz.r r13 = (p682rz.C101487r) r13
                boolean r13 = r13.mo140796Ys()
                if (r13 == 0) goto L_0x0137
                r13 = 1
                goto L_0x0138
            L_0x0137:
                r13 = 0
            L_0x0138:
                if (r10 == 0) goto L_0x0143
                int r14 = r10.mo55274P()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                goto L_0x0144
            L_0x0143:
                r14 = 0
            L_0x0144:
                if (r14 != 0) goto L_0x0147
                goto L_0x014e
            L_0x0147:
                int r15 = r14.intValue()
                if (r15 != r5) goto L_0x014e
                goto L_0x0157
            L_0x014e:
                if (r14 != 0) goto L_0x0151
                goto L_0x0159
            L_0x0151:
                int r14 = r14.intValue()
                if (r14 != r3) goto L_0x0159
            L_0x0157:
                r14 = 1
                goto L_0x015a
            L_0x0159:
                r14 = 0
            L_0x015a:
                if (r14 == 0) goto L_0x0229
                java.lang.String r14 = r10.mo55264K()
                mh0.q r14 = r9.mo139216A(r14)
                if (r14 == 0) goto L_0x016b
                java.lang.String r14 = r14.mo55384I()
                goto L_0x016c
            L_0x016b:
                r14 = 0
            L_0x016c:
                int r15 = r10.mo55274P()
                if (r15 != r5) goto L_0x018e
                java.lang.String r15 = r10.mo55250D()
                boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r15 != 0) goto L_0x0186
                java.lang.String r15 = r10.mo55302d0()
                boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r15 == 0) goto L_0x018c
            L_0x0186:
                boolean r14 = com.tencent.p014mm.vfs.C86013q1.m106450k(r14)
                if (r14 == 0) goto L_0x018e
            L_0x018c:
                r14 = 1
                goto L_0x018f
            L_0x018e:
                r14 = 0
            L_0x018f:
                if (r14 != 0) goto L_0x01bb
                if (r13 == 0) goto L_0x0194
                goto L_0x01bb
            L_0x0194:
                ph0.a r15 = ph0.C100792a.f295260a
                int r16 = r10.mo55274P()
                long r13 = r10.mo55268M()
                int r14 = (int) r13
                r18 = 0
                r19 = 0
                r20 = 8
                r21 = 0
                r17 = r14
                int r13 = ph0.C100792a.m131981h(r15, r16, r17, r18, r19, r20, r21)
                r10.mo55283T0(r13)
                java.lang.String r13 = r11.f126382d
                r10.mo55251D0(r13)
                java.lang.String r13 = r11.f126383e
                r10.mo55249C0(r13)
                goto L_0x020b
            L_0x01bb:
                ph0.a r13 = ph0.C100792a.f295260a
                int r15 = r10.mo55274P()
                long r5 = r10.mo55268M()
                int r6 = (int) r5
                r5 = 0
                r22 = 0
                r19 = 12
                r23 = 0
                r17 = 0
                r18 = 0
                r20 = 0
                r14 = r13
                r16 = r6
                int r6 = ph0.C100792a.m131981h(r14, r15, r16, r17, r18, r19, r20)
                r10.mo55283T0(r6)
                java.lang.String r6 = r11.f126382d
                r10.mo55251D0(r6)
                java.lang.String r6 = r11.f126383e
                r10.mo55249C0(r6)
                int r15 = r10.mo55274P()
                long r3 = r10.mo55268M()
                int r4 = (int) r3
                r19 = 8
                r16 = r4
                r17 = r5
                r18 = r22
                r20 = r23
                int r3 = ph0.C100792a.m131981h(r14, r15, r16, r17, r18, r19, r20)
                r10.mo55307f1(r3)
                java.lang.String r3 = r11.f126382d
                r10.mo55303d1(r3)
                java.lang.String r3 = r11.f126383e
                r10.mo55297a1(r3)
            L_0x020b:
                ph0.a r3 = ph0.C100792a.f295260a
                int r4 = r10.mo55274P()
                long r13 = r10.mo55268M()
                int r5 = (int) r13
                r6 = 0
                int r3 = r3.mo140236g(r4, r5, r6, r7)
                r10.mo55337u1(r3)
                java.lang.String r3 = r11.f126382d
                r10.mo55257G0(r3)
                java.lang.String r3 = r11.f126383e
                r10.mo55255F0(r3)
                goto L_0x0231
            L_0x0229:
                r6 = 0
                goto L_0x0231
            L_0x022b:
                r6 = 0
                if (r10 == 0) goto L_0x0231
                r2.add(r10)
            L_0x0231:
                r10 = r12
                r3 = 4
                r4 = 0
                r5 = 2
                goto L_0x0095
            L_0x0237:
                sx3.C64197v.m75542k()
                r1 = 0
                throw r1
            L_0x023c:
                r1 = 0
                r6 = 0
                rx3.b0 r3 = rx3.C13598b0.f38549a
                goto L_0x0244
            L_0x0241:
                r1 = 0
                r6 = 0
                r3 = r1
            L_0x0244:
                if (r3 != 0) goto L_0x024a
                gy3.a0 r3 = r0.f292679a
                r3.f27482d = r7
            L_0x024a:
                gy3.a0 r3 = r0.f292679a
                boolean r3 = r3.f27482d
                if (r3 == 0) goto L_0x0267
                mh0.i$b r8 = r0.f292680b
                ig.g r9 = r0.f292681c
                mh0.a r10 = r0.f292682d
                java.util.ArrayList<com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo> r11 = r0.f292683e
                java.util.ArrayList<ig.d> r12 = r0.f292684f
                r13 = 0
                boolean r14 = r0.f292685g
                r15 = 0
                r16 = 64
                r17 = 0
                mh0.C99879i.C99881b.m130442c(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0302
            L_0x0267:
                com.tencent.mars.cdn.CdnLogic$C2CUploadResult r3 = r0.f292690l
                java.util.ArrayList<ig.d> r4 = r0.f292684f
                if (r3 == 0) goto L_0x02a4
                com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo[] r3 = r3.batchCheckHitFiles
                if (r3 == 0) goto L_0x02a4
                java.util.ArrayList r5 = new java.util.ArrayList
                int r8 = r3.length
                r5.<init>(r8)
                int r8 = r3.length
                r9 = 0
                r10 = 0
            L_0x027a:
                if (r9 >= r8) goto L_0x029f
                r11 = r3[r9]
                int r12 = r10 + 1
                java.lang.String r11 = r11.fileid
                if (r11 == 0) goto L_0x028d
                int r11 = r11.length()
                if (r11 != 0) goto L_0x028b
                goto L_0x028d
            L_0x028b:
                r11 = 0
                goto L_0x028e
            L_0x028d:
                r11 = 1
            L_0x028e:
                if (r11 == 0) goto L_0x0297
                java.lang.Object r10 = r4.get(r10)
                ig.d r10 = (p434ig.C98672d) r10
                goto L_0x0298
            L_0x0297:
                r10 = r1
            L_0x0298:
                r5.add(r10)
                int r9 = r9 + 1
                r10 = r12
                goto L_0x027a
            L_0x029f:
                java.util.List r3 = sx3.C110818d0.m150912J(r5)
                goto L_0x02a6
            L_0x02a4:
                sx3.f0 r3 = sx3.C64186f0.f181907d
            L_0x02a6:
                r2.addAll(r3)
                int r3 = r2.size()
                if (r3 <= 0) goto L_0x02b1
                r4 = 1
                goto L_0x02b2
            L_0x02b1:
                r4 = 0
            L_0x02b2:
                if (r4 == 0) goto L_0x02b5
                goto L_0x02b6
            L_0x02b5:
                r2 = r1
            L_0x02b6:
                if (r2 == 0) goto L_0x02f1
                mh0.i$b r1 = r0.f292680b
                mh0.a r11 = r0.f292682d
                java.util.Iterator r2 = r2.iterator()
            L_0x02c0:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x02ee
                java.lang.Object r3 = r2.next()
                r4 = r3
                ig.d r4 = (p434ig.C98672d) r4
                int r3 = r4.mo55274P()
                r12 = 2
                if (r3 == r12) goto L_0x02e2
                r13 = 4
                if (r3 == r13) goto L_0x02d8
                goto L_0x02c0
            L_0x02d8:
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r3 = r1
                r5 = r11
                r3.mo139234e(r4, r5, r6, r7, r8, r9)
                goto L_0x02c0
            L_0x02e2:
                r13 = 4
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r3 = r1
                r5 = r11
                r3.mo139233d(r4, r5, r6, r7, r8, r9, r10)
                goto L_0x02c0
            L_0x02ee:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                goto L_0x02f2
            L_0x02f1:
                r6 = r1
            L_0x02f2:
                if (r6 != 0) goto L_0x0302
                mh0.i$b r7 = r0.f292680b
                ig.a r11 = r0.f292688j
                ig.g r12 = r0.f292681c
                mh0.a r13 = r0.f292682d
                r8 = 1
                r9 = 0
                r10 = 0
                r7.mo139231a(r8, r9, r10, r11, r12, r13)
            L_0x0302:
                mh0.i$b r14 = r0.f292680b
                r15 = 1
                boolean r1 = r0.f292686h
                boolean r2 = r0.f292687i
                ig.a r3 = r0.f292688j
                ig.g r4 = r0.f292681c
                mh0.a r5 = r0.f292682d
                r16 = r1
                r17 = r2
                r18 = r3
                r19 = r4
                r20 = r5
                r14.mo139231a(r15, r16, r17, r18, r19, r20)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: mh0.C99884j.C99886b.call(java.lang.Object):java.lang.Object");
        }
    }

    public C99884j(C99879i.C99881b bVar, C98674g gVar, C99862a aVar, ArrayList<CdnLogic.CheckHitFileInfo> arrayList, ArrayList<C98672d> arrayList2, boolean z, boolean z2, boolean z3, C98671a aVar2) {
        this.f292669d = bVar;
        this.f292670e = gVar;
        this.f292671f = aVar;
        this.f292672g = arrayList;
        this.f292673h = arrayList2;
        this.f292674i = z;
        this.f292675j = z2;
        this.f292676n = z3;
        this.f292677o = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r3 = r13.batchCheckHitFiles;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onC2CUploadCompleted(java.lang.String r20, com.tencent.mars.cdn.CdnLogic.C2CUploadResult r21) {
        /*
            r19 = this;
            r14 = r19
            r13 = r21
            java.lang.Class<qo.h> r0 = p663qo.C101211h.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onC2CUploadCompleted, batchCheckHitFiles:"
            r1.append(r2)
            if (r13 == 0) goto L_0x0028
            com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo[] r3 = r13.batchCheckHitFiles
            if (r3 == 0) goto L_0x0028
            r5 = 0
            r6 = 0
            r7 = 10
            r8 = 0
            mh0.j$a r9 = mh0.C99884j.C99885a.f292678d
            r10 = 22
            r11 = 0
            java.lang.String r4 = "#"
            java.lang.String r3 = sx3.C110823p.m150987M(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.AlbumMsgSendService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r13 == 0) goto L_0x005f
            com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo[] r5 = r13.batchCheckHitFiles
            if (r5 == 0) goto L_0x005f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r5.length
            r8 = 0
        L_0x0042:
            if (r8 >= r7) goto L_0x0060
            r9 = r5[r8]
            java.lang.String r10 = r9.fileid
            java.lang.String r11 = "it.fileid"
            gy3.C87412m.m108593f(r10, r11)
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x0056
            r10 = 1
            goto L_0x0057
        L_0x0056:
            r10 = 0
        L_0x0057:
            if (r10 == 0) goto L_0x005c
            r6.add(r9)
        L_0x005c:
            int r8 = r8 + 1
            goto L_0x0042
        L_0x005f:
            r6 = 0
        L_0x0060:
            if (r13 == 0) goto L_0x00a1
            com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo[] r5 = r13.batchCheckHitFiles
            if (r5 == 0) goto L_0x00a1
            java.util.ArrayList<ig.d> r7 = r14.f292673h
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = r5.length
            r8.<init>(r9)
            int r9 = r5.length
            r10 = 0
            r11 = 0
        L_0x0071:
            if (r10 >= r9) goto L_0x009b
            r12 = r5[r10]
            int r15 = r11 + 1
            java.lang.String r1 = r12.fileid
            java.lang.String r2 = "checkHitFileInfo.fileid"
            gy3.C87412m.m108593f(r1, r2)
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0086
            r1 = 1
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r1 == 0) goto L_0x0093
            rx3.l r1 = new rx3.l
            java.lang.Object r2 = r7.get(r11)
            r1.<init>(r12, r2)
            goto L_0x0094
        L_0x0093:
            r1 = 0
        L_0x0094:
            r8.add(r1)
            int r10 = r10 + 1
            r11 = r15
            goto L_0x0071
        L_0x009b:
            java.util.List r1 = sx3.C110818d0.m150912J(r8)
            r12 = r1
            goto L_0x00a2
        L_0x00a1:
            r12 = 0
        L_0x00a2:
            gy3.a0 r1 = new gy3.a0
            r1.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            mh0.i$b r5 = r14.f292669d
            if (r6 == 0) goto L_0x0185
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
        L_0x00c0:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0187
            java.lang.Object r9 = r6.next()
            int r10 = r8 + 1
            if (r8 < 0) goto L_0x0180
            com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo r9 = (com.tencent.mars.cdn.CdnLogic.CheckHitFileInfo) r9
            mh0.v r11 = new mh0.v
            r11.<init>()
            if (r12 == 0) goto L_0x00e4
            java.lang.Object r15 = r12.get(r8)
            rx3.l r15 = (rx3.C13604l) r15
            if (r15 == 0) goto L_0x00e4
            B r15 = r15.f38556e
            ig.d r15 = (p434ig.C98672d) r15
            goto L_0x00e5
        L_0x00e4:
            r15 = 0
        L_0x00e5:
            java.lang.String r4 = ", md5: "
            r17 = r6
            java.lang.String r6 = ", fileId: "
            r18 = r10
            if (r15 != 0) goto L_0x0117
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "dataItem is null, index:"
            r10.append(r13)
            r10.append(r8)
            r10.append(r6)
            java.lang.String r13 = r9.fileid
            r10.append(r13)
            r10.append(r4)
            java.lang.String r13 = r9.filemd5
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            r10 = 1
            r1.f27482d = r10
            goto L_0x0118
        L_0x0117:
            r10 = 1
        L_0x0118:
            ph0.a r13 = ph0.C100792a.f295260a
            com.tencent.mm.storage.f4 r10 = r5.f292665d
            java.lang.String r10 = r13.mo140238j(r15, r10)
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r13 != 0) goto L_0x0155
            r13 = 1
            r1.f27482d = r13
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r13 = "dPath is not exist, dPath:"
            r15.append(r13)
            r15.append(r10)
            java.lang.String r13 = ", index:"
            r15.append(r13)
            r15.append(r8)
            r15.append(r6)
            java.lang.String r6 = r9.fileid
            r15.append(r6)
            r15.append(r4)
            java.lang.String r4 = r9.filemd5
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
        L_0x0155:
            java.lang.String r4 = r9.fileid
            r11.f126384d = r4
            java.lang.String r4 = r9.filemd5
            r11.f126385e = r4
            di3.d r4 = di3.C86312j.m106911c(r0)
            qo.h r4 = (p663qo.C101211h) r4
            java.lang.String r4 = r4.mo140292k7(r10)
            r11.f126386f = r4
            di3.d r4 = di3.C86312j.m106911c(r0)
            qo.h r4 = (p663qo.C101211h) r4
            int r4 = r4.mo140288dC(r10)
            r11.f126387g = r4
            r7.add(r11)
            r13 = r21
            r6 = r17
            r8 = r18
            goto L_0x00c0
        L_0x0180:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x0185:
            sx3.f0 r7 = sx3.C64186f0.f181907d
        L_0x0187:
            r2.addAll(r7)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x01e4
            boolean r0 = r1.f27482d
            if (r0 == 0) goto L_0x0196
            r0 = r14
            goto L_0x01e6
        L_0x0196:
            mh0.w r0 = new mh0.w
            r0.<init>()
            r0.f126388d = r2
            ob0.c$b r2 = new ob0.c$b
            r2.<init>()
            r3 = 11144(0x2b88, float:1.5616E-41)
            r2.f127069d = r3
            java.lang.String r3 = "/cgi-bin/micromsg-bin/batchcheckmd5"
            r2.f127068c = r3
            r2.f127066a = r0
            mh0.x r0 = new mh0.x
            r0.<init>()
            r2.f127067b = r0
            ob0.c r0 = r2.mo72403a()
            ob0.b r2 = new ob0.b
            r2.<init>()
            r2.mo123453j(r0)
            nr3.e r15 = r2.mo9225i()
            mh0.j$b r13 = new mh0.j$b
            mh0.i$b r3 = r14.f292669d
            ig.g r4 = r14.f292670e
            mh0.a r5 = r14.f292671f
            java.util.ArrayList<com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo> r6 = r14.f292672g
            java.util.ArrayList<ig.d> r7 = r14.f292673h
            boolean r8 = r14.f292674i
            boolean r9 = r14.f292675j
            boolean r10 = r14.f292676n
            ig.a r11 = r14.f292677o
            r0 = r13
            r2 = r19
            r14 = r13
            r13 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.mo123420E(r14)
            return
        L_0x01e4:
            r0 = r19
        L_0x01e6:
            mh0.i$b r1 = r0.f292669d
            ig.g r2 = r0.f292670e
            mh0.a r3 = r0.f292671f
            java.util.ArrayList<com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo> r4 = r0.f292672g
            java.util.ArrayList<ig.d> r5 = r0.f292673h
            r6 = 0
            boolean r7 = r0.f292674i
            r8 = 0
            r9 = 64
            r10 = 0
            mh0.C99879i.C99881b.m130442c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            mh0.i$b r11 = r0.f292669d
            r12 = 1
            boolean r13 = r0.f292675j
            boolean r14 = r0.f292676n
            ig.a r15 = r0.f292677o
            ig.g r1 = r0.f292670e
            mh0.a r2 = r0.f292671f
            r16 = r1
            r17 = r2
            r11.mo139231a(r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh0.C99884j.onC2CUploadCompleted(java.lang.String, com.tencent.mars.cdn.CdnLogic$C2CUploadResult):void");
    }

    public void onUploadProgressChanged(String str, long j, long j2) {
    }
}
