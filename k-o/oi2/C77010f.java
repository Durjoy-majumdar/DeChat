package oi2;

import android.content.Context;
import android.database.Cursor;
import android.util.Base64;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.remittance.model.C70614v0;
import com.tencent.p014mm.plugin.remittance.model.MsgCheckTaskMgr;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C45881a;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import qo3.C47883u;
import qo3.C77426q;
import te3.C50764p03;
import ub3.C78144b;
import vi2.C37739b;
import vi2.C78418c;
import vi2.C78419d;
import yq3.C79143a;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: oi2.f */
public class C77010f extends C86301e implements C114668z {

    /* renamed from: d */
    public C70614v0 f224993d = null;

    /* renamed from: e */
    public C37739b f224994e = null;

    /* renamed from: f */
    public C78419d f224995f = null;

    /* renamed from: oi2.f$b */
    public class C35173b implements C47883u {
        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: oi2.f$c */
    public class C35174c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f94326d;

        public C35174c(String str) {
            this.f94326d = str;
        }

        public void run() {
            Class cls = C75700k0.class;
            boolean zx02 = C77010f.this.zx0(this.f94326d);
            C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(this.f94326d);
            if (j != null) {
                Log.m105925i("MicroMsg.SubCoreRemittance", "update red flag: %s, %s", this.f94326d, Boolean.valueOf(zx02));
                j.mo108809d3(zx02 ? 1 : 0);
                Log.m105925i("MicroMsg.SubCoreRemittance", "update ret: %s", Integer.valueOf(((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69775m0(j, this.f94326d, true, true)));
            }
        }
    }

    /* renamed from: oi2.f$a */
    public class C47382a implements Runnable {
        public C47382a(C77010f fVar) {
        }

        public void run() {
            MMApplicationContext.getContext();
            MsgCheckTaskMgr msgCheckTaskMgr = MsgCheckTaskMgr.f115996b;
            msgCheckTaskMgr.getClass();
            try {
                String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_WALLET_REMITTANCE_MSGCHECKTASKINFO_STRING_SYNC, (Object) null);
                if (!Util.isNullOrNil(str)) {
                    msgCheckTaskMgr.f115997a.parseFrom(Base64.decode(str, 0));
                }
                Iterator<C50764p03> it = msgCheckTaskMgr.f115997a.f141253d.iterator();
                while (it.hasNext()) {
                    C50764p03 next = it.next();
                    int p = (int) ((next.f139483d - C75604z3.m90844p()) / 1000);
                    if (p < 0) {
                        p = 0;
                    }
                    new MsgCheckTaskMgr.MsgCheckTask((long) p, next).mo67016a();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MsgCheckTaskMgr", e, "", new Object[0]);
                msgCheckTaskMgr.f115997a.f141253d.clear();
            }
        }
    }

    /* renamed from: oi2.f$d */
    public class C77011d implements Runnable {
        public C77011d() {
        }

        public void run() {
            Cursor query;
            Throwable th;
            C77010f fVar = C77010f.this;
            fVar.getClass();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_REMITTANCE_RED_FLAG_CHECK_LONG_SYNC;
            if (C31543z5.m39453c() - ((Long) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0L)).longValue() > 43200000) {
                C78419d yx02 = fVar.yx0();
                yx02.getClass();
                ArrayList arrayList = new ArrayList();
                try {
                    query = yx02.f229767d.query("RemittanceRecord", C78419d.f229765f, "receiveStatus=? or receiveStatus=?", new String[]{"1", "7"}, (String) null, (String) null, (String) null, 2);
                    if (query.moveToFirst()) {
                        do {
                            C78418c cVar = new C78418c();
                            cVar.convertFrom(query);
                            arrayList.add(cVar);
                        } while (query.moveToNext());
                        query.close();
                    } else {
                        query.close();
                    }
                    query.close();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.RemittanceSendRecordStorage", e, "getRecordByTransferId error: %s", e.getMessage());
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C78418c cVar2 = (C78418c) it.next();
                    Log.m105919d("MicroMsg.SubCoreRemittance", "status: %s", Integer.valueOf(cVar2.field_receiveStatus));
                    if (!hashSet.contains(cVar2.field_talker)) {
                        fVar.Bx0(cVar2.field_talker, (C72963f4) null, cVar2);
                        hashSet.add(cVar2.field_talker);
                    }
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(C31543z5.m39453c()));
                return;
            }
            Log.m105924i("MicroMsg.SubCoreRemittance", "not time");
            return;
            throw th;
        }
    }

    static {
        C79143a.m95769h("RemittanceProcess", C77008c.class);
    }

    public static void Ax0(Context context, boolean z) {
        C77426q qVar = new C77426q(MMApplicationContext.getContext());
        qVar.mo107595g(MMApplicationContext.getContext().getString(z ? C0966R.string.i1u : C0966R.string.i1t));
        qVar.mo107599k(MMApplicationContext.getContext().getResources().getColor(C0966R.color.akw));
        qVar.mo107601m(C0966R.string.fmz);
        qVar.mo107600l(new C35173b());
        qVar.mo107603o();
    }

    public static C77010f vx0() {
        return (C77010f) C86312j.m106911c(C77010f.class);
    }

    public void Bx0(String str, C72963f4 f4Var, C78418c cVar) {
        Class cls = C75700k0.class;
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_update_remittace_conversation_flag, 0) == 1;
        Log.m105925i("MicroMsg.SubCoreRemittance", "clicfg_android_update_remittance_conversation_flag is %s", Boolean.valueOf(z));
        if (z) {
            boolean zx02 = zx0(str);
            C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(str);
            if (j != null) {
                Log.m105925i("MicroMsg.SubCoreRemittance", "update red flag: %s, %s", str, Boolean.valueOf(zx02));
                j.mo108809d3(zx02 ? 1 : 0);
                if (f4Var == null && cVar != null) {
                    f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(cVar.field_locaMsgId);
                }
                if (f4Var == null || f4Var.getMsgId() <= 0) {
                    Log.m105924i("MicroMsg.SubCoreRemittance", "msgInfo has delete，can notsetFlag ");
                } else {
                    j.mo101161T2(C45881a.m51165b(j, 1, f4Var.getCreateTime()));
                }
                Log.m105925i("MicroMsg.SubCoreRemittance", "update ret: %s", Integer.valueOf(((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69775m0(j, str, false, true)));
                return;
            }
            return;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C35174c(str), "update_remit_red_flag");
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        AppForegroundDelegate.INSTANCE.mo174208a(this);
        ((C119157j) C119157j.f356862d).mo183878i(new C47382a(this), 12000);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        AppForegroundDelegate.INSTANCE.mo174215k(this);
    }

    public void onAppBackground(String str) {
        ((C119157j) C119157j.f356862d).mo183876g(new C77011d(), "check_remit_red_flag_background");
    }

    public void onAppForeground(String str) {
    }

    public C37739b wx0() {
        if (vx0().f224994e == null) {
            C77010f vx02 = vx0();
            C86709a0.m107528h();
            vx02.f224994e = new C37739b(C86709a0.m107535s().f251811i);
        }
        return vx0().f224994e;
    }

    public C70614v0 xx0() {
        if (this.f224993d == null) {
            this.f224993d = new C70614v0();
        }
        return this.f224993d;
    }

    public C78419d yx0() {
        if (vx0().f224995f == null) {
            C77010f vx02 = vx0();
            C86709a0.m107528h();
            vx02.f224995f = new C78419d(C86709a0.m107535s().f251811i);
        }
        return vx0().f224995f;
    }

    public boolean zx0(String str) {
        int i;
        int i2;
        Cursor query;
        C78419d yx02 = yx0();
        yx02.getClass();
        ArrayList<C78418c> arrayList = null;
        if (!Util.isNullOrNil(str)) {
            try {
                query = yx02.f229767d.query("RemittanceRecord", C78419d.f229765f, "talker=?", new String[]{str}, (String) null, (String) null, (String) null, 2);
                if (query.moveToFirst()) {
                    ArrayList arrayList2 = new ArrayList();
                    do {
                        C78418c cVar = new C78418c();
                        cVar.convertFrom(query);
                        arrayList2.add(cVar);
                    } while (query.moveToNext());
                    query.close();
                    query.close();
                    arrayList = arrayList2;
                } else {
                    query.close();
                    query.close();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.RemittanceSendRecordStorage", e, "getRecordByTransferId error: %s", e.getMessage());
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        for (C78418c cVar2 : arrayList) {
            if (!C75592q0.m90789s().equals(cVar2.field_receiverName)) {
                Log.m105918d("MicroMsg.SubCoreRemittance", "not receiver");
            } else {
                long c = (cVar2.field_invalidtime * 1000) - C31543z5.m39453c();
                Log.m105925i("MicroMsg.SubCoreRemittance", "remittance status: %s, %s, %s", Integer.valueOf(cVar2.field_receiveStatus), Long.valueOf(cVar2.field_locaMsgId), cVar2.field_talker);
                int i3 = (c > 0 ? 1 : (c == 0 ? 0 : -1));
                if (i3 < 0 && ((i2 = cVar2.field_receiveStatus) == 1 || i2 == 21 || i2 == 7 || i2 == 27)) {
                    Log.m105924i("MicroMsg.SubCoreRemittance", "timeout, change status");
                    cVar2.field_receiveStatus = 2;
                    yx0().replace(cVar2);
                } else if (i3 >= 0 && ((i = cVar2.field_receiveStatus) == 1 || i == 21 || i == 7 || i == 27)) {
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(cVar2.field_locaMsgId);
                    if (b002.getMsgId() > 0 && (b002.f230723F & 4) != 4 && b002.getType() != 10000 && b002.getType() != 268445456) {
                        return true;
                    }
                    if (b002.getType() == 10000 || (b002.f230723F & 4) == 4) {
                        Log.m105924i("MicroMsg.SubCoreRemittance", "is revoke msg");
                    }
                }
            }
        }
        return false;
        throw th;
    }
}
