package com.tencent.kinda.framework.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.eclipsesource.mmv8.Platform;
import com.tencent.kinda.framework.app.FingerprintInsets;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.BioType;
import com.tencent.kinda.gen.FingerType;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KFingerprintService;
import com.tencent.kinda.gen.KPoint;
import com.tencent.kinda.gen.KRect;
import com.tencent.kinda.gen.KSize;
import com.tencent.kinda.gen.VoidBinaryI32Callback;
import com.tencent.kinda.gen.VoidBoolCallback;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.kinda.gen.VoidStringBinaryCallback;
import com.tencent.kinda.gen.VoidStringCallback;
import com.tencent.kinda.gen.VoidStringStringCallback;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GenFingerPrintRsaKeyEvent;
import com.tencent.p014mm.autogen.events.KindaActivityPauseEvent;
import com.tencent.p014mm.autogen.events.ReleaseFingerPrintAuthEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.xweb.util.ReflectionUtils;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.io.IOException;
import java.util.Arrays;
import kg3.C76577a;
import org.json.JSONException;
import org.json.JSONObject;
import ot3.C77037c;
import ot3.C77038j;
import p156gj.C45918i0;
import p281yz.C79173v;
import pv2.C77290d;
import rt1.C22249a;
import st1.C77761h0;
import st1.C77781t;
import te3.C77906b8;
import tt1.C78089c;
import tt1.C78090d;
import tt1.C78091e;
import tt1.C78092f;
import tt1.C78101i;
import vt1.C78473a;

public class KindaFingerprintImpl implements KFingerprintService {
    /* access modifiers changed from: private */
    public static FingerType cacheFingerType;
    /* access modifiers changed from: private */
    public static KRect cacheRect;
    /* access modifiers changed from: private */
    public static boolean cacheValid;
    /* access modifiers changed from: private */
    public static FingerprintInsets vivoFingerHelper;
    public String TAG = "KindaFingerprintImpl";
    private IListener<KindaActivityPauseEvent> activetyListener = new IListener<KindaActivityPauseEvent>(C40008f.f107254d) {
        {
            this.__eventId = -974003024;
        }

        public boolean callback(KindaActivityPauseEvent kindaActivityPauseEvent) {
            if (!(kindaActivityPauseEvent == null || KindaFingerprintImpl.this.changePwdCallback == null)) {
                KindaFingerprintImpl.this.changePwdCallback.call(false);
            }
            return false;
        }
    };
    /* access modifiers changed from: private */
    public VoidBoolCallback changePwdCallback;
    public int identify_num = 0;
    public C78473a mgr = ((C78473a) C86709a0.m107533q(C78473a.class));
    private Dialog tipDialog = null;

    public void authenticateImpl(String str, String str2, ITransmitKvData iTransmitKvData, final VoidBinaryI32Callback voidBinaryI32Callback, final VoidCallback voidCallback, final VoidBoolCallback voidBoolCallback, VoidStringCallback voidStringCallback) {
        if (KindaContext.get() != null) {
            C77761h0.IML.f226590d = str2;
            new ReleaseFingerPrintAuthEvent().publish();
            C77290d.m93104b();
            Log.m105924i(this.TAG, "req fingerprint auth 2");
            C77290d.m93104b();
            C115669n.INSTANCE.mo175911u(1104, 38);
            C78101i iVar = (C78101i) C86709a0.m107533q(C78101i.class);
            C78092f fVar = new C78092f(str2, 1);
            fVar.f228896c = str;
            if (iTransmitKvData != null) {
                fVar.f228897d = iTransmitKvData.getString("prompt_title");
                fVar.f228898e = iTransmitKvData.getString("prompt_subtitle");
                fVar.f228899f = iTransmitKvData.getString("prompt_button");
            }
            iVar.mo108084rn(MMApplicationContext.getContext(), fVar, new C78090d() {
                public void onFail(C78091e eVar) {
                    C77290d.m93108f(2);
                    C78089c cVar = eVar.f228892c;
                    int i = cVar.f228884a;
                    if (i == 2005 || i == 2007) {
                        C115669n.INSTANCE.mo175911u(1104, 36);
                    }
                    int i2 = cVar.f228884a;
                    if (i2 == 10308 || i2 == 2 || i2 == 1001) {
                        Log.m105924i(KindaFingerprintImpl.this.TAG, "hy: FingerPrintAuthEvent callback, auth | fail max | common err | pipeline exception, should change to pwd!");
                        voidBoolCallback.call(true);
                    } else {
                        voidBoolCallback.call(false);
                    }
                    String str = KindaFingerprintImpl.this.TAG;
                    Log.m105924i(str, "FingerPrint fail! retry count: " + eVar.f228891b);
                }

                public void onRetry(C78091e eVar) {
                    C77290d.m93108f(1);
                    voidCallback.call();
                    String str = KindaFingerprintImpl.this.TAG;
                    Log.m105924i(str, "FingerPrint retry! retry count: " + eVar.f228891b);
                }

                public void onSuccess(C78091e eVar) {
                    Log.m105925i(KindaFingerprintImpl.this.TAG, "FingerPrint success!, encrypted_pay_info: %s, retry count: ", eVar.f228892c.f228886c, Integer.valueOf(eVar.f228891b));
                    C77906b8 b8Var = new C77906b8();
                    b8Var.f226987d = true;
                    C78089c cVar = eVar.f228892c;
                    b8Var.f226989f = cVar.f228886c;
                    b8Var.f226990g = cVar.f228887d;
                    b8Var.f226988e = eVar.f228891b;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("json", eVar.f228892c.f228888e);
                        jSONObject.put("signature", eVar.f228892c.f228889f);
                        jSONObject.put("soter_type", ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91317G());
                        b8Var.f226991h = jSONObject.toString();
                    } catch (JSONException e) {
                        Log.printErrStackTrace(KindaFingerprintImpl.this.TAG, e, "json exception while construct json for soter_req. message: %s", e.getMessage());
                    }
                    try {
                        voidBinaryI32Callback.call(b8Var.toByteArray(), eVar.f228892c.f228885b);
                    } catch (IOException e2) {
                        Log.printErrStackTrace(KindaFingerprintImpl.this.TAG, e2, "FingerPrint exception: %s", e2.getMessage());
                    }
                    C115669n.INSTANCE.mo175911u(1104, 37);
                    C77290d.m93108f(0);
                }
            });
            this.changePwdCallback = voidBoolCallback;
            this.activetyListener.alive();
        }
    }

    public void changeAuthKey(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("pwd", str);
        C78101i iVar = (C78101i) C86709a0.m107533q(C78101i.class);
        if (iVar.Km0() || iVar.mo73371F7()) {
            if (z2) {
                int i = 0;
                if (this.mgr.mo107880J3()) {
                    i = 1;
                } else if (this.mgr.mo107883Zi()) {
                    i = 2;
                }
                bundle.putInt("key_open_biometric_type", i);
            }
            this.mgr.mo107920vu(z, z2, bundle);
        }
    }

    public void closeTipDialog() {
        Dialog dialog = this.tipDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.tipDialog = null;
        }
    }

    public KRect getFingerPosition() {
        C77038j jVar;
        String str = Build.MANUFACTURER + "-" + Build.BRAND;
        Log.m105925i(this.TAG, "getFingerPosition start %s", str);
        KRect kRect = new KRect(new KPoint(0.0f, 0.0f), new KSize(0.0f, 0.0f));
        Context context = KindaContext.get();
        if (context == null || str == null) {
            return kRect;
        }
        String lowerCase = str.toLowerCase();
        try {
            if (lowerCase.contains("vivo")) {
                if (cacheValid) {
                    kRect = cacheRect;
                } else {
                    Log.m105924i(this.TAG, "vivo cache is invalid");
                }
            } else if (lowerCase.contains("meizu")) {
                kRect.mOrigin.f193408mX = (float) getSystemDimen(context, "under_glass_fp_x");
                kRect.mOrigin.f193409mY = (float) getSystemDimen(context, "under_glass_fp_y");
                kRect.mSize.mWidth = (float) getSystemDimen(context, "under_glass_fp_width");
                kRect.mSize.mHeight = (float) getSystemDimen(context, "under_glass_fp_height");
                Log.m105925i(this.TAG, "meizu pos is %s", kRect.toString());
            } else if (lowerCase.contains("huawei")) {
                Object invokeStatic = ReflectionUtils.invokeStatic("huawei.android.hardware.fingerprint.FingerprintManagerEx", "getHardwarePosition");
                if (invokeStatic != null) {
                    Log.m105925i(this.TAG, "huawei pos %s", invokeStatic.toString());
                    if (invokeStatic instanceof int[]) {
                        int[] iArr = (int[]) invokeStatic;
                        kRect.mOrigin.f193408mX = (float) C76577a.m92152c(context, iArr[0]);
                        kRect.mOrigin.f193409mY = (float) C76577a.m92152c(context, iArr[1]);
                    }
                } else {
                    Log.m105924i(this.TAG, "huawei pos is null");
                }
            } else if (lowerCase.contains("honor")) {
                Object invokeStatic2 = ReflectionUtils.invokeStatic("com.hihonor.android.hardware.fingerprint.FingerprintManagerEx", "getHardwarePosition");
                if (invokeStatic2 != null) {
                    Log.m105925i(this.TAG, "honor pos %s", invokeStatic2.toString());
                    if (invokeStatic2 instanceof int[]) {
                        int[] iArr2 = (int[]) invokeStatic2;
                        kRect.mOrigin.f193408mX = (float) C76577a.m92152c(context, iArr2[0]);
                        kRect.mOrigin.f193409mY = (float) C76577a.m92152c(context, iArr2[1]);
                    }
                } else {
                    Log.m105924i(this.TAG, "honor pos is null");
                }
            } else if (lowerCase.contains("xiaomi")) {
                String a = C45918i0.m51188a("persist.vendor.sys.fp.fod.location.X_Y");
                String a2 = C45918i0.m51188a("persist.vendor.sys.fp.fod.size.width_height");
                Log.m105925i(this.TAG, "xiaomi pos %s size %s", a, a2);
                if (!Util.isNullOrNil(a) && !Util.isNullOrNil(a2)) {
                    String[] split = a.replace(" ", "").split(",");
                    String[] split2 = a2.replace(" ", "").split(",");
                    if (split.length == 2 && split2.length == 2) {
                        kRect.mOrigin.f193408mX = (float) C76577a.m92152c(context, Integer.parseInt(split[0]) + (Integer.parseInt(split2[0]) / 2));
                        kRect.mOrigin.f193409mY = (float) C76577a.m92152c(context, Integer.parseInt(split[1]) + (Integer.parseInt(split2[1]) / 2));
                        kRect.mSize.mWidth = (float) C76577a.m92152c(context, Integer.parseInt(split2[0]));
                        kRect.mSize.mHeight = (float) C76577a.m92152c(context, Integer.parseInt(split2[1]));
                    }
                }
            } else {
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_soter_finger_type, 0) == 1) {
                    C77038j jVar2 = C77038j.f225047b;
                    if (jVar2 == null) {
                        synchronized (C77038j.class) {
                            if (C77038j.f225047b == null) {
                                C77038j.f225047b = new C77038j();
                            }
                            jVar = C77038j.f225047b;
                        }
                        jVar2 = jVar;
                    }
                    C77037c cVar = jVar2.f225048a;
                    int[] iArr3 = null;
                    Object a3 = cVar != null ? cVar.mo107364a("fingerprint_hardware_position", (Object) null) : null;
                    if (a3 instanceof int[]) {
                        iArr3 = (int[]) a3;
                    }
                    if (iArr3 != null) {
                        Log.m105925i(this.TAG, "soter pos is %s", Arrays.toString(iArr3));
                        if (iArr3.length == 4) {
                            kRect.mOrigin.f193408mX = (float) C76577a.m92152c(context, iArr3[0]);
                            kRect.mOrigin.f193409mY = (float) C76577a.m92152c(context, iArr3[1]);
                            kRect.mSize.mWidth = (float) C76577a.m92152c(context, iArr3[2] - iArr3[0]);
                            kRect.mSize.mHeight = (float) C76577a.m92152c(context, iArr3[3] - iArr3[1]);
                        } else {
                            Log.m105925i(this.TAG, "soter pos length %d is invalid", Integer.valueOf(iArr3.length));
                        }
                    } else {
                        Log.m105924i(this.TAG, "soter pos is null");
                    }
                } else {
                    Log.m105924i(this.TAG, "clicfg_android_soter_finger_type is 0");
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.TAG, e, "getFingerPosition", new Object[0]);
        }
        Log.m105925i(this.TAG, "getFingerPosition end %s", kRect.toString());
        return kRect;
    }

    public FingerType getFingerType() {
        Context context;
        C77038j jVar;
        FingerType fingerType;
        FingerType fingerType2 = FingerType.NONE;
        String str = Build.MANUFACTURER + "-" + Build.BRAND;
        Log.m105925i(this.TAG, "getFingerType start %s", str);
        if (str == null || (context = KindaContext.get()) == null) {
            return fingerType2;
        }
        String lowerCase = str.toLowerCase();
        try {
            if (!lowerCase.contains("vivo")) {
                if (lowerCase.contains("meizu")) {
                    Object fieldStatic = ReflectionUtils.getFieldStatic("flyme.config.FlymeFeature", "SHELL_UNDER_GLASS_FINGERPRINT");
                    Object fieldStatic2 = ReflectionUtils.getFieldStatic("flyme.config.FlymeFeature", "UNDER_GLASS_ULTRASONIC_FINGERPRINT");
                    if (fieldStatic instanceof Boolean) {
                        Log.m105925i(this.TAG, "meizu FingerType typeShell:%b", fieldStatic);
                        if (((Boolean) fieldStatic).booleanValue()) {
                            fingerType2 = FingerType.INSIDEFINGER;
                        }
                    } else {
                        Log.m105924i(this.TAG, "meizu FingerType typeShell is not boolean");
                    }
                    if (fieldStatic2 instanceof Boolean) {
                        Log.m105925i(this.TAG, "meizu FingerType typeUltrasonic:%b", fieldStatic2);
                        if (((Boolean) fieldStatic2).booleanValue()) {
                            fingerType = FingerType.INSIDEFINGER;
                        }
                    } else {
                        Log.m105924i(this.TAG, "meizu FingerType typeUltrasonic is not boolean");
                    }
                } else if (lowerCase.contains("huawei")) {
                    Object invokeStatic = ReflectionUtils.invokeStatic("huawei.android.hardware.fingerprint.FingerprintManagerEx", "getHardwareType");
                    if (invokeStatic instanceof Integer) {
                        Log.m105925i(this.TAG, "huawei FingerType is %s", invokeStatic.toString());
                        int intValue = ((Integer) invokeStatic).intValue();
                        if (intValue == 1 || intValue == 2) {
                            fingerType2 = FingerType.INSIDEFINGER;
                        }
                    }
                } else if (lowerCase.contains("honor")) {
                    Object invokeStatic2 = ReflectionUtils.invokeStatic("com.hihonor.android.hardware.fingerprint.FingerprintManagerEx", "getHardwareType");
                    if (invokeStatic2 instanceof Integer) {
                        Log.m105925i(this.TAG, "honor FingerType is %s", invokeStatic2.toString());
                        int intValue2 = ((Integer) invokeStatic2).intValue();
                        if (intValue2 == 1 || intValue2 == 2) {
                            fingerType2 = FingerType.INSIDEFINGER;
                        }
                    }
                } else if (lowerCase.contains("xiaomi")) {
                    String a = C45918i0.m51188a("ro.hardware.fp.fod");
                    Log.m105925i(this.TAG, "xiaomi FingerType is %s", a);
                    String a2 = C45918i0.m51188a("persist.vendor.sys.fp.fod.location.X_Y");
                    Log.m105925i(this.TAG, "xiaomi pos %s size %s", a2, C45918i0.m51188a("persist.vendor.sys.fp.fod.size.width_height"));
                    if ("true".equals(a) || !Util.isNullOrNil(a2)) {
                        fingerType = FingerType.INSIDEFINGER;
                    }
                } else {
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_soter_finger_type, 0) == 1) {
                        C77038j jVar2 = C77038j.f225047b;
                        if (jVar2 == null) {
                            synchronized (C77038j.class) {
                                if (C77038j.f225047b == null) {
                                    C77038j.f225047b = new C77038j();
                                }
                                jVar = C77038j.f225047b;
                            }
                            jVar2 = jVar;
                        }
                        C77037c cVar = jVar2.f225048a;
                        Object a3 = cVar != null ? cVar.mo107364a("fingerprint_type", 0) : null;
                        int intValue3 = a3 instanceof Integer ? ((Integer) a3).intValue() : 0;
                        Log.m105925i(this.TAG, "soter FingerType is %s", Integer.valueOf(intValue3));
                        if (intValue3 == 2) {
                            fingerType2 = FingerType.INSIDEFINGER;
                        }
                    } else {
                        Log.m105924i(this.TAG, "clicfg_android_soter_finger_type is 0");
                    }
                }
                fingerType2 = fingerType;
            } else if (cacheValid) {
                fingerType2 = cacheFingerType;
            } else {
                Log.m105924i(this.TAG, "vivo cache is invalid");
                FingerprintInsets.setDebugEnable(true);
                vivoFingerHelper = FingerprintInsets.create(context, new FingerprintInsets.FingerprintInsetsListener() {
                    public void onIconStateChanged(int i) {
                    }

                    public void onReady() {
                        try {
                            boolean hasUnderDisplayFingerprint = KindaFingerprintImpl.vivoFingerHelper.hasUnderDisplayFingerprint();
                            String str = KindaFingerprintImpl.this.TAG;
                            Log.m105924i(str, "vivo hasUdFeature " + hasUnderDisplayFingerprint);
                            if (hasUnderDisplayFingerprint) {
                                Rect fingerprintIconPosition = KindaFingerprintImpl.vivoFingerHelper.getFingerprintIconPosition();
                                String str2 = KindaFingerprintImpl.this.TAG;
                                Log.m105924i(str2, "vivo pos " + fingerprintIconPosition.toShortString());
                                FingerType unused = KindaFingerprintImpl.cacheFingerType = FingerType.INSIDEFINGER;
                                KRect unused2 = KindaFingerprintImpl.cacheRect = new KRect(new KPoint((float) fingerprintIconPosition.centerX(), (float) fingerprintIconPosition.centerY()), new KSize((float) fingerprintIconPosition.width(), (float) fingerprintIconPosition.height()));
                            } else {
                                FingerType unused3 = KindaFingerprintImpl.cacheFingerType = FingerType.NONE;
                                KRect unused4 = KindaFingerprintImpl.cacheRect = new KRect(new KPoint(0.0f, 0.0f), new KSize(0.0f, 0.0f));
                            }
                            boolean unused5 = KindaFingerprintImpl.cacheValid = true;
                            KindaFingerprintImpl.vivoFingerHelper.destroy();
                            FingerprintInsets unused6 = KindaFingerprintImpl.vivoFingerHelper = null;
                        } catch (Exception e) {
                            Log.printErrStackTrace(KindaFingerprintImpl.this.TAG, e, "getFingerType onReady", new Object[0]);
                        }
                    }
                });
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.TAG, e, "getFingerType", new Object[0]);
        }
        Log.m105925i(this.TAG, "getFingerType end %s", fingerType2.toString());
        return fingerType2;
    }

    public int getSystemDimen(Context context, String str) {
        int identifier = Resources.getSystem().getIdentifier(str, "dimen", Platform.ANDROID);
        int c = C76577a.m92152c(context, Resources.getSystem().getDimensionPixelSize(identifier));
        Log.m105925i(this.TAG, "getSystemDimen %s id is %d, val is %d", str, Integer.valueOf(identifier), Integer.valueOf(c));
        return c;
    }

    public boolean isNeedChangeAuthKey() {
        boolean qV = this.mgr.mo107914qV();
        C77761h0 h0Var = C77761h0.IML;
        boolean z = h0Var.f226592f || !qV;
        h0Var.f226592f = z;
        return z;
    }

    public void reGenFpRsaKeyImpl(boolean z, int i, String str, final VoidStringStringCallback voidStringStringCallback, final VoidCallback voidCallback) {
        final GenFingerPrintRsaKeyEvent genFingerPrintRsaKeyEvent = new GenFingerPrintRsaKeyEvent();
        genFingerPrintRsaKeyEvent.f193631e = null;
        genFingerPrintRsaKeyEvent.f193630d.f193632a = z;
        if (z) {
            showProgress();
        }
        GenFingerPrintRsaKeyEvent.C67704a aVar = genFingerPrintRsaKeyEvent.f193630d;
        aVar.f193633b = i;
        aVar.f193634c = str;
        genFingerPrintRsaKeyEvent.callback = new Runnable() {
            public void run() {
                Log.m105924i(KindaFingerprintImpl.this.TAG, "GenFingerPrintRsaKeyEvent callback");
                GenFingerPrintRsaKeyEvent.C67705b bVar = genFingerPrintRsaKeyEvent.f193631e;
                if (bVar != null && bVar.f193635a) {
                    Log.m105924i(KindaFingerprintImpl.this.TAG, "GenFingerPrintRsaKeyEvent callback, result.isSuccess is true");
                    KindaFingerprintImpl.this.closeTipDialog();
                    VoidStringStringCallback voidStringStringCallback = voidStringStringCallback;
                    if (voidStringStringCallback != null) {
                        voidStringStringCallback.call(bVar.f193636b, bVar.f193637c);
                    }
                } else if (bVar == null || bVar.f193635a) {
                    Log.m105924i(KindaFingerprintImpl.this.TAG, "GenFingerPrintRsaKeyEvent callback, result == null");
                } else {
                    Log.m105920e(KindaFingerprintImpl.this.TAG, "GenFingerPrintRsaKeyEvent callback, result.isSuccess is false");
                    KindaFingerprintImpl.this.closeTipDialog();
                    VoidCallback voidCallback = voidCallback;
                    if (voidCallback != null) {
                        voidCallback.call();
                    }
                }
            }
        };
        genFingerPrintRsaKeyEvent.asyncPublish(Looper.getMainLooper());
    }

    public void releaseService() {
        new ReleaseFingerPrintAuthEvent().publish();
        this.activetyListener.dead();
    }

    public void setNeedChangeAuthKey(boolean z) {
        C77761h0.IML.f226592f = z;
    }

    public void showBioAuthViewImpl(String str, String str2, VoidStringBinaryCallback voidStringBinaryCallback, VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3) {
    }

    public void showFaceIdAuthDialogImpl(String str, final VoidBinaryI32Callback voidBinaryI32Callback, final VoidCallback voidCallback, final VoidCallback voidCallback2) {
        Log.m105924i(this.TAG, "showFaceIdAuthDialogImpl begin");
        C77761h0.IML.f226590d = str;
        C115669n.INSTANCE.mo160131h(15817, 3);
        Bundle bundle = new Bundle();
        bundle.putInt("face_auth_scene", 1);
        ((C77781t) C86312j.m106911c(C77781t.class)).d60((MMActivity) KindaContext.get(), new C22249a() {
            public void onAuthCancel() {
                Log.m105924i(KindaFingerprintImpl.this.TAG, "face id auth cancel");
                VoidCallback voidCallback = voidCallback2;
                if (voidCallback != null) {
                    voidCallback.call();
                }
            }

            public void onAuthFail(int i) {
                Log.m105925i(KindaFingerprintImpl.this.TAG, "face id auth fail: %s, %s", Integer.valueOf(i), Integer.valueOf(KindaFingerprintImpl.this.identify_num));
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                KindaFingerprintImpl.this.identify_num++;
            }

            public void onAuthSuccess(int i, int i2) {
                Log.m105924i(KindaFingerprintImpl.this.TAG, "face id auth success");
                C77906b8 b8Var = new C77906b8();
                b8Var.f226987d = true;
                b8Var.f226989f = "";
                b8Var.f226990g = "";
                b8Var.f226991h = ((C78473a) C86709a0.m107533q(C78473a.class)).sw0();
                KindaFingerprintImpl kindaFingerprintImpl = KindaFingerprintImpl.this;
                int i3 = kindaFingerprintImpl.identify_num + 1;
                kindaFingerprintImpl.identify_num = i3;
                b8Var.f226988e = i3;
                try {
                    voidBinaryI32Callback.call(b8Var.toByteArray(), i);
                } catch (IOException unused) {
                }
            }
        }, bundle);
    }

    public void showProgress() {
        Dialog dialog = this.tipDialog;
        if (dialog == null || !dialog.isShowing()) {
            Dialog dialog2 = this.tipDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            if (KindaContext.get() != null) {
                this.tipDialog = C75197d0.m90164e(KindaContext.get(), false, new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                        KindaFingerprintImpl.this.closeTipDialog();
                    }
                });
            } else {
                Log.m105920e(this.TAG, "fingerprint loading error! KindaContext return null!!");
            }
        }
    }

    public BioType supportBioType() {
        C78473a aVar = this.mgr;
        if (aVar != null && aVar.mo107921ys() && !this.mgr.mo107884d6() && this.mgr.mo107880J3()) {
            return BioType.FINGERPRINT;
        }
        C78473a aVar2 = this.mgr;
        return (aVar2 == null || !aVar2.Fk0() || this.mgr.mo107879H0() || !this.mgr.mo107883Zi()) ? BioType.NONE : BioType.FACEID;
    }

    public void userCancel() {
        C78473a aVar = this.mgr;
        if (aVar != null) {
            aVar.userCancel();
        }
    }
}
