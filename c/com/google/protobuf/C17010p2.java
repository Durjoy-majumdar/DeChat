package com.google.protobuf;

import com.google.protobuf.C24025t;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.p2 */
public class C17010p2 {

    /* renamed from: b */
    public static final /* synthetic */ int f46016b = 0;

    /* renamed from: a */
    public final Map<String, C24025t.C24027b> f46017a;

    /* renamed from: com.google.protobuf.p2$a */
    public static class C17011a {

        /* renamed from: a */
        public static final C17010p2 f46018a = new C17010p2(Collections.emptyMap());
    }

    static {
        Logger.getLogger(C17010p2.class.getName());
    }

    public C17010p2(Map<String, C24025t.C24027b> map) {
        this.f46017a = map;
    }

    /* renamed from: a */
    public final C24025t.C24027b mo18765a(String str) {
        String[] split = str.split("/");
        if (split.length == 1) {
            throw new C23922p0(str.length() != 0 ? "Invalid type url found: ".concat(str) : new String("Invalid type url found: "));
        }
        return this.f46017a.get(split[split.length - 1]);
    }
}
