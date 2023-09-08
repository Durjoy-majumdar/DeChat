package s42;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.magicbrush.base.MBJsEventBase;
import com.tencent.p014mm.plugin.magicbrush.jsapi.base.CallbackType;
import com.tencent.p014mm.plugin.magicbrush.jsapi.base.RequestType;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7596h;
import e42.C86431j;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ls42/d;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/RequestType;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "<init>", "()V", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: s42.d */
public abstract class C90130d implements C80883e<RequestType, CallbackType> {

    /* renamed from: d */
    public C1256g<CallbackType> f258822d;

    /* renamed from: e */
    public boolean f258823e;

    /* renamed from: f */
    public String f258824f;

    /* renamed from: g */
    public C86431j<?> f258825g;

    /* renamed from: a */
    public final synchronized void mo124393a(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        if (this.f258823e) {
            Log.m105928w("MicroMsg.SimpleMainProcessTask", "hy: task already released!");
            return;
        }
        this.f258823e = true;
        C1256g<CallbackType> gVar = this.f258822d;
        if (gVar != null) {
            gVar.mo894a(new CallbackType.FinalCallback(new IPCString(hVar.toString())));
        } else {
            C87412m.m108603p("mCallback");
            throw null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo124394b(MBJsEventBase mBJsEventBase) {
        C87412m.m108594g(mBJsEventBase, "event");
        C1256g<CallbackType> gVar = this.f258822d;
        if (gVar != null) {
            gVar.mo894a(new CallbackType.Event(mBJsEventBase));
        } else {
            C87412m.m108603p("mCallback");
            throw null;
        }
    }

    /* renamed from: c */
    public abstract void mo73403c(C7596h hVar);

    /* renamed from: d */
    public final C7596h mo124395d(int i, String str) {
        C86431j<?> jVar = this.f258825g;
        if (jVar != null) {
            return jVar.mo120842g(i, str);
        }
        C87412m.m108603p("mFakeJsApi");
        throw null;
    }

    /* renamed from: e */
    public final C7596h mo124396e() {
        C86431j<?> jVar = this.f258825g;
        if (jVar != null) {
            return jVar.mo120844i();
        }
        C87412m.m108603p("mFakeJsApi");
        throw null;
    }

    public void invoke(Object obj, C1256g gVar) {
        RequestType requestType = (RequestType) obj;
        C87412m.m108594g(requestType, "data");
        C87412m.m108594g(gVar, "callback");
        String str = requestType.f248434d.f10315d;
        C87412m.m108593f(str, "data.jsApiName.value");
        this.f258824f = str;
        String str2 = requestType.f248435e.f10315d;
        C87412m.m108593f(str2, "data.dataStr.value");
        C7596h hVar = new C7596h(str2);
        this.f258822d = gVar;
        this.f258825g = new C90129c(this);
        mo73403c(hVar);
    }
}
