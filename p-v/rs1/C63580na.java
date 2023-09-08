package rs1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7642k;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import jq3.C60905o;
import ob0.C11385n;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: rs1.na */
public final class C63580na extends UIComponent implements C11385n {

    /* renamed from: g */
    public static final HashMap<Integer, Long> f180295g = new HashMap<>();

    /* renamed from: d */
    public final C13601g f180296d = C36568h.m40985a(new C63583c(this));

    /* renamed from: e */
    public final C13601g f180297e = C36568h.m40985a(new C63584d(this));

    /* renamed from: f */
    public int f180298f = -1;

    /* renamed from: rs1.na$a */
    public static final class C63581a {
        public C63581a(C8480h hVar) {
        }
    }

    /* renamed from: rs1.na$b */
    public static final class C63582b extends C58555d {

        /* renamed from: g */
        public final /* synthetic */ C63580na f180299g;

        public C63582b(C63580na naVar) {
            this.f180299g = naVar;
        }

        /* renamed from: B1 */
        public void mo2331B1(C7637b bVar) {
            C87412m.m108594g(bVar, "ev");
            if (bVar instanceof C7642k) {
                RecyclerView.LayoutManager layoutManager = ((RecyclerView) ((C36570n) this.f180299g.f180296d).getValue()).getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    int E = ((LinearLayoutManager) layoutManager).mo16959E();
                    C63580na naVar = this.f180299g;
                    if (E > naVar.f180298f) {
                        RecyclerView.C16631z I0 = ((RecyclerView) ((C36570n) naVar.f180296d).getValue()).mo17023I0(E);
                        if (I0 instanceof C60905o) {
                            Object obj = ((C60905o) I0).f173503E;
                            if (obj instanceof BaseFinderFeed) {
                                long id = ((BaseFinderFeed) obj).mo3513o().getId();
                                C7642k kVar = (C7642k) bVar;
                                if (kVar.f25958i != id) {
                                    C63580na.f180295g.put(Integer.valueOf(this.f180299g.mo88433c3()), Long.valueOf(id));
                                    Log.m105924i("Finder.StreamPartialExposeUIC", "[onScrollStateChanged] tabType=" + this.f180299g.mo88433c3() + " lastId=" + id + ' ' + kVar.f25958i + " position=" + E);
                                    this.f180299g.f180298f = E;
                                }
                            }
                        }
                    }
                }
                HashMap<Integer, Long> hashMap = C63580na.f180295g;
                Long l = hashMap.get(Integer.valueOf(this.f180299g.mo88433c3()));
                long j = ((C7642k) bVar).f25958i;
                if (l != null && l.longValue() == j) {
                    hashMap.put(Integer.valueOf(this.f180299g.mo88433c3()), 0L);
                    Log.m105924i("Finder.StreamPartialExposeUIC", "[onScrollStateChanged] tabType=" + this.f180299g.mo88433c3() + " reset");
                }
            }
        }

        /* renamed from: y1 */
        public boolean mo2424y1() {
            return false;
        }

        /* renamed from: z1 */
        public boolean mo2333z1(C58553c cVar, C7637b bVar) {
            C87412m.m108594g(cVar, "dispatcher");
            C87412m.m108594g(bVar, "event");
            return bVar instanceof C7642k;
        }
    }

    /* renamed from: rs1.na$c */
    public static final class C63583c extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C63580na f180300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63583c(C63580na naVar) {
            super(0);
            this.f180300d = naVar;
        }

        public Object invoke() {
            View findViewById = this.f180300d.getRootView().findViewById(C0966R.C0970id.ivb);
            C87412m.m108591d(findViewById);
            return ((RefreshLoadMoreLayout) findViewById).getRecyclerView();
        }
    }

    /* renamed from: rs1.na$d */
    public static final class C63584d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C63580na f180301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63584d(C63580na naVar) {
            super(0);
            this.f180301d = naVar;
        }

        public Object invoke() {
            Fragment fragment = this.f180301d.getFragment();
            C87412m.m108592e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            return Integer.valueOf(((FinderHomeTabFragment) fragment).f17334o);
        }
    }

    static {
        new C63581a((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63580na(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public final int mo88433c3() {
        return ((Number) ((C36570n) this.f180297e).getValue()).intValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(3901, this);
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        C39818r rVar = C39818r.f106831a;
        Context context = ((RecyclerView) ((C36570n) this.f180296d).getValue()).getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C58553c l3 = ((C13442s8) rVar.mo62444c((MMActivity) context).mo75002a(C13442s8.class)).mo12856l3(mo88433c3());
        if (l3 != null) {
            l3.mo83450a(new C63582b(this));
        }
        f180295g.put(Integer.valueOf(mo88433c3()), 0L);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3901, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r1 = r4.getReqResp();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r1, int r2, java.lang.String r3, ob0.C117747y r4) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0055
            if (r2 != 0) goto L_0x0055
            if (r4 == 0) goto L_0x0011
            com.tencent.mm.network.u r1 = r4.getReqResp()
            if (r1 == 0) goto L_0x0011
            qe3.w$d r1 = r1.getReqObj()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            boolean r2 = r1 instanceof te3.C52133yl1
            if (r2 == 0) goto L_0x0055
            te3.yl1 r1 = (te3.C52133yl1) r1
            int r1 = r1.f145379q
            int r2 = r0.mo88433c3()
            if (r1 != r2) goto L_0x0055
            r1 = -1
            r0.f180298f = r1
            java.util.HashMap<java.lang.Integer, java.lang.Long> r1 = f180295g
            int r2 = r0.mo88433c3()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.put(r2, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[onSceneEnd] tabType="
            r1.append(r2)
            int r2 = r0.mo88433c3()
            r1.append(r2)
            java.lang.String r2 = " reset"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.StreamPartialExposeUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63580na.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
