package th1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import f50.C58915a;
import f50.C58924d;
import fy3.C32224a;
import fy3.C32226l;
import g50.C59364c;
import gy3.C87412m;
import java.util.HashSet;
import ph1.C11940k;
import ph1.C62289d;
import qh1.C62620a;
import qt1.C12932c;
import rx3.C13598b0;
import sh1.C63893c;
import te3.C64890zp2;
import wh1.C66114a;
import wh1.C66115b;

/* renamed from: th1.c */
public final class C64935c extends C63893c {

    /* renamed from: A */
    public int f186975A;

    /* renamed from: v */
    public boolean f186976v;

    /* renamed from: w */
    public boolean f186977w;

    /* renamed from: x */
    public boolean f186978x;

    /* renamed from: y */
    public final HashSet<Integer> f186979y = new HashSet<>();

    /* renamed from: z */
    public C58924d f186980z;

    /* renamed from: th1.c$a */
    public static final class C64936a extends C58915a {

        /* renamed from: d */
        public final /* synthetic */ C64935c f186981d;

        /* renamed from: e */
        public final /* synthetic */ boolean f186982e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f186983f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<Boolean> f186984g;

        public C64936a(C64935c cVar, boolean z, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
            this.f186981d = cVar;
            this.f186982e = z;
            this.f186983f = lVar;
            this.f186984g = aVar;
        }

        public void onNetStatus(Bundle bundle) {
        }

        public void onPlayEvent(int i, Bundle bundle) {
            super.onPlayEvent(i, bundle);
            if (i == -2304) {
                String str = this.f186981d.f181104e;
                Log.m105924i(str, "switchInLiveRoom playEventErrors: " + i);
                C64935c.m76533z(this.f186981d, i);
                this.f186981d.mo89088B("playEventErrors", this.f186983f, this.f186984g);
            } else if (i == 2009) {
                Log.m105924i(this.f186981d.f181104e, "switchInLiveRoom onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
                C64935c.m76532y(this.f186981d, bundle);
                this.f186981d.mo89088B("onPlayEvent PLAY_EVT_CHANGE_RESOLUTION", this.f186983f, this.f186984g);
            } else if (i == 2033) {
                boolean z = bundle != null ? bundle.getBoolean("fromCustomRender") : false;
                String str2 = this.f186981d.f181104e;
                Log.m105924i(str2, "switchInLiveRoom onPlayEvent EVT_PLAY_VIEW_CHANGED_FIRST_I_FRAME  isCustomRender: " + this.f186982e + " fromCustomRender: " + z);
                if (!this.f186982e || z) {
                    C64935c cVar = this.f186981d;
                    cVar.f186976v = true;
                    cVar.mo89088B("onPlayEvent", this.f186983f, this.f186984g);
                }
            }
        }
    }

    /* renamed from: th1.c$b */
    public static final class C64937b extends C62620a {

        /* renamed from: d */
        public final /* synthetic */ C64935c f186985d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f186986e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<Boolean> f186987f;

        public C64937b(C64935c cVar, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
            this.f186985d = cVar;
            this.f186986e = lVar;
            this.f186987f = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i(this.f186985d.f181104e, "switchInLiveRoom switch view success.");
            C64935c cVar = this.f186985d;
            cVar.f186977w = true;
            cVar.mo89088B("onAnimationEnd1", this.f186986e, this.f186987f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64935c(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: y */
    public static final void m76532y(C64935c cVar, Bundle bundle) {
        C62289d A = cVar.mo89087A();
        int i = 0;
        A.f177092d = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
        if (bundle != null) {
            i = bundle.getInt("EVT_PARAM2");
        }
        A.f177093e = i;
        A.f177094f = (cVar.mo89087A().f177092d == 0 || cVar.mo89087A().f177093e == 0) ? 0.0f : (((float) cVar.mo89087A().f177092d) * 1.0f) / ((float) cVar.mo89087A().f177093e);
    }

    /* renamed from: z */
    public static final void m76533z(C64935c cVar, int i) {
        String str = cVar.f181104e;
        Log.m105924i(str, "handleSwitchError: " + i + " set: " + cVar.f186979y);
        cVar.f186979y.add(Integer.valueOf(i));
        C66115b.f190032a.mo90157b(cVar.mo89087A().f177067j);
    }

    /* renamed from: A */
    public final C62289d mo89087A() {
        return (C62289d) mo88668x();
    }

    /* renamed from: B */
    public final void mo89088B(String str, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
        String str2 = this.f181104e;
        Log.m105924i(str2, "handleSwitchInLiveRoomCallback isStartedLivePlay:" + this.f186976v + " invokeSource: " + str + " errorSet: " + this.f186979y + " hasCallback: " + this.f186978x);
        if (!this.f186976v && this.f186979y.size() == 0) {
            String str3 = this.f181104e;
            Log.m105928w(str3, str + " handleSwitchInLiveRoomCallback return for isStartedLivePlay:" + this.f186976v);
        } else if (!this.f186977w) {
            String str4 = this.f181104e;
            Log.m105928w(str4, str + " handleSwitchInLiveRoomCallback return for isStartedLivePlay:" + this.f186976v);
        } else if (this.f186978x) {
            String str5 = this.f181104e;
            Log.m105928w(str5, str + " handleSwitchInLiveRoomCallback hasCallback");
        } else {
            String str6 = this.f181104e;
            Log.m105924i(str6, str + " handleSwitchInLiveRoomCallback");
            boolean z = true;
            this.f186978x = true;
            if (this.f186979y.size() <= 0) {
                z = false;
            }
            lVar.invoke(Boolean.valueOf(z));
            if (aVar.invoke().booleanValue()) {
                mo84332p();
            }
        }
    }

    /* renamed from: c */
    public void mo84318c(LiveVideoView liveVideoView, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
        C87412m.m108594g(liveVideoView, "renderView");
        C87412m.m108594g(lVar, "onFirstFrameRenderCallback");
        C87412m.m108594g(aVar, "isDetachInvokeFun");
        String str = this.f181104e;
        StringBuilder sb = new StringBuilder();
        sb.append("switchInLiveRoom isRunning:");
        AnimatorSet animatorSet = this.f181111o;
        C13598b0 b0Var = null;
        sb.append(animatorSet != null ? Boolean.valueOf(animatorSet.isRunning()) : null);
        sb.append(" livePlayer: ");
        sb.append(this.f186980z);
        Log.m105924i(str, sb.toString());
        C12932c cVar = C11940k.f34875a;
        C12932c cVar2 = C11940k.f34875a;
        cVar2.mo12482c("switchInLiveRoom before");
        C58924d dVar = this.f186980z;
        boolean z = dVar instanceof C59364c;
        if (dVar != null) {
            dVar.setPlayListener(new C64936a(this, z, lVar, aVar));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            this.f186976v = true;
            String str2 = this.f181104e;
            Log.m105924i(str2, "isStartedLivePlay:" + this.f186976v);
        }
        C58924d dVar2 = this.f186980z;
        if (dVar2 != null) {
            dVar2.setPlayerView(liveVideoView);
        }
        AnimatorSet animatorSet2 = this.f181111o;
        boolean z2 = false;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            z2 = true;
        }
        if (z2) {
            AnimatorSet animatorSet3 = this.f181111o;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new C64937b(this, lVar, aVar));
            }
        } else {
            Log.m105924i(this.f181104e, "switchInLiveRoom switch view success.");
            this.f186977w = true;
            mo89088B("onAnimationEnd2", lVar, aVar);
        }
        cVar2.mo11310b("switchInLiveRoom after");
    }

    /* renamed from: g */
    public void mo84322g() {
        AnimatorSet animatorSet = this.f181111o;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        mo84332p();
    }

    /* renamed from: h */
    public void mo84323h(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
        String str = this.f181104e;
        Log.m105924i(str, "start preloadPlayer:" + mo89087A().f177068k);
        mo88662u(aVar);
        this.f186977w = false;
        if (mo89087A().f177068k) {
            String str2 = mo89087A().f177067j;
            C64890zp2 zp22 = mo89087A().f177069l;
            if (TextUtils.isEmpty(str2)) {
                String str3 = this.f181104e;
                Log.m105928w(str3, "preloadStartLivePlayer return for liveUrl:" + str2);
                return;
            }
            String str4 = this.f181104e;
            StringBuilder sb = new StringBuilder();
            sb.append("preloadStartLivePlayer liveUrl:");
            sb.append(str2);
            sb.append(",liveSdkChannelParams is null:");
            sb.append(zp22 == null);
            Log.m105924i(str4, sb.toString());
            this.f186976v = false;
            int e = C59364c.m69282e(false);
            C59364c cVar = new C59364c(this.f181103d, true, (e == 5 || e == 6) ? 2 : 0);
            this.f186980z = cVar;
            cVar.enableHardwareDecode(true);
            C58924d dVar = this.f186980z;
            if (dVar != null) {
                dVar.setConfig(C58739j4.m68256z(C58739j4.f168176a, true, 0, 2, (Object) null));
            }
            C58924d dVar2 = this.f186980z;
            if (dVar2 != null) {
                dVar2.setMute(true);
            }
            C58924d dVar3 = this.f186980z;
            if (dVar3 != null) {
                dVar3.setRenderMode(0);
            }
            C58924d dVar4 = this.f186980z;
            if (dVar4 != null) {
                dVar4.setPlayListener(new C64934b(this));
            }
            C58924d dVar5 = this.f186980z;
            if (dVar5 != null) {
                dVar5.mo84115f(C66115b.f190032a.mo90156a(mo89087A().f177067j, mo89087A().f177069l), 1, zp22);
            }
        }
    }

    /* renamed from: m */
    public Rect mo84327m() {
        View view = this.f181116q;
        if (view != null) {
            int[] iArr = new int[2];
            C66114a.f190029a.mo90152d(view, iArr);
            ViewGroup viewGroup = (ViewGroup) view;
            C62289d A = mo89087A();
            int i = iArr[0];
            A.f177096h = new Rect(i, iArr[1], viewGroup.getWidth() + i, iArr[1] + viewGroup.getHeight());
        }
        return mo89087A().f177096h;
    }

    /* renamed from: n */
    public Rect mo84328n() {
        C66114a aVar = C66114a.f190029a;
        int i = C66114a.f190030b;
        int i2 = C66114a.f190031c;
        float e = aVar.mo90153e(mo88668x(), (Point) null);
        int i3 = (int) (((float) mo88668x().f177092d) * e);
        int i4 = (int) (e * ((float) mo88668x().f177093e));
        int i5 = (i - i3) / 2;
        int i6 = (i2 - i4) / 2;
        return new Rect(i5, i6, i3 + i5, i4 + i6);
    }

    /* renamed from: p */
    public void mo84332p() {
        this.f181117r = true;
        FrameLayout frameLayout = this.f181118s;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener((View.OnTouchListener) null);
        }
        ViewGroup viewGroup = this.f181120u;
        if (viewGroup != null) {
            View findViewWithTag = viewGroup.findViewWithTag("fluent_view_tag");
            if (findViewWithTag != null) {
                findViewWithTag.setOnTouchListener((View.OnTouchListener) null);
            }
            String str = this.f181104e;
            Log.m105924i(str, "detachFloatView view:" + findViewWithTag);
            View view = mo89087A().f177066i;
            String str2 = this.f181104e;
            Log.m105924i(str2, "detachMaskView maskView:" + view);
            if (!(view instanceof ImageView)) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view);
                }
                View view2 = mo89087A().f177091c;
                ViewGroup viewGroup3 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                if (viewGroup3 != null) {
                    int i = this.f186975A;
                    int i2 = (i <= 0 || i >= viewGroup3.getChildCount()) ? 0 : this.f186975A;
                    String str3 = this.f181104e;
                    Log.m105924i(str3, "detachMaskView recover maskView validIndex: " + i2 + " childCount: " + viewGroup3.getChildCount());
                    viewGroup3.addView(view, i2);
                }
            }
            viewGroup.removeView(findViewWithTag);
        }
        this.f181116q = null;
        this.f181120u = null;
    }

    /* renamed from: r */
    public String mo84333r() {
        return "SwitchOutImageDirector";
    }

    /* renamed from: v */
    public void mo84339v() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mo88660q().width(), mo88660q().height());
        layoutParams.gravity = 17;
        View view = mo89087A().f177066i;
        if (!(view instanceof ImageView)) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        i = viewGroup.getChildCount() - 1;
                        break;
                    } else if (C87412m.m108589b(viewGroup.getChildAt(i), view)) {
                        break;
                    } else {
                        i++;
                    }
                }
                this.f186975A = i;
                Log.m105924i(this.f181104e, "addMaskView originIndex: " + this.f186975A);
                viewGroup.removeView(view);
            }
            RoundedCornerFrameLayout roundedCornerFrameLayout = this.f181119t;
            if (roundedCornerFrameLayout != null) {
                roundedCornerFrameLayout.addView(view, layoutParams);
                return;
            }
            return;
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout2 = this.f181119t;
        if (roundedCornerFrameLayout2 != null) {
            ImageView imageView = new ImageView(this.f181103d);
            ImageView imageView2 = (ImageView) view;
            imageView.setImageDrawable(imageView2.getDrawable());
            imageView.setScaleType(imageView2.getScaleType());
            roundedCornerFrameLayout2.addView(imageView, layoutParams);
        }
    }

    /* renamed from: w */
    public int mo88667w() {
        return C0966R.C0969drawable.ayi;
    }
}
