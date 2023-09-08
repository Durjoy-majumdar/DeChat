package zq0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: zq0.o */
public final class C91905o extends RecyclerView.C16613e<C91906a> {

    /* renamed from: d */
    public final Context f263148d;

    /* renamed from: e */
    public ArrayList<PhoneItem> f263149e;

    /* renamed from: f */
    public C32226l<? super PhoneItem, C13598b0> f263150f;

    /* renamed from: g */
    public boolean f263151g;

    /* renamed from: zq0.o$a */
    public static final class C91906a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ImageView f263152A;

        /* renamed from: B */
        public final TextView f263153B;

        /* renamed from: C */
        public final TextView f263154C;

        /* renamed from: z */
        public final C91905o f263155z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91906a(C91905o oVar, View view) {
            super(view);
            C87412m.m108594g(oVar, "adapter");
            C87412m.m108594g(view, "view");
            this.f263155z = oVar;
            View findViewById = view.findViewById(C0966R.C0970id.hve);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.p…nager_dialog_item_delete)");
            this.f263152A = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.hvf);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.p…anager_dialog_item_phone)");
            this.f263153B = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.hvg);
            C87412m.m108593f(findViewById3, "view.findViewById(R.id.p…nager_dialog_item_remark)");
            this.f263154C = (TextView) findViewById3;
        }
    }

    public C91905o(Context context, ArrayList<PhoneItem> arrayList, C32226l<? super PhoneItem, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(arrayList, "phoneItems");
        C87412m.m108594g(lVar, "onPhoneItemRemove");
        this.f263148d = context;
        this.f263149e = arrayList;
        this.f263150f = lVar;
    }

    public int getItemCount() {
        return this.f263149e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C91906a aVar = (C91906a) zVar;
        C87412m.m108594g(aVar, "holder");
        PhoneItem phoneItem = this.f263149e.get(i);
        C87412m.m108593f(phoneItem, "phoneItems[position]");
        PhoneItem phoneItem2 = phoneItem;
        aVar.f263153B.setText(phoneItem2.f245272e);
        if (phoneItem2.f245278n) {
            aVar.f263154C.setText(aVar.f263155z.f263148d.getString(C0966R.string.a8_));
        } else {
            aVar.f263154C.setText("");
        }
        if (!aVar.f263155z.f263151g || phoneItem2.f245278n) {
            aVar.f263152A.setVisibility(8);
            return;
        }
        aVar.f263152A.setVisibility(0);
        aVar.f263152A.setOnClickListener(new C91903n(aVar, phoneItem2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6433eq, viewGroup, false);
        C87412m.m108593f(inflate, "v");
        return new C91906a(this, inflate);
    }
}
