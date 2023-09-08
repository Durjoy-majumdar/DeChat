package c30;

import android.util.Log;
import org.json.JSONException;

/* renamed from: c30.f */
public class C79923f extends JSONException {
    public C79923f(String str) {
        super(str);
    }

    public C79923f(Throwable th) {
        super(Log.getStackTraceString(th));
    }
}
