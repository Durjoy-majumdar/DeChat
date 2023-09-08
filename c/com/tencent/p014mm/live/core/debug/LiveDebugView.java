package com.tencent.p014mm.live.core.debug;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/live/core/debug/LiveDebugView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.debug.LiveDebugView */
public final class LiveDebugView extends LinearLayout {

    /* renamed from: d */
    public final TextView f195334d;

    /* renamed from: e */
    public final TextView f195335e;

    /* renamed from: com.tencent.mm.live.core.debug.LiveDebugView$a */
    public static final class C68055a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LiveDebugView f195336d;

        public C68055a(LiveDebugView liveDebugView) {
            this.f195336d = liveDebugView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/debug/LiveDebugView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ClipboardHelper.setText(this.f195336d.f195334d.getText());
            C117292a.m165361g(this, "com/tencent/mm/live/core/debug/LiveDebugView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.live.core.debug.LiveDebugView$b */
    public static final class C68056b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LiveDebugView f195337d;

        /* renamed from: e */
        public final /* synthetic */ Context f195338e;

        public C68056b(LiveDebugView liveDebugView, Context context) {
            this.f195337d = liveDebugView;
            this.f195338e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/debug/LiveDebugView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f195337d.f195334d.getCurrentTextColor() == C76577a.m92153d(this.f195338e, C0966R.color.f3131gg)) {
                this.f195337d.f195334d.setTextColor(C76577a.m92153d(this.f195338e, C0966R.color.al6));
                this.f195337d.f195335e.setTextColor(C76577a.m92153d(this.f195338e, C0966R.color.al6));
            } else {
                this.f195337d.f195334d.setTextColor(C76577a.m92153d(this.f195338e, C0966R.color.f3131gg));
                this.f195337d.f195335e.setTextColor(C76577a.m92153d(this.f195338e, C0966R.color.f3131gg));
            }
            C117292a.m165361g(this, "com/tencent/mm/live/core/debug/LiveDebugView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.live.core.debug.LiveDebugView$c */
    public static final class C68057c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LiveDebugView f195339d;

        /* renamed from: e */
        public final /* synthetic */ Context f195340e;

        public C68057c(LiveDebugView liveDebugView, Context context) {
            this.f195339d = liveDebugView;
            this.f195340e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/debug/LiveDebugView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f195339d.f195334d.getVisibility() == 0) {
                C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.Button");
                ((Button) view).setText(C76577a.m92166q(this.f195340e, C0966R.string.f360951g72));
                this.f195339d.f195334d.setVisibility(4);
                this.f195339d.f195335e.setVisibility(4);
            } else {
                C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.Button");
                ((Button) view).setText(C76577a.m92166q(this.f195340e, C0966R.string.f360950g71));
                this.f195339d.f195334d.setVisibility(0);
                this.f195339d.f195335e.setVisibility(0);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/core/debug/LiveDebugView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveDebugView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b6o, this, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.fth);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.live_debug_text)");
        TextView textView = (TextView) findViewById;
        this.f195334d = textView;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.ftg);
        C87412m.m108593f(findViewById2, "parent.findViewById(R.id.live_debug_info)");
        TextView textView2 = (TextView) findViewById2;
        this.f195335e = textView2;
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
        ((Button) inflate.findViewById(C0966R.C0970id.bzg)).setOnClickListener(new C68055a(this));
        ((Button) inflate.findViewById(C0966R.C0970id.bze)).setOnClickListener(new C68056b(this, context));
        ((Button) inflate.findViewById(C0966R.C0970id.bzf)).setOnClickListener(new C68057c(this, context));
    }
}
