package p161h8;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: h8.d */
public class C8495d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f27510a = new C8495d("childrenAlpha");

    public C8495d(String str) {
        super(Float.class, str);
    }

    public Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(C0966R.C0970id.h2t);
        return f != null ? f : Float.valueOf(1.0f);
    }

    public void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(C0966R.C0970id.h2t, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(childAt, aVar.mo10232b(), "com/google/android/material/animation/ChildrenAlphaProperty", "set", "(Landroid/view/ViewGroup;Ljava/lang/Float;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(childAt, "com/google/android/material/animation/ChildrenAlphaProperty", "set", "(Landroid/view/ViewGroup;Ljava/lang/Float;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
