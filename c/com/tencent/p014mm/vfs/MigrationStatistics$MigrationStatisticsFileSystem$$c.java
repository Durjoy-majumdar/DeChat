package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Arrays;
import java.util.Collections;
import qp3.C118196a;
import qp3.C118201e;

/* renamed from: com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem$$c */
public final /* synthetic */ class MigrationStatistics$MigrationStatisticsFileSystem$$c implements C118196a.C89789a {

    /* renamed from: a */
    public final /* synthetic */ String[] f250463a;

    /* renamed from: b */
    public final /* synthetic */ FileSystem.C85995c f250464b;

    public /* synthetic */ MigrationStatistics$MigrationStatisticsFileSystem$$c(String[] strArr, FileSystem.C85995c cVar) {
        this.f250463a = strArr;
        this.f250464b = cVar;
    }

    /* renamed from: a */
    public final Iterable mo119949a(Object obj) {
        String[] strArr = this.f250463a;
        FileSystem.C85995c cVar = this.f250464b;
        C86001b0 b0Var = (C86001b0) obj;
        if (Arrays.binarySearch(strArr, b0Var.f250472b) < 0) {
            return null;
        }
        return new C118201e(Collections.singleton(b0Var), C116299g2.m163860p(cVar, b0Var.f250471a, false, (C116299g2.C86006b<C86001b0>) null));
    }
}
