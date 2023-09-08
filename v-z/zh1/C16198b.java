package zh1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: zh1.b */
public abstract class C16198b {

    /* renamed from: a */
    public final Context f43395a;

    /* renamed from: b */
    public final ViewGroup f43396b;

    /* renamed from: c */
    public final View f43397c;

    /* renamed from: d */
    public final ImageView f43398d;

    /* renamed from: e */
    public String f43399e = "";

    /* renamed from: zh1.b$a */
    public static final class C16199a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ C16198b f43400d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f43401e;

        public C16199a(C16198b bVar, ViewGroup viewGroup) {
            this.f43400d = bVar;
            this.f43401e = viewGroup;
        }

        /* JADX WARNING: type inference failed for: r2v10, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r9 = this;
                zh1.b r0 = r9.f43400d
                android.view.View r0 = r0.f43397c
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r9)
                zh1.b r0 = r9.f43400d
                android.view.ViewGroup r1 = r9.f43401e
                r0.getClass()
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
                int r2 = r2.x
                int[] r3 = o40.C61926c.m72690o(r1)
                r4 = 1
                r5 = r3[r4]
                android.view.View r6 = r0.f43397c
                int r6 = r6.getHeight()
                int r5 = r5 - r6
                int r6 = r0.mo14730b()
                int r5 = r5 + r6
                r6 = 0
                r3 = r3[r6]
                int r1 = r1.getWidth()
                int r1 = r1 / 2
                int r3 = r3 + r1
                android.content.Context r1 = r0.f43395a
                r7 = 16
                int r1 = kg3.C76577a.m92151b(r1, r7)
                android.view.View r7 = r0.f43397c
                int r7 = r7.getWidth()
                int r7 = r7 / 2
                int r7 = r3 - r7
                if (r7 >= r1) goto L_0x004e
                goto L_0x006d
            L_0x004e:
                android.view.View r7 = r0.f43397c
                int r7 = r7.getWidth()
                int r7 = r7 / 2
                int r7 = r7 + r3
                int r2 = r2 - r1
                if (r7 <= r2) goto L_0x0063
                android.view.View r1 = r0.f43397c
                int r1 = r1.getWidth()
                int r1 = r2 - r1
                goto L_0x006d
            L_0x0063:
                android.view.View r1 = r0.f43397c
                int r1 = r1.getWidth()
                int r1 = r1 / 2
                int r1 = r3 - r1
            L_0x006d:
                android.view.View r2 = r0.f43397c
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                boolean r7 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                r8 = 0
                if (r7 == 0) goto L_0x007b
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
                goto L_0x007c
            L_0x007b:
                r2 = r8
            L_0x007c:
                if (r2 == 0) goto L_0x0082
                r2.leftMargin = r1
                r2.topMargin = r5
            L_0x0082:
                android.widget.ImageView r2 = r0.f43398d
                android.graphics.drawable.Drawable r2 = r2.getDrawable()
                boolean r5 = r2 instanceof android.graphics.drawable.LayerDrawable
                if (r5 == 0) goto L_0x008f
                android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2
                goto L_0x0090
            L_0x008f:
                r2 = r8
            L_0x0090:
                if (r2 == 0) goto L_0x00af
                android.graphics.drawable.Drawable r2 = r2.getDrawable(r6)
                if (r2 == 0) goto L_0x00af
                android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
                android.content.Context r6 = r0.f43395a
                android.content.res.Resources r6 = r6.getResources()
                r7 = 2131100630(0x7f0603d6, float:1.7813647E38)
                int r6 = r6.getColor(r7)
                android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_IN
                r5.<init>(r6, r7)
                r2.setColorFilter(r5)
            L_0x00af:
                android.widget.ImageView r2 = r0.f43398d
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                boolean r5 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r5 == 0) goto L_0x00bc
                r8 = r2
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            L_0x00bc:
                if (r8 == 0) goto L_0x00ca
                android.widget.ImageView r2 = r0.f43398d
                int r2 = r2.getWidth()
                int r2 = r2 / 2
                int r3 = r3 - r2
                int r3 = r3 - r1
                r8.leftMargin = r3
            L_0x00ca:
                r1 = 100
                zh1.a r3 = new zh1.a
                r3.<init>(r0)
                o40.C61926c.m72666K(r1, r3)
                android.view.View r0 = r0.f43397c
                r0.requestLayout()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: zh1.C16198b.C16199a.onPreDraw():boolean");
        }
    }

    public C16198b(Context context, ViewGroup viewGroup) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "parentRoot");
        this.f43395a = context;
        this.f43396b = viewGroup;
        View inflate = LayoutInflater.from(context).inflate(mo14729a(), (ViewGroup) null);
        this.f43397c = inflate;
        this.f43398d = (ImageView) inflate.findViewById(C0966R.C0970id.f6145yj);
    }

    /* renamed from: a */
    public abstract int mo14729a();

    /* renamed from: b */
    public int mo14730b() {
        return C76577a.m92151b(this.f43395a, 4);
    }

    /* renamed from: c */
    public final void mo14731c() {
        if (this.f43397c.getVisibility() == 0) {
            View view = this.f43397c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f43396b.removeView(this.f43397c);
        }
    }

    /* renamed from: d */
    public void mo14732d(ViewGroup viewGroup, String str) {
        C87412m.m108594g(viewGroup, "attachView");
        C87412m.m108594g(str, "giftId");
        this.f43399e = str;
        View view = this.f43397c;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "showWidget", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "showWidget", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f43397c.getViewTreeObserver().addOnPreDrawListener(new C16199a(this, viewGroup));
        this.f43396b.removeView(this.f43397c);
        this.f43396b.addView(this.f43397c);
    }
}
