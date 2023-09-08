package zy2;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.C0125s;
import az2.C39674e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import ob0.C89137b0;
import qo3.C89779i0;
import rx3.C13598b0;
import rz2.C48212k;
import sy2.C48509c;
import uy2.C52660e;
import uy2.C52665g;
import uz2.C52675d0;
import vy2.C78495a;
import xy2.C53477h;
import xy2.C53480i;

/* renamed from: zy2.a */
public final class C53844a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f151076d;

    /* renamed from: e */
    public final /* synthetic */ C48212k f151077e;

    /* renamed from: f */
    public final /* synthetic */ Context f151078f;

    /* renamed from: g */
    public final /* synthetic */ C52660e f151079g;

    /* renamed from: h */
    public final /* synthetic */ C53847c f151080h;

    /* renamed from: zy2.a$a */
    public static final class C53845a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f151081d;

        public C53845a(C117747y yVar) {
            this.f151081d = yVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f151081d);
        }
    }

    /* renamed from: zy2.a$b */
    public static final class C53846b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C53847c f151082d;

        /* renamed from: e */
        public final /* synthetic */ C48212k f151083e;

        /* renamed from: f */
        public final /* synthetic */ Context f151084f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53846b(C53847c cVar, C48212k kVar, Context context) {
            super(1);
            this.f151082d = cVar;
            this.f151083e = kVar;
            this.f151084f = context;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C89779i0 i0Var = this.f151082d.f151086M;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            if (booleanValue) {
                C48212k wx02 = ((C53477h) C86312j.m106911c(C53477h.class)).wx0(this.f151083e.field_sessionId);
                if (wx02 != null) {
                    wx02.field_canTalk = 1;
                    C39674e.f106452d.mo62239E0().update(wx02, new String[0]);
                }
                Context context = this.f151084f;
                C76912y0.m92766e(context, context.getString(C0966R.string.k0o), new C16416b(this.f151084f));
            } else {
                Log.m105920e("MicroMsg.MMHalfBottomDialog", "greeting reply failed");
                Context context2 = this.f151084f;
                C76879j.m92748s(context2, context2.getString(C0966R.string.msg_net_error), "");
            }
            return C13598b0.f38549a;
        }
    }

    public C53844a(boolean z, C48212k kVar, Context context, C52660e eVar, C53847c cVar) {
        this.f151076d = z;
        this.f151077e = kVar;
        this.f151078f = context;
        this.f151079g = eVar;
        this.f151080h = cVar;
    }

    public final void onClick(View view) {
        Class cls = C53477h.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusProfileBottomDialog$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f151076d) {
            C48212k kVar = this.f151077e;
            ((C53477h) C86312j.m106911c(cls)).yx0(kVar.field_sessionId, kVar.field_userName, this.f151078f);
        } else {
            C52665g.C52666a aVar = C52665g.f147055f;
            C52660e eVar = this.f151079g;
            C48509c cVar = null;
            String str = eVar != null ? eVar.field_session_id : null;
            if (str == null) {
                str = "";
            }
            aVar.mo73606c(str, 105);
            if (this.f151079g != null) {
                C53477h hVar = (C53477h) C86312j.m106911c(cls);
                C52660e eVar2 = this.f151079g;
                Context context = this.f151078f;
                C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
                C53846b bVar = new C53846b(this.f151080h, this.f151077e, context);
                hVar.getClass();
                if (eVar2 != null) {
                    C52675d0 d0Var = new C52675d0();
                    d0Var.f147076e = eVar2.field_tag;
                    d0Var.f147077f = eVar2.field_source_id;
                    d0Var.f147079h = eVar2.field_status_id;
                    d0Var.f147080i = eVar2.field_modify_count;
                    d0Var.f147078g = eVar2.field_card_key;
                    d0Var.f147075d = 1;
                    cVar = new C48509c(eVar2);
                    C89137b0 d = C86709a0.m107524d();
                    C87412m.m108593f(d, "getNetSceneQueue()");
                    C78495a.m94796a(d, cVar, sVar, new C53480i(cVar, bVar));
                }
                C53847c cVar2 = this.f151080h;
                Context context2 = this.f151078f;
                cVar2.f151086M = C76879j.m92723Q(context2, context2.getString(C0966R.string.k0t), this.f151078f.getString(C0966R.string.k0t), false, true, new C53845a(cVar));
            }
        }
        this.f151080h.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusProfileBottomDialog$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
