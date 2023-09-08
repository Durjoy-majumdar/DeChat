package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.g */
public interface C17380g {
    /* renamed from: a */
    void mo20303a(GLConstants.GLScaleType gLScaleType);

    /* renamed from: a */
    void mo20305a(TakeSnapshotListener takeSnapshotListener);

    /* renamed from: a */
    void mo20306a(PixelFrame pixelFrame);

    /* renamed from: a */
    void mo20307a(Rotation rotation);

    /* renamed from: a */
    void mo20308a(DisplayTarget displayTarget, boolean z);

    /* renamed from: a */
    void mo20309a(VideoRenderListener videoRenderListener);

    /* renamed from: a */
    void mo20310a(boolean z);

    /* renamed from: b */
    void mo20311b(boolean z);

    /* renamed from: c */
    void mo20312c(boolean z);
}
