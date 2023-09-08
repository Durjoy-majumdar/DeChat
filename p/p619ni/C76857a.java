package p619ni;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.executor.ReplaceExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
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
import com.tencent.xweb.file.XVFSFile;
import eb0.C31543z5;
import eb0.C75604z3;
import eb0.C86497v5;
import f40.C86709a0;
import f62.C75700k0;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C35136m;
import p749xh.C78832y7;
import p823sg.C90193h;
import p909ki.C76578a;
import p909ki.C76579b;
import p909ki.C76580c;
import sf0.C48374j0;
import te3.C77949j3;
import zh3.C91753f;

/* renamed from: ni.a */
public class C76857a implements C86497v5.C31521b {

    /* renamed from: ni.a$a */
    public class C76858a implements Comparator<String> {
        public C76858a(C76857a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((String) obj).compareToIgnoreCase((String) obj2);
        }
    }

    public C76857a() {
        C78832y7.createTable(C86709a0.m107535s().f251811i);
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Class<C78832y7> cls;
        Integer num;
        C35136m.C35137a aVar2 = aVar;
        Class<C78832y7> cls2 = C78832y7.class;
        Class<C75700k0> cls3 = C75700k0.class;
        C77949j3 j3Var = aVar2.f94242a;
        int i = j3Var.f227630g;
        if (i == 10002) {
            String g = C48374j0.m53718g(j3Var.f227631h);
            if (Util.isNullOrNil(g)) {
                Log.m105928w("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "msg content is null");
                return;
            }
            String g2 = C48374j0.m53718g(j3Var.f227628e);
            Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
            if (parseXml == null || (!parseXml.get(".sysmsg.$type").equals("NewXmlChatRoomAccessVerifyApplication") && !parseXml.get(".sysmsg.$type").equals("NewXmlOpenIMChatRoomAddChatRoomMemberApplication"))) {
                Class<C75700k0> cls4 = cls3;
                C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls4)).mo96095LE()).h30(g2, j3Var.f227638r);
                boolean z = h302.getMsgId() > 0;
                h302.mo108745Y2(j3Var.f227638r);
                h302.mo108733M2(C75604z3.m90841m(g2, (long) j3Var.f227635o));
                h302.setType(10002);
                h302.mo108732L2(g);
                h302.mo108740T2(0);
                h302.mo108749c3(g2);
                h302.mo101012p4(j3Var.f227636p);
                h302.mo108743W2(h302.f230723F & -129);
                C75604z3.m90842n(h302, aVar2);
                if (!z) {
                    C75604z3.m90852x(h302);
                } else {
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls4)).mo96095LE()).yy0(j3Var.f227638r, h302);
                }
            } else {
                String str = parseXml.get(".sysmsg.$type").equals("NewXmlChatRoomAccessVerifyApplication") ? ".sysmsg.NewXmlChatRoomAccessVerifyApplication" : ".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication";
                String str2 = parseXml.get(str + ".RoomName");
                String str3 = parseXml.get(str + ".link.inviterusername");
                if (Util.isNullOrNil(str3)) {
                    str3 = parseXml.get(str + ".link.inviter.username");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".link.ticket");
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                String str4 = "MicroMsg.ChatroomAccessVerifySysCmdMsgListener";
                LinkedList linkedList3 = new LinkedList();
                Class<C75700k0> cls5 = cls3;
                LinkedList linkedList4 = new LinkedList();
                C77949j3 j3Var2 = j3Var;
                LinkedList linkedList5 = new LinkedList();
                String str5 = parseXml.get(str + ".link.invitationreason");
                LinkedList linkedList6 = new LinkedList();
                String str6 = parseXml.get(sb.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                String str7 = parseXml.get(str + ".link.scene");
                sb4.append(".link.memberlist.memberlistsize");
                int i2 = Util.getInt(parseXml.get(sb4.toString()), 0);
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = i2;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str);
                    String str8 = g2;
                    sb5.append(".link.memberlist.member");
                    Object obj = "";
                    if (i3 == 0) {
                        cls = cls2;
                        num = obj;
                    } else {
                        cls = cls2;
                        num = Integer.valueOf(i3);
                    }
                    sb5.append(num);
                    sb5.append(".username");
                    linkedList.add(Util.nullAsNil(parseXml.get(sb5.toString())));
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append(".link.memberlist.member");
                    sb6.append(i3 == 0 ? obj : Integer.valueOf(i3));
                    sb6.append(".nickname");
                    linkedList2.add(Util.nullAsNil(parseXml.get(sb6.toString())));
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    sb7.append(".link.memberlist.member");
                    sb7.append(i3 == 0 ? obj : Integer.valueOf(i3));
                    sb7.append(".headimgurl");
                    linkedList3.add(Util.nullAsNil(parseXml.get(sb7.toString())));
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str);
                    sb8.append(".link.memberlist.member");
                    sb8.append(i3 == 0 ? obj : Integer.valueOf(i3));
                    sb8.append(".quitchatroominfo");
                    linkedList4.add(Util.nullAsNil(parseXml.get(sb8.toString())));
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(str);
                    sb9.append(".link.memberlist.member");
                    sb9.append(i3 == 0 ? obj : Integer.valueOf(i3));
                    sb9.append(".appid");
                    linkedList5.add(Util.nullAsNil(parseXml.get(sb9.toString())));
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(str);
                    sb10.append(".link.memberlist.member");
                    if (i3 != 0) {
                        obj = Integer.valueOf(i3);
                    }
                    sb10.append(obj);
                    sb10.append(".descid");
                    linkedList6.add(Util.nullAsNil(parseXml.get(sb10.toString())));
                    i3++;
                    i2 = i4;
                    g2 = str8;
                    cls2 = cls;
                }
                Class<C78832y7> cls6 = cls2;
                String str9 = g2;
                SingleTable singleTable = C78832y7.f231620o;
                LinkedList linkedList7 = linkedList6;
                String str10 = str2;
                Class<C78832y7> cls7 = cls6;
                C78832y7 y7Var = (C78832y7) C78832y7.f231620o.select((List<? extends ISqlColumn>) new LinkedList()).where(new MultiCondition(C78832y7.f231622q.equal(str2)).and((ISqlCondition) C78832y7.f231621p.equal(mo107115d(str3, linkedList))).and((ISqlCondition) C78832y7.f231624s.equal((Number) 0))).orderBy((List<? extends ISqlOrder>) new LinkedList()).groupBy((List<? extends Column>) new LinkedList()).build().singleQuery(C86709a0.m107535s().f251811i, cls7);
                try {
                    C76579b bVar = new C76579b();
                    if (y7Var == null) {
                        y7Var = new C78832y7();
                        y7Var.field_chatRoomName = str9;
                        y7Var.field_hashKey = mo107115d(str3, linkedList);
                        y7Var.field_primaryKey = mo107115d(str3, linkedList) + "_" + System.currentTimeMillis();
                        C76580c cVar = new C76580c();
                        cVar.f224138d = str3;
                        cVar.f224142h = parseXml.get(str + ".link.inviter.appid");
                        cVar.f224143i = parseXml.get(str + ".link.inviter.descid");
                        bVar.f224135d = cVar;
                        int i5 = 0;
                        while (i5 < linkedList.size()) {
                            LinkedList<C76580c> linkedList8 = bVar.f224136e;
                            C76580c cVar2 = new C76580c();
                            cVar2.f224138d = (String) linkedList.get(i5);
                            cVar2.f224139e = (String) linkedList2.get(i5);
                            cVar2.f224140f = (String) linkedList3.get(i5);
                            cVar2.f224141g = (String) linkedList4.get(i5);
                            cVar2.f224142h = (String) linkedList5.get(i5);
                            LinkedList linkedList9 = linkedList7;
                            cVar2.f224143i = (String) linkedList9.get(i5);
                            linkedList8.add(cVar2);
                            i5++;
                            linkedList7 = linkedList9;
                        }
                    } else {
                        bVar.parseFrom(y7Var.field_data);
                    }
                    LinkedList<C76578a> linkedList10 = bVar.f224137f;
                    C76578a aVar3 = new C76578a();
                    aVar3.f224131d = str7;
                    aVar3.f224132e = str6;
                    aVar3.f224133f = str5;
                    C77949j3 j3Var3 = j3Var2;
                    aVar3.f224134g = j3Var3.f227638r;
                    linkedList10.add(aVar3);
                    y7Var.field_msgId = j3Var3.f227638r;
                    y7Var.field_state = 0;
                    y7Var.field_read = 0;
                    y7Var.field_data = bVar.toByteArray();
                    y7Var.field_updateTime = C31543z5.m39451a();
                    C91753f fVar = C86709a0.m107535s().f251811i;
                    StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getUPDATE(), String.valueOf(y7Var.field_primaryKey), "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
                    storageObserverEvent.setObj(y7Var);
                    new ReplaceExecutor(y7Var, storageObserverEvent, C78832y7.f231619G, "MicroMsg.SDK.BaseRoomVerifyApplicationStg").execute(fVar);
                    String str11 = str10;
                    ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr().doNotify(str11);
                    LinkedList linkedList11 = new LinkedList();
                    LinkedList linkedList12 = new LinkedList();
                    LinkedList linkedList13 = new LinkedList();
                    MultiCondition and = new MultiCondition(C78832y7.f231622q.equal(str11)).and(C78832y7.f231625t.equal((Number) 0).and(C78832y7.f231624s.equal((Number) 0)));
                    linkedList12.add(C78832y7.f231626u.orderDesc());
                    List multiQuery = C78832y7.f231620o.select((List<? extends ISqlColumn>) linkedList11).where(and).orderBy((List<? extends ISqlOrder>) linkedList12).groupBy((List<? extends Column>) linkedList13).build().multiQuery(C86709a0.m107535s().f251811i, cls7);
                    C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls5)).mo96094Ku()).mo69771j(str11);
                    if (j != null) {
                        j.mo108816h3(multiQuery.size());
                        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls5)).mo96094Ku()).mo69773k0(j, str11);
                        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls5)).mo96094Ku()).mo69764f0(j);
                    }
                } catch (IOException e) {
                    Log.printErrStackTrace(str4, e, (String) null, new Object[0]);
                }
            }
        } else {
            Log.m105925i("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "not new xml type:%d ", Integer.valueOf(i));
        }
    }

    /* renamed from: d */
    public final String mo107115d(String str, List<String> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList, new C76858a(this));
        return C90193h.m112878f((str + XVFSFile.PATH_SEPARATOR + linkedList.toString()).getBytes());
    }
}
