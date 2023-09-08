package com.tencent.p014mm.xwebutil;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.xwebutil.c */
public class C7097c implements ValueCallback<Integer> {

    /* renamed from: a */
    public final /* synthetic */ ValueCallback f25003a;

    public C7097c(ValueCallback valueCallback) {
        this.f25003a = valueCallback;
    }

    public void onReceiveValue(Object obj) {
        Integer num = (Integer) obj;
        Log.m105924i("XFilesReaderLogic", "readFileByXWeb onReceiveValue: " + num);
        if (num.intValue() == 0) {
            this.f25003a.onReceiveValue(0);
        } else {
            this.f25003a.onReceiveValue(-102);
        }
    }
}
