package x82;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XFileSdk;
import cq3.C106958d;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import h90.C98324b;
import rx3.C13598b0;
import t82.C110949e;
import t82.C110952f;
import zp3.C112659d0;

/* renamed from: x82.b */
public final class C112079b {

    /* renamed from: a */
    public Context f335531a;

    /* renamed from: b */
    public C112075a f335532b;

    /* renamed from: c */
    public C112095g f335533c;

    /* renamed from: d */
    public FrameLayout f335534d = new FrameLayout(this.f335531a);

    /* renamed from: e */
    public int f335535e = -1;

    /* renamed from: f */
    public int f335536f = -1;

    /* renamed from: g */
    public XFileSdk.ViewStatus f335537g;

    /* renamed from: h */
    public String f335538h;

    /* renamed from: i */
    public String f335539i;

    /* renamed from: j */
    public int f335540j;

    /* renamed from: k */
    public int f335541k;

    /* renamed from: l */
    public C110952f f335542l;

    /* renamed from: m */
    public C32226l<? super Integer, C13598b0> f335543m;

    /* renamed from: n */
    public boolean f335544n;

    public C112079b(Context context, C112075a aVar, C112095g gVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "statusManager");
        this.f335531a = context;
        this.f335532b = aVar;
        this.f335533c = gVar;
        C110952f fVar = new C110952f(this.f335531a, this.f335532b, this.f335533c);
        this.f335542l = fVar;
        fVar.setDrawingEnable(false);
        FrameLayout frameLayout = this.f335534d;
        if (frameLayout != null) {
            frameLayout.addView(this.f335542l);
        }
        FrameLayout frameLayout2 = this.f335534d;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo163776a(Canvas canvas) {
        Bitmap bitmap;
        C110949e multiTalkEditPhotoWrapper;
        C112659d0 d0Var;
        C87412m.m108594g(canvas, "canvas");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        C110952f fVar = this.f335542l;
        int height = fVar != null ? fVar.getHeight() : 0;
        C110952f fVar2 = this.f335542l;
        float height2 = (float) (height - ((fVar2 == null || (multiTalkEditPhotoWrapper = fVar2.getMultiTalkEditPhotoWrapper()) == null || (d0Var = multiTalkEditPhotoWrapper.f331848j) == null) ? 0 : d0Var.getHeight()));
        C110952f fVar3 = this.f335542l;
        if (fVar3 != null) {
            C112659d0 d0Var2 = fVar3.f331863o.f331848j;
            int width = d0Var2 != null ? d0Var2.getWidth() : 0;
            C112659d0 d0Var3 = fVar3.f331863o.f331848j;
            int height3 = d0Var3 != null ? d0Var3.getHeight() : 0;
            if (width <= 0 || height3 <= 0) {
                bitmap = null;
            } else {
                if (!(fVar3.f331865q != null && fVar3.f331866r == width && fVar3.f331867s == height3)) {
                    fVar3.f331866r = width;
                    fVar3.f331867s = height3;
                    fVar3.f331865q = Bitmap.createBitmap(width, height3, Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap2 = fVar3.f331865q;
                C87412m.m108591d(bitmap2);
                Canvas canvas2 = new Canvas(bitmap2);
                canvas2.drawPaint(new Paint());
                canvas2.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                C112659d0 d0Var4 = fVar3.f331863o.f331848j;
                if (d0Var4 != null) {
                    d0Var4.draw(canvas2);
                }
                bitmap = fVar3.f331865q;
            }
            if (bitmap != null) {
                Matrix matrix = new Matrix();
                matrix.postTranslate(0.0f, height2 / ((float) 2));
                canvas.drawBitmap(bitmap, matrix, paint);
            }
        }
    }

    /* renamed from: b */
    public final void mo163777b(C98324b bVar, C32224a<C13598b0> aVar) {
        C106958d dVar;
        C87412m.m108594g(bVar, "config");
        C110952f fVar = this.f335542l;
        if (fVar != null) {
            C110949e eVar = fVar.f331863o;
            fVar.f331859h.mo163771b();
            eVar.getClass();
            if (!eVar.f331853r) {
                eVar.mo162630a(false, bVar);
            } else {
                Object[] objArr = new Object[1];
                Rect rect = bVar.f288194o;
                objArr[0] = rect != null ? rect.toShortString() : null;
                Log.printInfoStack("MicroMsg.MultiTalkEditPhotoContainerPlugin", "config is %s", objArr);
            }
            C112659d0 d0Var = eVar.f331848j;
            if (d0Var != null && (dVar = (C106958d) d0Var.getBaseBoardView()) != null) {
                dVar.f320132e.reset();
                dVar.mo157327a();
                dVar.invalidate();
                dVar.f320169F = aVar;
                dVar.f320170G = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo163778c(float f, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = (int) (((float) this.f335535e) * f);
        int i9 = (int) (((float) this.f335536f) * f);
        int i15 = 0;
        if (z) {
            FrameLayout frameLayout = this.f335534d;
            C87412m.m108591d(frameLayout);
            if (i8 <= frameLayout.getMeasuredWidth()) {
                FrameLayout frameLayout2 = this.f335534d;
                C87412m.m108591d(frameLayout2);
                i7 = (frameLayout2.getMeasuredWidth() - i8) / 2;
            } else if (i > 0) {
                i7 = 0;
            } else {
                int i16 = i + i8;
                FrameLayout frameLayout3 = this.f335534d;
                C87412m.m108591d(frameLayout3);
                if (i16 < frameLayout3.getMeasuredWidth()) {
                    FrameLayout frameLayout4 = this.f335534d;
                    C87412m.m108591d(frameLayout4);
                    i7 = frameLayout4.getMeasuredWidth() - i8;
                } else {
                    i7 = i;
                }
            }
            FrameLayout frameLayout5 = this.f335534d;
            C87412m.m108591d(frameLayout5);
            if (i9 <= frameLayout5.getMeasuredHeight()) {
                FrameLayout frameLayout6 = this.f335534d;
                C87412m.m108591d(frameLayout6);
                i2 = (frameLayout6.getMeasuredHeight() - i9) / 2;
            } else if (i2 > 0) {
                i4 = i7;
                i3 = 0;
            } else {
                int i17 = i2 + i9;
                FrameLayout frameLayout7 = this.f335534d;
                C87412m.m108591d(frameLayout7);
                if (i17 < frameLayout7.getMeasuredHeight()) {
                    FrameLayout frameLayout8 = this.f335534d;
                    C87412m.m108591d(frameLayout8);
                    i2 = frameLayout8.getMeasuredHeight() - i9;
                }
            }
            i3 = i2;
            i4 = i7;
        } else {
            i4 = i;
            i3 = i2;
        }
        if (z2) {
            XFileSdk.ViewStatus viewStatus = this.f335537g;
            if (viewStatus != null) {
                i15 = viewStatus.transX;
            }
            int i18 = i - i15;
            if (i18 < 0) {
                if (Math.abs(i18) <= this.f335535e / 4 || (i6 = this.f335540j) >= this.f335541k - 1) {
                    XFileSdk.setViewToStatus(this.f335538h, this.f335539i, -1, f, i4, i3);
                    return;
                }
                XFileSdk.setViewToStatus(this.f335538h, this.f335539i, i6 + 1, f, i4, i3);
                C32226l<? super Integer, C13598b0> lVar = this.f335543m;
                if (lVar != null) {
                    C13598b0 invoke = lVar.invoke(Integer.valueOf(this.f335540j + 1));
                }
            } else if (Math.abs(i18) <= this.f335535e / 4 || (i5 = this.f335540j) <= 0) {
                XFileSdk.setViewToStatus(this.f335538h, this.f335539i, -1, f, i4, i3);
            } else {
                XFileSdk.setViewToStatus(this.f335538h, this.f335539i, i5 - 1, f, i4, i3);
                C32226l<? super Integer, C13598b0> lVar2 = this.f335543m;
                if (lVar2 != null) {
                    C13598b0 invoke2 = lVar2.invoke(Integer.valueOf(this.f335540j - 1));
                }
            }
        }
    }
}
