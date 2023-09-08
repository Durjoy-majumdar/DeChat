package com.tencent.wechat.ting.base;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/wechat/ting/base/BaseTingMediaBrowserService;", "Landroid/service/media/MediaBrowserService;", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public class BaseTingMediaBrowserService extends MediaBrowserService {
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        C87412m.m108594g(str, "clientPackageName");
        return new MediaBrowserService.BrowserRoot("MicroMsg.BaseTingMediaBrowserService", (Bundle) null);
    }

    public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        C87412m.m108594g(str, "parentId");
        C87412m.m108594g(result, "result");
        result.detach();
    }
}
