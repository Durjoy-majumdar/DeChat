package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p427v4.p1171os.ResultReceiver;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.ipc.ResultReceiverFixLeak;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C1761b;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ke3.C88144b;
import org.json.JSONObject;
import p224ra.C89909e;
import p225rc.g$$e;
import p275xz.C15919f;
import rx3.C13598b0;
import zd2.C91667a;
import zl0.C91774e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService */
public enum AppBrandJsApiPayService {
    INSTANCE;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService$PayResultCallbackReason */
    public enum PayResultCallbackReason {
        SuccessAheadCallback,
        ActivityResult
    }

    public void sendBizRedPacket(Activity activity, AppBrandStatObject appBrandStatObject, JSONObject jSONObject, final C1792b bVar) {
        WalletJsapiData walletJsapiData = new WalletJsapiData(jSONObject);
        walletJsapiData.f24090v = 16;
        final C17867 r5 = new MMActivity.C6739d() {
            public void mmOnActivityResult(int i, int i2, Intent intent) {
                if (i == (AppBrandJsApiPayService.this.hashCode() & 65535)) {
                    if (i2 == -1) {
                        C1792b bVar = bVar;
                        if (bVar != null) {
                            bVar.mo1764b(1, 0, (String) null, (Map<String, Object>) null);
                        }
                    } else if (i2 != 2) {
                        C1792b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.mo1764b(3, 0, (String) null, (Map<String, Object>) null);
                        }
                    } else if (bVar != null) {
                        bVar.mo1764b(2, 0, intent != null ? intent.getStringExtra("key_result_errmsg") : "", (Map<String, Object>) null);
                    }
                }
            }
        };
        final Intent intent = new Intent();
        intent.putExtra("key_way", 3);
        intent.putExtra("appId", walletJsapiData.f24075d);
        intent.putExtra("timeStamp", walletJsapiData.f24079h);
        intent.putExtra("nonceStr", walletJsapiData.f24078g);
        intent.putExtra("packageExt", walletJsapiData.f24080i);
        intent.putExtra("signtype", walletJsapiData.f24077f);
        intent.putExtra("paySignature", walletJsapiData.f24084p);
        intent.putExtra("key_static_from_scene", 100004);
        intent.putExtra("url", walletJsapiData.f24086r);
        AppBrandJsApiPayUtils.m101643b(activity, new C32226l<MMActivity, C13598b0>() {
            public Object invoke(Object obj) {
                MMActivity mMActivity = (MMActivity) obj;
                mMActivity.mmSetOnActivityResultCallback(r5);
                C88144b.m109796n(mMActivity, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", intent, AppBrandJsApiPayService.this.hashCode() & 65535, false);
                return C13598b0.f38549a;
            }
        });
    }

    public void startBindBankcard(Activity activity, AppBrandStatObject appBrandStatObject, final JSONObject jSONObject, final C1792b bVar) {
        final C17845 r2 = new MMActivity.C6739d() {
            public void mmOnActivityResult(int i, int i2, Intent intent) {
                if (i == (AppBrandJsApiPayService.this.hashCode() & 65535)) {
                    if (i2 == -1) {
                        C1792b bVar = bVar;
                        if (bVar != null) {
                            bVar.mo1764b(1, 0, (String) null, (Map<String, Object>) null);
                            return;
                        }
                        return;
                    }
                    C1792b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.mo1764b(2, 0, (String) null, (Map<String, Object>) null);
                    }
                }
            }
        };
        AppBrandJsApiPayUtils.m101643b(activity, new C32226l<MMActivity, C13598b0>() {
            public Object invoke(Object obj) {
                WalletJsapiData walletJsapiData = new WalletJsapiData(jSONObject);
                walletJsapiData.f24089u = 4;
                ((C15919f) C86312j.m106911c(C15919f.class)).mo14577z8((MMActivity) obj, walletJsapiData, AppBrandJsApiPayService.this.hashCode() & 65535, r2);
                return C13598b0.f38549a;
            }
        });
    }

    public boolean startPay(Activity activity, C82554k kVar, AppBrandStatObject appBrandStatObject, JSONObject jSONObject, final C1792b bVar, PString pString) {
        final WalletJsapiData walletJsapiData = new WalletJsapiData(jSONObject);
        if (appBrandStatObject != null) {
            walletJsapiData.f24090v = walletJsapiData.mo7619a(appBrandStatObject.f245533f, appBrandStatObject.f245536i);
            walletJsapiData.f24092x = appBrandStatObject.f245533f;
            walletJsapiData.f24091w = appBrandStatObject.f245542r;
        }
        walletJsapiData.f24088t = 46;
        String optString = jSONObject.optString("adUxInfo");
        walletJsapiData.f24065H = optString;
        C91667a.m115207c("AppBrandRuntime", C82878f0.NAME, optString, "data");
        pString.value = walletJsapiData.f24080i;
        C91774e.C91776b bVar2 = C91774e.f262832c;
        C87412m.m108594g(kVar, "component");
        final C1761b bVar3 = bVar2.mo125637a(kVar).f262836b.mo115092e() ? (C1761b) C89909e.m112436a(C1761b.class) : null;
        final int hashCode = hashCode() & 65535;
        final AnonymousClass1WxPayResultDispatcher r112 = new Object() {

            /* renamed from: a */
            public AnonymousClass1WxPayActivityResultAdapter f11559a;

            /* renamed from: a */
            public void mo1762a(int i, Intent intent, PayResultCallbackReason payResultCallbackReason) {
                PayResultCallbackReason payResultCallbackReason2 = PayResultCallbackReason.SuccessAheadCallback;
                this.f11559a = new Object(i, intent, payResultCallbackReason) {

                    /* renamed from: a */
                    public final int f11551a;

                    /* renamed from: b */
                    public final Intent f11552b;

                    /* renamed from: c */
                    public final PayResultCallbackReason f11553c;

                    {
                        this.f11551a = r2;
                        this.f11552b = r3;
                        this.f11553c = r4;
                    }

                    /* renamed from: a */
                    public AnonymousClass1WxPayCallbackResult mo1761a() {
                        Intent intent = this.f11552b;
                        int intExtra = intent != null ? intent.getIntExtra("key_is_clear_failure", -1) : -1;
                        HashMap hashMap = new HashMap();
                        if (intExtra == 0) {
                            hashMap.put("payStatus", "pending");
                        } else if (intExtra == 1) {
                            hashMap.put("pay_status", "fail");
                        }
                        Intent intent2 = this.f11552b;
                        if (intent2 != null) {
                            String stringExtra = intent2.getStringExtra("key_pay_fail_reason");
                            if (!Util.isNullOrNil(stringExtra)) {
                                hashMap.put("fail_reason", stringExtra);
                            }
                            String stringExtra2 = this.f11552b.getStringExtra("key_pay_completed_data");
                            if (!Util.isNullOrNil(stringExtra2)) {
                                hashMap.put("payCompletedData", stringExtra2);
                            }
                        }
                        int i = this.f11551a;
                        if (i == -1) {
                            return new Object(AppBrandJsApiPayService.this, 1, 0, (String) null, hashMap) {

                                /* renamed from: a */
                                public final int f11555a;

                                /* renamed from: b */
                                public final int f11556b;

                                /* renamed from: c */
                                public final String f11557c;

                                /* renamed from: d */
                                public final Map<String, Object> f11558d;

                                {
                                    this.f11555a = r2;
                                    this.f11556b = r3;
                                    this.f11557c = r4;
                                    this.f11558d = r5;
                                }
                            };
                        }
                        if (i != 5) {
                            return new Object(AppBrandJsApiPayService.this, 3, 0, (String) null, hashMap) {

                                /* renamed from: a */
                                public final int f11555a;

                                /* renamed from: b */
                                public final int f11556b;

                                /* renamed from: c */
                                public final String f11557c;

                                /* renamed from: d */
                                public final Map<String, Object> f11558d;

                                {
                                    this.f11555a = r2;
                                    this.f11556b = r3;
                                    this.f11557c = r4;
                                    this.f11558d = r5;
                                }
                            };
                        }
                        int intExtra2 = this.f11552b.getIntExtra("key_jsapi_pay_err_code", 0);
                        String nullAsNil = Util.nullAsNil(this.f11552b.getStringExtra("key_jsapi_pay_err_msg"));
                        Log.m105921e("MicroMsg.AppBrandJsApiPayService", "errCode: %d, errMsg: %s", Integer.valueOf(intExtra2), nullAsNil);
                        return new Object(AppBrandJsApiPayService.this, 2, intExtra2, nullAsNil, hashMap) {

                            /* renamed from: a */
                            public final int f11555a;

                            /* renamed from: b */
                            public final int f11556b;

                            /* renamed from: c */
                            public final String f11557c;

                            /* renamed from: d */
                            public final Map<String, Object> f11558d;

                            {
                                this.f11555a = r2;
                                this.f11556b = r3;
                                this.f11557c = r4;
                                this.f11558d = r5;
                            }
                        };
                    }
                };
                boolean z = true;
                if (payResultCallbackReason != payResultCallbackReason2 && payResultCallbackReason == payResultCallbackReason2) {
                    z = false;
                }
                if (z) {
                    AnonymousClass1WxPayActivityResultAdapter r4 = this.f11559a;
                    if (r4.f11553c == payResultCallbackReason2 && (bVar instanceof C1794c)) {
                        AnonymousClass1WxPayCallbackResult a = r4.mo1761a();
                        ((C1794c) bVar).mo1766a(a.f11555a, a.f11556b, a.f11557c, a.f11558d);
                    }
                }
            }
        };
        walletJsapiData.f24074R = ResultReceiverFixLeak.m100671a(new ResultReceiver(this, r112) {

            /* renamed from: g */
            public final AnonymousClass1WxPayResultDispatcher f11550g;

            {
                this.f11550g = r3;
            }

            /* renamed from: a */
            public void mo883a(int i, Bundle bundle) {
                bundle.setClassLoader(WalletJsapiData.class.getClassLoader());
                this.f11550g.mo1762a(i, new Intent().putExtras(bundle), PayResultCallbackReason.SuccessAheadCallback);
            }
        }, activity);
        if (kVar.getRuntime() instanceof AppBrandRuntimeWC) {
            walletJsapiData.f24094z = ((AppBrandRuntimeWC) kVar.getRuntime()).mo113194Y1() ? 1 : 0;
        }
        if (bVar3 != null) {
            bVar3.mo1750dE();
        }
        final C82554k kVar2 = kVar;
        final C1792b bVar4 = bVar;
        final AnonymousClass1WxPayResultDispatcher r6 = r112;
        return AppBrandJsApiPayUtils.m101644c(activity, new C32226l<MMActivity, C13598b0>(this) {
            public Object invoke(Object obj) {
                ((C15919f) C86312j.m106911c(C15919f.class)).Q50((MMActivity) obj, walletJsapiData, hashCode, new MMActivity.C6739d() {
                    public void mmOnActivityResult(int i, int i2, Intent intent) {
                        C17761 r0 = C17761.this;
                        if (hashCode != i) {
                            Object[] objArr = new Object[2];
                            int i3 = 0;
                            objArr[0] = kVar2.getAppId();
                            C1792b bVar = bVar4;
                            if (bVar != null) {
                                i3 = bVar.hashCode();
                            }
                            objArr[1] = Integer.valueOf(i3);
                            Log.m105929w("MicroMsg.AppBrandJsApiPayService", "startPay mismatch requestCode, appId:%s, listener.hash[%d]", objArr);
                            return;
                        }
                        r6.mo1762a(i2, intent, PayResultCallbackReason.ActivityResult);
                    }
                });
                return C13598b0.f38549a;
            }
        }, new g$$e(this) {
            /* renamed from: a */
            public void mo1626a(int i, Intent intent) {
                r112.mo1762a(i, intent, PayResultCallbackReason.ActivityResult);
                AnonymousClass1WxPayResultDispatcher r4 = r112;
                C1761b bVar = bVar3;
                if (bVar != null) {
                    bVar.mo1751iF();
                }
                AnonymousClass1WxPayActivityResultAdapter r5 = r4.f11559a;
                Objects.requireNonNull(r5);
                AnonymousClass1WxPayCallbackResult a = r5.mo1761a();
                C1792b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.mo1764b(a.f11555a, a.f11556b, a.f11557c, a.f11558d);
                }
            }
        });
    }

    public void startPayComponent(Activity activity, AppBrandStatObject appBrandStatObject, String str, Map<String, String> map, C1790a aVar) {
        AppBrandJsApiPayUtils.m101643b(activity, new C32226l<MMActivity, C13598b0>(appBrandStatObject, str, map, aVar) {

            /* renamed from: d */
            public final /* synthetic */ String f11544d;

            /* renamed from: e */
            public final /* synthetic */ Map f11545e;

            /* renamed from: f */
            public final /* synthetic */ C1790a f11546f;

            {
                this.f11544d = r3;
                this.f11545e = r4;
                this.f11546f = r5;
            }

            public Object invoke(Object obj) {
                AppBrandJsApiPayService appBrandJsApiPayService = AppBrandJsApiPayService.this;
                String str = this.f11544d;
                Map map = this.f11545e;
                C1790a aVar = this.f11546f;
                appBrandJsApiPayService.getClass();
                C178012 r6 = new MMActivity.C6739d(aVar) {

                    /* renamed from: d */
                    public final /* synthetic */ C1790a f11548d;

                    {
                        this.f11548d = r2;
                    }

                    public void mmOnActivityResult(int i, int i2, Intent intent) {
                        Bundle extras;
                        Set<String> keySet;
                        if (i == (AppBrandJsApiPayService.this.hashCode() & 65535) && this.f11548d != null) {
                            HashMap hashMap = new HashMap();
                            if (!(intent == null || (extras = intent.getExtras()) == null || (keySet = extras.keySet()) == null)) {
                                for (String next : keySet) {
                                    hashMap.put(next, extras.get(next));
                                }
                            }
                            if (i2 == -1) {
                                this.f11548d.mo1763a("ok", hashMap);
                            } else if (i2 == 5) {
                                this.f11548d.mo1763a("fail", hashMap);
                            } else if (i2 == 0) {
                                this.f11548d.mo1763a("cancel", hashMap);
                            }
                        }
                    }
                };
                ((C15919f) C86312j.m106911c(C15919f.class)).ci0((MMActivity) obj, str, map, appBrandJsApiPayService.hashCode() & 65535, r6);
                return C13598b0.f38549a;
            }
        });
    }

    public boolean startPayToBank(Activity activity, AppBrandStatObject appBrandStatObject, JSONObject jSONObject, final C1792b bVar) {
        final WalletJsapiData walletJsapiData = new WalletJsapiData(jSONObject);
        if (appBrandStatObject != null) {
            walletJsapiData.f24090v = walletJsapiData.mo7619a(appBrandStatObject.f245533f, appBrandStatObject.f245536i);
            walletJsapiData.f24092x = appBrandStatObject.f245533f;
        }
        walletJsapiData.f24088t = 46;
        final C17823 r4 = new MMActivity.C6739d() {
            public void mmOnActivityResult(int i, int i2, Intent intent) {
                if (i == (AppBrandJsApiPayService.this.hashCode() & 65535)) {
                    boolean booleanExtra = intent != null ? intent.getBooleanExtra("is_new_cashier", false) : false;
                    String str = "1";
                    if (i2 == -1) {
                        HashMap hashMap = new HashMap();
                        String nullAs = Util.nullAs(intent.getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN), "");
                        String nullAs2 = Util.nullAs(intent.getStringExtra("bind_serial"), "");
                        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, nullAs);
                        hashMap.put("bindSerial", nullAs2);
                        if (!booleanExtra) {
                            str = "0";
                        }
                        hashMap.put("is_new_cashier", str);
                        C1792b bVar = bVar;
                        if (bVar != null) {
                            bVar.mo1764b(1, 0, (String) null, hashMap);
                        }
                    } else if (bVar != null) {
                        HashMap hashMap2 = new HashMap();
                        if (!booleanExtra) {
                            str = "0";
                        }
                        hashMap2.put("is_new_cashier", str);
                        bVar.mo1764b(2, 0, (String) null, hashMap2);
                    }
                }
            }
        };
        return AppBrandJsApiPayUtils.m101643b(activity, new C32226l<MMActivity, C13598b0>() {
            public Object invoke(Object obj) {
                MMActivity mMActivity = (MMActivity) obj;
                Intent intent = new Intent();
                intent.putExtra("appId", walletJsapiData.f24075d);
                intent.putExtra("timeStamp", walletJsapiData.f24079h);
                intent.putExtra("nonceStr", walletJsapiData.f24078g);
                intent.putExtra("packageExt", walletJsapiData.f24080i);
                intent.putExtra("signtype", walletJsapiData.f24077f);
                intent.putExtra("paySignature", walletJsapiData.f24084p);
                intent.putExtra("url", walletJsapiData.f24086r);
                intent.putExtra("pay_scene", walletJsapiData.f24089u);
                mMActivity.mmSetOnActivityResultCallback(r4);
                C88144b.m109796n(mMActivity, "wallet", ".pay.ui.WalletLoanRepaymentUI", intent, AppBrandJsApiPayService.this.hashCode() & 65535, false);
                return C13598b0.f38549a;
            }
        });
    }

    public void verifyPassword(Activity activity, AppBrandStatObject appBrandStatObject, JSONObject jSONObject, final C1796d dVar) {
        final C17889 r4 = new MMActivity.C6739d() {
            public void mmOnActivityResult(int i, int i2, Intent intent) {
                if (i == (AppBrandJsApiPayService.this.hashCode() & 65535)) {
                    if (i2 == -1) {
                        String str = "";
                        if (intent != null) {
                            str = Util.nullAs(intent.getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN), str);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            Log.m105924i("MicroMsg.AppBrandJsApiPayService", "checkPwdToken is valid, verifyWCPayPassword:ok");
                            C1796d dVar = dVar;
                            if (dVar != null) {
                                dVar.mo1767a(true, str);
                                return;
                            }
                            return;
                        }
                        Log.m105924i("MicroMsg.AppBrandJsApiPayService", "checkPwdToken is empty, verifyWCPayPassword:fail");
                        C1796d dVar2 = dVar;
                        if (dVar2 != null) {
                            dVar2.mo1767a(false, (String) null);
                            return;
                        }
                        return;
                    }
                    C1796d dVar3 = dVar;
                    if (dVar3 != null) {
                        dVar3.mo1767a(false, (String) null);
                    }
                }
            }
        };
        WalletJsapiData walletJsapiData = new WalletJsapiData(jSONObject);
        final Intent intent = new Intent();
        intent.putExtra("appId", walletJsapiData.f24075d);
        intent.putExtra("timeStamp", walletJsapiData.f24079h);
        intent.putExtra("nonceStr", walletJsapiData.f24078g);
        intent.putExtra("packageExt", walletJsapiData.f24080i);
        intent.putExtra("signtype", walletJsapiData.f24077f);
        intent.putExtra("paySignature", walletJsapiData.f24084p);
        intent.putExtra("url", walletJsapiData.f24086r);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        AppBrandJsApiPayUtils.m101643b(activity, new C32226l<MMActivity, C13598b0>() {
            public Object invoke(Object obj) {
                MMActivity mMActivity = (MMActivity) obj;
                mMActivity.mmSetOnActivityResultCallback(r4);
                C88144b.m109796n(mMActivity, "wallet_core", ".ui.WalletCheckPwdUI", intent, AppBrandJsApiPayService.this.hashCode() & 65535, false);
                return C13598b0.f38549a;
            }
        });
    }
}
