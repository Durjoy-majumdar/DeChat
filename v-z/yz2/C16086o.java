package yz2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: yz2.o */
public final class C16086o extends UIComponent {

    /* renamed from: d */
    public static int f43233d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16086o(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f43233d++;
    }

    public void onDestroy() {
        super.onDestroy();
        f43233d--;
    }
}
