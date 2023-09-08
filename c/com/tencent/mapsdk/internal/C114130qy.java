package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse;

/* renamed from: com.tencent.mapsdk.internal.qy */
public final class C114130qy extends C113932lh {

    /* renamed from: a */
    private static final int f341621a = 3;

    /* renamed from: b */
    private static C114130qy f341622b;

    /* renamed from: b */
    private static RttResponse m159264b(byte[] bArr) {
        for (int i = 0; i < 3; i++) {
            try {
                NetResponse rttData = ((C113615da) ((C113632do) C113601cl.m156511a(C113632do.class)).mo171932h()).rttData(bArr);
                if (rttData == null) {
                    continue;
                } else if (rttData.data != null) {
                    C113715f fVar = new C113715f();
                    fVar.mo171893a("UTF-8");
                    fVar.mo171895a(rttData.data);
                    return (RttResponse) fVar.mo171896b("res", true, (ClassLoader) null);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public static synchronized C114130qy m159265c() {
        C114130qy qyVar;
        synchronized (C114130qy.class) {
            if (f341622b == null) {
                f341622b = new C114130qy();
            }
            qyVar = f341622b;
        }
        return qyVar;
    }

    /* renamed from: a */
    public final byte[] mo172352a(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    RttResponse b = m159264b(bArr);
                    if (b == null) {
                        return null;
                    }
                    return b.result;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static byte[] m159263a(RttResponse rttResponse) {
        if (rttResponse == null) {
            return null;
        }
        return rttResponse.result;
    }
}
