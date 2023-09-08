package e93;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: e93.c */
public final class C7604c<T> implements ValueCallback {

    /* renamed from: a */
    public static final C7604c<T> f25871a = new C7604c<>();

    public void onReceiveValue(Object obj) {
        Log.m105926v("MicroMsg.WebPrefetcherInterceptor", "write performance:" + ((String) obj));
    }
}
