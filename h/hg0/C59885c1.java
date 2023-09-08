package hg0;

import android.widget.AbsListView;
import com.tencent.p014mm.plugin.account.friend.model.RecoverFriendPresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hg0.c1 */
public class C59885c1 implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public final /* synthetic */ RecoverFriendPresenter f170956d;

    public C59885c1(RecoverFriendPresenter recoverFriendPresenter) {
        this.f170956d = recoverFriendPresenter;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/friend/model/RecoverFriendPresenter$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        Log.m105919d("MicroMsg.RecoverFriendPresenter", "firstVisibleItem %d, visibleItemCount %d, totalItemCount %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (i3 > 0 && i + i2 == i3) {
            Log.m105924i("MicroMsg.RecoverFriendPresenter", "scroll to the end");
            this.f170956d.mo93947g();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/model/RecoverFriendPresenter$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/friend/model/RecoverFriendPresenter$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/model/RecoverFriendPresenter$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
