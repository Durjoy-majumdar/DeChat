package kq1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.p056ui.fav.FinderGlobalFavFeedFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderFavFeedFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderLikeFeedGridFragment;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58784w3;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ls1.C10646d;
import ls1.C61385b;
import ls1.C61386e;
import ls1.C61387f;
import ls1.C61391g;
import ls1.C61393j;
import ls1.C61395m;
import ls1.C61396n;
import sx3.C64197v;

/* renamed from: kq1.b */
public final class C61132b extends C61387f {

    /* renamed from: u */
    public Fragment f174044u;

    /* renamed from: kq1.b$b */
    public static final class C10387b extends C10646d {

        /* renamed from: k */
        public final String f31594k;

        /* renamed from: l */
        public final int f31595l;

        /* renamed from: m */
        public final int f31596m;

        /* renamed from: n */
        public final int f31597n = ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3766df));

        /* renamed from: o */
        public WeImageView f31598o;

        /* renamed from: p */
        public View f31599p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10387b(String str, int i, int i2) {
            super((CharSequence) "");
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            this.f31594k = str;
            this.f31595l = i;
            this.f31596m = i2;
        }

        /* renamed from: a */
        public int mo3852a() {
            return C0966R.C0971layout.d6c;
        }

        /* renamed from: c */
        public void mo3854c(ViewGroup viewGroup) {
            super.mo3854c(viewGroup);
            if (viewGroup != null) {
                viewGroup.setContentDescription(this.f31594k);
                View findViewById = viewGroup.findViewById(C0966R.C0970id.o48);
                C87412m.m108593f(findViewById, "findViewById(R.id.tab_title_icon)");
                this.f31598o = (WeImageView) findViewById;
                View findViewById2 = viewGroup.findViewById(C0966R.C0970id.o4l);
                C87412m.m108593f(findViewById2, "findViewById(R.id.underline_view)");
                this.f31599p = findViewById2;
                WeImageView weImageView = this.f31598o;
                if (weImageView != null) {
                    weImageView.mo104518r(this.f31595l, C0966R.color.BW_0_Alpha_0_5);
                } else {
                    C87412m.m108603p("titleIcon");
                    throw null;
                }
            }
        }

        /* renamed from: d */
        public void mo3855d(boolean z, ViewGroup viewGroup) {
            C87412m.m108594g(viewGroup, "tabView");
            super.mo3855d(z, viewGroup);
            if (z) {
                View view = this.f31599p;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uic/FinderMixCellTabUIC$Tab", "onTabStatusChanged", "(ZLandroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/uic/FinderMixCellTabUIC$Tab", "onTabStatusChanged", "(ZLandroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    WeImageView weImageView = this.f31598o;
                    if (weImageView != null) {
                        weImageView.mo104518r(this.f31596m, C0966R.color.a7f);
                    } else {
                        C87412m.m108603p("titleIcon");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("underLineView");
                    throw null;
                }
            } else {
                View view3 = this.f31599p;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/uic/FinderMixCellTabUIC$Tab", "onTabStatusChanged", "(ZLandroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/uic/FinderMixCellTabUIC$Tab", "onTabStatusChanged", "(ZLandroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    WeImageView weImageView2 = this.f31598o;
                    if (weImageView2 != null) {
                        weImageView2.mo104518r(this.f31595l, C0966R.color.BW_0_Alpha_0_5);
                    } else {
                        C87412m.m108603p("titleIcon");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("underLineView");
                    throw null;
                }
            }
        }

        /* renamed from: n */
        public int[] mo10704n() {
            int i = this.f31597n;
            return new int[]{i, i};
        }
    }

    /* renamed from: kq1.b$a */
    public final class C61133a extends C61386e {
        public C61133a() {
        }

        /* renamed from: a */
        public C61396n mo86085a() {
            return new C61385b(1);
        }

        public List<FinderHomeTabFragment> fragments() {
            return C64197v.m75534c(new FinderLikeFeedGridFragment(), new FinderFavFeedFragment(), new FinderGlobalFavFeedFragment());
        }

        public C61395m tabContainer() {
            return new C61134c();
        }

        public List<C61391g> tabs() {
            C58784w3 w3Var = C58784w3.f168295a;
            Integer b0 = w3Var.mo83917b0(1, true);
            int intValue = b0 != null ? b0.intValue() : C0966R.raw.icons_filled_channels_like_bold;
            C10387b[] bVarArr = new C10387b[3];
            String string = C61132b.this.getString(C0966R.string.fo7);
            Integer c0 = C58784w3.m68436c0(w3Var, 1, false, 2, (Object) null);
            bVarArr[0] = new C10387b(string, c0 != null ? c0.intValue() : C0966R.raw.icons_filled_channels_like_thick, intValue);
            bVarArr[1] = new C10387b(C61132b.this.getString(C0966R.string.n__), C0966R.raw.icons_outlined_star_new, C0966R.raw.icons_outlined_star_new_bold);
            bVarArr[2] = new C10387b(C61132b.this.getString(C0966R.string.n_9), C0966R.raw.icons_filled_channels_fav_thick, C0966R.raw.icons_filled_channels_fav_bold);
            return C64197v.m75534c(bVarArr);
        }
    }

    /* renamed from: kq1.b$c */
    public static final class C61134c extends C61393j {
        /* renamed from: g */
        public int mo78528g() {
            return C0966R.C0970id.kcj;
        }

        public int getLayoutId() {
            return C0966R.C0971layout.d6b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61132b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        if (up1.C37521f.f99532u7.mo60266n().intValue() == 1) goto L_0x0037;
     */
    /* renamed from: Z3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80050Z3(int r13, boolean r14) {
        /*
            r12 = this;
            super.mo80050Z3(r13, r14)
            bl3.r r14 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r0 = r12.getActivity()
            bl3.r$a r14 = r14.mo62444c(r0)
            java.lang.Class<kq1.a> r0 = kq1.C10385a.class
            androidx.lifecycle.i0 r14 = r14.mo75002a(r0)
            kq1.a r14 = (kq1.C10385a) r14
            r14.getClass()
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L_0x0022
            if (r13 == r0) goto L_0x0022
            r2 = 2
            if (r13 == r2) goto L_0x0022
            goto L_0x0036
        L_0x0022:
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99532u7
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "enableSearch: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Finder.FinderMixCellSearchUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            android.view.View r14 = r14.f31592d
            if (r14 != 0) goto L_0x0052
            goto L_0x0098
        L_0x0052:
            if (r0 == 0) goto L_0x0056
            r0 = 0
            goto L_0x0058
        L_0x0056:
            r0 = 8
        L_0x0058:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo10233c(r0)
            java.lang.Object[] r5 = r2.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/uic/FinderMixCellSearchUIC"
            java.lang.String r7 = "enableSearch"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r14
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r2.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r14.setVisibility(r0)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/uic/FinderMixCellSearchUIC"
            java.lang.String r6 = "enableSearch"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x0098:
            java.util.List r14 = r12.mo80061o3()
            java.lang.Object r13 = sx3.C110818d0.m150917O(r14, r13)
            androidx.fragment.app.Fragment r13 = (androidx.fragment.app.Fragment) r13
            r12.f174044u = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kq1.C61132b.mo80050Z3(int, boolean):void");
    }

    /* renamed from: m3 */
    public IFinderTabProvider mo11417m3() {
        return new C61133a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        ViewPager viewPager = this.f162509g;
        if (viewPager instanceof FinderViewPager) {
            ((FinderViewPager) viewPager).setEnableViewPagerScroll(true);
        }
    }
}
