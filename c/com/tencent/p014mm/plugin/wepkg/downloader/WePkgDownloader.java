package com.tencent.p014mm.plugin.wepkg.downloader;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.wepkg.model.C44498h;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lb3.C46839a;
import mb3.C46980a;

/* renamed from: com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader */
public class WePkgDownloader {

    /* renamed from: c */
    public static volatile WePkgDownloader f120586c;

    /* renamed from: a */
    public Map<String, IWepkgUpdateCallback> f120587a;

    /* renamed from: b */
    public C46980a f120588b = new C44473b();

    /* renamed from: com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback */
    public interface IWepkgUpdateCallback {

        /* renamed from: com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode */
        public enum RetCode implements Parcelable {
            OK,
            LOCAL_FILE_NOT_FOUND,
            PKG_INTEGRITY_FAILED,
            FAILED,
            CANCEL;
            
            public static final Parcelable.Creator<RetCode> CREATOR = null;

            /* renamed from: com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode$a */
            public class C44471a implements Parcelable.Creator<RetCode> {
                public Object createFromParcel(Parcel parcel) {
                    return RetCode.values()[parcel.readInt()];
                }

                public Object[] newArray(int i) {
                    return new RetCode[i];
                }
            }

            /* access modifiers changed from: public */
            static {
                CREATOR = new C44471a();
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(ordinal());
            }
        }

        /* renamed from: a */
        void mo69236a(String str, String str2, RetCode retCode);
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$a */
    public class C44472a implements IWepkgUpdateCallback {

        /* renamed from: a */
        public final /* synthetic */ WepkgVersion f120595a;

        /* renamed from: b */
        public final /* synthetic */ C46839a f120596b;

        /* renamed from: c */
        public final /* synthetic */ IWepkgUpdateCallback f120597c;

        public C44472a(WepkgVersion wepkgVersion, C46839a aVar, IWepkgUpdateCallback iWepkgUpdateCallback) {
            this.f120595a = wepkgVersion;
            this.f120596b = aVar;
            this.f120597c = iWepkgUpdateCallback;
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x011e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo69236a(java.lang.String r21, java.lang.String r22, com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode r23) {
            /*
                r20 = this;
                r1 = r20
                r2 = r21
                r3 = r22
                r0 = r23
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r4 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.OK
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader r5 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.this
                com.tencent.mm.plugin.wepkg.model.WepkgVersion r6 = r1.f120595a
                java.lang.String r6 = r6.f120653f
                r5.getClass()
                java.lang.String r5 = com.tencent.p014mm.plugin.wepkg.model.C44498h.m48864b(r2, r6)
                com.tencent.p014mm.plugin.wepkg.utils.C44536d.m48916b(r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                java.lang.String r5 = "/package"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                r6 = 859(0x35b, float:1.204E-42)
                if (r0 != r4) goto L_0x0128
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r7 = 24
                r0.mo175911u(r6, r7)
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader r7 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.this
                lb3.a r8 = r1.f120596b
                java.lang.String r8 = r8.field_oldPath
                com.tencent.mm.plugin.wepkg.model.WepkgVersion r9 = r1.f120595a
                java.lang.String r9 = r9.f120660p
                r7.getClass()
                java.lang.String r7 = "MicroMsg.Wepkg.WepkgDownloader"
                java.lang.String r10 = ""
                long r11 = java.lang.System.currentTimeMillis()
                r13 = 2
                java.lang.Class<com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService> r16 = com.tencent.p014mm.plugin.appbrand.service.IBSPatchJNIService.class
                di3.d r16 = di3.C86312j.m106911c(r16)     // Catch:{ Exception -> 0x00d9 }
                r6 = r16
                com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService r6 = (com.tencent.p014mm.plugin.appbrand.service.IBSPatchJNIService) r6     // Catch:{ Exception -> 0x00d9 }
                int r6 = r6.bspatch(r8, r5, r3)     // Catch:{ Exception -> 0x00d9 }
                long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d9 }
                long r14 = r17 - r11
                r17 = r4
                java.lang.String r4 = "mergeDiffPackage, result: %d, cost: %d"
                java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x00d7 }
                java.lang.Integer r18 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00d7 }
                r16 = 0
                r1[r16] = r18     // Catch:{ Exception -> 0x00d7 }
                java.lang.Long r18 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x00d7 }
                r19 = 1
                r1[r19] = r18     // Catch:{ Exception -> 0x00d7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r1)     // Catch:{ Exception -> 0x00d7 }
                if (r6 != 0) goto L_0x00c4
                r1 = 34
                r4 = 859(0x35b, float:1.204E-42)
                r0.mo175911u(r4, r1)     // Catch:{ Exception -> 0x00d7 }
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x00d7 }
                if (r1 == 0) goto L_0x008a
                r1 = 1
                goto L_0x00af
            L_0x008a:
                java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106456q(r5)     // Catch:{ Exception -> 0x00d7 }
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x00d7 }
                if (r4 == 0) goto L_0x0096
                r1 = 0
                goto L_0x00af
            L_0x0096:
                java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x00d7 }
                r6 = 0
                r4[r6] = r1     // Catch:{ Exception -> 0x00d7 }
                r6 = 1
                r4[r6] = r9     // Catch:{ Exception -> 0x00d7 }
                java.lang.String r6 = "matchMd5, fileMd5: %s, md5: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r4)     // Catch:{ Exception -> 0x00d7 }
                java.lang.String r4 = r9.trim()     // Catch:{ Exception -> 0x00d7 }
                java.lang.String r1 = r1.trim()     // Catch:{ Exception -> 0x00d7 }
                boolean r1 = r4.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x00d7 }
            L_0x00af:
                if (r1 == 0) goto L_0x00b7
                r1 = 0
                com.tencent.p014mm.plugin.wepkg.utils.C44532a.m48911b(r2, r1, r10, r14)     // Catch:{ Exception -> 0x00d7 }
                r14 = 1
                goto L_0x0108
            L_0x00b7:
                r1 = 35
                r4 = 859(0x35b, float:1.204E-42)
                r0.mo175911u(r4, r1)     // Catch:{ Exception -> 0x00d7 }
                r0 = 2007(0x7d7, float:2.812E-42)
                com.tencent.p014mm.plugin.wepkg.utils.C44532a.m48911b(r2, r0, r10, r14)     // Catch:{ Exception -> 0x00d7 }
                goto L_0x00d5
            L_0x00c4:
                r1 = 27
                r4 = 859(0x35b, float:1.204E-42)
                r0.mo175911u(r4, r1)     // Catch:{ Exception -> 0x00d7 }
                int r1 = 25 - r6
                r0.mo175911u(r4, r1)     // Catch:{ Exception -> 0x00d7 }
                int r0 = 1998 - r6
                com.tencent.p014mm.plugin.wepkg.utils.C44532a.m48911b(r2, r0, r10, r14)     // Catch:{ Exception -> 0x00d7 }
            L_0x00d5:
                r4 = 0
                goto L_0x0107
            L_0x00d7:
                r0 = move-exception
                goto L_0x00dc
            L_0x00d9:
                r0 = move-exception
                r17 = r4
            L_0x00dc:
                long r14 = java.lang.System.currentTimeMillis()
                long r14 = r14 - r11
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r4 = 0
                r1[r4] = r0
                r6 = 1
                r1[r6] = r8
                r1[r13] = r5
                r6 = 3
                r1[r6] = r3
                java.lang.String r6 = "mergeDiffPkg e = %s, old[%s], new[%s], diff[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r6, r1)
                java.lang.Object[] r1 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r10, r1)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r1 = 33
                r6 = 859(0x35b, float:1.204E-42)
                r0.mo175911u(r6, r1)
                r0 = 2006(0x7d6, float:2.811E-42)
                com.tencent.p014mm.plugin.wepkg.utils.C44532a.m48911b(r2, r0, r10, r14)
            L_0x0107:
                r14 = 0
            L_0x0108:
                com.tencent.p014mm.vfs.C86013q1.m106447h(r22)
                lb3.b r0 = lb3.C46840b.m52131Lo()
                r0.mo72038c(r2)
                if (r14 == 0) goto L_0x011e
                r1 = r20
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback r0 = r1.f120597c
                r3 = r17
                r0.mo69236a(r2, r5, r3)
                goto L_0x016a
            L_0x011e:
                r1 = r20
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader r0 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.this
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback r3 = r1.f120597c
                r0.mo69232c(r2, r3)
                goto L_0x016a
            L_0x0128:
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r4 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.CANCEL
                if (r0 != r4) goto L_0x0132
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback r3 = r1.f120597c
                r3.mo69236a(r2, r5, r0)
                goto L_0x016a
            L_0x0132:
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r4 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.FAILED
                if (r0 != r4) goto L_0x0140
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 23
                r5 = 859(0x35b, float:1.204E-42)
                r0.mo175911u(r5, r4)
                goto L_0x0159
            L_0x0140:
                r5 = 859(0x35b, float:1.204E-42)
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r4 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.PKG_INTEGRITY_FAILED
                if (r0 != r4) goto L_0x014e
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 25
                r0.mo175911u(r5, r4)
                goto L_0x0159
            L_0x014e:
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r4 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.LOCAL_FILE_NOT_FOUND
                if (r0 != r4) goto L_0x0159
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 26
                r0.mo175911u(r5, r4)
            L_0x0159:
                com.tencent.p014mm.vfs.C86013q1.m106447h(r22)
                lb3.b r0 = lb3.C46840b.m52131Lo()
                r0.mo72038c(r2)
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader r0 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.this
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback r3 = r1.f120597c
                r0.mo69232c(r2, r3)
            L_0x016a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.C44472a.mo69236a(java.lang.String, java.lang.String, com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$b */
    public class C44473b implements C46980a {
        public C44473b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x0168  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo69241a(mb3.C46986g r13) {
            /*
                r12 = this;
                monitor-enter(r12)
                int r0 = r13.f126342b     // Catch:{ all -> 0x016f }
                r1 = 1
                if (r0 != r1) goto L_0x00b4
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x016f }
                r3 = 859(0x35b, double:4.244E-321)
                r5 = 2
                r7 = 1
                r9 = 0
                r2 = r0
                r2.idkeyStat(r3, r5, r7, r9)     // Catch:{ all -> 0x016f }
                mb3.f r2 = r13.f126341a     // Catch:{ all -> 0x016f }
                java.lang.String r2 = r2.f126334g     // Catch:{ all -> 0x016f }
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x016f }
                if (r3 != 0) goto L_0x009f
                android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)     // Catch:{ all -> 0x016f }
                r4 = 0
                java.lang.String r5 = r3.getPath()     // Catch:{ all -> 0x016f }
                r6 = 0
                if (r5 == 0) goto L_0x0043
                java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r6, r6)     // Catch:{ all -> 0x016f }
                java.lang.String r7 = r3.getPath()     // Catch:{ all -> 0x016f }
                boolean r7 = r7.equals(r5)     // Catch:{ all -> 0x016f }
                if (r7 != 0) goto L_0x0043
                android.net.Uri$Builder r3 = r3.buildUpon()     // Catch:{ all -> 0x016f }
                android.net.Uri$Builder r3 = r3.path(r5)     // Catch:{ all -> 0x016f }
                android.net.Uri r3 = r3.build()     // Catch:{ all -> 0x016f }
            L_0x0043:
                com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x016f }
                com.tencent.mm.vfs.f0$h r3 = r5.mo177799l(r3, r4)     // Catch:{ all -> 0x016f }
                boolean r4 = r3.mo177810a()     // Catch:{ all -> 0x016f }
                if (r4 != 0) goto L_0x0051
                r3 = 0
                goto L_0x0059
            L_0x0051:
                com.tencent.mm.vfs.FileSystem$c r4 = r3.f348991a     // Catch:{ all -> 0x016f }
                java.lang.String r3 = r3.f348992b     // Catch:{ all -> 0x016f }
                boolean r3 = r4.mo119948x(r3)     // Catch:{ all -> 0x016f }
            L_0x0059:
                if (r3 != 0) goto L_0x005c
                goto L_0x009f
            L_0x005c:
                mb3.f r3 = r13.f126341a     // Catch:{ all -> 0x016f }
                java.lang.String r3 = r3.f126336i     // Catch:{ all -> 0x016f }
                java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106456q(r2)     // Catch:{ all -> 0x016f }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)     // Catch:{ all -> 0x016f }
                boolean r5 = r5.equalsIgnoreCase(r3)     // Catch:{ all -> 0x016f }
                if (r5 != 0) goto L_0x0091
                java.lang.String r5 = "MicroMsg.Wepkg.WepkgDownloader"
                java.lang.String r7 = "onDownloadComplete, file.md5(%s) != net.md5(%s)"
                r8 = 2
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x016f }
                r8[r6] = r4     // Catch:{ all -> 0x016f }
                r8[r1] = r3     // Catch:{ all -> 0x016f }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r8)     // Catch:{ all -> 0x016f }
                com.tencent.p014mm.vfs.C86013q1.m106447h(r2)     // Catch:{ all -> 0x016f }
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r10 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.PKG_INTEGRITY_FAILED     // Catch:{ all -> 0x016f }
                r2 = 1012(0x3f4, float:1.418E-42)
                r13.f126343c = r2     // Catch:{ all -> 0x016f }
                r3 = 859(0x35b, double:4.244E-321)
                r5 = 3
                r7 = 1
                r9 = 0
                r2 = r0
                r2.idkeyStat(r3, r5, r7, r9)     // Catch:{ all -> 0x016f }
                goto L_0x00c2
            L_0x0091:
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r10 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.OK     // Catch:{ all -> 0x016f }
                r3 = 859(0x35b, double:4.244E-321)
                r5 = 5
                r7 = 1
                r9 = 0
                r2 = r0
                r2.idkeyStat(r3, r5, r7, r9)     // Catch:{ all -> 0x016f }
                goto L_0x00c2
            L_0x009f:
                java.lang.String r2 = "MicroMsg.Wepkg.WepkgDownloader"
                java.lang.String r3 = "onDownloadComplete, pkgPath is null or nil"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ all -> 0x016f }
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r10 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.LOCAL_FILE_NOT_FOUND     // Catch:{ all -> 0x016f }
                r3 = 859(0x35b, double:4.244E-321)
                r5 = 4
                r7 = 1
                r9 = 0
                r2 = r0
                r2.idkeyStat(r3, r5, r7, r9)     // Catch:{ all -> 0x016f }
                goto L_0x00c2
            L_0x00b4:
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x016f }
                r3 = 859(0x35b, double:4.244E-321)
                r5 = 1
                r7 = 1
                r9 = 0
                r2.idkeyStat(r3, r5, r7, r9)     // Catch:{ all -> 0x016f }
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r10 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.FAILED     // Catch:{ all -> 0x016f }
            L_0x00c2:
                java.lang.String r0 = "MicroMsg.Wepkg.WepkgDownloader"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x016f }
                r2.<init>()     // Catch:{ all -> 0x016f }
                java.lang.String r3 = "download callback retCode:"
                r2.append(r3)     // Catch:{ all -> 0x016f }
                r2.append(r10)     // Catch:{ all -> 0x016f }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x016f }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x016f }
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader r0 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.this     // Catch:{ all -> 0x016f }
                java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback> r0 = r0.f120587a     // Catch:{ all -> 0x016f }
                mb3.f r2 = r13.f126341a     // Catch:{ all -> 0x016f }
                java.lang.String r2 = r2.f126328a     // Catch:{ all -> 0x016f }
                java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x016f }
                java.lang.Object r0 = r0.remove(r2)     // Catch:{ all -> 0x016f }
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback r0 = (com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback) r0     // Catch:{ all -> 0x016f }
                if (r0 == 0) goto L_0x00f4
                mb3.f r2 = r13.f126341a     // Catch:{ all -> 0x016f }
                java.lang.String r3 = r2.f126330c     // Catch:{ all -> 0x016f }
                java.lang.String r2 = r2.f126334g     // Catch:{ all -> 0x016f }
                r0.mo69236a(r3, r2, r10)     // Catch:{ all -> 0x016f }
                goto L_0x010c
            L_0x00f4:
                java.lang.String r0 = "MicroMsg.Wepkg.WepkgDownloader"
                java.lang.String r2 = "download callback invalid"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x016f }
                java.lang.String r3 = "CallbackInvalid"
                mb3.f r0 = r13.f126341a     // Catch:{ all -> 0x016f }
                java.lang.String r4 = r0.f126333f     // Catch:{ all -> 0x016f }
                java.lang.String r5 = r0.f126330c     // Catch:{ all -> 0x016f }
                r6 = 0
                r7 = -1
                r9 = 0
                r11 = 0
                com.tencent.p014mm.plugin.wepkg.utils.C44532a.m48912c(r3, r4, r5, r6, r7, r9, r11)     // Catch:{ all -> 0x016f }
            L_0x010c:
                mb3.f r0 = r13.f126341a     // Catch:{ all -> 0x016f }
                int r2 = r0.f126329b     // Catch:{ all -> 0x016f }
                if (r2 == r1) goto L_0x0137
                r1 = 3
                if (r2 != r1) goto L_0x0116
                goto L_0x0137
            L_0x0116:
                java.lang.String r1 = r0.f126330c     // Catch:{ all -> 0x016f }
                java.lang.String r0 = r0.f126331d     // Catch:{ all -> 0x016f }
                com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask r2 = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask     // Catch:{ all -> 0x016f }
                r2.<init>()     // Catch:{ all -> 0x016f }
                r3 = 4005(0xfa5, float:5.612E-42)
                r2.f120618h = r3     // Catch:{ all -> 0x016f }
                com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile r3 = r2.f120622o     // Catch:{ all -> 0x016f }
                r3.f120639e = r1     // Catch:{ all -> 0x016f }
                r3.f120642h = r0     // Catch:{ all -> 0x016f }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()     // Catch:{ all -> 0x016f }
                if (r0 == 0) goto L_0x0133
                r2.mo1553j()     // Catch:{ all -> 0x016f }
                goto L_0x0153
            L_0x0133:
                r2.mo114396f()     // Catch:{ all -> 0x016f }
                goto L_0x0153
            L_0x0137:
                java.lang.String r0 = r0.f126330c     // Catch:{ all -> 0x016f }
                com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask r1 = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask     // Catch:{ all -> 0x016f }
                r1.<init>()     // Catch:{ all -> 0x016f }
                r2 = 3008(0xbc0, float:4.215E-42)
                r1.f120618h = r2     // Catch:{ all -> 0x016f }
                com.tencent.mm.plugin.wepkg.model.WepkgVersion r2 = r1.f120619i     // Catch:{ all -> 0x016f }
                r2.f120651d = r0     // Catch:{ all -> 0x016f }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()     // Catch:{ all -> 0x016f }
                if (r0 == 0) goto L_0x0150
                r1.mo1553j()     // Catch:{ all -> 0x016f }
                goto L_0x0153
            L_0x0150:
                r1.mo114396f()     // Catch:{ all -> 0x016f }
            L_0x0153:
                com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader r0 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.this     // Catch:{ all -> 0x016f }
                com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.m48822b(r0, r13)     // Catch:{ all -> 0x016f }
                mb3.d r0 = mb3.C46983d.m52299a()     // Catch:{ all -> 0x016f }
                mb3.f r13 = r13.f126341a     // Catch:{ all -> 0x016f }
                java.lang.String r13 = r13.f126328a     // Catch:{ all -> 0x016f }
                java.util.concurrent.ConcurrentHashMap<java.lang.String, mb3.c> r1 = r0.f126326a     // Catch:{ all -> 0x016f }
                boolean r1 = r1.containsKey(r13)     // Catch:{ all -> 0x016f }
                if (r1 == 0) goto L_0x016d
                java.util.concurrent.ConcurrentHashMap<java.lang.String, mb3.c> r0 = r0.f126326a     // Catch:{ all -> 0x016f }
                r0.remove(r13)     // Catch:{ all -> 0x016f }
            L_0x016d:
                monitor-exit(r12)
                return
            L_0x016f:
                r13 = move-exception
                monitor-exit(r12)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.C44473b.mo69241a(mb3.g):void");
        }
    }

    public WePkgDownloader() {
        if (this.f120587a == null) {
            this.f120587a = new ConcurrentHashMap();
        }
    }

    /* renamed from: a */
    public static WePkgDownloader m48821a() {
        if (f120586c == null) {
            synchronized (WePkgDownloader.class) {
                if (f120586c == null) {
                    f120586c = new WePkgDownloader();
                }
            }
        }
        return f120586c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m48822b(com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader r24, mb3.C46986g r25) {
        /*
            r0 = r25
            r24.getClass()
            mb3.f r1 = r0.f126341a
            if (r1 != 0) goto L_0x000b
            goto L_0x0122
        L_0x000b:
            java.lang.String r2 = r1.f126330c
            java.lang.String r3 = r1.f126332e
            int r4 = r0.f126344d
            int r5 = r0.f126343c
            int r6 = r0.f126345e
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isNetworkConnected(r0)
            if (r7 == 0) goto L_0x0041
            boolean r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r0)
            if (r7 == 0) goto L_0x0027
            r7 = 2
            goto L_0x0043
        L_0x0027:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r0)
            if (r7 == 0) goto L_0x002f
            r7 = 3
            goto L_0x0043
        L_0x002f:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r0)
            if (r7 == 0) goto L_0x0037
            r7 = 4
            goto L_0x0043
        L_0x0037:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r0)
            if (r0 == 0) goto L_0x003f
            r7 = 1
            goto L_0x0043
        L_0x003f:
            r7 = 0
            goto L_0x0043
        L_0x0041:
            r0 = -1
            r7 = -1
        L_0x0043:
            java.lang.String r0 = r1.f126333f
            java.lang.String r13 = ""
            java.lang.String r14 = "MicroMsg.WePkgReport"
            if (r0 != 0) goto L_0x004c
            goto L_0x0073
        L_0x004c:
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r10 = "url"
            r15.put(r10, r0)     // Catch:{ JSONException -> 0x006b, UnsupportedEncodingException -> 0x0062 }
            java.lang.String r0 = r15.toString()     // Catch:{ JSONException -> 0x006b, UnsupportedEncodingException -> 0x0062 }
            java.lang.String r10 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r10)     // Catch:{ JSONException -> 0x006b, UnsupportedEncodingException -> 0x0062 }
            goto L_0x0074
        L_0x0062:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            goto L_0x0073
        L_0x006b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
        L_0x0073:
            r0 = r13
        L_0x0074:
            int r10 = r1.f126329b
            long r11 = r1.f126339l
            r16 = 0
            int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0084
            long r16 = java.lang.System.currentTimeMillis()
            long r16 = r16 - r11
        L_0x0084:
            java.lang.String r11 = r1.f126340m
            long r8 = r1.f126335h
            r1 = 8
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r18 = 0
            r12[r18] = r2
            r19 = 1
            r12[r19] = r3
            java.lang.Integer r20 = java.lang.Integer.valueOf(r4)
            r15 = 2
            r12[r15] = r20
            java.lang.Integer r20 = java.lang.Integer.valueOf(r5)
            r21 = 3
            r12[r21] = r20
            java.lang.Integer r20 = java.lang.Integer.valueOf(r6)
            r21 = 4
            r12[r21] = r20
            java.lang.Integer r20 = java.lang.Integer.valueOf(r7)
            r21 = 5
            r12[r21] = r20
            java.lang.Long r20 = java.lang.Long.valueOf(r16)
            r22 = 6
            r12[r22] = r20
            java.lang.Long r20 = java.lang.Long.valueOf(r8)
            r23 = 7
            r12[r23] = r20
            java.lang.String r15 = "pkgId = %s, version = %s, isRange = %d, errCode=%d, retryTimes = %d, netType = %d,costTime = %d, fileSize = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r12)
            r12 = 12
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r14 = 0
            r12[r14] = r2
            r2 = 1
            r12[r2] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = 2
            r12[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 3
            r12[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r3 = 4
            r12[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r12[r21] = r2
            r12[r22] = r0
            r12[r23] = r13
            r12[r1] = r11
            r0 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r12[r0] = r1
            r0 = 10
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            r12[r0] = r1
            r0 = 11
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r12[r0] = r1
            java.lang.String r0 = com.tencent.p014mm.plugin.wepkg.utils.C44532a.m48910a(r12)
            u10.a r1 = u10.C52415a.m58668a()
            u10.b r2 = new u10.b
            r3 = 14229(0x3795, float:1.9939E-41)
            r2.<init>(r3, r0)
            com.tencent.mm.game.report.b r1 = (com.tencent.p014mm.game.report.C40304b) r1
            r1.getClass()
            com.tencent.p014mm.game.report.C40311f.m43479a(r2)
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.m48822b(com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader, mb3.g):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0125, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo69232c(java.lang.String r16, com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback r17) {
        /*
            r15 = this;
            r14 = r15
            r0 = r16
            r13 = r17
            monitor-enter(r15)
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r1 = com.tencent.p014mm.plugin.wepkg.model.C44509m.m48883d(r16)     // Catch:{ all -> 0x0126 }
            if (r1 != 0) goto L_0x0015
            java.lang.String r0 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r1 = "downloadWepkg, wepkgVersion is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x0126 }
            monitor-exit(r15)
            return
        L_0x0015:
            java.lang.String r2 = r1.f120653f     // Catch:{ all -> 0x0126 }
            java.lang.String r2 = com.tencent.p014mm.plugin.wepkg.model.C44498h.m48864b(r0, r2)     // Catch:{ all -> 0x0126 }
            com.tencent.p014mm.plugin.wepkg.utils.C44536d.m48916b(r2)     // Catch:{ all -> 0x0126 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
            r3.<init>()     // Catch:{ all -> 0x0126 }
            r3.append(r2)     // Catch:{ all -> 0x0126 }
            java.lang.String r2 = "/package"
            r3.append(r2)     // Catch:{ all -> 0x0126 }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x0126 }
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)     // Catch:{ all -> 0x0126 }
            r3 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0069
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106456q(r4)     // Catch:{ all -> 0x0126 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = r1.f120660p     // Catch:{ all -> 0x0126 }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0126 }
            if (r2 == 0) goto L_0x0069
            java.lang.String r2 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r7 = "file exist in current %s version, pkgPath:%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0126 }
            java.lang.String r8 = r1.f120653f     // Catch:{ all -> 0x0126 }
            r3[r5] = r8     // Catch:{ all -> 0x0126 }
            r3[r6] = r4     // Catch:{ all -> 0x0126 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r3)     // Catch:{ all -> 0x0126 }
            ob3.a r2 = ob3.C47358a.C47360b.f127093a     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r1.f120661q     // Catch:{ all -> 0x0126 }
            r5 = 0
            r2.mo72410a(r0, r1, r5)     // Catch:{ all -> 0x0126 }
            if (r13 == 0) goto L_0x0067
            com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r1 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.OK     // Catch:{ all -> 0x0126 }
            r13.mo69236a(r0, r4, r1)     // Catch:{ all -> 0x0126 }
        L_0x0067:
            monitor-exit(r15)
            return
        L_0x0069:
            lb3.b r2 = lb3.C46840b.m52131Lo()     // Catch:{ all -> 0x0126 }
            lb3.a r2 = r2.mo72039jo(r0)     // Catch:{ all -> 0x0126 }
            if (r2 == 0) goto L_0x00e8
            java.lang.String r7 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r8 = "diff is not null, pkgId: %s"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0126 }
            r9[r5] = r0     // Catch:{ all -> 0x0126 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = r2.field_version     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)     // Catch:{ all -> 0x0126 }
            java.lang.String r8 = r1.f120653f     // Catch:{ all -> 0x0126 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0126 }
            if (r7 != 0) goto L_0x00a8
            java.lang.String r7 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r8 = "diff version is not equal to package version, pkgId: %s, diffVersion: %s, packageVersion: %s"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0126 }
            r9[r5] = r0     // Catch:{ all -> 0x0126 }
            java.lang.String r10 = r2.field_version     // Catch:{ all -> 0x0126 }
            r9[r6] = r10     // Catch:{ all -> 0x0126 }
            java.lang.String r10 = r1.f120653f     // Catch:{ all -> 0x0126 }
            r9[r3] = r10     // Catch:{ all -> 0x0126 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ all -> 0x0126 }
            lb3.b r3 = lb3.C46840b.m52131Lo()     // Catch:{ all -> 0x0126 }
            r3.mo72038c(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00e8
        L_0x00a8:
            java.lang.String r7 = r2.field_downloadUrl     // Catch:{ all -> 0x0126 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ all -> 0x0126 }
            if (r7 == 0) goto L_0x00c7
            java.lang.String r7 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r8 = "diff downloadurl is null, pkgId: %s, diffVersion: %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0126 }
            r3[r5] = r0     // Catch:{ all -> 0x0126 }
            java.lang.String r9 = r2.field_version     // Catch:{ all -> 0x0126 }
            r3[r6] = r9     // Catch:{ all -> 0x0126 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r3)     // Catch:{ all -> 0x0126 }
            lb3.b r3 = lb3.C46840b.m52131Lo()     // Catch:{ all -> 0x0126 }
            r3.mo72038c(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00e8
        L_0x00c7:
            java.lang.String r7 = r2.field_oldPath     // Catch:{ all -> 0x0126 }
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)     // Catch:{ all -> 0x0126 }
            if (r7 != 0) goto L_0x00e6
            java.lang.String r7 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r8 = "old package is not exists, pkgId: %s, oldPath: %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0126 }
            r3[r5] = r0     // Catch:{ all -> 0x0126 }
            java.lang.String r9 = r2.field_oldPath     // Catch:{ all -> 0x0126 }
            r3[r6] = r9     // Catch:{ all -> 0x0126 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r3)     // Catch:{ all -> 0x0126 }
            lb3.b r3 = lb3.C46840b.m52131Lo()     // Catch:{ all -> 0x0126 }
            r3.mo72038c(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00e8
        L_0x00e6:
            r0 = 1
            goto L_0x00e9
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            java.lang.String r3 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r7 = "downloadBigPackage, downloadDiff = %b"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0126 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0126 }
            r6[r5] = r8     // Catch:{ all -> 0x0126 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x010c
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0126 }
            r3 = 859(0x35b, float:1.204E-42)
            r4 = 22
            r0.mo175911u(r3, r4)     // Catch:{ all -> 0x0126 }
            com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$a r0 = new com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$a     // Catch:{ all -> 0x0126 }
            r0.<init>(r1, r2, r13)     // Catch:{ all -> 0x0126 }
            r15.mo69233d(r2, r0)     // Catch:{ all -> 0x0126 }
            goto L_0x0124
        L_0x010c:
            r2 = 1
            java.lang.String r3 = r1.f120651d     // Catch:{ all -> 0x0126 }
            java.lang.String r5 = ""
            java.lang.String r6 = r1.f120661q     // Catch:{ all -> 0x0126 }
            int r0 = r1.f120662r     // Catch:{ all -> 0x0126 }
            long r7 = (long) r0     // Catch:{ all -> 0x0126 }
            java.lang.String r9 = r1.f120653f     // Catch:{ all -> 0x0126 }
            java.lang.String r10 = ""
            java.lang.String r11 = r1.f120660p     // Catch:{ all -> 0x0126 }
            int r12 = r1.f120663s     // Catch:{ all -> 0x0126 }
            r1 = r15
            r13 = r17
            r1.mo69235f(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0126 }
        L_0x0124:
            monitor-exit(r15)
            return
        L_0x0126:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.mo69232c(java.lang.String, com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback):void");
    }

    /* renamed from: d */
    public final void mo69233d(C46839a aVar, IWepkgUpdateCallback iWepkgUpdateCallback) {
        C46839a aVar2 = aVar;
        String b = C44498h.m48864b(aVar2.field_pkgId, aVar2.field_version);
        C44536d.m48916b(b);
        mo69235f(3, aVar2.field_pkgId, b + "/diff", "", aVar2.field_downloadUrl, (long) aVar2.field_pkgSize, aVar2.field_version, aVar2.field_oldVersion, aVar2.field_md5, aVar2.field_downloadNetType, iWepkgUpdateCallback);
    }

    /* renamed from: e */
    public final void mo69234e(C86009m1 m1Var, String str, List<String> list) {
        C86009m1[] u;
        if (m1Var != null && m1Var.mo119967g()) {
            if (m1Var.mo119978p() && m1Var.getName().equals(str)) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(m1Var.mo119971i());
            } else if (m1Var.mo119977o() && (u = m1Var.mo119984u()) != null) {
                for (C86009m1 e : u) {
                    mo69234e(e, str, list);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d1, code lost:
        if (com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()) == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0224, code lost:
        if (((r3 >= 12 && r3 < 14) || (r3 != 14 ? !(r3 < 18 || r3 > 24) : r2.get(12) <= 30)) != false) goto L_0x01d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69235f(int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, long r30, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback r36) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            r15 = r29
            r11 = r30
            r7 = r32
            r13 = r34
            r2 = r35
            r14 = r36
            com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r10 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.CANCEL
            com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r3 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.OK
            java.lang.String r4 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r5 = "triggerDownloadWepkg, fileType:%s, pkgid:%s, downloadUrl:%s, pkgSize:%d, version:%s, md5:%s, downloadNetType:%d"
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r25)
            r9 = 0
            r6[r9] = r8
            r8 = 1
            r6[r8] = r0
            r9 = 2
            r6[r9] = r15
            java.lang.Long r17 = java.lang.Long.valueOf(r30)
            r8 = 3
            r6[r8] = r17
            r8 = 4
            r6[r8] = r7
            r19 = 5
            r6[r19] = r13
            java.lang.Integer r19 = java.lang.Integer.valueOf(r35)
            r20 = 6
            r6[r20] = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
            r4 = r25
            if (r4 != r9) goto L_0x0073
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.tencent.p014mm.plugin.wepkg.model.C44498h.m48864b(r0, r7)
            r5.append(r6)
            java.lang.String r6 = "/preload_files"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.plugin.wepkg.utils.C44536d.m48916b(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "/"
            r6.append(r5)
            r6.append(r13)
            java.lang.String r5 = r6.toString()
            r6 = r5
            goto L_0x0075
        L_0x0073:
            r6 = r27
        L_0x0075:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r8 = 0
            if (r5 == 0) goto L_0x0099
            java.lang.String r2 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r3 = "pkgPath:%s is null"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            ob3.a r2 = ob3.C47358a.C47360b.f127093a
            r2.mo72410a(r0, r15, r8)
            if (r14 == 0) goto L_0x0098
            java.lang.String r2 = ""
            com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode r3 = com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode.FAILED
            r14.mo69236a(r0, r2, r3)
        L_0x0098:
            return
        L_0x0099:
            boolean r5 = rd3.C48020a.m53385b(r6)
            if (r5 == 0) goto L_0x00c8
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106456q(r6)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x01ac
            java.lang.String r2 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r4 = "file exist in current %s version, pkgPath:%s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r10 = 0
            r5[r10] = r7
            r7 = 1
            r5[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r5)
            ob3.a r2 = ob3.C47358a.C47360b.f127093a
            r2.mo72410a(r0, r15, r8)
            if (r14 == 0) goto L_0x00c7
            r14.mo69236a(r0, r6, r3)
        L_0x00c7:
            return
        L_0x00c8:
            java.lang.String r5 = com.tencent.p014mm.plugin.wepkg.model.C44498h.m48863a(r26)
            boolean r21 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r21 != 0) goto L_0x01ac
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            r8.<init>((java.lang.String) r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r9 = ""
            if (r6 == 0) goto L_0x0134
            int r22 = r6.length()
            if (r22 > 0) goto L_0x00e7
            goto L_0x0134
        L_0x00e7:
            android.net.Uri r22 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r4 = r22.getPath()
            if (r4 == 0) goto L_0x010c
            r7 = 0
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r7, r7)
            java.lang.String r7 = r22.getPath()
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x010c
            android.net.Uri$Builder r7 = r22.buildUpon()
            android.net.Uri$Builder r4 = r7.path(r4)
            android.net.Uri r22 = r4.build()
        L_0x010c:
            java.lang.String r4 = r22.getPath()
            java.lang.String r7 = "/"
            int r7 = r4.lastIndexOf(r7)
            if (r7 >= 0) goto L_0x0119
            goto L_0x0121
        L_0x0119:
            r18 = 1
            int r7 = r7 + 1
            java.lang.String r4 = r4.substring(r7)
        L_0x0121:
            r7 = 46
            int r7 = r4.lastIndexOf(r7)
            if (r7 >= 0) goto L_0x012b
        L_0x0129:
            r9 = r4
            goto L_0x0134
        L_0x012b:
            if (r7 != 0) goto L_0x012e
            goto L_0x0134
        L_0x012e:
            r9 = 0
            java.lang.String r4 = r4.substring(r9, r7)
            goto L_0x0129
        L_0x0134:
            r1.mo69234e(r8, r9, r5)
            java.lang.String r4 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r7 = "local have the same file. size:%s"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            int r8 = r5.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r16 = 0
            r9[r16] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r9)
            java.util.Iterator r4 = r5.iterator()
        L_0x0151:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ac
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            r7.<init>((java.lang.String) r5)
            boolean r5 = r7.mo119978p()
            if (r5 == 0) goto L_0x01aa
            long r8 = r7.mo119980r()
            int r5 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x01aa
            java.lang.String r5 = r7.mo119976n()
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106456q(r5)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            boolean r5 = r5.equalsIgnoreCase(r13)
            if (r5 == 0) goto L_0x01aa
            java.lang.String r2 = r7.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r6)
            java.lang.String r2 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r4 = "file exist in other version path:%s, pkgPath:%s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r7 = r7.mo119971i()
            r8 = 0
            r5[r8] = r7
            r7 = 1
            r5[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r5)
            ob3.a r2 = ob3.C47358a.C47360b.f127093a
            r4 = 0
            r2.mo72410a(r0, r15, r4)
            if (r14 == 0) goto L_0x01a9
            r14.mo69236a(r0, r6, r3)
        L_0x01a9:
            return
        L_0x01aa:
            r5 = 2
            goto L_0x0151
        L_0x01ac:
            r3 = 1
            if (r2 == r3) goto L_0x0227
            r3 = 9
            if (r2 == r3) goto L_0x01d9
            r3 = 3
            if (r2 == r3) goto L_0x01bf
            r3 = 4
            if (r2 == r3) goto L_0x01bb
            goto L_0x0236
        L_0x01bb:
            r2 = 1
        L_0x01bc:
            r4 = 1
            goto L_0x0238
        L_0x01bf:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifiOr4G(r2)
            if (r2 != 0) goto L_0x01d6
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r2)
            if (r2 == 0) goto L_0x01d4
            goto L_0x01d6
        L_0x01d4:
            r4 = 0
            goto L_0x01d7
        L_0x01d6:
            r4 = 1
        L_0x01d7:
            r2 = r4
            goto L_0x01bc
        L_0x01d9:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r2)
            if (r2 == 0) goto L_0x01e4
        L_0x01e3:
            goto L_0x01d6
        L_0x01e4:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifiOr4G(r2)
            if (r2 != 0) goto L_0x01f8
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r2)
            if (r2 == 0) goto L_0x01d4
        L_0x01f8:
            java.lang.Object r2 = com.tencent.p014mm.plugin.wepkg.utils.C44536d.f120770a
            java.util.GregorianCalendar r2 = new java.util.GregorianCalendar
            r2.<init>()
            r3 = 11
            int r3 = r2.get(r3)
            r4 = 12
            int r2 = r2.get(r4)
            r5 = 14
            if (r3 < r4) goto L_0x0213
            if (r3 >= r5) goto L_0x0213
        L_0x0211:
            r4 = 1
            goto L_0x0224
        L_0x0213:
            if (r3 != r5) goto L_0x021a
            r3 = 30
            if (r2 > r3) goto L_0x0223
            goto L_0x0211
        L_0x021a:
            r2 = 18
            if (r3 < r2) goto L_0x0223
            r2 = 24
            if (r3 > r2) goto L_0x0223
            goto L_0x0211
        L_0x0223:
            r4 = 0
        L_0x0224:
            if (r4 == 0) goto L_0x01d4
            goto L_0x01e3
        L_0x0227:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r2)
            if (r2 == 0) goto L_0x0236
            r2 = 1
            r4 = 0
            r17 = 1
            goto L_0x023a
        L_0x0236:
            r2 = 0
            r4 = 0
        L_0x0238:
            r17 = 0
        L_0x023a:
            if (r4 == 0) goto L_0x0242
            ob3.a r3 = ob3.C47358a.C47360b.f127093a
            r3.mo72410a(r0, r15, r11)
            goto L_0x0249
        L_0x0242:
            ob3.a r3 = ob3.C47358a.C47360b.f127093a
            r4 = 0
            r3.mo72410a(r0, r15, r4)
        L_0x0249:
            java.lang.String r3 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r4 = "allowDownload:%s"
            r8 = 1
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r9 = 0
            r5[r9] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            if (r2 == 0) goto L_0x0307
            mb3.f r7 = new mb3.f
            byte[] r2 = r29.getBytes()
            java.lang.String r3 = p823sg.C90193h.m112878f(r2)
            mb3.a r5 = r1.f120588b
            r2 = r7
            r4 = r25
            r16 = r5
            r5 = r26
            r18 = r6
            r6 = r28
            r0 = r7
            r7 = r32
            r19 = 1
            r8 = r33
            r20 = 0
            r9 = r29
            r23 = r10
            r10 = r18
            r11 = r30
            r13 = r34
            r14 = r17
            r15 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15)
            mb3.c r2 = new mb3.c
            r2.<init>(r0)
            mb3.d r0 = mb3.C46983d.m52299a()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, mb3.c> r3 = r0.f126326a
            mb3.f r4 = r2.f126312d
            java.lang.String r4 = r4.f126328a
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L_0x02ce
            mb3.b r3 = mb3.C46981b.f126309b
            if (r3 != 0) goto L_0x02b9
            java.lang.Object r3 = mb3.C46981b.f126310c
            monitor-enter(r3)
            mb3.b r4 = mb3.C46981b.f126309b     // Catch:{ all -> 0x02b6 }
            if (r4 != 0) goto L_0x02b4
            mb3.b r4 = new mb3.b     // Catch:{ all -> 0x02b6 }
            r4.<init>()     // Catch:{ all -> 0x02b6 }
            mb3.C46981b.f126309b = r4     // Catch:{ all -> 0x02b6 }
        L_0x02b4:
            monitor-exit(r3)     // Catch:{ all -> 0x02b6 }
            goto L_0x02b9
        L_0x02b6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02b6 }
            throw r0
        L_0x02b9:
            mb3.b r3 = mb3.C46981b.f126309b
            mb3.h r3 = r3.f126311a
            java.util.concurrent.Future r3 = r3.submit(r2)
            r2.f126313e = r3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, mb3.c> r0 = r0.f126326a
            mb3.f r3 = r2.f126312d
            java.lang.String r3 = r3.f126328a
            r0.put(r3, r2)
            r9 = 1
            goto L_0x02cf
        L_0x02ce:
            r9 = 0
        L_0x02cf:
            if (r9 == 0) goto L_0x02f9
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback> r0 = r1.f120587a
            byte[] r2 = r29.getBytes()
            java.lang.String r2 = p823sg.C90193h.m112878f(r2)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r3 = r36
            r0.put(r2, r3)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 859(0x35b, double:4.244E-321)
            r4 = 0
            r6 = 1
            r8 = 0
            r25 = r0
            r26 = r2
            r28 = r4
            r30 = r6
            r32 = r8
            r25.idkeyStat(r26, r28, r30, r32)
            goto L_0x0318
        L_0x02f9:
            r3 = r36
            if (r3 == 0) goto L_0x0318
            java.lang.String r0 = ""
            r2 = r26
            r4 = r23
            r3.mo69236a(r2, r0, r4)
            goto L_0x0318
        L_0x0307:
            r2 = r0
            r4 = r10
            r3 = r14
            java.lang.String r0 = "MicroMsg.Wepkg.WepkgDownloader"
            java.lang.String r5 = "net is not match, dont download"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            if (r3 == 0) goto L_0x0318
            java.lang.String r0 = ""
            r3.mo69236a(r2, r0, r4)
        L_0x0318:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.mo69235f(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, int, com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback):void");
    }
}
