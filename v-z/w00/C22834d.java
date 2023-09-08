package w00;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import java.util.LinkedList;
import te3.pd4;

/* renamed from: w00.d */
public final class C22834d extends BaseStateAction {

    /* renamed from: a */
    public final String f65654a;

    /* renamed from: b */
    public final LinkedList<pd4> f65655b;

    public C22834d(String str, long j, LinkedList<pd4> linkedList) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(linkedList, "relatedResults");
        this.f65654a = str;
        this.f65655b = linkedList;
    }
}
