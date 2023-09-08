package vp1;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import er1.C58784w3;
import gy3.C87412m;
import sf0.C48372d;
import te3.C52271zj0;

/* renamed from: vp1.c */
public final class C14926c extends C48372d<C52271zj0> {
    public C14926c(String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_FILENAME);
        String str2 = C58784w3.f168295a.mo83907W(7) + str;
        C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        this.f129497b = str2;
    }
}
