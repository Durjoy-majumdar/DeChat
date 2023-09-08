package p433g;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import p215oo.C77032h;
import yb2.C15946a;

/* renamed from: g.b */
public final class C27075b extends C15946a {

    /* renamed from: g.b$a */
    public static final class C27076a {
        public C27076a(C8480h hVar) {
        }
    }

    static {
        new C27076a((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27075b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            ((C77032h) C86312j.m106911c(C77032h.class)).mo107357DR();
        }
    }
}
