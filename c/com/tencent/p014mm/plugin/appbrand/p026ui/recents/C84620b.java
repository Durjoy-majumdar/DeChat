package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.C84658y;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.b */
public abstract class C84620b {

    /* renamed from: d */
    public C84621a f246905d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.b$a */
    public interface C84621a {
    }

    public C84620b(Activity activity, ViewGroup viewGroup) {
    }

    /* renamed from: c */
    public abstract View mo117312c();

    /* renamed from: d */
    public final boolean mo117320d() {
        return mo117312c() != null && mo117312c().getVisibility() == 0;
    }

    /* renamed from: e */
    public abstract void mo117280e();

    /* renamed from: f */
    public abstract void mo117313f();

    /* renamed from: g */
    public abstract void mo117314g();

    /* renamed from: h */
    public abstract void mo117281h();

    /* renamed from: i */
    public abstract void mo117315i(int i);

    /* renamed from: j */
    public void mo117282j(WeImageView weImageView) {
    }

    /* renamed from: k */
    public abstract void mo117316k(int i);

    /* renamed from: l */
    public final void mo117321l(boolean z) {
        boolean z2;
        if (mo117312c() != null) {
            if (z) {
                if (mo117312c().getVisibility() != 0) {
                    View c = mo117312c();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(c, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AbsAppBrandLauncherListHeader", "setViewEnable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(c, "com/tencent/mm/plugin/appbrand/ui/recents/AbsAppBrandLauncherListHeader", "setViewEnable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (mo117312c().getVisibility() != 8) {
                View c2 = mo117312c();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(c2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AbsAppBrandLauncherListHeader", "setViewEnable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(c2, "com/tencent/mm/plugin/appbrand/ui/recents/AbsAppBrandLauncherListHeader", "setViewEnable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C84621a aVar3 = this.f246905d;
            if (aVar3 != null) {
                View c3 = mo117312c();
                C84658y yVar = (C84658y) aVar3;
                if (yVar.f246981g != null) {
                    boolean z3 = true;
                    Log.m105925i("AppBrandLauncherRecentsListHeaderController", "onViewEnabledChanged [%s] [%s] [%b]", this, c3, Boolean.valueOf(z));
                    if (!(yVar.f246981g == null || yVar.f246979e == null)) {
                        boolean z4 = false;
                        for (int i = 0; i < yVar.f246979e.size() - 1; i++) {
                            C84620b bVar = yVar.f246979e.get(i);
                            if (bVar != null) {
                                if (!z4) {
                                    z4 = bVar.mo117320d();
                                }
                                if (!bVar.mo117320d()) {
                                    ViewGroup viewGroup = yVar.f246981g;
                                    View childAt = viewGroup.getChildAt(viewGroup.indexOfChild(bVar.mo117312c()) + 1);
                                    if (childAt != null) {
                                        C9556a aVar4 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                        aVar4.mo10233c(8);
                                        View view = childAt;
                                        C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "resetDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        childAt.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "resetDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                    if (childAt instanceof C84658y.C84660b) {
                                        if (!z4) {
                                        }
                                    }
                                }
                                int i2 = i + 1;
                                while (true) {
                                    if (i2 >= yVar.f246979e.size()) {
                                        z2 = false;
                                        break;
                                    }
                                    C84620b bVar2 = yVar.f246979e.get(i2);
                                    if (bVar2 != null && bVar2.mo117320d()) {
                                        z2 = true;
                                        break;
                                    }
                                    i2++;
                                }
                                if (z2) {
                                    ViewGroup viewGroup2 = yVar.f246981g;
                                    View childAt2 = viewGroup2.getChildAt(viewGroup2.indexOfChild(bVar.mo117312c()) + 1);
                                    if (childAt2 != null) {
                                        C9556a aVar5 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                                        aVar5.mo10233c(0);
                                        View view2 = childAt2;
                                        C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "resetDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        childAt2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "resetDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                }
                            }
                        }
                    }
                    Iterator<C84620b> it = yVar.f246979e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z3 = false;
                            break;
                        }
                        View c4 = it.next().mo117312c();
                        if (c4 != null && c4.getVisibility() == 0) {
                            Log.m105925i("AppBrandLauncherRecentsListHeaderController", "hasValidHeader %s", this);
                            break;
                        }
                    }
                    if (z3) {
                        yVar.f246981g.setVisibility(0);
                    } else {
                        yVar.f246981g.setVisibility(8);
                    }
                    if (yVar.f246982h) {
                        yVar.mo117370r();
                    }
                }
            }
        }
    }
}
