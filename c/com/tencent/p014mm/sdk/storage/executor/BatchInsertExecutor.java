package com.tencent.p014mm.sdk.storage.executor;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/executor/BatchInsertExecutor;", "", "executorList", "", "Lcom/tencent/mm/sdk/storage/executor/InsertExecutor;", "(Ljava/util/List;)V", "getExecutorList", "()Ljava/util/List;", "execute", "", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.executor.BatchInsertExecutor */
public final class BatchInsertExecutor {
    private final List<InsertExecutor> executorList;

    public BatchInsertExecutor(List<InsertExecutor> list) {
        C87412m.m108594g(list, "executorList");
        this.executorList = list;
    }

    public final List<Long> execute(ISQLiteDatabase iSQLiteDatabase) {
        long beginTransaction = iSQLiteDatabase != null ? iSQLiteDatabase.beginTransaction(Thread.currentThread().getId()) : -4;
        ArrayList arrayList = new ArrayList();
        for (InsertExecutor execute : this.executorList) {
            arrayList.add(Long.valueOf(execute.execute(iSQLiteDatabase)));
        }
        if (iSQLiteDatabase != null) {
            iSQLiteDatabase.endTransaction(beginTransaction);
        }
        return arrayList;
    }

    public final List<InsertExecutor> getExecutorList() {
        return this.executorList;
    }
}
