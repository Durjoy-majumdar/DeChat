package k21;

import gy3.C87412m;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: k21.a */
public final class C9558a<K, T> extends LinkedHashMap<K, T> {

    /* renamed from: d */
    public final String f29779d;

    public C9558a(String str) {
        C87412m.m108594g(str, "delimiter");
        this.f29779d = str;
    }

    public final /* bridge */ Set<Map.Entry<K, T>> entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set<K> keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public String toString() {
        if (super.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : entrySet()) {
            if (sb.length() == 0) {
                sb.append('\"' + entry.getKey() + "\":\"" + entry.getValue() + '\"');
            } else {
                sb.append(this.f29779d + '\"' + entry.getKey() + "\":\"" + entry.getValue() + '\"');
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append('{');
        sb4.append(sb);
        sb4.append('}');
        return sb4.toString();
    }

    public final /* bridge */ Collection<T> values() {
        return super.values();
    }
}
