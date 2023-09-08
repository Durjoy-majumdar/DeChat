package p171il;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p813fl.C97891b0;

/* renamed from: il.a */
public final class C98701a extends C98748z<C97891b0> {

    /* renamed from: B */
    public final View f289440B;

    /* renamed from: il.a$a */
    public static final class C98702a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C98701a f289441d;

        public C98702a(C98701a aVar) {
            this.f289441d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/panel/adapter/CaptureEmptyViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C98744t tVar = this.f289441d.f289540z;
            if (tVar != null) {
                Context context = view.getContext();
                C87412m.m108593f(context, "it.context");
                tVar.mo127711c(view, context, this.f289441d.mo17363j(), this.f289441d.f289539A);
            }
            C117292a.m165361g(this, "com/tencent/mm/emoji/panel/adapter/CaptureEmptyViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98701a(View view, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.ar4);
        this.f289440B = findViewById;
        view.setOnClickListener((View.OnClickListener) null);
        findViewById.setOnClickListener(new C98702a(this));
        findViewById.setContentDescription(findViewById.getContext().getString(C0966R.string.av6));
    }
}
