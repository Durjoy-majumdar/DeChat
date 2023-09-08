package p849e3;

import android.view.ViewParent;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;

/* renamed from: e3.y */
public final /* synthetic */ class C86422y extends C24565l implements C32226l<ViewParent, ViewParent> {

    /* renamed from: d */
    public static final C86422y f251213d = new C86422y();

    public C86422y() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public Object invoke(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        C87412m.m108594g(viewParent, "p0");
        return viewParent.getParent();
    }
}
