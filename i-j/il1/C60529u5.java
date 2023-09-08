package il1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C7777a0;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import p140cw.C7138g;
import xk1.C66297d2;

/* renamed from: il1.u5 */
public final class C60529u5 implements CaptureDataManager.C94403b {

    /* renamed from: d */
    public final MMActivity f172524d;

    /* renamed from: e */
    public final C66297d2.C15724d f172525e;

    /* renamed from: f */
    public final String f172526f = "Finder.FinderLivePostCoverWidget";

    /* renamed from: g */
    public final ImageView f172527g;

    /* renamed from: h */
    public String f172528h = "";

    /* renamed from: i */
    public String f172529i = "";

    /* renamed from: j */
    public String f172530j = "";

    /* renamed from: n */
    public final int f172531n = 10010;

    /* renamed from: o */
    public C7777a0 f172532o;

    /* renamed from: il1.u5$a */
    public static final class C60530a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60529u5 f172533d;

        public C60530a(C60529u5 u5Var) {
            this.f172533d = u5Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLivePostCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C86709a0.m107535s().mo121147n()) {
                C76912y0.m92772k(this.f172533d.f172524d);
            } else {
                C60529u5 u5Var = this.f172533d;
                ((C7138g) C86312j.m106911c(C7138g.class)).mo8311H7(u5Var.f172524d, u5Var.f172531n, 1, 28, (Intent) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C60529u5(MMActivity mMActivity, ViewGroup viewGroup, C66297d2.C15724d dVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(viewGroup, "coverLayout");
        C87412m.m108594g(dVar, "callback");
        this.f172524d = mMActivity;
        this.f172525e = dVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dk6);
        C87412m.m108593f(findViewById, "coverLayout.findViewById….id.finder_live_cover_iv)");
        this.f172527g = (ImageView) findViewById;
        viewGroup.setOnClickListener(new C60530a(this));
    }

    /* renamed from: U5 */
    public void mo79064U5(boolean z, RecordMediaReportInfo recordMediaReportInfo, Bundle bundle) {
    }

    /* renamed from: i2 */
    public void mo4197i2(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("key_extra_data", bundle);
        C87412m.m108592e(captureVideoNormalModel, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("KSEGMENTMEDIAINFO", captureVideoNormalModel);
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* renamed from: l1 */
    public boolean mo4198l1(Context context, Bundle bundle, CaptureDataManager.C94402a aVar) {
        return false;
    }
}
