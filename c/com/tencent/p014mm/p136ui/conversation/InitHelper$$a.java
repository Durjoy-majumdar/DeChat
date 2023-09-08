package com.tencent.p014mm.p136ui.conversation;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.FLock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.File;
import java.util.Map;
import kj2.C117407d;

/* renamed from: com.tencent.mm.ui.conversation.InitHelper$$a */
public final /* synthetic */ class InitHelper$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ InitHelper f250045d;

    public /* synthetic */ InitHelper$$a(InitHelper initHelper) {
        this.f250045d = initHelper;
    }

    public final void run() {
        Uri.Builder builder;
        InitHelper initHelper = this.f250045d;
        initHelper.getClass();
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getFilesDir(), "DBRecoverStarted");
        Uri uri = null;
        if (m1Var.mo119967g()) {
            C117407d.INSTANCE.mo160135k("DBRepair", "Last recovery interrupted.", (Map<String, Object>) null);
            m1Var.mo119966f();
        }
        File filesDir = MMApplicationContext.getContext().getFilesDir();
        if (filesDir != null) {
            uri = C116299g2.m163858n(filesDir.getPath());
        }
        if (uri == null) {
            builder = new Uri.Builder().path("MMStarted");
        } else {
            builder = uri.buildUpon();
            builder.appendPath("MMStarted");
        }
        Uri build = builder.build();
        String path = build.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        FLock fLock = new FLock(C86013q1.m106448i(C116299g2.m163865u(build), true), true);
        initHelper.f219454v = fLock;
        if (fLock.tryLockWrite()) {
            initHelper.f219454v.unlock();
            Log.m105924i("MicroMsg.DuplicateDetect", "No data multiple instance detected.");
        } else {
            Log.m105928w("MicroMsg.DuplicateDetect", "Data multiple instance detected.");
            C117407d.INSTANCE.idkeyStat(579, 0, 1, true);
        }
        initHelper.f219454v.lockRead();
    }
}
