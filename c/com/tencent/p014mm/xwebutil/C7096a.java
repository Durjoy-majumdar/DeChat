package com.tencent.p014mm.xwebutil;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.xwebutil.a */
public class C7096a implements ValueCallback<Integer> {

    /* renamed from: a */
    public final /* synthetic */ ValueCallback f25002a;

    public C7096a(ValueCallback valueCallback) {
        this.f25002a = valueCallback;
    }

    public void onReceiveValue(Object obj) {
        Integer num = (Integer) obj;
        Log.m105924i("XFilesReaderLogic", "readFileByX5 onReceiveValue: " + num);
        this.f25002a.onReceiveValue(num);
    }
}
