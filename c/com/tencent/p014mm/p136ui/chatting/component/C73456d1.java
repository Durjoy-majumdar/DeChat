package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ck3.C67391b;
import com.tencent.mars.smc.IDKey;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.autogen.events.ChattingUIStatusEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.HideSessionExitStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct;
import com.tencent.p014mm.booter.StayTimeReport;
import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.modelstat.C68144a;
import com.tencent.p014mm.p136ui.chatting.C73322b4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C96980c;
import d62.C7241k;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C45629t0;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import ht1.C60168f2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import kj2.C117407d;
import lu3.C88656g;
import mk3.C76775c;
import mk3.C76776d;
import ob0.C35136m;
import ol0.C117792a0;
import p227rn.C48053v;
import p270xi.C91212b;
import p606mm.C99933h;
import p680ru.C77569h;
import p740wo.C53193b;
import rb0.C47984k;
import sf0.C77702q0;
import te3.p85;
import zj3.C79346d0;
import zj3.C79348e;
import zj3.C79362h1;
import zj3.C79365j;
import zj3.C79366k;
import zj3.C79371n;
import zj3.C79377q;
import zt3.C119157j;

@C91212b(exportInterface = C79371n.class)
/* renamed from: com.tencent.mm.ui.chatting.component.d1 */
public class C73456d1 extends C73412a implements C79371n {

    /* renamed from: e */
    public HashSet<Long> f215839e = new HashSet<>();

    /* renamed from: f */
    public int f215840f;

    /* renamed from: g */
    public HashSet<Long> f215841g = new HashSet<>();

    /* renamed from: h */
    public HashSet<Long> f215842h = new HashSet<>();

    /* renamed from: i */
    public int f215843i = 0;

    /* renamed from: j */
    public boolean f215844j = false;

    /* renamed from: n */
    public C7241k.C7249h f215845n = new C6778d();

    /* renamed from: o */
    public long f215846o = 0;

    /* renamed from: p */
    public boolean f215847p = false;

    /* renamed from: q */
    public String f215848q = null;

    /* renamed from: r */
    public long f215849r = 0;

    /* renamed from: s */
    public long f215850s = 0;

    /* renamed from: t */
    public int f215851t = 0;

    /* renamed from: u */
    public int f215852u = 0;

    /* renamed from: v */
    public int f215853v = 0;

    /* renamed from: w */
    public boolean f215854w = false;

    /* renamed from: x */
    public long f215855x;

    /* renamed from: y */
    public int f215856y;

    /* renamed from: com.tencent.mm.ui.chatting.component.d1$d */
    public class C6778d implements C7241k.C7249h {
        public C6778d() {
        }

        /* renamed from: K0 */
        public void mo7772K0(String str, Map<String, String> map, C35136m.C35137a aVar) {
            OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct = new OpenIMSucceedContactLogStruct();
            openIMSucceedContactLogStruct.mo1063s(C73456d1.this.f215752d.f193291o);
            openIMSucceedContactLogStruct.mo1064t(C73456d1.this.f215752d.mo91577r());
            openIMSucceedContactLogStruct.f10024f = 1;
            openIMSucceedContactLogStruct.f10025g = 1;
            openIMSucceedContactLogStruct.f10029k = 1;
            openIMSucceedContactLogStruct.mo86054n();
        }

        /* renamed from: u2 */
        public void mo7773u2(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.d1$a */
    public class C73457a implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f215857d;

        public C73457a(C73456d1 d1Var, C72963f4 f4Var) {
            this.f215857d = f4Var;
        }

        public String getKey() {
            return "ChattingUI.expExposeReport";
        }

        public void run() {
            C68144a.m80547c(this.f215857d, C68144a.C68145a.Expose);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.d1$b */
    public class C73458b implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f215858d;

        public C73458b(C72963f4 f4Var) {
            this.f215858d = f4Var;
        }

        public String getKey() {
            return "ChattingUI.appExposeReport";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x007b, code lost:
            r0 = eb0.C75604z3.m90848t(r1.getContent());
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                com.tencent.mm.ui.chatting.component.d1 r0 = com.tencent.p014mm.p136ui.chatting.component.C73456d1.this
                com.tencent.mm.storage.f4 r1 = r7.f215858d
                java.util.HashSet<java.lang.Long> r2 = r0.f215842h
                long r3 = r1.mo108774y2()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r2.add(r3)
                ad0.t r2 = new ad0.t
                r2.<init>()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                long r4 = r1.mo108774y2()
                r3.append(r4)
                java.lang.String r4 = ","
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r5 = "20MessageID"
                r2.mo32a(r5, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int r5 = r1.getType()
                r3.append(r5)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r5 = "21MessageInnerType"
                r2.mo32a(r5, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = r1.mo108768t()
                r3.append(r5)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r5 = "22currChatName"
                r2.mo32a(r5, r3)
                int r3 = r1.mo108769t2()
                r5 = 1
                r6 = 0
                if (r3 != r5) goto L_0x006d
                java.lang.String r0 = eb0.C75592q0.m90789s()
                goto L_0x009a
            L_0x006d:
                ck3.b r0 = r0.f215752d
                boolean r0 = r0.mo91582w()
                if (r0 == 0) goto L_0x0096
                java.lang.String r0 = r1.getContent()
                if (r0 == 0) goto L_0x0093
                java.lang.String r0 = r1.getContent()
                int r0 = eb0.C75604z3.m90848t(r0)
                r3 = -1
                if (r0 == r3) goto L_0x0093
                java.lang.String r3 = r1.getContent()
                java.lang.String r0 = r3.substring(r6, r0)
                java.lang.String r0 = r0.trim()
                goto L_0x009a
            L_0x0093:
                java.lang.String r0 = ""
                goto L_0x009a
            L_0x0096:
                java.lang.String r0 = r1.mo108768t()
            L_0x009a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r4)
                java.lang.String r0 = r3.toString()
                java.lang.String r3 = "23msgPostUserName"
                r2.mo32a(r3, r0)
                java.lang.String r0 = r1.getContent()
                r1 = 0
                com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r1)
                if (r0 != 0) goto L_0x00ba
                goto L_0x0125
            L_0x00ba:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = r0.f195562d
                r1.append(r3)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.String r3 = "24AppId"
                r2.mo32a(r3, r1)
                java.lang.String r1 = r0.f195535U1
                if (r1 == 0) goto L_0x0100
                te3.bb4 r1 = new te3.bb4
                r1.<init>()
                java.lang.String r0 = r0.f195535U1
                byte[] r0 = android.util.Base64.decode(r0, r6)
                r1.parseFrom(r0)     // Catch:{ Exception -> 0x00e3 }
                goto L_0x00e4
            L_0x00e3:
            L_0x00e4:
                te3.za4 r0 = r1.f226994f
                if (r0 == 0) goto L_0x0100
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                te3.za4 r1 = r1.f226994f
                java.lang.String r1 = r1.f186651d
                r0.append(r1)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "25SourceAppId"
                r2.mo32a(r1, r0)
            L_0x0100:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "appExposeReport report logbuffer(13634): "
                r0.append(r1)
                java.lang.String r1 = r2.mo34c()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.ChattingUI.ChattingReportComponent"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r0)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r1 = 13634(0x3542, float:1.9105E-41)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                r3[r6] = r2
                r0.mo160131h(r1, r3)
            L_0x0125:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73456d1.C73458b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.d1$c */
    public class C73459c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f215860d;

        public C73459c(C73456d1 d1Var, String str) {
            this.f215860d = str;
        }

        public void run() {
            StayTimeReport.f237543q.mo112561a(this.f215860d);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.d1$e */
    public class C73460e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f215861d;

        /* renamed from: e */
        public final /* synthetic */ String f215862e;

        /* renamed from: f */
        public final /* synthetic */ C72996z1 f215863f;

        public C73460e(String str, String str2, C72996z1 z1Var) {
            this.f215861d = str;
            this.f215862e = str2;
            this.f215863f = z1Var;
        }

        public void run() {
            if (!Util.isNullOrNil(this.f215861d)) {
                C73456d1.this.f215851t = C45629t0.m50817d(this.f215861d, C45628s0.f123397c);
                boolean z = false;
                Log.m105925i("MicroMsg.ChattingUI.ChattingReportComponent", "dkchatmsg:name:%s unRead:%s entryTime:%s(%s)", this.f215861d, Integer.valueOf(C73456d1.this.f215851t), Util.unixTimeMsToTime(C73456d1.this.f215849r), Long.valueOf(C73456d1.this.f215849r));
                C67391b bVar = C73456d1.this.f215752d;
                String str = this.f215862e;
                bVar.getClass();
                if (C72996z1.m85820U5(str) || C72996z1.m85847r5(str)) {
                    z = true;
                }
                if (z) {
                    int i = this.f215863f.f149512S;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.d1$f */
    public class C73461f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f215865d;

        /* renamed from: e */
        public final /* synthetic */ int f215866e;

        /* renamed from: f */
        public final /* synthetic */ int f215867f;

        /* renamed from: g */
        public final /* synthetic */ int f215868g;

        public C73461f(String str, int i, int i2, int i3) {
            this.f215865d = str;
            this.f215866e = i;
            this.f215867f = i2;
            this.f215868g = i3;
        }

        public void run() {
            int i;
            int i2;
            Class cls = C53193b.class;
            if (!Util.isNullOrNil(this.f215865d)) {
                int p1 = ((C53193b) C86312j.m106911c(cls)).mo73729p1(this.f215865d);
                C75875l z = C97625j3.m125812b().mo105911z();
                String str = this.f215865d;
                C73456d1 d1Var = C73456d1.this;
                long j = d1Var.f215849r;
                long j2 = d1Var.f215850s;
                C72972g4 g4Var = (C72972g4) z;
                g4Var.getClass();
                if (j2 < j) {
                    long j3 = j;
                    j = j2;
                    j2 = j3;
                }
                String str2 = "SELECT * FROM " + g4Var.hy0(str) + " WHERE" + g4Var.iy0(str) + "AND " + "createTime" + " >= " + j + " AND " + "createTime" + " <= " + j2;
                Log.m105918d("MicroMsg.MsgInfoStorage", "get cursor: " + str2);
                Cursor rawQuery = g4Var.f212775p.rawQuery(str2, (String[]) null);
                if (rawQuery == null || !rawQuery.moveToFirst()) {
                    i2 = 0;
                    i = 0;
                } else {
                    C72963f4 f4Var = new C72963f4();
                    i2 = 0;
                    i = 0;
                    do {
                        f4Var.convertFrom(rawQuery);
                        if (f4Var.mo108769t2() == 1) {
                            i++;
                        } else {
                            i2++;
                        }
                    } while (rawQuery.moveToNext());
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                Object[] objArr = new Object[11];
                objArr[0] = this.f215865d;
                C73456d1 d1Var2 = C73456d1.this;
                objArr[1] = Long.valueOf(d1Var2.f215850s - d1Var2.f215849r);
                objArr[2] = Integer.valueOf(p1);
                objArr[3] = Integer.valueOf(C73456d1.this.f215851t + i2);
                objArr[4] = Integer.valueOf(i);
                objArr[5] = Integer.valueOf(C73456d1.this.f215851t);
                objArr[6] = Integer.valueOf(this.f215866e);
                objArr[7] = Integer.valueOf(this.f215867f);
                String str3 = C73456d1.this.f215752d.f193292p;
                String str4 = "";
                if (str3 == null) {
                    str3 = str4;
                }
                objArr[8] = str3;
                objArr[9] = Integer.valueOf(this.f215868g);
                objArr[10] = Integer.valueOf(C73456d1.this.f215853v);
                Log.m105919d("MicroMsg.ChattingUI.ChattingReportComponent", "dkchatmsg MuteRoomKvStat, muteRoomName:%s, stayTime:%d, memberNum:%d, newMsg:%d, sendMsgNum:%d, unreadMsgNum:%d, backToHistoryState:%d, isMute:%d  ,session:%s ,enterSceneForGroupChatsState:%d， msgRedType：%s", objArr);
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr2 = new Object[13];
                objArr2[0] = this.f215865d;
                C73456d1 d1Var3 = C73456d1.this;
                objArr2[1] = Long.valueOf(d1Var3.f215850s - d1Var3.f215849r);
                objArr2[2] = Integer.valueOf(p1);
                objArr2[3] = Integer.valueOf(C73456d1.this.f215851t + i2);
                objArr2[4] = Integer.valueOf(i);
                objArr2[5] = Integer.valueOf(C73456d1.this.f215851t);
                objArr2[6] = Integer.valueOf(this.f215866e);
                objArr2[7] = Integer.valueOf(this.f215867f);
                C73456d1 d1Var4 = C73456d1.this;
                String str5 = d1Var4.f215752d.f193292p;
                if (str5 != null) {
                    str4 = str5;
                }
                objArr2[8] = str4;
                objArr2[9] = Integer.valueOf(d1Var4.f215840f);
                objArr2[10] = Integer.valueOf(this.f215868g);
                objArr2[11] = Integer.valueOf(C73456d1.this.f215853v);
                objArr2[12] = Integer.valueOf(((C53193b) C86312j.m106911c(cls)).mo73723Hd(this.f215865d) ? 1 : 0);
                nVar.mo160131h(12077, objArr2);
            }
        }
    }

    /* renamed from: C3 */
    public void mo102405C3(C72963f4 f4Var) {
        if (!this.f215839e.contains(Long.valueOf(f4Var.mo108774y2()))) {
            this.f215839e.add(Long.valueOf(f4Var.mo108774y2()));
            ((C119157j) C119157j.f356862d).mo183875f(new C73450c1(this, f4Var, false));
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        C73322b4.m86462a().mo102140b(2);
        p85 p85 = (p85) ((C99933h) C86312j.m106911c(C99933h.class)).mo84402PX(13, "report_" + this.f215752d.mo91577r());
        if (p85 != null) {
            this.f215853v = p85.f139646d;
        }
        if (!this.f215854w) {
            mo102408Z5();
        }
        this.f215854w = false;
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        Class cls = C79346d0.class;
        C73322b4.m86462a().mo102140b(3);
        if (!TextUtils.isEmpty(this.f215848q) && this.f215752d.mo91582w()) {
            this.f215850s = C75604z3.m90844p();
            String str = this.f215848q;
            this.f215848q = "";
            int E = ((C79346d0) this.f215752d.f193278b.mo102812a(cls)).mo102648E();
            if (E == 2) {
                ((C79346d0) this.f215752d.f193278b.mo102812a(cls)).mo102656z3(0);
            }
            int i = (!this.f215752d.mo91582w() || this.f215752d.mo91574o().f149512S != 0) ? 0 : 1;
            if (5 == this.f215752d.f193286j.getIntExtra("chat_from_scene", 0)) {
                Log.m105918d("MicroMsg.ChattingUI.ChattingReportComponent", "from_scene_gobal_search");
                this.f215852u = 2;
            } else {
                this.f215852u = this.f215752d.f193286j.getIntExtra("chat_from_scene_for_group_chats", 0);
            }
            int i2 = this.f215852u;
            Log.m105918d("MicroMsg.ChattingUI.ChattingReportComponent", "enterSceneForGroupChats : " + this.f215852u);
            this.f215852u = 0;
            C86709a0.m107525e().postToWorker(new C73461f(str, E, i, i2));
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        boolean z;
        this.f215846o = System.currentTimeMillis();
        this.f215847p = true;
        Class cls = C60168f2.class;
        if (!(this.f215752d.mo91574o() == null || this.f215752d.mo91577r() == null || C75592q0.m90789s() == null)) {
            ((C77569h) C86312j.m106911c(C77569h.class)).mo35243qZ(this.f215752d.mo91577r());
            if (!C75592q0.m90789s().equals(this.f215752d.mo91577r())) {
                ChattingUIStatusEvent chattingUIStatusEvent = new ChattingUIStatusEvent();
                chattingUIStatusEvent.f78735d.f78736a = true;
                chattingUIStatusEvent.publish();
            }
            C73322b4.m86462a().mo102140b(1);
            int i = 2;
            if (C72996z1.m85820U5(this.f215752d.mo91577r())) {
                ((C60168f2) C86312j.m106911c(cls)).mo8599Wt(2);
            } else {
                ((C60168f2) C86312j.m106911c(cls)).mo8599Wt(1);
            }
            boolean b = ((C79362h1) this.f215752d.f193278b.mo102812a(C79362h1.class)).mo102332b();
            int i2 = 0;
            if ("notification_messages".equals(this.f215752d.mo91577r())) {
                i = 8;
                z = true;
            } else if (C45628s0.m50738C(this.f215752d.mo91577r())) {
                C79348e eVar = (C79348e) this.f215752d.f193278b.mo102812a(C79348e.class);
                if (eVar.mo70071q1()) {
                    z = !b;
                    if (eVar.mo70075s4()) {
                        eVar.mo70076s5().mo73036o2().size();
                        i = 5;
                    } else {
                        i = 4;
                    }
                } else if (C47984k.m53335i(this.f215752d.mo91577r())) {
                    z = !b;
                    i = 3;
                } else if (((C48053v) C86312j.m106911c(C48053v.class)).mo72617gl(this.f215752d.mo91577r())) {
                    z = true;
                    i = 0;
                } else {
                    i = C47984k.m53340n(this.f215752d.mo91577r()) ? 6 : 7;
                    z = false;
                }
            } else {
                z = !b;
                if (!this.f215752d.mo91582w()) {
                    i = 1;
                }
            }
            if (!this.f215752d.mo91585z()) {
                for (String equals : C45628s0.f123409o) {
                    if (equals.equals(this.f215752d.mo91577r())) {
                        i = 0;
                    }
                }
                i2 = i;
            }
            if (i2 != 0) {
                if (!((C79365j) this.f215752d.f193278b.mo102812a(C79365j.class)).mo70105e4()) {
                    if (!((C79366k) this.f215752d.f193278b.mo102812a(C79366k.class)).mo70129g1()) {
                        if (!((C79377q) this.f215752d.f193278b.mo102812a(C79377q.class)).mo70131k2()) {
                            ((C119157j) C119157j.f356862d).mo183876g(new C85815e1(this, i2, this.f215752d.mo91577r(), z ? 1 : 0), "MicroMsg.ChattingUI.ChattingReportComponent");
                        }
                    }
                }
            }
            ((C7241k) C86312j.m106911c(C7241k.class)).mo8412pS("tmpl_type_succeed_contact", this.f215845n);
        }
        this.f215854w = true;
        mo102408Z5();
    }

    /* renamed from: W4 */
    public void mo102406W4(C72963f4 f4Var) {
        if (!this.f215844j) {
            this.f215844j = true;
            C96980c Lo = SubCoreNewABTest.wx0().mo57622Lo("100134");
            if (Lo.isValid()) {
                String str = Lo.mo135598l2().get("needUploadData");
                int i = C77702q0.f226484a;
                int i2 = 0;
                if (str != null) {
                    try {
                        if (str.length() > 0) {
                            i2 = Integer.parseInt(str);
                        }
                    } catch (NumberFormatException e) {
                        Log.printErrStackTrace("MicroMsg.Util", e, "", new Object[0]);
                    }
                }
                this.f215843i = i2;
            }
        }
        if (this.f215843i != 0 && !this.f215842h.contains(Long.valueOf(f4Var.mo108774y2()))) {
            ((C119157j) C119157j.f356862d).mo183875f(new C73458b(f4Var));
        }
    }

    /* renamed from: X5 */
    public void mo102328X5(View view, int i) {
    }

    /* renamed from: Y5 */
    public final void mo102407Y5() {
        String r = this.f215752d.mo91577r();
        ((C119157j) C119157j.f356862d).mo183876g(new C73459c(this, r), "MicroMsg.ChattingUI.ChattingReportComponent");
        ((C77569h) C86312j.m106911c(C77569h.class)).mo35242pr();
        ChattingUIStatusEvent chattingUIStatusEvent = new ChattingUIStatusEvent();
        chattingUIStatusEvent.f78735d.f78736a = false;
        chattingUIStatusEvent.publish();
        ((C7241k) C86312j.m106911c(C7241k.class)).sn0("tmpl_type_succeed_contact", this.f215845n);
        String r2 = this.f215752d.mo91577r();
        if (this.f215855x != 0) {
            HideSessionExitStruct hideSessionExitStruct = new HideSessionExitStruct();
            long j = 2;
            if (this.f215752d.f193286j.getIntExtra("chat_from_scene", 0) == 5) {
                hideSessionExitStruct.f194238d = 1;
            } else {
                hideSessionExitStruct.f194238d = 2;
            }
            hideSessionExitStruct.f194239e = hideSessionExitStruct.mo86045b("ChatName", r2, true);
            hideSessionExitStruct.f194240f = this.f215855x;
            hideSessionExitStruct.f194241g = System.currentTimeMillis();
            hideSessionExitStruct.f194242h = (long) this.f215856y;
            hideSessionExitStruct.f194243i = (long) C45629t0.m50816c(r2);
            C72976h2 j2 = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(r2);
            if (j2 != null) {
                if ("hidden_conv_parent".equalsIgnoreCase(j2.mo108782C2())) {
                    hideSessionExitStruct.f194244j = 1;
                } else if (j2.mo108821o2() > this.f215855x) {
                    if (!Util.isNullOrNil(j2.mo108823q2())) {
                        j = 3;
                    }
                    hideSessionExitStruct.f194244j = j;
                } else if (!Util.isNullOrNil(j2.mo108824r2()) || j2.mo108825s2() != 0) {
                    hideSessionExitStruct.f194244j = 4;
                }
            }
            hideSessionExitStruct.mo86054n();
            this.f215855x = 0;
        }
    }

    /* renamed from: Z5 */
    public final void mo102408Z5() {
        this.f215848q = null;
        if (C75592q0.m90789s() == null) {
            Log.m105920e("MicroMsg.ChattingUI.ChattingReportComponent", "getUsernameFromUserInfo is null!");
            return;
        }
        int i = 0;
        if (!C75592q0.m90789s().equals(this.f215752d.mo91577r()) && this.f215752d.mo91582w()) {
            this.f215848q = this.f215752d.mo91577r();
            this.f215849r = (C75604z3.m90844p() / 1000) * 1000;
            this.f215851t = 0;
            String str = this.f215848q;
            C72996z1 o = this.f215752d.mo91574o();
            C86709a0.m107525e().postToWorker(new C73460e(str, this.f215752d.mo91577r(), o));
        }
        if (this.f215847p) {
            long currentTimeMillis = System.currentTimeMillis() - this.f215846o;
            this.f215846o = 0;
            this.f215847p = false;
            C115669n nVar = C115669n.INSTANCE;
            int i2 = 8;
            long[] jArr = {0, 200, 400, 600, 800, 1000, 1500, 2000};
            while (true) {
                if (i < 8) {
                    if (currentTimeMillis >= jArr[i]) {
                        if (i == 7) {
                            break;
                        }
                        i++;
                    } else {
                        i2 = i;
                        break;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            nVar.idkeyStat(109, (long) i2, 1, true);
        }
    }

    /* renamed from: e */
    public void mo70065e() {
        C72976h2 j;
        if (Util.isNullOrNil(this.f215752d.mo91577r())) {
            C115669n.INSTANCE.idkeyStat(110, 0, 1, true);
        }
        String r = this.f215752d.mo91577r();
        this.f215855x = 0;
        if (!Util.isNullOrNil(r) && (j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(r)) != null && "hidden_conv_parent".equalsIgnoreCase(j.mo108782C2())) {
            this.f215855x = System.currentTimeMillis();
            this.f215856y = C45629t0.m50816c(r);
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        mo102407Y5();
    }

    /* renamed from: q3 */
    public void mo102409q3(C72963f4 f4Var) {
        if (!this.f215841g.contains(Long.valueOf(f4Var.mo108774y2()))) {
            this.f215841g.add(Long.valueOf(f4Var.mo108774y2()));
            ((C119157j) C119157j.f356862d).mo183875f(new C73457a(this, f4Var));
        }
    }

    /* renamed from: u3 */
    public void mo102410u3(int i) {
        this.f215840f = i;
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        mo102407Y5();
        boolean k = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU().mo101205k(this.f215752d.mo91577r());
        C76775c cVar = C76775c.f224573b;
        boolean x = this.f215752d.mo91583x();
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (x && !k) {
            if (cVar.f224574a[0] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 0, cVar.f224574a[0]));
            }
            if (cVar.f224574a[1] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 1, cVar.f224574a[1]));
            }
            if (cVar.f224574a[2] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 2, cVar.f224574a[2]));
            }
            if (cVar.f224574a[3] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 3, cVar.f224574a[3]));
            }
            if (cVar.f224574a[4] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 4, cVar.f224574a[4]));
            }
            arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 19, 1));
        } else if (!x || !k) {
            if (cVar.f224574a[0] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 20, cVar.f224574a[0]));
            }
            if (cVar.f224574a[1] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 21, cVar.f224574a[1]));
            }
            if (cVar.f224574a[2] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 22, cVar.f224574a[2]));
            }
            if (cVar.f224574a[3] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 23, cVar.f224574a[3]));
            }
            if (cVar.f224574a[4] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 24, cVar.f224574a[4]));
            }
            arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 39, 1));
        } else {
            if (cVar.f224574a[0] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 40, cVar.f224574a[0]));
            }
            if (cVar.f224574a[1] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 41, cVar.f224574a[1]));
            }
            if (cVar.f224574a[2] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 42, cVar.f224574a[2]));
            }
            if (cVar.f224574a[3] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 43, cVar.f224574a[3]));
            }
            if (cVar.f224574a[4] > 0) {
                arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 44, cVar.f224574a[4]));
            }
            arrayList.add(new IDKey((int) C117792a0.CTRL_INDEX, 59, 1));
        }
        C117407d dVar = C117407d.INSTANCE;
        dVar.mo160124a(arrayList, true);
        C76776d dVar2 = C76776d.f224575g;
        Log.m105925i("MicroMsg.GetChatroomReporter", "[report] chatroomId:%s mCount:%s mDownCount:%s mUpCount:%s mErrCount:%s mSuccessCount:%s mFetchCount:%s", this.f215752d.mo91577r(), Integer.valueOf(dVar2.f224576a), Integer.valueOf(dVar2.f224579d), Integer.valueOf(dVar2.f224580e), Integer.valueOf(dVar2.f224577b), Integer.valueOf(dVar2.f224578c), Integer.valueOf(dVar2.f224581f));
        C117407d dVar3 = dVar;
        dVar3.idkeyStat(403, 60, (long) dVar2.f224576a, true);
        dVar3.idkeyStat(403, 61, (long) dVar2.f224579d, true);
        dVar3.idkeyStat(403, 62, (long) dVar2.f224580e, true);
        dVar3.idkeyStat(403, 63, (long) dVar2.f224577b, true);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new IDKey(403, 64, dVar2.f224578c));
        arrayList2.add(new IDKey(403, 65, dVar2.f224581f));
        dVar.mo160124a(arrayList2, true);
        C73322b4.m86462a().mo102140b(4);
    }
}
