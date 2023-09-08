package com.tencent.p014mm.wexnet;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/wexnet/SessionCreateResult;", "Lcom/tencent/mm/wexnet/Result;", "success", "", "codes", "", "desc", "", "", "sessionKeeper", "Lcom/tencent/mm/wexnet/SessionKeeper;", "(Z[J[Ljava/lang/String;Lcom/tencent/mm/wexnet/SessionKeeper;)V", "getSessionKeeper", "()Lcom/tencent/mm/wexnet/SessionKeeper;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.wexnet.SessionCreateResult */
public final class SessionCreateResult extends Result {
    private final SessionKeeper sessionKeeper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionCreateResult(boolean z, long[] jArr, String[] strArr, SessionKeeper sessionKeeper2) {
        super(z, jArr, strArr);
        C87412m.m108594g(jArr, "codes");
        C87412m.m108594g(strArr, "desc");
        C87412m.m108594g(sessionKeeper2, "sessionKeeper");
        this.sessionKeeper = sessionKeeper2;
    }

    public final SessionKeeper getSessionKeeper() {
        return this.sessionKeeper;
    }
}
