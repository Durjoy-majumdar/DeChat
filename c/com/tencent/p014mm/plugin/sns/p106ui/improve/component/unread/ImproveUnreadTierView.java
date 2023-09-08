package com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.StoryAvatarDotsView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import iu2.C98799a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import jq3.C60905o;
import kg3.C76577a;
import kotlin.Metadata;
import p196ln.C76705f;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import vt2.C102279c;
import zp3.C23555k;
import zp3.C23564m;
import zt2.C103075a;
import zt2.C103076b;
import zt2.C103081h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR\u001d\u0010\b\u001a\u0004\u0018\u00010\u00038BX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u0004\u0018\u00010\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadTierView;", "Landroid/widget/LinearLayout;", "Ljava/util/Observer;", "Landroid/view/ViewGroup;", "d", "Lrx3/g;", "getUnreadTipView", "()Landroid/view/ViewGroup;", "unreadTipView", "Lcom/tencent/mm/ui/widget/StoryAvatarDotsView;", "e", "getUnreadAvatarView", "()Lcom/tencent/mm/ui/widget/StoryAvatarDotsView;", "unreadAvatarView", "", "h", "getLazyInflate", "()Z", "lazyInflate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView */
public final class ImproveUnreadTierView extends LinearLayout implements Observer {

    /* renamed from: d */
    public final C13601g f279751d = C36568h.m40985a(new C95863d(this));

    /* renamed from: e */
    public final C13601g f279752e = C36568h.m40985a(new C95862c(this));

    /* renamed from: f */
    public C98799a f279753f;

    /* renamed from: g */
    public C60905o f279754g;

    /* renamed from: h */
    public final C13601g f279755h;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$a */
    public static final class C95860a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ ImproveUnreadTierView f279756a;

        public C95860a(ImproveUnreadTierView improveUnreadTierView) {
            this.f279756a = improveUnreadTierView;
        }

        /* renamed from: a */
        public long mo52a(View view) {
            SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
            C87412m.m108594g(view, "view");
            long hashCode = (long) this.f279756a.hashCode();
            SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
            return hashCode;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
            C87412m.m108594g(view, "view");
            if (z) {
                long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                MultiProcessMMKV.getDefault().encode("Key-Unread-Expose", currentTimeMillis);
                C39818r rVar = C39818r.f106831a;
                Context context = this.f279756a.getContext();
                C87412m.m108593f(context, "context");
                ImproveUnreadUIC improveUnreadUIC = (ImproveUnreadUIC) rVar.mo62443b(context).mo75002a(ImproveUnreadUIC.class);
                improveUnreadUIC.getClass();
                SnsMethodCalculate.markStartTimeMs("unreadBtnExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
                if (improveUnreadUIC.f279769o <= 0) {
                    improveUnreadUIC.f279769o = System.currentTimeMillis();
                }
                SnsMethodCalculate.markEndTimeMs("unreadBtnExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
                Log.m105924i("MicroMsg.ImproveUnreadTierView", "markTierIndicatorExpose time:" + currentTimeMillis);
            }
            SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$b */
    public static final class C95861b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ ImproveUnreadTierView f279757d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95861b(ImproveUnreadTierView improveUnreadTierView) {
            super(0);
            this.f279757d = improveUnreadTierView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$lazyInflate$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$lazyInflate$2");
            C85868k2.m106137b(this.f279757d.getContext()).inflate(C0966R.C0971layout.d5p, this.f279757d);
            Boolean bool = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$lazyInflate$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$lazyInflate$2");
            return bool;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$c */
    public static final class C95862c extends C87413o implements C32224a<StoryAvatarDotsView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveUnreadTierView f279758d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95862c(ImproveUnreadTierView improveUnreadTierView) {
            super(0);
            this.f279758d = improveUnreadTierView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadAvatarView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadAvatarView$2");
            StoryAvatarDotsView storyAvatarDotsView = (StoryAvatarDotsView) this.f279758d.findViewById(C0966R.C0970id.jwy);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadAvatarView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadAvatarView$2");
            return storyAvatarDotsView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$d */
    public static final class C95863d extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ ImproveUnreadTierView f279759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95863d(ImproveUnreadTierView improveUnreadTierView) {
            super(0);
            this.f279759d = improveUnreadTierView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadTipView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadTipView$2");
            ViewGroup viewGroup = (ViewGroup) this.f279759d.findViewById(C0966R.C0970id.jwz);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadTipView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadTipView$2");
            return viewGroup;
        }
    }

    public ImproveUnreadTierView(Context context) {
        super(context);
        C23564m.m28138h(this, new C95860a(this));
        this.f279755h = C36568h.m40985a(new C95861b(this));
    }

    private final boolean getLazyInflate() {
        SnsMethodCalculate.markStartTimeMs("getLazyInflate", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        boolean booleanValue = ((Boolean) this.f279755h.getValue()).booleanValue();
        SnsMethodCalculate.markEndTimeMs("getLazyInflate", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        return booleanValue;
    }

    private final StoryAvatarDotsView getUnreadAvatarView() {
        SnsMethodCalculate.markStartTimeMs("getUnreadAvatarView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        StoryAvatarDotsView storyAvatarDotsView = (StoryAvatarDotsView) this.f279752e.getValue();
        SnsMethodCalculate.markEndTimeMs("getUnreadAvatarView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        return storyAvatarDotsView;
    }

    private final ViewGroup getUnreadTipView() {
        SnsMethodCalculate.markStartTimeMs("getUnreadTipView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        ViewGroup viewGroup = (ViewGroup) this.f279751d.getValue();
        SnsMethodCalculate.markEndTimeMs("getUnreadTipView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        return viewGroup;
    }

    /* renamed from: a */
    public final void mo133310a() {
        String str;
        String str2 = "updateVisible";
        SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        C39818r rVar = C39818r.f106831a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C39622i0 a = rVar.mo62443b(context).mo75002a(ImproveUnreadUIC.class);
        C87412m.m108593f(a, "UICProvider.of(context).…oveUnreadUIC::class.java)");
        ImproveUnreadUIC improveUnreadUIC = (ImproveUnreadUIC) a;
        C98799a aVar = this.f279753f;
        T t = null;
        C98214b b = aVar != null ? aVar.mo138170b() : null;
        SnsMethodCalculate.markStartTimeMs("getTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        C103081h hVar = improveUnreadUIC.f279765h;
        SnsMethodCalculate.markEndTimeMs("getTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        if (!(b == null || hVar == null)) {
            SnsMethodCalculate.markStartTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            String str3 = hVar.f304146a;
            SnsMethodCalculate.markEndTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            if (C87412m.m108589b(str3, b.mo137504B2())) {
                SnsMethodCalculate.markStartTimeMs("showUnreadTierView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                Context context2 = getContext();
                C87412m.m108593f(context2, "context");
                ArrayList<T> arrayList = ((C102279c) rVar.mo62443b(context2).mo75002a(C102279c.class)).mo141841d3().f272353o;
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C87412m.m108589b(((C98799a) next).mo138170b().mo137504B2(), C110818d0.m150914L(hVar.mo142795a()))) {
                        t = next;
                        break;
                    }
                }
                C98799a aVar2 = (C98799a) t;
                int indexOf = arrayList.indexOf(this.f279753f);
                int indexOf2 = arrayList.indexOf(aVar2);
                if (aVar2 == null || indexOf <= 0 || indexOf2 <= indexOf) {
                    str = str2;
                    Log.m105920e("MicroMsg.ImproveUnreadTierView", "jump data not prepare,curIndex:" + indexOf + " targetIndex:" + indexOf2);
                    SnsMethodCalculate.markEndTimeMs("showUnreadTierView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("targetUserNames size:");
                    SnsMethodCalculate.markStartTimeMs("getUserNames", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
                    ArrayList<String> arrayList2 = hVar.f304148c;
                    SnsMethodCalculate.markEndTimeMs("getUserNames", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
                    sb.append(arrayList2.size());
                    sb.append(" inflate:");
                    sb.append(getLazyInflate());
                    Log.m105924i("MicroMsg.ImproveUnreadTierView", sb.toString());
                    ViewGroup unreadTipView = getUnreadTipView();
                    if (unreadTipView == null) {
                        SnsMethodCalculate.markEndTimeMs("showUnreadTierView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                        return;
                    }
                    StoryAvatarDotsView unreadAvatarView = getUnreadAvatarView();
                    SnsMethodCalculate.markStartTimeMs("getUserNames", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
                    ArrayList<String> arrayList3 = hVar.f304148c;
                    SnsMethodCalculate.markEndTimeMs("getUserNames", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
                    SnsMethodCalculate.markStartTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                    if (unreadAvatarView == null) {
                        SnsMethodCalculate.markEndTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                        str = str2;
                    } else {
                        unreadAvatarView.setVisibility(0);
                        unreadAvatarView.setIconSize(C76577a.m92151b(getContext(), 20));
                        unreadAvatarView.setIconGap(C76577a.m92151b(getContext(), 24));
                        if (arrayList3.size() > 0) {
                            unreadAvatarView.setVisibility(0);
                            unreadAvatarView.setIconLayerCount(Math.min(arrayList3.size(), 3));
                            int childCount = unreadAvatarView.getChildCount();
                            int i = 0;
                            while (i < childCount) {
                                ((C76705f) C86312j.m106911c(C76705f.class)).D20(unreadAvatarView.mo136313a(i), arrayList3.get(i), 0.1f);
                                unreadAvatarView.mo136313a(i).setPadding(C76577a.m92151b(getContext(), 1), C76577a.m92151b(getContext(), 1), C76577a.m92151b(getContext(), 1), C76577a.m92151b(getContext(), 1));
                                i++;
                                arrayList3 = arrayList3;
                                childCount = childCount;
                                str2 = str2;
                            }
                            str = str2;
                        } else {
                            str = str2;
                            unreadAvatarView.setVisibility(8);
                        }
                        SnsMethodCalculate.markEndTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                    }
                    unreadTipView.invalidate();
                    unreadTipView.post(new C103075a(unreadTipView));
                    unreadTipView.setTag(b.mo137504B2());
                    unreadTipView.setOnClickListener(new C103076b(indexOf2, indexOf, this, b));
                    setVisibility(0);
                    SnsMethodCalculate.markEndTimeMs("showUnreadTierView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                }
                str2 = str;
                SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                return;
            }
        }
        setVisibility(8);
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
    }

    public void update(Observable observable, Object obj) {
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        mo133310a();
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
    }

    public ImproveUnreadTierView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C23564m.m28138h(this, new C95860a(this));
        this.f279755h = C36568h.m40985a(new C95861b(this));
    }

    public ImproveUnreadTierView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C23564m.m28138h(this, new C95860a(this));
        this.f279755h = C36568h.m40985a(new C95861b(this));
    }
}
