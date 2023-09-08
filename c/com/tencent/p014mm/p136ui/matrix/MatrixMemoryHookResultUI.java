package com.tencent.p014mm.p136ui.matrix;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hm3.C32955c;
import hm3.C32964i;
import java.util.List;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/ui/matrix/MatrixMemoryHookResultUI;", "Lcom/tencent/mm/ui/matrix/MatrixBaseLeakResultUI;", "<init>", "()V", "a", "b", "plugin-performance_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryHookResultUI */
public final class MatrixMemoryHookResultUI extends MatrixBaseLeakResultUI {

    /* renamed from: g */
    public final C13601g f250208g = C36568h.m40985a(new C85893c(this));

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryHookResultUI$d */
    public static final class C30861d implements Runnable {

        /* renamed from: d */
        public static final C30861d f82889d = new C30861d();

        public final void run() {
            C32955c.f89546d.getClass();
            for (C32964i iVar : C32955c.f89547e) {
                C115669n.INSTANCE.mo160131h(21217, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, MMApplicationContext.getProcessName(), iVar.f89565a, Long.valueOf(iVar.f89566b));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryHookResultUI$a */
    public static final class C85888a extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final List<C32964i> f250209d;

        /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryHookResultUI$a$a */
        public static final class C85889a extends RecyclerView.C16631z {
            public C85889a(View view) {
                super(view);
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.o17);
                if (textView != null && !BuildInfo.DEBUG) {
                    textView.setVisibility(0);
                    textView.setText("build=" + BuildInfo.BUILD_TAG + "\nrev=" + BuildInfo.REV);
                }
            }
        }

        public C85888a(List<C32964i> list) {
            C87412m.m108594g(list, "data");
            this.f250209d = list;
        }

        public int getItemCount() {
            return this.f250209d.size() + 1;
        }

        public int getItemViewType(int i) {
            return i;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            if (i != 0) {
                C32964i iVar = this.f250209d.get(i - 1);
                C85890b bVar = (C85890b) zVar;
                Object value = ((C36570n) bVar.f250211z).getValue();
                C87412m.m108593f(value, "<get-tvSo>(...)");
                ((TextView) value).setText("So: " + iVar.f89565a);
                Object value2 = ((C36570n) bVar.f250210A).getValue();
                C87412m.m108593f(value2, "<get-tvSize>(...)");
                ((TextView) value2).setText("Alloc Size: " + iVar.f89566b + " Byte");
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            if (i == 0) {
                return new C85889a(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d6m, viewGroup, false));
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d6n, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…sult_item, parent, false)");
            return new C85890b(inflate);
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryHookResultUI$b */
    public static final class C85890b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final C13601g f250210A;

        /* renamed from: z */
        public final C13601g f250211z;

        /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryHookResultUI$b$a */
        public static final class C85891a extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f250212d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85891a(View view) {
                super(0);
                this.f250212d = view;
            }

            public Object invoke() {
                return (TextView) this.f250212d.findViewById(C0966R.C0970id.o1a);
            }
        }

        /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryHookResultUI$b$b */
        public static final class C85892b extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f250213d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85892b(View view) {
                super(0);
                this.f250213d = view;
            }

            public Object invoke() {
                return (TextView) this.f250213d.findViewById(C0966R.C0970id.o1_);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85890b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f250211z = C36568h.m40985a(new C85892b(view));
            this.f250210A = C36568h.m40985a(new C85891a(view));
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryHookResultUI$c */
    public static final class C85893c extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ MatrixMemoryHookResultUI f250214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85893c(MatrixMemoryHookResultUI matrixMemoryHookResultUI) {
            super(0);
            this.f250214d = matrixMemoryHookResultUI;
        }

        public Object invoke() {
            return (RecyclerView) this.f250214d.findViewById(C0966R.C0970id.o19);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d6o;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("Native Leak");
        Object value = ((C36570n) this.f250208g).getValue();
        C87412m.m108593f(value, "<get-contentRv>(...)");
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(getContext()));
        Object value2 = ((C36570n) this.f250208g).getValue();
        C87412m.m108593f(value2, "<get-contentRv>(...)");
        C32955c.f89546d.getClass();
        ((RecyclerView) value2).setAdapter(new C85888a(C32955c.f89547e));
        ((C119157j) C119157j.f356862d).mo183884o(C30861d.f82889d);
    }
}
