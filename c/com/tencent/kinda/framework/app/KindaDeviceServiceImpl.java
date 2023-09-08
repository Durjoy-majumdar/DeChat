package com.tencent.kinda.framework.app;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KDeviceService;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;
import pv2.C110259i;
import qo3.C77426q;
import ub3.C78144b;
import vt1.C78473a;

public class KindaDeviceServiceImpl implements KDeviceService {
    private static final String TAG = "KindaDeviceServiceImpl";
    private byte _hellAccFlag_;
    private C78473a mgr = ((C78473a) C86709a0.m107533q(C78473a.class));

    public void invokePhoneCall(String str) {
        Log.m105925i(TAG, "invokePhoneCall, phoneNumber: %s", str);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("tel:" + str));
        try {
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/kinda/framework/app/KindaDeviceServiceImpl", "invokePhoneCall", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/kinda/framework/app/KindaDeviceServiceImpl", "invokePhoneCall", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (ActivityNotFoundException e) {
            C115669n.INSTANCE.mo175913w(1589, 5, 1);
            Log.printErrStackTrace(TAG, e, "invokePhoneCall: The device may not have a phone App installed! ", new Object[0]);
            Context context2 = KindaContext.get();
            if (context2 == null) {
                Log.m105920e(TAG, "KindaDeviceServiceImpl invokePhoneCall() KindaContext.get() return null! case 9");
                return;
            }
            C77426q qVar = new C77426q(context2);
            qVar.mo107595g(context2.getString(C0966R.string.kqe, new Object[]{str}));
            qVar.mo107601m(C0966R.string.kse);
            qVar.mo107603o();
        }
    }

    public boolean isDeviceOpenBiometricVerification() {
        if (!((C78144b) C86312j.m106911c(C78144b.class)).mo107979HA()) {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv.wallet");
            boolean z = mmkv.getBoolean("MMKV_KEY_HAS_FINGER", false);
            boolean z2 = mmkv.getBoolean("MMKV_KEY_HAS_FACE_ID", false);
            Log.m105924i(TAG, "KindaDeviceServiceImpl.isDeviceOpenBiometricVerification, use cache, isDeviceHasFingerPrint: " + z + ", isDeviceHasFaceID: " + z2);
            return z || z2;
        }
        C78473a aVar = this.mgr;
        if (aVar == null) {
            Log.m105928w(TAG, "KindaDeviceServiceImpl.isDeviceOpenBiometricVerification, mgr == null, return false.");
            return false;
        }
        boolean iw02 = aVar.iw0();
        boolean l3 = this.mgr.mo107913l3();
        Log.m105924i(TAG, "KindaDeviceServiceImpl.isDeviceOpenBiometricVerification, isDeviceHasFingerPrint: " + iw02 + ", isDeviceHasFaceID: " + l3);
        return iw02 || l3;
    }

    public boolean isDeviceSupportFaceId() {
        C78473a aVar = this.mgr;
        if (aVar == null) {
            Log.m105928w(TAG, "KindaDeviceServiceImpl.isDeviceSupportFaceId, mgr == null, return false.");
            return false;
        }
        boolean Fk0 = aVar.Fk0();
        Log.m105924i(TAG, "KindaDeviceServiceImpl.isDeviceSupportFaceId, return: " + Fk0);
        return Fk0;
    }

    public boolean isDeviceSupportTouchId() {
        C78473a aVar = this.mgr;
        if (aVar == null) {
            Log.m105928w(TAG, "KindaDeviceServiceImpl.isDeviceSupportFP, mgr == null, return false.");
            return false;
        }
        boolean ys = aVar.mo107921ys();
        Log.m105924i(TAG, "KindaDeviceServiceImpl.isDeviceSupportFP, return" + ys);
        return ys;
    }

    public boolean isDeviceTouchIdHardwareSupported() {
        return this.mgr != null;
    }

    public boolean isRoot() {
        C78473a aVar = this.mgr;
        if (aVar == null) {
            Log.m105928w(TAG, "KindaDeviceServiceImpl.isRoot, mgr == null, return false.");
            return false;
        }
        boolean isRoot = aVar.isRoot();
        Log.m105924i(TAG, "KindaDeviceServiceImpl.isRoot, return: " + isRoot);
        return isRoot;
    }

    public String soterCpuId() {
        String str = C110259i.m149874a().f329808a;
        Log.m105924i(TAG, "KindaDeviceServiceImpl.soterCpuId, return: " + str);
        return str;
    }

    public String soterUid() {
        String str = C110259i.m149874a().f329809b;
        Log.m105924i(TAG, "KindaDeviceServiceImpl.isDeviceSupportFaceId, return: " + str);
        return str;
    }

    public void updateBiometricVerificationState(int i, boolean z) {
        if (i == 0) {
            if (this.mgr.mo107921ys()) {
                this.mgr.mo107878Fg(z);
                this.mgr.W00(false);
            } else if (this.mgr.Fk0()) {
                this.mgr.W00(z);
                this.mgr.mo107878Fg(false);
            }
        } else if (i == 1 && this.mgr.mo107921ys()) {
            this.mgr.mo107878Fg(z);
            this.mgr.W00(false);
        } else if (i == 2 && this.mgr.Fk0()) {
            this.mgr.W00(z);
            this.mgr.mo107878Fg(false);
        }
        Log.m105924i(TAG, "KindaDeviceServiceImpl.updateBiometricVerificationState, soterOpenType: " + i + ", biometricVerificationState: " + z);
    }

    public boolean useLastestTouchInfo() {
        return false;
    }
}
