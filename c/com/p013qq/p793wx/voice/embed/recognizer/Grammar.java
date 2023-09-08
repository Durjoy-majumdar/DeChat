package com.p013qq.p793wx.voice.embed.recognizer;

import com.tencent.p014mm.plugin.appbrand.appstorage.ZipJNI;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.xweb.WCWebUpdater;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import p820q9.C47780a;
import p820q9.C47784d;
import p820q9.C89579f;

/* renamed from: com.qq.wx.voice.embed.recognizer.Grammar */
public class Grammar {
    public static String mData;
    public static String mDataPath;
    public static String mSo;

    /* renamed from: a */
    private C89579f f107223a;

    /* renamed from: b */
    private C47780a f107224b;

    /* renamed from: c */
    private boolean f107225c;

    /* renamed from: d */
    private boolean f107226d;

    /* renamed from: e */
    private ArrayList f107227e;

    public Grammar() {
        this.f107223a = null;
        this.f107224b = new C47780a();
        this.f107225c = false;
        this.f107226d = false;
        this.f107227e = null;
        this.f107223a = new C89579f();
    }

    /* renamed from: a */
    private String m42798a() {
        for (int i = 0; i < this.f107227e.size(); i++) {
            ((C47784d) this.f107227e.get(i)).f128315d = m42799a(((C47784d) this.f107227e.get(i)).f128312a);
            ((C47784d) this.f107227e.get(i)).f128316e = m42799a(((C47784d) this.f107227e.get(i)).f128313b);
            ((C47784d) this.f107227e.get(i)).f128317f = m42799a(((C47784d) this.f107227e.get(i)).f128314c);
        }
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i2 = 0; i2 < this.f107227e.size(); i2++) {
            String str = ((C47784d) this.f107227e.get(i2)).f128315d;
            if (!str.isEmpty()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(str);
            }
            String str2 = ((C47784d) this.f107227e.get(i2)).f128316e;
            if (!str2.isEmpty()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(str2);
            }
            String str3 = ((C47784d) this.f107227e.get(i2)).f128317f;
            if (!str3.isEmpty()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(str3);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static String m42799a(String str) {
        return new String(str).replaceAll("[^(a-zA-Z0-9\\u4e00-\\u9fa5)]", "").replaceAll("0", "零").replaceAll("1", "一").replaceAll("2", "二").replaceAll("3", "三").replaceAll(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, "四").replaceAll(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "五").replaceAll(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "六").replaceAll("7", "七").replaceAll("8", "八").replaceAll("9", "九");
    }

    public int begin() {
        return GrammarNative.begin();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r0 < 0) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int checkFiles(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            boolean r0 = r8.f107225c
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            if (r9 == 0) goto L_0x00f5
            if (r10 == 0) goto L_0x00f5
            if (r11 == 0) goto L_0x00f5
            if (r12 != 0) goto L_0x0010
            goto L_0x00f5
        L_0x0010:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            r3 = 1
            java.lang.String r4 = "libwxvoiceembed.bin"
            java.lang.String r5 = "libwxvoiceembed.so"
            if (r0 < r2) goto L_0x0026
            q9.f r0 = r8.f107223a
            java.lang.String r2 = "/vendor/lib/"
            int r0 = r0.mo123888a(r2, r11, r12)
            if (r0 >= 0) goto L_0x00e5
            goto L_0x0038
        L_0x0026:
            java.lang.String r0 = "/system/lib"
            int r0 = r10.compareTo(r0)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "/system/lib/"
            int r0 = r10.compareTo(r0)
            if (r0 != 0) goto L_0x0038
            goto L_0x00df
        L_0x0038:
            q9.f r0 = r8.f107223a
            boolean r2 = r0.f257777a
            if (r2 == 0) goto L_0x0041
        L_0x003e:
            r0 = 0
            goto L_0x00e5
        L_0x0041:
            boolean r2 = p820q9.C89579f.m112005b(r5, r10)
            if (r2 != 0) goto L_0x004d
            r9 = -201(0xffffffffffffff37, float:NaN)
            r0 = -201(0xffffffffffffff37, float:NaN)
            goto L_0x00e5
        L_0x004d:
            boolean r2 = p820q9.C89579f.m112005b(r4, r10)
            if (r2 != 0) goto L_0x0059
            r9 = -202(0xffffffffffffff36, float:NaN)
            r0 = -202(0xffffffffffffff36, float:NaN)
            goto L_0x00e5
        L_0x0059:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.io.File r9 = r9.getFilesDir()
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r2.<init>(r9)
            java.lang.String r9 = "/NamesSearch/"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r9)
            boolean r6 = r2.exists()
            if (r6 != 0) goto L_0x0081
            r2.mkdirs()
        L_0x0081:
            boolean r2 = p820q9.C89579f.m112005b(r5, r9)
            if (r2 != 0) goto L_0x008a
            p820q9.C89579f.m112008e(r5, r10, r9)
        L_0x008a:
            boolean r2 = p820q9.C89579f.m112005b(r4, r9)
            if (r2 != 0) goto L_0x0093
            p820q9.C89579f.m112008e(r4, r10, r9)
        L_0x0093:
            r2 = -203(0xffffffffffffff35, float:NaN)
            java.lang.String r6 = p820q9.C89579f.m112007d(r5, r9)     // Catch:{ FileNotFoundException -> 0x00db }
            java.lang.String r7 = p820q9.C89579f.m112007d(r5, r10)     // Catch:{ FileNotFoundException -> 0x00db }
            int r7 = r6.compareTo(r7)
            if (r7 == 0) goto L_0x00a6
            p820q9.C89579f.m112008e(r5, r10, r9)
        L_0x00a6:
            java.lang.String r7 = ";"
            java.lang.String[] r11 = r11.split(r7)
            boolean r11 = p820q9.C89579f.m112006c(r6, r11)
            if (r11 != 0) goto L_0x00b3
            goto L_0x00dc
        L_0x00b3:
            r11 = -204(0xffffffffffffff34, float:NaN)
            java.lang.String r2 = p820q9.C89579f.m112007d(r4, r9)     // Catch:{ FileNotFoundException -> 0x00d7 }
            java.lang.String r6 = p820q9.C89579f.m112007d(r4, r10)     // Catch:{ FileNotFoundException -> 0x00d7 }
            int r6 = r2.compareTo(r6)
            if (r6 == 0) goto L_0x00c6
            p820q9.C89579f.m112008e(r4, r10, r9)
        L_0x00c6:
            java.lang.String[] r10 = r12.split(r7)
            boolean r10 = p820q9.C89579f.m112006c(r2, r10)
            if (r10 != 0) goto L_0x00d1
            goto L_0x00d8
        L_0x00d1:
            r0.f257778b = r9
            r0.f257777a = r3
            goto L_0x003e
        L_0x00d7:
        L_0x00d8:
            r0 = -204(0xffffffffffffff34, float:NaN)
            goto L_0x00e5
        L_0x00db:
        L_0x00dc:
            r0 = -203(0xffffffffffffff35, float:NaN)
            goto L_0x00e5
        L_0x00df:
            q9.f r9 = r8.f107223a
            int r0 = r9.mo123888a(r10, r11, r12)
        L_0x00e5:
            if (r0 >= 0) goto L_0x00e8
            return r0
        L_0x00e8:
            q9.f r9 = r8.f107223a
            java.lang.String r9 = r9.f257778b
            mDataPath = r9
            mData = r4
            mSo = r5
            r8.f107225c = r3
            return r1
        L_0x00f5:
            r9 = -303(0xfffffffffffffed1, float:NaN)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p013qq.p793wx.voice.embed.recognizer.Grammar.checkFiles(android.content.Context, java.lang.String, java.lang.String, java.lang.String):int");
    }

    public int end() {
        return GrammarNative.end();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r5.f128309b = ((p820q9.C47784d) r4.f107227e.get(r0)).f128312a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getResult(p820q9.C47780a r5) {
        /*
            r4 = this;
            int r0 = com.p013qq.p793wx.voice.embed.recognizer.GrammarNative.getResult(r4)
            if (r0 >= 0) goto L_0x0007
            return r0
        L_0x0007:
            q9.a r0 = r4.f107224b
            java.lang.String r1 = r0.f128308a
            r5.f128308a = r1
            java.lang.String r0 = r0.f128309b
            r1 = 0
            if (r0 != 0) goto L_0x0016
            r0 = 0
            r5.f128309b = r0
            return r1
        L_0x0016:
            r0 = 0
        L_0x0017:
            java.util.ArrayList r2 = r4.f107227e
            int r2 = r2.size()
            if (r0 < r2) goto L_0x0020
            goto L_0x006b
        L_0x0020:
            java.util.ArrayList r2 = r4.f107227e
            java.lang.Object r2 = r2.get(r0)
            q9.d r2 = (p820q9.C47784d) r2
            java.lang.String r2 = r2.f128315d
            q9.a r3 = r4.f107224b
            java.lang.String r3 = r3.f128309b
            int r2 = r2.compareTo(r3)
            if (r2 != 0) goto L_0x0041
        L_0x0034:
            java.util.ArrayList r2 = r4.f107227e
            java.lang.Object r0 = r2.get(r0)
            q9.d r0 = (p820q9.C47784d) r0
            java.lang.String r0 = r0.f128312a
            r5.f128309b = r0
            goto L_0x006b
        L_0x0041:
            java.util.ArrayList r2 = r4.f107227e
            java.lang.Object r2 = r2.get(r0)
            q9.d r2 = (p820q9.C47784d) r2
            java.lang.String r2 = r2.f128316e
            q9.a r3 = r4.f107224b
            java.lang.String r3 = r3.f128309b
            int r2 = r2.compareTo(r3)
            if (r2 != 0) goto L_0x0056
            goto L_0x0034
        L_0x0056:
            java.util.ArrayList r2 = r4.f107227e
            java.lang.Object r2 = r2.get(r0)
            q9.d r2 = (p820q9.C47784d) r2
            java.lang.String r2 = r2.f128317f
            q9.a r3 = r4.f107224b
            java.lang.String r3 = r3.f128309b
            int r2 = r2.compareTo(r3)
            if (r2 != 0) goto L_0x006c
            goto L_0x0034
        L_0x006b:
            return r1
        L_0x006c:
            int r0 = r0 + 1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p013qq.p793wx.voice.embed.recognizer.Grammar.getResult(q9.a):int");
    }

    public int init(ArrayList arrayList) {
        if (this.f107226d) {
            return 0;
        }
        if (arrayList == null) {
            return -303;
        }
        try {
            System.load(String.valueOf(mDataPath) + "/" + mSo);
            this.f107227e = arrayList;
            try {
                if (GrammarNative.init(mDataPath.getBytes(), mData.getBytes(), m42798a().toString().getBytes("GBK")) < 0) {
                    return -101;
                }
                this.f107226d = true;
                return 0;
            } catch (UnsupportedEncodingException unused) {
                return -101;
            }
        } catch (Exception unused2) {
            return ExportErrorStatus.VIDEO_MUXER_ERROR;
        }
    }

    public void onGetResult(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null) {
            try {
                this.f107224b.f128308a = new String(bArr, "GBK");
            } catch (UnsupportedEncodingException unused) {
                return;
            }
        } else {
            this.f107224b.f128308a = null;
        }
        if (bArr3 != null) {
            this.f107224b.f128309b = new String(bArr3, "GBK");
            return;
        }
        this.f107224b.f128309b = null;
    }

    public int recognize(byte[] bArr, int i) {
        return GrammarNative.recognize(bArr, i);
    }

    public int update(ArrayList arrayList) {
        if (arrayList == null) {
            return -303;
        }
        this.f107227e = arrayList;
        try {
            if (GrammarNative.update(m42798a().getBytes("GBK")) < 0) {
                return ZipJNI.UNZ_ERR_OPEN_WRITE;
            }
            return 0;
        } catch (UnsupportedEncodingException unused) {
            return ZipJNI.UNZ_ERR_OPEN_WRITE;
        }
    }
}
