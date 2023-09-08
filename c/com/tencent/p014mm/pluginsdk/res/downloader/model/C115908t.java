package com.tencent.p014mm.pluginsdk.res.downloader.model;

import android.database.Cursor;
import android.os.Looper;
import android.os.Process;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115883d;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115889i;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p1042u.C111055b;
import rd3.C48020a;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.t */
public final class C115908t {

    /* renamed from: a */
    public final C115914w f347784a;

    /* renamed from: b */
    public final C85640q f347785b;

    /* renamed from: c */
    public final C115905m f347786c;

    /* renamed from: d */
    public final MMHandler f347787d;

    /* renamed from: e */
    public final boolean f347788e;

    /* renamed from: f */
    public volatile MMHandler f347789f = null;

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.t$b */
    public static final class C115910b {

        /* renamed from: a */
        public static final C115908t f347790a = new C115908t((C115909a) null);
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.t$c */
    public static class C115911c implements Runnable {

        /* renamed from: d */
        public final Runnable f347791d;

        public C115911c(Runnable runnable, C115909a aVar) {
            this.f347791d = runnable;
        }

        public void run() {
            if (!(Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) && Process.getThreadPriority(Process.myTid()) != 10) {
                Process.setThreadPriority(10);
            }
            Runnable runnable = this.f347791d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C115908t(com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t.C115909a r14) {
        /*
            r13 = this;
            r13.<init>()
            r14 = 0
            r13.f347789f = r14
            java.util.HashMap<java.lang.Integer, com.tencent.mm.pluginsdk.res.downloader.model.h> r0 = com.tencent.p014mm.pluginsdk.res.downloader.model.C115912u.f347792a
            java.lang.String[] r0 = com.tencent.p014mm.pluginsdk.res.downloader.model.C115914w.f347795e
            java.lang.String r0 = "MicroMsg.ResDownloaderStorage"
            r1 = 0
            r2 = 1
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = com.tencent.p014mm.pluginsdk.res.downloader.model.C115914w.f347796f     // Catch:{ Exception -> 0x005d }
            r3.<init>(r4)     // Catch:{ Exception -> 0x005d }
            r3.mkdirs()     // Catch:{ Exception -> 0x005d }
            zh3.f r3 = new zh3.f     // Catch:{ Exception -> 0x005d }
            r3.<init>()     // Catch:{ Exception -> 0x005d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005d }
            r5.<init>()     // Catch:{ Exception -> 0x005d }
            r5.append(r4)     // Catch:{ Exception -> 0x005d }
            java.lang.String r6 = "ResDown.db"
            r5.append(r6)     // Catch:{ Exception -> 0x005d }
            java.lang.String r6 = r5.toString()     // Catch:{ Exception -> 0x005d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005d }
            r5.<init>()     // Catch:{ Exception -> 0x005d }
            r5.append(r4)     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = "EnResDown.db"
            r5.append(r4)     // Catch:{ Exception -> 0x005d }
            java.lang.String r7 = r5.toString()     // Catch:{ Exception -> 0x005d }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            java.lang.String r10 = p156gj.C87203t.m108270f(r2)     // Catch:{ Exception -> 0x005d }
            java.util.HashMap<java.lang.Integer, zh3.f$b> r11 = com.tencent.p014mm.pluginsdk.res.downloader.model.C115914w.f347797g     // Catch:{ Exception -> 0x005d }
            r12 = 1
            r5 = r3
            boolean r4 = r5.mo125623m(r6, r7, r8, r10, r11, r12)     // Catch:{ Exception -> 0x005d }
            if (r4 != 0) goto L_0x0057
            java.lang.String r3 = "res downloader db init failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r0, r3)     // Catch:{ Exception -> 0x005d }
            goto L_0x0067
        L_0x0057:
            com.tencent.mm.pluginsdk.res.downloader.model.w r4 = new com.tencent.mm.pluginsdk.res.downloader.model.w     // Catch:{ Exception -> 0x005d }
            r4.<init>(r3)     // Catch:{ Exception -> 0x005d }
            goto L_0x0068
        L_0x005d:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            java.lang.String r3 = "new storage failed, exception = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r4)
        L_0x0067:
            r4 = r14
        L_0x0068:
            r13.f347784a = r4
            if (r4 != 0) goto L_0x0075
            r13.f347788e = r1
            r13.f347785b = r14
            r13.f347787d = r14
            r13.f347786c = r14
            goto L_0x0092
        L_0x0075:
            r13.f347788e = r2
            com.tencent.mm.sdk.platformtools.MMHandler r14 = new com.tencent.mm.sdk.platformtools.MMHandler
            java.lang.String r0 = "ResDownloader-EventThread"
            r14.<init>((java.lang.String) r0)
            r13.f347787d = r14
            com.tencent.mm.pluginsdk.res.downloader.model.m r14 = new com.tencent.mm.pluginsdk.res.downloader.model.m
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r13.mo176450b()
            r14.<init>(r1)
            r13.f347786c = r14
            com.tencent.mm.pluginsdk.res.downloader.model.q r1 = new com.tencent.mm.pluginsdk.res.downloader.model.q
            r1.<init>(r0, r14)
            r13.f347785b = r1
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t.<init>(com.tencent.mm.pluginsdk.res.downloader.model.t$a):void");
    }

    /* renamed from: a */
    public int mo176449a(C85638o oVar) {
        if (!this.f347788e) {
            return -1;
        }
        if (Util.isNullOrNil(oVar.f249586f)) {
            Log.m105925i("MicroMsg.ResDownloaderCore", "request#%s with null url, ignore", oVar.f249581a);
            return 3;
        }
        Log.m105925i("MicroMsg.ResDownloaderCore", "request#%s post to network worker", oVar.f249581a);
        return this.f347785b.mo113634h(oVar);
    }

    /* renamed from: b */
    public MMHandler mo176450b() {
        if (this.f347789f == null) {
            this.f347789f = new MMHandler("ResDownloader-WorkerThread");
            this.f347789f.setLogging(false);
        }
        return this.f347789f;
    }

    /* renamed from: c */
    public boolean mo176451c(String str) {
        return this.f347788e && (((ConcurrentHashMap) this.f347785b.f249574b).containsKey(str) || this.f347785b.mo119166e(str));
    }

    /* renamed from: d */
    public void mo176452d(Runnable runnable) {
        if (runnable != null) {
            mo176450b().postToWorker(new C115911c(runnable, (C115909a) null));
        }
    }

    /* renamed from: e */
    public C115913v mo176453e(String str) {
        if (!this.f347788e) {
            return null;
        }
        long nowMilliSecond = Util.nowMilliSecond();
        C115913v Lo = this.f347784a.mo176458Lo(str);
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = str;
        if (Lo != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = Long.valueOf(Util.milliSecondsToNow(nowMilliSecond));
        Log.m105925i("MicroMsg.ResDownloaderCore", "doQuery: urlKey = %s, ret = %b, cost = %d", objArr);
        return Lo;
    }

    /* renamed from: f */
    public void mo176454f(int i) {
        Set<CheckResUpdateHelper.C115876g> newSetFromMap;
        int i2 = i;
        Log.m105925i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, networkType = %d", Integer.valueOf(i));
        if (i2 == 0) {
            Log.m105924i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, networkType is unavailable");
            return;
        }
        boolean z = this.f347788e;
        if (!z) {
            Log.m105920e("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, core can not work");
            return;
        }
        LinkedList<C115913v> linkedList = null;
        if (z) {
            long nowMilliSecond = Util.nowMilliSecond();
            Cursor all = this.f347784a.getAll();
            if (all != null) {
                if (all.getCount() <= 0) {
                    all.close();
                } else {
                    LinkedList linkedList2 = new LinkedList();
                    all.moveToFirst();
                    do {
                        C115913v vVar = new C115913v();
                        vVar.convertFrom(all);
                        linkedList2.add(vVar);
                    } while (all.moveToNext());
                    all.close();
                    linkedList = linkedList2;
                }
            }
            Log.m105925i("MicroMsg.ResDownloaderCore", "queryAll: cost = %d", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)));
        }
        if (Util.isNullOrNil((List) linkedList)) {
            Log.m105924i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, no record stored, skip this resumeAll-op");
            return;
        }
        for (C115913v vVar2 : linkedList) {
            if (!Util.isNullOrNil(vVar2.field_groupId1)) {
                int hashCode = vVar2.field_groupId1.hashCode();
                for (C115900h next : C115912u.m163042a()) {
                    if (hashCode == Util.nullAsNil(next.getGroupId()).hashCode()) {
                        C115889i iVar = (C115889i) next.mo176410R5();
                        iVar.getClass();
                        long j = vVar2.field_expireTime;
                        if (j != 0 && j <= Util.nowSecond()) {
                            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "urlKey(%s) exceed expire time(%d), delete", vVar2.field_urlKey, Long.valueOf(vVar2.field_expireTime));
                            C115908t tVar = C115910b.f347790a;
                            String str = vVar2.field_urlKey;
                            if (tVar.f347788e) {
                                tVar.f347784a.mo176460c(str);
                            }
                            C48020a.m53384a(vVar2.field_filePath);
                            C48020a.m53384a(vVar2.field_filePath + ".decompressed");
                            C48020a.m53384a(vVar2.field_filePath + ".decrypted");
                            String str2 = vVar2.field_urlKey;
                            if (tVar.f347788e) {
                                tVar.f347785b.mo119164b(str2);
                            }
                        } else if (i2 == 0) {
                            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "network unavailable, skip");
                        } else if (2 == i2 && 1 == vVar2.field_networkType) {
                            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "network type = gprs, record network type = wifi, skip this ");
                        } else if (vVar2.field_deleted) {
                            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "record(%s), should have been deleted", vVar2.field_urlKey);
                            C48020a.m53384a(vVar2.field_filePath);
                            C48020a.m53384a(vVar2.field_filePath + ".decompressed");
                            C48020a.m53384a(vVar2.field_filePath + ".decrypted");
                        } else if (!vVar2.field_needRetry) {
                            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "no need retry, resType %d, subType %d, version %s", Integer.valueOf(vVar2.field_resType), Integer.valueOf(vVar2.field_subType), vVar2.field_fileVersion);
                        } else {
                            int i3 = vVar2.field_status;
                            if (i3 == 2) {
                                long c = C48020a.m53386c(vVar2.field_filePath);
                                if (vVar2.field_contentLength > c && !iVar.mo176437b(vVar2)) {
                                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "%d.%d content-length(%d) > fileSize(%d), resume download", Integer.valueOf(vVar2.field_resType), Integer.valueOf(vVar2.field_subType), Long.valueOf(vVar2.field_contentLength), Long.valueOf(c));
                                    if (0 == c) {
                                        if (!vVar2.field_needRetry) {
                                            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "no need retry, resType %d, subType %d, version %s", Integer.valueOf(vVar2.field_resType), Integer.valueOf(vVar2.field_subType), vVar2.field_fileVersion);
                                        } else if (1 != i2) {
                                            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "fileSize = 0, completed file may be deleted by user, skip this because it's not wifi");
                                        } else {
                                            CheckResUpdateHelper c2 = CheckResUpdateHelper.m162971c();
                                            synchronized (c2.f347645a) {
                                                newSetFromMap = Collections.newSetFromMap(new C111055b(c2.f347645a.size()));
                                                newSetFromMap.addAll(c2.f347645a);
                                            }
                                            for (CheckResUpdateHelper.C115876g gVar : newSetFromMap) {
                                                if (gVar.mo176421a(vVar2.field_resType, vVar2.field_subType, Util.getInt(vVar2.field_fileVersion, 0))) {
                                                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "filterNotRetry by %s, resType %d, subType %d, version %s", gVar.getClass().getName(), Integer.valueOf(vVar2.field_resType), Integer.valueOf(vVar2.field_subType), vVar2.field_fileVersion);
                                                    break;
                                                }
                                            }
                                            vVar2.field_fileUpdated = true;
                                            CheckResUpdateHelper.m162971c().mo176408i(vVar2.field_resType, vVar2.field_subType, 0, Util.nullAsNil(vVar2.field_groupId2).equals("NewXml"));
                                            C115910b.f347790a.mo176455g(vVar2, true);
                                        }
                                    }
                                    C115891k.m163014e(vVar2.field_resType, vVar2.field_subType, Util.getInt(vVar2.field_fileVersion, 0), (int) vVar2.field_reportId, 76);
                                    C115910b.f347790a.mo176449a(C115883d.m162993h(vVar2));
                                } else if (!iVar.mo176437b(vVar2)) {
                                    Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "file invalid, re-download");
                                    iVar.mo176436a(vVar2, 1 == i2);
                                } else {
                                    Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 check ok, file download complete, throw event to do decrypt");
                                    iVar.mo176438c(vVar2);
                                }
                            } else if (i3 == 1 || i3 == 0) {
                                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "db status: downloading or waiting, db content-length %d", Long.valueOf(vVar2.field_contentLength));
                                C115908t tVar2 = C115910b.f347790a;
                                if (!tVar2.mo176451c(vVar2.field_urlKey)) {
                                    Log.m105918d("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "check md5");
                                    if (iVar.mo176437b(vVar2)) {
                                        Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 match, request complete, throw event to do decrypt");
                                        vVar2.field_status = 2;
                                        vVar2.field_contentLength = C48020a.m53386c(vVar2.field_filePath);
                                        tVar2.mo176455g(vVar2, true);
                                        iVar.mo176438c(vVar2);
                                    } else {
                                        if (0 == C48020a.m53386c(vVar2.field_filePath)) {
                                            vVar2.field_fileUpdated = true;
                                            tVar2.mo176455g(vVar2, true);
                                            CheckResUpdateHelper.m162971c().mo176408i(vVar2.field_resType, vVar2.field_subType, 0, Util.nullAsNil(vVar2.field_groupId2).equals("NewXml"));
                                        }
                                        Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 not match,  download");
                                        C115891k.m163014e(vVar2.field_resType, vVar2.field_subType, Util.getInt(vVar2.field_fileVersion, 0), (int) vVar2.field_reportId, 76);
                                        tVar2.mo176449a(C115883d.m162993h(vVar2));
                                    }
                                } else {
                                    Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "request already in downloading queue");
                                }
                            } else if (i3 == 4 || i3 == 3) {
                                Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "file invalid, re-download");
                                vVar2.field_status = 0;
                                iVar.mo176436a(vVar2, true);
                            }
                        }
                    }
                }
                continue;
            }
        }
    }

    /* renamed from: g */
    public void mo176455g(C115913v vVar, boolean z) {
        boolean z2;
        if (this.f347788e) {
            long nowMilliSecond = Util.nowMilliSecond();
            if (this.f347784a.mo176458Lo(vVar.field_urlKey) != null) {
                this.f347784a.mo176459Yt(vVar);
                z2 = false;
            } else {
                this.f347784a.insert(vVar);
                z2 = true;
            }
            Log.m105925i("MicroMsg.ResDownloaderCore", "doUpdate: urlKey = %s, opIsInsert(%b) cost = %d", vVar.field_urlKey, Boolean.valueOf(z2), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)));
        }
    }
}
