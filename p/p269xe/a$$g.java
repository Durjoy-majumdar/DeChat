package p269xe;

import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import j20.C21152b;
import java.util.HashMap;
import java.util.Map;
import zt3.C119157j;

/* renamed from: xe.a$$g */
public class a$$g implements C21152b {
    /* renamed from: a */
    public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        C91177a.m114419c("wakelock", str, str2, str3, str4, str5, obj, objArr);
        if (!AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            return;
        }
        if ((!"acquire".equals(str4) && !"release".equals(str4)) || !(obj instanceof PowerManager.WakeLock)) {
            return;
        }
        if (objArr == null || objArr.length == 0) {
            Map<Integer, Pair<String, Long>> map = C91177a.f261418d;
            synchronized (map) {
                char c = 65535;
                int hashCode = str4.hashCode();
                if (hashCode != -1164222250) {
                    if (hashCode == 1090594823) {
                        if (str4.equals("release")) {
                            c = 1;
                        }
                    }
                } else if (str4.equals("acquire")) {
                    c = 0;
                }
                if (c == 0) {
                    String b = C91177a.m114418b((PowerManager.WakeLock) obj);
                    if (!TextUtils.isEmpty(b)) {
                        Integer valueOf = Integer.valueOf(obj.hashCode());
                        ((HashMap) map).put(valueOf, new Pair(b + "@" + obj.hashCode() + "@" + str, Long.valueOf(SystemClock.uptimeMillis())));
                    }
                } else if (c == 1) {
                    Pair pair = (Pair) ((HashMap) map).remove(Integer.valueOf(obj.hashCode()));
                    if (pair != null) {
                        long uptimeMillis = SystemClock.uptimeMillis() - ((Long) pair.second).longValue();
                        if (uptimeMillis >= 1800000) {
                            ((C119157j) C119157j.f356862d).mo183875f(new a$$g$$a(pair, uptimeMillis));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
    }
}
