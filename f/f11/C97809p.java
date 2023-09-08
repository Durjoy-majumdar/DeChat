package f11;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92977a;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f11.p */
public class C97809p extends RecyclerView.C16631z {

    /* renamed from: M */
    public static final /* synthetic */ int f286919M = 0;

    /* renamed from: A */
    public final ImageView f286920A;

    /* renamed from: B */
    public final TextView f286921B;

    /* renamed from: C */
    public final TextView f286922C;

    /* renamed from: D */
    public final CheckBox f286923D;

    /* renamed from: E */
    public final View f286924E;

    /* renamed from: F */
    public final ImageView f286925F;

    /* renamed from: G */
    public final ImageView f286926G;

    /* renamed from: H */
    public final TextView f286927H;

    /* renamed from: I */
    public final TextView f286928I;

    /* renamed from: J */
    public final ProgressBar f286929J;

    /* renamed from: K */
    public final MMPinProgressBtn f286930K;

    /* renamed from: L */
    public final View f286931L;

    /* renamed from: z */
    public final LinearLayout f286932z;

    /* renamed from: f11.p$a */
    public class C97810a implements View.OnClickListener {
        public C97810a(C97809p pVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C97792a aVar = (C97792a) view.getTag();
            if (aVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            aVar.mo137127k(view, aVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: f11.p$b */
    public class C97811b implements View.OnClickListener {
        public C97811b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C97792a aVar = (C97792a) view.getTag();
            if (aVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            boolean z = !C97809p.this.f286923D.isChecked();
            if (aVar.mo137125i()) {
                C97809p.this.f286923D.setChecked(z);
                C97809p pVar = C97809p.this;
                C92993j.C92994a aVar2 = ((C92977a) aVar.f286877a).f267796g;
                if (aVar2 != null) {
                    aVar2.mo127394a(z, aVar, pVar);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C97809p(View view) {
        super(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.br5);
        this.f286932z = linearLayout;
        this.f286920A = (ImageView) view.findViewById(C0966R.C0970id.a27);
        this.f286921B = (TextView) view.findViewById(C0966R.C0970id.h_d);
        this.f286922C = (TextView) view.findViewById(C0966R.C0970id.kky);
        this.f286923D = (CheckBox) view.findViewById(C0966R.C0970id.j9g);
        View findViewById = view.findViewById(C0966R.C0970id.j9z);
        this.f286924E = findViewById;
        this.f286925F = (ImageView) view.findViewById(C0966R.C0970id.ckv);
        this.f286926G = (ImageView) view.findViewById(C0966R.C0970id.f2a);
        this.f286927H = (TextView) view.findViewById(C0966R.C0970id.kpm);
        this.f286928I = (TextView) view.findViewById(C0966R.C0970id.f357858c42);
        this.f286930K = (MMPinProgressBtn) view.findViewById(C0966R.C0970id.c_q);
        this.f286929J = (ProgressBar) view.findViewById(C0966R.C0970id.g3h);
        this.f286931L = view.findViewById(C0966R.C0970id.c7p);
        linearLayout.setOnClickListener(new C97810a(this));
        findViewById.setOnClickListener(new C97811b());
    }
}
