package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.gq */
public final class C113781gq extends C113793gw {
    @Json(name = "ubs")

    /* renamed from: a */
    public C113782a f340399a;

    /* renamed from: com.tencent.mapsdk.internal.gq$a */
    public static class C113782a extends C113793gw {
        @Json(name = "showCount")

        /* renamed from: a */
        private int f340400a = 0;

        public C113782a(long j) {
            super(j);
        }

        /* renamed from: a */
        public final int mo172141a() {
            int i = this.f340400a + 1;
            this.f340400a = i;
            return i;
        }
    }

    public C113781gq(long j) {
        super(j);
        this.f340399a = new C113782a(j);
    }

    /* renamed from: a */
    private C113782a m157005a() {
        return this.f340399a;
    }
}
