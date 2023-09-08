package ai2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import bi2.C92262a;
import bi2.C92264c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.item.EditorItemContainer;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fi2.C107552a;
import fi2.C107554b;
import fy3.C32227p;
import gi2.C107810a;
import gi2.C107818f;
import gi2.C98129b;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: ai2.b */
public abstract class C92008b extends View implements C92015i, C107818f {

    /* renamed from: A */
    public final float[] f263408A;

    /* renamed from: B */
    public boolean f263409B;

    /* renamed from: d */
    public final C107810a f263410d;

    /* renamed from: e */
    public EditorItemContainer.C94437a f263411e;

    /* renamed from: f */
    public final C107554b f263412f;

    /* renamed from: g */
    public final int f263413g = C75044y4.m89991c(MMApplicationContext.getContext());

    /* renamed from: h */
    public final Rect f263414h = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: i */
    public final Rect f263415i = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: j */
    public final Paint f263416j;

    /* renamed from: n */
    public CharSequence f263417n;

    /* renamed from: o */
    public float f263418o;

    /* renamed from: p */
    public int f263419p;

    /* renamed from: q */
    public int f263420q;

    /* renamed from: r */
    public int f263421r;

    /* renamed from: s */
    public C92019m f263422s;

    /* renamed from: t */
    public C92011d f263423t;

    /* renamed from: u */
    public Bitmap f263424u;

    /* renamed from: v */
    public Matrix f263425v;

    /* renamed from: w */
    public float f263426w;

    /* renamed from: x */
    public float f263427x;

    /* renamed from: y */
    public boolean f263428y;

    /* renamed from: z */
    public final int f263429z;

    /* renamed from: ai2.b$a */
    public static final class C92009a extends C87413o implements C32227p<Matrix, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92008b f263430d;

        /* renamed from: e */
        public final /* synthetic */ MotionEvent f263431e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92009a(C92008b bVar, MotionEvent motionEvent) {
            super(2);
            this.f263430d = bVar;
            this.f263431e = motionEvent;
        }

        public Object invoke(Object obj, Object obj2) {
            Matrix matrix = (Matrix) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(matrix, "m");
            this.f263430d.getTouchTracker().mo158004h(matrix);
            this.f263430d.postInvalidate();
            if (booleanValue) {
                this.f263430d.getTouchTracker().mo157997a(this.f263431e);
                this.f263430d.bringToFront();
                C92008b bVar = this.f263430d;
                EditorItemContainer.C94437a aVar = bVar.f263411e;
                if (aVar != null) {
                    aVar.mo129926a(bVar, this.f263431e);
                }
                if (!this.f263430d.getTouchMoved()) {
                    this.f263430d.performClick();
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C92008b(Context context) {
        super(context);
        C107554b bVar = new C107554b();
        this.f263412f = bVar;
        Paint paint = new Paint();
        this.f263416j = paint;
        this.f263418o = getResources().getDimension(C0966R.dimen.f357021a32);
        this.f263423t = C92011d.TEXT;
        this.f263408A = new float[2];
        bVar.f321817r = 0.5f;
        bVar.f321816q = 3.0f;
        Resources resources = getResources();
        C87412m.m108593f(resources, "resources");
        this.f263410d = new C107810a(resources);
        this.f263429z = ViewConfiguration.get(context).getScaledTouchSlop();
        paint.setAntiAlias(true);
        this.f263409B = true;
    }

    /* renamed from: a */
    public boolean mo53770a(long j) {
        return C107818f.C107819a.m146079c(this, j);
    }

    /* renamed from: d */
    public C92007a mo53771d() {
        if (this.f263424u == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(this.f263412f.f321806g);
        C92011d dVar = this.f263423t;
        if (dVar == C92011d.TEXT || dVar == C92011d.TIP) {
            return new C92025s(this.f263417n, this.f263419p, this.f263420q, this.f263421r, matrix);
        }
        C92019m mVar = this.f263422s;
        C87412m.m108591d(mVar);
        String str = mVar.f263459g;
        C92019m mVar2 = this.f263422s;
        C87412m.m108591d(mVar2);
        String str2 = mVar2.f263460h;
        C92019m mVar3 = this.f263422s;
        C87412m.m108591d(mVar3);
        float f = mVar3.f263461i;
        C92019m mVar4 = this.f263422s;
        C87412m.m108591d(mVar4);
        return new C92019m(str, str2, f, mVar4.f263462j, matrix);
    }

    /* renamed from: e */
    public boolean mo53772e(String str) {
        return C107818f.C107819a.m146078b(this, str);
    }

    /* renamed from: f */
    public void mo53773f(Rect rect, float f) {
        C87412m.m108594g(rect, "displayRect");
        this.f263415i.set(rect);
        this.f263412f.f321806g.postTranslate(((float) rect.width()) / 2.0f, ((float) rect.height()) * f);
    }

    public final Bitmap getBitmap() {
        return this.f263424u;
    }

    public final int getColor() {
        return this.f263419p;
    }

    public float[] getContentBoundary() {
        return (float[]) this.f263412f.f321813n.clone();
    }

    public final Rect getDisplayRect() {
        return this.f263415i;
    }

    public RectF getDrawRect() {
        float[] fArr = this.f263412f.f321813n;
        return new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public abstract /* synthetic */ C92007a getEditorData();

    public final boolean getEnableNotify() {
        return this.f263409B;
    }

    public final C92019m getLocation() {
        return this.f263422s;
    }

    public final int getMarginBottom() {
        return this.f263421r;
    }

    public final int getNavigateBarHeight() {
        return this.f263413g;
    }

    public Rect getSafeArea() {
        Rect rect = this.f263412f.f321807h;
        return rect == null ? new Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    public final C92011d getSourceDataType() {
        return this.f263423t;
    }

    public final CharSequence getText() {
        return this.f263417n;
    }

    public final int getTextBg() {
        return this.f263420q;
    }

    public final float getTextSize() {
        return this.f263418o;
    }

    public final float getTouchDownX() {
        return this.f263426w;
    }

    public final float getTouchDownY() {
        return this.f263427x;
    }

    public final boolean getTouchMoved() {
        return this.f263428y;
    }

    public final int getTouchSlop() {
        return this.f263429z;
    }

    public final C107554b getTouchTracker() {
        return this.f263412f;
    }

    public abstract /* synthetic */ C98129b getType();

    public final Rect getValidRect() {
        return this.f263414h;
    }

    public final Matrix getViewMatrix() {
        return this.f263425v;
    }

    /* renamed from: h */
    public boolean mo53780h() {
        return this.f263409B;
    }

    /* renamed from: i */
    public C92262a mo53781i(Matrix matrix) {
        if (this.f263424u == null) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.f263412f.f321806g);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        return new C92264c(this.f263424u, matrix2);
    }

    /* renamed from: m */
    public void mo53782m(Rect rect, int i) {
        C87412m.m108594g(rect, "safeRect");
        C107554b bVar = this.f263412f;
        bVar.f321807h = rect;
        bVar.f321808i = C76577a.m92151b(getContext(), i);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.save();
        Matrix matrix = this.f263425v;
        if (matrix != null) {
            canvas.setMatrix(matrix);
        } else {
            canvas.setMatrix(this.f263412f.f321806g);
        }
        if (isActivated()) {
            this.f263410d.draw(canvas);
        }
        canvas.restore();
        canvas.clipRect(this.f263414h);
        canvas.save();
        Matrix matrix2 = this.f263425v;
        if (matrix2 != null) {
            canvas.setMatrix(matrix2);
        } else {
            canvas.setMatrix(this.f263412f.f321806g);
        }
        Bitmap bitmap = this.f263424u;
        if (bitmap != null) {
            C87412m.m108591d(bitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f263416j);
        }
        canvas.restore();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C87412m.m108594g(motionEvent, "event");
        boolean z2 = true;
        if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
            z = true;
        } else {
            z = this.f263412f.mo157997a(motionEvent);
            if (z) {
                bringToFront();
                EditorItemContainer.C94437a aVar = this.f263411e;
                if (aVar != null) {
                    aVar.mo129926a(this, motionEvent);
                }
                postInvalidate();
            }
        }
        if (z) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f263426w = motionEvent.getX();
                this.f263427x = motionEvent.getY();
                this.f263428y = false;
                float[] fArr = this.f263408A;
                C107554b bVar = this.f263412f;
                fArr[0] = ((float) bVar.f321815p) / 2.0f;
                fArr[1] = ((float) bVar.f321814o) / 2.0f;
                bVar.f321806g.mapPoints(fArr);
            } else if (actionMasked == 1) {
                C107552a aVar2 = new C107552a();
                Rect rect = this.f263414h;
                C107554b bVar2 = this.f263412f;
                aVar2.f321789c = bVar2.f321817r;
                aVar2.f321790d = bVar2.f321816q;
                aVar2.f321788b = new float[]{((float) bVar2.f321815p) / 2.0f, ((float) bVar2.f321814o) / 2.0f};
                aVar2.f321787a = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
                C107554b bVar3 = this.f263412f;
                float[] fArr2 = {((float) bVar3.f321815p) / 2.0f, ((float) bVar3.f321814o) / 2.0f};
                bVar3.f321806g.mapPoints(fArr2);
                if (!aVar2.f321787a.contains(fArr2[0], fArr2[1])) {
                    float[] fArr3 = this.f263408A;
                    float f = fArr3[0];
                    float f2 = fArr3[1];
                    aVar2.f321787a = new RectF(f, f2, f, f2);
                }
                aVar2.mo157995a(this.f263412f.f321806g, new C92009a(this, motionEvent));
            } else if (actionMasked == 2) {
                float max = Math.max(Math.abs(motionEvent.getX() - this.f263426w), Math.abs(motionEvent.getY() - this.f263427x));
                if (!this.f263428y) {
                    if (max <= ((float) this.f263429z)) {
                        z2 = false;
                    }
                    this.f263428y = z2;
                }
            }
        }
        return z;
    }

    public final void setBitmap(Bitmap bitmap) {
        this.f263424u = bitmap;
        if (bitmap != null) {
            this.f263412f.f321815p = bitmap.getWidth();
            this.f263412f.f321814o = bitmap.getHeight();
            this.f263412f.f321806g.preTranslate(((float) (-bitmap.getWidth())) / 2.0f, ((float) (-bitmap.getHeight())) / 2.0f);
            this.f263410d.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            C107554b bVar = this.f263412f;
            float[] fArr = {0.0f, 0.0f, (float) bitmap.getWidth(), 0.0f, 0.0f, (float) bitmap.getHeight(), (float) bitmap.getWidth(), (float) bitmap.getHeight()};
            bVar.getClass();
            bVar.f321811l = fArr;
        }
    }

    public final void setColor(int i) {
        this.f263419p = i;
    }

    public final void setEnableNotify(boolean z) {
        this.f263409B = z;
    }

    public final void setLocation(C92019m mVar) {
        this.f263422s = mVar;
    }

    public final void setMarginBottom(int i) {
        this.f263421r = i;
    }

    public final void setSourceDataType(C92011d dVar) {
        C87412m.m108594g(dVar, "<set-?>");
        this.f263423t = dVar;
    }

    public final void setStateResolve(EditorItemContainer.C94437a aVar) {
        C87412m.m108594g(aVar, "stateResolve");
        this.f263411e = aVar;
    }

    public final void setText(CharSequence charSequence) {
        this.f263417n = charSequence;
    }

    public final void setTextBg(int i) {
        this.f263420q = i;
    }

    public final void setTextSize(float f) {
        this.f263418o = f;
    }

    public final void setTouchDownX(float f) {
        this.f263426w = f;
    }

    public final void setTouchDownY(float f) {
        this.f263427x = f;
    }

    public final void setTouchMoved(boolean z) {
        this.f263428y = z;
    }

    public void setValidArea(Rect rect) {
        C87412m.m108594g(rect, "validRect");
        this.f263414h.set(rect);
    }

    public final void setViewMatrix(Matrix matrix) {
        this.f263425v = matrix;
        if (matrix != null) {
            C107554b bVar = this.f263412f;
            bVar.getClass();
            bVar.f321806g = matrix;
            Canvas canvas = new Canvas();
            canvas.save();
            if (this.f263425v != null) {
                canvas.setMatrix(matrix);
            }
            if (isActivated()) {
                this.f263410d.draw(canvas);
            }
            Bitmap bitmap = this.f263424u;
            if (bitmap != null) {
                C87412m.m108591d(bitmap);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        }
    }
}
