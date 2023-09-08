package com.tencent.kinda.framework.app;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.BioType;
import com.tencent.kinda.gen.FingerType;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KHKFingerPrintService;
import com.tencent.kinda.gen.KPoint;
import com.tencent.kinda.gen.KRect;
import com.tencent.kinda.gen.KSize;
import com.tencent.kinda.gen.VoidBinaryI32Callback;
import com.tencent.kinda.gen.VoidBoolCallback;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.kinda.gen.VoidStringCallback;
import com.tencent.kinda.gen.VoidStringStringCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.lang.ref.WeakReference;
import nv2.C21695a;
import nv2.C21708j;
import p447aw.C103918d;
import p602ly.C109440d;
import pv2.C22023p;
import pv2.C22024q;
import pv2.C77292s;
import qo3.C77398g;
import qo3.C89782m0;

public class KindaHKFingerprintImpl implements KHKFingerPrintService {
    public static HKSoterMpAuthenHandler ACTION_HANDLER = null;
    private static final String TAG = "MicroMsg.KindaHKFingerprintImpl";
    private static FingerType cacheFingerType;
    private static KRect cacheRect;
    private static boolean cacheValid;
    /* access modifiers changed from: private */
    public static C77398g mAuthenDialog;
    private static FingerprintInsets vivoFingerHelper;
    private VoidCallback cancelCallback;
    private String challengeString;
    private VoidCallback changePwdCallback;
    private VoidCallback failCallback;
    private boolean hasHandleCallback = false;
    private C21708j mController = null;
    private ProgressDialog mProgressDialog = null;
    private String reasonString;
    private VoidStringStringCallback succCallback;

    public static class HKSoterMpAuthenHandler extends Handler {
        private WeakReference<KindaHKFingerprintImpl> mUi;

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$0(int i, String[] strArr, int[] iArr) {
            this.mUi.get().handleOnRequestPermissionsResult(i, strArr, iArr);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            switch (i) {
                case 0:
                    Log.m105924i(KindaHKFingerprintImpl.TAG, "hy: inform ok");
                    C22024q qVar = (C22024q) message.obj;
                    WeakReference<KindaHKFingerprintImpl> weakReference = this.mUi;
                    if (weakReference == null || weakReference.get() == null) {
                        Log.m105928w(KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().informOk(qVar);
                        return;
                    }
                case 1:
                    Log.m105924i(KindaHKFingerprintImpl.TAG, "hy: inform cancel");
                    C22024q qVar2 = (C22024q) message.obj;
                    WeakReference<KindaHKFingerprintImpl> weakReference2 = this.mUi;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        Log.m105928w(KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().informCancel(qVar2);
                        return;
                    }
                case 2:
                    Log.m105924i(KindaHKFingerprintImpl.TAG, "hy: inform fail");
                    C22024q qVar3 = (C22024q) message.obj;
                    WeakReference<KindaHKFingerprintImpl> weakReference3 = this.mUi;
                    if (weakReference3 == null || weakReference3.get() == null) {
                        Log.m105928w(KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().informFail(qVar3);
                        return;
                    }
                case 3:
                    Log.m105924i(KindaHKFingerprintImpl.TAG, "hy: request permission");
                    WeakReference<KindaHKFingerprintImpl> weakReference4 = this.mUi;
                    if (weakReference4 == null || weakReference4.get() == null) {
                        Log.m105928w(KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    }
                    String[] stringArray = message.getData().getStringArray("permissions");
                    int i2 = message.getData().getInt("request_code");
                    if (stringArray == null || stringArray.length <= 1) {
                        Log.m105920e(KindaHKFingerprintImpl.TAG, "hy: permission null");
                        return;
                    } else {
                        ((C103918d) C86312j.m106911c(C103918d.class)).Jg0(KindaContext.getTopOrUIPageFragmentActivity(), i2, new KindaHKFingerprintImpl$HKSoterMpAuthenHandler$$a(this), new String[]{"android.permission.USE_FINGERPRINT"}, (String) null, (String) null);
                        return;
                    }
                case 4:
                    Log.m105924i(KindaHKFingerprintImpl.TAG, "hy: show progress");
                    WeakReference<KindaHKFingerprintImpl> weakReference5 = this.mUi;
                    if (weakReference5 == null || weakReference5.get() == null) {
                        Log.m105928w(KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().showProgress();
                        return;
                    }
                case 5:
                    Log.m105924i(KindaHKFingerprintImpl.TAG, "hy: dismiss progress");
                    WeakReference<KindaHKFingerprintImpl> weakReference6 = this.mUi;
                    if (weakReference6 == null || weakReference6.get() == null) {
                        Log.m105928w(KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().dismissProgress();
                        return;
                    }
                case 6:
                    Log.m105924i(KindaHKFingerprintImpl.TAG, "hy: show dialog");
                    WeakReference<KindaHKFingerprintImpl> weakReference7 = this.mUi;
                    if (weakReference7 == null || weakReference7.get() == null) {
                        Log.m105928w(KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        C77398g unused = KindaHKFingerprintImpl.mAuthenDialog = (C77398g) message.obj;
                        return;
                    }
                default:
                    Log.m105921e(KindaHKFingerprintImpl.TAG, "hy: unidentified msg: %d", Integer.valueOf(i));
                    return;
            }
        }

        private HKSoterMpAuthenHandler(KindaHKFingerprintImpl kindaHKFingerprintImpl) {
            this.mUi = null;
            this.mUi = new WeakReference<>(kindaHKFingerprintImpl);
        }
    }

    /* access modifiers changed from: private */
    public void dismissProgress() {
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.mProgressDialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void handleOnRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C21708j jVar = this.mController;
        if (jVar != null) {
            jVar.mo33963e(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: private */
    public void informCancel(C22024q qVar) {
        Log.m105924i(TAG, "inform cancel");
        if (this.hasHandleCallback) {
            Log.m105924i(TAG, "inform cancel has handled callbacl ignore");
            return;
        }
        this.hasHandleCallback = true;
        this.cancelCallback.call();
    }

    /* access modifiers changed from: private */
    public void informFail(C22024q qVar) {
        Log.m105924i(TAG, "inform fail");
        if (this.hasHandleCallback) {
            Log.m105924i(TAG, "inform fail has handled callbacl ignore");
            return;
        }
        this.hasHandleCallback = true;
        this.failCallback.call();
    }

    /* access modifiers changed from: private */
    public void informOk(C22024q qVar) {
        Log.m105924i(TAG, "inform ok");
        if (this.hasHandleCallback) {
            Log.m105924i(TAG, "inform ok has handled callbacl ignore");
            return;
        }
        this.hasHandleCallback = true;
        this.succCallback.call(qVar.f62345d, qVar.f62346e);
    }

    private void prepareData(C22023p pVar, C22024q qVar) {
        try {
            pVar.f62339a = Byte.parseByte(Util.nullAs("01", "00"), 16);
            pVar.f62340b = this.challengeString;
            pVar.f62341c = this.reasonString;
            if (!C77292s.m93116c()) {
                Log.m105920e(TAG, "hy: not support soter");
                qVar.f62342a = 90001;
                qVar.f62343b = "not support soter";
            } else if (pVar.f62339a <= 0) {
                Log.m105920e(TAG, "hy: param error: request mode illegal");
                qVar.f62342a = 90003;
                qVar.f62343b = "resp model error";
            } else if (Util.isNullOrNil(pVar.f62340b)) {
                Log.m105920e(TAG, "hy: param error: challenge null");
                qVar.f62342a = 90004;
                qVar.f62343b = "challenge is null";
            } else if (pVar.f62340b.length() >= 512) {
                Log.m105920e(TAG, "hy: param error: challenge too long");
                qVar.f62342a = 90004;
                qVar.f62343b = "challenge is too long. 512 chars at most";
            } else if (Util.isNullOrNil(pVar.f62341c)) {
                pVar.f62341c = KindaContext.get().getString(C0966R.string.jkt);
            } else if (pVar.f62341c.length() > 42) {
                Log.m105920e(TAG, "hy: param error: content too long. use default");
                pVar.f62341c = KindaContext.get().getString(C0966R.string.jkt);
            }
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            qVar.f62342a = 90003;
            qVar.f62343b = "authen mode is illegal: number format error. found: 0X01";
        }
    }

    /* access modifiers changed from: private */
    public void showProgress() {
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog == null || !progressDialog.isShowing()) {
            C89782m0 a = C89782m0.m112251a(KindaContext.get(), KindaContext.get().getString(C0966R.string.jks), false, (DialogInterface.OnCancelListener) null);
            this.mProgressDialog = a;
            a.show();
        }
    }

    public void authenticateImpl(String str, String str2, ITransmitKvData iTransmitKvData, VoidBinaryI32Callback voidBinaryI32Callback, VoidCallback voidCallback, VoidBoolCallback voidBoolCallback, VoidStringCallback voidStringCallback) {
    }

    public KRect getFingerPosition() {
        return new KRect(new KPoint(0.0f, 0.0f), new KSize(0.0f, 0.0f));
    }

    public FingerType getFingerType() {
        return FingerType.NONE;
    }

    public void releaseService() {
        C21708j jVar = this.mController;
        if (jVar != null) {
            jVar.getClass();
        }
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            Log.m105924i(TAG, "releaseService mProgressDialog dismiss!");
            this.mProgressDialog.dismiss();
        }
        C77398g gVar = mAuthenDialog;
        if (gVar != null && gVar.isShowing()) {
            Log.m105924i(TAG, "releaseService mAuthenDialog dismiss!");
            mAuthenDialog.dismiss();
        }
    }

    public void showBioAuthViewImpl(String str, String str2, VoidStringStringCallback voidStringStringCallback, VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3) {
        Class cls = C109440d.class;
        if (KindaContext.get() == null) {
            Log.m105924i(TAG, "context is null, invalid");
        } else if (KindaContext.getTopOrUIPageFragmentActivity() == null) {
            Log.m105924i(TAG, "kinda getTopOrUIPageFragmentActivity is null, invalid");
        } else {
            this.hasHandleCallback = false;
            ACTION_HANDLER = new HKSoterMpAuthenHandler();
            this.reasonString = str;
            this.challengeString = str2;
            this.succCallback = voidStringStringCallback;
            this.failCallback = voidCallback;
            this.cancelCallback = voidCallback2;
            this.changePwdCallback = voidCallback3;
            C22023p pVar = new C22023p();
            C22024q qVar = new C22024q();
            prepareData(pVar, qVar);
            if (qVar.f62342a != 0) {
                informFail(qVar);
                return;
            }
            C21708j a = C21695a.IML.mo33960a(KindaContext.getTopOrUIPageFragmentActivity(), pVar, qVar, ACTION_HANDLER);
            this.mController = a;
            if (a == null) {
                Log.m105920e(TAG, "no corresponding authen mode");
                qVar.f62342a = 90003;
                qVar.f62343b = "no corresponding mode";
                informFail(qVar);
                return;
            }
            a.f61434f = ((C109440d) C86312j.m106911c(cls)).mo160185zp();
            this.mController.f61433e = ((C109440d) C86312j.m106911c(cls)).qt0();
            C21708j jVar = this.mController;
            jVar.f61435g = 2;
            jVar.mo33962d((Bundle) null);
        }
    }

    public void showFaceIdAuthDialogImpl(String str, VoidBinaryI32Callback voidBinaryI32Callback, VoidCallback voidCallback, VoidCallback voidCallback2) {
    }

    public BioType supportBioType() {
        return C77292s.m93116c() ? BioType.FINGERPRINT : BioType.NONE;
    }
}
