package com.tencent.p014mm.wexnet;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/wexnet/Result;", "", "success", "", "codes", "", "desc", "", "", "(Z[J[Ljava/lang/String;)V", "getCodes", "()[J", "getDesc", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getSuccess", "()Z", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.wexnet.Result */
public class Result {
    private final long[] codes;
    private final String[] desc;
    private final boolean success;

    public Result(boolean z, long[] jArr, String[] strArr) {
        C87412m.m108594g(jArr, "codes");
        C87412m.m108594g(strArr, "desc");
        this.success = z;
        this.codes = jArr;
        this.desc = strArr;
    }

    public final long[] getCodes() {
        return this.codes;
    }

    public final String[] getDesc() {
        return this.desc;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
