package tk1;

import a14.C0000n0;
import a14.C53965x0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.tencent.p014mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView;
import com.tencent.p014mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C51587ur2;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView$render$1", mo125469f = "FinderLiveLogoGroupView.kt", mo125470l = {143}, mo125471m = "invokeSuspend")
/* renamed from: tk1.a */
public final class C52351a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f146326d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveLogoGroupView f146327e;

    /* renamed from: tk1.a$a */
    public static final class C52352a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveLogoGroupView f146328a;

        /* renamed from: b */
        public final /* synthetic */ FinderLiveLogoItemView f146329b;

        public C52352a(FinderLiveLogoGroupView finderLiveLogoGroupView, FinderLiveLogoItemView finderLiveLogoItemView) {
            this.f146328a = finderLiveLogoGroupView;
            this.f146329b = finderLiveLogoItemView;
        }

        public void onAnimationEnd(Animation animation) {
            Log.m105924i("FinderLiveLogoGroupView", "#render animatorOut onAnimationEnd");
            this.f146328a.f111680f.removeView(this.f146329b);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52351a(FinderLiveLogoGroupView finderLiveLogoGroupView, C15601d<? super C52351a> dVar) {
        super(2, dVar);
        this.f146327e = finderLiveLogoGroupView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C52351a(this.f146327e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C52351a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f146326d;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("FinderLiveLogoGroupView", "#render mainScope.launch");
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (this.f146327e.f111681g.isEmpty() ^ z) {
            C8478d0 d0Var = new C8478d0();
            FinderLiveLogoGroupView finderLiveLogoGroupView = this.f146327e;
            if (finderLiveLogoGroupView.f111682h == null) {
                int currentTimeMillis = (int) (System.currentTimeMillis() % ((long) ((ArrayList) this.f146327e.f111681g).size()));
                d0Var.f27483d = currentTimeMillis;
                FinderLiveLogoGroupView finderLiveLogoGroupView2 = this.f146327e;
                finderLiveLogoGroupView2.f111682h = (C51587ur2) C110818d0.m150917O(finderLiveLogoGroupView2.f111681g, currentTimeMillis);
            } else {
                int i2 = 0;
                for (T next : finderLiveLogoGroupView.f111681g) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C51587ur2 ur22 = (C51587ur2) next;
                        C51587ur2 ur23 = finderLiveLogoGroupView.f111682h;
                        if (C87412m.m108589b(ur23 != null ? ur23.f143044f : null, ur22.f143044f) && i3 < ((ArrayList) finderLiveLogoGroupView.f111681g).size()) {
                            d0Var.f27483d = i3;
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                FinderLiveLogoGroupView finderLiveLogoGroupView3 = this.f146327e;
                finderLiveLogoGroupView3.f111682h = (C51587ur2) C110818d0.m150917O(finderLiveLogoGroupView3.f111681g, d0Var.f27483d);
            }
            Log.m105924i("FinderLiveLogoGroupView", "#render currentShowTask: index=" + d0Var.f27483d + ' ' + this.f146327e.f111682h);
            FinderLiveLogoGroupView finderLiveLogoGroupView4 = this.f146327e;
            C51587ur2 ur24 = finderLiveLogoGroupView4.f111682h;
            if (ur24 != null) {
                if (finderLiveLogoGroupView4.f111683i == null) {
                    Log.m105924i("FinderLiveLogoGroupView", "#render first time to show child view");
                    Context context = finderLiveLogoGroupView4.getContext();
                    C87412m.m108593f(context, "context");
                    FinderLiveLogoItemView finderLiveLogoItemView = new FinderLiveLogoItemView(context, (AttributeSet) null, 2, (C8480h) null);
                    finderLiveLogoItemView.mo3385a(ur24);
                    finderLiveLogoGroupView4.f111680f.addView(finderLiveLogoItemView);
                    finderLiveLogoGroupView4.f111683i = finderLiveLogoItemView;
                } else if (((ArrayList) finderLiveLogoGroupView4.f111681g).size() == z) {
                    Log.m105924i("FinderLiveLogoGroupView", "#render taskList.size == 1");
                    FinderLiveLogoItemView finderLiveLogoItemView2 = finderLiveLogoGroupView4.f111683i;
                    if (finderLiveLogoItemView2 != null) {
                        finderLiveLogoItemView2.mo3385a(ur24);
                    }
                } else {
                    Log.m105924i("FinderLiveLogoGroupView", "#render not first time to show child view");
                    FinderLiveLogoItemView finderLiveLogoItemView3 = finderLiveLogoGroupView4.f111683i;
                    TranslateAnimation translateAnimation = r11;
                    TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
                    translateAnimation.setAnimationListener(new C52352a(finderLiveLogoGroupView4, finderLiveLogoItemView3));
                    translateAnimation.setDuration(400);
                    if (finderLiveLogoItemView3 != null) {
                        finderLiveLogoItemView3.startAnimation(translateAnimation);
                    }
                    Context context2 = finderLiveLogoGroupView4.getContext();
                    C87412m.m108593f(context2, "context");
                    FinderLiveLogoItemView finderLiveLogoItemView4 = new FinderLiveLogoItemView(context2, (AttributeSet) null, 2, (C8480h) null);
                    finderLiveLogoItemView4.mo3385a(ur24);
                    finderLiveLogoGroupView4.f111680f.addView(finderLiveLogoItemView4);
                    finderLiveLogoGroupView4.f111683i = finderLiveLogoItemView4;
                    TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                    translateAnimation3.setDuration(400);
                    finderLiveLogoItemView4.startAnimation(translateAnimation3);
                }
            }
            C51587ur2 ur25 = this.f146327e.f111682h;
            long j = (ur25 != null ? ur25.f143047i : 0) * ((long) 1000);
            long j2 = 3000;
            if (j == 0) {
                j = 3000;
            }
            if (j >= 3000) {
                j2 = j;
            }
            z = true;
            this.f146326d = 1;
            if (C53965x0.m60607b(j2, this) == aVar) {
                return aVar;
            }
        }
        Log.m105924i("FinderLiveLogoGroupView", "#render taskList is empty");
        FinderLiveLogoGroupView finderLiveLogoGroupView5 = this.f146327e;
        finderLiveLogoGroupView5.f111682h = null;
        finderLiveLogoGroupView5.f111680f.removeAllViews();
        this.f146327e.f111683i = null;
        return C13598b0.f38549a;
    }
}
