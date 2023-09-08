package com.tencent.maas.composing;

import com.tencent.maas.model.composing.MJAudioClip;
import com.tencent.maas.model.composing.MJClip;
import com.tencent.maas.model.composing.MJLyricsOverlayDesc;
import com.tencent.maas.model.composing.MJStickerOverlayDesc;
import com.tencent.maas.model.composing.MJTextOverlayDesc;
import java.util.List;

public class MJComposingDesc {
    private final MJAudioClip audioClip;
    private final MJCoordinatingDesc coordinatingDesc;
    private final MJLyricsOverlayDesc lyricsOverlayDesc;
    private final List<MJClip> mainClips;
    private final List<MJStickerOverlayDesc> stickerOverlayDescs;
    private final List<MJTextOverlayDesc> textOverlayDescs;

    public MJComposingDesc(MJCoordinatingDesc mJCoordinatingDesc, List<MJClip> list, MJAudioClip mJAudioClip, MJLyricsOverlayDesc mJLyricsOverlayDesc, List<MJStickerOverlayDesc> list2, List<MJTextOverlayDesc> list3) {
        this.coordinatingDesc = mJCoordinatingDesc;
        this.mainClips = list;
        this.audioClip = mJAudioClip;
        this.lyricsOverlayDesc = mJLyricsOverlayDesc;
        this.stickerOverlayDescs = list2;
        this.textOverlayDescs = list3;
    }

    public MJAudioClip getAudioClip() {
        return this.audioClip;
    }

    public MJCoordinatingDesc getCoordinatingDesc() {
        return this.coordinatingDesc;
    }

    public MJLyricsOverlayDesc getLyricsOverlayDesc() {
        return this.lyricsOverlayDesc;
    }

    public List<MJClip> getMainClips() {
        return this.mainClips;
    }

    public List<MJStickerOverlayDesc> getStickerOverlayDescs() {
        return this.stickerOverlayDescs;
    }

    public List<MJTextOverlayDesc> getTextOverlayDescs() {
        return this.textOverlayDescs;
    }
}
