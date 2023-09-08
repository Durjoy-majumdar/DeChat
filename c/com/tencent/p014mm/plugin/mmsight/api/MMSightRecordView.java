package com.tencent.p014mm.plugin.mmsight.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import di3.C86312j;
import java.nio.ByteBuffer;
import p500dy.C107070d;

/* renamed from: com.tencent.mm.plugin.mmsight.api.MMSightRecordView */
public class MMSightRecordView extends FrameLayout {

    /* renamed from: e */
    public static C18933b f53164e = ((C107070d) C86312j.m106911c(C107070d.class)).G80();

    /* renamed from: d */
    public C18931e f53165d;

    /* renamed from: com.tencent.mm.plugin.mmsight.api.MMSightRecordView$e */
    public static abstract class C18931e {
        /* renamed from: A */
        public abstract void mo24051A(boolean z);

        /* renamed from: B */
        public abstract void mo24052B(int i);

        /* renamed from: C */
        public abstract void mo24053C(ByteBuffer byteBuffer, C18936f fVar);

        /* renamed from: D */
        public abstract void mo24054D(C18932a aVar);

        /* renamed from: E */
        public abstract void mo24055E();

        /* renamed from: F */
        public abstract void mo24056F(C18934c cVar);

        /* renamed from: G */
        public abstract void mo24057G(C18935d dVar);

        /* renamed from: H */
        public abstract void mo24058H(int i);

        /* renamed from: I */
        public abstract void mo24059I(int i);

        /* renamed from: J */
        public abstract void mo24060J(int i);

        /* renamed from: K */
        public abstract void mo24061K(boolean z);

        /* renamed from: L */
        public abstract void mo24062L(String str);

        /* renamed from: M */
        public abstract void mo24063M(int i, int i2, int i3, int i4, int i5);

        /* renamed from: N */
        public abstract boolean mo24064N(float f);

        /* renamed from: O */
        public abstract void mo24065O();

        /* renamed from: P */
        public abstract boolean mo24066P(boolean z);

        /* renamed from: Q */
        public abstract void mo24067Q(C18938h hVar);

        /* renamed from: R */
        public abstract void mo24068R();

        /* renamed from: S */
        public abstract void mo24069S(C18937g gVar, boolean z);

        /* renamed from: g */
        public abstract int mo24070g();

        /* renamed from: h */
        public abstract Bitmap mo24071h();

        /* renamed from: i */
        public abstract Point mo24072i();

        /* renamed from: j */
        public abstract int mo24073j();

        /* renamed from: k */
        public abstract Point mo24074k();

        /* renamed from: l */
        public abstract Point mo24075l();

        /* renamed from: m */
        public abstract float[] mo24076m();

        /* renamed from: n */
        public abstract String mo24077n();

        /* renamed from: o */
        public abstract Point mo24078o();

        /* renamed from: p */
        public abstract void mo24079p(MotionEvent motionEvent);

        /* renamed from: q */
        public abstract void mo24080q(Context context, ViewGroup viewGroup);

        /* renamed from: r */
        public abstract void mo24081r(Context context, ViewGroup viewGroup, Surface surface, int i, int i2);

        /* renamed from: s */
        public abstract void mo24082s();

        /* renamed from: t */
        public abstract void mo24083t();

        /* renamed from: u */
        public abstract void mo24084u();

        /* renamed from: v */
        public abstract void mo24085v(boolean z);

        /* renamed from: w */
        public abstract void mo24086w(boolean z);

        /* renamed from: x */
        public abstract void mo24087x(float f);

        /* renamed from: y */
        public abstract void mo24088y(Size size);

        /* renamed from: z */
        public abstract void mo24089z(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.api.MMSightRecordView$a */
    public interface C18932a {
        /* renamed from: a */
        void mo22127a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.api.MMSightRecordView$b */
    public interface C18933b {
        /* renamed from: a */
        C18931e mo24090a();
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.api.MMSightRecordView$c */
    public interface C18934c {
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.api.MMSightRecordView$d */
    public interface C18935d {
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.api.MMSightRecordView$f */
    public interface C18936f {
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.api.MMSightRecordView$g */
    public interface C18937g {
        /* renamed from: a */
        void mo22142a();

        /* renamed from: b */
        void mo22143b(Bitmap bitmap);
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.api.MMSightRecordView$h */
    public interface C18938h {
        /* renamed from: a */
        void mo22144a(boolean z);
    }

    public MMSightRecordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18931e a = f53164e.mo24090a();
        this.f53165d = a;
        a.mo24080q(context, this);
    }

    /* renamed from: a */
    public void mo24026a(ByteBuffer byteBuffer, C18936f fVar) {
        this.f53165d.mo24053C(byteBuffer, fVar);
    }

    public int getCameraRotation() {
        return this.f53165d.mo24070g();
    }

    public Bitmap getCurrentFramePicture() {
        return this.f53165d.mo24071h();
    }

    public Point getDrawSizePoint() {
        return this.f53165d.mo24072i();
    }

    public int getFlashMode() {
        return this.f53165d.mo24073j();
    }

    public Point getPictureSize() {
        return this.f53165d.mo24074k();
    }

    public Point getPreviewSize() {
        return this.f53165d.mo24075l();
    }

    public float[] getSupportZoomMultiple() {
        return this.f53165d.mo24076m();
    }

    public String getVideoFilePath() {
        return this.f53165d.mo24077n();
    }

    public Point getVideoSize() {
        return this.f53165d.mo24078o();
    }

    public void setClipPictureSize(boolean z) {
        this.f53165d.mo24085v(z);
    }

    public void setClipVideoSize(boolean z) {
        this.f53165d.mo24086w(z);
    }

    public void setDisplayRatio(float f) {
        this.f53165d.mo24087x(f);
    }

    public void setDisplayScreenSize(Size size) {
        this.f53165d.mo24088y(size);
    }

    public void setEnableDragZoom(boolean z) {
        this.f53165d.mo24089z(z);
    }

    public void setEnableTouchFocus(boolean z) {
        this.f53165d.mo24051A(z);
    }

    public void setFlashMode(int i) {
        this.f53165d.mo24052B(i);
    }

    public void setFrameDataCallback(C18932a aVar) {
        this.f53165d.mo24054D(aVar);
    }

    public void setInitDoneCallback(C18934c cVar) {
        this.f53165d.mo24056F(cVar);
    }

    public void setInitErrorCallback(C18935d dVar) {
        this.f53165d.mo24057G(dVar);
    }

    public void setPreviewMode(int i) {
        this.f53165d.mo24058H(i);
    }

    public void setPreviewSizeLimit(int i) {
        this.f53165d.mo24059I(i);
    }

    public void setRGBSizeLimit(int i) {
        this.f53165d.mo24060J(i);
    }

    public void setUseBackCamera(boolean z) {
        this.f53165d.mo24061K(z);
    }

    public void setVideoFilePath(String str) {
        this.f53165d.mo24062L(str);
    }

    public MMSightRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18931e a = f53164e.mo24090a();
        this.f53165d = a;
        a.mo24080q(context, this);
    }

    public MMSightRecordView(Context context) {
        super(context);
        C18931e a = f53164e.mo24090a();
        this.f53165d = a;
        a.mo24080q(context, this);
    }

    public MMSightRecordView(Context context, Surface surface, int i, int i2) {
        super(context);
        C18931e a = f53164e.mo24090a();
        this.f53165d = a;
        a.mo24081r(context, this, surface, i, i2);
    }
}
