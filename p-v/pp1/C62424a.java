package pp1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C9507n;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wc1.C15064b;

/* renamed from: pp1.a */
public final class C62424a extends C9507n {

    /* renamed from: A */
    public final C13601g f177395A;

    /* renamed from: B */
    public final C13601g f177396B;

    /* renamed from: pp1.a$a */
    public static final class C62425a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f177397d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62425a(View view) {
            super(0);
            this.f177397d = view;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f177397d.findViewById(C0966R.C0970id.nlw);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: pp1.a$b */
    public static final class C62426b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f177398d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62426b(View view) {
            super(0);
            this.f177398d = view;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f177398d.findViewById(C0966R.C0970id.nlv);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62424a(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f177395A = C36568h.m40985a(new C62426b(view));
        this.f177396B = C36568h.m40985a(new C62425a(view));
    }

    /* renamed from: z */
    public final TextView mo87477z() {
        return (TextView) ((C36570n) this.f177396B).getValue();
    }
}
