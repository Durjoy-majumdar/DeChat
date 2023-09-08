package hj3;

import android.app.Activity;
import android.transition.Transition;
import com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.p136ui.chatting.gallery.C97153x;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gj3.C59471d;
import gy3.C87412m;
import ij3.C60331a;
import java.lang.ref.WeakReference;
import p387u9.C22617a;

/* renamed from: hj3.b */
public final class C20955b implements C59931c {

    /* renamed from: a */
    public static final C20955b f59396a = new C20955b();

    /* renamed from: hj3.b$a */
    public static final class C20956a extends C22617a {

        /* renamed from: a */
        public final /* synthetic */ C59471d f59397a;

        /* renamed from: b */
        public final /* synthetic */ Activity f59398b;

        /* renamed from: hj3.b$a$a */
        public static final class C20957a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Activity f59399d;

            public C20957a(Activity activity) {
                this.f59399d = activity;
            }

            public final void run() {
                for (WeakReference weakReference : MMTransitionHelper.f165034a.mo81991b(this.f59399d).f165041e) {
                    C60331a aVar = (C60331a) weakReference.get();
                    if (aVar != null) {
                        aVar.mo81999g(true);
                    }
                }
            }
        }

        public C20956a(C59471d dVar, Activity activity) {
            this.f59397a = dVar;
            this.f59398b = activity;
        }

        public void onTransitionEnd(Transition transition) {
            ImageGalleryUI$$w0 imageGalleryUI$$w0;
            Log.m105918d("MM.Transition", "handleEnter onTransitionEnd");
            C59471d dVar = this.f59397a;
            if (!(dVar == null || (imageGalleryUI$$w0 = ((C97153x) dVar).f285095a.f284428e2) == null)) {
                ((C97056h.C97063f.C97066b) imageGalleryUI$$w0).mo135948a(Boolean.FALSE);
            }
            this.f59398b.getWindow().getSharedElementEnterTransition().removeListener(this);
            MMTransitionHelper.f165034a.mo81991b(this.f59398b).f165042f = true;
            MMHandlerThread.postToMainThread(new C20957a(this.f59398b));
        }

        public void onTransitionStart(Transition transition) {
            ImageGalleryUI$$w0 imageGalleryUI$$w0;
            Log.m105918d("MM.Transition", "handleEnter onTransitionStart");
            C59471d dVar = this.f59397a;
            if (dVar != null && (imageGalleryUI$$w0 = ((C97153x) dVar).f285095a.f284428e2) != null) {
                ((C97056h.C97063f.C97066b) imageGalleryUI$$w0).mo135948a(Boolean.TRUE);
            }
        }
    }

    /* renamed from: a */
    public void mo32697a(Activity activity, C59471d dVar) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MM.Transition", "handleEnter: enterTransition:" + activity.getWindow().getSharedElementEnterTransition());
        activity.getWindow().getSharedElementEnterTransition().addListener(new C20956a(dVar, activity));
    }
}
