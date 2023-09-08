package zh0;

import com.tencent.p014mm.sdk.platformtools.Log;
import g72.C107755a;
import k72.C108899b;
import k72.C108903c;
import p156gj.C107835h0;
import p206nj.C11171e;

/* renamed from: zh0.c */
public class C112625c implements C107755a.C107756a {
    /* renamed from: a */
    public C107755a mo158184a(int i, String str, String str2, int i2, int i3, int i4, int i5, long j, long j2, int i6, int i7) {
        int i8 = i;
        if (i8 == 1) {
            return new C108899b(str, str2, i2, i3, i4, i5, j, j2);
        }
        if (i8 == 2) {
            return new C108903c(str, str2, i2, i3, i4, i5, j, j2, i6, i7);
        }
        return null;
    }

    /* renamed from: b */
    public C107755a mo158185b(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = C107835h0.f322852i.f322661j;
        Log.m105925i("MicroMsg.MMSightPresendRemuxerImpl", "get, configRemuxerType: %s", Integer.valueOf(i7));
        if (i7 != -1) {
            if (i7 == 1) {
                return new C108899b(str, str2, i, i2, i3, i4);
            }
            if (i7 == 2) {
                return new C108903c(str, str2, i, i2, i3, i4, i5, i6);
            }
        }
        return C11171e.m11046c(19) ? new C108899b(str, str2, i, i2, i3, i4) : new C108903c(str, str2, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: c */
    public C107755a mo158186c(String str, String str2, int i, int i2, int i3, int i4, long j, long j2, int i5, int i6) {
        int i7 = C107835h0.f322852i.f322661j;
        Log.m105925i("MicroMsg.MMSightPresendRemuxerImpl", "get, configRemuxerType: %s", Integer.valueOf(i7));
        if (i7 != -1) {
            if (i7 == 1) {
                return new C108899b(str, str2, i, i2, i3, i4, j, j2);
            }
            if (i7 == 2) {
                return new C108903c(str, str2, i, i2, i3, i4, j, j2, i5, i6);
            }
        }
        return C11171e.m11046c(19) ? new C108899b(str, str2, i, i2, i3, i4, j, j2) : new C108903c(str, str2, i, i2, i3, i4, j, j2, i5, i6);
    }

    /* renamed from: d */
    public C107755a mo158187d(int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i;
        if (i8 == 1) {
            return new C108899b(str, str2, i2, i3, i4, i5);
        }
        if (i8 == 2) {
            return new C108903c(str, str2, i2, i3, i4, i5, i6, i7);
        }
        return null;
    }
}
