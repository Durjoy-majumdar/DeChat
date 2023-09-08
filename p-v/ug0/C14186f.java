package ug0;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.account.security.p023ui.SafeDeviceListPreference;
import com.tencent.xweb.util.XWebCleaner;
import f40.C86709a0;
import kg3.C76577a;
import nj3.C76879j;
import rg0.C12997b;

/* renamed from: ug0.f */
public class C14186f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SafeDeviceListPreference f39631d;

    /* renamed from: ug0.f$a */
    public class C14187a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C12997b f39632d;

        public C14187a(C12997b bVar) {
            this.f39632d = bVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f39632d);
            SafeDeviceListPreference safeDeviceListPreference = C14186f.this.f39631d;
            safeDeviceListPreference.getClass();
            C86709a0.m107524d().mo123470p(XWebCleaner.MIN_APK_VERSION_HAS_RESOURCE_CONFIG_FILE, safeDeviceListPreference);
        }
    }

    public C14186f(SafeDeviceListPreference safeDeviceListPreference) {
        this.f39631d = safeDeviceListPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SafeDeviceListPreference safeDeviceListPreference = this.f39631d;
        safeDeviceListPreference.getClass();
        C86709a0.m107524d().mo123455a(XWebCleaner.MIN_APK_VERSION_HAS_RESOURCE_CONFIG_FILE, safeDeviceListPreference);
        C12997b bVar = new C12997b(this.f39631d.f10616K.field_uid);
        C86709a0.m107524d().mo123460f(bVar);
        SafeDeviceListPreference safeDeviceListPreference2 = this.f39631d;
        Context context = safeDeviceListPreference2.f10615J;
        safeDeviceListPreference2.f10618M = C76879j.m92723Q(context, "", C76577a.m92166q(context, C0966R.string.nbk), true, true, new C14187a(bVar));
    }
}
