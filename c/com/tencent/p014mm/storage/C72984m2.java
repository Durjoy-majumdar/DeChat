package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.util.LinkedList;
import kj2.C117407d;

/* renamed from: com.tencent.mm.storage.m2 */
public class C72984m2 {

    /* renamed from: a */
    public C72981l2 f212809a = new C72981l2();

    public C72984m2() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251807e);
        sb.append("checkmsgid.ini");
        byte[] O = C86013q1.m106433O(sb.toString(), 0, -1);
        if (!Util.isNullOrNil(O)) {
            try {
                this.f212809a.parseFrom(O);
                if (mo101177b()) {
                    mo101178c();
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.DelSvrIdMgr", "DelSvrIDs parse Error");
                Log.m105921e("MicroMsg.DelSvrIdMgr", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    /* renamed from: a */
    public void mo101176a(int i, long j, long j2, boolean z) {
        if (j != 0) {
            if (z) {
                mo101177b();
            }
            int i2 = i - ((int) (j2 / 86400));
            if (i2 == 0) {
                this.f212809a.f212800h.add(Long.valueOf(j));
            } else if (i2 == 1) {
                this.f212809a.f212801i.add(Long.valueOf(j));
            } else if (i2 != 2) {
                Log.m105921e("MicroMsg.DelSvrIdMgr", "should not add to thease lists, dayIndex:%d", Integer.valueOf(i2));
            } else {
                this.f212809a.f212802j.add(Long.valueOf(j));
            }
            if (z) {
                mo101178c();
            }
        }
    }

    /* renamed from: b */
    public boolean mo101177b() {
        Log.m105927v("MicroMsg.DelSvrIdMgr", "checkOldData todayIndex:%d, t0Size:%d, t1Size:%d, t2Size:%d", Integer.valueOf(this.f212809a.f212796d), Integer.valueOf(this.f212809a.f212800h.size()), Integer.valueOf(this.f212809a.f212801i.size()), Integer.valueOf(this.f212809a.f212802j.size()));
        int nowSecond = (int) (Util.nowSecond() / 86400);
        C72981l2 l2Var = this.f212809a;
        int i = nowSecond - l2Var.f212796d;
        l2Var.f212796d = nowSecond;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            l2Var.f212802j = l2Var.f212801i;
            LinkedList<Long> linkedList = l2Var.f212800h;
            l2Var.f212801i = linkedList;
            linkedList.clear();
            return true;
        } else if (i != 2) {
            l2Var.f212802j.clear();
            this.f212809a.f212801i.clear();
            this.f212809a.f212800h.clear();
            return true;
        } else {
            l2Var.f212802j = l2Var.f212800h;
            l2Var.f212801i.clear();
            this.f212809a.f212800h.clear();
            return true;
        }
    }

    /* renamed from: c */
    public final void mo101178c() {
        Log.m105925i("MicroMsg.DelSvrIdMgr", "summerdel toFile tid[%d] [%d, %d ,%d] stack[%s]", Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(this.f212809a.f212800h.size()), Integer.valueOf(this.f212809a.f212801i.size()), Integer.valueOf(this.f212809a.f212802j.size()), Util.getStack());
        try {
            this.f212809a.f212799g.clear();
            this.f212809a.f212798f.clear();
            this.f212809a.f212797e.clear();
            C72981l2 l2Var = new C72981l2();
            l2Var.f212800h.addAll(this.f212809a.f212800h);
            l2Var.f212801i.addAll(this.f212809a.f212801i);
            l2Var.f212802j.addAll(this.f212809a.f212802j);
            byte[] byteArray = l2Var.toByteArray();
            StringBuilder sb = new StringBuilder();
            C86709a0.m107528h();
            sb.append(C86709a0.m107535s().f251807e);
            sb.append("checkmsgid.ini");
            C86013q1.m106438T(sb.toString(), byteArray, 0, byteArray.length);
            Log.m105925i("MicroMsg.DelSvrIdMgr", "summerdel toFile done [%d, %d, %d] data len[%d]", Integer.valueOf(l2Var.f212800h.size()), Integer.valueOf(l2Var.f212801i.size()), Integer.valueOf(l2Var.f212802j.size()), Integer.valueOf(byteArray.length));
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(111, 168, 1, false);
            Log.printErrStackTrace("MicroMsg.DelSvrIdMgr", e, "summerdel ", new Object[0]);
        }
    }
}
