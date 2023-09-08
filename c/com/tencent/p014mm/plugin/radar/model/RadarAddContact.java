package com.tencent.p014mm.plugin.radar.model;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FMessageConversationStateOpEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C86497v5;
import eg2.C75612c;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C35136m;
import ob0.C89137b0;
import p011cm.C28611c;
import p011cm.C39989b;
import rx3.C48096k;
import sf0.C48374j0;
import sx3.C110818d0;
import wd3.C78553c1;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.radar.model.RadarAddContact */
public final class RadarAddContact implements MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public final C70377b f203277d;

    /* renamed from: e */
    public final Context f203278e;

    /* renamed from: f */
    public final LinkedList<String> f203279f = new LinkedList<>();

    /* renamed from: g */
    public final HashMap<String, String> f203280g = new HashMap<>();

    /* renamed from: h */
    public final RadarAddContact$onFMsgInfoNotify$1 f203281h = new RadarAddContact$onFMsgInfoNotify$1(this, C40008f.f107254d);

    /* renamed from: i */
    public final C70380f f203282i = new C70380f(this);

    /* renamed from: j */
    public final MMHandler f203283j = new MMHandler();

    /* renamed from: com.tencent.mm.plugin.radar.model.RadarAddContact$a */
    public final class C42801a implements C11385n {

        /* renamed from: d */
        public final C42802c f115863d;

        /* renamed from: e */
        public final LinkedList<String> f115864e = new LinkedList<>();

        /* renamed from: f */
        public LinkedList<Integer> f115865f;

        /* renamed from: g */
        public String f115866g;

        public C42801a(C42802c cVar) {
            this.f115863d = cVar;
        }

        /* renamed from: a */
        public final void mo66954a(String str, LinkedList<Integer> linkedList) {
            boolean z = false;
            Assert.assertTrue(str != null && str.length() > 0);
            if (linkedList != null) {
                z = true;
            }
            Assert.assertTrue(z);
            C86709a0.m107524d().mo123455a(30, this);
            this.f115865f = linkedList;
            this.f115866g = str;
            if (str != null) {
                this.f115864e.add(str);
            }
            ((C78553c1) ((C39989b) C86312j.m106911c(C39989b.class)).Sv0(RadarAddContact.this.mo96912d(), (C39989b.C39992e) null)).mo108533i(this.f115864e, linkedList);
        }

        /* renamed from: b */
        public final void mo66955b(boolean z, boolean z2, String str, String str2) {
            C86709a0.m107524d().mo123470p(30, this);
            C42802c cVar = this.f115863d;
            if (cVar != null) {
                cVar.mo66957a(z, z2, str, str2);
            }
        }

        /* renamed from: c */
        public final void mo66956c(String str, String str2, int i) {
            C87412m.m108594g(str2, "verifyTicket");
            Assert.assertTrue("username is null", str != null && str.length() > 0);
            C86709a0.m107524d().mo123455a(30, this);
            C89137b0 d = C86709a0.m107524d();
            C28611c sf02 = ((C39989b) C86312j.m106911c(C39989b.class)).sf0(3, str, str2, i);
            C87412m.m108592e(sf02, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d.mo123460f((C117747y) sf02);
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            Log.m105918d("MicroMsg.RadarAddContact", "onSceneEnd, errType = " + i + ", errCode = " + i2);
            if (yVar.getType() != 30) {
                Log.m105928w("MicroMsg.RadarAddContact", "not expected scene,  type = " + yVar.getType());
            } else if (((C28611c) yVar).mo56095v0() == 2) {
                if (i == 0 && i2 == 0) {
                    mo66955b(false, true, this.f115866g, "");
                    return;
                }
                if (i == 4 && i2 == -34) {
                    str = RadarAddContact.this.f203278e.getString(C0966R.string.exz);
                } else if (i == 4 && i2 == -94) {
                    str = RadarAddContact.this.f203278e.getString(C0966R.string.f360807ey2);
                } else if (i != 4 || (!(i2 == -24 || i2 == -101) || str == null)) {
                    str = RadarAddContact.this.f203278e.getString(C0966R.string.ilv);
                }
                C87412m.m108593f(str, "when {\n                 …il)\n                    }");
                mo66955b(false, false, this.f115866g, str);
            } else if (i == 0 && i2 == 0) {
                mo66955b(true, false, this.f115866g, "");
            } else if (i2 == -44) {
                ((C78553c1) ((C39989b) C86312j.m106911c(C39989b.class)).Sv0(RadarAddContact.this.f203278e, (C39989b.C39992e) null)).mo108533i(this.f115864e, this.f115865f);
            } else if (i2 == -87) {
                mo66955b(false, false, this.f115866g, RadarAddContact.this.f203278e.getString(C0966R.string.bkh));
            } else if (i2 != -24 || Util.isNullOrNil(str)) {
                mo66955b(false, false, this.f115866g, (i == 4 && i2 == -22) ? RadarAddContact.this.f203278e.getString(C0966R.string.f7410fi) : RadarAddContact.this.f203278e.getString(C0966R.string.f7409fh));
            } else {
                String str2 = this.f115866g;
                if (str == null) {
                    str = "";
                }
                mo66955b(false, false, str2, str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.model.RadarAddContact$c */
    public interface C42802c {
        /* renamed from: a */
        void mo66957a(boolean z, boolean z2, String str, String str2);
    }

    /* renamed from: com.tencent.mm.plugin.radar.model.RadarAddContact$b */
    public interface C70377b {
        /* renamed from: b */
        void mo96916b(boolean z, String str, String str2, long j);

        /* renamed from: c */
        void mo96917c(C72996z1 z1Var);

        /* renamed from: f */
        void mo96918f(C72996z1 z1Var);

        /* renamed from: g */
        void mo96919g(boolean z, boolean z2, String str, String str2, long j);
    }

    /* renamed from: com.tencent.mm.plugin.radar.model.RadarAddContact$d */
    public enum C70378d {
        Stranger,
        Verifying,
        Added,
        NeedVerify
    }

    /* renamed from: com.tencent.mm.plugin.radar.model.RadarAddContact$e */
    public static final class C70379e implements C42802c {

        /* renamed from: a */
        public final /* synthetic */ RadarAddContact f203289a;

        /* renamed from: b */
        public final /* synthetic */ String f203290b;

        /* renamed from: c */
        public final /* synthetic */ long f203291c;

        public C70379e(RadarAddContact radarAddContact, String str, long j) {
            this.f203289a = radarAddContact;
            this.f203290b = str;
            this.f203291c = j;
        }

        /* renamed from: a */
        public void mo66957a(boolean z, boolean z2, String str, String str2) {
            if (z) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                if (((int) z1Var.f108320R1) > 0) {
                    C45628s0.m50775g0(z1Var);
                }
                RadarAddContact.m82904b(this.f203289a, str, 1);
                if (C110818d0.m150903D(this.f203289a.f203279f, str)) {
                    C24564k0.m30737a(this.f203289a.f203279f).remove(str);
                }
                Log.m105919d("MicroMsg.RadarAddContact", "addContact %s return ok", this.f203290b);
            } else if (z2) {
                if (str != null && !this.f203289a.f203279f.contains(str)) {
                    this.f203289a.f203279f.add(str);
                }
                RadarAddContact.m82904b(this.f203289a, str, 2);
                Log.m105919d("MicroMsg.RadarAddContact", "addContact has sent verify to %s", this.f203290b);
            } else {
                Log.m105918d("MicroMsg.RadarAddContact", "addContact return not ok, user canceled or error");
            }
            RadarAddContact radarAddContact = this.f203289a;
            radarAddContact.f203283j.post(new C75612c(radarAddContact, z, z2, str2, str, this.f203291c));
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.model.RadarAddContact$f */
    public static final class C70380f implements C86497v5.C86498c {

        /* renamed from: d */
        public final /* synthetic */ RadarAddContact f203292d;

        public C70380f(RadarAddContact radarAddContact) {
            this.f203292d = radarAddContact;
        }

        /* renamed from: C1 */
        public void mo23909C1(C35136m.C35138c cVar) {
            throw new C48096k("An operation is not implemented: not implemented");
        }

        /* renamed from: Y */
        public void mo23910Y(C35136m.C35137a aVar) {
            C87412m.m108594g(aVar, "addMsgInfo");
            String g = C48374j0.m53718g(aVar.f94242a.f227631h);
            Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
            if (parseXml != null && C87412m.m108589b(parseXml.get(".sysmsg.addcontact.type"), "1")) {
                String str = parseXml.get(".sysmsg.addcontact.username");
                String str2 = parseXml.get(".sysmsg.addcontact.encryptusername");
                if (!(str == null || C112551y.m153811k(str))) {
                    if (!(str2 == null || C112551y.m153811k(str2))) {
                        C72996z1 z1Var = new C72996z1();
                        z1Var.setUsername(str);
                        z1Var.mo62874S2(str2);
                        this.f203292d.mo96914f(z1Var);
                        Log.m105919d("MicroMsg.RadarAddContact", "receive contact added system message useranme %s, encypt %s", z1Var.getUsername(), z1Var.mo73978v2());
                        return;
                    }
                }
                Log.m105921e("MicroMsg.RadarAddContact", "error! server return incorrect content! : %s", g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.model.RadarAddContact$g */
    public static final class C70381g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RadarAddContact f203293d;

        /* renamed from: e */
        public final /* synthetic */ C72996z1 f203294e;

        public C70381g(RadarAddContact radarAddContact, C72996z1 z1Var) {
            this.f203293d = radarAddContact;
            this.f203294e = z1Var;
        }

        public final void run() {
            this.f203293d.f203277d.mo96917c(this.f203294e);
        }
    }

    public RadarAddContact(C70377b bVar, Context context) {
        C87412m.m108594g(bVar, "delegate");
        C87412m.m108594g(context, "context");
        this.f203277d = bVar;
        this.f203278e = context;
    }

    /* renamed from: a */
    public static final C72996z1 m82903a(RadarAddContact radarAddContact, C72963f4.C72971h hVar) {
        radarAddContact.getClass();
        C72996z1 z1Var = new C72996z1();
        if (hVar != null) {
            z1Var.setUsername(hVar.f212737a);
            z1Var.mo62874S2(hVar.f212760x);
            z1Var.mo62857I2(hVar.f212738b);
            z1Var.mo62878U2(hVar.f212739c);
            z1Var.mo62882W2(hVar.f212741e);
            z1Var.mo62884X2(hVar.f212740d);
            z1Var.mo62900f4(hVar.f212751o);
            z1Var.mo62902g4(hVar.f212752p);
            z1Var.mo62892b4(hVar.mo101044k());
            z1Var.mo62865M3(hVar.mo101036c());
        } else {
            Log.m105920e("MicroMsg.RadarAddContact", "verify is null! must be parsed error before!");
        }
        return z1Var;
    }

    /* renamed from: b */
    public static final void m82904b(RadarAddContact radarAddContact, String str, int i) {
        radarAddContact.getClass();
        FMessageConversationStateOpEvent fMessageConversationStateOpEvent = new FMessageConversationStateOpEvent();
        FMessageConversationStateOpEvent.C67694a aVar = fMessageConversationStateOpEvent.f193601d;
        aVar.getClass();
        aVar.f193604b = str;
        aVar.f193603a = i;
        fMessageConversationStateOpEvent.publish();
    }

    /* renamed from: c */
    public final long mo96911c(String str) {
        C87412m.m108594g(str, "username");
        long currentTimeMillis = System.currentTimeMillis();
        C42801a aVar = new C42801a(new C70379e(this, str, currentTimeMillis));
        LinkedList linkedList = new LinkedList();
        linkedList.add(48);
        aVar.mo66954a(str, linkedList);
        return currentTimeMillis;
    }

    /* renamed from: d */
    public final Context mo96912d() {
        return this.f203278e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r5.f203279f.contains(r6) != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r5.f203279f.contains(r6) != false) goto L_0x0049;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.radar.model.RadarAddContact.C70378d mo96913e(java.lang.String r6) {
        /*
            r5 = this;
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r0 = com.tencent.p014mm.plugin.radar.model.RadarAddContact.C70378d.Verifying
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r1 = com.tencent.p014mm.plugin.radar.model.RadarAddContact.C70378d.Stranger
            java.lang.String r2 = "username"
            gy3.C87412m.m108594g(r6, r2)
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r2.get(r6)
            if (r2 == 0) goto L_0x0041
            long r3 = r2.f108320R1
            int r4 = (int) r3
            if (r4 != 0) goto L_0x0022
            goto L_0x0041
        L_0x0022:
            boolean r2 = r2.mo62927s3()
            if (r2 == 0) goto L_0x002b
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r0 = com.tencent.p014mm.plugin.radar.model.RadarAddContact.C70378d.Added
            goto L_0x0049
        L_0x002b:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r5.f203280g
            boolean r2 = r2.containsKey(r6)
            if (r2 == 0) goto L_0x0036
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r0 = com.tencent.p014mm.plugin.radar.model.RadarAddContact.C70378d.NeedVerify
            goto L_0x0049
        L_0x0036:
            java.util.LinkedList<java.lang.String> r2 = r5.f203279f
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x003f
            goto L_0x0049
        L_0x003f:
            r0 = r1
            goto L_0x0049
        L_0x0041:
            java.util.LinkedList<java.lang.String> r2 = r5.f203279f
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x003f
        L_0x0049:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            r1[r6] = r0
            java.lang.String r6 = "MicroMsg.RadarAddContact"
            java.lang.String r2 = "query username(%s) status %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.radar.model.RadarAddContact.mo96913e(java.lang.String):com.tencent.mm.plugin.radar.model.RadarAddContact$d");
    }

    /* renamed from: f */
    public final void mo96914f(C72996z1 z1Var) {
        mo96915g(z1Var);
        this.f203280g.remove(z1Var.getUsername());
        this.f203280g.remove(z1Var.mo73978v2());
        this.f203283j.post(new C70381g(this, z1Var));
    }

    /* renamed from: g */
    public final void mo96915g(C72996z1 z1Var) {
        if (this.f203279f.contains(z1Var.getUsername())) {
            this.f203279f.remove(z1Var.getUsername());
        }
        if (this.f203279f.contains(z1Var.mo73978v2())) {
            this.f203279f.remove(z1Var.mo73978v2());
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        C87412m.m108594g(mStorageEx, "stg");
        Log.m105919d("MicroMsg.RadarAddContact", "onNotifyChange event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
        if (obj == null || !(obj instanceof String)) {
            Log.m105921e("MicroMsg.RadarAddContact", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        String str = (String) obj;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var != null && z1Var.mo62927s3()) {
            Log.m105919d("MicroMsg.RadarAddContact", "ContactStg onNotifyChange %s", str);
            mo96914f(z1Var);
        }
    }
}
