package yd2;

import android.content.Context;
import android.os.Looper;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.PatSuffixActionReportStruct;
import com.tencent.p014mm.emoji.view.EmojiPanelInputComponent;
import com.tencent.p014mm.p136ui.widget.MMClearEditText;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C31543z5;
import f40.C86709a0;
import g62.C45882k;
import g62.C75880o;
import gy3.C87412m;
import kg3.C76577a;
import nj3.C76879j;
import pe3.C47465a;
import qo3.C89779i0;
import te3.C49070cz2;
import te3.C52085y83;

/* renamed from: yd2.g */
public final class C79076g extends C103422m implements EmojiPanelInputComponent.C68041c, C45882k.C45884b {

    /* renamed from: s */
    public static C79076g f232207s;

    /* renamed from: f */
    public Context f232208f;

    /* renamed from: g */
    public final String f232209g = "MicroMsg.Pat.PatSuffixSettingDialog";

    /* renamed from: h */
    public final int f232210h = 20;

    /* renamed from: i */
    public EmojiPanelInputComponent f232211i;

    /* renamed from: j */
    public String f232212j;

    /* renamed from: n */
    public MMClearEditText f232213n;

    /* renamed from: o */
    public TextView f232214o;

    /* renamed from: p */
    public final C79077a f232215p = new C79077a();

    /* renamed from: q */
    public C89779i0 f232216q;

    /* renamed from: r */
    public final MTimerHandler f232217r = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C15963b(this), false);

    /* renamed from: yd2.g$b */
    public static final class C15963b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C79076g f42859d;

        public C15963b(C79076g gVar) {
            this.f42859d = gVar;
        }

        public final boolean onTimerExpired() {
            Log.m105924i(this.f42859d.f232209g, "errorTimeHandler callback");
            TextView textView = (TextView) this.f42859d.findViewById(C0966R.C0970id.hrl);
            if (textView != null) {
                textView.setText(this.f42859d.f232208f.getString(C0966R.string.hgj));
            }
            if (textView == null) {
                return false;
            }
            textView.setTextColor(C76577a.m92153d(this.f42859d.f232208f, C0966R.color.f3288ma));
            return false;
        }
    }

    /* renamed from: yd2.g$a */
    public final class C79077a implements TextWatcher {
        public C79077a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
            r2 = r2.getPaint();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r10) {
            /*
                r9 = this;
                yd2.g r0 = yd2.C79076g.this
                com.tencent.mm.ui.widget.MMClearEditText r1 = r0.f232213n
                if (r1 == 0) goto L_0x000b
                yd2.g$a r0 = r0.f232215p
                r1.removeTextChangedListener(r0)
            L_0x000b:
                v51.h r0 = new v51.h
                java.lang.String r1 = java.lang.String.valueOf(r10)
                yd2.g r2 = yd2.C79076g.this
                com.tencent.mm.ui.widget.MMClearEditText r2 = r2.f232213n
                r3 = 0
                if (r2 == 0) goto L_0x0024
                android.text.TextPaint r2 = r2.getPaint()
                if (r2 == 0) goto L_0x0024
                float r2 = r2.getTextSize()
                int r2 = (int) r2
                goto L_0x0025
            L_0x0024:
                r2 = 0
            L_0x0025:
                r0.<init>(r1, r2)
                com.tencent.mm.ui.tools.p0$a r1 = com.tencent.p014mm.p136ui.tools.C45078p0.C45079a.MODE_CHINESE_AS_2
                int r2 = r0.mo108328a(r1)
                yd2.g r4 = yd2.C79076g.this
                java.lang.String r4 = r4.f232209g
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "afterTextChanged inputCount:"
                r5.append(r6)
                r5.append(r2)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                java.lang.String r4 = java.lang.String.valueOf(r10)
                yd2.g r5 = yd2.C79076g.this
                int r6 = r5.f232210h
                r7 = 1
                if (r2 <= r6) goto L_0x00ca
                java.lang.String r4 = r0.mo108329b(r6, r1)
                yd2.g r10 = yd2.C79076g.this
                android.widget.TextView r0 = r10.f232214o
                r1 = 2
                if (r0 != 0) goto L_0x005d
                goto L_0x0074
            L_0x005d:
                android.content.Context r5 = r10.f232208f
                r6 = 2131833895(0x7f113427, float:1.9300885E38)
                java.lang.Object[] r8 = new java.lang.Object[r7]
                int r10 = r10.f232210h
                int r10 = r10 / r1
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r8[r3] = r10
                java.lang.String r10 = r5.getString(r6, r8)
                r0.setText(r10)
            L_0x0074:
                yd2.g r10 = yd2.C79076g.this
                android.widget.TextView r0 = r10.f232214o
                if (r0 == 0) goto L_0x0086
                android.content.Context r10 = r10.f232208f
                r5 = 2131101361(0x7f0606b1, float:1.781513E38)
                int r10 = kg3.C76577a.m92153d(r10, r5)
                r0.setTextColor(r10)
            L_0x0086:
                yd2.g r10 = yd2.C79076g.this
                android.widget.TextView r10 = r10.f232214o
                if (r10 == 0) goto L_0x0090
                r0 = 3
                r10.performHapticFeedback(r0, r1)
            L_0x0090:
                yd2.g r10 = yd2.C79076g.this
                com.tencent.mm.ui.widget.MMClearEditText r0 = r10.f232213n
                if (r0 == 0) goto L_0x009f
                android.content.Context r10 = r10.f232208f
                java.lang.CharSequence r10 = vl3.C102226d.m134696a(r10, r4)
                r0.setText(r10)
            L_0x009f:
                yd2.g r10 = yd2.C79076g.this
                com.tencent.mm.ui.widget.MMClearEditText r10 = r10.f232213n
                if (r10 == 0) goto L_0x00b6
                if (r10 == 0) goto L_0x00b2
                android.text.Editable r0 = r10.getText()
                if (r0 == 0) goto L_0x00b2
                int r0 = r0.length()
                goto L_0x00b3
            L_0x00b2:
                r0 = 0
            L_0x00b3:
                r10.setSelection(r0)
            L_0x00b6:
                yd2.g r10 = yd2.C79076g.this
                com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r10.f232217r
                boolean r10 = r10.stopped()
                if (r10 == 0) goto L_0x00fa
                yd2.g r10 = yd2.C79076g.this
                com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r10.f232217r
                r0 = 3000(0xbb8, double:1.482E-320)
                r10.startTimer(r0)
                goto L_0x00fa
            L_0x00ca:
                if (r2 >= r6) goto L_0x00fa
                com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r5.f232217r
                r0.stopTimer()
                java.lang.String r4 = java.lang.String.valueOf(r10)
                yd2.g r10 = yd2.C79076g.this
                android.widget.TextView r0 = r10.f232214o
                if (r0 != 0) goto L_0x00dc
                goto L_0x00e8
            L_0x00dc:
                android.content.Context r10 = r10.f232208f
                r1 = 2131833896(0x7f113428, float:1.9300887E38)
                java.lang.String r10 = r10.getString(r1)
                r0.setText(r10)
            L_0x00e8:
                yd2.g r10 = yd2.C79076g.this
                android.widget.TextView r0 = r10.f232214o
                if (r0 == 0) goto L_0x00fa
                android.content.Context r10 = r10.f232208f
                r1 = 2131100381(0x7f0602dd, float:1.7813142E38)
                int r10 = kg3.C76577a.m92153d(r10, r1)
                r0.setTextColor(r10)
            L_0x00fa:
                yd2.g r10 = yd2.C79076g.this
                com.tencent.mm.ui.widget.MMClearEditText r0 = r10.f232213n
                if (r0 == 0) goto L_0x0105
                yd2.g$a r10 = r10.f232215p
                r0.addTextChangedListener(r10)
            L_0x0105:
                yd2.g r10 = yd2.C79076g.this
                r0 = 2131310504(0x7f0937a8, float:1.8239322E38)
                android.view.View r10 = r10.findViewById(r0)
                if (r10 != 0) goto L_0x0111
                goto L_0x011d
            L_0x0111:
                yd2.g r0 = yd2.C79076g.this
                java.lang.String r0 = r0.f232212j
                boolean r0 = gy3.C87412m.m108589b(r4, r0)
                r0 = r0 ^ r7
                r10.setEnabled(r0)
            L_0x011d:
                if (r2 <= 0) goto L_0x0129
                yd2.g r10 = yd2.C79076g.this
                com.tencent.mm.emoji.view.EmojiPanelInputComponent r10 = r10.f232211i
                if (r10 == 0) goto L_0x0132
                r10.setSmileySendButtonEnable(r7)
                goto L_0x0132
            L_0x0129:
                yd2.g r10 = yd2.C79076g.this
                com.tencent.mm.emoji.view.EmojiPanelInputComponent r10 = r10.f232211i
                if (r10 == 0) goto L_0x0132
                r10.setSmileySendButtonEnable(r3)
            L_0x0132:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yd2.C79076g.C79077a.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79076g(Context context) {
        super(context, C0966R.style.f8695rg);
        C87412m.m108594g(context, "dialogContext");
        this.f232208f = context;
    }

    public void dismiss() {
        EmojiPanelInputComponent emojiPanelInputComponent = this.f232211i;
        if (emojiPanelInputComponent != null) {
            emojiPanelInputComponent.setVisibility(4);
        }
        EmojiPanelInputComponent emojiPanelInputComponent2 = this.f232211i;
        if (emojiPanelInputComponent2 != null) {
            emojiPanelInputComponent2.f195280q = null;
            ChatFooterPanel chatFooterPanel = emojiPanelInputComponent2.f195273g;
            if (chatFooterPanel != null) {
                chatFooterPanel.mo100200l();
                emojiPanelInputComponent2.f195273g.mo100189b();
            }
        }
        hideVKB();
        super.dismiss();
    }

    public void hideVKB() {
        Object systemService = this.f232208f.getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        MMClearEditText mMClearEditText = this.f232213n;
        inputMethodManager.hideSoftInputFromWindow(mMClearEditText != null ? mMClearEditText.getWindowToken() : null, 0);
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.view.Window r7 = r6.getWindow()
            r0 = -1
            if (r7 == 0) goto L_0x000d
            r7.setLayout(r0, r0)
        L_0x000d:
            android.view.Window r7 = r6.getWindow()
            if (r7 == 0) goto L_0x0018
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r7.addFlags(r1)
        L_0x0018:
            android.view.Window r7 = r6.getWindow()
            if (r7 == 0) goto L_0x0023
            r1 = 1056964608(0x3f000000, float:0.5)
            r7.setDimAmount(r1)
        L_0x0023:
            android.view.Window r7 = r6.getWindow()
            if (r7 == 0) goto L_0x002f
            r1 = 2131886334(0x7f1200fe, float:1.9407244E38)
            r7.setWindowAnimations(r1)
        L_0x002f:
            android.content.Context r7 = r6.f232208f
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r1 = 2131496936(0x7f0c0fe8, float:1.861745E38)
            r2 = 0
            r3 = 0
            android.view.View r7 = r7.inflate(r1, r2, r3)
            java.lang.String r1 = "from(dialogContext).infl…ting_dialog, null, false)"
            gy3.C87412m.m108593f(r7, r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r0, r0)
            r6.setContentView(r7, r1)
            r0 = 2131306455(0x7f0927d7, float:1.823111E38)
            android.view.View r0 = r6.findViewById(r0)
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r0 = (com.tencent.p014mm.emoji.view.EmojiPanelInputComponent) r0
            r6.f232211i = r0
            r0 = 2131310787(0x7f0938c3, float:1.8239896E38)
            android.view.View r1 = r6.findViewById(r0)
            com.tencent.mm.ui.widget.MMClearEditText r1 = (com.tencent.p014mm.p136ui.widget.MMClearEditText) r1
            r6.f232213n = r1
            r1 = 2131310788(0x7f0938c4, float:1.8239898E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6.f232214o = r1
            r1 = 2131301605(0x7f0914e5, float:1.8221273E38)
            android.view.View r1 = r7.findViewById(r1)
            yd2.h r4 = new yd2.h
            r4.<init>(r6)
            r1.setOnTouchListener(r4)
            r1 = 2131299709(0x7f090d7d, float:1.8217427E38)
            android.view.View r7 = r7.findViewById(r1)
            yd2.i r1 = new yd2.i
            r1.<init>(r6)
            r7.setOnClickListener(r1)
            r7 = 1
            r6.setCancelable(r7)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r0 == 0) goto L_0x0099
            r0.requestFocus()
        L_0x0099:
            zt3.t r0 = zt3.C119157j.f356862d
            yd2.j r1 = new yd2.j
            r1.<init>(r6)
            r4 = 128(0x80, double:6.32E-322)
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r0.mo183892w(r1, r4, r3)
            r0 = 2131310504(0x7f0937a8, float:1.8239322E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r0 == 0) goto L_0x00bb
            yd2.k r1 = new yd2.k
            r1.<init>(r6)
            r0.setOnClickListener(r1)
        L_0x00bb:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x00d0
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x00d0:
            if (r2 != 0) goto L_0x00d4
            java.lang.String r2 = ""
        L_0x00d4:
            r6.f232212j = r2
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC
            int r0 = r0.mo119689j(r1, r3)
            java.lang.String r1 = r6.f232209g
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r6.f232212j
            r2[r3] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2[r7] = r4
            java.lang.String r4 = "curSuffix %s, suffixVersion %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r2)
            if (r0 != 0) goto L_0x0117
            boolean r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isChineseAppLang()
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = r6.f232212j
            if (r0 == 0) goto L_0x0117
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 30340(0x7684, float:4.2515E-41)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.f232212j = r0
        L_0x0117:
            java.lang.String r0 = r6.f232212j
            if (r0 == 0) goto L_0x0155
            com.tencent.mm.ui.widget.MMClearEditText r1 = r6.f232213n
            if (r1 == 0) goto L_0x0130
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r4 = r6.f232208f
            android.text.SpannableString r2 = r2.mo107057T1(r4, r0)
            r1.setText(r2)
        L_0x0130:
            com.tencent.mm.ui.widget.MMClearEditText r1 = r6.f232213n
            if (r1 == 0) goto L_0x013b
            int r2 = r0.length()
            r1.setSelection(r2)
        L_0x013b:
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0143
            r0 = 1
            goto L_0x0144
        L_0x0143:
            r0 = 0
        L_0x0144:
            if (r0 == 0) goto L_0x014e
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r0 = r6.f232211i
            if (r0 == 0) goto L_0x0155
            r0.setSmileySendButtonEnable(r7)
            goto L_0x0155
        L_0x014e:
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r0 = r6.f232211i
            if (r0 == 0) goto L_0x0155
            r0.setSmileySendButtonEnable(r3)
        L_0x0155:
            com.tencent.mm.ui.widget.MMClearEditText r0 = r6.f232213n
            if (r0 == 0) goto L_0x015e
            yd2.g$a r1 = r6.f232215p
            r0.addTextChangedListener(r1)
        L_0x015e:
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.k r0 = r0.x90()
            r1 = 222(0xde, float:3.11E-43)
            r0.mo71314m3(r1, r6)
            yd2.l r0 = new yd2.l
            r0.<init>(r6)
            r6.setOnDismissListener(r0)
            com.tencent.mm.autogen.mmdata.rpt.PatSuffixActionReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.PatSuffixActionReportStruct
            r0.<init>()
            long r1 = eb0.C31543z5.m39453c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "SessionId"
            java.lang.String r1 = r0.mo86045b(r2, r1, r7)
            r0.f194323d = r1
            r0.f194324e = r7
            r7 = 3
            r0.f194326g = r7
            r0.f194325f = r3
            r0.mo86054n()
            r0.mo86056r()
            yd2.m r7 = yd2.C79079m.f232220d
            r6.setOnCancelListener(r7)
            f232207s = r6
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r7 = r6.f232211i
            if (r7 == 0) goto L_0x01a9
            com.tencent.mm.ui.widget.MMClearEditText r0 = r6.f232213n
            r7.setMMEditText(r0)
        L_0x01a9:
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r7 = r6.f232211i
            if (r7 == 0) goto L_0x01b0
            r7.setInputComponentListener(r6)
        L_0x01b0:
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r7 = r6.f232211i
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b9
        L_0x01b5:
            r0 = 4
            r7.setVisibility(r0)
        L_0x01b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yd2.C79076g.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        EmojiPanelInputComponent emojiPanelInputComponent = this.f232211i;
        if (emojiPanelInputComponent != null && emojiPanelInputComponent.mo93492d()) {
            EmojiPanelInputComponent emojiPanelInputComponent2 = this.f232211i;
            if (emojiPanelInputComponent2 != null) {
                emojiPanelInputComponent2.mo93491c();
                emojiPanelInputComponent2.setVisibility(8);
            }
            return true;
        }
        dismiss();
        return false;
    }

    public void showVKB() {
        Object systemService = this.f232208f.getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this.f232213n, 0);
    }

    /* renamed from: u1 */
    public void mo71282u1(int i, C52085y83 y832, C75880o oVar) {
        String str = this.f232209g;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        String str2 = null;
        objArr[1] = y832 != null ? y832.f145175d : null;
        objArr[2] = y832 != null ? y832.f145176e : null;
        Log.m105925i(str, "ret:%d, content:%s, title:%s", objArr);
        C89779i0 i0Var = this.f232216q;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        try {
            PatSuffixActionReportStruct patSuffixActionReportStruct = new PatSuffixActionReportStruct();
            patSuffixActionReportStruct.f194323d = patSuffixActionReportStruct.mo86045b("SessionId", String.valueOf(C31543z5.m39453c()), true);
            patSuffixActionReportStruct.f194324e = 2;
            patSuffixActionReportStruct.f194326g = 3;
            if (i == 0) {
                Context context = this.f232208f;
                C76879j.m92726T(context, context.getString(C0966R.string.a0g));
                C47465a aVar = oVar != null ? oVar.f222536j : null;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModPatSuffixOplog");
                C49070cz2 cz22 = (C49070cz2) aVar;
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC;
                Object f = i2.mo119685f(aVar2, (Object) null);
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
                if (!C87412m.m108589b(Util.nullAsNil((String) f), cz22.f132042d)) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 2);
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, cz22.f132042d);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAT_SUFFIX_MODIFY_TIP_TIMESTAMP_LONG, Long.valueOf(C31543z5.m39453c()));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAT_SUFFIX_MODIFY_TIP_COUNT_INT, 0);
                patSuffixActionReportStruct.f194325f = 0;
                dismiss();
            } else {
                if (!Util.isNullOrNil(y832 != null ? y832.f145175d : null)) {
                    Context context2 = this.f232208f;
                    if (y832 != null) {
                        str2 = y832.f145175d;
                    }
                    C76879j.m92748s(context2, str2, context2.getString(C0966R.string.a0f));
                } else {
                    C76879j.m92738i(this.f232208f, C0966R.string.f7966xq, C0966R.string.a0f);
                }
                patSuffixActionReportStruct.f194325f = i;
            }
            patSuffixActionReportStruct.mo86054n();
            patSuffixActionReportStruct.mo86056r();
        } catch (Exception e) {
            Log.printErrStackTrace(this.f232209g, e, "", new Object[0]);
        }
    }
}
