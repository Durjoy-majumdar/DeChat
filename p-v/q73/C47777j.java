package q73;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: q73.j */
public final class C47777j<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C89547f f128296a;

    /* renamed from: b */
    public final /* synthetic */ String f128297b;

    public C47777j(C89547f fVar, String str) {
        this.f128296a = fVar;
        this.f128297b = str;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        String str2 = this.f128296a.f257695B;
        Log.m105918d(str2, "exitUI# " + this.f128297b);
    }
}
