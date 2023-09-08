package p62;

import android.content.Context;
import android.os.Bundle;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenimDimissionSucceedStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import d62.C7241k;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import he0.C76158j;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o62.C35111g;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: p62.d */
public class C35382d extends C35111g implements C7241k.C7248g {

    /* renamed from: d */
    public static final Map<Long, C35383a> f94731d = new ConcurrentHashMap();

    /* renamed from: p62.d$a */
    public static class C35383a {

        /* renamed from: a */
        public String f94732a = "";

        /* renamed from: b */
        public String f94733b = "";

        /* renamed from: c */
        public String f94734c = "";

        /* renamed from: d */
        public String f94735d = "";

        /* renamed from: e */
        public String f94736e = "";
    }

    /* renamed from: B */
    public static boolean m40669B(long j) {
        return ((C35383a) ((ConcurrentHashMap) f94731d).get(Long.valueOf(j))) != null;
    }

    /* renamed from: O */
    public static void m40670O(long j, int i) {
        C35383a aVar = (C35383a) ((ConcurrentHashMap) f94731d).get(Long.valueOf(j));
        if (aVar == null) {
            Log.m105921e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "openImDimissionSucceedReport info is null.(msgId:%s action:%s)", Long.valueOf(j), Integer.valueOf(i));
            return;
        }
        m40671Q(aVar, i);
    }

    /* renamed from: Q */
    public static void m40671Q(C35383a aVar, int i) {
        if (aVar == null) {
            Log.m105921e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "openImDimissionSucceedReport info is null.(action:%s)", Integer.valueOf(i));
            return;
        }
        OpenimDimissionSucceedStruct openimDimissionSucceedStruct = new OpenimDimissionSucceedStruct();
        openimDimissionSucceedStruct.f79137d = openimDimissionSucceedStruct.mo86045b("ResignationWorkUsername", aVar.f94732a, true);
        openimDimissionSucceedStruct.f79138e = openimDimissionSucceedStruct.mo86045b("TakeOverWorkUsername", aVar.f94733b, true);
        openimDimissionSucceedStruct.f79139f = openimDimissionSucceedStruct.mo86045b("WorkEnterpriseDescId", aVar.f94734c, true);
        openimDimissionSucceedStruct.f79140g = openimDimissionSucceedStruct.mo86045b("WorkEnterpriseName", aVar.f94735d, true);
        openimDimissionSucceedStruct.f79141h = openimDimissionSucceedStruct.mo86045b("SessionId", aVar.f94736e, true);
        openimDimissionSucceedStruct.f79142i = (long) i;
        openimDimissionSucceedStruct.mo86054n();
    }

    /* renamed from: D */
    public void mo60236D(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C77949j3 j3Var = aVar.f94242a;
        String g = C48374j0.m53718g(j3Var.f227628e);
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(g, j3Var.f227638r);
        String d = mo59873d(map, "new_link_succeed_contact");
        if (Util.isNullOrNil(d)) {
            Log.m105921e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "onReceivedImp head is null.(%s %s)", g, Long.valueOf(h302.mo108774y2()));
            return;
        }
        m40671Q(mo60237S(h302.getMsgId(), map, d), 1);
    }

    /* renamed from: K0 */
    public void mo8421K0(String str, Map<String, String> map, C35136m.C35137a aVar) {
        mo60236D(str, map, aVar);
    }

    /* renamed from: S */
    public C35383a mo60237S(long j, Map<String, String> map, String str) {
        String nullAs = Util.nullAs(map.get(str + ".origin_username"), "");
        String nullAs2 = Util.nullAs(map.get(str + ".heir_username"), "");
        String nullAs3 = Util.nullAs(map.get(str + ".succeed_ticket"), "");
        C35383a aVar = new C35383a();
        aVar.f94732a = nullAs;
        aVar.f94733b = nullAs2;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(nullAs);
        aVar.f94734c = z1Var.mo73976t2();
        aVar.f94735d = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2());
        aVar.f94736e = nullAs3;
        ((ConcurrentHashMap) f94731d).put(Long.valueOf(j), aVar);
        return aVar;
    }

    /* renamed from: q */
    public void mo59874q(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        String d = mo59873d(map, "new_link_succeed_contact");
        if (Util.isNullOrNil(d)) {
            Log.m105920e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "onClickLinkImp head is null.");
            return;
        }
        long j = bundle.getLong("msg_id");
        C35383a aVar = (C35383a) ((ConcurrentHashMap) f94731d).get(Long.valueOf(j));
        if (aVar == null) {
            aVar = mo60237S(j, map, d);
        }
        if (Util.isEqual(str, "link_profile")) {
            m40671Q(aVar, 2);
        } else if (Util.isEqual(str, "new_link_succeed_contact")) {
            m40671Q(aVar, 5);
        }
    }

    /* renamed from: u2 */
    public void mo59875u2(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        super.mo59875u2(str, map, bundle, weakReference, weakReference2);
    }
}
