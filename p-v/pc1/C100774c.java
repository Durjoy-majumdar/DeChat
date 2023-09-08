package pc1;

import android.view.View;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: pc1.c */
public class C100774c {

    /* renamed from: a */
    public boolean f295233a = false;

    /* renamed from: b */
    public View f295234b;

    /* renamed from: c */
    public ImageButton f295235c;

    /* renamed from: d */
    public ImageButton f295236d;

    /* renamed from: e */
    public ImageButton f295237e;

    /* renamed from: f */
    public View f295238f;

    /* renamed from: g */
    public View f295239g;

    /* renamed from: h */
    public View f295240h;

    /* renamed from: i */
    public C100778d f295241i;

    /* renamed from: pc1.c$a */
    public class C100775a implements View.OnClickListener {
        public C100775a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100778d dVar = C100774c.this.f295241i;
            if (dVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            dVar.mo128360b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pc1.c$b */
    public class C100776b implements View.OnClickListener {
        public C100776b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100778d dVar = C100774c.this.f295241i;
            if (dVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            dVar.mo128359a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pc1.c$c */
    public class C100777c implements View.OnClickListener {
        public C100777c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100778d dVar = C100774c.this.f295241i;
            if (dVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            dVar.mo128361c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pc1.c$d */
    public interface C100778d {
        /* renamed from: a */
        void mo128359a();

        /* renamed from: b */
        void mo128360b();

        /* renamed from: c */
        void mo128361c();
    }

    /* renamed from: a */
    public void mo140208a(boolean z) {
        if (this.f295233a) {
            this.f295235c.setEnabled(z);
            this.f295236d.setEnabled(z);
            this.f295237e.setEnabled(z);
        }
    }

    /* renamed from: b */
    public void mo140209b() {
        if (this.f295233a && this.f295234b.getVisibility() != 8) {
            View view = this.f295234b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f295234b;
            view3.startAnimation(AnimationUtils.loadAnimation(view3.getContext(), C0966R.C0968anim.f2394bx));
        }
    }

    /* renamed from: c */
    public void mo140210c(boolean z, boolean z2, boolean z3) {
        if (!this.f295233a) {
            View view = this.f295234b;
            if (view != null) {
                if (view instanceof ViewStub) {
                    this.f295234b = ((ViewStub) view).inflate();
                }
                this.f295238f = this.f295234b.findViewById(C0966R.C0970id.cw_);
                this.f295239g = this.f295234b.findViewById(C0966R.C0970id.cwa);
                this.f295240h = this.f295234b.findViewById(C0966R.C0970id.cwb);
                ImageButton imageButton = (ImageButton) this.f295234b.findViewById(C0966R.C0970id.f357985cv2);
                this.f295235c = imageButton;
                imageButton.setEnabled(false);
                ImageButton imageButton2 = this.f295235c;
                imageButton2.setContentDescription(imageButton2.getContext().getString(C0966R.string.f361474k60));
                this.f295235c.setOnClickListener(new C100775a());
                if (z) {
                    View view2 = this.f295238f;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f295235c.setVisibility(8);
                }
                ImageButton imageButton3 = (ImageButton) this.f295234b.findViewById(C0966R.C0970id.cuz);
                this.f295236d = imageButton3;
                imageButton3.setEnabled(false);
                ImageButton imageButton4 = this.f295236d;
                imageButton4.setContentDescription(imageButton4.getContext().getString(C0966R.string.c3d));
                this.f295236d.setOnClickListener(new C100776b());
                if (z2) {
                    View view3 = this.f295239g;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f295236d.setVisibility(8);
                }
                ImageButton imageButton5 = (ImageButton) this.f295234b.findViewById(C0966R.C0970id.f357983cv0);
                this.f295237e = imageButton5;
                imageButton5.setEnabled(false);
                ImageButton imageButton6 = this.f295237e;
                imageButton6.setContentDescription(imageButton6.getContext().getString(C0966R.string.by4));
                this.f295237e.setOnClickListener(new C100777c());
                if (z3) {
                    View view5 = this.f295240h;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f295237e.setVisibility(8);
                }
                this.f295233a = true;
            } else {
                return;
            }
        }
        if (this.f295234b.getVisibility() != 0) {
            View view7 = this.f295234b;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view9 = this.f295234b;
            view9.startAnimation(AnimationUtils.loadAnimation(view9.getContext(), C0966R.C0968anim.f2393bw));
        }
    }
}
