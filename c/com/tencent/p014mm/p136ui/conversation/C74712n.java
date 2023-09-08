package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import j20.C117292a;
import jw0.C21287a;
import k20.C9556a;
import p227rn.C22240c0;
import rx3.C13598b0;
import wc3.C22881c;

/* renamed from: com.tencent.mm.ui.conversation.n */
public class C74712n implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public C74720p f219663d;

    /* renamed from: e */
    public ListView f219664e;

    /* renamed from: f */
    public Activity f219665f;

    /* renamed from: com.tencent.mm.ui.conversation.n$b */
    public class C44998b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f122055d;

        public C44998b(C74712n nVar, View view) {
            this.f122055d = view;
        }

        public void run() {
            C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Ex0("notifymessage");
            int intValue = ((Integer) this.f122055d.getTag(C0966R.C0970id.bt8)).intValue();
            int createTime = (int) (Ex0.getCreateTime() / 1000);
            String p2 = ((C72976h2) this.f122055d.getTag(C0966R.C0970id.bt6)).mo108822p2();
            C115669n.INSTANCE.mo160131h(22611, 2, Integer.valueOf(createTime), p2, Integer.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true) ^ true ? 1 : 0), Integer.valueOf(intValue));
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.n$c */
    public class C44999c implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LauncherUI f122056d;

        /* renamed from: e */
        public final /* synthetic */ C72976h2 f122057e;

        /* renamed from: f */
        public final /* synthetic */ Bundle f122058f;

        public C44999c(C74712n nVar, LauncherUI launcherUI, C72976h2 h2Var, Bundle bundle) {
            this.f122056d = launcherUI;
            this.f122057e = h2Var;
            this.f122058f = bundle;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                return null;
            }
            this.f122056d.startChatting(this.f122057e.getUsername(), this.f122058f, true);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.n$a */
    public class C74713a implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Intent f219666d;

        /* renamed from: e */
        public final /* synthetic */ View f219667e;

        /* renamed from: f */
        public final /* synthetic */ int f219668f;

        /* renamed from: g */
        public final /* synthetic */ C72976h2 f219669g;

        public C74713a(Intent intent, View view, int i, C72976h2 h2Var) {
            this.f219666d = intent;
            this.f219667e = view;
            this.f219668f = i;
            this.f219669g = h2Var;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                return null;
            }
            C74712n.this.mo103868a(this.f219666d);
            C19636w0.m21160b();
            C22881c.f65777a.mo36057b();
            C21287a.f60143a.mo33264e();
            C74712n.this.f219663d.mo103885L(this.f219667e, this.f219668f, this.f219669g.getUsername());
            return null;
        }
    }

    public C74712n(C74720p pVar, ListView listView, Activity activity) {
        this.f219663d = pVar;
        this.f219664e = listView;
        this.f219665f = activity;
    }

    /* renamed from: a */
    public final void mo103868a(Intent intent) {
        Class cls = C22240c0.class;
        C68777r4.f197582a = new C68777r4.C18492a();
        C68777r4.f197583b = System.currentTimeMillis();
        Log.m105924i("MicroMsg.BizTimeReport", "markStartOpen");
        if (((C22240c0) C86312j.m106911c(cls)).mo35410vH()) {
            ((C22240c0) C86312j.m106911c(cls)).u90(this.f219665f, intent);
            return;
        }
        Activity activity = this.f219665f;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/ConversationClickListener", "gotoBizTimeLine", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/ui/conversation/ConversationClickListener", "gotoBizTimeLine", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x074d  */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r29, android.view.View r30, int r31, long r32) {
        /*
            r28 = this;
            r7 = r28
            r8 = r30
            r0 = r31
            java.lang.String r1 = ""
            java.lang.Class<ex0.d> r9 = ex0.C45696d.class
            java.lang.String r2 = "MicroMsg.ConversationClickListener"
            android.widget.ListView r3 = r7.f219664e
            int r3 = r3.getHeaderViewsCount()
            if (r0 >= r3) goto L_0x0015
            return
        L_0x0015:
            android.widget.ListView r3 = r7.f219664e
            int r3 = r3.getHeaderViewsCount()
            int r10 = r0 - r3
            r3 = 0
            r11 = 0
            com.tencent.mm.ui.conversation.p r0 = r7.f219663d     // Catch:{ IllegalStateException -> 0x0028 }
            ai3.a r0 = r0.getItem(r10)     // Catch:{ IllegalStateException -> 0x0028 }
            com.tencent.mm.storage.h2 r0 = (com.tencent.p014mm.storage.C72976h2) r0     // Catch:{ IllegalStateException -> 0x0028 }
            goto L_0x002f
        L_0x0028:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r1, r4)
            r0 = r3
        L_0x002f:
            if (r0 != 0) goto L_0x0046
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "null user at position = "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return
        L_0x0046:
            java.lang.Object r3 = r30.getTag()
            boolean r3 = r3 instanceof com.tencent.p014mm.p136ui.conversation.C74720p.C74733m
            r12 = 3
            r4 = 2
            r13 = 1
            if (r3 == 0) goto L_0x006e
            java.lang.Object r3 = r30.getTag()
            com.tencent.mm.ui.conversation.p$m r3 = (com.tencent.p014mm.p136ui.conversation.C74720p.C74733m) r3
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r5[r11] = r6
            java.lang.String r6 = r0.getUsername()
            r5[r13] = r6
            java.lang.String r3 = r3.f219757l
            r5[r4] = r3
            java.lang.String r3 = "[onItemClick] position:%s [%s,%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
        L_0x006e:
            java.lang.String r3 = r0.getUsername()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85822V5(r3)
            if (r3 == 0) goto L_0x00a4
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 27229(0x6a5d, float:3.8156E-41)
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r6[r11] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r6[r13] = r14
            r6[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r6[r12] = r1
            r1 = 4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r6[r1] = r14
            r1 = 5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r6[r1] = r14
            r3.mo160131h(r5, r6)
        L_0x00a4:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r3 = r0.mo108372k3(r1)
            if (r3 == 0) goto L_0x00c0
            r0.mo108373l3(r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            java.lang.String r3 = r0.getUsername()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69773k0(r0, r3)
        L_0x00c0:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            boolean r3 = r0.mo108372k3(r1)
            if (r3 == 0) goto L_0x00dc
            r0.mo108373l3(r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            java.lang.String r3 = r0.getUsername()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69773k0(r0, r3)
        L_0x00dc:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            boolean r3 = r0.mo108372k3(r1)
            if (r3 == 0) goto L_0x00f8
            r0.mo108373l3(r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            java.lang.String r3 = r0.getUsername()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69773k0(r0, r3)
        L_0x00f8:
            int r1 = r0.mo108829v2()
            if (r1 <= 0) goto L_0x0112
            r0.mo108799U2(r11)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            java.lang.String r3 = r0.getUsername()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69773k0(r0, r3)
        L_0x0112:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85838i5(r1)
            java.lang.String r15 = "KOpenArticleSceneFromScene"
            r31 = r15
            java.lang.String r3 = ".ui.ContactInfoUI"
            java.lang.String r12 = "profile"
            java.lang.String r14 = "Contact_User"
            if (r1 == 0) goto L_0x0153
            boolean r1 = eb0.C75592q0.m90760H()
            if (r1 == 0) goto L_0x0137
            android.app.Activity r1 = r7.f219665f
            java.lang.String r2 = "tmessage"
            java.lang.String r3 = ".ui.TConversationUI"
            ke3.C88144b.m109789g(r1, r2, r3)
            goto L_0x0149
        L_0x0137:
            android.app.Activity r1 = r7.f219665f
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = r0.getUsername()
            android.content.Intent r2 = r2.putExtra(r14, r4)
            ke3.C88144b.m109790h(r1, r12, r3, r2)
        L_0x0149:
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x0166
        L_0x0153:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85828Z4(r1)
            if (r1 == 0) goto L_0x016c
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
        L_0x0166:
            r12 = r31
            r16 = 9
            goto L_0x070a
        L_0x016c:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85827Y4(r1)
            if (r1 == 0) goto L_0x0192
            android.app.Activity r1 = r7.f219665f
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = r0.getUsername()
            android.content.Intent r2 = r2.putExtra(r14, r4)
            ke3.C88144b.m109790h(r1, r12, r3, r2)
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x0166
        L_0x0192:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85851v5(r1)
            if (r1 == 0) goto L_0x01bf
            java.lang.String r1 = r0.getUsername()
            com.tencent.p014mm.p136ui.MMAppMgr.m85983c(r1)
            android.app.Activity r1 = r7.f219665f
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = r0.getUsername()
            android.content.Intent r2 = r2.putExtra(r14, r4)
            ke3.C88144b.m109790h(r1, r12, r3, r2)
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x0166
        L_0x01bf:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85849t5(r1)
            if (r1 == 0) goto L_0x0200
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginQQMail
            android.content.Context r2 = r30.getContext()
            boolean r1 = r1.checkAvailable(r2)
            if (r1 != 0) goto L_0x01d6
            return
        L_0x01d6:
            boolean r1 = eb0.C75592q0.m90757E()
            if (r1 == 0) goto L_0x01e3
        L_0x01dc:
            r12 = r31
            r5 = 1
            r16 = 9
            goto L_0x074b
        L_0x01e3:
            android.app.Activity r1 = r7.f219665f
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = r0.getUsername()
            android.content.Intent r2 = r2.putExtra(r14, r4)
            ke3.C88144b.m109790h(r1, r12, r3, r2)
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x0166
        L_0x0200:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85800G5(r1)
            if (r1 == 0) goto L_0x020c
            goto L_0x0166
        L_0x020c:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85853x5(r1)
            java.lang.String r15 = ".ui.ReaderAppUI"
            java.lang.String r6 = "readerapp"
            java.lang.String r5 = "type"
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            if (r1 == 0) goto L_0x0262
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginQQMail
            android.content.Context r2 = r30.getContext()
            boolean r1 = r1.checkAvailable(r2)
            if (r1 != 0) goto L_0x022c
            return
        L_0x022c:
            boolean r1 = eb0.C75592q0.m90758F()
            if (r1 == 0) goto L_0x0245
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.addFlags(r13)
            r2 = 20
            r1.putExtra(r5, r2)
            android.app.Activity r2 = r7.f219665f
            ke3.C88144b.m109790h(r2, r6, r15, r1)
            goto L_0x0257
        L_0x0245:
            android.app.Activity r1 = r7.f219665f
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = r0.getUsername()
            android.content.Intent r2 = r2.putExtra(r14, r4)
            ke3.C88144b.m109790h(r1, r12, r3, r2)
        L_0x0257:
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x0166
        L_0x0262:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85854y5(r1)
            if (r1 == 0) goto L_0x02a2
            boolean r1 = eb0.C75592q0.m90759G()
            if (r1 == 0) goto L_0x0285
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.addFlags(r13)
            r2 = 11
            r1.putExtra(r5, r2)
            android.app.Activity r2 = r7.f219665f
            ke3.C88144b.m109790h(r2, r6, r15, r1)
            goto L_0x0297
        L_0x0285:
            android.app.Activity r1 = r7.f219665f
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = r0.getUsername()
            android.content.Intent r2 = r2.putExtra(r14, r4)
            ke3.C88144b.m109790h(r1, r12, r3, r2)
        L_0x0297:
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x0166
        L_0x02a2:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85815R4(r1)
            if (r1 == 0) goto L_0x02c9
            android.app.Activity r1 = r7.f219665f
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = r0.getUsername()
            android.content.Intent r2 = r2.putExtra(r14, r4)
            ke3.C88144b.m109790h(r1, r12, r3, r2)
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x0166
        L_0x02c9:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85836g5(r1)
            if (r1 == 0) goto L_0x0309
            boolean r1 = eb0.C75592q0.m90756D()
            if (r1 == 0) goto L_0x02ec
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.Intent r1 = r1.addFlags(r13)
            android.app.Activity r2 = r7.f219665f
            java.lang.String r3 = "masssend"
            java.lang.String r4 = ".ui.MassSendHistoryUI"
            ke3.C88144b.m109790h(r2, r3, r4, r1)
            goto L_0x02fe
        L_0x02ec:
            android.app.Activity r1 = r7.f219665f
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = r0.getUsername()
            android.content.Intent r2 = r2.putExtra(r14, r4)
            ke3.C88144b.m109790h(r1, r12, r3, r2)
        L_0x02fe:
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x0166
        L_0x0309:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85803I5(r1)
            if (r1 == 0) goto L_0x0328
            eb0.z2 r1 = eb0.C31519v2.m39437b()
            if (r1 == 0) goto L_0x01dc
            eb0.z2 r1 = eb0.C31519v2.m39437b()
            java.lang.String r2 = r0.getUsername()
            uw2.e r1 = (uw2.C78291e) r1
            r1.Ax0(r2)
            goto L_0x01dc
        L_0x0328:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85841l5(r1)
            if (r1 == 0) goto L_0x0485
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomeServiceOa
            android.content.Context r3 = r30.getContext()
            boolean r1 = r1.checkAvailable(r3)
            if (r1 != 0) goto L_0x033f
            return
        L_0x033f:
            com.tencent.mm.hardcoder.WXHardCoderJNI r17 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            com.tencent.mm.hardcoder.WXHardCoderJNI r1 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r18 = r1.getHcBizEnable()
            com.tencent.mm.hardcoder.WXHardCoderJNI r1 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r19 = r1.getHcBizDelay()
            com.tencent.mm.hardcoder.WXHardCoderJNI r1 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r20 = r1.getHcBizCPU()
            com.tencent.mm.hardcoder.WXHardCoderJNI r1 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r21 = r1.getHcBizIO()
            com.tencent.mm.hardcoder.WXHardCoderJNI r1 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r1 = r1.getHcBizThr()
            if (r1 == 0) goto L_0x0374
            int r1 = android.os.Process.myTid()
            r22 = r1
            goto L_0x0376
        L_0x0374:
            r22 = 0
        L_0x0376:
            com.tencent.mm.hardcoder.WXHardCoderJNI r1 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r23 = r1.getHcBizTimeout()
            r24 = 901(0x385, float:1.263E-42)
            com.tencent.mm.hardcoder.WXHardCoderJNI r1 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            long r25 = r1.getHcBizAction()
            java.lang.String r27 = "MicroMsg.ConversationClickListener"
            int r1 = r17.startPerformance(r18, r19, r20, r21, r22, r23, r24, r25, r27)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r5 = 901(0x385, float:1.263E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r11] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 1
            r3[r5] = r1
            java.lang.String r1 = "summer hardcoder biz startPerformance [%s][%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r3)
            java.lang.Class<ug.c0> r1 = p248ug.C52570c0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            ug.c0 r1 = (p248ug.C52570c0) r1
            boolean r1 = r1.mo58178H1()
            if (r1 == 0) goto L_0x03d3
            java.lang.Class<ky2.i> r1 = ky2.C10432i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ky2.i r1 = (ky2.C10432i) r1
            android.app.Activity r2 = r7.f219665f
            r1.mo10755m4(r2)
            java.lang.Class<ug.c0> r1 = p248ug.C52570c0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            ug.c0 r1 = (p248ug.C52570c0) r1
            java.lang.String r2 = r0.getUsername()
            r5 = 9
            r1.mo58184vU(r5, r2)
            goto L_0x0166
        L_0x03d3:
            r1 = 1
            r5 = 9
            com.tencent.p014mm.storage.C19636w0.m21176r(r1)
            android.content.Intent r3 = new android.content.Intent
            android.app.Activity r1 = r7.f219665f
            java.lang.Class<com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI> r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI.class
            r3.<init>(r1, r2)
            r12 = r31
            r1 = 93
            r3.putExtra(r12, r1)
            java.lang.String r1 = "Main_IndexInSessionList"
            r3.putExtra(r1, r10)
            int r1 = r0.mo108786G2()
            java.lang.String r2 = "Main_UnreadCount"
            r3.putExtra(r2, r1)
            r1 = 128(0x80, float:1.794E-43)
            boolean r1 = r0.mo108372k3(r1)
            if (r1 == 0) goto L_0x0428
            com.tencent.mm.pluginsdk.model.d r1 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            r1.mo25149B()
            r1 = 256(0x100, float:3.59E-43)
            boolean r1 = r0.mo108372k3(r1)
            if (r1 == 0) goto L_0x0413
            java.lang.String r1 = "Main_BizFinderLiveRedDotType"
            r2 = 1
            r3.putExtra(r1, r2)
            goto L_0x0418
        L_0x0413:
            java.lang.String r1 = "Main_BizFinderLiveRedDotType"
            r3.putExtra(r1, r4)
        L_0x0418:
            java.lang.String r1 = "Main_BizExposeMsgType"
            r6 = 7
            r3.putExtra(r1, r6)
            java.lang.String r1 = r0.mo108823q2()
            java.lang.String r2 = "Main_FromUserName"
            r3.putExtra(r2, r1)
            goto L_0x0440
        L_0x0428:
            r6 = 7
            com.tencent.mm.storage.c0 r1 = com.tencent.p014mm.storage.C19601c0.f55446a
            int r2 = r1.mo25716e()
            java.lang.String r4 = "Main_BizExposeMsgType"
            r3.putExtra(r4, r2)
            java.lang.String r2 = r1.mo25717f()
            java.lang.String r4 = "Main_FromUserName"
            r3.putExtra(r4, r2)
            r1.mo25721j()
        L_0x0440:
            k40.a r1 = f40.C86709a0.m107533q(r9)
            ex0.d r1 = (ex0.C45696d) r1
            boolean r1 = r1.mo70993g3()
            if (r1 != 0) goto L_0x0468
            k40.a r1 = f40.C86709a0.m107533q(r9)
            r13 = r1
            ex0.d r13 = (ex0.C45696d) r13
            android.app.Activity r14 = r7.f219665f
            com.tencent.mm.ui.conversation.n$a r15 = new com.tencent.mm.ui.conversation.n$a
            r1 = r15
            r2 = r28
            r4 = r30
            r16 = 9
            r5 = r10
            r6 = r0
            r1.<init>(r3, r4, r5, r6)
            r13.Bw0(r14, r15)
            goto L_0x070a
        L_0x0468:
            r16 = 9
            r7.mo103868a(r3)
            com.tencent.p014mm.storage.C19636w0.m21160b()
            wc3.c r1 = wc3.C22881c.f65777a
            r1.mo36057b()
            jw0.a r1 = jw0.C21287a.f60143a
            r1.mo33264e()
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x070a
        L_0x0485:
            r12 = r31
            r16 = 9
            java.lang.String r1 = r0.getUsername()
            boolean r1 = eb0.C45628s0.m50738C(r1)
            if (r1 == 0) goto L_0x052d
            java.lang.Class<rn.v> r1 = p227rn.C48053v.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            rn.v r1 = (p227rn.C48053v) r1
            java.lang.String r2 = r0.getUsername()
            boolean r1 = r1.mo72617gl(r2)
            if (r1 == 0) goto L_0x052d
            java.lang.String r1 = r0.getUsername()
            boolean r1 = eb0.C45628s0.m50740E(r1)
            if (r1 != 0) goto L_0x04bc
            android.app.Activity r0 = r7.f219665f
            r1 = 2131825160(0x7f111208, float:1.9283168E38)
            java.lang.String r1 = r0.getString(r1)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x04bc:
            android.content.Intent r1 = new android.content.Intent
            android.app.Activity r2 = r7.f219665f
            java.lang.Class<com.tencent.mm.ui.conversation.EnterpriseConversationUI> r3 = com.tencent.p014mm.p136ui.conversation.EnterpriseConversationUI.class
            r1.<init>(r2, r3)
            java.lang.String r2 = r0.getUsername()
            java.lang.String r3 = "enterprise_biz_name"
            r1.putExtra(r3, r2)
            java.lang.Class<d62.i> r2 = d62.C75339i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            d62.i r2 = (d62.C75339i) r2
            java.lang.String r3 = r0.getUsername()
            java.lang.String r2 = r2.getDisplayName(r3)
            java.lang.String r3 = "enterprise_biz_display_name"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "enterprise_from_scene"
            r3 = 1
            r1.putExtra(r2, r3)
            android.app.Activity r2 = r7.f219665f
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r1)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/conversation/ConversationClickListener"
            java.lang.String r20 = "onItemClick"
            java.lang.String r21 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "startActivity"
            java.lang.String r24 = "(Landroid/content/Intent;)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r3.mo10231a(r11)
            android.content.Intent r1 = (android.content.Intent) r1
            r2.startActivity(r1)
            java.lang.String r18 = "com/tencent/mm/ui/conversation/ConversationClickListener"
            java.lang.String r19 = "onItemClick"
            java.lang.String r20 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x070a
        L_0x052d:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = eb0.C45628s0.m50738C(r1)
            if (r1 == 0) goto L_0x05bd
            java.lang.Class<rn.v> r1 = p227rn.C48053v.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            rn.v r1 = (p227rn.C48053v) r1
            java.lang.String r2 = r0.getUsername()
            boolean r1 = r1.mo72614OE(r2)
            if (r1 == 0) goto L_0x05bd
            java.lang.String r1 = r0.getUsername()
            boolean r1 = eb0.C45628s0.m50740E(r1)
            if (r1 != 0) goto L_0x0560
            android.app.Activity r0 = r7.f219665f
            r1 = 2131825160(0x7f111208, float:1.9283168E38)
            java.lang.String r1 = r0.getString(r1)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x0560:
            android.content.Intent r1 = new android.content.Intent
            android.app.Activity r2 = r7.f219665f
            java.lang.Class<com.tencent.mm.ui.bizchat.BizChatConversationUI> r3 = com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI.class
            r1.<init>(r2, r3)
            java.lang.String r2 = r0.getUsername()
            r1.putExtra(r14, r2)
            java.lang.String r2 = "biz_chat_from_scene"
            r3 = 1
            r1.putExtra(r2, r3)
            r1.addFlags(r13)
            android.app.Activity r2 = r7.f219665f
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r1)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/conversation/ConversationClickListener"
            java.lang.String r20 = "onItemClick"
            java.lang.String r21 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "startActivity"
            java.lang.String r24 = "(Landroid/content/Intent;)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r3.mo10231a(r11)
            android.content.Intent r1 = (android.content.Intent) r1
            r2.startActivity(r1)
            java.lang.String r18 = "com/tencent/mm/ui/conversation/ConversationClickListener"
            java.lang.String r19 = "onItemClick"
            java.lang.String r20 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x070a
        L_0x05bd:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85808L4(r1)
            if (r1 == 0) goto L_0x0627
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.app.Activity r2 = r7.f219665f
            java.lang.String r3 = "com.tencent.mm.ui.conversation.AppBrandServiceConversationUI"
            r1.setClassName(r2, r3)
            java.lang.String r2 = r0.getUsername()
            r1.putExtra(r14, r2)
            java.lang.String r2 = "app_brand_conversation_from_scene"
            r3 = 1
            r1.putExtra(r2, r3)
            r1.addFlags(r13)
            android.app.Activity r2 = r7.f219665f
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r1)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/conversation/ConversationClickListener"
            java.lang.String r20 = "onItemClick"
            java.lang.String r21 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "startActivity"
            java.lang.String r24 = "(Landroid/content/Intent;)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r3.mo10231a(r11)
            android.content.Intent r1 = (android.content.Intent) r1
            r2.startActivity(r1)
            java.lang.String r18 = "com/tencent/mm/ui/conversation/ConversationClickListener"
            java.lang.String r19 = "onItemClick"
            java.lang.String r20 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x070a
        L_0x0627:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85813P4(r1)
            if (r1 == 0) goto L_0x06a2
            com.tencent.mm.autogen.mmdata.rpt.ChatBoxSessionActionStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.ChatBoxSessionActionStruct
            r1.<init>()
            r2 = 1
            r1.mo76250s(r2)
            int r2 = r0.mo108786G2()
            if (r2 <= 0) goto L_0x0644
            r2 = 1
            goto L_0x0646
        L_0x0644:
            r2 = 0
        L_0x0646:
            r1.mo76251t(r2)
            r1.mo86054n()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.app.Activity r2 = r7.f219665f
            java.lang.String r3 = "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI"
            r1.setClassName(r2, r3)
            java.lang.String r2 = r0.getUsername()
            r1.putExtra(r14, r2)
            android.app.Activity r2 = r7.f219665f
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r1)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/conversation/ConversationClickListener"
            java.lang.String r20 = "onItemClick"
            java.lang.String r21 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "startActivity"
            java.lang.String r24 = "(Landroid/content/Intent;)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r3.mo10231a(r11)
            android.content.Intent r1 = (android.content.Intent) r1
            r2.startActivity(r1)
            java.lang.String r18 = "com/tencent/mm/ui/conversation/ConversationClickListener"
            java.lang.String r19 = "onItemClick"
            java.lang.String r20 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            goto L_0x070a
        L_0x06a2:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85845p5(r1)
            if (r1 == 0) goto L_0x070c
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.app.Activity r2 = r7.f219665f
            java.lang.String r3 = "com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI"
            r1.setClassName(r2, r3)
            java.lang.String r2 = r0.getUsername()
            r1.putExtra(r14, r2)
            java.lang.String r2 = "open_im_kefu_conversation_list_ui_from_scene"
            r3 = 1
            r1.putExtra(r2, r3)
            r1.addFlags(r13)
            android.app.Activity r2 = r7.f219665f
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r1)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/conversation/ConversationClickListener"
            java.lang.String r20 = "onItemClick"
            java.lang.String r21 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "startActivity"
            java.lang.String r24 = "(Landroid/content/Intent;)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r3.mo10231a(r11)
            android.content.Intent r1 = (android.content.Intent) r1
            r2.startActivity(r1)
            java.lang.String r18 = "com/tencent/mm/ui/conversation/ConversationClickListener"
            java.lang.String r19 = "onItemClick"
            java.lang.String r20 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
        L_0x070a:
            r5 = 0
            goto L_0x074b
        L_0x070c:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85840k5(r1)
            if (r1 == 0) goto L_0x072f
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomeNotifyMessage
            android.content.Context r2 = r30.getContext()
            boolean r1 = r1.checkAvailable(r2)
            if (r1 != 0) goto L_0x0723
            return
        L_0x0723:
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.ui.conversation.n$b r2 = new com.tencent.mm.ui.conversation.n$b
            r2.<init>(r7, r8)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183870a(r2)
        L_0x072f:
            com.tencent.mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct
            r1.<init>()
            r2 = 0
            r1.mo93192t(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.mo93191s(r2)
            java.lang.String r2 = r0.getUsername()
            r1.mo93193u(r2)
            r1.mo86054n()
            r5 = 1
        L_0x074b:
            if (r5 == 0) goto L_0x0844
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85843n5(r1)
            if (r1 != 0) goto L_0x0761
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85847r5(r1)
            if (r1 == 0) goto L_0x076e
        L_0x0761:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.GlobalWeCom
            android.content.Context r2 = r30.getContext()
            boolean r1 = r1.checkAvailable(r2)
            if (r1 != 0) goto L_0x076e
            return
        L_0x076e:
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85795C5(r1)
            if (r1 == 0) goto L_0x0785
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginSports
            android.content.Context r2 = r30.getContext()
            boolean r1 = r1.checkAvailable(r2)
            if (r1 != 0) goto L_0x0785
            return
        L_0x0785:
            com.tencent.mm.ui.conversation.p r1 = r7.f219663d
            java.lang.String r2 = r0.mo101163n3()
            r1.mo103885L(r8, r10, r2)
            com.tencent.p014mm.plugin.report.service.C85405m.m105411a(r16)
            java.lang.Class<ud2.h> r1 = ud2.C78150h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ud2.h r1 = (ud2.C78150h) r1
            r1.wx0()
            android.app.Activity r1 = r7.f219665f
            com.tencent.mm.ui.LauncherUI r1 = (com.tencent.p014mm.p136ui.LauncherUI) r1
            if (r1 == 0) goto L_0x07a4
            r5 = 1
            goto L_0x07a5
        L_0x07a4:
            r5 = 0
        L_0x07a5:
            java.lang.String r2 = "Launcher should not be empty."
            junit.framework.Assert.assertTrue(r2, r5)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "specific_chat_from_scene"
            r4 = 7
            r2.putInt(r3, r4)
            r3 = 93
            r2.putInt(r12, r3)
            java.lang.String r3 = "chat_from_scene_for_group_chats"
            r4 = 3
            r2.putInt(r3, r4)
            java.lang.String r3 = "Main_IndexInSessionList"
            r2.putInt(r3, r10)
            int r3 = r0.mo108786G2()
            java.lang.String r4 = "Main_UnreadCount"
            r2.putInt(r4, r3)
            java.lang.String r3 = "chat_from_scene"
            r2.putInt(r3, r11)
            java.lang.String r3 = r0.getUsername()
            boolean r3 = eb0.C45628s0.m50738C(r3)
            if (r3 == 0) goto L_0x0805
            k40.a r3 = f40.C86709a0.m107533q(r9)
            ex0.d r3 = (ex0.C45696d) r3
            boolean r3 = r3.mo70993g3()
            if (r3 != 0) goto L_0x0805
            java.lang.String r3 = r0.getUsername()
            java.lang.String r4 = "weixin"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0805
            java.lang.String r3 = r0.getUsername()
            java.lang.String r4 = "gh_b4af18eac3d5"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0805
            r5 = 1
            goto L_0x0806
        L_0x0805:
            r5 = 0
        L_0x0806:
            if (r5 == 0) goto L_0x081e
            com.tencent.mm.ui.conversation.p r3 = r7.f219663d
            r3.mo103887N(r11)
            k40.a r3 = f40.C86709a0.m107533q(r9)
            ex0.d r3 = (ex0.C45696d) r3
            android.app.Activity r4 = r7.f219665f
            com.tencent.mm.ui.conversation.n$c r5 = new com.tencent.mm.ui.conversation.n$c
            r5.<init>(r7, r1, r0, r2)
            r3.Bw0(r4, r5)
            return
        L_0x081e:
            java.lang.String r3 = r0.getUsername()
            r4 = 1
            r1.startChatting(r3, r2, r4)
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85847r5(r1)
            if (r1 == 0) goto L_0x0844
            com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct
            r1.<init>()
            java.lang.String r0 = r0.getUsername()
            r1.mo93194s(r0)
            r2 = 1
            r1.mo93195t(r2)
            r1.mo86054n()
        L_0x0844:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74712n.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
