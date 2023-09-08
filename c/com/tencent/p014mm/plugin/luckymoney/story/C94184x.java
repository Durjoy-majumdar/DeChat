package com.tencent.p014mm.plugin.luckymoney.story;

import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeStoryVideoManager;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.x */
public class C94184x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeStoryVideoManager.C94180e f272100d;

    public C94184x(EnvelopeStoryVideoManager envelopeStoryVideoManager, EnvelopeStoryVideoManager.C94180e eVar) {
        this.f272100d = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r0.f267486Q0 == 4) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0.f331350j == 4) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$e r0 = r8.f272100d
            boolean r1 = r0.f272073e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0048
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r0 = r0.f272081m
            com.tencent.mm.pluginsdk.ui.tools.r0 r1 = r0.f283595q
            boolean r5 = r1 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView
            r6 = 0
            r7 = 4
            if (r5 == 0) goto L_0x0022
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r1 = (com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView) r1
            s62.l r0 = r1.f318486j
            if (r0 == 0) goto L_0x002f
            s62.m r0 = r0.f331337f
            if (r0 == 0) goto L_0x002f
            int r0 = r0.f331350j
            if (r0 != r7) goto L_0x002f
            goto L_0x002e
        L_0x0022:
            java.lang.String r1 = r0.f283586e
            java.lang.String r5 = "videoview not VideoPlayerTextureView"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
            int r0 = r0.f267486Q0
            if (r0 != r7) goto L_0x002f
        L_0x002e:
            r6 = 1
        L_0x002f:
            if (r6 == 0) goto L_0x0048
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$e r0 = r8.f272100d
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r0 = r0.f272081m
            r0.mo79617f()
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$e r0 = r8.f272100d
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f272081m
            int r1 = r1.getCurrPosSec()
            long r5 = (long) r1
            r0.f272078j = r5
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$e r0 = r8.f272100d
            r0.f272079k = r3
            goto L_0x006e
        L_0x0048:
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$e r0 = r8.f272100d
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r0 = r0.f272081m
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "MicroMsg.EnvelopeStoryVideoManager"
            java.lang.String r1 = "resume fail, restart play"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$e r0 = r8.f272100d
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r0 = r0.f272081m
            r0.stop()
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$e r0 = r8.f272100d
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r0 = r0.f272081m
            r0.start()
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$e r0 = r8.f272100d
            r0.f272078j = r3
            r0.f272079k = r3
        L_0x006e:
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$e r0 = r8.f272100d
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f272080l
            r0.set(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.story.C94184x.run():void");
    }
}
