package com.tencent.p014mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.autogen.mmdata.rpt.CmdProcFailedStruct;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import eb0.C31505r2;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.z3$$h;
import f40.C86709a0;
import f62.C45758e0;
import f62.C75700k0;
import g62.C45881a;
import g62.C75875l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import junit.framework.Assert;
import kj2.C117407d;
import o90.C100308d;
import oa1.C117731d;
import p261wl.C38166b;
import p432f.C27044b;
import p823sg.C101611g;
import p875ci.C67379u;
import q90.C101062d;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.g4 */
public class C72972g4 extends MStorage implements C75875l {

    /* renamed from: x */
    public static final String[] f212763x = {"CREATE TABLE IF NOT EXISTS message ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT,transBrandWording TEXT ,talkerId INTEGER, bizClientMsgId TEXT, bizChatId INTEGER DEFAULT -1, bizChatUserId TEXT, msgSeq INTEGER, flag INT, solitaireFoldInfo BLOB, historyId TEXT) "};

    /* renamed from: F */
    public final byte[] f212764F;

    /* renamed from: G */
    public boolean f212765G;

    /* renamed from: d */
    public C30783v3 f212766d;

    /* renamed from: e */
    public C44668u3 f212767e;

    /* renamed from: f */
    public final List<C72959e> f212768f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public List<C75875l.C75878d> f212769g;

    /* renamed from: h */
    public final C101611g<Integer, C72963f4.C72969f> f212770h = new C100308d(100);

    /* renamed from: i */
    public final C101611g<Integer, C72963f4.C72971h> f212771i = new C100308d(100);

    /* renamed from: j */
    public final C101611g<Integer, C72963f4.C72964b> f212772j = new C100308d(100);

    /* renamed from: n */
    public final C101611g<Integer, C72963f4.C72968e> f212773n = new C100308d(100);

    /* renamed from: o */
    public final C101611g<String, Long> f212774o;

    /* renamed from: p */
    public final C91753f f212775p;

    /* renamed from: q */
    public C72984m2 f212776q;

    /* renamed from: r */
    public int f212777r;

    /* renamed from: s */
    public final MStorageEvent<C75875l.C75877b, C75875l.C45886e> f212778s;

    /* renamed from: t */
    public final Map<String, C75875l.C45886e> f212779t;

    /* renamed from: u */
    public boolean f212780u;

    /* renamed from: v */
    public String f212781v;

    /* renamed from: w */
    public long f212782w;

    /* renamed from: com.tencent.mm.storage.g4$a */
    public class C72973a extends MStorageEvent<C75875l.C75877b, C75875l.C45886e> {
        public C72973a() {
        }

        public void handleNotify(List<C75875l.C45886e> list) {
            Iterator<C75875l.C45886e> it;
            boolean z;
            C72976h2 h2Var;
            Object obj;
            int i;
            char c;
            int i2;
            long j;
            boolean z2;
            int i3;
            z3$$h w;
            C72973a aVar = this;
            if (!isLocked() && C72972g4.this.f212766d != null) {
                Iterator<C75875l.C45886e> it4 = list.iterator();
                while (it4.hasNext()) {
                    C75875l.C45886e next = it4.next();
                    if (next != null) {
                        C72972g4 g4Var = C72972g4.this;
                        C44660i2 i2Var = (C44660i2) g4Var.f212766d;
                        i2Var.getClass();
                        Class cls = C75700k0.class;
                        if (next == null) {
                            Log.m105922f("MicroMsg.ConversationStorage", "null notifyInfo");
                        } else if (!C45628s0.m50742G(next.f123844a) && !C45628s0.m50745J(next.f123844a)) {
                            String str = next.f123844a;
                            C72963f4 Ex0 = g4Var.Ex0(str);
                            boolean[] zArr = {false};
                            i2Var.f121079e.mo54204V4(Ex0, next, zArr);
                            if (!zArr[0]) {
                                C72976h2 j2 = i2Var.mo69771j(str);
                                if (j2 == null) {
                                    Log.m105925i("MicroMsg.ConversationStorage", "create new cvs:%s", str);
                                    j2 = new C72976h2(str);
                                    if (C72996z1.m85811N4(str)) {
                                        j2.mo108791L2(1);
                                    }
                                    if (Ex0 == null || Util.isNullOrNil(Ex0.f230724G) || (w = C75604z3.m90851w(Ex0.f230724G)) == null || (w.f222102i & 64) == 0) {
                                        z = true;
                                    } else {
                                        Log.m105928w("MicroMsg.ConversationStorage", "not fas msg no need to create conversation");
                                    }
                                } else {
                                    z = false;
                                }
                                i2Var.f121079e.mo54206k3(Ex0, j2, z, next);
                                Log.m105925i("MicroMsg.ConversationStorage", "dkevent user:%s func:%s cnt:%d", next.f123844a, next.f123845b, Integer.valueOf(next.f123847d));
                                if (Ex0 == null || Ex0.getMsgId() == 0) {
                                    it = it4;
                                    h2Var = j2;
                                    obj = "insert";
                                } else {
                                    if (next.f123847d == 1 && next.f123846c.get(0).getMsgId() != Ex0.getMsgId()) {
                                        Log.m105929w("MicroMsg.ConversationStorage", "Warning ! getLastMsg may wrong , lastid:%d  insertlist:%d", Long.valueOf(Ex0.getMsgId()), Long.valueOf(next.f123846c.get(0).getMsgId()));
                                    }
                                    int o2 = Ex0.mo108762o2();
                                    long z25 = j2.mo108833z2();
                                    long w2 = Ex0.mo108772w2();
                                    C72976h2 h2Var2 = j2;
                                    Log.m105925i("MicroMsg.ConversationStorage", "summerbadcr check last message flag[%d], newseq[%d] oldseq[%d], undeliverCount[%d]", Integer.valueOf(o2), Long.valueOf(w2), Long.valueOf(z25), Long.valueOf((long) j2.mo108785F2()));
                                    obj = "insert";
                                    if ((!next.f123845b.equals(obj) || next.f123847d <= 0) && (!next.f123845b.equals("update") || h2Var2.mo108786G2() + next.f123847d < 0)) {
                                        h2Var = h2Var2;
                                        if (next.f123849f > 0 && w2 < z25) {
                                            it = it4;
                                            long j3 = z25;
                                            if (((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).v10(h2Var.getUsername(), j3).getMsgId() == 0) {
                                                long Kx0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Kx0(h2Var.getUsername());
                                                Log.m105925i("MicroMsg.ConversationStorage", "summerbadcr delete reset lastseq[%d, %d], lastMsgSeq[%d]", Long.valueOf(j3), Long.valueOf(w2), Long.valueOf(Kx0));
                                                h2Var.mo108804Z2(w2);
                                                if (j3 > Kx0) {
                                                    ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101183bD(h2Var.getUsername(), Kx0);
                                                }
                                            }
                                            if (Ex0.mo100989b4() && Ex0.mo108769t2() == 1) {
                                                h2Var.mo108810e3(Ex0.getCreateTime());
                                            }
                                        }
                                    } else {
                                        h2Var = h2Var2;
                                        h2Var.mo108812g3(h2Var2.mo108786G2() + next.f123847d);
                                        if (w2 > z25) {
                                            Log.m105925i("MicroMsg.ConversationStorage", "summerbadcr insert or update reset lastseq[%d]", Long.valueOf(w2));
                                            h2Var.mo108804Z2(w2);
                                        }
                                    }
                                    it = it4;
                                    h2Var.mo108810e3(Ex0.getCreateTime());
                                }
                                if (next.f123845b.equals(obj) && next.f123846c.size() > 0 && C72996z1.m85820U5(next.f123844a)) {
                                    String s = C75592q0.m90789s();
                                    Iterator<C72963f4> it5 = next.f123846c.iterator();
                                    while (it5.hasNext()) {
                                        C72963f4 next2 = it5.next();
                                        if (next2 == null) {
                                            Log.m105920e("MicroMsg.ConversationStorage", "[onMsgInfoStgNotifyChange] msgInfo is null.");
                                        } else {
                                            if (next2.mo108769t2() != 1 && (next2.mo100993e4() || next2.mo101021x3() || next2.mo100987Z3())) {
                                                if (next2.mo100966E3(s) || next2.mo100964D3()) {
                                                    h2Var.mo108789J2(h2Var.mo108818l2() + 1);
                                                } else if (next2.mo100971J3()) {
                                                    h2Var.mo108789J2(h2Var.mo108818l2() + 4096);
                                                }
                                            }
                                            Map<String, String> parseXml = XmlParser.parseXml(next2.getContent(), "sysmsg", (String) null);
                                            if (parseXml == null || !parseXml.containsKey(".sysmsg.$type") || !parseXml.get(".sysmsg.$type").equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication")) {
                                                i3 = 1;
                                                z2 = false;
                                            } else {
                                                i3 = 1;
                                                z2 = true;
                                            }
                                            Object[] objArr = new Object[i3];
                                            objArr[0] = Boolean.valueOf(z2);
                                            Log.m105919d("MicroMsg.MsgInfo", "isAddChatroomInviteMsg:%s", objArr);
                                            if (z2) {
                                                h2Var.mo108816h3(h2Var.mo108787H2() + 1);
                                            } else {
                                                boolean z3 = parseXml != null && parseXml.containsKey(".sysmsg.$type") && parseXml.get(".sysmsg.$type").equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval");
                                                Log.m105919d("MicroMsg.MsgInfo", "isAddChatroomInviteAcceptMsg:%s", Boolean.valueOf(z3));
                                                if (z3) {
                                                    h2Var.mo108816h3(h2Var.mo108787H2() + 4096);
                                                }
                                            }
                                            if (next2.mo108769t2() != 1 && next2.mo100976O3()) {
                                                h2Var.mo108799U2(h2Var.mo108829v2() + 1);
                                            }
                                        }
                                    }
                                }
                                String str2 = next.f123844a;
                                String str3 = next.f123845b;
                                if (str3 == null || !str3.equals("delete")) {
                                    i = 0;
                                } else {
                                    int i4 = next.f123849f;
                                    i = i4 > 0 ? i4 : 0;
                                    Log.m105925i("MicroMsg.ConversationStorage", "notify delete count %d ", Integer.valueOf(i4));
                                }
                                String str4 = next.f123845b;
                                if (str4 == null || !str4.equals(obj)) {
                                    c = 0;
                                    i2 = 0;
                                } else {
                                    int i5 = next.f123848e;
                                    i2 = i5 > 0 ? i5 : 0;
                                    c = 0;
                                    Log.m105925i("MicroMsg.ConversationStorage", "notify insert all count %d ", Integer.valueOf(i5));
                                }
                                Object[] objArr2 = new Object[7];
                                String str5 = "";
                                objArr2[c] = Util.nullAs(str2, str5);
                                objArr2[1] = Long.valueOf(Ex0 != null ? Ex0.mo108772w2() : -1);
                                objArr2[2] = Boolean.valueOf(z);
                                objArr2[3] = Integer.valueOf(i2);
                                objArr2[4] = Integer.valueOf(i);
                                objArr2[5] = Long.valueOf(Thread.currentThread().getId());
                                objArr2[6] = h2Var.mo108782C2();
                                Log.m105925i("MicroMsg.ConversationStorage", "summerbadcr updateConversation talker[%s] msgseq[%d],newConv[%b],newMsgInsertCount[%d], deleteCount[%d], tid[%d], ParentRef[%s]", objArr2);
                                if (!z || i <= 0 || i2 != 0) {
                                    i2Var.f121080f.event(h2Var);
                                    i2Var.f121080f.doNotify();
                                    if (str2 == null) {
                                        Log.m105920e("MicroMsg.ConversationStorage", "talker == null");
                                    } else if (!str2.equals(h2Var.getUsername())) {
                                        Log.m105920e("MicroMsg.ConversationStorage", "process message for conversation failed: inconsist username");
                                    } else {
                                        if (Ex0 == null || Ex0.getMsgId() == 0) {
                                            Log.m105924i("MicroMsg.ConversationStorage", "update null conversation with talker " + str2);
                                            if (!z) {
                                                h2Var.mo101162m3();
                                                i2Var.mo69761e(h2Var, i, i2);
                                                i2Var.mo69773k0(h2Var, str2);
                                            } else if (((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Vx0(str2) > 0) {
                                                if (Ex0 == null || Ex0.getCreateTime() == 0) {
                                                    h2Var.mo108793N2(C31543z5.m39451a());
                                                } else {
                                                    h2Var.mo108793N2(Ex0.getCreateTime());
                                                }
                                                i2Var.mo69761e(h2Var, i, i2);
                                                i2Var.mo69751W(h2Var);
                                            }
                                        } else {
                                            Log.m105926v("MicroMsg.ConversationStorage", "onNotifyChange   msgId:" + Ex0.getMsgId());
                                            h2Var.mo101164o3(Ex0);
                                            if (i2Var.mo69741L() != null) {
                                                PString pString = new PString();
                                                PString pString2 = new PString();
                                                PInt pInt = new PInt();
                                                C67379u.m79740d(Ex0, pString, pString2, pInt, h2Var.mo108372k3(2097152));
                                                Log.m105919d("MicroMsg.ConversationStorage", "oreh onNotifyChange genDigest: pDigestUser.value=%s", pString2.value);
                                                h2Var.mo108794O2(pString.value);
                                                h2Var.mo108795P2(pString2.value);
                                                h2Var.mo108801W2(pInt.value);
                                            } else {
                                                String b0 = i2Var.mo69757b0(Ex0.getType(), h2Var.getContent());
                                                String nullAsNil = Util.nullAsNil(h2Var.mo108822p2());
                                                if (!Util.isNullOrNil(b0)) {
                                                    str5 = " " + Util.nullAsNil(b0);
                                                }
                                                h2Var.mo108794O2(nullAsNil.concat(str5));
                                            }
                                            h2Var.mo108806b3(Integer.toString(Ex0.getType()));
                                            C45758e0 e0Var = (C45758e0) C86312j.m106911c(C45758e0.class);
                                            if (e0Var != null) {
                                                e0Var.In0(Ex0, h2Var);
                                            }
                                            h2Var.mo101161T2(C45881a.m51165b(h2Var, 1, Ex0.getCreateTime()));
                                            if (z) {
                                                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str2);
                                                if (z1Var == null || Util.isNullOrNil(z1Var.getUsername()) || !z1Var.mo62940x3()) {
                                                    j = 0;
                                                } else {
                                                    j = 0;
                                                    h2Var.mo101161T2(C45881a.m51165b(h2Var, 2, 0));
                                                }
                                                i2Var.mo69761e(h2Var, i, i2);
                                                if (Ex0.getCreateTime() != j) {
                                                    h2Var.mo108793N2(Ex0.getCreateTime());
                                                } else {
                                                    h2Var.mo108793N2(C31543z5.m39451a());
                                                }
                                                i2Var.mo69751W(h2Var);
                                            } else {
                                                i2Var.mo69761e(h2Var, i, i2);
                                                i2Var.mo69773k0(h2Var, str2);
                                            }
                                        }
                                        i2Var.f121081g.event(h2Var);
                                        i2Var.f121081g.doNotify();
                                        i2Var.f121079e.mo54205a2(Ex0, h2Var, z, next);
                                    }
                                    aVar = this;
                                    it4 = it;
                                } else {
                                    Log.m105925i("MicroMsg.ConversationStorage", "summerdel ignore delete event [%s, %s]", str2, h2Var.getUsername());
                                    aVar = this;
                                    it4 = it;
                                }
                            }
                        }
                        it = it4;
                        aVar = this;
                        it4 = it;
                    }
                }
            }
        }

        public boolean needNotifyExtension() {
            return true;
        }

        public void processEvent(Object obj, Object obj2) {
            ((C75875l.C75877b) obj).mo26106w5(C72972g4.this, (C75875l.C45886e) obj2);
        }

        public void processEventForExtensionOnDemand(Object obj) {
            C38166b.m41755b(C75875l.C32329c.class, new g4$a$$a(this, (C75875l.C45886e) obj));
        }
    }

    public C72972g4(C91753f fVar, C44668u3 u3Var, C30783v3 v3Var) {
        C91753f fVar2 = fVar;
        new C100308d(100);
        this.f212774o = new C100308d(100);
        this.f212776q = new C72984m2();
        this.f212777r = 0;
        this.f212778s = new C72973a();
        this.f212779t = new HashMap();
        this.f212780u = false;
        this.f212781v = "";
        this.f212782w = 0;
        this.f212764F = new byte[0];
        this.f212775p = fVar2;
        this.f212767e = u3Var;
        this.f212766d = v3Var;
        C86709a0.m107528h();
        if (((Integer) C86709a0.m107535s().mo121142i().mo119684e(348169, 0)).intValue() == 0) {
            Log.m105925i("MicroMsg.MsgInfoStorage", "deleted dirty msg ,count is %d", Integer.valueOf(fVar2.delete(StateEvent.Name.MESSAGE, "msgId> ? ", new String[]{"80000000"})));
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(348169, 1);
        }
        uy0(fVar2, StateEvent.Name.MESSAGE);
        long currentTimeMillis = System.currentTimeMillis();
        long beginTransaction = fVar2.beginTransaction(Thread.currentThread().getId());
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"CREATE INDEX IF NOT EXISTS messageIdIndex ON message ( msgId )", "CREATE INDEX IF NOT EXISTS messageSvrIdIndex ON message ( msgSvrId )", "CREATE INDEX IF NOT EXISTS messageSendCreateTimeIndex ON message ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS messageCreateTimeIndex ON message ( createTime )", "CREATE INDEX IF NOT EXISTS messageTaklerIdTypeCreateTimeIndex ON message ( talkerId,type,createTime )", "CREATE INDEX IF NOT EXISTS messageTalkerIdStatusIndex ON message ( talkerId,status )", "CREATE INDEX IF NOT EXISTS messageTalkerIdCreateTimeIsSendIndex ON message ( talkerId,isSend,createTime )", "CREATE INDEX IF NOT EXISTS messageTalkerIdCreateTimeIndex ON message ( talkerId,createTime )", "CREATE INDEX IF NOT EXISTS messageTalkerIdSvrIdIndex ON message ( talkerId,msgSvrId )", "CREATE INDEX IF NOT EXISTS messageTalkerIdTypeIndex ON message ( talkerId,type )", "CREATE INDEX IF NOT EXISTS messageTalkerTypeIndex ON message ( talker,type )", "CREATE INDEX IF NOT EXISTS messagemessageTalkerMsgSeqIndex ON message ( talker,msgSeq )", "CREATE INDEX IF NOT EXISTS messagemessageTalkerFlagMsgSeqIndex ON message ( talker,flag,msgSeq )"};
        strArr[4] = "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTypeTimeIndex ON message ( talker,type,createTime )";
        strArr[5] = "CREATE INDEX IF NOT EXISTS  messageTalkerStatusIndex ON message ( talker,status )";
        strArr[6] = "CREATE INDEX IF NOT EXISTS  messageTalkerCreateTimeIsSendIndex ON message ( talker,isSend,createTime )";
        strArr[7] = "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTimeIndex ON message ( talker,createTime )";
        strArr[8] = "CREATE INDEX IF NOT EXISTS  messageTalkerSvrIdIndex ON message ( talker,msgSvrId )";
        arrayList.addAll(Arrays.asList(strArr));
        for (int i = 0; i < arrayList.size(); i++) {
            this.f212775p.execSQL(StateEvent.Name.MESSAGE, (String) arrayList.get(i));
        }
        Log.m105925i("MicroMsg.MsgInfoStorage", "build new index last %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        this.f212775p.endTransaction(beginTransaction);
        Log.m105925i("MicroMsg.MsgInfoStorage", "executeMsgInitSQL last %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        if (this.f212769g == null) {
            this.f212769g = new LinkedList();
        }
        ((LinkedList) this.f212769g).clear();
        C75875l.C75878d dVar = new C75875l.C75878d(1, StateEvent.Name.MESSAGE, C75875l.C75878d.m91132a(1, TimeUtil.SECOND_TO_US, 10000000, 90000000));
        synchronized (this.f212769g) {
            ((LinkedList) this.f212769g).add(dVar);
        }
        Ay0(dVar);
        boolean z = C117731d.m166007c().mo182440a(new C27044b()) == 1;
        this.f212765G = z;
        Log.m105925i("MicroMsg.MsgInfoStorage", "MsgInfoStorage init isAddSyncForLock:%s", Boolean.valueOf(z));
    }

    public static void vy0(C72963f4 f4Var) {
        if (f4Var != null && f4Var.mo101020w3()) {
            try {
                String content = f4Var.getContent();
                int indexOf = content.indexOf("<msg>");
                if (indexOf > 0 && indexOf < content.length()) {
                    content = content.substring(indexOf).trim();
                }
                Map<String, String> parseXml = XmlParser.parseXml(content, "msg", (String) null);
                if (parseXml != null && parseXml.size() > 0) {
                    f4Var.mo108746Z2(SemiXml.encode(parseXml));
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MsgInfoStorage", e.getMessage());
            }
        }
    }

    public long Ab0(String str) {
        C75875l.C75878d ey02;
        if (!Util.isNullOrNil(str) && (ey02 = ey0(str)) != null) {
            return ey02.f222521a;
        }
        return 0;
    }

    public Cursor Ax0(String str, String str2, int i) {
        String str3 = " SELECT * FROM " + hy0(str) + " WHERE" + mo101130mL(str) + iy0(str) + "AND " + "content" + " LIKE '" + str2 + "%' ORDER BY " + "createTime" + " DESC LIMIT " + i;
        Log.m105919d("MicroMsg.MsgInfoStorage", "getInitCursorByMember getCursor talk:%s member:%s,limitCount:%d [%s]", str, str2, Integer.valueOf(i), str3);
        return this.f212775p.rawQuery(str3, (String[]) null);
    }

    public void Ay0(C75875l.C75878d dVar) {
        C75875l.C75878d dVar2 = dVar;
        C91753f fVar = this.f212775p;
        Cursor rawQuery = fVar.rawQuery("select max(msgid) from " + dVar2.f222524d, (String[]) null, 2);
        long j = rawQuery.moveToFirst() ? rawQuery.getLong(0) : 0;
        rawQuery.close();
        MultiProcessMMKV multiProcessMMKV = C75875l.C75878d.f222520e;
        long max = Math.max(multiProcessMMKV.getLong("msg." + dVar2.f222524d, -1), j);
        Log.m105925i("MicroMsg.MsgInfoStorage", "id count is %d, now id:%d tableName: %s", Long.valueOf(max), Long.valueOf(dVar2.f222521a), dVar2.f222524d);
        long j2 = dVar2.f222521a;
        if (max >= j2) {
            Log.m105925i("MicroMsg.MsgTable", "summermsg setMsgLocalId [%d, %d]  regions[%d, %d] stack[%s]", Long.valueOf(j2), Long.valueOf(max), Long.valueOf(dVar2.f222522b[0].f222526b), Long.valueOf(dVar2.f222522b[1].f222525a), Util.getStack());
            C75875l.C75878d.C75879a[] aVarArr = dVar2.f222522b;
            if (max > aVarArr[0].f222526b) {
                long j3 = aVarArr[1].f222525a;
                if (max < j3) {
                    Log.m105925i("MicroMsg.MsgTable", "summermsg setMsgLocalId revised msgLocalId to %d", Long.valueOf(j3));
                    dVar2.f222521a = dVar2.f222522b[1].f222525a;
                    C117407d.INSTANCE.idkeyStat(111, 169, 1, false);
                    multiProcessMMKV.putLong("msg." + dVar2.f222524d, max);
                }
            }
            dVar2.f222521a = max;
            multiProcessMMKV.putLong("msg." + dVar2.f222524d, max);
        }
        Log.m105928w("MicroMsg.MsgInfoStorage", "loading new msg id:" + dVar2.f222521a);
    }

    public Cursor Bx0(String str, int i) {
        String str2 = " SELECT * FROM " + hy0(str) + " WHERE" + mo101130mL(str) + iy0(str) + "AND " + "isSend" + "=" + 1 + " ORDER BY " + "createTime" + " DESC LIMIT " + i;
        Log.m105919d("MicroMsg.MsgInfoStorage", "[getInitCursorBySelf] getCursor talk:%s,limitCount:%d [%s]", str, Integer.valueOf(i), str2);
        return this.f212775p.rawQuery(str2, (String[]) null);
    }

    public int By0(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", 4);
        C91753f fVar = this.f212775p;
        String hy02 = hy0(str);
        int update = fVar.update(hy02, contentValues, iy0(str) + "AND " + "isSend" + "=? AND " + "status" + "!=? ", new String[]{"0", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL});
        if (update != 0) {
            doNotify();
            mo101123jo(new C75875l.C45886e(str, "update", (C72963f4) null, 0));
        }
        return update;
    }

    /* renamed from: CP */
    public Cursor mo101060CP(long j, long j2) {
        long max = Math.max(((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo(""), j);
        return this.f212775p.mo125615f().rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT talker, count(msgId), max(createTime) FROM message LEFT JOIN DeletedConversationInfo ON message.talker = DeletedConversationInfo.userName WHERE message.createTime > ifnull(DeletedConversationInfo.reserved2, 0) AND message.createTime > ? AND message.createTime < ? GROUP BY talker", new Object[]{Long.valueOf(max), Long.valueOf(j2)}, StateEvent.Name.MESSAGE);
    }

    /* renamed from: CZ */
    public C72963f4 mo101061CZ(String str, long j) {
        C72963f4 f4Var = new C72963f4();
        Cursor query = this.f212775p.query(hy0(str), (String[]) null, "createTime=? AND" + iy0(str), new String[]{"" + j}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            f4Var.convertFrom(query);
        }
        query.close();
        return f4Var;
    }

    public Cursor Cx0(String str) {
        try {
            C91753f fVar = this.f212775p;
            String hy02 = hy0(str);
            return fVar.query(hy02, (String[]) null, iy0(str) + " AND " + "createTime" + ">=? AND " + "type" + " IN (" + 436207665 + "," + 419430449 + ")", new String[]{String.valueOf(System.currentTimeMillis() - 86400000)}, (String) null, (String) null, "createTime ASC", 2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e, "getLastDayC2CMsgByTalker error: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: DN */
    public Cursor mo101063DN(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        String hy02 = hy0(str);
        String str2 = "select * from " + hy02 + " " + xx0(hy02) + " where" + iy0(str) + "AND " + "type IN (3,39,13,43,62,44,49,268435505)" + "  order by " + "createTime";
        Cursor rawQuery = this.f212775p.rawQuery(str2, (String[]) null);
        Log.m105919d("MicroMsg.MsgInfoStorage", "all time: %d, sql: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), str2);
        return rawQuery;
    }

    public long Dx0(String str) {
        String str2 = "select createTime from message where" + mo101130mL(str) + iy0(str) + "order by " + "createTime" + " DESC LIMIT 1 ";
        Log.m105918d("MicroMsg.MsgInfoStorage", "get last message create time: " + str2);
        Cursor rawQuery = this.f212775p.rawQuery(str2, (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.MsgInfoStorage", "get last message create time failed " + str);
            return -1;
        } else if (rawQuery.moveToFirst()) {
            long j = rawQuery.getLong(0);
            rawQuery.close();
            return j;
        } else {
            rawQuery.close();
            return -1;
        }
    }

    public C72963f4 Ex0(String str) {
        return Ix0(str, MAlarmHandler.NEXT_FIRE_INTERVAL);
    }

    public C72963f4 Fx0(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            Log.m105921e("MicroMsg.MsgInfoStorage", "getLastMsg failed : talker:%s", str);
            return null;
        }
        C72963f4 f4Var = new C72963f4();
        Cursor rawQuery = this.f212775p.rawQuery("select * from " + hy0(str) + " where" + iy0(str) + str2 + " order by " + "createTime" + " DESC limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            f4Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        Log.m105925i("MicroMsg.MsgInfoStorage", "getLastMsg talker:%s msgid:%d", str, Long.valueOf(f4Var.getMsgId()));
        return f4Var;
    }

    public List<C72963f4> Gx0(String str, int i) {
        ArrayList arrayList = new ArrayList();
        Assert.assertTrue(this.f212769g != null);
        Cursor rawQuery = this.f212775p.rawQuery("SELECT * FROM " + hy0(str) + " WHERE" + iy0(str) + " ORDER BY " + "createTime" + " DESC LIMIT " + i, (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(rawQuery);
            arrayList.add(f4Var);
        }
        rawQuery.close();
        return arrayList;
    }

    public List<C72963f4> Hx0(String str, boolean z, int i) {
        ArrayList arrayList = new ArrayList();
        Assert.assertTrue(this.f212769g != null);
        Cursor rawQuery = this.f212775p.rawQuery("SELECT * FROM " + hy0(str) + " WHERE" + iy0(str) + "AND " + "isSend" + " = " + (z ? 1 : 0) + " ORDER BY " + "createTime" + " DESC LIMIT " + i, (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(rawQuery);
            if (f4Var.mo100993e4() || f4Var.mo100977P3() || f4Var.mo100987Z3()) {
                arrayList.add(f4Var);
            }
        }
        rawQuery.close();
        return arrayList;
    }

    public C72963f4 Ix0(String str, long j) {
        String str2;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (j == MAlarmHandler.NEXT_FIRE_INTERVAL) {
            str2 = "";
        } else {
            str2 = " createTime < " + j + " AND ";
        }
        C72963f4 f4Var = new C72963f4();
        Cursor rawQuery = this.f212775p.rawQuery("select * from " + hy0(str) + " where" + mo101130mL(str) + str2 + iy0(str) + "order by " + "createTime" + " DESC limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            f4Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return f4Var;
    }

    public long Jt0(String str, long j, int i) {
        Log.m105919d("MicroMsg.MsgInfoStorage", "get down inc create time, talker %s, fromCreateTime %d, targetIncCount %d", str, Long.valueOf(j), Integer.valueOf(i));
        if (i <= 0) {
            Log.m105928w("MicroMsg.MsgInfoStorage", "error target inc count");
            return j;
        }
        String str2 = "SELECT createTime FROM " + hy0(str) + " WHERE" + iy0(str) + "AND " + "createTime" + " > " + j + " ORDER BY " + "createTime" + " ASC  LIMIT " + i;
        Log.m105919d("MicroMsg.MsgInfoStorage", "get down inc msg create time sql: %s", str2);
        Cursor rawQuery = this.f212775p.rawQuery(str2, (String[]) null);
        if (rawQuery == null) {
            Log.m105928w("MicroMsg.MsgInfoStorage", "get down inc msg create time error, cursor is null");
            return j;
        } else if (rawQuery.moveToLast()) {
            long j2 = rawQuery.getLong(0);
            Log.m105919d("MicroMsg.MsgInfoStorage", "result msg create time %d", Long.valueOf(j2));
            rawQuery.close();
            return j2;
        } else {
            rawQuery.close();
            Log.m105928w("MicroMsg.MsgInfoStorage", "get result fail");
            return j;
        }
    }

    public C72963f4[] Jx0(String str, int i) {
        if (str == null || str.length() == 0 || i <= 0) {
            Log.m105920e("MicroMsg.MsgInfoStorage", "getLastMsgList, invalid argument, talker = " + str + ", limit = " + i);
            return null;
        }
        Cursor rawQuery = this.f212775p.rawQuery("select * from " + hy0(str) + " where" + iy0(str) + "order by " + "createTime" + " DESC limit " + i, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            ArrayList arrayList = new ArrayList();
            do {
                C72963f4 f4Var = new C72963f4();
                f4Var.convertFrom(rawQuery);
                arrayList.add(f4Var);
            } while (rawQuery.moveToNext());
            rawQuery.close();
            Log.m105918d("MicroMsg.MsgInfoStorage", "getLastMsgList, talker = " + str + ", limit = " + i + ", count = " + arrayList.size());
            Collections.reverse(arrayList);
            return (C72963f4[]) arrayList.toArray(new C72963f4[arrayList.size()]);
        }
        Log.m105928w("MicroMsg.MsgInfoStorage", "getLastMsgList, cursor is empty");
        rawQuery.close();
        return null;
    }

    public long Kx0(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        String str2 = "select msgSeq from message where" + iy0(str) + "order by " + "msgSeq" + " DESC LIMIT 1 ";
        Log.m105924i("MicroMsg.MsgInfoStorage", "summerbadcr get last message msgseq: " + str2);
        Cursor rawQuery = this.f212775p.rawQuery(str2, (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.MsgInfoStorage", "summerbadcr get last message msgseq failed " + str);
            return 0;
        } else if (rawQuery.moveToFirst()) {
            long j = rawQuery.getLong(0);
            rawQuery.close();
            return j;
        } else {
            rawQuery.close();
            return 0;
        }
    }

    /* renamed from: LL */
    public Cursor mo101073LL(String str, int i, int i2) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        String hy02 = hy0(str);
        return this.f212775p.rawQuery("select * from " + hy02 + " where" + mo101130mL(str) + iy0(str) + " AND " + "type & 65535 = 49" + "  order by " + "createTime" + " DESC limit " + i2 + " OFFSET " + i, (String[]) null);
    }

    /* renamed from: Lo */
    public void mo101074Lo(C72959e eVar) {
        if (!((CopyOnWriteArrayList) this.f212768f).contains(eVar)) {
            Log.m105925i("MicroMsg.MsgInfoStorage", "addMessageStorageImpl %s", eVar);
            ((CopyOnWriteArrayList) this.f212768f).add(eVar);
        }
    }

    public List<C72963f4> Lx0(String str, int i) {
        ArrayList arrayList = new ArrayList();
        Assert.assertTrue(this.f212769g != null);
        Cursor rawQuery = this.f212775p.rawQuery("SELECT * FROM " + hy0(str) + " WHERE" + iy0(str) + "AND " + "status" + " = " + 3 + " AND " + "type" + " <> " + 10000 + " ORDER BY " + "createTime" + " DESC LIMIT " + i, (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(rawQuery);
            arrayList.add(f4Var);
        }
        rawQuery.close();
        return arrayList;
    }

    public C72963f4 Mx0(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C72963f4 f4Var = new C72963f4();
        Cursor rawQuery = this.f212775p.rawQuery("select * from " + hy0(str) + " where" + iy0(str) + "and " + "isSend" + " = " + 0 + "  order by " + "createTime" + " DESC limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            f4Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return f4Var;
    }

    /* renamed from: NQ */
    public ArrayList<C72963f4> mo101077NQ() {
        ArrayList<C72963f4> arrayList = new ArrayList<>();
        Cursor query = this.f212775p.query(StateEvent.Name.MESSAGE, (String[]) null, "createTime>=? AND status=? AND isSend=?", new String[]{String.valueOf(System.currentTimeMillis() - 172800000), String.valueOf(5), String.valueOf(1)}, (String) null, (String) null, "createTime ASC", 2);
        while (query.moveToNext()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(query);
            if (((!((f4Var.f230723F & 32) > 0)) && true) && !C72996z1.m85798E5(f4Var.mo108768t()) && !C72996z1.m85848s5(f4Var.mo108768t()) && !C72996z1.m85811N4(f4Var.mo108768t())) {
                arrayList.add(f4Var);
            }
        }
        query.close();
        return arrayList;
    }

    public List<C72963f4> Nx0(String str, int i) {
        ArrayList arrayList = new ArrayList();
        Assert.assertTrue(this.f212769g != null);
        Cursor rawQuery = this.f212775p.rawQuery("SELECT * FROM " + hy0(str) + " WHERE" + iy0(str) + "AND " + "isSend" + " = " + 0 + " ORDER BY " + "createTime" + " DESC LIMIT " + i, (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(rawQuery);
            if (f4Var.mo100993e4() || f4Var.mo100977P3() || f4Var.mo100987Z3()) {
                arrayList.add(f4Var);
            }
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: Ow */
    public int mo101079Ow(String str, long j) {
        SQLiteStatement compileStatement;
        mo101099Yt(str, "", (String[]) null);
        try {
            SQLiteDatabase f = this.f212775p.mo125615f();
            compileStatement = f.compileStatement("DELETE FROM " + str + " WHERE " + "createTime" + " < ?");
            compileStatement.bindLong(1, j);
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            if (executeUpdateDelete > 0) {
                doNotify("delete_all " + str);
            }
            compileStatement.close();
            return executeUpdateDelete;
        } catch (RuntimeException unused) {
            C117407d.INSTANCE.idkeyStat(111, 247, 1, false);
            return -1;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public List<C72963f4> Ox0(int i) {
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < ((LinkedList) this.f212769g).size(); i2++) {
            String str = ((C75875l.C75878d) ((LinkedList) this.f212769g).get(i2)).f222524d;
            if (!str.startsWith("findermessage") && !str.equalsIgnoreCase("gamelifemessage")) {
                linkedList.add((C75875l.C75878d) ((LinkedList) this.f212769g).get(i2));
            }
        }
        return Px0(i, linkedList);
    }

    public long P50(String str) {
        Cursor rawQuery = this.f212775p.rawQuery("SELECT COUNT(*) FROM " + hy0(str) + " WHERE " + iy0(str) + " AND " + "type" + " NOT IN (" + "10000,10002,570425393,64,603979825" + "," + 855638065 + "," + 889192497 + "," + 922746929 + ")", (String[]) null, 2);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return (long) i;
    }

    public Cursor Pq0(String str, long j, long j2, int i) {
        if (j2 < j) {
            long j3 = j;
            j = j2;
            j2 = j3;
        }
        String str2 = "SELECT * FROM (SELECT * FROM " + hy0(str) + " WHERE" + mo101130mL(str) + iy0(str) + " AND " + "createTime" + " >= " + j + " AND " + "createTime" + " <= " + j2 + " ORDER BY " + "createTime" + " DESC LIMIT " + i + " ) ORDER BY " + "createTime" + " ASC";
        Log.m105918d("MicroMsg.MsgInfoStorage", "get cursor: " + str2);
        return this.f212775p.rawQuery(str2, (String[]) null);
    }

    public final List<C72963f4> Px0(int i, List<C75875l.C75878d> list) {
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            Cursor query = this.f212775p.query(list.get(i3).f222524d, (String[]) null, "status=1 and isSend=1 and type IN (1,11,21,31,36,42,66,67,48,55,57)", (String[]) null, (String) null, (String) null, "createTime", 100);
            while (query.moveToNext()) {
                C72963f4 f4Var = new C72963f4();
                f4Var.convertFrom(query);
                if (C75604z3.m90844p() - f4Var.getCreateTime() > 86400000) {
                    arrayList2.add(f4Var);
                } else {
                    arrayList.add(f4Var);
                }
            }
            query.close();
        }
        Log.m105925i("MicroMsg.MsgInfoStorage", "getLastSendingMsgList limit:%s listMsg:%s lstTimeoutMsg:%s limitListMsg:%s", Integer.valueOf(i), Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()), Integer.valueOf((arrayList.size() > i2 ? arrayList.subList(0, i2) : arrayList).size()));
        if (arrayList2.size() > 0) {
            long a = this.f212775p.mo125613a();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C72963f4 f4Var2 = (C72963f4) it.next();
                Log.m105925i("MicroMsg.MsgInfoStorage", "Set msg timtout : id:%d time:%d time:%s talker:%s content:%s", Long.valueOf(f4Var2.getMsgId()), Long.valueOf(f4Var2.getCreateTime()), Integer.valueOf(f4Var2.getType()), f4Var2.mo108768t(), Util.secPrint(f4Var2.getContent()));
                f4Var2.mo100991d(5);
                xy0(f4Var2.getMsgId(), f4Var2);
            }
            this.f212775p.endTransaction(a);
        }
        return arrayList;
    }

    public List<C72963f4> Qx0(List<String> list) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < ((LinkedList) this.f212769g).size(); i++) {
            if (list.contains(((C75875l.C75878d) ((LinkedList) this.f212769g).get(i)).f222524d)) {
                linkedList.add((C75875l.C75878d) ((LinkedList) this.f212769g).get(i));
            }
        }
        return Px0(Integer.MAX_VALUE, linkedList);
    }

    public C72963f4.C72964b Rv0(String str) {
        C72963f4.C72964b bVar;
        C101611g<Integer, C72963f4.C72964b> gVar;
        if (Util.isNullOrNil(str) || (gVar = this.f212772j) == null) {
            Log.m105921e("MicroMsg.MsgInfoStorage", "input text null ???? %B", Boolean.valueOf(Util.isNullOrNil(str)));
            Log.m105920e("MicroMsg.MsgInfoStorage", "[arthurdan.FriendContentCrash] Fatal error!!! cachesForFriend is null!");
            bVar = null;
        } else {
            bVar = (C72963f4.C72964b) ((C101062d) gVar).get(Integer.valueOf(str.hashCode()));
        }
        if (bVar == null) {
            bVar = C72963f4.C72964b.m85654f(str);
            C101611g<Integer, C72963f4.C72964b> gVar2 = this.f212772j;
            if (gVar2 != null) {
                ((C101062d) gVar2).mo139557c(Integer.valueOf(Util.nullAs(str, "").hashCode()), bVar);
            }
        }
        return bVar;
    }

    public C72963f4 Rx0(String str) {
        C72963f4 f4Var = new C72963f4();
        Cursor query = this.f212775p.query(hy0(str), (String[]) null, iy0(str), (String[]) null, (String) null, (String) null, "msgSvrId  DESC limit 1 ", 2);
        if (query.moveToFirst()) {
            f4Var.convertFrom(query);
        }
        query.close();
        return f4Var;
    }

    /* renamed from: SE */
    public int mo101087SE(String str, long j) {
        C72963f4 h302 = h30(str, j);
        this.f212776q.mo101176a((int) (Util.nowSecond() / 86400), h302.mo108774y2(), h302.getCreateTime() / 1000, true);
        C91753f fVar = this.f212775p;
        String hy02 = hy0(str);
        int delete = fVar.delete(hy02, "msgSvrId=?", new String[]{"" + j});
        if (delete != 0) {
            doNotify();
            mo101123jo(new C75875l.C45886e(str, "delete", (C72963f4) null, 0, 1));
        } else {
            C117407d.INSTANCE.idkeyStat(111, 246, 1, false);
        }
        return delete;
    }

    public Cursor Sx0(String str, int i) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        return this.f212775p.rawQuery("select * from " + hy0(str) + " where" + iy0(str) + "AND " + "type IN (3,39,13)" + " order by " + "createTime" + " DESC limit " + i, (String[]) null, 2);
    }

    /* renamed from: TE */
    public int mo101089TE(String str) {
        Log.m105929w("MicroMsg.MsgInfoStorage", "deleteByTalker :%s  stack:%s", str, MMStack.getStack(true));
        mo101099Yt(hy0(str), iy0(str), (String[]) null);
        int delete = this.f212775p.delete(hy0(str), iy0(str), (String[]) null);
        if (delete != 0) {
            doNotify("delete_talker " + str);
            C75875l.C45886e eVar = new C75875l.C45886e(str, "delete", (C72963f4) null, 0, delete);
            eVar.f123850g = -1;
            mo101123jo(eVar);
        }
        return delete;
    }

    /* renamed from: TO */
    public List<C72963f4> mo101090TO(String str, long j, int i) {
        ArrayList arrayList = new ArrayList();
        String str2 = "Select * From " + hy0(str) + " Where " + iy0(str) + " AND " + "createTime" + " > ?" + " and not ( type = 10000 and isSend != 2 ) " + " Order By " + "createTime" + " Desc Limit " + i + ";";
        Cursor rawQuery = this.f212775p.rawQuery(str2, new String[]{"" + j}, 2);
        while (rawQuery.moveToNext()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(rawQuery);
            arrayList.add(f4Var);
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: TY */
    public LinkedList<C72963f4> mo101091TY(String str, String str2) {
        Cursor query = this.f212775p.query(hy0(str), (String[]) null, "talker=? AND bizClientMsgId=?", new String[]{str, str2}, (String) null, (String) null, (String) null, 2);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    LinkedList<C72963f4> linkedList = new LinkedList<>();
                    do {
                        C72963f4 f4Var = new C72963f4();
                        f4Var.convertFrom(query);
                        linkedList.add(f4Var);
                    } while (query.moveToNext());
                    query.close();
                    query.close();
                    return linkedList;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e, "getLastDayC2CMsgByTalker error: %s", e.getMessage());
                LinkedList<C72963f4> linkedList2 = new LinkedList<>();
                if (query != null) {
                    query.close();
                }
                return linkedList2;
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        Log.m105920e("MicroMsg.MsgInfoStorage", "getByBizClientMsgId fail");
        if (query != null) {
            query.close();
        }
        return null;
    }

    public C72963f4.C72968e Tx0(String str) {
        C72963f4.C72968e eVar = (C72963f4.C72968e) ((C101062d) this.f212773n).get(Integer.valueOf(str.hashCode()));
        if (eVar != null) {
            return eVar;
        }
        C72963f4.C72968e c = C72963f4.C72968e.m85663c(str);
        ((C101062d) this.f212773n).mo139557c(Integer.valueOf(str.hashCode()), c);
        return c;
    }

    public C72963f4.C72969f Ux0(String str) {
        C72963f4.C72969f fVar = (C72963f4.C72969f) ((C101062d) this.f212770h).get(Integer.valueOf(str.hashCode()));
        if (fVar == null) {
            fVar = new C72963f4.C72969f();
            Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
            if (parseXml != null) {
                try {
                    fVar.f212722a = parseXml.get(".msg.pushmail.content.subject");
                    fVar.f212723b = parseXml.get(".msg.pushmail.content.digest");
                    fVar.f212724c = parseXml.get(".msg.pushmail.content.sender");
                    fVar.f212725d = parseXml.get(".msg.pushmail.waplink");
                    fVar.f212726e = Util.nullAsNil(parseXml.get(".msg.pushmail.content.attach")).equalsIgnoreCase("true");
                    fVar.f212727f = parseXml.get(".msg.pushmail.mailid");
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MsgInfo", "exception:%s", Util.stackTraceToString(e));
                }
            }
            ((C101062d) this.f212770h).mo139557c(Integer.valueOf(str.hashCode()), fVar);
        }
        return fVar;
    }

    public int Vx0(String str) {
        int i = 0;
        if (StateEvent.Name.MESSAGE.equals(hy0(str))) {
            C44660i2 i2Var = (C44660i2) this.f212766d;
            i2Var.getClass();
            int i2 = -1;
            if (str != null && str.length() > 0) {
                Cursor rawQuery = i2Var.f121077c.rawQuery("select msgCount from rconversation where username=" + C91753f.m115264e(str), (String[]) null, 2);
                if (rawQuery.moveToFirst()) {
                    i2 = rawQuery.getInt(0);
                }
                rawQuery.close();
            }
            if (i2 > 0) {
                Log.m105925i("MicroMsg.MsgInfoStorage", "getMsgCount conversationStorage.getMsgCountByUsername count:%d", Integer.valueOf(i2));
                return i2;
            }
            Log.m105925i("MicroMsg.MsgInfoStorage", "getMsgCount contactMsgCount is 0 ,go normal %s", str);
        } else if ("appbrandmessage".equals(hy0(str)) || "appbrandnotifymessage".equals(hy0(str))) {
            Cursor rawQuery2 = this.f212775p.rawQuery("SELECT COUNT(*) FROM " + hy0(str) + " WHERE" + iy0(str), (String[]) null);
            if (rawQuery2.moveToLast()) {
                i = rawQuery2.getInt(0);
            }
            rawQuery2.close();
            return i;
        } else if ("bottlemessage".equals(hy0(str))) {
            Cursor rawQuery3 = this.f212775p.rawQuery("SELECT COUNT(*) FROM " + hy0(str) + " WHERE" + iy0(str), (String[]) null, 2);
            if (rawQuery3.moveToFirst()) {
                i = rawQuery3.getInt(0);
            }
            rawQuery3.close();
            return i;
        }
        return Yx0(str);
    }

    public long Wa0(String str, long j) {
        Cursor rawQuery = this.f212775p.rawQuery("select createTime from " + hy0(str) + " where " + "msgId" + " = " + j, (String[]) null, 2);
        long j2 = rawQuery.moveToFirst() ? rawQuery.getLong(0) : 0;
        rawQuery.close();
        return j2;
    }

    public int Wx0(String str, int i) {
        Cursor rawQuery = this.f212775p.rawQuery("SELECT COUNT(*) FROM " + hy0(str) + " WHERE" + iy0(str) + "AND " + "type" + " = " + i, (String[]) null, 2);
        int i2 = 0;
        if (rawQuery.moveToFirst()) {
            i2 = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i2;
    }

    public int X90(String str, long j, long j2) {
        if (j2 < j) {
            long j3 = j;
            j = j2;
            j2 = j3;
        }
        Log.m105919d("MicroMsg.MsgInfoStorage", "talker %s, get count fromCreateTime %d, toCreateTime %d", str, Long.valueOf(j), Long.valueOf(j2));
        String str2 = "SELECT COUNT(msgId) FROM " + hy0(str) + " WHERE" + mo101130mL(str) + iy0(str) + "AND " + "createTime" + " >= " + j + " AND " + "createTime" + " <= " + j2;
        Log.m105918d("MicroMsg.MsgInfoStorage", "get count sql: " + str2);
        Cursor rawQuery = this.f212775p.rawQuery(str2, (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105928w("MicroMsg.MsgInfoStorage", "get count error, cursor is null");
            return 0;
        } else if (rawQuery.moveToFirst()) {
            int i = rawQuery.getInt(0);
            Log.m105919d("MicroMsg.MsgInfoStorage", "result msg count %d", Integer.valueOf(i));
            rawQuery.close();
            return i;
        } else {
            rawQuery.close();
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    public int Xx0(String str) {
        int i;
        String str2 = " SELECT COUNT(*) FROM " + hy0(str) + " WHERE" + mo101130mL(str) + iy0(str) + "AND " + "isSend" + "=" + 1;
        Cursor rawQuery = this.f212775p.rawQuery(str2, (String[]) null, 2);
        try {
            i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
            rawQuery.close();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e, "", new Object[0]);
            rawQuery.close();
            i = 0;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        Log.m105919d("MicroMsg.MsgInfoStorage", "[getMsgCountBySelf] getCursor talk:%s,count:%s,[%s]", str, Integer.valueOf(i), str2);
        return i;
    }

    /* renamed from: Yt */
    public void mo101099Yt(String str, String str2, String[] strArr) {
        int i;
        String str3 = "SELECT msgSvrId,createTime FROM " + str + " WHERE " + "createTime" + " > " + ((Util.nowSecond() - 172800) * 1000);
        if (!Util.isNullOrNil(str2)) {
            str3 = str3 + " AND " + str2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cursor rawQuery = this.f212775p.rawQuery(str3, strArr, 2);
        if (rawQuery.moveToFirst()) {
            do {
                arrayList.add(Integer.valueOf(rawQuery.getInt(0)));
                arrayList2.add(Long.valueOf(rawQuery.getLong(1) / 1000));
            } while (rawQuery.moveToNext());
            C72984m2 m2Var = this.f212776q;
            m2Var.getClass();
            Log.m105925i("MicroMsg.DelSvrIdMgr", "add size:%d", Integer.valueOf(arrayList.size()));
            m2Var.mo101177b();
            int nowSecond = (int) (Util.nowSecond() / 86400);
            for (i = 0; i < arrayList.size(); i++) {
                m2Var.mo101176a(nowSecond, (long) ((Integer) arrayList.get(i)).intValue(), ((Long) arrayList2.get(i)).longValue(), false);
            }
            m2Var.mo101178c();
        }
        rawQuery.close();
    }

    public int Yx0(String str) {
        Cursor rawQuery = this.f212775p.rawQuery("SELECT COUNT(*) FROM " + hy0(str) + " WHERE" + mo101130mL(str) + iy0(str), (String[]) null, 2);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    public Cursor Zx0(String str, long j, long j2, int i) {
        try {
            String str2 = "SELECT * FROM " + str + " LEFT JOIN DeletedConversationInfo ON " + str + ".talker = DeletedConversationInfo.userName WHERE msgId > ? AND createTime > ? AND (DeletedConversationInfo.reserved2 IS NULL OR createTime > DeletedConversationInfo.reserved2) ORDER BY msgId ASC";
            if (i >= 0) {
                str2 = str2 + " LIMIT ?";
            }
            return this.f212775p.mo125615f().rawQueryWithFactory(SQLiteDirectCursor.FACTORY, str2, i >= 0 ? new Object[]{Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)} : new Object[]{Long.valueOf(j), Long.valueOf(j2)}, str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e, "Cannot get message cursor.", new Object[0]);
            return null;
        }
    }

    public Cursor ay0(String str, int i, int i2) {
        return this.f212775p.query(hy0(str), (String[]) null, "isSend=? AND" + iy0(str) + "AND " + "status" + "!=? AND " + "type" + "=? order by " + "msgId" + " DESC limit " + i2, new String[]{"0", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "" + i}, (String) null, (String) null, (String) null);
    }

    public C72963f4 b00(long j) {
        C72963f4 f4Var = new C72963f4();
        C91753f fVar = this.f212775p;
        String gy02 = gy0(j);
        Cursor query = fVar.query(gy02, (String[]) null, "msgId=?", new String[]{"" + j}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            f4Var.convertFrom(query);
        }
        query.close();
        return f4Var;
    }

    /* renamed from: bD */
    public void mo101104bD(String str) {
        mo101099Yt(str, "", (String[]) null);
        C91753f fVar = this.f212775p;
        if (fVar.execSQL(str, "delete from " + str)) {
            doNotify("delete_all " + str);
            return;
        }
        C117407d.INSTANCE.idkeyStat(111, 247, 1, false);
    }

    /* renamed from: bF */
    public int mo101105bF(String str, int i) {
        Log.m105929w("MicroMsg.MsgInfoStorage", "deleteByTalkerFrom :%s  :%d stack:%s", str, Integer.valueOf(i), MMStack.getStack(true));
        C72963f4 h302 = h30(str, (long) i);
        Assert.assertTrue(str.equals(h302.mo108768t()));
        mo101099Yt(hy0(str), "createTime<=? AND" + iy0(str), new String[]{"" + h302.getCreateTime()});
        int delete = this.f212775p.delete(hy0(str), "createTime<=? AND" + iy0(str), new String[]{"" + h302.getCreateTime()});
        if (delete != 0) {
            doNotify();
            mo101123jo(new C75875l.C45886e(str, "delete", (C72963f4) null, 0, delete));
        }
        return delete;
    }

    /* renamed from: bO */
    public List<C72963f4> mo101106bO(String str) {
        ArrayList arrayList = null;
        Cursor rawQuery = this.f212775p.rawQuery("select * from " + str, (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            ArrayList arrayList2 = new ArrayList();
            do {
                C72963f4 f4Var = new C72963f4();
                f4Var.convertFrom(rawQuery);
                arrayList2.add(f4Var);
            } while (rawQuery.moveToNext());
            arrayList = arrayList2;
        }
        rawQuery.close();
        return arrayList;
    }

    public final String by0(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            Map<String, String> parseXml = XmlParser.parseXml(str, "msgsource", (String) null);
            if (parseXml != null) {
                if (!parseXml.isEmpty()) {
                    return parseXml.get(".msgsource.bizmsg.msgcluster");
                }
            }
            return null;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MsgInfoStorage", "exception:%s", Util.stackTraceToString(e));
            Log.m105921e("MicroMsg.MsgInfoStorage", "Exception in getMsgcluster, %s", e.getMessage());
            return null;
        }
    }

    public Cursor c40(String str, int i) {
        C72963f4 h302 = h30(str, (long) i);
        Assert.assertTrue(str.equals(h302.mo108768t()));
        return this.f212775p.query(hy0(str), (String[]) null, "createTime<=? AND" + iy0(str), new String[]{"" + h302.getCreateTime()}, (String) null, (String) null, (String) null);
    }

    public Cursor cx0(String str, long j) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        return this.f212775p.rawQuery("select * from " + hy0(str) + " where" + iy0(str) + " AND " + "type IN (3,39,13)" + " AND " + "createTime" + " > " + j + " order by " + "createTime" + " DESC", (String[]) null, 2);
    }

    public int cy0(C72963f4 f4Var) {
        int i = 0;
        if (f4Var != null && !Util.isNullOrNil(f4Var.mo108768t())) {
            Cursor rawQuery = this.f212775p.rawQuery("SELECT count(msgId) FROM " + hy0(f4Var.mo108768t()) + " WHERE" + iy0(f4Var.mo108768t()) + "AND " + "isSend" + " = " + 0 + " AND " + "msgId" + " >= " + f4Var.getMsgId() + " ORDER BY " + "createTime" + " DESC", (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            rawQuery.close();
        }
        return i;
    }

    public Cursor dy0(String str, long j, long j2, boolean z, int i) {
        if (j2 < j) {
            long j3 = j;
            j = j2;
            j2 = j3;
        }
        String str2 = "SELECT * FROM " + hy0(str) + " WHERE" + iy0(str) + "AND " + "createTime" + " >= " + j + " AND " + "createTime" + " <= " + j2 + " AND " + "isSend" + "=" + (z ? 1 : 0) + " LIMIT " + i;
        Log.m105918d("MicroMsg.MsgInfoStorage", "get cursor: " + str2);
        return this.f212775p.rawQuery(str2, (String[]) null);
    }

    public final C75875l.C75878d ey0(String str) {
        Assert.assertTrue("tableName == null", str != null && str.length() > 0);
        for (int i = 0; i < ((LinkedList) this.f212769g).size(); i++) {
            if (str.equals(((C75875l.C75878d) ((LinkedList) this.f212769g).get(i)).mo106146b())) {
                return (C75875l.C75878d) ((LinkedList) this.f212769g).get(i);
            }
        }
        Assert.assertTrue("no table match", false);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* renamed from: fY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.p014mm.storage.C72963f4> mo101113fY(java.lang.String r16, long r17, long r19) {
        /*
            r15 = this;
            java.lang.String r0 = "createTime"
            r1 = 0
            r2 = 1
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            r4.<init>()     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            r5 = r15
            zh3.f r6 = r5.f212775p     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r7 = r15.hy0(r16)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r8 = 0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r9.<init>()     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r10 = r15.iy0(r16)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r9.append(r10)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r10 = " AND "
            r9.append(r10)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r9.append(r0)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r10 = ">? AND "
            r9.append(r10)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r9.append(r0)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r0 = "<=? "
            r9.append(r0)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r0 = 2
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r10[r1] = r0     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r10[r2] = r0     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r11 = 0
            r12 = 0
            java.lang.String r13 = "createTime DESC"
            r14 = 2
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
        L_0x004f:
            boolean r0 = r6.moveToNext()     // Catch:{ Exception -> 0x0065 }
            if (r0 == 0) goto L_0x0061
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4     // Catch:{ Exception -> 0x0065 }
            r0.<init>()     // Catch:{ Exception -> 0x0065 }
            r0.convertFrom(r6)     // Catch:{ Exception -> 0x0065 }
            r4.add(r0)     // Catch:{ Exception -> 0x0065 }
            goto L_0x004f
        L_0x0061:
            r6.close()
            return r4
        L_0x0065:
            r0 = move-exception
            goto L_0x0071
        L_0x0067:
            r0 = move-exception
            goto L_0x0088
        L_0x0069:
            r0 = move-exception
            goto L_0x0070
        L_0x006b:
            r0 = move-exception
            r5 = r15
            goto L_0x0088
        L_0x006e:
            r0 = move-exception
            r5 = r15
        L_0x0070:
            r6 = r3
        L_0x0071:
            java.lang.String r4 = "MicroMsg.MsgInfoStorage"
            java.lang.String r7 = "getAppMsgList error: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0086 }
            java.lang.String r8 = r0.getMessage()     // Catch:{ all -> 0x0086 }
            r2[r1] = r8     // Catch:{ all -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r7, r2)     // Catch:{ all -> 0x0086 }
            if (r6 == 0) goto L_0x0085
            r6.close()
        L_0x0085:
            return r3
        L_0x0086:
            r0 = move-exception
            r3 = r6
        L_0x0088:
            if (r3 == 0) goto L_0x008d
            r3.close()
        L_0x008d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72972g4.mo101113fY(java.lang.String, long, long):java.util.List");
    }

    public Cursor fq0(String str, long j, long j2, int i, int i2) {
        long j3;
        long j4 = j;
        int i3 = i;
        int i4 = i2;
        if (j2 == 0) {
            String str2 = "SELECT * FROM " + hy0(str) + " WHERE" + iy0(str) + "AND " + "createTime" + " > " + j4 + " ORDER BY " + "createTime" + " ASC  LIMIT " + i3 + " OFFSET " + i4;
            Log.m105918d("MicroMsg.MsgInfoStorage", "get cursor: " + str2);
            return this.f212775p.rawQuery(str2, (String[]) null);
        }
        String str3 = "get cursor: ";
        if (j2 < j4) {
            j3 = j4;
            j4 = j2;
        } else {
            j3 = j2;
        }
        String str4 = "SELECT * FROM " + hy0(str) + " WHERE" + iy0(str) + "AND " + "createTime" + " > " + j4 + " AND " + "createTime" + " < " + j3 + " ORDER BY " + "createTime" + " ASC  LIMIT " + i3 + " OFFSET " + i4;
        Log.m105918d("MicroMsg.MsgInfoStorage", str3 + str4);
        return this.f212775p.rawQuery(str4, (String[]) null);
    }

    public C75875l.C75878d fy0(String str) {
        String str2;
        boolean z = true;
        Assert.assertTrue("username == null", str != null && str.length() > 0);
        if (str == null || str.length() <= 0) {
            z = false;
        }
        Assert.assertTrue(z);
        Iterator it = ((CopyOnWriteArrayList) this.f212768f).iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = StateEvent.Name.MESSAGE;
                break;
            }
            str2 = ((C72959e) it.next()).mo100923f(str);
            if (!Util.isNullOrNil(str2)) {
                break;
            }
        }
        return ey0(str2);
    }

    /* renamed from: g */
    public final void mo101116g(String str) {
        Log.m105925i("MicroMsg.MsgInfoStorage", "lockForSync tag:%s islock:%b lockCnt[%d,%d] notifyCnt:%d last:[%s,%d] synch:%s", str, Boolean.valueOf(this.f212780u), Integer.valueOf(super.lockCount()), Integer.valueOf(this.f212778s.lockCount()), Integer.valueOf(((HashMap) this.f212779t).size()), this.f212781v, Long.valueOf(Util.milliSecondsToNow(this.f212782w)), Boolean.valueOf(this.f212765G));
        if (Util.isNullOrNil(str)) {
            Assert.assertTrue("lockForSync, do not call me by null tag.", false);
        }
        if (this.f212780u) {
            Log.m105929w("MicroMsg.MsgInfoStorage", "lockForSync, has been locked by :%s  time:%d", this.f212781v, Long.valueOf(Util.milliSecondsToNow(this.f212782w)));
            return;
        }
        this.f212781v = str;
        this.f212782w = Util.nowMilliSecond();
        this.f212780u = true;
        super.lock();
        this.f212778s.lock();
    }

    /* renamed from: gY */
    public List<C72963f4> mo101117gY(String str, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        String str2 = "SELECT * FROM " + hy0(str) + " WHERE " + "type & 65535 = 49" + " ORDER BY " + "createTime" + " DESC LIMIT " + i + " , " + i2;
        Log.m105919d("MicroMsg.MsgInfoStorage", "getAppMsgTypeList sql=%s", str2);
        Cursor rawQuery = this.f212775p.rawQuery(str2, (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(rawQuery);
            if (f4Var.mo101020w3()) {
                arrayList.add(f4Var);
            }
        }
        rawQuery.close();
        return arrayList;
    }

    public final String gy0(long j) {
        if (!(j == 0 || j == -1)) {
            C72963f4.m85592k3(j);
            for (int i = 0; i < ((LinkedList) this.f212769g).size(); i++) {
                if (((C75875l.C75878d) ((LinkedList) this.f212769g).get(i)).mo106148d(j)) {
                    return ((C75875l.C75878d) ((LinkedList) this.f212769g).get(i)).mo106146b();
                }
            }
            Assert.assertTrue(String.format("getTableNameByLocalId failed:%d", new Object[]{Long.valueOf(j)}), false);
        }
        return null;
    }

    public C72963f4 h30(String str, long j) {
        C72963f4 f4Var = new C72963f4();
        C91753f fVar = this.f212775p;
        String hy02 = hy0(str);
        Cursor query = fVar.query(hy02, (String[]) null, "msgSvrId=?", new String[]{"" + j}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            f4Var.convertFrom(query);
        }
        query.close();
        return f4Var;
    }

    public String hy0(String str) {
        Assert.assertTrue("username == null", str != null && str.length() > 0);
        return fy0(str).mo106146b();
    }

    public String iy0(String str) {
        hy0(str);
        return " talker= '" + Util.escapeSqlValue(str) + "' ";
    }

    /* renamed from: j */
    public final void mo101122j(String str) {
        Log.m105925i("MicroMsg.MsgInfoStorage", "unlockForSync tag:%s islock:%b lockCnt[%d,%d] notifyCnt:%d last:[%s,%d]", str, Boolean.valueOf(this.f212780u), Integer.valueOf(super.lockCount()), Integer.valueOf(this.f212778s.lockCount()), Integer.valueOf(((HashMap) this.f212779t).size()), this.f212781v, Long.valueOf(Util.milliSecondsToNow(this.f212782w)));
        if (Util.isNullOrNil(str)) {
            Assert.assertTrue("lockForSync, do not call me by null tag.", false);
        }
        if (!this.f212780u) {
            Log.m105929w("MicroMsg.MsgInfoStorage", "unlockForSync, No one Locking Now , why this tag:%s call it ! [%s]", str, Util.getStack());
        } else if (!str.equals(this.f212781v)) {
            Log.m105929w("MicroMsg.MsgInfoStorage", "unlockForSync locking[%s] diff:%d, but unlock[%s] , Ignore this call.", this.f212781v, Long.valueOf(Util.milliSecondsToNow(this.f212782w)), str);
        } else {
            this.f212780u = false;
            this.f212782w = 0;
            this.f212781v = "";
            synchronized (this.f212779t) {
                for (String str2 : ((HashMap) this.f212779t).keySet()) {
                    mo101123jo((C75875l.C45886e) ((HashMap) this.f212779t).get(str2));
                }
                ((HashMap) this.f212779t).clear();
            }
            super.unlock();
            this.f212778s.unlock();
            doNotify();
        }
    }

    /* renamed from: jo */
    public void mo101123jo(C75875l.C45886e eVar) {
        if (this.f212778s.event(eVar)) {
            this.f212778s.doNotify();
            this.f212778s.isLocked();
        }
    }

    public long jy0(String str) {
        long n3 = this.f212767e.mo69715n3(str);
        boolean z = n3 < 0;
        if (z && !C45628s0.m50742G(str) && !C45628s0.m50745J(str)) {
            C72996z1 z1Var = new C72996z1(str);
            z1Var.setType(2);
            this.f212767e.mo69667P3(z1Var);
            n3 = this.f212767e.mo69715n3(str);
        }
        if (!CrashReportFactory.isBackupMerge()) {
            Log.m105925i("MicroMsg.MsgInfoStorage", "getTalkerIdByTalkerName:%s id:%s needinsert:%s [%s]", str, Long.valueOf(n3), Boolean.valueOf(z), "");
        }
        return n3;
    }

    /* renamed from: kD */
    public int mo101125kD(long j) {
        long j2 = j;
        C72963f4 b002 = b00(j);
        String t = b002.mo108768t();
        this.f212776q.mo101176a((int) (Util.nowSecond() / 86400), b002.mo108774y2(), b002.getCreateTime() / 1000, true);
        C91753f fVar = this.f212775p;
        String gy02 = gy0(j);
        int delete = fVar.delete(gy02, "msgId=?", new String[]{"" + j2});
        ((C31505r2) C86312j.m106911c(C31505r2.class)).Wt0(j2);
        if (delete != 0) {
            doNotify("delete_id " + j2);
            C75875l.C45886e eVar = new C75875l.C45886e(t, "delete", b002, 0, 1);
            eVar.f123850g = j2;
            eVar.f123851h = b002.mo108759l2();
            mo101123jo(eVar);
        } else {
            C117407d.INSTANCE.idkeyStat(111, 245, 1, false);
        }
        return delete;
    }

    public Cursor ko0(String str) {
        return this.f212775p.query(hy0(str), (String[]) null, iy0(str), (String[]) null, (String) null, (String) null, "createTime ASC ");
    }

    public long ky0(String str, long j, int i) {
        Log.m105919d("MicroMsg.MsgInfoStorage", "get up inc create time, talker %s, fromCreateTime %d, targetIncCount %d", str, Long.valueOf(j), Integer.valueOf(i));
        if (i <= 0) {
            Log.m105928w("MicroMsg.MsgInfoStorage", "error target inc count");
            return j;
        }
        String str2 = "SELECT createTime FROM " + hy0(str) + " WHERE" + mo101130mL(str) + iy0(str) + "AND " + "createTime" + " < " + j + " ORDER BY " + "createTime" + " DESC  LIMIT " + i;
        Log.m105919d("MicroMsg.MsgInfoStorage", "get up inc msg create time sql: %s", str2);
        Cursor rawQuery = this.f212775p.rawQuery(str2, (String[]) null);
        if (rawQuery == null) {
            Log.m105928w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
            return j;
        } else if (rawQuery.moveToLast()) {
            long j2 = rawQuery.getLong(0);
            Log.m105919d("MicroMsg.MsgInfoStorage", "result msg create time %d", Long.valueOf(j2));
            rawQuery.close();
            return j2;
        } else {
            rawQuery.close();
            Log.m105928w("MicroMsg.MsgInfoStorage", "get result fail");
            return j;
        }
    }

    public void lock() {
        Assert.assertTrue("lock deprecated, use lockForSync instead.", false);
    }

    public C72963f4.C72971h ly0(String str) {
        C72963f4.C72971h hVar = (C72963f4.C72971h) ((C101062d) this.f212771i).get(Integer.valueOf(str.hashCode()));
        if (hVar != null) {
            return hVar;
        }
        C72963f4.C72971h v = C72963f4.C72971h.m85668v(str);
        ((C101062d) this.f212771i).mo139557c(Integer.valueOf(str.hashCode()), v);
        return v;
    }

    /* renamed from: mI */
    public int mo101129mI(String str, long j) {
        String str2 = iy0(str) + " and " + "createTime" + " <= " + j;
        mo101099Yt(hy0(str), str2, (String[]) null);
        int delete = this.f212775p.delete(hy0(str), str2, (String[]) null);
        if (delete != 0) {
            doNotify("delete_talker " + str);
            C75875l.C45886e eVar = new C75875l.C45886e(str, "delete", (C72963f4) null, 0, delete);
            eVar.f123850g = -1;
            mo101123jo(eVar);
        }
        return delete;
    }

    /* renamed from: mL */
    public final String mo101130mL(String str) {
        long jo = ((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo(str);
        if (jo <= 0) {
            return "";
        }
        return " createTime > " + jo + " AND ";
    }

    public long my0(C72963f4 f4Var) {
        long oy02 = oy0(f4Var, false, true);
        if (oy02 < 0) {
            CmdProcFailedStruct cmdProcFailedStruct = new CmdProcFailedStruct();
            cmdProcFailedStruct.f194180e = f4Var.mo108774y2();
            cmdProcFailedStruct.f194179d = (long) f4Var.getType();
            cmdProcFailedStruct.f194182g = (long) (1000 - this.f212777r);
            cmdProcFailedStruct.f194181f = cmdProcFailedStruct.mo86045b(AppMeasurement.CRASH_ORIGIN, "MsgInfo processAddMsg insert db error", true);
            cmdProcFailedStruct.mo86054n();
        }
        return oy02;
    }

    /* renamed from: nP */
    public List<C72963f4> mo101132nP(String str, long j, int i) {
        ArrayList arrayList = new ArrayList();
        String str2 = "Select * From " + hy0(str) + " Where " + iy0(str) + " AND " + "createTime" + " < ?" + " and not ( type = 10000 and isSend != 2 ) " + " Order By " + "createTime" + " Desc Limit " + i;
        Cursor rawQuery = this.f212775p.rawQuery(str2, new String[]{"" + j}, 2);
        while (rawQuery.moveToNext()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(rawQuery);
            arrayList.add(f4Var);
        }
        rawQuery.close();
        return arrayList;
    }

    public long ny0(C72963f4 f4Var, boolean z) {
        return oy0(f4Var, z, true);
    }

    public C72963f4 ov0(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C72963f4 f4Var = new C72963f4();
        Cursor rawQuery = this.f212775p.rawQuery("select * from " + hy0(str) + " where" + mo101130mL(str) + iy0(str) + "order by " + "createTime" + " ASC limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            f4Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return f4Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: g62.l$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long oy0(com.tencent.p014mm.storage.C72963f4 r20, boolean r21, boolean r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = -1
            r4 = 2
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x02d9
            java.lang.String r7 = r20.mo108768t()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0017
            goto L_0x02d9
        L_0x0017:
            java.lang.String r7 = "MicroMsg.MsgInfoStorage"
            java.lang.String r8 = "insert lockForSync[%b], message seq[%d]"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            boolean r10 = r1.f212780u
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9[r5] = r10
            long r10 = r20.mo108772w2()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9[r6] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r9)
            java.lang.String r7 = r20.mo108773x2()
            eb0.z3$$h r7 = eb0.C75604z3.m90851w(r7)
            r8 = 0
            if (r7 == 0) goto L_0x0040
            java.lang.String r9 = r7.f222094a
            goto L_0x0041
        L_0x0040:
            r9 = r8
        L_0x0041:
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85839j5(r9)
            if (r10 == 0) goto L_0x006b
            java.lang.String r10 = "MicroMsg.MsgInfoStorage"
            java.lang.String r11 = "msgCluster = %s"
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r5] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r12)
            int r9 = r20.getType()
            r10 = 436207665(0x1a000031, float:2.6469934E-23)
            if (r9 != r10) goto L_0x0066
            java.lang.String r0 = "MicroMsg.MsgInfoStorage"
            java.lang.String r4 = "protect:c2c msg should not here"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            r0 = -4
            r1.f212777r = r0
            return r2
        L_0x0066:
            java.lang.String r9 = "notifymessage"
            r0.mo108749c3(r9)
        L_0x006b:
            int r9 = r20.getType()
            r10 = 1075839025(0x40200031, float:2.5000117)
            if (r9 != r10) goto L_0x0079
            java.lang.String r9 = "notifymessage"
            r0.mo108749c3(r9)
        L_0x0079:
            java.lang.String r9 = r20.mo108768t()
            g62.l$d r9 = r1.fy0(r9)
            if (r9 != 0) goto L_0x00a3
            kj2.d r10 = kj2.C117407d.INSTANCE
            r11 = 111(0x6f, double:5.5E-322)
            r13 = 249(0xf9, double:1.23E-321)
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            java.lang.String r4 = "MicroMsg.MsgInfoStorage"
            java.lang.String r7 = "Error insert message getTableByTalker failed. talker:%s"
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = r20.mo108768t()
            r6[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r7, r6)
            r0 = -5
            r1.f212777r = r0
            return r2
        L_0x00a3:
            r9.mo106147c(r0)
            java.lang.String r10 = "check table name from id:%d table:%s getTableNameByLocalId:%s"
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            long r13 = r20.getMsgId()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12[r5] = r13
            r12[r6] = r9
            long r13 = r20.getMsgId()
            java.lang.String r13 = r1.gy0(r13)
            r12[r4] = r13
            java.lang.String r10 = java.lang.String.format(r10, r12)
            java.lang.String r12 = r9.mo106146b()
            long r13 = r20.getMsgId()
            java.lang.String r13 = r1.gy0(r13)
            boolean r12 = r12.equals(r13)
            junit.framework.Assert.assertTrue(r10, r12)
            long r12 = r20.mo108774y2()
            r14 = 0
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x00e5
            r0.mo108748b3(r6)
        L_0x00e5:
            java.util.List<com.tencent.mm.storage.e> r10 = r1.f212768f
            java.util.concurrent.CopyOnWriteArrayList r10 = (java.util.concurrent.CopyOnWriteArrayList) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00ed:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0118
            java.lang.Object r12 = r10.next()
            com.tencent.mm.storage.e r12 = (com.tencent.p014mm.storage.C72959e) r12
            boolean r12 = r12.mo100922b(r0, r7)
            if (r12 != 0) goto L_0x00ed
            java.lang.String r7 = "MicroMsg.MsgInfoStorage"
            java.lang.String r8 = "Error dealMsgSource. talker:%s ,msgSouce:%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r9 = r20.mo108768t()
            r4[r5] = r9
            java.lang.String r0 = r20.mo108773x2()
            r4[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r4)
            r0 = -6
            r1.f212777r = r0
            return r2
        L_0x0118:
            vy0(r20)
            java.lang.String r7 = r9.mo106146b()
            java.lang.String r10 = "message"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0133
            java.lang.String r7 = r20.mo108768t()
            long r12 = r1.jy0(r7)
            int r7 = (int) r12
            r0.mo108750d3(r7)
        L_0x0133:
            android.content.ContentValues r7 = r20.convertTo()
            if (r21 == 0) goto L_0x014a
            zh3.f r10 = r1.f212775p
            zh3.e r10 = r10.mo125618h()
            java.lang.String r9 = r9.mo106146b()
            java.lang.String r12 = "msgId"
            long r9 = r10.mo183819l(r9, r12, r7)
            goto L_0x0156
        L_0x014a:
            zh3.f r10 = r1.f212775p
            java.lang.String r9 = r9.mo106146b()
            java.lang.String r12 = "msgId"
            long r9 = r10.mo125627q(r9, r12, r7, r5)
        L_0x0156:
            java.lang.String r7 = "MicroMsg.MsgInfoStorage"
            java.lang.String r12 = "insert:%d talker:%s id:%d type:%d status:%d svrid:%d msgseq:%d flag:%d create:%d issend:%d lockforsync[%s,%d]"
            r13 = 12
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r13[r5] = r14
            java.lang.String r14 = r20.mo108768t()
            r13[r6] = r14
            long r14 = r20.getMsgId()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r4] = r14
            int r14 = r20.getType()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r11] = r14
            r11 = 4
            int r14 = r20.getStatus()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r11] = r14
            r11 = 5
            long r14 = r20.mo108774y2()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r11] = r14
            r11 = 6
            long r14 = r20.mo108772w2()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r11] = r14
            r11 = 7
            int r14 = r20.mo108762o2()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r11] = r14
            r11 = 8
            long r14 = r20.getCreateTime()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r11] = r14
            r11 = 9
            int r14 = r20.mo108769t2()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r11] = r14
            r11 = 10
            java.lang.String r14 = r1.f212781v
            r13[r11] = r14
            r11 = 11
            long r14 = r1.f212782w
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r14)
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r11] = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r13)
            int r7 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x02af
            r11 = -2
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x01e5
            goto L_0x02af
        L_0x01e5:
            boolean r2 = r1.f212780u
            if (r2 == 0) goto L_0x021f
            long r2 = r1.f212782w
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r2)
            r9 = 2000(0x7d0, double:9.88E-321)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x021f
            int r2 = r20.mo108769t2()
            if (r2 != r6) goto L_0x021f
            int r2 = r20.getStatus()
            if (r2 != r6) goto L_0x021f
            java.lang.String r2 = "MicroMsg.MsgInfoStorage"
            java.lang.String r3 = "insert this tag[%s] lockForSync too long:%d force to release Now."
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r7 = r1.f212781v
            r4[r5] = r7
            long r9 = r1.f212782w
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r9)
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r4[r6] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r4)
            java.lang.String r2 = r1.f212781v
            r1.wy0(r2)
        L_0x021f:
            if (r22 != 0) goto L_0x0226
            long r2 = r20.getMsgId()
            return r2
        L_0x0226:
            boolean r2 = r1.f212780u
            if (r2 == 0) goto L_0x028d
            f62.m0 r2 = com.tencent.p014mm.storage.C72959e.m85566d()
            if (r2 == 0) goto L_0x023b
            f62.m0 r2 = com.tencent.p014mm.storage.C72959e.m85566d()
            fw0.w$h r2 = (fw0.C87107w.C75815h) r2
            java.lang.String r2 = r2.mo106109a(r0)
            goto L_0x023c
        L_0x023b:
            r2 = r8
        L_0x023c:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x0246
            java.lang.String r2 = r20.mo108768t()
        L_0x0246:
            java.util.Map<java.lang.String, g62.l$e> r3 = r1.f212779t
            monitor-enter(r3)
            java.util.Map<java.lang.String, g62.l$e> r4 = r1.f212779t     // Catch:{ all -> 0x028a }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x028a }
            boolean r4 = r4.containsKey(r2)     // Catch:{ all -> 0x028a }
            if (r4 == 0) goto L_0x025e
            java.util.Map<java.lang.String, g62.l$e> r4 = r1.f212779t     // Catch:{ all -> 0x028a }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x028a }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x028a }
            r8 = r4
            g62.l$e r8 = (g62.C75875l.C45886e) r8     // Catch:{ all -> 0x028a }
        L_0x025e:
            if (r8 != 0) goto L_0x026c
            g62.l$e r8 = new g62.l$e     // Catch:{ all -> 0x028a }
            java.lang.String r4 = r20.mo108768t()     // Catch:{ all -> 0x028a }
            java.lang.String r7 = "insert"
            r8.<init>(r4, r7, r0)     // Catch:{ all -> 0x028a }
            goto L_0x0271
        L_0x026c:
            java.util.ArrayList<com.tencent.mm.storage.f4> r4 = r8.f123846c     // Catch:{ all -> 0x028a }
            r4.add(r0)     // Catch:{ all -> 0x028a }
        L_0x0271:
            boolean r4 = r8.mo71317a(r0)     // Catch:{ all -> 0x028a }
            if (r4 == 0) goto L_0x027c
            int r4 = r8.f123847d     // Catch:{ all -> 0x028a }
            int r4 = r4 + r6
            r8.f123847d = r4     // Catch:{ all -> 0x028a }
        L_0x027c:
            int r4 = r8.f123848e     // Catch:{ all -> 0x028a }
            int r4 = r4 + r6
            r8.f123848e = r4     // Catch:{ all -> 0x028a }
            java.util.Map<java.lang.String, g62.l$e> r4 = r1.f212779t     // Catch:{ all -> 0x028a }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x028a }
            r4.put(r2, r8)     // Catch:{ all -> 0x028a }
            monitor-exit(r3)     // Catch:{ all -> 0x028a }
            goto L_0x02a8
        L_0x028a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x028a }
            throw r0
        L_0x028d:
            g62.l$e r2 = new g62.l$e
            java.lang.String r3 = r20.mo108768t()
            java.lang.String r4 = "insert"
            r2.<init>(r3, r4, r0)
            boolean r3 = r2.mo71317a(r0)
            if (r3 == 0) goto L_0x02a0
            r2.f123847d = r6
        L_0x02a0:
            r2.f123848e = r6
            r19.doNotify()
            r1.mo101123jo(r2)
        L_0x02a8:
            r1.f212777r = r5
            long r2 = r20.getMsgId()
            return r2
        L_0x02af:
            kj2.d r11 = kj2.C117407d.INSTANCE
            r12 = 111(0x6f, double:5.5E-322)
            r14 = 248(0xf8, double:1.225E-321)
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.String r7 = "MicroMsg.MsgInfoStorage"
            java.lang.String r8 = "insert failed svrid:%d ret:%d"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            long r11 = r20.mo108774y2()
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r4[r5] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r4[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r4)
            int r0 = (int) r9
            r1.f212777r = r0
            return r2
        L_0x02d9:
            kj2.d r7 = kj2.C117407d.INSTANCE
            r8 = 111(0x6f, double:5.5E-322)
            r10 = 250(0xfa, double:1.235E-321)
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            java.lang.String r7 = "MicroMsg.MsgInfoStorage"
            java.lang.String r8 = "Error insert message msg:%s talker:%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r0
            if (r0 != 0) goto L_0x02f2
            java.lang.String r0 = "-1"
            goto L_0x02f6
        L_0x02f2:
            java.lang.String r0 = r20.mo108768t()
        L_0x02f6:
            r4[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r4)
            r0 = -3
            r1.f212777r = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72972g4.oy0(com.tencent.mm.storage.f4, boolean, boolean):long");
    }

    public boolean py0(long j) {
        C72984m2 m2Var = this.f212776q;
        if (m2Var.mo101177b()) {
            m2Var.mo101178c();
        }
        return m2Var.f212809a.f212800h.contains(Long.valueOf(j)) || m2Var.f212809a.f212801i.contains(Long.valueOf(j)) || m2Var.f212809a.f212802j.contains(Long.valueOf(j));
    }

    /* renamed from: qq */
    public void mo101137qq(C75875l.C75877b bVar, Looper looper) {
        this.f212778s.add(bVar, looper);
    }

    public void qy0(String str) {
        if (this.f212765G) {
            synchronized (this.f212764F) {
                mo101116g(str);
            }
            return;
        }
        mo101116g(str);
    }

    public Cursor r50(String str) {
        return this.f212775p.query(hy0(str), new String[]{"createTime", "msgId"}, mo101130mL(str) + iy0(str), (String[]) null, "createTime", (String) null, "createTime ASC");
    }

    public void ry0(String str, long j) {
        String str2 = str;
        C75875l.C75878d fy02 = fy0(str);
        long j2 = fy02.f222521a;
        Random random = new Random();
        this.f212775p.execSQL(StateEvent.Name.MESSAGE, "BEGIN;");
        C72963f4 f4Var = new C72963f4(str2);
        for (int i = 0; ((long) i) < j; i++) {
            f4Var.mo108733M2(System.currentTimeMillis());
            f4Var.setType(1);
            f4Var.mo108732L2("纵观目前国内手游市场，大量同质类手游充斥玩家的视野，而在主机和PC平台上经久不衰的体育类游戏，却鲜有佳作。在获得了NBA官方认可以后。" + Util.random());
            f4Var.setMsgId(j2);
            f4Var.mo100991d(random.nextInt(4));
            f4Var.mo108740T2(random.nextInt(1));
            j2++;
            fy02.f222521a++;
            f4Var.mo108745Y2(System.currentTimeMillis() + ((long) Util.random()));
            this.f212775p.execSQL(StateEvent.Name.MESSAGE, "INSERT INTO " + hy0(f4Var.mo108768t()) + " (msgid,msgSvrid,type,status,createTime,talker,content,talkerid)  VALUES(" + f4Var.getMsgId() + "," + f4Var.mo108774y2() + "," + f4Var.getType() + "," + f4Var.getStatus() + "," + f4Var.getCreateTime() + ",'" + f4Var.mo108768t() + "','" + f4Var.getContent() + "'," + jy0(str) + ");");
            if (i % 10000 == 0) {
                this.f212775p.execSQL(StateEvent.Name.MESSAGE, "COMMIT;");
                this.f212775p.execSQL(StateEvent.Name.MESSAGE, "BEGIN;");
            }
        }
        this.f212775p.execSQL(StateEvent.Name.MESSAGE, "COMMIT;");
        C44660i2 i2Var = (C44660i2) this.f212766d;
        i2Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("msgCount", 0);
        i2Var.f121077c.update("rconversation", contentValues, "username=?", new String[]{str2});
        f4Var.setMsgId(j2 + 1);
        my0(f4Var);
    }

    public void sy0(C75875l.C75877b bVar) {
        this.f212778s.remove(bVar);
    }

    public void ty0(C72963f4 f4Var) {
        if (f4Var != null && f4Var.getStatus() != 4) {
            f4Var.mo100991d(4);
            String gy02 = gy0(f4Var.getMsgId());
            if (gy02 != null && gy02.length() > 0) {
                C91753f fVar = this.f212775p;
                ContentValues convertTo = f4Var.convertTo();
                if (fVar.update(gy02, convertTo, "msgId=?", new String[]{"" + f4Var.getMsgId()}) != 0) {
                    doNotify();
                    mo101123jo(new C75875l.C45886e(f4Var.mo108768t(), "update", f4Var, -1));
                }
            }
        }
    }

    /* renamed from: uP */
    public Cursor mo101143uP(String str, long j) {
        SQLiteDatabase f = this.f212775p.mo125615f();
        return f.rawQueryWithFactory((SQLiteDatabase.CursorFactory) null, "SELECT * FROM " + str + " WHERE " + "createTime" + " < " + j, (Object[]) null, str);
    }

    public void unlock() {
        Assert.assertTrue("unlock deprecated, use lockForSync instead.", false);
    }

    public void uy0(C91753f fVar, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z15;
        String str2;
        String str3;
        C91753f fVar2 = fVar;
        Cursor rawQuery = fVar2.rawQuery("PRAGMA table_info( " + str + " )", (String[]) null, 2);
        int columnIndex = rawQuery.getColumnIndex("name");
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z25 = false;
        boolean z26 = false;
        boolean z27 = false;
        boolean z28 = false;
        boolean z29 = false;
        boolean z34 = false;
        boolean z35 = false;
        while (true) {
            z = z35;
            z2 = z34;
            z3 = z29;
            z4 = z28;
            z5 = z27;
            z6 = z26;
            z7 = z25;
            z8 = z19;
            z9 = z18;
            z15 = z17;
            if (!rawQuery.moveToNext()) {
                break;
            } else if (columnIndex >= 0) {
                String string = rawQuery.getString(columnIndex);
                if ("lvbuffer".equalsIgnoreCase(string)) {
                    z35 = z;
                    z34 = z2;
                    z29 = z3;
                    z28 = z4;
                    z27 = z5;
                    z26 = z6;
                    z25 = z7;
                    z19 = z8;
                    z18 = z9;
                    z17 = z15;
                    z16 = true;
                } else if ("transContent".equalsIgnoreCase(string)) {
                    z35 = z;
                    z34 = z2;
                    z29 = z3;
                    z28 = z4;
                    z27 = z5;
                    z26 = z6;
                    z25 = z7;
                    z19 = z8;
                    z18 = z9;
                    z17 = true;
                } else if ("transBrandWording".equalsIgnoreCase(string)) {
                    z35 = z;
                    z34 = z2;
                    z29 = z3;
                    z28 = z4;
                    z27 = z5;
                    z26 = z6;
                    z25 = z7;
                    z19 = z8;
                    z17 = z15;
                    z18 = true;
                } else if ("talkerId".equalsIgnoreCase(string)) {
                    z35 = z;
                    z34 = z2;
                    z29 = z3;
                    z28 = z4;
                    z27 = z5;
                    z26 = z6;
                    z25 = z7;
                    z18 = z9;
                    z17 = z15;
                    z19 = true;
                } else if ("bizClientMsgId".equalsIgnoreCase(string)) {
                    z35 = z;
                    z34 = z2;
                    z29 = z3;
                    z28 = z4;
                    z27 = z5;
                    z26 = z6;
                    z19 = z8;
                    z18 = z9;
                    z17 = z15;
                    z25 = true;
                } else if ("bizChatId".equalsIgnoreCase(string)) {
                    z35 = z;
                    z34 = z2;
                    z29 = z3;
                    z28 = z4;
                    z27 = z5;
                    z25 = z7;
                    z19 = z8;
                    z18 = z9;
                    z17 = z15;
                    z26 = true;
                } else if ("bizChatUserId".equalsIgnoreCase(string)) {
                    z35 = z;
                    z34 = z2;
                    z29 = z3;
                    z28 = z4;
                    z26 = z6;
                    z25 = z7;
                    z19 = z8;
                    z18 = z9;
                    z17 = z15;
                    z27 = true;
                } else if ("msgSeq".equalsIgnoreCase(string)) {
                    z35 = z;
                    z34 = z2;
                    z29 = z3;
                    z27 = z5;
                    z26 = z6;
                    z25 = z7;
                    z19 = z8;
                    z18 = z9;
                    z17 = z15;
                    z28 = true;
                } else if ("flag".equalsIgnoreCase(string)) {
                    z35 = z;
                    z34 = z2;
                    z28 = z4;
                    z27 = z5;
                    z26 = z6;
                    z25 = z7;
                    z19 = z8;
                    z18 = z9;
                    z17 = z15;
                    z29 = true;
                } else if ("solitaireFoldInfo".equalsIgnoreCase(string)) {
                    z35 = z;
                    z29 = z3;
                    z28 = z4;
                    z27 = z5;
                    z26 = z6;
                    z25 = z7;
                    z19 = z8;
                    z18 = z9;
                    z17 = z15;
                    z34 = true;
                } else if ("historyId".equalsIgnoreCase(string)) {
                    z34 = z2;
                    z29 = z3;
                    z28 = z4;
                    z27 = z5;
                    z26 = z6;
                    z25 = z7;
                    z19 = z8;
                    z18 = z9;
                    z17 = z15;
                    z35 = true;
                } else {
                    z35 = z;
                    z34 = z2;
                    z29 = z3;
                    z28 = z4;
                    z27 = z5;
                    z26 = z6;
                    z25 = z7;
                    z19 = z8;
                    z18 = z9;
                    z17 = z15;
                }
                String str4 = str;
            } else {
                String str5 = str;
                z35 = z;
                z34 = z2;
                z29 = z3;
                z28 = z4;
                z27 = z5;
                z26 = z6;
                z25 = z7;
                z19 = z8;
                z18 = z9;
                z17 = z15;
            }
        }
        rawQuery.close();
        String str6 = "lvbuffer";
        long beginTransaction = fVar2.beginTransaction(Thread.currentThread().getId());
        if (!z16) {
            StringBuilder sb = new StringBuilder();
            sb.append("Alter table ");
            str3 = str;
            String str7 = str6;
            str2 = "historyId";
            sb.append(str3);
            sb.append(" add ");
            sb.append(str7);
            sb.append(" BLOB ");
            fVar2.execSQL(str3, sb.toString());
        } else {
            str3 = str;
            str2 = "historyId";
        }
        if (!z15) {
            fVar2.execSQL(str3, "Alter table " + str3 + " add " + "transContent" + " TEXT ");
        }
        if (!z9) {
            fVar2.execSQL(str3, "Alter table " + str3 + " add " + "transBrandWording" + " TEXT ");
        }
        if (!z8) {
            fVar2.execSQL(str3, "Alter table " + str3 + " add " + "talkerId" + " INTEGER ");
        }
        if (!z7) {
            fVar2.execSQL(str3, "Alter table " + str3 + " add " + "bizClientMsgId" + " TEXT ");
        }
        if (!z6) {
            fVar2.execSQL(str3, "Alter table " + str3 + " add " + "bizChatId" + " INTEGER DEFAULT -1");
        }
        if (!z5) {
            fVar2.execSQL(str3, "Alter table " + str3 + " add " + "bizChatUserId" + " TEXT ");
        }
        if (!z4) {
            fVar2.execSQL(str3, "Alter table " + str3 + " add " + "msgSeq" + " INTEGER ");
        }
        if (!z3) {
            fVar2.execSQL(str3, "Alter table " + str3 + " add " + "flag" + " INT DEFAULT 0 ");
        }
        if (!z2) {
            fVar2.execSQL(str3, "Alter table " + str3 + " add " + "solitaireFoldInfo" + " BLOB ");
        }
        if (!z) {
            fVar2.execSQL(str3, "Alter table " + str3 + " add " + str2 + " TEXT ");
        }
        fVar2.endTransaction(beginTransaction);
    }

    public C72963f4 v10(String str, long j) {
        C72963f4 f4Var = new C72963f4();
        Cursor query = this.f212775p.query(hy0(str), (String[]) null, iy0(str) + " AND " + "msgSeq" + "=?", new String[]{"" + j}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            f4Var.convertFrom(query);
        }
        query.close();
        return f4Var;
    }

    /* renamed from: vP */
    public int mo101146vP() {
        Log.m105918d("MicroMsg.MsgInfoStorage", "get count sql: SELECT COUNT(msgId) FROM message");
        Cursor rawQuery = this.f212775p.rawQuery("SELECT COUNT(msgId) FROM message", (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105928w("MicroMsg.MsgInfoStorage", "get count error, cursor is null");
            return 0;
        } else if (rawQuery.moveToFirst()) {
            int i = rawQuery.getInt(0);
            Log.m105919d("MicroMsg.MsgInfoStorage", "result getAllMsgCount count %d", Integer.valueOf(i));
            rawQuery.close();
            return i;
        } else {
            rawQuery.close();
            return 0;
        }
    }

    public Cursor vx0(String str, long j, int i) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        return this.f212775p.rawQuery("select * from " + hy0(str) + " where" + iy0(str) + " AND " + "type IN (3,39,13)" + " AND " + "createTime" + " < " + j + " order by " + "createTime" + " DESC limit " + i, (String[]) null, 2);
    }

    public Cursor wt0(String str, int i) {
        C91753f fVar = this.f212775p;
        String hy02 = hy0(str);
        return fVar.query(hy02, (String[]) null, "isSend=? AND" + iy0(str) + "AND " + "status" + "!=?  order by " + "msgId" + " DESC limit " + i, new String[]{"0", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL}, (String) null, (String) null, (String) null);
    }

    public int wx0(String str) {
        int i = 0;
        if (str == null) {
            Log.m105928w("MicroMsg.MsgInfoStorage", "getImgVideoMsgCount talker is null!");
            return 0;
        }
        Cursor rawQuery = this.f212775p.rawQuery("SELECT COUNT(*) FROM " + hy0(str) + " WHERE " + mo101130mL(str) + "talker" + "= '" + Util.escapeSqlValue(str) + "' AND " + "type IN (3,39,13,43,62,44,268435505,486539313,1124073521)", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    public void wy0(String str) {
        if (this.f212765G) {
            synchronized (this.f212764F) {
                mo101122j(str);
            }
            return;
        }
        mo101122j(str);
    }

    public Cursor xs0(String str, int i, long j) {
        return this.f212775p.rawQuery("SELECT * FROM " + hy0(str) + " WHERE" + iy0(str) + " AND " + "createTime" + " <= " + j + " order by " + "createTime" + " ASC limit " + i, (String[]) null);
    }

    public String xx0(String str) {
        return (str == null || !str.equals(StateEvent.Name.MESSAGE)) ? "" : "INDEXED BY messageCreateTaklerTypeTimeIndex";
    }

    public void xy0(long j, C72963f4 f4Var) {
        if (f4Var.mo100992d4()) {
            String by02 = by0(f4Var.f230724G);
            if (C72996z1.m85839j5(by02)) {
                Log.m105919d("MicroMsg.MsgInfoStorage", "msgCluster = %s", by02);
                f4Var.mo108749c3("notifymessage");
            }
        }
        if (f4Var.getType() == 1075839025) {
            f4Var.mo108749c3("notifymessage");
        }
        vy0(f4Var);
        C91753f fVar = this.f212775p;
        String gy02 = gy0(j);
        ContentValues convertTo = f4Var.convertTo();
        if (fVar.update(gy02, convertTo, "msgId=?", new String[]{"" + j}) != 0) {
            doNotify();
            mo101123jo(new C75875l.C45886e(f4Var.mo108768t(), "update", f4Var, 0));
            return;
        }
        C117407d.INSTANCE.idkeyStat(111, 244, 1, false);
    }

    public long yu0(String str) {
        String str2 = "select createTime from message where" + iy0(str) + "order by " + "createTime" + " LIMIT 1 OFFSET 0";
        Log.m105918d("MicroMsg.MsgInfoStorage", "get first message create time: " + str2);
        Cursor rawQuery = this.f212775p.rawQuery(str2, (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.MsgInfoStorage", "get first message create time failed: " + str);
            return -1;
        } else if (rawQuery.moveToFirst()) {
            long j = rawQuery.getLong(0);
            rawQuery.close();
            return j;
        } else {
            rawQuery.close();
            return -1;
        }
    }

    public int yx0(String str) {
        int i = 0;
        if (str == null) {
            Log.m105928w("MicroMsg.MsgInfoStorage", "getImgVideoMsgCount talker is null!");
            return 0;
        }
        Cursor rawQuery = this.f212775p.rawQuery("SELECT COUNT(*) FROM " + hy0(str) + " WHERE " + mo101130mL(str) + "talker" + "= '" + Util.escapeSqlValue(str) + "' AND " + "type IN (3,39,13,43,62,44,268435505,486539313)", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    public void yy0(long j, C72963f4 f4Var) {
        Assert.assertTrue("no talker set when update by svrid", Util.nullAsNil(f4Var.mo108768t()).length() > 0);
        if (f4Var.mo100992d4()) {
            String by02 = by0(f4Var.mo108773x2());
            if (C72996z1.m85839j5(by02)) {
                Log.m105919d("MicroMsg.MsgInfoStorage", "msgCluster = %s", by02);
                f4Var.mo108749c3("notifymessage");
            }
        }
        if (f4Var.getType() == 1075839025) {
            f4Var.mo108749c3("notifymessage");
        }
        vy0(f4Var);
        if (j == 0) {
            Log.m105929w("MicroMsg.MsgInfoStorage", "invalid svr id %d", Long.valueOf(j));
            return;
        }
        C91753f fVar = this.f212775p;
        String hy02 = hy0(f4Var.mo108768t());
        ContentValues convertTo = f4Var.convertTo();
        if (fVar.update(hy02, convertTo, "msgSvrId=?", new String[]{"" + j}) != 0) {
            doNotify();
            mo101123jo(new C75875l.C45886e(f4Var.mo108768t(), "update", f4Var));
            return;
        }
        C117407d.INSTANCE.idkeyStat(111, 243, 1, false);
    }

    public Cursor zs0(String str) {
        C91753f fVar = this.f212775p;
        String hy02 = hy0(str);
        return fVar.query(hy02, (String[]) null, "isSend=? AND" + iy0(str) + "AND " + "status" + "!=?", new String[]{"0", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL}, (String) null, (String) null, (String) null);
    }

    public Cursor zx0(String str, int i, long j) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM ( SELECT * FROM ");
        sb.append(hy0(str));
        sb.append(" WHERE");
        sb.append(iy0(str));
        if (j > 0) {
            str2 = " AND createTime > " + j;
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(" ORDER BY ");
        sb.append("createTime");
        sb.append(" DESC LIMIT ");
        sb.append(i);
        sb.append(") ORDER BY ");
        sb.append("createTime");
        sb.append(" ASC");
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.MsgInfoStorage", "getInitCursor1 getCursor talk:%s limitCount:%d [%s]", str, Integer.valueOf(i), sb4);
        return this.f212775p.rawQuery(sb4, (String[]) null);
    }

    public void zy0() {
        for (int i = 0; i < ((LinkedList) this.f212769g).size(); i++) {
            Ay0((C75875l.C75878d) ((LinkedList) this.f212769g).get(i));
        }
    }
}
