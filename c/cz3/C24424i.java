package cz3;

import ey3.C116796a;
import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import vz3.C22826c;

/* renamed from: cz3.i */
public final class C24424i {
    /* renamed from: a */
    public static final C24415e m30481a(Annotation[] annotationArr, C22826c cVar) {
        Annotation annotation;
        C87412m.m108594g(annotationArr, "<this>");
        C87412m.m108594g(cVar, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (C87412m.m108589b(C24410d.m30455a(C116796a.m164750b(C116796a.m164749a(annotation))).mo53387b(), cVar)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C24415e(annotation);
        }
        return null;
    }

    /* renamed from: b */
    public static final List<C24415e> m30482b(Annotation[] annotationArr) {
        C87412m.m108594g(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation eVar : annotationArr) {
            arrayList.add(new C24415e(eVar));
        }
        return arrayList;
    }
}
