package qt0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84956g1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p224ra.C12964b;

/* renamed from: qt0.b */
public interface C89843b extends C84956g1 {

    /* renamed from: qt0.b$a */
    public static class C89844a implements C89843b {

        /* renamed from: d */
        public View f258271d;

        /* renamed from: e */
        public int f258272e;

        /* renamed from: qt0.b$a$a */
        public class C89845a extends View {
            public C89845a(Context context) {
                super(context);
            }

            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                C89844a.this.getClass();
                super.onLayout(z, i, i2, i3, i4);
                C89844a.this.getClass();
            }

            public void onMeasure(int i, int i2) {
                int i3 = C89844a.this.f258272e;
                if (i3 > 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                }
                super.onMeasure(i, i2);
            }
        }

        public C89844a(Context context) {
            this.f258271d = new C89845a(context);
        }

        public View getPanelView() {
            return this.f258271d;
        }

        /* renamed from: k */
        public boolean mo124118k() {
            return false;
        }

        /* renamed from: l */
        public boolean mo124119l(int i) {
            if (i <= 0 || this.f258272e == i) {
                return false;
            }
            this.f258272e = i;
            return true;
        }

        /* renamed from: m */
        public void mo124120m(boolean z) {
        }

        /* renamed from: n */
        public boolean mo124121n() {
            return this.f258271d.isInLayout();
        }

        public void onDestroy() {
        }

        public void onPause() {
        }

        public void onResume() {
        }

        /* renamed from: p */
        public void mo124126p() {
            View view = this.f258271d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: q */
        public boolean mo117827q() {
            return true;
        }

        /* renamed from: r */
        public void mo124127r(boolean z) {
        }

        /* renamed from: s */
        public void mo124128s(boolean z) {
            View view = this.f258271d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "hideContentView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "hideContentView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void setOnEmoticonOperationListener(C89850f fVar) {
        }

        public void setOnTextOperationListener(C89851g gVar) {
        }
    }

    /* renamed from: qt0.b$b */
    public interface C89846b extends C12964b {
        /* renamed from: US */
        C89843b mo124134US(Context context, boolean z);
    }

    View getPanelView();

    /* renamed from: k */
    boolean mo124118k();

    /* renamed from: l */
    boolean mo124119l(int i);

    /* renamed from: m */
    void mo124120m(boolean z);

    /* renamed from: n */
    boolean mo124121n();

    void onDestroy();

    void onPause();

    void onResume();

    /* renamed from: p */
    void mo124126p();

    /* renamed from: r */
    void mo124127r(boolean z);

    /* renamed from: s */
    void mo124128s(boolean z);

    void setOnEmoticonOperationListener(C89850f fVar);

    void setOnTextOperationListener(C89851g gVar);
}
