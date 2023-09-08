package h51;

import com.tencent.p014mm.plugin.downloader_app.search.DownloadSearchUI;
import ob0.l0$$e;

/* renamed from: h51.d */
public class C46011d implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ String f124079d;

    /* renamed from: e */
    public final /* synthetic */ DownloadSearchUI f124080e;

    public C46011d(DownloadSearchUI downloadSearchUI, String str) {
        this.f124080e = downloadSearchUI;
        this.f124079d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011d A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo1488a(int r17, int r18, java.lang.String r19, ob0.C47350c r20, ob0.C117747y r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.DownloadSearchUI"
            java.lang.String r6 = "errType = %d, errCode = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r2 = r0.f124080e
            boolean r3 = r2.f110410i
            if (r3 != 0) goto L_0x0178
            boolean r2 = r2.isFinishing()
            if (r2 == 0) goto L_0x0028
            goto L_0x0178
        L_0x0028:
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r2 = r0.f124080e
            android.widget.ProgressBar r2 = r2.f110406e
            r3 = 8
            r2.setVisibility(r3)
            if (r17 != 0) goto L_0x0176
            if (r18 != 0) goto L_0x0176
            r2 = r20
            ob0.c$d r2 = r2.f127056b
            pe3.a r2 = r2.f127083a
            u41.s r2 = (u41.C52439s) r2
            if (r2 == 0) goto L_0x0142
            u41.k r6 = r2.f146545e
            if (r6 == 0) goto L_0x0142
            java.util.LinkedList<u41.j> r6 = r6.f146524d
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)
            if (r6 != 0) goto L_0x0142
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            u41.k r2 = r2.f146545e
            java.util.LinkedList<u41.j> r2 = r2.f146524d
            java.util.Iterator r2 = r2.iterator()
            r7 = 0
        L_0x0059:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0122
            java.lang.Object r8 = r2.next()
            u41.j r8 = (u41.C52430j) r8
            java.lang.String r9 = r0.f124079d
            if (r8 != 0) goto L_0x006c
        L_0x0069:
            r10 = 0
            goto L_0x0114
        L_0x006c:
            h51.e r11 = new h51.e
            r11.<init>()
            r12 = 3
            r11.f124081a = r12
            u41.e r13 = r8.f146522d
            if (r13 != 0) goto L_0x0079
            goto L_0x0069
        L_0x0079:
            v41.k r14 = r13.f146512d
            u41.d r13 = r13.f146514f
            if (r13 == 0) goto L_0x0083
            java.lang.String r13 = r13.f146511d
            r11.f124089i = r13
        L_0x0083:
            if (r14 != 0) goto L_0x0086
            goto L_0x0069
        L_0x0086:
            v41.d r13 = r14.f147400d
            v41.e r15 = r14.f147401e
            v41.g r14 = r14.f147402f
            if (r13 != 0) goto L_0x008f
            goto L_0x0069
        L_0x008f:
            int r10 = r13.f147373i
            if (r10 == 0) goto L_0x0094
            goto L_0x0069
        L_0x0094:
            java.lang.String r10 = r13.f147368d
            r11.f124084d = r10
            java.lang.String r8 = r8.f146523e
            r11.f124085e = r8
            java.lang.String r8 = r13.f147370f
            r11.f124086f = r8
            int r8 = r13.f147372h
            r11.f124096p = r8
            if (r15 == 0) goto L_0x00b2
            java.util.LinkedList<java.lang.String> r8 = r15.f147377e
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r8)
            if (r8 != 0) goto L_0x00b2
            java.util.LinkedList<java.lang.String> r8 = r15.f147377e
            r11.f124087g = r8
        L_0x00b2:
            if (r14 == 0) goto L_0x00c0
            v41.c r8 = r14.f147385d
            if (r8 == 0) goto L_0x00c0
            java.lang.String r10 = r8.f147350e
            r11.f124097q = r10
            long r3 = r8.f147351f
            r11.f124088h = r3
        L_0x00c0:
            r11.f124082b = r9
            r11.f124083c = r5
            if (r14 == 0) goto L_0x0113
            v41.c r3 = r14.f147385d
            if (r3 == 0) goto L_0x0113
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            v41.c r4 = r14.f147385d
            java.lang.String r4 = r4.f147350e
            android.content.pm.PackageInfo r3 = js0.C9512b.m9207a(r3, r4)
            java.lang.String r4 = r11.f124084d
            z41.a r4 = com.tencent.p014mm.plugin.downloader.model.C40933j.m44315d(r4)
            if (r3 != 0) goto L_0x00f0
            if (r4 == 0) goto L_0x00fd
            int r3 = r4.field_status
            if (r3 != r12) goto L_0x00fd
            java.lang.String r3 = r4.field_filePath
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r3 == 0) goto L_0x00fd
            r3 = 4
            r11.f124083c = r3
            goto L_0x00fd
        L_0x00f0:
            int r3 = r3.versionCode
            v41.c r4 = r14.f147385d
            int r4 = r4.f147354i
            if (r3 >= r4) goto L_0x00fb
            r11.f124083c = r12
            goto L_0x00fd
        L_0x00fb:
            r11.f124083c = r1
        L_0x00fd:
            v41.c r3 = r14.f147385d
            java.lang.String r4 = r3.f147364v
            r11.f124091k = r4
            java.lang.String r4 = r3.f147367y
            r11.f124092l = r4
            java.lang.String r4 = r3.f147361s
            r11.f124093m = r4
            java.lang.String r4 = r3.f147365w
            r11.f124094n = r4
            java.lang.String r3 = r3.f147366x
            r11.f124095o = r3
        L_0x0113:
            r10 = r11
        L_0x0114:
            if (r10 == 0) goto L_0x011d
            int r7 = r7 + 1
            r10.f124090j = r7
            r6.add(r10)
        L_0x011d:
            r3 = 8
            r4 = 0
            goto L_0x0059
        L_0x0122:
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r1 = r0.f124080e
            android.widget.TextView r1 = r1.f110407f
            r2 = 8
            r1.setVisibility(r2)
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r1 = r0.f124080e
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView r1 = r1.f110405d
            r1.mo64051G1(r6)
            r7 = 13
            r8 = 1303(0x517, float:1.826E-42)
            r9 = 0
            r10 = 1
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            g51.C45880a.m51163b(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0176
        L_0x0142:
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r1 = r0.f124080e
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView r1 = r1.f110405d
            r2 = 8
            r1.setVisibility(r2)
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r1 = r0.f124080e
            android.widget.TextView r1 = r1.f110407f
            r2 = 0
            r1.setVisibility(r2)
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r1 = r0.f124080e
            android.widget.TextView r3 = r1.f110407f
            r4 = 2131824764(0x7f11107c, float:1.9282365E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r0.f124079d
            r5[r2] = r6
            java.lang.String r1 = r1.getString(r4, r5)
            r3.setText(r1)
            r4 = 13
            r5 = 1304(0x518, float:1.827E-42)
            r6 = 0
            r7 = 1
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            g51.C45880a.m51163b(r4, r5, r6, r7, r8, r9, r10)
        L_0x0176:
            r1 = 0
            return r1
        L_0x0178:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h51.C46011d.mo1488a(int, int, java.lang.String, ob0.c, ob0.y):int");
    }
}
