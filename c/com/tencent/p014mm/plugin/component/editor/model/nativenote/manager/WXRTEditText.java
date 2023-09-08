package com.tencent.p014mm.plugin.component.editor.model.nativenote.manager;

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
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import com.tencent.p014mm.plugin.component.editor.C93087p;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import p008bq.C54532p1;
import p21.C100616a;
import pl3.C100823c;
import s21.C101496a;
import s21.C101498c;
import t21.C101714c;
import u21.C101939a;
import u21.C101940b;
import u21.C101941c;
import u21.C101955g;
import u21.C101957i;
import v21.C102125b;
import v21.C102132i;
import w21.C102308f;
import w21.C102310h;
import w21.C102313k;
import w21.C102314l;
import w21.C102323t;
import w21.C102324u;

/* renamed from: com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText */
public class WXRTEditText extends PasterEditText implements SpanWatcher {

    /* renamed from: A */
    public String f268127A = "";

    /* renamed from: B */
    public Spannable f268128B;

    /* renamed from: C */
    public int f268129C = 0;

    /* renamed from: D */
    public WXRTEditText f268130D = null;

    /* renamed from: E */
    public boolean f268131E = false;

    /* renamed from: F */
    public RecyclerView.C16631z f268132F;

    /* renamed from: G */
    public boolean f268133G;

    /* renamed from: H */
    public boolean f268134H;

    /* renamed from: I */
    public boolean f268135I = false;

    /* renamed from: J */
    public boolean f268136J;

    /* renamed from: K */
    public C101957i f268137K;

    /* renamed from: L */
    public boolean f268138L = false;

    /* renamed from: M */
    public int f268139M = 0;

    /* renamed from: N */
    public boolean f268140N = false;

    /* renamed from: P */
    public int f268141P = -1;

    /* renamed from: Q */
    public Paint f268142Q = null;

    /* renamed from: Q0 */
    public int f268143Q0 = 0;

    /* renamed from: R */
    public MTimerHandler f268144R = null;

    /* renamed from: S */
    public C102125b f268145S = null;

    /* renamed from: T */
    public boolean f268146T = false;

    /* renamed from: U */
    public Path f268147U = null;

    /* renamed from: V */
    public int f268148V = -1;

    /* renamed from: W */
    public int f268149W = -1;

    /* renamed from: p0 */
    public int f268150p0 = -1;

    /* renamed from: s */
    public C101714c f268151s;

    /* renamed from: t */
    public int f268152t = -1;

    /* renamed from: u */
    public int f268153u = -1;

    /* renamed from: v */
    public boolean f268154v = false;

    /* renamed from: w */
    public boolean f268155w;

    /* renamed from: x */
    public int f268156x;

    /* renamed from: x0 */
    public boolean f268157x0 = false;

    /* renamed from: y */
    public int f268158y;

    /* renamed from: y0 */
    public TextWatcher f268159y0 = new C93081b();

    /* renamed from: z */
    public String f268160z;

    /* renamed from: com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText$a */
    public class C93080a implements ActionMode.Callback {
        public C93080a(WXRTEditText wXRTEditText) {
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

    /* renamed from: com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText$b */
    public class C93081b implements TextWatcher {
        public C93081b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
            if ((r1 + "\n").equals(r14) == false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
            if (r1.equals(r14) != false) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
            if (((android.text.style.ParagraphStyle[]) r13.f268161d.getText().getSpans(r1.length(), r1.length(), android.text.style.ParagraphStyle.class)).length <= 0) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
            r0 = r13.f268161d.getSelectionStart();
            r2 = r13.f268161d;
            r2.f268155w = true;
            r2.getText().append("\n");
            r2 = r13.f268161d;
            r2.f268155w = false;
            r2.setSelection(r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void afterTextChanged(android.text.Editable r14) {
            /*
                r13 = this;
                monitor-enter(r13)
                java.lang.String r0 = "noteeditor.WXRTEditText"
                java.lang.String r1 = "afterTextChanged"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)     // Catch:{ all -> 0x00e2 }
                java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x00e2 }
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                java.lang.String r1 = r0.f268127A     // Catch:{ all -> 0x00e2 }
                if (r1 != 0) goto L_0x0015
                java.lang.String r1 = ""
            L_0x0015:
                int r2 = r0.f268129C     // Catch:{ all -> 0x00e2 }
                if (r2 == 0) goto L_0x001d
                java.lang.String r2 = ""
                r0.f268127A = r2     // Catch:{ all -> 0x00e2 }
            L_0x001d:
                boolean r2 = r0.f268155w     // Catch:{ all -> 0x00e2 }
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x009b
                u21.g r0 = r0.getSelection()     // Catch:{ all -> 0x00e2 }
                int r0 = r0.f300151d     // Catch:{ all -> 0x00e2 }
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r2 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                u21.g r2 = r2.getSelection()     // Catch:{ all -> 0x00e2 }
                int r2 = r2.f300152e     // Catch:{ all -> 0x00e2 }
                if (r0 != r2) goto L_0x009b
                java.lang.String r0 = "\n"
                boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x00e2 }
                if (r0 != 0) goto L_0x0052
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
                r0.<init>()     // Catch:{ all -> 0x00e2 }
                r0.append(r1)     // Catch:{ all -> 0x00e2 }
                java.lang.String r2 = "\n"
                r0.append(r2)     // Catch:{ all -> 0x00e2 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e2 }
                boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x00e2 }
                if (r0 != 0) goto L_0x0068
            L_0x0052:
                java.lang.String r0 = "\n"
                boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x00e2 }
                if (r0 == 0) goto L_0x009b
                java.lang.String r0 = "\n\n"
                boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x00e2 }
                if (r0 != 0) goto L_0x009b
                boolean r0 = r1.equals(r14)     // Catch:{ all -> 0x00e2 }
                if (r0 == 0) goto L_0x009b
            L_0x0068:
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x00e2 }
                int r2 = r1.length()     // Catch:{ all -> 0x00e2 }
                int r5 = r1.length()     // Catch:{ all -> 0x00e2 }
                java.lang.Class<android.text.style.ParagraphStyle> r6 = android.text.style.ParagraphStyle.class
                java.lang.Object[] r0 = r0.getSpans(r2, r5, r6)     // Catch:{ all -> 0x00e2 }
                android.text.style.ParagraphStyle[] r0 = (android.text.style.ParagraphStyle[]) r0     // Catch:{ all -> 0x00e2 }
                int r0 = r0.length     // Catch:{ all -> 0x00e2 }
                if (r0 <= 0) goto L_0x009b
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                int r0 = r0.getSelectionStart()     // Catch:{ all -> 0x00e2 }
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r2 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                r2.f268155w = r4     // Catch:{ all -> 0x00e2 }
                android.text.Editable r2 = r2.getText()     // Catch:{ all -> 0x00e2 }
                java.lang.String r5 = "\n"
                r2.append(r5)     // Catch:{ all -> 0x00e2 }
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r2 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                r2.f268155w = r3     // Catch:{ all -> 0x00e2 }
                r2.setSelection(r0)     // Catch:{ all -> 0x00e2 }
            L_0x009b:
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                t21.c r2 = r0.f268151s     // Catch:{ all -> 0x00e2 }
                if (r2 == 0) goto L_0x00cf
                boolean r0 = r0.f268155w     // Catch:{ all -> 0x00e2 }
                if (r0 != 0) goto L_0x00cf
                boolean r0 = r1.equals(r14)     // Catch:{ all -> 0x00e2 }
                if (r0 != 0) goto L_0x00cf
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                android.text.Spannable r8 = r0.mo127554t()     // Catch:{ all -> 0x00e2 }
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                r0.f268127A = r14     // Catch:{ all -> 0x00e2 }
                t21.c r14 = r0.f268151s     // Catch:{ all -> 0x00e2 }
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r6 = r0.f268130D     // Catch:{ all -> 0x00e2 }
                android.text.Spannable r7 = r0.f268128B     // Catch:{ all -> 0x00e2 }
                int r9 = r0.f268156x     // Catch:{ all -> 0x00e2 }
                int r10 = r0.f268158y     // Catch:{ all -> 0x00e2 }
                int r11 = r0.getSelectionStart()     // Catch:{ all -> 0x00e2 }
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r0 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                int r12 = r0.getSelectionEnd()     // Catch:{ all -> 0x00e2 }
                r5 = r14
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.b r5 = (com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b) r5     // Catch:{ all -> 0x00e2 }
                r5.mo127571e(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e2 }
            L_0x00cf:
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r14 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                r14.f268136J = r4     // Catch:{ all -> 0x00e2 }
                r14.getClass()     // Catch:{ all -> 0x00e2 }
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r14 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                r14.setParagraphsAreUp2Date(r3)     // Catch:{ all -> 0x00e2 }
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r14 = com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.this     // Catch:{ all -> 0x00e2 }
                r14.mo127544r()     // Catch:{ all -> 0x00e2 }
                monitor-exit(r13)
                return
            L_0x00e2:
                r14 = move-exception
                monitor-exit(r13)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.C93081b.afterTextChanged(android.text.Editable):void");
        }

        public synchronized void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            WXRTEditText wXRTEditText = WXRTEditText.this;
            String str = wXRTEditText.f268160z;
            if (str == null) {
                str = "";
            }
            if (!wXRTEditText.f268155w && !charSequence.toString().equals(str)) {
                WXRTEditText wXRTEditText2 = WXRTEditText.this;
                wXRTEditText2.f268156x = wXRTEditText2.getSelectionStart();
                WXRTEditText wXRTEditText3 = WXRTEditText.this;
                wXRTEditText3.f268158y = wXRTEditText3.getSelectionEnd();
                WXRTEditText.this.f268160z = charSequence.toString();
                WXRTEditText wXRTEditText4 = WXRTEditText.this;
                wXRTEditText4.f268127A = wXRTEditText4.f268160z;
                wXRTEditText4.f268128B = wXRTEditText4.mo127554t();
            }
        }

        public synchronized void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            WXRTEditText.this.f268136J = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText$c */
    public class C93082c implements MTimerHandler.CallBack {
        public C93082c() {
        }

        public boolean onTimerExpired() {
            C102125b bVar = WXRTEditText.this.f268145S;
            if (bVar != null && bVar.mo141641a() == 1) {
                WXRTEditText wXRTEditText = WXRTEditText.this;
                int i = wXRTEditText.f268145S.f300726f;
                wXRTEditText.mo127524B();
                WXRTEditText.this.mo127559y(i, false);
            }
            return true;
        }
    }

    public WXRTEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo127557w();
    }

    private C101957i getRTLayout() {
        C101957i iVar;
        synchronized (this) {
            if (this.f268137K == null || this.f268136J) {
                this.f268137K = new C101957i(getText());
                this.f268136J = false;
            }
            iVar = this.f268137K;
        }
        return iVar;
    }

    /* access modifiers changed from: private */
    public synchronized void setParagraphsAreUp2Date(boolean z) {
        if (!this.f268134H) {
            this.f268133G = z;
        }
    }

    /* renamed from: A */
    public synchronized void mo127523A() {
        this.f268155w = false;
    }

    /* renamed from: B */
    public final void mo127524B() {
        C102125b bVar = this.f268145S;
        if (bVar == null) {
            this.f268145S = new C102125b();
            return;
        }
        bVar.f300721a = 0;
        bVar.f300722b = -1.0f;
        bVar.f300723c = -1.0f;
        bVar.f300724d = -1.0f;
        bVar.f300725e = -1.0f;
        bVar.f300726f = -1;
        bVar.f300727g = -1.0f;
        bVar.f300728h = -1.0f;
        bVar.f300729i = -1.0f;
        bVar.f300730j = -1.0f;
        bVar.f300731k = -1;
    }

    /* renamed from: C */
    public final void mo127525C() {
        MTimerHandler mTimerHandler = this.f268144R;
        if (mTimerHandler == null) {
            this.f268144R = new MTimerHandler(new C93082c(), false);
        } else {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: D */
    public final void mo127526D(int i, int i2) {
        int i3 = this.f268129C;
        if (i3 == 2) {
            C102132i h = C102132i.m134538h();
            int i4 = this.f268141P;
            h.mo141673v(i4, 1, i4, 1);
        } else if (i3 == 1) {
            C102132i h2 = C102132i.m134538h();
            int i5 = this.f268141P;
            h2.mo141673v(i5, 0, i5, 0);
        } else {
            C102132i h3 = C102132i.m134538h();
            int i6 = this.f268141P;
            h3.mo141673v(i6, i, i6, i2);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public C102313k[] getCurrentEditorCursorNumberSpan() {
        C101955g paragraphsInSelection = getParagraphsInSelection();
        return (C102313k[]) getText().getSpans(paragraphsInSelection.f300151d, paragraphsInSelection.f300152e, C102313k.class);
    }

    public String getCurrentEditorCursorParagraphStr() {
        C101955g paragraphsInSelection = getParagraphsInSelection();
        return getText().subSequence(paragraphsInSelection.f300151d, paragraphsInSelection.f300152e).toString().trim();
    }

    public int getEditTextType() {
        return this.f268129C;
    }

    public ArrayList<C102314l> getParagraphs() {
        return getRTLayout().f300159e;
    }

    public C101955g getParagraphsInSelection() {
        C101957i rTLayout = getRTLayout();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart > selectionEnd) {
            int i = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i;
        }
        int a = rTLayout.mo141481a(selectionStart);
        int i2 = 0;
        if (!(selectionStart == selectionEnd)) {
            selectionEnd--;
        }
        int a2 = rTLayout.mo141481a(selectionEnd);
        int i3 = rTLayout.f300158d;
        int i4 = (i3 == 0 || a < 0) ? 0 : a < i3 ? rTLayout.f300159e.get(a).f300151d : rTLayout.f300159e.get(i3 - 1).f300152e - 1;
        int i5 = rTLayout.f300158d;
        if (i5 != 0 && a2 >= 0) {
            i2 = a2 < i5 ? rTLayout.f300159e.get(a2).f300152e : rTLayout.f300159e.get(i5 - 1).f300152e - 1;
        }
        return new C101955g(i4, i2);
    }

    public int getPosInDataList() {
        return this.f268141P;
    }

    public int getRecyclerItemPosition() {
        if (this.f268132F.mo17364k() == -1) {
            return 0;
        }
        return this.f268132F.mo17364k();
    }

    public String getSelectedText() {
        int i;
        Editable text = getText();
        C101955g selection = getSelection();
        if (selection.f300151d < 0 || (i = selection.f300152e) < 0 || i > text.length()) {
            return null;
        }
        return text.subSequence(selection.f300151d, selection.f300152e).toString();
    }

    public C101955g getSelection() {
        return new C101955g(getSelectionStart(), getSelectionEnd());
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
            boolean r0 = v21.C102132i.f300744K
            if (r0 == 0) goto L_0x01ef
            int r0 = r1.f268129C
            if (r0 == 0) goto L_0x000c
            goto L_0x01ef
        L_0x000c:
            android.text.Editable r0 = r22.getText()
            if (r0 != 0) goto L_0x0014
            goto L_0x01ef
        L_0x0014:
            v21.i r2 = v21.C102132i.m134538h()
            v21.d r2 = r2.mo141663l()
            v21.i r3 = v21.C102132i.m134538h()
            int r4 = r1.f268141P
            int r3 = r3.mo141659g(r4)
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
            int r2 = r2.f300736b
            int r3 = r0.length()
            r7 = 0
            goto L_0x004a
        L_0x003f:
            int r2 = r2.f300738d
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
            int r3 = r2.f300736b
            int r2 = r2.f300738d
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
            int r9 = r1.f268148V
            if (r9 != r4) goto L_0x0079
            int r9 = r22.getPaddingLeft()
            r1.f268148V = r9
        L_0x0079:
            int r9 = r1.f268149W
            if (r9 != r4) goto L_0x0083
            int r9 = r22.getPaddingTop()
            r1.f268149W = r9
        L_0x0083:
            int r9 = r1.f268150p0
            if (r9 != r4) goto L_0x008d
            int r4 = r22.getPaddingBottom()
            r1.f268150p0 = r4
        L_0x008d:
            android.graphics.Path r4 = r1.f268147U
            if (r4 != 0) goto L_0x0098
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r1.f268147U = r4
        L_0x0098:
            android.graphics.Path r4 = r1.f268147U
            r4.reset()
            int r4 = r0.getLineForOffset(r3)     // Catch:{ Exception -> 0x01de }
            int r9 = r0.getLineForOffset(r2)     // Catch:{ Exception -> 0x01de }
            if (r4 <= r9) goto L_0x00a9
            goto L_0x01ef
        L_0x00a9:
            int r10 = r0.getWidth()     // Catch:{ Exception -> 0x01de }
            float r3 = r0.getPrimaryHorizontal(r3)     // Catch:{ Exception -> 0x01de }
            int r11 = r1.f268148V     // Catch:{ Exception -> 0x01de }
            float r11 = (float) r11     // Catch:{ Exception -> 0x01de }
            float r13 = r3 + r11
            int r3 = r0.getLineTop(r4)     // Catch:{ Exception -> 0x01de }
            int r11 = r1.f268149W     // Catch:{ Exception -> 0x01de }
            int r3 = r3 + r11
            float r14 = (float) r3     // Catch:{ Exception -> 0x01de }
            int r3 = r0.getLineBottom(r4)     // Catch:{ Exception -> 0x01de }
            int r11 = r1.f268149W     // Catch:{ Exception -> 0x01de }
            int r3 = r3 + r11
            float r3 = (float) r3     // Catch:{ Exception -> 0x01de }
            float r2 = r0.getPrimaryHorizontal(r2)     // Catch:{ Exception -> 0x01de }
            int r11 = r1.f268148V     // Catch:{ Exception -> 0x01de }
            float r11 = (float) r11     // Catch:{ Exception -> 0x01de }
            float r2 = r2 + r11
            int r11 = r0.getLineTop(r9)     // Catch:{ Exception -> 0x01de }
            int r12 = r1.f268149W     // Catch:{ Exception -> 0x01de }
            int r11 = r11 + r12
            float r11 = (float) r11     // Catch:{ Exception -> 0x01de }
            int r0 = r0.getLineBottom(r9)     // Catch:{ Exception -> 0x01de }
            int r12 = r1.f268149W     // Catch:{ Exception -> 0x01de }
            int r0 = r0 + r12
            float r0 = (float) r0     // Catch:{ Exception -> 0x01de }
            if (r7 == 0) goto L_0x00fb
            if (r8 == 0) goto L_0x00fb
            android.graphics.Path r15 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            int r2 = r1.f268148V     // Catch:{ Exception -> 0x01de }
            float r3 = (float) r2     // Catch:{ Exception -> 0x01de }
            r17 = 0
            int r2 = r2 + r10
            float r2 = (float) r2     // Catch:{ Exception -> 0x01de }
            int r4 = r1.f268150p0     // Catch:{ Exception -> 0x01de }
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
            android.graphics.Path r15 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            int r3 = r1.f268148V     // Catch:{ Exception -> 0x01de }
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
            android.graphics.Path r12 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            int r2 = r1.f268148V     // Catch:{ Exception -> 0x01de }
            int r2 = r2 + r10
            float r15 = (float) r2     // Catch:{ Exception -> 0x01de }
            int r2 = r1.f268150p0     // Catch:{ Exception -> 0x01de }
            float r2 = (float) r2     // Catch:{ Exception -> 0x01de }
            float r16 = r0 + r2
            android.graphics.Path$Direction r17 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r12.addRect(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01de }
            goto L_0x01b9
        L_0x0127:
            android.graphics.Path r12 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r17 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r15 = r2
            r16 = r0
            r12.addRect(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01de }
            goto L_0x01b9
        L_0x0133:
            if (r7 == 0) goto L_0x015c
            android.graphics.Path r15 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            int r7 = r1.f268148V     // Catch:{ Exception -> 0x01de }
            float r8 = (float) r7     // Catch:{ Exception -> 0x01de }
            r17 = 0
            int r7 = r7 + r10
            float r7 = (float) r7     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r20 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r8
            r18 = r7
            r19 = r3
            r15.addRect(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01de }
            android.graphics.Path r15 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            int r7 = r1.f268148V     // Catch:{ Exception -> 0x01de }
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
            android.graphics.Path r12 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            int r2 = r1.f268148V     // Catch:{ Exception -> 0x01de }
            int r2 = r2 + r10
            float r15 = (float) r2     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r17 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r3
            r12.addRect(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01de }
            android.graphics.Path r15 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            int r2 = r1.f268148V     // Catch:{ Exception -> 0x01de }
            float r7 = (float) r2     // Catch:{ Exception -> 0x01de }
            int r2 = r2 + r10
            float r2 = (float) r2     // Catch:{ Exception -> 0x01de }
            int r8 = r1.f268150p0     // Catch:{ Exception -> 0x01de }
            float r8 = (float) r8     // Catch:{ Exception -> 0x01de }
            float r19 = r0 + r8
            android.graphics.Path$Direction r20 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r7
            r17 = r11
            r18 = r2
            r15.addRect(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01de }
            goto L_0x01a2
        L_0x0183:
            android.graphics.Path r12 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            int r7 = r1.f268148V     // Catch:{ Exception -> 0x01de }
            int r7 = r7 + r10
            float r15 = (float) r7     // Catch:{ Exception -> 0x01de }
            android.graphics.Path$Direction r17 = android.graphics.Path.Direction.CW     // Catch:{ Exception -> 0x01de }
            r16 = r3
            r12.addRect(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01de }
            android.graphics.Path r15 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            int r7 = r1.f268148V     // Catch:{ Exception -> 0x01de }
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
            android.graphics.Path r15 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            int r0 = r1.f268148V     // Catch:{ Exception -> 0x01de }
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
            android.graphics.Path r0 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x01de }
            if (r0 != 0) goto L_0x01ef
            android.graphics.Paint r0 = r1.f268142Q     // Catch:{ Exception -> 0x01de }
            if (r0 != 0) goto L_0x01d2
            android.graphics.Paint r0 = new android.graphics.Paint     // Catch:{ Exception -> 0x01de }
            r0.<init>(r5)     // Catch:{ Exception -> 0x01de }
            r1.f268142Q = r0     // Catch:{ Exception -> 0x01de }
            r2 = 1347529272(0x5051aa38, float:1.40703744E10)
            r0.setColor(r2)     // Catch:{ Exception -> 0x01de }
        L_0x01d2:
            android.graphics.Path r0 = r1.f268147U     // Catch:{ Exception -> 0x01de }
            android.graphics.Paint r2 = r1.f268142Q     // Catch:{ Exception -> 0x01de }
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.onDraw(android.graphics.Canvas):void");
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        this.f268157x0 = false;
        this.f268152t = -1;
        this.f268153u = -1;
        super.onFocusChanged(z, i, rect);
        C101714c cVar = this.f268151s;
        if (cVar != null) {
            int recyclerItemPosition = getRecyclerItemPosition();
            C93083b bVar = (C93083b) cVar;
            synchronized (bVar) {
                EditorUI editorUI = (EditorUI) bVar.f268166b;
                editorUI.getClass();
                editorUI.mo127482Q7(this, z, recyclerItemPosition);
            }
        }
        if (z && !this.f268157x0) {
            onSelectionChanged(getSelectionStart(), getSelectionEnd());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        if (r12.f268152t != r13) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        if (r12.f268153u == r14) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0016, code lost:
        r12.f268152t = r13;
        r12.f268153u = r14;
        super.onSelectionChanged(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r12.f268133G != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r12.f268134H = true;
        w21.C102324u.m134968b(r12, new w21.C102323t[0]);
        r12.f268134H = false;
        setParagraphsAreUp2Date(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r1 = r12.f268151s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r1 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        r12.f268135I = true;
        r1 = (com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r1.f268168d != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r3 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r1.f268166b;
        r3.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (java.lang.Math.abs(r14 - r13) < 1) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        r3.f268053r = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (getEditTextType() != 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        r3 = w21.C102324u.f301367f.iterator();
        r4 = false;
        r5 = false;
        r6 = false;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        if (r3.hasNext() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        r8 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if ((!r8.mo141859d(getText(), r8.mo141858c(r12), w21.C102320q.f301352e).isEmpty()) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        if ((r8 instanceof w21.C102304b) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        if ((r8 instanceof w21.C102305c) == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        if ((r8 instanceof w21.C102312j) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0095, code lost:
        if ((r8 instanceof w21.C102321r) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0099, code lost:
        r4 = false;
        r5 = false;
        r6 = false;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        r3 = (x21.C102538a) r1.f268167c;
        r3.f301929t = r7;
        r3.f301923n.setPressed(r7);
        r3 = (x21.C102538a) r1.f268167c;
        r3.f301926q = r4;
        r3.f301919j.setPressed(r4);
        r3 = (x21.C102538a) r1.f268167c;
        r3.f301927r = r5;
        r3.f301920k.setPressed(r5);
        r1 = (x21.C102538a) r1.f268167c;
        r1.f301928s = r6;
        r1.f301922m.setPressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c9, code lost:
        r12.f268135I = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cd, code lost:
        if (v21.C102132i.f300744K == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        if (r12.f268146T != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d7, code lost:
        if (hasFocus() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00db, code lost:
        if (r12.f268141P < 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00dd, code lost:
        mo127526D(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ea, code lost:
        if (v21.C102132i.m134538h().mo141659g(r12.f268141P) != 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ec, code lost:
        r13 = v21.C102132i.m134538h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        if (v21.C102132i.f300744K != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f4, code lost:
        r13.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f8, code lost:
        r13.mo141651E(true, 0);
        r13.mo141665n();
        r13.mo141667p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0008, code lost:
        r12.f268157x0 = true;
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
            boolean r0 = r12.f268154v     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r12)     // Catch:{ all -> 0x0104 }
            return
        L_0x0007:
            monitor-exit(r12)     // Catch:{ all -> 0x0104 }
            r0 = 1
            r12.f268157x0 = r0
            if (r13 >= 0) goto L_0x000e
            return
        L_0x000e:
            int r1 = r12.f268152t
            if (r1 != r13) goto L_0x0016
            int r1 = r12.f268153u
            if (r1 == r14) goto L_0x00cb
        L_0x0016:
            r12.f268152t = r13
            r12.f268153u = r14
            super.onSelectionChanged(r13, r14)
            boolean r1 = r12.f268133G
            r2 = 0
            if (r1 != 0) goto L_0x002e
            r12.f268134H = r0
            w21.t[] r1 = new w21.C102323t[r2]
            w21.C102324u.m134968b(r12, r1)
            r12.f268134H = r2
            r12.setParagraphsAreUp2Date(r0)
        L_0x002e:
            t21.c r1 = r12.f268151s
            if (r1 == 0) goto L_0x00cb
            r12.f268135I = r0
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.b r1 = (com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b) r1
            boolean r3 = r1.f268168d
            if (r3 != 0) goto L_0x003c
            goto L_0x00c9
        L_0x003c:
            r21.a r3 = r1.f268166b
            com.tencent.mm.plugin.component.editor.EditorUI r3 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r3
            r3.getClass()
            int r4 = r14 - r13
            int r4 = java.lang.Math.abs(r4)
            if (r4 < r0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            r3.f268053r = r4
            int r3 = r12.getEditTextType()
            if (r3 != 0) goto L_0x0099
            java.util.ArrayList<w21.t> r3 = w21.C102324u.f301367f
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0060:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x009d
            java.lang.Object r8 = r3.next()
            w21.t r8 = (w21.C102323t) r8
            u21.g r9 = r8.mo141858c(r12)
            android.text.Editable r10 = r12.getText()
            w21.q r11 = w21.C102320q.SPAN_FLAGS
            java.util.ArrayList r9 = r8.mo141859d(r10, r9, r11)
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r0
            if (r9 == 0) goto L_0x0060
            boolean r9 = r8 instanceof w21.C102304b
            if (r9 == 0) goto L_0x0087
            r7 = 1
            goto L_0x0060
        L_0x0087:
            boolean r9 = r8 instanceof w21.C102305c
            if (r9 == 0) goto L_0x008d
            r4 = 1
            goto L_0x0060
        L_0x008d:
            boolean r9 = r8 instanceof w21.C102312j
            if (r9 == 0) goto L_0x0093
            r5 = 1
            goto L_0x0060
        L_0x0093:
            boolean r8 = r8 instanceof w21.C102321r
            if (r8 == 0) goto L_0x0060
            r6 = 1
            goto L_0x0060
        L_0x0099:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x009d:
            t21.b r3 = r1.f268167c
            x21.a r3 = (x21.C102538a) r3
            r3.f301929t = r7
            android.widget.LinearLayout r3 = r3.f301923n
            r3.setPressed(r7)
            t21.b r3 = r1.f268167c
            x21.a r3 = (x21.C102538a) r3
            r3.f301926q = r4
            android.widget.LinearLayout r3 = r3.f301919j
            r3.setPressed(r4)
            t21.b r3 = r1.f268167c
            x21.a r3 = (x21.C102538a) r3
            r3.f301927r = r5
            android.widget.LinearLayout r3 = r3.f301920k
            r3.setPressed(r5)
            t21.b r1 = r1.f268167c
            x21.a r1 = (x21.C102538a) r1
            r1.f301928s = r6
            android.widget.LinearLayout r1 = r1.f301922m
            r1.setPressed(r6)
        L_0x00c9:
            r12.f268135I = r2
        L_0x00cb:
            boolean r1 = v21.C102132i.f300744K
            if (r1 == 0) goto L_0x0103
            boolean r1 = r12.f268146T
            if (r1 != 0) goto L_0x0103
            boolean r1 = r12.hasFocus()
            if (r1 == 0) goto L_0x0103
            int r1 = r12.f268141P
            if (r1 < 0) goto L_0x0103
            r12.mo127526D(r13, r14)
            v21.i r13 = v21.C102132i.m134538h()
            int r14 = r12.f268141P
            int r13 = r13.mo141659g(r14)
            if (r13 != r0) goto L_0x0103
            v21.i r13 = v21.C102132i.m134538h()
            boolean r14 = v21.C102132i.f300744K
            if (r14 != 0) goto L_0x00f8
            r13.getClass()
            goto L_0x0103
        L_0x00f8:
            r1 = 0
            r13.mo141651E(r0, r1)
            r13.mo141665n()
            r13.mo141667p()
        L_0x0103:
            return
        L_0x0104:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0104 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.onSelectionChanged(int, int):void");
    }

    public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if ((obj instanceof C102310h) && (obj instanceof ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if ((obj instanceof C102310h) && (obj instanceof ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if ((obj instanceof C102310h) && (obj instanceof ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    public boolean onTextContextMenuItem(int i) {
        if (i == 16908319) {
            EditorUI editorUI = (EditorUI) ((C93083b) this.f268151s).f268166b;
            editorUI.getClass();
            if (!editorUI.f268045g.f301924o) {
                editorUI.mo127481O7();
                editorUI.f268052q.postDelayed(new C93087p(editorUI, editorUI.getContext()), 400);
            }
            return true;
        }
        boolean z = false;
        if (i == 16908321 || i == 16908320) {
            C101940b.m134168a();
        } else if (i == 16908322) {
            int c = C101940b.m134170c(getContext());
            if (c == 2) {
                C101940b.m134168a();
            } else if (c == 3) {
                EditorUI editorUI2 = (EditorUI) ((C93083b) this.f268151s).f268166b;
                editorUI2.getClass();
                ArrayList<C100616a> arrayList = C101940b.f300115b;
                if (arrayList != null && arrayList.size() > 0) {
                    z = true;
                }
                if (z) {
                    ArrayList<C100616a> b = C101940b.m134169b();
                    if (C101941c.m134173q().mo141451g(b)) {
                        editorUI2.mo127486U7();
                    } else {
                        C101941c.m134173q().mo141462s(b, this, true, true, true, false, false);
                        int recyclerItemPosition = getRecyclerItemPosition();
                        C101941c.m134173q().mo141448d(recyclerItemPosition, b.size() + recyclerItemPosition + 1, true);
                        editorUI2.mo127481O7();
                        if (editorUI2.f268049n) {
                            C102132i.m134538h().mo141655c();
                        }
                    }
                }
                return true;
            }
        }
        try {
            boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
            if (i == 16908322) {
                this.f268143Q0 = 0;
                Editable text = getText();
                try {
                    mo127560z(text);
                } catch (IndexOutOfBoundsException e) {
                    IndexOutOfBoundsException indexOutOfBoundsException = e;
                    Log.m105921e("noteeditor.WXRTEditText", "!!MMEditText Exception %d", Integer.valueOf(this.f268143Q0));
                    if (this.f268143Q0 < 3) {
                        this.f268143Q0++;
                        mo127560z(new SpannableStringBuilder(TextUtils.concat(new CharSequence[]{" ", text})));
                    } else {
                        throw indexOutOfBoundsException;
                    }
                }
            }
            if (i == 16908322 && this.f268131E) {
                C101714c cVar = this.f268151s;
                if (cVar != null) {
                    ((C93083b) cVar).mo127574h(false, 0);
                    ((C93083b) this.f268151s).mo127573g(0, 0);
                }
                this.f268131E = false;
            }
            return onTextContextMenuItem;
        } catch (NullPointerException e2) {
            Log.m105921e("noteeditor.WXRTEditText", "!!MMEditText NullPointerException %s", e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = v21.C102132i.f300744K
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x01a8
            android.text.Editable r0 = r11.getText()
            if (r0 != 0) goto L_0x0011
            r11.mo127524B()
            return r1
        L_0x0011:
            int r4 = r0.length()
            float r5 = r12.getX()
            float r6 = r12.getY()
            int r5 = r11.getOffsetForPosition(r5, r6)
            if (r4 < 0) goto L_0x01a4
            if (r5 < 0) goto L_0x01a4
            if (r5 <= r4) goto L_0x0029
            goto L_0x01a4
        L_0x0029:
            int r4 = r12.getAction()
            r6 = 0
            if (r4 == 0) goto L_0x011d
            if (r4 == r1) goto L_0x003f
            r12 = 3
            if (r4 == r12) goto L_0x0037
            goto L_0x01a3
        L_0x0037:
            r11.mo127524B()
            r11.mo127525C()
            goto L_0x01a3
        L_0x003f:
            r11.mo127525C()
            v21.b r0 = r11.f268145S
            if (r0 != 0) goto L_0x0048
            goto L_0x01a3
        L_0x0048:
            float r4 = r12.getRawX()
            float r7 = r12.getRawY()
            float r8 = r12.getX()
            float r12 = r12.getY()
            r0.f300727g = r4
            r0.f300728h = r7
            r0.f300729i = r8
            r0.f300730j = r12
            int r12 = r0.f300721a
            if (r12 != r1) goto L_0x0067
            r0.f300731k = r5
            goto L_0x0069
        L_0x0067:
            r0.f300731k = r6
        L_0x0069:
            v21.b r12 = r11.f268145S
            int r12 = r12.mo141641a()
            r11.mo127524B()
            r0 = 2
            if (r12 != r0) goto L_0x01a3
            v21.i r12 = v21.C102132i.m134538h()
            boolean r0 = v21.C102132i.f300744K
            if (r0 == 0) goto L_0x0083
            boolean r12 = r12.f300754a
            if (r12 == 0) goto L_0x0086
            r12 = 1
            goto L_0x0087
        L_0x0083:
            r12.getClass()
        L_0x0086:
            r12 = 0
        L_0x0087:
            r7 = 50
            if (r12 == 0) goto L_0x00d0
            boolean r12 = r11.hasFocus()
            if (r12 == 0) goto L_0x00a6
            int r12 = r11.getSelectionStart()
            int r0 = r11.getSelectionEnd()
            if (r12 != r0) goto L_0x00a4
            int r12 = r11.getSelectionStart()
            if (r5 != r12) goto L_0x00a4
            r12 = 1
            r0 = 1
            goto L_0x00ab
        L_0x00a4:
            r12 = 1
            goto L_0x00aa
        L_0x00a6:
            r11.requestFocus()
            r12 = 0
        L_0x00aa:
            r0 = 0
        L_0x00ab:
            r11.setIgnoreSelectChangeByMultiSelect(r1)
            r11.setSelection(r5)
            r11.setIgnoreSelectChangeByMultiSelect(r6)
            t21.c r4 = r11.f268151s
            if (r4 == 0) goto L_0x00c4
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.b r4 = (com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b) r4
            r4.mo127574h(r1, r7)
            t21.c r4 = r11.f268151s
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.b r4 = (com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b) r4
            r4.mo127573g(r1, r2)
        L_0x00c4:
            r11.mo127526D(r5, r5)
            v21.i r2 = v21.C102132i.m134538h()
            r2.mo141647A(r12, r0, r7)
            goto L_0x01a3
        L_0x00d0:
            v21.i r12 = v21.C102132i.m134538h()
            v21.d r12 = r12.mo141663l()
            v21.i r0 = v21.C102132i.m134538h()
            android.widget.PopupWindow r0 = r0.f300771r
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x00e8
            r0 = 1
            goto L_0x00e9
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            if (r0 == 0) goto L_0x00fc
            int r0 = r12.mo141642a()
            if (r0 != r1) goto L_0x00fc
            int r0 = r12.f300735a
            int r2 = r11.f268141P
            if (r0 != r2) goto L_0x00fc
            int r12 = r12.f300736b
            if (r12 != r5) goto L_0x00fc
            r6 = 1
        L_0x00fc:
            r11.mo127526D(r5, r5)
            v21.i r12 = v21.C102132i.m134538h()
            boolean r0 = v21.C102132i.f300744K
            if (r0 != 0) goto L_0x010c
            r12.getClass()
            goto L_0x01a3
        L_0x010c:
            r12.mo141665n()
            r12.mo141667p()
            r12.mo141651E(r1, r7)
            r12.mo141675x(r1)
            r12.mo141677z(r6)
            goto L_0x01a3
        L_0x011d:
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
            java.lang.Class<w21.s> r10 = w21.C102322s.class
            java.lang.Object[] r7 = r8.getSpans(r7, r9, r10)
            w21.s[] r7 = (w21.C102322s[]) r7
            v21.i r8 = v21.C102132i.m134538h()
            boolean r9 = v21.C102132i.f300744K
            if (r9 == 0) goto L_0x0150
            boolean r8 = r8.f300754a
            if (r8 == 0) goto L_0x0153
            r8 = 1
            goto L_0x0154
        L_0x0150:
            r8.getClass()
        L_0x0153:
            r8 = 0
        L_0x0154:
            if (r8 == 0) goto L_0x0178
            int r8 = u21.C101956h.m134205b()
            if (r4 >= r8) goto L_0x0178
            int r4 = r7.length
            if (r4 == 0) goto L_0x0178
            java.lang.String r2 = "noteeditor.WXRTEditText"
            java.lang.String r3 = "clicked todo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            t21.c r2 = r11.f268151s
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.b r2 = (com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b) r2
            r21.a r2 = r2.f268166b
            com.tencent.mm.plugin.component.editor.EditorUI r2 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r2
            r2.getClass()
            r2 = r7[r6]
            r2.mo141870b(r11, r0, r12, r2)
            goto L_0x01a3
        L_0x0178:
            r11.mo127524B()
            v21.b r0 = r11.f268145S
            float r4 = r12.getRawX()
            float r6 = r12.getRawY()
            float r7 = r12.getX()
            float r12 = r12.getY()
            r0.f300721a = r1
            r0.f300722b = r4
            r0.f300723c = r6
            r0.f300724d = r7
            r0.f300725e = r12
            r0.f300726f = r5
            r11.mo127525C()
            com.tencent.mm.sdk.platformtools.MTimerHandler r12 = r11.f268144R
            r4 = 500(0x1f4, double:2.47E-321)
            r12.startTimer(r4, r2)
        L_0x01a3:
            return r1
        L_0x01a4:
            r11.mo127524B()
            return r1
        L_0x01a8:
            int r0 = r12.getAction()
            if (r0 != r1) goto L_0x01c0
            t21.c r0 = r11.f268151s
            if (r0 == 0) goto L_0x01c0
            r4 = 300(0x12c, double:1.48E-321)
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.b r0 = (com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b) r0
            r0.mo127574h(r1, r4)
            t21.c r0 = r11.f268151s
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.b r0 = (com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b) r0
            r0.mo127573g(r1, r2)
        L_0x01c0:
            boolean r12 = super.onTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public final void mo127544r() {
        Editable text = getText();
        if (text.getSpans(0, text.length(), getClass()) != null) {
            text.setSpan(this, 0, text.length(), 18);
        }
    }

    /* renamed from: s */
    public <V, C extends C102310h<V>> void mo127545s(C102323t<V, C> tVar, V v) {
        if (!this.f268135I) {
            Spannable t = this.f268155w ? null : mo127554t();
            tVar.mo141853a(this, v);
            synchronized (this) {
                if (this.f268151s != null && !this.f268155w) {
                    ((C93083b) this.f268151s).mo127571e(this, t, mo127554t(), getSelectionStart(), getSelectionEnd(), getSelectionStart(), getSelectionEnd());
                }
                this.f268136J = true;
            }
        }
    }

    public void setEditTextType(int i) {
        this.f268129C = i;
    }

    public void setIgnoreSelectChangeByMultiSelect(boolean z) {
        this.f268146T = z;
    }

    public void setMaxHeight(int i) {
        super.setMaxHeight(i);
    }

    public void setPosInDataList(int i) {
        this.f268141P = i;
    }

    public void setRichTextEditing(String str) {
        mo127556v();
        if (!Util.isNullOrNil(str)) {
            setSpannableText(C101496a.m133260a(str));
        } else {
            setText("");
        }
        mo127523A();
    }

    public void setSpannableText(Spanned spanned) {
        mo127556v();
        synchronized (this) {
            this.f268154v = true;
        }
        super.setText(spanned, TextView.BufferType.EDITABLE);
        synchronized (this) {
            this.f268154v = false;
        }
        mo127544r();
        C102324u.m134968b(this, new C102323t[0]);
        mo127523A();
    }

    public void setText(String str) {
        mo127556v();
        super.setText(str);
        mo127523A();
    }

    public void setTextWithoutIgnore(String str) {
        super.setText(str);
    }

    /* renamed from: t */
    public Spannable mo127554t() {
        CharSequence text = super.getText();
        if (text == null) {
            text = "";
        }
        return new C101939a(text);
    }

    /* renamed from: u */
    public String mo127555u(C26891a aVar) {
        return aVar == C26891a.f74780a ? getText().toString() : aVar == C26891a.f74781b ? C101498c.m133261a(getText()) : "";
    }

    /* renamed from: v */
    public synchronized void mo127556v() {
        this.f268155w = true;
    }

    /* renamed from: w */
    public final void mo127557w() {
        this.f268130D = this;
        removeTextChangedListener(this.f268159y0);
        addTextChangedListener(this.f268159y0);
        if (C102308f.f301324a == null) {
            C102308f.f301324a = new C102308f();
        }
        setMovementMethod(C102308f.f301324a);
        this.f268141P = -1;
        Paint paint = new Paint(1);
        this.f268142Q = paint;
        paint.setColor(1347529272);
        this.f268145S = new C102125b();
        this.f268147U = new Path();
        this.f268148V = -1;
        this.f268149W = -1;
        this.f268150p0 = -1;
        if (C102132i.f300744K) {
            setHighlightColor(0);
            setCustomSelectionActionModeCallback(new C93080a(this));
        }
        C100823c.f295336a.mo140272a(this, 1);
    }

    /* renamed from: x */
    public void mo127558x() {
        C101714c cVar = this.f268151s;
        if (cVar != null) {
            ((C93083b) cVar).mo127574h(true, 50);
            ((C93083b) this.f268151s).mo127573g(1, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo127559y(int r10, boolean r11) {
        /*
            r9 = this;
            android.text.Editable r0 = r9.getText()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.text.Layout r1 = r9.getLayout()
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            int r2 = r0.length()
            if (r10 < 0) goto L_0x0084
            if (r10 <= r2) goto L_0x0018
            goto L_0x0084
        L_0x0018:
            r3 = 0
            if (r2 != 0) goto L_0x001e
            r10 = 0
            r11 = 0
            goto L_0x003c
        L_0x001e:
            if (r10 >= r2) goto L_0x002f
            if (r11 != 0) goto L_0x002a
            char r11 = r0.charAt(r10)
            r0 = 10
            if (r11 == r0) goto L_0x003b
        L_0x002a:
            int r11 = r1.getOffsetToRightOf(r10)
            goto L_0x003c
        L_0x002f:
            if (r10 != r2) goto L_0x003b
            if (r11 == 0) goto L_0x003b
            int r11 = r1.getOffsetToLeftOf(r10)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x003c
        L_0x003b:
            r11 = r10
        L_0x003c:
            if (r10 < 0) goto L_0x0084
            if (r10 > r2) goto L_0x0084
            if (r11 < 0) goto L_0x0084
            if (r11 <= r2) goto L_0x0045
            goto L_0x0084
        L_0x0045:
            v21.i r0 = v21.C102132i.m134538h()
            boolean r1 = v21.C102132i.f300744K
            r2 = 1
            if (r1 == 0) goto L_0x0054
            boolean r0 = r0.f300754a
            if (r0 == 0) goto L_0x0057
            r0 = 1
            goto L_0x0058
        L_0x0054:
            r0.getClass()
        L_0x0057:
            r0 = 0
        L_0x0058:
            r4 = 50
            if (r0 == 0) goto L_0x007a
            r9.requestFocus()
            r9.setIgnoreSelectChangeByMultiSelect(r2)
            r9.setSelection(r10, r11)
            r9.setIgnoreSelectChangeByMultiSelect(r3)
            t21.c r0 = r9.f268151s
            if (r0 == 0) goto L_0x007a
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.b r0 = (com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b) r0
            r0.mo127574h(r2, r4)
            t21.c r0 = r9.f268151s
            r6 = 0
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.b r0 = (com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b) r0
            r0.mo127573g(r2, r6)
        L_0x007a:
            r9.mo127526D(r10, r11)
            v21.i r10 = v21.C102132i.m134538h()
            r10.mo141647A(r2, r2, r4)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.mo127559y(int, boolean):void");
    }

    /* renamed from: z */
    public void mo127560z(Spannable spannable) {
        int selectionStart = getSelectionStart();
        setSpannableText(((C54532p1) C86312j.m106911c(C54532p1.class)).mo55776j().mo75395M(getContext(), spannable));
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
        mo127557w();
    }
}
