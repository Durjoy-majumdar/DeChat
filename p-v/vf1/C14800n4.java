package vf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileTimeLineUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.n4 */
public final class C14800n4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTimeLineUI f40786d;

    /* renamed from: vf1.n4$a */
    public static final class C14801a implements C85861e4.C85862a {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileTimeLineUI f40787a;

        public C14801a(FinderProfileTimeLineUI finderProfileTimeLineUI) {
            this.f40787a = finderProfileTimeLineUI;
        }

        /* renamed from: a */
        public void mo4165a() {
            FinderProfileTimeLineUI finderProfileTimeLineUI = this.f40787a;
            int i = FinderProfileTimeLineUI.f14726A;
            finderProfileTimeLineUI.mo3091N7().f42965i.setImageResource(C0966R.raw.icons_outlined_sperated);
        }

        /* renamed from: b */
        public void mo4166b() {
            FinderProfileTimeLineUI finderProfileTimeLineUI = this.f40787a;
            int i = FinderProfileTimeLineUI.f14726A;
            finderProfileTimeLineUI.mo3091N7().f42965i.setImageResource(C0966R.raw.icons_outlined_merge);
        }
    }

    /* renamed from: vf1.n4$b */
    public static final class C14802b implements C85878m2.C85879a {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileTimeLineUI f40788a;

        public C14802b(FinderProfileTimeLineUI finderProfileTimeLineUI) {
            this.f40788a = finderProfileTimeLineUI;
        }

        /* renamed from: a */
        public void mo4167a() {
            FinderProfileTimeLineUI finderProfileTimeLineUI = this.f40788a;
            int i = FinderProfileTimeLineUI.f14726A;
            finderProfileTimeLineUI.mo3091N7().f42965i.setImageResource(C0966R.raw.icons_outlined_sperated);
        }

        /* renamed from: b */
        public void mo4168b() {
            FinderProfileTimeLineUI finderProfileTimeLineUI = this.f40788a;
            int i = FinderProfileTimeLineUI.f14726A;
            finderProfileTimeLineUI.mo3091N7().f42965i.setImageResource(C0966R.raw.icons_outlined_merge);
        }
    }

    public C14800n4(FinderProfileTimeLineUI finderProfileTimeLineUI) {
        this.f40786d = finderProfileTimeLineUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$fixActionBarStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C85875k4.m106199o0()) {
            FinderProfileTimeLineUI finderProfileTimeLineUI = this.f40786d;
            C85861e4.m106119f(finderProfileTimeLineUI, true, true, new C14801a(finderProfileTimeLineUI));
        } else {
            C85878m2.m106216e(this.f40786d.getTaskId(), new C14802b(this.f40786d));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$fixActionBarStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
