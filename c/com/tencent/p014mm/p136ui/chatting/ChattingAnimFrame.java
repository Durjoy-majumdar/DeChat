package com.tencent.p014mm.p136ui.chatting;

import a70.C112760b;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import fj3.C107555b;
import fj3.C75768a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kg3.C76577a;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p51.C110184g;
import r51.C110503b;
import uc0.C111152d;
import uc0.C111153e;
import uc0.C111155i;
import uc0.C111157v;
import uc0.C65320l;
import uc0.C65321s;
import wq3.C111847h;

/* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame */
public class ChattingAnimFrame extends FrameLayout implements C111847h {

    /* renamed from: W */
    public static String f318837W = "";

    /* renamed from: A */
    public float f318838A;

    /* renamed from: B */
    public float f318839B;

    /* renamed from: C */
    public float f318840C;

    /* renamed from: D */
    public float f318841D;

    /* renamed from: E */
    public float f318842E;

    /* renamed from: F */
    public float f318843F;

    /* renamed from: G */
    public float f318844G;

    /* renamed from: H */
    public float f318845H;

    /* renamed from: I */
    public Interpolator f318846I;

    /* renamed from: J */
    public Interpolator f318847J;

    /* renamed from: K */
    public int f318848K;

    /* renamed from: L */
    public int f318849L;

    /* renamed from: M */
    public ValueAnimator f318850M;

    /* renamed from: N */
    public ValueAnimator.AnimatorUpdateListener f318851N = new C106662a();

    /* renamed from: P */
    public Animator.AnimatorListener f318852P = new C106663b();

    /* renamed from: Q */
    public boolean f318853Q;

    /* renamed from: R */
    public C111153e f318854R;

    /* renamed from: S */
    public C110503b f318855S;

    /* renamed from: T */
    public ObjectAnimator f318856T;

    /* renamed from: U */
    public View.OnClickListener f318857U = new C106664c();

    /* renamed from: V */
    public C73268g f318858V;

    /* renamed from: d */
    public FrameLayout f318859d;

    /* renamed from: e */
    public List<MMAnimateView> f318860e = new ArrayList();

    /* renamed from: f */
    public int f318861f = 0;

    /* renamed from: g */
    public PAGView f318862g;

    /* renamed from: h */
    public int f318863h;

    /* renamed from: i */
    public int f318864i;

    /* renamed from: j */
    public int f318865j;

    /* renamed from: n */
    public int f318866n;

    /* renamed from: o */
    public int f318867o = 30;

    /* renamed from: p */
    public int f318868p = 30;

    /* renamed from: q */
    public int f318869q = 40;

    /* renamed from: r */
    public boolean f318870r = false;

    /* renamed from: s */
    public int f318871s = 0;

    /* renamed from: t */
    public ArrayList<Integer> f318872t = new ArrayList<>();

    /* renamed from: u */
    public MMAnimateView f318873u;

    /* renamed from: v */
    public int f318874v;

    /* renamed from: w */
    public int f318875w;

    /* renamed from: x */
    public float f318876x = 0.2f;

    /* renamed from: y */
    public boolean f318877y;

    /* renamed from: z */
    public boolean f318878z;

    /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$g */
    public interface C73268g {
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$a */
    public class C106662a implements ValueAnimator.AnimatorUpdateListener {
        public C106662a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ObjectAnimator objectAnimator;
            ObjectAnimator objectAnimator2;
            ChattingAnimFrame chattingAnimFrame = ChattingAnimFrame.this;
            if (chattingAnimFrame.f318853Q) {
                if (chattingAnimFrame.f318846I == null) {
                    chattingAnimFrame.f318846I = new LinearInterpolator();
                }
                ChattingAnimFrame chattingAnimFrame2 = ChattingAnimFrame.this;
                if (chattingAnimFrame2.f318847J == null) {
                    chattingAnimFrame2.f318847J = new LinearInterpolator();
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChattingAnimFrame chattingAnimFrame3 = ChattingAnimFrame.this;
                int i = chattingAnimFrame3.f318848K;
                if (i == 2) {
                    chattingAnimFrame3.f318845H = (float) (chattingAnimFrame3.f318864i - chattingAnimFrame3.f318849L);
                } else if (i == 3) {
                    float f = (float) chattingAnimFrame3.f318864i;
                    chattingAnimFrame3.f318844G = chattingAnimFrame3.f318840C * f;
                    chattingAnimFrame3.f318845H = f * chattingAnimFrame3.f318841D;
                }
                float f2 = chattingAnimFrame3.f318842E;
                float interpolation = f2 + ((chattingAnimFrame3.f318843F - f2) * chattingAnimFrame3.f318846I.getInterpolation(floatValue));
                ChattingAnimFrame chattingAnimFrame4 = ChattingAnimFrame.this;
                float f3 = chattingAnimFrame4.f318844G;
                float interpolation2 = f3 + ((chattingAnimFrame4.f318845H - f3) * chattingAnimFrame4.f318847J.getInterpolation(floatValue));
                MMAnimateView mMAnimateView = ChattingAnimFrame.this.f318873u;
                if (mMAnimateView != null) {
                    mMAnimateView.setX(interpolation);
                    ChattingAnimFrame.this.f318873u.setY(interpolation2);
                    ChattingAnimFrame chattingAnimFrame5 = ChattingAnimFrame.this;
                    if (!chattingAnimFrame5.f318877y && floatValue > chattingAnimFrame5.f318876x) {
                        Log.m105919d("MicroMsg.ChattingAnimFrame", "luckyBagYAnim, y: %s, 1: %s, 2: %s.", Float.valueOf(floatValue), Float.valueOf(ChattingAnimFrame.this.f318876x), Float.valueOf(ChattingAnimFrame.this.f318876x * 2.0f));
                        Log.m105918d("MicroMsg.ChattingAnimFrame", "lucky bag rotate 1.");
                        ChattingAnimFrame chattingAnimFrame6 = ChattingAnimFrame.this;
                        chattingAnimFrame6.f318877y = true;
                        if (!(chattingAnimFrame6.f318873u == null || (objectAnimator2 = chattingAnimFrame6.f318856T) == null || !chattingAnimFrame6.f318853Q)) {
                            objectAnimator2.start();
                        }
                    }
                    ChattingAnimFrame chattingAnimFrame7 = ChattingAnimFrame.this;
                    if (!chattingAnimFrame7.f318878z && floatValue > chattingAnimFrame7.f318876x * 3.0f) {
                        Log.m105919d("MicroMsg.ChattingAnimFrame", "luckyBagYAnim, y: %s, 1: %s, 2: %s.", Float.valueOf(floatValue), Float.valueOf(ChattingAnimFrame.this.f318876x), Float.valueOf(ChattingAnimFrame.this.f318876x * 2.0f));
                        Log.m105918d("MicroMsg.ChattingAnimFrame", "lucky bag rotate 2.");
                        ChattingAnimFrame chattingAnimFrame8 = ChattingAnimFrame.this;
                        chattingAnimFrame8.f318878z = true;
                        if (chattingAnimFrame8.f318873u != null && (objectAnimator = chattingAnimFrame8.f318856T) != null && chattingAnimFrame8.f318853Q) {
                            objectAnimator.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$b */
    public class C106663b implements Animator.AnimatorListener {
        public C106663b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i("MicroMsg.ChattingAnimFrame", "onAnimationEnd: luckBag");
            ChattingAnimFrame chattingAnimFrame = ChattingAnimFrame.this;
            if (chattingAnimFrame.f318853Q) {
                chattingAnimFrame.mo153607d();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            Log.m105924i("MicroMsg.ChattingAnimFrame", "onAnimationStart: luckyBag");
            ChattingAnimFrame chattingAnimFrame = ChattingAnimFrame.this;
            if (chattingAnimFrame.f318848K == 1) {
                chattingAnimFrame.f318844G = ((float) chattingAnimFrame.f318864i) * chattingAnimFrame.f318840C;
                chattingAnimFrame.f318845H = (float) (-chattingAnimFrame.f318849L);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$c */
    public class C106664c implements View.OnClickListener {

        /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$c$a */
        public class C106665a implements Animation.AnimationListener {
            public C106665a() {
            }

            public void onAnimationEnd(Animation animation) {
                ChattingAnimFrame chattingAnimFrame = ChattingAnimFrame.this;
                String str = ChattingAnimFrame.f318837W;
                chattingAnimFrame.mo153607d();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                ((Vibrator) ChattingAnimFrame.this.getContext().getSystemService("vibrator")).vibrate(500);
                ChattingAnimFrame chattingAnimFrame = ChattingAnimFrame.this;
                C73268g gVar = chattingAnimFrame.f318858V;
                if (gVar != null) {
                    C106696k3 k3Var = (C106696k3) gVar;
                    C106691j3.m144077a(k3Var.f318978c, chattingAnimFrame.f318855S, chattingAnimFrame.f318854R, k3Var.f318976a, k3Var.f318977b);
                }
            }
        }

        public C106664c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingAnimFrame$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.ChattingAnimFrame", "lucky bag click!!!");
            C110184g.f329618a.mo161587a(4, C110184g.f329625h);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setAnimationListener(new C106665a());
            ChattingAnimFrame.this.f318873u.startAnimation(alphaAnimation);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingAnimFrame$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$d */
    public class C106666d implements Animation.AnimationListener {
        public C106666d(ChattingAnimFrame chattingAnimFrame) {
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$f */
    public class C106669f extends AnimationSet {

        /* renamed from: d */
        public int f318900d;

        /* renamed from: e */
        public long f318901e;

        /* renamed from: f */
        public MMAnimateView f318902f;

        /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$f$a */
        public class C106670a extends C106666d {

            /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$f$a$a */
            public class C106671a implements Runnable {
                public C106671a() {
                }

                public void run() {
                    C106669f.this.f318902f.setVisibility(0);
                }
            }

            public C106670a(ChattingAnimFrame chattingAnimFrame) {
                super(ChattingAnimFrame.this);
            }

            public void onAnimationEnd(Animation animation) {
                Log.m105925i("MicroMsg.ChattingAnimFrame", "onAnimationEnd: %s", C106669f.this.f318902f);
                C106669f fVar = C106669f.this;
                MMAnimateView mMAnimateView = fVar.f318902f;
                if (mMAnimateView != null) {
                    mMAnimateView.post(new C106697r0(fVar));
                } else {
                    Log.m105928w("MicroMsg.ChattingAnimFrame", "mTargetView is NULL.");
                }
            }

            public void onAnimationStart(Animation animation) {
                Log.m105925i("MicroMsg.ChattingAnimFrame", "onAnimationStart: %s", C106669f.this.f318902f);
                C106669f fVar = C106669f.this;
                MMAnimateView mMAnimateView = fVar.f318902f;
                if (mMAnimateView != null) {
                    mMAnimateView.postDelayed(new C106671a(), fVar.f318901e);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C106669f(int r7, int r8, long r9, boolean r11) {
            /*
                r5 = this;
                com.tencent.p014mm.p136ui.chatting.ChattingAnimFrame.this = r6
                r0 = 0
                r5.<init>(r0)
                r5.f318900d = r8
                r1 = 3
                r2 = 2
                if (r7 == 0) goto L_0x0047
                r3 = 1
                if (r7 == r3) goto L_0x0047
                r3 = 999(0x3e7, float:1.4E-42)
                if (r7 == r2) goto L_0x0034
                if (r7 == r1) goto L_0x0021
                r11 = 4
                if (r7 == r11) goto L_0x0047
                com.tencent.mm.ui.chatting.ChattingAnimFrame$e r11 = new com.tencent.mm.ui.chatting.ChattingAnimFrame$e
                r11.<init>(r0, r8)
                r5.addAnimation(r11)
                goto L_0x004f
            L_0x0021:
                com.tencent.mm.ui.chatting.ChattingAnimFrame$e r0 = new com.tencent.mm.ui.chatting.ChattingAnimFrame$e
                r0.<init>(r7, r8, r11)
                r5.addAnimation(r0)
                com.tencent.mm.ui.chatting.ChattingAnimFrame$e r8 = new com.tencent.mm.ui.chatting.ChattingAnimFrame$e
                int r11 = r5.f318900d
                r8.<init>(r3, r11)
                r5.addAnimation(r8)
                goto L_0x004f
            L_0x0034:
                com.tencent.mm.ui.chatting.ChattingAnimFrame$e r11 = new com.tencent.mm.ui.chatting.ChattingAnimFrame$e
                r11.<init>(r3, r8)
                r5.addAnimation(r11)
                com.tencent.mm.ui.chatting.ChattingAnimFrame$e r8 = new com.tencent.mm.ui.chatting.ChattingAnimFrame$e
                int r11 = r5.f318900d
                r8.<init>(r7, r11)
                r5.addAnimation(r8)
                goto L_0x004f
            L_0x0047:
                com.tencent.mm.ui.chatting.ChattingAnimFrame$e r11 = new com.tencent.mm.ui.chatting.ChattingAnimFrame$e
                r11.<init>(r7, r8)
                r5.addAnimation(r11)
            L_0x004f:
                com.tencent.mm.ui.chatting.ChattingAnimFrame$f$a r8 = new com.tencent.mm.ui.chatting.ChattingAnimFrame$f$a
                r8.<init>(r6)
                r5.setAnimationListener(r8)
                r3 = 500(0x1f4, double:2.47E-321)
                long r9 = r9 + r3
                r5.f318901e = r9
                r5.reset()
                java.lang.String r8 = com.tencent.p014mm.p136ui.chatting.ChattingAnimFrame.f318837W
                r6.getClass()
                if (r7 == r2) goto L_0x0077
                if (r7 == r1) goto L_0x0074
                r6 = 1165623296(0x457a0000, float:4000.0)
                r7 = 1169915904(0x45bb8000, float:6000.0)
                float r6 = com.tencent.p014mm.p136ui.chatting.ChattingAnimFrame.m144040a(r6, r7)
                int r6 = (int) r6
                long r6 = (long) r6
                goto L_0x0079
            L_0x0074:
                r6 = 1500(0x5dc, double:7.41E-321)
                goto L_0x0079
            L_0x0077:
                r6 = 1200(0x4b0, double:5.93E-321)
            L_0x0079:
                r5.setDuration(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.ChattingAnimFrame.C106669f.<init>(com.tencent.mm.ui.chatting.ChattingAnimFrame, int, int, long, boolean):void");
        }
    }

    public ChattingAnimFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f318859d = frameLayout;
        addView(frameLayout);
        this.f318865j = C76577a.m92159j(getContext());
        this.f318866n = C76577a.m92145A(getContext());
        this.f318874v = C76577a.m92151b(getContext(), 60);
        this.f318875w = C76577a.m92151b(getContext(), 80);
    }

    /* renamed from: a */
    public static float m144040a(float f, float f2) {
        return f + (((float) Math.random()) * (f2 - f));
    }

    private static String getDataEmojiPath() {
        if (Util.isNullOrNil(f318837W)) {
            f318837W = C112760b.m154231g();
            f318837W += "/emoji";
        }
        return f318837W;
    }

    /* renamed from: b */
    public void mo153605b() {
        String str;
        C111153e eVar = this.f318854R;
        C111152d dVar = eVar.f332888r;
        if (dVar != null) {
            C111157v vVar = dVar.f332876g;
            this.f318848K = vVar.f332918e;
            int i = vVar.f332920g;
            this.f318849L = C76577a.m92151b(getContext(), (int) m144040a((float) i, (float) vVar.f332921h));
            str = vVar.f332917d;
        } else {
            C111155i iVar = eVar.f332889s;
            if (iVar != null) {
                C111157v vVar2 = iVar.f332897e;
                this.f318848K = vVar2.f332918e;
                int i2 = vVar2.f332920g;
                this.f318849L = C76577a.m92151b(getContext(), (int) m144040a((float) i2, (float) vVar2.f332921h));
                str = vVar2.f332917d;
            } else {
                C65321s sVar = eVar.f332885o.f332915x;
                this.f318848K = sVar.f187999e;
                this.f318849L = C76577a.m92151b(getContext(), sVar.f188000f);
                str = sVar.f187998d;
            }
        }
        int i3 = this.f318849L;
        this.f318874v = i3;
        this.f318875w = i3;
        this.f318838A = 0.0f;
        float f = (float) this.f318866n;
        this.f318839B = f;
        this.f318840C = 0.0f;
        float f2 = (float) this.f318865j;
        this.f318841D = f2;
        float f3 = 0.9f - ((((float) i3) * 1.0f) / f);
        float f4 = (((float) (-i3)) * 1.1f) / f2;
        this.f318847J = new LinearInterpolator();
        int i4 = this.f318848K;
        if (i4 == 1) {
            float a = m144040a(0.1f, f3);
            this.f318838A = a;
            float a2 = m144040a(a - 0.25f, a + 0.25f);
            this.f318839B = a2;
            this.f318839B = Math.max(0.1f, Math.min(a2, f3));
            this.f318840C = 1.0f;
            this.f318841D = f4;
        } else if (i4 == 2) {
            float a3 = m144040a(0.1f, f3);
            this.f318838A = a3;
            float a4 = m144040a(a3 - 0.25f, a3 + 0.25f);
            this.f318839B = a4;
            this.f318839B = Math.max(0.1f, Math.min(a4, f3));
            this.f318840C = f4;
            this.f318841D = 1.0f;
            this.f318847J = new C75768a();
        } else if (i4 == 3) {
            float a5 = m144040a(0.1f, f3);
            this.f318838A = a5;
            float a6 = m144040a(a5 - 0.25f, a5 + 0.25f);
            this.f318839B = a6;
            this.f318839B = Math.max(0.1f, Math.min(a6, f3));
            this.f318840C = 1.5f;
            this.f318841D = m144040a(0.25f, 0.55f);
            this.f318847J = new C107555b(0.5f);
        } else if (i4 != 4) {
            float a7 = m144040a(0.1f, f3);
            this.f318838A = a7;
            float a8 = m144040a(a7 - 0.5f, a7 + 0.5f);
            this.f318839B = a8;
            this.f318839B = Math.max(0.1f, Math.min(a8, f3));
            this.f318840C = f4;
            this.f318841D = 1.0f;
        } else {
            float a9 = m144040a(f4, 1.0f - ((((float) this.f318849L) * 1.0f) / ((float) this.f318864i)));
            this.f318838A = 1.0f;
            this.f318839B = 0.0f - ((((float) this.f318849L) * 1.0f) / ((float) this.f318866n));
            this.f318840C = a9;
            this.f318841D = a9;
        }
        Log.m105925i("MicroMsg.ChattingAnimFrame", "luckyBag, s[%s] e[%s].", Float.valueOf(this.f318838A), Float.valueOf(this.f318839B));
        float f5 = (float) this.f318866n;
        float f6 = this.f318838A * f5;
        this.f318842E = f6;
        this.f318843F = f5 * this.f318839B;
        float f7 = (float) this.f318865j;
        float f8 = this.f318840C;
        this.f318844G = f7 * f8;
        float f9 = this.f318841D;
        this.f318845H = f7 * f9;
        if (this.f318848K == 4) {
            float f15 = (float) this.f318864i;
            this.f318844G = f8 * f15;
            this.f318845H = f15 * f9;
        }
        Log.m105925i("MicroMsg.ChattingAnimFrame", "luckyBag, init: startX[%s] endX[%s] startY[%s] endY[%s].", Float.valueOf(f6), Float.valueOf(this.f318843F), Float.valueOf(this.f318844G), Float.valueOf(this.f318845H));
        if (this.f318873u == null) {
            MMAnimateView mMAnimateView = new MMAnimateView(getContext(), (AttributeSet) null);
            this.f318873u = mMAnimateView;
            mMAnimateView.setOnClickListener(this.f318857U);
        }
        this.f318873u.setPivotX(((float) this.f318874v) / 2.0f);
        this.f318873u.setPivotY(((float) this.f318875w) / 2.0f);
        this.f318873u.setRotation(0.0f);
        this.f318873u.setImageFilePath(getDataEmojiPath() + "/egg/" + str);
        this.f318873u.setLayoutParams(new FrameLayout.LayoutParams(this.f318874v, this.f318875w));
        this.f318873u.setX(this.f318842E);
        this.f318873u.setY(this.f318844G);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f318850M = ofFloat;
        ofFloat.setDuration((long) ((int) m144040a(7000.0f, 10000.0f)));
        this.f318850M.setInterpolator(new LinearInterpolator());
        this.f318850M.addUpdateListener(this.f318851N);
        this.f318850M.setStartDelay(1500);
        this.f318850M.addListener(this.f318852P);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f318873u, View.ROTATION, new float[]{0.0f, 15.0f, -15.0f, 15.0f, -15.0f, 0.0f});
        this.f318856T = ofFloat2;
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f318856T.setDuration(500);
        this.f318856T.setRepeatCount(1);
        this.f318877y = false;
        this.f318878z = false;
    }

    /* renamed from: c */
    public boolean mo153606c(C111153e eVar) {
        int i;
        String str;
        int i2;
        long j;
        double d;
        double d2;
        C111153e eVar2 = eVar;
        mo153608e();
        char c = 0;
        String str2 = "MicroMsg.ChattingAnimFrame";
        if (eVar2 == null) {
            Log.m105928w(str2, "egg info is null. ignore.");
            return false;
        }
        int size = eVar2.f332886p.size();
        if (size <= 0) {
            Log.m105920e(str2, "wtf!!! no anim!!!");
            return false;
        }
        if (1 != size) {
            i = new Random().nextInt(size);
            Log.m105919d(str2, "random egg: %s, from %s.", Integer.valueOf(i), Integer.valueOf(size));
        } else {
            i = 0;
        }
        C111157v vVar = eVar2.f332886p.get(i);
        String str3 = getDataEmojiPath() + "/egg/" + vVar.f332917d;
        if (!C86013q1.m106450k(str3)) {
            Log.m105928w(str2, "egg file isn't exist. ignore");
            return false;
        }
        this.f318854R = eVar2;
        setVisibility(0);
        if (C106691j3.m144079d(eVar)) {
            C115669n.INSTANCE.mo175911u(1263, 3);
        }
        int i3 = vVar.f332919f;
        if (i3 > 0) {
            this.f318867o = i3;
            if (i3 > 60) {
                this.f318867o = 60;
            }
        } else {
            this.f318867o = 30;
        }
        int i4 = vVar.f332920g;
        if (i4 > 0) {
            this.f318868p = i4;
        } else {
            this.f318868p = 30;
        }
        int i5 = vVar.f332921h;
        if (i5 > 0) {
            this.f318869q = i5;
        } else {
            this.f318869q = 40;
        }
        int i6 = 4;
        Log.m105925i(str2, "Egg viewCount:%d minSize:%d maxSize:%d AnimType:%d reportType:%d", Integer.valueOf(this.f318867o), Integer.valueOf(this.f318868p), Integer.valueOf(this.f318869q), Integer.valueOf(vVar.f332918e), Integer.valueOf(eVar2.f332880g));
        C65320l lVar = eVar2.f332893w;
        if (lVar != null && !Util.isNullOrNil(lVar.f187997g)) {
            PAGView pAGView = this.f318862g;
            if (pAGView != null) {
                pAGView.stop();
                removeView(this.f318862g);
            }
            this.f318862g = new PAGView(getContext());
            String str4 = getDataEmojiPath() + "/egg/" + eVar2.f332893w.f187997g;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 49;
            this.f318862g.setPath(str4);
            PAGFile Load = PAGFile.Load(str4);
            layoutParams.height = (Load.height() * ((ViewGroup) getParent()).getWidth()) / Load.width();
            addView(this.f318862g, 0, layoutParams);
            this.f318862g.play();
        }
        int i7 = this.f318867o;
        if (i7 <= 0) {
            Log.m105928w(str2, "count is zero.");
        } else {
            int i8 = (int) (((double) i7) * 0.1d);
            ArrayList<Integer> arrayList = this.f318872t;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f318872t = new ArrayList<>();
            }
            while (this.f318872t.size() < i8) {
                int a = (int) m144040a(0.0f, (float) i7);
                if (!this.f318872t.contains(Integer.valueOf(a))) {
                    this.f318872t.add(Integer.valueOf(a));
                }
            }
        }
        long j2 = 0;
        int i9 = 0;
        while (i9 < this.f318867o) {
            int b = C76577a.m92151b(getContext(), (int) m144040a((float) this.f318868p, (float) this.f318869q));
            long j3 = j2 + 500;
            int i15 = vVar.f332918e;
            ArrayList<Integer> arrayList2 = this.f318872t;
            int i16 = i9;
            C106669f fVar = r0;
            C106669f fVar2 = new C106669f(i15, b, j3, arrayList2 != null && arrayList2.contains(Integer.valueOf(i9)));
            MMAnimateView mMAnimateView = new MMAnimateView(getContext(), (AttributeSet) null);
            mMAnimateView.setImageFilePath(str3);
            mMAnimateView.setAnimation(fVar);
            mMAnimateView.setLayerType(2, (Paint) null);
            mMAnimateView.setVisibility(i6);
            fVar.f318902f = mMAnimateView;
            int i17 = fVar.f318900d;
            mMAnimateView.setLayoutParams(new FrameLayout.LayoutParams(i17, i17));
            ((ArrayList) this.f318860e).add(mMAnimateView);
            int i18 = this.f318861f + 1;
            this.f318861f = i18;
            Object[] objArr = new Object[2];
            objArr[c] = Integer.valueOf(i18);
            objArr[1] = mMAnimateView;
            Log.m105925i(str2, "addView counter++: [%s]. %s", objArr);
            this.f318859d.addView(mMAnimateView);
            int i19 = vVar.f332918e;
            int i25 = this.f318867o;
            if (i19 == 2) {
                i2 = i16;
                str = str2;
                if (i2 < 2) {
                    j = 800;
                    j2 += j;
                    i9 = i2 + 1;
                    str2 = str;
                    c = 0;
                    i6 = 4;
                } else {
                    d2 = Math.abs((((double) i2) - (((double) i25) * 0.5d)) - 5.0d) / ((double) (i25 * 3));
                    d = 0.01d;
                }
            } else if (i19 != 3) {
                j2 = (long) ((int) (m144040a(0.0f, 4.0f) * 1000.0f));
                i2 = i16;
                str = str2;
                i9 = i2 + 1;
                str2 = str;
                c = 0;
                i6 = 4;
            } else {
                i2 = i16;
                str = str2;
                d2 = Math.abs((((double) i2) - (((double) i25) * 0.5d)) - 5.0d) / ((double) (i25 * 6));
                d = 0.06d;
            }
            j = (long) ((d2 + d) * 1000.0d);
            j2 += j;
            i9 = i2 + 1;
            str2 = str;
            c = 0;
            i6 = 4;
        }
        List<MMAnimateView> list = this.f318860e;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view != null && (view.getAnimation() instanceof C106669f)) {
                    C106669f fVar3 = (C106669f) view.getAnimation();
                    fVar3.setStartOffset(fVar3.f318901e);
                    fVar3.start();
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void mo153607d() {
        MMAnimateView mMAnimateView = this.f318873u;
        if (mMAnimateView != null && this.f318853Q) {
            mMAnimateView.mo129237x();
            this.f318859d.removeView(this.f318873u);
            this.f318853Q = false;
            this.f318855S = null;
            ValueAnimator valueAnimator = this.f318850M;
            if (valueAnimator != null) {
                valueAnimator.end();
                this.f318850M = null;
            }
            ObjectAnimator objectAnimator = this.f318856T;
            if (objectAnimator != null) {
                objectAnimator.end();
                this.f318856T = null;
            }
            this.f318873u.setRotation(0.0f);
        }
    }

    /* renamed from: e */
    public void mo153608e() {
        Log.m105925i("MicroMsg.ChattingAnimFrame", "stop: view: %s, count:%s", Integer.valueOf(((ArrayList) this.f318860e).size()), Integer.valueOf(this.f318861f));
        Iterator it = ((ArrayList) this.f318860e).iterator();
        while (it.hasNext()) {
            MMAnimateView mMAnimateView = (MMAnimateView) it.next();
            mMAnimateView.clearAnimation();
            mMAnimateView.mo129226s();
            this.f318859d.removeView(mMAnimateView);
            Log.m105925i("MicroMsg.ChattingAnimFrame", "stop: remove view %s", mMAnimateView);
        }
        ((ArrayList) this.f318860e).clear();
        mo153607d();
        PAGView pAGView = this.f318862g;
        if (pAGView != null) {
            pAGView.stop();
            removeView(this.f318862g);
            this.f318862g = null;
        }
        this.f318861f = 0;
        Log.m105925i("MicroMsg.ChattingAnimFrame", "stop: end child count %s", Integer.valueOf(getChildCount()));
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f318864i = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        this.f318863h = measuredWidth;
        Log.m105919d("MicroMsg.ChattingAnimFrame", "onFinishInflate width:%d height:%d", Integer.valueOf(measuredWidth), Integer.valueOf(this.f318864i));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        this.f318864i = i5;
        int i6 = i3 - i;
        this.f318863h = i6;
        int i7 = this.f318865j;
        if (i5 < i7) {
            this.f318870r = true;
            this.f318871s = i7 - i5;
        } else {
            this.f318870r = false;
            this.f318871s = 0;
        }
        Log.m105925i("MicroMsg.ChattingAnimFrame", "onLayout width:%d height:%d isKeyBordUp:%b keyBordHeight:%d", Integer.valueOf(i6), Integer.valueOf(this.f318864i), Boolean.valueOf(this.f318870r), Integer.valueOf(this.f318871s));
    }

    public void setOnLuckyBagClick(C73268g gVar) {
        this.f318858V = gVar;
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$e */
    public class C106667e extends Animation {

        /* renamed from: d */
        public float f318883d;

        /* renamed from: e */
        public float f318884e;

        /* renamed from: f */
        public float f318885f;

        /* renamed from: g */
        public float f318886g;

        /* renamed from: h */
        public float f318887h;

        /* renamed from: i */
        public float f318888i;

        /* renamed from: j */
        public float f318889j;

        /* renamed from: n */
        public float f318890n;

        /* renamed from: o */
        public float f318891o;

        /* renamed from: p */
        public float f318892p;

        /* renamed from: q */
        public int f318893q;

        /* renamed from: r */
        public int f318894r;

        /* renamed from: s */
        public boolean f318895s;

        /* renamed from: t */
        public boolean f318896t = false;

        /* renamed from: u */
        public View.OnLayoutChangeListener f318897u = new C106668a();

        /* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame$e$a */
        public class C106668a implements View.OnLayoutChangeListener {
            public C106668a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C106667e.this.mo153621a();
            }
        }

        public C106667e(int i, int i2) {
            this.f318893q = i;
            this.f318894r = i2;
            this.f318895s = false;
        }

        /* renamed from: a */
        public void mo153621a() {
            float f = this.f318883d;
            ChattingAnimFrame chattingAnimFrame = ChattingAnimFrame.this;
            int i = chattingAnimFrame.f318863h;
            this.f318887h = f * ((float) i);
            this.f318888i = this.f318884e * ((float) i);
            int i2 = this.f318893q;
            if (i2 == 2) {
                float f2 = this.f318885f;
                int i3 = chattingAnimFrame.f318864i;
                this.f318889j = f2 * ((float) i3);
                this.f318890n = this.f318886g * ((float) i3);
            } else if (i2 == 3) {
                float f3 = this.f318885f;
                int i4 = chattingAnimFrame.f318865j;
                this.f318889j = ((float) i4) * f3;
                float f4 = this.f318886g;
                this.f318890n = ((float) i4) * f4;
                if (chattingAnimFrame.f318870r) {
                    int i5 = chattingAnimFrame.f318871s;
                    this.f318889j = (f3 * ((float) i4)) - ((float) i5);
                    this.f318890n = (f4 * ((float) i4)) - ((float) i5);
                }
                if (this.f318890n < 0.0f) {
                    this.f318890n = 0.0f;
                }
            } else if (i2 == 4) {
                float f5 = this.f318885f;
                int i6 = chattingAnimFrame.f318864i;
                this.f318889j = f5 * ((float) i6);
                this.f318890n = this.f318886g * ((float) i6);
            } else {
                float f6 = this.f318885f;
                int i7 = chattingAnimFrame.f318865j;
                this.f318889j = f6 * ((float) i7);
                this.f318890n = this.f318886g * ((float) i7);
            }
        }

        public void applyTransformation(float f, Transformation transformation) {
            if (f > 0.0f && !this.f318896t) {
                if (this.f318893q == 1) {
                    float f2 = this.f318885f;
                    int i = ChattingAnimFrame.this.f318864i;
                    this.f318889j = f2 * ((float) i);
                    this.f318890n = this.f318886g * ((float) i);
                }
                this.f318896t = true;
            }
            float f3 = this.f318887h;
            float f4 = this.f318889j;
            float f5 = this.f318888i;
            if (f3 != f5) {
                f3 += (f5 - f3) * f;
            }
            float f6 = this.f318890n;
            if (f4 != f6) {
                f4 += (f6 - f4) * f;
                if (this.f318893q == 2) {
                    f4 -= (float) this.f318894r;
                }
            }
            transformation.getMatrix().setTranslate(f3, f4);
            float f7 = this.f318891o;
            float f8 = this.f318892p;
            if (f7 != f8 && 3 == this.f318893q) {
                float f9 = f7 + ((f8 - f7) * f);
                transformation.getMatrix().postScale(f9, f9);
            }
        }

        public void finalize() {
            super.finalize();
            Log.m105924i("MicroMsg.ChattingAnimFrame", "finalize!");
            ChattingAnimFrame.this.removeOnLayoutChangeListener(this.f318897u);
        }

        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            int i5 = this.f318893q;
            if (i5 == 1) {
                float a = ChattingAnimFrame.m144040a(0.1f, 0.9f);
                this.f318883d = a;
                this.f318884e = ChattingAnimFrame.m144040a(a - 0.25f, a + 0.25f);
                this.f318885f = 1.1f;
                this.f318886g = -0.2f;
                setInterpolator(new LinearInterpolator());
            } else if (i5 == 2) {
                this.f318883d = 0.0f;
                this.f318884e = 0.0f;
                this.f318885f = 0.0f;
                this.f318886g = 1.0f;
                setInterpolator(new C75768a());
            } else if (i5 == 3) {
                this.f318883d = 0.0f;
                this.f318884e = 0.0f;
                this.f318885f = 1.5f;
                if (this.f318895s) {
                    this.f318886g = ChattingAnimFrame.m144040a(0.4f, 0.55f);
                } else {
                    this.f318886g = ChattingAnimFrame.m144040a(0.54999995f, 0.85f);
                }
                setInterpolator(new C107555b(0.5f));
            } else if (i5 == 4) {
                float a2 = ChattingAnimFrame.m144040a(0.0f, 1.0f - ((((float) this.f318894r) * 1.0f) / ((float) ChattingAnimFrame.this.f318864i)));
                this.f318883d = 1.0f;
                this.f318884e = 0.0f - ((((float) this.f318894r) * 1.0f) / ((float) ChattingAnimFrame.this.f318863h));
                this.f318885f = a2;
                this.f318886g = a2;
                setInterpolator(new LinearInterpolator());
            } else if (i5 != 999) {
                float a3 = ChattingAnimFrame.m144040a(0.1f, 0.9f);
                this.f318883d = a3;
                this.f318884e = ChattingAnimFrame.m144040a(a3 - 0.5f, a3 + 0.5f);
                this.f318885f = -0.2f;
                this.f318886g = 1.1f;
                setInterpolator(new LinearInterpolator());
            } else {
                float a4 = ChattingAnimFrame.m144040a(0.1f, 0.9f);
                this.f318883d = a4;
                this.f318884e = ChattingAnimFrame.m144040a(a4 - 0.5f, a4 + 0.5f);
                this.f318885f = 0.0f;
                this.f318886g = 0.0f;
                this.f318891o = 0.8f;
                this.f318892p = 1.1f;
                setInterpolator(new LinearInterpolator());
            }
            int i6 = this.f318893q;
            if (!(i6 == 0 || i6 == 1)) {
                ChattingAnimFrame.this.addOnLayoutChangeListener(this.f318897u);
            }
            mo153621a();
        }

        public C106667e(int i, int i2, boolean z) {
            this.f318893q = i;
            this.f318894r = i2;
            this.f318895s = z;
        }
    }
}
