package com.tencent.p014mm.plugin.flutter.voip.flutterplugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;
import l33.C109247e;
import p646pn.C62408g;
import vv0.C65884b;
import wu1.C111869f;
import wv0.C78727a;
import xu1.C112180b;
import zu1.C112689b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterVoipPlugin$observePermission$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onResume", "plugin-flutter-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoipPlugin$observePermission$1 */
public final class FlutterVoipPlugin$observePermission$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C111869f f313160d;

    public FlutterVoipPlugin$observePermission$1(C111869f fVar) {
        this.f313160d = fVar;
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        Window window;
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "onResume");
        FlutterVoipMgr flutterVoipMgr = this.f313160d.f334935j;
        if (flutterVoipMgr != null) {
            if (!(flutterVoipMgr.f317093h == null || flutterVoipMgr.f317055E == 1)) {
                flutterVoipMgr.mo152494v(new C112689b(flutterVoipMgr), 1);
            }
            Activity activity = flutterVoipMgr.f313170o1;
            if ((activity != null ? activity.getIntent() : null) != null) {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                Activity activity2 = flutterVoipMgr.f313170o1;
                Intent intent = activity2 != null ? activity2.getIntent() : null;
                C87412m.m108591d(intent);
                C65884b.m77630b(context, intent, true);
                Activity activity3 = flutterVoipMgr.f313170o1;
                View decorView = (activity3 == null || (window = activity3.getWindow()) == null) ? null : window.getDecorView();
                C65884b.m77629a(flutterVoipMgr.f313170o1, false);
                C62408g gVar = flutterVoipMgr.f313172q1;
                if (gVar != null) {
                    Activity activity4 = flutterVoipMgr.f313170o1;
                    Intent intent2 = activity4 != null ? activity4.getIntent() : null;
                    C87412m.m108591d(intent2);
                    gVar.mo87456a(intent2, decorView, (C78727a) null, new C112180b());
                }
            }
        }
        FlutterVoipMgr flutterVoipMgr2 = this.f313160d.f334935j;
        if (!(flutterVoipMgr2 != null && flutterVoipMgr2.mo152452V0())) {
            Log.m105924i("MicroMsg.FlutterVoipPlugin", "not in minimized state, call onVoipDeviceCalled()");
            FlutterVoipMgr flutterVoipMgr3 = this.f313160d.f334935j;
            if (flutterVoipMgr3 != null) {
                flutterVoipMgr3.mo152496x();
            }
        }
        C109247e.wx0().mo153005a(true);
        if (C86709a0.m107522a()) {
            C109247e.xx0().mo152593G(false, false);
        }
    }
}
