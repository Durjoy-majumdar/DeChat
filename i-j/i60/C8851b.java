package i60;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: i60.b */
public final class C8851b extends RecyclerView.C16613e<C8852a> {

    /* renamed from: d */
    public final ArrayList<C8858i> f28101d = new ArrayList<>();

    /* renamed from: i60.b$a */
    public static final class C8852a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f28102A;

        /* renamed from: z */
        public final ImageView f28103z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8852a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.fr6);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…_member_item_avatar_icon)");
            this.f28103z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.fr7);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…_member_item_username_tv)");
            this.f28102A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.fr5);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…states_member_item_arrow)");
            ImageView imageView = (ImageView) findViewById3;
        }
    }

    public int getItemCount() {
        return this.f28101d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C8852a aVar = (C8852a) zVar;
        C87412m.m108594g(aVar, "holder");
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar.f28103z, this.f28101d.get(i).f28111a);
        aVar.f28102A.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(MMApplicationContext.getContext(), RoomLiveService.f157190a.mo76443a(this.f28101d.get(i).f28111a), aVar.f28102A.getTextSize()));
        aVar.f44854d.setOnClickListener(C8853c.f28104d);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.b65, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return new C8852a(inflate);
    }
}
