package cn3;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import xm3.C78917n;

/* renamed from: cn3.b */
public class C67410b extends C78917n {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67410b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: i3 */
    public ArrayList<View> mo91612i3() {
        ArrayList<View> i3 = super.mo91612i3();
        View g3 = ((C67413d) C39818r.f106831a.mo62443b(getContext()).mo75002a(C67413d.class)).mo91613g3();
        if (g3 != null) {
            i3.add(g3);
        }
        return i3;
    }
}
