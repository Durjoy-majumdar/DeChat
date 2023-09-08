package u73;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.io.IOException;
import te3.C48781ay3;

/* renamed from: u73.t0 */
public class C14137t0 {

    /* renamed from: a */
    public static C48781ay3 f39568a;

    /* renamed from: a */
    public static C48781ay3 m13477a() {
        if (f39568a == null) {
            f39568a = new C48781ay3();
            String string = MMApplicationContext.getContext().getSharedPreferences("fts_history_search_sp", 0).getString("key_pb_history_list" + C75592q0.m90789s(), "");
            if (!Util.isNullOrNil(string)) {
                try {
                    f39568a.parseFrom(Base64.decode(string.getBytes(), 0));
                } catch (IOException unused) {
                }
            }
        }
        return f39568a;
    }
}
