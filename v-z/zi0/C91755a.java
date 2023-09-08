package zi0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.InputStream;
import java.util.Map;
import p224ra.C12964b;

/* renamed from: zi0.a */
public interface C91755a extends C12964b {

    /* renamed from: zi0.a$a */
    public interface C91756a {
        /* renamed from: N0 */
        void mo115839N0(String str, Map<String, String> map, C91758c cVar);

        /* renamed from: P0 */
        Bitmap mo115833P0(String str, Rect rect, C91757b bVar);

        /* renamed from: Q0 */
        boolean mo115834Q0(String str);

        String key();
    }

    /* renamed from: zi0.a$b */
    public interface C91757b {
        /* renamed from: a */
        void mo125629a(Bitmap bitmap);
    }

    /* renamed from: zi0.a$c */
    public interface C91758c {
        /* renamed from: a */
        void mo121428a(InputStream inputStream);
    }

    /* renamed from: N0 */
    void mo124757N0(String str, Map<String, String> map, C91758c cVar);

    /* renamed from: Om */
    void mo124758Om(String str, C91758c cVar);

    /* renamed from: Rb */
    Bitmap mo124759Rb(String str, Rect rect, C91757b bVar);

    Bitmap load(String str);
}
