package gr1;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import de1.C7290r;
import f40.C86709a0;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: gr1.k */
public final class C8406k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27397d;

    /* renamed from: e */
    public final /* synthetic */ Rect f27398e;

    /* renamed from: f */
    public final /* synthetic */ View f27399f;

    /* renamed from: g */
    public final /* synthetic */ ViewGroup f27400g;

    /* renamed from: h */
    public final /* synthetic */ int f27401h;

    /* renamed from: gr1.k$a */
    public static final class C8407a extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ View f27402d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f27403e;

        /* renamed from: gr1.k$a$a */
        public static final class C8408a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ViewGroup f27404d;

            /* renamed from: e */
            public final /* synthetic */ View f27405e;

            public C8408a(ViewGroup viewGroup, View view) {
                this.f27404d = viewGroup;
                this.f27405e = view;
            }

            public final void run() {
                this.f27404d.removeView(this.f27405e);
            }
        }

        public C8407a(View view, ViewGroup viewGroup) {
            this.f27402d = view;
            this.f27403e = viewGroup;
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            Log.m105924i("Finder.FullSeekBarLayout", "[onAnimationEnd]");
            View view = this.f27402d;
            view.postDelayed(new C8408a(this.f27403e, view), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }

    public C8406k(FinderFullSeekBarLayout finderFullSeekBarLayout, Rect rect, View view, ViewGroup viewGroup, int i) {
        this.f27397d = finderFullSeekBarLayout;
        this.f27398e = rect;
        this.f27399f = view;
        this.f27400g = viewGroup;
        this.f27401h = i;
    }

    public final void run() {
        FinderFullSeekBarLayout finderFullSeekBarLayout = this.f27397d;
        if (finderFullSeekBarLayout.f17507V) {
            View c = finderFullSeekBarLayout.getAwesomePrivateLayout();
            if (c != null) {
                c.getGlobalVisibleRect(this.f27398e);
            }
            float centerX = ((float) this.f27398e.centerX()) - (((float) this.f27399f.getWidth()) / 2.0f);
            float centerY = ((((float) this.f27398e.centerY()) - (((float) this.f27399f.getHeight()) / 2.0f)) - this.f27397d.getContext().getResources().getDimension(C0966R.dimen.f3761db)) - ((float) this.f27400g.getTop());
            this.f27399f.setTranslationX(centerX);
            this.f27399f.setTranslationY(centerY);
            BaseFinderFeed baseFinderFeed = this.f27397d.f17495N;
            long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0;
            HashMap<Long, Integer> hashMap = FinderFullSeekBarLayout.f17481V0;
            HashMap<Long, Integer> hashMap2 = FinderFullSeekBarLayout.f17481V0;
            Integer num = hashMap2.get(Long.valueOf(itemId));
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FEED_GROUP_LIKE_GUIDE_INT, Integer.valueOf(this.f27401h + 1));
                hashMap2.put(Long.valueOf(itemId), 1);
                Log.m105924i("Finder.FullSeekBarLayout", "[checkShowGroupLikeTips] record count=" + (this.f27401h + 1));
            }
            hashMap2.put(Long.valueOf(itemId), Integer.valueOf(intValue + 1));
            if (intValue < 3) {
                this.f27399f.animate().setStartDelay(0).setDuration(200).alpha(1.0f).setListener(new C8407a(this.f27399f, this.f27400g)).start();
            }
        }
    }
}
