package vv1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.fts.p059ui.widget.C18865a;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import uv1.C65479a;
import uv1.C65484f;
import yb2.C15946a;

/* renamed from: vv1.e */
public final class C78488e extends C15946a {

    /* renamed from: vv1.e$a */
    public static final class C78489a<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C78488e f229925d;

        public C78489a(C78488e eVar) {
            this.f229925d = eVar;
        }

        public void onChanged(Object obj) {
            C65479a aVar = (C65479a) obj;
            C87412m.m108594g(aVar, "state");
            C65484f fVar = (C65484f) aVar.checkAction(C65484f.class);
            if (fVar != null) {
                new C18865a(this.f229925d.getActivity(), fVar.f188437a).show();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78488e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C78489a(this));
        }
    }
}
