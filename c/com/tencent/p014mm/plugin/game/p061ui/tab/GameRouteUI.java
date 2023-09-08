package com.tencent.p014mm.plugin.game.p061ui.tab;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.game.model.C42080o0;
import com.tencent.p014mm.plugin.game.p061ui.GameCenterActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import py1.C47550b2;
import py1.C47570e1;
import sw1.C48484q;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.game.ui.tab.GameRouteUI */
public class GameRouteUI extends GameCenterActivity implements C11385n {

    /* renamed from: i */
    public static final /* synthetic */ int f114661i = 0;

    /* renamed from: h */
    public int f114662h;

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameRouteUI$a */
    public class C42385a implements MenuItem.OnMenuItemClickListener {
        public C42385a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameRouteUI gameRouteUI = GameRouteUI.this;
            int i = GameRouteUI.f114661i;
            gameRouteUI.mo66449N7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameRouteUI$b */
    public class C42386b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47550b2 f114664d;

        public C42386b(C47550b2 b2Var) {
            this.f114664d = b2Var;
        }

        public void run() {
            C42080o0.m45781k1(this.f114664d);
            C47550b2 b2Var = this.f114664d;
            if (b2Var == null || Util.isNullOrNil((List) b2Var.f127594d)) {
                Log.m105920e("MicroMsg.GameRouteUI", "get GameIndex4TabNavData err");
                GameRouteUI gameRouteUI = GameRouteUI.this;
                int i = GameRouteUI.f114661i;
                gameRouteUI.mo66449N7();
                return;
            }
            GameRouteUI gameRouteUI2 = GameRouteUI.this;
            LinkedList<C47570e1> linkedList = this.f114664d.f127594d;
            int i2 = GameRouteUI.f114661i;
            gameRouteUI2.mo66450O7(linkedList, false);
        }
    }

    /* renamed from: H7 */
    public String mo66117H7() {
        return null;
    }

    /* renamed from: I7 */
    public String mo66118I7() {
        return null;
    }

    /* renamed from: J7 */
    public int mo66119J7() {
        return 0;
    }

    /* renamed from: K7 */
    public int mo66120K7() {
        return 0;
    }

    /* renamed from: L7 */
    public int mo66121L7() {
        return 0;
    }

    /* renamed from: N7 */
    public final void mo66449N7() {
        if (!isFinishing() && !isDestroyed()) {
            finish();
            overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.tencent.mm.plugin.game.model.GameTabData$TabItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66450O7(java.util.List<py1.C47570e1> r16, boolean r17) {
        /*
            r15 = this;
            r8 = r15
            boolean r0 = r15.isFinishing()
            if (r0 != 0) goto L_0x0137
            boolean r0 = r15.isDestroyed()
            if (r0 == 0) goto L_0x000f
            goto L_0x0137
        L_0x000f:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r16)
            r1 = 0
            r9 = 0
            if (r0 == 0) goto L_0x001a
            r10 = r1
            goto L_0x00b3
        L_0x001a:
            com.tencent.mm.plugin.game.model.GameTabData r0 = new com.tencent.mm.plugin.game.model.GameTabData
            r0.<init>()
            py1.s4 r2 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45378l()
            if (r2 == 0) goto L_0x0033
            com.tencent.mm.plugin.game.model.GameTabData$StatusBar r3 = r0.f113190e
            java.lang.String r4 = r2.f128002e
            r3.f113191d = r4
            java.lang.String r2 = r2.f128001d
            int r2 = uy1.C52642c.m59005w(r2)
            r3.f113192e = r2
        L_0x0033:
            java.util.Iterator r2 = r16.iterator()
            r3 = 0
        L_0x0038:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00b2
            java.lang.Object r4 = r2.next()
            py1.e1 r4 = (py1.C47570e1) r4
            if (r4 == 0) goto L_0x0038
            java.lang.String r5 = r4.f127653e
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x004f
            goto L_0x0038
        L_0x004f:
            com.tencent.mm.plugin.game.model.GameTabData$TabItem r5 = new com.tencent.mm.plugin.game.model.GameTabData$TabItem
            r5.<init>()
            java.lang.String r6 = r4.f127653e
            r5.f113193d = r6
            java.lang.String r6 = r4.f127652d
            r5.f113194e = r6
            boolean r6 = r4.f127655g
            r5.f113196g = r6
            boolean r6 = r4.f127656h
            r5.f113197h = r6
            java.lang.String r7 = r4.f127654f
            r5.f113195f = r7
            java.lang.String r7 = r4.f127657i
            r5.f113200n = r7
            java.lang.String r7 = r4.f127658j
            r5.f113201o = r7
            if (r6 == 0) goto L_0x007b
            java.lang.Class<com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI> r6 = com.tencent.p014mm.plugin.game.p061ui.tab.GameTabHomeUI.class
            java.lang.String r6 = r6.getName()
            r5.f113202p = r6
            goto L_0x009c
        L_0x007b:
            int r6 = r3 + 1
            int r3 = r3 % 3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "com.tencent.mm.plugin.game.ui.tab.GameTabWebUI"
            r7.append(r10)
            if (r3 == 0) goto L_0x0090
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x0092
        L_0x0090:
            java.lang.String r3 = ""
        L_0x0092:
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r5.f113202p = r3
            r3 = r6
        L_0x009c:
            r5.f113203q = r9
            int r6 = r4.f127659n
            r5.f113204r = r6
            int r6 = r4.f127660o
            r5.f113205s = r6
            java.lang.String r4 = r4.f127661p
            r5.f113206t = r4
            java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.game.model.GameTabData$TabItem> r4 = r0.f113189d
            java.lang.String r6 = r5.f113193d
            r4.put(r6, r5)
            goto L_0x0038
        L_0x00b2:
            r10 = r0
        L_0x00b3:
            java.lang.String r11 = "MicroMsg.GameRouteUI"
            if (r10 == 0) goto L_0x012f
            java.util.List r0 = r10.mo65923a()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 == 0) goto L_0x00c3
            goto L_0x012f
        L_0x00c3:
            java.util.List r12 = r10.mo65923a()
            r13 = 0
        L_0x00c8:
            r0 = r12
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            if (r13 >= r2) goto L_0x00f9
            java.lang.Object r0 = r0.get(r13)
            com.tencent.mm.plugin.game.model.GameTabData$TabItem r0 = (com.tencent.p014mm.plugin.game.model.GameTabData.TabItem) r0
            if (r0 != 0) goto L_0x00da
            goto L_0x00f6
        L_0x00da:
            boolean r2 = r0.f113196g
            if (r2 == 0) goto L_0x00e0
            r14 = r0
            goto L_0x00e1
        L_0x00e0:
            r14 = r1
        L_0x00e1:
            r1 = 18
            int r2 = r0.f113204r
            int r3 = r0.f113205s
            r4 = 1
            r5 = 0
            int r6 = r8.f114662h
            java.lang.String r0 = r0.f113206t
            java.lang.String r7 = qy1.C12934a.m12382d(r0)
            r0 = r15
            qy1.C12934a.m12380b(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = r14
        L_0x00f6:
            int r13 = r13 + 1
            goto L_0x00c8
        L_0x00f9:
            if (r1 != 0) goto L_0x0102
            java.lang.Object r0 = r0.get(r9)
            r1 = r0
            com.tencent.mm.plugin.game.model.GameTabData$TabItem r1 = (com.tencent.p014mm.plugin.game.model.GameTabData.TabItem) r1
        L_0x0102:
            if (r1 != 0) goto L_0x010d
            java.lang.String r0 = "game tab entry item is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r15.mo66449N7()
            return
        L_0x010d:
            android.content.Intent r0 = r15.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 != 0) goto L_0x011c
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x011c:
            java.lang.String r2 = "tab_data"
            r0.putParcelable(r2, r10)
            android.content.Intent r2 = r15.getIntent()
            r2.putExtras(r0)
            r0 = 1
            r2 = r17
            com.tencent.p014mm.plugin.game.p061ui.tab.GameTabWidget.m46063c(r15, r1, r2, r0, r0)
            return
        L_0x012f:
            java.lang.String r0 = "game tab data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r15.mo66449N7()
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.tab.GameRouteUI.mo66450O7(java.util.List, boolean):void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.axn;
    }

    public void initView() {
        setBackBtn(new C42385a());
        setMMTitle((int) C0966R.string.fcu);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        this.f114662h = getIntent().getIntExtra("game_report_from_scene", 0);
        byte[] Rz = ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57116Rz("game_index4_tab_nav");
        C47550b2 b2Var = null;
        if (!Util.isNullOrNil(Rz)) {
            try {
                C47550b2 b2Var2 = new C47550b2();
                try {
                    b2Var2.parseFrom(Rz);
                } catch (IOException unused) {
                }
                b2Var = b2Var2;
            } catch (IOException unused2) {
            }
        }
        if (b2Var == null || Util.isNullOrNil((List) b2Var.f127594d)) {
            C86709a0.m107524d().mo123455a(2641, this);
            C86709a0.m107524d().mo123460f(new C42080o0());
            return;
        }
        Log.m105924i("MicroMsg.GameRouteUI", "use cache data");
        String str = C42080o0.f113376f;
        Log.m105924i("MicroMsg.NetSceneGameIndex4TabNav", "update gameIndexTabNav data");
        C86709a0.m107524d().mo123455a(2641, C42080o0.f113377g);
        C86709a0.m107524d().mo123460f(new C42080o0());
        boolean booleanExtra = getIntent().getBooleanExtra("switch_country_no_anim", false);
        getIntent().removeExtra("switch_country_no_anim");
        mo66450O7(b2Var.f127594d, !booleanExtra);
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(2641, this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo66449N7();
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            Log.m105924i("MicroMsg.GameRouteUI", "pull gameIndexTabNav data success");
            MMHandlerThread.postToMainThread(new C42386b((C47550b2) ((C42080o0) yVar).f113379e.f127056b.f127083a));
            return;
        }
        Log.m105924i("MicroMsg.GameRouteUI", "pull gameIndexTabNav data fail");
        mo66449N7();
    }
}
