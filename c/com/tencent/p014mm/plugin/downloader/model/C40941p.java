package com.tencent.p014mm.plugin.downloader.model;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import ke3.C88144b;
import p156gj.C107835h0;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.model.p */
public final class C40941p extends C40945r {

    /* renamed from: b */
    public DownloadManager f110202b;

    /* renamed from: c */
    public Context f110203c;

    /* renamed from: d */
    public CopyOnWriteArraySet<Long> f110204d;

    /* renamed from: e */
    public MTimerHandler f110205e = new MTimerHandler(new C40943b(), false);

    /* renamed from: com.tencent.mm.plugin.downloader.model.p$a */
    public class C40942a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C40939n f110206d;

        /* renamed from: e */
        public final /* synthetic */ C53736a f110207e;

        public C40942a(C40939n nVar, C53736a aVar) {
            this.f110206d = nVar;
            this.f110207e = aVar;
        }

        public void run() {
            this.f110206d.getClass();
            long g = C40941p.this.mo63977g(this.f110207e);
            if (g > 0) {
                C53736a aVar = this.f110207e;
                aVar.field_sysDownloadId = g;
                aVar.field_status = 1;
                C40933j.m44322k(aVar);
                C40923i iVar = C40941p.this.f110211a;
                C53736a aVar2 = this.f110207e;
                iVar.mo63946i(aVar2.field_downloadId, aVar2.field_filePath);
                if (C40935l.m44326g().mo63963k(this.f110207e.field_downloadId)) {
                    C40935l g2 = C40935l.m44326g();
                    long j = this.f110207e.field_downloadId;
                    g2.getClass();
                    ((HashMap) C40935l.f110155h).put(Long.valueOf(j), Long.valueOf(g));
                    SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("off_line_download_ids", 0).edit();
                    edit.putLong(j + "", g).commit();
                }
                C40941p.this.f110204d.add(Long.valueOf(this.f110207e.field_downloadId));
                if (C40941p.this.f110205e.stopped()) {
                    C40941p.this.f110205e.startTimer(100);
                }
                C53736a aVar3 = this.f110207e;
                Log.m105925i("MicroMsg.FileDownloaderImpl23", "addDownloadTask: id: %d, url: %s, path: %s", Long.valueOf(this.f110207e.field_downloadId), aVar3.field_downloadUrl, aVar3.field_filePath);
                return;
            }
            C53736a aVar4 = this.f110207e;
            aVar4.field_status = 4;
            C40933j.m44322k(aVar4);
            C40941p.this.f110211a.mo63940c(this.f110207e.field_downloadId, 901, false);
            Log.m105920e("MicroMsg.FileDownloaderImpl23", "addDownloadTask Failed: Invalid downloadId");
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.p$b */
    public class C40943b implements MTimerHandler.CallBack {
        public C40943b() {
        }

        public boolean onTimerExpired() {
            C40941p pVar = C40941p.this;
            pVar.getClass();
            C86709a0.m107525e().postToWorker(new C40944q(pVar));
            CopyOnWriteArraySet<Long> copyOnWriteArraySet = C40941p.this.f110204d;
            if (!(copyOnWriteArraySet == null || copyOnWriteArraySet.size() == 0)) {
                C40941p.this.f110205e.startTimer(1000);
                return false;
            }
            Log.m105918d("MicroMsg.FileDownloaderImpl23", "timer stop");
            return false;
        }
    }

    public C40941p(C40923i iVar) {
        super(iVar);
        Context context = MMApplicationContext.getContext();
        this.f110203c = context;
        this.f110202b = (DownloadManager) context.getSystemService("download");
        this.f110204d = new CopyOnWriteArraySet<>();
    }

    /* renamed from: f */
    public static void m44351f(C40941p pVar, Long l) {
        C40941p pVar2 = pVar;
        Long l2 = l;
        pVar.getClass();
        Log.m105918d("MicroMsg.FileDownloaderImpl23", "updateDownloadStatus");
        C53736a c = C40933j.m44314c(l.longValue());
        if (c != null) {
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(new long[]{c.field_sysDownloadId});
            try {
                Cursor query2 = pVar2.f110202b.query(query);
                if (query2 == null) {
                    Log.m105920e("MicroMsg.FileDownloaderImpl23", "query download status failed: cursor is null");
                    pVar2.f110204d.remove(l2);
                    c.field_status = 4;
                    C40933j.m44322k(c);
                    return;
                }
                if (query2.moveToFirst()) {
                    int columnIndex = query2.getColumnIndex("status");
                    int columnIndex2 = query2.getColumnIndex("local_uri");
                    int columnIndex3 = query2.getColumnIndex("bytes_so_far");
                    int columnIndex4 = query2.getColumnIndex("total_size");
                    if (columnIndex != -1) {
                        try {
                            int i = query2.getInt(columnIndex);
                            Log.m105919d("MicroMsg.FileDownloaderImpl23", "status = %d", Integer.valueOf(i));
                            if (i == 1 || i == 2) {
                                if (columnIndex3 != -1) {
                                    c.field_downloadedSize = query2.getLong(columnIndex3);
                                }
                                if (columnIndex4 != -1) {
                                    c.field_totalSize = query2.getLong(columnIndex4);
                                }
                                c.field_status = 1;
                                C40933j.m44322k(c);
                                pVar2.f110211a.mo63943f(l.longValue(), "", 0, 0);
                            } else if (i == 4) {
                                pVar2.f110204d.remove(l2);
                                c.field_status = 2;
                                C40933j.m44322k(c);
                                pVar2.f110211a.mo63942e(l.longValue());
                            } else if (i == 8) {
                                pVar2.f110204d.remove(l2);
                                if (columnIndex2 != -1) {
                                    if (!Util.isNullOrNil(c.field_filePath)) {
                                        if (C86013q1.m106450k(c.field_filePath)) {
                                            Intent intent = new Intent();
                                            intent.setClass(MMApplicationContext.getContext(), FileDownloadService.class);
                                            intent.putExtra(FileDownloadService.f110080j, c.field_downloadId);
                                            intent.putExtra(FileDownloadService.f110081n, 1);
                                            C88144b.m109807y(intent);
                                        }
                                    }
                                    Log.m105921e("MicroMsg.FileDownloaderImpl23", "path not exists, path = %s", c.field_filePath);
                                    c.field_status = 4;
                                    C40933j.m44322k(c);
                                    return;
                                }
                            } else if (i == 16) {
                                pVar2.f110204d.remove(l2);
                                c.field_status = 4;
                                C40933j.m44322k(c);
                                pVar2.f110211a.mo63940c(l.longValue(), 901, false);
                            }
                        } catch (Exception e) {
                            pVar2.f110204d.remove(l2);
                            c.field_status = 4;
                            C40933j.m44322k(c);
                            Log.m105921e("MicroMsg.FileDownloaderImpl23", "query download info failed: [%s]", e.toString());
                        }
                    }
                }
                query2.close();
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.FileDownloaderImpl23", "query downloadinfo from downloadmanager failed:%s, sysDownloadId:%d", e2.toString(), l2);
                pVar2.f110204d.remove(l2);
                c.field_status = 4;
                C40933j.m44322k(c);
            }
        }
    }

    /* renamed from: a */
    public boolean mo62091a(long j) {
        C53736a c = C40933j.m44314c(j);
        if (c == null) {
            Log.m105925i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, record not found", Long.valueOf(j));
            return false;
        } else if (c.field_downloaderType != 1) {
            Log.m105925i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, downloader not matched", Long.valueOf(j));
            C86013q1.m106447h(c.field_filePath);
            Log.m105925i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask, delete file: %s", c.field_filePath);
            C40933j.m44319h(j);
            return false;
        } else if (c.field_status == 1) {
            Log.m105925i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, not in paused status", Long.valueOf(j));
            return false;
        } else {
            this.f110202b.remove(new long[]{c.field_sysDownloadId});
            long g = mo63977g(c);
            if (g > 0) {
                this.f110204d.add(Long.valueOf(c.field_downloadId));
                if (this.f110205e.stopped()) {
                    this.f110205e.startTimer(100);
                }
                c.field_sysDownloadId = g;
                c.field_status = 1;
                C40933j.m44322k(c);
                return true;
            }
            Log.m105924i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, restart failed");
            return false;
        }
    }

    /* renamed from: b */
    public long mo62092b(C40939n nVar) {
        String str;
        if (nVar == null || Util.isNullOrNil(nVar.f110176a)) {
            Log.m105920e("MicroMsg.FileDownloaderImpl23", "Invalid Request");
            return -1;
        } else if (nVar.f110186k) {
            Log.m105921e("MicroMsg.FileDownloaderImpl23", "autoDownloadTask not use system downloader, appid = %s", nVar.f110182g);
            return -1;
        } else {
            String str2 = nVar.f110176a;
            C53736a e = C40933j.m44316e(str2);
            if (e != null) {
                FileDownloadTaskInfo h = mo63978h(e.field_sysDownloadId);
                if (h.f12196f == 1) {
                    return h.f12194d;
                }
                str = e.field_filePath;
                this.f110202b.remove(new long[]{e.field_sysDownloadId});
            } else {
                str = "";
            }
            String absolutePath = (Util.isNullOrNil(C107835h0.f322856m.f322879S) ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : new File(C107835h0.f322856m.f322879S)).getAbsolutePath();
            if (!Util.isNullOrNil(absolutePath)) {
                Uri n = C116299g2.m163858n(absolutePath);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0 f0Var = C116281f0.C116289i.f348994a;
                C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                    Log.m105925i("MicroMsg.FileDownloaderImpl23", "download folder not exist, make new one : [%b]", Boolean.valueOf(!l2.mo177810a() ? false : l2.f348991a.mo119937g(l2.f348992b)));
                }
            }
            if (!Util.isNullOrNil(str)) {
                C86009m1 m1Var = new C86009m1(str);
                if (m1Var.mo119967g()) {
                    Log.m105925i("MicroMsg.FileDownloaderImplBase", "Delete previous file result: %b", Boolean.valueOf(m1Var.mo119966f()));
                }
            }
            C40933j.m44321j(str2);
            C40933j.m44320i(nVar.f110182g);
            C53736a b = C40940o.m44349b(nVar);
            b.field_downloadId = System.currentTimeMillis();
            b.field_status = 0;
            b.field_downloaderType = 1;
            String mD5String = MD5Util.getMD5String(str2);
            StringBuilder sb = new StringBuilder();
            sb.append((Util.isNullOrNil(C107835h0.f322856m.f322879S) ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : new File(C107835h0.f322856m.f322879S)).getAbsolutePath());
            sb.append("/");
            sb.append(mD5String);
            b.field_filePath = sb.toString();
            b.field_startTime = System.currentTimeMillis();
            C40933j.m44312a(b);
            C86709a0.m107525e().postToWorker(new C40942a(nVar, b));
            return b.field_downloadId;
        }
    }

    /* renamed from: c */
    public boolean mo62093c(long j) {
        FileDownloadTaskInfo e = mo62095e(j);
        this.f110204d.remove(Long.valueOf(j));
        if (e.f12196f != 1) {
            Log.m105925i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task is not running", Long.valueOf(j));
            return true;
        }
        int removeDownloadTask = removeDownloadTask(j);
        Log.m105925i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task removed: %d", Long.valueOf(j), Integer.valueOf(removeDownloadTask));
        return removeDownloadTask > 0;
    }

    /* renamed from: d */
    public long mo62094d(C53736a aVar) {
        return aVar.field_downloadId;
    }

    /* renamed from: e */
    public FileDownloadTaskInfo mo62095e(long j) {
        if (C40935l.m44326g().mo63963k(j)) {
            C40935l.m44326g().getClass();
            Long l = (Long) ((HashMap) C40935l.f110155h).get(Long.valueOf(j));
            FileDownloadTaskInfo h = mo63978h(l == null ? -1 : l.longValue());
            h.f12194d = j;
            h.f12203p = 1;
            return h;
        }
        C53736a c = C40933j.m44314c(j);
        if (c == null) {
            return new FileDownloadTaskInfo();
        }
        int i = c.field_status;
        if (i == 4 || i == 2 || i == 5 || i == 3) {
            this.f110204d.remove(Long.valueOf(j));
        }
        FileDownloadTaskInfo fileDownloadTaskInfo = new FileDownloadTaskInfo();
        fileDownloadTaskInfo.f12194d = c.field_downloadId;
        fileDownloadTaskInfo.f12195e = c.field_downloadUrl;
        fileDownloadTaskInfo.f12196f = c.field_status;
        fileDownloadTaskInfo.f12197g = c.field_filePath;
        fileDownloadTaskInfo.f12198h = c.field_md5;
        fileDownloadTaskInfo.f12202o = c.field_autoDownload;
        fileDownloadTaskInfo.f12203p = c.field_downloaderType;
        fileDownloadTaskInfo.f12200j = c.field_downloadedSize;
        fileDownloadTaskInfo.f12201n = c.field_totalSize;
        return fileDownloadTaskInfo;
    }

    /* renamed from: g */
    public final long mo63977g(C53736a aVar) {
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(aVar.field_downloadUrl));
            request.setAllowedNetworkTypes(3);
            request.setShowRunningNotification(aVar.field_showNotification);
            request.setVisibleInDownloadsUi(aVar.field_showNotification);
            if (!Util.isNullOrNil(aVar.field_fileName)) {
                request.setTitle(aVar.field_fileName);
            }
            request.setDestinationUri(FileProviderHelper.getUriForFile(this.f110203c, new C86009m1(C86013q1.m106448i(aVar.field_filePath, true))));
            long enqueue = this.f110202b.enqueue(request);
            if (enqueue > 0) {
                return enqueue;
            }
            Log.m105920e("MicroMsg.FileDownloaderImpl23", "addToSysDownloadManager Failed: Invalid downloadId");
            return -1;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FileDownloaderImpl23", "Add download task failed: %s, url: %s", e.toString(), aVar.field_downloadUrl);
            return -1;
        }
    }

    /* renamed from: h */
    public final FileDownloadTaskInfo mo63978h(long j) {
        FileDownloadTaskInfo fileDownloadTaskInfo = new FileDownloadTaskInfo();
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(new long[]{j});
        try {
            Cursor query2 = this.f110202b.query(query);
            if (query2 == null) {
                Log.m105920e("MicroMsg.FileDownloaderImpl23", "query download status failed: cursor is null");
                return fileDownloadTaskInfo;
            }
            if (query2.moveToFirst()) {
                int columnIndex = query2.getColumnIndex("status");
                int columnIndex2 = query2.getColumnIndex("uri");
                int columnIndex3 = query2.getColumnIndex("local_uri");
                int columnIndex4 = query2.getColumnIndex("bytes_so_far");
                int columnIndex5 = query2.getColumnIndex("total_size");
                if (columnIndex != -1) {
                    try {
                        int i = query2.getInt(columnIndex);
                        if (i == 1 || i == 2) {
                            fileDownloadTaskInfo.f12196f = 1;
                        } else if (i == 4) {
                            fileDownloadTaskInfo.f12196f = 2;
                        } else if (i == 8) {
                            fileDownloadTaskInfo.f12196f = 3;
                        } else if (i == 16) {
                            fileDownloadTaskInfo.f12196f = 4;
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.FileDownloaderImpl23", "query download info failed: [%s]", e.toString());
                        fileDownloadTaskInfo.f12196f = 4;
                    }
                }
                if (columnIndex2 != -1) {
                    fileDownloadTaskInfo.f12195e = query2.getString(columnIndex2);
                }
                if (columnIndex3 != -1) {
                    String string = query2.getString(columnIndex3);
                    if (!Util.isNullOrNil(string)) {
                        Log.m105925i("MicroMsg.FileDownloaderImpl23", "get download uri: [%s]", string);
                        String path = Uri.parse(string).getPath();
                        fileDownloadTaskInfo.f12197g = path;
                        Log.m105925i("MicroMsg.FileDownloaderImpl23", "get download path: [%s]", path);
                    } else {
                        Log.m105920e("MicroMsg.FileDownloaderImpl23", "get download uri failed");
                    }
                }
                if (columnIndex4 != -1) {
                    fileDownloadTaskInfo.f12200j = query2.getLong(columnIndex4);
                }
                if (columnIndex5 != -1) {
                    fileDownloadTaskInfo.f12201n = query2.getLong(columnIndex5);
                }
            }
            query2.close();
            Log.m105925i("MicroMsg.FileDownloaderImpl23", "querySysDownloadManager: id: %d, status: %d, url: %s, path: %s", Long.valueOf(j), Integer.valueOf(fileDownloadTaskInfo.f12196f), fileDownloadTaskInfo.f12195e, fileDownloadTaskInfo.f12197g);
            return fileDownloadTaskInfo;
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.FileDownloaderImpl23", "query downloadinfo from downloadmanager failed:%s, sysDownloadId:%d", e2.toString(), Long.valueOf(j));
            return fileDownloadTaskInfo;
        }
    }

    public int removeDownloadTask(long j) {
        int i;
        Exception e;
        if (C40935l.m44326g().mo63963k(j)) {
            C40935l.m44326g().getClass();
            Long l = (Long) ((HashMap) C40935l.f110155h).get(Long.valueOf(j));
            return this.f110202b.remove(new long[]{l == null ? -1 : l.longValue()});
        }
        C53736a c = C40933j.m44314c(j);
        if (c == null) {
            Log.m105920e("MicroMsg.FileDownloaderImpl23", "Invalid id");
            return 0;
        }
        try {
            i = this.f110202b.remove(new long[]{c.field_sysDownloadId});
            try {
                Log.m105925i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: id: %d", Long.valueOf(j));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            i = 0;
            Log.m105921e("MicroMsg.FileDownloaderImpl23", "remove task error:[%d], [%s]", Long.valueOf(j), e.toString());
            C86013q1.m106447h(c.field_filePath);
            Log.m105925i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: path: %s", c.field_filePath);
            c.field_status = 5;
            C40933j.m44322k(c);
            this.f110211a.mo63944g(j);
            this.f110204d.remove(Long.valueOf(j));
            return i;
        }
        C86013q1.m106447h(c.field_filePath);
        Log.m105925i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: path: %s", c.field_filePath);
        c.field_status = 5;
        C40933j.m44322k(c);
        this.f110211a.mo63944g(j);
        this.f110204d.remove(Long.valueOf(j));
        return i;
    }
}
