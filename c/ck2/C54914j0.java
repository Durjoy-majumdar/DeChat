package ck2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import o40.C61926c;
import wj2.C66132f;
import xj2.C66286a;

/* renamed from: ck2.j0 */
public final class C54914j0 extends UIComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54914j0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo75843c3(C66132f fVar, String str) {
        C87412m.m108594g(fVar, "desc");
        C87412m.m108594g(str, "username");
        C66286a.m78216c(4, C61926c.m72691p(fVar.f190092o), 2, str, false, false, 48, (Object) null);
    }

    /* renamed from: d3 */
    public final void mo75844d3(C66132f fVar, String str, boolean z) {
        int i;
        String str2;
        C66132f fVar2 = fVar;
        C87412m.m108594g(fVar, "desc");
        long j = fVar2.f190092o;
        if (j != 0) {
            i = 2;
        } else if (fVar2.f190094q != 0) {
            i = 1;
        } else {
            return;
        }
        if (i == 1) {
            str2 = String.valueOf(fVar2.f190094q);
        } else if (i == 2) {
            str2 = C61926c.m72691p(j);
        } else {
            return;
        }
        C66286a.m78215b(2, str2, i, str, fVar2.f190091n, z);
    }

    /* renamed from: e3 */
    public final void mo75845e3(C66132f fVar, String str, boolean z) {
        int i;
        String str2;
        C87412m.m108594g(fVar, "desc");
        int i2 = fVar.f190094q;
        if (i2 != 0) {
            str2 = String.valueOf(i2);
            i = 1;
        } else {
            long j = fVar.f190092o;
            if (j != 0) {
                str2 = C61926c.m72691p(j);
                i = 2;
            } else {
                str2 = "0";
                i = 3;
            }
        }
        C66286a.m78216c(1, str2, i, str, false, z, 16, (Object) null);
    }

    /* renamed from: f3 */
    public final void mo75846f3(C66132f fVar, String str, boolean z) {
        int i;
        String str2;
        C66132f fVar2 = fVar;
        if (fVar2 != null) {
            long j = fVar2.f190092o;
            if (j != 0) {
                i = 2;
            } else if (fVar2.f190094q != 0) {
                i = 1;
            } else {
                return;
            }
            if (i == 1) {
                str2 = String.valueOf(fVar2.f190094q);
            } else if (i == 2) {
                str2 = C61926c.m72691p(j);
            } else {
                return;
            }
            C66286a.m78215b(3, str2, i, str, fVar2.f190091n, z);
        }
    }
}
