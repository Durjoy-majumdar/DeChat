package f11;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92977a;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f11.o */
public class C97806o extends RecyclerView.C16631z {

    /* renamed from: L */
    public static final /* synthetic */ int f286905L = 0;

    /* renamed from: A */
    public final ImageView f286906A;

    /* renamed from: B */
    public final MMPinProgressBtn f286907B;

    /* renamed from: C */
    public final TextView f286908C;

    /* renamed from: D */
    public final TextView f286909D;

    /* renamed from: E */
    public final View f286910E;

    /* renamed from: F */
    public final TextView f286911F;

    /* renamed from: G */
    public final ImageView f286912G;

    /* renamed from: H */
    public final CheckBox f286913H;

    /* renamed from: I */
    public final View f286914I;

    /* renamed from: J */
    public final ProgressBar f286915J;

    /* renamed from: K */
    public ImageView f286916K;

    /* renamed from: z */
    public final View f286917z;

    /* renamed from: f11.o$a */
    public class C97807a implements View.OnClickListener {
        public C97807a(C97806o oVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C97792a aVar = (C97792a) view.getTag();
            if (aVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            aVar.mo137127k(view, aVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: f11.o$b */
    public class C97808b implements View.OnClickListener {
        public C97808b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C97792a aVar = (C97792a) view.getTag();
            if (aVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            boolean z = !C97806o.this.f286913H.isChecked();
            if (aVar.mo137125i()) {
                C97806o.this.f286913H.setChecked(z);
                C97806o oVar = C97806o.this;
                C92993j.C92994a aVar2 = ((C92977a) aVar.f286877a).f267796g;
                if (aVar2 != null) {
                    aVar2.mo127394a(z, aVar, oVar);
                }
                if (!z) {
                    C97806o.this.f286912G.setVisibility(0);
                } else {
                    C97806o.this.f286912G.setVisibility(8);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C97806o(View view) {
        super(view);
        this.f286917z = view.findViewById(C0966R.C0970id.br5);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.bv8);
        this.f286906A = imageView;
        this.f286907B = (MMPinProgressBtn) view.findViewById(C0966R.C0970id.c_q);
        this.f286915J = (ProgressBar) view.findViewById(C0966R.C0970id.g3h);
        this.f286910E = view.findViewById(C0966R.C0970id.l7b);
        this.f286911F = (TextView) view.findViewById(C0966R.C0970id.l7o);
        this.f286908C = (TextView) view.findViewById(C0966R.C0970id.f358017d11);
        this.f286909D = (TextView) view.findViewById(C0966R.C0970id.f358019d13);
        this.f286912G = (ImageView) view.findViewById(C0966R.C0970id.got);
        this.f286913H = (CheckBox) view.findViewById(C0966R.C0970id.j9g);
        View findViewById = view.findViewById(C0966R.C0970id.f359152ja1);
        this.f286914I = findViewById;
        this.f286916K = (ImageView) view.findViewById(C0966R.C0970id.ckv);
        imageView.setOnClickListener(new C97807a(this));
        findViewById.setOnClickListener(new C97808b());
    }
}
