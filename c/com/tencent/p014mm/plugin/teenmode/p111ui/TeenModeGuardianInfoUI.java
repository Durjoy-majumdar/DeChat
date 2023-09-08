package com.tencent.p014mm.plugin.teenmode.p111ui;

import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.p136ui.widget.MMClearEditText;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d14.C45252f;
import di3.C86312j;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import ly2.C10685q;
import nj3.C76879j;
import ny2.C100260v;
import ob0.C47350c;
import pb0.C47446b;
import pe3.C89349b;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48805b34;
import te3.C64221a34;
import wb2.C65946a;
import wx3.C15601d;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "plugin-teenmode_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI */
public final class TeenModeGuardianInfoUI extends MMWizardActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f206660g = 0;

    /* renamed from: e */
    public final C13601g f206661e = C36568h.m40985a(new C71353b(this));

    /* renamed from: f */
    public final C13601g f206662f = C36568h.m40985a(new C71352a(this));

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI$a */
    public static final class C71352a extends C87413o implements C32224a<MMClearEditText> {

        /* renamed from: d */
        public final /* synthetic */ TeenModeGuardianInfoUI f206663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71352a(TeenModeGuardianInfoUI teenModeGuardianInfoUI) {
            super(0);
            this.f206663d = teenModeGuardianInfoUI;
        }

        public Object invoke() {
            return (MMClearEditText) this.f206663d.findViewById(C0966R.C0970id.f2y);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI$b */
    public static final class C71353b extends C87413o implements C32224a<MMClearEditText> {

        /* renamed from: d */
        public final /* synthetic */ TeenModeGuardianInfoUI f206664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71353b(TeenModeGuardianInfoUI teenModeGuardianInfoUI) {
            super(0);
            this.f206664d = teenModeGuardianInfoUI;
        }

        public Object invoke() {
            return (MMClearEditText) this.f206664d.findViewById(C0966R.C0970id.hfz);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI$d */
    public static final class C71354d implements C74965a.C74969d {

        /* renamed from: d */
        public final /* synthetic */ Button f206665d;

        /* renamed from: e */
        public final /* synthetic */ TeenModeGuardianInfoUI f206666e;

        /* renamed from: f */
        public final /* synthetic */ InputPanelLinearLayout f206667f;

        /* renamed from: g */
        public final /* synthetic */ ScrollView f206668g;

        /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI$d$a */
        public static final class C71355a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ InputPanelLinearLayout f206669d;

            /* renamed from: e */
            public final /* synthetic */ int f206670e;

            /* renamed from: f */
            public final /* synthetic */ ScrollView f206671f;

            public C71355a(InputPanelLinearLayout inputPanelLinearLayout, int i, ScrollView scrollView) {
                this.f206669d = inputPanelLinearLayout;
                this.f206670e = i;
                this.f206671f = scrollView;
            }

            public final void run() {
                Log.m105925i("MicroMsg.TeenModeGuardianInfoUI", "inputContainer.height: %d, screenHeight: %d", Integer.valueOf(this.f206669d.getHeight()), Integer.valueOf(this.f206670e));
                if (this.f206669d.getHeight() > this.f206670e) {
                    this.f206671f.scrollBy(0, this.f206669d.getHeight() - this.f206670e);
                }
            }
        }

        public C71354d(Button button, TeenModeGuardianInfoUI teenModeGuardianInfoUI, InputPanelLinearLayout inputPanelLinearLayout, ScrollView scrollView) {
            this.f206665d = button;
            this.f206666e = teenModeGuardianInfoUI;
            this.f206667f = inputPanelLinearLayout;
            this.f206668g = scrollView;
        }

        /* renamed from: i0 */
        public final void mo1072i0(boolean z, int i) {
            ViewGroup.LayoutParams layoutParams = this.f206665d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (z) {
                layoutParams2.bottomMargin = this.f206666e.getResources().getDimensionPixelSize(C0966R.dimen.f3761db);
                layoutParams2.topMargin = this.f206666e.getResources().getDimensionPixelSize(C0966R.dimen.f3753d4);
                this.f206665d.setLayoutParams(layoutParams2);
                InputPanelLinearLayout inputPanelLinearLayout = this.f206667f;
                inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), this.f206667f.getPaddingTop(), this.f206667f.getPaddingRight(), i);
                int height = this.f206668g.getHeight();
                this.f206667f.requestLayout();
                InputPanelLinearLayout inputPanelLinearLayout2 = this.f206667f;
                inputPanelLinearLayout2.post(new C71355a(inputPanelLinearLayout2, height, this.f206668g));
                return;
            }
            layoutParams2.bottomMargin = this.f206666e.getResources().getDimensionPixelSize(C0966R.dimen.f3709c2);
            layoutParams2.topMargin = 0;
            this.f206665d.setLayoutParams(layoutParams2);
            InputPanelLinearLayout inputPanelLinearLayout3 = this.f206667f;
            inputPanelLinearLayout3.setPadding(inputPanelLinearLayout3.getPaddingLeft(), this.f206667f.getPaddingTop(), this.f206667f.getPaddingRight(), 0);
            this.f206668g.scrollBy(0, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI$e */
    public static final class C71356e implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ Button f206672d;

        /* renamed from: e */
        public final /* synthetic */ TeenModeGuardianInfoUI f206673e;

        public C71356e(Button button, TeenModeGuardianInfoUI teenModeGuardianInfoUI) {
            this.f206672d = button;
            this.f206673e = teenModeGuardianInfoUI;
        }

        public void afterTextChanged(Editable editable) {
            Button button = this.f206672d;
            TeenModeGuardianInfoUI teenModeGuardianInfoUI = this.f206673e;
            int i = TeenModeGuardianInfoUI.f206660g;
            button.setEnabled(((MMClearEditText) ((C36570n) teenModeGuardianInfoUI.f206661e).getValue()).length() > 0 && ((MMClearEditText) ((C36570n) this.f206673e.f206662f).getValue()).length() > 0);
            TeenModeGuardianInfoUI.m83876N7(this.f206673e, "");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI$f */
    public static final class C71357f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TeenModeGuardianInfoUI f206674d;

        public C71357f(TeenModeGuardianInfoUI teenModeGuardianInfoUI) {
            this.f206674d = teenModeGuardianInfoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f206674d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI$c */
    public static final class C71358c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TeenModeGuardianInfoUI f206675d;

        public C71358c(TeenModeGuardianInfoUI teenModeGuardianInfoUI) {
            this.f206675d = teenModeGuardianInfoUI;
        }

        public final void onClick(View view) {
            byte[] bArr;
            byte[] bArr2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TeenModeGuardianInfoUI teenModeGuardianInfoUI = this.f206675d;
            int i = TeenModeGuardianInfoUI.f206660g;
            teenModeGuardianInfoUI.getClass();
            C64221a34 a342 = new C64221a34();
            a342.f182015g = 1;
            String stringExtra = teenModeGuardianInfoUI.getIntent().getStringExtra(StateEvent.ActionValue.STAGE_PASS);
            if (stringExtra == null) {
                stringExtra = "";
            }
            Charset charset = C119027c.f356488a;
            byte[] bytes = stringExtra.getBytes(charset);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            String i2 = C86709a0.m107523b().mo121111i();
            C87412m.m108593f(i2, "account().getUinString()");
            byte[] bytes2 = i2.getBytes(charset);
            C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
            try {
                Mac instance = Mac.getInstance("HmacSHA256");
                instance.init(new SecretKeySpec(bytes, "HmacSHA256"));
                bArr = instance.doFinal(bytes2);
                C87412m.m108593f(bArr, "sha256_HMAC.doFinal(secretKey)");
            } catch (Throwable unused) {
                bArr = new byte[0];
            }
            String i3 = C86709a0.m107523b().mo121111i();
            C87412m.m108593f(i3, "account().getUinString()");
            byte[] bytes3 = i3.getBytes(charset);
            C87412m.m108593f(bytes3, "this as java.lang.String).getBytes(charset)");
            try {
                Mac instance2 = Mac.getInstance("HmacSHA256");
                instance2.init(new SecretKeySpec(bArr, "HmacSHA256"));
                bArr2 = instance2.doFinal(bytes3);
                C87412m.m108593f(bArr2, "sha256_HMAC.doFinal(secretKey)");
            } catch (Throwable unused2) {
                bArr2 = new byte[0];
            }
            a342.f182012d = new C89349b(bArr2, 0, bArr2.length);
            a342.f182013e = ((MMClearEditText) ((C36570n) teenModeGuardianInfoUI.f206661e).getValue()).getText().toString();
            a342.f182014f = ((MMClearEditText) ((C36570n) teenModeGuardianInfoUI.f206662f).getValue()).getText().toString();
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 4277;
            bVar.f127068c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
            bVar.f127066a = a342;
            bVar.f127067b = new C48805b34();
            C47350c a = bVar.mo72403a();
            C89779i0 Q = C76879j.m92723Q(teenModeGuardianInfoUI.getContext(), "", teenModeGuardianInfoUI.getString(C0966R.string.a2w), true, false, (DialogInterface.OnCancelListener) null);
            C45252f a2 = C47446b.f127269a.mo72464a(a);
            C39622i0 a3 = C39818r.f106831a.mo62444c(teenModeGuardianInfoUI).mo75002a(C65946a.class);
            C87412m.m108593f(a3, "UICProvider.of(this).get…ycleScopeUIC::class.java)");
            LifecycleScope c3 = ((C65946a) a3).mo89983c3();
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60465c(c3, C58901s.f168555a, C53934p0.DEFAULT, new C100260v(a2, Q, teenModeGuardianInfoUI, (C15601d<? super C100260v>) null));
            this.f206675d.hideVKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: N7 */
    public static final void m83876N7(TeenModeGuardianInfoUI teenModeGuardianInfoUI, String str) {
        TextView textView = (TextView) teenModeGuardianInfoUI.findViewById(C0966R.C0970id.ckx);
        if (Util.isNullOrNil(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c8n;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        Button button = (Button) findViewById(C0966R.C0970id.hfe);
        button.setOnClickListener(new C71358c(this));
        InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) findViewById(C0966R.C0970id.f7j);
        inputPanelLinearLayout.mo104200a(new C71354d(button, this, inputPanelLinearLayout, (ScrollView) findViewById(C0966R.C0970id.j48)));
        MMClearEditText[] mMClearEditTextArr = {(MMClearEditText) ((C36570n) this.f206661e).getValue(), (MMClearEditText) ((C36570n) this.f206662f).getValue()};
        for (int i = 0; i < 2; i++) {
            mMClearEditTextArr[i].addTextChangedListener(new C71356e(button, this));
        }
        ((MMClearEditText) ((C36570n) this.f206661e).getValue()).requestFocus();
        setBackBtn(new C71357f(this));
        ((C10685q) C86312j.m106911c(C10685q.class)).mo10757ri(12);
    }
}
