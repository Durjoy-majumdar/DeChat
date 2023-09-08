package rs1;

import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gj0.C87227a;
import hj0.C87535e;

/* renamed from: rs1.o8 */
public final class C63609o8 implements C87227a {

    /* renamed from: a */
    public final /* synthetic */ C56711j f180366a;

    /* renamed from: b */
    public final /* synthetic */ String f180367b;

    public C63609o8(C56711j jVar, String str) {
        this.f180366a = jVar;
        this.f180367b = str;
    }

    /* renamed from: a */
    public void mo88410a(C87535e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("stop fail before play new ");
        sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : null);
        Log.m105920e("FinderProjectionScreenUIC", sb.toString());
        C56711j.m65452c3(this.f180366a, this.f180367b, "StopFail");
    }

    /* renamed from: b */
    public void mo88411b(C87535e eVar) {
        C56711j.m65452c3(this.f180366a, this.f180367b, "StopSuccess");
    }
}
