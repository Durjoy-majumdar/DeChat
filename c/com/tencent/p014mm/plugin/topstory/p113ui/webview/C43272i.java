package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.vfs.C86013q1;
import java.lang.ref.WeakReference;
import ke3.C88144b;
import p158gt.C76057w;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.i */
public class C43272i implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f117091a;

    public C43272i(C19391e eVar, WeakReference weakReference) {
        this.f117091a = weakReference;
    }

    /* renamed from: a */
    public void mo25933a(String str, Bitmap bitmap, String str2) {
        Context context = (Context) this.f117091a.get();
        if (context != null && !TextUtils.isEmpty(str2) && C86013q1.m106450k(str2)) {
            Intent intent = new Intent();
            intent.putExtra("sns_kemdia_path", str2);
            intent.putExtra("KFilterId", -1);
            intent.putExtra("Ksnsupload_source", 1);
            intent.putExtra("KBlockAdd", true);
            C88144b.m109791i(context, "sns", ".ui.SnsUploadUI", intent, (Bundle) null);
        }
    }
}
