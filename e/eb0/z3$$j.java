package eb0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class z3$$j implements Closeable {

    /* renamed from: d */
    public FileChannel f251325d;

    /* renamed from: e */
    public ByteBuffer f251326e;

    /* renamed from: f */
    public long f251327f;

    /* renamed from: g */
    public long f251328g;

    public z3$$j() {
        Uri.Builder builder;
        File cacheDir = MMApplicationContext.getContext().getCacheDir();
        Uri n = cacheDir == null ? null : C116299g2.m163858n(cacheDir.getPath());
        if (n == null) {
            builder = new Uri.Builder().path("asyncClearMsgStat");
        } else {
            builder = n.buildUpon();
            builder.appendPath("asyncClearMsgStat");
        }
        Uri build = builder.build();
        String path = build.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        try {
            this.f251325d = C86013q1.m106419A(build, true).getChannel();
            ByteBuffer allocate = ByteBuffer.allocate(8);
            this.f251326e = allocate;
            this.f251325d.read(allocate, 0);
            if (this.f251326e.remaining() == 8) {
                this.f251327f = this.f251326e.getLong(0);
            }
            this.f251326e.clear();
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.MsgInfoStorageLogic", e, "Cannot init time statistics", new Object[0]);
            C116299g2.m163847c(this.f251325d);
            this.f251325d = null;
        }
    }

    /* renamed from: b */
    public static void m107249b() {
        Uri.Builder builder;
        File cacheDir = MMApplicationContext.getContext().getCacheDir();
        Uri n = cacheDir == null ? null : C116299g2.m163858n(cacheDir.getPath());
        if (n == null) {
            builder = new Uri.Builder().path("asyncClearMsgStat");
        } else {
            builder = n.buildUpon();
            builder.appendPath("asyncClearMsgStat");
        }
        Uri build = builder.build();
        String path = build.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(build, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            l.f348991a.mo119933c(l.f348992b);
        }
    }

    /* renamed from: a */
    public void mo120970a() {
        if (this.f251328g != 0) {
            long currentTimeMillis = this.f251327f + (System.currentTimeMillis() - this.f251328g);
            this.f251327f = currentTimeMillis;
            if (this.f251325d != null) {
                this.f251326e.putLong(0, currentTimeMillis);
                try {
                    this.f251325d.write(this.f251326e, 0);
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.MsgInfoStorageLogic", "Cannot update time statistics: " + e.getMessage());
                }
                this.f251326e.clear();
            }
            this.f251328g = 0;
        }
    }

    public void close() {
        this.f251325d.close();
    }
}
