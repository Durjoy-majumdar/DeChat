package com.tencent.p014mm.sdk.platformtools;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;

/* renamed from: com.tencent.mm.sdk.platformtools.AnimationHelperImpl21below */
class AnimationHelperImpl21below implements BackwardSupportUtil.AnimationHelper.IHelper {
    public void cancelAnimation(View view, Animation animation) {
        if (view != null) {
            view.setAnimation((Animation) null);
        }
    }
}
