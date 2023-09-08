package ys0;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: ys0.f */
public class C91583f implements C91582e {

    /* renamed from: a */
    public TreeMap<String, String> f262431a = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: a */
    public Iterator<String> mo125460a() {
        return Collections.unmodifiableSet(this.f262431a.keySet()).iterator();
    }

    /* renamed from: c */
    public String mo125461c(String str) {
        String str2 = this.f262431a.get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: e */
    public boolean mo125462e(String str) {
        return this.f262431a.containsKey(str);
    }

    /* renamed from: g */
    public void mo125463g(String str, String str2) {
        this.f262431a.put(str, str2);
    }
}
