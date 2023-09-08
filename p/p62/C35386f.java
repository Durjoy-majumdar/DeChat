package p62;

import android.content.Context;
import android.os.Bundle;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import d62.C7241k;
import di3.C86312j;
import f40.C86709a0;
import f62.C31950v0;
import f62.C75700k0;
import java.lang.ref.WeakReference;
import java.util.Map;
import o62.C35111g;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: p62.f */
public class C35386f extends C35111g implements C7241k.C7248g {
    /* renamed from: B */
    public void mo60239B(String str, Map<String, String> map, C35136m.C35137a aVar) {
        Class cls = C31950v0.class;
        Class cls2 = C75700k0.class;
        C77949j3 j3Var = aVar.f94242a;
        String g = C48374j0.m53718g(j3Var.f227628e);
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).h30(g, j3Var.f227638r);
        String d = mo59873d(map, "link_history");
        if (Util.isNullOrNil(d)) {
            Log.m105921e("MicroMsg.SysMsgTemp.HandlerProfileWithRevokeReceived", "onReceivedImp head(LINK_TYPE_HISTORY) is null.(%s %s)", g, Long.valueOf(h302.mo108774y2()));
            return;
        }
        ((C31950v0) C86312j.m106911c(cls)).mo58433fs(h302, map, d, "tmpl_type_profile");
        String nullAs = Util.nullAs(map.get(d + ".historyid"), "");
        h302.mo108738R2(nullAs);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(h302.getMsgId(), h302);
        ((C31950v0) C86312j.m106911c(cls)).mo58432Mj(nullAs, h302.getMsgId(), h302.mo108768t());
        Log.m105925i("MicroMsg.SysMsgTemp.HandlerProfileWithRevokeReceived", "onReceivedImp msgId:%s historyId:%s", Long.valueOf(h302.getMsgId()), nullAs);
    }

    /* renamed from: K0 */
    public void mo8421K0(String str, Map<String, String> map, C35136m.C35137a aVar) {
        mo60239B(str, map, aVar);
    }

    /* renamed from: q */
    public void mo59874q(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        if (Util.isNullOrNil(mo59873d(map, "link_history"))) {
            Log.m105920e("MicroMsg.SysMsgTemp.HandlerProfileWithRevokeReceived", "onClickLinkImp head is null.");
        }
    }

    /* renamed from: u2 */
    public void mo59875u2(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        super.mo59875u2(str, map, bundle, weakReference, weakReference2);
    }
}
