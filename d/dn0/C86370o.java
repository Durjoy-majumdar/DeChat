package dn0;

import an0.C79592a;
import android.net.Uri;
import android.os.StatFs;
import android.text.TextUtils;
import android.webkit.URLUtil;
import bn0.C79714a;
import bn0.C79724h;
import bn0.C79725i;
import cn0.C80079e;
import cn0.C80087k;
import cn0.C80098m;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import en0.C86586a;
import fn0.C87000e;
import fn0.C87002g;
import fn0.C87007l;
import fn0.C87008m;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import lu0.C88650c;
import ym0.C91512j;

/* renamed from: dn0.o */
public class C86370o {

    /* renamed from: m */
    public static AtomicInteger f251105m = new AtomicInteger(10000);

    /* renamed from: n */
    public static AtomicInteger f251106n = new AtomicInteger(10000);

    /* renamed from: a */
    public int f251107a = 0;

    /* renamed from: b */
    public boolean f251108b = true;

    /* renamed from: c */
    public C79714a f251109c;

    /* renamed from: d */
    public int f251110d;

    /* renamed from: e */
    public ServerSocket f251111e;

    /* renamed from: f */
    public final ExecutorService f251112f;

    /* renamed from: g */
    public final C86377r f251113g;

    /* renamed from: h */
    public Map<String, C86359c> f251114h = new HashMap();

    /* renamed from: i */
    public ConcurrentHashMap<String, C86360d> f251115i = new ConcurrentHashMap<>(8, 0.75f, 2);

    /* renamed from: j */
    public Map<String, C86362g> f251116j = new ConcurrentHashMap();

    /* renamed from: k */
    public Map<String, C86362g> f251117k = new ConcurrentHashMap();

    /* renamed from: l */
    public Map<String, C86362g> f251118l = new ConcurrentHashMap();

    /* renamed from: dn0.o$a */
    public class C86371a extends C80087k {
        public C86371a(C86370o oVar) {
        }

        public C86358b getFileType() {
            return C86358b.m106987a("application/vnd.apple.mpegurl");
        }
    }

    /* renamed from: dn0.o$b */
    public final class C86372b {

        /* renamed from: a */
        public long f251119a = -1;

        /* renamed from: b */
        public boolean f251120b = false;

        /* renamed from: c */
        public C80079e f251121c = null;

        /* renamed from: d */
        public C86009m1 f251122d = null;

        public C86372b(C86370o oVar, C86369n nVar) {
        }
    }

    /* renamed from: dn0.o$c */
    public final class C86373c implements Runnable {

        /* renamed from: d */
        public Socket f251123d;

        /* renamed from: e */
        public Future<?> f251124e;

        /* renamed from: f */
        public CountDownLatch f251125f;

        public C86373c(Socket socket, CountDownLatch countDownLatch) {
            this.f251123d = socket;
            this.f251125f = countDownLatch;
        }

        public void run() {
            String str;
            Throwable th;
            try {
                this.f251125f.await();
            } catch (InterruptedException e) {
                C87002g.m108023q(6, "VideoProxy", "SocketHandler run exception, reason " + C87002g.m108014h(e, false), (Throwable) null);
            }
            C86375p pVar = new C86375p();
            pVar.f251130a = this.f251124e;
            C86370o oVar = C86370o.this;
            Socket socket = this.f251123d;
            oVar.getClass();
            String str2 = "VideoProxy/" + pVar.f251135f;
            String str3 = str2 + "/";
            C87002g.m108023q(3, str2, "process socket start", (Throwable) null);
            try {
                InputStream inputStream = socket.getInputStream();
                if (inputStream == null) {
                    C87002g.m108023q(6, str2, "socket inputstream is null", (Throwable) null);
                    return;
                }
                C87000e eVar = new C87000e(inputStream, str3);
                String str4 = eVar.f252484f;
                String b = eVar.mo121402b("url");
                String b2 = eVar.mo121402b(DownloadInfo.PRIORITY);
                String b3 = eVar.mo121402b("id");
                String b4 = eVar.mo121402b("secret");
                String b5 = eVar.mo121402b("enableCache");
                String b6 = eVar.mo121402b(DownloadInfo.CONTENTTYPE);
                if (b == null) {
                    C87002g.m108023q(6, str2, "invalid request detected, sourceUrl is null", (Throwable) null);
                    return;
                }
                if (oVar.f251108b) {
                    if (b4 == null) {
                        C87002g.m108023q(6, str2, "invalid request detected, token is null", (Throwable) null);
                        return;
                    }
                    try {
                        String a = C87007l.m108031a("des", C87007l.m108033c(), b4);
                        String v = C87002g.m108028v(b);
                        if (a == null || !a.equals(v)) {
                            th = null;
                            try {
                                C87002g.m108023q(6, str2, "invalid request detected, key is illegal", (Throwable) null);
                                return;
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        th = null;
                        C87002g.m108023q(5, str2, "decode token error", th);
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = eVar.f252483e.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append("\n");
                }
                String sb4 = sb.toString();
                C87002g.m108023q(4, str2, C87002g.m108029w("requestHeader:" + sb4, (String) null), (Throwable) null);
                OutputStream outputStream = socket.getOutputStream();
                if (outputStream == null) {
                    C87002g.m108023q(6, str2, "socket outputstream is null", (Throwable) null);
                    return;
                }
                long[] c = C87000e.m108002c(sb4);
                pVar.f251146q = str4;
                pVar.f251144o = b;
                pVar.f251143n = C87002g.m108028v(b);
                Socket socket2 = socket;
                pVar.f251138i = c[0];
                pVar.f251139j = c[1];
                pVar.f251142m = b3;
                pVar.f251145p = b6;
                pVar.f251147r = str3;
                if (TextUtils.isEmpty(b5) || !b5.equals("1")) {
                    pVar.f251141l = false;
                } else {
                    pVar.f251141l = true;
                }
                if (TextUtils.isEmpty(b2)) {
                    pVar.f251137h = -1;
                } else if (b2.equals(String.valueOf(90))) {
                    pVar.f251137h = 90;
                } else if (b2.equals(String.valueOf(10))) {
                    pVar.f251137h = 10;
                } else {
                    pVar.f251137h = -1;
                }
                if (pVar.f251137h == -1) {
                    C87002g.m108023q(5, str2, "videoRequest priority is not specified", (Throwable) null);
                }
                C87002g.m108023q(4, str2, "processSocket, videoRequest=" + pVar, (Throwable) null);
                if (pVar.f251137h == 90) {
                    oVar.f251113g.mo120796b(pVar.f251143n, pVar);
                }
                oVar.f251113g.mo120795a(b, pVar);
                oVar.mo120768e(socket2, b, outputStream, pVar, inputStream);
            } catch (Exception e2) {
                oVar.f251107a++;
                C87002g.m108023q(5, str2, "processSocket, proxyExceptionCount=" + oVar.f251107a, (Throwable) null);
                long j = -99999;
                if (e2 instanceof C80098m) {
                    j = -99799;
                    str = "IllegalDataSpecException";
                } else if (e2 instanceof ArrayIndexOutOfBoundsException) {
                    j = -99699;
                    str = "ArrayIndexOutOfBoundsException";
                } else {
                    str = "";
                }
                String str5 = str;
                long f = C87002g.m108012f(4, j);
                long e3 = C87002g.m108011e(f, j);
                int currentTimeMillis = (int) (System.currentTimeMillis() - pVar.f251150u);
                C86586a aVar = C79592a.m96648a().f233411n;
                String str6 = pVar.f251142m;
                String str7 = pVar.f251144o;
                int i = pVar.f251137h;
                long j2 = pVar.f251138i;
                long j3 = pVar.f251139j;
                synchronized (pVar) {
                    Exception exc = e2;
                    long j4 = j;
                    long j5 = f;
                    ((C88650c) aVar).mo123088a(str6, str7, i, j2, j3, pVar.f251140k, pVar.f251136g, pVar.f251146q, (long) (((float) (((long) pVar.f251149t) * 1000)) / ((float) (1024 * (System.currentTimeMillis() - pVar.f251150u)))), j5, j4, e3, str5, currentTimeMillis);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("processSocket, unexpected proxy error ");
                    sb5.append(exc.getMessage());
                    Exception exc2 = exc;
                    sb5.append(C87002g.m108014h(exc2, false));
                    C87002g.m108023q(6, str2, sb5.toString(), exc2);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* renamed from: dn0.o$d */
    public final class C86374d implements Runnable {

        /* renamed from: d */
        public CountDownLatch f251127d;

        public C86374d(CountDownLatch countDownLatch) {
            this.f251127d = countDownLatch;
        }

        public void run() {
            this.f251127d.countDown();
            C86370o oVar = C86370o.this;
            oVar.getClass();
            C87002g.m108023q(3, "VideoProxy", "proxy server wait for request", (Throwable) null);
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket accept = oVar.f251111e.accept();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    C86373c cVar = new C86373c(accept, countDownLatch);
                    Future<?> submit = ((AbstractExecutorService) oVar.f251112f).submit(cVar);
                    C87008m.C87010b bVar = (C87008m.C87010b) oVar.f251112f;
                    ((ThreadPoolExecutor) oVar.f251112f).setCorePoolSize(bVar.getActiveCount() + bVar.getQueue().size() + 2);
                    cVar.f251124e = submit;
                    countDownLatch.countDown();
                } catch (SocketException e) {
                    if (oVar.f251111e.isClosed()) {
                        C87002g.m108023q(3, "VideoProxy", "proxy server is closed", (Throwable) null);
                    } else {
                        C87002g.m108023q(6, "VideoProxy", "proxy server is quit, reason SOCKET:" + C87002g.m108014h(e, false), (Throwable) null);
                    }
                } catch (IOException e2) {
                    C87002g.m108023q(6, "VideoProxy", "proxy server is quit, reason IO:" + C87002g.m108014h(e2, false), (Throwable) null);
                } catch (OutOfMemoryError e3) {
                    C87002g.m108023q(6, "VideoProxy", "proxy server is quit, reason OOM:" + C87002g.m108014h(e3, false), (Throwable) null);
                } catch (Throwable th) {
                    C87002g.m108023q(3, "VideoProxy", "shutdown thread pool", (Throwable) null);
                    ((ThreadPoolExecutor) oVar.f251112f).shutdownNow();
                    C87002g.m108023q(3, "VideoProxy", "proxy server stopped", (Throwable) null);
                    throw th;
                }
            }
            C87002g.m108023q(3, "VideoProxy", "shutdown thread pool", (Throwable) null);
            ((ThreadPoolExecutor) oVar.f251112f).shutdownNow();
            C87002g.m108023q(3, "VideoProxy", "proxy server stopped", (Throwable) null);
        }
    }

    public C86370o() {
        String b = C79592a.m96648a().mo109706b();
        C87002g.m108023q(4, "VideoProxy", "initCache, cache dir:" + C79592a.m96648a().mo109706b(), (Throwable) null);
        if (TextUtils.isEmpty(b)) {
            this.f251109c = null;
            ((C88650c) C79592a.m96648a().f233411n).mo123093g(-1);
            C91512j.this.f262321e = false;
        } else {
            long j = -1;
            if (!TextUtils.isEmpty(b)) {
                try {
                    StatFs statFs = new StatFs(b);
                    j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
                } catch (Exception unused) {
                }
            }
            long min = Math.min(j, C79592a.m96648a().f233407j);
            C87002g.m108023q(4, "VideoProxy", "initCache, cache availableSpace=" + min, (Throwable) null);
            C79724h hVar = new C79724h(min);
            C87008m.m108035b(new C86369n(this, b, min, hVar), "VideoProxy");
            this.f251109c = new C79725i(new C86009m1(b), hVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("initCache, cache:");
        String str = this.f251109c;
        sb.append(str == null ? "null" : str);
        C87002g.m108023q(4, "VideoProxy", sb.toString(), (Throwable) null);
        this.f251113g = new C86377r();
        this.f251112f = new C87008m.C87010b(10, 10, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        try {
            ServerSocket serverSocket = new ServerSocket(C87002g.m108008b(5), 10, InetAddress.getByName("0.0.0.0"));
            this.f251111e = serverSocket;
            this.f251110d = serverSocket.getLocalPort();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new C86374d(countDownLatch), "video_proxy_wait_for_connection_thread").start();
            countDownLatch.await();
            C87002g.m108023q(4, "VideoProxy", "proxy server start success, port:" + this.f251110d, (Throwable) null);
            ((C88650c) C79592a.m96648a().f233411n).mo123093g(0);
            ((C91512j.C91513a) C79592a.m96648a().f233412o).getClass();
        } catch (IOException | IllegalStateException | InterruptedException e) {
            ((ThreadPoolExecutor) this.f251112f).shutdown();
            C87002g.m108023q(6, "VideoProxy", "proxy server start failed " + C87002g.m108014h(e, false), (Throwable) null);
            ((C88650c) C79592a.m96648a().f233411n).mo123093g(-2);
            C91512j.this.f262321e = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v3, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v4, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v6, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v7, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v8, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v9, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v11, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v12, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v13, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v14, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v17, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v15, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v18, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v16, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v19, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v17, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v20, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v18, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v19, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v21, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v20, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v22, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v21, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v22, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v24, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v23, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v24, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v25, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v26, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v26, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v27, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v27, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v28, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v28, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v29, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v30, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v29, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v31, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v32, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v33, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v34, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v31, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v35, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v36, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v37, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v38, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v32, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v39, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v33, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v40, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v41, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v42, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v43, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v44, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v45, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v34, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v46, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v35, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v47, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v48, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v49, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v36, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v50, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v51, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v52, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v53, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v39, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v54, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v55, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v41, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v56, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v57, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v58, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v43, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v59, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v60, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v61, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v45, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v62, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v63, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v64, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v47, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v65, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v66, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v48, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v67, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v49, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v68, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v50, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v69, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v51, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v70, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v71, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v52, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v72, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v53, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v73, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v74, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v54, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v75, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v55, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v76, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v56, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v77, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v57, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v78, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v58, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v79, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v93, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r17v2, types: [com.tencent.mm.vfs.m1] */
    /* JADX WARNING: type inference failed for: r17v3 */
    /* JADX WARNING: type inference failed for: r17v12 */
    /* JADX WARNING: type inference failed for: r17v23 */
    /* JADX WARNING: type inference failed for: r17v25 */
    /* JADX WARNING: type inference failed for: r17v30 */
    /* JADX WARNING: type inference failed for: r17v37 */
    /* JADX WARNING: type inference failed for: r17v38 */
    /* JADX WARNING: type inference failed for: r17v40 */
    /* JADX WARNING: type inference failed for: r17v42 */
    /* JADX WARNING: type inference failed for: r17v44 */
    /* JADX WARNING: type inference failed for: r17v46 */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04e0, code lost:
        if (r9.contains(".aac") != false) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05e4, code lost:
        r43 = r1;
        r39 = r2;
        r16 = r6;
        r46 = r11;
        r33 = r13;
        r32 = r14;
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x08fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08fd, code lost:
        r16 = r6;
        r2 = r7;
        r6 = r13;
        r8 = r14;
        r3 = r15;
        r7 = r20;
        r5 = 6;
        r17 = null;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x090d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x090e, code lost:
        r16 = r6;
        r2 = r7;
        r6 = r13;
        r8 = r14;
        r3 = r15;
        r7 = r20;
        r5 = 6;
        r17 = null;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x091f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0920, code lost:
        r16 = r6;
        r2 = r7;
        r6 = r13;
        r8 = r14;
        r3 = r15;
        r7 = r20;
        r5 = 6;
        r17 = null;
        r1 = r0;
        r4 = null;
        r39 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0938, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0939, code lost:
        r16 = r6;
        r2 = r7;
        r6 = r13;
        r8 = r14;
        r3 = r15;
        r7 = r20;
        r5 = 6;
        r17 = null;
        r1 = r0;
        r9 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x094d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x094e, code lost:
        r16 = r6;
        r2 = r7;
        r6 = r13;
        r8 = r14;
        r3 = r15;
        r7 = r20;
        r5 = 6;
        r17 = null;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x095c, code lost:
        r39 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0962, code lost:
        r4 = null;
        r39 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0255 A[SYNTHETIC, Splitter:B:103:0x0255] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x07f9  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x090d A[ExcHandler: Exception (r0v12 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:25:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x094d A[ExcHandler: all (r0v11 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:25:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x096c A[Catch:{ all -> 0x09fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x09db  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0a1e A[Catch:{ all -> 0x0aa9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a8b A[SYNTHETIC, Splitter:B:443:0x0a8b] */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0ab3 A[SYNTHETIC, Splitter:B:452:0x0ab3] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0ad1 A[SYNTHETIC, Splitter:B:457:0x0ad1] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d8 A[SYNTHETIC, Splitter:B:75:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f1 A[SYNTHETIC, Splitter:B:81:0x01f1] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0201 A[SYNTHETIC, Splitter:B:86:0x0201] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0211 A[SYNTHETIC, Splitter:B:91:0x0211] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.vfs.C86009m1 mo120764a(cn0.C80079e r45, cn0.C80081g r46, java.lang.String r47, dn0.C86375p r48) {
        /*
            r44 = this;
            r7 = r44
            r8 = r47
            r9 = r48
            java.lang.String r10 = "#"
            java.lang.String r11 = "generateLocalPlaylistFile, finally deletePlayListFile "
            java.lang.String r12 = "generateLocalPlaylistFile, error close PlayListFile: "
            java.lang.String r13 = "generateLocalPlaylistFile, error close reader: "
            java.lang.String r14 = ", deleteSuccess:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "VideoProxy/"
            r1.append(r2)
            int r2 = r48.mo120781k()
            r1.append(r2)
            java.lang.String r15 = r1.toString()
            an0.a r1 = an0.C79592a.m96648a()
            java.lang.String r1 = r1.mo109708d()
            r6 = 6
            r5 = 0
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = "generateLocalPlaylistFile error: dirPath is null"
            fn0.C87002g.m108022p(r6, r15, r1)
            return r5
        L_0x0037:
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r3 = r2.getPath()
            r4 = 0
            if (r3 == 0) goto L_0x005c
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r4, r4)
            java.lang.String r6 = r2.getPath()
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x005c
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r3)
            android.net.Uri r2 = r2.build()
        L_0x005c:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r6 = r3.mo177799l(r2, r5)
            boolean r17 = r6.mo177810a()
            if (r17 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            com.tencent.mm.vfs.FileSystem$c r5 = r6.f348991a
            java.lang.String r4 = r6.f348992b
            boolean r4 = r5.mo119948x(r4)
        L_0x0071:
            if (r4 != 0) goto L_0x0085
            com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r2, r6)
            boolean r3 = r2.mo177810a()
            if (r3 != 0) goto L_0x007e
            goto L_0x0085
        L_0x007e:
            com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            r3.mo119937g(r2)
        L_0x0085:
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            long r3 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicInteger r1 = f251106n
            int r1 = r1.incrementAndGet()
            r19 = r11
            r20 = r12
            long r11 = (long) r1
            long r3 = r3 + r11
            r2.append(r3)
            java.lang.String r1 = ".m3u8"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r6.<init>((java.lang.String) r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "generateLocalPlaylistFile:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r11 = 4
            fn0.C87002g.m108022p(r11, r15, r1)
            int r1 = r48.mo120777g()
            r2 = 10
            if (r1 != r2) goto L_0x00d2
            r1 = 1
            goto L_0x00d3
        L_0x00d2:
            r1 = 0
        L_0x00d3:
            java.lang.String r5 = r48.mo120783m()
            int r3 = r48.mo120777g()
            if (r3 != r2) goto L_0x00df
            r3 = 1
            goto L_0x00e0
        L_0x00df:
            r3 = 3
        L_0x00e0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "generateLocalPlaylistFile, preloadTsMaxCount="
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            fn0.C87002g.m108022p(r11, r15, r2)
            int r2 = r48.mo120774d()
            r2 = r2 | 5
            r9.mo120787q(r2)
            r2 = 34
            java.lang.String r4 = "URI=\"(.+?)\""
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r2)
            r45.mo109837b(r46)     // Catch:{ f -> 0x0a01, Exception -> 0x090d, all -> 0x094d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ f -> 0x0938, Exception -> 0x090d, all -> 0x094d }
            cn0.f r12 = new cn0.f     // Catch:{ f -> 0x0938, Exception -> 0x090d, all -> 0x094d }
            java.lang.String r11 = "UTF-8"
            r23 = r1
            r1 = r45
            r12.<init>(r1, r11)     // Catch:{ f -> 0x091f, Exception -> 0x090d, all -> 0x08fc }
            r2.<init>(r12)     // Catch:{ f -> 0x091f, Exception -> 0x090d, all -> 0x08fc }
            java.io.OutputStream r11 = com.tencent.p014mm.vfs.C86013q1.m106426H(r6)     // Catch:{ f -> 0x08e6, Exception -> 0x08cf, all -> 0x08bc }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ f -> 0x08a8, Exception -> 0x0894, all -> 0x0880 }
            r12.<init>()     // Catch:{ f -> 0x08a8, Exception -> 0x0894, all -> 0x0880 }
            java.lang.String r1 = "====================== start original m3u8 content ======================"
            r24 = r3
            r3 = 4
            fn0.C87002g.m108022p(r3, r15, r1)     // Catch:{ f -> 0x08a8, Exception -> 0x0894, all -> 0x0880 }
            r1 = 0
            r25 = 1
            r26 = -1
            r27 = -1
            r28 = 0
            r29 = 0
        L_0x0134:
            boolean r30 = java.lang.Thread.interrupted()     // Catch:{ f -> 0x08a8, Exception -> 0x0894, all -> 0x0880 }
            r22 = 1
            r30 = r30 ^ 1
            if (r30 == 0) goto L_0x05e4
            boolean r31 = r48.mo120790t()     // Catch:{ f -> 0x05d2, Exception -> 0x05c0, all -> 0x05ae }
            if (r31 != 0) goto L_0x05e4
            r31 = r6
            java.lang.String r6 = r2.readLine()     // Catch:{ f -> 0x059b, Exception -> 0x0588, all -> 0x0579 }
            if (r6 == 0) goto L_0x056a
            r3 = 4
            fn0.C87002g.m108022p(r3, r15, r6)     // Catch:{ f -> 0x059b, Exception -> 0x0588, all -> 0x0579 }
            boolean r3 = r6.startsWith(r10)     // Catch:{ f -> 0x059b, Exception -> 0x0588, all -> 0x0579 }
            r32 = r14
            java.lang.String r14 = "&enableCache=[VALUE_CACHE_PLACEHOLDER]"
            r33 = r13
            java.lang.String r13 = "&id="
            r46 = r11
            java.lang.String r11 = "\n"
            if (r3 == 0) goto L_0x0450
            java.lang.String r3 = r6.toUpperCase()     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            r34 = r1
            java.lang.String r1 = "#EXTM3U"
            boolean r1 = r3.equals(r1)     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            if (r1 == 0) goto L_0x019a
            java.util.Map<java.lang.String, dn0.g> r1 = r7.f251116j     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            boolean r1 = r1.containsKey(r5)     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            if (r1 != 0) goto L_0x019a
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r1.<init>()     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            java.util.Map<java.lang.String, dn0.g> r3 = r7.f251116j     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r30 = r1
            dn0.g r1 = new dn0.g     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r1.<init>()     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r3.put(r5, r1)     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            goto L_0x019c
        L_0x018e:
            r0 = move-exception
            r1 = r0
            goto L_0x022f
        L_0x0192:
            r0 = move-exception
            r1 = r0
            goto L_0x0239
        L_0x0196:
            r0 = move-exception
            r1 = r0
            goto L_0x0241
        L_0x019a:
            r30 = r34
        L_0x019c:
            java.lang.String r1 = r6.toUpperCase()     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            java.lang.String r3 = "#EXT-X-STREAM-INF"
            boolean r1 = r1.startsWith(r3)     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            if (r1 == 0) goto L_0x01cc
            if (r28 != 0) goto L_0x01bd
            java.lang.String r1 = "find master play list"
            r3 = 4
            fn0.C87002g.m108022p(r3, r15, r1)     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            an0.a r1 = an0.C79592a.m96648a()     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            en0.a r1 = r1.mo109709e()     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            lu0.c r1 = (lu0.C88650c) r1     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r1.mo123089c()     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
        L_0x01bd:
            int r1 = r48.mo120774d()     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r1 = r1 & -5
            r9.mo120787q(r1)     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r23 = 1
            r25 = 0
            r28 = 1
        L_0x01cc:
            java.lang.String r1 = r6.toUpperCase()     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            java.lang.String r3 = "#EXT-X-ENDLIST"
            boolean r1 = r1.startsWith(r3)     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            if (r1 == 0) goto L_0x01e5
            int r1 = r48.mo120774d()     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r1 = r1 & -5
            r9.mo120787q(r1)     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r23 = 1
            r25 = 0
        L_0x01e5:
            java.lang.String r1 = r6.toUpperCase()     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            java.lang.String r3 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r1 = r1.startsWith(r3)     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            if (r1 == 0) goto L_0x01f5
            int r26 = fn0.C87002g.m108026t(r6)     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
        L_0x01f5:
            java.lang.String r1 = r6.toUpperCase()     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            java.lang.String r3 = "#EXT-X-TARGETDURATION"
            boolean r1 = r1.startsWith(r3)     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            if (r1 == 0) goto L_0x0205
            int r27 = fn0.C87002g.m108026t(r6)     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
        L_0x0205:
            java.lang.String r1 = r6.toUpperCase()     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            java.lang.String r3 = "#EXT-X-PLAYLIST-TYPE"
            boolean r1 = r1.startsWith(r3)     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            if (r1 == 0) goto L_0x0249
            java.lang.String r1 = fn0.C87002g.m108027u(r6)     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            java.lang.String r1 = r1.toUpperCase()     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            java.lang.String r3 = "VOD"
            boolean r1 = r1.equals(r3)     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            if (r1 == 0) goto L_0x0249
            int r1 = r48.mo120774d()     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r1 = r1 & -5
            r9.mo120787q(r1)     // Catch:{ f -> 0x0196, Exception -> 0x0192, all -> 0x018e }
            r23 = 1
            r25 = 0
            goto L_0x0249
        L_0x022f:
            r39 = r2
            r24 = r15
            r16 = r31
        L_0x0235:
            r35 = 0
            goto L_0x04e3
        L_0x0239:
            r39 = r2
            r16 = r31
            r17 = 0
            goto L_0x0322
        L_0x0241:
            r39 = r2
            r16 = r31
            r17 = 0
            goto L_0x033b
        L_0x0249:
            java.lang.String r1 = r6.toUpperCase()     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            java.lang.String r3 = "#EXT-X-KEY"
            boolean r1 = r1.startsWith(r3)     // Catch:{ f -> 0x0446, Exception -> 0x043c, all -> 0x0434 }
            if (r1 == 0) goto L_0x034e
            java.util.regex.Matcher r1 = r4.matcher(r6)     // Catch:{ f -> 0x0333, Exception -> 0x031a, all -> 0x0310 }
            boolean r3 = r1.matches()     // Catch:{ f -> 0x0333, Exception -> 0x031a, all -> 0x0310 }
            if (r3 == 0) goto L_0x02e9
            int r3 = r1.groupCount()     // Catch:{ f -> 0x0333, Exception -> 0x031a, all -> 0x0310 }
            if (r3 <= 0) goto L_0x02e9
            r3 = 1
            int r14 = r1.start(r3)     // Catch:{ f -> 0x0333, Exception -> 0x031a, all -> 0x0310 }
            int r1 = r1.end(r3)     // Catch:{ f -> 0x0333, Exception -> 0x031a, all -> 0x0310 }
            r18 = r4
            r3 = 0
            java.lang.String r4 = r6.substring(r3, r14)     // Catch:{ f -> 0x0333, Exception -> 0x031a, all -> 0x0310 }
            java.lang.String r14 = r6.substring(r14, r1)     // Catch:{ f -> 0x0333, Exception -> 0x031a, all -> 0x0310 }
            java.lang.String r1 = r6.substring(r1)     // Catch:{ f -> 0x0333, Exception -> 0x031a, all -> 0x0310 }
            java.lang.String r14 = fn0.C87002g.m108009c(r8, r14)     // Catch:{ f -> 0x0333, Exception -> 0x031a, all -> 0x0310 }
            r34 = 0
            r35 = 0
            java.lang.String r36 = "application/octet-stream;charset=utf-8"
            r37 = 90
            r38 = r1
            r1 = r44
            r39 = r2
            r2 = r14
            r14 = r24
            r24 = 0
            r3 = r34
            r41 = r4
            r40 = r18
            r4 = r35
            r18 = r5
            r17 = 0
            r5 = r36
            r9 = r6
            r16 = r31
            r6 = r37
            java.lang.String r1 = r1.mo120766c(r2, r3, r4, r5, r6)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            java.lang.String r2 = r48.mo120783m()     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            if (r2 == 0) goto L_0x02d8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            r2.<init>()     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            r2.append(r1)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            r2.append(r13)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            java.lang.String r1 = r48.mo120783m()     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            r2.append(r1)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            java.lang.String r1 = r2.toString()     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            r2.<init>()     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            r2.append(r1)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            java.lang.String r1 = "&enableCache=0"
            r2.append(r1)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            java.lang.String r1 = r2.toString()     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
        L_0x02d8:
            r2 = r41
            r12.append(r2)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            r12.append(r1)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            r1 = r38
            r12.append(r1)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            r12.append(r11)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            goto L_0x02fc
        L_0x02e9:
            r39 = r2
            r40 = r4
            r18 = r5
            r9 = r6
            r14 = r24
            r16 = r31
            r17 = 0
            r12.append(r9)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
            r12.append(r11)     // Catch:{ f -> 0x030d, Exception -> 0x030a, all -> 0x0307 }
        L_0x02fc:
            r7 = r14
            r24 = r15
            r22 = r40
            r21 = 1
            r35 = 0
            goto L_0x0412
        L_0x0307:
            r0 = move-exception
        L_0x0308:
            r1 = r0
            goto L_0x0316
        L_0x030a:
            r0 = move-exception
        L_0x030b:
            r1 = r0
            goto L_0x0322
        L_0x030d:
            r0 = move-exception
        L_0x030e:
            r1 = r0
            goto L_0x033b
        L_0x0310:
            r0 = move-exception
            r39 = r2
            r16 = r31
            goto L_0x0308
        L_0x0316:
            r24 = r15
            goto L_0x0235
        L_0x031a:
            r0 = move-exception
            r39 = r2
            r16 = r31
            r17 = 0
            goto L_0x030b
        L_0x0322:
            r4 = r46
            r2 = r7
            r3 = r15
            r7 = r20
            r8 = r32
            r6 = r33
            r5 = 6
            r21 = 1
            r35 = 0
            goto L_0x0966
        L_0x0333:
            r0 = move-exception
            r39 = r2
            r16 = r31
            r17 = 0
            goto L_0x030e
        L_0x033b:
            r4 = r46
            r2 = r7
            r3 = r15
            r9 = r19
            r7 = r20
            r8 = r32
            r6 = r33
            r5 = 6
            r21 = 1
            r35 = 0
            goto L_0x0a18
        L_0x034e:
            r39 = r2
            r40 = r4
            r18 = r5
            r9 = r6
            r6 = r24
            r16 = r31
            r17 = 0
            java.lang.String r1 = r9.toUpperCase()     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            java.lang.String r2 = "#EXT-X-MAP"
            boolean r1 = r1.startsWith(r2)     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            if (r1 == 0) goto L_0x0403
            r5 = r40
            java.util.regex.Matcher r1 = r5.matcher(r9)     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            boolean r2 = r1.matches()     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            if (r2 == 0) goto L_0x03f3
            int r2 = r1.groupCount()     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            if (r2 <= 0) goto L_0x03f3
            r4 = 1
            int r2 = r1.start(r4)     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            int r1 = r1.end(r4)     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            r24 = r6
            r3 = 0
            java.lang.String r6 = r9.substring(r3, r2)     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            java.lang.String r2 = r9.substring(r2, r1)     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            java.lang.String r1 = r9.substring(r1)     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            java.lang.String r2 = fn0.C87002g.m108009c(r8, r2)     // Catch:{ f -> 0x042a, Exception -> 0x0420, all -> 0x0418 }
            r21 = 0
            r22 = 0
            java.lang.String r31 = "video/MP2T"
            r34 = 90
            r42 = r1
            r1 = r44
            r35 = 0
            r3 = r21
            r21 = 1
            r4 = r22
            r22 = r5
            r5 = r31
            r7 = r24
            r24 = r15
            r15 = r6
            r6 = r34
            java.lang.String r1 = r1.mo120766c(r2, r3, r4, r5, r6)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            java.lang.String r2 = r48.mo120783m()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            if (r2 == 0) goto L_0x03e4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.<init>()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.append(r1)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.append(r13)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            java.lang.String r1 = r48.mo120783m()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.append(r1)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            java.lang.String r1 = r2.toString()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.<init>()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.append(r1)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.append(r14)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            java.lang.String r1 = r2.toString()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
        L_0x03e4:
            r12.append(r15)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r12.append(r1)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r1 = r42
            r12.append(r1)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r12.append(r11)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            goto L_0x0412
        L_0x03f3:
            r22 = r5
            r7 = r6
            r24 = r15
            r21 = 1
            r35 = 0
            r12.append(r9)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r12.append(r11)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            goto L_0x0412
        L_0x0403:
            r7 = r6
            r24 = r15
            r22 = r40
            r21 = 1
            r35 = 0
            r12.append(r9)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r12.append(r11)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
        L_0x0412:
            r13 = r17
            r11 = r30
            goto L_0x04cc
        L_0x0418:
            r0 = move-exception
            r24 = r15
        L_0x041b:
            r35 = 0
        L_0x041d:
            r1 = r0
            goto L_0x04e3
        L_0x0420:
            r0 = move-exception
            r24 = r15
        L_0x0423:
            r21 = 1
            r35 = 0
        L_0x0427:
            r1 = r0
            goto L_0x04e9
        L_0x042a:
            r0 = move-exception
            r24 = r15
        L_0x042d:
            r21 = 1
            r35 = 0
        L_0x0431:
            r1 = r0
            goto L_0x04ef
        L_0x0434:
            r0 = move-exception
            r39 = r2
            r24 = r15
            r16 = r31
            goto L_0x041b
        L_0x043c:
            r0 = move-exception
            r39 = r2
            r24 = r15
            r16 = r31
            r17 = 0
            goto L_0x0423
        L_0x0446:
            r0 = move-exception
            r39 = r2
            r24 = r15
            r16 = r31
            r17 = 0
            goto L_0x042d
        L_0x0450:
            r34 = r1
            r39 = r2
            r22 = r4
            r18 = r5
            r9 = r6
            r7 = r24
            r16 = r31
            r17 = 0
            r21 = 1
            r35 = 0
            r24 = r15
            java.lang.String r1 = ""
            boolean r1 = r1.equalsIgnoreCase(r9)     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            if (r1 != 0) goto L_0x04bf
            java.lang.String r15 = fn0.C87002g.m108009c(r8, r9)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r3 = 0
            r4 = 0
            java.lang.String r5 = "video/MP2T"
            r6 = 90
            r2 = r34
            r1 = r44
            r43 = r2
            r2 = r15
            java.lang.String r1 = r1.mo120766c(r2, r3, r4, r5, r6)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            java.lang.String r2 = r48.mo120783m()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            if (r2 == 0) goto L_0x04ae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.<init>()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.append(r1)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.append(r13)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            java.lang.String r1 = r48.mo120783m()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.append(r1)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            java.lang.String r1 = r2.toString()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.<init>()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.append(r1)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r2.append(r14)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            java.lang.String r1 = r2.toString()     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
        L_0x04ae:
            r12.append(r1)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r12.append(r11)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            r5 = r15
            goto L_0x04c9
        L_0x04b6:
            r0 = move-exception
            goto L_0x041d
        L_0x04b9:
            r0 = move-exception
            goto L_0x0427
        L_0x04bc:
            r0 = move-exception
            goto L_0x0431
        L_0x04bf:
            r43 = r34
            r12.append(r9)     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            r12.append(r11)     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            r5 = r17
        L_0x04c9:
            r13 = r5
            r11 = r43
        L_0x04cc:
            boolean r1 = r9.startsWith(r10)     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            if (r1 != 0) goto L_0x053d
            java.lang.String r1 = ".ts"
            boolean r1 = r9.contains(r1)     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            if (r1 != 0) goto L_0x04f5
            java.lang.String r1 = ".aac"
            boolean r1 = r9.contains(r1)     // Catch:{ f -> 0x04bc, Exception -> 0x04b9, all -> 0x04b6 }
            if (r1 == 0) goto L_0x053d
            goto L_0x04f5
        L_0x04e3:
            r2 = r44
            r3 = r24
            goto L_0x0736
        L_0x04e9:
            r2 = r44
            r3 = r24
            goto L_0x0744
        L_0x04ef:
            r2 = r44
            r3 = r24
            goto L_0x074f
        L_0x04f5:
            if (r11 == 0) goto L_0x0536
            r9 = r29
            if (r9 >= r7) goto L_0x0533
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            if (r1 != 0) goto L_0x0533
            r3 = 1
            r4 = 1
            java.lang.String r5 = "video/MP2T"
            r6 = 10
            r1 = r44
            r2 = r13
            java.lang.String r1 = r1.mo120766c(r2, r3, r4, r5, r6)     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            r2.<init>()     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            java.lang.String r3 = "generateLocalPlaylistFile, preloadTs:"
            r2.append(r3)     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            r2.append(r1)     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            java.lang.String r2 = r2.toString()     // Catch:{ f -> 0x0565, Exception -> 0x0560, all -> 0x055b }
            r3 = r24
            r4 = 4
            fn0.C87002g.m108022p(r4, r3, r2)     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            dn0.h r2 = new dn0.h     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            r2.<init>()     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            r2.f251087b = r1     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            r2.f251086a = r13     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            r11.add(r2)     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            goto L_0x053a
        L_0x0533:
            r3 = r24
            goto L_0x053a
        L_0x0536:
            r3 = r24
            r9 = r29
        L_0x053a:
            int r29 = r9 + 1
            goto L_0x0543
        L_0x053d:
            r3 = r24
            r9 = r29
            r29 = r9
        L_0x0543:
            r9 = r48
            r15 = r3
            r24 = r7
            r1 = r11
            r6 = r16
            r5 = r18
            r4 = r22
            r14 = r32
            r13 = r33
            r2 = r39
            r7 = r44
            r11 = r46
            goto L_0x0134
        L_0x055b:
            r0 = move-exception
            r3 = r24
            goto L_0x05bb
        L_0x0560:
            r0 = move-exception
            r3 = r24
            goto L_0x05cd
        L_0x0565:
            r0 = move-exception
            r3 = r24
            goto L_0x05df
        L_0x056a:
            r43 = r1
            r39 = r2
            r46 = r11
            r33 = r13
            r32 = r14
            r3 = r15
            r16 = r31
            goto L_0x05f1
        L_0x0579:
            r0 = move-exception
            r39 = r2
            r46 = r11
            r33 = r13
            r32 = r14
            r3 = r15
            r16 = r31
        L_0x0585:
            r35 = 0
            goto L_0x05bb
        L_0x0588:
            r0 = move-exception
            r39 = r2
            r46 = r11
            r33 = r13
            r32 = r14
            r3 = r15
            r16 = r31
        L_0x0594:
            r17 = 0
            r21 = 1
            r35 = 0
            goto L_0x05cd
        L_0x059b:
            r0 = move-exception
            r39 = r2
            r46 = r11
            r33 = r13
            r32 = r14
            r3 = r15
            r16 = r31
        L_0x05a7:
            r17 = 0
            r21 = 1
            r35 = 0
            goto L_0x05df
        L_0x05ae:
            r0 = move-exception
            r39 = r2
            r16 = r6
            r46 = r11
            r33 = r13
            r32 = r14
            r3 = r15
            goto L_0x0585
        L_0x05bb:
            r1 = r0
            r2 = r44
            goto L_0x0736
        L_0x05c0:
            r0 = move-exception
            r39 = r2
            r16 = r6
            r46 = r11
            r33 = r13
            r32 = r14
            r3 = r15
            goto L_0x0594
        L_0x05cd:
            r1 = r0
            r2 = r44
            goto L_0x0744
        L_0x05d2:
            r0 = move-exception
            r39 = r2
            r16 = r6
            r46 = r11
            r33 = r13
            r32 = r14
            r3 = r15
            goto L_0x05a7
        L_0x05df:
            r1 = r0
            r2 = r44
            goto L_0x074f
        L_0x05e4:
            r43 = r1
            r39 = r2
            r16 = r6
            r46 = r11
            r33 = r13
            r32 = r14
            r3 = r15
        L_0x05f1:
            r17 = 0
            r21 = 1
            r35 = 0
            boolean r1 = r48.mo120790t()     // Catch:{ f -> 0x087c, Exception -> 0x0878, all -> 0x0874 }
            if (r1 != 0) goto L_0x085a
            r11 = r43
            if (r11 == 0) goto L_0x062b
            an0.a r1 = an0.C79592a.m96648a()     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            boolean r1 = r1.mo109711g()     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            if (r1 == 0) goto L_0x062b
            boolean r1 = r48.mo120790t()     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            if (r1 != 0) goto L_0x062b
            dn0.m r1 = dn0.C86368m.m106993b()     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            java.lang.String r2 = "preloadTs"
            r1.mo120761e(r11, r2)     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            goto L_0x062b
        L_0x061c:
            r0 = move-exception
            r2 = r44
            goto L_0x0711
        L_0x0621:
            r0 = move-exception
            r2 = r44
            goto L_0x0714
        L_0x0626:
            r0 = move-exception
            r2 = r44
            goto L_0x0717
        L_0x062b:
            if (r25 == 0) goto L_0x0719
            java.lang.String r1 = r48.mo120783m()     // Catch:{ f -> 0x0626, Exception -> 0x0621, all -> 0x061c }
            r2 = r44
            java.util.Map<java.lang.String, dn0.g> r4 = r2.f251117k     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            boolean r4 = r4.containsKey(r1)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            if (r4 != 0) goto L_0x0649
            java.util.Map<java.lang.String, dn0.g> r4 = r2.f251117k     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            dn0.g r5 = new dn0.g     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r5.<init>()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r4.put(r1, r5)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
        L_0x0649:
            java.util.Map<java.lang.String, dn0.g> r4 = r2.f251117k     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.Object r1 = r4.get(r1)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            dn0.g r1 = (dn0.C86362g) r1     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r4 = r26
            r5 = -1
            if (r4 == r5) goto L_0x0708
            r6 = r27
            if (r6 == r5) goto L_0x0700
            int r7 = r1.f251084a     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            if (r7 != r5) goto L_0x0694
            java.util.Map<java.lang.String, dn0.g> r5 = r2.f251118l     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            if (r5 == 0) goto L_0x0674
            java.util.Map<java.lang.String, dn0.g> r5 = r2.f251118l     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            dn0.g r5 = (dn0.C86362g) r5     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
        L_0x0674:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r5.<init>()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r6 = "set MaxMediaSequence "
            r5.append(r6)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r5.append(r4)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r5 = r5.toString()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r6 = 3
            fn0.C87002g.m108022p(r6, r3, r5)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r1.f251084a = r4     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r1.f251085b = r4     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            goto L_0x071b
        L_0x0694:
            if (r4 < r7) goto L_0x06d7
            if (r4 != r7) goto L_0x06ce
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            long r9 = r1.f251085b     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            long r4 = r4 - r9
            int r7 = r6 * 1000
            long r9 = (long) r7     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x06a8
            goto L_0x071b
        L_0x06a8:
            java.util.Map<java.lang.String, dn0.g> r7 = r2.f251118l     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r7.put(r8, r1)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            dn0.f r1 = new dn0.f     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r7.<init>()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r8 = "MaxMediaSequence not updated in "
            r7.append(r8)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r7.append(r4)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r4 = "ms, targetDuration="
            r7.append(r4)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r7.append(r6)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r4 = r7.toString()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r1.<init>((java.lang.String) r4)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            throw r1     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
        L_0x06ce:
            r1.f251084a = r4     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r1.f251085b = r4     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            goto L_0x071b
        L_0x06d7:
            dn0.f r5 = new dn0.f     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r6.<init>()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r7 = "mediaSequence can not be less than "
            r6.append(r7)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            int r1 = r1.f251084a     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r6.append(r1)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r1 = ", current is "
            r6.append(r1)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r6.append(r4)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r1 = ", url="
            r6.append(r1)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r6.append(r8)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r1 = r6.toString()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            r5.<init>((java.lang.String) r1)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            throw r5     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
        L_0x0700:
            dn0.f r1 = new dn0.f     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r4 = "error parse target duration"
            r1.<init>((java.lang.String) r4)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            throw r1     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
        L_0x0708:
            dn0.f r1 = new dn0.f     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            java.lang.String r4 = "error parse media sequence"
            r1.<init>((java.lang.String) r4)     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            throw r1     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
        L_0x0710:
            r0 = move-exception
        L_0x0711:
            r1 = r0
            goto L_0x0736
        L_0x0713:
            r0 = move-exception
        L_0x0714:
            r1 = r0
            goto L_0x0744
        L_0x0716:
            r0 = move-exception
        L_0x0717:
            r1 = r0
            goto L_0x074f
        L_0x0719:
            r2 = r44
        L_0x071b:
            java.lang.String r1 = "====================== end original m3u8 content ======================"
            r4 = 4
            fn0.C87002g.m108022p(r4, r3, r1)     // Catch:{ f -> 0x084d, Exception -> 0x0840, all -> 0x0834 }
            java.lang.String r1 = r12.toString()     // Catch:{ f -> 0x084d, Exception -> 0x0840, all -> 0x0834 }
            java.lang.String r4 = "\\[VALUE_CACHE_PLACEHOLDER\\]"
            if (r23 == 0) goto L_0x075c
            an0.a r5 = an0.C79592a.m96648a()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            boolean r5 = r5.mo109710f()     // Catch:{ f -> 0x0716, Exception -> 0x0713, all -> 0x0710 }
            if (r5 == 0) goto L_0x075c
            java.lang.String r5 = "1"
            goto L_0x075e
        L_0x0736:
            r11 = r46
            r9 = r19
            r7 = r20
            r8 = r32
            r6 = r33
            r4 = 0
            r5 = 6
            goto L_0x0ab1
        L_0x0744:
            r4 = r46
            r7 = r20
            r8 = r32
            r6 = r33
            r5 = 6
            goto L_0x0966
        L_0x074f:
            r4 = r46
            r9 = r19
            r7 = r20
            r8 = r32
            r6 = r33
            r5 = 6
            goto L_0x0a18
        L_0x075c:
            java.lang.String r5 = "0"
        L_0x075e:
            java.lang.String r1 = r1.replaceAll(r4, r5)     // Catch:{ f -> 0x084d, Exception -> 0x0840, all -> 0x0834 }
            java.lang.String r4 = "====================== start local m3u8 content ======================"
            r5 = 4
            fn0.C87002g.m108022p(r5, r3, r4)     // Catch:{ f -> 0x084d, Exception -> 0x0840, all -> 0x0834 }
            fn0.C87002g.m108022p(r5, r3, r1)     // Catch:{ f -> 0x084d, Exception -> 0x0840, all -> 0x0834 }
            java.lang.String r4 = "====================== end local m3u8 content ======================"
            fn0.C87002g.m108022p(r5, r3, r4)     // Catch:{ f -> 0x084d, Exception -> 0x0840, all -> 0x0834 }
            byte[] r1 = r1.getBytes()     // Catch:{ f -> 0x084d, Exception -> 0x0840, all -> 0x0834 }
            r4 = r46
            r4.write(r1)     // Catch:{ f -> 0x0832, Exception -> 0x0830, all -> 0x082e }
            r39.close()     // Catch:{ IOException -> 0x077e }
            r5 = 6
            goto L_0x079b
        L_0x077e:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = r33
            r5.append(r6)
            java.lang.String r1 = fn0.C87002g.m108013g(r1)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r5 = 6
            fn0.C87002g.m108022p(r5, r3, r1)
            r35 = 1
        L_0x079b:
            r4.close()     // Catch:{ IOException -> 0x07a1 }
            r12 = r35
            goto L_0x07bc
        L_0x07a1:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r7 = r20
            r4.append(r7)
            java.lang.String r1 = fn0.C87002g.m108013g(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            fn0.C87002g.m108022p(r5, r3, r1)
            r12 = 1
        L_0x07bc:
            if (r30 != 0) goto L_0x07f9
            boolean r1 = r48.mo120790t()
            if (r1 == 0) goto L_0x07c7
            r48.mo120772b()
        L_0x07c7:
            boolean r1 = r16.mo119967g()
            if (r1 == 0) goto L_0x07f8
            boolean r1 = r16.mo119978p()
            if (r1 == 0) goto L_0x07f8
            boolean r1 = r16.mo119966f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "generateLocalPlaylistFile, interrupt deletePlayListFile "
            r4.append(r5)
            java.lang.String r5 = r16.toString()
            r4.append(r5)
            r8 = r32
            r4.append(r8)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 4
            fn0.C87002g.m108022p(r4, r3, r1)
        L_0x07f8:
            return r17
        L_0x07f9:
            r8 = r32
            if (r12 == 0) goto L_0x082d
            boolean r1 = r16.mo119967g()
            if (r1 == 0) goto L_0x082c
            boolean r1 = r16.mo119978p()
            if (r1 == 0) goto L_0x082c
            boolean r1 = r16.mo119966f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "generateLocalPlaylistFile, hasError deletePlayListFile "
            r4.append(r5)
            java.lang.String r5 = r16.toString()
            r4.append(r5)
            r4.append(r8)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 4
            fn0.C87002g.m108022p(r4, r3, r1)
        L_0x082c:
            return r17
        L_0x082d:
            return r16
        L_0x082e:
            r0 = move-exception
            goto L_0x0837
        L_0x0830:
            r0 = move-exception
            goto L_0x0843
        L_0x0832:
            r0 = move-exception
            goto L_0x0850
        L_0x0834:
            r0 = move-exception
        L_0x0835:
            r4 = r46
        L_0x0837:
            r7 = r20
            r8 = r32
            r6 = r33
            r5 = 6
            goto L_0x088f
        L_0x0840:
            r0 = move-exception
        L_0x0841:
            r4 = r46
        L_0x0843:
            r7 = r20
            r8 = r32
            r6 = r33
            r5 = 6
        L_0x084a:
            r1 = r0
            goto L_0x0966
        L_0x084d:
            r0 = move-exception
        L_0x084e:
            r4 = r46
        L_0x0850:
            r7 = r20
            r8 = r32
            r6 = r33
            r5 = 6
        L_0x0857:
            r1 = r0
            goto L_0x0934
        L_0x085a:
            r2 = r44
            r4 = r46
            r7 = r20
            r8 = r32
            r6 = r33
            r5 = 6
            dn0.f r1 = new dn0.f     // Catch:{ f -> 0x0872, Exception -> 0x0870, all -> 0x086e }
            java.lang.String r9 = "request cancelled"
            r1.<init>((java.lang.String) r9)     // Catch:{ f -> 0x0872, Exception -> 0x0870, all -> 0x086e }
            throw r1     // Catch:{ f -> 0x0872, Exception -> 0x0870, all -> 0x086e }
        L_0x086e:
            r0 = move-exception
            goto L_0x088f
        L_0x0870:
            r0 = move-exception
            goto L_0x084a
        L_0x0872:
            r0 = move-exception
            goto L_0x0857
        L_0x0874:
            r0 = move-exception
            r2 = r44
            goto L_0x0835
        L_0x0878:
            r0 = move-exception
            r2 = r44
            goto L_0x0841
        L_0x087c:
            r0 = move-exception
            r2 = r44
            goto L_0x084e
        L_0x0880:
            r0 = move-exception
            r39 = r2
            r16 = r6
            r2 = r7
            r4 = r11
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r35 = 0
        L_0x088f:
            r1 = r0
            r17 = r4
            goto L_0x095e
        L_0x0894:
            r0 = move-exception
            r39 = r2
            r16 = r6
            r2 = r7
            r4 = r11
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r17 = 0
            r21 = 1
            r35 = 0
            goto L_0x084a
        L_0x08a8:
            r0 = move-exception
            r39 = r2
            r16 = r6
            r2 = r7
            r4 = r11
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r17 = 0
            r21 = 1
            r35 = 0
            goto L_0x0857
        L_0x08bc:
            r0 = move-exception
            r39 = r2
            r16 = r6
            r2 = r7
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r17 = 0
            r35 = 0
            r1 = r0
            goto L_0x095e
        L_0x08cf:
            r0 = move-exception
            r39 = r2
            r16 = r6
            r2 = r7
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r17 = 0
            r21 = 1
            r35 = 0
            r1 = r0
            r4 = r17
            goto L_0x0966
        L_0x08e6:
            r0 = move-exception
            r39 = r2
            r16 = r6
            r2 = r7
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r17 = 0
            r21 = 1
            r35 = 0
            r1 = r0
            r4 = r17
            goto L_0x0934
        L_0x08fc:
            r0 = move-exception
            r16 = r6
            r2 = r7
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r17 = 0
            r35 = 0
            r1 = r0
            goto L_0x095c
        L_0x090d:
            r0 = move-exception
            r16 = r6
            r2 = r7
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r17 = 0
            r21 = 1
            r35 = 0
            r1 = r0
            goto L_0x0962
        L_0x091f:
            r0 = move-exception
            r16 = r6
            r2 = r7
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r17 = 0
            r21 = 1
            r35 = 0
            r1 = r0
            r4 = r17
            r39 = r4
        L_0x0934:
            r9 = r19
            goto L_0x0a18
        L_0x0938:
            r0 = move-exception
            r16 = r6
            r2 = r7
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r17 = 0
            r21 = 1
            r35 = 0
            r1 = r0
            r9 = r19
            goto L_0x0a14
        L_0x094d:
            r0 = move-exception
            r16 = r6
            r2 = r7
            r6 = r13
            r8 = r14
            r3 = r15
            r7 = r20
            r5 = 6
            r17 = 0
            r35 = 0
            r1 = r0
        L_0x095c:
            r39 = r17
        L_0x095e:
            r9 = r19
            goto L_0x0aae
        L_0x0962:
            r4 = r17
            r39 = r4
        L_0x0966:
            boolean r9 = r48.mo120790t()     // Catch:{ all -> 0x09fb }
            if (r9 == 0) goto L_0x09db
            r48.mo120772b()     // Catch:{ all -> 0x09fb }
            if (r39 == 0) goto L_0x098d
            r39.close()     // Catch:{ IOException -> 0x0975 }
            goto L_0x098d
        L_0x0975:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r1 = fn0.C87002g.m108013g(r1)
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            fn0.C87002g.m108022p(r5, r3, r1)
        L_0x098d:
            if (r4 == 0) goto L_0x09ab
            r4.close()     // Catch:{ IOException -> 0x0993 }
            goto L_0x09ab
        L_0x0993:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r1 = fn0.C87002g.m108013g(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            fn0.C87002g.m108022p(r5, r3, r1)
        L_0x09ab:
            boolean r1 = r16.mo119967g()
            if (r1 == 0) goto L_0x09da
            boolean r1 = r16.mo119978p()
            if (r1 == 0) goto L_0x09da
            boolean r1 = r16.mo119966f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r9 = r19
            r4.append(r9)
            java.lang.String r5 = r16.toString()
            r4.append(r5)
            r4.append(r8)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 4
            fn0.C87002g.m108022p(r4, r3, r1)
        L_0x09da:
            return r17
        L_0x09db:
            r9 = r19
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa4 }
            r10.<init>()     // Catch:{ all -> 0x0aa4 }
            java.lang.String r11 = "generateLocalPlaylistFile Exception:"
            r10.append(r11)     // Catch:{ all -> 0x0aa4 }
            java.lang.String r11 = fn0.C87002g.m108013g(r1)     // Catch:{ all -> 0x0aa4 }
            r10.append(r11)     // Catch:{ all -> 0x0aa4 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0aa4 }
            fn0.C87002g.m108022p(r5, r3, r10)     // Catch:{ all -> 0x0aa4 }
            dn0.f r10 = new dn0.f     // Catch:{ all -> 0x0aa4 }
            r10.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x0aa4 }
            throw r10     // Catch:{ all -> 0x0aa4 }
        L_0x09fb:
            r0 = move-exception
            r9 = r19
        L_0x09fe:
            r1 = r0
            goto L_0x0aac
        L_0x0a01:
            r0 = move-exception
            r16 = r6
            r2 = r7
            r6 = r13
            r8 = r14
            r3 = r15
            r9 = r19
            r7 = r20
            r5 = 6
            r17 = 0
            r21 = 1
            r35 = 0
            r1 = r0
        L_0x0a14:
            r4 = r17
            r39 = r4
        L_0x0a18:
            boolean r10 = r48.mo120790t()     // Catch:{ all -> 0x0aa9 }
            if (r10 == 0) goto L_0x0a8b
            r48.mo120772b()     // Catch:{ all -> 0x0aa9 }
            if (r39 == 0) goto L_0x0a3f
            r39.close()     // Catch:{ IOException -> 0x0a27 }
            goto L_0x0a3f
        L_0x0a27:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r1 = fn0.C87002g.m108013g(r1)
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            fn0.C87002g.m108022p(r5, r3, r1)
        L_0x0a3f:
            if (r4 == 0) goto L_0x0a5d
            r4.close()     // Catch:{ IOException -> 0x0a45 }
            goto L_0x0a5d
        L_0x0a45:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r1 = fn0.C87002g.m108013g(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            fn0.C87002g.m108022p(r5, r3, r1)
        L_0x0a5d:
            boolean r1 = r16.mo119967g()
            if (r1 == 0) goto L_0x0a8a
            boolean r1 = r16.mo119978p()
            if (r1 == 0) goto L_0x0a8a
            boolean r1 = r16.mo119966f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r5 = r16.toString()
            r4.append(r5)
            r4.append(r8)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 4
            fn0.C87002g.m108022p(r4, r3, r1)
        L_0x0a8a:
            return r17
        L_0x0a8b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0aa4 }
            r10.<init>()     // Catch:{ all -> 0x0aa4 }
            java.lang.String r11 = "generateLocalPlaylistFile LivePlayListException:"
            r10.append(r11)     // Catch:{ all -> 0x0aa4 }
            java.lang.String r11 = fn0.C87002g.m108013g(r1)     // Catch:{ all -> 0x0aa4 }
            r10.append(r11)     // Catch:{ all -> 0x0aa4 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0aa4 }
            fn0.C87002g.m108022p(r5, r3, r10)     // Catch:{ all -> 0x0aa4 }
            throw r1     // Catch:{ all -> 0x0aa4 }
        L_0x0aa4:
            r0 = move-exception
            r1 = r0
            r11 = r4
            r4 = 1
            goto L_0x0ab1
        L_0x0aa9:
            r0 = move-exception
            goto L_0x09fe
        L_0x0aac:
            r17 = r4
        L_0x0aae:
            r11 = r17
            r4 = 0
        L_0x0ab1:
            if (r39 == 0) goto L_0x0acf
            r39.close()     // Catch:{ IOException -> 0x0ab7 }
            goto L_0x0acf
        L_0x0ab7:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.String r6 = fn0.C87002g.m108013g(r10)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            fn0.C87002g.m108022p(r5, r3, r6)
        L_0x0acf:
            if (r11 == 0) goto L_0x0aed
            r11.close()     // Catch:{ IOException -> 0x0ad5 }
            goto L_0x0aed
        L_0x0ad5:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            java.lang.String r6 = fn0.C87002g.m108013g(r6)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            fn0.C87002g.m108022p(r5, r3, r6)
        L_0x0aed:
            if (r4 == 0) goto L_0x0b1c
            boolean r4 = r16.mo119967g()
            if (r4 == 0) goto L_0x0b1c
            boolean r4 = r16.mo119978p()
            if (r4 == 0) goto L_0x0b1c
            boolean r4 = r16.mo119966f()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            java.lang.String r6 = r16.toString()
            r5.append(r6)
            r5.append(r8)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = 4
            fn0.C87002g.m108022p(r5, r3, r4)
        L_0x0b1c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dn0.C86370o.mo120764a(cn0.e, cn0.g, java.lang.String, dn0.p):com.tencent.mm.vfs.m1");
    }

    /* renamed from: b */
    public final int mo120765b(Throwable th) {
        if (th.toString().toLowerCase().contains("unexpected end of stream")) {
            return 6;
        }
        return (th.getCause() == null || !(th.getCause() instanceof SocketTimeoutException)) ? 7 : 14;
    }

    /* renamed from: c */
    public String mo120766c(String str, boolean z, boolean z2, String str2, int i) {
        String str3;
        boolean z3;
        boolean z4;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2 = i;
        if (!C79592a.m96648a().f233400c || this.f251107a > 3 || ((ThreadPoolExecutor) this.f251112f).isShutdown() || ((ThreadPoolExecutor) this.f251112f).isTerminated()) {
            C87002g.m108023q(4, "VideoProxy", "getUrl, proxy disabled or server shutdown", (Throwable) null);
            C91512j.this.f262321e = false;
            return C87002g.m108030x(str);
        }
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            str3 = str;
            z3 = z2;
        } else {
            String x = C87002g.m108030x(str);
            boolean z5 = true;
            if (!(!TextUtils.isEmpty(x) && x.startsWith("file:///android_asset"))) {
                if (TextUtils.isEmpty(x) || !x.startsWith("android.resource://")) {
                    z5 = false;
                }
                if (!z5) {
                    return x;
                }
                x = str;
            }
            str3 = x;
            z3 = false;
        }
        if (!C87002g.m108019m(str3)) {
            str4 = str2;
            z4 = z3;
        } else if (!C79592a.m96648a().f233403f) {
            C87002g.m108023q(4, "VideoProxy", "getUrl, hls proxy disabled", (Throwable) null);
            return str3;
        } else {
            str4 = "application/vnd.apple.mpegurl";
            z4 = false;
        }
        try {
            str5 = URLEncoder.encode(str3, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            UnsupportedEncodingException unsupportedEncodingException = e;
            C87002g.m108023q(6, "VideoProxy", "invalid url " + C87002g.m108014h(unsupportedEncodingException, false), (Throwable) null);
            str5 = "";
        }
        if (TextUtils.isEmpty(str5)) {
            C87002g.m108023q(6, "VideoProxy", "url is empty " + str5, (Throwable) null);
            return str3;
        }
        String lastPathSegment = Uri.parse(str3).getLastPathSegment();
        StringBuilder sb = new StringBuilder();
        sb.append("http://127.0.0.1:" + this.f251110d);
        sb.append("/");
        sb.append(lastPathSegment);
        sb.append("?");
        sb.append("url");
        sb.append("=");
        sb.append(str5);
        String sb4 = sb.toString();
        if (z4) {
            sb4 = sb4 + "&enableCache=1";
        }
        if (i2 == 90 || i2 == 10 || i2 == -1) {
            sb4 = sb4 + "&priority=" + i2;
        }
        if (!TextUtils.isEmpty(str4)) {
            try {
                str7 = URLEncoder.encode(str4, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                C87002g.m108023q(6, "VideoProxy", "unable to encode contentType " + str4, (Throwable) null);
                str7 = null;
            }
            if (!TextUtils.isEmpty(str7)) {
                sb4 = sb4 + "&contentType=" + str7;
            }
        }
        if (z) {
            str6 = System.currentTimeMillis() + "" + f251105m.getAndIncrement();
        } else {
            str6 = null;
        }
        if (str6 != null) {
            sb4 = sb4 + "&id=" + str6;
        }
        String str8 = sb4;
        if (this.f251108b) {
            try {
                str8 = str8 + "&secret=" + C87007l.m108032b("des", C87007l.m108033c(), C87002g.m108028v(str3));
            } catch (Exception e2) {
                C87002g.m108023q(6, "VideoProxy", "encode failed:" + C87002g.m108014h(e2, false), (Throwable) null);
                this.f251108b = false;
            }
        }
        C87002g.m108023q(4, "VideoProxy", "getUrl, url:" + str3 + ", proxyUrl:" + str8, (Throwable) null);
        return str8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x024f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final dn0.C86370o.C86372b mo120767d(cn0.C80079e r29, cn0.C80081g r30, java.lang.String r31, java.lang.String r32, dn0.C86375p r33, java.net.Socket r34, java.lang.String r35, long r36, long r38, long r40) {
        /*
            r28 = this;
            r1 = r28
            r0 = r30
            r4 = r31
            r14 = r32
            r15 = r33
            r2 = r35
            r12 = r38
            java.lang.String r10 = "openDataSource, videoRequest is interrupted:"
            java.lang.String r11 = "openDataSource, socket close exception"
            dn0.o$b r9 = new dn0.o$b
            r8 = 0
            r9.<init>(r1, r8)
            r5 = r36
            r9.f251119a = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "openDataSource, dataSpec="
            r3.append(r5)
            java.lang.String r5 = r30.toString()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r7 = 4
            fn0.C87002g.m108023q(r7, r14, r3, r8)
            boolean r3 = fn0.C87002g.m108019m(r31)
            if (r3 != 0) goto L_0x0043
            r29.mo109837b(r30)
            goto L_0x00ce
        L_0x0043:
            r5 = 0
            an0.a r3 = an0.C79592a.m96648a()     // Catch:{ f -> 0x0172 }
            dn0.e r3 = r3.f233414q     // Catch:{ f -> 0x016a }
            if (r3 == 0) goto L_0x0059
            an0.a r3 = an0.C79592a.m96648a()     // Catch:{ f -> 0x0172 }
            dn0.e r3 = r3.f233414q     // Catch:{ f -> 0x0172 }
            gd.a r3 = (p814gd.C45904a) r3     // Catch:{ f -> 0x0172 }
            com.tencent.mm.vfs.m1 r3 = r3.mo71331a(r4)     // Catch:{ f -> 0x0172 }
            goto L_0x005a
        L_0x0059:
            r3 = r8
        L_0x005a:
            if (r3 == 0) goto L_0x0065
            boolean r17 = r3.mo119967g()     // Catch:{ f -> 0x0172 }
            if (r17 == 0) goto L_0x0065
            r9.f251122d = r3     // Catch:{ f -> 0x0172 }
            goto L_0x006d
        L_0x0065:
            r3 = r29
            com.tencent.mm.vfs.m1 r3 = r1.mo120764a(r3, r0, r4, r15)     // Catch:{ f -> 0x0172 }
            r9.f251122d = r3     // Catch:{ f -> 0x0172 }
        L_0x006d:
            com.tencent.mm.vfs.m1 r3 = r9.f251122d
            if (r3 == 0) goto L_0x00cf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "openDataSource, localPlaylist generate success:"
            r2.append(r3)
            com.tencent.mm.vfs.m1 r3 = r9.f251122d
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            fn0.C87002g.m108023q(r7, r14, r2, r8)
            dn0.o$a r2 = new dn0.o$a
            r2.<init>(r1)
            java.io.File r3 = new java.io.File
            com.tencent.mm.vfs.m1 r4 = r9.f251122d
            java.lang.String r4 = r4.mo119976n()
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r5)
            r3.<init>(r4)
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            cn0.g r4 = new cn0.g
            long r5 = r0.f234520b
            long r7 = r0.f234521c
            long r10 = r0.f234522d
            java.lang.String r12 = r0.f234523e
            int r13 = r0.f234524f
            java.lang.String r14 = r0.f234525g
            int r0 = r0.f234526h
            r29 = r4
            r30 = r3
            r31 = r5
            r33 = r7
            r35 = r10
            r37 = r12
            r38 = r13
            r39 = r14
            r40 = r0
            r29.<init>(r30, r31, r33, r35, r37, r38, r39, r40)
            r2.mo109837b(r4)
            r9.f251121c = r2
        L_0x00ce:
            return r9
        L_0x00cf:
            r0 = 18
            int r3 = r15.f251137h
            r5 = 90
            if (r3 != r5) goto L_0x011c
            long r6 = (long) r0
            long r5 = fn0.C87002g.m108012f(r6, r12)
            r9.f251119a = r5
            java.util.Map<java.lang.String, dn0.c> r0 = r1.f251114h
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            dn0.c r2 = (dn0.C86359c) r2
            if (r2 == 0) goto L_0x011c
            java.lang.String r3 = r15.f251142m
            int r6 = r15.f251137h
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            long r18 = java.lang.System.currentTimeMillis()
            long r4 = r18 - r40
            int r7 = (int) r4
            long r4 = r9.f251119a
            r18 = 18
            java.lang.String r19 = "LivePlayListException"
            r20 = r4
            r4 = r31
            r5 = r18
            r16 = r7
            r7 = r19
            r8 = r0
            r22 = r9
            r9 = r16
            r24 = r10
            r23 = r11
            r10 = r20
            r12 = r38
            r2.mo120751a(r3, r4, r5, r6, r7, r8, r9, r10, r12)
            goto L_0x0122
        L_0x011c:
            r22 = r9
            r24 = r10
            r23 = r11
        L_0x0122:
            java.lang.String r0 = "openDataSource, localPlaylist generate fail, see previous logs"
            r10 = 4
            r11 = 0
            fn0.C87002g.m108023q(r10, r14, r0, r11)
            r34.close()     // Catch:{ IOException -> 0x012e }
            goto L_0x0136
        L_0x012e:
            r0 = move-exception
            r2 = r0
            r9 = r23
            r8 = 6
            fn0.C87002g.m108023q(r8, r14, r9, r2)
        L_0x0136:
            dn0.r r0 = r1.f251113g
            r0.mo120798d(r15)
            r7 = 2
            boolean r0 = r15.mo120771a(r7)
            if (r0 == 0) goto L_0x015f
            r6 = 256(0x100, float:3.59E-43)
            r15.mo120789s(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4 = r24
            r0.append(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            fn0.C87002g.m108023q(r10, r14, r0, r11)
            r33.mo120773c()
            goto L_0x0164
        L_0x015f:
            r3 = 257(0x101, float:3.6E-43)
            r15.mo120789s(r3)
        L_0x0164:
            r2 = r22
            r3 = 1
            r2.f251120b = r3
            return r2
        L_0x016a:
            r0 = move-exception
            r25 = r9
            r4 = r10
            r9 = r11
            r3 = 257(0x101, float:3.6E-43)
            goto L_0x0177
        L_0x0172:
            r0 = move-exception
            r25 = r9
            r4 = r10
            r9 = r11
        L_0x0177:
            r6 = 256(0x100, float:3.59E-43)
            r7 = 2
            r10 = 4
            r11 = r8
            r8 = 6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "VideoProxy/"
            r3.append(r5)
            int r5 = r15.f251135f
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "openDataSource, localPlaylist generate livePlayListException "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            fn0.C87002g.m108023q(r8, r3, r5, r11)
            java.lang.Throwable r3 = r0.getCause()
            if (r3 == 0) goto L_0x01c3
            java.lang.Throwable r3 = r0.getCause()
            boolean r3 = r3 instanceof cn0.C80089l.C80091b
            if (r3 != 0) goto L_0x01c1
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof cn0.C80089l.C80092c
            if (r0 == 0) goto L_0x01bc
            goto L_0x01c1
        L_0x01bc:
            r0 = 17
            r5 = 17
            goto L_0x01c7
        L_0x01c1:
            r5 = 0
            goto L_0x01c7
        L_0x01c3:
            r0 = 16
            r5 = 16
        L_0x01c7:
            int r0 = r15.f251137h
            r3 = 90
            if (r0 != r3) goto L_0x0210
            if (r5 == 0) goto L_0x0210
            long r7 = (long) r5
            long r6 = fn0.C87002g.m108012f(r7, r12)
            r8 = r25
            r8.f251119a = r6
            java.util.Map<java.lang.String, dn0.c> r0 = r1.f251114h
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            dn0.c r2 = (dn0.C86359c) r2
            if (r2 == 0) goto L_0x020a
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r40
            int r0 = (int) r6
            java.lang.String r3 = r15.f251142m
            int r6 = r15.f251137h
            java.util.HashMap r16 = new java.util.HashMap
            r16.<init>()
            long r10 = r8.f251119a
            java.lang.String r7 = "LivePlayListException"
            r26 = r4
            r4 = r31
            r27 = r8
            r15 = 6
            r8 = r16
            r1 = r9
            r9 = r0
            r12 = r38
            r2.mo120751a(r3, r4, r5, r6, r7, r8, r9, r10, r12)
            goto L_0x0216
        L_0x020a:
            r26 = r4
            r27 = r8
            r1 = r9
            goto L_0x0215
        L_0x0210:
            r26 = r4
            r1 = r9
            r27 = r25
        L_0x0215:
            r15 = 6
        L_0x0216:
            r34.close()     // Catch:{ IOException -> 0x021c }
        L_0x0219:
            r1 = r28
            goto L_0x0222
        L_0x021c:
            r0 = move-exception
            r2 = r0
            fn0.C87002g.m108023q(r15, r14, r1, r2)
            goto L_0x0219
        L_0x0222:
            dn0.r r0 = r1.f251113g
            r2 = r33
            r0.mo120798d(r2)
            r3 = 2
            boolean r0 = r2.mo120771a(r3)
            if (r0 == 0) goto L_0x024f
            r3 = 256(0x100, float:3.59E-43)
            r2.mo120789s(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = r26
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3 = 4
            r4 = 0
            fn0.C87002g.m108023q(r3, r14, r0, r4)
            r33.mo120773c()
            goto L_0x0254
        L_0x024f:
            r3 = 257(0x101, float:3.6E-43)
            r2.mo120789s(r3)
        L_0x0254:
            r2 = r27
            r3 = 1
            r2.f251120b = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dn0.C86370o.mo120767d(cn0.e, cn0.g, java.lang.String, java.lang.String, dn0.p, java.net.Socket, java.lang.String, long, long, long):dn0.o$b");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f0, code lost:
        r75 = r1;
        r12 = r8;
        r13 = r9;
        r4 = r31;
        r9 = r53;
        r1 = r54;
        r10 = r61;
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ff, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0300, code lost:
        r13 = r1;
        r12 = r8;
        r62 = r9;
        r4 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x030f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0328, code lost:
        r12 = r8;
        r13 = r9;
        r8 = r11;
        r9 = r54;
        r10 = r61;
        r52 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0337, code lost:
        r11 = r0;
        r73 = r4;
        r32 = r8;
        r56 = r9;
        r18 = r12;
        r8 = r59;
        r4 = true;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04a6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04a8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04a9, code lost:
        r8 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04ac, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04ae, code lost:
        r32 = r8;
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04b4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04b5, code lost:
        r32 = r8;
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04bb, code lost:
        r32 = r8;
        r8 = r0;
        r9 = r70;
        r47 = r3;
        r12 = r4;
        r48 = r5;
        r37 = r31;
        r14 = null;
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04cb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04cc, code lost:
        r32 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04ce, code lost:
        r12 = r4;
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04d2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04d3, code lost:
        r32 = r8;
        r8 = r10;
        r18 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04d9, code lost:
        r12 = r4;
        r4 = r11;
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04dd, code lost:
        r14 = r73;
        r13 = r1;
        r1 = r11;
        r64 = r12;
        r65 = r18;
        r16 = r31;
        r9 = r53;
        r11 = r56;
        r10 = r61;
        r31 = r30;
        r30 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0508, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0509, code lost:
        r15 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x050c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x050e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x050f, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x051d, code lost:
        r27 = r11;
        r52 = r12;
        r8 = r31;
        r12 = r32;
        r9 = r54;
        r13 = r56;
        r10 = r61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05e7, code lost:
        r8 = r31;
        r12 = r32;
        r10 = r53;
        r9 = r54;
        r13 = r56;
        r11 = r61;
        r15 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x060c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x060d, code lost:
        r8 = r31;
        r12 = r32;
        r9 = r54;
        r13 = r56;
        r10 = r61;
        r52 = r4;
        r27 = r11;
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x061c, code lost:
        r62 = r13;
        r13 = r1;
        r14 = r4;
        r4 = r8;
        r1 = r9;
        r8 = r52;
        r9 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0665, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0666, code lost:
        r75 = r1;
        r16 = r4;
        r17 = r11;
        r4 = r31;
        r12 = r32;
        r9 = r53;
        r1 = r54;
        r13 = r56;
        r10 = r61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06f4, code lost:
        r75 = r1;
        r12 = r8;
        r4 = r31;
        r9 = r53;
        r1 = r54;
        r13 = r56;
        r10 = r61;
        r8 = r0;
        r44 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0719, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x071a, code lost:
        r75 = r1;
        r12 = r8;
        r4 = r31;
        r9 = r53;
        r1 = r54;
        r13 = r56;
        r10 = r61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x072e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x072f, code lost:
        r75 = r1;
        r18 = r12;
        r4 = r31;
        r9 = r53;
        r1 = r54;
        r13 = r56;
        r10 = r61;
        r12 = r8;
        r8 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0743, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0744, code lost:
        r75 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x075a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x075d, code lost:
        r62 = r13;
        r14 = r30;
        r13 = r75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0765, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0766, code lost:
        r75 = r1;
        r12 = r8;
        r13 = r9;
        r4 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07b9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07ba, code lost:
        r75 = r1;
        r12 = r8;
        r4 = r11;
        r30 = r14;
        r1 = r54;
        r13 = r9;
        r9 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07c8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07c9, code lost:
        r15 = r74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07cd, code lost:
        r15 = r74;
        r75 = r1;
        r62 = r9;
        r4 = r11;
        r18 = r12;
        r30 = r14;
        r14 = r51;
        r9 = r53;
        r1 = r54;
        r10 = r61;
        r12 = r8;
        r8 = r59;
        r13 = r75;
        r16 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0851, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0852, code lost:
        r13 = r1;
        r12 = r8;
        r62 = r9;
        r4 = r11;
        r30 = r14;
        r9 = r53;
        r1 = r54;
        r10 = r61;
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0862, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0863, code lost:
        r15 = r74;
        r62 = r9;
        r4 = r11;
        r28 = r12;
        r30 = r14;
        r9 = r53;
        r10 = r61;
        r13 = r1;
        r12 = r8;
        r1 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0876, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0877, code lost:
        r15 = r74;
        r62 = r9;
        r4 = r11;
        r28 = r12;
        r30 = r14;
        r14 = r51;
        r9 = r53;
        r10 = r61;
        r13 = r1;
        r12 = r8;
        r1 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0919, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x091a, code lost:
        r12 = r8;
        r62 = r9;
        r4 = r11;
        r13 = r16;
        r9 = r53;
        r1 = r54;
        r10 = r61;
        r11 = r0;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x093b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x093c, code lost:
        r15 = r74;
        r12 = r8;
        r62 = r9;
        r4 = r11;
        r13 = r16;
        r9 = r53;
        r1 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x094a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x094b, code lost:
        r15 = r74;
        r12 = r8;
        r62 = r9;
        r4 = r11;
        r13 = r16;
        r14 = r51;
        r9 = r53;
        r1 = r54;
        r8 = r59;
        r10 = r61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0960, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0961, code lost:
        r15 = r74;
        r13 = r16;
        r4 = r31;
        r12 = r32;
        r2 = r46;
        r3 = r47;
        r5 = r48;
        r6 = r49;
        r14 = r51;
        r9 = r53;
        r1 = r54;
        r62 = r56;
        r8 = r59;
        r10 = r61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x097f, code lost:
        r16 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x098b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x098c, code lost:
        r13 = r16;
        r4 = r31;
        r12 = r32;
        r2 = r46;
        r3 = r47;
        r5 = r48;
        r6 = r49;
        r9 = r53;
        r1 = r54;
        r62 = r56;
        r10 = r61;
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x09b6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x09b7, code lost:
        r15 = r74;
        r13 = r16;
        r4 = r31;
        r12 = r32;
        r2 = r46;
        r3 = r47;
        r5 = r48;
        r6 = r49;
        r9 = r53;
        r1 = r54;
        r62 = r56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x09cd, code lost:
        r10 = r61;
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:?, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:?, code lost:
        r3 = r10.f251140k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:?, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:?, code lost:
        r10 = r10.mo120775e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0b32, code lost:
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x024a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x024b, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x024e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x024f, code lost:
        r28 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x026c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x026f, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0275, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0276, code lost:
        r12 = r8;
        r62 = r9;
        r30 = r14;
        r9 = r53;
        r10 = r61;
        r8 = r1;
        r1 = r54;
        r67 = r11;
        r11 = r0;
        r4 = r67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x028a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028b, code lost:
        r28 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028e, code lost:
        r15 = r74;
        r30 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0296, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0297, code lost:
        r28 = r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04ba A[ExcHandler: all (r0v90 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:143:0x03c1] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04cb A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:143:0x03c1] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0508 A[ExcHandler: all (r0v79 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r4 r32 
      PHI: (r4v164 int) = (r4v155 int), (r4v155 int), (r4v155 int), (r4v155 int), (r4v155 int), (r4v155 int), (r4v186 int), (r4v155 int), (r4v155 int), (r4v155 int), (r4v155 int), (r4v155 int) binds: [B:239:0x0519, B:240:?, B:228:0x04fd, B:229:?, B:170:0x0424, B:204:0x0490, B:205:?, B:175:0x042e, B:187:0x044d, B:190:0x0456, B:159:0x03f3, B:160:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r32v17 java.lang.String) = (r32v20 java.lang.String), (r32v20 java.lang.String), (r32v20 java.lang.String), (r32v20 java.lang.String), (r32v31 java.lang.String), (r32v31 java.lang.String), (r32v31 java.lang.String), (r32v31 java.lang.String), (r32v31 java.lang.String), (r32v31 java.lang.String), (r32v37 java.lang.String), (r32v37 java.lang.String) binds: [B:239:0x0519, B:240:?, B:228:0x04fd, B:229:?, B:170:0x0424, B:204:0x0490, B:205:?, B:175:0x042e, B:187:0x044d, B:190:0x0456, B:159:0x03f3, B:160:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:159:0x03f3] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x050c A[ExcHandler: Exception (e java.lang.Exception), PHI: r4 r32 
      PHI: (r4v163 int) = (r4v155 int), (r4v155 int), (r4v155 int), (r4v155 int), (r4v155 int), (r4v155 int), (r4v186 int), (r4v155 int), (r4v155 int), (r4v155 int), (r4v155 int), (r4v155 int) binds: [B:239:0x0519, B:240:?, B:228:0x04fd, B:229:?, B:170:0x0424, B:204:0x0490, B:205:?, B:175:0x042e, B:187:0x044d, B:190:0x0456, B:159:0x03f3, B:160:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r32v16 java.lang.String) = (r32v20 java.lang.String), (r32v20 java.lang.String), (r32v20 java.lang.String), (r32v20 java.lang.String), (r32v31 java.lang.String), (r32v31 java.lang.String), (r32v31 java.lang.String), (r32v31 java.lang.String), (r32v31 java.lang.String), (r32v31 java.lang.String), (r32v37 java.lang.String), (r32v37 java.lang.String) binds: [B:239:0x0519, B:240:?, B:228:0x04fd, B:229:?, B:170:0x0424, B:204:0x0490, B:205:?, B:175:0x042e, B:187:0x044d, B:190:0x0456, B:159:0x03f3, B:160:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:159:0x03f3] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0519 A[SYNTHETIC, Splitter:B:239:0x0519] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0665 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:236:0x0513] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06f3 A[ExcHandler: all (r0v71 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:133:0x0377] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0719 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:133:0x0377] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x075a A[ExcHandler: all (r0v64 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r31 
      PHI: (r31v5 java.lang.String) = (r31v8 java.lang.String), (r31v8 java.lang.String), (r31v12 java.lang.String), (r31v12 java.lang.String) binds: [B:123:0x0349, B:130:0x036c, B:111:0x02eb, B:112:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:111:0x02eb] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0765 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:123:0x0349] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x07b9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:101:0x02d2] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0851 A[ExcHandler: all (r0v108 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:55:0x01fe] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0919 A[ExcHandler: all (r0v36 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:46:0x01f0] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x098b A[ExcHandler: all (r0v31 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:18:0x010e] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x09b6 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:18:0x010e] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x09f8 A[SYNTHETIC, Splitter:B:391:0x09f8] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0ae4  */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0be2 A[SYNTHETIC, Splitter:B:514:0x0be2] */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0c1d  */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x0c4c  */
    /* JADX WARNING: Removed duplicated region for block: B:593:0x0de7 A[Catch:{ all -> 0x0e75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x0de8 A[Catch:{ all -> 0x0e75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:596:0x0dec A[Catch:{ all -> 0x0e75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:597:0x0def A[Catch:{ all -> 0x0e75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:651:0x0f2b A[SYNTHETIC, Splitter:B:651:0x0f2b] */
    /* JADX WARNING: Removed duplicated region for block: B:663:0x0f82 A[SYNTHETIC, Splitter:B:663:0x0f82] */
    /* JADX WARNING: Removed duplicated region for block: B:680:0x0ff5  */
    /* JADX WARNING: Removed duplicated region for block: B:681:0x0ff9  */
    /* JADX WARNING: Removed duplicated region for block: B:685:0x101f  */
    /* JADX WARNING: Removed duplicated region for block: B:689:0x1040  */
    /* JADX WARNING: Removed duplicated region for block: B:751:0x118a  */
    /* JADX WARNING: Removed duplicated region for block: B:778:0x1251 A[SYNTHETIC, Splitter:B:778:0x1251] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x026e A[ExcHandler: Exception (e java.lang.Exception), PHI: r28 
      PHI: (r28v38 long) = (r28v39 long), (r28v39 long), (r28v39 long), (r28v44 long) binds: [B:77:0x0254, B:80:0x0267, B:81:?, B:68:0x0220] A[DONT_GENERATE, DONT_INLINE], Splitter:B:68:0x0220] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0275 A[ExcHandler: all (r0v113 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:59:0x0203] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028a A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:59:0x0203] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120768e(java.net.Socket r71, java.lang.String r72, java.io.OutputStream r73, dn0.C86375p r74, java.io.InputStream r75) {
        /*
            r70 = this;
            r15 = r70
            r13 = r74
            java.lang.String r14 = "write response, delete PlayListFile failed:"
            java.lang.String r11 = "write response, delete PlayListFile:"
            java.lang.String r12 = "write response, socket close failed"
            java.lang.String r9 = "write response, dataSource close failed"
            java.lang.String r10 = ", rangeEnd="
            java.lang.String r8 = " bytes, rangeStart="
            java.lang.String r7 = "write response, total send "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "VideoProxy/"
            r1.append(r2)
            int r2 = r74.mo120781k()
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = r74.mo120784n()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, dn0.d> r2 = r15.f251115i
            java.lang.Object r2 = r2.get(r5)
            dn0.d r2 = (dn0.C86360d) r2
            cn0.i r3 = new cn0.i
            bn0.a r4 = r15.f251109c
            r3.<init>(r4, r2, r13)
            r4 = r72
            cn0.e r3 = r3.mo110332a(r4, r1)
            r2 = 6
            if (r3 != 0) goto L_0x0060
            java.lang.String r1 = "write response, dataSource is null, return"
            fn0.C87002g.m108022p(r2, r6, r1)
            return
        L_0x0060:
            r1 = 65536(0x10000, float:9.18355E-41)
            r75 = r11
            byte[] r11 = new byte[r1]
            r28 = r11
            dn0.b r11 = dn0.C86358b.f251077c
            r30 = r11
            r29 = r12
            long r11 = r74.mo120778h()
            r31 = r9
            r32 = r10
            long r9 = r74.mo120779i()
            r33 = -2
            r35 = -1
            r37 = r14
            r13 = 1
            int r16 = (r11 > r35 ? 1 : (r11 == r35 ? 0 : -1))
            if (r16 == 0) goto L_0x0093
            int r16 = (r11 > r33 ? 1 : (r11 == r33 ? 0 : -1))
            if (r16 == 0) goto L_0x0093
            long r16 = r11 - r9
            long r16 = r16 + r13
            r38 = r11
            r22 = r16
            goto L_0x0097
        L_0x0093:
            r38 = r11
            r22 = r35
        L_0x0097:
            cn0.g r11 = new cn0.g
            android.net.Uri r17 = android.net.Uri.parse(r72)
            r40 = 0
            int r12 = (r9 > r35 ? 1 : (r9 == r35 ? 0 : -1))
            if (r12 != 0) goto L_0x00a6
            r18 = r40
            goto L_0x00a8
        L_0x00a6:
            r18 = r9
        L_0x00a8:
            if (r12 != 0) goto L_0x00ad
            r20 = r40
            goto L_0x00af
        L_0x00ad:
            r20 = r9
        L_0x00af:
            r25 = 0
            java.lang.String r26 = r74.mo120783m()
            int r27 = r74.mo120777g()
            r16 = r11
            r24 = r5
            r16.<init>(r17, r18, r20, r22, r24, r25, r26, r27)
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream
            r1 = r73
            r12.<init>(r1)
            long r24 = java.lang.System.currentTimeMillis()
            r17 = 0
            r19 = -99999(0xfffffffffffe7961, double:NaN)
            r42 = 1000(0x3e8, double:4.94E-321)
            r1 = -1
            r26 = 9
            r21 = r12
            r27 = 1
            r14 = 0
            r13 = 4
            r12 = 5
            r1 = r70
            r2 = r3
            r16 = r3
            r3 = r11
            r4 = r72
            r45 = r5
            r5 = r6
            r46 = r6
            r6 = r74
            r47 = r7
            r7 = r71
            r48 = r8
            r8 = r45
            r49 = r9
            r15 = r32
            r9 = r17
            r53 = r75
            r58 = r11
            r59 = r21
            r55 = r28
            r54 = r29
            r51 = r30
            r56 = r38
            r11 = r19
            r61 = r37
            r15 = 4
            r13 = r24
            dn0.o$b r1 = r1.mo120767d(r2, r3, r4, r5, r6, r7, r8, r9, r11, r13)     // Catch:{ IOException -> 0x0aae, Exception -> 0x09b6, all -> 0x098b }
            boolean r2 = r1.f251120b     // Catch:{ IOException -> 0x0960, Exception -> 0x09b6, all -> 0x098b }
            if (r2 == 0) goto L_0x01e1
            java.lang.String r1 = "write response, isHandled"
            r2 = r46
            fn0.C87002g.m108022p(r15, r2, r1)     // Catch:{ IOException -> 0x016a, Exception -> 0x0164, all -> 0x015e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = r47
            r1.append(r3)
            r4 = 0
            r1.append(r4)
            r5 = r48
            r1.append(r5)
            r6 = r49
            r1.append(r6)
            r8 = r32
            r1.append(r8)
            r9 = r56
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            fn0.C87002g.m108022p(r15, r2, r1)
            r16.close()     // Catch:{ IOException -> 0x014c }
            r12 = 5
            goto L_0x0152
        L_0x014c:
            r11 = r31
            r12 = 5
            fn0.C87002g.m108022p(r12, r2, r11)
        L_0x0152:
            r71.close()     // Catch:{ IOException -> 0x0156 }
            goto L_0x015d
        L_0x0156:
            r0 = move-exception
            r1 = r0
            r13 = r54
            fn0.C87002g.m108023q(r12, r2, r13, r1)
        L_0x015d:
            return
        L_0x015e:
            r0 = move-exception
            r11 = r31
            r8 = r32
            goto L_0x0178
        L_0x0164:
            r0 = move-exception
            r11 = r31
            r8 = r32
            goto L_0x019a
        L_0x016a:
            r0 = move-exception
            r11 = r31
            r8 = r32
            goto L_0x01be
        L_0x0171:
            r0 = move-exception
            r11 = r31
            r8 = r32
            r2 = r46
        L_0x0178:
            r3 = r47
            r5 = r48
            r6 = r49
            r13 = r54
            r9 = r56
            r4 = 0
            r12 = 5
            r1 = r0
            r12 = r8
            r62 = r9
            r4 = r11
            r9 = r53
            r10 = r61
            r8 = r1
            r1 = r13
            r13 = r16
            goto L_0x09a3
        L_0x0193:
            r0 = move-exception
            r11 = r31
            r8 = r32
            r2 = r46
        L_0x019a:
            r3 = r47
            r5 = r48
            r6 = r49
            r13 = r54
            r9 = r56
            r4 = 0
            r12 = 5
            r1 = r0
            r15 = r74
            r12 = r8
            r62 = r9
            r4 = r11
            r9 = r53
            r10 = r61
            r8 = r1
            r1 = r13
            r13 = r16
            goto L_0x09d0
        L_0x01b7:
            r0 = move-exception
            r11 = r31
            r8 = r32
            r2 = r46
        L_0x01be:
            r3 = r47
            r5 = r48
            r6 = r49
            r13 = r54
            r9 = r56
            r4 = 0
            r12 = 5
            r1 = r0
            r15 = r74
            r32 = r8
            r4 = r11
            r54 = r13
            r13 = r16
            r14 = r51
            r8 = r59
            r16 = r1
            r11 = r9
            r9 = r53
            r10 = r61
            goto L_0x0987
        L_0x01e1:
            r11 = r31
            r8 = r32
            r2 = r46
            r3 = r47
            r5 = r48
            r6 = r49
            r9 = r56
            r4 = 0
            long r12 = r1.f251119a     // Catch:{ IOException -> 0x094a, Exception -> 0x093b, all -> 0x0919 }
            com.tencent.mm.vfs.m1 r14 = r1.f251122d     // Catch:{ IOException -> 0x08fc, Exception -> 0x08e6, all -> 0x0919 }
            cn0.e r1 = r1.f251121c     // Catch:{ IOException -> 0x08bc, Exception -> 0x08a3, all -> 0x088f }
            if (r1 == 0) goto L_0x01fc
            r28 = r12
            goto L_0x02ce
        L_0x01fc:
            r1 = r16
            boolean r4 = r1 instanceof bn0.C79718c     // Catch:{ IOException -> 0x0876, Exception -> 0x0862, all -> 0x0851 }
            if (r4 == 0) goto L_0x02b5
            r4 = r1
            bn0.c r4 = (bn0.C79718c) r4     // Catch:{ IOException -> 0x0296, Exception -> 0x028a, all -> 0x0275 }
            cn0.e r4 = r4.mo109843h()     // Catch:{ IOException -> 0x0296, Exception -> 0x028a, all -> 0x0275 }
            boolean r15 = r4 instanceof cn0.C80089l     // Catch:{ IOException -> 0x0296, Exception -> 0x028a, all -> 0x0275 }
            if (r15 == 0) goto L_0x0252
            r15 = r4
            cn0.l r15 = (cn0.C80089l) r15     // Catch:{ IOException -> 0x024e, Exception -> 0x028a, all -> 0x0275 }
            java.lang.String r15 = r15.getUri()     // Catch:{ IOException -> 0x024e, Exception -> 0x028a, all -> 0x0275 }
            if (r15 == 0) goto L_0x022f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x024e, Exception -> 0x028a, all -> 0x0275 }
            r4.<init>()     // Catch:{ IOException -> 0x024e, Exception -> 0x028a, all -> 0x0275 }
            r28 = r12
            java.lang.String r12 = "write response, firstTimeOpenFinish:"
            r4.append(r12)     // Catch:{ IOException -> 0x024a, Exception -> 0x026e, all -> 0x0275 }
            r4.append(r15)     // Catch:{ IOException -> 0x024a, Exception -> 0x026e, all -> 0x0275 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x024a, Exception -> 0x026e, all -> 0x0275 }
            r12 = 4
            fn0.C87002g.m108022p(r12, r2, r4)     // Catch:{ IOException -> 0x024a, Exception -> 0x026e, all -> 0x0275 }
            goto L_0x0247
        L_0x022f:
            r28 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x024a, Exception -> 0x026e, all -> 0x0275 }
            r12.<init>()     // Catch:{ IOException -> 0x024a, Exception -> 0x026e, all -> 0x0275 }
            java.lang.String r13 = "write response, upstreamDataSource:"
            r12.append(r13)     // Catch:{ IOException -> 0x024a, Exception -> 0x026e, all -> 0x0275 }
            r12.append(r4)     // Catch:{ IOException -> 0x024a, Exception -> 0x026e, all -> 0x0275 }
            java.lang.String r4 = r12.toString()     // Catch:{ IOException -> 0x024a, Exception -> 0x026e, all -> 0x0275 }
            r12 = 4
            fn0.C87002g.m108022p(r12, r2, r4)     // Catch:{ IOException -> 0x024a, Exception -> 0x026e, all -> 0x0275 }
        L_0x0247:
            r12 = 6
            goto L_0x02ce
        L_0x024a:
            r0 = move-exception
        L_0x024b:
            r4 = r0
            r12 = 6
            goto L_0x029a
        L_0x024e:
            r0 = move-exception
            r28 = r12
            goto L_0x024b
        L_0x0252:
            r28 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0271, Exception -> 0x026e, all -> 0x0275 }
            r12.<init>()     // Catch:{ IOException -> 0x0271, Exception -> 0x026e, all -> 0x0275 }
            java.lang.String r13 = "write response, abnormal upstreamDataSource "
            r12.append(r13)     // Catch:{ IOException -> 0x0271, Exception -> 0x026e, all -> 0x0275 }
            r12.append(r4)     // Catch:{ IOException -> 0x0271, Exception -> 0x026e, all -> 0x0275 }
            java.lang.String r4 = r12.toString()     // Catch:{ IOException -> 0x0271, Exception -> 0x026e, all -> 0x0275 }
            r12 = 6
            fn0.C87002g.m108022p(r12, r2, r4)     // Catch:{ IOException -> 0x026c, Exception -> 0x026e, all -> 0x0275 }
            goto L_0x02ce
        L_0x026c:
            r0 = move-exception
            goto L_0x0273
        L_0x026e:
            r0 = move-exception
        L_0x026f:
            r4 = r0
            goto L_0x028e
        L_0x0271:
            r0 = move-exception
        L_0x0272:
            r12 = 6
        L_0x0273:
            r4 = r0
            goto L_0x029a
        L_0x0275:
            r0 = move-exception
            r4 = r0
            r12 = r8
            r62 = r9
            r30 = r14
            r9 = r53
            r10 = r61
            r8 = r1
            r1 = r54
            r67 = r11
            r11 = r4
            r4 = r67
            goto L_0x07f9
        L_0x028a:
            r0 = move-exception
            r28 = r12
            goto L_0x026f
        L_0x028e:
            r15 = r74
            r31 = r11
            r30 = r14
            goto L_0x0328
        L_0x0296:
            r0 = move-exception
            r28 = r12
            goto L_0x0272
        L_0x029a:
            r15 = r74
            r13 = r1
            r1 = r4
            r32 = r8
            r16 = r11
            r31 = r14
            r65 = r35
            r14 = r51
            r8 = r59
            r30 = 1
            r64 = 0
            r11 = r9
            r9 = r53
            r10 = r61
            goto L_0x0ad9
        L_0x02b5:
            r28 = r12
            r12 = 6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x083a, Exception -> 0x082e, all -> 0x0851 }
            r4.<init>()     // Catch:{ IOException -> 0x083a, Exception -> 0x082e, all -> 0x0851 }
            java.lang.String r13 = "write response, dataSource:"
            r4.append(r13)     // Catch:{ IOException -> 0x083a, Exception -> 0x082e, all -> 0x0851 }
            r4.append(r1)     // Catch:{ IOException -> 0x083a, Exception -> 0x082e, all -> 0x0851 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x083a, Exception -> 0x082e, all -> 0x0851 }
            r13 = 4
            fn0.C87002g.m108022p(r13, r2, r4)     // Catch:{ IOException -> 0x083a, Exception -> 0x082e, all -> 0x0851 }
        L_0x02ce:
            long r12 = r1.mo109835a()     // Catch:{ IOException -> 0x0811, Exception -> 0x07fc, all -> 0x07eb }
            dn0.b r4 = r1.getFileType()     // Catch:{ IOException -> 0x07cc, Exception -> 0x07c8, all -> 0x07b9 }
            r15 = r74
            r15.mo120793v(r12, r4)     // Catch:{ IOException -> 0x07a6, Exception -> 0x0799, all -> 0x07b9 }
            r30 = r14
            r14 = r51
            boolean r14 = r4.equals(r14)     // Catch:{ IOException -> 0x0790, Exception -> 0x0789, all -> 0x0779 }
            if (r14 == 0) goto L_0x0347
            java.lang.String r14 = "write response, file type should not be unknown"
            r31 = r11
            r11 = 6
            fn0.C87002g.m108022p(r11, r2, r14)     // Catch:{ IOException -> 0x030f, Exception -> 0x02ff, all -> 0x075a }
            goto L_0x0349
        L_0x02f0:
            r75 = r1
            r12 = r8
            r13 = r9
            r4 = r31
            r9 = r53
            r1 = r54
            r10 = r61
            r8 = r0
            goto L_0x075d
        L_0x02ff:
            r0 = move-exception
            r13 = r1
            r12 = r8
            r62 = r9
            r4 = r31
        L_0x0306:
            r9 = r53
            r1 = r54
            r10 = r61
        L_0x030c:
            r8 = r0
            goto L_0x08b8
        L_0x030f:
            r0 = move-exception
            goto L_0x0337
        L_0x0311:
            r0 = move-exception
            r31 = r11
            r75 = r1
            r12 = r8
            r62 = r9
            r4 = r31
        L_0x031b:
            r9 = r53
            r1 = r54
            r10 = r61
            r8 = r0
            goto L_0x07f6
        L_0x0324:
            r0 = move-exception
            r31 = r11
            r4 = r0
        L_0x0328:
            r12 = r8
            r13 = r9
            r8 = r31
            r9 = r54
            r10 = r61
            r52 = 0
            goto L_0x061c
        L_0x0334:
            r0 = move-exception
            r31 = r11
        L_0x0337:
            r11 = r0
            r73 = r4
            r32 = r8
            r56 = r9
            r18 = r12
            r8 = r59
            r4 = 1
            r9 = 0
            r12 = 0
            goto L_0x04dd
        L_0x0347:
            r31 = r11
        L_0x0349:
            java.lang.String r22 = r4.toString()     // Catch:{ IOException -> 0x0773, Exception -> 0x0765, all -> 0x075a }
            boolean r11 = fn0.C87002g.m108019m(r72)     // Catch:{ IOException -> 0x0773, Exception -> 0x0765, all -> 0x075a }
            if (r11 != 0) goto L_0x0356
            r23 = 1
            goto L_0x0358
        L_0x0356:
            r23 = 0
        L_0x0358:
            r16 = r6
            r18 = r9
            r20 = r12
            java.lang.String r11 = fn0.C87000e.m108003d(r16, r18, r20, r22, r23)     // Catch:{ IOException -> 0x0773, Exception -> 0x0765, all -> 0x075a }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0773, Exception -> 0x0765, all -> 0x075a }
            r14.<init>()     // Catch:{ IOException -> 0x0773, Exception -> 0x0765, all -> 0x075a }
            r73 = r4
            java.lang.String r4 = "write response, dataSource open costTimeMs:"
            r14.append(r4)     // Catch:{ IOException -> 0x0743, Exception -> 0x0765, all -> 0x075a }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0743, Exception -> 0x0765, all -> 0x075a }
            r56 = r9
            long r9 = r16 - r24
            r14.append(r9)     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            java.lang.String r4 = r14.toString()     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            r9 = 4
            fn0.C87002g.m108022p(r9, r2, r4)     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            r4.<init>()     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            java.lang.String r9 = "write response, totalLength="
            r4.append(r9)     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            r4.append(r12)     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            java.lang.String r9 = ", send response headers: "
            r4.append(r9)     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            r9 = 0
            java.lang.String r10 = fn0.C87002g.m108029w(r11, r9)     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            r4.append(r10)     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            r10 = 4
            fn0.C87002g.m108022p(r10, r2, r4)     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            java.lang.String r4 = "UTF-8"
            byte[] r4 = r11.getBytes(r4)     // Catch:{ IOException -> 0x072e, Exception -> 0x0719, all -> 0x06f3 }
            r10 = r59
            r10.write(r4)     // Catch:{ IOException -> 0x06de, Exception -> 0x0719, all -> 0x06f3 }
            r10.flush()     // Catch:{ IOException -> 0x06de, Exception -> 0x0719, all -> 0x06f3 }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x06de, Exception -> 0x0719, all -> 0x06f3 }
            r4 = 0
            r11 = 1
        L_0x03b9:
            boolean r11 = java.lang.Thread.interrupted()     // Catch:{ IOException -> 0x06ae, Exception -> 0x0690, all -> 0x067b }
            r11 = r11 ^ 1
            if (r11 == 0) goto L_0x04f3
            boolean r14 = r74.mo120790t()     // Catch:{ IOException -> 0x04d2, Exception -> 0x04cb, all -> 0x04ba }
            if (r14 != 0) goto L_0x04f3
            r18 = r12
            r14 = r55
            r9 = 65536(0x10000, float:9.18355E-41)
            r12 = 0
            int r13 = r1.mo109838c(r14, r12, r9)     // Catch:{ IOException -> 0x04b4, Exception -> 0x04cb, all -> 0x04ba }
            r12 = -1
            if (r13 == r12) goto L_0x04ae
            boolean r20 = r74.mo120786p()     // Catch:{ IOException -> 0x04b4, Exception -> 0x04cb, all -> 0x04ba }
            if (r20 == 0) goto L_0x03dd
            goto L_0x04ae
        L_0x03dd:
            long r20 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x04b4, Exception -> 0x04cb, all -> 0x04ba }
            r59 = r10
            long r9 = r20 - r16
            int r16 = (r9 > r42 ? 1 : (r9 == r42 ? 0 : -1))
            if (r16 <= 0) goto L_0x0422
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x041e, Exception -> 0x04cb, all -> 0x040b }
            r12.<init>()     // Catch:{ IOException -> 0x041e, Exception -> 0x04cb, all -> 0x040b }
            r32 = r8
            java.lang.String r8 = "write response, not receive data over "
            r12.append(r8)     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            r12.append(r9)     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            java.lang.String r8 = "ms"
            r12.append(r8)     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            java.lang.String r8 = r12.toString()     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            r9 = 5
            fn0.C87002g.m108022p(r9, r2, r8)     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            goto L_0x0424
        L_0x0407:
            r0 = move-exception
            r12 = r0
            goto L_0x047a
        L_0x040b:
            r0 = move-exception
            r32 = r8
        L_0x040e:
            r8 = r0
            r15 = r8
        L_0x0410:
            r8 = r31
            r12 = r32
            r10 = r53
            r9 = r54
            r13 = r56
            r11 = r61
            goto L_0x05f4
        L_0x041e:
            r0 = move-exception
            r32 = r8
            goto L_0x0478
        L_0x0422:
            r32 = r8
        L_0x0424:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x04a8, Exception -> 0x050c, all -> 0x0508 }
            if (r4 != 0) goto L_0x048b
            int r8 = (r6 > r40 ? 1 : (r6 == r40 ? 0 : -1))
            if (r8 != 0) goto L_0x048b
            boolean r8 = r1 instanceof bn0.C79718c     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            if (r8 == 0) goto L_0x043a
            r8 = r1
            bn0.c r8 = (bn0.C79718c) r8     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            cn0.e r8 = r8.mo109843h()     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            goto L_0x0441
        L_0x043a:
            boolean r8 = r1 instanceof cn0.C80089l     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            if (r8 == 0) goto L_0x0440
            r8 = r1
            goto L_0x0441
        L_0x0440:
            r8 = 0
        L_0x0441:
            boolean r9 = r8 instanceof cn0.C80089l     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            if (r9 == 0) goto L_0x048b
            cn0.l r8 = (cn0.C80089l) r8     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            fn0.h r8 = r8.mo110335e()     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            if (r8 == 0) goto L_0x0481
            fn0.f r8 = (fn0.C87001f) r8     // Catch:{ IOException -> 0x0477, Exception -> 0x0462, all -> 0x0460 }
            boolean r8 = r8.mo121404a(r14)     // Catch:{ IOException -> 0x0477, Exception -> 0x0462, all -> 0x0460 }
            if (r8 == 0) goto L_0x0456
            goto L_0x048b
        L_0x0456:
            cn0.l$d r8 = new cn0.l$d     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            java.lang.String r9 = "invalid content"
            r10 = r58
            r8.<init>(r9, r10)     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            throw r8     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
        L_0x0460:
            r0 = move-exception
            goto L_0x040e
        L_0x0462:
            r0 = move-exception
            r8 = r0
            r13 = r1
            r14 = r8
            r27 = r11
            r12 = r32
            r9 = r53
            r1 = r54
            r62 = r56
            r10 = r61
            r8 = r4
            r4 = r31
            goto L_0x09d6
        L_0x0477:
            r0 = move-exception
        L_0x0478:
            r8 = r0
            r12 = r8
        L_0x047a:
            r8 = r59
            r9 = 0
        L_0x047d:
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x052d
        L_0x0481:
            r10 = r58
            java.lang.String r8 = "write response, predicator is null"
            r9 = 6
            fn0.C87002g.m108022p(r9, r2, r8)     // Catch:{ IOException -> 0x0407, Exception -> 0x050c, all -> 0x0508 }
            goto L_0x048d
        L_0x048b:
            r10 = r58
        L_0x048d:
            r8 = r59
            r9 = 0
            r8.write(r14, r9, r13)     // Catch:{ IOException -> 0x04a6, Exception -> 0x050c, all -> 0x0508 }
            int r4 = r4 + r13
            r15.mo120794w(r13)     // Catch:{ IOException -> 0x04a6, Exception -> 0x050c, all -> 0x0508 }
            r15.mo120788r(r4)     // Catch:{ IOException -> 0x04a6, Exception -> 0x050c, all -> 0x0508 }
            r58 = r10
            r55 = r14
            r12 = r18
            r9 = 0
            r10 = r8
            r8 = r32
            goto L_0x03b9
        L_0x04a6:
            r0 = move-exception
            goto L_0x04ac
        L_0x04a8:
            r0 = move-exception
            r8 = r59
            r9 = 0
        L_0x04ac:
            r12 = r0
            goto L_0x047d
        L_0x04ae:
            r32 = r8
            r8 = r10
        L_0x04b1:
            r9 = 0
            goto L_0x04f9
        L_0x04b4:
            r0 = move-exception
            r32 = r8
            r8 = r10
        L_0x04b8:
            r9 = 0
            goto L_0x04d9
        L_0x04ba:
            r0 = move-exception
            r32 = r8
            r8 = r0
            r9 = r70
            r47 = r3
            r12 = r4
            r48 = r5
            r37 = r31
            r14 = 0
            r3 = r1
            goto L_0x0f34
        L_0x04cb:
            r0 = move-exception
            r32 = r8
        L_0x04ce:
            r8 = r0
            r12 = r4
            r4 = r8
            goto L_0x051d
        L_0x04d2:
            r0 = move-exception
            r32 = r8
            r8 = r10
            r18 = r12
            goto L_0x04b8
        L_0x04d9:
            r10 = r0
            r12 = r4
            r4 = r11
            r11 = r10
        L_0x04dd:
            r14 = r73
            r13 = r1
            r1 = r11
            r64 = r12
            r65 = r18
            r16 = r31
            r9 = r53
            r11 = r56
            r10 = r61
            r31 = r30
            r30 = r4
            goto L_0x0ad9
        L_0x04f3:
            r32 = r8
            r8 = r10
            r18 = r12
            goto L_0x04b1
        L_0x04f9:
            if (r11 != 0) goto L_0x0511
            r10 = 256(0x100, float:3.59E-43)
            r15.mo120789s(r10)     // Catch:{ IOException -> 0x050e, Exception -> 0x050c, all -> 0x0508 }
            java.lang.String r12 = "write response, videoRequest is interrupted"
            r13 = 4
            fn0.C87002g.m108022p(r13, r2, r12)     // Catch:{ IOException -> 0x050e, Exception -> 0x050c, all -> 0x0508 }
            goto L_0x0513
        L_0x0508:
            r0 = move-exception
            r15 = r0
            goto L_0x0410
        L_0x050c:
            r0 = move-exception
            goto L_0x04ce
        L_0x050e:
            r0 = move-exception
            r12 = r0
            goto L_0x052d
        L_0x0511:
            r10 = 256(0x100, float:3.59E-43)
        L_0x0513:
            boolean r12 = r74.mo120790t()     // Catch:{ IOException -> 0x0665, Exception -> 0x0651, all -> 0x0628 }
            if (r12 == 0) goto L_0x0543
            r74.mo120772b()     // Catch:{ IOException -> 0x050e, Exception -> 0x050c, all -> 0x0508 }
            goto L_0x0543
        L_0x051d:
            r27 = r11
            r52 = r12
            r8 = r31
            r12 = r32
            r9 = r54
            r13 = r56
            r10 = r61
            goto L_0x061c
        L_0x052d:
            r14 = r73
            r13 = r1
            r64 = r4
            r1 = r12
            r65 = r18
            r16 = r31
            r9 = r53
            r10 = r61
            r31 = r30
            r30 = r11
            r11 = r56
            goto L_0x0ad9
        L_0x0543:
            r8.flush()     // Catch:{ IOException -> 0x0665, Exception -> 0x0651, all -> 0x0628 }
            r8.close()     // Catch:{ IOException -> 0x0665, Exception -> 0x060c, all -> 0x05e6 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            r8.append(r4)
            r8.append(r5)
            r8.append(r6)
            r12 = r32
            r8.append(r12)
            r13 = r56
            r8.append(r13)
            java.lang.String r3 = r8.toString()
            r4 = 4
            fn0.C87002g.m108022p(r4, r2, r3)
            r1.close()     // Catch:{ IOException -> 0x0571 }
            r3 = 5
            goto L_0x0577
        L_0x0571:
            r8 = r31
            r3 = 5
            fn0.C87002g.m108022p(r3, r2, r8)
        L_0x0577:
            r71.close()     // Catch:{ IOException -> 0x057b }
            goto L_0x0582
        L_0x057b:
            r0 = move-exception
            r4 = r0
            r9 = r54
            fn0.C87002g.m108023q(r3, r2, r9, r4)
        L_0x0582:
            if (r30 == 0) goto L_0x05da
            boolean r3 = r30.mo119978p()
            if (r3 == 0) goto L_0x05da
            boolean r3 = r30.mo119967g()
            if (r3 == 0) goto L_0x05da
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r10 = r53
            r3.append(r10)
            java.lang.String r4 = r30.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 4
            fn0.C87002g.m108022p(r4, r2, r3)
            java.lang.String r3 = r30.mo119971i()
            an0.a r4 = an0.C79592a.m96648a()
            java.lang.String r4 = r4.mo109708d()
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x05da
            boolean r3 = r30.mo119966f()
            if (r3 != 0) goto L_0x05da
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r61
            r3.append(r4)
            java.lang.String r4 = r30.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 5
            fn0.C87002g.m108022p(r4, r2, r3)
        L_0x05da:
            r6 = -99999(0xfffffffffffe7961, double:NaN)
            r14 = 0
            r9 = r70
            r3 = r28
            r5 = r45
            goto L_0x0fea
        L_0x05e6:
            r0 = move-exception
            r8 = r31
            r12 = r32
            r10 = r53
            r9 = r54
            r13 = r56
            r11 = r61
            r15 = r0
        L_0x05f4:
            r47 = r3
            r48 = r5
            r37 = r8
            r54 = r9
            r53 = r10
            r61 = r11
            r32 = r12
            r56 = r13
            r8 = r15
            r14 = 0
            r9 = r70
            r3 = r1
            r12 = r4
            goto L_0x0f34
        L_0x060c:
            r0 = move-exception
            r8 = r31
            r12 = r32
            r9 = r54
            r13 = r56
            r10 = r61
            r52 = r4
            r27 = r11
            r4 = r0
        L_0x061c:
            r62 = r13
            r13 = r1
            r14 = r4
            r4 = r8
            r1 = r9
            r8 = r52
            r9 = r53
            goto L_0x09d6
        L_0x0628:
            r0 = move-exception
            r75 = r1
            r16 = r4
            r4 = r31
            r12 = r32
            r9 = r53
            r1 = r54
            r13 = r56
            r10 = r61
            r8 = r0
            r15 = r75
            r11 = r5
            r60 = 0
            r5 = r1
            r67 = r8
            r8 = r3
            r3 = r10
            r10 = r16
            r16 = r67
            r68 = r13
            r14 = r4
            r4 = r9
            r9 = r12
            r12 = r68
            goto L_0x1227
        L_0x0651:
            r0 = move-exception
            r75 = r1
            r16 = r4
            r17 = r11
            r4 = r31
            r12 = r32
            r9 = r53
            r1 = r54
            r13 = r56
            r10 = r61
            goto L_0x06a2
        L_0x0665:
            r0 = move-exception
            r75 = r1
            r16 = r4
            r17 = r11
            r4 = r31
            r12 = r32
            r9 = r53
            r1 = r54
            r13 = r56
            r10 = r61
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x06c5
        L_0x067b:
            r0 = move-exception
            r75 = r1
            r16 = r4
            r12 = r8
            r4 = r31
            r9 = r53
            r1 = r54
            r13 = r56
            r10 = r61
            r8 = r0
            r44 = r16
            goto L_0x0704
        L_0x0690:
            r0 = move-exception
            r75 = r1
            r16 = r4
            r12 = r8
            r17 = r11
            r4 = r31
            r9 = r53
            r1 = r54
            r13 = r56
            r10 = r61
        L_0x06a2:
            r8 = r0
            r27 = r17
            r62 = r13
            r13 = r75
            r14 = r8
            r8 = r16
            goto L_0x09d6
        L_0x06ae:
            r0 = move-exception
            r75 = r1
            r16 = r4
            r17 = r11
            r18 = r12
            r4 = r31
            r9 = r53
            r1 = r54
            r13 = r56
            r11 = 256(0x100, float:3.59E-43)
            r12 = r8
            r8 = r10
            r10 = r61
        L_0x06c5:
            r20 = r0
            r54 = r1
            r32 = r12
            r11 = r13
            r64 = r16
            r65 = r18
            r1 = r20
            r31 = r30
            r14 = r73
            r13 = r75
            r16 = r4
            r30 = r17
            goto L_0x0ad9
        L_0x06de:
            r0 = move-exception
            r75 = r1
            r18 = r12
            r4 = r31
            r9 = r53
            r1 = r54
            r13 = r56
            r11 = 256(0x100, float:3.59E-43)
            r12 = r8
            r8 = r10
            r10 = r61
            goto L_0x0756
        L_0x06f3:
            r0 = move-exception
            r75 = r1
            r12 = r8
            r4 = r31
            r9 = r53
            r1 = r54
            r13 = r56
            r10 = r61
            r8 = r0
            r44 = 0
        L_0x0704:
            r15 = r75
            r11 = r5
            r16 = r8
            r60 = 0
            r5 = r1
            r8 = r3
            r3 = r10
            r10 = r44
            r67 = r13
            r14 = r4
            r4 = r9
            r9 = r12
            r12 = r67
            goto L_0x1227
        L_0x0719:
            r0 = move-exception
            r75 = r1
            r12 = r8
            r4 = r31
            r9 = r53
            r1 = r54
            r13 = r56
            r10 = r61
        L_0x0727:
            r8 = r0
            r62 = r13
            r13 = r75
            goto L_0x08b8
        L_0x072e:
            r0 = move-exception
            r75 = r1
            r18 = r12
            r4 = r31
            r9 = r53
            r1 = r54
            r13 = r56
            r10 = r61
            r11 = 256(0x100, float:3.59E-43)
            r12 = r8
            r8 = r59
            goto L_0x0756
        L_0x0743:
            r0 = move-exception
            r75 = r1
        L_0x0746:
            r18 = r12
            r4 = r31
        L_0x074a:
            r1 = r54
            r11 = 256(0x100, float:3.59E-43)
            r12 = r8
            r13 = r9
            r9 = r53
            r8 = r59
            r10 = r61
        L_0x0756:
            r16 = r0
            goto L_0x07b1
        L_0x075a:
            r0 = move-exception
            goto L_0x02f0
        L_0x075d:
            r62 = r13
            r14 = r30
            r13 = r75
            goto L_0x0929
        L_0x0765:
            r0 = move-exception
            r75 = r1
            r12 = r8
            r13 = r9
            r4 = r31
        L_0x076c:
            r9 = r53
            r1 = r54
        L_0x0770:
            r10 = r61
            goto L_0x0727
        L_0x0773:
            r0 = move-exception
            r75 = r1
            r73 = r4
            goto L_0x0746
        L_0x0779:
            r0 = move-exception
            r75 = r1
            r12 = r8
            r13 = r9
            r4 = r11
            r9 = r53
            r1 = r54
            goto L_0x07c5
        L_0x0784:
            r8 = r0
            r62 = r13
            goto L_0x07f6
        L_0x0789:
            r0 = move-exception
            r75 = r1
            r12 = r8
            r13 = r9
            r4 = r11
            goto L_0x076c
        L_0x0790:
            r0 = move-exception
            r75 = r1
            r73 = r4
            r4 = r11
            r18 = r12
            goto L_0x074a
        L_0x0799:
            r0 = move-exception
        L_0x079a:
            r75 = r1
            r12 = r8
            r4 = r11
            r30 = r14
            r1 = r54
            r13 = r9
            r9 = r53
            goto L_0x0770
        L_0x07a6:
            r0 = move-exception
            r75 = r1
            r73 = r4
            r4 = r11
            r18 = r12
            r30 = r14
            goto L_0x074a
        L_0x07b1:
            r62 = r13
            r14 = r73
            r13 = r75
            goto L_0x08d6
        L_0x07b9:
            r0 = move-exception
            r75 = r1
            r12 = r8
            r4 = r11
            r30 = r14
            r1 = r54
            r13 = r9
            r9 = r53
        L_0x07c5:
            r10 = r61
            goto L_0x0784
        L_0x07c8:
            r0 = move-exception
            r15 = r74
            goto L_0x079a
        L_0x07cc:
            r0 = move-exception
            r15 = r74
            r75 = r1
            r62 = r9
            r4 = r11
            r18 = r12
            r30 = r14
            r14 = r51
            r9 = r53
            r1 = r54
            r10 = r61
            r11 = 256(0x100, float:3.59E-43)
            r12 = r8
            r8 = r59
            r13 = r75
            r16 = r0
            goto L_0x08d6
        L_0x07eb:
            r0 = move-exception
            r75 = r1
            r12 = r8
            r62 = r9
            r4 = r11
            r30 = r14
            goto L_0x031b
        L_0x07f6:
            r11 = r8
            r8 = r75
        L_0x07f9:
            r13 = r8
            goto L_0x089f
        L_0x07fc:
            r0 = move-exception
            r15 = r74
            r75 = r1
            r12 = r8
            r62 = r9
            r4 = r11
            r30 = r14
            r9 = r53
            r1 = r54
            r10 = r61
            r13 = r75
            goto L_0x030c
        L_0x0811:
            r0 = move-exception
            r15 = r74
            r75 = r1
            r12 = r8
            r62 = r9
            r4 = r11
            r30 = r14
            r14 = r51
            r9 = r53
            r1 = r54
            r8 = r59
            r10 = r61
            r11 = 256(0x100, float:3.59E-43)
            r13 = r75
        L_0x082a:
            r16 = r0
            goto L_0x08d4
        L_0x082e:
            r0 = move-exception
            r15 = r74
            r13 = r1
            r12 = r8
            r62 = r9
            r4 = r11
            r30 = r14
            goto L_0x0306
        L_0x083a:
            r0 = move-exception
            r15 = r74
            r13 = r1
            r12 = r8
            r62 = r9
            r4 = r11
            r30 = r14
            r14 = r51
            r9 = r53
            r1 = r54
            r8 = r59
            r10 = r61
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x082a
        L_0x0851:
            r0 = move-exception
            r13 = r1
            r12 = r8
            r62 = r9
            r4 = r11
            r30 = r14
            r9 = r53
            r1 = r54
            r10 = r61
            r8 = r0
            r11 = r8
            goto L_0x089f
        L_0x0862:
            r0 = move-exception
            r15 = r74
            r62 = r9
            r4 = r11
            r28 = r12
            r30 = r14
            r9 = r53
            r10 = r61
            r13 = r1
            r12 = r8
            r1 = r54
            goto L_0x030c
        L_0x0876:
            r0 = move-exception
            r15 = r74
            r62 = r9
            r4 = r11
            r28 = r12
            r30 = r14
            r14 = r51
            r9 = r53
            r10 = r61
            r11 = 256(0x100, float:3.59E-43)
            r13 = r1
            r12 = r8
            r1 = r54
        L_0x088c:
            r8 = r59
            goto L_0x082a
        L_0x088f:
            r0 = move-exception
            r12 = r8
            r62 = r9
            r4 = r11
            r30 = r14
            r13 = r16
            r9 = r53
            r1 = r54
            r10 = r61
            r11 = r0
        L_0x089f:
            r14 = r30
            goto L_0x0928
        L_0x08a3:
            r0 = move-exception
            r15 = r74
            r62 = r9
            r4 = r11
            r28 = r12
            r30 = r14
            r13 = r16
            r9 = r53
            r1 = r54
            r10 = r61
            r12 = r8
            goto L_0x030c
        L_0x08b8:
            r14 = r8
            r8 = 0
            goto L_0x09d6
        L_0x08bc:
            r0 = move-exception
            r15 = r74
            r62 = r9
            r4 = r11
            r28 = r12
            r30 = r14
            r13 = r16
            r14 = r51
            r9 = r53
            r1 = r54
            r10 = r61
            r11 = 256(0x100, float:3.59E-43)
            r12 = r8
            goto L_0x088c
        L_0x08d4:
            r18 = r35
        L_0x08d6:
            r54 = r1
            r32 = r12
            r1 = r16
            r65 = r18
            r31 = r30
            r11 = r62
            r30 = 1
            goto L_0x0ad5
        L_0x08e6:
            r0 = move-exception
            r15 = r74
            r62 = r9
            r4 = r11
            r28 = r12
            r13 = r16
            r9 = r53
            r1 = r54
            r10 = r61
            r12 = r8
            r8 = r0
            r17 = r28
            goto L_0x09d0
        L_0x08fc:
            r0 = move-exception
            r15 = r74
            r62 = r9
            r4 = r11
            r28 = r12
            r13 = r16
            r14 = r51
            r9 = r53
            r1 = r54
            r10 = r61
            r11 = 256(0x100, float:3.59E-43)
            r12 = r8
            r8 = r59
            r16 = r0
            r17 = r28
            goto L_0x0981
        L_0x0919:
            r0 = move-exception
            r12 = r8
            r62 = r9
            r4 = r11
            r13 = r16
            r9 = r53
            r1 = r54
            r10 = r61
            r11 = r0
            r14 = 0
        L_0x0928:
            r8 = r11
        L_0x0929:
            r11 = r5
            r16 = r8
            r15 = r13
            r30 = r14
            r60 = 0
            r5 = r1
            r8 = r3
            r14 = r4
            r4 = r9
            r3 = r10
            r9 = r12
            r12 = r62
            goto L_0x09b3
        L_0x093b:
            r0 = move-exception
            r15 = r74
            r12 = r8
            r62 = r9
            r4 = r11
            r13 = r16
            r9 = r53
            r1 = r54
            goto L_0x09cd
        L_0x094a:
            r0 = move-exception
            r15 = r74
            r12 = r8
            r62 = r9
            r4 = r11
            r13 = r16
            r14 = r51
            r9 = r53
            r1 = r54
            r8 = r59
            r10 = r61
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x097f
        L_0x0960:
            r0 = move-exception
            r15 = r74
            r13 = r16
            r4 = r31
            r12 = r32
            r2 = r46
            r3 = r47
            r5 = r48
            r6 = r49
            r14 = r51
            r9 = r53
            r1 = r54
            r62 = r56
            r8 = r59
            r10 = r61
            r11 = 256(0x100, float:3.59E-43)
        L_0x097f:
            r16 = r0
        L_0x0981:
            r54 = r1
            r32 = r12
            r11 = r62
        L_0x0987:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0acb
        L_0x098b:
            r0 = move-exception
            r13 = r16
            r4 = r31
            r12 = r32
            r2 = r46
            r3 = r47
            r5 = r48
            r6 = r49
            r9 = r53
            r1 = r54
            r62 = r56
            r10 = r61
            r8 = r0
        L_0x09a3:
            r14 = r4
            r11 = r5
            r16 = r8
            r4 = r9
            r9 = r12
            r15 = r13
            r12 = r62
            r30 = 0
            r60 = 0
            r5 = r1
            r8 = r3
            r3 = r10
        L_0x09b3:
            r10 = 0
            goto L_0x1227
        L_0x09b6:
            r0 = move-exception
            r15 = r74
            r13 = r16
            r4 = r31
            r12 = r32
            r2 = r46
            r3 = r47
            r5 = r48
            r6 = r49
            r9 = r53
            r1 = r54
            r62 = r56
        L_0x09cd:
            r10 = r61
            r8 = r0
        L_0x09d0:
            r14 = r8
            r28 = r17
            r8 = 0
            r30 = 0
        L_0x09d6:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a91 }
            r11.<init>()     // Catch:{ all -> 0x0a91 }
            r54 = r1
            java.lang.String r1 = "other exception "
            r11.append(r1)     // Catch:{ all -> 0x0a8f }
            java.lang.String r1 = fn0.C87002g.m108013g(r14)     // Catch:{ all -> 0x0a8f }
            r11.append(r1)     // Catch:{ all -> 0x0a8f }
            java.lang.String r1 = r11.toString()     // Catch:{ all -> 0x0a8f }
            r11 = 4
            fn0.C87002g.m108022p(r11, r2, r1)     // Catch:{ all -> 0x0a8f }
            boolean r1 = r74.mo120790t()     // Catch:{ all -> 0x0a8f }
            if (r1 == 0) goto L_0x0a04
            r74.mo120772b()     // Catch:{ all -> 0x09fc }
            goto L_0x0a04
        L_0x09fc:
            r0 = move-exception
            r1 = r0
            r32 = r12
            r11 = r62
            goto L_0x0a99
        L_0x0a04:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r8)
            r1.append(r5)
            r1.append(r6)
            r1.append(r12)
            r5 = r62
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r3 = 4
            fn0.C87002g.m108022p(r3, r2, r1)
            r13.close()     // Catch:{ IOException -> 0x0a29 }
            goto L_0x0a2d
        L_0x0a29:
            r1 = 5
            fn0.C87002g.m108022p(r1, r2, r4)
        L_0x0a2d:
            if (r30 == 0) goto L_0x0a81
            boolean r1 = r30.mo119978p()
            if (r1 == 0) goto L_0x0a81
            boolean r1 = r30.mo119967g()
            if (r1 == 0) goto L_0x0a81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r3 = r30.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = 4
            fn0.C87002g.m108022p(r3, r2, r1)
            java.lang.String r1 = r30.mo119971i()
            an0.a r3 = an0.C79592a.m96648a()
            java.lang.String r3 = r3.mo109708d()
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L_0x0a81
            boolean r1 = r30.mo119966f()
            if (r1 != 0) goto L_0x0a81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r3 = r30.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = 5
            fn0.C87002g.m108022p(r3, r2, r1)
        L_0x0a81:
            r9 = r70
            r1 = r13
            r11 = r27
            r3 = r28
            r5 = r45
            r6 = -99999(0xfffffffffffe7961, double:NaN)
            goto L_0x0fea
        L_0x0a8f:
            r0 = move-exception
            goto L_0x0a94
        L_0x0a91:
            r0 = move-exception
            r54 = r1
        L_0x0a94:
            r32 = r12
            r11 = r62
            r1 = r0
        L_0x0a99:
            r16 = r1
            r15 = r13
            r60 = r14
            r14 = r4
            r4 = r9
            r12 = r11
            r9 = r32
            r11 = r5
            r5 = r54
            r67 = r8
            r8 = r3
            r3 = r10
            r10 = r67
            goto L_0x1227
        L_0x0aae:
            r0 = move-exception
            r15 = r74
            r13 = r16
            r4 = r31
            r2 = r46
            r3 = r47
            r5 = r48
            r6 = r49
            r14 = r51
            r9 = r53
            r11 = r56
            r8 = r59
            r10 = r61
            r1 = 256(0x100, float:3.59E-43)
            r16 = r0
        L_0x0acb:
            r1 = r16
            r28 = r17
            r65 = r35
            r30 = 1
            r31 = 0
        L_0x0ad5:
            r64 = 0
            r16 = r4
        L_0x0ad9:
            boolean r4 = r1 instanceof cn0.C80089l.C80095f     // Catch:{ all -> 0x1212 }
            r73 = r14
            java.lang.String r14 = "uri:"
            r61 = r10
            if (r4 == 0) goto L_0x0c4c
            r4 = r1
            cn0.l$f r4 = (cn0.C80089l.C80095f) r4     // Catch:{ all -> 0x0c3b }
            int r10 = r74.mo120777g()     // Catch:{ all -> 0x0c3b }
            r53 = r9
            r9 = 90
            if (r10 != r9) goto L_0x0c2e
            int r9 = r4.f234570d     // Catch:{ all -> 0x0c20 }
            r10 = 416(0x1a0, float:5.83E-43)
            if (r9 != r10) goto L_0x0bd1
            r9 = r70
            r37 = r16
            dn0.r r10 = r9.f251113g     // Catch:{ all -> 0x0bc9 }
            r47 = r3
            r48 = r5
            r5 = r45
            r3 = -1
            java.util.ArrayList r3 = r10.mo120797c(r5, r3)     // Catch:{ all -> 0x0bc7 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0bc7 }
        L_0x0b0c:
            boolean r10 = r3.hasNext()     // Catch:{ all -> 0x0bc7 }
            if (r10 == 0) goto L_0x0b4c
            java.lang.Object r10 = r3.next()     // Catch:{ all -> 0x0b46 }
            dn0.p r10 = (dn0.C86375p) r10     // Catch:{ all -> 0x0b46 }
            boolean r16 = r10.equals(r15)     // Catch:{ all -> 0x0b46 }
            if (r16 != 0) goto L_0x0b0c
            monitor-enter(r10)     // Catch:{ all -> 0x0b44 }
            r16 = r3
            r75 = r4
            long r3 = r10.f251140k     // Catch:{ all -> 0x0b40 }
            monitor-exit(r10)     // Catch:{ all -> 0x0b44 }
            int r17 = (r3 > r35 ? 1 : (r3 == r35 ? 0 : -1))
            if (r17 == 0) goto L_0x0b3b
            monitor-enter(r10)     // Catch:{ all -> 0x0b39 }
            long r3 = r10.f251140k     // Catch:{ all -> 0x0b35 }
            monitor-exit(r10)     // Catch:{ all -> 0x0b39 }
            dn0.b r10 = r10.mo120775e()     // Catch:{ all -> 0x0b46 }
            r20 = r3
            goto L_0x0b52
        L_0x0b35:
            r0 = move-exception
            r3 = r0
            monitor-exit(r10)     // Catch:{ all -> 0x0b39 }
            throw r3     // Catch:{ all -> 0x0b39 }
        L_0x0b39:
            r0 = move-exception
            goto L_0x0b47
        L_0x0b3b:
            r4 = r75
            r3 = r16
            goto L_0x0b0c
        L_0x0b40:
            r0 = move-exception
            r3 = r0
            monitor-exit(r10)     // Catch:{ all -> 0x0b44 }
            throw r3     // Catch:{ all -> 0x0b44 }
        L_0x0b44:
            r0 = move-exception
            goto L_0x0b47
        L_0x0b46:
            r0 = move-exception
        L_0x0b47:
            r3 = r0
            r56 = r11
            goto L_0x0d5a
        L_0x0b4c:
            r75 = r4
            r10 = r73
            r20 = r35
        L_0x0b52:
            int r3 = (r20 > r35 ? 1 : (r20 == r35 ? 0 : -1))
            if (r3 == 0) goto L_0x0bc4
            int r3 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0bc4
            int r3 = (r11 > r33 ? 1 : (r11 == r33 ? 0 : -1))
            if (r3 != 0) goto L_0x0bc4
            java.lang.String r22 = r10.toString()     // Catch:{ all -> 0x0bc7 }
            boolean r3 = fn0.C87002g.m108019m(r72)     // Catch:{ all -> 0x0bc7 }
            if (r3 != 0) goto L_0x0b6b
            r23 = 1
            goto L_0x0b6d
        L_0x0b6b:
            r23 = 0
        L_0x0b6d:
            r16 = r6
            r18 = r11
            java.lang.String r3 = fn0.C87000e.m108003d(r16, r18, r20, r22, r23)     // Catch:{ all -> 0x0bc7 }
            dn0.b r4 = dn0.C86358b.f251077c     // Catch:{ all -> 0x0bc7 }
            boolean r4 = r10.equals(r4)     // Catch:{ all -> 0x0bc7 }
            if (r4 == 0) goto L_0x0b83
            java.lang.String r4 = "file type should not be unknown"
            r10 = 6
            fn0.C87002g.m108022p(r10, r2, r4)     // Catch:{ all -> 0x0b46 }
        L_0x0b83:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bc7 }
            r4.<init>()     // Catch:{ all -> 0x0bc7 }
            java.lang.String r10 = "write response, responseCode 416, totalLength="
            r4.append(r10)     // Catch:{ all -> 0x0bc7 }
            r56 = r11
            r10 = r65
            r4.append(r10)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r10 = ", send response headers: "
            r4.append(r10)     // Catch:{ all -> 0x0ca6 }
            r10 = 0
            java.lang.String r11 = fn0.C87002g.m108029w(r3, r10)     // Catch:{ all -> 0x0ca6 }
            r4.append(r11)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0ca6 }
            r11 = 4
            fn0.C87002g.m108022p(r11, r2, r4)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = "UTF-8"
            byte[] r3 = r3.getBytes(r4)     // Catch:{ Exception -> 0x0bba }
            r8.write(r3)     // Catch:{ Exception -> 0x0bba }
            r8.flush()     // Catch:{ Exception -> 0x0bba }
            r8.close()     // Catch:{ Exception -> 0x0bba }
            goto L_0x0be0
        L_0x0bba:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = "write response, workaround 416 error "
            r8 = 4
            fn0.C87002g.m108023q(r8, r2, r4, r3)     // Catch:{ all -> 0x0ca6 }
            goto L_0x0bdf
        L_0x0bc4:
            r56 = r11
            goto L_0x0bdf
        L_0x0bc7:
            r0 = move-exception
            goto L_0x0bce
        L_0x0bc9:
            r0 = move-exception
            r47 = r3
            r48 = r5
        L_0x0bce:
            r56 = r11
            goto L_0x0c2b
        L_0x0bd1:
            r9 = r70
            r47 = r3
            r75 = r4
            r48 = r5
            r56 = r11
            r37 = r16
            r5 = r45
        L_0x0bdf:
            r10 = r1
        L_0x0be0:
            if (r10 == 0) goto L_0x0c1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c19 }
            r1.<init>()     // Catch:{ all -> 0x0c19 }
            r1.append(r14)     // Catch:{ all -> 0x0c19 }
            java.lang.String r3 = r74.mo120782l()     // Catch:{ all -> 0x0c19 }
            r1.append(r3)     // Catch:{ all -> 0x0c19 }
            java.lang.String r3 = ", InvalidResponseCode: \r\n"
            r1.append(r3)     // Catch:{ all -> 0x0c19 }
            r3 = r75
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4 = r3.f234571e     // Catch:{ all -> 0x0c19 }
            java.lang.String r4 = fn0.C87000e.m108001a(r4)     // Catch:{ all -> 0x0c19 }
            r1.append(r4)     // Catch:{ all -> 0x0c19 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0c19 }
            r4 = 4
            fn0.C87002g.m108022p(r4, r2, r1)     // Catch:{ all -> 0x0c19 }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r3.f234571e     // Catch:{ all -> 0x0c19 }
            long r11 = fn0.C87002g.m108015i(r1)     // Catch:{ all -> 0x0c19 }
            int r1 = r3.f234570d     // Catch:{ all -> 0x0c19 }
            long r3 = (long) r1     // Catch:{ all -> 0x0c19 }
            long r28 = fn0.C87002g.m108012f(r3, r11)     // Catch:{ all -> 0x0c19 }
            r1 = r10
            goto L_0x0ca0
        L_0x0c19:
            r0 = move-exception
            r1 = r0
            goto L_0x0d5c
        L_0x0c1d:
            r1 = r10
            goto L_0x0c9d
        L_0x0c20:
            r0 = move-exception
            r9 = r70
            r47 = r3
            r48 = r5
            r56 = r11
            r37 = r16
        L_0x0c2b:
            r3 = r0
            goto L_0x0d5a
        L_0x0c2e:
            r9 = r70
            r47 = r3
            r48 = r5
            r56 = r11
            r37 = r16
            r5 = r45
            goto L_0x0c9d
        L_0x0c3b:
            r0 = move-exception
            r47 = r3
            r48 = r5
            r53 = r9
            r56 = r11
            r37 = r16
            r9 = r70
            r3 = r0
        L_0x0c49:
            r8 = r3
            goto L_0x0d5e
        L_0x0c4c:
            r47 = r3
            r48 = r5
            r53 = r9
            r56 = r11
            r37 = r16
            r5 = r45
            r10 = 0
            r9 = r70
            boolean r3 = r1 instanceof cn0.C80089l.C80094e     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0ca8
            r3 = r1
            cn0.l$e r3 = (cn0.C80089l.C80094e) r3     // Catch:{ all -> 0x0ca6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ca6 }
            r4.<init>()     // Catch:{ all -> 0x0ca6 }
            r4.append(r14)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r8 = r74.mo120782l()     // Catch:{ all -> 0x0ca6 }
            r4.append(r8)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r8 = ", InvalidContentType: \r\n"
            r4.append(r8)     // Catch:{ all -> 0x0ca6 }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8 = r3.f234569d     // Catch:{ all -> 0x0ca6 }
            java.lang.String r8 = fn0.C87000e.m108001a(r8)     // Catch:{ all -> 0x0ca6 }
            r4.append(r8)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0ca6 }
            r8 = 4
            fn0.C87002g.m108022p(r8, r2, r4)     // Catch:{ all -> 0x0ca6 }
            int r4 = r74.mo120777g()     // Catch:{ all -> 0x0ca6 }
            r8 = 90
            if (r4 != r8) goto L_0x0c9d
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r3.f234569d     // Catch:{ all -> 0x0ca6 }
            long r3 = fn0.C87002g.m108015i(r3)     // Catch:{ all -> 0x0ca6 }
            r10 = 3
            long r28 = fn0.C87002g.m108012f(r10, r3)     // Catch:{ all -> 0x0ca6 }
            r11 = r3
            goto L_0x0ca0
        L_0x0c9d:
            r11 = -99999(0xfffffffffffe7961, double:NaN)
        L_0x0ca0:
            r14 = r1
            r3 = r11
            r12 = r30
            goto L_0x0f25
        L_0x0ca6:
            r0 = move-exception
            goto L_0x0c2b
        L_0x0ca8:
            boolean r3 = r1 instanceof cn0.C80089l.C80093d     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0cda
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ca6 }
            r3.<init>()     // Catch:{ all -> 0x0ca6 }
            r3.append(r14)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = r74.mo120782l()     // Catch:{ all -> 0x0ca6 }
            r3.append(r4)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = ", InvalidContent"
            r3.append(r4)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0ca6 }
            r4 = 4
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0ca6 }
            int r3 = r74.mo120777g()     // Catch:{ all -> 0x0ca6 }
            r4 = 90
            if (r3 != r4) goto L_0x0c9d
            r3 = 10
            r11 = -99999(0xfffffffffffe7961, double:NaN)
            long r28 = fn0.C87002g.m108012f(r3, r11)     // Catch:{ all -> 0x0ca6 }
            goto L_0x0ca0
        L_0x0cda:
            r11 = -99999(0xfffffffffffe7961, double:NaN)
            boolean r3 = r1 instanceof cn0.C80089l.C80096g     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0d0c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ca6 }
            r3.<init>()     // Catch:{ all -> 0x0ca6 }
            r3.append(r14)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = r74.mo120782l()     // Catch:{ all -> 0x0ca6 }
            r3.append(r4)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = ", MalformedResponse"
            r3.append(r4)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0ca6 }
            r4 = 4
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0ca6 }
            int r3 = r74.mo120777g()     // Catch:{ all -> 0x0ca6 }
            r4 = 90
            if (r3 != r4) goto L_0x0ca0
            r3 = 12
            long r28 = fn0.C87002g.m108012f(r3, r11)     // Catch:{ all -> 0x0ca6 }
            goto L_0x0ca0
        L_0x0d0c:
            boolean r3 = r1 instanceof cn0.C80089l.C80091b     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0d33
            r3 = 256(0x100, float:3.59E-43)
            r15.mo120789s(r3)     // Catch:{ all -> 0x0ca6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ca6 }
            r3.<init>()     // Catch:{ all -> 0x0ca6 }
            r3.append(r14)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = r74.mo120782l()     // Catch:{ all -> 0x0ca6 }
            r3.append(r4)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = " connect to server interrupted"
            r3.append(r4)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0ca6 }
            r4 = 5
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0ca6 }
            goto L_0x0ed5
        L_0x0d33:
            boolean r3 = r1 instanceof cn0.C80089l.C80092c     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0d66
            r3 = 256(0x100, float:3.59E-43)
            r15.mo120789s(r3)     // Catch:{ all -> 0x0ca6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ca6 }
            r3.<init>()     // Catch:{ all -> 0x0ca6 }
            r3.append(r14)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = r74.mo120782l()     // Catch:{ all -> 0x0ca6 }
            r3.append(r4)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = " read interrupted"
            r3.append(r4)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0ca6 }
            r4 = 5
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0ca6 }
            goto L_0x0ed5
        L_0x0d5a:
            r10 = r1
            r1 = r3
        L_0x0d5c:
            r8 = r1
            r1 = r10
        L_0x0d5e:
            r14 = r1
            r3 = r13
            r30 = r31
            r12 = r64
            goto L_0x0f34
        L_0x0d66:
            boolean r3 = r1 instanceof cn0.C80089l.C80097h     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0e00
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e75 }
            r3.<init>()     // Catch:{ all -> 0x0e75 }
            r3.append(r14)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = r74.mo120782l()     // Catch:{ all -> 0x0e75 }
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = ", unable to connect server: "
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = fn0.C87002g.m108013g(r1)     // Catch:{ all -> 0x0e75 }
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0e75 }
            r4 = 5
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0e75 }
            int r3 = r74.mo120777g()     // Catch:{ all -> 0x0e75 }
            r4 = 90
            if (r3 != r4) goto L_0x0ca0
            boolean r3 = r13 instanceof bn0.C79718c     // Catch:{ all -> 0x0e75 }
            if (r3 == 0) goto L_0x0dc2
            r3 = r13
            bn0.c r3 = (bn0.C79718c) r3     // Catch:{ all -> 0x0e75 }
            cn0.e r3 = r3.mo109843h()     // Catch:{ all -> 0x0e75 }
            boolean r4 = r3 instanceof cn0.C80085j     // Catch:{ all -> 0x0e75 }
            if (r4 == 0) goto L_0x0dab
            cn0.j r3 = (cn0.C80085j) r3     // Catch:{ all -> 0x0e75 }
            cn0.g r14 = r3.mo110339h()     // Catch:{ all -> 0x0e75 }
            goto L_0x0dcf
        L_0x0dab:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e75 }
            r3.<init>()     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = "write response, cacheDataSource error:"
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            r3.append(r13)     // Catch:{ all -> 0x0e75 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0e75 }
            r4 = 4
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0e75 }
            goto L_0x0dce
        L_0x0dc2:
            boolean r3 = r13 instanceof cn0.C80085j     // Catch:{ all -> 0x0e75 }
            if (r3 == 0) goto L_0x0dce
            r3 = r13
            cn0.j r3 = (cn0.C80085j) r3     // Catch:{ all -> 0x0e75 }
            cn0.g r14 = r3.mo110339h()     // Catch:{ all -> 0x0e75 }
            goto L_0x0dcf
        L_0x0dce:
            r14 = r10
        L_0x0dcf:
            if (r14 == 0) goto L_0x0de8
            android.net.Uri r3 = r14.f234519a     // Catch:{ all -> 0x0e75 }
            if (r3 == 0) goto L_0x0de8
            java.lang.String r4 = r3.getHost()     // Catch:{ all -> 0x0e75 }
            if (r4 == 0) goto L_0x0de8
            java.lang.String r3 = r3.getHost()     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = "127.0.0.1"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0e75 }
            if (r3 == 0) goto L_0x0de8
            goto L_0x0dea
        L_0x0de8:
            r27 = 0
        L_0x0dea:
            if (r27 == 0) goto L_0x0def
            r3 = 13
            goto L_0x0df9
        L_0x0def:
            boolean r3 = fn0.C87002g.m108020n()     // Catch:{ all -> 0x0e75 }
            if (r3 == 0) goto L_0x0df7
            r3 = 5
            goto L_0x0df9
        L_0x0df7:
            r3 = 9
        L_0x0df9:
            long r3 = (long) r3     // Catch:{ all -> 0x0e75 }
            long r28 = fn0.C87002g.m108012f(r3, r11)     // Catch:{ all -> 0x0e75 }
            goto L_0x0ca0
        L_0x0e00:
            boolean r3 = r1 instanceof cn0.C80089l.C80090a     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0e3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e75 }
            r3.<init>()     // Catch:{ all -> 0x0e75 }
            r3.append(r14)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = r74.mo120782l()     // Catch:{ all -> 0x0e75 }
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = ", read upstream error1: "
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = fn0.C87002g.m108013g(r1)     // Catch:{ all -> 0x0e75 }
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0e75 }
            r4 = 5
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0e75 }
            int r3 = r74.mo120777g()     // Catch:{ all -> 0x0e75 }
            r4 = 90
            if (r3 != r4) goto L_0x0ca0
            int r3 = r9.mo120765b(r1)     // Catch:{ all -> 0x0e75 }
            long r3 = (long) r3     // Catch:{ all -> 0x0e75 }
            long r28 = fn0.C87002g.m108012f(r3, r11)     // Catch:{ all -> 0x0e75 }
            goto L_0x0ca0
        L_0x0e3a:
            boolean r3 = r13 instanceof cn0.C80087k     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0e79
            boolean r3 = r1 instanceof cn0.C80087k.C80088a     // Catch:{ all -> 0x0e75 }
            if (r3 == 0) goto L_0x0e79
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e75 }
            r3.<init>()     // Catch:{ all -> 0x0e75 }
            r3.append(r14)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = r74.mo120782l()     // Catch:{ all -> 0x0e75 }
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = ", read upstream error2: "
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = fn0.C87002g.m108013g(r1)     // Catch:{ all -> 0x0e75 }
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0e75 }
            r4 = 5
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0e75 }
            int r3 = r74.mo120777g()     // Catch:{ all -> 0x0e75 }
            r4 = 90
            if (r3 != r4) goto L_0x0ca0
            r3 = 1404(0x57c, double:6.937E-321)
            long r28 = fn0.C87002g.m108012f(r3, r11)     // Catch:{ all -> 0x0e75 }
            goto L_0x0ca0
        L_0x0e75:
            r0 = move-exception
            r3 = r0
            goto L_0x0c49
        L_0x0e79:
            boolean r3 = r1 instanceof java.net.NoRouteToHostException     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0eb0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e75 }
            r3.<init>()     // Catch:{ all -> 0x0e75 }
            r3.append(r14)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = r74.mo120782l()     // Catch:{ all -> 0x0e75 }
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = ", read upstream error3: "
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = fn0.C87002g.m108013g(r1)     // Catch:{ all -> 0x0e75 }
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0e75 }
            r4 = 5
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0e75 }
            int r3 = r74.mo120777g()     // Catch:{ all -> 0x0e75 }
            r4 = 90
            if (r3 != r4) goto L_0x0ca0
            r3 = 1
            long r28 = fn0.C87002g.m108012f(r3, r11)     // Catch:{ all -> 0x0e75 }
            goto L_0x0ca0
        L_0x0eb0:
            boolean r3 = r1 instanceof java.io.InterruptedIOException     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0ed9
            r3 = 256(0x100, float:3.59E-43)
            r15.mo120789s(r3)     // Catch:{ all -> 0x0e75 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e75 }
            r3.<init>()     // Catch:{ all -> 0x0e75 }
            r3.append(r14)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = r74.mo120782l()     // Catch:{ all -> 0x0e75 }
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r4 = " is interrupted by system"
            r3.append(r4)     // Catch:{ all -> 0x0e75 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0e75 }
            r4 = 4
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0e75 }
        L_0x0ed5:
            r14 = r1
            r3 = r11
            r12 = 0
            goto L_0x0f25
        L_0x0ed9:
            java.lang.String r3 = r1.getMessage()     // Catch:{ all -> 0x11fd }
            java.lang.String r4 = "(?i)^.*((ECONNRESET)|(EPIPE)|(reset)).*$"
            boolean r3 = r3.matches(r4)     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0eee
            java.lang.String r3 = "response interrupted, client closed connection"
            r4 = 5
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0e75 }
            goto L_0x0ca0
        L_0x0eee:
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x11fd }
            java.lang.String r4 = "write byteCount err"
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x11fd }
            if (r3 == 0) goto L_0x0f04
            java.lang.String r3 = "response interrupted, socket write byteCount err"
            r4 = 5
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x0e75 }
            goto L_0x0ca0
        L_0x0f04:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x11fd }
            r3.<init>()     // Catch:{ all -> 0x11fd }
            r3.append(r14)     // Catch:{ all -> 0x11fd }
            r3.append(r15)     // Catch:{ all -> 0x11fd }
            java.lang.String r4 = ", error occurred while sending data "
            r3.append(r4)     // Catch:{ all -> 0x11fd }
            java.lang.String r4 = fn0.C87002g.m108013g(r1)     // Catch:{ all -> 0x11fd }
            r3.append(r4)     // Catch:{ all -> 0x11fd }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x11fd }
            r4 = 5
            fn0.C87002g.m108022p(r4, r2, r3)     // Catch:{ all -> 0x11fd }
            goto L_0x0ca0
        L_0x0f25:
            boolean r1 = r74.mo120790t()     // Catch:{ all -> 0x11e5 }
            if (r1 == 0) goto L_0x0f4c
            r74.mo120772b()     // Catch:{ all -> 0x0f2f }
            goto L_0x0f4c
        L_0x0f2f:
            r0 = move-exception
            r3 = r0
            r1 = r14
            goto L_0x0c49
        L_0x0f34:
            r15 = r3
            r16 = r8
            r10 = r12
            r60 = r14
            r9 = r32
            r14 = r37
            r8 = r47
            r11 = r48
            r4 = r53
            r5 = r54
            r12 = r56
            r3 = r61
            goto L_0x1227
        L_0x0f4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r8 = r47
            r1.append(r8)
            r10 = r64
            r1.append(r10)
            r11 = r48
            r1.append(r11)
            r1.append(r6)
            r6 = r32
            r1.append(r6)
            r6 = r56
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r6 = 4
            fn0.C87002g.m108022p(r6, r2, r1)
            r13.close()     // Catch:{ IOException -> 0x0f7a }
            r6 = 5
            goto L_0x0f80
        L_0x0f7a:
            r1 = r37
            r6 = 5
            fn0.C87002g.m108022p(r6, r2, r1)
        L_0x0f80:
            if (r14 != 0) goto L_0x0f8d
            r71.close()     // Catch:{ IOException -> 0x0f86 }
            goto L_0x0f8d
        L_0x0f86:
            r0 = move-exception
            r1 = r0
            r7 = r54
            fn0.C87002g.m108023q(r6, r2, r7, r1)
        L_0x0f8d:
            if (r31 == 0) goto L_0x0fe5
            boolean r1 = r31.mo119978p()
            if (r1 == 0) goto L_0x0fe5
            boolean r1 = r31.mo119967g()
            if (r1 == 0) goto L_0x0fe5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r6 = r53
            r1.append(r6)
            java.lang.String r6 = r31.toString()
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r6 = 4
            fn0.C87002g.m108022p(r6, r2, r1)
            java.lang.String r1 = r31.mo119971i()
            an0.a r6 = an0.C79592a.m96648a()
            java.lang.String r6 = r6.mo109708d()
            boolean r1 = r1.startsWith(r6)
            if (r1 == 0) goto L_0x0fe5
            boolean r1 = r31.mo119966f()
            if (r1 != 0) goto L_0x0fe5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r6 = r61
            r1.append(r6)
            java.lang.String r6 = r31.toString()
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r6 = 5
            fn0.C87002g.m108022p(r6, r2, r1)
        L_0x0fe5:
            r6 = r3
            r11 = r12
            r1 = r13
            r3 = r28
        L_0x0fea:
            dn0.r r8 = r9.f251113g
            r8.mo120798d(r15)
            boolean r8 = r74.mo120785o()
            if (r8 == 0) goto L_0x0ff9
            r74.mo120773c()
            goto L_0x1000
        L_0x0ff9:
            if (r11 == 0) goto L_0x1000
            r8 = 16
            r15.mo120789s(r8)
        L_0x1000:
            java.lang.String r8 = r74.mo120783m()
            int r20 = r74.mo120777g()
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r24
            int r11 = (int) r10
            java.util.Map<java.lang.String, dn0.c> r10 = r9.f251114h
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r5 = r10.get(r5)
            r16 = r5
            dn0.c r16 = (dn0.C86359c) r16
            boolean r5 = r14 instanceof cn0.C80089l.C80095f
            if (r5 == 0) goto L_0x1040
            java.lang.String r1 = "HttpDataSource.InvalidResponseCodeException"
            cn0.l$f r14 = (cn0.C80089l.C80095f) r14
            if (r16 == 0) goto L_0x103c
            int r5 = r14.f234570d
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10 = r14.f234571e
            r17 = r8
            r18 = r72
            r19 = r5
            r21 = r1
            r22 = r10
            r23 = r11
            r24 = r3
            r26 = r6
            r16.mo120751a(r17, r18, r19, r20, r21, r22, r23, r24, r26)
        L_0x103c:
            r36 = r1
            goto L_0x1180
        L_0x1040:
            boolean r5 = r14 instanceof cn0.C80089l.C80094e
            if (r5 == 0) goto L_0x1060
            java.lang.String r1 = "HttpDataSource.InvalidContentTypeException"
            cn0.l$e r14 = (cn0.C80089l.C80094e) r14
            if (r16 == 0) goto L_0x103c
            r19 = 3
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5 = r14.f234569d
            r17 = r8
            r18 = r72
            r21 = r1
            r22 = r5
            r23 = r11
            r24 = r3
            r26 = r6
            r16.mo120751a(r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x103c
        L_0x1060:
            boolean r5 = r14 instanceof cn0.C80089l.C80093d
            if (r5 == 0) goto L_0x107f
            java.lang.String r1 = "HttpDataSource.InvalidContentException"
            if (r16 == 0) goto L_0x103c
            r19 = 10
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            r17 = r8
            r18 = r72
            r21 = r1
            r23 = r11
            r24 = r3
            r26 = r6
            r16.mo120751a(r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x103c
        L_0x107f:
            boolean r5 = r14 instanceof cn0.C80089l.C80096g
            if (r5 == 0) goto L_0x109e
            java.lang.String r1 = "HttpDataSource.MalformedResponseException"
            if (r16 == 0) goto L_0x103c
            r19 = 12
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            r17 = r8
            r18 = r72
            r21 = r1
            r23 = r11
            r24 = r3
            r26 = r6
            r16.mo120751a(r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x103c
        L_0x109e:
            boolean r5 = r14 instanceof cn0.C80089l.C80091b
            if (r5 == 0) goto L_0x10c7
            java.lang.String r1 = "HttpDataSource.InterruptConnectServerException"
            if (r16 == 0) goto L_0x103c
            boolean r5 = fn0.C87002g.m108020n()
            if (r5 == 0) goto L_0x10af
            r19 = 5
            goto L_0x10b1
        L_0x10af:
            r19 = 9
        L_0x10b1:
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            r17 = r8
            r18 = r72
            r21 = r1
            r23 = r11
            r24 = r3
            r26 = r6
            r16.mo120751a(r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x103c
        L_0x10c7:
            boolean r5 = r14 instanceof cn0.C80089l.C80092c
            if (r5 == 0) goto L_0x10f0
            java.lang.String r1 = "HttpDataSource.InterruptReadException"
            if (r16 == 0) goto L_0x103c
            boolean r5 = fn0.C87002g.m108020n()
            if (r5 == 0) goto L_0x10d8
            r19 = 5
            goto L_0x10da
        L_0x10d8:
            r19 = 9
        L_0x10da:
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            r17 = r8
            r18 = r72
            r21 = r1
            r23 = r11
            r24 = r3
            r26 = r6
            r16.mo120751a(r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x103c
        L_0x10f0:
            boolean r5 = r14 instanceof cn0.C80089l.C80097h
            if (r5 == 0) goto L_0x1119
            java.lang.String r1 = "HttpDataSource.UnableConnectServerException"
            if (r16 == 0) goto L_0x103c
            boolean r5 = fn0.C87002g.m108020n()
            if (r5 == 0) goto L_0x1101
            r19 = 5
            goto L_0x1103
        L_0x1101:
            r19 = 9
        L_0x1103:
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            r17 = r8
            r18 = r72
            r21 = r1
            r23 = r11
            r24 = r3
            r26 = r6
            r16.mo120751a(r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x103c
        L_0x1119:
            boolean r5 = r14 instanceof cn0.C80089l.C80090a
            if (r5 == 0) goto L_0x113b
            java.lang.String r1 = "HttpDataSource.HttpDataSourceException"
            if (r16 == 0) goto L_0x103c
            int r19 = r9.mo120765b(r14)
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            r17 = r8
            r18 = r72
            r21 = r1
            r23 = r11
            r24 = r3
            r26 = r6
            r16.mo120751a(r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x103c
        L_0x113b:
            boolean r1 = r1 instanceof cn0.C80087k
            if (r1 == 0) goto L_0x115c
            boolean r1 = r14 instanceof cn0.C80087k.C80088a
            if (r1 == 0) goto L_0x115c
            java.lang.String r1 = "FileDataSource.FileDataSourceException"
            if (r16 == 0) goto L_0x103c
            r19 = 1404(0x57c, float:1.967E-42)
            r22 = 0
            r17 = r8
            r18 = r72
            r21 = r1
            r23 = r11
            r24 = r3
            r26 = r6
            r16.mo120751a(r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x103c
        L_0x115c:
            boolean r1 = r14 instanceof java.net.NoRouteToHostException
            if (r1 == 0) goto L_0x117c
            java.lang.String r1 = "NoRouteToHostException"
            if (r16 == 0) goto L_0x103c
            r19 = 1
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            r17 = r8
            r18 = r72
            r21 = r1
            r23 = r11
            r24 = r3
            r26 = r6
            r16.mo120751a(r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x103c
        L_0x117c:
            java.lang.String r1 = ""
            goto L_0x103c
        L_0x1180:
            an0.a r1 = an0.C79592a.m96648a()
            en0.a r1 = r1.mo109709e()
            if (r1 == 0) goto L_0x11dd
            long r34 = fn0.C87002g.m108011e(r3, r6)
            an0.a r1 = an0.C79592a.m96648a()
            en0.a r1 = r1.mo109709e()
            int r19 = r74.mo120777g()
            long r20 = r74.mo120779i()
            long r22 = r74.mo120778h()
            monitor-enter(r74)
            long r12 = r15.f251140k     // Catch:{ all -> 0x11d9 }
            monitor-exit(r74)
            int r26 = r74.mo120774d()
            java.lang.String r27 = r74.mo120780j()
            long r16 = java.lang.System.currentTimeMillis()
            int r5 = r15.f251149t
            long r9 = (long) r5
            long r9 = r9 * r42
            float r5 = (float) r9
            long r9 = r15.f251150u
            long r16 = r16 - r9
            r9 = 1024(0x400, double:5.06E-321)
            long r9 = r9 * r16
            float r9 = (float) r9
            float r5 = r5 / r9
            long r9 = (long) r5
            r16 = r1
            lu0.c r16 = (lu0.C88650c) r16
            r17 = r8
            r18 = r72
            r24 = r12
            r28 = r9
            r30 = r3
            r32 = r6
            r37 = r11
            r16.mo123088a(r17, r18, r19, r20, r22, r24, r26, r27, r28, r30, r32, r34, r36, r37)
            goto L_0x11dd
        L_0x11d9:
            r0 = move-exception
            r1 = r0
            monitor-exit(r74)
            throw r1
        L_0x11dd:
            java.lang.String r1 = "write response finish"
            r3 = 4
            fn0.C87002g.m108022p(r3, r2, r1)
            return
        L_0x11e5:
            r0 = move-exception
            r15 = r13
            r9 = r32
            r8 = r47
            r11 = r48
            r4 = r53
            r5 = r54
            r12 = r56
            r3 = r61
            r10 = r64
            r16 = r0
            r1 = r14
            r14 = r37
            goto L_0x1223
        L_0x11fd:
            r0 = move-exception
            r15 = r13
            r9 = r32
            r14 = r37
            r8 = r47
            r11 = r48
            r4 = r53
            r5 = r54
            r12 = r56
            r3 = r61
            r10 = r64
            goto L_0x1221
        L_0x1212:
            r0 = move-exception
            r8 = r3
            r4 = r9
            r3 = r10
            r15 = r13
            r14 = r16
            r9 = r32
            r10 = r64
            r12 = r11
            r11 = r5
            r5 = r54
        L_0x1221:
            r16 = r0
        L_0x1223:
            r60 = r1
            r30 = r31
        L_0x1227:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r10)
            r1.append(r11)
            r1.append(r6)
            r1.append(r9)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r6 = 4
            fn0.C87002g.m108022p(r6, r2, r1)
            r15.close()     // Catch:{ IOException -> 0x124b }
            r1 = 5
            goto L_0x124f
        L_0x124b:
            r1 = 5
            fn0.C87002g.m108022p(r1, r2, r14)
        L_0x124f:
            if (r60 != 0) goto L_0x125a
            r71.close()     // Catch:{ IOException -> 0x1255 }
            goto L_0x125a
        L_0x1255:
            r0 = move-exception
            r6 = r0
            fn0.C87002g.m108023q(r1, r2, r5, r6)
        L_0x125a:
            if (r30 == 0) goto L_0x12ae
            boolean r1 = r30.mo119978p()
            if (r1 == 0) goto L_0x12ae
            boolean r1 = r30.mo119967g()
            if (r1 == 0) goto L_0x12ae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = r30.toString()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r4 = 4
            fn0.C87002g.m108022p(r4, r2, r1)
            java.lang.String r1 = r30.mo119971i()
            an0.a r4 = an0.C79592a.m96648a()
            java.lang.String r4 = r4.mo109708d()
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto L_0x12ae
            boolean r1 = r30.mo119966f()
            if (r1 != 0) goto L_0x12ae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = r30.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = 5
            fn0.C87002g.m108022p(r3, r2, r1)
        L_0x12ae:
            throw r16
        */
        throw new UnsupportedOperationException("Method not decompiled: dn0.C86370o.mo120768e(java.net.Socket, java.lang.String, java.io.OutputStream, dn0.p, java.io.InputStream):void");
    }
}
