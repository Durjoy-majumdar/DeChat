package dr1;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bd1.C54446b;
import bl3.C39818r;
import bt1.C0378f;
import com.tencent.p014mm.plugin.finder.view.FinderTencentVideoChooseView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7435f2;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49712hj1;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: dr1.a0 */
public final class C7471a0 implements C7478d0 {

    /* renamed from: a */
    public final AppCompatActivity f25685a;

    /* renamed from: b */
    public final FinderTencentVideoChooseView f25686b;

    /* renamed from: c */
    public final C49712hj1 f25687c;

    /* renamed from: d */
    public FinderJumpInfo f25688d;

    /* renamed from: e */
    public List<? extends FinderJumpInfo> f25689e;

    /* renamed from: dr1.a0$a */
    public static final class C7472a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7471a0 f25690d;

        public C7472a(C7471a0 a0Var) {
            this.f25690d = a0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/upload/postui/FinderTencentVideoWidget$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7471a0 a0Var = this.f25690d;
            if (a0Var.f25688d != null) {
                AppCompatActivity appCompatActivity = a0Var.f25685a;
                C7474b0 b0Var = new C7474b0(a0Var);
                C7476c0 c0Var = new C7476c0(a0Var);
                C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C0378f.C0379a aVar = new C0378f.C0379a(appCompatActivity);
                C0378f.C0380b bVar = new C0378f.C0380b(b0Var, c0Var, (C32224a<C13598b0>) null);
                C77407n nVar = new C77407n((Context) appCompatActivity, 1, true);
                nVar.f225771i = aVar;
                nVar.f225782p = bVar;
                nVar.f225795v = null;
                nVar.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/upload/postui/FinderTencentVideoWidget$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C7471a0(AppCompatActivity appCompatActivity, FinderTencentVideoChooseView finderTencentVideoChooseView) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderTencentVideoChooseView, "tencentVideoChooseChooseView");
        this.f25685a = appCompatActivity;
        this.f25686b = finderTencentVideoChooseView;
        this.f25687c = ((C13442s8) C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C13442s8.class)).mo12861q3();
    }

    /* renamed from: a */
    public void mo8615a(List<? extends FinderJumpInfo> list) {
        this.f25688d = list != null ? (FinderJumpInfo) C110818d0.m150916N(list) : null;
        this.f25689e = list;
        C58784w3.f168295a.getClass();
        C66785b bVar = C66785b.f191882e;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        if (!(((a != null ? a.field_extFlag : 0) & 67108864) != 0)) {
            this.f25686b.setVisibility(8);
            return;
        }
        if (this.f25686b.getVisibility() != 0) {
            this.f25686b.setVisibility(0);
            C49712hj1 hj12 = this.f25687c;
            hj12.f134675i = 74;
            C7435f2.f25626a.mo8577a(hj12, "button_post_choose_tencentVideo", 0, (JSONObject) null);
        }
        FinderJumpInfo finderJumpInfo = this.f25688d;
        if (finderJumpInfo != null) {
            FinderTencentVideoChooseView finderTencentVideoChooseView = this.f25686b;
            String str = finderJumpInfo.wording;
            finderTencentVideoChooseView.getIconIv().setIconColor(0);
            finderTencentVideoChooseView.getDescTv().setText(String.valueOf(str));
        }
        this.f25686b.setOnClickListener(new C7472a(this));
    }

    /* renamed from: b */
    public List<FinderJumpInfo> mo8616b() {
        return this.f25689e;
    }
}
