package p655px;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.easygo.sdk.constant.EasyGoCode;
import com.tencent.p014mm.autogen.events.ReportCCDataByFinderEvent;
import com.tencent.p014mm.autogen.events.ReportCCDataByPayEvent;
import com.tencent.p014mm.autogen.events.ReportNewInstallAppEvent;
import com.tencent.p014mm.autogen.events.ReportSensorDataEvent;
import com.tencent.p014mm.autogen.events.ReportTuringOwnerDataEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80905h;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.normsg.C114829e;
import com.tencent.p014mm.plugin.normsg.C115632c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.Deflater;
import jm2.C117360e;
import kj2.C117407d;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import p156gj.C87203t;
import pe3.C89349b;
import q20.C89449a;
import tc2.C118418g;
import te3.C118426e0;
import te3.C49469ft3;
import te3.C49609gt3;
import te3.C51018qv3;
import te3.C51588ur3;
import te3.C51730vr3;
import te3.C64223a43;
import te3.C64251b43;
import te3.C64564mw;
import te3.lx4;

@C86522b(dependencies = {C115632c.class})
/* renamed from: px.l */
public class C118134l extends C86301e implements C117360e {

    /* renamed from: d */
    public static final MMHandler f353146d = new MMHandler("SIRIWorker");

    /* renamed from: px.l$c */
    public class C35719c implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ int f95415d;

        public C35719c(C118134l lVar, int i) {
            this.f95415d = i;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                Log.m105925i("MicroMsg.SecInfoReporterImpl", "cgireport succ, ctx: %d, stack: %s", Integer.valueOf(this.f95415d), Util.getStack().toString());
                C117407d.INSTANCE.idkeyStat(416, 1, 1, false);
            } else {
                Log.m105929w("MicroMsg.SecInfoReporterImpl", "cgireport failed, ctx: %d, err: %d:%d %s, stack: %s", Integer.valueOf(this.f95415d), Integer.valueOf(i), Integer.valueOf(i2), str, Util.getStack().toString());
                C117407d.INSTANCE.idkeyStat(416, 2, 1, false);
            }
            return 0;
        }
    }

    /* renamed from: px.l$d */
    public class C35720d implements l0$$e {
        public C35720d(C118134l lVar) {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                Log.m105925i("MicroMsg.SecInfoReporterImpl", "cgireport succ, stack: %s", Util.getStack().toString());
                C117407d.INSTANCE.idkeyStat(416, 4, 1, false);
            } else {
                Log.m105929w("MicroMsg.SecInfoReporterImpl", "cgireport failed, err: %d:%d %s, stack: %s", Integer.valueOf(i), Integer.valueOf(i2), str, Util.getStack().toString());
                C117407d.INSTANCE.idkeyStat(416, 5, 1, false);
            }
            return 0;
        }
    }

    /* renamed from: px.l$a */
    public class C118135a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f353147d;

        /* renamed from: e */
        public final /* synthetic */ long f353148e;

        /* renamed from: f */
        public final /* synthetic */ String f353149f;

        /* renamed from: g */
        public final /* synthetic */ int f353150g;

        public C118135a(String str, long j, String str2, int i) {
            this.f353147d = str;
            this.f353148e = j;
            this.f353149f = str2;
            this.f353150g = i;
        }

        public void run() {
            try {
                byte[] c = C114829e.C114830a.m161735c(this.f353147d, this.f353148e, this.f353149f, this.f353150g);
                if (c == null) {
                    Log.m105920e("MicroMsg.SecInfoReporterImpl", "get cssi failed");
                    return;
                }
                lx4 lx4 = new lx4();
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(c);
                lx4.f354127s = qv32;
                C118134l.this.wx0(540999707, lx4.toByteArray());
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.SecInfoReporterImpl", "report cssi error: %s", th.toString());
            }
        }
    }

    /* renamed from: px.l$b */
    public class C118136b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f353152d;

        /* renamed from: px.l$b$a */
        public class C118137a implements C80905h<Bundle> {
            public C118137a(C118136b bVar) {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo894a(Object obj) {
                Bundle bundle = (Bundle) obj;
            }

            /* renamed from: b */
            public void mo56805b() {
            }

            /* renamed from: c */
            public void mo56806c(Exception exc) {
                Log.m105925i("MicroMsg.SecInfoReporterImpl", "rwgsi rpc failed %s", exc.toString());
            }
        }

        public C118136b(C118134l lVar, String str) {
            this.f353152d = str;
        }

        public void run() {
            try {
                byte[] d = C114829e.C114830a.m161736d(48);
                Bundle bundle = new Bundle();
                bundle.putByteArray("ECD", d);
                bundle.putString("MGAI", this.f353152d);
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C118140f.class, new C118137a(this));
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.SecInfoReporterImpl", "post rwgsi task error: %s", th.toString());
            }
        }
    }

    /* renamed from: px.l$e */
    public static final class C118138e {

        /* renamed from: a */
        public static C64223a43 f353153a = null;

        /* renamed from: px.l$e$a */
        public static class C118139a extends Exception {
        }

        static {
            new HashMap();
        }

        /* renamed from: a */
        public static C64251b43 m166666a(int i) {
            C64223a43 a432 = f353153a;
            if (a432 == null) {
                return null;
            }
            Iterator<C64251b43> it = a432.f182026d.iterator();
            while (it.hasNext()) {
                C64251b43 next = it.next();
                if (next.f182209d == i) {
                    return next;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static synchronized boolean m166667b(int i, long j, int i2) {
            synchronized (C118138e.class) {
                if (j <= 0 || i2 <= 0) {
                    Log.m105929w("MicroMsg.SecInfoReporterImpl", "bad interval: %s, %s", Long.valueOf(j), Integer.valueOf(i2));
                    return false;
                }
                if (f353153a == null) {
                    m166668c();
                }
                C64251b43 a = m166666a(i);
                if (a == null) {
                    a = new C64251b43();
                    a.f182209d = i;
                    a.f182210e = 0;
                    f353153a.f182026d.add(a);
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = a.f182210e;
                if (currentTimeMillis >= j2) {
                    if (currentTimeMillis / j == j2 / j) {
                        int i3 = a.f182211f;
                        if (i3 >= i2) {
                            return false;
                        }
                        a.f182210e = currentTimeMillis;
                        a.f182211f = i3 + 1;
                        m166671f();
                        return true;
                    }
                }
                a.f182210e = currentTimeMillis;
                a.f182211f = 1;
                m166671f();
                return true;
            }
        }

        /* renamed from: c */
        public static synchronized void m166668c() {
            synchronized (C118138e.class) {
                if (f353153a == null) {
                    try {
                        f353153a = m166670e();
                    } catch (C118139a unused) {
                        f353153a = m166669d();
                    } catch (Exception e) {
                        f353153a = new C64223a43();
                        Log.m105921e("MicroMsg.SecInfoReporterImpl", "normsg stat load failed, use default. %s", e);
                    }
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:40|(0)|54|55) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00d3 */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9 A[SYNTHETIC, Splitter:B:46:0x00c9] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00d0 A[SYNTHETIC, Splitter:B:52:0x00d0] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static synchronized te3.C64223a43 m166669d() {
            /*
                java.lang.Class<px.l$e> r0 = p655px.C118134l.C118138e.class
                monitor-enter(r0)
                te3.a43 r1 = new te3.a43     // Catch:{ all -> 0x00d4 }
                r1.<init>()     // Catch:{ all -> 0x00d4 }
                f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = r2.f251807e     // Catch:{ all -> 0x00d4 }
                tc2.g r3 = tc2.C118418g.INSTANCE     // Catch:{ all -> 0x00d4 }
                java.lang.String r4 = "!#?'8/f((6(1$\u001f2*>(s826"
                java.lang.String r3 = r3.Z10(r4)     // Catch:{ all -> 0x00d4 }
                r4 = 0
                if (r2 != 0) goto L_0x001b
                r2 = r4
                goto L_0x001f
            L_0x001b:
                android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)     // Catch:{ all -> 0x00d4 }
            L_0x001f:
                if (r2 != 0) goto L_0x002b
                android.net.Uri$Builder r2 = new android.net.Uri$Builder     // Catch:{ all -> 0x00d4 }
                r2.<init>()     // Catch:{ all -> 0x00d4 }
                android.net.Uri$Builder r2 = r2.path(r3)     // Catch:{ all -> 0x00d4 }
                goto L_0x0038
            L_0x002b:
                android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ all -> 0x00d4 }
                boolean r5 = r3.isEmpty()     // Catch:{ all -> 0x00d4 }
                if (r5 != 0) goto L_0x0038
                r2.appendPath(r3)     // Catch:{ all -> 0x00d4 }
            L_0x0038:
                android.net.Uri r3 = r2.build()     // Catch:{ all -> 0x00d4 }
                java.lang.String r5 = r3.getPath()     // Catch:{ all -> 0x00d4 }
                r6 = 0
                if (r5 == 0) goto L_0x0059
                java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r6, r6)     // Catch:{ all -> 0x00d4 }
                java.lang.String r7 = r3.getPath()     // Catch:{ all -> 0x00d4 }
                boolean r7 = r7.equals(r5)     // Catch:{ all -> 0x00d4 }
                if (r7 != 0) goto L_0x0059
                android.net.Uri$Builder r2 = r2.path(r5)     // Catch:{ all -> 0x00d4 }
                android.net.Uri r3 = r2.build()     // Catch:{ all -> 0x00d4 }
            L_0x0059:
                r2 = 1
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00bb }
                com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x00bb }
                com.tencent.mm.vfs.f0$h r7 = r7.mo177799l(r3, r4)     // Catch:{ Exception -> 0x00bb }
                java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106421C(r3, r7)     // Catch:{ Exception -> 0x00bb }
                r5.<init>(r3)     // Catch:{ Exception -> 0x00bb }
                short r3 = r5.readShort()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                r4 = -774(0xfffffffffffffcfa, float:NaN)
                if (r3 != r4) goto L_0x00ab
                r5.readShort()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                int r3 = r5.readInt()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                if (r3 < 0) goto L_0x00a3
                r4 = 0
            L_0x007b:
                if (r4 >= r3) goto L_0x0098
                int r7 = r5.readInt()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                long r8 = r5.readLong()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                te3.b43 r10 = new te3.b43     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                r10.<init>()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                r10.f182209d = r7     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                r10.f182210e = r8     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                r10.f182211f = r2     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                java.util.LinkedList<te3.b43> r7 = r1.f182026d     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                r7.add(r10)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                int r4 = r4 + 1
                goto L_0x007b
            L_0x0098:
                java.lang.String r3 = "MicroMsg.SecInfoReporterImpl"
                java.lang.String r4 = "normsg stat load done."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                r5.close()     // Catch:{ Exception -> 0x00cc }
                goto L_0x00cc
            L_0x00a3:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                java.lang.String r4 = "bad pair count."
                r3.<init>(r4)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                throw r3     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            L_0x00ab:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                java.lang.String r4 = "bad magic."
                r3.<init>(r4)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
                throw r3     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            L_0x00b3:
                r1 = move-exception
                r4 = r5
                goto L_0x00ce
            L_0x00b6:
                r3 = move-exception
                r4 = r5
                goto L_0x00bc
            L_0x00b9:
                r1 = move-exception
                goto L_0x00ce
            L_0x00bb:
                r3 = move-exception
            L_0x00bc:
                java.lang.String r5 = "MicroMsg.SecInfoReporterImpl"
                java.lang.String r7 = "normsg stat load failed, use default."
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00b9 }
                r2[r6] = r3     // Catch:{ all -> 0x00b9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r2)     // Catch:{ all -> 0x00b9 }
                if (r4 == 0) goto L_0x00cc
                r4.close()     // Catch:{ Exception -> 0x00cc }
            L_0x00cc:
                monitor-exit(r0)
                return r1
            L_0x00ce:
                if (r4 == 0) goto L_0x00d3
                r4.close()     // Catch:{ Exception -> 0x00d3 }
            L_0x00d3:
                throw r1     // Catch:{ all -> 0x00d4 }
            L_0x00d4:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p655px.C118134l.C118138e.m166669d():te3.a43");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(15:28|29|30|31|32|33|34|35|36|37|38|39|40|41|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:43|44|45) */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:50|(0)|64|65) */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a2, code lost:
            throw new p655px.C118134l.C118138e.C118139a();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x00c4 */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00ba A[SYNTHETIC, Splitter:B:56:0x00ba] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00c1 A[SYNTHETIC, Splitter:B:62:0x00c1] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x00c4=Splitter:B:64:0x00c4, B:43:0x009d=Splitter:B:43:0x009d} */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static synchronized te3.C64223a43 m166670e() {
            /*
                java.lang.Class<px.l$e> r0 = p655px.C118134l.C118138e.class
                monitor-enter(r0)
                te3.a43 r1 = new te3.a43     // Catch:{ all -> 0x00c5 }
                r1.<init>()     // Catch:{ all -> 0x00c5 }
                f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x00c5 }
                java.lang.String r2 = r2.f251807e     // Catch:{ all -> 0x00c5 }
                tc2.g r3 = tc2.C118418g.INSTANCE     // Catch:{ all -> 0x00c5 }
                java.lang.String r4 = "!#?'8/f((6(1$\u001f2*>(s826"
                java.lang.String r3 = r3.Z10(r4)     // Catch:{ all -> 0x00c5 }
                r4 = 0
                if (r2 != 0) goto L_0x001b
                r2 = r4
                goto L_0x001f
            L_0x001b:
                android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)     // Catch:{ all -> 0x00c5 }
            L_0x001f:
                if (r2 != 0) goto L_0x002b
                android.net.Uri$Builder r2 = new android.net.Uri$Builder     // Catch:{ all -> 0x00c5 }
                r2.<init>()     // Catch:{ all -> 0x00c5 }
                android.net.Uri$Builder r2 = r2.path(r3)     // Catch:{ all -> 0x00c5 }
                goto L_0x0038
            L_0x002b:
                android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ all -> 0x00c5 }
                boolean r5 = r3.isEmpty()     // Catch:{ all -> 0x00c5 }
                if (r5 != 0) goto L_0x0038
                r2.appendPath(r3)     // Catch:{ all -> 0x00c5 }
            L_0x0038:
                android.net.Uri r3 = r2.build()     // Catch:{ all -> 0x00c5 }
                java.lang.String r5 = r3.getPath()     // Catch:{ all -> 0x00c5 }
                r6 = 0
                if (r5 == 0) goto L_0x0059
                java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r6, r6)     // Catch:{ all -> 0x00c5 }
                java.lang.String r7 = r3.getPath()     // Catch:{ all -> 0x00c5 }
                boolean r7 = r7.equals(r5)     // Catch:{ all -> 0x00c5 }
                if (r7 != 0) goto L_0x0059
                android.net.Uri$Builder r2 = r2.path(r5)     // Catch:{ all -> 0x00c5 }
                android.net.Uri r3 = r2.build()     // Catch:{ all -> 0x00c5 }
            L_0x0059:
                com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x00c5 }
                com.tencent.mm.vfs.f0$h r2 = r2.mo177799l(r3, r4)     // Catch:{ all -> 0x00c5 }
                boolean r5 = r2.mo177810a()     // Catch:{ all -> 0x00c5 }
                r7 = 0
                if (r5 != 0) goto L_0x0068
                goto L_0x0075
            L_0x0068:
                com.tencent.mm.vfs.FileSystem$c r5 = r2.f348991a     // Catch:{ all -> 0x00c5 }
                java.lang.String r9 = r2.f348992b     // Catch:{ all -> 0x00c5 }
                com.tencent.mm.vfs.b0 r5 = r5.mo119945q(r9)     // Catch:{ all -> 0x00c5 }
                if (r5 != 0) goto L_0x0073
                goto L_0x0075
            L_0x0073:
                long r7 = r5.f250473c     // Catch:{ all -> 0x00c5 }
            L_0x0075:
                int r5 = (int) r7
                if (r5 != 0) goto L_0x007a
                monitor-exit(r0)
                return r1
            L_0x007a:
                byte[] r5 = new byte[r5]     // Catch:{ all -> 0x00c5 }
                java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00ab }
                com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x00ab }
                com.tencent.mm.vfs.f0$h r2 = r8.mo177799l(r3, r2)     // Catch:{ Exception -> 0x00ab }
                java.io.InputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106421C(r3, r2)     // Catch:{ Exception -> 0x00ab }
                r7.<init>(r2)     // Catch:{ Exception -> 0x00ab }
                r7.read(r5)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
                r7.close()     // Catch:{ Exception -> 0x0091 }
            L_0x0091:
                r1.parseFrom(r5)     // Catch:{ Exception -> 0x009d }
                java.lang.String r2 = "MicroMsg.SecInfoReporterImpl"
                java.lang.String r3 = "normsg stat load done."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x00c5 }
                monitor-exit(r0)
                return r1
            L_0x009d:
                px.l$e$a r1 = new px.l$e$a     // Catch:{ all -> 0x00c5 }
                r1.<init>()     // Catch:{ all -> 0x00c5 }
                throw r1     // Catch:{ all -> 0x00c5 }
            L_0x00a3:
                r1 = move-exception
                r4 = r7
                goto L_0x00bf
            L_0x00a6:
                r2 = move-exception
                r4 = r7
                goto L_0x00ac
            L_0x00a9:
                r1 = move-exception
                goto L_0x00bf
            L_0x00ab:
                r2 = move-exception
            L_0x00ac:
                java.lang.String r3 = "MicroMsg.SecInfoReporterImpl"
                java.lang.String r5 = "normsg stat load failed, use default. %s"
                r7 = 1
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00a9 }
                r7[r6] = r2     // Catch:{ all -> 0x00a9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r7)     // Catch:{ all -> 0x00a9 }
                if (r4 == 0) goto L_0x00bd
                r4.close()     // Catch:{ Exception -> 0x00bd }
            L_0x00bd:
                monitor-exit(r0)
                return r1
            L_0x00bf:
                if (r4 == 0) goto L_0x00c4
                r4.close()     // Catch:{ Exception -> 0x00c4 }
            L_0x00c4:
                throw r1     // Catch:{ all -> 0x00c5 }
            L_0x00c5:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p655px.C118134l.C118138e.m166670e():te3.a43");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:20|(2:32|33)|34|35) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x005d */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0053 A[SYNTHETIC, Splitter:B:26:0x0053] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a A[SYNTHETIC, Splitter:B:32:0x005a] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static synchronized void m166671f() {
            /*
                java.lang.Class<px.l$e> r0 = p655px.C118134l.C118138e.class
                monitor-enter(r0)
                com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x005e }
                f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x005e }
                java.lang.String r2 = r2.f251807e     // Catch:{ all -> 0x005e }
                tc2.g r3 = tc2.C118418g.INSTANCE     // Catch:{ all -> 0x005e }
                java.lang.String r4 = "!#?'8/f((6(1$\u001f2*>(s826"
                java.lang.String r3 = r3.Z10(r4)     // Catch:{ all -> 0x005e }
                r1.<init>((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x005e }
                boolean r2 = r1.mo119967g()     // Catch:{ all -> 0x005e }
                if (r2 != 0) goto L_0x0023
                com.tencent.mm.vfs.m1 r2 = r1.mo119974l()     // Catch:{ all -> 0x005e }
                r2.mo119987x()     // Catch:{ all -> 0x005e }
            L_0x0023:
                r2 = 0
                java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x004a }
                java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106426H(r1)     // Catch:{ Exception -> 0x004a }
                r3.<init>(r1)     // Catch:{ Exception -> 0x004a }
                te3.a43 r1 = f353153a     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
                if (r1 == 0) goto L_0x0038
                byte[] r1 = r1.toByteArray()     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
                r3.write(r1)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            L_0x0038:
                java.lang.String r1 = "MicroMsg.SecInfoReporterImpl"
                java.lang.String r2 = "normsg stat save done."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
                r3.close()     // Catch:{ Exception -> 0x0056 }
                goto L_0x0056
            L_0x0043:
                r1 = move-exception
                r2 = r3
                goto L_0x0058
            L_0x0046:
                r2 = r3
                goto L_0x004a
            L_0x0048:
                r1 = move-exception
                goto L_0x0058
            L_0x004a:
                java.lang.String r1 = "MicroMsg.SecInfoReporterImpl"
                java.lang.String r3 = "normsg stat save failed."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)     // Catch:{ all -> 0x0048 }
                if (r2 == 0) goto L_0x0056
                r2.close()     // Catch:{ Exception -> 0x0056 }
            L_0x0056:
                monitor-exit(r0)
                return
            L_0x0058:
                if (r2 == 0) goto L_0x005d
                r2.close()     // Catch:{ Exception -> 0x005d }
            L_0x005d:
                throw r1     // Catch:{ all -> 0x005e }
            L_0x005e:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p655px.C118134l.C118138e.m166671f():void");
        }
    }

    @C89449a
    /* renamed from: px.l$f */
    public static class C118140f implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            C118134l.f353146d.post(new C118141m(this, (Bundle) obj));
        }
    }

    public void If0(Intent intent) {
        int i = 10;
        if (!BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG) {
            i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_new_install_app_max_report_count, 10);
        }
        if (C118138e.m166667b(8, 86400000, i)) {
            ReportNewInstallAppEvent reportNewInstallAppEvent = new ReportNewInstallAppEvent();
            reportNewInstallAppEvent.f78925d.f78926a = intent;
            reportNewInstallAppEvent.publish();
        }
    }

    public void Kf0(String str, long j, String str2, int i) {
        try {
            f353146d.post(new C118135a(str, j, str2, i));
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.SecInfoReporterImpl", "post report cssi task error: %s", th.toString());
        }
    }

    /* renamed from: MB */
    public void mo182026MB(byte[] bArr) {
        if (bArr == null) {
            Log.m105920e("MicroMsg.SecInfoReporterImpl", "data is null.");
            return;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = C118418g.INSTANCE.Z10("P\u001f\u001a\u0013V\u001a\u0010\u0018X\u0019\u001c\u0011\u0001\u001f\u001c\u001d\bA\u000f\u0003\u0005G\u001b\u0003\u0017\u000b\u0017\u0016\u0014\u0005\u000371:29<1");
        bVar.f127069d = 8108;
        bVar.f127066a = new C49469ft3();
        bVar.f127067b = new C49609gt3();
        C47350c a = bVar.mo72403a();
        C49469ft3 ft32 = (C49469ft3) a.f127055a.f127080a;
        ft32.f133677d = 2;
        ft32.f133678e = new C89349b(bArr, 0, bArr.length);
        C117407d.INSTANCE.idkeyStat(416, 3, 1, false);
        C89144l0.m111429e(a, new C35720d(this), false);
    }

    public void Tj0() {
        new ReportCCDataByPayEvent().publish();
    }

    /* renamed from: VE */
    public boolean mo182028VE(int i, long j) {
        boolean z;
        C64223a43 a432 = C118138e.f353153a;
        synchronized (C118138e.class) {
            if (j <= 0) {
                Log.m105929w("MicroMsg.SecInfoReporterImpl", "bad interval: %s", Long.valueOf(j));
            } else {
                if (C118138e.f353153a == null) {
                    C118138e.m166668c();
                }
                C64251b43 a = C118138e.m166666a(i);
                if (a == null) {
                    a = new C64251b43();
                    a.f182209d = i;
                    a.f182210e = 0;
                    C118138e.f353153a.f182026d.add(a);
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = a.f182210e;
                if (currentTimeMillis < j2 || currentTimeMillis - j2 > j) {
                    a.f182210e = currentTimeMillis;
                    a.f182211f = 1;
                    C118138e.m166671f();
                    z = true;
                }
            }
            z = false;
        }
        Log.m105925i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReportForRoutine called, res: %s, cycleTag:%d", Boolean.valueOf(z), Integer.valueOf(i));
        return z;
    }

    public void Vp0(int i) {
        byte[] d = C114829e.C114830a.m161736d(EasyGoCode.ReleaseErrCode.UNKNOWN_ERR);
        if (d != null) {
            try {
                lx4 lx4 = new lx4();
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(d);
                lx4.f354117f = qv32;
                Log.m105918d("MicroMsg.SecInfoReporterImpl", String.format("[debug] ccd data len = %d ctx=%d in finder", new Object[]{Integer.valueOf(d.length), Integer.valueOf(i)}));
                wx0(i, lx4.toByteArray());
            } catch (Throwable unused) {
            }
            Log.m105924i("MicroMsg.SecInfoReporterImpl", "[+] report finder through cgi, type: sec");
            return;
        }
        Log.m105920e("MicroMsg.SecInfoReporterImpl", "[-] data is null.");
    }

    /* renamed from: Y8 */
    public void mo182030Y8(byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            Log.m105928w("MicroMsg.SecInfoReporterImpl", "[-] turingOwnerData is null.");
            return;
        }
        try {
            C64564mw mwVar = new C64564mw();
            mwVar.f184397d = new C89349b("".getBytes());
            mwVar.f184398e = 1;
            mwVar.f184399f = new C89349b(bArr, 0, bArr.length);
            mwVar.f184401h = 2;
            mwVar.f184400g = System.currentTimeMillis() / 1000;
            mwVar.f184402i = 0;
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(mwVar.toByteArray());
            lx4.f354124p = qv32;
            wx0(0, lx4.toByteArray());
            Log.m105925i("MicroMsg.SecInfoReporterImpl", "[+] report turing owner through cgi, len: %d, type: sec", Integer.valueOf(bArr.length));
        } catch (Throwable unused) {
            Log.m105920e("MicroMsg.SecInfoReporterImpl", "[-] report turing owner error");
        }
    }

    /* renamed from: ZB */
    public void mo182031ZB(byte[] bArr) {
        if (!Util.isNullOrNil(bArr)) {
            ReportTuringOwnerDataEvent reportTuringOwnerDataEvent = new ReportTuringOwnerDataEvent();
            reportTuringOwnerDataEvent.f78930d.f78931a = bArr;
            reportTuringOwnerDataEvent.publish();
        }
    }

    /* renamed from: dZ */
    public boolean mo182032dZ(int i, long j) {
        boolean z;
        synchronized (this) {
            StringBuilder reverse = new StringBuilder("gsmron").reverse();
            reverse.append(new StringBuilder("atadtsurt_").reverse().toString());
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(reverse.toString());
            long j2 = mmkv.getLong(String.format("%s", new Object[]{Integer.valueOf(i)}), 0);
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 != 0) {
                if (currentTimeMillis >= j2) {
                    if (currentTimeMillis - j2 > j) {
                        mmkv.putLong(String.format("%s", new Object[]{Integer.valueOf(i)}), currentTimeMillis).apply();
                        z = true;
                        Log.m105925i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReport2 called, res: %s", Boolean.valueOf(z));
                    }
                    z = false;
                    Log.m105925i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReport2 called, res: %s", Boolean.valueOf(z));
                }
            }
            mmkv.putLong(String.format("%s", new Object[]{Integer.valueOf(i)}), currentTimeMillis).apply();
            if (i2 == 0) {
                z = true;
                Log.m105925i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReport2 called, res: %s", Boolean.valueOf(z));
            }
            z = false;
            Log.m105925i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReport2 called, res: %s", Boolean.valueOf(z));
        }
        return z;
    }

    /* renamed from: dk */
    public void mo182033dk(int i, int i2) {
        byte[] d = C114829e.C114830a.m161736d(i2);
        byte[] g902 = C118418g.INSTANCE.g90();
        if (d != null) {
            try {
                lx4 lx4 = new lx4();
                if (g902 != null) {
                    C64564mw mwVar = new C64564mw();
                    mwVar.f184397d = new C89349b("".getBytes());
                    mwVar.f184398e = 1;
                    mwVar.f184399f = new C89349b(g902);
                    mwVar.f184401h = 2;
                    mwVar.f184400g = System.currentTimeMillis() / 1000;
                    mwVar.f184402i = 0;
                    byte[] byteArray = mwVar.toByteArray();
                    Log.m105918d("MicroMsg.SecInfoReporterImpl", String.format("[debug] tur ccd data len = %d", new Object[]{Integer.valueOf(byteArray.length)}));
                    C51018qv3 qv32 = new C51018qv3();
                    qv32.mo73350k(byteArray);
                    lx4.f354120i = qv32;
                } else {
                    Log.m105918d("MicroMsg.SecInfoReporterImpl", String.format("[debug] tur ccd data is null ", new Object[0]));
                }
                C51018qv3 qv33 = new C51018qv3();
                qv33.mo73350k(d);
                lx4.f354117f = qv33;
                Log.m105918d("MicroMsg.SecInfoReporterImpl", String.format("[debug] ccd data len = %d", new Object[]{Integer.valueOf(d.length)}));
                wx0(i, lx4.toByteArray());
            } catch (Throwable unused) {
            }
            Log.m105925i("MicroMsg.SecInfoReporterImpl", "[+] report through cgi, type: sec, ctx: %s", Integer.valueOf(i));
            return;
        }
        Log.m105920e("MicroMsg.SecInfoReporterImpl", "[-] data is null.");
    }

    /* renamed from: ez */
    public void mo182034ez(String str, byte[] bArr) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.SecInfoReporterImpl", "[-] behaviorID or data is null.");
            return;
        }
        try {
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(str.getBytes());
            lx4.f354122n = qv32;
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(bArr);
            lx4.f354123o = qv33;
            wx0(540999687, lx4.toByteArray());
            Log.m105925i("MicroMsg.SecInfoReporterImpl", "[+] report sensor scene info through cgi, len: %d, type: sec", Integer.valueOf(bArr.length));
        } catch (Throwable unused) {
        }
    }

    public void fl0(String str) {
        f353146d.post(new C118136b(this, str));
    }

    public void gk0(Intent intent) {
        if (intent != null) {
            try {
                lx4 lx4 = new lx4();
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(C114829e.C114830a.m161738f(intent));
                lx4.f354126r = qv32;
                wx0(540999696, lx4.toByteArray());
            } catch (Throwable th) {
                Log.m105928w("MicroMsg.SecInfoReporterImpl", "report app info error + " + th.toString());
            }
        }
    }

    /* renamed from: oK */
    public void mo182037oK(int i, int i2) {
        if (i2 != 0) {
            boolean b = C118138e.m166667b(i2, 86400000, 1);
            Log.m105925i("MicroMsg.SecInfoReporterImpl", "[+] isTimeToReport called, res: %s", Boolean.valueOf(b));
            if (!b) {
                return;
            }
        }
        ReportCCDataByFinderEvent reportCCDataByFinderEvent = new ReportCCDataByFinderEvent();
        reportCCDataByFinderEvent.f78922d.f78923a = i;
        reportCCDataByFinderEvent.publish();
    }

    /* renamed from: uB */
    public void mo182038uB(String str, byte[] bArr) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(bArr)) {
            ReportSensorDataEvent reportSensorDataEvent = new ReportSensorDataEvent();
            ReportSensorDataEvent.C28803a aVar = reportSensorDataEvent.f78927d;
            aVar.f78928a = bArr;
            aVar.f78929b = str;
            reportSensorDataEvent.publish();
        }
    }

    /* renamed from: vc */
    public void mo182039vc() {
        byte[] d = C114829e.C114830a.m161736d(32);
        if (d != null) {
            try {
                lx4 lx4 = new lx4();
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(d);
                lx4.f354117f = qv32;
                Log.m105918d("MicroMsg.SecInfoReporterImpl", String.format("[debug] ccd data len = %d in yap", new Object[]{Integer.valueOf(d.length)}));
                wx0(540999683, lx4.toByteArray());
            } catch (Throwable unused) {
            }
            Log.m105924i("MicroMsg.SecInfoReporterImpl", "[+] report yap through cgi, type: sec");
            return;
        }
        Log.m105920e("MicroMsg.SecInfoReporterImpl", "[-] data is null.");
    }

    public void vo0(int i) {
        String[] split;
        int i2 = i;
        C118426e0 e0Var = new C118426e0();
        e0Var.f353962d = Build.MANUFACTURER;
        e0Var.f353963e = C87203t.m108275k();
        e0Var.f353964f = Build.VERSION.RELEASE;
        e0Var.f353965g = Build.VERSION.INCREMENTAL;
        e0Var.f353966h = Build.DISPLAY;
        if (i2 == -2147483646) {
            e0Var.f353967i = Build.FINGERPRINT;
            String te02 = C118418g.INSTANCE.te0(false);
            if (!TextUtils.isEmpty(te02) && (split = te02.split(",")) != null) {
                for (String add : split) {
                    e0Var.f353968j.add(add);
                }
            }
        }
        try {
            byte[] byteArray = e0Var.toByteArray();
            C64564mw mwVar = new C64564mw();
            mwVar.f184397d = new C89349b("".getBytes());
            mwVar.f184398e = 1;
            byte[] vx02 = vx0(byteArray, 0, byteArray.length);
            if (vx02 == null) {
                mwVar.f184399f = new C89349b("compress data failed".getBytes());
                mwVar.f184401h = 1;
                mwVar.f184400g = System.currentTimeMillis() / 1000;
                mwVar.f184402i = 1;
            } else {
                if (vx02.length > 5120) {
                    C115669n.INSTANCE.idkeyStat(633, 4, 1, false);
                    Log.m105918d("MicroMsg.SecInfoReporterImpl", "compressed and base64 result is still too large with length " + vx02.length);
                }
                mwVar.f184399f = new C89349b(vx02, 0, vx02.length);
                mwVar.f184401h = 4;
                mwVar.f184400g = System.currentTimeMillis() / 1000;
                mwVar.f184402i = 0;
            }
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(mwVar.toByteArray());
            lx4.f354119h = qv32;
            byte[] byteArray2 = lx4.toByteArray();
            Log.m105918d("MicroMsg.SecInfoReporterImpl", String.format("[debug] report di info msg: len = %d \n", new Object[]{Integer.valueOf(byteArray2.length)}));
            wx0(i2, byteArray2);
        } catch (Throwable unused) {
        }
    }

    public final byte[] vx0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            Deflater deflater = new Deflater();
            deflater.setLevel(9);
            deflater.setInput(bArr, i, i2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
            deflater.finish();
            byte[] bArr2 = new byte[4096];
            while (!deflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.SecInfoReporterImpl", e, "exception when compressing dump maps", new Object[0]);
            }
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalArgumentException("dataIn is null.");
    }

    public void wx0(int i, byte[] bArr) {
        if (bArr == null) {
            Log.m105920e("MicroMsg.SecInfoReporterImpl", "data is null.");
            return;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = C118418g.INSTANCE.Z10("Q\u001e\u001b\u0012W\u001b\u0011\u0019Y\u0018\u001d\u0010\u0000\u001e\u001d\u001c\t@\u000e\u0002\u0004F\u001a\u0002\u0016\n\u0016\u0017\u0001\r\t:0)?3?:3");
        bVar.f127069d = 771;
        bVar.f127066a = new C51588ur3();
        bVar.f127067b = new C51730vr3();
        C47350c a = bVar.mo72403a();
        C51588ur3 ur32 = (C51588ur3) a.f127055a.f127080a;
        ur32.f143050e = i;
        ur32.f143049d = new C89349b("".getBytes());
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        ur32.f143051f = qv32;
        C117407d.INSTANCE.idkeyStat(416, 0, 1, false);
        C89144l0.m111429e(a, new C35719c(this, i), false);
    }
}
