package y90;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C63299j0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: y90.h */
public final class C66581h extends C63299j0 {

    /* renamed from: d */
    public final C13601g f191471d = C36568h.m40985a(new C66582a(this));

    /* renamed from: e */
    public final C13601g f191472e = C36568h.m40985a(new C66583b(this));

    /* renamed from: y90.h$a */
    public static final class C66582a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C66581h f191473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66582a(C66581h hVar) {
            super(0);
            this.f191473d = hVar;
        }

        public Object invoke() {
            return C85868k2.m106137b(this.f191473d.getContext()).inflate(C0966R.C0971layout.f359894ck1, (ViewGroup) null);
        }
    }

    /* renamed from: y90.h$b */
    public static final class C66583b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C66581h f191474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66583b(C66581h hVar) {
            super(0);
            this.f191474d = hVar;
        }

        public Object invoke() {
            return (TextView) ((View) ((C36570n) this.f191474d.f191471d).getValue()).findViewById(C0966R.C0970id.gvj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66581h(Context context) {
        super(context, C0966R.style.a66);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo90633a(String str) {
        C87412m.m108594g(str, "msg");
        ((TextView) ((C36570n) this.f191472e).getValue()).setText(str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        setContentView((View) ((C36570n) this.f191471d).getValue(), new ViewGroup.LayoutParams(-1, -1));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
