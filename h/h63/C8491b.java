package h63;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.autogen.events.ECardJsApiCheckEvent;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6299q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import h63.C8492c;
import ie3.C8883h;
import j63.C76397d;
import ob0.C11385n;
import ob0.C117747y;
import v53.C78339d;

/* renamed from: h63.b */
public class C8491b implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ ECardJsApiCheckEvent.C1003a f27503d;

    /* renamed from: e */
    public final /* synthetic */ ECardJsApiCheckEvent f27504e;

    /* renamed from: f */
    public final /* synthetic */ String f27505f;

    /* renamed from: g */
    public final /* synthetic */ C8492c f27506g;

    public C8491b(C8492c cVar, ECardJsApiCheckEvent.C1003a aVar, ECardJsApiCheckEvent eCardJsApiCheckEvent, String str) {
        this.f27506g = cVar;
        this.f27503d = aVar;
        this.f27504e = eCardJsApiCheckEvent;
        this.f27505f = str;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(580, this);
        if (i == 0 && i2 == 0) {
            Log.m105924i("MicroMsg.SubCoreECard", "jsapi check success");
            C8883h.f28150a = ((C78339d) yVar).mo108331j1();
            Context context = (Context) this.f27503d.f9060j.get();
            if (context == null || !(context instanceof Activity)) {
                ECardJsApiCheckEvent eCardJsApiCheckEvent = this.f27504e;
                eCardJsApiCheckEvent.f9050e.f9064a = -1;
                ((C6299q1) eCardJsApiCheckEvent.f9049d.f9062l).run();
                return;
            }
            C8492c cVar = this.f27506g;
            ECardJsApiCheckEvent eCardJsApiCheckEvent2 = this.f27504e;
            cVar.f27507d = new C8492c.C8493a(eCardJsApiCheckEvent2);
            int i3 = Util.getInt(eCardJsApiCheckEvent2.f9049d.f9059i, 0);
            ECardJsApiCheckEvent.C1003a aVar = this.f27504e.f9049d;
            C76397d.m91818d(i3, aVar.f9061k, aVar.f9058h, this.f27505f, context, this.f27506g.f27507d);
            return;
        }
        Log.m105920e("MicroMsg.SubCoreECard", "jsapi check fail");
        ECardJsApiCheckEvent eCardJsApiCheckEvent3 = this.f27504e;
        eCardJsApiCheckEvent3.f9050e.f9064a = -1;
        ((C6299q1) eCardJsApiCheckEvent3.f9049d.f9062l).run();
    }
}
