package vp1;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import er1.C58784w3;
import gy3.C87412m;
import sf0.C48372d;
import te3.C50275lk0;

/* renamed from: vp1.b */
public final class C14925b extends C48372d<C50275lk0> {
    public C14925b(String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_FILENAME);
        String str2 = C58784w3.f168295a.mo83907W(3) + str;
        C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        this.f129497b = str2;
    }
}
