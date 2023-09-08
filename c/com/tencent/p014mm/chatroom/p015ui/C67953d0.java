package com.tencent.p014mm.chatroom.p015ui;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.chatroom.ui.d0 */
public class C67953d0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f195071a;

    /* renamed from: b */
    public final /* synthetic */ ChatroomInfoUI f195072b;

    public C67953d0(ChatroomInfoUI chatroomInfoUI, LinearLayout linearLayout) {
        this.f195072b = chatroomInfoUI;
        this.f195071a = linearLayout;
    }

    public void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = (ViewGroup) this.f195072b.getWindow().findViewById(16908290);
        boolean z = true;
        Object[] objArr = new Object[1];
        if (viewGroup != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.ChatroomInfoUI", "remove cover view now. contentView is null [%b]", objArr);
        if (viewGroup != null) {
            viewGroup.removeView(this.f195071a);
        }
        this.f195072b.getListView().setTranscriptMode(this.f195072b.f194790W);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
