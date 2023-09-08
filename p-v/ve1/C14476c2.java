package ve1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import cm1.C0797z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import p565ir.C60606n;
import rx3.C13598b0;
import sk1.C63947a;
import te3.C64273c21;

/* renamed from: ve1.c2 */
public final class C14476c2 extends C87413o implements C32227p<Boolean, FinderVideoLayout.C56521b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f40119d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40120e;

    /* renamed from: f */
    public final /* synthetic */ C0797z f40121f;

    /* renamed from: g */
    public final /* synthetic */ FinderFeedFullLiveConvert f40122g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14476c2(View view, C60905o oVar, C0797z zVar, FinderFeedFullLiveConvert finderFeedFullLiveConvert) {
        super(2);
        this.f40119d = view;
        this.f40120e = oVar;
        this.f40121f = zVar;
        this.f40122g = finderFeedFullLiveConvert;
    }

    public Object invoke(Object obj, Object obj2) {
        View view;
        FinderVideoLayout.C56521b bVar = (FinderVideoLayout.C56521b) obj2;
        boolean z = true;
        int i = 0;
        if (!((Boolean) obj).booleanValue()) {
            View view2 = this.f40119d;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ImageView imageView = (ImageView) this.f40120e.mo85812D(C0966R.C0970id.dgq);
            if (!(imageView == null || imageView.getVisibility() == 8)) {
                Object tag = imageView.getTag();
                Boolean bool = Boolean.TRUE;
                if (!C87412m.m108589b(tag, bool)) {
                    imageView.setAlpha(1.0f);
                    imageView.animate().cancel();
                    imageView.setTag(bool);
                    imageView.animate().setStartDelay(300).setDuration(300).alpha(0.0f).setListener(new C14466b2(imageView)).start();
                }
            }
            ImageView imageView2 = (ImageView) this.f40120e.mo85812D(C0966R.C0970id.kk8);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        } else {
            C64273c21 liveInfo = this.f40121f.mo3513o().getLiveInfo();
            if ((liveInfo != null ? liveInfo.f182394f : 2) == 1 && !this.f40122g.mo2396W0(this.f40121f) && (view = this.f40119d) != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ImageView imageView3 = (ImageView) this.f40120e.mo85812D(C0966R.C0970id.dgq);
            if (imageView3 != null) {
                imageView3.animate().cancel();
                imageView3.setVisibility(0);
            }
        }
        FinderFeedFullLiveConvert finderFeedFullLiveConvert = this.f40122g;
        Context context = this.f40120e.mo85811C().getContext();
        Window window = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            window = activity.getWindow();
        }
        C64273c21 liveInfo2 = this.f40121f.mo3513o().getLiveInfo();
        if (finderFeedFullLiveConvert.f12785T) {
            StringBuilder sb = new StringBuilder();
            sb.append("tryToLockScreenRecord window:");
            if (window != null) {
                i = window.hashCode();
            }
            sb.append(i);
            sb.append(",liveInfo:");
            sb.append(C63947a.f181274a.mo88736v(liveInfo2));
            sb.append(", have lock!");
            Log.m105924i("Finder.FeedFullLiveConvert", sb.toString());
        } else {
            if (C32444a.f86114X1.mo60266n().intValue() != 1 || !((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(liveInfo2)) {
                z = false;
            }
            finderFeedFullLiveConvert.f12785T = z;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("tryToLockScreenRecord:");
            sb4.append(finderFeedFullLiveConvert.f12785T);
            sb4.append(",window:");
            if (window != null) {
                i = window.hashCode();
            }
            sb4.append(i);
            sb4.append(",liveInfo:");
            sb4.append(C63947a.f181274a.mo88736v(liveInfo2));
            sb4.append('!');
            Log.m105924i("Finder.FeedFullLiveConvert", sb4.toString());
            if (finderFeedFullLiveConvert.f12785T && window != null) {
                window.setFlags(8192, 8192);
            }
        }
        return C13598b0.f38549a;
    }
}
