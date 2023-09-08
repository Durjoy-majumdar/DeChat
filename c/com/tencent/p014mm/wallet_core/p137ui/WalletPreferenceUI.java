package com.tencent.p014mm.wallet_core.p137ui;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.sdk.platformtools.Util;
import cr3.C75281f;
import cr3.C75282g;
import cr3.C75296i;
import java.util.regex.Pattern;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.wallet_core.ui.WalletPreferenceUI */
public abstract class WalletPreferenceUI extends MMPreference implements C75281f {

    /* renamed from: d */
    public C75296i f221208d = null;

    /* renamed from: e */
    public C75282g f221209e = null;

    /* renamed from: f */
    public C79148e f221210f = null;

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletPreferenceUI$a */
    public class C75187a implements DialogInterface.OnClickListener {
        public C75187a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletPreferenceUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public C75296i mo105011H7() {
        if (this.f221208d == null) {
            this.f221208d = new C75296i(this, this);
        }
        return this.f221208d;
    }

    /* renamed from: I7 */
    public abstract boolean mo94696I7(int i, int i2, String str, C117747y yVar);

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setStatusColor();
        C75296i iVar = new C75296i(this, this);
        this.f221208d = iVar;
        iVar.mo105624c(385);
        this.f221208d.mo105624c(1518);
        if (getLayoutId() > 0) {
            Pattern pattern = C75228t.f221346a;
        }
    }

    public void onDestroy() {
        this.f221208d.mo105630i(385);
        this.f221208d.mo105630i(1518);
        this.f221208d = null;
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar, boolean z) {
        if (!mo94696I7(i, i2, str, yVar) && i2 != 0) {
            if (Util.isNullOrNil(str)) {
                str = getString(C0966R.string.krp);
            }
            C76879j.m92713G(this, str, (String) null, false, new C75187a());
        }
    }

    public void setStatusColor() {
        setActionbarColor(getActionbarColor());
    }
}
