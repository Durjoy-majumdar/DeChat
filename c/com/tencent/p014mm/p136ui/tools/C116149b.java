package com.tencent.p014mm.p136ui.tools;

import android.app.Activity;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.widget.WXActionMenuView;

/* renamed from: com.tencent.mm.ui.tools.b */
public class C116149b implements WXActionMenuView.C74962b {

    /* renamed from: a */
    public final /* synthetic */ C106741c f348602a;

    public C116149b(C106741c cVar) {
        this.f348602a = cVar;
    }

    /* renamed from: a */
    public boolean mo104358a(Activity activity, MenuItem menuItem) {
        this.f348602a.getClass();
        if (activity == null) {
            return false;
        }
        activity.onOptionsItemSelected(menuItem);
        return true;
    }
}
