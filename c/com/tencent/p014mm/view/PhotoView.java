package com.tencent.p014mm.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: com.tencent.mm.view.PhotoView */
public class PhotoView extends AppCompatImageView {

    /* renamed from: A */
    public boolean f319854A;

    /* renamed from: B */
    public boolean f319855B;

    /* renamed from: C */
    public boolean f319856C;

    /* renamed from: D */
    public float f319857D;

    /* renamed from: E */
    public float f319858E = 1.0f;

    /* renamed from: F */
    public int f319859F;

    /* renamed from: G */
    public int f319860G;

    /* renamed from: H */
    public float f319861H;

    /* renamed from: I */
    public float f319862I;

    /* renamed from: J */
    public RectF f319863J = new RectF();

    /* renamed from: K */
    public RectF f319864K = new RectF();

    /* renamed from: L */
    public RectF f319865L = new RectF();

    /* renamed from: M */
    public RectF f319866M = new RectF();

    /* renamed from: N */
    public RectF f319867N = new RectF();

    /* renamed from: P */
    public PointF f319868P = new PointF();

    /* renamed from: Q */
    public PointF f319869Q = new PointF();

    /* renamed from: Q0 */
    public GestureDetector.OnGestureListener f319870Q0;

    /* renamed from: R */
    public PointF f319871R = new PointF();

    /* renamed from: R0 */
    public Rect f319872R0;

    /* renamed from: S */
    public C106851k f319873S = new C106851k();

    /* renamed from: T */
    public RectF f319874T;

    /* renamed from: U */
    public Info f319875U;

    /* renamed from: V */
    public long f319876V;

    /* renamed from: W */
    public Runnable f319877W;

    /* renamed from: f */
    public int f319878f;

    /* renamed from: g */
    public float f319879g;

    /* renamed from: h */
    public int f319880h = 0;

    /* renamed from: i */
    public int f319881i = 0;

    /* renamed from: j */
    public int f319882j = 500;

    /* renamed from: n */
    public Matrix f319883n = new Matrix();

    /* renamed from: o */
    public Matrix f319884o = new Matrix();

    /* renamed from: p */
    public Matrix f319885p = new Matrix();

    /* renamed from: p0 */
    public View.OnLongClickListener f319886p0;

    /* renamed from: q */
    public Matrix f319887q = new Matrix();

    /* renamed from: r */
    public View.OnClickListener f319888r;

    /* renamed from: s */
    public ImageView.ScaleType f319889s;

    /* renamed from: t */
    public boolean f319890t;

    /* renamed from: u */
    public boolean f319891u;

    /* renamed from: v */
    public boolean f319892v;

    /* renamed from: w */
    public boolean f319893w;

    /* renamed from: x */
    public boolean f319894x;

    /* renamed from: x0 */
    public ScaleGestureDetector.OnScaleGestureListener f319895x0;

    /* renamed from: y */
    public boolean f319896y;

    /* renamed from: y0 */
    public Runnable f319897y0;

    /* renamed from: z */
    public boolean f319898z;

    /* renamed from: com.tencent.mm.view.PhotoView$a */
    public class C106841a {
        public C106841a(PhotoView photoView) {
        }
    }

    /* renamed from: com.tencent.mm.view.PhotoView$b */
    public class C106842b implements ScaleGestureDetector.OnScaleGestureListener {
        public C106842b() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            PhotoView photoView = PhotoView.this;
            photoView.f319858E *= scaleFactor;
            photoView.f319884o.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            PhotoView.this.mo154811t();
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    /* renamed from: com.tencent.mm.view.PhotoView$c */
    public class C106843c implements Runnable {
        public C106843c() {
        }

        public void run() {
            PhotoView photoView = PhotoView.this;
            View.OnClickListener onClickListener = photoView.f319888r;
            if (onClickListener != null) {
                onClickListener.onClick(photoView);
            }
        }
    }

    /* renamed from: com.tencent.mm.view.PhotoView$d */
    public class C106844d extends GestureDetector.SimpleOnGestureListener {
        public C106844d() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            float f;
            float f2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            PhotoView.this.f319873S.mo154835b();
            RectF rectF = PhotoView.this.f319865L;
            float width = rectF.left + (rectF.width() / 2.0f);
            RectF rectF2 = PhotoView.this.f319865L;
            float height = rectF2.top + (rectF2.height() / 2.0f);
            PhotoView.this.f319869Q.set(width, height);
            PhotoView.this.f319871R.set(width, height);
            PhotoView photoView = PhotoView.this;
            photoView.f319859F = 0;
            photoView.f319860G = 0;
            if (photoView.f319898z) {
                f = photoView.f319858E;
                f2 = 1.0f;
            } else {
                float f3 = photoView.f319858E;
                float f4 = photoView.f319879g;
                photoView.f319869Q.set(motionEvent.getX(), motionEvent.getY());
                f = f3;
                f2 = f4;
            }
            PhotoView.this.f319887q.reset();
            PhotoView photoView2 = PhotoView.this;
            Matrix matrix = photoView2.f319887q;
            RectF rectF3 = photoView2.f319864K;
            matrix.postTranslate(-rectF3.left, -rectF3.top);
            PhotoView photoView3 = PhotoView.this;
            Matrix matrix2 = photoView3.f319887q;
            PointF pointF = photoView3.f319871R;
            matrix2.postTranslate(pointF.x, pointF.y);
            PhotoView photoView4 = PhotoView.this;
            photoView4.f319887q.postTranslate(-photoView4.f319861H, -photoView4.f319862I);
            PhotoView photoView5 = PhotoView.this;
            Matrix matrix3 = photoView5.f319887q;
            float f5 = photoView5.f319857D;
            PointF pointF2 = photoView5.f319871R;
            matrix3.postRotate(f5, pointF2.x, pointF2.y);
            PhotoView photoView6 = PhotoView.this;
            Matrix matrix4 = photoView6.f319887q;
            PointF pointF3 = photoView6.f319869Q;
            matrix4.postScale(f2, f2, pointF3.x, pointF3.y);
            PhotoView photoView7 = PhotoView.this;
            photoView7.f319887q.postTranslate((float) photoView7.f319859F, (float) photoView7.f319860G);
            PhotoView photoView8 = PhotoView.this;
            photoView8.f319887q.mapRect(photoView8.f319866M, photoView8.f319864K);
            PhotoView photoView9 = PhotoView.this;
            photoView9.mo154801s(photoView9.f319866M);
            PhotoView photoView10 = PhotoView.this;
            photoView10.f319898z = !photoView10.f319898z;
            C106851k kVar = photoView10.f319873S;
            kVar.f319919g.startScroll((int) (f * 10000.0f), 0, (int) ((f2 - f) * 10000.0f), 0, PhotoView.this.f319878f);
            C106851k kVar2 = PhotoView.this.f319873S;
            kVar2.f319916d = true;
            PhotoView.this.post(kVar2);
            C117292a.m165362h(false, this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            PhotoView photoView = PhotoView.this;
            photoView.f319893w = false;
            photoView.f319890t = false;
            photoView.f319854A = false;
            photoView.removeCallbacks(photoView.f319897y0);
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            int i;
            int i2;
            int i3;
            int i4;
            PhotoView photoView = PhotoView.this;
            if (photoView.f319890t) {
                return false;
            }
            if ((!photoView.f319855B && !photoView.f319856C) || photoView.f319873S.f319916d) {
                return false;
            }
            PhotoView photoView2 = PhotoView.this;
            float f3 = (((float) Math.round(photoView.f319865L.left)) >= photoView2.f319863J.left || ((float) Math.round(photoView2.f319865L.right)) <= PhotoView.this.f319863J.right) ? 0.0f : f;
            PhotoView photoView3 = PhotoView.this;
            float f4 = (((float) Math.round(PhotoView.this.f319865L.top)) >= photoView3.f319863J.top || ((float) Math.round(photoView3.f319865L.bottom)) <= PhotoView.this.f319863J.bottom) ? 0.0f : f2;
            PhotoView photoView4 = PhotoView.this;
            if (photoView4.f319854A || photoView4.f319857D % 90.0f != 0.0f) {
                float f5 = photoView4.f319857D;
                float f6 = (float) (((int) (f5 / 90.0f)) * 90);
                float f7 = f5 % 90.0f;
                if (f7 > 45.0f) {
                    f6 += 90.0f;
                } else if (f7 < -45.0f) {
                    f6 -= 90.0f;
                }
                C106851k kVar = photoView4.f319873S;
                int i5 = (int) f5;
                kVar.f319921i.startScroll(i5, 0, ((int) f6) - i5, 0, PhotoView.this.f319878f);
                PhotoView.this.f319857D = f6;
            }
            PhotoView photoView5 = PhotoView.this;
            photoView5.mo154801s(photoView5.f319865L);
            C106851k kVar2 = PhotoView.this.f319873S;
            int i6 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            kVar2.f319923n = i6 < 0 ? Integer.MAX_VALUE : 0;
            int i7 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            PhotoView photoView6 = PhotoView.this;
            int abs = (int) (i7 > 0 ? Math.abs(photoView6.f319865L.left) : photoView6.f319865L.right - photoView6.f319863J.right);
            if (i6 < 0) {
                abs = Integer.MAX_VALUE - abs;
            }
            int i8 = i6 < 0 ? abs : 0;
            int i9 = i6 < 0 ? Integer.MAX_VALUE : abs;
            if (i6 < 0) {
                abs = Integer.MAX_VALUE - i8;
            }
            int i15 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            kVar2.f319924o = i15 < 0 ? Integer.MAX_VALUE : 0;
            int i16 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            PhotoView photoView7 = PhotoView.this;
            int abs2 = (int) (i16 > 0 ? Math.abs(photoView7.f319865L.top) : photoView7.f319865L.bottom - photoView7.f319863J.bottom);
            if (i15 < 0) {
                abs2 = Integer.MAX_VALUE - abs2;
            }
            int i17 = i15 < 0 ? abs2 : 0;
            int i18 = i15 < 0 ? Integer.MAX_VALUE : abs2;
            if (i15 < 0) {
                abs2 = Integer.MAX_VALUE - i17;
            }
            if (i7 == 0) {
                i2 = 0;
                i = 0;
            } else {
                i2 = i8;
                i = i9;
            }
            if (i16 == 0) {
                i4 = 0;
                i3 = 0;
            } else {
                i4 = i17;
                i3 = i18;
            }
            OverScroller overScroller = kVar2.f319918f;
            int i19 = kVar2.f319923n;
            int i25 = kVar2.f319924o;
            int i26 = (int) f3;
            int i27 = (int) f4;
            int abs3 = Math.abs(abs);
            int i28 = PhotoView.this.f319880h;
            int i29 = abs3 < i28 * 2 ? 0 : i28;
            int abs4 = Math.abs(abs2);
            int i35 = PhotoView.this.f319880h;
            overScroller.fling(i19, i25, i26, i27, i2, i, i4, i3, i29, abs4 < i35 * 2 ? 0 : i35);
            C106851k kVar3 = PhotoView.this.f319873S;
            kVar3.f319916d = true;
            PhotoView.this.post(kVar3);
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            PhotoView photoView = PhotoView.this;
            View.OnLongClickListener onLongClickListener = photoView.f319886p0;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(photoView);
            }
            C117292a.m165361g(this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C106851k kVar = PhotoView.this.f319873S;
            if (kVar.f319916d) {
                kVar.mo154835b();
            }
            if (PhotoView.this.mo154799q(f)) {
                if (f < 0.0f) {
                    PhotoView photoView = PhotoView.this;
                    float f3 = photoView.f319865L.left;
                    if (f3 - f > photoView.f319863J.left) {
                        f = f3;
                    }
                }
                if (f > 0.0f) {
                    PhotoView photoView2 = PhotoView.this;
                    float f4 = photoView2.f319865L.right;
                    float f5 = photoView2.f319863J.right;
                    if (f4 - f < f5) {
                        f = f4 - f5;
                    }
                }
                PhotoView.this.f319884o.postTranslate(-f, 0.0f);
                PhotoView photoView3 = PhotoView.this;
                photoView3.f319859F = (int) (((float) photoView3.f319859F) - f);
            } else {
                PhotoView photoView4 = PhotoView.this;
                if (photoView4.f319855B || photoView4.f319890t || photoView4.f319893w) {
                    PhotoView.m144498p(photoView4);
                    PhotoView photoView5 = PhotoView.this;
                    if (!photoView5.f319890t) {
                        if (f < 0.0f) {
                            float f6 = photoView5.f319865L.left;
                            float f7 = photoView5.f319867N.left;
                            if (f6 - f > f7) {
                                f *= Math.abs(Math.abs(f6 - f7) - ((float) photoView5.f319881i)) / ((float) photoView5.f319881i);
                            }
                        }
                        if (f > 0.0f) {
                            PhotoView photoView6 = PhotoView.this;
                            float f8 = photoView6.f319865L.right;
                            float f9 = photoView6.f319867N.right;
                            if (f8 - f < f9) {
                                f *= Math.abs(Math.abs(f8 - f9) - ((float) photoView6.f319881i)) / ((float) photoView6.f319881i);
                            }
                        }
                    }
                    PhotoView photoView7 = PhotoView.this;
                    photoView7.f319859F = (int) (((float) photoView7.f319859F) - f);
                    photoView7.f319884o.postTranslate(-f, 0.0f);
                    PhotoView.this.f319893w = true;
                }
            }
            if (PhotoView.this.mo154800r(f2)) {
                if (f2 < 0.0f) {
                    PhotoView photoView8 = PhotoView.this;
                    float f15 = photoView8.f319865L.top;
                    if (f15 - f2 > photoView8.f319863J.top) {
                        f2 = f15;
                    }
                }
                if (f2 > 0.0f) {
                    PhotoView photoView9 = PhotoView.this;
                    float f16 = photoView9.f319865L.bottom;
                    float f17 = photoView9.f319863J.bottom;
                    if (f16 - f2 < f17) {
                        f2 = f16 - f17;
                    }
                }
                PhotoView.this.f319884o.postTranslate(0.0f, -f2);
                PhotoView photoView10 = PhotoView.this;
                photoView10.f319860G = (int) (((float) photoView10.f319860G) - f2);
            } else {
                PhotoView photoView11 = PhotoView.this;
                if (photoView11.f319856C || photoView11.f319893w || photoView11.f319890t) {
                    PhotoView.m144498p(photoView11);
                    PhotoView photoView12 = PhotoView.this;
                    if (!photoView12.f319890t) {
                        if (f2 < 0.0f) {
                            float f18 = photoView12.f319865L.top;
                            float f19 = photoView12.f319867N.top;
                            if (f18 - f2 > f19) {
                                f2 *= Math.abs(Math.abs(f18 - f19) - ((float) photoView12.f319881i)) / ((float) photoView12.f319881i);
                            }
                        }
                        if (f2 > 0.0f) {
                            PhotoView photoView13 = PhotoView.this;
                            float f25 = photoView13.f319865L.bottom;
                            float f26 = photoView13.f319867N.bottom;
                            if (f25 - f2 < f26) {
                                f2 *= Math.abs(Math.abs(f25 - f26) - ((float) photoView13.f319881i)) / ((float) photoView13.f319881i);
                            }
                        }
                    }
                    PhotoView.this.f319884o.postTranslate(0.0f, -f2);
                    PhotoView photoView14 = PhotoView.this;
                    photoView14.f319860G = (int) (((float) photoView14.f319860G) - f2);
                    photoView14.f319893w = true;
                }
            }
            PhotoView.this.mo154811t();
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            PhotoView photoView = PhotoView.this;
            photoView.postDelayed(photoView.f319897y0, 250);
            C117292a.m165362h(false, this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.view.PhotoView$e */
    public static /* synthetic */ class C106845e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f319911a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f319911a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f319911a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f319911a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f319911a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f319911a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f319911a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f319911a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.PhotoView.C106845e.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mm.view.PhotoView$f */
    public interface C106846f {
        /* renamed from: a */
        float mo154832a();
    }

    /* renamed from: com.tencent.mm.view.PhotoView$g */
    public class C106847g implements C106846f {
        public C106847g() {
        }

        /* renamed from: a */
        public float mo154832a() {
            return PhotoView.this.f319865L.bottom;
        }
    }

    /* renamed from: com.tencent.mm.view.PhotoView$h */
    public class C106848h implements Interpolator {

        /* renamed from: a */
        public Interpolator f319913a = new DecelerateInterpolator();

        public C106848h(PhotoView photoView, C106841a aVar) {
        }

        public float getInterpolation(float f) {
            Interpolator interpolator = this.f319913a;
            return interpolator != null ? interpolator.getInterpolation(f) : f;
        }
    }

    /* renamed from: com.tencent.mm.view.PhotoView$i */
    public class C106849i implements C106846f {
        public C106849i() {
        }

        /* renamed from: a */
        public float mo154832a() {
            RectF rectF = PhotoView.this.f319865L;
            return (rectF.top + rectF.bottom) / 2.0f;
        }
    }

    /* renamed from: com.tencent.mm.view.PhotoView$j */
    public class C106850j implements C106846f {
        public C106850j() {
        }

        /* renamed from: a */
        public float mo154832a() {
            return PhotoView.this.f319865L.top;
        }
    }

    /* renamed from: com.tencent.mm.view.PhotoView$k */
    public class C106851k implements Runnable {

        /* renamed from: d */
        public boolean f319916d;

        /* renamed from: e */
        public OverScroller f319917e;

        /* renamed from: f */
        public OverScroller f319918f;

        /* renamed from: g */
        public Scroller f319919g;

        /* renamed from: h */
        public Scroller f319920h;

        /* renamed from: i */
        public Scroller f319921i;

        /* renamed from: j */
        public C106846f f319922j;

        /* renamed from: n */
        public int f319923n;

        /* renamed from: o */
        public int f319924o;

        /* renamed from: p */
        public int f319925p;

        /* renamed from: q */
        public int f319926q;

        /* renamed from: r */
        public RectF f319927r = new RectF();

        /* renamed from: s */
        public C106848h f319928s;

        /* renamed from: com.tencent.mm.view.PhotoView$k$a */
        public class C106852a implements Runnable {
            public C106852a() {
            }

            public void run() {
                PhotoView.this.f319877W.run();
                PhotoView photoView = PhotoView.this;
                photoView.f319877W = null;
                photoView.invalidate();
            }
        }

        public C106851k() {
            this.f319928s = new C106848h(PhotoView.this, (C106841a) null);
            Context context = PhotoView.this.getContext();
            this.f319917e = new OverScroller(context, this.f319928s);
            this.f319919g = new Scroller(context, this.f319928s);
            this.f319918f = new OverScroller(context, this.f319928s);
            this.f319920h = new Scroller(context, this.f319928s);
            this.f319921i = new Scroller(context, this.f319928s);
        }

        /* renamed from: a */
        public final void mo154834a() {
            PhotoView.this.f319884o.reset();
            PhotoView photoView = PhotoView.this;
            Matrix matrix = photoView.f319884o;
            RectF rectF = photoView.f319864K;
            matrix.postTranslate(-rectF.left, -rectF.top);
            PhotoView photoView2 = PhotoView.this;
            Matrix matrix2 = photoView2.f319884o;
            PointF pointF = photoView2.f319871R;
            matrix2.postTranslate(pointF.x, pointF.y);
            PhotoView photoView3 = PhotoView.this;
            photoView3.f319884o.postTranslate(-photoView3.f319861H, -photoView3.f319862I);
            PhotoView photoView4 = PhotoView.this;
            Matrix matrix3 = photoView4.f319884o;
            float f = photoView4.f319857D;
            PointF pointF2 = photoView4.f319871R;
            matrix3.postRotate(f, pointF2.x, pointF2.y);
            PhotoView photoView5 = PhotoView.this;
            Matrix matrix4 = photoView5.f319884o;
            float f2 = photoView5.f319858E;
            PointF pointF3 = photoView5.f319869Q;
            matrix4.postScale(f2, f2, pointF3.x, pointF3.y);
            PhotoView photoView6 = PhotoView.this;
            photoView6.f319884o.postTranslate((float) photoView6.f319859F, (float) photoView6.f319860G);
            PhotoView.this.mo154811t();
        }

        /* renamed from: b */
        public void mo154835b() {
            PhotoView.this.removeCallbacks(this);
            this.f319917e.abortAnimation();
            this.f319919g.abortAnimation();
            this.f319918f.abortAnimation();
            this.f319921i.abortAnimation();
            this.f319916d = false;
        }

        public void run() {
            boolean z;
            boolean z2 = true;
            boolean z3 = false;
            if (this.f319919g.computeScrollOffset()) {
                PhotoView.this.f319858E = ((float) this.f319919g.getCurrX()) / 10000.0f;
                z = false;
            } else {
                z = true;
            }
            if (this.f319917e.computeScrollOffset()) {
                int currX = this.f319917e.getCurrX() - this.f319925p;
                int currY = this.f319917e.getCurrY() - this.f319926q;
                PhotoView photoView = PhotoView.this;
                photoView.f319859F += currX;
                photoView.f319860G += currY;
                this.f319925p = this.f319917e.getCurrX();
                this.f319926q = this.f319917e.getCurrY();
                z = false;
            }
            if (this.f319918f.computeScrollOffset()) {
                int currX2 = this.f319918f.getCurrX() - this.f319923n;
                int currY2 = this.f319918f.getCurrY() - this.f319924o;
                this.f319923n = this.f319918f.getCurrX();
                this.f319924o = this.f319918f.getCurrY();
                PhotoView photoView2 = PhotoView.this;
                photoView2.f319859F += currX2;
                photoView2.f319860G += currY2;
                z = false;
            }
            if (this.f319921i.computeScrollOffset()) {
                PhotoView.this.f319857D = (float) this.f319921i.getCurrX();
                z = false;
            }
            if (this.f319920h.computeScrollOffset() || PhotoView.this.f319874T != null) {
                float currX3 = ((float) this.f319920h.getCurrX()) / 10000.0f;
                float currY3 = ((float) this.f319920h.getCurrY()) / 10000.0f;
                PhotoView photoView3 = PhotoView.this;
                Matrix matrix = photoView3.f319887q;
                RectF rectF = photoView3.f319865L;
                matrix.setScale(currX3, currY3, (rectF.left + rectF.right) / 2.0f, this.f319922j.mo154832a());
                PhotoView photoView4 = PhotoView.this;
                photoView4.f319887q.mapRect(this.f319927r, photoView4.f319865L);
                if (currX3 == 1.0f) {
                    RectF rectF2 = this.f319927r;
                    RectF rectF3 = PhotoView.this.f319863J;
                    rectF2.left = rectF3.left;
                    rectF2.right = rectF3.right;
                }
                if (currY3 == 1.0f) {
                    RectF rectF4 = this.f319927r;
                    RectF rectF5 = PhotoView.this.f319863J;
                    rectF4.top = rectF5.top;
                    rectF4.bottom = rectF5.bottom;
                }
                PhotoView.this.f319874T = this.f319927r;
            }
            if (!z) {
                mo154834a();
                if (this.f319916d) {
                    PhotoView.this.post(this);
                    return;
                }
                return;
            }
            this.f319916d = false;
            PhotoView photoView5 = PhotoView.this;
            if (photoView5.f319855B) {
                RectF rectF6 = photoView5.f319865L;
                float f = rectF6.left;
                if (f > 0.0f) {
                    photoView5.f319859F = (int) (((float) photoView5.f319859F) - f);
                } else if (rectF6.right < photoView5.f319863J.width()) {
                    PhotoView photoView6 = PhotoView.this;
                    photoView6.f319859F -= (int) (photoView6.f319863J.width() - PhotoView.this.f319865L.right);
                }
                z3 = true;
            }
            PhotoView photoView7 = PhotoView.this;
            if (photoView7.f319856C) {
                RectF rectF7 = photoView7.f319865L;
                float f2 = rectF7.top;
                if (f2 > 0.0f) {
                    photoView7.f319860G = (int) (((float) photoView7.f319860G) - f2);
                } else if (rectF7.bottom < photoView7.f319863J.height()) {
                    PhotoView photoView8 = PhotoView.this;
                    photoView8.f319860G -= (int) (photoView8.f319863J.height() - PhotoView.this.f319865L.bottom);
                }
            } else {
                z2 = z3;
            }
            if (z2) {
                mo154834a();
            }
            PhotoView.this.invalidate();
            PhotoView photoView9 = PhotoView.this;
            if (photoView9.f319877W != null) {
                photoView9.post(new C106852a());
            }
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new C106841a(this);
        this.f319895x0 = new C106842b();
        this.f319897y0 = new C106843c();
        this.f319870Q0 = new C106844d();
        this.f319872R0 = new Rect();
        mo154812w();
    }

    /* renamed from: p */
    public static void m144498p(PhotoView photoView) {
        if (!photoView.f319893w) {
            RectF rectF = photoView.f319863J;
            RectF rectF2 = photoView.f319865L;
            RectF rectF3 = photoView.f319867N;
            float f = rectF.left;
            float f2 = rectF2.left;
            if (f <= f2) {
                f = f2;
            }
            float f3 = rectF.right;
            float f4 = rectF2.right;
            if (f3 >= f4) {
                f3 = f4;
            }
            if (f > f3) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            float f5 = rectF.top;
            float f6 = rectF2.top;
            if (f5 <= f6) {
                f5 = f6;
            }
            float f7 = rectF.bottom;
            float f8 = rectF2.bottom;
            if (f7 >= f8) {
                f7 = f8;
            }
            if (f5 > f7) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                rectF3.set(f, f5, f3, f7);
            }
        }
    }

    /* renamed from: u */
    public static int m144499u(Drawable drawable) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getMinimumHeight();
        }
        return intrinsicHeight <= 0 ? drawable.getBounds().height() : intrinsicHeight;
    }

    /* renamed from: v */
    public static int m144500v(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getMinimumWidth();
        }
        return intrinsicWidth <= 0 ? drawable.getBounds().width() : intrinsicWidth;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f319890t) {
            return true;
        }
        return mo154799q((float) i);
    }

    public boolean canScrollVertically(int i) {
        if (this.f319890t) {
            return true;
        }
        return mo154800r((float) i);
    }

    public void draw(Canvas canvas) {
        canvas.save();
        RectF rectF = this.f319874T;
        if (rectF != null) {
            canvas.clipRect(rectF);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public int getAnimaDuring() {
        return this.f319878f;
    }

    public long getDefaultAnimDuring() {
        return 200;
    }

    public Info getInfo() {
        Rect rect = new Rect();
        Rect rect2 = this.f319872R0;
        Rect rect3 = new Rect();
        getGlobalVisibleRect(rect3);
        if (!rect2.isEmpty() && rect3.bottom - getHeight() < rect2.top) {
            rect3.top = rect3.bottom - getHeight();
        }
        int i = (int) (((float) rect3.left) + 0.5f);
        int i2 = (int) (((float) rect3.top) + 0.5f);
        RectF rectF = this.f319865L;
        rect.set(((int) rectF.left) + i, ((int) rectF.top) + i2, i + ((int) rectF.right), i2 + ((int) rectF.bottom));
        return new Info(rect, this.f319865L, this.f319863J, this.f319864K, this.f319868P, this.f319858E, this.f319857D, this.f319889s, this.f319872R0);
    }

    public float getMaxScale() {
        return this.f319879g;
    }

    public void onMeasure(int i, int i2) {
        if (!this.f319891u) {
            super.onMeasure(i, i2);
            return;
        }
        Drawable drawable = getDrawable();
        int v = m144500v(drawable);
        int u = m144499u(drawable);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i3 = layoutParams.width;
        if (i3 != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || v <= size) : mode == 0) {
            size = v;
        }
        int i4 = layoutParams.height;
        if (i4 != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || u <= size2) : mode2 == 0) {
            size2 = u;
        }
        if (this.f319896y) {
            float f = (float) v;
            float f2 = (float) u;
            float f3 = (float) size;
            float f4 = (float) size2;
            if (f / f2 != f3 / f4) {
                float f5 = f4 / f2;
                float f6 = f3 / f;
                if (f5 >= f6) {
                    f5 = f6;
                }
                if (i3 != -1) {
                    size = (int) (f * f5);
                }
                if (i4 != -1) {
                    size2 = (int) (f2 * f5);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.m105925i("PhotoView", "[onSizeChanged] w:%s, h:%s, oldw:%s, oldh:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        this.f319863J.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f319868P.set((float) (i / 2), (float) (i2 / 2));
        if (!this.f319892v) {
            this.f319892v = true;
            mo154813x();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: q */
    public boolean mo154799q(float f) {
        if (this.f319865L.width() <= this.f319863J.width()) {
            return false;
        }
        if (f >= 0.0f || ((float) Math.round(this.f319865L.left)) - f < this.f319863J.left) {
            return f <= 0.0f || ((float) Math.round(this.f319865L.right)) - f > this.f319863J.right;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo154800r(float f) {
        if (this.f319865L.height() <= this.f319863J.height()) {
            return false;
        }
        if (f >= 0.0f || ((float) Math.round(this.f319865L.top)) - f < this.f319863J.top) {
            return f <= 0.0f || ((float) Math.round(this.f319865L.bottom)) - f > this.f319863J.bottom;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo154801s(android.graphics.RectF r11) {
        /*
            r10 = this;
            float r0 = r11.width()
            android.graphics.RectF r1 = r10.f319863J
            float r1 = r1.width()
            r2 = 1
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0047
            float r0 = r11.left
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            android.graphics.RectF r1 = r10.f319863J
            float r1 = r1.width()
            float r6 = r11.width()
            float r1 = r1 - r6
            float r1 = r1 / r5
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 != 0) goto L_0x005e
            android.graphics.RectF r0 = r10.f319863J
            float r0 = r0.width()
            float r1 = r11.width()
            float r0 = r0 - r1
            float r0 = r0 / r5
            float r1 = r11.left
            float r0 = r0 - r1
            int r0 = (int) r0
            int r0 = -r0
            goto L_0x005f
        L_0x0047:
            float r0 = r11.left
            android.graphics.RectF r1 = r10.f319863J
            float r6 = r1.left
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0053
            float r0 = r0 - r6
            goto L_0x005c
        L_0x0053:
            float r0 = r11.right
            float r1 = r1.right
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x005e
            float r0 = r0 - r1
        L_0x005c:
            int r0 = (int) r0
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            float r1 = r11.height()
            android.graphics.RectF r6 = r10.f319863J
            float r6 = r6.height()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x009f
            float r1 = r11.top
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            android.graphics.RectF r6 = r10.f319863J
            float r6 = r6.height()
            float r7 = r11.height()
            float r6 = r6 - r7
            float r6 = r6 / r5
            float r1 = r1 - r6
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r2 = 0
        L_0x008b:
            if (r2 != 0) goto L_0x00b7
            android.graphics.RectF r1 = r10.f319863J
            float r1 = r1.height()
            float r2 = r11.height()
            float r1 = r1 - r2
            float r1 = r1 / r5
            float r11 = r11.top
            float r1 = r1 - r11
            int r11 = (int) r1
            int r11 = -r11
            goto L_0x00b8
        L_0x009f:
            float r1 = r11.top
            android.graphics.RectF r2 = r10.f319863J
            float r4 = r2.top
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ac
            float r1 = r1 - r4
            int r11 = (int) r1
            goto L_0x00b8
        L_0x00ac:
            float r11 = r11.bottom
            float r1 = r2.bottom
            int r2 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b7
            float r11 = r11 - r1
            int r11 = (int) r11
            goto L_0x00b8
        L_0x00b7:
            r11 = 0
        L_0x00b8:
            if (r0 != 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00e0
        L_0x00bc:
            com.tencent.mm.view.PhotoView$k r1 = r10.f319873S
            android.widget.OverScroller r1 = r1.f319918f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x00cd
            com.tencent.mm.view.PhotoView$k r1 = r10.f319873S
            android.widget.OverScroller r1 = r1.f319918f
            r1.abortAnimation()
        L_0x00cd:
            com.tencent.mm.view.PhotoView$k r1 = r10.f319873S
            int r7 = -r0
            int r8 = -r11
            r1.f319925p = r3
            r1.f319926q = r3
            android.widget.OverScroller r4 = r1.f319917e
            com.tencent.mm.view.PhotoView r11 = com.tencent.p014mm.view.PhotoView.this
            int r9 = r11.f319878f
            r5 = 0
            r6 = 0
            r4.startScroll(r5, r6, r7, r8, r9)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.PhotoView.mo154801s(android.graphics.RectF):void");
    }

    public void setAdjustViewBounds(boolean z) {
        super.setAdjustViewBounds(z);
        this.f319896y = z;
    }

    public void setAnimaDuring(int i) {
        this.f319878f = i;
    }

    public void setGlobalVisibleView(View view) {
        view.getGlobalVisibleRect(this.f319872R0);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        boolean z = false;
        if (drawable == null) {
            this.f319891u = false;
            return;
        }
        if ((drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) || ((drawable.getMinimumWidth() > 0 && drawable.getMinimumHeight() > 0) || (drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0))) {
            z = true;
        }
        if (z) {
            if (!this.f319891u) {
                this.f319891u = true;
            }
            mo154813x();
        }
    }

    public void setImageResource(int i) {
        Drawable drawable;
        try {
            drawable = getResources().getDrawable(i);
        } catch (Exception unused) {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f319873S.f319928s.f319913a = interpolator;
    }

    public void setMaxAnimFromWaiteTime(int i) {
        this.f319882j = i;
    }

    public void setMaxScale(float f) {
        this.f319879g = f;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f319888r = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f319886p0 = onLongClickListener;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != ImageView.ScaleType.MATRIX && scaleType != this.f319889s) {
            this.f319889s = scaleType;
            if (this.f319894x) {
                mo154813x();
            }
        }
    }

    /* renamed from: t */
    public final void mo154811t() {
        this.f319885p.set(this.f319883n);
        this.f319885p.postConcat(this.f319884o);
        setImageMatrix(this.f319885p);
        this.f319884o.mapRect(this.f319865L, this.f319864K);
        boolean z = true;
        this.f319855B = this.f319865L.width() > this.f319863J.width();
        if (this.f319865L.height() <= this.f319863J.height()) {
            z = false;
        }
        this.f319856C = z;
    }

    /* renamed from: w */
    public final void mo154812w() {
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (this.f319889s == null) {
            this.f319889s = ImageView.ScaleType.CENTER_INSIDE;
        }
        new GestureDetector(getContext(), this.f319870Q0);
        new ScaleGestureDetector(getContext(), this.f319895x0);
        float f = getResources().getDisplayMetrics().density;
        this.f319880h = (int) (30.0f * f);
        this.f319881i = (int) (f * 140.0f);
        this.f319878f = 200;
        this.f319879g = 3.0f;
    }

    /* renamed from: x */
    public final void mo154813x() {
        if (this.f319891u && this.f319892v) {
            RectF rectF = this.f319874T;
            if (rectF != null) {
                rectF.setEmpty();
            }
            this.f319883n.reset();
            this.f319884o.reset();
            this.f319885p.reset();
            this.f319887q.reset();
            this.f319898z = false;
            Drawable drawable = getDrawable();
            int width = getWidth();
            int height = getHeight();
            int v = m144500v(drawable);
            int u = m144499u(drawable);
            float f = (float) v;
            float f2 = (float) u;
            this.f319864K.set(0.0f, 0.0f, f, f2);
            int i = (width - v) / 2;
            int i2 = (height - u) / 2;
            float f3 = v > width ? ((float) width) / f : 1.0f;
            float f4 = u > height ? ((float) height) / f2 : 1.0f;
            if (f3 >= f4) {
                f3 = f4;
            }
            this.f319883n.reset();
            this.f319883n.postTranslate((float) i, (float) i2);
            Matrix matrix = this.f319883n;
            PointF pointF = this.f319868P;
            matrix.postScale(f3, f3, pointF.x, pointF.y);
            this.f319883n.mapRect(this.f319864K);
            this.f319861H = this.f319864K.width() / 2.0f;
            this.f319862I = this.f319864K.height() / 2.0f;
            this.f319869Q.set(this.f319868P);
            this.f319871R.set(this.f319869Q);
            mo154811t();
            switch (C106845e.f319911a[this.f319889s.ordinal()]) {
                case 1:
                    if (this.f319891u && this.f319892v) {
                        Drawable drawable2 = getDrawable();
                        int v2 = m144500v(drawable2);
                        int u2 = m144499u(drawable2);
                        float f5 = (float) v2;
                        if (f5 > this.f319863J.width() || ((float) u2) > this.f319863J.height()) {
                            float width2 = f5 / this.f319865L.width();
                            float height2 = ((float) u2) / this.f319865L.height();
                            if (width2 <= height2) {
                                width2 = height2;
                            }
                            this.f319858E = width2;
                            Matrix matrix2 = this.f319884o;
                            PointF pointF2 = this.f319868P;
                            matrix2.postScale(width2, width2, pointF2.x, pointF2.y);
                            mo154811t();
                            mo154815z();
                            break;
                        }
                    }
                case 2:
                    if (this.f319865L.width() < this.f319863J.width() || this.f319865L.height() < this.f319863J.height()) {
                        float width3 = this.f319863J.width() / this.f319865L.width();
                        float height3 = this.f319863J.height() / this.f319865L.height();
                        if (width3 <= height3) {
                            width3 = height3;
                        }
                        this.f319858E = width3;
                        Matrix matrix3 = this.f319884o;
                        PointF pointF3 = this.f319868P;
                        matrix3.postScale(width3, width3, pointF3.x, pointF3.y);
                        mo154811t();
                        mo154815z();
                        break;
                    }
                case 3:
                    if (this.f319865L.width() > this.f319863J.width() || this.f319865L.height() > this.f319863J.height()) {
                        float width4 = this.f319863J.width() / this.f319865L.width();
                        float height4 = this.f319863J.height() / this.f319865L.height();
                        if (width4 >= height4) {
                            width4 = height4;
                        }
                        this.f319858E = width4;
                        Matrix matrix4 = this.f319884o;
                        PointF pointF4 = this.f319868P;
                        matrix4.postScale(width4, width4, pointF4.x, pointF4.y);
                        mo154811t();
                        mo154815z();
                        break;
                    }
                case 4:
                    mo154814y();
                    break;
                case 5:
                    mo154814y();
                    float f6 = -this.f319865L.top;
                    this.f319884o.postTranslate(0.0f, f6);
                    mo154811t();
                    mo154815z();
                    this.f319860G = (int) (((float) this.f319860G) + f6);
                    break;
                case 6:
                    mo154814y();
                    float f7 = this.f319863J.bottom - this.f319865L.bottom;
                    this.f319860G = (int) (((float) this.f319860G) + f7);
                    this.f319884o.postTranslate(0.0f, f7);
                    mo154811t();
                    mo154815z();
                    break;
                case 7:
                    float width5 = this.f319863J.width() / this.f319865L.width();
                    float height5 = this.f319863J.height() / this.f319865L.height();
                    Matrix matrix5 = this.f319884o;
                    PointF pointF5 = this.f319868P;
                    matrix5.postScale(width5, height5, pointF5.x, pointF5.y);
                    mo154811t();
                    mo154815z();
                    break;
            }
            this.f319894x = true;
            if (this.f319875U != null && System.currentTimeMillis() - this.f319876V < ((long) this.f319882j)) {
                Info info = this.f319875U;
                if (this.f319894x) {
                    this.f319884o.reset();
                    mo154811t();
                    this.f319858E = 1.0f;
                    this.f319859F = 0;
                    this.f319860G = 0;
                    this.f319872R0.set(info.f319904i);
                    Info info2 = getInfo();
                    float width6 = info.f319900e.width() / info2.f319900e.width();
                    float height6 = info.f319900e.height() / info2.f319900e.height();
                    if (width6 >= height6) {
                        width6 = height6;
                    }
                    RectF rectF2 = info.f319899d;
                    float width7 = rectF2.left + (rectF2.width() / 2.0f);
                    RectF rectF3 = info.f319899d;
                    float height7 = rectF3.top + (rectF3.height() / 2.0f);
                    RectF rectF4 = info2.f319899d;
                    float width8 = rectF4.left + (rectF4.width() / 2.0f);
                    RectF rectF5 = info2.f319899d;
                    float height8 = rectF5.top + (rectF5.height() / 2.0f);
                    this.f319884o.reset();
                    float f8 = width7 - width8;
                    float f9 = height7 - height8;
                    this.f319884o.postTranslate(f8, f9);
                    this.f319884o.postScale(width6, width6, width7, height7);
                    this.f319884o.postRotate(info.f319906n, width7, height7);
                    mo154811t();
                    this.f319869Q.set(width7, height7);
                    this.f319871R.set(width7, height7);
                    C106851k kVar = this.f319873S;
                    kVar.f319925p = 0;
                    kVar.f319926q = 0;
                    kVar.f319917e.startScroll(0, 0, (int) (-f8), (int) (-f9), PhotoView.this.f319878f);
                    C106851k kVar2 = this.f319873S;
                    kVar2.f319919g.startScroll((int) (width6 * 10000.0f), 0, (int) ((1.0f - width6) * 10000.0f), 0, PhotoView.this.f319878f);
                    C106851k kVar3 = this.f319873S;
                    int i3 = (int) info.f319906n;
                    kVar3.f319921i.startScroll(i3, 0, 0 - i3, 0, PhotoView.this.f319878f);
                    if (info.f319901f.width() < info.f319900e.width() || info.f319901f.height() < info.f319900e.height()) {
                        float width9 = info.f319901f.width() / info.f319900e.width();
                        float height9 = info.f319901f.height() / info.f319900e.height();
                        if (width9 > 1.0f) {
                            width9 = 1.0f;
                        }
                        if (height9 > 1.0f) {
                            height9 = 1.0f;
                        }
                        ImageView.ScaleType scaleType = info.f319907o;
                        C106846f jVar = scaleType == ImageView.ScaleType.FIT_START ? new C106850j() : scaleType == ImageView.ScaleType.FIT_END ? new C106847g() : new C106849i();
                        C106851k kVar4 = this.f319873S;
                        kVar4.f319920h.startScroll((int) (width9 * 10000.0f), (int) (height9 * 10000.0f), (int) ((1.0f - width9) * 10000.0f), (int) ((1.0f - height9) * 10000.0f), this.f319878f / 3);
                        kVar4.f319922j = jVar;
                        Matrix matrix6 = this.f319887q;
                        RectF rectF6 = this.f319865L;
                        matrix6.setScale(width9, height9, (rectF6.left + rectF6.right) / 2.0f, jVar.mo154832a());
                        this.f319887q.mapRect(this.f319873S.f319927r, this.f319865L);
                        this.f319874T = this.f319873S.f319927r;
                    }
                    C106851k kVar5 = this.f319873S;
                    kVar5.f319916d = true;
                    PhotoView.this.post(kVar5);
                } else {
                    this.f319875U = info;
                    this.f319876V = System.currentTimeMillis();
                }
            }
            this.f319875U = null;
        }
    }

    /* renamed from: y */
    public final void mo154814y() {
        if (this.f319865L.width() < this.f319863J.width()) {
            float width = this.f319863J.width() / this.f319865L.width();
            this.f319858E = width;
            Matrix matrix = this.f319884o;
            PointF pointF = this.f319868P;
            matrix.postScale(width, width, pointF.x, pointF.y);
            mo154811t();
            mo154815z();
        }
    }

    /* renamed from: z */
    public final void mo154815z() {
        Drawable drawable = getDrawable();
        this.f319864K.set(0.0f, 0.0f, (float) m144500v(drawable), (float) m144499u(drawable));
        this.f319883n.set(this.f319885p);
        this.f319883n.mapRect(this.f319864K);
        this.f319861H = this.f319864K.width() / 2.0f;
        this.f319862I = this.f319864K.height() / 2.0f;
        this.f319858E = 1.0f;
        this.f319859F = 0;
        this.f319860G = 0;
        this.f319884o.reset();
    }

    /* renamed from: com.tencent.mm.view.PhotoView$Info */
    public static class Info implements Parcelable {
        public static final Parcelable.Creator<Info> CREATOR = new C106840a();

        /* renamed from: d */
        public RectF f319899d = new RectF();

        /* renamed from: e */
        public RectF f319900e = new RectF();

        /* renamed from: f */
        public RectF f319901f = new RectF();

        /* renamed from: g */
        public RectF f319902g = new RectF();

        /* renamed from: h */
        public PointF f319903h = new PointF();

        /* renamed from: i */
        public Rect f319904i = new Rect();

        /* renamed from: j */
        public float f319905j;

        /* renamed from: n */
        public float f319906n;

        /* renamed from: o */
        public ImageView.ScaleType f319907o;

        /* renamed from: com.tencent.mm.view.PhotoView$Info$a */
        public class C106840a implements Parcelable.Creator<Info> {
            public Object createFromParcel(Parcel parcel) {
                return new Info(parcel);
            }

            public Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(Rect rect, RectF rectF, RectF rectF2, RectF rectF3, PointF pointF, float f, float f2, ImageView.ScaleType scaleType, Rect rect2) {
            this.f319899d.set(rect);
            this.f319900e.set(rectF);
            this.f319901f.set(rectF2);
            this.f319905j = f;
            this.f319907o = scaleType;
            this.f319906n = f2;
            this.f319902g.set(rectF3);
            this.f319903h.set(pointF);
            this.f319904i.set(rect2);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Info{mRect=" + this.f319899d + ", mImgRect=" + this.f319900e + ", mWidgetRect=" + this.f319901f + ", mBaseRect=" + this.f319902g + ", mScale=" + this.f319905j + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f319899d, i);
            parcel.writeParcelable(this.f319900e, i);
            parcel.writeParcelable(this.f319901f, i);
            parcel.writeParcelable(this.f319902g, i);
            parcel.writeParcelable(this.f319903h, i);
            parcel.writeParcelable(this.f319904i, i);
            parcel.writeFloat(this.f319905j);
            parcel.writeFloat(this.f319906n);
            ImageView.ScaleType scaleType = this.f319907o;
            parcel.writeInt(scaleType == null ? -1 : scaleType.ordinal());
        }

        public Info(Parcel parcel) {
            ImageView.ScaleType scaleType;
            this.f319899d = (RectF) parcel.readParcelable(RectF.class.getClassLoader());
            this.f319900e = (RectF) parcel.readParcelable(RectF.class.getClassLoader());
            this.f319901f = (RectF) parcel.readParcelable(RectF.class.getClassLoader());
            this.f319902g = (RectF) parcel.readParcelable(RectF.class.getClassLoader());
            this.f319903h = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
            this.f319904i = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
            this.f319905j = parcel.readFloat();
            this.f319906n = parcel.readFloat();
            int readInt = parcel.readInt();
            if (readInt == -1) {
                scaleType = null;
            } else {
                scaleType = ImageView.ScaleType.values()[readInt];
            }
            this.f319907o = scaleType;
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C106841a(this);
        this.f319895x0 = new C106842b();
        this.f319897y0 = new C106843c();
        this.f319870Q0 = new C106844d();
        this.f319872R0 = new Rect();
        mo154812w();
    }
}
