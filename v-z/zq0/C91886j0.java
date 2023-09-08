package zq0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: zq0.j0 */
public final class C91886j0 implements C91915t {

    /* renamed from: a */
    public final Context f263073a;

    /* renamed from: b */
    public final C91913s f263074b;

    /* renamed from: c */
    public final int f263075c = 3;

    /* renamed from: d */
    public View f263076d;

    /* renamed from: e */
    public RecyclerView f263077e;

    /* renamed from: f */
    public C91905o f263078f;

    /* renamed from: g */
    public TextView f263079g;

    /* renamed from: h */
    public View f263080h;

    /* renamed from: i */
    public TextView f263081i;

    /* renamed from: j */
    public TextView f263082j;

    /* renamed from: zq0.j0$a */
    public static final class C91887a extends C87413o implements C32226l<PhoneItem, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C91886j0 f263083d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91887a(C91886j0 j0Var) {
            super(1);
            this.f263083d = j0Var;
        }

        public Object invoke(Object obj) {
            PhoneItem phoneItem = (PhoneItem) obj;
            C87412m.m108594g(phoneItem, LocaleUtil.ITALIAN);
            C91913s sVar = this.f263083d.f263074b;
            if (sVar != null) {
                sVar.mo125711f(phoneItem);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.j0$b */
    public static final class C91888b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91886j0 f263084d;

        public C91888b(C91886j0 j0Var) {
            this.f263084d = j0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C91913s sVar = this.f263084d.f263074b;
            if (sVar != null) {
                sVar.mo125708c();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: type inference failed for: r5v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91886j0(android.content.Context r5, zq0.C91913s r6) {
        /*
            r4 = this;
            java.lang.String r0 = "mContext"
            gy3.C87412m.m108594g(r5, r0)
            r4.<init>()
            r4.f263073a = r5
            r4.f263074b = r6
            r0 = 3
            r4.f263075c = r0
            r0 = 2131493110(0x7f0c00f6, float:1.860969E38)
            r1 = 0
            android.view.View r0 = android.view.View.inflate(r5, r0, r1)
            r4.f263076d = r0
            if (r0 == 0) goto L_0x0025
            r2 = 2131310945(0x7f093961, float:1.8240216E38)
            android.view.View r0 = r0.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            r4.f263077e = r0
            if (r0 != 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r5)
            r0.setLayoutManager(r2)
        L_0x0033:
            zq0.o r0 = new zq0.o
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            zq0.j0$a r3 = new zq0.j0$a
            r3.<init>(r4)
            r0.<init>(r5, r2, r3)
            r4.f263078f = r0
            androidx.recyclerview.widget.RecyclerView r5 = r4.f263077e
            if (r5 != 0) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r5.setAdapter(r0)
        L_0x004c:
            android.view.View r5 = r4.f263076d
            if (r5 == 0) goto L_0x005a
            r0 = 2131310936(0x7f093958, float:1.8240198E38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x005b
        L_0x005a:
            r5 = r1
        L_0x005b:
            r4.f263079g = r5
            if (r5 == 0) goto L_0x0067
            zq0.j0$b r0 = new zq0.j0$b
            r0.<init>(r4)
            r5.setOnClickListener(r0)
        L_0x0067:
            android.view.View r5 = r4.f263076d
            if (r5 == 0) goto L_0x0073
            r0 = 2131310944(0x7f093960, float:1.8240214E38)
            android.view.View r5 = r5.findViewById(r0)
            goto L_0x0074
        L_0x0073:
            r5 = r1
        L_0x0074:
            r4.f263080h = r5
            android.view.View r5 = r4.f263076d
            if (r5 == 0) goto L_0x0084
            r0 = 2131310943(0x7f09395f, float:1.8240212E38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x0085
        L_0x0084:
            r5 = r1
        L_0x0085:
            r4.f263081i = r5
            if (r5 != 0) goto L_0x008a
            goto L_0x0091
        L_0x008a:
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r5.setMovementMethod(r0)
        L_0x0091:
            android.widget.TextView r5 = r4.f263081i
            if (r5 != 0) goto L_0x0096
            goto L_0x00a1
        L_0x0096:
            if (r6 == 0) goto L_0x009d
            android.text.SpannableString r6 = r6.mo125706a()
            goto L_0x009e
        L_0x009d:
            r6 = r1
        L_0x009e:
            r5.setText(r6)
        L_0x00a1:
            android.view.View r5 = r4.f263076d
            if (r5 == 0) goto L_0x00af
            r6 = 2131310937(0x7f093959, float:1.82402E38)
            android.view.View r5 = r5.findViewById(r6)
            r1 = r5
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x00af:
            r4.f263082j = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zq0.C91886j0.<init>(android.content.Context, zq0.s):void");
    }

    /* renamed from: a */
    public void mo125715a(boolean z, List<PhoneItem> list) {
        C87412m.m108594g(list, "phoneItems");
        C91905o oVar = this.f263078f;
        if (oVar != null) {
            oVar.f263151g = z;
        }
        if (oVar != null) {
            oVar.notifyDataSetChanged();
        }
        C91905o oVar2 = this.f263078f;
        if (oVar2 != null) {
            oVar2.f263151g = z;
            oVar2.f263149e = (ArrayList) list;
            oVar2.notifyDataSetChanged();
        }
        if (z || list.size() >= this.f263075c) {
            TextView textView = this.f263079g;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = this.f263080h;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            TextView textView2 = this.f263079g;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            View view2 = this.f263080h;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (z) {
            TextView textView3 = this.f263082j;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        } else if (list.size() >= this.f263075c) {
            TextView textView4 = this.f263082j;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else {
            TextView textView5 = this.f263082j;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        }
    }
}
