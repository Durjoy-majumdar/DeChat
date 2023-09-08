package com.tencent.maas.camstudio;

import com.tencent.maas.model.MJMusicInfo;
import com.tencent.maas.model.time.MJTime;
import java.util.ArrayList;
import java.util.List;

public class MJCamTemplateInfo {
    private final boolean isOSTEnabled;
    private final boolean isUseFrontCamera;
    private final MJTime maxRecordingDuration;
    private final List<MJMusicInfo> musicInfos;

    public MJCamTemplateInfo(boolean z, boolean z2, MJTime mJTime, List<MJMusicInfo> list) {
        this.isUseFrontCamera = z;
        this.isOSTEnabled = z2;
        this.maxRecordingDuration = mJTime;
        this.musicInfos = list;
    }

    public MJTime getMaxRecordingDuration() {
        return this.maxRecordingDuration;
    }

    public List<MJMusicInfo> getMusicInfos() {
        return this.musicInfos;
    }

    public boolean isOSTEnabled() {
        return this.isOSTEnabled;
    }

    public boolean isUseFrontCamera() {
        return this.isUseFrontCamera;
    }

    public MJCamTemplateInfo(boolean z, boolean z2, MJTime mJTime, Object[] objArr) {
        this.isUseFrontCamera = z;
        this.isOSTEnabled = z2;
        this.maxRecordingDuration = mJTime;
        ArrayList arrayList = new ArrayList();
        if (objArr != null) {
            for (MJMusicInfo add : objArr) {
                arrayList.add(add);
            }
        }
        this.musicInfos = arrayList;
    }
}
