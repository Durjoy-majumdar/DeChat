package dv1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import ev1.C31726h;
import ev1.C58843i;
import ev1.C58846j;
import ev1.C58848l;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import iv1.C60636b;
import kr0.C76629w0;
import z04.C112551y;

/* renamed from: dv1.o */
public final class C58441o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C58435m f167417d;

    /* renamed from: e */
    public final /* synthetic */ C31726h f167418e;

    public C58441o(C58435m mVar, C31726h hVar) {
        this.f167417d = mVar;
        this.f167418e = hVar;
    }

    public final void run() {
        C58435m mVar = this.f167417d;
        C31726h hVar = this.f167418e;
        mVar.getClass();
        C87412m.m108594g(hVar, "notifyInfo");
        C58843i a = C58843i.f168452c.mo84050a();
        a.getClass();
        if (a.f168455b.contains(hVar.field_ForcePushId)) {
            Log.m105924i("ForceNotifyItemMgr", "add info failed, historyIdSet contains " + hVar.field_ForcePushId);
        } else if (hVar.field_Type == 0) {
            C58846j jVar = new C58846j(a);
            String str = hVar.field_ForcePushId;
            C87412m.m108593f(str, "info.field_ForcePushId");
            String str2 = null;
            if (C112551y.m153808h(str, "@miniapp", false, 2, (Object) null)) {
                ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106884tG(hVar.field_UserName, new C60636b(hVar, jVar));
            } else {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(hVar.field_UserName);
                StringBuilder sb = new StringBuilder();
                sb.append("transformMsgItem, forcePushId:");
                sb.append(hVar.field_ForcePushId);
                sb.append(" username:");
                sb.append(hVar.field_UserName);
                sb.append(" nickname:");
                String f = z1Var != null ? z1Var.mo62898f() : null;
                if (f == null) {
                    f = "";
                }
                sb.append(f);
                Log.m105924i("ForceNotifyUtil", sb.toString());
                String str3 = hVar.field_ForcePushId;
                String str4 = hVar.field_UserName;
                if (z1Var != null) {
                    str2 = z1Var.mo62898f();
                }
                String str5 = str2 == null ? "" : str2;
                long j = hVar.field_CreateTime;
                String string = MMApplicationContext.getContext().getString(C0966R.string.f1n);
                C87412m.m108593f(str3, "field_ForcePushId");
                C87412m.m108593f(str4, "field_UserName");
                C87412m.m108593f(string, "getString(R.string.force_notify_receive_a_msg)");
                jVar.invoke(new C58848l(str3, str4, str5, string, j, (String) null));
            }
        }
        if (mVar.yx0()) {
            mVar.Ex0(false);
        } else {
            mVar.Fx0();
        }
    }
}
