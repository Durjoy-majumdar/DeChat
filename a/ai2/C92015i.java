package ai2;

import android.graphics.Matrix;
import bi2.C92262a;

/* renamed from: ai2.i */
public interface C92015i {

    /* renamed from: ai2.i$a */
    public static final class C92016a {
        /* renamed from: a */
        public static /* synthetic */ C92262a m115609a(C92015i iVar, Matrix matrix, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    matrix = null;
                }
                return iVar.mo53781i(matrix);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createEditorItem");
        }
    }

    /* renamed from: d */
    C92007a mo53771d();

    /* renamed from: i */
    C92262a mo53781i(Matrix matrix);
}
