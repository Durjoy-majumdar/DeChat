package ai2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import bi2.C92262a;
import bi2.C92264c;
import bi2.C92266e;
import ci2.C104380d;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.view.AbsEmojiView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.item.EditorItemContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fi2.C107552a;
import fi2.C107554b;
import fy3.C32227p;
import gi2.C107810a;
import gi2.C107818f;
import gi2.C98129b;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import p008bq.C92281h1;
import qz1.C22180d;
import qz1.C22187h;
import rx3.C13598b0;

/* renamed from: ai2.g */
public final class C92013g extends AbsEmojiView implements C92015i, C107818f {

    /* renamed from: r */
    public final String f263448r = "MicroMsg.EmojiItemView";

    /* renamed from: s */
    public final C107554b f263449s;

    /* renamed from: t */
    public EditorItemContainer.C94437a f263450t;

    /* renamed from: u */
    public final Rect f263451u;

    /* renamed from: v */
    public final Rect f263452v;

    /* renamed from: w */
    public final C107810a f263453w;

    /* renamed from: x */
    public C92012f f263454x;

    /* renamed from: y */
    public boolean f263455y;

    /* renamed from: z */
    public final float[] f263456z;

    /* renamed from: ai2.g$a */
    public static final class C92014a extends C87413o implements C32227p<Matrix, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92013g f263457d;

        /* renamed from: e */
        public final /* synthetic */ MotionEvent f263458e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92014a(C92013g gVar, MotionEvent motionEvent) {
            super(2);
            this.f263457d = gVar;
            this.f263458e = motionEvent;
        }

        public Object invoke(Object obj, Object obj2) {
            Matrix matrix = (Matrix) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(matrix, "m");
            this.f263457d.getTouchTracker().mo158004h(matrix);
            this.f263457d.postInvalidate();
            if (booleanValue) {
                this.f263457d.getTouchTracker().mo157997a(this.f263458e);
                this.f263457d.bringToFront();
                C92013g gVar = this.f263457d;
                EditorItemContainer.C94437a aVar = gVar.f263450t;
                if (aVar != null) {
                    aVar.mo129926a(gVar, this.f263458e);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92013g(Context context) {
        super(context, (AttributeSet) null, 0, 6, (C8480h) null);
        C87412m.m108594g(context, "context");
        C107554b bVar = new C107554b();
        this.f263449s = bVar;
        this.f263451u = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);
        this.f263452v = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);
        this.f263456z = new float[2];
        bVar.f321817r = 0.5f;
        bVar.f321816q = 3.0f;
        Resources resources = getResources();
        C87412m.m108593f(resources, "resources");
        this.f263453w = new C107810a(resources);
    }

    /* renamed from: a */
    public boolean mo53770a(long j) {
        return C107818f.C107819a.m146079c(this, j);
    }

    /* renamed from: d */
    public C92007a mo53771d() {
        C104380d dVar;
        C104380d dVar2;
        String str = null;
        if (getEmojiInfo() == null) {
            return null;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Matrix matrix = new Matrix();
            matrix.postConcat(this.f263449s.f321806g);
            C92012f fVar = new C92012f(getEmojiInfo(), matrix, matrix);
            C92012f fVar2 = this.f263454x;
            if (!(fVar2 == null || (dVar2 = fVar2.f263404c) == null)) {
                fVar.f263404c.mo146050d(dVar2.mo146049c(), dVar2.mo146048b());
            }
            C92012f fVar3 = this.f263454x;
            if (fVar3 != null) {
                str = fVar3.f263405d;
            }
            fVar.f263405d = str;
            return fVar;
        }
        float f = 1.0f;
        if (getDrawable() instanceof C22180d) {
            Drawable drawable = getDrawable();
            C87412m.m108592e(drawable, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
            f = ((C22180d) drawable).mo35284e();
        } else if (getDrawable() instanceof C22187h) {
            Drawable drawable2 = getDrawable();
            C87412m.m108592e(drawable2, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
            f = ((C22187h) drawable2).mo35304e();
        }
        Matrix matrix2 = new Matrix();
        Matrix matrix3 = new Matrix();
        String str2 = this.f263448r;
        Log.m105924i(str2, "createEditorData displayRect:" + this.f263452v + " validRect:" + this.f263451u);
        matrix3.set(this.f263449s.f321806g);
        matrix3.postTranslate(((float) (-(this.f263452v.width() - this.f263451u.width()))) / 2.0f, -((float) this.f263451u.top));
        matrix2.setScale(f, f);
        matrix2.postConcat(this.f263449s.f321806g);
        C92012f fVar4 = new C92012f(getEmojiInfo(), matrix3, matrix2);
        C92012f fVar5 = this.f263454x;
        if (!(fVar5 == null || (dVar = fVar5.f263404c) == null)) {
            fVar4.f263404c.mo146050d(dVar.mo146049c(), dVar.mo146048b());
        }
        C92012f fVar6 = this.f263454x;
        if (fVar6 != null) {
            str = fVar6.f263405d;
        }
        fVar4.f263405d = str;
        return fVar4;
    }

    /* renamed from: e */
    public boolean mo53772e(String str) {
        return C107818f.C107819a.m146078b(this, str);
    }

    /* renamed from: f */
    public void mo53773f(Rect rect, float f) {
        C87412m.m108594g(rect, "displayRect");
        this.f263452v.set(rect);
        this.f263449s.f321806g.postTranslate(((float) rect.width()) / 2.0f, ((float) rect.height()) * f);
    }

    public float[] getContentBoundary() {
        return (float[]) this.f263449s.f321813n.clone();
    }

    public RectF getDrawRect() {
        float[] fArr = this.f263449s.f321813n;
        return new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public C92007a getEditorData() {
        return this.f263454x;
    }

    public Rect getSafeArea() {
        Rect rect = this.f263449s.f321807h;
        return rect == null ? new Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    public final C107554b getTouchTracker() {
        return this.f263449s;
    }

    public C98129b getType() {
        return C98129b.EditItemTypeEmoji;
    }

    public final Matrix getViewMatrix() {
        return null;
    }

    /* renamed from: h */
    public boolean mo53780h() {
        return true;
    }

    /* renamed from: i */
    public C92262a mo53781i(Matrix matrix) {
        if (getEmojiInfo() == null) {
            return null;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Drawable drawable = getDrawable();
            C87412m.m108592e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(this.f263449s.f321806g);
            if (matrix != null) {
                matrix2.postConcat(matrix);
            }
            return new C92264c(bitmap, matrix2);
        }
        float f = 1.0f;
        if (getDrawable() instanceof C22180d) {
            Drawable drawable2 = getDrawable();
            C87412m.m108592e(drawable2, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
            f = ((C22180d) drawable2).mo35284e();
        } else if (getDrawable() instanceof C22187h) {
            Drawable drawable3 = getDrawable();
            C87412m.m108592e(drawable3, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
            f = ((C22187h) drawable3).mo35304e();
        }
        Matrix matrix3 = new Matrix();
        String str = this.f263448r;
        Log.m105924i(str, "createEditorItem displayRect:" + this.f263452v + " validRect:" + this.f263451u);
        matrix3.setScale(f, f);
        matrix3.postConcat(this.f263449s.f321806g);
        if (matrix != null) {
            matrix3.postConcat(matrix);
        }
        IEmojiInfo emojiInfo = getEmojiInfo();
        C87412m.m108591d(emojiInfo);
        return new C92266e(emojiInfo, matrix3);
    }

    /* renamed from: m */
    public void mo53782m(Rect rect, int i) {
        C87412m.m108594g(rect, "safeRect");
        C107554b bVar = this.f263449s;
        bVar.f321807h = rect;
        bVar.f321808i = C76577a.m92151b(getContext(), i);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.save();
        canvas.setMatrix(this.f263449s.f321806g);
        if (isActivated()) {
            this.f263453w.draw(canvas);
        }
        canvas.restore();
        canvas.clipRect(this.f263451u);
        canvas.save();
        canvas.setMatrix(this.f263449s.f321806g);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
            z = true;
        } else {
            z = this.f263449s.mo157997a(motionEvent);
            if (z) {
                bringToFront();
                EditorItemContainer.C94437a aVar = this.f263450t;
                if (aVar != null) {
                    aVar.mo129926a(this, motionEvent);
                }
                postInvalidate();
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            float[] fArr = this.f263456z;
            C107554b bVar = this.f263449s;
            fArr[0] = ((float) bVar.f321815p) / 2.0f;
            fArr[1] = ((float) bVar.f321814o) / 2.0f;
            bVar.f321806g.mapPoints(fArr);
        } else if (motionEvent.getActionMasked() == 1) {
            C107552a aVar2 = new C107552a();
            Rect rect = this.f263451u;
            C107554b bVar2 = this.f263449s;
            aVar2.f321789c = bVar2.f321817r;
            aVar2.f321790d = bVar2.f321816q;
            aVar2.f321788b = new float[]{((float) bVar2.f321815p) / 2.0f, ((float) bVar2.f321814o) / 2.0f};
            aVar2.f321787a = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
            C107554b bVar3 = this.f263449s;
            float[] fArr2 = {((float) bVar3.f321815p) / 2.0f, ((float) bVar3.f321814o) / 2.0f};
            bVar3.f321806g.mapPoints(fArr2);
            if (!aVar2.f321787a.contains(fArr2[0], fArr2[1])) {
                float[] fArr3 = this.f263456z;
                float f = fArr3[0];
                float f2 = fArr3[1];
                aVar2.f321787a = new RectF(f, f2, f, f2);
            }
            aVar2.mo157995a(this.f263449s.f321806g, new C92014a(this, motionEvent));
        }
        return z;
    }

    public final void setEmojiItem(C92012f fVar) {
        C87412m.m108594g(fVar, "item");
        this.f263454x = fVar;
        setEmojiInfo(fVar.f263446g);
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof C22187h) {
                ((C92281h1) C86312j.m106911c(C92281h1.class)).ug0(((C22187h) drawable).f62765R, 0);
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (!this.f263455y) {
                C107554b bVar = this.f263449s;
                bVar.f321806g.postTranslate(((float) bVar.f321815p) / 2.0f, ((float) bVar.f321814o) / 2.0f);
                C107554b bVar2 = this.f263449s;
                bVar2.f321815p = intrinsicWidth;
                bVar2.f321814o = intrinsicHeight;
                Rect rect = this.f263452v;
                float f = (float) ((rect.top + rect.bottom) / 2);
                Rect rect2 = this.f263451u;
                bVar2.f321806g.postTranslate(((float) (-intrinsicWidth)) / 2.0f, -((f - (((float) (rect2.top + rect2.bottom)) / 2.0f)) + (((float) intrinsicHeight) / 2.0f)));
            }
            this.f263453w.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            C107554b bVar3 = this.f263449s;
            float f2 = (float) intrinsicWidth;
            float f3 = (float) intrinsicHeight;
            bVar3.getClass();
            bVar3.f321811l = new float[]{0.0f, 0.0f, f2, 0.0f, 0.0f, f3, f2, f3};
        }
        super.setImageDrawable(drawable);
    }

    public final void setStateResolve(EditorItemContainer.C94437a aVar) {
        C87412m.m108594g(aVar, "stateResolve");
        this.f263450t = aVar;
    }

    public void setValidArea(Rect rect) {
        C87412m.m108594g(rect, "validRect");
        this.f263451u.set(rect);
    }

    public final void setViewMatrix(Matrix matrix) {
        if (!C87412m.m108589b((Object) null, matrix) && matrix != null) {
            C107554b bVar = this.f263449s;
            bVar.getClass();
            bVar.f321806g = matrix;
        }
    }
}
