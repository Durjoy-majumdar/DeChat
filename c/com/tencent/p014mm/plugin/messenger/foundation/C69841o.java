package com.tencent.p014mm.plugin.messenger.foundation;

import android.database.Cursor;
import android.util.SparseArray;
import bp3.C104160f;
import bp3.C79758p;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.autogen.mmdata.rpt.CmdProcFailedStruct;
import com.tencent.p014mm.plugin.zero.C72670r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75693d1;
import f62.C75694f1;
import f62.C75699i1;
import f62.C75700k0;
import f62.C75701k1;
import f62.k1$$a;
import f62.k1$$c;
import java.util.LinkedList;
import nc0.C76850a;
import ob0.C35136m;
import p261wl.C38166b;
import p285zh.C119114c;
import p285zh.c$$e;
import sf0.C48374j0;
import sf0.C90188n0;
import te3.C50886px;
import te3.C50904q20;
import te3.C51163rv3;
import te3.C51912x20;
import te3.C77949j3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.o */
public class C69841o implements C75694f1 {
    /* renamed from: b */
    public static C35136m.C35139b m82292b(C35136m.C35137a aVar, C75699i1 i1Var) {
        k1$$c k1__c;
        boolean z;
        C35136m.C35139b bVar;
        C35136m.C35137a aVar2 = aVar;
        C75699i1 i1Var2 = i1Var;
        Class cls = C75700k0.class;
        C77949j3 j3Var = aVar2.f94242a;
        if (10008 == C90188n0.f258950r && C90188n0.f258951s != 0) {
            Log.m105925i("MicroMsg.MessageSyncExtension", "dkmsgid  set svrmsgid %d -> %d", Long.valueOf(j3Var.f227638r), Integer.valueOf(C90188n0.f258951s));
            j3Var.f227638r = Long.valueOf((long) C90188n0.f258951s).longValue();
            C90188n0.f258951s = 0;
        }
        if (((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).py0(j3Var.f227638r)) {
            Log.m105924i("MicroMsg.MessageSyncExtension", "ignore, because reSync the deleted msg perhaps the IDC has change has swtiched");
            return null;
        }
        String g = C48374j0.m53718g(j3Var.f227628e);
        String g2 = C48374j0.m53718g(j3Var.f227629f);
        if (!g.equals(C75592q0.m90789s()) || !g2.equals("newsapp") || j3Var.f227630g == 51) {
            Object[] objArr = new Object[15];
            objArr[0] = g;
            objArr[1] = g2;
            objArr[2] = Long.valueOf(j3Var.f227638r);
            objArr[3] = Integer.valueOf(j3Var.f227627d);
            objArr[4] = Integer.valueOf(j3Var.f227639s);
            objArr[5] = Integer.valueOf(j3Var.f227632i);
            objArr[6] = Integer.valueOf(j3Var.f227630g);
            objArr[7] = Integer.valueOf(j3Var.f227635o);
            objArr[8] = Util.formatUnixTime((long) j3Var.f227635o);
            objArr[9] = Long.valueOf(Util.nowSecond() - ((long) j3Var.f227635o));
            objArr[10] = Integer.valueOf(j3Var.f227633j);
            objArr[11] = Integer.valueOf(C48374j0.m53716e(j3Var.f227634n, new byte[0]).length);
            objArr[12] = Integer.valueOf(Util.nullAsNil(j3Var.f227636p).length());
            objArr[13] = Integer.valueOf(Util.nullAsNil(j3Var.f227637q).length());
            C51163rv3 rv32 = j3Var.f227631h;
            String str = "";
            if (rv32 != null) {
                str = rv32.f141175d;
            }
            objArr[14] = Util.secPrint(str);
            Log.m105925i("MicroMsg.MessageSyncExtension", "dkAddMsg from:%s to:%s id:[%d,%d,%d] status:%d type:%d time:[%d %s] diff:%d imgstatus:%d imgbuf:%d src:%d push:%d content:%s", objArr);
            Log.m105919d("MicroMsg.MessageSyncExtension", "parseMsgSource  has been Deprecated  by dk. at 20151218 [%s] %s ", j3Var.f227636p, "");
            SparseArray<k1$$c> sparseArray = C75701k1.f222303a;
            synchronized (sparseArray) {
                k1__c = sparseArray.get(5);
            }
            if (k1__c != null) {
                k1__c.mo71276I5(j3Var);
            }
            C38166b.m41756c(C75693d1.class, 5, new k1$$a(j3Var));
            if (g.equals("readerapp")) {
                j3Var.f227628e = C48374j0.m53720i("newsapp");
                j3Var.f227630g = 12399999;
            }
            if ((g.equals("blogapp") || g.equals("newsapp")) && j3Var.f227630g != 10002) {
                j3Var.f227630g = 12399999;
            }
            if (j3Var.f227630g == 52) {
                j3Var.f227630g = 1000052;
            }
            if (j3Var.f227630g == 53) {
                j3Var.f227630g = 1000053;
            }
            C77949j3 j3Var2 = aVar2.f94242a;
            if (j3Var2 != null) {
                C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(C48374j0.m53718g(j3Var2.f227628e), j3Var2.f227638r);
                if (h302.getMsgId() != 0 && (h302.mo108769t2() == 0 || j3Var2.f227639s != 0)) {
                    int o2 = h302.mo108762o2();
                    int i = aVar2.f94243b ? o2 | 2 : o2 & -3;
                    int i2 = aVar2.f94244c ? i | 1 : i & -2;
                    int i3 = aVar2.f94245d ? i2 | 4 : i2 & -5;
                    if (i3 != h302.mo108762o2()) {
                        Log.m105925i("MicroMsg.MsgInfoStorageLogic", "summerbadcr updateMsgFlagByAddMsgInfo msgType[%d], flag new[%d], old[%d]", Integer.valueOf(j3Var2.f227630g), Integer.valueOf(i3), Integer.valueOf(h302.mo108762o2()));
                        h302.mo108735O2(i3);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(h302.mo108774y2(), h302);
                    }
                }
            }
            C35136m a = C35136m.C35140d.m40570a(Integer.valueOf(j3Var.f227630g));
            if (a == null) {
                a = C35136m.C35140d.m40570a(g);
            }
            if (a != null) {
                C119114c.m167921f("MessageExtension");
                C35136m.C35139b Fg = a.mo56403Fg(aVar2);
                C72963f4 f4Var = Fg == null ? null : Fg.f94255a;
                if (f4Var == null) {
                    Log.m105929w("MicroMsg.MessageSyncExtension", "summerbadcr extension declared but skipped msg, type=%d, svrId=%d, MsgSeq=%d, createTime=%d, addMsgInfo=%s", Integer.valueOf(j3Var.f227630g), Long.valueOf(j3Var.f227638r), Integer.valueOf(j3Var.f227639s), Integer.valueOf(j3Var.f227635o), aVar2);
                    String str2 = a.getClass().getSimpleName() + "-" + j3Var.f227630g;
                    C119114c.m167920e("MicroMsg.NotifyPowerInspector", "noteAddMsgEmpty: type=" + str2);
                    if (MMApplicationContext.isMainProcess() && AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
                        C119114c.m167922g("MsgNull");
                        c$$e c__e = C119114c.f356698o;
                        if (c__e.mo183788b() || !C119114c.f356685b) {
                            c__e.mo183789c(str2);
                        }
                    }
                } else {
                    if (C72996z1.m85830a5(g) && !C76850a.m92642n()) {
                        C119114c.m167922g("MsgPost");
                    } else {
                        Log.m105918d("MicroMsg.MessageSyncExtension", " msg , id =" + f4Var.getMsgId() + "  " + i1Var2);
                        if (f4Var.getMsgId() <= 0) {
                            C119114c.m167922g("MsgNoId");
                        } else if (i1Var2 == null) {
                            C119114c.m167922g("MsgNullNotifier");
                        } else if (Fg.f94256b) {
                            i1Var2.mo58466b(f4Var, j3Var);
                            C119114c.m167921f("newMsg");
                        } else {
                            C119114c.m167922g("MsgTotNotify");
                        }
                    }
                }
                bVar = Fg;
                z = true;
            } else {
                bVar = null;
                z = false;
            }
            C75701k1.m90962b(5, j3Var);
            if (!z) {
                Log.m105923f("MicroMsg.MessageSyncExtension", "unknown add msg request, type=%d. drop now !!!", Integer.valueOf(j3Var.f227630g));
            }
            return bVar;
        }
        Log.m105929w("MicroMsg.MessageSyncExtension", "msgid:%d type:%d this msg from mac weixin ,someone send msg to newsapp at mac weixin ,givp up.", Long.valueOf(j3Var.f227638r), Integer.valueOf(j3Var.f227630g));
        return null;
    }

    /* renamed from: a */
    public void mo66659a(Object obj, C50886px pxVar, int i, byte[] bArr, boolean z, C75699i1 i1Var) {
        C72963f4 f4Var;
        int i2 = pxVar.f140037d;
        if (i2 != 5) {
            if (i2 == 8) {
                C50904q20 q202 = (C50904q20) new C50904q20().parseFrom(bArr);
                long j = q202.f140099f;
                C72670r.f211431c = -1;
                C72670r.f211430b = j;
                String g = C48374j0.m53718g(q202.f140097d);
                int i3 = q202.f140098e;
                Class cls = C75700k0.class;
                Cursor c402 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).c40(g, i3);
                if (c402.moveToFirst()) {
                    while (!c402.isAfterLast()) {
                        C72963f4 f4Var2 = new C72963f4();
                        f4Var2.convertFrom(c402);
                        C75604z3.m90833e(f4Var2, true);
                        c402.moveToNext();
                    }
                }
                c402.close();
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101105bF(g, i3);
            } else if (i2 == 9) {
                C51912x20 x202 = (C51912x20) new C51912x20().parseFrom(bArr);
                C72670r.f211431c = -2;
                C72670r.f211430b = (long) x202.f144410e;
                LinkedList<Integer> linkedList = x202.f144411f;
                for (int i4 = 0; i4 < linkedList.size(); i4++) {
                    C75604z3.m90835g(C48374j0.m53718g(x202.f144409d), (long) linkedList.get(i4).intValue());
                }
            }
        } else if (C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_NOTALLOWNEWSYNC_Int, 0) == 0) {
            C119114c.m167921f("MessageSync");
            C77949j3 j3Var = (C77949j3) new C77949j3().parseFrom(bArr);
            if (j3Var != null) {
                int i5 = j3Var.f227630g;
                long j2 = j3Var.f227638r;
                C72670r.f211431c = i5;
                C72670r.f211430b = j2;
                C35136m.C35137a aVar = new C35136m.C35137a(j3Var, false, false, false);
                C35136m.C35139b b = m82292b(aVar, i1Var);
                if (!(b == null || (f4Var = b.f94255a) == null || f4Var.getMsgId() >= 0)) {
                    CmdProcFailedStruct cmdProcFailedStruct = new CmdProcFailedStruct();
                    cmdProcFailedStruct.f194180e = f4Var.mo108774y2();
                    cmdProcFailedStruct.f194179d = (long) f4Var.getType();
                    cmdProcFailedStruct.f194182g = 1000 - f4Var.getMsgId();
                    cmdProcFailedStruct.f194181f = cmdProcFailedStruct.mo86045b(AppMeasurement.CRASH_ORIGIN, "processAddMsg insert db error", true);
                    cmdProcFailedStruct.mo86054n();
                }
                if (!aVar.f94243b) {
                    ((C119157j) C119157j.f356862d).mo183875f(new o$$a(obj, i, j3Var));
                }
            }
        }
    }
}
