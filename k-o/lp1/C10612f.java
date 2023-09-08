package lp1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import rs1.C13484v3;
import rs1.C13490v9;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: lp1.f */
public final class C10612f extends UIComponent {

    /* renamed from: d */
    public LinkedList<BaseFinderFeed> f31991d = new LinkedList<>();

    /* renamed from: e */
    public RecyclerView f31992e;

    /* renamed from: f */
    public boolean f31993f = true;

    /* renamed from: g */
    public boolean f31994g;

    /* renamed from: h */
    public final ArrayList<C10605a> f31995h = new ArrayList<>();

    /* renamed from: i */
    public final C13601g f31996i = C36568h.m40985a(new C10613a(this));

    /* renamed from: lp1.f$a */
    public static final class C10613a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10612f f31997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10613a(C10612f fVar) {
            super(0);
            this.f31997d = fVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f31997d.getIntent().getBooleanExtra("allow_pull_top", false));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10612f(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getBooleanExtra("is_from_ad", false);
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        C39818r rVar = C39818r.f106831a;
        boolean z = false;
        if (!((C13490v9) rVar.mo62444c(getActivity()).mo75002a(C13490v9.class)).mo12899d3()) {
            ((C13484v3) rVar.mo62444c(getActivity()).mo75002a(C13484v3.class)).getClass();
            if (!((C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN, false) ^ true) && C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_FULL_FEED_GUIDE_COUNT_INT, 0) < 3)) {
                z = true;
            }
        }
        this.f31993f = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10612f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
