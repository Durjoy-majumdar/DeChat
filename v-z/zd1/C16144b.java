package zd1;

import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import be1.C0271f;
import be1.C0272g;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C7878t0;
import er1.C7888v2;
import gy3.C87412m;
import java.util.List;
import md1.C10779c;
import sx3.C110818d0;
import te3.C51270sn1;
import te3.C64258bf0;
import te3.C64311db1;
import te3.C64689rq2;

/* renamed from: zd1.b */
public final class C16144b extends C10779c {

    /* renamed from: f */
    public final C51270sn1 f43334f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16144b(C51270sn1 sn12, AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f43334f = sn12;
    }

    /* renamed from: d */
    public boolean mo11013d() {
        C51270sn1 sn12 = this.f43334f;
        String str = sn12 != null ? sn12.f141617d : null;
        if (!(str == null || str.length() == 0)) {
            return mo14717k().length() == 0;
        }
    }

    /* renamed from: g */
    public void mo11016g() {
        C7888v2.C7889a aVar = C7888v2.f26513a;
        AppCompatActivity appCompatActivity = this.f32250d;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) appCompatActivity;
        C51270sn1 sn12 = this.f43334f;
        C7888v2.C7889a.m8052B(aVar, mMActivity, sn12 != null ? sn12.f141617d : null, 1, sn12 != null ? (long) sn12.f141619f : 0, mo14717k(), mo14718l(), (C64311db1) null, 9, "", (C64258bf0) null, 512, (Object) null);
    }

    /* renamed from: h */
    public void mo11017h() {
        C7888v2.C7889a aVar = C7888v2.f26513a;
        AppCompatActivity appCompatActivity = this.f32250d;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) appCompatActivity;
        C51270sn1 sn12 = this.f43334f;
        C7888v2.C7889a.m8053D(aVar, mMActivity, sn12 != null ? sn12.f141617d : null, 1, sn12 != null ? (long) sn12.f141619f : 0, mo14717k(), mo14718l(), (C64311db1) null, 9, "", (C64258bf0) null, 512, (Object) null);
    }

    /* renamed from: k */
    public final String mo14717k() {
        String str;
        C64689rq2 rq22;
        C51270sn1 sn12 = this.f43334f;
        List<E> list = null;
        String str2 = sn12 != null ? sn12.f141635y : null;
        boolean z = true;
        if (str2 == null || str2.length() == 0) {
            C39818r rVar = C39818r.f106831a;
            FinderTopicTabFragment finderTopicTabFragment = ((C0272g) rVar.mo62444c(this.f32250d).mo75002a(C0272g.class)).f829y;
            if (finderTopicTabFragment != null) {
                FinderTopicFeedLoader finderTopicFeedLoader = ((C0271f) rVar.mo62445d(finderTopicTabFragment).mo75002a(C0271f.class)).f12526r;
                if (finderTopicFeedLoader != null) {
                    list = finderTopicFeedLoader.getListOfType(BaseFinderFeed.class);
                } else {
                    C87412m.m108603p("feedLoader");
                    throw null;
                }
            }
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (!z && (rq22 = (C64689rq2) C110818d0.m150917O(((BaseFinderFeed) list.get(0)).mo3513o().getMediaList(), 0)) != null) {
                return rq22.f185267e + rq22.f185288z;
            }
        } else {
            C51270sn1 sn13 = this.f43334f;
            return (sn13 == null || (str = sn13.f141635y) == null) ? "" : str;
        }
    }

    /* renamed from: l */
    public final String mo14718l() {
        Resources resources = this.f32250d.getResources();
        Object[] objArr = new Object[1];
        C51270sn1 sn12 = this.f43334f;
        objArr[0] = C7878t0.m8035d((long) (sn12 != null ? sn12.f141619f : 0));
        String string = resources.getString(C0966R.string.esm, objArr);
        C87412m.m108593f(string, "activity.resources.getSt…picInfo?.feedCount ?: 0))");
        return string;
    }
}
