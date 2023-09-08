package lh1;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView;
import gy3.C87412m;
import ke3.C88144b;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: lh1.c */
public final class C10515c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f31755d;

    /* renamed from: e */
    public final /* synthetic */ String f31756e;

    /* renamed from: f */
    public final /* synthetic */ ShellView f31757f;

    public C10515c(C77407n nVar, String str, ShellView shellView) {
        this.f31755d = nVar;
        this.f31756e = str;
        this.f31757f = shellView;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            String str = this.f31756e;
            ShellView shellView = this.f31757f;
            int i2 = ShellView.f15054i;
            Intent intent = new Intent();
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            Context context = shellView.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            C88144b.m109804v((MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1014, C10518f.f31764a);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            String str2 = this.f31756e;
            ShellView shellView2 = this.f31757f;
            int i3 = ShellView.f15054i;
            Intent intent2 = new Intent();
            intent2.putExtra("Ksnsupload_type", 0);
            intent2.putExtra("sns_kemdia_path", str2);
            Context context2 = shellView2.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C88144b.m109803u((MMActivity) context2, ".plugin.sns.ui.SnsUploadUI", intent2, 1017, C10519g.f31765d);
        }
        this.f31755d.mo107572p();
    }
}
