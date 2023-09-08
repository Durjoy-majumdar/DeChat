package com.tencent.thumbplayer.tplayer;

import android.content.Context;
import com.tencent.thumbplayer.event.TPPlayerEventPublisher;

public class TPContext {
    private Context mAppContext;
    private TPPlayerEventPublisher mPlayerEventPublisher = new TPPlayerEventPublisher();

    public TPContext(Context context) {
        this.mAppContext = context;
    }

    public Context getAppContext() {
        return this.mAppContext;
    }

    public TPPlayerEventPublisher getPlayerEventPublisher() {
        return this.mPlayerEventPublisher;
    }
}
