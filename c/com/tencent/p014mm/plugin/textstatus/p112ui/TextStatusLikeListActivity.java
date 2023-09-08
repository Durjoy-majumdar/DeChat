package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.C112911a0;
import androidx.fragment.app.C112919c0;
import androidx.lifecycle.C39622i0;
import androidx.viewpager.widget.ViewPager;
import az2.C39674e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import fy3.C32224a;
import fz2.C45871g;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.HashSet;
import k20.C9556a;
import kotlin.Metadata;
import p192l4.C10462b;
import p255vr.C65873e;
import p739wi.C78601d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uy2.C52661f;
import uy2.C52665g;
import yz2.C16086o;
import yz2.C53700n2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "<init>", "()V", "a", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity */
public final class TextStatusLikeListActivity extends MMActivity implements MStorage.IOnStorageChange {

    /* renamed from: f */
    public static final C43209a f116931f = new C43209a((C8480h) null);

    /* renamed from: d */
    public final C13601g f116932d = C36568h.m40985a(new C43211c(this));

    /* renamed from: e */
    public final C13601g f116933e = C36568h.m40985a(new C43212d(this));

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity$a */
    public static final class C43209a {
        public C43209a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo67454a(Context context, int i) {
            C87412m.m108594g(context, "context");
            if (C39674e.f106452d.mo62248f0().mo72361a() != 0) {
                Intent intent = new Intent(context, TextStatusLikeListActivity.class);
                intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                intent.putExtra("reportEnterScene", i);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForUnRead", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForUnRead", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity$b */
    public static final class C43210b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusLikeListActivity f116934d;

        public C43210b(TextStatusLikeListActivity textStatusLikeListActivity) {
            this.f116934d = textStatusLikeListActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f116934d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity$c */
    public static final class C43211c extends C87413o implements C32224a<C53700n2.C53701a> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusLikeListActivity f116935d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43211c(TextStatusLikeListActivity textStatusLikeListActivity) {
            super(0);
            this.f116935d = textStatusLikeListActivity;
        }

        public Object invoke() {
            return ((C53700n2) C39818r.f106831a.mo62444c(this.f116935d).mo75002a(C53700n2.class)).mo74291f3();
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity$d */
    public static final class C43212d extends C87413o implements C32224a<C45871g> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusLikeListActivity f116936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43212d(TextStatusLikeListActivity textStatusLikeListActivity) {
            super(0);
            this.f116936d = textStatusLikeListActivity;
        }

        public Object invoke() {
            View findViewById = this.f116936d.findViewById(C0966R.C0970id.gkr);
            FrameLayout frameLayout = (FrameLayout) findViewById;
            ViewPager viewPager = (ViewPager) C10462b.m10395a(findViewById, C0966R.C0970id.hqu);
            if (viewPager != null) {
                return new C45871g(frameLayout, frameLayout, viewPager);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(C0966R.C0970id.hqu)));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c9g;
    }

    public void onCreate(Bundle bundle) {
        String ep02 = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(2);
        C87412m.m108593f(ep02, "getService(IFTSApiLogicS…atus.SessionScene.NOTIFY)");
        C52665g.f147056g = ep02;
        super.onCreate(bundle);
        C39622i0 a = C39818r.f106831a.mo62443b(this).mo75002a(C52661f.class);
        C87412m.m108593f(a, "UICProvider.of(context).…PagerDataUIC::class.java)");
        if (((Number) ((C36570n) ((C52661f) a).f147050e).getValue()).intValue() > 1) {
            ((C45871g) ((C36570n) this.f116933e).getValue()).f123827a.setAdapter((C112911a0) ((C36570n) this.f116932d).getValue());
            return;
        }
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.mo165167i(C0966R.C0970id.gkr, ((C112911a0) ((C36570n) this.f116932d).getValue()).getItem(0), (String) null, 1);
        beginTransaction.mo165162d();
        if (getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) == 1) {
            setMMTitle((int) C0966R.string.k17);
        } else {
            setMMTitle((int) C0966R.string.k1u);
        }
        setBackBtn(new C43210b(this));
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
    }

    public void onResume() {
        super.onResume();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        Class cls = C52661f.class;
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(cls);
        hashSet.add(C16086o.class);
        hashSet.add(C52665g.class);
        C39622i0 a = C39818r.f106831a.mo62443b(this).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(context).…PagerDataUIC::class.java)");
        if (((Number) ((C36570n) ((C52661f) a).f147050e).getValue()).intValue() > 1) {
            hashSet.add(C78601d.class);
            hashSet.add(C53700n2.class);
        }
    }
}
