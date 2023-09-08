package com.tencent.thumbplayer.adapter.player;

import android.content.Context;
import com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer;
import com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer;
import com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer;
import com.tencent.thumbplayer.log.TPLoggerContext;

public final class TPPlayerBaseFactory {
    public static ITPPlayerBase createSystemMediaPlayer(Context context, boolean z, TPLoggerContext tPLoggerContext) {
        return z ? new TPSystemClipPlayer(context, tPLoggerContext) : new TPSystemMediaPlayer(context, tPLoggerContext);
    }

    public static ITPPlayerBase createThumbPlayer(Context context, TPLoggerContext tPLoggerContext) {
        return new TPThumbPlayer(context, tPLoggerContext);
    }
}
