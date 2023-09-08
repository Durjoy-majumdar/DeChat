package com.tencent.thumbplayer.tplayer.reportv2;

import android.content.Context;
import com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener;
import com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter;
import com.tencent.thumbplayer.event.TPPlayerEventInfo;
import com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter;

public interface ITPReporter {
    void addReportChannelListener(ITPReportChannelListener iTPReportChannelListener);

    void init(Context context, TPReporterInitParams tPReporterInitParams);

    void onEvent(int i, TPPlayerEventInfo.BaseEventInfo baseEventInfo);

    void reset();

    void setPlayerInfoGetter(ITPPlayerInfoGetter iTPPlayerInfoGetter);

    void setReportInfoGetter(ITPReportInfoGetter iTPReportInfoGetter);
}
