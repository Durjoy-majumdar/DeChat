package cq3;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.C106853e;
import eq3.C107283a;
import java.util.Iterator;
import me3.C109612c;
import me3.C109623f;
import p1093bh.C104084a;
import p1093bh.C104085b;
import p1158tg.C110983b;
import p248ug.C111164r0;

/* renamed from: cq3.a */
public class C106952a extends View {

    /* renamed from: E */
    public static float f320126E = 1.0f;

    /* renamed from: A */
    public int f320127A = -1;

    /* renamed from: B */
    public boolean f320128B = false;

    /* renamed from: C */
    public boolean f320129C = false;

    /* renamed from: D */
    public float[] f320130D = new float[9];

    /* renamed from: d */
    public ImageView.ScaleType f320131d = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: e */
    public Matrix f320132e;

    /* renamed from: f */
    public Matrix f320133f;

    /* renamed from: g */
    public Matrix f320134g;

    /* renamed from: h */
    public Rect f320135h;

    /* renamed from: i */
    public Rect f320136i;

    /* renamed from: j */
    public Rect f320137j;

    /* renamed from: n */
    public Rect f320138n;

    /* renamed from: o */
    public Rect f320139o;

    /* renamed from: p */
    public Rect f320140p;

    /* renamed from: q */
    public Rect f320141q;

    /* renamed from: r */
    public C109623f f320142r;

    /* renamed from: s */
    public Runnable f320143s;

    /* renamed from: t */
    public float f320144t;

    /* renamed from: u */
    public float f320145u;

    /* renamed from: v */
    public float f320146v = 1.0f;

    /* renamed from: w */
    public float f320147w;

    /* renamed from: x */
    public float f320148x;

    /* renamed from: y */
    public boolean f320149y = true;

    /* renamed from: z */
    public int f320150z = -1;

    /* renamed from: cq3.a$a */
    public class C106953a implements Runnable {
        public C106953a() {
        }

        public void run() {
            if (((C109612c) C106952a.this.getPresenter()).f328158a.f319946w) {
                ((C109612c) C106952a.this.getPresenter()).f328158a.setFooterVisible(false);
                ((C109612c) C106952a.this.getPresenter()).f328158a.setActionBarVisible(false);
                return;
            }
            ((C109612c) C106952a.this.getPresenter()).f328158a.setFooterVisible(true);
            ((C109612c) C106952a.this.getPresenter()).f328158a.setActionBarVisible(true);
        }
    }

    /* renamed from: cq3.a$b */
    public class C106954b extends C110983b {

        /* renamed from: c */
        public ValueAnimator f320152c;

        /* renamed from: d */
        public float f320153d;

        /* renamed from: e */
        public float f320154e;

        /* renamed from: f */
        public float f320155f;

        /* renamed from: g */
        public float f320156g;

        /* renamed from: h */
        public float f320157h;

        /* renamed from: i */
        public float f320158i;

        /* renamed from: j */
        public boolean f320159j;

        /* renamed from: k */
        public C106955c f320160k;

        public C106954b(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.f320153d = f;
            this.f320154e = f2;
            this.f320155f = f3;
            this.f320156g = f4;
            this.f320157h = f5;
            this.f320158i = f6;
            this.f320159j = z;
        }
    }

    /* renamed from: cq3.a$c */
    public interface C106955c {
        /* renamed from: a */
        void mo145726a();

        void onStart();
    }

    public C106952a(Context context, C109623f fVar) {
        super(context);
        Rect rect;
        this.f320142r = fVar;
        this.f320132e = new Matrix();
        this.f320133f = new Matrix();
        this.f320135h = new Rect();
        this.f320136i = new Rect();
        this.f320138n = new Rect();
        this.f320137j = new Rect();
        this.f320139o = new Rect();
        Bitmap bitmap = ((C109612c) fVar).f328163f;
        if (bitmap != null) {
            this.f320137j.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.f320135h.set(this.f320137j);
            this.f320139o.set(this.f320137j);
        }
        if (!mo157331e() && (rect = ((C109612c) fVar).f328159b.f332928e) != null) {
            this.f320135h.set(0, 0, rect.width(), rect.height());
            this.f320132e.postTranslate(0.0f, (float) rect.top);
        }
    }

    /* renamed from: a */
    public void mo157327a() {
        int i;
        float f;
        float f2;
        float f3;
        int i2;
        int i3;
        float f4;
        Log.m105924i("MicroMsg.BaseBoardView", "adaptImage execute guess only by first time");
        Rect rawImageRect = getRawImageRect();
        if (mo157329c(this.f320132e) % 180.0f == 0.0f) {
            f = ((float) rawImageRect.width()) * 1.0f;
            i = rawImageRect.height();
        } else {
            f = ((float) rawImageRect.height()) * 1.0f;
            i = rawImageRect.width();
        }
        float f5 = f / ((float) i);
        int i4 = (f5 > ((((float) getBoardRect().width()) * 1.0f) / ((float) getBoardRect().height())) ? 1 : (f5 == ((((float) getBoardRect().width()) * 1.0f) / ((float) getBoardRect().height())) ? 0 : -1));
        float width = i4 < 0 ? ((float) getBoardRect().width()) / f5 : (float) getBoardRect().height();
        ImageView.ScaleType scaleType = this.f320131d;
        if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float height = i4 < 0 ? (float) getBoardRect().height() : ((float) getBoardRect().width()) / f5;
            if (mo157329c(this.f320132e) % 180.0f == 0.0f) {
                f4 = height * 1.0f;
                i3 = rawImageRect.height();
            } else {
                f4 = height * 1.0f;
                i3 = rawImageRect.width();
            }
            f2 = f4 / ((float) i3);
        } else {
            f2 = scaleType == ImageView.ScaleType.CENTER_CROP ? Math.max((((float) getBoardRect().width()) * 1.0f) / ((float) rawImageRect.width()), (((float) getBoardRect().height()) * 1.0f) / ((float) rawImageRect.height())) : 1.0f;
        }
        if (mo157329c(this.f320132e) % 180.0f == 0.0f) {
            f3 = width * 1.0f;
            i2 = rawImageRect.height();
        } else {
            f3 = width * 1.0f;
            i2 = rawImageRect.width();
        }
        float f6 = f3 / ((float) i2);
        this.f320132e.postScale(f2, f2, (float) rawImageRect.centerX(), (float) rawImageRect.centerY());
        RectF curImageRect = getCurImageRect();
        this.f320132e.postTranslate((float) (getBoardRect().centerX() - ((int) curImageRect.centerX())), (float) (getBoardRectCenterY() - ((int) curImageRect.centerY())));
        this.f320133f.set(this.f320132e);
        this.f320147w = mo157330d(this.f320133f) * 3.0f;
        this.f320148x = mo157330d(this.f320133f) * f320126E;
        if (this.f320147w < f6) {
            this.f320147w = f6 * 1.2f;
        }
    }

    /* renamed from: b */
    public void mo157328b(C106955c cVar, float f, boolean z) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Log.m105924i("MicroMsg.BaseBoardView", "adaptImageWithAnim");
        RectF curImageRect = getCurImageRect();
        int centerX = (int) curImageRect.centerX();
        int centerY = (int) curImageRect.centerY();
        int centerX2 = getBoardRect().centerX() - centerX;
        this.f320128B = !z;
        int boardRectCenterY = getBoardRectCenterY() - centerY;
        int i = ((f % 180.0f) > 0.0f ? 1 : ((f % 180.0f) == 0.0f ? 0 : -1));
        if (i == 0) {
            f3 = curImageRect.width() * 1.0f;
            f2 = curImageRect.height();
        } else {
            f3 = curImageRect.height() * 1.0f;
            f2 = curImageRect.width();
        }
        float f7 = f3 / f2;
        if (f7 < (((float) getBoardRect().width()) * 1.0f) / ((float) getBoardRect().height())) {
            getBoardRect().width();
            f4 = (float) getBoardRect().height();
        } else {
            getBoardRect().height();
            f4 = ((float) getBoardRect().width()) / f7;
        }
        if (i == 0) {
            f5 = f4 * 1.0f;
            f6 = curImageRect.height();
        } else {
            f5 = f4 * 1.0f;
            f6 = curImageRect.width();
        }
        C106954b bVar = new C106954b(f5 / f6, (float) centerX2, (float) boardRectCenterY, (float) centerX, (float) centerY, f, z);
        bVar.f320160k = cVar;
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{0.0f, 166.0f}), PropertyValuesHolder.ofFloat("deltaX", new float[]{0.0f, bVar.f320154e}), PropertyValuesHolder.ofFloat("deltaY", new float[]{0.0f, bVar.f320155f}), PropertyValuesHolder.ofFloat("rotation", new float[]{0.0f, bVar.f320158i})});
        bVar.f320152c = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addUpdateListener(new C106956b(bVar));
        bVar.f320152c.addListener(new C106957c(bVar));
        bVar.f320152c.setInterpolator(new LinearInterpolator());
        bVar.f320152c.setDuration(166);
        bVar.f320152c.start();
    }

    /* renamed from: c */
    public float mo157329c(Matrix matrix) {
        matrix.getValues(this.f320130D);
        float[] fArr = this.f320130D;
        matrix.getValues(fArr);
        return (float) Math.round(Math.atan2((double) fArr[1], (double) this.f320130D[0]) * 57.29577951308232d);
    }

    /* renamed from: d */
    public float mo157330d(Matrix matrix) {
        matrix.getValues(this.f320130D);
        float[] fArr = this.f320130D;
        float f = fArr[3];
        matrix.getValues(fArr);
        float f2 = this.f320130D[0];
        return (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
    }

    /* renamed from: e */
    public boolean mo157331e() {
        return !(this instanceof C106960f);
    }

    /* renamed from: f */
    public void mo157332f(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f320144t = motionEvent.getX();
            this.f320145u = motionEvent.getY();
        }
        if (motionEvent.getAction() == 1) {
            removeCallbacks(this.f320143s);
            long j = 0;
            if (this.f320129C) {
                j = 700;
            }
            if (((C109612c) getPresenter()).mo160820d().mo145700k() != C104084a.EMOJI_AND_TEXT) {
                C106953a aVar = new C106953a();
                this.f320143s = aVar;
                postDelayed(aVar, j);
            } else {
                ((C109612c) getPresenter()).f328158a.mo154840c(true);
                if (((C109612c) getPresenter()).f328158a.f319946w) {
                    ((C109612c) getPresenter()).f328158a.setFooterVisible(false);
                    ((C109612c) getPresenter()).f328158a.setActionBarVisible(false);
                } else {
                    C106853e eVar = ((C109612c) getPresenter()).f328158a;
                    ChatFooterPanel chatFooterPanel = eVar.f319939p;
                    if (!(chatFooterPanel != null && (chatFooterPanel.getVisibility() == 0 || eVar.getTextEditView().getVisibility() == 0))) {
                        ((C109612c) getPresenter()).f328158a.setFooterVisible(true);
                        ((C109612c) getPresenter()).f328158a.setActionBarVisible(true);
                    }
                }
                C107283a baseFooterView = ((C109612c) getPresenter()).f328158a.getBaseFooterView();
                baseFooterView.f320977r = baseFooterView.f320978s;
                baseFooterView.requestLayout();
                baseFooterView.invalidate();
            }
            this.f320129C = false;
        } else if (motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getX() - this.f320144t) >= 3.0f || Math.abs(motionEvent.getY() - this.f320145u) >= 3.0f) {
                this.f320129C = true;
                removeCallbacks(this.f320143s);
                if (((C109612c) getPresenter()).f328158a.f319946w) {
                    ((C109612c) getPresenter()).f328158a.setFooterVisible(false);
                    ((C109612c) getPresenter()).f328158a.setActionBarVisible(false);
                }
            }
            this.f320144t = motionEvent.getX();
            this.f320145u = motionEvent.getY();
        }
    }

    /* renamed from: g */
    public void mo157333g(MotionEvent motionEvent) {
    }

    public Rect getAliveRect() {
        return this.f320135h;
    }

    public Rect getBoardRect() {
        if (this.f320136i == null) {
            this.f320136i = new Rect();
        }
        return this.f320136i;
    }

    public int getBoardRectCenterY() {
        if (this.f320150z == -1 || this.f320128B) {
            return this.f320136i.centerY();
        }
        if (this.f320127A == -1) {
            RectF curValidImageRect = getCurValidImageRect();
            this.f320127A = (int) (((curValidImageRect.bottom - curValidImageRect.top) / 2.0f) + ((float) this.f320150z));
        }
        return this.f320127A;
    }

    public RectF getCurImageRect() {
        RectF rectF = new RectF(getRawImageRect());
        this.f320132e.mapRect(rectF);
        return rectF;
    }

    public float getCurScale() {
        return mo157330d(this.f320132e);
    }

    public RectF getCurValidImageRect() {
        RectF rectF = new RectF(getValidImageRect());
        this.f320132e.mapRect(rectF);
        return rectF;
    }

    public Rect getImageBitmapRect() {
        return this.f320139o;
    }

    public float getInitScale() {
        if (mo157331e()) {
            return this.f320146v;
        }
        return 1.0f;
    }

    public Matrix getMainMatrix() {
        return this.f320132e;
    }

    public float getMaxScale() {
        return this.f320147w;
    }

    public float getMinScale() {
        return this.f320148x;
    }

    public C109623f getPresenter() {
        return this.f320142r;
    }

    public Rect getRawBoardRect() {
        return this.f320138n;
    }

    public Rect getRawImageRect() {
        return this.f320137j;
    }

    public Rect getRawLayoutRect() {
        if (this.f320141q == null) {
            this.f320141q = ((C109612c) getPresenter()).f328159b.f332930g;
        }
        return this.f320141q;
    }

    public Rect getValidImageRect() {
        Rect rect = this.f320140p;
        return rect != null ? rect : this.f320137j;
    }

    /* renamed from: h */
    public void mo157350h() {
        C109623f fVar = this.f320142r;
        if (fVar != null) {
            this.f320127A = -1;
            C109612c cVar = (C109612c) fVar;
            C111164r0.C111165a aVar = cVar.f328159b;
            this.f320150z = aVar.f332933j;
            f320126E = aVar.f332934k;
            Bitmap bitmap = cVar.f328163f;
            if (bitmap != null) {
                this.f320137j.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                this.f320135h.set(this.f320137j);
                this.f320139o.set(this.f320137j);
            }
            if (((C109612c) this.f320142r).f328175r) {
                this.f320132e.reset();
                mo157327a();
            }
        }
    }

    /* renamed from: i */
    public void mo157351i(Rect rect) {
        this.f320137j.set(rect);
        this.f320135h.set(rect);
        Log.m105925i("MicroMsg.BaseBoardView", "[resetImageRect] rect %s", rect.flattenToString());
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas.setMatrix(this.f320132e);
        ((C109612c) getPresenter()).mo160829m(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Log.m105925i("changelcai", "[onLayout] %s=%s=%s=%s=%s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (z) {
            this.f320136i.set(i, i2, i3, i4);
            this.f320138n.set(this.f320136i);
        }
        C109612c cVar = (C109612c) getPresenter();
        Log.m105925i("MicroMsg.DrawingPresenter", "[onLayout],%s", Boolean.valueOf(cVar.f328175r));
        if (!cVar.f328175r) {
            cVar.f328175r = true;
            Iterator<C104085b> it = cVar.f328161d.iterator();
            while (it.hasNext()) {
                C104085b next = it.next();
                if (ArtistCacheManager.m140185a().mo148161d(next.mo145700k())) {
                    next.mo145706q();
                    next.mo145688A(true);
                    Log.m105925i("MicroMsg.DrawingPresenter", "[onAttachedToWindow] %s is revert onAlive!", next.mo145700k());
                }
            }
            if (cVar.f328158a.getBaseBoardView().mo157331e()) {
                cVar.f328158a.getBaseBoardView().mo157327a();
                cVar.f328158a.getBaseBoardView().invalidate();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (((C109612c) getPresenter()).mo160827k()) {
            mo157332f(motionEvent);
        }
        if (((C109612c) getPresenter()).mo160832p(motionEvent) || !mo157331e()) {
            return true;
        }
        if (!((C109612c) getPresenter()).f328165h) {
            return false;
        }
        mo157333g(motionEvent);
        return true;
    }

    public void setForceMatrix(Matrix matrix) {
        this.f320134g = matrix;
    }

    public void setInitScale(float f) {
        this.f320146v = f;
    }

    public void setOneFingerMoveEnable(boolean z) {
        this.f320149y = z;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.f320131d = scaleType;
    }

    public void setTouchEnable(boolean z) {
    }

    public void setValidImageRect(Rect rect) {
        this.f320140p = rect;
    }
}
