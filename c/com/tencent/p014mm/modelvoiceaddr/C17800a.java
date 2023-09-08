package com.tencent.p014mm.modelvoiceaddr;

import java.util.List;

/* renamed from: com.tencent.mm.modelvoiceaddr.a */
public interface C17800a {

    /* renamed from: com.tencent.mm.modelvoiceaddr.a$a */
    public interface C17801a {
        /* renamed from: a */
        void mo21933a();

        /* renamed from: b */
        void mo21934b(String[] strArr, List<String> list);

        /* renamed from: c */
        void mo21935c(int i, int i2, int i3, long j);

        /* renamed from: d */
        void mo21936d();
    }

    void cancel(boolean z);

    int getMaxAmplitudeRate();

    void init(int i, int i2, C17801a aVar);

    void start();

    void stop(boolean z);
}
