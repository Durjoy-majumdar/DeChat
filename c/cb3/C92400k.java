package cb3;

import ab3.C91983a;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bb3.C92221d;
import cb3.C92389a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import gb3.C98096c;
import ib3.C98640j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import k20.C60958c;
import k20.C9556a;
import p910lj.C76701a;
import xa3.C102587c;
import xa3.C102593i;
import xa3.C102596l;
import za3.C102988a;
import za3.C102990c;

/* renamed from: cb3.k */
public class C92400k implements C92389a.C92390a {

    /* renamed from: M */
    public static volatile C92400k f264410M;

    /* renamed from: N */
    public static boolean f264411N;

    /* renamed from: A */
    public MMHandler f264412A = null;

    /* renamed from: B */
    public int f264413B = 0;

    /* renamed from: C */
    public TextView f264414C = null;

    /* renamed from: D */
    public TextView f264415D = null;

    /* renamed from: E */
    public TextView f264416E = null;

    /* renamed from: F */
    public TextView f264417F = null;

    /* renamed from: G */
    public TextView f264418G = null;

    /* renamed from: H */
    public TextView f264419H = null;

    /* renamed from: I */
    public TextView f264420I = null;

    /* renamed from: J */
    public TextView f264421J = null;

    /* renamed from: K */
    public TextView f264422K = null;

    /* renamed from: L */
    public TextView f264423L = null;

    /* renamed from: a */
    public boolean f264424a = true;

    /* renamed from: b */
    public int f264425b = 0;

    /* renamed from: c */
    public int f264426c = 0;

    /* renamed from: d */
    public int f264427d = 14;

    /* renamed from: e */
    public int f264428e = 0;

    /* renamed from: f */
    public int f264429f = 0;

    /* renamed from: g */
    public int f264430g = 0;

    /* renamed from: h */
    public int f264431h = 0;

    /* renamed from: i */
    public int f264432i = 0;

    /* renamed from: j */
    public int f264433j = 0;

    /* renamed from: k */
    public int f264434k = 0;

    /* renamed from: l */
    public int f264435l = 0;

    /* renamed from: m */
    public int f264436m = 0;

    /* renamed from: n */
    public int[] f264437n = null;

    /* renamed from: o */
    public int[] f264438o = null;

    /* renamed from: p */
    public int[] f264439p = null;

    /* renamed from: q */
    public int[] f264440q = null;

    /* renamed from: r */
    public PopupWindow f264441r = null;

    /* renamed from: s */
    public PopupWindow f264442s = null;

    /* renamed from: t */
    public PopupWindow f264443t = null;

    /* renamed from: u */
    public PopupWindow f264444u = null;

    /* renamed from: v */
    public C91983a f264445v = null;

    /* renamed from: w */
    public C92393d f264446w = null;

    /* renamed from: x */
    public C92391b f264447x = null;

    /* renamed from: y */
    public MTimerHandler f264448y = null;

    /* renamed from: z */
    public MTimerHandler f264449z = null;

    /* renamed from: cb3.k$a */
    public class C92401a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f264450d;

        public C92401a(boolean z) {
            this.f264450d = z;
        }

        public void run() {
            RecyclerView i = C92400k.this.mo126382i();
            if (i != null) {
                for (int i2 = 0; i2 < i.getChildCount(); i2++) {
                    View childAt = i.getChildAt(i2);
                    if (childAt != null) {
                        RecyclerView.C16631z F0 = i.mo17021F0(childAt);
                        if ((F0 instanceof C98640j) && (r3 = ((C98640j) F0).mo138068H()) != null) {
                            C92400k.this.mo126371G(r3, childAt, this.f264450d);
                        }
                    }
                    C92392c cVar = C92410t.m116227a(childAt);
                    C92400k.this.mo126371G(cVar, childAt, this.f264450d);
                }
            }
        }
    }

    public C92400k() {
        f264411N = false;
    }

    /* renamed from: a */
    public static boolean m116190a(C92400k kVar) {
        if (kVar.mo126386m() != 3) {
            return false;
        }
        for (int i = kVar.f264446w.f264399a; i <= kVar.f264446w.f264401c; i++) {
            C102587c k = ((NoteEditorUI) kVar.f264445v).f283238X0.mo126201k(i);
            if (k != null && k.mo142212c() == 4 && ((C102596l) k).f302088y.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static C92400k m116191h() {
        if (f264410M == null) {
            synchronized (C92221d.class) {
                if (f264410M == null) {
                    f264410M = new C92400k();
                }
            }
        }
        return f264410M;
    }

    /* renamed from: A */
    public void mo126365A(boolean z) {
        if (f264411N) {
            RecyclerView i = mo126382i();
            int m = mo126386m();
            if (i == null || m == 0 || (m == 1 && !z)) {
                mo126387n();
                return;
            }
            View b = C92410t.m116228b(i, this.f264446w.f264399a);
            View b2 = C92410t.m116228b(i, this.f264446w.f264401c);
            if (m == 1) {
                mo126388o(3);
                mo126388o(4);
                mo126366B(2, i, b, this.f264446w.f264400b);
                return;
            }
            mo126388o(2);
            mo126366B(3, i, b, this.f264446w.f264400b);
            mo126366B(4, i, b2, this.f264446w.f264402d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo126366B(int r10, androidx.recyclerview.widget.RecyclerView r11, android.view.View r12, int r13) {
        /*
            r9 = this;
            boolean r1 = f264411N
            if (r1 == 0) goto L_0x00ff
            if (r11 != 0) goto L_0x0008
            goto L_0x00ff
        L_0x0008:
            if (r12 == 0) goto L_0x0019
            androidx.recyclerview.widget.RecyclerView$z r1 = r11.mo17021F0(r12)
            boolean r2 = r1 instanceof ib3.C98640j
            if (r2 == 0) goto L_0x0019
            ib3.j r1 = (ib3.C98640j) r1
            cb3.c r1 = r1.mo138067G(r13)
            goto L_0x001d
        L_0x0019:
            cb3.c r1 = cb3.C92410t.m116227a(r12)
        L_0x001d:
            if (r1 != 0) goto L_0x0023
            r9.mo126388o(r10)
            return
        L_0x0023:
            r2 = 0
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r3 = r1.f264393a
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002d
            r0 = r13
            r2 = r3
            goto L_0x0044
        L_0x002d:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r3 = r1.f264396d
            if (r3 == 0) goto L_0x0034
        L_0x0031:
            r2 = r3
        L_0x0032:
            r0 = 0
            goto L_0x0044
        L_0x0034:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r3 = r1.f264394b
            if (r3 == 0) goto L_0x0043
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r1 = r1.f264395c
            if (r1 == 0) goto L_0x0043
            if (r13 != 0) goto L_0x003f
            goto L_0x0031
        L_0x003f:
            if (r13 != r4) goto L_0x0043
            r2 = r1
            goto L_0x0032
        L_0x0043:
            r0 = r13
        L_0x0044:
            if (r2 != 0) goto L_0x004a
            r9.mo126388o(r10)
            return
        L_0x004a:
            android.text.Editable r1 = r2.getText()
            if (r1 == 0) goto L_0x00fc
            if (r0 < 0) goto L_0x00fc
            int r1 = r1.length()
            if (r0 <= r1) goto L_0x005a
            goto L_0x00fc
        L_0x005a:
            android.text.Layout r1 = r2.getLayout()
            if (r1 != 0) goto L_0x0064
            r9.mo126388o(r10)
            return
        L_0x0064:
            float r3 = r1.getPrimaryHorizontal(r0)
            int r6 = r2.getPaddingLeft()
            float r6 = (float) r6
            float r3 = r3 + r6
            int r6 = r2.getPaddingTop()
            int r0 = r1.getLineForOffset(r0)
            int r0 = r1.getLineTop(r0)
            int r6 = r6 + r0
            float r0 = (float) r6
            int r1 = r2.getEditTextType()
            r6 = 4
            r7 = 3
            if (r1 == 0) goto L_0x009b
            int r1 = r2.getHeight()
            float r1 = (float) r1
            float r0 = r0 + r1
            int r1 = r9.f264425b
            float r1 = (float) r1
            float r0 = r0 - r1
            if (r10 != r7) goto L_0x0095
            int r1 = r9.f264436m
            float r1 = (float) r1
            float r3 = r3 + r1
            goto L_0x009b
        L_0x0095:
            if (r10 != r6) goto L_0x009b
            int r1 = r9.f264436m
            float r1 = (float) r1
            float r3 = r3 - r1
        L_0x009b:
            r1 = 2
            int[] r8 = new int[r1]
            r2.getLocationOnScreen(r8)
            if (r10 == r1) goto L_0x00dc
            if (r10 == r7) goto L_0x00bf
            if (r10 == r6) goto L_0x00a8
            goto L_0x00f6
        L_0x00a8:
            r1 = 4
            android.widget.PopupWindow r6 = r9.f264443t
            r2 = r8[r5]
            float r2 = (float) r2
            float r2 = r2 + r3
            int r5 = (int) r2
            r2 = r8[r4]
            float r2 = (float) r2
            float r2 = r2 + r0
            int r7 = (int) r2
            r0 = r9
            r2 = r11
            r3 = r6
            r4 = r5
            r5 = r7
            boolean r5 = r0.mo126369E(r1, r2, r3, r4, r5)
            goto L_0x00f6
        L_0x00bf:
            r1 = 3
            android.widget.PopupWindow r6 = r9.f264442s
            r2 = r8[r5]
            float r2 = (float) r2
            float r2 = r2 + r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r2 = r2 - r3
            int r5 = (int) r2
            r2 = r8[r4]
            float r2 = (float) r2
            float r2 = r2 + r0
            int r7 = (int) r2
            r0 = r9
            r2 = r11
            r3 = r6
            r4 = r5
            r5 = r7
            boolean r5 = r0.mo126369E(r1, r2, r3, r4, r5)
            goto L_0x00f6
        L_0x00dc:
            r1 = 2
            android.widget.PopupWindow r6 = r9.f264441r
            r2 = r8[r5]
            float r2 = (float) r2
            float r2 = r2 + r3
            int r3 = r9.f264435l
            float r3 = (float) r3
            float r2 = r2 - r3
            int r5 = (int) r2
            r2 = r8[r4]
            float r2 = (float) r2
            float r2 = r2 + r0
            int r7 = (int) r2
            r0 = r9
            r2 = r11
            r3 = r6
            r4 = r5
            r5 = r7
            boolean r5 = r0.mo126369E(r1, r2, r3, r4, r5)
        L_0x00f6:
            if (r5 != 0) goto L_0x00fb
            r9.mo126388o(r10)
        L_0x00fb:
            return
        L_0x00fc:
            r9.mo126388o(r10)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb3.C92400k.mo126366B(int, androidx.recyclerview.widget.RecyclerView, android.view.View, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r7 = ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0.f264445v).f283238X0.mo126201k(r0.f264446w.f264399a);
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x027a  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126367C(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = f264411N
            if (r1 == 0) goto L_0x02dd
            android.widget.PopupWindow r1 = r0.f264444u
            if (r1 != 0) goto L_0x000c
            goto L_0x02dd
        L_0x000c:
            androidx.recyclerview.widget.RecyclerView r1 = r17.mo126382i()
            int r2 = r17.mo126386m()
            if (r1 == 0) goto L_0x02da
            if (r2 == 0) goto L_0x02da
            r3 = 1
            if (r2 != r3) goto L_0x001d
            if (r18 == 0) goto L_0x02da
        L_0x001d:
            cb3.b r2 = r0.f264447x
            if (r2 == 0) goto L_0x0029
            int r2 = r2.mo126355a()
            if (r2 != r3) goto L_0x0029
            goto L_0x02da
        L_0x0029:
            android.widget.TextView r2 = r0.f264414C
            r4 = 0
            boolean r2 = r0.mo126395v(r2, r4)
            android.widget.TextView r5 = r0.f264415D
            boolean r5 = r0.mo126395v(r5, r4)
            android.widget.TextView r6 = r0.f264416E
            int r7 = r17.mo126386m()
            if (r7 == r3) goto L_0x003f
            goto L_0x006d
        L_0x003f:
            ab3.a r7 = r0.f264445v
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r7 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r7
            bb3.d r7 = r7.f283238X0
            cb3.d r8 = r0.f264446w
            int r8 = r8.f264399a
            xa3.c r7 = r7.mo126201k(r8)
            if (r7 == 0) goto L_0x006d
            ab3.a r8 = r0.f264445v
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r8 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r8
            bb3.d r8 = r8.f283238X0
            int r8 = r8.mo126186F()
            if (r8 > r3) goto L_0x006b
            int r8 = r7.mo142212c()
            if (r8 != r3) goto L_0x006b
            xa3.i r7 = (xa3.C102593i) r7
            java.lang.String r7 = r7.f302126s
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x006d
        L_0x006b:
            r7 = 1
            goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            boolean r6 = r0.mo126395v(r6, r7)
            android.widget.TextView r7 = r0.f264417F
            ab3.a r8 = r0.f264445v
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r8 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r8
            bb3.d r8 = r8.f283238X0
            int r8 = r8.mo126204n()
            ab3.a r9 = r0.f264445v
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r9 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r9
            bb3.d r9 = r9.f283238X0
            int r9 = r9.mo126206p()
            ab3.a r10 = r0.f264445v
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r10 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r10
            bb3.d r10 = r10.f283238X0
            xa3.c r10 = r10.mo126201k(r8)
            ab3.a r11 = r0.f264445v
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r11 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r11
            bb3.d r11 = r11.f283238X0
            xa3.c r11 = r11.mo126201k(r9)
            if (r10 == 0) goto L_0x00dc
            if (r11 != 0) goto L_0x00a1
            goto L_0x00dc
        L_0x00a1:
            cb3.d r10 = r0.f264446w
            if (r10 == 0) goto L_0x00da
            int r12 = r10.f264399a
            if (r12 != r8) goto L_0x00da
            int r8 = r10.f264400b
            if (r8 != 0) goto L_0x00da
            int r8 = r10.f264401c
            if (r8 != r9) goto L_0x00da
            int r8 = r11.mo142212c()
            if (r8 != r3) goto L_0x00cd
            xa3.i r11 = (xa3.C102593i) r11
            java.lang.String r8 = r11.f302126s
            android.text.Spanned r8 = za3.C102988a.m136184a(r8)
            if (r8 != 0) goto L_0x00c2
            goto L_0x00dc
        L_0x00c2:
            cb3.d r9 = r0.f264446w
            int r9 = r9.f264402d
            int r8 = r8.length()
            if (r9 != r8) goto L_0x00da
            goto L_0x00dc
        L_0x00cd:
            int r8 = r11.mo142212c()
            if (r8 == r3) goto L_0x00da
            cb3.d r8 = r0.f264446w
            int r8 = r8.f264402d
            if (r8 != r3) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            r8 = 1
            goto L_0x00dd
        L_0x00dc:
            r8 = 0
        L_0x00dd:
            boolean r7 = r0.mo126395v(r7, r8)
            android.widget.TextView r8 = r0.f264418G
            boolean r9 = r0.f264424a
            if (r9 != 0) goto L_0x00e8
            goto L_0x0108
        L_0x00e8:
            int r9 = r17.mo126386m()
            if (r9 == 0) goto L_0x0108
            if (r9 != r3) goto L_0x00f1
            goto L_0x0108
        L_0x00f1:
            ab3.a r9 = r0.f264445v
            if (r9 == 0) goto L_0x0106
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r9 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r9
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r9 = r9.f283252j
            if (r9 == 0) goto L_0x0103
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r9 = r9.mo134904b()
            if (r9 == 0) goto L_0x0103
            r9 = 1
            goto L_0x0104
        L_0x0103:
            r9 = 0
        L_0x0104:
            r9 = r9 ^ r3
            goto L_0x0109
        L_0x0106:
            r9 = 1
            goto L_0x0109
        L_0x0108:
            r9 = 0
        L_0x0109:
            boolean r8 = r0.mo126395v(r8, r9)
            android.widget.TextView r9 = r0.f264419H
            int r10 = r17.mo126386m()
            boolean r11 = r0.f264424a
            r12 = 3
            r13 = 2
            if (r11 == 0) goto L_0x011f
            if (r10 == r13) goto L_0x011d
            if (r10 != r12) goto L_0x011f
        L_0x011d:
            r10 = 1
            goto L_0x0120
        L_0x011f:
            r10 = 0
        L_0x0120:
            boolean r9 = r0.mo126395v(r9, r10)
            android.widget.TextView r10 = r0.f264420I
            int r11 = r17.mo126386m()
            if (r11 == r13) goto L_0x0131
            if (r11 != r12) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r11 = 0
            goto L_0x0132
        L_0x0131:
            r11 = 1
        L_0x0132:
            boolean r10 = r0.mo126395v(r10, r11)
            android.widget.TextView r11 = r0.f264421J
            boolean r14 = r0.f264424a
            if (r14 == 0) goto L_0x0145
            int r14 = r17.mo126386m()
            if (r14 != 0) goto L_0x0143
            goto L_0x0145
        L_0x0143:
            r14 = 1
            goto L_0x0146
        L_0x0145:
            r14 = 0
        L_0x0146:
            boolean r11 = r0.mo126395v(r11, r14)
            android.widget.TextView r14 = r0.f264422K
            boolean r15 = r0.mo126391r(r3)
            boolean r14 = r0.mo126395v(r14, r15)
            android.widget.TextView r15 = r0.f264423L
            boolean r12 = r0.mo126391r(r4)
            boolean r12 = r0.mo126395v(r15, r12)
            if (r2 != 0) goto L_0x0175
            if (r5 != 0) goto L_0x0175
            if (r6 != 0) goto L_0x0175
            if (r7 != 0) goto L_0x0175
            if (r8 != 0) goto L_0x0175
            if (r9 != 0) goto L_0x0175
            if (r10 != 0) goto L_0x0175
            if (r11 != 0) goto L_0x0175
            if (r14 != 0) goto L_0x0175
            if (r12 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r2 = 0
            goto L_0x0176
        L_0x0175:
            r2 = 1
        L_0x0176:
            if (r2 != 0) goto L_0x017c
            r17.mo126389p()
            return
        L_0x017c:
            android.widget.PopupWindow r2 = r0.f264444u
            r5 = 0
            r2.setBackgroundDrawable(r5)
            int r2 = r0.mo126384k(r1)
            int r5 = r17.mo126383j()
            android.widget.PopupWindow r6 = r0.f264444u
            if (r6 == 0) goto L_0x01bc
            android.view.View r6 = r6.getContentView()
            if (r6 == 0) goto L_0x01bc
            android.widget.PopupWindow r6 = r0.f264444u
            android.view.View r6 = r6.getContentView()
            r6.measure(r4, r4)
            android.widget.PopupWindow r6 = r0.f264444u
            android.view.View r6 = r6.getContentView()
            int r6 = r6.getMeasuredHeight()
            int r7 = r0.f264428e
            int r7 = r7 * 2
            int r6 = r6 + r7
            android.widget.PopupWindow r7 = r0.f264444u
            android.view.View r7 = r7.getContentView()
            int r7 = r7.getMeasuredWidth()
            int r8 = r0.f264428e
            int r8 = r8 * 2
            int r7 = r7 + r8
            goto L_0x01be
        L_0x01bc:
            r6 = 0
            r7 = 0
        L_0x01be:
            if (r6 != 0) goto L_0x01c2
            int r6 = r0.f264430g
        L_0x01c2:
            if (r7 != 0) goto L_0x01c6
            int r7 = r0.f264431h
        L_0x01c6:
            r0.f264413B = r7
            android.widget.PopupWindow r8 = r0.f264441r
            r9 = -1000(0xfffffffffffffc18, float:NaN)
            r10 = -1
            if (r8 == 0) goto L_0x0207
            boolean r8 = r8.isShowing()
            if (r8 == 0) goto L_0x0207
            int[] r8 = r0.f264438o
            boolean r8 = r0.mo126390q(r8)
            if (r8 == 0) goto L_0x0207
            int[] r8 = r0.f264438o
            r3 = r8[r3]
            int r6 = r3 - r6
            android.widget.PopupWindow r8 = r0.f264441r
            int r8 = r8.getHeight()
            int r3 = r3 + r8
            int r8 = r0.f264432i
            int r3 = r3 - r8
            if (r6 < r2) goto L_0x01f7
            if (r6 > r5) goto L_0x01f7
            int[] r2 = r0.f264438o
            r2 = r2[r4]
            goto L_0x028b
        L_0x01f7:
            if (r3 < r2) goto L_0x0202
            if (r3 > r5) goto L_0x0202
            int[] r2 = r0.f264438o
            r2 = r2[r4]
            r6 = r3
            goto L_0x028b
        L_0x0202:
            r2 = -1000(0xfffffffffffffc18, float:NaN)
            r6 = -1
            goto L_0x028b
        L_0x0207:
            android.widget.PopupWindow r8 = r0.f264442s
            if (r8 == 0) goto L_0x0240
            boolean r8 = r8.isShowing()
            if (r8 == 0) goto L_0x0240
            int[] r8 = r0.f264439p
            boolean r8 = r0.mo126390q(r8)
            if (r8 == 0) goto L_0x0240
            int[] r8 = r0.f264439p
            r8 = r8[r3]
            int r11 = r8 - r6
            android.widget.PopupWindow r12 = r0.f264442s
            int r12 = r12.getHeight()
            int r8 = r8 + r12
            int r12 = r0.f264432i
            int r8 = r8 - r12
            if (r11 < r2) goto L_0x0232
            if (r11 > r5) goto L_0x0232
            int[] r8 = r0.f264439p
            r8 = r8[r4]
            goto L_0x0243
        L_0x0232:
            if (r8 < r2) goto L_0x0240
            if (r8 > r5) goto L_0x0240
            int[] r11 = r0.f264439p
            r11 = r11[r4]
            r16 = r11
            r11 = r8
            r8 = r16
            goto L_0x0243
        L_0x0240:
            r8 = -1000(0xfffffffffffffc18, float:NaN)
            r11 = -1
        L_0x0243:
            android.widget.PopupWindow r12 = r0.f264443t
            if (r12 == 0) goto L_0x0289
            boolean r12 = r12.isShowing()
            if (r12 == 0) goto L_0x0289
            int[] r12 = r0.f264440q
            boolean r12 = r0.mo126390q(r12)
            if (r12 == 0) goto L_0x0289
            int[] r12 = r0.f264440q
            r12 = r12[r3]
            int r14 = r12 - r6
            android.widget.PopupWindow r15 = r0.f264443t
            int r15 = r15.getHeight()
            int r12 = r12 + r15
            int r15 = r0.f264432i
            int r12 = r12 - r15
            if (r11 != r10) goto L_0x027a
            if (r14 < r2) goto L_0x0271
            if (r14 > r5) goto L_0x0271
            int[] r2 = r0.f264440q
            r2 = r2[r4]
            r6 = r14
            goto L_0x028b
        L_0x0271:
            if (r12 < r2) goto L_0x0289
            if (r12 > r5) goto L_0x0289
            int[] r2 = r0.f264440q
            r2 = r2[r4]
            goto L_0x0287
        L_0x027a:
            int r6 = r6 + r11
            int[] r14 = r0.f264440q
            r3 = r14[r3]
            if (r6 <= r3) goto L_0x0289
            if (r12 < r2) goto L_0x0289
            if (r12 > r5) goto L_0x0289
            r2 = r14[r4]
        L_0x0287:
            r6 = r12
            goto L_0x028b
        L_0x0289:
            r2 = r8
            r6 = r11
        L_0x028b:
            if (r6 != r10) goto L_0x02af
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r1.getLayoutManager()
            if (r2 == 0) goto L_0x02ad
            boolean r3 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x02ad
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r3 = r2.mo16957C()
            int r2 = r2.mo16959E()
            cb3.d r4 = r0.f264446w
            int r5 = r4.f264399a
            if (r5 > r3) goto L_0x02ad
            int r3 = r4.f264401c
            if (r3 < r2) goto L_0x02ad
            r6 = 300(0x12c, float:4.2E-43)
        L_0x02ad:
            r2 = -1000(0xfffffffffffffc18, float:NaN)
        L_0x02af:
            if (r6 != r10) goto L_0x02b5
            r17.mo126389p()
            goto L_0x02d9
        L_0x02b5:
            int r3 = r0.f264434k
            int r4 = r3 / 3
            int r5 = r3 * 2
            r8 = 3
            int r5 = r5 / r8
            if (r2 == r9) goto L_0x02d4
            if (r2 < r4) goto L_0x02c4
            if (r2 > r5) goto L_0x02c4
            goto L_0x02d4
        L_0x02c4:
            if (r2 >= r4) goto L_0x02cc
            int r2 = r0.f264429f
            r0.mo126370F(r1, r2, r6)
            goto L_0x02d9
        L_0x02cc:
            int r3 = r3 - r7
            int r2 = r0.f264429f
            int r3 = r3 - r2
            r0.mo126370F(r1, r3, r6)
            goto L_0x02d9
        L_0x02d4:
            int r3 = r3 - r7
            int r3 = r3 / r13
            r0.mo126370F(r1, r3, r6)
        L_0x02d9:
            return
        L_0x02da:
            r17.mo126389p()
        L_0x02dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb3.C92400k.mo126367C(boolean):void");
    }

    /* renamed from: D */
    public void mo126368D(boolean z, boolean z2, long j) {
        if (f264411N) {
            mo126387n();
            mo126389p();
            mo126373I(true, 50);
            mo126365A(z);
            this.f264412A.postDelayed(new C92402l(this, z2), j);
        }
    }

    /* renamed from: E */
    public final boolean mo126369E(int i, RecyclerView recyclerView, PopupWindow popupWindow, int i2, int i3) {
        int i4;
        if (f264411N && recyclerView != null && popupWindow != null && i3 >= mo126384k(recyclerView)) {
            int i5 = this.f264433j;
            C91983a aVar = this.f264445v;
            if (aVar != null) {
                NoteEditorUI noteEditorUI = (NoteEditorUI) aVar;
                int keyBordHeightPx = noteEditorUI.f283216I ? KeyBoardUtil.getKeyBordHeightPx(noteEditorUI) : 0;
                NoteEditorUI noteEditorUI2 = (NoteEditorUI) this.f264445v;
                LinearLayout linearLayout = noteEditorUI2.f283261p;
                int i6 = (linearLayout == null || linearLayout.getVisibility() != 0) ? 0 : noteEditorUI2.f283226R0 + 0;
                LinearLayout linearLayout2 = noteEditorUI2.f283220M;
                if (linearLayout2 != null && linearLayout2.getVisibility() == 0) {
                    i6 += noteEditorUI2.f283226R0;
                }
                i4 = keyBordHeightPx + i6;
            } else {
                i4 = 0;
            }
            if (i3 <= i5 - i4) {
                if (popupWindow.isShowing()) {
                    popupWindow.update(i2, i3, -1, -1, false);
                    mo126397x(i, i2, i3);
                } else {
                    popupWindow.showAtLocation(recyclerView, 0, i2, i3);
                    mo126397x(i, i2, i3);
                }
                if (i != 2) {
                    return true;
                }
                MTimerHandler mTimerHandler = this.f264449z;
                if (mTimerHandler == null) {
                    this.f264449z = new MTimerHandler(new C92403m(this), false);
                } else {
                    mTimerHandler.stopTimer();
                }
                this.f264449z.startTimer(3000, 0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public final boolean mo126370F(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (f264411N && recyclerView != null && this.f264444u != null && i2 >= mo126384k(recyclerView)) {
            int i4 = this.f264433j;
            C91983a aVar = this.f264445v;
            if (aVar != null) {
                NoteEditorUI noteEditorUI = (NoteEditorUI) aVar;
                int keyBordHeightPx = noteEditorUI.f283216I ? KeyBoardUtil.getKeyBordHeightPx(noteEditorUI) : 0;
                NoteEditorUI noteEditorUI2 = (NoteEditorUI) this.f264445v;
                LinearLayout linearLayout = noteEditorUI2.f283261p;
                int i5 = (linearLayout == null || linearLayout.getVisibility() != 0) ? 0 : noteEditorUI2.f283226R0 + 0;
                LinearLayout linearLayout2 = noteEditorUI2.f283220M;
                if (linearLayout2 != null && linearLayout2.getVisibility() == 0) {
                    i5 += noteEditorUI2.f283226R0;
                }
                i3 = keyBordHeightPx + i5;
            } else {
                i3 = 0;
            }
            if (i2 <= i4 - i3) {
                this.f264444u.setWidth(this.f264413B);
                this.f264444u.setBackgroundDrawable(recyclerView.getContext().getResources().getDrawable(C0966R.C0969drawable.ccr));
                if (this.f264444u.isShowing()) {
                    this.f264444u.update(i, i2, -1, -1, false);
                    return true;
                }
                this.f264444u.showAtLocation(recyclerView, 0, i, i2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public void mo126371G(C92392c cVar, View view, boolean z) {
        if (cVar != null) {
            WXRTEditText wXRTEditText = cVar.f264393a;
            if (wXRTEditText != null) {
                if (z) {
                    wXRTEditText.postInvalidate();
                }
            } else if (cVar.f264396d != null) {
                mo126372H(cVar.f264398f, (LinearLayout) view.findViewById(C0966R.C0970id.hpv), (LinearLayout) view.findViewById(C0966R.C0970id.hpt), cVar.f264396d.getPosInDataList());
            } else if (cVar.f264394b != null && cVar.f264395c != null) {
                mo126372H((LinearLayout) view.findViewById(C0966R.C0970id.hpr), (LinearLayout) view.findViewById(C0966R.C0970id.hpv), (LinearLayout) view.findViewById(C0966R.C0970id.hpt), cVar.f264394b.getPosInDataList());
            }
        }
    }

    /* renamed from: H */
    public final void mo126372H(View view, View view2, View view3, int i) {
        if (f264411N && view != null && view2 != null && view3 != null && this.f264446w != null) {
            int g = mo126381g(i);
            if (g == 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view4 = view;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(4);
                View view5 = view2;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(4);
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (g == 1) {
                C92393d dVar = this.f264446w;
                if (dVar.f264400b == dVar.f264402d) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view6 = view;
                    C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view7 = view;
                    C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(4);
                View view8 = view2;
                C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(4);
                C117292a.m165358d(view3, aVar7.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (g == 2) {
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar8.mo10233c(0);
                View view9 = view;
                C117292a.m165358d(view9, aVar8.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(0);
                View view10 = view2;
                C117292a.m165358d(view10, aVar9.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar10 = new C9556a();
                aVar10.mo10233c(0);
                C117292a.m165358d(view3, aVar10.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (g != 3) {
                if (g != 4) {
                    C9556a aVar11 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar11.mo10233c(8);
                    View view11 = view;
                    C117292a.m165358d(view11, aVar11.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar12 = new C9556a();
                    aVar12.mo10233c(4);
                    View view12 = view2;
                    C117292a.m165358d(view12, aVar12.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar13 = new C9556a();
                    aVar13.mo10233c(4);
                    C117292a.m165358d(view3, aVar13.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (this.f264446w.f264400b == 0) {
                    C9556a aVar14 = new C9556a();
                    ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                    aVar14.mo10233c(0);
                    View view13 = view;
                    C117292a.m165358d(view13, aVar14.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                    C117292a.m165359e(view13, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar15 = new C9556a();
                    aVar15.mo10233c(4);
                    View view14 = view2;
                    C117292a.m165358d(view14, aVar15.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
                    C117292a.m165359e(view14, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar16 = new C9556a();
                    aVar16.mo10233c(0);
                    C117292a.m165358d(view3, aVar16.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C9556a aVar17 = new C9556a();
                    ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                    aVar17.mo10233c(8);
                    View view15 = view;
                    C117292a.m165358d(view15, aVar17.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                    C117292a.m165359e(view15, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar18 = new C9556a();
                    aVar18.mo10233c(4);
                    View view16 = view2;
                    C117292a.m165358d(view16, aVar18.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
                    C117292a.m165359e(view16, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar19 = new C9556a();
                    aVar19.mo10233c(4);
                    C117292a.m165358d(view3, aVar19.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar19.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (this.f264446w.f264402d == 0) {
                C9556a aVar20 = new C9556a();
                ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                aVar20.mo10233c(8);
                View view17 = view;
                C117292a.m165358d(view17, aVar20.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar20.mo10231a(0)).intValue());
                C117292a.m165359e(view17, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar21 = new C9556a();
                aVar21.mo10233c(4);
                View view18 = view2;
                C117292a.m165358d(view18, aVar21.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar21.mo10231a(0)).intValue());
                C117292a.m165359e(view18, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar22 = new C9556a();
                aVar22.mo10233c(4);
                C117292a.m165358d(view3, aVar22.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar22.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar23 = new C9556a();
                ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                aVar23.mo10233c(0);
                View view19 = view;
                C117292a.m165358d(view19, aVar23.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar23.mo10231a(0)).intValue());
                C117292a.m165359e(view19, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar24 = new C9556a();
                aVar24.mo10233c(0);
                View view20 = view2;
                C117292a.m165358d(view20, aVar24.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar24.mo10231a(0)).intValue());
                C117292a.m165359e(view20, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar25 = new C9556a();
                aVar25.mo10233c(4);
                C117292a.m165358d(view3, aVar25.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar25.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: I */
    public void mo126373I(boolean z, long j) {
        MMHandler mMHandler;
        if (f264411N && (mMHandler = this.f264412A) != null) {
            mMHandler.postDelayed(new C92401a(z), j);
        }
    }

    /* renamed from: J */
    public final int mo126374J(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        if (!f264411N) {
            return 0;
        }
        if (i == 2) {
            z = mo126398y(i2, i3, i2, i3);
        } else if (i == 3) {
            C92393d dVar = this.f264446w;
            if (dVar == null || i2 > (i4 = dVar.f264401c) || (i2 == i4 && i3 >= dVar.f264402d)) {
                return 1;
            }
            z = mo126398y(i2, i3, i4, dVar.f264402d);
        } else if (i != 4) {
            return 0;
        } else {
            C92393d dVar2 = this.f264446w;
            if (dVar2 == null || i2 < (i5 = dVar2.f264399a) || (i2 == i5 && i3 <= dVar2.f264400b)) {
                return 1;
            }
            z = mo126398y(i5, dVar2.f264400b, i2, i3);
        }
        return z ? 3 : 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0292  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo126375K(boolean r18) {
        /*
            r17 = this;
            r6 = r17
            boolean r0 = f264411N
            if (r0 == 0) goto L_0x03a7
            android.widget.PopupWindow r0 = r6.f264441r
            if (r0 == 0) goto L_0x03a7
            android.widget.PopupWindow r0 = r6.f264442s
            if (r0 == 0) goto L_0x03a7
            android.widget.PopupWindow r0 = r6.f264443t
            if (r0 == 0) goto L_0x03a7
            cb3.d r0 = r6.f264446w
            if (r0 != 0) goto L_0x0018
            goto L_0x03a7
        L_0x0018:
            androidx.recyclerview.widget.RecyclerView r7 = r17.mo126382i()
            if (r7 != 0) goto L_0x001f
            return
        L_0x001f:
            cb3.b r0 = r6.f264447x
            if (r0 == 0) goto L_0x03a7
            int r0 = r0.mo126355a()
            r8 = 1
            if (r0 == r8) goto L_0x002c
            goto L_0x03a7
        L_0x002c:
            cb3.b r0 = r6.f264447x
            int r9 = r0.f264382a
            r10 = 4
            r11 = 3
            r12 = 2
            if (r9 == r12) goto L_0x003a
            if (r9 == r11) goto L_0x003a
            if (r9 == r10) goto L_0x003a
            return
        L_0x003a:
            float r1 = r0.f264383b
            float r2 = r0.f264385d
            float r1 = r1 - r2
            float r2 = r0.f264384c
            float r0 = r0.f264386e
            float r2 = r2 - r0
            int r0 = r6.f264425b
            int r0 = r0 / r12
            float r0 = (float) r0
            float r2 = r2 + r0
            if (r9 != r12) goto L_0x0053
            android.widget.PopupWindow r0 = r6.f264441r
            int r0 = r0.getWidth()
            int r0 = r0 / r12
            goto L_0x005b
        L_0x0053:
            if (r9 != r11) goto L_0x005d
            android.widget.PopupWindow r0 = r6.f264442s
            int r0 = r0.getWidth()
        L_0x005b:
            float r0 = (float) r0
            float r1 = r1 + r0
        L_0x005d:
            int[] r0 = r6.f264437n
            r7.getLocationOnScreen(r0)
            int[] r0 = r6.f264437n
            r13 = 0
            r3 = r0[r13]
            float r3 = (float) r3
            float r3 = r1 - r3
            r0 = r0[r8]
            float r0 = (float) r0
            float r0 = r2 - r0
            android.view.View r14 = r7.mo17019D0(r3, r0)
            if (r14 == 0) goto L_0x0184
            androidx.recyclerview.widget.RecyclerView$z r3 = r7.mo17021F0(r14)
            boolean r4 = r3 instanceof ib3.C98640j
            if (r4 == 0) goto L_0x0184
            ib3.j r3 = (ib3.C98640j) r3
            int[] r4 = new int[r12]
            android.widget.LinearLayout r5 = r3.mo138066F()
            r5.getLocationOnScreen(r4)
            r4 = r4[r13]
            float r4 = (float) r4
            float r4 = r1 - r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r15 = "getNoteInfo() called with: x = "
            r5.append(r15)
            r5.append(r1)
            java.lang.String r15 = ", y = "
            r5.append(r15)
            r5.append(r2)
            java.lang.String r15 = ", fixX = "
            r5.append(r15)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r15 = "NoteMediaGroupItemHolder"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r5)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.LinkedList<ib3.j$b> r10 = r3.f289210W
            java.util.Iterator r10 = r10.iterator()
        L_0x00be:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x00e4
            java.lang.Object r16 = r10.next()
            r11 = r16
            ib3.j$b r11 = (ib3.C98640j.C98642b) r11
            android.view.View r8 = r11.f289214b
            int r8 = r8.getLeft()
            android.view.View r11 = r11.f289214b
            int r11 = r11.getRight()
            int r8 = r8 + r11
            int r8 = r8 / r12
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.add(r8)
            r8 = 1
            r11 = 3
            goto L_0x00be
        L_0x00e4:
            java.util.Iterator r5 = r5.iterator()
            r8 = 0
        L_0x00e9:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0169
            java.lang.Object r10 = r5.next()
            int r11 = r8 + 1
            if (r8 < 0) goto L_0x0164
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "getNoteInfo() called with: index = "
            r12.append(r0)
            r12.append(r8)
            java.lang.String r0 = ", center = "
            r12.append(r0)
            r12.append(r10)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            float r0 = (float) r10
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0161
            if (r8 != 0) goto L_0x0131
            java.lang.String r0 = "getNoteInfo() return btnPre"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r3.f289235C
            cb3.c r3 = new cb3.c
            r3.<init>()
            r3.f264396d = r0
            r3.f264397e = r13
            goto L_0x015f
        L_0x0131:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "getNoteInfo() return interval["
            r0.append(r4)
            int r4 = r8 + -1
            r0.append(r4)
            r5 = 93
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            java.util.LinkedList<ib3.j$a> r0 = r3.f289211X
            java.lang.Object r0 = r0.get(r4)
            ib3.j$a r0 = (ib3.C98640j.C98641a) r0
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r0.f289212a
            cb3.c r3 = new cb3.c
            r3.<init>()
            r3.f264396d = r0
            r3.f264397e = r8
        L_0x015f:
            r0 = 0
            goto L_0x0189
        L_0x0161:
            r8 = r11
            r12 = 2
            goto L_0x00e9
        L_0x0164:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x0169:
            r0 = 0
            java.lang.String r4 = "getNoteInfo() return btnNext"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r4)
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r4 = r3.f289236D
            java.util.LinkedList<ib3.j$a> r3 = r3.f289211X
            int r3 = r3.size()
            r5 = 1
            int r3 = r3 + r5
            cb3.c r5 = new cb3.c
            r5.<init>()
            r5.f264396d = r4
            r5.f264397e = r3
            r3 = r5
            goto L_0x0189
        L_0x0184:
            r0 = 0
            cb3.c r3 = cb3.C92410t.m116227a(r14)
        L_0x0189:
            if (r3 != 0) goto L_0x018f
            r1 = 1
            r8 = 2
            goto L_0x0290
        L_0x018f:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r8 = r3.f264396d
            if (r8 == 0) goto L_0x01c2
            r4 = 2
            int[] r0 = new int[r4]
            r8.getLocationOnScreen(r0)
            int r0 = r3.f264397e
            int r1 = r8.getPosInDataList()
            int r10 = r6.mo126374J(r9, r1, r0)
            if (r10 == r4) goto L_0x01a8
            r0 = 3
            if (r10 != r0) goto L_0x01bf
        L_0x01a8:
            android.widget.PopupWindow r3 = r6.f264441r
            cb3.b r0 = r6.f264447x
            float r1 = r0.f264383b
            float r2 = r0.f264385d
            float r1 = r1 - r2
            int r4 = (int) r1
            float r1 = r0.f264384c
            float r0 = r0.f264386e
            float r1 = r1 - r0
            int r5 = (int) r1
            r0 = r17
            r1 = r9
            r2 = r7
            r0.mo126369E(r1, r2, r3, r4, r5)
        L_0x01bf:
            r0 = r8
            goto L_0x028b
        L_0x01c2:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r4 = r3.f264393a
            if (r4 == 0) goto L_0x01e6
            r5 = 2
            int[] r0 = new int[r5]
            r4.getLocationOnScreen(r0)
            r3 = r0[r13]
            float r3 = (float) r3
            float r1 = r1 - r3
            r3 = 1
            r0 = r0[r3]
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = r4.getOffsetForPosition(r1, r2)
            int r1 = r4.getPosInDataList()
            int r0 = r6.mo126374J(r9, r1, r0)
            r8 = r0
            r0 = r4
        L_0x01e3:
            r1 = 1
            goto L_0x0290
        L_0x01e6:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r8 = r3.f264394b
            if (r8 == 0) goto L_0x028e
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r10 = r3.f264395c
            if (r10 == 0) goto L_0x028e
            r2 = 3
            if (r9 != r2) goto L_0x0216
            int r0 = r8.getPosInDataList()
            int r10 = r6.mo126374J(r9, r0, r13)
            r0 = 2
            if (r10 == r0) goto L_0x01fe
            if (r10 != r2) goto L_0x01bf
        L_0x01fe:
            android.widget.PopupWindow r3 = r6.f264442s
            cb3.b r0 = r6.f264447x
            float r1 = r0.f264383b
            float r2 = r0.f264385d
            float r1 = r1 - r2
            int r4 = (int) r1
            float r1 = r0.f264384c
            float r0 = r0.f264386e
            float r1 = r1 - r0
            int r5 = (int) r1
            r0 = r17
            r1 = r9
            r2 = r7
            r0.mo126369E(r1, r2, r3, r4, r5)
            goto L_0x01bf
        L_0x0216:
            r0 = 4
            if (r9 != r0) goto L_0x0241
            int r0 = r10.getPosInDataList()
            r1 = 1
            int r8 = r6.mo126374J(r9, r0, r1)
            r0 = 2
            if (r8 == r0) goto L_0x0228
            r0 = 3
            if (r8 != r0) goto L_0x023f
        L_0x0228:
            android.widget.PopupWindow r3 = r6.f264443t
            cb3.b r0 = r6.f264447x
            float r1 = r0.f264383b
            float r2 = r0.f264385d
            float r1 = r1 - r2
            int r4 = (int) r1
            float r1 = r0.f264384c
            float r0 = r0.f264386e
            float r1 = r1 - r0
            int r5 = (int) r1
            r0 = r17
            r1 = r9
            r2 = r7
            r0.mo126369E(r1, r2, r3, r4, r5)
        L_0x023f:
            r0 = r10
            goto L_0x01e3
        L_0x0241:
            r0 = 2
            int[] r2 = new int[r0]
            r14.getLocationOnScreen(r2)
            r2 = r2[r13]
            int r4 = r14.getWidth()
            int r4 = r4 / r0
            int r2 = r2 + r4
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x025f
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r3.f264394b
            int r1 = r0.getPosInDataList()
            int r1 = r6.mo126374J(r9, r1, r13)
            goto L_0x026a
        L_0x025f:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r3.f264395c
            int r1 = r0.getPosInDataList()
            r2 = 1
            int r1 = r6.mo126374J(r9, r1, r2)
        L_0x026a:
            r8 = r0
            r10 = r1
            r0 = 2
            if (r10 == r0) goto L_0x0272
            r0 = 3
            if (r10 != r0) goto L_0x01bf
        L_0x0272:
            android.widget.PopupWindow r3 = r6.f264441r
            cb3.b r0 = r6.f264447x
            float r1 = r0.f264383b
            float r2 = r0.f264385d
            float r1 = r1 - r2
            int r4 = (int) r1
            float r1 = r0.f264384c
            float r0 = r0.f264386e
            float r1 = r1 - r0
            int r5 = (int) r1
            r0 = r17
            r1 = r9
            r2 = r7
            r0.mo126369E(r1, r2, r3, r4, r5)
            goto L_0x01bf
        L_0x028b:
            r8 = r10
            goto L_0x01e3
        L_0x028e:
            r1 = 1
            r8 = 0
        L_0x0290:
            if (r8 == r1) goto L_0x034d
            r2 = 2
            if (r8 == r2) goto L_0x034c
            r2 = 3
            if (r8 == r2) goto L_0x0299
            return
        L_0x0299:
            android.text.Editable r2 = r0.getText()
            int r3 = r17.mo126386m()
            boolean r4 = r6.f264424a
            if (r4 == 0) goto L_0x02e2
            if (r2 == 0) goto L_0x02e2
            if (r3 != r1) goto L_0x02e2
            boolean r4 = r0.hasFocus()
            if (r4 != 0) goto L_0x02b2
            r0.requestFocus()
        L_0x02b2:
            int r4 = r0.getEditTextType()
            if (r4 == r1) goto L_0x02d8
            int r4 = r0.getEditTextType()
            r5 = 2
            if (r4 != r5) goto L_0x02c0
            goto L_0x02d8
        L_0x02c0:
            cb3.d r4 = r6.f264446w
            int r4 = r4.f264400b
            int r2 = r2.length()
            if (r4 > r2) goto L_0x032c
            r0.setIgnoreSelectChangeByMultiSelect(r1)
            cb3.d r2 = r6.f264446w
            int r2 = r2.f264400b
            r0.setSelection(r2)
            r0.setIgnoreSelectChangeByMultiSelect(r13)
            goto L_0x032c
        L_0x02d8:
            r0.setIgnoreSelectChangeByMultiSelect(r1)
            r0.setSelection(r13)
            r0.setIgnoreSelectChangeByMultiSelect(r13)
            goto L_0x032c
        L_0x02e2:
            if (r4 == 0) goto L_0x032c
            if (r2 == 0) goto L_0x032c
            r1 = 2
            if (r3 != r1) goto L_0x032c
            boolean r4 = r0.hasFocus()
            if (r4 == 0) goto L_0x032c
            int r4 = r0.getEditTextType()
            r5 = 1
            if (r4 == r5) goto L_0x0322
            int r4 = r0.getEditTextType()
            if (r4 != r1) goto L_0x02fd
            goto L_0x0322
        L_0x02fd:
            cb3.d r1 = r6.f264446w
            int r1 = r1.f264400b
            int r4 = r2.length()
            if (r1 > r4) goto L_0x032c
            cb3.d r1 = r6.f264446w
            int r1 = r1.f264402d
            int r2 = r2.length()
            if (r1 > r2) goto L_0x032c
            r1 = 1
            r0.setIgnoreSelectChangeByMultiSelect(r1)
            cb3.d r2 = r6.f264446w
            int r4 = r2.f264400b
            int r2 = r2.f264402d
            r0.setSelection(r4, r2)
            r0.setIgnoreSelectChangeByMultiSelect(r13)
            goto L_0x032c
        L_0x0322:
            r1 = 1
            r0.setIgnoreSelectChangeByMultiSelect(r1)
            r0.setSelection(r13)
            r0.setIgnoreSelectChangeByMultiSelect(r13)
        L_0x032c:
            r0 = 3
            if (r3 == r0) goto L_0x0331
            if (r3 != 0) goto L_0x0334
        L_0x0331:
            r17.mo126376b()
        L_0x0334:
            r17.mo126389p()
            r0 = 0
            r2 = 1
            r6.mo126373I(r2, r0)
            r0 = 4
            if (r9 != r0) goto L_0x0345
            cb3.d r0 = r6.f264446w
            int r0 = r0.f264402d
            goto L_0x0349
        L_0x0345:
            cb3.d r0 = r6.f264446w
            int r0 = r0.f264400b
        L_0x0349:
            r6.mo126366B(r9, r7, r14, r0)
        L_0x034c:
            r13 = 1
        L_0x034d:
            if (r13 == 0) goto L_0x0392
            if (r18 == 0) goto L_0x03a7
            cb3.b r0 = r6.f264447x
            float r0 = r0.f264384c
            int r1 = r6.mo126384k(r7)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x036b
            cb3.b r0 = r6.f264447x
            float r0 = r0.f264384c
            int r1 = r17.mo126383j()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a7
        L_0x036b:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f264448y
            if (r0 == 0) goto L_0x0375
            boolean r0 = r0.stopped()
            if (r0 == 0) goto L_0x03a7
        L_0x0375:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f264448y
            if (r0 != 0) goto L_0x0387
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            cb3.o r1 = new cb3.o
            r1.<init>(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r6.f264448y = r0
            goto L_0x038a
        L_0x0387:
            r0.stopTimer()
        L_0x038a:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f264448y
            r1 = 100
            r0.startTimer(r1)
            goto L_0x03a7
        L_0x0392:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f264448y
            if (r0 != 0) goto L_0x03a4
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            cb3.o r1 = new cb3.o
            r1.<init>(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r6.f264448y = r0
            goto L_0x03a7
        L_0x03a4:
            r0.stopTimer()
        L_0x03a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb3.C92400k.mo126375K(boolean):void");
    }

    /* renamed from: b */
    public final void mo126376b() {
        C91983a aVar = this.f264445v;
        if (aVar != null) {
            ((NoteEditorUI) aVar).mo134927V7();
        }
    }

    /* renamed from: c */
    public void mo126377c() {
        if (f264411N) {
            mo126398y(-1, -1, -1, -1);
            mo126373I(true, 0);
            mo126387n();
            mo126389p();
        }
    }

    /* renamed from: d */
    public void mo126378d() {
        Log.m105924i("NoteSelectManager", "deleteSelectedData");
        if (!f264411N) {
            Log.m105920e("NoteSelectManager", "deleteSelectedData: not init");
            return;
        }
        mo126389p();
        int m = mo126386m();
        if (m == 2) {
            mo126380f(true, (ArrayList<C102587c>) null, "");
        } else if (m == 3) {
            mo126379e(true, (ArrayList<C102587c>) null, "");
        } else {
            Log.m105920e("NoteSelectManager", "deleteSelectedData: not in select");
            mo126392s();
        }
    }

    /* renamed from: e */
    public final ArrayList<C102587c> mo126379e(boolean z, ArrayList<C102587c> arrayList, String str) {
        int i;
        int i2;
        int i3;
        C91983a aVar;
        ArrayList<C102587c> arrayList2 = arrayList;
        C92393d l = mo126385l();
        mo126377c();
        ArrayList<C102587c> arrayList3 = new ArrayList<>();
        if (l.mo126357a() != 3) {
            Log.m105920e("NoteSelectManager", "getAndProcessSelectedDataInMultiSelect: incorrect select");
            return null;
        }
        int i4 = l.f264399a;
        int i5 = l.f264401c;
        while (true) {
            i = 0;
            if (i5 < l.f264399a) {
                break;
            }
            C102587c k = ((NoteEditorUI) this.f264445v).f283238X0.mo126201k(i5);
            if (k != null) {
                if (i5 == l.f264401c && k.mo142212c() == 1) {
                    C102593i iVar = (C102593i) k;
                    C102593i iVar2 = iVar;
                    SpannableStringBuilder u = mo126394u(iVar, 0, l.f264402d, false, z, "", false);
                    if (!Util.isNullOrNil((CharSequence) u)) {
                        C102593i iVar3 = new C102593i();
                        iVar3.f302126s = C102990c.m136185a(u);
                        iVar3.f302072c = -1;
                        iVar3.f302071b = false;
                        arrayList3.add(iVar3);
                    }
                    if (z && Util.isNullOrNil(iVar2.f302126s)) {
                        ((NoteEditorUI) this.f264445v).f283238X0.mo126215y(i5, true);
                    }
                } else if (i5 == l.f264399a && k.mo142212c() == 1) {
                    C102593i iVar4 = (C102593i) k;
                    C102593i iVar5 = iVar4;
                    SpannableStringBuilder u2 = mo126394u(iVar4, l.f264400b, 0, true, z, "", false);
                    if (!Util.isNullOrNil((CharSequence) u2)) {
                        C102593i iVar6 = new C102593i();
                        iVar6.f302126s = C102990c.m136185a(u2);
                        iVar6.f302072c = -1;
                        iVar6.f302071b = false;
                        arrayList3.add(iVar6);
                    }
                    if (!z || !Util.isNullOrNil(iVar5.f302126s)) {
                        i4++;
                    } else {
                        ((NoteEditorUI) this.f264445v).f283238X0.mo126215y(i5, true);
                    }
                } else {
                    arrayList3.add(C98096c.m126706a(k, l));
                    if (z) {
                        ((NoteEditorUI) this.f264445v).f283238X0.mo126216z(i5, true, l);
                    }
                }
            }
            i5--;
        }
        if (z) {
            int i6 = i4 - 1;
            int i7 = i4 + 1;
            if (arrayList2 == null || arrayList.size() <= 0) {
                C102593i iVar7 = new C102593i();
                iVar7.f302126s = str != null ? str : "";
                iVar7.f302071b = false;
                iVar7.f302072c = -1;
                ((NoteEditorUI) this.f264445v).f283238X0.mo126191a(i4, iVar7, true);
            } else {
                C92221d dVar = ((NoteEditorUI) this.f264445v).f283238X0;
                dVar.getClass();
                if (arrayList.size() > 0) {
                    synchronized (dVar) {
                        if (dVar.f263945a != null) {
                            i2 = i4;
                            i3 = 0;
                            while (i < arrayList.size() && i2 >= 0 && i2 <= dVar.f263945a.size()) {
                                C102587c cVar = arrayList2.get(i);
                                if (cVar != null) {
                                    dVar.mo126213w(cVar);
                                    dVar.f263945a.add(i2, cVar);
                                    i3++;
                                    i2++;
                                    dVar.mo126190J(cVar, true);
                                }
                                i++;
                            }
                            i = 1;
                        } else {
                            i2 = i4;
                            i3 = 0;
                        }
                    }
                    if (!(i == 0 || (aVar = dVar.f263946b) == null)) {
                        ((NoteEditorUI) aVar).mo134942n4(i2 - i3, i3);
                    }
                }
                i7 = i4 + arrayList.size();
            }
            ((NoteEditorUI) this.f264445v).f283238X0.mo126194d(i6, i7, true);
        }
        Collections.reverse(arrayList3);
        return arrayList3;
    }

    /* renamed from: f */
    public final SpannableStringBuilder mo126380f(boolean z, ArrayList<C102587c> arrayList, String str) {
        ArrayList<C102587c> arrayList2;
        C92393d l = mo126385l();
        mo126377c();
        int a = l.mo126357a();
        if (a == 1 || a == 2) {
            C102587c k = ((NoteEditorUI) this.f264445v).f283238X0.mo126201k(l.f264399a);
            if (k == null) {
                Log.m105920e("NoteSelectManager", "getAndProcessSelectedDataInSingleSelect: item is null");
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (k.mo142212c() == 1) {
                if (!z || arrayList == null || arrayList.size() <= 0) {
                    SpannableStringBuilder u = mo126394u((C102593i) k, l.f264400b, l.f264402d, false, z, str, true);
                    C91983a aVar = this.f264445v;
                    if (aVar != null) {
                        ((NoteEditorUI) aVar).mo134940h2(l.f264399a, 0);
                    }
                    if (!z) {
                        return u;
                    }
                    ((NoteEditorUI) this.f264445v).f283238X0.mo126214x();
                    return u;
                }
                SpannableStringBuilder u2 = mo126394u((C102593i) k, l.f264400b, l.f264402d, false, false, "", true);
                ((NoteEditorUI) this.f264445v).f283238X0.mo126212v(arrayList, 0, l.f264399a, l.f264400b, l.f264402d, true, true);
                C92221d dVar = ((NoteEditorUI) this.f264445v).f283238X0;
                int i = l.f264399a;
                dVar.mo126194d(i, arrayList.size() + i + 1, true);
                return u2;
            } else if (a != 1 || !z) {
                return spannableStringBuilder;
            } else {
                int i2 = l.f264400b == 0 ? 1 : 2;
                if (arrayList != null && arrayList.size() > 0) {
                    arrayList2 = arrayList;
                } else if (Util.isNullOrNil(str)) {
                    return spannableStringBuilder;
                } else {
                    arrayList2 = new ArrayList<>();
                    C102593i iVar = new C102593i();
                    iVar.f302126s = str;
                    iVar.f302071b = false;
                    iVar.f302072c = -1;
                    arrayList2.add(iVar);
                }
                if (((NoteEditorUI) this.f264445v).f283238X0.mo126208r(arrayList2, l.f264401c, l.f264402d, (WXRTEditText) null)) {
                    return spannableStringBuilder;
                }
                ((NoteEditorUI) this.f264445v).f283238X0.mo126212v(arrayList2, i2, l.f264399a, l.f264400b, l.f264402d, true, true);
                C92221d dVar2 = ((NoteEditorUI) this.f264445v).f283238X0;
                int i3 = l.f264399a;
                dVar2.mo126194d(i3 - 1, i3 + arrayList2.size() + 1, true);
                return spannableStringBuilder;
            }
        } else {
            Log.m105920e("NoteSelectManager", "getAndProcessSelectedDataInSingleSelect: incorrect select");
            return null;
        }
    }

    /* renamed from: g */
    public int mo126381g(int i) {
        C92393d dVar;
        int i2;
        int i3;
        if (f264411N && this.f264446w != null && mo126386m() != 0 && i >= (i2 = (dVar = this.f264446w).f264399a) && i <= (i3 = dVar.f264401c)) {
            if (i == i2 && i == i3) {
                return 1;
            }
            if (i > i2 && i < i3) {
                return 2;
            }
            if (i != i2 || i >= i3) {
                return (i <= i2 || i != i3) ? 0 : 3;
            }
            return 4;
        }
    }

    /* renamed from: i */
    public final RecyclerView mo126382i() {
        C91983a aVar = this.f264445v;
        if (aVar != null) {
            return ((NoteEditorUI) aVar).f283257n;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo126383j() {
        /*
            r3 = this;
            ab3.a r0 = r3.f264445v
            r1 = 0
            if (r0 == 0) goto L_0x0010
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
            boolean r2 = r0.f283216I
            if (r2 == 0) goto L_0x0010
            int r0 = com.tencent.p014mm.sdk.platformtools.KeyBoardUtil.getKeyBordHeightPx(r0)
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 != 0) goto L_0x0034
            ab3.a r2 = r3.f264445v
            if (r2 == 0) goto L_0x0034
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r2
            android.widget.LinearLayout r0 = r2.f283261p
            if (r0 == 0) goto L_0x0026
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0026
            int r0 = r2.f283226R0
            int r1 = r1 + r0
        L_0x0026:
            android.widget.LinearLayout r0 = r2.f283220M
            if (r0 == 0) goto L_0x0033
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0033
            int r0 = r2.f283226R0
            int r1 = r1 + r0
        L_0x0033:
            r0 = r1
        L_0x0034:
            if (r0 != 0) goto L_0x0038
            r0 = 150(0x96, float:2.1E-43)
        L_0x0038:
            int r1 = r3.f264433j
            int r1 = r1 - r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cb3.C92400k.mo126383j():int");
    }

    /* renamed from: k */
    public final int mo126384k(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.getLocationOnScreen(this.f264437n);
            if (mo126390q(this.f264437n)) {
                return this.f264437n[1];
            }
        }
        return 150;
    }

    /* renamed from: l */
    public C92393d mo126385l() {
        if (!f264411N) {
            return new C92393d(this.f264445v);
        }
        if (this.f264446w == null) {
            this.f264446w = new C92393d(this.f264445v);
        }
        C91983a aVar = this.f264445v;
        C92393d dVar = this.f264446w;
        return new C92393d(aVar, dVar.f264399a, dVar.f264400b, dVar.f264401c, dVar.f264402d);
    }

    /* renamed from: m */
    public int mo126386m() {
        if (!f264411N) {
            return 0;
        }
        if (this.f264446w == null) {
            this.f264446w = new C92393d(this.f264445v);
        }
        return this.f264446w.mo126357a();
    }

    /* renamed from: n */
    public void mo126387n() {
        if (f264411N) {
            mo126388o(2);
            mo126388o(3);
            mo126388o(4);
        }
    }

    /* renamed from: o */
    public final boolean mo126388o(int i) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        PopupWindow popupWindow3;
        C92391b bVar = this.f264447x;
        if (bVar != null && bVar.f264382a == i && bVar.mo126355a() == 1) {
            return false;
        }
        if (i == 2 && (popupWindow3 = this.f264441r) != null) {
            popupWindow3.dismiss();
            mo126397x(2, -1, -1);
        } else if (i == 3 && (popupWindow2 = this.f264442s) != null) {
            popupWindow2.dismiss();
            mo126397x(3, -1, -1);
        } else if (i != 4 || (popupWindow = this.f264443t) == null) {
            return false;
        } else {
            popupWindow.dismiss();
            mo126397x(4, -1, -1);
        }
        return true;
    }

    /* renamed from: p */
    public void mo126389p() {
        PopupWindow popupWindow = this.f264444u;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: q */
    public final boolean mo126390q(int[] iArr) {
        return (!f264411N || iArr == null || iArr.length != 2 || iArr[0] == -1 || iArr[1] == -1) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0055  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo126391r(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7.f264424a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            bb3.f r0 = bb3.C28293f.f77884a
            boolean r0 = r0.mo55909a()
            if (r0 != 0) goto L_0x000f
            return r1
        L_0x000f:
            cb3.d r0 = r7.mo126385l()
            int r2 = r0.f264399a
            r3 = 1
            if (r2 < 0) goto L_0x0051
            int r4 = r0.f264400b
            if (r4 < 0) goto L_0x0051
            int r5 = r0.f264401c
            if (r5 < 0) goto L_0x0051
            int r6 = r0.f264402d
            if (r6 < 0) goto L_0x0051
            if (r2 > r5) goto L_0x0051
            if (r2 != r5) goto L_0x002b
            if (r4 <= r6) goto L_0x002b
            goto L_0x0051
        L_0x002b:
            if (r2 != r5) goto L_0x0030
            if (r4 != r6) goto L_0x0030
            goto L_0x0051
        L_0x0030:
            int r4 = r0.f264401c
            if (r2 > r4) goto L_0x0051
            ab3.a r4 = r0.f264403e
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r4 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r4
            bb3.d r4 = r4.f283238X0
            xa3.c r4 = r4.mo126201k(r2)
            int r4 = r4.mo142212c()
            r5 = 2
            if (r4 == r5) goto L_0x004f
            r5 = 6
            if (r4 == r5) goto L_0x004f
            r5 = 7
            if (r4 != r5) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            int r2 = r2 + 1
            goto L_0x0030
        L_0x004f:
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 != 0) goto L_0x0055
            return r1
        L_0x0055:
            ab3.a r0 = r7.f264445v
            if (r0 == 0) goto L_0x005e
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0
            bb3.d r0 = r0.f283238X0
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r8 == 0) goto L_0x0069
            if (r0 == 0) goto L_0x0068
            boolean r8 = r0.f263954j
            if (r8 != 0) goto L_0x0068
            r1 = 1
        L_0x0068:
            return r1
        L_0x0069:
            if (r0 == 0) goto L_0x0070
            boolean r8 = r0.f263954j
            if (r8 == 0) goto L_0x0070
            r1 = 1
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cb3.C92400k.mo126391r(boolean):boolean");
    }

    /* renamed from: s */
    public final void mo126392s() {
        C91983a aVar = this.f264445v;
        if (aVar != null) {
            NoteEditorUI noteEditorUI = (NoteEditorUI) aVar;
            C76701a.makeText((Context) noteEditorUI.getContext(), (CharSequence) noteEditorUI.getString(C0966R.string.h_k), 0).show();
        }
    }

    /* renamed from: t */
    public void mo126393t() {
        Log.m105924i("NoteSelectManager", "onDestroy");
        f264411N = false;
        MTimerHandler mTimerHandler = this.f264448y;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = this.f264449z;
        if (mTimerHandler2 != null) {
            mTimerHandler2.stopTimer();
        }
        PopupWindow popupWindow = this.f264441r;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        PopupWindow popupWindow2 = this.f264442s;
        if (popupWindow2 != null) {
            popupWindow2.dismiss();
        }
        PopupWindow popupWindow3 = this.f264443t;
        if (popupWindow3 != null) {
            popupWindow3.dismiss();
        }
        PopupWindow popupWindow4 = this.f264444u;
        if (popupWindow4 != null) {
            popupWindow4.dismiss();
        }
        f264410M = null;
    }

    /* renamed from: u */
    public final SpannableStringBuilder mo126394u(C102593i iVar, int i, int i2, boolean z, boolean z2, String str, boolean z3) {
        Spanned a;
        if (iVar == null) {
            Log.m105920e("NoteSelectManager", "processTextDataItem: textDataItem is null");
            return null;
        }
        Spanned a2 = C102988a.m136184a(iVar.f302126s);
        if (a2 == null) {
            Log.m105920e("NoteSelectManager", "processTextDataItem: spannedText is null");
            return null;
        }
        if (z) {
            i2 = a2.length();
        }
        if (str == null) {
            str = "";
        }
        if (i < 0 || i > a2.length() || r6 < 0 || r6 > a2.length() || i > r6) {
            Log.m105920e("NoteSelectManager", "processTextDataItem: incorrect offset");
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) a2.subSequence(0, i);
        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) a2.subSequence(i, r6);
        SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) a2.subSequence(r6, a2.length());
        if (z2) {
            r6 = spannableStringBuilder.length();
            if (!Util.isNullOrNil(str) && (a = C102988a.m136184a(str)) != null) {
                r6 += a.length();
            }
            iVar.f302126s = C102990c.m136185a(spannableStringBuilder) + str + C102990c.m136185a(spannableStringBuilder3);
        }
        if (z3) {
            iVar.f302071b = true;
            iVar.f302072c = r6;
        } else {
            iVar.f302071b = false;
            iVar.f302072c = -1;
        }
        return spannableStringBuilder2;
    }

    /* renamed from: v */
    public final boolean mo126395v(View view, boolean z) {
        if (view == null) {
            return false;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return false;
    }

    /* renamed from: w */
    public void mo126396w() {
        Log.m105918d("NoteSelectManager", "selectItem() called " + this.f264446w);
        mo126376b();
        C92393d dVar = this.f264446w;
        int i = dVar.f264402d;
        int i2 = i > 0 ? i - 1 : 0;
        int i3 = dVar.f264399a;
        mo126398y(i3, i2, i3, i2 + 1);
        mo126368D(true, true, 50);
    }

    /* renamed from: x */
    public final void mo126397x(int i, int i2, int i3) {
        int[] iArr;
        if (f264411N) {
            if (i == 2) {
                int[] iArr2 = this.f264438o;
                if (iArr2 != null && iArr2.length == 2) {
                    iArr2[0] = i2;
                    iArr2[1] = i3;
                }
            } else if (i == 3) {
                int[] iArr3 = this.f264439p;
                if (iArr3 != null && iArr3.length == 2) {
                    iArr3[0] = i2;
                    iArr3[1] = i3;
                }
            } else if (i == 4 && (iArr = this.f264440q) != null && iArr.length == 2) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo126398y(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            boolean r0 = f264411N
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            cb3.d r0 = r9.f264446w
            r2 = 1
            if (r0 != 0) goto L_0x001a
            cb3.d r0 = new cb3.d
            ab3.a r4 = r9.f264445v
            r3 = r0
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f264446w = r0
            goto L_0x0035
        L_0x001a:
            int r3 = r0.f264399a
            if (r3 != r10) goto L_0x002d
            int r3 = r0.f264400b
            if (r3 != r11) goto L_0x002d
            int r3 = r0.f264401c
            if (r3 != r12) goto L_0x002d
            int r3 = r0.f264402d
            if (r3 == r13) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r10 = 0
            goto L_0x0036
        L_0x002d:
            r0.f264399a = r10
            r0.f264400b = r11
            r0.f264401c = r12
            r0.f264402d = r13
        L_0x0035:
            r10 = 1
        L_0x0036:
            if (r10 == 0) goto L_0x006d
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            cb3.d r12 = r9.f264446w
            int r12 = r12.f264399a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r1] = r12
            cb3.d r12 = r9.f264446w
            int r12 = r12.f264400b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r2] = r12
            r12 = 2
            cb3.d r13 = r9.f264446w
            int r13 = r13.f264401c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11[r12] = r13
            r12 = 3
            cb3.d r13 = r9.f264446w
            int r13 = r13.f264402d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11[r12] = r13
            java.lang.String r12 = "NoteSelectManager"
            java.lang.String r13 = "setSelectInfo: %d:%d - %d:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r13, r11)
        L_0x006d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cb3.C92400k.mo126398y(int, int, int, int):boolean");
    }

    /* renamed from: z */
    public final void mo126399z(TextView textView, int i) {
        if (textView != null) {
            textView.setTextSize(1, (float) i);
        }
    }
}
