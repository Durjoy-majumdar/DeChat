package ai2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import bi2.C92262a;
import bi2.C92268i;
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
import rx3.C13598b0;

/* renamed from: ai2.p */
public final class C26815p extends View implements C92015i, C107818f {

    /* renamed from: d */
    public final C107810a f74560d;

    /* renamed from: e */
    public EditorItemContainer.C94437a f74561e;

    /* renamed from: f */
    public final C107554b f74562f;

    /* renamed from: g */
    public final Rect f74563g = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: h */
    public final Rect f74564h = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: i */
    public final Rect f74565i = new Rect();

    /* renamed from: j */
    public C92023q f74566j;

    /* renamed from: n */
    public boolean f74567n;

    /* renamed from: o */
    public final float[] f74568o;

    /* renamed from: ai2.p$a */
    public static final class C26816a extends C87413o implements C32227p<Matrix, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C26815p f74569d;

        /* renamed from: e */
        public final /* synthetic */ MotionEvent f74570e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26816a(C26815p pVar, MotionEvent motionEvent) {
            super(2);
            this.f74569d = pVar;
            this.f74570e = motionEvent;
        }

        public Object invoke(Object obj, Object obj2) {
            Matrix matrix = (Matrix) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(matrix, "m");
            C26815p pVar = this.f74569d;
            if (pVar.f74567n) {
                pVar.getTouchTracker().mo158004h(matrix);
                C26815p pVar2 = this.f74569d;
                C92023q qVar = pVar2.f74566j;
                if (qVar != null) {
                    qVar.mo125995v(pVar2.getTouchTracker().f321806g);
                }
                this.f74569d.postInvalidate();
                if (booleanValue) {
                    this.f74569d.getTouchTracker().mo157997a(this.f74570e);
                    this.f74569d.bringToFront();
                    C26815p pVar3 = this.f74569d;
                    EditorItemContainer.C94437a aVar = pVar3.f74561e;
                    if (aVar != null) {
                        aVar.mo129926a(pVar3, this.f74570e);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26815p(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C107554b bVar = new C107554b();
        this.f74562f = bVar;
        Paint paint = new Paint();
        this.f74567n = true;
        this.f74568o = new float[2];
        bVar.f321817r = 0.5f;
        bVar.f321816q = 3.0f;
        Resources resources = getResources();
        C87412m.m108593f(resources, "resources");
        this.f74560d = new C107810a(resources);
        paint.setColor(822083583);
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public boolean mo53770a(long j) {
        return C107818f.C107819a.m146079c(this, j);
    }

    /* renamed from: d */
    public C92007a mo53771d() {
        C92023q qVar = this.f74566j;
        if (qVar != null) {
            qVar.f263407f.set(this.f74562f.f321806g);
        }
        return this.f74566j;
    }

    /* renamed from: e */
    public boolean mo53772e(String str) {
        return C107818f.C107819a.m146078b(this, str);
    }

    /* renamed from: f */
    public void mo53773f(Rect rect, float f) {
        C87412m.m108594g(rect, "displayRect");
        this.f74564h.set(rect);
        this.f74562f.f321806g.postTranslate(((float) rect.width()) / 2.0f, ((float) rect.height()) * f);
        C92023q qVar = this.f74566j;
        if (qVar != null) {
            qVar.mo125995v(this.f74562f.f321806g);
        }
    }

    public float[] getContentBoundary() {
        return (float[]) this.f74562f.f321813n.clone();
    }

    public RectF getDrawRect() {
        float[] fArr = this.f74562f.f321813n;
        return new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public C92007a getEditorData() {
        return this.f74566j;
    }

    public Rect getSafeArea() {
        Rect rect = this.f74562f.f321807h;
        return rect == null ? new Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    public final C107554b getTouchTracker() {
        return this.f74562f;
    }

    public C98129b getType() {
        return C98129b.EditItemTypePagSticker;
    }

    /* renamed from: h */
    public boolean mo53780h() {
        return true;
    }

    /* renamed from: i */
    public C92262a mo53781i(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.f74562f.f321806g);
        matrix2.postTranslate(((float) (-(this.f74564h.width() - this.f74563g.width()))) / 2.0f, ((float) (-(this.f74564h.height() - this.f74563g.height()))) / 2.0f);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        return new C92268i(matrix2);
    }

    /* renamed from: m */
    public void mo53782m(Rect rect, int i) {
        C87412m.m108594g(rect, "safeRect");
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.setMatrix(this.f74562f.f321806g);
        if (isActivated()) {
            this.f74560d.draw(canvas);
        }
        canvas.restore();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C92018l lVar;
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
            z = true;
        } else {
            z = this.f74562f.mo157997a(motionEvent);
            if (z) {
                C92023q qVar = this.f74566j;
                if (qVar != null) {
                    qVar.mo125995v(this.f74562f.f321806g);
                }
                bringToFront();
                C92023q qVar2 = this.f74566j;
                if (!(qVar2 == null || (lVar = qVar2.f263519r) == null)) {
                    lVar.mo125917b();
                }
                EditorItemContainer.C94437a aVar = this.f74561e;
                if (aVar != null) {
                    aVar.mo129926a(this, motionEvent);
                }
                postInvalidate();
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            float[] fArr = this.f74568o;
            C107554b bVar = this.f74562f;
            fArr[0] = ((float) bVar.f321815p) / 2.0f;
            fArr[1] = ((float) bVar.f321814o) / 2.0f;
            bVar.f321806g.mapPoints(fArr);
        } else if (motionEvent.getActionMasked() == 1) {
            C107552a aVar2 = new C107552a();
            Rect rect = this.f74563g;
            C107554b bVar2 = this.f74562f;
            aVar2.f321789c = bVar2.f321817r;
            aVar2.f321790d = bVar2.f321816q;
            aVar2.f321788b = new float[]{((float) bVar2.f321815p) / 2.0f, ((float) bVar2.f321814o) / 2.0f};
            aVar2.f321787a = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
            C107554b bVar3 = this.f74562f;
            float[] fArr2 = {((float) bVar3.f321815p) / 2.0f, ((float) bVar3.f321814o) / 2.0f};
            bVar3.f321806g.mapPoints(fArr2);
            if (!aVar2.f321787a.contains(fArr2[0], fArr2[1])) {
                float[] fArr3 = this.f74568o;
                float f = fArr3[0];
                float f2 = fArr3[1];
                aVar2.f321787a = new RectF(f, f2, f, f2);
            }
            aVar2.mo157995a(this.f74562f.f321806g, new C26816a(this, motionEvent));
        }
        return z;
    }

    public final void setEditItem(C92023q qVar) {
        C87412m.m108594g(qVar, "pagItem");
        this.f74566j = qVar;
        Matrix matrix = this.f74562f.f321806g;
        float f = qVar.f263515n;
        matrix.postScale(f, f);
        int i = qVar.f263511j;
        int i2 = qVar.f263512k;
        this.f74560d.setBounds(0, 0, i, i2);
        this.f74565i.set(0, 0, i, i2);
        C107554b bVar = this.f74562f;
        bVar.f321806g.postTranslate(((float) bVar.f321815p) / 2.0f, ((float) bVar.f321814o) / 2.0f);
        C107554b bVar2 = this.f74562f;
        bVar2.f321815p = i;
        bVar2.f321814o = i2;
        C92023q qVar2 = this.f74566j;
        float f2 = qVar2 != null ? qVar2.f263515n : 1.0f;
        Rect rect = this.f74564h;
        Rect rect2 = this.f74563g;
        float f3 = (float) i2;
        bVar2.f321806g.postTranslate((((float) (-i)) * f2) / 2.0f, -((((float) ((rect.top + rect.bottom) / 2)) - (((float) (rect2.top + rect2.bottom)) / 2.0f)) + ((f2 * f3) / 2.0f)));
        C107554b bVar3 = this.f74562f;
        float f4 = (float) i;
        bVar3.getClass();
        bVar3.f321811l = new float[]{0.0f, 0.0f, f4, 0.0f, 0.0f, f3, f4, f3};
        C92023q qVar3 = this.f74566j;
        if (qVar3 != null) {
            qVar3.mo125995v(this.f74562f.f321806g);
        }
    }

    public final void setStateResolve(EditorItemContainer.C94437a aVar) {
        C87412m.m108594g(aVar, "stateResolve");
        this.f74561e = aVar;
    }

    public void setValidArea(Rect rect) {
        C87412m.m108594g(rect, "validRect");
        this.f74563g.set(rect);
    }
}
