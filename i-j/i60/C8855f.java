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
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p196ln.C76705f;
import p629ny.C76979h;
import rx3.C13598b0;

/* renamed from: i60.f */
public final class C8855f extends RecyclerView.C16613e<C8856a> {

    /* renamed from: d */
    public final ArrayList<C8858i> f28106d = new ArrayList<>();

    /* renamed from: e */
    public C32226l<? super View, C13598b0> f28107e;

    /* renamed from: i60.f$a */
    public static final class C8856a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f28108A;

        /* renamed from: z */
        public final ImageView f28109z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8856a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.fvh);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…_member_item_avatar_icon)");
            this.f28109z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.fvk);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…_member_item_username_tv)");
            this.f28108A = (TextView) findViewById2;
        }
    }

    /* renamed from: i60.f$b */
    public static final class C8857b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l f28110d;

        public C8857b(C32226l lVar) {
            this.f28110d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/view/adapter/LiveMemberAdapter$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f28110d.invoke(view);
            C117292a.m165361g(this, "com/tencent/mm/live/view/adapter/LiveMemberAdapter$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getItemCount() {
        return this.f28106d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C8856a aVar = (C8856a) zVar;
        C87412m.m108594g(aVar, "holder");
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar.f28109z, this.f28106d.get(i).f28111a);
        aVar.f28108A.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(MMApplicationContext.getContext(), RoomLiveService.f157190a.mo76443a(this.f28106d.get(i).f28111a), aVar.f28108A.getTextSize()));
        aVar.f44854d.setTag(this.f28106d.get(i).f28111a);
        View view = aVar.f44854d;
        C32226l<? super View, C13598b0> lVar = this.f28107e;
        view.setOnClickListener(lVar != null ? new C8857b(lVar) : null);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.b6z, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C8856a(inflate);
    }
}
