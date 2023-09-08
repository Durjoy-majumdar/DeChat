package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import f40.C86709a0;
import kotlin.Metadata;
import lc3.C10485b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderUnOpenUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderUnOpenUI */
public final class FinderUnOpenUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderUnOpenUI$a */
    public static final class C3759a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderUnOpenUI f17201d;

        public C3759a(FinderUnOpenUI finderUnOpenUI) {
            this.f17201d = finderUnOpenUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f17201d.finish();
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aqz;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setMMTitle("");
        setBackBtn(new C3759a(this));
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderFunctionUnopenTip");
        TextView textView = (TextView) findViewById(C0966R.C0970id.kms);
        if (c == null) {
            c = getString(C0966R.string.et4);
        }
        textView.setText(c);
    }
}
