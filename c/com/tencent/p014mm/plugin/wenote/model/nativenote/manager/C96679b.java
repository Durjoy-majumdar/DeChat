package com.tencent.p014mm.plugin.wenote.model.nativenote.manager;

import ab3.C91985c;
import ab3.C91986d;
import android.text.Spannable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import bb3.C92219b;
import bb3.C92221d;
import bb3.C92225e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96738o;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import db3.C97463g;
import db3.C97469m;
import db3.C97477t;
import gb3.C98096c;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;
import sx3.C26236u;
import wc3.C78538u;
import xa3.C102587c;
import xa3.C102593i;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.manager.b */
public class C96679b implements C91986d {

    /* renamed from: r */
    public static C96679b f283182r;

    /* renamed from: s */
    public static int f283183s;

    /* renamed from: t */
    public static DisplayMetrics f283184t;

    /* renamed from: a */
    public boolean f283185a;

    /* renamed from: b */
    public long f283186b = -1;

    /* renamed from: c */
    public transient ArrayList<WXRTEditText> f283187c = new ArrayList<>();

    /* renamed from: d */
    public C96738o f283188d;

    /* renamed from: e */
    public long f283189e = -1;

    /* renamed from: f */
    public String f283190f = "";

    /* renamed from: g */
    public long f283191g = -1;

    /* renamed from: h */
    public C91985c f283192h = null;

    /* renamed from: i */
    public boolean f283193i = false;

    /* renamed from: j */
    public int f283194j = -1;

    /* renamed from: k */
    public String f283195k = null;

    /* renamed from: l */
    public long f283196l = -1;

    /* renamed from: m */
    public int f283197m = 0;

    /* renamed from: n */
    public boolean f283198n = false;

    /* renamed from: o */
    public C96683d f283199o;

    /* renamed from: p */
    public View.OnKeyListener f283200p = new C96680a();

    /* renamed from: q */
    public final MTimerHandler f283201q = new MTimerHandler(new C96681b(), true);

    /* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.manager.b$a */
    public class C96680a implements View.OnKeyListener {
        public C96680a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:119:0x0355  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onKey(android.view.View r19, int r20, android.view.KeyEvent r21) {
            /*
                r18 = this;
                r7 = r18
                java.lang.String r1 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r2 = "android/view/View$OnKeyListener"
                java.lang.String r3 = "onKey"
                java.lang.String r4 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5 = r19
                r0.add(r5)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
                r0.add(r5)
                r8 = r21
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                r5 = r18
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                int r0 = r21.getAction()
                r9 = 0
                if (r0 != 0) goto L_0x04a4
                int r0 = r21.getKeyCode()
                r1 = 67
                if (r0 != r1) goto L_0x04a4
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                bb3.d r0 = r0.f283238X0
                int r0 = r0.mo126186F()
                if (r0 != 0) goto L_0x005a
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 0
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r9
            L_0x005a:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r0.mo134904b()
                if (r0 != 0) goto L_0x0072
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 0
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r9
            L_0x0072:
                int r1 = r0.getRecyclerItemPosition()
                java.lang.String r2 = "MicroMsg.Note.WXRTManager"
                java.lang.String r3 = "current focus pos: %d"
                r8 = 1
                java.lang.Object[] r4 = new java.lang.Object[r8]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
                r4[r9] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r2 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r2 = r2.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r2
                bb3.d r2 = r2.f283238X0
                xa3.c r2 = r2.mo126201k(r1)
                if (r2 != 0) goto L_0x00b3
                java.lang.String r0 = "MicroMsg.Note.WXRTManager"
                java.lang.String r2 = "get current item is null %d"
                java.lang.Object[] r3 = new java.lang.Object[r8]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3[r9] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r2, r3)
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 0
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r9
            L_0x00b3:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r3 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r3 = r3.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r3
                bb3.d r3 = r3.f283238X0
                int r4 = r1 + -1
                xa3.c r3 = r3.mo126201k(r4)
                int r5 = r0.getEditTextType()
                r10 = 0
                r6 = 2
                r12 = 0
                if (r5 == 0) goto L_0x036c
                r13 = -1
                if (r5 == r8) goto L_0x0241
                if (r5 == r6) goto L_0x00d2
                goto L_0x0484
            L_0x00d2:
                java.lang.String r3 = "MicroMsg.Note.WXRTManager"
                java.lang.String r5 = "Handle Editor Type NEXTBTTTON"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                int r3 = r2.mo142212c()
                r5 = 4
                if (r3 != r5) goto L_0x0102
                r3 = r2
                xa3.l r3 = (xa3.C102596l) r3
                java.lang.Boolean r3 = r3.f302088y
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x0102
                java.lang.String r0 = "MicroMsg.Note.WXRTManager"
                java.lang.String r1 = "Current Item is Voice and Recording"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 0
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r9
            L_0x0102:
                boolean r3 = r2.f302078i
                if (r3 != 0) goto L_0x0127
                int r2 = r2.mo142212c()
                if (r2 == r13) goto L_0x0127
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                bb3.d r0 = r0.f283238X0
                r0.mo126184D(r1, r8, r8)
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 1
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r8
            L_0x0127:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r2 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r2 = r2.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r2
                bb3.d r5 = r2.f283238X0
                monitor-enter(r5)
                java.util.ArrayList<xa3.c> r2 = r5.f263945a     // Catch:{ all -> 0x0174 }
                if (r2 != 0) goto L_0x0136
                monitor-exit(r5)     // Catch:{ all -> 0x0174 }
                goto L_0x0197
            L_0x0136:
                if (r1 < 0) goto L_0x0196
                int r2 = r2.size()     // Catch:{ all -> 0x0174 }
                if (r1 >= r2) goto L_0x0196
                java.util.ArrayList<xa3.c> r2 = r5.f263945a     // Catch:{ all -> 0x0174 }
                java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0174 }
                xa3.c r2 = (xa3.C102587c) r2     // Catch:{ all -> 0x0174 }
                boolean r3 = r2 instanceof xa3.C102600p     // Catch:{ all -> 0x0174 }
                if (r3 == 0) goto L_0x0196
                xa3.p r2 = (xa3.C102600p) r2     // Catch:{ all -> 0x0174 }
                int r3 = r2.mo142218h()     // Catch:{ all -> 0x0174 }
                int r0 = r0.f283163R0     // Catch:{ all -> 0x0174 }
                if (r3 <= r8) goto L_0x0194
                if (r0 <= 0) goto L_0x0194
                ib3.j r3 = r2.f302103t     // Catch:{ all -> 0x0174 }
                if (r3 == 0) goto L_0x0177
                if (r0 < r8) goto L_0x0177
                java.util.LinkedList<ib3.j$b> r3 = r3.f289210W     // Catch:{ all -> 0x0174 }
                int r6 = r0 + -1
                java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x0174 }
                ib3.j$b r3 = (ib3.C98640j.C98642b) r3     // Catch:{ all -> 0x0174 }
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r3 = r3.f289218f     // Catch:{ all -> 0x0174 }
                if (r3 == 0) goto L_0x016e
                r3.requestFocus()     // Catch:{ all -> 0x0174 }
                goto L_0x0177
            L_0x016e:
                java.lang.String r0 = "btnPre"
                gy3.C87412m.m108603p(r0)     // Catch:{ all -> 0x0174 }
                throw r12     // Catch:{ all -> 0x0174 }
            L_0x0174:
                r0 = move-exception
                goto L_0x023f
            L_0x0177:
                int r0 = r0 - r8
                java.util.LinkedList<xa3.c> r2 = r2.f302102s     // Catch:{ all -> 0x0174 }
                java.lang.Object r0 = r2.remove(r0)     // Catch:{ all -> 0x0174 }
                java.lang.String r2 = "dataList.removeAt(index)"
                gy3.C87412m.m108593f(r0, r2)     // Catch:{ all -> 0x0174 }
                xa3.c r0 = (xa3.C102587c) r0     // Catch:{ all -> 0x0174 }
                r5.mo126184D(r1, r9, r9)     // Catch:{ all -> 0x0174 }
                ab3.a r0 = r5.f263946b     // Catch:{ all -> 0x0174 }
                if (r0 == 0) goto L_0x0191
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0     // Catch:{ all -> 0x0174 }
                r0.mo134940h2(r1, r10)     // Catch:{ all -> 0x0174 }
            L_0x0191:
                monitor-exit(r5)     // Catch:{ all -> 0x0174 }
                r0 = 1
                goto L_0x0198
            L_0x0194:
                monitor-exit(r5)     // Catch:{ all -> 0x0174 }
                goto L_0x0197
            L_0x0196:
                monitor-exit(r5)     // Catch:{ all -> 0x0174 }
            L_0x0197:
                r0 = 0
            L_0x0198:
                if (r0 == 0) goto L_0x01aa
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 1
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r8
            L_0x01aa:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                bb3.d r0 = r0.f283238X0
                r0.mo126198h()
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                bb3.d r0 = r0.f283238X0
                r0.mo126215y(r1, r9)
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                r0.getClass()
                r0.mo134935d5(r1)
                xa3.i r0 = new xa3.i
                r0.<init>()
                r0.f302071b = r8
                r0.f302077h = r9
                java.lang.String r2 = ""
                r0.f302126s = r2
                r0.f302072c = r9
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r2 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r2 = r2.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r2
                bb3.d r2 = r2.f283238X0
                r2.mo126191a(r1, r0, r8)
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                bb3.d r0 = r0.f283238X0
                int r2 = r1 + 1
                r0.mo126194d(r4, r2, r8)
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                androidx.recyclerview.widget.RecyclerView r0 = r0.f283257n
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2.mo10233c(r1)
                java.lang.Object[] r11 = r2.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r13 = "onKey"
                java.lang.String r14 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                java.lang.String r15 = "Undefined"
                java.lang.String r16 = "scrollToPosition"
                java.lang.String r17 = "(I)V"
                r10 = r0
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r1 = r2.mo10231a(r9)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r0.mo17115r1(r1)
                java.lang.String r11 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r12 = "onKey"
                java.lang.String r13 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                java.lang.String r14 = "Undefined"
                java.lang.String r15 = "scrollToPosition"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                goto L_0x0484
            L_0x023f:
                monitor-exit(r5)     // Catch:{ all -> 0x0174 }
                throw r0
            L_0x0241:
                java.lang.String r0 = "MicroMsg.Note.WXRTManager"
                java.lang.String r5 = "Handle Editor Type PREBUTTON"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
                if (r3 != 0) goto L_0x0269
                java.lang.String r0 = "MicroMsg.Note.WXRTManager"
                java.lang.String r2 = "get preItem is null %d"
                java.lang.Object[] r3 = new java.lang.Object[r8]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3[r9] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 0
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r9
            L_0x0269:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                bb3.d r0 = r0.f283238X0
                r0.mo126198h()
                int r0 = r3.mo142212c()
                if (r0 != r8) goto L_0x02d0
                xa3.i r3 = (xa3.C102593i) r3
                java.lang.String r0 = r3.f302126s
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x02a8
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r2.f302073d
                r0.setSelection(r9)
                r2.f302071b = r8
                r2.f302077h = r8
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                bb3.d r0 = r0.f283238X0
                r0.mo126215y(r4, r8)
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 1
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r8
            L_0x02a8:
                java.lang.String r0 = r3.f302126s
                java.lang.String r1 = "<br/>"
                boolean r0 = r0.endsWith(r1)
                if (r0 == 0) goto L_0x02c8
                java.lang.String r0 = r3.f302126s
                int r1 = r0.length()
                int r1 = r1 + -5
                java.lang.String r0 = r0.substring(r9, r1)
                r3.f302126s = r0
                r3.f302072c = r13
                r3.f302071b = r8
                r3.f302077h = r9
                goto L_0x035e
            L_0x02c8:
                r3.f302072c = r13
                r3.f302071b = r8
                r3.f302077h = r9
                goto L_0x035e
            L_0x02d0:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                r0.getClass()
                boolean r1 = r3 instanceof xa3.C102600p
                if (r1 == 0) goto L_0x0351
                boolean r1 = r2 instanceof xa3.C102600p
                if (r1 == 0) goto L_0x0351
                r1 = r3
                xa3.p r1 = (xa3.C102600p) r1
                xa3.p r2 = (xa3.C102600p) r2
                java.util.LinkedList<xa3.c> r5 = r1.f302102s
                int r5 = r5.size()
                int r5 = 3 - r5
                if (r5 >= 0) goto L_0x02ed
                r5 = 0
            L_0x02ed:
                if (r5 != 0) goto L_0x02f1
                r1 = 0
                goto L_0x032c
            L_0x02f1:
                ib3.j r10 = r1.f302103t
                if (r10 == 0) goto L_0x0309
                int r11 = r1.mo142218h()
                int r11 = r11 - r8
                java.util.LinkedList<ib3.j$b> r10 = r10.f289210W
                java.lang.Object r10 = r10.get(r11)
                ib3.j$b r10 = (ib3.C98640j.C98642b) r10
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r10 = r10.mo138070a()
                r10.requestFocus()
            L_0x0309:
                java.util.LinkedList<xa3.c> r10 = r2.f302102s
                java.util.Iterator r10 = r10.iterator()
                java.lang.String r11 = "dataList.iterator()"
                gy3.C87412m.m108593f(r10, r11)
            L_0x0314:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x032b
                if (r5 <= 0) goto L_0x032b
                java.lang.Object r11 = r10.next()
                xa3.c r11 = (xa3.C102587c) r11
                r1.mo142216f(r11)
                int r5 = r5 + -1
                r10.remove()
                goto L_0x0314
            L_0x032b:
                r1 = 1
            L_0x032c:
                if (r1 != 0) goto L_0x032f
                goto L_0x0351
            L_0x032f:
                int r1 = r2.mo142218h()
                if (r1 != 0) goto L_0x034f
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r1 = r2.f302075f
                if (r1 == 0) goto L_0x033e
                int r13 = r1.getRecyclerItemPosition()
                goto L_0x0346
            L_0x033e:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r1 = r2.f302074e
                if (r1 == 0) goto L_0x0346
                int r13 = r1.getRecyclerItemPosition()
            L_0x0346:
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                bb3.d r0 = r0.f283238X0
                r0.mo126215y(r13, r8)
            L_0x034f:
                r0 = 1
                goto L_0x0352
            L_0x0351:
                r0 = 0
            L_0x0352:
                if (r0 == 0) goto L_0x0355
                goto L_0x035e
            L_0x0355:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r3.f302074e
                r0.setSelection(r9)
                r3.f302071b = r8
                r3.f302077h = r9
            L_0x035e:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                r0.getClass()
                r0.mo134931Z7(r4, r6)
                goto L_0x0484
            L_0x036c:
                java.lang.String r2 = "MicroMsg.Note.WXRTManager"
                java.lang.String r5 = "Handle Editor Type EDITTEXT"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
                if (r3 != 0) goto L_0x0394
                java.lang.String r0 = "MicroMsg.Note.WXRTManager"
                java.lang.String r2 = "get preItem is null %d"
                java.lang.Object[] r3 = new java.lang.Object[r8]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3[r9] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 0
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r9
            L_0x0394:
                int r2 = r0.getSelectionStart()
                int r5 = r0.getSelectionEnd()
                if (r2 == r5) goto L_0x03ae
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 0
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r9
            L_0x03ae:
                bb3.i r5 = r0.getParagraphsInSelection()
                int r5 = r5.f263989d
                if (r2 != r5) goto L_0x03f8
                r0.f283156L = r8
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r5 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                db3.c r13 = db3.C97478u.f286110c
                java.lang.Boolean r14 = java.lang.Boolean.FALSE
                r5.mo134907e(r13, r14)
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r5 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                db3.l r13 = db3.C97478u.f286111d
                r5.mo134907e(r13, r14)
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r5 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                db3.j r13 = db3.C97478u.f286109b
                r5.mo134907e(r13, r14)
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r5 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                ab3.c r5 = r5.f283192h
                com.tencent.mm.plugin.wenote.ui.nativenote.e0 r5 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r5
                r5.f283368p = r9
                android.widget.LinearLayout r5 = r5.f283361i
                r5.setPressed(r9)
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r5 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                ab3.c r5 = r5.f283192h
                com.tencent.mm.plugin.wenote.ui.nativenote.e0 r5 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r5
                r5.f283369q = r9
                android.widget.LinearLayout r5 = r5.f283362j
                r5.setPressed(r9)
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r5 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                ab3.c r5 = r5.f283192h
                com.tencent.mm.plugin.wenote.ui.nativenote.e0 r5 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r5
                r5.f283370r = r9
                android.widget.LinearLayout r5 = r5.f283364l
                r5.setPressed(r9)
                r0.f283156L = r9
            L_0x03f8:
                if (r2 != 0) goto L_0x0494
                if (r1 != 0) goto L_0x03fe
                goto L_0x0494
            L_0x03fe:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.a$a r2 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C26902a.f74806b
                java.lang.String r0 = r0.mo134890u(r2)
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r2 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r2 = r2.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r2
                bb3.d r2 = r2.f283238X0
                r2.mo126198h()
                int r2 = r3.mo142212c()
                if (r2 != r8) goto L_0x044b
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r2 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r2 = r2.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r2
                bb3.d r2 = r2.f283238X0
                boolean r1 = r2.mo126216z(r1, r8, r12)
                xa3.i r3 = (xa3.C102593i) r3
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r2 = r3.f302075f
                android.text.Editable r2 = r2.getText()
                java.lang.String r2 = r2.toString()
                int r2 = r2.length()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r12 = r3.f302126s
                r5.append(r12)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                r3.f302126s = r0
                r3.f302072c = r2
                r3.f302071b = r8
                r3.f302077h = r9
                goto L_0x0469
            L_0x044b:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x045f
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                bb3.d r0 = r0.f283238X0
                boolean r0 = r0.mo126216z(r1, r8, r12)
                r1 = r0
                goto L_0x0460
            L_0x045f:
                r1 = 0
            L_0x0460:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r3.f302074e
                r0.setSelection(r9)
                r3.f302071b = r8
                r3.f302077h = r9
            L_0x0469:
                if (r1 == 0) goto L_0x0478
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                r0.getClass()
                r0.mo134940h2(r4, r10)
                goto L_0x0484
            L_0x0478:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.this
                com.tencent.mm.plugin.wenote.ui.nativenote.o r0 = r0.f283188d
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
                r0.getClass()
                r0.mo134931Z7(r4, r6)
            L_0x0484:
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 1
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r8
            L_0x0494:
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 0
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r9
            L_0x04a4:
                java.lang.String r3 = "com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTManager$1"
                java.lang.String r4 = "android/view/View$OnKeyListener"
                java.lang.String r5 = "onKey"
                java.lang.String r6 = "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"
                r1 = 0
                r2 = r18
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.C96680a.onKey(android.view.View, int, android.view.KeyEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.manager.b$b */
    public class C96681b implements MTimerHandler.CallBack {
        public C96681b() {
        }

        public boolean onTimerExpired() {
            C96679b bVar = C96679b.this;
            if (-1 == bVar.f283189e) {
                return false;
            }
            bVar.mo134903a();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.manager.b$c */
    public class C96682c implements Runnable {
        public C96682c() {
        }

        public void run() {
            C96679b bVar = C96679b.this;
            long j = bVar.f283191g;
            if (j <= 0 || bVar.f283189e <= 0) {
                Log.m105925i("MicroMsg.Note.WXRTManager", "checkUpdateStorage not match to check favLocalId:%s editBeginTime:%s", Long.valueOf(j), Long.valueOf(bVar.f283189e));
                return;
            }
            NoteEditorUI noteEditorUI = (NoteEditorUI) bVar.f283188d;
            noteEditorUI.getClass();
            String str = noteEditorUI.f283211D;
            String o = ((NoteEditorUI) bVar.f283188d).f283238X0.mo126205o();
            boolean equals = o.equals(str);
            boolean equals2 = o.equals(bVar.f283190f);
            Log.m105925i("MicroMsg.Note.WXRTManager", "checkUpdateStorage() called isSameWithLastUICommit:%s isSameWithLastUpdate:%s", Boolean.valueOf(equals), Boolean.valueOf(equals2));
            if (!equals2 && !equals) {
                bVar.f283190f = o;
                if (!bVar.f283193i) {
                    bVar.f283193i = true;
                    bVar.mo134913k(o, true);
                    return;
                }
                bVar.mo134913k(o, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.manager.b$d */
    public interface C96683d {
    }

    public C96679b(C96738o oVar) {
        this.f283188d = oVar;
        f283182r = this;
        NoteEditorUI noteEditorUI = (NoteEditorUI) oVar;
        C78538u.m94865a(noteEditorUI.getContext());
        C85875k4.m106200p(noteEditorUI.getContext());
        int[] screenWH = KeyBoardUtil.getScreenWH(noteEditorUI.getContext());
        int i = screenWH[1];
        f283183s = screenWH[0];
        DisplayMetrics displayMetrics = noteEditorUI.getContext().getResources().getDisplayMetrics();
        f283184t = displayMetrics;
        TypedValue.applyDimension(1, 8.0f, displayMetrics);
        this.f283190f = ((NoteEditorUI) this.f283188d).f283238X0.mo126205o();
        C97469m.f286080h = 0.0f;
    }

    /* renamed from: a */
    public void mo134903a() {
        ((C119157j) C119157j.f356862d).mo183876g(new C96682c(), "AddFavNoteSync");
    }

    /* renamed from: b */
    public WXRTEditText mo134904b() {
        C92221d dVar = ((NoteEditorUI) this.f283188d).f283238X0;
        ArrayList<WXRTEditText> arrayList = this.f283187c;
        dVar.getClass();
        if (arrayList != null) {
            arrayList.clear();
            synchronized (dVar) {
                ArrayList<C102587c> arrayList2 = dVar.f263945a;
                if (arrayList2 != null) {
                    Iterator<C102587c> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C102587c next = it.next();
                        WXRTEditText wXRTEditText = next.f302075f;
                        if (wXRTEditText != null) {
                            arrayList.add(wXRTEditText);
                        } else {
                            WXRTEditText wXRTEditText2 = next.f302073d;
                            if (!(wXRTEditText2 == null || next.f302074e == null)) {
                                arrayList.add(wXRTEditText2);
                                arrayList.add(next.f302074e);
                            }
                            if (((LinkedList) next.f302076g).size() > 0) {
                                arrayList.addAll(next.f302076g);
                            }
                        }
                    }
                }
            }
        }
        ArrayList<WXRTEditText> arrayList3 = this.f283187c;
        if (arrayList3 == null) {
            return null;
        }
        Iterator<WXRTEditText> it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            WXRTEditText next2 = it4.next();
            if (next2.hasFocus()) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: c */
    public WXRTEditText mo134905c() {
        WXRTEditText b = mo134904b();
        if (b != null || this.f283187c.size() < 1) {
            return b;
        }
        ArrayList<WXRTEditText> arrayList = this.f283187c;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: d */
    public void mo134906d() {
        this.f283201q.stopTimer();
        this.f283189e = -1;
        if (f283182r == this) {
            f283182r = null;
        }
    }

    /* renamed from: e */
    public <V, C extends C97463g<V>> void mo134907e(C97477t<V, C> tVar, V v) {
        WXRTEditText b = mo134904b();
        if (b == null) {
            return;
        }
        if (b.getEditTextType() == 0) {
            int i = b.getSelection().f263989d;
            int length = b.getText().length();
            if ((v instanceof Boolean) && ((Boolean) v).booleanValue() && i == length) {
                b.mo134891v();
                b.getText().append("\n");
                b.mo134854B();
                b.setSelection(i);
            }
            b.mo134878s(tVar, v);
            return;
        }
        b.f283158N = true;
        b.f283157M = tVar.mo136723b();
        b.getText().append("\n");
    }

    /* renamed from: f */
    public void mo134908f(WXRTEditText wXRTEditText, Spannable spannable, Spannable spannable2, int i, int i2, int i3, int i4) {
        View findViewById;
        String u = wXRTEditText.mo134890u(C26902a.f74806b);
        if (wXRTEditText.getEditTextType() == 0) {
            C102587c k = ((NoteEditorUI) this.f283188d).f283238X0.mo126201k(wXRTEditText.getRecyclerItemPosition());
            if (k != null && k.mo142212c() == 1) {
                int h = (spannable2 == null ? 0 : C98096c.m126713h(spannable2.toString())) - (spannable == null ? 0 : C98096c.m126713h(spannable.toString()));
                if (((NoteEditorUI) this.f283188d).f283238X0.mo126195e(h, 0)) {
                    NoteEditorUI noteEditorUI = (NoteEditorUI) this.f283188d;
                    noteEditorUI.getClass();
                    noteEditorUI.mo134932a8();
                    NoteEditorUI noteEditorUI2 = (NoteEditorUI) this.f283188d;
                    noteEditorUI2.getClass();
                    noteEditorUI2.mo134940h2(wXRTEditText.getRecyclerItemPosition(), 0);
                } else {
                    ((NoteEditorUI) this.f283188d).f283238X0.mo126198h();
                    C102593i iVar = (C102593i) k;
                    iVar.f302072c = i4;
                    iVar.f302126s = u;
                    iVar.f302071b = true;
                    k.f302077h = false;
                    ((NoteEditorUI) this.f283188d).f283238X0.f263949e += h;
                }
            }
        } else {
            String str = "";
            wXRTEditText.setText(str);
            if (!Util.isNullOrNil(u)) {
                C102593i iVar2 = new C102593i();
                if (!u.equals("<br/>")) {
                    str = u;
                }
                iVar2.f302126s = str;
                C92225e eVar = C92225e.f263960a;
                C92221d dVar = ((NoteEditorUI) this.f283188d).f283238X0;
                C87412m.m108594g(dVar, "dataManager");
                if (!eVar.mo126219a(dVar, wXRTEditText, u, C26236u.m33719b(iVar2))) {
                    int s = ((NoteEditorUI) this.f283188d).f283238X0.mo126209s(iVar2, wXRTEditText, true, true, true, false, false);
                    ((NoteEditorUI) this.f283188d).f283238X0.mo126194d(s - 1, s + 1, true);
                }
            } else {
                return;
            }
        }
        wXRTEditText.setContentDescription(C98096c.m126716k(u, wXRTEditText.getContext()));
        C96683d dVar2 = this.f283199o;
        if (dVar2 != null && (findViewById = NoteEditorUI.this.findViewById(C0966R.C0970id.f5421eo)) != null) {
            if (wXRTEditText.length() > 0) {
                findViewById.setTag(C0966R.C0970id.f359346ke3, "0");
            } else {
                findViewById.setTag(C0966R.C0970id.f359346ke3, "1");
            }
        }
    }

    /* renamed from: g */
    public void mo134909g(int i, long j) {
        NoteEditorUI noteEditorUI = (NoteEditorUI) this.f283188d;
        noteEditorUI.getClass();
        noteEditorUI.mo134936d8(i, j);
    }

    /* renamed from: h */
    public void mo134910h(boolean z, long j) {
        NoteEditorUI noteEditorUI = (NoteEditorUI) this.f283188d;
        noteEditorUI.getClass();
        noteEditorUI.mo134937e8(z, j);
    }

    /* renamed from: i */
    public void mo134911i(WXRTEditText wXRTEditText) {
        if (wXRTEditText.f283148D == 0) {
            wXRTEditText.setTextSize(0, (float) C76577a.m92157h(wXRTEditText.getContext(), C0966R.dimen.f3927j7));
        }
        C92219b.f263944d = wXRTEditText.getTextSize();
        wXRTEditText.f283170s = this;
        wXRTEditText.setRichTextEditing((String) null);
        wXRTEditText.setOnKeyListener(this.f283200p);
    }

    /* renamed from: j */
    public final void mo134912j() {
        if (this.f283189e < 0 && this.f283191g > 0) {
            this.f283201q.startTimer(60000);
            this.f283189e = Util.currentTicks();
            this.f283190f = ((NoteEditorUI) this.f283188d).f283238X0.mo126205o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo134913k(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.tencent.mm.autogen.events.FavoriteOperationEvent r0 = new com.tencent.mm.autogen.events.FavoriteOperationEvent     // Catch:{ all -> 0x0067 }
            r0.<init>()     // Catch:{ all -> 0x0067 }
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r1 = r0.f264833d     // Catch:{ all -> 0x0067 }
            r2 = 19
            r1.f264835a = r2     // Catch:{ all -> 0x0067 }
            com.tencent.mm.plugin.wenote.ui.nativenote.o r2 = r4.f283188d     // Catch:{ all -> 0x0067 }
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r2     // Catch:{ all -> 0x0067 }
            bb3.d r2 = r2.f283238X0     // Catch:{ all -> 0x0067 }
            te3.kd0 r2 = r2.mo126203m(r5)     // Catch:{ all -> 0x0067 }
            r1.f264838d = r2     // Catch:{ all -> 0x0067 }
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r1 = r0.f264833d     // Catch:{ all -> 0x0067 }
            te3.kd0 r2 = r1.f264838d     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x0028
            java.lang.String r5 = "MicroMsg.Note.WXRTManager"
            java.lang.String r6 = "updateNoteInfoStorage error, favProtoItem is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)     // Catch:{ all -> 0x0067 }
            monitor-exit(r4)
            return
        L_0x0028:
            r1.f264836b = r5     // Catch:{ all -> 0x0067 }
            long r2 = r4.f283191g     // Catch:{ all -> 0x0067 }
            r1.f264839e = r2     // Catch:{ all -> 0x0067 }
            if (r6 == 0) goto L_0x0032
            r5 = 1
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            r1.f264847m = r5     // Catch:{ all -> 0x0067 }
            java.lang.String r5 = "fav_update_note_storage"
            r1.f264837c = r5     // Catch:{ all -> 0x0067 }
            r0.publish()     // Catch:{ all -> 0x0067 }
            if (r6 == 0) goto L_0x0065
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r5 = r0.f264833d     // Catch:{ all -> 0x0067 }
            android.content.Intent r5 = r5.f264841g     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "fav_note_item_status"
            r1 = -1
            int r5 = r5.getIntExtra(r6, r1)     // Catch:{ all -> 0x0067 }
            r4.f283194j = r5     // Catch:{ all -> 0x0067 }
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r5 = r0.f264833d     // Catch:{ all -> 0x0067 }
            android.content.Intent r5 = r5.f264841g     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "fav_note_xml"
            java.lang.String r5 = r5.getStringExtra(r6)     // Catch:{ all -> 0x0067 }
            r4.f283195k = r5     // Catch:{ all -> 0x0067 }
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r5 = r0.f264833d     // Catch:{ all -> 0x0067 }
            android.content.Intent r5 = r5.f264841g     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "fav_note_item_updatetime"
            r0 = -1
            long r5 = r5.getLongExtra(r6, r0)     // Catch:{ all -> 0x0067 }
            r4.f283196l = r5     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r4)
            return
        L_0x0067:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b.mo134913k(java.lang.String, boolean):void");
    }
}
