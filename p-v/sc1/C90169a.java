package sc1;

import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXTextObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.plugin.fav.p047ui.C93658i;
import com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C85646a;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.UnsupportedEncodingException;
import p206nj.C117627q;
import pb1.C100755z;
import rn3.C90066z;
import te3.C101834rc0;
import wd3.C65953v0;
import zt3.C119157j;

/* renamed from: sc1.a */
public class C90169a implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ WXMediaMessage f258885a;

    /* renamed from: b */
    public final /* synthetic */ FavOpenApiEntry f258886b;

    public C90169a(FavOpenApiEntry favOpenApiEntry, WXMediaMessage wXMediaMessage) {
        this.f258886b = favOpenApiEntry;
        this.f258885a = wXMediaMessage;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            int intExtra = IntentUtil.getIntExtra(this.f258886b.getIntent(), ConstantsAPI.SDK_VERSION, 0);
            String str2 = this.f258886b.f248194f;
            WXMediaMessage wXMediaMessage = this.f258885a;
            C44561j g = C44565l.m48987g(str2);
            if (g != null) {
                String str3 = g.field_appId;
                String str4 = g.field_appName;
                boolean k = g.mo69359k();
                int type = wXMediaMessage.getType();
                try {
                    String b = C117627q.m165909b(Util.nullAsNil(C85646a.m105756b(wXMediaMessage)), "UTF-8");
                    String b2 = C117627q.m165909b(Util.nullAsNil(C85646a.m105755a(wXMediaMessage)), "UTF-8");
                    String b3 = C117627q.m165909b(Util.nullAsNil(wXMediaMessage.title), "UTF-8");
                    String b4 = C117627q.m165909b(Util.nullAsNil(wXMediaMessage.description), "UTF-8");
                    Log.m105924i("MicroMsg.ShareReport", intExtra + "," + str3 + "," + str4 + "," + (k ? 1 : 0) + "," + type + "," + 3 + "," + 1 + "," + "" + "," + b3 + "," + b4 + "," + b + "," + b2);
                    C115669n.INSTANCE.mo160131h(16492, Integer.valueOf(intExtra), str3, str4, Integer.valueOf(k), Integer.valueOf(type), 3, 1, "", b3, b4, b, "", "", "", b2);
                } catch (UnsupportedEncodingException unused) {
                    Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                }
            }
            FavOpenApiEntry favOpenApiEntry = this.f258886b;
            WXMediaMessage wXMediaMessage2 = this.f258885a;
            favOpenApiEntry.getClass();
            if (wXMediaMessage2 == null) {
                Log.m105920e("MicroMsg.FavOpenApiEntry", "deal fail, WXMediaMessage is null");
            } else {
                int type2 = wXMediaMessage2.getType();
                if (type2 != 76) {
                    switch (type2) {
                        case 1:
                            WXTextObject wXTextObject = (WXTextObject) wXMediaMessage2.mediaObject;
                            if (!Util.isNullOrNil(wXTextObject.text)) {
                                C100755z zVar = new C100755z();
                                zVar.field_type = 1;
                                favOpenApiEntry.mo118224J7(wXMediaMessage2, zVar);
                                zVar.field_favProto.mo141212j(wXTextObject.text);
                                favOpenApiEntry.mo118226L7(zVar, wXMediaMessage2);
                                C93658i.m118346a(zVar);
                                break;
                            } else {
                                Log.m105920e("MicroMsg.FavOpenApiEntry", "addText null!");
                                break;
                            }
                        case 2:
                            WXImageObject wXImageObject = (WXImageObject) wXMediaMessage2.mediaObject;
                            if (wXImageObject.imageData != null || C86013q1.m106450k(wXImageObject.imagePath)) {
                                C100755z zVar2 = new C100755z();
                                zVar2.field_type = 2;
                                favOpenApiEntry.mo118224J7(wXMediaMessage2, zVar2);
                                favOpenApiEntry.mo118226L7(zVar2, wXMediaMessage2);
                                zVar2.field_favProto.f298618f.add(favOpenApiEntry.mo118223I7(wXMediaMessage2, wXImageObject.imagePath, wXImageObject.imageData, zVar2.field_type));
                                C93658i.m118346a(zVar2);
                                break;
                            }
                        case 3:
                            WXMusicObject wXMusicObject = (WXMusicObject) wXMediaMessage2.mediaObject;
                            if (Util.isNullOrNil(wXMusicObject.musicDataUrl) && Util.isNullOrNil(wXMusicObject.musicUrl) && Util.isNullOrNil(wXMusicObject.musicLowBandUrl)) {
                                Log.m105920e("MicroMsg.FavOpenApiEntry", "addMusic, both url null");
                                break;
                            } else {
                                C100755z zVar3 = new C100755z();
                                zVar3.field_type = 7;
                                favOpenApiEntry.mo118224J7(wXMediaMessage2, zVar3);
                                C101834rc0 rc02 = new C101834rc0();
                                rc02.mo141242Q(wXMusicObject.musicUrl);
                                rc02.mo141241P(wXMusicObject.musicLowBandUrl);
                                rc02.mo141240O(wXMusicObject.musicDataUrl);
                                rc02.mo141246U(wXMediaMessage2.title);
                                rc02.mo141265u(wXMediaMessage2.description);
                                favOpenApiEntry.mo118225K7(wXMediaMessage2, rc02, zVar3.field_type);
                                rc02.mo141231E(true);
                                rc02.mo141260p(zVar3.field_type);
                                rc02.mo141235I(wXMusicObject.songAlbumUrl);
                                rc02.mo141236J(wXMusicObject.songLyric);
                                zVar3.field_favProto.f298618f.add(rc02);
                                favOpenApiEntry.mo118226L7(zVar3, wXMediaMessage2);
                                C93658i.m118346a(zVar3);
                                break;
                            }
                            break;
                        case 4:
                            WXVideoObject wXVideoObject = (WXVideoObject) wXMediaMessage2.mediaObject;
                            if (Util.isNullOrNil(wXVideoObject.videoLowBandUrl) && Util.isNullOrNil(wXVideoObject.videoUrl)) {
                                Log.m105920e("MicroMsg.FavOpenApiEntry", "addVideo, both url null");
                                break;
                            } else {
                                C100755z zVar4 = new C100755z();
                                zVar4.field_type = 4;
                                favOpenApiEntry.mo118224J7(wXMediaMessage2, zVar4);
                                C101834rc0 rc03 = new C101834rc0();
                                rc03.mo141242Q(wXVideoObject.videoUrl);
                                rc03.mo141241P(wXVideoObject.videoLowBandUrl);
                                rc03.mo141246U(wXMediaMessage2.title);
                                rc03.mo141265u(wXMediaMessage2.description);
                                favOpenApiEntry.mo118225K7(wXMediaMessage2, rc03, zVar4.field_type);
                                rc03.mo141231E(true);
                                rc03.mo141260p(zVar4.field_type);
                                zVar4.field_favProto.f298618f.add(rc03);
                                favOpenApiEntry.mo118226L7(zVar4, wXMediaMessage2);
                                C93658i.m118346a(zVar4);
                                break;
                            }
                            break;
                        case 5:
                            WXWebpageObject wXWebpageObject = (WXWebpageObject) wXMediaMessage2.mediaObject;
                            if (!Util.isNullOrNil(wXWebpageObject.webpageUrl)) {
                                C100755z zVar5 = new C100755z();
                                zVar5.field_sessionId = favOpenApiEntry.getIntent().getStringExtra("reportSessionId");
                                zVar5.field_type = 5;
                                favOpenApiEntry.mo118224J7(wXMediaMessage2, zVar5);
                                favOpenApiEntry.mo118226L7(zVar5, wXMediaMessage2);
                                zVar5.field_favProto.f298616d.mo141276l(wXWebpageObject.webpageUrl);
                                if (wXMediaMessage2.thumbData != null) {
                                    C101834rc0 rc04 = new C101834rc0();
                                    rc04.mo141246U(wXMediaMessage2.title);
                                    rc04.mo141265u(wXMediaMessage2.description);
                                    favOpenApiEntry.mo118225K7(wXMediaMessage2, rc04, zVar5.field_type);
                                    rc04.mo141231E(true);
                                    rc04.mo141260p(zVar5.field_type);
                                    zVar5.field_favProto.f298618f.add(rc04);
                                }
                                C93658i.m118346a(zVar5);
                                break;
                            } else {
                                Log.m105920e("MicroMsg.FavOpenApiEntry", "addUrl null!");
                                break;
                            }
                        case 6:
                            WXFileObject wXFileObject = (WXFileObject) wXMediaMessage2.mediaObject;
                            if (wXFileObject.fileData == null && !C86013q1.m106450k(wXFileObject.filePath)) {
                                Log.m105920e("MicroMsg.FavOpenApiEntry", "addFile data null");
                                break;
                            } else {
                                C100755z zVar6 = new C100755z();
                                zVar6.field_type = 8;
                                favOpenApiEntry.mo118224J7(wXMediaMessage2, zVar6);
                                favOpenApiEntry.mo118226L7(zVar6, wXMediaMessage2);
                                zVar6.field_favProto.f298618f.add(favOpenApiEntry.mo118223I7(wXMediaMessage2, wXFileObject.filePath, wXFileObject.fileData, zVar6.field_type));
                                C93658i.m118346a(zVar6);
                                break;
                            }
                            break;
                        default:
                            Log.m105920e("MicroMsg.FavOpenApiEntry", "unsupport type = " + type2);
                            break;
                    }
                } else {
                    WXMusicVideoObject wXMusicVideoObject = (WXMusicVideoObject) wXMediaMessage2.mediaObject;
                    if (Util.isNullOrNil(wXMusicVideoObject.musicUrl) && Util.isNullOrNil(wXMusicVideoObject.musicDataUrl)) {
                        Log.m105920e("MicroMsg.FavOpenApiEntry", "addMusic, both url null");
                    } else if (!Util.isNullOrNil(wXMusicVideoObject.hdAlbumThumbFilePath)) {
                        String str5 = wXMusicVideoObject.hdAlbumThumbFilePath;
                        C90170b bVar = new C90170b(favOpenApiEntry, wXMediaMessage2, wXMusicVideoObject);
                        ((C119157j) C119157j.f356862d).mo183876g(new C90066z(str5, bVar), "MusicVideoShareUploadImage");
                    } else {
                        wXMediaMessage2.mediaObject = wXMusicVideoObject;
                        favOpenApiEntry.mo118222H7(wXMediaMessage2, (String) null);
                    }
                }
                favOpenApiEntry.finish();
            }
            ReportUtil.m84997c(this.f258886b, ReportUtil.m84995a(this.f258886b.getIntent().getExtras(), 0), true, false);
            return;
        }
        this.f258886b.finish();
        FavOpenApiEntry favOpenApiEntry2 = this.f258886b;
        ReportUtil.m84997c(favOpenApiEntry2, ReportUtil.m84995a(favOpenApiEntry2.getIntent().getExtras(), 0), true, true);
    }
}
