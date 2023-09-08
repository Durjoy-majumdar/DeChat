package pp1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import np1.C61817a;
import pp1.C62431d;

/* renamed from: pp1.g */
public final class C62457g {

    /* renamed from: a */
    public final View f177466a;

    /* renamed from: b */
    public final C61817a f177467b;

    /* renamed from: c */
    public View f177468c;

    /* renamed from: d */
    public TextView f177469d;

    /* renamed from: e */
    public TextView f177470e;

    /* renamed from: pp1.g$a */
    public static final class C62458a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62457g f177471d;

        public C62458a(C62457g gVar) {
            this.f177471d = gVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f177471d.f177467b.mo86748e();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pp1.g$b */
    public static final class C62459b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C62457g f177472d;

        public C62459b(C62457g gVar) {
            this.f177472d = gVar;
        }

        public void onGlobalLayout() {
            int i;
            this.f177472d.f177467b.mo86758o().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewParent parent = this.f177472d.f177468c.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            int height = ((View) parent).getHeight();
            this.f177472d.f177468c.getLayoutParams().width = -1;
            this.f177472d.f177468c.getLayoutParams().height = height;
            int childCount = this.f177472d.f177467b.mo86758o().getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    i = 0;
                    break;
                }
                RecyclerView.C16631z P0 = this.f177472d.f177467b.mo86758o().mo17031P0(this.f177472d.f177467b.mo86758o().getChildAt(i2));
                if ((P0 instanceof C62431d) && ((C62431d) P0).f177418H == C62431d.C62432a.Goods) {
                    i = P0.f44854d.getBottom();
                    break;
                }
                i2++;
            }
            int f = C76577a.m92155f(this.f177472d.f177466a.getContext(), C0966R.dimen.f3718c_);
            ViewGroup.LayoutParams layoutParams = this.f177472d.f177469d.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                C62457g gVar = this.f177472d;
                marginLayoutParams.setMargins(0, i + (((height - i) - f) / 3), 0, 0);
                gVar.f177469d.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public C62457g(View view, C61817a aVar) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(aVar, "shoppingListInternal");
        this.f177466a = view;
        this.f177467b = aVar;
        this.f177468c = view.findViewById(C0966R.C0970id.dyy);
        this.f177469d = (TextView) view.findViewById(C0966R.C0970id.dyz);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.dyx);
        this.f177470e = textView;
        textView.setOnClickListener(new C62458a(this));
        Log.m105924i("ShoppingPanelEmptyHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0055, code lost:
        r2 = ((cl1.C54979h1) r2.mo71262a(cl1.C54979h1.class)).f154141p;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87494a(boolean r12, boolean r13) {
        /*
            r11 = this;
            r0 = 8
            r1 = 0
            if (r12 == 0) goto L_0x0081
            android.view.View r12 = r11.f177468c
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r10.mo10233c(r2)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder"
            java.lang.String r5 = "setVisible"
            java.lang.String r6 = "(ZZ)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r12.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder"
            java.lang.String r4 = "setVisible"
            java.lang.String r5 = "(ZZ)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r12
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            android.widget.TextView r12 = r11.f177469d
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            fj1.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r2 == 0) goto L_0x0069
            java.lang.Class<cl1.h1> r3 = cl1.C54979h1.class
            androidx.lifecycle.i0 r2 = r2.mo71262a(r3)
            cl1.h1 r2 = (cl1.C54979h1) r2
            p40.a<cm1.i2> r2 = r2.f154141p
            if (r2 == 0) goto L_0x0069
            boolean r2 = r2.mo87254e()
            if (r2 != 0) goto L_0x0069
            r2 = 1
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            r2 = 8
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            r12.setVisibility(r2)
            if (r13 == 0) goto L_0x007b
            android.widget.TextView r12 = r11.f177470e
            r12.setVisibility(r1)
            goto L_0x00c6
        L_0x007b:
            android.widget.TextView r12 = r11.f177470e
            r12.setVisibility(r0)
            goto L_0x00c6
        L_0x0081:
            android.view.View r12 = r11.f177468c
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.mo10233c(r0)
            java.lang.Object[] r3 = r13.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder"
            java.lang.String r5 = "setVisible"
            java.lang.String r6 = "(ZZ)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r13 = r13.mo10231a(r1)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12.setVisibility(r13)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder"
            java.lang.String r3 = "setVisible"
            java.lang.String r4 = "(ZZ)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r12
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pp1.C62457g.mo87494a(boolean, boolean):void");
    }

    /* renamed from: b */
    public final void mo87495b() {
        if (this.f177468c.getVisibility() == 0) {
            this.f177467b.mo86758o().getViewTreeObserver().addOnGlobalLayoutListener(new C62459b(this));
        }
    }
}
