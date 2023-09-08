package ls3;

import di3.C7335d;
import java.util.LinkedList;
import ob0.C89132b;
import te3.C48742ao0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50317lw0;
import te3.C51897wz0;
import te3.C64308d82;
import te3.C64414h71;
import te3.C64840xw0;

/* renamed from: ls3.h */
public interface C61398h extends C7335d {

    /* renamed from: ls3.h$a */
    public static final class C61399a {
        /* renamed from: a */
        public static /* synthetic */ C89132b m72075a(C61398h hVar, C49842ig0 ig02, String str, byte[] bArr, long j, long j2, String str2, int i, boolean z, int i2, C64840xw0 xw02, int i3, C49712hj1 hj12, String str3, C61400b bVar, String str4, C50317lw0 lw02, C64414h71 h712, boolean z2, int i4, Object obj) {
            int i5 = i4;
            if (obj == null) {
                return hVar.mo86339jS(ig02, str, bArr, j, j2, str2, i, z, (i5 & 256) != 0 ? 0 : i2, (i5 & 512) != 0 ? null : xw02, (i5 & 1024) != 0 ? 4 : i3, (i5 & 2048) != 0 ? new C49712hj1() : hj12, (i5 & 4096) != 0 ? null : str3, bVar, str4, lw02, (65536 & i5) != 0 ? null : h712, (i5 & 131072) != 0 ? false : z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createCgiFinderGetLiveMsg");
        }
    }

    /* renamed from: ls3.h$b */
    public interface C61400b {
        /* renamed from: a */
        void mo75426a(int i, int i2, String str, C48742ao0 ao02, int i3, String str2);
    }

    /* renamed from: jS */
    C89132b<C48742ao0> mo86339jS(C49842ig0 ig02, String str, byte[] bArr, long j, long j2, String str2, int i, boolean z, int i2, C64840xw0 xw02, int i3, C49712hj1 hj12, String str3, C61400b bVar, String str4, C50317lw0 lw02, C64414h71 h712, boolean z2);

    C89132b<C51897wz0> xk0(String str, byte[] bArr, long j, long j2, LinkedList<C64308d82> linkedList);
}
