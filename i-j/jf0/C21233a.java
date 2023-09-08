package jf0;

import java.util.List;
import kf0.C21332b;

/* renamed from: jf0.a */
public class C21233a<T> implements C21332b {

    /* renamed from: a */
    public List<T> f60030a;

    public C21233a(List<T> list) {
        this.f60030a = list;
    }

    /* renamed from: a */
    public String mo33223a(int i) {
        Object item = getItem(i);
        if (item == null) {
            item = "";
        } else if (!(item instanceof String)) {
            item = item.toString();
        }
        return (String) item;
    }

    public Object getItem(int i) {
        return (i < 0 || i >= this.f60030a.size()) ? "" : this.f60030a.get(i);
    }

    public int getItemsCount() {
        return this.f60030a.size();
    }
}
