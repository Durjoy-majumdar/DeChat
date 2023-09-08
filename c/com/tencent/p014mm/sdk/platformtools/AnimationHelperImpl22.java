package com.tencent.p014mm.sdk.platformtools;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;

/* renamed from: com.tencent.mm.sdk.platformtools.AnimationHelperImpl22 */
class AnimationHelperImpl22 implements BackwardSupportUtil.AnimationHelper.IHelper {
    public void cancelAnimation(View view, Animation animation) {
        animation.cancel();
    }
}
