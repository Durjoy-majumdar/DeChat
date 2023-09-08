package gj3;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ij3.C60331a;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: gj3.i */
public final class C59476i {
    /* renamed from: a */
    public static final C32465g m69399a(View view, String str, Object obj) {
        List<WeakReference<C60331a>> list;
        C87412m.m108594g(view, "<this>");
        C87412m.m108594g(str, "transitionName");
        Log.m105918d("MM.Transition", "setTransitionInfo() called with: transitionName = " + str + ", animOrder = " + obj + " view=" + view);
        view.setTransitionName(str);
        if (view instanceof C60331a) {
            Context context = view.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (!(activity == null || (list = MMTransitionHelper.f165034a.mo81991b(activity).f165041e) == null)) {
                list.add(new WeakReference(view));
            }
        }
        C32465g gVar = new C32465g(str, obj);
        view.setTag(C0966R.C0970id.o_y, gVar);
        return gVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C32465g m69400b(View view, String str, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return m69399a(view, str, obj);
    }
}
