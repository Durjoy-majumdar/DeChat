package qj3;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import junit.framework.Assert;
import qj3.C47856a;

/* renamed from: qj3.b */
public abstract class C47859b extends BaseAdapter implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener {

    /* renamed from: d */
    public SparseArray<C47856a> f128458d;

    /* renamed from: e */
    public Context f128459e;

    /* renamed from: f */
    public Runnable f128460f;

    /* renamed from: qj3.b$a */
    public class C47860a implements Runnable {
        public C47860a() {
        }

        public void run() {
            C47859b.this.notifyDataSetChanged();
        }
    }

    public C47859b(Context context) {
        if (context != null) {
            this.f128459e = context;
            this.f128458d = new SparseArray<>();
            this.f128460f = new C47860a();
            return;
        }
        throw new NullPointerException("context is null.");
    }

    /* renamed from: a */
    public abstract Object[] mo63559a(int i);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: gx0.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: hx0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: gx0.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: hx0.a} */
    /* JADX WARNING: type inference failed for: r0v6, types: [gx0.p] */
    /* JADX WARNING: type inference failed for: r0v7, types: [gx0.p] */
    /* JADX WARNING: type inference failed for: r0v8, types: [gx0.p] */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.tencent.mm.plugin.brandservice.ui.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00da, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj3.C47856a getItem(int r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            if (r15 < 0) goto L_0x00e1
            int r2 = r14.getCount()
            if (r15 <= r2) goto L_0x000c
            goto L_0x00e1
        L_0x000c:
            android.util.SparseArray<qj3.a> r2 = r14.f128458d
            java.lang.Object r2 = r2.get(r15)
            qj3.a r2 = (qj3.C47856a) r2
            if (r2 != 0) goto L_0x00e0
            r2 = r14
            com.tencent.mm.plugin.brandservice.ui.c r2 = (com.tencent.p014mm.plugin.brandservice.p028ui.C40658c) r2
            r3 = 0
            r4 = 0
        L_0x001b:
            java.util.List<com.tencent.mm.plugin.brandservice.ui.c$a> r5 = r2.f109229g
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x00d5
            java.util.List<com.tencent.mm.plugin.brandservice.ui.c$a> r5 = r2.f109229g
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r3)
            com.tencent.mm.plugin.brandservice.ui.c$a r5 = (com.tencent.p014mm.plugin.brandservice.p028ui.C40658c.C40659a) r5
            int r6 = r2.mo63569l(r5)
            int r4 = r4 + r6
            boolean r7 = r5.f109244f
            if (r7 == 0) goto L_0x005d
            int r6 = r4 - r6
            if (r15 != r6) goto L_0x005d
            java.util.List<te3.lk> r6 = r5.f109246h
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0048
            r5 = r0
            goto L_0x0052
        L_0x0048:
            java.util.List<te3.lk> r5 = r5.f109246h
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            java.lang.Object r5 = r5.get(r1)
            te3.lk r5 = (te3.C50274lk) r5
        L_0x0052:
            if (r5 == 0) goto L_0x00d1
            java.lang.String r0 = r5.f137470f
            gx0.g r1 = new gx0.g
            r1.<init>(r0)
            goto L_0x00da
        L_0x005d:
            boolean r6 = r5.f109245g
            if (r6 == 0) goto L_0x0074
            int r7 = r4 + -1
            if (r15 != r7) goto L_0x0074
            r9 = 0
            long r10 = r5.f109239a
            int r12 = r5.f109240b
            java.lang.String r13 = r2.f109232j
            gx0.m r0 = new gx0.m
            r8 = r0
            r8.<init>(r9, r10, r12, r13)
        L_0x0072:
            r2 = r0
            goto L_0x00db
        L_0x0074:
            if (r15 >= r4) goto L_0x00d1
            int r1 = r15 - r4
            int r3 = r5.f109240b
            int r1 = r1 + r3
            int r1 = r1 + r6
            java.util.List<te3.sk> r3 = r5.f109243e
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            java.lang.Object r3 = r3.get(r1)
            te3.sk r3 = (te3.C51256sk) r3
            long r4 = r5.f109239a
            com.tencent.mm.plugin.brandservice.ui.c$b r2 = r2.f109238s
            java.lang.String r6 = "MicroMsg.BrandService.BizSearchResultAdapter"
            if (r3 != 0) goto L_0x0094
            java.lang.String r1 = "data is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            goto L_0x0072
        L_0x0094:
            r7 = 1
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "Create a BizContactDataItem."
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r6, r0)
            com.tencent.mm.plugin.brandservice.ui.a r0 = new com.tencent.mm.plugin.brandservice.ui.a
            r0.<init>(r3)
            goto L_0x00c3
        L_0x00a5:
            r6 = 4
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00b1
            gx0.p r0 = new gx0.p
            r0.<init>(r3)
            goto L_0x00c3
        L_0x00b1:
            r6 = 1073741824(0x40000000, double:5.304989477E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00be
            gx0.p r0 = new gx0.p
            r0.<init>(r3)
            goto L_0x00c3
        L_0x00be:
            gx0.p r0 = new gx0.p
            r0.<init>(r3)
        L_0x00c3:
            boolean r3 = r0 instanceof hx0.C46126a
            if (r3 == 0) goto L_0x0072
            r3 = r0
            hx0.a r3 = (hx0.C46126a) r3
            r3.f124288f = r1
            r3.f124287e = r15
            r3.f124289g = r2
            goto L_0x0072
        L_0x00d1:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x00d5:
            gx0.p r1 = new gx0.p
            r1.<init>(r0)
        L_0x00da:
            r2 = r1
        L_0x00db:
            android.util.SparseArray<qj3.a> r0 = r14.f128458d
            r0.put(r15, r2)
        L_0x00e0:
            return r2
        L_0x00e1:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r2[r1] = r15
            java.lang.String r15 = "MicroMsg.BaseMutilDataItemAdapter"
            java.lang.String r1 = "The given position(%d) is illegal."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj3.C47859b.getItem(int):qj3.a");
    }

    public abstract int getCount();

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        if (getItem(i) == null) {
            Log.m105919d("MicroMsg.BaseMutilDataItemAdapter", "getItemViewType: get data item fail, return unkown Type, totalCount(%d) , position(%d)", Integer.valueOf(getCount()), Integer.valueOf(i));
            return 0;
        } else if (getItem(i) == null) {
            return 0;
        } else {
            return getItem(i).f128455a;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C47856a.C47857a aVar;
        long currentTimeMillis = System.currentTimeMillis();
        C47856a b = getItem(i);
        if (b == null) {
            Log.m105920e("MicroMsg.BaseMutilDataItemAdapter", "DataItem is null.");
            return view;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        C47856a.C47858b c = b.mo63541c();
        if (c == null) {
            Log.m105920e("MicroMsg.BaseMutilDataItemAdapter", "ViewItem is null.");
            return view;
        }
        if (view == null) {
            view = c.mo63544c(this.f128459e, viewGroup, view);
            aVar = b.mo63540b();
            c.mo63542a(view, aVar);
            view.setTag(aVar);
        } else {
            aVar = (C47856a.C47857a) view.getTag();
        }
        Object[] a = mo63559a(i);
        Assert.assertNotNull(aVar);
        if (!b.mo72586d()) {
            b.mo63539a(this.f128459e, aVar, a);
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        c.mo63543b(this.f128459e, aVar, b, a);
        Log.m105919d("MicroMsg.BaseMutilDataItemAdapter", "position %d, getItem %d, inflate %d, filling data %d", Integer.valueOf(i), Long.valueOf(currentTimeMillis2 - currentTimeMillis), Long.valueOf(currentTimeMillis3 - currentTimeMillis2), Long.valueOf(System.currentTimeMillis() - currentTimeMillis3));
        return view;
    }

    public int getViewTypeCount() {
        return 7;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/sortview/BaseMultiDataItemAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C47856a b = getItem(i);
        if (b == null) {
            C117292a.m165361g(this, "com/tencent/mm/ui/base/sortview/BaseMultiDataItemAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        C47856a.C47858b c = b.mo63541c();
        if (c == null) {
            C117292a.m165361g(this, "com/tencent/mm/ui/base/sortview/BaseMultiDataItemAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else if (c.mo63545d(this.f128459e, view, b, mo63559a(i))) {
            C117292a.m165361g(this, "com/tencent/mm/ui/base/sortview/BaseMultiDataItemAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            C117292a.m165361g(this, "com/tencent/mm/ui/base/sortview/BaseMultiDataItemAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
