package com.tencent.qqmusic.mediaplayer.upstream;

import android.net.Uri;
import com.tencent.qqmusic.mediaplayer.upstream.UriLoader;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DummyUriLoader implements UriLoader {
    private final Uri uri;

    public DummyUriLoader() {
        this((Uri) null);
    }

    public void cancelLoading() {
    }

    public boolean isLoading() {
        return false;
    }

    public void startLoading(int i, TimeUnit timeUnit, UriLoader.Callback callback) {
        Uri uri2 = this.uri;
        if (uri2 == null) {
            callback.onSucceed((StreamingRequest) null);
        } else {
            callback.onSucceed(new StreamingRequest(uri2, (Map<String, String>) null));
        }
    }

    public DummyUriLoader(Uri uri2) {
        this.uri = uri2;
    }
}
