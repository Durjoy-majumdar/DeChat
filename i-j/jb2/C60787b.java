package jb2;

import com.tencent.p014mm.plugin.p081mv.p082ui.shake.C56993u;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import nb2.C61646d;
import ob0.C11385n;
import te3.C64488kb1;
import te3.C64821x13;

/* renamed from: jb2.b */
public class C60787b {

    /* renamed from: a */
    public List<C61646d> f173137a = new ArrayList();

    /* renamed from: b */
    public C60789b f173138b;

    /* renamed from: c */
    public C64488kb1 f173139c;

    /* renamed from: d */
    public int f173140d;

    /* renamed from: e */
    public C11385n f173141e = new C60788a();

    /* renamed from: jb2.b$a */
    public class C60788a implements C11385n {
        public C60788a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x019e, code lost:
            r0 = r0.f127056b.f127083a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r19, int r20, java.lang.String r21, ob0.C117747y r22) {
            /*
                r18 = this;
                r0 = r18
                r1 = r22
                boolean r2 = r1 instanceof jb2.C46455a
                if (r2 == 0) goto L_0x0016
                r2 = r1
                jb2.a r2 = (jb2.C46455a) r2
                int r2 = r2.f125136d
                if (r2 == 0) goto L_0x0016
                jb2.b r3 = jb2.C60787b.this
                int r3 = r3.f173140d
                if (r2 == r3) goto L_0x0016
                return
            L_0x0016:
                boolean r2 = r1 instanceof jb2.C46465q
                if (r2 == 0) goto L_0x0079
                if (r19 != 0) goto L_0x01be
                if (r20 != 0) goto L_0x01be
                jb2.q r1 = (jb2.C46465q) r1
                te3.b23 r1 = r1.f125182p
                if (r1 == 0) goto L_0x01be
                jb2.b r2 = jb2.C60787b.this
                int r9 = r2.f173140d
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r3 = r1.f130905d
                int r3 = r3.size()
                if (r3 <= 0) goto L_0x01be
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r1.f130905d
                java.util.Iterator r1 = r1.iterator()
            L_0x0036:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x01be
                java.lang.Object r3 = r1.next()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r3
                hb2.f r4 = new hb2.f
                r4.<init>()
                hb2.f$a r5 = hb2.C59822f.f170752A
                r5.mo84777b(r3, r4)
                java.util.List<nb2.d> r3 = r2.f173137a
                nb2.d r5 = new nb2.d
                r5.<init>(r4)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r3.add(r5)
                java.lang.Long r3 = r4.f170755c
                if (r3 == 0) goto L_0x0036
                java.lang.String r6 = r4.f170756d
                if (r6 == 0) goto L_0x0036
                ob0.b0 r10 = f40.C86709a0.m107524d()
                jb2.n r11 = new jb2.n
                long r7 = r3.longValue()
                int r12 = r4.hashCode()
                r3 = r11
                r4 = r7
                r7 = r12
                r8 = r9
                r3.<init>(r4, r6, r7, r8)
                r10.mo123460f(r11)
                goto L_0x0036
            L_0x0079:
                boolean r2 = r1 instanceof jb2.C46463n
                r3 = 0
                if (r2 == 0) goto L_0x018f
                if (r19 != 0) goto L_0x01be
                if (r20 != 0) goto L_0x01be
                jb2.n r1 = (jb2.C46463n) r1
                te3.jm0 r2 = r1.f125173r
                if (r2 == 0) goto L_0x01be
                jb2.b r4 = jb2.C60787b.this
                int r1 = r1.f125169n
                java.util.List<nb2.d> r5 = r4.f173137a
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x0094:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x01be
                java.lang.Object r6 = r5.next()
                nb2.d r6 = (nb2.C61646d) r6
                hb2.f r7 = r6.f175298d
                int r7 = r7.hashCode()
                if (r7 != r1) goto L_0x018b
                com.tencent.mm.protocal.protobuf.FinderObject r7 = r2.f136184e
                if (r7 == 0) goto L_0x018b
                hb2.f$a r8 = hb2.C59822f.f170752A
                hb2.f r9 = r6.f175298d
                r8.mo84777b(r7, r9)
                hb2.f r7 = r6.f175298d
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r8 = r2.f136192p
                r7.getClass()
                java.lang.String r9 = "<set-?>"
                gy3.C87412m.m108594g(r8, r9)
                r7.f170767o = r8
                jb2.b$b r7 = r4.f173138b
                com.tencent.mm.plugin.mv.ui.shake.g r7 = (com.tencent.p014mm.plugin.p081mv.p082ui.shake.C56971g) r7
                r7.getClass()
                int r8 = com.tencent.p014mm.plugin.p081mv.p082ui.shake.MusicMainUINew.f163137C
                java.lang.String r8 = "MusicMainUINew"
                java.lang.String r9 = "Finder Get! Here!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
                boolean r8 = r7.f163176a
                if (r8 != 0) goto L_0x0182
                com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew r8 = r7.f163177b
                m03.c r9 = r8.f163140d
                if (r9 == 0) goto L_0x0182
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r8 = r8.f163141e
                if (r8 == 0) goto L_0x0182
                hb2.f r8 = r6.f175298d
                java.util.LinkedList r8 = r8.mo84775a()
                r9.setMediaList(r8)
                com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew r8 = r7.f163177b
                m03.c r8 = r8.f163140d
                r8.start()
                com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew r8 = r7.f163177b
                m03.c r8 = r8.f163140d
                qc0.j r9 = qc0.C101093a.m132479a()
                int r9 = r9.f35261b
                long r9 = (long) r9
                r8.seekTo(r9)
                com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew r8 = r7.f163177b
                m03.c r8 = r8.f163140d
                android.view.View r8 = (android.view.View) r8
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                r15.mo10233c(r9)
                java.lang.Object[] r10 = r15.mo10232b()
                java.lang.String r11 = "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$16"
                java.lang.String r12 = "onCallBack"
                java.lang.String r13 = "(Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r9 = r8
                r0 = r15
                r15 = r16
                r16 = r17
                j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                java.lang.Object r0 = r0.mo10231a(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r8.setVisibility(r0)
                java.lang.String r10 = "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$16"
                java.lang.String r11 = "onCallBack"
                java.lang.String r12 = "(Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
                r0 = 1
                r7.f163176a = r0
                com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew r0 = r7.f163177b
                m03.c r8 = r0.f163140d
                if (r8 == 0) goto L_0x0165
                com.tencent.mm.plugin.mv.ui.shake.i r9 = new com.tencent.mm.plugin.mv.ui.shake.i
                r9.<init>(r0)
                r8.setMvMusicProxy(r9)
                m03.c r8 = r0.f163140d
                com.tencent.mm.plugin.mv.ui.shake.j r9 = new com.tencent.mm.plugin.mv.ui.shake.j
                r9.<init>(r0)
                r8.setFirstFrameRenderCallback(r9)
            L_0x0165:
                te3.t23 r0 = new te3.t23
                r0.<init>()
                hb2.f r8 = r6.f175298d
                java.lang.String r9 = r8.f170756d
                r0.f185460e = r9
                java.lang.Long r8 = r8.f170755c
                java.lang.String r8 = r8.toString()
                r0.f185459d = r8
                hb2.f r8 = r6.f175298d
                java.lang.String r9 = r8.f170757e
                r0.f185461f = r9
                java.lang.String r8 = r8.f170758f
                r0.f185462g = r8
            L_0x0182:
                com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew r0 = r7.f163177b
                java.util.List<nb2.d> r0 = r0.f163147n
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.add(r6)
            L_0x018b:
                r0 = r18
                goto L_0x0094
            L_0x018f:
                boolean r0 = r1 instanceof com.tencent.p014mm.plugin.p081mv.p082ui.shake.C56993u
                if (r0 == 0) goto L_0x01be
                if (r19 != 0) goto L_0x01be
                if (r20 != 0) goto L_0x01be
                r0 = r1
                com.tencent.mm.plugin.mv.ui.shake.u r0 = (com.tencent.p014mm.plugin.p081mv.p082ui.shake.C56993u) r0
                ob0.c r0 = r0.f163217e
                if (r0 == 0) goto L_0x01a9
                ob0.c$d r0 = r0.f127056b
                pe3.a r0 = r0.f127083a
                if (r0 == 0) goto L_0x01a9
                te3.y13 r0 = (te3.C52053y13) r0
                java.util.LinkedList<te3.z13> r0 = r0.f145074d
                goto L_0x01aa
            L_0x01a9:
                r0 = 0
            L_0x01aa:
                if (r0 == 0) goto L_0x01be
                java.lang.Object r1 = r0.get(r3)
                if (r1 == 0) goto L_0x01be
                java.lang.Object r0 = r0.get(r3)
                te3.z13 r0 = (te3.C64871z13) r0
                if (r0 == 0) goto L_0x01be
                int r0 = r0.f186622h
                com.tencent.p014mm.plugin.p081mv.p082ui.shake.MusicMainUINew.f163137C = r0
            L_0x01be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jb2.C60787b.C60788a.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: jb2.b$b */
    public interface C60789b {
    }

    public C60787b(C64488kb1 kb12, int i) {
        this.f173139c = kb12;
        this.f173140d = i;
    }

    /* renamed from: a */
    public void mo85721a() {
        C86709a0.m107524d().mo123455a(6860, this.f173141e);
        C86709a0.m107524d().mo123455a(3763, this.f173141e);
        C86709a0.m107524d().mo123455a(6473, this.f173141e);
    }

    /* renamed from: b */
    public void mo85722b(String str, String str2) {
        if (!Util.isNullOrNil(str2)) {
            LinkedList linkedList = new LinkedList();
            C64821x13 x132 = new C64821x13();
            x132.f186251d = str;
            x132.f186252e = str2;
            linkedList.add(x132);
            C86709a0.m107524d().mo123460f(new C56993u(linkedList));
        }
    }
}
