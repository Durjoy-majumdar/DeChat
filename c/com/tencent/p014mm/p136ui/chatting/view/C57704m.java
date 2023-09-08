package com.tencent.p014mm.p136ui.chatting.view;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.ui.chatting.view.m */
public final class C57704m extends C76901s0 {

    /* renamed from: f */
    public final Context f165151f;

    /* renamed from: g */
    public final View f165152g;

    /* renamed from: h */
    public final View f165153h;

    /* renamed from: i */
    public boolean f165154i;

    /* renamed from: j */
    public int f165155j = 5;

    /* renamed from: n */
    public int f165156n;

    /* renamed from: o */
    public int f165157o;

    /* renamed from: p */
    public C30843b f165158p = C30843b.BELOW;

    /* renamed from: q */
    public View.OnClickListener f165159q;

    /* renamed from: com.tencent.mm.ui.chatting.view.m$b */
    public enum C30843b {
        ABOVE,
        BELOW
    }

    /* renamed from: com.tencent.mm.ui.chatting.view.m$a */
    public static final class C57705a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C57704m f165160d;

        public C57705a(C57704m mVar) {
            this.f165160d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/view/QuoteTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View.OnClickListener onClickListener = this.f165160d.f165159q;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            this.f165160d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/view/QuoteTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57704m(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f165151f = context;
        setContentView(LayoutInflater.from(context).inflate(C0966R.C0971layout.bpb, (ViewGroup) null));
        setOutsideTouchable(true);
        setFocusable(true);
        View findViewById = getContentView().findViewById(C0966R.C0970id.l2s);
        C87412m.m108593f(findViewById, "contentView.findViewById(R.id.v_arrow)");
        this.f165152g = findViewById;
        View findViewById2 = getContentView().findViewById(C0966R.C0970id.grv);
        C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.menu_content)");
        this.f165153h = findViewById2;
        getContentView().setOnClickListener(new C57705a(this));
    }

    /* renamed from: a */
    public final void mo82067a(View view) {
        int i;
        C87412m.m108594g(view, "anchor");
        if (!this.f165154i) {
            getContentView().measure(0, 0);
            this.f165154i = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = iArr[0] + ((view.getWidth() - measuredWidth) / 2);
        int i2 = iArr[1] - measuredHeight;
        Point h = C85875k4.m106184h(this.f165151f);
        int i3 = h.x;
        int i4 = h.y;
        int i5 = this.f165155j;
        int i6 = (i3 - i5) - measuredWidth;
        int i7 = i5 + 0;
        if (width <= i6 && width < i7) {
            width = i7;
        }
        ViewGroup.LayoutParams layoutParams = this.f165152g.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ViewGroup.LayoutParams layoutParams2 = this.f165153h.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
        ((RelativeLayout.LayoutParams) layoutParams).setMarginStart(((iArr[0] + (view.getWidth() / 2)) - width) - (this.f165152g.getMeasuredWidth() / 2));
        if (i2 <= this.f165157o) {
            C30843b bVar = this.f165158p;
            C30843b bVar2 = C30843b.ABOVE;
            if (bVar != bVar2) {
                float f = (float) 180;
                getContentView().setRotation(getContentView().getRotation() + f);
                View view2 = this.f165153h;
                view2.setRotation(view2.getRotation() + f);
                this.f165158p = bVar2;
            }
            i = i2 + this.f165156n + measuredHeight + view.getHeight();
        } else {
            C30843b bVar3 = this.f165158p;
            C30843b bVar4 = C30843b.BELOW;
            if (bVar3 != bVar4) {
                float f2 = (float) 180;
                getContentView().setRotation(getContentView().getRotation() + f2);
                View view3 = this.f165153h;
                view3.setRotation(view3.getRotation() + f2);
                this.f165158p = bVar4;
            }
            i = i2 - this.f165156n;
        }
        setAnimationStyle(C0966R.style.f8388gs);
        showAtLocation(view, 0, width, i);
        C87412m.m108593f(String.format("popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", Arrays.copyOf(new Object[]{Integer.valueOf(width), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight)}, 6)), "format(format, *args)");
    }
}
