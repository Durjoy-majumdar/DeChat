package com.tencent.p014mm.plugin.topstory.p113ui.video;

import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.topstory.ui.video.a */
public class C19367a extends OrientationEventListener {

    /* renamed from: a */
    public int f54636a = -1;

    /* renamed from: b */
    public int f54637b = -1;

    /* renamed from: c */
    public long f54638c = 0;

    /* renamed from: d */
    public long f54639d = 0;

    /* renamed from: e */
    public C19368a f54640e;

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.a$a */
    public interface C19368a {
    }

    public C19367a(Context context) {
        super(context);
    }

    public void enable() {
        super.enable();
        this.f54639d = Util.currentTicks();
    }

    public void onOrientationChanged(int i) {
        if (Util.ticksToNow(this.f54639d) < 2000) {
            Log.m105926v("MicroMsg.TopStory.TopStoryDeviceOrientationListener", "onOrientationChanged, not reach DETECT_THRESHOLD");
            return;
        }
        Log.m105919d("MicroMsg.TopStory.TopStoryDeviceOrientationListener", "onOrientationChanged: %s", Integer.valueOf(i));
        if (Math.abs(this.f54636a - i) >= 60 && Util.ticksToNow(this.f54638c) >= 1000) {
            this.f54636a = i;
            this.f54638c = Util.currentTicks();
            if (i <= 60 || i >= 300) {
                if (i <= 30 || i >= 330) {
                    this.f54637b = 0;
                }
            } else if (i < 30 || i > 150) {
                if (i < 120 || i > 240) {
                    if (i >= 210 && i <= 330 && i >= 240 && i <= 300) {
                        this.f54637b = 270;
                    }
                } else if (i >= 150 && i <= 210) {
                    this.f54637b = 180;
                }
            } else if (i >= 60 && i <= 120) {
                this.f54637b = 90;
            }
            C19368a aVar = this.f54640e;
            if (aVar != null) {
                TopStoryBaseVideoUI.this.mo24963R7(this.f54637b);
            }
        }
    }
}
