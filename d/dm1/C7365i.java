package dm1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.music.FinderQQMusicFollowHeaderView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: dm1.i */
public final class C7365i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderQQMusicFollowHeaderView f25494d;

    /* renamed from: e */
    public final /* synthetic */ FinderObject f25495e;

    public C7365i(FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView, FinderObject finderObject) {
        this.f25494d = finderQQMusicFollowHeaderView;
        this.f25495e = finderObject;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7370n nVar = this.f25494d.f15505i;
        if (nVar != null) {
            nVar.mo8538a(this.f25495e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("topicFollowHelper");
        throw null;
    }
}
