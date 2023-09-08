package av2;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: av2.o */
public final class C54355o extends RecyclerView.C16631z {

    /* renamed from: A */
    public final C13601g f152522A;

    /* renamed from: z */
    public final C13601g f152523z;

    /* renamed from: av2.o$a */
    public static final class C54356a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f152524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54356a(View view) {
            super(0);
            this.f152524d = view;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder$nameText$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder$nameText$2");
            TextView textView = (TextView) this.f152524d.findViewById(C0966R.C0970id.fbd);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder$nameText$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder$nameText$2");
            return textView;
        }
    }

    /* renamed from: av2.o$b */
    public static final class C54357b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f152525d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54357b(View view) {
            super(0);
            this.f152525d = view;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder$numText$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder$numText$2");
            TextView textView = (TextView) this.f152525d.findViewById(C0966R.C0970id.nnp);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder$numText$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder$numText$2");
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54355o(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f152523z = C36568h.m40985a(new C54356a(view));
        this.f152522A = C36568h.m40985a(new C54357b(view));
    }
}
