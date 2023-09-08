package x82;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77389a;
import qo3.C77398g;
import x82.C112075a;

/* renamed from: x82.c0 */
public final class C112083c0 {

    /* renamed from: a */
    public Context f335566a;

    /* renamed from: b */
    public C112075a f335567b;

    /* renamed from: c */
    public View f335568c;

    /* renamed from: d */
    public View f335569d;

    /* renamed from: e */
    public TextView f335570e;

    /* renamed from: x82.c0$a */
    public static final class C112084a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112083c0 f335571d;

        /* renamed from: x82.c0$a$a */
        public static final class C112085a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C112083c0 f335572d;

            public C112085a(C112083c0 c0Var) {
                this.f335572d = c0Var;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C112075a.C112076a.m152803a(this.f335572d.f335567b, C112075a.C112077b.STOP_PROJECTOR, (Bundle) null, 2, (Object) null);
                this.f335572d.getClass();
                dialogInterface.dismiss();
            }
        }

        /* renamed from: x82.c0$a$b */
        public static final class C112086b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public static final C112086b f335573d = new C112086b();

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        public C112084a(C112083c0 c0Var) {
            this.f335571d = c0Var;
        }

        public final void onClick(View view) {
            Resources resources;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectTopUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Integer num = null;
            if (this.f335571d.f335567b.getCurrentStatus()) {
                Context context = this.f335571d.f335566a;
                C77389a aVar = new C77389a();
                Resources resources2 = this.f335571d.f335566a.getResources();
                aVar.f225660q = resources2 != null ? resources2.getString(C0966R.string.ifr) : null;
                aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.ifq);
                C112083c0 c0Var = this.f335571d;
                aVar.f225620C = new C112085a(c0Var);
                Context context2 = c0Var.f335566a;
                if (!(context2 == null || (resources = context2.getResources()) == null)) {
                    num = Integer.valueOf(resources.getColor(C0966R.color.f2966ao));
                }
                C87412m.m108591d(num);
                aVar.f225638U = num.intValue();
                aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
                aVar.f225621D = C112086b.f335573d;
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar);
                gVar.show();
            } else {
                this.f335571d.getClass();
                C112083c0 c0Var2 = this.f335571d;
                View view2 = c0Var2.f335569d;
                if (view2 != null) {
                    view2.setBackground(C74933u4.m89768e(c0Var2.f335566a, C0966R.C0969drawable.a8j, Color.parseColor("#FA5151")));
                }
                TextView textView = this.f335571d.f335570e;
                if (textView != null) {
                    textView.setText(C0966R.string.ifg);
                }
                C112075a.C112076a.m152803a(this.f335571d.f335567b, C112075a.C112077b.START_PROJECTOR, (Bundle) null, 2, (Object) null);
                this.f335571d.getClass();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectTopUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C112083c0(Context context, C112075a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "statusManager");
        this.f335566a = context;
        this.f335567b = aVar;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163785a() {
        /*
            r4 = this;
            android.view.View r0 = r4.f335568c
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r2 = 2131310798(0x7f0938ce, float:1.8239918E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r4.f335569d = r0
            android.view.View r0 = r4.f335568c
            if (r0 == 0) goto L_0x001e
            r1 = 2131310799(0x7f0938cf, float:1.823992E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x001e:
            r4.f335570e = r1
            android.view.View r0 = r4.f335569d
            if (r0 != 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            android.content.Context r1 = r4.f335566a
            r2 = 2131233274(0x7f0809fa, float:1.808268E38)
            java.lang.String r3 = "#FA5151"
            int r3 = android.graphics.Color.parseColor(r3)
            android.graphics.drawable.Drawable r1 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r1, r2, r3)
            r0.setBackground(r1)
        L_0x0037:
            v82.a1$a r0 = v82.C111415a1.f333534e
            android.content.Context r1 = r4.f335566a
            int r1 = r0.mo163079a(r1)
            r2 = 90
            if (r1 == r2) goto L_0x0059
            android.content.Context r1 = r4.f335566a
            int r0 = r0.mo163079a(r1)
            r1 = 270(0x10e, float:3.78E-43)
            if (r0 != r1) goto L_0x004e
            goto L_0x0059
        L_0x004e:
            android.widget.TextView r0 = r4.f335570e
            if (r0 == 0) goto L_0x0063
            r1 = 2131835344(0x7f1139d0, float:1.9303824E38)
            r0.setText(r1)
            goto L_0x0063
        L_0x0059:
            android.widget.TextView r0 = r4.f335570e
            if (r0 == 0) goto L_0x0063
            r1 = 2131835354(0x7f1139da, float:1.9303844E38)
            r0.setText(r1)
        L_0x0063:
            android.view.View r0 = r4.f335569d
            if (r0 == 0) goto L_0x006a
            r0.requestLayout()
        L_0x006a:
            android.view.View r0 = r4.f335569d
            if (r0 == 0) goto L_0x0076
            x82.c0$a r1 = new x82.c0$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112083c0.mo163785a():void");
    }
}
