package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.xweb.file.XVFSFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* renamed from: com.tencent.mapsdk.internal.pv */
public final class C114090pv implements View.OnTouchListener {

    /* renamed from: I */
    private static final int f341410I = 50;

    /* renamed from: b */
    private static final int f341411b = 255;

    /* renamed from: c */
    private static final int f341412c = 5;

    /* renamed from: d */
    private static final int f341413d = 6;

    /* renamed from: e */
    private static final double f341414e = 2.5d;

    /* renamed from: f */
    private static final double f341415f = 0.5d;

    /* renamed from: g */
    private static final double f341416g = 0.003d;

    /* renamed from: h */
    private static final double f341417h = 0.001d;

    /* renamed from: i */
    private static final double f341418i = 0.1d;

    /* renamed from: j */
    private static final double f341419j = 0.5d;

    /* renamed from: k */
    private static final int f341420k = 0;

    /* renamed from: l */
    private static final int f341421l = 1;

    /* renamed from: m */
    private static final int f341422m = 2;

    /* renamed from: n */
    private static final int f341423n = 4;

    /* renamed from: o */
    private static final int f341424o = 8;

    /* renamed from: p */
    private static final float f341425p = ((float) Math.cos(0.0017453292780017621d));

    /* renamed from: q */
    private static final int f341426q = 10;

    /* renamed from: u */
    private static final int f341427u = 120;

    /* renamed from: A */
    private final PointF f341428A = new PointF();

    /* renamed from: B */
    private final PointF f341429B = new PointF();

    /* renamed from: C */
    private final PointF f341430C = new PointF();

    /* renamed from: D */
    private long f341431D = 0;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final GestureDetector f341432E;

    /* renamed from: F */
    private final C113536be f341433F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final WeakReference<C114337tf> f341434G;

    /* renamed from: H */
    private final C114092a f341435H;

    /* renamed from: J */
    private Method f341436J;

    /* renamed from: K */
    private Method f341437K;

    /* renamed from: a */
    public final C114093pw f341438a;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f341439r;

    /* renamed from: s */
    private boolean f341440s;

    /* renamed from: t */
    private long f341441t;

    /* renamed from: v */
    private int f341442v = 0;

    /* renamed from: w */
    private final PointF f341443w = new PointF();

    /* renamed from: x */
    private final PointF f341444x = new PointF();

    /* renamed from: y */
    private final PointF f341445y = new PointF();

    /* renamed from: z */
    private final PointF f341446z = new PointF();

    public C114090pv(C114337tf tfVar) {
        C114092a aVar = new C114092a(this, (byte) 0);
        this.f341435H = aVar;
        this.f341434G = new WeakReference<>(tfVar);
        GestureDetector gestureDetector = new GestureDetector(tfVar.mo171543G(), aVar);
        this.f341432E = gestureDetector;
        this.f341438a = new C114093pw();
        this.f341433F = (C113536be) tfVar.f339876d_;
        gestureDetector.setOnDoubleTapListener(aVar);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C114090pv pvVar;
        boolean z;
        double d;
        boolean z2;
        float f;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            this.f341431D = SystemClock.elapsedRealtime();
                            this.f341442v = 0;
                            this.f341439r = true;
                            this.f341441t = SystemClock.elapsedRealtime();
                            this.f341440s = false;
                            m158914a(this.f341445y, this.f341446z, motionEvent2);
                            this.f341438a.mo172043c();
                            return true;
                        } else if (action == 6 && !this.f341440s) {
                            this.f341440s = true;
                            this.f341438a.mo172045d();
                            return true;
                        } else {
                            pvVar = this;
                        }
                    }
                } else if (!this.f341439r || this.f341440s) {
                    pvVar = this;
                    pvVar.f341438a.mo172053k(motionEvent.getX(), motionEvent.getY());
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - this.f341441t < 8) {
                        return true;
                    }
                    this.f341441t = elapsedRealtime;
                    m158914a(this.f341443w, this.f341444x, motionEvent2);
                    PointF pointF = this.f341443w;
                    float f2 = pointF.x;
                    PointF pointF2 = this.f341445y;
                    float f3 = f2 - pointF2.x;
                    float f4 = pointF.y - pointF2.y;
                    PointF pointF3 = this.f341444x;
                    float f5 = pointF3.x;
                    PointF pointF4 = this.f341446z;
                    float f6 = f5 - pointF4.x;
                    float f7 = pointF3.y - pointF4.y;
                    boolean z3 = ((double) Math.abs(f4)) > ((double) Math.abs(f3)) * 1.5d && ((double) Math.abs(f7)) > ((double) Math.abs(f6)) * 1.5d;
                    boolean z4 = ((double) Math.abs(f4)) > ((double) Math.abs(f3)) * 1.5d && ((double) Math.abs(f7)) > ((double) Math.abs(f6)) * 1.5d;
                    boolean z5 = ((double) Math.abs(f3)) > ((double) Math.abs(f4)) * 1.5d && ((double) Math.abs(f6)) > ((double) Math.abs(f7)) * 1.5d;
                    boolean z6 = ((double) Math.abs(f3)) > ((double) Math.abs(f4)) * 1.5d && ((double) Math.abs(f6)) > ((double) Math.abs(f7)) * 1.5d;
                    int i = ((f3 * f6) > 0.0f ? 1 : ((f3 * f6) == 0.0f ? 0 : -1));
                    boolean z7 = i > 0;
                    int i2 = ((f4 * f7) > 0.0f ? 1 : ((f4 * f7) == 0.0f ? 0 : -1));
                    boolean z8 = i2 > 0;
                    int i3 = this.f341442v;
                    boolean z9 = ((i3 & 8) == 0 && (i3 & 1) == 0 && (i3 & 4) == 0) ? false : true;
                    double d2 = 0.5d;
                    double d3 = z9 ? f341418i : 0.5d;
                    if (i > 0) {
                        z = z4;
                        d = (double) Math.abs(f3 + f6);
                    } else {
                        z = z4;
                        d = (double) Math.max(Math.abs(f3), Math.abs(f6));
                    }
                    if (i2 > 0) {
                        f = Math.abs(f4 + f7);
                        z2 = z8;
                    } else {
                        z2 = z8;
                        f = Math.max(Math.abs(f4), Math.abs(f7));
                    }
                    double max = Math.max(d, (double) f);
                    boolean z15 = max > d3;
                    boolean z16 = z15 && z7 && (z5 || z6) && this.f341434G.get().mo171602g();
                    boolean z17 = z15 && z2 && (z3 || z) && this.f341434G.get().mo171607i();
                    PointF pointF5 = this.f341446z;
                    float f8 = pointF5.x;
                    PointF pointF6 = this.f341445y;
                    boolean z18 = z16;
                    float f9 = f4;
                    double d4 = (double) (f8 - pointF6.x);
                    double d5 = (double) (pointF5.y - pointF6.y);
                    PointF pointF7 = this.f341444x;
                    float f15 = f7;
                    float f16 = pointF7.x;
                    float f17 = f6;
                    PointF pointF8 = this.f341443w;
                    float f18 = f3;
                    boolean z19 = z2;
                    double d6 = (double) (f16 - pointF8.x);
                    double d7 = (double) (pointF7.y - pointF8.y);
                    double sqrt = Math.sqrt((d4 * d4) + (d5 * d5));
                    double sqrt2 = Math.sqrt((d6 * d6) + (d7 * d7));
                    double d8 = sqrt * sqrt2;
                    double d9 = ((d4 * d6) + (d5 * d7)) / d8;
                    boolean z25 = z7;
                    boolean z26 = z17;
                    double acos = (Math.acos(d9) * 180.0d) / 3.141592653589793d;
                    if ((d4 * d7) - (d5 * d6) < 0.0d) {
                        acos = -acos;
                    }
                    boolean z27 = Math.abs(d9) < ((double) f341425p);
                    if ((this.f341442v & 2) == 0) {
                        d2 = f341414e;
                    }
                    double abs = Math.abs(acos);
                    boolean z28 = d8 > 0.0d && z27 && Math.abs(acos) > d2 && this.f341434G.get().mo171609j();
                    double d15 = sqrt2 / sqrt;
                    double d16 = z9 ? f341417h : f341416g;
                    double d17 = d15 - 1.0d;
                    double d18 = acos;
                    double abs2 = Math.abs(d17);
                    boolean z29 = sqrt > 0.0d && abs2 > d16 && this.f341434G.get().mo171605h();
                    double d19 = d17;
                    boolean z34 = z29;
                    C113896kq.m157677f(C0949kl.f2250t).mo172332a("trace-gesture", "began:" + z15 + XVFSFile.PATH_SEPARATOR + z29 + XVFSFile.PATH_SEPARATOR + z28, "value:" + max + XVFSFile.PATH_SEPARATOR + abs2 + XVFSFile.PATH_SEPARATOR + abs);
                    if (z28) {
                        z15 = false;
                    }
                    if (z26) {
                        z28 = false;
                        z18 = false;
                        z34 = false;
                    }
                    C113896kq.m157677f(C0949kl.f2250t).mo172332a("beganMove:".concat(String.valueOf(z15)), "vertical:".concat(String.valueOf(z19)), "horizontal:".concat(String.valueOf(z25)), "verticalMove:".concat(String.valueOf(z26)), "horizontalMove:".concat(String.valueOf(z18)));
                    C113896kq.m157677f(C0949kl.f2250t).mo172332a("beganRotate:".concat(String.valueOf(z28)), "cosValue : ".concat(String.valueOf(d9)), "cosAngle : ".concat(String.valueOf(z27)), "angle:".concat(String.valueOf(d18)), "rotateJudge : ".concat(String.valueOf(d2)));
                    C113896kq.m157677f(C0949kl.f2250t).mo172332a("beganScale:".concat(String.valueOf(z34)), "d1:".concat(String.valueOf(sqrt)), "scale - 1 = " + Math.abs(d19), "scaleJudge : ".concat(String.valueOf(d16)));
                    if (z15) {
                        if (z18) {
                            this.f341442v |= 8;
                            C113896kq.m157677f(C0949kl.f2250t).mo172332a("MT_INTENT_MOVE");
                            this.f341438a.mo172046d((f18 + f17) / 2.0f, (f9 + f15) / 2.0f);
                        }
                        if (z26) {
                            this.f341442v |= 1;
                            C113896kq.m157677f(C0949kl.f2250t).mo172332a("MT_INTENT_MOVE_VERTICAL");
                            PointF pointF9 = this.f341445y;
                            PointF pointF10 = this.f341443w;
                            pointF9.set(pointF10.x, pointF10.y);
                            PointF pointF11 = this.f341446z;
                            PointF pointF12 = this.f341444x;
                            pointF11.set(pointF12.x, pointF12.y);
                            this.f341438a.mo172036a(Math.abs(f9) > Math.abs(f15) ? f9 : f15);
                        }
                    }
                    if (z28) {
                        this.f341442v |= 2;
                        C113896kq.m157677f(C0949kl.f2250t).mo172332a("MT_INTENT_ROTATE");
                        if (!z25 || this.f341434G.get().mo171602g()) {
                            PointF pointF13 = this.f341446z;
                            PointF pointF14 = this.f341445y;
                            PointF pointF15 = this.f341444x;
                            PointF pointF16 = this.f341443w;
                            float f19 = pointF14.x;
                            float f25 = pointF13.x;
                            PointF pointF17 = null;
                            if (f19 != f25) {
                                float f26 = pointF16.x;
                                float f27 = pointF15.x;
                                if (f26 != f27) {
                                    float f28 = pointF14.y;
                                    float f29 = pointF13.y;
                                    float f35 = (f28 - f29) / (f19 - f25);
                                    float f36 = pointF16.y;
                                    float f37 = pointF15.y;
                                    float f38 = (f36 - f37) / (f26 - f27);
                                    if (f35 != f38) {
                                        float f39 = ((f37 * f26) - (f36 * f27)) / (f26 - f27);
                                        float f44 = (f39 - (((f29 * f19) - (f28 * f25)) / (f19 - f25))) / (f35 - f38);
                                        pointF17 = new PointF(f44, (f38 * f44) + f39);
                                    }
                                }
                            }
                            if (pointF17 == null ? false : m158915a(pointF17.x, pointF17.y)) {
                                C113536be beVar = this.f341433F;
                                int width = beVar == null ? 0 : beVar.mo171639g().width() / 2;
                                C113536be beVar2 = this.f341433F;
                                this.f341430C.set((float) width, (float) (beVar2 == null ? 0 : beVar2.mo171639g().height() / 2));
                                C114093pw pwVar = this.f341438a;
                                PointF pointF18 = this.f341430C;
                                pwVar.mo172039a(pointF18, pointF18, (float) d18);
                            } else {
                                PointF pointF19 = this.f341428A;
                                PointF pointF20 = this.f341445y;
                                float f45 = pointF20.x;
                                PointF pointF21 = this.f341446z;
                                pointF19.set((f45 + pointF21.x) / 2.0f, (pointF20.y + pointF21.y) / 2.0f);
                                PointF pointF22 = this.f341429B;
                                PointF pointF23 = this.f341443w;
                                float f46 = pointF23.x;
                                PointF pointF24 = this.f341444x;
                                pointF22.set((f46 + pointF24.x) / 2.0f, (pointF23.y + pointF24.y) / 2.0f);
                                this.f341438a.mo172039a(this.f341428A, this.f341429B, (float) d18);
                            }
                        } else {
                            PointF pointF25 = this.f341445y;
                            PointF pointF26 = this.f341443w;
                            pointF25.set(pointF26.x, pointF26.y);
                            PointF pointF27 = this.f341446z;
                            PointF pointF28 = this.f341444x;
                            pointF27.set(pointF28.x, pointF28.y);
                            C113896kq.m157677f(C0949kl.f2250t).mo172332a("NO_HORIZONAL_ROTATE");
                            return true;
                        }
                    }
                    if (z34) {
                        this.f341442v |= 4;
                        C113896kq.m157677f(C0949kl.f2250t).mo172332a("MT_INTENT_SCALE");
                        if (!z25 || this.f341434G.get().mo171602g()) {
                            PointF pointF29 = this.f341428A;
                            PointF pointF30 = this.f341445y;
                            float f47 = pointF30.x;
                            PointF pointF31 = this.f341446z;
                            pointF29.set((f47 + pointF31.x) / 2.0f, (pointF30.y + pointF31.y) / 2.0f);
                            PointF pointF32 = this.f341429B;
                            PointF pointF33 = this.f341443w;
                            float f48 = pointF33.x;
                            PointF pointF34 = this.f341444x;
                            pointF32.set((f48 + pointF34.x) / 2.0f, (pointF33.y + pointF34.y) / 2.0f);
                            this.f341438a.mo172038a(this.f341428A, this.f341429B, sqrt, sqrt2);
                        } else {
                            PointF pointF35 = this.f341445y;
                            PointF pointF36 = this.f341443w;
                            pointF35.set(pointF36.x, pointF36.y);
                            PointF pointF37 = this.f341446z;
                            PointF pointF38 = this.f341444x;
                            pointF37.set(pointF38.x, pointF38.y);
                            C113896kq.m157677f(C0949kl.f2250t).mo172332a("NO_HORIZONAL_SCALE");
                            return true;
                        }
                    }
                    PointF pointF39 = this.f341445y;
                    PointF pointF40 = this.f341443w;
                    pointF39.set(pointF40.x, pointF40.y);
                    PointF pointF41 = this.f341446z;
                    PointF pointF42 = this.f341444x;
                    pointF41.set(pointF42.x, pointF42.y);
                    return true;
                }
            }
            pvVar = this;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - pvVar.f341431D;
            if (pvVar.f341442v == 0 && elapsedRealtime2 > 0 && elapsedRealtime2 < 200) {
                PointF pointF43 = pvVar.f341445y;
                float f49 = pointF43.x;
                PointF pointF44 = pvVar.f341446z;
                double d25 = (double) (f49 - pointF44.x);
                double d26 = (double) (pointF43.y - pointF44.y);
                if ((d25 * d25) + (d26 * d26) > 2500.0d) {
                    pvVar.f341438a.mo172040b();
                }
            }
            pvVar.f341438a.mo172052j(motionEvent.getX(), motionEvent.getY());
        } else {
            pvVar = this;
            pvVar.f341431D = 0;
            pvVar.f341439r = false;
            pvVar.f341438a.mo172051i(motionEvent.getX(), motionEvent.getY());
        }
        if (pvVar.f341439r) {
            return true;
        }
        pvVar.f341432E.onTouchEvent(motionEvent2);
        return true;
    }

    /* renamed from: b */
    private void m158917b(C113711ev evVar) {
        synchronized (this.f341438a) {
            this.f341438a.mo172683b(evVar);
        }
    }

    /* renamed from: c */
    private boolean m158920c() {
        PointF pointF = this.f341445y;
        float f = pointF.x;
        PointF pointF2 = this.f341446z;
        double d = (double) (f - pointF2.x);
        double d2 = (double) (pointF.y - pointF2.y);
        return (d * d) + (d2 * d2) > 2500.0d;
    }

    /* renamed from: a */
    public final void mo172674a(C113711ev evVar) {
        synchronized (this.f341438a) {
            this.f341438a.mo172682a(evVar);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.pv$a */
    public class C114092a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        private PointF f341448b;

        /* renamed from: c */
        private boolean f341449c;

        private C114092a() {
            this.f341448b = new PointF();
            this.f341449c = true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f341449c = true;
                C114090pv.this.f341432E.setIsLongpressEnabled(false);
                this.f341448b.set(motionEvent.getX(), motionEvent.getY());
                C114090pv.this.f341438a.mo172048f(x, y);
            } else if (action == 1) {
                if (this.f341449c) {
                    C114090pv.this.f341438a.mo172037a(x, y);
                }
                this.f341448b.set(0.0f, 0.0f);
                C114090pv.this.f341432E.setIsLongpressEnabled(true);
                C114090pv.this.f341438a.mo172050h(x, y);
            } else if (action == 2) {
                PointF pointF = this.f341448b;
                float f = y - pointF.y;
                if (Math.abs(x - pointF.x) > 10.0f || Math.abs(f) > 10.0f) {
                    this.f341449c = false;
                    C114090pv.this.f341438a.mo172049g(x, y);
                }
                C114090pv.this.f341432E.setIsLongpressEnabled(true);
            }
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C114090pv.this.f341438a.mo172044c(f, f2);
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (!C114090pv.this.f341439r) {
                C114090pv.this.f341438a.mo172047e(motionEvent.getX(), motionEvent.getY());
            }
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!(C114090pv.this.f341434G == null || C114090pv.this.f341434G.get() == null || !((C114337tf) C114090pv.this.f341434G.get()).mo172995Z())) {
                double sqrt = Math.sqrt((double) ((f * f) + (f2 * f2)));
                if ((motionEvent != null && (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f)) || ((motionEvent2 != null && (motionEvent2.getX() < 0.0f || motionEvent2.getY() < 0.0f)) || sqrt > 50.0d)) {
                    return true;
                }
            }
            C114090pv.this.f341438a.mo172046d(-f, -f2);
            return true;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C114090pv.this.f341438a.mo172042b(motionEvent.getX(), motionEvent.getY());
            return true;
        }

        public /* synthetic */ C114092a(C114090pv pvVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    private void m158913a() {
        float f;
        float f2;
        boolean z;
        PointF pointF = this.f341443w;
        float f3 = pointF.x;
        PointF pointF2 = this.f341445y;
        float f4 = f3 - pointF2.x;
        float f5 = pointF.y - pointF2.y;
        PointF pointF3 = this.f341444x;
        float f6 = pointF3.x;
        PointF pointF4 = this.f341446z;
        float f7 = f6 - pointF4.x;
        float f8 = pointF3.y - pointF4.y;
        boolean z2 = ((double) Math.abs(f5)) > ((double) Math.abs(f4)) * 1.5d && ((double) Math.abs(f8)) > ((double) Math.abs(f7)) * 1.5d;
        boolean z3 = ((double) Math.abs(f5)) > ((double) Math.abs(f4)) * 1.5d && ((double) Math.abs(f8)) > ((double) Math.abs(f7)) * 1.5d;
        boolean z4 = ((double) Math.abs(f4)) > ((double) Math.abs(f5)) * 1.5d && ((double) Math.abs(f7)) > ((double) Math.abs(f8)) * 1.5d;
        boolean z5 = ((double) Math.abs(f4)) > ((double) Math.abs(f5)) * 1.5d && ((double) Math.abs(f7)) > ((double) Math.abs(f8)) * 1.5d;
        int i = ((f4 * f7) > 0.0f ? 1 : ((f4 * f7) == 0.0f ? 0 : -1));
        boolean z6 = i > 0;
        int i2 = ((f5 * f8) > 0.0f ? 1 : ((f5 * f8) == 0.0f ? 0 : -1));
        boolean z7 = i2 > 0;
        int i3 = this.f341442v;
        boolean z8 = ((i3 & 8) == 0 && (i3 & 1) == 0 && (i3 & 4) == 0) ? false : true;
        double d = 0.5d;
        double d2 = z8 ? f341418i : 0.5d;
        if (i > 0) {
            f = Math.abs(f4 + f7);
        } else {
            f = Math.max(Math.abs(f4), Math.abs(f7));
        }
        double d3 = (double) f;
        if (i2 > 0) {
            f2 = Math.abs(f5 + f8);
        } else {
            f2 = Math.max(Math.abs(f5), Math.abs(f8));
        }
        double max = Math.max(d3, (double) f2);
        boolean z9 = max > d2;
        boolean z15 = z9 && z6 && (z4 || z5) && this.f341434G.get().mo171602g();
        boolean z16 = z9 && z7 && (z2 || z3) && this.f341434G.get().mo171607i();
        PointF pointF5 = this.f341446z;
        float f9 = pointF5.x;
        PointF pointF6 = this.f341445y;
        boolean z17 = z15;
        double d4 = (double) (f9 - pointF6.x);
        float f15 = f5;
        double d5 = (double) (pointF5.y - pointF6.y);
        PointF pointF7 = this.f341444x;
        float f16 = f8;
        float f17 = pointF7.x;
        float f18 = f7;
        PointF pointF8 = this.f341443w;
        float f19 = f4;
        boolean z18 = z6;
        boolean z19 = z7;
        double d6 = (double) (f17 - pointF8.x);
        double d7 = (double) (pointF7.y - pointF8.y);
        double sqrt = Math.sqrt((d4 * d4) + (d5 * d5));
        double sqrt2 = Math.sqrt((d6 * d6) + (d7 * d7));
        double d8 = sqrt * sqrt2;
        double d9 = ((d4 * d6) + (d5 * d7)) / d8;
        boolean z25 = z16;
        double acos = (Math.acos(d9) * 180.0d) / 3.141592653589793d;
        if ((d4 * d7) - (d5 * d6) < 0.0d) {
            acos = -acos;
        }
        boolean z26 = Math.abs(d9) < ((double) f341425p);
        if ((this.f341442v & 2) == 0) {
            d = f341414e;
        }
        double abs = Math.abs(acos);
        boolean z27 = d8 > 0.0d && z26 && Math.abs(acos) > d && this.f341434G.get().mo171609j();
        double d15 = sqrt2 / sqrt;
        double d16 = z8 ? f341417h : f341416g;
        double d17 = d15 - 1.0d;
        double abs2 = Math.abs(d17);
        boolean z28 = sqrt > 0.0d && abs2 > d16 && this.f341434G.get().mo171605h();
        double d18 = acos;
        boolean z29 = z28;
        C113896kq.m157677f(C0949kl.f2250t).mo172332a("trace-gesture", "began:" + z9 + XVFSFile.PATH_SEPARATOR + z28 + XVFSFile.PATH_SEPARATOR + z27, "value:" + max + XVFSFile.PATH_SEPARATOR + abs2 + XVFSFile.PATH_SEPARATOR + abs);
        if (z27) {
            z9 = false;
        }
        if (z25) {
            z27 = false;
            z17 = false;
            z29 = false;
        }
        C113896kq.m157677f(C0949kl.f2250t).mo172332a("beganMove:".concat(String.valueOf(z9)), "vertical:".concat(String.valueOf(z19)), "horizontal:".concat(String.valueOf(z18)), "verticalMove:".concat(String.valueOf(z25)), "horizontalMove:".concat(String.valueOf(z17)));
        C113896kq.m157677f(C0949kl.f2250t).mo172332a("beganRotate:".concat(String.valueOf(z27)), "cosValue : ".concat(String.valueOf(d9)), "cosAngle : ".concat(String.valueOf(z26)), "angle:".concat(String.valueOf(d18)), "rotateJudge : ".concat(String.valueOf(d)));
        C113896kq.m157677f(C0949kl.f2250t).mo172332a("beganScale:".concat(String.valueOf(z29)), "d1:".concat(String.valueOf(sqrt)), "scale - 1 = " + Math.abs(d17), "scaleJudge : ".concat(String.valueOf(d16)));
        if (z9) {
            if (z17) {
                this.f341442v |= 8;
                C113896kq.m157677f(C0949kl.f2250t).mo172332a("MT_INTENT_MOVE");
                this.f341438a.mo172046d((f19 + f18) / 2.0f, (f15 + f16) / 2.0f);
            }
            if (z25) {
                this.f341442v |= 1;
                C113896kq.m157677f(C0949kl.f2250t).mo172332a("MT_INTENT_MOVE_VERTICAL");
                PointF pointF9 = this.f341445y;
                PointF pointF10 = this.f341443w;
                pointF9.set(pointF10.x, pointF10.y);
                PointF pointF11 = this.f341446z;
                PointF pointF12 = this.f341444x;
                pointF11.set(pointF12.x, pointF12.y);
                this.f341438a.mo172036a(Math.abs(f15) > Math.abs(f16) ? f15 : f16);
            }
        }
        if (z27) {
            this.f341442v |= 2;
            C113896kq.m157677f(C0949kl.f2250t).mo172332a("MT_INTENT_ROTATE");
            if (!z18 || this.f341434G.get().mo171602g()) {
                PointF pointF13 = this.f341446z;
                PointF pointF14 = this.f341445y;
                PointF pointF15 = this.f341444x;
                PointF pointF16 = this.f341443w;
                float f25 = pointF14.x;
                float f26 = pointF13.x;
                PointF pointF17 = null;
                if (f25 != f26) {
                    float f27 = pointF16.x;
                    float f28 = pointF15.x;
                    if (f27 != f28) {
                        float f29 = pointF14.y;
                        float f35 = pointF13.y;
                        float f36 = (f29 - f35) / (f25 - f26);
                        float f37 = pointF16.y;
                        float f38 = pointF15.y;
                        float f39 = (f37 - f38) / (f27 - f28);
                        if (f36 != f39) {
                            float f44 = ((f38 * f27) - (f37 * f28)) / (f27 - f28);
                            float f45 = (f44 - (((f35 * f25) - (f29 * f26)) / (f25 - f26))) / (f36 - f39);
                            pointF17 = new PointF(f45, (f39 * f45) + f44);
                        }
                    }
                }
                if (pointF17 == null) {
                    z = false;
                } else {
                    z = m158915a(pointF17.x, pointF17.y);
                }
                if (z) {
                    C113536be beVar = this.f341433F;
                    int width = beVar == null ? 0 : beVar.mo171639g().width() / 2;
                    C113536be beVar2 = this.f341433F;
                    this.f341430C.set((float) width, (float) (beVar2 == null ? 0 : beVar2.mo171639g().height() / 2));
                    C114093pw pwVar = this.f341438a;
                    PointF pointF18 = this.f341430C;
                    pwVar.mo172039a(pointF18, pointF18, (float) d18);
                } else {
                    PointF pointF19 = this.f341428A;
                    PointF pointF20 = this.f341445y;
                    float f46 = pointF20.x;
                    PointF pointF21 = this.f341446z;
                    pointF19.set((f46 + pointF21.x) / 2.0f, (pointF20.y + pointF21.y) / 2.0f);
                    PointF pointF22 = this.f341429B;
                    PointF pointF23 = this.f341443w;
                    float f47 = pointF23.x;
                    PointF pointF24 = this.f341444x;
                    pointF22.set((f47 + pointF24.x) / 2.0f, (pointF23.y + pointF24.y) / 2.0f);
                    this.f341438a.mo172039a(this.f341428A, this.f341429B, (float) d18);
                }
            } else {
                PointF pointF25 = this.f341445y;
                PointF pointF26 = this.f341443w;
                pointF25.set(pointF26.x, pointF26.y);
                PointF pointF27 = this.f341446z;
                PointF pointF28 = this.f341444x;
                pointF27.set(pointF28.x, pointF28.y);
                C113896kq.m157677f(C0949kl.f2250t).mo172332a("NO_HORIZONAL_ROTATE");
                return;
            }
        }
        if (z29) {
            this.f341442v |= 4;
            C113896kq.m157677f(C0949kl.f2250t).mo172332a("MT_INTENT_SCALE");
            if (!z18 || this.f341434G.get().mo171602g()) {
                PointF pointF29 = this.f341428A;
                PointF pointF30 = this.f341445y;
                float f48 = pointF30.x;
                PointF pointF31 = this.f341446z;
                pointF29.set((f48 + pointF31.x) / 2.0f, (pointF30.y + pointF31.y) / 2.0f);
                PointF pointF32 = this.f341429B;
                PointF pointF33 = this.f341443w;
                float f49 = pointF33.x;
                PointF pointF34 = this.f341444x;
                pointF32.set((f49 + pointF34.x) / 2.0f, (pointF33.y + pointF34.y) / 2.0f);
                this.f341438a.mo172038a(this.f341428A, this.f341429B, sqrt, sqrt2);
            } else {
                PointF pointF35 = this.f341445y;
                PointF pointF36 = this.f341443w;
                pointF35.set(pointF36.x, pointF36.y);
                PointF pointF37 = this.f341446z;
                PointF pointF38 = this.f341444x;
                pointF37.set(pointF38.x, pointF38.y);
                C113896kq.m157677f(C0949kl.f2250t).mo172332a("NO_HORIZONAL_SCALE");
                return;
            }
        }
        PointF pointF39 = this.f341445y;
        PointF pointF40 = this.f341443w;
        pointF39.set(pointF40.x, pointF40.y);
        PointF pointF41 = this.f341446z;
        PointF pointF42 = this.f341444x;
        pointF41.set(pointF42.x, pointF42.y);
    }

    /* renamed from: b */
    private boolean m158918b() {
        PointF pointF = this.f341446z;
        PointF pointF2 = this.f341445y;
        PointF pointF3 = this.f341444x;
        PointF pointF4 = this.f341443w;
        float f = pointF2.x;
        float f2 = pointF.x;
        PointF pointF5 = null;
        if (f != f2) {
            float f3 = pointF4.x;
            float f4 = pointF3.x;
            if (f3 != f4) {
                float f5 = pointF2.y;
                float f6 = pointF.y;
                float f7 = (f5 - f6) / (f - f2);
                float f8 = pointF4.y;
                float f9 = pointF3.y;
                float f15 = (f8 - f9) / (f3 - f4);
                if (f7 != f15) {
                    float f16 = ((f9 * f3) - (f8 * f4)) / (f3 - f4);
                    float f17 = (f16 - (((f6 * f) - (f5 * f2)) / (f - f2))) / (f7 - f15);
                    pointF5 = new PointF(f17, (f15 * f17) + f16);
                }
            }
        }
        if (pointF5 == null) {
            return false;
        }
        return m158915a(pointF5.x, pointF5.y);
    }

    /* renamed from: b */
    private boolean m158919b(float f, float f2) {
        return m158915a(f, f2);
    }

    /* renamed from: a */
    private boolean m158915a(float f, float f2) {
        C113536be beVar = this.f341433F;
        int width = beVar == null ? 0 : beVar.mo171639g().width() / 2;
        C113536be beVar2 = this.f341433F;
        int height = beVar2 == null ? 0 : beVar2.mo171639g().height() / 2;
        C113536be beVar3 = this.f341433F;
        float f3 = 0.0f;
        float width2 = beVar3 == null ? 0.0f : ((float) beVar3.mo171639g().width()) / 3.0f;
        C113536be beVar4 = this.f341433F;
        if (beVar4 != null) {
            f3 = ((float) beVar4.mo171639g().height()) / 3.0f;
        }
        if (Math.abs(f - ((float) width)) >= width2 || Math.abs(f2 - ((float) height)) >= f3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m158914a(PointF pointF, PointF pointF2, MotionEvent motionEvent) {
        try {
            float x = motionEvent.getX(0);
            float x2 = motionEvent.getX(1);
            float y = motionEvent.getY(0);
            float y2 = motionEvent.getY(1);
            pointF.set(x, y);
            pointF2.set(x2, y2);
        } catch (Exception unused) {
        }
    }
}
