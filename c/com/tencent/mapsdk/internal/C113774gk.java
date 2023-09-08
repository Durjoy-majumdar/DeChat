package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.gk */
public final class C113774gk extends C113793gw {
    @Json(name = "styles")

    /* renamed from: a */
    private List<C113775a> f340391a = new ArrayList();

    /* renamed from: com.tencent.mapsdk.internal.gk$a */
    public static class C113775a extends C113793gw {
        @Json(name = "id")

        /* renamed from: a */
        public int f340392a;
        @Json(name = "showCount")

        /* renamed from: b */
        public int f340393b = 1;

        public C113775a(long j, int i) {
            super(j);
            this.f340392a = i;
        }

        /* renamed from: b */
        private static /* synthetic */ int m156999b(C113775a aVar) {
            int i = aVar.f340393b + 1;
            aVar.f340393b = i;
            return i;
        }
    }

    public C113774gk(long j) {
        super(j);
    }

    /* renamed from: a */
    public final int mo172140a(int i) {
        for (C113775a next : this.f340391a) {
            if (next.f340392a == i) {
                int i2 = next.f340393b + 1;
                next.f340393b = i2;
                return i2;
            }
        }
        this.f340391a.add(new C113775a(this.f340445g, i));
        return 1;
    }
}
