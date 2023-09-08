package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.n */
public class C42301n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameTabWidget2 f114380d;

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.n$a */
    public class C42302a implements Runnable {
        public C42302a() {
        }

        public void run() {
            C42301n.this.f114380d.f114297h = true;
        }
    }

    public C42301n(GameTabWidget2 gameTabWidget2) {
        this.f114380d = gameTabWidget2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d0, code lost:
        r3 = r3.f114315d.getTag();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r18) {
        /*
            r17 = this;
            r7 = r17
            java.lang.String r8 = "(Landroid/view/View;)V"
            java.lang.String r9 = "onClick"
            java.lang.String r10 = "android/view/View$OnClickListener"
            java.lang.String r11 = "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$4"
            java.lang.String r12 = "MicroMsg.GameTabWidget2"
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13 = r18
            r0.add(r13)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$4"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r17
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r18.getTag()
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItem r0 = (com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2.TabItem) r0
            r1 = 1
            r2 = 0
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 r3 = r7.f114380d     // Catch:{ Exception -> 0x0124 }
            android.app.Activity r3 = r3.f114293d     // Catch:{ Exception -> 0x0124 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ Exception -> 0x0124 }
            java.lang.String r4 = "game_tab_key"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r4 = r0.f114267d     // Catch:{ Exception -> 0x0124 }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)     // Catch:{ Exception -> 0x0124 }
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x0124 }
            if (r4 == 0) goto L_0x0050
            j20.C117292a.m165361g(r7, r11, r10, r9, r8)
            return
        L_0x0050:
            java.lang.String r4 = "currentTabKey:%s, nextTabKey:%s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0124 }
            r5[r2] = r3     // Catch:{ Exception -> 0x0124 }
            java.lang.String r3 = r0.f114267d     // Catch:{ Exception -> 0x0124 }
            r5[r1] = r3     // Catch:{ Exception -> 0x0124 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r5)     // Catch:{ Exception -> 0x0124 }
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 r3 = r7.f114380d     // Catch:{ Exception -> 0x0124 }
            boolean r4 = r3.f114295f     // Catch:{ Exception -> 0x0124 }
            if (r4 == 0) goto L_0x011b
            boolean r4 = r3.f114296g     // Catch:{ Exception -> 0x0124 }
            if (r4 == 0) goto L_0x006a
            goto L_0x011b
        L_0x006a:
            android.app.Activity r3 = r3.f114293d     // Catch:{ Exception -> 0x0124 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ Exception -> 0x0124 }
            java.lang.String r4 = "game_tab_type"
            r5 = -1
            int r3 = r3.getIntExtra(r4, r5)     // Catch:{ Exception -> 0x0124 }
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 r4 = r7.f114380d     // Catch:{ Exception -> 0x0124 }
            android.app.Activity r4 = r4.f114293d     // Catch:{ Exception -> 0x0124 }
            android.content.Intent r4 = r4.getIntent()     // Catch:{ Exception -> 0x0124 }
            java.lang.String r5 = "turn_page_time"
            r13 = 0
            long r4 = r4.getLongExtra(r5, r13)     // Catch:{ Exception -> 0x0124 }
            int r6 = r0.f114277q     // Catch:{ Exception -> 0x0124 }
            r13 = 500(0x1f4, double:2.47E-321)
            if (r6 == r3) goto L_0x00a7
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0124 }
            long r15 = r15 - r4
            int r4 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x00a7
            java.lang.String r0 = "switch interval > %d"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0124 }
            java.lang.Long r4 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0124 }
            r3[r2] = r4     // Catch:{ Exception -> 0x0124 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r3)     // Catch:{ Exception -> 0x0124 }
            j20.C117292a.m165361g(r7, r11, r10, r9, r8)
            return
        L_0x00a7:
            int r4 = r0.f114277q     // Catch:{ Exception -> 0x0124 }
            if (r4 == r3) goto L_0x00be
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 r3 = r7.f114380d     // Catch:{ Exception -> 0x0124 }
            r3.f114297h = r2     // Catch:{ Exception -> 0x0124 }
            zt3.t r3 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x0124 }
            com.tencent.mm.plugin.game.ui.chat_tab.n$a r4 = new com.tencent.mm.plugin.game.ui.chat_tab.n$a     // Catch:{ Exception -> 0x0124 }
            r4.<init>()     // Catch:{ Exception -> 0x0124 }
            zt3.j r3 = (zt3.C119157j) r3     // Catch:{ Exception -> 0x0124 }
            r3.getClass()     // Catch:{ Exception -> 0x0124 }
            r3.mo183892w(r4, r13, r2)     // Catch:{ Exception -> 0x0124 }
        L_0x00be:
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 r3 = r7.f114380d     // Catch:{ Exception -> 0x0124 }
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$b r3 = r3.f114294e     // Catch:{ Exception -> 0x0124 }
            java.lang.String r4 = r0.f114267d     // Catch:{ Exception -> 0x0124 }
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$b$b> r3 = r3.f114306h     // Catch:{ Exception -> 0x0124 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0124 }
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$b$b r3 = (com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabWidget2.C42265b.C42267b) r3     // Catch:{ Exception -> 0x0124 }
            if (r3 == 0) goto L_0x00e3
            android.widget.TextView r3 = r3.f114315d     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x0124 }
            if (r3 == 0) goto L_0x00e3
            boolean r4 = r3 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0124 }
            if (r4 == 0) goto L_0x00e3
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0124 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0124 }
            goto L_0x00e4
        L_0x00e3:
            r3 = 0
        L_0x00e4:
            r0.f114285y = r3     // Catch:{ Exception -> 0x0124 }
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 r3 = r7.f114380d     // Catch:{ Exception -> 0x0124 }
            android.app.Activity r3 = r3.f114293d     // Catch:{ Exception -> 0x0124 }
            com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabWidget2.m45946d(r3, r0, r2)     // Catch:{ Exception -> 0x0124 }
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 r3 = r7.f114380d     // Catch:{ Exception -> 0x0124 }
            android.app.Activity r3 = r3.f114293d     // Catch:{ Exception -> 0x0124 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ Exception -> 0x0124 }
            java.lang.String r4 = "game_red_dot_tab_key"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0124 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0124 }
            if (r3 == 0) goto L_0x0132
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 r3 = r7.f114380d     // Catch:{ Exception -> 0x0124 }
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$b r3 = r3.f114294e     // Catch:{ Exception -> 0x0124 }
            java.lang.String r0 = r0.f114267d     // Catch:{ Exception -> 0x0124 }
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$b$b> r3 = r3.f114306h     // Catch:{ Exception -> 0x0124 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ Exception -> 0x0124 }
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$b$b r0 = (com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabWidget2.C42265b.C42267b) r0     // Catch:{ Exception -> 0x0124 }
            if (r0 == 0) goto L_0x0132
            android.widget.ImageView r0 = r0.f114314c     // Catch:{ Exception -> 0x0124 }
            r3 = 8
            r0.setVisibility(r3)     // Catch:{ Exception -> 0x0124 }
            goto L_0x0132
        L_0x011b:
            java.lang.String r0 = "tab switch disable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x0124 }
            j20.C117292a.m165361g(r7, r11, r10, r9, r8)
            return
        L_0x0124:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r1[r2] = r0
            java.lang.String r0 = "selectTab err:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r1)
        L_0x0132:
            j20.C117292a.m165361g(r7, r11, r10, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.chat_tab.C42301n.onClick(android.view.View):void");
    }
}
