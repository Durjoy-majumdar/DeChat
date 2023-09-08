package com.tencent.p014mm.plugin.appbrand.outerwidget.Service;

import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViewsService;
import nq0.C89050b;

/* renamed from: com.tencent.mm.plugin.appbrand.outerwidget.Service.AppBrandWidgetGridService */
public class AppBrandWidgetGridService extends RemoteViewsService {
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C89050b(getApplicationContext(), intent);
    }
}
