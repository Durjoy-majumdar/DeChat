package com.tencent.p014mm.plugin.appbrand.headless;

import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import gy3.C8480h;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/headless/BindRemoteServiceData;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/plugin/appbrand/headless/BindRemoteServiceResult;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/headless/BindRemoteServiceData;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.headless.b */
final class C81905b<InputType, ResultType> implements C1255d {

    /* renamed from: d */
    public static final C81905b<InputType, ResultType> f240242d = new C81905b<>();

    public void invoke(Object obj, C1256g gVar) {
        BindRemoteServiceData bindRemoteServiceData = (BindRemoteServiceData) obj;
        if (bindRemoteServiceData != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C81918n(bindRemoteServiceData, new C81904a(gVar)));
        } else if (gVar != null) {
            gVar.mo894a(new BindRemoteServiceResult(-4, (String) null, 2, (C8480h) null));
        }
    }
}
