package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import qk1.C12791b1;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "kotlin.jvm.PlatformType", "p", "Lrx3/g;", "getNotifyMmkv", "()Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "notifyMmkv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansRightView */
public final class FinderLiveVisitorFansRightView extends FrameLayout {

    /* renamed from: d */
    public final View f17871d;

    /* renamed from: e */
    public final LinearLayout f17872e;

    /* renamed from: f */
    public final LinearLayout f17873f;

    /* renamed from: g */
    public final WeImageView f17874g;

    /* renamed from: h */
    public final TextView f17875h;

    /* renamed from: i */
    public final View f17876i;

    /* renamed from: j */
    public final TextView f17877j;

    /* renamed from: n */
    public final ImageView f17878n;

    /* renamed from: o */
    public C12791b1 f17879o = new C12791b1();

    /* renamed from: p */
    public final C13601g f17880p;

    /* renamed from: q */
    public boolean f17881q;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansRightView$a */
    public static final class C3966a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C3966a f17882d = new C3966a();

        public C3966a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("FINDER_LIVE_NOTIFY_REJECT_STATUS");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansRightView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cv6, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…lege_page_ui, this, true)");
        this.f17871d = inflate;
        this.f17872e = (LinearLayout) inflate.findViewById(C0966R.C0970id.mz5);
        this.f17873f = (LinearLayout) inflate.findViewById(C0966R.C0970id.iyb);
        this.f17874g = (WeImageView) inflate.findViewById(C0966R.C0970id.mz4);
        this.f17875h = (TextView) inflate.findViewById(C0966R.C0970id.mz6);
        this.f17876i = inflate.findViewById(C0966R.C0970id.mzz);
        this.f17877j = (TextView) inflate.findViewById(C0966R.C0970id.mzr);
        this.f17878n = (ImageView) inflate.findViewById(C0966R.C0970id.mzt);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0966R.C0970id.n3m);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(this.f17879o);
        this.f17880p = C36568h.m40985a(C3966a.f17882d);
    }

    /* access modifiers changed from: private */
    public final MultiProcessMMKV getNotifyMmkv() {
        return (MultiProcessMMKV) this.f17880p.getValue();
    }

    /* renamed from: b */
    public final void mo4634b(boolean z) {
        this.f17881q = z;
        if (z) {
            this.f17875h.setText(this.f17871d.getContext().getString(C0966R.string.mfp));
            this.f17872e.setBackground(this.f17871d.getContext().getDrawable(C0966R.C0969drawable.b_9));
            this.f17874g.setVisibility(0);
            return;
        }
        this.f17875h.setText(this.f17871d.getContext().getString(C0966R.string.mfo));
        this.f17872e.setBackground(this.f17871d.getContext().getDrawable(C0966R.C0969drawable.b_8));
        this.f17874g.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansRightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cv6, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…lege_page_ui, this, true)");
        this.f17871d = inflate;
        this.f17872e = (LinearLayout) inflate.findViewById(C0966R.C0970id.mz5);
        this.f17873f = (LinearLayout) inflate.findViewById(C0966R.C0970id.iyb);
        this.f17874g = (WeImageView) inflate.findViewById(C0966R.C0970id.mz4);
        this.f17875h = (TextView) inflate.findViewById(C0966R.C0970id.mz6);
        this.f17876i = inflate.findViewById(C0966R.C0970id.mzz);
        this.f17877j = (TextView) inflate.findViewById(C0966R.C0970id.mzr);
        this.f17878n = (ImageView) inflate.findViewById(C0966R.C0970id.mzt);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0966R.C0970id.n3m);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(this.f17879o);
        this.f17880p = C36568h.m40985a(C3966a.f17882d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansRightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cv6, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…lege_page_ui, this, true)");
        this.f17871d = inflate;
        this.f17872e = (LinearLayout) inflate.findViewById(C0966R.C0970id.mz5);
        this.f17873f = (LinearLayout) inflate.findViewById(C0966R.C0970id.iyb);
        this.f17874g = (WeImageView) inflate.findViewById(C0966R.C0970id.mz4);
        this.f17875h = (TextView) inflate.findViewById(C0966R.C0970id.mz6);
        this.f17876i = inflate.findViewById(C0966R.C0970id.mzz);
        this.f17877j = (TextView) inflate.findViewById(C0966R.C0970id.mzr);
        this.f17878n = (ImageView) inflate.findViewById(C0966R.C0970id.mzt);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0966R.C0970id.n3m);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(this.f17879o);
        this.f17880p = C36568h.m40985a(C3966a.f17882d);
    }
}
