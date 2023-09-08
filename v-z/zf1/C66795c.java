package zf1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPickerDataReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.gallery.FinderGalleryTabView;
import com.tencent.p014mm.plugin.finder.gallery.FinderGalleryTabView$buildItemCoverts$1;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment;
import com.tencent.p014mm.plugin.finder.profile.FlowLayoutManager;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import p599lr.C61381b;
import sr1.C64164c;
import sx3.C110818d0;
import sx3.C64175a0;
import te3.C50687oi1;
import uq1.C65464w;
import zc1.C66785b;

/* renamed from: zf1.c */
public final class C66795c {

    /* renamed from: a */
    public final MMActivity f191897a;

    /* renamed from: b */
    public final ViewGroup f191898b;

    /* renamed from: c */
    public final C66792b f191899c;

    /* renamed from: d */
    public final String f191900d = "Finder.FinderGalleryCore";

    /* renamed from: e */
    public final Context f191901e;

    /* renamed from: f */
    public final ArrayList<C16151i> f191902f = new ArrayList<>();

    /* renamed from: g */
    public final FinderViewPager f191903g;

    /* renamed from: h */
    public final ArrayList<MMFinderFragment> f191904h = new ArrayList<>();

    /* renamed from: i */
    public int f191905i;

    /* renamed from: j */
    public final FinderGalleryTabView f191906j;

    /* renamed from: k */
    public C65464w f191907k;

    /* renamed from: l */
    public int f191908l;

    /* renamed from: zf1.c$a */
    public static final class C66796a extends C87413o implements C32226l<Integer, Boolean> {

        /* renamed from: d */
        public static final C66796a f191909d = new C66796a();

        public C66796a() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(((Number) obj).intValue() == 2);
        }
    }

    /* renamed from: zf1.c$b */
    public static final class C66797b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66799d f191910d;

        public C66797b(C66799d dVar) {
            this.f191910d = dVar;
        }

        public final void run() {
            this.f191910d.onPageSelected(0);
        }
    }

    /* renamed from: zf1.c$c */
    public static final class C66798c implements C65464w {

        /* renamed from: d */
        public final /* synthetic */ C66795c f191911d;

        public C66798c(C66795c cVar) {
            this.f191911d = cVar;
        }

        public void onPostEnd(long j, boolean z) {
        }

        public void onPostNotify(long j, boolean z) {
        }

        public void onPostOk(long j, long j2) {
        }

        public void onPostStart(long j) {
            C66795c cVar = this.f191911d;
            cVar.f191906j.mo3150a(cVar.f191905i);
            C66795c cVar2 = this.f191911d;
            cVar2.f191903g.setCurrentItem(cVar2.f191905i, false);
        }
    }

    /* renamed from: zf1.c$d */
    public static final class C66799d implements ViewPager.OnPageChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C66795c f191912d;

        public C66799d(C66795c cVar) {
            this.f191912d = cVar;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0053, code lost:
            r0 = r0.f43344d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPageSelected(int r6) {
            /*
                r5 = this;
                zf1.c r0 = r5.f191912d
                com.tencent.mm.plugin.finder.gallery.FinderGalleryTabView r0 = r0.f191906j
                r0.mo3150a(r6)
                zf1.c r0 = r5.f191912d
                java.util.ArrayList<com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment> r0 = r0.f191904h
                java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r6)
                com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment r0 = (com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment) r0
                if (r0 == 0) goto L_0x0016
                r0.mo2202O()
            L_0x0016:
                if (r0 != 0) goto L_0x0040
                zf1.c r0 = r5.f191912d
                java.lang.String r0 = r0.f191900d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onPageSelected position:"
                r1.append(r2)
                r1.append(r6)
                java.lang.String r2 = ", size:"
                r1.append(r2)
                zf1.c r2 = r5.f191912d
                java.util.ArrayList<com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment> r2 = r2.f191904h
                int r2 = r2.size()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            L_0x0040:
                zf1.c r0 = r5.f191912d
                int r1 = r0.f191908l
                r2 = -1
                if (r1 == r2) goto L_0x0094
                zf1.f r1 = zf1.C66800f.f191913a
                java.util.ArrayList<zf1.i> r0 = r0.f191902f
                java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r6)
                zf1.i r0 = (zf1.C16151i) r0
                if (r0 == 0) goto L_0x005a
                zf1.h r0 = r0.f43344d
                if (r0 == 0) goto L_0x005a
                int r0 = r0.f43342a
                goto L_0x005b
            L_0x005a:
                r0 = 0
            L_0x005b:
                long r2 = r1.mo90794b(r0)
                zf1.C66800f.f191916d = r2
                com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct
                r2.<init>()
                java.lang.String r3 = zf1.C66800f.f191914b
                r2.mo76266t(r3)
                long r3 = zf1.C66800f.f191915c
                r2.f155760e = r3
                r3 = 2
                r2.f155761f = r3
                java.lang.String r0 = r1.mo90793a(r0)
                r2.mo76265s(r0)
                long r3 = zf1.C66800f.f191916d
                r2.f155763h = r3
                java.lang.String r0 = ""
                r2.mo76268v(r0)
                long r3 = eb0.C31543z5.m39453c()
                java.lang.String r0 = java.lang.String.valueOf(r3)
                r2.mo76267u(r0)
                r2.mo86054n()
                r1.mo90800h(r2)
            L_0x0094:
                zf1.c r0 = r5.f191912d
                r0.f191908l = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zf1.C66795c.C66799d.onPageSelected(int):void");
        }
    }

    public C66795c(MMActivity mMActivity, ViewGroup viewGroup, C66792b bVar) {
        RecyclerView.C16613e adapter;
        WxRecyclerView wxRecyclerView;
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "config");
        this.f191897a = mMActivity;
        this.f191898b = viewGroup;
        this.f191899c = bVar;
        int i = -1;
        this.f191905i = -1;
        this.f191908l = -1;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f191901e = context;
        C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
        if (oi12 != null && oi12.f139196d == 1) {
            C64175a0.m75512t(bVar.f191893a.f191888a, C66796a.f191909d);
        }
        boolean z = true;
        for (Number intValue : bVar.f191893a.f191888a) {
            int intValue2 = intValue.intValue();
            if ((intValue2 == 5 && C58784w3.m68441q(C58784w3.f168295a, (String) null, 1, (Object) null) == 4) ? false : true) {
                this.f191902f.add(new C16151i(new C16150h(intValue2, this.f191899c.mo77483h(this.f191901e, intValue2))));
                this.f191904h.add(this.f191899c.mo77482g(this.f191901e, intValue2, z));
                z = false;
            }
        }
        View inflate = LayoutInflater.from(this.f191901e).inflate(C0966R.C0971layout.acd, this.f191898b, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.kd6);
        C87412m.m108593f(findViewById, "albumView.findViewById<F…ryTabView>(R.id.tab_view)");
        FinderGalleryTabView finderGalleryTabView = (FinderGalleryTabView) findViewById;
        this.f191906j = finderGalleryTabView;
        finderGalleryTabView.f14999e = this;
        ArrayList<C16151i> arrayList = this.f191902f;
        LayoutInflater.from(finderGalleryTabView.getContext()).inflate(C0966R.C0971layout.any, finderGalleryTabView, true);
        WxRecyclerView wxRecyclerView2 = (WxRecyclerView) finderGalleryTabView.findViewById(C0966R.C0970id.d2y);
        finderGalleryTabView.f15000f = wxRecyclerView2;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.mo17085h0(finderGalleryTabView.getItemDecoration());
        }
        FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
        WxRecyclerView wxRecyclerView3 = finderGalleryTabView.f15000f;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.setLayoutManager(flowLayoutManager);
        }
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new FinderGalleryTabView$buildItemCoverts$1(finderGalleryTabView), arrayList, false);
        wxRecyclerAdapter.f173488o = new C16152j(wxRecyclerAdapter, finderGalleryTabView, arrayList, this);
        WxRecyclerView wxRecyclerView4 = finderGalleryTabView.f15000f;
        if (wxRecyclerView4 != null) {
            wxRecyclerView4.setAdapter(wxRecyclerAdapter);
        }
        if (this.f191899c.mo77478c() && (wxRecyclerView = finderGalleryTabView.f15000f) != null) {
            wxRecyclerView.setBackgroundColor(finderGalleryTabView.getResources().getColor(C0966R.color.f2953a_));
        }
        Log.m105924i(finderGalleryTabView.f14998d, "refresh");
        WxRecyclerView wxRecyclerView5 = finderGalleryTabView.f15000f;
        if (!(wxRecyclerView5 == null || (adapter = wxRecyclerView5.getAdapter()) == null)) {
            adapter.notifyDataSetChanged();
        }
        View findViewById2 = inflate.findViewById(C0966R.C0970id.l89);
        C87412m.m108593f(findViewById2, "albumView.findViewById(R.id.viewPager)");
        FinderViewPager finderViewPager = (FinderViewPager) findViewById2;
        this.f191903g = finderViewPager;
        finderViewPager.setEnableViewPagerScroll(true);
        C66799d dVar = new C66799d(this);
        FragmentManager supportFragmentManager = this.f191897a.getSupportFragmentManager();
        C87412m.m108593f(supportFragmentManager, "activity.supportFragmentManager");
        finderViewPager.setAdapter(new C64164c(supportFragmentManager, this.f191904h, 0));
        finderViewPager.setOffscreenPageLimit(this.f191902f.size() + 1);
        finderViewPager.addOnPageChangeListener(dVar);
        finderGalleryTabView.mo3150a(0);
        finderViewPager.setCurrentItem(0, false);
        finderViewPager.post(new C66797b(dVar));
        C66800f fVar = C66800f.f191913a;
        int intExtra = this.f191897a.getIntent().getIntExtra("BIZ_SCENE", 0);
        Integer num = (Integer) C110818d0.m150917O(this.f191899c.f191893a.f191888a, 0);
        int intValue3 = num != null ? num.intValue() : 0;
        C66800f.f191916d = fVar.mo90794b(intValue3);
        long j = intExtra != 1 ? intExtra != 2 ? intExtra != 3 ? intExtra != 4 ? 0 : 4 : 3 : 2 : 1;
        C66800f.f191915c = j;
        C66800f.f191914b = String.valueOf(C31543z5.m39453c());
        FinderPickerDataReportStruct finderPickerDataReportStruct = new FinderPickerDataReportStruct();
        finderPickerDataReportStruct.mo76266t(C66800f.f191914b);
        finderPickerDataReportStruct.f155760e = j;
        finderPickerDataReportStruct.f155761f = 1;
        finderPickerDataReportStruct.mo76265s(fVar.mo90793a(intValue3));
        finderPickerDataReportStruct.f155763h = C66800f.f191916d;
        finderPickerDataReportStruct.mo76268v("");
        finderPickerDataReportStruct.mo76267u(String.valueOf(C31543z5.m39453c()));
        finderPickerDataReportStruct.mo86054n();
        fVar.mo90800h(finderPickerDataReportStruct);
        Iterator<C16151i> it = this.f191902f.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().f43344d.f43342a == 5) {
                i = i2;
                break;
            }
            i2++;
        }
        this.f191905i = i;
        if (i >= 0) {
            this.f191907k = new C66798c(this);
            ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12412e(this.f191907k);
        }
    }
}
