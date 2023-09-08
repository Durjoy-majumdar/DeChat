package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import qc0.C101093a;
import qc0.C101106m;

/* renamed from: com.tencent.mm.plugin.music.ui.k */
public class C4916k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94242j f20042d;

    public C4916k(C94242j jVar) {
        this.f20042d = jVar;
    }

    public void onClick(View view) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101106m b = C101093a.m132480b();
        if (b != null && b.f295946G && !TextUtils.isEmpty(b.f295947H)) {
            String str3 = b.f295947H;
            Log.m105925i("MusicBanner", "barBackToWebView is true, start to jump Url:%s", str3);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str3);
            C88144b.m109791i(this.f20042d.f230570g.get(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } else if (b == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        } else {
            Intent intent2 = new Intent();
            C115669n.INSTANCE.mo160131h(11992, 1);
            intent2.putExtra("key_scene", 1);
            if (b.f295958T) {
                str = "mv";
                str2 = ".ui.MusicMvMainUI";
            } else {
                str = "music";
                str2 = ".ui.MusicMainUI";
            }
            C88144b.m109791i(this.f20042d.f230570g.get(), str, str2, intent2, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
