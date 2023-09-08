package b80;

import android.hardware.Camera;
import java.util.Comparator;

/* renamed from: b80.k */
public final class C104057k<T> implements Comparator {

    /* renamed from: d */
    public final /* synthetic */ float f307768d;

    public C104057k(float f) {
        this.f307768d = f;
    }

    public int compare(Object obj, Object obj2) {
        Camera.Size size = (Camera.Size) obj;
        Camera.Size size2 = (Camera.Size) obj2;
        float abs = Math.abs(this.f307768d - ((((float) Math.max(size.width, size.height)) * 1.0f) / ((float) Math.min(size.width, size.height)))) - Math.abs(this.f307768d - ((((float) Math.max(size2.width, size2.height)) * 1.0f) / ((float) Math.min(size2.width, size2.height))));
        if (abs > 0.0f) {
            return 1;
        }
        return abs < 0.0f ? -1 : 0;
    }
}
