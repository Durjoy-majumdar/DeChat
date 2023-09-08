package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bt0.C79808b;
import bt0.C79811f;
import bu0.C79819c;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84543i2;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84686v0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84690v2;
import com.tencent.p014mm.plugin.appbrand.page.C83810g4;
import com.tencent.p014mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import in3.C87763b;
import java.util.HashMap;
import java.util.LinkedList;
import qq0.C89795c;
import qq0.C89796d;

/* renamed from: com.tencent.mm.plugin.appbrand.page.i */
public final class C83818i extends C83810g4.C83811a {

    /* renamed from: a */
    public final Class<? extends ViewGroup>[] f244672a = {C89796d.class, C79808b.class, C79819c.class, AppBrandTabBarItem.class};

    /* renamed from: b */
    public final Class<? extends C87763b>[] f244673b = {C89795c.class, C79811f.class, C84690v2.class};

    /* renamed from: c */
    public final C83819a f244674c = new C83819a();

    /* renamed from: com.tencent.mm.plugin.appbrand.page.i$a */
    public static final class C83819a {

        /* renamed from: a */
        public final HashMap<Class<? extends View>, LinkedList<View>> f244675a = new HashMap<>();

        /* renamed from: a */
        public final <WIDGET extends View> WIDGET mo116282a(Class<? extends WIDGET> cls, Context context) {
            C87412m.m108594g(cls, "clazz");
            C87412m.m108594g(context, "ctx");
            LinkedList linkedList = this.f244675a.get(cls);
            WIDGET widget = linkedList != null ? (View) linkedList.pollFirst() : null;
            if (!(widget instanceof View)) {
                widget = null;
            }
            if (widget != null) {
                float f = context.getResources().getDisplayMetrics().density;
                float f2 = widget.getContext().getResources().getDisplayMetrics().density;
                if (!(f == f2)) {
                    Log.m105925i("MicroMsg.AppBrandDecorWidgetFactoryWC", "getPreloadedWidget: [%s]([%f]) preloaded but outer density([%f]) has changed, ret null", cls.getCanonicalName(), Float.valueOf(f2), Float.valueOf(f));
                    return null;
                }
            }
            return widget;
        }
    }

    /* renamed from: a */
    public <WIDGET extends View> WIDGET mo116271a(Context context, Class<WIDGET> cls) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cls, "clazz");
        long nowMilliSecond = Util.nowMilliSecond();
        WIDGET a = this.f244674c.mo116282a(cls, mo116280c(context, cls));
        WIDGET a2 = a == null ? super.mo116271a(mo116280c(context, cls), cls) : a;
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateWidget class[");
        sb.append(cls.getName());
        sb.append("] cost[");
        sb.append(Util.nowMilliSecond() - nowMilliSecond);
        sb.append("ms] preloaded[");
        sb.append(a != null);
        sb.append(']');
        Log.m105918d("MicroMsg.AppBrandDecorWidgetFactoryWC", sb.toString());
        return a2;
    }

    /* renamed from: b */
    public final boolean mo116279b(Object[] objArr, Object obj) {
        for (Object b : objArr) {
            if (C87412m.m108589b(b, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final Context mo116280c(Context context, Class<? extends View> cls) {
        Context context2;
        C87412m.m108594g(context, "originalContext");
        C87412m.m108594g(cls, "clazz");
        ThreadLocal<Boolean> threadLocal = C84686v0.f247051a;
        if (MMApplicationContext.isMainProcess() ? false : C84686v0.f247051a.get().booleanValue()) {
            context2 = mo116279b(this.f244672a, cls) ? C83830j.m103116a(context) : context;
            if (C87412m.m108589b(cls, C84690v2.class)) {
                context2 = C83830j.m103116a(context2);
            }
        } else {
            context2 = (!MMApplicationContext.isMainProcess() || !mo116279b(this.f244672a, cls)) ? context : context instanceof C84543i2 ? C84543i2.m104128b(((C84543i2) context).getBaseContext()) : C84543i2.m104128b(context);
        }
        if (mo116279b(this.f244673b, cls)) {
            context2 = context2 instanceof C84543i2 ? C84543i2.m104128b(((C84543i2) context2).getBaseContext()) : C84543i2.m104128b(context2);
        }
        Log.m105925i("MicroMsg.AppBrandDecorWidgetFactoryWC", "getFactoryContextForWidget: clazz [%s] adapted density [%f] original density [%f]", cls.getCanonicalName(), Float.valueOf(context2.getResources().getDisplayMetrics().density), Float.valueOf(context.getResources().getDisplayMetrics().density));
        return context2;
    }

    /* renamed from: d */
    public final <WIDGET extends View> void mo116281d(Class<WIDGET> cls) {
        C87412m.m108594g(cls, "clazz");
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        View a = super.mo116271a(mo116280c(context, cls), cls);
        if (a != null) {
            C83819a aVar = this.f244674c;
            aVar.getClass();
            if (aVar.f244675a.get(cls) == null) {
                aVar.f244675a.put(cls, new LinkedList());
            }
            LinkedList<View> linkedList = aVar.f244675a.get(cls);
            C87412m.m108591d(linkedList);
            linkedList.addLast(a);
        }
    }
}
