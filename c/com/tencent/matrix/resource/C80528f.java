package com.tencent.matrix.resource;

import gy3.C87412m;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.tencent.matrix.resource.f */
public final class C80528f {

    /* renamed from: a */
    public final ByteOrder f235546a;

    /* renamed from: b */
    public final InputStream f235547b;

    public C80528f(ByteOrder byteOrder, InputStream inputStream) {
        C87412m.m108594g(byteOrder, "order");
        C87412m.m108594g(inputStream, "stream");
        this.f235546a = byteOrder;
        this.f235547b = inputStream;
    }

    /* renamed from: a */
    public final int mo112096a() {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(this.f235546a);
        this.f235547b.read(allocate.array(), 0, 4);
        return allocate.getInt(0);
    }
}
