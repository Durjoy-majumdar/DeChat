package je3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WxImeSendFailedReportStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.p136ui.transmit.C85970n;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72825s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import d62.C7250m;
import di0.C86299o;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C97625j3;
import gy3.C87412m;
import ht1.C60161e;
import ht1.C60200t1;
import i61.C98602h;
import j20.C117292a;
import java.util.HashSet;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import kj3.C76587i;
import kr0.C76629w0;
import kr0.C76630x0;
import p652pu.C100910b;
import p763ym.C79138l;
import qc0.C101093a;
import qc0.C101106m;
import rb0.C47984k;
import su0.C13781a;
import sx3.C110818d0;
import te3.C50954qg;
import wd3.C78575u;
import wm0.C91035a;
import z04.C112550d0;
import z04.C112551y;
import z51.C39315g;

/* renamed from: je3.c */
public final class C76414c {

    /* renamed from: a */
    public static final C76414c f223729a = new C76414c();

    /* renamed from: b */
    public static String f223730b = "";

    /* renamed from: c */
    public static String f223731c;

    /* renamed from: d */
    public static String f223732d;

    /* renamed from: e */
    public static final HashSet<String> f223733e;

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("send_text");
        hashSet.add("send_message");
        hashSet.add("send_big_emoji");
        hashSet.add("send_appbrand");
        hashSet.add("send_message_finder_card");
        hashSet.add("send_message_biz_card");
        hashSet.add("send_message_emoji");
        hashSet.add("open_appbrand");
        hashSet.add("open_music_video");
        hashSet.add("open_finder_profile");
        hashSet.add("open_biz_profile");
        f223733e = hashSet;
    }

    /* renamed from: a */
    public final String mo106634a() {
        ContentResolver contentResolver = MMApplicationContext.getContext().getContentResolver();
        C9556a aVar = new C9556a();
        aVar.mo10233c("default_input_method");
        aVar.mo10233c(contentResolver);
        String str = (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/pluginsdk/wxime/WxImeHelper", "getCurIme", "()Ljava/lang/String;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        Log.m105924i("MicroMsg.WxImeHelper", "getCurIme: " + str);
        return str != null ? (String) C112550d0.m153785U(str, new String[]{"/"}, false, 0, 6, (Object) null).get(0) : "";
    }

    /* renamed from: b */
    public final boolean mo106635b(Context context, String str, String str2, Bundle bundle, C72825s0 s0Var) {
        int i;
        C44561j jVar;
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        Bundle bundle2 = bundle;
        C72825s0 s0Var2 = s0Var;
        Class<C60200t1> cls = C60200t1.class;
        Class cls2 = C39315g.class;
        if (context2 == null || Util.isNullOrNil(str) || str4 == null) {
            return false;
        }
        if ((str2.length() == 0) || bundle2 == null || !C110818d0.m150903D(f223733e, str3)) {
            return false;
        }
        f223732d = str3;
        Class<C60200t1> cls3 = cls;
        if (!WeChatEnvironment.isCoolassistEnv()) {
            f223730b = mo106634a();
            f223731c = Util.getSignaturesMd5(mo106634a(), MMApplicationContext.getContext());
            if (!(Util.isEqual(f223730b, "com.tencent.wetype") && Util.isEqual(f223731c, "07a34d20a6578d1a6810858534d160be"))) {
                String str5 = f223730b;
                String str6 = f223731c;
                String str7 = f223732d;
                WxImeSendFailedReportStruct wxImeSendFailedReportStruct = new WxImeSendFailedReportStruct();
                wxImeSendFailedReportStruct.f194707d = wxImeSendFailedReportStruct.mo86045b("currentImePacketName", str5, true);
                wxImeSendFailedReportStruct.f194708e = wxImeSendFailedReportStruct.mo86045b("currentImePacketNameMd5", str6, true);
                wxImeSendFailedReportStruct.f194709f = wxImeSendFailedReportStruct.mo86045b("action", str7, true);
                wxImeSendFailedReportStruct.f194710g = 0;
                wxImeSendFailedReportStruct.mo86054n();
                String q = wxImeSendFailedReportStruct.mo1006q();
                C87412m.m108593f(q, "struct.toShowString()");
                Log.m105925i("MicroMsg.WxImeReport", "report%s %s", 28540, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
                return false;
            }
        }
        WXMediaMessage fromBundle = WXMediaMessage.Builder.fromBundle(bundle);
        String str8 = "report%s %s";
        String str9 = "MicroMsg.WxImeReport";
        Log.m105925i("MicroMsg.WxImeHelper", "onPrivateCommandHandleByIme action:%s, toUser:%s, type:%s ", str3, str4, Integer.valueOf(fromBundle.getType()));
        C44561j jVar2 = new C44561j();
        WXMediaMessage wXMediaMessage = fromBundle;
        String str10 = " ";
        jVar2.field_appId = bundle2.getString("appid", "");
        boolean isEqual = Util.isEqual("send_appbrand", str3);
        C44561j jVar3 = jVar2;
        String str11 = APLogFileUtil.SEPARATOR_LINE;
        String str12 = "struct.toShowString()";
        String str13 = "action";
        String str14 = "currentImePacketNameMd5";
        if (isEqual) {
            new C78575u.C78583h(context2).mo108578p(str4);
            String string = bundle2.getString("appid", "");
            C87412m.m108593f(string, "bundle.getString(WxPCSendAppBrand.APP_ID, \"\")");
            String string2 = bundle2.getString("wxaPath", "");
            C87412m.m108593f(string2, "bundle.getString(WxPCSendAppBrand.WXA_PATH, \"\")");
            String string3 = bundle2.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            C87412m.m108593f(string3, "bundle.getString(WxPCSendAppBrand.TITLE, \"\")");
            String string4 = bundle2.getString("appName", "");
            C87412m.m108593f(string4, "bundle.getString(WxPCSendAppBrand.APP_NAME, \"\")");
            byte[] byteArray = bundle2.getByteArray("thumbArray");
            Class<SendAppMessageWrapperUI> cls4 = SendAppMessageWrapperUI.class;
            Object[] objArr = new Object[6];
            objArr[0] = string;
            objArr[1] = string2;
            objArr[2] = string3;
            objArr[3] = str4;
            objArr[4] = string4;
            objArr[5] = Boolean.valueOf(byteArray != null);
            Log.m105919d("MicroMsg.WxImeHelper", "sendAppMsg appId:%s , wxaPath:%s , title:%s , toUser:%s , appName:%s , thumbArray:%s ", objArr);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("_wxapi_sendmessagetowx_req_media_type", 36);
            bundle3.putString(ConstantsAPI.TOKEN, "OpenSdkToken@1637854984953");
            bundle3.putString("_wxapi_basereq_transaction", string);
            bundle3.putInt("_wxobject_sdkVer", 0);
            bundle3.putString("_wxminiprogram_path", string2);
            bundle3.putInt("_wxminiprogram_type", 0);
            bundle3.putString("_wxobject_description", string3);
            bundle3.putString(ConstantsAPI.APP_PACKAGE, "net.sourceforge.simcpux");
            bundle3.putString(ConstantsAPI.CONTENT, "");
            bundle3.putString("_wxapi_sendmessagetowx_req_use_open_id", "webpage1637862529089");
            bundle3.putBoolean("SendAppMessageWrapper_TokenValid", true);
            bundle3.putString("SendAppMessageWrapper_PkgName", "net.sourceforge.simcpux");
            bundle3.putBoolean("SendAppMessageWrapper_SkipCompressVideo", true);
            bundle3.putBoolean("SendAppMessageWrapper_BlockInvalidToken", false);
            bundle3.putInt("SendAppMessageWrapper_secFlagForSinglePageMode", 0);
            bundle3.putString("SendAppMessageWrapper_videoTransPara", "");
            bundle3.putString("SendAppMessageWrapper_videoTransPara", "");
            ReportUtil.ReportArgs a = ReportUtil.m84995a(bundle3, -2);
            Intent intent = new Intent(context2, SelectConversationUI.class);
            intent.putExtra("Select_Report_Args", a);
            Intent putExtra = new Intent(context2, cls4).putExtras(bundle3).putExtra("SendAppMessageWrapper_Scene", 0);
            String str15 = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
            intent.putExtra("Select_Conv_NextStep", putExtra.putExtra("animation_pop_in", true));
            intent.putExtra("Select_App_Id", string);
            intent.putExtra("Select_Open_Id", "");
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("mutil_select_is_ret", false);
            intent.putExtra("Select_Conv_User", str4);
            Intent putExtra2 = new Intent(context2, cls4).putExtras(bundle3).putExtra("SendAppMessageWrapper_Scene", 0).putExtra("animation_pop_in", true);
            C87412m.m108593f(putExtra2, "Intent(\n            cont…l.ANIMATION_POP_IN, true)");
            Bundle extras = intent.getExtras();
            C87412m.m108591d(extras);
            putExtra2.putExtras(extras);
            WXMediaMessage wXMediaMessage2 = new WXMediaMessage();
            wXMediaMessage2.sdkVer = Build.SDK_INT;
            WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
            wXMiniProgramObject.path = string2;
            wXMiniProgramObject.userName = string4;
            wXMiniProgramObject.webpageUrl = "https://mp.weixin.qq.com/mp/waerrpage?appid=" + string + "&amp;type=upgrade&amp;upgradetype=3#wechat_redirect";
            wXMediaMessage2.mediaObject = wXMiniProgramObject;
            wXMediaMessage2.title = string3;
            wXMediaMessage2.description = string3;
            wXMediaMessage2.thumbData = byteArray;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str4);
            C44561j jVar4 = new C44561j();
            jVar4.field_appId = string;
            WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage2.mediaObject;
            C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject");
            WXMiniProgramObject wXMiniProgramObject2 = (WXMiniProgramObject) iMediaObject;
            ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106882cH(wXMiniProgramObject2.userName).mo123062e(new C76413a(wXMediaMessage2, wXMiniProgramObject2, linkedList, jVar4));
            Bundle bundle4 = bundle;
            C21232d.m23722a(C21232d.f60029a, 1, 1, bundle4.getString(str15, ""), bundle4.getString("appid", ""), (String) null, (String) null, (String) null, (String) null, (String) null, C83031z.CTRL_INDEX, (Object) null);
            return true;
        }
        String str16 = "appid";
        String str17 = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        if (Util.isEqual("open_appbrand", str3)) {
            C86299o oVar = new C86299o();
            oVar.f250929a = bundle2.getString("appName", "");
            oVar.f250934f = bundle2.getString("wxaPath", "");
            oVar.f250939k = C91035a.CTRL_INDEX;
            oVar.f250948t = str4;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context2, oVar);
            String string5 = bundle2.getString(str16, "");
            if (string5 == null || string5.length() == 0) {
                string5 = C76587i.m92181a(oVar.f250929a);
            }
            C21232d.m23722a(C21232d.f60029a, 2, 1, bundle2.getString(str17, ""), string5, (String) null, (String) null, (String) null, (String) null, (String) null, C83031z.CTRL_INDEX, (Object) null);
            return true;
        } else if (Util.isEqual("send_text", str3)) {
            if (s0Var2 != null) {
                s0Var2.mo100658t(bundle2.getString("content", ""));
            }
            return true;
        } else if (Util.isEqual("send_big_emoji", str3)) {
            String D = ((C98602h) ((C39315g) C86312j.m106911c(cls2)).mo58035cm()).mo137996D(context2, new WXMediaMessage(new WXEmojiObject(bundle2.getString("thumbPath", ""))), (String) null);
            Log.m105925i("MicroMsg.WxImeHelper", "sendEmoji: emojiMd5:%s", D);
            if (D != null) {
                EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls2)).mo58035cm()).mo137999G(D);
                G.field_activityid = bundle2.getString(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, "");
                G.field_groupId = bundle2.getString("product_id", "");
                G.field_designerID = bundle2.getString("designer_id", "");
                ((C98602h) ((C39315g) C86312j.m106911c(cls2)).mo58035cm()).mo138011S(str4, G, (C72963f4) null);
                C21232d.m23722a(C21232d.f60029a, 1, 3, (String) null, (String) null, (String) null, D, bundle2.getString("product_id", ""), (String) null, (String) null, 412, (Object) null);
                return true;
            }
            String str18 = f223730b;
            String str19 = f223731c;
            String str20 = f223732d;
            WxImeSendFailedReportStruct wxImeSendFailedReportStruct2 = new WxImeSendFailedReportStruct();
            wxImeSendFailedReportStruct2.f194707d = wxImeSendFailedReportStruct2.mo86045b("currentImePacketName", str18, true);
            wxImeSendFailedReportStruct2.f194708e = wxImeSendFailedReportStruct2.mo86045b(str14, str19, true);
            wxImeSendFailedReportStruct2.f194709f = wxImeSendFailedReportStruct2.mo86045b(str13, str20, true);
            wxImeSendFailedReportStruct2.f194710g = 1;
            wxImeSendFailedReportStruct2.mo86054n();
            String q2 = wxImeSendFailedReportStruct2.mo1006q();
            C87412m.m108593f(q2, str12);
            Log.m105925i(str9, str8, 28540, C112551y.m153814n(q2, str11, str10, false));
            return true;
        } else {
            String str21 = str13;
            String str22 = str14;
            if (Util.isEqual("send_message", str3)) {
                if (wXMediaMessage.getType() == 8) {
                    WXMediaMessage.IMediaObject iMediaObject2 = wXMediaMessage.mediaObject;
                    C87412m.m108592e(iMediaObject2, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXEmojiObject");
                    String C = ((C98602h) ((C39315g) C86312j.m106911c(cls2)).mo58035cm()).mo137995C(context2, ((WXEmojiObject) iMediaObject2).emojiPath);
                    if (C == null) {
                        return true;
                    }
                    ((C98602h) ((C39315g) C86312j.m106911c(cls2)).mo58035cm()).mo138010Q(context2, str4, C);
                    C21232d.m23722a(C21232d.f60029a, 1, 3, (String) null, (String) null, (String) null, C, bundle2.getString("product_id", ""), (String) null, (String) null, 412, (Object) null);
                    return true;
                }
                WXMediaMessage wXMediaMessage3 = wXMediaMessage;
                if (wXMediaMessage3.getType() == 36) {
                    WXMediaMessage.IMediaObject iMediaObject3 = wXMediaMessage3.mediaObject;
                    C87412m.m108592e(iMediaObject3, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject");
                    String a2 = C76587i.m92181a(((WXMiniProgramObject) iMediaObject3).userName);
                    jVar = jVar3;
                    if (a2 != null) {
                        jVar.field_appId = a2;
                    }
                    C21232d.m23722a(C21232d.f60029a, 1, 1, wXMediaMessage3.title, jVar.field_appId, (String) null, (String) null, (String) null, (String) null, (String) null, C83031z.CTRL_INDEX, (Object) null);
                } else {
                    jVar = jVar3;
                    if (wXMediaMessage3.getType() == 76) {
                        jVar.field_appId = bundle2.getString("appId", "wx5aa333606550dfd5");
                        C21232d dVar = C21232d.f60029a;
                        C21232d.m23722a(dVar, 1, 2, (String) null, (String) null, (String) null, (String) null, (String) null, wXMediaMessage3.title, (String) null, 380, (Object) null);
                        WXMediaMessage.IMediaObject iMediaObject4 = wXMediaMessage3.mediaObject;
                        if (iMediaObject4 instanceof WXMusicVideoObject) {
                            C87412m.m108592e(iMediaObject4, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject");
                            if (!((C79138l) C86312j.m106911c(C79138l.class)).mo73985Ae(((WXMusicVideoObject) iMediaObject4).hdAlbumThumbFilePath)) {
                                String str23 = f223730b;
                                String str24 = f223731c;
                                String str25 = f223732d;
                                WxImeSendFailedReportStruct wxImeSendFailedReportStruct3 = new WxImeSendFailedReportStruct();
                                wxImeSendFailedReportStruct3.f194707d = wxImeSendFailedReportStruct3.mo86045b("currentImePacketName", str23, true);
                                wxImeSendFailedReportStruct3.f194708e = wxImeSendFailedReportStruct3.mo86045b(str22, str24, true);
                                wxImeSendFailedReportStruct3.f194709f = wxImeSendFailedReportStruct3.mo86045b(str21, str25, true);
                                wxImeSendFailedReportStruct3.f194710g = 2;
                                wxImeSendFailedReportStruct3.mo86054n();
                                dVar.mo33222b(wxImeSendFailedReportStruct3);
                            }
                        }
                    }
                }
                Intent intent2 = new Intent();
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(str4);
                C85970n.m106295k(context, intent2, jVar, wXMediaMessage3, linkedList2, 1, true, false, "", 0, (String) null, 2, (C85970n.C85971a) null, (C85970n.C85973b) null);
                return true;
            } else if (Util.isEqual("open_music_video", str3)) {
                if (!((C60200t1) C86312j.m106911c(cls3)).mo76822Vm()) {
                    return true;
                }
                Intent intent3 = new Intent();
                intent3.putExtra("key_scene", 6);
                intent3.putExtra("key_mv_song_name", bundle2.getString(str17));
                intent3.putExtra("key_mv_song_lyric", bundle2.getString("songLyric"));
                intent3.putExtra("key_mv_singer_name", bundle2.getString("singerName"));
                intent3.putExtra("key_mv_album_name", bundle2.getString("albumName"));
                intent3.putExtra("key_mv_music_genre", bundle2.getString("musicGenre"));
                intent3.putExtra("key_mv_identification", bundle2.getString("identification"));
                intent3.putExtra("key_mv_thumb_path", bundle2.getString("thumbPath"));
                intent3.putExtra("key_mv_music_operation_url", bundle2.getString("musicUrl"));
                intent3.putExtra("key_mv_song_mid", bundle2.getString("songMid"));
                intent3.putExtra("key_mv_album_cover_url", bundle2.getString("thumbUrl"));
                Log.m105924i("MicroMsg.WxImeHelper", "toMusicMvMainUI: SONG_MID: " + bundle2.getString("songMid") + " MUSIC_ID:" + bundle2.getString("musicId") + " THUMB_URL:" + bundle2.getString("thumbUrl"));
                intent3.setFlags(268435456);
                C115669n.INSTANCE.kvStat(10090, "0,1");
                C101106m K40 = ((C100910b) C86312j.m106911c(C100910b.class)).K40(0, "", bundle2.getString(str17), bundle2.getString("singerName"), bundle2.getString("musicUrl"), "", bundle2.getString("musicDataUrl"), bundle2.getString("musicId"), "", bundle2.getString("thumbPath"), "", "wx5aa333606550dfd5");
                K40.f295958T = true;
                String string6 = bundle2.getString("songMid");
                K40.f295954P = string6;
                Log.m105925i("MicroMsg.WxImeHelper", "doPlayMusic, songName:%s, singer:%s, wrapper.songWebUrl:%s, wifiUrl:%s mid:%s musicId:%s", K40.f295962g, K40.f295963h, K40.f295968p, K40.f295966n, string6, K40.f295960e);
                C101093a.m132488j(K40);
                C21232d.m23722a(C21232d.f60029a, 2, 2, (String) null, (String) null, (String) null, (String) null, (String) null, bundle2.getString(str17), (String) null, 380, (Object) null);
                C88144b.m109791i(context2, "mv", ".ui.MusicMvMainUI", intent3, (Bundle) null);
                return true;
            } else if (Util.isEqual("send_message_finder_card", str3)) {
                C68070l.C68072b bVar = new C68070l.C68072b();
                C60161e eVar = new C60161e();
                String string7 = bundle2.getString("username", "");
                C87412m.m108593f(string7, "bundle.getString(WxPCFinder.USERNAME, \"\")");
                eVar.mo85136j(string7);
                String string8 = bundle2.getString("nickname", "");
                C87412m.m108593f(string8, "bundle.getString(WxPCFinder.NICKNAME, \"\")");
                eVar.mo85135i(string8);
                String string9 = bundle2.getString("headerUrl", "");
                C87412m.m108593f(string9, "bundle.getString(WxPCFinder.HEAD_URL, \"\")");
                eVar.mo85134h(string9);
                int i2 = bundle2.getInt("authIcon", 0);
                eVar.f171701b.f185049h = i2;
                eVar.f171706g = i2;
                String string10 = bundle2.getString("authJob", "");
                C87412m.m108593f(string10, "bundle.getString(WxPCFinder.AUTH_JOB, \"\")");
                eVar.mo85133g(string10);
                String string11 = bundle2.getString("authIconUrl", "");
                C87412m.m108593f(string11, "bundle.getString(WxPCFinder.AUTH_ICON_URL, \"\")");
                eVar.f171707h = string11;
                bVar.mo93545f(eVar);
                bVar.f195582i = 50;
                bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
                bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
                C80996q.C1279a.m1369a().mo112827qE(bVar, "", "", str2, "", (byte[]) null);
                C21232d.m23722a(C21232d.f60029a, 1, 4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, bundle2.getString("username", ""), 252, (Object) null);
                return true;
            } else if (Util.isEqual("send_message_biz_card", str3)) {
                String string12 = bundle2.getString("username", "");
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(string12);
                if (((z1Var == null || !z1Var.mo62916m3()) ? null : C47984k.m53328b(z1Var.getUsername())) != null) {
                    C7250m.m7431a().nw0(string12, str4, C72996z1.m85820U5(str2), (C50954qg) null);
                } else {
                    C31519v2.m39436a().mo55988e(string12, "", new C46555b(str4));
                }
                C21232d.m23722a(C21232d.f60029a, 1, 5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, bundle2.getString("username", ""), 252, (Object) null);
                return true;
            } else if (Util.isEqual("open_biz_profile", str3)) {
                Intent intent4 = new Intent();
                intent4.putExtra("Contact_User", bundle2.getString("username", ""));
                intent4.putExtra("Contact_Alias", bundle2.getString("aliasName", ""));
                intent4.putExtra("Contact_QuanPin", bundle2.getString("nickname", ""));
                intent4.putExtra("Contact_VUser_Info_Flag", bundle2.getInt("verifyFlag", 0));
                intent4.putExtra("Contact_VUser_Info", bundle2.getString("certInfo", ""));
                intent4.putExtra("Contact_BrandIconURL", bundle2.getString("brandIconUrl", ""));
                intent4.putExtra("Contact_Province", bundle2.getString("province", ""));
                intent4.putExtra("Contact_City", bundle2.getString("city", ""));
                intent4.putExtra("Contact_Sex", bundle2.getInt("sex", 0));
                intent4.putExtra("Contact_Signature", bundle2.getString("signature", ""));
                intent4.putExtra("Contact_ShowUserName", true);
                intent4.putExtra("Contact_KSnsIFlag", 0);
                C88144b.m109791i(context2, Scopes.PROFILE, ".ui.ContactInfoUI", intent4, (Bundle) null);
                C21232d.m23722a(C21232d.f60029a, 2, 5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, bundle2.getString("username", ""), 252, (Object) null);
                return true;
            } else if (!Util.isEqual("open_finder_profile", str3)) {
                return false;
            } else {
                Intent intent5 = new Intent();
                if (C72996z1.m85820U5(C13781a.m13082a())) {
                    i = 2;
                    intent5.putExtra("key_finder_teen_mode_scene", 2);
                    intent5.putExtra("report_scene", 2);
                } else {
                    i = 2;
                    intent5.putExtra("key_finder_teen_mode_scene", 1);
                    intent5.putExtra("report_scene", 1);
                }
                C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls3);
                if (C72996z1.m85820U5(C13781a.m13082a())) {
                    i = 3;
                }
                t1Var.mo76842e7(i, 3, 32, intent5);
                intent5.putExtra("key_enter_profile_type", 4);
                intent5.putExtra("key_entrance_type", 32);
                intent5.putExtra("from_user", C13781a.m13082a());
                intent5.putExtra("finder_username", bundle2.getString("username", ""));
                intent5.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
                intent5.putExtra("key_finder_teen_mode_check", true);
                intent5.putExtra("key_finder_teen_mode_user_name", bundle2.getString("nickname", ""));
                ((C60200t1) C86312j.m106911c(cls3)).mo76819V1(context2, intent5);
                C21232d.m23722a(C21232d.f60029a, 2, 4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, bundle2.getString("username", ""), 252, (Object) null);
                return true;
            }
        }
    }
}
