package ai2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi2.C104149h;
import bi2.C92262a;
import bi2.C92267g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.item.EditorItemContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import fi2.C107552a;
import fi2.C107554b;
import fy3.C32227p;
import gi2.C107810a;
import gi2.C107818f;
import gi2.C98129b;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C49044cs2;
import zg2.C103020m;

/* renamed from: ai2.o */
public class C92021o extends View implements C92015i, C107818f {

    /* renamed from: A */
    public final float[] f263465A;

    /* renamed from: B */
    public final float[] f263466B;

    /* renamed from: C */
    public final Matrix f263467C;

    /* renamed from: D */
    public final C107810a f263468D;

    /* renamed from: E */
    public EditorItemContainer.C94437a f263469E;

    /* renamed from: F */
    public final C107554b f263470F;

    /* renamed from: G */
    public CharSequence f263471G;

    /* renamed from: H */
    public float f263472H;

    /* renamed from: I */
    public C92011d f263473I;

    /* renamed from: J */
    public ArrayList<Bitmap> f263474J;

    /* renamed from: K */
    public int f263475K;

    /* renamed from: L */
    public Paint f263476L;

    /* renamed from: M */
    public Paint f263477M;

    /* renamed from: N */
    public Rect f263478N;

    /* renamed from: P */
    public final Rect f263479P;

    /* renamed from: Q */
    public boolean f263480Q;

    /* renamed from: R */
    public C92020n f263481R;

    /* renamed from: S */
    public Matrix f263482S;

    /* renamed from: T */
    public float f263483T;

    /* renamed from: U */
    public float f263484U;

    /* renamed from: V */
    public boolean f263485V;

    /* renamed from: W */
    public final int f263486W;

    /* renamed from: d */
    public final ArrayList<C49044cs2> f263487d = new ArrayList<>();

    /* renamed from: e */
    public long f263488e;

    /* renamed from: f */
    public long f263489f;

    /* renamed from: g */
    public long f263490g;

    /* renamed from: h */
    public int f263491h;

    /* renamed from: i */
    public int f263492i;

    /* renamed from: j */
    public final String f263493j = "MicroMsg.LyricsItemView";

    /* renamed from: n */
    public final long f263494n = 50;

    /* renamed from: o */
    public final long f263495o = 200;

    /* renamed from: p */
    public final long f263496p = 3000;

    /* renamed from: q */
    public final int f263497q = 11;

    /* renamed from: r */
    public final float f263498r;

    /* renamed from: s */
    public final float f263499s;

    /* renamed from: t */
    public final int f263500t;

    /* renamed from: u */
    public final float f263501u;

    /* renamed from: v */
    public final float f263502v;

    /* renamed from: w */
    public final float f263503w;

    /* renamed from: x */
    public final int f263504x;

    /* renamed from: y */
    public final int f263505y;

    /* renamed from: z */
    public final RectF[] f263506z;

    /* renamed from: ai2.o$a */
    public static final class C92022a extends C87413o implements C32227p<Matrix, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92021o f263507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92022a(C92021o oVar) {
            super(2);
            this.f263507d = oVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Matrix matrix = (Matrix) obj;
            ((Boolean) obj2).booleanValue();
            C87412m.m108594g(matrix, "m");
            this.f263507d.getTouchTracker().f321806g.set(matrix);
            this.f263507d.postInvalidate();
            return C13598b0.f38549a;
        }
    }

    public C92021o(Context context) {
        super(context);
        int a = C74942w4.m89784a(context, 1);
        float f = (float) a;
        float f2 = 1.5f * f;
        this.f263498r = f2;
        this.f263499s = 9.0f * f;
        this.f263500t = a;
        this.f263501u = f2;
        this.f263502v = 12.0f * f;
        this.f263503w = f * 2.0f;
        this.f263504x = a;
        this.f263505y = C74942w4.m89784a(context, 32);
        RectF[] rectFArr = new RectF[11];
        for (int i = 0; i < 11; i++) {
            rectFArr[i] = new RectF();
        }
        this.f263506z = rectFArr;
        this.f263465A = new float[this.f263497q];
        this.f263466B = new float[9];
        this.f263467C = new Matrix();
        C107554b bVar = new C107554b();
        this.f263470F = bVar;
        this.f263472H = getResources().getDimension(C0966R.dimen.f357021a32);
        this.f263473I = C92011d.LYRICS;
        this.f263474J = new ArrayList<>();
        this.f263476L = new Paint();
        this.f263477M = new Paint();
        this.f263478N = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);
        this.f263479P = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);
        this.f263480Q = true;
        bVar.f321817r = 0.5f;
        bVar.f321816q = 3.0f;
        this.f263477M.setColor(Color.parseColor("#CCFFFFFF"));
        Resources resources = getResources();
        C87412m.m108593f(resources, "resources");
        this.f263468D = new C107810a(resources);
        this.f263486W = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f263489f = System.currentTimeMillis();
    }

    /* renamed from: a */
    public boolean mo53770a(long j) {
        return C107818f.C107819a.m146079c(this, j);
    }

    /* renamed from: c */
    public final void mo125922c() {
        for (C49044cs2 cs22 : this.f263487d) {
            if (!Util.isNullOrNil(cs22.f131928d)) {
                View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c6l, new LinearLayout(getContext()), false);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.k7y);
                C87412m.m108593f(textView, "lyricsText");
                C61926c.m72678c(textView);
                textView.setText(cs22.f131928d);
                C103020m mVar = C103020m.f303985a;
                textView.setMaxHeight(C103020m.f303987c.height());
                int i = this.f263505y;
                Rect rect = C103020m.f303987c;
                textView.setMaxWidth(i >= rect.left ? rect.width() - ((this.f263505y - C103020m.f303987c.left) * 2) : rect.width());
                inflate.measure(0, 0);
                inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
                int width = (inflate.getMeasuredWidth() <= 0 || inflate.getMeasuredWidth() > C103020m.f303987c.width()) ? C103020m.f303987c.width() : inflate.getMeasuredWidth();
                int height = (inflate.getMeasuredHeight() <= 0 || inflate.getMeasuredHeight() > C103020m.f303987c.height()) ? C103020m.f303987c.height() : inflate.getMeasuredHeight();
                String str = this.f263493j;
                Log.m105924i(str, "it.lyrics=" + cs22.f131928d + " lyricsText.maxWidth=" + textView.getMaxWidth() + " lyricsText.maxHeight=" + textView.getMaxHeight() + " parent.measuredWidth=" + inflate.getMeasuredWidth() + " parent.measuredHeight=" + inflate.getMeasuredHeight());
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                inflate.draw(new Canvas(createBitmap));
                this.f263473I = C92011d.LYRICS;
                this.f263474J.add(createBitmap);
            }
        }
    }

    /* renamed from: d */
    public C92007a mo53771d() {
        if (this.f263474J.isEmpty()) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(this.f263470F.f321806g);
        return new C92020n((List<? extends C49044cs2>) this.f263487d, matrix);
    }

    /* renamed from: e */
    public boolean mo53772e(String str) {
        return C107818f.C107819a.m146078b(this, str);
    }

    /* renamed from: f */
    public void mo53773f(Rect rect, float f) {
        C87412m.m108594g(rect, "displayRect");
        this.f263479P.set(rect);
    }

    /* renamed from: g */
    public void mo125923g(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (!this.f263487d.isEmpty()) {
            long j = this.f263490g;
            if (j == 0 || Util.milliSecondsToNow(j) > this.f263494n) {
                this.f263490g = System.currentTimeMillis();
                float f = 0.0f;
                RectF[] rectFArr = this.f263506z;
                int length = rectFArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    RectF rectF = rectFArr[i];
                    int i3 = i2 + 1;
                    float height = rectF.height();
                    int i4 = this.f263500t;
                    if (height <= ((float) i4)) {
                        this.f263465A[i2] = (float) (((double) this.f263499s) * Math.random());
                    } else {
                        float[] fArr = this.f263465A;
                        if (height >= fArr[i2]) {
                            fArr[i2] = (float) i4;
                        }
                    }
                    float min = height <= this.f263465A[i2] ? Math.min(height + this.f263503w, this.f263499s) : Math.max(height - ((float) this.f263504x), (float) this.f263500t);
                    float f2 = this.f263501u;
                    float f3 = this.f263499s;
                    float f4 = (float) 2;
                    float f5 = min / f4;
                    rectF.set(f + f2, (f3 / f4) - f5, f + f2 + this.f263498r, (f3 / f4) + f5);
                    f = rectF.right;
                    i++;
                    i2 = i3;
                }
            }
            mo125953k(this.f263487d.get(0).f131929e);
            this.f263477M.setAlpha(this.f263492i);
            for (RectF drawRect : this.f263506z) {
                canvas.drawRect(drawRect, this.f263477M);
            }
        }
    }

    public final int getAlpha() {
        return this.f263491h;
    }

    public final ArrayList<Bitmap> getBitmapList() {
        return this.f263474J;
    }

    public float[] getContentBoundary() {
        return (float[]) this.f263470F.f321813n.clone();
    }

    public final int getCurIndex() {
        return this.f263475K;
    }

    public final Rect getDisplayRect() {
        return this.f263479P;
    }

    public RectF getDrawRect() {
        float[] fArr = this.f263470F.f321813n;
        return new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public final long getDuration() {
        return this.f263488e;
    }

    public C92007a getEditorData() {
        return this.f263481R;
    }

    public final C107810a getFrameDrawable() {
        return this.f263468D;
    }

    public final long getLAST_INTERVAL() {
        return this.f263496p;
    }

    public final float getLYRICS_VERTICAL_OFFSET() {
        return this.f263502v;
    }

    public final C92020n getLyricsItem() {
        return this.f263481R;
    }

    public final ArrayList<C49044cs2> getLyricsList() {
        return this.f263487d;
    }

    public final boolean getNeedInvalidate() {
        return this.f263480Q;
    }

    public final Paint getPaint() {
        return this.f263476L;
    }

    public Rect getSafeArea() {
        Rect rect = this.f263470F.f321807h;
        return rect == null ? new Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    public final C92011d getSourceDataType() {
        return this.f263473I;
    }

    public final long getStartTime() {
        return this.f263489f;
    }

    public final long getTRANS_TIME() {
        return this.f263495o;
    }

    public final CharSequence getText() {
        return this.f263471G;
    }

    public final float getTextSize() {
        return this.f263472H;
    }

    public final float getTouchDownX() {
        return this.f263483T;
    }

    public final float getTouchDownY() {
        return this.f263484U;
    }

    public final boolean getTouchMoved() {
        return this.f263485V;
    }

    public final int getTouchSlop() {
        return this.f263486W;
    }

    public final C107554b getTouchTracker() {
        return this.f263470F;
    }

    public C98129b getType() {
        return C98129b.EditItemTypeLyrics;
    }

    public final Rect getValidRect() {
        return this.f263478N;
    }

    public final Matrix getViewMatrix() {
        return this.f263482S;
    }

    public final int getWaveAlpha() {
        return this.f263492i;
    }

    public final Paint getWavePaint() {
        return this.f263477M;
    }

    public final long getWaveTime() {
        return this.f263490g;
    }

    /* renamed from: h */
    public boolean mo53780h() {
        return true;
    }

    /* renamed from: i */
    public C92262a mo53781i(Matrix matrix) {
        if (this.f263474J.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T next : this.f263487d) {
            int i2 = i + 1;
            if (i >= 0) {
                C49044cs2 cs22 = (C49044cs2) next;
                if (i < this.f263474J.size()) {
                    Bitmap bitmap = this.f263474J.get(i);
                    C87412m.m108593f(bitmap, "bitmapList[index]");
                    arrayList.add(new C92267g(cs22, bitmap));
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.f263470F.f321806g);
        return new C104149h(arrayList, matrix2);
    }

    /* renamed from: j */
    public void mo125952j() {
        if (this.f263475K < this.f263487d.size()) {
            long j = this.f263487d.get(this.f263475K).f131929e;
            boolean z = true;
            C49044cs2 cs22 = (C49044cs2) C110818d0.m150917O(this.f263487d, this.f263475K + 1);
            long j2 = cs22 != null ? cs22.f131929e : this.f263487d.get(this.f263475K).f131929e + this.f263496p;
            long j3 = this.f263495o;
            long j4 = this.f263488e;
            long j5 = j4 - j;
            if (0 <= j5 && j5 <= j3) {
                this.f263491h = (int) ((((float) 255) * ((float) (j4 - j))) / ((float) j3));
                return;
            }
            long j6 = j2 - j4;
            if (0 > j6 || j6 > j3) {
                z = false;
            }
            if (z) {
                this.f263491h = (int) (((float) 255) * (((float) (j2 - j4)) / ((float) j3)));
            } else if (j4 - j > j3 && j2 - j4 > j3) {
                this.f263491h = 255;
            }
        }
    }

    /* renamed from: k */
    public void mo125953k(long j) {
        if (this.f263492i < 255) {
            long j2 = this.f263495o;
            long j3 = this.f263488e;
            long j4 = j3 - j;
            boolean z = false;
            if (0 <= j4 && j4 <= j2) {
                z = true;
            }
            if (z) {
                this.f263492i = (int) ((((float) 255) * ((float) (j3 - j))) / ((float) j2));
            } else if (j3 - j > j2) {
                this.f263492i = 255;
            }
        }
    }

    /* renamed from: l */
    public void mo125954l() {
        if (!this.f263487d.isEmpty()) {
            this.f263488e = System.currentTimeMillis() - this.f263489f;
            C49044cs2 cs22 = (C49044cs2) C110818d0.m150917O(this.f263487d, this.f263475K + 1);
            if (this.f263488e >= (cs22 != null ? cs22.f131929e : this.f263487d.get(this.f263475K).f131929e + this.f263496p)) {
                int i = this.f263475K + 1;
                this.f263475K = i;
                if (i >= this.f263487d.size()) {
                    this.f263475K = 0;
                    this.f263489f = System.currentTimeMillis();
                    this.f263488e = 0;
                }
            }
        }
    }

    /* renamed from: m */
    public void mo53782m(Rect rect, int i) {
        C87412m.m108594g(rect, "safeRect");
        C107554b bVar = this.f263470F;
        bVar.f321807h = rect;
        bVar.f321808i = C76577a.m92151b(getContext(), 54);
    }

    /* renamed from: o */
    public final void mo125955o(List<? extends C49044cs2> list) {
        C87412m.m108594g(list, "lyricsInfo");
        mo125958p(list);
        mo125922c();
        int i = 0;
        int i2 = 0;
        for (Bitmap bitmap : this.f263474J) {
            if (bitmap.getWidth() > i) {
                i = bitmap.getWidth();
            }
            if (bitmap.getHeight() > i2) {
                i2 = bitmap.getHeight();
            }
        }
        if (i != 0 && i2 != 0) {
            C107554b bVar = this.f263470F;
            bVar.f321815p = i;
            bVar.f321814o = i2;
            this.f263468D.setBounds(0, 0, i, i2);
            C107554b bVar2 = this.f263470F;
            float f = (float) i;
            float f2 = (float) i2;
            bVar2.getClass();
            bVar2.f321811l = new float[]{0.0f, 0.0f, f, 0.0f, 0.0f, f2, f, f2};
            float height = (float) ((this.f263479P.height() - C74942w4.m89784a(getContext(), v2helper.VOIP_ENC_HEIGHT_LV1)) - i2);
            int i3 = this.f263505y;
            C103020m mVar = C103020m.f303985a;
            int i4 = C103020m.f303987c.left;
            this.f263470F.f321806g.setTranslate(i3 >= i4 ? (float) i3 : (float) i4, height);
        }
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.save();
        Matrix matrix = this.f263482S;
        if (matrix != null) {
            canvas.setMatrix(matrix);
        } else {
            canvas.setMatrix(this.f263470F.f321806g);
        }
        if (isActivated()) {
            this.f263468D.draw(canvas);
        }
        mo125923g(canvas);
        mo125954l();
        if ((!this.f263474J.isEmpty()) && this.f263475K < this.f263474J.size()) {
            mo125952j();
            this.f263476L.setAlpha(this.f263491h);
            canvas.drawBitmap(this.f263474J.get(this.f263475K), 0.0f, this.f263502v, this.f263476L);
        }
        canvas.restore();
        if (this.f263480Q) {
            invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        this.f263467C.set(this.f263470F.f321806g);
        this.f263467C.getValues(this.f263466B);
        float f = this.f263466B[2];
        boolean a = this.f263470F.mo157997a(motionEvent);
        this.f263470F.f321806g.getValues(this.f263466B);
        float f2 = this.f263466B[5];
        this.f263470F.f321806g.set(this.f263467C);
        this.f263470F.f321806g.setTranslate(f, f2);
        if (a) {
            EditorItemContainer.C94437a aVar = this.f263469E;
            if (aVar != null) {
                aVar.mo129926a(this, motionEvent);
            }
            bringToFront();
            postInvalidate();
        }
        if (a) {
            int actionMasked = motionEvent.getActionMasked();
            boolean z = false;
            if (actionMasked == 0) {
                this.f263483T = motionEvent.getX();
                this.f263484U = motionEvent.getY();
                this.f263485V = false;
            } else if (actionMasked == 1) {
                if (!this.f263485V) {
                    performClick();
                }
                C107552a aVar2 = new C107552a();
                Rect rect = this.f263478N;
                C107554b bVar = this.f263470F;
                aVar2.f321789c = bVar.f321817r;
                aVar2.f321790d = bVar.f321816q;
                aVar2.f321788b = new float[]{((float) bVar.f321815p) / 2.0f, ((float) bVar.f321814o) / 2.0f};
                aVar2.f321787a = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
                aVar2.mo157995a(this.f263470F.f321806g, new C92022a(this));
            } else if (actionMasked == 2) {
                float max = Math.max(Math.abs(motionEvent.getX() - this.f263483T), Math.abs(motionEvent.getY() - this.f263484U));
                if (!this.f263485V) {
                    if (max > ((float) this.f263486W)) {
                        z = true;
                    }
                    this.f263485V = z;
                }
            }
        }
        return a;
    }

    /* renamed from: p */
    public final void mo125958p(List<? extends C49044cs2> list) {
        this.f263487d.clear();
        ArrayList<C49044cs2> arrayList = this.f263487d;
        ArrayList arrayList2 = new ArrayList();
        for (T next : list) {
            if (!Util.isNullOrNil(((C49044cs2) next).f131928d)) {
                arrayList2.add(next);
            }
        }
        arrayList.addAll(arrayList2);
    }

    public final void setAlpha(int i) {
        this.f263491h = i;
    }

    public final void setBitmapList(ArrayList<Bitmap> arrayList) {
        C87412m.m108594g(arrayList, "<set-?>");
        this.f263474J = arrayList;
    }

    public final void setCurIndex(int i) {
        this.f263475K = i;
    }

    public final void setDuration(long j) {
        this.f263488e = j;
    }

    public final void setLyricsItem(C92020n nVar) {
        this.f263481R = nVar;
    }

    public final void setNeedInvalidate(boolean z) {
        this.f263480Q = z;
    }

    public final void setPaint(Paint paint) {
        C87412m.m108594g(paint, "<set-?>");
        this.f263476L = paint;
    }

    public final void setSourceDataType(C92011d dVar) {
        C87412m.m108594g(dVar, "<set-?>");
        this.f263473I = dVar;
    }

    public final void setStartTime(long j) {
        this.f263489f = j;
    }

    public final void setStateResolve(EditorItemContainer.C94437a aVar) {
        C87412m.m108594g(aVar, "stateResolve");
        this.f263469E = aVar;
    }

    public final void setText(CharSequence charSequence) {
        this.f263471G = charSequence;
    }

    public final void setTextSize(float f) {
        this.f263472H = f;
    }

    public final void setTouchDownX(float f) {
        this.f263483T = f;
    }

    public final void setTouchDownY(float f) {
        this.f263484U = f;
    }

    public final void setTouchMoved(boolean z) {
        this.f263485V = z;
    }

    public void setValidArea(Rect rect) {
        C87412m.m108594g(rect, "validRect");
        this.f263478N.set(rect);
    }

    public final void setValidRect(Rect rect) {
        C87412m.m108594g(rect, "<set-?>");
        this.f263478N = rect;
    }

    public final void setViewMatrix(Matrix matrix) {
        this.f263482S = matrix;
        if (matrix != null) {
            C107554b bVar = this.f263470F;
            bVar.getClass();
            bVar.f321806g = matrix;
            Canvas canvas = new Canvas();
            canvas.save();
            if (this.f263482S != null) {
                canvas.setMatrix(matrix);
            }
            if (isActivated()) {
                this.f263468D.draw(canvas);
            }
        }
    }

    public final void setWaveAlpha(int i) {
        this.f263492i = i;
    }

    public final void setWavePaint(Paint paint) {
        C87412m.m108594g(paint, "<set-?>");
        this.f263477M = paint;
    }

    public final void setWaveTime(long j) {
        this.f263490g = j;
    }
}
