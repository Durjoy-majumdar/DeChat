package com.tencent.p014mm.plugin.brandservice.p028ui.userinfo.p029ui;

import ac2.C39535k;
import ac2.C91988j;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import ey0.C45716b;
import ey0.C7948a;
import fy0.C8219i;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zb2.C103009m;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI */
public final class BrandServiceUserInfoManageUI extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f109681g = 0;

    /* renamed from: d */
    public final C13601g f109682d = C36568h.m40985a(new C40815c(this));

    /* renamed from: e */
    public final C13601g f109683e = C36568h.m40985a(new C40814b(this));

    /* renamed from: f */
    public final C13601g f109684f = C36568h.m40985a(C40818f.f109696d);

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI$a */
    public static abstract class C40810a {

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI$a$a */
        public static final class C40811a extends C40810a {

            /* renamed from: a */
            public static final C40811a f109685a = new C40811a();
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI$a$b */
        public static final class C40812b extends C40810a {

            /* renamed from: a */
            public static final C40812b f109686a = new C40812b();
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI$a$c */
        public static final class C40813c extends C40810a {

            /* renamed from: a */
            public static final C40813c f109687a = new C40813c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI$b */
    public static final class C40814b extends C87413o implements C32224a<C103009m<C7948a>> {

        /* renamed from: d */
        public final /* synthetic */ BrandServiceUserInfoManageUI f109688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40814b(BrandServiceUserInfoManageUI brandServiceUserInfoManageUI) {
            super(0);
            this.f109688d = brandServiceUserInfoManageUI;
        }

        public Object invoke() {
            BrandServiceUserInfoManageUI brandServiceUserInfoManageUI = this.f109688d;
            int i = BrandServiceUserInfoManageUI.f109681g;
            this.f109688d.getClass();
            return new C103009m((MvvmList) ((C36570n) brandServiceUserInfoManageUI.f109682d).getValue(), new BrandServiceUserInfoManageUI$buildItemConvertFactory$1(), false, 4, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI$c */
    public static final class C40815c extends C87413o implements C32224a<MvvmList<C7948a>> {

        /* renamed from: d */
        public final /* synthetic */ BrandServiceUserInfoManageUI f109689d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40815c(BrandServiceUserInfoManageUI brandServiceUserInfoManageUI) {
            super(0);
            this.f109689d = brandServiceUserInfoManageUI;
        }

        public Object invoke() {
            C45716b bVar = new C45716b();
            C53769h hVar = new C53769h();
            hVar.f150920a = true;
            return new MvvmList(bVar, hVar, this.f109689d, (LifecycleScope) null, (List) null, 24, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI$d */
    public static final class C40816d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BrandServiceUserInfoManageUI f109690d;

        public C40816d(BrandServiceUserInfoManageUI brandServiceUserInfoManageUI) {
            this.f109690d = brandServiceUserInfoManageUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f109690d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI$e */
    public static final class C40817e<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ BrandServiceUserInfoManageUI f109691d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView f109692e;

        /* renamed from: f */
        public final /* synthetic */ View f109693f;

        /* renamed from: g */
        public final /* synthetic */ View f109694g;

        /* renamed from: h */
        public final /* synthetic */ ProgressBar f109695h;

        public C40817e(BrandServiceUserInfoManageUI brandServiceUserInfoManageUI, RecyclerView recyclerView, View view, View view2, ProgressBar progressBar) {
            this.f109691d = brandServiceUserInfoManageUI;
            this.f109692e = recyclerView;
            this.f109693f = view;
            this.f109694g = view2;
            this.f109695h = progressBar;
        }

        public void onChanged(Object obj) {
            BrandServiceUserInfoManageUI brandServiceUserInfoManageUI = this.f109691d;
            C39535k kVar = ((C91988j) obj).f263327a;
            int i = BrandServiceUserInfoManageUI.f109681g;
            ArrayList<T> arrayList = ((MvvmList) ((C36570n) brandServiceUserInfoManageUI.f109682d).getValue()).f272353o;
            Object obj2 = (kVar != C39535k.UIRefresh || !arrayList.isEmpty()) ? ((kVar == C39535k.BeforeLoadPage || kVar == C39535k.AfterLoadPage) && arrayList.isEmpty()) ? C40810a.C40812b.f109686a : C40810a.C40811a.f109685a : C40810a.C40813c.f109687a;
            RecyclerView recyclerView = this.f109692e;
            C87412m.m108593f(recyclerView, "recyclerView");
            C40810a.C40811a aVar = C40810a.C40811a.f109685a;
            int i2 = 8;
            int i3 = C87412m.m108589b(obj2, aVar) ? 0 : 8;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i3));
            C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recyclerView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view = this.f109693f;
            C87412m.m108593f(view, "recyclerViewHeader");
            int i4 = C87412m.m108589b(obj2, aVar) ? 0 : 8;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Integer.valueOf(i4));
            View view2 = view;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f109694g;
            C87412m.m108593f(view3, "noDataTvContainer");
            int i5 = C87412m.m108589b(obj2, C40810a.C40813c.f109687a) ? 0 : 8;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(Integer.valueOf(i5));
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ProgressBar progressBar = this.f109695h;
            C87412m.m108593f(progressBar, "initialLoading");
            if (C87412m.m108589b(obj2, C40810a.C40812b.f109686a)) {
                i2 = 0;
            }
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(Integer.valueOf(i2));
            ProgressBar progressBar2 = progressBar;
            C117292a.m165358d(progressBar2, aVar5.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            progressBar.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(progressBar2, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI$f */
    public static final class C40818f extends C87413o implements C32224a<C2149a> {

        /* renamed from: d */
        public static final C40818f f109696d = new C40818f();

        public C40818f() {
            super(0);
        }

        public Object invoke() {
            return new C2149a();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.crz;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new C40816d(this));
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        C8219i.f27144a.mo9271b((TextView) findViewById(C0966R.C0970id.mtd));
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.f357568mo2);
        ((C103009m) ((C36570n) this.f109683e).getValue()).f165746y = (C2149a) ((C36570n) this.f109684f).getValue();
        recyclerView.setAdapter((C103009m) ((C36570n) this.f109683e).getValue());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ((MvvmList) ((C36570n) this.f109682d).getValue()).f272358t.observe(this, new C40817e(this, recyclerView, findViewById(C0966R.C0970id.f357569mo3), findViewById(C0966R.C0970id.f357567f72), (ProgressBar) findViewById(C0966R.C0970id.mnx)));
    }
}
