package xk1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58777u0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nd3.C88930e;
import p447aw.C103918d;
import sx3.C110823p;

/* renamed from: xk1.g0 */
public final class C66310g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66355w f190897d;

    /* renamed from: xk1.g0$a */
    public static final class C66311a implements C88930e {

        /* renamed from: a */
        public final /* synthetic */ C66355w f190898a;

        public C66311a(C66355w wVar) {
            this.f190898a = wVar;
        }

        public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            Integer C;
            String str = this.f190898a.f191025d;
            StringBuilder sb = new StringBuilder();
            sb.append("checkLivePermission() requestCode=");
            sb.append(i);
            sb.append(" permissions=");
            sb.append(strArr);
            sb.append(" grantResults=");
            C87412m.m108593f(iArr, "grantResults");
            sb.append(C110823p.m150977C(iArr));
            Log.m105924i(str, sb.toString());
            if ((!(iArr.length == 0)) && (C = C110823p.m150977C(iArr)) != null && C.intValue() == 0) {
                C58777u0.f168283a.mo83838g(9, this.f190898a.f191039u);
                this.f190898a.mo90455G3();
            }
        }
    }

    public C66310g0(C66355w wVar) {
        this.f190897d = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f190897d.mo90464m3()) {
            C58777u0 u0Var = C58777u0.f168283a;
            if (C58777u0.f168284b == 18) {
                u0Var.mo83833b(5);
            }
            if (C58777u0.f168284b == 19) {
                u0Var.mo83833b(2);
            }
            this.f190897d.mo90455G3();
        } else if (((C103918d) C86312j.m106911c(C103918d.class)).mo125775MJ(this.f190897d.getContext(), "android.permission.RECORD_AUDIO", 80, "", "", new C66311a(this.f190897d))) {
            C58777u0.f168283a.mo83838g(9, this.f190897d.f191039u);
            this.f190897d.mo90455G3();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
