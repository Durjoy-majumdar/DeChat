package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.QuotaFileSystem;
import java.util.Comparator;

/* renamed from: com.tencent.mm.vfs.s0 */
public class C116324s0 implements Comparator<C86001b0> {

    /* renamed from: d */
    public final long f349093d;

    public C116324s0(QuotaFileSystem.C116237c cVar) {
        this.f349093d = System.currentTimeMillis() - cVar.f348812i;
    }

    public int compare(Object obj, Object obj2) {
        C86001b0 b0Var = (C86001b0) obj;
        C86001b0 b0Var2 = (C86001b0) obj2;
        long j = b0Var.f250475e;
        long j2 = this.f349093d;
        int i = 1;
        if (j >= j2 || b0Var2.f250475e >= j2) {
            int i2 = ((b0Var2.f250475e - j) > 0 ? 1 : ((b0Var2.f250475e - j) == 0 ? 0 : -1));
            int i3 = i2 == 0 ? 0 : i2 > 0 ? 1 : -1;
            if (i3 != 0) {
                return i3;
            }
        }
        int i4 = ((b0Var.f250474d - b0Var2.f250474d) > 0 ? 1 : ((b0Var.f250474d - b0Var2.f250474d) == 0 ? 0 : -1));
        if (i4 == 0) {
            i = 0;
        } else if (i4 <= 0) {
            i = -1;
        }
        return i;
    }
}
