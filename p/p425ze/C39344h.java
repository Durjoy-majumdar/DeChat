package p425ze;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ze.h */
public final class C39344h implements Serializable {

    /* renamed from: d */
    public final List<C91672j> f105755d;

    public C39344h(List<C91672j> list) {
        this.f105755d = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f105755d.size(); i++) {
            C91672j jVar = this.f105755d.get(i);
            sb.append("* ");
            if (i == 0) {
                sb.append("GC ROOT ");
            } else if (i == this.f105755d.size() - 1) {
                sb.append("leaks ");
            } else {
                sb.append("references ");
            }
            sb.append(jVar);
            sb.append(10);
        }
        return sb.toString();
    }
}
