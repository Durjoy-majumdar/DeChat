package vf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderBaseFeedUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kf1.C9640c;
import kf1.C9707f;
import ye1.C15976o;

/* renamed from: vf1.l */
public final class C14788l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderBaseFeedUI<C9707f, C9640c> f40771d;

    /* renamed from: vf1.l$a */
    public static final class C14789a implements C85878m2.C85879a {

        /* renamed from: a */
        public final /* synthetic */ FinderBaseFeedUI<C9707f, C9640c> f40772a;

        public C14789a(FinderBaseFeedUI<C9707f, C9640c> finderBaseFeedUI) {
            this.f40772a = finderBaseFeedUI;
        }

        /* renamed from: a */
        public void mo4167a() {
            C15976o oVar = this.f40772a.f14258o;
            if (oVar != null) {
                oVar.f42965i.setImageResource(C0966R.raw.icons_outlined_sperated);
            } else {
                C87412m.m108603p("finderFullActionBarLayoutBinding");
                throw null;
            }
        }

        /* renamed from: b */
        public void mo4168b() {
            C15976o oVar = this.f40772a.f14258o;
            if (oVar != null) {
                oVar.f42965i.setImageResource(C0966R.raw.icons_outlined_merge);
            } else {
                C87412m.m108603p("finderFullActionBarLayoutBinding");
                throw null;
            }
        }
    }

    /* renamed from: vf1.l$b */
    public static final class C14790b implements C85861e4.C85862a {

        /* renamed from: a */
        public final /* synthetic */ FinderBaseFeedUI<C9707f, C9640c> f40773a;

        public C14790b(FinderBaseFeedUI<C9707f, C9640c> finderBaseFeedUI) {
            this.f40773a = finderBaseFeedUI;
        }

        /* renamed from: a */
        public void mo4165a() {
            C15976o oVar = this.f40773a.f14258o;
            if (oVar != null) {
                oVar.f42965i.setImageResource(C0966R.raw.icons_outlined_sperated);
            } else {
                C87412m.m108603p("finderFullActionBarLayoutBinding");
                throw null;
            }
        }

        /* renamed from: b */
        public void mo4166b() {
            C15976o oVar = this.f40773a.f14258o;
            if (oVar != null) {
                oVar.f42965i.setImageResource(C0966R.raw.icons_outlined_merge);
            } else {
                C87412m.m108603p("finderFullActionBarLayoutBinding");
                throw null;
            }
        }
    }

    public C14788l(FinderBaseFeedUI<C9707f, C9640c> finderBaseFeedUI) {
        this.f40771d = finderBaseFeedUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C85878m2.m106216e(this.f40771d.getTaskId(), new C14789a(this.f40771d));
        FinderBaseFeedUI<C9707f, C9640c> finderBaseFeedUI = this.f40771d;
        C85861e4.m106119f(finderBaseFeedUI, true, true, new C14790b(finderBaseFeedUI));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
