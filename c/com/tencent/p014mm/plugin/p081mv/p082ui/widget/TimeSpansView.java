package com.tencent.p014mm.plugin.p081mv.p082ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import y24.C91368a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001d\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR*\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "value", "A1", "J", "getTotalDuration", "()J", "setTotalDuration", "(J)V", "totalDuration", "", "B1", "D", "getWidthPerMills", "()D", "widthPerMills", "C1", "getProgress", "setProgress", "progress", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "b", "c", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.widget.TimeSpansView */
public final class TimeSpansView extends RecyclerView {

    /* renamed from: A1 */
    public long f20054A1;

    /* renamed from: B1 */
    public final double f20055B1;

    /* renamed from: C1 */
    public long f20056C1;

    /* renamed from: y1 */
    public final LinearLayoutManager f20057y1;

    /* renamed from: z1 */
    public double f20058z1 = 5000.0d;

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.TimeSpansView$a */
    public static final class C4918a extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            Log.m105924i("MicroMsg.TimeSpansView", "onScrolled: dx=" + i + ", dy=" + i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.TimeSpansView$b */
    public static final class C4919b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final View f20059A;

        /* renamed from: z */
        public final TextView f20060z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4919b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.kki);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.time)");
            this.f20060z = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.c95);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.dot)");
            this.f20059A = findViewById2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.TimeSpansView$c */
    public final class C4920c extends RecyclerView.C16613e<C4919b> {

        /* renamed from: d */
        public final LayoutInflater f20061d;

        public C4920c() {
            this.f20061d = LayoutInflater.from(TimeSpansView.this.getContext());
        }

        public int getItemCount() {
            return (int) Math.ceil(((double) TimeSpansView.this.getTotalDuration()) / TimeSpansView.this.f20058z1);
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C4919b bVar = (C4919b) zVar;
            C87412m.m108594g(bVar, "holder");
            double d = ((double) i2) * TimeSpansView.this.f20058z1;
            bVar.f20060z.setText(C91368a.m114616a((long) d, d >= 3600000.0d ? "H:mm:ss" : "mm:ss", true));
            if (i2 == getItemCount() - 1) {
                View view = bVar.f20059A;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = bVar.f20059A;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = this.f20061d.inflate(C0966R.C0971layout.bis, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C4919b(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeSpansView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.f20057y1 = linearLayoutManager;
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bis, (ViewGroup) null, false);
        C87412m.m108593f(inflate, "itemView");
        new C4919b(inflate).f20060z.setText("00:00");
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f20055B1 = ((double) inflate.getMeasuredWidth()) / this.f20058z1;
        setAdapter(new C4920c());
        setLayoutManager(linearLayoutManager);
        setClipChildren(false);
        setClipToPadding(false);
        mo17043c(new C4918a());
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final long getProgress() {
        return this.f20056C1;
    }

    public final long getTotalDuration() {
        return this.f20054A1;
    }

    public final double getWidthPerMills() {
        return this.f20055B1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo5864x1(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setProgress(long j) {
        this.f20056C1 = j;
        double d = (double) j;
        double d2 = this.f20058z1;
        int i = (int) (d / d2);
        double d3 = (d - (d2 * ((double) i))) * this.f20055B1;
        LinearLayoutManager linearLayoutManager = this.f20057y1;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(-((int) d3)));
        aVar.mo10233c(Integer.valueOf(i));
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView", "setProgress", "(J)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView", "setProgress", "(J)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    public final void setTotalDuration(long j) {
        this.f20054A1 = j;
        Log.m105924i("MicroMsg.TimeSpansView", "setup duration: " + this.f20054A1);
        mo5864x1(getWidth(), getHeight());
    }

    /* renamed from: x1 */
    public final void mo5864x1(int i, int i2) {
        RecyclerView.C16613e adapter = getAdapter();
        C87412m.m108591d(adapter);
        int i3 = i / 2;
        setPadding(i3, 0, ((int) ((((double) this.f20054A1) - (((double) adapter.getItemCount()) * this.f20058z1)) * this.f20055B1)) + i3, 0);
    }
}
