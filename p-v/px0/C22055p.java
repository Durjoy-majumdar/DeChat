package px0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18386y1;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.nativefinder.list.BizNativeFinderRecyclerView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import kg3.C76577a;
import nf3.C61686e;
import rx3.C13601g;
import rx3.C36568h;
import te3.C22521pi1;

/* renamed from: px0.p */
public final class C22055p {

    /* renamed from: o */
    public static final int f62409o;

    /* renamed from: p */
    public static final int f62410p;

    /* renamed from: q */
    public static final double f62411q;

    /* renamed from: r */
    public static final float f62412r;

    /* renamed from: s */
    public static final float f62413s;

    /* renamed from: a */
    public final C18386y1 f62414a;

    /* renamed from: b */
    public int f62415b = ((int) (((((double) ((float) f62409o)) / 3.0d) * 4.0d) + ((double) C76577a.m92151b(MMApplicationContext.getContext(), 80))));

    /* renamed from: c */
    public Context f62416c;

    /* renamed from: d */
    public View f62417d;

    /* renamed from: e */
    public C19623o0 f62418e;

    /* renamed from: f */
    public ArrayList<C22039d> f62419f;

    /* renamed from: g */
    public int f62420g;

    /* renamed from: h */
    public TextView f62421h;

    /* renamed from: i */
    public BizNativeFinderRecyclerView f62422i;

    /* renamed from: j */
    public WxRecyclerAdapter<C22039d> f62423j;

    /* renamed from: k */
    public WxLinearLayoutManager f62424k;

    /* renamed from: l */
    public HashMap<String, C22521pi1> f62425l = new HashMap<>();

    /* renamed from: m */
    public HashMap<String, Long> f62426m = new HashMap<>();

    /* renamed from: n */
    public final C13601g f62427n = C36568h.m40985a(C22056a.f62428d);

    /* renamed from: px0.p$a */
    public static final class C22056a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C22056a f62428d = new C22056a();

        public C22056a() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C61686e()) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        C74783i3.C6978a a = C74783i3.m89537a(MMApplicationContext.getContext());
        int i = a.f24704a;
        int i2 = a.f24705b;
        if (i >= i2) {
            i = i2;
        }
        int i3 = (int) ((((double) ((float) i)) - 24.0d) / 2.3d);
        f62409o = i3;
        double d = (((double) ((float) i3)) / 3.0d) * 4.0d;
        int b = (int) (((double) C76577a.m92151b(MMApplicationContext.getContext(), 68)) + d);
        f62410p = b;
        f62411q = d;
        float f = (float) b;
        float b2 = f - ((float) C76577a.m92151b(MMApplicationContext.getContext(), 118));
        f62412r = b2 / f;
        f62413s = (b2 + ((float) C76577a.m92151b(MMApplicationContext.getContext(), 50))) / f;
    }

    public C22055p(C18386y1 y1Var) {
        C87412m.m108594g(y1Var, "nativeFinderHolder");
        this.f62414a = y1Var;
    }

    /* renamed from: a */
    public final ArrayList<C22039d> mo35160a() {
        ArrayList<C22039d> arrayList = this.f62419f;
        if (arrayList != null) {
            return arrayList;
        }
        C87412m.m108603p("finderFeedsList");
        throw null;
    }

    /* renamed from: b */
    public final C19623o0 mo35161b() {
        C19623o0 o0Var = this.f62418e;
        if (o0Var != null) {
            return o0Var;
        }
        C87412m.m108603p("info");
        throw null;
    }

    /* renamed from: c */
    public final WxRecyclerAdapter<C22039d> mo35162c() {
        WxRecyclerAdapter<C22039d> wxRecyclerAdapter = this.f62423j;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter;
        }
        C87412m.m108603p("innerAdapter");
        throw null;
    }

    /* renamed from: d */
    public final Context mo35163d() {
        Context context = this.f62416c;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("mContext");
        throw null;
    }

    /* renamed from: e */
    public final BizNativeFinderRecyclerView mo35164e() {
        BizNativeFinderRecyclerView bizNativeFinderRecyclerView = this.f62422i;
        if (bizNativeFinderRecyclerView != null) {
            return bizNativeFinderRecyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }
}
