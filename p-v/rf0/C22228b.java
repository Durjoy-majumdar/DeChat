package rf0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.picker.base.view.WheelView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jf0.C21233a;

/* renamed from: rf0.b */
public class C22228b<T> extends C77516a implements View.OnClickListener {

    /* renamed from: p */
    public C22232f f62978p = new C22232f();

    /* renamed from: q */
    public Context f62979q;

    public C22228b(Context context) {
        super(context);
        this.f62979q = context;
    }

    /* renamed from: d */
    public boolean mo35383d() {
        this.f226020g.getClass();
        return false;
    }

    /* renamed from: e */
    public WheelView mo35384e() {
        C22232f fVar = this.f62978p;
        if (fVar.f62986a == null) {
            fVar.f62986a = new WheelView(this.f62979q);
        }
        return this.f62978p.f62986a;
    }

    /* renamed from: f */
    public void mo35385f() {
        if (this.f226020g.f62184a != null) {
            this.f226020g.f62184a.mo22631a(this.f62978p.f62987b.getCurrentItem());
        }
    }

    /* renamed from: g */
    public void mo35386g(List<T> list) {
        C22232f fVar = this.f62978p;
        fVar.f62988c = list;
        fVar.f62987b.setAdapter(new C21233a(list));
        fVar.f62987b.setCurrentItem(0);
        fVar.f62987b.setIsOptions(true);
        C22231e eVar = new C22231e(fVar);
        if (list != null) {
            fVar.f62987b.setOnItemSelectedListener(eVar);
        }
        C22232f fVar2 = this.f62978p;
        if (fVar2 != null) {
            int i = this.f226020g.f62188e;
            if (fVar2.f62988c != null) {
                fVar2.f62987b.setCurrentItem(i);
            }
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/picker/view/OptionsPickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((String) view.getTag()).equals("submit")) {
            mo35385f();
        }
        mo107668a();
        C117292a.m165361g(this, "com/tencent/mm/picker/view/OptionsPickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
