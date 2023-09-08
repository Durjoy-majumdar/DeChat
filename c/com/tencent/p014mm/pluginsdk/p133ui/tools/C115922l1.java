package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Intent;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import rx3.C36570n;
import wd3.C65953v0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.l1 */
public final class C115922l1 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ QBFileShareProxyUI f347809a;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.l1$a */
    public static final class C115923a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ QBFileShareProxyUI f347810d;

        public C115923a(QBFileShareProxyUI qBFileShareProxyUI) {
            this.f347810d = qBFileShareProxyUI;
        }

        public final void run() {
            QBFileShareProxyUI qBFileShareProxyUI = this.f347810d;
            Toast.makeText(qBFileShareProxyUI, qBFileShareProxyUI.getString(C0966R.string.lpo), 0).show();
        }
    }

    public C115922l1(QBFileShareProxyUI qBFileShareProxyUI) {
        this.f347809a = qBFileShareProxyUI;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        if (z) {
            Log.m105924i("MicroMsg.QBFileShareProxyUI", "sendFileToFriend, send broadcast, filePath: " + ((String) ((C36570n) this.f347809a.f347801f).getValue()));
            Intent intent = new Intent();
            intent.setAction("MINIQB_OPEN_RET");
            intent.putExtra("op_type", "SEND_TO_FRIENDS");
            intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, (String) ((C36570n) this.f347809a.f347801f).getValue());
            intent.putExtra("file_name", (String) ((C36570n) this.f347809a.f347800e).getValue());
            intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT, (String) ((C36570n) this.f347809a.f347802g).getValue());
            intent.putExtra("forward_msgid", ((Number) ((C36570n) this.f347809a.f347803h).getValue()).longValue());
            intent.putExtra("to_user", (String) ((C36570n) this.f347809a.f347799d).getValue());
            intent.putExtra("send_text", str);
            this.f347809a.getContext().sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
            ((C119157j) C119157j.f356862d).mo183895z(new C115923a(this.f347809a));
        }
    }
}
