package zd0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import zd0.C119100f;

/* renamed from: zd0.m */
public final class C119102m extends C119100f<C119103a> {

    /* renamed from: f */
    public final Context f356657f;

    /* renamed from: g */
    public final C119100f.C119101a f356658g;

    /* renamed from: zd0.m$a */
    public static final class C119103a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f356659A;

        /* renamed from: B */
        public ImageView f356660B;

        /* renamed from: C */
        public View f356661C;

        /* renamed from: z */
        public CheckBox f356662z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C119103a(View view) {
            super(view);
            C87412m.m108594g(view, "view");
            this.f356662z = (CheckBox) view.findViewById(C0966R.C0970id.bab);
            this.f356659A = (TextView) view.findViewById(C0966R.C0970id.k_7);
            this.f356660B = (ImageView) view.findViewById(C0966R.C0970id.k_2);
            this.f356661C = view.findViewById(C0966R.C0970id.krm);
        }
    }

    public C119102m(Context context, C119100f.C119101a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f356657f = context;
        this.f356658g = aVar;
    }

    public int getItemCount() {
        return this.f356655d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C119103a aVar = (C119103a) zVar;
        C87412m.m108594g(aVar, "holder");
        SubscribeMsgTmpItem subscribeMsgTmpItem = (i < 0 || i >= this.f356655d.size()) ? null : this.f356655d.get(i);
        if (subscribeMsgTmpItem != null) {
            Log.m105925i("Mp.SubscribeMsgListAdapter", "alvinluo onBindViewHolder item: %s", subscribeMsgTmpItem.toString());
            View view = aVar.f356661C;
            int i2 = i == 0 ? 8 : 0;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i2));
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter", "filling", "(Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter$SubscribeMsgListItemViewHolder;Lcom/tencent/mm/msgsubscription/SubscribeMsgTmpItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter", "filling", "(Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter$SubscribeMsgListItemViewHolder;Lcom/tencent/mm/msgsubscription/SubscribeMsgTmpItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            aVar.f356659A.setText(subscribeMsgTmpItem.f49020e);
            aVar.f356662z.setChecked(this.f356658g.mo35621b(subscribeMsgTmpItem));
            aVar.f44854d.setOnClickListener(new C119105o(aVar, this, subscribeMsgTmpItem));
            aVar.f356660B.setOnClickListener(new C119104n(this, subscribeMsgTmpItem));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(this.f356657f).inflate(C0966R.C0971layout.c7p, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        return new C119103a(inflate);
    }
}
