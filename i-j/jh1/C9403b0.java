package jh1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7919x;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;

/* renamed from: jh1.b0 */
public final class C9403b0 extends C60896i<C9433z> {

    /* renamed from: e */
    public final String f29354e = "Finder.VoteConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d_d;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        int i3 = i;
        C9433z zVar = (C9433z) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(zVar, "item");
        super.mo44e(oVar, zVar, i, i2, z, list);
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.nkz);
        if (textView != null) {
            textView.setText(zVar.f29458h);
        }
        View D = oVar2.mo85812D(C0966R.C0970id.a8r);
        View D2 = oVar2.mo85812D(C0966R.C0970id.i87);
        View D3 = oVar2.mo85812D(C0966R.C0970id.ja6);
        View D4 = oVar2.mo85812D(C0966R.C0970id.oic);
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.oib);
        D.setBackgroundResource(C0966R.C0969drawable.cq9);
        if (zVar.f29456f) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = D3;
            View view2 = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = D2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(0);
            if (zVar.f29455e) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view4 = D4;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view5 = D4;
                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.aon));
            String valueOf = String.valueOf(zVar.f29454d.f145530g);
            textView2.setText(oVar2.f173499A.getString(C0966R.string.f360611ne1, new Object[]{valueOf}));
            long j = zVar.f29457g;
            if (j > 0) {
                float f = ((float) zVar.f29454d.f145530g) / ((float) j);
                String str = this.f29354e;
                Log.m105924i(str, "item pos:" + i3 + ' ' + zVar.f29458h + ", progress:" + f + ", count:" + zVar.f29454d.f145530g + ", total:" + zVar.f29457g);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view6 = D2;
                C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                oVar2.f44854d.post(new C9402a0(oVar2.f29679z, view2, f, D2, this, i, zVar));
                return;
            }
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view7 = D2;
            C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            String str2 = this.f29354e;
            Log.m105924i(str2, "item pos:" + i3 + ' ' + zVar.f29458h + ", totalCount invalid: " + zVar.f29457g);
            return;
        }
        View view8 = D;
        C9556a aVar7 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar7.mo10233c(8);
        View view9 = D2;
        C117292a.m165358d(view9, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
        C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar8 = new C9556a();
        aVar8.mo10233c(8);
        View view10 = D4;
        C117292a.m165358d(view10, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D4.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
        C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView2.setVisibility(8);
        if (zVar.f29455e) {
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(0);
            View view11 = D3;
            C117292a.m165358d(view11, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setBackgroundResource(C0966R.C0969drawable.cq8);
            textView.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.aoo));
            return;
        }
        C9556a aVar10 = new C9556a();
        aVar10.mo10233c(8);
        View view12 = D3;
        C117292a.m165358d(view12, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D3.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
        C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.aop));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.nkz);
        if (textView != null) {
            C7919x.m8091a(textView);
        }
    }
}
