package com.google.protobuf;

import com.google.protobuf.C23832g0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.j2 */
public class C23847j2 extends C23849k2<C23832g0.C23835c<Object>, Object> {
    public C23847j2(int i) {
        super(i, (C23847j2) null);
    }

    /* renamed from: i */
    public void mo37712i() {
        if (!this.f68346g) {
            for (int i = 0; i < mo37720e(); i++) {
                Map.Entry c = mo37717c(i);
                if (((C23832g0.C23835c) c.getKey()).mo37662E0()) {
                    c.setValue(Collections.unmodifiableList((List) c.getValue()));
                }
            }
            for (Map.Entry entry : mo37723f()) {
                if (((C23832g0.C23835c) entry.getKey()).mo37662E0()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo37712i();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
