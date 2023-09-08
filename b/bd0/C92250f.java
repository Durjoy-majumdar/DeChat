package bd0;

import android.net.Uri;
import android.os.Looper;
import android.os.MessageQueue;
import bd0.C39755e;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: bd0.f */
public class C92250f {

    /* renamed from: f */
    public static C92250f f264037f;

    /* renamed from: a */
    public C114668z.C104589a f264038a = new C92251a();

    /* renamed from: b */
    public QueueWorkerThread f264039b = new QueueWorkerThread(1, "speex_worker");

    /* renamed from: c */
    public String f264040c;

    /* renamed from: d */
    public byte[] f264041d = new byte[0];

    /* renamed from: e */
    public C11385n f264042e = new C92255c();

    /* renamed from: bd0.f$a */
    public class C92251a extends C114668z.C104589a {
        public C92251a() {
        }

        public void onAppBackground(String str) {
            C92250f fVar = C92250f.this;
            fVar.getClass();
            Looper.myQueue().addIdleHandler(new C92256g(fVar));
        }

        public void onAppForeground(String str) {
            C92250f fVar = C92250f.this;
            fVar.getClass();
            Log.m105918d("MicroMsg.SpeexUploadCore", "now pause speex uploader");
            fVar.f264039b.pause(true);
        }
    }

    /* renamed from: bd0.f$b */
    public class C92252b implements Runnable {

        /* renamed from: bd0.f$b$a */
        public class C92253a implements MessageQueue.IdleHandler {

            /* renamed from: bd0.f$b$a$a */
            public class C92254a implements QueueWorkerThread.ThreadObject {
                public C92254a() {
                }

                public boolean doInBackground() {
                    return true;
                }

                public boolean onPostExecute() {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    C92250f fVar = C92250f.this;
                    fVar.getClass();
                    Log.m105918d("MicroMsg.SpeexUploadCore", "uploadOneFile");
                    synchronized (fVar.f264041d) {
                        if (fVar.f264040c != null) {
                            Log.m105918d("MicroMsg.SpeexUploadCore", "uploading...");
                        } else {
                            C39755e.C39756a d = C39755e.C39756a.m42546d();
                            if (d != null) {
                                if (d.mo62394a()) {
                                    C86009m1 a = fVar.mo126247a(d.f106673g, d.f106674h);
                                    if (a == null) {
                                        Log.m105918d("MicroMsg.SpeexUploadCore", "no target to upload");
                                    } else {
                                        try {
                                            C86009m1 m1Var = new C86009m1(a.mo119976n().replace(".spx", ".uploading"));
                                            if (a.mo119988y(m1Var)) {
                                                fVar.f264040c = m1Var.mo119976n();
                                                String name = m1Var.getName();
                                                Log.m105918d("MicroMsg.SpeexUploadCore", "upload file " + fVar.f264040c);
                                                String[] split = name.substring(0, name.indexOf(46)).split("_");
                                                if (split.length != 5) {
                                                    i3 = 0;
                                                    i2 = 0;
                                                    i = 0;
                                                } else {
                                                    try {
                                                        String str = split[0];
                                                        i5 = Util.getInt(split[1], 0);
                                                        try {
                                                            i4 = Util.getInt(split[2], 0);
                                                        } catch (NumberFormatException e) {
                                                            e = e;
                                                            i4 = 0;
                                                            Log.m105921e("upload", "wrong format", e);
                                                            i6 = 0;
                                                            i = i6;
                                                            i3 = i5;
                                                            i2 = i4;
                                                            C86709a0.m107524d().mo123455a(240, fVar.f264042e);
                                                            C86709a0.m107524d().mo123460f(new C92245a(fVar.f264040c, C39755e.m42545a(name), i3, i2, i));
                                                            return false;
                                                        }
                                                        try {
                                                            i6 = Util.getInt(split[3], 0);
                                                        } catch (NumberFormatException e2) {
                                                            e = e2;
                                                            Log.m105921e("upload", "wrong format", e);
                                                            i6 = 0;
                                                            i = i6;
                                                            i3 = i5;
                                                            i2 = i4;
                                                            C86709a0.m107524d().mo123455a(240, fVar.f264042e);
                                                            C86709a0.m107524d().mo123460f(new C92245a(fVar.f264040c, C39755e.m42545a(name), i3, i2, i));
                                                            return false;
                                                        }
                                                    } catch (NumberFormatException e3) {
                                                        e = e3;
                                                        i5 = 0;
                                                        i4 = 0;
                                                        Log.m105921e("upload", "wrong format", e);
                                                        i6 = 0;
                                                        i = i6;
                                                        i3 = i5;
                                                        i2 = i4;
                                                        C86709a0.m107524d().mo123455a(240, fVar.f264042e);
                                                        C86709a0.m107524d().mo123460f(new C92245a(fVar.f264040c, C39755e.m42545a(name), i3, i2, i));
                                                        return false;
                                                    }
                                                    i = i6;
                                                    i3 = i5;
                                                    i2 = i4;
                                                }
                                                C86709a0.m107524d().mo123455a(240, fVar.f264042e);
                                                C86709a0.m107524d().mo123460f(new C92245a(fVar.f264040c, C39755e.m42545a(name), i3, i2, i));
                                            } else {
                                                Log.m105918d("MicroMsg.SpeexUploadCore", "delete " + a.mo119976n());
                                                a.mo119966f();
                                            }
                                        } catch (Exception e4) {
                                            Log.m105921e("MicroMsg.SpeexUploadCore", "exception:%s", Util.stackTraceToString(e4));
                                        }
                                    }
                                }
                            }
                            Log.m105918d("MicroMsg.SpeexUploadCore", "SpeexConfig not allow");
                        }
                    }
                    return false;
                }
            }

            public C92253a() {
            }

            public boolean queueIdle() {
                C92250f fVar = C92250f.this;
                C92254a aVar = new C92254a();
                fVar.getClass();
                Log.m105918d("MicroMsg.SpeexUploadCore", "pushWork");
                fVar.f264039b.add(aVar);
                return false;
            }
        }

        public C92252b() {
        }

        public void run() {
            Looper.myQueue().addIdleHandler(new C92253a());
        }
    }

    /* renamed from: bd0.f$c */
    public class C92255c implements C11385n {
        public C92255c() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (C92250f.this.f264040c != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("onSceneEnd ");
                C92245a aVar = (C92245a) yVar;
                sb.append(aVar.f264025h);
                sb.append(" filepath ");
                sb.append(C92250f.this.f264040c);
                sb.append(" errCode ");
                sb.append(i2);
                Log.m105918d("MicroMsg.SpeexUploadCore", sb.toString());
                if (aVar.f264025h.equals(C92250f.this.f264040c)) {
                    C86709a0.m107524d().mo123470p(240, C92250f.this.f264042e);
                    if (i2 == 0) {
                        if (C39755e.f106664h == null) {
                            C39755e.f106664h = new C39755e();
                        }
                        C39755e.f106664h.getClass();
                        C86709a0.m107528h();
                        Integer valueOf = Integer.valueOf(Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(16646145, (Object) null)));
                        if (valueOf.intValue() < 0) {
                            valueOf = 0;
                        }
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119676J(16646145, Integer.valueOf(valueOf.intValue() + 1));
                    }
                    Uri n = C116299g2.m163858n(C92250f.this.f264040c);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    try {
                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                        boolean z = l.mo177810a() && l.f348991a.mo119933c(l.f348992b);
                        Log.m105918d("MicroMsg.SpeexUploadCore", "delete " + C92250f.this.f264040c + " delete " + z + " errCode " + i2);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.SpeexUploadCore", "exception:%s", Util.stackTraceToString(e));
                    } catch (Throwable th) {
                        C92250f.m115988b().mo126248c();
                        C92250f.this.f264040c = null;
                        throw th;
                    }
                    C92250f.m115988b().mo126248c();
                    C92250f.this.f264040c = null;
                }
            }
        }
    }

    public C92250f() {
        this.f264038a.alive();
    }

    /* renamed from: b */
    public static C92250f m115988b() {
        if (f264037f == null) {
            f264037f = new C92250f();
        }
        return f264037f;
    }

    /* renamed from: a */
    public final C86009m1 mo126247a(int i, int i2) {
        C86009m1 m1Var = new C86009m1(C28298b.m38156a());
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            return null;
        }
        C86009m1[] u = m1Var.mo119984u();
        C86009m1 m1Var2 = null;
        int i3 = 0;
        while (u != null && i3 < u.length) {
            m1Var2 = u[i3];
            if (m1Var2 != null && m1Var2.mo119978p()) {
                Log.m105918d("MicroMsg.SpeexUploadCore", "file " + m1Var2.mo119976n());
                String n = m1Var2.mo119976n();
                long r = m1Var2.mo119980r();
                if (m1Var2.getName().endsWith(".spx")) {
                    if (r >= ((long) i) && r <= ((long) i2)) {
                        break;
                    }
                    Log.m105919d("MicroMsg.SpeexUploadCore", "unfit delete %s, minsize: %d, maxSize: %d", n, Integer.valueOf(i), Integer.valueOf(i2));
                    C86013q1.m106447h(n);
                }
                m1Var2 = null;
            }
            i3++;
        }
        return m1Var2;
    }

    /* renamed from: c */
    public void mo126248c() {
        if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            new MMHandler(Looper.getMainLooper()).postDelayed(new C92252b(), 100);
        }
    }
}
