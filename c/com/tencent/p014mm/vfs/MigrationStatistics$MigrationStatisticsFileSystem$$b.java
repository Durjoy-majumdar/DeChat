package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.FileSystem;
import java.util.Collections;
import qp3.C118196a;

/* renamed from: com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem$$b */
public final /* synthetic */ class MigrationStatistics$MigrationStatisticsFileSystem$$b implements C118196a.C89789a {

    /* renamed from: a */
    public final /* synthetic */ FileSystem.C85995c f250461a;

    /* renamed from: b */
    public final /* synthetic */ String[] f250462b;

    public /* synthetic */ MigrationStatistics$MigrationStatisticsFileSystem$$b(FileSystem.C85995c cVar, String[] strArr) {
        this.f250461a = cVar;
        this.f250462b = strArr;
    }

    /* renamed from: a */
    public final Iterable mo119949a(Object obj) {
        FileSystem.C85995c cVar = this.f250461a;
        String[] strArr = this.f250462b;
        Iterable list = cVar.list((String) obj);
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C118196a(list, new MigrationStatistics$MigrationStatisticsFileSystem$$c(strArr, cVar));
    }
}
