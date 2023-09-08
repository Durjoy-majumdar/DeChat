package com.tencent.thumbplayer.adapter.player.systemplayer;

import com.tencent.thumbplayer.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.core.common.TPSubtitleFrame;
import java.util.Map;

public interface ITPSysPlayerExternalSubtitle {

    public interface IOnSubTitleListener {
        void onEventInfo();

        void onSubtitleFrameData(TPSubtitleFrame tPSubtitleFrame);

        void onSubtitleInfo(SubtitleData subtitleData);

        void onSubtitleNote(String str);
    }

    public interface IOnSubtitleErrorListener {
        void onSubtitleError(int i, int i2);
    }

    public interface IOnTrackSelectListener {
        void onTrackSelectFailure(int i, long j);

        void onTrackSelectSuccess(long j);
    }

    public interface IPlayPositionListener {
        long getCurrentPosition();
    }

    public static class SubtitleData {
        public String text;

        public SubtitleData(String str) {
            this.text = str;
        }
    }

    void pauseAsync();

    void prepare();

    void release();

    void reset();

    void setDataSource(String str, long j);

    void setDataSource(String str, Map<String, String> map, long j);

    void setOnSubTitleListener(IOnSubTitleListener iOnSubTitleListener);

    void setPlayerPositionListener(IPlayPositionListener iPlayPositionListener);

    void setSubtitleErrorListener(IOnSubtitleErrorListener iOnSubtitleErrorListener);

    void setSubtitleRenderModel(TPSubtitleRenderModel tPSubtitleRenderModel);

    void setSubtitleType(int i);

    void setTrackSelectListener(IOnTrackSelectListener iOnTrackSelectListener);

    void startAsync();

    void stop();
}
