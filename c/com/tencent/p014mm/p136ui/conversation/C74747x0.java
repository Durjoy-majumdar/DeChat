package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.p136ui.C75029y;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.tencent.mm.ui.conversation.x0 */
public class C74747x0 implements C75029y.C75035d {

    /* renamed from: a */
    public final /* synthetic */ MainUI f219794a;

    /* renamed from: com.tencent.mm.ui.conversation.x0$a */
    public class C74748a implements Runnable {
        public C74748a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                r0 = 0
                com.tencent.mm.ui.LauncherUI r1 = com.tencent.p014mm.p136ui.LauncherUI.getInstance()     // Catch:{ Exception -> 0x000d }
                com.tencent.mm.ui.MainTabUI r1 = r1.mo101375O7()     // Catch:{ Exception -> 0x000d }
                r1.mo101427k()     // Catch:{ Exception -> 0x000d }
                goto L_0x0017
            L_0x000d:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r0]
                java.lang.String r3 = "MicroMsg.MainUI"
                java.lang.String r4 = "report unread"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r4, r2)
            L_0x0017:
                com.tencent.mm.ui.conversation.x0 r1 = com.tencent.p014mm.p136ui.conversation.C74747x0.this
                com.tencent.mm.ui.conversation.MainUI r1 = r1.f219794a
                com.tencent.mm.ui.conversation.p r2 = r1.f219483v
                int r2 = r2.getCount()
                r3 = 8
                r4 = 1
                if (r2 > 0) goto L_0x006f
                com.tencent.mm.ui.conversation.BannerHelper r2 = r1.f219484w
                android.content.Context r5 = r2.f219278p
                if (r5 != 0) goto L_0x002d
                goto L_0x0062
            L_0x002d:
                java.lang.Object[] r5 = new java.lang.Object[r4]
                int r6 = r2.hashCode()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5[r0] = r6
                java.lang.String r6 = "MicroMsg.BannerHelper"
                java.lang.String r7 = "checkBannerEmpyt %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
                java.util.List<xd3.b> r5 = r2.f219269d
                boolean r5 = r2.mo103667e(r5, r0)
                if (r5 != 0) goto L_0x0062
                java.util.List<xd3.b> r5 = r2.f219270e
                boolean r5 = r2.mo103667e(r5, r0)
                if (r5 != 0) goto L_0x0062
                java.util.List<xd3.b> r5 = r2.f219271f
                boolean r5 = r2.mo103667e(r5, r0)
                if (r5 != 0) goto L_0x0062
                java.util.List<xd3.b> r5 = r2.f219272g
                boolean r2 = r2.mo103667e(r5, r0)
                if (r2 != 0) goto L_0x0062
                r2 = 1
                goto L_0x0063
            L_0x0062:
                r2 = 0
            L_0x0063:
                if (r2 == 0) goto L_0x006f
                android.widget.TextView r2 = r1.f219481t
                r2.setVisibility(r0)
                com.tencent.mm.ui.conversation.ConversationListView r2 = r1.f219476o
                r2.setVisibility(r3)
            L_0x006f:
                com.tencent.mm.ui.conversation.ConversationListView r2 = r1.f219476o
                r2.setVisibility(r0)
                android.widget.TextView r1 = r1.f219481t
                r1.setVisibility(r3)
                com.tencent.mm.ui.conversation.x0 r1 = com.tencent.p014mm.p136ui.conversation.C74747x0.this
                com.tencent.mm.ui.conversation.MainUI r1 = r1.f219794a
                com.tencent.mm.ui.conversation.p r1 = r1.f219483v
                int r1 = r1.getCount()
                if (r1 > 0) goto L_0x00f6
                com.tencent.mm.ui.conversation.x0 r1 = com.tencent.p014mm.p136ui.conversation.C74747x0.this
                com.tencent.mm.ui.conversation.MainUI r1 = r1.f219794a
                com.tencent.mm.ui.conversation.ConversationListView r1 = r1.f219476o
                if (r1 == 0) goto L_0x00f6
                java.lang.Object[] r2 = new java.lang.Object[r4]
                boolean r3 = r1.f219367z
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r2[r0] = r3
                java.lang.String r3 = "MicroMsg.ConversationListView"
                java.lang.String r4 = "alvinluo refreshFooter mHeaderOpen: %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
                boolean r2 = r1.f219367z
                if (r2 != 0) goto L_0x00f6
                r1.mo103716f(r0)
                android.view.View r2 = r1.f219343U
                if (r2 == 0) goto L_0x00bb
                android.content.Context r3 = r1.getContext()
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131099650(0x7f060002, float:1.781166E38)
                int r3 = r3.getColor(r4)
                r2.setBackgroundColor(r3)
            L_0x00bb:
                boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                r3 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x00dd
                android.content.res.Resources r2 = r1.getResources()
                r4 = 2131100364(0x7f0602cc, float:1.7813107E38)
                int r2 = r2.getColor(r4)
                android.content.res.Resources r4 = r1.getResources()
                r5 = 2131100005(0x7f060165, float:1.781238E38)
                int r4 = r4.getColor(r5)
                r1.mo103742r(r3, r2, r4)
                goto L_0x00f6
            L_0x00dd:
                android.content.res.Resources r2 = r1.getResources()
                r4 = 2131101246(0x7f06063e, float:1.7814896E38)
                int r2 = r2.getColor(r4)
                android.content.res.Resources r4 = r1.getResources()
                r5 = 2131100004(0x7f060164, float:1.7812377E38)
                int r4 = r4.getColor(r5)
                r1.mo103742r(r3, r2, r4)
            L_0x00f6:
                com.tencent.mm.ui.conversation.x0 r1 = com.tencent.p014mm.p136ui.conversation.C74747x0.this
                com.tencent.mm.ui.conversation.MainUI r1 = r1.f219794a
                com.tencent.mm.ui.conversation.BannerHelper r1 = r1.f219484w
                r1.mo103670h()
                com.tencent.mm.ui.conversation.x0 r1 = com.tencent.p014mm.p136ui.conversation.C74747x0.this
                com.tencent.mm.ui.conversation.MainUI r1 = r1.f219794a
                com.tencent.mm.ui.conversation.FolderHelper r1 = r1.f219485x
                r1.mo103778B(r0)
                r0 = 12
                com.tencent.p014mm.plugin.report.service.C85405m.m105412b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74747x0.C74748a.run():void");
        }
    }

    public C74747x0(MainUI mainUI) {
        this.f219794a = mainUI;
    }

    /* renamed from: a */
    public void mo103572a(Object obj) {
        HashSet<String> hashSet;
        C74720p pVar = this.f219794a.f219483v;
        if (!(pVar == null || pVar.f219717y == null || (hashSet = pVar.f219693J) == null || hashSet.isEmpty())) {
            if (pVar.f219694K) {
                pVar.f219717y.clear();
                pVar.f219694K = false;
                pVar.f219693J.clear();
            } else {
                Log.m105919d("MicroMsg.ConversationWithCacheAdapter", "dealWithConversationEvents size %d", Integer.valueOf(pVar.f219693J.size()));
                Iterator<String> it = pVar.f219693J.iterator();
                while (it.hasNext()) {
                    pVar.f219717y.remove(it.next());
                }
                pVar.f219693J.clear();
            }
        }
        this.f219794a.f219476o.post(new C74748a());
    }

    /* renamed from: b */
    public void mo103573b(Object obj) {
        C85405m.m105411a(12);
    }
}
