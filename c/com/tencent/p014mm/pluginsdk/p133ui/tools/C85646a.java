package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.a */
public class C85646a {
    /* renamed from: a */
    public static String m105755a(WXMediaMessage wXMediaMessage) {
        if (wXMediaMessage == null) {
            return null;
        }
        WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        return iMediaObject instanceof WXMusicObject ? ((WXMusicObject) iMediaObject).songAlbumUrl : "";
    }

    /* renamed from: b */
    public static String m105756b(WXMediaMessage wXMediaMessage) {
        if (wXMediaMessage == null) {
            Log.m105928w("MicroMsg.AbsShareReportUtil", "sendImgMsg msg not img");
            return null;
        }
        WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        return iMediaObject instanceof WXImageObject ? ((WXImageObject) iMediaObject).imagePath : iMediaObject instanceof WXVideoFileObject ? ((WXVideoFileObject) iMediaObject).filePath : iMediaObject instanceof WXMusicObject ? ((WXMusicObject) iMediaObject).musicUrl : iMediaObject instanceof WXVideoObject ? ((WXVideoObject) iMediaObject).videoUrl : iMediaObject instanceof WXWebpageObject ? ((WXWebpageObject) iMediaObject).webpageUrl : "";
    }
}
