package fs0;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.record.WAGameRecordShareUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75375u;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import p385u2.C111105a;
import p629ny.C76978g;
import qo3.C77407n;
import sw1.C48478n;

/* renamed from: fs0.b */
public final class C97961b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WAGameRecordShareUI f287323d;

    /* renamed from: fs0.b$a */
    public static final class C97962a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ WAGameRecordShareUI f287324d;

        public C97962a(WAGameRecordShareUI wAGameRecordShareUI) {
            this.f287324d = wAGameRecordShareUI;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            ArrayList<Integer> arrayList = this.f287324d.f267613h;
            if (arrayList != null) {
                Iterator<Integer> it = arrayList.iterator();
                while (it.hasNext()) {
                    Integer next = it.next();
                    if (next != null && next.intValue() == 0) {
                        String q = C76577a.m92166q(this.f287324d.getContext(), C0966R.string.f360112mq1);
                        C87412m.m108593f(q, "getString(\n             …                        )");
                        String format = String.format(q, Arrays.copyOf(new Object[]{this.f287324d.f267611f.f38918b}, 1));
                        C87412m.m108593f(format, "format(format, *args)");
                        e0Var.mo107142f(0, format);
                    }
                    if (next != null && next.intValue() == 1) {
                        e0Var.mo107142f(1, C76577a.m92166q(this.f287324d.getContext(), C0966R.string.f360111mq0));
                    }
                    if (next != null && next.intValue() == 2) {
                        e0Var.mo107142f(2, C76577a.m92166q(this.f287324d.getContext(), C0966R.string.a79));
                    }
                }
                return;
            }
            C87412m.m108603p("shareOptionsInParam");
            throw null;
        }
    }

    /* renamed from: fs0.b$b */
    public static final class C97963b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ WAGameRecordShareUI f287325d;

        /* renamed from: fs0.b$b$a */
        public static final class C97964a implements C48478n.C48481f {

            /* renamed from: a */
            public final /* synthetic */ WAGameRecordShareUI f287326a;

            /* renamed from: fs0.b$b$a$a */
            public static final class C97965a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ WAGameRecordShareUI f287327d;

                /* renamed from: e */
                public final /* synthetic */ String f287328e;

                public C97965a(WAGameRecordShareUI wAGameRecordShareUI, String str) {
                    this.f287327d = wAGameRecordShareUI;
                    this.f287328e = str;
                }

                public final void run() {
                    C76912y0.m92767f(this.f287327d, this.f287328e);
                }
            }

            /* renamed from: fs0.b$b$a$b */
            public static final class C97966b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ WAGameRecordShareUI f287329d;

                public C97966b(WAGameRecordShareUI wAGameRecordShareUI) {
                    this.f287329d = wAGameRecordShareUI;
                }

                public final void run() {
                    Log.m105924i("MicroMsg.WAGameRecordShareUI", "share to wegame center ok");
                    WAGameRecordShareUI wAGameRecordShareUI = this.f287329d;
                    TextView textView = wAGameRecordShareUI.f267616n;
                    if (textView != null) {
                        C75375u uVar = new C75375u(wAGameRecordShareUI.getString(C0966R.string.cz5));
                        uVar.mo105705b(((C76978g) C86312j.m106911c(C76978g.class)).Co0("", C111105a.m151500b(wAGameRecordShareUI, C0966R.color.a1d), C111105a.m151500b(wAGameRecordShareUI, C0966R.color.BW_0_Alpha_0_2), true, new C97972e(wAGameRecordShareUI)), 7, 16, 18);
                        textView.setText(uVar);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        WAGameRecordShareUI wAGameRecordShareUI2 = this.f287329d;
                        C76912y0.m92768g(wAGameRecordShareUI2, wAGameRecordShareUI2.getResources().getString(C0966R.string.j6i));
                        return;
                    }
                    C87412m.m108603p("shareText");
                    throw null;
                }
            }

            public C97964a(WAGameRecordShareUI wAGameRecordShareUI) {
                this.f287326a = wAGameRecordShareUI;
            }

            /* renamed from: a */
            public void mo6931a(String str) {
                Log.m105920e("MicroMsg.WAGameRecordShareUI", "share to wegame error");
                WAGameRecordShareUI wAGameRecordShareUI = this.f287326a;
                wAGameRecordShareUI.runOnUiThread(new C97965a(wAGameRecordShareUI, str));
                WAGameRecordShareUI wAGameRecordShareUI2 = this.f287326a;
                String nullAsNil = Util.nullAsNil(str);
                C87412m.m108593f(nullAsNil, "nullAsNil(errorMsg)");
                WAGameRecordShareUI.m117229I7(wAGameRecordShareUI2, 0, 1, nullAsNil);
            }

            public void onCancel() {
                Log.m105924i("MicroMsg.WAGameRecordShareUI", "share to wegame center cancel");
                WAGameRecordShareUI.m117229I7(this.f287326a, 0, 2, "user cancel");
            }

            public void onSuccess() {
                WAGameRecordShareUI wAGameRecordShareUI = this.f287326a;
                wAGameRecordShareUI.runOnUiThread(new C97966b(wAGameRecordShareUI));
                WAGameRecordShareUI.m117229I7(this.f287326a, 0, 0, "ok");
            }
        }

        /* renamed from: fs0.b$b$b */
        public static final class C97967b implements C48478n.C48481f {

            /* renamed from: a */
            public final /* synthetic */ WAGameRecordShareUI f287330a;

            public C97967b(WAGameRecordShareUI wAGameRecordShareUI) {
                this.f287330a = wAGameRecordShareUI;
            }

            /* renamed from: a */
            public void mo6931a(String str) {
                Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: share to friend err! " + str);
                WAGameRecordShareUI wAGameRecordShareUI = this.f287330a;
                String nullAsNil = Util.nullAsNil(str);
                C87412m.m108593f(nullAsNil, "nullAsNil(errorMsg)");
                WAGameRecordShareUI.m117229I7(wAGameRecordShareUI, 1, 1, nullAsNil);
            }

            public void onCancel() {
                Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: share to friend cancel!");
                WAGameRecordShareUI.m117229I7(this.f287330a, 1, 2, "user cancel");
            }

            public void onSuccess() {
                Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: share to friend done");
                WAGameRecordShareUI wAGameRecordShareUI = this.f287330a;
                int i = WAGameRecordShareUI.f267608p;
                wAGameRecordShareUI.getClass();
                wAGameRecordShareUI.runOnUiThread(new C97970d(1, wAGameRecordShareUI));
                WAGameRecordShareUI.m117229I7(this.f287330a, 1, 0, "ok");
            }
        }

        /* renamed from: fs0.b$b$c */
        public static final class C97968c implements C48478n.C48481f {

            /* renamed from: a */
            public final /* synthetic */ WAGameRecordShareUI f287331a;

            public C97968c(WAGameRecordShareUI wAGameRecordShareUI) {
                this.f287331a = wAGameRecordShareUI;
            }

            /* renamed from: a */
            public void mo6931a(String str) {
                Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: share to sns err! " + str);
                WAGameRecordShareUI wAGameRecordShareUI = this.f287331a;
                String nullAsNil = Util.nullAsNil(str);
                C87412m.m108593f(nullAsNil, "nullAsNil(errorMsg)");
                WAGameRecordShareUI.m117229I7(wAGameRecordShareUI, 2, 1, nullAsNil);
            }

            public void onCancel() {
                Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: share to sns cancel!");
                WAGameRecordShareUI.m117229I7(this.f287331a, 2, 2, "user cancel");
            }

            public void onSuccess() {
                Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: share to sns done");
                WAGameRecordShareUI wAGameRecordShareUI = this.f287331a;
                int i = WAGameRecordShareUI.f267608p;
                wAGameRecordShareUI.getClass();
                wAGameRecordShareUI.runOnUiThread(new C97970d(2, wAGameRecordShareUI));
                WAGameRecordShareUI.m117229I7(this.f287331a, 2, 0, "ok");
            }
        }

        public C97963b(WAGameRecordShareUI wAGameRecordShareUI) {
            this.f287325d = wAGameRecordShareUI;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Class cls = C48478n.class;
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                WAGameRecordShareUI wAGameRecordShareUI = this.f287325d;
                ((C48478n) C86312j.m106911c(cls)).mo65691r6(wAGameRecordShareUI, wAGameRecordShareUI.f267611f, new C97964a(wAGameRecordShareUI));
            } else if (itemId == 1) {
                WAGameRecordShareUI wAGameRecordShareUI2 = this.f287325d;
                ((C48478n) C86312j.m106911c(cls)).jg0(wAGameRecordShareUI2, wAGameRecordShareUI2.f267611f, new C97967b(wAGameRecordShareUI2));
            } else if (itemId != 2) {
                Log.m105920e("MicroMsg.WAGameRecordShareUI", "bottom sheet,error itemId");
            } else {
                WAGameRecordShareUI wAGameRecordShareUI3 = this.f287325d;
                ((C48478n) C86312j.m106911c(cls)).Yd0(wAGameRecordShareUI3, wAGameRecordShareUI3.f267611f, new C97968c(wAGameRecordShareUI3));
            }
        }
    }

    public C97961b(WAGameRecordShareUI wAGameRecordShareUI) {
        this.f287323d = wAGameRecordShareUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77407n nVar = new C77407n((Context) this.f287323d, 1, false);
        WAGameRecordShareUI wAGameRecordShareUI = this.f287323d;
        nVar.f225779n1 = true;
        nVar.f225771i = new C97962a(wAGameRecordShareUI);
        nVar.f225782p = new C97963b(wAGameRecordShareUI);
        nVar.mo107573q();
        WAGameRecordShareUI.m117230N7(wAGameRecordShareUI, 601, 3, 1, 1, (String) null, 16, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
