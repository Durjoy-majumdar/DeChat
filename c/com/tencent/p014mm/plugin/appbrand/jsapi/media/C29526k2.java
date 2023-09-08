package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.k2 */
public final class C29526k2 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C29523j2 f80411d;

    public C29526k2(C29523j2 j2Var) {
        this.f80411d = j2Var;
    }

    public final void onAudioFocusChange(int i) {
        String str = this.f80411d.f80404g;
        Log.m105924i(str, "onAudioFocusChange, focusChange: " + i);
        if (i == -3 || i == -2) {
            this.f80411d.mo56773k();
        } else if (i == -1) {
            this.f80411d.mo56775o();
        } else if (i == 1) {
            this.f80411d.mo56774l();
        }
    }
}
