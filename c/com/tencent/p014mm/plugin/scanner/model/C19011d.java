package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.scanner.model.d */
public final class C19011d {

    /* renamed from: com.tencent.mm.plugin.scanner.model.d$a */
    public static final class C19012a {

        /* renamed from: a */
        public int f53411a;

        /* renamed from: b */
        public int f53412b;

        /* renamed from: c */
        public int f53413c;

        /* renamed from: d */
        public int f53414d;

        public C19012a(int i) {
        }
    }

    /* renamed from: a */
    public static final void m20064a(int i, C19012a aVar) {
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[6];
        int i2 = 0;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = 0;
        objArr[2] = Integer.valueOf(aVar != null ? aVar.f53411a : 0);
        objArr[3] = Integer.valueOf(aVar != null ? aVar.f53412b : 0);
        objArr[4] = Integer.valueOf(aVar != null ? aVar.f53413c : 0);
        if (aVar != null) {
            i2 = aVar.f53414d;
        }
        objArr[5] = Integer.valueOf(i2);
        nVar.mo160131h(24657, objArr);
    }
}
