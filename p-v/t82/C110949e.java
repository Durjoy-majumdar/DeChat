package t82;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import lh2.C109344g0;
import me3.C109610a;
import me3.C109612c;
import me3.C109623f;
import p248ug.C111164r0;
import p248ug.C111167t;
import p511ew.C58849b;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import x82.C112095g;
import zp3.C112659d0;

/* renamed from: t82.e */
public final class C110949e implements C109344g0 {

    /* renamed from: d */
    public FrameLayout f331842d;

    /* renamed from: e */
    public C101198e f331843e;

    /* renamed from: f */
    public C112095g f331844f;

    /* renamed from: g */
    public final C13601g f331845g = C36568h.m40985a(C110951b.f331858d);

    /* renamed from: h */
    public final C13601g f331846h = C36568h.m40985a(C110950a.f331857d);

    /* renamed from: i */
    public C111164r0 f331847i;

    /* renamed from: j */
    public C112659d0 f331848j;

    /* renamed from: n */
    public C109623f f331849n;

    /* renamed from: o */
    public final Context f331850o = this.f331842d.getContext();

    /* renamed from: p */
    public boolean f331851p;

    /* renamed from: q */
    public String f331852q = String.valueOf(System.currentTimeMillis() + ((long) hashCode()));

    /* renamed from: r */
    public boolean f331853r;

    /* renamed from: s */
    public boolean f331854s;

    /* renamed from: t */
    public C111167t f331855t = C111167t.DEFAULT;

    /* renamed from: u */
    public int f331856u = -1;

    /* renamed from: t82.e$a */
    public static final class C110950a extends C87413o implements C32224a<C111164r0> {

        /* renamed from: d */
        public static final C110950a f331857d = new C110950a();

        public C110950a() {
            super(0);
        }

        public Object invoke() {
            return ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD();
        }
    }

    /* renamed from: t82.e$b */
    public static final class C110951b extends C87413o implements C32224a<C111164r0> {

        /* renamed from: d */
        public static final C110951b f331858d = new C110951b();

        public C110951b() {
            super(0);
        }

        public Object invoke() {
            return ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD();
        }
    }

    public C110949e(FrameLayout frameLayout, C101198e eVar, C112095g gVar) {
        C87412m.m108594g(frameLayout, "photoLayout");
        C87412m.m108594g(eVar, "status");
        this.f331842d = frameLayout;
        this.f331843e = eVar;
        this.f331844f = gVar;
    }

    /* JADX WARNING: type inference failed for: r8v19, types: [eq3.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162630a(boolean r8, h90.C98324b r9) {
        /*
            r7 = this;
            java.lang.String r0 = "config"
            gy3.C87412m.m108594g(r9, r0)
            r0 = 1
            r7.f331853r = r0
            android.widget.FrameLayout r1 = r7.f331842d
            r2 = 0
            r1.setVisibility(r2)
            if (r8 == 0) goto L_0x0020
            rx3.g r8 = r7.f331846h
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.String r1 = "<get-mLandscapePhotoEditor>(...)"
            gy3.C87412m.m108593f(r8, r1)
            ug.r0 r8 = (p248ug.C111164r0) r8
            goto L_0x002f
        L_0x0020:
            rx3.g r8 = r7.f331845g
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.String r1 = "<get-mPortraitPhotoEditor>(...)"
            gy3.C87412m.m108593f(r8, r1)
            ug.r0 r8 = (p248ug.C111164r0) r8
        L_0x002f:
            r7.f331847i = r8
            java.lang.String r8 = r7.f331852q
            if (r8 != 0) goto L_0x0045
            long r3 = java.lang.System.currentTimeMillis()
            int r8 = r7.hashCode()
            long r5 = (long) r8
            long r3 = r3 + r5
            java.lang.String r8 = java.lang.String.valueOf(r3)
            r7.f331852q = r8
        L_0x0045:
            ug.r0 r8 = r7.f331847i
            if (r8 == 0) goto L_0x0065
            ug.r0$a r1 = new ug.r0$a
            r1.<init>()
            r1.f332925b = r0
            r1.f332926c = r2
            ug.r0$b r3 = p248ug.C111164r0.C111166b.SCREEN
            r1.f332924a = r3
            r1.f332929f = r2
            android.graphics.Rect r9 = r9.f288194o
            r1.f332930g = r9
            r1.f332931h = r2
            java.lang.String r9 = r7.f331852q
            r1.f332927d = r9
            r8.mo162895d(r1)
        L_0x0065:
            ug.r0 r8 = r7.f331847i
            r9 = 0
            if (r8 == 0) goto L_0x0071
            android.content.Context r1 = r7.f331850o
            ug.e r8 = r8.mo162894c(r1)
            goto L_0x0072
        L_0x0071:
            r8 = r9
        L_0x0072:
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.view.MultiTalkDrawingView"
            gy3.C87412m.m108592e(r8, r1)
            zp3.d0 r8 = (zp3.C112659d0) r8
            r7.f331848j = r8
            cq3.a r8 = r8.getBaseBoardView()
            cq3.d r8 = (cq3.C106958d) r8
            if (r8 == 0) goto L_0x0092
            x82.g r8 = r7.f331844f
            if (r8 == 0) goto L_0x0092
            r2 = 9
            java.util.HashSet<java.lang.Integer> r8 = r8.f335604c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.contains(r2)
        L_0x0092:
            zp3.d0 r8 = r7.f331848j
            if (r8 == 0) goto L_0x009d
            eq3.a r8 = r8.getBaseFooterView()
            r9 = r8
            eq3.c r9 = (eq3.C107287c) r9
        L_0x009d:
            if (r9 != 0) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            r9.setHideFooter(r0)
        L_0x00a3:
            zp3.d0 r8 = r7.f331848j
            gy3.C87412m.m108592e(r8, r1)
            me3.f r8 = r8.getPresenter()
            r7.f331849n = r8
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter"
            gy3.C87412m.m108592e(r8, r9)
            me3.c r8 = (me3.C109612c) r8
            t82.b r9 = new t82.b
            r9.<init>(r7)
            r8.f328172o = r9
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = -1
            r8.<init>(r9, r9)
            android.widget.FrameLayout r9 = r7.f331842d
            zp3.d0 r0 = r7.f331848j
            r9.addView(r0, r8)
            zp3.d0 r8 = r7.f331848j
            if (r8 != 0) goto L_0x00ce
            goto L_0x00d6
        L_0x00ce:
            t82.c r9 = new t82.c
            r9.<init>(r7)
            r8.setSelectedFeatureListener(r9)
        L_0x00d6:
            me3.f r8 = r7.f331849n
            if (r8 == 0) goto L_0x00ed
            ug.t r9 = p248ug.C111167t.DOODLE
            me3.c r8 = (me3.C109612c) r8
            bh.b r8 = r8.mo160818b(r9)
            bh.j r8 = (p1093bh.C104100j) r8
            if (r8 == 0) goto L_0x00ed
            t82.d r9 = new t82.d
            r9.<init>(r7)
            r8.f307896m = r9
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t82.C110949e.mo162630a(boolean, h90.b):void");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        C111167t tVar = this.f331855t;
        C111167t tVar2 = C111167t.CROP_PHOTO;
        if (tVar != tVar2) {
            return false;
        }
        this.f331855t = C111167t.DEFAULT;
        C109623f fVar = this.f331849n;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150363c(tVar2, 1, (Object) null);
        }
        return true;
    }

    public String name() {
        return C110949e.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
        Object value = ((C36570n) this.f331845g).getValue();
        C87412m.m108593f(value, "<get-mPortraitPhotoEditor>(...)");
        ((C111164r0) value).mo162897f();
        Object value2 = ((C36570n) this.f331846h).getValue();
        C87412m.m108593f(value2, "<get-mLandscapePhotoEditor>(...)");
        ((C111164r0) value2).mo162897f();
        this.f331842d.removeAllViews();
        this.f331842d.setVisibility(8);
        C109623f fVar = this.f331849n;
        if (fVar != null) {
            ((C109612c) fVar).mo160828l();
        }
    }

    public void reset() {
        C111167t tVar = C111167t.DEFAULT;
        this.f331855t = tVar;
        C109623f fVar = this.f331849n;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150361a(tVar);
        }
        C109623f fVar2 = this.f331849n;
        if (fVar2 != null) {
            new C109610a((C109612c) fVar2).mo150363c(tVar, -1, (Object) null);
        }
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
