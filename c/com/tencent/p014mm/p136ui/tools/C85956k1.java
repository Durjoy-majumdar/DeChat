package com.tencent.p014mm.p136ui.tools;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.p136ui.tools.ShareImgUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tencent.mm.ui.tools.k1 */
public class C85956k1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f250349d;

    /* renamed from: e */
    public final /* synthetic */ ShareImgUI.C85946h f250350e;

    /* renamed from: f */
    public final /* synthetic */ long f250351f;

    /* renamed from: g */
    public final /* synthetic */ ShareImgUI f250352g;

    /* renamed from: com.tencent.mm.ui.tools.k1$a */
    public class C85957a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ConcurrentLinkedQueue f250353d;

        /* renamed from: e */
        public final /* synthetic */ Parcelable f250354e;

        /* renamed from: f */
        public final /* synthetic */ boolean[] f250355f;

        /* renamed from: g */
        public final /* synthetic */ CountDownLatch f250356g;

        public C85957a(ConcurrentLinkedQueue concurrentLinkedQueue, Parcelable parcelable, boolean[] zArr, CountDownLatch countDownLatch) {
            this.f250353d = concurrentLinkedQueue;
            this.f250354e = parcelable;
            this.f250355f = zArr;
            this.f250356g = countDownLatch;
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x012d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                com.tencent.mm.ui.tools.k1 r0 = com.tencent.p014mm.p136ui.tools.C85956k1.this
                com.tencent.mm.ui.tools.ShareImgUI r0 = r0.f250352g
                java.util.concurrent.ConcurrentLinkedQueue r1 = r11.f250353d
                android.os.Parcelable r2 = r11.f250354e
                int r3 = com.tencent.p014mm.p136ui.tools.ShareImgUI.f250317u
                r0.getClass()
                java.lang.String r3 = "MicroMsg.ShareImgUI"
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0121
                boolean r6 = r2 instanceof android.net.Uri
                if (r6 != 0) goto L_0x0019
                goto L_0x0121
            L_0x0019:
                android.net.Uri r2 = (android.net.Uri) r2
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isUriSafeToBeCopySrc(r2)
                if (r6 == 0) goto L_0x010b
                java.lang.String r6 = r2.getScheme()
                if (r6 == 0) goto L_0x010b
                r6 = 30
                boolean r6 = p206nj.C11171e.m11046c(r6)
                if (r6 != 0) goto L_0x004b
                boolean r6 = com.tencent.p014mm.sdk.vendor.Huawei.ifOnlyHUAWEI()
                if (r6 != 0) goto L_0x003d
                com.tencent.mm.sdk.vendor.Honor r6 = com.tencent.p014mm.sdk.vendor.Honor.INSTANCE
                boolean r6 = r6.ifHONOR()
                if (r6 == 0) goto L_0x0046
            L_0x003d:
                r6 = 29
                boolean r6 = p206nj.C11171e.m11046c(r6)
                if (r6 == 0) goto L_0x0046
                goto L_0x004b
            L_0x0046:
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r0, r2)
                goto L_0x00a4
            L_0x004b:
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r0, r2)
                if (r6 == 0) goto L_0x00a4
                android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
                r8 = 0
                java.lang.String r9 = r7.getPath()
                if (r9 == 0) goto L_0x0076
                java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r5, r5)
                java.lang.String r10 = r7.getPath()
                boolean r10 = r10.equals(r9)
                if (r10 != 0) goto L_0x0076
                android.net.Uri$Builder r7 = r7.buildUpon()
                android.net.Uri$Builder r7 = r7.path(r9)
                android.net.Uri r7 = r7.build()
            L_0x0076:
                com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r7 = r9.mo177799l(r7, r8)
                boolean r8 = r7.mo177810a()
                if (r8 != 0) goto L_0x0084
                r7 = 0
                goto L_0x009e
            L_0x0084:
                com.tencent.mm.vfs.FileSystem$c r8 = r7.f348991a
                java.lang.String r9 = r7.f348992b
                java.lang.String r9 = r8.mo119947w(r9, r5)
                if (r9 == 0) goto L_0x0098
                java.io.File r7 = new java.io.File
                r7.<init>(r9)
                boolean r7 = r7.canRead()
                goto L_0x009e
            L_0x0098:
                java.lang.String r7 = r7.f348992b
                boolean r7 = r8.mo119948x(r7)
            L_0x009e:
                if (r7 != 0) goto L_0x00a4
                java.lang.String r6 = r2.toString()
            L_0x00a4:
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.String r8 = r2.toString()
                r7[r5] = r8
                r7[r4] = r6
                r8 = 2
                int r9 = android.os.Build.VERSION.SDK_INT
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r7[r8] = r9
                java.lang.String r8 = "multiSend uri: %s, original filePath: %s version:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r7)
                java.lang.String r6 = ud3.C90646e.m113615d(r6)
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r7 != 0) goto L_0x0105
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isImageFilename(r6)
                if (r7 == 0) goto L_0x00f0
                boolean r7 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImgFile(r6)
                if (r7 == 0) goto L_0x00f0
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "multisend file path: "
                r7.append(r8)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
                java.lang.String r0 = r0.mo119845Q7(r6, r2)
                r1.add(r0)
                r0 = 1
                goto L_0x012b
            L_0x00f0:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "multisend tries to send illegal img: "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                goto L_0x012a
            L_0x0105:
                java.lang.String r0 = "[-] getMultiSendFilePath : fail, filePath is null."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                goto L_0x012a
            L_0x010b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "unaccepted uri: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                goto L_0x012a
            L_0x0121:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r5] = r2
                java.lang.String r1 = "getMultiSendFilePath failed, error parcelable, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r1, r0)
            L_0x012a:
                r0 = 0
            L_0x012b:
                if (r0 != 0) goto L_0x0131
                boolean[] r0 = r11.f250355f
                r0[r5] = r4
            L_0x0131:
                java.util.concurrent.CountDownLatch r0 = r11.f250356g
                r0.countDown()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.C85956k1.C85957a.run():void");
        }
    }

    public C85956k1(ShareImgUI shareImgUI, Bundle bundle, ShareImgUI.C85946h hVar, long j) {
        this.f250352g = shareImgUI;
        this.f250349d = bundle;
        this.f250350e = hVar;
        this.f250351f = j;
    }

    public void run() {
        ArrayList parcelableArrayList = this.f250349d.getParcelableArrayList("android.intent.extra.STREAM");
        ArrayList arrayList = null;
        if (parcelableArrayList == null || parcelableArrayList.size() <= 0) {
            Log.m105920e("MicroMsg.ShareImgUI", "getParcelableArrayList failed");
            ShareImgUI.m106255M7(this.f250352g, this.f250350e, (ArrayList) null);
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(parcelableArrayList.size());
        boolean[] zArr = {false};
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            String obj = parcelable != null ? parcelable.toString() : "null";
            C85957a aVar = r1;
            C85957a aVar2 = new C85957a(concurrentLinkedQueue, parcelable, zArr, countDownLatch);
            ThreadPool.post(aVar, "getMultiSendFilePathListItem" + obj);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            Log.printErrStackTrace("MicroMsg.ShareImgUI", e, "hy: timeout when getmulti", new Object[0]);
            ShareImgUI.m106255M7(this.f250352g, this.f250350e, (ArrayList) null);
        }
        ArrayList arrayList2 = new ArrayList(concurrentLinkedQueue);
        if (zArr[0]) {
            Log.m105918d("MicroMsg.ShareImgUI", "hy: has non path img");
            ShareImgUI.m106255M7(this.f250352g, this.f250350e, (ArrayList) null);
            return;
        }
        Log.m105925i("MicroMsg.ShareImgUI", "hy: getMultiSendFilePathList done. using: %d ms", Long.valueOf(System.currentTimeMillis() - this.f250351f));
        ShareImgUI shareImgUI = this.f250352g;
        ShareImgUI.C85946h hVar = this.f250350e;
        if (arrayList2.size() > 0) {
            arrayList = arrayList2;
        }
        ShareImgUI.m106255M7(shareImgUI, hVar, arrayList);
    }
}
