package com.tencent.p014mm.plugin.finder.live.view;

import a14.C0000n0;
import a14.C53965x0;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C51733vs1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView$render$1", mo125469f = "FinderLiveGameWelfareTaskProgressView.kt", mo125470l = {170}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.live.view.o0 */
public final class C41474o0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f111690d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveGameWelfareTaskProgressView f111691e;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.o0$a */
    public static final class C41475a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveGameWelfareTaskProgressView f111692a;

        /* renamed from: b */
        public final /* synthetic */ FinderLiveGameWelfareTaskProgressItemView f111693b;

        public C41475a(FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView, FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView) {
            this.f111692a = finderLiveGameWelfareTaskProgressView;
            this.f111693b = finderLiveGameWelfareTaskProgressItemView;
        }

        public void onAnimationEnd(Animation animation) {
            Log.m105924i("FinderLiveGameWelfareTaskProgressView", "#render animatorOut onAnimationEnd");
            this.f111692a.f111664g.removeView(this.f111693b);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41474o0(FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView, C15601d<? super C41474o0> dVar) {
        super(2, dVar);
        this.f111691e = finderLiveGameWelfareTaskProgressView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C41474o0(this.f111691e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C41474o0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f111690d;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("FinderLiveGameWelfareTaskProgressView", "#render mainScope.launch");
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (this.f111691e.f111669o.isEmpty() ^ z) {
            FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView = this.f111691e;
            if (finderLiveGameWelfareTaskProgressView.f111670p == null) {
                finderLiveGameWelfareTaskProgressView.f111670p = (C51733vs1) C110818d0.m150916N(finderLiveGameWelfareTaskProgressView.f111669o);
            } else {
                int i2 = 0;
                int i3 = 0;
                for (T next : finderLiveGameWelfareTaskProgressView.f111669o) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C51733vs1 vs12 = (C51733vs1) next;
                        C51733vs1 vs13 = finderLiveGameWelfareTaskProgressView.f111670p;
                        if (C87412m.m108589b(vs13 != null ? vs13.f143676n : null, vs12.f143676n) && i4 < ((ArrayList) finderLiveGameWelfareTaskProgressView.f111669o).size()) {
                            i2 = i4;
                        }
                        i3 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView2 = this.f111691e;
                finderLiveGameWelfareTaskProgressView2.f111670p = (C51733vs1) C110818d0.m150917O(finderLiveGameWelfareTaskProgressView2.f111669o, i2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("#render currentShowTask task id: ");
            C51733vs1 vs14 = this.f111691e.f111670p;
            sb.append(vs14 != null ? vs14.f143676n : null);
            Log.m105924i("FinderLiveGameWelfareTaskProgressView", sb.toString());
            FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView3 = this.f111691e;
            C51733vs1 vs15 = finderLiveGameWelfareTaskProgressView3.f111670p;
            if (vs15 != null) {
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                ((C54116w) c).hy0(C54067f0.C39610v.TASK_EXPOSURE, vs15.f143675j, 0);
                if (finderLiveGameWelfareTaskProgressView3.f111671q == null) {
                    Log.m105924i("FinderLiveGameWelfareTaskProgressView", "#render first time to show child view");
                    Context context = finderLiveGameWelfareTaskProgressView3.getContext();
                    C87412m.m108593f(context, "context");
                    FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView = new FinderLiveGameWelfareTaskProgressItemView(context, (AttributeSet) null, 2, (C8480h) null);
                    finderLiveGameWelfareTaskProgressItemView.mo64552a(vs15);
                    finderLiveGameWelfareTaskProgressView3.f111664g.addView(finderLiveGameWelfareTaskProgressItemView);
                    finderLiveGameWelfareTaskProgressView3.f111671q = finderLiveGameWelfareTaskProgressItemView;
                } else if (((ArrayList) finderLiveGameWelfareTaskProgressView3.f111669o).size() == z) {
                    Log.m105924i("FinderLiveGameWelfareTaskProgressView", "#render taskList.size == 1");
                    FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView2 = finderLiveGameWelfareTaskProgressView3.f111671q;
                    if (finderLiveGameWelfareTaskProgressItemView2 != null) {
                        finderLiveGameWelfareTaskProgressItemView2.mo64552a(vs15);
                    }
                } else {
                    Log.m105924i("FinderLiveGameWelfareTaskProgressView", "#render not first time to show child view");
                    FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView3 = finderLiveGameWelfareTaskProgressView3.f111671q;
                    TranslateAnimation translateAnimation = r11;
                    TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation.setAnimationListener(new C41475a(finderLiveGameWelfareTaskProgressView3, finderLiveGameWelfareTaskProgressItemView3));
                    translateAnimation.setDuration(400);
                    if (finderLiveGameWelfareTaskProgressItemView3 != null) {
                        finderLiveGameWelfareTaskProgressItemView3.startAnimation(translateAnimation);
                    }
                    Context context2 = finderLiveGameWelfareTaskProgressView3.getContext();
                    C87412m.m108593f(context2, "context");
                    FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView4 = new FinderLiveGameWelfareTaskProgressItemView(context2, (AttributeSet) null, 2, (C8480h) null);
                    finderLiveGameWelfareTaskProgressItemView4.mo64552a(vs15);
                    finderLiveGameWelfareTaskProgressView3.f111664g.addView(finderLiveGameWelfareTaskProgressItemView4);
                    finderLiveGameWelfareTaskProgressView3.f111671q = finderLiveGameWelfareTaskProgressItemView4;
                    TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    translateAnimation3.setDuration(400);
                    finderLiveGameWelfareTaskProgressItemView4.startAnimation(translateAnimation3);
                }
            }
            z = true;
            this.f111690d = 1;
            if (C53965x0.m60607b(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, this) == aVar) {
                return aVar;
            }
        }
        Log.m105924i("FinderLiveGameWelfareTaskProgressView", "#render taskList is empty");
        FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView4 = this.f111691e;
        finderLiveGameWelfareTaskProgressView4.f111670p = null;
        finderLiveGameWelfareTaskProgressView4.f111664g.removeAllViews();
        this.f111691e.f111671q = null;
        return C13598b0.f38549a;
    }
}
