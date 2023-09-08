package tj2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import pj2.C62324e;

/* renamed from: tj2.b */
public final class C52348b extends UIComponent {

    /* renamed from: d */
    public final C54219z<List<C62324e>> f146317d = new C54219z<>();

    /* renamed from: e */
    public boolean f146318e = true;

    /* renamed from: f */
    public long f146319f = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: g */
    public HashSet<String> f146320g = new HashSet<>();

    /* renamed from: h */
    public ArrayList<C62324e> f146321h = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52348b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f146321h.clear();
        this.f146320g.clear();
    }
}
