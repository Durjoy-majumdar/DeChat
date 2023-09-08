package no1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;

/* renamed from: no1.f */
public final class C11241f extends C11240e {

    /* renamed from: f */
    public int f33143f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11241f(AppCompatActivity appCompatActivity, Fragment fragment, int i, List<Integer> list) {
        super(appCompatActivity, fragment, list, (List) null, (String) null, 24, (C8480h) null);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f33143f = i;
    }

    /* renamed from: a */
    public void mo11313a() {
        for (View backgroundColor : this.f33142e) {
            backgroundColor.setBackgroundColor(this.f33143f);
        }
    }
}
