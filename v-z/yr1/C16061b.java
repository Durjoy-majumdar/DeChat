package yr1;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import qo3.C101218e0;

/* renamed from: yr1.b */
public final class C16061b {

    /* renamed from: a */
    public static final C16061b f43199a = new C16061b();

    /* renamed from: yr1.b$a */
    public static final class C16062a implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C16060a f43200a;

        /* renamed from: b */
        public final /* synthetic */ C101218e0 f43201b;

        public C16062a(C16060a aVar, C101218e0 e0Var) {
            this.f43200a = aVar;
            this.f43201b = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            C101218e0.C12907m mVar = this.f43200a.f43198d;
            if (mVar != null) {
                mVar.mo2001a();
            }
            this.f43201b.mo140680z();
        }
    }

    /* renamed from: yr1.b$b */
    public static final class C16063b implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C16060a f43202a;

        /* renamed from: b */
        public final /* synthetic */ C101218e0 f43203b;

        public C16063b(C16060a aVar, C101218e0 e0Var) {
            this.f43202a = aVar;
            this.f43203b = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            C101218e0.C12907m mVar = this.f43202a.f43198d;
            if (mVar != null) {
                mVar.mo2001a();
            }
            this.f43203b.mo140680z();
        }
    }

    /* renamed from: a */
    public final String mo14678a(C16060a aVar, Context context) {
        String str = aVar.f43195a;
        if (!(str == null || str.length() == 0)) {
            return aVar.f43195a;
        }
        if (aVar.f43197c) {
            String string = context.getResources().getString(C0966R.string.f7926wf);
            C87412m.m108593f(string, "context.resources.getStr…mmui.R.string.app_cancel)");
            return string;
        }
        String string2 = context.getResources().getString(C0966R.string.a18);
        C87412m.m108593f(string2, "context.resources.getStr….libmmui.R.string.app_ok)");
        return string2;
    }

    /* renamed from: b */
    public final int mo14679b(Context context, int i) {
        return i != 1 ? i != 6 ? context.getResources().getColor(C0966R.color.f3185i9) : context.getResources().getColor(C0966R.color.f3174hu) : context.getResources().getColor(C0966R.color.al7);
    }

    /* renamed from: c */
    public final C101218e0 mo14680c(Context context, View view, C16060a aVar, C16060a aVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "contentView");
        C87412m.m108594g(aVar, "leftBtnConfig");
        C87412m.m108594g(aVar2, "rightBtnConfig");
        C101218e0 e0Var = new C101218e0(context, 1, 0);
        e0Var.mo140667n(mo14678a(aVar, context), mo14678a(aVar2, context));
        e0Var.mo140675u(mo14679b(context, aVar.f43196b));
        int b = mo14679b(context, aVar2.f43196b);
        Button button = e0Var.f296395u;
        if (button != null) {
            button.setTextColor(b);
        }
        int i = aVar.f43196b;
        Button button2 = e0Var.f296394t;
        if (button2 != null) {
            if (i == 0) {
                button2.setBackgroundResource(C0966R.C0969drawable.f4653j6);
            } else if (i == 2) {
                button2.setBackgroundResource(C0966R.C0969drawable.f4663je);
            } else if (i == 3) {
                button2.setBackgroundResource(C0966R.C0969drawable.f4667jh);
            } else if (i == 4) {
                button2.setBackgroundResource(C0966R.C0969drawable.f4648j1);
            } else if (i == 5) {
                button2.setBackgroundResource(C0966R.C0969drawable.f4661jc);
            } else if (i == 6) {
                button2.setBackgroundResource(C0966R.C0969drawable.f4665jf);
            }
        }
        e0Var.mo140668o(aVar2.f43196b);
        C16062a aVar3 = new C16062a(aVar, e0Var);
        C16063b bVar = new C16063b(aVar2, e0Var);
        e0Var.f296373D = aVar3;
        e0Var.f296374E = bVar;
        e0Var.mo140663j(view);
        e0Var.mo140655A();
        return e0Var;
    }
}
