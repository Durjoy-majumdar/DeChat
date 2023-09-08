package ww0;

import java.util.Comparator;
import te3.w35;

/* renamed from: ww0.h */
public class C53207h implements Comparator<w35> {
    public int compare(Object obj, Object obj2) {
        w35 w35 = (w35) obj;
        w35 w352 = (w35) obj2;
        try {
            int i = w352.f143846e - w35.f143846e;
            return i == 0 ? w352.f143845d.length() - w35.f143845d.length() : i;
        } catch (Exception unused) {
            return 0;
        }
    }
}
