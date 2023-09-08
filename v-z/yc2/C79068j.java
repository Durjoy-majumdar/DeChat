package yc2;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: yc2.j */
public final class C79068j {

    /* renamed from: a */
    public static String[] f232188a = {m95632a(MMApplicationContext.getContext().getFilesDir().getParent() + "/dumeq/tekcos/ved/"), m95632a(MMApplicationContext.getContext().getFilesDir().getParent() + "/epip_umeq/ved/")};

    /* renamed from: b */
    public static String[] f232189b;

    /* renamed from: c */
    public static String[] f232190c = {m95632a(MMApplicationContext.getContext().getFilesDir().getParent() + "/os.umeq_gubed_collam_cbil/bil/metsys/"), m95632a(MMApplicationContext.getContext().getFilesDir().getParent() + "/ecart_umeq/sys/"), m95632a(MMApplicationContext.getContext().getFilesDir().getParent() + "/sporp-umeq/nib/metsys/")};

    /* renamed from: d */
    public static boolean f232191d;

    /* renamed from: e */
    public static boolean f232192e;

    /* renamed from: f */
    public static boolean f232193f;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0138 A[Catch:{ IOException -> 0x013b }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0154 A[EDGE_INSN: B:39:0x0154->B:31:0x0154 ?: BREAK  , SYNTHETIC] */
    static {
        /*
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r3 = r3.getParent()
            r2.append(r3)
            java.lang.String r3 = "/dumeq/tekcos/ved/"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = m95632a(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r4 = r4.getFilesDir()
            java.lang.String r4 = r4.getParent()
            r2.append(r4)
            java.lang.String r4 = "/epip_umeq/ved/"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = m95632a(r2)
            r4 = 1
            r1[r4] = r2
            f232188a = r1
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r5 = r5.getFilesDir()
            java.lang.String r5 = r5.getParent()
            r2.append(r5)
            java.lang.String r5 = "/hsifdlog"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = m95632a(r2)
            r1[r3] = r2
            f232189b = r1
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r5 = r5.getFilesDir()
            java.lang.String r5 = r5.getParent()
            r2.append(r5)
            java.lang.String r5 = "/os.umeq_gubed_collam_cbil/bil/metsys/"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = m95632a(r2)
            r1[r3] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r5 = r5.getFilesDir()
            java.lang.String r5 = r5.getParent()
            r2.append(r5)
            java.lang.String r5 = "/ecart_umeq/sys/"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = m95632a(r2)
            r1[r4] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r5 = r5.getFilesDir()
            java.lang.String r5 = r5.getParent()
            r2.append(r5)
            java.lang.String r5 = "/sporp-umeq/nib/metsys/"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = m95632a(r2)
            r1[r0] = r2
            f232190c = r1
            f232191d = r3
            f232192e = r3
            f232193f = r3
            java.lang.String[] r0 = f232188a
            int r1 = r0.length
            r2 = 0
        L_0x00ec:
            if (r2 >= r1) goto L_0x0101
            r5 = r0[r2]
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            boolean r5 = r6.exists()
            if (r5 == 0) goto L_0x00fe
            f232191d = r4
            goto L_0x0101
        L_0x00fe:
            int r2 = r2 + 1
            goto L_0x00ec
        L_0x0101:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/tty/drivers"
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0154
            boolean r1 = r0.canRead()
            if (r1 == 0) goto L_0x0154
            long r1 = r0.length()
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0154
            long r1 = r0.length()
            int r2 = (int) r1
            byte[] r1 = new byte[r2]
            r2 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0135 }
            r5.<init>(r0)     // Catch:{ all -> 0x0135 }
            r5.read(r1)     // Catch:{ all -> 0x0132 }
            r5.close()     // Catch:{ IOException -> 0x013b }
            goto L_0x013b
        L_0x0132:
            r2 = r5
            goto L_0x0136
        L_0x0135:
        L_0x0136:
            if (r2 == 0) goto L_0x013b
            r2.close()     // Catch:{ IOException -> 0x013b }
        L_0x013b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            java.lang.String[] r1 = f232189b
            int r2 = r1.length
            r5 = 0
        L_0x0144:
            if (r5 >= r2) goto L_0x0154
            r6 = r1[r5]
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x0151
            f232192e = r4
            goto L_0x0154
        L_0x0151:
            int r5 = r5 + 1
            goto L_0x0144
        L_0x0154:
            java.lang.String[] r0 = f232190c
            int r1 = r0.length
        L_0x0157:
            if (r3 >= r1) goto L_0x016c
            r2 = r0[r3]
            java.io.File r5 = new java.io.File
            r5.<init>(r2)
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x0169
            f232193f = r4
            goto L_0x016c
        L_0x0169:
            int r3 = r3 + 1
            goto L_0x0157
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yc2.C79068j.<clinit>():void");
    }

    /* renamed from: a */
    public static String m95632a(String str) {
        String[] strArr = {MMApplicationContext.getContext().getFilesDir().getParent(), str, C79068j.class.toString()};
        return new StringBuilder(strArr[1].substring(strArr[0].length() + 1)).reverse().toString();
    }
}
