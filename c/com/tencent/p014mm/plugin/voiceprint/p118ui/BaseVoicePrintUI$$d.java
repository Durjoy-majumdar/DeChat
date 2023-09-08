package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI$$d */
public class BaseVoicePrintUI$$d implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ BaseVoicePrintUI f347504d;

    public BaseVoicePrintUI$$d(BaseVoicePrintUI baseVoicePrintUI) {
        this.f347504d = baseVoicePrintUI;
    }

    public boolean onTimerExpired() {
        VoiceTipInfoView voiceTipInfoView = this.f347504d.f347490h;
        if (voiceTipInfoView.f347555f.getAnimation() == null) {
            TextView textView = voiceTipInfoView.f347555f;
            Context context = voiceTipInfoView.getContext();
            C115840p pVar = new C115840p(voiceTipInfoView);
            float width = (float) textView.getWidth();
            Log.m105918d("MicroMsg.VoiceViewAnimationHelper", "target " + width);
            int[] iArr = new int[2];
            textView.getLocationInWindow(iArr);
            int i = iArr[0];
            Log.m105919d("MicroMsg.VoiceViewAnimationHelper", "location %d %d preX=%d", Integer.valueOf(i), Integer.valueOf(iArr[1]), Integer.valueOf((int) (((float) i) + width)));
            Animation loadAnimation = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2517f7);
            loadAnimation.setDuration(200);
            loadAnimation.setStartOffset(0);
            loadAnimation.setRepeatCount(0);
            loadAnimation.setFillAfter(true);
            loadAnimation.setAnimationListener(new C115842r(pVar));
            textView.startAnimation(loadAnimation);
        }
        return false;
    }
}
