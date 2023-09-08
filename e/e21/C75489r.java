package e21;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import te3.C49718hk3;

/* renamed from: e21.r */
public class C75489r extends RecyclerView.C16613e<C75491b> implements View.OnClickListener, TextWatcher {

    /* renamed from: d */
    public List<C49718hk3> f221852d;

    /* renamed from: e */
    public boolean f221853e;

    /* renamed from: f */
    public Context f221854f;

    /* renamed from: g */
    public C75490a f221855g;

    /* renamed from: h */
    public TextWatcher f221856h;

    /* renamed from: e21.r$a */
    public interface C75490a {
        /* renamed from: a */
        void mo105819a(View view, int i);
    }

    /* renamed from: e21.r$b */
    public class C75491b extends RecyclerView.C16631z {

        /* renamed from: A */
        public LinearLayout f221857A;

        /* renamed from: B */
        public LinearLayout f221858B;

        /* renamed from: C */
        public TextView f221859C;

        /* renamed from: D */
        public View f221860D;

        /* renamed from: z */
        public LinearLayout f221861z;

        public C75491b(C75489r rVar, View view) {
            super(view);
            this.f221858B = (LinearLayout) view.findViewById(C0966R.C0970id.bhk);
            this.f221861z = (LinearLayout) view.findViewById(C0966R.C0970id.f357733gk3);
            this.f221857A = (LinearLayout) view.findViewById(C0966R.C0970id.g58);
            this.f221859C = (TextView) view.findViewById(C0966R.C0970id.gzh);
            this.f221860D = view.findViewById(C0966R.C0970id.krc);
        }
    }

    public C75489r(Context context, List<C49718hk3> list) {
        this.f221854f = context;
        this.f221852d = list;
    }

    public void afterTextChanged(Editable editable) {
        this.f221856h.afterTextChanged(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f221856h.beforeTextChanged(charSequence, i, i2, i3);
    }

    public int getItemCount() {
        return this.f221853e ? this.f221852d.size() + 1 : this.f221852d.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C75491b bVar = (C75491b) zVar;
        bVar.f44854d.setTag(Integer.valueOf(i));
        if (i == this.f221852d.size()) {
            bVar.f221859C.setText(C0966R.string.lny);
            bVar.f221858B.setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.m9p, new Object[]{this.f221854f.getString(C0966R.string.lny)}));
        } else {
            bVar.f221859C.setText(this.f221852d.get(i).f134707d);
            bVar.f221858B.setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.m9p, new Object[]{this.f221852d.get(i).f134707d}));
        }
        if (i == 0) {
            View view = bVar.f221860D;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bVar.f221857A.setVisibility(4);
        bVar.f221861z.setVisibility(8);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75490a aVar = this.f221855g;
        if (aVar != null) {
            aVar.mo105819a(view, ((Integer) view.getTag()).intValue());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f221854f).inflate(C0966R.C0971layout.at7, viewGroup, false);
        inflate.setOnClickListener(this);
        ((PasterEditText) inflate.findViewById(C0966R.C0970id.g59)).addTextChangedListener(this);
        return new C75491b(this, inflate);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f221856h.onTextChanged(charSequence, i, i2, i3);
    }
}
