package p265wx;

import android.content.Context;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import hn2.C20974j;
import hn2.C20987k;
import hn2.C20989l;
import p274xx.C15907f;
import xm2.C23109g;

@C86522b
/* renamed from: wx.i */
public class C22932i extends C86301e implements C15907f {
    /* renamed from: FQ */
    public void mo14554FQ(Context context, String str, String str2, String str3, C15907f.C15908a aVar) {
        C20974j.m23153g(context, str, str2, str3, aVar);
    }

    public void Hr0(Context context, int i, int i2, long j, long j2, C23109g gVar, boolean z) {
        C20974j.m23148b(context, i, i2, j, j2, gVar, z);
    }

    public void K00(Context context, long j, CheckBoxPreference checkBoxPreference, C15907f.C15909b bVar, int i) {
        C20974j.m23154h(context, j, checkBoxPreference, bVar, i);
    }

    /* renamed from: hz */
    public void mo14557hz(Context context, long j, boolean z, C15907f.C15909b bVar) {
        C20974j.m23149c(context, j, z, bVar);
    }

    /* renamed from: ur */
    public void mo14558ur(Context context, long j, boolean z, C15907f.C15909b bVar) {
        if (z) {
            C20974j.m23156j(context, context.getString(C20974j.m23152f(j)), new C20987k(context, 0 | j, bVar), true);
            return;
        }
        long j2 = j | 0;
        Log.m105924i("MicroMsg.SafeSwitchTipDialog", "doSave. switchValue = " + j + ", WhichExtFunctionSwitch= " + j2);
        C20974j.m23147a(context, 3, 2, j2, j, new C20989l(bVar));
    }

    /* renamed from: vq */
    public void mo14559vq(boolean z, long j) {
        Log.m105924i("MicroMsg.SafeSwitchTipDialog", "updateExtStatus2Values onPositionBtn. ConfigStorageLogic.getExtStatus2FromUserInfo() = " + C75592q0.m90780j());
        long j2 = C75592q0.m90780j();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC, Long.valueOf(!z ? (~j) & j2 : j2 | j));
    }
}
