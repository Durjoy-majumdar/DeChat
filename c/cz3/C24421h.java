package cz3;

import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import mz3.C25052d;
import vz3.C22826c;

/* renamed from: cz3.h */
public interface C24421h extends C25052d {

    /* renamed from: cz3.h$a */
    public static final class C24422a {
        /* renamed from: a */
        public static C24415e m30477a(C24421h hVar, C22826c cVar) {
            Annotation[] declaredAnnotations;
            C87412m.m108594g(cVar, "fqName");
            AnnotatedElement i = hVar.mo51029i();
            if (i == null || (declaredAnnotations = i.getDeclaredAnnotations()) == null) {
                return null;
            }
            return C24424i.m30481a(declaredAnnotations, cVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r0.getDeclaredAnnotations();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<cz3.C24415e> m30478b(cz3.C24421h r0) {
            /*
                java.lang.reflect.AnnotatedElement r0 = r0.mo51029i()
                if (r0 == 0) goto L_0x0011
                java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
                if (r0 == 0) goto L_0x0011
                java.util.List r0 = cz3.C24424i.m30482b(r0)
                goto L_0x0013
            L_0x0011:
                sx3.f0 r0 = sx3.C64186f0.f181907d
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cz3.C24421h.C24422a.m30478b(cz3.h):java.util.List");
        }
    }

    /* renamed from: i */
    AnnotatedElement mo51029i();
}
