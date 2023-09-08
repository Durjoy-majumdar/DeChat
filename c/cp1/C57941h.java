package cp1;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveMiniView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.SoftReference;
import r50.C63361a;
import r50.C63362b;
import r50.C63367f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vo1.C65770a0;
import vo1.C65817r0;

/* renamed from: cp1.h */
public final class C57941h implements C57958p, C57955n, C63361a {

    /* renamed from: d */
    public final Context f165832d;

    /* renamed from: e */
    public final C57959q f165833e;

    /* renamed from: f */
    public C45795b f165834f;

    /* renamed from: g */
    public final C13601g f165835g = C36568h.m40985a(new C57943b(this));

    /* renamed from: h */
    public final C13601g f165836h = C36568h.m40985a(new C57946e(this));

    /* renamed from: i */
    public final C13601g f165837i = C36568h.m40985a(new C57944c(this));

    /* renamed from: j */
    public final C13601g f165838j = C36568h.m40985a(new C57945d(this));

    /* renamed from: n */
    public final C13601g f165839n = C36568h.m40985a(new C57947f(this));

    /* renamed from: cp1.h$a */
    public static final class C57942a implements C63362b {

        /* renamed from: a */
        public final /* synthetic */ C57941h f165840a;

        public C57942a(C57941h hVar) {
            this.f165840a = hVar;
        }

        /* renamed from: W */
        public void mo82744W() {
            C57952m mVar = C65770a0.f189184r.mo89819a().f189201o;
            if (mVar != null) {
                mVar.mo82758d();
            }
        }

        /* renamed from: Z */
        public void mo82745Z() {
            C57952m mVar = C65770a0.f189184r.mo89819a().f189201o;
            if (mVar != null) {
                mVar.mo82759e((Integer) null);
            }
        }

        /* renamed from: a */
        public Bitmap mo82746a() {
            C57952m mVar = C65770a0.f189184r.mo89819a().f189201o;
            if (mVar != null) {
                return mVar.f165852a.getBitmap();
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            r1 = (r1 = (r1 = ((cl1.C54991o) r1.mo71262a(r0)).f154341n).objectDesc).liveDesc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String getCoverUrl() {
            /*
                r4 = this;
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                cp1.h r1 = r4.f165840a
                fj1.b r1 = r1.f165834f
                if (r1 == 0) goto L_0x001d
                androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                cl1.o r1 = (cl1.C54991o) r1
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f154341n
                if (r1 == 0) goto L_0x001d
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x001d
                te3.px0 r1 = r1.liveDesc
                if (r1 == 0) goto L_0x001d
                java.lang.String r1 = r1.f184911d
                goto L_0x001e
            L_0x001d:
                r1 = 0
            L_0x001e:
                if (r1 == 0) goto L_0x0029
                int r2 = r1.length()
                if (r2 != 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r2 = 0
                goto L_0x002a
            L_0x0029:
                r2 = 1
            L_0x002a:
                java.lang.String r3 = ""
                if (r2 == 0) goto L_0x0056
                cp1.h r1 = r4.f165840a
                fj1.b r1 = r1.f165834f
                if (r1 == 0) goto L_0x0055
                androidx.lifecycle.i0 r0 = r1.mo71262a(r0)
                cl1.o r0 = (cl1.C54991o) r0
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f154341n
                if (r0 == 0) goto L_0x0055
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
                if (r0 == 0) goto L_0x0055
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
                com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r0
                if (r0 == 0) goto L_0x0055
                java.lang.String r0 = r0.url
                if (r0 != 0) goto L_0x0053
                goto L_0x0055
            L_0x0053:
                r1 = r0
                goto L_0x0056
            L_0x0055:
                r1 = r3
            L_0x0056:
                if (r1 != 0) goto L_0x0059
                goto L_0x005a
            L_0x0059:
                r3 = r1
            L_0x005a:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: cp1.C57941h.C57942a.getCoverUrl():java.lang.String");
        }

        public boolean isPlaying() {
            C57952m mVar = C65770a0.f189184r.mo89819a().f189201o;
            return mVar != null && mVar.f165852a.isPlaying();
        }
    }

    /* renamed from: cp1.h$b */
    public static final class C57943b extends C87413o implements C32224a<C63367f> {

        /* renamed from: d */
        public final /* synthetic */ C57941h f165841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57943b(C57941h hVar) {
            super(0);
            this.f165841d = hVar;
        }

        public Object invoke() {
            return new C63367f(this.f165841d);
        }
    }

    /* renamed from: cp1.h$c */
    public static final class C57944c extends C87413o implements C32224a<View.OnClickListener> {

        /* renamed from: d */
        public final /* synthetic */ C57941h f165842d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57944c(C57941h hVar) {
            super(0);
            this.f165842d = hVar;
        }

        public Object invoke() {
            return new C57948i(this.f165842d);
        }
    }

    /* renamed from: cp1.h$d */
    public static final class C57945d extends C87413o implements C32224a<View.OnClickListener> {

        /* renamed from: d */
        public final /* synthetic */ C57941h f165843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57945d(C57941h hVar) {
            super(0);
            this.f165843d = hVar;
        }

        public Object invoke() {
            return new C57949j(this.f165843d);
        }
    }

    /* renamed from: cp1.h$e */
    public static final class C57946e extends C87413o implements C32224a<FinderLiveMiniView> {

        /* renamed from: d */
        public final /* synthetic */ C57941h f165844d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57946e(C57941h hVar) {
            super(0);
            this.f165844d = hVar;
        }

        public Object invoke() {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            FinderLiveMiniView finderLiveMiniView = new FinderLiveMiniView(context);
            C57941h hVar = this.f165844d;
            View.OnClickListener onClickListener = (View.OnClickListener) ((C36570n) hVar.f165837i).getValue();
            View.OnClickListener onClickListener2 = (View.OnClickListener) ((C36570n) hVar.f165838j).getValue();
            C87412m.m108594g(onClickListener, "clickListener");
            C87412m.m108594g(onClickListener2, "closeClickListener");
            finderLiveMiniView.setOnClickListener(onClickListener);
            finderLiveMiniView.f159791o = onClickListener2;
            return finderLiveMiniView;
        }
    }

    /* renamed from: cp1.h$f */
    public static final class C57947f extends C87413o implements C32224a<C65817r0> {

        /* renamed from: d */
        public final /* synthetic */ C57941h f165845d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57947f(C57941h hVar) {
            super(0);
            this.f165845d = hVar;
        }

        public Object invoke() {
            return new C65817r0(new SoftReference(this.f165845d));
        }
    }

    public C57941h(Context context, C57959q qVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(qVar, "clickCallback");
        this.f165832d = context;
        this.f165833e = qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = ((cl1.C55001u) r2.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo82737b(int r11, org.json.JSONObject r12, boolean r13) {
        /*
            r10 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "updateMiniWindow:"
            r1.append(r2)
            fj1.b r2 = r10.f165834f
            if (r2 == 0) goto L_0x0024
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r2.mo71262a(r3)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x0024
            long r2 = r2.f182392d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r1.append(r2)
            java.lang.String r2 = ",sourceType:"
            r1.append(r2)
            r1.append(r11)
            r2 = 33
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderLiveReplayMiniView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            uk1.C65409j.f188221v = r11
            uk1.C65409j.f188222w = r12
            r1 = 3
            if (r11 != r1) goto L_0x0048
            if (r12 != 0) goto L_0x0048
            return
        L_0x0048:
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r1 = r10.mo82739m()
            fj1.b r4 = r10.f165834f
            if (r1 == 0) goto L_0x008c
            if (r4 == 0) goto L_0x008c
            w50.b r2 = w50.C65928b.f189533a
            androidx.lifecycle.i0 r3 = r4.mo71262a(r0)
            cl1.o r3 = (cl1.C54991o) r3
            int r3 = r3.f154335l1
            androidx.lifecycle.i0 r0 = r4.mo71262a(r0)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154338m1
            android.graphics.Point r0 = r2.mo89963a(r3, r0)
            r50.c$a r2 = r50.C63363c.C63364a.f179734a
            r2.getClass()
            r50.c r2 = r50.C63363c.C63364a.f179735b
            r2.mo88267a(r0)
            com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayout r0 = r1.getMultiAreaLayout()
            iq3.b r0 = r0.getAdapter()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayoutAdapter"
            gy3.C87412m.m108592e(r0, r1)
            r2 = r0
            uk1.j r2 = (uk1.C65409j) r2
            r7 = 0
            r8 = 16
            r9 = 0
            r3 = r13
            r5 = r11
            r6 = r12
            uk1.C65409j.m77016m(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cp1.C57941h.mo82737b(int, org.json.JSONObject, boolean):void");
    }

    /* renamed from: c */
    public void mo78578c(int i) {
        mo82739m().setState(8);
    }

    /* renamed from: e */
    public void mo78580e(int i) {
        mo82739m().setState(0);
    }

    /* renamed from: f */
    public void mo78581f(int i) {
        mo82739m().setState(4);
    }

    /* renamed from: l */
    public final C63367f mo82738l() {
        return (C63367f) ((C36570n) this.f165835g).getValue();
    }

    /* renamed from: m */
    public final FinderLiveMiniView mo82739m() {
        return (FinderLiveMiniView) ((C36570n) this.f165836h).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = ((cl1.C55001u) r2.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo82740n() {
        /*
            r9 = this;
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "refreshMiniWindow:"
            r1.append(r2)
            fj1.b r2 = r9.f165834f
            r3 = 0
            if (r2 == 0) goto L_0x0024
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r2.mo71262a(r4)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x0024
            long r4 = r2.f182392d
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            r1.append(r2)
            java.lang.String r2 = ",lastSourceType:"
            r1.append(r2)
            int r2 = uk1.C65409j.f188221v
            r1.append(r2)
            r2 = 33
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderLiveReplayMiniView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            int r1 = uk1.C65409j.f188221v
            r4 = 2
            if (r1 != r4) goto L_0x0087
            fj1.b r1 = r9.f165834f
            if (r1 == 0) goto L_0x0058
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.util.List<al1.j> r1 = r1.f154074q
            if (r1 == 0) goto L_0x0058
            int r1 = r1.size()
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            r4 = 3
            if (r1 <= r4) goto L_0x0087
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "refreshMiniWindow error,AUDIENCE source type but audienceLinkMicUserList size:"
            r1.append(r4)
            fj1.b r4 = r9.f165834f
            if (r4 == 0) goto L_0x007c
            androidx.lifecycle.i0 r0 = r4.mo71262a(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r0 = r0.f154074q
            if (r0 == 0) goto L_0x007c
            int r0 = r0.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x007c:
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return
        L_0x0087:
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r0 = r9.mo82739m()
            fj1.b r3 = r9.f165834f
            if (r0 == 0) goto L_0x00ad
            if (r3 == 0) goto L_0x00ad
            com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayout r0 = r0.getMultiAreaLayout()
            iq3.b r0 = r0.getAdapter()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayoutAdapter"
            gy3.C87412m.m108592e(r0, r1)
            r1 = r0
            uk1.j r1 = (uk1.C65409j) r1
            r2 = 0
            int r4 = uk1.C65409j.f188221v
            org.json.JSONObject r5 = uk1.C65409j.f188222w
            r6 = 0
            r7 = 16
            r8 = 0
            uk1.C65409j.m77016m(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cp1.C57941h.mo82740n():void");
    }

    /* renamed from: o */
    public final void mo82741o() {
        mo82738l().mo88276f();
        C65770a0.f189184r.mo89819a().mo89818s((C65817r0) ((C36570n) this.f165839n).getValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = ((cl1.C55001u) r4.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82742p(fj1.C45795b r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "set business:"
            r0.append(r1)
            if (r4 == 0) goto L_0x0020
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r4.mo71262a(r1)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0020
            long r1 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveReplayMiniView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r3.f165834f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cp1.C57941h.mo82742p(fj1.b):void");
    }

    /* renamed from: z */
    public C63362b mo82743z() {
        return new C57942a(this);
    }
}
