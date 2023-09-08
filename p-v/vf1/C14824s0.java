package vf1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHotSearchUI;
import com.tencent.p014mm.plugin.finder.search.data.SearchHotWordListParcelable;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58684b;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C48727ak1;
import te3.C50972qk0;

/* renamed from: vf1.s0 */
public final class C14824s0 extends C87413o implements C32228q<C48727ak1, Integer, List<? extends C48727ak1>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderHotSearchUI f40820d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14824s0(FinderHotSearchUI finderHotSearchUI) {
        super(3);
        this.f40820d = finderHotSearchUI;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C48727ak1 ak12 = (C48727ak1) obj;
        int intValue = ((Number) obj2).intValue();
        List list = (List) obj3;
        C87412m.m108594g(ak12, "hotWord");
        FinderHotSearchUI finderHotSearchUI = this.f40820d;
        int i = FinderHotSearchUI.f14427q;
        finderHotSearchUI.getClass();
        Intent intent = new Intent();
        String str = ak12.f130586d;
        if (!Util.isNullOrNil(str)) {
            if (str == null) {
                str = "";
            }
            intent.putExtra("key_search_query", str);
            C89349b bVar = ak12.f130590h;
            intent.putExtra("key_search_session_buffer", bVar != null ? bVar.mo123703f() : null);
            intent.putExtra("key_search_hot_word_info", SearchHotWordListParcelable.CREATOR.mo3935a(ak12, intValue, list));
        }
        AppCompatActivity context = finderHotSearchUI.getContext();
        C87412m.m108593f(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).Hx0(context, (C50972qk0) null, intent);
        return C13598b0.f38549a;
    }
}
