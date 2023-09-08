package rf0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.picker.base.view.WheelView;
import j20.C117292a;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rf0.d */
public class C22230d extends C77516a implements View.OnClickListener {

    /* renamed from: p */
    public C22236j f62981p;

    /* renamed from: q */
    public Context f62982q;

    /* renamed from: r */
    public String f62983r = "TimePickerView";

    /* renamed from: s */
    public boolean f62984s = false;

    public C22230d(Context context) {
        super(context);
        this.f62981p = new C22236j(context);
        this.f62982q = context;
    }

    /* renamed from: d */
    public boolean mo35383d() {
        this.f226020g.getClass();
        return false;
    }

    /* renamed from: e */
    public View mo35389e() {
        if (this.f62981p.f62997a == null) {
            View inflate = LayoutInflater.from(this.f62982q).inflate(C0966R.C0971layout.bcx, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.klr);
            ((ViewGroup) inflate).removeView(linearLayout);
            linearLayout.setBackgroundColor(-1);
            this.f62981p.f62997a = linearLayout;
        }
        return this.f62981p.f62997a;
    }

    /* renamed from: f */
    public List<WheelView> mo35390f() {
        return this.f62981p.mo35398e();
    }

    /* renamed from: g */
    public void mo35391g() {
        if (this.f226020g.f62185b != null) {
            try {
                this.f226020g.f62185b.mo1989a(C22236j.f62994C.parse(this.f62981p.mo35397d()));
            } catch (ParseException e) {
                C85975v4.m106307d(this.f62983r, e, "", new Object[0]);
            }
        }
    }

    /* renamed from: h */
    public void mo35392h(float f) {
        C22236j jVar = this.f62981p;
        if (jVar != null) {
            jVar.f63000d.setDividerHeight(f);
            jVar.f63001e.setDividerHeight(f);
            jVar.f63002f.setDividerHeight(f);
            jVar.f62998b.setDividerHeight(f);
            jVar.f62999c.setDividerHeight(f);
            jVar.f63003g.setDividerHeight(f);
        }
    }

    /* renamed from: i */
    public void mo35393i(int i, int i2, int i3, int i4) {
        C22236j jVar = this.f62981p;
        jVar.f63000d.setPadding(i, i2, i3, i4);
        jVar.f63001e.setPadding(i, i2, i3, i4);
        jVar.f63002f.setPadding(i, i2, i3, i4);
        jVar.f62998b.setPadding(i, i2, i3, i4);
        jVar.f62999c.setPadding(i, i2, i3, i4);
        jVar.f63003g.setPadding(i, i2, i3, i4);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/picker/view/TimePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((String) view.getTag()).equals("submit")) {
            mo35391g();
        }
        mo107668a();
        C117292a.m165361g(this, "com/tencent/mm/picker/view/TimePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
