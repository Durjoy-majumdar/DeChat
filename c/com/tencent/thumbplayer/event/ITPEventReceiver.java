package com.tencent.thumbplayer.event;

import com.tencent.thumbplayer.event.TPPlayerEventInfo;

public interface ITPEventReceiver {
    void onEvent(TPPlayerEventInfo.BaseEventInfo baseEventInfo);
}
