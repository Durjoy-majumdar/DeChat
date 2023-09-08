package q73;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: q73.i */
public final class C47776i<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C89547f f128294a;

    /* renamed from: b */
    public final /* synthetic */ String f128295b;

    public C47776i(C89547f fVar, String str) {
        this.f128294a = fVar;
        this.f128295b = str;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        String str2 = this.f128294a.f257695B;
        Log.m105918d(str2, "enterUI# " + this.f128295b);
    }
}
