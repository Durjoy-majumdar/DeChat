package qj1;

import al1.C54130j;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cj1.C0639y1;
import cl1.C0653a0;
import cl1.C39975j;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d60.C58124b;
import dk1.C58312g;
import dl1.C58321a;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gi1.C59463a;
import gi1.C59464c;
import gi1.C59465f;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import k20.C60958c;
import k20.C9556a;
import kl1.C33936c;
import nk1.C61788m;
import o40.C61926c;
import ok1.C62042e;
import org.libpag.PAGView;
import pi1.C62311l;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C51628v11;
import te3.C51769w11;
import y04.C112354s;
import zp3.C79406f;

/* renamed from: qj1.u7 */
public final class C63006u7 extends C62660c implements C61788m.C61789a {

    /* renamed from: N */
    public static final int f178772N;

    /* renamed from: P */
    public static final float f178773P = MMApplicationContext.getResources().getDimension(C0966R.dimen.f3736cp);

    /* renamed from: Q */
    public static final float f178774Q = MMApplicationContext.getResources().getDimension(C0966R.dimen.f3753d4);

    /* renamed from: R */
    public static final float f178775R = MMApplicationContext.getResources().getDimension(C0966R.dimen.f3753d4);

    /* renamed from: S */
    public static final int f178776S = MMApplicationContext.getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd);

    /* renamed from: T */
    public static final int f178777T = C79406f.m96347a(MMApplicationContext.getContext(), 3.0f);

    /* renamed from: U */
    public static final int f178778U = ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f3730cj));

    /* renamed from: V */
    public static final boolean f178779V = (C32444a.f86040C.mo60266n().intValue() == 0 && FinderLiveService.f159376d.mo77626b() != null);

    /* renamed from: A */
    public final Map<ViewGroup, C63008c> f178780A;

    /* renamed from: B */
    public final Map<ViewGroup, ObjectAnimator> f178781B;

    /* renamed from: C */
    public final Map<ViewGroup, ObjectAnimator> f178782C;

    /* renamed from: D */
    public final Map<String, C63014e> f178783D;

    /* renamed from: E */
    public final LinkedList<String> f178784E;

    /* renamed from: F */
    public final ConcurrentHashMap<String, ViewGroup> f178785F;

    /* renamed from: G */
    public final ConcurrentHashMap<ViewGroup, C62311l> f178786G;

    /* renamed from: H */
    public final MTimerHandler f178787H;

    /* renamed from: I */
    public final MMHandler f178788I;

    /* renamed from: J */
    public volatile boolean f178789J;

    /* renamed from: K */
    public C58321a f178790K;

    /* renamed from: L */
    public int f178791L;

    /* renamed from: M */
    public int f178792M;

    /* renamed from: p */
    public final C58124b f178793p;

    /* renamed from: q */
    public final C61788m f178794q;

    /* renamed from: r */
    public final ViewGroup f178795r;

    /* renamed from: s */
    public final boolean f178796s;

    /* renamed from: t */
    public final int f178797t;

    /* renamed from: u */
    public final int f178798u;

    /* renamed from: v */
    public final RelativeLayout f178799v;

    /* renamed from: w */
    public final RelativeLayout f178800w;

    /* renamed from: x */
    public final RelativeLayout f178801x;

    /* renamed from: y */
    public final RelativeLayout f178802y;

    /* renamed from: z */
    public final int f178803z;

    /* renamed from: qj1.u7$b */
    public static final class C35914b extends FloatEvaluator {

        /* renamed from: a */
        public C32227p<? super Float, ? super Boolean, C13598b0> f95807a;

        /* renamed from: b */
        public final float f95808b;

        public C35914b(int i, int i2, C32227p<? super Float, ? super Boolean, C13598b0> pVar) {
            this.f95807a = pVar;
            this.f95808b = (((float) i) * 1.0f) / ((float) (i + i2));
        }

        public Float evaluate(float f, Number number, Number number2) {
            float f2;
            if (f < this.f95808b) {
                C32227p<? super Float, ? super Boolean, C13598b0> pVar = this.f95807a;
                if (pVar != null) {
                    pVar.invoke(Float.valueOf(f), Boolean.TRUE);
                }
                if (number == null || number2 == null) {
                    return Float.valueOf(0.0f);
                }
                f2 = number.floatValue() + (((number2.floatValue() - number.floatValue()) * f) / this.f95808b);
            } else {
                C32227p<? super Float, ? super Boolean, C13598b0> pVar2 = this.f95807a;
                if (pVar2 != null) {
                    pVar2.invoke(Float.valueOf(f), Boolean.FALSE);
                }
                Float f3 = number2 instanceof Float ? (Float) number2 : null;
                f2 = f3 != null ? f3.floatValue() : 1.0f;
            }
            return Float.valueOf(f2);
        }
    }

    /* renamed from: qj1.u7$a */
    public static final class C63007a implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C63006u7 f178804d;

        public C63007a(C63006u7 u7Var) {
            this.f178804d = u7Var;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            Object obj = message.obj;
            Boolean bool = null;
            ViewGroup viewGroup = obj instanceof ViewGroup ? (ViewGroup) obj : null;
            ObjectAnimator objectAnimator = (ObjectAnimator) ((ConcurrentHashMap) this.f178804d.f178782C).get(viewGroup);
            StringBuilder sb = new StringBuilder();
            sb.append("preciousGiftBulletOutHandler: container:");
            sb.append(viewGroup);
            sb.append(", animator.isRunning:");
            if (objectAnimator != null) {
                bool = Boolean.valueOf(objectAnimator.isRunning());
            }
            sb.append(bool);
            Log.m105924i("Finder.FinderLiveGiftQueuePlugin", sb.toString());
            if (objectAnimator == null || objectAnimator.isRunning()) {
                return true;
            }
            objectAnimator.start();
            return true;
        }
    }

    /* renamed from: qj1.u7$c */
    public final class C63008c {

        /* renamed from: A */
        public final /* synthetic */ C63006u7 f178805A;

        /* renamed from: a */
        public final int f178806a;

        /* renamed from: b */
        public final boolean f178807b;

        /* renamed from: c */
        public AtomicBoolean f178808c;

        /* renamed from: d */
        public volatile boolean f178809d;

        /* renamed from: e */
        public AtomicBoolean f178810e;

        /* renamed from: f */
        public volatile boolean f178811f;

        /* renamed from: g */
        public volatile String f178812g;

        /* renamed from: h */
        public volatile int f178813h;

        /* renamed from: i */
        public boolean f178814i;

        /* renamed from: j */
        public ConcurrentLinkedDeque<Integer> f178815j;

        /* renamed from: k */
        public volatile int f178816k;

        /* renamed from: l */
        public final C63013d f178817l;

        /* renamed from: m */
        public final C63015f f178818m;

        /* renamed from: n */
        public boolean f178819n;

        /* renamed from: o */
        public volatile long f178820o;

        /* renamed from: p */
        public volatile long f178821p;

        /* renamed from: q */
        public volatile String f178822q;

        /* renamed from: r */
        public volatile String f178823r;

        /* renamed from: s */
        public AtomicBoolean f178824s;

        /* renamed from: t */
        public boolean f178825t;

        /* renamed from: u */
        public AnimatorSet f178826u;

        /* renamed from: v */
        public final ObjectAnimator f178827v;

        /* renamed from: w */
        public final ObjectAnimator f178828w;

        /* renamed from: x */
        public final ObjectAnimator f178829x;

        /* renamed from: y */
        public volatile boolean f178830y;

        /* renamed from: z */
        public volatile boolean f178831z;

        /* renamed from: qj1.u7$c$a */
        public static final class C63009a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63006u7 f178832d;

            /* renamed from: e */
            public final /* synthetic */ C63008c f178833e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63009a(C63006u7 u7Var, C63008c cVar) {
                super(0);
                this.f178832d = u7Var;
                this.f178833e = cVar;
            }

            public Object invoke() {
                this.f178832d.f178784E.remove(this.f178833e.f178812g);
                this.f178832d.f178784E.offerLast(this.f178833e.f178812g);
                while (this.f178832d.f178784E.size() > 1000) {
                    String pollFirst = this.f178832d.f178784E.pollFirst();
                    if (pollFirst != null) {
                        C63006u7 u7Var = this.f178832d;
                        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "comboIdBackToLiveMap remove: comboId=" + pollFirst);
                        C63014e remove = u7Var.f178783D.remove(pollFirst);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qj1.u7$c$b */
        public static final class C63010b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63008c f178834d;

            /* renamed from: e */
            public final /* synthetic */ Integer f178835e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63010b(C63008c cVar, Integer num) {
                super(0);
                this.f178834d = cVar;
                this.f178835e = num;
            }

            public Object invoke() {
                FinderLiveGiftTextView finderLiveGiftTextView = this.f178834d.f178817l.f178845h;
                if (finderLiveGiftTextView != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('x');
                    sb.append(this.f178835e);
                    finderLiveGiftTextView.setText(sb.toString());
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qj1.u7$c$c */
        public static final class C63011c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63008c f178836d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63011c(C63008c cVar) {
                super(0);
                this.f178836d = cVar;
            }

            public Object invoke() {
                this.f178836d.f178826u.cancel();
                FinderLiveGiftTextView finderLiveGiftTextView = this.f178836d.f178817l.f178845h;
                if (finderLiveGiftTextView != null) {
                    finderLiveGiftTextView.setTag(0);
                }
                PAGView pAGView = this.f178836d.f178817l.f178844g;
                if (pAGView != null) {
                    pAGView.stop();
                }
                FinderRandomAnimTextView finderRandomAnimTextView = this.f178836d.f178817l.f178846i;
                if (finderRandomAnimTextView != null) {
                    RecyclerView.LayoutManager layoutManager = finderRandomAnimTextView.getLayoutManager();
                    if (layoutManager != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        RecyclerView.LayoutManager layoutManager2 = layoutManager;
                        C117292a.m165358d(layoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/gift/widget/FinderRandomAnimTextView", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
                        layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(layoutManager2, "com/tencent/mm/plugin/finder/live/gift/widget/FinderRandomAnimTextView", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
                    }
                    finderRandomAnimTextView.f159303y1.clear();
                    finderRandomAnimTextView.f159304z1.notifyDataSetChanged();
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qj1.u7$c$d */
        public static final class C63012d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63008c f178837d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63012d(C63008c cVar) {
                super(0);
                this.f178837d = cVar;
            }

            public Object invoke() {
                this.f178837d.mo87963b(false);
                return C13598b0.f38549a;
            }
        }

        public C63008c(C63006u7 u7Var, ViewGroup viewGroup, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, C8480h hVar) {
            C63006u7 u7Var2 = u7Var;
            ViewGroup viewGroup2 = viewGroup;
            boolean z5 = (i3 & 8) != 0 ? false : z2;
            boolean z6 = (i3 & 16) != 0 ? false : z3;
            boolean z7 = (i3 & 32) != 0 ? false : z4;
            int i4 = (i3 & 64) != 0 ? 0 : i2;
            C87412m.m108594g(viewGroup2, "container");
            this.f178805A = u7Var2;
            this.f178806a = i;
            this.f178807b = z6;
            this.f178808c = new AtomicBoolean(false);
            this.f178810e = new AtomicBoolean(false);
            this.f178812g = "";
            this.f178815j = new ConcurrentLinkedDeque<>();
            C63013d dVar = new C63013d(viewGroup, z, z6, z7, i4);
            this.f178817l = dVar;
            this.f178818m = new C63015f(viewGroup2);
            this.f178819n = z5;
            this.f178822q = "";
            this.f178823r = ((C54991o) u7Var2.mo87696x0(C54991o.class)).f154345o;
            this.f178824s = new AtomicBoolean(true);
            this.f178826u = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(dVar.f178845h, "scaleX", new float[]{0.0f, 1.1f}).setDuration(125);
            C87412m.m108593f(duration, "ofFloat(viewHolder.cntTv…f, 1.1f).setDuration(125)");
            this.f178827v = duration;
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(dVar.f178845h, "scaleY", new float[]{0.0f, 1.1f}).setDuration(125);
            C87412m.m108593f(duration2, "ofFloat(viewHolder.cntTv…f, 1.1f).setDuration(125)");
            this.f178828w = duration2;
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(dVar.f178845h, "alpha", new float[]{0.0f, 1.0f}).setDuration(208);
            C87412m.m108593f(duration3, "ofFloat(viewHolder.cntTv…f, 1.0f).setDuration(208)");
            this.f178829x = duration3;
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(dVar.f178845h, "scaleX", new float[]{1.1f, 1.0f}).setDuration(83);
            C87412m.m108593f(duration4, "ofFloat(viewHolder.cntTv…1f, 1.0f).setDuration(83)");
            duration4.setStartDelay(125);
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(dVar.f178845h, "scaleY", new float[]{1.1f, 1.0f}).setDuration(83);
            C87412m.m108593f(duration5, "ofFloat(viewHolder.cntTv…1f, 1.0f).setDuration(83)");
            duration5.setStartDelay(125);
            FinderLiveGiftTextView finderLiveGiftTextView = dVar.f178845h;
            if (finderLiveGiftTextView != null) {
                finderLiveGiftTextView.setPivotX(0.0f);
            }
            FinderLiveGiftTextView finderLiveGiftTextView2 = dVar.f178845h;
            if (finderLiveGiftTextView2 != null) {
                finderLiveGiftTextView2.setPivotY((float) finderLiveGiftTextView2.getMeasuredHeight());
            }
            this.f178826u.playTogether(new Animator[]{duration, duration2, duration4, duration5, duration3});
        }

        /* renamed from: a */
        public final void mo87962a() {
            Map<String, C63014e> map = this.f178805A.f178783D;
            String str = this.f178812g;
            C63014e eVar = new C63014e();
            eVar.f178850a.getAndSet(this.f178810e.get());
            eVar.f178851b = this.f178813h;
            eVar.f178852c = C31543z5.m39453c();
            C87412m.m108594g(this.f178822q, "<set-?>");
            map.put(str, eVar);
            C61926c.m72661F("giftQueueMapClear", new C63009a(this.f178805A, this));
            Integer peekLast = this.f178815j.peekLast();
            if (peekLast != null) {
                C61926c.m72668M(new C63010b(this, peekLast));
            }
            this.f178808c.getAndSet(false);
            this.f178809d = false;
            this.f178810e.getAndSet(false);
            this.f178811f = false;
            this.f178812g = "";
            this.f178813h = 0;
            this.f178816k = 0;
            this.f178815j.clear();
            this.f178820o = 0;
            this.f178821p = 0;
            this.f178822q = "";
            C61926c.m72668M(new C63011c(this));
            mo87965d(false);
            C61926c.m72668M(new C63012d(this));
            FinderLiveGiftTextView finderLiveGiftTextView = this.f178817l.f178845h;
            if (finderLiveGiftTextView != null) {
                finderLiveGiftTextView.setTag((Object) null);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo87963b(boolean r3) {
            /*
                r2 = this;
                boolean r0 = r2.f178831z
                if (r3 == r0) goto L_0x0028
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "bulletFlying origin value:"
                r0.append(r1)
                boolean r1 = r2.f178831z
                r0.append(r1)
                java.lang.String r1 = ",value:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Finder.FinderLiveGiftQueuePlugin"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                if (r3 != 0) goto L_0x0028
                r0 = 1
                goto L_0x0029
            L_0x0028:
                r0 = 0
            L_0x0029:
                r2.f178831z = r3
                if (r0 == 0) goto L_0x0032
                java.lang.String r3 = "bulletFlying Stop"
                r2.mo87966e(r3)
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C63006u7.C63008c.mo87963b(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0109, code lost:
            if (r2 == false) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x010b, code lost:
            r11 = r11 + r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x010c, code lost:
            if (r11 >= r9) goto L_0x012c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x010e, code lost:
            r8.f178815j.offer(java.lang.Integer.valueOf(r11));
            r10 = new java.lang.StringBuilder();
            r10.append(r11);
            r10.append(',');
            r3.append(r10.toString());
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo87964c(int r9, boolean r10, nk1.C61788m.C11208b r11) {
            /*
                r8 = this;
                java.lang.String r0 = "giftShowInfo"
                gy3.C87412m.m108594g(r11, r0)
                boolean r11 = r11.f33052s
                r0 = 8
                java.lang.String r1 = "Finder.FinderLiveGiftQueuePlugin"
                r2 = 0
                if (r11 == 0) goto L_0x0042
                qj1.u7$d r9 = r8.f178817l
                int r10 = r8.f178813h
                r9.getClass()
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r3 = "showBatchCntText: "
                r11.append(r3)
                r11.append(r10)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
                com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView r11 = r9.f178845h
                if (r11 != 0) goto L_0x002f
                goto L_0x0032
            L_0x002f:
                r11.setVisibility(r0)
            L_0x0032:
                com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView r11 = r9.f178846i
                if (r11 != 0) goto L_0x0037
                goto L_0x003a
            L_0x0037:
                r11.setVisibility(r2)
            L_0x003a:
                com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView r9 = r9.f178846i
                if (r9 == 0) goto L_0x0041
                r9.mo77576y1(r10)
            L_0x0041:
                return
            L_0x0042:
                qj1.u7$d r11 = r8.f178817l
                com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView r3 = r11.f178845h
                if (r3 != 0) goto L_0x0049
                goto L_0x004c
            L_0x0049:
                r3.setVisibility(r2)
            L_0x004c:
                com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView r11 = r11.f178846i
                if (r11 != 0) goto L_0x0051
                goto L_0x0054
            L_0x0051:
                r11.setVisibility(r0)
            L_0x0054:
                qj1.u7$d r11 = r8.f178817l
                com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView r11 = r11.f178845h
                r0 = 0
                if (r11 == 0) goto L_0x0060
                java.lang.Object r11 = r11.getTag()
                goto L_0x0061
            L_0x0060:
                r11 = r0
            L_0x0061:
                boolean r3 = r11 instanceof java.lang.Integer
                if (r3 == 0) goto L_0x0068
                r0 = r11
                java.lang.Integer r0 = (java.lang.Integer) r0
            L_0x0068:
                if (r0 == 0) goto L_0x006f
                int r11 = r0.intValue()
                goto L_0x0071
            L_0x006f:
                int r11 = r8.f178816k
            L_0x0071:
                r0 = 1
                if (r11 >= r0) goto L_0x0076
                r11 = 1
                r2 = 1
            L_0x0076:
                java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r3 = r8.f178815j
                r3.clear()
                if (r9 > r11) goto L_0x00c4
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "setCntQueue: destinationCnt:"
                r10.append(r0)
                r10.append(r9)
                java.lang.String r0 = " <= startCnt:"
                r10.append(r0)
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
                qj1.u7$d r10 = r8.f178817l
                com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView r10 = r10.f178845h
                if (r10 != 0) goto L_0x00a1
                goto L_0x00b5
            L_0x00a1:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r0 = 120(0x78, float:1.68E-43)
                r11.append(r0)
                r11.append(r9)
                java.lang.String r11 = r11.toString()
                r10.setText(r11)
            L_0x00b5:
                qj1.u7$d r10 = r8.f178817l
                com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView r10 = r10.f178845h
                if (r10 != 0) goto L_0x00bc
                goto L_0x00c3
            L_0x00bc:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10.setTag(r9)
            L_0x00c3:
                return
            L_0x00c4:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "localSend:"
                r4.append(r5)
                r4.append(r10)
                java.lang.String r5 = ",startCnt:"
                r4.append(r5)
                r4.append(r11)
                java.lang.String r5 = ",lastCountOnBackToLive:"
                r4.append(r5)
                int r5 = r8.f178816k
                r4.append(r5)
                java.lang.String r5 = ",firstGift:"
                r4.append(r5)
                r4.append(r2)
                r5 = 59
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                if (r10 != 0) goto L_0x012c
                double r4 = (double) r9
                double r6 = (double) r11
                double r4 = r4 - r6
                r10 = 5
                double r6 = (double) r10
                double r4 = r4 / r6
                double r4 = java.lang.Math.ceil(r4)
                int r10 = (int) r4
                if (r0 >= r10) goto L_0x0109
                r0 = r10
            L_0x0109:
                if (r2 != 0) goto L_0x010c
            L_0x010b:
                int r11 = r11 + r0
            L_0x010c:
                if (r11 >= r9) goto L_0x012c
                java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r10 = r8.f178815j
                java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
                r10.offer(r2)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r11)
                r2 = 44
                r10.append(r2)
                java.lang.String r10 = r10.toString()
                r3.append(r10)
                goto L_0x010b
            L_0x012c:
                java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r10 = r8.f178815j
                java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
                r10.offer(r11)
                r3.append(r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "setCntQueue "
                r9.append(r10)
                r9.append(r3)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
                java.lang.String r9 = "setCntQueue"
                r8.mo87966e(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C63006u7.C63008c.mo87964c(int, boolean, nk1.m$b):void");
        }

        /* renamed from: d */
        public final void mo87965d(boolean z) {
            if (z != this.f178830y) {
                Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "cntTransferAniming origin value:" + this.f178830y + ",value:" + z);
            }
            this.f178830y = z;
            if (!this.f178830y) {
                mo87966e("cntTransferAnim end");
            }
        }

        /* renamed from: e */
        public final void mo87966e(String str) {
            T t;
            TextView textView;
            C87412m.m108594g(str, "prefix");
            boolean isEmpty = this.f178815j.isEmpty();
            if (isEmpty || this.f178830y || this.f178831z) {
                Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "startTransferCnt(" + str + ") cntQueueEmpty:" + isEmpty + ",cntTransferAniming:" + this.f178830y + ",bulletFlying:" + this.f178831z);
                return;
            }
            Integer pollFirst = this.f178815j.pollFirst();
            int intValue = pollFirst == null ? this.f178813h : pollFirst.intValue();
            FinderLiveGiftTextView finderLiveGiftTextView = this.f178817l.f178845h;
            CharSequence charSequence = null;
            CharSequence text = finderLiveGiftTextView != null ? finderLiveGiftTextView.getText() : null;
            StringBuilder sb = new StringBuilder();
            sb.append('x');
            sb.append(intValue);
            boolean b = C87412m.m108589b(text, sb.toString());
            Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "startTransferCnt(" + str + ") number:" + intValue + ", sameValue:" + b + ", cntQueueEmpty:" + isEmpty + ",cntTransferAniming:" + this.f178830y + ",bulletFlying:" + this.f178831z);
            FinderLiveGiftTextView finderLiveGiftTextView2 = this.f178817l.f178845h;
            if (finderLiveGiftTextView2 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append('x');
                sb4.append(intValue);
                finderLiveGiftTextView2.setText(sb4.toString());
            }
            FinderLiveGiftTextView finderLiveGiftTextView3 = this.f178817l.f178845h;
            if (finderLiveGiftTextView3 != null) {
                finderLiveGiftTextView3.setTag(Integer.valueOf(intValue));
            }
            FinderLiveGiftTextView finderLiveGiftTextView4 = this.f178817l.f178845h;
            float f = 0.0f;
            if (finderLiveGiftTextView4 != null) {
                finderLiveGiftTextView4.setPivotX(0.0f);
            }
            FinderLiveGiftTextView finderLiveGiftTextView5 = this.f178817l.f178845h;
            if (finderLiveGiftTextView5 != null) {
                if (finderLiveGiftTextView5 != null) {
                    f = (float) finderLiveGiftTextView5.getMeasuredHeight();
                }
                finderLiveGiftTextView5.setPivotY(f);
            }
            this.f178826u.start();
            C63006u7 u7Var = this.f178805A;
            int i = C63006u7.f178772N;
            u7Var.getClass();
            if (!b && this.f178817l.f178839b) {
                List<C54130j> list = ((C54963d0) u7Var.mo87696x0(C54963d0.class)).f154074q;
                C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
                synchronized (list) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (TextUtils.equals(((C54130j) t).f151999c, this.f178823r)) {
                            break;
                        }
                    }
                }
                C54130j jVar = (C54130j) t;
                boolean z = false;
                if (!(jVar != null ? C87412m.m108589b(jVar.f152016t, Boolean.TRUE) : false)) {
                    TextView textView2 = this.f178817l.f178843f;
                    if (textView2 != null) {
                        charSequence = textView2.getText();
                    }
                    boolean z2 = true;
                    if (!(charSequence == null || charSequence.length() == 0)) {
                        C63013d dVar = this.f178817l;
                        if (dVar.f178843f != null) {
                            TextView textView3 = dVar.f178842e;
                            int measuredWidth = textView3 != null ? textView3.getMeasuredWidth() : 0;
                            FinderLiveGiftTextView finderLiveGiftTextView6 = this.f178817l.f178845h;
                            int measuredWidth2 = finderLiveGiftTextView6 != null ? finderLiveGiftTextView6.getMeasuredWidth() : 0;
                            float f2 = ((float) measuredWidth) + C63006u7.f178774Q;
                            float f3 = C63006u7.f178773P;
                            int i2 = (int) (f2 + f3 + ((float) measuredWidth2) + f3);
                            C62042e.f176370a.mo86998D1("Finder.FinderLiveGiftQueuePlugin", "enoughSpaceForRelaunch comboSumCount:" + this.f178813h + ",fromUserNameWidth:" + measuredWidth + ", countWidth:" + measuredWidth2 + ",takePlaceWidth:" + i2 + ",outSpaceWidth:" + this.f178817l.f178841d);
                            C63013d dVar2 = this.f178817l;
                            int i3 = dVar2.f178841d;
                            TextView textView4 = dVar2.f178843f;
                            String string = MMApplicationContext.getResources().getString(C0966R.string.do_, new Object[]{""});
                            C87412m.m108593f(string, "getResources().getString…lut_tip_with_content, \"\")");
                            if (u7Var.mo87958t1(i3, i2, textView4, string) <= 1) {
                                z = true;
                            }
                            z2 = z;
                        }
                    }
                    if (!z2 && (textView = this.f178817l.f178843f) != null) {
                        textView.setText("");
                    }
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("index = " + this.f178806a);
            sb.append(", ");
            sb.append("giftId = " + this.f178822q);
            sb.append(", ");
            sb.append("isShowing = " + this.f178808c);
            sb.append(", ");
            sb.append("isPreciousGift = " + this.f178810e);
            sb.append(", ");
            sb.append("isAnimationEnd = " + this.f178809d);
            sb.append(", ");
            sb.append("comboId = " + this.f178812g);
            sb.append(", ");
            sb.append("comboSumCount = " + this.f178813h);
            sb.append(", ");
            sb.append("lastCountOnBackToLive = " + this.f178816k);
            sb.append(", ");
            sb.append("totalShowingTime = " + this.f178820o);
            sb.append(", ");
            sb.append("cntTransferAniming = " + this.f178830y);
            sb.append(", ");
            sb.append("bulletFlying = " + this.f178831z);
            sb.append(", ");
            sb.append("targetUserName = " + this.f178823r);
            sb.append(", ");
            sb.append("enabled = " + this.f178824s);
            sb.append("isFromBatchSend = " + this.f178814i);
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "StringBuilder()\n        …              .toString()");
            return sb4;
        }
    }

    /* renamed from: qj1.u7$d */
    public static final class C63013d {

        /* renamed from: a */
        public final ViewGroup f178838a;

        /* renamed from: b */
        public final boolean f178839b;

        /* renamed from: c */
        public final boolean f178840c;

        /* renamed from: d */
        public int f178841d;

        /* renamed from: e */
        public final TextView f178842e;

        /* renamed from: f */
        public final TextView f178843f;

        /* renamed from: g */
        public final PAGView f178844g;

        /* renamed from: h */
        public final FinderLiveGiftTextView f178845h;

        /* renamed from: i */
        public final FinderRandomAnimTextView f178846i;

        /* renamed from: j */
        public final View f178847j;

        /* renamed from: k */
        public final LinearLayout f178848k;

        /* renamed from: l */
        public final LinearLayout f178849l;

        public C63013d(ViewGroup viewGroup, boolean z, boolean z2, boolean z3, int i) {
            C87412m.m108594g(viewGroup, "container");
            this.f178838a = viewGroup;
            this.f178839b = z2;
            this.f178840c = z3;
            this.f178841d = i;
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.dm5);
            this.f178842e = textView;
            TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.dm6);
            this.f178843f = textView2;
            PAGView pAGView = (PAGView) viewGroup.findViewById(C0966R.C0970id.dm9);
            this.f178844g = pAGView;
            FinderLiveGiftTextView finderLiveGiftTextView = (FinderLiveGiftTextView) viewGroup.findViewById(C0966R.C0970id.dm4);
            this.f178845h = finderLiveGiftTextView;
            FinderRandomAnimTextView finderRandomAnimTextView = (FinderRandomAnimTextView) viewGroup.findViewById(C0966R.C0970id.nug);
            this.f178846i = finderRandomAnimTextView;
            this.f178847j = viewGroup.findViewById(C0966R.C0970id.a8r);
            this.f178848k = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.dm8);
            this.f178849l = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.dm7);
            ViewGroup.LayoutParams layoutParams = null;
            if (z3) {
                ViewGroup.LayoutParams layoutParams2 = pAGView != null ? pAGView.getLayoutParams() : null;
                if (layoutParams2 != null) {
                    layoutParams2.width = (int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3738cr);
                }
                layoutParams = pAGView != null ? pAGView.getLayoutParams() : layoutParams;
                if (layoutParams != null) {
                    layoutParams.height = (int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3738cr);
                }
                if (finderLiveGiftTextView != null) {
                    finderLiveGiftTextView.setTextSize(1, 12.0f);
                }
                if (finderRandomAnimTextView != null) {
                    finderRandomAnimTextView.setTextSize(12.0f);
                }
            } else if (z2) {
                if (textView != null) {
                    textView.setTextSize(1, 12.0f);
                }
                if (textView2 != null) {
                    textView2.setTextSize(1, 12.0f);
                }
                ViewGroup.LayoutParams layoutParams3 = pAGView != null ? pAGView.getLayoutParams() : null;
                if (layoutParams3 != null) {
                    layoutParams3.width = (int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3753d4);
                }
                ViewGroup.LayoutParams layoutParams4 = pAGView != null ? pAGView.getLayoutParams() : null;
                if (layoutParams4 != null) {
                    layoutParams4.height = (int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3753d4);
                }
                if (finderLiveGiftTextView != null) {
                    finderLiveGiftTextView.setTextSize(1, 17.0f);
                }
                if (finderRandomAnimTextView != null) {
                    finderRandomAnimTextView.setTextSize(17.0f);
                }
                ViewGroup.LayoutParams layoutParams5 = viewGroup.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = (int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3753d4);
                }
                View findViewById = viewGroup.findViewById(C0966R.C0970id.a8r);
                ViewGroup.LayoutParams layoutParams6 = findViewById != null ? findViewById.getLayoutParams() : null;
                if (layoutParams6 != null) {
                    layoutParams6.width = C63006u7.f178778U;
                }
                View findViewById2 = viewGroup.findViewById(C0966R.C0970id.a8r);
                layoutParams = findViewById2 != null ? findViewById2.getLayoutParams() : layoutParams;
                if (layoutParams != null) {
                    layoutParams.height = (int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3743cv);
                }
            } else {
                if (z) {
                    if (textView != null) {
                        textView.setTextSize(1, 15.0f);
                    }
                    if (textView2 != null) {
                        textView2.setTextSize(1, 15.0f);
                    }
                    View findViewById3 = viewGroup.findViewById(C0966R.C0970id.a8r);
                    layoutParams = findViewById3 != null ? findViewById3.getLayoutParams() : layoutParams;
                    if (layoutParams != null) {
                        layoutParams.height = (int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3743cv);
                    }
                } else {
                    if (textView != null) {
                        textView.setTextSize(1, 17.0f);
                    }
                    if (textView2 != null) {
                        textView2.setTextSize(1, 17.0f);
                    }
                    View findViewById4 = viewGroup.findViewById(C0966R.C0970id.a8r);
                    layoutParams = findViewById4 != null ? findViewById4.getLayoutParams() : layoutParams;
                    if (layoutParams != null) {
                        layoutParams.height = (int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3753d4);
                    }
                }
                if (finderLiveGiftTextView != null) {
                    finderLiveGiftTextView.setTextSize(1, 22.0f);
                }
                if (finderRandomAnimTextView != null) {
                    finderRandomAnimTextView.setTextSize(22.0f);
                }
            }
        }
    }

    /* renamed from: qj1.u7$e */
    public static final class C63014e {

        /* renamed from: a */
        public AtomicBoolean f178850a = new AtomicBoolean(false);

        /* renamed from: b */
        public volatile int f178851b;

        /* renamed from: c */
        public long f178852c;
    }

    /* renamed from: qj1.u7$f */
    public static final class C63015f {

        /* renamed from: a */
        public final View f178853a;

        /* renamed from: b */
        public final ImageView f178854b;

        /* renamed from: c */
        public final TextView f178855c;

        /* renamed from: d */
        public final View f178856d;

        public C63015f(ViewGroup viewGroup) {
            C87412m.m108594g(viewGroup, "container");
            this.f178853a = viewGroup.findViewById(C0966R.C0970id.o6x);
            this.f178854b = (ImageView) viewGroup.findViewById(C0966R.C0970id.o6v);
            this.f178855c = (TextView) viewGroup.findViewById(C0966R.C0970id.o6w);
            this.f178856d = viewGroup.findViewById(C0966R.C0970id.o56);
        }
    }

    /* renamed from: qj1.u7$g */
    public /* synthetic */ class C63016g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f178857a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[218] = 1;
            f178857a = iArr;
        }
    }

    /* renamed from: qj1.u7$h */
    public static final class C63017h extends C87413o implements C32227p<Float, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63006u7 f178858d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f178859e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63017h(C63006u7 u7Var, ViewGroup viewGroup) {
            super(2);
            this.f178858d = u7Var;
            this.f178859e = viewGroup;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).floatValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C63008c cVar = this.f178858d.f178780A.get(this.f178859e);
            if (cVar != null) {
                cVar.mo87963b(booleanValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.u7$i */
    public static final class C63018i extends C87413o implements C32227p<Float, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63006u7 f178860d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f178861e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63018i(C63006u7 u7Var, ViewGroup viewGroup) {
            super(2);
            this.f178860d = u7Var;
            this.f178861e = viewGroup;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).floatValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C63008c cVar = this.f178860d.f178780A.get(this.f178861e);
            if (cVar != null) {
                cVar.mo87963b(booleanValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.u7$j */
    public static final class C63019j extends C87413o implements C32226l<Map.Entry<? extends ViewGroup, ? extends C63008c>, Boolean> {

        /* renamed from: d */
        public static final C63019j f178862d = new C63019j();

        public C63019j() {
            super(1);
        }

        public Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C87412m.m108594g(entry, LocaleUtil.ITALIAN);
            return Boolean.valueOf(((C63008c) entry.getValue()).f178808c.get() && ((C63008c) entry.getValue()).f178810e.get());
        }
    }

    /* renamed from: qj1.u7$k */
    public static final class C63020k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178863d;

        /* renamed from: e */
        public final /* synthetic */ C63006u7 f178864e;

        /* renamed from: f */
        public final /* synthetic */ C61788m.C11208b f178865f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63020k(ViewGroup viewGroup, C63006u7 u7Var, C61788m.C11208b bVar) {
            super(0);
            this.f178863d = viewGroup;
            this.f178864e = u7Var;
            this.f178865f = bVar;
        }

        public Object invoke() {
            ViewGroup viewGroup;
            if (C63006u7.f178779V && (viewGroup = this.f178863d) != null) {
                viewGroup.setVisibility(0);
            }
            Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "launchBulletInAnimation, BulletShowingInfo=" + this.f178864e.f178780A.get(this.f178863d) + ", giftShowInfo=" + this.f178865f);
            C63006u7 u7Var = this.f178864e;
            C63006u7.m74279v1(u7Var, u7Var.f178780A.get(this.f178863d), this.f178865f, false, 4, (Object) null);
            ObjectAnimator objectAnimator = (ObjectAnimator) ((ConcurrentHashMap) this.f178864e.f178781B).get(this.f178863d);
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            C63008c cVar = this.f178864e.f178780A.get(this.f178863d);
            if (cVar != null) {
                cVar.f178821p = C31543z5.m39453c();
            }
            this.f178864e.mo87943d1((Map.Entry<? extends ViewGroup, C63008c>) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.u7$l */
    public static final class C63021l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63006u7 f178866d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63021l(C63006u7 u7Var) {
            super(0);
            this.f178866d = u7Var;
        }

        public Object invoke() {
            if (this.f178866d.f178794q.hasNext()) {
                C61926c.m72668M(new C63085w7(this.f178866d));
                this.f178866d.mo87952n1();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.u7$m */
    public static final class C63022m<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C63006u7 f178867d;

        public C63022m(C63006u7 u7Var) {
            this.f178867d = u7Var;
        }

        public void onChanged(Object obj) {
            FinderJumpInfo finderJumpInfo = (FinderJumpInfo) obj;
            if (finderJumpInfo != null) {
                C63006u7 u7Var = this.f178867d;
                synchronized (u7Var) {
                    C61926c.m72668M(new C62670c8(u7Var, finderJumpInfo));
                }
            }
        }
    }

    /* renamed from: qj1.u7$n */
    public static final class C63023n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63006u7 f178868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63023n(C63006u7 u7Var) {
            super(0);
            this.f178868d = u7Var;
        }

        public Object invoke() {
            this.f178868d.mo10792g(0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.u7$o */
    public static final class C63024o extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63006u7 f178869d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<ViewGroup> f178870e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f178871f;

        /* renamed from: g */
        public final /* synthetic */ C61788m.C11208b f178872g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63024o(C63006u7 u7Var, C8479f0<ViewGroup> f0Var, ViewGroup viewGroup, C61788m.C11208b bVar) {
            super(0);
            this.f178869d = u7Var;
            this.f178870e = f0Var;
            this.f178871f = viewGroup;
            this.f178872g = bVar;
        }

        public Object invoke() {
            AtomicBoolean atomicBoolean;
            Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "replaceBullet ui thread: target BulletShowingInfo=" + this.f178869d.f178780A.get(this.f178870e.f27484d) + ", origin BulletShowingInfo=" + this.f178869d.f178780A.get(this.f178871f) + ", giftShowInfo=" + this.f178872g);
            ObjectAnimator objectAnimator = (ObjectAnimator) ((ConcurrentHashMap) this.f178869d.f178781B).get(this.f178870e.f27484d);
            if (objectAnimator != null && objectAnimator.isRunning()) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = (ObjectAnimator) ((ConcurrentHashMap) this.f178869d.f178782C).get(this.f178870e.f27484d);
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                objectAnimator2.cancel();
            }
            this.f178869d.f178788I.removeCallbacksAndMessages(this.f178870e.f27484d);
            boolean z = false;
            this.f178869d.f178789J = false;
            if (!C87412m.m108589b(this.f178870e.f27484d, this.f178871f)) {
                C63008c cVar = this.f178869d.f178780A.get(this.f178871f);
                if (!(cVar == null || (atomicBoolean = cVar.f178808c) == null || !atomicBoolean.get())) {
                    z = true;
                }
                if (!z) {
                    ObjectAnimator objectAnimator3 = (ObjectAnimator) ((ConcurrentHashMap) this.f178869d.f178781B).get(this.f178871f);
                    if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                        objectAnimator3.cancel();
                    }
                    ObjectAnimator objectAnimator4 = (ObjectAnimator) ((ConcurrentHashMap) this.f178869d.f178782C).get(this.f178871f);
                    if (objectAnimator4 != null && !objectAnimator4.isRunning()) {
                        objectAnimator4.start();
                    }
                }
            }
            C63006u7 u7Var = this.f178869d;
            C63006u7.m74279v1(u7Var, u7Var.f178780A.get(this.f178870e.f27484d), this.f178872g, false, 4, (Object) null);
            ObjectAnimator objectAnimator5 = (ObjectAnimator) ((ConcurrentHashMap) this.f178869d.f178781B).get(this.f178870e.f27484d);
            if (objectAnimator5 != null) {
                objectAnimator5.start();
            }
            C63008c cVar2 = this.f178869d.f178780A.get(this.f178870e.f27484d);
            if (cVar2 != null) {
                cVar2.f178821p = C31543z5.m39453c();
            }
            this.f178869d.mo87943d1((Map.Entry<? extends ViewGroup, C63008c>) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.u7$p */
    public static final class C63025p implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C63006u7 f178873d;

        /* renamed from: qj1.u7$p$a */
        public static final class C63026a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63006u7 f178874d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63026a(C63006u7 u7Var) {
                super(0);
                this.f178874d = u7Var;
            }

            public Object invoke() {
                C63006u7 u7Var = this.f178874d;
                int i = C63006u7.f178772N;
                u7Var.mo87943d1((Map.Entry<? extends ViewGroup, C63008c>) null);
                return C13598b0.f38549a;
            }
        }

        public C63025p(C63006u7 u7Var) {
            this.f178873d = u7Var;
        }

        public boolean onTimerExpired() {
            C61926c.m72668M(new C63026a(this.f178873d));
            return false;
        }
    }

    /* renamed from: qj1.u7$q */
    public static final class C63027q extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63006u7 f178875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63027q(C63006u7 u7Var) {
            super(0);
            this.f178875d = u7Var;
        }

        public Object invoke() {
            for (Map.Entry value : ((ConcurrentHashMap) this.f178875d.f178781B).entrySet()) {
                ((ObjectAnimator) value.getValue()).cancel();
            }
            for (Map.Entry value2 : ((ConcurrentHashMap) this.f178875d.f178782C).entrySet()) {
                ((ObjectAnimator) value2.getValue()).cancel();
            }
            return C13598b0.f38549a;
        }
    }

    static {
        C32444a aVar = C32444a.f86121a;
        int intValue = C32444a.f86138e0.mo60266n().intValue() * 1000;
        f178772N = intValue;
        int i = 500 / (intValue + 500);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C63006u7(android.view.ViewGroup r24, d60.C58124b r25, nk1.C61788m r26, android.view.ViewGroup r27, boolean r28) {
        /*
            r23 = this;
            r11 = r23
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            java.lang.String r4 = "root"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "statusMonitor"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "iGiftQueue"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "outerSpaceParent"
            gy3.C87412m.m108594g(r3, r4)
            r4 = 0
            r11.<init>(r0, r1, r4)
            r11.f178793p = r1
            r11.f178794q = r2
            r11.f178795r = r3
            r12 = r28
            r11.f178796s = r12
            gg1.a r1 = gg1.C32444a.f86121a
            pe1.c<java.lang.Integer> r1 = gg1.C32444a.f86142f0
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r11.f178797t = r1
            pe1.c<java.lang.Integer> r1 = gg1.C32444a.f86146g0
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r11.f178798u = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r11.f178784E = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r11.f178785F = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r11.f178786G = r1
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            qj1.u7$p r2 = new qj1.u7$p
            r2.<init>(r11)
            java.lang.String r3 = "FinderLiveGiftQueuePlugin::Timer"
            r13 = 0
            r1.<init>((java.lang.String) r3, (com.tencent.p014mm.sdk.platformtools.MTimerHandler.CallBack) r2, (boolean) r13)
            r11.f178787H = r1
            r1 = 2131303639(0x7f091cd7, float:1.8225398E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "root.findViewById(R.id.f…ve_gift_queue_bullet_one)"
            gy3.C87412m.m108593f(r1, r2)
            r14 = r1
            android.widget.RelativeLayout r14 = (android.widget.RelativeLayout) r14
            r11.f178799v = r14
            r1 = 2131303641(0x7f091cd9, float:1.8225402E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "root.findViewById(R.id.f…ve_gift_queue_bullet_two)"
            gy3.C87412m.m108593f(r1, r2)
            r15 = r1
            android.widget.RelativeLayout r15 = (android.widget.RelativeLayout) r15
            r11.f178800w = r15
            r1 = 2131303640(0x7f091cd8, float:1.82254E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "root.findViewById(R.id.f…_gift_queue_bullet_three)"
            gy3.C87412m.m108593f(r1, r2)
            r10 = r1
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            r11.f178801x = r10
            android.content.Context r1 = r24.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131494950(0x7f0c0826, float:1.8613423E38)
            android.view.View r0 = r1.inflate(r2, r0, r13)
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            gy3.C87412m.m108592e(r0, r1)
            r9 = r0
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r11.f178802y = r9
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r8 = 3
            r0.<init>(r8)
            java.util.Map r7 = java.util.Collections.synchronizedMap(r0)
            java.lang.String r0 = "synchronizedMap(LinkedHashMap(3))"
            gy3.C87412m.m108593f(r7, r0)
            r11.f178780A = r7
            qj1.u7$c r6 = new qj1.u7$c
            r3 = 0
            r5 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 120(0x78, float:1.68E-43)
            r20 = 0
            r0 = r6
            r1 = r23
            r2 = r14
            r4 = r28
            r13 = r6
            r6 = r16
            r21 = r7
            r7 = r17
            r8 = r18
            r24 = r9
            r9 = r19
            r26 = r10
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r10 = r21
            r10.put(r14, r13)
            qj1.u7$c r13 = new qj1.u7$c
            r3 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 120(0x78, float:1.68E-43)
            r16 = 0
            r0 = r13
            r2 = r15
            r12 = r10
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.put(r15, r13)
            qj1.u7$c r13 = new qj1.u7$c
            r3 = 2
            r5 = 1
            r9 = 112(0x70, float:1.57E-43)
            r10 = 0
            r0 = r13
            r2 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r10 = r26
            r12.put(r10, r13)
            qj1.u7$c r13 = new qj1.u7$c
            r3 = 1000(0x3e8, float:1.401E-42)
            r5 = 0
            r9 = 120(0x78, float:1.68E-43)
            r0 = r13
            r2 = r24
            r22 = r10
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r13.f178825t = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f178810e
            r1.getAndSet(r0)
            java.lang.String r0 = ""
            r13.f178823r = r0
            r0 = r24
            r12.put(r0, r13)
            int r0 = r12.size()
            r11.f178803z = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 3
            r0.<init>(r1)
            r11.f178781B = r0
            r2 = 0
            android.animation.ObjectAnimator r3 = r11.mo87945f1(r14, r2)
            r0.put(r14, r3)
            android.animation.ObjectAnimator r3 = r11.mo87945f1(r15, r2)
            r0.put(r15, r3)
            r3 = r22
            android.animation.ObjectAnimator r4 = r11.mo87945f1(r3, r2)
            r0.put(r3, r4)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r1)
            r11.f178782C = r0
            android.animation.ObjectAnimator r1 = r11.mo87946g1(r14, r2)
            r0.put(r14, r1)
            android.animation.ObjectAnimator r1 = r11.mo87946g1(r15, r2)
            r0.put(r15, r1)
            android.animation.ObjectAnimator r1 = r11.mo87946g1(r3, r2)
            r0.put(r3, r1)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            java.lang.String r1 = "synchronizedMap(LinkedHashMap())"
            gy3.C87412m.m108593f(r0, r1)
            r11.f178783D = r0
            java.util.Collection r0 = r12.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x019e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b6
            java.lang.Object r1 = r0.next()
            qj1.u7$c r1 = (qj1.C63006u7.C63008c) r1
            qj1.u7$d r1 = r1.f178817l
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView r1 = r1.f178845h
            if (r1 == 0) goto L_0x019e
            ok1.e r2 = ok1.C62042e.f176370a
            r2.mo87033P1(r1)
            goto L_0x019e
        L_0x01b6:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            qj1.u7$a r2 = new qj1.u7$a
            r2.<init>(r11)
            r0.<init>((android.os.Looper) r1, (com.tencent.p014mm.sdk.platformtools.MMHandler.Callback) r2)
            r11.f178788I = r0
            r1 = 0
            r0.setLogging(r1)
            boolean r0 = f178779V
            r1 = 8
            if (r0 == 0) goto L_0x01e8
            android.widget.RelativeLayout r2 = r11.f178799v
            if (r2 != 0) goto L_0x01d5
            goto L_0x01d8
        L_0x01d5:
            r2.setVisibility(r1)
        L_0x01d8:
            android.widget.RelativeLayout r2 = r11.f178800w
            if (r2 != 0) goto L_0x01dd
            goto L_0x01e0
        L_0x01dd:
            r2.setVisibility(r1)
        L_0x01e0:
            android.widget.RelativeLayout r2 = r11.f178801x
            if (r2 != 0) goto L_0x01e5
            goto L_0x01e8
        L_0x01e5:
            r2.setVisibility(r1)
        L_0x01e8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ENABLE_TEST:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "Finder.FinderLiveGiftQueuePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            dl1.a r0 = dl1.C58321a.NORMAL_4_MODE
            r11.f178790K = r0
            r11.f178792M = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63006u7.<init>(android.view.ViewGroup, d60.b, nk1.m, android.view.ViewGroup, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r9v38, types: [java.lang.CharSequence] */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x024f, code lost:
        if ((r12 != null ? gy3.C87412m.m108589b(r12.f152016t, java.lang.Boolean.TRUE) : false) != false) goto L_0x0251;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04bf A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x06fb  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0715  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0778  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0784  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x078d  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x07ba  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x07c5  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m74279v1(qj1.C63006u7 r31, qj1.C63006u7.C63008c r32, nk1.C61788m.C11208b r33, boolean r34, int r35, java.lang.Object r36) {
        /*
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = 4
            r4 = r35 & 4
            if (r4 == 0) goto L_0x000d
            r4 = 1
            goto L_0x000f
        L_0x000d:
            r4 = r34
        L_0x000f:
            r31.getClass()
            java.lang.Class<cl1.o> r6 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r7 = cl1.C54963d0.class
            if (r1 != 0) goto L_0x001a
            goto L_0x07d5
        L_0x001a:
            qj1.u7$d r8 = r1.f178817l
            android.widget.LinearLayout r8 = r8.f178848k
            r9 = 0
            if (r8 != 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            r8.setVisibility(r9)
        L_0x0025:
            qj1.u7$d r8 = r1.f178817l
            android.view.View r8 = r8.f178847j
            if (r8 != 0) goto L_0x002c
            goto L_0x0073
        L_0x002c:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r15.mo10233c(r10)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r13 = "reset2GiftBullet"
            java.lang.String r14 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r10 = r8
            r3 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r3.mo10231a(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r8.setVisibility(r3)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r12 = "reset2GiftBullet"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0073:
            qj1.u7$f r3 = r1.f178818m
            android.view.View r3 = r3.f178853a
            r8 = 8
            if (r3 != 0) goto L_0x007c
            goto L_0x00c3
        L_0x007c:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r15.mo10233c(r10)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r13 = "reset2GiftBullet"
            java.lang.String r14 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r10 = r3
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r5.mo10231a(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r12 = "reset2GiftBullet"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x00c3:
            qj1.u7$f r3 = r1.f178818m
            android.view.View r3 = r3.f178856d
            if (r3 != 0) goto L_0x00ca
            goto L_0x010a
        L_0x00ca:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r8)
            java.lang.Object[] r11 = r5.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r13 = "reset2GiftBullet"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r3
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r5.mo10231a(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r12 = "reset2GiftBullet"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x010a:
            boolean r3 = r2.f33052s
            r1.f178814i = r3
            java.lang.String r3 = r2.f33050q
            if (r3 != 0) goto L_0x0114
            java.lang.String r3 = ""
        L_0x0114:
            r1.f178822q = r3
            java.lang.String r3 = r2.f33044h
            if (r3 != 0) goto L_0x011c
            java.lang.String r3 = ""
        L_0x011c:
            java.util.Map<java.lang.String, qj1.u7$e> r5 = r0.f178783D
            boolean r5 = r5.containsKey(r3)
            if (r5 != 0) goto L_0x0125
            goto L_0x012f
        L_0x0125:
            java.util.Map<java.lang.String, qj1.u7$e> r5 = r0.f178783D
            java.lang.Object r5 = r5.get(r3)
            qj1.u7$e r5 = (qj1.C63006u7.C63014e) r5
            if (r5 != 0) goto L_0x0131
        L_0x012f:
            r8 = 0
            goto L_0x0171
        L_0x0131:
            int r8 = r5.f178851b
            long r10 = eb0.C31543z5.m39453c()
            long r12 = r5.f178852c
            long r10 = r10 - r12
            int r12 = nk1.C61781k.f175633k
            int r12 = r12 * 1000
            long r12 = (long) r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0144
            r8 = 0
        L_0x0144:
            java.util.Map<java.lang.String, qj1.u7$e> r10 = r0.f178783D
            r10.remove(r3)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "checkInfoFromComboIdBackToLiveMap: comboId="
            r10.append(r11)
            r10.append(r3)
            java.lang.String r3 = ", quitTime="
            r10.append(r3)
            long r11 = r5.f178852c
            r10.append(r11)
            java.lang.String r3 = ", result="
            r10.append(r3)
            r10.append(r8)
            java.lang.String r3 = r10.toString()
            java.lang.String r5 = "Finder.FinderLiveGiftQueuePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
        L_0x0171:
            r1.f178816k = r8
            int r3 = r2.f33045i
            if (r3 <= 0) goto L_0x0178
            goto L_0x017d
        L_0x0178:
            int r3 = r2.f33046j
            int r5 = r1.f178816k
            int r3 = r3 + r5
        L_0x017d:
            r1.f178813h = r3
            int r3 = r1.f178813h
            boolean r5 = r2.f33049p
            r1.mo87964c(r3, r5, r2)
            boolean r3 = r2.f33047n
            if (r3 == 0) goto L_0x019c
            r10 = 0
            r1.f178820o = r10
            java.lang.String r3 = r2.f33050q
            if (r3 != 0) goto L_0x0194
            java.lang.String r3 = ""
        L_0x0194:
            int r5 = r1.f178813h
            int r8 = r1.f178816k
            int r5 = r5 - r8
            r0.mo87960w1(r3, r1, r5, r2)
        L_0x019c:
            boolean r3 = r2.f33049p
            r1.f178811f = r3
            te3.ju0 r3 = r2.f33043g
            cj1.y1 r5 = cj1.C0639y1.f1510a
            java.lang.String r8 = r3.f136329d
            ig1.d r5 = r5.mo612d(r8)
            te3.p11 r3 = r3.f136332g
            if (r3 == 0) goto L_0x01b5
            ig1.d$a r10 = ig1.C8916d.f28211b1
            ig1.d r3 = r10.mo9727a(r3)
            goto L_0x01b6
        L_0x01b5:
            r3 = 0
        L_0x01b6:
            if (r5 != 0) goto L_0x01ba
            r5 = r3
            goto L_0x01ec
        L_0x01ba:
            boolean r10 = r5.mo9723n2()
            if (r10 == 0) goto L_0x01ec
            if (r3 == 0) goto L_0x01ec
            java.lang.String r10 = "Finder.FinderLiveGiftQueuePlugin"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "replace gift.field_customInfo, remote customText:"
            r11.append(r12)
            java.lang.String r12 = r3.mo9722m2()
            r11.append(r12)
            java.lang.String r12 = ", local:"
            r11.append(r12)
            java.lang.String r12 = r5.mo9722m2()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            byte[] r3 = r3.field_customInfo
            r5.field_customInfo = r3
        L_0x01ec:
            if (r5 == 0) goto L_0x07d5
            android.view.ViewGroup r3 = r0.f166287d
            android.content.Context r3 = r3.getContext()
            androidx.lifecycle.i0 r10 = r0.mo87696x0(r7)
            cl1.d0 r10 = (cl1.C54963d0) r10
            java.util.List<al1.j> r10 = r10.f154074q
            java.lang.String r11 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r10, r11)
            monitor-enter(r10)
            java.util.Iterator r11 = r10.iterator()     // Catch:{ all -> 0x07d2 }
        L_0x0206:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x07d2 }
            if (r12 == 0) goto L_0x021e
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x07d2 }
            r13 = r12
            al1.j r13 = (al1.C54130j) r13     // Catch:{ all -> 0x07d2 }
            java.lang.String r13 = r13.f151999c     // Catch:{ all -> 0x07d2 }
            java.lang.String r14 = r2.f33051r     // Catch:{ all -> 0x07d2 }
            boolean r13 = android.text.TextUtils.equals(r13, r14)     // Catch:{ all -> 0x07d2 }
            if (r13 == 0) goto L_0x0206
            goto L_0x021f
        L_0x021e:
            r12 = 0
        L_0x021f:
            monitor-exit(r10)
            al1.j r12 = (al1.C54130j) r12
            androidx.lifecycle.i0 r10 = r0.mo87696x0(r7)
            cl1.d0 r10 = (cl1.C54963d0) r10
            al1.j r10 = r10.f154073p
            r11 = 2
            if (r10 == 0) goto L_0x0317
            java.lang.String r10 = r2.f33051r
            androidx.lifecycle.i0 r13 = r0.mo87696x0(r7)
            cl1.d0 r13 = (cl1.C54963d0) r13
            al1.j r13 = r13.f154073p
            if (r13 == 0) goto L_0x023c
            java.lang.String r13 = r13.f151999c
            goto L_0x023d
        L_0x023c:
            r13 = 0
        L_0x023d:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r13)
            if (r10 != 0) goto L_0x0251
            if (r12 == 0) goto L_0x024e
            java.lang.Boolean r10 = r12.f152016t
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r10 = gy3.C87412m.m108589b(r10, r13)
            goto L_0x024f
        L_0x024e:
            r10 = 0
        L_0x024f:
            if (r10 == 0) goto L_0x0317
        L_0x0251:
            qj1.u7$d r5 = r1.f178817l
            android.view.View r5 = r5.f178847j
            if (r5 != 0) goto L_0x0258
            goto L_0x026c
        L_0x0258:
            android.view.ViewGroup r6 = r0.f166287d
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131232773(0x7f080805, float:1.8081665E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r10)
            r5.setBackground(r6)
        L_0x026c:
            qj1.u7$d r5 = r1.f178817l
            android.widget.TextView r5 = r5.f178842e
            if (r5 != 0) goto L_0x0273
            goto L_0x0278
        L_0x0273:
            java.lang.String r6 = ""
            r5.setText(r6)
        L_0x0278:
            qj1.u7$d r5 = r1.f178817l
            android.widget.TextView r5 = r5.f178843f
            if (r5 != 0) goto L_0x027f
            goto L_0x0290
        L_0x027f:
            r6 = 2131827514(0x7f111b3a, float:1.9287943E38)
            r10 = 1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.String r10 = ""
            r13[r9] = r10
            java.lang.String r6 = r3.getString(r6, r13)
            r5.setText(r6)
        L_0x0290:
            qj1.u7$d r5 = r1.f178817l
            android.widget.TextView r5 = r5.f178842e
            if (r5 == 0) goto L_0x029b
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            goto L_0x029c
        L_0x029b:
            r5 = 0
        L_0x029c:
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x02a3
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            goto L_0x02a4
        L_0x02a3:
            r5 = 0
        L_0x02a4:
            if (r5 == 0) goto L_0x02aa
            int r6 = f178776S
            r5.leftMargin = r6
        L_0x02aa:
            if (r12 == 0) goto L_0x02ea
            androidx.lifecycle.i0 r5 = r0.mo87696x0(r7)
            cl1.d0 r5 = (cl1.C54963d0) r5
            java.util.List<al1.j> r5 = r5.f154074q
            java.lang.String r6 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r5, r6)
            monitor-enter(r5)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x02e7 }
            r6.<init>()     // Catch:{ all -> 0x02e7 }
            java.util.Iterator r7 = r5.iterator()     // Catch:{ all -> 0x02e7 }
        L_0x02c3:
            boolean r10 = r7.hasNext()     // Catch:{ all -> 0x02e7 }
            if (r10 == 0) goto L_0x02de
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x02e7 }
            r12 = r10
            al1.j r12 = (al1.C54130j) r12     // Catch:{ all -> 0x02e7 }
            java.lang.Boolean r12 = r12.f152016t     // Catch:{ all -> 0x02e7 }
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x02e7 }
            boolean r12 = gy3.C87412m.m108589b(r12, r13)     // Catch:{ all -> 0x02e7 }
            if (r12 == 0) goto L_0x02c3
            r6.add(r10)     // Catch:{ all -> 0x02e7 }
            goto L_0x02c3
        L_0x02de:
            monitor-exit(r5)
            int r5 = r6.size()
            if (r5 < r11) goto L_0x02ea
            r5 = 1
            goto L_0x02eb
        L_0x02e7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x02ea:
            r5 = 0
        L_0x02eb:
            qj1.u7$d r6 = r1.f178817l
            r0.mo87939Z0(r5, r6)
            qj1.u7$d r5 = r1.f178817l
            android.view.View r5 = r5.f178847j
            if (r5 == 0) goto L_0x02fb
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            goto L_0x02fc
        L_0x02fb:
            r5 = 0
        L_0x02fc:
            if (r5 != 0) goto L_0x0300
            goto L_0x0772
        L_0x0300:
            qj1.u7$d r6 = r1.f178817l
            int r6 = r6.f178841d
            android.content.res.Resources r3 = r3.getResources()
            r7 = 2131165295(0x7f07006f, float:1.7944803E38)
            float r3 = r3.getDimension(r7)
            int r3 = (int) r3
            if (r6 <= r3) goto L_0x0313
            r6 = r3
        L_0x0313:
            r5.width = r6
            goto L_0x0772
        L_0x0317:
            qj1.u7$d r10 = r1.f178817l
            android.view.View r10 = r10.f178847j
            if (r10 != 0) goto L_0x031e
            goto L_0x0332
        L_0x031e:
            android.view.ViewGroup r13 = r0.f166287d
            android.content.Context r13 = r13.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131232548(0x7f080724, float:1.8081208E38)
            android.graphics.drawable.Drawable r13 = r13.getDrawable(r14)
            r10.setBackground(r13)
        L_0x0332:
            te3.xs0 r10 = r2.f33040d
            if (r10 == 0) goto L_0x033d
            te3.hx0 r10 = r10.f144914s
            if (r10 == 0) goto L_0x033d
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r10.f134919d
            goto L_0x033e
        L_0x033d:
            r10 = 0
        L_0x033e:
            qj1.u7$d r13 = r1.f178817l
            android.widget.TextView r15 = r13.f178842e
            boolean r13 = r13.f178839b
            ok1.e r14 = ok1.C62042e.f176370a
            if (r10 == 0) goto L_0x034d
            java.lang.String r8 = r10.username
            r17 = r8
            goto L_0x034f
        L_0x034d:
            r17 = 0
        L_0x034f:
            if (r10 == 0) goto L_0x0356
            java.lang.String r8 = r10.nickname
            r18 = r8
            goto L_0x0358
        L_0x0356:
            r18 = 0
        L_0x0358:
            r19 = 0
            r20 = 4
            r21 = 0
            r16 = r14
            java.lang.String r8 = ok1.C62042e.m72808l0(r16, r17, r18, r19, r20, r21)
            androidx.lifecycle.i0 r16 = r0.mo87696x0(r6)
            r9 = r16
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.f154356q2
            if (r9 == 0) goto L_0x0377
            if (r10 == 0) goto L_0x0377
            java.lang.String r9 = r10.nickname
            if (r9 == 0) goto L_0x0377
            r8 = r9
        L_0x0377:
            androidx.lifecycle.i0 r9 = r0.mo87696x0(r6)
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.mo75998e3()
            if (r9 == 0) goto L_0x0392
            if (r10 == 0) goto L_0x0388
            java.lang.String r9 = r10.username
            goto L_0x0389
        L_0x0388:
            r9 = 0
        L_0x0389:
            java.lang.String r8 = er1.C7878t0.m8042k(r9, r8)
            java.lang.String r9 = "makeAnonymousNameIfIsMyS…displayName\n            )"
            gy3.C87412m.m108593f(r8, r9)
        L_0x0392:
            if (r13 == 0) goto L_0x039b
            r9 = 4
            r10 = 1
            java.lang.String r8 = r14.mo86997D0(r8, r9, r10)
            goto L_0x03c5
        L_0x039b:
            int r9 = r0.f178797t
            if (r9 > 0) goto L_0x03c0
            if (r15 == 0) goto L_0x03c5
            java.lang.Class<tf0.p1> r9 = tf0.C64916p1.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            java.lang.String r10 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r9, r10)
            r14 = r9
            tf0.p1 r14 = (tf0.C64916p1) r14
            r17 = 0
            r18 = 4
            r19 = 0
            r16 = r8
            java.lang.CharSequence r9 = tf0.C64916p1.C64917a.m76442i(r14, r15, r16, r17, r18, r19)
            if (r9 != 0) goto L_0x03be
            goto L_0x03c5
        L_0x03be:
            r8 = r9
            goto L_0x03c5
        L_0x03c0:
            r10 = 1
            java.lang.String r8 = r14.mo86997D0(r8, r9, r10)
        L_0x03c5:
            qj1.u7$d r9 = r1.f178817l
            boolean r10 = r9.f178839b
            if (r10 != 0) goto L_0x03d3
            boolean r13 = r0.f178796s
            if (r13 == 0) goto L_0x03d0
            goto L_0x03d3
        L_0x03d0:
            wk1.y r13 = wk1.C15484y.SIZE_LARGE
            goto L_0x03d5
        L_0x03d3:
            wk1.y r13 = wk1.C15484y.SIZE_NORMAL
        L_0x03d5:
            r28 = r13
            if (r10 == 0) goto L_0x03e2
            r10 = 1
            int[] r13 = new int[r10]
            r10 = 0
            r13[r10] = r11
            r26 = r13
            goto L_0x03e9
        L_0x03e2:
            int[] r10 = new int[r11]
            r10 = {2, 4} // fill-array
            r26 = r10
        L_0x03e9:
            wk1.n r21 = wk1.C15440n.f41895a
            android.widget.TextView r9 = r9.f178842e
            android.view.ViewGroup r10 = r0.f166287d
            android.content.Context r10 = r10.getContext()
            java.lang.String r13 = "root.context"
            gy3.C87412m.m108593f(r10, r13)
            java.lang.String r24 = r8.toString()
            te3.xs0 r13 = r2.f33040d
            if (r13 == 0) goto L_0x0409
            te3.hx0 r13 = r13.f144914s
            if (r13 == 0) goto L_0x0409
            java.util.LinkedList<te3.aw0> r13 = r13.f134930r
            r25 = r13
            goto L_0x040b
        L_0x0409:
            r25 = 0
        L_0x040b:
            r27 = 0
            r29 = 32
            r30 = 0
            r22 = r9
            r23 = r10
            rx3.l r9 = wk1.C15440n.m14440c(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            qj1.u7$d r10 = r1.f178817l
            android.widget.TextView r10 = r10.f178842e
            if (r10 != 0) goto L_0x0420
            goto L_0x0427
        L_0x0420:
            A r13 = r9.f38555d
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r10.setText(r13)
        L_0x0427:
            qj1.u7$d r10 = r1.f178817l
            android.widget.TextView r10 = r10.f178842e
            B r13 = r9.f38556e
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = r13.isEmpty()
            r14 = 1
            r13 = r13 ^ r14
            if (r10 == 0) goto L_0x043c
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            goto L_0x043d
        L_0x043c:
            r10 = 0
        L_0x043d:
            boolean r14 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r14 == 0) goto L_0x0444
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            goto L_0x0445
        L_0x0444:
            r10 = 0
        L_0x0445:
            if (r10 == 0) goto L_0x0450
            if (r13 == 0) goto L_0x044c
            int r13 = f178777T
            goto L_0x044e
        L_0x044c:
            int r13 = f178776S
        L_0x044e:
            r10.leftMargin = r13
        L_0x0450:
            qj1.u7$d r10 = r1.f178817l
            boolean r13 = r10.f178839b
            if (r13 == 0) goto L_0x075b
            androidx.lifecycle.i0 r5 = r0.mo87696x0(r7)
            cl1.d0 r5 = (cl1.C54963d0) r5
            al1.j r5 = r5.f154073p
            if (r5 == 0) goto L_0x0467
            boolean r5 = r5.f152004h
            r10 = 1
            if (r5 != r10) goto L_0x0467
            r5 = 1
            goto L_0x0468
        L_0x0467:
            r5 = 0
        L_0x0468:
            if (r5 == 0) goto L_0x04ae
            if (r12 == 0) goto L_0x04ae
            androidx.lifecycle.i0 r5 = r0.mo87696x0(r7)
            cl1.d0 r5 = (cl1.C54963d0) r5
            java.util.List<al1.j> r5 = r5.f154074q
            java.lang.String r10 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r5, r10)
            monitor-enter(r5)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x04ab }
            r10.<init>()     // Catch:{ all -> 0x04ab }
            java.util.Iterator r13 = r5.iterator()     // Catch:{ all -> 0x04ab }
        L_0x0483:
            boolean r15 = r13.hasNext()     // Catch:{ all -> 0x04ab }
            if (r15 == 0) goto L_0x04a1
            java.lang.Object r15 = r13.next()     // Catch:{ all -> 0x04ab }
            r14 = r15
            al1.j r14 = (al1.C54130j) r14     // Catch:{ all -> 0x04ab }
            java.lang.Boolean r14 = r14.f152016t     // Catch:{ all -> 0x04ab }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x04ab }
            boolean r11 = gy3.C87412m.m108589b(r14, r11)     // Catch:{ all -> 0x04ab }
            r14 = 1
            r11 = r11 ^ r14
            if (r11 == 0) goto L_0x049f
            r10.add(r15)     // Catch:{ all -> 0x04ab }
        L_0x049f:
            r11 = 2
            goto L_0x0483
        L_0x04a1:
            monitor-exit(r5)
            int r5 = r10.size()
            r10 = 2
            if (r5 < r10) goto L_0x04ae
            r5 = 1
            goto L_0x04af
        L_0x04ab:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x04ae:
            r5 = 0
        L_0x04af:
            androidx.lifecycle.i0 r7 = r0.mo87696x0(r7)
            cl1.d0 r7 = (cl1.C54963d0) r7
            boolean r7 = r7.mo75912T3()
            qj1.u7$d r10 = r1.f178817l
            boolean r11 = r10.f178840c
            if (r11 == 0) goto L_0x04cc
            if (r7 == 0) goto L_0x0772
            android.widget.TextView r3 = r10.f178842e
            if (r3 != 0) goto L_0x04c7
            goto L_0x0772
        L_0x04c7:
            r3.setText(r8)
            goto L_0x0772
        L_0x04cc:
            r7 = 2131165337(0x7f070099, float:1.7944888E38)
            if (r5 == 0) goto L_0x05b1
            android.widget.LinearLayout r8 = r10.f178848k
            if (r8 != 0) goto L_0x04d6
            goto L_0x04da
        L_0x04d6:
            r9 = 1
            r8.setOrientation(r9)
        L_0x04da:
            qj1.u7$d r8 = r1.f178817l
            android.widget.LinearLayout r8 = r8.f178848k
            if (r8 == 0) goto L_0x04e5
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            goto L_0x04e6
        L_0x04e5:
            r8 = 0
        L_0x04e6:
            java.lang.String r9 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r8, r9)
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            android.content.res.Resources r9 = r3.getResources()
            r10 = 2131165281(0x7f070061, float:1.7944775E38)
            float r9 = r9.getDimension(r10)
            int r9 = (int) r9
            r8.leftMargin = r9
            qj1.u7$d r8 = r1.f178817l
            android.widget.LinearLayout r8 = r8.f178849l
            if (r8 == 0) goto L_0x0506
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            goto L_0x0507
        L_0x0506:
            r8 = 0
        L_0x0507:
            java.lang.String r9 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r8, r9)
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            android.content.res.Resources r9 = r3.getResources()
            float r9 = r9.getDimension(r10)
            int r9 = (int) r9
            r8.topMargin = r9
            android.content.res.Resources r9 = r3.getResources()
            float r9 = r9.getDimension(r10)
            int r9 = (int) r9
            int r9 = -r9
            r8.bottomMargin = r9
            rx3.b0 r8 = rx3.C13598b0.f38549a
            qj1.u7$d r8 = r1.f178817l
            android.view.ViewGroup r8 = r8.f178838a
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            if (r8 != 0) goto L_0x0532
            goto L_0x0535
        L_0x0532:
            r9 = -2
            r8.height = r9
        L_0x0535:
            qj1.u7$d r8 = r1.f178817l
            android.view.View r8 = r8.f178847j
            if (r8 == 0) goto L_0x0540
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            goto L_0x0541
        L_0x0540:
            r8 = 0
        L_0x0541:
            if (r8 != 0) goto L_0x0544
            goto L_0x054f
        L_0x0544:
            android.content.res.Resources r3 = r3.getResources()
            float r3 = r3.getDimension(r7)
            int r3 = (int) r3
            r8.height = r3
        L_0x054f:
            te3.xs0 r3 = r2.f33040d
            if (r3 == 0) goto L_0x055e
            te3.hx0 r3 = r3.f144914s
            if (r3 == 0) goto L_0x055e
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d
            if (r3 == 0) goto L_0x055e
            java.lang.String r3 = r3.nickname
            goto L_0x055f
        L_0x055e:
            r3 = 0
        L_0x055f:
            qj1.u7$d r7 = r1.f178817l
            android.widget.TextView r7 = r7.f178842e
            if (r7 != 0) goto L_0x0566
            goto L_0x05a2
        L_0x0566:
            androidx.lifecycle.i0 r6 = r0.mo87696x0(r6)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.f154356q2
            if (r6 == 0) goto L_0x0573
            if (r3 == 0) goto L_0x0573
            goto L_0x059f
        L_0x0573:
            er1.j4 r13 = er1.C58739j4.f168176a
            te3.xs0 r3 = r2.f33040d
            if (r3 == 0) goto L_0x0585
            te3.hx0 r6 = r3.f144914s
            if (r6 == 0) goto L_0x0585
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.f134919d
            if (r6 == 0) goto L_0x0585
            java.lang.String r6 = r6.username
            r14 = r6
            goto L_0x0586
        L_0x0585:
            r14 = 0
        L_0x0586:
            if (r3 == 0) goto L_0x0594
            te3.hx0 r3 = r3.f144914s
            if (r3 == 0) goto L_0x0594
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d
            if (r3 == 0) goto L_0x0594
            java.lang.String r3 = r3.nickname
            r15 = r3
            goto L_0x0595
        L_0x0594:
            r15 = 0
        L_0x0595:
            r16 = 0
            r17 = 4
            r18 = 0
            java.lang.String r3 = er1.C58739j4.m68253s(r13, r14, r15, r16, r17, r18)
        L_0x059f:
            r7.setText(r3)
        L_0x05a2:
            qj1.u7$d r3 = r1.f178817l
            android.widget.TextView r3 = r3.f178843f
            if (r3 != 0) goto L_0x05aa
            goto L_0x0721
        L_0x05aa:
            java.lang.String r6 = ""
            r3.setText(r6)
            goto L_0x0721
        L_0x05b1:
            android.widget.LinearLayout r6 = r10.f178848k
            if (r6 != 0) goto L_0x05b7
            r10 = 0
            goto L_0x05bb
        L_0x05b7:
            r10 = 0
            r6.setOrientation(r10)
        L_0x05bb:
            qj1.u7$d r6 = r1.f178817l
            android.widget.LinearLayout r6 = r6.f178848k
            if (r6 == 0) goto L_0x05c6
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x05c7
        L_0x05c6:
            r6 = 0
        L_0x05c7:
            java.lang.String r11 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r6, r11)
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            r6.leftMargin = r10
            qj1.u7$d r6 = r1.f178817l
            android.widget.LinearLayout r6 = r6.f178849l
            if (r6 == 0) goto L_0x05db
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x05dc
        L_0x05db:
            r6 = 0
        L_0x05dc:
            java.lang.String r11 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r6, r11)
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            r6.topMargin = r10
            r6.bottomMargin = r10
            rx3.b0 r6 = rx3.C13598b0.f38549a
            qj1.u7$d r6 = r1.f178817l
            android.view.ViewGroup r6 = r6.f178838a
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            if (r6 != 0) goto L_0x05f4
            goto L_0x0602
        L_0x05f4:
            android.content.res.Resources r10 = r3.getResources()
            r11 = 2131165351(0x7f0700a7, float:1.7944917E38)
            float r10 = r10.getDimension(r11)
            int r10 = (int) r10
            r6.height = r10
        L_0x0602:
            qj1.u7$d r6 = r1.f178817l
            android.view.View r6 = r6.f178847j
            if (r6 == 0) goto L_0x060d
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x060e
        L_0x060d:
            r6 = 0
        L_0x060e:
            if (r6 != 0) goto L_0x0611
            goto L_0x061c
        L_0x0611:
            android.content.res.Resources r10 = r3.getResources()
            float r7 = r10.getDimension(r7)
            int r7 = (int) r7
            r6.height = r7
        L_0x061c:
            B r6 = r9.f38556e
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r7 = 1
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x06f8
            qj1.u7$d r6 = r1.f178817l
            int r6 = r6.f178841d
            if (r6 <= 0) goto L_0x06f8
            java.lang.String r6 = r8.toString()
            B r7 = r9.f38556e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = sx3.C110818d0.m150914L(r7)
            android.text.style.ImageSpan r7 = (android.text.style.ImageSpan) r7
            qj1.u7$d r8 = r1.f178817l
            android.widget.TextView r9 = r8.f178843f
            if (r9 != 0) goto L_0x0644
            goto L_0x06f8
        L_0x0644:
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView r8 = r8.f178845h
            r9 = 0
            if (r8 == 0) goto L_0x0667
            android.text.TextPaint r8 = r8.getPaint()
            if (r8 == 0) goto L_0x0667
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 120(0x78, float:1.68E-43)
            r10.append(r11)
            int r11 = r1.f178813h
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            float r8 = r8.measureText(r10)
            goto L_0x0668
        L_0x0667:
            r8 = 0
        L_0x0668:
            qj1.u7$d r10 = r1.f178817l
            android.widget.TextView r10 = r10.f178842e
            if (r10 == 0) goto L_0x0678
            android.text.TextPaint r10 = r10.getPaint()
            if (r10 == 0) goto L_0x0678
            float r9 = r10.measureText(r6)
        L_0x0678:
            boolean r6 = r7 instanceof wk1.C15432i
            if (r6 == 0) goto L_0x067f
            wk1.i r7 = (wk1.C15432i) r7
            goto L_0x0680
        L_0x067f:
            r7 = 0
        L_0x0680:
            if (r7 == 0) goto L_0x0687
            wk1.i$a$a r6 = r7.f41856d
            int r6 = r6.f41875s
            goto L_0x0688
        L_0x0687:
            r6 = 0
        L_0x0688:
            float r6 = (float) r6
            float r9 = r9 + r6
            float r6 = f178774Q
            float r6 = r6 + r9
            float r7 = f178773P
            float r6 = r6 + r7
            float r6 = r6 + r8
            float r6 = r6 + r7
            int r6 = (int) r6
            ok1.e r7 = ok1.C62042e.f176370a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "enoughSpaceForGiftText comboSumCount:"
            r10.append(r11)
            int r11 = r1.f178813h
            r10.append(r11)
            java.lang.String r11 = ", fromUserNameWidth:"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = ", countWidth:"
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = ",takePlaceWidth:"
            r10.append(r8)
            r10.append(r6)
            java.lang.String r8 = ",outSpaceWidth:"
            r10.append(r8)
            qj1.u7$d r8 = r1.f178817l
            int r8 = r8.f178841d
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r9 = "Finder.FinderLiveGiftQueuePlugin"
            r7.mo86998D1(r9, r8)
            qj1.u7$d r7 = r1.f178817l
            int r8 = r7.f178841d
            android.widget.TextView r7 = r7.f178843f
            android.content.res.Resources r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r13 = ""
            r14 = 0
            r11[r14] = r13
            r13 = 2131827513(0x7f111b39, float:1.928794E38)
            java.lang.String r9 = r9.getString(r13, r11)
            java.lang.String r11 = "getResources().getString…lut_tip_with_content, \"\")"
            gy3.C87412m.m108593f(r9, r11)
            int r6 = r0.mo87958t1(r8, r6, r7, r9)
            if (r6 > r10) goto L_0x06f6
            goto L_0x06f8
        L_0x06f6:
            r6 = 0
            goto L_0x06f9
        L_0x06f8:
            r6 = 1
        L_0x06f9:
            if (r6 == 0) goto L_0x0715
            qj1.u7$d r6 = r1.f178817l
            android.widget.TextView r6 = r6.f178843f
            if (r6 != 0) goto L_0x0702
            goto L_0x0721
        L_0x0702:
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = ""
            r9 = 0
            r7[r9] = r8
            r8 = 2131827513(0x7f111b39, float:1.928794E38)
            java.lang.String r3 = r3.getString(r8, r7)
            r6.setText(r3)
            goto L_0x0721
        L_0x0715:
            qj1.u7$d r3 = r1.f178817l
            android.widget.TextView r3 = r3.f178843f
            if (r3 != 0) goto L_0x071c
            goto L_0x0721
        L_0x071c:
            java.lang.String r6 = ""
            r3.setText(r6)
        L_0x0721:
            qj1.u7$d r3 = r1.f178817l
            r0.mo87939Z0(r5, r3)
            qj1.u7$d r3 = r1.f178817l
            android.view.View r3 = r3.f178847j
            if (r3 == 0) goto L_0x0731
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            goto L_0x0732
        L_0x0731:
            r3 = 0
        L_0x0732:
            if (r3 != 0) goto L_0x0735
            goto L_0x0740
        L_0x0735:
            qj1.u7$d r5 = r1.f178817l
            int r5 = r5.f178841d
            int r6 = f178778U
            if (r5 <= r6) goto L_0x073e
            r5 = r6
        L_0x073e:
            r3.width = r5
        L_0x0740:
            qj1.u7$d r3 = r1.f178817l
            android.view.ViewGroup r3 = r3.f178838a
            java.lang.Object r5 = r3.getTag()
            boolean r6 = r5 instanceof android.graphics.Rect
            if (r6 == 0) goto L_0x074f
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            goto L_0x0750
        L_0x074f:
            r5 = 0
        L_0x0750:
            if (r5 != 0) goto L_0x0757
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
        L_0x0757:
            r0.mo87940a1(r3, r5, r12)
            goto L_0x0772
        L_0x075b:
            android.widget.TextView r6 = r10.f178843f
            if (r6 != 0) goto L_0x0760
            goto L_0x0772
        L_0x0760:
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r5 = r5.field_name
            r8 = 0
            r7[r8] = r5
            r5 = 2131827513(0x7f111b39, float:1.928794E38)
            java.lang.String r3 = r3.getString(r5, r7)
            r6.setText(r3)
        L_0x0772:
            qj1.u7$d r3 = r1.f178817l
            org.libpag.PAGView r3 = r3.f178844g
            if (r3 == 0) goto L_0x077e
            r5 = -1
            r3.setRepeatCount(r5)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x077e:
            qj1.u7$d r3 = r1.f178817l
            org.libpag.PAGView r3 = r3.f178844g
            if (r3 == 0) goto L_0x0787
            r3.flush()
        L_0x0787:
            qj1.u7$d r3 = r1.f178817l
            org.libpag.PAGView r7 = r3.f178844g
            if (r7 == 0) goto L_0x07b0
            ql1.a r3 = ql1.C12874a.f36849a
            yf.c r5 = r3.mo12389a()
            cj1.y1 r3 = cj1.C0639y1.f1510a
            java.lang.String r6 = r2.f33050q
            ig1.d r3 = r3.mo612d(r6)
            if (r3 == 0) goto L_0x07a0
            java.lang.String r8 = r3.field_previewPagUrl
            goto L_0x07a1
        L_0x07a0:
            r8 = 0
        L_0x07a1:
            if (r8 != 0) goto L_0x07a7
            java.lang.String r3 = ""
            r6 = r3
            goto L_0x07a8
        L_0x07a7:
            r6 = r8
        L_0x07a8:
            r8 = 0
            r9 = 4
            r10 = 0
            p277yf.C15996c.C15997a.m14902b(r5, r6, r7, r8, r9, r10)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x07b0:
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 25
            if (r3 > r5) goto L_0x07c5
            int r3 = r0.f178798u
            if (r3 != 0) goto L_0x07c5
            java.lang.String r3 = "giftQueuePagFlush"
            qj1.d8 r5 = new qj1.d8
            r5.<init>(r1)
            o40.C61926c.m72661F(r3, r5)
            goto L_0x07ce
        L_0x07c5:
            qj1.u7$d r1 = r1.f178817l
            org.libpag.PAGView r1 = r1.f178844g
            if (r1 == 0) goto L_0x07ce
            r1.flush()
        L_0x07ce:
            r0.mo87957s1(r2, r4)
            goto L_0x07d5
        L_0x07d2:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x07d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63006u7.m74279v1(qj1.u7, qj1.u7$c, nk1.m$b, boolean, int, java.lang.Object):void");
    }

    /* renamed from: Z0 */
    public final void mo87939Z0(boolean z, C63013d dVar) {
        if (!dVar.f178840c && !((C54963d0) mo87696x0(C54963d0.class)).mo75912T3()) {
            PAGView pAGView = dVar.f178844g;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.LayoutParams layoutParams = pAGView != null ? pAGView.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i = 0;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.width = (int) (z ? this.f166287d.getContext().getResources().getDimension(C0966R.dimen.f3738cr) : this.f166287d.getContext().getResources().getDimension(C0966R.dimen.f3753d4));
                marginLayoutParams2.height = (int) (z ? this.f166287d.getContext().getResources().getDimension(C0966R.dimen.f3738cr) : this.f166287d.getContext().getResources().getDimension(C0966R.dimen.f3753d4));
                marginLayoutParams2.setMarginStart(z ? 0 : (int) this.f166287d.getContext().getResources().getDimension(C0966R.dimen.f3703bv));
            }
            FinderLiveGiftTextView finderLiveGiftTextView = dVar.f178845h;
            if (finderLiveGiftTextView != null) {
                finderLiveGiftTextView.setTextSize(1, z ? 14.0f : 17.0f);
            }
            FinderLiveGiftTextView finderLiveGiftTextView2 = dVar.f178845h;
            ViewGroup.LayoutParams layoutParams2 = finderLiveGiftTextView2 != null ? finderLiveGiftTextView2.getLayoutParams() : null;
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            }
            if (marginLayoutParams != null) {
                if (!z) {
                    i = (int) this.f166287d.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
                }
                marginLayoutParams.setMarginStart(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
        if (r3 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87940a1(android.view.ViewGroup r10, android.graphics.Rect r11, al1.C54130j r12) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r0, r1)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r11.width()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            int r3 = r11.height()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r10.measure(r1, r2)
            int r1 = r11.bottom
            int r2 = r10.getMeasuredHeight()
            int r1 = r1 - r2
            r0.topMargin = r1
            r10.setTag(r11)
            java.lang.Class<cl1.c0> r1 = cl1.C54949c0.class
            r2 = 0
            r3 = 1
            r4 = 0
            if (r12 == 0) goto L_0x0097
            androidx.lifecycle.i0 r5 = r9.mo87696x0(r1)
            cl1.c0 r5 = (cl1.C54949c0) r5
            java.lang.Class<cl1.d0> r6 = cl1.C54963d0.class
            androidx.lifecycle.i0 r5 = r5.business(r6)
            cl1.d0 r5 = (cl1.C54963d0) r5
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r5 = r5.f154077t
            java.lang.Object r5 = r5.getValue()
            gi1.c r5 = (gi1.C59464c) r5
            if (r5 == 0) goto L_0x0078
            java.util.LinkedList<gi1.a> r5 = r5.f169896a
            if (r5 == 0) goto L_0x0078
            java.util.Iterator r5 = r5.iterator()
        L_0x0056:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0070
            java.lang.Object r6 = r5.next()
            r7 = r6
            gi1.a r7 = (gi1.C59463a) r7
            java.lang.String r7 = r7.mo84561a()
            java.lang.String r8 = r12.f151997a
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x0056
            goto L_0x0071
        L_0x0070:
            r6 = r2
        L_0x0071:
            gi1.a r6 = (gi1.C59463a) r6
            if (r6 == 0) goto L_0x0078
            gi1.f r5 = r6.f169895b
            goto L_0x0079
        L_0x0078:
            r5 = r2
        L_0x0079:
            androidx.lifecycle.i0 r1 = r9.mo87696x0(r1)
            cl1.c0 r1 = (cl1.C54949c0) r1
            boolean r1 = r1.mo75864e3()
            r6 = 2
            if (r1 == 0) goto L_0x0091
            if (r5 == 0) goto L_0x0091
            int r1 = r5.f169905i
            boolean r1 = o40.C61926c.m72696u(r1, r6)
            if (r1 != 0) goto L_0x0097
            goto L_0x0095
        L_0x0091:
            int r1 = r12.f152001e
            if (r1 != r6) goto L_0x0097
        L_0x0095:
            r1 = 1
            goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            if (r1 != 0) goto L_0x00a4
            if (r12 == 0) goto L_0x00a1
            boolean r12 = r12.f152004h
            if (r12 != r3) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r3 = 0
        L_0x00a2:
            if (r3 == 0) goto L_0x00ac
        L_0x00a4:
            int r12 = r0.topMargin
            float r1 = f178775R
            int r1 = (int) r1
            int r12 = r12 - r1
            r0.topMargin = r12
        L_0x00ac:
            java.util.Map<android.view.ViewGroup, qj1.u7$c> r12 = r9.f178780A
            java.lang.Object r12 = r12.get(r10)
            qj1.u7$c r12 = (qj1.C63006u7.C63008c) r12
            if (r12 == 0) goto L_0x00b8
            qj1.u7$d r2 = r12.f178817l
        L_0x00b8:
            if (r2 != 0) goto L_0x00bb
            goto L_0x00c1
        L_0x00bb:
            int r12 = r11.width()
            r2.f178841d = r12
        L_0x00c1:
            int r11 = r11.left
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r12 = 2131165371(0x7f0700bb, float:1.7944957E38)
            float r10 = r10.getDimension(r12)
            int r10 = (int) r10
            int r11 = r11 + r10
            r0.setMarginStart(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63006u7.mo87940a1(android.view.ViewGroup, android.graphics.Rect, al1.j):void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo87941b1(C63008c cVar) {
        Object obj;
        if (cVar != null && cVar.f178808c.get() && cVar.f178810e.get() && !cVar.f178825t && cVar.f178810e.get()) {
            Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "cloneToFakeContainer: origin info = " + cVar);
            C63008c cVar2 = this.f178780A.get(this.f178802y);
            if (cVar2 != null) {
                cVar2.f178820o = cVar.f178820o;
                cVar2.f178821p = cVar.f178821p;
                cVar2.f178808c.getAndSet(true);
                if (this.f178787H.stopped()) {
                    Iterator it = ((C110818d0.C64182a) C110818d0.m150897A(this.f178780A.entrySet())).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C87412m.m108589b(((Map.Entry) obj).getKey(), this.f178802y)) {
                            break;
                        }
                    }
                    mo87943d1((Map.Entry) obj);
                }
            }
        }
    }

    /* renamed from: c1 */
    public final boolean mo87942c1(Map.Entry<? extends ViewGroup, C63008c> entry) {
        if (entry == null || !entry.getValue().f178808c.get() || entry.getValue().f178811f || entry.getValue().f178810e.get()) {
            StringBuilder sb = new StringBuilder();
            sb.append("checkIfOuterSpacePreciousGiftForceReplace: entry fail, ");
            sb.append(entry != null ? entry.getValue() : null);
            Log.m105924i("Finder.FinderLiveGiftQueuePlugin", sb.toString());
            return false;
        }
        C61788m.C11208b c = this.f178794q.mo86705c(entry.getValue().f178823r);
        if (c == null || !c.f33047n) {
            return false;
        }
        mo87954p1((ViewGroup) entry.getKey(), c);
        this.f178794q.mo86702a(c);
        return true;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87943d1(java.util.Map.Entry<? extends android.view.ViewGroup, qj1.C63006u7.C63008c> r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0006
            java.util.Map$Entry r9 = r8.mo87949j1()
        L_0x0006:
            r0 = 0
            if (r9 == 0) goto L_0x00b9
            java.lang.Object r1 = r9.getValue()
            qj1.u7$c r1 = (qj1.C63006u7.C63008c) r1
            long r1 = r1.f178820o
            long r3 = eb0.C31543z5.m39453c()
            java.lang.Object r5 = r9.getValue()
            qj1.u7$c r5 = (qj1.C63006u7.C63008c) r5
            long r5 = r5.f178821p
            long r3 = r3 - r5
            long r1 = r1 - r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkIfPreciousGiftTimeOver: remainingTime="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", entry="
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.FinderLiveGiftQueuePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r5 = 100
            r3 = 1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x004b
            com.tencent.mm.sdk.platformtools.MTimerHandler r9 = r8.f178787H
            r9.startTimer(r1)
            r0 = 1
            goto L_0x00b9
        L_0x004b:
            d60.b r1 = r8.f178793p
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_EVENT_HIDE_FULL_SCREEN_GIFT
            r5 = 2
            r6 = 0
            d60.C58124b.C7172a.m7372a(r1, r2, r6, r5, r6)
            java.lang.Object r1 = r9.getValue()
            qj1.u7$c r1 = (qj1.C63006u7.C63008c) r1
            r5 = 0
            r1.f178820o = r5
            java.lang.Object r1 = r9.getValue()
            qj1.u7$c r1 = (qj1.C63006u7.C63008c) r1
            r1.f178821p = r5
            java.lang.Object r1 = r9.getValue()
            qj1.u7$c r1 = (qj1.C63006u7.C63008c) r1
            boolean r1 = r1.f178825t
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = "checkIfPreciousGiftTimeOver: fake container"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            java.lang.Object r9 = r9.getValue()
            qj1.u7$c r9 = (qj1.C63006u7.C63008c) r9
            java.util.concurrent.atomic.AtomicBoolean r9 = r9.f178808c
            r9.getAndSet(r0)
            r8.mo87952n1()
            goto L_0x00b9
        L_0x0084:
            boolean r1 = r8.f178789J
            if (r1 == 0) goto L_0x008e
            java.lang.String r9 = "checkIfPreciousGiftTimeOver: preciousGiftBulletOutHandlerProcessing is true, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            goto L_0x00b9
        L_0x008e:
            r8.f178789J = r3
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r8.f178788I
            android.os.Message r1 = r1.obtainMessage()
            java.lang.Object r9 = r9.getKey()
            r1.obj = r9
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r8.f178788I
            r2 = 2000(0x7d0, double:9.88E-321)
            r9.sendMessageDelayed(r1, r2)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "checkIfPreciousGiftTimeOver: handler msg.obj = "
            r9.append(r2)
            java.lang.Object r1 = r1.obj
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63006u7.mo87943d1(java.util.Map$Entry):boolean");
    }

    /* renamed from: e1 */
    public final void mo87944e1() {
        if (this.f178780A.get(this.f178799v) == null) {
            Map<ViewGroup, C63008c> map = this.f178780A;
            RelativeLayout relativeLayout = this.f178799v;
            map.put(relativeLayout, new C63008c(this, relativeLayout, 0, this.f178796s, false, false, false, 0, 120, (C8480h) null));
            Map<ViewGroup, ObjectAnimator> map2 = this.f178781B;
            RelativeLayout relativeLayout2 = this.f178799v;
            ObjectAnimator f1 = mo87945f1(relativeLayout2, false);
            f1.addListener(new C63103x7(this, this.f178799v, f1, false));
            ((ConcurrentHashMap) map2).put(relativeLayout2, f1);
            Map<ViewGroup, ObjectAnimator> map3 = this.f178782C;
            RelativeLayout relativeLayout3 = this.f178799v;
            ObjectAnimator g1 = mo87946g1(relativeLayout3, false);
            g1.addListener(new C63125y7(this, this.f178799v));
            ((ConcurrentHashMap) map3).put(relativeLayout3, g1);
            Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "checkRecoverContainerOne restart register containerOne");
        }
    }

    /* renamed from: f1 */
    public final ObjectAnimator mo87945f1(ViewGroup viewGroup, boolean z) {
        ObjectAnimator ofFloat = z ? ObjectAnimator.ofFloat(viewGroup, "alpha", new float[]{0.0f, 1.0f}) : ObjectAnimator.ofFloat(viewGroup, "translationX", new float[]{-500.0f, 0.0f});
        int i = f178772N;
        ofFloat.setDuration((long) (i + 500));
        if (z) {
            ofFloat.setEvaluator(new C35914b(500, i, new C63017h(this, viewGroup)));
        } else {
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setEvaluator(new C33936c(500, i, new C63018i(this, viewGroup)));
        }
        return ofFloat;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C39975j) mo87696x0(C39975j.class)).mo62578e3()) {
            super.mo10792g(8);
            return;
        }
        C32444a aVar = C32444a.f86121a;
        if (((Boolean) C32444a.f86047D2.mo60266n()).booleanValue()) {
            i = 8;
        }
        super.mo10792g(i);
        C39818r rVar = C39818r.f106831a;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        if (!((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e) {
            mo87956r1(this.f178792M);
        } else {
            this.f178795r.setVisibility(8);
        }
    }

    /* renamed from: g1 */
    public final ObjectAnimator mo87946g1(ViewGroup viewGroup, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(500);
        return ofFloat;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h1 */
    public final void mo87947h1(ViewGroup viewGroup) {
        C63008c cVar = this.f178780A.get(viewGroup);
        if (cVar != null) {
            cVar.mo87962a();
            cVar.f178824s.getAndSet(false);
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "mount");
        super.mo8357i0();
        this.f178794q.mo86714j(this);
        for (C63008c cVar : this.f178780A.values()) {
            cVar.getClass();
            cVar.f178826u.addListener(new C63047v7(cVar));
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.f178781B).entrySet()) {
            ObjectAnimator objectAnimator = (ObjectAnimator) entry.getValue();
            ViewGroup viewGroup = (ViewGroup) entry.getKey();
            C63008c cVar2 = this.f178780A.get(entry.getKey());
            boolean z = cVar2 != null ? cVar2.f178807b : false;
            if (objectAnimator != null) {
                objectAnimator.addListener(new C63103x7(this, viewGroup, objectAnimator, z));
            }
        }
        for (Map.Entry entry2 : ((ConcurrentHashMap) this.f178782C).entrySet()) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) entry2.getValue();
            ViewGroup viewGroup2 = (ViewGroup) entry2.getKey();
            if (objectAnimator2 != null) {
                objectAnimator2.addListener(new C63125y7(this, viewGroup2));
            }
        }
        C61926c.m72693r(new C63021l(this));
        ((C0653a0) mo87696x0(C0653a0.class)).f1542f.observe(this, new C63022m(this));
    }

    /* renamed from: i1 */
    public final void mo87948i1(ViewGroup viewGroup) {
        C63008c cVar = this.f178780A.get(viewGroup);
        if (cVar != null) {
            cVar.f178824s.getAndSet(true);
        }
    }

    /* renamed from: j1 */
    public final Map.Entry<ViewGroup, C63008c> mo87949j1() {
        Map<ViewGroup, C63008c> map = this.f178780A;
        C87412m.m108594g(map, "<this>");
        List<T> s = C112354s.m153296s(C112354s.m153285h(C110818d0.m150897A(map.entrySet()), C63019j.f178862d));
        if (!s.isEmpty()) {
            return (Map.Entry) s.get(0);
        }
        return null;
    }

    /* renamed from: l1 */
    public final String mo87950l1(String str, C58321a aVar) {
        LinkedList<C59463a> linkedList;
        T t;
        C59464c value = ((C54963d0) mo87696x0(C54963d0.class)).f154077t.getValue();
        C59465f fVar = null;
        if (!(value == null || (linkedList = value.f169896a) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C59463a) t).mo84561a(), str)) {
                    break;
                }
            }
            C59463a aVar2 = (C59463a) t;
            if (aVar2 != null) {
                fVar = aVar2.f169895b;
            }
        }
        return str + '@' + aVar.ordinal() + '@' + (fVar != null ? fVar.f169901e : 1) + '@' + C61926c.m72696u(fVar != null ? fVar.f169905i : 0, 2);
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        if (r3 == false) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0250 A[SYNTHETIC] */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11992m0(java.util.LinkedHashMap<java.lang.String, android.graphics.Rect> r25) {
        /*
            r24 = this;
            r7 = r24
            java.lang.Class<ii1.e> r0 = ii1.C60291e.class
            java.lang.Class<cl1.o> r8 = cl1.C54991o.class
            java.lang.Class<cl1.c0> r1 = cl1.C54949c0.class
            java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
            java.lang.String r3 = "micUserMap"
            r4 = r25
            gy3.C87412m.m108594g(r4, r3)
            androidx.lifecycle.i0 r3 = r7.mo87696x0(r2)
            cl1.d0 r3 = (cl1.C54963d0) r3
            java.util.List<al1.j> r9 = r3.f154074q
            androidx.lifecycle.i0 r3 = r7.mo87696x0(r2)
            cl1.d0 r3 = (cl1.C54963d0) r3
            al1.j r10 = r3.f154073p
            java.lang.String r3 = "Finder.FinderLiveGiftQueuePlugin"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onMicUserChanged: micUserMap size:"
            r5.append(r6)
            int r6 = r25.size()
            r5.append(r6)
            java.lang.String r6 = ", audienceLinkMicUserList size:"
            r5.append(r6)
            int r6 = r9.size()
            r5.append(r6)
            java.lang.String r6 = ", pkMicUser:"
            r5.append(r6)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            int r3 = r25.size()
            r11 = 1
            if (r3 > r11) goto L_0x0084
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r0 = r7.f178785F
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0060:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0076
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r7.mo87959u1(r1)
            goto L_0x0060
        L_0x0076:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r0 = r7.f178785F
            r0.clear()
            java.util.concurrent.ConcurrentHashMap<android.view.ViewGroup, pi1.l> r0 = r7.f178786G
            r0.clear()
            r24.mo87944e1()
            return
        L_0x0084:
            androidx.lifecycle.i0 r3 = r7.mo87696x0(r1)
            cl1.c0 r3 = (cl1.C54949c0) r3
            dl1.a r12 = r3.f153997g
            androidx.lifecycle.i0 r2 = r7.mo87696x0(r2)
            cl1.d0 r2 = (cl1.C54963d0) r2
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r2 = r2.f154077t
            java.lang.Object r2 = r2.getValue()
            gi1.c r2 = (gi1.C59464c) r2
            int r3 = r25.size()
            androidx.lifecycle.i0 r5 = r7.mo87696x0(r1)
            cl1.c0 r5 = (cl1.C54949c0) r5
            if (r2 == 0) goto L_0x00a9
            int r6 = r2.f169898c
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            dl1.a r5 = r5.mo75863d3(r6, r3)
            r6 = 4
            if (r10 != 0) goto L_0x00b7
            int r14 = r7.f178791L
            if (r14 > r6) goto L_0x00b7
            if (r3 > r6) goto L_0x00bd
        L_0x00b7:
            int r14 = r7.f178791L
            if (r14 <= r6) goto L_0x00bf
            if (r3 > r6) goto L_0x00bf
        L_0x00bd:
            r3 = 1
            goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            dl1.a r6 = r7.f178790K
            if (r6 != r5) goto L_0x00d1
            if (r2 == 0) goto L_0x00cc
            int r6 = r2.f169898c
            if (r6 != r11) goto L_0x00cc
            r6 = 1
            goto L_0x00cd
        L_0x00cc:
            r6 = 0
        L_0x00cd:
            if (r6 != 0) goto L_0x00d1
            if (r3 == 0) goto L_0x011b
        L_0x00d1:
            java.lang.String r3 = "Finder.FinderLiveGiftQueuePlugin"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r15 = "onMicUserChanged clear old style mode: "
            r6.append(r15)
            if (r2 == 0) goto L_0x00e6
            int r15 = r2.f169898c
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x00e7
        L_0x00e6:
            r15 = 0
        L_0x00e7:
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r3 = r7.f178785F
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0111
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r7.mo87959u1(r6)
            goto L_0x00fb
        L_0x0111:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r3 = r7.f178785F
            r3.clear()
            java.util.concurrent.ConcurrentHashMap<android.view.ViewGroup, pi1.l> r3 = r7.f178786G
            r3.clear()
        L_0x011b:
            java.util.Set r3 = r25.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0123:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01bd
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r15 = r7.f178785F
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x013f:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0123
            java.lang.Object r16 = r15.next()
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            java.lang.Object r17 = r16.getKey()
            r14 = r17
            java.lang.String r14 = (java.lang.String) r14
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r11 = "checkUnregisterOuterSpace oldOutSpaceKey: "
            r13.append(r11)
            r13.append(r14)
            java.lang.String r11 = " micUserId: "
            r13.append(r11)
            r13.append(r6)
            java.lang.String r11 = r13.toString()
            java.lang.String r13 = "Finder.FinderLiveGiftQueuePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r11)
            java.lang.String r11 = "@"
            java.lang.String[] r19 = new java.lang.String[]{r11}
            r20 = 0
            r21 = 0
            r22 = 6
            r23 = 0
            r18 = r14
            java.util.List r11 = z04.C112550d0.m153785U(r18, r19, r20, r21, r22, r23)
            boolean r13 = r11.isEmpty()
            r18 = 1
            r13 = r13 ^ 1
            java.lang.String r18 = ""
            if (r13 == 0) goto L_0x0199
            r13 = 0
            java.lang.Object r11 = r11.get(r13)
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x019b
        L_0x0199:
            r11 = r18
        L_0x019b:
            if (r11 != 0) goto L_0x019f
            r11 = r18
        L_0x019f:
            boolean r11 = gy3.C87412m.m108589b(r11, r6)
            if (r11 == 0) goto L_0x01bb
            java.lang.String r11 = r7.mo87950l1(r6, r12)
            boolean r11 = gy3.C87412m.m108589b(r14, r11)
            if (r11 != 0) goto L_0x01bb
            java.lang.Object r11 = r16.getValue()
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r7.mo87959u1(r11)
            r15.remove()
        L_0x01bb:
            r11 = 1
            goto L_0x013f
        L_0x01bd:
            int r3 = r25.size()
            r7.f178791L = r3
            r7.f178790K = r5
            if (r2 == 0) goto L_0x023f
            int r3 = r2.f169898c
            r5 = 1
            if (r3 != r5) goto L_0x023f
            java.util.LinkedList<gi1.a> r1 = r2.f169896a
            java.util.Iterator r9 = r1.iterator()
        L_0x01d2:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0231
            java.lang.Object r1 = r9.next()
            gi1.a r1 = (gi1.C59463a) r1
            java.lang.String r10 = r1.mo84561a()
            al1.j r2 = r1.f169894a
            if (r2 == 0) goto L_0x01ea
            java.lang.String r2 = r2.f151999c
            if (r2 != 0) goto L_0x01f2
        L_0x01ea:
            androidx.lifecycle.i0 r2 = r7.mo87696x0(r8)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.f154345o
        L_0x01f2:
            r3 = r2
            qj1.c r2 = r7.mo87687E0(r0)
            ii1.e r2 = (ii1.C60291e) r2
            if (r2 == 0) goto L_0x01d2
            pi1.l r11 = r2.mo85277a1(r10)
            if (r11 == 0) goto L_0x01d2
            gi1.f r2 = r1.f169895b
            int r2 = r2.f169903g
            r4 = 1
            if (r2 != r4) goto L_0x020b
            android.widget.RelativeLayout r2 = r7.f178799v
            goto L_0x020f
        L_0x020b:
            android.view.ViewGroup r2 = r11.getGiftRootView()
        L_0x020f:
            r13 = r2
            gi1.f r1 = r1.f169895b
            int r1 = r1.f169903g
            r2 = 2
            if (r1 != r2) goto L_0x0219
            r5 = 1
            goto L_0x021a
        L_0x0219:
            r5 = 0
        L_0x021a:
            r6 = 0
            r1 = r24
            r2 = r13
            r4 = r5
            r1.mo87953o1(r2, r3, r4, r5, r6)
            java.lang.String r1 = r7.mo87950l1(r10, r12)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r2 = r7.f178785F
            r2.put(r1, r13)
            java.util.concurrent.ConcurrentHashMap<android.view.ViewGroup, pi1.l> r1 = r7.f178786G
            r1.put(r13, r11)
            goto L_0x01d2
        L_0x0231:
            android.widget.RelativeLayout r0 = r7.f178799v
            r7.mo87948i1(r0)
            android.widget.RelativeLayout r0 = r7.f178799v
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            goto L_0x0420
        L_0x023f:
            r24.mo87944e1()
            r2 = 0
            r7.mo87956r1(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r2 = r7.f178785F
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0250:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02c8
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.util.Map<android.view.ViewGroup, qj1.u7$c> r5 = r7.f178780A
            java.lang.Object r5 = r5.get(r3)
            qj1.u7$c r5 = (qj1.C63006u7.C63008c) r5
            if (r10 == 0) goto L_0x0280
            java.lang.String r6 = r10.f151999c
            if (r6 == 0) goto L_0x0280
            if (r5 == 0) goto L_0x0275
            java.lang.String r11 = r5.f178823r
            goto L_0x0276
        L_0x0275:
            r11 = 0
        L_0x0276:
            boolean r6 = r6.equals(r11)
            r11 = 1
            if (r6 != r11) goto L_0x0281
            r18 = 1
            goto L_0x0283
        L_0x0280:
            r11 = 1
        L_0x0281:
            r18 = 0
        L_0x0283:
            if (r18 != 0) goto L_0x0250
            androidx.lifecycle.i0 r6 = r7.mo87696x0(r8)
            cl1.o r6 = (cl1.C54991o) r6
            java.lang.String r6 = r6.f154345o
            if (r5 == 0) goto L_0x0292
            java.lang.String r13 = r5.f178823r
            goto L_0x0293
        L_0x0292:
            r13 = 0
        L_0x0293:
            boolean r6 = android.text.TextUtils.equals(r6, r13)
            if (r6 != 0) goto L_0x0250
            monitor-enter(r9)
            java.util.Iterator r6 = r9.iterator()     // Catch:{ all -> 0x02c5 }
        L_0x029e:
            boolean r13 = r6.hasNext()     // Catch:{ all -> 0x02c5 }
            if (r13 == 0) goto L_0x02ba
            java.lang.Object r13 = r6.next()     // Catch:{ all -> 0x02c5 }
            r14 = r13
            al1.j r14 = (al1.C54130j) r14     // Catch:{ all -> 0x02c5 }
            java.lang.String r14 = r14.f151999c     // Catch:{ all -> 0x02c5 }
            if (r5 == 0) goto L_0x02b2
            java.lang.String r15 = r5.f178823r     // Catch:{ all -> 0x02c5 }
            goto L_0x02b3
        L_0x02b2:
            r15 = 0
        L_0x02b3:
            boolean r14 = android.text.TextUtils.equals(r14, r15)     // Catch:{ all -> 0x02c5 }
            if (r14 == 0) goto L_0x029e
            goto L_0x02bb
        L_0x02ba:
            r13 = 0
        L_0x02bb:
            monitor-exit(r9)
            if (r13 != 0) goto L_0x0250
            r7.mo87959u1(r3)
            r2.remove()
            goto L_0x0250
        L_0x02c5:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x02c8:
            androidx.lifecycle.i0 r1 = r7.mo87696x0(r1)
            cl1.c0 r1 = (cl1.C54949c0) r1
            boolean r11 = r1.mo75866g3()
            java.util.Set r1 = r25.entrySet()
            java.util.Iterator r13 = r1.iterator()
        L_0x02da:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0420
            java.lang.Object r1 = r13.next()
            r14 = r1
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r1 = r14.getKey()
            if (r10 == 0) goto L_0x02f0
            java.lang.String r2 = r10.f151997a
            goto L_0x02f1
        L_0x02f0:
            r2 = 0
        L_0x02f1:
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x02f9
            r2 = r10
            goto L_0x031e
        L_0x02f9:
            monitor-enter(r9)
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x041d }
        L_0x02fe:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x041d }
            if (r2 == 0) goto L_0x031a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x041d }
            r3 = r2
            al1.j r3 = (al1.C54130j) r3     // Catch:{ all -> 0x041d }
            java.lang.Object r4 = r14.getKey()     // Catch:{ all -> 0x041d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x041d }
            java.lang.String r3 = r3.f151997a     // Catch:{ all -> 0x041d }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x041d }
            if (r3 == 0) goto L_0x02fe
            goto L_0x031b
        L_0x031a:
            r2 = 0
        L_0x031b:
            monitor-exit(r9)
            al1.j r2 = (al1.C54130j) r2
        L_0x031e:
            java.lang.Object r1 = r14.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r15 = r7.mo87950l1(r1, r12)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r1 = r7.f178785F
            boolean r1 = r1.containsKey(r15)
            if (r1 == 0) goto L_0x035f
            java.lang.String r1 = "Finder.FinderLiveGiftQueuePlugin"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onNormalMicUserChange: adjustContainerLocation, sdkUserId = "
            r3.append(r4)
            java.lang.Object r4 = r14.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r1 = r7.f178785F
            java.lang.Object r1 = r1.get(r15)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.Object r3 = r14.getValue()
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            r7.mo87940a1(r1, r3, r2)
            goto L_0x02da
        L_0x035f:
            if (r2 == 0) goto L_0x0365
            java.lang.String r1 = r2.f151999c
            if (r1 != 0) goto L_0x036d
        L_0x0365:
            androidx.lifecycle.i0 r1 = r7.mo87696x0(r8)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.f154345o
        L_0x036d:
            r3 = r1
            qj1.c r1 = r7.mo87687E0(r0)
            ii1.e r1 = (ii1.C60291e) r1
            if (r1 == 0) goto L_0x0413
            java.lang.Object r4 = r14.getKey()
            java.lang.String r4 = (java.lang.String) r4
            pi1.l r6 = r1.mo85277a1(r4)
            if (r6 == 0) goto L_0x0413
            if (r11 == 0) goto L_0x038f
            android.view.ViewGroup r1 = r6.getGiftRootView()
            r16 = r0
            r0 = r1
            r18 = r8
            r8 = 0
            goto L_0x03bd
        L_0x038f:
            java.lang.Object r1 = r14.getValue()
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            android.view.ViewGroup r4 = r7.f178795r
            android.content.Context r5 = r4.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r16 = r0
            r0 = 2131494950(0x7f0c0826, float:1.8613423E38)
            r18 = r8
            r8 = 0
            android.view.View r0 = r5.inflate(r0, r4, r8)
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r0, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.addView(r0)
            r7.mo87940a1(r0, r1, r2)
            r1 = 8
            r0.setVisibility(r1)
        L_0x03bd:
            java.lang.Object r1 = r14.getValue()
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            int r17 = r1.width()
            r4 = 1
            r1 = r24
            r2 = r0
            r5 = r11
            r8 = r6
            r6 = r17
            r1.mo87953o1(r2, r3, r4, r5, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r1 = r7.f178785F
            r1.put(r15, r0)
            java.util.concurrent.ConcurrentHashMap<android.view.ViewGroup, pi1.l> r1 = r7.f178786G
            r1.put(r0, r8)
            java.lang.String r1 = "Finder.FinderLiveGiftQueuePlugin"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onNormalMicUserChange: outerSpaceMap add new entry, key = "
            r2.append(r3)
            java.lang.Object r3 = r14.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = ", value = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", outSpaceWidth:"
            r2.append(r0)
            java.lang.Object r0 = r14.getValue()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r0 = r0.width()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x0417
        L_0x0413:
            r16 = r0
            r18 = r8
        L_0x0417:
            r0 = r16
            r8 = r18
            goto L_0x02da
        L_0x041d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0420:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63006u7.mo11992m0(java.util.LinkedHashMap):void");
    }

    /* renamed from: m1 */
    public final void mo87951m1(ViewGroup viewGroup, C61788m.C11208b bVar) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        if (viewGroup != null && bVar != null) {
            C63008c cVar = this.f178780A.get(viewGroup);
            boolean z = false;
            if (!(cVar == null || (atomicBoolean3 = cVar.f178808c) == null || true != atomicBoolean3.get())) {
                z = true;
            }
            if (z) {
                C61926c.m72668M(new C63158z7(this, viewGroup, bVar));
                return;
            }
            C63008c cVar2 = this.f178780A.get(viewGroup);
            if (!(cVar2 == null || (atomicBoolean2 = cVar2.f178808c) == null)) {
                atomicBoolean2.getAndSet(true);
            }
            C63008c cVar3 = this.f178780A.get(viewGroup);
            if (!(cVar3 == null || (atomicBoolean = cVar3.f178810e) == null)) {
                atomicBoolean.getAndSet(bVar.f33047n);
            }
            C63008c cVar4 = this.f178780A.get(viewGroup);
            if (cVar4 != null) {
                String str = bVar.f33044h;
                if (str == null) {
                    str = "";
                }
                cVar4.f178812g = str;
            }
            C61926c.m72668M(new C63020k(viewGroup, this, bVar));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: n1 */
    public final synchronized void mo87952n1() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.Class<cl1.a0> r0 = cl1.C0653a0.class
            androidx.lifecycle.i0 r0 = r10.mo87696x0(r0)     // Catch:{ all -> 0x0205 }
            cl1.a0 r0 = (cl1.C0653a0) r0     // Catch:{ all -> 0x0205 }
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r0 = r0.f1542f     // Catch:{ all -> 0x0205 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0205 }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r0     // Catch:{ all -> 0x0205 }
            if (r0 == 0) goto L_0x0029
            java.lang.String r1 = "Finder.FinderLiveGiftQueuePlugin"
            java.lang.String r2 = "[pollNextGiftShowInfo] show notify"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0205 }
            monitor-enter(r10)     // Catch:{ all -> 0x0205 }
            qj1.c8 r1 = new qj1.c8     // Catch:{ all -> 0x0026 }
            r1.<init>(r10, r0)     // Catch:{ all -> 0x0026 }
            o40.C61926c.m72668M(r1)     // Catch:{ all -> 0x0026 }
            monitor-exit(r10)     // Catch:{ all -> 0x0205 }
            monitor-exit(r10)
            return
        L_0x0026:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0205 }
            throw r0     // Catch:{ all -> 0x0205 }
        L_0x0029:
            java.util.Map$Entry r0 = r10.mo87949j1()     // Catch:{ all -> 0x0205 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r3 == 0) goto L_0x0064
            if (r0 == 0) goto L_0x0064
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x0205 }
            qj1.u7$c r3 = (qj1.C63006u7.C63008c) r3     // Catch:{ all -> 0x0205 }
            boolean r3 = r3.f178811f     // Catch:{ all -> 0x0205 }
            if (r3 == 0) goto L_0x0043
            goto L_0x0064
        L_0x0043:
            nk1.m r3 = r10.f178794q     // Catch:{ all -> 0x0205 }
            nk1.m$c r3 = r3.mo86711h()     // Catch:{ all -> 0x0205 }
            if (r3 != 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            nk1.m$c r4 = nk1.C61788m.C11209c.SELF_NORMAL_GIFT_COMBO     // Catch:{ all -> 0x0205 }
            int r3 = r3.compareTo(r4)     // Catch:{ all -> 0x0205 }
            if (r3 < 0) goto L_0x0055
            goto L_0x0064
        L_0x0055:
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x0205 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x0205 }
            nk1.m r3 = r10.f178794q     // Catch:{ all -> 0x0205 }
            nk1.m$b r3 = r3.poll()     // Catch:{ all -> 0x0205 }
            r10.mo87954p1(r0, r3)     // Catch:{ all -> 0x0205 }
        L_0x0064:
            java.util.Map<android.view.ViewGroup, qj1.u7$c> r0 = r10.f178780A     // Catch:{ all -> 0x0205 }
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0205 }
            r3.<init>()     // Catch:{ all -> 0x0205 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0205 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0205 }
        L_0x0073:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0205 }
            if (r4 == 0) goto L_0x0099
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0205 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0205 }
            java.lang.Object r5 = r4.getValue()     // Catch:{ all -> 0x0205 }
            qj1.u7$c r5 = (qj1.C63006u7.C63008c) r5     // Catch:{ all -> 0x0205 }
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f178824s     // Catch:{ all -> 0x0205 }
            boolean r5 = r5.get()     // Catch:{ all -> 0x0205 }
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x0205 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0205 }
            r3.put(r5, r4)     // Catch:{ all -> 0x0205 }
            goto L_0x0073
        L_0x0099:
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x0205 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0205 }
        L_0x00a1:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0205 }
            if (r3 == 0) goto L_0x0203
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0205 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0205 }
            java.lang.String r4 = "Finder.FinderLiveGiftQueuePlugin"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0205 }
            r5.<init>()     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = "pollNextGiftShowInfo: index = "
            r5.append(r6)     // Catch:{ all -> 0x0205 }
            java.lang.Object r6 = r3.getValue()     // Catch:{ all -> 0x0205 }
            qj1.u7$c r6 = (qj1.C63006u7.C63008c) r6     // Catch:{ all -> 0x0205 }
            int r6 = r6.f178806a     // Catch:{ all -> 0x0205 }
            r5.append(r6)     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = ", current bulletInfo = "
            r5.append(r6)     // Catch:{ all -> 0x0205 }
            java.util.Map<android.view.ViewGroup, qj1.u7$c> r6 = r10.f178780A     // Catch:{ all -> 0x0205 }
            r5.append(r6)     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = ", current gift queue size: "
            r5.append(r6)     // Catch:{ all -> 0x0205 }
            nk1.m r6 = r10.f178794q     // Catch:{ all -> 0x0205 }
            int r6 = r6.size()     // Catch:{ all -> 0x0205 }
            r5.append(r6)     // Catch:{ all -> 0x0205 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0205 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x0205 }
            nk1.m r4 = r10.f178794q     // Catch:{ all -> 0x0205 }
            boolean r4 = r4.hasNext()     // Catch:{ all -> 0x0205 }
            if (r4 != 0) goto L_0x00ed
            monitor-exit(r10)
            return
        L_0x00ed:
            java.util.Map$Entry r4 = r10.mo87949j1()     // Catch:{ all -> 0x0205 }
            if (r4 == 0) goto L_0x00f5
            r4 = 1
            goto L_0x00f6
        L_0x00f5:
            r4 = 0
        L_0x00f6:
            java.lang.String r5 = "Finder.FinderLiveGiftQueuePlugin"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0205 }
            r6.<init>()     // Catch:{ all -> 0x0205 }
            java.lang.String r7 = "pollNextGiftShowInfo: isPreciousGiftShowing = "
            r6.append(r7)     // Catch:{ all -> 0x0205 }
            r6.append(r4)     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0205 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x0205 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.view.ViewGroup> r5 = r10.f178785F     // Catch:{ all -> 0x0205 }
            java.lang.Object r6 = r3.getKey()     // Catch:{ all -> 0x0205 }
            boolean r5 = r5.containsValue(r6)     // Catch:{ all -> 0x0205 }
            if (r5 == 0) goto L_0x0121
            if (r4 != 0) goto L_0x0121
            boolean r5 = r10.mo87942c1(r3)     // Catch:{ all -> 0x0205 }
            if (r5 == 0) goto L_0x0121
            goto L_0x00a1
        L_0x0121:
            java.util.Map<android.view.ViewGroup, qj1.u7$c> r5 = r10.f178780A     // Catch:{ all -> 0x0205 }
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0205 }
            r6.<init>()     // Catch:{ all -> 0x0205 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x0205 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0205 }
        L_0x0130:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0205 }
            if (r7 == 0) goto L_0x0163
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0205 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x0205 }
            java.lang.Object r8 = r7.getValue()     // Catch:{ all -> 0x0205 }
            qj1.u7$c r8 = (qj1.C63006u7.C63008c) r8     // Catch:{ all -> 0x0205 }
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f178824s     // Catch:{ all -> 0x0205 }
            boolean r9 = r9.get()     // Catch:{ all -> 0x0205 }
            if (r9 == 0) goto L_0x0154
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f178808c     // Catch:{ all -> 0x0205 }
            boolean r8 = r8.get()     // Catch:{ all -> 0x0205 }
            if (r8 == 0) goto L_0x0154
            r8 = 1
            goto L_0x0155
        L_0x0154:
            r8 = 0
        L_0x0155:
            if (r8 == 0) goto L_0x0130
            java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x0205 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0205 }
            r6.put(r8, r7)     // Catch:{ all -> 0x0205 }
            goto L_0x0130
        L_0x0163:
            java.util.Set r5 = r6.entrySet()     // Catch:{ all -> 0x0205 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0205 }
        L_0x016b:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0205 }
            if (r6 == 0) goto L_0x0198
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0205 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x0205 }
            nk1.m r7 = r10.f178794q     // Catch:{ all -> 0x0205 }
            java.lang.Object r8 = r6.getValue()     // Catch:{ all -> 0x0205 }
            qj1.u7$c r8 = (qj1.C63006u7.C63008c) r8     // Catch:{ all -> 0x0205 }
            java.lang.String r8 = r8.f178812g     // Catch:{ all -> 0x0205 }
            nk1.m$b r7 = r7.mo86707d(r8)     // Catch:{ all -> 0x0205 }
            if (r7 == 0) goto L_0x016b
            java.lang.Object r6 = r6.getKey()     // Catch:{ all -> 0x0205 }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x0205 }
            if (r6 == 0) goto L_0x016b
            qj1.z7 r8 = new qj1.z7     // Catch:{ all -> 0x0205 }
            r8.<init>(r10, r6, r7)     // Catch:{ all -> 0x0205 }
            o40.C61926c.m72668M(r8)     // Catch:{ all -> 0x0205 }
            goto L_0x016b
        L_0x0198:
            java.lang.Object r5 = r3.getValue()     // Catch:{ all -> 0x0205 }
            qj1.u7$c r5 = (qj1.C63006u7.C63008c) r5     // Catch:{ all -> 0x0205 }
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f178808c     // Catch:{ all -> 0x0205 }
            boolean r5 = r5.get()     // Catch:{ all -> 0x0205 }
            if (r5 == 0) goto L_0x01a8
            goto L_0x00a1
        L_0x01a8:
            if (r4 == 0) goto L_0x01b9
            nk1.m r5 = r10.f178794q     // Catch:{ all -> 0x0205 }
            java.lang.Object r6 = r3.getValue()     // Catch:{ all -> 0x0205 }
            qj1.u7$c r6 = (qj1.C63006u7.C63008c) r6     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = r6.f178823r     // Catch:{ all -> 0x0205 }
            nk1.m$b r5 = r5.mo86710g(r6)     // Catch:{ all -> 0x0205 }
            goto L_0x01c7
        L_0x01b9:
            nk1.m r5 = r10.f178794q     // Catch:{ all -> 0x0205 }
            java.lang.Object r6 = r3.getValue()     // Catch:{ all -> 0x0205 }
            qj1.u7$c r6 = (qj1.C63006u7.C63008c) r6     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = r6.f178823r     // Catch:{ all -> 0x0205 }
            nk1.m$b r5 = r5.mo86705c(r6)     // Catch:{ all -> 0x0205 }
        L_0x01c7:
            if (r5 != 0) goto L_0x01cb
            goto L_0x00a1
        L_0x01cb:
            java.lang.String r6 = "Finder.FinderLiveGiftQueuePlugin"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0205 }
            r7.<init>()     // Catch:{ all -> 0x0205 }
            java.lang.String r8 = "pollNextGiftShowInfo: giftShowInfo = "
            r7.append(r8)     // Catch:{ all -> 0x0205 }
            r7.append(r5)     // Catch:{ all -> 0x0205 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0205 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x0205 }
            java.lang.Object r6 = r3.getValue()     // Catch:{ all -> 0x0205 }
            qj1.u7$c r6 = (qj1.C63006u7.C63008c) r6     // Catch:{ all -> 0x0205 }
            boolean r6 = r6.f178819n     // Catch:{ all -> 0x0205 }
            if (r6 == 0) goto L_0x01f3
            if (r4 != 0) goto L_0x00a1
            boolean r4 = r5.f33047n     // Catch:{ all -> 0x0205 }
            if (r4 != 0) goto L_0x01f3
            goto L_0x00a1
        L_0x01f3:
            java.lang.Object r3 = r3.getKey()     // Catch:{ all -> 0x0205 }
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ all -> 0x0205 }
            r10.mo87951m1(r3, r5)     // Catch:{ all -> 0x0205 }
            nk1.m r3 = r10.f178794q     // Catch:{ all -> 0x0205 }
            r3.mo86702a(r5)     // Catch:{ all -> 0x0205 }
            goto L_0x00a1
        L_0x0203:
            monitor-exit(r10)
            return
        L_0x0205:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63006u7.mo87952n1():void");
    }

    /* renamed from: o1 */
    public final void mo87953o1(ViewGroup viewGroup, String str, boolean z, boolean z2, int i) {
        FinderLiveGiftTextView finderLiveGiftTextView;
        ViewGroup viewGroup2 = viewGroup;
        String str2 = str;
        boolean z3 = z;
        if (this.f178780A.size() == this.f178803z) {
            Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "registerOuterSpace: disable origin three container");
            Map.Entry<ViewGroup, C63008c> j1 = mo87949j1();
            mo87941b1(j1 != null ? j1.getValue() : null);
            mo87947h1(this.f178799v);
            mo87947h1(this.f178800w);
            mo87947h1(this.f178801x);
        }
        Map<ViewGroup, C63008c> map = this.f178780A;
        C63008c cVar = r0;
        C63008c cVar2 = new C63008c(this, viewGroup, map.size(), this.f178796s, false, z, z2, i, 8, (C8480h) null);
        C63008c cVar3 = cVar;
        cVar3.f178826u.addListener(new C63047v7(cVar3));
        map.put(viewGroup2, cVar3);
        C63008c cVar4 = this.f178780A.get(viewGroup2);
        if (cVar4 != null) {
            C87412m.m108594g(str2, "<set-?>");
            cVar4.f178823r = str2;
        }
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "registerOuterSpace isCustomMode: " + z2 + " : info:" + this.f178780A.get(viewGroup2));
        Map<ViewGroup, ObjectAnimator> map2 = this.f178781B;
        boolean z4 = z;
        ObjectAnimator f1 = mo87945f1(viewGroup2, z4);
        f1.addListener(new C63103x7(this, viewGroup2, f1, z4));
        ((ConcurrentHashMap) map2).put(viewGroup2, f1);
        Map<ViewGroup, ObjectAnimator> map3 = this.f178782C;
        ObjectAnimator g1 = mo87946g1(viewGroup2, z4);
        g1.addListener(new C63125y7(this, viewGroup2));
        ((ConcurrentHashMap) map3).put(viewGroup2, g1);
        C63008c cVar5 = this.f178780A.get(viewGroup2);
        if (cVar5 != null && (finderLiveGiftTextView = cVar5.f178817l.f178845h) != null) {
            C62042e.f176370a.mo87033P1(finderLiveGiftTextView);
        }
    }

    /* renamed from: p1 */
    public final void mo87954p1(ViewGroup viewGroup, C61788m.C11208b bVar) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        if (viewGroup != null && bVar != null) {
            Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "replaceBullet, originSpace BulletShowingInfo=" + this.f178780A.get(viewGroup) + ", giftShowInfo=" + bVar);
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = viewGroup;
            String str = bVar.f33051r;
            C63008c cVar = this.f178780A.get(viewGroup);
            if (!str.equals(cVar != null ? cVar.f178823r : null)) {
                Map<ViewGroup, C63008c> map = this.f178780A;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry next : map.entrySet()) {
                    if (((C63008c) next.getValue()).f178823r.equals(bVar.f33051r)) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry key : linkedHashMap.entrySet()) {
                    arrayList.add((ViewGroup) key.getKey());
                }
                if (!arrayList.isEmpty()) {
                    f0Var.f27484d = arrayList.get(0);
                } else {
                    return;
                }
            }
            if (!C87412m.m108589b(f0Var.f27484d, viewGroup)) {
                Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "replaceBullet, targetSpace BulletShowingInfo=" + this.f178780A.get(f0Var.f27484d));
                C63008c cVar2 = this.f178780A.get(viewGroup);
                if (cVar2 != null) {
                    cVar2.mo87962a();
                }
            }
            C63008c cVar3 = this.f178780A.get(f0Var.f27484d);
            if (cVar3 != null) {
                cVar3.mo87962a();
            }
            C63008c cVar4 = this.f178780A.get(f0Var.f27484d);
            if (!(cVar4 == null || (atomicBoolean2 = cVar4.f178808c) == null)) {
                atomicBoolean2.getAndSet(true);
            }
            C63008c cVar5 = this.f178780A.get(f0Var.f27484d);
            if (!(cVar5 == null || (atomicBoolean = cVar5.f178810e) == null)) {
                atomicBoolean.getAndSet(bVar.f33047n);
            }
            C63008c cVar6 = this.f178780A.get(f0Var.f27484d);
            if (cVar6 != null) {
                String str2 = bVar.f33044h;
                if (str2 == null) {
                    str2 = "";
                }
                cVar6.f178812g = str2;
            }
            C61926c.m72668M(new C63024o(this, f0Var, viewGroup, bVar));
        }
    }

    /* renamed from: q1 */
    public final long mo87955q1(String str) {
        C32444a aVar = C32444a.f86121a;
        long longValue = C32444a.f86158j0.mo60266n().longValue();
        C0639y1 y1Var = C0639y1.f1510a;
        HashMap<String, Long> hashMap = C0639y1.f1521l;
        Long l = hashMap.get(str);
        long longValue2 = l != null ? l.longValue() / 1000 : longValue;
        if (0 != longValue2) {
            return longValue2;
        }
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "updatePreciousGiftTotalShowingTime: giftFullPagDurationMap id:" + str + ", value = " + hashMap.get(str));
        return longValue;
    }

    /* renamed from: r1 */
    public final void mo87956r1(int i) {
        this.f178792M = i;
        C39818r rVar = C39818r.f106831a;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        if (((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e) {
            i = 8;
        }
        this.f178795r.setVisibility(i);
    }

    /* renamed from: s */
    public void mo84240s(C61788m.C11209c cVar, List<C61788m.C11208b> list) {
        C87412m.m108594g(cVar, "giftType");
        C87412m.m108594g(list, "appendList");
        C61926c.m72668M(new C63023n(this));
        mo87952n1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r7.f33043g;
     */
    /* renamed from: s1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87957s1(nk1.C61788m.C11208b r7, boolean r8) {
        /*
            r6 = this;
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            r1 = 0
            if (r7 == 0) goto L_0x000c
            te3.ju0 r2 = r7.f33043g
            if (r2 == 0) goto L_0x000c
            java.lang.String r2 = r2.f136329d
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            if (r7 == 0) goto L_0x0012
            te3.v11 r3 = r7.f33053t
            goto L_0x0013
        L_0x0012:
            r3 = r1
        L_0x0013:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "showFullScreenPreciousGift giftId:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " targetUsername:"
            r4.append(r5)
            if (r7 == 0) goto L_0x002b
            java.lang.String r5 = r7.f33051r
            goto L_0x002c
        L_0x002b:
            r5 = r1
        L_0x002c:
            r4.append(r5)
            java.lang.String r5 = " curPkUser:"
            r4.append(r5)
            androidx.lifecycle.i0 r5 = r6.mo87696x0(r0)
            cl1.d0 r5 = (cl1.C54963d0) r5
            al1.j r5 = r5.f154073p
            if (r5 == 0) goto L_0x0041
            java.lang.String r5 = r5.f151999c
            goto L_0x0042
        L_0x0041:
            r5 = r1
        L_0x0042:
            r4.append(r5)
            java.lang.String r5 = " randomItem:"
            r4.append(r5)
            if (r3 == 0) goto L_0x0059
            java.util.LinkedList<te3.w11> r5 = r3.f143244e
            if (r5 == 0) goto L_0x0059
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x005a
        L_0x0059:
            r5 = r1
        L_0x005a:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Finder.FinderLiveGiftQueuePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            if (r7 == 0) goto L_0x006b
            java.lang.String r4 = r7.f33051r
            goto L_0x006c
        L_0x006b:
            r4 = r1
        L_0x006c:
            androidx.lifecycle.i0 r0 = r6.mo87696x0(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.f154073p
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = r0.f151999c
        L_0x0078:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r1)
            if (r0 != 0) goto L_0x00da
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "PARAM_LIVE_GIFT_INFO"
            r0.putString(r1, r2)
            if (r7 == 0) goto L_0x008e
            java.lang.String r1 = r7.f33044h
            if (r1 != 0) goto L_0x0090
        L_0x008e:
            java.lang.String r1 = ""
        L_0x0090:
            java.lang.String r2 = "PARAM_LIVE_GIFT_COMBO_ID"
            r0.putString(r2, r1)
            r1 = 0
            if (r7 == 0) goto L_0x00a3
            te3.ju0 r2 = r7.f33043g
            if (r2 == 0) goto L_0x00a3
            te3.bz0 r2 = r2.f136336n
            if (r2 == 0) goto L_0x00a3
            int r2 = r2.f131399d
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            java.lang.String r4 = "PARAM_LIVE_GIFT_GESTURE_ID"
            r0.putInt(r4, r2)
            java.lang.String r2 = "PARAM_LIVE_GIFT_IS_FORCE_REPLACE"
            r0.putBoolean(r2, r8)
            if (r7 == 0) goto L_0x00b3
            boolean r7 = r7.f33049p
            goto L_0x00b4
        L_0x00b3:
            r7 = 0
        L_0x00b4:
            java.lang.String r8 = "PARAM_LIVE_GIFT_IS_FROM_SELF"
            r0.putBoolean(r8, r7)
            r7 = 1
            if (r3 == 0) goto L_0x00c8
            java.util.LinkedList<te3.w11> r8 = r3.f143244e
            if (r8 == 0) goto L_0x00c8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r7
            if (r8 != r7) goto L_0x00c8
            r1 = 1
        L_0x00c8:
            if (r1 == 0) goto L_0x00d3
            byte[] r7 = r3.toByteArray()
            java.lang.String r8 = "PARAM_LIVE_GIFT_RANDOM_ITEM"
            r0.putByteArray(r8, r7)
        L_0x00d3:
            d60.b r7 = r6.f178793p
            d60.b$b r8 = d60.C58124b.C58125b.LIVE_EVENT_SHOW_FULL_SCREEN_GIFT
            r7.statusChange(r8, r0)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63006u7.mo87957s1(nk1.m$b, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r10v6, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo87958t1(int r9, int r10, android.widget.TextView r11, java.lang.String r12) {
        /*
            r8 = this;
            int r9 = r9 - r10
            int r10 = r11.getPaddingLeft()
            int r9 = r9 - r10
            int r10 = r11.getPaddingRight()
            int r9 = r9 - r10
            android.view.ViewParent r10 = r11.getParent()
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            goto L_0x0018
        L_0x0017:
            r10 = r1
        L_0x0018:
            r0 = 0
            if (r10 == 0) goto L_0x0020
            int r10 = r10.getPaddingLeft()
            goto L_0x0021
        L_0x0020:
            r10 = 0
        L_0x0021:
            int r9 = r9 - r10
            android.view.ViewParent r10 = r11.getParent()
            boolean r2 = r10 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x002d
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            int r0 = r1.getPaddingRight()
        L_0x0033:
            int r9 = r9 - r0
            int r3 = r9 + -6
            if (r3 <= 0) goto L_0x004f
            android.text.StaticLayout r9 = new android.text.StaticLayout
            android.text.TextPaint r2 = r11.getPaint()
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1
            r0 = r9
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r9 = r9.getLineCount()
            return r9
        L_0x004f:
            r9 = 2147483647(0x7fffffff, float:NaN)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63006u7.mo87958t1(int, int, android.widget.TextView, java.lang.String):int");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        boolean z = true;
        if (C63016g.f178857a[bVar.ordinal()] == 1) {
            if (bundle == null || !bundle.getBoolean("isShow")) {
                z = false;
            }
            if (z) {
                mo10792g(8);
            } else {
                mo10792g(0);
            }
        }
    }

    /* renamed from: u1 */
    public final void mo87959u1(ViewGroup viewGroup) {
        if (this.f178780A.containsKey(viewGroup)) {
            C63008c cVar = this.f178780A.get(viewGroup);
            mo87941b1(cVar);
            if (cVar != null) {
                cVar.f178826u.removeAllListeners();
            }
            Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "unregisterOuterSpace: info:" + cVar);
            this.f178780A.remove(viewGroup);
            ObjectAnimator objectAnimator = (ObjectAnimator) ((ConcurrentHashMap) this.f178781B).get(viewGroup);
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
            }
            ((ConcurrentHashMap) this.f178781B).remove(viewGroup);
            ObjectAnimator objectAnimator2 = (ObjectAnimator) ((ConcurrentHashMap) this.f178782C).get(viewGroup);
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
            }
            ((ConcurrentHashMap) this.f178782C).remove(viewGroup);
            this.f178795r.removeView(viewGroup);
            if (this.f178780A.size() == this.f178803z) {
                Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "unregisterOuterSpace: enable origin three container");
                mo87948i1(this.f178799v);
                mo87948i1(this.f178800w);
                mo87948i1(this.f178801x);
                mo87956r1(8);
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "unMount");
        super.mo3211w0();
        this.f178787H.stopTimer();
        C61926c.m72668M(new C63027q(this));
        this.f178794q.mo86709f(this);
        for (C63008c cVar : this.f178780A.values()) {
            cVar.f178826u.removeAllListeners();
        }
        for (Map.Entry value : ((ConcurrentHashMap) this.f178781B).entrySet()) {
            ((ObjectAnimator) value.getValue()).removeAllListeners();
        }
        for (Map.Entry value2 : ((ConcurrentHashMap) this.f178782C).entrySet()) {
            ((ObjectAnimator) value2.getValue()).removeAllListeners();
        }
    }

    /* renamed from: w1 */
    public final void mo87960w1(String str, C63008c cVar, int i, C61788m.C11208b bVar) {
        LinkedList<C51769w11> linkedList;
        C51628v11 v112;
        LinkedList<C51769w11> linkedList2;
        long q1 = mo87955q1(str);
        if (cVar.f178814i) {
            cVar.f178820o = q1;
        } else {
            boolean z = false;
            if (!(bVar == null || (v112 = bVar.f33053t) == null || (linkedList2 = v112.f143244e) == null || !(!linkedList2.isEmpty()))) {
                z = true;
            }
            if (z) {
                C51628v11 v113 = bVar.f33053t;
                if (!(v113 == null || (linkedList = v113.f143244e) == null)) {
                    for (C51769w11 w112 : linkedList) {
                        C0639y1 y1Var = C0639y1.f1510a;
                        C87412m.m108593f(w112, LocaleUtil.ITALIAN);
                        long q15 = mo87955q1(y1Var.mo610b(str, w112));
                        cVar.f178820o += q15;
                        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "updatePreciousGiftTotalShowingTime random gift: " + q15 + "ms, giftId:" + str + ", animationId:" + w112.f143810d);
                    }
                }
            } else {
                cVar.f178820o += ((long) i) * q1;
            }
        }
        Log.m105924i("Finder.FinderLiveGiftQueuePlugin", "updatePreciousGiftTotalShowingTime: giftId=" + str + ", durationMs=" + q1 + ", totalShowingTime=" + cVar.f178820o + " isFromBatchSend=" + cVar.f178814i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C63006u7(ViewGroup viewGroup, C58124b bVar, C61788m mVar, ViewGroup viewGroup2, boolean z, int i, C8480h hVar) {
        this(viewGroup, bVar, mVar, viewGroup2, (i & 16) != 0 ? false : z);
    }
}
