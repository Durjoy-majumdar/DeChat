package ad0;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.SnsGetVideoThumbEvent;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXGameVideoFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXNativeGamePageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXTextObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.plugin.gamesharecard.LiteAppBizDataInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import java.util.Set;
import jr2.C99015i;

/* renamed from: ad0.g */
public class C67025g {

    /* renamed from: a */
    public static Set<String> f192517a;

    /* renamed from: ad0.g$a */
    public static class C67026a {

        /* renamed from: a */
        public String f192518a;

        /* renamed from: b */
        public String f192519b;

        /* renamed from: c */
        public String f192520c;

        /* renamed from: d */
        public int f192521d = -1;

        /* renamed from: e */
        public int f192522e = -1;
    }

    /* renamed from: a */
    public static int m79182a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i != 38) {
                            return i != 76 ? -1 : 5;
                        }
                        return 6;
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static Intent m79183b(int i, WXMediaMessage wXMediaMessage, String str, String str2, String str3, boolean z, Bundle bundle) {
        int i2;
        int i3;
        WXMediaMessage wXMediaMessage2 = wXMediaMessage;
        Bundle bundle2 = bundle;
        Class cls = C99015i.class;
        Log.m105918d("MicroMsg.ShareSnsImpl", "appmsg.description " + wXMediaMessage2.description);
        Log.m105918d("MicroMsg.ShareSnsImpl", "appmsg.title " + wXMediaMessage2.title);
        WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage2.mediaObject;
        int type = iMediaObject.type();
        int a = m79182a(3);
        if (type == 38 || type == 39) {
            i2 = 15;
        } else if (type == 76) {
            i2 = 42;
        } else if (type != 101) {
            switch (type) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                case 6:
                case 7:
                    i2 = 3;
                    break;
                default:
                    i2 = -1;
                    break;
            }
        } else {
            i2 = 101;
        }
        Intent intent = new Intent();
        intent.putExtra("KThrid_app", true);
        Log.m105918d("MicroMsg.ShareSnsImpl", "TimeLineType " + i2 + " " + iMediaObject.type());
        intent.putExtra("Ksnsupload_appid", str2);
        intent.putExtra("Ksnsupload_appname", str3);
        intent.putExtra("Ksnsupload_open_sdk_version", i);
        intent.putExtra("KSnsAction", true);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_app_is_game", z);
        Bundle bundle3 = new Bundle();
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.message = wXMediaMessage2;
        req.toBundle(bundle3);
        intent.putExtra("Ksnsupload_timeline", bundle3);
        if (i2 == -1) {
            Log.m105918d("MicroMsg.ShareSnsImpl", "timeLineType is invalid");
            return null;
        }
        int type2 = iMediaObject.type();
        String str4 = "";
        String str5 = "KSightPath";
        String str6 = "sight_md5";
        String str7 = "KSightThumbPath";
        if (type2 == 38) {
            String str8 = str5;
            String str9 = str6;
            String str10 = str7;
            intent.putExtra("KBlockAdd", true);
            intent.putExtra("Ksnsupload_type", 14);
            String str11 = ((WXVideoFileObject) iMediaObject).filePath;
            String q = C86013q1.m106456q(str11);
            if (Util.isNullOrNil(str4) || !C86013q1.m106450k(str4)) {
                StringBuilder sb = new StringBuilder();
                C97625j3.m125812b();
                sb.append(((C99015i) C86312j.m106911c(cls)).mo61936iU());
                sb.append(q);
                str4 = sb.toString();
                try {
                    SnsGetVideoThumbEvent snsGetVideoThumbEvent = new SnsGetVideoThumbEvent();
                    snsGetVideoThumbEvent.f193938d.f193940a = str11;
                    snsGetVideoThumbEvent.publish();
                    Bitmap bitmap = (Bitmap) snsGetVideoThumbEvent.f193939e.f193941a;
                    if (bitmap != null) {
                        Log.m105925i("MicroMsg.ShareSnsImpl", "getBitmap1 %d %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
                        BitmapUtil.saveBitmapToImage(bitmap, 80, Bitmap.CompressFormat.JPEG, str4, true);
                        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str4);
                        Log.m105925i("MicroMsg.ShareSnsImpl", "getBitmap2 %d %d", Integer.valueOf(imageOptions.outWidth), Integer.valueOf(imageOptions.outHeight));
                    } else {
                        Log.m105921e("MicroMsg.ShareSnsImpl", "thumb null , videoPath %s ", str11);
                        return null;
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.ShareSnsImpl", "savebitmap error %s", e.getMessage());
                }
            }
            intent.putExtra(str8, str11);
            intent.putExtra(str10, str4);
            intent.putExtra(str9, q);
            return intent;
        } else if (type2 == 39) {
            WXGameVideoFileObject wXGameVideoFileObject = (WXGameVideoFileObject) iMediaObject;
            intent.putExtra("KBlockAdd", true);
            intent.putExtra("Ksnsupload_type", 14);
            String str12 = wXGameVideoFileObject.filePath;
            String str13 = wXGameVideoFileObject.videoUrl;
            String str14 = wXGameVideoFileObject.thumbUrl;
            Log.m105925i("MicroMsg.ShareSnsImpl", "videoPath %s,thumbPath %s,cdnUrl %s,cdnThumbUrl %s", str12, str4, str13, str14);
            String q2 = C86013q1.m106456q(str12);
            if (Util.isNullOrNil(str4) || !C86013q1.m106450k(str4)) {
                StringBuilder sb4 = new StringBuilder();
                C97625j3.m125812b();
                sb4.append(((C99015i) C86312j.m106911c(cls)).mo61936iU());
                sb4.append(q2);
                str4 = sb4.toString();
                try {
                    SnsGetVideoThumbEvent snsGetVideoThumbEvent2 = new SnsGetVideoThumbEvent();
                    snsGetVideoThumbEvent2.f193938d.f193940a = str12;
                    snsGetVideoThumbEvent2.publish();
                    Bitmap bitmap2 = (Bitmap) snsGetVideoThumbEvent2.f193939e.f193941a;
                    if (bitmap2 != null) {
                        Log.m105925i("MicroMsg.ShareSnsImpl", "getBitmap1 %d %d", Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap2.getHeight()));
                        BitmapUtil.saveBitmapToImage(bitmap2, 80, Bitmap.CompressFormat.JPEG, str4, true);
                        BitmapFactory.Options imageOptions2 = BitmapUtil.getImageOptions(str4);
                        Log.m105925i("MicroMsg.ShareSnsImpl", "getBitmap2 %d %d", Integer.valueOf(imageOptions2.outWidth), Integer.valueOf(imageOptions2.outHeight));
                    } else {
                        i3 = 1;
                        try {
                            Object[] objArr = new Object[1];
                            objArr[0] = str12;
                            Log.m105921e("MicroMsg.ShareSnsImpl", "thumb null , videoPath %s ", objArr);
                            return null;
                        } catch (Exception e2) {
                            e = e2;
                            Object[] objArr2 = new Object[i3];
                            objArr2[0] = e.getMessage();
                            Log.m105921e("MicroMsg.ShareSnsImpl", "savebitmap error %s", objArr2);
                            intent.putExtra(str5, str12);
                            intent.putExtra(str7, str4);
                            intent.putExtra(str6, q2);
                            intent.putExtra("KSightCdnUrl", str13);
                            intent.putExtra("KSightCdnThumbUrl", str14);
                            return intent;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    i3 = 1;
                    Object[] objArr22 = new Object[i3];
                    objArr22[0] = e.getMessage();
                    Log.m105921e("MicroMsg.ShareSnsImpl", "savebitmap error %s", objArr22);
                    intent.putExtra(str5, str12);
                    intent.putExtra(str7, str4);
                    intent.putExtra(str6, q2);
                    intent.putExtra("KSightCdnUrl", str13);
                    intent.putExtra("KSightCdnThumbUrl", str14);
                    return intent;
                }
            }
            intent.putExtra(str5, str12);
            intent.putExtra(str7, str4);
            intent.putExtra(str6, q2);
            intent.putExtra("KSightCdnUrl", str13);
            intent.putExtra("KSightCdnThumbUrl", str14);
            return intent;
        } else if (type2 == 76) {
            String nullAs = Util.nullAs(((WXMusicVideoObject) iMediaObject).musicUrl, str4);
            if (m79182a(76) == -1) {
                Log.m105918d("MicroMsg.ShareSnsImpl", "mediaType is invalid");
                return null;
            }
            intent.putExtra("Ksnsupload_link", nullAs);
            intent.putExtra("Ksnsupload_title", str4);
            intent.putExtra("Ksnsupload_type", 25);
            intent.putExtra("ksnsis_music", true);
            if (bundle2 != null) {
                intent.putExtra("music_mv_cover_url", bundle2.getString("music_mv_cover_url", str4));
            }
            return intent;
        } else if (type2 != 101) {
            switch (type2) {
                case 1:
                    intent.putExtra("Kdescription", ((WXTextObject) iMediaObject).text);
                    intent.putExtra("Ksnsupload_type", 8);
                    return intent;
                case 2:
                    intent.putExtra("KBlockAdd", true);
                    intent.putExtra("Ksnsupload_type", 0);
                    intent.putExtra("sns_kemdia_path", ((WXImageObject) iMediaObject).imagePath);
                    return intent;
                case 3:
                    WXMusicObject wXMusicObject = (WXMusicObject) iMediaObject;
                    String nullAs2 = Util.nullAs(!Util.isNullOrNil(wXMusicObject.musicUrl) ? wXMusicObject.musicUrl : wXMusicObject.musicLowBandUrl, str4);
                    if (a == -1) {
                        Log.m105918d("MicroMsg.ShareSnsImpl", "mediaType is invalid");
                        return null;
                    }
                    Util.nullAs(!Util.isNullOrNil(wXMusicObject.musicDataUrl) ? wXMusicObject.musicDataUrl : wXMusicObject.musicUrl, str4);
                    Util.nullAs(!Util.isNullOrNil(wXMusicObject.musicLowBandDataUrl) ? wXMusicObject.musicLowBandDataUrl : wXMusicObject.musicLowBandUrl, str4);
                    intent.putExtra("Ksnsupload_link", nullAs2);
                    intent.putExtra("Ksnsupload_title", str4);
                    intent.putExtra("Ksnsupload_type", 2);
                    intent.putExtra("ksnsis_music", true);
                    return intent;
                case 4:
                    WXVideoObject wXVideoObject = (WXVideoObject) iMediaObject;
                    String nullAs3 = Util.nullAs(!Util.isNullOrNil(wXVideoObject.videoUrl) ? wXVideoObject.videoUrl : wXVideoObject.videoLowBandUrl, str4);
                    if (a == -1) {
                        Log.m105918d("MicroMsg.ShareSnsImpl", "mediaType is invalid");
                        return null;
                    }
                    intent.putExtra("Ksnsupload_link", nullAs3);
                    intent.putExtra("Ksnsupload_title", str4);
                    intent.putExtra("Ksnsupload_type", 1);
                    intent.putExtra("ksnsis_video", true);
                    return intent;
                case 5:
                    intent.putExtra("Ksnsupload_link", ((WXWebpageObject) iMediaObject).webpageUrl);
                    intent.putExtra("Ksnsupload_title", Util.nullAs(wXMediaMessage2.title, str4));
                    intent.putExtra("Ksnsupload_imgbuf", wXMediaMessage2.thumbData);
                    intent.putExtra("Ksnsupload_type", 1);
                    return intent;
                case 6:
                    Log.m105920e("MicroMsg.ShareSnsImpl", "file is not support!");
                    return null;
                case 7:
                    return null;
                default:
                    Log.m105920e("MicroMsg.ShareSnsImpl", "none type not support!");
                    return null;
            }
        } else {
            WXNativeGamePageObject wXNativeGamePageObject = (WXNativeGamePageObject) iMediaObject;
            String string = bundle2.getString("kWXEntryActivity_bundle_game_share_card_msgid");
            LiteAppBizDataInfo liteAppBizDataInfo = (LiteAppBizDataInfo) bundle2.getParcelable("kWXEntryActivity_bundle_game_share_card_liteapp");
            if (liteAppBizDataInfo == null) {
                Log.m105920e("MicroMsg.ShareSnsImpl", "johnjh sns gamepageobject or liteappbizdatainfo is null");
                return null;
            }
            intent.putExtra("Ksnsupload_title", Util.nullAs(wXMediaMessage2.title, str4));
            intent.putExtra("Ksnsupload_imgbuf", wXMediaMessage2.thumbData);
            intent.putExtra("Ksnsupload_type", 34);
            intent.putExtra("ksnsis_gamesharecard", true);
            if (wXNativeGamePageObject.isVideo) {
                intent.putExtra("ksnsUpload_gameShareIsVideo", 1);
            } else {
                intent.putExtra("ksnsUpload_gameShareIsVideo", 0);
            }
            intent.putExtra("ksnsUpload_gameShareData", wXNativeGamePageObject.shareData);
            intent.putExtra("ksnsUpload_gameShareDuration", wXNativeGamePageObject.videoDuration);
            intent.putExtra("ksnsUpload_gameShareId", string);
            intent.putExtra("KsnsUpload_LiteAppId", liteAppBizDataInfo.f19382d);
            intent.putExtra("KsnsUpload_LiteAppPath", liteAppBizDataInfo.f19383e);
            intent.putExtra("KsnsUpload_LiteAppQuery", liteAppBizDataInfo.f19384f);
            intent.putExtra("ksnsUpload_gameShareLiteAppBizData", liteAppBizDataInfo.f19385g);
            intent.putExtra("ksnsUpload_gameShareLiteAppPriority", liteAppBizDataInfo.f19387i);
            return intent;
        }
    }
}
