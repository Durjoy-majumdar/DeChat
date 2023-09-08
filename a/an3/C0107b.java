package an3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import tm3.C78065p;
import tm3.C78069w;
import yb2.C15946a;

/* renamed from: an3.b */
public class C0107b extends C15946a {

    /* renamed from: an3.b$a */
    public static final class C0108a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0107b f548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0108a(C0107b bVar) {
            super(1);
            this.f548d = bVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (pVar != null) {
                C0107b bVar = this.f548d;
                List<String> list = pVar.f228813a;
                bVar.getClass();
                Intent intent = new Intent();
                intent.putExtra("Select_Conv_User", Util.listToString(list, ","));
                bVar.getActivity().setResult(-1, intent);
                bVar.getActivity().finish();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0107b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onBeforeFinish(Intent intent) {
        C78069w wVar;
        super.onBeforeFinish(intent);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null && (wVar = (C78069w) e3.getState()) != null && wVar.mo108033b()) {
            LinkedList<String> linkedList = wVar.f228826n;
            Intent intent2 = new Intent();
            intent2.putExtra("Select_Conv_User", Util.listToString(linkedList, ","));
            getActivity().setResult(-1, intent2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C0108a(this));
        }
    }
}
