package kf1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import f40.C86709a0;
import je1.C46530q2;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import rx3.C13598b0;
import zc1.C66785b;

/* renamed from: kf1.v7 */
public final class C10013v7 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f30709d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f30710e;

    /* renamed from: f */
    public final /* synthetic */ Activity f30711f;

    /* renamed from: kf1.v7$a */
    public static final class C10014a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C10014a f30712d = new C10014a();

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: kf1.v7$b */
    public static final class C10015b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C46530q2 f30713d;

        /* renamed from: e */
        public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f30714e;

        /* renamed from: f */
        public final /* synthetic */ Activity f30715f;

        public C10015b(C46530q2 q2Var, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, Activity activity) {
            this.f30713d = q2Var;
            this.f30714e = finderProfileTimelineContract$ProfileTimelinePresenter;
            this.f30715f = activity;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if ((yVar instanceof C46530q2) && ((C46530q2) yVar).f125356i == this.f30713d.f125356i) {
                C89137b0 d = C86709a0.m107524d();
                this.f30713d.getClass();
                d.mo123470p(3627, this);
            }
            Dialog dialog = this.f30714e.f13135A;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (i != 0 || i2 != 0) {
                C76912y0.makeText((Context) this.f30715f, (int) C0966R.string.ejw, 0).show();
            }
        }
    }

    public C10013v7(BaseFinderFeed baseFinderFeed, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, Activity activity) {
        this.f30709d = baseFinderFeed;
        this.f30710e = finderProfileTimelineContract$ProfileTimelinePresenter;
        this.f30711f = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C13598b0 b0Var;
        C46530q2 q2Var = new C46530q2(C66785b.f191882e.mo90662O5(), this.f30709d.mo3513o().getFeedObject());
        Dialog dialog = this.f30710e.f13135A;
        if (dialog != null) {
            dialog.show();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.f30710e;
            Activity activity = this.f30711f;
            finderProfileTimelineContract$ProfileTimelinePresenter.f13135A = C76879j.m92723Q(activity, activity.getString(C0966R.string.a3h), activity.getString(C0966R.string.a4d), true, false, C10014a.f30712d);
        }
        C86709a0.m107524d().mo123455a(3627, new C10015b(q2Var, this.f30710e, this.f30711f));
        C86709a0.m107524d().mo123460f(q2Var);
    }
}
