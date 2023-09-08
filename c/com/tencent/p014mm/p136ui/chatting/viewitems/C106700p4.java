package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.chatting.view.C106698b;
import com.tencent.p014mm.p136ui.chatting.view.FoldableCellLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import zj3.C79375p;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.p4 */
public class C106700p4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FoldableCellLayout f319002d;

    /* renamed from: e */
    public final /* synthetic */ C79375p f319003e;

    /* renamed from: f */
    public final /* synthetic */ ChattingItemDyeingTemplate f319004f;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.p4$a */
    public class C106701a implements C32224a<C13598b0> {
        public C106701a() {
        }

        public Object invoke() {
            C106700p4 p4Var = C106700p4.this;
            if (p4Var.f319003e == null) {
                return null;
            }
            p4Var.f319004f.f216867v.mo91540A();
            return null;
        }
    }

    public C106700p4(ChattingItemDyeingTemplate chattingItemDyeingTemplate, FoldableCellLayout foldableCellLayout, C79375p pVar) {
        this.f319004f = chattingItemDyeingTemplate;
        this.f319002d = foldableCellLayout;
        this.f319003e = pVar;
    }

    public void run() {
        ObjectAnimator objectAnimator;
        int i;
        char c;
        FoldableCellLayout foldableCellLayout = this.f319002d;
        C106701a aVar = new C106701a();
        String str = foldableCellLayout.f318980d;
        Log.m105924i(str, "prepare to pull down, exported: " + foldableCellLayout.f318985i + ", isExcuting: " + foldableCellLayout.f318984h);
        if (!foldableCellLayout.f318985i && !foldableCellLayout.f318984h) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofInt = ObjectAnimator.ofInt(foldableCellLayout, "heightForAnim", new int[]{foldableCellLayout.getMeasuredHeight(), foldableCellLayout.getMeasuredHeight() * foldableCellLayout.getChildCount()});
            if (foldableCellLayout.getChildCount() > 1) {
                AnimatorSet.Builder play = animatorSet.play(ofInt);
                View childAt = foldableCellLayout.getChildAt(0);
                if (foldableCellLayout.getChildCount() > 2) {
                    C87412m.m108593f(childAt, "this");
                    objectAnimator = ObjectAnimator.ofFloat(new FoldableCellLayout.ViewWrapperForAnim(childAt), "scaleX", new float[]{((float) childAt.getMeasuredWidth()) / (((float) childAt.getMeasuredWidth()) + (((float) (foldableCellLayout.f318986j * 2)) * 2.0f)), 1.0f});
                    i = 1;
                } else {
                    C87412m.m108593f(childAt, "this");
                    FoldableCellLayout.ViewWrapperForAnim viewWrapperForAnim = new FoldableCellLayout.ViewWrapperForAnim(childAt);
                    i = 1;
                    objectAnimator = ObjectAnimator.ofFloat(viewWrapperForAnim, "scaleX", new float[]{((float) childAt.getMeasuredWidth()) / (((float) childAt.getMeasuredWidth()) + (((float) foldableCellLayout.f318986j) * 2.0f)), 1.0f});
                }
                play.with(objectAnimator);
                View childAt2 = foldableCellLayout.getChildAt(i);
                if (foldableCellLayout.getChildCount() > 2) {
                    C87412m.m108593f(childAt2, "this");
                    FoldableCellLayout.ViewWrapperForAnim viewWrapperForAnim2 = new FoldableCellLayout.ViewWrapperForAnim(childAt2);
                    c = 1;
                    play.with(ObjectAnimator.ofFloat(viewWrapperForAnim2, "scaleX", new float[]{((float) childAt2.getMeasuredWidth()) / (((float) childAt2.getMeasuredWidth()) + (((float) foldableCellLayout.f318986j) * 2.0f)), 1.0f}));
                } else {
                    c = 1;
                }
                View childAt3 = foldableCellLayout.getChildAt(0);
                float[] fArr = new float[2];
                fArr[0] = 0.0f;
                fArr[c] = -foldableCellLayout.f318987n;
                play.with(ObjectAnimator.ofFloat(childAt3, "translationY", fArr));
                int childCount = foldableCellLayout.getChildCount();
                int i2 = 1;
                int i3 = 0;
                while (i2 < childCount) {
                    View childAt4 = foldableCellLayout.getChildAt(i2);
                    i3 += foldableCellLayout.getChildAt(i2 - 1).getMeasuredHeight();
                    float[] fArr2 = new float[2];
                    fArr2[0] = 0.0f;
                    int i4 = 2 > i2 ? i2 : 2;
                    i2++;
                    int i5 = (i3 - (i4 * foldableCellLayout.f318986j)) - (((int) foldableCellLayout.f318987n) * i2);
                    if (i5 <= 0) {
                        i5 = 0;
                    }
                    fArr2[1] = (float) i5;
                    play.with(ObjectAnimator.ofFloat(childAt4, "translationY", fArr2));
                }
                animatorSet.setDuration(foldableCellLayout.getChildCount() >= 5 ? foldableCellLayout.f318982f : foldableCellLayout.f318981e);
                animatorSet.addListener(new C106698b(foldableCellLayout, aVar, animatorSet));
                if (foldableCellLayout.getChildCount() > 2) {
                    int childCount2 = foldableCellLayout.getChildCount() - 1;
                    for (int i6 = 2; i6 < childCount2; i6++) {
                        View childAt5 = foldableCellLayout.getChildAt(i6);
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view = childAt5;
                        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "pullDownContent", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "pullDownContent", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                animatorSet.start();
            }
        }
    }
}
