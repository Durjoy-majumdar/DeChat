package w00;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import java.util.LinkedList;
import te3.pd4;

/* renamed from: w00.c */
public final class C22833c extends BaseStateAction {

    /* renamed from: a */
    public final String f65646a;

    /* renamed from: b */
    public final long f65647b;

    /* renamed from: c */
    public final String f65648c;

    /* renamed from: d */
    public final LinkedList<pd4> f65649d;

    /* renamed from: e */
    public final boolean f65650e;

    /* renamed from: f */
    public final String f65651f;

    /* renamed from: g */
    public final String f65652g;

    /* renamed from: h */
    public final int f65653h;

    public C22833c(String str, long j, String str2, int i, LinkedList<pd4> linkedList, boolean z, String str3, String str4, int i2) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str2, "responseId");
        C87412m.m108594g(linkedList, "relatedResults");
        C87412m.m108594g(str3, "extInfo");
        C87412m.m108594g(str4, "sugTitle");
        this.f65646a = str;
        this.f65647b = j;
        this.f65648c = str2;
        this.f65649d = linkedList;
        this.f65650e = z;
        this.f65651f = str3;
        this.f65652g = str4;
        this.f65653h = i2;
    }
}
