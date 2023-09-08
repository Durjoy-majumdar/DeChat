package p663qo;

import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C92750b0;
import com.tencent.p014mm.modelcdntran.C92798v;
import d14.C58097y0;
import di3.C7335d;
import java.lang.ref.WeakReference;
import p1081gi.C98124g;
import wx3.C15601d;

/* renamed from: qo.i */
public interface C77384i extends C7335d {

    /* renamed from: qo.i$a */
    public static final class C77385a {
        /* renamed from: a */
        public static /* synthetic */ Object m93301a(C77384i iVar, C98124g gVar, long j, WeakReference weakReference, C15601d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    j = 3600000;
                }
                long j2 = j;
                if ((i & 4) != 0) {
                    weakReference = null;
                }
                return iVar.mo107503VO(gVar, j2, weakReference, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSyncCdnDownload");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m93302b(C77384i iVar, C98124g gVar, long j, WeakReference weakReference, C15601d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    j = 3600000;
                }
                long j2 = j;
                if ((i & 4) != 0) {
                    weakReference = null;
                }
                return iVar.L70(gVar, j2, weakReference, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSyncCdnUpload");
        }
    }

    Object L70(C98124g gVar, long j, WeakReference<C92750b0> weakReference, C15601d<? super C92798v> dVar);

    C58097y0<C92798v> Mi0(C98124g gVar);

    String Rl0(String str, WeakReference<C55384i> weakReference);

    /* renamed from: VO */
    Object mo107503VO(C98124g gVar, long j, WeakReference<C92750b0> weakReference, C15601d<? super C92798v> dVar);

    /* renamed from: hs */
    C98124g mo107504hs(C98124g gVar, WeakReference<C55384i> weakReference);

    /* renamed from: nD */
    C58097y0<C92798v> mo107505nD(String str);

    /* renamed from: oY */
    Object mo107506oY(String str, C15601d<? super Boolean> dVar);

    /* renamed from: vL */
    C98124g mo107507vL(C98124g gVar, WeakReference<C55384i> weakReference);

    /* renamed from: xZ */
    C58097y0<C92798v> mo107508xZ(C98124g gVar);
}
