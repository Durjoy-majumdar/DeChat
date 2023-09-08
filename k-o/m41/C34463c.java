package m41;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.Map;
import m41.C34464d;

/* renamed from: m41.c */
public class C34463c extends C34464d.C34466b {

    /* renamed from: a */
    public final /* synthetic */ Object f92771a;

    public C34463c(Object obj) {
        this.f92771a = obj;
    }

    /* renamed from: a */
    public boolean mo59598a(Map map) {
        if (map == null) {
            return false;
        }
        Object obj = null;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (this.f92771a == map.get(next)) {
                obj = next;
                break;
            }
        }
        if (obj == null) {
            return false;
        }
        map.put(obj, "err_long");
        Log.m105920e("ParamsUtils", "[replaceParams] removeKey : " + obj);
        return true;
    }
}
