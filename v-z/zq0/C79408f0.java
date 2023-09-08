package zq0;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.p136ui.base.MMFormInputView;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zq0.f0 */
public final class C79408f0 implements C79425q {

    /* renamed from: a */
    public final Context f232928a;

    /* renamed from: b */
    public C79424p f232929b;

    /* renamed from: c */
    public View f232930c;

    /* renamed from: d */
    public MMFormVerifyCodeInputView f232931d;

    /* renamed from: e */
    public MMFormInputView f232932e;

    /* renamed from: f */
    public MMSwitchBtn f232933f;

    /* renamed from: g */
    public Button f232934g;

    /* renamed from: h */
    public List<PhoneItem> f232935h;

    /* renamed from: zq0.f0$a */
    public static final class C79409a implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ MMSwitchBtn f232936a;

        /* renamed from: b */
        public final /* synthetic */ String f232937b;

        /* renamed from: c */
        public final /* synthetic */ String f232938c;

        public C79409a(MMSwitchBtn mMSwitchBtn, String str, String str2) {
            this.f232936a = mMSwitchBtn;
            this.f232937b = str;
            this.f232938c = str2;
        }

        public final void onStatusChange(boolean z) {
            Log.m105924i("MicroMsg.AppBrand.PhoneNumberAddView", "onStatusChange, isChecked: " + z);
            this.f232936a.setContentDescription(z ? this.f232937b : this.f232938c);
        }
    }

    /* renamed from: zq0.f0$b */
    public static final class C79410b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79408f0 f232939d;

        public C79410b(C79408f0 f0Var) {
            this.f232939d = f0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0085  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                zq0.f0 r8 = r7.f232939d
                com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView r0 = r8.f232931d
                r1 = 0
                if (r0 == 0) goto L_0x0027
                android.text.Editable r0 = r0.getText()
                goto L_0x0028
            L_0x0027:
                r0 = r1
            L_0x0028:
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.util.List<com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem> r8 = r8.f232935h
                if (r8 == 0) goto L_0x0050
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.util.Iterator r8 = r8.iterator()
            L_0x0036:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L_0x0050
                java.lang.Object r2 = r8.next()
                com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem r2 = (com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem) r2
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
                java.lang.String r2 = r2.f245271d
                boolean r2 = gy3.C87412m.m108589b(r3, r2)
                if (r2 == 0) goto L_0x0036
                r8 = 1
                goto L_0x0051
            L_0x0050:
                r8 = 0
            L_0x0051:
                if (r8 == 0) goto L_0x0085
                zq0.f0 r8 = r7.f232939d
                android.content.Context r8 = r8.f232928a
                qo3.a r0 = new qo3.a
                r0.<init>()
                r1 = 2131821898(0x7f11054a, float:1.9276552E38)
                android.content.res.Resources r2 = al3.C0086a.m38a(r8)
                java.lang.String r1 = r2.getString(r1)
                r0.f225660q = r1
                r1 = 2131832602(0x7f112f1a, float:1.9298262E38)
                android.content.res.Resources r2 = al3.C0086a.m38a(r8)
                java.lang.String r1 = r2.getString(r1)
                r0.f225663t = r1
                qo3.g r1 = new qo3.g
                r2 = 2131887328(0x7f1204e0, float:1.940926E38)
                r1.<init>(r8, r2)
                r1.mo107525e(r0)
                r1.show()
                goto L_0x009a
            L_0x0085:
                zq0.f0 r8 = r7.f232939d
                zq0.p r0 = r8.f232929b
                if (r0 == 0) goto L_0x009a
                com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView r8 = r8.f232931d
                if (r8 == 0) goto L_0x0093
                android.text.Editable r1 = r8.getText()
            L_0x0093:
                java.lang.String r8 = java.lang.String.valueOf(r1)
                r0.mo109395a(r8)
            L_0x009a:
                java.lang.String r8 = "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zq0.C79408f0.C79410b.onClick(android.view.View):void");
        }
    }

    /* renamed from: zq0.f0$c */
    public static final class C79411c implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C79408f0 f232940d;

        public C79411c(C79408f0 f0Var) {
            this.f232940d = f0Var;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
            if (((r1 == null || (r1 = r1.getText()) == null || r1.length() != 0) ? false : true) == false) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            r1 = r1.getText();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /*
                r0 = this;
                zq0.f0 r1 = r0.f232940d
                android.widget.Button r2 = r1.f232934g
                if (r2 != 0) goto L_0x0007
                goto L_0x003a
            L_0x0007:
                com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView r1 = r1.f232931d
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x001b
                android.text.Editable r1 = r1.getText()
                if (r1 == 0) goto L_0x001b
                int r1 = r1.length()
                if (r1 != 0) goto L_0x001b
                r1 = 1
                goto L_0x001c
            L_0x001b:
                r1 = 0
            L_0x001c:
                if (r1 != 0) goto L_0x0036
                zq0.f0 r1 = r0.f232940d
                com.tencent.mm.ui.base.MMFormInputView r1 = r1.f232932e
                if (r1 == 0) goto L_0x0032
                android.text.Editable r1 = r1.getText()
                if (r1 == 0) goto L_0x0032
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0032
                r1 = 1
                goto L_0x0033
            L_0x0032:
                r1 = 0
            L_0x0033:
                if (r1 != 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r3 = 0
            L_0x0037:
                r2.setEnabled(r3)
            L_0x003a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zq0.C79408f0.C79411c.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* renamed from: zq0.f0$d */
    public static final class C79412d implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C79408f0 f232941d;

        public C79412d(C79408f0 f0Var) {
            this.f232941d = f0Var;
        }

        public void afterTextChanged(Editable editable) {
            C87412m.m108594g(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
            if (((r1 == null || (r1 = r1.getText()) == null || r1.length() != 0) ? false : true) == false) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r1 = r1.getText();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /*
                r0 = this;
                java.lang.String r2 = "s"
                gy3.C87412m.m108594g(r1, r2)
                zq0.f0 r1 = r0.f232941d
                android.widget.Button r2 = r1.f232934g
                if (r2 != 0) goto L_0x000c
                goto L_0x003f
            L_0x000c:
                com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView r1 = r1.f232931d
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0020
                android.text.Editable r1 = r1.getText()
                if (r1 == 0) goto L_0x0020
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0020
                r1 = 1
                goto L_0x0021
            L_0x0020:
                r1 = 0
            L_0x0021:
                if (r1 != 0) goto L_0x003b
                zq0.f0 r1 = r0.f232941d
                com.tencent.mm.ui.base.MMFormInputView r1 = r1.f232932e
                if (r1 == 0) goto L_0x0037
                android.text.Editable r1 = r1.getText()
                if (r1 == 0) goto L_0x0037
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0037
                r1 = 1
                goto L_0x0038
            L_0x0037:
                r1 = 0
            L_0x0038:
                if (r1 != 0) goto L_0x003b
                goto L_0x003c
            L_0x003b:
                r3 = 0
            L_0x003c:
                r2.setEnabled(r3)
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zq0.C79408f0.C79412d.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* renamed from: zq0.f0$e */
    public static final class C79413e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79408f0 f232942d;

        public C79413e(C79408f0 f0Var) {
            this.f232942d = f0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C79408f0 f0Var = this.f232942d;
            C79424p pVar = f0Var.f232929b;
            if (pVar != null) {
                MMSwitchBtn mMSwitchBtn = f0Var.f232933f;
                Editable editable = null;
                Boolean valueOf = mMSwitchBtn != null ? Boolean.valueOf(mMSwitchBtn.f220433y) : null;
                C87412m.m108591d(valueOf);
                boolean booleanValue = valueOf.booleanValue();
                MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.f232942d.f232931d;
                String valueOf2 = String.valueOf(mMFormVerifyCodeInputView != null ? mMFormVerifyCodeInputView.getText() : null);
                MMFormInputView mMFormInputView = this.f232942d.f232932e;
                if (mMFormInputView != null) {
                    editable = mMFormInputView.getText();
                }
                pVar.mo109396b(booleanValue, valueOf2, String.valueOf(editable));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79408f0(android.content.Context r21, zq0.C79424p r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "mContext"
            gy3.C87412m.m108594g(r1, r2)
            r20.<init>()
            r0.f232928a = r1
            r2 = r22
            r0.f232929b = r2
            r2 = 2131493107(0x7f0c00f3, float:1.8609685E38)
            r3 = 0
            android.view.View r2 = android.view.View.inflate(r1, r2, r3)
            r0.f232930c = r2
            if (r2 == 0) goto L_0x0028
            r4 = 2131297109(0x7f090355, float:1.8212154E38)
            android.view.View r2 = r2.findViewById(r4)
            com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView r2 = (com.tencent.p014mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView) r2
            goto L_0x0029
        L_0x0028:
            r2 = r3
        L_0x0029:
            r0.f232931d = r2
            r4 = 2131101251(0x7f060643, float:1.7814906E38)
            if (r2 == 0) goto L_0x0041
            android.widget.EditText r2 = r2.getContentEditText()
            if (r2 == 0) goto L_0x0041
            android.content.res.Resources r5 = r21.getResources()
            int r5 = r5.getColor(r4)
            r2.setTextColor(r5)
        L_0x0041:
            android.view.View r2 = r0.f232930c
            if (r2 == 0) goto L_0x004f
            r5 = 2131297111(0x7f090357, float:1.8212158E38)
            android.view.View r2 = r2.findViewById(r5)
            com.tencent.mm.ui.base.MMFormInputView r2 = (com.tencent.p014mm.p136ui.base.MMFormInputView) r2
            goto L_0x0050
        L_0x004f:
            r2 = r3
        L_0x0050:
            r0.f232932e = r2
            if (r2 == 0) goto L_0x0065
            android.widget.EditText r2 = r2.getContentEditText()
            if (r2 == 0) goto L_0x0065
            android.content.res.Resources r5 = r21.getResources()
            int r4 = r5.getColor(r4)
            r2.setTextColor(r4)
        L_0x0065:
            android.view.View r2 = r0.f232930c
            if (r2 == 0) goto L_0x00c0
            r4 = 2131297110(0x7f090356, float:1.8212156E38)
            android.view.View r2 = r2.findViewById(r4)
            com.tencent.mm.ui.widget.MMSwitchBtn r2 = (com.tencent.p014mm.p136ui.widget.MMSwitchBtn) r2
            if (r2 == 0) goto L_0x00c0
            at0.c$b r4 = at0.C103915c.f307262l
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = 2131820965(0x7f1101a5, float:1.927466E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r5 = 2131165307(0x7f07007b, float:1.7944827E38)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r5)
            r18 = 4030(0xfbe, float:5.647E-42)
            r19 = 0
            r5 = r2
            at0.C103915c.C67105b.m79374b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4 = 2131821362(0x7f110332, float:1.9275465E38)
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = "mContext.getString(R.str…phone_number_add_for_use)"
            gy3.C87412m.m108593f(r4, r5)
            r6 = 2131821364(0x7f110334, float:1.927547E38)
            java.lang.String r1 = r1.getString(r6)
            gy3.C87412m.m108593f(r1, r5)
            boolean r5 = r2.f220433y
            if (r5 == 0) goto L_0x00b3
            r5 = r4
            goto L_0x00b4
        L_0x00b3:
            r5 = r1
        L_0x00b4:
            r2.setContentDescription(r5)
            zq0.f0$a r5 = new zq0.f0$a
            r5.<init>(r2, r4, r1)
            r2.setSwitchListener(r5)
            goto L_0x00c1
        L_0x00c0:
            r2 = r3
        L_0x00c1:
            r0.f232933f = r2
            android.view.View r1 = r0.f232930c
            if (r1 == 0) goto L_0x00d1
            r2 = 2131297108(0x7f090354, float:1.8212152E38)
            android.view.View r1 = r1.findViewById(r2)
            r3 = r1
            android.widget.Button r3 = (android.widget.Button) r3
        L_0x00d1:
            r0.f232934g = r3
            zq0.w r1 = zq0.C91919w.f263170a
            java.util.List r1 = r1.mo125747b()
            r0.f232935h = r1
            com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView r1 = r0.f232931d
            r2 = 3
            if (r1 == 0) goto L_0x00e3
            r1.setInputType(r2)
        L_0x00e3:
            com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView r1 = r0.f232931d
            if (r1 == 0) goto L_0x00ef
            zq0.f0$b r3 = new zq0.f0$b
            r3.<init>(r0)
            r1.setSendSmsBtnClickListener(r3)
        L_0x00ef:
            com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView r1 = r0.f232931d
            if (r1 == 0) goto L_0x0111
            zq0.f0$c r3 = new zq0.f0$c
            r3.<init>(r0)
            android.widget.EditText r1 = r1.f197155f
            if (r1 == 0) goto L_0x0100
            r1.addTextChangedListener(r3)
            goto L_0x0111
        L_0x0100:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r3
            r3 = 1
            r4[r3] = r1
            java.lang.String r1 = "MicroMsg.AppBrand.MMFormVerifyCodeInputView"
            java.lang.String r3 = "watcher : %s, contentET : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r3, r4)
        L_0x0111:
            com.tencent.mm.ui.base.MMFormInputView r1 = r0.f232932e
            if (r1 == 0) goto L_0x0118
            r1.setInputType(r2)
        L_0x0118:
            com.tencent.mm.ui.base.MMFormInputView r1 = r0.f232932e
            if (r1 == 0) goto L_0x0124
            zq0.f0$d r2 = new zq0.f0$d
            r2.<init>(r0)
            r1.mo101680a(r2)
        L_0x0124:
            android.widget.Button r1 = r0.f232934g
            if (r1 == 0) goto L_0x0130
            zq0.f0$e r2 = new zq0.f0$e
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zq0.C79408f0.<init>(android.content.Context, zq0.p):void");
    }
}
