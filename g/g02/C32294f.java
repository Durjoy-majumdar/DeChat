package g02;

import com.tencent.p014mm.plugin.appbrand.config.GetOnLineInfoInfoResult;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;

/* renamed from: g02.f */
public final class C32294f {

    /* renamed from: a */
    public static final C32294f f85763a = new C32294f();

    /* renamed from: b */
    public static final MultiProcessMMKV f85764b = MultiProcessMMKV.getMMKV("online_status_kv");

    /* renamed from: a */
    public final void mo58559a(GetOnLineInfoInfoResult getOnLineInfoInfoResult) {
        C87412m.m108594g(getOnLineInfoInfoResult, "<this>");
        MultiProcessMMKV multiProcessMMKV = f85764b;
        getOnLineInfoInfoResult.f80323d = multiProcessMMKV.decodeInt("icon_type");
        getOnLineInfoInfoResult.f80324e = multiProcessMMKV.decodeInt("client_version");
        getOnLineInfoInfoResult.f80325f = multiProcessMMKV.decodeBool("is_wx_online");
    }

    /* renamed from: b */
    public final void mo58560b(GetOnLineInfoInfoResult getOnLineInfoInfoResult) {
        C87412m.m108594g(getOnLineInfoInfoResult, "<this>");
        MultiProcessMMKV multiProcessMMKV = f85764b;
        multiProcessMMKV.encode("icon_type", getOnLineInfoInfoResult.f80323d);
        multiProcessMMKV.encode("client_version", getOnLineInfoInfoResult.f80324e);
        multiProcessMMKV.encode("is_wx_online", getOnLineInfoInfoResult.f80325f);
    }
}
