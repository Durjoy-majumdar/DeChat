package ud1;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import gy3.C8479f0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import te3.C49018cl1;
import te3.C51270sn1;
import vd1.C14429a;
import vd1.C65584b;

/* renamed from: ud1.d */
public final class C14158d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ List<C49018cl1> f39591d;

    /* renamed from: e */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f39592e;

    /* renamed from: f */
    public final /* synthetic */ int f39593f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<String> f39594g;

    public C14158d(List<? extends C49018cl1> list, FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, int i, C8479f0<String> f0Var) {
        this.f39591d = list;
        this.f39592e = finderMusicTopicHeaderUIC;
        this.f39593f = i;
        this.f39594g = f0Var;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = true;
        if (this.f39591d.get(0).f131808e == 1) {
            FinderContact finderContact = this.f39591d.get(0).f131807d;
            if (finderContact == null || (str = finderContact.username) == null) {
                str = "";
            }
            String str2 = str;
            if (str2.length() <= 0) {
                z = false;
            }
            if (z) {
                C65584b.m77267d(C65584b.f188718a, this.f39592e.getActivity(), str2, (String) null, 4, (Object) null);
            } else {
                C65584b.f188718a.mo89660c(this.f39592e.getContext(), this.f39591d.get(0));
            }
        }
        C14429a aVar = C14429a.f40033a;
        Activity context = this.f39592e.getContext();
        C51270sn1 sn12 = (C51270sn1) this.f39592e.f33564d;
        aVar.mo13714b(context, 1, sn12 != null ? sn12.f141636z : null, this.f39593f, (String) this.f39594g.f27484d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
