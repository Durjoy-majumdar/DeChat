package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import p206nj.C11171e;
import s12.C13612c;
import t12.C110899d;
import t12.C13818a;
import te3.px4;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.b */
public class C105394b {

    /* renamed from: a */
    public C56829c f313336a;

    /* renamed from: b */
    public DialPad f313337b;

    /* renamed from: c */
    public TextView f313338c;

    /* renamed from: d */
    public EditText f313339d;

    /* renamed from: e */
    public View f313340e;

    /* renamed from: f */
    public ImageButton f313341f;

    /* renamed from: g */
    public TextView f313342g;

    /* renamed from: h */
    public View f313343h;

    /* renamed from: i */
    public TextView f313344i;

    /* renamed from: j */
    public TextView f313345j;

    /* renamed from: k */
    public MMActivity f313346k;

    /* renamed from: l */
    public PhoneFormater f313347l;

    /* renamed from: m */
    public String f313348m;

    /* renamed from: n */
    public String f313349n;

    /* renamed from: o */
    public String f313350o = "";

    /* renamed from: p */
    public String f313351p;

    /* renamed from: q */
    public String f313352q;

    /* renamed from: r */
    public LinkedList<px4> f313353r;

    /* renamed from: s */
    public long f313354s = 0;

    /* renamed from: t */
    public boolean f313355t = false;

    /* renamed from: u */
    public Runnable f313356u = new C105395a();

    /* renamed from: v */
    public MMHandler f313357v = new MMHandler("IPCallDialQueryPhoneNumber");

    /* renamed from: w */
    public boolean f313358w = false;

    /* renamed from: x */
    public TextWatcher f313359x = new C105398b();

    /* renamed from: y */
    public String f313360y = "";

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.b$c */
    public interface C56829c {
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.b$a */
    public class C105395a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.b$a$a */
        public class C105396a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C13612c f313362d;

            public C105396a(C13612c cVar) {
                this.f313362d = cVar;
            }

            public void run() {
                C13612c cVar = this.f313362d;
                if (cVar == null || cVar.systemRowid == -1) {
                    C105394b.this.f313342g.setText("");
                } else {
                    C105394b.this.f313342g.setText(cVar.field_systemAddressBookUsername);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.b$a$b */
        public class C105397b implements Runnable {
            public C105397b() {
            }

            public void run() {
                C105394b.this.f313342g.setText("");
                C105394b bVar = C105394b.this;
                bVar.f313351p = null;
                bVar.f313352q = null;
            }
        }

        public C105395a() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C105394b bVar = C105394b.this;
            if (currentTimeMillis - bVar.f313354s >= 500) {
                MMActivity mMActivity = bVar.f313346k;
                bVar.f313351p = C13818a.m13110f(mMActivity, C105394b.this.f313349n + C105394b.this.f313350o);
                MMHandlerThread.postToMainThread(new C105396a(C105385g.vx0().mo13010qq(C105394b.this.f313351p)));
                return;
            }
            MMHandlerThread.postToMainThread(new C105397b());
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.b$b */
    public class C105398b implements TextWatcher {
        public C105398b() {
        }

        public void afterTextChanged(Editable editable) {
            String replace = C105394b.this.f313338c.getText().toString().replace("+", "");
            if (replace.startsWith("0") || replace.startsWith("*") || replace.startsWith("#")) {
                C105394b.this.f313338c.setText("+");
                C105394b.this.f313349n = "+";
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0165  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x016d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x017a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r11, int r12, int r13, int r14) {
            /*
                r10 = this;
                com.tencent.mm.plugin.ipcall.ui.b r11 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.view.View r11 = r11.f313343h
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                r12 = 0
                r13 = 8
                java.lang.String r14 = "+"
                if (r11 == 0) goto L_0x00fe
                com.tencent.mm.plugin.ipcall.ui.b r11 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r11 = r11.f313338c
                android.text.TextPaint r11 = r11.getPaint()
                com.tencent.mm.plugin.ipcall.ui.b r0 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r0 = r0.f313338c
                java.lang.CharSequence r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                boolean r0 = r14.equals(r0)
                if (r0 == 0) goto L_0x0085
                com.tencent.mm.plugin.ipcall.ui.b r0 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r0 = r0.f313338c
                java.lang.CharSequence r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                float r11 = r11.measureText(r0)
                int r11 = (int) r11
                com.tencent.mm.plugin.ipcall.ui.b r0 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.view.View r0 = r0.f313340e
                k20.a r9 = new k20.a
                r9.<init>()
                java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                r9.mo10233c(r1)
                java.lang.Object[] r2 = r9.mo10232b()
                java.lang.String r3 = "com/tencent/mm/plugin/ipcall/ui/DialPadController$2"
                java.lang.String r4 = "onTextChanged"
                java.lang.String r5 = "(Ljava/lang/CharSequence;III)V"
                java.lang.String r6 = "android/view/View_EXEC_"
                java.lang.String r7 = "setVisibility"
                java.lang.String r8 = "(I)V"
                r1 = r0
                j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.Object r1 = r9.mo10231a(r12)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r0.setVisibility(r1)
                java.lang.String r2 = "com/tencent/mm/plugin/ipcall/ui/DialPadController$2"
                java.lang.String r3 = "onTextChanged"
                java.lang.String r4 = "(Ljava/lang/CharSequence;III)V"
                java.lang.String r5 = "android/view/View_EXEC_"
                java.lang.String r6 = "setVisibility"
                java.lang.String r7 = "(I)V"
                r1 = r0
                j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
                com.tencent.mm.plugin.ipcall.ui.b r0 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r0 = r0.f313344i
                r0.setVisibility(r13)
                goto L_0x00eb
            L_0x0085:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.tencent.mm.plugin.ipcall.ui.b r1 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r1 = r1.f313338c
                java.lang.CharSequence r1 = r1.getText()
                r0.append(r1)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                float r11 = r11.measureText(r0)
                int r11 = (int) r11
                com.tencent.mm.plugin.ipcall.ui.b r0 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.view.View r0 = r0.f313340e
                k20.a r9 = new k20.a
                r9.<init>()
                java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                r9.mo10233c(r1)
                java.lang.Object[] r2 = r9.mo10232b()
                java.lang.String r3 = "com/tencent/mm/plugin/ipcall/ui/DialPadController$2"
                java.lang.String r4 = "onTextChanged"
                java.lang.String r5 = "(Ljava/lang/CharSequence;III)V"
                java.lang.String r6 = "android/view/View_EXEC_"
                java.lang.String r7 = "setVisibility"
                java.lang.String r8 = "(I)V"
                r1 = r0
                j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.Object r1 = r9.mo10231a(r12)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r0.setVisibility(r1)
                java.lang.String r2 = "com/tencent/mm/plugin/ipcall/ui/DialPadController$2"
                java.lang.String r3 = "onTextChanged"
                java.lang.String r4 = "(Ljava/lang/CharSequence;III)V"
                java.lang.String r5 = "android/view/View_EXEC_"
                java.lang.String r6 = "setVisibility"
                java.lang.String r7 = "(I)V"
                r1 = r0
                j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
                com.tencent.mm.plugin.ipcall.ui.b r0 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r0 = r0.f313344i
                r0.setVisibility(r12)
            L_0x00eb:
                com.tencent.mm.plugin.ipcall.ui.b r0 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.view.View r0 = r0.f313343h
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                r0.width = r11
                com.tencent.mm.plugin.ipcall.ui.b r11 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.view.View r11 = r11.f313343h
                r11.setLayoutParams(r0)
            L_0x00fe:
                com.tencent.mm.plugin.ipcall.ui.b r11 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r11 = r11.f313338c
                java.lang.CharSequence r11 = r11.getText()
                java.lang.String r11 = r11.toString()
                java.lang.String r0 = ""
                java.lang.String r11 = r11.replace(r14, r0)
                boolean r14 = t12.C13818a.m13117m(r11)
                r0 = 1
                if (r14 == 0) goto L_0x0152
                com.tencent.mm.plugin.ipcall.ui.b r14 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r14 = r14.f313344i
                java.lang.String r1 = t12.C13818a.m13111g(r11)
                r14.setText(r1)
                com.tencent.mm.plugin.ipcall.ui.b r14 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                java.util.LinkedList<te3.px4> r14 = r14.f313353r
                if (r14 == 0) goto L_0x0162
                int r14 = r14.size()
                if (r14 <= 0) goto L_0x0162
                java.lang.String r14 = t12.C13818a.m13112h(r11)
                com.tencent.mm.plugin.ipcall.ui.b r1 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                java.util.LinkedList<te3.px4> r1 = r1.f313353r
                java.util.Iterator r1 = r1.iterator()
            L_0x013a:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0162
                java.lang.Object r2 = r1.next()
                te3.px4 r2 = (te3.px4) r2
                if (r2 == 0) goto L_0x013a
                java.lang.String r2 = r2.f140046e
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x013a
                r14 = 1
                goto L_0x0163
            L_0x0152:
                com.tencent.mm.plugin.ipcall.ui.b r14 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r1 = r14.f313344i
                com.tencent.mm.ui.MMActivity r14 = r14.f313346k
                r2 = 2131831549(0x7f112afd, float:1.9296127E38)
                java.lang.String r14 = r14.getString(r2)
                r1.setText(r14)
            L_0x0162:
                r14 = 0
            L_0x0163:
                if (r14 == 0) goto L_0x016d
                com.tencent.mm.plugin.ipcall.ui.b r13 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r13 = r13.f313345j
                r13.setVisibility(r12)
                goto L_0x0174
            L_0x016d:
                com.tencent.mm.plugin.ipcall.ui.b r14 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                android.widget.TextView r14 = r14.f313345j
                r14.setVisibility(r13)
            L_0x0174:
                com.tencent.mm.plugin.ipcall.ui.b r13 = com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.this
                com.tencent.mm.plugin.ipcall.ui.b$c r13 = r13.f313336a
                if (r13 == 0) goto L_0x01ac
                com.tencent.mm.plugin.ipcall.ui.IPCallDialUI r13 = (com.tencent.p014mm.plugin.ipcall.p065ui.IPCallDialUI) r13
                r14 = 2
                java.lang.Object[] r1 = new java.lang.Object[r14]
                r1[r12] = r11
                java.lang.String r12 = r13.f313300s
                r1[r0] = r12
                java.lang.String r12 = "MicroMsg.IPCallDialUI"
                java.lang.String r2 = "onModifyCountryCodeByUser:countryCode:%s,mCountryCode:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
                int r1 = r13.f313304w
                if (r1 == r14) goto L_0x01ac
                r2 = -1
                if (r1 == r2) goto L_0x01ac
                java.lang.String r1 = r13.f313300s
                boolean r11 = r1.equals(r11)
                if (r11 != 0) goto L_0x01ac
                java.lang.String r11 = "modifyCountryCodeByUsder"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
                r13.f313304w = r14
                int r11 = r13.f313303v
                if (r11 != r0) goto L_0x01a9
                r13.f313303v = r14
                goto L_0x01ac
            L_0x01a9:
                r11 = 4
                r13.f313303v = r11
            L_0x01ac:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.C105398b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public C105394b(MMActivity mMActivity, EditText editText, TextView textView, View view, DialPad dialPad, ImageButton imageButton, TextView textView2, View view2, TextView textView3, TextView textView4) {
        this.f313346k = mMActivity;
        this.f313339d = editText;
        this.f313338c = textView;
        this.f313340e = view;
        this.f313337b = dialPad;
        this.f313341f = imageButton;
        this.f313342g = textView2;
        this.f313343h = view2;
        this.f313344i = textView3;
        this.f313345j = textView4;
        this.f313347l = new PhoneFormater();
        this.f313349n = C110899d.m151192f();
        String string = MMApplicationContext.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryName", "");
        this.f313348m = Util.isNullOrNil(string) ? C13818a.m13111g(C13818a.m13113i()) : string;
        this.f313338c.addTextChangedListener(this.f313359x);
        TextView textView5 = this.f313338c;
        textView5.setText("+" + this.f313349n);
        this.f313337b.setDialButtonClickListener(new C105399c(this));
        this.f313340e.setOnClickListener(new C105401d(this));
        this.f313340e.setOnLongClickListener(new C105404e(this));
        this.f313338c.setOnClickListener(new C105407f(this));
        this.f313341f.setOnClickListener(new C105412g(this));
        this.f313339d.setHorizontallyScrolling(true);
        this.f313339d.setOnClickListener(new C105415h(this));
        this.f313339d.addTextChangedListener(new C105418i(this));
        if (C11171e.m11046c(16)) {
            this.f313338c.setTypeface(Typeface.create("sans-serif-light", 0));
            this.f313339d.setTypeface(Typeface.create("sans-serif-light", 0));
            this.f313342g.setTypeface(Typeface.create("sans-serif-light", 0));
        }
    }

    /* renamed from: a */
    public final String mo150124a(String str, String str2) {
        String formatNumber = this.f313347l.formatNumber(str, C110899d.m151196j(str2));
        return Util.isNullOrNil(formatNumber) ? str2 : formatNumber;
    }

    /* renamed from: b */
    public void mo150125b() {
        this.f313357v.removeCallbacks(this.f313356u);
        this.f313357v.postDelayed(this.f313356u, 500);
    }

    /* renamed from: c */
    public void mo150126c(String str) {
        this.f313349n = str;
        TextView textView = this.f313338c;
        if (textView != null) {
            textView.setText("+" + str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150127d(java.util.LinkedList<te3.px4> r4) {
        /*
            r3 = this;
            r3.f313353r = r4
            android.widget.TextView r4 = r3.f313338c
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "+"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.replace(r0, r1)
            boolean r0 = t12.C13818a.m13117m(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0047
            java.util.LinkedList<te3.px4> r0 = r3.f313353r
            if (r0 == 0) goto L_0x0047
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0047
            java.lang.String r4 = t12.C13818a.m13112h(r4)
            java.util.LinkedList<te3.px4> r0 = r3.f313353r
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r0.next()
            te3.px4 r2 = (te3.px4) r2
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r2.f140046e
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x002f
            r4 = 1
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            if (r4 == 0) goto L_0x0050
            android.widget.TextView r4 = r3.f313345j
            r4.setVisibility(r1)
            goto L_0x0057
        L_0x0050:
            android.widget.TextView r4 = r3.f313345j
            r0 = 8
            r4.setVisibility(r0)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.p065ui.C105394b.mo150127d(java.util.LinkedList):void");
    }

    /* renamed from: e */
    public void mo150128e(String str, int i) {
        this.f313339d.setText(str);
        if (!Util.isNullOrNil(str)) {
            if (i == -1) {
                EditText editText = this.f313339d;
                editText.setSelection(editText.getText().length());
            } else if (this.f313358w) {
                if (i <= 0 || i > this.f313339d.getText().length()) {
                    EditText editText2 = this.f313339d;
                    editText2.setSelection(editText2.getText().length());
                } else {
                    this.f313339d.setSelection(i);
                }
            }
        }
        this.f313350o = str;
    }
}
