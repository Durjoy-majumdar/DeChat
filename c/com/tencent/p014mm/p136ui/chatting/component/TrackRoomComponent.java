package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ck3.C67391b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExitTrackRoomEvent;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.p136ui.C57833e1;
import com.tencent.p014mm.p136ui.base.TalkRoomPopupNav;
import com.tencent.p014mm.plugin.multitalk.model.C69856h;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import dd0.C45322a;
import dd0.C75350g;
import di3.C86312j;
import ed0.C75609c;
import ed0.C75610d;
import f40.C86709a0;
import java.util.HashSet;
import java.util.LinkedList;
import ke3.C88144b;
import nc0.C76850a;
import nj3.C76879j;
import p270xi.C91212b;
import p447aw.C103918d;
import qg0.C12215a;
import sx2.C48497j;
import t22.C118355y;
import t22.C77833z;
import zj3.C79344c1;
import zj3.C79346d0;

@C91212b(exportInterface = C79344c1.class)
/* renamed from: com.tencent.mm.ui.chatting.component.TrackRoomComponent */
public class TrackRoomComponent extends C73412a implements C79344c1, C45322a, C75609c, C69856h.C69857a, C57833e1.C57835b {

    /* renamed from: e */
    public IListener f215656e = new IListener<VoipEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -797557590;
        }

        public boolean callback(IEvent iEvent) {
            VoipEvent voipEvent = (VoipEvent) iEvent;
            if (!C86709a0.m107522a()) {
                return false;
            }
            int i = voipEvent.f194019d.f194022b;
            if (i == 5 || i == 3) {
                ExitTrackRoomEvent exitTrackRoomEvent = new ExitTrackRoomEvent();
                exitTrackRoomEvent.f193553d.f193554a = ((C118355y) C75610d.m90860b()).f353752u;
                exitTrackRoomEvent.publish();
            }
            return true;
        }
    };

    /* renamed from: f */
    public TalkRoomPopupNav f215657f;

    /* renamed from: g */
    public View f215658g;

    /* renamed from: h */
    public TalkRoomPopupNav.C73220f f215659h = new C73388e();

    /* renamed from: com.tencent.mm.ui.chatting.component.TrackRoomComponent$a */
    public class C73384a implements DialogInterface.OnClickListener {
        public C73384a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
            talkRoomServerEvent.f154883d.f154886b = true;
            talkRoomServerEvent.publish();
            TrackRoomComponent trackRoomComponent = TrackRoomComponent.this;
            trackRoomComponent.mo102269Z5(trackRoomComponent.f215752d.mo91577r());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TrackRoomComponent$b */
    public class C73385b implements DialogInterface.OnClickListener {
        public C73385b(TrackRoomComponent trackRoomComponent) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TrackRoomComponent$c */
    public class C73386c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f215661d;

        public C73386c(Runnable runnable) {
            this.f215661d = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f215661d.run();
            ExitTrackRoomEvent exitTrackRoomEvent = new ExitTrackRoomEvent();
            exitTrackRoomEvent.f193553d.f193554a = TrackRoomComponent.this.f215752d.mo91577r();
            exitTrackRoomEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TrackRoomComponent$d */
    public class C73387d implements DialogInterface.OnClickListener {
        public C73387d(TrackRoomComponent trackRoomComponent) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TrackRoomComponent$e */
    public class C73388e implements TalkRoomPopupNav.C73220f {
        public C73388e() {
        }

        /* renamed from: a */
        public void mo101905a(String str) {
            TrackRoomComponent.this.mo102262I4(str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00fe  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo101906b() {
            /*
                r6 = this;
                com.tencent.mm.ui.chatting.component.TrackRoomComponent r0 = com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.this
                ck3.b r0 = r0.f215752d
                android.app.Activity r0 = r0.mo91565f()
                boolean r0 = p182kk.C61104a.m71669y(r0)
                java.lang.String r1 = "MicroMsg.ChattingUI.TrackRoomComponent"
                if (r0 != 0) goto L_0x010e
                com.tencent.mm.ui.chatting.component.TrackRoomComponent r0 = com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.this
                ck3.b r0 = r0.f215752d
                android.app.Activity r0 = r0.mo91565f()
                boolean r0 = p182kk.C61104a.m71665u(r0)
                if (r0 != 0) goto L_0x010e
                com.tencent.mm.ui.chatting.component.TrackRoomComponent r0 = com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.this
                ck3.b r0 = r0.f215752d
                android.app.Activity r0 = r0.mo91565f()
                boolean r0 = p182kk.C61104a.m71649e(r0)
                if (r0 == 0) goto L_0x002e
                goto L_0x010e
            L_0x002e:
                ed0.a r0 = ed0.C75610d.m90859a()
                com.tencent.mm.ui.chatting.component.TrackRoomComponent r2 = com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.this
                ck3.b r2 = r2.f215752d
                com.tencent.mm.storage.z1 r2 = r2.mo91574o()
                java.lang.String r2 = r2.getUsername()
                t22.z r0 = (t22.C77833z) r0
                java.util.LinkedList r0 = r0.mo107950c(r2)
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                int r0 = r0.size()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4 = 0
                r3[r4] = r0
                java.lang.String r0 = "Click banner : %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r3)
                ed0.a r0 = ed0.C75610d.m90859a()
                com.tencent.mm.ui.chatting.component.TrackRoomComponent r1 = com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.this
                ck3.b r1 = r1.f215752d
                com.tencent.mm.storage.z1 r1 = r1.mo91574o()
                java.lang.String r1 = r1.getUsername()
                t22.z r0 = (t22.C77833z) r0
                boolean r0 = r0.mo107954g(r1)
                if (r0 == 0) goto L_0x0108
                com.tencent.mm.ui.chatting.component.TrackRoomComponent r0 = com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.this
                ck3.b r1 = r0.f215752d
                java.lang.Class<zj3.g> r3 = zj3.C79357g.class
                com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
                xi.d r1 = r1.mo102812a(r3)
                zj3.g r1 = (zj3.C79357g) r1
                boolean r1 = r1.mo102150S1()
                if (r1 != 0) goto L_0x0098
                ck3.b r1 = r0.f215752d
                java.lang.Class<zj3.e> r3 = zj3.C79348e.class
                com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
                xi.d r1 = r1.mo102812a(r3)
                zj3.e r1 = (zj3.C79348e) r1
                boolean r1 = r1.mo70079x5()
                if (r1 == 0) goto L_0x0096
                goto L_0x0098
            L_0x0096:
                r1 = 0
                goto L_0x0099
            L_0x0098:
                r1 = 1
            L_0x0099:
                ck3.b r3 = r0.f215752d
                java.lang.String r3 = r3.mo91577r()
                boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
                if (r3 == 0) goto L_0x00bf
                if (r1 != 0) goto L_0x00bf
                ck3.b r1 = r0.f215752d
                android.app.Activity r1 = r1.mo91565f()
                ck3.b r0 = r0.f215752d
                android.content.res.Resources r0 = r0.mo91572m()
                r2 = 2131838132(0x7f1144b4, float:1.9309479E38)
                java.lang.String r0 = r0.getString(r2)
                r2 = 0
                nj3.C76879j.m92748s(r1, r0, r2)
                goto L_0x010d
            L_0x00bf:
                com.tencent.mm.autogen.events.TalkRoomServerEvent r1 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
                r1.<init>()
                com.tencent.mm.autogen.events.TalkRoomServerEvent$a r3 = r1.f154883d
                r3.f154885a = r2
                r1.publish()
                com.tencent.mm.autogen.events.TalkRoomServerEvent$b r3 = r1.f154884e
                java.lang.String r3 = r3.f154887a
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                java.lang.String r5 = "fromBanner"
                if (r3 != 0) goto L_0x00fe
                ck3.b r3 = r0.f215752d
                java.lang.String r3 = r3.mo91577r()
                com.tencent.mm.autogen.events.TalkRoomServerEvent$b r1 = r1.f154884e
                java.lang.String r1 = r1.f154887a
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L_0x00e8
                goto L_0x00fe
            L_0x00e8:
                com.tencent.mm.autogen.events.TalkRoomServerEvent r1 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
                r1.<init>()
                com.tencent.mm.autogen.events.TalkRoomServerEvent$a r3 = r1.f154883d
                r3.f154886b = r2
                r1.publish()
                ck3.b r1 = r0.f215752d
                java.lang.String r1 = r1.mo91577r()
                r0.mo102273z4(r1, r5, r4)
                goto L_0x010d
            L_0x00fe:
                ck3.b r1 = r0.f215752d
                java.lang.String r1 = r1.mo91577r()
                r0.mo102273z4(r1, r5, r4)
                goto L_0x010d
            L_0x0108:
                com.tencent.mm.ui.chatting.component.TrackRoomComponent r0 = com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.this
                r0.mo102263K(r2)
            L_0x010d:
                return
            L_0x010e:
                java.lang.String r0 = "voip is running"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.C73388e.mo101906b():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TrackRoomComponent$f */
    public class C73389f implements DialogInterface.OnClickListener {
        public C73389f(TrackRoomComponent trackRoomComponent) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TrackRoomComponent$g */
    public class C73390g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f215664d;

        public C73390g(boolean z) {
            this.f215664d = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TrackRoomComponent.this.mo102261H0(this.f215664d ? "fromBanner" : "fromPluginTalk");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TrackRoomComponent$h */
    public class C73391h implements DialogInterface.OnClickListener {
        public C73391h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
            talkRoomServerEvent.f154883d.f154886b = true;
            talkRoomServerEvent.publish();
            TrackRoomComponent trackRoomComponent = TrackRoomComponent.this;
            trackRoomComponent.mo102269Z5(trackRoomComponent.f215752d.mo91577r());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TrackRoomComponent$i */
    public class C73392i implements DialogInterface.OnClickListener {
        public C73392i(TrackRoomComponent trackRoomComponent) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        Log.m105924i("MicroMsg.ChattingUI.TrackRoomComponent", "[onChattingResume]");
        Class cls = C69856h.class;
        if (C75350g.m90357a() != null) {
            ((C48497j) C75350g.m90357a()).mo73127a(this);
        }
        if (C75610d.m90859a() != null) {
            C77833z zVar = (C77833z) C75610d.m90859a();
            synchronized (zVar) {
                ((LinkedList) zVar.f226793d).add(this);
            }
        }
        if (C86312j.m106911c(cls) != null) {
            ((C69856h) C86312j.m106911c(cls)).mo96134FA(this);
        }
        HashSet<C57833e1.C57835b> hashSet = C57833e1.f165458d;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f215656e.alive();
        mo102268Y5(true);
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        Log.m105924i("MicroMsg.ChattingUI.TrackRoomComponent", "[onChattingPause]");
        if (C75350g.m90357a() != null) {
            ((C48497j) C75350g.m90357a()).mo73132f(this);
        }
        if (C75610d.m90859a() != null) {
            C77833z zVar = (C77833z) C75610d.m90859a();
            synchronized (zVar) {
                ((LinkedList) zVar.f226793d).remove(this);
            }
        }
        HashSet<C57833e1.C57835b> hashSet = C57833e1.f165458d;
        if (hashSet != null) {
            hashSet.remove(this);
        }
        this.f215656e.dead();
        ((C69856h) C86312j.m106911c(C69856h.class)).mo96148qQ(this);
    }

    /* renamed from: H0 */
    public void mo102261H0(String str) {
        Intent intent = new Intent();
        intent.putExtra("map_view_type", 6);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("map_sender_name", this.f215752d.mo91573n());
        intent.putExtra("map_talker_name", this.f215752d.mo91577r());
        intent.putExtra("fromWhereShare", str);
        C88144b.m109791i(this.f215752d.mo91565f(), FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
    }

    /* renamed from: I4 */
    public void mo102262I4(String str) {
        Class cls = C103918d.class;
        if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            if (!(((C103918d) C86312j.m106911c(cls)).Lb0(this.f215752d.mo91565f(), "android.permission.ACCESS_FINE_LOCATION") && ((C103918d) C86312j.m106911c(cls)).Lb0(this.f215752d.mo91565f(), "android.permission.ACCESS_COARSE_LOCATION"))) {
                if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                    C12215a.m11778c(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30762, true);
                    return;
                } else {
                    ((C103918d) C86312j.m106911c(cls)).b40(this.f215752d.mo91565f(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 68);
                    return;
                }
            }
        } else {
            boolean Uu0 = ((C103918d) C86312j.m106911c(cls)).Uu0(this.f215752d.mo91565f(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 68, (String) null, (String) null);
            Log.m105919d("MicroMsg.ChattingUI.TrackRoomComponent", "summerper checkPermission checkLocation[%b]", Boolean.valueOf(Uu0));
            if (!Uu0) {
                return;
            }
        }
        mo102261H0(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x015a  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102263K(boolean r9) {
        /*
            r8 = this;
            ck3.b r0 = r8.f215752d
            java.lang.Class<zj3.g> r1 = zj3.C79357g.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.g r0 = (zj3.C79357g) r0
            boolean r0 = r0.mo102150S1()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0029
            ck3.b r0 = r8.f215752d
            java.lang.Class<zj3.e> r3 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r3)
            zj3.e r0 = (zj3.C79348e) r0
            boolean r0 = r0.mo70079x5()
            if (r0 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            ck3.b r3 = r8.f215752d
            java.lang.String r3 = r3.mo91577r()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            r4 = 0
            if (r3 == 0) goto L_0x0050
            if (r0 != 0) goto L_0x0050
            ck3.b r9 = r8.f215752d
            android.app.Activity r9 = r9.mo91565f()
            ck3.b r0 = r8.f215752d
            android.content.res.Resources r0 = r0.mo91572m()
            r1 = 2131837625(0x7f1142b9, float:1.930845E38)
            java.lang.String r0 = r0.getString(r1)
            nj3.C76879j.m92748s(r9, r0, r4)
            return
        L_0x0050:
            com.tencent.mm.autogen.events.TalkRoomServerEvent r0 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r0.<init>()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$a r3 = r0.f154883d
            r3.f154885a = r1
            r0.publish()
            r3 = 2131837615(0x7f1142af, float:1.930843E38)
            if (r9 != 0) goto L_0x015a
            ed0.a r5 = ed0.C75610d.m90859a()
            if (r5 == 0) goto L_0x0118
            ed0.a r5 = ed0.C75610d.m90859a()
            ck3.b r6 = r8.f215752d
            com.tencent.mm.storage.z1 r6 = r6.mo91574o()
            java.lang.String r6 = r6.getUsername()
            t22.z r5 = (t22.C77833z) r5
            boolean r5 = r5.mo107954g(r6)
            if (r5 == 0) goto L_0x0118
            ed0.a r0 = ed0.C75610d.m90859a()
            ck3.b r3 = r8.f215752d
            com.tencent.mm.storage.z1 r3 = r3.mo91574o()
            java.lang.String r3 = r3.getUsername()
            t22.z r0 = (t22.C77833z) r0
            java.util.LinkedList r0 = r0.mo107950c(r3)
            if (r0 == 0) goto L_0x00b0
            ck3.b r3 = r8.f215752d
            java.lang.String r3 = r3.mo91573n()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00b0
            ck3.b r0 = r8.f215752d
            android.content.res.Resources r0 = r0.mo91572m()
            r3 = 2131837620(0x7f1142b4, float:1.930844E38)
            java.lang.String r0 = r0.getString(r3)
            r3 = 2131825138(0x7f1111f2, float:1.9283124E38)
            goto L_0x00c0
        L_0x00b0:
            ck3.b r0 = r8.f215752d
            android.content.res.Resources r0 = r0.mo91572m()
            r3 = 2131837621(0x7f1142b5, float:1.9308442E38)
            java.lang.String r0 = r0.getString(r3)
            r3 = 2131831690(0x7f112b8a, float:1.9296413E38)
        L_0x00c0:
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 10997(0x2af5, float:1.541E-41)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 19
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r2] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6[r1] = r7
            r1 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6[r1] = r7
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r1] = r2
            r4.mo160131h(r5, r6)
            qo3.g$i r1 = new qo3.g$i
            ck3.b r2 = r8.f215752d
            android.app.Activity r2 = r2.mo91565f()
            r1.<init>(r2)
            qo3.a r2 = r1.f225714b
            r2.f225660q = r0
            r0 = 2131821426(0x7f110372, float:1.9275595E38)
            r1.mo107552e(r0)
            com.tencent.mm.ui.chatting.component.TrackRoomComponent$f r0 = new com.tencent.mm.ui.chatting.component.TrackRoomComponent$f
            r0.<init>(r8)
            qo3.a r2 = r1.f225714b
            r2.f225620C = r0
            r1.mo107551d(r3)
            com.tencent.mm.ui.chatting.component.TrackRoomComponent$g r0 = new com.tencent.mm.ui.chatting.component.TrackRoomComponent$g
            r0.<init>(r9)
            qo3.a r9 = r1.f225714b
            r9.f225621D = r0
            qo3.g r9 = r1.mo107548a()
            r9.show()
            return
        L_0x0118:
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r9 = r0.f154884e
            java.lang.String r9 = r9.f154887a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0150
            ck3.b r9 = r8.f215752d
            java.lang.String r9 = r9.mo91577r()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r0 = r0.f154884e
            java.lang.String r0 = r0.f154887a
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0150
            ck3.b r9 = r8.f215752d
            android.app.Activity r9 = r9.mo91565f()
            ck3.b r0 = r8.f215752d
            android.content.res.Resources r0 = r0.mo91572m()
            java.lang.String r0 = r0.getString(r3)
            com.tencent.mm.ui.chatting.component.TrackRoomComponent$h r1 = new com.tencent.mm.ui.chatting.component.TrackRoomComponent$h
            r1.<init>()
            com.tencent.mm.ui.chatting.component.TrackRoomComponent$i r2 = new com.tencent.mm.ui.chatting.component.TrackRoomComponent$i
            r2.<init>(r8)
            nj3.C76879j.m92750u(r9, r0, r4, r1, r2)
            goto L_0x019c
        L_0x0150:
            ck3.b r9 = r8.f215752d
            java.lang.String r9 = r9.mo91577r()
            r8.mo102269Z5(r9)
            goto L_0x019c
        L_0x015a:
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r9 = r0.f154884e
            java.lang.String r9 = r9.f154887a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x019d
            ck3.b r9 = r8.f215752d
            java.lang.String r9 = r9.mo91577r()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r0 = r0.f154884e
            java.lang.String r0 = r0.f154887a
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0175
            goto L_0x019d
        L_0x0175:
            com.tencent.mm.ui.base.TalkRoomPopupNav r9 = r8.f215657f
            if (r9 == 0) goto L_0x017f
            int r9 = r9.getVisibility()
            if (r9 == 0) goto L_0x019c
        L_0x017f:
            ck3.b r9 = r8.f215752d
            android.app.Activity r9 = r9.mo91565f()
            ck3.b r0 = r8.f215752d
            android.content.res.Resources r0 = r0.mo91572m()
            java.lang.String r0 = r0.getString(r3)
            com.tencent.mm.ui.chatting.component.TrackRoomComponent$a r1 = new com.tencent.mm.ui.chatting.component.TrackRoomComponent$a
            r1.<init>()
            com.tencent.mm.ui.chatting.component.TrackRoomComponent$b r2 = new com.tencent.mm.ui.chatting.component.TrackRoomComponent$b
            r2.<init>(r8)
            nj3.C76879j.m92750u(r9, r0, r4, r1, r2)
        L_0x019c:
            return
        L_0x019d:
            ck3.b r9 = r8.f215752d
            java.lang.String r9 = r9.mo91577r()
            r8.mo102269Z5(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.mo102263K(boolean):void");
    }

    /* renamed from: M */
    public boolean mo102264M() {
        return false;
    }

    /* renamed from: O3 */
    public void mo102265O3(Runnable runnable) {
        if (C75610d.m90859a() != null) {
            if (((C77833z) C75610d.m90859a()).mo107955h(this.f215752d.mo91574o().getUsername(), this.f215752d.mo91573n())) {
                C76879j.m92714H(this.f215752d.f193286j.getContext(), this.f215752d.mo91572m().getString(C0966R.string.k5j), this.f215752d.mo91572m().getString(C0966R.string.a3h), true, new C73386c(runnable), new C73387d(this));
                return;
            }
        }
        TalkRoomPopupNav talkRoomPopupNav = this.f215657f;
        if (talkRoomPopupNav != null && talkRoomPopupNav.f214986g.getVisibility() == 0) {
            talkRoomPopupNav.mo101882e(false);
            talkRoomPopupNav.f214986g.setVisibility(8);
        }
        runnable.run();
    }

    /* renamed from: O4 */
    public void mo26162O4() {
    }

    /* renamed from: Q2 */
    public boolean mo102266Q2() {
        TalkRoomPopupNav talkRoomPopupNav = this.f215657f;
        return talkRoomPopupNav != null && talkRoomPopupNav.getVisibility() == 0;
    }

    /* renamed from: V1 */
    public int mo102267V1() {
        TalkRoomPopupNav talkRoomPopupNav = this.f215657f;
        if (talkRoomPopupNav == null) {
            return 0;
        }
        return talkRoomPopupNav.getHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f0, code lost:
        if (r8.f215657f == null) goto L_0x00fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* renamed from: Y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102268Y5(boolean r9) {
        /*
            r8 = this;
            java.lang.Class<zj3.d0> r0 = zj3.C79346d0.class
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "MicroMsg.ChattingUI.TrackRoomComponent"
            java.lang.String r5 = "[tomys] FOR_DEBUG checkTalkroomBanner, isResume: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            ck3.b r2 = r8.f215752d
            if (r2 != 0) goto L_0x0025
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r0[r4] = r9
            java.lang.String r9 = "[checkTalkroomBanner] isResume:%s mChattingContext == null! maybe chattingui has Exited! this event come from post msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r9, r0)
            return
        L_0x0025:
            java.lang.Class<zj3.g> r9 = zj3.C79357g.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r9 = r2.mo102812a(r9)
            zj3.g r9 = (zj3.C79357g) r9
            boolean r9 = r9.mo102150S1()
            if (r9 != 0) goto L_0x004a
            ck3.b r9 = r8.f215752d
            java.lang.Class<zj3.e> r2 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r9 = r9.f193278b
            xi.d r9 = r9.mo102812a(r2)
            zj3.e r9 = (zj3.C79348e) r9
            boolean r9 = r9.mo70079x5()
            if (r9 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r9 = 0
            goto L_0x004b
        L_0x004a:
            r9 = 1
        L_0x004b:
            ck3.b r2 = r8.f215752d
            java.lang.String r2 = r2.mo91577r()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            r5 = -1
            if (r2 == 0) goto L_0x0076
            if (r9 != 0) goto L_0x0076
            com.tencent.mm.ui.base.TalkRoomPopupNav r9 = r8.f215657f
            if (r9 == 0) goto L_0x0075
            r1 = 8
            r9.setVisibility(r1)
            com.tencent.mm.ui.base.TalkRoomPopupNav r9 = r8.f215657f
            r9.mo101878a()
            ck3.b r9 = r8.f215752d
            com.tencent.mm.ui.chatting.manager.a r9 = r9.f193278b
            xi.d r9 = r9.mo102812a(r0)
            zj3.d0 r9 = (zj3.C79346d0) r9
            r9.mo102651b3(r5)
        L_0x0075:
            return
        L_0x0076:
            r8.mo102270a6()
            ck3.b r9 = r8.f215752d
            java.lang.Class<zj3.p0> r2 = zj3.C79376p0.class
            com.tencent.mm.ui.chatting.manager.a r9 = r9.f193278b
            xi.d r9 = r9.mo102812a(r2)
            zj3.p0 r9 = (zj3.C79376p0) r9
            boolean r9 = r9.mo102698q2()
            if (r9 == 0) goto L_0x0091
            java.lang.String r9 = "isRecordSelect"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            return
        L_0x0091:
            ed0.a r9 = ed0.C75610d.m90859a()
            if (r9 == 0) goto L_0x01e3
            ed0.a r9 = ed0.C75610d.m90859a()
            ck3.b r2 = r8.f215752d
            com.tencent.mm.storage.z1 r2 = r2.mo91574o()
            java.lang.String r2 = r2.getUsername()
            t22.z r9 = (t22.C77833z) r9
            boolean r9 = r9.mo107954g(r2)
            if (r9 == 0) goto L_0x01e3
            ck3.b r9 = r8.f215752d
            java.lang.String r9 = r9.mo91577r()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r9 == 0) goto L_0x00ba
            return
        L_0x00ba:
            com.tencent.mm.ui.base.TalkRoomPopupNav$f r9 = r8.f215659h
            com.tencent.mm.ui.base.TalkRoomPopupNav r2 = r8.f215657f
            if (r2 != 0) goto L_0x00f3
            ck3.b r2 = r8.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r2.f193286j
            r3 = 2131316319(0x7f094e5f, float:1.8251116E38)
            com.tencent.p014mm.p136ui.chatting.component.C73521l0.m86927d(r2, r3)
            ck3.b r2 = r8.f215752d
            r3 = 2131314915(0x7f0948e3, float:1.8248268E38)
            android.view.View r2 = r2.mo91562c(r3)
            com.tencent.mm.ui.base.TalkRoomPopupNav r2 = (com.tencent.p014mm.p136ui.base.TalkRoomPopupNav) r2
            r8.f215657f = r2
            ck3.b r2 = r8.f215752d
            r3 = 2131315355(0x7f094a9b, float:1.824916E38)
            android.view.View r2 = r2.mo91562c(r3)
            r8.f215658g = r2
            com.tencent.mm.ui.base.TalkRoomPopupNav r3 = r8.f215657f
            r3.setRootTipsBarBackground(r2)
            com.tencent.mm.ui.base.TalkRoomPopupNav r2 = r8.f215657f
            ck3.b r3 = r8.f215752d
            r2.setChattingContext(r3)
            com.tencent.mm.ui.base.TalkRoomPopupNav r2 = r8.f215657f
            if (r2 != 0) goto L_0x00f3
            goto L_0x00fa
        L_0x00f3:
            com.tencent.mm.ui.base.TalkRoomPopupNav r2 = r8.f215657f
            if (r2 == 0) goto L_0x00fa
            r2.setOnClickListener(r9)
        L_0x00fa:
            com.tencent.mm.ui.base.TalkRoomPopupNav r9 = r8.f215657f
            if (r9 != 0) goto L_0x00ff
            return
        L_0x00ff:
            ed0.a r9 = ed0.C75610d.m90859a()
            ck3.b r2 = r8.f215752d
            com.tencent.mm.storage.z1 r2 = r2.mo91574o()
            java.lang.String r2 = r2.getUsername()
            t22.z r9 = (t22.C77833z) r9
            java.util.LinkedList r9 = r9.mo107950c(r2)
            r2 = 2131235317(0x7f0811f5, float:1.8086825E38)
            if (r9 == 0) goto L_0x0138
            ck3.b r3 = r8.f215752d
            java.lang.String r3 = r3.mo91573n()
            boolean r3 = r9.contains(r3)
            if (r3 == 0) goto L_0x0138
            com.tencent.mm.ui.base.TalkRoomPopupNav r3 = r8.f215657f
            r3.setBgViewResource(r2)
            ck3.b r2 = r8.f215752d
            android.content.res.Resources r2 = r2.mo91572m()
            r3 = 2131838134(0x7f1144b6, float:1.9309483E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x01af
        L_0x0138:
            com.tencent.mm.ui.base.TalkRoomPopupNav r3 = r8.f215657f
            r3.mo101880c(r5, r4)
            com.tencent.mm.ui.base.TalkRoomPopupNav r3 = r8.f215657f
            r3.getClass()
            com.tencent.mm.ui.base.TalkRoomPopupNav r3 = r8.f215657f
            r3.setBgViewResource(r2)
            if (r9 == 0) goto L_0x0173
            int r2 = r9.size()
            if (r2 != r1) goto L_0x0173
            ck3.b r2 = r8.f215752d
            android.content.res.Resources r2 = r2.mo91572m()
            r3 = 2131838133(0x7f1144b5, float:1.930948E38)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Class<d62.i> r6 = d62.C75339i.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            d62.i r6 = (d62.C75339i) r6
            java.lang.Object r7 = r9.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = r6.getDisplayName(r7)
            r5[r4] = r6
            java.lang.String r2 = r2.getString(r3, r5)
            goto L_0x0191
        L_0x0173:
            if (r9 == 0) goto L_0x018f
            ck3.b r2 = r8.f215752d
            android.content.res.Resources r2 = r2.mo91572m()
            r3 = 2131838135(0x7f1144b7, float:1.9309485E38)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            int r6 = r9.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r4] = r6
            java.lang.String r2 = r2.getString(r3, r5)
            goto L_0x0191
        L_0x018f:
            java.lang.String r2 = ""
        L_0x0191:
            com.tencent.mm.ui.base.TalkRoomPopupNav r3 = r8.f215657f
            r5 = 2131756073(0x7f100429, float:1.9143043E38)
            ck3.b r6 = r8.f215752d
            android.content.res.Resources r6 = r6.mo91572m()
            r7 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r6 = r6.getColor(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = r3.f214992p
            if (r7 == 0) goto L_0x01af
            r7.setImageResource(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r3.f214992p
            r3.setIconColor(r6)
        L_0x01af:
            com.tencent.mm.ui.base.TalkRoomPopupNav r3 = r8.f215657f
            android.widget.LinearLayout r5 = r3.f214986g
            if (r5 == 0) goto L_0x01c6
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x01c3
            android.view.animation.Animation r5 = r3.f214999w
            if (r5 != 0) goto L_0x01c3
            r3.mo101882e(r1)
            goto L_0x01c6
        L_0x01c3:
            r3.mo101882e(r4)
        L_0x01c6:
            com.tencent.mm.ui.base.TalkRoomPopupNav r3 = r8.f215657f
            r3.mo101881d(r9)
            com.tencent.mm.ui.base.TalkRoomPopupNav r9 = r8.f215657f
            r9.setVisibility(r4)
            com.tencent.mm.ui.base.TalkRoomPopupNav r9 = r8.f215657f
            r9.setNavContent(r2)
            ck3.b r9 = r8.f215752d
            com.tencent.mm.ui.chatting.manager.a r9 = r9.f193278b
            xi.d r9 = r9.mo102812a(r0)
            zj3.d0 r9 = (zj3.C79346d0) r9
            r9.mo102651b3(r1)
            goto L_0x020c
        L_0x01e3:
            dd0.b r9 = dd0.C75350g.m90357a()
            if (r9 == 0) goto L_0x01fc
            dd0.b r9 = dd0.C75350g.m90357a()
            ck3.b r0 = r8.f215752d
            java.lang.String r0 = r0.mo91577r()
            sx2.j r9 = (sx2.C48497j) r9
            boolean r9 = r9.mo73129c(r0)
            if (r9 == 0) goto L_0x01fc
            goto L_0x020c
        L_0x01fc:
            ck3.b r9 = r8.f215752d
            java.lang.String r9 = r9.mo91577r()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r9 == 0) goto L_0x0209
            return
        L_0x0209:
            r8.mo102270a6()
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.mo102268Y5(boolean):void");
    }

    /* renamed from: Z5 */
    public final void mo102269Z5(String str) {
        Intent intent = new Intent();
        intent.putExtra("enter_room_username", str);
        intent.setFlags(268435456);
        C88144b.m109791i(this.f215752d.mo91565f(), "talkroom", ".ui.TalkRoomUI", intent, (Bundle) null);
    }

    /* renamed from: a3 */
    public void mo96154a3(String str) {
        C67391b bVar = this.f215752d;
        if (bVar != null && str.equals(bVar.mo91577r())) {
            mo102268Y5(false);
        }
    }

    /* renamed from: a6 */
    public final void mo102270a6() {
        TalkRoomPopupNav talkRoomPopupNav = this.f215657f;
        if (talkRoomPopupNav != null) {
            talkRoomPopupNav.setVisibility(8);
            this.f215657f.mo101878a();
            this.f215657f.mo101880c(-1, 0);
            this.f215657f.mo101889i();
            ((C79346d0) this.f215752d.f193278b.mo102812a(C79346d0.class)).mo102651b3(-1);
        }
    }

    /* renamed from: d3 */
    public void mo102271d3(String str, String str2, String str3) {
        C67391b bVar = this.f215752d;
        if (bVar != null && str.equals(bVar.mo91577r())) {
            mo102268Y5(false);
        }
    }

    /* renamed from: e1 */
    public boolean mo102272e1() {
        return false;
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        TalkRoomPopupNav talkRoomPopupNav = this.f215657f;
        if (talkRoomPopupNav != null) {
            talkRoomPopupNav.mo101889i();
        }
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        mo102270a6();
    }

    /* renamed from: t3 */
    public void mo82260t3(String str) {
        C67391b bVar = this.f215752d;
        if (bVar != null && str.equals(bVar.mo91577r())) {
            mo102268Y5(false);
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
    }

    /* renamed from: y1 */
    public void mo69890y1(String str, String str2, String str3) {
        C67391b bVar = this.f215752d;
        if (bVar != null && str.equals(bVar.mo91577r())) {
            mo102268Y5(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (((t22.C77833z) ed0.C75610d.m90859a()).mo107954g(r6.f215752d.mo91574o().getUsername()) == false) goto L_0x0044;
     */
    /* renamed from: z4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102273z4(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            ck3.b r7 = r6.f215752d
            android.app.Activity r7 = r7.mo91565f()
            boolean r7 = p182kk.C61104a.m71669y(r7)
            java.lang.String r0 = "MicroMsg.ChattingUI.TrackRoomComponent"
            if (r7 != 0) goto L_0x00db
            ck3.b r7 = r6.f215752d
            android.app.Activity r7 = r7.mo91565f()
            boolean r7 = p182kk.C61104a.m71665u(r7)
            if (r7 != 0) goto L_0x00db
            ck3.b r7 = r6.f215752d
            android.app.Activity r7 = r7.mo91565f()
            boolean r7 = p182kk.C61104a.m71649e(r7)
            if (r7 == 0) goto L_0x0028
            goto L_0x00db
        L_0x0028:
            ed0.a r7 = ed0.C75610d.m90859a()
            if (r7 == 0) goto L_0x0044
            ed0.a r7 = ed0.C75610d.m90859a()
            ck3.b r1 = r6.f215752d
            com.tencent.mm.storage.z1 r1 = r1.mo91574o()
            java.lang.String r1 = r1.getUsername()
            t22.z r7 = (t22.C77833z) r7
            boolean r7 = r7.mo107954g(r1)
            if (r7 != 0) goto L_0x0046
        L_0x0044:
            if (r9 == 0) goto L_0x00d7
        L_0x0046:
            ed0.a r7 = ed0.C75610d.m90859a()
            ck3.b r9 = r6.f215752d
            com.tencent.mm.storage.z1 r9 = r9.mo91574o()
            java.lang.String r9 = r9.getUsername()
            t22.z r7 = (t22.C77833z) r7
            java.util.LinkedList r7 = r7.mo107950c(r9)
            ck3.b r9 = r6.f215752d
            java.lang.String r9 = r9.mo91577r()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            r1 = 0
            r2 = 1
            if (r9 != 0) goto L_0x007d
            if (r7 == 0) goto L_0x0087
            int r9 = r7.size()
            if (r9 <= 0) goto L_0x0087
            ck3.b r9 = r6.f215752d
            java.lang.String r9 = r9.mo91573n()
            boolean r9 = r7.contains(r9)
            if (r9 == 0) goto L_0x0087
            goto L_0x0085
        L_0x007d:
            if (r7 == 0) goto L_0x0087
            int r9 = r7.size()
            if (r9 <= 0) goto L_0x0087
        L_0x0085:
            r9 = 1
            goto L_0x0088
        L_0x0087:
            r9 = 0
        L_0x0088:
            if (r9 == 0) goto L_0x008e
            r6.mo102262I4(r8)
            goto L_0x00da
        L_0x008e:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 10997(0x2af5, float:1.541E-41)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4[r2] = r5
            r2 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4[r2] = r5
            r2 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r2] = r1
            r9.mo160131h(r3, r4)
            com.tencent.mm.ui.base.TalkRoomPopupNav r9 = r6.f215657f
            if (r9 != 0) goto L_0x00bf
            java.lang.String r7 = "talkRoomPopupNav = null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            return
        L_0x00bf:
            ck3.b r0 = r6.f215752d
            android.content.res.Resources r0 = r0.mo91572m()
            r1 = 2131825141(0x7f1111f5, float:1.928313E38)
            java.lang.String r0 = r0.getString(r1)
            r9.setDialogContent(r0)
            com.tencent.mm.ui.base.TalkRoomPopupNav r9 = r6.f215657f
            r0 = 300(0x12c, double:1.48E-321)
            r9.mo101890j(r8, r7, r0)
            goto L_0x00da
        L_0x00d7:
            r6.mo102261H0(r8)
        L_0x00da:
            return
        L_0x00db:
            java.lang.String r7 = "voip is running"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.TrackRoomComponent.mo102273z4(java.lang.String, java.lang.String, boolean):void");
    }
}
