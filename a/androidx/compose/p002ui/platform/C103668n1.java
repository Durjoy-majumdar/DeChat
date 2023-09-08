package androidx.compose.p002ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import fy3.C32226l;
import gy3.C87412m;
import p436a1.C103223b;
import p436a1.C103256p0;
import p436a1.C103262s;
import p436a1.C103265t;
import p436a1.C27726j0;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.n1 */
public final class C103668n1 implements C103671o0 {

    /* renamed from: g */
    public static boolean f306219g = true;

    /* renamed from: a */
    public final RenderNode f306220a;

    /* renamed from: b */
    public int f306221b;

    /* renamed from: c */
    public int f306222c;

    /* renamed from: d */
    public int f306223d;

    /* renamed from: e */
    public int f306224e;

    /* renamed from: f */
    public boolean f306225f;

    public C103668n1(AndroidComposeView androidComposeView) {
        C87412m.m108594g(androidComposeView, "ownerView");
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        C87412m.m108593f(create, "create(\"Compose\", ownerView)");
        this.f306220a = create;
        if (f306219g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                C103688t1 t1Var = C103688t1.f306259a;
                t1Var.mo144859c(create, t1Var.mo144857a(create));
                t1Var.mo144860d(create, t1Var.mo144858b(create));
            }
            if (i >= 24) {
                C103685s1.f306256a.mo144855a(create);
            } else {
                C103683r1.f306254a.mo144853a(create);
            }
            f306219g = false;
        }
    }

    /* renamed from: A */
    public float mo144813A() {
        return this.f306220a.getElevation();
    }

    /* renamed from: a */
    public void mo144814a(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f306220a);
    }

    /* renamed from: b */
    public void mo144815b(boolean z) {
        this.f306225f = z;
        this.f306220a.setClipToBounds(z);
    }

    /* renamed from: c */
    public boolean mo144816c() {
        return this.f306220a.isValid();
    }

    /* renamed from: d */
    public void mo144817d(float f) {
        this.f306220a.setTranslationY(f);
    }

    /* renamed from: e */
    public void mo144818e(float f) {
        this.f306220a.setPivotX(f);
    }

    /* renamed from: f */
    public void mo144819f(float f) {
        this.f306220a.setRotationX(f);
    }

    /* renamed from: g */
    public void mo144820g(float f) {
        this.f306220a.setPivotY(f);
    }

    public float getAlpha() {
        return this.f306220a.getAlpha();
    }

    public int getBottom() {
        return this.f306224e;
    }

    public int getHeight() {
        return this.f306224e - this.f306222c;
    }

    public int getLeft() {
        return this.f306221b;
    }

    public int getRight() {
        return this.f306223d;
    }

    public int getTop() {
        return this.f306222c;
    }

    public int getWidth() {
        return this.f306223d - this.f306221b;
    }

    /* renamed from: h */
    public void mo144828h(float f) {
        this.f306220a.setRotationY(f);
    }

    /* renamed from: i */
    public void mo144829i(Outline outline) {
        this.f306220a.setOutline(outline);
    }

    /* renamed from: j */
    public void mo144830j(float f) {
        this.f306220a.setRotation(f);
    }

    /* renamed from: k */
    public void mo144831k(C103256p0 p0Var) {
    }

    /* renamed from: l */
    public void mo144832l(float f) {
        this.f306220a.setCameraDistance(-f);
    }

    /* renamed from: m */
    public void mo144833m(boolean z) {
        this.f306220a.setClipToOutline(z);
    }

    /* renamed from: n */
    public void mo144834n(float f) {
        this.f306220a.setTranslationX(f);
    }

    /* renamed from: o */
    public void mo144835o() {
        if (Build.VERSION.SDK_INT >= 24) {
            C103685s1.f306256a.mo144855a(this.f306220a);
        } else {
            C103683r1.f306254a.mo144853a(this.f306220a);
        }
    }

    /* renamed from: p */
    public void mo144836p(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C103688t1.f306259a.mo144859c(this.f306220a, i);
        }
    }

    /* renamed from: q */
    public void mo144837q(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C103688t1.f306259a.mo144860d(this.f306220a, i);
        }
    }

    /* renamed from: r */
    public void mo144838r(float f) {
        this.f306220a.setElevation(f);
    }

    /* renamed from: s */
    public void mo144839s(int i) {
        this.f306222c += i;
        this.f306224e += i;
        this.f306220a.offsetTopAndBottom(i);
    }

    public void setAlpha(float f) {
        this.f306220a.setAlpha(f);
    }

    public void setScaleX(float f) {
        this.f306220a.setScaleX(f);
    }

    public void setScaleY(float f) {
        this.f306220a.setScaleY(f);
    }

    /* renamed from: t */
    public boolean mo144843t() {
        return this.f306220a.getClipToOutline();
    }

    /* renamed from: u */
    public boolean mo144844u(boolean z) {
        return this.f306220a.setHasOverlappingRendering(z);
    }

    /* renamed from: v */
    public void mo144845v(Matrix matrix) {
        C87412m.m108594g(matrix, "matrix");
        this.f306220a.getMatrix(matrix);
    }

    /* renamed from: w */
    public void mo144846w(C103265t tVar, C27726j0 j0Var, C32226l<? super C103262s, C13598b0> lVar) {
        C87412m.m108594g(tVar, "canvasHolder");
        C87412m.m108594g(lVar, "drawBlock");
        Canvas start = this.f306220a.start(this.f306223d - this.f306221b, this.f306224e - this.f306222c);
        C87412m.m108593f(start, "renderNode.start(width, height)");
        Canvas u = tVar.mo143044a().mo142962u();
        tVar.mo143044a().mo142963v(start);
        C103223b a = tVar.mo143044a();
        if (j0Var != null) {
            a.mo142944c();
            C103262s.C103263a.m136765a(a, j0Var, 0, 2, (Object) null);
        }
        lVar.invoke(a);
        if (j0Var != null) {
            a.mo142943b();
        }
        tVar.mo143044a().mo142963v(u);
        this.f306220a.end(start);
    }

    /* renamed from: x */
    public void mo144847x(int i) {
        this.f306221b += i;
        this.f306223d += i;
        this.f306220a.offsetLeftAndRight(i);
    }

    /* renamed from: y */
    public boolean mo144848y(int i, int i2, int i3, int i4) {
        this.f306221b = i;
        this.f306222c = i2;
        this.f306223d = i3;
        this.f306224e = i4;
        return this.f306220a.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: z */
    public boolean mo144849z() {
        return this.f306225f;
    }
}
