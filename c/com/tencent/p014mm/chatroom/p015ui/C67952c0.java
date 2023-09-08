package com.tencent.p014mm.chatroom.p015ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import pj3.C47511g;

/* renamed from: com.tencent.mm.chatroom.ui.c0 */
public class C67952c0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public int f195068d = 0;

    /* renamed from: e */
    public final /* synthetic */ String f195069e;

    /* renamed from: f */
    public final /* synthetic */ ChatroomInfoUI f195070f;

    public C67952c0(ChatroomInfoUI chatroomInfoUI, String str) {
        this.f195070f = chatroomInfoUI;
        this.f195069e = str;
    }

    public boolean onTimerExpired() {
        C47511g gVar = this.f195070f.f194795h;
        if (gVar == null || this.f195068d > 50) {
            return false;
        }
        int g = gVar.mo72523g(this.f195069e);
        View childAt = this.f195070f.getListView().getChildAt(g - this.f195070f.getListView().getFirstVisiblePosition());
        int height = childAt != null ? childAt.getHeight() : 0;
        if (height == 0) {
            this.f195068d++;
            return true;
        }
        Log.m105919d("MicroMsg.ChatroomInfoUI", "show cover view get y[%f] height [%d] index[%d] [%d %d]", Float.valueOf(childAt.getY()), Integer.valueOf(height), Integer.valueOf(g), Integer.valueOf(this.f195070f.getListView().getFirstVisiblePosition()), Integer.valueOf(this.f195070f.getListView().getLastVisiblePosition()));
        int y = (int) childAt.getY();
        if (y < 0) {
            height += y;
            y = 0;
        }
        ChatroomInfoUI chatroomInfoUI = this.f195070f;
        chatroomInfoUI.getClass();
        LinearLayout linearLayout = new LinearLayout(chatroomInfoUI);
        linearLayout.setOrientation(1);
        View view = new View(chatroomInfoUI);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, y);
        view.setBackgroundResource(C0966R.color.a7f);
        linearLayout.addView(view, layoutParams);
        View view2 = new View(chatroomInfoUI);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, height);
        view2.setBackgroundResource(C0966R.color.ahf);
        linearLayout.addView(view2, layoutParams2);
        View view3 = new View(chatroomInfoUI);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        view3.setBackgroundResource(C0966R.color.f3131gg);
        linearLayout.addView(view3, layoutParams3);
        ViewGroup viewGroup = (ViewGroup) chatroomInfoUI.getWindow().findViewById(16908290);
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(viewGroup == null);
        Log.m105925i("MicroMsg.ChatroomInfoUI", "add cover view now. contentView is null [%b]", objArr);
        if (viewGroup != null) {
            viewGroup.addView(linearLayout);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.4f);
        alphaAnimation.setFillAfter(false);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        alphaAnimation.setDuration(600);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(1);
        alphaAnimation.setAnimationListener(new C67953d0(chatroomInfoUI, linearLayout));
        view.setAnimation(alphaAnimation);
        view3.setAnimation(alphaAnimation);
        alphaAnimation.start();
        return false;
    }
}
