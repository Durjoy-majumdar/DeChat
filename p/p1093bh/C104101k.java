package p1093bh;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.TextModeSelectView;
import com.tencent.p014mm.view.footer.SelectColorBar;
import com.tencent.wxmm.v2helper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;
import me3.C109612c;
import me3.c$c$$a;
import p1158tg.C110984c;
import p1158tg.C110985d;
import p1158tg.C110986e;
import p248ug.C111164r0;
import p520fi.C107547d;
import v40.C111385a;
import z20.C112573c;
import z20.C112579f;

/* renamed from: bh.k */
public class C104101k extends C104085b<C107547d> {

    /* renamed from: A */
    public boolean f307960A = false;

    /* renamed from: B */
    public Paint f307961B;

    /* renamed from: C */
    public boolean f307962C = false;

    /* renamed from: D */
    public boolean f307963D = false;

    /* renamed from: E */
    public C110986e f307964E = new C110986e(this);

    /* renamed from: F */
    public C111385a f307965F;

    /* renamed from: G */
    public Matrix f307966G = new Matrix();

    /* renamed from: H */
    public boolean f307967H = false;

    /* renamed from: o */
    public final Handler f307968o = new Handler(Looper.getMainLooper());

    /* renamed from: p */
    public volatile boolean f307969p = false;

    /* renamed from: q */
    public Runnable f307970q;

    /* renamed from: r */
    public Rect f307971r = new Rect();

    /* renamed from: s */
    public Rect f307972s = new Rect();

    /* renamed from: t */
    public boolean f307973t = false;

    /* renamed from: u */
    public boolean f307974u = false;

    /* renamed from: v */
    public boolean f307975v = false;

    /* renamed from: w */
    public float f307976w = 0.0f;

    /* renamed from: x */
    public float f307977x = 0.0f;

    /* renamed from: y */
    public int f307978y = 0;

    /* renamed from: z */
    public int f307979z = 0;

    /* renamed from: bh.k$a */
    public static class C104102a implements Runnable {

        /* renamed from: d */
        public WeakReference<? extends C104101k> f307980d;

        public C104102a(C104101k kVar) {
            this.f307980d = new WeakReference<>(kVar);
        }

        public void run() {
            C112573c d;
            Log.m105918d("MicroMsg.EmojiAndTextArtist", "cancel focus!");
            C104101k kVar = (C104101k) this.f307980d.get();
            if (kVar != null && kVar.mo145692c() != null && (d = ((C107547d) kVar.mo145692c()).mo157991d()) != null && d.f337073p) {
                d.mo164319m(false);
                kVar.mo145688A(false);
                kVar.mo145704o();
            }
        }
    }

    /* renamed from: C */
    public final C112573c mo145739C(float f, float f2) {
        if (mo145692c() == null) {
            Log.m105920e("MicroMsg.EmojiAndTextArtist", "[isContainsItem] getCache is null!");
            return null;
        }
        Stack<C112573c> stack = ((C107547d) mo145692c()).f321774d;
        ListIterator<C112573c> listIterator = stack.listIterator(stack.size());
        while (listIterator.hasPrevious()) {
            C112573c previous = listIterator.previous();
            float[] a = mo145690a(f, f2);
            float f3 = a[0];
            float f4 = a[1];
            ((ArrayList) previous.f337079v).clear();
            ((ArrayList) previous.f337079v).add(previous.mo164315h(previous.f337080w - 180.0f));
            ((ArrayList) previous.f337079v).add(previous.mo164315h(-previous.f337080w));
            ((ArrayList) previous.f337079v).add(previous.mo164315h(previous.f337080w));
            ((ArrayList) previous.f337079v).add(previous.mo164315h((-previous.f337080w) + 180.0f));
            C112573c.C112574a aVar = new C112573c.C112574a(previous, previous.f337079v);
            int i = aVar.f337084c - 1;
            boolean z = false;
            for (int i2 = 0; i2 < aVar.f337084c; i2++) {
                float[] fArr = aVar.f337083b;
                float f5 = fArr[i2];
                if ((f5 < f4 && fArr[i] >= f4) || (fArr[i] < f4 && f5 >= f4)) {
                    float[] fArr2 = aVar.f337082a;
                    float f6 = fArr2[i2];
                    if (f6 + (((f4 - f5) / (fArr[i] - f5)) * (fArr2[i] - f6)) < f3) {
                        z = !z;
                    }
                }
                i = i2;
            }
            if (z) {
                return previous;
            }
        }
        return null;
    }

    /* renamed from: D */
    public final void mo145740D() {
        Log.m105918d("MicroMsg.EmojiAndTextArtist", "[registerFocusTask]");
        if (this.f307970q != null) {
            this.f307968o.removeCallbacksAndMessages((Object) null);
        }
        if (this.f307969p) {
            Log.m105928w("MicroMsg.EmojiAndTextArtist", "[registerFocusTask] isTimerCancel=true");
            return;
        }
        C104102a aVar = new C104102a(this);
        this.f307970q = aVar;
        this.f307968o.postDelayed(aVar, 1500);
    }

    /* renamed from: E */
    public final C112573c mo145741E() {
        C107547d dVar = (C107547d) mo145692c();
        C112573c cVar = null;
        if (dVar == null) {
            return null;
        }
        Stack<C112573c> stack = dVar.f321774d;
        ListIterator<C112573c> listIterator = stack.listIterator(stack.size());
        while (listIterator.hasPrevious()) {
            C112573c previous = listIterator.previous();
            if (previous.f337073p) {
                cVar = previous;
            }
            previous.mo164319m(false);
        }
        return cVar;
    }

    /* renamed from: F */
    public final void mo145742F() {
        Log.m105918d("MicroMsg.EmojiAndTextArtist", "[unRegisterFocusTask]");
        if (this.f307970q != null) {
            this.f307968o.removeCallbacksAndMessages((Object) null);
            this.f307970q = null;
        }
    }

    /* renamed from: k */
    public C104084a mo145700k() {
        return C104084a.EMOJI_AND_TEXT;
    }

    /* renamed from: q */
    public void mo145706q() {
        super.mo145706q();
        int dimension = (int) MMApplicationContext.getResources().getDimension(C0966R.dimen.ale);
        int c = C75044y4.m89991c(((C109612c) this.f307884a).f328158a.getContext());
        this.f307971r.set((mo145691b().width() - dimension) / 2, (mo145691b().height() - ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.ald))) - c, mo145691b().width() - c, (mo145691b().width() + dimension) / 2);
        if (this.f307969p) {
            Log.m105925i("MicroMsg.EmojiAndTextArtist", "onAlive: isTimerCancel=%s", Boolean.valueOf(this.f307969p));
            this.f307968o.removeCallbacksAndMessages((Object) null);
        }
        if (this.f307961B == null) {
            Paint paint = new Paint();
            this.f307961B = paint;
            paint.setColor(MMApplicationContext.getColor(C0966R.color.f3553xj));
            this.f307961B.setStrokeWidth(5.0f);
            this.f307961B.setStyle(Paint.Style.STROKE);
            this.f307961B.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        }
    }

    /* renamed from: t */
    public void mo145709t() {
        super.mo145709t();
        this.f307969p = true;
        mo145742F();
        this.f307968o.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: u */
    public boolean mo145710u(MotionEvent motionEvent) {
        C112573c d;
        C111385a aVar;
        boolean z;
        int i;
        C111385a aVar2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo145742F();
            C112573c C = mo145739C(motionEvent.getX(), motionEvent.getY());
            if (C == null) {
                this.f307973t = false;
                if ((mo145692c() == null || (d = ((C107547d) mo145692c()).mo157991d()) == null) ? false : d.f337073p) {
                    mo145741E();
                    mo145688A(false);
                    mo145704o();
                }
            } else {
                boolean z2 = C.f337077t;
                mo145741E();
                this.f307973t = true;
                C.mo164319m(true);
                C.f337077t = z2;
                C.f337074q.set(C.f337069i);
                C107547d dVar = (C107547d) mo145692c();
                dVar.f321774d.remove(dVar.f321774d.indexOf(C));
                dVar.f321774d.push(C);
                mo145688A(true);
                mo145704o();
            }
        } else if (actionMasked == 1) {
            if (!(this.f307888e && this.f307887d)) {
                Log.m105920e("MicroMsg.EmojiAndTextArtist", "[ACTION_UP] is not alive!");
                return false;
            } else if (mo145692c() == null) {
                Log.m105920e("MicroMsg.EmojiAndTextArtist", "[getCache] is null!");
                return false;
            } else {
                C112573c d2 = ((C107547d) mo145692c()).mo157991d();
                if (d2 != null) {
                    if (this.f307963D) {
                        d2.mo164316j(this.f307972s);
                        z = this.f307886c.contains(this.f307972s);
                    } else {
                        Rect rect = this.f307886c;
                        PointF pointF = d2.f337069i;
                        z = rect.contains((int) pointF.x, (int) pointF.y);
                    }
                    if (!z) {
                        C110986e eVar = this.f307964E;
                        eVar.f332399a = true;
                        PointF pointF2 = d2.f337074q;
                        float f = pointF2.x;
                        PointF pointF3 = d2.f337069i;
                        eVar.f332406f = f - pointF3.x;
                        float f2 = pointF2.y - pointF3.y;
                        eVar.getClass();
                        eVar.f332405e = d2.f337065e;
                        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("deltaY", new float[]{0.0f, f2}), PropertyValuesHolder.ofFloat("deltaX", new float[]{0.0f, eVar.f332406f})});
                        eVar.f332404d = ofPropertyValuesHolder;
                        ofPropertyValuesHolder.addUpdateListener(new C110984c(eVar));
                        eVar.f332404d.addListener(new C110985d(eVar));
                        eVar.f332404d.setInterpolator(new LinearInterpolator());
                        eVar.f332404d.setDuration(100);
                        eVar.f332404d.start();
                    }
                    if (d2 instanceof C112579f) {
                        C112579f fVar = (C112579f) d2;
                        boolean z3 = fVar.f337073p;
                        if (z3 && fVar.f337077t) {
                            C111385a aVar3 = this.f307965F;
                            if (aVar3 != null) {
                                C109612c.C109616c cVar = (C109612c.C109616c) aVar3;
                                EditText editText = (EditText) C109612c.this.f328158a.getTextEditView().findViewById(C0966R.C0970id.ki7);
                                editText.setTag(fVar);
                                C109612c.C109620e eVar2 = C109612c.this.f328172o;
                                if (eVar2 == null || !eVar2.mo79171a(fVar)) {
                                    editText.setText(fVar.f337106C);
                                    TextModeSelectView textModeSelectView = (TextModeSelectView) C109612c.this.f328158a.findViewById(C0966R.C0970id.a8q);
                                    SelectColorBar selectColorBar = (SelectColorBar) C109612c.this.f328158a.findViewById(C0966R.C0970id.j9j);
                                    if (fVar.f337111z != 0) {
                                        textModeSelectView.setMode(3);
                                    } else if (fVar.f337104A) {
                                        textModeSelectView.setMode(2);
                                    } else {
                                        textModeSelectView.setMode(1);
                                    }
                                    if (textModeSelectView.getCurMode() == 3) {
                                        selectColorBar.setSelectColor(fVar.f337111z);
                                    } else {
                                        selectColorBar.setSelectColor(fVar.f337110y);
                                    }
                                    editText.setTextColor(fVar.f337110y);
                                    editText.setTag(fVar);
                                    C109612c.this.mo160834r(true);
                                    C109612c cVar2 = C109612c.this;
                                    if (cVar2.f328159b.f332924a == C111164r0.C111166b.VIDEO_COVER && (cVar2.mo160819c() instanceof MMActivity)) {
                                        C109612c.this.f328158a.getTextEditView().post(new c$c$$a(cVar));
                                    }
                                }
                            }
                        } else if (z3) {
                            fVar.f337077t = true;
                        }
                    }
                    PointF pointF4 = d2.f337069i;
                    float[] fArr = {pointF4.x, pointF4.y};
                    this.f307885b.mapPoints(fArr);
                    Log.m105925i("MicroMsg.EmojiAndTextArtist", "mRubbishRect:%s pointF:%s", this.f307971r, Float.valueOf(fArr[1]));
                    if (d2.f337073p && ((float) this.f307971r.top) <= fArr[1] && this.f307973t && this.f307965F != null) {
                        C112573c pop = ((C107547d) mo145692c()).f321774d.pop();
                    }
                }
                mo145740D();
                if (this.f307974u && (aVar = this.f307965F) != null) {
                    C109612c.C109616c cVar3 = (C109612c.C109616c) aVar;
                    C109612c.m148909a(C109612c.this, false);
                    C109612c.C109620e eVar3 = C109612c.this.f328172o;
                    if (eVar3 != null) {
                        eVar3.mo79172b();
                    }
                }
                this.f307974u = false;
                this.f307975v = false;
                mo145704o();
            }
        } else if (actionMasked != 2) {
            if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.f307962C = true;
                }
            } else if (this.f307973t) {
                this.f307976w = (float) mo145694e(motionEvent);
                this.f307978y = (int) Math.toDegrees(Math.atan2((double) mo145695f(motionEvent)[0], (double) mo145695f(motionEvent)[1]));
                C112573c d3 = ((C107547d) mo145692c()).mo157991d();
                if (d3 != null && d3.f337073p) {
                    this.f307979z = d3.f337070j;
                    this.f307977x = d3.f337071n;
                }
            } else {
                int[] iArr = new int[2];
                if (motionEvent.getPointerCount() > 1) {
                    iArr[0] = ((int) (motionEvent.getX(0) + motionEvent.getX(1))) / 2;
                    iArr[1] = ((int) (motionEvent.getY(0) + motionEvent.getY(1))) / 2;
                }
                C112573c C2 = mo145739C((float) iArr[0], (float) iArr[1]);
                if (C2 != null) {
                    boolean z4 = C2.f337077t;
                    mo145741E();
                    C2.f337077t = z4;
                    this.f307973t = true;
                    C2.mo164319m(true);
                    C107547d dVar2 = (C107547d) mo145692c();
                    dVar2.f321774d.remove(dVar2.f321774d.indexOf(C2));
                    dVar2.f321774d.push(C2);
                    this.f307976w = (float) mo145694e(motionEvent);
                    this.f307978y = (int) Math.toDegrees(Math.atan2((double) mo145695f(motionEvent)[0], (double) mo145695f(motionEvent)[1]));
                    if (C2.f337073p) {
                        this.f307979z = C2.f337070j;
                        this.f307977x = C2.f337071n;
                    }
                    mo145688A(true);
                    mo145704o();
                }
            }
        } else if (this.f307962C) {
            this.f307962C = false;
            return true;
        } else if (this.f307973t && mo145702m(motionEvent)) {
            if (!this.f307974u && (aVar2 = this.f307965F) != null) {
                C109612c.C109616c cVar4 = (C109612c.C109616c) aVar2;
                C109612c.m148909a(C109612c.this, true);
                C109612c.C109620e eVar4 = C109612c.this.f328172o;
                if (eVar4 != null) {
                    eVar4.mo79173c(Boolean.TRUE);
                }
            }
            int[] iArr2 = {(int) (motionEvent.getX(0) - this.f307893j.x), (int) (motionEvent.getY(0) - this.f307893j.y)};
            float f3 = 1.0f;
            if (motionEvent.getPointerCount() > 1) {
                if (0.0f != this.f307976w) {
                    f3 = ((float) mo145694e(motionEvent)) / this.f307976w;
                }
                i = this.f307978y - ((int) Math.toDegrees(Math.atan2((double) mo145695f(motionEvent)[0], (double) mo145695f(motionEvent)[1])));
                this.f307975v = true;
            } else {
                this.f307975v = false;
                i = 0;
            }
            float f4 = (float) iArr2[0];
            float f5 = (float) iArr2[1];
            float f6 = this.f307977x;
            int i2 = this.f307979z;
            int pointerCount = motionEvent.getPointerCount();
            C112573c d4 = ((C107547d) mo145692c()).mo157991d();
            if (d4 != null) {
                this.f307966G.reset();
                this.f307966G.postRotate(-mo145697h());
                Matrix matrix = this.f307966G;
                Matrix matrix2 = new Matrix();
                matrix.invert(matrix2);
                float[] fArr2 = {f4, f5};
                matrix2.mapPoints(fArr2);
                if (pointerCount > 1) {
                    int i3 = (i + i2) % v2helper.VOIP_ENC_HEIGHT_LV1;
                    float f7 = f3 * f6;
                    d4.f337069i.offset(0.0f, 0.0f);
                    if (0.0f != f7) {
                        d4.f337071n = f7;
                    }
                    d4.f337070j = i3;
                } else {
                    float j = fArr2[0] / mo145699j();
                    float j2 = fArr2[1] / mo145699j();
                    int i4 = d4.f337070j;
                    d4.f337069i.offset(j, j2);
                    d4.f337070j = i4;
                }
                d4.mo164318l();
                PointF pointF5 = d4.f337069i;
                float[] fArr3 = {pointF5.x, pointF5.y};
                this.f307885b.mapPoints(fArr3);
                Rect rect2 = this.f307971r;
                float f8 = (float) rect2.top;
                float f9 = fArr3[1];
                if (f8 <= f9) {
                    C111385a aVar4 = this.f307965F;
                    if (aVar4 != null) {
                        C109612c.C109616c cVar5 = (C109612c.C109616c) aVar4;
                        Log.m105925i("MicroMsg.DrawingPresenter", "[onReach] distance:%s", Float.valueOf((f9 - f8) / ((float) rect2.height())));
                        cVar5.f328180a.setActivated(true);
                        cVar5.f328181b.setText(C109612c.this.mo160819c().getString(C0966R.string.i_k));
                        cVar5.f328182c.setImageDrawable(C74933u4.m89768e(C109612c.this.mo160819c(), C0966R.raw.icons_filled_delete_on, -1));
                    }
                    this.f307967H = true;
                } else {
                    C111385a aVar5 = this.f307965F;
                    if (aVar5 != null && this.f307967H) {
                        C109612c.C109616c cVar6 = (C109612c.C109616c) aVar5;
                        Log.m105924i("MicroMsg.DrawingPresenter", "[onUnReach]");
                        cVar6.f328180a.setActivated(false);
                        cVar6.f328182c.setImageDrawable(C74933u4.m89768e(C109612c.this.mo160819c(), C0966R.raw.icons_filled_delete, -1));
                        cVar6.f328181b.setText(C109612c.this.mo160819c().getString(C0966R.string.i_l));
                    }
                    this.f307967H = false;
                }
                if (d4 instanceof C112579f) {
                    d4.f337077t = false;
                }
            }
            this.f307974u = true;
            mo145704o();
        }
        super.mo145710u(motionEvent);
        return this.f307973t;
    }

    /* renamed from: v */
    public void mo145711v(Canvas canvas) {
        C107547d dVar = (C107547d) mo145692c();
        C112573c d = dVar != null ? dVar.mo157991d() : null;
        if (this.f307960A && this.f307974u) {
            Rect rect = this.f307886c;
            C112573c d2 = ((C107547d) mo145692c()).mo157991d();
            if (d2 != null) {
                d2.mo164316j(this.f307972s);
                if (!rect.contains(this.f307972s)) {
                    canvas.drawRoundRect((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom, 5.0f, 5.0f, this.f307961B);
                }
                if (d2.f337070j % 90 == 0 && this.f307975v) {
                    canvas.drawLine((float) rect.left, (float) (rect.top + (rect.height() / 2)), (float) rect.right, (float) (rect.top + (rect.height() / 2)), this.f307961B);
                    canvas.drawLine((float) (rect.left + (rect.width() / 2)), (float) rect.top, (float) (rect.left + (rect.width() / 2)), (float) rect.bottom, this.f307961B);
                }
            }
        }
        mo145708s(canvas);
        if (d != null && d.f337073p) {
            d.mo164308c(canvas);
        }
    }

    /* renamed from: y */
    public void mo145714y() {
    }
}
