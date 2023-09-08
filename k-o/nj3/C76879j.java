package nj3;

import al3.C0086a;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg3.C76697h;
import p910lj.C76701a;
import qn3.C77382c;
import qo3.C77389a;
import qo3.C77390c0;
import qo3.C77393e;
import qo3.C77398g;
import qo3.C77407n;
import qo3.C89779i0;

@Deprecated
/* renamed from: nj3.j */
public final class C76879j {

    /* renamed from: nj3.j$b */
    public class C11175b implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ String f32980d;

        /* renamed from: e */
        public final /* synthetic */ List f32981e;

        /* renamed from: f */
        public final /* synthetic */ List f32982f;

        /* renamed from: g */
        public final /* synthetic */ String f32983g;

        public C11175b(String str, List list, List list2, String str2) {
            this.f32980d = str;
            this.f32981e = list;
            this.f32982f = list2;
            this.f32983g = str2;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            if (!Util.isNullOrNil(this.f32980d)) {
                e0Var.setHeaderTitle((CharSequence) this.f32980d);
            }
            for (int i = 0; i < this.f32981e.size(); i++) {
                e0Var.mo107142f(((Integer) this.f32982f.get(i)).intValue(), (CharSequence) this.f32981e.get(i));
            }
            if (!Util.isNullOrNil(this.f32983g)) {
                e0Var.mo107142f(-1, this.f32983g);
            }
        }
    }

    /* renamed from: nj3.j$d */
    public class C11176d implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ String f32984d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f32985e;

        public C11176d(String str, ArrayList arrayList) {
            this.f32984d = str;
            this.f32985e = arrayList;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.setHeaderTitle((CharSequence) this.f32984d);
            for (int i = 0; i < this.f32985e.size(); i++) {
                e0Var.mo107142f(i, (CharSequence) this.f32985e.get(i));
            }
        }
    }

    /* renamed from: nj3.j$e */
    public class C11177e implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C11180n f32986d;

        public C11177e(C11180n nVar) {
            this.f32986d = nVar;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C11180n nVar = this.f32986d;
            if (nVar != null) {
                nVar.mo782j(menuItem.getItemId());
            }
        }
    }

    /* renamed from: nj3.j$f */
    public class C11178f implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    /* renamed from: nj3.j$g */
    public class C11179g implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnClickListener f32987d;

        public C11179g(DialogInterface.OnClickListener onClickListener) {
            this.f32987d = onClickListener;
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnClickListener onClickListener = this.f32987d;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, 0);
            }
        }
    }

    /* renamed from: nj3.j$n */
    public interface C11180n {
        /* renamed from: j */
        void mo782j(int i);
    }

    /* renamed from: nj3.j$l */
    public interface C47267l {
        boolean onFinish(CharSequence charSequence);
    }

    /* renamed from: nj3.j$a */
    public class C76880a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ WeakReference f224733d;

        public C76880a(WeakReference weakReference) {
            this.f224733d = weakReference;
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnCancelListener onCancelListener = (DialogInterface.OnCancelListener) this.f224733d.get();
            if (onCancelListener != null) {
                onCancelListener.onCancel(dialogInterface);
            }
            C34861g1.m40517a(false, (Intent) null);
        }
    }

    /* renamed from: nj3.j$c */
    public class C76881c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C76888o f224734d;

        public C76881c(C76888o oVar) {
            this.f224734d = oVar;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C76888o oVar = this.f224734d;
            if (oVar != null) {
                oVar.mo5759a(i, menuItem.getItemId());
            }
        }
    }

    /* renamed from: nj3.j$h */
    public class C76882h implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnClickListener f224735d;

        public C76882h(DialogInterface.OnClickListener onClickListener) {
            this.f224735d = onClickListener;
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnClickListener onClickListener = this.f224735d;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, 0);
            }
        }
    }

    /* renamed from: nj3.j$i */
    public class C76883i implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnClickListener f224736d;

        public C76883i(DialogInterface.OnClickListener onClickListener) {
            this.f224736d = onClickListener;
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnClickListener onClickListener = this.f224736d;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, 0);
            }
        }
    }

    /* renamed from: nj3.j$j */
    public class C76884j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f224737d;

        /* renamed from: e */
        public final /* synthetic */ C76886k f224738e;

        /* renamed from: nj3.j$j$a */
        public class C76885a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f224739d;

            public C76885a(int i) {
                this.f224739d = i;
            }

            public void run() {
                ((Dialog) C76884j.this.f224737d.getTag()).dismiss();
                C76886k kVar = C76884j.this.f224738e;
                if (kVar != null) {
                    kVar.mo97047a(this.f224739d);
                }
            }
        }

        public C76884j(LinearLayout linearLayout, C76886k kVar) {
            this.f224737d = linearLayout;
            this.f224738e = kVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMAlert$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            for (int i = 0; i < this.f224737d.getChildCount(); i++) {
                TextView textView = (TextView) this.f224737d.getChildAt(i);
                if (textView.getId() != C0966R.C0970id.knp) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_off, 0, 0, 0);
                }
            }
            ((TextView) view).setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_on, 0, 0, 0);
            view.post(new C76885a(((Integer) view.getTag()).intValue()));
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMAlert$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: nj3.j$k */
    public interface C76886k {
        /* renamed from: a */
        void mo97047a(int i);
    }

    /* renamed from: nj3.j$m */
    public interface C76887m {
        void addDialog(Dialog dialog);
    }

    /* renamed from: nj3.j$o */
    public interface C76888o {
        /* renamed from: a */
        void mo5759a(int i, int i2);
    }

    /* renamed from: A */
    public static C77398g m92707A(Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        C77389a aVar = iVar.f225714b;
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225663t = str3;
        aVar.f225620C = onClickListener;
        aVar.f225664u = str4;
        aVar.f225621D = onClickListener2;
        C77398g a = iVar.mo107548a();
        a.show();
        m92730a(context, a);
        return a;
    }

    /* renamed from: B */
    public static C77398g m92708B(Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225663t = str3;
        aVar.f225620C = onClickListener;
        aVar.f225664u = str4;
        aVar.f225621D = onClickListener2;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.mo107543y(context.getResources().getColor(i));
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: C */
    public static C77398g m92709C(Context context, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return m92710D(context, str, str2, str3, str4, z, onClickListener, onClickListener2, -1);
    }

    /* renamed from: D */
    public static C77398g m92710D(Context context, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        C77389a aVar = iVar.f225714b;
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225663t = str3;
        aVar.f225620C = onClickListener;
        aVar.f225664u = str4;
        aVar.f225621D = onClickListener2;
        aVar.f225668y = z;
        C77398g a = iVar.mo107548a();
        if (i > 0) {
            a.mo107543y(context.getResources().getColor(i));
        }
        a.show();
        m92730a(context, a);
        return a;
    }

    /* renamed from: E */
    public static C77398g m92711E(Context context, String str, String str2, String str3, boolean z, DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        C77389a aVar = iVar.f225714b;
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225663t = str3;
        aVar.f225620C = onClickListener;
        aVar.f225668y = z;
        C77398g a = iVar.mo107548a();
        a.show();
        m92730a(context, a);
        return a;
    }

    /* renamed from: F */
    public static C77398g m92712F(Context context, String str, String str2, boolean z) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        C77389a aVar = iVar.f225714b;
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225668y = z;
        iVar.mo107552e(C0966R.string.a18);
        iVar.f225714b.f225620C = new C11178f();
        C77398g a = iVar.mo107548a();
        a.show();
        m92730a(context, a);
        return a;
    }

    /* renamed from: G */
    public static C77398g m92713G(Context context, String str, String str2, boolean z, DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        C77389a aVar = iVar.f225714b;
        aVar.f225644a = str2;
        aVar.f225660q = str;
        iVar.mo107552e(C0966R.string.a18);
        C77389a aVar2 = iVar.f225714b;
        aVar2.f225620C = onClickListener;
        aVar2.f225668y = z;
        C77398g a = iVar.mo107548a();
        a.show();
        m92730a(context, a);
        return a;
    }

    /* renamed from: H */
    public static C77398g m92714H(Context context, String str, String str2, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        C77389a aVar = iVar.f225714b;
        aVar.f225644a = str2;
        aVar.f225660q = str;
        iVar.mo107552e(C0966R.string.a18);
        iVar.f225714b.f225620C = onClickListener;
        iVar.mo107551d(C0966R.string.f7926wf);
        C77389a aVar2 = iVar.f225714b;
        aVar2.f225621D = onClickListener2;
        aVar2.f225668y = z;
        C77398g a = iVar.mo107548a();
        a.show();
        m92730a(context, a);
        return a;
    }

    /* renamed from: I */
    public static C77398g m92715I(Context context, boolean z, String str, View view, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return m92716J(context, z, str, view, str2, str3, onClickListener, onClickListener2, -1);
    }

    /* renamed from: J */
    public static C77398g m92716J(Context context, boolean z, String str, View view, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str;
        aVar.f225627J = view;
        aVar.f225663t = str2;
        aVar.f225620C = onClickListener;
        aVar.f225664u = str3;
        aVar.f225621D = onClickListener2;
        aVar.f225668y = z;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        if (i > 0) {
            gVar.mo107543y(context.getResources().getColor(i));
        }
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: K */
    public static C77398g m92717K(Context context, boolean z, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225663t = str3;
        aVar.f225620C = onClickListener;
        aVar.f225664u = str4;
        aVar.f225621D = onClickListener2;
        aVar.f225668y = z;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: L */
    public static C77398g m92718L(Context context, boolean z, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i, int i2) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225663t = str3;
        aVar.f225620C = onClickListener;
        aVar.f225664u = str4;
        aVar.f225621D = onClickListener2;
        aVar.f225668y = z;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        if (i > 0) {
            gVar.mo107543y(context.getResources().getColor(i));
        }
        if (i2 > 0) {
            gVar.mo107540u(context.getResources().getColor(i2));
        }
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: M */
    public static C77398g m92719M(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnCancelListener onCancelListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a18);
        aVar.f225620C = onClickListener;
        aVar.f225622E = onCancelListener;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: N */
    public static C77398g m92720N(Context context, String str, String str2, String str3, int i, C47267l lVar) {
        C77398g gVar = null;
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            C77389a aVar = new C77389a();
            aVar.f225668y = false;
            aVar.f225669z = true;
            aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
            aVar.f225621D = null;
            aVar.f225644a = str;
            View inflate = View.inflate(context, C0966R.C0971layout.bby, (ViewGroup) null);
            MMEditText mMEditText = (MMEditText) inflate.findViewById(C0966R.C0970id.cd7);
            if (!Util.isNullOrNil(str2)) {
                mMEditText.mo98046o(str2);
            }
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.knp);
            if (Util.isNullOrNil(str3)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str3);
            }
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a18);
            aVar.f225620C = new C76892m(lVar, mMEditText, context);
            aVar.f225641X = false;
            if (i > 0) {
                C77382c b = C77382c.m93286b(mMEditText);
                b.f225611e = 0;
                b.f225610d = i;
                b.mo107499d((C77382c.C77383a) null);
            }
            aVar.f225627J = inflate;
            gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
            m92730a(context, gVar);
            if (context instanceof MMActivity) {
                inflate.post(new C76894n(context));
            }
        }
        return gVar;
    }

    /* renamed from: O */
    public static C89779i0 m92721O(Context context, String str, int i, int i2, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C34861g1.m40517a(true, (Intent) null);
        C89779i0 d = C89779i0.m112247d(context, str2, z2, i, i2, new C76880a(new WeakReference(onCancelListener)));
        m92730a(context, d);
        return d;
    }

    /* renamed from: P */
    public static C89779i0 m92722P(Context context, String str, int i, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        return m92721O(context, str, i, -1, str2, z, z2, onCancelListener);
    }

    /* renamed from: Q */
    public static C89779i0 m92723Q(Context context, String str, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        return m92722P(context, str, 0, str2, z, z2, onCancelListener);
    }

    /* renamed from: R */
    public static C89779i0 m92724R(Context context, String str, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        return m92722P(context, str, 2, str2, z, z2, onCancelListener);
    }

    /* renamed from: S */
    public static C77398g m92725S(Context context, String str, List<String> list, int i, String str2, C76886k kVar) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        if (list == null || list.isEmpty()) {
            Log.m105928w("MicroMsg.MMAlert", "show switch alert fail");
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225668y = false;
        aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
        aVar.f225644a = str;
        View inflate = View.inflate(context, C0966R.C0971layout.bbz, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.kbc);
        for (int size = list.size() - 1; size >= 0; size--) {
            TextView textView = (TextView) View.inflate(context, C0966R.C0971layout.bpg, (ViewGroup) null);
            textView.setText(list.get(size));
            if (size == i) {
                textView.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_on, 0, 0, 0);
            }
            if (size == list.size() - 1) {
                context.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
                textView.setBackgroundResource(C0966R.C0969drawable.avo);
            }
            textView.setTag(Integer.valueOf(size));
            linearLayout.addView(textView, 0);
            textView.setOnClickListener(new C76884j(linearLayout, kVar));
        }
        aVar.f225627J = inflate;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        linearLayout.setTag(gVar);
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: T */
    public static Toast m92726T(Context context, String str) {
        return m92728V(context, str, 0, (DialogInterface.OnDismissListener) null);
    }

    /* renamed from: U */
    public static Toast m92727U(Context context, String str, int i) {
        return m92728V(context, str, i, (DialogInterface.OnDismissListener) null);
    }

    /* renamed from: V */
    public static Toast m92728V(Context context, String str, int i, DialogInterface.OnDismissListener onDismissListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        Toast makeText = C76701a.makeText(context, (CharSequence) str, 0);
        makeText.show();
        return makeText;
    }

    /* renamed from: W */
    public static void m92729W(Context context, String str) {
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            C76701a.makeText(context, (CharSequence) str, 0).show();
        }
    }

    /* renamed from: a */
    public static void m92730a(Context context, Dialog dialog) {
        if (context instanceof C76887m) {
            ((C76887m) context).addDialog(dialog);
            if (!(context instanceof C77393e)) {
                return;
            }
            if (dialog instanceof C77398g) {
                ((C77398g) dialog).f225689M = (C77393e) context;
            } else if (dialog instanceof C77390c0) {
                ((C77390c0) dialog).setiOnDialogDismissListener((C77393e) context);
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static Dialog m92731b(Context context, String str, List<String> list, List<Integer> list2, String str2, String str3, boolean z, C76888o oVar, DialogInterface.OnCancelListener onCancelListener) {
        if ((list == null || list.size() == 0) && Util.isNullOrNil(str2)) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        C77407n nVar = new C77407n(context, 1, false);
        nVar.f225771i = new C11175b(str, list, list2, str2);
        nVar.f225782p = new C76881c(oVar);
        nVar.mo107573q();
        return null;
    }

    /* renamed from: c */
    public static Dialog m92732c(Context context, String str, List<String> list, List<Integer> list2, String str2, C76888o oVar) {
        m92731b(context, str, list, list2, str2, "", true, oVar, (DialogInterface.OnCancelListener) null);
        return null;
    }

    /* renamed from: d */
    public static Dialog m92733d(Context context, String str, List<String> list, List<Integer> list2, String str2, boolean z, C76888o oVar) {
        m92731b(context, str, list, list2, str2, "", z, oVar, (DialogInterface.OnCancelListener) null);
        return null;
    }

    /* renamed from: e */
    public static Dialog m92734e(Context context, String str, String[] strArr, String str2, String str3, C11180n nVar) {
        m92735f(context, str, strArr, str2, str3, true, nVar, (DialogInterface.OnCancelListener) null);
        return null;
    }

    @Deprecated
    /* renamed from: f */
    public static Dialog m92735f(Context context, String str, String[] strArr, String str2, String str3, boolean z, C11180n nVar, DialogInterface.OnCancelListener onCancelListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        if ((strArr == null || strArr.length == 0) && Util.isNullOrNil(str2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (strArr != null && strArr.length > 0) {
            Collections.addAll(arrayList, strArr);
        }
        if (!Util.isNullOrNil(str2)) {
            arrayList.add(str2);
        }
        C77407n nVar2 = new C77407n(context, 1, false);
        nVar2.f225771i = new C11176d(str, arrayList);
        nVar2.f225782p = new C11177e(nVar);
        nVar2.mo107573q();
        return null;
    }

    /* renamed from: g */
    public static Dialog m92736g(Context context, String str, String[] strArr, String str2, C11180n nVar) {
        m92735f(context, str, strArr, str2, "", true, nVar, (DialogInterface.OnCancelListener) null);
        return null;
    }

    /* renamed from: h */
    public static Dialog m92737h(Context context, String str, String[] strArr, String str2, boolean z, C11180n nVar) {
        m92735f(context, str, strArr, str2, "", z, nVar, (DialogInterface.OnCancelListener) null);
        return null;
    }

    /* renamed from: i */
    public static C77398g m92738i(Context context, int i, int i2) {
        String str = "";
        String b = i > 0 ? C76697h.m92349b(context, i) : str;
        if (i2 > 0) {
            str = C76697h.m92349b(context, i2);
        }
        return m92712F(context, b, str, true);
    }

    /* renamed from: j */
    public static C77398g m92739j(Context context, int i, int i2, int i3, int i4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        if (i2 != 0) {
            iVar.mo107553f(i2);
        }
        iVar.mo107550c(i);
        iVar.mo107552e(i3);
        iVar.f225714b.f225620C = onClickListener;
        iVar.mo107551d(i4);
        C77389a aVar = iVar.f225714b;
        aVar.f225621D = onClickListener2;
        aVar.f225622E = new C11179g(onClickListener2);
        C77398g a = iVar.mo107548a();
        a.show();
        m92730a(context, a);
        return a;
    }

    /* renamed from: k */
    public static C77398g m92740k(Context context, int i, int i2, int i3, int i4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        String str = "";
        String b = i > 0 ? C76697h.m92349b(context, i) : str;
        if (i2 > 0) {
            str = C76697h.m92349b(context, i2);
        }
        return m92709C(context, b, str, C76697h.m92349b(context, i3), C76697h.m92349b(context, i4), z, onClickListener, onClickListener2);
    }

    /* renamed from: l */
    public static C77398g m92741l(Context context, int i, int i2, int i3, int i4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i5) {
        Context context2 = context;
        int i6 = i2;
        String str = "";
        String b = i > 0 ? C76697h.m92349b(context, i) : str;
        if (i6 > 0) {
            str = C76697h.m92349b(context, i2);
        }
        int i7 = i3;
        int i8 = i4;
        return m92710D(context, b, str, C76697h.m92349b(context, i3), C76697h.m92349b(context, i4), z, onClickListener, onClickListener2, i5);
    }

    /* renamed from: m */
    public static C77398g m92742m(Context context, int i, int i2, DialogInterface.OnClickListener onClickListener) {
        return m92744o(context, i, i2, true, onClickListener);
    }

    /* renamed from: n */
    public static C77398g m92743n(Context context, int i, int i2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        String str = "";
        String b = i > 0 ? C76697h.m92349b(context, i) : str;
        if (i2 > 0) {
            str = C76697h.m92349b(context, i2);
        }
        return m92751v(context, b, str, onClickListener, onClickListener2, -1);
    }

    /* renamed from: o */
    public static C77398g m92744o(Context context, int i, int i2, boolean z, DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        if (i2 > 0) {
            aVar.f225644a = C76697h.m92348a(context).getString(i2);
        }
        aVar.f225660q = C76697h.m92348a(context).getString(i);
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a18);
        aVar.f225620C = onClickListener;
        aVar.f225668y = z;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: p */
    public static C77398g m92745p(Context context, String str, View view, DialogInterface.OnCancelListener onCancelListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str;
        aVar.f225627J = view;
        aVar.f225622E = onCancelListener;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: q */
    public static C77398g m92746q(Context context, String str, View view, DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str;
        aVar.f225627J = view;
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a18);
        aVar.f225620C = onClickListener;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: r */
    public static C77398g m92747r(Context context, String str, View view, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return m92715I(context, true, str, view, str2, str3, onClickListener, onClickListener2);
    }

    /* renamed from: s */
    public static C77398g m92748s(Context context, String str, String str2) {
        return m92712F(context, str, str2, true);
    }

    /* renamed from: t */
    public static C77398g m92749t(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        return m92713G(context, str, str2, true, onClickListener);
    }

    /* renamed from: u */
    public static C77398g m92750u(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return m92751v(context, str, str2, onClickListener, onClickListener2, -1);
    }

    /* renamed from: v */
    public static C77398g m92751v(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        C77389a aVar = iVar.f225714b;
        aVar.f225644a = str2;
        aVar.f225660q = str;
        iVar.mo107552e(C0966R.string.a18);
        iVar.f225714b.f225620C = onClickListener;
        iVar.mo107551d(C0966R.string.f7926wf);
        iVar.f225714b.f225621D = onClickListener2;
        C77398g a = iVar.mo107548a();
        if (i > 0) {
            a.mo107543y(context.getResources().getColor(i));
        }
        a.show();
        m92730a(context, a);
        return a;
    }

    /* renamed from: w */
    public static C77398g m92752w(Context context, String str, String str2, View view, DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str;
        aVar.f225627J = view;
        aVar.f225663t = str2;
        aVar.f225620C = onClickListener;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: x */
    public static C77398g m92753x(Context context, String str, String str2, View view, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str;
        aVar.f225660q = str2;
        aVar.f225627J = view;
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a18);
        aVar.f225620C = onClickListener;
        aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
        aVar.f225621D = onClickListener2;
        aVar.f225622E = new C76883i(onClickListener2);
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }

    /* renamed from: y */
    public static C77398g m92754y(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        return m92711E(context, str, str2, str3, true, onClickListener);
    }

    /* renamed from: z */
    public static C77398g m92755z(Context context, String str, String str2, String str3, View view, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str;
        aVar.f225660q = str2;
        aVar.f225627J = view;
        aVar.f225663t = str3;
        aVar.f225620C = onClickListener;
        aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
        aVar.f225621D = onClickListener2;
        aVar.f225622E = new C76882h(onClickListener2);
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        m92730a(context, gVar);
        return gVar;
    }
}
