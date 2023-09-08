package xd1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment;
import com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C98522w3;
import kf1.C9827k6;
import kf1.C9840l6;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49982je3;

/* renamed from: xd1.p */
public final class C15665p extends UIComponent {

    /* renamed from: d */
    public final C13601g f42339d = C36568h.m40985a(new C15667b(this));

    /* renamed from: e */
    public final C13601g f42340e;

    /* renamed from: f */
    public final C13601g f42341f;

    /* renamed from: xd1.p$a */
    public static final class C15666a extends C87413o implements C32224a<FinderPoiFeedLoader> {

        /* renamed from: d */
        public final /* synthetic */ C15665p f42342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15666a(C15665p pVar) {
            super(0);
            this.f42342d = pVar;
        }

        public Object invoke() {
            return new FinderPoiFeedLoader(((C13442s8) C39818r.f106831a.mo62444c(this.f42342d.getActivity()).mo75002a(C13442s8.class)).mo12861q3());
        }
    }

    /* renamed from: xd1.p$b */
    public static final class C15667b extends C87413o implements C32224a<C9827k6> {

        /* renamed from: d */
        public final /* synthetic */ C15665p f42343d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15667b(C15665p pVar) {
            super(0);
            this.f42343d = pVar;
        }

        public Object invoke() {
            AppCompatActivity activity = this.f42343d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            return new C9827k6((MMActivity) activity, 2, this.f42343d.mo14409d3(), this.f42343d.mo14410e3());
        }
    }

    /* renamed from: xd1.p$c */
    public static final class C15668c extends C87413o implements C32224a<C9840l6> {

        /* renamed from: d */
        public final /* synthetic */ C15665p f42344d;

        /* renamed from: e */
        public final /* synthetic */ Fragment f42345e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15668c(C15665p pVar, Fragment fragment) {
            super(0);
            this.f42344d = pVar;
            this.f42345e = fragment;
        }

        public Object invoke() {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            AppCompatActivity activity = this.f42344d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C9840l6 l6Var = new C9840l6((MMActivity) activity, 2, this.f42344d.mo14409d3(), false, 8, (C8480h) null);
            Fragment fragment = this.f42345e;
            C15665p pVar = this.f42344d;
            View view = fragment.getView();
            if (!(view == null || (refreshLoadMoreLayout = (RefreshLoadMoreLayout) view.findViewById(C0966R.C0970id.ivb)) == null)) {
                l6Var.f30220j = refreshLoadMoreLayout;
                refreshLoadMoreLayout.setSuperNestedScroll(true);
            }
            View view2 = fragment.getView();
            C49982je3 je32 = null;
            l6Var.f30406E = view2 != null ? view2.findViewById(C0966R.C0970id.cjg) : null;
            l6Var.f30407F = pVar.mo14408c3();
            FinderPoiTabFragment finderPoiTabFragment = fragment instanceof FinderPoiTabFragment ? (FinderPoiTabFragment) fragment : null;
            if (finderPoiTabFragment != null) {
                je32 = finderPoiTabFragment.f12487u;
            }
            l6Var.f30408G = je32;
            return l6Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15665p(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        this.f42340e = C36568h.m40985a(new C15668c(this, fragment));
        this.f42341f = C36568h.m40985a(new C15666a(this));
    }

    /* renamed from: c3 */
    public final int mo14408c3() {
        if (!(getFragment() instanceof FinderHomeTabFragment)) {
            return 0;
        }
        Fragment fragment = getFragment();
        C87412m.m108592e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
        int i = ((FinderHomeTabFragment) fragment).f17334o;
        Log.m105924i(C54492n.TAG, "convertInnerTabType : " + i);
        return i + 1;
    }

    /* renamed from: d3 */
    public final int mo14409d3() {
        Intent intent = getIntent();
        C98522w3.C8810a aVar = null;
        Object serializableExtra = intent != null ? intent.getSerializableExtra("key_from_type") : null;
        if (serializableExtra instanceof C98522w3.C8810a) {
            aVar = (C98522w3.C8810a) serializableExtra;
        }
        return aVar == C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS ? 81 : 26;
    }

    /* renamed from: e3 */
    public final FinderPoiFeedLoader mo14410e3() {
        return (FinderPoiFeedLoader) ((C36570n) this.f42341f).getValue();
    }

    /* renamed from: f3 */
    public final C9827k6 mo14411f3() {
        return (C9827k6) ((C36570n) this.f42339d).getValue();
    }

    /* renamed from: g3 */
    public final C9840l6 mo14412g3() {
        return (C9840l6) ((C36570n) this.f42340e).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a8l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r6 = r5.mo14410e3()
            te3.m74 r0 = new te3.m74
            r0.<init>()
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r2 = "key_location"
            byte[] r1 = r1.getByteArrayExtra(r2)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x001c
        L_0x001a:
            r0 = r3
            goto L_0x002f
        L_0x001c:
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x0020 }
            goto L_0x002f
        L_0x0020:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r4, r1)
            goto L_0x001a
        L_0x002f:
            r6.f13766e = r0
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r6 = r5.mo14410e3()
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "key_from_type"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            boolean r1 = r0 instanceof ht1.C98522w3.C8810a
            if (r1 == 0) goto L_0x0046
            ht1.w3$a r0 = (ht1.C98522w3.C8810a) r0
            goto L_0x0047
        L_0x0046:
            r0 = r3
        L_0x0047:
            r6.f13768g = r0
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "key_from_scene"
            boolean r6 = r6.hasExtra(r0)
            if (r6 == 0) goto L_0x0067
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r6 = r5.mo14410e3()
            android.content.Intent r1 = r5.getIntent()
            int r0 = r1.getIntExtra(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.f13769h = r0
        L_0x0067:
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r6 = r5.mo14410e3()
            int r0 = r5.mo14408c3()
            r6.f13771j = r0
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r6 = r5.mo14410e3()
            androidx.fragment.app.Fragment r0 = r5.getFragment()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment
            if (r1 == 0) goto L_0x0080
            com.tencent.mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment r0 = (com.tencent.p014mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment) r0
            goto L_0x0081
        L_0x0080:
            r0 = r3
        L_0x0081:
            if (r0 == 0) goto L_0x0086
            pe3.b r0 = r0.f12485s
            goto L_0x0087
        L_0x0086:
            r0 = r3
        L_0x0087:
            r6.setLastBuffer(r0)
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r6 = r5.mo14410e3()
            androidx.fragment.app.Fragment r0 = r5.getFragment()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment
            if (r1 == 0) goto L_0x0099
            com.tencent.mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment r0 = (com.tencent.p014mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment) r0
            goto L_0x009a
        L_0x0099:
            r0 = r3
        L_0x009a:
            if (r0 == 0) goto L_0x009e
            java.util.List<? extends cm1.i2> r3 = r0.f12486t
        L_0x009e:
            r6.f13772n = r3
            androidx.fragment.app.Fragment r6 = r5.getFragment()
            if (r6 == 0) goto L_0x00d2
            kf1.l6 r0 = r5.mo14412g3()
            r0.getClass()
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r6 = r1.mo62445d(r6)
            java.lang.Class<rs1.s8> r1 = rs1.C13442s8.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(fragment)…rReporterUIC::class.java)"
            gy3.C87412m.m108593f(r6, r1)
            rs1.s8 r6 = (rs1.C13442s8) r6
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            r1 = -1
            ef1.f r6 = r6.mo12854j3(r1)
            if (r6 == 0) goto L_0x00d2
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.f30220j
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            r6.mo83455c(r0)
        L_0x00d2:
            kf1.k6 r6 = r5.mo14411f3()
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "key_drawer_mode"
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r6.f30379i = r0
            kf1.l6 r6 = r5.mo14412g3()
            kf1.k6 r0 = r5.mo14411f3()
            r6.mo10355Y0(r0)
            kf1.k6 r6 = r5.mo14411f3()
            kf1.l6 r0 = r5.mo14412g3()
            r6.mo2525t(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xd1.C15665p.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        mo14411f3().onDetach();
    }

    public void onPause() {
        super.onPause();
        mo14411f3().mo2526x();
    }

    public void onResume() {
        super.onResume();
        mo14411f3().mo2514G();
    }
}
