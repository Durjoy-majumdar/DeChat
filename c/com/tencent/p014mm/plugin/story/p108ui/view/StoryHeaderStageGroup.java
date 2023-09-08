package com.tencent.p014mm.plugin.story.p108ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import en3.C75628g;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import lw2.C76735n;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryHeaderStageGroup;", "Landroid/widget/RelativeLayout;", "Llw2/n;", "adapter", "Lrx3/b0;", "setContentAdapter", "Lkotlin/Function0;", "p", "Lfy3/a;", "getOnDeleteClick", "()Lfy3/a;", "setOnDeleteClick", "(Lfy3/a;)V", "onDeleteClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryHeaderStageGroup */
public final class StoryHeaderStageGroup extends RelativeLayout {

    /* renamed from: d */
    public final String f206313d;

    /* renamed from: e */
    public final RecyclerView f206314e;

    /* renamed from: f */
    public final View f206315f;

    /* renamed from: g */
    public final Scroller f206316g;

    /* renamed from: h */
    public int f206317h;

    /* renamed from: i */
    public int f206318i;

    /* renamed from: j */
    public boolean f206319j;

    /* renamed from: n */
    public float f206320n;

    /* renamed from: o */
    public float f206321o;

    /* renamed from: p */
    public C32224a<C13598b0> f206322p;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryHeaderStageGroup$a */
    public static final class C71272a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryHeaderStageGroup f206323d;

        public C71272a(StoryHeaderStageGroup storyHeaderStageGroup) {
            this.f206323d = storyHeaderStageGroup;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryHeaderStageGroup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onDeleteClick = this.f206323d.getOnDeleteClick();
            if (onDeleteClick != null) {
                onDeleteClick.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryHeaderStageGroup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryHeaderStageGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f206313d = "MicroMsg.StoryHeaderStageGroup";
        View.inflate(context, C0966R.C0971layout.c6x, this);
        View findViewById = findViewById(C0966R.C0970id.jw5);
        C87412m.m108593f(findViewById, "findViewById(R.id.sns_st…header_tip_stage_content)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f206314e = recyclerView;
        View findViewById2 = findViewById(C0966R.C0970id.jw7);
        C87412m.m108593f(findViewById2, "findViewById(R.id.sns_st…ader_tip_stage_del_group)");
        this.f206315f = findViewById2;
        this.f206316g = new Scroller(context);
        new C75628g(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        findViewById2.setOnClickListener(new C71272a(this));
    }

    /* renamed from: a */
    public final void mo98109a() {
        if (!this.f206319j) {
            this.f206319j = true;
            this.f206316g.startScroll(this.f206317h, 0, (this.f206315f.getMeasuredWidth() + C74942w4.m89784a(getContext(), 20)) - this.f206317h, 0);
            invalidate();
        }
    }

    public void computeScroll() {
        if (this.f206316g.computeScrollOffset()) {
            String str = this.f206313d;
            Log.m105918d(str, "computeScroll scrollX:" + this.f206316g.getCurrX() + " scrollY:" + this.f206316g.getCurrY());
            this.f206317h = this.f206316g.getCurrX();
            scrollTo(this.f206316g.getCurrX(), 0);
            invalidate();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f206320n = motionEvent.getX();
            this.f206321o = motionEvent.getY();
        } else {
            boolean z = true;
            if (valueOf == null || valueOf.intValue() != 2) {
                if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 3)) {
                    z = false;
                }
                if (z) {
                    this.f206320n = 0.0f;
                    this.f206321o = 0.0f;
                }
            } else if (Math.abs(motionEvent.getX() - this.f206320n) > Math.abs(motionEvent.getY() - this.f206321o)) {
                requestDisallowInterceptTouchEvent(true);
            }
        }
        return dispatchTouchEvent;
    }

    public final C32224a<C13598b0> getOnDeleteClick() {
        return this.f206322p;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        String str = this.f206313d;
        Log.m105918d(str, "onNestedPreFling velocityX:" + f + " velocityY:" + f2);
        RecyclerView.LayoutManager layoutManager = this.f206314e.getLayoutManager();
        RecyclerView.C16613e adapter = this.f206314e.getAdapter();
        if (!(layoutManager == null || adapter == null)) {
            if (f > 0.0f) {
                if (((LinearLayoutManager) layoutManager).mo16958D() == adapter.getItemCount() - 1) {
                    mo98109a();
                }
            } else if (f < 0.0f && getScrollX() != 0 && !this.f206319j) {
                this.f206319j = true;
                Scroller scroller = this.f206316g;
                int i = this.f206317h;
                scroller.startScroll(i, 0, 0 - i, 0);
                invalidate();
            }
        }
        return super.onNestedPreFling(view, f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        String str = this.f206313d;
        Log.m105918d(str, "onNestedPreScroll dx:" + i + " dy:" + i2);
        RecyclerView.LayoutManager layoutManager = this.f206314e.getLayoutManager();
        RecyclerView.C16613e adapter = this.f206314e.getAdapter();
        if (layoutManager != null && adapter != null) {
            if (i > 0) {
                if (((LinearLayoutManager) layoutManager).mo16958D() == adapter.getItemCount() - 1) {
                    int min = Math.min(this.f206317h + i, this.f206315f.getMeasuredWidth() + C74942w4.m89784a(getContext(), 20));
                    this.f206317h = min;
                    scrollTo(min, 0);
                    if (iArr != null) {
                        iArr[0] = i;
                    }
                }
            } else if (i < 0 && getScrollX() != 0) {
                int max = Math.max(this.f206317h + i, 0);
                this.f206317h = max;
                scrollTo(max, 0);
                if (iArr != null) {
                    iArr[0] = i;
                }
            }
            this.f206318i = i;
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        Log.m105919d(this.f206313d, "onNestedScrollAccepted axes:%s", Integer.valueOf(i));
        this.f206318i = 0;
        this.f206319j = false;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 1) != 0;
    }

    public void onStopNestedScroll(View view) {
        Log.m105918d(this.f206313d, "onStopNestedScroll");
        int i = this.f206317h;
        if (i != 0) {
            int i2 = this.f206318i;
            if (i2 > 0) {
                mo98109a();
            } else if (i2 < 0 && !this.f206319j) {
                this.f206319j = true;
                this.f206316g.startScroll(i, 0, 0 - i, 0);
                invalidate();
            }
        }
        this.f206318i = 0;
        this.f206319j = false;
    }

    public final void setContentAdapter(C76735n nVar) {
        C87412m.m108594g(nVar, "adapter");
        throw null;
    }

    public final void setOnDeleteClick(C32224a<C13598b0> aVar) {
        this.f206322p = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryHeaderStageGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
