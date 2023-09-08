package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetResponse;
import java.io.File;

/* renamed from: com.tencent.mapsdk.internal.du */
public final class C113638du extends C113637dt {

    /* renamed from: a */
    private String f340025a;

    /* renamed from: b */
    private String f340026b;

    /* renamed from: com.tencent.mapsdk.internal.du$a */
    public static class C113639a extends NetResponse {

        /* renamed from: a */
        private File f340027a;

        public C113639a(NetResponse netResponse, String str, String str2) {
            clone(netResponse);
            if (netResponse.available()) {
                this.f340027a = new File(str, str2);
                File file = new File(str, str2 + ".tmp");
                C113884kf.m157500b(file);
                if (C113884kf.m157489a(file) && C113884kf.m157491a(file, netResponse.data) && C113884kf.m157490a(file, this.f340027a)) {
                    C113884kf.m157500b(file);
                }
            }
        }

        /* renamed from: a */
        private File m156591a() {
            return this.f340027a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f340027a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean available() {
            /*
                r1 = this;
                boolean r0 = super.available()
                if (r0 == 0) goto L_0x0012
                java.io.File r0 = r1.f340027a
                if (r0 == 0) goto L_0x0012
                boolean r0 = r0.exists()
                if (r0 == 0) goto L_0x0012
                r0 = 1
                return r0
            L_0x0012:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113638du.C113639a.available():boolean");
        }
    }

    public C113638du(String str) {
        this.f340025a = str;
    }

    /* renamed from: b */
    private C113639a m156588b(NetResponse netResponse) {
        return new C113639a(netResponse, this.f340026b, this.f340025a);
    }

    /* renamed from: a */
    public final Object[] mo171964a(int[] iArr, Object[] objArr) {
        if (objArr != null && iArr != null && iArr.length == 1 && objArr.length > 0) {
            Object obj = objArr[iArr[0]];
            if (obj instanceof String) {
                this.f340026b = String.valueOf(obj);
            }
        }
        return super.mo171964a(iArr, objArr);
    }

    /* renamed from: a */
    public final /* synthetic */ NetResponse mo171963a(NetResponse netResponse) {
        return new C113639a(netResponse, this.f340026b, this.f340025a);
    }
}
