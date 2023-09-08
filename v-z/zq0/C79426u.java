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
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: zq0.u */
public final class C79426u extends RecyclerView.C16613e<C79427a> {

    /* renamed from: d */
    public final Context f232953d;

    /* renamed from: e */
    public ArrayList<PhoneItem> f232954e;

    /* renamed from: zq0.u$a */
    public static final class C79427a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f232955A;

        /* renamed from: B */
        public final TextView f232956B;

        /* renamed from: C */
        public final ImageView f232957C;

        /* renamed from: z */
        public final C79426u f232958z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79427a(C79426u uVar, View view) {
            super(view);
            C87412m.m108594g(uVar, "adapter");
            C87412m.m108594g(view, "view");
            this.f232958z = uVar;
            View findViewById = view.findViewById(C0966R.C0970id.hvf);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.p…anager_dialog_item_phone)");
            this.f232955A = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.hvg);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.p…nager_dialog_item_remark)");
            this.f232956B = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.hvd);
            C87412m.m108593f(findViewById3, "view.findViewById(R.id.p…anager_dialog_item_check)");
            this.f232957C = (ImageView) findViewById3;
        }
    }

    public C79426u(String str, Context context, ArrayList<PhoneItem> arrayList) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(arrayList, "phoneItems");
        this.f232953d = context;
        this.f232954e = arrayList;
    }

    public int getItemCount() {
        return this.f232954e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        boolean z;
        C79427a aVar = (C79427a) zVar;
        C87412m.m108594g(aVar, "holder");
        PhoneItem phoneItem = this.f232954e.get(i);
        C87412m.m108593f(phoneItem, "phoneItems[position]");
        PhoneItem phoneItem2 = phoneItem;
        aVar.f232955A.setText(phoneItem2.f245272e);
        String str = phoneItem2.f245271d;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                z = true;
                break;
            } else if (!Character.isDigit(str.charAt(i3))) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int length2 = phoneItem2.f245271d.length() - 1;
            for (int i4 = 0; i4 < length2; i4++) {
                sb.append(phoneItem2.f245271d.charAt(i4));
                sb.append(' ');
            }
            sb.append(phoneItem2.f245271d.charAt(length2));
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
            aVar.f232955A.setContentDescription(sb4);
        }
        if (phoneItem2.f245278n) {
            aVar.f232956B.setText(aVar.f232958z.f232953d.getString(C0966R.string.a8_));
        } else {
            aVar.f232956B.setText("");
        }
        ImageView imageView = aVar.f232957C;
        if (!phoneItem2.f245279o) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        if (phoneItem2.f245279o) {
            aVar.f232957C.setContentDescription(aVar.f232958z.f232953d.getString(C0966R.string.fxm));
        }
        if (!phoneItem2.f245279o) {
            aVar.f44854d.setOnClickListener(new C79428v(this, phoneItem2));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6433eq, viewGroup, false);
        C87412m.m108593f(inflate, "v");
        return new C79427a(this, inflate);
    }
}
