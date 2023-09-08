package od1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ld1.C10486a;
import ld1.C10487b;
import od1.C11405h;
import pe3.C47465a;

/* renamed from: od1.i */
public class C11407i<T extends C47465a> extends UIComponent implements C11405h {

    /* renamed from: d */
    public T f33564d;

    /* renamed from: e */
    public FrameLayout f33565e;

    /* renamed from: f */
    public C11396b<T> f33566f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11407i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c2 */
    public void mo513c2() {
    }

    /* renamed from: c3 */
    public void mo498c3(int i, String str) {
    }

    /* renamed from: d3 */
    public void mo327d3(int i, String str) {
    }

    /* renamed from: e3 */
    public void mo514e3() {
        C11396b<T> bVar = this.f33566f;
        if (bVar != null) {
            bVar.mo496b(getActivity());
        }
    }

    /* renamed from: f3 */
    public void mo314f3() {
        FrameLayout frameLayout = (FrameLayout) getActivity().findViewById(C0966R.C0970id.f5505gz);
        this.f33565e = frameLayout;
        if ((frameLayout != null ? frameLayout.getChildCount() : -1) == 0 && (getActivity() instanceof C10487b)) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.base.config.IHeaderConfig");
            int z5 = ((C10487b) activity).mo2197z5();
            if (z5 > 0) {
                View inflate = C85868k2.m106137b(getActivity()).inflate(z5, (ViewGroup) null);
                FrameLayout frameLayout2 = this.f33565e;
                if (frameLayout2 != null) {
                    frameLayout2.addView(inflate);
                }
            }
        }
    }

    /* renamed from: g3 */
    public void mo492g3(T t) {
        mo515i3(t);
        mo315j3();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.mo495a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getCoverImgUrl() {
        /*
            r1 = this;
            od1.b<T> r0 = r1.f33566f
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.mo495a()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r0 = ""
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: od1.C11407i.getCoverImgUrl():java.lang.String");
    }

    /* renamed from: i0 */
    public boolean mo11416i0() {
        return C11405h.C11406a.m11253a(this);
    }

    /* renamed from: i3 */
    public void mo515i3(T t) {
        this.f33564d = t;
        C11396b<T> bVar = this.f33566f;
        if (bVar != null) {
            bVar.f33539a = t;
        }
    }

    /* renamed from: j3 */
    public void mo315j3() {
        C11405h.C11406a.m11254b(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppCompatActivity activity = getActivity();
        C11396b<T> bVar = null;
        C10486a aVar = activity instanceof C10486a ? (C10486a) activity : null;
        if (aVar != null) {
            bVar = aVar.mo2195V3();
        }
        this.f33566f = bVar;
        mo514e3();
        mo314f3();
    }

    public void setNormalStyle() {
    }
}
