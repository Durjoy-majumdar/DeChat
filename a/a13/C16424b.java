package a13;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.FlowLayout;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import qo3.C77390c0;
import te3.C64467je0;
import te3.vh4;
import te3.xh4;

/* renamed from: a13.b */
public class C16424b extends C77390c0 {

    /* renamed from: d */
    public View f43841d;

    /* renamed from: e */
    public Set<C64467je0> f43842e = new HashSet();

    /* renamed from: f */
    public View f43843f;

    /* renamed from: g */
    public View f43844g;

    /* renamed from: h */
    public TextView f43845h;

    /* renamed from: i */
    public TextView f43846i;

    /* renamed from: j */
    public FlowLayout f43847j;

    /* renamed from: n */
    public final C64467je0 f43848n;

    /* renamed from: a13.b$a */
    public class C16425a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16429e f43849d;

        public C16425a(C16429e eVar) {
            this.f43849d = eVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (((HashSet) C16424b.this.f43842e).isEmpty()) {
                C16424b bVar = C16424b.this;
                ((HashSet) bVar.f43842e).add(bVar.f43848n);
            }
            this.f43849d.mo14887a(C16424b.this.f43842e);
            C16424b.this.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a13.b$b */
    public class C16426b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64467je0 f43851d;

        /* renamed from: e */
        public final /* synthetic */ TextView f43852e;

        /* renamed from: f */
        public final /* synthetic */ Context f43853f;

        public C16426b(C64467je0 je02, TextView textView, Context context) {
            this.f43851d = je02;
            this.f43852e = textView;
            this.f43853f = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (((HashSet) C16424b.this.f43842e).contains(this.f43851d)) {
                ((HashSet) C16424b.this.f43842e).remove(this.f43851d);
                this.f43852e.setTextColor(this.f43853f.getResources().getColor(C0966R.color.ah7));
                this.f43852e.setBackgroundResource(C0966R.C0969drawable.ayc);
            } else {
                ((HashSet) C16424b.this.f43842e).add(this.f43851d);
                this.f43852e.setTextColor(this.f43853f.getResources().getColor(C0966R.color.ah6));
                this.f43852e.setBackgroundResource(C0966R.C0969drawable.ayb);
            }
            if (((HashSet) C16424b.this.f43842e).isEmpty()) {
                C16424b bVar = C16424b.this;
                bVar.f43845h.setText(bVar.f43848n.f183791e);
            } else {
                C16424b.this.f43845h.setText(this.f43853f.getString(C0966R.string.k3z));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a13.b$c */
    public class C16427c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ xh4 f43855d;

        public C16427c(xh4 xh4) {
            this.f43855d = xh4;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f43855d.f64718T.f185897e);
            C88144b.m109791i(C16424b.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a13.b$d */
    public class C16428d implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C16429e f43857d;

        public C16428d(C16424b bVar, C16429e eVar) {
            this.f43857d = eVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.f43857d.onDismiss();
        }
    }

    /* renamed from: a13.b$e */
    public interface C16429e {
        /* renamed from: a */
        void mo14887a(Set<C64467je0> set);

        void onDismiss();
    }

    public C16424b(Context context, xh4 xh4, C16429e eVar) {
        super(context, C0966R.style.f8830zb);
        C64467je0 je02 = new C64467je0();
        this.f43848n = je02;
        je02.f183790d = "101";
        je02.f183791e = context.getString(C0966R.string.k3y);
        vh4 vh4 = xh4.f64718T;
        if (vh4 != null) {
            Iterator<C64467je0> it = vh4.f185898f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C64467je0 next = it.next();
                if (next.f183792f) {
                    C64467je0 je03 = this.f43848n;
                    je03.f183790d = next.f183790d;
                    je03.f183791e = next.f183791e;
                    xh4.f64718T.f185898f.remove(next);
                    break;
                }
            }
        }
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f360036ca0, (ViewGroup) null, false);
        this.f43841d = inflate;
        this.f43843f = inflate.findViewById(C0966R.C0970id.czj);
        this.f43844g = this.f43841d.findViewById(C0966R.C0970id.czq);
        this.f43846i = (TextView) this.f43841d.findViewById(C0966R.C0970id.czg);
        TextView textView = (TextView) this.f43841d.findViewById(C0966R.C0970id.f359457l00);
        this.f43845h = textView;
        textView.setOnClickListener(new C16425a(eVar));
        this.f43847j = (FlowLayout) this.f43841d.findViewById(C0966R.C0970id.czk);
        Iterator<C64467je0> it4 = xh4.f64718T.f185898f.iterator();
        while (it4.hasNext()) {
            C64467je0 next2 = it4.next();
            View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.f360037ca1, this.f43847j, false);
            TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.czo);
            textView2.setText(next2.f183791e);
            textView2.setOnClickListener(new C16426b(next2, textView2, context));
            this.f43847j.addView(inflate2);
        }
        this.f43846i.setText(xh4.f64718T.f185896d);
        this.f43846i.setOnClickListener(new C16427c(xh4));
        setContentView(this.f43841d);
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new C16428d(this, eVar));
    }

    /* renamed from: c */
    public void mo14882c(View view, boolean z, int i, int i2) {
        boolean z2 = z;
        super.show();
        int[] a = C66999e.m79151a(view.getContext(), view, this.f43841d, z2);
        if (z2) {
            View view2 = this.f43844g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f43843f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view6 = this.f43844g;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view8 = this.f43843f;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view9 = view8;
            C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        a[0] = a[0] + i;
        a[1] = a[1] + i2;
        Window window = getWindow();
        window.setLayout(-2, -2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.x = a[0];
        attributes.y = a[1];
        attributes.gravity = 8388659;
        window.setAttributes(attributes);
    }
}
