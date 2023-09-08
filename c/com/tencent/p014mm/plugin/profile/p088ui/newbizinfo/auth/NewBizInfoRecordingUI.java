package com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.auth;

import ac2.C39535k;
import ac2.C91988j;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import gy3.C8480h;
import gy3.C87412m;
import if2.C46240a;
import if2.C46243b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import zb2.C103009m;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI */
public final class NewBizInfoRecordingUI extends MMActivity {

    /* renamed from: d */
    public String f115468d;

    /* renamed from: e */
    public MvvmList<C46243b> f115469e;

    /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI$a */
    public static abstract class C42654a {

        /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI$a$a */
        public static final class C42655a extends C42654a {

            /* renamed from: a */
            public static final C42655a f115470a = new C42655a();
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI$a$b */
        public static final class C42656b extends C42654a {

            /* renamed from: a */
            public static final C42656b f115471a = new C42656b();
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI$a$c */
        public static final class C42657c extends C42654a {

            /* renamed from: a */
            public static final C42657c f115472a = new C42657c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI$b */
    public static final class C42658b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ NewBizInfoRecordingUI f115473d;

        public C42658b(NewBizInfoRecordingUI newBizInfoRecordingUI) {
            this.f115473d = newBizInfoRecordingUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f115473d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI$c */
    public static final class C42659c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ NewBizInfoRecordingUI f115474d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView f115475e;

        /* renamed from: f */
        public final /* synthetic */ TextView f115476f;

        /* renamed from: g */
        public final /* synthetic */ ProgressBar f115477g;

        public C42659c(NewBizInfoRecordingUI newBizInfoRecordingUI, RecyclerView recyclerView, TextView textView, ProgressBar progressBar) {
            this.f115474d = newBizInfoRecordingUI;
            this.f115475e = recyclerView;
            this.f115476f = textView;
            this.f115477g = progressBar;
        }

        public void onChanged(Object obj) {
            NewBizInfoRecordingUI newBizInfoRecordingUI = this.f115474d;
            C39535k kVar = ((C91988j) obj).f263327a;
            MvvmList<C46243b> mvvmList = newBizInfoRecordingUI.f115469e;
            if (mvvmList != null) {
                ArrayList<T> arrayList = mvvmList.f272353o;
                boolean z = true;
                if (!arrayList.isEmpty() && ((C46243b) arrayList.get(0)).f124655e != 1) {
                    z = false;
                }
                Object obj2 = (kVar != C39535k.UIRefresh || !z) ? ((kVar == C39535k.BeforeLoadPage || kVar == C39535k.AfterLoadPage) && z) ? C42654a.C42656b.f115471a : C42654a.C42655a.f115470a : C42654a.C42657c.f115472a;
                RecyclerView recyclerView = this.f115475e;
                C87412m.m108593f(recyclerView, "recyclerView");
                int i = 8;
                int i2 = C87412m.m108589b(obj2, C42654a.C42655a.f115470a) ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                recyclerView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f115476f;
                C87412m.m108593f(textView, "noDataTips");
                int i3 = C87412m.m108589b(obj2, C42654a.C42657c.f115472a) ? 0 : 8;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Integer.valueOf(i3));
                TextView textView2 = textView;
                C117292a.m165358d(textView2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(textView2, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ProgressBar progressBar = this.f115477g;
                C87412m.m108593f(progressBar, "initialProgressBar");
                if (C87412m.m108589b(obj2, C42654a.C42656b.f115471a)) {
                    i = 0;
                }
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(Integer.valueOf(i));
                ProgressBar progressBar2 = progressBar;
                C117292a.m165358d(progressBar2, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                progressBar.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(progressBar2, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("liveList");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cs4;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ech);
        hideActionbarLine();
        setBackBtn(new C42658b(this));
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        String stringExtra = getIntent().getStringExtra("Contact_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f115468d = stringExtra;
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.mno);
        ProgressBar progressBar = (ProgressBar) findViewById(C0966R.C0970id.mnn);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f357566mo1);
        String str = this.f115468d;
        if (str != null) {
            C46240a aVar = new C46240a(str);
            C53769h hVar = new C53769h();
            hVar.f150920a = true;
            C13598b0 b0Var = C13598b0.f38549a;
            MvvmList mvvmList = new MvvmList(aVar, hVar, this, (LifecycleScope) null, (List) null, 24, (C8480h) null);
            this.f115469e = mvvmList;
            recyclerView.setAdapter(new C103009m(mvvmList, new NewBizInfoRecordingUI$buildItemConvertFactory$1(), false));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            MvvmList<C46243b> mvvmList2 = this.f115469e;
            if (mvvmList2 != null) {
                mvvmList2.f272358t.observe(this, new C42659c(this, recyclerView, textView, progressBar));
            } else {
                C87412m.m108603p("liveList");
                throw null;
            }
        } else {
            C87412m.m108603p("username");
            throw null;
        }
    }
}
