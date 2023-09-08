package rl1;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58739j4;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61937h;
import ok1.C11463m;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C48659a31;
import te3.C50334m01;
import te3.C51483u21;

/* renamed from: rl1.k */
public final class C13044k extends RecyclerView.C16613e<C13045a> {

    /* renamed from: d */
    public ArrayList<C48659a31> f37153d = new ArrayList<>();

    /* renamed from: e */
    public C32227p<? super C48659a31, ? super Integer, C13598b0> f37154e;

    /* renamed from: f */
    public C32228q<? super C48659a31, ? super View, ? super Integer, C13598b0> f37155f;

    /* renamed from: rl1.k$a */
    public final class C13045a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f37156A;

        /* renamed from: B */
        public final TextView f37157B;

        /* renamed from: C */
        public final TextView f37158C;

        /* renamed from: D */
        public final TextView f37159D;

        /* renamed from: z */
        public final TextView f37160z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13045a(C13044k kVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.g7f);
            this.f37160z = textView;
            this.f37156A = (TextView) view.findViewById(C0966R.C0970id.lqc);
            this.f37157B = (TextView) view.findViewById(C0966R.C0970id.nal);
            this.f37158C = (TextView) view.findViewById(C0966R.C0970id.f358644nb2);
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.f358642nb1);
            this.f37159D = textView2;
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        }
    }

    /* renamed from: rl1.k$b */
    public static final class C13046b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13044k f37161d;

        /* renamed from: e */
        public final /* synthetic */ C48659a31 f37162e;

        /* renamed from: f */
        public final /* synthetic */ int f37163f;

        public C13046b(C13044k kVar, C48659a31 a312, int i) {
            this.f37161d = kVar;
            this.f37162e = a312;
            this.f37163f = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C58739j4.f168176a.mo83683L()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C32227p<? super C48659a31, ? super Integer, C13598b0> pVar = this.f37161d.f37154e;
            if (pVar != null) {
                pVar.invoke(this.f37162e, Integer.valueOf(this.f37163f));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rl1.k$c */
    public static final class C13047c implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13044k f37164d;

        /* renamed from: e */
        public final /* synthetic */ C48659a31 f37165e;

        /* renamed from: f */
        public final /* synthetic */ int f37166f;

        public C13047c(C13044k kVar, C48659a31 a312, int i) {
            this.f37164d = kVar;
            this.f37165e = a312;
            this.f37166f = i;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C32228q<? super C48659a31, ? super View, ? super Integer, C13598b0> qVar = this.f37164d.f37155f;
            if (qVar != null) {
                C48659a31 a312 = this.f37165e;
                C87412m.m108593f(view, LocaleUtil.ITALIAN);
                qVar.invoke(a312, view, Integer.valueOf(this.f37166f));
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: F4 */
    public void onBindViewHolder(C13045a aVar, int i) {
        C87412m.m108594g(aVar, "holder");
        C48659a31 a312 = this.f37153d.get(i);
        C87412m.m108593f(a312, "dataList[position]");
        C48659a31 a313 = a312;
        Log.m105924i("FinderLiveLotteryPanelListAdapter", "LotteryPanelItem " + C61937h.m72709h(a313));
        aVar.f37160z.setText(a313.f130269f);
        aVar.f37156A.setText(aVar.f44854d.getContext().getResources().getString(C0966R.string.mnt, new Object[]{Integer.valueOf(a313.f130271h)}));
        aVar.f37157B.setText(aVar.f44854d.getContext().getResources().getString(C0966R.string.mnr, new Object[]{Integer.valueOf(a313.f130268e / 60)}));
        TextView textView = aVar.f37158C;
        Resources resources = aVar.f44854d.getContext().getResources();
        Object[] objArr = new Object[1];
        C51483u21 u212 = a313.f130270g;
        objArr[0] = Util.nullAsNil(u212 != null ? u212.f142565f : null);
        textView.setText(resources.getString(C0966R.string.mns, objArr));
        TextView textView2 = aVar.f37159D;
        C87412m.m108593f(textView2, "holder.status");
        int i2 = a313.f130274n;
        String str = a313.f130275o;
        if (str == null) {
            str = "";
        }
        mo12551G4(textView2, i2, str);
        aVar.f37159D.setOnClickListener(new C13046b(this, a313, i));
        aVar.f44854d.setOnLongClickListener(new C13047c(this, a313, i));
    }

    /* renamed from: G4 */
    public final void mo12551G4(TextView textView, int i, String str) {
        Log.m105924i("FinderLiveLotteryPanelListAdapter", "setStatusBtn status:" + i + ",statusWording:" + str + '!');
        if (str == null || str.length() == 0) {
            textView.setText(textView.getContext().getResources().getString(C0966R.string.f8094v));
            textView.setEnabled(false);
        } else if (i == 0) {
            textView.setText(str);
            textView.setEnabled(true);
        } else if (i == 1) {
            textView.setText(str);
            textView.setEnabled(false);
        } else if (i == 2) {
            textView.setText(str);
            textView.setEnabled(true);
        }
    }

    /* renamed from: O4 */
    public final void mo12552O4(RecyclerView recyclerView, C50334m01 m012) {
        C87412m.m108594g(recyclerView, "rv");
        C87412m.m108594g(m012, "resp");
        LinkedList<C48659a31> linkedList = m012.f137739d;
        this.f37153d.clear();
        boolean z = true;
        if (!(linkedList == null || linkedList.isEmpty())) {
            this.f37153d.addAll(linkedList);
        }
        Iterator<C48659a31> it = this.f37153d.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().f130267d == m012.f137740e) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= getItemCount()) {
            z = false;
        }
        if (z) {
            C62042e.f176370a.getClass();
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C11463m(recyclerView, i, 0));
        } else {
            Log.m105924i("FinderLiveLotteryPanelListAdapter", "updateLotteryList locationPos:" + i + ",location_id:" + m012.f137740e + ", itemCount:" + getItemCount() + ',');
        }
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f37153d.size();
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cyc, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…list_item, parent, false)");
        return new C13045a(this, inflate);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C13045a aVar = (C13045a) zVar;
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(aVar, i);
            return;
        }
        for (Object next : list) {
            if ((next instanceof Integer) && C87412m.m108589b(next, 1)) {
                TextView textView = aVar.f37159D;
                C87412m.m108593f(textView, "holder.status");
                int i2 = this.f37153d.get(i).f130274n;
                String nullAsNil = Util.nullAsNil(this.f37153d.get(i).f130275o);
                C87412m.m108593f(nullAsNil, "nullAsNil(dataList[position].status_wording)");
                mo12551G4(textView, i2, nullAsNil);
            }
        }
    }
}
