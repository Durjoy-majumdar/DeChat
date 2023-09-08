package ce1;

import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import od1.C11404g;
import rd1.C12972a;
import te3.C51270sn1;

/* renamed from: ce1.f0 */
public class C0464f0 extends C11404g<C51270sn1> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0464f0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public void mo498c3(int i, String str) {
        super.mo498c3(i, str);
        C12972a aVar = new C12972a(getActivity());
        aVar.mo12503b();
        aVar.mo12502a(i, str);
        if (i == -4058) {
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            feedUpdateEvent.f9173d.f9174a = aVar.f36995a.getIntent().getLongExtra("key_feed_ref_id", 0);
            feedUpdateEvent.f9173d.f9175b = 13;
            feedUpdateEvent.publish();
        }
    }

    /* renamed from: d3 */
    public void mo327d3(int i, String str) {
        super.mo327d3(i, str);
        Log.m105924i("FinderActivityTipsUIC", "responseCode:" + i + ", errMsg:" + str);
        if (!getActivity().isFinishing()) {
            getActivity().finish();
        }
    }

    /* renamed from: k3 */
    public void mo509k3() {
        FrameLayout frameLayout;
        super.mo509k3();
        if (!Util.isNullOrNil(getIntent().getStringExtra("key_cover_url")) && (frameLayout = this.f33560g) != null) {
            frameLayout.setBackground(getResources().getDrawable(C0966R.C0969drawable.aod));
        }
    }
}
