package vf1;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPostStruct;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTimelineUI;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: vf1.i5 */
public final class C14778i5 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelineUI f40760d;

    /* renamed from: vf1.i5$a */
    public static final class C14779a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4191v0 f40761d;

        public C14779a(C4191v0 v0Var) {
            this.f40761d = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI$addPostEducation$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f40761d.mo5072g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI$addPostEducation$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C14778i5(FinderTimelineUI finderTimelineUI) {
        this.f40760d = finderTimelineUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FinderPostStruct finderPostStruct = new FinderPostStruct();
        finderPostStruct.f155826E = 1;
        finderPostStruct.mo86054n();
        Log.m105924i("Finder.FinderTimelineUI", "report18939 postEdu: " + finderPostStruct.f155826E);
        C4191v0 v0Var = new C4191v0(this.f40760d.getContext());
        v0Var.mo5070e(C0966R.C0971layout.ani);
        TextView textView = (TextView) v0Var.f18463f.findViewById(C0966R.C0970id.hgo);
        TextView textView2 = (TextView) v0Var.f18463f.findViewById(C0966R.C0970id.hgm);
        TextView textView3 = (TextView) v0Var.f18463f.findViewById(C0966R.C0970id.hgn);
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C66785b bVar = C66785b.f191882e;
        String str = bVar.mo90673n0().mo62398d().f141675d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (Util.isNullOrNil(str)) {
            str = "视频号逐步开放中，请耐心等待";
        }
        textView.setText(str);
        fVar.getClass();
        String str3 = bVar.mo90673n0().mo62398d().f141676e;
        if (str3 == null) {
            str3 = str2;
        }
        if (!Util.isNullOrNil(str3)) {
            str2 = str3;
        }
        textView2.setText(str2);
        textView3.setOnClickListener(new C14779a(v0Var));
        v0Var.mo5073h();
        return true;
    }
}
