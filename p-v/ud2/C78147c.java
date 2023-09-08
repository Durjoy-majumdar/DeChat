package ud2;

import android.content.Context;
import android.os.Looper;
import android.text.SpannableString;
import android.util.Pair;
import android.widget.TextView;
import bp3.C67301m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.PatSuccessEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SendPatActionReportStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.base.span.BoldForegroundColorSpan;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45612m0;
import eb0.C45626r0;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p1081gi.C98121d;
import p629ny.C76979h;
import p773yy.C79168k;
import p910lj.C76701a;
import qy2.C63347a;
import su0.C13781a;
import te3.C49637h04;
import te3.C64382g04;
import te3.C64418hb3;
import te3.C64464jb3;
import te3.C77946ib3;
import vd2.C78383a;
import vd2.C78384d;
import vd2.C78389h;
import xd2.C66246b;
import xd2.C78800c;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ud2.c */
public class C78147c extends C86301e implements C78384d, C11385n {

    /* renamed from: g */
    public static final int f228994g;

    /* renamed from: h */
    public static Map<String, Long> f228995h = new HashMap();

    /* renamed from: i */
    public static final int f228996i;

    /* renamed from: j */
    public static final int f228997j;

    /* renamed from: d */
    public Set<Long> f228998d = new HashSet();

    /* renamed from: e */
    public C78800c f228999e;

    /* renamed from: f */
    public MMHandler f229000f = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C78148a());

    /* renamed from: ud2.c$b */
    public class C14178b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f39625d;

        public C14178b(C78147c cVar, String str) {
            this.f39625d = str;
        }

        public void run() {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108732L2(MMApplicationContext.getContext().getString(C0966R.string.ile));
            f4Var.setType(10000);
            f4Var.mo108740T2(0);
            f4Var.mo108749c3(this.f39625d);
            f4Var.mo108733M2(System.currentTimeMillis());
            Log.m105925i("MicroMsg.PatMsgExtension", "insert pat failed msg %d", Long.valueOf(C75604z3.m90852x(f4Var)));
        }
    }

    /* renamed from: ud2.c$c */
    public class C37416c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C64418hb3 f98910d;

        public C37416c(C78147c cVar, C64418hb3 hb32) {
            this.f98910d = hb32;
        }

        public void run() {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108732L2(MMApplicationContext.getContext().getString(C0966R.string.i4m));
            f4Var.setType(10000);
            f4Var.mo108740T2(0);
            f4Var.mo108749c3(this.f98910d.f183463d);
            f4Var.mo108733M2(System.currentTimeMillis());
            C75604z3.m90852x(f4Var);
        }
    }

    /* renamed from: ud2.c$a */
    public class C78148a implements MMHandler.Callback {
        public C78148a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x008f, code lost:
            r8 = bp3.C67301m.m79639d(r8.getContent());
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r15) {
            /*
                r14 = this;
                int r0 = r15.what
                r1 = 0
                r2 = 291(0x123, float:4.08E-43)
                if (r0 != r2) goto L_0x0149
                java.lang.Object r15 = r15.obj
                xd2.c r15 = (xd2.C78800c) r15
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                android.util.Pair<java.lang.Long, java.lang.Long> r2 = r15.f230565e
                java.lang.Object r3 = r2.first
                r0[r1] = r3
                java.lang.Object r2 = r2.second
                r3 = 1
                r0[r3] = r2
                int r2 = r15.f230562b
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 2
                r0[r4] = r2
                java.lang.String r2 = r15.f230563c
                r5 = 3
                r0[r5] = r2
                r2 = 4
                java.lang.String r6 = r15.f230564d
                r0[r2] = r6
                java.lang.String r2 = "MicroMsg.PatMsgExtension"
                java.lang.String r6 = "send pat msg, msgId:%d, createTime:%d scene:%d, talker:%s, patUser:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r0)
                ud2.c r0 = ud2.C78147c.this
                int r6 = r15.f230562b
                android.util.Pair<java.lang.Long, java.lang.Long> r7 = r15.f230565e
                boolean r15 = r15.f230566f
                r0.getClass()
                java.lang.Object[] r8 = new java.lang.Object[r5]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
                r8[r1] = r9
                java.lang.Object r9 = r7.first
                r8[r3] = r9
                java.lang.Object r9 = r7.second
                r8[r4] = r9
                java.lang.String r9 = "send pat, scene %d, msg (%d,%d)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r8)
                java.lang.Class<ud2.h> r8 = ud2.C78150h.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                ud2.h r8 = (ud2.C78150h) r8
                boolean r8 = r8.isPatEnable()
                if (r8 != 0) goto L_0x0065
                goto L_0x0149
            L_0x0065:
                java.lang.Class<f62.k0> r8 = f62.C75700k0.class
                k40.a r8 = f40.C86709a0.m107533q(r8)
                f62.k0 r8 = (f62.C75700k0) r8
                g62.l r8 = r8.mo96095LE()
                java.lang.Object r9 = r7.first
                java.lang.Long r9 = (java.lang.Long) r9
                long r9 = r9.longValue()
                com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
                com.tencent.mm.storage.f4 r8 = r8.b00(r9)
                long r9 = r8.getMsgId()
                java.lang.Object r11 = r7.first
                java.lang.Long r11 = (java.lang.Long) r11
                long r11 = r11.longValue()
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 != 0) goto L_0x0149
                java.lang.String r8 = r8.getContent()
                te3.hb3 r8 = bp3.C67301m.m79639d(r8)
                java.lang.Object r9 = r7.second
                java.lang.Long r9 = (java.lang.Long) r9
                long r9 = r9.longValue()
                te3.ib3 r9 = r0.dx0(r8, r9)
                if (r9 == 0) goto L_0x0149
                java.lang.String r10 = r8.f183463d
                java.lang.String r11 = r9.f227608e
                boolean r10 = r0.mo108127cu(r6, r10, r11)
                if (r10 != 0) goto L_0x00c6
                java.lang.Object[] r15 = new java.lang.Object[r5]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                r15[r1] = r0
                java.lang.String r0 = r8.f183463d
                r15[r3] = r0
                java.lang.String r0 = r9.f227608e
                r15[r4] = r0
                java.lang.String r0 = "cannot pat, scene %d, talker %s, patUser %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r15)
                goto L_0x0149
            L_0x00c6:
                com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct
                r2.<init>()
                r2.f194361d = r6
                java.lang.String r4 = r8.f183463d
                boolean r4 = com.tencent.p014mm.storage.C72996z1.m85807K5(r4)
                if (r4 == 0) goto L_0x00df
                java.lang.String r4 = r8.f183463d
                java.lang.String r5 = "ChatroomName"
                java.lang.String r4 = r2.mo86045b(r5, r4, r3)
                r2.f194365h = r4
            L_0x00df:
                java.lang.Object r4 = r7.second
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                java.lang.Class<vd2.d> r6 = vd2.C78384d.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                vd2.d r6 = (vd2.C78384d) r6
                java.lang.String r10 = r8.f183463d
                long r10 = r6.mo108126bL(r10, r7)
                long r4 = r4 - r10
                r2.f194367j = r4
                java.lang.String r4 = r8.f183463d
                boolean r4 = r0.zx0(r4, r7)
                r2.f194369l = r4
                java.lang.Object r4 = r7.second
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                int r0 = r0.B70(r8, r4)
                int r0 = r0 + r3
                r2.f194370m = r0
                java.lang.String r0 = r9.f227607d
                java.lang.String r4 = "Username"
                java.lang.String r0 = r2.mo86045b(r4, r0, r3)
                r2.f194363f = r0
                java.lang.String r0 = r9.f227608e
                java.lang.String r4 = "PattedUserName"
                java.lang.String r0 = r2.mo86045b(r4, r0, r3)
                r2.f194364g = r0
                long r4 = r9.f227610g
                r2.f194362e = r4
                java.lang.String r0 = r9.f227608e
                java.lang.String r0 = ud2.C14180f.m13511a(r0)
                java.lang.String r4 = "PatSuffix"
                java.lang.String r0 = r2.mo86045b(r4, r0, r3)
                r2.f194371n = r0
                r2.f194374q = r15
                xd2.b r15 = new xd2.b
                java.lang.String r0 = r8.f183463d
                java.lang.String r3 = r9.f227608e
                r15.<init>(r7, r0, r3, r1)
                r15.f190303g = r2
                ob0.b0 r0 = f40.C86709a0.m107524d()
                r0.mo123460f(r15)
            L_0x0149:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ud2.C78147c.C78148a.handleMessage(android.os.Message):boolean");
        }
    }

    static {
        Class cls = C32735h.class;
        f228994g = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_send_pat_frequency_limit_interval, 10000);
        f228996i = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_pat_send_pat_msg_delay_interval, 5000);
        f228997j = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_pat_avatar_revoke_pat_msg_interval, 10000);
    }

    public static void vx0(SendPatActionReportStruct sendPatActionReportStruct) {
        Class cls = C79168k.class;
        if (sendPatActionReportStruct != null) {
            String str = sendPatActionReportStruct.f194363f;
            String str2 = sendPatActionReportStruct.f194364g;
            sendPatActionReportStruct.f194375r = sendPatActionReportStruct.mo86045b("FromStatusID", ((C79168k) C86312j.m106911c(cls)).mo74127if(str), true);
            sendPatActionReportStruct.f194376s = sendPatActionReportStruct.mo86045b("ToStatusID", ((C79168k) C86312j.m106911c(cls)).mo74127if(str2), true);
            sendPatActionReportStruct.f194377t = sendPatActionReportStruct.mo86045b("FromStatusIcon", ((C79168k) C86312j.m106911c(cls)).mo74131o6(str), true);
            sendPatActionReportStruct.f194378u = sendPatActionReportStruct.mo86045b("ToStatusIcon", ((C79168k) C86312j.m106911c(cls)).mo74131o6(str2), true);
        }
    }

    public int B70(C64418hb3 hb32, long j) {
        int i = -1;
        for (int i2 = 0; i2 < hb32.f183464e.size(); i2++) {
            if (hb32.f183464e.get(i2).f227610g == j) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: FY */
    public boolean mo108119FY(Pair<Long, Long> pair) {
        C78800c cVar;
        Pair<Long, Long> pair2;
        if (((C78150h) C86312j.m106911c(C78150h.class)).zx0() && (cVar = this.f228999e) != null && (pair2 = cVar.f230565e) != null && pair2.equals(pair)) {
            long currentTimeMillis = System.currentTimeMillis();
            C78800c cVar2 = this.f228999e;
            if (((int) (currentTimeMillis - cVar2.f230561a)) < f228997j) {
                Pair<Long, Long> pair3 = cVar2.f230565e;
                C78800c cVar3 = this.f228999e;
                Log.m105925i("MicroMsg.PatMsgExtension", "try revoke last pat, msgId:%d, createTime:%d, scene:%d, talker:%s, patUser:%s", pair3.first, pair3.second, Integer.valueOf(cVar2.f230562b), cVar3.f230563c, cVar3.f230564d);
                C77946ib3 dx02 = dx0(C67301m.m79639d(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(((Long) this.f228999e.f230565e.first).longValue()).getContent()), ((Long) pair.second).longValue());
                if (dx02 != null) {
                    return this.f228999e.f230564d.equalsIgnoreCase(dx02.f227608e);
                }
            }
        }
        return false;
    }

    public String H10(C64418hb3 hb32) {
        C68070l.C68072b bVar = new C68070l.C68072b();
        C78383a aVar = new C78383a();
        aVar.f229698b = hb32;
        bVar.mo93545f(aVar);
        bVar.f195582i = 62;
        bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
        bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        return C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
    }

    public boolean Hd0(long j, long j2) {
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.PatMsgExtension", "delete svr pat msg (%d,%d)", Long.valueOf(j), Long.valueOf(j2));
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j);
        if (b002.getMsgId() == j && j2 != 0) {
            C64418hb3 d = C67301m.m79639d(b002.getContent());
            Log.m105925i("MicroMsg.PatMsgExtension", "pat record list size %d", Integer.valueOf(d.f183464e.size()));
            C77946ib3 ib32 = null;
            Iterator<C77946ib3> it = d.f183464e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C77946ib3 next = it.next();
                if (next.f227612i == j2) {
                    ib32 = next;
                    break;
                }
            }
            if (ib32 != null) {
                d.f183464e.remove(ib32);
                if (d.f183464e.isEmpty()) {
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101125kD(j);
                } else {
                    b002.mo108732L2(H10(d));
                    b002.setType(922746929);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(j, b002);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: NC */
    public void mo108122NC(String str, long j) {
        Log.m105925i("MicroMsg.PatMsgExtension", "do revoke svr pat msg %d from talker %s", Long.valueOf(j), str);
        C64464jb3 yx02 = ((C78150h) C86312j.m106911c(C78150h.class)).yx0(j);
        if (yx02 != null) {
            long j2 = yx02.f183777d;
            C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(str, j2);
            if (h302.mo108774y2() == j2) {
                Log.m105925i("MicroMsg.PatMsgExtension", "revoke pat msg %d,%d", Long.valueOf(h302.getMsgId()), Long.valueOf(j));
                Hd0(h302.getMsgId(), j);
            }
        }
    }

    /* renamed from: RC */
    public List<C72963f4> mo108123RC(long j) {
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        if (b002.getType() != 922746929) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C64418hb3 d = C67301m.m79639d(b002.getContent());
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(j);
        LinkedList<C77946ib3> linkedList = d.f183464e;
        objArr[1] = Integer.valueOf(linkedList == null ? 0 : linkedList.size());
        Log.m105925i("MicroMsg.PatMsgExtension", "split pat msg [%d] to %d child msg", objArr);
        Iterator<C77946ib3> it = d.f183464e.iterator();
        while (it.hasNext()) {
            C77946ib3 next = it.next();
            C72963f4 f4Var = new C72963f4();
            C64418hb3 hb32 = new C64418hb3();
            hb32.f183463d = d.f183463d;
            C67301m.C67302a aVar = new C67301m.C67302a();
            aVar.f227609f = next.f227609f;
            aVar.f193143o = next.f227609f;
            aVar.f227610g = next.f227610g;
            aVar.f227607d = next.f227607d;
            aVar.f227608e = next.f227608e;
            aVar.f227612i = next.f227612i;
            hb32.f183464e.add(aVar);
            C68070l.C68072b bVar = new C68070l.C68072b();
            C78383a aVar2 = new C78383a();
            aVar2.f229698b = hb32;
            bVar.mo93545f(aVar2);
            bVar.f195582i = 62;
            bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
            bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
            f4Var.mo108732L2(C68070l.C68072b.m80420s(bVar, "", (C98121d) null));
            f4Var.setType(922746929);
            f4Var.mo108740T2(0);
            f4Var.mo108749c3(b002.mo108768t());
            f4Var.mo108745Y2(next.f227612i);
            f4Var.mo108733M2(next.f227610g);
            arrayList.add(f4Var);
        }
        return arrayList;
    }

    public boolean Xo0(long j) {
        if (((HashSet) this.f228998d).contains(Long.valueOf(j))) {
            return true;
        }
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        if (b002.getMsgId() > 0) {
            Iterator<C77946ib3> it = C67301m.m79639d(b002.getContent()).f183464e.iterator();
            boolean z = true;
            while (it.hasNext()) {
                z &= it.next().f227611h == 1;
            }
            if (z) {
                ((HashSet) this.f228998d).add(Long.valueOf(j));
                return true;
            }
        }
        return false;
    }

    /* renamed from: bB */
    public C64418hb3 mo108125bB(String str) {
        return C67301m.m79639d(str);
    }

    /* renamed from: bL */
    public long mo108126bL(String str, Pair<Long, Long> pair) {
        ArrayList arrayList = (ArrayList) ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101132nP(str, ((Long) pair.second).longValue(), 1);
        if (!arrayList.isEmpty() && ((C72963f4) arrayList.get(0)).getMsgId() > 0) {
            if (((C72963f4) arrayList.get(0)).getType() != 922746929) {
                return ((C72963f4) arrayList.get(0)).getCreateTime();
            }
            C64418hb3 d = C67301m.m79639d(((C72963f4) arrayList.get(0)).getContent());
            if (d.f183464e.size() == 0) {
                return 0;
            }
            if (((Long) pair.first).longValue() != ((C72963f4) arrayList.get(0)).getMsgId()) {
                return d.f183464e.getLast().f227610g;
            }
            int B70 = B70(d, ((Long) pair.second).longValue());
            if (B70 > 1) {
                return d.f183464e.get(B70 - 1).f227610g;
            }
        }
        return 0;
    }

    /* renamed from: cu */
    public boolean mo108127cu(int i, String str, String str2) {
        List<String> l;
        if ((!C72996z1.m85807K5(str) && !C72996z1.m85818T5(str)) || C72996z1.m85855z5(str) || C45628s0.m50751P(str) || C72996z1.m85816S4(str) || C45628s0.m50738C(str)) {
            Log.m105925i("MicroMsg.PatMsgExtension", "cannot pat, talker %s", str);
            return false;
        } else if (!C72996z1.m85818T5(str2) || C72996z1.m85855z5(str2) || C45628s0.m50751P(str2) || C72996z1.m85816S4(str2) || C45628s0.m50738C(str2)) {
            Log.m105925i("MicroMsg.PatMsgExtension", "cannot pat, user %s", str2);
            return false;
        } else if (!C72996z1.m85807K5(str) || (l = C45612m0.m50695l(str)) == null || ((LinkedList) l).contains(str2)) {
            return true;
        } else {
            Log.m105929w("MicroMsg.PatMsgExtension", "chatroom %s members %s, not contain %s", str, l, str2);
            return false;
        }
    }

    public C77946ib3 dx0(C64418hb3 hb32, long j) {
        Iterator<C77946ib3> it = hb32.f183464e.iterator();
        while (it.hasNext()) {
            C77946ib3 next = it.next();
            if (next.f227610g == j) {
                return next;
            }
        }
        return null;
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C86709a0.m107524d().mo123455a(849, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C64418hb3 d;
        C77946ib3 dx02;
        C64418hb3 d2;
        C77946ib3 dx03;
        int i3 = i;
        int i4 = i2;
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.PatMsgExtension", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C66246b bVar = (C66246b) yVar;
        SendPatActionReportStruct sendPatActionReportStruct = bVar.f190303g;
        if (sendPatActionReportStruct != null) {
            sendPatActionReportStruct.f194366i = i4;
        }
        int i5 = ((C64382g04) bVar.f190300d.f127055a.f127080a).f183270h;
        Log.m105925i("MicroMsg.PatMsgExtension", "onSceneEnd, pat scene %d", Integer.valueOf(i5));
        if (i3 == 0 && i4 == 0) {
            Pair<Long, Long> pair = bVar.f190302f;
            C47350c cVar = bVar.f190300d;
            String str2 = ((C64382g04) cVar.f127055a.f127080a).f183268f;
            if (i5 == 1) {
                String nullAsNil = Util.nullAsNil(((C49637h04) cVar.f127056b.f127083a).f134393e);
                if (!Util.isNullOrNil(str2)) {
                    try {
                        C14180f.m13514d(str2, "pat_user_suffix_content", nullAsNil);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.PatUserMMKV", e, "", new Object[0]);
                    }
                    if (((Long) pair.first).longValue() > 0) {
                        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(((Long) pair.first).longValue());
                        if (b002.getMsgId() == ((Long) pair.first).longValue() && (dx03 = dx0(d2, ((Long) pair.second).longValue())) != null) {
                            if (str2.equalsIgnoreCase(dx03.f227608e)) {
                                dx03.f227609f = xx0(str2, ((C64382g04) bVar.f190300d.f127055a.f127080a).f183267e);
                                b002.mo108732L2(H10((d2 = C67301m.m79639d(b002.getContent()))));
                                b002.setType(922746929);
                                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(((Long) pair.first).longValue(), b002);
                                Log.m105925i("MicroMsg.PatMsgExtension", "update pat msg suffix %d, createTime %d", pair.first, pair.second);
                            } else {
                                Log.m105929w("MicroMsg.PatMsgExtension", "update pat msg suffix %d, pattedUser (%s,%s) not match", pair.first, str2, dx03.f227608e);
                            }
                        }
                        if (!Util.isNullOrNil(nullAsNil) && Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC, (Object) null))) {
                            C85801v1 i6 = C86709a0.m107535s().mo121142i();
                            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_PAT_SUFFIX_INTRO_BOOLEAN_SYNC;
                            if (i6.mo119686g(aVar, true)) {
                                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
                                String t = b002.mo108768t();
                                String format = String.format(MMApplicationContext.getContext().getResources().getString(C0966R.string.hgg), new Object[]{"<_wc_custom_link_ href='weixin://jump/setpat/'>", "</_wc_custom_link_>"});
                                C72963f4 f4Var = new C72963f4();
                                f4Var.mo108740T2(0);
                                f4Var.mo108749c3(t);
                                f4Var.mo100991d(3);
                                f4Var.mo108732L2(format);
                                f4Var.mo108733M2(C75604z3.m90841m(t, System.currentTimeMillis() / 1000));
                                f4Var.setType(10000);
                                f4Var.mo108735O2(f4Var.mo108762o2());
                                C75604z3.m90852x(f4Var);
                                C78800c cVar2 = this.f228999e;
                                if (cVar2 != null) {
                                    cVar2.f230566f = true;
                                }
                            }
                        }
                    }
                    PatSuccessEvent patSuccessEvent = new PatSuccessEvent();
                    PatSuccessEvent.C67751a aVar2 = patSuccessEvent.f193803d;
                    aVar2.f193804a = str2;
                    aVar2.f193805b = nullAsNil;
                    aVar2.f193806c = i5;
                    patSuccessEvent.publish();
                }
            } else {
                Map<String, String> parseXml = XmlParser.parseXml(((C49637h04) cVar.f127056b.f127083a).f134392d, "sysmsg", (String) null);
                C14180f.m13513c(str2, parseXml != null ? Util.safeParseInt(parseXml.get(".sysmsg.pat.patsuffixversion")) : 0);
                long j = ((C49637h04) bVar.f190300d.f127056b.f127083a).f134394f;
                if (j != 0 && ((Long) pair.first).longValue() > 0) {
                    C72963f4 b003 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(((Long) pair.first).longValue());
                    Log.m105925i("MicroMsg.PatMsgExtension", "update pat msg %d, svrId %d", pair.first, Long.valueOf(j));
                    if (b003.getMsgId() == ((Long) pair.first).longValue() && (dx02 = dx0(d, ((Long) pair.second).longValue())) != null) {
                        if (str2.equalsIgnoreCase(dx02.f227608e)) {
                            dx02.f227612i = j;
                            if (b003.mo108774y2() == 0) {
                                b003.mo108745Y2(j);
                            }
                            b003.mo108732L2(H10((d = C67301m.m79639d(b003.getContent()))));
                            b003.setType(922746929);
                            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(((Long) pair.first).longValue(), b003);
                            Log.m105925i("MicroMsg.PatMsgExtension", "update pat msg svrId %d, createTime %d", pair.first, pair.second);
                        } else {
                            Log.m105929w("MicroMsg.PatMsgExtension", "update pat msg svrId %d, pattedUser (%s,%s) not match", pair.first, str2, dx02.f227608e);
                        }
                    }
                }
            }
        } else if (i5 != 1) {
            Context context = MMApplicationContext.getContext();
            C76701a.makeText(context, (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.f7966xq) + "(" + i3 + "," + i4 + ")", 0).show();
            String str3 = ((C64382g04) bVar.f190300d.f127055a.f127080a).f183267e;
            if (!(i4 == -22 || i4 == -44)) {
                ((C119157j) C119157j.f356862d).mo183875f(new C14178b(this, str3));
            }
        } else {
            return;
        }
        if (sendPatActionReportStruct != null) {
            vx0(sendPatActionReportStruct);
            sendPatActionReportStruct.mo86054n();
            sendPatActionReportStruct.mo86056r();
        }
    }

    /* renamed from: p9 */
    public C78384d.C78385a mo108129p9(String str, String str2) {
        Class cls = C79168k.class;
        C78384d.C78385a aVar = new C78384d.C78385a();
        aVar.f229699a = ((C79168k) C86312j.m106911c(cls)).mo74127if(str);
        aVar.f229700b = ((C79168k) C86312j.m106911c(cls)).mo74131o6(str);
        aVar.f229701c = ((C79168k) C86312j.m106911c(cls)).mo74127if(str2);
        aVar.f229702d = ((C79168k) C86312j.m106911c(cls)).mo74131o6(str2);
        return aVar;
    }

    public String rd0(Pair<Long, Long> pair) {
        return C75592q0.m90789s() + "_" + pair.first + "_" + pair.second;
    }

    /* renamed from: re */
    public CharSequence mo108131re(String str, String str2, float f) {
        C78389h Ax0 = ((C78150h) C86312j.m106911c(C78150h.class)).Ax0(C13781a.m13082a(), str, xx0(str, str2).toString(), str2);
        SpannableString spannableString = new SpannableString(Ax0.f229703a);
        if (((LinkedList) Ax0.f229706d).size() > 0) {
            for (C78389h.C78390a next : Ax0.f229706d) {
                spannableString.setSpan(((C79168k) C86312j.m106911c(C79168k.class)).Ig0((TextView) null, next.f229709c, C63347a.C47892c.PATMSG_NO_BG, f), next.f229707a, next.f229708b, 17);
            }
        }
        return spannableString;
    }

    /* renamed from: v9 */
    public CharSequence mo108132v9(Context context, int i, String str, String str2, int i2) {
        C68070l.C68072b u;
        C64418hb3 hb32 = new C64418hb3();
        if (i == 889192497) {
            hb32 = ((C78384d) C86312j.m106911c(C78384d.class)).mo108125bB(str);
        } else if (i == 922746929 && (u = C68070l.C68072b.m80422u(str, (String) null)) != null) {
            hb32 = ((C78383a) u.mo93555w(C78383a.class)).f229698b;
        }
        try {
            if (hb32.f183464e.size() > 0) {
                C77946ib3 last = hb32.f183464e.getLast();
                C78389h Bx0 = ((C78150h) C86312j.m106911c(C78150h.class)).Bx0(last, str2);
                SpannableString spannableString = new SpannableString(Bx0.f229703a);
                if (((LinkedList) Bx0.f229706d).size() > 0) {
                    for (C78389h.C78390a next : Bx0.f229706d) {
                        spannableString.setSpan(((C79168k) C86312j.m106911c(C79168k.class)).Ig0((TextView) null, next.f229709c, C63347a.C47892c.PATMSG_NO_BG, (float) i2), next.f229707a, next.f229708b, 17);
                    }
                }
                String s = C75592q0.m90789s();
                if (!last.f227607d.equals(s) && last.f227608e.equals(s) && last.f227611h == 0 && !((ArrayList) Bx0.f229704b).isEmpty()) {
                    BoldForegroundColorSpan boldForegroundColorSpan = new BoldForegroundColorSpan(context.getResources().getColor(C0966R.color.FG_0));
                    String string = context.getString(C0966R.string.hgc);
                    int indexOf = Bx0.f229703a.indexOf(string, ((Integer) ((Pair) ((ArrayList) Bx0.f229704b).get(0)).second).intValue());
                    int length = string.length() + indexOf;
                    if (length > spannableString.length()) {
                        length = spannableString.length();
                    }
                    spannableString.setSpan(boldForegroundColorSpan, indexOf, length, 17);
                }
                return ((C76979h) C86312j.m106911c(C76979h.class)).Te0(context, spannableString, (float) i2);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PatMsgExtension", e, "", new Object[0]);
        }
        return "";
    }

    /* renamed from: vk */
    public Pair<Long, Long> mo108133vk(int i, String str, String str2) {
        C78800c cVar;
        int i2 = i;
        String str3 = str;
        String str4 = str2;
        Log.m105925i("MicroMsg.PatMsgExtension", "preSend pat, scene %d, talker %s, user %s", Integer.valueOf(i), str3, str4);
        long c = C31543z5.m39453c();
        if (!((C78150h) C86312j.m106911c(C78150h.class)).isPatEnable()) {
            return null;
        }
        if (!mo108127cu(i, str, str2)) {
            Log.m105929w("MicroMsg.PatMsgExtension", "cannot pat, scene %d, talker %s, user %s", Integer.valueOf(i), str3, str4);
            return null;
        }
        String s = C75592q0.m90789s();
        SendPatActionReportStruct sendPatActionReportStruct = new SendPatActionReportStruct();
        sendPatActionReportStruct.f194361d = i2;
        if (C72996z1.m85807K5(str)) {
            sendPatActionReportStruct.f194365h = sendPatActionReportStruct.mo86045b("ChatroomName", str3, true);
        }
        sendPatActionReportStruct.f194363f = sendPatActionReportStruct.mo86045b("Username", s, true);
        sendPatActionReportStruct.f194364g = sendPatActionReportStruct.mo86045b("PattedUserName", str4, true);
        sendPatActionReportStruct.f194362e = c;
        sendPatActionReportStruct.f194371n = sendPatActionReportStruct.mo86045b("PatSuffix", C14180f.m13511a(str2), true);
        C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Ex0(str3);
        if (Ex0 != null && Ex0.getMsgId() > 0) {
            if (Ex0.getType() == 922746929) {
                C64418hb3 d = C67301m.m79639d(Ex0.getContent());
                if (d.f183464e.size() > 0) {
                    sendPatActionReportStruct.f194367j = c - d.f183464e.getLast().f227610g;
                }
            } else {
                sendPatActionReportStruct.f194367j = c - Ex0.getCreateTime();
            }
        }
        if (((HashMap) f228995h).containsKey(str4)) {
            int i3 = f228994g;
            if (c - ((Long) ((HashMap) f228995h).get(str4)).longValue() < ((long) i3)) {
                Log.m105929w("MicroMsg.PatMsgExtension", "pat (%s) last time from now < %d", str4, Integer.valueOf(i3));
                sendPatActionReportStruct.f194368k = 1;
                vx0(sendPatActionReportStruct);
                sendPatActionReportStruct.mo86054n();
                sendPatActionReportStruct.mo86056r();
                return null;
            }
            cVar = null;
        } else {
            cVar = null;
        }
        this.f228999e = cVar;
        ((HashMap) f228995h).put(str4, Long.valueOf(c));
        Pair<Long, Long> yx02 = yx0(str, s, str2, xx0(str4, str3), (int) (c / 1000), 0);
        if (((Long) yx02.first).longValue() > 0) {
            C86709a0.m107524d().mo123460f(new C66246b(yx02, str3, str4, 1));
            C78800c cVar2 = new C78800c();
            cVar2.f230562b = i2;
            cVar2.f230563c = str3;
            cVar2.f230564d = str4;
            cVar2.f230565e = yx02;
            MMHandler mMHandler = this.f229000f;
            mMHandler.sendMessageDelayed(mMHandler.obtainMessage(291, cVar2), (long) f228996i);
            this.f228999e = cVar2;
        }
        return yx02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0044, code lost:
        r5 = bp3.C67301m.m79639d(r5.getContent());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void wr0(android.util.Pair<java.lang.Long, java.lang.Long> r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Object r6 = r1.first
            r7 = 0
            r5[r7] = r6
            java.lang.Object r6 = r1.second
            r8 = 1
            r5[r8] = r6
            java.lang.String r6 = "MicroMsg.PatMsgExtension"
            java.lang.String r9 = "do revoke local pat msg (%d,%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r5)
            k40.a r5 = f40.C86709a0.m107533q(r3)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            java.lang.Object r9 = r1.first
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4 r5 = r5.b00(r9)
            long r9 = r5.getMsgId()
            java.lang.Object r11 = r1.first
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0279
            java.lang.String r5 = r5.getContent()
            te3.hb3 r5 = bp3.C67301m.m79639d(r5)
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            te3.ib3 r9 = r0.dx0(r5, r9)
            if (r9 == 0) goto L_0x0279
            long r10 = r9.f227612i
            r12 = 0
            java.lang.String r14 = "PatSuffix"
            java.lang.String r15 = "PattedUserName"
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 != 0) goto L_0x01c2
            xd2.c r9 = r0.f228999e
            if (r9 == 0) goto L_0x0279
            android.util.Pair<java.lang.Long, java.lang.Long> r9 = r9.f230565e
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0279
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.Object r10 = r1.first
            r9[r7] = r10
            java.lang.Object r10 = r1.second
            r9[r8] = r10
            java.lang.String r10 = "do revoke unsent pat msg (%d,%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r9)
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r0.f229000f
            r10 = 291(0x123, float:4.08E-43)
            xd2.c r11 = r0.f228999e
            r9.removeMessages(r10, r11)
            com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct r9 = new com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct
            r9.<init>()
            xd2.c r10 = r0.f228999e
            int r11 = r10.f230562b
            r9.f194361d = r11
            java.lang.String r10 = r10.f230563c
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85807K5(r10)
            if (r10 == 0) goto L_0x00a9
            xd2.c r10 = r0.f228999e
            java.lang.String r10 = r10.f230563c
            java.lang.String r11 = "ChatroomName"
            java.lang.String r10 = r9.mo86045b(r11, r10, r8)
            r9.f194365h = r10
        L_0x00a9:
            java.lang.Object r10 = r1.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            java.lang.Class<vd2.d> r12 = vd2.C78384d.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            vd2.d r12 = (vd2.C78384d) r12
            java.lang.String r13 = r5.f183463d
            long r12 = r12.mo108126bL(r13, r1)
            long r10 = r10 - r12
            r9.f194367j = r10
            xd2.c r10 = r0.f228999e
            java.lang.String r10 = r10.f230563c
            boolean r10 = r0.zx0(r10, r1)
            r9.f194369l = r10
            java.lang.Object r10 = r1.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            int r5 = r0.B70(r5, r10)
            int r5 = r5 + r8
            r9.f194370m = r5
            java.lang.String r5 = eb0.C75592q0.m90789s()
            java.lang.String r10 = "Username"
            java.lang.String r5 = r9.mo86045b(r10, r5, r8)
            r9.f194363f = r5
            xd2.c r5 = r0.f228999e
            java.lang.String r5 = r5.f230564d
            java.lang.String r5 = r9.mo86045b(r15, r5, r8)
            r9.f194364g = r5
            xd2.c r5 = r0.f228999e
            long r10 = r5.f230561a
            r9.f194362e = r10
            java.lang.String r5 = r5.f230564d
            java.lang.String r5 = ud2.C14180f.m13511a(r5)
            java.lang.String r5 = r9.mo86045b(r14, r5, r8)
            r9.f194371n = r5
            r9.f194372o = r8
            r9.f194373p = r2
            xd2.c r2 = r0.f228999e
            boolean r2 = r2.f230566f
            r9.f194374q = r2
            vx0(r9)
            r9.mo86054n()
            r9.mo86056r()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r4 = r1.first
            r2[r7] = r4
            java.lang.Object r4 = r1.second
            r2[r8] = r4
            java.lang.String r4 = "delete unsent pat msg (%d,%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r2)
            k40.a r2 = f40.C86709a0.m107533q(r3)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r4)
            long r4 = r2.getMsgId()
            java.lang.Object r9 = r1.first
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0279
            java.lang.String r4 = r2.getContent()
            te3.hb3 r4 = bp3.C67301m.m79639d(r4)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.util.LinkedList<te3.ib3> r8 = r4.f183464e
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r7] = r8
            java.lang.String r7 = "before delete, pat record list size %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            java.lang.Object r5 = r1.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            te3.ib3 r5 = r0.dx0(r4, r5)
            if (r5 == 0) goto L_0x0279
            java.util.LinkedList<te3.ib3> r6 = r4.f183464e
            r6.remove(r5)
            java.util.LinkedList<te3.ib3> r5 = r4.f183464e
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x019c
            k40.a r2 = f40.C86709a0.m107533q(r3)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            java.lang.Object r1 = r1.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            r2.mo101125kD(r3)
            goto L_0x0279
        L_0x019c:
            java.lang.String r4 = r0.H10(r4)
            r2.mo108732L2(r4)
            r4 = 922746929(0x37000031, float:7.629439E-6)
            r2.setType(r4)
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            java.lang.Object r1 = r1.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            r3.xy0(r4, r2)
            goto L_0x0279
        L_0x01c2:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Object r4 = r1.first
            r3[r7] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r3[r8] = r4
            java.lang.String r4 = "do revoke sent pat msg %d, svrId %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r3)
            xd2.a r3 = new xd2.a
            java.lang.String r17 = r25.rd0(r26)
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r18 = r4.longValue()
            long r6 = r9.f227612i
            long r10 = r9.f227610g
            java.lang.String r4 = r5.f183463d
            r16 = r3
            r20 = r6
            r22 = r10
            r24 = r4
            r16.<init>(r17, r18, r20, r22, r24)
            com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct
            r4.<init>()
            xd2.c r6 = r0.f228999e
            if (r6 == 0) goto L_0x0209
            android.util.Pair<java.lang.Long, java.lang.Long> r6 = r6.f230565e
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0209
            xd2.c r1 = r0.f228999e
            int r1 = r1.f230562b
            r4.f194344d = r1
        L_0x0209:
            long r6 = r9.f227610g
            r4.f194345e = r6
            long r6 = java.lang.System.currentTimeMillis()
            r4.f194346f = r6
            java.lang.String r1 = r9.f227607d
            java.lang.String r6 = "UserName"
            java.lang.String r1 = r4.mo86045b(r6, r1, r8)
            r4.f194347g = r1
            java.lang.String r1 = r9.f227608e
            java.lang.String r1 = r4.mo86045b(r15, r1, r8)
            r4.f194348h = r1
            java.lang.String r1 = r9.f227608e
            java.lang.String r1 = ud2.C14180f.m13511a(r1)
            java.lang.String r1 = r4.mo86045b(r14, r1, r8)
            r4.f194349i = r1
            java.lang.String r1 = r5.f183463d
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85807K5(r1)
            if (r1 == 0) goto L_0x0243
            java.lang.String r1 = r5.f183463d
            java.lang.String r6 = "ChatRoomName"
            java.lang.String r1 = r4.mo86045b(r6, r1, r8)
            r4.f194350j = r1
        L_0x0243:
            r4.f194351k = r2
            r4.f194353m = r8
            r3.f230558f = r4
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r3)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_PAT_FIRST_REVOKE_BOOLEAN_SYNC
            boolean r1 = r1.mo119686g(r2, r8)
            if (r1 == 0) goto L_0x0279
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.mo119677K(r2, r3)
            zt3.t r1 = zt3.C119157j.f356862d
            ud2.c$c r2 = new ud2.c$c
            r2.<init>(r0, r5)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183875f(r2)
        L_0x0279:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ud2.C78147c.wr0(android.util.Pair, int):void");
    }

    public final String wx0(int i) {
        return MMApplicationContext.getContext().getString(i).replaceAll("\\[", "{").replaceAll("]", "}");
    }

    public String xx0(String str, String str2) {
        int i;
        String s = C75592q0.m90789s();
        try {
            i = ((Integer) C14180f.m13512b(str, "pat_user_suffix_version")).intValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PatUserMMKV", e, "", new Object[0]);
            i = 0;
        }
        Log.m105925i("MicroMsg.PatMsgExtension", "pattedUser %s, version %d", str, Integer.valueOf(i));
        if (str.equals(s)) {
            String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC, (Object) null);
            if (Util.isNullOrNil(str3)) {
                return wx0(C0966R.string.ilf);
            }
            if (i == 0) {
                return String.format(wx0(C0966R.string.ilh), new Object[]{str3});
            }
            return String.format(wx0(C0966R.string.ilg), new Object[]{str3});
        }
        String a = C14180f.m13511a(str);
        Log.m105925i("MicroMsg.PatMsgExtension", "pattedUser %s, suffix %s", str, a);
        String r = C72996z1.m85820U5(str2) ? C45628s0.m50796r(str2, str, true) : C45626r0.m50732b(str);
        if (Util.isNullOrNil(a)) {
            return String.format(wx0(C0966R.string.ili), new Object[]{r});
        } else if (i == 0) {
            return String.format(wx0(C0966R.string.ilk), new Object[]{r, a});
        } else {
            return String.format(wx0(C0966R.string.ilj), new Object[]{r, a});
        }
    }

    public Pair<Long, Long> yx0(String str, String str2, String str3, String str4, int i, long j) {
        C72963f4 f4Var;
        C72963f4 Ex0;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        int i2 = i;
        long j2 = j;
        Class cls = C78150h.class;
        Class cls2 = C75700k0.class;
        if (Util.isNullOrNil(str6, str5, str7)) {
            return Pair.create(0L, 0L);
        }
        if (str5.equals(C75592q0.m90789s())) {
            str5 = str6;
        }
        if (!C72996z1.m85807K5(str5) || ((C75700k0) C86709a0.m107533q(cls2)).mo96101cU().mo101205k(str5) || (Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).Ex0(str5)) == null || Ex0.getMsgId() <= 0 || Ex0.getType() != 922746929) {
            Class cls3 = C32735h.class;
            long m = C75604z3.m90841m(str5, (long) i2);
            C72963f4 f4Var2 = new C72963f4();
            C64418hb3 hb32 = new C64418hb3();
            hb32.f183463d = str5;
            C77946ib3 ib32 = new C77946ib3();
            ib32.f227609f = str8;
            ib32.f227610g = m;
            ib32.f227607d = str6;
            ib32.f227608e = str7;
            ib32.f227612i = j2;
            String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC, "");
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            Class cls4 = cls;
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_PAT_SUFFIX_MODIFY_TIP_TIMESTAMP_LONG;
            long j3 = m;
            long G = i3.mo119673G(aVar, 0);
            C85801v1 i4 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_PAT_SUFFIX_MODIFY_TIP_COUNT_INT;
            int j4 = i4.mo119689j(aVar2, 0);
            if (!str7.equals(C75592q0.m90789s()) || Util.isNullOrNil(I)) {
                f4Var = f4Var2;
            } else {
                f4Var = f4Var2;
                C72994y1.C72995a aVar3 = aVar2;
                if (C31543z5.m39453c() - G > ((C32735h) C86312j.m106911c(cls3)).mo58777He(C32735h.C32737c.clicfg_pat_suffix_modify_tip_time_interval, 86400) * 1000 && j4 < ((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_pat_suffix_modify_tip_max_count, Integer.MAX_VALUE)) {
                    Log.m105925i("MicroMsg.PatMsgExtension", "show modify tip %s %s %s %s %s", Long.valueOf(j), str6, Long.valueOf(G), Integer.valueOf(j4), I);
                    ib32.f227613j = 1;
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(C31543z5.m39453c()));
                    C86709a0.m107535s().mo121142i().mo119677K(aVar3, Integer.valueOf(j4 + 1));
                }
            }
            hb32.f183464e.add(ib32);
            C68070l.C68072b bVar = new C68070l.C68072b();
            C78383a aVar4 = new C78383a();
            aVar4.f229698b = hb32;
            bVar.mo93545f(aVar4);
            bVar.f195582i = 62;
            bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
            bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
            C72963f4 f4Var3 = f4Var;
            f4Var3.mo108732L2(C68070l.C68072b.m80420s(bVar, "", (C98121d) null));
            f4Var3.mo108740T2(0);
            f4Var3.mo108749c3(str5);
            f4Var3.mo108745Y2(j);
            long j5 = j3;
            f4Var3.mo108733M2(j5);
            f4Var3.setType(922746929);
            ((C78150h) C86312j.m106911c(cls4)).vx0(f4Var3.mo108774y2(), ib32);
            long x = C75604z3.m90852x(f4Var3);
            Log.m105925i("MicroMsg.PatMsgExtension", "insert pat msg %d %s %s", Long.valueOf(x), Integer.toHexString(f4Var3.getType()), Integer.toHexString(922746929));
            return Pair.create(Long.valueOf(x), Long.valueOf(j5));
        }
        long j6 = ((long) i2) * 1000;
        if (j6 <= Ex0.getCreateTime()) {
            j6 = Ex0.getCreateTime() + 1;
        }
        C77946ib3 ib33 = new C77946ib3();
        ib33.f227609f = str8;
        ib33.f227610g = j6;
        ib33.f227607d = str6;
        ib33.f227608e = str7;
        ib33.f227612i = j2;
        C64418hb3 d = C67301m.m79639d(Ex0.getContent());
        d.f183463d = Ex0.mo108768t();
        d.f183464e.add(ib33);
        C68070l.C68072b bVar2 = new C68070l.C68072b();
        C78383a aVar5 = new C78383a();
        aVar5.f229698b = d;
        bVar2.mo93545f(aVar5);
        bVar2.f195582i = 62;
        bVar2.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
        bVar2.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        Ex0.mo108732L2(C68070l.C68072b.m80420s(bVar2, "", (C98121d) null));
        long msgId = Ex0.getMsgId();
        if (msgId != 0) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(msgId, Ex0);
        }
        ((C78150h) C86312j.m106911c(cls)).vx0(Ex0.mo108774y2(), ib33);
        Log.m105925i("MicroMsg.PatMsgExtension", "update pat msg %d, index %d", Long.valueOf(msgId), Integer.valueOf(d.f183464e.size() - 1));
        return Pair.create(Long.valueOf(msgId), Long.valueOf(j6));
    }

    public final boolean zx0(String str, Pair<Long, Long> pair) {
        return ((Long) pair.second).longValue() <= ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).yu0(str);
    }
}
