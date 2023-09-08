package rs1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C113200q;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderNewStyleTimelineUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.HorizontalVideoPreviewLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.plugin.thumbplayer.render.MMSurfaceViewRender;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import df1.C58259c;
import dp1.C7435f2;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7642k;
import er1.C58784w3;
import er1.C7919x;
import fy3.C32224a;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import up1.C37521f;
import we0.C53156a;

@C113200q(initialMode = 2)
/* renamed from: rs1.y3 */
public final class C13539y3 extends UIComponent {

    /* renamed from: C */
    public static boolean f38388C;

    /* renamed from: A */
    public final C53156a f38389A;

    /* renamed from: B */
    public final C58555d f38390B;

    /* renamed from: d */
    public final C13601g f38391d;

    /* renamed from: e */
    public ViewGroup f38392e;

    /* renamed from: f */
    public int f38393f = -1;

    /* renamed from: g */
    public ViewGroup.LayoutParams f38394g;

    /* renamed from: h */
    public View f38395h;

    /* renamed from: i */
    public int f38396i = -1;

    /* renamed from: j */
    public C60905o f38397j;

    /* renamed from: n */
    public C60905o f38398n;

    /* renamed from: o */
    public int f38399o = 1;

    /* renamed from: p */
    public int f38400p = -1;

    /* renamed from: q */
    public int f38401q;

    /* renamed from: r */
    public boolean f38402r;

    /* renamed from: s */
    public boolean f38403s;

    /* renamed from: t */
    public boolean f38404t;

    /* renamed from: u */
    public boolean f38405u;

    /* renamed from: v */
    public int f38406v;

    /* renamed from: w */
    public boolean f38407w = true;

    /* renamed from: x */
    public boolean f38408x;

    /* renamed from: y */
    public Boolean f38409y;

    /* renamed from: z */
    public final C13601g f38410z = C36568h.m40985a(C13546e.f38426d);

    /* renamed from: rs1.y3$a */
    public final class C13540a extends HorizontalVideoPreviewLayout {

        /* renamed from: A */
        public View f38411A;

        /* renamed from: B */
        public final View f38412B;

        /* renamed from: C */
        public AnimatorSet f38413C;

        /* renamed from: D */
        public final C13601g f38414D = C36568h.m40985a(new C13542b(this));

        /* renamed from: E */
        public float f38415E;

        /* renamed from: F */
        public final /* synthetic */ C13539y3 f38416F;

        /* renamed from: z */
        public final View f38417z;

        /* renamed from: rs1.y3$a$a */
        public static final class C13541a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C13539y3 f38418d;

            public C13541a(C13539y3 y3Var) {
                this.f38418d = y3Var;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C13539y3 y3Var = this.f38418d;
                y3Var.getContext().setRequestedOrientation(1);
                y3Var.f38406v = 1;
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: rs1.y3$a$b */
        public static final class C13542b extends C87413o implements C32224a<Vibrator> {

            /* renamed from: d */
            public final /* synthetic */ C13540a f38419d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13542b(C13540a aVar) {
                super(0);
                this.f38419d = aVar;
            }

            public Object invoke() {
                Object systemService = this.f38419d.getContext().getSystemService("vibrator");
                if (systemService instanceof Vibrator) {
                    return (Vibrator) systemService;
                }
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13540a(C13539y3 y3Var, Context context) {
            super(context);
            TextView textView;
            TextView textView2;
            TextView textView3;
            C87412m.m108594g(context, "context");
            this.f38416F = y3Var;
            int dimension = (int) getResources().getDimension(C0966R.dimen.f3745cw);
            int dimension2 = (int) getResources().getDimension(C0966R.dimen.f3743cv);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension, dimension);
            layoutParams.topMargin = dimension2;
            layoutParams.setMarginStart(dimension2);
            layoutParams.gravity = 8388611;
            getIconLayout().setLayoutParams(layoutParams);
            getIconLayout().setOnClickListener(new C13541a(y3Var));
            View view = new View(getContext());
            this.f38417z = view;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 1);
            layoutParams2.topMargin = getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
            C13598b0 b0Var = C13598b0.f38549a;
            addView(view, layoutParams2);
            View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d6d, (ViewGroup) null);
            C87412m.m108593f(inflate, "getInflater(context).inf…d_play_hint_layout, null)");
            this.f38412B = inflate;
            addView(inflate);
            View findViewById = inflate.findViewById(C0966R.C0970id.l5q);
            C87412m.m108593f(findViewById, "speedPlayHintLayout.find…inder_speed_play_hint_tv)");
            C7919x.m8091a((TextView) findViewById);
            if (getContext() instanceof FinderNewStyleTimelineUI) {
                View inflate2 = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.cyt, (ViewGroup) null);
                this.f38411A = inflate2;
                addView(inflate2, new FrameLayout.LayoutParams(-1, -1));
                View view2 = this.f38411A;
                if (view2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout", "<init>", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC;Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout", "<init>", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC;Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view4 = this.f38411A;
                if (!(view4 == null || (textView3 = (TextView) view4.findViewById(C0966R.C0970id.na5)) == null)) {
                    C7919x.m8091a(textView3);
                }
                View view5 = this.f38411A;
                if (!(view5 == null || (textView2 = (TextView) view5.findViewById(C0966R.C0970id.na8)) == null)) {
                    C7919x.m8091a(textView2);
                }
                View view6 = this.f38411A;
                if (!(view6 == null || (textView = (TextView) view6.findViewById(C0966R.C0970id.na6)) == null)) {
                    C7919x.m8091a(textView);
                }
            }
            getIconLayout().bringToFront();
            this.f38415E = 1.0f;
        }

        private final Vibrator getVibrator() {
            return (Vibrator) ((C36570n) this.f38414D).getValue();
        }

        /* renamed from: d */
        public void mo4788d(boolean z) {
        }

        /* renamed from: e */
        public void mo4789e() {
            C13539y3 y3Var = this.f38416F;
            View view = y3Var.f38395h;
            FinderThumbPlayerProxy finderThumbPlayerProxy = view instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) view : null;
            if (finderThumbPlayerProxy != null) {
                ((C13194da) C39818r.f106831a.mo62444c(y3Var.getActivity()).mo75002a(C13194da.class)).mo12685c3(finderThumbPlayerProxy);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r11.f38416F;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4791g() {
            /*
                r11 = this;
                android.view.View r8 = r11.f38411A
                if (r8 == 0) goto L_0x0074
                rs1.y3 r0 = r11.f38416F
                jq3.o r1 = r0.f38398n
                if (r1 == 0) goto L_0x0074
                bl3.r r2 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
                bl3.r$a r0 = r2.mo62444c(r0)
                java.lang.Class<rs1.o6> r2 = rs1.C13354o6.class
                bl3.t r0 = r0.mo62449e(r2)
                rs1.o6 r0 = (rs1.C13354o6) r0
                r2 = 1
                r9 = 0
                if (r0 == 0) goto L_0x0027
                boolean r0 = r0.mo12779d3(r1)
                if (r0 != r2) goto L_0x0027
                goto L_0x0028
            L_0x0027:
                r2 = 0
            L_0x0028:
                if (r2 == 0) goto L_0x0074
                k20.a r10 = new k20.a
                r10.<init>()
                java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                r10.mo10233c(r0)
                java.lang.Object[] r1 = r10.mo10232b()
                java.lang.String r2 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout"
                java.lang.String r3 = "showEndHintLayout"
                java.lang.String r4 = "()V"
                java.lang.String r5 = "android/view/View_EXEC_"
                java.lang.String r6 = "setVisibility"
                java.lang.String r7 = "(I)V"
                r0 = r8
                j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
                java.lang.Object r0 = r10.mo10231a(r9)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r8.setVisibility(r0)
                java.lang.String r1 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout"
                java.lang.String r2 = "showEndHintLayout"
                java.lang.String r3 = "()V"
                java.lang.String r4 = "android/view/View_EXEC_"
                java.lang.String r5 = "setVisibility"
                java.lang.String r6 = "(I)V"
                r0 = r8
                j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
                android.widget.FrameLayout r0 = r11.getIconLayout()
                r0.setVisibility(r9)
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13539y3.C13540a.mo4791g():void");
        }

        public final View getBulletStubView() {
            return this.f38417z;
        }

        public final View getEntHintLayout() {
            return this.f38411A;
        }

        /* renamed from: j */
        public boolean mo4803j(boolean z) {
            boolean z2 = z;
            boolean j = super.mo4803j(z);
            StringBuilder sb = new StringBuilder();
            sb.append("triggerLongPressSpeedPlay: result=");
            sb.append(j);
            sb.append(", isStart=");
            sb.append(z2);
            sb.append(", currPlaySpeedRatio=");
            View view = this.f38416F.f38395h;
            FinderThumbPlayerProxy finderThumbPlayerProxy = view instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) view : null;
            sb.append(finderThumbPlayerProxy != null ? Float.valueOf(finderThumbPlayerProxy.getPlaySpeedRatio()) : null);
            sb.append("feedId=");
            C60905o oVar = this.f38416F.f38398n;
            C0740i2 i2Var = oVar != null ? (C0740i2) oVar.f173503E : null;
            if (!(i2Var instanceof C0740i2)) {
                i2Var = null;
            }
            sb.append(C61926c.m72691p(i2Var != null ? i2Var.getItemId() : 0));
            Log.m105924i("HorizontalVideoPreviewLayout", sb.toString());
            if (!j) {
                return false;
            }
            View view2 = this.f38416F.f38395h;
            FinderThumbPlayerProxy finderThumbPlayerProxy2 = view2 instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) view2 : null;
            if (finderThumbPlayerProxy2 != null) {
                if (z2) {
                    if (finderThumbPlayerProxy2.f161745p == 6) {
                        getLongVideoSeekBarLayout().getLongVideoSeekBar().getPlayBtn().performClick();
                    }
                    float playSpeedRatio = finderThumbPlayerProxy2.getPlaySpeedRatio();
                    this.f38415E = playSpeedRatio;
                    float f = 2.0f;
                    if (playSpeedRatio == 2.0f) {
                        f = 3.0f;
                    }
                    finderThumbPlayerProxy2.setPlaySpeed(f);
                    C7435f2 f2Var = C7435f2.f25626a;
                    C13442s8.C13443a aVar = C13442s8.f38060Q0;
                    Context context = getContext();
                    C87412m.m108593f(context, "context");
                    C13442s8 f2 = aVar.mo12873f(context);
                    f2Var.mo8577a(f2 != null ? f2.mo12861q3() : null, "transpose_video_card", 4, (JSONObject) null);
                } else {
                    finderThumbPlayerProxy2.setPlaySpeed(this.f38415E);
                }
                View view3 = this.f38412B;
                int i = z2 ? 0 : 8;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i));
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (z2) {
                    if (getLongVideoSeekBarLayout().getVisibility() == 0) {
                        HorizontalVideoPreviewLayout.m4254i(this, false, 1, (Object) null);
                    }
                    AnimatorSet animatorSet = this.f38413C;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    View findViewById = this.f38412B.findViewById(C0966R.C0970id.l6n);
                    View findViewById2 = this.f38412B.findViewById(C0966R.C0970id.l6z);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(Float.valueOf(0.1f));
                    C117292a.m165358d(findViewById, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    findViewById.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                    C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(Float.valueOf(0.1f));
                    View view5 = findViewById2;
                    C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    findViewById2.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new C13137c4(findViewById));
                    ofFloat.setDuration(250);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat2.addUpdateListener(new C13186d4(findViewById));
                    ofFloat2.setStartDelay(250);
                    ofFloat2.setDuration(250);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat3.addUpdateListener(new C13215e4(findViewById2));
                    ofFloat3.setStartDelay(400);
                    ofFloat3.setDuration(250);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat4.addUpdateListener(new C13231f4(findViewById2));
                    ofFloat4.setStartDelay(650);
                    ofFloat4.setDuration(250);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
                    animatorSet2.addListener(new C13243g4(this));
                    this.f38413C = animatorSet2;
                    animatorSet2.start();
                } else {
                    AnimatorSet animatorSet3 = this.f38413C;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    this.f38413C = null;
                }
                Vibrator vibrator = getVibrator();
                if (vibrator != null) {
                    vibrator.vibrate(10);
                }
            }
            return true;
        }

        public final void setEntHintLayout(View view) {
            this.f38411A = view;
        }
    }

    /* renamed from: rs1.y3$b */
    public static final class C13543b extends C58555d {

        /* renamed from: g */
        public final /* synthetic */ C13539y3 f38420g;

        /* renamed from: h */
        public final /* synthetic */ AppCompatActivity f38421h;

        public C13543b(C13539y3 y3Var, AppCompatActivity appCompatActivity) {
            this.f38420g = y3Var;
            this.f38421h = appCompatActivity;
        }

        /* renamed from: B1 */
        public void mo2331B1(C7637b bVar) {
            C87412m.m108594g(bVar, "ev");
            if (this.f38420g.getContext().getResources().getConfiguration().orientation != 2) {
                if (bVar instanceof C58259c.C58260a) {
                    if (((C58259c.C58260a) bVar).f166811b == 17) {
                        C13539y3 y3Var = this.f38420g;
                        if (y3Var.f38397j != null && y3Var.getContext().getResources().getConfiguration().orientation == 1) {
                            Log.m105924i("FinderVideoOrientationUIC", "PlayEventSubscriber.PlayEvent.VIDEO_CLICK_PAUSE: set portrait, activity = " + this.f38421h.getClass().getSimpleName());
                            this.f38420g.getContext().setRequestedOrientation(1);
                        }
                    }
                } else if (bVar instanceof C7642k) {
                    C13539y3 y3Var2 = this.f38420g;
                    if (!y3Var2.f38403s) {
                        Log.m105920e("FinderVideoOrientationUIC", "onEventHappen: error, need to set orientation into android:configChanges in AndroidManifest.xml, activity = " + this.f38421h);
                        return;
                    }
                    int i = ((C7642k) bVar).f25951b;
                    y3Var2.f38405u = i == 0;
                    if (i == 1) {
                        if (!y3Var2.f38402r) {
                            y3Var2.getContext().setRequestedOrientation(1);
                        }
                        C13539y3 y3Var3 = this.f38420g;
                        y3Var3.f38397j = null;
                        y3Var3.f38402r = true;
                        return;
                    }
                    y3Var2.f38402r = false;
                    boolean c3 = C13539y3.m12852c3(y3Var2, "ScrollEvent");
                    Log.m105924i("FinderVideoOrientationUIC", "onEventHappen: ev = " + bVar + ", isLandScapeVideo = " + c3 + ", activity = " + this.f38421h.getClass().getSimpleName());
                }
            }
        }

        /* renamed from: y1 */
        public boolean mo2424y1() {
            return false;
        }

        /* renamed from: z1 */
        public boolean mo2333z1(C58553c cVar, C7637b bVar) {
            int i;
            C87412m.m108594g(cVar, "dispatcher");
            C87412m.m108594g(bVar, "event");
            if (!(bVar instanceof C7642k) || ((i = ((C7642k) bVar).f25951b) != 0 && i != 4 && i != 5 && i != 1 && i != 7)) {
                return (bVar instanceof C58259c.C58260a) && ((C58259c.C58260a) bVar).f166811b == 17;
            }
            return true;
        }
    }

    /* renamed from: rs1.y3$c */
    public static final class C13544c implements C53156a.C38082b {

        /* renamed from: d */
        public final /* synthetic */ C13539y3 f38422d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f38423e;

        public C13544c(C13539y3 y3Var, AppCompatActivity appCompatActivity) {
            this.f38422d = y3Var;
            this.f38423e = appCompatActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0188  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo12953a(we0.C53156a.C53157a r13, we0.C53156a.C53157a r14) {
            /*
                r12 = this;
                java.lang.Class<rs1.e2> r0 = rs1.C13211e2.class
                rs1.y3 r1 = r12.f38422d
                boolean r1 = r1.isUserVisibleFocused()
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                rs1.y3 r1 = r12.f38422d
                boolean r1 = r1.f38404t
                if (r1 == 0) goto L_0x01e6
                if (r13 == r14) goto L_0x01e6
                bl3.r r13 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r1 = r12.f38423e
                bl3.r$a r1 = r13.mo62444c(r1)
                java.lang.Class<rs1.b1> r2 = rs1.C63545b1.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                rs1.b1 r1 = (rs1.C63545b1) r1
                com.tencent.mm.plugin.finder.view.e1 r1 = r1.f180225d
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0031
                boolean r1 = r1.mo79924b()
                if (r1 != r2) goto L_0x0031
                r1 = 1
                goto L_0x0032
            L_0x0031:
                r1 = 0
            L_0x0032:
                androidx.appcompat.app.AppCompatActivity r4 = r12.f38423e
                bl3.r$a r4 = r13.mo62444c(r4)
                androidx.lifecycle.i0 r4 = r4.mo75002a(r0)
                rs1.e2 r4 = (rs1.C13211e2) r4
                rx3.g r4 = r4.f37547d
                rx3.n r4 = (rx3.C36570n) r4
                java.lang.Object r4 = r4.getValue()
                com.tencent.mm.plugin.finder.view.FinderLikeDrawer r4 = (com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer) r4
                if (r4 == 0) goto L_0x004f
                boolean r4 = r4.mo82541i()
                goto L_0x0050
            L_0x004f:
                r4 = 0
            L_0x0050:
                androidx.appcompat.app.AppCompatActivity r5 = r12.f38423e
                bl3.r$a r5 = r13.mo62444c(r5)
                androidx.lifecycle.i0 r0 = r5.mo75002a(r0)
                rs1.e2 r0 = (rs1.C13211e2) r0
                rx3.g r0 = r0.f37548e
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                com.tencent.mm.plugin.finder.view.FinderLikeDrawer r0 = (com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer) r0
                if (r0 == 0) goto L_0x006d
                boolean r0 = r0.mo82541i()
                goto L_0x006e
            L_0x006d:
                r0 = 0
            L_0x006e:
                androidx.appcompat.app.AppCompatActivity r5 = r12.f38423e
                bl3.r$a r5 = r13.mo62444c(r5)
                java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC> r6 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class
                bl3.t r5 = r5.mo62449e(r6)
                com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC r5 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) r5
                if (r5 == 0) goto L_0x0085
                as1.a r5 = r5.f18766f
                if (r5 == 0) goto L_0x0085
                boolean r5 = r5.f18137q
                goto L_0x0086
            L_0x0085:
                r5 = 0
            L_0x0086:
                androidx.appcompat.app.AppCompatActivity r6 = r12.f38423e
                bl3.r$a r6 = r13.mo62444c(r6)
                java.lang.Class<rs1.z0> r7 = rs1.C13559z0.class
                bl3.t r6 = r6.mo62449e(r7)
                rs1.z0 r6 = (rs1.C13559z0) r6
                if (r6 == 0) goto L_0x009f
                androidx.fragment.app.DialogFragment r6 = r6.f38464d
                if (r6 == 0) goto L_0x009f
                boolean r6 = r6.isVisible()
                goto L_0x00a0
            L_0x009f:
                r6 = 0
            L_0x00a0:
                androidx.appcompat.app.AppCompatActivity r7 = r12.f38423e
                bl3.r$a r7 = r13.mo62444c(r7)
                java.lang.Class<rs1.a1> r8 = rs1.C63513a1.class
                androidx.lifecycle.i0 r7 = r7.mo75002a(r8)
                rs1.a1 r7 = (rs1.C63513a1) r7
                boolean r7 = r7.mo88377m3()
                androidx.appcompat.app.AppCompatActivity r8 = r12.f38423e
                bl3.r$a r8 = r13.mo62444c(r8)
                java.lang.Class<rs1.o6> r9 = rs1.C13354o6.class
                bl3.t r8 = r8.mo62449e(r9)
                rs1.o6 r8 = (rs1.C13354o6) r8
                if (r8 == 0) goto L_0x00df
                kf1.n5 r8 = r8.f37857e
                if (r8 == 0) goto L_0x00d7
                android.view.View r8 = r8.mo10407a()
                int r8 = r8.getVisibility()
                if (r8 != 0) goto L_0x00d2
                r8 = 1
                goto L_0x00d3
            L_0x00d2:
                r8 = 0
            L_0x00d3:
                if (r8 != r2) goto L_0x00df
                r8 = 1
                goto L_0x00e0
            L_0x00d7:
                java.lang.String r13 = "viewCallback"
                gy3.C87412m.m108603p(r13)
                r13 = 0
                throw r13
            L_0x00df:
                r8 = 0
            L_0x00e0:
                androidx.appcompat.app.AppCompatActivity r9 = r12.f38423e
                bl3.r$a r9 = r13.mo62444c(r9)
                java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC> r10 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class
                bl3.t r9 = r9.mo62449e(r10)
                com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC r9 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) r9
                if (r9 == 0) goto L_0x00f7
                boolean r9 = r9.f18676f
                r9 = r9 ^ r2
                if (r9 != r2) goto L_0x00f7
                r9 = 1
                goto L_0x00f8
            L_0x00f7:
                r9 = 0
            L_0x00f8:
                androidx.appcompat.app.AppCompatActivity r10 = r12.f38423e
                bl3.r$a r13 = r13.mo62444c(r10)
                java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.j> r10 = com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.class
                androidx.lifecycle.i0 r13 = r13.mo75002a(r10)
                com.tencent.mm.plugin.finder.viewmodel.component.j r13 = (com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j) r13
                boolean r13 = r13.mo80097k3()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "[onConfigurationChanged] activity="
                r10.append(r11)
                androidx.appcompat.app.AppCompatActivity r11 = r12.f38423e
                java.lang.Class r11 = r11.getClass()
                java.lang.String r11 = r11.getSimpleName()
                r10.append(r11)
                java.lang.String r11 = ", isLandscapeByClick="
                r10.append(r11)
                rs1.y3 r11 = r12.f38422d
                boolean r11 = r11.f38408x
                r10.append(r11)
                java.lang.String r11 = ", isDrawerOpen="
                r10.append(r11)
                r10.append(r1)
                java.lang.String r11 = " isLikeDrawerOpen="
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = " isAllLikeDrawerOpen="
                r10.append(r11)
                r10.append(r0)
                java.lang.String r11 = " isProfileDrawerOpen="
                r10.append(r11)
                r10.append(r5)
                java.lang.String r11 = " isBizProfileDrawerOpen="
                r10.append(r11)
                r10.append(r6)
                java.lang.String r11 = " isShowBulletInputUI="
                r10.append(r11)
                r10.append(r7)
                java.lang.String r11 = " newOrientation="
                r10.append(r11)
                r10.append(r14)
                java.lang.String r11 = ", isLongVideoEndLayoutShown="
                r10.append(r11)
                r10.append(r8)
                java.lang.String r11 = ", isRecommendDrawerShown="
                r10.append(r11)
                r10.append(r9)
                java.lang.String r11 = ", isProjectionPanelShown="
                r10.append(r11)
                r10.append(r13)
                java.lang.String r11 = ", isLandscapeVideo="
                r10.append(r11)
                rs1.y3 r11 = r12.f38422d
                jq3.o r11 = r11.f38397j
                if (r11 == 0) goto L_0x0189
                r3 = 1
            L_0x0189:
                r10.append(r3)
                java.lang.String r3 = r10.toString()
                java.lang.String r10 = "FinderVideoOrientationUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
                rs1.y3 r3 = r12.f38422d
                boolean r10 = r3.f38408x
                if (r10 != 0) goto L_0x01e6
                if (r1 != 0) goto L_0x01e6
                if (r4 != 0) goto L_0x01e6
                if (r7 != 0) goto L_0x01e6
                if (r0 != 0) goto L_0x01e6
                if (r5 != 0) goto L_0x01e6
                if (r6 != 0) goto L_0x01e6
                if (r8 != 0) goto L_0x01e6
                if (r9 != 0) goto L_0x01e6
                if (r13 != 0) goto L_0x01e6
                we0.a$a r13 = we0.C53156a.C53157a.LANDSCAPE
                if (r14 == r13) goto L_0x01b5
                we0.a$a r13 = we0.C53156a.C53157a.REVERSE_LANDSCAPE
                if (r14 != r13) goto L_0x01e6
            L_0x01b5:
                jq3.o r13 = r3.f38397j
                if (r13 != 0) goto L_0x01c2
                boolean r13 = r3.f38405u
                if (r13 == 0) goto L_0x01c2
                java.lang.String r13 = "OrientationEvent"
                rs1.C13539y3.m12852c3(r3, r13)
            L_0x01c2:
                rs1.y3 r13 = r12.f38422d
                jq3.o r14 = r13.f38397j
                if (r14 != 0) goto L_0x01d0
                android.app.Activity r13 = r13.getContext()
                boolean r13 = r13 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderNewStyleTimelineUI
                if (r13 == 0) goto L_0x01d1
            L_0x01d0:
                r2 = 2
            L_0x01d1:
                rs1.y3 r13 = r12.f38422d
                android.app.Activity r13 = r13.getContext()
                int r13 = r13.getRequestedOrientation()
                if (r2 == r13) goto L_0x01e6
                rs1.y3 r13 = r12.f38422d
                android.app.Activity r13 = r13.getContext()
                r13.setRequestedOrientation(r2)
            L_0x01e6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13539y3.C13544c.mo12953a(we0.a$a, we0.a$a):void");
        }
    }

    /* renamed from: rs1.y3$d */
    public static final class C13545d extends C87413o implements C32224a<C13540a> {

        /* renamed from: d */
        public final /* synthetic */ C13539y3 f38424d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f38425e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13545d(C13539y3 y3Var, AppCompatActivity appCompatActivity) {
            super(0);
            this.f38424d = y3Var;
            this.f38425e = appCompatActivity;
        }

        public Object invoke() {
            return new C13540a(this.f38424d, this.f38425e);
        }
    }

    /* renamed from: rs1.y3$e */
    public static final class C13546e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13546e f38426d = new C13546e();

        public C13546e() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99388e5.mo60266n().intValue();
            if (intValue <= 0) {
                intValue = 2;
            }
            return Integer.valueOf(intValue);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13539y3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f38391d = C36568h.m40985a(new C13545d(this, appCompatActivity));
        this.f38389A = new C53156a(appCompatActivity, new C13544c(this, appCompatActivity));
        this.f38390B = new C13543b(this, appCompatActivity);
    }

    /* renamed from: c3 */
    public static final boolean m12852c3(C13539y3 y3Var, String str) {
        RefreshLoadMoreLayout refreshLoadMoreLayout;
        C60905o oVar;
        FinderVideoLayout finderVideoLayout;
        y3Var.getClass();
        long nanoTime = System.nanoTime();
        boolean z = true;
        boolean z2 = false;
        boolean z3 = C85875k4.m106208w() || C85875k4.m106157N();
        if (BuildInfo.DEBUG) {
            Log.m105924i("FinderUIToolHelper", "[isFoldableDeviceOrInMagicWindowMode] cost=" + (System.nanoTime() - nanoTime) + "ns");
        }
        if (!z3) {
            C60905o oVar2 = null;
            if (y3Var.getActivity() instanceof FinderHomeUI) {
                View view = ((FinderHomeUIC) C39818r.f106831a.mo62444c(y3Var.getActivity()).mo75002a(FinderHomeUIC.class)).getActiveFragment().getView();
                refreshLoadMoreLayout = view != null ? (RefreshLoadMoreLayout) view.findViewById(C0966R.C0970id.ivb) : null;
            } else {
                refreshLoadMoreLayout = (RefreshLoadMoreLayout) y3Var.findViewById(C0966R.C0970id.ivb);
            }
            RecyclerView recyclerView = refreshLoadMoreLayout != null ? refreshLoadMoreLayout.getRecyclerView() : null;
            if (recyclerView == null) {
                Log.m105920e("FinderVideoOrientationUIC", "checkCanLandscape, recyclerView is null");
                y3Var.f38397j = null;
                y3Var.getContext().setRequestedOrientation(1);
            } else {
                if (y3Var.f38407w) {
                    Rect rect = new Rect();
                    int childCount = recyclerView.getChildCount();
                    oVar = null;
                    int i = 0;
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = recyclerView.getChildAt(i2);
                        if (childAt.getGlobalVisibleRect(rect) && i < rect.height()) {
                            RecyclerView.C16631z F0 = recyclerView.mo17021F0(childAt);
                            oVar = F0 instanceof C60905o ? (C60905o) F0 : null;
                            i = rect.height();
                        }
                    }
                } else {
                    oVar = C58784w3.f168295a.mo83859C(recyclerView, Integer.MIN_VALUE, Integer.MIN_VALUE, C58784w3.f168298d).f168209g;
                }
                if (!(oVar == null || (finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a)) == null)) {
                    Log.m105924i("FinderVideoOrientationUIC", "checkCanLandscape: source=" + str + ", videoView = " + finderVideoLayout.getVideoView() + ", isFullScreenTimeline=" + y3Var.f38407w);
                    C59670o2 videoView = finderVideoLayout.getVideoView();
                    View view2 = videoView instanceof View ? (View) videoView : null;
                    if (view2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("checkCanLandscape: pos=");
                        sb.append(oVar.mo17363j());
                        sb.append(", itemViewType=");
                        sb.append(oVar.f44859i);
                        sb.append(", height=");
                        sb.append(view2.getHeight());
                        sb.append(", width=");
                        sb.append(view2.getWidth());
                        sb.append(", isTpView=");
                        boolean z4 = view2 instanceof FinderThumbPlayerProxy;
                        sb.append(z4);
                        sb.append(", isSurfaceView=");
                        FinderThumbPlayerProxy finderThumbPlayerProxy = z4 ? (FinderThumbPlayerProxy) view2 : null;
                        sb.append((finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getRenderView() : null) instanceof MMSurfaceViewRender);
                        Log.m105924i("FinderVideoOrientationUIC", sb.toString());
                        if (oVar.f44859i != 4 || view2.getHeight() >= view2.getWidth() || !z4) {
                            z = false;
                        }
                        z2 = z;
                    }
                }
                if (z2) {
                    oVar2 = oVar;
                }
                y3Var.f38397j = oVar2;
                y3Var.f38400p = oVar != null ? oVar.mo17363j() : -1;
            }
        }
        return z2;
    }

    /* renamed from: d3 */
    public final void mo12946d3(boolean z) {
        View decorView = getActivity().getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        if (z) {
            viewGroup.removeView(mo12947e3());
            return;
        }
        viewGroup.removeView(mo12947e3());
        viewGroup.addView(mo12947e3(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: e3 */
    public final C13540a mo12947e3() {
        return (C13540a) ((C36570n) this.f38391d).getValue();
    }

    /* renamed from: f3 */
    public final boolean mo12948f3() {
        return C85875k4.m106197n0() && (C85875k4.m106156M(getActivity()) || C85875k4.m106155L(getActivity().getContentResolver()) || (C85875k4.m106154K(getActivity().getTaskId()) && Build.VERSION.SDK_INT >= 24 && !getActivity().isInMultiWindowMode()));
    }

    public boolean onBackPressed() {
        if (((C13194da) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C13194da.class)).onBackPressed()) {
            return true;
        }
        if (this.f38398n == null || getContext().getResources().getConfiguration().orientation != 2) {
            return false;
        }
        getContext().setRequestedOrientation(1);
        this.f38406v = 0;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0a50  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0a78  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0abc  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0ac0  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0ac3  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0acd  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0b25  */
    /* JADX WARNING: Removed duplicated region for block: B:366:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r34) {
        /*
            r33 = this;
            r6 = r33
            r0 = r34
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r1 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            java.lang.String r2 = "newConfig"
            gy3.C87412m.m108594g(r0, r2)
            super.onConfigurationChanged(r34)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onConfigurationChanged: newConfig = "
            r2.append(r3)
            int r3 = r0.orientation
            r2.append(r3)
            java.lang.String r3 = ", isLandscape = "
            r2.append(r3)
            int r3 = r0.orientation
            r4 = 2
            r7 = 1
            r8 = 0
            if (r3 != r4) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            r2.append(r3)
            java.lang.String r3 = ", currOrientation = "
            r2.append(r3)
            int r3 = r6.f38399o
            r2.append(r3)
            java.lang.String r9 = ", activity = "
            r2.append(r9)
            androidx.appcompat.app.AppCompatActivity r3 = r33.getActivity()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r10 = "FinderVideoOrientationUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            int r2 = r6.f38399o
            int r3 = r0.orientation
            r5 = 2131312597(0x7f093fd5, float:1.8243567E38)
            r11 = 0
            if (r2 != r3) goto L_0x011a
            java.lang.Boolean r0 = r6.f38409y
            if (r0 == 0) goto L_0x0119
            boolean r0 = r0.booleanValue()
            boolean r2 = r33.mo12948f3()
            if (r2 == 0) goto L_0x007e
            android.app.Activity r3 = r33.getContext()
            int r3 = r3.getTaskId()
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106209x(r3)
            if (r3 != 0) goto L_0x007e
            r3 = 1
            goto L_0x007f
        L_0x007e:
            r3 = 0
        L_0x007f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "onConfigurationChanged: newExpandStatus="
            r4.append(r9)
            r4.append(r3)
            java.lang.String r9 = ", currExpandStatus="
            r4.append(r9)
            r4.append(r0)
            java.lang.String r9 = ", isMagicWindowExpand="
            r4.append(r9)
            r4.append(r2)
            java.lang.String r2 = " newExpandStatus:"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            if (r3 == r0) goto L_0x0119
            androidx.appcompat.app.AppCompatActivity r0 = r33.getActivity()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            if (r0 == 0) goto L_0x00d8
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = r33.getActivity()
            bl3.r$a r0 = r0.mo62444c(r2)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r0
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r0 = r0.getActiveFragment()
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x00d6
            android.view.View r0 = r0.findViewById(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r0
            goto L_0x00de
        L_0x00d6:
            r0 = r11
            goto L_0x00de
        L_0x00d8:
            android.view.View r0 = r6.findViewById(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r0
        L_0x00de:
            if (r0 == 0) goto L_0x00e5
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            goto L_0x00e6
        L_0x00e5:
            r0 = r11
        L_0x00e6:
            if (r0 == 0) goto L_0x00ed
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            goto L_0x00ee
        L_0x00ed:
            r0 = r11
        L_0x00ee:
            boolean r1 = r0 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r1 == 0) goto L_0x00f5
            r11 = r0
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r11 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r11
        L_0x00f5:
            if (r11 == 0) goto L_0x0113
            int r0 = r11.getItemCount()
            if (r0 <= 0) goto L_0x0113
            int r0 = r11.getItemCount()
            rx3.l r1 = new rx3.l
            r2 = 30
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r1.<init>(r2, r4)
            r11.notifyItemRangeChanged(r8, r0, r1)
        L_0x0113:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.f38409y = r0
        L_0x0119:
            return
        L_0x011a:
            r6.f38399o = r3
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r33.getActivity()
            bl3.r$a r3 = r2.mo62444c(r3)
            java.lang.Class<rs1.a1> r12 = rs1.C63513a1.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r12)
            rs1.a1 r3 = (rs1.C63513a1) r3
            com.tencent.mm.ui.tools.KeyboardHeightProvider r12 = r3.mo88374i3()
            r12.mo104021d()
            com.tencent.mm.ui.tools.KeyboardHeightProvider r3 = r3.mo88374i3()
            r3.mo104022e()
            int r0 = r0.orientation
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            java.lang.String r12 = " nickname = "
            java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r14 = ", desc = "
            r4 = -1
            if (r0 != r7) goto L_0x043f
            r6.f38408x = r8
            int r0 = r6.f38396i
            if (r0 < 0) goto L_0x0163
            androidx.appcompat.app.AppCompatActivity r0 = r33.getActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            int r1 = r6.f38396i
            r0.setSystemUiVisibility(r1)
            r6.f38396i = r4
        L_0x0163:
            androidx.appcompat.app.AppCompatActivity r0 = r33.getActivity()
            bl3.r$a r0 = r2.mo62444c(r0)
            java.lang.Class<rs1.da> r1 = rs1.C13194da.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(activity)…edControlUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r17 = r0
            rs1.da r17 = (rs1.C13194da) r17
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 4
            r22 = 0
            rs1.C13194da.m12604j3(r17, r18, r19, r20, r21, r22)
            android.view.View r0 = r6.f38395h
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r1 == 0) goto L_0x0190
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r0
            goto L_0x0191
        L_0x0190:
            r0 = r11
        L_0x0191:
            if (r0 == 0) goto L_0x019a
            long r17 = r0.getCurrentPlayMs()
            r1 = r17
            goto L_0x019c
        L_0x019a:
            r1 = 0
        L_0x019c:
            android.view.View r0 = r6.f38395h
            boolean r5 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r5 == 0) goto L_0x01a5
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r0
            goto L_0x01a6
        L_0x01a5:
            r0 = r11
        L_0x01a6:
            if (r0 == 0) goto L_0x01b4
            int r0 = r0.f161745p
            r5 = 6
            if (r0 != r5) goto L_0x01af
            r0 = 1
            goto L_0x01b0
        L_0x01af:
            r0 = 0
        L_0x01b0:
            if (r0 != r7) goto L_0x01b4
            r0 = 1
            goto L_0x01b5
        L_0x01b4:
            r0 = 0
        L_0x01b5:
            rs1.y3$a r5 = r33.mo12947e3()
            r5.mo4803j(r8)
            gy3.f0 r5 = new gy3.f0
            r5.<init>()
            android.view.View r15 = r6.f38395h
            if (r15 == 0) goto L_0x02a1
            boolean r4 = r15 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r4 == 0) goto L_0x01cd
            r4 = r15
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r4
            goto L_0x01ce
        L_0x01cd:
            r4 = r11
        L_0x01ce:
            if (r4 == 0) goto L_0x01d3
            com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64977D(r4, r8, r7, r11)
        L_0x01d3:
            rs1.y3$a r4 = r33.mo12947e3()
            r4.removeView(r15)
            android.view.ViewGroup r4 = r6.f38392e
            boolean r11 = r4 instanceof com.tencent.p014mm.plugin.finder.video.FinderVideoLayout
            if (r11 == 0) goto L_0x01e3
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r4 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r4
            goto L_0x01e4
        L_0x01e3:
            r4 = 0
        L_0x01e4:
            if (r4 == 0) goto L_0x0226
            com.tencent.mm.plugin.finder.video.FinderVideoCore r11 = r4.getVideoCore()
            hr1.k r11 = r11.f161828n
            r5.f27484d = r11
            boolean r7 = r6.f38407w
            if (r7 == 0) goto L_0x01fd
            if (r11 == 0) goto L_0x01fd
            java.lang.String r7 = "FinderHDRVideoOrientationUIC"
            r23 = r10
            r10 = 1
            r11.mo9562M0(r7, r8, r10)
            goto L_0x0200
        L_0x01fd:
            r23 = r10
            r10 = 1
        L_0x0200:
            r4.setEnablePlay(r10)
            rs1.y3$a r7 = r33.mo12947e3()
            r7.getClass()
            r10 = 0
            r4.setLongVideoSeekBar(r10)
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r4 = r7.getLongVideoSeekBarLayout()
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r4 = r4.getLongVideoSeekBar()
            r4.setIplaySeekCallback(r10)
            r4.setPlayBtnOnClickListener(r10)
            r4.setOnSeekStart(r10)
            r4.setOnSeekEnd(r10)
            r4.setPlayStatusListener(r10)
            goto L_0x0228
        L_0x0226:
            r23 = r10
        L_0x0228:
            android.view.ViewGroup r4 = r6.f38392e
            if (r4 == 0) goto L_0x022f
            r4.removeView(r15)
        L_0x022f:
            android.view.ViewGroup r4 = r6.f38392e
            if (r4 == 0) goto L_0x023a
            int r7 = r6.f38393f
            android.view.ViewGroup$LayoutParams r10 = r6.f38394g
            r4.addView(r15, r7, r10)
        L_0x023a:
            r4 = r15
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r4
            boolean r7 = r4.isPlaying()
            if (r7 != 0) goto L_0x024f
            android.view.ViewGroup r7 = r6.f38392e
            if (r7 == 0) goto L_0x024f
            rs1.h4 r10 = new rs1.h4
            r10.<init>(r6)
            r7.post(r10)
        L_0x024f:
            r7 = 0
            r6.f38392e = r7
            r6.f38395h = r7
            r10 = -1
            r6.f38393f = r10
            r6.f38394g = r7
            boolean r7 = r15 instanceof gr1.C59670o2
            if (r7 == 0) goto L_0x0263
            r4.setInterceptDetach(r8)
            r4.setPreview(r8)
        L_0x0263:
            dp1.f2 r4 = dp1.C7435f2.f25626a
            rs1.s8$a r7 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r10 = r33.getActivity()
            rs1.s8 r7 = r7.mo12873f(r10)
            if (r7 == 0) goto L_0x0276
            te3.hj1 r7 = r7.mo12861q3()
            goto L_0x0277
        L_0x0276:
            r7 = 0
        L_0x0277:
            int r10 = r6.f38406v
            if (r10 != 0) goto L_0x027f
            java.lang.String r11 = "transpose_video_card"
            goto L_0x0282
        L_0x027f:
            java.lang.String r11 = "transpose_video_card_exitArrow"
        L_0x0282:
            if (r10 != 0) goto L_0x0286
            r10 = 3
            goto L_0x0287
        L_0x0286:
            r10 = 1
        L_0x0287:
            r15 = 0
            r4.mo8577a(r7, r11, r10, r15)
            jq3.o r4 = r6.f38398n
            if (r4 == 0) goto L_0x02a3
            java.lang.Object r4 = r4.f173503E
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
            if (r4 == 0) goto L_0x02a3
            dp1.q r7 = dp1.C7450q.f25643a
            android.app.Activity r10 = r33.getContext()
            r11 = 57
            r7.mo8593a(r10, r4, r11)
            goto L_0x02a3
        L_0x02a1:
            r23 = r10
        L_0x02a3:
            rs1.y3$a r4 = r33.mo12947e3()
            r7 = 2131302819(0x7f0919a3, float:1.8223735E38)
            android.view.View r4 = r4.findViewById(r7)
            com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView r4 = (com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView) r4
            if (r4 == 0) goto L_0x030e
            r7 = 1
            r4.setReuse(r7)
            android.view.ViewParent r7 = r4.getParent()
            gy3.C87412m.m108592e(r7, r3)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r4)
            jq3.o r3 = r6.f38398n
            if (r3 == 0) goto L_0x02da
            r7 = 2131302818(0x7f0919a2, float:1.8223733E38)
            android.view.View r3 = r3.mo85812D(r7)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            if (r3 == 0) goto L_0x02da
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r10 = -1
            r7.<init>(r10, r10)
            r3.addView(r4, r7)
        L_0x02da:
            he1.m r3 = r4.getBulletManager()
            androidx.appcompat.app.AppCompatActivity r7 = r33.getActivity()
            boolean r7 = r7 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderNewStyleTimelineUI
            if (r7 == 0) goto L_0x02e8
            r7 = 2
            goto L_0x02f6
        L_0x02e8:
            rx3.g r7 = r6.f38410z
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
        L_0x02f6:
            he1.m$b r10 = he1.C59854m.f170903r
            r10 = 1
            r3.mo84821h(r7, r10)
            he1.m r3 = r4.getBulletManager()
            r3.mo84822i()
            rs1.i4 r3 = new rs1.i4
            r3.<init>(r4, r1, r0)
            r1 = 0
            o40.C61926c.m72666K(r1, r3)
            goto L_0x0310
        L_0x030e:
            r1 = 0
        L_0x0310:
            jq3.o r0 = r6.f38398n
            if (r0 == 0) goto L_0x040c
            androidx.recyclerview.widget.RecyclerView r7 = r0.mo85811C()
            if (r7 == 0) goto L_0x040c
            boolean r0 = r7 instanceof com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView
            if (r0 == 0) goto L_0x0322
            r0 = r7
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r0 = (com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView) r0
            goto L_0x0323
        L_0x0322:
            r0 = 0
        L_0x0323:
            if (r0 == 0) goto L_0x032c
            ff1.d r3 = r0.getScrollEventAdapter()
            r0.mo17043c(r3)
        L_0x032c:
            int r10 = r6.f38400p
            int r4 = r6.f38401q
            int r0 = r7.getChildCount()
            r3 = 0
        L_0x0335:
            if (r3 >= r0) goto L_0x0391
            android.view.View r11 = r7.getChildAt(r3)
            androidx.recyclerview.widget.RecyclerView$z r11 = r7.mo17031P0(r11)
            jq3.o r15 = r6.f38398n
            boolean r15 = gy3.C87412m.m108589b(r15, r11)
            if (r15 != 0) goto L_0x038c
            android.view.View r11 = r11.f44854d
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r16 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r15.mo10233c(r1)
            java.lang.Object[] r25 = r15.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC"
            java.lang.String r27 = "resetToPortrait"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r11
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r1 = r15.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r11.setVisibility(r1)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC"
            java.lang.String r26 = "resetToPortrait"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x038c:
            int r3 = r3 + 1
            r1 = 0
            goto L_0x0335
        L_0x0391:
            rs1.j4 r11 = new rs1.j4
            r0 = r11
            r2 = 0
            r1 = r10
            r2 = r33
            r3 = r7
            r15 = 3
            r0.<init>(r1, r2, r3, r4, r5)
            r7.post(r11)
            jq3.o r0 = r6.f38398n
            if (r0 == 0) goto L_0x03aa
            java.lang.Object r0 = r0.f173503E
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            goto L_0x03ab
        L_0x03aa:
            r0 = 0
        L_0x03ab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "resetToPortrait: pos = "
            r1.append(r2)
            r1.append(r10)
            r1.append(r14)
            if (r0 == 0) goto L_0x03d9
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.mo3513o()
            if (r2 == 0) goto L_0x03d9
            java.lang.String r2 = r2.getDescription()
            if (r2 == 0) goto L_0x03d9
            int r3 = r2.length()
            int r3 = java.lang.Math.min(r3, r15)
            java.lang.String r2 = r2.substring(r8, r3)
            gy3.C87412m.m108593f(r2, r13)
            goto L_0x03da
        L_0x03d9:
            r2 = 0
        L_0x03da:
            r1.append(r2)
            r1.append(r12)
            if (r0 == 0) goto L_0x03ed
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            if (r0 == 0) goto L_0x03ed
            java.lang.String r0 = r0.getNickName()
            goto L_0x03ee
        L_0x03ed:
            r0 = 0
        L_0x03ee:
            r1.append(r0)
            r1.append(r9)
            androidx.appcompat.app.AppCompatActivity r0 = r33.getActivity()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x040c:
            rs1.k4 r0 = new rs1.k4
            r0.<init>(r6)
            r1 = 0
            o40.C61926c.m72666K(r1, r0)
            rs1.y3$a r0 = r33.mo12947e3()
            r1 = 0
            r0.setFullSeekBar(r1)
            jq3.o r0 = r6.f38398n
            if (r0 == 0) goto L_0x0429
            androidx.recyclerview.widget.RecyclerView r21 = r0.mo85811C()
            r0 = r21
            goto L_0x042a
        L_0x0429:
            r0 = r1
        L_0x042a:
            if (r0 != 0) goto L_0x042d
            goto L_0x0430
        L_0x042d:
            r0.setLayoutFrozen(r8)
        L_0x0430:
            r6.f38398n = r1
            r0 = 1
            r6.mo12946d3(r0)
            android.app.Activity r1 = r33.getContext()
            r1.setRequestedOrientation(r0)
            goto L_0x0b32
        L_0x043f:
            r4 = r10
            r15 = 3
            androidx.appcompat.app.AppCompatActivity r0 = r33.getActivity()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderNewStyleTimelineUI
            if (r0 != 0) goto L_0x051f
            long r10 = java.lang.System.nanoTime()
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r0 != 0) goto L_0x045c
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r0 == 0) goto L_0x045a
            goto L_0x045c
        L_0x045a:
            r0 = 0
            goto L_0x045d
        L_0x045c:
            r0 = 1
        L_0x045d:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r7 == 0) goto L_0x0482
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[isFoldableDeviceOrInMagicWindowMode] cost="
            r7.append(r8)
            long r17 = java.lang.System.nanoTime()
            long r10 = r17 - r10
            r7.append(r10)
            java.lang.String r8 = "ns"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FinderUIToolHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
        L_0x0482:
            if (r0 == 0) goto L_0x0486
            goto L_0x051c
        L_0x0486:
            androidx.appcompat.app.AppCompatActivity r0 = r33.getActivity()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            if (r0 == 0) goto L_0x04af
            androidx.appcompat.app.AppCompatActivity r0 = r33.getActivity()
            bl3.r$a r0 = r2.mo62444c(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r0
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r0 = r0.getActiveFragment()
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x04ad
            android.view.View r0 = r0.findViewById(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r0
            goto L_0x04b5
        L_0x04ad:
            r0 = 0
            goto L_0x04b5
        L_0x04af:
            android.view.View r0 = r6.findViewById(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r0
        L_0x04b5:
            if (r0 == 0) goto L_0x04bc
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            goto L_0x04bd
        L_0x04bc:
            r0 = 0
        L_0x04bd:
            if (r0 != 0) goto L_0x04c5
            java.lang.String r0 = "enterLandScape, recyclerView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x051c
        L_0x04c5:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager
            if (r1 == 0) goto L_0x04d0
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r0 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r0
            goto L_0x04d1
        L_0x04d0:
            r0 = 0
        L_0x04d1:
            if (r0 != 0) goto L_0x04d9
            java.lang.String r0 = "enterLandScape, layoutManager is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x051c
        L_0x04d9:
            int r0 = r0.mo16957C()
            jq3.o r1 = r6.f38397j
            if (r1 != 0) goto L_0x04f6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "enterLandScape, holder is null, first pos = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x051c
        L_0x04f6:
            int r0 = r1.f44859i
            r5 = 4
            if (r0 != r5) goto L_0x04fd
            r0 = 1
            goto L_0x04fe
        L_0x04fd:
            r0 = 0
        L_0x04fe:
            if (r0 != 0) goto L_0x0535
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "enterLandScape, holder is null, pos = "
            r0.append(r2)
            int r1 = r1.mo17363j()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x051c:
            r2 = 0
            goto L_0x0b22
        L_0x051f:
            androidx.appcompat.app.AppCompatActivity r0 = r33.getActivity()
            bl3.r$a r0 = r2.mo62444c(r0)
            java.lang.Class<rs1.o6> r1 = rs1.C13354o6.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            rs1.o6 r0 = (rs1.C13354o6) r0
            com.tencent.mm.plugin.finder.feed.n r0 = r0.f37856d
            jq3.o r1 = r0.mo2931f()
        L_0x0535:
            int r0 = r1.mo17363j()
            java.lang.Object r5 = r1.f173503E
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "enterLandScape: pos = "
            r7.append(r8)
            r7.append(r0)
            r7.append(r14)
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r5.mo3513o()
            java.lang.String r8 = r8.getDescription()
            int r10 = r8.length()
            int r10 = java.lang.Math.min(r10, r15)
            r11 = 0
            java.lang.String r8 = r8.substring(r11, r10)
            gy3.C87412m.m108593f(r8, r13)
            r7.append(r8)
            r7.append(r12)
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r5.mo3513o()
            java.lang.String r8 = r8.getNickName()
            r7.append(r8)
            r7.append(r9)
            androidx.appcompat.app.AppCompatActivity r8 = r33.getActivity()
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            if (r0 <= 0) goto L_0x05bd
            r6.f38400p = r0
            boolean r0 = r6.f38407w
            if (r0 != 0) goto L_0x05ba
            r0 = 2131308186(0x7f092e9a, float:1.823462E38)
            android.view.View r0 = r1.mo85812D(r0)
            if (r0 == 0) goto L_0x05bd
            int[] r0 = o40.C61926c.m72689n(r0)
            r7 = 1
            r0 = r0[r7]
            androidx.recyclerview.widget.RecyclerView r8 = r1.mo85811C()
            java.lang.String r10 = "focusHolder.recyclerView"
            gy3.C87412m.m108593f(r8, r10)
            int[] r8 = o40.C61926c.m72689n(r8)
            r8 = r8[r7]
            int r0 = r0 - r8
            r6.f38401q = r0
            goto L_0x05bd
        L_0x05ba:
            r0 = 0
            r6.f38401q = r0
        L_0x05bd:
            r6.f38398n = r1
            androidx.appcompat.app.AppCompatActivity r0 = r33.getActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            int r0 = r0.getSystemUiVisibility()
            r6.f38396i = r0
            androidx.appcompat.app.AppCompatActivity r0 = r33.getActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.appcompat.app.AppCompatActivity r7 = r33.getActivity()
            android.view.Window r7 = r7.getWindow()
            android.view.View r7 = r7.getDecorView()
            int r7 = r7.getSystemUiVisibility()
            r7 = r7 | 2054(0x806, float:2.878E-42)
            r0.setSystemUiVisibility(r7)
            rs1.y3$a r0 = r33.mo12947e3()
            r0.getClass()
            r7 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r7 = r1.mo85812D(r7)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r7 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r7
            if (r7 == 0) goto L_0x051c
            rs1.y3 r8 = r0.f38416F
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "FinderVideoOrientationUIC addPreview: videoView = "
            r10.append(r11)
            gr1.o2 r11 = r7.getVideoView()
            r10.append(r11)
            r10.append(r9)
            androidx.appcompat.app.AppCompatActivity r8 = r8.getActivity()
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r9 = "HorizontalVideoPreviewLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            gr1.o2 r8 = r7.getVideoView()
            boolean r8 = r8 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r8 == 0) goto L_0x063b
            goto L_0x063c
        L_0x063b:
            r7 = 0
        L_0x063c:
            if (r7 == 0) goto L_0x051c
            rs1.y3 r8 = r0.f38416F
            dp1.f2 r9 = dp1.C7435f2.f25626a
            rs1.s8$a r10 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r11 = r8.getActivity()
            rs1.s8 r10 = r10.mo12873f(r11)
            if (r10 == 0) goto L_0x0653
            te3.hj1 r10 = r10.mo12861q3()
            goto L_0x0654
        L_0x0653:
            r10 = 0
        L_0x0654:
            java.lang.String r11 = "video_card"
            r12 = 2
            r13 = 0
            r9.mo8577a(r10, r11, r12, r13)
            dp1.q r9 = dp1.C7450q.f25643a
            android.content.Context r10 = r7.getContext()
            java.lang.String r11 = "context"
            gy3.C87412m.m108593f(r10, r11)
            r11 = 56
            r9.mo8593a(r10, r5, r11)
            com.tencent.mm.plugin.finder.video.FinderVideoCore r9 = r7.getVideoCore()
            hr1.k r10 = r9.f161828n
            if (r10 == 0) goto L_0x067d
            r12 = 1
            r13 = 0
            r14 = 4
            r15 = 0
            java.lang.String r11 = "FinderHDRVideoOrientationUIC"
            hr1.C8730k.C8731a.m8556a(r10, r11, r12, r13, r14, r15)
        L_0x067d:
            gr1.o2 r9 = r7.getVideoView()
            java.lang.String r10 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy"
            gy3.C87412m.m108592e(r9, r10)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r9 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r9
            r10 = 0
            r11 = 1
            r12 = 0
            com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64977D(r9, r12, r11, r10)
            r8.f38395h = r9
            androidx.recyclerview.widget.RecyclerView r10 = r1.mo85811C()
            rs1.z3 r11 = new rs1.z3
            r11.<init>(r1, r8)
            r10.post(r11)
            androidx.appcompat.app.AppCompatActivity r10 = r8.getActivity()
            bl3.r$a r10 = r2.mo62444c(r10)
            java.lang.Class<lp1.j> r11 = lp1.C10617j.class
            androidx.lifecycle.i0 r10 = r10.mo75002a(r11)
            lp1.j r10 = (lp1.C10617j) r10
            r10.getClass()
            java.lang.String r10 = "Finder.ShareGuideNextUIC"
            java.lang.String r11 = "[forbidToShow]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            r10 = 1
            r9.setPreview(r10)
            r9.setInterceptDetach(r10)
            r10 = 0
            r8.mo12946d3(r10)
            androidx.recyclerview.widget.RecyclerView r10 = r1.mo85811C()
            boolean r11 = r10 instanceof com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView
            if (r11 == 0) goto L_0x06cc
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r10 = (com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView) r10
            goto L_0x06cd
        L_0x06cc:
            r10 = 0
        L_0x06cd:
            if (r10 == 0) goto L_0x06d6
            ff1.d r11 = r10.getScrollEventAdapter()
            r10.mo17098m1(r11)
        L_0x06d6:
            android.view.ViewParent r10 = r9.getParent()
            gy3.C87412m.m108592e(r10, r3)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r8.f38392e = r10
            boolean r11 = r10 instanceof com.tencent.p014mm.plugin.finder.video.FinderVideoLayout
            if (r11 == 0) goto L_0x06eb
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r10 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r10
            r11 = 0
            r10.setEnablePlay(r11)
        L_0x06eb:
            android.view.ViewGroup r10 = r8.f38392e
            if (r10 == 0) goto L_0x06f4
            int r10 = r10.indexOfChild(r9)
            goto L_0x06f5
        L_0x06f4:
            r10 = 0
        L_0x06f5:
            r8.f38393f = r10
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            int r11 = r9.getWidth()
            int r12 = r9.getHeight()
            r10.<init>(r11, r12)
            r8.f38394g = r10
            android.view.ViewGroup r10 = r8.f38392e
            if (r10 == 0) goto L_0x070d
            r10.removeView(r9)
        L_0x070d:
            boolean r10 = r7.f161849E
            if (r10 != 0) goto L_0x0725
            java.lang.Class<ht1.t1> r10 = ht1.C60200t1.class
            bl3.r$a r2 = r2.mo62446e(r10)
            java.lang.Class<rs1.lb> r10 = rs1.C63566lb.class
            bl3.c r2 = r2.mo62447c(r10)
            rs1.lb r2 = (rs1.C63566lb) r2
            r10 = 2
            r11 = 0
            r12 = 0
            rs1.C63566lb.C13324a.m12677a(r2, r12, r11, r10, r11)
        L_0x0725:
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            androidx.appcompat.app.AppCompatActivity r10 = r8.getActivity()
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.heightPixels
            if (r2 >= r10) goto L_0x0744
            r2 = r10
        L_0x0744:
            androidx.appcompat.app.AppCompatActivity r10 = r8.getActivity()
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.widthPixels
            androidx.appcompat.app.AppCompatActivity r11 = r8.getActivity()
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            int r11 = r11.heightPixels
            if (r10 <= r11) goto L_0x0763
            r10 = r11
        L_0x0763:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r5.mo3513o()
            java.util.LinkedList r11 = r11.getMediaList()
            er1.w3 r15 = er1.C58784w3.f168295a
            float r11 = r15.mo83925e0(r11)
            float r12 = (float) r10
            r13 = 1065353216(0x3f800000, float:1.0)
            float r14 = r12 * r13
            float r13 = (float) r2
            float r14 = r14 / r13
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r18 = r15
            r15 = -1
            r6.<init>(r15, r15)
            r15 = 17
            r6.gravity = r15
            int r14 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0792
            float r12 = r12 / r11
            int r2 = iy3.C60641c.m70921b(r12)
            r6.width = r2
            r6.height = r10
            goto L_0x079c
        L_0x0792:
            r6.width = r2
            float r13 = r13 * r11
            int r2 = iy3.C60641c.m70921b(r13)
            r6.height = r2
        L_0x079c:
            r2 = 1
            r0.addView(r9, r2, r6)
            r2 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r2 = r1.mo85812D(r2)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r2 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r2
            if (r2 == 0) goto L_0x07ac
            goto L_0x07b5
        L_0x07ac:
            r2 = 2131304472(0x7f092018, float:1.8227088E38)
            android.view.View r2 = r1.mo85812D(r2)
            gr1.n2 r2 = (gr1.C59667n2) r2
        L_0x07b5:
            r0.setFullSeekBar(r2)
            boolean r2 = r8.f38408x
            if (r2 == 0) goto L_0x07e5
            boolean r2 = r8.f38407w
            if (r2 == 0) goto L_0x07e5
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderNewStyleTimelineUI
            if (r2 != 0) goto L_0x07e5
            gr1.n2 r2 = r0.getFullSeekBar()
            if (r2 == 0) goto L_0x07d7
            boolean r2 = r2.mo4264n()
            r6 = 1
            if (r2 != r6) goto L_0x07d7
            r2 = 1
            goto L_0x07d8
        L_0x07d7:
            r2 = 0
        L_0x07d8:
            if (r2 == 0) goto L_0x07e5
            gr1.n2 r2 = r0.getFullSeekBar()
            if (r2 == 0) goto L_0x07e5
            java.lang.String r6 = "clickEnterLandscape"
            r2.mo4259i(r6)
        L_0x07e5:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r5.mo3513o()
            boolean r2 = r2.isLongVideo()
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r6 = r0.getLongVideoSeekBarLayout()
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r6 = r6.getLongVideoSeekBar()
            r7.setLongVideoSeekBar(r6)
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r6 = r0.getLongVideoSeekBarLayout()
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r6 = r6.getLongVideoSeekBar()
            com.tencent.mm.plugin.finder.view.o6 r10 = new com.tencent.mm.plugin.finder.view.o6
            r10.<init>(r0)
            r6.setOnSeekStart(r10)
            com.tencent.mm.plugin.finder.view.p6 r10 = new com.tencent.mm.plugin.finder.view.p6
            r10.<init>(r0)
            r6.setOnSeekEnd(r10)
            com.tencent.mm.plugin.finder.view.q6 r10 = new com.tencent.mm.plugin.finder.view.q6
            r10.<init>(r0, r9, r6, r7)
            r6.setPlayStatusListener(r10)
            com.tencent.mm.plugin.finder.view.r6 r10 = new com.tencent.mm.plugin.finder.view.r6
            r10.<init>(r6, r9, r0, r7)
            r6.setPlayBtnOnClickListener(r10)
            int r10 = r9.getVideoDuration()
            r6.setVideoTotalTime(r10)
            android.widget.TextView r11 = r0.getTotalTimeTv()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            int r13 = r10 / 60
            java.lang.String r13 = r0.mo4787c(r13)
            r12.append(r13)
            r13 = 58
            r12.append(r13)
            int r10 = r10 % 60
            java.lang.String r10 = r0.mo4787c(r10)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.setText(r10)
            long r10 = r9.getCurrentPlayMs()
            r12 = 1000(0x3e8, float:1.401E-42)
            long r12 = (long) r12
            long r10 = r10 / r12
            int r11 = (int) r10
            r6.seek(r11)
            r0.mo4790f(r9, r11)
            boolean r10 = r9.isPlaying()
            r6.setIsPlay(r10)
            com.tencent.mm.plugin.finder.view.s6 r10 = new com.tencent.mm.plugin.finder.view.s6
            r10.<init>(r9, r6, r0, r7)
            r6.setIplaySeekCallback(r10)
            r6 = 8
            if (r2 == 0) goto L_0x093d
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r2.getSpeedCtrlBtn()
            r10 = 0
            r2.setVisibility(r10)
            float r2 = r9.getPlaySpeedRatio()
            r10 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x0888
            r10 = 1
            goto L_0x0889
        L_0x0888:
            r10 = 0
        L_0x0889:
            r11 = 2131756251(0x7f1004db, float:1.9143404E38)
            if (r10 == 0) goto L_0x0892
            r11 = 2131756250(0x7f1004da, float:1.9143402E38)
            goto L_0x08bb
        L_0x0892:
            r10 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x089a
            r10 = 1
            goto L_0x089b
        L_0x089a:
            r10 = 0
        L_0x089b:
            if (r10 == 0) goto L_0x089e
            goto L_0x08bb
        L_0x089e:
            r10 = 1069547520(0x3fc00000, float:1.5)
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x08a6
            r10 = 1
            goto L_0x08a7
        L_0x08a6:
            r10 = 0
        L_0x08a7:
            if (r10 == 0) goto L_0x08ad
            r11 = 2131756252(0x7f1004dc, float:1.9143406E38)
            goto L_0x08bb
        L_0x08ad:
            r10 = 1073741824(0x40000000, float:2.0)
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x08b5
            r2 = 1
            goto L_0x08b6
        L_0x08b5:
            r2 = 0
        L_0x08b6:
            if (r2 == 0) goto L_0x08bb
            r11 = 2131756253(0x7f1004dd, float:1.9143408E38)
        L_0x08bb:
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r2.getSpeedCtrlBtn()
            r2.setImageResource(r11)
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r2.getSpeedCtrlBtn()
            com.tencent.mm.plugin.finder.view.t6 r10 = new com.tencent.mm.plugin.finder.view.t6
            r10.<init>(r0)
            r2.setOnClickListener(r10)
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            android.view.View r2 = r2.getBulletBtnLayout()
            java.lang.Object r10 = r1.f173503E
            boolean r11 = r10 instanceof cm1.C55018j0
            if (r11 == 0) goto L_0x08e7
            cm1.j0 r10 = (cm1.C55018j0) r10
            goto L_0x08e8
        L_0x08e7:
            r10 = 0
        L_0x08e8:
            if (r10 == 0) goto L_0x08f3
            boolean r10 = r10.mo76076p0()
            r11 = 1
            if (r10 != r11) goto L_0x08f3
            r10 = 1
            goto L_0x08f4
        L_0x08f3:
            r10 = 0
        L_0x08f4:
            if (r10 == 0) goto L_0x08f8
            r10 = 0
            goto L_0x08fa
        L_0x08f8:
            r10 = 8
        L_0x08fa:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.mo10233c(r10)
            java.lang.Object[] r24 = r11.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout"
            java.lang.String r26 = "attachSeekBar"
            java.lang.String r27 = "(Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout;Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r2
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r10 = 0
            java.lang.Object r11 = r11.mo10231a(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r2.setVisibility(r10)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout"
            java.lang.String r25 = "attachSeekBar"
            java.lang.String r26 = "(Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout;Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0992
        L_0x093d:
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r2.getSpeedCtrlBtn()
            r2.setVisibility(r6)
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            android.view.View r2 = r2.getBulletBtnLayout()
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r10.mo10233c(r11)
            java.lang.Object[] r24 = r10.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout"
            java.lang.String r26 = "attachSeekBar"
            java.lang.String r27 = "(Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout;Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r2
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r11 = 0
            java.lang.Object r10 = r10.mo10231a(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r2.setVisibility(r10)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout"
            java.lang.String r25 = "attachSeekBar"
            java.lang.String r26 = "(Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout;Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x0992:
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            android.widget.TextView r2 = r2.getDescTv()
            com.tencent.mm.plugin.finder.view.u6 r10 = new com.tencent.mm.plugin.finder.view.u6
            r10.<init>(r2, r0)
            r2.setOnClickListener(r10)
            r12 = 0
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r13 = r2.getLongVideoSeekBar()
            com.tencent.mm.plugin.finder.view.v6 r2 = new com.tencent.mm.plugin.finder.view.v6
            r10 = r2
            r11 = r0
            r14 = r9
            r32 = r18
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            r0.setOnTouchListener(r2)
            long r10 = r9.getCurrentPlayMs()
            boolean r2 = r9.isPlaying()
            if (r2 != 0) goto L_0x09c8
            rs1.a4 r2 = rs1.C13109a4.f37319d
            r0.post(r2)
        L_0x09c8:
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            java.lang.String r12 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            gy3.C87412m.m108592e(r2, r12)
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r12 = 80
            r2.gravity = r12
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            r2.requestLayout()
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderNewStyleTimelineUI
            if (r2 == 0) goto L_0x09f7
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            android.widget.TextView r2 = r2.getDescTv()
            r2.setVisibility(r6)
        L_0x09f5:
            r8 = 0
            goto L_0x0a67
        L_0x09f7:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r5.mo3513o()
            android.text.SpannableString r2 = r2.getDescriptionFullSpan()
            if (r2 == 0) goto L_0x0a4d
            int r8 = r2.length()
            if (r8 <= 0) goto L_0x0a09
            r8 = 1
            goto L_0x0a0a
        L_0x0a09:
            r8 = 0
        L_0x0a0a:
            if (r8 == 0) goto L_0x0a0d
            goto L_0x0a0e
        L_0x0a0d:
            r2 = 0
        L_0x0a0e:
            if (r2 == 0) goto L_0x0a4d
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r8 = r0.getLongVideoSeekBarLayout()
            android.widget.TextView r8 = r8.getDescTv()
            r8.setText(r2)
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r8 = r0.getLongVideoSeekBarLayout()
            android.widget.TextView r8 = r8.getHiddenTv()
            r8.setText(r2)
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r8 = r0.getLongVideoSeekBarLayout()
            android.widget.TextView r8 = r8.getDescTv()
            r12 = r32
            r12.mo83876I1(r8, r2)
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r8 = r0.getLongVideoSeekBarLayout()
            android.widget.TextView r8 = r8.getHiddenTv()
            r12.mo83876I1(r8, r2)
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            android.widget.TextView r2 = r2.getDescTv()
            r8 = 0
            r2.setVisibility(r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0a4e
        L_0x0a4d:
            r2 = 0
        L_0x0a4e:
            if (r2 != 0) goto L_0x09f5
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            android.widget.TextView r2 = r2.getDescTv()
            r2.setVisibility(r6)
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            android.widget.TextView r2 = r2.getHiddenTv()
            r8 = 0
            r2.setText(r8)
        L_0x0a67:
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r2 = r0.getLongVideoSeekBarLayout()
            android.widget.TextView r2 = r2.getHiddenTv()
            r12 = 4
            r2.setVisibility(r12)
            android.view.View r2 = r0.f38411A
            if (r2 != 0) goto L_0x0a78
            goto L_0x0ab8
        L_0x0a78:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12.mo10233c(r6)
            java.lang.Object[] r24 = r12.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout"
            java.lang.String r26 = "addPreview"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r2
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r6 = 0
            java.lang.Object r12 = r12.mo10231a(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r6 = r12.intValue()
            r2.setVisibility(r6)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout"
            java.lang.String r25 = "addPreview"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Z"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x0ab8:
            boolean r2 = r5 instanceof cm1.C55018j0
            if (r2 == 0) goto L_0x0ac0
            r2 = r5
            cm1.j0 r2 = (cm1.C55018j0) r2
            goto L_0x0ac1
        L_0x0ac0:
            r2 = r8
        L_0x0ac1:
            if (r2 == 0) goto L_0x0acd
            boolean r2 = r2.mo76076p0()
            r5 = 1
            if (r2 != r5) goto L_0x0ace
            r22 = 1
            goto L_0x0ad0
        L_0x0acd:
            r5 = 1
        L_0x0ace:
            r22 = 0
        L_0x0ad0:
            if (r22 == 0) goto L_0x0b20
            r2 = 2131302819(0x7f0919a3, float:1.8223735E38)
            android.view.View r1 = r1.mo85812D(r2)
            com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView r1 = (com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView) r1
            if (r1 == 0) goto L_0x0b20
            r1.setReuse(r5)
            android.view.ViewParent r2 = r1.getParent()
            gy3.C87412m.m108592e(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.removeView(r1)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            android.content.Context r3 = r7.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r3 = r3.getDimensionPixelOffset(r5)
            r2.topMargin = r3
            r3 = 2
            r0.addView(r1, r3, r2)
            he1.m r0 = r1.getBulletManager()
            r2 = 0
            r0.mo84821h(r3, r2)
            he1.m r0 = r1.getBulletManager()
            r0.mo84822i()
            r2 = 100
            rs1.b4 r0 = new rs1.b4
            r0.<init>(r1, r10, r9)
            o40.C61926c.m72666K(r2, r0)
        L_0x0b20:
            r8 = 1
            goto L_0x0b23
        L_0x0b22:
            r8 = 0
        L_0x0b23:
            if (r8 != 0) goto L_0x0b32
            java.lang.String r0 = "onConfigurationChanged: enterLandScape failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            android.app.Activity r0 = r33.getContext()
            r1 = 1
            r0.setRequestedOrientation(r1)
        L_0x0b32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13539y3.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38389A.enable();
        for (C58553c cVar : ((C13442s8) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13442s8.class)).mo12849d3()) {
            if (cVar != null) {
                cVar.mo83450a(this.f38390B);
            }
        }
        boolean z = true;
        getContext().setRequestedOrientation(1);
        ActivityInfo activityInfo = getActivity().getPackageManager().getActivityInfo(getActivity().getComponentName(), 128);
        C87412m.m108593f(activityInfo, "activity.packageManager.…ageManager.GET_META_DATA)");
        if ((activityInfo.configChanges & 128) <= 0) {
            z = false;
        }
        this.f38403s = z;
        AppCompatActivity activity = getActivity();
        MMFinderUI mMFinderUI = activity instanceof MMFinderUI ? (MMFinderUI) activity : null;
        if (mMFinderUI != null) {
            mMFinderUI.mo79124M7(this.f38403s);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f38389A.disable();
        for (C58553c cVar : ((C13442s8) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13442s8.class)).mo12849d3()) {
            if (cVar != null) {
                cVar.mo83453d(this.f38390B);
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.f38404t = false;
    }

    public void onResume() {
        super.onResume();
        boolean z = true;
        this.f38404t = true;
        if (C85875k4.m106197n0() && this.f38409y == null) {
            if (!mo12948f3() || C85875k4.m106209x(getContext().getTaskId())) {
                z = false;
            }
            this.f38409y = Boolean.valueOf(z);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
