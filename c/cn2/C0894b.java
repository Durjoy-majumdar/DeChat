package cn2;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.account.p024ui.MMFBAuthUI;
import com.tencent.p014mm.plugin.setting.p102ui.qrcode.ShareToQQUI;

/* renamed from: cn2.b */
public class C0894b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ShareToQQUI f2111d;

    public C0894b(ShareToQQUI shareToQQUI) {
        this.f2111d = shareToQQUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f2111d.getContext(), MMFBAuthUI.class);
        intent.putExtra("is_force_unbind", true);
        this.f2111d.getContext().startActivityForResult(intent, 8);
    }
}
