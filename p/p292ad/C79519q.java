package p292ad;

import android.content.Context;
import android.view.View;
import com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import hm0.C87557d;
import hm0.C87562h;
import jo0.C88003e;
import p1066yc.C91403e0;
import p1066yc.C91407f0;
import p1066yc.C91418n;
import p292ad.C79516p;
import p292ad.C79520r;

/* renamed from: ad.q */
public class C79519q extends C91403e0 {

    /* renamed from: e */
    public C87562h<TextureImageViewLikeImpl> f233161e = null;

    /* renamed from: f */
    public final /* synthetic */ C88003e f233162f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79519q(C79520r.C79521a aVar, C91418n nVar, C88003e eVar) {
        super(nVar);
        this.f233162f = eVar;
    }

    /* renamed from: a */
    public void mo109565a(View view, Runnable runnable) {
        if (this.f233162f.mo122453a()) {
            super.mo109565a(view, runnable);
        } else if (!(view instanceof TextureImageViewLikeImpl)) {
            Log.m105928w(this.f262113a, "transferTo, view is not instanceof TextureImageViewLikeImpl");
            if (runnable != null) {
                Log.m105924i(this.f262113a, "transferTo, run afterTransferToTask when view is not instanceof TextureImageViewLikeImpl");
                runnable.run();
            }
        } else {
            mo109569g().mo109565a((TextureImageViewLikeImpl) view, runnable);
        }
    }

    /* renamed from: b */
    public void mo109554b(View view, Runnable runnable) {
        if (this.f233162f.mo122453a()) {
            super.mo109554b(view, runnable);
        } else if (!(view instanceof TextureImageViewLikeImpl)) {
            Log.m105928w(this.f262113a, "transferFrom, view is not instanceof TextureImageViewLikeImpl");
            if (runnable != null) {
                Log.m105924i(this.f262113a, "transferFrom, run afterTransferFromTask when view is not instanceof TextureImageViewLikeImpl");
                runnable.run();
            }
        } else {
            mo109569g().mo109554b((TextureImageViewLikeImpl) view, runnable);
        }
    }

    /* renamed from: c */
    public C87557d mo109566c() {
        return !this.f233162f.mo122453a() ? mo109569g().mo109566c() : C91403e0.f262111c;
    }

    /* renamed from: d */
    public void mo109567d(View view) {
        if (this.f233162f.mo122453a()) {
            return;
        }
        if (view instanceof TextureImageViewLikeImpl) {
            mo109569g().mo109567d((TextureImageViewLikeImpl) view);
        } else {
            Log.m105928w(this.f262113a, "recycleVideoContainerView, view is not instanceof TextureImageViewLikeImpl");
        }
    }

    /* renamed from: e */
    public View mo109555e(Context context) {
        return !this.f233162f.mo122453a() ? mo109569g().mo109555e(context) : new C91407f0(this, context);
    }

    /* renamed from: f */
    public void mo109568f(View view) {
        if (this.f233162f.mo122453a()) {
            String str = this.f262113a;
            Log.m105924i(str, "onPlayEndWorkaround, view: " + view);
        } else if (!(view instanceof TextureImageViewLikeImpl)) {
            Log.m105928w(this.f262113a, "onPlayEndWorkaround, view is not instanceof TextureImageViewLikeImpl");
        } else {
            mo109569g().mo109568f((TextureImageViewLikeImpl) view);
        }
    }

    /* renamed from: g */
    public final C87562h<TextureImageViewLikeImpl> mo109569g() {
        if (this.f233161e == null) {
            this.f233161e = ((C79516p.C79517a) C79516p.f233158c).mo109562a(this.f233162f);
        }
        return this.f233161e;
    }
}
