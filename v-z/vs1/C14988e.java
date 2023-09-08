package vs1;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vs1.C14974a;

/* renamed from: vs1.e */
public final class C14988e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f41084d;

    /* renamed from: e */
    public final /* synthetic */ C14974a f41085e;

    /* renamed from: f */
    public final /* synthetic */ ConstraintLayout f41086f;

    /* renamed from: g */
    public final /* synthetic */ TextView f41087g;

    public C14988e(int i, C14974a aVar, ConstraintLayout constraintLayout, TextView textView) {
        this.f41084d = i;
        this.f41085e = aVar;
        this.f41086f = constraintLayout;
        this.f41087g = textView;
    }

    public final void onClick(View view) {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteAddViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f41084d == this.f41085e.f41037e.size() - 1) {
            this.f41085e.f41037e.get(this.f41084d).f41058c = 2;
            C14974a.C14979e eVar = this.f41085e.f41037e.get(this.f41084d);
            eVar.getClass();
            eVar.f41056a = "";
            C14974a aVar = this.f41085e;
            int i = this.f41084d;
            aVar.f41045p = i;
            aVar.notifyItemChanged(i);
            int i2 = this.f41084d;
            C14974a aVar2 = this.f41085e;
            if (i2 < aVar2.f41038f) {
                List<C14974a.C14979e> list = aVar2.f41037e;
                C87412m.m108593f(list, "dataList");
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((C14974a.C14979e) it.next()).f41058c == 1) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteAddViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                this.f41085e.f41037e.add(new C14974a.C14979e("", new C14974a.C14980f(false, 0, (String) null, 7, (C8480h) null), 1));
                C14974a aVar3 = this.f41085e;
                aVar3.notifyItemInserted(aVar3.getItemCount());
                C14974a aVar4 = this.f41085e;
                aVar4.notifyItemChanged(aVar4.getItemCount());
                this.f41086f.setVisibility(0);
                this.f41087g.setVisibility(8);
            } else {
                this.f41086f.setVisibility(4);
                this.f41087g.setVisibility(0);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteAddViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
