package p277yf;

import org.libpag.PAGFile;
import org.libpag.PAGView;
import wx3.C15601d;

/* renamed from: yf.c */
public interface C15996c {

    /* renamed from: yf.c$a */
    public static final class C15997a {
        /* renamed from: a */
        public static /* synthetic */ Object m14901a(C15996c cVar, String str, String str2, C15601d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return cVar.mo14622b(str, str2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }

        /* renamed from: b */
        public static /* synthetic */ void m14902b(C15996c cVar, String str, PAGView pAGView, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                cVar.mo14621a(str, pAGView, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
    }

    /* renamed from: a */
    void mo14621a(String str, PAGView pAGView, String str2);

    /* renamed from: b */
    Object mo14622b(String str, String str2, C15601d<? super PAGFile> dVar);
}
