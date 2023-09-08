package com.tencent.p014mm.plugin.topstory.p113ui.video;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C106594s1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.SynchronizedVideoPlayTextureView;
import com.tencent.p014mm.sdk.thread.ThreadPool;

/* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryVideoPlayTextureView */
public class TopStoryVideoPlayTextureView extends SynchronizedVideoPlayTextureView {
    public TopStoryVideoPlayTextureView(Context context) {
        super(context);
    }

    public void stop() {
        ThreadPool.post(new C106594s1(this), "player-stop");
    }

    public TopStoryVideoPlayTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopStoryVideoPlayTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
