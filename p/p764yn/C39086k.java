package p764yn;

import a12.C27734k;
import com.tencent.p014mm.autogen.events.CheckHotPatchAlertEvent;
import com.tencent.p014mm.autogen.events.CheckTinkerUpdateEvent;
import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import qe3.C89625d;
import x02.C38427a;
import x02.C38434l;
import y02.C91361e;
import zw3.C91941a;

/* renamed from: yn.k */
public class C39086k extends IStaticListener<IEvent> {
    public boolean callback(IEvent iEvent) {
        IEvent iEvent2 = iEvent;
        Class cls = C38434l.class;
        if (!C86709a0.m107522a()) {
            return false;
        }
        if (iEvent2 instanceof CheckHotPatchAlertEvent) {
            C38434l lVar = (C38434l) C86312j.m106911c(cls);
            CheckHotPatchAlertEvent checkHotPatchAlertEvent = (CheckHotPatchAlertEvent) iEvent2;
            if (lVar.f101387d) {
                String string = MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_patch_msg_key", "");
                String string2 = MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_patch_version_key", "");
                Log.m105925i("Tinker.SubCoreHotpatch", "v1:%s, v2:%s, wording:%s", String.format("0x%08X", new Object[]{Integer.valueOf(C89625d.f257841g)}), string2, string);
                if (!Util.isNullOrNil(string)) {
                    if (String.format("0x%08X", new Object[]{Integer.valueOf(C89625d.f257841g)}).equalsIgnoreCase(string2)) {
                        CheckHotPatchAlertEvent.C28719b bVar = checkHotPatchAlertEvent.f78740e;
                        bVar.f78741a = true;
                        bVar.f78742b = string;
                        C38427a.m41869b(2);
                        MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_version_key", "").apply();
                        MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_msg_key", "").apply();
                    }
                }
                lVar.f101387d = false;
            }
            return false;
        } else if (iEvent2 instanceof DynamicConfigUpdatedEvent) {
            DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent = (DynamicConfigUpdatedEvent) iEvent2;
            ((C38434l) C86312j.m106911c(cls)).getClass();
            C27734k.m37985d(MMApplicationContext.getContext());
            C91941a.m115469d().mo125792b(MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).getInt("check_tinker_update_interval", 12));
            return false;
        } else {
            if (iEvent2 instanceof CheckTinkerUpdateEvent) {
                ((C38434l) C86312j.m106911c(cls)).getClass();
                ((CheckTinkerUpdateEvent) iEvent2).f78755d.getClass();
                C86709a0.m107524d().mo123460f(new C91361e());
            }
            return false;
        }
    }
}
