package kf1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import cm1.C0800z1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.C4105m5;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import p447aw.C103918d;

/* renamed from: kf1.c7 */
public final class C9669c7 extends C9753h {

    /* renamed from: A */
    public int f30038A;

    /* renamed from: u */
    public View f30039u;

    /* renamed from: v */
    public View f30040v;

    /* renamed from: w */
    public TextView f30041w;

    /* renamed from: x */
    public TextView f30042x;

    /* renamed from: y */
    public C4105m5<String> f30043y;

    /* renamed from: z */
    public boolean f30044z;

    /* renamed from: kf1.c7$a */
    public static final class C9670a extends RecyclerView.C0129l {
    }

    /* renamed from: kf1.c7$b */
    public static final class C9671b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f30045d;

        public C9671b(View view) {
            this.f30045d = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$onRetryShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View findViewById = this.f30045d.findViewById(C0966R.C0970id.is_);
            if (findViewById != null) {
                findViewById.callOnClick();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$onRetryShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9669c7(com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiRelateListUI r9, int r10, int r11, boolean r12, int r13, gy3.C8480h r14) {
        /*
            r8 = this;
            r13 = r13 & 8
            if (r13 == 0) goto L_0x0007
            r12 = 0
            r4 = 0
            goto L_0x0008
        L_0x0007:
            r4 = r12
        L_0x0008:
            java.lang.String r12 = "context"
            gy3.C87412m.m108594g(r9, r12)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9669c7.<init>(com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI, int, int, boolean, int, gy3.h):void");
    }

    /* renamed from: F0 */
    public View mo9289F0() {
        View inflate = View.inflate(this.f30214d, C0966R.C0971layout.an8, (ViewGroup) null);
        this.f30039u = inflate;
        return inflate;
    }

    /* renamed from: G0 */
    public RecyclerView.C0129l mo9290G0() {
        return new C9670a();
    }

    /* renamed from: H0 */
    public RecyclerView.LayoutManager mo9291H0(Context context) {
        C87412m.m108594g(context, "context");
        FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new FinderStaggeredGridLayoutManager(1, 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        return finderStaggeredGridLayoutManager;
    }

    /* renamed from: J0 */
    public CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: Q0 */
    public void mo9294Q0(RecyclerView.C16613e<?> eVar, View view, int i) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        CheckBox checkBox = (CheckBox) view.findViewById(C0966R.C0970id.aya);
        int size = mo10348I0().f30175e.getSize();
        int i2 = i - 1;
        if (checkBox != null) {
            if (size > 0 && i2 < size) {
                C0740i2 i2Var = (C0740i2) mo10348I0().f30175e.getDataListJustForAdapter().get(i2);
                if (i2Var instanceof C0800z1) {
                    C0800z1 z1Var = (C0800z1) i2Var;
                    boolean z = !checkBox.isChecked();
                    z1Var.f1861e = z;
                    if (z) {
                        this.f30038A++;
                    } else {
                        this.f30038A--;
                    }
                    Log.m105924i("Finder.FinderPoiRelateUIContract", "[onGridItemClick], " + i + ", " + i2 + ", " + this.f30038A + ", " + z1Var.f1861e);
                }
            }
            checkBox.setChecked(!checkBox.isChecked());
            mo10290d1();
        }
    }

    /* renamed from: R0 */
    public void mo9295R0() {
    }

    /* renamed from: T0 */
    public void mo10285T0(boolean z) {
        View m0 = mo9299m0();
        if (m0 != null) {
            WeImageView weImageView = (WeImageView) m0.findViewById(C0966R.C0970id.is7);
            if (z) {
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                    weImageView.setOnClickListener(new C9671b(m0));
                }
            } else if (weImageView != null) {
                weImageView.setVisibility(8);
            }
        }
    }

    /* renamed from: V0 */
    public void mo10286V0() {
        this.f30043y = new C4105m5<>(this.f30214d, (C4105m5.C4106a) null, 2, (C8480h) null);
        View view = this.f30039u;
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.g1a);
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new C9744g7(this));
            }
            WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.f359597lr0);
            if (weImageView != null) {
                weImageView.setOnClickListener(new C9779h7(this));
            }
        }
        super.mo10286V0();
    }

    /* renamed from: a1 */
    public boolean mo10287a1() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo10288b1() {
        if (((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this.f30214d, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64, (String) null, (String) null)) {
            mo10289c1();
        }
    }

    /* renamed from: c1 */
    public final void mo10289c1() {
        Intent intent = new Intent();
        intent.putExtra("map_view_type", 8);
        intent.putExtra("type_tag", -1);
        intent.putExtra("type_pick_location_btn", 2);
        C88144b.m109795m(this.f30214d, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 16666);
        C5139t.m5183e(5, 10);
    }

    /* renamed from: d1 */
    public final void mo10290d1() {
        if (this.f30038A > 0) {
            TextView textView = this.f30042x;
            if (textView != null) {
                textView.setBackgroundResource(C0966R.C0969drawable.a3h);
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.al8));
                return;
            }
            return;
        }
        TextView textView2 = this.f30042x;
        if (textView2 != null) {
            textView2.setBackgroundResource(C0966R.C0969drawable.a3i);
            textView2.setTextColor(textView2.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f30214d;
    }

    /* renamed from: k0 */
    public String mo9298k0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: m0 */
    public View mo9299m0() {
        return this.f30214d.findViewById(C0966R.C0970id.cjg);
    }
}
