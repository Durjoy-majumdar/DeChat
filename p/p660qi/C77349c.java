package p660qi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.MultiCondition;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import f40.C86709a0;
import f62.C31922b1;
import f62.C75700k0;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C35136m;
import p749xh.C78832y7;
import sf0.C48374j0;

/* renamed from: qi.c */
public class C77349c implements C31922b1 {
    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        Map<String, String> map2 = map;
        new LinkedList();
        new LinkedList();
        new LinkedList();
        Class cls = C78832y7.class;
        Class cls2 = C75700k0.class;
        if (map2 == null) {
            try {
                Log.m105920e("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[parseXml] values == null ");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", e, "", new Object[0]);
            }
        } else {
            String g = C48374j0.m53718g(aVar.f94242a.f227628e);
            Log.m105925i("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[parseXml] type:%s, values size:%s", Util.nullAsNil((String) null), Integer.valueOf(map.size()));
            long j = Util.getLong(map2.get(".sysmsg.newmsgid"), 0);
            Log.m105925i("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[parseXml] mConfirmUsername:%s, mDisableMsgId:%s username:%s", map2.get(".sysmsg.confirm_username"), Long.valueOf(j), g);
            if (Util.isNullOrNil(g)) {
                Log.m105920e("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[handle] username is null!");
            } else {
                C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).h30(g, j);
                if (h302.getMsgId() > 0 && !Util.isNullOrNil(h302.mo108768t())) {
                    h302.mo108743W2(h302.f230723F | 128);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).yy0(h302.mo108774y2(), h302);
                }
                SingleTable singleTable = C78832y7.f231620o;
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                LinkedList linkedList3 = new LinkedList();
                Column column = C78832y7.f231622q;
                MultiCondition and = new MultiCondition(column.equal(g)).and((ISqlCondition) C78832y7.f231623r.equal((Number) Long.valueOf(j)));
                SingleTable singleTable2 = C78832y7.f231620o;
                C78832y7 y7Var = (C78832y7) singleTable2.select((List<? extends ISqlColumn>) linkedList).where(and).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build().singleQuery(C86709a0.m107535s().f251811i, cls);
                if (y7Var != null) {
                    y7Var.field_state = 1;
                    y7Var.updateToDB(C86709a0.m107535s().f251811i, true);
                    LinkedList linkedList4 = new LinkedList();
                    LinkedList linkedList5 = new LinkedList();
                    LinkedList linkedList6 = new LinkedList();
                    MultiCondition and2 = new MultiCondition(column.equal(g)).and(C78832y7.f231625t.equal((Number) 0).and(C78832y7.f231624s.equal((Number) 0)));
                    linkedList5.add(C78832y7.f231626u.orderDesc());
                    List multiQuery = singleTable2.select((List<? extends ISqlColumn>) linkedList4).where(and2).orderBy((List<? extends ISqlOrder>) linkedList5).groupBy((List<? extends Column>) linkedList6).build().multiQuery(C86709a0.m107535s().f251811i, cls);
                    C72976h2 j2 = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69771j(g);
                    j2.mo108816h3(multiQuery.size());
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69773k0(j2, g);
                }
            }
        }
        return null;
    }
}
