package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C55011a;
import gy3.C87412m;
import java.util.Comparator;
import kotlin.Metadata;
import p749xh.C66276va;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo182094d2 = {"Lcm1/a;", "kotlin.jvm.PlatformType", "o1", "o2", "", "compare", "(Lcm1/a;Lcm1/a;)I", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$sortMentionList$comparator$1 */
final class FinderMsgContract$MsgPresenter$sortMentionList$comparator$1<T> implements Comparator {

    /* renamed from: d */
    public static final FinderMsgContract$MsgPresenter$sortMentionList$comparator$1<T> f160406d = new FinderMsgContract$MsgPresenter$sortMentionList$comparator$1<>();

    public int compare(Object obj, Object obj2) {
        C66276va vaVar = ((C55011a) obj).f154465d;
        int i = vaVar.field_createTime;
        C66276va vaVar2 = ((C55011a) obj2).f154465d;
        int i2 = vaVar2.field_createTime;
        return i == i2 ? C87412m.m108597j(vaVar2.field_id, vaVar.field_id) : C87412m.m108596i(i2, i);
    }
}
