package com.tencent.p014mm.plugin.appbrand.luggage.export.wmpf;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.UriMatcher;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashSet;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFQRCodeDetectProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFQRCodeDetectProxyUI */
public final class WMPFQRCodeDetectProxyUI extends MMActivity {

    /* renamed from: e */
    public static final C1939a f108794e = new C1939a((C8480h) null);

    /* renamed from: d */
    public boolean f108795d;

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFQRCodeDetectProxyUI$a */
    public static final class C1939a {
        public C1939a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo1824a(Context context, String str) {
            C87412m.m108594g(str, "qrcodePath");
            Intent putExtra = new Intent(context == null ? MMApplicationContext.getContext() : context, WMPFQRCodeDetectProxyUI.class).addFlags(268435456).putExtra("KEY_QRCODE_PATH", str);
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(putExtra);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFQRCodeDetectProxyUI$Companion", "waitFor", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFQRCodeDetectProxyUI$Companion", "waitFor", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFQRCodeDetectProxyUI$b */
    public static final class C40494b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C40494b f108796d = new C40494b();

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: H7 */
    public static final void m43719H7(Context context, String str) {
        f108794e.mo1824a(context, str);
    }

    public void finish() {
        Log.m105924i("MicroMsg.WMPFQRCodeDetectProxyUI", "finish() " + hashCode() + ' ' + android.util.Log.getStackTraceString(new Throwable()));
        super.finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.WMPFQRCodeDetectProxyUI", "onCreate " + hashCode());
        super.onCreate(bundle);
        UriMatcher uriMatcher = WMPFAccessibleProvider.f108790d;
        if (!WMPFAccessibleProvider.f108791e) {
            finish();
            return;
        }
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("KEY_QRCODE_PATH") : null;
        if ((stringExtra == null || stringExtra.length() == 0) || !C86013q1.m106450k(stringExtra)) {
            finish();
            return;
        }
        C76879j.m92723Q(this, "正在识别...", "", true, false, C40494b.f108796d);
        RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
        new WMPFQRCodeDetectProxyUI$onCreate$2$1(this, stringExtra).alive();
        recogQBarOfImageFileEvent.f107731d.f107732a = System.currentTimeMillis();
        RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
        aVar.f107733b = stringExtra;
        aVar.f107735d = new HashSet();
        recogQBarOfImageFileEvent.publish();
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.WMPFQRCodeDetectProxyUI", "onDestroy() " + hashCode());
        super.onDestroy();
    }

    public void onPause() {
        Log.m105924i("MicroMsg.WMPFQRCodeDetectProxyUI", "onPause() " + hashCode());
        super.onPause();
    }

    public void onResume() {
        Log.m105924i("MicroMsg.WMPFQRCodeDetectProxyUI", "onResume() " + hashCode());
        super.onResume();
        if (this.f108795d) {
            moveTaskToBack(true);
            finish();
        }
    }

    public void onStart() {
        Log.m105924i("MicroMsg.WMPFQRCodeDetectProxyUI", "onStart() " + hashCode());
        super.onStart();
        if (this.f108795d) {
            moveTaskToBack(true);
            finish();
        }
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
        this.f108795d = true;
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        this.f108795d = true;
    }
}
