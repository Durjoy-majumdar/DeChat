package z33;

import android.graphics.Rect;
import android.media.Image;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: z33.i */
public final class C112596i {

    /* renamed from: a */
    public static final C112596i f337178a = new C112596i();

    /* renamed from: a */
    public final ByteBuffer mo164374a(Image image) {
        C87412m.m108594g(image, "image");
        Rect cropRect = image.getCropRect();
        int width = cropRect.width();
        int height = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        ByteBuffer order = ByteBuffer.allocateDirect(width * height * 4).order(ByteOrder.nativeOrder());
        ByteBuffer buffer = planes[0].getBuffer();
        int rowStride = planes[0].getRowStride();
        buffer.position((rowStride * 4 * cropRect.top) + (planes[0].getPixelStride() * cropRect.left));
        int i = width * 4;
        if (planes[0].getRowStride() == i) {
            order.put(buffer);
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < height; i3++) {
                buffer.asReadOnlyBuffer().get(order.array(), i3 * width * 4, i);
                i2 += rowStride;
                if (i3 < height - 1) {
                    if (i2 <= buffer.capacity()) {
                        buffer.position(i2);
                    } else {
                        buffer.position(buffer.capacity());
                    }
                }
            }
        }
        C87412m.m108593f(order, "data");
        return order;
    }
}
