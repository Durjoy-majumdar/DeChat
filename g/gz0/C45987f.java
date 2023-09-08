package gz0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gz0.f */
public class C45987f {

    /* renamed from: a */
    public Map<String, Object> f124010a;

    /* renamed from: b */
    public CardInfo f124011b = null;

    public C45987f() {
        HashMap hashMap = new HashMap();
        this.f124010a = hashMap;
        hashMap.clear();
    }

    /* renamed from: a */
    public Object mo71382a(String str) {
        if (!TextUtils.isEmpty(str) && ((HashMap) this.f124010a).containsKey(str)) {
            return ((HashMap) this.f124010a).get(str);
        }
        return null;
    }

    /* renamed from: b */
    public void mo71383b(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.f124010a).put(str, obj);
        }
    }
}
