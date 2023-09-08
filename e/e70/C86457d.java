package e70;

import com.google.protobuf.C23872m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d42.C86174d;
import d42.C86177e;
import e42.C86428f;
import f70.C86770d;
import gy3.C87412m;
import i70.C87667c;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import rx3.C48096k;

/* renamed from: e70.d */
public final class C86457d implements C86177e<C86457d, C7603a> {

    /* renamed from: a */
    public Object f251252a;

    /* renamed from: b */
    public WeakReference<? extends C86770d<? extends C86428f<C86457d>, ? extends C87667c<C86457d, ? extends C86428f<C86457d>>>> f251253b;

    public C86457d(Object obj, WeakReference<? extends C86770d<? extends C86428f<C86457d>, ? extends C87667c<C86457d, ? extends C86428f<C86457d>>>> weakReference) {
        C87412m.m108594g(obj, StateEvent.Name.MESSAGE);
        this.f251252a = obj;
        this.f251253b = weakReference;
    }

    /* renamed from: a */
    public void mo120575a(Object obj, Object obj2, C86174d dVar) {
        C87412m.m108594g((C86457d) obj, "view");
        C87412m.m108594g((C7603a) obj2, "viewAttribute");
        C87412m.m108594g(dVar, "callback");
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: b */
    public void mo120576b(Object obj, C86174d dVar) {
        C87412m.m108594g((C86457d) obj, "view");
        C87412m.m108594g(dVar, "callback");
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: c */
    public void mo120577c(Object obj, Object obj2, C86174d dVar) {
        boolean z;
        C86457d dVar2 = (C86457d) obj;
        C7603a aVar = (C7603a) obj2;
        C87412m.m108594g(dVar2, "view");
        C87412m.m108594g(aVar, "viewAttribute");
        C87412m.m108594g(dVar, "callback");
        WeakReference<? extends C86770d<? extends C86428f<C86457d>, ? extends C87667c<C86457d, ? extends C86428f<C86457d>>>> weakReference = this.f251253b;
        if (weakReference == null || ((C86770d) weakReference.get()) == null) {
            Log.m105920e("MBFlutterFakeCoverView", "checkFlutterChannel error， flutter plugin null");
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (dVar2.f251252a instanceof C23872m0) {
                WeakReference<? extends C86770d<? extends C86428f<C86457d>, ? extends C87667c<C86457d, ? extends C86428f<C86457d>>>> weakReference2 = this.f251253b;
                C87412m.m108591d(weakReference2);
                C86770d dVar3 = (C86770d) weakReference2.get();
                if (dVar3 != null) {
                    String str = aVar.f25870a;
                    Object obj3 = dVar2.f251252a;
                    C87412m.m108592e(obj3, "null cannot be cast to non-null type com.google.protobuf.GeneratedMessageV3");
                    dVar3.mo121193A(str, ((C23872m0) obj3).toByteArray(), new C86455b(dVar, this));
                    return;
                }
                return;
            }
            Log.m105920e("MBFlutterFakeCoverView", "view message is not GeneratedMessageV3");
        }
    }

    /* renamed from: d */
    public C86177e.C86178a mo120578d(Object obj) {
        C87412m.m108594g((C86457d) obj, "view");
        return new C86456c();
    }

    /* renamed from: e */
    public Object mo120579e(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        String optString = jSONObject.optString("apiName");
        C87412m.m108593f(optString, "data.optString(\"apiName\")");
        return new C7603a(optString);
    }
}
