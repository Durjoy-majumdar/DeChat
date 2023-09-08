package com.tencent.p014mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import com.tencent.p014mm.plugin.appbrand.page.C40524u2;
import com.tencent.p014mm.plugin.appbrand.page.C83803f4;
import com.tencent.p014mm.plugin.appbrand.page.C83896q4;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView */
public class AppBrandGlobalNativeWidgetContainerView extends AbsoluteLayout implements C83803f4, C40524u2, C83896q4 {

    /* renamed from: d */
    public final AbsoluteLayout f247451d = this;

    /* renamed from: e */
    public final List<C83803f4.C83804a> f247452e = new LinkedList();

    /* renamed from: f */
    public C84915a f247453f = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView$a */
    public interface C84915a {
        /* renamed from: a */
        void mo117656a(Canvas canvas, View view);
    }

    public AppBrandGlobalNativeWidgetContainerView(Context context) {
        super(context);
    }

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        draw(canvas);
        return true;
    }

    /* renamed from: a */
    public void mo116266a(C83803f4.C83804a aVar) {
        if (aVar != null) {
            this.f247452e.remove(aVar);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C84915a aVar = this.f247453f;
        if (aVar != null) {
            aVar.mo117656a(canvas, view);
        }
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: h */
    public void mo116267h(C83803f4.C83804a aVar) {
        if (aVar != null && !this.f247452e.contains(aVar)) {
            this.f247452e.add(aVar);
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
        Log.m105927v("MicroMsg.AppBrandGlobalNativeWidgetContainerView", "onScrollChanged, left = %d, top = %d, oldLeft = %d, oldTop = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (this.f247451d != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            AbsoluteLayout absoluteLayout = this.f247451d;
            if (absoluteLayout != null) {
                ViewGroup.LayoutParams layoutParams = absoluteLayout.getLayoutParams();
                if (layoutParams == null) {
                    this.f247451d.setLayoutParams(new ViewGroup.LayoutParams(width, height));
                } else if (!(width == layoutParams.width && height == layoutParams.height)) {
                    layoutParams.width = width;
                    layoutParams.height = height;
                    this.f247451d.setLayoutParams(layoutParams);
                }
            }
            this.f247451d.scrollTo(i, i2);
        }
        for (C83803f4.C83804a onScrollChange : this.f247452e) {
            onScrollChange.onScrollChange(this, i, i2, i3, i4);
        }
    }

    public void setCapsuleBarBackgroundRenderer(C84915a aVar) {
        if (this.f247453f != aVar) {
            this.f247453f = aVar;
            invalidate();
        }
    }

    public AppBrandGlobalNativeWidgetContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppBrandGlobalNativeWidgetContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
