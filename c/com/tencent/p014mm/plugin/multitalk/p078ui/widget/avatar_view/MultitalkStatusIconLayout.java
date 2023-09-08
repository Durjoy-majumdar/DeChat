package com.tencent.p014mm.plugin.multitalk.p078ui.widget.avatar_view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105882d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\r\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultitalkStatusIconLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "d", "Lrx3/g;", "getIconBg", "()Landroid/view/View;", "iconBg", "Landroid/widget/ImageView;", "e", "getIcon", "()Landroid/widget/ImageView;", "icon", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout */
public final class MultitalkStatusIconLayout extends FrameLayout {

    /* renamed from: d */
    public final C13601g f315097d = C36568h.m40985a(new C105913b(this));

    /* renamed from: e */
    public final C13601g f315098e = C36568h.m40985a(new C105912a(this));

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout$a */
    public static final class C105912a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ MultitalkStatusIconLayout f315099d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105912a(MultitalkStatusIconLayout multitalkStatusIconLayout) {
            super(0);
            this.f315099d = multitalkStatusIconLayout;
        }

        public Object invoke() {
            return (ImageView) this.f315099d.findViewById(C0966R.C0970id.f358793kc0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout$b */
    public static final class C105913b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MultitalkStatusIconLayout f315100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105913b(MultitalkStatusIconLayout multitalkStatusIconLayout) {
            super(0);
            this.f315100d = multitalkStatusIconLayout;
        }

        public Object invoke() {
            return this.f315100d.findViewById(C0966R.C0970id.kbz);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultitalkStatusIconLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.cjb, this, true);
    }

    private final ImageView getIcon() {
        return (ImageView) ((C36570n) this.f315098e).getValue();
    }

    private final View getIconBg() {
        return (View) ((C36570n) this.f315097d).getValue();
    }

    /* renamed from: a */
    public final void mo151000a(C105882d dVar) {
        C87412m.m108594g(dVar, "memberInfo");
        setVisibility(0);
        if (dVar.mo150900a()) {
            getIconBg().setBackground(C74933u4.m89768e(getContext(), C0966R.C0969drawable.ai5, getContext().getResources().getColor(C0966R.color.f2933h)));
            getIcon().setVisibility(0);
            getIcon().setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_board, getContext().getResources().getColor(C0966R.color.f2975b6)));
        } else if (dVar.f314932g) {
            getIconBg().setBackground(C74933u4.m89768e(getContext(), C0966R.C0969drawable.ai5, getContext().getResources().getColor(C0966R.color.f2975b6)));
            getIcon().setVisibility(0);
            getIcon().setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icon_filled_mike_off, -65536));
        } else if (dVar.f314931f) {
            getIcon().setVisibility(8);
            getIconBg().setBackgroundResource(C0966R.raw.multitalk_network_mark);
        } else if (dVar.f314930e) {
            getIcon().setVisibility(8);
            getIconBg().setBackgroundResource(C0966R.C0969drawable.c8y);
        } else {
            setVisibility(8);
        }
    }
}
