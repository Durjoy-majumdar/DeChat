package ak3;

import a14.C53934p0;
import ck3.C39969i;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import wx3.C15601d;
import zj3.C79346d0;
import zj3.C79373o;

/* renamed from: ak3.e */
public final class C67066e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C67056a f192638d;

    /* renamed from: e */
    public final /* synthetic */ ChatTipsBarGroup.C74826e f192639e;

    /* renamed from: f */
    public final /* synthetic */ boolean f192640f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67066e(C67056a aVar, ChatTipsBarGroup.C74826e eVar, boolean z) {
        super(0);
        this.f192638d = aVar;
        this.f192639e = eVar;
        this.f192640f = z;
    }

    public Object invoke() {
        Class cls = C79373o.class;
        this.f192638d.f215752d.mo91558S();
        C67056a aVar = this.f192638d;
        ChatTipsBarGroup.C74826e eVar = this.f192639e;
        boolean z = this.f192640f;
        String r = aVar.f215752d.mo91577r();
        long j = aVar.f192609g;
        Log.m105919d(aVar.f192607e, "updateChatTipsBarGroup() called %s %s", r, Long.valueOf(j));
        if (!C72996z1.m85820U5(r)) {
            if (!(r != null && C72996z1.m85824W5(r))) {
                Log.m105918d(aVar.f192607e, "updateChatTipsBarGroup() single chat ");
                aVar.mo91070Y5();
                if (z) {
                    ((C79346d0) aVar.f215752d.f193278b.mo102812a(C79346d0.class)).mo102653n5(1);
                }
                return C13598b0.f38549a;
            }
        }
        Log.m105918d(aVar.f192607e, "updateChatTipsBarGroup() group chat");
        try {
            if (((C79373o) aVar.f215752d.f193278b.mo102812a(cls)).mo102442Q4() == null) {
                Log.m105920e(aVar.f192607e, "prepareDataAndCommit getDataScope == null err");
            } else {
                C39969i p = aVar.f215752d.mo91575p();
                LifecycleScope Q4 = ((C79373o) aVar.f215752d.f193278b.mo102812a(cls)).mo102442Q4();
                if (Q4 != null) {
                    LifecycleScope.launchDefault$default(Q4, (C53934p0) null, new C67059b(aVar, p, j, eVar, z, (C15601d<? super C67059b>) null), 1, (Object) null);
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace(aVar.f192607e, th, "", new Object[0]);
        }
        return C13598b0.f38549a;
    }
}
