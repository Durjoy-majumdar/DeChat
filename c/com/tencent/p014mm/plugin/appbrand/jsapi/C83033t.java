package com.tencent.p014mm.plugin.appbrand.jsapi;

import br0.C79783h;
import cl0.C80050f;
import cl0.C80054g;
import cl0.C80055h;
import cl0.C80058i;
import cl0.C80060j;
import cl0.C80061k;
import cl0.C80062l;
import cl0.C80063m;
import cl0.C80064n;
import cl0.C80065o;
import cl0.C80066p;
import cl0.C80068q;
import cm0.C28613b;
import com.tencent.luggage.sdk.customize.impl.C80228b;
import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17657e;
import com.tencent.p014mm.plugin.appbrand.C84081q4;
import com.tencent.p014mm.plugin.appbrand.jsapi.advertise.C1588c;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.C1609j;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTaskForNative;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallStateForNative;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTaskForNative;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiJumpDownloaderWidgetForNative;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTaskForNative;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTaskForNative;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82082h;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82085i;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82090l;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82094o;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82099t;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82102w;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C1614a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82198r;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82207x;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiLogin;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;
import com.tencent.p014mm.plugin.appbrand.jsapi.backgroundfetch.C1633a;
import com.tencent.p014mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken;
import com.tencent.p014mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1640c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1641d;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1643f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1644g;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1645h;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter.C1650c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication;
import com.tencent.p014mm.plugin.appbrand.jsapi.bizvideochannel.JsApiHandleMpChannelAction;
import com.tencent.p014mm.plugin.appbrand.jsapi.bizvideochannel.JsApiOpenWebViewUseFastLoad;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82229d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82234f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82254n;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82255o;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82256p;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82260t;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82261u;
import com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView;
import com.tencent.p014mm.plugin.appbrand.jsapi.camera.C82273a;
import com.tencent.p014mm.plugin.appbrand.jsapi.camera.C82274d;
import com.tencent.p014mm.plugin.appbrand.jsapi.camera.SameLayerCameraView;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55480f;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55481g;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55483h;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55484i;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55488m;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C82294b;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C82299e;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C82301j;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C82303l;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C82304n;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C1661e;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C1667r;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C40461l;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C68614h;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82327b;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82341m;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.C82353a;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.C82359b;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82390b;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82391c;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82392d;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82398i;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82399k;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C1684x0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82408a1;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82412b1;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82414c0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82416c1;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82418d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82424e0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82428f0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82431g0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82441h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82447i0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82449j;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82450j0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82452k;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82453k0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82455l;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82456l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82458m;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82459m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82461n;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82462n0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82464o;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82465o0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82467p;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82468p0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82470q;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82471q0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82473r;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82475r0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82477s;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82479s0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82481t;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82483t0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82485u;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82486u0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82488v;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82489v0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82497w0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82502y0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82504z0;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C1692d;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55508f;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55510h;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55511i;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55513k;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C68615j;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C82509b;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiDeleteFinderDataItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiFinderEndorsementFinished;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiGetFinderAccount;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiOpenFinderOrderCenter;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct;
import com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact.C40467d;
import com.tencent.p014mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C1714f;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C1715u;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82588f0;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82590h;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82592j;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82595m;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82600o;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82606r;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82609t;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82613z;
import com.tencent.p014mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp;
import com.tencent.p014mm.plugin.appbrand.jsapi.liteapp.JsApiPreloadLiteApp;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1734h1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1743m1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1747o1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82699c;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82717g1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82720h;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82725i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82728j;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82729j0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82735k1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82736l;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82751q1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82760r1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82766t1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82772v1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82783z0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C92903w1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C92905x1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C1748d;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82799e;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82801g;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82805k;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram;
import com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C1761b;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82852c;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82854d;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82855e;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82860i;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.hce.HCEService;
import com.tencent.p014mm.plugin.appbrand.jsapi.offlinevoice.C29531a;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1791a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1795c0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1798f;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1802h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1803i;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1805j;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1807j0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1810l;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1815n0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1818p;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1820q;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1821q0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1824s;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1825s0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1828u;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1829u0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1833w0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1835y;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82876d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82877e0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82878f0;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17926h;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C1838k;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C68618i;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C82887b;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C82889c;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C82891d;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C82894f;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C82895j;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C82900n;
import com.tencent.p014mm.plugin.appbrand.jsapi.scanner.C1857b;
import com.tencent.p014mm.plugin.appbrand.jsapi.scanner.JsApiScanCode;
import com.tencent.p014mm.plugin.appbrand.jsapi.scanner.JsApiScanItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1861c;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1862l;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1868p;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82956d;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82958e;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82962g;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82965h;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82969i;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82971j;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82973k;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82982o;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82985q;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82986r;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82989s;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82991t;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82992u;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82993v;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C1874u;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C29541i;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83003a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83008b;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83009b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83010c;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83012d;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83013e;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83015g;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83016h;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83021n;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83024q;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83025r;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83026s;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83029x;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83030y;
import com.tencent.p014mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C17988a;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C17990g;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83051d;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83053e;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83054f;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C1895m;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55527g;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55529k;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55531o;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C83067i;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83069c;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83075d;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83076e;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83077f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83081k;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C1929n;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C83534a;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C83545l;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C92907d;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C1500a;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81111c;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81122k;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81123l;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81124m;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81125n;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.JsApiGetAdPushMsg;
import com.tencent.p014mm.plugin.appbrand.report.C84099a0;
import com.tencent.p014mm.plugin.appbrand.report.C84106b0;
import com.tencent.p014mm.plugin.appbrand.utils.C2042l2;
import com.tencent.p014mm.plugin.appbrand.utils.C29677m2;
import com.tencent.p014mm.plugin.appbrand.utils.C68661c0;
import com.tencent.p014mm.plugin.appbrand.utils.C84714a0;
import com.tencent.p014mm.plugin.appbrand.utils.C84718b0;
import com.tencent.p014mm.plugin.appbrand.utils.C84779q2;
import com.tencent.p014mm.plugin.appbrand.utils.C84794x1;
import com.tencent.p014mm.plugin.appbrand.weishi.C84909g;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import dl0.C86341b;
import dl0.C86342c;
import dm0.C86349f;
import do0.C86384a;
import do0.C86388e;
import ek0.C7727h;
import el0.C7735a;
import em0.C107280l;
import em0.C86534a;
import em0.C86536b;
import em0.C86537c;
import em0.C86546d;
import em0.C86547e;
import em0.C86548f;
import em0.C86552g;
import em0.C86554h;
import em0.C86565m;
import fk0.C86908a;
import fk0.C86910b;
import fk0.C86911c;
import fk0.C86913d;
import fm0.C8133c0;
import fm0.C8134n0;
import fm0.C86925a0;
import fm0.C86926a1;
import fm0.C86929c1;
import fm0.C86933e;
import fm0.C86937f0;
import fm0.C86938f1;
import fm0.C86939g;
import fm0.C86940g0;
import fm0.C86943h0;
import fm0.C86944h1;
import fm0.C86945i;
import fm0.C86949j0;
import fm0.C86950j1;
import fm0.C86951k;
import fm0.C86956l0;
import fm0.C86957l1;
import fm0.C86962m1;
import fm0.C86963n;
import fm0.C86964n1;
import fm0.C86968p;
import fm0.C86971p1;
import fm0.C86973q0;
import fm0.C86974q1;
import fm0.C86977r1;
import fm0.C86979s0;
import fm0.C86980s1;
import fm0.C86982t0;
import fm0.C86984v;
import fm0.C86986v0;
import fm0.C86990y;
import fm0.C86991y0;
import gl0.C87267c;
import gl0.C87268e;
import gl0.C87269g;
import gm0.C87271b;
import gp0.C87286c;
import h81.C32735h;
import hl0.C8538a;
import hl0.C8539k;
import hl0.C87544c;
import hl0.C87545d;
import hl0.C87547f;
import hl0.C87549g;
import hl0.C87551i;
import hl0.C87552j;
import ho0.C87572f;
import ho0.C87573g;
import ht0.C87587b;
import im0.C87753b;
import im0.C87754e;
import im0.C9196d;
import im0.C9198j;
import ir0.C9236a;
import ir0.C9237b;
import ir0.C9238c;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jl0.C9464d;
import jl0.C9465e;
import jm0.C9471a;
import ju0.C21286r;
import kk0.C88172a;
import kk0.C88177d;
import kk0.C88178e;
import kk0.C88180f;
import kk0.C88182g;
import kk0.C88183h;
import kk0.C88184i;
import kk0.C88185j;
import kk0.C88186k;
import kk0.C88188l;
import kk0.C88191m;
import kk0.C88200n;
import kk0.C88202o;
import kk0.C88204p;
import kk0.C88208q;
import kk0.C88209r;
import kl0.C33935c;
import kl0.C88216d;
import kl0.C88221e;
import km0.C88224a;
import ko0.C88248e;
import ko0.C88249f;
import ko0.C88250g;
import ko0.C88251h;
import ko0.C88252i;
import ku0.C88288a;
import li0.C88509c;
import lk0.C88547c;
import lk0.C88549d;
import lk0.C88550e;
import lk0.C88551f;
import lk0.C88552g;
import lk0.C88556i;
import lk0.C88558j;
import ll0.C88573d;
import ll0.C88579j;
import lm0.C88585e;
import lm0.C88592k;
import ml0.C34586a;
import ml0.C88770j;
import ml0.C88773m;
import mo0.C88789d;
import mo0.C88790e;
import mo0.C88791f;
import mo0.C88792g;
import ms0.C88840a;
import mt0.C88846b;
import nl0.C89009a;
import nl0.C89011b;
import nm0.C11221d;
import nm0.C11222f;
import nm0.C11223g;
import nm0.C89025e;
import nm0.C89030h;
import nm0.C89032j;
import ol0.C117836s0;
import om0.C89245a;
import p1058wb.C90906b;
import p1066yc.C91412i;
import p1070zf.C91675a;
import p1070zf.C91680c;
import p1070zf.C91681d;
import p211oc.C11387b;
import p211oc.C11388c;
import p211oc.C11390e;
import p224ra.C89909e;
import p225rc.C89916g;
import p225rc.C89922k;
import p301cd.C80005q;
import pl0.C118114r;
import pm0.C89369a;
import pm0.C89383g;
import pm0.C89388l;
import ql0.C89698a;
import ql0.C89699b;
import ql0.C89703c;
import qm0.C12879b;
import qo0.C89726b;
import qo0.C89727c;
import qt0.C89843b;
import qt0.C89849e;
import rk0.C89996i;
import rl0.C13011c;
import rl0.C90004e;
import rm0.C90009a;
import rm0.C90010b;
import rm0.C90016c;
import rm0.C90021d;
import rm0.C90026e;
import rm0.C90029f;
import rm0.C90040j;
import ro0.C90071e;
import ro0.C90072f;
import ro0.C90073g;
import ro0.C90074h;
import ro0.C90075i;
import rx3.C13601g;
import rx3.C36570n;
import sl0.C13709d;
import sl0.C22368l;
import sl0.C48418i;
import sl0.C90219e;
import sl0.C90220f;
import sl0.C90223g;
import sl0.C90225m;
import sl0.C90227p;
import sm0.C90238c;
import sm0.C90241f;
import sm0.C90242g;
import sp0.C90280d;
import sp0.C90291h;
import sp0.C90302k;
import sp0.C90311n;
import sp0.C90326y;
import tl0.C90512b;
import tl0.C90513c;
import tl0.C90514d;
import tm0.C14016b0;
import tm0.C14027j;
import tm0.C14039u;
import tm0.C14042x;
import tm0.C22544i;
import tm0.C52353h;
import tm0.C78043c0;
import tm0.C78044d0;
import tm0.C90530a0;
import tm0.C90547n;
import tm0.C90548o;
import tm0.C90550q;
import tm0.C90552s;
import tm0.C90553t;
import tm0.C90557z;
import uk0.C14196a;
import ul0.C90694b;
import ul0.C90695c;
import ul0.C90696d;
import ul0.C90697e;
import um0.C22654c;
import um0.C22655d;
import um0.C22656e;
import um0.C22657f;
import um0.C22658g;
import um0.C22659h;
import un0.C14253d;
import vk0.C90814f;
import vk0.C90819m;
import vk0.C90820o;
import vk0.C90821p;
import vk0.C90822q;
import vk0.C90823r;
import vl0.C90828b;
import vl0.C90829c;
import vl0.C90830d;
import vm0.C90835c;
import vm0.C90836d;
import vm0.C90837e;
import vm0.C90840g;
import vm0.C90841h;
import wm0.C38232f;
import wn0.C53188a;
import wn0.C53191d;
import xk0.C15713f;
import xk0.C91263b;
import xk0.C91264c;
import xk0.C91268g;
import xk0.C91276m;
import xm0.C91284a;
import yl0.C91481e;
import yl0.C91483f;
import yl0.C91485g;
import yl0.C91487h;
import yl0.C91489i;
import yl0.C91491j;
import yl0.C91493k;
import yl0.C91494l;
import yl0.C91496m;
import yl0.C91499o;
import yl0.C91502p;
import yl0.C91504q;
import ym0.C91507b;
import yn0.C91530k;
import yn0.C91531l;
import yn0.C91532m;
import yn0.C91533n;
import zn0.C91797a;
import zn0.C91802b;
import zn0.C91803c;
import zn0.C91807d;
import zn0.C91810e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t */
public final class C83033t {

    /* renamed from: e */
    public static final boolean f242758e;

    /* renamed from: a */
    public long f242759a;

    /* renamed from: b */
    public long f242760b;

    /* renamed from: c */
    public final Map<String, C82870p> f242761c = new C83034a(this);

    /* renamed from: d */
    public final Map<String, C82870p> f242762d = new C83035b(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t$a */
    public class C83034a extends HashMap<String, C82870p> {
        public C83034a(C83033t tVar) {
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "ServiceAPIs[%d]", new Object[]{Integer.valueOf(size())});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t$b */
    public class C83035b extends HashMap<String, C82870p> {
        public C83035b(C83033t tVar) {
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "PageAPIs[%d]", new Object[]{Integer.valueOf(size())});
        }
    }

    static {
        boolean z = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
        C84718b0 b0Var = C84718b0.f247110a;
        C13601g gVar = C84718b0.f247111b;
        C89922k.f258400a = (C84714a0) ((C36570n) gVar).getValue();
        C89922k.f258401b = C68661c0.f197217a;
        C89916g.f258376g = (C84714a0) ((C36570n) gVar).getValue();
        Map<Integer, C9236a> map = C9238c.f28976a;
        C9196d.f28935g = new C9237b();
        int i = AppBrandCameraView.f49260p0;
        C82274d.f241186h = new C82273a();
        int i2 = SameLayerCameraView.f49326y0;
        C86384a.f251153o = new C90823r();
        Map<String, C88509c.C88512b> map2 = C82564l7.f241668a;
        C90220f.f259024p = new C82558k7();
        C17926h.f49439j = C79783h.f233808b;
        C89909e.m112441f(C90326y.class, new C87286c());
        C89909e.m112440e(C88840a.class, new C82588f0());
        C89909e.m112440e(C88846b.class, C92907d.f267597d);
        C89909e.m112440e(C89843b.C89846b.class, new C89849e());
        C89909e.m112440e(C90009a.class, new C90040j());
        C89909e.m112440e(C40469j0.class, new C83534a());
        C89909e.m112440e(C89726b.class, new C84794x1());
        C89909e.m112440e(C118114r.class, new C1929n());
        C89909e.m112440e(C87587b.class, new C83545l());
        C89909e.m112440e(C82560l0.class, new C29677m2());
        C89909e.m112440e(C88224a.class, C84779q2.f247202d);
        C89909e.m112440e(C90814f.class, new C86388e());
        C82699c cVar = C82699c.f241991d;
        cVar.getClass();
        if (((Boolean) ((C36570n) C82699c.f241992e).getValue()).booleanValue()) {
            C89909e.m112440e(C82729j0.class, cVar);
        }
        C89909e.m112440e(C82732k0.C82734b.class, new C82736l(C82720h.f242037a, C82728j.f242046a));
        AppBrandVideoWrapper.setVideoViewFactory(new C91507b());
        AppBrandVideoWrapper.setAudioFocusComponentFactory(C82725i2.f242039e);
        C89909e.m112440e(C89727c.class, new C84099a0());
        Log.m105924i("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "enable");
        C91412i.f262135a = true;
        int i3 = C34586a.f93005a;
        C80005q.f234309P = C88288a.f255199E;
        C17657e.f48041f = C21286r.f60142b;
        C89909e.m112440e(C89996i.class, C80228b.f234902d);
        C82234f.C82235a aVar = C82234f.f241133b;
        C82229d0.C82230b bVar = C82229d0.f241111u;
        aVar.getClass();
        Log.m105924i("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "install, clientFactory: " + C82229d0.f241113w);
        C82234f.f241134c = new C82234f(bVar);
        C89909e.m112440e(C1761b.class, C2042l2.f11989d);
        f242758e = z;
    }

    /* renamed from: e */
    public static String m101844e(C82870p pVar) {
        return String.format(Locale.US, "[%s->%s]", new Object[]{pVar.mo114779e(), pVar.getClass().getSimpleName()});
    }

    /* renamed from: f */
    public static Map<String, C82870p> m101845f() {
        C83033t tVar = new C83033t();
        tVar.mo115290g(C84106b0.XWalk);
        return tVar.f242762d;
    }

    /* renamed from: a */
    public final void mo115286a(C82870p pVar) {
        long currentTicks = Util.currentTicks() - this.f242760b;
        if (currentTicks > 1) {
            Log.m105921e("MicroMsg.AppBrandJsApiPool", "addToPagePool api[%s] use[%dms]", pVar.mo114779e(), Long.valueOf(currentTicks));
        }
        if (((C82870p) ((HashMap) this.f242762d).put(pVar.mo114779e(), pVar)) == null) {
            pVar.f242314e = f242758e;
            this.f242760b = Util.currentTicks();
            return;
        }
        throw new IllegalAccessError("Duplicated api instance " + m101844e(pVar));
    }

    /* renamed from: b */
    public final void mo115287b(List<C82870p> list) {
        if (list != null && list.size() > 0) {
            for (C82870p a : list) {
                mo115286a(a);
            }
        }
    }

    /* renamed from: c */
    public final void mo115288c(C82870p pVar) {
        long currentTicks = Util.currentTicks() - this.f242759a;
        if (currentTicks > 1) {
            Log.m105921e("MicroMsg.AppBrandJsApiPool", "addToServicePool api[%s] use[%dms]", pVar.mo114779e(), Long.valueOf(currentTicks));
        }
        if (((C82870p) ((HashMap) this.f242761c).put(pVar.mo114779e(), pVar)) == null) {
            pVar.f242314e = f242758e;
            this.f242759a = Util.currentTicks();
            return;
        }
        throw new IllegalAccessError("Duplicated api instance " + m101844e(pVar));
    }

    /* renamed from: d */
    public final void mo115289d(List<C82870p> list) {
        if (list != null && list.size() > 0) {
            for (C82870p c : list) {
                mo115288c(c);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0529  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115290g(com.tencent.p014mm.plugin.appbrand.report.C84106b0 r6) {
        /*
            r5 = this;
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r5.f242760b = r0
            com.tencent.mm.plugin.appbrand.jsapi.profile.j r0 = new com.tencent.mm.plugin.appbrand.jsapi.profile.j
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.n4 r0 = new com.tencent.mm.plugin.appbrand.jsapi.n4
            r0.<init>()
            r5.mo115286a(r0)
            tm0.t r0 = new tm0.t
            r0.<init>()
            r5.mo115286a(r0)
            tm0.s r0 = new tm0.s
            r0.<init>()
            r5.mo115286a(r0)
            tm0.q r0 = new tm0.q
            r0.<init>()
            r5.mo115286a(r0)
            tm0.n r0 = new tm0.n
            r0.<init>()
            r5.mo115286a(r0)
            ll0.k r0 = new ll0.k
            r0.<init>()
            r5.mo115286a(r0)
            ll0.d r0 = new ll0.d
            r0.<init>()
            r5.mo115286a(r0)
            ll0.c r0 = new ll0.c
            r0.<init>()
            r5.mo115286a(r0)
            ll0.o r0 = new ll0.o
            r0.<init>()
            r5.mo115286a(r0)
            ll0.e r0 = new ll0.e
            r0.<init>()
            r5.mo115286a(r0)
            ll0.p r0 = new ll0.p
            r0.<init>()
            r5.mo115286a(r0)
            ll0.g r0 = new ll0.g
            r0.<init>()
            r5.mo115286a(r0)
            ll0.i r0 = new ll0.i
            r0.<init>()
            r5.mo115286a(r0)
            fm0.v r0 = new fm0.v
            r0.<init>()
            r5.mo115286a(r0)
            fm0.u r0 = new fm0.u
            r0.<init>()
            r5.mo115286a(r0)
            fm0.t r0 = new fm0.t
            r0.<init>()
            r5.mo115286a(r0)
            nm0.f r0 = new nm0.f
            r0.<init>()
            r5.mo115286a(r0)
            nm0.g r0 = new nm0.g
            r0.<init>()
            r5.mo115286a(r0)
            nm0.j r0 = new nm0.j
            r0.<init>()
            r5.mo115286a(r0)
            nm0.h r0 = new nm0.h
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.r5 r0 = new com.tencent.mm.plugin.appbrand.jsapi.r5
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.o6 r0 = new com.tencent.mm.plugin.appbrand.jsapi.o6
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.picker.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.picker.i
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.picker.k r0 = new com.tencent.mm.plugin.appbrand.jsapi.picker.k
            r0.<init>()
            r5.mo115286a(r0)
            fm0.c r0 = new fm0.c
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.e3 r0 = new com.tencent.mm.plugin.appbrand.jsapi.e3
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a r0 = new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.g r0 = new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.g
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f r0 = new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.e r0 = new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.e
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d r0 = new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.live.a r0 = new com.tencent.mm.plugin.appbrand.jsapi.live.a
            r0.<init>()
            r5.mo115286a(r0)
            ml0.t r0 = new ml0.t
            r0.<init>()
            r5.mo115286a(r0)
            ml0.o r0 = new ml0.o
            r0.<init>()
            r5.mo115286a(r0)
            ml0.m r0 = new ml0.m
            r0.<init>()
            r5.mo115286a(r0)
            ml0.e r0 = new ml0.e
            r0.<init>()
            r5.mo115286a(r0)
            ml0.p r0 = new ml0.p
            r0.<init>()
            r5.mo115286a(r0)
            ml0.n r0 = new ml0.n
            r0.<init>()
            r5.mo115286a(r0)
            ml0.j r0 = new ml0.j
            r0.<init>()
            r5.mo115286a(r0)
            ro0.e r0 = new ro0.e
            r0.<init>()
            r5.mo115286a(r0)
            ro0.i r0 = new ro0.i
            r0.<init>()
            r5.mo115286a(r0)
            ro0.f r0 = new ro0.f
            r0.<init>()
            r5.mo115286a(r0)
            ro0.h r0 = new ro0.h
            r0.<init>()
            r5.mo115286a(r0)
            ko0.e r0 = new ko0.e
            r0.<init>()
            r5.mo115286a(r0)
            ko0.i r0 = new ko0.i
            r0.<init>()
            r5.mo115286a(r0)
            ko0.f r0 = new ko0.f
            r0.<init>()
            r5.mo115286a(r0)
            ko0.h r0 = new ko0.h
            r0.<init>()
            r5.mo115286a(r0)
            mo0.d r0 = new mo0.d
            r0.<init>()
            r5.mo115286a(r0)
            mo0.g r0 = new mo0.g
            r0.<init>()
            r5.mo115286a(r0)
            mo0.e r0 = new mo0.e
            r0.<init>()
            r5.mo115286a(r0)
            mo0.f r0 = new mo0.f
            r0.<init>()
            r5.mo115286a(r0)
            xk0.g r0 = new xk0.g
            r0.<init>()
            r5.mo115286a(r0)
            xk0.h r0 = new xk0.h
            r0.<init>()
            r5.mo115286a(r0)
            xk0.n r0 = new xk0.n
            r0.<init>()
            r5.mo115286a(r0)
            xk0.p r0 = new xk0.p
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.contact.j r0 = new com.tencent.mm.plugin.appbrand.jsapi.contact.j
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.contact.m r0 = new com.tencent.mm.plugin.appbrand.jsapi.contact.m
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact r0 = new com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.l5 r0 = new com.tencent.mm.plugin.appbrand.jsapi.l5
            r0.<init>()
            r5.mo115286a(r0)
            fm0.b r0 = new fm0.b
            r0.<init>()
            r5.mo115286a(r0)
            gk0.h0 r0 = new gk0.h0
            r0.<init>()
            r5.mo115286a(r0)
            gk0.v0 r0 = new gk0.v0
            r0.<init>()
            r5.mo115286a(r0)
            gk0.c r0 = new gk0.c
            r0.<init>()
            r5.mo115286a(r0)
            gk0.t0 r0 = new gk0.t0
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.q6 r0 = new com.tencent.mm.plugin.appbrand.jsapi.q6
            r0.<init>()
            r5.mo115286a(r0)
            tm0.d0 r0 = new tm0.d0
            r0.<init>()
            r5.mo115286a(r0)
            bl0.a r0 = new bl0.a
            r0.<init>()
            r5.mo115286a(r0)
            bl0.e r0 = new bl0.e
            r0.<init>()
            r5.mo115286a(r0)
            bl0.b r0 = new bl0.b
            r0.<init>()
            r5.mo115286a(r0)
            gk0.f0 r0 = new gk0.f0
            r0.<init>()
            r5.mo115286a(r0)
            gk0.j0 r0 = new gk0.j0
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.picker.j r0 = new com.tencent.mm.plugin.appbrand.jsapi.picker.j
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.picker.g r0 = new com.tencent.mm.plugin.appbrand.jsapi.picker.g
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.picker.m r0 = new com.tencent.mm.plugin.appbrand.jsapi.picker.m
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.p6 r0 = new com.tencent.mm.plugin.appbrand.jsapi.p6
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.coverview.b r0 = new com.tencent.mm.plugin.appbrand.jsapi.coverview.b
            r0.<init>()
            r5.mo115286a(r0)
            cl0.q r0 = new cl0.q
            r0.<init>()
            r5.mo115286a(r0)
            cl0.m r0 = new cl0.m
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.coverview.a r0 = new com.tencent.mm.plugin.appbrand.jsapi.coverview.a
            r0.<init>()
            r5.mo115286a(r0)
            cl0.o r0 = new cl0.o
            r0.<init>()
            r5.mo115286a(r0)
            cl0.k r0 = new cl0.k
            r0.<init>()
            r5.mo115286a(r0)
            vk0.m r0 = new vk0.m
            r0.<init>()
            r5.mo115286a(r0)
            vk0.q r0 = new vk0.q
            r0.<init>()
            r5.mo115286a(r0)
            vk0.p r0 = new vk0.p
            r0.<init>()
            r5.mo115286a(r0)
            em0.b r0 = new em0.b
            r0.<init>()
            r5.mo115286a(r0)
            em0.e r0 = new em0.e
            r0.<init>()
            r5.mo115286a(r0)
            em0.d r0 = new em0.d
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.debugger.j r0 = new com.tencent.mm.plugin.appbrand.debugger.j
            r0.<init>()
            r5.mo115286a(r0)
            cl0.f r0 = new cl0.f
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.webview.q r0 = new com.tencent.mm.plugin.appbrand.jsapi.webview.q
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.webview.u r0 = new com.tencent.mm.plugin.appbrand.jsapi.webview.u
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.webview.s r0 = new com.tencent.mm.plugin.appbrand.jsapi.webview.s
            r0.<init>()
            r5.mo115286a(r0)
            cl0.g r0 = new cl0.g
            r0.<init>()
            r5.mo115286a(r0)
            cl0.n r0 = new cl0.n
            r0.<init>()
            r5.mo115286a(r0)
            cl0.j r0 = new cl0.j
            r0.<init>()
            r5.mo115286a(r0)
            xk0.i r0 = new xk0.i
            r0.<init>()
            r5.mo115286a(r0)
            xk0.q r0 = new xk0.q
            r0.<init>()
            r5.mo115286a(r0)
            xk0.o r0 = new xk0.o
            r0.<init>()
            r5.mo115286a(r0)
            zk0.b r0 = new zk0.b
            r0.<init>()
            r5.mo115286a(r0)
            zk0.d r0 = new zk0.d
            r0.<init>()
            r5.mo115286a(r0)
            zk0.c r0 = new zk0.c
            r0.<init>()
            r5.mo115286a(r0)
            fm0.e0 r0 = new fm0.e0
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.k5 r0 = new com.tencent.mm.plugin.appbrand.jsapi.k5
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.file.i0 r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i0
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.o0 r0 = new com.tencent.mm.plugin.appbrand.jsapi.o0
            r0.<init>()
            r5.mo115286a(r0)
            cl0.h r0 = new cl0.h
            r0.<init>()
            r5.mo115286a(r0)
            cl0.p r0 = new cl0.p
            r0.<init>()
            r5.mo115286a(r0)
            cl0.l r0 = new cl0.l
            r0.<init>()
            r5.mo115286a(r0)
            fm0.s0 r0 = new fm0.s0
            r0.<init>()
            r5.mo115286a(r0)
            fm0.n0 r0 = new fm0.n0
            r0.<init>()
            r5.mo115286a(r0)
            fm0.j1 r0 = new fm0.j1
            r0.<init>()
            r5.mo115286a(r0)
            fm0.i r0 = new fm0.i
            r0.<init>()
            r5.mo115286a(r0)
            fm0.g0 r0 = new fm0.g0
            r0.<init>()
            r5.mo115286a(r0)
            fm0.f0 r0 = new fm0.f0
            r0.<init>()
            r5.mo115286a(r0)
            java.util.List r0 = ol0.C117836s0.m166248a()
            r5.mo115287b(r0)
            vm0.g r0 = new vm0.g
            r0.<init>()
            r5.mo115286a(r0)
            vm0.d r0 = new vm0.d
            r0.<init>()
            r5.mo115286a(r0)
            fm0.h1 r0 = new fm0.h1
            r0.<init>()
            r5.mo115286a(r0)
            fm0.g r0 = new fm0.g
            r0.<init>()
            r5.mo115286a(r0)
            vm0.h r0 = new vm0.h
            r0.<init>()
            r5.mo115286a(r0)
            vm0.e r0 = new vm0.e
            r0.<init>()
            r5.mo115286a(r0)
            fm0.e r0 = new fm0.e
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k r0 = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.d r0 = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.d
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.pay.f0 r0 = new com.tencent.mm.plugin.appbrand.jsapi.pay.f0
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.pay.d0 r0 = new com.tencent.mm.plugin.appbrand.jsapi.pay.d0
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.z5 r0 = new com.tencent.mm.plugin.appbrand.jsapi.z5
            r0.<init>()
            r5.mo115286a(r0)
            fm0.q0 r0 = new fm0.q0
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.weishi.g r0 = new com.tencent.mm.plugin.appbrand.weishi.g
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData r0 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin r0 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize r0 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize
            r0.<init>()
            r5.mo115286a(r0)
            tm0.o r0 = new tm0.o
            r0.<init>()
            r5.mo115286a(r0)
            tm0.a0 r0 = new tm0.a0
            r0.<init>()
            r5.mo115286a(r0)
            tm0.u r0 = new tm0.u
            r0.<init>()
            r5.mo115286a(r0)
            tm0.b0 r0 = new tm0.b0
            r0.<init>()
            r5.mo115286a(r0)
            fm0.q1 r0 = new fm0.q1
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.storage.j r0 = new com.tencent.mm.plugin.appbrand.jsapi.storage.j
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.storage.v r0 = new com.tencent.mm.plugin.appbrand.jsapi.storage.v
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.storage.z r0 = new com.tencent.mm.plugin.appbrand.jsapi.storage.z
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.storage.k r0 = new com.tencent.mm.plugin.appbrand.jsapi.storage.k
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.d4 r0 = new com.tencent.mm.plugin.appbrand.jsapi.d4
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.e4 r0 = new com.tencent.mm.plugin.appbrand.jsapi.e4
            r0.<init>()
            r5.mo115286a(r0)
            oo0.j r0 = new oo0.j
            r0.<init>()
            r5.mo115286a(r0)
            oo0.l r0 = new oo0.l
            r0.<init>()
            r5.mo115286a(r0)
            oo0.k r0 = new oo0.k
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet r0 = new com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet
            r0.<init>()
            r5.mo115286a(r0)
            eo0.d r0 = new eo0.d
            r0.<init>()
            r5.mo115286a(r0)
            eo0.f r0 = new eo0.f
            r0.<init>()
            r5.mo115286a(r0)
            eo0.e r0 = new eo0.e
            r0.<init>()
            r5.mo115286a(r0)
            com.tencent.mm.plugin.appbrand.report.b0 r0 = com.tencent.p014mm.plugin.appbrand.report.C84106b0.Skyline
            r1 = 1
            r2 = 0
            if (r0 != r6) goto L_0x04c5
        L_0x04c3:
            r6 = 0
            goto L_0x04f8
        L_0x04c5:
            iu0.g r6 = iu0.C33407g.f90517a
            boolean r6 = com.tencent.xweb.XWebSdk.isCurrentVersionSupportMapExtendPluginForAppbrand()
            boolean r0 = com.tencent.xweb.XWebSdk.isXWebView()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "supportXWebCanvasSameLayer supportXWeb:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " isXWeb:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.AppBrand.SameLayer.XWebABTests"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            if (r6 == 0) goto L_0x04f4
            if (r0 == 0) goto L_0x04f4
            r6 = 1
            goto L_0x04f5
        L_0x04f4:
            r6 = 0
        L_0x04f5:
            if (r6 != 0) goto L_0x04c3
            r6 = 1
        L_0x04f8:
            boolean r0 = fo0.C87027l.f252546a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r0[r2] = r1
            java.lang.String r1 = "Luggage.XWebCanvasLogic"
            java.lang.String r2 = "createCanvasJsApis useCoverView:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r6 == 0) goto L_0x0529
            go0.a r6 = new go0.a
            r6.<init>()
            r0.add(r6)
            go0.b r6 = new go0.b
            r6.<init>()
            r0.add(r6)
            go0.c r6 = new go0.c
            r6.<init>()
            r0.add(r6)
            goto L_0x0541
        L_0x0529:
            ho0.b r6 = new ho0.b
            r6.<init>()
            r0.add(r6)
            ho0.d r6 = new ho0.d
            r6.<init>()
            r0.add(r6)
            ho0.e r6 = new ho0.e
            r6.<init>()
            r0.add(r6)
        L_0x0541:
            r5.mo115287b(r0)
            java.util.List r6 = wm0.C38232f.m41813a()
            r5.mo115287b(r6)
            mm0.b r6 = new mm0.b
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.i5 r6 = new com.tencent.mm.plugin.appbrand.jsapi.i5
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.a3 r6 = new com.tencent.mm.plugin.appbrand.jsapi.a3
            r6.<init>()
            r5.mo115286a(r6)
            el0.a r6 = new el0.a
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.x5 r6 = new com.tencent.mm.plugin.appbrand.jsapi.x5
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.file.w r6 = new com.tencent.mm.plugin.appbrand.jsapi.file.w
            r6.<init>()
            r5.mo115286a(r6)
            fm0.s1 r6 = new fm0.s1
            r6.<init>()
            r5.mo115286a(r6)
            fm0.t0 r6 = new fm0.t0
            r6.<init>()
            r5.mo115286a(r6)
            pm0.a r6 = new pm0.a
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed r6 = new com.tencent.mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed
            r6.<init>()
            r5.mo115286a(r6)
            gm0.b r6 = new gm0.b
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.p1 r6 = new com.tencent.mm.plugin.appbrand.jsapi.p1
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.q1 r6 = new com.tencent.mm.plugin.appbrand.jsapi.q1
            r6.<init>()
            r5.mo115286a(r6)
            fm0.l0 r6 = new fm0.l0
            r6.<init>()
            r5.mo115286a(r6)
            uk0.a r6 = new uk0.a
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.share.l r6 = new com.tencent.mm.plugin.appbrand.jsapi.share.l
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct r6 = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiOpenFinderOrderCenter r6 = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiOpenFinderOrderCenter
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.c1 r6 = new com.tencent.mm.plugin.appbrand.jsapi.c1
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.share.o r6 = new com.tencent.mm.plugin.appbrand.jsapi.share.o
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.share.k r6 = new com.tencent.mm.plugin.appbrand.jsapi.share.k
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites r6 = new com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites r6 = new com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.channels.b r6 = new com.tencent.mm.plugin.appbrand.jsapi.channels.b
            r6.<init>()
            r5.mo115286a(r6)
            vn0.c r6 = new vn0.c
            r6.<init>()
            r5.mo115286a(r6)
            vn0.d r6 = new vn0.d
            r6.<init>()
            r5.mo115286a(r6)
            vn0.b r6 = new vn0.b
            r6.<init>()
            r5.mo115286a(r6)
            fm0.w r6 = new fm0.w
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.i3 r6 = new com.tencent.mm.plugin.appbrand.i3
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.u5 r6 = new com.tencent.mm.plugin.appbrand.jsapi.u5
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.auth.x r6 = new com.tencent.mm.plugin.appbrand.jsapi.auth.x
            r6.<init>()
            r5.mo115286a(r6)
            ek0.h r6 = new ek0.h
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.j3 r6 = new com.tencent.mm.plugin.appbrand.jsapi.j3
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.b3 r6 = new com.tencent.mm.plugin.appbrand.jsapi.b3
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.c3 r6 = new com.tencent.mm.plugin.appbrand.jsapi.c3
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.l2 r6 = new com.tencent.mm.plugin.appbrand.jsapi.l2
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.n2 r6 = new com.tencent.mm.plugin.appbrand.jsapi.n2
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.c r6 = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.c
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.k r6 = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.k
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.f r6 = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.f
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.e r6 = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.e
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.d r6 = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.d
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile r6 = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile
            r6.<init>()
            r5.mo115286a(r6)
            com.tencent.mm.plugin.appbrand.jsapi.file.b0 r6 = new com.tencent.mm.plugin.appbrand.jsapi.file.b0
            r6.<init>()
            r5.mo115286a(r6)
            zf.a r6 = new zf.a
            r6.<init>()
            r5.mo115286a(r6)
            zf.d r6 = new zf.d
            r6.<init>()
            r5.mo115286a(r6)
            zf.c r6 = new zf.c
            r6.<init>()
            r5.mo115286a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C83033t.mo115290g(com.tencent.mm.plugin.appbrand.report.b0):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.tencent.mm.plugin.appbrand.jsapi.t] */
    /* renamed from: h */
    public final void mo115291h() {
        this.f242759a = Util.currentTicks();
        mo115288c(new C81123l());
        mo115288c(new C81122k());
        mo115288c(new C81111c());
        mo115288c(new C81125n());
        mo115288c(new C81124m());
        mo115288c(new C1500a());
        mo115288c(new JsApiGetAdPushMsg());
        mo115288c(new C83015g());
        mo115288c(new C83021n());
        mo115288c(new C83008b());
        mo115288c(new C83010c());
        mo115288c(new C83012d());
        mo115288c(new C83013e());
        mo115288c(new C83003a0());
        mo115288c(new C83016h());
        mo115288c(new C83026s());
        mo115288c(new C83009b0());
        mo115288c(new JsApiLogin());
        mo115288c(new JsApiAuthorize());
        mo115288c(new JsApiOperateWXData());
        mo115288c(new C82198r());
        mo115288c(new C86979s0());
        mo115288c(new C86968p());
        mo115288c(new C86925a0());
        mo115288c(new C8133c0());
        mo115288c(new C86963n());
        mo115288c(new C82370d5());
        mo115288c(new JsApiChooseImage());
        mo115288c(new C82766t1());
        mo115288c(new C82772v1());
        mo115288c(new C1734h1());
        mo115288c(new C82760r1());
        mo115288c(new C82735k1());
        mo115288c(new C82717g1());
        mo115288c(new C1747o1());
        mo115288c(new C1743m1());
        mo115288c(new JsApiStartRecordVoice());
        mo115288c(new JsApiStopRecordVoice());
        mo115288c(new JsApiStartPlayVoice());
        mo115288c(new JsApiPausePlayVoice());
        mo115288c(new JsApiStopPlayVoice());
        mo115288c(new C1715u());
        mo115288c(new C82609t());
        mo115288c(new C82606r());
        mo115288c(new C90547n());
        mo115288c(new JsApiGetMusicPlayerState());
        mo115288c(new JsApiOperateMusicPlayer());
        mo115288c(new JsApiScanCode());
        mo115288c(new C1857b());
        mo115288c(new JsApiScanItem());
        mo115288c(new C82878f0());
        mo115288c(new C82876d0());
        mo115288c(new C1877t5());
        mo115288c(new C1907x3());
        mo115288c(new C82369d4());
        mo115288c(new C82378e4());
        mo115288c(new C11222f());
        mo115288c(new C1833w0());
        mo115288c(new C1798f());
        mo115288c(new C1661e());
        mo115288c(new C1667r());
        mo115288c(new C86964n1());
        mo115288c(new C1818p());
        mo115288c(new C1835y());
        mo115288c(new C86950j1());
        mo115288c(new C86945i());
        mo115288c(new C86944h1());
        mo115288c(new C86939g());
        mo115288c(new C91268g());
        mo115288c(new C82958e());
        mo115288c(new C90553t());
        mo115288c(new C90552s());
        mo115288c(new C90550q());
        mo115288c(new C14042x());
        mo115288c(new C11223g());
        mo115288c(new C89032j());
        mo115288c(new C89030h());
        mo115288c(new C1766o6());
        mo115288c(new C88579j());
        mo115288c(new C82377e3());
        mo115288c(new C88573d());
        mo115288c(new C90010b());
        mo115288c(new C90016c());
        mo115288c(new C90029f());
        mo115288c(new C90021d());
        mo115288c(new C90026e());
        mo115288c(new C83029x());
        mo115288c(new C83030y());
        mo115288c(new C87573g());
        mo115288c(new C87572f());
        mo115288c(new C15713f());
        mo115288c(new C87754e());
        mo115288c(new C9196d());
        mo115288c(new C9198j());
        mo115288c(new C87753b());
        mo115288c(new JsApiOpenLiteApp());
        mo115288c(new JsApiPreloadLiteApp());
        mo115288c(new C83124x2());
        mo115288c(new C1851s3());
        mo115288c(new C1578a6());
        mo115288c(new C83024q());
        mo115288c(new C83025r());
        mo115288c(new C1714f());
        mo115288c(new C82613z());
        mo115288c(new C82751q1());
        mo115288c(new JsApiRefreshSession());
        mo115288c(new C86971p1());
        mo115288c(new C1802h0());
        mo115288c(new C1868p());
        mo115288c(new C84909g());
        mo115288c(new C1839q0());
        mo115288c(new C1705j4());
        mo115288c(new JsApiMakeVoIPCall());
        mo115288c(new C52353h());
        mo115288c(new C14027j());
        mo115288c(new JsApiSetClipboardDataWC());
        mo115288c(new C88191m());
        mo115288c(new C82256p());
        mo115288c(new C82261u());
        mo115288c(new C82260t());
        mo115288c(new C82254n());
        mo115288c(new C88182g());
        mo115288c(new C88204p());
        mo115288c(new C88208q());
        mo115288c(new C88183h());
        mo115288c(new C88186k());
        mo115288c(new C88185j());
        mo115288c(new C88202o());
        mo115288c(new C88178e());
        mo115288c(new C82255o());
        mo115288c(new C88172a());
        mo115288c(new C88180f());
        mo115288c(new C88177d());
        mo115288c(new C88200n());
        mo115288c(new C88209r());
        mo115288c(new C88188l());
        mo115288c(new C88184i());
        mo115288c(new C88547c());
        mo115288c(new C88549d());
        mo115288c(new C88550e());
        mo115288c(new C88551f());
        mo115288c(new C88552g());
        mo115288c(new C88556i());
        mo115288c(new C88558j());
        mo115288c(new C82801g());
        mo115288c(new C82799e());
        mo115288c(new C86990y());
        mo115288c(new C83042u5());
        mo115288c(new C82930s2());
        mo115288c(new JsApiChooseWeChatContact());
        mo115288c(new C68614h());
        mo115288c(new JsApiChooseMedia());
        mo115288c(new JsApiUploadEncryptedFileToCDN());
        mo115288c(new C1748d());
        mo115288c(new C1849r4());
        mo115288c(new C82912q6());
        mo115288c(new JsApiGetBackgroundAudioState());
        mo115288c(new JsApiSetBackgroundAudioStateWC());
        mo115288c(new C82094o());
        mo115288c(new C82985q());
        mo115288c(new C1861c());
        mo115288c(new C82931s4());
        mo115288c(new C1829u0());
        mo115288c(new C82327b());
        mo115288c(new JsApiOpenWeRunSetting());
        mo115288c(new JsApiUploadWeRunData());
        mo115288c(new C40473o1());
        mo115288c(new C90548o());
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_set_screen_brightness_jsapi_new_impl, BuildInfo.CLIENT_VERSION_INT <= 671095807 || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED)) {
            mo115288c(new JsApiSetScreenBrightness2());
        } else {
            mo115288c(new C90530a0());
        }
        mo115288c(new C78043c0());
        mo115288c(new C78044d0());
        mo115288c(new C82991t());
        mo115288c(new C82989s());
        mo115288c(new C82993v());
        mo115288c(new JsApiShowUpdatableMessageSubscribeButton());
        mo115288c(new C33935c());
        mo115288c(new C88216d());
        mo115288c(new C88221e());
        mo115288c(new JsApiCheckIsSupportFaceDetect());
        mo115288c(new C1644g());
        mo115288c(new C1643f());
        mo115288c(new C1645h());
        mo115288c(new C1640c());
        mo115288c(new C1641d());
        mo115288c(new C90072f());
        mo115288c(new C83053e());
        mo115288c(new C88773m());
        mo115288c(new C88770j());
        mo115288c(new C92903w1());
        mo115288c(new C92905x1());
        mo115288c(new C40464g3());
        mo115288c(new C82641m4());
        mo115288c(new C82962g());
        mo115288c(new C1862l());
        mo115288c(new JsApiShareFinderProduct());
        mo115288c(new JsApiOpenFinderOrderCenter());
        mo115288c(new C1657c1());
        mo115288c(new C82982o());
        mo115288c(new C82973k());
        mo115288c(new JsApiAddVideoToFavorites());
        mo115288c(new JsApiAddFileToFavorites());
        mo115288c(new C55480f());
        mo115288c(new C55483h());
        mo115288c(new C55488m());
        mo115288c(new C82294b());
        mo115288c(new C55484i());
        mo115288c(new C82299e());
        mo115288c(new C82301j());
        mo115288c(new C82304n());
        mo115288c(new C55481g());
        mo115288c(new C82303l());
        mo115288c(new C86933e());
        mo115288c(new C82969i());
        mo115288c(new C90557z());
        mo115288c(new C82269c2());
        mo115288c(new C91276m());
        mo115288c(new C80058i());
        mo115288c(new C82805k());
        mo115288c(new C82392d());
        mo115288c(new JsApiNavigateToMiniProgramForFinderProductShare());
        mo115288c(new C82398i());
        mo115288c(new C82391c());
        mo115288c(new C86349f());
        mo115288c(new C86973q0());
        mo115288c(new C86977r1());
        mo115288c(new C82213b6());
        mo115288c(new C86986v0());
        mo115288c(new C82872p6());
        mo115288c(new C8134n0());
        mo115288c(new JsApiCheckIsSupportSoterAuthentication());
        mo115288c(new C1650c());
        mo115288c(new C1701i2());
        mo115288c(new C1694g2());
        C90291h.C90295d dVar = C84081q4.f245494c;
        mo115288c(new C90695c(0, dVar));
        mo115288c(new C90696d(0, dVar));
        mo115288c(new C90694b(C84081q4.f245495d));
        mo115288c(new C90697e());
        C90280d.C90282b bVar = C84081q4.f245496e;
        mo115288c(new C90512b(bVar));
        mo115288c(new C90513c(bVar));
        mo115288c(new C90514d());
        C90302k.C90305c cVar = C84081q4.f245497f;
        mo115288c(new C90828b(cVar));
        mo115288c(new C90829c(cVar));
        mo115288c(new C90830d());
        mo115288c(new C1885v6());
        mo115288c(new C82914r1());
        mo115288c(new C90820o());
        mo115288c(new C86962m1());
        mo115288c(new JsApiOperateRecorder());
        mo115288c(new C14253d());
        mo115288c(new C82082h());
        mo115288c(new C82085i());
        mo115288c(new C82099t());
        mo115288c(new C82088k());
        mo115288c(new C82090l());
        mo115288c(new C82086j());
        mo115288c(new C82102w());
        mo115288c(new JsApiNavigateBackApplication());
        mo115288c(new C82600o());
        mo115288c(new C82595m());
        mo115288c(new C82592j());
        mo115288c(new JsApiCheckBioEnrollment());
        mo115288c(new C91807d());
        mo115288c(new C91810e());
        mo115288c(new C91803c());
        mo115288c(new C91802b());
        mo115288c(new C91797a());
        mo115288c(new JsApiNavigateToDevMiniProgram());
        mo115288c(new JsApiNFCStartHCE(HCEService.class));
        mo115288c(new C82860i());
        mo115288c(new C82855e());
        mo115288c(new C82852c());
        mo115288c(new C82854d());
        mo115288c(new C91491j());
        mo115288c(new C91496m());
        mo115288c(new C91485g());
        mo115288c(new C91483f());
        mo115288c(new C91481e());
        mo115288c(new C91494l());
        mo115288c(new C91499o());
        mo115288c(new C91502p());
        mo115288c(new C91504q());
        mo115288c(new C91487h());
        mo115288c(new C91493k());
        mo115288c(new C91489i());
        mo115288c(new C86991y0());
        mo115288c(new C86929c1());
        mo115288c(new C86926a1());
        mo115288c(new C86951k());
        mo115288c(new C86957l1());
        mo115288c(new C90840g());
        mo115288c(new C90836d());
        mo115288c(new C90841h());
        mo115288c(new C90837e());
        mo115288c(new C14039u());
        mo115288c(new C14016b0());
        mo115288c(new C86974q1());
        C90311n.C90317f fVar = C84081q4.f245492a;
        mo115288c(new C90220f(0, fVar));
        mo115288c(new C90225m(fVar));
        mo115288c(new C1821q0());
        mo115288c(new C86943h0());
        mo115288c(new C90219e());
        mo115288c(new C90223g());
        mo115288c(new C13709d());
        mo115288c(new C82489v0());
        mo115288c(new C82497w0());
        mo115288c(new C82473r());
        mo115288c(new C82477s());
        mo115288c(new C82481t());
        mo115288c(new C82471q0());
        mo115288c(new C82465o0());
        mo115288c(new C82416c1());
        mo115288c(new C82431g0());
        mo115288c(new C82459m0());
        mo115288c(new C82486u0());
        mo115288c(new C82452k());
        mo115288c(new C82504z0());
        mo115288c(new C82488v());
        mo115288c(new C82470q());
        mo115288c(new C82441h0());
        mo115288c(new C82462n0());
        mo115288c(new C82412b1());
        mo115288c(new C82428f0());
        mo115288c(new C82456l0());
        mo115288c(new C82483t0());
        mo115288c(new C82449j());
        mo115288c(new C82502y0());
        mo115288c(new C82485u());
        mo115288c(new C82467p());
        mo115288c(new C82408a1());
        mo115288c(new C82468p0());
        mo115288c(new C82461n());
        mo115288c(new C82464o());
        mo115288c(new C82475r0());
        mo115288c(new C82479s0());
        mo115288c(new C82455l());
        mo115288c(new C82458m());
        mo115288c(new JsApiGetLabInfo());
        mo115288c(new JsApiSetLabInfo());
        mo115288c(new C82450j0());
        mo115288c(new C82453k0());
        mo115288c(new C91284a());
        mo115288c(new C91263b());
        mo115288c(new C91264c());
        mo115288c(new C1774p4());
        mo115288c(new C1708k4());
        mo115288c(new C1713l4());
        mo115288c(new C1884v4());
        mo115288c(new C1908x4());
        mo115288c(new C1914z4());
        mo115288c(new C1630b5());
        mo115288c(new C1700h5());
        mo115288c(new C1810l());
        mo115288c(new C1915z5());
        mo115288c(new C1707k3());
        mo115288c(new C1711l3());
        mo115288c(new C1759n3());
        mo115288c(new C1680f5());
        mo115288c(new C1575a4());
        mo115288c(new C22544i());
        mo115288c(new JsApiLaunchApplication());
        mo115288c(new JsApiLaunchApplicationDirectly());
        mo115288c(new JsApiAddNativeDownloadTask());
        mo115288c(new C82877e0());
        mo115288c(new JsApiAddDownloadTask());
        mo115288c(new JsApiAddDownloadTaskStraight());
        mo115288c(new JsApiQueryDownloadTask());
        mo115288c(new JsApiInstallDownloadTask());
        mo115288c(new JsApiPauseDownloadTask());
        mo115288c(new JsApiResumeDownloadTask());
        mo115288c(new JsApiGetInstallState());
        mo115288c(new JsApiCancelDownloadTask());
        mo115288c(new JsApiWriteCommData());
        mo115288c(new C90835c());
        mo115288c(new C86937f0());
        mo115288c(new C86940g0());
        mo115288c(new C89009a());
        mo115288c(new C89011b());
        mo115289d(C117836s0.m166249b());
        mo115288c(new C40467d());
        mo115288c(new C1588c());
        mo115288c(new C1706k2());
        mo115288c(new C29541i());
        mo115288c(new C1874u());
        mo115288c(new C82895j());
        mo115288c(new C82887b());
        mo115288c(new C82889c());
        mo115288c(new C82891d());
        mo115288c(new C82894f());
        mo115288c(new C89699b());
        mo115288c(new C89703c());
        mo115288c(new C89698a());
        mo115288c(new C82212b3());
        mo115288c(new C82270c3());
        mo115288c(new C40475h());
        mo115288c(new C68618i());
        mo115288c(new C82900n());
        mo115288c(new C1838k());
        mo115288c(new C28613b());
        mo115288c(new C29531a());
        mo115288c(new C1805j());
        mo115288c(new C1820q());
        mo115288c(new C1876t4());
        mo115288c(new C1671e2());
        mo115288c(new JsApiOpenTextStateMessage());
        mo115288c(new C1795c0());
        mo115288c(new C1803i());
        mo115288c(new C1815n0());
        mo115288c(new C1828u());
        mo115288c(new C86534a());
        mo115288c(new C86548f());
        mo115288c(new C86537c());
        mo115288c(new C86536b());
        mo115288c(new C86547e());
        mo115288c(new C86546d());
        mo115288c(new C86554h());
        mo115288c(new C107280l());
        mo115288c(new C86552g());
        mo115288c(new C86565m());
        mo115288c(new C90227p());
        mo115288c(new C48418i());
        mo115288c(new C82519g7());
        mo115288c(new C22368l());
        mo115288c(new C89383g());
        mo115288c(new C89388l());
        mo115288c(new C89369a());
        mo115288c(new C82359b());
        mo115288c(new C80068q());
        mo115288c(new C80063m());
        mo115288c(new C82353a());
        mo115288c(new C80065o());
        mo115288c(new C80061k());
        mo115288c(new C80055h());
        mo115288c(new C80066p());
        mo115288c(new C80062l());
        mo115288c(new C80050f());
        mo115288c(new C17988a());
        mo115288c(new C17990g());
        mo115288c(new C83054f());
        mo115288c(new C83051d());
        mo115288c(new C90071e());
        mo115288c(new C90075i());
        mo115288c(new C90074h());
        mo115288c(new C90073g());
        mo115288c(new C88248e());
        mo115288c(new C88252i());
        mo115288c(new C88249f());
        mo115288c(new C88251h());
        mo115288c(new C88250g());
        mo115288c(new C88789d());
        mo115288c(new C88792g());
        mo115288c(new C88790e());
        mo115288c(new C88791f());
        mo115288c(new C1709k5());
        mo115288c(new C82447i0());
        mo115288c(new JsApiPrivateAddContact());
        mo115288c(new C1762o0());
        mo115288c(new C80054g());
        mo115288c(new C80064n());
        mo115288c(new C80060j());
        mo115288c(new C82783z0());
        mo115288c(new C86980s1());
        mo115288c(new C86982t0());
        mo115288c(new C82965h());
        mo115288c(new JsApiChooseMultiMedia());
        mo115288c(new JsApiRequestSubscribeMessage());
        mo115288c(new C83038t3());
        mo115288c(new JsApiSetBackgroundFetchToken());
        mo115288c(new C1633a());
        mo115288c(new JsApiTriggerBackgroundFetch());
        mo115288c(new C1895m());
        mo115288c(new C55527g());
        mo115288c(new C83067i());
        mo115288c(new C55531o());
        mo115288c(new C55529k());
        mo115288c(new C1825s0());
        mo115288c(new JsApiAddDownloadTaskForNative());
        mo115288c(new JsApiPauseDownloadTaskForNative());
        mo115288c(new JsApiResumeDownloadTaskForNative());
        mo115288c(new JsApiQueryDownloadTaskForNative());
        mo115288c(new JsApiInstallDownloadTaskForNative());
        mo115288c(new JsApiGetInstallStateForNative());
        mo115288c(new JsApiLaunchApplicationForNative());
        mo115288c(new JsApiCancelDownloadTaskForNative());
        mo115288c(new C1609j());
        mo115288c(new JsApiJumpDownloaderWidgetForNative());
        mo115288c(new C82214b7());
        mo115288c(new C90004e());
        mo115288c(new C13011c());
        mo115288c(new C89025e());
        mo115288c(new C1878t6());
        mo115289d(C38232f.m41813a());
        mo115288c(new C82543i5());
        mo115288c(new C83135z1());
        mo115288c(new JsApiGetFinderAccount());
        mo115288c(new C82509b());
        mo115288c(new JsApiDeleteFinderDataItem());
        mo115288c(new C1692d());
        mo115288c(new C55510h());
        mo115288c(new C55508f());
        mo115288c(new C55511i());
        mo115288c(new C68615j());
        mo115288c(new JsApiFetchSendingAndFailProfileFeed());
        mo115288c(new JsApiFinderEndorsementFinished());
        mo115288c(new C55513k());
        mo115288c(new C11221d());
        mo115288c(new C1574a3());
        mo115288c(new C7735a());
        mo115288c(new C1909x5());
        mo115288c(new C1629b4());
        mo115288c(new C86949j0());
        mo115288c(new C86956l0());
        mo115288c(new C82971j());
        mo115288c(new C83049v5());
        mo115288c(new JsApiHandleMpChannelAction());
        mo115288c(new JsApiOpenWebViewUseFastLoad());
        mo115288c(new C90819m());
        mo115288c(new C90822q());
        mo115288c(new C90821p());
        mo115288c(new JsApiAddToFavorites());
        mo115288c(new C82980n());
        mo115288c(new C82986r());
        mo115288c(new C82956d());
        mo115288c(new C82992u());
        mo115288c(new C82399k());
        mo115288c(new C82390b());
        mo115288c(new JsApiRemoveSplashScreenshot());
        mo115288c(new C1791a0());
        mo115288c(new C1807j0());
        mo115288c(new C1824s());
        mo115288c(new JsApiOnWebPageUrlExposed());
        mo115288c(new C88585e());
        mo115288c(new C88592k());
        mo115288c(new C87267c());
        mo115288c(new C87268e());
        mo115288c(new C87269g());
        mo115288c(new C87271b());
        mo115288c(new C22654c());
        mo115288c(new C22656e());
        mo115288c(new C22658g());
        mo115288c(new C22659h());
        mo115288c(new C22657f());
        mo115288c(new C22655d());
        mo115288c(new C1769p1());
        mo115288c(new C1840q1());
        mo115288c(new C1841q2());
        mo115288c(new C82418d0());
        mo115288c(new C82424e0());
        mo115288c(new C82414c0());
        mo115288c(new C9465e());
        mo115288c(new C9464d());
        mo115288c(new C82385f3());
        mo115288c(new C14196a());
        mo115288c(new C82590h());
        mo115288c(new C83132y2());
        mo115288c(new JsApiUpdateAppContact());
        mo115288c(new C40461l());
        mo115288c(new C1614a0());
        mo115288c(new C89245a());
        mo115288c(new C82379e6());
        mo115288c(new C82867o5());
        mo115288c(new C87551i());
        mo115288c(new C87544c());
        mo115288c(new C8538a());
        mo115288c(new C87549g());
        mo115288c(new C87545d());
        mo115288c(new C8539k());
        mo115288c(new C87552j());
        mo115288c(new C87547f());
        mo115288c(new C82207x());
        mo115288c(new C7727h());
        mo115288c(new C86341b());
        mo115288c(new C86342c());
        mo115288c(new C86938f1());
        mo115288c(new C86984v());
        mo115288c(new C11390e());
        mo115288c(new C11387b());
        mo115288c(new C11388c());
        mo115288c(new C1704j3());
        mo115288c(new C1844q5());
        mo115288c(new C86908a());
        mo115288c(new C86913d());
        mo115288c(new C86911c());
        mo115288c(new C86910b());
        mo115288c(new C53191d());
        mo115288c(new C53188a());
        mo115288c(new JsApiEcdSaSign());
        mo115288c(new C1710l2());
        mo115288c(new C1758n2());
        mo115288c(new C83069c());
        mo115288c(new C83081k());
        mo115288c(new C83077f());
        mo115288c(new C83076e());
        mo115288c(new C83075d());
        mo115288c(new JsApiRequestSRFile());
        mo115288c(new C90906b());
        mo115288c(new C9471a());
        mo115288c(new C1889w5());
        mo115288c(new JsApiGetWeAppNewTipsInfo());
        mo115288c(new C1728m2());
        mo115288c(new C91530k());
        mo115288c(new C91533n());
        mo115288c(new C91531l());
        mo115288c(new C91532m());
        mo115288c(new JsApiGamelifeManager());
        mo115288c(new C1684x0());
        mo115288c(new C90238c());
        mo115288c(new C90241f());
        mo115288c(new C90242g());
        mo115288c(new C82341m());
        mo115288c(new C12879b());
        mo115288c(new C1678f4());
        mo115288c(new C91675a());
        mo115288c(new C91681d());
        mo115288c(new C91680c());
    }
}
