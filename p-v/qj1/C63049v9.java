package qj1;

import af0.C16458b;
import af0.C16463e;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bf0.C16794b;
import bl3.C39818r;
import cl1.C0668l;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderExceptionDetectStruct;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58739j4;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j60.C60777a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import ky3.C88334c;
import l60.C99344b;
import o40.C61926c;
import ok1.C62041a;
import ok1.C62042e;
import org.json.JSONObject;
import p196ln.C76705f;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62344b0;
import pl1.C62345f;
import r60.C101350i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import t60.C64207e;
import te3.C51601uv;
import te3.C64689rq2;
import up1.C27696y;
import x60.C102564a;
import y50.C66524m;

/* renamed from: qj1.v9 */
public final class C63049v9 extends C62660c {

    /* renamed from: A */
    public final int f178915A;

    /* renamed from: B */
    public final int f178916B;

    /* renamed from: C */
    public final int f178917C;

    /* renamed from: D */
    public volatile boolean f178918D;

    /* renamed from: E */
    public volatile boolean f178919E;

    /* renamed from: F */
    public final long f178920F;

    /* renamed from: G */
    public final int f178921G;

    /* renamed from: H */
    public final int f178922H;

    /* renamed from: I */
    public final int f178923I;

    /* renamed from: J */
    public final long f178924J;

    /* renamed from: K */
    public final ArrayList<String> f178925K;

    /* renamed from: L */
    public volatile long f178926L;

    /* renamed from: M */
    public final int[] f178927M;

    /* renamed from: N */
    public final int f178928N;

    /* renamed from: P */
    public int f178929P;

    /* renamed from: Q */
    public volatile boolean f178930Q;

    /* renamed from: R */
    public volatile boolean f178931R;

    /* renamed from: S */
    public MTimerHandler.CallBack f178932S;

    /* renamed from: T */
    public final C13601g f178933T;

    /* renamed from: U */
    public MMHandler f178934U;

    /* renamed from: p */
    public final C58124b f178935p;

    /* renamed from: q */
    public final String f178936q = "Finder.FinderLiveLikeConfettiPlugin";

    /* renamed from: r */
    public float f178937r = ((float) C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: s */
    public final C13601g f178938s;

    /* renamed from: t */
    public final C13601g f178939t;

    /* renamed from: u */
    public C62041a f178940u;

    /* renamed from: v */
    public final ArrayList<Bitmap> f178941v;

    /* renamed from: w */
    public ArrayList<Bitmap> f178942w;

    /* renamed from: x */
    public ArrayList<Bitmap> f178943x;

    /* renamed from: y */
    public ArrayList<Integer> f178944y;

    /* renamed from: z */
    public int f178945z;

    /* renamed from: qj1.v9$a */
    public static final class C63050a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63049v9 f178946d;

        public C63050a(C63049v9 v9Var) {
            this.f178946d = v9Var;
        }

        public final void run() {
            this.f178946d.mo87988c1();
        }
    }

    /* renamed from: qj1.v9$b */
    public static final class C63051b implements Interpolator {

        /* renamed from: a */
        public final float f178947a;

        /* renamed from: b */
        public final float f178948b;

        public C63051b(PointF pointF) {
            C87412m.m108594g(pointF, "divide");
            this.f178947a = pointF.x;
            this.f178948b = pointF.y;
        }

        public float getInterpolation(float f) {
            float f2 = this.f178947a;
            if (f < f2) {
                return (f / f2) * this.f178948b;
            }
            float f3 = this.f178948b;
            float f4 = (float) 1;
            return f3 + (((f - f2) / (f4 - f2)) * (f4 - f3));
        }
    }

    /* renamed from: qj1.v9$c */
    public static final class C63052c implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C63049v9 f178949d;

        public C63052c(C63049v9 v9Var) {
            this.f178949d = v9Var;
        }

        public final boolean onTimerExpired() {
            C63049v9 v9Var = this.f178949d;
            int[] iArr = v9Var.f178927M;
            if (!(iArr[0] == 0 || iArr[1] == 0)) {
                if (v9Var.f178926L > 0) {
                    C63049v9 v9Var2 = this.f178949d;
                    v9Var2.f178926L--;
                    if (!this.f178949d.f178918D) {
                        C63049v9 v9Var3 = this.f178949d;
                        int[] iArr2 = v9Var3.f178927M;
                        v9Var3.mo87986a1(iArr2[0], iArr2[1], true);
                    }
                    C63049v9 v9Var4 = this.f178949d;
                    int i = v9Var4.f178929P + 1;
                    v9Var4.f178929P = i;
                    if (i % v9Var4.f178928N == 0) {
                        int[] iArr3 = v9Var4.f178927M;
                        v9Var4.mo87985Z0(iArr3[0], iArr3[1]);
                        C63049v9 v9Var5 = this.f178949d;
                        v9Var5.f178929P = 0;
                        v9Var5.f178925K.clear();
                    }
                } else {
                    this.f178949d.f178919E = false;
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: qj1.v9$d */
    public static final class C63053d extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178950d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63053d(ViewGroup viewGroup) {
            super(0);
            this.f178950d = viewGroup;
        }

        public Object invoke() {
            return (FrameLayout) this.f178950d.findViewById(C0966R.C0970id.fuv);
        }
    }

    /* renamed from: qj1.v9$e */
    public static final class C63054e implements C16458b {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f178951a;

        /* renamed from: b */
        public final /* synthetic */ boolean f178952b;

        public C63054e(Bitmap bitmap, boolean z) {
            this.f178951a = bitmap;
            this.f178952b = z;
        }

        /* renamed from: a */
        public final C16794b mo14934a(Random random) {
            return new C60777a(this.f178951a, this.f178952b ? 0.5f : 1.0f);
        }
    }

    /* renamed from: qj1.v9$f */
    public static final class C63055f implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C63049v9 f178953d;

        public C63055f(C63049v9 v9Var) {
            this.f178953d = v9Var;
        }

        public final boolean handleMessage(Message message) {
            int i;
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            int i2 = message.what;
            C63049v9 v9Var = this.f178953d;
            if (i2 == v9Var.f178915A) {
                v9Var.f178918D = false;
            } else if (i2 == v9Var.f178916B) {
                if (!v9Var.f178919E) {
                    v9Var.f178919E = true;
                    ((MTimerHandler) ((C36570n) v9Var.f178933T).getValue()).stopTimer();
                    if (!v9Var.f178930Q) {
                        ((MTimerHandler) ((C36570n) v9Var.f178933T).getValue()).startTimer(v9Var.f178920F);
                    }
                }
                C63049v9 v9Var2 = this.f178953d;
                int[] iArr = v9Var2.f178927M;
                if (iArr[0] <= 0 || (i = iArr[1]) <= 0 || ((float) i) >= v9Var2.f178937r) {
                    v9Var2.mo87988c1();
                }
                Object obj = message.obj;
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Long");
                this.f178953d.f178926L += ((Long) obj).longValue();
            } else if (i2 == v9Var.f178917C) {
                v9Var.f178931R = false;
            }
            return true;
        }
    }

    /* renamed from: qj1.v9$g */
    public static final class C63056g extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178954d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63056g(ViewGroup viewGroup) {
            super(0);
            this.f178954d = viewGroup;
        }

        public Object invoke() {
            return (RelativeLayout) this.f178954d.findViewById(C0966R.C0970id.fuy);
        }
    }

    /* renamed from: qj1.v9$h */
    public static final class C63057h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63049v9 f178955d;

        public C63057h(C63049v9 v9Var) {
            this.f178955d = v9Var;
        }

        public final void run() {
            this.f178955d.mo87988c1();
        }
    }

    /* renamed from: qj1.v9$i */
    public static final class C63058i<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C63049v9 f178956a;

        /* renamed from: b */
        public final /* synthetic */ int f178957b;

        public C63058i(C63049v9 v9Var, int i) {
            this.f178956a = v9Var;
            this.f178957b = i;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C63049v9 v9Var = this.f178956a;
                ArrayList<Bitmap> arrayList = v9Var.f178943x;
                int i = this.f178957b;
                synchronized (arrayList) {
                    int i2 = C66524m.C66525a.f191366a;
                    v9Var.f178943x.add(Bitmap.createScaledBitmap(bitmap, i2, i2, true));
                    v9Var.f178944y.add(Integer.valueOf(i));
                }
            }
        }
    }

    /* renamed from: qj1.v9$j */
    public static final class C63059j extends C87413o implements C32224a<MTimerHandler> {

        /* renamed from: d */
        public final /* synthetic */ C63049v9 f178958d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63059j(C63049v9 v9Var) {
            super(0);
            this.f178958d = v9Var;
        }

        public Object invoke() {
            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), this.f178958d.f178932S, true);
            mTimerHandler.setLogging(false);
            return mTimerHandler;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0041, code lost:
        r4 = r5.f174416a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C63049v9(android.view.ViewGroup r3, d60.C58124b r4, ll1.C61304a r5) {
        /*
            r2 = this;
            java.lang.String r0 = "root"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "statusMonitor"
            gy3.C87412m.m108594g(r4, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            r2.f178935p = r4
            java.lang.String r4 = "Finder.FinderLiveLikeConfettiPlugin"
            r2.f178936q = r4
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r4 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r4)
            int r4 = r4.y
            float r4 = (float) r4
            r2.f178937r = r4
            qj1.v9$d r4 = new qj1.v9$d
            r4.<init>(r3)
            rx3.g r4 = rx3.C36568h.m40985a(r4)
            r2.f178938s = r4
            qj1.v9$g r4 = new qj1.v9$g
            r4.<init>(r3)
            rx3.g r4 = rx3.C36568h.m40985a(r4)
            r2.f178939t = r4
            ok1.a r4 = new ok1.a
            r4.<init>()
            r2.f178940u = r4
            if (r5 == 0) goto L_0x0045
            java.util.ArrayList<android.graphics.Bitmap> r4 = r5.f174416a
            if (r4 != 0) goto L_0x004a
        L_0x0045:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x004a:
            r2.f178941v = r4
            if (r5 == 0) goto L_0x0052
            java.util.ArrayList<android.graphics.Bitmap> r4 = r5.f174417b
            if (r4 != 0) goto L_0x0057
        L_0x0052:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0057:
            r2.f178942w = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.f178943x = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.f178944y = r4
            r4 = 100
            r2.f178945z = r4
            r4 = 1
            r2.f178915A = r4
            r4 = 2
            r2.f178916B = r4
            r5 = 4
            r2.f178917C = r5
            r0 = 200(0xc8, double:9.9E-322)
            r2.f178920F = r0
            android.content.Context r5 = r3.getContext()
            r0 = 40
            int r5 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r5, r0)
            r2.f178921G = r5
            android.content.Context r5 = r3.getContext()
            int r5 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r5, r0)
            r2.f178922H = r5
            android.content.Context r5 = r3.getContext()
            android.graphics.Point r5 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r5)
            int r5 = r5.y
            int r5 = r5 / r4
            android.content.Context r0 = r3.getContext()
            r1 = 24
            int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r1)
            int r5 = r5 - r0
            r2.f178923I = r5
            android.content.Context r5 = r3.getContext()
            r0 = 60
            com.tencent.p014mm.p136ui.C74942w4.m89784a(r5, r0)
            r0 = 2500(0x9c4, double:1.235E-320)
            r2.f178924J = r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.f178925K = r5
            int[] r4 = new int[r4]
            r4 = {0, 0} // fill-array
            r2.f178927M = r4
            r4 = 8
            r2.f178928N = r4
            qj1.v9$c r4 = new qj1.v9$c
            r4.<init>(r2)
            r2.f178932S = r4
            qj1.v9$j r4 = new qj1.v9$j
            r4.<init>(r2)
            rx3.g r4 = rx3.C36568h.m40985a(r4)
            r2.f178933T = r4
            boolean r4 = com.tencent.p014mm.plugin.finder.live.FinderLivePresenter.f159177j
            if (r4 != 0) goto L_0x00e3
            qj1.v9$a r4 = new qj1.v9$a
            r4.<init>(r2)
            r3.post(r4)
        L_0x00e3:
            com.tencent.mm.sdk.platformtools.MMHandler r3 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            qj1.v9$f r5 = new qj1.v9$f
            r5.<init>(r2)
            r3.<init>((android.os.Looper) r4, (com.tencent.p014mm.sdk.platformtools.MMHandler.Callback) r5)
            r2.f178934U = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63049v9.<init>(android.view.ViewGroup, d60.b, ll1.a):void");
    }

    /* renamed from: I0 */
    public void mo12076I0(boolean z) {
        if (!z) {
            this.f166287d.post(new C63057h(this));
        }
    }

    /* renamed from: Z0 */
    public final void mo87985Z0(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        String str = this.f178936q;
        Log.m105926v(str, "checkEmitHighLightCheer waitingHlCheerList.size:" + this.f178925K.size());
        boolean z = true;
        if (!this.f178925K.isEmpty()) {
            String remove = this.f178925K.remove(0);
            C87412m.m108593f(remove, "waitingHlCheerList.removeAt(0)");
            String str2 = remove;
            if (str2.length() <= 0) {
                z = false;
            }
            if (!z) {
                return;
            }
            if (Util.isEqual(str2, C75592q0.m90789s())) {
                float f = (float) i3;
                PointF pointF = new PointF(f, (float) i4);
                PointF pointF2 = new PointF(f, (float) this.f178923I);
                ImageView imageView = new ImageView(this.f166287d.getContext());
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(imageView, str2);
                int i5 = this.f178921G;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i5, i5);
                marginLayoutParams.setMarginStart(i3);
                marginLayoutParams.topMargin = i4;
                imageView.setLayoutParams(marginLayoutParams);
                mo87987b1().addView(imageView);
                imageView.setAlpha(0.0f);
                imageView.post(new C63160z9(imageView, this, pointF, pointF2));
                return;
            }
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            float f2 = (float) i3;
            float f3 = (float) i4;
            PointF pointF3 = new PointF(f2, f3);
            PointF pointF4 = new PointF(f2, (float) this.f178923I);
            PointF pointF5 = new PointF(f2, f3 - ((f3 - ((float) this.f178923I)) * 0.3f));
            PointF pointF6 = new PointF((float) (i3 - mo87989d1(this.f178922H)), (float) this.f178923I);
            float f4 = pointF5.x;
            float f5 = pointF5.y - pointF6.y;
            if (f5 < 1.0f) {
                f5 = 1.0f;
            }
            int d1 = mo87989d1((int) (f5 / ((float) 2)));
            float f6 = pointF6.y;
            float f7 = f6 + ((pointF5.y - f6) * 0.25f) + ((float) d1);
            float f8 = (float) (C75044y4.m89990b(this.f166287d.getContext()).x - this.f178921G);
            if (f4 > f8) {
                f4 = f8;
            }
            PointF pointF7 = new PointF(f4, f7);
            C39818r rVar = C39818r.f106831a;
            C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85956b(new C62345f(str2, (C27696y) null, 2, (C8480h) null), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            C63128y9 y9Var = new C63128y9(this, str2, i, i2, pointF3, pointF4, pointF5, pointF7, pointF6);
            b.getClass();
            b.f291320d = y9Var;
            b.mo85951a();
        }
    }

    /* renamed from: a1 */
    public final void mo87986a1(int i, int i2, boolean z) {
        Bitmap bitmap;
        String str = this.f178936q;
        Log.m105918d(str, "emitLikeConfetti containerMiddleX=" + i + " containerMiddleY=" + i2);
        C16463e eVar = new C16463e(i, i2);
        int i3 = 0;
        int i4 = 100;
        if (this.f178931R) {
            bitmap = mo87989d1(100) < 25 ? this.f178942w.get(0) : this.f178942w.get(1);
        } else {
            ArrayList<Bitmap> arrayList = this.f178941v;
            bitmap = arrayList.get(mo87989d1(arrayList.size()));
        }
        C87412m.m108593f(bitmap, "if(isInApplaudMode){\n   …iBitmaps.size)]\n        }");
        if (this.f178943x.size() > 0 && this.f178945z > 0) {
            synchronized (this.f178943x) {
                Iterator<Integer> it = this.f178944y.iterator();
                if (it.hasNext()) {
                    Integer next = it.next();
                    while (it.hasNext()) {
                        next = Integer.valueOf(next.intValue() + it.next().intValue());
                    }
                    int intValue = next.intValue();
                    if (intValue >= 100) {
                        i4 = intValue;
                    }
                    C8478d0 d0Var = new C8478d0();
                    int d1 = mo87989d1(i4);
                    d0Var.f27483d = d1;
                    if (d1 <= intValue) {
                        Iterator<Integer> it4 = this.f178944y.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                C13598b0 b0Var = C13598b0.f38549a;
                                break;
                            }
                            Integer next2 = it4.next();
                            int i5 = i3 + 1;
                            if (i3 >= 0) {
                                int intValue2 = next2.intValue();
                                int i6 = d0Var.f27483d;
                                if (i6 <= intValue2) {
                                    Bitmap bitmap2 = (Bitmap) C110818d0.m150917O(this.f178943x, i3);
                                    if (bitmap2 != null) {
                                        bitmap = bitmap2;
                                    }
                                } else {
                                    d0Var.f27483d = i6 - intValue2;
                                    i3 = i5;
                                }
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    }
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
        }
        C63054e eVar2 = new C63054e(bitmap, z);
        C62041a aVar = this.f178940u;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        FrameLayout frameLayout = (FrameLayout) ((C36570n) this.f178938s).getValue();
        C87412m.m108593f(frameLayout, "confettiRoot");
        aVar.mo86987b(context, eVar2, eVar, frameLayout).mo14936b();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final RelativeLayout mo87987b1() {
        return (RelativeLayout) ((C36570n) this.f178939t).getValue();
    }

    /* renamed from: c1 */
    public final void mo87988c1() {
        int i;
        int i2;
        Class cls = C54991o.class;
        try {
            int[] iArr = {0, 0};
            ViewParent parent = this.f166287d.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            View findViewById = ((View) parent).findViewById(C0966R.C0970id.ks4);
            if (findViewById == null || ((C54991o) mo87696x0(cls)).f154190D) {
                ViewParent parent2 = this.f166287d.getParent();
                C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.View");
                findViewById = ((View) parent2).findViewById(C0966R.C0970id.db4);
            }
            if (findViewById != null) {
                if (!(findViewById.getWidth() > 0)) {
                    findViewById = null;
                }
                if (findViewById != null) {
                    findViewById.getLocationOnScreen(iArr);
                    int width = (iArr[0] + ((int) ((((float) findViewById.getWidth()) * findViewById.getScaleX()) / ((float) 2)))) - (C66524m.C66525a.f191366a / 2);
                    if (!C62042e.f176370a.mo87027N0()) {
                        if (!((C54991o) mo87696x0(cls)).f154190D) {
                            i2 = iArr[1];
                            i = C74942w4.m89784a(this.f166287d.getContext(), 40);
                            int i3 = i2 - i;
                            int[] iArr2 = this.f178927M;
                            iArr2[0] = width;
                            iArr2[1] = i3;
                        }
                    }
                    i2 = iArr[1];
                    i = C74942w4.m89784a(this.f166287d.getContext(), 64);
                    int i35 = i2 - i;
                    int[] iArr22 = this.f178927M;
                    iArr22[0] = width;
                    iArr22[1] = i35;
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f178936q, e, "FinderLiveLikeConfettiPlugin LIKE_FROM_OTHER", new Object[0]);
            FinderExceptionDetectStruct finderExceptionDetectStruct = new FinderExceptionDetectStruct();
            finderExceptionDetectStruct.f155198d = finderExceptionDetectStruct.mo86045b("InnerVersion", "2", true);
            finderExceptionDetectStruct.f155199e = 10004;
            finderExceptionDetectStruct.mo86054n();
        }
    }

    /* renamed from: d1 */
    public final int mo87989d1(int i) {
        if (i > 0) {
            return C88334c.f255322d.mo122723h(0, i);
        }
        String str = this.f178936q;
        Log.m105924i(str, "[nextInt] param:" + i + " is not positive,stack:");
        Log.printInfoStack(this.f178936q, "nextInt", new Object[0]);
        return 0;
    }

    /* renamed from: e1 */
    public final void mo87990e1() {
        if (this.f178941v.size() == 0) {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpv);
            int i = C66524m.C66525a.f191366a;
            int i2 = C66524m.C66525a.f191366a;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i2, i2, true);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpw), i2, i2, true);
            Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpx), i2, i2, true);
            Bitmap createScaledBitmap4 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpy), i2, i2, true);
            Bitmap createScaledBitmap5 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpz), i2, i2, true);
            Bitmap createScaledBitmap6 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.f357237bq0), i2, i2, true);
            this.f178941v.add(createScaledBitmap);
            this.f178941v.add(createScaledBitmap2);
            this.f178941v.add(createScaledBitmap3);
            this.f178941v.add(createScaledBitmap4);
            this.f178941v.add(createScaledBitmap5);
            this.f178941v.add(createScaledBitmap6);
        }
        if (this.f178942w.size() == 0) {
            Bitmap decodeResource2 = BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpz);
            int i3 = C66524m.C66525a.f191366a;
            int i4 = C66524m.C66525a.f191366a;
            Bitmap createScaledBitmap7 = Bitmap.createScaledBitmap(decodeResource2, i4, i4, true);
            Bitmap createScaledBitmap8 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.f357238bq1), i4, i4, true);
            this.f178942w.add(createScaledBitmap7);
            this.f178942w.add(createScaledBitmap8);
        }
    }

    /* renamed from: f1 */
    public final void mo87991f1(List<? extends C51601uv> list) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(list, "cheerIconInfo");
        this.f178943x = new ArrayList<>();
        this.f178944y = new ArrayList<>();
        this.f178945z = 0;
        LinkedList<C51601uv> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        for (C51601uv uvVar : linkedList) {
            int i = this.f178945z;
            int i2 = uvVar.f143153e;
            this.f178945z = i + i2;
            String str = uvVar.f143152d;
            C64689rq2 rq22 = new C64689rq2();
            rq22.f185275p = MD5Util.getMD5String(str);
            rq22.f185266d = str;
            rq22.f185267e = str;
            C58739j4.f168176a.getClass();
            String mD5String = str != null ? MD5Util.getMD5String(str) : null;
            if (mD5String == null) {
                mD5String = "";
            }
            rq22.f185285x0 = mD5String;
            rq22.f185287y0 = mD5String;
            C62344b0 b0Var = new C62344b0(rq22, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null);
            C39818r rVar = C39818r.f106831a;
            C99344b<C100810g0, Bitmap> a = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85955a(b0Var);
            a.mo138758f(((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
            a.f291320d = new C63058i(this, i2);
            a.mo85953c();
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        C32444a aVar = C32444a.f86121a;
        if (((Boolean) C32444a.f86051E2.mo60266n()).booleanValue()) {
            i = 8;
        }
        super.mo10792g(i);
    }

    /* renamed from: g1 */
    public final void mo87992g1() {
        Class cls = C54991o.class;
        if (!((C54991o) mo87696x0(cls)).f154278X1.f1585a) {
            return;
        }
        if (((C54991o) mo87696x0(cls)).f154278X1.f1588d == 0) {
            this.f178943x.clear();
            this.f178944y.clear();
            this.f178945z = 0;
            return;
        }
        mo87991f1(((C54991o) mo87696x0(cls)).f154278X1.f1586b);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        this.f178930Q = false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C0668l) mo87696x0(C0668l.class)).mo632i3();
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        String str;
        C54067f0.C54076o0 o0Var = C54067f0.C54076o0.Like;
        Class cls = C54116w.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal != 8) {
            int i = 100;
            if (ordinal == 32) {
                int i2 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X") : 100;
                if (bundle != null) {
                    i = bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y");
                }
                mo87986a1(i2, i, false);
                this.f178918D = true;
                if (this.f178931R) {
                    C54116w wVar = (C54116w) C86312j.m106911c(cls);
                    wVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trigger", 1);
                    C54116w.Ex0(wVar, o0Var, (String) null, 0, jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, 244, (Object) null);
                    wVar.f151957v++;
                } else {
                    C54116w wVar2 = (C54116w) C86312j.m106911c(cls);
                    wVar2.getClass();
                    C54116w.Ex0(wVar2, o0Var, "1", 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                    wVar2.f151957v++;
                }
                this.f178934U.removeMessages(this.f178915A);
                this.f178934U.sendEmptyMessageDelayed(this.f178915A, 1000);
            } else if (ordinal != 118) {
                if (ordinal == 143) {
                    this.f178931R = true;
                    this.f178934U.removeMessages(this.f178917C);
                    this.f178934U.sendEmptyMessageDelayed(this.f178917C, 10000);
                } else if (ordinal == 146) {
                    if (bundle == null || (str = bundle.getString("PARAM_FINDER_LIVE_HEAD_URL")) == null) {
                        str = "";
                    }
                    int i3 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X") : 100;
                    if (bundle != null) {
                        i = bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y");
                    }
                    this.f178925K.add(0, str);
                    mo87985Z0(i3, i);
                } else if (ordinal == 181) {
                    if (!(bundle != null && !bundle.getBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", true))) {
                        ((C54991o) mo87696x0(cls2)).f154182B = true;
                        mo10792g(0);
                        return;
                    }
                    mo10792g(8);
                }
            } else if (!((C54991o) mo87696x0(cls2)).f154178A || C61926c.m72696u(((C54991o) mo87696x0(cls2)).f154354q, 512)) {
                mo10792g(8);
            } else {
                mo10792g(0);
                long j = ((C54991o) mo87684A0().mo71262a(cls2)).f154271W;
                if (j > 0 && !this.f178918D) {
                    this.f178934U.sendMessageDelayed(this.f178934U.obtainMessage(this.f178916B, Long.valueOf(j)), 300);
                }
            }
        } else {
            this.f178934U.removeMessages(this.f178916B);
            this.f178934U.removeMessages(this.f178915A);
            ((MTimerHandler) ((C36570n) this.f178933T).getValue()).stopTimer();
            this.f178932S = null;
            this.f178926L = 0;
            this.f178919E = false;
            Log.m105924i(this.f178936q, "CLOSE_LIVE " + this + " ,postLikeWork:" + this.f178919E);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f178943x.clear();
        this.f178944y.clear();
        this.f178945z = 0;
        this.f178930Q = true;
        ((MTimerHandler) ((C36570n) this.f178933T).getValue()).stopTimer();
        this.f178932S = null;
        this.f178926L = 0;
        this.f178919E = false;
        String str = this.f178936q;
        Log.m105924i(str, "unMount " + this + " ,postLikeWork:" + this.f178919E);
        this.f178934U.removeMessages(this.f178916B);
        this.f178934U.removeMessages(this.f178915A);
    }
}
