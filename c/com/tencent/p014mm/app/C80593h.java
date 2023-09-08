package com.tencent.p014mm.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.RandomAccessFile;
import p1054vg.C90793a;

/* renamed from: com.tencent.mm.app.h */
public class C80593h {

    /* renamed from: a */
    public static final String f235771a = (C72994y1.f212832a + "channel_history.cfg");

    /* renamed from: a */
    public static void m98211a(Context context) {
        int i;
        C90793a b;
        ChannelUtil.setupChannelId(context);
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir;
            if (!(context.getApplicationInfo().targetSdkVersion > 29 || (b = C90793a.m113861b(str)) == null || b.f260724b == null)) {
                Log.m105924i("MicroMsg.ChannelHistory", "apk external info not null");
                int i2 = b.f260724b.f260728e;
                if (i2 != 0) {
                    ChannelUtil.channelId = i2;
                    Log.m105924i("MicroMsg.ChannelHistory", "read channelId from apk external");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.m105920e("MicroMsg.ChannelHistory", "NameNotFoundException");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ChannelHistory", "Exception in initChannel, %s", e.getMessage());
        }
        Log.m105925i("MicroMsg.ChannelHistory", "now channel id = %d, proce name = %s", Integer.valueOf(ChannelUtil.channelId), MMApplicationContext.getProcessName());
        String str2 = f235771a;
        Uri n = C116299g2.m163858n(str2);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        RandomAccessFile randomAccessFile = null;
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            try {
                randomAccessFile = C86013q1.m106420B(str2, true);
                randomAccessFile.write(String.format("%d\n", new Object[]{Integer.valueOf(ChannelUtil.channelId)}).getBytes());
                try {
                    randomAccessFile.close();
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.ChannelHistory", e2, "Close ChannelHistory History file failed.", "");
                }
            } catch (Exception e3) {
                Log.printErrStackTrace("MicroMsg.ChannelHistory", e3, "Open ChannelHistory History file failed.", "");
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception e4) {
                        Log.printErrStackTrace("MicroMsg.ChannelHistory", e4, "Close ChannelHistory History file failed.", "");
                    }
                }
            } catch (Throwable th) {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception e5) {
                        Log.printErrStackTrace("MicroMsg.ChannelHistory", e5, "Close ChannelHistory History file failed.", "");
                    }
                }
                throw th;
            }
        }
        C80814d b2 = C80814d.m98665b(context);
        if (b2 != null && (i = b2.f237576a) != -1) {
            ChannelUtil.channelId = i;
        }
    }
}
