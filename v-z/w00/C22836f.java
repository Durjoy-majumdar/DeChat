package w00;

import android.widget.AbsListView;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;

/* renamed from: w00.f */
public final class C22836f extends BaseStateAction {

    /* renamed from: a */
    public final String f65661a;

    /* renamed from: b */
    public final long f65662b;

    public C22836f(String str, long j, AbsListView absListView) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(absListView, "view");
        this.f65661a = str;
        this.f65662b = j;
    }
}
