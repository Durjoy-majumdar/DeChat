package vr0;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import gy3.C87412m;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: vr0.a */
public final class C78471a {

    /* renamed from: a */
    public static final C78472a f229885a = new C78472a((C8480h) null);

    /* renamed from: vr0.a$a */
    public static final class C78472a {
        public C78472a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo108406a(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener) {
            C87412m.m108594g(context, "cxt");
            C87412m.m108594g(onClickListener, "onPositiveClick");
            C87412m.m108594g(onClickListener2, "onNegativeCLick");
            C87412m.m108594g(onCancelListener, "onCancelCLick");
            C77389a aVar = new C77389a();
            aVar.f225660q = context.getString(C0966R.string.f7605l8);
            aVar.f225663t = context.getString(C0966R.string.f7604l7);
            aVar.f225620C = onClickListener;
            aVar.f225664u = context.getString(C0966R.string.f7926wf);
            aVar.f225621D = onClickListener2;
            aVar.f225622E = onCancelListener;
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.setCanceledOnTouchOutside(false);
            gVar.show();
        }
    }
}
