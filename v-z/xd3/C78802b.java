package xd3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;

/* renamed from: xd3.b */
public abstract class C78802b implements C78801a {

    /* renamed from: d */
    public boolean f230567d = false;

    /* renamed from: e */
    public boolean f230568e = false;

    /* renamed from: f */
    public View f230569f = null;

    /* renamed from: g */
    public WeakReference<Context> f230570g = null;

    public C78802b(Context context) {
        this.f230570g = new WeakReference<>(context);
        if (mo7969b() > 0) {
            this.f230569f = View.inflate(context, mo7969b(), (ViewGroup) null);
        }
    }

    /* renamed from: a */
    public abstract void mo7968a();

    /* renamed from: b */
    public abstract int mo7969b();

    /* renamed from: c */
    public int mo7974c() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        View view = this.f230569f;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: f */
    public void mo7971f() {
    }

    /* renamed from: g */
    public void mo7975g(int i) {
        if (getView() != null) {
            View view = getView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/banner/BaseBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/banner/BaseBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public View getView() {
        return this.f230569f;
    }
}
