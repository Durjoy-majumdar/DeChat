package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C112919c0;
import bl3.C0324s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.nearby.live.square.operation.FinderLiveOperationFragment;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import gy3.C24560g0;
import ht1.C8815x4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import ln1.C10585g;
import sx3.C22415w0;
import t91.C64208c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveOperationUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveOperationUI */
public class FinderLiveOperationUI extends MMFinderUI {

    /* renamed from: o */
    public boolean f14524o;

    /* renamed from: p */
    public final FinderLiveOperationFragment f14525p = new FinderLiveOperationFragment();

    /* renamed from: q */
    public boolean f14526q;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveOperationUI$a */
    public static final class C2965a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveOperationUI f14527d;

        public C2965a(FinderLiveOperationUI finderLiveOperationUI) {
            this.f14527d = finderLiveOperationUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveOperationUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f14527d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOperationUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return "FinderLiveOperationUI";
    }

    public void finish() {
        this.f14526q = true;
        C10585g.f31933a.mo10845c();
        super.finish();
    }

    public int getLayoutId() {
        return this.f14524o ? C0966R.C0971layout.ah4 : C0966R.C0971layout.f359729ah3;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C0324s.m265a(C24560g0.m30725a(C8815x4.class)));
    }

    public void onCreate(Bundle bundle) {
        this.f14524o = getIntent().getIntExtra("key_use_dark_style", 1) == 1;
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        if (this.f14524o) {
            getController().mo177081j0(getContext().getResources().getColor(C0966R.color.f2947a4));
            setBackGroundColorResource(C0966R.color.f2947a4);
        }
        findViewById(C0966R.C0970id.a37).setOnClickListener(new C2965a(this));
        ((TextView) findViewById(C0966R.C0970id.e0i)).setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3619c)) * C76577a.m92161l(getContext()));
        String stringExtra = getIntent().getStringExtra("key_page_title");
        if (!TextUtils.isEmpty(stringExtra)) {
            ((TextView) findViewById(C0966R.C0970id.e0i)).setText(stringExtra);
        }
        View findViewById = findViewById(C0966R.C0970id.j4j);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOperationUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOperationUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        FinderLiveOperationFragment finderLiveOperationFragment = this.f14525p;
        Intent intent = getIntent();
        finderLiveOperationFragment.setArguments(intent != null ? intent.getExtras() : null);
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.mo165167i(C0966R.C0970id.e_o, this.f14525p, (String) null, 1);
        beginTransaction.mo165171o(this.f14525p).mo165163e();
        this.f14526q = false;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f14525p.setArguments(intent != null ? intent.getExtras() : null);
    }

    public void onPause() {
        super.onPause();
        if (this.f14526q) {
            C64208c.C64209a aVar = C64208c.f181951a;
            C64208c.f181952b = false;
        }
    }

    public void onResume() {
        C64208c.C64209a aVar = C64208c.f181951a;
        C64208c.f181952b = true;
        super.onResume();
    }
}
