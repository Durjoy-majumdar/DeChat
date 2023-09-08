package h63;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ECardJsApiCheckEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6299q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import ie3.C8883h;
import yq3.C79148e;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: h63.c */
public class C8492c extends C86301e {

    /* renamed from: d */
    public C79148e.C79149a f27507d;

    /* renamed from: h63.c$a */
    public class C8493a implements C79148e.C79149a {

        /* renamed from: a */
        public ECardJsApiCheckEvent f27508a;

        public C8493a(ECardJsApiCheckEvent eCardJsApiCheckEvent) {
            this.f27508a = eCardJsApiCheckEvent;
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            Log.m105925i("MicroMsg.SubCoreECard", "open process end: %s", Integer.valueOf(i));
            if (i == -1) {
                this.f27508a.f9050e.f9064a = 0;
                C115669n.INSTANCE.mo160131h(14954, C8883h.f28150a, "openEcard:ok");
            } else {
                this.f27508a.f9050e.f9064a = -1;
                if (!C8883h.m8692c()) {
                    C115669n.INSTANCE.mo160131h(14954, C8883h.f28150a, "openEcard:fail");
                }
            }
            ((C6299q1) this.f27508a.f9049d.f9062l).run();
            if (!C8883h.m8692c()) {
                C8883h.f28150a = null;
            }
            C8492c.this.f27507d = null;
            Intent intent = new Intent();
            intent.putExtras(bundle);
            return intent;
        }
    }
}
