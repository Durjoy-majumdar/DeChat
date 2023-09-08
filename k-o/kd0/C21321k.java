package kd0;

import com.tencent.p014mm.autogen.mmdata.rpt.VoiceMessageDownloadStruct;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import gy3.C87412m;

/* renamed from: kd0.k */
public final class C21321k {

    /* renamed from: a */
    public static final C21321k f60229a = new C21321k();

    /* renamed from: a */
    public static final void m23907a(String str, int i, int i2, long j, boolean z, String str2) {
        C87412m.m108594g(str, DownloadInfo.FILENAME);
        f60229a.mo33341b(1, str, i, i2, (int) j, z, str2);
    }

    /* renamed from: c */
    public static final void m23908c(String str, int i, int i2, long j, boolean z, String str2) {
        C87412m.m108594g(str, DownloadInfo.FILENAME);
        f60229a.mo33341b(2, str, i, i2, (int) j, z, str2);
    }

    /* renamed from: b */
    public final void mo33341b(int i, String str, int i2, int i3, int i4, boolean z, String str2) {
        VoiceMessageDownloadStruct voiceMessageDownloadStruct = new VoiceMessageDownloadStruct();
        voiceMessageDownloadStruct.f48640d = i;
        voiceMessageDownloadStruct.f48641e = voiceMessageDownloadStruct.mo86045b(DownloadInfo.FILENAME, str, true);
        voiceMessageDownloadStruct.f48642f = i2;
        voiceMessageDownloadStruct.f48643g = i3;
        voiceMessageDownloadStruct.f48644h = i4;
        voiceMessageDownloadStruct.f48645i = z ? 2 : 1;
        if (str2 == null) {
            str2 = "";
        }
        voiceMessageDownloadStruct.f48646j = voiceMessageDownloadStruct.mo86045b("errMsg", str2, true);
        voiceMessageDownloadStruct.mo86054n();
    }
}
