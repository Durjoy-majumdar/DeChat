package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

final class zzw implements Continuation {
    private final /* synthetic */ Collection zzagk;

    public zzw(Collection collection) {
        this.zzagk = collection;
    }

    public final /* synthetic */ Object then(Task task) {
        if (this.zzagk.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Task result : this.zzagk) {
            arrayList.add(result.getResult());
        }
        return arrayList;
    }
}
