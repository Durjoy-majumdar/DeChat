package com.tencent.p014mm.plugin.kidswatch.p066ui.reg;

import a70.C112760b;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C92725m;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.plugin.kidswatch.p066ui.login.KidsWatchHeadComponent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import de3.C75355a0;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p192l4.C10462b;
import p196ln.C117475p;
import p196ln.C99514m;
import p206nj.C88955f;
import p214om.C11502f;
import p286zl.C16292g;
import p286zl.C39374m;
import p286zl.C39375n;
import p286zl.C39376o;
import p550hn.C108251c;
import qn3.C77382c;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C90186h0;
import v12.C118639h;
import w12.C15033a;
import wd3.C53155r0;
import y12.C118909a;
import z04.C112550d0;
import z12.C16094a;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "Lcom/tencent/mm/ui/widget/a$d;", "Lln/m$a;", "<init>", "()V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI */
public final class KidsWatchRegGetInfoUI extends MMActivity implements C11385n, C74965a.C74969d, C99514m.C99515a {

    /* renamed from: t */
    public static final /* synthetic */ int f346177t = 0;

    /* renamed from: d */
    public String f346178d;

    /* renamed from: e */
    public String f346179e;

    /* renamed from: f */
    public String f346180f;

    /* renamed from: g */
    public String f346181g;

    /* renamed from: h */
    public String f346182h;

    /* renamed from: i */
    public int f346183i;

    /* renamed from: j */
    public final String f346184j = "+86";

    /* renamed from: n */
    public boolean f346185n;

    /* renamed from: o */
    public Bitmap f346186o;

    /* renamed from: p */
    public boolean f346187p = true;

    /* renamed from: q */
    public C89779i0 f346188q;

    /* renamed from: r */
    public final C13601g f346189r = C36568h.m40985a(new C105432l(this));

    /* renamed from: s */
    public final C39374m f346190s;

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$b */
    public static final class C4740b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegGetInfoUI f19756d;

        public C4740b(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            this.f19756d = kidsWatchRegGetInfoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f19756d;
            int i = KidsWatchRegGetInfoUI.f346177t;
            kidsWatchRegGetInfoUI.getClass();
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93149TE(kidsWatchRegGetInfoUI);
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$g */
    public static final class C4741g extends C15033a {

        /* renamed from: e */
        public final /* synthetic */ KidsWatchRegGetInfoUI f19757e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4741g(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            super(1, (C53155r0) null);
            this.f19757e = kidsWatchRegGetInfoUI;
        }

        /* renamed from: a */
        public void mo5646a(View view) {
            KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f19757e;
            int i = KidsWatchRegGetInfoUI.f346177t;
            kidsWatchRegGetInfoUI.getClass();
            Log.m105924i("MicroMsg.KidsWatchRegGetInfoUI", "click law link");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", kidsWatchRegGetInfoUI.getString(C0966R.string.g5c, new Object[]{LocaleUtil.getApplicationLanguage()}));
            C88144b.m109791i(kidsWatchRegGetInfoUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$l */
    public static final class C105432l extends C87413o implements C32224a<C118639h> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegGetInfoUI f313462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105432l(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            super(0);
            this.f313462d = kidsWatchRegGetInfoUI;
        }

        public Object invoke() {
            View findViewById = this.f313462d.findViewById(C0966R.C0970id.mev);
            int i = C0966R.C0970id.f5576it;
            ImageView imageView = (ImageView) C10462b.m10395a(findViewById, C0966R.C0970id.f5576it);
            if (imageView != null) {
                i = C0966R.C0970id.a1q;
                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) C10462b.m10395a(findViewById, C0966R.C0970id.a1q);
                if (roundCornerImageView != null) {
                    i = C0966R.C0970id.ag4;
                    LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ag4);
                    if (linearLayout != null) {
                        i = C0966R.C0970id.ah6;
                        View a = C10462b.m10395a(findViewById, C0966R.C0970id.ah6);
                        if (a != null) {
                            i = C0966R.C0970id.arj;
                            LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.arj);
                            if (linearLayout2 != null) {
                                i = C0966R.C0970id.baq;
                                RelativeLayout relativeLayout = (RelativeLayout) C10462b.m10395a(findViewById, C0966R.C0970id.baq);
                                if (relativeLayout != null) {
                                    i = C0966R.C0970id.f358387eu1;
                                    KidsWatchHeadComponent kidsWatchHeadComponent = (KidsWatchHeadComponent) C10462b.m10395a(findViewById, C0966R.C0970id.f358387eu1);
                                    if (kidsWatchHeadComponent != null) {
                                        i = C0966R.C0970id.f5w;
                                        LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f5w);
                                        if (linearLayout3 != null) {
                                            i = C0966R.C0970id.f7d;
                                            InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f7d);
                                            if (inputPanelLinearLayout != null) {
                                                RelativeLayout relativeLayout2 = (RelativeLayout) findViewById;
                                                i = C0966R.C0970id.fj4;
                                                CheckBox checkBox = (CheckBox) C10462b.m10395a(findViewById, C0966R.C0970id.fj4);
                                                if (checkBox != null) {
                                                    i = C0966R.C0970id.fj5;
                                                    TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.fj5);
                                                    if (textView != null) {
                                                        i = C0966R.C0970id.fj6;
                                                        LinearLayout linearLayout4 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.fj6);
                                                        if (linearLayout4 != null) {
                                                            i = C0966R.C0970id.gvq;
                                                            MMClearEditText mMClearEditText = (MMClearEditText) C10462b.m10395a(findViewById, C0966R.C0970id.gvq);
                                                            if (mMClearEditText != null) {
                                                                i = C0966R.C0970id.hfl;
                                                                MMClearEditText mMClearEditText2 = (MMClearEditText) C10462b.m10395a(findViewById, C0966R.C0970id.hfl);
                                                                if (mMClearEditText2 != null) {
                                                                    i = C0966R.C0970id.ijr;
                                                                    Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.ijr);
                                                                    if (button != null) {
                                                                        i = C0966R.C0970id.j3t;
                                                                        ScrollView scrollView = (ScrollView) C10462b.m10395a(findViewById, C0966R.C0970id.j3t);
                                                                        if (scrollView != null) {
                                                                            return new C118639h(relativeLayout2, imageView, roundCornerImageView, linearLayout, a, linearLayout2, relativeLayout, kidsWatchHeadComponent, linearLayout3, inputPanelLinearLayout, relativeLayout2, checkBox, textView, linearLayout4, mMClearEditText, mMClearEditText2, button, scrollView);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$a */
    public static final class C115461a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegGetInfoUI f346191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115461a(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            super(0);
            this.f346191d = kidsWatchRegGetInfoUI;
        }

        public Object invoke() {
            this.f346191d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$c */
    public static final class C115462c implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegGetInfoUI f346192d;

        public C115462c(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            this.f346192d = kidsWatchRegGetInfoUI;
        }

        public void afterTextChanged(Editable editable) {
            C87412m.m108594g(editable, "s");
            KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f346192d;
            int i = KidsWatchRegGetInfoUI.f346177t;
            kidsWatchRegGetInfoUI.mo175401H7().f354998n.setEnabled(!Util.isNullOrNil(editable.toString()) && !Util.isNullOrNil((CharSequence) this.f346192d.mo175401H7().f354996l.getText()) && this.f346192d.mo175401H7().f354994j.isChecked());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$d */
    public static final class C115463d implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegGetInfoUI f346193d;

        public C115463d(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            this.f346193d = kidsWatchRegGetInfoUI;
        }

        public void afterTextChanged(Editable editable) {
            C87412m.m108594g(editable, "s");
            KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f346193d;
            int i = KidsWatchRegGetInfoUI.f346177t;
            kidsWatchRegGetInfoUI.mo175401H7().f354998n.setEnabled(!Util.isNullOrNil(editable.toString()) && !Util.isNullOrNil((CharSequence) this.f346193d.mo175401H7().f354997m.getText()) && this.f346193d.mo175401H7().f354994j.isChecked());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$e */
    public static final class C115464e implements MMHandlerThread.IWaitWorkThread {

        /* renamed from: a */
        public final /* synthetic */ KidsWatchRegGetInfoUI f346194a;

        public C115464e(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            this.f346194a = kidsWatchRegGetInfoUI;
        }

        public boolean doInBackground() {
            return true;
        }

        public boolean onPostExecute() {
            if (!Util.isNullOrNil((String) null)) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f346194a;
                int i = KidsWatchRegGetInfoUI.f346177t;
                sb.append(kidsWatchRegGetInfoUI.mo175401H7().f354997m.getText());
                String sb4 = sb.toString();
                int length = sb4.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = C87412m.m108596i(sb4.charAt(!z ? i2 : length), 32) <= 0;
                    if (!z) {
                        if (!z2) {
                            z = true;
                        } else {
                            i2++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (Util.isNullOrNil(sb4.subSequence(i2, length + 1).toString())) {
                    this.f346194a.mo175401H7().f354997m.setText((CharSequence) null);
                }
            }
            if (!C88955f.m111058b()) {
                Log.m105920e("MicroMsg.KidsWatchRegGetInfoUI", "SDcard is not available");
                return false;
            }
            Bitmap bitmap = this.f346194a.f346186o;
            if (bitmap != null) {
                C87412m.m108591d(bitmap);
                if (!bitmap.isRecycled()) {
                    KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI2 = this.f346194a;
                    if (!kidsWatchRegGetInfoUI2.f346185n) {
                        kidsWatchRegGetInfoUI2.mo175401H7().f354986b.setImageBitmap(this.f346194a.f346186o);
                        this.f346194a.mo175401H7().f354986b.setVisibility(0);
                        this.f346194a.mo175401H7().f354985a.setVisibility(8);
                        this.f346194a.f346185n = true;
                    }
                }
            }
            return true;
        }

        public String toString() {
            return super.toString() + "|initView2";
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$f */
    public static final class C115465f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ KidsWatchRegGetInfoUI f346195a;

        public C115465f(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            this.f346195a = kidsWatchRegGetInfoUI;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f346195a;
            int i = KidsWatchRegGetInfoUI.f346177t;
            if (!Util.isNullOrNil(kidsWatchRegGetInfoUI.mo175401H7().f354997m.getText().toString()) && !Util.isNullOrNil(this.f346195a.mo175401H7().f354996l.getText().toString()) && z) {
                this.f346195a.mo175401H7().f354998n.setEnabled(z);
            }
            if (!z) {
                this.f346195a.mo175401H7().f354998n.setEnabled(z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$h */
    public static final class C115466h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegGetInfoUI f346196d;

        /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$h$a */
        public static final class C115467a implements C77382c.C77383a {

            /* renamed from: d */
            public final /* synthetic */ KidsWatchRegGetInfoUI f346197d;

            public C115467a(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
                this.f346197d = kidsWatchRegGetInfoUI;
            }

            /* renamed from: L0 */
            public void mo4083L0(String str) {
                C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
                C89779i0 i0Var = this.f346197d.f346188q;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                C76879j.m92738i(this.f346197d.getContext(), C0966R.string.iug, C0966R.string.iui);
            }

            /* renamed from: L3 */
            public void mo4084L3(String str) {
                C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
                C89779i0 i0Var = this.f346197d.f346188q;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                C76879j.m92738i(this.f346197d.getContext(), C0966R.string.iuf, C0966R.string.iui);
            }

            /* renamed from: P4 */
            public void mo4086P4(String str) {
                C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
                KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f346197d;
                int i = KidsWatchRegGetInfoUI.f346177t;
                kidsWatchRegGetInfoUI.f346182h = PhoneFormater.pureNumber(kidsWatchRegGetInfoUI.mo175401H7().f354996l.getText().toString());
                String str2 = this.f346197d.f346184j + this.f346197d.f346182h;
                this.f346197d.hideVKB();
                KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI2 = this.f346197d;
                if (kidsWatchRegGetInfoUI2.f346187p) {
                    C89779i0 i0Var = kidsWatchRegGetInfoUI2.f346188q;
                    if (i0Var != null) {
                        i0Var.dismiss();
                    }
                    String string = this.f346197d.getString(C0966R.string.g5g, new Object[]{LocaleUtil.getApplicationLanguage(), "CN", "kidswatchreg", 1, 0});
                    C87412m.m108593f(string, "getString(com.tencent.mm…N\", \"kidswatchreg\", 1, 0)");
                    ((C16292g) C86312j.m106911c(C16292g.class)).nr0(this.f346197d.getContext(), string, 30847, false);
                    return;
                }
                ((C90186h0) kidsWatchRegGetInfoUI2.f346190s).mo124429a(kidsWatchRegGetInfoUI2, new C118909a(kidsWatchRegGetInfoUI2, str2));
            }
        }

        public C115466h(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            this.f346196d = kidsWatchRegGetInfoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.KidsWatchRegGetInfoUI", "click reg button");
            KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f346196d;
            kidsWatchRegGetInfoUI.f346188q = C76879j.m92723Q(kidsWatchRegGetInfoUI, kidsWatchRegGetInfoUI.getString(C0966R.string.a3h), this.f346196d.getString(C0966R.string.a4d), true, true, (DialogInterface.OnCancelListener) null);
            C77382c b = C77382c.m93286b(this.f346196d.mo175401H7().f354997m);
            b.f225611e = 1;
            b.f225610d = 32;
            b.f225607a = true;
            b.mo107499d(new C115467a(this.f346196d));
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$i */
    public static final class C115468i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegGetInfoUI f346198d;

        public C115468i(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            this.f346198d = kidsWatchRegGetInfoUI;
        }

        public final void run() {
            C89779i0 i0Var = this.f346198d.f346188q;
            if (i0Var != null) {
                i0Var.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$j */
    public static final class C115469j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegGetInfoUI f346199d;

        /* renamed from: e */
        public final /* synthetic */ int f346200e;

        public C115469j(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI, int i) {
            this.f346199d = kidsWatchRegGetInfoUI;
            this.f346200e = i;
        }

        public final void run() {
            KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f346199d;
            int i = KidsWatchRegGetInfoUI.f346177t;
            Log.m105925i("MicroMsg.KidsWatchRegGetInfoUI", "inputContainer.height: %d, screenHeight: %d", Integer.valueOf(kidsWatchRegGetInfoUI.mo175401H7().f354993i.getHeight()), Integer.valueOf(this.f346200e));
            if (this.f346199d.mo175401H7().f354993i.getHeight() > this.f346200e) {
                this.f346199d.mo175401H7().f354999o.scrollBy(0, this.f346199d.mo175401H7().f354993i.getHeight() - this.f346200e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI$k */
    public static final class C115470k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegGetInfoUI f346201d;

        public C115470k(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
            this.f346201d = kidsWatchRegGetInfoUI;
        }

        public final void run() {
            C89779i0 i0Var = this.f346201d.f346188q;
            if (i0Var != null) {
                i0Var.dismiss();
            }
        }
    }

    public KidsWatchRegGetInfoUI() {
        C39374m lY = ((C39375n) C86312j.m106911c(C39375n.class)).mo61887lY();
        C87412m.m108593f(lY, "getService(IPermissionCh…tePermissionCheckHelper()");
        this.f346190s = lY;
    }

    /* renamed from: H7 */
    public final C118639h mo175401H7() {
        return (C118639h) ((C36570n) this.f346189r).getValue();
    }

    /* renamed from: I7 */
    public final void mo175402I7(String str, String str2) {
        Intent intent = new Intent(this, KidsWatchRegMobileVerifyUI.class);
        String str3 = this.f346178d;
        if (str3 != null) {
            intent.putExtra("intent.key.login.url", str3);
            intent.putExtra("intent.key.reg.nickname", mo175401H7().f354997m.getText().toString());
            intent.putExtra("intent.key.reg.mobile", mo175401H7().f354996l.getText().toString());
            intent.putExtra("intent.key.reg.session.id", this.f346179e);
            intent.putExtra("intent.key.hasSetAvatar", this.f346185n);
            intent.putExtra("intent.key.reg.head_img.file.id", str);
            intent.putExtra("intent.key.reg.head_img.aes.key", str2);
            Log.m105924i("MicroMsg.KidsWatchRegGetInfoUI", "get info page:(fileId:" + str + ") , (aesKey:" + str2 + ')');
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI", "gotoMobileVerifyCodePage", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI", "gotoMobileVerifyCodePage", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        C87412m.m108603p("loginUrl");
        throw null;
    }

    /* renamed from: J7 */
    public final void mo175403J7() {
        mo175401H7().f354992h.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = mo175401H7().f354987c.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3709c2);
        marginLayoutParams.topMargin = 0;
        mo175401H7().f354987c.setLayoutParams(marginLayoutParams);
        mo175401H7().f354993i.setPadding(mo175401H7().f354993i.getPaddingLeft(), mo175401H7().f354993i.getPaddingTop(), mo175401H7().f354993i.getPaddingRight(), 0);
        mo175401H7().f354999o.scrollBy(0, 0);
    }

    /* renamed from: K7 */
    public final void mo175404K7() {
        if (!this.f346185n) {
            Log.m105924i("MicroMsg.KidsWatchRegGetInfoUI", "uploadHeadImg, gotoMobileVerifyCodePage, " + this.f346185n);
            mo175402I7("", "");
            return;
        }
        this.f346188q = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, (DialogInterface.OnCancelListener) null);
        ((C92725m) ((C117475p) C86312j.m106911c(C117475p.class)).Dw0(C112760b.m154235i() + "temp.avatar", this)).mo126948a();
    }

    /* renamed from: e */
    public void mo138914e(int i, int i2, String str) {
        ((C119157j) C119157j.f356862d).mo183895z(new C115468i(this));
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        if (str == null) {
            str = "";
        }
        objArr[2] = str;
        Log.m105921e("MicroMsg.KidsWatchRegGetInfoUI", "upload head fail, errType:%s, errCode:%s, errMsg:%s", objArr);
        mo175402I7("", "");
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b39;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        Log.m105925i("MicroMsg.KidsWatchRegGetInfoUI", "keyboard show %s, keyboardHeight %d", Boolean.valueOf(z), Integer.valueOf(i));
        if (z) {
            mo175401H7().f354992h.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = mo175401H7().f354987c.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
            mo175401H7().f354987c.setLayoutParams(marginLayoutParams);
            mo175401H7().f354993i.setPadding(mo175401H7().f354993i.getPaddingLeft(), mo175401H7().f354993i.getPaddingTop(), mo175401H7().f354993i.getPaddingRight(), i);
            int height = mo175401H7().f354999o.getHeight();
            mo175401H7().f354993i.requestLayout();
            mo175401H7().f354993i.post(new C115469j(this, height));
            return;
        }
        mo175403J7();
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        KidsWatchHeadComponent kidsWatchHeadComponent = mo175401H7().f354991g;
        String string = getString(C0966R.string.g0g);
        C87412m.m108593f(string, "getString(R.string.kids_…ogin_enter_loading_title)");
        kidsWatchHeadComponent.setTitle(string);
        mo175401H7().f354991g.f19755e.f39983b.setVisibility(0);
        mo175401H7().f354991g.setCloseBtnCallBack(new C115461a(this));
        mo175401H7().f354993i.mo104200a(this);
        mo175401H7().f354990f.setOnClickListener(new C4740b(this));
        mo175401H7().f354985a.setVisibility(0);
        mo175401H7().f354986b.setVisibility(8);
        RoundCornerImageView roundCornerImageView = mo175401H7().f354986b;
        int b = C76577a.m92151b(getContext(), 22);
        int b2 = C76577a.m92151b(getContext(), 22);
        roundCornerImageView.f220448f = b;
        roundCornerImageView.f220449g = b2;
        mo175401H7().f354997m.addTextChangedListener(new C115462c(this));
        mo175401H7().f354996l.addTextChangedListener(new C115463d(this));
        C86709a0.m107525e().postAtFrontOfWorker(new C115464e(this));
        Util.expandViewTouchArea(mo175401H7().f354994j, 250, 250, 250, 250);
        mo175401H7().f354998n.setEnabled(false);
        mo175401H7().f354994j.setOnCheckedChangeListener(new C115465f(this));
        String string2 = getString(C0966R.string.f360926g11);
        C87412m.m108593f(string2, "getString(R.string.kids_…eg_intro_get_info_cb_tip)");
        String string3 = getString(C0966R.string.f360927g12);
        C87412m.m108593f(string3, "getString(R.string.kids_…tro_get_info_cb_tip_link)");
        int H = C112550d0.m153772H(string2, string3, 0, false, 6, (Object) null);
        if (H >= 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            spannableStringBuilder.setSpan(new C4741g(this), H, string3.length() + H, 18);
            mo175401H7().f354995k.setOnTouchListener(new C75355a0(this));
            mo175401H7().f354995k.setClickable(true);
            mo175401H7().f354995k.setText(spannableStringBuilder);
            String stringExtra = getIntent().getStringExtra("intent.key.login.url");
            C87412m.m108591d(stringExtra);
            this.f346178d = stringExtra;
            mo175401H7().f354998n.setOnClickListener(new C115466h(this));
            C16094a aVar = C16094a.f43246a;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            aVar.mo14692c(context, mo175401H7().f354989e, mo175401H7().f354987c);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.KidsWatchRegGetInfoUI", "onActivityResult, requestCode:" + i + ", resultCode: " + i2);
        Bundle bundle = null;
        if (i != 30846) {
            if (i != 30847) {
                Bitmap R5 = ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93147R5(this, i, i2, intent);
                this.f346186o = R5;
                if (R5 != null) {
                    mo175401H7().f354986b.setImageBitmap(this.f346186o);
                    this.f346185n = true;
                    mo175401H7().f354986b.setVisibility(0);
                    mo175401H7().f354985a.setVisibility(8);
                    return;
                }
                return;
            }
            if (intent != null) {
                bundle = intent.getBundleExtra("result_data");
            }
            if (bundle != null && C87412m.m108589b(bundle.getString("go_next", ""), "agree_privacy")) {
                this.f346187p = false;
                ((C90186h0) this.f346190s).mo124429a(this, new C118909a(this, this.f346184j + this.f346182h));
            }
        } else if (i2 == -1) {
            if (intent != null) {
                bundle = intent.getBundleExtra("result_data");
            }
            if (bundle != null && C87412m.m108589b(bundle.getString("go_next", ""), "get_reg_verify_code")) {
                mo175404K7();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        C87412m.m108591d(supportActionBar);
        supportActionBar.mo91104o();
        setSelfNavigationBarVisible(8);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.YellowK));
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.YellowK));
        initView();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
    }

    public void onPause() {
        super.onPause();
        mo175401H7().f354993i.mo104200a((C74965a.C74969d) null);
    }

    public void onResume() {
        super.onResume();
        mo175401H7().f354993i.mo104200a(this);
        mo175403J7();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var = this.f346188q;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (i2 == -75) {
            C76879j.m92738i(this, C0966R.string.f7561jo, C0966R.string.hvq);
        } else if (yVar instanceof C108251c) {
            Log.m105924i("MicroMsg.KidsWatchRegGetInfoUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
            C86709a0.m107524d().mo123470p(145, this);
            C108251c cVar = (C108251c) yVar;
            int f = cVar.mo91368f();
            this.f346179e = cVar.mo91366V0();
            if (f != 22) {
                return;
            }
            if (i == 0 && i2 == 0) {
                mo175404K7();
            } else if (i2 == -59 || i2 == -41) {
                C7660a a = C7660a.m7782a(str);
                if (a != null) {
                    a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                } else {
                    C76879j.m92738i(this, C0966R.string.hx6, C0966R.string.hx7);
                }
            } else {
                this.f346182h = PhoneFormater.pureNumber(this.f346182h);
                this.f346181g = this.f346184j + this.f346182h;
                this.f346179e = cVar.mo91366V0();
                if (i2 == -36 || i2 == -35 || i2 == -3) {
                    String K0 = cVar.mo91363K0();
                    if (!Util.isNullOrNil(K0)) {
                        C87412m.m108593f(K0, "pureMobile");
                        int length = K0.length() - 1;
                        int i3 = 0;
                        boolean z = false;
                        while (i3 <= length) {
                            boolean z2 = C87412m.m108596i(K0.charAt(!z ? i3 : length), 32) <= 0;
                            if (!z) {
                                if (!z2) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            } else if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        this.f346182h = K0.subSequence(i3, length + 1).toString();
                    }
                    if (i2 == -36) {
                        mo175404K7();
                        return;
                    }
                    C7660a a2 = C7660a.m7782a(str);
                    if (a2 != null) {
                        a2.mo8792b(getContext(), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    } else {
                        C76879j.m92748s(this, getString(C0966R.string.al8, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), "");
                    }
                } else if (i2 == -355) {
                    Log.m105924i("MicroMsg.KidsWatchRegGetInfoUI", "showBlockBySpam");
                    ((C39376o) C86312j.m106911c(C39376o.class)).mo61889FX(this, str, 30846);
                } else if (i2 == -34) {
                    C76879j.m92748s(this, getString(C0966R.string.ajx), "");
                } else {
                    ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i, i2, str);
                }
            }
        }
    }

    /* renamed from: v */
    public void mo138915v(String str, String str2) {
        C87412m.m108594g(str, "fileID");
        C87412m.m108594g(str2, "aesKey");
        ((C119157j) C119157j.f356862d).mo183895z(new C115470k(this));
        Log.m105924i("MicroMsg.KidsWatchRegGetInfoUI", "IImgUploadCallback, ok, fileId:" + str + ", aesKey:" + str2);
        mo175402I7(str, str2);
    }
}
