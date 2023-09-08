package cd0;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: cd0.c */
public class C28532c {
    /* renamed from: a */
    public static Bundle m38234a(String str) {
        Log.m105927v("MicroMsg.WebViewMMReportUtil", "create webview bundle name[%s]", str);
        Bundle bundle = new Bundle();
        bundle.putString("mm_event_class", str);
        return bundle;
    }
}
