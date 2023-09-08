package dh1;

import al1.C54127h;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.app.AppCompatActivity;
import cj1.C54795n5;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import fj1.C45795b;
import gy3.C87412m;
import te3.C49712hj1;
import vk1.C65762c;

/* renamed from: dh1.d */
public abstract class C58268d extends C58269e {

    /* renamed from: e */
    public final AppCompatActivity f166847e;

    /* renamed from: f */
    public C65762c f166848f;

    /* renamed from: g */
    public C54127h f166849g;

    /* renamed from: h */
    public C49712hj1 f166850h;

    public C58268d(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, "context");
        this.f166847e = appCompatActivity;
    }

    /* renamed from: i */
    public final View mo83046i(int i, View view) {
        C87412m.m108594g(view, "root");
        View inflate = ((ViewStub) view.findViewById(i)).inflate();
        C87412m.m108593f(inflate, "stub.inflate()");
        return inflate;
    }

    /* renamed from: j */
    public C65762c mo83047j() {
        return this.f166848f;
    }

    /* renamed from: k */
    public C54795n5 mo83048k() {
        FinderLiveService.f159376d.getClass();
        return FinderLiveService.f159396y;
    }

    /* renamed from: l */
    public void mo83049l(C65762c cVar, C49712hj1 hj12) {
        C87412m.m108594g(cVar, "baseRouter");
        this.f166849g = cVar.getData();
        C45795b buContext = cVar.getBuContext();
        C87412m.m108594g(buContext, "<set-?>");
        this.f166851d = buContext;
        this.f166848f = cVar;
        this.f166850h = hj12;
    }

    /* renamed from: m */
    public final View mo83050m(int i, View view) {
        C87412m.m108594g(view, "root");
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub != null) {
            return viewStub.inflate();
        }
        return null;
    }
}
