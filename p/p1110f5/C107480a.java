package p1110f5;

import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: f5.a */
public final class C107480a<K, V> {

    /* renamed from: a */
    public final C107481a<K, V> f321586a = new C107481a<>(null);

    /* renamed from: b */
    public final HashMap<K, C107481a<K, V>> f321587b = new HashMap<>();

    /* renamed from: f5.a$a */
    public static final class C107481a<K, V> {

        /* renamed from: a */
        public final K f321588a;

        /* renamed from: b */
        public List<V> f321589b;

        /* renamed from: c */
        public C107481a<K, V> f321590c = this;

        /* renamed from: d */
        public C107481a<K, V> f321591d = this;

        public C107481a(K k) {
            this.f321588a = k;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedMultimap( ");
        C107481a<K, V> aVar = this.f321586a.f321591d;
        while (!C87412m.m108589b(aVar, this.f321586a)) {
            sb.append('{');
            sb.append(aVar.f321588a);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            List<V> list = aVar.f321589b;
            sb.append(list == null ? 0 : ((ArrayList) list).size());
            sb.append('}');
            aVar = aVar.f321591d;
            if (!C87412m.m108589b(aVar, this.f321586a)) {
                sb.append(", ");
            }
        }
        sb.append(" )");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
