package ua1;

import android.content.SharedPreferences;
import com.tencent.p014mm.autogen.events.ExtOpenApiCallEvent;
import com.tencent.p014mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi;
import com.tencent.p014mm.plugin.ext.provider.ExtControlProviderEntry;
import com.tencent.p014mm.plugin.ext.provider.ExtControlProviderMsg;
import com.tencent.p014mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ra1.C47958b;

/* renamed from: ua1.a */
public class C90625a extends IStaticListener<ExtOpenApiCallEvent> {
    public boolean callback(IEvent iEvent) {
        ExtOpenApiCallEvent extOpenApiCallEvent = (ExtOpenApiCallEvent) iEvent;
        if (!(extOpenApiCallEvent instanceof ExtOpenApiCallEvent)) {
            Log.m105922f("ExtOpenApiCallEvent", "mismatched event");
            return false;
        }
        ExtOpenApiCallEvent.C80718a aVar = extOpenApiCallEvent.f236197d;
        if (aVar == null) {
            Log.m105920e("ExtOpenApiCallEvent", "revent.data is null");
            return false;
        }
        int i = aVar.f236199a;
        if (i == 9 || i == 13) {
            ExtOpenApiCallEvent.C80718a aVar2 = extOpenApiCallEvent.f236197d;
            ExtControlProviderMsg extControlProviderMsg = new ExtControlProviderMsg(aVar2.f236201c, aVar2.f236199a, aVar2.f236200b);
            ExtOpenApiCallEvent.C80719b bVar = extOpenApiCallEvent.f236198e;
            ExtOpenApiCallEvent.C80718a aVar3 = extOpenApiCallEvent.f236197d;
            bVar.f236205a = extControlProviderMsg.query(aVar3.f236202d, (String[]) null, (String) null, aVar3.f236203e, (String) null);
        } else if (i == 3) {
            ExtOpenApiCallEvent.C80718a aVar4 = extOpenApiCallEvent.f236197d;
            ExtControlProviderEntry extControlProviderEntry = new ExtControlProviderEntry(aVar4.f236201c, aVar4.f236199a, aVar4.f236200b);
            ExtOpenApiCallEvent.C80719b bVar2 = extOpenApiCallEvent.f236198e;
            ExtOpenApiCallEvent.C80718a aVar5 = extOpenApiCallEvent.f236197d;
            bVar2.f236205a = extControlProviderEntry.query(aVar5.f236202d, (String[]) null, (String) null, aVar5.f236203e, (String) null);
        } else if (i == 29) {
            ExtOpenApiCallEvent.C80718a aVar6 = extOpenApiCallEvent.f236197d;
            ExtControlProviderVoiceControl extControlProviderVoiceControl = new ExtControlProviderVoiceControl(aVar6.f236201c, aVar6.f236199a, aVar6.f236200b);
            ExtOpenApiCallEvent.C80719b bVar3 = extOpenApiCallEvent.f236198e;
            ExtOpenApiCallEvent.C80718a aVar7 = extOpenApiCallEvent.f236197d;
            bVar3.f236205a = extControlProviderVoiceControl.query(aVar7.f236202d, (String[]) null, (String) null, aVar7.f236203e, (String) null);
            SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
            if (!C47958b.f128650t) {
                defaultPreference.edit().putBoolean("hasCallVoiceControlApi", true).commit();
                C47958b.f128650t = true;
            }
        } else {
            ExtOpenApiCallEvent.C80718a aVar8 = extOpenApiCallEvent.f236197d;
            ExtControlProviderOpenApi extControlProviderOpenApi = new ExtControlProviderOpenApi(aVar8.f236201c, aVar8.f236199a, aVar8.f236200b, aVar8.f236204f);
            ExtOpenApiCallEvent.C80719b bVar4 = extOpenApiCallEvent.f236198e;
            ExtOpenApiCallEvent.C80718a aVar9 = extOpenApiCallEvent.f236197d;
            bVar4.f236205a = extControlProviderOpenApi.query(aVar9.f236202d, (String[]) null, (String) null, aVar9.f236203e, (String) null);
        }
        return true;
    }
}
