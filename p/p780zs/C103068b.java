package p780zs;

import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.plugin.handoff.model.HandOffFile;
import com.tencent.p014mm.plugin.handoff.model.HandOffFinderLive;
import com.tencent.p014mm.plugin.handoff.model.HandOffMG;
import com.tencent.p014mm.plugin.handoff.model.HandOffMP;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import p444at.C92087b;
import te3.C101834rc0;

@C86522b
/* renamed from: zs.b */
public final class C103068b extends C86301e implements C92087b {
    /* renamed from: Kd */
    public HandOff mo126069Kd(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "icon");
        C87412m.m108594g(str3, "objectId");
        C87412m.m108594g(str4, "nonceId");
        String str9 = str5;
        C87412m.m108594g(str9, "liveId");
        String str10 = str6;
        C87412m.m108594g(str10, "from");
        String str11 = str7;
        C87412m.m108594g(str11, "to");
        String str12 = str8;
        C87412m.m108594g(str12, "key");
        return new HandOffFinderLive(str, str2, str3, str4, str9, i, str10, str11, str12);
    }

    /* renamed from: NN */
    public AbsHandOffFile mo126070NN(C101834rc0 rc02, String str, C72963f4 f4Var, String str2) {
        C87412m.m108594g(rc02, "dataItem");
        return HandOffFile.Companion.mo129300b(rc02, str, f4Var, str2);
    }

    public AbsHandOffFile a40(String str, String str2, String str3, String str4, long j, int i, String str5, String str6, String str7, String str8, String str9, int i2, String str10, int i3, String str11, long j2, int i4, String str12, String str13) {
        String str14 = str;
        C87412m.m108594g(str14, "fullPath");
        C87412m.m108594g(str2, "fileType");
        C87412m.m108594g(str3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str4, "md5");
        C87412m.m108594g(str5, "svrId");
        C87412m.m108594g(str6, "extId");
        C87412m.m108594g(str7, "cdnURL");
        C87412m.m108594g(str8, "aesKey");
        C87412m.m108594g(str9, "authKey");
        C87412m.m108594g(str10, "appId");
        C87412m.m108594g(str11, "mediaId");
        C87412m.m108594g(str12, "from");
        C87412m.m108594g(str13, "to");
        return new HandOffFile(str14, str2, str3, str4, j, i, str5, str6, str7, str8, str9, i2, str10, i3, str11, j2, i4, str12, str13, (String) null, 524288, (C8480h) null);
    }

    /* renamed from: kR */
    public HandOff mo126072kR(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8) {
        C87412m.m108594g(str, "icon");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str3, "appID");
        C87412m.m108594g(str4, "appEntryPage");
        String str9 = str5;
        C87412m.m108594g(str9, "appUserName");
        String str10 = str6;
        C87412m.m108594g(str10, "from");
        String str11 = str7;
        C87412m.m108594g(str11, "to");
        String str12 = str8;
        C87412m.m108594g(str12, "key");
        return new HandOffMP(str, str2, str3, str4, str9, i, str10, str11, str12);
    }

    /* renamed from: tL */
    public HandOff mo126073tL(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8) {
        C87412m.m108594g(str, "icon");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str3, "appID");
        C87412m.m108594g(str4, "appEntryPage");
        String str9 = str5;
        C87412m.m108594g(str9, "appUserName");
        String str10 = str6;
        C87412m.m108594g(str10, "from");
        String str11 = str7;
        C87412m.m108594g(str11, "to");
        String str12 = str8;
        C87412m.m108594g(str12, "key");
        return new HandOffMG(str, str2, str3, str4, str9, i, str10, str11, str12);
    }
}
