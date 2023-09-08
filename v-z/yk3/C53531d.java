package yk3;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C54492n;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashSet;
import java.util.Set;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: yk3.d */
public final class C53531d extends UIComponent {

    /* renamed from: d */
    public final C13601g f150501d = C36568h.m40985a(C53532a.f150502d);

    /* renamed from: yk3.d$a */
    public static final class C53532a extends C87413o implements C32224a<Set<String>> {

        /* renamed from: d */
        public static final C53532a f150502d = new C53532a();

        public C53532a() {
            super(0);
        }

        public Object invoke() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53531d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo74202c3() {
        Log.m105924i(C54492n.TAG, "clearSer: " + mo74203d3().size());
        mo74203d3().clear();
    }

    /* renamed from: d3 */
    public final Set<String> mo74203d3() {
        return (Set) ((C36570n) this.f150501d).getValue();
    }
}
