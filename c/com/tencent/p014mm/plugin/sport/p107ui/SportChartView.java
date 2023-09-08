package com.tencent.p014mm.plugin.sport.p107ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.sport.ui.SportChartView */
public class SportChartView extends View {

    /* renamed from: A */
    public final float f206229A;

    /* renamed from: B */
    public final int f206230B;

    /* renamed from: C */
    public final int f206231C;

    /* renamed from: D */
    public final int f206232D;

    /* renamed from: E */
    public final int f206233E;

    /* renamed from: F */
    public final int f206234F;

    /* renamed from: G */
    public final int f206235G;

    /* renamed from: H */
    public final int f206236H;

    /* renamed from: I */
    public int f206237I;

    /* renamed from: J */
    public final Typeface f206238J;

    /* renamed from: K */
    public int f206239K;

    /* renamed from: L */
    public boolean f206240L;

    /* renamed from: M */
    public int f206241M;

    /* renamed from: N */
    public int f206242N;

    /* renamed from: P */
    public C71266b f206243P;

    /* renamed from: Q */
    public int f206244Q;

    /* renamed from: Q0 */
    public GestureDetector f206245Q0;

    /* renamed from: R */
    public C71267c[] f206246R;

    /* renamed from: R0 */
    public GestureDetector.OnGestureListener f206247R0;

    /* renamed from: S */
    public Paint f206248S;

    /* renamed from: T */
    public Path f206249T;

    /* renamed from: U */
    public Path f206250U;

    /* renamed from: V */
    public int f206251V;

    /* renamed from: W */
    public int f206252W;

    /* renamed from: d */
    public SimpleDateFormat f206253d = new SimpleDateFormat(getResources().getString(C0966R.string.jmb));

    /* renamed from: e */
    public SimpleDateFormat f206254e = new SimpleDateFormat("d");

    /* renamed from: f */
    public final int f206255f = getResources().getColor(C0966R.color.f356985ae3);

    /* renamed from: g */
    public final int f206256g = getResources().getColor(C0966R.color.ae4);

    /* renamed from: h */
    public final int f206257h = getResources().getColor(C0966R.color.ae4);

    /* renamed from: i */
    public int f206258i = Integer.MAX_VALUE;

    /* renamed from: j */
    public int f206259j = 0;

    /* renamed from: n */
    public int f206260n = 0;

    /* renamed from: o */
    public final int f206261o = ((int) mo98049c(1, 2.5f));

    /* renamed from: p */
    public final int f206262p = ((int) mo98049c(1, 4.0f));

    /* renamed from: p0 */
    public int f206263p0;

    /* renamed from: q */
    public final int f206264q = ((int) mo98049c(1, 1.8f));

    /* renamed from: r */
    public final int f206265r = ((int) mo98049c(1, 1.0f));

    /* renamed from: s */
    public final int f206266s = ((int) mo98049c(1, 8.0f));

    /* renamed from: t */
    public final int f206267t = ((int) mo98049c(1, 22.0f));

    /* renamed from: u */
    public final int f206268u = ((int) mo98049c(1, 67.0f));

    /* renamed from: v */
    public final int f206269v = ((int) mo98049c(1, 40.0f));

    /* renamed from: w */
    public final int f206270w = ((int) mo98049c(1, 22.0f));

    /* renamed from: x */
    public final int f206271x;

    /* renamed from: x0 */
    public boolean f206272x0;

    /* renamed from: y */
    public final int f206273y;

    /* renamed from: y0 */
    public boolean f206274y0;

    /* renamed from: z */
    public final float f206275z;

    /* renamed from: com.tencent.mm.plugin.sport.ui.SportChartView$a */
    public class C71265a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public long f206276d;

        public C71265a() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Log.m105925i("MicroMsg.Sport.SportChartView", "onScroll %.2f", Float.valueOf(f));
            if (System.currentTimeMillis() - this.f206276d >= 500 && SportChartView.this.f206274y0) {
                this.f206276d = System.currentTimeMillis();
                if (f > 0.0f) {
                    SportChartView sportChartView = SportChartView.this;
                    int i = sportChartView.f206241M + 1;
                    sportChartView.f206241M = i;
                    int i2 = sportChartView.f206242N;
                    if (i > i2) {
                        sportChartView.f206241M = i2;
                    }
                    SportChartView.m83711a(sportChartView, false);
                    SportChartView.this.invalidate();
                    return true;
                } else if (f < 0.0f) {
                    SportChartView sportChartView2 = SportChartView.this;
                    int i3 = sportChartView2.f206241M - 1;
                    sportChartView2.f206241M = i3;
                    if (i3 < 1) {
                        sportChartView2.f206241M = 1;
                    }
                    SportChartView.m83711a(sportChartView2, false);
                    SportChartView.this.invalidate();
                    return true;
                }
            }
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            SportChartView sportChartView = SportChartView.this;
            sportChartView.f206258i = Integer.MAX_VALUE;
            if (sportChartView.f206246R.length > 0) {
                int i = 0;
                while (true) {
                    C71267c[] cVarArr = sportChartView.f206246R;
                    if (i >= cVarArr.length) {
                        break;
                    }
                    if (i != 0) {
                        if (i <= 0 || i >= cVarArr.length - 1) {
                            if (i == cVarArr.length - 1) {
                                if (x < ((float) sportChartView.f206259j) && x > cVarArr[i].f206283c - ((float) (sportChartView.f206239K / 2))) {
                                    sportChartView.f206258i = i;
                                    sportChartView.invalidate();
                                    break;
                                }
                            } else {
                                sportChartView.f206258i = Integer.MAX_VALUE;
                                break;
                            }
                        } else {
                            float f = cVarArr[i].f206283c;
                            float f2 = (float) (sportChartView.f206239K / 2);
                            if (x < f2 + f && x > f - f2) {
                                sportChartView.f206258i = i;
                                sportChartView.invalidate();
                                break;
                            }
                        }
                    } else if (x < cVarArr[i].f206283c + ((float) (sportChartView.f206239K / 2)) && x > 0.0f) {
                        sportChartView.f206258i = i;
                        sportChartView.invalidate();
                        break;
                    }
                    i++;
                }
            }
            sportChartView.f206258i = sportChartView.f206258i;
            SportChartView sportChartView2 = SportChartView.this;
            int i2 = 0;
            while (true) {
                int i3 = sportChartView2.f206244Q;
                if (i2 < i3) {
                    if (i2 == i3 - 1) {
                        sportChartView2.f206246R[i2].f206285e = true;
                    } else {
                        sportChartView2.f206246R[i2].f206285e = false;
                    }
                    i2++;
                } else {
                    SportChartView.this.f206272x0 = false;
                    Log.m105925i("MicroMsg.Sport.SportChartView", "onSingleTapUp %s %s %d", Float.valueOf(x), Float.valueOf(y), Integer.valueOf(SportChartView.this.f206258i));
                    SportChartView.this.invalidate();
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                    return true;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sport.ui.SportChartView$b */
    public enum C71266b {
        WEEK,
        MONTH
    }

    /* renamed from: com.tencent.mm.plugin.sport.ui.SportChartView$c */
    public class C71267c {

        /* renamed from: a */
        public long f206281a;

        /* renamed from: b */
        public int f206282b;

        /* renamed from: c */
        public float f206283c;

        /* renamed from: d */
        public float f206284d;

        /* renamed from: e */
        public boolean f206285e;

        /* renamed from: f */
        public String f206286f = "";

        public C71267c(SportChartView sportChartView, C71265a aVar) {
        }
    }

    public SportChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo98049c(1, 55.0f);
        this.f206271x = (int) mo98049c(1, 35.0f);
        this.f206273y = (int) mo98049c(1, 45.0f);
        this.f206275z = (float) ((int) mo98049c(1, 8.0f));
        this.f206229A = (float) ((int) mo98049c(1, 8.0f));
        this.f206230B = (int) mo98049c(1, 2.0f);
        this.f206231C = (int) mo98049c(1, 15.0f);
        this.f206232D = (int) mo98049c(1, 33.0f);
        this.f206233E = (int) mo98049c(1, 8.0f);
        this.f206234F = (int) mo98049c(1, 35.0f);
        this.f206235G = (int) mo98049c(1, 10.0f);
        this.f206236H = (int) mo98049c(1, 58.0f);
        mo98049c(1, 1.0f);
        this.f206237I = 0;
        this.f206238J = Typeface.create(Typeface.DEFAULT_BOLD, 0);
        Typeface.create(Typeface.DEFAULT_BOLD, 1);
        this.f206239K = 0;
        this.f206241M = -1;
        this.f206242N = -1;
        this.f206243P = C71266b.WEEK;
        this.f206244Q = 7;
        this.f206246R = new C71267c[7];
        this.f206247R0 = new C71265a();
        mo98050d();
    }

    /* renamed from: a */
    public static void m83711a(SportChartView sportChartView, boolean z) {
        sportChartView.f206258i = Integer.MAX_VALUE;
        Calendar instance = Calendar.getInstance();
        sportChartView.f206246R = new C71267c[sportChartView.f206244Q];
        int i = 0;
        while (true) {
            C71267c[] cVarArr = sportChartView.f206246R;
            if (i >= cVarArr.length) {
                break;
            }
            cVarArr[i] = new C71267c(sportChartView, (C71265a) null);
            i++;
        }
        sportChartView.f206240L = true;
        instance.add(5, -sportChartView.f206244Q);
        for (int i2 = 0; i2 < sportChartView.f206246R.length; i2++) {
            instance.add(5, 1);
            sportChartView.f206246R[i2].f206281a = instance.getTimeInMillis();
            sportChartView.f206246R[i2].f206282b = 0;
        }
    }

    /* renamed from: b */
    public final void mo98048b(Canvas canvas, boolean z) {
        int i = 0;
        if (z) {
            this.f206250U.reset();
            Path path = this.f206250U;
            C71267c cVar = this.f206246R[0];
            path.moveTo(cVar.f206283c, cVar.f206284d);
            int i2 = 0;
            while (true) {
                C71267c[] cVarArr = this.f206246R;
                if (i2 < cVarArr.length) {
                    Path path2 = this.f206250U;
                    C71267c cVar2 = cVarArr[i2];
                    path2.lineTo(cVar2.f206283c, cVar2.f206284d);
                    i2++;
                } else {
                    this.f206250U.lineTo(cVarArr[cVarArr.length - 1].f206283c, (float) ((this.f206260n - this.f206271x) - 1));
                    this.f206250U.lineTo((float) this.f206266s, (float) ((this.f206260n - this.f206271x) - 1));
                    this.f206250U.lineTo((float) this.f206266s, this.f206246R[0].f206284d);
                    canvas.drawPath(this.f206250U, this.f206248S);
                    return;
                }
            }
        } else {
            this.f206250U.reset();
            Path path3 = this.f206250U;
            C71267c cVar3 = this.f206246R[0];
            path3.moveTo(cVar3.f206283c, cVar3.f206284d);
            while (true) {
                C71267c[] cVarArr2 = this.f206246R;
                if (i < cVarArr2.length) {
                    if (i <= 0) {
                        mo98051e();
                    } else if (cVarArr2[i - 1].f206284d == ((float) (this.f206260n - this.f206269v))) {
                        this.f206248S.reset();
                        this.f206248S.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
                        this.f206248S.setAntiAlias(true);
                        this.f206248S.setStrokeWidth((float) this.f206264q);
                        this.f206248S.setStyle(Paint.Style.STROKE);
                        this.f206248S.setColor(-1);
                    } else {
                        mo98051e();
                    }
                    Path path4 = this.f206250U;
                    C71267c cVar4 = this.f206246R[i];
                    path4.lineTo(cVar4.f206283c, cVar4.f206284d);
                    canvas.drawPath(this.f206250U, this.f206248S);
                    this.f206250U.reset();
                    Path path5 = this.f206250U;
                    C71267c cVar5 = this.f206246R[i];
                    path5.moveTo(cVar5.f206283c, cVar5.f206284d);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public float mo98049c(int i, float f) {
        Context context = getContext();
        return TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
    }

    /* renamed from: d */
    public final void mo98050d() {
        this.f206248S = new Paint();
        this.f206249T = new Path();
        this.f206250U = new Path();
        this.f206246R = new C71267c[this.f206244Q];
        int i = 0;
        while (true) {
            C71267c[] cVarArr = this.f206246R;
            if (i >= cVarArr.length) {
                break;
            }
            cVarArr[i] = new C71267c(this, (C71265a) null);
            i++;
        }
        int i2 = 0;
        while (true) {
            int i3 = this.f206244Q;
            if (i2 < i3) {
                if (i2 == i3 - 1) {
                    this.f206246R[i2].f206285e = true;
                } else {
                    this.f206246R[i2].f206285e = false;
                }
                i2++;
            } else {
                this.f206245Q0 = new GestureDetector(getContext(), this.f206247R0);
                return;
            }
        }
    }

    /* renamed from: e */
    public final void mo98051e() {
        this.f206248S.reset();
        this.f206248S.setAntiAlias(true);
        this.f206248S.setStrokeWidth((float) this.f206264q);
        this.f206248S.setStyle(Paint.Style.STROKE);
        this.f206248S.setColor(-1);
    }

    public void onDraw(Canvas canvas) {
        C71267c[] cVarArr;
        Canvas canvas2 = canvas;
        C71266b bVar = C71266b.MONTH;
        this.f206259j = getWidth();
        int height = getHeight();
        this.f206260n = height;
        this.f206239K = ((this.f206259j - this.f206266s) - this.f206267t) / (this.f206244Q - 1);
        int i = ((height - this.f206268u) - this.f206269v) / 2;
        int i2 = 0;
        while (true) {
            cVarArr = this.f206246R;
            if (i2 >= cVarArr.length) {
                break;
            }
            cVarArr[i2].f206283c = (float) (this.f206266s + (this.f206239K * i2));
            i2++;
        }
        int length = cVarArr.length;
        int i3 = this.f206244Q;
        if (length > i3) {
            length = i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            C71267c cVar = this.f206246R[i5];
            if (cVar.f206282b > 100000) {
                cVar.f206282b = 100000;
            }
            if (cVar.f206282b < 0) {
                cVar.f206282b = 0;
            }
            int i6 = cVar.f206282b;
            if (i6 > i4) {
                i4 = i6;
            }
        }
        if (i4 <= 15000 && i4 >= 0) {
            i4 = 15000;
        } else if (i4 <= 15000 || i4 > 100000) {
            i4 = 0;
        } else if (((double) i4) / 5000.0d > ((double) (((float) i4) / 5000.0f))) {
            i4 = ((i4 / 5000) + 1) * 5000;
        }
        int i7 = this.f206260n;
        int i8 = this.f206269v;
        this.f206237I = (i7 - i8) - ((((i7 - this.f206268u) - i8) * 10000) / i4);
        for (int i9 = 0; i9 < length; i9++) {
            C71267c cVar2 = this.f206246R[i9];
            int i15 = this.f206260n;
            int i16 = this.f206269v;
            cVar2.f206284d = ((float) (i15 - i16)) - ((((float) cVar2.f206282b) / ((float) i4)) * ((float) ((i15 - this.f206268u) - i16)));
        }
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 == 0) {
                this.f206246R[i17].f206286f = this.f206253d.format(new Date(this.f206246R[i17].f206281a));
            } else if (this.f206243P != bVar) {
                this.f206246R[i17].f206286f = this.f206254e.format(new Date(this.f206246R[i17].f206281a));
            } else if (i17 % 6 == 5) {
                this.f206246R[i17].f206286f = this.f206254e.format(new Date(this.f206246R[i17].f206281a));
            } else {
                this.f206246R[i17].f206286f = "";
            }
        }
        super.onDraw(canvas);
        if (!this.f206240L) {
            this.f206248S.reset();
            this.f206248S.setAntiAlias(true);
            this.f206248S.setColor(-1);
            this.f206248S.setStrokeWidth(0.0f);
            this.f206248S.setStyle(Paint.Style.FILL);
            int i18 = 0;
            while (true) {
                C71267c[] cVarArr2 = this.f206246R;
                if (i18 >= cVarArr2.length) {
                    break;
                }
                if (i18 == cVarArr2.length - 1) {
                    C71267c cVar3 = cVarArr2[i18];
                    canvas2.drawCircle(cVar3.f206283c, cVar3.f206284d, (float) this.f206262p, this.f206248S);
                } else {
                    C71267c cVar4 = cVarArr2[i18];
                    canvas2.drawCircle(cVar4.f206283c, cVar4.f206284d, (float) this.f206261o, this.f206248S);
                }
                i18++;
            }
            int i19 = this.f206258i;
            if (i19 != Integer.MAX_VALUE) {
                if (i19 >= 0 && i19 <= this.f206244Q - 1) {
                    this.f206248S.reset();
                    this.f206248S.setColor(this.f206256g);
                    this.f206248S.setAntiAlias(true);
                    this.f206248S.setStrokeWidth(0.0f);
                    this.f206248S.setTextSize(mo98049c(2, 12.0f));
                    this.f206248S.setTextAlign(Paint.Align.CENTER);
                    if (i19 == 0) {
                        this.f206248S.setTextAlign(Paint.Align.LEFT);
                    }
                    if (i19 == this.f206244Q - 1) {
                        this.f206248S.setTextAlign(Paint.Align.RIGHT);
                    }
                    if (!this.f206272x0) {
                        int i25 = ((int) this.f206246R[i19].f206284d) - this.f206236H;
                        this.f206252W = i25;
                        this.f206263p0 = i25;
                        this.f206272x0 = true;
                    }
                    if (this.f206272x0) {
                        int i26 = this.f206263p0;
                        float f = (float) (((double) i26) / 8.0d);
                        int i27 = this.f206252W;
                        if (i27 > 0) {
                            this.f206248S.setAlpha(((i26 - i27) * 255) / i26);
                        }
                        canvas2.drawText("" + this.f206246R[i19].f206282b, this.f206246R[i19].f206283c, (float) (this.f206252W + this.f206236H), this.f206248S);
                        if (this.f206243P == bVar) {
                            this.f206248S.reset();
                            this.f206249T.reset();
                            this.f206248S.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
                            this.f206248S.setColor(this.f206255f);
                            this.f206248S.setStrokeWidth((float) this.f206265r);
                            this.f206248S.setStyle(Paint.Style.STROKE);
                            this.f206248S.setAlpha(102);
                            this.f206249T.moveTo(this.f206246R[i19].f206283c, (float) (this.f206260n - this.f206271x));
                            this.f206249T.lineTo(this.f206246R[i19].f206283c, (float) (this.f206252W + this.f206236H + this.f206262p));
                            canvas2.drawPath(this.f206249T, this.f206248S);
                        }
                        int i28 = this.f206252W;
                        if (i28 > 0) {
                            float f2 = (float) i28;
                            float f3 = f2 / ((float) this.f206263p0);
                            if (f3 <= 1.0f / f) {
                                this.f206252W = i28 - 1;
                            } else {
                                this.f206252W = (int) (f2 - (f3 * f));
                            }
                            invalidate();
                        } else {
                            this.f206272x0 = false;
                        }
                    }
                }
                int i29 = this.f206258i;
                if (i29 >= 0 && i29 <= this.f206244Q - 1) {
                    this.f206246R[i29].f206285e = true;
                }
            }
        }
        this.f206248S.reset();
        this.f206249T.reset();
        this.f206248S.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.f206248S.setColor(this.f206255f);
        this.f206248S.setStrokeWidth((float) this.f206265r);
        this.f206248S.setAlpha(102);
        this.f206248S.setStyle(Paint.Style.STROKE);
        int i35 = this.f206237I;
        if (i35 != 0 && !this.f206240L) {
            this.f206249T.moveTo((float) this.f206266s, (float) i35);
            this.f206249T.lineTo((float) (this.f206259j - this.f206270w), (float) this.f206237I);
            canvas2.drawPath(this.f206249T, this.f206248S);
        }
        this.f206248S.reset();
        this.f206249T.reset();
        this.f206248S.setColor(this.f206255f);
        this.f206248S.setStrokeWidth((float) this.f206265r);
        this.f206248S.setStyle(Paint.Style.STROKE);
        this.f206248S.setAlpha(102);
        this.f206249T.reset();
        this.f206249T.moveTo(this.f206275z, (float) (this.f206260n - this.f206271x));
        this.f206249T.lineTo(((float) this.f206259j) - this.f206229A, (float) (this.f206260n - this.f206271x));
        this.f206249T.moveTo(this.f206275z, (float) this.f206273y);
        this.f206249T.lineTo(((float) this.f206259j) - this.f206229A, (float) this.f206273y);
        canvas2.drawPath(this.f206249T, this.f206248S);
        if (!this.f206240L) {
            this.f206248S.reset();
            this.f206248S.setColor(this.f206257h);
            this.f206248S.setAntiAlias(true);
            this.f206248S.setAlpha(102);
            this.f206248S.setStrokeWidth(0.0f);
            this.f206248S.setTextSize(mo98049c(2, 12.0f));
            this.f206248S.setTextAlign(Paint.Align.RIGHT);
            canvas2.drawText(getResources().getString(C0966R.string.jma), (float) (this.f206259j - this.f206230B), (float) (((double) this.f206237I) + (((double) this.f206248S.getTextSize()) * 0.34d)), this.f206248S);
        }
        if (this.f206274y0) {
            this.f206248S.reset();
            this.f206248S.setColor(-1);
            this.f206248S.setAntiAlias(true);
            this.f206248S.setStrokeWidth(0.0f);
            this.f206248S.setTypeface(this.f206238J);
            this.f206248S.setTextAlign(Paint.Align.RIGHT);
            this.f206248S.setTextSize(mo98049c(2, 28.0f));
            String valueOf = String.valueOf(this.f206251V);
            canvas2.drawText(valueOf, (float) (this.f206259j - this.f206235G), (float) this.f206234F, this.f206248S);
            float measureText = this.f206248S.measureText(valueOf);
            this.f206248S.setTextSize(mo98049c(2, 24.0f));
            canvas2.drawText(getResources().getString(C0966R.string.jmd), ((float) (this.f206259j - this.f206235G)) - measureText, (float) this.f206232D, this.f206248S);
        } else {
            this.f206248S.reset();
            this.f206248S.setColor(-1);
            this.f206248S.setAntiAlias(true);
            this.f206248S.setStrokeWidth(0.0f);
            this.f206248S.setTypeface(this.f206238J);
            this.f206248S.setTextSize(mo98049c(2, 24.0f));
            this.f206248S.setTextAlign(Paint.Align.LEFT);
            canvas2.drawText(getResources().getString(C0966R.string.jmc), (float) this.f206233E, (float) this.f206232D, this.f206248S);
            this.f206248S.setTextAlign(Paint.Align.RIGHT);
            this.f206248S.setTextSize(mo98049c(2, 28.0f));
            canvas2.drawText("" + this.f206251V, (float) (this.f206259j - this.f206235G), (float) this.f206234F, this.f206248S);
        }
        if (this.f206246R.length > 2) {
            this.f206248S.reset();
            this.f206248S.setAntiAlias(true);
            this.f206248S.setStrokeWidth(0.0f);
            this.f206248S.setAlpha(102);
            this.f206248S.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f206248S.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) (this.f206260n - this.f206271x), -1, 16777215, Shader.TileMode.REPEAT));
            this.f206248S.setColor(-1);
            mo98048b(canvas2, true);
            mo98051e();
            if (!this.f206240L) {
                mo98048b(canvas2, false);
            }
        }
        this.f206248S.reset();
        this.f206248S.setAntiAlias(true);
        this.f206248S.setStrokeWidth(0.0f);
        this.f206248S.setTextSize(mo98049c(2, 12.0f));
        this.f206248S.setAlpha(153);
        for (int i36 = 0; i36 < this.f206246R.length; i36++) {
            if (i36 == 0) {
                this.f206248S.setTextAlign(Paint.Align.LEFT);
            } else {
                this.f206248S.setTextAlign(Paint.Align.CENTER);
            }
            if (this.f206246R[i36].f206285e) {
                this.f206248S.setColor(-1);
            } else {
                this.f206248S.setColor(this.f206256g);
            }
            C71267c cVar5 = this.f206246R[i36];
            canvas2.drawText(cVar5.f206286f, cVar5.f206283c, (float) (this.f206260n - this.f206231C), this.f206248S);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f206245Q0;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/sport/ui/SportChartView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector2, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/sport/ui/SportChartView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public void setHasSwitchBtn(boolean z) {
        this.f206274y0 = z;
    }

    public void setTodayStep(int i) {
        this.f206251V = i;
    }

    public SportChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo98049c(1, 55.0f);
        this.f206271x = (int) mo98049c(1, 35.0f);
        this.f206273y = (int) mo98049c(1, 45.0f);
        this.f206275z = (float) ((int) mo98049c(1, 8.0f));
        this.f206229A = (float) ((int) mo98049c(1, 8.0f));
        this.f206230B = (int) mo98049c(1, 2.0f);
        this.f206231C = (int) mo98049c(1, 15.0f);
        this.f206232D = (int) mo98049c(1, 33.0f);
        this.f206233E = (int) mo98049c(1, 8.0f);
        this.f206234F = (int) mo98049c(1, 35.0f);
        this.f206235G = (int) mo98049c(1, 10.0f);
        this.f206236H = (int) mo98049c(1, 58.0f);
        mo98049c(1, 1.0f);
        this.f206237I = 0;
        this.f206238J = Typeface.create(Typeface.DEFAULT_BOLD, 0);
        Typeface.create(Typeface.DEFAULT_BOLD, 1);
        this.f206239K = 0;
        this.f206241M = -1;
        this.f206242N = -1;
        this.f206243P = C71266b.WEEK;
        this.f206244Q = 7;
        this.f206246R = new C71267c[7];
        this.f206247R0 = new C71265a();
        mo98050d();
    }
}
