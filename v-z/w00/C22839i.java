package w00;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import java.util.LinkedList;
import te3.pd4;

/* renamed from: w00.i */
public final class C22839i extends BaseStateAction {

    /* renamed from: a */
    public final LinkedList<pd4> f65665a;

    public C22839i(String str, long j, LinkedList<pd4> linkedList) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(linkedList, "relatedResults");
        this.f65665a = linkedList;
    }
}
