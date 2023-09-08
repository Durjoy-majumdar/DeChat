package com.tencent.p014mm.plugin.exdevice.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.xweb.XWebFeature;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import hc0.C20937c;
import hk2.C32939b;
import java.util.HashMap;
import java.util.Map;
import m71.C46948b;
import n71.C47180k;
import ok2.C35184b;
import p206nj.C11171e;
import p919sl.C77726c;
import t71.C48538c;
import t71.C48545h;
import u71.C52450a;
import u71.C52451c;
import w71.C38028a;
import w71.C38029b;
import w71.C38031e;
import w71.C53087d;
import y71.C53499i;
import y71.C53502m;
import z71.C39321d;
import z71.C39322e;
import z71.C39324g;
import z71.C53754c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.exdevice.model.r1 */
public class C41166r1 extends C86301e {

    /* renamed from: d */
    public C53754c f110900d;

    /* renamed from: e */
    public C39324g f110901e;

    /* renamed from: f */
    public C39322e f110902f;

    /* renamed from: g */
    public C53087d f110903g;

    /* renamed from: h */
    public C35184b f110904h;

    /* renamed from: i */
    public C38028a f110905i;

    /* renamed from: j */
    public C38029b f110906j;

    /* renamed from: n */
    public C38031e f110907n;

    /* renamed from: o */
    public ExdeviceEventManager f110908o;

    /* renamed from: p */
    public C41140m f110909p;

    /* renamed from: q */
    public C52451c f110910q;

    /* renamed from: r */
    public C52450a f110911r;

    /* renamed from: s */
    public C48538c f110912s;

    /* renamed from: t */
    public C20828a f110913t = null;

    /* renamed from: u */
    public C20937c f110914u = null;

    /* renamed from: v */
    public C41125f0 f110915v;

    /* renamed from: w */
    public C29060q f110916w = new C29884a(this);

    /* renamed from: x */
    public MStorageEx.IOnStorageChange f110917x = new C29885b(this);

    /* renamed from: com.tencent.mm.plugin.exdevice.model.r1$a */
    public class C29884a extends C29060q.C29061a {
        public C29884a(C41166r1 r1Var) {
        }

        public void onNetworkChange(int i) {
            ((C32939b) C86312j.m106911c(C32939b.class)).M40();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.r1$b */
    public class C29885b implements MStorageEx.IOnStorageChange {

        /* renamed from: com.tencent.mm.plugin.exdevice.model.r1$b$a */
        public class C29886a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Object f80968d;

            public C29886a(C29885b bVar, Object obj) {
                this.f80968d = obj;
            }

            public void run() {
                String str = (String) this.f80968d;
                if (C41166r1.Ax0().mo61489jo(str) && !((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69724s3(str)) {
                    C86709a0.m107529k().f251779b.mo123460f(new C48545h(str, (C46948b<C48545h>) null));
                }
            }
        }

        public C29885b(C41166r1 r1Var) {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            try {
                if (!C86709a0.m107522a()) {
                    Log.m105928w("MicroMsg.exdevice.SubCoreExDevice", "onNotifyChange,acc has not ready");
                } else if (obj instanceof String) {
                    C86709a0.m107525e().postToWorkerDelayed(new C29886a(this, obj), 2000);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.exdevice.SubCoreExDevice", "ap : onNotifyChange exception %s", e.getMessage());
            }
        }
    }

    public static C38028a Ax0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f110905i == null) {
            wx0().f110905i = new C38028a(C86709a0.m107535s().f251811i);
        }
        return wx0().f110905i;
    }

    public static C53754c Bx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f110900d == null) {
            wx0().f110900d = new C53754c(C86709a0.m107535s().f251811i);
        }
        return wx0().f110900d;
    }

    public static C39321d Cx0(long j) {
        Cursor query = Dx0().f105716d.query("HardIotCdnInfo", (String[]) null, "msgid=?", new String[]{String.valueOf(j)}, (String) null, (String) null, (String) null, 2);
        if (query == null) {
            return null;
        }
        if (!query.moveToFirst()) {
            Log.m105928w("MicroMsg.exdevice.HardIotCdnInfoStorage", "get null with msgId:" + j);
            query.close();
            return null;
        }
        C39321d dVar = new C39321d();
        dVar.convertFrom(query);
        query.close();
        return dVar;
    }

    public static C39322e Dx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f110902f == null) {
            wx0().f110902f = new C39322e(C86709a0.m107535s().f251811i);
        }
        return wx0().f110902f;
    }

    public static C39324g Ex0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f110901e == null) {
            wx0().f110901e = new C39324g(C86709a0.m107535s().f251811i);
        }
        return wx0().f110901e;
    }

    public static C38031e Fx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f110907n == null) {
            wx0().f110907n = new C38031e(C86709a0.m107535s().f251811i);
        }
        return wx0().f110907n;
    }

    public static C52451c Gx0() {
        if (wx0().f110910q == null) {
            wx0().f110910q = new C52451c();
        }
        return wx0().f110910q;
    }

    public static C53087d Hx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f110903g == null) {
            wx0().f110903g = new C53087d(C86709a0.m107535s().f251811i);
        }
        return wx0().f110903g;
    }

    public static C52450a Ix0() {
        if (wx0().f110911r == null) {
            wx0().f110911r = new C52450a();
        }
        return wx0().f110911r;
    }

    public static C35184b Jx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f110904h == null) {
            wx0().f110904h = new C35184b(C86709a0.m107535s().f251811i);
        }
        return wx0().f110904h;
    }

    public static C38029b vx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f110906j == null) {
            wx0().f110906j = new C38029b(C86709a0.m107535s().f251811i);
        }
        return wx0().f110906j;
    }

    public static C41166r1 wx0() {
        return (C41166r1) C86312j.m106911c(C41166r1.class);
    }

    public static C41140m xx0() {
        if (wx0().f110909p == null) {
            wx0().f110909p = new C41140m();
        }
        return wx0().f110909p;
    }

    public static ExdeviceEventManager yx0() {
        if (wx0().f110908o == null) {
            wx0().f110908o = new ExdeviceEventManager();
        }
        return wx0().f110908o;
    }

    public static C41125f0 zx0() {
        if (wx0().f110915v == null) {
            wx0().f110915v = new C41125f0();
        }
        return wx0().f110915v;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        Log.m105924i("MicroMsg.exdevice.SubCoreExDevice", "onAccountPostReset");
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this.f110917x);
        C47180k a = C47180k.m52466a();
        a.getClass();
        C86709a0.m107529k().f251779b.mo123455a(538, a);
        yx0().f110719e.alive();
        yx0().f110720f.alive();
        yx0().f110721g.alive();
        yx0().f110740z.alive();
        yx0().f110718d.alive();
        yx0().f110717c.alive();
        yx0().f110722h.alive();
        yx0().f110723i.alive();
        ((C77726c) MvvmEventCenter.getEvent(C77726c.class)).observe(C86709a0.m107523b().f251755f, "MicroMsg.exdevice.SubCoreExDevice", yx0().f110724j);
        yx0().f110694A.alive();
        yx0().f110725k.alive();
        yx0().f110726l.alive();
        yx0().f110727m.alive();
        yx0().f110728n.alive();
        yx0().f110730p.alive();
        yx0().f110729o.alive();
        yx0().f110734t.alive();
        yx0().f110732r.alive();
        yx0().f110733s.alive();
        yx0().f110735u.alive();
        yx0().f110695B.alive();
        yx0().f110696C.alive();
        yx0().f110731q.alive();
        yx0().f110736v.alive();
        yx0().f110737w.alive();
        yx0().f110738x.alive();
        yx0().f110739y.alive();
        yx0().f110705L.alive();
        yx0().f110706M.alive();
        yx0().f110707N.alive();
        yx0().f110709P.alive();
        yx0().f110708O.alive();
        yx0().f110697D.alive();
        yx0().f110699F.alive();
        yx0().f110698E.alive();
        yx0().f110700G.alive();
        yx0().f110701H.alive();
        yx0().f110703J.alive();
        yx0().f110704K.alive();
        yx0().f110702I.alive();
        if (C11171e.m11046c(19)) {
            try {
                MMHandlerThread.postToMainThreadDelayed(new C2244s1(this), 30000);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.exdevice.SubCoreExDevice", "[hakon][step] exception in deviceFeaturesKVStat, %s", e.getMessage());
                Log.printErrStackTrace("MicroMsg.exdevice.SubCoreExDevice", e, "", new Object[0]);
            }
        }
        ((C32939b) C86312j.m106911c(C32939b.class)).mo33889DQ();
        C86709a0.m107529k().mo121126a(this.f110916w);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105924i("MicroMsg.exdevice.SubCoreExDevice", "onAccountRelease");
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this.f110917x);
        yx0().f110719e.dead();
        yx0().f110720f.dead();
        yx0().f110721g.dead();
        yx0().f110740z.dead();
        yx0().f110695B.dead();
        yx0().f110718d.dead();
        yx0().f110717c.dead();
        yx0().f110722h.dead();
        yx0().f110723i.dead();
        yx0().f110694A.dead();
        yx0().f110705L.dead();
        yx0().f110706M.dead();
        yx0().f110707N.dead();
        yx0().f110709P.dead();
        yx0().f110708O.dead();
        yx0().f110697D.dead();
        yx0().f110699F.dead();
        yx0().f110700G.dead();
        yx0().f110701H.dead();
        yx0().f110703J.dead();
        yx0().f110704K.dead();
        yx0().f110702I.dead();
        yx0().f110727m.dead();
        Log.m105924i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "releaseAllSharePreferences");
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
        } else if (!sharedPreferences.edit().clear().commit()) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().clear().commit() Failed!!!");
        }
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("exdevice_kv");
        if (mmkv != null) {
            mmkv.clear().commit();
        }
        C53499i a = C53502m.m60037a();
        a.getClass();
        Log.m105924i("MicroMsg.exdevice.ExdeviceInfoManager", "delAllDeviceAuthFlag");
        HashMap<Long, C53499i.C53500a> hashMap = a.f150444a;
        if (hashMap == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceInfoManager", "null == exdeviceInfoList");
        } else {
            for (Map.Entry next : hashMap.entrySet()) {
                C53499i.C53500a aVar = (C53499i.C53500a) next.getValue();
                aVar.f150450f = false;
                next.setValue(aVar);
            }
        }
        C47180k a2 = C47180k.m52466a();
        a2.getClass();
        C86709a0.m107529k().f251779b.mo123470p(538, a2);
        C47180k.f126726g = null;
        yx0().f110725k.dead();
        yx0().f110726l.dead();
        wx0();
        C41140m xx02 = xx0();
        HashMap<Long, MTimerHandler> hashMap2 = xx02.f110828c;
        if (hashMap2 != null && !hashMap2.isEmpty()) {
            for (Map.Entry<Long, MTimerHandler> value : xx02.f110828c.entrySet()) {
                ((MTimerHandler) value.getValue()).stopTimer();
            }
            xx02.f110828c.clear();
        }
        if (wx0().f110910q != null) {
            C52451c cVar = wx0().f110910q;
            cVar.getClass();
            C86709a0.m107529k().f251779b.mo123470p(XWebFeature.INTERFACE_SET_WEB_CONTENTS_SIZE, cVar);
            C86709a0.m107529k().f251779b.mo123470p(1041, cVar);
            C86709a0.m107529k().f251779b.mo123470p(XWebFeature.INTERFACE_CONFIGURE_V8_LITE, cVar);
            C86709a0.m107529k().f251779b.mo123470p(XWebFeature.INTERFACE_SHOW_HIDE, cVar);
        }
        if (wx0().f110913t != null) {
            wx0().f110913t.mo32514c();
        }
        ((C32939b) C86312j.m106911c(C32939b.class)).Ul0();
        C86709a0.m107529k().mo121129d(this.f110916w);
    }

    public void onCreate(Context context) {
        if (this.f110909p == null) {
            this.f110909p = new C41140m();
        }
        if (this.f110908o == null) {
            this.f110908o = new ExdeviceEventManager();
        }
    }
}
