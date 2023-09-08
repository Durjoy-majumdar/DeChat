package com.tencent.p014mm.plugin.wenote.model.nativenote.manager;

import ab3.C91984b;
import ab3.C91986d;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ParagraphStyle;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;
import bb3.C92218a;
import bb3.C92230i;
import bb3.C92231j;
import bb3.C92239m;
import cb3.C92391b;
import cb3.C92400k;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96733i;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import db3.C97463g;
import db3.C97465i;
import db3.C97469m;
import db3.C97470n;
import db3.C97477t;
import db3.C97478u;
import gb3.C98096c;
import ib3.C98628a;
import java.util.ArrayList;
import xa3.C102587c;
import za3.C102988a;
import za3.C102990c;

/* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText */
public class WXRTEditText extends PasterEditText implements SpanWatcher {

    /* renamed from: A */
    public String f283145A;

    /* renamed from: B */
    public String f283146B = "";

    /* renamed from: C */
    public Spannable f283147C;

    /* renamed from: D */
    public int f283148D = 0;

    /* renamed from: E */
    public boolean f283149E = false;

    /* renamed from: F */
    public C98628a f283150F;

    /* renamed from: G */
    public boolean f283151G;

    /* renamed from: H */
    public boolean f283152H;

    /* renamed from: I */
    public boolean f283153I = false;

    /* renamed from: J */
    public boolean f283154J;

    /* renamed from: K */
    public C92239m f283155K;

    /* renamed from: L */
    public boolean f283156L = false;

    /* renamed from: M */
    public int f283157M = 0;

    /* renamed from: N */
    public boolean f283158N = false;

    /* renamed from: P */
    public int f283159P = -1;

    /* renamed from: Q */
    public Paint f283160Q = null;

    /* renamed from: Q0 */
    public int f283161Q0 = 0;

    /* renamed from: R */
    public MTimerHandler f283162R = null;

    /* renamed from: R0 */
    public int f283163R0 = -1;

    /* renamed from: S */
    public C92391b f283164S = null;

    /* renamed from: T */
    public boolean f283165T = false;

    /* renamed from: U */
    public Path f283166U = null;

    /* renamed from: V */
    public int f283167V = -1;

    /* renamed from: W */
    public int f283168W = -1;

    /* renamed from: p0 */
    public int f283169p0 = -1;

    /* renamed from: s */
    public C91986d f283170s;

    /* renamed from: t */
    public int f283171t = -1;

    /* renamed from: u */
    public int f283172u = -1;

    /* renamed from: v */
    public C91984b f283173v;

    /* renamed from: w */
    public boolean f283174w = false;

    /* renamed from: x */
    public boolean f283175x;

    /* renamed from: x0 */
    public boolean f283176x0 = false;

    /* renamed from: y */
    public int f283177y;

    /* renamed from: y0 */
    public TextWatcher f283178y0 = new C96677b();

    /* renamed from: z */
    public int f283179z;

    /* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText$a */
    public class C96676a implements ActionMode.Callback {
        public C96676a(WXRTEditText wXRTEditText) {
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText$b */
    public class C96677b implements TextWatcher {
        public C96677b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
            if ((r1 + "\n").equals(r15) == false) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
            if (r1.equals(r15) != false) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
            if (((android.text.style.ParagraphStyle[]) r14.f283180d.getText().getSpans(r1.length(), r1.length(), android.text.style.ParagraphStyle.class)).length <= 0) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
            r0 = r14.f283180d.getSelectionStart();
            r3 = r14.f283180d;
            r3.f283175x = true;
            r3.getText().append("\n");
            r3 = r14.f283180d;
            r3.f283175x = false;
            r3.setSelection(r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void afterTextChanged(android.text.Editable r15) {
            /*
                r14 = this;
                monitor-enter(r14)
                java.lang.String r0 = "noteeditor.WXRTEditText"
                java.lang.String r1 = "afterTextChanged@%s"
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ec }
                int r4 = r14.hashCode()     // Catch:{ all -> 0x00ec }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00ec }
                r5 = 0
                r3[r5] = r4     // Catch:{ all -> 0x00ec }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r3)     // Catch:{ all -> 0x00ec }
                java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x00ec }
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                java.lang.String r1 = r0.f283146B     // Catch:{ all -> 0x00ec }
                if (r1 != 0) goto L_0x0023
                java.lang.String r1 = ""
            L_0x0023:
                int r3 = r0.f283148D     // Catch:{ all -> 0x00ec }
                if (r3 == 0) goto L_0x002b
                java.lang.String r3 = ""
                r0.f283146B = r3     // Catch:{ all -> 0x00ec }
            L_0x002b:
                boolean r3 = r0.f283175x     // Catch:{ all -> 0x00ec }
                if (r3 != 0) goto L_0x00a7
                bb3.i r0 = r0.getSelection()     // Catch:{ all -> 0x00ec }
                int r0 = r0.f263989d     // Catch:{ all -> 0x00ec }
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r3 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                bb3.i r3 = r3.getSelection()     // Catch:{ all -> 0x00ec }
                int r3 = r3.f263990e     // Catch:{ all -> 0x00ec }
                if (r0 != r3) goto L_0x00a7
                java.lang.String r0 = "\n"
                boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x00ec }
                if (r0 != 0) goto L_0x005e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
                r0.<init>()     // Catch:{ all -> 0x00ec }
                r0.append(r1)     // Catch:{ all -> 0x00ec }
                java.lang.String r3 = "\n"
                r0.append(r3)     // Catch:{ all -> 0x00ec }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ec }
                boolean r0 = r0.equals(r15)     // Catch:{ all -> 0x00ec }
                if (r0 != 0) goto L_0x0074
            L_0x005e:
                java.lang.String r0 = "\n"
                boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x00ec }
                if (r0 == 0) goto L_0x00a7
                java.lang.String r0 = "\n\n"
                boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x00ec }
                if (r0 != 0) goto L_0x00a7
                boolean r0 = r1.equals(r15)     // Catch:{ all -> 0x00ec }
                if (r0 == 0) goto L_0x00a7
            L_0x0074:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x00ec }
                int r3 = r1.length()     // Catch:{ all -> 0x00ec }
                int r4 = r1.length()     // Catch:{ all -> 0x00ec }
                java.lang.Class<android.text.style.ParagraphStyle> r6 = android.text.style.ParagraphStyle.class
                java.lang.Object[] r0 = r0.getSpans(r3, r4, r6)     // Catch:{ all -> 0x00ec }
                android.text.style.ParagraphStyle[] r0 = (android.text.style.ParagraphStyle[]) r0     // Catch:{ all -> 0x00ec }
                int r0 = r0.length     // Catch:{ all -> 0x00ec }
                if (r0 <= 0) goto L_0x00a7
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                int r0 = r0.getSelectionStart()     // Catch:{ all -> 0x00ec }
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r3 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                r3.f283175x = r2     // Catch:{ all -> 0x00ec }
                android.text.Editable r3 = r3.getText()     // Catch:{ all -> 0x00ec }
                java.lang.String r4 = "\n"
                r3.append(r4)     // Catch:{ all -> 0x00ec }
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r3 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                r3.f283175x = r5     // Catch:{ all -> 0x00ec }
                r3.setSelection(r0)     // Catch:{ all -> 0x00ec }
            L_0x00a7:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                ab3.d r3 = r0.f283170s     // Catch:{ all -> 0x00ec }
                if (r3 == 0) goto L_0x00d9
                boolean r0 = r0.f283175x     // Catch:{ all -> 0x00ec }
                if (r0 != 0) goto L_0x00d9
                boolean r0 = r1.equals(r15)     // Catch:{ all -> 0x00ec }
                if (r0 != 0) goto L_0x00d9
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                android.text.Spannable r9 = r0.mo134889t()     // Catch:{ all -> 0x00ec }
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r7 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                r7.f283146B = r15     // Catch:{ all -> 0x00ec }
                ab3.d r15 = r7.f283170s     // Catch:{ all -> 0x00ec }
                android.text.Spannable r8 = r7.f283147C     // Catch:{ all -> 0x00ec }
                int r10 = r7.f283177y     // Catch:{ all -> 0x00ec }
                int r11 = r7.f283179z     // Catch:{ all -> 0x00ec }
                int r12 = r7.getSelectionStart()     // Catch:{ all -> 0x00ec }
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                int r13 = r0.getSelectionEnd()     // Catch:{ all -> 0x00ec }
                r6 = r15
                com.tencent.mm.plugin.wenote.model.nativenote.manager.b r6 = (com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b) r6     // Catch:{ all -> 0x00ec }
                r6.mo134908f(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00ec }
            L_0x00d9:
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r15 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                r15.f283154J = r2     // Catch:{ all -> 0x00ec }
                r15.getClass()     // Catch:{ all -> 0x00ec }
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r15 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                r15.setParagraphsAreUp2Date(r5)     // Catch:{ all -> 0x00ec }
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r15 = com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00ec }
                r15.mo134876r()     // Catch:{ all -> 0x00ec }
                monitor-exit(r14)
                return
            L_0x00ec:
                r15 = move-exception
                monitor-exit(r14)
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.C96677b.afterTextChanged(android.text.Editable):void");
        }

        public synchronized void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            WXRTEditText wXRTEditText = WXRTEditText.this;
            String str = wXRTEditText.f283145A;
            if (str == null) {
                str = "";
            }
            if (!wXRTEditText.f283175x && !charSequence.toString().equals(str)) {
                WXRTEditText wXRTEditText2 = WXRTEditText.this;
                wXRTEditText2.f283177y = wXRTEditText2.getSelectionStart();
                WXRTEditText wXRTEditText3 = WXRTEditText.this;
                wXRTEditText3.f283179z = wXRTEditText3.getSelectionEnd();
                WXRTEditText.this.f283145A = charSequence.toString();
                WXRTEditText wXRTEditText4 = WXRTEditText.this;
                wXRTEditText4.f283146B = wXRTEditText4.f283145A;
                wXRTEditText4.f283147C = wXRTEditText4.mo134889t();
            }
        }

        public synchronized void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            WXRTEditText.this.f283154J = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText$c */
    public class C96678c implements MTimerHandler.CallBack {
        public C96678c() {
        }

        public boolean onTimerExpired() {
            C92391b bVar = WXRTEditText.this.f283164S;
            if (bVar != null && bVar.mo126355a() == 1) {
                WXRTEditText wXRTEditText = WXRTEditText.this;
                int i = wXRTEditText.f283164S.f264387f;
                wXRTEditText.mo134855C();
                WXRTEditText.this.mo134894y(i, false);
            }
            return true;
        }
    }

    public WXRTEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo134892w();
    }

    private int getOffsetForButton() {
        int i = this.f283163R0;
        return i != -1 ? i : this.f283148D == 2 ? 1 : 0;
    }

    private C92239m getRTLayout() {
        C92239m mVar;
        synchronized (this) {
            if (this.f283155K == null || this.f283154J) {
                this.f283155K = new C92239m(getText());
                this.f283154J = false;
            }
            mVar = this.f283155K;
        }
        return mVar;
    }

    /* access modifiers changed from: private */
    public synchronized void setParagraphsAreUp2Date(boolean z) {
        if (!this.f283152H) {
            this.f283151G = z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo134853A(int r9) {
        /*
            r8 = this;
            ab3.b r0 = r8.f283173v
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.mo125824a(r9)
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            cb3.k r0 = cb3.C92400k.m116191h()
            boolean r1 = cb3.C92400k.f264411N
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            boolean r0 = r0.f264424a
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001b:
            r0.getClass()
        L_0x001e:
            r0 = 0
        L_0x001f:
            r4 = 50
            if (r0 == 0) goto L_0x0069
            boolean r0 = r8.hasFocus()
            if (r0 == 0) goto L_0x003e
            int r0 = r8.getSelectionStart()
            int r1 = r8.getSelectionEnd()
            if (r0 != r1) goto L_0x003c
            int r0 = r8.getSelectionStart()
            if (r9 != r0) goto L_0x003c
            r0 = 1
            r1 = 1
            goto L_0x0043
        L_0x003c:
            r0 = 1
            goto L_0x0042
        L_0x003e:
            r8.requestFocus()
            r0 = 0
        L_0x0042:
            r1 = 0
        L_0x0043:
            r8.setIgnoreSelectChangeByMultiSelect(r3)
            r8.setSelection(r9)
            r8.setIgnoreSelectChangeByMultiSelect(r2)
            ab3.d r2 = r8.f283170s
            if (r2 == 0) goto L_0x005e
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r2 = (com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b) r2
            r2.mo134910h(r3, r4)
            ab3.d r2 = r8.f283170s
            r6 = 0
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r2 = (com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b) r2
            r2.mo134909g(r3, r6)
        L_0x005e:
            r8.mo134857E(r9, r9)
            cb3.k r9 = cb3.C92400k.m116191h()
            r9.mo126368D(r0, r1, r4)
            goto L_0x00b3
        L_0x0069:
            cb3.k r0 = cb3.C92400k.m116191h()
            cb3.d r0 = r0.mo126385l()
            cb3.k r1 = cb3.C92400k.m116191h()
            android.widget.PopupWindow r1 = r1.f264441r
            if (r1 == 0) goto L_0x0081
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x0081
            r1 = 1
            goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            if (r1 == 0) goto L_0x0095
            int r1 = r0.mo126357a()
            if (r1 != r3) goto L_0x0095
            int r1 = r0.f264399a
            int r6 = r8.f283159P
            if (r1 != r6) goto L_0x0095
            int r0 = r0.f264400b
            if (r0 != r9) goto L_0x0095
            r2 = 1
        L_0x0095:
            r8.mo134857E(r9, r9)
            cb3.k r9 = cb3.C92400k.m116191h()
            boolean r0 = cb3.C92400k.f264411N
            if (r0 != 0) goto L_0x00a4
            r9.getClass()
            goto L_0x00b3
        L_0x00a4:
            r9.mo126387n()
            r9.mo126389p()
            r9.mo126373I(r3, r4)
            r9.mo126365A(r3)
            r9.mo126367C(r2)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.mo134853A(int):void");
    }

    /* renamed from: B */
    public synchronized void mo134854B() {
        this.f283175x = false;
    }

    /* renamed from: C */
    public final void mo134855C() {
        C92391b bVar = this.f283164S;
        if (bVar == null) {
            this.f283164S = new C92391b();
            return;
        }
        bVar.f264382a = 0;
        bVar.f264383b = -1.0f;
        bVar.f264384c = -1.0f;
        bVar.f264385d = -1.0f;
        bVar.f264386e = -1.0f;
        bVar.f264387f = -1;
        bVar.f264388g = -1.0f;
        bVar.f264389h = -1.0f;
        bVar.f264390i = -1.0f;
        bVar.f264391j = -1.0f;
        bVar.f264392k = -1;
    }

    /* renamed from: D */
    public final void mo134856D() {
        MTimerHandler mTimerHandler = this.f283162R;
        if (mTimerHandler == null) {
            this.f283162R = new MTimerHandler(new C96678c(), false);
        } else {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: E */
    public final void mo134857E(int i, int i2) {
        int i3 = this.f283148D;
        if (i3 == 2) {
            C92400k.m116191h().mo126398y(this.f283159P, getOffsetForButton(), this.f283159P, getOffsetForButton());
        } else if (i3 == 1) {
            C92400k.m116191h().mo126398y(this.f283159P, getOffsetForButton(), this.f283159P, getOffsetForButton());
        } else {
            C92400k h = C92400k.m116191h();
            int i4 = this.f283159P;
            h.mo126398y(i4, i, i4, i2);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public C97469m[] getCurrentEditorCursorNumberSpan() {
        C92230i paragraphsInSelection = getParagraphsInSelection();
        return (C97469m[]) getText().getSpans(paragraphsInSelection.f263989d, paragraphsInSelection.f263990e, C97469m.class);
    }

    public String getCurrentEditorCursorParagraphStr() {
        C92230i paragraphsInSelection = getParagraphsInSelection();
        return getText().subSequence(paragraphsInSelection.f263989d, paragraphsInSelection.f263990e).toString().trim();
    }

    public int getEditTextType() {
        return this.f283148D;
    }

    public ArrayList<C97470n> getParagraphs() {
        return getRTLayout().f264004e;
    }

    public C92230i getParagraphsInSelection() {
        C92239m rTLayout = getRTLayout();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart > selectionEnd) {
            int i = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i;
        }
        int a = rTLayout.mo126235a(selectionStart);
        int i2 = 0;
        if (!(selectionStart == selectionEnd)) {
            selectionEnd--;
        }
        int a2 = rTLayout.mo126235a(selectionEnd);
        int i3 = rTLayout.f264003d;
        int i4 = (i3 == 0 || a < 0) ? 0 : a < i3 ? rTLayout.f264004e.get(a).f263989d : rTLayout.f264004e.get(i3 - 1).f263990e - 1;
        int i5 = rTLayout.f264003d;
        if (i5 != 0 && a2 >= 0) {
            i2 = a2 < i5 ? rTLayout.f264004e.get(a2).f263990e : rTLayout.f264004e.get(i5 - 1).f263990e - 1;
        }
        return new C92230i(i4, i2);
    }

    public int getPosInDataList() {
        return this.f283159P;
    }

    public C98628a getRecyclerHolder() {
        return this.f283150F;
    }

    public int getRecyclerItemPosition() {
        if (this.f283150F.mo17364k() == -1) {
            return 0;
        }
        return this.f283150F.mo17364k();
    }

    public String getSelectedText() {
        int i;
        Editable text = getText();
        C92230i selection = getSelection();
        if (selection.f263989d < 0 || (i = selection.f263990e) < 0 || i > text.length()) {
            return null;
        }
        return text.subSequence(selection.f263989d, selection.f263990e).toString();
    }

    public C92230i getSelection() {
        return new C92230i(getSelectionStart(), getSelectionEnd());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r3 == r2) goto L_0x01ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7 A[Catch:{ Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9 A[Catch:{ Exception -> 0x01de }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r1 = r22
            boolean r0 = cb3.C92400k.f264411N
            if (r0 == 0) goto L_0x01ef
            int r0 = r1.f283148D
            if (r0 == 0) goto L_0x000c
            goto L_0x01ef
        L_0x000c:
            android.text.Editable r0 = r22.getText()
            if (r0 != 0) goto L_0x0014
            goto L_0x01ef
        L_0x0014:
            cb3.k r2 = cb3.C92400k.m116191h()
            cb3.d r2 = r2.mo126385l()
            cb3.k r3 = cb3.C92400k.m116191h()
            int r4 = r1.f283159P
            int r3 = r3.mo126381g(r4)
            r4 = -1
            r5 = 1
            r6 = 0
            if (r3 == r5) goto L_0x0051
            r7 = 2
            if (r3 == r7) goto L_0x0044
            r7 = 3
            if (r3 == r7) goto L_0x003f
            r7 = 4
            if (r3 == r7) goto L_0x0037
            r2 = -1
            r3 = -1
            goto L_0x0059
        L_0x0037:
            int r2 = r2.f264400b
            int r3 = r0.length()
            r7 = 0
            goto L_0x004a
        L_0x003f:
            int r2 = r2.f264402d
            r3 = 0
            r7 = 1
            goto L_0x005a
        L_0x0044:
            int r3 = r0.length()
            r2 = 0
            r7 = 1
        L_0x004a:
            r8 = 1
            r21 = r3
            r3 = r2
            r2 = r21
            goto L_0x005b
        L_0x0051:
            int r3 = r2.f264400b
            int r2 = r2.f264402d
            if (r3 != r2) goto L_0x0059
            goto L_0x01ef
        L_0x0059:
            r7 = 0
        L_0x005a:
            r8 = 0
        L_0x005b:
            if (r3 < 0) goto L_0x01ef
            int r0 = r0.length()
            if (r2 > r0) goto L_0x01ef
            if (r3 <= r2) goto L_0x0067
            goto L_0x01ef
        L_0x0067:
            android.text.Layout r0 = r22.getLayout()
            if (r0 != 0) goto L_0x006f
            goto L_0x01ef
        L_0x006f:
            int r9 = r1.f283167V
            if (r9 != r4) goto L_0x0079
            int r9 = r22.getPaddingLeft()
            r1.f283167V = r9
        L_0x0079:
            int r9 = r1.f283168W
            if (r9 != r4) goto L_0x0083
            int r9 = r22.getPaddingTop()
            r1.f283168W = r9
        L_0x0083:
            int r9 = r1.f283169p0
            if (r9 != r4) goto L_0x008d
            int r4 = r22.getPaddingBottom()
            r1.f283169p0 = r4
        L_0x008d:
            android.graphics.Path r4 = r1.f283166U
            if (r4 != 0) goto L_0x0098
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r1.f283166U = r4
        L_0x0098:
            android.graphics.Path r4 = r1.f283166U
            r4.reset()
            int r4 = r0.getLineForOffset(r3)     // Catch:{ Exception -> 0x01de }
            int r9 = r0.getLineForOffset(r2)     // Catch:{ Exception -> 0x01de }
            if (r4 <= r9) goto L_0x00a9
            goto L_0x01ef
        L_0x00a9:
            int r10 = r0.getWidth()     // Catch:{ Exception -> 0x01de }
            float r3 = r0.getPrimaryHorizontal(r3)     // Catch:{ Exception -> 0x01de }
            int r11 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            float r11 = (float) r11     // Catch:{ Exception -> 0x01de }
            float r13 = r3 + r11
            int r3 = r0.getLineTop(r4)     // Catch:{ Exception -> 0x01de }
            int r11 = r1.f283168W     // Catch:{ Exception -> 0x01de }
            int r3 = r3 + r11
            float r14 = (float) r3     // Catch:{ Exception -> 0x01de }
            int r3 = r0.getLineBottom(r4)     // Catch:{ Exception -> 0x01de }
            int r11 = r1.f283168W     // Catch:{ Exception -> 0x01de }
            int r3 = r3 + r11
            float r3 = (float) r3     // Catch:{ Exception -> 0x01de }
            float r2 = r0.getPrimaryHorizontal(r2)     // Catch:{ Exception -> 0x01de }
            int r11 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            float r11 = (float) r11     // Catch:{ Exception -> 0x01de }
            float r2 = r2 + r11
            int r11 = r0.getLineTop(r9)     // Catch:{ Exception -> 0x01de }
            int r12 = r1.f283168W     // Catch:{ Exception -> 0x01de }
            int r11 = r11 + r12
            float r11 = (float) r11     // Catch:{ Exception -> 0x01de }
            int r0 = r0.getLineBottom(r9)     // Catch:{ Exception -> 0x01de }
            int r12 = r1.f283168W     // Catch:{ Exception -> 0x01de }
            int r0 = r0 + r12
            float r0 = (float) r0     // Catch:{ Exception -> 0x01de }
            if (r7 == 0) goto L_0x00fb
            if (r8 == 0) goto L_0x00fb
            android.graphics.Path r15 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            int r2 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            float r3 = (float) r2     // Catch:{ Exception -> 0x01de }
            r17 = 0
            int r2 = r2 + r10
            float r2 = (float) r2     // Catch:{ Exception -> 0x01de }
            int r4 = r1.f283169p0     // Catch:{ Exception -> 0x01de }
            float r4 = (float) r4     // Catch:{ Exception -> 0x01de }
            float r19 = r0 + r4
            android.graphics.Path$Direction r20 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r3
            r18 = r2
            r15.addRect(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01de }
            goto L_0x01b9
        L_0x00fb:
            if (r4 != r9) goto L_0x0133
            if (r7 == 0) goto L_0x0113
            android.graphics.Path r15 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            int r3 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            float r3 = (float) r3     // Catch:{ Exception -> 0x01de }
            r17 = 0
            android.graphics.Path$Direction r20 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r3
            r18 = r2
            r19 = r0
            r15.addRect(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01de }
            goto L_0x01b9
        L_0x0113:
            if (r8 == 0) goto L_0x0127
            android.graphics.Path r12 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            int r2 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            int r2 = r2 + r10
            float r15 = (float) r2     // Catch:{ Exception -> 0x01de }
            int r2 = r1.f283169p0     // Catch:{ Exception -> 0x01de }
            float r2 = (float) r2     // Catch:{ Exception -> 0x01de }
            float r16 = r0 + r2
            android.graphics.Path$Direction r17 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r12.addRect(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01de }
            goto L_0x01b9
        L_0x0127:
            android.graphics.Path r12 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r17 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r15 = r2
            r16 = r0
            r12.addRect(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01de }
            goto L_0x01b9
        L_0x0133:
            if (r7 == 0) goto L_0x015c
            android.graphics.Path r15 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            int r7 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            float r8 = (float) r7     // Catch:{ Exception -> 0x01de }
            r17 = 0
            int r7 = r7 + r10
            float r7 = (float) r7     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r20 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r8
            r18 = r7
            r19 = r3
            r15.addRect(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01de }
            android.graphics.Path r15 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            int r7 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            float r7 = (float) r7     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r20 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r7
            r17 = r11
            r18 = r2
            r19 = r0
            r15.addRect(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01de }
            goto L_0x01a2
        L_0x015c:
            if (r8 == 0) goto L_0x0183
            android.graphics.Path r12 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            int r2 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            int r2 = r2 + r10
            float r15 = (float) r2     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r17 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r3
            r12.addRect(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01de }
            android.graphics.Path r15 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            int r2 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            float r7 = (float) r2     // Catch:{ Exception -> 0x01de }
            int r2 = r2 + r10
            float r2 = (float) r2     // Catch:{ Exception -> 0x01de }
            int r8 = r1.f283169p0     // Catch:{ Exception -> 0x01de }
            float r8 = (float) r8     // Catch:{ Exception -> 0x01de }
            float r19 = r0 + r8
            android.graphics.Path$Direction r20 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r7
            r17 = r11
            r18 = r2
            r15.addRect(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01de }
            goto L_0x01a2
        L_0x0183:
            android.graphics.Path r12 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            int r7 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            int r7 = r7 + r10
            float r15 = (float) r7     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r17 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r3
            r12.addRect(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01de }
            android.graphics.Path r15 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            int r7 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            float r7 = (float) r7     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r20 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r7
            r17 = r11
            r18 = r2
            r19 = r0
            r15.addRect(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01de }
        L_0x01a2:
            int r9 = r9 - r4
            if (r9 <= r5) goto L_0x01b9
            android.graphics.Path r15 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            int r0 = r1.f283167V     // Catch:{ Exception -> 0x01de }
            float r2 = (float) r0     // Catch:{ Exception -> 0x01de }
            int r0 = r0 + r10
            float r0 = (float) r0     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r20 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r2
            r17 = r3
            r18 = r0
            r19 = r11
            r15.addRect(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01de }
        L_0x01b9:
            android.graphics.Path r0 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x01de }
            if (r0 != 0) goto L_0x01ef
            android.graphics.Paint r0 = r1.f283160Q     // Catch:{ Exception -> 0x01de }
            if (r0 != 0) goto L_0x01d2
            android.graphics.Paint r0 = new android.graphics.Paint     // Catch:{ Exception -> 0x01de }
            r0.<init>(r5)     // Catch:{ Exception -> 0x01de }
            r1.f283160Q = r0     // Catch:{ Exception -> 0x01de }
            r2 = 1347529272(0x5051aa38, float:1.40703744E10)
            r0.setColor(r2)     // Catch:{ Exception -> 0x01de }
        L_0x01d2:
            android.graphics.Path r0 = r1.f283166U     // Catch:{ Exception -> 0x01de }
            android.graphics.Paint r2 = r1.f283160Q     // Catch:{ Exception -> 0x01de }
            r3 = r23
            r3.drawPath(r0, r2)     // Catch:{ Exception -> 0x01dc }
            goto L_0x01f1
        L_0x01dc:
            r0 = move-exception
            goto L_0x01e1
        L_0x01de:
            r0 = move-exception
            r3 = r23
        L_0x01e1:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r6] = r0
            java.lang.String r0 = "noteeditor.WXRTEditText"
            java.lang.String r4 = "tryDrawCover: "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r2)
            goto L_0x01f1
        L_0x01ef:
            r3 = r23
        L_0x01f1:
            super.onDraw(r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.onDraw(android.graphics.Canvas):void");
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        this.f283176x0 = false;
        this.f283171t = -1;
        this.f283172u = -1;
        super.onFocusChanged(z, i, rect);
        C91986d dVar = this.f283170s;
        if (dVar != null) {
            int recyclerItemPosition = getRecyclerItemPosition();
            C96679b bVar = (C96679b) dVar;
            synchronized (bVar) {
                if (z) {
                    bVar.mo134912j();
                }
                NoteEditorUI noteEditorUI = (NoteEditorUI) bVar.f283188d;
                noteEditorUI.getClass();
                noteEditorUI.mo134928W7(this, z, recyclerItemPosition);
            }
        }
        if (z && !this.f283176x0) {
            onSelectionChanged(getSelectionStart(), getSelectionEnd());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        if (r12.f283171t != r13) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        if (r12.f283172u == r14) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0016, code lost:
        r12.f283171t = r13;
        r12.f283172u = r14;
        super.onSelectionChanged(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r12.f283151G != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r12.f283152H = true;
        db3.C97478u.m125554b(r12, new db3.C97477t[0]);
        r12.f283152H = false;
        setParagraphsAreUp2Date(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r1 = r12.f283170s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r1 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        r12.f283153I = true;
        r1 = (com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r1.f283197m != 2) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1.f283198n != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r3 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r1.f283188d;
        r3.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (java.lang.Math.abs(r14 - r13) < 1) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        r3.f283214G = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        if (getEditTextType() != 0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        r3 = db3.C97478u.f286113f.iterator();
        r4 = false;
        r5 = false;
        r6 = false;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r3.hasNext() == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        r8 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        if ((!r8.mo136728d(getText(), r8.mo136727c(r12), db3.C97476s.f286106e).isEmpty()) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if ((r8 instanceof db3.C97458b) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        if ((r8 instanceof db3.C97459c) == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        if ((r8 instanceof db3.C97468l) == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        if ((r8 instanceof db3.C97466j) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009c, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009e, code lost:
        r4 = false;
        r5 = false;
        r6 = false;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
        r3 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r1.f283192h;
        r3.f283367o = r7;
        r3.f283360h.setPressed(r7);
        r3 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r1.f283192h;
        r3.f283368p = r4;
        r3.f283361i.setPressed(r4);
        r3 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r1.f283192h;
        r3.f283369q = r5;
        r3.f283362j.setPressed(r5);
        r1 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r1.f283192h;
        r1.f283370r = r6;
        r1.f283364l.setPressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:
        r12.f283153I = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d2, code lost:
        if (cb3.C92400k.f264411N == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d6, code lost:
        if (r12.f283165T != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dc, code lost:
        if (hasFocus() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e0, code lost:
        if (r12.f283159P < 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e2, code lost:
        mo134857E(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ef, code lost:
        if (cb3.C92400k.m116191h().mo126381g(r12.f283159P) != 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
        r13 = cb3.C92400k.m116191h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f7, code lost:
        if (cb3.C92400k.f264411N != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f9, code lost:
        r13.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fd, code lost:
        r13.mo126373I(true, 0);
        r13.mo126387n();
        r13.mo126389p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0008, code lost:
        r12.f283176x0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        if (r13 >= 0) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSelectionChanged(int r13, int r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f283174w     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r12)     // Catch:{ all -> 0x0109 }
            return
        L_0x0007:
            monitor-exit(r12)     // Catch:{ all -> 0x0109 }
            r0 = 1
            r12.f283176x0 = r0
            if (r13 >= 0) goto L_0x000e
            return
        L_0x000e:
            int r1 = r12.f283171t
            if (r1 != r13) goto L_0x0016
            int r1 = r12.f283172u
            if (r1 == r14) goto L_0x00d0
        L_0x0016:
            r12.f283171t = r13
            r12.f283172u = r14
            super.onSelectionChanged(r13, r14)
            boolean r1 = r12.f283151G
            r2 = 0
            if (r1 != 0) goto L_0x002e
            r12.f283152H = r0
            db3.t[] r1 = new db3.C97477t[r2]
            db3.C97478u.m125554b(r12, r1)
            r12.f283152H = r2
            r12.setParagraphsAreUp2Date(r0)
        L_0x002e:
            ab3.d r1 = r12.f283170s
            if (r1 == 0) goto L_0x00d0
            r12.f283153I = r0
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r1 = (com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b) r1
            int r3 = r1.f283197m
            r4 = 2
            if (r3 != r4) goto L_0x00ce
            boolean r3 = r1.f283198n
            if (r3 != 0) goto L_0x0041
            goto L_0x00ce
        L_0x0041:
            com.tencent.mm.plugin.wenote.ui.nativenote.o r3 = r1.f283188d
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r3
            r3.getClass()
            int r4 = r14 - r13
            int r4 = java.lang.Math.abs(r4)
            if (r4 < r0) goto L_0x0052
            r4 = 1
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            r3.f283214G = r4
            int r3 = r12.getEditTextType()
            if (r3 != 0) goto L_0x009e
            java.util.ArrayList<db3.t> r3 = db3.C97478u.f286113f
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0065:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00a2
            java.lang.Object r8 = r3.next()
            db3.t r8 = (db3.C97477t) r8
            bb3.i r9 = r8.mo136727c(r12)
            android.text.Editable r10 = r12.getText()
            db3.s r11 = db3.C97476s.SPAN_FLAGS
            java.util.ArrayList r9 = r8.mo136728d(r10, r9, r11)
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r0
            if (r9 == 0) goto L_0x0065
            boolean r9 = r8 instanceof db3.C97458b
            if (r9 == 0) goto L_0x008c
            r7 = 1
            goto L_0x0065
        L_0x008c:
            boolean r9 = r8 instanceof db3.C97459c
            if (r9 == 0) goto L_0x0092
            r4 = 1
            goto L_0x0065
        L_0x0092:
            boolean r9 = r8 instanceof db3.C97468l
            if (r9 == 0) goto L_0x0098
            r5 = 1
            goto L_0x0065
        L_0x0098:
            boolean r8 = r8 instanceof db3.C97466j
            if (r8 == 0) goto L_0x0065
            r6 = 1
            goto L_0x0065
        L_0x009e:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x00a2:
            ab3.c r3 = r1.f283192h
            com.tencent.mm.plugin.wenote.ui.nativenote.e0 r3 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r3
            r3.f283367o = r7
            android.widget.LinearLayout r3 = r3.f283360h
            r3.setPressed(r7)
            ab3.c r3 = r1.f283192h
            com.tencent.mm.plugin.wenote.ui.nativenote.e0 r3 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r3
            r3.f283368p = r4
            android.widget.LinearLayout r3 = r3.f283361i
            r3.setPressed(r4)
            ab3.c r3 = r1.f283192h
            com.tencent.mm.plugin.wenote.ui.nativenote.e0 r3 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r3
            r3.f283369q = r5
            android.widget.LinearLayout r3 = r3.f283362j
            r3.setPressed(r5)
            ab3.c r1 = r1.f283192h
            com.tencent.mm.plugin.wenote.ui.nativenote.e0 r1 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0) r1
            r1.f283370r = r6
            android.widget.LinearLayout r1 = r1.f283364l
            r1.setPressed(r6)
        L_0x00ce:
            r12.f283153I = r2
        L_0x00d0:
            boolean r1 = cb3.C92400k.f264411N
            if (r1 == 0) goto L_0x0108
            boolean r1 = r12.f283165T
            if (r1 != 0) goto L_0x0108
            boolean r1 = r12.hasFocus()
            if (r1 == 0) goto L_0x0108
            int r1 = r12.f283159P
            if (r1 < 0) goto L_0x0108
            r12.mo134857E(r13, r14)
            cb3.k r13 = cb3.C92400k.m116191h()
            int r14 = r12.f283159P
            int r13 = r13.mo126381g(r14)
            if (r13 != r0) goto L_0x0108
            cb3.k r13 = cb3.C92400k.m116191h()
            boolean r14 = cb3.C92400k.f264411N
            if (r14 != 0) goto L_0x00fd
            r13.getClass()
            goto L_0x0108
        L_0x00fd:
            r1 = 0
            r13.mo126373I(r0, r1)
            r13.mo126387n()
            r13.mo126389p()
        L_0x0108:
            return
        L_0x0109:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0109 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.onSelectionChanged(int, int):void");
    }

    public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if ((obj instanceof C97463g) && (obj instanceof ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if ((obj instanceof C97463g) && (obj instanceof ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if ((obj instanceof C97463g) && (obj instanceof ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    public boolean onTextContextMenuItem(int i) {
        if (i == 16908319) {
            NoteEditorUI noteEditorUI = (NoteEditorUI) ((C96679b) this.f283170s).f283188d;
            noteEditorUI.getClass();
            if (!noteEditorUI.f283263q.f283365m) {
                noteEditorUI.mo134927V7();
                noteEditorUI.f283212E.postDelayed(new C96733i(noteEditorUI, noteEditorUI.getContext()), 400);
            }
            return true;
        }
        boolean z = false;
        if (i == 16908321 || i == 16908320) {
            C92231j.m115953a();
        } else if (i == 16908322) {
            int c = C92231j.m115955c(getContext());
            if (c == 2) {
                C92231j.m115953a();
            } else if (c == 3) {
                NoteEditorUI noteEditorUI2 = (NoteEditorUI) ((C96679b) this.f283170s).f283188d;
                noteEditorUI2.getClass();
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "onNotifyPasteFromWNNoteClipboard %s", Long.valueOf(noteEditorUI2.f283270x));
                ArrayList<C102587c> arrayList = C92231j.f263992b;
                if (arrayList != null && arrayList.size() > 0) {
                    z = true;
                }
                if (z) {
                    ArrayList<C102587c> b = C92231j.m115954b();
                    if (noteEditorUI2.f283238X0.mo126196f(b)) {
                        noteEditorUI2.mo134932a8();
                    } else {
                        noteEditorUI2.f283238X0.mo126210t(b, this, true, true, true, false, false);
                        int recyclerItemPosition = getRecyclerItemPosition();
                        noteEditorUI2.f283238X0.mo126194d(recyclerItemPosition, b.size() + recyclerItemPosition + 1, true);
                        noteEditorUI2.mo134927V7();
                        if (noteEditorUI2.f283224Q0) {
                            C92400k.m116191h().mo126377c();
                        }
                    }
                }
                return true;
            }
        }
        try {
            boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
            if (i == 16908322) {
                this.f283161Q0 = 0;
                Editable text = getText();
                try {
                    mo134895z(text);
                } catch (IndexOutOfBoundsException e) {
                    IndexOutOfBoundsException indexOutOfBoundsException = e;
                    Log.m105921e("noteeditor.WXRTEditText", "!!MMEditText Exception %d", Integer.valueOf(this.f283161Q0));
                    if (this.f283161Q0 < 3) {
                        this.f283161Q0++;
                        mo134895z(new SpannableStringBuilder(TextUtils.concat(new CharSequence[]{" ", text})));
                    } else {
                        throw indexOutOfBoundsException;
                    }
                }
            }
            if (i == 16908322 && this.f283149E) {
                C91986d dVar = this.f283170s;
                if (dVar != null) {
                    ((C96679b) dVar).mo134910h(false, 0);
                    ((C96679b) this.f283170s).mo134909g(0, 0);
                }
                this.f283149E = false;
            }
            return onTextContextMenuItem;
        } catch (NullPointerException e2) {
            Log.m105921e("noteeditor.WXRTEditText", "!!MMEditText NullPointerException %s", e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = cb3.C92400k.f264411N
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x010b
            android.text.Editable r0 = r11.getText()
            if (r0 != 0) goto L_0x0011
            r11.mo134855C()
            return r1
        L_0x0011:
            int r4 = r0.length()
            float r5 = r12.getX()
            float r6 = r12.getY()
            int r5 = r11.getOffsetForPosition(r5, r6)
            if (r4 < 0) goto L_0x0107
            if (r5 < 0) goto L_0x0107
            if (r5 <= r4) goto L_0x0029
            goto L_0x0107
        L_0x0029:
            int r4 = r12.getAction()
            r6 = 0
            if (r4 == 0) goto L_0x007a
            if (r4 == r1) goto L_0x003f
            r12 = 3
            if (r4 == r12) goto L_0x0037
            goto L_0x0106
        L_0x0037:
            r11.mo134855C()
            r11.mo134856D()
            goto L_0x0106
        L_0x003f:
            r11.mo134856D()
            cb3.b r0 = r11.f283164S
            if (r0 != 0) goto L_0x0048
            goto L_0x0106
        L_0x0048:
            float r2 = r12.getRawX()
            float r3 = r12.getRawY()
            float r4 = r12.getX()
            float r12 = r12.getY()
            r0.f264388g = r2
            r0.f264389h = r3
            r0.f264390i = r4
            r0.f264391j = r12
            int r12 = r0.f264382a
            if (r12 != r1) goto L_0x0067
            r0.f264392k = r5
            goto L_0x0069
        L_0x0067:
            r0.f264392k = r6
        L_0x0069:
            cb3.b r12 = r11.f283164S
            int r12 = r12.mo126355a()
            r11.mo134855C()
            r0 = 2
            if (r12 != r0) goto L_0x0106
            r11.mo134853A(r5)
            goto L_0x0106
        L_0x007a:
            float r4 = r12.getX()
            int r4 = (int) r4
            float r7 = r12.getY()
            int r7 = (int) r7
            android.text.Layout r8 = r11.getLayout()
            int r7 = r8.getLineForVertical(r7)
            float r9 = (float) r4
            int r7 = r8.getOffsetForHorizontal(r7, r9)
            android.text.Editable r8 = r11.getText()
            int r9 = r7 + 1
            java.lang.Class<db3.k> r10 = db3.C97467k.class
            java.lang.Object[] r7 = r8.getSpans(r7, r9, r10)
            db3.k[] r7 = (db3.C97467k[]) r7
            cb3.k r8 = cb3.C92400k.m116191h()
            boolean r9 = cb3.C92400k.f264411N
            if (r9 == 0) goto L_0x00ad
            boolean r8 = r8.f264424a
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00ad:
            r8.getClass()
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00db
            int r8 = bb3.C92219b.m115909b()
            if (r4 >= r8) goto L_0x00db
            int r4 = r7.length
            if (r4 == 0) goto L_0x00db
            java.lang.String r2 = "noteeditor.WXRTEditText"
            java.lang.String r3 = "clicked todo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            ab3.d r2 = r11.f283170s
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r2 = (com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b) r2
            com.tencent.mm.plugin.wenote.ui.nativenote.o r3 = r2.f283188d
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r3
            r3.getClass()
            r3.mo134924S7()
            r2.mo134912j()
            r2 = r7[r6]
            r2.mo136730b(r11, r0, r12, r2)
            goto L_0x0106
        L_0x00db:
            r11.mo134855C()
            cb3.b r0 = r11.f283164S
            float r4 = r12.getRawX()
            float r6 = r12.getRawY()
            float r7 = r12.getX()
            float r12 = r12.getY()
            r0.f264382a = r1
            r0.f264383b = r4
            r0.f264384c = r6
            r0.f264385d = r7
            r0.f264386e = r12
            r0.f264387f = r5
            r11.mo134856D()
            com.tencent.mm.sdk.platformtools.MTimerHandler r12 = r11.f283162R
            r4 = 500(0x1f4, double:2.47E-321)
            r12.startTimer(r4, r2)
        L_0x0106:
            return r1
        L_0x0107:
            r11.mo134855C()
            return r1
        L_0x010b:
            int r0 = r12.getAction()
            if (r0 != r1) goto L_0x0123
            ab3.d r0 = r11.f283170s
            if (r0 == 0) goto L_0x0123
            r4 = 300(0x12c, double:1.48E-321)
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = (com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b) r0
            r0.mo134910h(r1, r4)
            ab3.d r0 = r11.f283170s
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = (com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b) r0
            r0.mo134909g(r1, r2)
        L_0x0123:
            boolean r12 = super.onTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public final void mo134876r() {
        Editable text = getText();
        if (text.getSpans(0, text.length(), getClass()) != null) {
            text.setSpan(this, 0, text.length(), 18);
        }
    }

    public boolean requestFocus(int i, Rect rect) {
        return super.requestFocus(i, rect);
    }

    /* renamed from: s */
    public <V, C extends C97463g<V>> void mo134878s(C97477t<V, C> tVar, V v) {
        if (!this.f283153I) {
            Spannable t = this.f283175x ? null : mo134889t();
            tVar.mo136722a(this, v);
            synchronized (this) {
                if (this.f283170s != null && !this.f283175x) {
                    ((C96679b) this.f283170s).mo134908f(this, t, mo134889t(), getSelectionStart(), getSelectionEnd(), getSelectionStart(), getSelectionEnd());
                }
                this.f283154J = true;
            }
        }
    }

    public void setEditTextType(int i) {
        this.f283148D = i;
    }

    public void setIgnoreSelectChangeByMultiSelect(boolean z) {
        this.f283165T = z;
    }

    public void setMaxHeight(int i) {
        super.setMaxHeight(i);
    }

    public void setPosInDataList(int i) {
        this.f283159P = i;
    }

    public void setProcessClickListener(C91984b bVar) {
        this.f283173v = bVar;
    }

    public void setRichTextEditing(String str) {
        mo134891v();
        if (!Util.isNullOrNil(str)) {
            setSpannableText(C102988a.m136184a(str));
        } else {
            setText("");
        }
        mo134854B();
    }

    public void setSelection(int i) {
        super.setSelection(i);
    }

    public void setSpannableText(Spanned spanned) {
        mo134891v();
        synchronized (this) {
            this.f283174w = true;
        }
        super.setText(spanned, TextView.BufferType.EDITABLE);
        synchronized (this) {
            this.f283174w = false;
        }
        mo134876r();
        C97478u.m125554b(this, new C97477t[0]);
        mo134854B();
        setContentDescription(C98096c.m126716k(mo134890u(C26902a.f74806b), getContext()));
    }

    public void setText(String str) {
        mo134891v();
        super.setText(str);
        mo134854B();
        setContentDescription(C98096c.m126716k(mo134890u(C26902a.f74806b), getContext()));
    }

    public void setTextWithoutIgnore(String str) {
        super.setText(str);
    }

    /* renamed from: t */
    public Spannable mo134889t() {
        CharSequence text = super.getText();
        if (text == null) {
            text = "";
        }
        return new C92218a(text);
    }

    /* renamed from: u */
    public String mo134890u(C26902a aVar) {
        return aVar == C26902a.f74805a ? getText().toString() : aVar == C26902a.f74806b ? C102990c.m136185a(getText()) : "";
    }

    /* renamed from: v */
    public synchronized void mo134891v() {
        this.f283175x = true;
    }

    /* renamed from: w */
    public final void mo134892w() {
        removeTextChangedListener(this.f283178y0);
        addTextChangedListener(this.f283178y0);
        setMovementMethod(new C97465i());
        this.f283159P = -1;
        Paint paint = new Paint(1);
        this.f283160Q = paint;
        paint.setColor(1347529272);
        this.f283164S = new C92391b();
        this.f283166U = new Path();
        this.f283167V = -1;
        this.f283168W = -1;
        this.f283169p0 = -1;
        if (C92400k.f264411N) {
            setHighlightColor(0);
            setCustomSelectionActionModeCallback(new C96676a(this));
        }
    }

    /* renamed from: x */
    public void mo134893x() {
        C91986d dVar = this.f283170s;
        if (dVar != null) {
            ((C96679b) dVar).mo134910h(true, 50);
            ((C96679b) this.f283170s).mo134909g(1, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0067  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo134894y(int r10, boolean r11) {
        /*
            r9 = this;
            ab3.b r0 = r9.f283173v
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.mo125825b(r10, r11)
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            android.text.Editable r0 = r9.getText()
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            android.text.Layout r1 = r9.getLayout()
            if (r1 != 0) goto L_0x0019
            return
        L_0x0019:
            int r2 = r0.length()
            if (r10 < 0) goto L_0x008f
            if (r10 <= r2) goto L_0x0023
            goto L_0x008f
        L_0x0023:
            r3 = 0
            if (r2 != 0) goto L_0x0029
            r10 = 0
            r11 = 0
            goto L_0x0047
        L_0x0029:
            if (r10 >= r2) goto L_0x003a
            if (r11 != 0) goto L_0x0035
            char r11 = r0.charAt(r10)
            r0 = 10
            if (r11 == r0) goto L_0x0046
        L_0x0035:
            int r11 = r1.getOffsetToRightOf(r10)
            goto L_0x0047
        L_0x003a:
            if (r10 != r2) goto L_0x0046
            if (r11 == 0) goto L_0x0046
            int r11 = r1.getOffsetToLeftOf(r10)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x0047
        L_0x0046:
            r11 = r10
        L_0x0047:
            if (r10 < 0) goto L_0x008f
            if (r10 > r2) goto L_0x008f
            if (r11 < 0) goto L_0x008f
            if (r11 <= r2) goto L_0x0050
            goto L_0x008f
        L_0x0050:
            cb3.k r0 = cb3.C92400k.m116191h()
            boolean r1 = cb3.C92400k.f264411N
            r2 = 1
            if (r1 == 0) goto L_0x005f
            boolean r0 = r0.f264424a
            if (r0 == 0) goto L_0x0062
            r0 = 1
            goto L_0x0063
        L_0x005f:
            r0.getClass()
        L_0x0062:
            r0 = 0
        L_0x0063:
            r4 = 50
            if (r0 == 0) goto L_0x0085
            r9.requestFocus()
            r9.setIgnoreSelectChangeByMultiSelect(r2)
            r9.setSelection(r10, r11)
            r9.setIgnoreSelectChangeByMultiSelect(r3)
            ab3.d r0 = r9.f283170s
            if (r0 == 0) goto L_0x0085
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = (com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b) r0
            r0.mo134910h(r2, r4)
            ab3.d r0 = r9.f283170s
            r6 = 0
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = (com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b) r0
            r0.mo134909g(r2, r6)
        L_0x0085:
            r9.mo134857E(r10, r11)
            cb3.k r10 = cb3.C92400k.m116191h()
            r10.mo126368D(r2, r2, r4)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText.mo134894y(int, boolean):void");
    }

    /* renamed from: z */
    public void mo134895z(Spannable spannable) {
        int selectionStart = getSelectionStart();
        setSpannableText(C96963p0.wx0().mo83004M(getContext(), spannable));
        int length = getText().length() - spannable.length();
        if (length > 0) {
            int i = selectionStart + length;
            if (i <= getText().length()) {
                setSelection(i);
                return;
            }
            return;
        }
        setSelection(selectionStart);
    }

    public WXRTEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo134892w();
    }
}
