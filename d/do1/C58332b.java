package do1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderPrefetchDataStruct;
import di3.C86312j;
import dp1.C58417y0;

/* renamed from: do1.b */
public final class C58332b {

    /* renamed from: a */
    public static final C58332b f167018a = new C58332b();

    /* renamed from: a */
    public static void m67542a(C58332b bVar, int i, int i2, int i3, int i4, boolean z, int i5, boolean z2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i2 = 0;
        }
        if ((i6 & 4) != 0) {
            i3 = 0;
        }
        if ((i6 & 8) != 0) {
            i4 = 0;
        }
        if ((i6 & 16) != 0) {
            z = false;
        }
        if ((i6 & 32) != 0) {
            i5 = 0;
        }
        if ((i6 & 64) != 0) {
            z2 = false;
        }
        bVar.getClass();
        FinderPrefetchDataStruct finderPrefetchDataStruct = new FinderPrefetchDataStruct();
        finderPrefetchDataStruct.f155883d = (long) i;
        finderPrefetchDataStruct.f155884e = (long) i2;
        finderPrefetchDataStruct.f155885f = (long) i3;
        finderPrefetchDataStruct.f155886g = (long) i4;
        long j = 1;
        finderPrefetchDataStruct.f155887h = z ? 1 : 0;
        finderPrefetchDataStruct.f155888i = (long) i5;
        if (!z2) {
            j = 0;
        }
        finderPrefetchDataStruct.f155889j = j;
        finderPrefetchDataStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderPrefetchDataStruct);
    }
}
