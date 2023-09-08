package uv0;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ball.p1099ui.C105076l;
import com.tencent.p014mm.sdk.platformtools.Log;
import hn3.C108252a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import nj3.C88990b;
import uv0.C111237j;

/* renamed from: uv0.i */
public class C22663i implements C111237j {

    /* renamed from: a */
    public WeakReference<Activity> f65192a;

    /* renamed from: uv0.i$a */
    public class C22664a implements C88990b.C61771c {

        /* renamed from: a */
        public final /* synthetic */ AtomicInteger f65193a;

        /* renamed from: b */
        public final /* synthetic */ C111237j.C52622b f65194b;

        /* renamed from: uv0.i$a$a */
        public class C22665a implements C88990b.C61771c {
            public C22665a() {
            }

            public void onComplete(boolean z) {
                C111237j.C52622b bVar = C22664a.this.f65194b;
                if (bVar != null) {
                    ((C105076l) bVar).mo149224a(z);
                }
            }
        }

        public C22664a(AtomicInteger atomicInteger, C111237j.C52622b bVar) {
            this.f65193a = atomicInteger;
            this.f65194b = bVar;
        }

        public void onComplete(boolean z) {
            if (z || this.f65193a.getAndIncrement() >= 1) {
                C111237j.C52622b bVar = this.f65194b;
                if (bVar != null) {
                    ((C105076l) bVar).mo149224a(z);
                    return;
                }
                return;
            }
            C88990b.m111194c(C22663i.this.getActivity(), new C22665a());
        }
    }

    public C22663i(Activity activity) {
        this.f65192a = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public int mo35652a() {
        return -1;
    }

    /* renamed from: b */
    public ViewGroup mo23512b() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.getWindow().getDecorView();
    }

    /* renamed from: c */
    public boolean mo35779c() {
        return true;
    }

    /* renamed from: d */
    public void mo23513d(boolean z) {
        Log.m105925i("MicroMsg.FloatBallPageAdapter", "finish, withAnimation:%s", Boolean.valueOf(z));
        if (getIntent() != null) {
            if (z) {
                getIntent().putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2461dn);
                getIntent().putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
            } else {
                getIntent().putExtra("MMActivity.OverrideExitAnimation", 0);
                getIntent().putExtra("MMActivity.OverrideEnterAnimation", 0);
            }
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: e */
    public void mo23514e(C111237j.C52621a aVar) {
        Activity activity = getActivity();
        if (activity instanceof MMActivity) {
            ((MMActivity) activity).getSwipeBackLayout();
        }
    }

    /* renamed from: f */
    public void mo23515f(C111237j.C52622b bVar) {
        Log.m105924i("MicroMsg.FloatBallPageAdapter", "convertToTranslucent");
        C88990b.m111194c(getActivity(), new C22664a(new AtomicInteger(0), bVar));
        Log.m105924i("MicroMsg.FloatBallPageAdapter", "float ball page convertActivityToTranslucent");
    }

    /* renamed from: g */
    public boolean mo23516g() {
        return (getActivity() instanceof MMActivity) && ((MMActivity) getActivity()).getSwipeBackLayout() != null;
    }

    public Activity getActivity() {
        if (this.f65192a.get() == null) {
            return null;
        }
        return this.f65192a.get();
    }

    public Bitmap getBitmap() {
        return C108252a.m146585c(getMaskView());
    }

    public View getContentView() {
        Activity activity = getActivity();
        if (!(activity instanceof MMActivity)) {
            return null;
        }
        MMActivity mMActivity = (MMActivity) activity;
        if (mMActivity.getSwipeBackLayout() != null) {
            return mMActivity.getSwipeBackLayout().getTargetContentView();
        }
        return null;
    }

    public Intent getIntent() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return activity.getIntent();
    }

    public View getMaskView() {
        Activity activity = getActivity();
        if (activity instanceof MMActivity) {
            return ((MMActivity) activity).getBodyView();
        }
        return null;
    }
}
