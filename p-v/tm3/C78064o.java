package tm3;

import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import gy3.C87412m;
import java.util.List;

/* renamed from: tm3.o */
public final class C78064o implements IStateActionResult {

    /* renamed from: a */
    public final String f228809a;

    /* renamed from: b */
    public final String f228810b;

    /* renamed from: c */
    public final List<String> f228811c;

    /* renamed from: d */
    public final boolean f228812d;

    public C78064o(String str, String str2, List<String> list, boolean z) {
        C87412m.m108594g(str, "searchId");
        C87412m.m108594g(str2, "originQuery");
        C87412m.m108594g(list, "subQueryList");
        this.f228809a = str;
        this.f228810b = str2;
        this.f228811c = list;
        this.f228812d = z;
    }
}
