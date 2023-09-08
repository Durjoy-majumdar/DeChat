package com.tencent.mapsdk.internal;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.map.tools.net.NetResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.dv */
public final class C113640dv<IN extends MapJceStruct, OUT extends MapJceStruct> extends C113637dt {

    /* renamed from: a */
    private Class<IN> f340028a;

    /* renamed from: b */
    private Class<OUT> f340029b;

    /* renamed from: c */
    private MapJceStruct f340030c;

    /* renamed from: com.tencent.mapsdk.internal.dv$a */
    public static class C113641a<OUT extends MapJceStruct> extends NetResponse {

        /* renamed from: a */
        public OUT f340031a;

        public C113641a(NetResponse netResponse, Class<OUT> cls) {
            clone(netResponse);
            byte[] bArr = netResponse.data;
            if (bArr != null) {
                C113953m mVar = new C113953m(bArr);
                OUT out = (MapJceStruct) C113800hd.m157128a(cls, new Object[0]);
                this.f340031a = out;
                if (out != null) {
                    out.readFrom(mVar);
                }
            }
            C113889km.m157550c(C0949kl.f2237g, "[JCE-RESP]:" + this.f340031a);
        }

        /* renamed from: a */
        private OUT m156595a() {
            return this.f340031a;
        }

        public final boolean available() {
            return super.available() && this.f340031a != null;
        }
    }

    public C113640dv(Class<IN> cls, Class<OUT> cls2) {
        this.f340028a = cls;
        this.f340029b = cls2;
    }

    /* renamed from: b */
    private C113641a<OUT> m156592b(NetResponse netResponse) {
        return new C113641a<>(netResponse, this.f340029b);
    }

    /* renamed from: a */
    public final Object[] mo171964a(int[] iArr, Object[] objArr) {
        if (objArr != null && iArr != null && iArr.length > 0 && objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            int i = iArr[0];
            int i2 = iArr.length == 1 ? i : iArr[1];
            if (objArr.length - 1 >= i2 && i >= 0) {
                MapJceStruct mapJceStruct = (MapJceStruct) C113800hd.m157128a(this.f340028a, Arrays.copyOfRange(objArr, i, i2 + 1));
                this.f340030c = mapJceStruct;
                byte[] bArr = new byte[0];
                if (mapJceStruct != null) {
                    bArr = mapJceStruct.toByteArray();
                }
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < asList.size(); i3++) {
                    if (i3 < i || i3 > i2) {
                        arrayList.add(asList.get(i3));
                    } else if (i3 == i2) {
                        arrayList.add(bArr);
                    }
                }
                return arrayList.toArray();
            }
        }
        return super.mo171964a(iArr, objArr);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("JceResolver{");
        stringBuffer.append("inJce=");
        stringBuffer.append(this.f340030c);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ NetResponse mo171963a(NetResponse netResponse) {
        return new C113641a(netResponse, this.f340029b);
    }
}
