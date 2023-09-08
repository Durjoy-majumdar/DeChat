package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import java.util.Comparator;
import kotlin.Metadata;
import ux3.C65486b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo182094d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$onAttach$$inlined$sortBy$1 */
public final class FinderNotifyContract$NotifyPresenter$onAttach$$inlined$sortBy$1<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C65486b.m77169a(Integer.valueOf(((FinderNotifyContract.NotifyViewCallback) t).f160452d), Integer.valueOf(((FinderNotifyContract.NotifyViewCallback) t2).f160452d));
    }
}
