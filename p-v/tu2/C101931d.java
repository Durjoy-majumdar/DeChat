package tu2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: tu2.d */
public final class C101931d {

    /* renamed from: a */
    public static final C101931d f300107a = new C101931d();

    /* renamed from: b */
    public static final HashMap<String, ArrayList<View>> f300108b = new HashMap<>();

    /* renamed from: a */
    public final <T extends View> T mo141428a(Class<T> cls, Context context) {
        SnsMethodCalculate.markStartTimeMs("obtainView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        C87412m.m108594g(cls, "clazz");
        C87412m.m108594g(context, "context");
        HashMap<String, ArrayList<View>> hashMap = f300108b;
        ArrayList arrayList = hashMap.get(cls.getName());
        if (arrayList != null && (arrayList.isEmpty() ^ true)) {
            ArrayList<View> arrayList2 = hashMap.get(cls.getName());
            C87412m.m108591d(arrayList2);
            T remove = arrayList2.remove(0);
            C87412m.m108592e(remove, "null cannot be cast to non-null type T of com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool.obtainView");
            T t = (View) remove;
            SnsMethodCalculate.markEndTimeMs("obtainView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
            return t;
        }
        T newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
        C87412m.m108593f(newInstance, "con.newInstance(context)");
        T t2 = (View) newInstance;
        SnsMethodCalculate.markEndTimeMs("obtainView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        return t2;
    }

    /* renamed from: b */
    public final void mo141429b(View view) {
        SnsMethodCalculate.markStartTimeMs("recycleView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("recycleView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
            return;
        }
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        if (view instanceof C101930c) {
            ((C101930c) view).reset();
        }
        String name = view.getClass().getName();
        HashMap<String, ArrayList<View>> hashMap = f300108b;
        if (!hashMap.containsKey(name)) {
            hashMap.put(name, new ArrayList());
        }
        ArrayList arrayList = hashMap.get(name);
        if (arrayList != null) {
            arrayList.add(view);
        }
        SnsMethodCalculate.markEndTimeMs("recycleView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
    }
}
