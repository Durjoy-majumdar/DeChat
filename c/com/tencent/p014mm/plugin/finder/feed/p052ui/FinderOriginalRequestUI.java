package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import bd1.C54446b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C7879t1;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import je1.C9391z3;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import vf1.C14756e4;
import vf1.C14762f4;
import zc1.C66783a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderOriginalRequestUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lob0/n;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderOriginalRequestUI */
public final class FinderOriginalRequestUI extends MMFinderUI implements C11385n {

    /* renamed from: o */
    public final String f14630o = "Finder.FinderOriginalRequestUI";

    /* renamed from: p */
    public WeImageView f14631p;

    /* renamed from: q */
    public TextView f14632q;

    /* renamed from: r */
    public TextView f14633r;

    /* renamed from: s */
    public LinearLayout f14634s;

    /* renamed from: t */
    public CheckBox f14635t;

    /* renamed from: u */
    public TextView f14636u;

    /* renamed from: v */
    public Button f14637v;

    /* renamed from: w */
    public Dialog f14638w;

    /* renamed from: x */
    public int f14639x;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderOriginalRequestUI$a */
    public static final class C2996a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderOriginalRequestUI f14640d;

        public C2996a(FinderOriginalRequestUI finderOriginalRequestUI) {
            this.f14640d = finderOriginalRequestUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14640d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderOriginalRequestUI$b */
    public static final class C2997b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderOriginalRequestUI f14641d;

        public C2997b(FinderOriginalRequestUI finderOriginalRequestUI) {
            this.f14641d = finderOriginalRequestUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderOriginalRequestUI$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f14641d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderOriginalRequestUI$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderOriginalRequestUI$c */
    public static final class C2998c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderOriginalRequestUI f14642d;

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderOriginalRequestUI$c$a */
        public static final class C2999a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public static final C2999a f14643d = new C2999a();

            public final void onCancel(DialogInterface dialogInterface) {
            }
        }

        public C2998c(FinderOriginalRequestUI finderOriginalRequestUI) {
            this.f14642d = finderOriginalRequestUI;
        }

        public final void onClick(View view) {
            C13598b0 b0Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderOriginalRequestUI$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String O5 = C66785b.f191882e.mo90662O5();
            if (Util.isNullOrNil(O5)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderOriginalRequestUI$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Dialog dialog = this.f14642d.f14638w;
            if (dialog != null) {
                dialog.show();
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                FinderOriginalRequestUI finderOriginalRequestUI = this.f14642d;
                finderOriginalRequestUI.f14638w = C76879j.m92723Q(finderOriginalRequestUI.getContext(), finderOriginalRequestUI.getContext().getString(C0966R.string.a3h), finderOriginalRequestUI.getContext().getString(C0966R.string.a4d), true, false, C2999a.f14643d);
            }
            C86709a0.m107524d().mo123460f(new C9391z3(O5, true, false, 4, (C8480h) null));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderOriginalRequestUI$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: N7 */
    public final Button mo3063N7() {
        Button button = this.f14637v;
        if (button != null) {
            return button;
        }
        C87412m.m108603p("button");
        throw null;
    }

    /* renamed from: O7 */
    public final WeImageView mo3064O7() {
        WeImageView weImageView = this.f14631p;
        if (weImageView != null) {
            return weImageView;
        }
        C87412m.m108603p("iconIv");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x015f, code lost:
        r8 = r8.field_originalInfo;
     */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3065P7() {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f14639x
            r2 = 1
            java.lang.String r3 = "readLayout"
            java.lang.String r4 = "titleTv"
            java.lang.String r5 = "descTv"
            r6 = 0
            r7 = 8
            if (r1 != r2) goto L_0x007e
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r20.mo3064O7()
            r8 = 2131756011(0x7f1003eb, float:1.9142917E38)
            r1.setImageResource(r8)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r20.mo3064O7()
            android.content.res.Resources r8 = r20.getResources()
            r9 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r8 = r8.getColor(r9)
            r1.setIconColor(r8)
            android.widget.TextView r1 = r0.f14632q
            if (r1 == 0) goto L_0x007a
            r4 = 2131829386(0x7f11228a, float:1.929174E38)
            java.lang.String r4 = r0.getString(r4)
            r1.setText(r4)
            android.widget.TextView r1 = r0.f14633r
            if (r1 == 0) goto L_0x0076
            r4 = 2131829385(0x7f112289, float:1.9291738E38)
            r1.setText(r4)
            android.widget.LinearLayout r1 = r0.f14634s
            if (r1 == 0) goto L_0x0072
            r1.setVisibility(r7)
            android.widget.Button r1 = r20.mo3063N7()
            r1.setClickable(r2)
            android.widget.Button r1 = r20.mo3063N7()
            r1.setEnabled(r2)
            android.widget.Button r1 = r20.mo3063N7()
            r2 = 2131821539(0x7f1103e3, float:1.9275824E38)
            r1.setText(r2)
            android.widget.Button r1 = r20.mo3063N7()
            com.tencent.mm.plugin.finder.feed.ui.FinderOriginalRequestUI$b r2 = new com.tencent.mm.plugin.finder.feed.ui.FinderOriginalRequestUI$b
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            goto L_0x01e8
        L_0x0072:
            gy3.C87412m.m108603p(r3)
            throw r6
        L_0x0076:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x007a:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x007e:
            java.lang.String r8 = "getString(R.string.finde…original_agree_tips_link)"
            r9 = 2131829372(0x7f11227c, float:1.9291711E38)
            r10 = 2131099866(0x7f0600da, float:1.7812097E38)
            java.lang.String r11 = "context"
            r12 = 0
            if (r1 != 0) goto L_0x012b
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r20.mo3064O7()
            r7 = 2131755728(0x7f1002d0, float:1.9142343E38)
            r1.setImageResource(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r20.mo3064O7()
            android.content.res.Resources r7 = r20.getResources()
            int r7 = r7.getColor(r10)
            r1.setIconColor(r7)
            android.widget.TextView r1 = r0.f14632q
            if (r1 == 0) goto L_0x0127
            r4 = 2131829378(0x7f112282, float:1.9291723E38)
            java.lang.String r4 = r0.getString(r4)
            r1.setText(r4)
            android.widget.TextView r1 = r0.f14633r
            if (r1 == 0) goto L_0x0123
            r4 = 2131829375(0x7f11227f, float:1.9291717E38)
            java.lang.String r4 = r0.getString(r4)
            r1.setText(r4)
            java.lang.String r1 = r0.getString(r9)
            gy3.C87412m.m108593f(r1, r8)
            r4 = 2131829371(0x7f11227b, float:1.929171E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r12] = r1
            java.lang.String r2 = r0.getString(r4, r2)
            java.lang.String r4 = "getString(R.string.finde…_agree_tips, readingText)"
            gy3.C87412m.m108593f(r2, r4)
            er1.t1 r13 = er1.C7879t1.f26497a
            androidx.appcompat.app.AppCompatActivity r14 = r20.getContext()
            gy3.C87412m.m108593f(r14, r11)
            java.lang.String r15 = er1.C7879t1.f26498b
            android.widget.TextView r4 = r0.f14636u
            if (r4 == 0) goto L_0x011d
            java.lang.String r5 = r0.f14630o
            r16 = r2
            r17 = r1
            r18 = r4
            r19 = r5
            r13.mo8995c(r14, r15, r16, r17, r18, r19)
            android.widget.LinearLayout r1 = r0.f14634s
            if (r1 == 0) goto L_0x0119
            r1.setVisibility(r12)
            android.widget.Button r1 = r20.mo3063N7()
            r1.setVisibility(r12)
            android.widget.Button r1 = r20.mo3063N7()
            r2 = 2131829373(0x7f11227d, float:1.9291713E38)
            r1.setText(r2)
            android.widget.Button r1 = r20.mo3063N7()
            com.tencent.mm.plugin.finder.feed.ui.FinderOriginalRequestUI$c r2 = new com.tencent.mm.plugin.finder.feed.ui.FinderOriginalRequestUI$c
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            goto L_0x01e8
        L_0x0119:
            gy3.C87412m.m108603p(r3)
            throw r6
        L_0x011d:
            java.lang.String r1 = "readContentTv"
            gy3.C87412m.m108603p(r1)
            throw r6
        L_0x0123:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0127:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x012b:
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r20.mo3064O7()
            r13 = 2131756021(0x7f1003f5, float:1.9142938E38)
            r1.setImageResource(r13)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r20.mo3064O7()
            android.content.res.Resources r13 = r20.getResources()
            int r10 = r13.getColor(r10)
            r1.setIconColor(r10)
            android.widget.TextView r1 = r0.f14632q
            if (r1 == 0) goto L_0x01f1
            r4 = 2131829396(0x7f112294, float:1.929176E38)
            r1.setText(r4)
            java.lang.String r1 = r0.getString(r9)
            gy3.C87412m.m108593f(r1, r8)
            er1.t1 r13 = er1.C7879t1.f26497a
            zc1.b r4 = zc1.C66785b.f191882e
            bd1.b r8 = zc1.C66783a.C66784a.m78800c(r4, r12, r2, r6)
            if (r8 == 0) goto L_0x0166
            te3.jg1 r8 = r8.field_originalInfo
            if (r8 == 0) goto L_0x0166
            int r8 = r8.f136107g
            goto L_0x0167
        L_0x0166:
            r8 = 0
        L_0x0167:
            if (r8 <= 0) goto L_0x016b
            r8 = 1
            goto L_0x016c
        L_0x016b:
            r8 = 0
        L_0x016c:
            if (r8 == 0) goto L_0x019d
            androidx.appcompat.app.AppCompatActivity r14 = r20.getContext()
            gy3.C87412m.m108593f(r14, r11)
            java.lang.String r15 = er1.C7879t1.f26498b
            r4 = 2131829395(0x7f112293, float:1.9291758E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r12] = r1
            java.lang.String r2 = r0.getString(r4, r2)
            java.lang.String r4 = "getString(R.string.finde…nal_spam_desc2, linkText)"
            gy3.C87412m.m108593f(r2, r4)
            android.widget.TextView r4 = r0.f14633r
            if (r4 == 0) goto L_0x0199
            java.lang.String r5 = r0.f14630o
            r16 = r2
            r17 = r1
            r18 = r4
            r19 = r5
            r13.mo8995c(r14, r15, r16, r17, r18, r19)
            goto L_0x01da
        L_0x0199:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x019d:
            androidx.appcompat.app.AppCompatActivity r14 = r20.getContext()
            gy3.C87412m.m108593f(r14, r11)
            java.lang.String r15 = er1.C7879t1.f26498b
            r8 = 2131829394(0x7f112292, float:1.9291756E38)
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r12] = r1
            bd1.b r4 = zc1.C66783a.C66784a.m78800c(r4, r12, r2, r6)
            if (r4 == 0) goto L_0x01ba
            te3.jg1 r4 = r4.field_originalInfo
            if (r4 == 0) goto L_0x01ba
            int r12 = r4.f136106f
        L_0x01ba:
            java.lang.String r4 = java.lang.String.valueOf(r12)
            r9[r2] = r4
            java.lang.String r2 = r0.getString(r8, r9)
            java.lang.String r4 = "getString(R.string.finde….getSpamDay().toString())"
            gy3.C87412m.m108593f(r2, r4)
            android.widget.TextView r4 = r0.f14633r
            if (r4 == 0) goto L_0x01ed
            java.lang.String r5 = r0.f14630o
            r16 = r2
            r17 = r1
            r18 = r4
            r19 = r5
            r13.mo8995c(r14, r15, r16, r17, r18, r19)
        L_0x01da:
            android.widget.LinearLayout r1 = r0.f14634s
            if (r1 == 0) goto L_0x01e9
            r1.setVisibility(r7)
            android.widget.Button r1 = r20.mo3063N7()
            r1.setVisibility(r7)
        L_0x01e8:
            return
        L_0x01e9:
            gy3.C87412m.m108603p(r3)
            throw r6
        L_0x01ed:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x01f1:
            gy3.C87412m.m108603p(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderOriginalRequestUI.mo3065P7():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.amx;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7879t1 t1Var = C7879t1.f26497a;
        boolean z = false;
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        if ((c != null ? c.field_originalEntranceFlag : 0) == 3) {
            z = true;
        }
        if (z) {
            this.f14639x = 2;
        }
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setMMTitle("");
        setBackBtn(new C2996a(this));
        View findViewById = findViewById(C0966R.C0970id.hp5);
        C87412m.m108593f(findViewById, "findViewById(R.id.original_icon_iv)");
        this.f14631p = (WeImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.hpg);
        C87412m.m108593f(findViewById2, "findViewById(R.id.original_title_tv)");
        this.f14632q = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.f358894hp3);
        C87412m.m108593f(findViewById3, "findViewById(R.id.original_desc_tv)");
        this.f14633r = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f358893hp2);
        C87412m.m108593f(findViewById4, "findViewById(R.id.original_checkbox_layout)");
        this.f14634s = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.f358892hp1);
        C87412m.m108593f(findViewById5, "findViewById(R.id.original_checkbox)");
        this.f14635t = (CheckBox) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.hpd);
        C87412m.m108593f(findViewById6, "findViewById(R.id.original_read_tv)");
        this.f14636u = (TextView) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.apy);
        C87412m.m108593f(findViewById7, "findViewById(R.id.cancel_btn)");
        this.f14637v = (Button) findViewById7;
        CheckBox checkBox = this.f14635t;
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new C14756e4(this));
            LinearLayout linearLayout = this.f14634s;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new C14762f4(this));
                mo3065P7();
                C86709a0.m107524d().mo123455a(3785, this);
                return;
            }
            C87412m.m108603p("readLayout");
            throw null;
        }
        C87412m.m108603p("readCheckBox");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3785, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Dialog dialog = this.f14638w;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (i == 0 && i2 == 0) {
            this.f14639x = 1;
            mo3065P7();
            return;
        }
        C76912y0.makeText((Context) this, (int) C0966R.string.eef, 0).show();
    }
}
