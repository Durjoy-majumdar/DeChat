package gr1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import dp1.C7435f2;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lu3.C34379c;
import org.json.JSONObject;
import rs1.C13442s8;
import tc2.C118418g;
import up1.C37521f;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: gr1.h */
public final class C8395h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean[] f27386d;

    /* renamed from: e */
    public final /* synthetic */ FinderFullSeekBarLayout f27387e;

    /* renamed from: gr1.h$a */
    public static final class C8396a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFullSeekBarLayout f27388d;

        public C8396a(FinderFullSeekBarLayout finderFullSeekBarLayout) {
            this.f27388d = finderFullSeekBarLayout;
        }

        public final void run() {
            this.f27388d.mo4259i("hideSeekbarTask");
            this.f27388d.setPendingExitMode(false);
        }
    }

    public C8395h(boolean[] zArr, FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f27386d = zArr;
        this.f27387e = finderFullSeekBarLayout;
    }

    public final void onClick(View view) {
        FinderFullSeekBarLayout finderFullSeekBarLayout;
        BaseFinderFeed baseFinderFeed;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$awesomePrivateLayout$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f27386d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            C118418g gVar = C118418g.INSTANCE;
            gVar.w40("ce_feed_like", "<FeedLike>");
            gVar.mo175827n9("ce_feed_like", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
            gVar.ec0("ce_feed_like");
        }
        C37521f.f99374d.getClass();
        if (C37521f.f99208J7.mo60266n().intValue() == 1) {
            boolean booleanValue = this.f27387e.getOnPrivateLikeClickListener().invoke().booleanValue();
            this.f27387e.mo4295t();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_CLICK_COUNT_INT_SYNC;
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i.mo119689j(aVar, 0) + 1));
            this.f27387e.mo4234C(booleanValue);
        } else {
            boolean booleanValue2 = this.f27387e.getOnPrivateLikeClickListener().invoke().booleanValue();
            this.f27387e.mo4295t();
            this.f27387e.mo4233B(booleanValue2);
            if (booleanValue2 && (baseFinderFeed = finderFullSeekBarLayout.f17495N) != null) {
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                Context context = (finderFullSeekBarLayout = this.f27387e).getContext();
                C87412m.m108593f(context, "context");
                C13442s8 f = aVar2.mo12873f(context);
                C7435f2.m7551e(f2Var, f != null ? f.mo12861q3() : null, "private_like", false, baseFinderFeed.getItemId(), (JSONObject) null, (String) null, 48, (Object) null);
            }
        }
        this.f27387e.getOnResumePlayListener().invoke();
        WeImageView weImageView = this.f27387e.f17490I;
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        this.f27387e.setPendingExitMode(true);
        C34379c<?> hideSeekbarTask = this.f27387e.getHideSeekbarTask();
        if (hideSeekbarTask != null) {
            hideSeekbarTask.cancel(false);
        }
        FinderFullSeekBarLayout finderFullSeekBarLayout2 = this.f27387e;
        C119179t tVar = C119157j.f356862d;
        C8396a aVar3 = new C8396a(finderFullSeekBarLayout2);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        finderFullSeekBarLayout2.setHideSeekbarTask(jVar.mo183892w(aVar3, 3000, false));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$awesomePrivateLayout$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
