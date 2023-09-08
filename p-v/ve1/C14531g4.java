package ve1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0744k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTimelineLbsUI;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import dp1.C20480e0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import rs1.C13442s8;

/* renamed from: ve1.g4 */
public final class C14531g4 extends C60896i<C0744k> {

    /* renamed from: ve1.g4$a */
    public static final class C14532a implements View.OnClickListener {

        /* renamed from: d */
        public static final C14532a f40278d = new C14532a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderLbsBarEntranceConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C20480e0.f57583a.mo32031d();
            Intent intent = new Intent();
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = view.getContext();
            C87412m.m108593f(context, "it.context");
            C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 0, true, 0, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED, (Object) null);
            Context context2 = view.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivity mMActivity = (MMActivity) context2;
            ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
            intent.setClass(mMActivity, FinderTimelineLbsUI.class);
            mMActivity.startActivityForResult(intent, 19999);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderLbsBarEntranceConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ada;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0744k) cVar, "item");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C85875k4.m106189j0(((TextView) oVar.mo85812D(C0966R.C0970id.flz)).getPaint(), 0.8f);
        oVar.f44854d.setOnClickListener(C14532a.f40278d);
    }
}
