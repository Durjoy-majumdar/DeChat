package vp1;

import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import er1.C58784w3;
import gy3.C87412m;
import sf0.C48372d;
import te3.C51270sn1;

/* renamed from: vp1.q */
public final class C14942q extends C48372d<C51270sn1> {
    public C14942q(String str) {
        C87412m.m108594g(str, DownloadInfo.FILENAME);
        String str2 = C58784w3.f168295a.mo83907W(6) + str;
        C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        this.f129497b = str2;
    }
}
