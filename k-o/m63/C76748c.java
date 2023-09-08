package m63;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: m63.c */
public class C76748c {
    /* renamed from: a */
    public final int mo107013a(Intent intent) {
        if (intent == null) {
            mo107015c("Intent with no response code, assuming OK (known issue)");
            return 1;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            mo107015c("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            mo107015c("Unexpected type for intent response code.");
            mo107015c(obj.getClass().getName());
            throw new RuntimeException("Unexpected type for intent response code: " + obj.getClass().getName());
        }
    }

    /* renamed from: b */
    public void mo107014b(String str) {
        Log.m105918d("MicroMsg.IabResolver", str);
    }

    /* renamed from: c */
    public void mo107015c(String str) {
        Log.m105920e("MicroMsg.IabResolver", "In-app billing error: " + str);
    }
}
