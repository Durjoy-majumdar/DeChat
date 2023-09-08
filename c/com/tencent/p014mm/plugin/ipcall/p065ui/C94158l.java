package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import di3.C86312j;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.l */
public class C94158l implements QueueWorkerThread.ThreadObject {

    /* renamed from: d */
    public final /* synthetic */ String f271925d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f271926e;

    /* renamed from: f */
    public final /* synthetic */ String f271927f;

    /* renamed from: g */
    public final /* synthetic */ C94154k f271928g;

    public C94158l(C94154k kVar, String str, ImageView imageView, String str2) {
        this.f271928g = kVar;
        this.f271925d = str;
        this.f271926e = imageView;
        this.f271927f = str2;
    }

    public boolean doInBackground() {
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(this.f271925d);
        if (N50 == null) {
            C10579k RE = ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE();
            String str = this.f271925d;
            N50 = AvatarStorage.m80444f(((AvatarStorage) RE).mo93559h(str, false), str, false);
        }
        C94154k.m119007a(this.f271928g, this.f271926e, this.f271927f, N50);
        return true;
    }

    public boolean onPostExecute() {
        return false;
    }
}
