package a71;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import p008bq.C92282j0;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C101814mn2;
import v61.C37682c;
import vh3.C102191c;
import vh3.C102193e;
import vh3.C102196g;
import z04.C112550d0;

/* renamed from: a71.b */
public final class C91965b {

    /* renamed from: a */
    public final Context f263299a;

    /* renamed from: b */
    public final C92282j0.C92283a f263300b;

    /* renamed from: c */
    public final String f263301c = "MicroMsg.CheckLensInfo";

    /* renamed from: d */
    public final C89779i0 f263302d;

    /* renamed from: a71.b$a */
    public static final class C91966a implements C102191c {

        /* renamed from: a */
        public final /* synthetic */ C91965b f263303a;

        /* renamed from: b */
        public final /* synthetic */ String f263304b;

        /* renamed from: a71.b$a$a */
        public static final class C91967a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C101814mn2 f263305d;

            /* renamed from: e */
            public final /* synthetic */ C91965b f263306e;

            /* renamed from: f */
            public final /* synthetic */ String f263307f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C91967a(C101814mn2 mn22, C91965b bVar, String str) {
                super(0);
                this.f263305d = mn22;
                this.f263306e = bVar;
                this.f263307f = str;
            }

            public Object invoke() {
                if (this.f263305d != null) {
                    C91965b bVar = this.f263306e;
                    String str = this.f263307f;
                    bVar.f263302d.dismiss();
                    C37682c.m41480c(bVar.f263299a, (String) null, 1111, 0, str, "");
                    bVar.f263300b.mo126268a(false);
                } else {
                    C77426q qVar = new C77426q(this.f263306e.f263299a);
                    qVar.mo107595g(this.f263306e.f263299a.getResources().getString(C0966R.string.jmt));
                    qVar.mo107602n(this.f263306e.f263299a.getResources().getString(C0966R.string.a18));
                    qVar.mo107600l(new C91964a(this.f263306e));
                    qVar.mo107603o();
                }
                return C13598b0.f38549a;
            }
        }

        public C91966a(C91965b bVar, String str) {
            this.f263303a = bVar;
            this.f263304b = str;
        }

        /* renamed from: a */
        public void mo125818a(int i, C101814mn2 mn22) {
            C61926c.m72668M(new C91967a(mn22, this.f263303a, this.f263304b));
        }
    }

    /* renamed from: a71.b$b */
    public static final class C91968b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C91965b f263308d;

        public C91968b(C91965b bVar) {
            this.f263308d = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Log.m105924i(this.f263308d.f263301c, "CheckLensInfo: cancel loading");
            C91965b bVar = this.f263308d;
            bVar.f263302d.dismiss();
            bVar.f263300b.mo126268a(false);
        }
    }

    public C91965b(Context context, String str, C92282j0.C92283a aVar) {
        String str2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "onResult");
        this.f263299a = context;
        this.f263300b = aVar;
        String string = context.getResources().getString(C0966R.string.gap);
        C87412m.m108593f(string, "context.resources.getStr…m.uikit.R.string.loading)");
        boolean z = true;
        this.f263302d = C89779i0.m112248e(context, string, true, 0, new C91968b(this));
        int E = str != null ? C112550d0.m153769E(str, "lensid=", 0, false, 6, (Object) null) : 0;
        MMActivity mMActivity = null;
        if (str != null) {
            str2 = str.substring(E + 7);
            C87412m.m108593f(str2, "this as java.lang.String).substring(startIndex)");
        } else {
            str2 = null;
        }
        if (!(str2 == null || str2.length() == 0)) {
            z = false;
        }
        if (z) {
            aVar.mo126268a(false);
            return;
        }
        mMActivity = context instanceof MMActivity ? (MMActivity) context : mMActivity;
        C91966a aVar2 = new C91966a(this, str2);
        C87412m.m108594g(str2, "lensId");
        if (MMApplicationContext.isMainProcess()) {
            new C102193e(mMActivity, str2, aVar2);
        } else {
            new C102196g(mMActivity, str2, aVar2);
        }
    }
}
