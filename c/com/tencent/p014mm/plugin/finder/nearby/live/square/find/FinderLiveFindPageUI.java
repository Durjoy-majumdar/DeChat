package com.tencent.p014mm.plugin.finder.nearby.live.square.find;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C112919c0;
import bl3.C0324s;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import fm1.C8138e;
import gg1.C32444a;
import gm1.C8359a;
import gy3.C24560g0;
import ht1.C8809w2;
import ht1.C8815x4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import l31.C61212e;
import ln1.C10585g;
import ln1.C21445b;
import ns3.C11266d;
import o31.C11345b;
import pe1.C35464c;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C110826x0;
import sx3.C90364q0;
import t91.C64208c;
import vc1.C37715b;
import vo3.C90852c;
import wm1.C15530g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI */
public final class FinderLiveFindPageUI extends MMFinderUI {

    /* renamed from: o */
    public final FinderLiveFindPageFragment f15675o = new FinderLiveFindPageFragment();

    /* renamed from: p */
    public boolean f15676p;

    /* renamed from: q */
    public final boolean f15677q = C37715b.f99914a.mo61298a();

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI$a */
    public static final class C3309a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFindPageUI f15678d;

        public C3309a(FinderLiveFindPageUI finderLiveFindPageUI) {
            this.f15678d = finderLiveFindPageUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f15678d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI$b */
    public static final class C3310b implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveFindPageUI f15679a;

        public C3310b(FinderLiveFindPageUI finderLiveFindPageUI) {
            this.f15679a = finderLiveFindPageUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            TabLayout.C55061f k;
            View view = this.f15679a.f15675o.f165437h;
            Integer num = null;
            TabLayout tabLayout = view != null ? (TabLayout) view.findViewById(C0966R.C0970id.f359340kd1) : null;
            Object obj = (tabLayout == null || (k = tabLayout.mo146907k(tabLayout != null ? tabLayout.getSelectedTabPosition() : 0)) == null) ? null : k.f154600a;
            C15530g.C15531a aVar = obj instanceof C15530g.C15531a ? (C15530g.C15531a) obj : null;
            int i = aVar != null ? aVar.f42116c : -1;
            C13604l[] lVarArr = new C13604l[2];
            Intent intent = this.f15679a.getIntent();
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra("enter_from_type", -1));
            }
            lVarArr[0] = new C13604l("enter_from_type", num);
            lVarArr[1] = new C13604l("live_tab_id", Integer.valueOf(i));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return "FinderLiveFindPageUI";
    }

    public void finish() {
        this.f15676p = true;
        C10585g.f31933a.mo10845c();
        super.finish();
    }

    public int getLayoutId() {
        return this.f15677q ? C0966R.C0971layout.ah4 : C0966R.C0971layout.f359729ah3;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C8138e.class, C0324s.m265a(C24560g0.m30725a(C8815x4.class)), C8359a.class, C0324s.m265a(C24560g0.m30725a(C8809w2.class)));
    }

    public void onCreate(Bundle bundle) {
        int i;
        Class cls = C61212e.class;
        super.onCreate(bundle);
        getWindow().setNavigationBarColor(0);
        getWindow().addFlags(134217728);
        C39818r rVar = C39818r.f106831a;
        String str = ((C13442s8) rVar.mo62444c(this).mo75002a(C13442s8.class)).f38098n;
        if (str == null || str.length() == 0) {
            Log.m105924i("FinderLiveFindPageUI", "New NearBy activity contextid is null");
        } else {
            ((C11266d) C86312j.m106911c(C11266d.class)).mo9187Uy().mo10843a(str);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        if (this.f15677q) {
            getController().mo177081j0(getContext().getResources().getColor(C0966R.color.f2947a4));
            setBackGroundColorResource(C0966R.color.f2947a4);
        }
        findViewById(C0966R.C0970id.a37).setOnClickListener(new C3309a(this));
        ((TextView) findViewById(C0966R.C0970id.e0i)).setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3619c)) * C76577a.m92161l(getContext()));
        C35464c<Integer> cVar = C32444a.f86187q1;
        int intValue = cVar.mo60266n().intValue();
        if (intValue == 1) {
            View findViewById = findViewById(C0966R.C0970id.j4j);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initNewUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initNewUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = (TextView) findViewById(C0966R.C0970id.e0i);
            if (textView != null) {
                textView.setText(getContext().getResources().getString(C0966R.string.h6j));
            }
            View findViewById2 = findViewById(C0966R.C0970id.dse);
            if (findViewById2 != null) {
                if (C32444a.f86039B2.mo60266n().intValue() == 1 || !C85875k4.m106210y()) {
                    i = 0;
                } else {
                    Log.m105924i("FinderLiveFindPageUI", "pad can't create live!");
                    i = 8;
                }
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i));
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initNewUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initNewUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View findViewById3 = findViewById(C0966R.C0970id.j4j);
            if (findViewById3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initOldUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initOldUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.e0i);
            if (textView2 != null) {
                textView2.setText(getContext().getResources().getString(C0966R.string.dmr));
            }
            View findViewById4 = findViewById(C0966R.C0970id.dse);
            if (findViewById4 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = findViewById4;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initOldUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initOldUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        Log.m105924i("FinderLiveFindPageUI", "useNewUI:" + intValue);
        FinderLiveFindPageFragment finderLiveFindPageFragment = this.f15675o;
        Intent intent = getIntent();
        finderLiveFindPageFragment.setArguments(intent != null ? intent.getExtras() : null);
        Bundle arguments = this.f15675o.getArguments();
        if (arguments != null) {
            arguments.putInt("key_use_dark_style", this.f15677q ? 1 : 0);
        }
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.mo165167i(C0966R.C0970id.e_o, this.f15675o, (String) null, 1);
        beginTransaction.mo165171o(this.f15675o).mo165163e();
        this.f15675o.mo3604e0(this);
        ((C8138e) rVar.mo62444c(this).mo75002a(C8138e.class)).mo9204f3();
        if (cVar.mo60266n().intValue() == 0) {
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77239M5("FinderLiveEntrance");
        }
        this.f15676p = false;
        C21445b bVar = C21445b.f60694a;
        C21445b.f60696c = C31543z5.m39453c();
        Log.m105924i("FinderNearbyLiveLoadingReporter", "tickActivityOnCreate");
        mo79123H7();
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.NearbyLiveSquareTabFragment);
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderLiveFindPageUI");
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 40, 25388);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C3310b(this));
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f15675o.setArguments(intent != null ? intent.getExtras() : null);
    }

    public void onPause() {
        super.onPause();
        if (this.f15676p) {
            C64208c.C64209a aVar = C64208c.f181951a;
            C64208c.f181952b = false;
        }
    }

    public void onResume() {
        C64208c.C64209a aVar = C64208c.f181951a;
        C64208c.f181952b = true;
        super.onResume();
    }
}
