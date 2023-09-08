package aw0;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Set;

/* renamed from: aw0.d */
public class C0225d {
    /* renamed from: a */
    public static void m177a(Bundle bundle, String str, Object obj) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else {
            Log.m105929w("MicroMsg.FloatBallIntentUtil", "put not support type, key:%s, value:%s", str, obj);
        }
    }

    /* renamed from: b */
    public static void m178b(Intent intent, Bundle bundle, Set<String> set) {
        Bundle bundle2 = new Bundle();
        for (String next : set) {
            if (bundle.containsKey(next)) {
                m177a(bundle2, next, bundle.get(next));
            }
        }
        intent.putExtras(bundle2);
    }

    /* renamed from: c */
    public static void m179c(Intent intent, Bundle bundle, Set<String> set) {
        if (intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            for (String next : set) {
                if (extras.containsKey(next)) {
                    m177a(bundle, next, extras.get(next));
                }
            }
        }
    }
}
