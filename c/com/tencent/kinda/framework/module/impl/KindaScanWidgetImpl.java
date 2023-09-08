package com.tencent.kinda.framework.module.impl;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KScanWidget;
import com.tencent.kinda.gen.VoidStringStringBinaryCallback;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScanBankCardConfirmResultEvent;
import com.tencent.p014mm.autogen.events.ScanBankCardResultEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C7088m0;
import com.tenpay.ndk.Encrypt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import ke3.C88144b;
import yq3.C79144b;

public class KindaScanWidgetImpl implements KScanWidget {
    private static final String TAG = "KindaScanWidgetImpl";
    private boolean isDismissOnScanFinish = true;
    /* access modifiers changed from: private */
    public VoidStringStringBinaryCallback mCallback;
    /* access modifiers changed from: private */
    public IListener mScanBankCardResultListener;
    /* access modifiers changed from: private */
    public IListener scanBankCardConfirmResultListener;

    public KindaScanWidgetImpl() {
        C40008f fVar = C40008f.f107254d;
        this.scanBankCardConfirmResultListener = new IListener<ScanBankCardConfirmResultEvent>(fVar) {
            {
                this.__eventId = 582289590;
            }

            public boolean callback(ScanBankCardConfirmResultEvent scanBankCardConfirmResultEvent) {
                ScanBankCardConfirmResultEvent.C1125a aVar = scanBankCardConfirmResultEvent.f9461d;
                if (aVar.f9463b == 1 && !Util.isNullOrNil(aVar.f9462a) && KindaScanWidgetImpl.this.mCallback != null) {
                    ScanBankCardConfirmResultEvent.C1125a aVar2 = scanBankCardConfirmResultEvent.f9461d;
                    String str = aVar2.f9462a;
                    Bitmap bitmap = aVar2.f9464c;
                    String replaceAll = str.replaceAll("-", "").replaceAll(" ", "");
                    KindaScanWidgetImpl.this.mCallback.call(KindaScanWidgetImpl.this.getEncryptDataWithHash(replaceAll), replaceAll, KindaScanWidgetImpl.this.getBitmapByte(bitmap));
                }
                KindaScanWidgetImpl.this.scanBankCardConfirmResultListener.dead();
                return false;
            }
        };
        this.mScanBankCardResultListener = new IListener<ScanBankCardResultEvent>(fVar) {
            {
                this.__eventId = 96068484;
            }

            public boolean callback(ScanBankCardResultEvent scanBankCardResultEvent) {
                if (!Util.isNullOrNil(scanBankCardResultEvent.f9465d.f9466a) && KindaScanWidgetImpl.this.mCallback != null) {
                    ScanBankCardResultEvent.C1126a aVar = scanBankCardResultEvent.f9465d;
                    String str = aVar.f9466a;
                    Bitmap bitmap = aVar.f9467b;
                    String replaceAll = str.replaceAll("-", "").replaceAll(" ", "");
                    KindaScanWidgetImpl.this.mCallback.call(KindaScanWidgetImpl.this.getEncryptDataWithHash(replaceAll), replaceAll, KindaScanWidgetImpl.this.getBitmapByte(bitmap));
                }
                KindaScanWidgetImpl.this.mScanBankCardResultListener.dead();
                return false;
            }
        };
    }

    /* access modifiers changed from: private */
    public String getEncryptDataWithHash(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Encrypt encrypt = new Encrypt();
        encrypt.setTimeStamp(C7088m0.m7307a());
        C79144b.m95773a().mo109091f();
        return encrypt.encryptPasswdWithRSA2048(str);
    }

    public void dismissOnScanFinish(boolean z) {
        this.isDismissOnScanFinish = !z;
    }

    public byte[] getBitmapByte(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void scan(String str) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "KindaScanWidgetImpl scan() KindaContext.get() return null!");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("scan_bankcard_with_confirm_ui", this.isDismissOnScanFinish);
        intent.putExtra("bank_card_owner", str);
        intent.addFlags(536870912);
        C88144b.m109791i(context, "scanner", ".ui.ScanCardUI", intent, (Bundle) null);
        this.scanBankCardConfirmResultListener.alive();
        this.mScanBankCardResultListener.alive();
    }

    public void setHandlerImpl(VoidStringStringBinaryCallback voidStringStringBinaryCallback) {
        this.mCallback = voidStringStringBinaryCallback;
    }
}
