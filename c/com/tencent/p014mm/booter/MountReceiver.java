package com.tencent.p014mm.booter;

import a70.C112760b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.Message;
import android.os.StatFs;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85798u1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86744o;
import java.io.File;
import java.io.IOException;
import nj3.C76912y0;
import p206nj.C88955f;

/* renamed from: com.tencent.mm.booter.MountReceiver */
public class MountReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public Context f343902a = null;

    /* renamed from: b */
    public String f343903b = "";

    /* renamed from: c */
    public MMHandler f343904c = new C67834a(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.booter.MountReceiver$a */
    public class C67834a extends MMHandler {
        public C67834a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Object[] objArr = new Object[4];
            boolean z = false;
            objArr[0] = MountReceiver.this.f343903b;
            objArr[1] = Boolean.valueOf(C97625j3.m125811a());
            if (MountReceiver.this.f343902a == null) {
                z = true;
            }
            objArr[2] = Boolean.valueOf(z);
            objArr[3] = Boolean.valueOf(C88955f.m111057a());
            Log.m105919d("MicroMsg.MountReceiver", "dkmount action:%s hasuin:%b ContextNull:%b SdcardFull:%b", objArr);
            if (MountReceiver.this.f343902a != null && C88955f.m111057a()) {
                Context context = MountReceiver.this.f343902a;
                int i = C76912y0.f224770h;
                C76912y0.C11191i.m11049a(context, 2);
            }
        }
    }

    /* renamed from: com.tencent.mm.booter.MountReceiver$b */
    public class C114710b implements Runnable {
        public C114710b() {
        }

        public void run() {
            Log.m105919d("MicroMsg.MountReceiver", "dkmount [MOUNT] action:%s hasuin:%b", MountReceiver.this.f343903b, Boolean.valueOf(C97625j3.m125811a()));
            if (C97625j3.m125811a()) {
                C86709a0.m107535s().mo121149q();
                C97625j3.m125812b().getClass();
                C86709a0.m107528h();
                C86744o s = C86709a0.m107535s();
                s.f251822t = Boolean.valueOf(s.mo121147n());
                MountReceiver.this.f343904c.sendEmptyMessage(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.booter.MountReceiver$c */
    public class C114711c implements Runnable {
        public C114711c() {
        }

        public void run() {
            Log.m105919d("MicroMsg.MountReceiver", "dkmount [EJECT] action:%s hasuin:%b", MountReceiver.this.f343903b, Boolean.valueOf(C97625j3.m125811a()));
            if (C97625j3.m125811a()) {
                C86709a0.m107535s().mo121149q();
                C97625j3.m125812b().getClass();
                C86709a0.m107528h();
                C86744o s = C86709a0.m107535s();
                s.f251822t = Boolean.valueOf(s.mo121147n());
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        if (context2 != null && intent != null && !Util.isNullOrNil(intent.getAction())) {
            this.f343902a = context2;
            this.f343903b = intent.getAction();
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            String str = "/sdcard/";
            if (externalStorageDirectory != null) {
                str = externalStorageDirectory.getAbsolutePath();
            } else {
                try {
                    str = new File(str).getCanonicalPath();
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.MountReceiver", e, "Fail to resolve canonical path for sdcard root.", new Object[0]);
                }
            }
            Log.m105925i("MicroMsg.MountReceiver", "dkmount action:%s hasuin:%b SDCARD_ROOT[%s] primaryExtStg[%s]", this.f343903b, Boolean.valueOf(C97625j3.m125811a()), C112760b.m154230f0(), str);
            boolean equals = this.f343903b.equals("android.intent.action.MEDIA_MOUNTED");
            if (equals || this.f343903b.equals("android.intent.action.MEDIA_EJECT") || this.f343903b.equals("android.intent.action.MEDIA_SHARED")) {
                boolean z = !C112760b.m154230f0().equalsIgnoreCase("/dev/null");
                if (z) {
                    try {
                        StatFs statFs = new StatFs(C112760b.m154230f0());
                        Log.m105925i("MicroMsg.MountReceiver", "CheckSD path[%s] blocksize:%d blockcount:%d availcount:%d", C112760b.m154230f0(), Integer.valueOf(statFs.getBlockSize()), Integer.valueOf(statFs.getBlockCount()), Integer.valueOf(statFs.getAvailableBlocks()));
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.MountReceiver", "CheckSD failed :%s", e2.getMessage());
                        z = false;
                    }
                }
                Uri data = intent.getData();
                if (data != null) {
                    String path = data.getPath();
                    if (!C112760b.m154230f0().equalsIgnoreCase(path)) {
                        if (equals && !z) {
                            C115669n.INSTANCE.idkeyStat(340, C112760b.m154230f0().equalsIgnoreCase("/dev/null") ? 9 : 12, 1, false);
                            if (!Util.isNullOrNil(str) && str.equalsIgnoreCase(path)) {
                                Uri n = C116299g2.m163858n(C72994y1.f212832a + "SdcardInfo.cfg");
                                String path2 = n.getPath();
                                if (path2 != null) {
                                    String k = C116299g2.m163855k(path2, false, false);
                                    if (!n.getPath().equals(k)) {
                                        n = n.buildUpon().path(k).build();
                                    }
                                }
                                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                                    Log.m105929w("MicroMsg.MountReceiver", "summermount init sdcard root old [%s] to new [%s], ver[%d]", C112760b.m154230f0(), str, Integer.valueOf(Build.VERSION.SDK_INT));
                                    C112760b.m154238j0(str, false);
                                } else {
                                    C85798u1 u1Var = new C85798u1(C72994y1.f212832a + "SdcardInfo.cfg");
                                    int intValue = ((Integer) u1Var.mo119661b(2, 0)).intValue();
                                    int i = Build.VERSION.SDK_INT;
                                    String f0 = C112760b.m154230f0();
                                    u1Var.mo119664f(1, str);
                                    u1Var.mo119664f(2, Integer.valueOf(i));
                                    C112760b.m154238j0(str, false);
                                    Log.m105929w("MicroMsg.MountReceiver", "summermount init sdcard root old [%d, %s] to new [%d, %s], [%s] to [%s]", Integer.valueOf(intValue), (String) u1Var.mo119661b(1, ""), Integer.valueOf(i), str, f0, C112760b.m154230f0());
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    C115669n.INSTANCE.idkeyStat(340, equals ? 13 : 14, 1, false);
                }
                VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
                ExtStorageMigrateMonitor.C85724a aVar = (ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e;
                aVar.mo119341c("VFS.VFSStrategy", "[+] updateSdCardPathOnDemand called.", new Object[0]);
                aVar.mo119341c("VFS.VFSStrategy", "[+] updateSdCardPathOnDemand, isPathRemapOpened, NEW_SDCARD_ROOT: %s", C112760b.m154228e0());
                synchronized (C112760b.class) {
                    C112760b.f337650e[0] = null;
                }
                C112760b.m154238j0(C112760b.m154228e0(), true);
                C116281f0 f0Var = C116281f0.C116289i.f348994a;
                f0Var.getClass();
                C116281f0.C116283b bVar = new C116281f0.C116283b(true);
                VFSStrategy.m163781i(bVar);
                bVar.mo177801a();
                if (equals) {
                    C86709a0.m107525e().postToWorker(new C114710b());
                    return;
                }
                C76912y0.m92771j(context2, (View) null);
                C86709a0.m107525e().postToWorker(new C114711c());
            }
        }
    }
}
