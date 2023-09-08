package w00;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C52241zb0;

/* renamed from: w00.h */
public final class C22838h extends BaseStateAction {

    /* renamed from: a */
    public final long f65663a;

    /* renamed from: b */
    public final LinkedList<C52241zb0> f65664b;

    public C22838h(String str, long j, long j2, LinkedList<C52241zb0> linkedList) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(linkedList, "exposeSugItemList");
        this.f65663a = j2;
        this.f65664b = linkedList;
    }
}
