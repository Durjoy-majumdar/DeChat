package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import c93.C0440a;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1694g2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1701i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1762o0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1774p4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1851s3;
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
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1643f;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82398i;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55511i;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C1715u;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82801g;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1818p;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1835y;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82876d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C17990g;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83053e;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83054f;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55527g;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55529k;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55531o;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C83067i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import fm0.C86962m1;
import fm0.C86964n1;
import gk0.C8330j0;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import nm0.C11221d;
import qe3.C25549c;
import sl0.C90227p;
import t83.C13851h1;
import te3.wp4;
import tm0.C78044d0;
import yn0.C91518c;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$v */
public class MsgHandler$$v extends C6210c.C6214c {

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f22865b;

    /* renamed from: c */
    public final /* synthetic */ JsapiPermissionWrapper f22866c;

    /* renamed from: d */
    public final /* synthetic */ C25549c.C12172h f22867d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f22868e;

    public MsgHandler$$v(MsgHandler msgHandler, C13851h1 h1Var, JsapiPermissionWrapper jsapiPermissionWrapper, C25549c.C12172h hVar) {
        this.f22868e = msgHandler;
        this.f22865b = h1Var;
        this.f22866c = jsapiPermissionWrapper;
        this.f22867d = hVar;
    }

    /* renamed from: b */
    public void mo7263b(C6210c.C6211a.C6212a aVar, String str, LinkedList<wp4> linkedList, int i, int i2) {
        C6210c.C6211a.C6212a aVar2;
        String str2 = str;
        C6210c.C6211a.C6212a aVar3 = C6210c.C6211a.C6212a.RET_OK;
        ((HashMap) this.f22865b.mo13180c()).put("baseErrorCode", Integer.valueOf(i));
        ((HashMap) this.f22865b.mo13180c()).put("jsapiErrorCode", Integer.valueOf(i2));
        boolean z = false;
        if (this.f22868e.mo7164L6(this.f22865b.f38996i)) {
            Log.m105925i("MicroMsg.MsgHandler", "current jsapi(%s) invoked is came from menu event.(original retCode : %s)", this.f22865b.f38996i, aVar);
            aVar2 = aVar3;
        } else {
            aVar2 = aVar;
        }
        Log.m105925i("MicroMsg.MsgHandler", "onJSVerifyEnd, put webviewID = %d, %s, %d", Integer.valueOf(this.f22868e.f22672A), this.f22865b.f38996i, Integer.valueOf(aVar2.mo7281a()));
        ((HashMap) this.f22865b.f38983a).put("webview_instance_id", Integer.valueOf(this.f22868e.f22672A));
        if (aVar2 == aVar3) {
            if (C0440a.m378a(this.f22865b, this.f22868e)) {
                mo7282c(true);
                return;
            }
            if (this.f22865b.f38996i.equals("sendAppMessage")) {
                mo7282c(MsgHandler.m6305n3(this.f22868e, this.f22865b, this.f22866c));
            } else if (this.f22865b.f38996i.equals(Scopes.PROFILE)) {
                mo7282c(MsgHandler.m6182U3(this.f22868e, this.f22865b, this.f22866c));
            } else if (this.f22865b.f38996i.equals("shareWeibo")) {
                MsgHandler.m6254f4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C82980n.NAME)) {
                MsgHandler.m6324q4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("updateTimelineShareData")) {
                MsgHandler.m6067B4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("updateAppMessageShareData")) {
                MsgHandler.m6134M4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C1762o0.NAME)) {
                MsgHandler.m6201X4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("streamingVideoPlay")) {
                MsgHandler.m6214a(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("addContact")) {
                MsgHandler.m6289l(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getWidgetCaptureImgUrl")) {
                MsgHandler.m6355w(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("imagePreview")) {
                MsgHandler.m6099H(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("hideOptionMenu")) {
                MsgHandler.m6166S(this.f22868e);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("showOptionMenu")) {
                MsgHandler.m6236d0(this.f22868e);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("closeWindow")) {
                MsgHandler.m6308o0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(JsApiGetInstallState.NAME)) {
                MsgHandler.m6374z0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("scanQRCode")) {
                MsgHandler.m6118K0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("jumpToInstallUrl")) {
                MsgHandler.m6185V0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getBrandWCPayRequest")) {
                MsgHandler.m6265h1(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(C90227p.NAME)) {
                MsgHandler.m6333s1(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("wcpaySecurityCrosscutBack")) {
                MsgHandler.m6076D1(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("editAddress")) {
                MsgHandler.m6144O1(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getLatestAddress")) {
                MsgHandler.m6210Z1(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getHeadingAndPitch")) {
                MsgHandler.m6285k2(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("sendEmail")) {
                MsgHandler.m6352v2(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiAddDownloadTask.NAME)) {
                MsgHandler.m6096G2(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("addDownloadApp")) {
                MsgHandler.m6163R2(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiCancelDownloadTask.NAME)) {
                MsgHandler.m6232c3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiPauseDownloadTask.NAME)) {
                MsgHandler.m6311o3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiResumeDownloadTask.NAME)) {
                MsgHandler.m6377z3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiQueryDownloadTask.NAME)) {
                MsgHandler.m6103H3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiInstallDownloadTask.NAME)) {
                MsgHandler.m6115J3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openSpecificView")) {
                MsgHandler.m6121K3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("launch3rdApp")) {
                MsgHandler.m6133M3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("jumpWCMall")) {
                MsgHandler.m6152P3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiWriteCommData.NAME)) {
                MsgHandler.m6164R3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openProductView")) {
                MsgHandler.m6170S3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openProductViewWithPid")) {
                MsgHandler.m6176T3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getBrandWCPayBindCardRequest")) {
                MsgHandler.m6188V3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("geoLocation")) {
                MsgHandler.m6194W3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("jumpToBizProfile")) {
                MsgHandler.m6200X3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(C1715u.NAME)) {
                MsgHandler.m6206Y3(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("timelineCheckIn")) {
                mo7282c(MsgHandler.m6212Z3(this.f22868e, this.f22865b, this.f22866c));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getBrandWCPayCreateCreditCardRequest")) {
                MsgHandler.m6219a4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("sendServiceAppMessage")) {
                MsgHandler.m6226b4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("mmsf0001")) {
                MsgHandler.m6233c4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("musicPlay")) {
                MsgHandler.m6240d4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getTransferMoneyRequest")) {
                MsgHandler.m6247e4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openWCPaySpecificView")) {
                MsgHandler.m6261g4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("chooseCard")) {
                mo7282c(MsgHandler.m6268h4(this.f22868e, this.f22865b, this.f22866c));
            } else if (this.f22865b.f38996i.equalsIgnoreCase(C1694g2.NAME)) {
                MsgHandler.m6275i4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("batchAddCard")) {
                MsgHandler.m6281j4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("setCloseWindowConfirmDialogInfo")) {
                MsgHandler.m6287k4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("preVerifyJSAPI")) {
                MsgHandler.m6294l4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiStartRecordVoice.NAME)) {
                boolean unused = this.f22868e.mo7188Y5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiStopRecordVoice.NAME)) {
                MsgHandler.m6306n4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiStartPlayVoice.NAME)) {
                MsgHandler.m6312o4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiPausePlayVoice.NAME)) {
                MsgHandler.m6318p4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiStopPlayVoice.NAME)) {
                MsgHandler.m6330r4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("uploadVoice")) {
                MsgHandler.m6336s4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("downloadVoice")) {
                MsgHandler.m6342t4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiChooseImage.NAME)) {
                boolean unused2 = this.f22868e.mo7235x5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("uploadImage")) {
                MsgHandler.m6354v4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("downloadImage")) {
                MsgHandler.m6360w4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("hideMenuItems")) {
                MsgHandler.m6366x4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("showMenuItems")) {
                MsgHandler.m6372y4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("hideAllNonBaseMenuItem")) {
                MsgHandler.m6378z4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("showAllNonBaseMenuItem")) {
                MsgHandler.m6061A4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("checkJsApi")) {
                MsgHandler.m6073C4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("translateVoice")) {
                MsgHandler.m6079D4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("shareQQ")) {
                boolean unused3 = this.f22868e.mo7182V5(this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("shareWeiboApp")) {
                MsgHandler.m6092F4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("configWXDeviceWiFi")) {
                MsgHandler.m6098G4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getCurrentSSID")) {
                MsgHandler.m6104H4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getPaymentOrderRequest")) {
                MsgHandler.m6110I4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("verifyWCPayPassword")) {
                MsgHandler.m6116J4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("startMonitoringBeacons")) {
                MsgHandler.m6122K4(this.f22868e, this.f22865b, this.f22866c, new int[0]);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("stopMonitoringBeacons")) {
                MsgHandler.m6128L4(this.f22868e, this.f22865b, this.f22866c, new int[0]);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getSendC2CMessageRequest")) {
                MsgHandler.m6141N4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("batchViewCard")) {
                MsgHandler.m6147O4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("setPageOwner")) {
                MsgHandler.m6153P4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getWechatVerifyTicket")) {
                MsgHandler.m6159Q4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openWXDeviceLib")) {
                MsgHandler.m6165R4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("closeWXDeviceLib")) {
                MsgHandler.m6171S4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("startScanWXDevice")) {
                MsgHandler.m6177T4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("stopScanWXDevice")) {
                MsgHandler.m6183U4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("connectWXDevice")) {
                MsgHandler.m6189V4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("disconnectWXDevice")) {
                MsgHandler.m6195W4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getWXDeviceTicket")) {
                MsgHandler.m6207Y4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getWXDeviceInfos")) {
                MsgHandler.m6213Z4(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("sendDataToWXDevice")) {
                MsgHandler.m6220a5(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("setSendDataDirection")) {
                MsgHandler.m6227b5(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openGameDetail")) {
                MsgHandler.m6234c5(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openGameCenter")) {
                MsgHandler.m6241d5(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("setGameDebugConfig")) {
                MsgHandler.m6248e5(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("shareQZone")) {
                boolean unused4 = this.f22868e.mo7182V5(this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("startTempSession")) {
                MsgHandler.m6255f5(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getRecevieBizHongBaoRequest")) {
                MsgHandler.m6262g5(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openMyDeviceProfile")) {
                MsgHandler.m6269h5(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("selectPedometerSource")) {
                this.f22868e.mo7176S5(this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getH5PrepayRequest")) {
                MsgHandler.m6221b(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getH5TransactionRequest")) {
                MsgHandler.m6228c(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("jumpToWXWallet")) {
                MsgHandler.m6235d(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("nfcIsConnect")) {
                MsgHandler.m6242e(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("nfcConnect")) {
                MsgHandler.m6249f(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("nfcTransceive")) {
                MsgHandler.m6256g(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("nfcBatchTransceive")) {
                MsgHandler.m6263h(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("nfcGetId")) {
                MsgHandler.m6270i(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("nfcGetInfo")) {
                MsgHandler.m6276j(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("nfcCheckState")) {
                MsgHandler.m6282k(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("videoProxyInit")) {
                MsgHandler.m6295m(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("videoProxyStartPlay")) {
                MsgHandler.m6301n(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("videoProxyStopPlay")) {
                mo7282c(MsgHandler.m6307o(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("videoProxySetPlayerState")) {
                mo7282c(MsgHandler.m6313p(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("videoProxySetRemainTime")) {
                MsgHandler.m6319q(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getSearchData")) {
                boolean unused5 = this.f22868e.mo7157I5(this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("enterWeappContact")) {
                MsgHandler.m6331s(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getFestivalLiveInfo")) {
                boolean unused6 = this.f22868e.getClass();
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("showWeDrawHomeView")) {
                boolean unused7 = this.f22868e.getClass();
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getChatSearchData")) {
                mo7282c(MsgHandler.m6349v(this.f22868e, this.f22865b, this.f22866c));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getPoiInfo")) {
                MsgHandler.m6361x(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("updateReddotTimeStamps")) {
                mo7282c(MsgHandler.m6367y(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("reloadSearchWAWidgetData")) {
                MsgHandler.m6373z(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("gotoEmoticonPad")) {
                MsgHandler.m6056A(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("querySimilarEmotion")) {
                MsgHandler.m6062B(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openFinderFeed")) {
                MsgHandler.m6068C(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getCurrentLocation")) {
                MsgHandler.m6074D(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("navControl")) {
                MsgHandler.m6080E(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("setInteractivePopGestureEnabled")) {
                MsgHandler.m6087F(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("showNavBarShadow")) {
                MsgHandler.m6093G(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("hideNavBarShadow")) {
                MsgHandler.m6105I(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(C55511i.NAME)) {
                MsgHandler.m6111J(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("playMusic")) {
                this.f22868e.mo7162K6(this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openMusicPage")) {
                this.f22868e.mo7158I6(this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getTeachSearchData")) {
                MsgHandler.m6117K(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getSearchGuideData")) {
                MsgHandler.m6123L(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getSearchAvatarList")) {
                MsgHandler.m6129M(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getSearchSnsImageList")) {
                MsgHandler.m6136N(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getSearchImageList")) {
                MsgHandler.m6142O(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getSearchDisplayNameList")) {
                MsgHandler.m6148P(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("startSearchItemDetailPage")) {
                mo7282c(MsgHandler.m6154Q(this.f22868e, this.f22865b, this.f22866c));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("startCommonSearchItemDetailPage")) {
                mo7282c(MsgHandler.m6160R(this.f22868e, this.f22865b, this.f22866c));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("reportSearchStatistics")) {
                MsgHandler.m6172T(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("reportSearchRealTimeStatistics")) {
                MsgHandler.m6178U(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("searchDataHasResult")) {
                MsgHandler.m6184V(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getSearchSuggestionData")) {
                MsgHandler.m6190W(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openEmotionPage")) {
                MsgHandler.m6196X(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("setSearchInputWord")) {
                MsgHandler.m6202Y(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("querySearchWeb")) {
                MsgHandler.m6208Z(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openWeAppPage")) {
                MsgHandler.m6215a0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("reportWeAppSearchRealtime")) {
                MsgHandler.m6222b0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("doSearchOperation")) {
                MsgHandler.m6229c0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("operateGameCenterMsg")) {
                MsgHandler.m6243e0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getWebPayCheckoutCounterRequst")) {
                MsgHandler.m6250f0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("setSnsObjectXmlDescList")) {
                MsgHandler.m6257g0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("clickSnsMusicPlayButton")) {
                MsgHandler.m6264h0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("addCustomMenuItems")) {
                MsgHandler.m6271i0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openEnterpriseChat")) {
                mo7282c(MsgHandler.m6277j0(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openEnterpriseContact")) {
                MsgHandler.m6283k0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("selectEnterpriseContact")) {
                MsgHandler.m6290l0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("sendEnterpriseChat")) {
                MsgHandler.m6296m0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("enterEnterpriseChat")) {
                MsgHandler.m6302n0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getEnterpriseChat")) {
                MsgHandler.m6314p0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("reportActionInfo")) {
                MsgHandler.m6320q0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("showSearchOfBizHistory")) {
                MsgHandler.m6326r0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("changePayActivityView")) {
                mo7282c(MsgHandler.m6332s0(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("scanLicence")) {
                MsgHandler.m6338t0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openWeApp")) {
                MsgHandler.m6344u0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openECard")) {
                MsgHandler.m6350v0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("sendDataToMiniProgram")) {
                MsgHandler.m6356w0(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("preloadMiniProgramEnv")) {
                MsgHandler.m6362x0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("preloadMiniProgramContacts")) {
                MsgHandler.m6368y0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getFinderLivePreviewUrl")) {
                MsgHandler.m6057A0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getFinderLivePreviewMicCover")) {
                MsgHandler.m6063B0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("enablePullDownRefresh")) {
                this.f22868e.mo7151F5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(C86962m1.NAME)) {
                this.f22868e.mo7186X5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(C86964n1.NAME)) {
                this.f22868e.mo7190Z5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("disablePullDownRefresh")) {
                this.f22868e.mo7150E5();
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("disableBounceScroll")) {
                this.f22868e.mo7148D5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("clearBounceBackground")) {
                this.f22868e.mo7144B5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("showSmileyPanel")) {
                this.f22868e.mo7184W5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openMapNavigateMenu")) {
                this.f22868e.mo7168O5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("enableFullScreen")) {
                MsgHandler.m6069C0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("setStatusBarStyle")) {
                MsgHandler.m6075D0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("forceUpdateWxaAttr")) {
                MsgHandler.m6081E0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(C82801g.NAME)) {
                MsgHandler.m6088F0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(C82398i.NAME)) {
                MsgHandler.m6094G0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("reportIDKey")) {
                MsgHandler.m6100H0(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("quicklyAddBrandContact")) {
                mo7282c(MsgHandler.m6106I0(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("consumedShareCard")) {
                mo7282c(MsgHandler.m6112J0(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equalsIgnoreCase(C11221d.NAME)) {
                this.f22868e.mo7161K5(this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("realtimeReport")) {
                this.f22868e.mo7172Q5(this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("videoProxyPreload")) {
                MsgHandler.m6124L0(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getLocalData")) {
                MsgHandler.m6130M0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("setLocalData")) {
                MsgHandler.m6137N0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("clearLocalData")) {
                MsgHandler.m6143O0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("selectSingleContact")) {
                MsgHandler.m6149P0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("sendAppMessageToSpecifiedContact")) {
                MsgHandler.m6155Q0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("deleteAccountSuccess")) {
                MsgHandler.m6161R0(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("chooseVideo")) {
                MsgHandler.m6167S0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("uploadVideo")) {
                MsgHandler.m6173T0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openDesignerEmojiView")) {
                MsgHandler.m6179U0(this.f22868e, this.f22865b, false);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openDesignerProfile")) {
                mo7282c(MsgHandler.m6191W0(this.f22868e, this.f22865b, false));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openEmoticonTopicList")) {
                MsgHandler.m6197X0(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openDesignerEmojiViewLocal")) {
                MsgHandler.m6179U0(this.f22868e, this.f22865b, true);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openDesignerProfileLocal")) {
                mo7282c(MsgHandler.m6191W0(this.f22868e, this.f22865b, true));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openEmotionDetailViewLocal")) {
                mo7282c(MsgHandler.m6203Y0(this.f22868e, this.f22865b, true));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openNewPage")) {
                mo7282c(MsgHandler.m6209Z0(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getSearchEmotionData")) {
                MsgHandler.m6216a1(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openEmotionUrl")) {
                MsgHandler.m6223b1(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("getWCPayRealnameVerify")) {
                this.f22868e.mo7196c6(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("selectWalletCurrency")) {
                this.f22868e.mo7192a6(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiOperateMusicPlayer.NAME)) {
                MsgHandler.m6230c1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiGetMusicPlayerState.NAME)) {
                MsgHandler.m6237d1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("clearWebviewCache")) {
                MsgHandler.m6244e1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("requireSoterBiometricAuthentication")) {
                MsgHandler.m6251f1(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getSupportSoter")) {
                MsgHandler.m6272i1(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("unbindBankCard")) {
                MsgHandler.m6278j1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("setBounceBackground")) {
                this.f22868e.mo7180U5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("doExposePreparation")) {
                MsgHandler.m6284k1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getMsgProofItems")) {
                MsgHandler.m6291l1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("uploadMediaFile")) {
                MsgHandler.m6297m1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openSecurityView")) {
                MsgHandler.m6303n1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("startVoipCall")) {
                MsgHandler.m6309o1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getOpenDeviceId")) {
                MsgHandler.m6315p1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase("getRouteUrl")) {
                MsgHandler.m6321q1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("idCardRealnameVerify")) {
                this.f22868e.mo7159J5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("uploadIdCardSuccess")) {
                this.f22868e.mo7194b6(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openCamera")) {
                mo7282c(this.f22868e.mo7165M5(this.f22865b));
            } else if (this.f22865b.f38996i.equals("getGameCommInfo")) {
                this.f22868e.mo7155H5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openGameRegion")) {
                this.f22868e.mo7166N5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("chooseIdCard")) {
                this.f22868e.mo7233w5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openLuckyMoneyDetailView")) {
                MsgHandler.m6327r1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("resendRemittanceMsg")) {
                MsgHandler.m6339t1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("recordVideo")) {
                MsgHandler.m6345u1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("previewVideo")) {
                MsgHandler.m6351v1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("uploadEncryptMediaFile")) {
                MsgHandler.m6357w1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openCustomWebview")) {
                MsgHandler.m6363x1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(JsApiChooseMedia.NAME)) {
                boolean unused8 = this.f22868e.mo7239z5(this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openLuckyMoneyHistory")) {
                MsgHandler.m6375z1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("requestWxFacePictureVerify")) {
                MsgHandler.m6058A1(this.f22868e, this.f22865b, false);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getWePkgAuthResult")) {
                MsgHandler.m6064B1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getLocalWePkgInfo")) {
                MsgHandler.m6070C1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openGameWebView")) {
                MsgHandler.m6082E1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("launchApplication")) {
                MsgHandler.m6089F1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("login") || this.f22865b.f38996i.equals("authorize")) {
                MsgHandler.m6095G1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("requestWxFacePictureVerifyUnionVideo")) {
                MsgHandler.m6058A1(this.f22868e, this.f22865b, true);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("checkIsSupportFaceDetect")) {
                MsgHandler.m6101H1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(JsApiOperateBackgroundAudio.NAME)) {
                MsgHandler.m6107I1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(JsApiSetBackgroundAudioState.NAME)) {
                MsgHandler.m6113J1(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(JsApiGetBackgroundAudioState.NAME)) {
                MsgHandler.m6119K1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("setBackgroundAudioStateMV")) {
                MsgHandler.m6125L1(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equalsIgnoreCase(JsApiAddDownloadTaskStraight.NAME)) {
                MsgHandler.m6131M1(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("setScreenOrientation")) {
                MsgHandler.m6138N1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("addToEmoticon")) {
                mo7282c(MsgHandler.m6150P1(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("shareEmoticon")) {
                mo7282c(MsgHandler.m6156Q1(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("requestWxFaceRegisterInternal")) {
                MsgHandler.m6162R1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("requestWxFaceVerifyInternal")) {
                MsgHandler.m6168S1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(JsApiOpenAdCanvas.NAME)) {
                mo7282c(MsgHandler.m6174T1(this.f22868e, this.f22865b, 0));
            } else if (this.f22865b.f38996i.equals("openSearchCanvas")) {
                mo7282c(MsgHandler.m6174T1(this.f22868e, this.f22865b, 1));
            } else if (this.f22865b.f38996i.equals("opVoteAdData")) {
                MsgHandler.m6180U1(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("opJumpView")) {
                MsgHandler.m6186V1(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("opAdH5Func")) {
                MsgHandler.m6192W1(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("selectContact")) {
                MsgHandler.m6198X1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C1851s3.NAME)) {
                MsgHandler.m6204Y1(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("setWCPayPassword")) {
                MsgHandler.m6217a2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C1701i2.NAME)) {
                MsgHandler.m6224b2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("showSearchActionSheet")) {
                MsgHandler.m6231c2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("cancelSearchActionSheet")) {
                MsgHandler.m6238d2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("showSearchToast")) {
                MsgHandler.m6245e2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("showSearchLoading")) {
                MsgHandler.m6252f2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("hideSearchLoading")) {
                MsgHandler.m6259g2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("updateWASearchTemplate")) {
                MsgHandler.m6266h2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("preloadSearchWeapp")) {
                MsgHandler.m6273i2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("uxSearchOpLog")) {
                MsgHandler.m6279j2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openSearchWAWidgetLogView")) {
                MsgHandler.m6292l2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openBizChat")) {
                MsgHandler.m6298m2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("tapSearchWAWidgetView")) {
                MsgHandler.m6304n2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getMatchContactList")) {
                MsgHandler.m6310o2(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("openSearchWebView")) {
                mo7282c(MsgHandler.m6316p2(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equalsIgnoreCase("openWXSearchPage")) {
                MsgHandler.m6322q2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("viewTypeChange")) {
                MsgHandler.m6328r2(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("openGameUrlWithExtraWebView")) {
                MsgHandler.m6334s2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("requestWxVoicePrintVerifyInternal")) {
                MsgHandler.m6340t2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("closeWindowAndGoNext")) {
                MsgHandler.m6346u2(this.f22868e, this.f22865b, this.f22866c);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C91518c.NAME)) {
                MsgHandler.m6358w2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("setGameData")) {
                MsgHandler.m6364x2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getGameData")) {
                MsgHandler.m6370y2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("clearGameData")) {
                MsgHandler.m6376z2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("handleWCPayWalletBuffer")) {
                MsgHandler.m6059A2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("reportGamePageTime")) {
                MsgHandler.m6065B2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("insertVideoPlayer")) {
                MsgHandler.m6071C2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C17990g.NAME)) {
                MsgHandler.m6077D2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C83054f.NAME)) {
                MsgHandler.m6083E2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C83053e.NAME)) {
                MsgHandler.m6090F2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getSearchHistory")) {
                MsgHandler.m6102H2(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("deleteSearchHistory")) {
                MsgHandler.m6108I2(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("doGoToRecVideoList") || this.f22865b.f38996i.equals("jumpWSRecVideoList")) {
                MsgHandler.m6114J2(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("recordHistory")) {
                MsgHandler.m6120K2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C1774p4.NAME)) {
                MsgHandler.m6126L2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openWCPayCardList")) {
                MsgHandler.m6132M2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("bindEmail")) {
                MsgHandler.m6139N2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getSystemInfo")) {
                MsgHandler.m6145O2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("serviceClick")) {
                MsgHandler.m6151P2(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals(C8330j0.NAME)) {
                mo7282c(MsgHandler.m6157Q2(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("sendSingleAppMessage")) {
                mo7282c(MsgHandler.m6169S2(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("openWebSearchOutLinkItem")) {
                MsgHandler.m6175T2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("wcPrivacyPolicyResult")) {
                MsgHandler.m6181U2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("currentMpInfo")) {
                MsgHandler.m6187V2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C1643f.NAME)) {
                MsgHandler.m6193W2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("jumpDownloaderWidget")) {
                MsgHandler.m6199X2(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("batchUpdateWepkg")) {
                mo7282c(MsgHandler.m6205Y2(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("privateOpenWeappFunctionalPage")) {
                MsgHandler.m6211Z2(this.f22868e, this.f22865b);
                mo7282c(false);
            } else if (this.f22865b.f38996i.equals("privateCommonApi")) {
                mo7282c(MsgHandler.m6218a3(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("internelWxFaceVerify")) {
                MsgHandler.m6225b3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("openWebViewUseFastLoad")) {
                mo7282c(MsgHandler.m6239d3(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("handleHaokanAction")) {
                mo7282c(MsgHandler.m6246e3(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("handleMPPageAction")) {
                mo7282c(MsgHandler.m6253f3(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals(C82876d0.NAME)) {
                MsgHandler.m6260g3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C1818p.NAME)) {
                MsgHandler.m6267h3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C1835y.NAME)) {
                MsgHandler.m6274i3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C78044d0.NAME)) {
                MsgHandler.m6280j3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C55527g.NAME)) {
                mo7282c(MsgHandler.m6286k3(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals(C83067i.NAME)) {
                mo7282c(MsgHandler.m6293l3(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals(C55531o.NAME)) {
                MsgHandler.m6299m3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C55529k.NAME)) {
                mo7282c(MsgHandler.m6317p3(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("getCCData")) {
                mo7282c(MsgHandler.m6323q3(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("calRqt")) {
                mo7282c(MsgHandler.m6329r3(this.f22868e, this.f22865b));
            } else if (this.f22865b.f38996i.equals("addGameDownloadTask")) {
                MsgHandler.m6335s3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("reportGameWeb")) {
                MsgHandler.m6341t3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("getDownloadWidgetTaskInfos")) {
                MsgHandler.m6347u3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("chooseHaowanMedia")) {
                MsgHandler.m6353v3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("queryHaowanPublish")) {
                MsgHandler.m6359w3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("publishHaowanEdition")) {
                MsgHandler.m6365x3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("cancelHaowanPublish")) {
                MsgHandler.m6371y3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("launchGameVideoEditor")) {
                MsgHandler.m6060A3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals(C1574a3.NAME)) {
                MsgHandler.m6066B3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("qqMailLoginResult")) {
                MsgHandler.m6072C3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else if (this.f22865b.f38996i.equals("requestOverlayPermission")) {
                MsgHandler.m6078D3(this.f22868e, this.f22865b);
                mo7282c(true);
            } else {
                Log.m105920e("MicroMsg.MsgHandler", "unknown function = " + this.f22865b.f38996i);
                this.f22868e.mo7210k5(this.f22865b, "system:function_not_exist", (Map<String, Object>) null);
                mo7282c(true);
            }
            z = true;
        } else if (aVar2 == C6210c.C6211a.C6212a.RET_ACCESS_DENIED) {
            Log.m105921e("MicroMsg.MsgHandler", "handleMsg access denied %s", this.f22867d.mo11950b());
            if (this.f22865b.f38996i.equalsIgnoreCase("getBrandWCPayRequest")) {
                C115669n.INSTANCE.idkeyStat(157, 1, 1, false);
            }
            MsgHandler.m6084E3(this.f22868e, this.f22865b);
            this.f22868e.mo7210k5(this.f22865b, "system:access_denied", (Map<String, Object>) null);
            mo7282c(true);
        } else if (aVar2 == C6210c.C6211a.C6212a.RET_REJECT) {
            MsgHandler msgHandler = this.f22868e;
            C13851h1 h1Var = this.f22865b;
            msgHandler.mo7210k5(h1Var, this.f22867d.mo11949a() + XVFSFile.PATH_SEPARATOR + str2, (Map<String, Object>) null);
            mo7282c(true);
        } else if (Util.isNullOrNil(this.f22867d.mo11949a())) {
            this.f22868e.f22712u = false;
            mo7282c(false);
            this.f22868e.mo7167N6(this.f22865b, false);
            return;
        } else {
            if (Util.isNullOrNil(str)) {
                MsgHandler msgHandler2 = this.f22868e;
                C13851h1 h1Var2 = this.f22865b;
                msgHandler2.mo7210k5(h1Var2, this.f22867d.mo11949a() + ":fail", (Map<String, Object>) null);
            } else {
                MsgHandler msgHandler3 = this.f22868e;
                C13851h1 h1Var3 = this.f22865b;
                msgHandler3.mo7210k5(h1Var3, this.f22867d.mo11949a() + ":fail_" + str2, (Map<String, Object>) null);
            }
            mo7282c(true);
        }
        Object obj = ((HashMap) this.f22865b.mo13180c()).get("Internal@AsyncReport");
        if (obj == null || !(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            this.f22868e.mo7167N6(this.f22865b, z);
        }
        if (!z) {
            this.f22868e.mo7185W6(this.f22865b, 1, aVar2.mo7281a());
        }
    }
}
