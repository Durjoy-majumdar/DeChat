package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGameWelfareTaskProgressItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView */
public final class FinderLiveGameWelfareTaskProgressItemView extends LinearLayout {

    /* renamed from: d */
    public final RelativeLayout f111656d;

    /* renamed from: e */
    public final RoundProgressBtn f111657e;

    /* renamed from: f */
    public final ImageView f111658f;

    /* renamed from: g */
    public final TextView f111659g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderLiveGameWelfareTaskProgressItemView(Context context, AttributeSet attributeSet, int i, C8480h hVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64552a(te3.C51733vs1 r10) {
        /*
            r9 = this;
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.String r2 = "task"
            gy3.C87412m.m108594g(r10, r2)
            te3.rs1 r2 = r10.f143669d
            r3 = 0
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = r2.f141111e
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0020
            int r2 = r2.length()
            if (r2 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r2 = 0
            goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            if (r2 != 0) goto L_0x0067
            te3.rs1 r2 = r10.f143669d
            if (r2 == 0) goto L_0x002d
            boolean r2 = r2.f141112f
            if (r2 != r4) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 == 0) goto L_0x0031
            goto L_0x0067
        L_0x0031:
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r1)
            bl3.c r2 = r2.mo62447c(r0)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11871f2()
            pl1.f r6 = new pl1.f
            te3.rs1 r7 = r10.f143669d
            if (r7 == 0) goto L_0x004a
            java.lang.String r7 = r7.f141111e
            goto L_0x004b
        L_0x004a:
            r7 = r3
        L_0x004b:
            r8 = 2
            r6.<init>(r7, r3, r8, r3)
            android.widget.ImageView r3 = r9.f111658f
            pl1.e0$a r7 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r r8 = bl3.C39818r.f106831a
            bl3.r$a r1 = r8.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r7)
            r2.mo85957c(r6, r3, r0)
            goto L_0x006f
        L_0x0067:
            android.widget.ImageView r0 = r9.f111658f
            r1 = 2131233239(0x7f0809d7, float:1.808261E38)
            r0.setImageResource(r1)
        L_0x006f:
            boolean r0 = r10.f143670e
            if (r0 == 0) goto L_0x009b
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r9.f111657e
            r0.setVisibility(r5)
            java.lang.String r0 = r10.f143672g
            if (r0 == 0) goto L_0x0085
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r0 = 0
            goto L_0x0086
        L_0x0085:
            r0 = 1
        L_0x0086:
            if (r0 != 0) goto L_0x0093
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r9.f111657e
            java.lang.String r1 = r10.f143672g
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setProgressColor(r1)
        L_0x0093:
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r9.f111657e
            int r1 = r10.f143671f
            r0.setProgress(r1)
            goto L_0x00a2
        L_0x009b:
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r9.f111657e
            r1 = 8
            r0.setVisibility(r1)
        L_0x00a2:
            android.widget.RelativeLayout r0 = r9.f111656d
            r0.setVisibility(r5)
            android.widget.TextView r0 = r9.f111659g
            java.lang.String r10 = r10.f143673h
            java.lang.String r1 = ""
            if (r10 != 0) goto L_0x00b0
            r10 = r1
        L_0x00b0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#getLicenseText wording="
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLiveGameWelfareTaskProgressItemView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            int r2 = r10.length()
            if (r2 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r4 = 0
        L_0x00ce:
            if (r4 == 0) goto L_0x00d6
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r1)
            goto L_0x00e4
        L_0x00d6:
            com.tencent.mm.plugin.finder.live.view.n0 r1 = new com.tencent.mm.plugin.finder.live.view.n0
            r1.<init>(r9)
            java.lang.CharSequence r10 = com.tencent.p014mm.plugin.appbrand.utils.html.C84746b.m104407a(r10, r5, r1)
            java.lang.String r1 = "private fun transHtml(wo…       })\n        }\n    }"
            gy3.C87412m.m108593f(r10, r1)
        L_0x00e4:
            r0.setText(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView.mo64552a(te3.vs1):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGameWelfareTaskProgressItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(context, C0966R.C0971layout.agn, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.enz);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id…ask_progress_round_group)");
        this.f111656d = (RelativeLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.eny);
        C87412m.m108593f(findViewById2, "parent.findViewById(R.id.game_task_progress_round)");
        this.f111657e = (RoundProgressBtn) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.enx);
        C87412m.m108593f(findViewById3, "parent.findViewById(R.id.game_task_progress_iv)");
        this.f111658f = (ImageView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f358363eo0);
        C87412m.m108593f(findViewById4, "parent.findViewById(R.id.game_task_progress_tv)");
        this.f111659g = (TextView) findViewById4;
    }
}
