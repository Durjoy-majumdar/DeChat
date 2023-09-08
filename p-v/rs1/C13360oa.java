package rs1;

import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ht1.C8804s4;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import up1.C37521f;

@C113200q(initialMode = 2)
/* renamed from: rs1.oa */
public final class C13360oa extends UIComponent implements C8804s4 {

    /* renamed from: d */
    public final MMHandler f37869d = new MMHandler(Looper.getMainLooper());

    static {
        new LinkedHashSet();
        new ConcurrentHashMap();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13360oa(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C37521f.f99374d.getClass();
        C37521f.f99198I6.mo60266n().intValue();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f37869d.removeCallbacksAndMessages((Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13360oa(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C37521f.f99374d.getClass();
        C37521f.f99198I6.mo60266n().intValue();
    }
}
