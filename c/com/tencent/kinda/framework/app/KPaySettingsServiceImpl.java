package com.tencent.kinda.framework.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KBioPayType;
import com.tencent.kinda.gen.KHbRefundWayType;
import com.tencent.kinda.gen.KPaySettingsService;
import com.tencent.kinda.gen.KTransferDelayType;
import com.tencent.kinda.gen.KXMLPayRedDot;
import com.tencent.kinda.gen.VoidBoolCallback;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CloseFingerPrintEvent;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletBiometricPaySettingsUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import l53.C76670a;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import tc0.C77885p;
import te3.C49490fz2;
import te3.C64353ez2;
import v53.C78342e0;
import vt1.C78473a;
import yq3.C79143a;
import yq3.C79148e;

public class KPaySettingsServiceImpl implements KPaySettingsService {
    private static final String TAG = "MicroMsg.KPaySettingsServiceImpl";
    private byte _hellAccFlag_;

    private void closeBioPay(final int i, final VoidBoolCallback voidBoolCallback) {
        Context context = KindaContext.get();
        KindaContext.getTopOrUIPageFragmentActivity();
        String string = context.getString(C0966R.string.eu9);
        if (i == 2) {
            string = context.getString(C0966R.string.clr);
        }
        C76879j.m92717K(context, false, string, "", context.getString(C0966R.string.a18), context.getString(C0966R.string.f7926wf), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                final Dialog d = C75197d0.m90163d(KindaContext.get(), false, false, (DialogInterface.OnCancelListener) null);
                final CloseFingerPrintEvent closeFingerPrintEvent = new CloseFingerPrintEvent();
                closeFingerPrintEvent.f78759d.f78761a = i;
                closeFingerPrintEvent.callback = new Runnable() {
                    public void run() {
                        if (closeFingerPrintEvent.f78760e == null) {
                            voidBoolCallback.call(false);
                            return;
                        }
                        Dialog dialog = d;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        Log.m105925i(KPaySettingsServiceImpl.TAG, "close event result: %s", Integer.valueOf(closeFingerPrintEvent.f78760e.f78762a));
                        if (closeFingerPrintEvent.f78760e.f78762a == 0) {
                            C86709a0.m107529k().f251779b.mo123460f(new C78342e0((String) null, 19));
                            voidBoolCallback.call(true);
                            return;
                        }
                        Context context = KindaContext.get();
                        String string = context.getString(C0966R.string.eua);
                        if (i == 2) {
                            string = context.getString(C0966R.string.l2t);
                        }
                        C76879j.m92712F(context, string, "", true);
                        voidBoolCallback.call(false);
                    }
                };
                closeFingerPrintEvent.asyncPublish(KindaContext.get().getMainLooper());
            }
        }, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                voidBoolCallback.call(false);
            }
        });
    }

    private JSONObject getRedDotConfig() {
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return null;
    }

    private String normalizedReddotId(String str) {
        return str + "_BOOLEAN_SYNC";
    }

    private void showEnrollBiometricGuideAlert(int i) {
        Log.m105925i(TAG, "show enroll biometric guide: %s", Integer.valueOf(i));
        Context context = KindaContext.get();
        String string = context.getString(C0966R.string.l3_);
        if (i == 1) {
            string = context.getString(C0966R.string.l3b);
        }
        C76879j.m92754y(context, string, "", context.getString(C0966R.string.l39), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
    }

    private void startOpenBioPayProcess(int i) {
        Log.m105925i(TAG, "start open process: %s", Integer.valueOf(i));
        Bundle bundle = new Bundle();
        bundle.putInt("key_open_biometric_type", i);
        C79143a.m95772k(KindaContext.getTopOrUIPageFragmentActivity(), FingerprintManagerProxy.FINGERPRINT_SERVICE, "FingerprintAuth", bundle, (C79148e.C79149a) null);
    }

    public void commitHbRefundWayTypeChange() {
        C64353ez2 ez22 = new C64353ez2();
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue();
        if ((longValue & 1) != 0) {
            ez22.f183059d = 1;
            ez22.f183060e = 2;
        } else if ((longValue & 2) != 0) {
            ez22.f183059d = 2;
            ez22.f183060e = 1;
        }
        Log.m105925i(TAG, "doSettingsOplog: extStatus: %s, set_bitmask: %s, clear_bitmask:%s", Long.toBinaryString(longValue), Long.toBinaryString(ez22.f183059d), Long.toBinaryString(ez22.f183060e));
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(218, ez22));
    }

    public void commitTransferDelayTypeChange() {
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119684e(147457, 0L)).longValue();
        int i = (16 & longValue) != 0 ? 1 : (longValue & 32) != 0 ? 2 : 0;
        C49490fz2 fz22 = new C49490fz2();
        fz22.f133752d = i;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(205, fz22));
    }

    public KHbRefundWayType getHbRefundWayType() {
        C86709a0.m107528h();
        return Util.isEqual(((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue() & 3, 2) ? KHbRefundWayType.ORIGIN : KHbRefundWayType.LQ;
    }

    public boolean getReddotStatus(String str) {
        C86709a0.m107528h();
        return ((Boolean) C86709a0.m107535s().mo121142i().mo119687h(normalizedReddotId(str), Boolean.FALSE)).booleanValue();
    }

    public KTransferDelayType getTransferDelayType() {
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119684e(147457, 0L)).longValue();
        return (16 & longValue) != 0 ? KTransferDelayType.DELAY2HOUR : (longValue & 32) != 0 ? KTransferDelayType.DELAY24HOUR : KTransferDelayType.NODELAY;
    }

    public int getTransferPhoneGrantFlag() {
        C86709a0.m107528h();
        return ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_SWITCH_GRANT_FLAG_INT_SYNC, 2)).intValue();
    }

    public KXMLPayRedDot getUnexpiredXMLReddot(String str) {
        JSONObject redDotConfig = getRedDotConfig();
        if (redDotConfig == null) {
            return new KXMLPayRedDot("", 0, "");
        }
        if (!(redDotConfig.optInt(str, 0) == 1)) {
            return new KXMLPayRedDot("", 0, "");
        }
        long optLong = redDotConfig.optLong(String.format("%s_expiretime", new Object[]{str}), 0);
        if (optLong <= 0 || System.currentTimeMillis() <= optLong) {
            return new KXMLPayRedDot(str, optLong, redDotConfig.optString(String.format("%s_wording", new Object[]{str})));
        }
        Log.m105925i(TAG, "Reddot expired: %s, expireTime=%d", str, Long.valueOf(optLong));
        return new KXMLPayRedDot("", 0, "");
    }

    public void handlePushBioPaySettingPageImpl(final VoidCallback voidCallback) {
        C675011 r0 = new ResultReceiver(new Handler(Looper.getMainLooper())) {
            public void onReceiveResult(int i, Bundle bundle) {
                voidCallback.call();
            }
        };
        Context context = KindaContext.get();
        Intent intent = new Intent(context, WalletBiometricPaySettingsUI.class);
        intent.putExtra("key_should_update_result_receiver", r0);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/kinda/framework/app/KPaySettingsServiceImpl", "handlePushBioPaySettingPageImpl", "(Lcom/tencent/kinda/gen/VoidCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/kinda/framework/app/KPaySettingsServiceImpl", "handlePushBioPaySettingPageImpl", "(Lcom/tencent/kinda/gen/VoidCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean isBioPayTypeEnabled(KBioPayType kBioPayType) {
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        return kBioPayType == KBioPayType.FACEID ? aVar.mo107883Zi() : aVar.mo107880J3();
    }

    public void logGeneralUserAction(int i) {
        C75228t.m90243e0(i, 1);
    }

    public void markReddotConsumed(String str) {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119678L(normalizedReddotId(str), Boolean.TRUE);
    }

    public void markXMLReddotConsumed(String str) {
        Log.m105925i(TAG, "clear reddot: %s", str);
        JSONObject redDotConfig = getRedDotConfig();
        if (redDotConfig != null) {
            redDotConfig.remove(str);
            redDotConfig.remove(String.format("%s_expiretime", new Object[]{str}));
            redDotConfig.remove(String.format("%s_wording", new Object[]{str}));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, redDotConfig.toString());
        }
    }

    public void setBioPayTypeEnabledImpl(KBioPayType kBioPayType, boolean z, VoidBoolCallback voidBoolCallback) {
        if (kBioPayType == KBioPayType.FACEID) {
            if (!z) {
                closeBioPay(2, voidBoolCallback);
            } else if (C76670a.m92323a()) {
                startOpenBioPayProcess(2);
                voidBoolCallback.call(true);
            } else {
                voidBoolCallback.call(false);
                showEnrollBiometricGuideAlert(2);
            }
        } else if (kBioPayType != KBioPayType.TOUCHID) {
        } else {
            if (!z) {
                closeBioPay(1, voidBoolCallback);
            } else if (C76670a.m92324b()) {
                startOpenBioPayProcess(1);
                voidBoolCallback.call(true);
            } else {
                voidBoolCallback.call(false);
                showEnrollBiometricGuideAlert(1);
            }
        }
    }

    public void setHbRefundWayType(KHbRefundWayType kHbRefundWayType) {
        C86709a0.m107528h();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC;
        long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
        if (kHbRefundWayType == KHbRefundWayType.LQ) {
            longValue = (longValue | 1) & -3;
        } else if (kHbRefundWayType == KHbRefundWayType.ORIGIN) {
            longValue = (longValue & -2) | 2;
        }
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(longValue));
    }

    public void setTransferDelayType(KTransferDelayType kTransferDelayType) {
        long j;
        long j2;
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119684e(147457, 0L)).longValue();
        if (kTransferDelayType == KTransferDelayType.NODELAY) {
            longValue = longValue & -17 & -33;
        } else {
            if (kTransferDelayType == KTransferDelayType.DELAY2HOUR) {
                j = longValue & -33;
                j2 = 16;
            } else if (kTransferDelayType == KTransferDelayType.DELAY24HOUR) {
                j = longValue & -17;
                j2 = 32;
            }
            longValue = j | j2;
        }
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(longValue));
    }

    public void setTransferPhoneGrantFlag(int i) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_SWITCH_GRANT_FLAG_INT_SYNC, Integer.valueOf(i));
    }

    public ArrayList<KBioPayType> supportedBioPayTypes() {
        ArrayList<KBioPayType> arrayList = new ArrayList<>();
        if (C76670a.m92323a()) {
            arrayList.add(KBioPayType.FACEID);
        }
        if (C76670a.m92324b()) {
            arrayList.add(KBioPayType.TOUCHID);
        }
        return arrayList;
    }
}
