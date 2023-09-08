package p619ni;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C31922b1;
import java.util.Map;
import ob0.C35136m;
import p644pi.C77089d;

/* renamed from: ni.f */
public class C34846f implements C31922b1 {

    /* renamed from: ni.f$a */
    public class C34847a implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ String f93620a;

        /* renamed from: b */
        public final /* synthetic */ String f93621b;

        public C34847a(String str, String str2) {
            this.f93620a = str;
            this.f93621b = str2;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            Log.m105925i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "getContactCallBack username:%s succ:%s", Util.nullAs(str, ""), Boolean.valueOf(z));
            if (z) {
                C34846f.this.mo59757d(((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f93620a), this.f93620a, this.f93621b);
            }
        }
    }

    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (Util.nullAsNil(str).equals("IMUnionRoom2AssociateRoom")) {
            Log.m105925i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "consumeNewXml subType:%s", Util.nullAs(str, ""));
            if (map != null) {
                try {
                    String trim = Util.nullAsNil(map.get(".sysmsg.associateroomname")).trim();
                    String trim2 = Util.nullAsNil(map.get(".sysmsg.imunionroomname")).trim();
                    Log.m105925i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "consumeNewXml %s %s", Util.nullAs(trim2, ""), Util.nullAs(trim, ""));
                    if (C72996z1.m85807K5(trim) && !Util.isNullOrNil(trim2)) {
                        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(trim);
                        if (Lo == null) {
                            C31519v2.m39436a().mo55988e(trim, (String) null, new C34847a(trim, trim2));
                        } else {
                            mo59757d(Lo, trim, trim2);
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "consumeNewXml Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo59757d(C44661m1 m1Var, String str, String str2) {
        boolean z;
        Class cls = C39479c.class;
        Object obj = "null";
        if (m1Var != null) {
            try {
                if (Util.isNullOrNil(m1Var.field_associateOpenIMRoomName)) {
                    C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(str2);
                    Object[] objArr = new Object[4];
                    objArr[0] = str;
                    objArr[1] = Boolean.valueOf(m1Var.mo69795w2());
                    objArr[2] = str2;
                    if (Lo != null) {
                        obj = Boolean.valueOf(Lo.mo69795w2());
                    }
                    objArr[3] = obj;
                    Log.m105925i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "associateRoomName %s finish %s, imunionRoomName %s finish %s", objArr);
                    if (Lo == null || Lo.mo69795w2()) {
                        z = false;
                    } else {
                        Lo.field_openIMRoomMigrateStatus = 2;
                        Lo.field_associateOpenIMRoomName = str;
                        ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).replace(Lo);
                        z = true;
                    }
                    if (z) {
                        m1Var.field_openIMRoomMigrateStatus = 1;
                    } else {
                        m1Var.field_openIMRoomMigrateStatus = 3;
                    }
                    m1Var.field_associateOpenIMRoomName = str2;
                    ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).replace(m1Var);
                    if (z) {
                        ((C77089d) C86312j.m106911c(C77089d.class)).yx0().mo72068c(str, str2);
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "handleInfo Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        if (m1Var != null) {
            obj = Util.nullAs(m1Var.field_associateOpenIMRoomName, "");
        }
        objArr2[0] = obj;
        Log.m105921e("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "handleInfo member:%s", objArr2);
    }
}
