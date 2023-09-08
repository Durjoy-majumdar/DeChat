package com.tencent.kinda.framework.app;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.provider.Settings;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import b63.C113146l;
import b63.C67199q0;
import bh3.C113177k;
import bp3.C104160f;
import bp3.C79758p;
import cc0.C92411b;
import com.tencent.kinda.framework.widget.base.MMKView;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.AndroidDpiLevel;
import com.tencent.kinda.gen.IOSDevice;
import com.tencent.kinda.gen.IPlatformUtil;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KView;
import com.tencent.kinda.gen.LocationInfoStruct;
import com.tencent.kinda.gen.Platform;
import com.tencent.kinda.gen.VoidF32F32BoolCallback;
import com.tencent.kinda.gen.VoidStringCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckLanguageChangeEvent;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.C75240v;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C86312j;
import eb0.C116734h6;
import eb0.C75576f4;
import eb0.C75588k6;
import f40.C86709a0;
import h81.C32735h;
import ie3.C76324c;
import java.util.Set;
import java.util.regex.Pattern;
import jc2.C117343c;
import kr0.C76630x0;
import l20.C21388a;
import lg3.C76695c;
import lg3.C88494d;
import oa1.C117731d;
import p156gj.C87203t;
import p206nj.C76860a;
import p281yz.C79173v;
import p327ct.C30914c;
import p626nv.C109759g;
import p702ts.C78085c;
import qe3.C89625d;
import te3.iy4;
import te3.tg4;
import xi3.C78844a;

public class KindaPlatformUtil implements IPlatformUtil {
    private static final String DCEP_PACKAGE = "cn.gov.pbc.dcep";
    private static final String SINGLE_BYTE_CHARSET_FOR_SAVE = "ISO-8859-1";
    private final String TAG = "KindaPlatformUtil";
    private final IListener checkLanguageChangeIListener = new IListener<CheckLanguageChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1187832230;
        }

        public boolean callback(CheckLanguageChangeEvent checkLanguageChangeEvent) {
            if (KindaPlatformUtil.this.languageChangeCallback == null) {
                return true;
            }
            KindaPlatformUtil.this.languageChangeCallback.call(KindaPlatformUtil.this.currentLanguageCode());
            return true;
        }
    };
    /* access modifiers changed from: private */
    public VoidStringCallback languageChangeCallback = null;

    private float getDensity(Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    private C72994y1.C72995a[] getRedDotKey(String str) {
        C72994y1.C72995a aVar = C72994y1.C72995a.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
        if (str.equalsIgnoreCase("receipt")) {
            return new C72994y1.C72995a[]{C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_F2F_COLLECT_STRING_SYNC, aVar};
        } else if (str.equalsIgnoreCase("reward")) {
            return new C72994y1.C72995a[]{C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC, aVar};
        } else if (str.equalsIgnoreCase("groupaa")) {
            return new C72994y1.C72995a[]{C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC, aVar};
        } else if (str.equalsIgnoreCase("faceHongBao")) {
            return new C72994y1.C72995a[]{C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_F2F_HB_STRING_SYNC, aVar};
        } else if (!str.equalsIgnoreCase("transferBank") && !str.equalsIgnoreCase("transferMobile") && !str.equalsIgnoreCase("transferMix")) {
            return null;
        } else {
            return new C72994y1.C72995a[]{C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_BANK_REMIT_STRING_SYNC, aVar};
        }
    }

    private int getRedDotTipsId(String str) {
        if (str.equalsIgnoreCase("receipt")) {
            return 17;
        }
        if (str.equalsIgnoreCase("reward")) {
            return 19;
        }
        if (str.equalsIgnoreCase("groupaa")) {
            return 16;
        }
        if (str.equalsIgnoreCase("faceHongBao")) {
            return 18;
        }
        return (str.equalsIgnoreCase("transferBank") || str.equalsIgnoreCase("transferMobile") || str.equalsIgnoreCase("transferMix")) ? 20 : 0;
    }

    private boolean isDcepInstalled() {
        return C72688j0.m85020f(MMApplicationContext.getContext(), DCEP_PACKAGE);
    }

    public void accessibilityAnnounce(KView kView, String str) {
        if (kView != null && (kView instanceof MMKView)) {
            View view = ((MMKView) kView).getView();
            if (view == null) {
                Log.m105920e("KindaPlatformUtil", "announce view is null");
            } else {
                view.announceForAccessibility(str);
            }
        }
    }

    public void accessibilityFocus(KView kView) {
        if (kView != null && (kView instanceof MMKView)) {
            final View view = ((MMKView) kView).getView();
            if (view == null) {
                Log.m105920e("KindaPlatformUtil", "focusFirst view is null");
            } else {
                view.post(new Runnable() {
                    public void run() {
                        view.sendAccessibilityEvent(128);
                    }
                });
            }
        }
    }

    public int androidAPILevel() {
        return Build.VERSION.SDK_INT;
    }

    public AndroidDpiLevel androidDpiLevel() {
        return AndroidDpiLevel.UNKNOWN;
    }

    public byte[] base64Decode(String str) {
        return Base64.decode(str, 0);
    }

    public String base64DecodeString(String str) {
        return Util.isNullOrNil(str) ? "" : new String(Base64.decode(str, 0));
    }

    public String base64Encode(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    public void beginIgnoringInteractionEvents() {
    }

    public String currentLanguageCode() {
        return LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
    }

    public Platform currentPlatform() {
        return Platform.ANDROID;
    }

    public boolean delSecurityStore(String str) {
        return false;
    }

    public float dynamicFontSize(float f) {
        return KindaContext.get() != null ? MMKViewUtil.getScaleSize(KindaContext.get()) * f : f;
    }

    public float dynamicSize(float f) {
        return f;
    }

    public float dynamicSizeByFontLevel(float f, int i) {
        return f * getScaleByFontLevel(i);
    }

    public void endIgnoringInteractionEvents() {
    }

    public void finalize() {
        this.checkLanguageChangeIListener.dead();
    }

    public String genUUID() {
        return C87203t.m108273i();
    }

    public String getAndroidRepairConfig(String str) {
        if (!str.equals("use_biometric_prompt")) {
            return "";
        }
        return "" + C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Pay_UseBiometricPrompt_Int, 0);
    }

    public float getBottomSafeAreaHeight() {
        return 0.0f;
    }

    public LocationInfoStruct getCachedLocationInfo() {
        Log.m105924i("KindaPlatformUtil", "get cached location info");
        LocationInfoStruct locationInfoStruct = new LocationInfoStruct();
        if (isDcepInstalled() || ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_dcep_address_logic_revert, false)) {
            iy4 iy4 = new iy4();
            C86709a0.m107528h();
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
            if (Util.isNullOrNil(str)) {
                Log.m105924i("KindaPlatformUtil", "no location cache data");
            } else {
                try {
                    iy4.parseFrom(str.getBytes("ISO-8859-1"));
                } catch (Exception e) {
                    Log.m105928w("KindaPlatformUtil", "parse cacheString exp, " + e.getLocalizedMessage());
                }
                locationInfoStruct.mProvince = iy4.f135760f;
                locationInfoStruct.mCity = iy4.f135761g;
                locationInfoStruct.mDistrict = iy4.f135762h;
            }
            ((C76324c) C86312j.m106911c(C76324c.class)).updateLocationCacheIfNeed(iy4.f135758d, iy4.f135759e);
            return locationInfoStruct;
        }
        Log.m105924i("KindaPlatformUtil", "dcep app is not install, ignore get address data");
        return locationInfoStruct;
    }

    public boolean getExptBoolValue(String str) {
        String f = C117731d.m166007c().mo182444f(str, "", false, false);
        return !Util.isNullOrNil(f) && Util.getInt(f, 0) != 0;
    }

    public int getFontLevel() {
        float scaleSize = MMKViewUtil.getScaleSize(KindaContext.get());
        int i = 0;
        while (true) {
            float[] fArr = MMKViewUtil.fontLevel;
            if (i >= fArr.length) {
                return 1;
            }
            if (C85875k4.m106153J(scaleSize, fArr[i])) {
                return i;
            }
            i++;
        }
    }

    public float getIphoneSafeAreaBottomHeight() {
        return 0.0f;
    }

    public boolean getIsAccessibilityServiceRunning() {
        return C78844a.C15689b.f42385a.mo108842h(true);
    }

    public float getLoigcalResolutionHeight() {
        if (KindaContext.get() == null) {
            return 0.0f;
        }
        DisplayMetrics displayMetrics = KindaContext.get().getResources().getDisplayMetrics();
        return ((float) displayMetrics.heightPixels) / displayMetrics.density;
    }

    public float getLoigcalResolutionWidth() {
        if (KindaContext.get() == null) {
            return 0.0f;
        }
        DisplayMetrics displayMetrics = KindaContext.get().getResources().getDisplayMetrics();
        return ((float) displayMetrics.widthPixels) / displayMetrics.density;
    }

    public String getMemoryKVString(String str) {
        return "";
    }

    public float getNavigationBarHeight() {
        if (KindaContext.get() == null) {
            return 0.0f;
        }
        Context context = KindaContext.get();
        if (context instanceof MMActivity) {
            return ((float) C76860a.m92655a((MMActivity) context)) / getDensity(context);
        }
        Log.m105921e("KindaPlatformUtil", "KindaContext.get() is not MMActivity, is %s.", context.getClass().getName());
        return 0.0f;
    }

    public float getPadSplitHeight() {
        return getLoigcalResolutionHeight();
    }

    public float getPadSplitWidth() {
        return getLoigcalResolutionWidth();
    }

    public String getPlatformString(String str) {
        return "";
    }

    public float getPx(float f) {
        return KindaContext.get() != null ? f / KindaContext.get().getResources().getDisplayMetrics().density : f;
    }

    public int getRedDotStatus(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        int redDotTipsId = getRedDotTipsId(str);
        if (redDotTipsId != 0) {
            Pair<C115631n, tg4> c = ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175764c(new C117343c(redDotTipsId));
            if (c.first == C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT && c.second != null) {
                Log.m105925i("KindaPlatformUtil", "show reddot from new tips platform, key is %s", str);
                return 2;
            }
        }
        C72994y1.C72995a[] redDotKey = getRedDotKey(str);
        if (redDotKey != null) {
            if (((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33496d(redDotKey[0], redDotKey[1])) {
                Log.m105925i("KindaPlatformUtil", "show reddot from newxml, key is %s", str);
                return 1;
            }
        }
        return 0;
    }

    public String getRedDotWording(String str) {
        if (Util.isNullOrNil(str) || !str.equals("receipt")) {
            return null;
        }
        C86709a0.m107528h();
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_FACING_REDDOT_WORDING_STRING_SYNC, "");
    }

    public float getScaleByFontLevel(int i) {
        if (i < 0) {
            i = 0;
        } else {
            try {
                float[] fArr = MMKViewUtil.fontLevel;
                if (i >= fArr.length) {
                    i = fArr.length - 1;
                }
            } catch (Exception e) {
                Log.m105921e("KindaPlatformUtil", "getScaleByFontLevel error:%s", e.getMessage());
                return 1.0f;
            }
        }
        return MMKViewUtil.fontLevel[i];
    }

    public float getScreenBrightness() {
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            Log.m105920e("KindaPlatformUtil", "While getScreenBrightness, We can't get the activity on the top of stack, use system brightness");
            return getSystemBrightnessPercent();
        }
        WindowManager.LayoutParams attributes = topOrUIPageFragmentActivity.getWindow().getAttributes();
        if (attributes == null) {
            return 0.0f;
        }
        float f = attributes.screenBrightness;
        if (f == -1.0f) {
            return getSystemBrightnessPercent();
        }
        Log.m105925i("KindaPlatformUtil", "get current activity brightness :%s", Float.valueOf(f));
        return f;
    }

    public float getStatusBarHeight() {
        Context context = KindaContext.get();
        if (context != null) {
            return ((float) C85875k4.m106198o(context)) / getDensity(context);
        }
        return 0.0f;
    }

    public float getSystemBrightnessPercent() {
        Context context = MMApplicationContext.getContext();
        float f = 0.0f;
        if (context == null) {
            Log.m105924i("KindaPlatformUtil", "MMApplicationContext is null, return 0");
            return 0.0f;
        }
        try {
            int i = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            Log.m105925i("KindaPlatformUtil", "get system screen brightness :%s", Integer.valueOf(i));
            if (i < 0) {
                i = 0;
            }
            if (i > 255) {
                i = 255;
            }
            f = ((float) i) / 255.0f;
        } catch (Settings.SettingNotFoundException e) {
            Log.m105921e("KindaPlatformUtil", "ex %s", e.getMessage());
        }
        Log.m105925i("KindaPlatformUtil", "get screen brightness :%s", Float.valueOf(f));
        return f;
    }

    public void getUserLocationImpl(final VoidF32F32BoolCallback voidF32F32BoolCallback) {
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126407a(new C92411b.C92412a() {
            public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
                Log.m105925i("KindaPlatformUtil", "onGetLocation %b", Boolean.valueOf(z));
                ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this);
                if (z) {
                    voidF32F32BoolCallback.call(f, f2, z);
                } else {
                    voidF32F32BoolCallback.call(0.0f, 0.0f, !z);
                }
                return false;
            }
        }, true);
    }

    public float getViewScale() {
        return C88494d.f255615g;
    }

    public IOSDevice iOSDevice() {
        return IOSDevice.UNKNOWN;
    }

    public String iOSVersion() {
        return null;
    }

    public boolean isCareModeOn() {
        return C76695c.m92341b();
    }

    public boolean isForAndroidTest() {
        return BuildInfo.DEBUG || WeChatEnvironment.hasDebugger() || C89625d.f257845k || BuildInfo.IS_FLAVOR_P_ALPHA;
    }

    public boolean isLocationAuthorized() {
        return ((C113177k) C86312j.m106911c(C113177k.class)).ls0(MMApplicationContext.getContext(), "android.permission.ACCESS_FINE_LOCATION", C113177k.C113178a.PAY.f338662e) == C113177k.C79703c.GRANTED;
    }

    public boolean isNetworkConnected() {
        return NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext());
    }

    public boolean isPad() {
        return false;
    }

    public boolean isScreenCaptured() {
        return false;
    }

    public byte[] loadSecurityStore(String str) {
        return new byte[0];
    }

    public void makesureLonglink() {
        Pattern pattern = C75228t.f221346a;
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C75240v(), (String) null));
    }

    public String md5(String str) {
        return MD5Util.getMD5String(str);
    }

    public void openTinyApp(ITransmitKvData iTransmitKvData) {
        String string = iTransmitKvData.getString("KindaTinyAppUserName");
        String string2 = iTransmitKvData.getString("KindaTinyAppPath");
        String string3 = iTransmitKvData.getString("KindaTinyAppVersion");
        int i = Util.getInt(iTransmitKvData.getString("KindaTinyAppScene"), 0);
        int i2 = Util.getInt(iTransmitKvData.getString("KindaTinyAppType"), 0);
        if (Util.isNullOrNil(string)) {
            Log.m105920e("KindaPlatformUtil", "failed openTinyApp for empty appusername");
            return;
        }
        C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
        C86299o oVar = new C86299o();
        oVar.f250929a = string;
        oVar.f250934f = string2;
        int i3 = Util.getInt(string3, 0);
        if (i3 > 0) {
            oVar.f250932d = i3;
        }
        if (i == 0) {
            oVar.f250939k = 1034;
        } else {
            oVar.f250939k = i;
        }
        if (i2 == 0) {
            oVar.f250931c = 0;
        } else {
            oVar.f250931c = 2;
        }
        x0Var.mo106898tv(MMApplicationContext.getContext(), oVar);
    }

    public void playVibration() {
        try {
            Context context = KindaContext.get();
            if (context == null) {
                Log.m105920e("KindaPlatformUtil", "KindaContext get null while playVibration!");
                return;
            }
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator == null) {
                Log.m105920e("KindaPlatformUtil", "playVibration call getSystemService get null!");
            } else {
                vibrator.vibrate(15);
            }
        } catch (Exception e) {
            Log.m105921e("KindaPlatformUtil", "playVibration exception %s", e.getMessage());
        }
    }

    public String resolveLanguageStringForGlobal(String str) {
        return C116734h6.m164662r(str);
    }

    public String resolveURLStringForGlobal(String str) {
        Set<Runnable> set = C116734h6.f350034a;
        int i = WeChatBrands.UserInfo.xagreementId;
        if (i == 0 || i == 1) {
            return str;
        }
        int indexOf = str.indexOf("://");
        String str2 = "";
        String str3 = "";
        String str4 = "";
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf + 3);
            if (!str2.startsWith("http")) {
                return str;
            }
        }
        if (indexOf >= 0) {
            str = str.substring(indexOf + 3);
        }
        int indexOf2 = str.indexOf("/");
        if (indexOf2 >= 0) {
            str4 = str.substring(indexOf2);
        }
        if (indexOf2 >= 0) {
            str = str.substring(0, indexOf2);
        }
        int indexOf3 = str.indexOf(XVFSFile.PATH_SEPARATOR);
        if (indexOf3 >= 0) {
            String substring = str.substring(0, indexOf3);
            str3 = str.substring(indexOf3);
            str = substring;
        }
        if (C116734h6.C75585e.f222060a == null) {
            Context context = MMApplicationContext.getContext();
            synchronized (C116734h6.C75585e.class) {
                if (C116734h6.C75585e.f222060a == null) {
                    C116734h6.C116736d.m164666b(context, C0966R.raw.domain_mainland, new C75588k6());
                }
            }
        }
        String c = C116734h6.C116736d.f350037b.apply(C116734h6.C75585e.f222060a.get(str), new PInt());
        return str2 + c + str3 + str4;
    }

    public boolean saveSecurityStore(String str, byte[] bArr) {
        return false;
    }

    public void setIdleTimerDisable(boolean z) {
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            Log.m105920e("KindaPlatformUtil", "While setIdleTimerDisable, We can't get the activity on the top of stack");
        } else if (z) {
            topOrUIPageFragmentActivity.getWindow().addFlags(128);
        } else {
            topOrUIPageFragmentActivity.getWindow().clearFlags(128);
        }
    }

    public void setLanguageChangeCallbackImpl(VoidStringCallback voidStringCallback) {
        this.languageChangeCallback = voidStringCallback;
        this.checkLanguageChangeIListener.alive();
    }

    public void setRedDotStatus(String str, boolean z) {
        if (!Util.isNullOrNil(str)) {
            int redDotTipsId = getRedDotTipsId(str);
            if (redDotTipsId != 0 && !z) {
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(redDotTipsId);
            }
            C72994y1.C72995a[] redDotKey = getRedDotKey(str);
            if (redDotKey != null && !z) {
                ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33501j(redDotKey[0], redDotKey[1]);
            }
        }
    }

    public void setReportLocationState(boolean z, boolean z2) {
        Log.m105925i("KindaPlatformUtil", "setLocationState, set wifiSsidState as: [%b], set cellInfoState as [%b].", Boolean.valueOf(z), Boolean.valueOf(z2));
        C67199q0 p = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91334p();
        p.getClass();
        Log.m105925i("MicroMsg.WalletSwitchConfig", "setReportLocation, set wifiSsidState as: [%b], set cellInfoState as [%b].", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (z) {
            p.f192928a |= 262144;
        } else {
            p.f192928a &= -262145;
        }
        if (z2) {
            p.f192928a |= 8388608;
        } else {
            p.f192928a &= -8388609;
        }
        Log.m105925i("MicroMsg.WalletSwitchConfig", "setReportLocation, After set, switchBit is [%d]", Integer.valueOf(p.f192928a));
    }

    public void setScreenBrightness(float f) {
        Log.m105925i("KindaPlatformUtil", "set brightness to : %s", Float.valueOf(f));
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            Log.m105920e("KindaPlatformUtil", "While setScreenBrightness, We can't get the activity on the top of stack");
        } else if (f == -1.0f || (topOrUIPageFragmentActivity instanceof UIPageFragmentActivity)) {
            Log.m105925i("KindaPlatformUtil", "start set brightness to %s, activity is %s", Float.valueOf(f), topOrUIPageFragmentActivity);
            WindowManager.LayoutParams attributes = topOrUIPageFragmentActivity.getWindow().getAttributes();
            if (attributes != null) {
                attributes.screenBrightness = f;
                topOrUIPageFragmentActivity.getWindow().setAttributes(attributes);
            }
        } else {
            Log.m105921e("KindaPlatformUtil", "While set brightness to %s, We can't get the UIPageFragmentActivity on the top of stack, which we get is %s", Float.valueOf(f), topOrUIPageFragmentActivity);
            C115669n.INSTANCE.idkeyStat(1105, 107, 1, false);
        }
    }

    public void setStatusBarHidden(boolean z, boolean z2) {
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (!(topOrUIPageFragmentActivity instanceof UIPageFragmentActivity)) {
            Log.m105920e("KindaPlatformUtil", "While setStatusBarHidden, We can't get the UIPageFragmentActivity on the top of stack, which we get is [" + topOrUIPageFragmentActivity + "]");
        } else if (z) {
            topOrUIPageFragmentActivity.getWindow().addFlags(1024);
        } else {
            topOrUIPageFragmentActivity.getWindow().clearFlags(1024);
        }
    }

    public String sha256(byte[] bArr, boolean z) {
        return "";
    }

    public boolean shouldReportCellInfo() {
        return C113146l.m154809g();
    }

    public boolean shouldReportLocation() {
        return C113146l.m154810h();
    }

    public boolean shouldReportWifiSsid() {
        return C113146l.m154811i();
    }

    public boolean supportSecurityStore() {
        return false;
    }
}
