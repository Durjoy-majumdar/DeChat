package com.tencent.p014mm.plugin.appbrand.widget.recent;

import android.content.Context;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.HideAppBrandRecentViewEvent;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.widget.recent.C85028b;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.a */
public class C85027a extends C86301e implements C85028b {
    public void Es0(int i, int i2) {
        Log.m105925i("MicroMsg.AppBrandRecentViewService", "[hideAppBrandRecentView] delay:%s type:%s", Integer.valueOf(i), Integer.valueOf(i2));
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            HideAppBrandRecentViewEvent hideAppBrandRecentViewEvent = new HideAppBrandRecentViewEvent();
            HideAppBrandRecentViewEvent.C80726a aVar = hideAppBrandRecentViewEvent.f236223d;
            aVar.f236224a = i;
            aVar.f236225b = i2;
            hideAppBrandRecentViewEvent.publish();
        }
    }

    public AppBrandRecentView bd0(Context context, C85028b.C29705b bVar, C85028b.C85029a aVar) {
        if (bVar != C85028b.C29705b.TYPE_MENU) {
            return null;
        }
        MenuAppBrandRecentView menuAppBrandRecentView = new MenuAppBrandRecentView(context);
        menuAppBrandRecentView.setSceneFactory(aVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) context.getResources().getDimension(C0966R.dimen.f4110si));
        menuAppBrandRecentView.setPadding(0, (int) context.getResources().getDimension(C0966R.dimen.f4111sk), 0, 0);
        menuAppBrandRecentView.setLayoutParams(layoutParams);
        return menuAppBrandRecentView;
    }

    public boolean d80() {
        return true;
    }
}
