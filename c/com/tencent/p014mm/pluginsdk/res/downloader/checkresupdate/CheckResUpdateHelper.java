package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdatePreOperationEvent;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.autogen.events.PriorityTickPostSyncTaskEvent;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115885g;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115899e;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115900h;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115901i;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115905m;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115914w;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85638o;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85640q;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import p1042u.C111055b;
import pe3.C89349b;
import rd3.C48020a;
import te3.C118473ut3;
import te3.C52019xt3;
import te3.C90448yt3;
import te3.f54;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper */
public final class CheckResUpdateHelper {

    /* renamed from: a */
    public final Set<C115876g> f347645a = Collections.newSetFromMap(new C111055b(C115890j.f347725e.length));

    /* renamed from: b */
    public final C85626l f347646b = new C85626l();

    /* renamed from: c */
    public final C115899e f347647c;

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$a */
    public class C30690a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f82582d;

        /* renamed from: e */
        public final /* synthetic */ int f82583e;

        /* renamed from: f */
        public final /* synthetic */ int f82584f;

        /* renamed from: g */
        public final /* synthetic */ boolean f82585g;

        public C30690a(CheckResUpdateHelper checkResUpdateHelper, int i, int i2, int i3, boolean z) {
            this.f82582d = i;
            this.f82583e = i2;
            this.f82584f = i3;
            this.f82585g = z;
        }

        public void run() {
            CheckResUpdatePreOperationEvent checkResUpdatePreOperationEvent = new CheckResUpdatePreOperationEvent();
            CheckResUpdatePreOperationEvent.C28721a aVar = checkResUpdatePreOperationEvent.f78750d;
            aVar.f78753c = this.f82582d;
            aVar.f78751a = this.f82583e;
            aVar.f78752b = this.f82584f;
            aVar.f78754d = this.f82585g;
            checkResUpdatePreOperationEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$CheckResUpdateResDownloaderPlugin */
    public static final class CheckResUpdateResDownloaderPlugin implements C115900h {

        /* renamed from: a */
        public final IListener f347648a;

        /* renamed from: b */
        public final IListener f347649b;

        /* renamed from: c */
        public final C115889i f347650c = new C115889i();

        /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$CheckResUpdateResDownloaderPlugin$a */
        public class C115870a implements Runnable {
            public C115870a(CheckResUpdateResDownloaderPlugin checkResUpdateResDownloaderPlugin) {
            }

            public void run() {
                C72716r.m85117a(1);
            }
        }

        public CheckResUpdateResDownloaderPlugin() {
            C40008f fVar = C40008f.f107254d;
            this.f347648a = new IListener<PostSyncTaskEvent>(this, fVar) {
                {
                    this.__eventId = -790196534;
                }

                public boolean callback(IEvent iEvent) {
                    PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
                    C72716r.m85118b();
                    return false;
                }
            };
            this.f347649b = new IListener<PriorityTickPostSyncTaskEvent>(this, fVar) {
                {
                    this.__eventId = 1590499177;
                }

                public boolean callback(IEvent iEvent) {
                    PriorityTickPostSyncTaskEvent priorityTickPostSyncTaskEvent = (PriorityTickPostSyncTaskEvent) iEvent;
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_check_res_update_tick_enable, 0) == 1) {
                        C72716r.m85118b();
                    }
                    return false;
                }
            };
        }

        /* renamed from: Q5 */
        public C85640q.C85641a mo176409Q5(C85638o oVar) {
            if (!(oVar instanceof C115883d)) {
                Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateHelper", "get mismatch NetworkRequest type, return null");
                return null;
            }
            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateHelper", "return CheckResUpdateNetworkRequestHandler");
            return new C85625e((C115883d) oVar);
        }

        /* renamed from: R5 */
        public C115901i mo176410R5() {
            return this.f347650c;
        }

        /* renamed from: S5 */
        public C115914w.C115916b mo176411S5() {
            return null;
        }

        /* renamed from: T5 */
        public void mo176412T5() {
            this.f347648a.alive();
            this.f347649b.alive();
            C86709a0.m107525e().postToWorkerDelayed(new C115870a(this), 10000);
        }

        public String getGroupId() {
            return "CheckResUpdate";
        }

        /* renamed from: l */
        public void mo176414l() {
            this.f347648a.dead();
            this.f347649b.dead();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$b */
    public class C115871b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f347651d;

        /* renamed from: e */
        public final /* synthetic */ int f347652e;

        /* renamed from: f */
        public final /* synthetic */ int f347653f;

        /* renamed from: g */
        public final /* synthetic */ boolean f347654g;

        public C115871b(CheckResUpdateHelper checkResUpdateHelper, int i, int i2, int i3, boolean z) {
            this.f347651d = i;
            this.f347652e = i2;
            this.f347653f = i3;
            this.f347654g = z;
        }

        public void run() {
            C115908t tVar = C115908t.C115910b.f347790a;
            C115913v e = tVar.mo176453e(C115890j.m163009c(this.f347651d, this.f347652e));
            if (e != null) {
                int i = this.f347653f;
                if (-1 == i || String.valueOf(i).equals(e.field_fileVersion)) {
                    e.field_needRetry = !this.f347654g;
                    tVar.mo176455g(e, true);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$c */
    public class C115872c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f347655d;

        /* renamed from: e */
        public final /* synthetic */ int f347656e;

        /* renamed from: f */
        public final /* synthetic */ int f347657f;

        /* renamed from: g */
        public final /* synthetic */ int f347658g;

        /* renamed from: h */
        public final /* synthetic */ int f347659h;

        /* renamed from: i */
        public final /* synthetic */ String f347660i;

        /* renamed from: j */
        public final /* synthetic */ boolean f347661j;

        public C115872c(CheckResUpdateHelper checkResUpdateHelper, String str, int i, int i2, int i3, int i4, String str2, boolean z) {
            this.f347655d = str;
            this.f347656e = i;
            this.f347657f = i2;
            this.f347658g = i3;
            this.f347659h = i4;
            this.f347660i = str2;
            this.f347661j = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r24 = this;
                r0 = r24
                com.tencent.mm.pluginsdk.res.downloader.model.t r1 = com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t.C115910b.f347790a
                java.lang.String r2 = r0.f347655d
                com.tencent.mm.pluginsdk.res.downloader.model.v r2 = r1.mo176453e(r2)
                int r3 = r0.f347656e
                int r4 = r0.f347657f
                int r15 = r0.f347658g
                int r14 = r0.f347659h
                java.lang.String r13 = r0.f347660i
                boolean r5 = r0.f347661j
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "record "
                r6.append(r7)
                r6.append(r2)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "MicroMsg.ResDownloader.CheckResUpdate.DoDeleteLogic"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
                r12 = 1
                java.lang.Object[] r6 = new java.lang.Object[r12]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
                r9 = 0
                r6[r9] = r8
                java.lang.String r8 = "delete version %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
                r10 = 47
                r16 = r13
                if (r2 == 0) goto L_0x005b
                java.lang.String r6 = r2.field_fileVersion
                int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r9)
                if (r6 > r15) goto L_0x004c
                r8 = r7
                goto L_0x0067
            L_0x004c:
                long r12 = r2.field_reportId
                com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r12, r10)
                long r12 = r2.field_reportId
                r9 = 22
                com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r12, r9)
                r8 = r7
                r6 = 0
                goto L_0x0068
            L_0x005b:
                r9 = 22
                long r11 = (long) r14
                r8 = r7
                r6 = 47
                com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r11, r6)
                com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r11, r9)
            L_0x0067:
                r6 = 1
            L_0x0068:
                java.lang.String r12 = com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115890j.m163009c(r3, r4)
                java.lang.String r7 = com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115890j.m163008b(r12)
                r9 = 2
                java.lang.Object[] r10 = new java.lang.Object[r9]
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
                r13 = 0
                r10[r13] = r11
                r11 = 1
                r10[r11] = r7
                java.lang.String r11 = "doDelete(%b), filePath(%s)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r10)
                if (r6 == 0) goto L_0x0151
                boolean r6 = r1.f347788e
                if (r6 == 0) goto L_0x008d
                com.tencent.mm.pluginsdk.res.downloader.model.q r6 = r1.f347785b
                r6.mo119164b(r12)
            L_0x008d:
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper r6 = com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper.m162971c()
                r6.mo176408i(r3, r4, r9, r5)
                boolean r6 = rd3.C48020a.m53384a(r7)
                r8 = 1
                r6 = r6 & r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r9 = ".decompressed"
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                boolean r8 = rd3.C48020a.m53384a(r8)
                r6 = r6 & r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r7 = ".decrypted"
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                boolean r7 = rd3.C48020a.m53384a(r7)
                r6 = r6 & r7
                if (r6 == 0) goto L_0x0108
                if (r2 == 0) goto L_0x00ff
                long r6 = r2.field_reportId
                r8 = 21
                com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r6, r8)
                int r6 = r2.field_resType
                int r7 = r2.field_subType
                java.lang.String r13 = r2.field_sampleId
                r17 = 1
                r10 = r5 ^ 1
                r11 = 1
                r18 = 1
                r19 = 1
                r20 = 1
                r9 = 4
                java.lang.String r8 = ""
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r15
                r21 = r12
                r12 = r18
                r22 = r16
                r16 = r13
                r13 = r19
                r23 = r14
                r14 = r20
                r17 = r15
                r15 = r16
                com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163011b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                goto L_0x0120
            L_0x00ff:
                r21 = r12
                r23 = r14
                r17 = r15
                r22 = r16
                goto L_0x0120
            L_0x0108:
                r21 = r12
                r23 = r14
                r17 = r15
                r22 = r16
                if (r2 == 0) goto L_0x0120
                long r5 = r2.field_reportId
                r7 = 22
                com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r5, r7)
                long r5 = r2.field_reportId
                r7 = 47
                com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r5, r7)
            L_0x0120:
                if (r2 != 0) goto L_0x0145
                com.tencent.mm.pluginsdk.res.downloader.model.v r2 = new com.tencent.mm.pluginsdk.res.downloader.model.v
                r2.<init>()
                r5 = r21
                r2.field_urlKey = r5
                r2.field_resType = r3
                r2.field_subType = r4
                r3 = 1
                r2.field_deleted = r3
                java.lang.String r4 = java.lang.String.valueOf(r17)
                r2.field_fileVersion = r4
                r4 = r23
                long r4 = (long) r4
                r2.field_reportId = r4
                r4 = r22
                r2.field_sampleId = r4
                r1.mo176455g(r2, r3)
                goto L_0x0151
            L_0x0145:
                r3 = 1
                r2.field_deleted = r3
                java.lang.String r4 = java.lang.String.valueOf(r17)
                r2.field_fileVersion = r4
                r1.mo176455g(r2, r3)
            L_0x0151:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper.C115872c.run():void");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$d */
    public class C115873d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f347662d;

        /* renamed from: e */
        public final /* synthetic */ C115888h f347663e;

        public C115873d(CheckResUpdateHelper checkResUpdateHelper, String str, C115888h hVar) {
            this.f347662d = str;
            this.f347663e = hVar;
        }

        public void run() {
            C115908t tVar = C115908t.C115910b.f347790a;
            C115913v e = tVar.mo176453e(this.f347662d);
            C115888h hVar = this.f347663e;
            if (e == null) {
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "queried record is null, urlKey = %s", hVar.f347761b);
            } else {
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "queried record: urlKey = %s, url = %s, contentLength = %d, deleted = %b, eccSignature = %s, expireTime = %d, fileCompress = %b, fileEncrypt = %b, filePath = %s, fileUpdated = %b, fileVersion = %s, from = %s, keyVersion = %s, (encryptKey == null) = %b, maxRetryTimes = %d, retriedTimes = %d, sampleId = %s, dlStatus = %d", e.field_urlKey, e.field_url, Long.valueOf(e.field_contentLength), Boolean.valueOf(e.field_deleted), e.field_eccSignature, Long.valueOf(e.field_expireTime), Boolean.valueOf(e.field_fileCompress), Boolean.valueOf(e.field_fileEncrypt), e.field_filePath, Boolean.valueOf(e.field_fileUpdated), e.field_fileVersion, e.field_groupId2, Integer.valueOf(e.field_keyVersion), Boolean.valueOf(Util.isNullOrNil(e.field_encryptKey)), Integer.valueOf(e.field_maxRetryTimes), Integer.valueOf(e.field_retryTimes), e.field_sampleId, Integer.valueOf(e.field_status));
                Log.m105919d("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "queried record.encryptKey = %s", e.field_encryptKey);
            }
            if (e != null && e.field_deleted) {
                if (Util.getInt(hVar.f347762c, 0) - Util.getInt(e.field_fileVersion, 0) <= 0) {
                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "deletedFile.version = %s, cacheReq.version = %s, this file should have been deleted, skip this cache-op", e.field_fileVersion, hVar.f347762c);
                    return;
                }
            }
            if (e == null) {
                C115913v a = hVar.mo176434a();
                a.field_fileUpdated = true;
                a.field_needRetry = true;
                if (Util.isNullOrNil(a.field_encryptKey)) {
                    a.field_keyVersion = -1;
                }
                Log.m105918d("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "new record " + a);
                tVar.mo176455g(a, true);
                CheckResUpdateHelper.m162971c().mo176408i(hVar.f347708n, hVar.f347709o, 0, hVar.f347706A);
                C115885g.C115886a.m163001a(true, true, a, hVar);
                return;
            }
            Log.m105918d("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "record is not null");
            e.field_networkType = hVar.f347763d;
            if (Util.isNullOrNil(e.field_originalMd5)) {
                e.field_originalMd5 = hVar.f347713s;
            }
            if (Util.getInt(hVar.f347762c, 0) - Util.getInt(e.field_fileVersion, 0) > 0) {
                Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "new version of file, re-download");
                C115913v a2 = hVar.mo176434a();
                int i = e.field_keyVersion;
                if (i >= hVar.f347717w) {
                    a2.field_keyVersion = i;
                    a2.field_encryptKey = e.field_encryptKey;
                }
                a2.field_fileUpdated = true;
                a2.field_needRetry = true;
                a2.field_deleted = false;
                tVar.mo176455g(a2, true);
                CheckResUpdateHelper.m162971c().mo176408i(hVar.f347708n, hVar.f347709o, 0, hVar.f347706A);
                String str = hVar.f347761b;
                if (tVar.f347788e) {
                    tVar.f347785b.mo119164b(str);
                }
                C115885g.C115886a.m163001a(false, true, a2, hVar);
                return;
            }
            if (Util.getInt(hVar.f347762c, 0) - Util.getInt(e.field_fileVersion, 0) != 0 || e.field_needRetry) {
                int i2 = e.field_status;
                if (i2 == 2 || i2 == 1 || i2 == 0) {
                    long c = C48020a.m53386c(e.field_filePath);
                    long j = e.field_contentLength;
                    if (j > c) {
                        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "content-length(%d) > fileSize(%d), resume download", Long.valueOf(j), Long.valueOf(c));
                        if (0 == c) {
                            CheckResUpdateHelper.m162971c().mo176408i(hVar.f347708n, hVar.f347709o, 0, hVar.f347706A);
                            C115885g.C115886a.m163001a(false, true, e, hVar);
                            return;
                        }
                        C115885g.C115886a.m163001a(true, false, e, hVar);
                    } else if (!Util.nullAsNil(C86013q1.m106456q(C115890j.m163008b(hVar.f347761b))).equals(e.field_md5)) {
                        Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "file invalid, re-download");
                        C115885g.C115886a.m163001a(false, true, e, hVar);
                    } else {
                        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "md5 check ok, file download complete, throw event to do decrypt %s", e.field_urlKey);
                        e.field_status = 2;
                        e.field_contentLength = C48020a.m53386c(e.field_filePath);
                        e.field_fileUpdated = false;
                        e.field_reportId = hVar.f347710p;
                        tVar.mo176455g(e, true);
                        C115891k.m163010a(e.field_reportId, 13);
                        C115891k.m163010a(e.field_reportId, 44);
                        C115891k.m163012c(e.field_resType, e.field_subType, e.field_url, Util.getInt(e.field_fileVersion, 0), C115891k.C115892a.FILE_LATEST, true, "NewXml".equalsIgnoreCase(e.field_groupId2), true, e.field_sampleId);
                        if (hVar.f347714t || hVar.f347715u) {
                            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "send query and decrypt request %s", hVar.f347761b);
                            C115885g.C115887b.m163002a(e, false, false);
                            return;
                        }
                        CheckResUpdateHelper.m162971c().mo176407h(hVar.f347708n, hVar.f347709o, C115890j.m163008b(hVar.f347761b), Util.getInt(hVar.f347762c, 0), hVar.f347713s);
                    }
                } else if (i2 == 4 || i2 == 3) {
                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "file invalid, re-download %s", e.field_urlKey);
                    C115885g.C115886a.m163001a(false, true, e, hVar);
                }
            } else {
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "no need retry, resType %d, subType %d, version %s", Integer.valueOf(e.field_resType), Integer.valueOf(e.field_subType), e.field_fileVersion);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$e */
    public class C115874e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f347664d;

        /* renamed from: e */
        public final /* synthetic */ String f347665e;

        /* renamed from: f */
        public final /* synthetic */ String f347666f;

        /* renamed from: g */
        public final /* synthetic */ int f347667g;

        /* renamed from: h */
        public final /* synthetic */ int f347668h;

        /* renamed from: i */
        public final /* synthetic */ String f347669i;

        /* renamed from: j */
        public final /* synthetic */ boolean f347670j;

        public C115874e(CheckResUpdateHelper checkResUpdateHelper, String str, String str2, String str3, int i, int i2, String str4, boolean z) {
            this.f347664d = str;
            this.f347665e = str2;
            this.f347666f = str3;
            this.f347667g = i;
            this.f347668h = i2;
            this.f347669i = str4;
            this.f347670j = z;
        }

        public void run() {
            C115908t tVar = C115908t.C115910b.f347790a;
            C115913v e = tVar.mo176453e(this.f347664d);
            String str = this.f347665e;
            String str2 = this.f347666f;
            int i = this.f347667g;
            int i2 = this.f347668h;
            String str3 = this.f347669i;
            boolean z = this.f347670j;
            if (e == null) {
                C115913v vVar = new C115913v();
                vVar.field_keyVersion = i;
                vVar.field_encryptKey = str2;
                long j = (long) i2;
                vVar.field_reportId = j;
                vVar.field_sampleId = str3;
                vVar.field_originalMd5 = str;
                tVar.mo176455g(vVar, true);
                C115891k.m163010a(j, 51);
                C115891k.m163010a(j, 45);
                return;
            }
            int i3 = e.field_keyVersion;
            if (i3 < i) {
                e.field_keyVersion = i;
                e.field_encryptKey = str2;
                e.field_reportId = (long) i2;
                e.field_sampleId = str3;
                if (Util.isNullOrNil(e.field_originalMd5)) {
                    e.field_originalMd5 = str;
                }
                tVar.mo176455g(e, true);
                C115885g.C115887b.m163002a(e, true, z);
            } else if (z && i3 == i) {
                C115885g.C115887b.m163002a(e, true, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$f */
    public class C115875f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f347671d;

        /* renamed from: e */
        public final /* synthetic */ int f347672e;

        /* renamed from: f */
        public final /* synthetic */ String f347673f;

        /* renamed from: g */
        public final /* synthetic */ int f347674g;

        /* renamed from: h */
        public final /* synthetic */ String f347675h;

        public C115875f(int i, int i2, String str, int i3, String str2) {
            this.f347671d = i;
            this.f347672e = i2;
            this.f347673f = str;
            this.f347674g = i3;
            this.f347675h = str2;
        }

        public void run() {
            CheckResUpdateHelper checkResUpdateHelper = CheckResUpdateHelper.this;
            int i = this.f347671d;
            int i2 = this.f347672e;
            String str = this.f347673f;
            int i3 = this.f347674g;
            String str2 = this.f347675h;
            checkResUpdateHelper.getClass();
            String c = C115890j.m163009c(i, i2);
            C115908t tVar = C115908t.C115910b.f347790a;
            C115913v e = tVar.mo176453e(c);
            if (e != null) {
                boolean z = e.field_fileUpdated;
                e.field_fileUpdated = false;
                tVar.mo176455g(e, true);
                if (i3 == Util.getInt(e.field_fileVersion, 0)) {
                    MMHandler mMHandler = tVar.f347787d;
                    if (mMHandler == null) {
                        Log.m105922f("MicroMsg.ResDownloader.CheckResUpdateHelper", "sendEventFileCached: get null eventThread ");
                    } else {
                        mMHandler.post(new C30691c(checkResUpdateHelper, i, i2, str, i3, z, str2));
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$g */
    public interface C115876g {
        /* renamed from: a */
        boolean mo176421a(int i, int i2, int i3);
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$h */
    public static final class C115877h {

        /* renamed from: a */
        public static final CheckResUpdateHelper f347677a = new CheckResUpdateHelper((C115871b) null);
    }

    public CheckResUpdateHelper(C115871b bVar) {
        C115881b bVar2 = new C115881b(this);
        this.f347647c = bVar2;
        C115908t tVar = C115908t.C115910b.f347790a;
        tVar.getClass();
        Log.m105919d("MicroMsg.ResDownloaderCore", "addNetworkEventLister, groupId = %s, listener = %s", "CheckResUpdate", bVar2);
        if (tVar.f347788e) {
            C115905m mVar = tVar.f347786c;
            mVar.getClass();
            Log.m105918d("MicroMsg.ResDownloader.NetworkEventDispatcher", "addNetworkEventListener, listener = " + bVar2);
            synchronized (mVar.f347783c) {
                List list = mVar.f347782b.get(-1894509183);
                list = list == null ? new LinkedList() : list;
                list.add(bVar2);
                mVar.f347782b.put(-1894509183, list);
            }
        }
    }

    /* renamed from: c */
    public static CheckResUpdateHelper m162971c() {
        if (!MMApplicationContext.isMainProcess()) {
            Assert.fail("Inaccessible in child process.");
        }
        return C115877h.f347677a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        r2 = r8.f347684d;
        r6 = r8.f347690j;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo176401a(com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "addDecryptRequest, urlkey = "
            r0.append(r1)
            java.lang.String r1 = r8.field_urlKey
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ResDownloader.CheckResUpdateHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.l r0 = r7.f347646b
            r0.getClass()
            java.lang.String r1 = r8.field_urlKey
            boolean r1 = r0.mo119166e(r1)
            java.lang.String r2 = "URLKey(%s) is already decrypting, skip repeated task"
            java.lang.String r3 = "MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor"
            if (r1 == 0) goto L_0x002d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            goto L_0x008a
        L_0x002d:
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a r8 = com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115880a.m162988b(r8)
            java.lang.String r1 = r8.f347681a
            boolean r1 = r0.mo119166e(r1)
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r8 = r8.f347681a
            r0[r5] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            goto L_0x008a
        L_0x0045:
            boolean r1 = r8.f347687g
            if (r1 == 0) goto L_0x0051
            int r2 = r8.f347684d
            int r6 = r8.f347690j
            if (r2 != r6) goto L_0x0051
            if (r6 >= 0) goto L_0x0057
        L_0x0051:
            if (r1 != 0) goto L_0x0059
            boolean r1 = r8.f347688h
            if (r1 == 0) goto L_0x0059
        L_0x0057:
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            if (r1 != 0) goto L_0x005d
            goto L_0x008a
        L_0x005d:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r8.f347681a
            r1[r5] = r2
            java.lang.String r2 = "request#URLKey(%s) posted to decryptWorker"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
            r0.mo119167g(r8)     // Catch:{ RejectedExecutionException -> 0x006d }
            goto L_0x008a
        L_0x006d:
            r1 = move-exception
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = r8.f347681a
            r2[r5] = r6
            r2[r4] = r1
            java.lang.String r1 = "submitRequest(%s) get rejected[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r1, r2)
            java.lang.String r1 = r8.f347681a
            r0.mo119164b(r1)
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.l$a r0 = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.l$a
            r0.<init>(r8)
            r0.run()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper.mo176401a(com.tencent.mm.pluginsdk.res.downloader.model.v):void");
    }

    /* renamed from: b */
    public String mo176402b(int i, int i2) {
        String str;
        C115913v e = C115908t.C115910b.f347790a.mo176453e(C115890j.m163009c(i, i2));
        if (e == null) {
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, get null info, return", Integer.valueOf(i), Integer.valueOf(i2));
            return null;
        }
        Log.m105927v("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, queried primeInfo { deleted = %b, filepath = %s, md5 = %s, compress = %b, encrypt = %b, originalMd5 = %s }", Boolean.valueOf(e.field_deleted), e.field_filePath, e.field_md5, Boolean.valueOf(e.field_fileCompress), Boolean.valueOf(e.field_fileEncrypt), e.field_originalMd5);
        boolean z = e.field_fileCompress;
        if (z || e.field_fileEncrypt) {
            if (z) {
                str = e.field_filePath + ".decompressed";
            } else if (e.field_fileEncrypt) {
                str = e.field_filePath + ".decrypted";
            } else {
                str = null;
            }
            if (Util.isNullOrNil(str)) {
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt or decompress, filePath invalid return null ", Integer.valueOf(i), Integer.valueOf(i2));
                return null;
            } else if (Util.isNullOrNil(e.field_originalMd5) || !Util.nullAsNil(C86013q1.m106456q(str)).equals(e.field_originalMd5)) {
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, needDecrypt(%b) needDecompress(%b), file invalid, return null ", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(e.field_fileEncrypt), Boolean.valueOf(e.field_fileCompress));
                return null;
            } else {
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt or decompress, file valid, ret = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                return str;
            }
        } else if (e.field_deleted || Util.isNullOrNil(e.field_filePath) || !Util.nullAsNil(C86013q1.m106456q(e.field_filePath)).equals(e.field_md5)) {
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, not need decrypt and file invalid, return null", Integer.valueOf(i), Integer.valueOf(i2));
            return null;
        } else {
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, not need decrypt and file valid, return path(%s)", Integer.valueOf(i), Integer.valueOf(i2), e.field_filePath);
            return e.field_filePath;
        }
    }

    /* renamed from: d */
    public void mo176403d(int i, int i2, int i3, boolean z) {
        C115908t.C115910b.f347790a.mo176452d(new C115871b(this, i, i2, i3, z));
    }

    /* renamed from: e */
    public void mo176404e(int i, C118473ut3 ut32, boolean z) {
        String str;
        byte[] bArr;
        int i2;
        String str2;
        C118473ut3 ut33 = ut32;
        String c = C115890j.m163009c(i, ut33.f354482d);
        if (ut33.f354483e == null) {
            Log.m105921e("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveCacheOperation(%s), resource.Info = null, return", c);
            return;
        }
        Object[] objArr = new Object[9];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(ut33.f354482d);
        objArr[2] = Boolean.valueOf(z);
        objArr[3] = Integer.valueOf(ut33.f354483e.f259944e);
        LinkedList<f54> linkedList = ut33.f354483e.f259947h;
        objArr[4] = linkedList == null ? "null" : String.valueOf(linkedList.size());
        objArr[5] = Integer.valueOf(ut33.f354486h);
        objArr[6] = ut33.f354487i;
        C90448yt3 yt32 = ut33.f354483e;
        objArr[7] = yt32.f259945f;
        objArr[8] = yt32.f259948i;
        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive cache-op, urlKey = %d.%d,  fromNewXml = %b, file version = %d, eccSignatureList.size = %s, reportId = %s, sampleId = %s, url = %s, data = %s", objArr);
        LinkedList<f54> linkedList2 = ut33.f354483e.f259947h;
        if (linkedList2 != null) {
            Iterator<f54> it = linkedList2.iterator();
            while (it.hasNext()) {
                f54 next = it.next();
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "cache-op, sigInfo: version(%d), signature(%s) ", Integer.valueOf(next.f133304d), next.f133305e.mo123705h());
            }
        }
        C115891k.m163010a((long) ut33.f354486h, 2);
        if (!z) {
            C115891k.m163010a((long) ut33.f354486h, 1);
        }
        int i3 = ut33.f354488j;
        if (i3 != 0 && ((long) i3) <= Util.nowSecond()) {
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "recourse(%s) is expired before do download, expireTime = %d, fileVersion = %d", c, Integer.valueOf(ut33.f354488j), Integer.valueOf(ut33.f354483e.f259944e));
            C115891k.m163010a((long) ut33.f354486h, 14);
            C115891k.m163010a((long) ut33.f354486h, 44);
            int i4 = ut33.f354482d;
            C90448yt3 yt33 = ut33.f354483e;
            C115891k.m163012c(i, i4, yt33.f259945f, yt33.f259944e, C115891k.C115892a.FILE_EXPIRED, false, z, false, ut33.f354487i);
        } else if (!Util.isNullOrNil(ut33.f354483e.f259945f) || ut33.f354483e.f259948i != null) {
            C90448yt3 yt34 = ut33.f354483e;
            String str3 = yt34.f259945f;
            int i5 = ut33.f354482d;
            long j = (long) ut33.f354488j;
            int i6 = yt34.f259944e;
            String str4 = yt34.f259943d;
            int i7 = yt34.f259946g;
            boolean z2 = (i7 & 2) > 0;
            boolean z3 = (i7 & 1) > 0;
            long j2 = (long) ut33.f354486h;
            String str5 = ut33.f354487i;
            int i8 = ut33.f354489n;
            int i9 = i8 > 0 ? i8 : 3;
            int i15 = ut33.f354490o;
            int i16 = ut33.f354491p;
            if (!Util.isNullOrNil((List) yt34.f259947h)) {
                str = "MicroMsg.ResDownloader.CheckResUpdateHelper";
                bArr = ut33.f354483e.f259947h.get(0).f133305e.f257327a;
            } else {
                str = "MicroMsg.ResDownloader.CheckResUpdateHelper";
                bArr = null;
            }
            C52019xt3 xt32 = ut33.f354484f;
            if (xt32 == null || Util.isNullOrNil(xt32.f144962e)) {
                str2 = null;
                i2 = 0;
            } else {
                C52019xt3 xt33 = ut33.f354484f;
                String str6 = xt33.f144962e;
                i2 = xt33.f144961d;
                str2 = str6;
            }
            C89349b bVar = ut33.f354483e.f259948i;
            byte[] f = (bVar == null || bVar.f257327a.length <= 0) ? null : bVar.mo123703f();
            C90448yt3 yt35 = ut33.f354483e;
            C115888h hVar = r2;
            C115888h hVar2 = new C115888h(str3, c, i6, i16, i9, j, str4, i, i5, j2, str5, bArr, yt35.f259949j, z2, z3, str2, i2, i15, f, (long) yt35.f259950n, z, false, ut33.f354493r);
            Log.m105919d(str, "request (%s)", hVar.toString());
            C115908t.C115910b.f347790a.mo176452d(new C115873d(this, c, hVar));
        } else {
            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateHelper", "cache-op, invalid cache operation, url and data is null or nil, skip");
        }
    }

    /* renamed from: f */
    public void mo176405f(int i, C118473ut3 ut32, boolean z, boolean z2) {
        String c = C115890j.m163009c(i, ut32.f354482d);
        C52019xt3 xt32 = ut32.f354484f;
        if (xt32 == null || Util.isNullOrNil(xt32.f144962e)) {
            Log.m105921e("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveDecryptOperation(), resource.Key invalid, resource=%d.%d", Integer.valueOf(i), Integer.valueOf(ut32.f354482d));
            return;
        }
        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive decrypt-op, fromNewXml(%b), %d.%d, key version (%d)", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(ut32.f354482d), Integer.valueOf(ut32.f354484f.f144961d));
        Log.m105919d("MicroMsg.ResDownloader.CheckResUpdateHelper", "key (%s)", ut32.f354484f.f144962e);
        C115891k.m163010a((long) ut32.f354486h, 4);
        String str = ut32.f354483e.f259949j;
        C52019xt3 xt33 = ut32.f354484f;
        C115874e eVar = new C115874e(this, c, str, xt33.f144962e, xt33.f144961d, ut32.f354486h, ut32.f354487i, z2);
        if (z2) {
            eVar.run();
        } else {
            C115908t.C115910b.f347790a.mo176452d(eVar);
        }
    }

    /* renamed from: g */
    public void mo176406g(int i, C118473ut3 ut32, boolean z) {
        String c = C115890j.m163009c(i, ut32.f354482d);
        if (ut32.f354483e == null) {
            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveDeleteOperation(), resource.Info = null");
            return;
        }
        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive delete-op, fromNewXml(%b), %d.%d, file version (%d)", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(ut32.f354482d), Integer.valueOf(ut32.f354483e.f259944e));
        C115891k.m163010a((long) ut32.f354486h, 3);
        int i2 = ut32.f354483e.f259944e;
        C115908t.C115910b.f347790a.mo176452d(new C115872c(this, c, i, ut32.f354482d, i2, ut32.f354486h, ut32.f354487i, z));
    }

    /* renamed from: h */
    public void mo176407h(int i, int i2, String str, int i3, String str2) {
        C115908t.C115910b.f347790a.mo176452d(new C115875f(i, i2, str, i3, str2));
    }

    /* renamed from: i */
    public void mo176408i(int i, int i2, int i3, boolean z) {
        MMHandler mMHandler = C115908t.C115910b.f347790a.f347787d;
        if (mMHandler == null) {
            Log.m105922f("MicroMsg.ResDownloader.CheckResUpdateHelper", "sendEventPreOperation: get null eventThread ");
        } else {
            mMHandler.post(new C30690a(this, i3, i, i2, z));
        }
    }
}
