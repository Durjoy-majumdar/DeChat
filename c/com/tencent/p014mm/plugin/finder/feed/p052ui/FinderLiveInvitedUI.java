package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveInvitedUI;", "Lcom/tencent/mm/ui/MMActivity;", "Landroid/view/View$OnClickListener;", "Lob0/n;", "Landroid/view/View;", "v", "Lrx3/b0;", "onClick", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveInvitedUI */
public final class FinderLiveInvitedUI extends MMActivity implements View.OnClickListener, C11385n {
    public int getLayoutId() {
        return C0966R.C0971layout.aha;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveInvitedUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveInvitedUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }
}
