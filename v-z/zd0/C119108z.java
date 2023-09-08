package zd0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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

/* renamed from: zd0.z */
public final class C119108z extends C119100f<C119109a> {

    /* renamed from: f */
    public final Context f356671f;

    /* renamed from: g */
    public final C119110b f356672g;

    /* renamed from: zd0.z$a */
    public static final class C119109a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f356673A;

        /* renamed from: B */
        public View f356674B;

        /* renamed from: z */
        public TextView f356675z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C119109a(View view) {
            super(view);
            C87412m.m108594g(view, "view");
            this.f356675z = (TextView) view.findViewById(C0966R.C0970id.k_7);
            this.f356673A = (TextView) view.findViewById(C0966R.C0970id.f359289k14);
            this.f356674B = view.findViewById(C0966R.C0970id.krm);
        }
    }

    /* renamed from: zd0.z$b */
    public interface C119110b {
        /* renamed from: a */
        boolean mo35840a(SubscribeMsgTmpItem subscribeMsgTmpItem);

        /* renamed from: b */
        void mo35841b(SubscribeMsgTmpItem subscribeMsgTmpItem, int i);
    }

    public C119108z(Context context, C119110b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f356671f = context;
        this.f356672g = bVar;
    }

    public int getItemCount() {
        return this.f356655d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C119109a aVar = (C119109a) zVar;
        C87412m.m108594g(aVar, "holder");
        SubscribeMsgTmpItem subscribeMsgTmpItem = (i < 0 || i >= this.f356655d.size()) ? null : this.f356655d.get(i);
        if (subscribeMsgTmpItem != null) {
            Log.m105925i("Mp.SubscribeMsgListAdapter", "alvinluo onBindViewHolder item: %s", subscribeMsgTmpItem.toString());
            View view = aVar.f356674B;
            int i2 = i == 0 ? 8 : 0;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i2));
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgSecondaryMenuListAdapter", "filling", "(Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgSecondaryMenuListAdapter$SubscribeMsgListItemViewHolder;Lcom/tencent/mm/msgsubscription/SubscribeMsgTmpItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/msgsubscription/ui/SubscribeMsgSecondaryMenuListAdapter", "filling", "(Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgSecondaryMenuListAdapter$SubscribeMsgListItemViewHolder;Lcom/tencent/mm/msgsubscription/SubscribeMsgTmpItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            aVar.f356675z.setText(subscribeMsgTmpItem.f49020e);
            aVar.f356673A.setText(this.f356672g.mo35840a(subscribeMsgTmpItem) ? (!subscribeMsgTmpItem.f49032t || !subscribeMsgTmpItem.f49033u) ? (!subscribeMsgTmpItem.f49035w || !subscribeMsgTmpItem.f49036x) ? this.f356671f.getString(C0966R.string.ao_) : this.f356671f.getString(C0966R.string.f360185ao0) : this.f356671f.getString(C0966R.string.aoa) : this.f356671f.getString(C0966R.string.aob));
            aVar.f44854d.setOnClickListener(new C119097a0(this, subscribeMsgTmpItem, i));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(this.f356671f).inflate(C0966R.C0971layout.c7r, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        return new C119109a(inflate);
    }
}
