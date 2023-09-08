package com.tencent.p014mm.plugin.finder.preload;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VideoFeedProgressChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/preload/MediaPreloadCore$videoDownloadProgressChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/VideoFeedProgressChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.preload.MediaPreloadCore$videoDownloadProgressChangeListener$1 */
public final class MediaPreloadCore$videoDownloadProgressChangeListener$1 extends IListener<VideoFeedProgressChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ MediaPreloadCore f160317d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaPreloadCore$videoDownloadProgressChangeListener$1(MediaPreloadCore mediaPreloadCore, C40008f fVar) {
        super(fVar);
        this.f160317d = mediaPreloadCore;
    }

    public boolean callback(IEvent iEvent) {
        VideoFeedProgressChangeEvent videoFeedProgressChangeEvent = (VideoFeedProgressChangeEvent) iEvent;
        C87412m.m108594g(videoFeedProgressChangeEvent, "event");
        C61926c.m72666K(0, new C56186b(this.f160317d, videoFeedProgressChangeEvent));
        return false;
    }
}
