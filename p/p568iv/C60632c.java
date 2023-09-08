package p568iv;

import com.tencent.p014mm.autogen.mmdata.rpt.MvShareReportStruct;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import hb2.C59833q;
import p529fv.C59331r;
import p580jv.C60923c;

@C86522b
/* renamed from: iv.c */
public final class C60632c extends C86301e implements C60923c {
    public void mp0(String str, String str2, WXMediaMessage wXMediaMessage, int i) {
        String str3 = str;
        String str4 = str2;
        WXMediaMessage wXMediaMessage2 = wXMediaMessage;
        int i2 = i;
        C87412m.m108594g(str3, "sessionId");
        C87412m.m108594g(wXMediaMessage2, "wxMediaMessage");
        C59833q.f170832a.getClass();
        if (i2 == 1 || i2 == 0) {
            MvShareReportStruct mvShareReportStruct = new MvShareReportStruct();
            mvShareReportStruct.f156663d = mvShareReportStruct.mo86045b("ContextId", str3, true);
            mvShareReportStruct.f156668i = 1;
            mvShareReportStruct.f156673n = i2 == 1 ? 1 : 2;
            String str5 = "";
            if (wXMediaMessage.getType() == 3) {
                WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage2.mediaObject;
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMusicObject");
                WXMusicObject wXMusicObject = (WXMusicObject) iMediaObject;
                String str6 = wXMediaMessage2.title;
                if (str6 != null) {
                    str5 = str6;
                }
                mvShareReportStruct.f156664e = mvShareReportStruct.mo86045b("SongName", str5, true);
                mvShareReportStruct.f156666g = mvShareReportStruct.mo86045b("WebUrl", wXMusicObject.musicUrl, true);
                mvShareReportStruct.f156667h = mvShareReportStruct.mo86045b("DataUrl", wXMusicObject.musicDataUrl, true);
                mvShareReportStruct.f156675p = mvShareReportStruct.mo86045b("Singer", wXMediaMessage2.description, true);
                mvShareReportStruct.f156672m = mvShareReportStruct.mo86045b("AppId", str4, true);
                if (((C59331r) C86312j.m106911c(C59331r.class)).mo84029q1(str4)) {
                    mvShareReportStruct.f156676q = 2;
                } else {
                    mvShareReportStruct.f156676q = 1;
                }
                mvShareReportStruct.mo86054n();
                mvShareReportStruct.mo86056r();
            } else if (wXMediaMessage.getType() == 76) {
                WXMediaMessage.IMediaObject iMediaObject2 = wXMediaMessage2.mediaObject;
                C87412m.m108592e(iMediaObject2, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject");
                WXMusicVideoObject wXMusicVideoObject = (WXMusicVideoObject) iMediaObject2;
                String str7 = wXMediaMessage2.title;
                if (str7 != null) {
                    str5 = str7;
                }
                mvShareReportStruct.f156664e = mvShareReportStruct.mo86045b("SongName", str5, true);
                mvShareReportStruct.f156666g = mvShareReportStruct.mo86045b("WebUrl", wXMusicVideoObject.musicUrl, true);
                mvShareReportStruct.f156667h = mvShareReportStruct.mo86045b("DataUrl", wXMusicVideoObject.musicDataUrl, true);
                String str8 = wXMusicVideoObject.singerName;
                mvShareReportStruct.f156675p = mvShareReportStruct.mo86045b("Singer", !(str8 == null || str8.length() == 0) ? wXMusicVideoObject.singerName : wXMediaMessage2.description, true);
                mvShareReportStruct.f156672m = mvShareReportStruct.mo86045b("AppId", str4, true);
                mvShareReportStruct.f156676q = 2;
                mvShareReportStruct.mo86054n();
                mvShareReportStruct.mo86056r();
            }
        }
    }
}
