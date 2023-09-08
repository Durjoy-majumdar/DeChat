package yn2;

import com.tencent.p014mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.ext.provider.ExtControlProviderSNS;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import jr2.C76440q;
import jr2.C99014h;
import ob0.C117747y;

/* renamed from: yn2.h */
public class C102879h implements C76440q.C76441a {

    /* renamed from: d */
    public final /* synthetic */ ExtStartSnsServerAndCallbackOnFpSetSizeEvent f303680d;

    public C102879h(C102880i iVar, ExtStartSnsServerAndCallbackOnFpSetSizeEvent extStartSnsServerAndCallbackOnFpSetSizeEvent) {
        this.f303680d = extStartSnsServerAndCallbackOnFpSetSizeEvent;
    }

    /* renamed from: B0 */
    public void mo96527B0(String str, boolean z, int i, C99014h hVar) {
        SnsMethodCalculate.markStartTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener$1");
        ExtStartSnsServerAndCallbackOnFpSetSizeEvent.C92504a aVar = this.f303680d.f264795d;
        if (aVar != null) {
            ((ExtControlProviderSNS.C93377b.C93378a) aVar.f264800e).mo57753a((C114770g) null);
        }
        SnsMethodCalculate.markEndTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener$1");
    }

    /* renamed from: R6 */
    public void mo96528R6(String str, boolean z, int i, C99014h hVar) {
        SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener$1");
        SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener$1");
    }

    /* renamed from: W0 */
    public void mo96529W0(String str, String str2, boolean z, int i, C99014h hVar, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener$1");
        SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener$1");
    }

    /* renamed from: j2 */
    public void mo96540j2(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener$1");
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener$1");
    }
}
