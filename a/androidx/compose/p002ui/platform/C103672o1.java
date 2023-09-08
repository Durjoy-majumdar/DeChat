package androidx.compose.p002ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import fy3.C32226l;
import gy3.C87412m;
import p436a1.C103223b;
import p436a1.C103256p0;
import p436a1.C103262s;
import p436a1.C103265t;
import p436a1.C27726j0;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.o1 */
public final class C103672o1 implements C103671o0 {

    /* renamed from: a */
    public final RenderNode f306230a = new RenderNode("Compose");

    public C103672o1(AndroidComposeView androidComposeView) {
        C87412m.m108594g(androidComposeView, "ownerView");
    }

    /* renamed from: A */
    public float mo144813A() {
        return this.f306230a.getElevation();
    }

    /* renamed from: a */
    public void mo144814a(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.drawRenderNode(this.f306230a);
    }

    /* renamed from: b */
    public void mo144815b(boolean z) {
        this.f306230a.setClipToBounds(z);
    }

    /* renamed from: c */
    public boolean mo144816c() {
        return this.f306230a.hasDisplayList();
    }

    /* renamed from: d */
    public void mo144817d(float f) {
        this.f306230a.setTranslationY(f);
    }

    /* renamed from: e */
    public void mo144818e(float f) {
        this.f306230a.setPivotX(f);
    }

    /* renamed from: f */
    public void mo144819f(float f) {
        this.f306230a.setRotationX(f);
    }

    /* renamed from: g */
    public void mo144820g(float f) {
        this.f306230a.setPivotY(f);
    }

    public float getAlpha() {
        return this.f306230a.getAlpha();
    }

    public int getBottom() {
        return this.f306230a.getBottom();
    }

    public int getHeight() {
        return this.f306230a.getHeight();
    }

    public int getLeft() {
        return this.f306230a.getLeft();
    }

    public int getRight() {
        return this.f306230a.getRight();
    }

    public int getTop() {
        return this.f306230a.getTop();
    }

    public int getWidth() {
        return this.f306230a.getWidth();
    }

    /* renamed from: h */
    public void mo144828h(float f) {
        this.f306230a.setRotationY(f);
    }

    /* renamed from: i */
    public void mo144829i(Outline outline) {
        this.f306230a.setOutline(outline);
    }

    /* renamed from: j */
    public void mo144830j(float f) {
        this.f306230a.setRotationZ(f);
    }

    /* renamed from: k */
    public void mo144831k(C103256p0 p0Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            C103676p1.f306234a.mo144850a(this.f306230a, p0Var);
        }
    }

    /* renamed from: l */
    public void mo144832l(float f) {
        this.f306230a.setCameraDistance(f);
    }

    /* renamed from: m */
    public void mo144833m(boolean z) {
        this.f306230a.setClipToOutline(z);
    }

    /* renamed from: n */
    public void mo144834n(float f) {
        this.f306230a.setTranslationX(f);
    }

    /* renamed from: o */
    public void mo144835o() {
        this.f306230a.discardDisplayList();
    }

    /* renamed from: p */
    public void mo144836p(int i) {
        this.f306230a.setAmbientShadowColor(i);
    }

    /* renamed from: q */
    public void mo144837q(int i) {
        this.f306230a.setSpotShadowColor(i);
    }

    /* renamed from: r */
    public void mo144838r(float f) {
        this.f306230a.setElevation(f);
    }

    /* renamed from: s */
    public void mo144839s(int i) {
        this.f306230a.offsetTopAndBottom(i);
    }

    public void setAlpha(float f) {
        this.f306230a.setAlpha(f);
    }

    public void setScaleX(float f) {
        this.f306230a.setScaleX(f);
    }

    public void setScaleY(float f) {
        this.f306230a.setScaleY(f);
    }

    /* renamed from: t */
    public boolean mo144843t() {
        return this.f306230a.getClipToOutline();
    }

    /* renamed from: u */
    public boolean mo144844u(boolean z) {
        return this.f306230a.setHasOverlappingRendering(z);
    }

    /* renamed from: v */
    public void mo144845v(Matrix matrix) {
        C87412m.m108594g(matrix, "matrix");
        this.f306230a.getMatrix(matrix);
    }

    /* renamed from: w */
    public void mo144846w(C103265t tVar, C27726j0 j0Var, C32226l<? super C103262s, C13598b0> lVar) {
        C87412m.m108594g(tVar, "canvasHolder");
        C87412m.m108594g(lVar, "drawBlock");
        RecordingCanvas beginRecording = this.f306230a.beginRecording();
        C87412m.m108593f(beginRecording, "renderNode.beginRecording()");
        C103223b bVar = tVar.f304485a;
        Canvas canvas = bVar.f304427a;
        bVar.getClass();
        bVar.f304427a = beginRecording;
        C103223b bVar2 = tVar.f304485a;
        if (j0Var != null) {
            bVar2.mo142944c();
            C103262s.C103263a.m136765a(bVar2, j0Var, 0, 2, (Object) null);
        }
        lVar.invoke(bVar2);
        if (j0Var != null) {
            bVar2.mo142943b();
        }
        tVar.f304485a.mo142963v(canvas);
        this.f306230a.endRecording();
    }

    /* renamed from: x */
    public void mo144847x(int i) {
        this.f306230a.offsetLeftAndRight(i);
    }

    /* renamed from: y */
    public boolean mo144848y(int i, int i2, int i3, int i4) {
        return this.f306230a.setPosition(i, i2, i3, i4);
    }

    /* renamed from: z */
    public boolean mo144849z() {
        return this.f306230a.getClipToBounds();
    }
}
