package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.tencent.mapsdk.internal.kx */
public final class C67644kx {

    /* renamed from: a */
    public static final int f193418a = 1;

    /* renamed from: b */
    public static final int f193419b = 0;

    /* renamed from: c */
    public final Rect f193420c = new Rect();

    /* renamed from: d */
    public int[] f193421d;

    /* renamed from: e */
    public int[] f193422e;

    /* renamed from: f */
    public int[] f193423f;

    /* renamed from: a */
    private static void m79849a(int[] iArr, ByteBuffer byteBuffer) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = byteBuffer.getInt();
        }
    }

    /* renamed from: a */
    private static void m79848a(int i) {
        if (i == 0 || (i & 1) != 0) {
            throw new RuntimeException("invalid nine-patch: ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: a */
    private static C67644kx m79847a(byte[] bArr) {
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (order.get() == 0) {
            return null;
        }
        C67644kx kxVar = new C67644kx();
        kxVar.f193421d = new int[order.get()];
        kxVar.f193422e = new int[order.get()];
        kxVar.f193423f = new int[order.get()];
        m79848a(kxVar.f193421d.length);
        m79848a(kxVar.f193422e.length);
        order.getInt();
        order.getInt();
        kxVar.f193420c.left = order.getInt();
        kxVar.f193420c.right = order.getInt();
        kxVar.f193420c.top = order.getInt();
        kxVar.f193420c.bottom = order.getInt();
        order.getInt();
        m79849a(kxVar.f193421d, order);
        m79849a(kxVar.f193422e, order);
        m79849a(kxVar.f193423f, order);
        return kxVar;
    }
}
