package ud1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ud1.g */
public final class C14161g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f39600d;

    public C14161g(FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f39600d = finderMusicTopicHeaderUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initFav$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f39600d;
        boolean z = !finderMusicTopicHeaderUIC.f12473h;
        finderMusicTopicHeaderUIC.f12473h = z;
        finderMusicTopicHeaderUIC.f12474i++;
        String string = z ? finderMusicTopicHeaderUIC.getActivity().getResources().getString(C0966R.string.dcm) : finderMusicTopicHeaderUIC.getActivity().getResources().getString(C0966R.string.d2q);
        C87412m.m108593f(string, "if (isFav) {\n           …ncel_fav_title)\n        }");
        C75026b.m89951a(finderMusicTopicHeaderUIC.getActivity(), string);
        finderMusicTopicHeaderUIC.mo2210I3();
        finderMusicTopicHeaderUIC.mo2208F3(1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initFav$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
