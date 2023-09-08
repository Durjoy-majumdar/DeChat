package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetResponse;
import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.mapsdk.internal.dw */
public final class C113642dw<OUT extends JsonComposer> extends C113637dt {

    /* renamed from: a */
    private Class<OUT> f340032a;

    public C113642dw(Class<OUT> cls) {
        this.f340032a = cls;
    }

    /* renamed from: b */
    private C113643a<OUT> m156596b(NetResponse netResponse) {
        return new C113643a<>(netResponse, this.f340032a);
    }

    /* renamed from: a */
    public final /* synthetic */ NetResponse mo171963a(NetResponse netResponse) {
        return new C113643a(netResponse, this.f340032a);
    }

    /* renamed from: com.tencent.mapsdk.internal.dw$a */
    public static class C113643a<OUT extends JsonComposer> extends NetResponse {

        /* renamed from: a */
        public String f340033a;

        /* renamed from: b */
        public OUT f340034b;

        public C113643a(NetResponse netResponse) {
            clone(netResponse);
            if (netResponse.available()) {
                try {
                    this.f340033a = new String(netResponse.data, netResponse.charset);
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }

        /* renamed from: a */
        private String m156598a() {
            return this.f340033a;
        }

        /* renamed from: b */
        private OUT m156599b() {
            return this.f340034b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f340033a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean available() {
            /*
                r1 = this;
                boolean r0 = super.available()
                if (r0 == 0) goto L_0x0012
                java.lang.String r0 = r1.f340033a
                if (r0 == 0) goto L_0x0012
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0012
                r0 = 1
                return r0
            L_0x0012:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113642dw.C113643a.available():boolean");
        }

        public C113643a(NetResponse netResponse, Class<OUT> cls) {
            clone(netResponse);
            if (netResponse.available()) {
                try {
                    String str = new String(netResponse.data, netResponse.charset);
                    this.f340033a = str;
                    this.f340034b = (JsonComposer) JsonUtils.parseToModel(str, cls, new Object[0]);
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
    }
}
