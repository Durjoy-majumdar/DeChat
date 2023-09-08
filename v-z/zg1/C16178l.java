package zg1;

import cj1.C0581o5;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import ux3.C65486b;
import yg1.C15999b;
import yg1.C16004c;
import yg1.C66639f;

/* renamed from: zg1.l */
public final class C16178l extends C66639f {

    /* renamed from: a */
    public final C45795b f43367a;

    /* renamed from: b */
    public final String f43368b = "LiveCommentMsgInterceptor";

    /* renamed from: c */
    public boolean f43369c;

    /* renamed from: d */
    public boolean f43370d;

    /* renamed from: e */
    public final C13601g f43371e;

    /* renamed from: zg1.l$a */
    public static final class C16179a extends C87413o implements C32224a<int[]> {

        /* renamed from: d */
        public static final C16179a f43372d = new C16179a();

        public C16179a() {
            super(0);
        }

        public Object invoke() {
            return new int[]{1, 2, 3};
        }
    }

    /* renamed from: zg1.l$b */
    public static final class C16180b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C0581o5) t).getSeq()), Long.valueOf(((C0581o5) t2).getSeq()));
        }
    }

    public C16178l(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f43367a = bVar;
        boolean z = true;
        this.f43369c = true;
        this.f43370d = true;
        C32444a aVar = C32444a.f86121a;
        this.f43369c = C32444a.f86174n0.mo60266n().intValue() == 0;
        this.f43370d = C32444a.f86178o0.mo60266n().intValue() != 0 ? false : z;
        Log.m105924i("LiveCommentMsgInterceptor", "saveMyselfCommentValue:" + this.f43370d + ", sendLocalGiftToMsgValue :" + this.f43369c);
        this.f43371e = C36568h.m40985a(C16179a.f43372d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0452, code lost:
        if (r10 >= r9) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04d1, code lost:
        o40.C11348f.C11349a.m11178b(ft1.C59319a.f169618b, "liveCheckCommentMsgErr", false, (o40.C11348f.C11352b) null, false, false, (fy3.C32224a) null, 60, (java.lang.Object) null);
        er1.C58739j4.f168176a.mo83712h0(r0, "checkCommentListSizeSaveMySelf");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo49b(yg1.C39014a.C39015a r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.Class<yg1.c> r2 = yg1.C16004c.class
            java.lang.String r3 = "respWrapper"
            gy3.C87412m.m108594g(r0, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            te3.ao0 r4 = r0.f105072a
            r5 = 0
            if (r4 == 0) goto L_0x003f
            java.util.LinkedList<te3.xs0> r4 = r4.f130689t
            if (r4 == 0) goto L_0x003f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0022:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r4.next()
            r8 = r7
            te3.xs0 r8 = (te3.C52013xs0) r8
            int[] r9 = r17.mo14724e()
            int r8 = r8.f144903e
            boolean r8 = sx3.C110823p.m151008x(r9, r8)
            if (r8 == 0) goto L_0x0022
            r6.add(r7)
            goto L_0x0022
        L_0x003f:
            r6 = r5
        L_0x0040:
            r4 = 0
            r7 = 1
            if (r6 == 0) goto L_0x004d
            boolean r8 = r6.isEmpty()
            r8 = r8 ^ r7
            if (r8 != r7) goto L_0x004d
            r8 = 1
            goto L_0x004e
        L_0x004d:
            r8 = 0
        L_0x004e:
            if (r8 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r6 = r5
        L_0x0052:
            if (r6 == 0) goto L_0x00e7
            java.util.Iterator r6 = r6.iterator()
        L_0x0058:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00e7
            java.lang.Object r8 = r6.next()
            te3.xs0 r8 = (te3.C52013xs0) r8
            ok1.e r9 = ok1.C62042e.f176370a
            java.lang.String r10 = r1.f43368b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "LiveCommentMsgInterceptor before extraFilter msg_type:"
            r11.append(r12)
            int r12 = r8.f144903e
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r9.mo86998D1(r10, r11)
            int r10 = r8.f144903e
            r11 = 20035(0x4e43, float:2.8075E-41)
            if (r10 != r11) goto L_0x009e
            java.lang.String r10 = r1.f43368b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "[MMFinder_LiveAppMsg_Type_Location] msg = "
            r11.append(r12)
            org.json.JSONObject r12 = o40.C61937h.m72709h(r8)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
        L_0x009e:
            fj1.b r10 = r1.f43367a
            androidx.lifecycle.i0 r10 = r10.mo71262a(r2)
            yg1.c r10 = (yg1.C16004c) r10
            java.util.Map<java.lang.Integer, yg1.b> r10 = r10.f43061g
            int r11 = r8.f144903e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r10 = r10.get(r11)
            yg1.b r10 = (yg1.C15999b) r10
            if (r10 == 0) goto L_0x00bb
            cj1.o5 r8 = r10.mo8804c(r8)
            goto L_0x00bc
        L_0x00bb:
            r8 = r5
        L_0x00bc:
            if (r8 == 0) goto L_0x0058
            boolean r10 = r1.mo14723d(r8)
            if (r10 == 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r8 = r5
        L_0x00c6:
            if (r8 == 0) goto L_0x0058
            java.lang.String r10 = r1.f43368b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "LiveCommentMsgInterceptor after extraFilter msg_type:"
            r11.append(r12)
            int r12 = r8.getType()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r9.mo86998D1(r10, r11)
            r3.add(r8)
            goto L_0x0058
        L_0x00e7:
            te3.ao0 r6 = r0.f105072a
            if (r6 == 0) goto L_0x00f6
            java.util.LinkedList<te3.xs0> r6 = r6.f130689t
            if (r6 == 0) goto L_0x00f6
            java.util.Collection r6 = gy3.C24564k0.m30737a(r6)
            r6.removeAll(r3)
        L_0x00f6:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            te3.ao0 r8 = r0.f105072a
            if (r8 == 0) goto L_0x0129
            java.util.LinkedList<te3.r41> r8 = r8.f130677e
            if (r8 == 0) goto L_0x0129
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x010c:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x012a
            java.lang.Object r10 = r8.next()
            r11 = r10
            te3.r41 r11 = (te3.C64674r41) r11
            int[] r12 = r17.mo14724e()
            int r11 = r11.f185127g
            boolean r11 = sx3.C110823p.m151008x(r12, r11)
            if (r11 == 0) goto L_0x010c
            r9.add(r10)
            goto L_0x010c
        L_0x0129:
            r9 = r5
        L_0x012a:
            if (r9 == 0) goto L_0x0135
            boolean r8 = r9.isEmpty()
            r8 = r8 ^ r7
            if (r8 != r7) goto L_0x0135
            r8 = 1
            goto L_0x0136
        L_0x0135:
            r8 = 0
        L_0x0136:
            if (r8 == 0) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r9 = r5
        L_0x013a:
            if (r9 == 0) goto L_0x017f
            java.util.Iterator r8 = r9.iterator()
        L_0x0140:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x017f
            java.lang.Object r9 = r8.next()
            te3.r41 r9 = (te3.C64674r41) r9
            fj1.b r10 = r1.f43367a
            androidx.lifecycle.i0 r10 = r10.mo71262a(r2)
            yg1.c r10 = (yg1.C16004c) r10
            java.lang.String r11 = "it"
            gy3.C87412m.m108593f(r9, r11)
            java.util.Map<java.lang.Integer, yg1.b> r10 = r10.f43061g
            int r11 = r9.f185127g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r10 = r10.get(r11)
            yg1.b r10 = (yg1.C15999b) r10
            if (r10 == 0) goto L_0x016e
            cj1.o5 r9 = r10.mo8796d(r9)
            goto L_0x016f
        L_0x016e:
            r9 = r5
        L_0x016f:
            if (r9 == 0) goto L_0x0140
            boolean r10 = r1.mo14723d(r9)
            if (r10 == 0) goto L_0x0178
            goto L_0x0179
        L_0x0178:
            r9 = r5
        L_0x0179:
            if (r9 == 0) goto L_0x0140
            r6.add(r9)
            goto L_0x0140
        L_0x017f:
            te3.ao0 r0 = r0.f105072a
            if (r0 == 0) goto L_0x018e
            java.util.LinkedList<te3.r41> r0 = r0.f130677e
            if (r0 == 0) goto L_0x018e
            java.util.Collection r0 = gy3.C24564k0.m30737a(r0)
            r0.removeAll(r6)
        L_0x018e:
            r3.addAll(r6)
            zg1.l$b r0 = new zg1.l$b
            r0.<init>()
            sx3.C77813z.m93909o(r3, r0)
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<cl1.z0> r2 = cl1.C0702z0.class
            java.util.Iterator r6 = r3.iterator()
        L_0x01a1:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01e7
            java.lang.Object r8 = r6.next()
            cj1.o5 r8 = (cj1.C0581o5) r8
            fj1.b r9 = r1.f43367a
            androidx.lifecycle.i0 r9 = r9.mo71262a(r0)
            cl1.o r9 = (cl1.C54991o) r9
            sg.i<java.lang.Long, cj1.o5> r9 = r9.f154330j2
            long r10 = r8.getSeq()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.put(r10, r8)
            java.lang.String r9 = r8.mo571e()
            if (r9 == 0) goto L_0x01a1
            fj1.b r10 = r1.f43367a
            androidx.lifecycle.i0 r10 = r10.mo71262a(r0)
            cl1.o r10 = (cl1.C54991o) r10
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r10 = r10.f154262U0
            te3.hx0 r8 = r8.mo579i()
            if (r8 == 0) goto L_0x01de
            int r8 = r8.f134921f
            if (r8 != r7) goto L_0x01de
            r8 = 1
            goto L_0x01df
        L_0x01de:
            r8 = 0
        L_0x01df:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r10.put(r9, r8)
            goto L_0x01a1
        L_0x01e7:
            fj1.b r6 = r1.f43367a
            androidx.lifecycle.i0 r6 = r6.mo71262a(r0)
            cl1.o r6 = (cl1.C54991o) r6
            fj1.b r8 = r1.f43367a
            androidx.lifecycle.i0 r0 = r8.mo71262a(r0)
            cl1.o r0 = (cl1.C54991o) r0
            long r8 = r0.f154257T0
            fj1.b r0 = r1.f43367a
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.z0 r0 = (cl1.C0702z0) r0
            java.util.List<cj1.o5> r0 = r0.f1672f
            int r0 = r0.size()
            long r10 = (long) r0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x020d
            r8 = r10
        L_0x020d:
            int r0 = r3.size()
            long r10 = (long) r0
            long r8 = r8 + r10
            r6.f154257T0 = r8
            fj1.b r0 = r1.f43367a
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.z0 r0 = (cl1.C0702z0) r0
            java.util.List<cj1.o5> r0 = r0.f1676j
            java.lang.String r6 = "liveContext.business(Liv…:class.java).floatMsgList"
            gy3.C87412m.m108593f(r0, r6)
            er1.j4 r6 = er1.C58739j4.f168176a
            boolean r6 = r6.mo83692U()
            if (r6 == 0) goto L_0x0341
            boolean r6 = fh1.C8035f.f26738c
            if (r6 == 0) goto L_0x0341
            te3.r41 r6 = new te3.r41
            r6.<init>()
            r6.f185136s = r7
            r8 = 3
            r6.f185137t = r8
            r6.f185127g = r7
            te3.hx0 r8 = new te3.hx0
            r8.<init>()
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            te3.aw0 r10 = new te3.aw0
            r10.<init>()
            r11 = 2
            r10.f130789d = r11
            java.lang.String r12 = "100级来了"
            r10.f130793h = r12
            int r12 = fh1.C8035f.f26737b
            int r12 = r12 + r7
            r10.f130791f = r12
            fh1.C8035f.f26737b = r12
            r9.add(r10)
            r8.f134930r = r9
            com.tencent.mm.protocal.protobuf.FinderContact r9 = new com.tencent.mm.protocal.protobuf.FinderContact
            r9.<init>()
            java.lang.String r10 = "dongbalu"
            r9.nickname = r10
            r8.f134919d = r9
            r6.f185132o = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            te3.hx0 r9 = r6.f185132o
            gy3.C87412m.m108591d(r9)
            java.util.LinkedList<te3.aw0> r9 = r9.f134930r
            java.lang.Object r9 = r9.getFirst()
            te3.aw0 r9 = (te3.C48770aw0) r9
            int r9 = r9.f130791f
            r8.append(r9)
            java.lang.String r9 = "全局大佬来了"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.f185126f = r8
            int r8 = fh1.C8035f.f26737b
            long r8 = (long) r8
            r6.f185129i = r8
            cj1.j5 r8 = new cj1.j5
            r8.<init>(r6)
            int r6 = fh1.C8035f.f26737b
            int r6 = r6 + r7
            r8.f1346c = r6
            r8.f1347d = r4
            r0.add(r8)
            te3.r41 r6 = new te3.r41
            r6.<init>()
            r6.f185136s = r7
            r6.f185137t = r11
            r6.f185127g = r7
            te3.hx0 r8 = new te3.hx0
            r8.<init>()
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            te3.aw0 r10 = new te3.aw0
            r10.<init>()
            r11 = 4
            r10.f130789d = r11
            int r11 = fh1.C8035f.f26737b
            r10.f130791f = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "粉丝团"
            r11.append(r12)
            int r12 = r10.f130791f
            r11.append(r12)
            java.lang.String r12 = "级来了"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.f130793h = r11
            r9.add(r10)
            r8.f134930r = r9
            com.tencent.mm.protocal.protobuf.FinderContact r9 = new com.tencent.mm.protocal.protobuf.FinderContact
            r9.<init>()
            java.lang.String r10 = "baludong"
            r9.nickname = r10
            r8.f134919d = r9
            r6.f185132o = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            te3.hx0 r9 = r6.f185132o
            gy3.C87412m.m108591d(r9)
            java.util.LinkedList<te3.aw0> r9 = r9.f134930r
            java.lang.Object r9 = r9.getFirst()
            te3.aw0 r9 = (te3.C48770aw0) r9
            int r9 = r9.f130791f
            r8.append(r9)
            java.lang.String r9 = "大佬，你说粉丝团怎么样"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.f185126f = r8
            int r8 = fh1.C8035f.f26737b
            long r8 = (long) r8
            r6.f185129i = r8
            cj1.j5 r8 = new cj1.j5
            r8.<init>(r6)
            int r6 = fh1.C8035f.f26737b
            r8.f1346c = r6
            r8.f1347d = r4
            r0.add(r8)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "after add float msg update size:"
            r6.append(r8)
            int r0 = r0.size()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r6 = "CommentItemTextDanmaku"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x0341:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r3.iterator()
        L_0x034a:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x037a
            java.lang.Object r8 = r6.next()
            r9 = r8
            cj1.o5 r9 = (cj1.C0581o5) r9
            boolean r10 = r9.mo578h()
            if (r10 == 0) goto L_0x0373
            rx3.g r10 = r1.f43371e
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            int[] r10 = (int[]) r10
            int r9 = r9.mo584n()
            boolean r9 = sx3.C110823p.m151008x(r10, r9)
            if (r9 == 0) goto L_0x0373
            r9 = 1
            goto L_0x0374
        L_0x0373:
            r9 = 0
        L_0x0374:
            if (r9 == 0) goto L_0x034a
            r0.add(r8)
            goto L_0x034a
        L_0x037a:
            boolean r6 = r0.isEmpty()
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0382
            r5 = r0
        L_0x0382:
            if (r5 == 0) goto L_0x03d0
            fj1.b r0 = r1.f43367a
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.z0 r0 = (cl1.C0702z0) r0
            boolean r5 = r0.mo670d3()
            if (r5 == 0) goto L_0x03a0
            java.util.List<cj1.o5> r5 = r0.f1676j
            r5.addAll(r3)
            d14.t0<java.lang.Boolean> r0 = r0.f1687x
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            d14.z0 r0 = (d14.C58100z0) r0
            r0.mo82832d(r5)
        L_0x03a0:
            java.lang.String r0 = r1.f43368b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "LiveDanmaku_step1，float msg update size:"
            r5.append(r6)
            int r6 = r3.size()
            r5.append(r6)
            java.lang.String r6 = ",total size:"
            r5.append(r6)
            fj1.b r6 = r1.f43367a
            androidx.lifecycle.i0 r6 = r6.mo71262a(r2)
            cl1.z0 r6 = (cl1.C0702z0) r6
            java.util.List<cj1.o5> r6 = r6.f1676j
            int r6 = r6.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
        L_0x03d0:
            boolean r0 = r1.f43370d
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r0 == 0) goto L_0x04ea
            cj1.w3 r0 = cj1.C54843w3.f153747a
            fj1.b r0 = r1.f43367a
            java.lang.String r6 = "liveroomData"
            gy3.C87412m.m108594g(r0, r6)
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.z0 r0 = (cl1.C0702z0) r0
            r6 = 500(0x1f4, float:7.0E-43)
            java.util.List<cj1.o5> r8 = r0.f1672f     // Catch:{ Exception -> 0x04d0 }
            int r0 = r3.size()     // Catch:{ Exception -> 0x04d0 }
            int r9 = r8.size()     // Catch:{ Exception -> 0x04d0 }
            int r0 = r0 + r9
            if (r0 <= r5) goto L_0x03f7
            int r9 = r0 + -800
            goto L_0x03f8
        L_0x03f7:
            r9 = 0
        L_0x03f8:
            java.lang.String r10 = "Finder.FinderLiveMsgManager"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d0 }
            r11.<init>()     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = "checkCommentListSizeSaveMySelf maxCount:"
            r11.append(r12)     // Catch:{ Exception -> 0x04d0 }
            r11.append(r5)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r5 = ", totalMsgSize;"
            r11.append(r5)     // Catch:{ Exception -> 0x04d0 }
            r11.append(r0)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r0 = ", removeSize:"
            r11.append(r0)     // Catch:{ Exception -> 0x04d0 }
            r11.append(r9)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x04d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x04d0 }
            if (r9 <= 0) goto L_0x0577
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Exception -> 0x04d0 }
            r0.<init>()     // Catch:{ Exception -> 0x04d0 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x04d0 }
            java.util.Iterator r5 = r8.iterator()     // Catch:{ all -> 0x04cd }
            r10 = 0
        L_0x042b:
            boolean r11 = r5.hasNext()     // Catch:{ all -> 0x04cd }
            if (r11 == 0) goto L_0x0454
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x04cd }
            java.lang.String r12 = "localMsgIterator.next()"
            gy3.C87412m.m108593f(r11, r12)     // Catch:{ all -> 0x04cd }
            er1.j4 r12 = er1.C58739j4.f168176a     // Catch:{ all -> 0x04cd }
            r13 = r11
            cj1.o5 r13 = (cj1.C0581o5) r13     // Catch:{ all -> 0x04cd }
            java.lang.String r13 = r13.mo571e()     // Catch:{ all -> 0x04cd }
            boolean r12 = r12.mo83694W(r13)     // Catch:{ all -> 0x04cd }
            if (r12 != 0) goto L_0x044f
            r5.remove()     // Catch:{ all -> 0x04cd }
            int r10 = r10 + 1
            goto L_0x0452
        L_0x044f:
            r0.add(r11)     // Catch:{ all -> 0x04cd }
        L_0x0452:
            if (r10 < r9) goto L_0x042b
        L_0x0454:
            monitor-exit(r8)     // Catch:{ Exception -> 0x04d0 }
            if (r10 >= r9) goto L_0x048b
            java.util.Iterator r5 = r3.iterator()     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r11 = "remoteLiveMsg.iterator()"
            gy3.C87412m.m108593f(r5, r11)     // Catch:{ Exception -> 0x04d0 }
            r11 = r10
        L_0x0461:
            boolean r12 = r5.hasNext()     // Catch:{ Exception -> 0x04d0 }
            if (r12 == 0) goto L_0x048c
            java.lang.Object r12 = r5.next()     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r13 = "remoteMsgIterator.next()"
            gy3.C87412m.m108593f(r12, r13)     // Catch:{ Exception -> 0x04d0 }
            er1.j4 r13 = er1.C58739j4.f168176a     // Catch:{ Exception -> 0x04d0 }
            r14 = r12
            cj1.o5 r14 = (cj1.C0581o5) r14     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r14 = r14.mo571e()     // Catch:{ Exception -> 0x04d0 }
            boolean r13 = r13.mo83694W(r14)     // Catch:{ Exception -> 0x04d0 }
            if (r13 != 0) goto L_0x0485
            r5.remove()     // Catch:{ Exception -> 0x04d0 }
            int r11 = r11 + 1
            goto L_0x0488
        L_0x0485:
            r0.add(r12)     // Catch:{ Exception -> 0x04d0 }
        L_0x0488:
            if (r11 < r9) goto L_0x0461
            goto L_0x048c
        L_0x048b:
            r11 = r10
        L_0x048c:
            int r11 = r11 - r10
            int r5 = r0.size()     // Catch:{ Exception -> 0x04d0 }
            if (r5 <= r6) goto L_0x04a5
            int r5 = r5 + -400
            my3.j r6 = new my3.j     // Catch:{ Exception -> 0x04d0 }
            r6.<init>(r4, r5)     // Catch:{ Exception -> 0x04d0 }
            java.util.List r0 = sx3.C110818d0.m150941m0(r0, r6)     // Catch:{ Exception -> 0x04d0 }
            r8.removeAll(r0)     // Catch:{ Exception -> 0x04d0 }
            r3.removeAll(r0)     // Catch:{ Exception -> 0x04d0 }
            r4 = r5
        L_0x04a5:
            java.lang.String r0 = "Finder.FinderLiveMsgManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d0 }
            r5.<init>()     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r6 = "checkCommentListSizeSaveMySelf localMsgRemoveSize:"
            r5.append(r6)     // Catch:{ Exception -> 0x04d0 }
            r5.append(r10)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r6 = ",remoteMsgRemoveSize:"
            r5.append(r6)     // Catch:{ Exception -> 0x04d0 }
            r5.append(r11)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r6 = ",myselfRemoveSize:"
            r5.append(r6)     // Catch:{ Exception -> 0x04d0 }
            r5.append(r4)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x04d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ Exception -> 0x04d0 }
            goto L_0x0577
        L_0x04cd:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ Exception -> 0x04d0 }
            throw r0     // Catch:{ Exception -> 0x04d0 }
        L_0x04d0:
            r0 = move-exception
            ft1.a r8 = ft1.C59319a.f169618b
            java.lang.String r9 = "liveCheckCommentMsgErr"
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 60
            r16 = 0
            o40.C11348f.C11349a.m11178b(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            er1.j4 r4 = er1.C58739j4.f168176a
            java.lang.String r5 = "checkCommentListSizeSaveMySelf"
            r4.mo83712h0(r0, r5)
            goto L_0x0577
        L_0x04ea:
            cj1.w3 r0 = cj1.C54843w3.f153747a
            fj1.b r0 = r1.f43367a
            java.lang.String r4 = "liveRoomData"
            gy3.C87412m.m108594g(r0, r4)
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.z0 r0 = (cl1.C0702z0) r0
            androidx.lifecycle.i0 r4 = r0.business(r2)
            cl1.z0 r4 = (cl1.C0702z0) r4
            java.util.List<cj1.o5> r4 = r4.f1672f
            int r6 = r4.size()
            int r8 = r3.size()
            int r6 = r6 + r8
            int r5 = r5 - r6
            if (r5 >= 0) goto L_0x0577
            androidx.lifecycle.i0 r6 = r0.business(r2)
            cl1.z0 r6 = (cl1.C0702z0) r6
            int r6 = r6.f1677n
            androidx.lifecycle.i0 r8 = r0.business(r2)
            cl1.z0 r8 = (cl1.C0702z0) r8
            java.util.List<cj1.o5> r8 = r8.f1672f
            int r8 = r8.size()
            int r8 = r8 + -1
            int r8 = r8 - r6
            androidx.lifecycle.i0 r9 = r0.business(r2)
            cl1.z0 r9 = (cl1.C0702z0) r9
            int r9 = r9.f1677n
            if (r9 < 0) goto L_0x0568
            if (r8 <= 0) goto L_0x0568
            int r5 = -r5
            if (r8 <= r5) goto L_0x0549
            my3.j r0 = new my3.j
            int r8 = r6 + 1
            int r6 = r6 + r5
            r0.<init>(r8, r6)
            monitor-enter(r4)
            java.util.List r0 = sx3.C110818d0.m150941m0(r4, r0)     // Catch:{ all -> 0x0545 }
            monitor-exit(r4)
            r4.removeAll(r0)
            goto L_0x0577
        L_0x0545:
            r0 = move-exception
            r2 = r0
            monitor-exit(r4)
            throw r2
        L_0x0549:
            int r6 = r6 + r7
            androidx.lifecycle.i0 r0 = r0.business(r2)
            cl1.z0 r0 = (cl1.C0702z0) r0
            java.util.List<cj1.o5> r0 = r0.f1672f
            int r0 = r0.size()
            my3.j r0 = my3.C61595o.m72301i(r6, r0)
            monitor-enter(r4)
            java.util.List r0 = sx3.C110818d0.m150941m0(r4, r0)     // Catch:{ all -> 0x0564 }
            monitor-exit(r4)
            r4.removeAll(r0)
            goto L_0x0577
        L_0x0564:
            r0 = move-exception
            r2 = r0
            monitor-exit(r4)
            throw r2
        L_0x0568:
            int r0 = -r5
            monitor-enter(r4)
            java.util.List r0 = sx3.C110818d0.m150947s0(r4, r0)     // Catch:{ all -> 0x0573 }
            monitor-exit(r4)
            r4.removeAll(r0)
            goto L_0x0577
        L_0x0573:
            r0 = move-exception
            r2 = r0
            monitor-exit(r4)
            throw r2
        L_0x0577:
            fj1.b r0 = r1.f43367a
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.z0 r0 = (cl1.C0702z0) r0
            java.util.List<cj1.o5> r0 = r0.f1672f
            r0.addAll(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C16178l.mo49b(yg1.a$a):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x009e A[EDGE_INSN: B:94:0x009e->B:41:0x009e ?: BREAK  , SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14723d(cj1.C0581o5 r10) {
        /*
            r9 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            int r1 = r10.getType()
            r2 = 20013(0x4e2d, float:2.8044E-41)
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0010
            boolean r1 = r9.f43369c
            if (r1 == 0) goto L_0x0154
        L_0x0010:
            int r1 = r10.getType()
            r5 = 20014(0x4e2e, float:2.8046E-41)
            if (r1 == r5) goto L_0x0154
            int r1 = r10.getType()
            r5 = 20019(0x4e33, float:2.8053E-41)
            if (r1 == r5) goto L_0x0154
            int r1 = r10.getType()
            r5 = 20020(0x4e34, float:2.8054E-41)
            if (r1 == r5) goto L_0x0154
            fj1.b r1 = r9.f43367a
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            cl1.o r1 = (cl1.C54991o) r1
            java.util.List<java.lang.String> r1 = r1.f154220K2
            java.lang.String r5 = r10.mo572f()
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L_0x0154
            fj1.b r1 = r9.f43367a
            androidx.lifecycle.i0 r0 = r1.mo71262a(r0)
            cl1.o r0 = (cl1.C54991o) r0
            java.util.List<cj1.o5> r0 = r0.f154224L2
            java.lang.String r1 = "liveContext.business(Liv…).myLocalTextCommentCache"
            gy3.C87412m.m108593f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x009d
            java.lang.Object r1 = r0.next()
            r5 = r1
            cj1.o5 r5 = (cj1.C0581o5) r5
            boolean r6 = r5 instanceof cj1.C0556j5
            if (r6 == 0) goto L_0x0065
            r6 = r5
            cj1.j5 r6 = (cj1.C0556j5) r6
            goto L_0x0066
        L_0x0065:
            r6 = r2
        L_0x0066:
            if (r6 == 0) goto L_0x006f
            te3.r41 r6 = r6.f1344a
            if (r6 == 0) goto L_0x006f
            java.lang.String r6 = r6.f185130j
            goto L_0x0070
        L_0x006f:
            r6 = r2
        L_0x0070:
            java.lang.String r7 = r10.mo572f()
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 != 0) goto L_0x0099
            boolean r6 = r5 instanceof cj1.C0537f2
            if (r6 == 0) goto L_0x0081
            cj1.f2 r5 = (cj1.C0537f2) r5
            goto L_0x0082
        L_0x0081:
            r5 = r2
        L_0x0082:
            if (r5 == 0) goto L_0x008b
            te3.xs0 r5 = r5.f1301a
            if (r5 == 0) goto L_0x008b
            java.lang.String r5 = r5.f144904f
            goto L_0x008c
        L_0x008b:
            r5 = r2
        L_0x008c:
            java.lang.String r6 = r10.mo572f()
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r5 = 0
            goto L_0x009a
        L_0x0099:
            r5 = 1
        L_0x009a:
            if (r5 == 0) goto L_0x004f
            goto L_0x009e
        L_0x009d:
            r1 = r2
        L_0x009e:
            cj1.o5 r1 = (cj1.C0581o5) r1
            if (r1 == 0) goto L_0x0153
            boolean r0 = r1 instanceof cj1.C0556j5
            java.lang.String r3 = ", contact sex:"
            java.lang.String r5 = ", seq:"
            if (r0 == 0) goto L_0x00fd
            cj1.j5 r1 = (cj1.C0556j5) r1
            long r6 = r10.getSeq()
            te3.r41 r0 = r1.f1344a
            r0.f185129i = r6
            te3.hx0 r0 = r10.mo579i()
            if (r0 == 0) goto L_0x00be
            te3.r41 r6 = r1.f1344a
            r6.f185132o = r0
        L_0x00be:
            java.lang.String r0 = r9.f43368b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "fillback selfcomment, text, content:"
            r6.append(r7)
            java.lang.String r7 = r10.getContent()
            r6.append(r7)
            r6.append(r5)
            long r7 = r10.getSeq()
            r6.append(r7)
            r6.append(r3)
            te3.r41 r10 = r1.f1344a
            te3.hx0 r10 = r10.f185132o
            if (r10 == 0) goto L_0x00f2
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r10.f134919d
            if (r10 == 0) goto L_0x00f2
            te3.ii0 r10 = r10.extInfo
            if (r10 == 0) goto L_0x00f2
            int r10 = r10.f135356g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
        L_0x00f2:
            r6.append(r2)
            java.lang.String r10 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            goto L_0x0153
        L_0x00fd:
            boolean r0 = r1 instanceof cj1.C0537f2
            if (r0 == 0) goto L_0x0153
            cj1.f2 r1 = (cj1.C0537f2) r1
            long r6 = r10.getSeq()
            te3.xs0 r0 = r1.f1301a
            r0.f144913r = r6
            te3.hx0 r0 = r10.mo579i()
            if (r0 == 0) goto L_0x0115
            te3.xs0 r6 = r1.f1301a
            r6.f144914s = r0
        L_0x0115:
            java.lang.String r0 = r9.f43368b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "fillback selfcomment, interactive, content:"
            r6.append(r7)
            java.lang.String r7 = r10.getContent()
            r6.append(r7)
            r6.append(r5)
            long r7 = r10.getSeq()
            r6.append(r7)
            r6.append(r3)
            te3.xs0 r10 = r1.f1301a
            te3.hx0 r10 = r10.f144914s
            if (r10 == 0) goto L_0x0149
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r10.f134919d
            if (r10 == 0) goto L_0x0149
            te3.ii0 r10 = r10.extInfo
            if (r10 == 0) goto L_0x0149
            int r10 = r10.f135356g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
        L_0x0149:
            r6.append(r2)
            java.lang.String r10 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
        L_0x0153:
            return r4
        L_0x0154:
            fj1.b r1 = r9.f43367a
            androidx.lifecycle.i0 r0 = r1.mo71262a(r0)
            cl1.o r0 = (cl1.C54991o) r0
            sg.i<java.lang.Long, cj1.o5> r0 = r0.f154330j2
            long r5 = r10.getSeq()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x016d
            return r4
        L_0x016d:
            int r0 = r10.getType()
            if (r0 != r2) goto L_0x0196
            boolean r0 = r9.f43369c
            if (r0 == 0) goto L_0x0196
            java.lang.String r0 = r10.mo571e()
            java.lang.String r1 = eb0.C75592q0.m90789s()
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = r10.mo571e()
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r1 = r1.mo90662O5()
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x0196
        L_0x0195:
            return r4
        L_0x0196:
            int r0 = r10.getType()
            r1 = 20036(0x4e44, float:2.8076E-41)
            if (r0 != r1) goto L_0x01b1
            java.lang.String r10 = r10.getContent()
            if (r10 == 0) goto L_0x01ad
            int r10 = r10.length()
            if (r10 != 0) goto L_0x01ab
            goto L_0x01ad
        L_0x01ab:
            r10 = 0
            goto L_0x01ae
        L_0x01ad:
            r10 = 1
        L_0x01ae:
            if (r10 == 0) goto L_0x01b1
            return r4
        L_0x01b1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C16178l.mo14723d(cj1.o5):boolean");
    }

    /* renamed from: e */
    public final int[] mo14724e() {
        C16004c cVar = (C16004c) this.f43367a.mo71262a(C16004c.class);
        if (cVar.f43061g.isEmpty()) {
            cVar.mo14630d3();
        }
        if (cVar.f43062h.length == cVar.f43061g.size()) {
            return cVar.f43062h;
        }
        ArrayList arrayList = new ArrayList();
        Map<Integer, C15999b> map = cVar.f43061g;
        C87412m.m108593f(map, "itemMap");
        synchronized (map) {
            for (Map.Entry<Integer, C15999b> key : map.entrySet()) {
                arrayList.add(key.getKey());
            }
        }
        int[] x0 = C110818d0.m150952x0(arrayList);
        cVar.f43062h = x0;
        return x0;
    }
}
