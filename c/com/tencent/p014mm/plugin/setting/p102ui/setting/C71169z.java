package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p645pj.C77094g;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.z */
public final class C71169z extends RecyclerView.C16631z implements View.OnClickListener {

    /* renamed from: A */
    public TextView f205971A;

    /* renamed from: B */
    public ImageView f205972B;

    /* renamed from: C */
    public C77094g f205973C;

    /* renamed from: z */
    public final C71170a f205974z;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.z$a */
    public interface C71170a {
        /* renamed from: Y0 */
        boolean mo97708Y0(C77094g gVar);

        void notifyDataSetChanged();

        /* renamed from: y7 */
        void mo97710y7(C77094g gVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71169z(View view, C71170a aVar) {
        super(view);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "iRingtoneChooseCallback");
        this.f205974z = aVar;
        View findViewById = view.findViewById(C0966R.C0970id.fc5);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.item_tv)");
        this.f205971A = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.k0t);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.state_icon)");
        this.f205972B = (ImageView) findViewById2;
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/RingtoneViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        StringBuilder sb = new StringBuilder();
        sb.append("onClick ");
        C77094g gVar = this.f205973C;
        String str = null;
        sb.append(gVar != null ? Integer.valueOf(gVar.f225189a) : null);
        sb.append(", ");
        C77094g gVar2 = this.f205973C;
        if (gVar2 != null) {
            str = gVar2.f225190b;
        }
        sb.append(str);
        Log.m105924i("MicroMsg.SettingMessageRingtoneUI", sb.toString());
        C77094g gVar3 = this.f205973C;
        if (gVar3 != null) {
            this.f205974z.mo97710y7(gVar3);
        }
        this.f205974z.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/RingtoneViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
