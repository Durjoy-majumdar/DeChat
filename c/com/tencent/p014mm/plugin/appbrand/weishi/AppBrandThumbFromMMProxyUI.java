package com.tencent.p014mm.plugin.appbrand.weishi;

import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83426n;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83429p;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88024r;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.weishi.AppBrandThumbFromMMProxyUI */
public class AppBrandThumbFromMMProxyUI extends ContextWrapper implements C83429p {

    /* renamed from: d */
    public int f247415d = 0;

    /* renamed from: e */
    public ImageView f247416e;

    /* renamed from: f */
    public FrameLayout f247417f;

    /* renamed from: g */
    public C83426n f247418g;

    /* renamed from: h */
    public IListener<AppBrandWeishiUIReadyEvent> f247419h = new IListener<AppBrandWeishiUIReadyEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1339599398;
        }

        public boolean callback(IEvent iEvent) {
            if (((AppBrandWeishiUIReadyEvent) iEvent) == null) {
                return false;
            }
            Log.m105924i("MicroMsg.AppBrandThumbFromMMProxyUI", "[weishi] video play, close launch proxy ui");
            AppBrandThumbFromMMProxyUI.this.mo117639a();
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.appbrand.weishi.AppBrandThumbFromMMProxyUI$a */
    public class C84895a implements Runnable {
        public C84895a() {
        }

        public void run() {
            AppBrandLaunchProxyUI d = AppBrandThumbFromMMProxyUI.this.getBaseContext();
            if (d != null && !d.isFinishing() && !d.isDestroyed()) {
                Log.m105925i("MicroMsg.AppBrandThumbFromMMProxyUI", "finish, baseContext:%s", "AppBrandLaunchProxyUI");
                if (AppBrandThumbFromMMProxyUI.this.f247417f != null) {
                    Log.m105924i("MicroMsg.AppBrandThumbFromMMProxyUI", "finish, make decorView invisible");
                    AppBrandThumbFromMMProxyUI.this.f247417f.removeAllViews();
                    AppBrandThumbFromMMProxyUI.this.f247417f.setBackgroundColor(0);
                }
                d.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.weishi.AppBrandThumbFromMMProxyUI$b */
    public class C84896b implements C88394b.C88411m {

        /* renamed from: d */
        public final /* synthetic */ String f247422d;

        public C84896b(String str) {
            this.f247422d = str;
        }

        /* renamed from: b */
        public void mo1907b() {
            Log.m105920e("MicroMsg.AppBrandThumbFromMMProxyUI", "proxy thumb loaded fail");
            String str = this.f247422d;
            if (str != null) {
                AppBrandThumbFromMMProxyUI.this.mo117641e(str, (String) null);
            }
        }

        /* renamed from: d */
        public void mo1908d() {
        }

        public String key() {
            return "AppBrandThumbFromMMProxyUI#THUMB";
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            Log.m105924i("MicroMsg.AppBrandThumbFromMMProxyUI", "proxy thumb loaded");
            AppBrandThumbFromMMProxyUI appBrandThumbFromMMProxyUI = AppBrandThumbFromMMProxyUI.this;
            if (appBrandThumbFromMMProxyUI.f247416e != null && bitmap != null && !bitmap.isRecycled()) {
                appBrandThumbFromMMProxyUI.f247416e.setImageBitmap(bitmap);
            }
        }
    }

    public AppBrandThumbFromMMProxyUI(AppBrandLaunchProxyUI appBrandLaunchProxyUI) {
        super(appBrandLaunchProxyUI);
    }

    /* renamed from: a */
    public void mo117639a() {
        if (getBaseContext() != null) {
            C88024r.m109572b(new C84895a());
        } else {
            Log.m105924i("MicroMsg.AppBrandThumbFromMMProxyUI", "finish, no baseContext");
        }
    }

    /* renamed from: b */
    public void mo115699b(Intent intent, Bundle bundle) {
        C84545i3.m104130g(getBaseContext().getWindow(), true, false);
        C83426n j = C83426n.m102381j(intent.getStringExtra("extra_entry_token"));
        if (j == null) {
            mo117639a();
            return;
        }
        j.setBaseContext(getBaseContext());
        this.f247418g = j;
        View inflate = getBaseContext().getLayoutInflater().inflate(C0966R.C0971layout.f6421ee, (ViewGroup) null);
        this.f247417f = (FrameLayout) inflate.findViewById(C0966R.C0970id.br8);
        this.f247416e = (ImageView) inflate.findViewById(C0966R.C0970id.f359370kk0);
        getBaseContext().setContentView(inflate);
        String stringExtra = intent.getStringExtra("extra_launch_thumb_url");
        String stringExtra2 = intent.getStringExtra("extra_launch_thumb_path");
        Log.m105925i("MicroMsg.AppBrandThumbFromMMProxyUI", "showLaunchThumb, thumbUrl:%s, thumbPath:%s", stringExtra, stringExtra2);
        if (!Util.isNullOrNil(stringExtra)) {
            mo117641e(stringExtra, "file://" + stringExtra2);
        } else if (!Util.isNullOrNil(stringExtra2)) {
            mo117641e("file://" + stringExtra2, (String) null);
        }
        this.f247419h.alive();
        Log.m105924i("MicroMsg.AppBrandThumbFromMMProxyUI", "AppBrandThumbFromMMProxyUI onCreate");
    }

    /* renamed from: c */
    public boolean mo115700c() {
        return false;
    }

    /* renamed from: d */
    public AppBrandLaunchProxyUI getBaseContext() {
        return (AppBrandLaunchProxyUI) super.getBaseContext();
    }

    /* renamed from: e */
    public final void mo117641e(String str, String str2) {
        Log.m105925i("MicroMsg.AppBrandThumbFromMMProxyUI", "loadThumbImage:%s", str);
        String str3 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122797p(new C84896b(str2), str, (C88394b.C88408j) null, (C88394b.C88405h) null);
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.AppBrandThumbFromMMProxyUI", "AppBrandThumbFromMMProxyUI onDestroy");
        IListener<AppBrandWeishiUIReadyEvent> iListener = this.f247419h;
        if (iListener != null) {
            iListener.dead();
        }
        C83426n nVar = this.f247418g;
        if (nVar != null) {
            nVar.mo115708d();
        }
    }

    public void onPause() {
        Log.m105924i("MicroMsg.AppBrandThumbFromMMProxyUI", "AppBrandThumbFromMMProxyUI onPause");
    }

    public void onResume() {
        int i = this.f247415d + 1;
        this.f247415d = i;
        Log.m105925i("MicroMsg.AppBrandThumbFromMMProxyUI", "AppBrandThumbFromMMProxyUI onResume, resume count:%d", Integer.valueOf(i));
        if (this.f247415d > 1) {
            Log.m105924i("MicroMsg.AppBrandThumbFromMMProxyUI", "AppBrandThumbFromMMProxyUI onResume, finish when resume again");
            mo117639a();
        }
    }
}
