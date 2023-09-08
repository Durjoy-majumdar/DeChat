package qe3;

import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1694g2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1700h5;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1701i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1759n3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1762o0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1769p1;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1774p4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1840q1;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1851s3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1909x5;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40473o1;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82872p6;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83135z1;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiGamelifeManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiWriteCommData;
import com.tencent.p014mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82090l;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82102w;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1640c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1643f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter.C1650c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82398i;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55511i;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C1715u;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82801g;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82852c;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82855e;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82860i;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1818p;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1824s;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1835y;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82876d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17928i;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C17990g;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83053e;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83054f;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55527g;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55529k;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55531o;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C83067i;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83118q;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.core.player.TPNativePlayerInitConfig;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import fm0.C8134n0;
import fm0.C86940g0;
import fm0.C86945i;
import fm0.C86950j1;
import fm0.C86962m1;
import fm0.C86964n1;
import gk0.C8330j0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kk0.C88191m;
import nm0.C11221d;
import ol0.C117804f0;
import sl0.C48418i;
import sl0.C90220f;
import sl0.C90225m;
import sl0.C90227p;
import tm0.C78044d0;
import tm0.C90538k;
import vl0.C90830d;
import xk0.C91263b;
import xk0.C91264c;
import yn0.C91518c;
import zn0.C91797a;
import zn0.C91803c;
import zn0.C91807d;
import zn0.C91810e;

/* renamed from: qe3.c */
public class C25549c {

    /* renamed from: a */
    public static Map<String, C12172h> f72239a;

    /* renamed from: b */
    public static final String[] f72240b = ((String[]) new C12159a().toArray(new String[0]));

    /* renamed from: qe3.c$a */
    public class C12159a extends LinkedList<String> {
        public C12159a() {
            add("confirmDialog");
            add("openWebViewUseFastLoad");
            add(C91518c.NAME);
            add("handleMPPageAction");
            add("handleVideoAction");
            add("startSearchItemDetailPage");
            add("startCommonSearchItemDetailPage");
            add("configMpAdAttrs");
            add(C1909x5.NAME);
            add(C83135z1.NAME);
            add("preloadLiteApp");
            add("openLiteApp");
        }
    }

    /* renamed from: qe3.c$a1 */
    public static class C12160a1 extends C12172h {
        public C12160a1() {
            super("currentMpInfoHide", "currentMpInfoHide", C90225m.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$ab */
    public static class C12161ab extends C12172h {
        public C12161ab() {
            super("setSnsObjectXmlDescList", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$b1 */
    public static class C12162b1 extends C12172h {
        public C12162b1() {
            super("currentMpInfoShow", "currentMpInfoShow", C90220f.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$ba */
    public static final class C12163ba extends C12172h {
        public C12163ba() {
            super("sendDataToMiniProgram", "sendDataToMiniProgram", 321, false);
        }
    }

    /* renamed from: qe3.c$d1 */
    public static class C12164d1 extends C12172h {
        public C12164d1() {
            super("deleteSearchHistory", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$e2 */
    public static final class C12165e2 extends C12172h {
        public C12165e2() {
            super("getAdIdInfo", "getAdIdInfo", 375, false);
        }
    }

    /* renamed from: qe3.c$e4 */
    public static class C12166e4 extends C12172h {
        public C12166e4() {
            super("gotoEmoticonPad", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$f3 */
    public static final class C12167f3 extends C12172h {
        public C12167f3() {
            super("getPasteboardContent", "getPasteboardContent", 364, false);
        }
    }

    /* renamed from: qe3.c$f4 */
    public static final class C12168f4 extends C12172h {
        public C12168f4() {
            super("handleDeviceInfo", "handleDeviceInfo", C91263b.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$fe */
    public static class C12169fe extends C12172h {
        public C12169fe() {
            super("jumpWSRecVideoList", "", C91803c.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$g4 */
    public static final class C12170g4 extends C12172h {
        public C12170g4() {
            super("handleHaokanAction", "handleHaokanAction", 335, false);
        }
    }

    /* renamed from: qe3.c$gd */
    public static final class C12171gd extends C12172h {
        public C12171gd() {
            super("viewTypeChange", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$hd */
    public static class C12173hd extends C12172h {
        public C12173hd() {
            super("wcpaySecurityCrosscutBack", "", 355, true);
        }
    }

    /* renamed from: qe3.c$j1 */
    public static final class C12174j1 extends C12172h {
        public C12174j1() {
            super("doAuthCurrentUrl", "doAuthCurrentUrl", 397, false);
        }
    }

    /* renamed from: qe3.c$j2 */
    public static class C12175j2 extends C12172h {
        public C12175j2() {
            super("getChatSearchData", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$j3 */
    public static final class C12176j3 extends C12172h {
        public C12176j3() {
            super("getRedPacketDone", "getRedPacketDone", 365, false);
        }
    }

    /* renamed from: qe3.c$k */
    public static class C12177k extends C12172h {
        public C12177k() {
            super("addDownloadApp", "addDownloadApp", JsApiCheckBioEnrollment.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$k8 */
    public static final class C12178k8 extends C12172h {
        public C12178k8() {
            super("privateCommonApi", "privateCommonApi", 330, true);
        }
    }

    /* renamed from: qe3.c$l1 */
    public static class C12179l1 extends C12172h {
        public C12179l1() {
            super("doSearchOperation", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$l8 */
    public static final class C12180l8 extends C12172h {
        public C12180l8() {
            super("privateOpenWeappFunctionalPage", "privateOpenWeappFunctionalPage", 333, false);
        }
    }

    /* renamed from: qe3.c$m5 */
    public static class C12181m5 extends C12172h {
        public C12181m5() {
            super("musicPlay", "playMusic", 69, false);
        }
    }

    /* renamed from: qe3.c$me */
    public static class C12182me extends C12172h {
        public C12182me() {
            super("openWebSearchOutLinkItem", "", C0947jz.f2205e, true);
        }
    }

    /* renamed from: qe3.c$o5 */
    public static class C12183o5 extends C12172h {
        public C12183o5() {
            super("navControl", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$o7 */
    public static final class C12184o7 extends C12172h {
        public C12184o7() {
            super("openWebViewUseFastLoad", "openWebViewUseFastLoad", 336, false);
        }
    }

    /* renamed from: qe3.c$p3 */
    public static class C12185p3 extends C12172h {
        public C12185p3() {
            super("getSearchGuideData", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$pa */
    public static class C12186pa extends C12172h {
        public C12186pa() {
            super("setFontSizeCallback", "", -2, false);
        }
    }

    /* renamed from: qe3.c$q */
    public static final class C12187q extends C12172h {
        public C12187q() {
            super(C1769p1.NAME, C1769p1.NAME, 376, false);
        }
    }

    /* renamed from: qe3.c$q0 */
    public static class C12188q0 extends C12172h {
        public C12188q0() {
            super("clickSnsMusicPlayButton", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$q2 */
    public static class C12189q2 extends C12172h {
        public C12189q2() {
            super("getFestivalLiveInfo", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$q3 */
    public static class C12190q3 extends C12172h {
        public C12190q3() {
            super("getSearchHistory", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$r8 */
    public static class C12191r8 extends C12172h {
        public C12191r8() {
            super("querySimilarEmotion", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$ra */
    public static class C12192ra extends C12172h {
        public C12192ra() {
            super("setInteractivePopGestureEnabled", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$s3 */
    public static class C12193s3 extends C12172h {
        public C12193s3() {
            super("getSearchSnsImageList", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$sd */
    public static class C12194sd extends C12172h {
        public C12194sd() {
            super("reportWeAppSearchRealtime", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$t2 */
    public static class C12195t2 extends C12172h {
        public C12195t2() {
            super("getPoiInfo", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$t4 */
    public static class C12196t4 extends C12172h {
        public C12196t4() {
            super("insertVideoPlayer", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$u */
    public static final class C12197u extends C12172h {
        public C12197u() {
            super(C83135z1.NAME, C83135z1.NAME, 366, false);
        }
    }

    /* renamed from: qe3.c$u9 */
    public static class C12198u9 extends C12172h {
        public C12198u9() {
            super(C90227p.NAME, "", 329, false);
        }
    }

    /* renamed from: qe3.c$v0 */
    public static final class C12199v0 extends C12172h {
        public C12199v0() {
            super("confirmDialog", "confirmDialog", C117804f0.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$vb */
    public static class C12200vb extends C12172h {
        public C12200vb() {
            super("showWeDrawHomeView", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$w7 */
    public static class C12201w7 extends C12172h {
        public C12201w7() {
            super(C83053e.NAME, "", 10000, false);
        }
    }

    /* renamed from: qe3.c$w8 */
    public static class C12202w8 extends C12172h {
        public C12202w8() {
            super("reloadSearchWAWidgetData", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$wc */
    public static class C12203wc extends C12172h {
        public C12203wc() {
            super(C17990g.NAME, "", 10000, false);
        }
    }

    /* renamed from: qe3.c$x7 */
    public static final class C12204x7 extends C12172h {
        public C12204x7() {
            super("opAdH5Func", "", -2, false);
        }
    }

    /* renamed from: qe3.c$y1 */
    public static class C12205y1 extends C12172h {
        public C12205y1() {
            super("openEmotionPage", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$y4 */
    public static class C12206y4 extends C12172h {
        public C12206y4() {
            super("jumpToInstallUrl", "", 26, false);
        }
    }

    /* renamed from: qe3.c$y7 */
    public static final class C12207y7 extends C12172h {
        public C12207y7() {
            super("opJumpView", "", -2, false);
        }
    }

    /* renamed from: qe3.c$y8 */
    public static class C12208y8 extends C12172h {
        public C12208y8() {
            super(C83054f.NAME, "", 10000, false);
        }
    }

    /* renamed from: qe3.c$yb */
    public static class C12209yb extends C12172h {
        public C12209yb() {
            super("startCommonSearchItemDetailPage", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$z7 */
    public static final class C12210z7 extends C12172h {
        public C12210z7() {
            super("opVoteAdData", "", -2, false);
        }
    }

    /* renamed from: qe3.c$a0 */
    public static class C25550a0 extends C12172h {
        public C25550a0() {
            super("cancelSearchActionSheet", "cancelSearchActionSheet", 10000, false);
        }
    }

    /* renamed from: qe3.c$a2 */
    public static class C25551a2 extends C12172h {
        public C25551a2() {
            super("querySearchWeb", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$a3 */
    public static final class C25552a3 extends C12172h {
        public C25552a3() {
            super("getMatchContactList", "getMatchContactList", 10000, false);
        }
    }

    /* renamed from: qe3.c$a4 */
    public static final class C25553a4 extends C12172h {
        public C25553a4() {
            super("getWePkgAuthResult", "getWePkgAuthResult", -3, false);
        }
    }

    /* renamed from: qe3.c$a5 */
    public static class C25554a5 extends C12172h {
        public C25554a5() {
            super("jumpWCMall", "jump_wcmall", 51, true);
        }
    }

    /* renamed from: qe3.c$a6 */
    public static final class C25555a6 extends C12172h {
        public C25555a6() {
            super("onWebPageUrlExposed", "onWebPageUrlExposed", C91264c.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$a7 */
    public static class C25556a7 extends C12172h {
        public C25556a7() {
            super("openMyDeviceProfile", "openMyDeviceProfile", 145, false);
        }
    }

    /* renamed from: qe3.c$a8 */
    public static class C25557a8 extends C12172h {
        public C25557a8() {
            super(JsApiPauseDownloadTask.NAME, "cancel_download_task", WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, false);
        }
    }

    /* renamed from: qe3.c$a9 */
    public static final class C25558a9 extends C12172h {
        public C25558a9() {
            super("reportGamePageTime", "reportGamePageTime", 301, false);
        }
    }

    /* renamed from: qe3.c$aa */
    public static class C25559aa extends C12172h {
        public C25559aa() {
            super("sendAppMessage", "send_app_msg", 6, true);
        }
    }

    /* renamed from: qe3.c$ac */
    public static class C25560ac extends C12172h {
        public C25560ac() {
            super(C86962m1.NAME, C86962m1.NAME, 204, false);
        }
    }

    /* renamed from: qe3.c$ad */
    public static class C25561ad extends C12172h {
        public C25561ad() {
            super("uploadMediaFile", "uploadMediaFile", 237, true);
        }
    }

    /* renamed from: qe3.c$ae */
    public static final class C25562ae extends C12172h {
        public C25562ae() {
            super("getCCData", "getCCData", 312, false);
        }
    }

    /* renamed from: qe3.c$b */
    public static class C25563b extends C12172h {
        public C25563b() {
            super(JsApiGetMusicPlayerState.NAME, JsApiGetMusicPlayerState.NAME, 210, false);
        }
    }

    /* renamed from: qe3.c$b0 */
    public static class C25564b0 extends C12172h {
        public C25564b0() {
            super("changePayActivityView", "change_pay_activity_view", 207, true);
        }
    }

    /* renamed from: qe3.c$b2 */
    public static final class C25565b2 extends C12172h {
        public C25565b2() {
            super("recordHistory", "recordHistory", 219, false);
        }
    }

    /* renamed from: qe3.c$b3 */
    public static class C25566b3 extends C12172h {
        public C25566b3() {
            super("getMsgProofItems", "getMsgProofItems", 226, true);
        }
    }

    /* renamed from: qe3.c$b4 */
    public static class C25567b4 extends C12172h {
        public C25567b4() {
            super("getWidgetCaptureImgUrl", "add_contact", 10000, false);
        }
    }

    /* renamed from: qe3.c$b5 */
    public static class C25568b5 extends C12172h {
        public C25568b5() {
            super("jumpToWXWallet", "jumpToWXWallet", 147, true);
        }
    }

    /* renamed from: qe3.c$b6 */
    public static final class C25569b6 extends C12172h {
        public C25569b6() {
            super("openWCPayCardList", "openWCPayCardList", 310, true);
        }
    }

    /* renamed from: qe3.c$b7 */
    public static class C25570b7 extends C12172h {
        public C25570b7() {
            super("openNewPage", "openNewPage", 20000, false);
        }
    }

    /* renamed from: qe3.c$b8 */
    public static class C25571b8 extends C12172h {
        public C25571b8() {
            super(JsApiPausePlayVoice.NAME, JsApiPausePlayVoice.NAME, 100, false);
        }
    }

    /* renamed from: qe3.c$b9 */
    public static final class C25572b9 extends C12172h {
        public C25572b9() {
            super("reportGameWeb", "reportGameWeb", 332, false);
        }
    }

    /* renamed from: qe3.c$bb */
    public static class C25573bb extends C12172h {
        public C25573bb() {
            super("setStatusBarStyle", "setStatusBarStyle", 206, false);
        }
    }

    /* renamed from: qe3.c$bc */
    public static class C25574bc extends C12172h {
        public C25574bc() {
            super(JsApiStartRecordVoice.NAME, JsApiStartRecordVoice.NAME, 96, false);
        }
    }

    /* renamed from: qe3.c$bd */
    public static class C25575bd extends C12172h {
        public C25575bd() {
            super("uploadVideo", "uploadVideo", 192, true);
        }
    }

    /* renamed from: qe3.c$be */
    public static final class C25576be extends C12172h {
        public C25576be() {
            super(C55527g.NAME, C55527g.NAME, 408, true);
        }
    }

    /* renamed from: qe3.c$c */
    public static class C25577c extends C12172h {
        public C25577c() {
            super(JsApiOperateMusicPlayer.NAME, JsApiOperateMusicPlayer.NAME, 211, false);
        }
    }

    /* renamed from: qe3.c$c0 */
    public static final class C25578c0 extends C12172h {
        public C25578c0() {
            super("checkIsSupportFaceDetect", "checkIsSupportFaceDetect", 265, false);
        }
    }

    /* renamed from: qe3.c$c1 */
    public static class C25579c1 extends C12172h {
        public C25579c1() {
            super("deleteAccountSuccess", "deleteAccountSuccess", 144, false);
        }
    }

    /* renamed from: qe3.c$c2 */
    public static class C25580c2 extends C12172h {
        public C25580c2() {
            super(JsApiGamelifeManager.NAME, JsApiGamelifeManager.NAME, 452, true);
        }
    }

    /* renamed from: qe3.c$c3 */
    public static class C25581c3 extends C12172h {
        public C25581c3() {
            super(C90538k.NAME, TPDownloadProxyEnum.USER_NETWORK_TYPE, 16, false);
        }
    }

    /* renamed from: qe3.c$c4 */
    public static class C25582c4 extends C12172h {
        public C25582c4() {
            super("getWXDeviceInfos", "getWXDeviceInfos", 119, true);
        }
    }

    /* renamed from: qe3.c$c5 */
    public static class C25583c5 extends C12172h {
        public C25583c5() {
            super(C11221d.NAME, C11221d.NAME, 170, false);
        }
    }

    /* renamed from: qe3.c$c6 */
    public static final class C25584c6 extends C12172h {
        public C25584c6() {
            super("openBizChat", "openBizChat", 296, true);
        }
    }

    /* renamed from: qe3.c$c7 */
    public static final class C25585c7 extends C12172h {
        public C25585c7() {
            super(C1774p4.NAME, C1774p4.NAME, ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE, true);
        }
    }

    /* renamed from: qe3.c$c8 */
    public static final class C25586c8 extends C12172h {
        public C25586c8() {
            super(C1700h5.NAME, C1700h5.NAME, 370, false);
        }
    }

    /* renamed from: qe3.c$c9 */
    public static class C25587c9 extends C12172h {
        public C25587c9() {
            super("reportIDKey", "reportIDKey", 163, false);
        }
    }

    /* renamed from: qe3.c$ca */
    public static class C25588ca extends C12172h {
        public C25588ca() {
            super("sendDataToWXDevice", "sendDataToWXDevice", 120, true);
        }
    }

    /* renamed from: qe3.c$cb */
    public static class C25589cb extends C12172h {
        public C25589cb() {
            super("shareCustomContent", "shareCustomContent", 368, true);
        }
    }

    /* renamed from: qe3.c$cc */
    public static class C25590cc extends C12172h {
        public C25590cc() {
            super("startScanWXDevice", "startScanWXDevice", 121, true);
        }
    }

    /* renamed from: qe3.c$cd */
    public static class C25591cd extends C12172h {
        public C25591cd() {
            super("uploadVoice", "uploadVoice", 102, true);
        }
    }

    /* renamed from: qe3.c$ce */
    public static final class C25592ce extends C12172h {
        public C25592ce() {
            super(C8330j0.NAME, C8330j0.NAME, C91807d.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$d */
    public static class C25593d extends C12172h {
        public C25593d() {
            super("getLocalImgData", "getLocalImgData", 249, false);
        }
    }

    /* renamed from: qe3.c$d0 */
    public static class C25594d0 extends C12172h {
        public C25594d0() {
            super("checkJsApi", "checkJsApi", 84, false);
        }
    }

    /* renamed from: qe3.c$d2 */
    public static class C25595d2 extends C12172h {
        public C25595d2() {
            super("geoLocation", "geo_location", 57, false);
        }
    }

    /* renamed from: qe3.c$d3 */
    public static final class C25596d3 extends C12172h {
        public C25596d3() {
            super(C1574a3.NAME, C1574a3.NAME, 361, false);
        }
    }

    /* renamed from: qe3.c$d4 */
    public static class C25597d4 extends C12172h {
        public C25597d4() {
            super("getWXDeviceTicket", "getWXDeviceTicket", 125, true);
        }
    }

    /* renamed from: qe3.c$d5 */
    public static class C25598d5 extends C12172h {
        public C25598d5() {
            super("launch3rdApp", "launch_3rdApp", 52, true);
        }
    }

    /* renamed from: qe3.c$d6 */
    public static class C25599d6 extends C12172h {
        public C25599d6() {
            super("openCamera", "openCamera", 10008, true);
        }
    }

    /* renamed from: qe3.c$d7 */
    public static class C25600d7 extends C12172h {
        public C25600d7() {
            super("openProductView", "open_product_view", 59, true);
        }
    }

    /* renamed from: qe3.c$d8 */
    public static class C25601d8 extends C12172h {
        public C25601d8() {
            super("playMusic", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$d9 */
    public static final class C25602d9 extends C12172h {
        public C25602d9() {
            super("reportMiniProgramPageData", "reportMiniProgramPageData", C86962m1.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$da */
    public static class C25603da extends C12172h {
        public C25603da() {
            super("sendEnterpriseChat", "sendEnterpriseChat", WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, true);
        }
    }

    /* renamed from: qe3.c$db */
    public static final class C25604db extends C12172h {
        public C25604db() {
            super("shareEmoticon", "shareEmoticon", 275, true);
        }
    }

    /* renamed from: qe3.c$dc */
    public static class C25605dc extends C12172h {
        public C25605dc() {
            super("startSearchItemDetailPage", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$dd */
    public static class C25606dd extends C12172h {
        public C25606dd() {
            super("uxSearchOpLog", "uxSearchOpLog", 10000, false);
        }
    }

    /* renamed from: qe3.c$de */
    public static class C25607de extends C12172h {
        public C25607de() {
            super("WNNativeCallbackOnBecomeEditing", "WNNativeCallbackOnBecomeEditing", 10006, false);
        }
    }

    /* renamed from: qe3.c$e */
    public static class C25608e extends C12172h {
        public C25608e() {
            super("openEmotionDetailViewLocal", "openEmotionDetailViewLocal", 20000, false);
        }
    }

    /* renamed from: qe3.c$e0 */
    public static class C25609e0 extends C12172h {
        public C25609e0() {
            super("chooseCard", "choose_card", 70, true);
        }
    }

    /* renamed from: qe3.c$e1 */
    public static class C25610e1 extends C12172h {
        public C25610e1() {
            super("disableBounceScroll", "disableBounceScroll", WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED, false);
        }
    }

    /* renamed from: qe3.c$e3 */
    public static class C25611e3 extends C12172h {
        public C25611e3() {
            super("getOpenDeviceId", "getOpenDeviceId", WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC, false);
        }
    }

    /* renamed from: qe3.c$e5 */
    public static class C25612e5 extends C12172h {
        public C25612e5() {
            super("launchApp", "", 27, false);
        }
    }

    /* renamed from: qe3.c$e6 */
    public static final class C25613e6 extends C12172h {
        public C25613e6() {
            super(JsApiOpenAdCanvas.NAME, JsApiOpenAdCanvas.NAME, C82872p6.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$e7 */
    public static class C25614e7 extends C12172h {
        public C25614e7() {
            super("openProductViewWithPid", "open_product_view", 60, true);
        }
    }

    /* renamed from: qe3.c$e8 */
    public static class C25615e8 extends C12172h {
        public C25615e8() {
            super(JsApiStartPlayVoice.NAME, JsApiStartPlayVoice.NAME, 99, false);
        }
    }

    /* renamed from: qe3.c$e9 */
    public static class C25616e9 extends C12172h {
        public C25616e9() {
            super("reportSearchRealTimeStatistics", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$ea */
    public static final class C25617ea extends C12172h {
        public C25617ea() {
            super("menuitem:gameSendDesktop", "menuitem:gameSendDesktop", 255, false);
        }
    }

    /* renamed from: qe3.c$eb */
    public static class C25618eb extends C12172h {
        public C25618eb() {
            super("shareQQ", "shareQQ", 90, true);
        }
    }

    /* renamed from: qe3.c$ec */
    public static class C25619ec extends C12172h {
        public C25619ec() {
            super("startTempSession", "startTempSession", 128, true);
        }
    }

    /* renamed from: qe3.c$ed */
    public static class C25620ed extends C12172h {
        public C25620ed() {
            super("verifyWCPayPassword", "verifyWCPayPassword", 115, true);
        }
    }

    /* renamed from: qe3.c$ee */
    public static class C25621ee extends C12172h {
        public C25621ee() {
            super("WNNativeCallbackOnBecomeEdited", "WNNativeCallbackOnBecomeEdited", 10006, false);
        }
    }

    /* renamed from: qe3.c$f */
    public static class C25622f extends C12172h {
        public C25622f() {
            super("getRecevieBizHongBaoRequest", "getRecevieBizHongBaoRequest", 135, true);
        }
    }

    /* renamed from: qe3.c$f0 */
    public static final class C25623f0 extends C12172h {
        public C25623f0() {
            super("chooseHaowanMedia", "chooseHaowanMedia", C82855e.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$f1 */
    public static class C25624f1 extends C12172h {
        public C25624f1() {
            super("disablePullDownRefresh", "disablePullDownRefresh", 205, false);
        }
    }

    /* renamed from: qe3.c$f2 */
    public static final class C25625f2 extends C12172h {
        public C25625f2() {
            super(JsApiGetBackgroundAudioState.NAME, JsApiGetBackgroundAudioState.NAME, TPReportParams.LIVE_STEP_PLAY, false);
        }
    }

    /* renamed from: qe3.c$f5 */
    public static final class C25626f5 extends C12172h {
        public C25626f5() {
            super("launchApplication", "launchApplication", 260, true);
        }
    }

    /* renamed from: qe3.c$f6 */
    public static final class C25627f6 extends C12172h {
        public C25627f6() {
            super("openCustomWebview", "openCustomWebview", 256, false);
        }
    }

    /* renamed from: qe3.c$f7 */
    public static final class C25628f7 extends C12172h {
        public C25628f7() {
            super("openSearchCanvas", "openSearchCanvas", C82872p6.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$f8 */
    public static final class C25629f8 extends C12172h {
        public C25629f8() {
            super("preloadMiniProgramContacts", "preloadMiniProgramContacts", 303, false);
        }
    }

    /* renamed from: qe3.c$f9 */
    public static class C25630f9 extends C12172h {
        public C25630f9() {
            super("reportSearchStatistics", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$fa */
    public static class C25631fa extends C12172h {
        public C25631fa() {
            super("sendEmail", "send_email", 35, false);
        }
    }

    /* renamed from: qe3.c$fb */
    public static class C25632fb extends C12172h {
        public C25632fb() {
            super("shareQZone", "shareQZone", 132, true);
        }
    }

    /* renamed from: qe3.c$fc */
    public static class C25633fc extends C12172h {
        public C25633fc() {
            super("startVoipCall", "startVoipCall", 230, false);
        }
    }

    /* renamed from: qe3.c$fd */
    public static class C25634fd extends C12172h {
        public C25634fd() {
            super(C78044d0.NAME, C78044d0.NAME, 401, false);
        }
    }

    /* renamed from: qe3.c$g */
    public static class C25635g extends C12172h {
        public C25635g() {
            super("scanCover", "scanCover", 136, true);
        }
    }

    /* renamed from: qe3.c$g0 */
    public static class C25636g0 extends C12172h {
        public C25636g0() {
            super("chooseIdCard", "chooseIdCard", 247, true);
        }
    }

    /* renamed from: qe3.c$g1 */
    public static class C25637g1 extends C12172h {
        public C25637g1() {
            super("disconnectWXDevice", "disconnectWXDevice", 124, true);
        }
    }

    /* renamed from: qe3.c$g2 */
    public static final class C25638g2 extends C12172h {
        public C25638g2() {
            super("requestBindPhoneNumber", "requestBindPhoneNumber", 387, false);
        }
    }

    /* renamed from: qe3.c$g3 */
    public static class C25639g3 extends C12172h {
        public C25639g3() {
            super("getPaymentOrderRequest", "getPaymentOrderRequest", 116, true);
        }
    }

    /* renamed from: qe3.c$g5 */
    public static final class C25640g5 extends C12172h {
        public C25640g5() {
            super("launchGameVideoEditor", "launchGameVideoEditor", TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, true);
        }
    }

    /* renamed from: qe3.c$g6 */
    public static class C25641g6 extends C12172h {
        public C25641g6() {
            super("openDesignerEmojiView", "openDesignerEmojiView", WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD, true);
        }
    }

    /* renamed from: qe3.c$g7 */
    public static final class C25642g7 extends C12172h {
        public C25642g7() {
            super("openSearchWAWidgetLogView", "openSearchWAWidgetLogView", 10000, true);
        }
    }

    /* renamed from: qe3.c$g8 */
    public static final class C25643g8 extends C12172h {
        public C25643g8() {
            super("preloadMiniProgramEnv", "preloadMiniProgramEnv", 302, false);
        }
    }

    /* renamed from: qe3.c$g9 */
    public static final class C25644g9 extends C12172h {
        public C25644g9() {
            super("request", "request", 331, false);
        }
    }

    /* renamed from: qe3.c$ga */
    public static class C25645ga extends C12172h {
        public C25645ga() {
            super("sendServiceAppMessage", "send_service_app_msg", 67, true);
        }
    }

    /* renamed from: qe3.c$gb */
    public static class C25646gb extends C12172h {
        public C25646gb() {
            super("shareWeiboApp", "shareWeiboApp", 107, false);
        }
    }

    /* renamed from: qe3.c$gc */
    public static class C25647gc extends C12172h {
        public C25647gc() {
            super("stopMonitoringBeacons", "stopMonitoringBeacons", 152, false);
        }
    }

    /* renamed from: qe3.c$ge */
    public static class C25648ge extends C12172h {
        public C25648ge() {
            super("menu:setfont", "", 129, false);
        }
    }

    /* renamed from: qe3.c$h0 */
    public static class C25649h0 extends C12172h {
        public C25649h0() {
            super(JsApiChooseImage.NAME, JsApiChooseImage.NAME, 104, true);
        }
    }

    /* renamed from: qe3.c$h1 */
    public static class C25650h1 extends C12172h {
        public C25650h1() {
            super("downloadImage", "downloadImage", 106, true);
        }
    }

    /* renamed from: qe3.c$h2 */
    public static class C25651h2 extends C12172h {
        public C25651h2() {
            super("getBrandWCPayBindCardRequest", "get_brand_WCPay_bind_card_request", 58, true);
        }
    }

    /* renamed from: qe3.c$h3 */
    public static class C25652h3 extends C12172h {
        public C25652h3() {
            super("getLatestAddress", "get_recently_used_address", 46, true);
        }
    }

    /* renamed from: qe3.c$h4 */
    public static final class C25653h4 extends C12172h {
        public C25653h4() {
            super("handleMPPageAction", "handleMPPageAction", 345, true);
        }
    }

    /* renamed from: qe3.c$h5 */
    public static final class C25654h5 extends C12172h {
        public C25654h5() {
            super(C82801g.NAME, C82801g.NAME, C1650c.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$h6 */
    public static class C25655h6 extends C12172h {
        public C25655h6() {
            super("openDesignerEmojiViewLocal", "openDesignerEmojiViewLocal", 20000, false);
        }
    }

    /* renamed from: qe3.c$h7 */
    public static final class C25656h7 extends C12172h {
        public C25656h7() {
            super("openSearchWebView", "openSearchWebView", 10000, true);
        }
    }

    /* renamed from: qe3.c$h8 */
    public static class C25657h8 extends C12172h {
        public C25657h8() {
            super("preloadSearchWeapp", "preloadSearchWeapp", 10000, false);
        }
    }

    /* renamed from: qe3.c$h9 */
    public static final class C25658h9 extends C12172h {
        public C25658h9() {
            super(C1835y.NAME, C1835y.NAME, v2helper.VOIP_ENC_HEIGHT_LV1, true);
        }
    }

    /* renamed from: qe3.c$ha */
    public static final class C25659ha extends C12172h {
        public C25659ha() {
            super("sendSingleAppMessage", "sendSingleAppMessage", C91797a.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$hb */
    public static class C25660hb extends C12172h {
        public C25660hb() {
            super("showAllNonBaseMenuItem", "showAllNonBaseMenuItem", 92, false);
        }
    }

    /* renamed from: qe3.c$hc */
    public static class C25661hc extends C12172h {
        public C25661hc() {
            super(C86964n1.NAME, C86964n1.NAME, 200, false);
        }
    }

    /* renamed from: qe3.c$he */
    public static class C25662he extends C12172h {
        public C25662he() {
            super("menu:share:appmessage", "", 89, false);
        }
    }

    /* renamed from: qe3.c$i */
    public static class C25663i extends C12172h {
        public C25663i() {
            super("addContact", "add_contact", 5, true);
        }
    }

    /* renamed from: qe3.c$i0 */
    public static class C25664i0 extends C12172h {
        public C25664i0() {
            super(C1694g2.NAME, C1694g2.NAME, 202, true);
        }
    }

    /* renamed from: qe3.c$i1 */
    public static class C25665i1 extends C12172h {
        public C25665i1() {
            super("downloadVoice", "downloadVoice", 103, true);
        }
    }

    /* renamed from: qe3.c$i2 */
    public static class C25666i2 extends C12172h {
        public C25666i2() {
            super("getBrandWCPayRequest", "get_brand_wcpay_request", 28, true);
        }
    }

    /* renamed from: qe3.c$i3 */
    public static final class C25667i3 extends C12172h {
        public C25667i3() {
            super("doGoToRecVideoList", "doGoToRecVideoList", 10000, false);
        }
    }

    /* renamed from: qe3.c$i4 */
    public static final class C25668i4 extends C12172h {
        public C25668i4() {
            super("handleVideoAction", "handleVideoAction", 371, false);
        }
    }

    /* renamed from: qe3.c$i5 */
    public static class C25669i5 extends C12172h {
        public C25669i5() {
            super("getWebPayCheckoutCounterRequst", "getWebPayCheckoutCounterRequst", 161, true);
        }
    }

    /* renamed from: qe3.c$i6 */
    public static class C25670i6 extends C12172h {
        public C25670i6() {
            super("openDesignerProfile", "openDesignerProfile", 193, true);
        }
    }

    /* renamed from: qe3.c$i7 */
    public static class C25671i7 extends C12172h {
        public C25671i7() {
            super("openSecurityView", "openSecurityView", 229, false);
        }
    }

    /* renamed from: qe3.c$i8 */
    public static final class C25672i8 extends C12172h {
        public C25672i8() {
            super("previewVideo", "previewVideo", 252, true);
        }
    }

    /* renamed from: qe3.c$i9 */
    public static class C25673i9 extends C12172h {
        public C25673i9() {
            super("requestHKCashier", "", 471, false);
        }
    }

    /* renamed from: qe3.c$ia */
    public static final class C25674ia extends C12172h {
        public C25674ia() {
            super("serviceClick", "serviceClick", 304, false);
        }
    }

    /* renamed from: qe3.c$ib */
    public static class C25675ib extends C12172h {
        public C25675ib() {
            super("showBottomToast", "showBottomToast", C1640c.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$ic */
    public static class C25676ic extends C12172h {
        public C25676ic() {
            super(JsApiStopRecordVoice.NAME, JsApiStopRecordVoice.NAME, 98, false);
        }
    }

    /* renamed from: qe3.c$id */
    public static final class C25677id extends C12172h {
        public C25677id() {
            super("wcPrivacyPolicyResult", "wcPrivacyPolicyResult", C91810e.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$ie */
    public static class C25678ie extends C12172h {
        public C25678ie() {
            super("menu:share:qq", "", 94, false);
        }
    }

    /* renamed from: qe3.c$j */
    public static class C25679j extends C12172h {
        public C25679j() {
            super("addCustomMenuItems", "addCustomMenuItems", 164, false);
        }
    }

    /* renamed from: qe3.c$j0 */
    public static class C25680j0 extends C12172h {
        public C25680j0() {
            super(C1701i2.NAME, C1701i2.NAME, 288, true);
        }
    }

    /* renamed from: qe3.c$j4 */
    public static final class C25681j4 extends C12172h {
        public C25681j4() {
            super("handleWCPayWalletBuffer", "handleWCPayWalletBuffer", 294, false);
        }
    }

    /* renamed from: qe3.c$j5 */
    public static class C25682j5 extends C12172h {
        public C25682j5() {
            super("log", "", 0, false);
        }
    }

    /* renamed from: qe3.c$j6 */
    public static class C25683j6 extends C12172h {
        public C25683j6() {
            super("openDesignerProfileLocal", "openDesignerProfileLocal", 20000, false);
        }
    }

    /* renamed from: qe3.c$j7 */
    public static final class C25684j7 extends C12172h {
        public C25684j7() {
            super(C1818p.NAME, C1818p.NAME, 359, true);
        }
    }

    /* renamed from: qe3.c$j8 */
    public static class C25685j8 extends C12172h {
        public C25685j8() {
            super("preVerifyJSAPI", "pre_verify_jsapi", -3, false);
        }
    }

    /* renamed from: qe3.c$j9 */
    public static final class C25686j9 extends C12172h {
        public C25686j9() {
            super(C82876d0.NAME, C82876d0.NAME, C82852c.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$ja */
    public static final class C25687ja extends C12172h {
        public C25687ja() {
            super("setWCPayPassword", "setWCPayPassword", 289, true);
        }
    }

    /* renamed from: qe3.c$jb */
    public static class C25688jb extends C12172h {
        public C25688jb() {
            super(C17928i.NAME, C17928i.NAME, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, true);
        }
    }

    /* renamed from: qe3.c$jc */
    public static class C25689jc extends C12172h {
        public C25689jc() {
            super("stopScanWXDevice", "stopScanWXDevice", 122, true);
        }
    }

    /* renamed from: qe3.c$jd */
    public static class C25690jd extends C12172h {
        public C25690jd() {
            super(XWalkPlugin.PRIVATE_CACHE_DIR_NAME, XWalkPlugin.PRIVATE_CACHE_DIR_NAME, 150, false);
        }
    }

    /* renamed from: qe3.c$je */
    public static class C25691je extends C12172h {
        public C25691je() {
            super("menu:share:QZone", "", 134, false);
        }
    }

    /* renamed from: qe3.c$k0 */
    public static final class C25692k0 extends C12172h {
        public C25692k0() {
            super(JsApiChooseMedia.NAME, JsApiChooseMedia.NAME, 254, true);
        }
    }

    /* renamed from: qe3.c$k1 */
    public static class C25693k1 extends C12172h {
        public C25693k1() {
            super("doExposePreparation", "doExposePreparation", 225, false);
        }
    }

    /* renamed from: qe3.c$k2 */
    public static class C25694k2 extends C12172h {
        public C25694k2() {
            super("getCurrentLocation", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$k3 */
    public static class C25695k3 extends C12172h {
        public C25695k3() {
            super("getRouteUrl", "getRouteUrl", 235, false);
        }
    }

    /* renamed from: qe3.c$k4 */
    public static class C25696k4 extends C12172h {
        public C25696k4() {
            super("hideAllNonBaseMenuItem", "hideAllNonBaseMenuItem", 93, false);
        }
    }

    /* renamed from: qe3.c$k5 */
    public static final class C25697k5 extends C12172h {
        public C25697k5() {
            super("login", "login", 231, true);
        }
    }

    /* renamed from: qe3.c$k6 */
    public static final class C25698k6 extends C12172h {
        public C25698k6() {
            super("openECard", "openECard", 268, true);
        }
    }

    /* renamed from: qe3.c$k7 */
    public static class C25699k7 extends C12172h {
        public C25699k7() {
            super("openSpecificView", "specific_view", 48, true);
        }
    }

    /* renamed from: qe3.c$k9 */
    public static final class C25700k9 extends C12172h {
        public C25700k9() {
            super("requestOverlayPermission", "requestOverlayPermission", C82102w.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$ka */
    public static final class C25701ka extends C12172h {
        public C25701ka() {
            super(JsApiSetBackgroundAudioState.NAME, JsApiSetBackgroundAudioState.NAME, 262, false);
        }
    }

    /* renamed from: qe3.c$kb */
    public static class C25702kb extends C12172h {
        public C25702kb() {
            super("showKeyboard", "showKeyboard", WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_FAILED, false);
        }
    }

    /* renamed from: qe3.c$kc */
    public static class C25703kc extends C12172h {
        public C25703kc() {
            super(JsApiStopPlayVoice.NAME, JsApiStopPlayVoice.NAME, 101, false);
        }
    }

    /* renamed from: qe3.c$kd */
    public static class C25704kd extends C12172h {
        public C25704kd() {
            super("videoProxyInit", "videoProxyInit", 156, false);
        }
    }

    /* renamed from: qe3.c$ke */
    public static class C25705ke extends C12172h {
        public C25705ke() {
            super("menu:share:timeline", "", 88, false);
        }
    }

    /* renamed from: qe3.c$l */
    public static class C25706l extends C12172h {
        public C25706l() {
            super(JsApiAddDownloadTask.NAME, "add_download_task", 38, false);
        }
    }

    /* renamed from: qe3.c$l0 */
    public static class C25707l0 extends C12172h {
        public C25707l0() {
            super("chooseVideo", "chooseVideo", 191, true);
        }
    }

    /* renamed from: qe3.c$l2 */
    public static class C25708l2 extends C12172h {
        public C25708l2() {
            super("getCurrentSSID", "getCurrentSSID", WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED, true);
        }
    }

    /* renamed from: qe3.c$l3 */
    public static class C25709l3 extends C12172h {
        public C25709l3() {
            super("getSearchAvatarList", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$l4 */
    public static class C25710l4 extends C12172h {
        public C25710l4() {
            super("hideMenuItems", "hideMenuItems", 85, false);
        }
    }

    /* renamed from: qe3.c$l5 */
    public static final class C25711l5 extends C12172h {
        public C25711l5() {
            super(C1851s3.NAME, C1851s3.NAME, 356, true);
        }
    }

    /* renamed from: qe3.c$l6 */
    public static class C25712l6 extends C12172h {
        public C25712l6() {
            super("openEmoticonTopicList", "openEmoticonTopicList", 212, true);
        }
    }

    /* renamed from: qe3.c$l7 */
    public static class C25713l7 extends C12172h {
        public C25713l7() {
            super("openUrlByExtBrowser", "open_url_by_ext_browser", 55, false);
        }
    }

    /* renamed from: qe3.c$l9 */
    public static final class C25714l9 extends C12172h {
        public C25714l9() {
            super(C1759n3.NAME, C1759n3.NAME, ADXml.AD_TURN_CARD_ANIMATION_TIME, false);
        }
    }

    /* renamed from: qe3.c$la */
    public static final class C25715la extends C12172h {
        public C25715la() {
            super("setBackgroundAudioStateMV", "setBackgroundAudioStateMV", 451, false);
        }
    }

    /* renamed from: qe3.c$lb */
    public static class C25716lb extends C12172h {
        public C25716lb() {
            super("showMenuItems", "showMenuItems", 86, false);
        }
    }

    /* renamed from: qe3.c$lc */
    public static class C25717lc extends C12172h {
        public C25717lc() {
            super("streamingVideoPlay", "playStreamingVideo", 209, false);
        }
    }

    /* renamed from: qe3.c$ld */
    public static class C25718ld extends C12172h {
        public C25718ld() {
            super("videoProxySetPlayerState", "videoProxySetPlayerState", 159, false);
        }
    }

    /* renamed from: qe3.c$le */
    public static class C25719le extends C12172h {
        public C25719le() {
            super("menu:share:weiboApp", "", 109, false);
        }
    }

    /* renamed from: qe3.c$m */
    public static class C25720m extends C12172h {
        public C25720m() {
            super(JsApiAddDownloadTaskStraight.NAME, "add_download_task_straight", 269, true);
        }
    }

    /* renamed from: qe3.c$m0 */
    public static class C25721m0 extends C12172h {
        public C25721m0() {
            super("clearBounceBackground", "clearBounceBackground", WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD, false);
        }
    }

    /* renamed from: qe3.c$m1 */
    public static class C25722m1 extends C12172h {
        public C25722m1() {
            super("editAddress", "edit_address", 29, true);
        }
    }

    /* renamed from: qe3.c$m2 */
    public static final class C25723m2 extends C12172h {
        public C25723m2() {
            super("getGameData", "getGameData", 299, false);
        }
    }

    /* renamed from: qe3.c$m3 */
    public static class C25724m3 extends C12172h {
        public C25724m3() {
            super("getSearchData", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$m4 */
    public static class C25725m4 extends C12172h {
        public C25725m4() {
            super(C86945i.NAME, C86945i.NAME, 198, false);
        }
    }

    /* renamed from: qe3.c$m6 */
    public static class C25726m6 extends C12172h {
        public C25726m6() {
            super("openEnterpriseChat", "openEnterpriseChat", 165, false);
        }
    }

    /* renamed from: qe3.c$m7 */
    public static class C25727m7 extends C12172h {
        public C25727m7() {
            super("openUrlWithExtraWebview", "openUrlWithExtraWebview", C88191m.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$m8 */
    public static class C25728m8 extends C12172h {
        public C25728m8() {
            super(Scopes.PROFILE, Scopes.PROFILE, 2, false);
        }
    }

    /* renamed from: qe3.c$m9 */
    public static final class C25729m9 extends C12172h {
        public C25729m9() {
            super("requestWxFaceRegisterInternal", "requestWxFaceRegisterInternal", 272, true);
        }
    }

    /* renamed from: qe3.c$ma */
    public static class C25730ma extends C12172h {
        public C25730ma() {
            super("setBounceBackground", "setBounceBackground", 218, false);
        }
    }

    /* renamed from: qe3.c$mb */
    public static class C25731mb extends C12172h {
        public C25731mb() {
            super(C86950j1.NAME, C86950j1.NAME, WXWebReporter.WXWEB_IDKEY_LOCAL_TO_OVERSEA, false);
        }
    }

    /* renamed from: qe3.c$mc */
    public static class C25732mc extends C12172h {
        public C25732mc() {
            super("selectWalletCurrency", "selectWalletCurrency", 201, true);
        }
    }

    /* renamed from: qe3.c$md */
    public static class C25733md extends C12172h {
        public C25733md() {
            super("videoProxySetPlayerState", "videoProxySetPlayerState", 160, false);
        }
    }

    /* renamed from: qe3.c$n */
    public static final class C25734n extends C12172h {
        public C25734n() {
            super("addGameDownloadTask", "addGameDownloadTask", -1, true);
        }
    }

    /* renamed from: qe3.c$n0 */
    public static final class C25735n0 extends C12172h {
        public C25735n0() {
            super("clearGameData", "clearGameData", 300, false);
        }
    }

    /* renamed from: qe3.c$n1 */
    public static class C25736n1 extends C12172h {
        public C25736n1() {
            super("openEmotionUrl", "openEmotionUrl", 20000, false);
        }
    }

    /* renamed from: qe3.c$n2 */
    public static class C25737n2 extends C12172h {
        public C25737n2() {
            super("mmsf0001", "mmsf0001", -2, false);
        }
    }

    /* renamed from: qe3.c$n3 */
    public static class C25738n3 extends C12172h {
        public C25738n3() {
            super("getSearchDisplayNameList", "getSearchDisplayNameList", 10000, false);
        }
    }

    /* renamed from: qe3.c$n4 */
    public static class C25739n4 extends C12172h {
        public C25739n4() {
            super("hideNavBarShadow", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$n5 */
    public static class C25740n5 extends C12172h {
        public C25740n5() {
            super(C48418i.NAME, "", TPNativePlayerInitConfig.QUEUE_STRING_HLS_DECRYPTION_PEM, false);
        }
    }

    /* renamed from: qe3.c$n6 */
    public static class C25741n6 extends C12172h {
        public C25741n6() {
            super("openEnterpriseContact", "openEnterpriseContact", WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED, true);
        }
    }

    /* renamed from: qe3.c$n7 */
    public static class C25742n7 extends C12172h {
        public C25742n7() {
            super("openWCPaySpecificView", "open_wcpay_specific_view", 76, true);
        }
    }

    /* renamed from: qe3.c$n8 */
    public static final class C25743n8 extends C12172h {
        public C25743n8() {
            super("publishHaowanEdition", "publishHaowanEdition", 351, false);
        }
    }

    /* renamed from: qe3.c$n9 */
    public static final class C25744n9 extends C12172h {
        public C25744n9() {
            super("requestWxFaceVerifyInternal", "requestWxFaceVerifyInternal", C90830d.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$na */
    public static class C25745na extends C12172h {
        public C25745na() {
            super("setCloseWindowConfirmDialogInfo", "setCloseWindowConfirmDialogInfo", 77, false);
        }
    }

    /* renamed from: qe3.c$nb */
    public static class C25746nb extends C12172h {
        public C25746nb() {
            super("showNavBarShadow", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$nc */
    public static final class C25747nc extends C12172h {
        public C25747nc() {
            super("tapSearchWAWidgetView", "tapSearchWAWidgetView", 10000, false);
        }
    }

    /* renamed from: qe3.c$nd */
    public static class C25748nd extends C12172h {
        public C25748nd() {
            super("videoProxyStartPlay", "videoProxyStartPlay", 157, false);
        }
    }

    /* renamed from: qe3.c$ne */
    public static class C25749ne extends C12172h {
        public C25749ne() {
            super("uploadIdCardSuccess", "uploadIdCardSuccess", 233, false);
        }
    }

    /* renamed from: qe3.c$o */
    public static final class C25750o extends C12172h {
        public C25750o() {
            super("addToEmoticon", "addToEmoticon", 274, true);
        }
    }

    /* renamed from: qe3.c$o0 */
    public static class C25751o0 extends C12172h {
        public C25751o0() {
            super("clearLocalData", "clearLocalData", WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD, false);
        }
    }

    /* renamed from: qe3.c$o1 */
    public static class C25752o1 extends C12172h {
        public C25752o1() {
            super("enableFullScreen", "enableFullScreen", 196, false);
        }
    }

    /* renamed from: qe3.c$o2 */
    public static final class C25753o2 extends C12172h {
        public C25753o2() {
            super("getDownloadWidgetTaskInfos", "getDownloadWidgetTaskInfos", 340, false);
        }
    }

    /* renamed from: qe3.c$o3 */
    public static class C25754o3 extends C12172h {
        public C25754o3() {
            super("getSearchEmotionData", "getSearchEmotionData", 20000, false);
        }
    }

    /* renamed from: qe3.c$o4 */
    public static class C25755o4 extends C12172h {
        public C25755o4() {
            super("hideOptionMenu", "", 14, false);
        }
    }

    /* renamed from: qe3.c$o6 */
    public static class C25756o6 extends C12172h {
        public C25756o6() {
            super("openFinderFeed", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$o8 */
    public static final class C25757o8 extends C12172h {
        public C25757o8() {
            super("qqMailLoginResult", "qqMailLoginResult", 357, false);
        }
    }

    /* renamed from: qe3.c$o9 */
    public static final class C25758o9 extends C12172h {
        public C25758o9() {
            super("requestWxVoicePrintVerifyInternal", "requestWxVoicePrintVerifyInternal", JsApiSetAudioState.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$oa */
    public static final class C25759oa extends C12172h {
        public C25759oa() {
            super("setGameData", "setGameData", C83118q.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$ob */
    public static class C25760ob extends C12172h {
        public C25760ob() {
            super("showOptionMenu", "", 14, false);
        }
    }

    /* renamed from: qe3.c$oc */
    public static class C25761oc extends C12172h {
        public C25761oc() {
            super(C82980n.NAME, "share_timeline", 4, true);
        }
    }

    /* renamed from: qe3.c$od */
    public static class C25762od extends C12172h {
        public C25762od() {
            super("videoProxyStopPlay", "videoProxyStopPlay", 158, false);
        }
    }

    /* renamed from: qe3.c$p */
    public static class C25763p extends C12172h {
        public C25763p() {
            super(C1762o0.NAME, "ad_data_report", 221, false);
        }
    }

    /* renamed from: qe3.c$p0 */
    public static class C25764p0 extends C12172h {
        public C25764p0() {
            super("clearWebviewCache", "clearWebviewCache", 208, false);
        }
    }

    /* renamed from: qe3.c$p1 */
    public static class C25765p1 extends C12172h {
        public C25765p1() {
            super("enablePullDownRefresh", "enablePullDownRefresh", WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE, false);
        }
    }

    /* renamed from: qe3.c$p2 */
    public static class C25766p2 extends C12172h {
        public C25766p2() {
            super("getEnterpriseChat", "getEnterpriseChat", 244, false);
        }
    }

    /* renamed from: qe3.c$p4 */
    public static class C25767p4 extends C12172h {
        public C25767p4() {
            super("hideSearchLoading", "hideSearchLoading", 10000, false);
        }
    }

    /* renamed from: qe3.c$p5 */
    public static class C25768p5 extends C12172h {
        public C25768p5() {
            super("timelineCheckIn", "timeline_check_in", 64, false);
        }
    }

    /* renamed from: qe3.c$p6 */
    public static class C25769p6 extends C12172h {
        public C25769p6() {
            super(C55511i.NAME, "", 10000, false);
        }
    }

    /* renamed from: qe3.c$p7 */
    public static final class C25770p7 extends C12172h {
        public C25770p7() {
            super("openWeApp", "openWeApp", 250, false);
        }
    }

    /* renamed from: qe3.c$p8 */
    public static class C25771p8 extends C12172h {
        public C25771p8() {
            super(JsApiQueryDownloadTask.NAME, "query_download_task", 40, false);
        }
    }

    /* renamed from: qe3.c$p9 */
    public static class C25772p9 extends C12172h {
        public C25772p9() {
            super("resendRemittanceMsg", "resendRemittanceMsg", WXWebReporter.KEY_NEW_FAILED_CANT_FIX, true);
        }
    }

    /* renamed from: qe3.c$pb */
    public static class C25773pb extends C12172h {
        public C25773pb() {
            super("showSearchActionSheet", "showSearchActionSheet", 10000, false);
        }
    }

    /* renamed from: qe3.c$pc */
    public static class C25774pc extends C12172h {
        public C25774pc() {
            super("translateVoice", "translateVoice", 97, true);
        }
    }

    /* renamed from: qe3.c$pd */
    public static class C25775pd extends C12172h {
        public C25775pd() {
            super("publicCache", "publicCache", 149, false);
        }
    }

    /* renamed from: qe3.c$q1 */
    public static class C25776q1 extends C12172h {
        public C25776q1() {
            super("enterEnterpriseChat", "enterEnterpriseChat", WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB, false);
        }
    }

    /* renamed from: qe3.c$q4 */
    public static class C25777q4 extends C12172h {
        public C25777q4() {
            super("idCardRealnameVerify", "idCardRealnameVerify", 235, true);
        }
    }

    /* renamed from: qe3.c$q5 */
    public static class C25778q5 extends C12172h {
        public C25778q5() {
            super(C1715u.NAME, "open_location", 63, true);
        }
    }

    /* renamed from: qe3.c$q6 */
    public static class C25779q6 extends C12172h {
        public C25779q6() {
            super("openGameCenter", "openGameCenter", WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO, true);
        }
    }

    /* renamed from: qe3.c$q7 */
    public static class C25780q7 extends C12172h {
        public C25780q7() {
            super("openWeAppPage", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$q8 */
    public static final class C25781q8 extends C12172h {
        public C25781q8() {
            super("queryHaowanPublish", "queryHaowanPublish", JsApiNFCStartHCE.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$q9 */
    public static class C25782q9 extends C12172h {
        public C25782q9() {
            super(JsApiResumeDownloadTask.NAME, "resume_download_task", 240, true);
        }
    }

    /* renamed from: qe3.c$qa */
    public static class C25783qa extends C12172h {
        public C25783qa() {
            super("setGameDebugConfig", "setGameDebugConfig", 1111111, false);
        }
    }

    /* renamed from: qe3.c$qb */
    public static class C25784qb extends C12172h {
        public C25784qb() {
            super("showSearchLoading", "showSearchLoading", 10000, false);
        }
    }

    /* renamed from: qe3.c$qc */
    public static class C25785qc extends C12172h {
        public C25785qc() {
            super("unbindBankCard", "unbindBankCard", 216, true);
        }
    }

    /* renamed from: qe3.c$qd */
    public static class C25786qd extends C12172h {
        public C25786qd() {
            super("videoProxyPreload", "videoProxyPreload", 172, false);
        }
    }

    /* renamed from: qe3.c$r */
    public static final class C25787r extends C12172h {
        public C25787r() {
            super(C1840q1.NAME, C1840q1.NAME, 377, false);
        }
    }

    /* renamed from: qe3.c$r0 */
    public static class C25788r0 extends C12172h {
        public C25788r0() {
            super("closeWindow", "close_window", 17, false);
        }
    }

    /* renamed from: qe3.c$r1 */
    public static final class C25789r1 extends C12172h {
        public C25789r1() {
            super(C55529k.NAME, C55529k.NAME, C86940g0.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$r2 */
    public static class C25790r2 extends C12172h {
        public C25790r2() {
            super("getFinderLivePreviewUrl", "onGetFinderLivePreviewUrl", 406, true);
        }
    }

    /* renamed from: qe3.c$r3 */
    public static class C25791r3 extends C12172h {
        public C25791r3() {
            super("getSearchImageList", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$r4 */
    public static class C25792r4 extends C12172h {
        public C25792r4() {
            super("imagePreview", "", 1, true);
        }
    }

    /* renamed from: qe3.c$r5 */
    public static class C25793r5 extends C12172h {
        public C25793r5() {
            super("openTimelineCheckInList", "open_timeline_checkin_list", 62, false);
        }
    }

    /* renamed from: qe3.c$r6 */
    public static class C25794r6 extends C12172h {
        public C25794r6() {
            super("openGameDetail", "openGameDetail", 131, true);
        }
    }

    /* renamed from: qe3.c$r7 */
    public static class C25795r7 extends C12172h {
        public C25795r7() {
            super("getBrandWCPayCreateCreditCardRequest", "get_wcpay_create_credit_card_request", 65, true);
        }
    }

    /* renamed from: qe3.c$r9 */
    public static class C25796r9 extends C12172h {
        public C25796r9() {
            super("scanLicence", "scanLicence", 203, false);
        }
    }

    /* renamed from: qe3.c$rb */
    public static final class C25797rb extends C12172h {
        public C25797rb() {
            super("showSearchOfBizHistory", "showSearchOfBizHistory", 266, false);
        }
    }

    /* renamed from: qe3.c$rc */
    public static final class C25798rc extends C12172h {
        public C25798rc() {
            super("updatePageAuth", "updatePageAuth", -2, false);
        }
    }

    /* renamed from: qe3.c$rd */
    public static class C25799rd extends C12172h {
        public C25799rd() {
            super("shareWeibo", "share_weibo", 3, true);
        }
    }

    /* renamed from: qe3.c$s */
    public static final class C25800s extends C12172h {
        public C25800s() {
            super("authorize", "authorize", 232, true);
        }
    }

    /* renamed from: qe3.c$s0 */
    public static final class C25801s0 extends C12172h {
        public C25801s0() {
            super("closeWindowAndGoNext", "closeWindowAndGoNext", C82088k.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$s1 */
    public static class C25802s1 extends C12172h {
        public C25802s1() {
            super("getEnterpriseChat", "", 10000, true);
        }
    }

    /* renamed from: qe3.c$s2 */
    public static class C25803s2 extends C12172h {
        public C25803s2() {
            super("getGameCommInfo", "getGameCommInfo", 241, false);
        }
    }

    /* renamed from: qe3.c$s4 */
    public static class C25804s4 extends C12172h {
        public C25804s4() {
            super("insertSearchWAWidgetView", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$s5 */
    public static class C25805s5 extends C12172h {
        public C25805s5() {
            super("nfcBatchTransceive", "nfcBatchTransceive", TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, false);
        }
    }

    /* renamed from: qe3.c$s6 */
    public static class C25806s6 extends C12172h {
        public C25806s6() {
            super("openGameRegion", "openGameRegion", 242, true);
        }
    }

    /* renamed from: qe3.c$s7 */
    public static class C25807s7 extends C12172h {
        public C25807s7() {
            super("openWXDeviceLib", "openWXDeviceLib", 117, false);
        }
    }

    /* renamed from: qe3.c$s8 */
    public static class C25808s8 extends C12172h {
        public C25808s8() {
            super("quicklyAddBrandContact", "quicklyAddBrandContact", 166, true);
        }
    }

    /* renamed from: qe3.c$s9 */
    public static class C25809s9 extends C12172h {
        public C25809s9() {
            super("scanQRCode", "scanQRCode", 7, true);
        }
    }

    /* renamed from: qe3.c$sa */
    public static class C25810sa extends C12172h {
        public C25810sa() {
            super("setLocalData", "setLocalData", 180, false);
        }
    }

    /* renamed from: qe3.c$sb */
    public static class C25811sb extends C12172h {
        public C25811sb() {
            super("showSearchToast", "showSearchToast", 10000, false);
        }
    }

    /* renamed from: qe3.c$sc */
    public static class C25812sc extends C12172h {
        public C25812sc() {
            super("updateReddotTimeStamps", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$t */
    public static class C25813t extends C12172h {
        public C25813t() {
            super("batchAddCard", "batch_add_card", 82, true);
        }
    }

    /* renamed from: qe3.c$t0 */
    public static class C25814t0 extends C12172h {
        public C25814t0() {
            super("closeWXDeviceLib", "closeWXDeviceLib", 118, false);
        }
    }

    /* renamed from: qe3.c$t1 */
    public static final class C25815t1 extends C12172h {
        public C25815t1() {
            super("requestWxFacePictureVerify", "requestWxFacePictureVerify", TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION, true);
        }
    }

    /* renamed from: qe3.c$t3 */
    public static class C25816t3 extends C12172h {
        public C25816t3() {
            super("getSearchSuggestionData", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$t5 */
    public static class C25817t5 extends C12172h {
        public C25817t5() {
            super("nfcCheckState", "nfcCheckState", 155, true);
        }
    }

    /* renamed from: qe3.c$t6 */
    public static final class C25818t6 extends C12172h {
        public C25818t6() {
            super("openGameUrlWithExtraWebView", "openGameUrlWithExtraWebView", C82090l.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$t7 */
    public static final class C25819t7 extends C12172h {
        public C25819t7() {
            super("openWXSearchPage", "openWXSearchPage", ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL, true);
        }
    }

    /* renamed from: qe3.c$t8 */
    public static class C25820t8 extends C12172h {
        public C25820t8() {
            super(C1824s.NAME, C1824s.NAME, JsApiAddDownloadTask.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$t9 */
    public static class C25821t9 extends C12172h {
        public C25821t9() {
            super("searchDataHasResult", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$ta */
    public static class C25822ta extends C12172h {
        public C25822ta() {
            super("setNavigationBarButtons", "setNavigationBarButtons", 195, false);
        }
    }

    /* renamed from: qe3.c$tb */
    public static class C25823tb extends C12172h {
        public C25823tb() {
            super("showSmileyPanel", "showSmileyPanel", WXWebReporter.WXXWEB_PRE_DOWN_ARM32_SUC, false);
        }
    }

    /* renamed from: qe3.c$tc */
    public static final class C25824tc extends C12172h {
        public C25824tc() {
            super("updateAppMessageShareData", "updateAppMessageShareData", 326, false);
        }
    }

    /* renamed from: qe3.c$td */
    public static class C25825td extends C12172h {
        public C25825td() {
            super("WNNativeAsyncCallback", "WNNativeAsyncCallback", 10006, false);
        }
    }

    /* renamed from: qe3.c$u0 */
    public static class C25826u0 extends C12172h {
        public C25826u0() {
            super("configWXDeviceWiFi", "configWXDeviceWiFi", 126, true);
        }
    }

    /* renamed from: qe3.c$u1 */
    public static final class C25827u1 extends C12172h {
        public C25827u1() {
            super("requestWxFacePictureVerifyUnionVideo", "requestWxFacePictureVerifyUnionVideo", CdnLogic.kGroupNoticeCDNAppType, true);
        }
    }

    /* renamed from: qe3.c$u2 */
    public static class C25828u2 extends C12172h {
        public C25828u2() {
            super("getHeadingAndPitch", "get_heading_and_pitch", 33, false);
        }
    }

    /* renamed from: qe3.c$u3 */
    public static class C25829u3 extends C12172h {
        public C25829u3() {
            super("getSendC2CMessageRequest", "get_send_c2c_message_request", 83, true);
        }
    }

    /* renamed from: qe3.c$u4 */
    public static class C25830u4 extends C12172h {
        public C25830u4() {
            super(JsApiInstallDownloadTask.NAME, "install_download_task", 41, false);
        }
    }

    /* renamed from: qe3.c$u5 */
    public static class C25831u5 extends C12172h {
        public C25831u5() {
            super("nfcConnect", "nfcConnect", 140, false);
        }
    }

    /* renamed from: qe3.c$u6 */
    public static final class C25832u6 extends C12172h {
        public C25832u6() {
            super("openGameWebView", "openGameWebView", 287, false);
        }
    }

    /* renamed from: qe3.c$u7 */
    public static final class C25833u7 extends C12172h {
        public C25833u7() {
            super(JsApiOperateBackgroundAudio.NAME, JsApiOperateBackgroundAudio.NAME, 261, false);
        }
    }

    /* renamed from: qe3.c$u8 */
    public static class C25834u8 extends C12172h {
        public C25834u8() {
            super("realtimeReport", "realtimeReport", 171, false);
        }
    }

    /* renamed from: qe3.c$ua */
    public static class C25835ua extends C12172h {
        public C25835ua() {
            super(C8134n0.NAME, C8134n0.NAME, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS, false);
        }
    }

    /* renamed from: qe3.c$ub */
    public static final class C25836ub extends C12172h {
        public C25836ub() {
            super(C55531o.NAME, C55531o.NAME, 437, true);
        }
    }

    /* renamed from: qe3.c$uc */
    public static class C25837uc extends C12172h {
        public C25837uc() {
            super("updateSearchWAWidgetView", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$ud */
    public static class C25838ud extends C12172h {
        public C25838ud() {
            super("WNNativeCallbackInitData", "WNNativeCallbackInitData", 10006, false);
        }
    }

    /* renamed from: qe3.c$v */
    public static final class C25839v extends C12172h {
        public C25839v() {
            super("batchUpdateWepkg", "batchUpdateWepkg", 334, false);
        }
    }

    /* renamed from: qe3.c$v1 */
    public static final class C25840v1 extends C12172h {
        public C25840v1() {
            super(C1643f.NAME, C1643f.NAME, 328, true);
        }
    }

    /* renamed from: qe3.c$v2 */
    public static class C25841v2 extends C12172h {
        public C25841v2() {
            super("getH5PrepayRequest", "getH5PrepayRequest", 137, true);
        }
    }

    /* renamed from: qe3.c$v3 */
    public static final class C25842v3 extends C12172h {
        public C25842v3() {
            super("getSystemInfo", "getSystemInfo", 311, false);
        }
    }

    /* renamed from: qe3.c$v4 */
    public static final class C25843v4 extends C12172h {
        public C25843v4() {
            super("internelWxFaceVerify", "internelWxFaceVerify", 325, true);
        }
    }

    /* renamed from: qe3.c$v5 */
    public static class C25844v5 extends C12172h {
        public C25844v5() {
            super("nfcGetId", "nfcGetId", TPOptionalID.f349338xc9bdf6cd, false);
        }
    }

    /* renamed from: qe3.c$v6 */
    public static final class C25845v6 extends C12172h {
        public C25845v6() {
            super("openHKOfflinePayView", "openHKOfflinePayView", 446, false);
        }
    }

    /* renamed from: qe3.c$v7 */
    public static class C25846v7 extends C12172h {
        public C25846v7() {
            super("operateGameCenterMsg", "operateGameCenterMsg", WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE, false);
        }
    }

    /* renamed from: qe3.c$v8 */
    public static final class C25847v8 extends C12172h {
        public C25847v8() {
            super("recordVideo", "recordVideo", 251, true);
        }
    }

    /* renamed from: qe3.c$v9 */
    public static final class C25848v9 extends C12172h {
        public C25848v9() {
            super("selectContact", "selectContact", 10000, true);
        }
    }

    /* renamed from: qe3.c$va */
    public static class C25849va extends C12172h {
        public C25849va() {
            super("setPageOwner", "setPageOwner", 114, false);
        }
    }

    /* renamed from: qe3.c$vc */
    public static final class C25850vc extends C12172h {
        public C25850vc() {
            super("updateTimelineShareData", "updateTimelineShareData", 327, false);
        }
    }

    /* renamed from: qe3.c$vd */
    public static class C25851vd extends C12172h {
        public C25851vd() {
            super("WNNativeCallbackOnCaretChange", "WNNativeCallbackOnCaretChange", 10006, false);
        }
    }

    /* renamed from: qe3.c$w */
    public static class C25852w extends C12172h {
        public C25852w() {
            super("batchViewCard", "batchViewCard", 111, true);
        }
    }

    /* renamed from: qe3.c$w0 */
    public static class C25853w0 extends C12172h {
        public C25853w0() {
            super("connectWXDevice", "connectWXDevice", 123, true);
        }
    }

    /* renamed from: qe3.c$w1 */
    public static final class C25854w1 extends C12172h {
        public C25854w1() {
            super("fastBindCardGetResult", "fastBindCardGetResult", 402, false);
        }
    }

    /* renamed from: qe3.c$w2 */
    public static class C25855w2 extends C12172h {
        public C25855w2() {
            super("getH5TransactionRequest", "getH5TransactionRequest", 138, true);
        }
    }

    /* renamed from: qe3.c$w3 */
    public static class C25856w3 extends C12172h {
        public C25856w3() {
            super("getTeachSearchData", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$w4 */
    public static final class C25857w4 extends C12172h {
        public C25857w4() {
            super(C91518c.NAME, C91518c.NAME, JsApiOperateRecorder.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$w5 */
    public static class C25858w5 extends C12172h {
        public C25858w5() {
            super("nfcGetInfo", "nfcGetInfo", 148, false);
        }
    }

    /* renamed from: qe3.c$w6 */
    public static class C25859w6 extends C12172h {
        public C25859w6() {
            super("openLuckyMoneyDetailView", "openLuckyMoneyDetailView", WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES, false);
        }
    }

    /* renamed from: qe3.c$w9 */
    public static class C25860w9 extends C12172h {
        public C25860w9() {
            super("selectEnterpriseContact", "selectEnterpriseContact", C1701i2.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$wa */
    public static class C25861wa extends C12172h {
        public C25861wa() {
            super("setPageTitle", "setPageTitle", 113, false);
        }
    }

    /* renamed from: qe3.c$wb */
    public static class C25862wb extends C12172h {
        public C25862wb() {
            super("requireSoterBiometricAuthentication", "soter_biometric_authentication", JsApiCheckIsSupportFaceDetect.CTRL_INDEX, true);
        }
    }

    /* renamed from: qe3.c$wd */
    public static class C25863wd extends C12172h {
        public C25863wd() {
            super("WNNativeCallbackOnClick", "WNNativeCallbackOnClick", 10006, false);
        }
    }

    /* renamed from: qe3.c$x */
    public static final class C25864x extends C12172h {
        public C25864x() {
            super("bindEmail", "bindEmail", ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET, true);
        }
    }

    /* renamed from: qe3.c$x0 */
    public static class C25865x0 extends C12172h {
        public C25865x0() {
            super("consumedShareCard", "consumedShareCard", WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL, true);
        }
    }

    /* renamed from: qe3.c$x1 */
    public static final class C25866x1 extends C12172h {
        public C25866x1() {
            super("forceUpdateWxaAttr", "forceUpdateWxaAttr", 257, false);
        }
    }

    /* renamed from: qe3.c$x2 */
    public static class C25867x2 extends C12172h {
        public C25867x2() {
            super(JsApiGetInstallState.NAME, "get_install_state", 25, false);
        }
    }

    /* renamed from: qe3.c$x3 */
    public static class C25868x3 extends C12172h {
        public C25868x3() {
            super("getTransferMoneyRequest", "get_transfer_money_request", 74, true);
        }
    }

    /* renamed from: qe3.c$x4 */
    public static final class C25869x4 extends C12172h {
        public C25869x4() {
            super("jumpDownloaderWidget", "jumpDownloaderWidget", 339, true);
        }
    }

    /* renamed from: qe3.c$x5 */
    public static class C25870x5 extends C12172h {
        public C25870x5() {
            super("nfcIsConnect", "nfcIsConnect", 139, true);
        }
    }

    /* renamed from: qe3.c$x6 */
    public static final class C25871x6 extends C12172h {
        public C25871x6() {
            super("openLuckyMoneyHistory", "openLuckyMoneyHistory", 258, true);
        }
    }

    /* renamed from: qe3.c$x8 */
    public static class C25872x8 extends C12172h {
        public C25872x8() {
            super("removeSearchWAWidgetView", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$x9 */
    public static class C25873x9 extends C12172h {
        public C25873x9() {
            super("selectPedometerSource", "selectPedometerSource", 146, true);
        }
    }

    /* renamed from: qe3.c$xa */
    public static final class C25874xa extends C12172h {
        public C25874xa() {
            super("setScreenOrientation", "setScreenOrientation", 270, false);
        }
    }

    /* renamed from: qe3.c$xb */
    public static class C25875xb extends C12172h {
        public C25875xb() {
            super("getSupportSoter", "getSupportSoter", 213, false);
        }
    }

    /* renamed from: qe3.c$xc */
    public static class C25876xc extends C12172h {
        public C25876xc() {
            super("updateWASearchTemplate", "updateWASearchTemplate", 10000, false);
        }
    }

    /* renamed from: qe3.c$xd */
    public static class C25877xd extends C12172h {
        public C25877xd() {
            super("WNNativeCallbackOnLongClick", "WNNativeCallbackOnLongClick", 10006, false);
        }
    }

    /* renamed from: qe3.c$y */
    public static class C25878y extends C12172h {
        public C25878y() {
            super(JsApiCancelDownloadTask.NAME, "cancel_download_task", 39, false);
        }
    }

    /* renamed from: qe3.c$y0 */
    public static final class C25879y0 extends C12172h {
        public C25879y0() {
            super(C83067i.NAME, C83067i.NAME, 409, true);
        }
    }

    /* renamed from: qe3.c$y2 */
    public static class C25880y2 extends C12172h {
        public C25880y2() {
            super("getLocalData", "getLocalData", WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED, false);
        }
    }

    /* renamed from: qe3.c$y3 */
    public static class C25881y3 extends C12172h {
        public C25881y3() {
            super("getWCPayRealnameVerify", "getWCPayRealnameVerify", 194, true);
        }
    }

    /* renamed from: qe3.c$y5 */
    public static class C25882y5 extends C12172h {
        public C25882y5() {
            super("nfcTransceive", "nfcTransceive", 141, false);
        }
    }

    /* renamed from: qe3.c$y6 */
    public static class C25883y6 extends C12172h {
        public C25883y6() {
            super("openMapNavigateMenu", "openMapNavigateMenu", WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED, true);
        }
    }

    /* renamed from: qe3.c$y9 */
    public static class C25884y9 extends C12172h {
        public C25884y9() {
            super("selectSingleContact", "selectSingleContact", 167, true);
        }
    }

    /* renamed from: qe3.c$ya */
    public static class C25885ya extends C12172h {
        public C25885ya() {
            super("setSearchInputWord", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$yc */
    public static final class C25886yc extends C12172h {
        public C25886yc() {
            super("uploadEncryptMediaFile", "uploadEncryptMediaFile", 253, false);
        }
    }

    /* renamed from: qe3.c$yd */
    public static class C25887yd extends C12172h {
        public C25887yd() {
            super(JsApiWriteCommData.NAME, "write_comm_data", 53, false);
        }
    }

    /* renamed from: qe3.c$z */
    public static final class C25888z extends C12172h {
        public C25888z() {
            super("cancelHaowanPublish", "cancelHaowanPublish", C82860i.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$z0 */
    public static final class C25889z0 extends C12172h {
        public C25889z0() {
            super("currentMpInfo", "currentMpInfo", C40473o1.CTRL_INDEX, false);
        }
    }

    /* renamed from: qe3.c$z1 */
    public static final class C25890z1 extends C12172h {
        public C25890z1() {
            super(C82398i.NAME, C82398i.NAME, 338, true);
        }
    }

    /* renamed from: qe3.c$z2 */
    public static final class C25891z2 extends C12172h {
        public C25891z2() {
            super("getLocalWePkgInfo", "getLocalWePkgInfo", -2, false);
        }
    }

    /* renamed from: qe3.c$z3 */
    public static class C25892z3 extends C12172h {
        public C25892z3() {
            super("getWechatVerifyTicket", "getWechatVerifyTicket", 112, false);
        }
    }

    /* renamed from: qe3.c$z4 */
    public static class C25893z4 extends C12172h {
        public C25893z4() {
            super("jumpToBizProfile", "jump_to_biz_profile", 61, true);
        }
    }

    /* renamed from: qe3.c$z5 */
    public static final class C25894z5 extends C12172h {
        public C25894z5() {
            super("notifyPageInfo", "notifyPageInfo", -2, false);
        }
    }

    /* renamed from: qe3.c$z6 */
    public static class C25895z6 extends C12172h {
        public C25895z6() {
            super("openMusicPage", "", 10000, false);
        }
    }

    /* renamed from: qe3.c$z8 */
    public static class C25896z8 extends C12172h {
        public C25896z8() {
            super("reportActionInfo", "reportActionInfo", 234, false);
        }
    }

    /* renamed from: qe3.c$z9 */
    public static class C25897z9 extends C12172h {
        public C25897z9() {
            super("sendAppMessageToSpecifiedContact", "sendAppMessageToSpecifiedContact", 168, true);
        }
    }

    /* renamed from: qe3.c$za */
    public static class C25898za extends C12172h {
        public C25898za() {
            super("setSendDataDirection", "setSendDataDirection", 127, false);
        }
    }

    /* renamed from: qe3.c$zb */
    public static class C25899zb extends C12172h {
        public C25899zb() {
            super("startMonitoringBeacons", "startMonitoringBeacons", 151, false);
        }
    }

    /* renamed from: qe3.c$zc */
    public static class C25900zc extends C12172h {
        public C25900zc() {
            super("uploadImage", "uploadImage", 105, true);
        }
    }

    /* renamed from: qe3.c$zd */
    public static final class C25901zd extends C12172h {
        public C25901zd() {
            super("calRqt", "calRqt", 319, false);
        }
    }

    /* renamed from: qe3.c$oe */
    public static final class C25902oe {

        /* renamed from: a */
        public static Set<String> f72241a;

        /* renamed from: a */
        public static final boolean m33053a(String str) {
            if (f72241a == null) {
                HashSet hashSet = new HashSet();
                f72241a = hashSet;
                hashSet.add("menu:share:QZone");
                f72241a.add("onImageDownloadProgress");
                f72241a.add("onVoiceUploadProgress");
                f72241a.add("onVoiceDownloadProgress");
                f72241a.add("onVoiceRecordEnd");
                f72241a.add("onVoicePlayBegin");
                f72241a.add("onVoicePlayEnd");
                f72241a.add("onLocalImageUploadProgress");
                f72241a.add("wxdownload:state_change");
                f72241a.add("wxdownload:progress_change");
                f72241a.add("hdOnDeviceStateChanged");
                f72241a.add("activity:state_change");
                f72241a.add("onWXDeviceBluetoothStateChange");
                f72241a.add("onWXDeviceLanStateChange");
                f72241a.add("onWXDeviceBindStateChange");
                f72241a.add("onReceiveDataFromWXDevice");
                f72241a.add("onScanWXDeviceResult");
                f72241a.add("onWXDeviceStateChange");
                f72241a.add("onGetKeyboardHeight");
                f72241a.add("onGetSmiley");
                f72241a.add("onAddShortcutStatus");
                f72241a.add("onMediaFileUploadProgess");
                f72241a.add("onGetA8KeyUrl");
                f72241a.add("onPageStateChange");
                f72241a.add("onGetMsgProofItems");
                f72241a.add("onNavigationBarRightButtonClick");
                f72241a.add("onBackgroundAudioStateChange");
                f72241a.add("onNetWorkChange");
                f72241a.add("onCustomGameMenuClicked");
                f72241a.add("onArticleReadingBtnClicked");
                f72241a.add("onRecordHistory");
                f72241a.add("onBeaconsInRange");
                f72241a.add("onPublishHaowanEnd");
                f72241a.add("onPublishHaowanProgress");
                f72241a.add("onMiniProgramData");
                f72241a.add("onUserGoBack");
                f72241a.add("onShareEmbedExcerptEvent");
            }
            return f72241a.contains(str);
        }
    }

    /* renamed from: a */
    public static Bundle m33050a(boolean z, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("handle", true);
        bundle.putString("handle_result", str);
        return bundle;
    }

    /* renamed from: b */
    public static C12172h m33051b(String str) {
        Map<String, C12172h> map = f72239a;
        if (map == null || ((HashMap) map).size() <= 0) {
            HashMap hashMap = new HashMap(128);
            f72239a = hashMap;
            hashMap.put("log", new C25682j5());
            ((HashMap) f72239a).put("imagePreview", new C25792r4());
            ((HashMap) f72239a).put(Scopes.PROFILE, new C25728m8());
            ((HashMap) f72239a).put("shareWeibo", new C25799rd());
            ((HashMap) f72239a).put(C82980n.NAME, new C25761oc());
            ((HashMap) f72239a).put(C1762o0.NAME, new C25763p());
            ((HashMap) f72239a).put("streamingVideoPlay", new C25717lc());
            ((HashMap) f72239a).put("addContact", new C25663i());
            ((HashMap) f72239a).put("getWidgetCaptureImgUrl", new C25567b4());
            ((HashMap) f72239a).put("sendAppMessage", new C25559aa());
            ((HashMap) f72239a).put(C78044d0.NAME, new C25634fd());
            ((HashMap) f72239a).put("scanQRCode", new C25809s9());
            ((HashMap) f72239a).put("hideOptionMenu", new C25755o4());
            ((HashMap) f72239a).put("showOptionMenu", new C25760ob());
            ((HashMap) f72239a).put(C90538k.NAME, new C25581c3());
            ((HashMap) f72239a).put("closeWindow", new C25788r0());
            ((HashMap) f72239a).put(JsApiGetInstallState.NAME, new C25867x2());
            ((HashMap) f72239a).put("setFontSizeCallback", new C12186pa());
            ((HashMap) f72239a).put("jumpToInstallUrl", new C12206y4());
            ((HashMap) f72239a).put("launchApp", new C25612e5());
            ((HashMap) f72239a).put("getBrandWCPayRequest", new C25666i2());
            ((HashMap) f72239a).put(C90227p.NAME, new C12198u9());
            ((HashMap) f72239a).put(C48418i.NAME, new C25740n5());
            ((HashMap) f72239a).put("requestHKCashier", new C25673i9());
            ((HashMap) f72239a).put("wcpaySecurityCrosscutBack", new C12173hd());
            ((HashMap) f72239a).put("editAddress", new C25722m1());
            ((HashMap) f72239a).put("getHeadingAndPitch", new C25828u2());
            ((HashMap) f72239a).put("sendEmail", new C25631fa());
            ((HashMap) f72239a).put(JsApiAddDownloadTask.NAME, new C25706l());
            ((HashMap) f72239a).put(JsApiCancelDownloadTask.NAME, new C25878y());
            ((HashMap) f72239a).put(JsApiPauseDownloadTask.NAME, new C25557a8());
            ((HashMap) f72239a).put(JsApiResumeDownloadTask.NAME, new C25782q9());
            ((HashMap) f72239a).put(JsApiQueryDownloadTask.NAME, new C25771p8());
            ((HashMap) f72239a).put(JsApiInstallDownloadTask.NAME, new C25830u4());
            ((HashMap) f72239a).put("getLatestAddress", new C25652h3());
            ((HashMap) f72239a).put("openSpecificView", new C25699k7());
            ((HashMap) f72239a).put("jumpWCMall", new C25554a5());
            ((HashMap) f72239a).put("launch3rdApp", new C25598d5());
            ((HashMap) f72239a).put(JsApiWriteCommData.NAME, new C25887yd());
            ((HashMap) f72239a).put("openUrlByExtBrowser", new C25713l7());
            ((HashMap) f72239a).put("geoLocation", new C25595d2());
            ((HashMap) f72239a).put("getBrandWCPayBindCardRequest", new C25651h2());
            ((HashMap) f72239a).put("openProductView", new C25600d7());
            ((HashMap) f72239a).put("openProductViewWithPid", new C25614e7());
            ((HashMap) f72239a).put("jumpToBizProfile", new C25893z4());
            ((HashMap) f72239a).put("openTimelineCheckInList", new C25793r5());
            ((HashMap) f72239a).put(C1715u.NAME, new C25778q5());
            ((HashMap) f72239a).put("timelineCheckIn", new C25768p5());
            ((HashMap) f72239a).put("getBrandWCPayCreateCreditCardRequest", new C25795r7());
            ((HashMap) f72239a).put("chooseCard", new C25609e0());
            ((HashMap) f72239a).put(C1694g2.NAME, new C25664i0());
            ((HashMap) f72239a).put("sendServiceAppMessage", new C25645ga());
            ((HashMap) f72239a).put("musicPlay", new C12181m5());
            ((HashMap) f72239a).put("mmsf0001", new C25737n2());
            ((HashMap) f72239a).put("getTransferMoneyRequest", new C25868x3());
            ((HashMap) f72239a).put("openWCPaySpecificView", new C25742n7());
            ((HashMap) f72239a).put("setCloseWindowConfirmDialogInfo", new C25745na());
            ((HashMap) f72239a).put("batchAddCard", new C25813t());
            ((HashMap) f72239a).put("preVerifyJSAPI", new C25685j8());
            ((HashMap) f72239a).put(JsApiStartRecordVoice.NAME, new C25574bc());
            ((HashMap) f72239a).put(JsApiStopRecordVoice.NAME, new C25676ic());
            ((HashMap) f72239a).put(JsApiStartPlayVoice.NAME, new C25615e8());
            ((HashMap) f72239a).put(JsApiPausePlayVoice.NAME, new C25571b8());
            ((HashMap) f72239a).put(JsApiStopPlayVoice.NAME, new C25703kc());
            ((HashMap) f72239a).put("uploadVoice", new C25591cd());
            ((HashMap) f72239a).put("downloadVoice", new C25665i1());
            ((HashMap) f72239a).put(JsApiChooseImage.NAME, new C25649h0());
            ((HashMap) f72239a).put("uploadImage", new C25900zc());
            ((HashMap) f72239a).put("downloadImage", new C25650h1());
            ((HashMap) f72239a).put("uploadMediaFile", new C25561ad());
            ((HashMap) f72239a).put("hideMenuItems", new C25710l4());
            ((HashMap) f72239a).put("showMenuItems", new C25716lb());
            ((HashMap) f72239a).put("hideAllNonBaseMenuItem", new C25696k4());
            ((HashMap) f72239a).put("showAllNonBaseMenuItem", new C25660hb());
            ((HashMap) f72239a).put("checkJsApi", new C25594d0());
            ((HashMap) f72239a).put("translateVoice", new C25774pc());
            ((HashMap) f72239a).put("shareQQ", new C25618eb());
            ((HashMap) f72239a).put("shareWeiboApp", new C25646gb());
            ((HashMap) f72239a).put("shareQZone", new C25632fb());
            ((HashMap) f72239a).put("getSendC2CMessageRequest", new C25829u3());
            ((HashMap) f72239a).put("batchViewCard", new C25852w());
            ((HashMap) f72239a).put("configWXDeviceWiFi", new C25826u0());
            ((HashMap) f72239a).put("getCurrentSSID", new C25708l2());
            ((HashMap) f72239a).put("setPageOwner", new C25849va());
            ((HashMap) f72239a).put("getWechatVerifyTicket", new C25892z3());
            ((HashMap) f72239a).put("openWXDeviceLib", new C25807s7());
            ((HashMap) f72239a).put("startScanWXDevice", new C25590cc());
            ((HashMap) f72239a).put("stopScanWXDevice", new C25689jc());
            ((HashMap) f72239a).put("connectWXDevice", new C25853w0());
            ((HashMap) f72239a).put("disconnectWXDevice", new C25637g1());
            ((HashMap) f72239a).put("getWXDeviceTicket", new C25597d4());
            ((HashMap) f72239a).put("getWXDeviceInfos", new C25582c4());
            ((HashMap) f72239a).put("sendDataToWXDevice", new C25588ca());
            ((HashMap) f72239a).put("closeWXDeviceLib", new C25814t0());
            ((HashMap) f72239a).put("setSendDataDirection", new C25898za());
            ((HashMap) f72239a).put("verifyWCPayPassword", new C25620ed());
            ((HashMap) f72239a).put("getPaymentOrderRequest", new C25639g3());
            ((HashMap) f72239a).put("openGameDetail", new C25794r6());
            ((HashMap) f72239a).put("openGameCenter", new C25779q6());
            ((HashMap) f72239a).put("setGameDebugConfig", new C25783qa());
            ((HashMap) f72239a).put("startTempSession", new C25619ec());
            ((HashMap) f72239a).put("getH5PrepayRequest", new C25841v2());
            ((HashMap) f72239a).put("getH5TransactionRequest", new C25855w2());
            ((HashMap) f72239a).put("menu:share:timeline", new C25705ke());
            ((HashMap) f72239a).put("menu:share:appmessage", new C25662he());
            ((HashMap) f72239a).put("menu:share:qq", new C25678ie());
            ((HashMap) f72239a).put("menu:share:weiboApp", new C25719le());
            ((HashMap) f72239a).put("menu:setfont", new C25648ge());
            ((HashMap) f72239a).put("menu:share:weibo", new C25719le());
            ((HashMap) f72239a).put("menu:share:QZone", new C25691je());
            ((HashMap) f72239a).put("getRecevieBizHongBaoRequest", new C25622f());
            ((HashMap) f72239a).put("openCamera", new C25599d6());
            ((HashMap) f72239a).put("insertVideoPlayer", new C12196t4());
            ((HashMap) f72239a).put(C17990g.NAME, new C12203wc());
            ((HashMap) f72239a).put(C83054f.NAME, new C12208y8());
            ((HashMap) f72239a).put(C83053e.NAME, new C12201w7());
            ((HashMap) f72239a).put("deleteSearchHistory", new C12164d1());
            ((HashMap) f72239a).put("getSearchHistory", new C12190q3());
            ((HashMap) f72239a).put("getSearchData", new C25724m3());
            ((HashMap) f72239a).put("showWeDrawHomeView", new C12200vb());
            ((HashMap) f72239a).put("getFestivalLiveInfo", new C12189q2());
            ((HashMap) f72239a).put("getChatSearchData", new C12175j2());
            ((HashMap) f72239a).put("getPoiInfo", new C12195t2());
            ((HashMap) f72239a).put("updateReddotTimeStamps", new C25812sc());
            ((HashMap) f72239a).put("getTeachSearchData", new C25856w3());
            ((HashMap) f72239a).put("getSearchGuideData", new C12185p3());
            ((HashMap) f72239a).put("getSearchAvatarList", new C25709l3());
            ((HashMap) f72239a).put("getSearchSnsImageList", new C12193s3());
            ((HashMap) f72239a).put("getSearchImageList", new C25791r3());
            ((HashMap) f72239a).put("getSearchDisplayNameList", new C25738n3());
            ((HashMap) f72239a).put("startSearchItemDetailPage", new C25605dc());
            ((HashMap) f72239a).put("startCommonSearchItemDetailPage", new C12209yb());
            ((HashMap) f72239a).put("reportSearchStatistics", new C25630f9());
            ((HashMap) f72239a).put("reportSearchRealTimeStatistics", new C25616e9());
            ((HashMap) f72239a).put("searchDataHasResult", new C25821t9());
            ((HashMap) f72239a).put("openEmotionPage", new C12205y1());
            ((HashMap) f72239a).put("getSearchSuggestionData", new C25816t3());
            ((HashMap) f72239a).put("setSearchInputWord", new C25885ya());
            ((HashMap) f72239a).put("setSnsObjectXmlDescList", new C12161ab());
            ((HashMap) f72239a).put("clickSnsMusicPlayButton", new C12188q0());
            ((HashMap) f72239a).put("openWeAppPage", new C25780q7());
            ((HashMap) f72239a).put("reportWeAppSearchRealtime", new C12194sd());
            ((HashMap) f72239a).put("doSearchOperation", new C12179l1());
            ((HashMap) f72239a).put("insertSearchWAWidgetView", new C25804s4());
            ((HashMap) f72239a).put("removeSearchWAWidgetView", new C25872x8());
            ((HashMap) f72239a).put("updateSearchWAWidgetView", new C25837uc());
            ((HashMap) f72239a).put("showSearchActionSheet", new C25773pb());
            ((HashMap) f72239a).put("cancelSearchActionSheet", new C25550a0());
            ((HashMap) f72239a).put("showSearchToast", new C25811sb());
            ((HashMap) f72239a).put("showSearchLoading", new C25784qb());
            ((HashMap) f72239a).put("hideSearchLoading", new C25767p4());
            ((HashMap) f72239a).put("updateWASearchTemplate", new C25876xc());
            ((HashMap) f72239a).put("preloadSearchWeapp", new C25657h8());
            ((HashMap) f72239a).put("uxSearchOpLog", new C25606dd());
            ((HashMap) f72239a).put("querySearchWeb", new C25551a2());
            ((HashMap) f72239a).put(C55511i.NAME, new C25769p6());
            ((HashMap) f72239a).put("playMusic", new C25601d8());
            ((HashMap) f72239a).put("openMusicPage", new C25895z6());
            ((HashMap) f72239a).put("openFinderFeed", new C25756o6());
            ((HashMap) f72239a).put("getCurrentLocation", new C25694k2());
            ((HashMap) f72239a).put("navControl", new C12183o5());
            ((HashMap) f72239a).put("setInteractivePopGestureEnabled", new C12192ra());
            ((HashMap) f72239a).put("showNavBarShadow", new C25746nb());
            ((HashMap) f72239a).put("hideNavBarShadow", new C25739n4());
            ((HashMap) f72239a).put("jumpToWXWallet", new C25568b5());
            ((HashMap) f72239a).put("scanCover", new C25635g());
            ((HashMap) f72239a).put("reportActionInfo", new C25896z8());
            ((HashMap) f72239a).put("openMyDeviceProfile", new C25556a7());
            ((HashMap) f72239a).put("selectPedometerSource", new C25873x9());
            ((HashMap) f72239a).put("nfcIsConnect", new C25870x5());
            ((HashMap) f72239a).put("nfcConnect", new C25831u5());
            ((HashMap) f72239a).put("nfcTransceive", new C25882y5());
            ((HashMap) f72239a).put("nfcBatchTransceive", new C25805s5());
            ((HashMap) f72239a).put("nfcGetId", new C25844v5());
            ((HashMap) f72239a).put("nfcGetInfo", new C25858w5());
            ((HashMap) f72239a).put("startMonitoringBeacons", new C25899zb());
            ((HashMap) f72239a).put("stopMonitoringBeacons", new C25647gc());
            ((HashMap) f72239a).put("nfcCheckState", new C25817t5());
            ((HashMap) f72239a).put("videoProxyInit", new C25704kd());
            ((HashMap) f72239a).put("videoProxyStartPlay", new C25748nd());
            ((HashMap) f72239a).put("videoProxyStopPlay", new C25762od());
            ((HashMap) f72239a).put("videoProxySetPlayerState", new C25718ld());
            ((HashMap) f72239a).put("videoProxySetRemainTime", new C25733md());
            ((HashMap) f72239a).put("videoProxyPreload", new C25786qd());
            ((HashMap) f72239a).put("getWebPayCheckoutCounterRequst", new C25669i5());
            ((HashMap) f72239a).put("addCustomMenuItems", new C25679j());
            ((HashMap) f72239a).put("operateGameCenterMsg", new C25846v7());
            ((HashMap) f72239a).put("openEnterpriseChat", new C25726m6());
            ((HashMap) f72239a).put("enterEnterpriseChat", new C25776q1());
            ((HashMap) f72239a).put("openEnterpriseContact", new C25741n6());
            ((HashMap) f72239a).put("selectEnterpriseContact", new C25860w9());
            ((HashMap) f72239a).put("getEnterpriseChat", new C25766p2());
            ((HashMap) f72239a).put("reportIDKey", new C25587c9());
            ((HashMap) f72239a).put("quicklyAddBrandContact", new C25808s8());
            ((HashMap) f72239a).put("consumedShareCard", new C25865x0());
            ((HashMap) f72239a).put(XWalkPlugin.PRIVATE_CACHE_DIR_NAME, new C25690jd());
            ((HashMap) f72239a).put("publicCache", new C25775pd());
            ((HashMap) f72239a).put(C11221d.NAME, new C25583c5());
            ((HashMap) f72239a).put("realtimeReport", new C25834u8());
            ((HashMap) f72239a).put("openUrlWithExtraWebview", new C25727m7());
            ((HashMap) f72239a).put("selectSingleContact", new C25884y9());
            ((HashMap) f72239a).put("sendAppMessageToSpecifiedContact", new C25897z9());
            ((HashMap) f72239a).put("setLocalData", new C25810sa());
            ((HashMap) f72239a).put("getLocalData", new C25880y2());
            ((HashMap) f72239a).put("clearLocalData", new C25751o0());
            ((HashMap) f72239a).put("showKeyboard", new C25702kb());
            ((HashMap) f72239a).put("showBottomToast", new C25675ib());
            ((HashMap) f72239a).put("shareCustomContent", new C25589cb());
            ((HashMap) f72239a).put("showSmileyPanel", new C25823tb());
            ((HashMap) f72239a).put("disableBounceScroll", new C25610e1());
            ((HashMap) f72239a).put("clearBounceBackground", new C25721m0());
            ((HashMap) f72239a).put("setNavigationBarButtons", new C25822ta());
            ((HashMap) f72239a).put("enableFullScreen", new C25752o1());
            ((HashMap) f72239a).put(C86950j1.NAME, new C25731mb());
            ((HashMap) f72239a).put(C86945i.NAME, new C25725m4());
            ((HashMap) f72239a).put("enablePullDownRefresh", new C25765p1());
            ((HashMap) f72239a).put(C86962m1.NAME, new C25560ac());
            ((HashMap) f72239a).put(C86964n1.NAME, new C25661hc());
            ((HashMap) f72239a).put("disablePullDownRefresh", new C25624f1());
            ((HashMap) f72239a).put("setPageTitle", new C25861wa());
            ((HashMap) f72239a).put("setStatusBarStyle", new C25573bb());
            ((HashMap) f72239a).put("deleteAccountSuccess", new C25579c1());
            ((HashMap) f72239a).put("chooseVideo", new C25707l0());
            ((HashMap) f72239a).put("uploadVideo", new C25575bd());
            ((HashMap) f72239a).put("openMapNavigateMenu", new C25883y6());
            ((HashMap) f72239a).put(C8134n0.NAME, new C25835ua());
            ((HashMap) f72239a).put("getWCPayRealnameVerify", new C25881y3());
            ((HashMap) f72239a).put("openDesignerEmojiView", new C25641g6());
            ((HashMap) f72239a).put("openDesignerProfile", new C25670i6());
            ((HashMap) f72239a).put("openEmoticonTopicList", new C25712l6());
            ((HashMap) f72239a).put("openDesignerEmojiViewLocal", new C25655h6());
            ((HashMap) f72239a).put("openDesignerProfileLocal", new C25683j6());
            ((HashMap) f72239a).put("openEmotionDetailViewLocal", new C25608e());
            ((HashMap) f72239a).put("openNewPage", new C25570b7());
            ((HashMap) f72239a).put("getSearchEmotionData", new C25754o3());
            ((HashMap) f72239a).put("openEmotionUrl", new C25736n1());
            ((HashMap) f72239a).put("WNNativeCallbackOnClick", new C25863wd());
            ((HashMap) f72239a).put("WNNativeCallbackOnLongClick", new C25877xd());
            ((HashMap) f72239a).put("WNNativeCallbackOnCaretChange", new C25851vd());
            ((HashMap) f72239a).put("WNNativeCallbackInitData", new C25838ud());
            ((HashMap) f72239a).put("WNNativeAsyncCallback", new C25825td());
            ((HashMap) f72239a).put("WNNativeCallbackOnBecomeEditing", new C25607de());
            ((HashMap) f72239a).put("WNNativeCallbackOnBecomeEdited", new C25621ee());
            ((HashMap) f72239a).put("changePayActivityView", new C25564b0());
            ((HashMap) f72239a).put("selectWalletCurrency", new C25732mc());
            ((HashMap) f72239a).put("scanLicence", new C25796r9());
            ((HashMap) f72239a).put(JsApiOperateMusicPlayer.NAME, new C25577c());
            ((HashMap) f72239a).put(JsApiGetMusicPlayerState.NAME, new C25563b());
            ((HashMap) f72239a).put("clearWebviewCache", new C25764p0());
            ((HashMap) f72239a).put("requireSoterBiometricAuthentication", new C25862wb());
            ((HashMap) f72239a).put("getSupportSoter", new C25875xb());
            ((HashMap) f72239a).put("unbindBankCard", new C25785qc());
            ((HashMap) f72239a).put("setBounceBackground", new C25730ma());
            ((HashMap) f72239a).put("sendEnterpriseChat", new C25603da());
            ((HashMap) f72239a).put("doExposePreparation", new C25693k1());
            ((HashMap) f72239a).put("getMsgProofItems", new C25566b3());
            ((HashMap) f72239a).put("openSecurityView", new C25671i7());
            ((HashMap) f72239a).put("startVoipCall", new C25633fc());
            ((HashMap) f72239a).put(C1701i2.NAME, new C25680j0());
            ((HashMap) f72239a).put("getOpenDeviceId", new C25611e3());
            ((HashMap) f72239a).put("getRouteUrl", new C25695k3());
            ((HashMap) f72239a).put("idCardRealnameVerify", new C25777q4());
            ((HashMap) f72239a).put("uploadIdCardSuccess", new C25749ne());
            ((HashMap) f72239a).put(C17928i.NAME, new C25688jb());
            ((HashMap) f72239a).put("openLuckyMoneyDetailView", new C25859w6());
            ((HashMap) f72239a).put("resendRemittanceMsg", new C25772p9());
            ((HashMap) f72239a).put("getGameCommInfo", new C25803s2());
            ((HashMap) f72239a).put("openGameRegion", new C25806s6());
            ((HashMap) f72239a).put("chooseIdCard", new C25636g0());
            ((HashMap) f72239a).put("getLocalImgData", new C25593d());
            ((HashMap) f72239a).put("openWeApp", new C25770p7());
            ((HashMap) f72239a).put("recordVideo", new C25847v8());
            ((HashMap) f72239a).put("previewVideo", new C25672i8());
            ((HashMap) f72239a).put("uploadEncryptMediaFile", new C25886yc());
            ((HashMap) f72239a).put(JsApiChooseMedia.NAME, new C25692k0());
            ((HashMap) f72239a).put("requestWxFacePictureVerify", new C25815t1());
            ((HashMap) f72239a).put("openCustomWebview", new C25627f6());
            ((HashMap) f72239a).put("forceUpdateWxaAttr", new C25866x1());
            ((HashMap) f72239a).put("openLuckyMoneyHistory", new C25871x6());
            ((HashMap) f72239a).put("menuitem:gameSendDesktop", new C25617ea());
            ((HashMap) f72239a).put("getWePkgAuthResult", new C25553a4());
            ((HashMap) f72239a).put("getLocalWePkgInfo", new C25891z2());
            ((HashMap) f72239a).put("openGameWebView", new C25832u6());
            ((HashMap) f72239a).put("reportGameWeb", new C25572b9());
            ((HashMap) f72239a).put("launchApplication", new C25626f5());
            ((HashMap) f72239a).put("showSearchOfBizHistory", new C25797rb());
            ((HashMap) f72239a).put("login", new C25697k5());
            ((HashMap) f72239a).put("authorize", new C25800s());
            ((HashMap) f72239a).put("requestWxFacePictureVerifyUnionVideo", new C25827u1());
            ((HashMap) f72239a).put("checkIsSupportFaceDetect", new C25578c0());
            ((HashMap) f72239a).put(JsApiOperateBackgroundAudio.NAME, new C25833u7());
            ((HashMap) f72239a).put(JsApiSetBackgroundAudioState.NAME, new C25701ka());
            ((HashMap) f72239a).put(JsApiGetBackgroundAudioState.NAME, new C25625f2());
            ((HashMap) f72239a).put("setBackgroundAudioStateMV", new C25715la());
            ((HashMap) f72239a).put(JsApiAddDownloadTaskStraight.NAME, new C25720m());
            ((HashMap) f72239a).put("setScreenOrientation", new C25874xa());
            ((HashMap) f72239a).put("addToEmoticon", new C25750o());
            ((HashMap) f72239a).put("shareEmoticon", new C25604db());
            ((HashMap) f72239a).put(C1851s3.NAME, new C25711l5());
            ((HashMap) f72239a).put(JsApiOpenAdCanvas.NAME, new C25613e6());
            ((HashMap) f72239a).put("openSearchCanvas", new C25628f7());
            ((HashMap) f72239a).put("opVoteAdData", new C12210z7());
            ((HashMap) f72239a).put("opJumpView", new C12207y7());
            ((HashMap) f72239a).put("opAdH5Func", new C12204x7());
            ((HashMap) f72239a).put("requestWxFaceRegisterInternal", new C25729m9());
            ((HashMap) f72239a).put("requestWxFaceVerifyInternal", new C25744n9());
            ((HashMap) f72239a).put(C82801g.NAME, new C25654h5());
            ((HashMap) f72239a).put("reportMiniProgramPageData", new C25602d9());
            ((HashMap) f72239a).put("selectContact", new C25848v9());
            ((HashMap) f72239a).put("openSearchWAWidgetLogView", new C25642g7());
            ((HashMap) f72239a).put("reloadSearchWAWidgetData", new C12202w8());
            ((HashMap) f72239a).put("gotoEmoticonPad", new C12166e4());
            ((HashMap) f72239a).put("querySimilarEmotion", new C12191r8());
            ((HashMap) f72239a).put("closeWindowAndGoNext", new C25801s0());
            ((HashMap) f72239a).put("requestWxVoicePrintVerifyInternal", new C25758o9());
            ((HashMap) f72239a).put("openBizChat", new C25584c6());
            ((HashMap) f72239a).put("handleWCPayWalletBuffer", new C25681j4());
            ((HashMap) f72239a).put("tapSearchWAWidgetView", new C25747nc());
            ((HashMap) f72239a).put("getMatchContactList", new C25552a3());
            ((HashMap) f72239a).put("openSearchWebView", new C25656h7());
            ((HashMap) f72239a).put("openWXSearchPage", new C25819t7());
            ((HashMap) f72239a).put("viewTypeChange", new C12171gd());
            ((HashMap) f72239a).put(C91518c.NAME, new C25857w4());
            ((HashMap) f72239a).put("openGameUrlWithExtraWebView", new C25818t6());
            ((HashMap) f72239a).put("setGameData", new C25759oa());
            ((HashMap) f72239a).put("getGameData", new C25723m2());
            ((HashMap) f72239a).put("clearGameData", new C25735n0());
            ((HashMap) f72239a).put("openECard", new C25698k6());
            ((HashMap) f72239a).put("reportGamePageTime", new C25558a9());
            ((HashMap) f72239a).put("setWCPayPassword", new C25687ja());
            ((HashMap) f72239a).put("openWCPayCardList", new C25569b6());
            ((HashMap) f72239a).put("bindEmail", new C25864x());
            ((HashMap) f72239a).put(C1774p4.NAME, new C25585c7());
            ((HashMap) f72239a).put("bindEmail", new C25864x());
            ((HashMap) f72239a).put("doGoToRecVideoList", new C25667i3());
            ((HashMap) f72239a).put("jumpWSRecVideoList", new C12169fe());
            ((HashMap) f72239a).put("openWebSearchOutLinkItem", new C12182me());
            ((HashMap) f72239a).put("recordHistory", new C25565b2());
            for (C12172h next : m33052c()) {
                ((HashMap) f72239a).put(next.mo11950b(), next);
            }
            ((HashMap) f72239a).put("getSystemInfo", new C25842v3());
            ((HashMap) f72239a).put("serviceClick", new C25674ia());
            ((HashMap) f72239a).put(C8330j0.NAME, new C25592ce());
            ((HashMap) f72239a).put("sendSingleAppMessage", new C25659ha());
            ((HashMap) f72239a).put("wcPrivacyPolicyResult", new C25677id());
            ((HashMap) f72239a).put("currentMpInfo", new C25889z0());
            ((HashMap) f72239a).put("updateAppMessageShareData", new C25824tc());
            ((HashMap) f72239a).put("updateTimelineShareData", new C25850vc());
            ((HashMap) f72239a).put("getCCData", new C25562ae());
            ((HashMap) f72239a).put("calRqt", new C25901zd());
            ((HashMap) f72239a).put(C1643f.NAME, new C25840v1());
            ((HashMap) f72239a).put("request", new C25644g9());
            ((HashMap) f72239a).put("notifyPageInfo", new C25894z5());
            ((HashMap) f72239a).put("updatePageAuth", new C25798rc());
            ((HashMap) f72239a).put("jumpDownloaderWidget", new C25869x4());
            ((HashMap) f72239a).put("batchUpdateWepkg", new C25839v());
            ((HashMap) f72239a).put("addGameDownloadTask", new C25734n());
            ((HashMap) f72239a).put("internelWxFaceVerify", new C25843v4());
            ((HashMap) f72239a).put("getDownloadWidgetTaskInfos", new C25753o2());
            ((HashMap) f72239a).put("chooseHaowanMedia", new C25623f0());
            ((HashMap) f72239a).put("queryHaowanPublish", new C25781q8());
            ((HashMap) f72239a).put("publishHaowanEdition", new C25743n8());
            ((HashMap) f72239a).put("cancelHaowanPublish", new C25888z());
            ((HashMap) f72239a).put("launchGameVideoEditor", new C25640g5());
            ((HashMap) f72239a).put(C82876d0.NAME, new C25686j9());
            ((HashMap) f72239a).put(C1818p.NAME, new C25684j7());
            ((HashMap) f72239a).put(C1835y.NAME, new C25658h9());
            ((HashMap) f72239a).put("requestOverlayPermission", new C25700k9());
            ((HashMap) f72239a).put(C55527g.NAME, new C25576be());
            ((HashMap) f72239a).put(C83067i.NAME, new C25879y0());
            ((HashMap) f72239a).put(C55531o.NAME, new C25836ub());
            ((HashMap) f72239a).put(C55529k.NAME, new C25789r1());
            ((HashMap) f72239a).put(C1574a3.NAME, new C25596d3());
            ((HashMap) f72239a).put("qqMailLoginResult", new C25757o8());
            ((HashMap) f72239a).put("getFinderLivePreviewUrl", new C25790r2());
            ((HashMap) f72239a).put("getFinderLivePreviewMicCover", new C25790r2());
            ((HashMap) f72239a).put("enterWeappContact", new C25802s1());
            ((HashMap) f72239a).put(JsApiGamelifeManager.NAME, new C25580c2());
            ((HashMap) f72239a).put(C1824s.NAME, new C25820t8());
        }
        return (C12172h) ((HashMap) f72239a).get(str);
    }

    /* renamed from: c */
    public static List<C12172h> m33052c() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C12162b1());
        linkedList.add(new C12160a1());
        linkedList.add(new C12165e2());
        linkedList.add(new C25668i4());
        linkedList.add(new C12168f4());
        linkedList.add(new C25643g8());
        linkedList.add(new C25629f8());
        linkedList.add(new C12163ba());
        linkedList.add(new C12170g4());
        linkedList.add(new C25653h4());
        linkedList.add(new C12177k());
        linkedList.add(new C12180l8());
        linkedList.add(new C12178k8());
        linkedList.add(new C25890z1());
        linkedList.add(new C12184o7());
        linkedList.add(new C12199v0());
        linkedList.add(new C12167f3());
        linkedList.add(new C12176j3());
        linkedList.add(new C12197u());
        linkedList.add(new C25555a6());
        linkedList.add(new C25586c8());
        linkedList.add(new C25845v6());
        linkedList.add(new C25854w1());
        linkedList.add(new C25714l9());
        linkedList.add(new C12187q());
        linkedList.add(new C25787r());
        linkedList.add(new C25638g2());
        linkedList.add(new C12174j1());
        return linkedList;
    }

    /* renamed from: qe3.c$h */
    public static abstract class C12172h {

        /* renamed from: a */
        public String f35268a;

        /* renamed from: b */
        public String f35269b;

        /* renamed from: c */
        public int f35270c;

        /* renamed from: d */
        public boolean f35271d;

        public C12172h() {
            this.f35268a = "noName";
            this.f35269b = "";
            this.f35270c = -1;
            this.f35271d = false;
        }

        /* renamed from: a */
        public String mo11949a() {
            return this.f35269b;
        }

        /* renamed from: b */
        public String mo11950b() {
            return this.f35268a;
        }

        public C12172h(String str, String str2, int i, boolean z) {
            this.f35268a = str;
            this.f35269b = str2;
            this.f35270c = i;
            this.f35271d = z;
        }
    }
}
