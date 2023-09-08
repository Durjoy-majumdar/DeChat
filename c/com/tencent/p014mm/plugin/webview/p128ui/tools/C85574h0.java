package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import te3.C90407dx3;
import te3.C90445w43;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.h0 */
public class C85574h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C90407dx3 f249455d;

    /* renamed from: e */
    public final /* synthetic */ SDKOAuthUI f249456e;

    public C85574h0(SDKOAuthUI sDKOAuthUI, C90407dx3 dx32) {
        this.f249456e = sDKOAuthUI;
        this.f249455d = dx32;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.SdkOAuthUI", "fillNewOauthPage click CreateAvatar");
        Intent intent = new Intent(this.f249456e, CreateAvatarUI.class);
        intent.putExtra("0", this.f249456e.f249411d);
        intent.putExtra("default_fileid", this.f249456e.f249427w);
        C90445w43 w432 = this.f249455d.f259486y;
        if (w432 != null && !Util.isNullOrNil(w432.f259920e)) {
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f249455d.f259486y.f259920e);
        }
        this.f249456e.startActivityForResult(intent, 6);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
