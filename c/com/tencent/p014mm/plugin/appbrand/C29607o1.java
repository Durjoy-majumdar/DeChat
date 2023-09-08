package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Landroid/os/Parcelable;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.o1 */
final class C29607o1<InputType, ResultType> implements C1255d {

    /* renamed from: d */
    public static final C29607o1<InputType, ResultType> f80536d = new C29607o1<>();

    public void invoke(Object obj, C1256g gVar) {
        IPCBoolean iPCBoolean = (IPCBoolean) obj;
        C61926c.m72668M(new C83704n1(iPCBoolean != null ? iPCBoolean.f10312d : false));
        if (gVar != null) {
            gVar.mo894a(IPCVoid.f10316d);
        }
    }
}
