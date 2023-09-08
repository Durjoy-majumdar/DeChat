package com.tencent.p014mm.plugin.remittance.p098ui;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.remittance.model.C5058t0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import qo3.C101218e0;
import sx3.C110818d0;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onActivityResume", "onActivityPause", "Lcom/tencent/mm/ui/MMActivity;", "context", "", "maxLimitLength", "", "placeorderReserves", "Lcom/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage$b;", "entryScene", "<init>", "(Lcom/tencent/mm/ui/MMActivity;ILjava/lang/String;Lcom/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage$b;)V", "b", "c", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage */
public final class RemittanceRemarkInputHalfPage implements C0124r {

    /* renamed from: d */
    public final MMActivity f205113d;

    /* renamed from: e */
    public final int f205114e;

    /* renamed from: f */
    public final String f205115f;

    /* renamed from: g */
    public final C70828b f205116g;

    /* renamed from: h */
    public C101218e0 f205117h;

    /* renamed from: i */
    public KeyboardHeightProvider f205118i;

    /* renamed from: j */
    public int f205119j;

    /* renamed from: n */
    public String f205120n;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$a */
    public static final class C5066a implements C7020t0 {

        /* renamed from: d */
        public final /* synthetic */ RemittanceRemarkInputHalfPage f20420d;

        public C5066a(RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage) {
            this.f20420d = remittanceRemarkInputHalfPage;
        }

        /* renamed from: Q1 */
        public final void mo531Q1(int i, boolean z) {
            RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = this.f20420d;
            remittanceRemarkInputHalfPage.f205119j = i;
            if (i > 0) {
                C101218e0 e0Var = remittanceRemarkInputHalfPage.f205117h;
                if (e0Var != null && e0Var.mo140661h()) {
                    ViewGroup.LayoutParams layoutParams = e0Var.f296384g.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i});
                    ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofInt.addUpdateListener(new C5070n1(remittanceRemarkInputHalfPage, e0Var));
                    ofInt.addListener(new C5071o1(e0Var));
                    ofInt.setDuration(200);
                    ofInt.start();
                    return;
                }
                return;
            }
            C101218e0 e0Var2 = remittanceRemarkInputHalfPage.f205117h;
            if (e0Var2 != null && e0Var2.mo140661h()) {
                ViewGroup.LayoutParams layoutParams2 = e0Var2.f296384g.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{e0Var2.f296384g.getPaddingBottom(), 0});
                ofInt2.setInterpolator(new DecelerateInterpolator());
                ofInt2.addUpdateListener(new C5068l1(e0Var2));
                e0Var2.f296384g.getPaddingBottom();
                ofInt2.addListener(new C5069m1(e0Var2));
                ofInt2.setDuration(200);
                ofInt2.start();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$b */
    public enum C70828b {
        Remittance,
        BankRemit,
        RemittanceBusi
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$c */
    public interface C70829c {
        void onResult(boolean z, String str, String str2);
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$d */
    public static final class C70830d implements DialogInterface.OnKeyListener {

        /* renamed from: d */
        public final /* synthetic */ C101218e0 f205125d;

        /* renamed from: e */
        public final /* synthetic */ RemittanceRemarkInputHalfPage f205126e;

        /* renamed from: f */
        public final /* synthetic */ MMEditText f205127f;

        public C70830d(C101218e0 e0Var, RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, MMEditText mMEditText) {
            this.f205125d = e0Var;
            this.f205126e = remittanceRemarkInputHalfPage;
            this.f205127f = mMEditText;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f205125d.mo140661h()) {
                return false;
            }
            RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = this.f205126e;
            if (remittanceRemarkInputHalfPage.f205119j > 0) {
                remittanceRemarkInputHalfPage.f205113d.hideVKB(this.f205127f);
                return false;
            }
            this.f205125d.mo140680z();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$e */
    public static final class C70831e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RemittanceRemarkInputHalfPage f205128d;

        /* renamed from: e */
        public final /* synthetic */ MMEditText f205129e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f205130f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<String> f205131g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList<String> f205132h;

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$e$a */
        public static final class C70832a implements MMActivity.C6739d {

            /* renamed from: d */
            public final /* synthetic */ MMEditText f205133d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f205134e;

            /* renamed from: f */
            public final /* synthetic */ C8479f0<String> f205135f;

            /* renamed from: g */
            public final /* synthetic */ ArrayList<String> f205136g;

            /* renamed from: h */
            public final /* synthetic */ RemittanceRemarkInputHalfPage f205137h;

            /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$e$a$a */
            public static final class C70833a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ RemittanceRemarkInputHalfPage f205138d;

                public C70833a(RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage) {
                    this.f205138d = remittanceRemarkInputHalfPage;
                }

                public final void run() {
                    this.f205138d.f205113d.showVKB();
                }
            }

            public C70832a(MMEditText mMEditText, C8477a0 a0Var, C8479f0<String> f0Var, ArrayList<String> arrayList, RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage) {
                this.f205133d = mMEditText;
                this.f205134e = a0Var;
                this.f205135f = f0Var;
                this.f205136g = arrayList;
                this.f205137h = remittanceRemarkInputHalfPage;
            }

            public final void mmOnActivityResult(int i, int i2, Intent intent) {
                if (i == 123) {
                    if (i2 == -1) {
                        String stringExtra = intent.getStringExtra("userName");
                        String stringExtra2 = intent.getStringExtra("telNumber");
                        String stringExtra3 = intent.getStringExtra("proviceFirstStageName");
                        String stringExtra4 = intent.getStringExtra("addressCitySecondStageName");
                        String stringExtra5 = intent.getStringExtra("addressCountiesThirdStageName");
                        String stringExtra6 = intent.getStringExtra("addressDetailInfo");
                        StringBuilder sb = new StringBuilder();
                        if (!(stringExtra == null || stringExtra.length() == 0)) {
                            sb.append(stringExtra);
                        }
                        if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                            sb.append(stringExtra2);
                        }
                        if (!(sb.length() == 0)) {
                            sb.append(" ");
                        }
                        if (!(stringExtra3 == null || stringExtra3.length() == 0)) {
                            sb.append(stringExtra3);
                        }
                        if (!(stringExtra4 == null || stringExtra4.length() == 0)) {
                            sb.append(stringExtra4);
                        }
                        if (!(stringExtra5 == null || stringExtra5.length() == 0)) {
                            sb.append(stringExtra5);
                        }
                        if (!(stringExtra6 == null || stringExtra6.length() == 0)) {
                            sb.append(stringExtra6);
                        }
                        String sb4 = sb.toString();
                        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
                        String obj = this.f205133d.getText().toString();
                        if (!(obj == null || obj.length() == 0) && !C112551y.m153808h(obj, ";", false, 2, (Object) null)) {
                            this.f205133d.getText().append(";");
                            MMEditText mMEditText = this.f205133d;
                            mMEditText.setSelection(mMEditText.getText().length());
                        }
                        this.f205134e.f27482d = true;
                        MMEditText mMEditText2 = this.f205133d;
                        mMEditText2.mo98046o(sb4 + ';');
                        C8479f0<String> f0Var = this.f205135f;
                        f0Var.f27484d = ((String) this.f205135f.f27484d) + sb4;
                        if (this.f205136g.isEmpty() || !C87412m.m108589b(C110818d0.m150923U(this.f205136g), "2")) {
                            this.f205136g.add("2");
                        }
                    } else {
                        Log.m105924i("MicroMsg.RemittanceRemarkInputHalfPage", "cancel select address");
                    }
                    C119179t tVar = C119157j.f356862d;
                    C70833a aVar = new C70833a(this.f205137h);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(aVar, 100, false);
                }
            }
        }

        public C70831e(RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, MMEditText mMEditText, C8477a0 a0Var, C8479f0<String> f0Var, ArrayList<String> arrayList) {
            this.f205128d = remittanceRemarkInputHalfPage;
            this.f205129e = mMEditText;
            this.f205130f = a0Var;
            this.f205131g = f0Var;
            this.f205132h = arrayList;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage$showDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("launch_from_remittance", true);
            RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = this.f205128d;
            remittanceRemarkInputHalfPage.f205113d.mmSetOnActivityResultCallback(new C70832a(this.f205129e, this.f205130f, this.f205131g, this.f205132h, remittanceRemarkInputHalfPage));
            this.f205128d.f205113d.hideVKB(this.f205129e);
            C88144b.m109795m(this.f205128d.f205113d, "address", ".ui.WalletSelectAddrUI", intent, 123);
            C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage$showDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$f */
    public static final class C70834f implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ TextView f205139d;

        /* renamed from: e */
        public final /* synthetic */ RemittanceRemarkInputHalfPage f205140e;

        /* renamed from: f */
        public final /* synthetic */ C101218e0 f205141f;

        /* renamed from: g */
        public final /* synthetic */ C8477a0 f205142g;

        /* renamed from: h */
        public final /* synthetic */ C8477a0 f205143h;

        /* renamed from: i */
        public final /* synthetic */ ArrayList<String> f205144i;

        public C70834f(TextView textView, RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, C101218e0 e0Var, C8477a0 a0Var, C8477a0 a0Var2, ArrayList<String> arrayList) {
            this.f205139d = textView;
            this.f205140e = remittanceRemarkInputHalfPage;
            this.f205141f = e0Var;
            this.f205142g = a0Var;
            this.f205143h = a0Var2;
            this.f205144i = arrayList;
        }

        public void afterTextChanged(Editable editable) {
            C87412m.m108594g(editable, "s");
            int length = editable.toString().length();
            TextView textView = this.f205139d;
            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf(length), Integer.valueOf(this.f205140e.f205114e)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            textView.setText(format);
            C39818r rVar = C39818r.f106831a;
            ((C5058t0) rVar.mo62444c(this.f205140e.f205113d).mo75002a(C5058t0.class)).setValue("desc_length_key", String.valueOf(length));
            ((C5058t0) rVar.mo62444c(this.f205140e.f205113d).mo75002a(C5058t0.class)).setValue("desc_max_length_key", String.valueOf(this.f205140e.f205114e));
            if (length > this.f205140e.f205114e) {
                this.f205141f.mo140656b(false);
                this.f205139d.setTextColor(this.f205140e.f205113d.getResources().getColor(C0966R.color.f2966ao));
                this.f205139d.setVisibility(0);
                if (!this.f205142g.f27482d && this.f205140e.f205116g == C70828b.Remittance) {
                    C115669n.INSTANCE.mo160131h(22750, 6, this.f205140e.f205115f);
                }
                this.f205142g.f27482d = true;
            } else {
                this.f205141f.mo140656b(true);
                this.f205139d.setVisibility(4);
                this.f205142g.f27482d = false;
            }
            C8477a0 a0Var = this.f205143h;
            if (a0Var.f27482d) {
                a0Var.f27482d = false;
            } else if (this.f205144i.isEmpty() || !C87412m.m108589b(C110818d0.m150923U(this.f205144i), "1")) {
                this.f205144i.add("1");
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$g */
    public static final class C70835g implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C70829c f205145a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<String> f205146b;

        /* renamed from: c */
        public final /* synthetic */ RemittanceRemarkInputHalfPage f205147c;

        /* renamed from: d */
        public final /* synthetic */ MMEditText f205148d;

        /* renamed from: e */
        public final /* synthetic */ C101218e0 f205149e;

        public C70835g(C70829c cVar, C8479f0<String> f0Var, RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, MMEditText mMEditText, C101218e0 e0Var) {
            this.f205145a = cVar;
            this.f205146b = f0Var;
            this.f205147c = remittanceRemarkInputHalfPage;
            this.f205148d = mMEditText;
            this.f205149e = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            this.f205145a.onResult(true, (String) null, (String) this.f205146b.f27484d);
            this.f205147c.f205113d.hideVKB(this.f205148d);
            this.f205149e.mo140680z();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$h */
    public static final class C70836h implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C70829c f205150a;

        /* renamed from: b */
        public final /* synthetic */ MMEditText f205151b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<String> f205152c;

        /* renamed from: d */
        public final /* synthetic */ RemittanceRemarkInputHalfPage f205153d;

        /* renamed from: e */
        public final /* synthetic */ C101218e0 f205154e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList<String> f205155f;

        public C70836h(C70829c cVar, MMEditText mMEditText, C8479f0<String> f0Var, RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, C101218e0 e0Var, ArrayList<String> arrayList) {
            this.f205150a = cVar;
            this.f205151b = mMEditText;
            this.f205152c = f0Var;
            this.f205153d = remittanceRemarkInputHalfPage;
            this.f205154e = e0Var;
            this.f205155f = arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2001a() {
            /*
                r7 = this;
                com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$c r0 = r7.f205150a
                com.tencent.mm.ui.widget.MMEditText r1 = r7.f205151b
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = r1.toString()
                gy3.f0<java.lang.String> r2 = r7.f205152c
                T r2 = r2.f27484d
                java.lang.String r2 = (java.lang.String) r2
                r3 = 0
                r0.onResult(r3, r1, r2)
                com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage r0 = r7.f205153d
                com.tencent.mm.ui.MMActivity r0 = r0.f205113d
                com.tencent.mm.ui.widget.MMEditText r1 = r7.f205151b
                r0.hideVKB(r1)
                qo3.e0 r0 = r7.f205154e
                r0.mo140680z()
                com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage r0 = r7.f205153d
                java.util.ArrayList<java.lang.String> r1 = r7.f205155f
                r0.getClass()
                boolean r0 = r1.isEmpty()
                r2 = 2
                r4 = 1
                if (r0 == 0) goto L_0x0034
                goto L_0x007a
            L_0x0034:
                java.lang.String r0 = ","
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r1, r0)
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r1[r3] = r0
                java.lang.String r5 = "MicroMsg.RemittanceRemarkInputHalfPage"
                java.lang.String r6 = "action flow: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r1)
                java.lang.String r1 = "s"
                gy3.C87412m.m108593f(r0, r1)
                java.lang.String r1 = "1,2,1"
                boolean r1 = z04.C112551y.m153819s(r0, r1, r3)
                if (r1 != 0) goto L_0x007c
                java.lang.String r1 = "2,1"
                boolean r1 = z04.C112551y.m153819s(r0, r1, r3)
                if (r1 == 0) goto L_0x005c
                goto L_0x007c
            L_0x005c:
                java.lang.String r1 = "1,2"
                boolean r1 = z04.C112551y.m153819s(r0, r1, r3)
                if (r1 == 0) goto L_0x0066
                r0 = 3
                goto L_0x007d
            L_0x0066:
                java.lang.String r1 = "1"
                boolean r1 = z04.C112551y.m153819s(r0, r1, r3)
                if (r1 == 0) goto L_0x0070
                r0 = 2
                goto L_0x007d
            L_0x0070:
                java.lang.String r1 = "2"
                boolean r0 = z04.C112551y.m153819s(r0, r1, r3)
                if (r0 == 0) goto L_0x007a
                r0 = 4
                goto L_0x007d
            L_0x007a:
                r0 = 0
                goto L_0x007d
            L_0x007c:
                r0 = 5
            L_0x007d:
                if (r0 == 0) goto L_0x009c
                com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage r1 = r7.f205153d
                com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$b r1 = r1.f205116g
                com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$b r5 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceRemarkInputHalfPage.C70828b.Remittance
                if (r1 != r5) goto L_0x009c
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r5 = 22750(0x58de, float:3.188E-41)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2[r3] = r0
                com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage r0 = r7.f205153d
                java.lang.String r0 = r0.f205115f
                r2[r4] = r0
                r1.mo160131h(r5, r2)
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceRemarkInputHalfPage.C70836h.mo2001a():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage$i */
    public static final class C70837i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MMEditText f205156d;

        /* renamed from: e */
        public final /* synthetic */ WeImageView f205157e;

        public C70837i(MMEditText mMEditText, WeImageView weImageView) {
            this.f205156d = mMEditText;
            this.f205157e = weImageView;
        }

        public final void run() {
            this.f205156d.requestFocus();
            if (this.f205157e.isShown()) {
                ViewGroup.LayoutParams layoutParams = this.f205157e.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (this.f205156d.getLineCount() <= 1 && layoutParams2.gravity != 16) {
                    layoutParams2.gravity = 16;
                    this.f205157e.setLayoutParams(layoutParams2);
                } else if (this.f205156d.getLineCount() > 1 && layoutParams2.gravity > 0) {
                    layoutParams2.gravity = 0;
                    this.f205157e.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public RemittanceRemarkInputHalfPage(MMActivity mMActivity, int i, String str, C70828b bVar) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(bVar, "entryScene");
        this.f205113d = mMActivity;
        this.f205114e = i;
        this.f205115f = str;
        this.f205116g = bVar;
        this.f205118i = new KeyboardHeightProvider(mMActivity);
        mMActivity.getLifecycle().addObserver(this);
        this.f205118i.f220015b = new C5066a(this);
    }

    /* renamed from: a */
    public final void mo97491a(String str, String str2, C70829c cVar) {
        C70828b bVar;
        int i;
        boolean z;
        String str3 = str;
        C87412m.m108594g(cVar, "callback");
        C101218e0 e0Var = this.f205117h;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        this.f205117h = new C101218e0(this.f205113d, 1, 2, false);
        ArrayList arrayList = new ArrayList();
        C8477a0 a0Var = new C8477a0();
        C101218e0 e0Var2 = this.f205117h;
        if (e0Var2 != null) {
            e0Var2.mo140679y(48);
            LayoutInflater from = LayoutInflater.from(this.f205113d);
            View view = e0Var2.f296384g;
            C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            View inflate = from.inflate(C0966R.C0971layout.brt, (ViewGroup) view, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            View findViewById = viewGroup.findViewById(C0966R.C0970id.ink);
            C87412m.m108593f(findViewById, "rootView.findViewById(R.…mittance_remark_input_et)");
            MMEditText mMEditText = (MMEditText) findViewById;
            View findViewById2 = viewGroup.findViewById(C0966R.C0970id.inj);
            C87412m.m108593f(findViewById2, "rootView.findViewById(R.…ance_remark_address_icon)");
            WeImageView weImageView = (WeImageView) findViewById2;
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.inl);
            View findViewById3 = viewGroup.findViewById(C0966R.C0970id.f359071in3);
            C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.remittance_input_bg_ll)");
            LinearLayout linearLayout = (LinearLayout) findViewById3;
            if (!Util.isNullOrNil(str2)) {
                mMEditText.setHint(str2);
            }
            e0Var2.f296381d.setOnKeyListener(new C70830d(e0Var2, this, mMEditText));
            C75228t.m90252j(weImageView, C76577a.m92151b(this.f205113d, 20));
            C70828b bVar2 = this.f205116g;
            C70828b bVar3 = C70828b.Remittance;
            if (bVar2 == bVar3) {
                bVar = bVar3;
                i = 0;
                linearLayout.setPadding(C76577a.m92151b(this.f205113d, 0), C76577a.m92151b(this.f205113d, 0), C76577a.m92151b(this.f205113d, 6), C76577a.m92151b(this.f205113d, 0));
                z = true;
            } else {
                bVar = bVar3;
                i = 0;
                z = false;
            }
            if (z) {
                weImageView.setVisibility(i);
                if (Build.VERSION.SDK_INT >= 23) {
                    weImageView.setForeground(this.f205113d.getDrawable(C0966R.C0969drawable.aor));
                }
            } else {
                weImageView.setVisibility(8);
            }
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = "";
            int length = str3 != null ? str.length() : 0;
            if (length > this.f205114e) {
                e0Var2.mo140656b(false);
                textView.setTextColor(this.f205113d.getResources().getColor(C0966R.color.f2966ao));
                textView.setVisibility(0);
            } else {
                e0Var2.mo140656b(true);
                textView.setVisibility(4);
            }
            C70828b bVar4 = bVar;
            TextView textView2 = textView;
            ViewGroup viewGroup2 = viewGroup;
            WeImageView weImageView2 = weImageView;
            C8479f0 f0Var2 = f0Var;
            C8479f0 f0Var3 = f0Var;
            MMEditText mMEditText2 = mMEditText;
            weImageView2.setOnClickListener(new C70831e(this, mMEditText, a0Var, f0Var2, arrayList));
            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf(length), Integer.valueOf(this.f205114e)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            textView2.setText(format);
            mMEditText2.addTextChangedListener(new C70834f(textView2, this, e0Var2, new C8477a0(), a0Var, arrayList));
            if (!(str3 == null || str.length() == 0)) {
                mMEditText2.setText(str3);
                mMEditText2.setSelection(str.length());
            }
            e0Var2.mo140663j(viewGroup2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str4 = this.f205120n;
            if (str4 == null || str4.length() == 0) {
                spannableStringBuilder.append(this.f205113d.getString(C0966R.string.f360162ai2));
            } else {
                spannableStringBuilder.append(this.f205120n);
            }
            spannableStringBuilder.setSpan(new WcPayTextApppearanceSpan((String) null, 0, 0, (ColorStateList) null, (ColorStateList) null), 0, spannableStringBuilder.length(), 18);
            e0Var2.mo140671q(spannableStringBuilder);
            C75228t.m90240d(e0Var2.f296372C);
            e0Var2.mo140667n(this.f205113d.getString(C0966R.string.f7926wf), this.f205113d.getString(C0966R.string.a18));
            C70829c cVar2 = cVar;
            C101218e0 e0Var3 = e0Var2;
            C70835g gVar = new C70835g(cVar2, f0Var3, this, mMEditText2, e0Var3);
            C70836h hVar = new C70836h(cVar2, mMEditText2, f0Var3, this, e0Var3, arrayList);
            e0Var2.f296373D = gVar;
            e0Var2.f296374E = hVar;
            KeyboardHeightProvider keyboardHeightProvider = this.f205118i;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104022e();
            }
            e0Var2.mo140655A();
            C119179t tVar = C119157j.f356862d;
            C70837i iVar = new C70837i(mMEditText2, weImageView2);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(iVar, 50, false);
            if (this.f205116g == bVar) {
                C115669n.INSTANCE.mo160131h(22750, 1, this.f205115f);
            }
        }
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onActivityPause() {
        KeyboardHeightProvider keyboardHeightProvider = this.f205118i;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onActivityResume() {
        KeyboardHeightProvider keyboardHeightProvider = this.f205118i;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
    }
}
