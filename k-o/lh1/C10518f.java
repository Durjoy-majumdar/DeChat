package lh1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: lh1.f */
public final class C10518f implements MMFragmentActivity$$f {

    /* renamed from: a */
    public static final C10518f f31764a = new C10518f();

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (i2 == -1) {
            ArrayList<String> stringArrayListExtra = intent2 != null ? intent2.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new ArrayList<>(0);
            }
            Iterator<T> it = stringArrayListExtra.iterator();
            String str = "";
            while (true) {
                boolean z = true;
                if (it.hasNext()) {
                    String str2 = (String) it.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    if (str.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        str2 = ';' + str2;
                    }
                    sb.append(str2);
                    str = sb.toString();
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("share_username", str);
                    jSONObject.put("type", 6);
                    jSONObject.put("share_type", 1);
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "JSONObject().also { j ->…             }.toString()");
                    C7335d c = C86312j.m106911c(C54116w.class);
                    C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                    C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_SCREEN_SHOT, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                    return;
                }
            }
        }
    }
}
