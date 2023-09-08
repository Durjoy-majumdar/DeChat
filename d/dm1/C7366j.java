package dm1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.music.FinderQQMusicFollowHeaderView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64726td1;

/* renamed from: dm1.j */
public final class C7366j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderQQMusicFollowHeaderView f25496d;

    /* renamed from: e */
    public final /* synthetic */ FinderObject f25497e;

    /* renamed from: f */
    public final /* synthetic */ C64726td1 f25498f;

    public C7366j(FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView, FinderObject finderObject, C64726td1 td12) {
        this.f25496d = finderQQMusicFollowHeaderView;
        this.f25497e = finderObject;
        this.f25498f = td12;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$refreshView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView = this.f25496d;
        FinderObject finderObject = this.f25497e;
        C64726td1 td12 = this.f25498f;
        int i = FinderQQMusicFollowHeaderView.f15499n;
        finderQQMusicFollowHeaderView.mo3536c(finderObject, td12);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$refreshView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
