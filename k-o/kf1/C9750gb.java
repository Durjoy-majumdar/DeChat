package kf1;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import rs1.C63586o;

/* renamed from: kf1.gb */
public final class C9750gb implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelinePresenter f30211d;

    /* renamed from: kf1.gb$a */
    public static final class C9751a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f30212d;

        public C9751a(FinderTimelinePresenter finderTimelinePresenter) {
            this.f30212d = finderTimelinePresenter;
        }

        public void onChanged(Object obj) {
            C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
            FinderHomeTabFragment finderHomeTabFragment = this.f30212d.f13267h;
            if (finderHomeTabFragment != null) {
                ((C63586o) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo75002a(C63586o.class)).mo88437f3();
            }
        }
    }

    /* renamed from: kf1.gb$b */
    public static final class C9752b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f30213d;

        public C9752b(FinderTimelinePresenter finderTimelinePresenter) {
            this.f30213d = finderTimelinePresenter;
        }

        public void onChanged(Object obj) {
            C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
            FinderHomeTabFragment finderHomeTabFragment = this.f30213d.f13267h;
            if (finderHomeTabFragment != null) {
                ((C63586o) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo75002a(C63586o.class)).mo88437f3();
            }
        }
    }

    public C9750gb(FinderTimelinePresenter finderTimelinePresenter) {
        this.f30211d = finderTimelinePresenter;
    }

    public final void run() {
        FinderTimelinePresenter finderTimelinePresenter = this.f30211d;
        int i = finderTimelinePresenter.f13272p;
        if (i == 1 || i == 4) {
            C2479n0 n0Var = C2479n0.f12955a;
            C2479n0.f12975u.observe(finderTimelinePresenter.f13266g, new C9751a(finderTimelinePresenter));
            C54219z<C2479n0.C2480a> zVar = C2479n0.f12969o;
            FinderTimelinePresenter finderTimelinePresenter2 = this.f30211d;
            zVar.observe(finderTimelinePresenter2.f13266g, new C9752b(finderTimelinePresenter2));
        }
    }
}
