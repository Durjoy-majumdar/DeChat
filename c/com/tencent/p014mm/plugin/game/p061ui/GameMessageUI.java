package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;
import ry1.C48141o0;
import ry1.C48156s0;
import sw1.C48483p;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.ui.GameMessageUI */
public class GameMessageUI extends GameCenterActivity implements AdapterView.OnItemClickListener, C11385n {

    /* renamed from: w */
    public static final /* synthetic */ int f114071w = 0;

    /* renamed from: h */
    public ListView f114072h;

    /* renamed from: i */
    public C48141o0 f114073i;

    /* renamed from: j */
    public TextView f114074j;

    /* renamed from: n */
    public View f114075n;

    /* renamed from: o */
    public int f114076o;

    /* renamed from: p */
    public boolean f114077p = false;

    /* renamed from: q */
    public int f114078q = 0;

    /* renamed from: r */
    public String f114079r = "";

    /* renamed from: s */
    public long f114080s;

    /* renamed from: t */
    public DialogInterface.OnClickListener f114081t;

    /* renamed from: u */
    public DialogInterface.OnClickListener f114082u;

    /* renamed from: v */
    public AbsListView.OnScrollListener f114083v = new C42221d();

    /* renamed from: com.tencent.mm.plugin.game.ui.GameMessageUI$a */
    public class C42216a implements MenuItem.OnMenuItemClickListener {
        public C42216a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameMessageUI gameMessageUI = GameMessageUI.this;
            int i = GameMessageUI.f114071w;
            gameMessageUI.getClass();
            ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo65997DN();
            gameMessageUI.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameMessageUI$b */
    public class C42217b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.game.ui.GameMessageUI$b$a */
        public class C42218a implements DialogInterface.OnClickListener {
            public C42218a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ((C48484q) C86312j.m106911c(C48484q.class)).xi0().execSQL("GameRawMessage", "delete from GameRawMessage");
                GameMessageUI.this.f114073i.mo1332l();
                GameMessageUI.this.f114073i.notifyDataSetChanged();
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.GameMessageUI$b$b */
        public class C42219b implements DialogInterface.OnClickListener {
            public C42219b(C42217b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C42217b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameMessageUI gameMessageUI = GameMessageUI.this;
            gameMessageUI.f114081t = new C42218a();
            gameMessageUI.f114082u = new C42219b(this);
            AppCompatActivity context = gameMessageUI.getContext();
            GameMessageUI gameMessageUI2 = GameMessageUI.this;
            C76879j.m92743n(context, C0966R.string.f84, 0, gameMessageUI2.f114081t, gameMessageUI2.f114082u);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameMessageUI$c */
    public class C42220c implements C6975i1.C6977b {
        public C42220c() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            if (GameMessageUI.this.f114073i.getCount() == 0) {
                GameMessageUI.this.f114072h.setVisibility(8);
                GameMessageUI.this.mo66244N7(0);
                GameMessageUI.this.enableOptionMenu(false);
                return;
            }
            GameMessageUI.this.f114072h.setVisibility(0);
            GameMessageUI.this.mo66244N7(8);
            GameMessageUI.this.enableOptionMenu(true);
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameMessageUI$d */
    public class C42221d implements AbsListView.OnScrollListener {
        public C42221d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                C48141o0 o0Var = GameMessageUI.this.f114073i;
                int i2 = o0Var.f129045s;
                int i3 = o0Var.f129046t;
                boolean z = true;
                if (!(i2 >= i3)) {
                    if (i2 < i3) {
                        z = false;
                    }
                    if (z) {
                        C6975i1.C6977b bVar = o0Var.f24699h;
                        if (bVar != null) {
                            bVar.mo1327a((Object) null);
                        }
                    } else {
                        int i4 = i2 + 15;
                        o0Var.f129045s = i4;
                        if (i4 > i3) {
                            o0Var.f129045s = i3;
                        }
                    }
                    GameMessageUI.this.f114073i.onNotifyChange((String) null, (MStorageEventData) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
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
        return 13;
    }

    /* renamed from: K7 */
    public int mo66120K7() {
        return this.f114076o;
    }

    /* renamed from: L7 */
    public int mo66121L7() {
        return 1300;
    }

    /* renamed from: N7 */
    public final void mo66244N7(int i) {
        if (this.f114074j == null) {
            this.f114074j = (TextView) findViewById(C0966R.C0970id.emn);
        }
        this.f114074j.setVisibility(i);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.axa;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f360844fa3);
        setBackBtn(new C42216a());
        addTextOptionMenu(0, getString(C0966R.string.f7930wk), new C42217b());
        this.f114076o = getIntent().getIntExtra("game_report_from_scene", 0);
        ListView listView = (ListView) findViewById(C0966R.C0970id.emo);
        this.f114072h = listView;
        listView.setOnItemClickListener(this);
        if (this.f114078q > 20) {
            if (getSharedPreferences("game_center_pref", 0).getBoolean("show_message_tips", true)) {
                View inflate = View.inflate(this, C0966R.C0971layout.axh, (ViewGroup) null);
                this.f114075n = inflate;
                inflate.setOnClickListener(new C48156s0(this));
                this.f114072h.addHeaderView(this.f114075n);
                View view = this.f114075n;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_message_tips", false).apply();
            } else {
                View view3 = this.f114075n;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        C42119w wVar = new C42119w();
        wVar.f113488n2 = true;
        C48141o0 o0Var = new C48141o0(this, wVar, this.f114076o, this.f114080s);
        this.f114073i = o0Var;
        o0Var.mo7997q(true);
        mo66244N7(8);
        this.f114073i.f24699h = new C42220c();
        this.f114072h.setOnScrollListener(this.f114083v);
        this.f114072h.setAdapter(this.f114073i);
        ListView listView2 = this.f114072h;
        C48141o0 o0Var2 = this.f114073i;
        Log.m105925i("MicroMsg.GameMessageAdapter", "init position:%d", Integer.valueOf(o0Var2.f129051y));
        if (o0Var2.f129051y > o0Var2.getCount() - 1) {
            o0Var2.f129051y = o0Var2.getCount() - 1;
        }
        listView2.setSelection(o0Var2.f129051y);
        C40314g.m43485d(getContext(), 13, 1300, 0, 1, 0, (String) null, this.f114076o, 0, (String) null, (String) null, (String) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(573, this);
        this.f114078q = getIntent().getIntExtra("game_unread_msg_count", 0);
        this.f114079r = getIntent().getStringExtra("game_manage_url");
        long longExtra = getIntent().getLongExtra("game_msg_ui_from_msgid", 0);
        this.f114080s = longExtra;
        Log.m105925i("MicroMsg.GameMessageUI", "init msgId:%d", Long.valueOf(longExtra));
        initView();
        ((C48483p) C86312j.m106911c(C48483p.class)).mo66079ar().mo65974c();
    }

    public void onDestroy() {
        Class cls = C48484q.class;
        super.onDestroy();
        C48141o0 o0Var = this.f114073i;
        if (o0Var != null) {
            o0Var.mo5580b();
        }
        C86709a0.m107524d().mo123470p(573, this);
        ((C48484q) C86312j.m106911c(cls)).xi0().mo66007jo();
        ((C48484q) C86312j.m106911c(cls)).xi0().mo65997DN();
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r25, android.view.View r26, int r27, long r28) {
        /*
            r24 = this;
            r6 = r24
            java.lang.Class<ym.l> r7 = p763ym.C79138l.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8 = r25
            r0.add(r8)
            r1 = r26
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r0.add(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r28)
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/game/ui/GameMessageUI"
            java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r2 = "onItemClick"
            java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            r4 = r24
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            android.widget.Adapter r0 = r25.getAdapter()
            r1 = r27
            java.lang.Object r0 = r0.getItem(r1)
            com.tencent.mm.plugin.game.model.w r0 = (com.tencent.p014mm.plugin.game.model.C42119w) r0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "MicroMsg.GameMessageUI"
            java.lang.String r5 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r8 = "onItemClick"
            java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r10 = "com/tencent/mm/plugin/game/ui/GameMessageUI"
            if (r0 != 0) goto L_0x0060
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r0[r3] = r1
            java.lang.String r1 = "get message null: position:[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r0)
            j20.C117292a.m165361g(r6, r10, r9, r8, r5)
            return
        L_0x0060:
            r0.mo66075l2()
            java.lang.String r1 = r0.f113474g2
            r11 = 0
            java.lang.String r23 = com.tencent.p014mm.game.report.C40314g.m43482a(r11, r11, r1, r11)
            int r1 = r0.field_msgType
            r12 = 100
            r13 = 1301(0x515, float:1.823E-42)
            if (r1 != r12) goto L_0x00b8
            java.lang.String r1 = r0.f113450K1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00b4
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.game.model.w$l> r1 = r0.f113494t1
            java.lang.String r2 = r0.f113450K1
            java.lang.Object r1 = r1.get(r2)
            com.tencent.mm.plugin.game.model.w$l r1 = (com.tencent.p014mm.plugin.game.model.C42119w.C42131l) r1
            if (r1 != 0) goto L_0x008a
            j20.C117292a.m165361g(r6, r10, r9, r8, r5)
            return
        L_0x008a:
            java.lang.String r2 = r0.field_appId
            int r16 = com.tencent.p014mm.plugin.game.model.C42143x.m45831a(r6, r0, r1, r2, r13)
            if (r16 == 0) goto L_0x00b4
            androidx.appcompat.app.AppCompatActivity r12 = r24.getContext()
            r13 = 13
            r14 = 1301(0x515, float:1.823E-42)
            r15 = 4
            r17 = 0
            java.lang.String r1 = r0.field_appId
            int r2 = r6.f114076o
            int r3 = r0.f113470e2
            java.lang.String r4 = r0.field_gameMsgId
            java.lang.String r0 = r0.f113472f2
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r0
            com.tencent.p014mm.game.report.C40314g.m43485d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x00b4:
            j20.C117292a.m165361g(r6, r10, r9, r8, r5)
            return
        L_0x00b8:
            int r12 = r0.f113484l2
            r14 = 2
            java.lang.String r15 = "game_report_from_scene"
            java.lang.String r2 = "game_app_id"
            r3 = 3
            if (r12 != 0) goto L_0x0189
            if (r1 == r14) goto L_0x0137
            r4 = 5
            if (r1 == r4) goto L_0x0137
            r2 = 6
            if (r1 == r2) goto L_0x0106
            r2 = 10
            if (r1 == r2) goto L_0x00d4
            r2 = 11
            if (r1 == r2) goto L_0x00d4
            goto L_0x0185
        L_0x00d4:
            java.lang.String r1 = r0.f113477i1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0185
            java.lang.String r1 = r0.f113477i1
            int r16 = uy1.C52642c.m59002t(r6, r1, r11)
            androidx.appcompat.app.AppCompatActivity r12 = r24.getContext()
            r13 = 13
            r14 = 1301(0x515, float:1.823E-42)
            r15 = 4
            r17 = 0
            java.lang.String r1 = r0.field_appId
            int r2 = r6.f114076o
            int r3 = r0.field_msgType
            java.lang.String r4 = r0.field_gameMsgId
            java.lang.String r0 = r0.f113472f2
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r0
            com.tencent.p014mm.game.report.C40314g.m43485d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0185
        L_0x0106:
            java.lang.String r1 = r0.f113445F1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0185
            java.lang.String r1 = r0.f113445F1
            int r16 = uy1.C52642c.m59002t(r6, r1, r11)
            androidx.appcompat.app.AppCompatActivity r12 = r24.getContext()
            r13 = 13
            r14 = 1301(0x515, float:1.823E-42)
            r15 = 4
            r17 = 0
            java.lang.String r1 = r0.field_appId
            int r2 = r6.f114076o
            int r3 = r0.field_msgType
            java.lang.String r4 = r0.field_gameMsgId
            java.lang.String r0 = r0.f113472f2
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r0
            com.tencent.p014mm.game.report.C40314g.m43485d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0185
        L_0x0137:
            di3.d r1 = di3.C86312j.m106911c(r7)
            ym.l r1 = (p763ym.C79138l) r1
            java.lang.String r4 = r0.field_appId
            boolean r1 = r1.Tb0(r6, r4)
            if (r1 == 0) goto L_0x014d
            java.lang.String r1 = r0.field_appId
            com.tencent.p014mm.plugin.game.model.C42046d.m45751j(r6, r1)
            r16 = 3
            goto L_0x0163
        L_0x014d:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r0.field_appId
            r1.putCharSequence(r2, r3)
            r1.putInt(r15, r13)
            java.lang.String r2 = r0.field_appId
            r3 = 0
            int r1 = uy1.C52642c.m58996n(r6, r2, r11, r1, r3)
            r16 = r1
        L_0x0163:
            androidx.appcompat.app.AppCompatActivity r12 = r24.getContext()
            r13 = 13
            r14 = 1301(0x515, float:1.823E-42)
            r15 = 4
            r17 = 0
            java.lang.String r1 = r0.field_appId
            int r2 = r6.f114076o
            int r3 = r0.field_msgType
            java.lang.String r4 = r0.field_gameMsgId
            java.lang.String r0 = r0.f113472f2
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r0
            com.tencent.p014mm.game.report.C40314g.m43485d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0185:
            j20.C117292a.m165361g(r6, r10, r9, r8, r5)
            return
        L_0x0189:
            r1 = 1
            if (r12 == r1) goto L_0x0230
            if (r12 == r14) goto L_0x01e1
            if (r12 == r3) goto L_0x01a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknowed jumptype : "
            r1.append(r2)
            int r0 = r0.f113484l2
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x0277
        L_0x01a8:
            java.lang.String r1 = r0.f113486m2
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x01da
            java.lang.String r1 = r0.f113486m2
            int r16 = uy1.C52642c.m59002t(r6, r1, r11)
            androidx.appcompat.app.AppCompatActivity r12 = r24.getContext()
            r13 = 13
            r14 = 1301(0x515, float:1.823E-42)
            r15 = 4
            r17 = 0
            java.lang.String r1 = r0.field_appId
            int r2 = r6.f114076o
            int r3 = r0.field_msgType
            java.lang.String r4 = r0.field_gameMsgId
            java.lang.String r0 = r0.f113472f2
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r0
            com.tencent.p014mm.game.report.C40314g.m43485d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0277
        L_0x01da:
            java.lang.String r0 = "jumpurl is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x0277
        L_0x01e1:
            di3.d r1 = di3.C86312j.m106911c(r7)
            ym.l r1 = (p763ym.C79138l) r1
            java.lang.String r4 = r0.field_appId
            boolean r1 = r1.Tb0(r6, r4)
            if (r1 == 0) goto L_0x01f7
            java.lang.String r1 = r0.field_appId
            com.tencent.p014mm.plugin.game.model.C42046d.m45751j(r6, r1)
            r16 = 3
            goto L_0x020d
        L_0x01f7:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r0.field_appId
            r1.putCharSequence(r2, r3)
            r1.putInt(r15, r13)
            java.lang.String r2 = r0.field_appId
            r3 = 0
            int r1 = uy1.C52642c.m58996n(r6, r2, r11, r1, r3)
            r16 = r1
        L_0x020d:
            androidx.appcompat.app.AppCompatActivity r12 = r24.getContext()
            r13 = 13
            r14 = 1301(0x515, float:1.823E-42)
            r15 = 4
            r17 = 0
            java.lang.String r1 = r0.field_appId
            int r2 = r6.f114076o
            int r3 = r0.field_msgType
            java.lang.String r4 = r0.field_gameMsgId
            java.lang.String r0 = r0.f113472f2
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r0
            com.tencent.p014mm.game.report.C40314g.m43485d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0277
        L_0x0230:
            java.lang.String r1 = r0.field_appId
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0241
            java.lang.String r0 = "appid is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            j20.C117292a.m165361g(r6, r10, r9, r8, r5)
            return
        L_0x0241:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r0.field_appId
            r1.putCharSequence(r2, r3)
            r1.putInt(r15, r13)
            java.lang.String r2 = r0.field_appId
            r3 = 0
            int r16 = uy1.C52642c.m58996n(r6, r2, r11, r1, r3)
            androidx.appcompat.app.AppCompatActivity r12 = r24.getContext()
            r13 = 13
            r14 = 1301(0x515, float:1.823E-42)
            r15 = 4
            r17 = 0
            java.lang.String r1 = r0.field_appId
            int r2 = r6.f114076o
            int r3 = r0.field_msgType
            java.lang.String r4 = r0.field_gameMsgId
            java.lang.String r0 = r0.f113472f2
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r0
            com.tencent.p014mm.game.report.C40314g.m43485d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0277:
            j20.C117292a.m165361g(r6, r10, r9, r8, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameMessageUI.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo65997DN();
        finish();
        return true;
    }

    public void onResume() {
        View view;
        super.onResume();
        this.f114073i.notifyDataSetChanged();
        if (this.f114077p && (view = this.f114075n) != null) {
            this.f114072h.removeHeaderView(view);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.GameMessageUI", "onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(yVar.getType()));
        if (i == 0 && i2 == 0) {
            if (yVar.getType() == 573) {
                mo66244N7(8);
                this.f114073i.onNotifyChange((String) null, (MStorageEventData) null);
            }
        } else if (this.f114073i.getCount() > 0) {
            Log.m105924i("MicroMsg.GameMessageUI", "has local message, do not show error tips");
        } else if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i, i2, str)) {
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f9g, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
        }
    }
}
