package pd2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.order.model.MallTransactionObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import pj3.C47511g;
import sd2.C77659e;

/* renamed from: pd2.a */
public class C77077a {

    /* renamed from: pd2.a$a */
    public class C77078a extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ MallTransactionObject f225139g;

        /* renamed from: h */
        public final /* synthetic */ Context f225140h;

        /* renamed from: pd2.a$a$a */
        public class C77079a implements C76879j.C76888o {
            public C77079a() {
            }

            /* renamed from: a */
            public void mo5759a(int i, int i2) {
                C77078a aVar = C77078a.this;
                C77077a.m93006b(i2, aVar.f225140h, aVar.f225139g);
            }
        }

        public C77078a(MallTransactionObject mallTransactionObject, Context context) {
            this.f225139g = mallTransactionObject;
            this.f225140h = context;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            if (!Util.isNullOrNil(this.f225139g.f202096C)) {
                linkedList2.add(0);
                linkedList.add(this.f225140h.getString(C0966R.string.l18));
            }
            if (!Util.isNullOrNil(this.f225139g.f202097D)) {
                linkedList2.add(1);
                linkedList.add(this.f225140h.getString(C0966R.string.l19));
            }
            if (!Util.isNullOrNil(this.f225139g.f202107N)) {
                linkedList2.add(2);
                linkedList.add(this.f225140h.getString(C0966R.string.l1a));
            }
            if (linkedList2.size() == 1) {
                C77077a.m93006b(((Integer) linkedList2.get(0)).intValue(), this.f225140h, this.f225139g);
            } else {
                C76879j.m92733d(this.f225140h, (String) null, linkedList, linkedList2, (String) null, true, new C77079a());
            }
        }
    }

    /* renamed from: pd2.a$b */
    public interface C77080b {
        /* renamed from: a */
        List<Preference> mo107389a(Context context, C47511g gVar, MallTransactionObject mallTransactionObject);
    }

    /* renamed from: a */
    public static C77659e m93005a(Context context, MallTransactionObject mallTransactionObject) {
        C77659e eVar = new C77659e(context);
        if (!Util.isNullOrNil(mallTransactionObject.f202107N)) {
            eVar.f226395L = context.getString(C0966R.string.l17);
        } else {
            eVar.f226395L = context.getString(C0966R.string.l1_);
        }
        eVar.f226394K = new C77078a(mallTransactionObject, context);
        return eVar;
    }

    /* renamed from: b */
    public static void m93006b(int i, Context context, MallTransactionObject mallTransactionObject) {
        if (i == 0) {
            C86709a0.m107528h();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(mallTransactionObject.f202096C);
            if (z1Var == null || !z1Var.mo62927s3()) {
                C75228t.m90223P(context, mallTransactionObject.f202096C);
            } else {
                C75228t.m90215H(context, mallTransactionObject.f202096C);
            }
        } else if (i == 1) {
            C75228t.m90244f(context, mallTransactionObject.f202097D);
        } else if (i == 2) {
            C75228t.m90219L(context, mallTransactionObject.f202107N, false);
        }
    }
}
