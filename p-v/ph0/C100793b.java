package ph0;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.autogen.mmdata.rpt.SendAlbumMsgErrorReportStruct;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import di3.C86312j;
import dm2.C58325i;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C89132b;
import p1083jg.C98941c;
import p158gt.C98199a0;
import p158gt.C98201k;
import p158gt.C98202n;
import p434ig.C98674g;
import p606mm.C99933h;
import p749xh.C38549d8;
import pe3.C47465a;
import qh0.C62619a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64596nz3;

/* renamed from: ph0.b */
public class C100793b {

    /* renamed from: a */
    public final C13601g f295262a = C36568h.m40985a(C35489a.f94931d);

    /* renamed from: ph0.b$a */
    public static final class C35489a extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public static final C35489a f94931d = new C35489a();

        public C35489a() {
            super(0);
        }

        public Object invoke() {
            String str = C86709a0.m107523b().mo121111i() + "_image_pre_build";
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            return C112760b.m154236i0(str);
        }
    }

    /* renamed from: ph0.b$b */
    public static final class C62285b<T extends C47465a> implements C58325i {

        /* renamed from: a */
        public final /* synthetic */ long f177058a;

        public C62285b(long j) {
            this.f177058a = j;
        }

        /* renamed from: a */
        public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
            C62619a aVar2 = (C62619a) aVar;
            if (aVar2 != null) {
                ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(18, String.valueOf(this.f177058a), aVar2, C62286c.f177059a);
            }
        }
    }

    /* renamed from: ph0.b$c */
    public static final class C100794c extends C87413o implements C32226l<C89132b.C89134c<C64596nz3>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f295263d;

        /* renamed from: e */
        public final /* synthetic */ C98674g f295264e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100794c(C72963f4 f4Var, C98674g gVar) {
            super(1);
            this.f295263d = f4Var;
            this.f295264e = gVar;
        }

        public Object invoke(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C98201k.class;
            C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127194nP(Long.valueOf(this.f295263d.getMsgId()));
            if (!(cVar.f256793a == 0 && cVar.f256794b == 0)) {
                nP.mo127127D(-1);
            }
            C64596nz3 nz32 = (C64596nz3) cVar.f256796d;
            nP.mo127125B(nz32 != null ? nz32.f184595n : 0);
            nP.mo127153x(1);
            nP.mo127126C((int) C100792a.f295260a.mo140253y(this.f295264e));
            if (((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).Dx0(Long.valueOf(this.f295263d.getMsgId()), nP) < 0) {
                Log.m105924i("MicroMsg.SendAlbumPreBuilder", "doSendContinue, update imgInfo failed");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ph0.b$d */
    public static final class C100795d<T extends C47465a> implements C58325i {

        /* renamed from: a */
        public static final C100795d<T> f295265a = new C100795d<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
            C62619a aVar2 = (C62619a) aVar;
        }
    }

    /* renamed from: ph0.b$e */
    public static final class C100796e<T extends C47465a> implements C58325i {

        /* renamed from: a */
        public static final C100796e<T> f295266a = new C100796e<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
            C62619a aVar2 = (C62619a) aVar;
        }
    }

    /* renamed from: ph0.b$f */
    public static final class C100797f extends C87413o implements C32226l<C89132b.C89134c<C64596nz3>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f295267d;

        /* renamed from: e */
        public final /* synthetic */ C98674g f295268e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100797f(C72963f4 f4Var, C98674g gVar) {
            super(1);
            this.f295267d = f4Var;
            this.f295268e = gVar;
        }

        public Object invoke(Object obj) {
            int i;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C98201k.class;
            C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127194nP(Long.valueOf(this.f295267d.getMsgId()));
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                i = 1;
            } else {
                nP.mo127127D(-1);
                i = 2;
            }
            C64596nz3 nz32 = (C64596nz3) cVar.f256796d;
            long j = 0;
            nP.mo127125B(nz32 != null ? nz32.f184595n : 0);
            nP.mo127153x(1);
            nP.mo127126C((int) C100792a.f295260a.mo140253y(this.f295268e));
            if (((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).Dx0(Long.valueOf(this.f295267d.getMsgId()), nP) < 0) {
                Log.m105924i("MicroMsg.SendAlbumPreBuilder", "doSendContinue, update imgInfo failed");
            }
            long msgId = this.f295267d.getMsgId();
            C64596nz3 nz33 = (C64596nz3) cVar.f256796d;
            if (nz33 != null) {
                j = nz33.f184595n;
            }
            String t = this.f295267d.mo108768t();
            C87412m.m108593f(t, "msg.talker");
            ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, String.valueOf(msgId), C62619a.class, new C98941c(i, j, t));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final boolean mo140254a(C98199a0 a0Var, String str, String str2) {
        C86009m1 m1Var = new C86009m1(new C86009m1(mo140255b(), ((C98202n) C86312j.m106911c(C98202n.class)).Ug0(a0Var)), str);
        if (m1Var.mo119967g()) {
            return C86013q1.m106463x(m1Var.mo119971i(), str2);
        }
        return false;
    }

    /* renamed from: b */
    public final C86009m1 mo140255b() {
        return (C86009m1) ((C36570n) this.f295262a).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0328 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140256c(p158gt.C98200b0 r33, p434ig.C98674g r34, boolean r35, java.util.ArrayList<mh0.C99893q> r36, java.util.List<ph0.C100798d> r37, p158gt.C59701t r38) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            java.lang.Class<gt.k> r6 = p158gt.C98201k.class
            ig.a r7 = new ig.a
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131821991(0x7f1105a7, float:1.927674E38)
            java.lang.String r9 = r9.getString(r10)
            java.lang.String r10 = "getContext().resources.g…appmsg_album_warning_tip)"
            gy3.C87412m.m108593f(r9, r10)
            r7.f74637h = r9
            java.lang.Class<hg.d> r9 = p548hg.C98450d.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            hg.d r9 = (p548hg.C98450d) r9
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r11 = "getContext()"
            gy3.C87412m.m108593f(r10, r11)
            java.lang.String r9 = r9.mo137793FC(r10, r2)
            r7.mo53877N(r9)
            java.lang.String r9 = r7.f74637h
            r2.mo55359L(r9)
            java.lang.String r9 = r7.f74638i
            r2.mo55356I(r9)
            ph0.a r9 = ph0.C100792a.f295260a
            r9.mo140230a(r7, r2)
            com.tencent.mm.storage.f4 r9 = new com.tencent.mm.storage.f4
            r9.<init>()
            r10 = 1
            r9.mo100991d(r10)
            java.lang.String r11 = r1.f287927a
            r9.mo108749c3(r11)
            java.lang.String r11 = r1.f287927a
            long r11 = eb0.C75604z3.m90843o(r11)
            r9.mo108733M2(r11)
            r9.mo108740T2(r10)
            r11 = 1124073521(0x43000031, float:128.00075)
            r9.setType(r11)
            java.lang.String r11 = r7.mo141118z()
            r9.mo108732L2(r11)
            k40.a r11 = f40.C86709a0.m107533q(r5)
            f62.k0 r11 = (f62.C75700k0) r11
            g62.l r11 = r11.mo96095LE()
            com.tencent.mm.storage.g4 r11 = (com.tencent.p014mm.storage.C72972g4) r11
            long r11 = r11.my0(r9)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = p206nj.C76861g.m92660c()
            r13.append(r14)
            java.lang.String r14 = " msginfo insert id: "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "MicroMsg.SendAlbumPreBuilder"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r13)
            r15 = 0
            int r13 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x00db
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            java.lang.String r2 = "insert msg failed :"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r1)
            if (r38 == 0) goto L_0x00da
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r38
            com.tencent.mm.ui.chatting.SendImgProxyUI$a$$a r2 = (com.tencent.p014mm.p136ui.chatting.SendImgProxyUI$a$$a) r2
            r2.mo135712a(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00da:
            return
        L_0x00db:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r15 = p206nj.C76861g.m92658a()
            r13.append(r15)
            java.lang.String r15 = " new msg inserted to db , local id = "
            r13.append(r15)
            r13.append(r11)
            java.lang.String r15 = ", needNetScene= "
            r13.append(r15)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            r9.setMsgId(r11)
            java.util.List r13 = r34.mo55348A()
            java.util.Iterator r13 = r13.iterator()
        L_0x0109:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0339
            java.lang.Object r15 = r13.next()
            ig.d r15 = (p434ig.C98672d) r15
            int r10 = r15.mo55274P()
            r17 = r13
            r13 = 2
            if (r10 != r13) goto L_0x0320
            java.util.Iterator r10 = r37.iterator()
        L_0x0122:
            boolean r13 = r10.hasNext()
            r18 = 0
            if (r13 == 0) goto L_0x0147
            java.lang.Object r13 = r10.next()
            r19 = r10
            r10 = r13
            ph0.d r10 = (ph0.C100798d) r10
            java.lang.String r10 = r10.f295270b
            r20 = r13
            java.lang.String r13 = r15.mo55264K()
            boolean r10 = gy3.C87412m.m108589b(r10, r13)
            if (r10 == 0) goto L_0x0144
            r13 = r20
            goto L_0x0149
        L_0x0144:
            r10 = r19
            goto L_0x0122
        L_0x0147:
            r13 = r18
        L_0x0149:
            ph0.d r13 = (ph0.C100798d) r13
            gt.a0 r10 = new gt.a0
            r10.<init>()
            r19 = r5
            if (r13 == 0) goto L_0x0158
            java.lang.String r5 = r13.f295271c
            if (r5 != 0) goto L_0x015a
        L_0x0158:
            java.lang.String r5 = ""
        L_0x015a:
            r10.f287922c = r5
            java.lang.String r3 = r1.f287927a
            r20 = r8
            int r8 = r1.f287930d
            if (r8 != 0) goto L_0x0166
            r8 = 1
            goto L_0x0167
        L_0x0166:
            r8 = 0
        L_0x0167:
            boolean r3 = eb0.C75592q0.m90771a(r5, r3, r8)
            if (r3 == 0) goto L_0x0179
            boolean r5 = com.tencent.p014mm.modelimage.C92806b.m116987a(r5)
            if (r5 == 0) goto L_0x0179
            java.lang.String r3 = "getCompressType send no compress as bigImg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            r3 = 0
        L_0x0179:
            r10.f287925f = r3
            int r3 = r1.f287928b
            r10.f287920a = r3
            java.lang.String r3 = r1.f287927a
            java.lang.String r5 = "<set-?>"
            gy3.C87412m.m108594g(r3, r5)
            r10.f287924e = r3
            int r3 = r1.f287929c
            r10.f287921b = r3
            ph0.a r3 = ph0.C100792a.f295260a
            java.lang.String r5 = r3.mo140250v(r15, r9)
            java.lang.String r8 = "thumb.jpg"
            boolean r8 = r0.mo140254a(r10, r8, r5)
            if (r8 != 0) goto L_0x01c8
            r8 = 10000(0x2710, float:1.4013E-41)
            r0.mo140257d(r10, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "copy thumb fail "
            r8.append(r2)
            if (r13 == 0) goto L_0x01af
            java.lang.String r2 = r13.f295271c
            goto L_0x01b1
        L_0x01af:
            r2 = r18
        L_0x01b1:
            r8.append(r2)
            r2 = 32
            r8.append(r2)
            r8.append(r5)
            java.lang.String r2 = " and regenerate thumb"
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
        L_0x01c8:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r5 = "hd"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "hd_thumb.jpg"
            boolean r5 = r0.mo140254a(r10, r5, r2)
            if (r5 != 0) goto L_0x020b
            r5 = 10001(0x2711, float:1.4014E-41)
            r0.mo140257d(r10, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "copy hd thumb fail "
            r5.append(r8)
            if (r13 == 0) goto L_0x01f7
            java.lang.String r8 = r13.f295271c
            goto L_0x01f9
        L_0x01f7:
            r8 = r18
        L_0x01f9:
            r5.append(r8)
            r8 = 32
            r5.append(r8)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
        L_0x020b:
            java.lang.String r5 = r3.mo140245q(r15, r9)
            java.lang.String r8 = r10.f287922c
            long r21 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            int r8 = r1.f287930d
            r18 = r6
            r6 = 1
            if (r8 != r6) goto L_0x02a9
            int r6 = com.tencent.p014mm.modelimage.C92806b.m116988b()
            r8 = r7
            long r6 = (long) r6
            int r23 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r23 <= 0) goto L_0x02a6
            java.lang.String r6 = "orig_mid.jpg"
            boolean r6 = r0.mo140254a(r10, r6, r5)
            java.lang.String r7 = "check orig fail "
            if (r6 != 0) goto L_0x0255
            r6 = 10002(0x2712, float:1.4016E-41)
            r0.mo140257d(r10, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r21 = r8
            java.lang.String r8 = r10.f287922c
            r6.append(r8)
            r8 = 32
            r6.append(r8)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
            goto L_0x0257
        L_0x0255:
            r21 = r8
        L_0x0257:
            java.lang.String r3 = r3.mo140238j(r15, r9)
            java.lang.String r6 = "orig.jpg"
            boolean r6 = r0.mo140254a(r10, r6, r3)
            if (r6 != 0) goto L_0x0285
            r6 = 10003(0x2713, float:1.4017E-41)
            r0.mo140257d(r10, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            java.lang.String r7 = r10.f287922c
            r6.append(r7)
            r7 = 32
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
        L_0x0285:
            mh0.q r6 = new mh0.q
            r6.<init>()
            java.lang.String r7 = r15.mo55264K()
            r6.mo55395T(r7)
            int r7 = r15.mo55274P()
            r6.f292702g = r7
            int r7 = r1.f287930d
            r6.f292703h = r7
            r6.f292704i = r3
            r6.f292705j = r5
            r6.mo55403b0(r2)
            r4.add(r6)
            goto L_0x02f5
        L_0x02a6:
            r21 = r8
            goto L_0x02ab
        L_0x02a9:
            r21 = r7
        L_0x02ab:
            java.lang.String r3 = "mid.jpg"
            boolean r3 = r0.mo140254a(r10, r3, r5)
            if (r3 != 0) goto L_0x02d7
            r3 = 10004(0x2714, float:1.4019E-41)
            r0.mo140257d(r10, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "check mid fail "
            r3.append(r6)
            java.lang.String r6 = r10.f287922c
            r3.append(r6)
            r6 = 32
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
        L_0x02d7:
            mh0.q r3 = new mh0.q
            r3.<init>()
            java.lang.String r6 = r15.mo55264K()
            r3.mo55395T(r6)
            int r6 = r15.mo55274P()
            r3.f292702g = r6
            int r6 = r1.f287930d
            r3.f292703h = r6
            r3.f292705j = r5
            r3.mo55403b0(r2)
            r4.add(r3)
        L_0x02f5:
            if (r13 == 0) goto L_0x0328
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r3 = r32.mo140255b()
            java.lang.String r5 = r13.f295269a
            r2.<init>((com.tencent.p014mm.vfs.C86009m1) r3, (java.lang.String) r5)
            java.lang.String r2 = r2.mo119971i()
            r3 = 1
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106446g(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "deletePreBuildFolder:"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            goto L_0x0328
        L_0x0320:
            r19 = r5
            r18 = r6
            r21 = r7
            r20 = r8
        L_0x0328:
            r2 = r34
            r3 = r35
            r13 = r17
            r6 = r18
            r5 = r19
            r8 = r20
            r7 = r21
            r10 = 1
            goto L_0x0109
        L_0x0339:
            r19 = r5
            r18 = r6
            r21 = r7
            r20 = r8
            i40.b$a r2 = i40.C98597b.f289091e
            java.lang.Class<mh0.d> r3 = mh0.C99864d.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            java.lang.String r5 = "getService(AlbumFeatureService::class.java)"
            gy3.C87412m.m108593f(r3, r5)
            i40.e r3 = (i40.C98598e) r3
            java.lang.Class<mh0.e0> r5 = mh0.C99865e0.class
            i40.b r2 = r2.mo85231a(r3, r5)
            r22 = r2
            mh0.e0 r22 = (mh0.C99865e0) r22
            mh0.a r2 = new mh0.a
            r2.<init>()
            mh0.n r3 = r2.f292635g
            java.util.ArrayList r3 = r3.mo139238A()
            r3.addAll(r4)
            r3 = 100
            r2.f292636h = r3
            rx3.b0 r3 = rx3.C13598b0.f38549a
            java.lang.String r3 = r1.f287927a
            long r25 = r9.getMsgId()
            long r27 = r9.mo108774y2()
            r29 = 0
            r30 = 16
            r31 = 0
            r23 = r2
            r24 = r3
            mh0.C99865e0.m130419i3(r22, r23, r24, r25, r27, r29, r30, r31)
            java.lang.Class<mm.h> r2 = p606mm.C99933h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            mm.h r2 = (p606mm.C99933h) r2
            r3 = 18
            java.lang.Class<qh0.a> r4 = qh0.C62619a.class
            ph0.b$b r5 = new ph0.b$b
            r5.<init>(r11)
            java.lang.String r6 = "album_enter_from_scene"
            r2.mo84406lr(r3, r6, r4, r5)
            com.tencent.mm.message.l r2 = new com.tencent.mm.message.l
            r2.<init>()
            java.lang.String r3 = r9.getContent()
            r2.field_xml = r3
            r3 = r21
            java.lang.String r4 = r3.f74637h
            r2.field_title = r4
            int r4 = r3.f74641l
            r2.field_type = r4
            java.lang.String r4 = r3.f74638i
            r2.field_description = r4
            long r4 = r9.getMsgId()
            r2.field_msgId = r4
            java.lang.String r4 = r3.f74635f
            r2.field_appId = r4
            java.lang.Class<ym.s> r4 = p763ym.C53543s.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ym.s r4 = (p763ym.C53543s) r4
            ym.n r4 = r4.mo74023HM()
            com.tencent.mm.pluginsdk.model.app.s r4 = (com.tencent.p014mm.pluginsdk.model.app.C96776s) r4
            r4.mo135039jo(r2)
            com.tencent.mm.modelimage.k r2 = new com.tencent.mm.modelimage.k
            r2.<init>()
            di3.d r4 = di3.C86312j.m106911c(r18)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r5 = r1.f287927a
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            long r4 = r4.mo127192mL(r5)
            r2.mo127154y(r4)
            long r4 = r9.getMsgId()
            r2.mo127124A(r4)
            r4 = 0
            r2.mo127153x(r4)
            ph0.a r4 = ph0.C100792a.f295260a
            r5 = r34
            long r6 = r4.mo140253y(r5)
            int r4 = (int) r6
            r2.mo127129F(r4)
            int r4 = r1.f287928b
            r2.f267391r = r4
            r4 = 1
            r2.f267365H = r4
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r4 = (int) r6
            r2.mo127150u(r4)
            int r4 = r1.f287930d
            r2.mo127149t(r4)
            di3.d r4 = di3.C86312j.m106911c(r18)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r6 = r1.f287927a
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            java.lang.String r7 = "id"
            long r6 = r4.wt0(r6, r7, r2)
            r10 = -1
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x04cc
            di3.d r4 = di3.C86312j.m106911c(r18)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            r4.doNotify()
            long r6 = r2.f267374a
            int r2 = (int) r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = r20
            r4.add(r2)
            if (r35 == 0) goto L_0x0469
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            long r5 = r9.getMsgId()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r6 = 0
            r1[r6] = r3
            java.lang.String r3 = "send album, msg id:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r1)
            java.lang.Class<hg.c> r1 = p548hg.C76165c.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            hg.c r1 = (p548hg.C76165c) r1
            r1.mo106377PI(r9)
            goto L_0x0491
        L_0x0469:
            r2 = 1
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r2]
            long r10 = r9.getMsgId()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r7[r6] = r2
            java.lang.String r2 = "send album info do not trans cdn, directly send msg id:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r7)
            java.lang.String r1 = r1.f287927a
            boolean r1 = eb0.C45628s0.m50745J(r1)
            if (r1 != 0) goto L_0x0491
            com.tencent.mm.message.q r1 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            ph0.b$c r2 = new ph0.b$c
            r2.<init>(r9, r5)
            r1.Je0(r9, r3, r2)
        L_0x0491:
            com.tencent.mm.vfs.m1 r1 = r32.mo140255b()
            java.lang.String r1 = r1.mo119971i()
            r2 = 1
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106446g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "delete pre build dir "
            r2.append(r3)
            com.tencent.mm.vfs.m1 r3 = r32.mo140255b()
            java.lang.String r3 = r3.mo119971i()
            r2.append(r3)
            java.lang.String r3 = " deleteResult:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            if (r38 == 0) goto L_0x04cb
            r1 = r38
            com.tencent.mm.ui.chatting.SendImgProxyUI$a$$a r1 = (com.tencent.p014mm.p136ui.chatting.SendImgProxyUI$a$$a) r1
            r1.mo135712a(r4)
        L_0x04cb:
            return
        L_0x04cc:
            r4 = r20
            java.lang.String r1 = "insert imgInfo failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            r1 = 5
            r9.mo100991d(r1)
            k40.a r1 = f40.C86709a0.m107533q(r19)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            long r2 = r9.getMsgId()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.xy0(r2, r9)
            if (r38 == 0) goto L_0x04f3
            r1 = r38
            com.tencent.mm.ui.chatting.SendImgProxyUI$a$$a r1 = (com.tencent.p014mm.p136ui.chatting.SendImgProxyUI$a$$a) r1
            r1.mo135712a(r4)
        L_0x04f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph0.C100793b.mo140256c(gt.b0, ig.g, boolean, java.util.ArrayList, java.util.List, gt.t):void");
    }

    /* renamed from: d */
    public final void mo140257d(C98199a0 a0Var, int i) {
        SendAlbumMsgErrorReportStruct sendAlbumMsgErrorReportStruct = new SendAlbumMsgErrorReportStruct();
        sendAlbumMsgErrorReportStruct.f265838f = (long) a0Var.f287920a;
        sendAlbumMsgErrorReportStruct.f265836d = (long) i;
        sendAlbumMsgErrorReportStruct.f265837e = (long) a0Var.f287925f;
        Uri n = C116299g2.m163858n(a0Var.f287922c);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        String path2 = n.getPath();
        int lastIndexOf = path2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            path2 = path2.substring(lastIndexOf + 1);
        }
        sendAlbumMsgErrorReportStruct.f265839g = sendAlbumMsgErrorReportStruct.mo86045b("FileName", path2, true);
        sendAlbumMsgErrorReportStruct.f265840h = (long) a0Var.f287921b;
        sendAlbumMsgErrorReportStruct.mo86054n();
        sendAlbumMsgErrorReportStruct.mo86056r();
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0467  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140258e(p158gt.C98200b0 r26, p158gt.C59701t r27) {
        /*
            r25 = this;
            r2 = r26
            java.lang.String r0 = "params"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.Class<gt.n> r0 = p158gt.C98202n.class
            f40.o r1 = f40.C86709a0.m107535s()
            zh3.f r1 = r1.f251811i
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            long r3 = r3.getId()
            long r3 = r1.beginTransaction(r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            ig.g r7 = new ig.g
            r7.<init>()
            java.lang.String r1 = r2.f287927a
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            r7.f289367k = r1
            java.util.List<java.lang.String> r1 = r2.f287931e
            java.util.Iterator r1 = r1.iterator()
        L_0x0039:
            boolean r8 = r1.hasNext()
            r11 = 0
            if (r8 == 0) goto L_0x0154
            java.lang.Object r8 = r1.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r12 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((java.lang.String) r8)
            if (r12 == 0) goto L_0x004d
            goto L_0x0039
        L_0x004d:
            gt.a0 r12 = new gt.a0
            r12.<init>()
            java.lang.String r13 = "<set-?>"
            gy3.C87412m.m108594g(r8, r13)
            r12.f287922c = r8
            int r14 = r2.f287930d
            r12.f287925f = r14
            int r14 = r2.f287928b
            r12.f287920a = r14
            java.lang.String r14 = r2.f287927a
            gy3.C87412m.m108594g(r14, r13)
            r12.f287924e = r14
            int r13 = r2.f287929c
            r12.f287921b = r13
            java.lang.String r13 = "thumb.jpg"
            di3.d r14 = di3.C86312j.m106911c(r0)
            gt.n r14 = (p158gt.C98202n) r14
            java.lang.String r14 = r14.Ug0(r12)
            com.tencent.mm.vfs.m1 r15 = r25.mo140255b()
            if (r15 != 0) goto L_0x0081
            r15 = 0
            goto L_0x0083
        L_0x0081:
            android.net.Uri r15 = r15.f250486d
        L_0x0083:
            if (r15 != 0) goto L_0x008f
            android.net.Uri$Builder r15 = new android.net.Uri$Builder
            r15.<init>()
            android.net.Uri$Builder r14 = r15.path(r14)
            goto L_0x009d
        L_0x008f:
            android.net.Uri$Builder r15 = r15.buildUpon()
            boolean r16 = r14.isEmpty()
            if (r16 != 0) goto L_0x009c
            r15.appendPath(r14)
        L_0x009c:
            r14 = r15
        L_0x009d:
            android.net.Uri r15 = r14.build()
            java.lang.String r9 = r15.getPath()
            if (r9 == 0) goto L_0x00bd
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r11, r11)
            java.lang.String r10 = r15.getPath()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x00bd
            android.net.Uri$Builder r9 = r14.path(r9)
            android.net.Uri r15 = r9.build()
        L_0x00bd:
            if (r15 != 0) goto L_0x00c9
            android.net.Uri$Builder r9 = new android.net.Uri$Builder
            r9.<init>()
            android.net.Uri$Builder r9 = r9.path(r13)
            goto L_0x00d0
        L_0x00c9:
            android.net.Uri$Builder r9 = r15.buildUpon()
            r9.appendPath(r13)
        L_0x00d0:
            android.net.Uri r10 = r9.build()
            java.lang.String r13 = r10.getPath()
            if (r13 == 0) goto L_0x00f0
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r11, r11)
            java.lang.String r14 = r10.getPath()
            boolean r14 = r14.equals(r13)
            if (r14 != 0) goto L_0x00f0
            android.net.Uri$Builder r9 = r9.path(r13)
            android.net.Uri r10 = r9.build()
        L_0x00f0:
            com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r13 = 0
            com.tencent.mm.vfs.f0$h r9 = r9.mo177799l(r10, r13)
            boolean r10 = r9.mo177810a()
            if (r10 != 0) goto L_0x00fe
            goto L_0x0106
        L_0x00fe:
            com.tencent.mm.vfs.FileSystem$c r10 = r9.f348991a
            java.lang.String r9 = r9.f348992b
            boolean r11 = r10.mo119948x(r9)
        L_0x0106:
            if (r11 != 0) goto L_0x0119
            di3.d r9 = di3.C86312j.m106911c(r0)
            gt.n r9 = (p158gt.C98202n) r9
            r9.mo127114fU(r12)
            r9 = 9999(0x270f, float:1.4012E-41)
            r10 = r25
            r10.mo140257d(r12, r9)
            goto L_0x011b
        L_0x0119:
            r10 = r25
        L_0x011b:
            ig.d r9 = new ig.d
            r9.<init>()
            r11 = 2
            r9.f289341f = r11
            ph0.a r11 = ph0.C100792a.f295260a
            java.lang.String r12 = r9.toString()
            int r13 = r9.f289341f
            java.lang.String r11 = r11.mo140231b(r12, r13)
            r9.f289343h = r11
            java.util.List<ig.d> r11 = r7.f289364h
            r11.add(r9)
            java.lang.String r11 = "pic"
            r9.f289347l = r11
            di3.d r11 = di3.C86312j.m106911c(r0)
            gt.n r11 = (p158gt.C98202n) r11
            int r12 = r2.f287929c
            java.lang.String r11 = r11.mo127115gT(r8, r12)
            ph0.d r12 = new ph0.d
            java.lang.String r9 = r9.f289343h
            r13 = 0
            r12.<init>(r11, r9, r8, r13)
            r6.add(r12)
            goto L_0x0039
        L_0x0154:
            r10 = r25
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0165
            f40.o r0 = f40.C86709a0.m107535s()
            zh3.f r0 = r0.f251811i
            r0.endTransaction(r3)
        L_0x0165:
            java.util.List<java.lang.String> r0 = r2.f287932f
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x04b9
            java.lang.Class<rz.s> r3 = p682rz.C101488s.class
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int[] r0 = r2.f287935i
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r13 = r0.length
            r14 = 0
        L_0x017f:
            if (r14 >= r13) goto L_0x0196
            r15 = r0[r14]
            if (r15 != 0) goto L_0x0188
            r17 = 1
            goto L_0x018a
        L_0x0188:
            r17 = 0
        L_0x018a:
            if (r17 != 0) goto L_0x0193
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r12.add(r15)
        L_0x0193:
            int r14 = r14 + 1
            goto L_0x017f
        L_0x0196:
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
            r14 = 0
        L_0x019c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x04a6
            java.lang.Object r0 = r12.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x01cf
            java.util.List<ig.d> r15 = r7.f289364h
            int r15 = r15.size()
            if (r13 >= r15) goto L_0x01cf
            java.util.List<ig.d> r0 = r7.f289364h
            java.lang.Object r0 = r0.get(r13)
            r4.add(r0)
            int r13 = r13 + 1
            r20 = r3
            r24 = r4
            r23 = r6
            r18 = r8
            r21 = r12
            r6 = 0
            r10 = 1
            goto L_0x0496
        L_0x01cf:
            r15 = 2
            if (r0 != r15) goto L_0x0486
            java.util.List<java.lang.String> r0 = r2.f287932f
            int r0 = r0.size()
            if (r14 >= r0) goto L_0x0486
            ig.d r15 = new ig.d
            r15.<init>()
            r0 = 4
            r15.f289341f = r0
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r1 = r15.toString()
            int r8 = r15.f289341f
            java.lang.String r0 = r0.mo140231b(r1, r8)
            r15.f289343h = r0
            java.util.List<java.lang.String> r0 = r2.f287932f
            java.lang.Object r0 = r0.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106454o(r0)
            if (r0 != 0) goto L_0x0201
            java.lang.String r0 = "mp4"
        L_0x0201:
            r15.f289347l = r0
            java.util.List<java.lang.Integer> r0 = r2.f287934h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r14 >= r0) goto L_0x021d
            java.util.List<java.lang.Integer> r0 = r2.f287934h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r14)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            goto L_0x021f
        L_0x021d:
            r0 = 0
        L_0x021f:
            r15.f289355t = r0
            r4.add(r15)
            java.util.List<java.lang.String> r0 = r2.f287932f
            java.lang.Object r0 = r0.get(r14)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            di3.d r0 = di3.C86312j.m106911c(r3)
            rz.s r0 = (p682rz.C101488s) r0
            java.lang.String r8 = r2.f287927a
            java.lang.String r0 = r0.yr0(r8)
            java.lang.String r8 = "getService(\n            …leName(params.toUserName)"
            gy3.C87412m.m108593f(r0, r8)
            di3.d r8 = di3.C86312j.m106911c(r3)
            rz.s r8 = (p682rz.C101488s) r8
            rz.t r8 = r8.Kj0()
            hd0.o0 r8 = (hd0.C98410o0) r8
            java.lang.String r8 = r8.mo137729r(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r1)
            com.tencent.mm.vfs.m1 r9 = r25.mo140255b()
            if (r9 != 0) goto L_0x025a
            r9 = 0
            goto L_0x025c
        L_0x025a:
            android.net.Uri r9 = r9.f250486d
        L_0x025c:
            if (r9 != 0) goto L_0x0268
            android.net.Uri$Builder r9 = new android.net.Uri$Builder
            r9.<init>()
            android.net.Uri$Builder r0 = r9.path(r0)
            goto L_0x0276
        L_0x0268:
            android.net.Uri$Builder r9 = r9.buildUpon()
            boolean r20 = r0.isEmpty()
            if (r20 != 0) goto L_0x0275
            r9.appendPath(r0)
        L_0x0275:
            r0 = r9
        L_0x0276:
            android.net.Uri r9 = r0.build()
            r20 = r3
            java.lang.String r3 = r9.getPath()
            if (r3 == 0) goto L_0x0298
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r11, r11)
            java.lang.String r11 = r9.getPath()
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x0298
            android.net.Uri$Builder r0 = r0.path(r3)
            android.net.Uri r9 = r0.build()
        L_0x0298:
            java.lang.String r3 = "video_thumb.jpg"
            if (r9 != 0) goto L_0x02a7
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.path(r3)
            goto L_0x02ae
        L_0x02a7:
            android.net.Uri$Builder r0 = r9.buildUpon()
            r0.appendPath(r3)
        L_0x02ae:
            android.net.Uri r9 = r0.build()
            java.lang.String r11 = r9.getPath()
            if (r11 == 0) goto L_0x02cf
            r10 = 0
            java.lang.String r11 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r10, r10)
            java.lang.String r10 = r9.getPath()
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x02cf
            android.net.Uri$Builder r0 = r0.path(r11)
            android.net.Uri r9 = r0.build()
        L_0x02cf:
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r10 = 0
            com.tencent.mm.vfs.f0$h r0 = r0.mo177799l(r9, r10)
            boolean r9 = r0.mo177810a()
            if (r9 != 0) goto L_0x02de
            r0 = 0
            goto L_0x02e6
        L_0x02de:
            com.tencent.mm.vfs.FileSystem$c r9 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            boolean r0 = r9.mo119948x(r0)
        L_0x02e6:
            java.lang.String r9 = "MicroMsg.SendAlbumPreBuilder"
            if (r0 != 0) goto L_0x03b9
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r1)
            com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r10 = r25.mo140255b()
            r11.<init>((com.tencent.p014mm.vfs.C86009m1) r10, (java.lang.String) r0)
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
            r10.<init>((com.tencent.p014mm.vfs.C86009m1) r11, (java.lang.String) r3)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r21 = r12
            java.lang.String r12 = "file://"
            r11.append(r12)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r0.setData(r11)
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = -1
            oj.a$a r11 = p914oj.C100361a.m131253b(r11, r0, r12)
            android.graphics.Bitmap r0 = r11.f224998b     // Catch:{ Exception -> 0x037c }
            if (r0 == 0) goto L_0x0373
            int r0 = r11.f224999c     // Catch:{ Exception -> 0x037c }
            r22 = r13
            long r12 = (long) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r12)     // Catch:{ Exception -> 0x036d }
            long r12 = (long) r0     // Catch:{ Exception -> 0x036d }
            r15.f289355t = r12     // Catch:{ Exception -> 0x036d }
            android.graphics.Bitmap r0 = r11.f224998b     // Catch:{ Exception -> 0x036d }
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x036d }
            java.lang.String r13 = r10.mo119971i()     // Catch:{ Exception -> 0x036d }
            r23 = r6
            r6 = 100
            r24 = r4
            r4 = 0
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r6, r12, r13, r4)     // Catch:{ Exception -> 0x0369 }
            long r12 = r15.f289355t     // Catch:{ Exception -> 0x0369 }
            r18 = 0
            int r0 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x038c
            java.lang.Class<tz.f> r0 = p707tz.C65000f.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0367 }
            tz.f r0 = (p707tz.C65000f) r0     // Catch:{ Exception -> 0x0367 }
            com.tencent.mm.plugin.sight.base.a r0 = r0.mo89183Yp(r1)     // Catch:{ Exception -> 0x0367 }
            if (r0 == 0) goto L_0x038c
            int r0 = r0.f273443a     // Catch:{ Exception -> 0x0367 }
            long r12 = (long) r0     // Catch:{ Exception -> 0x0367 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r12)     // Catch:{ Exception -> 0x0367 }
            long r12 = (long) r0     // Catch:{ Exception -> 0x0367 }
            r15.f289355t = r12     // Catch:{ Exception -> 0x0367 }
            goto L_0x038c
        L_0x0367:
            r0 = move-exception
            goto L_0x0384
        L_0x0369:
            r0 = move-exception
        L_0x036a:
            r18 = 0
            goto L_0x0384
        L_0x036d:
            r0 = move-exception
            r24 = r4
            r23 = r6
            goto L_0x036a
        L_0x0373:
            r24 = r4
            r23 = r6
            r22 = r13
            r18 = 0
            goto L_0x038c
        L_0x037c:
            r0 = move-exception
            r24 = r4
            r23 = r6
            r22 = r13
            goto L_0x036a
        L_0x0384:
            r4 = 0
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r4, r6)
        L_0x038c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "GetVideoMetadata done, filename: "
            r0.append(r4)
            java.lang.String r4 = r11.f224997a
            r0.append(r4)
            java.lang.String r4 = ", duration: "
            r0.append(r4)
            long r11 = r15.f289355t
            r0.append(r11)
            java.lang.String r4 = ", thumb exist: "
            r0.append(r4)
            boolean r4 = r10.mo119967g()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x03c3
        L_0x03b9:
            r24 = r4
            r23 = r6
            r21 = r12
            r22 = r13
            r18 = 0
        L_0x03c3:
            java.lang.String r0 = "thumbPath"
            gy3.C87412m.m108593f(r8, r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r1)
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r6 = r25.mo140255b()
            r4.<init>((com.tencent.p014mm.vfs.C86009m1) r6, (java.lang.String) r0)
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((com.tencent.p014mm.vfs.C86009m1) r4, (java.lang.String) r3)
            boolean r3 = r0.mo119967g()
            if (r3 == 0) goto L_0x03ea
            java.lang.String r0 = r0.mo119971i()
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106463x(r0, r8)
            goto L_0x03eb
        L_0x03ea:
            r10 = 0
        L_0x03eb:
            if (r10 != 0) goto L_0x0467
            r0 = 10006(0x2716, float:1.4021E-41)
            com.tencent.mm.autogen.mmdata.rpt.SendAlbumMsgErrorReportStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.SendAlbumMsgErrorReportStruct
            r3.<init>()
            int r4 = r2.f287928b
            long r10 = (long) r4
            r3.f265838f = r10
            long r10 = (long) r0
            r3.f265836d = r10
            int r0 = r2.f287930d
            long r10 = (long) r0
            r3.f265837e = r10
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r4 = r0.getPath()
            r6 = 0
            if (r4 == 0) goto L_0x0426
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r6, r6)
            java.lang.String r10 = r0.getPath()
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto L_0x0426
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r4)
            android.net.Uri r0 = r0.build()
        L_0x0426:
            java.lang.String r0 = r0.getPath()
            java.lang.String r4 = "/"
            int r4 = r0.lastIndexOf(r4)
            if (r4 >= 0) goto L_0x0433
            goto L_0x0439
        L_0x0433:
            int r4 = r4 + 1
            java.lang.String r0 = r0.substring(r4)
        L_0x0439:
            java.lang.String r4 = "FileName"
            r10 = 1
            java.lang.String r0 = r3.mo86045b(r4, r0, r10)
            r3.f265839g = r0
            int r0 = r2.f287929c
            long r11 = (long) r0
            r3.f265840h = r11
            r3.mo86054n()
            r3.mo86056r()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "copy video thumb fail "
            r0.append(r3)
            r0.append(r8)
            java.lang.String r3 = " and regenerate thumb"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x0469
        L_0x0467:
            r6 = 0
            r10 = 1
        L_0x0469:
            mh0.q r0 = new mh0.q
            r0.<init>()
            java.lang.String r3 = r15.f289343h
            r0.mo55395T(r3)
            int r3 = r15.f289341f
            r0.f292702g = r3
            int r3 = r2.f287930d
            r0.f292703h = r3
            r0.mo55402a0(r1)
            r0.f292706k = r8
            r5.add(r0)
            int r14 = r14 + 1
            goto L_0x0494
        L_0x0486:
            r20 = r3
            r24 = r4
            r23 = r6
            r18 = r8
            r21 = r12
            r22 = r13
            r6 = 0
            r10 = 1
        L_0x0494:
            r13 = r22
        L_0x0496:
            r10 = r25
            r8 = r18
            r3 = r20
            r12 = r21
            r6 = r23
            r4 = r24
            r1 = 1
            r11 = 0
            goto L_0x019c
        L_0x04a6:
            r23 = r6
            r1 = r4
            r7.f289364h = r1
            r4 = 1
            r1 = r25
            r2 = r26
            r3 = r7
            r6 = r23
            r7 = r27
            r1.mo140256c(r2, r3, r4, r5, r6, r7)
            goto L_0x04c6
        L_0x04b9:
            r23 = r6
            r4 = 1
            r1 = r25
            r2 = r26
            r3 = r7
            r7 = r27
            r1.mo140256c(r2, r3, r4, r5, r6, r7)
        L_0x04c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph0.C100793b.mo140258e(gt.b0, gt.t):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        r2 = (r2 = r7.mo55365D()).mo139238A();
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02d4 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140259f(android.content.Context r32, java.lang.String r33, p434ig.C98674g r34, com.tencent.p014mm.storage.C72963f4 r35) {
        /*
            r31 = this;
            r10 = r33
            r11 = r34
            r0 = r35
            java.lang.Class<mm.h> r12 = p606mm.C99933h.class
            java.lang.Class<gt.k> r13 = p158gt.C98201k.class
            java.lang.Class<f62.k0> r14 = f62.C75700k0.class
            java.lang.Class<mh0.e0> r15 = mh0.C99865e0.class
            java.lang.Class<mh0.d> r16 = mh0.C99864d.class
            java.lang.String r1 = "context"
            r2 = r32
            gy3.C87412m.m108594g(r2, r1)
            java.lang.String r1 = "talker"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = "albumInfoItem"
            gy3.C87412m.m108594g(r11, r1)
            r9 = 100
            r8 = 0
            if (r0 == 0) goto L_0x004c
            long r2 = r35.getMsgId()
            i40.b$a r4 = i40.C98597b.f289091e
            di3.d r5 = di3.C86312j.m106911c(r16)
            java.lang.String r6 = "getService(\n            …atureService::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            i40.e r5 = (i40.C98598e) r5
            i40.b r4 = r4.mo85231a(r5, r15)
            mh0.e0 r4 = (mh0.C99865e0) r4
            mh0.a r2 = r4.mo139217g3(r2)
            r2.f292636h = r9
            r2.f292638j = r8
            r2.f292637i = r8
            r2.f292639k = r8
            r7 = r2
            goto L_0x004d
        L_0x004c:
            r7 = 0
        L_0x004d:
            r5 = 1
            if (r7 == 0) goto L_0x0064
            mh0.n r2 = r7.mo55365D()
            if (r2 == 0) goto L_0x0064
            java.util.ArrayList r2 = r2.mo139238A()
            if (r2 == 0) goto L_0x0064
            boolean r2 = r2.isEmpty()
            if (r2 != r5) goto L_0x0064
            r2 = 1
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            if (r2 == 0) goto L_0x00c0
            java.util.List r2 = r34.mo55348A()
            java.util.Iterator r2 = r2.iterator()
        L_0x006f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c0
            java.lang.Object r3 = r2.next()
            ig.d r3 = (p434ig.C98672d) r3
            mh0.q r4 = new mh0.q
            r4.<init>()
            th0.l r6 = th0.C101888l.f300029a
            boolean r6 = r6.mo141359i(r3, r0)
            if (r6 == 0) goto L_0x0097
            ph0.a r6 = ph0.C100792a.f295260a
            java.lang.String r1 = r6.mo140238j(r3, r0)
            r4.f292704i = r1
            java.lang.String r1 = r6.mo140245q(r3, r0)
            r4.f292705j = r1
            goto L_0x009f
        L_0x0097:
            ph0.a r1 = ph0.C100792a.f295260a
            java.lang.String r1 = r1.mo140238j(r3, r0)
            r4.f292705j = r1
        L_0x009f:
            ph0.a r1 = ph0.C100792a.f295260a
            java.lang.String r1 = r1.mo140250v(r3, r0)
            r4.f292706k = r1
            java.lang.String r1 = r3.mo55264K()
            r4.mo55395T(r1)
            int r1 = r3.mo55274P()
            r4.f292702g = r1
            mh0.n r1 = r7.mo55365D()
            java.util.ArrayList r1 = r1.mo139238A()
            r1.add(r4)
            goto L_0x006f
        L_0x00c0:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r33)
            r11.mo55354G(r1)
            ig.a r6 = new ig.a
            r6.<init>()
            java.lang.String r1 = r34.mo55352E()
            r6.mo53880Q(r1)
            java.lang.Class<hg.d> r1 = p548hg.C98450d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            hg.d r1 = (p548hg.C98450d) r1
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "getContext()"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r1 = r1.mo137793FC(r2, r11)
            r6.mo53877N(r1)
            java.lang.String r1 = r6.f74637h
            r11.mo55359L(r1)
            java.lang.String r1 = r6.f74638i
            r11.mo55356I(r1)
            ph0.a r3 = ph0.C100792a.f295260a
            r3.mo140230a(r6, r11)
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4
            r4.<init>()
            r4.mo100991d(r5)
            r4.mo108749c3(r10)
            long r1 = eb0.C75604z3.m90843o(r33)
            r4.mo108733M2(r1)
            r4.mo108740T2(r5)
            r1 = 1124073521(0x43000031, float:128.00075)
            r4.setType(r1)
            java.lang.String r1 = r6.mo141118z()
            r4.mo108732L2(r1)
            k40.a r1 = f40.C86709a0.m107533q(r14)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            long r1 = r1.my0(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = p206nj.C76861g.m92660c()
            r5.append(r8)
            java.lang.String r8 = " msginfo insert id: "
            r5.append(r8)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = "MicroMsg.SendAlbumPreBuilder"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r5)
            r19 = 0
            int r5 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r5 >= 0) goto L_0x016b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = p206nj.C76861g.m92660c()
            r0.append(r3)
            java.lang.String r3 = "insert msg failed :"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return
        L_0x016b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r9 = p206nj.C76861g.m92658a()
            r5.append(r9)
            java.lang.String r9 = " new msg inserted to db , local id = "
            r5.append(r9)
            r5.append(r1)
            java.lang.String r9 = ", original id = "
            r5.append(r9)
            if (r0 == 0) goto L_0x018f
            long r20 = r35.getMsgId()
            java.lang.Long r0 = java.lang.Long.valueOf(r20)
            goto L_0x0190
        L_0x018f:
            r0 = 0
        L_0x0190:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r4.setMsgId(r1)
            i40.b$a r0 = i40.C98597b.f289091e
            di3.d r5 = di3.C86312j.m106911c(r16)
            java.lang.String r9 = "getService(AlbumFeatureService::class.java)"
            gy3.C87412m.m108593f(r5, r9)
            i40.e r5 = (i40.C98598e) r5
            i40.b r0 = r0.mo85231a(r5, r15)
            mh0.e0 r0 = (mh0.C99865e0) r0
            long r20 = r4.mo108774y2()
            r22 = 0
            r23 = 16
            r24 = 0
            r25 = r1
            r1 = r7
            r2 = r33
            r5 = r3
            r32 = r4
            r3 = r25
            r28 = r5
            r27 = r6
            r5 = r20
            r29 = r7
            r7 = r22
            r30 = r8
            r8 = r23
            r17 = r14
            r18 = r15
            r15 = 100
            r14 = r9
            r9 = r24
            mh0.C99865e0.m130419i3(r0, r1, r2, r3, r5, r7, r8, r9)
            qh0.a r0 = new qh0.a
            r0.<init>()
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.f177829d = r1
            di3.d r1 = di3.C86312j.m106911c(r12)
            mm.h r1 = (p606mm.C99933h) r1
            java.lang.String r2 = java.lang.String.valueOf(r25)
            ph0.b$d<T> r3 = ph0.C100793b.C100795d.f295265a
            r4 = 18
            r1.mo84399BM(r4, r2, r0, r3)
            di3.d r1 = di3.C86312j.m106911c(r12)
            mm.h r1 = (p606mm.C99933h) r1
            ph0.b$e<T> r2 = ph0.C100793b.C100796e.f295266a
            java.lang.String r3 = "album_enter_from_scene"
            r1.mo84399BM(r4, r3, r0, r2)
            com.tencent.mm.message.l r0 = new com.tencent.mm.message.l
            r0.<init>()
            java.lang.String r1 = r32.getContent()
            r0.field_xml = r1
            r1 = r27
            java.lang.String r2 = r1.f74637h
            r0.field_title = r2
            int r2 = r1.f74641l
            r0.field_type = r2
            java.lang.String r2 = r1.f74638i
            r0.field_description = r2
            long r2 = r32.getMsgId()
            r0.field_msgId = r2
            java.lang.String r2 = r1.f74635f
            r0.field_appId = r2
            java.lang.Class<ym.s> r2 = p763ym.C53543s.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.s r2 = (p763ym.C53543s) r2
            ym.n r2 = r2.mo74023HM()
            com.tencent.mm.pluginsdk.model.app.s r2 = (com.tencent.p014mm.pluginsdk.model.app.C96776s) r2
            r2.mo135039jo(r0)
            com.tencent.mm.modelimage.k r0 = new com.tencent.mm.modelimage.k
            r0.<init>()
            di3.d r2 = di3.C86312j.m106911c(r13)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            long r2 = r2.mo127192mL(r10)
            r0.mo127154y(r2)
            long r2 = r32.getMsgId()
            r0.mo127124A(r2)
            r2 = 0
            r0.mo127153x(r2)
            r3 = r28
            long r3 = r3.mo140253y(r11)
            int r4 = (int) r3
            r0.mo127129F(r4)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r4 = (int) r3
            r0.mo127150u(r4)
            r3 = 1
            r0.mo127149t(r3)
            di3.d r4 = di3.C86312j.m106911c(r13)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            java.lang.String r5 = "id"
            long r4 = r4.wt0(r10, r5, r0)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0369
            di3.d r0 = di3.C86312j.m106911c(r13)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            r0.doNotify()
            java.util.List r0 = r34.mo55348A()
            java.util.Iterator r0 = r0.iterator()
        L_0x02a5:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02d4
            java.lang.Object r4 = r0.next()
            ig.d r4 = (p434ig.C98672d) r4
            java.lang.String r5 = r4.mo55250D()
            if (r5 == 0) goto L_0x02c4
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x02bf
            r8 = 1
            goto L_0x02c0
        L_0x02bf:
            r8 = 0
        L_0x02c0:
            if (r8 != r3) goto L_0x02c4
            r8 = 1
            goto L_0x02c5
        L_0x02c4:
            r8 = 0
        L_0x02c5:
            if (r8 == 0) goto L_0x02d2
            java.lang.String r4 = r4.mo55256G()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x02d2
            goto L_0x02a5
        L_0x02d2:
            r8 = 1
            goto L_0x02d5
        L_0x02d4:
            r8 = 0
        L_0x02d5:
            if (r8 == 0) goto L_0x02f9
            java.lang.Object[] r0 = new java.lang.Object[r3]
            long r3 = r32.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0[r2] = r1
            java.lang.String r1 = "send album, msg id:%d"
            r4 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            java.lang.Class<hg.c> r0 = p548hg.C76165c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hg.c r0 = (p548hg.C76165c) r0
            r5 = r32
            r0.mo106377PI(r5)
            goto L_0x0368
        L_0x02f9:
            r5 = r32
            r4 = r30
            java.lang.Object[] r0 = new java.lang.Object[r3]
            long r6 = r5.getMsgId()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0[r2] = r6
            java.lang.String r2 = "send album info do not trans cdn, directly send msg id:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
            boolean r0 = eb0.C45628s0.m50745J(r33)
            if (r0 != 0) goto L_0x0368
            r2 = r29
            if (r2 != 0) goto L_0x031a
            goto L_0x031d
        L_0x031a:
            r2.mo55374M(r15)
        L_0x031d:
            if (r2 != 0) goto L_0x0320
            goto L_0x0327
        L_0x0320:
            int r0 = r2.mo55368G()
            r2.mo55372K(r0)
        L_0x0327:
            if (r2 != 0) goto L_0x032a
            goto L_0x032f
        L_0x032a:
            r0 = 103(0x67, float:1.44E-43)
            r2.mo55373L(r0)
        L_0x032f:
            i40.b$a r0 = i40.C98597b.f289091e
            di3.d r4 = di3.C86312j.m106911c(r16)
            gy3.C87412m.m108593f(r4, r14)
            i40.e r4 = (i40.C98598e) r4
            r6 = r18
            i40.b r0 = r0.mo85231a(r4, r6)
            mh0.e0 r0 = (mh0.C99865e0) r0
            r0.mo139218j3(r2, r5, r3)
            r0 = 2
            r5.mo100991d(r0)
            k40.a r0 = f40.C86709a0.m107533q(r17)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            long r2 = r5.getMsgId()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r2, r5)
            com.tencent.mm.message.q r0 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            ph0.b$f r2 = new ph0.b$f
            r2.<init>(r5, r11)
            r0.Je0(r5, r1, r2)
        L_0x0368:
            return
        L_0x0369:
            r5 = r32
            r4 = r30
            java.lang.String r0 = "insert imgInfo failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r0 = 5
            r5.mo100991d(r0)
            k40.a r0 = f40.C86709a0.m107533q(r17)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            long r1 = r5.getMsgId()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph0.C100793b.mo140259f(android.content.Context, java.lang.String, ig.g, com.tencent.mm.storage.f4):void");
    }
}
