package a13;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import s03.C77599f;

/* renamed from: a13.c */
public class C66990c {

    /* renamed from: a */
    public View f192454a;

    /* renamed from: b */
    public View f192455b;

    /* renamed from: c */
    public View f192456c;

    /* renamed from: d */
    public C77599f f192457d;

    /* renamed from: e */
    public C66992b f192458e;

    /* renamed from: f */
    public String f192459f;

    /* renamed from: a13.c$a */
    public class C66991a implements View.OnClickListener {
        public C66991a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66990c cVar = C66990c.this;
            cVar.f192458e.mo25021a(cVar.f192457d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a13.c$b */
    public interface C66992b {
        /* renamed from: a */
        void mo25021a(C77599f fVar);
    }

    public C66990c(Context context, View view, C66992b bVar, C77599f fVar, String str) {
        this.f192454a = view;
        this.f192457d = fVar;
        this.f192455b = view.findViewById(C0966R.C0970id.c9e);
        this.f192456c = view.findViewById(C0966R.C0970id.l0g);
        this.f192458e = bVar;
        this.f192459f = str;
        view.setOnClickListener(new C66991a());
    }

    /* renamed from: a */
    public void mo90955a(View view, boolean z, int i, int i2) {
        View view2 = view;
        Context context = view.getContext();
        View view3 = this.f192454a;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        int height = view.getHeight();
        int i3 = C85875k4.m106184h(context).x;
        view3.measure(0, 0);
        int measuredHeight = view3.getMeasuredHeight();
        int measuredWidth = view3.getMeasuredWidth();
        if (z) {
            iArr[0] = (i3 - measuredWidth) / 2;
            iArr[1] = iArr2[1] - measuredHeight;
        } else {
            iArr[0] = (i3 - measuredWidth) / 2;
            iArr[1] = iArr2[1] + height;
        }
        iArr[0] = iArr[0] + i;
        iArr[1] = iArr[1] + i2;
        if (!(this.f192456c == null || this.f192455b == null)) {
            int[] iArr3 = new int[2];
            view2.getLocationOnScreen(iArr3);
            int width = (iArr3[0] + (view.getWidth() / 2)) - C66999e.m79152b(view.getContext(), (float) 16);
            if (z) {
                View view4 = this.f192456c;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view6 = this.f192455b;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f192456c.getLayoutParams();
                layoutParams.leftMargin = width;
                this.f192456c.setLayoutParams(layoutParams);
            } else {
                View view8 = this.f192456c;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view9 = view8;
                C117292a.m165358d(view9, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view10 = this.f192455b;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view11 = view10;
                C117292a.m165358d(view11, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f192455b.getLayoutParams();
                layoutParams2.leftMargin = width;
                this.f192455b.setLayoutParams(layoutParams2);
            }
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f192454a.getLayoutParams();
        layoutParams3.topMargin = iArr[1];
        this.f192454a.setLayoutParams(layoutParams3);
    }
}
