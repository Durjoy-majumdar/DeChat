package yz1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import nc0.C76850a;

/* renamed from: yz1.a */
public class C79183a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79188f f232488d;

    public C79183a(C79188f fVar) {
        this.f232488d = fVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f232488d.f232494c, BindMContactUI.class);
        intent.putExtra("bind_scene", 0);
        String simCountryIso = ((TelephonyManager) this.f232488d.f232494c.getSystemService("phone")).getSimCountryIso();
        if (!Util.isNullOrNil(simCountryIso)) {
            Context context = this.f232488d.f232494c;
            C76850a.C76851a a = C76850a.m92629a(context, simCountryIso, context.getString(C0966R.string.bvs));
            if (a != null) {
                intent.putExtra("country_name", a.f224677c);
                intent.putExtra("couttry_code", a.f224676b);
            }
        }
        C79188f fVar = this.f232488d;
        fVar.mo109203b(fVar.f232494c, intent);
    }
}
