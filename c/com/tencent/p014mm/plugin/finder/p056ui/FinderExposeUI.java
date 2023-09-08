package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderExposeUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderExposeUI */
public final class FinderExposeUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderExposeUI$a */
    public static final class C18757a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderExposeUI f52500d;

        public C18757a(FinderExposeUI finderExposeUI) {
            this.f52500d = finderExposeUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f52500d.finish();
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new C18757a(this));
    }
}
