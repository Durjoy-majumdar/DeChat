package mv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import jv0.C99055a;
import kv0.C99246b;
import lu3.C88656g;
import mv0.C99990k;
import nv0.C100216b;
import ov0.C100544c;
import ov0.C100546d;
import ov0.C100551e;
import pv0.C47537w;
import zu0.C103092u;

/* renamed from: mv0.p */
public class C100002p implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ int f292993d;

    /* renamed from: e */
    public final /* synthetic */ C99996l f292994e;

    /* renamed from: mv0.p$a */
    public class C100003a implements Runnable {
        public C100003a() {
        }

        public void run() {
            Object obj;
            Object obj2;
            Log.m105924i("MicroMsg.RecoverPCServer", "readFromSdcard end");
            Log.appenderFlush();
            C99980a.m130643h().mo139322k().f292970r = 7;
            C99996l lVar = C100002p.this.f292994e;
            lVar.f292981p = 0;
            C99990k.C99994d dVar = lVar.f292980o;
            if (dVar != null) {
                dVar.mo127335P();
            } else {
                Log.m105924i("MicroMsg.RecoverPCServer", "operatorCallback is null");
            }
            C99990k.m130657f();
            new C100216b(8).mo32547o1();
            Log.m105924i("MicroMsg.RecoverPCServer", "recover ok");
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_OLD_RECORDS_BOOLEAN, Boolean.TRUE);
            C99980a.m130643h().mo139321j().f292937f++;
            C99980a.m130643h().mo139322k().f292969q = 7;
            C100002p.this.f292994e.mo139340c();
            C100544c f = C100546d.m131563g().mo139994f();
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<C100544c.C100545a> it = f.f294587a.iterator();
            while (it.hasNext()) {
                C100544c.C100545a next = it.next();
                int i = next.f294589a;
                if (i == 2 && (obj2 = next.f294590b) != null && (obj2 instanceof String)) {
                    stringBuffer.append(next.f294589a + " : " + ((String) obj2) + " ,");
                } else if (i == 1 && (obj = next.f294590b) != null && (obj instanceof String)) {
                    stringBuffer.append(next.f294589a + " : " + ((String) obj) + " ,");
                }
            }
            Log.m105918d("MicroMsg.BakOldRecoverDelayData", "dump delay " + stringBuffer.toString());
        }
    }

    public C100002p(C99996l lVar, int i) {
        this.f292994e = lVar;
        this.f292993d = i;
    }

    public String getKey() {
        return "RecoverPCServer_recoverFromSdcard";
    }

    public void run() {
        boolean z;
        C103092u.f304189a = 0;
        C103092u.f304190b = 0;
        C103092u.f304191c = 0;
        C103092u.f304192d = 0;
        C103092u.f304193e = 0;
        C103092u.f304194f = 0;
        C103092u.f304195g = 0;
        long nowMilliSecond = Util.nowMilliSecond();
        C103092u.f304196h = nowMilliSecond;
        C103092u.f304197i = nowMilliSecond - 0;
        C103092u.m136364a();
        C99246b bVar = new C99246b();
        bVar.mo138595a();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        int i = 0;
        for (C47537w next : this.f292994e.f292972d) {
            try {
                int b = C99996l.m130676b(this.f292994e, C99055a.m129003b() + "backupItem/" + C99055a.m129004c(next.f127548d) + next.f127548d, hashMap, bVar, hashSet);
                if (b < 0) {
                    bVar.mo138596b();
                    Log.m105928w("MicroMsg.RecoverPCServer", "Thread has been canceled");
                    return;
                }
                i += b;
                this.f292994e.mo139343f(i, this.f292993d);
                Log.m105925i("MicroMsg.RecoverPCServer", "recover has done: %d", Integer.valueOf(i));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.RecoverPCServer", "Thread.run err:" + e.toString());
                Log.printErrStackTrace("MicroMsg.RecoverPCServer", e, "", new Object[0]);
                Log.m105922f("MicroMsg.RecoverPCServer", "recoverFromSdcard MMThread.run() " + e.toString());
            }
        }
        for (String str : hashMap.keySet()) {
            C72963f4 Fx0 = ((C72972g4) C100546d.m131563g().mo139995h().mo140008h()).Fx0(str, " and not ( type = 10000 and isSend != 2 ) ");
            if (Fx0 != null) {
                int intValue = ((Integer) hashMap.get(str)).intValue();
                String t = Fx0.mo108768t();
                Log.m105925i("MicroMsg.BakOldTempStorageLogic", "talker:%s, addUnreadCount:%d", t, Integer.valueOf(intValue));
                C72976h2 j = ((C44660i2) C100546d.m131563g().mo139995h().mo140005e()).mo69771j(t);
                if (j == null || j.mo108821o2() <= Fx0.getCreateTime() || j.mo108821o2() == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                    if (j == null) {
                        Log.m105924i("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg conversation is null.");
                        Log.m105919d("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg cvs:%s", t);
                        j = new C72976h2(t);
                        z = true;
                    } else {
                        z = false;
                    }
                    j.mo108803Y2(Fx0.mo108769t2());
                    j.mo108812g3(j.mo108786G2() + intValue);
                    j.mo101164o3(Fx0);
                    j.mo108806b3(Integer.toString(Fx0.getType()));
                    j.mo101161T2((Fx0.getCreateTime() & 72057594037927935L) | (j.mo108828u2() & 4611686018427387904L));
                    j.mo108805a3(0);
                    if (z) {
                        Log.m105919d("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg cvs:%s, cvs.flag:%d", t, Long.valueOf(j.mo108828u2()));
                        ((C44660i2) C100546d.m131563g().mo139995h().mo140005e()).mo69751W(j);
                    } else {
                        ((C44660i2) C100546d.m131563g().mo139995h().mo140005e()).mo69773k0(j, t);
                    }
                } else {
                    Log.m105924i("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
                }
            }
        }
        ((C44660i2) C100546d.m131563g().mo139995h().mo140005e()).mo69758c0();
        bVar.mo138596b();
        this.f292994e.mo139343f(100, 100);
        Log.m105924i("MicroMsg.RecoverPCServer", "build temDB finish!");
        Log.appenderFlush();
        C100546d g = C100546d.m131563g();
        C100003a aVar = new C100003a();
        g.getClass();
        g.mo139992c(new C100551e(g, aVar), 10);
    }
}
