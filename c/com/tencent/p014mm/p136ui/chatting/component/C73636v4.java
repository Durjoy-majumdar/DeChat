package com.tencent.p014mm.p136ui.chatting.component;

import ac0.C27838a;
import android.content.Context;
import android.content.Intent;
import ck3.C67391b;
import com.tencent.p014mm.autogen.events.CommandProcessorEvent;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.chatting.C73718h3;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85796t4;
import eb0.C116756s5;
import eb0.C45628s0;
import eb0.C75570d3;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75705n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import p156gj.C87201q;
import p156gj.C87203t;
import p270xi.C91212b;
import pc0.C100760a0;
import pc0.C77065r;
import xm2.C53388s;
import zc2.C79318h;
import zj3.C79349e0;
import zj3.C79363i;
import zj3.C79368l;
import zj3.C79382t;
import zj3.C79387w;
import zj3.C79394z0;
import zt3.C119157j;
import zt3.C119179t;

@C91212b(exportInterface = C79394z0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.v4 */
public class C73636v4 extends C73412a implements C79394z0, C75570d3, C11385n {

    /* renamed from: e */
    public C73718h3 f216212e;

    /* renamed from: f */
    public int f216213f;

    /* renamed from: g */
    public boolean f216214g = false;

    /* renamed from: com.tencent.mm.ui.chatting.component.v4$a */
    public class C73637a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f216215d;

        /* renamed from: e */
        public final /* synthetic */ String f216216e;

        /* renamed from: f */
        public final /* synthetic */ C72996z1 f216217f;

        /* renamed from: g */
        public final /* synthetic */ String f216218g;

        /* renamed from: h */
        public final /* synthetic */ boolean f216219h;

        /* renamed from: i */
        public final /* synthetic */ String f216220i;

        /* renamed from: j */
        public final /* synthetic */ String f216221j;

        /* renamed from: n */
        public final /* synthetic */ String f216222n;

        /* renamed from: o */
        public final /* synthetic */ int f216223o;

        /* renamed from: p */
        public final /* synthetic */ Map f216224p;

        /* renamed from: q */
        public final /* synthetic */ C75705n0 f216225q;

        /* renamed from: r */
        public final /* synthetic */ Context f216226r;

        public C73637a(boolean z, String str, C72996z1 z1Var, String str2, boolean z2, String str3, String str4, String str5, int i, Map map, C75705n0 n0Var, Context context) {
            this.f216215d = z;
            this.f216216e = str;
            this.f216217f = z1Var;
            this.f216218g = str2;
            this.f216219h = z2;
            this.f216220i = str3;
            this.f216221j = str4;
            this.f216222n = str5;
            this.f216223o = i;
            this.f216224p = map;
            this.f216225q = n0Var;
            this.f216226r = context;
        }

        public void run() {
            C75705n0 n0Var;
            Log.m105924i("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage begin send txt msg");
            long currentTimeMillis = System.currentTimeMillis();
            if (C73636v4.this.f215752d == null) {
                Log.m105928w("MicroMsg.ChattingUI.SendTextComponent", "NULL == mChattingContext");
                return;
            }
            C85405m.m105411a(20);
            if (this.f216215d) {
                C97625j3.m125815e().mo123460f(new C27838a(this.f216216e, this.f216217f.getUsername(), this.f216218g));
                return;
            }
            if (this.f216219h) {
                C116756s5.m164691d().mo180727a(10076, 1);
            }
            if (Util.isNullOrNil(this.f216220i)) {
                Log.m105920e("MicroMsg.ChattingUI.SendTextComponent", "toUser is null or nil!");
                return;
            }
            int y = C45628s0.m50810y(this.f216220i);
            if (Util.isNullOrNil(this.f216221j)) {
                Log.m105928w("MicroMsg.ChattingUI.SendTextComponent", "tempUser is null");
                return;
            }
            String str = this.f216222n;
            C100760a0.C100764f a = C100760a0.m131931a(this.f216221j);
            a.f295190d = y;
            a.f295191e = this.f216223o;
            a.f295189c = str;
            a.f295187a = this.f216221j;
            a.f295193g = this.f216224p;
            a.f295194h = 5;
            C100760a0.C89338b a2 = a.mo140195a();
            T t = a2.f257313a;
            if ((t instanceof C77065r) && (n0Var = this.f216225q) != null) {
                ((C77065r) t).f225116p = n0Var;
            }
            a2.mo123694a();
            if (C72996z1.m85842m5(this.f216220i)) {
                String j = C87203t.m108274j();
                C97625j3.m125815e().mo123460f(new C53388s(j, this.f216218g + " key " + C85796t4.m105983jo() + " local key " + C85796t4.m105984qq() + "NetType:" + NetStatusUtil.getNetTypeString(this.f216226r) + " hasNeon: " + C87201q.m108261e() + " isArmv6: " + C87201q.m108262f() + " isArmv7: " + C87201q.m108263g(), 0));
            }
            Log.m105925i("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage end cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        if (!this.f216214g) {
            C73718h3 h3Var = this.f216212e;
            synchronized (C79318h.f232860d) {
                if (!((ArrayList) C79318h.f232860d).contains(h3Var)) {
                    ((ArrayList) C79318h.f232860d).add(h3Var);
                }
            }
        }
        this.f216214g = false;
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        C73718h3 h3Var = this.f216212e;
        synchronized (C79318h.f232860d) {
            ((ArrayList) C79318h.f232860d).remove(h3Var);
        }
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        if (i == 207) {
            mo102658Y5(intent.getStringExtra("art_smiley_slelct_data"), 4);
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        C73718h3 h3Var = this.f216212e;
        synchronized (C79318h.f232860d) {
            if (!((ArrayList) C79318h.f232860d).contains(h3Var)) {
                ((ArrayList) C79318h.f232860d).add(h3Var);
            }
        }
        this.f216214g = true;
    }

    /* renamed from: Y5 */
    public final boolean mo102658Y5(String str, int i) {
        String str2;
        Class cls = C79349e0.class;
        String filterString = Util.getFilterString(str);
        if (filterString == null || filterString.length() == 0) {
            Log.m105920e("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage null");
            return false;
        }
        CommandProcessorEvent commandProcessorEvent = new CommandProcessorEvent();
        CommandProcessorEvent.C67673a aVar = commandProcessorEvent.f193536d;
        aVar.f193538a = filterString;
        aVar.f193539b = this.f215752d.mo91565f();
        commandProcessorEvent.f193536d.f193540c = this.f215752d.mo91577r();
        commandProcessorEvent.publish();
        if (commandProcessorEvent.f193537e.f193541a) {
            return true;
        }
        this.f216213f = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcSendMsgEnable(), C40318k.m43492a().getHcSendMsgDelay(), C40318k.m43492a().getHcSendMsgCPU(), C40318k.m43492a().getHcSendMsgIO(), C40318k.m43492a().getHcSendMsgThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcSendMsgTimeout(), 202, C40318k.m43492a().getHcSendMsgAction(), "MicroMsg.ChattingUI.SendTextComponent");
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage");
        }
        String n = this.f215752d.mo91573n();
        C72996z1 o = this.f215752d.mo91574o();
        String r = this.f215752d.mo91577r();
        boolean z = ((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class)).getCount() == 0 && C72996z1.m85848s5(this.f215752d.mo91577r());
        try {
            str2 = ((C79349e0) this.f215752d.f193278b.mo102812a(cls)).mo102236A5(this.f215752d.mo91577r());
        } catch (NullPointerException e) {
            Log.printErrStackTrace("MicroMsg.ChattingUI.SendTextComponent", e, "", new Object[0]);
            str2 = null;
        }
        String str3 = str2;
        C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(C79387w.class);
        int e0 = wVar.mo102193k1().mo100396e0(r, i);
        ChatFooter k1 = wVar.mo102193k1();
        HashMap<String, String> c0 = wVar.mo102193k1().mo100393c0(r, filterString);
        if (!Util.isNullOrNil(k1.f211824V)) {
            if (c0 == null) {
                c0 = new HashMap<>();
            }
            c0.put("similar_paste_seq", k1.f211824V);
        }
        HashMap<String, String> hashMap = c0;
        Context applicationContext = this.f215752d.mo91565f().getApplicationContext();
        C75705n0 D3 = ((C79349e0) this.f215752d.f193278b.mo102812a(cls)).mo102237D3();
        ((C79363i) this.f215752d.f193278b.mo102812a(C79363i.class)).mo102352K0();
        boolean z2 = this.f215752d.mo91574o().getUsername().equals("medianote") && (C75592q0.m90787q() & 16384) == 0;
        C119179t tVar = C119157j.f356862d;
        C73637a aVar2 = r1;
        C73637a aVar3 = new C73637a(z2, n, o, filterString, z, r, str3, filterString, e0, hashMap, D3, applicationContext);
        ((C119157j) tVar).mo183876g(aVar2, "MicroMsg.ChattingUI.SendTextComponent");
        return true;
    }

    /* renamed from: f3 */
    public void mo102659f3(String str, String str2) {
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        C97625j3.m125815e().mo123455a(522, this);
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        C97625j3.m125815e().mo123470p(522, this);
        C73718h3 h3Var = this.f216212e;
        synchronized (C79318h.f232860d) {
            ((ArrayList) C79318h.f232860d).remove(h3Var);
        }
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcSendMsgEnable(), this.f216213f);
        this.f216213f = 0;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C67391b bVar = this.f215752d;
        if (bVar != null) {
            bVar.mo91561b();
        }
        if (522 == yVar.getType()) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcSendMsgEnable(), this.f216213f);
            this.f216213f = 0;
        }
    }

    /* renamed from: r0 */
    public boolean mo102660r0(String str) {
        return mo102658Y5(str, 0);
    }

    /* renamed from: s */
    public void mo102661s(String str) {
        ((C79382t) this.f215752d.f193278b.mo102812a(C79382t.class)).mo109366D(str);
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        this.f216212e = new C73718h3(this.f215752d);
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        C97625j3.m125815e().mo123470p(522, this);
        C73718h3 h3Var = this.f216212e;
        synchronized (C79318h.f232860d) {
            ((ArrayList) C79318h.f232860d).remove(h3Var);
        }
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcSendMsgEnable(), this.f216213f);
        this.f216213f = 0;
    }
}
