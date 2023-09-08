package p277yf;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.view.C106853e;
import ig3.C108460i;
import me3.C109612c;
import p248ug.C111159e;
import p248ug.C111161j0;
import p248ug.C111162m0;
import p248ug.C111164r0;
import p520fi.C107546c;
import zp3.C112659d0;
import zp3.C112660e0;
import zp3.C112661i0;
import zp3.C112666k0;

/* renamed from: yf.e */
public class C112438e extends C111164r0 {

    /* renamed from: b */
    public C106853e f336674b;

    /* renamed from: c */
    public C111162m0 f336675c;

    /* renamed from: a */
    public void mo162892a() {
        ArtistCacheManager.m140185a().mo148159b();
    }

    /* renamed from: b */
    public C111162m0 mo162893b() {
        if (this.f336675c == null) {
            this.f336675c = new C108460i(this.f336674b.getPresenter());
        }
        return this.f336675c;
    }

    /* renamed from: c */
    public C111159e mo162894c(Context context) {
        if (this.f336674b == null) {
            Log.m105918d("MicroMsg.MMPhotoEditorImpl", "mDrawingView == null, create a new one");
            C111164r0.C111166b bVar = this.f332923a.f332924a;
            if (bVar == C111164r0.C111166b.VIDEO) {
                this.f336674b = new C112666k0(context);
            } else if (bVar == C111164r0.C111166b.PHOTO) {
                this.f336674b = new C112660e0(context);
            } else if (bVar == C111164r0.C111166b.SCREEN) {
                this.f336674b = new C112659d0(context);
            } else if (bVar == C111164r0.C111166b.VIDEO_COVER) {
                this.f336674b = new C112661i0(context);
            }
        } else {
            Log.m105918d("MicroMsg.MMPhotoEditorImpl", "recycled");
            if (this.f336674b.getParent() != null) {
                ((ViewGroup) this.f336674b.getParent()).removeView(this.f336674b);
            }
        }
        this.f336674b.setup(this.f332923a);
        return this.f336674b;
    }

    /* renamed from: d */
    public void mo162895d(C111164r0.C111165a aVar) {
        this.f332923a = aVar;
        ArtistCacheManager.m140185a().mo148162e(Util.nullAs(this.f332923a.f332927d, "MicroMsg.MMPhotoEditorImpl"));
        C107546c.f321771c.mo157987b(Util.nullAs(this.f332923a.f332927d, "MicroMsg.MMPhotoEditorImpl"));
    }

    /* renamed from: e */
    public boolean mo162896e() {
        C109612c cVar = (C109612c) this.f336674b.getPresenter();
        if (cVar.f328158a.getTextEditView().getVisibility() == 0) {
            cVar.mo160834r(false);
            cVar.f328158a.setFooterVisible(true);
        } else if (cVar.f328158a.getChatFooterPanel() == null || cVar.f328158a.getChatFooterPanel().getVisibility() != 0) {
            return false;
        } else {
            cVar.f328158a.mo154840c(true);
            cVar.f328158a.setFooterVisible(true);
        }
        return true;
    }

    /* renamed from: f */
    public void mo162897f() {
        C111164r0.C111165a aVar = this.f332923a;
        if (aVar != null && !aVar.f332925b) {
            ArtistCacheManager.m140185a().mo148163f(Util.nullAs(this.f332923a.f332927d, "MicroMsg.MMPhotoEditorImpl"));
        }
        C106853e eVar = this.f336674b;
        if (eVar != null) {
            ((C109612c) eVar.getPresenter()).mo160828l();
        }
        try {
            this.f336674b.getChatFooterPanel().mo100189b();
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.MMPhotoEditorImpl", "[onDestroy] may be has destory!");
        }
    }

    /* renamed from: g */
    public void mo162898g(C111161j0 j0Var) {
        C109612c cVar = (C109612c) this.f336674b.getPresenter();
        cVar.getClass();
        C109612c.C109617d dVar = new C109612c.C109617d(j0Var, !((C108460i) mo162893b()).mo159007g());
        ThreadPool.post(dVar, "onFinalGenerate_" + j0Var.hashCode());
    }
}
