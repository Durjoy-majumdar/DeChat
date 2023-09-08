package qm0;

import android.graphics.Bitmap;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import my3.C61595o;
import sx3.C36904l0;

/* renamed from: qm0.c */
public final class C89716c {

    /* renamed from: a */
    public static final C89716c f258001a = new C89716c();

    /* renamed from: a */
    public final ByteBuffer mo124023a(Bitmap bitmap, boolean z) {
        C87412m.m108594g(bitmap, "<this>");
        int byteCount = bitmap.getByteCount() / 4;
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        allocate.position(0);
        bitmap.copyPixelsToBuffer(allocate);
        allocate.position(0);
        int i = byteCount * 3;
        byte[] bArr = new byte[i];
        Iterator it = C61595o.m72301i(0, byteCount).iterator();
        while (it.hasNext()) {
            int a = ((C36904l0) it).mo59695a();
            int i2 = a * 3;
            int i3 = a * 4;
            bArr[i2] = allocate.get(i3);
            bArr[i2 + 1] = allocate.get(i3 + 1);
            bArr[i2 + 2] = allocate.get(i3 + 2);
        }
        if (z) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            allocateDirect.order(ByteOrder.nativeOrder());
            allocateDirect.position(0);
            allocateDirect.put(bArr);
            allocateDirect.position(0);
            return allocateDirect;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.nativeOrder());
        wrap.position(0);
        return wrap;
    }
}
