package com.tencent.kinda.framework.module.impl;

import android.content.Intent;
import com.tencent.kinda.gen.KJSEvent;
import com.tencent.kinda.gen.KindaJSEventType;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

public class KindaJSEvent implements KJSEvent {
    private static final String TAG = "MicroMsg.KindaJSEvent";
    private KindaJsEventDelegate mDelegate;
    private KindaJSEventType mEventType = KindaJSEventType.WEB;
    @Deprecated
    private MMActivity.C6739d mIMMOnActivityResult;
    @Deprecated
    private int mRequestCode;
    @Deprecated
    private int mResultCode = 0;

    public interface KindaJsEventDelegate extends KJSEvent {
    }

    public void kindaCloseWebViewImpl(boolean z, VoidCallback voidCallback) {
        KindaJsEventDelegate kindaJsEventDelegate = this.mDelegate;
        if (kindaJsEventDelegate != null) {
            kindaJsEventDelegate.kindaCloseWebViewImpl(z, voidCallback);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("key_jsapi_close_page_after_pay", z ? 1 : 0);
        Log.m105925i(TAG, "[kindaCloseWebViewImpl] The data from JsApiPayUseCase: isCloseWebView: %b", Boolean.valueOf(z));
        MMActivity.C6739d dVar = this.mIMMOnActivityResult;
        if (dVar != null) {
            dVar.mmOnActivityResult(this.mRequestCode, this.mResultCode, intent);
        }
        if (voidCallback != null) {
            voidCallback.call();
        }
    }

    public void kindaEndWithResult(String str, HashMap<String, String> hashMap) {
        String str2;
        String str3;
        int i;
        KindaJsEventDelegate kindaJsEventDelegate = this.mDelegate;
        if (kindaJsEventDelegate != null) {
            kindaJsEventDelegate.kindaEndWithResult(str, hashMap);
            return;
        }
        if (hashMap != null) {
            i = "pending".equals(hashMap.get("pay_status")) ? 0 : "fail".equals(hashMap.get("pay_status")) ? 1 : -1;
            str3 = hashMap.get("err_code");
            str2 = hashMap.get("err_desc");
        } else {
            str3 = "";
            str2 = str3;
            i = -1;
        }
        Log.m105925i(TAG, "[kindaEndWithResult] The data from JsApiPayUseCase: result: %s, pay_status(isClearFailure): %d, err_code: %s, err_desc: %s", str, Integer.valueOf(i), str3, str2);
        Intent intent = new Intent();
        this.mResultCode = 0;
        if (str.endsWith("ok")) {
            this.mResultCode = -1;
            intent.putExtra("key_is_clear_failure", i);
        } else if (str.endsWith("fail")) {
            this.mResultCode = 5;
            intent.putExtra("key_jsapi_pay_err_code", str3);
            intent.putExtra("key_jsapi_pay_err_msg", str2);
            intent.putExtra("key_is_clear_failure", i);
        }
        intent.putExtra("key_pay_fail_reason", hashMap.get("fail_reason"));
        intent.putExtra("key_pay_completed_data", hashMap.get("payCompletedData"));
        Log.m105925i(TAG, "has fail_reason: %s, has payCompletedData: %s", hashMap.get("fail_reason"), hashMap.get("payCompletedData"));
        MMActivity.C6739d dVar = this.mIMMOnActivityResult;
        if (dVar != null) {
            dVar.mmOnActivityResult(this.mRequestCode, this.mResultCode, intent);
        }
    }

    public KindaJSEventType kindaGetType() {
        KindaJsEventDelegate kindaJsEventDelegate = this.mDelegate;
        return kindaJsEventDelegate != null ? kindaJsEventDelegate.kindaGetType() : this.mEventType;
    }

    public void setDelegate(KindaJsEventDelegate kindaJsEventDelegate) {
        this.mDelegate = kindaJsEventDelegate;
    }

    public void setIMMOnActivityResult(MMActivity.C6739d dVar) {
        this.mIMMOnActivityResult = dVar;
    }

    public void setRequestCode(int i) {
        this.mRequestCode = i;
    }

    public void setType(KindaJSEventType kindaJSEventType) {
        this.mEventType = kindaJSEventType;
    }
}
