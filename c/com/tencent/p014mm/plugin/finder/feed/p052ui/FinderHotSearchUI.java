package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import f40.C86709a0;
import gy3.C87412m;
import hp1.C8690s0;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderHotSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickCancelBtn", "onClickBackBtn", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI */
public final class FinderHotSearchUI extends MMFinderUI implements FTSSearchView.C6995e {

    /* renamed from: q */
    public static final /* synthetic */ int f14427q = 0;

    /* renamed from: o */
    public FTSSearchView f14428o;

    /* renamed from: p */
    public C8690s0 f14429p;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI$a */
    public static final class C2937a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderHotSearchUI f14430d;

        public C2937a(FinderHotSearchUI finderHotSearchUI) {
            this.f14430d = finderHotSearchUI;
        }

        public final void run() {
            C8690s0 s0Var = this.f14430d.f14429p;
            if (s0Var != null) {
                s0Var.mo9535b();
            }
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 125;
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return "FinderHotSearchUI";
    }

    public int getLayoutId() {
        return C0966R.C0971layout.anb;
    }

    public void onClickBackBtn(View view) {
        hideVKB();
        if (!isFinishing()) {
            finish();
        }
    }

    public void onClickCancelBtn(View view) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00fc, code lost:
        if (r2 != false) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            super.onCreate(r18)
            com.tencent.mm.ui.search.FTSSearchView r1 = new com.tencent.mm.ui.search.FTSSearchView
            r2 = 0
            r1.<init>((android.content.Context) r0, (boolean) r2)
            r0.f14428o = r1
            r1.setSearchViewListener(r0)
            com.tencent.mm.ui.search.FTSSearchView r1 = r0.f14428o
            java.lang.String r3 = "searchView"
            r4 = 0
            if (r1 == 0) goto L_0x01a7
            com.tencent.mm.ui.search.FTSEditTextView r1 = r1.getFtsEditText()
            r5 = 2131821674(0x7f11046a, float:1.9276098E38)
            java.lang.String r5 = r0.getString(r5)
            r1.setHint(r5)
            com.tencent.mm.ui.search.FTSSearchView r1 = r0.f14428o
            if (r1 == 0) goto L_0x01a3
            com.tencent.mm.ui.search.FTSEditTextView r1 = r1.getFtsEditText()
            r1.setCanDeleteTag(r2)
            com.tencent.mm.ui.search.FTSSearchView r1 = r0.f14428o
            if (r1 == 0) goto L_0x019f
            vf1.t0 r5 = new vf1.t0
            r5.<init>(r0)
            android.widget.LinearLayout r6 = r1.f24723f
            r7 = 8
            r6.setVisibility(r7)
            android.widget.LinearLayout r6 = r1.f24724g
            r6.setVisibility(r2)
            r6 = 2131306011(0x7f09261b, float:1.823021E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6 = 2131297513(0x7f0904e9, float:1.8212973E38)
            android.view.View r6 = r1.findViewById(r6)
            r1.f24722e = r6
            com.tencent.mm.ui.search.b r8 = new com.tencent.mm.ui.search.b
            r8.<init>(r1)
            r6.setOnClickListener(r8)
            android.widget.LinearLayout r6 = r1.f24724g
            r8 = 1
            r6.setClickable(r8)
            android.widget.LinearLayout r6 = r1.f24724g
            r6.setOnClickListener(r5)
            android.view.View r5 = r1.f24722e
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r6.mo10233c(r9)
            java.lang.Object[] r10 = r6.mo10232b()
            java.lang.String r11 = "com/tencent/mm/ui/search/FTSSearchView"
            java.lang.String r12 = "initHotSearchPage"
            java.lang.String r13 = "(Landroid/view/View$OnClickListener;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r5
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r6 = r6.mo10231a(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r10 = "com/tencent/mm/ui/search/FTSSearchView"
            java.lang.String r11 = "initHotSearchPage"
            java.lang.String r12 = "(Landroid/view/View$OnClickListener;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.widget.TextView r1 = r1.f24721d
            r1.setVisibility(r7)
            com.tencent.mm.ui.search.FTSSearchView r1 = r0.f14428o
            if (r1 == 0) goto L_0x019b
            com.tencent.mm.ui.search.FTSEditTextView r1 = r1.getFtsEditText()
            r1.mo70338f()
            androidx.appcompat.app.ActionBar r1 = r17.getSupportActionBar()
            gy3.C87412m.m108591d(r1)
            com.tencent.mm.ui.search.FTSSearchView r5 = r0.f14428o
            if (r5 == 0) goto L_0x0197
            r1.mo91114y(r5)
            hp1.s0 r1 = new hp1.s0
            vf1.s0 r3 = new vf1.s0
            r3.<init>(r0)
            r1.<init>(r0, r3)
            r0.f14429p = r1
            ob0.b0 r3 = f40.C86709a0.m107524d()
            r5 = 4069(0xfe5, float:5.702E-42)
            r3.mo123455a(r5, r1)
            r1.mo9537d()
            int r3 = eb0.C31543z5.m39455e()
            int r5 = hp1.C8690s0.C8695e.f27917b
            if (r5 == 0) goto L_0x00fe
            int r5 = r3 - r5
            r6 = 60
            if (r5 > r6) goto L_0x00fe
            java.util.List<? extends te3.ak1> r5 = r1.f27906o
            if (r5 == 0) goto L_0x00fc
            boolean r5 = r5.isEmpty()
            if (r5 != r8) goto L_0x00fc
            r2 = 1
        L_0x00fc:
            if (r2 == 0) goto L_0x0134
        L_0x00fe:
            hp1.C8690s0.C8695e.f27917b = r3
            ob0.b0 r2 = f40.C86709a0.m107524d()
            je1.v4 r3 = r1.f27900f
            r2.mo123458d(r3)
            je1.v4 r2 = new je1.v4
            r6 = 10
            r7 = 0
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r5 = r1.f27901g
            rs1.s8 r3 = r3.mo12873f(r5)
            if (r3 == 0) goto L_0x011e
            te3.hj1 r3 = r3.mo12861q3()
            r8 = r3
            goto L_0x011f
        L_0x011e:
            r8 = r4
        L_0x011f:
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 56
            r13 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.f27900f = r2
            ob0.b0 r2 = f40.C86709a0.m107524d()
            je1.v4 r1 = r1.f27900f
            r2.mo123460f(r1)
        L_0x0134:
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            di3.d r2 = di3.C86312j.m106911c(r1)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r5 = eb0.C31543z5.m39453c()
            java.lang.String r3 = java.lang.String.valueOf(r5)
            r2.f167351e = r3
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r8 = r2.toString()
            java.lang.String r2 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r8, r2)
            di3.d r2 = di3.C86312j.m106911c(r1)
            r5 = r2
            dp1.y0 r5 = (dp1.C58417y0) r5
            r6 = 1
            di3.d r1 = di3.C86312j.m106911c(r1)
            dp1.y0 r1 = (dp1.C58417y0) r1
            java.lang.String r7 = r1.f167351e
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 0
            r14 = 0
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r2 = r17.getContext()
            java.lang.String r3 = "context"
            gy3.C87412m.m108593f(r2, r3)
            rs1.s8 r1 = r1.mo12873f(r2)
            if (r1 == 0) goto L_0x017d
            te3.hj1 r4 = r1.mo12861q3()
        L_0x017d:
            r15 = r4
            java.lang.String r9 = ""
            r5.ay0(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            o31.b r2 = o31.C11345b.FinderMixSearchUI_Finder
            l31.e r1 = r1.mo86178qr(r0, r2)
            o31.a r2 = o31.C76986a.Finder
            r1.mo86179qs(r0, r2)
            return
        L_0x0197:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x019b:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x019f:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x01a3:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x01a7:
            gy3.C87412m.m108603p(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHotSearchUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C8690s0 s0Var = this.f14429p;
        if (s0Var != null) {
            C86709a0.m107524d().mo123470p(4069, s0Var);
        }
    }

    public void onResume() {
        super.onResume();
        FTSSearchView fTSSearchView = this.f14428o;
        if (fTSSearchView != null) {
            fTSSearchView.post(new C2937a(this));
            C8690s0 s0Var = this.f14429p;
            if (s0Var != null) {
                s0Var.mo9536c();
                return;
            }
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public void onSwipeBack() {
        super.onSwipeBack();
        hideVKB();
    }
}
