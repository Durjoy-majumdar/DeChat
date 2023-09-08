package d92;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import ba2.C39747a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d92.C107028a;
import di3.C86312j;
import gy3.C87412m;
import hn3.C108252a;
import java.util.concurrent.atomic.AtomicInteger;
import k92.C108974b;
import nj3.C88990b;
import qp0.C89788e;
import rx3.C13598b0;

/* renamed from: d92.c */
public class C45293c implements C107028a {

    /* renamed from: a */
    public Activity f122669a;

    /* renamed from: b */
    public CustomViewPager f122670b;

    /* renamed from: c */
    public C45292b f122671c;

    /* renamed from: d */
    public SwipeBackLayout.C19854d f122672d;

    /* renamed from: e */
    public C107028a.C45290a f122673e;

    /* renamed from: f */
    public int f122674f = -1;

    /* renamed from: d92.c$a */
    public static final class C45294a implements C88990b.C61771c {

        /* renamed from: a */
        public final /* synthetic */ AtomicInteger f122675a;

        /* renamed from: b */
        public final /* synthetic */ C45293c f122676b;

        /* renamed from: c */
        public final /* synthetic */ C107028a.C45291b f122677c;

        /* renamed from: d92.c$a$a */
        public static final class C45295a implements C88990b.C61771c {

            /* renamed from: a */
            public final /* synthetic */ C107028a.C45291b f122678a;

            public C45295a(C107028a.C45291b bVar) {
                this.f122678a = bVar;
            }

            public final void onComplete(boolean z) {
                C107028a.C45291b bVar = this.f122678a;
                if (bVar != null) {
                    bVar.onComplete(z);
                }
            }
        }

        public C45294a(AtomicInteger atomicInteger, C45293c cVar, C107028a.C45291b bVar) {
            this.f122675a = atomicInteger;
            this.f122676b = cVar;
            this.f122677c = bVar;
        }

        public final void onComplete(boolean z) {
            if (z || this.f122675a.getAndIncrement() >= 1) {
                C107028a.C45291b bVar = this.f122677c;
                if (bVar != null) {
                    bVar.onComplete(z);
                    return;
                }
                return;
            }
            C88990b.m111194c(this.f122676b.getActivity(), new C45295a(this.f122677c));
        }
    }

    public C45293c(Activity activity) {
        mo67913o(activity);
        this.f122672d = new C45296d(this);
    }

    /* renamed from: a */
    public int mo67904a() {
        return -1;
    }

    /* renamed from: b */
    public ViewGroup mo67905b() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        View decorView = activity.getWindow().getDecorView();
        C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) decorView;
    }

    /* renamed from: c */
    public boolean mo70828c() {
        return true;
    }

    /* renamed from: d */
    public void mo70829d() {
    }

    /* renamed from: e */
    public void mo67906e(boolean z, C108974b bVar) {
        MultiTaskInfo a;
        C87412m.m108594g(bVar, "helper");
        Log.m105925i("MicroMsg.MultiTaskPageAdapter", "finish, withAnimation:%s", Boolean.valueOf(z));
        if (bVar.mo160082g() && (a = bVar.mo160078a()) != null) {
            String str = a.field_id;
            C87412m.m108593f(str, "it.field_id");
            ((C105919k) C86312j.m106911c(C105919k.class)).mo151050r5(0, str, a.field_type);
        }
        if (getActivity() instanceof MMActivity) {
            Intent intent = getIntent();
            if (intent != null) {
                if (z) {
                    intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2461dn);
                    intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
                } else {
                    intent.putExtra("MMActivity.OverrideExitAnimation", 0);
                    intent.putExtra("MMActivity.OverrideEnterAnimation", 0);
                }
            }
            Activity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: f */
    public void mo70830f(C108974b bVar) {
        if (getActivity() instanceof MMFragmentActivity) {
            if (this.f122671c == null) {
                this.f122671c = ((C105919k) C86312j.m106911c(C105919k.class)).Cj0(getActivity());
            }
            C45292b bVar2 = this.f122671c;
            if (bVar2 != null) {
                bVar2.mo70826d(this, bVar);
            }
        }
    }

    /* renamed from: g */
    public boolean mo67907g() {
        if (getActivity() instanceof MMActivity) {
            Activity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((MMActivity) activity).getSwipeBackLayout() != null) {
                return true;
            }
        }
        return false;
    }

    public Activity getActivity() {
        return this.f122669a;
    }

    public Bitmap getBitmap() {
        if (C39747a.f106638a.mo62383a(this.f122674f)) {
            return null;
        }
        try {
            boolean z = getActivity() instanceof MMActivity;
            View maskView = getMaskView();
            if (maskView != null) {
                return C108252a.m146586d(getMaskView(), (int) (((float) maskView.getWidth()) / 1.0f), (int) (((float) maskView.getHeight()) / 1.0f), true, Bitmap.Config.RGB_565);
            }
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.MultiTaskPageAdapter", "get bitmap failed", th);
        }
        return null;
    }

    public View getContentView() {
        if (getActivity() instanceof MMActivity) {
            Activity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((MMActivity) activity).getSwipeBackLayout() != null) {
                Activity activity2 = getActivity();
                C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                return ((MMActivity) activity2).getSwipeBackLayout();
            }
        }
        if (getActivity() instanceof MMFragmentActivity) {
            Activity activity3 = getActivity();
            C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            if (((MMFragmentActivity) activity3).getSwipeBackLayout() != null) {
                Activity activity4 = getActivity();
                C87412m.m108592e(activity4, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                return ((MMFragmentActivity) activity4).getSwipeBackLayout();
            }
        }
        return null;
    }

    public Intent getIntent() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getIntent();
        }
        return null;
    }

    public View getMaskView() {
        CustomViewPager customViewPager;
        Window window;
        Window window2;
        View view = null;
        if (getActivity() instanceof MMActivity) {
            Activity activity = getActivity();
            if (activity == null || (window2 = activity.getWindow()) == null) {
                return null;
            }
            return window2.getDecorView();
        } else if (!(getActivity() instanceof MMFragmentActivity) || (customViewPager = this.f122670b) == null) {
            return null;
        } else {
            if (customViewPager != null) {
                return customViewPager;
            }
            Activity activity2 = getActivity();
            if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
                view = window.getDecorView();
            }
            return view;
        }
    }

    /* renamed from: h */
    public Bitmap mo70832h(Bitmap bitmap, int i) {
        if (!C39747a.f106638a.mo62383a(this.f122674f) && bitmap != null) {
            try {
                float width = (float) bitmap.getWidth();
                float height = (float) bitmap.getHeight();
                Matrix matrix = new Matrix();
                float f = (float) 2;
                matrix.setRotate((float) i, width / f, height / f);
                return Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, true);
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.MultiTaskPageAdapter", "get rotate bitmap failed", th);
            }
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo70833i() {
        return this instanceof C89788e;
    }

    /* renamed from: j */
    public void mo70834j(boolean z) {
        C45292b bVar = this.f122671c;
        if (bVar != null) {
            bVar.mo70824b(z);
        }
    }

    /* renamed from: k */
    public void mo70835k() {
    }

    /* renamed from: l */
    public void mo70836l(int i) {
        this.f122674f = i;
    }

    /* renamed from: m */
    public void mo67911m(C107028a.C45290a aVar) {
        CustomViewPager customViewPager;
        Boolean a;
        this.f122673e = aVar;
        if (getActivity() instanceof MMActivity) {
            Activity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((MMActivity) activity).getSwipeBackLayout() != null) {
                C45292b bVar = this.f122671c;
                C13598b0 b0Var = null;
                if (!(bVar == null || (a = bVar.mo70823a()) == null)) {
                    a.booleanValue();
                    C45292b bVar2 = this.f122671c;
                    if (bVar2 != null) {
                        bVar2.mo70825c(this.f122672d);
                        b0Var = C13598b0.f38549a;
                    }
                }
                if (b0Var == null) {
                    Activity activity2 = getActivity();
                    C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((MMActivity) activity2).getSwipeBackLayout().setSwipeBackListener(this.f122672d);
                    return;
                }
                return;
            }
        }
        if ((getActivity() instanceof MMFragmentActivity) && (customViewPager = this.f122670b) != null && customViewPager != null) {
            customViewPager.setSwipeBackListener(this.f122672d);
        }
    }

    /* renamed from: n */
    public void mo67912n(C107028a.C45291b bVar) {
        Log.m105924i("MicroMsg.MultiTaskPageAdapter", "convertToTranslucent");
        C88990b.m111194c(getActivity(), new C45294a(new AtomicInteger(0), this, bVar));
        Log.m105924i("MicroMsg.MultiTaskPageAdapter", "multiTask page convertActivityToTranslucent");
    }

    /* renamed from: o */
    public void mo67913o(Activity activity) {
        this.f122669a = activity;
    }

    public C45293c(Activity activity, CustomViewPager customViewPager) {
        mo67913o(activity);
        this.f122670b = customViewPager;
        this.f122672d = new C45296d(this);
    }
}
