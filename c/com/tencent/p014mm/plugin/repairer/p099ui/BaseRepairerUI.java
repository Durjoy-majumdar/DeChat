package com.tencent.p014mm.plugin.repairer.p099ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import h81.C32735h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.BaseRepairerUI */
public abstract class BaseRepairerUI extends MMSecDataActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        if (!BuildInfo.DEBUG) {
            if (!(BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.CLIENT_VERSION_INT == 788529167) && !WeChatEnvironment.hasDebugger()) {
                z = false;
            }
        }
        if (!z && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_local_wechat_repair_entrance_flag_and, 0) == 0) {
            finish();
        }
    }
}
