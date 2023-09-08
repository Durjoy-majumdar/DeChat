package e21;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import xz1.C79013a;
import xz1.C79014b;
import yf0.C79104i;

/* renamed from: e21.a */
public final class C75473a extends RecyclerView.C16613e<C75476c> {

    /* renamed from: d */
    public final Context f221787d;

    /* renamed from: e */
    public List<? extends C79013a> f221788e;

    /* renamed from: f */
    public C75474a f221789f;

    /* renamed from: g */
    public C75475b f221790g;

    /* renamed from: e21.a$a */
    public interface C75474a {
    }

    /* renamed from: e21.a$b */
    public interface C75475b {
    }

    /* renamed from: e21.a$c */
    public static final class C75476c extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f221791A;

        /* renamed from: B */
        public TextView f221792B;

        /* renamed from: C */
        public TextView f221793C;

        /* renamed from: D */
        public TextView f221794D;

        /* renamed from: z */
        public View f221795z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75476c(View view) {
            super(view);
            C87412m.m108594g(view, "root");
            this.f221795z = view;
            View findViewById = view.findViewById(C0966R.C0970id.nng);
            C87412m.m108593f(findViewById, "itemView.findViewById<Vi…oup_solitatire_container)");
            this.f221795z = findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.nnl);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f221791A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.nni);
            C87412m.m108592e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f221792B = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.nnk);
            C87412m.m108592e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f221793C = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.nnj);
            C87412m.m108592e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.f221794D = (TextView) findViewById5;
        }
    }

    public C75473a(Context context) {
        C87412m.m108594g(context, "context");
        this.f221787d = context;
    }

    public int getItemCount() {
        List<? extends C79013a> list = this.f221788e;
        C87412m.m108591d(list);
        return list.size();
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2 = i;
        C75476c cVar = (C75476c) zVar;
        C87412m.m108594g(cVar, "viewHolder");
        List<? extends C79013a> list = this.f221788e;
        if (list != null && i2 >= 0 && i2 < list.size()) {
            List<? extends C79013a> list2 = this.f221788e;
            C87412m.m108591d(list2);
            C79013a aVar = (C79013a) list2.get(i2);
            int b = C76577a.m92151b(this.f221787d, 12);
            int b2 = C76577a.m92151b(this.f221787d, 64);
            ViewGroup.LayoutParams layoutParams = cVar.f221795z.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            List<? extends C79013a> list3 = this.f221788e;
            C87412m.m108591d(list3);
            if (i2 == list3.size() - 1) {
                layoutParams2.bottomMargin = b2;
            } else {
                layoutParams2.bottomMargin = b;
            }
            cVar.f221795z.setLayoutParams(layoutParams2);
            String string = this.f221787d.getString(C0966R.string.eyj, new Object[]{" "});
            C87412m.m108593f(string, "context.getString(com.te…string.fmt_datetime, \" \")");
            C79014b bVar = aVar.f232007N.get(1);
            String str = null;
            Long valueOf = bVar != null ? Long.valueOf(bVar.f232013d * ((long) 1000)) : null;
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                Pattern pattern = C75228t.f221346a;
                str = DateFormat.format(string, longValue).toString();
            }
            View view = cVar.f221795z;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cVar.f221795z.setOnClickListener(new C75477b(this, aVar));
            cVar.f221791A.setText(aVar.f232001H);
            cVar.f221792B.setText(str);
            cVar.f221793C.setText(this.f221787d.getString(C0966R.string.mxe, new Object[]{Integer.valueOf(C79104i.m95663h(aVar).size())}));
            String obj = cVar.f221794D.getText().toString();
            C75228t.m90253j0(cVar.f221794D, obj, 0, obj.length(), new C7092q((C7092q.C7093a) new C75478c(this, aVar), true), this.f221787d);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d0r, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        return new C75476c(inflate);
    }
}
