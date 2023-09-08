package p190l1;

import androidx.compose.p002ui.platform.C103633i2;
import fy3.C32227p;
import p560i2.C108322d;
import wx3.C15601d;

/* renamed from: l1.c */
public interface C109085c extends C108322d {

    /* renamed from: l1.c$a */
    public static final class C109086a {
        /* renamed from: a */
        public static /* synthetic */ Object m148099a(C109085c cVar, C109108n nVar, C15601d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    nVar = C109108n.Main;
                }
                return cVar.mo160333e0(nVar, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
    }

    /* renamed from: C */
    <T> Object mo160329C(long j, C32227p<? super C109085c, ? super C15601d<? super T>, ? extends Object> pVar, C15601d<? super T> dVar);

    /* renamed from: P */
    C109106l mo160330P();

    /* renamed from: R */
    <T> Object mo160331R(long j, C32227p<? super C109085c, ? super C15601d<? super T>, ? extends Object> pVar, C15601d<? super T> dVar);

    /* renamed from: b */
    long mo160332b();

    /* renamed from: e0 */
    Object mo160333e0(C109108n nVar, C15601d<? super C109106l> dVar);

    C103633i2 getViewConfiguration();

    /* renamed from: p0 */
    long mo160335p0();
}
