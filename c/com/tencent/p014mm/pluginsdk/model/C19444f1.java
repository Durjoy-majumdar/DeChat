package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.FileReaderHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p262wm.C22921c;
import p262wm.C22923f;
import p262wm.C53187e;

/* renamed from: com.tencent.mm.pluginsdk.model.f1 */
public class C19444f1 extends C19446g1 implements C53187e {

    /* renamed from: a */
    public static final String[] f54906a = {"application/msword", "application/vnd.ms-powerpoint", "application/vnd.ms-excel", "application/pdf", "application/epub+zip", "text/plain", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/zip", "application/rar", "*/ofd"};

    /* renamed from: b */
    public static final List<String> f54907b = Arrays.asList(new String[]{"application/pdf", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"});

    /* renamed from: c */
    public static Set<String> f54908c;

    /* renamed from: d */
    public static final String[] f54909d = {"application/msword", "application/vnd.ms-powerpoint", "application/vnd.ms-excel", "application/pdf", "application/epub+zip", "text/plain", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/zip", "application/rar", "*/ofd", "application/ofd", "application/ms-word", "application/vnd.ms-word", "application/kswps", "application/kset", "application/wps", "application/wpss", "application/et", "application/ets", "application/wpt", "application/ett", "application/dwg", "application/x-dwg", "application/acad", "image/vnd.dwg", "image/x-dwg", "text/csv", "text/comma-separated-values", "video/*", MimeTypes.APPLICATION_MP4, "*/rmvb", "*/avi", "*/mkv", "application/mpeg*", "application/vnd.rn-realmedia*", "application/3gpp*", "application/vnd.3gp*", "application/x-chm", "application/xslt+xml", "text/xml", "application/xml", "text/rtf", "application/rtf", "text/json", "application/json", "text/xsl", "application/xhtml+xml", "text/html", MimeTypes.AUDIO_MPEG, "audio/x-mpeg", MimeTypes.AUDIO_MP4, "audio/x-wav", MimeTypes.AUDIO_FLAC, "audio/x-flac", "audio/x-ape", "application/flac", "application/x-flac", "audio/x-ms-wma", "audio/amr", "audio/aac", "audio/AMR", "audio/mid", "audio/midi", "audio/ogg", "audio/x-realaudio", "audio/x-pn-realaudio", MimeTypes.AUDIO_AMR_NB, "audio/m4a", "*/mp3", "application/ogg", "image/gif", "image/jpeg", "image/png", "image/tif", "image/tiff", "image/bmp", "image/webp", "application/x-rar-compressed", "application/x-7z-compressed", "application/7z", "application/x-gzip", "application/gzip", "application/x-bzip2", "application/x-gtar", "application/x-tar", "application/vnd.android.package-archive", "application/apk", "application/apk.1", "application/apk.1.1", "application/apk.1.1.1", "application/apk.1.1.1.1", "application/apk.1.1.1.1.1", "*/apk.1", "*/apk.1.1", "*/apk.1.1.1", "*/apk.1.1.1.1", "*/apk.1.1.1.1.1", "*/dwg", "*/et", "*/wps", "*/mp4", "*/wpt", "*/rmvb", "*/mpeg", "*/chm", "*/avi", "*/3gp", "*/gzip", "*/bzip2", MimeTypes.VIDEO_MP4, "*/gtar", "*/gz", "*/bz2", "*/tar.gz"};

    /* renamed from: e */
    public static Set<String> f54910e;

    /* renamed from: f */
    public static Map<String, Integer> f54911f;

    /* renamed from: g */
    public static Map<String, String> f54912g;

    /* renamed from: h */
    public static final int[] f54913h = {C0966R.raw.app_attach_file_icon_word, C0966R.raw.app_attach_file_icon_ppt, C0966R.raw.app_attach_file_icon_excel, C0966R.raw.app_attach_file_icon_pdf, C0966R.raw.app_attach_file_icon_epub, C0966R.raw.app_attach_file_icon_txt, C0966R.raw.app_attach_file_icon_word, C0966R.raw.app_attach_file_icon_excel, C0966R.raw.app_attach_file_icon_ppt, C0966R.raw.app_attach_file_icon_rar, C0966R.raw.app_attach_file_icon_rar, C0966R.raw.app_attach_file_icon_ofd};

    /* renamed from: i */
    public static final int[] f54914i = {C0966R.raw.app_attach_file_icon_word, C0966R.raw.app_attach_file_icon_ppt, C0966R.raw.app_attach_file_icon_excel, C0966R.raw.app_attach_file_icon_pdf, C0966R.raw.app_attach_file_icon_epub, C0966R.raw.app_attach_file_icon_txt, C0966R.raw.app_attach_file_icon_word, C0966R.raw.app_attach_file_icon_excel, C0966R.raw.app_attach_file_icon_ppt, C0966R.raw.app_attach_file_icon_rar, C0966R.raw.app_attach_file_icon_rar, C0966R.raw.app_attach_file_icon_ofd};

    /* renamed from: j */
    public static final int[] f54915j = {C0966R.raw.app_attach_file_icon_word, C0966R.raw.app_attach_file_icon_ppt, C0966R.raw.app_attach_file_icon_excel, C0966R.raw.app_attach_file_icon_pdf, C0966R.raw.app_attach_file_icon_epub, C0966R.raw.app_attach_file_icon_txt_dark, C0966R.raw.app_attach_file_icon_word, C0966R.raw.app_attach_file_icon_excel, C0966R.raw.app_attach_file_icon_ppt, C0966R.raw.app_attach_file_icon_rar, C0966R.raw.app_attach_file_icon_rar, C0966R.raw.app_attach_file_icon_ofd};

    /* renamed from: k */
    public static final int[] f54916k = {C0966R.raw.app_attach_file_icon_word_simple, C0966R.raw.app_attach_file_icon_ppt_simple, C0966R.raw.app_attach_file_icon_excel_simple, C0966R.raw.app_attach_file_icon_pdf_simple, C0966R.raw.app_attach_file_icon_epub_simple, C0966R.raw.app_attach_file_icon_simple, C0966R.raw.app_attach_file_icon_word_simple, C0966R.raw.app_attach_file_icon_excel_simple, C0966R.raw.app_attach_file_icon_ppt_simple, C0966R.raw.app_attach_file_icon_rar_simple, C0966R.raw.app_attach_file_icon_rar_simple, C0966R.raw.app_attach_file_icon_ofd_simple};

    /* renamed from: l */
    public static final int[] f54917l = {C0966R.raw.app_attach_file_icon_word_simple, C0966R.raw.app_attach_file_icon_ppt_simple, C0966R.raw.app_attach_file_icon_excel_simple, C0966R.raw.app_attach_file_icon_pdf_simple, C0966R.raw.app_attach_file_icon_epub_simple, C0966R.raw.app_attach_file_icon_simple_dark, C0966R.raw.app_attach_file_icon_word_simple, C0966R.raw.app_attach_file_icon_excel_simple, C0966R.raw.app_attach_file_icon_ppt_simple, C0966R.raw.app_attach_file_icon_rar_simple, C0966R.raw.app_attach_file_icon_rar_simple, C0966R.raw.app_attach_file_icon_ofd_simple};

    static {
        HashSet hashSet = new HashSet();
        f54908c = hashSet;
        hashSet.add("application/pdf");
        f54908c.add("application/msword");
        f54908c.add("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        f54908c.add("application/vnd.ms-excel");
        f54908c.add("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        f54908c.add("application/vnd.ms-powerpoint");
        f54908c.add("application/vnd.openxmlformats-officedocument.presentationml.presentation");
        HashSet hashSet2 = new HashSet();
        f54910e = hashSet2;
        hashSet2.add("application/pdf");
        f54910e.add("application/msword");
        f54910e.add("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        f54910e.add("application/vnd.ms-excel");
        f54910e.add("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        f54910e.add("application/vnd.ms-powerpoint");
        f54910e.add("application/vnd.openxmlformats-officedocument.presentationml.presentation");
        f54910e.add(MimeTypes.AUDIO_MPEG);
        f54910e.add("text/plain");
        HashMap hashMap = new HashMap();
        f54911f = hashMap;
        hashMap.put("FROM_SCENE_BOTTOM_BAR", 10210);
        f54911f.put("FROM_SCENE_HALF_DIALOG", 10251);
        f54911f.put("FROM_SCENE_OPEN_NO_OFFICE_FILE", 10261);
        f54911f.put("OTHER_APP_OPEN", 10254);
        f54911f.put("SEARCH_IN_FILE", 10253);
        HashMap hashMap2 = new HashMap();
        f54912g = hashMap2;
        hashMap2.put("FROM_SCENE_BOTTOM_BAR", "https://upage.imtt.qq.com/m_imtt/download-middle-page/plugin/20220318/wechat_plugin.html?channel=1100124136");
        f54912g.put("FROM_SCENE_HALF_DIALOG", "https://upage.imtt.qq.com/m_imtt/download-middle-page/plugin/20220318/wechat_plugin.html?channel=1100124150");
        f54912g.put("FROM_SCENE_OPEN_NO_OFFICE_FILE", "https://upage.imtt.qq.com/m_imtt/download-middle-page/plugin/20220318/wechat_plugin.html?channel=1100124190");
    }

    /* renamed from: k */
    public static f1$$f m20771k(Context context, Uri uri) {
        Intent intent = new Intent("com.tencent.QQBrowser.action.VIEW");
        intent.setData(uri);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.size() <= 0) {
            return null;
        }
        f1$$f f1__f = new f1$$f((f1$$d) null);
        for (ResolveInfo next : queryIntentActivities) {
            String str = next.activityInfo.packageName;
            if (str.contains("com.tencent.mtt")) {
                ActivityInfo activityInfo = next.activityInfo;
                f1__f.f54933a = activityInfo.name;
                f1__f.f54934b = activityInfo.packageName;
                return f1__f;
            } else if (str.contains("com.tencent.qbx")) {
                ActivityInfo activityInfo2 = next.activityInfo;
                f1__f.f54933a = activityInfo2.name;
                f1__f.f54934b = activityInfo2.packageName;
            }
        }
        return f1__f;
    }

    /* renamed from: l */
    public static boolean m20772l(String str, String str2) {
        return !Util.isNullOrNil(str) && !Util.isNullOrNil(str2) && (m20773m(str) || ((HashSet) f54910e).contains(str2));
    }

    /* renamed from: m */
    public static boolean m20773m(String str) {
        boolean z = true;
        if (FileReaderHelper.getReaderType(str, true, new Intent()) != FileReaderHelper.ReaderType.XWEB) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fileCanOpenByXWeb fileExt = ");
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", ret = ");
        sb.append(z);
        Log.m105924i("MicroMsg.QQBrowserHelper", sb.toString());
        return z;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005c */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.pluginsdk.model.f1$$e m20774n(android.content.Context r11) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "\\."
            java.lang.String r2 = "com.tencent.mtt"
            java.lang.String r3 = "ADRQB_"
            com.tencent.mm.pluginsdk.model.f1$$e r4 = new com.tencent.mm.pluginsdk.model.f1$$e
            r4.<init>()
            android.content.pm.PackageManager r5 = r11.getPackageManager()     // Catch:{ Exception -> 0x00b2 }
            r6 = 0
            r7 = 2
            r8 = 0
            android.content.pm.PackageInfo r6 = r5.getPackageInfo(r2, r8)     // Catch:{ NameNotFoundException -> 0x0041 }
            r4.f54930a = r7     // Catch:{ NameNotFoundException -> 0x0041 }
            r4.f54932c = r3     // Catch:{ NameNotFoundException -> 0x0041 }
            if (r6 == 0) goto L_0x0041
            int r9 = r6.versionCode     // Catch:{ NameNotFoundException -> 0x0041 }
            r10 = 420000(0x668a0, float:5.88545E-40)
            if (r9 <= r10) goto L_0x0041
            r4.f54931b = r9     // Catch:{ NameNotFoundException -> 0x0041 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0041 }
            r9.<init>()     // Catch:{ NameNotFoundException -> 0x0041 }
            java.lang.String r10 = r4.f54932c     // Catch:{ NameNotFoundException -> 0x0041 }
            r9.append(r10)     // Catch:{ NameNotFoundException -> 0x0041 }
            java.lang.String r10 = r6.versionName     // Catch:{ NameNotFoundException -> 0x0041 }
            java.lang.String r10 = r10.replaceAll(r1, r0)     // Catch:{ NameNotFoundException -> 0x0041 }
            r9.append(r10)     // Catch:{ NameNotFoundException -> 0x0041 }
            java.lang.String r9 = r9.toString()     // Catch:{ NameNotFoundException -> 0x0041 }
            r4.f54932c = r9     // Catch:{ NameNotFoundException -> 0x0041 }
            return r4
        L_0x0041:
            java.lang.String r9 = "com.tencent.qbx"
            android.content.pm.PackageInfo r6 = r5.getPackageInfo(r9, r8)     // Catch:{ NameNotFoundException -> 0x004e }
            r4.f54930a = r8     // Catch:{ NameNotFoundException -> 0x004e }
            java.lang.String r9 = "ADRQBX_"
            r4.f54932c = r9     // Catch:{ NameNotFoundException -> 0x004e }
            goto L_0x0093
        L_0x004e:
            java.lang.String r9 = "com.tencent.qbx5"
            android.content.pm.PackageInfo r6 = r5.getPackageInfo(r9, r8)     // Catch:{ NameNotFoundException -> 0x005c }
            r9 = 1
            r4.f54930a = r9     // Catch:{ NameNotFoundException -> 0x005c }
            java.lang.String r9 = "ADRQBX5_"
            r4.f54932c = r9     // Catch:{ NameNotFoundException -> 0x005c }
            goto L_0x0093
        L_0x005c:
            android.content.pm.PackageInfo r6 = r5.getPackageInfo(r2, r8)     // Catch:{ NameNotFoundException -> 0x0065 }
            r4.f54930a = r7     // Catch:{ NameNotFoundException -> 0x0065 }
            r4.f54932c = r3     // Catch:{ NameNotFoundException -> 0x0065 }
            goto L_0x0093
        L_0x0065:
            java.lang.String r2 = "com.tencent.mtt.x86"
            android.content.pm.PackageInfo r6 = r5.getPackageInfo(r2, r8)     // Catch:{ Exception -> 0x0070 }
            r4.f54930a = r7     // Catch:{ Exception -> 0x0070 }
            r4.f54932c = r3     // Catch:{ Exception -> 0x0070 }
            goto L_0x0093
        L_0x0070:
            java.lang.String r2 = "http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10375"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0092 }
            com.tencent.mm.pluginsdk.model.f1$$f r11 = m20771k(r11, r2)     // Catch:{ Exception -> 0x0092 }
            if (r11 == 0) goto L_0x0093
            java.lang.String r2 = r11.f54934b     // Catch:{ Exception -> 0x0092 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0092 }
            if (r2 != 0) goto L_0x0093
            java.lang.String r11 = r11.f54934b     // Catch:{ Exception -> 0x0092 }
            android.content.pm.PackageInfo r11 = r5.getPackageInfo(r11, r8)     // Catch:{ Exception -> 0x0092 }
            r4.f54930a = r7     // Catch:{ Exception -> 0x0090 }
            r4.f54932c = r3     // Catch:{ Exception -> 0x0090 }
        L_0x008e:
            r6 = r11
            goto L_0x0093
        L_0x0090:
            goto L_0x008e
        L_0x0092:
        L_0x0093:
            if (r6 == 0) goto L_0x00b2
            int r11 = r6.versionCode     // Catch:{ Exception -> 0x00b2 }
            r4.f54931b = r11     // Catch:{ Exception -> 0x00b2 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2 }
            r11.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r2 = r4.f54932c     // Catch:{ Exception -> 0x00b2 }
            r11.append(r2)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r2 = r6.versionName     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r0 = r2.replaceAll(r1, r0)     // Catch:{ Exception -> 0x00b2 }
            r11.append(r0)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00b2 }
            r4.f54932c = r11     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C19444f1.m20774n(android.content.Context):com.tencent.mm.pluginsdk.model.f1$$e");
    }

    /* renamed from: o */
    public static int m20775o(String str, boolean z) {
        String p = m20776p(str);
        int i = 0;
        int i2 = -1;
        while (true) {
            String[] strArr = f54906a;
            if (i >= 12) {
                break;
            }
            if (strArr[i].equals(p)) {
                i2 = i;
            }
            i++;
        }
        return i2 != -1 ? z ? f54914i[i2] : f54913h[i2] : C0966R.raw.app_attach_file_icon_unknow;
    }

    /* renamed from: p */
    public static String m20776p(String str) {
        String mimeTypeFromExtension = (str == null || str.length() <= 0) ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension != null && mimeTypeFromExtension.length() != 0) {
            return mimeTypeFromExtension;
        }
        return "*/" + str;
    }

    /* renamed from: q */
    public static boolean m20777q(Context context) {
        return m20774n(context).f54930a != -1;
    }

    /* renamed from: r */
    public static void m20778r(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        m20779s(context, str, str2, str3, str4, str5, str6, (C22923f.C22924a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        r4 = (java.lang.Integer) ((java.util.HashMap) f54911f).get(r0);
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20779s(android.content.Context r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, p262wm.C22923f.C22924a r18) {
        /*
            r8 = r11
            r0 = r16
            com.tencent.mm.pluginsdk.model.h1 r1 = com.tencent.p014mm.pluginsdk.model.C19447h1.m20801a()
            r2 = 0
            r3 = 0
            com.tencent.mm.pluginsdk.model.g1 r1 = r1.mo25208b(r2, r3)
            java.lang.String r1 = r1.mo25201g()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)
            r5 = 1
            if (r4 != 0) goto L_0x005f
            java.util.Map<java.lang.String, java.lang.String> r4 = f54912g
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r4 = r4.containsKey(r0)
            if (r4 == 0) goto L_0x002c
            java.util.Map<java.lang.String, java.lang.String> r1 = f54912g
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
        L_0x002c:
            java.util.Map<java.lang.String, java.lang.Integer> r4 = f54911f
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r4 = r4.containsKey(r0)
            if (r4 == 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer> r4 = f54911f
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x0047
            int r4 = r4.intValue()
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r6[r5] = r0
            r0 = 2
            r6[r0] = r1
            java.lang.String r0 = "MicroMsg.QQBrowserHelper"
            java.lang.String r1 = "launchOrInstallQQBrowser: %s,%s,%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r6)
            r7 = r4
            goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            boolean r0 = m20777q(r11)
            if (r0 == 0) goto L_0x00b2
            qo3.q r9 = new qo3.q
            r9.<init>(r11)
            r0 = 2131831851(0x7f112c2b, float:1.929674E38)
            java.lang.String r0 = r11.getString(r0)
            r9.mo107595g(r0)
            r9.mo107589a(r5)
            r0 = 2131820936(0x7f110188, float:1.92746E38)
            r9.mo107601m(r0)
            com.tencent.mm.pluginsdk.model.f1$$a r10 = new com.tencent.mm.pluginsdk.model.f1$$a
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.mo107600l(r10)
            com.tencent.mm.pluginsdk.model.f1$$b r0 = new com.tencent.mm.pluginsdk.model.f1$$b
            r1 = r14
            r2 = r15
            r3 = r17
            r0.<init>(r15, r14, r3, r11)
            r9.mo107597i(r0)
            com.tencent.mm.pluginsdk.model.f1$$c r0 = new com.tencent.mm.pluginsdk.model.f1$$c
            r4 = r18
            r0.<init>(r4)
            r9.mo107593e(r0)
            r9.mo107603o()
            r4 = 151(0x97, double:7.46E-322)
            r0 = r15
            r2 = r17
            r3 = r4
            r5 = r11
            com.tencent.p014mm.pluginsdk.model.C19441d1.m20770b(r0, r1, r2, r3, r5)
            goto L_0x00db
        L_0x00b2:
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "postId"
            gy3.C87412m.m108594g(r0, r1)
            com.tencent.mm.ipcinvoker.type.IPCString r1 = new com.tencent.mm.ipcinvoker.type.IPCString
            r1.<init>(r0)
            com.tencent.mm.pluginsdk.model.e1<InputType, ResultType> r0 = com.tencent.p014mm.pluginsdk.model.C6658e1.f23979d
            r2 = 4
            x20.C15618a.m14627c(r1, r0, r3, r2, r3)
            m83.c r0 = new m83.c
            r0.<init>(r11)
            java.lang.String r1 = "mmdownloadapp_teNYsTpJ8ofO09hqmb"
            r0.f32244b = r1
            java.lang.Class<m83.d> r1 = m83.C10771d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            m83.d r1 = (m83.C10771d) r1
            r1.mo10782yz(r0, r3)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C19444f1.m20779s(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, wm.f$a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054 A[Catch:{ Exception -> 0x01d5 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[Catch:{ Exception -> 0x01d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[Catch:{ Exception -> 0x01d5 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25195a(android.content.Context r15, java.lang.String r16) {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            if (r0 != 0) goto L_0x0007
            r0 = 3
            return r0
        L_0x0007:
            r2 = 46
            r9 = 0
            if (r1 == 0) goto L_0x0039
            int r3 = r16.length()
            if (r3 != 0) goto L_0x0013
            goto L_0x0039
        L_0x0013:
            java.lang.String r3 = r16.trim()
            java.lang.String r4 = r3.toLowerCase()
            java.lang.String r5 = "://"
            int r4 = r4.indexOf(r5)
            java.lang.String r6 = r3.toLowerCase()
            int r6 = r6.indexOf(r2)
            if (r4 <= 0) goto L_0x0030
            if (r6 <= 0) goto L_0x0030
            if (r4 <= r6) goto L_0x0030
            goto L_0x0039
        L_0x0030:
            java.lang.String r3 = r3.toLowerCase()
            boolean r3 = r3.contains(r5)
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 != 0) goto L_0x004d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "http://"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x004d:
            r3 = 2
            android.net.Uri r4 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x01d5 }
            if (r4 != 0) goto L_0x0055
            return r3
        L_0x0055:
            java.lang.String r5 = r4.getScheme()     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r6 = "qb"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x01d5 }
            r6 = -1
            r10 = 1
            if (r5 == 0) goto L_0x0099
            com.tencent.mm.pluginsdk.model.f1$$e r5 = m20774n(r15)     // Catch:{ Exception -> 0x01d5 }
            int r7 = r5.f54930a     // Catch:{ Exception -> 0x01d5 }
            if (r7 != r6) goto L_0x0072
        L_0x0070:
            r5 = 0
            goto L_0x007c
        L_0x0072:
            if (r7 != r3) goto L_0x007b
            int r5 = r5.f54931b     // Catch:{ Exception -> 0x01d5 }
            r7 = 42
            if (r5 >= r7) goto L_0x007b
            goto L_0x0070
        L_0x007b:
            r5 = 1
        L_0x007c:
            if (r5 != 0) goto L_0x0099
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d5 }
            r4.<init>()     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r5 = "http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10375"
            r4.append(r5)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r5 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r5)     // Catch:{ Exception -> 0x01d5 }
            r4.append(r1)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x01d5 }
            android.net.Uri r4 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x01d5 }
        L_0x0099:
            com.tencent.mm.pluginsdk.model.f1$$e r1 = m20774n(r15)
            int r5 = r1.f54930a
            r11 = 4
            if (r5 != r6) goto L_0x00a3
            return r11
        L_0x00a3:
            r6 = 33
            if (r5 != r3) goto L_0x00ad
            int r5 = r1.f54931b
            if (r5 >= r6) goto L_0x00ad
            r0 = 5
            return r0
        L_0x00ad:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r7 = "android.intent.action.VIEW"
            r5.<init>(r7)
            int r7 = r1.f54930a
            java.lang.String r8 = "com.tencent.QQBrowser.action.VIEW"
            if (r7 != r3) goto L_0x00f7
            int r1 = r1.f54931b
            java.lang.String r3 = "com.tencent.mtt"
            if (r1 < r6) goto L_0x00cb
            r6 = 39
            if (r1 > r6) goto L_0x00cb
            java.lang.String r1 = "com.tencent.mtt.PhotoEditUI"
            r5.setClassName(r3, r1)
            goto L_0x0155
        L_0x00cb:
            r6 = 40
            if (r1 < r6) goto L_0x00da
            r6 = 45
            if (r1 > r6) goto L_0x00da
            java.lang.String r1 = "com.tencent.mtt.SplashActivity"
            r5.setClassName(r3, r1)
            goto L_0x0155
        L_0x00da:
            if (r1 < r2) goto L_0x0155
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r8)
            com.tencent.mm.pluginsdk.model.f1$$f r1 = m20771k(r15, r4)
            if (r1 == 0) goto L_0x0155
            java.lang.String r2 = r1.f54933a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0155
            java.lang.String r2 = r1.f54934b
            java.lang.String r1 = r1.f54933a
            r5.setClassName(r2, r1)
            goto L_0x0155
        L_0x00f7:
            if (r7 != r10) goto L_0x010d
            int r1 = r1.f54931b
            java.lang.String r2 = "com.tencent.qbx5"
            if (r1 != r10) goto L_0x0105
            java.lang.String r1 = "com.tencent.qbx5.PhotoEditUI"
            r5.setClassName(r2, r1)
            goto L_0x0155
        L_0x0105:
            if (r1 != r3) goto L_0x0155
            java.lang.String r1 = "com.tencent.qbx5.SplashActivity"
            r5.setClassName(r2, r1)
            goto L_0x0155
        L_0x010d:
            if (r7 != 0) goto L_0x013b
            int r1 = r1.f54931b
            r2 = 6
            if (r1 < r11) goto L_0x011e
            if (r1 > r2) goto L_0x011e
            java.lang.String r1 = "com.tencent.qbx"
            java.lang.String r2 = "com.tencent.qbx.SplashActivity"
            r5.setClassName(r1, r2)
            goto L_0x0155
        L_0x011e:
            if (r1 <= r2) goto L_0x0155
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r8)
            com.tencent.mm.pluginsdk.model.f1$$f r1 = m20771k(r15, r4)
            if (r1 == 0) goto L_0x0155
            java.lang.String r2 = r1.f54933a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0155
            java.lang.String r2 = r1.f54934b
            java.lang.String r1 = r1.f54933a
            r5.setClassName(r2, r1)
            goto L_0x0155
        L_0x013b:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r8)
            com.tencent.mm.pluginsdk.model.f1$$f r1 = m20771k(r15, r4)
            if (r1 == 0) goto L_0x0155
            java.lang.String r2 = r1.f54933a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0155
            java.lang.String r2 = r1.f54934b
            java.lang.String r1 = r1.f54933a
            r5.setClassName(r2, r1)
        L_0x0155:
            r5.setData(r4)
            java.lang.String r1 = "loginType"
            r2 = 24
            r5.putExtra(r1, r2)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r1 = "ChannelID"
            java.lang.String r2 = "com.tencent.mm"
            r5.putExtra(r1, r2)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r1 = "PosID"
            r5.putExtra(r1, r9)     // Catch:{ Exception -> 0x01c2 }
            r1 = 29
            boolean r1 = p206nj.C11171e.m11046c(r1)     // Catch:{ Exception -> 0x01c2 }
            if (r1 == 0) goto L_0x0187
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r15, r9, r5, r1)     // Catch:{ Exception -> 0x01c2 }
            r3 = 1
            r4 = 0
            com.tencent.mm.pluginsdk.model.f1$$d r5 = new com.tencent.mm.pluginsdk.model.f1$$d     // Catch:{ Exception -> 0x01c2 }
            r12 = r14
            r5.<init>(r14)     // Catch:{ Exception -> 0x01c0 }
            r6 = 0
            r2 = r15
            r1.send(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x01c0 }
            goto L_0x01bf
        L_0x0187:
            r12 = r14
            k20.a r13 = new k20.a     // Catch:{ Exception -> 0x01c0 }
            r13.<init>()     // Catch:{ Exception -> 0x01c0 }
            r13.mo10233c(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.Object[] r2 = r13.mo10232b()     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r3 = "com/tencent/mm/pluginsdk/model/QQBrowserHelper"
            java.lang.String r4 = "loadUrl"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;)I"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r15
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x01c0 }
            java.lang.Object r1 = r13.mo10231a(r9)     // Catch:{ Exception -> 0x01c0 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ Exception -> 0x01c0 }
            r15.startActivity(r1)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r2 = "com/tencent/mm/pluginsdk/model/QQBrowserHelper"
            java.lang.String r3 = "loadUrl"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;)I"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r15
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01c0 }
        L_0x01bf:
            return r9
        L_0x01c0:
            r0 = move-exception
            goto L_0x01c4
        L_0x01c2:
            r0 = move-exception
            r12 = r14
        L_0x01c4:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = r0.getMessage()
            r1[r9] = r0
            java.lang.String r0 = "MicroMsg.QQBrowserHelper"
            java.lang.String r2 = "open in browser failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
            return r11
        L_0x01d5:
            r12 = r14
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C19444f1.mo25195a(android.content.Context, java.lang.String):int");
    }

    /* renamed from: b */
    public String mo25196b(Context context, ResolveInfo resolveInfo) {
        ActivityInfo activityInfo;
        String str;
        if (context == null || resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null || (str = activityInfo.packageName) == null) {
            return null;
        }
        if ("com.qihoo.browser".equals(str)) {
            return "360浏览器";
        }
        if ("com.mx.browser".equals(str)) {
            return "傲游云浏览器";
        }
        if ("com.dolphin.browser.xf".equals(str)) {
            return "海豚浏览器";
        }
        if ("com.UCMobile".equals(str)) {
            return "UC浏览器";
        }
        if ("com.baidu.browser.apps".equals(str)) {
            return "百度浏览器";
        }
        if ("sogou.mobile.explorer".equals(str)) {
            return "搜狗浏览器";
        }
        if ("com.ijinshan.browser".equals(str)) {
            return "猎豹浏览器";
        }
        if ("com.mediawoz.xbrowser".equals(str)) {
            return "GO浏览器";
        }
        if ("com.oupeng.browser".equals(str)) {
            return "欧朋浏览器";
        }
        if ("com.tiantianmini.android.browser".equals(str)) {
            return "天天浏览器";
        }
        CharSequence loadLabel = resolveInfo.activityInfo.loadLabel(context.getPackageManager());
        if (loadLabel != null) {
            Matcher matcher = Pattern.compile("\\(.*推荐.*\\)", 2).matcher(loadLabel.toString());
            if (matcher.find()) {
                return matcher.replaceAll("");
            }
        }
        return resolveInfo.activityInfo.loadLabel(context.getPackageManager()).toString();
    }

    /* renamed from: c */
    public C22921c.C22922a mo25197c() {
        C22921c.C22922a aVar = new C22921c.C22922a();
        aVar.f65897b = C0966R.string.hop;
        aVar.f65899d = C0966R.string.hoq;
        aVar.f65896a = C0966R.C0969drawable.icon_qqbrowser;
        return aVar;
    }

    /* renamed from: d */
    public String mo25198d() {
        return "qq_browser.apk";
    }

    /* renamed from: e */
    public String mo25199e() {
        return "http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10318";
    }

    /* renamed from: f */
    public String mo25200f() {
        return "com.tencent.mtt";
    }

    /* renamed from: g */
    public String mo25201g() {
        return "https://upage.imtt.qq.com/m_imtt/download-middle-page/plugin/wechat_plugin.html";
    }

    /* renamed from: h */
    public boolean mo25202h(Context context) {
        f1$$e n = m20774n(context);
        int i = n.f54930a;
        if (i == -1) {
            return false;
        }
        return i != 2 || n.f54931b >= 33;
    }

    /* renamed from: i */
    public boolean mo25203i(String str) {
        return "com.tencent.mtt".equals(str) || "com.tencent.qbx".equals(str) || "com.tencent.mtt.x86".equals(str) || "com.tencent.qbx5".equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25204j(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r0 = 0
            java.util.List r4 = r4.queryIntentActivities(r5, r0)
            if (r4 == 0) goto L_0x0038
            int r5 = r4.size()
            if (r5 <= 0) goto L_0x0038
            java.util.Iterator r4 = r4.iterator()
        L_0x0015:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0038
            java.lang.Object r5 = r4.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.packageName
            java.lang.String r1 = "com.tencent.mtt"
            boolean r1 = r5.contains(r1)
            r2 = 1
            if (r1 == 0) goto L_0x002f
            return r2
        L_0x002f:
            java.lang.String r1 = "com.tencent.qbx"
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L_0x0015
            return r2
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C19444f1.mo25204j(android.content.Context, android.content.Intent):boolean");
    }
}
