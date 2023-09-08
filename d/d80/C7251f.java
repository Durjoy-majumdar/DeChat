package d80;

import android.util.Size;
import java.util.Comparator;

/* renamed from: d80.f */
public final class C7251f<T> implements Comparator {

    /* renamed from: d */
    public final /* synthetic */ float f25315d;

    public C7251f(float f) {
        this.f25315d = f;
    }

    public int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        float abs = Math.abs(this.f25315d - ((((float) Math.max(size.getWidth(), size.getHeight())) * 1.0f) / ((float) Math.min(size.getWidth(), size.getHeight())))) - Math.abs(this.f25315d - ((((float) Math.max(size2.getWidth(), size2.getHeight())) * 1.0f) / ((float) Math.min(size2.getWidth(), size2.getHeight()))));
        if (abs > 0.0f) {
            return 1;
        }
        return abs < 0.0f ? -1 : 0;
    }
}
