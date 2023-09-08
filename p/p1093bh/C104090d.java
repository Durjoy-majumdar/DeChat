package p1093bh;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import cq3.C106952a;
import j20.C117292a;
import java.util.Stack;
import k20.C60958c;
import k20.C9556a;
import me3.C109612c;
import me3.C109623f;
import p1158tg.C110980a;
import p520fi.C107544a;
import z20.C112571a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: bh.d */
public class C104090d extends C104085b<C107544a> {

    /* renamed from: A */
    public boolean f307899A = true;

    /* renamed from: B */
    public boolean f307900B = false;

    /* renamed from: C */
    public C110980a f307901C;

    /* renamed from: D */
    public C104106o f307902D;

    /* renamed from: E */
    public boolean f307903E = false;

    /* renamed from: F */
    public boolean f307904F = false;

    /* renamed from: G */
    public boolean f307905G = false;

    /* renamed from: H */
    public boolean f307906H = false;

    /* renamed from: I */
    public boolean f307907I = false;

    /* renamed from: J */
    public boolean f307908J = true;

    /* renamed from: K */
    public float f307909K;

    /* renamed from: L */
    public float f307910L;

    /* renamed from: M */
    public float f307911M;

    /* renamed from: N */
    public float f307912N;

    /* renamed from: O */
    public float f307913O;

    /* renamed from: P */
    public float f307914P;

    /* renamed from: Q */
    public ValueAnimator f307915Q;

    /* renamed from: R */
    public Rect f307916R = new Rect();

    /* renamed from: S */
    public int f307917S = 0;

    /* renamed from: o */
    public int f307918o = ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f4187vi));

    /* renamed from: p */
    public int f307919p = ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.a5r));

    /* renamed from: q */
    public int f307920q = ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f4300zz));

    /* renamed from: r */
    public Matrix f307921r = new Matrix();

    /* renamed from: s */
    public Rect f307922s;

    /* renamed from: t */
    public RectF f307923t;

    /* renamed from: u */
    public RectF f307924u;

    /* renamed from: v */
    public RectF f307925v;

    /* renamed from: w */
    public RectF f307926w;

    /* renamed from: x */
    public final Rect f307927x = new Rect();

    /* renamed from: y */
    public C112571a f307928y;

    /* renamed from: z */
    public boolean f307929z = false;

    /* renamed from: bh.d$a */
    public class C104091a implements C106952a.C106955c {
        public C104091a() {
        }

        /* renamed from: a */
        public void mo145726a() {
            if (C104090d.this.mo145692c() != null) {
                if (((C107544a) C104090d.this.mo145692c()).f321767f.isIdentity()) {
                    ((C107544a) C104090d.this.mo145692c()).f321767f.set(C104090d.this.mo145696g());
                }
                Rect rect = new Rect();
                C109623f fVar = C104090d.this.f307884a;
                if (((C109612c) fVar).f328163f == null) {
                    rect.set(0, 0, ((C109612c) fVar).f328158a.getBaseBoardView().getBoardRect().width(), ((C109612c) C104090d.this.f307884a).f328158a.getBaseBoardView().getBoardRect().height());
                } else {
                    rect.set(0, 0, ((C109612c) fVar).f328163f.getWidth(), ((C109612c) C104090d.this.f307884a).f328163f.getHeight());
                }
                ((C109612c) C104090d.this.f307884a).f328158a.getBaseBoardView().mo157351i(rect);
                C104090d.m138887C(C104090d.this, 200, true, false);
                C104090d.m138888D(C104090d.this);
                C104090d.this.mo145705p();
            }
        }

        public void onStart() {
            C104090d dVar = C104090d.this;
            dVar.f307929z = false;
            dVar.f307908J = false;
        }
    }

    /* renamed from: bh.d$b */
    public class C104092b implements C106952a.C106955c {
        public C104092b() {
        }

        /* renamed from: a */
        public void mo145726a() {
            Rect rect;
            C104090d dVar = C104090d.this;
            dVar.f307908J = true;
            if (((C109612c) dVar.f307884a).f328163f == null) {
                rect = new Rect();
                Log.m105920e("MicroMsg.CropArtist", "getImageBitmap is null!");
            } else {
                rect = new Rect(0, 0, ((C109612c) C104090d.this.f307884a).f328163f.getWidth(), ((C109612c) C104090d.this.f307884a).f328163f.getHeight());
            }
            ((C109612c) C104090d.this.f307884a).f328158a.getBaseBoardView().mo157351i(rect);
            C104090d.m138887C(C104090d.this, 200, true, false);
            C104090d.m138888D(C104090d.this);
        }

        public void onStart() {
            C104090d dVar = C104090d.this;
            dVar.f307929z = false;
            dVar.f307908J = false;
            dVar.f307928y.getClass();
            C112571a.f337051s.setAlpha((int) (((float) 282) * 0.9019608f));
        }
    }

    /* renamed from: bh.d$c */
    public class C104093c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ float f307932d;

        /* renamed from: e */
        public final /* synthetic */ float f307933e;

        /* renamed from: f */
        public final /* synthetic */ float f307934f;

        public C104093c(float f, float f2, float f3) {
            this.f307932d = f;
            this.f307933e = f2;
            this.f307934f = f3;
        }

        public void run() {
            C104090d dVar = C104090d.this;
            C110980a aVar = dVar.f307901C;
            aVar.f332393k = 1000;
            float f = this.f307932d;
            Rect rect = dVar.f307922s;
            float f2 = this.f307933e;
            float f3 = this.f307934f;
            aVar.f332388f = f2;
            aVar.f332389g = f3;
            aVar.f332390h = rect;
            aVar.f332391i.set(rect);
            aVar.f332387e = f;
            C104090d.this.f307901C.mo162648b();
        }
    }

    /* renamed from: bh.d$d */
    public class C104094d implements C106952a.C106955c {

        /* renamed from: a */
        public final /* synthetic */ C112571a f307936a;

        public C104094d(C112571a aVar) {
            this.f307936a = aVar;
        }

        /* renamed from: a */
        public void mo145726a() {
            C112571a aVar = this.f307936a;
            aVar.f337057f.set(C104090d.this.mo145696g());
            if (C104090d.this.mo145692c() != null) {
                ((C107544a) C104090d.this.mo145692c()).clear();
                C112571a aVar2 = this.f307936a;
                Stack<C112571a> stack = ((C107544a) C104090d.this.mo145692c()).f321765d;
                if (stack != null) {
                    stack.push(aVar2);
                }
            }
        }

        public void onStart() {
        }
    }

    /* renamed from: C */
    public static void m138887C(C104090d dVar, long j, boolean z, boolean z2) {
        ValueAnimator valueAnimator = dVar.f307915Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("alpha", new int[]{0, 255}), z ? PropertyValuesHolder.ofInt("bg_alpha", new int[]{282, 255}) : z2 ? PropertyValuesHolder.ofInt("bg_alpha", new int[]{255, 255}) : PropertyValuesHolder.ofInt("bg_alpha", new int[]{0, 255})});
        dVar.f307915Q = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addUpdateListener(new C104095e(dVar));
        dVar.f307915Q.addListener(new C104096f(dVar));
        dVar.f307915Q.setStartDelay(j);
        dVar.f307915Q.setDuration(300);
        dVar.f307915Q.start();
    }

    /* renamed from: D */
    public static void m138888D(C104090d dVar) {
        C104106o oVar = dVar.f307902D;
        if (oVar != null) {
            oVar.f307994e.f307929z = true;
            Log.m105924i("FixRatioCropHelper", "resetBoxClipRect");
            float width = (((float) oVar.f307993d.width()) * 1.0f) / ((float) oVar.f307993d.height());
            if (((C109612c) oVar.f307994e.f307884a).f328163f == null) {
                Log.m105928w("FixRatioCropHelper", "[resetBoxRect] getImageBitmap is null!");
            } else if (width > oVar.f307992c) {
                float height = (((float) oVar.f307993d.height()) * oVar.f307992c) / 2.0f;
                int centerX = (int) (((float) oVar.f307993d.centerX()) + height);
                Rect rect = oVar.f307993d;
                rect.set((int) (((float) oVar.f307993d.centerX()) - height), rect.top, centerX, rect.bottom);
            } else {
                float width2 = (((float) oVar.f307993d.width()) / oVar.f307992c) / 2.0f;
                int centerY = (int) (((float) oVar.f307993d.centerY()) + width2);
                Rect rect2 = oVar.f307993d;
                rect2.set(rect2.left, (int) (((float) oVar.f307993d.centerY()) - width2), rect2.right, centerY);
            }
            float min = Math.min((((float) oVar.f307991b.width()) * 1.0f) / ((float) oVar.f307993d.width()), (((float) oVar.f307991b.height()) * 1.0f) / ((float) oVar.f307993d.height()));
            float centerX2 = ((float) oVar.f307991b.centerX()) - ((float) oVar.f307993d.centerX());
            float centerY2 = ((float) oVar.f307991b.centerY()) - ((float) oVar.f307993d.centerY());
            C119179t tVar = C119157j.f356862d;
            C104104m mVar = new C104104m(oVar, min, centerX2, centerY2);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(mVar, 0, false);
        }
    }

    /* renamed from: E */
    public void mo145722E() {
        ((C109612c) this.f307884a).f328158a.getBaseBoardView().f320136i = ((C109612c) this.f307884a).f328158a.getBaseBoardView().getRawBoardRect();
        RectF rectF = new RectF(this.f307922s);
        Matrix matrix = new Matrix();
        mo145696g().invert(matrix);
        matrix.mapRect(rectF);
        Rect rect = new Rect();
        rectF.round(rect);
        ((C109612c) this.f307884a).f328158a.getBaseBoardView().mo157351i(rect);
        C112571a aVar = new C112571a();
        aVar.f337055d = new Rect(this.f307922s);
        aVar.f337056e.set(rect);
        if (this.f307902D != null) {
            ((C109612c) this.f307884a).f328158a.getBaseBoardView().mo157327a();
            aVar.f337057f.set(mo145696g());
            if (mo145692c() != null) {
                ((C107544a) mo145692c()).clear();
                Stack<C112571a> stack = ((C107544a) mo145692c()).f321765d;
                if (stack != null) {
                    stack.push(aVar);
                }
            }
        } else {
            ((C109612c) this.f307884a).f328158a.getBaseBoardView().mo157328b(new C104094d(aVar), 0.0f, true);
        }
        View actionBar = ((C109612c) this.f307884a).f328158a.getActionBar();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(actionBar, aVar2.mo10232b(), "com/tencent/mm/artists/CropArtist", "innerCrop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        actionBar.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(actionBar, "com/tencent/mm/artists/CropArtist", "innerCrop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: F */
    public final boolean mo145723F() {
        return this.f307906H || this.f307904F || this.f307905G || this.f307907I;
    }

    /* renamed from: G */
    public final void mo145724G() {
        C109623f fVar = this.f307884a;
        if (((C109612c) fVar).f328163f == null) {
            Log.m105928w("MicroMsg.CropArtist", "[resetBoxRect] getImageBitmap is null!");
            return;
        }
        float width = (((float) ((C109612c) fVar).f328163f.getWidth()) * 1.0f) / ((float) ((C109612c) this.f307884a).f328163f.getHeight());
        if (width < (((float) this.f307927x.width()) * 1.0f) / ((float) this.f307927x.height())) {
            int width2 = (int) ((((float) this.f307927x.width()) - (((float) this.f307927x.height()) * width)) / 2.0f);
            Rect rect = this.f307922s;
            Rect rect2 = this.f307927x;
            rect.set(rect2.left + width2, rect2.top, rect2.right - width2, rect2.bottom);
        } else {
            int height = (int) ((((float) this.f307927x.height()) - (((float) this.f307927x.width()) / width)) / 2.0f);
            Rect rect3 = this.f307922s;
            Rect rect4 = this.f307927x;
            rect3.set(rect4.left, rect4.top + height, rect4.right, rect4.bottom - height);
        }
        mo145725H();
    }

    /* renamed from: H */
    public void mo145725H() {
        int i = this.f307918o * 2;
        RectF rectF = this.f307925v;
        Rect rect = this.f307922s;
        int i2 = rect.left;
        rectF.set((float) (i2 - i), (float) (rect.top - i), (float) (i2 + i), (float) (rect.bottom + i));
        RectF rectF2 = this.f307923t;
        Rect rect2 = this.f307922s;
        int i3 = rect2.top;
        rectF2.set((float) (rect2.left - i), (float) (i3 - i), (float) (rect2.right + i), (float) (i3 + i));
        RectF rectF3 = this.f307926w;
        Rect rect3 = this.f307922s;
        int i4 = rect3.right;
        rectF3.set((float) (i4 - i), (float) (rect3.top - i), (float) (i4 + i), (float) (rect3.bottom + i));
        RectF rectF4 = this.f307924u;
        Rect rect4 = this.f307922s;
        int i5 = rect4.bottom;
        rectF4.set((float) (rect4.left - i), (float) (i5 - i), (float) (rect4.right + i), (float) (i5 + i));
    }

    /* renamed from: k */
    public C104084a mo145700k() {
        return C104084a.CROP_PHOTO;
    }

    /* renamed from: l */
    public boolean mo145701l() {
        if (mo145692c() == null) {
            return false;
        }
        return !((C107544a) mo145692c()).f321767f.equals(mo145696g());
    }

    /* renamed from: q */
    public void mo145706q() {
        super.mo145706q();
        if (this.f307927x.isEmpty()) {
            Rect rect = this.f307927x;
            int i = this.f307918o;
            rect.set(i, i * 2, mo145691b().width() - this.f307918o, ((mo145691b().height() - this.f307919p) - this.f307920q) - (this.f307918o * 2));
        }
        Log.m105925i("MicroMsg.CropArtist", "[onAlive] CROP_MAX_RECT:%s", this.f307927x);
        if (mo145692c() == null) {
            Log.m105924i("MicroMsg.CropArtist", "[onAlive] getCache is null");
            return;
        }
        C107544a aVar = (C107544a) mo145692c();
        Stack<C112571a> stack = aVar.f321765d;
        C112571a peek = (stack == null || stack.size() <= 0) ? null : aVar.f321765d.peek();
        if (peek != null && !peek.f337056e.isEmpty()) {
            ((C109612c) this.f307884a).f328158a.getBaseBoardView().mo157351i(peek.f337056e);
            float i2 = mo145698i(peek.f337057f);
            Log.m105925i("MicroMsg.CropArtist", "[onAlive] rotation:%s", Float.valueOf(i2));
            mo145696g().postRotate(-i2, (float) peek.f337056e.centerX(), (float) peek.f337056e.centerY());
        }
        C109623f fVar = this.f307884a;
        if (fVar != null) {
            float f = ((C109612c) fVar).f328166i;
            if (f > 0.0f && this.f307902D == null) {
                this.f307902D = new C104106o(this, f, this.f307922s);
            }
        }
    }

    /* renamed from: r */
    public void mo145707r(C109623f fVar, Matrix matrix, Rect rect) {
        super.mo145707r(fVar, matrix, rect);
        this.f307922s = new Rect();
        this.f307924u = new RectF();
        this.f307923t = new RectF();
        this.f307925v = new RectF();
        this.f307926w = new RectF();
        this.f307928y = new C112571a(this.f307922s);
        this.f307901C = new C110980a(this);
    }

    /* renamed from: t */
    public void mo145709t() {
        super.mo145709t();
        this.f307902D = null;
    }

    /* renamed from: u */
    public boolean mo145710u(MotionEvent motionEvent) {
        Rect rect;
        int i;
        Rect rect2;
        int i2;
        Rect rect3;
        int i3;
        Rect rect4;
        int i4;
        int i5;
        if (!mo145703n()) {
            return false;
        }
        C104106o oVar = this.f307902D;
        if (oVar != null) {
            RectF curImageRect = ((C109612c) oVar.f307994e.f307884a).f328158a.getBaseBoardView().getCurImageRect();
            float f = curImageRect.top;
            float f2 = curImageRect.bottom;
            Rect rect5 = oVar.f307993d;
            float f3 = f - (f2 - ((float) rect5.bottom));
            oVar.f308000k = f3;
            float f4 = f2 + (((float) rect5.top) - f);
            oVar.f308001l = f4;
            float f5 = curImageRect.left;
            float f6 = curImageRect.right;
            float f7 = f5 - (f6 - ((float) rect5.right));
            oVar.f308002m = f7;
            float f8 = f6 + (((float) rect5.left) - f5);
            oVar.f308003n = f8;
            Rect rect6 = oVar.f307991b;
            float f9 = (float) rect6.right;
            if (f8 > f9) {
                oVar.f308003n = f9;
            }
            float f15 = (float) oVar.f307990a;
            if (f7 < f15) {
                oVar.f308002m = f15;
            }
            float f16 = (float) rect6.bottom;
            if (f4 > f16) {
                oVar.f308001l = f16;
            }
            if (f3 < f15) {
                oVar.f308000k = f15;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                MotionEvent motionEvent2 = motionEvent;
                Log.m105924i("FixRatioCropHelper", "ACTION_DOWN moveDirection :" + oVar.f307995f);
                oVar.f307996g = false;
                C110980a aVar = oVar.f307994e.f307901C;
                if (aVar != null) {
                    aVar.mo162647a();
                }
                if (oVar.f307994e.f307924u.contains(motionEvent.getX(), motionEvent.getY())) {
                    oVar.f307995f |= 8;
                }
                if (oVar.f307994e.f307923t.contains(motionEvent.getX(), motionEvent.getY())) {
                    oVar.f307995f |= 2;
                }
                if (oVar.f307994e.f307925v.contains(motionEvent.getX(), motionEvent.getY())) {
                    oVar.f307995f |= 1;
                }
                if (oVar.f307994e.f307926w.contains(motionEvent.getX(), motionEvent.getY())) {
                    oVar.f307995f = 4 | oVar.f307995f;
                }
                oVar.f307994e.f307908J = false;
                if (oVar.f307995f > 0) {
                    oVar.f307996g = true;
                    oVar.f307997h = motionEvent.getX();
                    oVar.f307998i = motionEvent.getY();
                }
            } else if (actionMasked == 1) {
                float width = (((float) oVar.f307991b.width()) * 1.0f) / ((float) oVar.f307993d.width());
                float height = (((float) oVar.f307991b.height()) * 1.0f) / ((float) oVar.f307993d.height());
                if (width >= height) {
                    width = height;
                }
                float centerX = ((float) oVar.f307991b.centerX()) - ((float) oVar.f307993d.centerX());
                float centerY = ((float) oVar.f307991b.centerY()) - ((float) oVar.f307993d.centerY());
                C119179t tVar = C119157j.f356862d;
                C104105n nVar = new C104105n(oVar, width, centerX, centerY);
                long j = oVar.f307996g ? 0 : 100;
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(nVar, j, false);
                if (oVar.f307995f > 0) {
                    oVar.f307996g = true;
                } else {
                    oVar.f307996g = false;
                }
                oVar.f307995f = 0;
                oVar.f307994e.mo145705p();
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    oVar.f307995f = 0;
                    oVar.f307996g = false;
                }
            } else if (oVar.f307996g) {
                Log.m105924i("FixRatioCropHelper", "ACTION_MOVE moveDirection :" + oVar.f307995f + "mBoxRect：" + oVar.f307993d + " originRect:" + oVar.f307999j);
                oVar.f307999j = new Rect(oVar.f307993d);
                if (motionEvent.getPointerCount() != 1 || (i5 = oVar.f307995f) <= 0) {
                    oVar.f307996g = false;
                } else {
                    if (i5 == 1) {
                        Log.m105924i("FixRatioCropHelper", "moveDirection: LEFT xDelta:" + (oVar.f307997h - motionEvent.getX()));
                        Rect rect7 = oVar.f307993d;
                        if (rect7.right >= rect7.left) {
                            oVar.mo145751f((int) (oVar.f307997h - motionEvent.getX()), oVar.f307995f, oVar.f307999j);
                        }
                    } else if (i5 == 2) {
                        Rect rect8 = oVar.f307993d;
                        if (rect8.bottom >= rect8.top) {
                            oVar.mo145753h((int) (oVar.f307998i - motionEvent.getY()), oVar.f307995f, oVar.f307999j);
                        }
                    } else if (i5 == 3) {
                        Rect rect9 = oVar.f307993d;
                        if (rect9.right >= rect9.left && rect9.bottom >= rect9.top) {
                            float y = oVar.f307998i - motionEvent.getY();
                            float x = oVar.f307997h - motionEvent.getX();
                            Log.m105924i("FixRatioCropHelper", "moveDirection: " + oVar.f307995f + " xDelta:" + x + " yDelta:" + y);
                            if (Math.abs(y) >= Math.abs(x)) {
                                oVar.mo145753h((int) y, oVar.f307995f, oVar.f307999j);
                            } else {
                                oVar.mo145753h((int) x, oVar.f307995f, oVar.f307999j);
                            }
                        }
                    } else if (i5 == 4) {
                        Rect rect10 = oVar.f307993d;
                        if (rect10.right >= rect10.left) {
                            Log.m105924i("FixRatioCropHelper", "moveDirection: RIGHT xDelta:" + (motionEvent.getX() - oVar.f307997h));
                            oVar.mo145752g((int) (motionEvent.getX() - oVar.f307997h), oVar.f307995f, oVar.f307999j);
                        }
                    } else if (i5 == 6) {
                        Rect rect11 = oVar.f307993d;
                        if (rect11.right >= rect11.left && rect11.bottom >= rect11.top) {
                            float y2 = oVar.f307998i - motionEvent.getY();
                            float x2 = motionEvent.getX() - oVar.f307997h;
                            Log.m105924i("FixRatioCropHelper", "moveDirection: " + oVar.f307995f + " xDelta:" + x2 + " yDelta:" + y2);
                            if (Math.abs(y2) >= Math.abs(x2)) {
                                oVar.mo145752g((int) y2, oVar.f307995f, oVar.f307999j);
                            } else {
                                oVar.mo145752g((int) x2, oVar.f307995f, oVar.f307999j);
                            }
                        }
                    } else if (i5 == 12) {
                        Rect rect12 = oVar.f307993d;
                        if (rect12.right >= rect12.left && rect12.bottom >= rect12.top) {
                            float y3 = motionEvent.getY() - oVar.f307998i;
                            float x3 = motionEvent.getX() - oVar.f307997h;
                            Log.m105924i("FixRatioCropHelper", "moveDirection: " + oVar.f307995f + " xDelta:" + x3 + " yDelta:" + y3);
                            if (Math.abs(y3) >= Math.abs(x3 / oVar.f307992c)) {
                                Log.m105924i("FixRatioCropHelper", "moveDirection: " + oVar.f307995f + " yDelta:" + y3);
                                oVar.mo145750e((int) y3, oVar.f307995f, oVar.f307999j);
                            } else {
                                Log.m105924i("FixRatioCropHelper", "moveDirection: " + oVar.f307995f + " xDelta:" + (x3 / oVar.f307992c));
                                oVar.mo145750e((int) (x3 / oVar.f307992c), oVar.f307995f, oVar.f307999j);
                            }
                        }
                    } else if (i5 == 8) {
                        Rect rect13 = oVar.f307993d;
                        if (rect13.bottom >= rect13.top) {
                            oVar.mo145750e((int) (motionEvent.getY() - oVar.f307998i), oVar.f307995f, oVar.f307999j);
                        }
                    } else if (i5 == 9) {
                        Rect rect14 = oVar.f307993d;
                        if (rect14.right >= rect14.left && rect14.bottom >= rect14.top) {
                            float y4 = motionEvent.getY() - oVar.f307998i;
                            float x4 = oVar.f307997h - motionEvent.getX();
                            Log.m105924i("FixRatioCropHelper", "moveDirection: " + oVar.f307995f + " xDelta:" + x4 + " yDelta:" + y4);
                            if (Math.abs(y4) >= Math.abs(x4)) {
                                oVar.mo145751f((int) y4, oVar.f307995f, oVar.f307999j);
                            } else {
                                oVar.mo145751f((int) x4, oVar.f307995f, oVar.f307999j);
                            }
                        }
                    }
                    oVar.f307994e.mo145725H();
                    oVar.f307996g = true;
                    oVar.f307994e.mo145704o();
                    oVar.f307997h = motionEvent.getX();
                    oVar.f307998i = motionEvent.getY();
                }
                oVar.f307994e.mo145689B(motionEvent);
            }
            return oVar.f307996g;
        }
        MotionEvent motionEvent3 = motionEvent;
        RectF curImageRect2 = ((C109612c) this.f307884a).f328158a.getBaseBoardView().getCurImageRect();
        float f17 = curImageRect2.top;
        float f18 = curImageRect2.bottom;
        Rect rect15 = this.f307922s;
        float f19 = f17 - (f18 - ((float) rect15.bottom));
        this.f307911M = f19;
        float f25 = f18 + (((float) rect15.top) - f17);
        this.f307912N = f25;
        float f26 = curImageRect2.left;
        float f27 = curImageRect2.right;
        float f28 = f26 - (f27 - ((float) rect15.right));
        this.f307913O = f28;
        float f29 = f27 + (((float) rect15.left) - f26);
        this.f307914P = f29;
        Rect rect16 = this.f307927x;
        int i6 = rect16.right;
        if (f29 > ((float) i6)) {
            this.f307914P = (float) i6;
        }
        int i7 = this.f307918o;
        if (f28 < ((float) i7)) {
            this.f307913O = (float) i7;
        }
        int i8 = rect16.bottom;
        if (f25 > ((float) i8)) {
            this.f307912N = (float) i8;
        }
        if (f19 < ((float) i7)) {
            this.f307911M = (float) i7;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.f307903E = false;
            C110980a aVar2 = this.f307901C;
            if (aVar2 != null) {
                aVar2.mo162647a();
            }
            if (this.f307924u.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f307906H = true;
            }
            if (this.f307923t.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f307905G = true;
            }
            if (this.f307925v.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f307904F = true;
            }
            if (this.f307926w.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f307907I = true;
            }
            this.f307908J = false;
            if (mo145723F()) {
                this.f307903E = true;
                boolean z = this.f307906H;
                if (z && this.f307904F) {
                    this.f307906H = true;
                    this.f307904F = true;
                    this.f307905G = false;
                    this.f307907I = false;
                } else if (!z || !this.f307907I) {
                    boolean z2 = this.f307905G;
                    if (z2 && this.f307907I) {
                        this.f307906H = false;
                        this.f307904F = false;
                        this.f307905G = true;
                        this.f307907I = true;
                    } else if (z2 && this.f307907I) {
                        this.f307906H = false;
                        this.f307904F = false;
                        this.f307905G = true;
                        this.f307907I = true;
                    }
                } else {
                    this.f307906H = true;
                    this.f307904F = false;
                    this.f307905G = false;
                    this.f307907I = true;
                }
                this.f307909K = motionEvent.getX();
                this.f307910L = motionEvent.getY();
            }
        } else if (actionMasked2 == 1) {
            float width2 = (((float) this.f307927x.width()) * 1.0f) / ((float) this.f307922s.width());
            float height2 = (((float) this.f307927x.height()) * 1.0f) / ((float) this.f307922s.height());
            if (width2 >= height2) {
                width2 = height2;
            }
            float centerX2 = ((float) this.f307927x.centerX()) - ((float) this.f307922s.centerX());
            float centerY2 = ((float) this.f307927x.centerY()) - ((float) this.f307922s.centerY());
            C119179t tVar2 = C119157j.f356862d;
            C104093c cVar = new C104093c(width2, centerX2, centerY2);
            long j2 = this.f307903E ? 0 : 100;
            C119157j jVar2 = (C119157j) tVar2;
            jVar2.getClass();
            jVar2.mo183892w(cVar, j2, false);
            if (mo145723F()) {
                this.f307903E = true;
            } else {
                this.f307903E = false;
            }
            this.f307906H = false;
            this.f307904F = false;
            this.f307905G = false;
            this.f307907I = false;
            mo145705p();
        } else if (actionMasked2 != 2) {
            if (actionMasked2 == 5) {
                this.f307906H = false;
                this.f307904F = false;
                this.f307905G = false;
                this.f307907I = false;
                this.f307903E = false;
            }
        } else if (this.f307903E) {
            if (motionEvent.getPointerCount() != 1 || !mo145723F()) {
                this.f307903E = false;
            } else {
                if (this.f307907I && (i4 = rect4.right) >= (rect4 = this.f307922s).left) {
                    if (i4 <= this.f307927x.right) {
                        float x5 = motionEvent.getX() - this.f307909K;
                        int i9 = this.f307927x.right;
                        Rect rect17 = this.f307922s;
                        int i15 = rect17.right;
                        if (x5 > ((float) (i9 - i15))) {
                            rect17.right = i9;
                        } else {
                            rect17.right = (int) (((float) i15) + (motionEvent.getX() - this.f307909K));
                        }
                    }
                    Rect rect18 = this.f307922s;
                    int i16 = rect18.right;
                    int i17 = rect18.left;
                    int i18 = this.f307918o;
                    if (i16 < (i18 * 2) + i17) {
                        rect18.right = i17 + (i18 * 2);
                    }
                    int i19 = rect18.right;
                    int i25 = this.f307927x.right;
                    if (i19 > i25) {
                        rect18.right = i25;
                    }
                    float f35 = curImageRect2.right;
                    if (((int) f35) <= ((int) this.f307914P) && ((int) f35) <= rect18.right) {
                        if (motionEvent.getX() - this.f307909K > this.f307914P - curImageRect2.right) {
                            mo145696g().postTranslate(this.f307914P - curImageRect2.right, 0.0f);
                        } else {
                            mo145696g().postTranslate(motionEvent.getX() - this.f307909K, 0.0f);
                        }
                    }
                    if (((float) this.f307922s.width()) > curImageRect2.width()) {
                        Rect rect19 = this.f307922s;
                        if (rect19.right < this.f307927x.right) {
                            float width3 = ((float) rect19.width()) / curImageRect2.width();
                            Matrix g = mo145696g();
                            Rect rect20 = this.f307922s;
                            g.postScale(width3, width3, (float) rect20.left, (float) rect20.centerY());
                        }
                    }
                }
                if (this.f307904F && (rect3 = this.f307922s).right >= (i3 = rect3.left)) {
                    if (i3 >= this.f307927x.left) {
                        float x6 = this.f307909K - motionEvent.getX();
                        Rect rect21 = this.f307922s;
                        int i26 = rect21.left;
                        int i27 = this.f307927x.left;
                        if (x6 > ((float) (i26 - i27))) {
                            rect21.left = i27;
                        } else {
                            rect21.left = (int) (((float) i26) - (this.f307909K - motionEvent.getX()));
                        }
                    }
                    Rect rect22 = this.f307922s;
                    int i28 = rect22.left;
                    int i29 = rect22.right;
                    int i35 = this.f307918o;
                    if (i28 > i29 - (i35 * 2)) {
                        rect22.left = i29 - (i35 * 2);
                    }
                    int i36 = rect22.left;
                    int i37 = this.f307927x.left;
                    if (i36 < i37) {
                        rect22.left = i37;
                    }
                    float f36 = curImageRect2.left;
                    if (((int) f36) >= ((int) this.f307913O) && ((int) f36) >= rect22.left) {
                        if (this.f307909K - motionEvent.getX() > curImageRect2.left - this.f307913O) {
                            mo145696g().postTranslate(this.f307913O - curImageRect2.left, 0.0f);
                        } else {
                            mo145696g().postTranslate(motionEvent.getX() - this.f307909K, 0.0f);
                        }
                    }
                    if (((float) this.f307922s.width()) > curImageRect2.width()) {
                        Rect rect23 = this.f307922s;
                        if (rect23.left > this.f307927x.left) {
                            float width4 = ((float) rect23.width()) / curImageRect2.width();
                            Matrix g2 = mo145696g();
                            Rect rect24 = this.f307922s;
                            g2.postScale(width4, width4, (float) rect24.right, (float) rect24.centerY());
                        }
                    }
                }
                if (this.f307905G && (rect2 = this.f307922s).bottom >= (i2 = rect2.top)) {
                    if (i2 >= this.f307927x.top) {
                        float y5 = this.f307910L - motionEvent.getY();
                        Rect rect25 = this.f307922s;
                        int i38 = rect25.top;
                        int i39 = this.f307927x.top;
                        if (y5 > ((float) (i38 - i39))) {
                            rect25.top = i39;
                        } else {
                            rect25.top = (int) (((float) i38) - (this.f307910L - motionEvent.getY()));
                        }
                    }
                    Rect rect26 = this.f307922s;
                    int i44 = rect26.top;
                    int i45 = rect26.bottom;
                    int i46 = this.f307918o;
                    if (i44 > i45 - (i46 * 2)) {
                        rect26.top = i45 - (i46 * 2);
                    }
                    int i47 = rect26.top;
                    int i48 = this.f307927x.top;
                    if (i47 < i48) {
                        rect26.top = i48;
                    }
                    float f37 = curImageRect2.top;
                    if (((int) f37) >= ((int) this.f307911M) && ((int) f37) >= rect26.top) {
                        if (this.f307910L - motionEvent.getY() > curImageRect2.top - this.f307911M) {
                            mo145696g().postTranslate(0.0f, this.f307911M - curImageRect2.top);
                        } else {
                            mo145696g().postTranslate(0.0f, motionEvent.getY() - this.f307910L);
                        }
                    }
                    if (((float) this.f307922s.height()) > curImageRect2.height()) {
                        Rect rect27 = this.f307922s;
                        if (rect27.top > this.f307927x.top) {
                            float height3 = ((float) rect27.height()) / curImageRect2.height();
                            mo145696g().postScale(height3, height3, (float) this.f307922s.centerX(), (float) this.f307922s.bottom);
                        }
                    }
                }
                if (this.f307906H && (i = rect.bottom) >= (rect = this.f307922s).top) {
                    if (i <= this.f307927x.bottom) {
                        float y6 = motionEvent.getY() - this.f307910L;
                        int i49 = this.f307927x.bottom;
                        Rect rect28 = this.f307922s;
                        int i54 = rect28.bottom;
                        if (y6 > ((float) (i49 - i54))) {
                            rect28.bottom = i49;
                        } else {
                            rect28.bottom = (int) (((float) i54) + (motionEvent.getY() - this.f307910L));
                        }
                    }
                    Rect rect29 = this.f307922s;
                    int i55 = rect29.bottom;
                    int i56 = rect29.top;
                    int i57 = this.f307918o;
                    if (i55 < (i57 * 2) + i56) {
                        rect29.bottom = i56 + (i57 * 2);
                    }
                    int i58 = rect29.bottom;
                    int i59 = this.f307927x.bottom;
                    if (i58 > i59) {
                        rect29.bottom = i59;
                    }
                    float f38 = curImageRect2.bottom;
                    if (((int) f38) <= ((int) this.f307912N) && ((int) f38) <= rect29.bottom) {
                        if (motionEvent.getY() - this.f307910L > this.f307912N - curImageRect2.bottom) {
                            mo145696g().postTranslate(0.0f, this.f307912N - curImageRect2.bottom);
                        } else {
                            mo145696g().postTranslate(0.0f, motionEvent.getY() - this.f307910L);
                        }
                    }
                    if (((float) this.f307922s.height()) > curImageRect2.height()) {
                        Rect rect30 = this.f307922s;
                        if (rect30.bottom < this.f307927x.bottom) {
                            float height4 = ((float) rect30.height()) / curImageRect2.height();
                            mo145696g().postScale(height4, height4, (float) this.f307922s.centerX(), (float) this.f307922s.top);
                        }
                    }
                }
                mo145725H();
                this.f307903E = true;
                mo145704o();
                this.f307909K = motionEvent.getX();
                this.f307910L = motionEvent.getY();
            }
            mo145689B(motionEvent);
        }
        return this.f307903E;
    }

    /* renamed from: v */
    public void mo145711v(Canvas canvas) {
        if (!this.f307900B) {
            canvas.setMatrix((Matrix) null);
        } else {
            canvas.setMatrix(this.f307921r);
        }
        C112571a aVar = this.f307928y;
        boolean z = this.f307908J;
        boolean z2 = this.f307929z;
        boolean z3 = this.f307899A;
        boolean z4 = ((C109612c) this.f307884a).f328167j;
        if (aVar.f337055d == null) {
            Log.m105920e("MicroMsg.CropItem", "[draw] mBoxRect is null!");
            return;
        }
        if (z) {
            canvas.save();
            canvas.clipRect(aVar.f337055d, Region.Op.DIFFERENCE);
            canvas.drawPaint(C112571a.f337051s);
            canvas.restore();
        }
        if (z2) {
            if (!C112571a.f337054v.equals(aVar.f337055d) || z4) {
                C112571a.f337048p.reset();
                Path path = C112571a.f337048p;
                Rect rect = aVar.f337055d;
                path.moveTo((float) rect.left, (float) rect.top);
                Path path2 = C112571a.f337048p;
                Rect rect2 = aVar.f337055d;
                path2.lineTo((float) rect2.right, (float) rect2.top);
                Path path3 = C112571a.f337048p;
                Rect rect3 = aVar.f337055d;
                path3.lineTo((float) rect3.right, (float) rect3.bottom);
                Path path4 = C112571a.f337048p;
                Rect rect4 = aVar.f337055d;
                path4.lineTo((float) rect4.left, (float) rect4.bottom);
                C112571a.f337048p.close();
                if (z3) {
                    C112571a.f337052t.setAlpha(aVar.f337058g);
                } else {
                    C112571a.f337052t.setAlpha(0);
                }
                C112571a.f337047o.reset();
                for (int i = 1; i < 3; i++) {
                    Path path5 = C112571a.f337047o;
                    Rect rect5 = aVar.f337055d;
                    path5.moveTo((float) (rect5.left + ((rect5.width() / 3) * i)), (float) aVar.f337055d.top);
                    Path path6 = C112571a.f337047o;
                    Rect rect6 = aVar.f337055d;
                    path6.lineTo((float) (rect6.left + ((rect6.width() / 3) * i)), (float) aVar.f337055d.bottom);
                    Path path7 = C112571a.f337047o;
                    Rect rect7 = aVar.f337055d;
                    path7.moveTo((float) rect7.left, (float) (rect7.top + ((rect7.height() / 3) * i)));
                    Path path8 = C112571a.f337047o;
                    Rect rect8 = aVar.f337055d;
                    path8.lineTo((float) rect8.right, (float) (rect8.top + ((rect8.height() / 3) * i)));
                }
            }
            Rect rect9 = aVar.f337055d;
            canvas.drawRect((float) rect9.left, (float) rect9.top, (float) rect9.right, (float) rect9.bottom, C112571a.f337050r);
            canvas.drawPath(C112571a.f337047o, C112571a.f337052t);
            canvas.drawPath(C112571a.f337048p, C112571a.f337049q);
            Rect rect10 = aVar.f337055d;
            float f = (float) rect10.left;
            float f2 = C112571a.f337045j;
            float f3 = ((float) rect10.top) - (f2 / 2.0f);
            canvas.drawLine(f - f2, f3, f + C112571a.f337046n, f3, C112571a.f337053u);
            Rect rect11 = aVar.f337055d;
            float f4 = (float) rect11.right;
            float f5 = C112571a.f337045j;
            float f6 = f5 / 2.0f;
            float f7 = (f4 - C112571a.f337046n) + f6;
            float f8 = ((float) rect11.top) - f6;
            canvas.drawLine(f7, f8, f5 + f4, f8, C112571a.f337053u);
            Rect rect12 = aVar.f337055d;
            float f9 = C112571a.f337045j / 2.0f;
            float f15 = ((float) rect12.left) - f9;
            float f16 = (float) rect12.top;
            canvas.drawLine(f15, f16 - f9, f15, f16 + C112571a.f337046n, C112571a.f337053u);
            Rect rect13 = aVar.f337055d;
            float f17 = C112571a.f337045j / 2.0f;
            float f18 = ((float) rect13.left) - f17;
            float f19 = (float) rect13.bottom;
            canvas.drawLine(f18, (f19 - C112571a.f337046n) + f17, f18, f19 + f17, C112571a.f337053u);
            Rect rect14 = aVar.f337055d;
            float f25 = ((float) rect14.right) + (C112571a.f337045j / 2.0f);
            float f26 = (float) rect14.top;
            canvas.drawLine(f25, f26, f25, f26 + C112571a.f337046n, C112571a.f337053u);
            Rect rect15 = aVar.f337055d;
            float f27 = C112571a.f337045j / 2.0f;
            float f28 = ((float) rect15.right) + f27;
            float f29 = (float) rect15.bottom;
            canvas.drawLine(f28, (f29 - C112571a.f337046n) + f27, f28, f29 + f27, C112571a.f337053u);
            Rect rect16 = aVar.f337055d;
            float f35 = (float) rect16.left;
            float f36 = C112571a.f337045j;
            float f37 = ((float) rect16.bottom) + (f36 / 2.0f);
            canvas.drawLine(f35 - f36, f37, f35 + C112571a.f337046n, f37, C112571a.f337053u);
            Rect rect17 = aVar.f337055d;
            float f38 = (float) rect17.right;
            float f39 = C112571a.f337045j;
            float f44 = (f39 / 2.0f) + ((float) rect17.bottom);
            canvas.drawLine(f38 - C112571a.f337046n, f44, f39 + f38, f44, C112571a.f337053u);
            if (!C112571a.f337054v.equals(aVar.f337055d)) {
                C112571a.f337054v.set(aVar.f337055d);
            }
        }
    }

    /* renamed from: x */
    public void mo145713x() {
        super.mo145713x();
        View actionBar = ((C109612c) this.f307884a).f328158a.getActionBar();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(actionBar, aVar.mo10232b(), "com/tencent/mm/artists/CropArtist", "onSelected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        actionBar.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(actionBar, "com/tencent/mm/artists/CropArtist", "onSelected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f307916R.setEmpty();
        if (mo145692c() == null) {
            Log.m105920e("MicroMsg.CropArtist", "[onSelected] getCache is null!");
            return;
        }
        if (((C107544a) mo145692c()).mo157975D1(true) <= 0) {
            C112571a aVar2 = new C112571a();
            aVar2.f337057f.set(mo145696g());
            Stack<C112571a> stack = ((C107544a) mo145692c()).f321765d;
            if (stack != null) {
                stack.push(aVar2);
            }
            mo145724G();
            ((C109612c) this.f307884a).f328158a.getBaseBoardView().f320136i = this.f307922s;
            ((C109612c) this.f307884a).f328158a.getBaseBoardView().mo157328b(new C104091a(), 0.0f, false);
        } else {
            C107544a aVar3 = (C107544a) mo145692c();
            Stack<C112571a> stack2 = aVar3.f321765d;
            C112571a peek = (stack2 == null || stack2.size() <= 0) ? null : aVar3.f321765d.peek();
            if (peek == null) {
                Log.m105920e("MicroMsg.CropArtist", "item is null!!!");
                return;
            }
            this.f307922s.set(new Rect(peek.f337055d));
            ((C109612c) this.f307884a).f328158a.getBaseBoardView().f320136i = peek.f337055d;
            try {
                C112571a aVar4 = (C112571a) peek.clone();
                Stack<C112571a> stack3 = ((C107544a) mo145692c()).f321765d;
                if (stack3 != null) {
                    stack3.push(aVar4);
                }
            } catch (CloneNotSupportedException e) {
                Log.printErrStackTrace("MicroMsg.CropArtist", e, "", new Object[0]);
            }
            ((C109612c) this.f307884a).f328158a.getBaseBoardView().mo157328b(new C104092b(), 0.0f, false);
        }
        ((C109612c) this.f307884a).f328158a.getBaseBoardView().setOneFingerMoveEnable(true);
    }

    /* renamed from: y */
    public void mo145714y() {
    }
}
