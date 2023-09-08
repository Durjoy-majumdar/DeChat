package p964fd;

import android.content.Context;
import android.view.View;
import com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import hm0.C87557d;
import hm0.C87562h;
import p1066yc.C91403e0;
import p1066yc.C91407f0;
import p1066yc.C91418n;
import p964fd.C86821c0;
import p964fd.C86827e0;
import po0.C89427n;

/* renamed from: fd.d0 */
public class C86825d0 extends C91403e0 {

    /* renamed from: e */
    public C87562h<TextureImageViewLikeImpl> f251987e = null;

    /* renamed from: f */
    public final /* synthetic */ C89427n f251988f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86825d0(C86827e0.C86828a aVar, C91418n nVar, C89427n nVar2) {
        super(nVar);
        this.f251988f = nVar2;
    }

    /* renamed from: a */
    public void mo109565a(View view, Runnable runnable) {
        if (this.f251988f.mo123755a()) {
            super.mo109565a(view, runnable);
        } else if (!(view instanceof TextureImageViewLikeImpl)) {
            Log.m105928w(this.f262113a, "transferTo, view is not instanceof TextureImageViewLikeImpl");
            if (runnable != null) {
                Log.m105924i(this.f262113a, "transferTo, run afterTransferToTask when view is not instanceof TextureImageViewLikeImpl");
                runnable.run();
            }
        } else {
            mo121265g().mo109565a((TextureImageViewLikeImpl) view, runnable);
        }
    }

    /* renamed from: b */
    public void mo109554b(View view, Runnable runnable) {
        if (this.f251988f.mo123755a()) {
            super.mo109554b(view, runnable);
        } else if (!(view instanceof TextureImageViewLikeImpl)) {
            Log.m105928w(this.f262113a, "transferFrom, view is not instanceof TextureImageViewLikeImpl");
            if (runnable != null) {
                Log.m105924i(this.f262113a, "transferFrom, run afterTransferFromTask when view is not instanceof TextureImageViewLikeImpl");
                runnable.run();
            }
        } else {
            mo121265g().mo109554b((TextureImageViewLikeImpl) view, runnable);
        }
    }

    /* renamed from: c */
    public C87557d mo109566c() {
        return !this.f251988f.mo123755a() ? mo121265g().mo109566c() : C91403e0.f262111c;
    }

    /* renamed from: d */
    public void mo109567d(View view) {
        if (this.f251988f.mo123755a()) {
            return;
        }
        if (view instanceof TextureImageViewLikeImpl) {
            mo121265g().mo109567d((TextureImageViewLikeImpl) view);
        } else {
            Log.m105928w(this.f262113a, "recycleVideoContainerView, view is not instanceof TextureImageViewLikeImpl");
        }
    }

    /* renamed from: e */
    public View mo109555e(Context context) {
        return !this.f251988f.mo123755a() ? mo121265g().mo109555e(context) : new C91407f0(this, context);
    }

    /* renamed from: f */
    public void mo109568f(View view) {
        if (this.f251988f.mo123755a()) {
            String str = this.f262113a;
            Log.m105924i(str, "onPlayEndWorkaround, view: " + view);
        } else if (!(view instanceof TextureImageViewLikeImpl)) {
            Log.m105928w(this.f262113a, "onPlayEndWorkaround, view is not instanceof TextureImageViewLikeImpl");
        } else {
            mo121265g().mo109568f((TextureImageViewLikeImpl) view);
        }
    }

    /* renamed from: g */
    public final C87562h<TextureImageViewLikeImpl> mo121265g() {
        if (this.f251987e == null) {
            this.f251987e = ((C86821c0.C86822a) C86821c0.f251981c).mo109562a(this.f251988f);
        }
        return this.f251987e;
    }
}
