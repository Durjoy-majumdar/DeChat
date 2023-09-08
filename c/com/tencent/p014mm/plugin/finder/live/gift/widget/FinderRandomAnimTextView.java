package com.tencent.p014mm.plugin.finder.live.gift.widget;

import a14.C0000n0;
import a14.C53851a;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zh1.C66818c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderRandomAnimTextView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "", "dataList", "Lrx3/b0;", "setDataList", "", "textSize", "setTextSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView */
public final class FinderRandomAnimTextView extends RecyclerView {

    /* renamed from: A1 */
    public final C0000n0 f159300A1 = C53930o0.m60555b();

    /* renamed from: B1 */
    public C53973z1 f159301B1;

    /* renamed from: C1 */
    public float f159302C1 = 17.0f;

    /* renamed from: y1 */
    public final LinkedList<String> f159303y1;

    /* renamed from: z1 */
    public final C55905a f159304z1;

    /* renamed from: com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView$a */
    public final class C55905a extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final List<String> f159305d;

        /* renamed from: e */
        public final /* synthetic */ FinderRandomAnimTextView f159306e;

        /* renamed from: com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView$a$a */
        public static final class C55906a extends RecyclerView.C16631z {
            public C55906a(FinderLiveGiftTextView finderLiveGiftTextView) {
                super(finderLiveGiftTextView);
            }
        }

        public C55905a(FinderRandomAnimTextView finderRandomAnimTextView, List<String> list) {
            C87412m.m108594g(list, "itemList");
            this.f159306e = finderRandomAnimTextView;
            this.f159305d = list;
        }

        public int getItemCount() {
            return this.f159305d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            View view = zVar.f44854d;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                FinderRandomAnimTextView finderRandomAnimTextView = this.f159306e;
                textView.setText('x' + this.f159305d.get(i));
                textView.setTextSize(1, finderRandomAnimTextView.f159302C1);
                textView.setTextColor(-1);
                textView.setIncludeFontPadding(false);
                try {
                    textView.setTypeface(Typeface.createFromAsset(this.f159306e.getContext().getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
                } catch (Exception unused) {
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            Context context = this.f159306e.getContext();
            C87412m.m108593f(context, "context");
            return new C55906a(new FinderLiveGiftTextView(context));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView$showAnimateText$1", mo125469f = "FinderRandomAnimTextView.kt", mo125470l = {77}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView$b */
    public static final class C55907b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f159307d;

        /* renamed from: e */
        public final /* synthetic */ FinderRandomAnimTextView f159308e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55907b(FinderRandomAnimTextView finderRandomAnimTextView, C15601d<? super C55907b> dVar) {
            super(2, dVar);
            this.f159308e = finderRandomAnimTextView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55907b(this.f159308e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55907b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f159307d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f159307d = 1;
                if (C53965x0.m60607b(500, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53973z1 z1Var = this.f159308e.f159301B1;
            boolean z = false;
            if (z1Var != null && ((C53851a) z1Var).mo74466a()) {
                z = true;
            }
            if (z) {
                FinderRandomAnimTextView finderRandomAnimTextView = this.f159308e;
                C66818c cVar = new C66818c(finderRandomAnimTextView.getContext());
                if (finderRandomAnimTextView.f159303y1.size() > 1) {
                    cVar.f44872a = finderRandomAnimTextView.f159303y1.size() - 1;
                    RecyclerView.LayoutManager layoutManager = finderRandomAnimTextView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.startSmoothScroll(cVar);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRandomAnimTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        LinkedList<String> linkedList = new LinkedList<>();
        this.f159303y1 = linkedList;
        C55905a aVar = new C55905a(this, linkedList);
        this.f159304z1 = aVar;
        setLayoutManager(new LinearLayoutManager(getContext()));
        setVerticalFadingEdgeEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setAdapter(aVar);
    }

    private final void setDataList(List<String> list) {
        this.f159303y1.clear();
        this.f159303y1.addAll(list);
        this.f159304z1.notifyItemRangeChanged(0, list.size());
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C53973z1 z1Var = this.f159301B1;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    public void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            measureChild(childAt, i, i2);
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            if (measuredHeight > i4) {
                i4 = measuredHeight;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    public final void setTextSize(float f) {
        this.f159302C1 = f;
    }

    /* renamed from: x1 */
    public final void mo77575x1(int i, int i2, LinkedList<String> linkedList) {
        String valueOf = String.valueOf(i);
        String str = "";
        for (int i3 = 0; i3 < i2 - valueOf.length(); i3++) {
            str = str + '0';
        }
        linkedList.add(str + valueOf);
    }

    /* renamed from: y1 */
    public final void mo77576y1(int i) {
        int length = String.valueOf(i).length();
        LinkedList linkedList = new LinkedList();
        mo77575x1(0, length, linkedList);
        for (int i2 = 0; i2 < 8; i2++) {
            mo77575x1(new Random().nextInt(i), length, linkedList);
        }
        mo77575x1(i, length, linkedList);
        setDataList(linkedList);
        this.f159301B1 = C53895h.m60466d(this.f159300A1, (C66212f) null, (C53934p0) null, new C55907b(this, (C15601d<? super C55907b>) null), 3, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRandomAnimTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        LinkedList<String> linkedList = new LinkedList<>();
        this.f159303y1 = linkedList;
        C55905a aVar = new C55905a(this, linkedList);
        this.f159304z1 = aVar;
        setLayoutManager(new LinearLayoutManager(getContext()));
        setVerticalFadingEdgeEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setAdapter(aVar);
    }
}
