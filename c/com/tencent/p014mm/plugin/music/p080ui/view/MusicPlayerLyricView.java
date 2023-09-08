package com.tencent.p014mm.plugin.music.p080ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatTextView;
import ca2.C0441d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k20.C9556a;
import kg3.C76577a;
import ma2.C61453s;
import ma2.C99819r;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView */
public class MusicPlayerLyricView extends AppCompatTextView {

    /* renamed from: A */
    public ValueAnimator f315181A;

    /* renamed from: B */
    public GestureDetector f315182B;

    /* renamed from: C */
    public Scroller f315183C;

    /* renamed from: D */
    public float f315184D;

    /* renamed from: E */
    public int f315185E;

    /* renamed from: F */
    public boolean f315186F;

    /* renamed from: G */
    public boolean f315187G;

    /* renamed from: H */
    public boolean f315188H;

    /* renamed from: I */
    public int f315189I;

    /* renamed from: J */
    public int f315190J;

    /* renamed from: K */
    public int f315191K;

    /* renamed from: L */
    public boolean f315192L;

    /* renamed from: M */
    public final int f315193M;

    /* renamed from: N */
    public int f315194N;

    /* renamed from: P */
    public int f315195P;

    /* renamed from: Q */
    public int f315196Q;

    /* renamed from: R */
    public GestureDetector.SimpleOnGestureListener f315197R;

    /* renamed from: S */
    public Runnable f315198S;

    /* renamed from: g */
    public C61453s f315199g;

    /* renamed from: h */
    public List<C105931e> f315200h;

    /* renamed from: i */
    public TextPaint f315201i;

    /* renamed from: j */
    public TextPaint f315202j;

    /* renamed from: n */
    public Paint.FontMetrics f315203n;

    /* renamed from: o */
    public long f315204o;

    /* renamed from: p */
    public int f315205p;

    /* renamed from: q */
    public float f315206q;

    /* renamed from: r */
    public int f315207r;

    /* renamed from: s */
    public int f315208s;

    /* renamed from: t */
    public float f315209t;

    /* renamed from: u */
    public int f315210u;

    /* renamed from: v */
    public int f315211v;

    /* renamed from: w */
    public int f315212w;

    /* renamed from: x */
    public int f315213x;

    /* renamed from: y */
    public int f315214y;

    /* renamed from: z */
    public String f315215z;

    /* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView$a */
    public class C105927a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f315216d;

        public C105927a(long j) {
            this.f315216d = j;
        }

        public void run() {
            int i;
            if (MusicPlayerLyricView.this.mo151089e()) {
                MusicPlayerLyricView musicPlayerLyricView = MusicPlayerLyricView.this;
                long j = this.f315216d;
                int size = ((ArrayList) musicPlayerLyricView.f315200h).size();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 > size) {
                        break;
                    }
                    i = (i3 + size) / 2;
                    if (j < ((C105931e) ((ArrayList) musicPlayerLyricView.f315200h).get(i)).f315221d) {
                        size = i - 1;
                    } else {
                        i3 = i + 1;
                        if (i3 >= ((ArrayList) musicPlayerLyricView.f315200h).size() || j < ((C105931e) ((ArrayList) musicPlayerLyricView.f315200h).get(i3)).f315221d) {
                            i2 = i;
                        }
                    }
                }
                i2 = i;
                MusicPlayerLyricView musicPlayerLyricView2 = MusicPlayerLyricView.this;
                if (i2 != musicPlayerLyricView2.f315185E) {
                    musicPlayerLyricView2.f315185E = i2;
                    if (!musicPlayerLyricView2.f315186F) {
                        musicPlayerLyricView2.mo151092h(i2, musicPlayerLyricView2.f315204o);
                    } else {
                        musicPlayerLyricView2.invalidate();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView$b */
    public class C105928b extends GestureDetector.SimpleOnGestureListener {
        public C105928b() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onDown(MotionEvent motionEvent) {
            if (MusicPlayerLyricView.this.mo151089e()) {
                MusicPlayerLyricView.this.getClass();
            }
            return super.onDown(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!MusicPlayerLyricView.this.mo151089e()) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            MusicPlayerLyricView musicPlayerLyricView = MusicPlayerLyricView.this;
            musicPlayerLyricView.f315183C.fling(0, (int) musicPlayerLyricView.f315184D, 0, (int) f2, 0, 0, (int) musicPlayerLyricView.mo151087b(((ArrayList) musicPlayerLyricView.f315200h).size() - 1), (int) MusicPlayerLyricView.this.mo151087b(0));
            MusicPlayerLyricView.this.f315188H = true;
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!MusicPlayerLyricView.this.mo151089e()) {
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }
            MusicPlayerLyricView musicPlayerLyricView = MusicPlayerLyricView.this;
            float f3 = musicPlayerLyricView.f315184D + (-f2);
            musicPlayerLyricView.f315184D = f3;
            musicPlayerLyricView.f315184D = Math.min(f3, musicPlayerLyricView.mo151087b(0));
            MusicPlayerLyricView musicPlayerLyricView2 = MusicPlayerLyricView.this;
            musicPlayerLyricView2.f315184D = Math.max(musicPlayerLyricView2.f315184D, musicPlayerLyricView2.mo151087b(((ArrayList) musicPlayerLyricView2.f315200h).size() - 1));
            MusicPlayerLyricView.this.invalidate();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (MusicPlayerLyricView.this.mo151089e()) {
                MusicPlayerLyricView musicPlayerLyricView = MusicPlayerLyricView.this;
                if (musicPlayerLyricView.f315186F) {
                    int y = musicPlayerLyricView.f315194N - ((int) motionEvent.getY());
                    float f = Float.MAX_VALUE;
                    int i = 0;
                    for (int i2 = 0; i2 < ((ArrayList) musicPlayerLyricView.f315200h).size(); i2++) {
                        float f2 = (float) y;
                        if (Math.abs((musicPlayerLyricView.f315184D + f2) - musicPlayerLyricView.mo151087b(i2)) < f) {
                            f = Math.abs((musicPlayerLyricView.f315184D + f2) - musicPlayerLyricView.mo151087b(i2));
                            i = i2;
                        }
                    }
                    long j = ((C105931e) ((ArrayList) MusicPlayerLyricView.this.f315200h).get(i)).f315221d;
                    MusicPlayerLyricView.this.mo151086a();
                    MusicPlayerLyricView.this.getClass();
                }
            }
            return super.onSingleTapConfirmed(motionEvent);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView$c */
    public class C105929c implements Runnable {
        public C105929c() {
        }

        public void run() {
            if (MusicPlayerLyricView.this.mo151089e()) {
                MusicPlayerLyricView musicPlayerLyricView = MusicPlayerLyricView.this;
                if (musicPlayerLyricView.f315186F) {
                    musicPlayerLyricView.f315186F = false;
                    musicPlayerLyricView.mo151092h(musicPlayerLyricView.f315185E, musicPlayerLyricView.f315204o);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView$d */
    public class C105930d implements ValueAnimator.AnimatorUpdateListener {
        public C105930d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MusicPlayerLyricView.this.f315184D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MusicPlayerLyricView.this.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView$e */
    public class C105931e implements Comparable<C105931e> {

        /* renamed from: d */
        public long f315221d;

        /* renamed from: e */
        public String f315222e;

        /* renamed from: f */
        public StaticLayout f315223f;

        /* renamed from: g */
        public float f315224g = Float.MIN_VALUE;

        public C105931e(MusicPlayerLyricView musicPlayerLyricView, long j, String str) {
            this.f315221d = j;
            this.f315222e = str;
        }

        public int compareTo(Object obj) {
            C105931e eVar = (C105931e) obj;
            if (eVar == null) {
                return -1;
            }
            return (int) (this.f315221d - eVar.f315221d);
        }
    }

    public MusicPlayerLyricView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        mo151090f((AttributeSet) null);
    }

    private int getCenterLine() {
        int i = 0;
        float f = Float.MAX_VALUE;
        for (int i2 = 0; i2 < ((ArrayList) this.f315200h).size(); i2++) {
            if (Math.abs(this.f315184D - mo151087b(i2)) < f) {
                f = Math.abs(this.f315184D - mo151087b(i2));
                i = i2;
            }
        }
        return i;
    }

    private float getLrcWidth() {
        return ((float) this.f315196Q) - 0.0f;
    }

    /* renamed from: a */
    public final void mo151086a() {
        mo151092h(getCenterLine(), 100);
    }

    /* renamed from: b */
    public final float mo151087b(int i) {
        if (((C105931e) ((ArrayList) this.f315200h).get(i)).f315224g == Float.MIN_VALUE) {
            float f = (float) this.f315194N;
            for (int i2 = 1; i2 <= i; i2++) {
                StaticLayout staticLayout = ((C105931e) ((ArrayList) this.f315200h).get(i2 - 1)).f315223f;
                int i3 = 0;
                int height = staticLayout == null ? 0 : staticLayout.getHeight();
                StaticLayout staticLayout2 = ((C105931e) ((ArrayList) this.f315200h).get(i2)).f315223f;
                if (staticLayout2 != null) {
                    i3 = staticLayout2.getHeight();
                }
                f -= (float) (((height + i3) >> 1) + this.f315191K);
            }
            ((C105931e) ((ArrayList) this.f315200h).get(i)).f315224g = f;
        }
        return ((C105931e) ((ArrayList) this.f315200h).get(i)).f315224g;
    }

    public void computeScroll() {
        if (this.f315183C.computeScrollOffset()) {
            this.f315184D = (float) this.f315183C.getCurrY();
            invalidate();
        }
        if (this.f315188H && this.f315183C.isFinished()) {
            this.f315188H = false;
            if (mo151089e() && !this.f315187G) {
                mo151086a();
                postDelayed(this.f315198S, 1000);
            }
        }
    }

    /* renamed from: e */
    public boolean mo151089e() {
        return !this.f315200h.isEmpty();
    }

    /* renamed from: f */
    public final void mo151090f(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0441d.f1065a);
        this.f315209t = obtainStyledAttributes.getDimension(9, getResources().getDimension(C0966R.dimen.adp));
        float dimension = obtainStyledAttributes.getDimension(5, getResources().getDimension(C0966R.dimen.adp));
        this.f315206q = dimension;
        if (dimension == 0.0f) {
            this.f315206q = this.f315209t;
        }
        this.f315191K = this.f315193M;
        int integer = getResources().getInteger(C0966R.integer.f6226s);
        long j = (long) obtainStyledAttributes.getInt(0, integer);
        this.f315204o = j;
        if (j < 0) {
            j = (long) integer;
        }
        this.f315204o = j;
        this.f315205p = obtainStyledAttributes.getColor(4, getResources().getColor(C0966R.color.a2d));
        this.f315208s = obtainStyledAttributes.getColor(1, getResources().getColor(C0966R.color.a2c));
        this.f315211v = obtainStyledAttributes.getColor(14, getResources().getColor(C0966R.color.a2g));
        String string = obtainStyledAttributes.getString(3);
        this.f315215z = string;
        this.f315215z = TextUtils.isEmpty(string) ? getContext().getString(C0966R.string.ge9) : this.f315215z;
        obtainStyledAttributes.getColor(12, getResources().getColor(C0966R.color.a2f));
        float dimension2 = obtainStyledAttributes.getDimension(13, getResources().getDimension(C0966R.dimen.ads));
        this.f315213x = obtainStyledAttributes.getColor(10, getResources().getColor(C0966R.color.a2e));
        float dimension3 = obtainStyledAttributes.getDimension(11, getResources().getDimension(C0966R.dimen.adq));
        this.f315189I = obtainStyledAttributes.getInteger(8, 1);
        obtainStyledAttributes.recycle();
        this.f315214y = (int) getResources().getDimension(C0966R.dimen.adr);
        this.f315201i.setAntiAlias(true);
        this.f315201i.setTextSize((float) this.f315190J);
        this.f315201i.setTextAlign(Paint.Align.LEFT);
        this.f315202j.setAntiAlias(true);
        this.f315202j.setTextSize(dimension3);
        this.f315202j.setTextAlign(Paint.Align.CENTER);
        this.f315202j.setStrokeWidth(dimension2);
        this.f315202j.setStrokeCap(Paint.Cap.ROUND);
        this.f315203n = this.f315202j.getFontMetrics();
        GestureDetector gestureDetector = new GestureDetector(getContext(), this.f315197R);
        this.f315182B = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f315183C = new Scroller(getContext());
        mo151091g();
    }

    /* renamed from: g */
    public final void mo151091g() {
        String str;
        if (!mo151089e() && this.f315196Q != 0 && !this.f315192L) {
            if (this.f315199g == null) {
                Log.m105920e("MicroMsg.Music.MusicPlayerLyricView", "null == lyricObj, maybe you not setLyricObj, check ！！！");
                return;
            }
            for (int i = 0; i < this.f315199g.mo86427b(); i++) {
                C99819r.C61452a a = this.f315199g.mo86426a(i);
                if (!a.mo86424a()) {
                    C105931e eVar = new C105931e(this, a.f174760b, a.f174761c);
                    TextPaint textPaint = this.f315201i;
                    int lrcWidth = (int) getLrcWidth();
                    int i2 = this.f315189I;
                    Layout.Alignment alignment = i2 != 1 ? i2 != 2 ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    if (!TextUtils.isEmpty((CharSequence) null)) {
                        str = eVar.f315222e + "\n" + null;
                    } else {
                        str = eVar.f315222e;
                    }
                    eVar.f315223f = new StaticLayout(str, textPaint, lrcWidth, alignment, 0.0f, 0.0f, false);
                    eVar.f315224g = Float.MIN_VALUE;
                    this.f315200h.add(eVar);
                }
            }
            this.f315184D = (float) this.f315194N;
            this.f315192L = true;
        }
    }

    /* renamed from: h */
    public final void mo151092h(int i, long j) {
        float b = mo151087b(i);
        ValueAnimator valueAnimator = this.f315181A;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f315181A.end();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f315184D, b});
        this.f315181A = ofFloat;
        ofFloat.setDuration(j);
        this.f315181A.setInterpolator(new LinearInterpolator());
        this.f315181A.addUpdateListener(new C105930d());
        try {
            Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
            declaredField.setAccessible(true);
            declaredField.setFloat((Object) null, 1.0f);
        } catch (Exception unused) {
        }
        this.f315181A.start();
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f315198S);
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f315195P == 0 || this.f315196Q == 0) {
            this.f315195P = getMeasuredHeight();
            this.f315196Q = getMeasuredWidth();
        }
        int i = this.f315194N;
        if (this.f315199g == null) {
            this.f315201i.setColor(this.f315208s);
            StaticLayout staticLayout = new StaticLayout(this.f315215z, this.f315201i, (int) getLrcWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, ((float) i) - ((float) (staticLayout.getHeight() >> 1)));
            staticLayout.draw(canvas);
            canvas.restore();
            return;
        }
        mo151091g();
        int centerLine = getCenterLine();
        if (this.f315186F) {
            this.f315202j.setColor(this.f315213x);
            long j = ((C105931e) ((ArrayList) this.f315200h).get(centerLine)).f315221d;
            int i2 = (int) ((j / 1000) % 60);
            String format = String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf((int) (j / 60000))});
            String format2 = String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(i2)});
            Paint.FontMetrics fontMetrics = this.f315203n;
            canvas.drawText(format + XVFSFile.PATH_SEPARATOR + format2, (float) (this.f315196Q - this.f315214y), ((float) i) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f), this.f315202j);
        }
        canvas.translate(0.0f, this.f315184D);
        float f = 0.0f;
        for (int i3 = 0; i3 < ((ArrayList) this.f315200h).size(); i3++) {
            if (i3 > 0) {
                StaticLayout staticLayout2 = ((C105931e) ((ArrayList) this.f315200h).get(i3 - 1)).f315223f;
                int height = staticLayout2 == null ? 0 : staticLayout2.getHeight();
                StaticLayout staticLayout3 = ((C105931e) ((ArrayList) this.f315200h).get(i3)).f315223f;
                f += (float) (((height + (staticLayout3 == null ? 0 : staticLayout3.getHeight())) >> 1) + this.f315191K);
            }
            if (i3 == this.f315185E) {
                this.f315201i.setTextSize(this.f315209t);
                this.f315201i.setColor(this.f315208s);
                this.f315201i.setFakeBoldText(true);
                this.f315201i.setAlpha(this.f315210u);
            } else if (!this.f315186F || i3 != centerLine) {
                this.f315201i.setShader((Shader) null);
                this.f315201i.setFakeBoldText(false);
                this.f315201i.setTextSize(this.f315206q);
                this.f315201i.setColor(this.f315205p);
                this.f315201i.setAlpha(this.f315207r);
            } else {
                this.f315201i.setShader((Shader) null);
                this.f315201i.setColor(this.f315211v);
                this.f315201i.setAlpha(this.f315212w);
            }
            StaticLayout staticLayout4 = ((C105931e) ((ArrayList) this.f315200h).get(i3)).f315223f;
            canvas.save();
            canvas.translate(0.0f, f - ((float) (staticLayout4.getHeight() >> 1)));
            staticLayout4.draw(canvas);
            canvas.restore();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo151091g();
            if (mo151089e()) {
                mo151092h(this.f315185E, 0);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f315195P = i2;
        this.f315196Q = i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f315187G = false;
            if (mo151089e() && !this.f315188H) {
                mo151086a();
                postDelayed(this.f315198S, 1000);
            }
        }
        GestureDetector gestureDetector = this.f315182B;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }

    public void setCurrentTextSize(float f) {
        this.f315209t = f;
    }

    public void setCurrentTime(long j) {
        C105927a aVar = new C105927a(j);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aVar.run();
        } else {
            post(aVar);
        }
    }

    public void setLyricObj(C61453s sVar) {
        this.f315199g = sVar;
        invalidate();
    }

    public void setNormalTextSize(float f) {
        this.f315206q = f;
    }

    public void setTimeTextColor(int i) {
        this.f315213x = i;
        postInvalidate();
    }

    public MusicPlayerLyricView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f315200h = new ArrayList();
        this.f315201i = new TextPaint();
        this.f315202j = new TextPaint();
        this.f315207r = 256;
        this.f315210u = 256;
        this.f315212w = 256;
        this.f315190J = (int) this.f315206q;
        this.f315191K = 0;
        this.f315192L = false;
        this.f315193M = C76577a.m92151b(MMApplicationContext.getContext(), 24);
        this.f315194N = C76577a.m92151b(MMApplicationContext.getContext(), 52);
        this.f315197R = new C105928b();
        this.f315198S = new C105929c();
        mo151090f(attributeSet);
    }
}
