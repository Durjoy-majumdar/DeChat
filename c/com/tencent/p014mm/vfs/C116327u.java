package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116314o;
import java.util.Arrays;

/* renamed from: com.tencent.mm.vfs.u */
public class C116327u extends C116314o.C116317c {
    public C116327u(String str, int i, int i2, String str2) {
        super(str, i, i2, str2);
    }

    /* renamed from: a */
    public boolean mo177815a(C116314o.C116316b bVar) {
        return bVar.f349056b == 7 && bVar.f349058d.startsWith("${data}/") && Arrays.binarySearch(C116314o.f349049t, bVar.f349058d.substring(8)) >= 0 && bVar.f349055a.equals("@DiskSpace-NonAccountData-${data}");
    }
}
