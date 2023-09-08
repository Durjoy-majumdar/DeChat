package com.tencent.p014mm.plugin.webview.core;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import gy3.C8477a0;
import kotlin.Metadata;
import ob0.C47350c;
import ob0.C89144l0;
import te3.C51955xc2;
import te3.C52099yc2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.core.s */
final class C30588s<InputType, ResultType> implements C80883e {

    /* renamed from: d */
    public static final C30588s<InputType, ResultType> f82384d = new C30588s<>();

    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        C8477a0 a0Var = new C8477a0();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/getwuid";
        bVar.f127069d = 4422;
        bVar.f127066a = new C51955xc2();
        bVar.f127067b = new C52099yc2();
        C89144l0.m111429e(bVar.mo72403a(), new C30587r(a0Var, gVar), false);
    }
}
