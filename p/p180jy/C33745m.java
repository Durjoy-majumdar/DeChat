package p180jy;

import android.content.SharedPreferences;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: jy.m */
public class C33745m extends IStaticListener<PostSyncTaskEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        Class cls = C10485b.class;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.DynamicConfigUpdatedListener", "PostSyncTaskEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        } else {
            int b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("SnsHEVCSwitch", 0);
            int b2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("SnsWXPCSwitch", 0);
            boolean z = true;
            boolean z2 = b == 1;
            if (b2 != 1) {
                z = false;
            }
            SharedPreferences.Editor edit = MultiProcSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "sp_sns_dynswitch_stg", 4, false).edit();
            edit.putBoolean("sw_use_vcodec_img", z2);
            edit.putBoolean("sw_use_wxpc_img", z);
            edit.commit();
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        return false;
    }
}
