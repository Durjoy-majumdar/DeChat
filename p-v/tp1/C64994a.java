package tp1;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import o40.C61937h;
import qp1.C63309d;
import qp1.C63310e;
import qp1.C63313h;
import sk1.C63965x;
import sp1.C64100l0;
import sx3.C36907w;
import te3.C64370fp1;
import te3.v44;

/* renamed from: tp1.a */
public final class C64994a extends UIComponent {

    /* renamed from: d */
    public FinderLiveShoppingManagerPresenter f187118d;

    /* renamed from: e */
    public C63313h f187119e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64994a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ajv;
    }

    public void onCreate(Bundle bundle) {
        v44 v44;
        super.onCreate(bundle);
        this.f187118d = new FinderLiveShoppingManagerPresenter(getActivity());
        AppCompatActivity activity = getActivity();
        FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter = this.f187118d;
        C87412m.m108591d(finderLiveShoppingManagerPresenter);
        C63313h hVar = new C63313h(activity, finderLiveShoppingManagerPresenter);
        this.f187119e = hVar;
        FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter2 = this.f187118d;
        if (finderLiveShoppingManagerPresenter2 != null) {
            finderLiveShoppingManagerPresenter2.f160923e = hVar;
            Serializable serializableExtra = finderLiveShoppingManagerPresenter2.f160919a.getIntent().getSerializableExtra("KEY_PRODUCTLIST");
            List<byte[]> list = serializableExtra instanceof List ? (List) serializableExtra : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (byte[] parseFrom : list) {
                    LinkedList<C0740i2> linkedList = finderLiveShoppingManagerPresenter2.f160922d;
                    C64370fp1 fp12 = new C64370fp1();
                    fp12.parseFrom(parseFrom);
                    arrayList.add(Boolean.valueOf(linkedList.add(new C63965x(fp12))));
                }
            }
            byte[] byteArrayExtra = finderLiveShoppingManagerPresenter2.f160919a.getIntent().getByteArrayExtra("KEY_PARAMS");
            if (byteArrayExtra != null) {
                v44 = new v44();
                v44.parseFrom(byteArrayExtra);
            } else {
                v44 = null;
            }
            finderLiveShoppingManagerPresenter2.f160924f = v44;
            finderLiveShoppingManagerPresenter2.f160925g.alive();
            String str = finderLiveShoppingManagerPresenter2.f160920b;
            StringBuilder sb = new StringBuilder();
            sb.append("init params:");
            Object obj = finderLiveShoppingManagerPresenter2.f160924f;
            if (obj == null) {
                obj = "";
            }
            sb.append(C61937h.m72709h(obj));
            Log.m105924i(str, sb.toString());
        }
        C63313h hVar2 = this.f187119e;
        if (hVar2 != null) {
            View findViewById = hVar2.f179650a.findViewById(C0966R.C0970id.e7j);
            C87412m.m108593f(findViewById, "activity.findViewById(R.…inder_shopping_edit_area)");
            C64100l0 l0Var = new C64100l0(findViewById, hVar2.f179651b.f160922d, FinderLiveShoppingPriceView.f160997p, new C63309d(hVar2));
            l0Var.f181755q.f176505d = hVar2.f179651b.f160921c;
            C64100l0.m75430c(l0Var, true, false, 2, (Object) null);
            l0Var.f181755q.f176511j = new C63310e(hVar2);
            hVar2.f179652c = l0Var;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter = this.f187118d;
        if (finderLiveShoppingManagerPresenter != null) {
            finderLiveShoppingManagerPresenter.f160925g.dead();
            finderLiveShoppingManagerPresenter.f160923e = null;
        }
    }
}
