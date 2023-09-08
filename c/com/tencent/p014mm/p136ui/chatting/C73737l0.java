package com.tencent.p014mm.p136ui.chatting;

import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.ui.chatting.l0 */
public final class C73737l0 extends C87413o implements C32226l<MotionEvent, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ BizHalfScreenChattingUI f216482d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73737l0(BizHalfScreenChattingUI bizHalfScreenChattingUI) {
        super(1);
        this.f216482d = bizHalfScreenChattingUI;
    }

    public Object invoke(Object obj) {
        ChattingUIFragment chattingUIFragment;
        MMChattingListView mMChattingListView;
        boolean z;
        MotionEvent motionEvent = (MotionEvent) obj;
        C87412m.m108594g(motionEvent, LocaleUtil.ITALIAN);
        BizHalfScreenChattingUI bizHalfScreenChattingUI = this.f216482d;
        int i = BizHalfScreenChattingUI.f215238x;
        bizHalfScreenChattingUI.getClass();
        boolean z2 = true;
        if (motionEvent.getAction() == 0) {
            MMChattingListView mMChattingListView2 = bizHalfScreenChattingUI.f215277j.f215289B;
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (mMChattingListView2 != null) {
                int[] iArr = new int[2];
                mMChattingListView2.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                int measuredWidth = mMChattingListView2.getMeasuredWidth() + i2;
                int measuredHeight = mMChattingListView2.getMeasuredHeight() + i3;
                if (i2 <= rawX && rawX <= measuredWidth) {
                    if (i3 <= rawY && rawY <= measuredHeight) {
                        z = true;
                        bizHalfScreenChattingUI.f215241u = z;
                    }
                }
            }
            z = false;
            bizHalfScreenChattingUI.f215241u = z;
        }
        if (bizHalfScreenChattingUI.f215241u && ((chattingUIFragment = bizHalfScreenChattingUI.f215277j) == null || (mMChattingListView = chattingUIFragment.f215289B) == null || !mMChattingListView.mo64386b0() || !chattingUIFragment.f215289B.getIsTopShowAll())) {
            z2 = false;
        }
        Log.m105924i("MicroMsg.BizDialogChattingUI", "dialogCanPullDown:   isDownInListViewArea:" + bizHalfScreenChattingUI.f215241u + "  result:" + z2);
        return Boolean.valueOf(z2);
    }
}
