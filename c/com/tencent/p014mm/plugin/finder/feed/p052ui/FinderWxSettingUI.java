package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import di3.C86312j;
import er1.C58684b;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import je1.C9370r3;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import up1.C37521f;
import vp1.C14927d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderWxSettingUI */
public final class FinderWxSettingUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderWxSettingUI$a */
    public static final class C3088a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderWxSettingUI f14925d;

        public C3088a(FinderWxSettingUI finderWxSettingUI) {
            this.f14925d = finderWxSettingUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14925d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderWxSettingUI$b */
    public static final class C3089b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderWxSettingUI f14926d;

        public C3089b(FinderWxSettingUI finderWxSettingUI) {
            this.f14926d = finderWxSettingUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C58684b) C86312j.m106911c(C58684b.class)).dy0(this.f14926d, (Intent) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderWxSettingUI$c */
    public static final class C3090c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderWxSettingUI f14927d;

        public C3090c(FinderWxSettingUI finderWxSettingUI) {
            this.f14927d = finderWxSettingUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
            FinderWxSettingUI finderWxSettingUI = this.f14927d;
            bVar.getClass();
            C87412m.m108594g(finderWxSettingUI, "context");
            C58684b.Cx0(bVar, finderWxSettingUI, (Intent) null, 1, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.arb;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C14927d.C14929b bVar = C14927d.f40957e;
        bVar.mo13977a().mo13976a();
        bVar.mo13977a().getClass();
        C86709a0.m107524d().mo123460f(new C9370r3(1));
        setBackBtn(new C3088a(this));
        setMMTitle("");
        findViewById(C0966R.C0970id.few).setOnClickListener(new C3089b(this));
        ((TextView) findViewById(C0966R.C0970id.izq)).setText(getString(C0966R.string.foh));
        View findViewById = findViewById(C0966R.C0970id.fel);
        C37521f.f99374d.getClass();
        if (C37521f.f99270R0.mo60266n().intValue() == 1) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C3090c(this));
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onDestroy() {
        super.onDestroy();
        C14927d.f40957e.mo13977a().mo13976a();
    }
}
