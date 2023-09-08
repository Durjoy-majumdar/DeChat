package com.tencent.p014mm.p136ui.chatting;

import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.ui.chatting.s3 */
public final class C73846s3 extends C87413o implements C32226l<MotionEvent, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C73849t3 f216714d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73846s3(C73849t3 t3Var) {
        super(1);
        this.f216714d = t3Var;
    }

    public Object invoke(Object obj) {
        boolean z;
        MotionEvent motionEvent = (MotionEvent) obj;
        C87412m.m108594g(motionEvent, LocaleUtil.ITALIAN);
        C73849t3 t3Var = this.f216714d;
        t3Var.getClass();
        boolean z2 = false;
        boolean z3 = true;
        if (motionEvent.getAction() == 0) {
            ChattingUIFragment chattingUIFragment = t3Var.f216725f;
            if (chattingUIFragment != null) {
                MMChattingListView mMChattingListView = chattingUIFragment.f215289B;
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (mMChattingListView != null) {
                    int[] iArr = new int[2];
                    mMChattingListView.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int measuredWidth = mMChattingListView.getMeasuredWidth() + i;
                    int measuredHeight = mMChattingListView.getMeasuredHeight() + i2;
                    if (i <= rawX && rawX <= measuredWidth) {
                        if (i2 <= rawY && rawY <= measuredHeight) {
                            z = true;
                            t3Var.f216726g = z;
                        }
                    }
                }
                z = false;
                t3Var.f216726g = z;
            } else {
                C87412m.m108603p("currentFragment");
                throw null;
            }
        }
        if (t3Var.f216726g) {
            ChattingUIFragment chattingUIFragment2 = t3Var.f216725f;
            if (chattingUIFragment2 == null) {
                C87412m.m108603p("currentFragment");
                throw null;
            } else if (chattingUIFragment2 != null) {
                MMChattingListView mMChattingListView2 = chattingUIFragment2.f215289B;
                if (mMChattingListView2 != null && mMChattingListView2.mo64386b0() && chattingUIFragment2.f215289B.getIsTopShowAll()) {
                    z2 = true;
                }
                z3 = z2;
            } else {
                C87412m.m108603p("currentFragment");
                throw null;
            }
        }
        Log.m105924i("HalfScreenChattingUIC", "dialogCanPullDown:   isDownInListViewArea:" + t3Var.f216726g + "  result:" + z3);
        return Boolean.valueOf(z3);
    }
}
