package com.tencent.p014mm.p136ui.matrix;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hm3.C32961g;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p1046ue.C90650d;
import p910lj.C76701a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C66713a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI;", "Lcom/tencent/mm/ui/matrix/MatrixBaseLeakResultUI;", "<init>", "()V", "a", "b", "plugin-performance_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI */
public final class MatrixOpenGLLeakResultUI extends MatrixBaseLeakResultUI {

    /* renamed from: g */
    public final C13601g f250241g = C36568h.m40985a(new C85916c(this));

    /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$a */
    public static final class C85904a extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final List<C90650d> f250242d;

        /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$a$a */
        public static final class C85905a extends RecyclerView.C16631z {
            public C85905a(View view) {
                super(view);
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.f6209np);
                if (textView != null && !BuildInfo.DEBUG) {
                    textView.setVisibility(0);
                    textView.setText("build=" + BuildInfo.BUILD_TAG + "\nrev=" + BuildInfo.REV);
                }
            }
        }

        public C85904a(List<? extends C90650d> list) {
            C87412m.m108594g(list, "glInfoList");
            this.f250242d = list;
        }

        public int getItemCount() {
            return this.f250242d.size() + 1;
        }

        public int getItemViewType(int i) {
            return i;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            if (i != 0) {
                C90650d dVar = this.f250242d.get(i - 1);
                C85906b bVar = (C85906b) zVar;
                Object value = ((C36570n) bVar.f250250z).getValue();
                C87412m.m108593f(value, "<get-tvUI>(...)");
                ((TextView) value).setText("UI: " + dVar.f260451j.f260663b + '@' + dVar.f260451j.f260662a);
                Object value2 = ((C36570n) bVar.f250243A).getValue();
                C87412m.m108593f(value2, "<get-tvType>(...)");
                ((TextView) value2).setText("Type: " + dVar.f260446e.name());
                Object value3 = ((C36570n) bVar.f250244B).getValue();
                C87412m.m108593f(value3, "<get-tvID>(...)");
                ((TextView) value3).setText("res ID: " + dVar.f260443b);
                TextView y = bVar.mo119807y();
                StringBuilder sb = new StringBuilder();
                sb.append("EGLContext: 0x");
                long j = dVar.f260448g;
                C66713a.m78712a(16);
                String l = Long.toString(j, 16);
                C87412m.m108593f(l, "toString(this, checkRadix(radix))");
                sb.append(l);
                y.setText(sb.toString());
                TextView C = bVar.mo119806C();
                C.setText("ThreadId: " + dVar.f260442a);
                TextView z = bVar.mo119808z();
                z.setText("Java: " + dVar.mo124786a());
                TextView B = bVar.mo119805B();
                B.setText("Native: " + dVar.mo124787b());
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            if (i == 0) {
                return new C85905a(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d59, viewGroup, false));
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d5_, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…sult_item, parent, false)");
            return new C85906b(inflate);
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$b */
    public static final class C85906b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final C13601g f250243A;

        /* renamed from: B */
        public final C13601g f250244B;

        /* renamed from: C */
        public final C13601g f250245C;

        /* renamed from: D */
        public final C13601g f250246D;

        /* renamed from: E */
        public final C13601g f250247E;

        /* renamed from: F */
        public final C13601g f250248F;

        /* renamed from: G */
        public boolean f250249G;

        /* renamed from: z */
        public final C13601g f250250z;

        /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$b$a */
        public static final class C85907a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C85906b f250251d;

            public C85907a(C85906b bVar) {
                this.f250251d = bVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI$ResultViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C85906b bVar = this.f250251d;
                if (bVar.f250249G) {
                    bVar.mo119807y().setVisibility(8);
                    this.f250251d.mo119806C().setVisibility(8);
                    this.f250251d.mo119808z().setVisibility(8);
                    this.f250251d.mo119805B().setVisibility(8);
                } else {
                    bVar.mo119807y().setVisibility(0);
                    this.f250251d.mo119806C().setVisibility(0);
                    this.f250251d.mo119808z().setVisibility(0);
                    this.f250251d.mo119805B().setVisibility(0);
                }
                C85906b bVar2 = this.f250251d;
                bVar2.f250249G = !bVar2.f250249G;
                C117292a.m165361g(this, "com/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI$ResultViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$b$b */
        public static final class C85908b implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ C85906b f250252d;

            public C85908b(C85906b bVar) {
                this.f250252d = bVar;
            }

            public final boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI$ResultViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                StringBuilder sb = new StringBuilder();
                sb.append("UI: ");
                Object value = ((C36570n) this.f250252d.f250250z).getValue();
                C87412m.m108593f(value, "<get-tvUI>(...)");
                sb.append(((TextView) value).getText());
                sb.append("; TYPE: ");
                Object value2 = ((C36570n) this.f250252d.f250243A).getValue();
                C87412m.m108593f(value2, "<get-tvType>(...)");
                sb.append(((TextView) value2).getText());
                sb.append("; ID: ");
                Object value3 = ((C36570n) this.f250252d.f250244B).getValue();
                C87412m.m108593f(value3, "<get-tvID>(...)");
                sb.append(((TextView) value3).getText());
                sb.append("; EglContext: ");
                sb.append(this.f250252d.mo119807y().getText());
                sb.append("; java: ");
                sb.append(this.f250252d.mo119808z().getText());
                sb.append("; native: ");
                sb.append(this.f250252d.mo119805B().getText());
                ClipboardHelper.setText(sb.toString());
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "已复制", 0).show();
                C117292a.m165362h(true, this, "com/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI$ResultViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$b$c */
        public static final class C85909c extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f250253d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85909c(View view) {
                super(0);
                this.f250253d = view;
            }

            public Object invoke() {
                return (TextView) this.f250253d.findViewById(C0966R.C0970id.nxl);
            }
        }

        /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$b$d */
        public static final class C85910d extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f250254d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85910d(View view) {
                super(0);
                this.f250254d = view;
            }

            public Object invoke() {
                return (TextView) this.f250254d.findViewById(C0966R.C0970id.nxo);
            }
        }

        /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$b$e */
        public static final class C85911e extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f250255d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85911e(View view) {
                super(0);
                this.f250255d = view;
            }

            public Object invoke() {
                return (TextView) this.f250255d.findViewById(C0966R.C0970id.nxm);
            }
        }

        /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$b$f */
        public static final class C85912f extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f250256d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85912f(View view) {
                super(0);
                this.f250256d = view;
            }

            public Object invoke() {
                return (TextView) this.f250256d.findViewById(C0966R.C0970id.nxn);
            }
        }

        /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$b$g */
        public static final class C85913g extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f250257d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85913g(View view) {
                super(0);
                this.f250257d = view;
            }

            public Object invoke() {
                return (TextView) this.f250257d.findViewById(C0966R.C0970id.nxp);
            }
        }

        /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$b$h */
        public static final class C85914h extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f250258d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85914h(View view) {
                super(0);
                this.f250258d = view;
            }

            public Object invoke() {
                return (TextView) this.f250258d.findViewById(C0966R.C0970id.nxr);
            }
        }

        /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$b$i */
        public static final class C85915i extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f250259d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85915i(View view) {
                super(0);
                this.f250259d = view;
            }

            public Object invoke() {
                return (TextView) this.f250259d.findViewById(C0966R.C0970id.nxk);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85906b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f250250z = C36568h.m40985a(new C85915i(view));
            this.f250243A = C36568h.m40985a(new C85914h(view));
            this.f250244B = C36568h.m40985a(new C85910d(view));
            this.f250245C = C36568h.m40985a(new C85909c(view));
            this.f250246D = C36568h.m40985a(new C85913g(view));
            this.f250247E = C36568h.m40985a(new C85911e(view));
            this.f250248F = C36568h.m40985a(new C85912f(view));
            mo119807y().setVisibility(8);
            mo119806C().setVisibility(8);
            mo119808z().setVisibility(8);
            mo119805B().setVisibility(8);
            view.setOnClickListener(new C85907a(this));
            view.setOnLongClickListener(new C85908b(this));
        }

        /* renamed from: B */
        public final TextView mo119805B() {
            Object value = this.f250248F.getValue();
            C87412m.m108593f(value, "<get-tvNativeStack>(...)");
            return (TextView) value;
        }

        /* renamed from: C */
        public final TextView mo119806C() {
            Object value = this.f250246D.getValue();
            C87412m.m108593f(value, "<get-tvThreadId>(...)");
            return (TextView) value;
        }

        /* renamed from: y */
        public final TextView mo119807y() {
            Object value = this.f250245C.getValue();
            C87412m.m108593f(value, "<get-tvContext>(...)");
            return (TextView) value;
        }

        /* renamed from: z */
        public final TextView mo119808z() {
            Object value = this.f250247E.getValue();
            C87412m.m108593f(value, "<get-tvJavaStack>(...)");
            return (TextView) value;
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI$c */
    public static final class C85916c extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ MatrixOpenGLLeakResultUI f250260d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85916c(MatrixOpenGLLeakResultUI matrixOpenGLLeakResultUI) {
            super(0);
            this.f250260d = matrixOpenGLLeakResultUI;
        }

        public Object invoke() {
            return (RecyclerView) this.f250260d.findViewById(C0966R.C0970id.nxq);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d5a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("OpenGL Leak");
        C32961g remove = C32961g.f89558g.remove(Integer.valueOf(getIntent().getIntExtra("KEY_COUNTER", 0)));
        Log.m105924i("MicroMsg.MatrixOpenGLLeakResultUI", "helper = " + remove);
        Object value = ((C36570n) this.f250241g).getValue();
        C87412m.m108593f(value, "<get-contentRv>(...)");
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(getContext()));
        if (remove != null) {
            Log.m105924i("MicroMsg.MatrixOpenGLLeakResultUI", "list = " + remove.mo58890d());
            Object value2 = ((C36570n) this.f250241g).getValue();
            C87412m.m108593f(value2, "<get-contentRv>(...)");
            ((RecyclerView) value2).setAdapter(new C85904a(remove.mo58890d()));
        }
    }
}
