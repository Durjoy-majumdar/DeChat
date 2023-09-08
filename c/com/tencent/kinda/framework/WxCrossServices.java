package com.tencent.kinda.framework;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import b63.C113146l;
import cc0.C92411b;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.framework.boot.KindaApp;
import com.tencent.kinda.framework.module.impl.KindaJSEvent;
import com.tencent.kinda.framework.sns_cross.ISnsSceneService;
import com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback;
import com.tencent.kinda.framework.sns_cross.SnsSceneServiceFactory;
import com.tencent.kinda.framework.widget.tools.ActivityController;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KJSEvent;
import com.tencent.kinda.gen.KindaJSEventType;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AppActiveEvent;
import com.tencent.p014mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.autogen.events.WalletLockProtectEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.autogen.events.WebViewWillCloseWindowEvent;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.opensdk.modelpay.PayReq;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1575a4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C68622z3;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.C68866c0;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineEntranceUI;
import com.tencent.p014mm.plugin.remittance.model.MsgCheckTaskMgr;
import com.tencent.p014mm.plugin.remittance.p098ui.C70952u1;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceNewBaseUI;
import com.tencent.p014mm.plugin.remittance.p098ui.WalletMerchantPayUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.teenmode.p111ui.SettingsTeenModeMain;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C5725m0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71624d1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71629g0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71631h0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71633i0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71637j0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71639l0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceFetchUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceManagerUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceSaveUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletKnowLqtFullScreenVideoUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtBalanceAutoTransferUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtDetailUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtPlanBeforeHomeUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletLoanRepaymentUI;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.RealNameBundle;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.ibg.WalletIbgOrderInfoUI;
import com.tencent.p014mm.plugin.wallet_index.p127ui.C72560c;
import com.tencent.p014mm.plugin.wallet_index.p127ui.OrderHandlerUI;
import com.tencent.p014mm.plugin.wallet_index.p127ui.WalletBrandUI;
import com.tencent.p014mm.plugin.wallet_index.p127ui.WalletIapUI;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75119h0;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75226r;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60200t1;
import id2.C76313t;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import k20.C9556a;
import ke3.C88144b;
import m63.C76750e;
import n63.C76835c;
import nj3.C76879j;
import ny2.r$$b;
import ny2.r$$c;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import oi2.C77010f;
import p1035sf.C90183c;
import p156gj.C87203t;
import p206nj.C88957l;
import p281yz.C79173v;
import p447aw.C103918d;
import p517fa.C31977k;
import p564iq.C87790d;
import p702ts.C118505d;
import p702ts.C78083b;
import p702ts.C78085c;
import pv2.C77290d;
import qo3.C89779i0;
import te3.C77963l1;
import te3.iy4;
import ub3.C78144b;
import v53.C78339d;
import vt1.C78473a;
import yq3.C79144b;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

@C86522b(onProcess = {C80625v0.MATCH_MM})
public class WxCrossServices extends C86301e implements C76324c, C76313t.C76314b {
    public static final int REPORT_IDKEY = 1004;
    private static final String SINGLE_BYTE_CHARSET_FOR_SAVE = "ISO-8859-1";
    public static final String TAG = "MicroMsg.WxCrossServices";
    private static final String TAG_SCAN_QR_CODE_PAY = "tag_scan_qrcode_pay";
    public static MaybeCrashReport report = new MaybeCrashReport();
    private IListener<AppActiveEvent> appListener;
    public JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryEvent;
    /* access modifiers changed from: private */
    public IListener<JsApiOfflineUserBindQueryResultCallBackEvent> jsApiOfflineUserBindQueryListener;
    /* access modifiers changed from: private */
    public float lastLat;
    /* access modifiers changed from: private */
    public float lastLng;
    /* access modifiers changed from: private */
    public C89779i0 mDialogForScanPay;
    /* access modifiers changed from: private */
    public boolean mInitFlag = false;
    private C29060q netListener;
    private C92411b.C92412a onLocationGet;
    /* access modifiers changed from: private */
    public C78083b.C78084a upAddr;
    /* access modifiers changed from: private */
    public IListener<WalletLockProtectEvent> walletLockListener;

    public static class MaybeCrashReport {
        public void judgeReport() {
            long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_ENTER_PAY_TIME_LONG_SYNC, 0L)).longValue();
            if (longValue > 0) {
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_ENTER_PAY_SCENE_INT_SYNC, 0)).intValue();
                C115669n.INSTANCE.mo160131h(20560, Integer.valueOf(intValue), Long.valueOf(longValue));
            }
            reset();
        }

        public void markEnterPay(int i) {
            ((C31977k) C86312j.m106911c(C31977k.class)).requireAccountInitialized();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_ENTER_PAY_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis()));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_ENTER_PAY_SCENE_INT_SYNC, Integer.valueOf(i));
        }

        public void reset() {
            ((C31977k) C86312j.m106911c(C31977k.class)).requireAccountInitialized();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_ENTER_PAY_TIME_LONG_SYNC, 0L);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_ENTER_PAY_SCENE_INT_SYNC, 0);
        }
    }

    static {
        KindaContext.initStack();
    }

    public WxCrossServices() {
        C40008f fVar = C40008f.f107254d;
        this.appListener = new IListener<AppActiveEvent>(fVar) {
            {
                this.__eventId = 2123042947;
            }

            public boolean callback(final AppActiveEvent appActiveEvent) {
                if (appActiveEvent == null || appActiveEvent.f78710d == null) {
                    return false;
                }
                MMHandlerThread.postToMainThread(new Runnable() {
                    public void run() {
                        if (appActiveEvent.f78710d.f78711a) {
                            KindaApp.appKinda().applicationEnterForeground();
                            return;
                        }
                        KindaApp.appKinda().applicationEnterBackground();
                        WxCrossServices.report.reset();
                    }
                });
                return false;
            }
        };
        this.netListener = new C29060q.C29061a() {
            public void onNetworkChange(int i) {
                C79144b.m95773a().getClass();
                if (WxCrossServices.this.mInitFlag && KindaApp.appKinda().isInAnyUseCase()) {
                    ITransmitKvData create = ITransmitKvData.create();
                    Context context = MMApplicationContext.getContext();
                    if (!NetStatusUtil.isConnected(context)) {
                        create.putString("type", "NON_NETWORK");
                    } else if (NetStatusUtil.isWifi(context)) {
                        create.putString("type", "WIFI");
                        ConnectivityCompat.Companion companion = ConnectivityCompat.Companion;
                        String wiFiSsid = companion.getWiFiSsid();
                        String wiFiBssid = companion.getWiFiBssid();
                        if (!(wiFiSsid == null || wiFiBssid == null)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(TPDownloadProxyEnum.USER_SSID, wiFiSsid);
                            hashMap.put(TPDownloadProxyEnum.USER_BSSID, wiFiBssid);
                            C77963l1 a = C113146l.m154803a(hashMap);
                            create.putString("info", a.f227798n);
                            create.putString("info_key", a.f227799o);
                        }
                    } else {
                        if (NetStatusUtil.is4G(context)) {
                            create.putString("type", "4G");
                        } else if (NetStatusUtil.is3G(context)) {
                            create.putString("type", "3G");
                        } else if (NetStatusUtil.is2G(context)) {
                            create.putString("type", "2G");
                        } else {
                            create.putString("type", "UNKNOW");
                        }
                        List<NetStatusUtil.CellInfo> cellInfoList = NetStatusUtil.getCellInfoList(context);
                        if (cellInfoList.size() > 0) {
                            NetStatusUtil.CellInfo cellInfo = cellInfoList.get(0);
                            String str = cellInfo.cellid;
                            String str2 = cellInfo.mcc;
                            String str3 = cellInfo.mnc;
                            if (!(str == null || str2 == null || str3 == null)) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("cellid", str);
                                hashMap2.put("mcc", str2);
                                hashMap2.put("mnc", str3);
                                C77963l1 a2 = C113146l.m154803a(hashMap2);
                                create.putString("info", a2.f227798n);
                                create.putString("info_key", a2.f227799o);
                            }
                        }
                    }
                    KindaApp.appKinda().networkChange(create);
                }
            }
        };
        this.walletLockListener = new IListener<WalletLockProtectEvent>(fVar) {
            {
                this.__eventId = 1842411039;
            }

            public boolean callback(WalletLockProtectEvent walletLockProtectEvent) {
                if (walletLockProtectEvent.f310017d.f310019a != 5) {
                    return false;
                }
                ITransmitKvData create = ITransmitKvData.create();
                create.putBool("check_wallet_lock_cancel", true);
                KindaApp.appKinda().notifyAllUseCases(create);
                return false;
            }
        };
        this.jsApiOfflineUserBindQueryEvent = null;
        this.jsApiOfflineUserBindQueryListener = new IListener<JsApiOfflineUserBindQueryResultCallBackEvent>(fVar) {
            {
                this.__eventId = 1878810586;
            }

            public boolean callback(JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent) {
                JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent2 = jsApiOfflineUserBindQueryResultCallBackEvent;
                if (!WxCrossServices.this.isUseCaseAlive("offline")) {
                    return false;
                }
                WxCrossServices.this.jsApiOfflineUserBindQueryEvent = jsApiOfflineUserBindQueryResultCallBackEvent2;
                JsApiOfflineUserBindQueryResultCallBackEvent.C67718a aVar = jsApiOfflineUserBindQueryResultCallBackEvent2.f193679d;
                Log.m105925i(WxCrossServices.TAG, "on JsApiOfflineUserBindQueryResultCallBackEvent callback，appid: %s, package: %s", aVar.f193681a, aVar.f193686f);
                JsApiOfflineUserBindQueryResultCallBackEvent.C67718a aVar2 = jsApiOfflineUserBindQueryResultCallBackEvent2.f193679d;
                C78339d dVar = new C78339d(aVar2.f193681a, aVar2.f193685e, aVar2.f193684d, aVar2.f193686f, aVar2.f193688h, aVar2.f193687g, 23, aVar2.f193682b, aVar2.f193683c, C1575a4.NAME, 1137);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123455a(580, new C11385n() {
                    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                        if (yVar instanceof C78339d) {
                            if (i == 0 && i2 == 0) {
                                Log.m105924i(WxCrossServices.TAG, "onScene end NetSceneCheckPayJsapi ok");
                                if (WxCrossServices.this.jsApiOfflineUserBindQueryEvent != null) {
                                    ITransmitKvData create = ITransmitKvData.create();
                                    create.putString("package", WxCrossServices.this.jsApiOfflineUserBindQueryEvent.f193679d.f193686f);
                                    create.putString("func_name", "offline_request_bindquery");
                                    create.putJSEvent("JSEvent", new KJSEvent() {
                                        public void kindaCloseWebViewImpl(boolean z, VoidCallback voidCallback) {
                                        }

                                        public void kindaEndWithResult(String str, HashMap<String, String> hashMap) {
                                            JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent = WxCrossServices.this.jsApiOfflineUserBindQueryEvent;
                                            if (jsApiOfflineUserBindQueryResultCallBackEvent != null) {
                                                jsApiOfflineUserBindQueryResultCallBackEvent.f193680e.f193693a = str;
                                                ((C68622z3) jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193692l).run();
                                                WxCrossServices.this.jsApiOfflineUserBindQueryEvent = null;
                                            }
                                        }

                                        public KindaJSEventType kindaGetType() {
                                            return KindaJSEventType.TINYAPP;
                                        }
                                    });
                                    KindaApp.appKinda().notifyAllUseCases(create);
                                }
                            } else {
                                Log.m105924i(WxCrossServices.TAG, "onScene end NetSceneCheckPayJsapi fail");
                                JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent = WxCrossServices.this.jsApiOfflineUserBindQueryEvent;
                                if (jsApiOfflineUserBindQueryResultCallBackEvent != null) {
                                    jsApiOfflineUserBindQueryResultCallBackEvent.f193680e.f193693a = "fail:NetSceneCheckPayJsapi";
                                    ((C68622z3) jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193692l).run();
                                    WxCrossServices.this.jsApiOfflineUserBindQueryEvent = null;
                                }
                            }
                            C86709a0.m107528h();
                            C86709a0.m107529k().f251779b.mo123470p(580, this);
                        }
                    }
                });
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(dVar);
                return false;
            }
        };
        this.upAddr = new C78083b.C78084a() {
            public void onLocationAddr(Addr addr) {
                String str;
                Log.m105925i(WxCrossServices.TAG, "on location addr get, prov is %s, city is %s, disc is %s", addr.f343958f, addr.f343959g, addr.f343961i);
                ((C78085c) C86312j.m106911c(C78085c.class)).oe0().mo108055b(WxCrossServices.this.upAddr);
                iy4 iy4 = new iy4();
                iy4.f135758d = addr.f343969t;
                iy4.f135759e = addr.f343970u;
                iy4.f135760f = addr.f343958f;
                iy4.f135761g = addr.f343959g;
                iy4.f135762h = addr.f343961i;
                try {
                    str = new String(iy4.toByteArray(), "ISO-8859-1");
                } catch (IOException e) {
                    Log.m105920e(WxCrossServices.TAG, "save config exp, " + e.getLocalizedMessage());
                    str = "";
                }
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, str);
            }
        };
    }

    private void initIfNeed() {
        tryLoadLibrary();
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        if (aVar != null) {
            Log.m105924i(TAG, "IFingerPrintMgr is not null");
            aVar.mo107909dx();
        }
        if (!this.mInitFlag) {
            this.appListener.alive();
            C86709a0.m107529k().mo121126a(this.netListener);
            KindaApp.instance().onCreate();
            this.mInitFlag = true;
        }
        ActivityController.resetFlag();
    }

    public static boolean isKindaEnabled() {
        return ((C87790d) C86312j.m106911c(C87790d.class)).isInstalled("kinda");
    }

    public static void judgeReprot() {
        report.judgeReport();
    }

    private void preparePayDesk() {
        C113146l.m154807e(5);
    }

    public static void tryLoadLibrary() {
        if (isKindaEnabled()) {
            C88957l.m111078n("wechatxlog");
            C88957l.m111078n("kinda_android");
        }
    }

    public boolean TenPaySDKABTestKindaEnable() {
        C79144b.m95773a().getClass();
        return true;
    }

    public boolean canOpenKindaCashier(Context context) {
        initIfNeed();
        C79144b.m95773a().getClass();
        if (KindaApp.appKinda().getIsPaying()) {
            Log.m105924i("canOpenKindaCashier", "is paying");
            return false;
        }
        Log.m105924i("canOpenKindaCashier", "not paying");
        KindaApp.appKinda().stopUseCase("rootUseCase");
        return true;
    }

    public void checkIfNeedRequestUserBindqueryWhenUnBindCard(String str) {
        KindaApp.appKinda().checkIfNeedRequestUserBindqueryWhenUnBindCard(str);
    }

    public void checkIfNeedUpdateOfflinePayToken() {
        KindaApp.appKinda().checkIfNeedUpdateOfflinePayToken();
    }

    public void ensureLibraryLoaded() {
        tryLoadLibrary();
    }

    public long getColorByMode(long j, long j2) {
        DynamicColor dynamicColor = new DynamicColor();
        dynamicColor.mNormalColor = j;
        dynamicColor.mDarkmodeColor = j2;
        return ColorUtil.getColorByMode(dynamicColor, false);
    }

    public Activity getCrossActivity() {
        return KindaContext.getTopOrUIPageFragmentActivity();
    }

    public void handleHKNativeCashier(Context context, String str, final C76324c.C76326b bVar) {
        ITransmitKvData create = ITransmitKvData.create();
        if (!Util.isNullOrNil(str)) {
            create.putString("attach", str);
        }
        KindaApp.appKinda().startUseCase("hkcashier", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                int i = iTransmitKvData.getInt("retcode");
                C76324c.C76326b bVar = bVar;
                if (bVar != null) {
                    bVar.mo97424a(i);
                }
            }
        });
    }

    public void handleHKOfflineNewXmlMsg(String str) {
        int i;
        Map<String, String> parseXml = XmlParser.parseXml(str, "sysmsg", (String) null);
        if (parseXml != null && (i = Util.getInt(parseXml.get(".sysmsg.paymsg.PayMsgType"), -1)) == 51) {
            int i2 = Util.getInt(parseXml.get(".sysmsg.paymsg.HKOfflineMsgType"), 0);
            ITransmitKvData create = ITransmitKvData.create();
            create.putInt("PayMsgType", i);
            create.putInt("hk_msg_type", i2);
            create.putString("hk_msg_info", parseXml.get(".sysmsg.paymsg.HKOfflineMsgInfo"));
            create.putString("hk_msg_extInfo", parseXml.get(".sysmsg.paymsg.HKOfflineMsgExtInfo"));
            create.putString("func_name", "hkoffline_push_newxml");
            KindaApp.appKinda().notifyHKOfflineNewXml(create);
        }
    }

    public boolean isOfflineReady() {
        return KindaApp.appKinda().checkOfflineReady();
    }

    public boolean isSwitch2InWxAppPay(String str) {
        if (str != null) {
            return !str.startsWith("ts_");
        }
        Log.m105924i(TAG, "isSwitch2InWxAppPay prepayId is null");
        return false;
    }

    public boolean isUseCaseAlive(String str) {
        C79144b.m95773a().getClass();
        return KindaApp.appKinda().isUseCaseAlive(str);
    }

    public void notifyAllUseCase(Object obj) {
        Log.m105924i(TAG, "start common notifyAllUseCase");
        if (obj instanceof ITransmitKvData) {
            KindaApp.appKinda().notifyAllUseCases((ITransmitKvData) obj);
        }
    }

    public void notifyUploadCardSuccess() {
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("upload_id_success_notifycation", "1");
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().notifyAllUseCases(create);
    }

    public boolean onNotify(C76313t.C76317e eVar) {
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("PayMsgType", eVar.f223559a);
        create.putString("ack_key", eVar.f223561c);
        create.putString("req_key", eVar.f223560b);
        create.putString("func_name", "offline_push_xml");
        int i = eVar.f223559a;
        if (i == 20) {
            C76313t.C76323k kVar = (C76313t.C76323k) eVar;
            create.putInt("guide_block", kVar.f223586d.f223585f ? 1 : 0);
            create.putInt("guide_flag", Integer.parseInt(kVar.f223586d.f223580a));
            create.putString("guide_wording", kVar.f223586d.f223581b);
            create.putString("left_button_wording", kVar.f223586d.f223582c);
            create.putString("right_button_wording", kVar.f223586d.f223583d);
            create.putString("upload_credit_url", kVar.f223586d.f223584e);
            KindaApp.appKinda().notifyAllUseCases(create);
            return false;
        } else if (i == 5) {
            C76313t.C76319g gVar = (C76313t.C76319g) eVar;
            create.putInt("pay_cmd", gVar.f223568i);
            create.putInt("cftretcode", Util.safeParseInt(gVar.f223563d));
            create.putInt("wxretcode", Util.safeParseInt(gVar.f223565f));
            create.putString("cftretmsg", gVar.f223564e);
            create.putString("wxretmsg", gVar.f223566g);
            create.putString("error_detail_url", gVar.f223567h);
            create.putString("error_icon_url", gVar.f223569j);
            create.putLong("error_icon_lcolor", gVar.f223570k);
            create.putLong("error_icon_dcolor", gVar.f223571l);
            KindaApp.appKinda().notifyAllUseCases(create);
            return false;
        } else if (i == 6) {
            KindaApp.appKinda().notifyAllUseCases(create);
            return false;
        } else if (i == 8) {
            KindaApp.appKinda().notifyAllUseCases(create);
            return false;
        } else if (i == 4) {
            KindaApp.appKinda().notifyAllUseCases(create);
            return false;
        } else if (i == 23) {
            KindaApp.appKinda().notifyAllUseCases(create);
            return false;
        } else if (i == 24) {
            KindaApp.appKinda().notifyAllUseCases(create);
            return false;
        } else if (i != 42) {
            return false;
        } else {
            create.putString("PayMsgInfo", ((C76313t.C76316d) eVar).f223558d);
            KindaApp.appKinda().notifyAllUseCases(create);
            return false;
        }
    }

    public void requestHKCashierNotify(Context context, String str) {
        ITransmitKvData create = ITransmitKvData.create();
        if (!Util.isNullOrNil(str)) {
            create.putString("jsapi_package", str);
        }
        create.putString("func_name", "requestHKCashier");
        KindaApp.appKinda().notifyAllUseCases(create);
    }

    public void startBindCardUseCase(Context context, final Bundle bundle) {
        Class cls = C79173v.class;
        C115669n.INSTANCE.idkeyStat(1004, 16, 1, false);
        Log.m105925i(TAG, "startBindCardUseCase %s", Util.getStack());
        initIfNeed();
        boolean z = bundle.getInt("key_bind_scene", -1) == 1;
        int i = bundle.getInt("reg_flag", -1);
        if (i == -1) {
            i = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_is_reg;
        }
        boolean z2 = bundle.getInt("key_bind_scene") == 8;
        int i2 = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91338t() ? 2 : 1;
        String q = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91335q();
        ITransmitKvData create = ITransmitKvData.create();
        create.putBool("bPresent", z);
        create.putInt("regFlag", i);
        create.putInt("cardUserFlag", i2);
        create.putString("trueName", q);
        create.putInt("addPayCardScene", bundle.getInt("key_bind_scene", -1));
        create.putInt("bindScene", bundle.getInt("key_bind_scene", -1));
        create.putInt("realnameScene", bundle.getInt("entry_scene", -1));
        create.putBool("isWebankLoadScene", z2);
        create.putString("password", bundle.getString("key_pwd1"));
        if (!bundle.getString("kreq_token", "").isEmpty()) {
            create.putString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, bundle.getString("kreq_token"));
        }
        if (!bundle.getString("usertoken", "").isEmpty()) {
            create.putString("usertoken", bundle.getString("usertoken"));
        }
        create.putBool("canChangeRealname", bundle.getBoolean("key_bind_show_change_card", false));
        create.putBool("canPassPwd", bundle.getBoolean("key_bind_card_can_pass_pwd", false));
        create.putString("usertoken", bundle.getString("key_bind_card_user_token", ""));
        RealNameBundle realNameBundle = null;
        if (bundle.containsKey("realname_verify_process_bundle")) {
            realNameBundle = (RealNameBundle) bundle.getParcelable("realname_verify_process_bundle");
        }
        if (realNameBundle != null) {
            create.putBool("isNewRealname", true);
            create.putString("rn_realname_scene", bundle.getString("key_realname_scene", ""));
            create.putString("rn_true_name", realNameBundle.f209301d);
            create.putString("rn_cre_type", "" + realNameBundle.f209304g);
            create.putString("rn_cre_name", realNameBundle.f209305h);
            create.putString("rn_identify_card_origin", realNameBundle.f209302e);
            create.putString("rn_encry_identity_card", realNameBundle.f209303f);
            create.putInt("rn_creid_renewal_origin", realNameBundle.f209311q);
            create.putInt("rn_cre_expire_date_origin_year", realNameBundle.f209313s);
            create.putInt("rn_cre_expire_date_origin_month", realNameBundle.f209314t);
            create.putInt("rn_cre_expire_date_origin_day", realNameBundle.f209315u);
            create.putInt("rn_cre_effect_date_origin_year", realNameBundle.f209296E);
            create.putInt("rn_cre_effect_date_origin_month", realNameBundle.f209297F);
            create.putInt("rn_cre_effect_date_origin_day", realNameBundle.f209298G);
            create.putInt("rn_birth_date_origin_year", realNameBundle.f209317w);
            create.putInt("rn_birth_date_origin_month", realNameBundle.f209318x);
            create.putInt("rn_birth_date_origin_day", realNameBundle.f209319y);
            create.putString("rn_country", realNameBundle.f209307j);
            create.putString("rn_province", realNameBundle.f209308n);
            create.putString("rn_city", realNameBundle.f209309o);
            create.putString("rn_areaStr", realNameBundle.f209310p);
            create.putString("rn_profession_type", "" + realNameBundle.f209306i.f209291e);
            create.putString("rn_profession_name", realNameBundle.f209306i.f209290d);
            create.putString("rn_iso_country_code", realNameBundle.f209320z);
            create.putInt("rn_sex", realNameBundle.f209300I);
            create.putString("rn_detail_address", realNameBundle.f209294C);
            boolean z3 = bundle.getBoolean("realname_verify_process_need_face", false);
            create.putBool("rn_is_need_face", z3);
            if (z3) {
                create.putInt("rn_scene", (int) bundle.getLong("realname_verify_process_face_scene"));
                create.putString("rn_package", bundle.getString("realname_verify_process_face_package"));
                create.putString("rn_package_sign", bundle.getString("realname_verify_process_face_package_sign"));
            }
            create.putString("rn_session_id", bundle.getString("key_realname_sessionid", ""));
        }
        create.putInt("bindCardScene", bundle.getInt("key_bind_scene"));
        create.putString("bindCardUuid", C75133p0.f221066c);
        create.putString(MJTextResolver.KEY_DEVICE_NAME, C87203t.m108275k());
        create.putString("deviceType", "");
        create.putBool("BindCardV2", true);
        create.putString("nativeReportSessionId", C75226r.m90201a());
        create.putBool("marketingSwitchClosed", bundle.getBoolean("key_marketing_switch_closed", false));
        create.putBool("realname_is_minor_bindcard", bundle.getBoolean("realname_is_minor_bindcard", false));
        KindaApp.appKinda().startUseCase("addPayCard", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                Log.m105924i(WxCrossServices.TAG, "startBindCardUseCase callback");
                KindaBindCardEvent kindaBindCardEvent = new KindaBindCardEvent();
                if (iTransmitKvData.getInt("retcode") == 1) {
                    KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
                    aVar.f193699a = true;
                    aVar.f193701c = iTransmitKvData.getString("bind_serial");
                    kindaBindCardEvent.f193698d.f193702d = iTransmitKvData.getString("password");
                    kindaBindCardEvent.f193698d.f193703e = iTransmitKvData.getString("bank_type");
                    kindaBindCardEvent.f193698d.f193704f = iTransmitKvData.getString("mobile_no");
                    kindaBindCardEvent.f193698d.f193705g = iTransmitKvData.getString("realname_title");
                    kindaBindCardEvent.f193698d.f193706h = iTransmitKvData.getString("realname_desc");
                    kindaBindCardEvent.f193698d.f193707i = iTransmitKvData.getString("realname_btn_title");
                    kindaBindCardEvent.f193698d.f193708j = iTransmitKvData.getString("realname_err_jump_page");
                } else if (iTransmitKvData.getInt("retcode") == -1) {
                    kindaBindCardEvent.f193698d.f193699a = false;
                }
                kindaBindCardEvent.f193698d.f193700b = bundle.getBoolean("key_need_bind_response", false);
                kindaBindCardEvent.publish();
            }
        });
    }

    public void startFaceCheckUseCase(String str, Intent intent, final C76324c.C76325a aVar) {
        Log.m105925i(TAG, "startFaceCheckUseCase， url：%s", str);
        if (!Util.isNullOrNil(str)) {
            ITransmitKvData create = ITransmitKvData.create();
            str.getClass();
            if (str.equals("faceCheckFrontUseCase")) {
                create.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, intent.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0));
                create.putString("package", intent.getStringExtra("package"));
                create.putString("package_sign", intent.getStringExtra("package_sign"));
                create.putString("other_verify_title_front", intent.getStringExtra("other_verify_title_front"));
                KindaApp.appKinda().startUseCase("faceCheckFrontUseCase", create, new UseCaseCallback() {
                    public void call(ITransmitKvData iTransmitKvData) {
                        Intent intent = new Intent();
                        intent.putExtra(StateEvent.Name.ERROR_CODE, iTransmitKvData.getInt(StateEvent.Name.ERROR_CODE));
                        intent.putExtra("error_msg", iTransmitKvData.getString("error_msg"));
                        intent.putExtra("need_show_protocal", iTransmitKvData.getInt("need_show_protocal"));
                        aVar.mo5281a(intent);
                    }
                });
            } else if (!str.equals("faceCheckResultUseCase")) {
                Log.m105924i(TAG, "unknown type");
            } else {
                create.putString("error_msg", intent.getStringExtra("error_msg"));
                create.putString("error_tips", intent.getStringExtra("error_tips"));
                create.putBool("can_retry", intent.getBooleanExtra("can_retry", true));
                create.putString("other_verify_title", intent.getStringExtra("other_verify_title"));
                KindaApp.appKinda().startUseCase("faceCheckResultUseCase", create, new UseCaseCallback() {
                    public void call(ITransmitKvData iTransmitKvData) {
                        Intent intent = new Intent();
                        intent.putExtra("error_msg", iTransmitKvData.getString("error_msg"));
                        intent.putExtra("other_verify_title_state", iTransmitKvData.getString("other_verify_title_state"));
                        aVar.mo5281a(intent);
                    }
                });
            }
        }
    }

    public void startFastBindUseCase(String str, int i, final Runnable runnable) {
        Log.m105924i(TAG, "start startFastBindUseCase");
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("qr_code", str);
        create.putInt("channel", i);
        create.putInt("bind_card_entrance_scene", 2);
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("fastbindcard", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    public void startHKOfflinePrePay(Context context, int i) {
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("entry_scene", i);
        KindaApp.appKinda().startUseCase("hkoffline", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
            }
        });
    }

    public void startHKOfflinePrePayFromJsApi(Context context, String str) {
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("entry_scene", 3);
        if (!Util.isNullOrNil(str)) {
            create.putString("jsapi_package", str);
        }
        KindaApp.appKinda().startUseCase("hkoffline", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
            }
        });
    }

    public void startInWxAppPayUseCase(final Context context, Bundle bundle) {
        C115669n.INSTANCE.idkeyStat(1004, 19, 1, false);
        boolean z = true;
        Log.m105925i(TAG, "startInWxAppPayUseCase %s", Util.getStack());
        initIfNeed();
        preparePayDesk();
        report.markEnterPay(bundle.getInt("payScene"));
        final String string = bundle.getString("prepayId", "");
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("prepay_id", string);
        create.putString("bank_type", bundle.getString("bankType", ""));
        create.putString("bind_serial", bundle.getString("bindSerial", ""));
        create.putInt("payScene", bundle.getInt("payScene"));
        create.putInt("payChannel", bundle.getInt("payChannel"));
        create.putString("nativeReportSessionId", C75226r.m90201a());
        create.putString("qrcode_url", bundle.getString("qrCodeUrl", ""));
        create.putInt("qrcode_session_type", bundle.getInt("qrCodeSessionType"));
        create.putString("qrcode_session_name", bundle.getString("qrCodeSessionName", ""));
        create.putString("qrcode_timeline_objid", bundle.getString("qrCodeTimelineObjId", ""));
        if (bundle.getInt("enableDuplicate") != 1) {
            z = false;
        }
        create.putBool("enableDuplicate", z);
        create.putInt("chat_type", bundle.getInt("chatType"));
        create.putInt("send_type", bundle.getInt("sendType"));
        if (context instanceof C68866c0) {
            create.putString("succ_tip", context.getString(C0966R.string.i1q));
        }
        KindaApp.appKinda().startUseCase("inWxAppPay", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                ITransmitKvData iTransmitKvData2 = iTransmitKvData;
                Context context = context;
                if (context instanceof RemittanceNewBaseUI) {
                    String string = iTransmitKvData2.getString("result");
                    String string2 = iTransmitKvData2.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
                    RemittanceNewBaseUI remittanceNewBaseUI = (RemittanceNewBaseUI) context;
                    String str = string;
                    remittanceNewBaseUI.getClass();
                    Log.m105925i("MicroMsg.RemittanceNewBaseUI", "onKindaInWxAppPayCallback result:%s prepayId:%s transactionId:%s", string, str, string2);
                    if ("query:ok".equals(string)) {
                        remittanceNewBaseUI.hideLoading();
                    } else if ("pre_ok".equals(string)) {
                        remittanceNewBaseUI.mo97427J7(str, string2);
                        if (!Util.isNullOrNil(remittanceNewBaseUI.f204968W)) {
                            C77010f.vx0().xx0().mo97262d(remittanceNewBaseUI.f204974Z, remittanceNewBaseUI.f204968W, remittanceNewBaseUI.f204985g);
                        } else {
                            C77010f.vx0().xx0().mo97262d(remittanceNewBaseUI.f204974Z, remittanceNewBaseUI.f204985g, "");
                        }
                        if (remittanceNewBaseUI.f204971X0 > 0) {
                            if (!Util.isNullOrNil(remittanceNewBaseUI.f204968W)) {
                                MsgCheckTaskMgr.f115996b.mo67014a(remittanceNewBaseUI.f204968W, remittanceNewBaseUI.f204971X0, remittanceNewBaseUI.f204973Y0, remittanceNewBaseUI.f204974Z, remittanceNewBaseUI.f204975Z0);
                            } else {
                                MsgCheckTaskMgr.f115996b.mo67014a(remittanceNewBaseUI.f204985g, remittanceNewBaseUI.f204971X0, remittanceNewBaseUI.f204973Y0, remittanceNewBaseUI.f204974Z, remittanceNewBaseUI.f204975Z0);
                            }
                        }
                    } else if ("ok".equals(string)) {
                        remittanceNewBaseUI.finish();
                    } else {
                        remittanceNewBaseUI.hideLoading();
                    }
                } else if (context instanceof WalletLqtSaveFetchUI) {
                    String string3 = iTransmitKvData2.getString("result");
                    String string4 = iTransmitKvData2.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
                    WalletLqtSaveFetchUI walletLqtSaveFetchUI = (WalletLqtSaveFetchUI) context;
                    String str2 = string;
                    walletLqtSaveFetchUI.getClass();
                    Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "onKindaInWxAppPayCallback result:%s transactionId:%s", string3, string4);
                    C71624d1 d1Var = walletLqtSaveFetchUI.f208193f;
                    if (d1Var != null) {
                        String str3 = walletLqtSaveFetchUI.f208181X;
                        if (string3.equalsIgnoreCase("ok")) {
                            Log.m105925i("MicroMsg.LqtSaveFetchLogic", "%s onKindaInWxAppPayCallback, doQueryPurchaseResult, accountType: %s, reqkey: %s", Integer.valueOf(d1Var.hashCode()), Integer.valueOf(d1Var.f207609h), str2);
                            d1Var.f207605d = string4;
                            String str4 = (String) ((HashMap) d1Var.f207614m).get(str2);
                            if (!Util.isNullOrNil(str4)) {
                                d1Var.f207604c = str4;
                            }
                            WalletBaseUI walletBaseUI = d1Var.f207603b;
                            if (walletBaseUI instanceof WalletLqtSaveFetchUI) {
                                WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = (WalletLqtSaveFetchUI) walletBaseUI;
                                walletLqtSaveFetchUI2.f208172S0 = true;
                                walletLqtSaveFetchUI2.mo98981T7();
                            }
                            d1Var.mo98810b(str3, 0);
                        }
                    }
                } else if (context instanceof C68866c0) {
                    ((C68866c0) context).mo94739c4(iTransmitKvData2.getString("result"));
                } else if (context instanceof WalletIapUI) {
                    String string5 = iTransmitKvData2.getString("result");
                    WalletIapUI walletIapUI = (WalletIapUI) context;
                    if (walletIapUI.f211039p == null) {
                        Log.m105924i("MicroMsg.WalletIapUI", "onKindaInWxAppPayCallback mPurchaseFinishedListener is null");
                    } else {
                        C76835c a = string5.equalsIgnoreCase("ok") ? C76835c.m92624a(0) : string5.equalsIgnoreCase("cancel") ? C76835c.m92624a(1) : C76835c.m92624a(6);
                        C72560c cVar = walletIapUI.f211036j;
                        ((WalletIapUI.C72546a) walletIapUI.f211039p).mo99950a(a, new C76750e(cVar.f211098l, cVar.f211096j, cVar.f211095i, cVar.f211094h));
                        Log.m105925i("MicroMsg.WalletIapUI", "onKindaInWxAppPayCallback result:%s iapResult:%s", string5, a);
                    }
                } else if (context instanceof WalletMerchantPayUI) {
                    String string6 = iTransmitKvData2.getString("result");
                    WalletMerchantPayUI walletMerchantPayUI = (WalletMerchantPayUI) context;
                    walletMerchantPayUI.getClass();
                    if (string6.equalsIgnoreCase("ok")) {
                        Log.m105924i("MicroMsg.MerchantPayUI", "in wx app pay succ");
                        walletMerchantPayUI.mo97527I7(walletMerchantPayUI.f205256w, 0);
                        C119179t tVar = C119157j.f356862d;
                        C70952u1 u1Var = new C70952u1(walletMerchantPayUI);
                        C119157j jVar = (C119157j) tVar;
                        jVar.getClass();
                        jVar.mo183892w(u1Var, 200, false);
                    } else if (string6.equalsIgnoreCase("cancel")) {
                        Log.m105924i("MicroMsg.MerchantPayUI", "in wx app pay cancel");
                        walletMerchantPayUI.mo97527I7(walletMerchantPayUI.f205256w, 1);
                    } else if (string6.equalsIgnoreCase("fail")) {
                        Log.m105924i("MicroMsg.MerchantPayUI", "in wx app pay fail");
                        walletMerchantPayUI.mo97527I7(walletMerchantPayUI.f205256w, 1);
                    }
                }
                WxCrossServices.report.reset();
            }
        });
    }

    public void startJSApiWCPaySecurityCrosscut(Map<String, Object> map) {
        if (map != null) {
            ITransmitKvData create = ITransmitKvData.create();
            create.putString("secure_crosscut", "1");
            create.putString("appId", (String) map.get("appId"));
            create.putString("timeStamp", (String) map.get("timeStamp"));
            create.putString("nonceStr", (String) map.get("nonceStr"));
            create.putString("package", (String) map.get("package"));
            create.putString("signType", (String) map.get("signType"));
            create.putString("paySign", (String) map.get("paySign"));
            create.putString("nativeReportSessionId", C75226r.m90201a());
            KindaApp.appKinda().notifyAllUseCases(create);
        }
    }

    public void startJsApiComponentUseCase(Context context, WalletJsapiData walletJsapiData, final MMActivity.C6739d dVar, final int i) {
        initIfNeed();
        ITransmitKvData create = ITransmitKvData.create();
        Map<String, String> map = walletJsapiData.f24072P;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                create.putString((String) next.getKey(), (String) next.getValue());
            }
        }
        create.putJSEvent("JSEvent", new KJSEvent() {
            public void kindaCloseWebViewImpl(boolean z, VoidCallback voidCallback) {
            }

            public void kindaEndWithResult(String str, HashMap<String, String> hashMap) {
                if (dVar != null) {
                    int i = 0;
                    if (str.endsWith("ok")) {
                        i = -1;
                    } else if (str.endsWith("fail")) {
                        i = 5;
                    }
                    Intent intent = new Intent();
                    for (Map.Entry next : hashMap.entrySet()) {
                        intent.putExtra((String) next.getKey(), (String) next.getValue());
                    }
                    dVar.mmOnActivityResult(i, i, intent);
                }
            }

            public KindaJSEventType kindaGetType() {
                return KindaJSEventType.WEB;
            }
        });
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase(walletJsapiData.f24073Q, create, (UseCaseCallback) null);
    }

    public boolean startLqtDetailUseCase(final Context context, Intent intent) {
        Log.m105924i(TAG, "start LqtDetailUseCase");
        if (!C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_wcpay_lqt_detail_kinda_enable_android, false)) {
            return false;
        }
        KindaApp.appKinda().startUseCase("lqtDetailUseCase", ITransmitKvData.create(), new UseCaseCallback() {
            private byte _hellAccFlag_;

            public void call(ITransmitKvData iTransmitKvData) {
                String string = iTransmitKvData.getString("dataSource");
                String string2 = iTransmitKvData.getString("cmdWord");
                if (Util.isNullOrNil(string) || Util.isNullOrNil(string2)) {
                    Log.m105924i(WxCrossServices.TAG, "datasource or cmdword is null!");
                    return;
                }
                if (!(context instanceof MMActivity)) {
                    Log.m105924i(WxCrossServices.TAG, "context is not instance of mmactivity");
                }
                MMActivity mMActivity = (MMActivity) context;
                if (!string.equals("lqtDetailUseCase")) {
                    return;
                }
                if (string2.equals("startAutoChargeSetting")) {
                    Intent intent = new Intent(mMActivity, WalletLqtBalanceAutoTransferUI.class);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    MMActivity mMActivity2 = mMActivity;
                    C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/kinda/framework/WxCrossServices$20", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(mMActivity2, "com/tencent/kinda/framework/WxCrossServices$20", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (string2.equals("startPlainIndex")) {
                    Intent intent2 = new Intent(mMActivity, WalletLqtPlanBeforeHomeUI.class);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    MMActivity mMActivity3 = mMActivity;
                    C117292a.m165358d(mMActivity3, aVar2.mo10232b(), "com/tencent/kinda/framework/WxCrossServices$20", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(mMActivity3, "com/tencent/kinda/framework/WxCrossServices$20", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (string2.equals("jumpStaticVideo")) {
                    String string3 = iTransmitKvData.getString("video_url");
                    Intent intent3 = new Intent(mMActivity, WalletKnowLqtFullScreenVideoUI.class);
                    intent3.putExtra("videoUrl", string3);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent3);
                    MMActivity mMActivity4 = mMActivity;
                    C117292a.m165358d(mMActivity4, aVar3.mo10232b(), "com/tencent/kinda/framework/WxCrossServices$20", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(mMActivity4, "com/tencent/kinda/framework/WxCrossServices$20", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (string2.equals("jumpVideoFeed")) {
                    String string4 = iTransmitKvData.getString("feed_id");
                    String string5 = iTransmitKvData.getString("nonce_id");
                    Intent intent4 = new Intent();
                    intent4.putExtra("feed_object_id", C61926c.m72671P(string4));
                    intent4.putExtra("feed_object_nonceId", string5);
                    intent4.putExtra("key_comment_scene", 1);
                    intent4.putExtra("tab_type", 1001);
                    ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76864nr(mMActivity, intent4);
                }
            }
        });
        return true;
    }

    public boolean startLqtFetchUseCase(Context context, final Intent intent, final C76324c.C76325a aVar) {
        Log.m105924i(TAG, "start LqtSaveFetchUseCase");
        if (!C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_wcpay_lqt_transfer_kinda_enable_android, false)) {
            return false;
        }
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("entrance_type", intent.getIntExtra("entrance_type", 0));
        create.putString("bind_serial", intent.getStringExtra("card_serial"));
        create.putString("amount", intent.getStringExtra("fill_money"));
        KindaApp.appKinda().startUseCase("LQTRedeemUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (aVar != null) {
                    Iterator<String> it = iTransmitKvData.allKeys().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        intent.putExtra(next, iTransmitKvData.getString(next));
                    }
                    aVar.mo5281a(intent);
                }
            }
        });
        return true;
    }

    public void startLqtFixedDepositEntranceUseCase(final Context context, Bundle bundle) {
        Log.m105924i(TAG, "start LqtFixedDepositEntranceUseCase");
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("LQTFixedDepositEntranceUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if ((context instanceof WalletLqtDetailUI) && iTransmitKvData != null && iTransmitKvData.getInt("LQTMainPageShouldRefresh") == 1) {
                    ((WalletLqtDetailUI) context).mo98916M7(0, true);
                }
            }
        });
    }

    public void startLqtFixedDepositMakePlanUseCase(final Context context, Bundle bundle) {
        Log.m105924i(TAG, "start LqtFixedDepositMakePlanUseCase");
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("nativeReportSessionId", C75226r.m90201a());
        create.putInt("entry_scene", bundle.getInt("entry_scene"));
        KindaApp.appKinda().startUseCase("LQTFixedDepositMakePlanUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if ((context instanceof WalletLqtDetailUI) && iTransmitKvData != null && iTransmitKvData.getInt("LQTMainPageShouldRefresh") == 1) {
                    ((WalletLqtDetailUI) context).mo98916M7(0, true);
                }
            }
        });
    }

    public void startLqtFixedDepositPlanListUseCase(final Context context, Bundle bundle) {
        Log.m105924i(TAG, "start LqtFixedDepositPlanListUseCase");
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("LQTFixedDepositPlanListUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if ((context instanceof WalletLqtDetailUI) && iTransmitKvData != null && iTransmitKvData.getInt("LQTMainPageShouldRefresh") == 1) {
                    ((WalletLqtDetailUI) context).mo98916M7(0, true);
                }
            }
        });
    }

    public boolean startLqtSaveUseCase(Context context, final Intent intent, final C76324c.C76325a aVar) {
        Log.m105924i(TAG, "start LqtSaveUseCase");
        if (!C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_wcpay_lqt_transfer_kinda_enable_android, false)) {
            return false;
        }
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("entrance_type", intent.getIntExtra("entrance_type", 0));
        create.putString("bind_serial", intent.getStringExtra("card_serial"));
        create.putString("outer_trans_money", intent.getStringExtra("fill_money"));
        if (intent.getIntExtra("entrance_type", 0) == 14) {
            create.putLong("limit_cashier_amount", (long) Util.getDouble(intent.getStringExtra("fill_money"), 0.0d));
        }
        KindaApp.appKinda().startUseCase("LQTPurchaseUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (aVar != null) {
                    Iterator<String> it = iTransmitKvData.allKeys().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        intent.putExtra(next, iTransmitKvData.getString(next));
                    }
                    aVar.mo5281a(intent);
                }
            }
        });
        return true;
    }

    public void startModifyPwdUseCase(Context context, Bundle bundle) {
        Log.m105924i(TAG, "start startModifyPwdUseCase");
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("sessionId", C86709a0.m107523b().mo121111i() + "_" + C75228t.m90271t());
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("modifyPwdUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
            }
        });
    }

    public void startOfflinePay(Context context, String str, String str2, int i) {
        C115669n.INSTANCE.idkeyStat(1004, 18, 1, false);
        Log.m105925i(TAG, "startOfflinePay %s", Util.getStack());
        initIfNeed();
        preparePayDesk();
        C77290d.m93113k();
        report.markEnterPay(8);
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("req_key", str);
        create.putString("prefer_bind_serial", str2);
        create.putInt("payScene", 8);
        create.putInt("payChannel", i);
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("offlinePay", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                boolean bool = iTransmitKvData.getBool("pay_result");
                Log.m105924i(WxCrossServices.TAG, "startOfflinePay UseCaseCallback pay_result: " + bool);
                WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
                WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                aVar.f194088c = 0;
                if (bool) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, Boolean.TRUE);
                    WalletPayResultEvent.C67828a aVar2 = walletPayResultEvent.f194085d;
                    aVar2.f194088c = -1;
                    aVar2.f194086a = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putInt("payScene", 8);
                    bundle.putString("pay_bind_serial", iTransmitKvData.getString("pay_bind_serial"));
                    bundle.putInt("isFromKinda", 1);
                    walletPayResultEvent.f194085d.f194086a.putExtras(bundle);
                } else {
                    aVar.f194088c = 0;
                    aVar.f194086a = new Intent();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("payScene", 8);
                    bundle2.putInt("isFromKinda", 1);
                    walletPayResultEvent.f194085d.f194086a.putExtras(bundle2);
                }
                walletPayResultEvent.publish();
                WxCrossServices.report.reset();
            }
        });
    }

    public void startOfflinePrePay(final Context context, int i, int i2, int i3, Map<String, String> map) {
        Log.m105925i(TAG, "startOfflinePrePay %s", Util.getStack());
        initIfNeed();
        this.walletLockListener.alive();
        this.jsApiOfflineUserBindQueryListener.alive();
        C69963m.wx0().Ax0().mo106555j(this);
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("entry_scene", i);
        create.putInt("payScene", 8);
        create.putInt("payChannel", i2);
        create.putInt("pay_receipt_scene", i3);
        create.putString("nativeReportSessionId", C75226r.m90201a());
        if (map != null) {
            ITransmitKvData create2 = ITransmitKvData.create();
            create2.putString("card_id", map.get("card_id"));
            create2.putString("user_card_id", map.get("user_card_id"));
            create2.putString("card_code", map.get("card_code"));
            create.putKvData("member_card", create2);
        }
        C115669n.INSTANCE.idkeyStat(1105, 105, 1, false);
        KindaApp.appKinda().startUseCase("offline", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                WxCrossServices.this.walletLockListener.dead();
                WxCrossServices.this.jsApiOfflineUserBindQueryListener.dead();
                C69963m.wx0().Ax0().mo106556k(WxCrossServices.this);
                Context context = context;
                if (context instanceof WalletOfflineEntranceUI) {
                    ((WalletOfflineEntranceUI) context).finish();
                }
            }
        });
    }

    public boolean startOverseaWalletSuccPageUseCase(final Context context, Bundle bundle) {
        if (!C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_kinda_hk_wallet_succ_page_android, true)) {
            Log.m105924i(TAG, "startOverseaWalletSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is false");
            return false;
        }
        C115669n.INSTANCE.idkeyStat(1004, 20, 1, false);
        Log.m105924i(TAG, "startOverseaWalletSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is true");
        initIfNeed();
        preparePayDesk();
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("appid", bundle.getString("appid"));
        create.putString(AppMeasurement.Param.TIMESTAMP, bundle.getString(AppMeasurement.Param.TIMESTAMP));
        create.putString("nonce_str", bundle.getString("nonce_str"));
        create.putString("package", bundle.getString("package"));
        create.putInt("input_pay_scene", bundle.getInt("input_pay_scene"));
        create.putString("sign_type", bundle.getString("sign_type"));
        create.putString("pay_sign", bundle.getString("pay_sign"));
        create.putString("req_key", bundle.getString("req_key"));
        create.putInt("origin_pay_scene", bundle.getInt("origin_pay_scene"));
        create.putString("order_id", bundle.getString("order_id"));
        create.putInt("retry_max_count", bundle.getInt("retry_max_count"));
        create.putInt("retry_interval_seconds", bundle.getInt("retry_interval_seconds"));
        create.putString("retry_default_wording", bundle.getString("retry_default_wording"));
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("overseaWalletSuccPage", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (context instanceof WalletMixOrderInfoUI) {
                    String string = iTransmitKvData.getString("result");
                    boolean bool = iTransmitKvData.getBool("is_pending");
                    boolean bool2 = iTransmitKvData.getBool("is_jsapi_close_page");
                    WalletMixOrderInfoUI walletMixOrderInfoUI = (WalletMixOrderInfoUI) context;
                    walletMixOrderInfoUI.getClass();
                    Log.m105925i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack begin, result=%s is_pending=%b is_jsapi_close_page=%b", string, Boolean.valueOf(bool), Boolean.valueOf(bool2));
                    walletMixOrderInfoUI.f210061e = bool;
                    if (string.equalsIgnoreCase("pre_succ")) {
                        Log.m105924i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack not handle pre_succ");
                    } else if (string.equalsIgnoreCase("after_show_succ_page")) {
                        Log.m105925i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack handle after_show_succ_page, payScene=%d", Integer.valueOf(walletMixOrderInfoUI.f210070q));
                        if (walletMixOrderInfoUI.f210070q == 1) {
                            WebViewWillCloseWindowEvent webViewWillCloseWindowEvent = new WebViewWillCloseWindowEvent();
                            webViewWillCloseWindowEvent.f9613d.f9614a = -1;
                            webViewWillCloseWindowEvent.publish();
                            walletMixOrderInfoUI.setResult(-1);
                            walletMixOrderInfoUI.finish();
                        }
                    } else if (string.equalsIgnoreCase("ok")) {
                        Log.m105925i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack handle ok, payScene=%d prepayId=%s", Integer.valueOf(walletMixOrderInfoUI.f210070q), walletMixOrderInfoUI.f210064h);
                        if (walletMixOrderInfoUI.f210070q == 2) {
                            WebViewWillCloseWindowEvent webViewWillCloseWindowEvent2 = new WebViewWillCloseWindowEvent();
                            webViewWillCloseWindowEvent2.f9613d.f9614a = -1;
                            webViewWillCloseWindowEvent2.publish();
                            if (!Util.isNullOrNil(walletMixOrderInfoUI.f210064h)) {
                                WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
                                Intent intent = new Intent();
                                intent.putExtra("intent_pay_end", true);
                                intent.putExtra("is_jsapi_close_page", bool2 ? 1 : 0);
                                WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                                aVar.f194086a = intent;
                                aVar.f194089d = walletMixOrderInfoUI.f210064h;
                                aVar.f194088c = -1;
                                aVar.f194092g = 1;
                                walletPayResultEvent.publish();
                            }
                            walletMixOrderInfoUI.setResult(-1);
                            walletMixOrderInfoUI.finish();
                        }
                    } else {
                        Log.m105925i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack handle else, payScene=%d prepayId=%s", Integer.valueOf(walletMixOrderInfoUI.f210070q), walletMixOrderInfoUI.f210064h);
                        WebViewWillCloseWindowEvent webViewWillCloseWindowEvent3 = new WebViewWillCloseWindowEvent();
                        webViewWillCloseWindowEvent3.f9613d.f9614a = 0;
                        webViewWillCloseWindowEvent3.publish();
                        WalletPayResultEvent walletPayResultEvent2 = new WalletPayResultEvent();
                        WalletPayResultEvent.C67828a aVar2 = walletPayResultEvent2.f194085d;
                        aVar2.f194089d = walletMixOrderInfoUI.f210064h;
                        aVar2.f194088c = 0;
                        walletPayResultEvent2.publish();
                        walletMixOrderInfoUI.setResult(0);
                        walletMixOrderInfoUI.finish();
                    }
                    if (iTransmitKvData.getString("result").equals("ok")) {
                        Log.m105924i(WxCrossServices.TAG, "startOverseaWalletSuccPageUseCase, publish ok WalletPayResultEvent");
                        WalletPayResultEvent walletPayResultEvent3 = new WalletPayResultEvent();
                        WalletPayResultEvent.C67828a aVar3 = walletPayResultEvent3.f194085d;
                        aVar3.f194088c = -1;
                        aVar3.f194092g = 2;
                        Intent intent2 = new Intent();
                        intent2.putExtra("key_is_clear_failure", -1);
                        walletPayResultEvent3.f194085d.f194086a = intent2;
                        walletPayResultEvent3.publish();
                    } else if (iTransmitKvData.getString("result").equals("fail")) {
                        Log.m105924i(WxCrossServices.TAG, "startOverseaWalletSuccPageUseCase, publish canceled WalletPayResultEvent");
                        WalletPayResultEvent walletPayResultEvent4 = new WalletPayResultEvent();
                        WalletPayResultEvent.C67828a aVar4 = walletPayResultEvent4.f194085d;
                        aVar4.f194088c = 0;
                        aVar4.f194092g = 2;
                        Intent intent3 = new Intent();
                        intent3.putExtra("key_is_clear_failure", -1);
                        walletPayResultEvent4.f194085d.f194086a = intent3;
                        walletPayResultEvent4.publish();
                    }
                }
            }
        });
        return true;
    }

    public boolean startPayIBGJsGetSuccPageUseCase(final Context context, Bundle bundle) {
        if (!C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_kinda_hk_wallet_succ_page_android, true)) {
            Log.m105924i(TAG, "startPayIBGJsGetSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is false");
            return false;
        }
        C115669n.INSTANCE.idkeyStat(1004, 21, 1, false);
        Log.m105924i(TAG, "startPayIBGJsGetSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is true");
        initIfNeed();
        preparePayDesk();
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("appid", bundle.getString("appid"));
        create.putString(AppMeasurement.Param.TIMESTAMP, bundle.getString(AppMeasurement.Param.TIMESTAMP));
        create.putString("nonce_str", bundle.getString("nonce_str"));
        create.putString("package", bundle.getString("package"));
        create.putString("sign_type", bundle.getString("sign_type"));
        create.putString("pay_sign", bundle.getString("pay_sign"));
        create.putString("webview_url", bundle.getString("webview_url"));
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("payIbgGetSuccPage", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (context instanceof WalletIbgOrderInfoUI) {
                    String string = iTransmitKvData.getString("result");
                    String string2 = iTransmitKvData.getString("subscribe_username");
                    WalletIbgOrderInfoUI walletIbgOrderInfoUI = (WalletIbgOrderInfoUI) context;
                    walletIbgOrderInfoUI.getClass();
                    Log.m105925i("MicroMsg.WalletIbgOrderInfoUI", "onKindaPayIBGGetSuccPageBack, result: %s", string);
                    if (string.equalsIgnoreCase("fail")) {
                        walletIbgOrderInfoUI.setResult(0);
                    } else if (string.equalsIgnoreCase("ok")) {
                        if (!Util.isNullOrNil(string2)) {
                            Log.m105925i("MicroMsg.WalletIbgOrderInfoUI", "hy: doing netscene subscribe...subscribe_username: %s", string2);
                            C86709a0.m107528h();
                            C86709a0.m107529k().f251779b.mo123460f(new C75119h0(string2));
                        }
                        walletIbgOrderInfoUI.setResult(-1);
                    }
                    walletIbgOrderInfoUI.finish();
                }
            }
        });
        return true;
    }

    public void startPaySecurityUseCase(int i, final C76324c.C76325a aVar) {
        Class cls = C79173v.class;
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("entryScene", i);
        int i2 = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_cre_type;
        String str = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_cre_name;
        String str2 = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_true_name;
        create.putString("payUseInfo:credInfo.credType", String.valueOf(i2));
        create.putString("payUseInfo:credInfo.credName", str);
        create.putString("payUseInfo:usrName", str2);
        KindaApp.appKinda().startUseCase("paySecurity", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (aVar != null) {
                    Intent intent = new Intent();
                    intent.putExtra(IXWebBroadcastListener.STAGE_FINISHED, iTransmitKvData.getInt(IXWebBroadcastListener.STAGE_FINISHED));
                    aVar.mo5281a(intent);
                }
            }
        });
    }

    public void startQrcodeCollectionSettingUseCase(Intent intent, final C76324c.C76325a aVar) {
        Log.m105924i(TAG, "startQrcodeCollectionSettingUseCase");
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("key_collect_type", intent.getIntExtra("key_type", 1));
        create.putString("key_collect_currency_unit", intent.getStringExtra("key_currency_unit"));
        create.putInt("key_collect_fixed_fee", intent.getIntExtra("ftf_fixed_fee", 0));
        create.putString("key_collect_fixed_desc", intent.getStringExtra("ftf_fixed_desc"));
        create.putBool("key_collect_fixed_desc_required", intent.getBooleanExtra("ftf_fixed_desc_required", false));
        create.putString("key_collect_fixed_desc_placeholder", intent.getStringExtra("ftf_fixed_desc_placeholder"));
        create.putString("key_collect_payer_desc_switch_title", intent.getStringExtra("key_payer_desc_switch_title"));
        create.putString("key_collect_payer_desc_switch_sub_title", intent.getStringExtra("key_payer_desc_switch_sub_title"));
        create.putString("key_collect_payer_desc_fill_title", intent.getStringExtra("key_payer_desc_fill_title"));
        create.putString("key_collect_payer_desc_fill_hint", intent.getStringExtra("key_payer_desc_fill_hint"));
        KindaApp.appKinda().startUseCase("qrcodeCollectionSettingsUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                Intent intent = new Intent();
                intent.putExtra("key_error_msg", iTransmitKvData.getString("key_error_msg"));
                intent.putExtra("ftf_pay_url", iTransmitKvData.getString("key_collect_pay_url"));
                intent.putExtra("ftf_fixed_fee", (int) iTransmitKvData.getLong("key_collect_fee"));
                intent.putExtra("ftf_fixed_fee_type", iTransmitKvData.getString("key_collect_fee_type"));
                intent.putExtra("ftf_fixed_desc", iTransmitKvData.getString("key_collect_fee_desc"));
                intent.putExtra("key_error_level", iTransmitKvData.getInt("key_collect_error_level"));
                intent.putExtra("key_currency_unit", iTransmitKvData.getString("key_collect_currenct_unit"));
                intent.putExtra("key_save_notify_info", new String(iTransmitKvData.getBinary("key_collect_save_notify_info")));
                intent.putExtra("ftf_fixed_desc_required", iTransmitKvData.getBool("key_collect_desc_required"));
                intent.putExtra("ftf_fixed_desc_placeholder", iTransmitKvData.getString("key_collect_fee_desc_placeholder"));
                aVar.mo5281a(intent);
            }
        });
    }

    public void startResetPwdUseCase(Context context, Bundle bundle) {
        C115669n.INSTANCE.idkeyStat(1004, 17, 1, false);
        Log.m105925i(TAG, "startResetPwdUseCase %s", Util.getStack());
        initIfNeed();
        ITransmitKvData create = ITransmitKvData.create();
        if (bundle == null) {
            create.putBool("bResetPwdFromPayManage", false);
            create.putInt("realnameScene", 0);
            create.putInt("payScene", 0);
        } else {
            create.putBool("bResetPwdFromPayManage", bundle.getBoolean("key_is_paymanager", false));
            create.putInt("realnameScene", 0);
            create.putInt("payScene", 0);
        }
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("resetPwdUseCase", create, (UseCaseCallback) null);
    }

    public void startSNSPay(final Context context, PayInfo payInfo) {
        C115669n.INSTANCE.idkeyStat(1004, 10, 1, false);
        Log.m105925i(TAG, "startSNSPay %s", Util.getStack());
        initIfNeed();
        preparePayDesk();
        C77290d.m93113k();
        report.markEnterPay(payInfo.f212587e);
        if (!((C76324c) C86312j.m106911c(C76324c.class)).canOpenKindaCashier(context)) {
            C76879j.m92754y(context, context.getString(C0966R.string.kuy), "", context.getString(C0966R.string.au5), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Context context = context;
                    if (context instanceof Activity) {
                        ((Activity) context).finish();
                    }
                }
            });
            return;
        }
        ISnsSceneService createService = SnsSceneServiceFactory.createService(payInfo.f212587e);
        ISnsUseCaseCallback createCallback = SnsSceneServiceFactory.createCallback(payInfo.f212587e);
        createService.setData(context, payInfo);
        createCallback.setData(context, payInfo);
        ITransmitKvData generateSnsUseCaseData = createService.generateSnsUseCaseData();
        generateSnsUseCaseData.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("snsPay", generateSnsUseCaseData, createCallback);
    }

    public void startScanQRCodePay(Context context, Bundle bundle) {
        C115669n.INSTANCE.idkeyStat(1004, 13, 1, false);
        Log.m105925i(TAG, "startScanQRCodePay %s", Util.getStack());
        initIfNeed();
        preparePayDesk();
        C77290d.m93113k();
        report.markEnterPay(1);
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("m_A8keyScene", bundle.getInt("a8key_scene"));
        create.putString("qrCodeUrl", bundle.getString("qrcode_url"));
        create.putInt("payChannel", bundle.getInt("channel"));
        create.putInt("payScene", 1);
        create.putInt("chat_type", bundle.getInt("chat_type"));
        create.putInt("send_type", bundle.getInt("send_type"));
        create.putInt("qrcode_session_type", bundle.getInt("qrcode_session_type"));
        create.putString("qrcode_session_name", bundle.getString("qrcode_session_name"));
        create.putString("qrcode_timeline_objid", bundle.getString("qrcode_timeline_objid"));
        create.putString("nativeReportSessionId", C75226r.m90201a());
        C89779i0 i0Var = this.mDialogForScanPay;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.mDialogForScanPay = C76879j.m92723Q(context, context.getString(C0966R.string.f7961xj), context.getString(C0966R.string.l4f), false, false, new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
            }
        });
        Log.m105918d(TAG_SCAN_QR_CODE_PAY, "扫码支付打开正在加载进度框。");
        KindaApp.appKinda().startUseCase("scanQRCodePay", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                Log.m105924i(WxCrossServices.TAG, "startScanQRCodePay call()");
                if (WxCrossServices.this.mDialogForScanPay != null) {
                    Log.m105918d(WxCrossServices.TAG_SCAN_QR_CODE_PAY, "扫码支付关闭正在加载进度框。");
                    WxCrossServices.this.mDialogForScanPay.dismiss();
                    C89779i0 unused = WxCrossServices.this.mDialogForScanPay = null;
                }
                WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
                walletPayResultEvent.f194085d.f194088c = iTransmitKvData.getInt("scanQRCodeState");
                WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                aVar.f194091f = true;
                aVar.f194090e = iTransmitKvData.getString("failReason");
                walletPayResultEvent.publish();
                WxCrossServices.report.reset();
            }
        });
    }

    public void startTeenagerPay(Context context, byte[] bArr) {
        ITransmitKvData create = ITransmitKvData.create();
        if (bArr != null && bArr.length > 0) {
            create.putBinary("respData", bArr);
        }
        KindaApp.appKinda().startUseCase("teenagerPayUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
            }
        });
    }

    public void startTeenagerPayGetDetail(Context context, final C76324c.C8882c cVar) {
        KindaApp.appKinda().startUseCase("teenagerPayGetDetailUseCase", ITransmitKvData.create(), new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                String string = iTransmitKvData.getString("status");
                byte[] binary = iTransmitKvData.getBinary("respData");
                SettingsTeenModeMain settingsTeenModeMain = ((r$$b) cVar).f33271a;
                int i = SettingsTeenModeMain.f21470x;
                settingsTeenModeMain.getClass();
                MMHandlerThread.postToMainThread(new r$$c(settingsTeenModeMain, string, binary));
            }
        });
    }

    public void startUiTest() {
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("uiTest", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (iTransmitKvData.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) == 1) {
                    throw null;
                }
            }
        });
    }

    public void startUseCase(String str, Object obj, Object obj2) {
        Log.m105924i(TAG, "start common useCase");
        if (!(obj instanceof ITransmitKvData) || !(obj2 instanceof UseCaseCallback)) {
            Log.m105924i(TAG, "startUseCase fail, data or callback is not the right type");
            return;
        }
        ITransmitKvData iTransmitKvData = (ITransmitKvData) obj;
        iTransmitKvData.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase(str, iTransmitKvData, (UseCaseCallback) obj2);
    }

    public boolean startWalletBalanceEntryUseCase(final Context context) {
        if (!C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_wcpay_balance_kinda_enabled_android, false)) {
            return false;
        }
        ITransmitKvData create = ITransmitKvData.create();
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(196660, 0)).intValue();
        C86709a0.m107528h();
        int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue();
        Log.m105924i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + intValue2);
        boolean z = (32768 & intValue) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isShowRealnameGuide, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(intValue));
        if (z) {
            C86709a0.m107528h();
            create.putString("balance:entry:realnameGuideTitle", (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_RELEAY_NAME_TIP_CONTENT_STRING_SYNC, (Object) null));
        }
        KindaApp.appKinda().startUseCase("balanceEntryUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                ITransmitKvData iTransmitKvData2 = iTransmitKvData;
                String string = iTransmitKvData2.getString("jumpToNativeUrl");
                String string2 = iTransmitKvData2.getString("fromScene");
                Activity crossActivity = WxCrossServices.this.getCrossActivity();
                if (!Util.isNullOrNil(string) && crossActivity != null) {
                    Log.m105925i(WxCrossServices.TAG, "balance open nativeUrl: %s, fromScene: %s", string, string2);
                    final C71637j0 j0Var = string2.equals("recharge") ? C71637j0.BalanceRecharge : C71637j0.BalanceEntry;
                    Bundle bundle = new Bundle();
                    bundle.putInt("fromScene", j0Var.ordinal());
                    bundle.putString("bindSerial", iTransmitKvData2.getString("lqtsave:bindSerial"));
                    bundle.putString("amountString", iTransmitKvData2.getString("lqtsave:amountString"));
                    C87412m.m108594g(string, "url");
                    int i = bundle.getInt("fromScene", 0);
                    C71637j0[] values = C71637j0.values();
                    int length = values.length;
                    int i2 = 0;
                    while (i2 < length) {
                        C71637j0 j0Var2 = values[i2];
                        if (j0Var2.ordinal() == i) {
                            String string3 = bundle.getString("bindSerial");
                            String string4 = bundle.getString("amountString");
                            final int i3 = 32769;
                            if (C112551y.m153819s(string, "weixin://wcpay/lqt/detail", false)) {
                                C71648n1.m84124b(string);
                                Intent intent = new Intent();
                                intent.putExtra("key_account_type", 1);
                                C88144b.m109795m(crossActivity, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, 32769);
                            } else if (C112551y.m153819s(string, "weixin://wcpay/lqt/save", false)) {
                                C71648n1.m84124b(string);
                                String a = C71648n1.m84123a(string);
                                Dialog d = C75197d0.m90163d(crossActivity, false, false, (DialogInterface.OnCancelListener) null);
                                C71633i0 i0Var = new C71633i0(crossActivity);
                                C71639l0 l0Var = r6;
                                C71639l0 l0Var2 = new C71639l0(d, crossActivity, j0Var2, i0Var, a, string4, string3);
                                C5725m0 m0Var = new C5725m0(crossActivity, d);
                                C43290f0 f0Var = i0Var.f207626a;
                                if (f0Var == null) {
                                    Log.m105920e("LqtDetailInteractorGlueApiHelper", "interactorGlueApi == null || interactorGlueApi.fetchLqtDetail == null");
                                } else {
                                    f0Var.f117126b.mo67528b().mo123062e(new C71631h0(i0Var, l0Var)).mo123065b(new C71629g0(i0Var, m0Var));
                                }
                                i3 = 32770;
                            } else {
                                i3 = -1;
                            }
                            if (i3 > 0) {
                                if (crossActivity instanceof UIPageFragmentActivity) {
                                    ((UIPageFragmentActivity) crossActivity).f195318s.put(Integer.valueOf(i3), new UIPageFragmentActivity.C68049b() {
                                        public void handle(int i, Intent intent) {
                                            if (i3 == 32770) {
                                                ITransmitKvData create = ITransmitKvData.create();
                                                if (j0Var == C71637j0.BalanceEntry) {
                                                    create.putInt("balance:entry:refresh", 1);
                                                } else if (i == -1) {
                                                    create.putInt("balance:recharge:chargedLQTInBalance", 1);
                                                }
                                                KindaApp.appKinda().notifyAllUseCases(create);
                                            }
                                        }
                                    });
                                    return;
                                }
                                return;
                            } else if (string.startsWith("wxpay://lqp/balanceQuotaState")) {
                                C88144b.m109791i(context, "wallet_ecard", ".ui.WalletECardLogoutUI", new Intent(), (Bundle) null);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            i2++;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        });
        return true;
    }

    public void startWalletBalanceFetchUseCase(final Context context, final Bundle bundle) {
        Log.m105925i(TAG, "startWalletBalanceFetchUseCase %s", Util.getStack());
        initIfNeed();
        preparePayDesk();
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("payScene", bundle.getInt("payScene"));
        create.putString("totalFee", bundle.getString("totalFee"));
        create.putString("feeType", bundle.getString("feeType"));
        create.putString("bankType", bundle.getString("bankType"));
        create.putString("bindSerial", bundle.getString("bindSerial"));
        create.putString("operation", bundle.getString("operation"));
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("fetchBalance", create, new UseCaseCallback() {
            private byte _hellAccFlag_;

            public void call(ITransmitKvData iTransmitKvData) {
                if (context instanceof WalletBalanceFetchUI) {
                    int i = iTransmitKvData.getInt("result");
                    Log.m105925i(WxCrossServices.TAG, "startWalletBalanceFetchUseCase result：%s", Integer.valueOf(i));
                    if (i == 1) {
                        Intent intent = new Intent(context, WalletBalanceManagerUI.class);
                        intent.addFlags(67108864);
                        Context context = context;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        Context context2 = context;
                        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/kinda/framework/WxCrossServices$17", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(context2, "com/tencent/kinda/framework/WxCrossServices$17", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else if (i == 2) {
                    } else {
                        if (i != 3) {
                            Log.m105925i(WxCrossServices.TAG, "startWalletBalanceFetch unknown result：%s", Integer.valueOf(i));
                            return;
                        }
                        C115669n.INSTANCE.mo160131h(16398, bundle.getString("reportSessionId"), 8, "", "");
                    }
                }
            }
        });
    }

    public void startWalletBalanceSaveUseCase(final Context context, final Bundle bundle) {
        Log.m105925i(TAG, "startWalletBalanceSaveUseCase %s", Util.getStack());
        initIfNeed();
        preparePayDesk();
        ITransmitKvData create = ITransmitKvData.create();
        create.putInt("payScene", bundle.getInt("payScene"));
        create.putString("totalFee", bundle.getString("totalFee"));
        create.putString("feeType", bundle.getString("feeType"));
        create.putString("bankType", bundle.getString("bankType"));
        create.putString("bindSerial", bundle.getString("bindSerial"));
        create.putString("operation", bundle.getString("operation"));
        KindaApp.appKinda().startUseCase("saveBalance", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (context instanceof WalletBalanceSaveUI) {
                    int i = iTransmitKvData.getInt("result");
                    Log.m105925i(WxCrossServices.TAG, "startWalletBalanceSaveUseCase result：%s", Integer.valueOf(i));
                    if (i == 1) {
                        Context context = context;
                        ((WalletBalanceSaveUI) context).f207847v = false;
                        ((WalletBalanceSaveUI) context).finish();
                    } else if (i == 2) {
                        ((WalletBalanceSaveUI) context).f207847v = false;
                    } else if (i != 3) {
                        Log.m105925i(WxCrossServices.TAG, "startWalletBalanceSave unknown result：%s", Integer.valueOf(i));
                    } else {
                        ((WalletBalanceSaveUI) context).f207847v = false;
                        C115669n.INSTANCE.mo160131h(16398, bundle.getString("reportSessionId"), 8, "", "");
                    }
                }
            }
        });
    }

    public void startWeBankLoanPay(Context context, String str, String str2, final C76324c.C76327d dVar) {
        ITransmitKvData create = ITransmitKvData.create();
        create.putString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
        create.putString("jsapi_reqkey", str2);
        KindaApp.appKinda().startUseCase("webankLoanPayUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (iTransmitKvData.getInt("pay_success") != 1) {
                    ((WalletLoanRepaymentUI.C71904a) dVar).mo99105a((String) null, (String) null);
                    return;
                }
                ((WalletLoanRepaymentUI.C71904a) dVar).mo99105a(iTransmitKvData.getString("result_token"), iTransmitKvData.getString("bind_serial"));
            }
        });
    }

    public void startWxpayAppPay(Context context, Bundle bundle, String str, String str2, String str3, String str4) {
        final Context context2 = context;
        Bundle bundle2 = bundle;
        Log.m105925i(TAG, "startWxpayAppPay %s", Util.getStack());
        initIfNeed();
        preparePayDesk();
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(1004, 11, 1, false);
        C77290d.m93113k();
        report.markEnterPay(2);
        PayReq payReq = new PayReq();
        payReq.fromBundle(bundle2);
        final ITransmitKvData create = ITransmitKvData.create();
        create.putString("appid", payReq.appId);
        create.putString("partner_id", payReq.partnerId);
        create.putString("prepay_id", payReq.prepayId);
        create.putString("nonce_str", payReq.nonceStr);
        create.putString(AppMeasurement.Param.TIMESTAMP, payReq.timeStamp);
        create.putString("package", payReq.packageValue);
        create.putString("sign", payReq.sign);
        create.putString("sign_type", payReq.signType);
        create.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
        create.putString(Constants.KEY_APP_PACKAGE_NAME, str2);
        create.putString("safe_app_package_name", bundle2.getString("key_app_packagename_safe"));
        create.putString("app_display_name", str3);
        create.putString("android_sign", str4);
        create.putString("app_token", bundle2.getString("key_app_token"));
        create.putInt("app_token_verifyResult", bundle2.getInt("key_app_token_verify_result"));
        create.putString("app_sdkVersion", "" + bundle2.getInt("key_sdk_version", 0));
        create.putString("safe_app_sdkVersion", "" + bundle2.getInt("key_sdk_version_safe", 0));
        create.putString("bundle_id", "");
        create.putInt("payScene", 2);
        create.putString("nativeReportSessionId", C75226r.m90201a());
        final String str5 = bundle2.getInt("_wxapi_command_type", 0) == 27 ? "jointPay" : "appPay";
        Log.m105925i(TAG, "app url: %s", str5);
        if (!((C78144b) C86312j.m106911c(C78144b.class)).mo107979HA()) {
            Log.m105928w(TAG, "soter has not initialized, wait 1s");
            nVar.mo175911u(1104, 48);
            MMHandlerThread.postToMainThreadDelayed(new Runnable() {
                public void run() {
                    Log.m105919d(WxCrossServices.TAG, "soter initialized: %s", Boolean.valueOf(((C78144b) C86312j.m106911c(C78144b.class)).mo107979HA()));
                    KindaApp.appKinda().startUseCase(str5, create, new UseCaseCallback() {
                        public void call(ITransmitKvData iTransmitKvData) {
                            Context context = context2;
                            if (context instanceof OrderHandlerUI) {
                                ((OrderHandlerUI) context).finish();
                            }
                        }
                    });
                }
            }, 1000);
            return;
        }
        KindaApp.appKinda().startUseCase(str5, create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                Context context = context2;
                if (context instanceof OrderHandlerUI) {
                    ((OrderHandlerUI) context).finish();
                    WxCrossServices.report.reset();
                }
            }
        });
    }

    public void startWxpayH5Pay(final Context context, Bundle bundle, String str, String str2, String str3, String str4) {
        C115669n.INSTANCE.idkeyStat(1004, 14, 1, false);
        Log.m105925i(TAG, "startWxpayH5Pay %s", Util.getStack());
        initIfNeed();
        preparePayDesk();
        C77290d.m93113k();
        report.markEnterPay(36);
        PayReq payReq = new PayReq();
        payReq.fromBundle(bundle);
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("appid", payReq.appId);
        create.putString("partner_id", payReq.partnerId);
        create.putString("prepay_id", payReq.prepayId);
        create.putString("nonce_str", payReq.nonceStr);
        create.putString(AppMeasurement.Param.TIMESTAMP, payReq.timeStamp);
        create.putString("package", payReq.packageValue);
        create.putString("sign", payReq.sign);
        create.putString("sign_type", payReq.signType);
        create.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
        create.putString(Constants.KEY_APP_PACKAGE_NAME, str2);
        create.putString("app_display_name", str3);
        create.putString("android_sign", str4);
        create.putString("android_sign", str4);
        create.putString("bundle_id", "");
        create.putInt("payScene", 36);
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("h5Pay", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                Context context = context;
                if (context instanceof OrderHandlerUI) {
                    ((OrderHandlerUI) context).finish();
                    WxCrossServices.report.reset();
                }
            }
        });
    }

    public void startWxpayJsApiPay(final Context context, WalletJsapiData walletJsapiData, MMActivity.C6739d dVar, int i) {
        C115669n.INSTANCE.idkeyStat(1004, 12, 1, false);
        Log.m105925i(TAG, "startWxpayJsApiPay %s", Util.getStack());
        initIfNeed();
        preparePayDesk();
        C77290d.m93113k();
        report.markEnterPay(walletJsapiData.f24088t);
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("appid", walletJsapiData.f24075d);
        create.putString("package", walletJsapiData.f24080i);
        create.putString("signType", walletJsapiData.f24077f);
        create.putString("timeStamp", walletJsapiData.f24079h);
        create.putString("paySign", walletJsapiData.f24084p);
        create.putString("nonce_str", walletJsapiData.f24078g);
        create.putString("stepInAppUserName", walletJsapiData.f24087s);
        create.putString("stepInURL", walletJsapiData.f24086r);
        create.putInt("payChannel", walletJsapiData.f24090v);
        create.putInt("payScene", walletJsapiData.f24088t);
        create.putInt("codeScene", walletJsapiData.f24091w);
        create.putInt("weappEnterScene", walletJsapiData.f24092x);
        create.putString("weappPayCookies", walletJsapiData.f24085q);
        create.putString("adUxInfo", walletJsapiData.f24065H);
        create.putInt("sendType", walletJsapiData.f24067J);
        create.putInt("chatType", walletJsapiData.f24066I);
        create.putInt("qrcodeSessionType", walletJsapiData.f24068K);
        create.putString("qrcodeSessionName", walletJsapiData.f24069L);
        create.putString("qrcodeTimelineObjid", walletJsapiData.f24070M);
        create.putBool("imitationNativeTinyApp", walletJsapiData.f24094z == 1);
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaJSEvent kindaJSEvent = new KindaJSEvent();
        kindaJSEvent.setIMMOnActivityResult(dVar);
        kindaJSEvent.setRequestCode(i);
        kindaJSEvent.setType(Util.isNullOrNil(walletJsapiData.f24062E) ? KindaJSEventType.WEB : KindaJSEventType.TINYAPP);
        create.putJSEvent("JSEvent", kindaJSEvent);
        String str = walletJsapiData.f24064G ? "jointPay" : "jsapiPay";
        Log.m105925i(TAG, "jsapi url: %s", str);
        KindaApp.appKinda().startUseCase(str, create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (iTransmitKvData != null && (context instanceof WalletBrandUI)) {
                    String string = iTransmitKvData.getString("result");
                    WxCrossServices.report.reset();
                    if (string == null) {
                        Log.m105920e(WxCrossServices.TAG, "JsApiPay UseCaseCallback get result null! ");
                        string = "";
                    }
                    int i = string.endsWith("ok") ? -1 : string.endsWith("fail") ? 5 : 0;
                    String string2 = iTransmitKvData.getString("total_fee_str");
                    WalletBrandUI walletBrandUI = (WalletBrandUI) context;
                    Log.m105925i(WxCrossServices.TAG, "JsApiPay UseCaseCallback receive data, result: %s, resultCode:%d, total_fee_str: ", string, Integer.valueOf(i), string2);
                    if (!C90183c.m112859g(string2)) {
                        String replaceAll = string2.replaceAll("[^0-9\\.]", "");
                        Log.m105924i(WxCrossServices.TAG, "JsApiPay UseCaseCallback totalFee after format is: " + replaceAll);
                        Intent intent = new Intent();
                        intent.putExtra("key_total_fee", replaceAll);
                        if (!Util.isNullOrNil(walletBrandUI.f211005n) && walletBrandUI.f211005n.equalsIgnoreCase("key_from_scene_appbrandgame")) {
                            walletBrandUI.mo99944I7(i, intent);
                        }
                    }
                    if (string.equals("pre_ok")) {
                        Log.m105924i(WxCrossServices.TAG, "JsApiPay UseCaseCallback preSuccess!");
                        Intent intent2 = new Intent();
                        intent2.putExtra("key_is_clear_failure", -1);
                        walletBrandUI.mo99945J7(i, intent2);
                        return;
                    }
                    Log.m105924i(WxCrossServices.TAG, "JsApiPay UseCaseCallback finish WalletBrandUI.");
                    walletBrandUI.finish();
                }
            }
        });
    }

    public void startWxpayQueryCashierPay(String str, int i, int i2) {
        C115669n.INSTANCE.idkeyStat(1004, 15, 1, false);
        Log.m105925i(TAG, "startWxpayQueryCashierPay %s", Util.getStack());
        initIfNeed();
        preparePayDesk();
        report.markEnterPay(i);
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("req_key", str);
        create.putInt("payScene", i);
        create.putInt("payChannel", i2);
        create.putString("nativeReportSessionId", C75226r.m90201a());
        KindaApp.appKinda().startUseCase("queryCashierPay", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
                walletPayResultEvent.f194085d.f194088c = iTransmitKvData.getString("result").equals("ok") ? -1 : 0;
                walletPayResultEvent.publish();
                WxCrossServices.report.reset();
            }
        });
    }

    public boolean tryStartTransferToBankDetailUseCase(String str, final C76324c.C76325a aVar) {
        if (!C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_transfer_to_bank_kinda_switch_android, false)) {
            return false;
        }
        ITransmitKvData create = ITransmitKvData.create();
        if (!Util.isNullOrNil(str)) {
            create.putString("transferBillId", str);
            create.putBool("isFromJsApi", true);
        }
        KindaApp.appKinda().startUseCase("transferToBankShowDetailUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (aVar != null) {
                    Intent intent = new Intent();
                    intent.putExtra(IXWebBroadcastListener.STAGE_FINISHED, iTransmitKvData.getInt(IXWebBroadcastListener.STAGE_FINISHED));
                    aVar.mo5281a(intent);
                }
            }
        });
        return true;
    }

    public boolean tryStartTransferToBankUseCase(String str, final C76324c.C76325a aVar) {
        if (!C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_transfer_to_bank_kinda_switch_android, false)) {
            return false;
        }
        ITransmitKvData create = ITransmitKvData.create();
        if (!Util.isNullOrNil(str)) {
            create.putString("bank_card_number", str);
        }
        KindaApp.appKinda().startUseCase("transferToBankUseCase", create, new UseCaseCallback() {
            public void call(ITransmitKvData iTransmitKvData) {
                if (aVar != null) {
                    Intent intent = new Intent();
                    intent.putExtra("pay_success", iTransmitKvData.getInt("pay_success"));
                    aVar.mo5281a(intent);
                }
            }
        });
        return true;
    }

    public void updateLocationCacheIfNeed(float f, float f2) {
        Log.m105924i(TAG, "update loction cache");
        this.lastLat = f;
        this.lastLng = f2;
        if (!((C103918d) C86312j.m106911c(C103918d.class)).Un0(MMApplicationContext.getContext(), "android.permission.ACCESS_FINE_LOCATION", false)) {
            Log.m105924i(TAG, "startGetLocation checkLocation false and ignore");
            return;
        }
        if (this.onLocationGet == null) {
            this.onLocationGet = new C92411b.C92412a() {
                public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
                    float f3 = f;
                    float f4 = f2;
                    Class cls = C78085c.class;
                    Log.m105925i(WxCrossServices.TAG, "onGetLocation isOk: %b, %s, %s", Boolean.valueOf(z), Float.valueOf(f2), Float.valueOf(f));
                    if (z) {
                        if (f4 == WxCrossServices.this.lastLat && f3 == WxCrossServices.this.lastLng) {
                            Log.m105924i(WxCrossServices.TAG, "lat and lng is same, ignore update address");
                        } else {
                            Log.m105924i(WxCrossServices.TAG, "update four address data");
                            ((C78085c) C86312j.m106911c(cls)).oe0().mo108054a(new C118505d((double) f4, (double) f3, true), WxCrossServices.this.upAddr);
                        }
                    }
                    ((C78085c) C86312j.m106911c(cls)).mo108056ms().mo126408b(this);
                    return false;
                }
            };
        }
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126409c(this.onLocationGet, true, false);
        C5139t.m5183e(22, 10);
    }

    public void updateOfflinePayDefaultCard(String str, String str2) {
        KindaApp.appKinda().updateOfflinePayDefaultCard(str, str2);
    }

    public void updateOfflinePayTokenFromScene(int i) {
        KindaApp.appKinda().updateOfflinePayTokenWithScene(i);
    }
}
