package pp3;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C75057b1;
import com.tencent.p014mm.vfs.C75061i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: pp3.w */
public final class C77264w extends C87413o implements C32226l<C75057b1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f225376d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77264w(MultiProcessMMKV multiProcessMMKV) {
        super(1);
        this.f225376d = multiProcessMMKV;
    }

    public Object invoke(Object obj) {
        JSONObject jSONObject;
        Long l;
        Long l2;
        Long l3;
        Boolean bool;
        C75057b1 b1Var = (C75057b1) obj;
        String str = "";
        C87412m.m108594g(b1Var, "$this$storage");
        MultiProcessMMKV multiProcessMMKV = this.f225376d;
        try {
            Result.Companion companion = Result.Companion;
            String string = multiProcessMMKV.getString("finder_live_replay_vfs_storage_config", str);
            if (string != null) {
                str = string;
            }
            jSONObject = Result.m168114constructorimpl(new JSONObject(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            jSONObject = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject2 = new JSONObject();
        if (Result.m168120isFailureimpl(jSONObject)) {
            jSONObject = jSONObject2;
        }
        JSONObject jSONObject3 = (JSONObject) jSONObject;
        try {
            l = Result.m168114constructorimpl(Long.valueOf(jSONObject3.getLong("targetSize")));
        } catch (Throwable th4) {
            Result.Companion companion3 = Result.Companion;
            l = Result.m168114constructorimpl(ResultKt.createFailure(th4));
        }
        Long valueOf = Long.valueOf(C75061i.C75062a.m90021b(b1Var, 512));
        if (Result.m168120isFailureimpl(l)) {
            l = valueOf;
        }
        long longValue = ((Number) l).longValue();
        try {
            l2 = Result.m168114constructorimpl(Long.valueOf(jSONObject3.getLong("expireTimes")));
        } catch (Throwable th5) {
            Result.Companion companion4 = Result.Companion;
            l2 = Result.m168114constructorimpl(ResultKt.createFailure(th5));
        }
        Long valueOf2 = Long.valueOf(C75061i.C75062a.m90020a(b1Var, 1));
        if (Result.m168120isFailureimpl(l2)) {
            l2 = valueOf2;
        }
        long longValue2 = ((Number) l2).longValue();
        try {
            l3 = Result.m168114constructorimpl(Long.valueOf(jSONObject3.getLong("thresholds")));
        } catch (Throwable th6) {
            Result.Companion companion5 = Result.Companion;
            l3 = Result.m168114constructorimpl(ResultKt.createFailure(th6));
        }
        Long valueOf3 = Long.valueOf(C75061i.C75062a.m90021b(b1Var, 512));
        if (Result.m168120isFailureimpl(l3)) {
            l3 = valueOf3;
        }
        long longValue3 = ((Number) l3).longValue();
        try {
            bool = Result.m168114constructorimpl(Boolean.valueOf(jSONObject3.getBoolean("isCache")));
        } catch (Throwable th7) {
            Result.Companion companion6 = Result.Companion;
            bool = Result.m168114constructorimpl(ResultKt.createFailure(th7));
        }
        Boolean bool2 = Boolean.TRUE;
        if (Result.m168120isFailureimpl(bool)) {
            bool = bool2;
        }
        boolean booleanValue = ((Boolean) bool).booleanValue();
        b1Var.mo104649d(longValue, new C77258v(longValue3, longValue2));
        b1Var.f220828e = Boolean.valueOf(booleanValue);
        return C13598b0.f38549a;
    }
}
