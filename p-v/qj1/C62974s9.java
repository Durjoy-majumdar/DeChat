package qj1;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import cl1.C0702z0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qn3.C77382c;

/* renamed from: qj1.s9 */
public final class C62974s9 implements View.OnClickListener {

    /* renamed from: d */
    public final C62949r8 f178684d;

    /* renamed from: e */
    public View f178685e;

    /* renamed from: f */
    public CheckBox f178686f;

    /* renamed from: g */
    public TextView f178687g;

    public C62974s9(C62949r8 r8Var) {
        C87412m.m108594g(r8Var, "plugin");
        this.f178684d = r8Var;
    }

    /* renamed from: a */
    public final void mo87906a() {
        C45078p0.C45079a aVar = C45078p0.C45079a.MODE_CHINESE_AS_2;
        if (((C0702z0) this.f178684d.mo87696x0(C0702z0.class)).f1670B) {
            C62949r8 r8Var = this.f178684d;
            r8Var.f178644s = 30;
            r8Var.mo87884q1(30);
            C77382c b = C77382c.m93286b(r8Var.f178647v);
            b.f225611e = 1;
            b.f225610d = 30;
            b.f225612f = aVar;
            b.f225607a = true;
            b.mo107499d(new C63106x8(r8Var, 30));
            return;
        }
        C62949r8 r8Var2 = this.f178684d;
        r8Var2.f178644s = 120;
        r8Var2.mo87884q1(120);
        C77382c b2 = C77382c.m93286b(r8Var2.f178647v);
        b2.f225611e = 1;
        b2.f225610d = 120;
        b2.f225612f = aVar;
        b2.f225607a = true;
        b2.mo107499d(new C63106x8(r8Var2, 120));
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = false;
        if (view != null && view.getId() == C0966R.C0970id.kj4) {
            CheckBox checkBox = this.f178686f;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                CheckBox checkBox2 = this.f178686f;
                if (checkBox2 != null) {
                    checkBox2.setChecked(true ^ (checkBox2 != null ? checkBox2.isChecked() : false));
                }
                C0702z0 z0Var = (C0702z0) this.f178684d.mo87696x0(C0702z0.class);
                CheckBox checkBox3 = this.f178686f;
                if (checkBox3 != null) {
                    z = checkBox3.isChecked();
                }
                z0Var.f1670B = z;
                mo87906a();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
