package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19444f1;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import te3.C51173ry;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.e */
public class C19556e {

    /* renamed from: a */
    public static Intent f55362a;

    /* renamed from: b */
    public static WeakReference<Activity> f55363b;

    /* renamed from: c */
    public static HashMap<String, String> f55364c = new HashMap<>();

    /* renamed from: d */
    public static HashMap<String, String> f55365d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.e$a */
    public class C19557a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f55366d;

        /* renamed from: e */
        public final /* synthetic */ int f55367e;

        public C19557a(MMActivity mMActivity, int i) {
            this.f55366d = mMActivity;
            this.f55367e = i;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            C19556e.m20959f(this.f55366d, i, i2, intent, true, C0966R.string.c1b, C0966R.string.c1c, this.f55367e);
        }
    }

    static {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String[] split = C86013q1.m106432N("assets:///mimetype.txt").split("\n");
            for (String str : split) {
                String[] split2 = str.split(",");
                if (split2 == null || split2.length <= 1 || Util.isNullOrNil(split2[0]) || Util.isNullOrNil(split2[1])) {
                    Log.m105925i("MicroMsg.AppChooserIntentUtil", "mimeType %s", str);
                } else {
                    f55364c.put(split2[0].trim(), split2[1].trim());
                }
            }
            Log.m105925i("MicroMsg.AppChooserIntentUtil", "read from mimetype text %d %d %d", Integer.valueOf(split.length), Integer.valueOf(f55364c.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.AppChooserIntentUtil", e, "read mimeType from asset", new Object[0]);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        f55365d = hashMap;
        hashMap.put(FileReaderHelper.TXT_EXT, "mtt/txt");
        f55365d.put("epub", "mtt/epub");
        f55365d.put(FileReaderHelper.PDF_EXT, "mtt/pdf");
        f55365d.put(FileReaderHelper.DOC_EXT, "mtt/doc");
        f55365d.put(FileReaderHelper.XLS_EXT, "mtt/xls");
        f55365d.put(FileReaderHelper.PPT_EXT, "mtt/ppt");
        f55365d.put(FileReaderHelper.DOCX_EXT, "mtt/docx");
        f55365d.put(FileReaderHelper.XLSX_EXT, "mtt/xlsx");
        f55365d.put(FileReaderHelper.PPTX_EXT, "mtt/pptx");
        f55365d.put("chm", "mtt/chm");
        f55365d.put("ini", "mtt/ini");
        f55365d.put("log", "mtt/log");
        f55365d.put("bat", "mtt/bat");
        f55365d.put("php", "mtt/php");
        f55365d.put("lrc", "mtt/lrc");
        f55365d.put("js", "mtt/js");
    }

    /* renamed from: a */
    public static void m20954a(String str, int i) {
        if (C86709a0.m107522a()) {
            C86709a0.m107535s().mo121142i().mo119676J(str != null ? i + 274528 + str.hashCode() : i + 274528, "");
        }
    }

    /* renamed from: b */
    public static Intent m20955b(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        FileProviderHelper.setIntentDataAndType(context, intent, new C86009m1(str2 == null ? "" : str2), str, false);
        try {
            Log.m105925i("MicroMsg.AppChooserIntentUtil", "createNormalIntent %s %s %s", str, str2, intent.toString());
        } catch (Exception unused) {
        }
        return intent;
    }

    /* renamed from: c */
    public static Intent m20956c(Context context, String str, String str2, String str3, int i) {
        Intent intent = new Intent();
        intent.setPackage("com.tencent.mtt");
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("ChannelID", "com.tencent.mm");
        intent.putExtra("key_reader_sdk_id", 1);
        intent.putExtra("key_reader_sdk_type", 0);
        intent.putExtra("key_reader_sdk_path", str2);
        intent.putExtra("key_reader_sdk_sub_id", 1);
        if (i != -1) {
            intent.putExtra("PosID", i);
        }
        if (str3 != null) {
            intent.putExtra(DownloadInfo.FILENAME, str3);
            intent.putExtra("key_reader_sdk_format", C86013q1.m106454o(str3));
        }
        FileProviderHelper.setIntentDataAndType(context, intent, new C86009m1(str2 == null ? "" : str2), str, false);
        try {
            Log.m105925i("MicroMsg.AppChooserIntentUtil", "createQQBrowserIntent %s %s %s", str, str2, intent.toString());
        } catch (Exception unused) {
        }
        return intent;
    }

    /* renamed from: d */
    public static String m20957d(String str, int i) {
        return (String) C86709a0.m107535s().mo121142i().mo119684e(str != null ? i + 274528 + str.hashCode() : i + 274528, "");
    }

    /* renamed from: e */
    public static String m20958e(String str) {
        String str2 = "application/octet-stream";
        if (!Util.isNullOrNil(str)) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
            if (Util.isNullOrNil(mimeTypeFromExtension)) {
                mimeTypeFromExtension = f55364c.get(str);
            }
            if (!Util.isNullOrNil(mimeTypeFromExtension)) {
                str2 = mimeTypeFromExtension;
            } else if (!str.startsWith("/")) {
                str2 = "application/" + str;
            }
        }
        Log.m105925i("MicroMsg.AppChooserIntentUtil", "getMimeTypeByExt fileExt: %s mimeType: %s", str, str2);
        return str2;
    }

    /* renamed from: f */
    public static void m20959f(Activity activity, int i, int i2, Intent intent, boolean z, int i3, int i4, int i5) {
        Activity activity2 = activity;
        int i6 = i2;
        Intent intent2 = intent;
        int i7 = i3;
        int i8 = i4;
        if (i != 2) {
            return;
        }
        if (-1 == i6 && intent2 != null) {
            String stringExtra = intent2.getStringExtra("selectpkg");
            Intent intent3 = (Intent) intent2.getBundleExtra("transferback").getParcelable("targetintent");
            if (intent3 != null) {
                Log.m105925i("MicroMsg.AppChooserIntentUtil", "AppChooserUI select package name %s and target intent is not null", stringExtra);
                Intent intent4 = new Intent(intent3);
                intent4.setPackage(stringExtra);
                if (Util.isIntentAvailable(activity, intent4, true)) {
                    try {
                        if ("com.tencent.mtt".equals(stringExtra)) {
                            C115669n.INSTANCE.mo160131h(11168, 5, Integer.valueOf(i5));
                            intent4.putExtra("PosID", 10262);
                            intent4.putExtra("ChannelID", "com.tencent.mtt");
                        }
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent4);
                        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "handlerResultOfAppChooserUI", "(Landroid/app/Activity;IILandroid/content/Intent;ZIII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(activity, "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "handlerResultOfAppChooserUI", "(Landroid/app/Activity;IILandroid/content/Intent;ZIII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (ActivityNotFoundException e) {
                        Log.m105920e("MicroMsg.AppChooserIntentUtil", "ActivityNotFoundException:" + e);
                        if (z) {
                            C76879j.m92738i(activity, i7, i8);
                        }
                    }
                } else {
                    Log.m105920e("MicroMsg.AppChooserIntentUtil", "Always Intent is not support mimetype");
                    if (z) {
                        C76879j.m92738i(activity, i7, i8);
                    }
                }
            } else {
                Log.m105920e("MicroMsg.AppChooserIntentUtil", "AppChooserUI target intent is null in handlerResultOfAppChooserUI");
                if (z) {
                    C76879j.m92738i(activity, i7, i8);
                }
            }
        } else if (4098 == i6) {
            Log.m105920e("MicroMsg.AppChooserIntentUtil", "Not Found App Support media type");
            if (z) {
                C76879j.m92738i(activity, i7, i8);
            }
        } else if (4097 == i6) {
            Log.m105924i("MicroMsg.AppChooserIntentUtil", "AppChooserUI result code is no choice");
            if (z) {
                C76879j.m92738i(activity, i7, i8);
            }
        } else {
            Log.m105924i("MicroMsg.AppChooserIntentUtil", "AppChooserUI result code is not ok or data is null");
        }
    }

    /* renamed from: g */
    public static void m20960g(Context context, long j, String str, String str2, String str3, int i, String str4, C51173ry ryVar) {
        if (!C19444f1.m20772l(str2, str4)) {
            Log.m105924i("MicroMsg.AppChooserIntentUtil", "openByMiniQB: file Can't OpenByMiniQB ");
            return;
        }
        ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
        exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = j;
        exDeviceHaveBindNetworkDeviceEvent.publish();
        Log.m105918d("MicroMsg.AppChooserIntentUtil", "result is ok: " + exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a);
        Log.m105924i("MicroMsg.AppChooserIntentUtil", "openByMiniQB msgId: " + j + ", filePath:" + str + ", fileExt:" + str2 + ", sence:" + i);
        Intent intent = new Intent();
        intent.putExtra("msg_id", j);
        intent.putExtra("open_in_device", exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a);
        intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, str);
        intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT, str2);
        intent.putExtra("file_name", str3);
        intent.putExtra("sence", i);
        if (ryVar != null) {
            try {
                intent.putExtra("key_multi_task_common_info", ryVar.toByteArray());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppChooserIntentUtil", "invoke openByMiniQB Exception! Error:%s", e.getMessage());
            }
        }
        intent.addFlags(268435456);
        intent.setComponent(new ComponentName(C74928u.C74930g.f220310a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CHECK_MINIQB_CAN_OPEN_FILE");
        context.sendBroadcast(intent);
        if (str == null) {
            str = "";
        }
        Uri uriForFile = FileProviderHelper.getUriForFile(context, new C86009m1(str));
        if (uriForFile != null) {
            Util.whiteFileSet.add(uriForFile.toString());
        }
    }

    /* renamed from: h */
    public static void m20961h(String str, int i) {
        if (str != null) {
            C86709a0.m107535s().mo121142i().mo119676J(i + 274576 + str.hashCode(), Boolean.TRUE);
        } else {
            C86709a0.m107535s().mo121142i().mo119684e(i + 274576, Boolean.TRUE);
        }
    }

    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r2v14, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0289  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20962i(android.app.Activity r29, long r30, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, te3.C51173ry r36) {
        /*
            r10 = r29
            r8 = r32
            r9 = r33
            r14 = r35
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r15 = ""
            if (r8 != 0) goto L_0x0010
            r1 = r15
            goto L_0x0011
        L_0x0010:
            r1 = r8
        L_0x0011:
            r0.<init>((java.lang.String) r1)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r13 = 0
            r1[r13] = r8
            boolean r2 = r0.mo119967g()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r12 = 1
            r1[r12] = r2
            long r2 = r0.mo119980r()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r11 = 2
            r1[r11] = r2
            java.lang.String r7 = "MicroMsg.AppChooserIntentUtil"
            java.lang.String r2 = "startAppChooser path:%s, isExisted:%b, size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r1)
            boolean r0 = r0.mo119967g()
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "Cannot open file not existed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            return
        L_0x0044:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = m20958e(r33)
            java.lang.String r0 = m20957d(r5, r13)
            java.lang.String r1 = "com.baidu.searchbox"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x005d
            m20954a(r5, r13)
            r4 = r15
            goto L_0x005e
        L_0x005d:
            r4 = r0
        L_0x005e:
            boolean r0 = r4.equals(r15)
            if (r0 != 0) goto L_0x01f3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r4
            java.lang.String r1 = "startAppChooser User exist always config, package is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            java.lang.String r3 = "com.tencent.mtt"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x0097
            r0 = 1
            r16 = 0
            r1 = r32
            r2 = r33
            r11 = r3
            r3 = r34
            r13 = r4
            r4 = r5
            r12 = r5
            r5 = r35
            r10 = r6
            r6 = r0
            r14 = r7
            r7 = r16
            boolean r0 = m20964k(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = "startAppChooser open file by qb(default)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            return
        L_0x0097:
            r11 = r3
            r13 = r4
            r12 = r5
            r10 = r6
            r14 = r7
        L_0x009c:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Intent r1 = m20955b(r0, r12, r8)
            r1.setPackage(r13)
            if (r36 == 0) goto L_0x00c4
            java.lang.String r0 = "key_multi_task_common_info"
            byte[] r2 = r36.toByteArray()     // Catch:{ Exception -> 0x00b3 }
            r1.putExtra(r0, r2)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00c4
        L_0x00b3:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "invoke startAppChooserWhenOnCreate Exception! Error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r3)
            goto L_0x00c6
        L_0x00c4:
            r2 = 1
            r4 = 0
        L_0x00c6:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r10, r1, r2)
            if (r0 == 0) goto L_0x01e4
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r12
            java.lang.String r3 = "startAppChooser Always package support mimeType %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r0)
            boolean r3 = r11.equals(r13)
            java.lang.Class<s00.d> r0 = s00.C110692d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            s00.d r0 = (s00.C110692d) r0
            java.lang.String r0 = r0.mo35329zJ(r8)
            long r5 = com.tencent.xweb.FileReaderHelper.reportFileSize(r0, r9)
            java.lang.String r0 = "THIRDAPP"
            com.tencent.xweb.FileReaderHelper.reportPVUV(r9, r0)
            com.tencent.xweb.FileReaderHelper$OpenFileReportData r7 = new com.tencent.xweb.FileReaderHelper$OpenFileReportData
            if (r3 == 0) goto L_0x00f7
            java.lang.String r0 = "qb"
            goto L_0x0109
        L_0x00f7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "third_"
            r0.append(r11)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
        L_0x0109:
            r16 = r0
            r0 = -1
            java.lang.String r18 = "default"
            r13 = 2
            r11 = r7
            r2 = r12
            r4 = 1
            r12 = r35
            r4 = 0
            r13 = r33
            r26 = r14
            r25 = r15
            r14 = r5
            r17 = r0
            r11.<init>(r12, r13, r14, r16, r17, r18)
            long r5 = com.tencent.xweb.FileReaderHelper.getCurrentProcessMemory(r10)
            long r14 = java.lang.System.currentTimeMillis()
            r7.markStart(r5, r14)
            com.tencent.xweb.FileReaderHelper.reportOpenFile(r7)
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x0195 }
            r0.<init>()     // Catch:{ Exception -> 0x0195 }
            r0.mo10233c(r1)     // Catch:{ Exception -> 0x0195 }
            java.lang.Object[] r12 = r0.mo10232b()     // Catch:{ Exception -> 0x0195 }
            java.lang.String r13 = "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil"
            java.lang.String r1 = "startAppChooser"
            java.lang.String r16 = "(Landroid/app/Activity;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tencent/mm/protocal/protobuf/CommonMultiTaskData;)V"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "startActivity"
            java.lang.String r19 = "(Landroid/content/Intent;)V"
            r11 = r10
            r27 = r14
            r14 = r1
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0193 }
            java.lang.Object r0 = r0.mo10231a(r4)     // Catch:{ Exception -> 0x0193 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x0193 }
            r10.startActivity(r0)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r12 = "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil"
            java.lang.String r13 = "startAppChooser"
            java.lang.String r14 = "(Landroid/app/Activity;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tencent/mm/protocal/protobuf/CommonMultiTaskData;)V"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "startActivity"
            java.lang.String r17 = "(Landroid/content/Intent;)V"
            r11 = r10
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r0 = "Always package support mimeType %s"
            r1 = 1
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0193 }
            r11[r4] = r2     // Catch:{ Exception -> 0x0193 }
            r1 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r11)     // Catch:{ Exception -> 0x0191 }
            r23 = 0
            java.lang.String r24 = "success"
            r18 = r7
            r19 = r5
            r21 = r27
            r18.markEnd(r19, r21, r23, r24)     // Catch:{ Exception -> 0x0191 }
            com.tencent.xweb.FileReaderHelper.reportOpenFileRet(r7)     // Catch:{ Exception -> 0x0191 }
            return
        L_0x0191:
            r0 = move-exception
            goto L_0x019a
        L_0x0193:
            r0 = move-exception
            goto L_0x0198
        L_0x0195:
            r0 = move-exception
            r27 = r14
        L_0x0198:
            r1 = r26
        L_0x019a:
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Class r12 = r0.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r11[r4] = r12
            java.lang.String r12 = r0.getMessage()
            r13 = 1
            r11[r13] = r12
            java.lang.String r12 = "Always package, Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r12, r11)
            r23 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r3 == 0) goto L_0x01c0
            java.lang.String r3 = "qb_error"
            goto L_0x01c3
        L_0x01c0:
            java.lang.String r3 = "third_error"
        L_0x01c3:
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r24 = r1.toString()
            r18 = r7
            r19 = r5
            r21 = r27
            r18.markEnd(r19, r21, r23, r24)
            com.tencent.xweb.FileReaderHelper.reportOpenFileRet(r7)
            r3 = 1
            goto L_0x01f9
        L_0x01e4:
            r2 = r12
            r1 = r14
            r25 = r15
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            java.lang.String r5 = "Always package do not support mimeType %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r0)
            goto L_0x01f9
        L_0x01f3:
            r2 = r5
            r10 = r6
            r25 = r15
            r3 = 1
            r4 = 0
        L_0x01f9:
            android.content.Intent r0 = m20955b(r10, r2, r8)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r1 = com.tencent.p014mm.pluginsdk.model.C19444f1.m20777q(r1)
            r1 = r1 ^ r3
            java.lang.String r10 = m20958e(r33)
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            if (r8 != 0) goto L_0x0211
            r15 = r25
            goto L_0x0212
        L_0x0211:
            r15 = r8
        L_0x0212:
            r2.<init>((java.lang.String) r15)
            r11 = r29
            android.net.Uri r2 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r11, r2)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            if (r2 == 0) goto L_0x022c
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "targeturl"
            r3.putString(r5, r2)
        L_0x022c:
            java.lang.String r2 = "filepath"
            r3.putString(r2, r8)
            java.lang.String r2 = "fileext"
            r3.putString(r2, r9)
            java.lang.String r2 = "targetintent"
            r3.putParcelable(r2, r0)
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r5 = "type"
            r12.putExtra(r5, r4)
            android.content.res.Resources r5 = r29.getResources()
            r6 = 2131823715(0x7f110c63, float:1.9280237E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "title"
            r12.putExtra(r6, r5)
            java.lang.String r5 = "needupate"
            r12.putExtra(r5, r4)
            r4 = 1
            r1 = r1 ^ r4
            java.lang.String r4 = "not_show_recommend_app"
            r12.putExtra(r4, r1)
            java.lang.String r1 = "mimetype"
            r12.putExtra(r1, r10)
            r12.putExtra(r2, r0)
            java.lang.String r0 = "transferback"
            r12.putExtra(r0, r3)
            java.lang.String r0 = "scene"
            r7 = r35
            r12.putExtra(r0, r7)
            r0 = 7
            if (r7 != r0) goto L_0x0289
            java.lang.Class<zi.c> r0 = p775zi.C79332c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            zi.c r0 = (p775zi.C79332c) r0
            r0.Xc0(r11, r8, r9)
            goto L_0x02ad
        L_0x0289:
            boolean r0 = com.tencent.p014mm.pluginsdk.model.C19444f1.m20772l(r9, r10)
            if (r0 != 0) goto L_0x029b
            boolean r0 = r11 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x02ad
            r0 = r11
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            r1 = 1
            m20966m(r0, r8, r9, r1)
            goto L_0x02ad
        L_0x029b:
            r0 = 0
            r1 = r29
            r2 = r30
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r10
            r9 = r0
            m20960g(r1, r2, r4, r5, r6, r7, r8, r9)
        L_0x02ad:
            f55362a = r12
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r11)
            f55363b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C19556e.m20962i(android.app.Activity, long, java.lang.String, java.lang.String, java.lang.String, int, te3.ry):void");
    }

    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r2v7, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0212  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20963j(long r30, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, te3.C51173ry r36, boolean r37) {
        /*
            r8 = r32
            r15 = r33
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r1 = ""
            if (r8 != 0) goto L_0x0010
            r2 = r1
            goto L_0x0011
        L_0x0010:
            r2 = r8
        L_0x0011:
            r0.<init>((java.lang.String) r2)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r12 = 0
            r2[r12] = r8
            boolean r3 = r0.mo119967g()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r13 = 1
            r2[r13] = r3
            long r3 = r0.mo119980r()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r11 = 2
            r2[r11] = r3
            r3 = 3
            r2[r3] = r15
            java.lang.String r10 = "MicroMsg.AppChooserIntentUtil"
            java.lang.String r3 = "startAppChooserWhenOnCreate path:%s, isExisted:%b, size:%d fileExt: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            boolean r0 = r0.mo119967g()
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "Cannot open file not existed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            return r13
        L_0x0047:
            java.lang.String r9 = m20958e(r33)
            java.lang.String r0 = m20957d(r9, r12)
            java.lang.String r2 = "com.baidu.searchbox"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x005c
            m20954a(r9, r12)
            r7 = r1
            goto L_0x005d
        L_0x005c:
            r7 = r0
        L_0x005d:
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L_0x01f4
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r12] = r7
            java.lang.String r1 = "startAppChooserWhenOnCreate User exist always config, package is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            java.lang.String r6 = "com.tencent.mtt"
            boolean r0 = r6.equals(r7)
            if (r0 == 0) goto L_0x0093
            if (r37 == 0) goto L_0x0093
            r0 = 1
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r9
            r5 = r35
            r11 = r6
            r6 = r0
            r13 = r7
            r7 = r36
            boolean r0 = m20964k(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = "startAppChooserWhenOnCreate open file by qb(default)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            return r12
        L_0x0093:
            r11 = r6
            r13 = r7
        L_0x0095:
            android.content.Intent r1 = m20955b(r14, r9, r8)
            r1.setPackage(r13)
            if (r36 == 0) goto L_0x00b8
            java.lang.String r0 = "key_multi_task_common_info"
            byte[] r2 = r36.toByteArray()     // Catch:{ Exception -> 0x00a8 }
            r1.putExtra(r0, r2)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00b8
        L_0x00a8:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r3[r12] = r0
            java.lang.String r0 = "invoke startAppChooserWhenOnCreate Exception! Error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r3)
            goto L_0x00b9
        L_0x00b8:
            r2 = 1
        L_0x00b9:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r14, r1, r2)
            if (r0 == 0) goto L_0x01e5
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r12] = r9
            java.lang.String r3 = "startAppChooserWhenOnCreate Always package support mimeType %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r0)
            boolean r17 = r11.equals(r13)
            java.lang.Class<s00.d> r0 = s00.C110692d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            s00.d r0 = (s00.C110692d) r0
            java.lang.String r0 = r0.mo35329zJ(r8)
            long r3 = com.tencent.xweb.FileReaderHelper.reportFileSize(r0, r15)
            java.lang.String r0 = "THIRDAPP"
            com.tencent.xweb.FileReaderHelper.reportPVUV(r15, r0)
            com.tencent.xweb.FileReaderHelper$OpenFileReportData r7 = new com.tencent.xweb.FileReaderHelper$OpenFileReportData
            if (r17 == 0) goto L_0x00ea
            java.lang.String r0 = "qb"
            goto L_0x00fc
        L_0x00ea:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "third_"
            r0.append(r5)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
        L_0x00fc:
            r5 = -1
            java.lang.String r6 = "default"
            r13 = r9
            r9 = r7
            r11 = r10
            r10 = r35
            r25 = r11
            r11 = r33
            r2 = r13
            r12 = r3
            r4 = r14
            r14 = r0
            r3 = r15
            r15 = r5
            r16 = r6
            r9.<init>(r10, r11, r12, r14, r15, r16)
            long r5 = com.tencent.xweb.FileReaderHelper.getCurrentProcessMemory(r4)
            long r14 = java.lang.System.currentTimeMillis()
            r7.markStart(r5, r14)
            com.tencent.xweb.FileReaderHelper.reportOpenFile(r7)
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x0190 }
            r0.<init>()     // Catch:{ Exception -> 0x0190 }
            r0.mo10233c(r1)     // Catch:{ Exception -> 0x0190 }
            java.lang.Object[] r10 = r0.mo10232b()     // Catch:{ Exception -> 0x0190 }
            java.lang.String r11 = "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil"
            java.lang.String r12 = "startAppChooserWhenOnCreate"
            java.lang.String r13 = "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tencent/mm/protocal/protobuf/CommonMultiTaskData;Z)Z"
            java.lang.String r1 = "Undefined"
            java.lang.String r16 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r9 = r4
            r26 = r14
            r14 = r1
            r15 = r16
            r16 = r18
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0188 }
            r10 = 0
            java.lang.Object r0 = r0.mo10231a(r10)     // Catch:{ Exception -> 0x0181 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x0181 }
            r4.startActivity(r0)     // Catch:{ Exception -> 0x0181 }
            java.lang.String r0 = "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil"
            java.lang.String r9 = "startAppChooserWhenOnCreate"
            java.lang.String r11 = "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tencent/mm/protocal/protobuf/CommonMultiTaskData;Z)Z"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r1 = r4
            r15 = r2
            r2 = r0
            r3 = r9
            r9 = r4
            r4 = r11
            r28 = r5
            r5 = r12
            r6 = r13
            r11 = r7
            r7 = r14
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x017f }
            r23 = 0
            java.lang.String r24 = "success"
            r18 = r11
            r19 = r28
            r21 = r26
            r18.markEnd(r19, r21, r23, r24)     // Catch:{ Exception -> 0x017f }
            com.tencent.xweb.FileReaderHelper.reportOpenFileRet(r11)     // Catch:{ Exception -> 0x017f }
            return r10
        L_0x017f:
            r0 = move-exception
            goto L_0x0199
        L_0x0181:
            r0 = move-exception
            r15 = r2
            r9 = r4
            r28 = r5
            r11 = r7
            goto L_0x0199
        L_0x0188:
            r0 = move-exception
            r15 = r2
            r9 = r4
            r28 = r5
            r11 = r7
            r10 = 0
            goto L_0x0199
        L_0x0190:
            r0 = move-exception
            r9 = r4
            r28 = r5
            r11 = r7
            r26 = r14
            r10 = 0
            r15 = r2
        L_0x0199:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1[r10] = r2
            java.lang.String r2 = r0.getMessage()
            r12 = 1
            r1[r12] = r2
            java.lang.String r2 = "startAppChooserWhenOnCreate Always package, Exception:%s %s"
            r13 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r2, r1)
            r23 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r17 == 0) goto L_0x01c2
            java.lang.String r2 = "qb_error"
            goto L_0x01c5
        L_0x01c2:
            java.lang.String r2 = "third_error"
        L_0x01c5:
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r24 = r1.toString()
            r18 = r11
            r19 = r28
            r21 = r26
            r18.markEnd(r19, r21, r23, r24)
            com.tencent.xweb.FileReaderHelper.reportOpenFileRet(r11)
            goto L_0x01f9
        L_0x01e5:
            r15 = r9
            r13 = r10
            r9 = r14
            r10 = 0
            r12 = 1
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r10] = r15
            java.lang.String r1 = "Always package do not support mimeType %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            goto L_0x01f9
        L_0x01f4:
            r15 = r9
            r13 = r10
            r9 = r14
            r10 = 0
            r12 = 1
        L_0x01f9:
            r6 = 0
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r15
            r5 = r35
            r7 = r36
            boolean r0 = m20964k(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x0212
            java.lang.String r0 = "startAppChooserWhenOnCreate open file by qb"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            return r10
        L_0x0212:
            java.lang.String r0 = "couldnotopen"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            boolean r0 = r0.containsKey(r8)
            if (r0 != 0) goto L_0x023e
            r5 = r33
            boolean r0 = com.tencent.p014mm.pluginsdk.model.C19444f1.m20772l(r5, r15)
            if (r0 == 0) goto L_0x023e
            r0 = 7
            r7 = r35
            if (r7 != r0) goto L_0x022c
            return r12
        L_0x022c:
            r1 = r9
            r2 = r30
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r15
            r9 = r36
            m20960g(r1, r2, r4, r5, r6, r7, r8, r9)
            return r10
        L_0x023e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C19556e.m20963j(long, java.lang.String, java.lang.String, java.lang.String, int, te3.ry, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0572 A[Catch:{ Exception -> 0x05c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0581 A[Catch:{ Exception -> 0x05c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0585 A[Catch:{ Exception -> 0x05c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0595 A[Catch:{ Exception -> 0x05c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0258 A[Catch:{ Exception -> 0x035a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x025a A[Catch:{ Exception -> 0x035a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x026f A[SYNTHETIC, Splitter:B:51:0x026f] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0295 A[Catch:{ Exception -> 0x0354 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02a8 A[SYNTHETIC, Splitter:B:62:0x02a8] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02cd A[Catch:{ Exception -> 0x0350 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02d4 A[Catch:{ Exception -> 0x0350 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02ee A[Catch:{ Exception -> 0x0350 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02f0 A[Catch:{ Exception -> 0x0350 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0329 A[Catch:{ Exception -> 0x0350 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20964k(java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, int r51, boolean r52, te3.C51173ry r53) {
        /*
            r7 = r47
            r8 = r48
            r9 = r51
            r10 = r53
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FLOAT_BALL_FILES_QB_VERIFY_STRING_SYNC
            java.lang.Class<s00.d> r12 = s00.C110692d.class
            java.lang.Class<c02.c> r13 = c02.C92331c.class
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<s00.f> r0 = s00.C90110f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            s00.f r0 = (s00.C90110f) r0
            r0.ie0()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r15 = 1
            com.tencent.xweb.FileReaderHelper$ReaderType r1 = com.tencent.xweb.FileReaderHelper.getReaderType(r8, r15, r0)
            java.lang.String r2 = com.tencent.xweb.FileReaderHelper.OPEN_X5_SCENE_STR
            r3 = 40
            int r16 = r0.getIntExtra(r2, r3)
            com.tencent.xweb.FileReaderHelper$ReaderType r0 = com.tencent.xweb.FileReaderHelper.ReaderType.XWEB
            if (r1 != r0) goto L_0x0039
            if (r52 == 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            r1 = 1
            goto L_0x0737
        L_0x0039:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_qb_document_action_flag
            boolean r0 = r0.mo58784wf(r1, r15)
            java.lang.String r5 = "qb_error "
            java.lang.String r17 = "default"
            java.lang.String r4 = "QQBROWSER"
            java.lang.String r3 = "MicroMsg.AppChooserIntentUtil"
            if (r0 == 0) goto L_0x0634
            com.tencent.mm.pluginsdk.ui.tools.j0 r15 = com.tencent.p014mm.pluginsdk.p133ui.tools.C106593j0.f318511z
            r20 = r12
            java.lang.String r12 = r15.f318512u
            r21 = r11
            java.lang.String r11 = r15.f318513v
            r22 = r11
            java.lang.String r11 = r15.f318514w
            r23 = r11
            int r11 = r15.f318515x
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = eb0.C31543z5.m39451a()
            r0.append(r1)
            byte[] r1 = r47.getBytes()
            java.lang.String r1 = p823sg.C90193h.m112878f(r1)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0090
            java.lang.String r2 = "_"
            r0.append(r2)
            r0.append(r1)
            r0.append(r2)
            long r1 = com.tencent.p014mm.vfs.C86013q1.m106451l(r47)
            r0.append(r1)
        L_0x0090:
            java.lang.String r2 = r0.toString()
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r0 = r15.f326418a
            if (r0 == 0) goto L_0x009e
            com.tencent.mm.plugin.handoff.model.HandOffFile r0 = com.tencent.p014mm.plugin.handoff.model.HandOffFile.fromMultiTask(r0)
            r1 = r0
            goto L_0x009f
        L_0x009e:
            r1 = 0
        L_0x009f:
            r26 = r11
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r0 = "com.tencent.QQBrowser.action.sdk.document"
            r11.<init>(r0)
            java.lang.String r0 = "com.tencent.mtt"
            r11.setPackage(r0)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r11.addFlags(r6)
            java.lang.String r6 = "ChannelID"
            r28 = r1
            java.lang.String r1 = "com.tencent.mm"
            r11.putExtra(r6, r1)
            java.lang.String r1 = "PosID"
            r6 = 4
            r11.putExtra(r1, r6)
            java.lang.String r1 = "key_reader_sdk_id"
            r6 = 1
            r11.putExtra(r1, r6)
            java.lang.String r1 = "key_reader_sdk_type"
            r6 = 0
            r11.putExtra(r1, r6)
            java.lang.String r1 = "key_reader_sdk_format"
            r11.putExtra(r1, r8)
            java.lang.String r1 = "key_reader_sdk_path"
            r11.putExtra(r1, r7)
            java.lang.String r6 = "idx"
            java.lang.String r1 = "isShow"
            r29 = r15
            java.lang.String r15 = "text"
            r30 = r12
            java.lang.String r12 = "iconResId"
            r31 = r11
            java.lang.String r11 = "id"
            r32 = r1
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0107 }
            r33 = r2
            java.lang.String r2 = "com.tencent.mtt.external.reader.ReaderSdkReceive"
            r1.<init>(r0, r2)     // Catch:{ NameNotFoundException -> 0x0105 }
            android.content.pm.PackageManager r0 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0105 }
            r2 = 131072(0x20000, float:1.83671E-40)
            r0.getReceiverInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x0105 }
            java.lang.String r0 = "ifSupportFloatBallInQb() true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r1 = 1
            r18 = 1
            goto L_0x0127
        L_0x0105:
            r0 = move-exception
            goto L_0x010a
        L_0x0107:
            r0 = move-exception
            r33 = r2
        L_0x010a:
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r19 = 0
            r2[r19] = r1
            java.lang.String r0 = r0.getMessage()
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "ifSupportFloatBallInQb() Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r2)
            r18 = 0
        L_0x0127:
            java.lang.String r10 = ""
            if (r18 == 0) goto L_0x03f9
            r34 = r10
            byte r10 = (byte) r1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r47)
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = "isEnableAppBrandOpenMaterial, filePath is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0157
        L_0x013a:
            java.lang.Class<kr0.l0> r0 = kr0.C109033l0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kr0.l0 r0 = (kr0.C109033l0) r0
            if (r0 != 0) goto L_0x014a
            java.lang.String r0 = "isEnableAppBrandOpenMaterial, openMaterialService is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0157
        L_0x014a:
            iq0.b r1 = iq0.C98783b.ATTACH
            boolean r1 = r0.mo158321RB(r1)
            if (r1 != 0) goto L_0x0160
            java.lang.String r0 = "isEnableAppBrandOpenMaterial, openMaterialService is not enabled"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x0157:
            r36 = r4
            r37 = r5
            r38 = r6
            r39 = 0
            goto L_0x019c
        L_0x0160:
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel r1 = com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel.m117225b(r47, r48)
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r2 = r0.Ma0(r1)
            r36 = r4
            java.util.List<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel> r4 = r2.f311217f
            boolean r4 = r4.isEmpty()
            r18 = 1
            r4 = r4 ^ 1
            r37 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r38 = r6
            java.lang.String r6 = "isEnableAppBrandOpenMaterial, isEnabled: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            if (r4 == 0) goto L_0x019a
            boolean r0 = r0.mo158323WZ(r1, r2)
            if (r0 != 0) goto L_0x019a
            java.lang.String r0 = "isEnableAppBrandOpenMaterial, saveOpenMaterialCollection fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            r4 = 0
        L_0x019a:
            r39 = r4
        L_0x019c:
            com.tencent.mm.pluginsdk.ui.tools.j0 r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.C106593j0.f318511z
            r1.getClass()
            r6 = r28
            r5 = r32
            r4 = 5
            r24 = r10
            r25 = r13
            r10 = r33
            r13 = 3
            r2 = r47
            r41 = r3
            r3 = r48
            r42 = r36
            r4 = r49
            r13 = r5
            r43 = r37
            r5 = r51
            r44 = r6
            r32 = r13
            r45 = r38
            r13 = 4
            r6 = r53
            r1.mo153319a0(r2, r3, r4, r5, r6)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x035a }
            r0.<init>()     // Catch:{ Exception -> 0x035a }
            java.lang.String r1 = "pkgName"
            java.lang.String r2 = r14.getPackageName()     // Catch:{ Exception -> 0x035a }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x035a }
            java.lang.String r1 = "className"
            java.lang.String r2 = "com.tencent.mm.ui.tools.QbCallBackBroadcast"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x035a }
            java.lang.String r1 = "broadcast"
            r2 = 1
            r0.put(r1, r2)     // Catch:{ Exception -> 0x035a }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x035a }
            r1.<init>()     // Catch:{ Exception -> 0x035a }
            java.lang.String r2 = "type"
            java.lang.String r3 = "qb"
            r1.put(r2, r3)     // Catch:{ Exception -> 0x035a }
            java.lang.String r2 = "filePath"
            r1.put(r2, r7)     // Catch:{ Exception -> 0x035a }
            java.lang.String r2 = "fileExt"
            r1.put(r2, r8)     // Catch:{ Exception -> 0x035a }
            java.lang.String r2 = "sence"
            r1.put(r2, r9)     // Catch:{ Exception -> 0x035a }
            java.lang.String r2 = "verify"
            r1.put(r2, r10)     // Catch:{ Exception -> 0x035a }
            java.lang.String r2 = "thirdCtx"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x035a }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x035a }
            r1.<init>()     // Catch:{ Exception -> 0x035a }
            r1.put(r11, r13)     // Catch:{ Exception -> 0x035a }
            r2 = 0
            r1.put(r12, r2)     // Catch:{ Exception -> 0x035a }
            r2 = 2131825940(0x7f111514, float:1.928475E38)
            java.lang.String r2 = r14.getString(r2)     // Catch:{ Exception -> 0x035a }
            r1.put(r15, r2)     // Catch:{ Exception -> 0x035a }
            r2 = r32
            r3 = 1
            r1.put(r2, r3)     // Catch:{ Exception -> 0x035a }
            r4 = r45
            r1.put(r4, r3)     // Catch:{ Exception -> 0x035a }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x035a }
            r3.<init>()     // Catch:{ Exception -> 0x035a }
            r5 = 3
            r3.put(r11, r5)     // Catch:{ Exception -> 0x035a }
            r5 = 2
            r3.put(r12, r5)     // Catch:{ Exception -> 0x035a }
            r5 = 2131825942(0x7f111516, float:1.9284754E38)
            java.lang.String r5 = r14.getString(r5)     // Catch:{ Exception -> 0x035a }
            r3.put(r15, r5)     // Catch:{ Exception -> 0x035a }
            di3.d r5 = di3.C86312j.m106911c(r25)     // Catch:{ Exception -> 0x035a }
            c02.c r5 = (c02.C92331c) r5     // Catch:{ Exception -> 0x035a }
            boolean r5 = r5.mo58357LH()     // Catch:{ Exception -> 0x035a }
            if (r5 == 0) goto L_0x025a
            boolean r5 = com.tencent.p014mm.plugin.handoff.model.HandOffFile.isSupportOpenFile(r48)     // Catch:{ Exception -> 0x035a }
            if (r5 == 0) goto L_0x025a
            r5 = 1
            goto L_0x025b
        L_0x025a:
            r5 = 0
        L_0x025b:
            r3.put(r2, r5)     // Catch:{ Exception -> 0x035a }
            r5 = 1
            r3.put(r4, r5)     // Catch:{ Exception -> 0x035a }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x035a }
            r5.<init>()     // Catch:{ Exception -> 0x035a }
            r5.add(r1)     // Catch:{ Exception -> 0x035a }
            r5.add(r3)     // Catch:{ Exception -> 0x035a }
            if (r39 == 0) goto L_0x0295
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0291 }
            r1.<init>()     // Catch:{ Exception -> 0x0291 }
            r6 = 5
            r1.put(r11, r6)     // Catch:{ Exception -> 0x0354 }
            r3 = 2
            r1.put(r12, r3)     // Catch:{ Exception -> 0x0354 }
            r3 = 2131821220(0x7f1102a4, float:1.9275177E38)
            java.lang.String r3 = r14.getString(r3)     // Catch:{ Exception -> 0x0354 }
            r1.put(r15, r3)     // Catch:{ Exception -> 0x0354 }
            r3 = 1
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0354 }
            r1.put(r4, r3)     // Catch:{ Exception -> 0x0354 }
            r5.add(r1)     // Catch:{ Exception -> 0x0354 }
            goto L_0x0296
        L_0x0291:
            r0 = move-exception
            r6 = 5
            goto L_0x0355
        L_0x0295:
            r6 = 5
        L_0x0296:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x0354 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0354 }
            java.lang.String r2 = "menuItems"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0354 }
            java.lang.String r1 = "from"
            r12 = r53
            r2 = r34
            if (r12 == 0) goto L_0x02c7
            byte[] r3 = r53.toByteArray()     // Catch:{ Exception -> 0x0350 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r3)     // Catch:{ Exception -> 0x0350 }
            if (r3 != 0) goto L_0x02c7
            te3.d13 r3 = r12.f141210d     // Catch:{ Exception -> 0x0350 }
            if (r3 == 0) goto L_0x02c7
            byte[] r3 = r3.toByteArray()     // Catch:{ Exception -> 0x0350 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r3)     // Catch:{ Exception -> 0x0350 }
            if (r3 == 0) goto L_0x02c1
            goto L_0x02c7
        L_0x02c1:
            java.lang.String r3 = "multitask"
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0350 }
            goto L_0x02d7
        L_0x02c7:
            if (r12 == 0) goto L_0x02d4
            boolean r3 = r12.f141212f     // Catch:{ Exception -> 0x0350 }
            if (r3 == 0) goto L_0x02d4
            java.lang.String r3 = "taskbar"
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0350 }
            goto L_0x02d7
        L_0x02d4:
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0350 }
        L_0x02d7:
            java.lang.String r1 = "fromScene"
            r0.put(r1, r9)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r1 = "openTime"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0350 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r1 = "darkMode"
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()     // Catch:{ Exception -> 0x0350 }
            if (r3 == 0) goto L_0x02f0
            r3 = 1
            goto L_0x02f1
        L_0x02f0:
            r3 = 0
        L_0x02f1:
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0350 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0350 }
            r1.<init>()     // Catch:{ Exception -> 0x0350 }
            r3 = 10
            r1.put(r11, r3)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r3 = "activityStatusItems"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0350 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0350 }
            r1.<init>()     // Catch:{ Exception -> 0x0350 }
            r3 = 11
            r1.put(r11, r3)     // Catch:{ Exception -> 0x0350 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0350 }
            r3.<init>()     // Catch:{ Exception -> 0x0350 }
            r4 = 12
            r3.put(r11, r4)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "changeFileItems"
            r0.put(r4, r1)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r1 = "menuBottom"
            r4 = 1
            r0.put(r1, r4)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r1 = "notifyReadProgressId"
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0350 }
            if (r39 == 0) goto L_0x0338
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0350 }
            r1.<init>()     // Catch:{ Exception -> 0x0350 }
            r3 = 13
            r1.put(r11, r3)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r3 = "notifyMenuExpose"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0350 }
        L_0x0338:
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0350 }
            java.lang.String r0 = "createQQBrowserDocumentIntent menuData:%s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x034c }
            r3 = 0
            r4[r3] = r1     // Catch:{ Exception -> 0x034c }
            r11 = r41
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r4)     // Catch:{ Exception -> 0x034a }
            goto L_0x037b
        L_0x034a:
            r0 = move-exception
            goto L_0x0363
        L_0x034c:
            r0 = move-exception
            r11 = r41
            goto L_0x0363
        L_0x0350:
            r0 = move-exception
        L_0x0351:
            r11 = r41
            goto L_0x0362
        L_0x0354:
            r0 = move-exception
        L_0x0355:
            r12 = r53
            r2 = r34
            goto L_0x0351
        L_0x035a:
            r0 = move-exception
            r12 = r53
            r2 = r34
            r11 = r41
            r6 = 5
        L_0x0362:
            r1 = r2
        L_0x0363:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "createQQBrowserDocumentIntent menuItems jsonObject error"
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x037b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
            r3.<init>()
            r4 = 0
            r3.inScaled = r4
            android.content.res.Resources r5 = r14.getResources()
            r15 = 2131233111(0x7f080957, float:1.808235E38)
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeResource(r5, r15, r3)
            android.content.res.Resources r15 = r14.getResources()
            r6 = 2131233365(0x7f080a55, float:1.8082865E38)
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeResource(r15, r6, r3)
            r0.add(r4, r5)
            r4 = 1
            r0.add(r4, r6)
            if (r39 == 0) goto L_0x03b6
            android.content.res.Resources r4 = r14.getResources()
            r5 = 2131233362(0x7f080a52, float:1.808286E38)
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r4, r5, r3)
            r4 = 2
            r0.add(r4, r3)
        L_0x03b6:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "resArray"
            r3.putParcelableArrayList(r4, r0)
            java.lang.String r0 = "menuData"
            r3.putString(r0, r1)
            java.lang.String r0 = "style"
            java.lang.String r1 = "0"
            r3.putString(r0, r1)
            java.lang.String r0 = "key_thirdcall_sdk_extrals"
            r15 = r31
            r15.putExtra(r0, r3)
            r0 = 9
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r9, (int) r0)
            if (r0 == 0) goto L_0x03e1
            r0 = r24 | 2
            byte r0 = (byte) r0
            goto L_0x03e3
        L_0x03e1:
            r0 = r24
        L_0x03e3:
            java.lang.String r1 = "key_reader_sdk_sub_id"
            r15.putExtra(r1, r0)
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1 = 0
            r3[r1] = r0
            java.lang.String r0 = "subId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r0, r3)
            goto L_0x040a
        L_0x03f9:
            r12 = r53
            r11 = r3
            r42 = r4
            r43 = r5
            r2 = r10
            r25 = r13
            r44 = r28
            r15 = r31
            r10 = r33
            r13 = 4
        L_0x040a:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f55365d
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x041c
            java.lang.String r0 = m20958e(r48)
        L_0x041c:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r7)
            r3 = 0
            com.tencent.p014mm.sdk.platformtools.FileProviderHelper.setIntentDataAndType((android.content.Context) r14, (android.content.Intent) r15, (com.tencent.p014mm.vfs.C86009m1) r1, (java.lang.String) r0, (boolean) r3)
            java.lang.String r1 = "createQQBrowserDocumentIntent %s %s %s %s %s %s"
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x044a }
            r4[r3] = r0     // Catch:{ Exception -> 0x044a }
            r3 = 1
            r4[r3] = r7     // Catch:{ Exception -> 0x044a }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x044a }
            r3 = 2
            r4[r3] = r0     // Catch:{ Exception -> 0x044a }
            android.os.Bundle r0 = r15.getExtras()     // Catch:{ Exception -> 0x044a }
            r3 = 3
            r4[r3] = r0     // Catch:{ Exception -> 0x044a }
            r4[r13] = r8     // Catch:{ Exception -> 0x044a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r51)     // Catch:{ Exception -> 0x044a }
            r6 = 5
            r4[r6] = r0     // Catch:{ Exception -> 0x044b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r4)     // Catch:{ Exception -> 0x044b }
            goto L_0x044b
        L_0x044a:
            r6 = 5
        L_0x044b:
            r1 = 0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r14, r15, r1)
            if (r0 == 0) goto L_0x060d
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FLOAT_BALL_FILES_QB_VERIFY_FILE_PATH_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x04ad
            r3 = r30
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r0)
            if (r0 == 0) goto L_0x04aa
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r4 = r21
            java.lang.Object r0 = r0.mo119685f(r4, r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x048f
            r1.append(r10)
            goto L_0x049a
        L_0x048f:
            r1.append(r0)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r10)
        L_0x049a:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.String r1 = r1.toString()
            r0.mo119677K(r4, r1)
            goto L_0x04c7
        L_0x04aa:
            r4 = r21
            goto L_0x04b1
        L_0x04ad:
            r4 = r21
            r3 = r30
        L_0x04b1:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119677K(r1, r3)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119677K(r4, r10)
        L_0x04c7:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FLOAT_BALL_FILES_QB_VERIFY_USE_FREQUENCY_INT_SYNC
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.mo119677K(r1, r3)
            di3.d r0 = di3.C86312j.m106911c(r20)
            s00.d r0 = (s00.C110692d) r0
            java.lang.String r0 = r0.mo35329zJ(r7)
            long r4 = com.tencent.xweb.FileReaderHelper.reportFileSize(r0, r8)
            r10 = r42
            com.tencent.xweb.FileReaderHelper.reportPVUV(r8, r10)
            com.tencent.xweb.FileReaderHelper$OpenFileReportData r10 = new com.tencent.xweb.FileReaderHelper$OpenFileReportData
            r7 = -1
            if (r52 == 0) goto L_0x04f4
            r0 = r17
            goto L_0x04f8
        L_0x04f4:
            java.lang.String r0 = com.tencent.xweb.FileReaderHelper.convertOpenFileFrom(r16)
        L_0x04f8:
            java.lang.String r12 = "qb"
            r1 = r10
            r2 = r51
            r3 = r48
            r13 = 5
            r6 = r12
            r8 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
            long r1 = com.tencent.xweb.FileReaderHelper.getCurrentProcessMemory(r14)
            long r3 = java.lang.System.currentTimeMillis()
            r10.markStart(r1, r3)
            com.tencent.xweb.FileReaderHelper.reportOpenFile(r10)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x05c8 }
            k20.a r5 = new k20.a     // Catch:{ Exception -> 0x05c8 }
            r5.<init>()     // Catch:{ Exception -> 0x05c8 }
            r5.mo10233c(r15)     // Catch:{ Exception -> 0x05c8 }
            java.lang.Object[] r31 = r5.mo10232b()     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r32 = "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil"
            java.lang.String r33 = "startByQb"
            java.lang.String r34 = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/tencent/mm/protocal/protobuf/CommonMultiTaskData;)Z"
            java.lang.String r35 = "Undefined"
            java.lang.String r36 = "startActivity"
            java.lang.String r37 = "(Landroid/content/Intent;)V"
            r30 = r0
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ Exception -> 0x05c8 }
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)     // Catch:{ Exception -> 0x05c8 }
            android.content.Intent r5 = (android.content.Intent) r5     // Catch:{ Exception -> 0x05c8 }
            r0.startActivity(r5)     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r31 = "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil"
            java.lang.String r32 = "startByQb"
            java.lang.String r33 = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/tencent/mm/protocal/protobuf/CommonMultiTaskData;)Z"
            java.lang.String r34 = "Undefined"
            java.lang.String r35 = "startActivity"
            java.lang.String r36 = "(Landroid/content/Intent;)V"
            r30 = r0
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x05c8 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x05c8 }
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x05c6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x05c8 }
            r7 = 0
            r6[r7] = r5     // Catch:{ Exception -> 0x05c8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r51)     // Catch:{ Exception -> 0x05c8 }
            r7 = 1
            r6[r7] = r5     // Catch:{ Exception -> 0x05c8 }
            r15 = 11168(0x2ba0, float:1.565E-41)
            r0.mo160131h(r15, r6)     // Catch:{ Exception -> 0x05c8 }
            r5 = r29
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r0 = r5.f326418a     // Catch:{ Exception -> 0x05c8 }
            if (r0 == 0) goto L_0x0581
            di3.d r6 = di3.C86312j.m106911c(r25)     // Catch:{ Exception -> 0x05c8 }
            c02.c r6 = (c02.C92331c) r6     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r0 = r0.field_id     // Catch:{ Exception -> 0x05c8 }
            com.tencent.mm.plugin.handoff.model.HandOff r0 = r6.lt0(r0)     // Catch:{ Exception -> 0x05c8 }
            r40 = r0
            goto L_0x0583
        L_0x0581:
            r40 = 0
        L_0x0583:
            if (r40 != 0) goto L_0x058f
            di3.d r0 = di3.C86312j.m106911c(r25)     // Catch:{ Exception -> 0x05c8 }
            c02.c r0 = (c02.C92331c) r0     // Catch:{ Exception -> 0x05c8 }
            com.tencent.mm.plugin.handoff.model.HandOff r40 = r0.mo58367jO()     // Catch:{ Exception -> 0x05c8 }
        L_0x058f:
            r0 = r40
            boolean r6 = r0 instanceof com.tencent.p014mm.plugin.handoff.model.HandOffFile     // Catch:{ Exception -> 0x05c8 }
            if (r6 == 0) goto L_0x05b1
            r6 = 1
            r0.setHandOffType(r6)     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r7 = com.tencent.p014mm.plugin.handoff.model.HandOff.generateKey(r6, r6)     // Catch:{ Exception -> 0x05c8 }
            r0.setKey(r7)     // Catch:{ Exception -> 0x05c8 }
            r6 = r0
            com.tencent.mm.plugin.handoff.model.HandOffFile r6 = (com.tencent.p014mm.plugin.handoff.model.HandOffFile) r6     // Catch:{ Exception -> 0x05c8 }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r5 = r5.f326418a     // Catch:{ Exception -> 0x05c8 }
            r6.saveToMultiTaskInfo(r5)     // Catch:{ Exception -> 0x05c8 }
            di3.d r5 = di3.C86312j.m106911c(r25)     // Catch:{ Exception -> 0x05c8 }
            c02.c r5 = (c02.C92331c) r5     // Catch:{ Exception -> 0x05c8 }
            r5.mo58362bE(r0)     // Catch:{ Exception -> 0x05c8 }
        L_0x05b1:
            r0 = 0
            java.lang.String r5 = "success"
            r47 = r10
            r48 = r1
            r50 = r3
            r52 = r0
            r53 = r5
            r47.markEnd(r48, r50, r52, r53)     // Catch:{ Exception -> 0x05c8 }
            com.tencent.xweb.FileReaderHelper.reportOpenFileRet(r10)     // Catch:{ Exception -> 0x05c8 }
            goto L_0x060b
        L_0x05c6:
            r0 = move-exception
            goto L_0x05ca
        L_0x05c8:
            r0 = move-exception
            r5 = 2
        L_0x05ca:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = r0.getMessage()
            r7 = 1
            r5[r7] = r6
            java.lang.String r6 = "startByQb() (by QQBrowserDocumentIntent) Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r6, r5)
            r5 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = r43
            r6.append(r7)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r47 = r10
            r48 = r1
            r50 = r3
            r52 = r5
            r53 = r0
            r47.markEnd(r48, r50, r52, r53)
            com.tencent.xweb.FileReaderHelper.reportOpenFileRet(r10)
        L_0x060b:
            r1 = 0
            return r1
        L_0x060d:
            r3 = r30
            r10 = r42
            r6 = r43
            r13 = 5
            r15 = 11168(0x2ba0, float:1.565E-41)
            com.tencent.mm.pluginsdk.ui.tools.j0 r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C106593j0.f318511z
            r0.getClass()
            r1 = r0
            r2 = r3
            r3 = r22
            r4 = r23
            r5 = r26
            r46 = r6
            r6 = r53
            r1.mo153319a0(r2, r3, r4, r5, r6)
            r1 = r44
            if (r1 == 0) goto L_0x063d
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r0 = r0.f326418a
            r1.saveToMultiTaskInfo(r0)
            goto L_0x063d
        L_0x0634:
            r11 = r3
            r10 = r4
            r46 = r5
            r20 = r12
            r13 = 5
            r15 = 11168(0x2ba0, float:1.565E-41)
        L_0x063d:
            r0 = -1
            r1 = r50
            r2 = 0
            android.content.Intent r0 = m20956c(r14, r1, r7, r2, r0)
            r1 = 0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r14, r0, r1)
            if (r2 == 0) goto L_0x0036
            di3.d r1 = di3.C86312j.m106911c(r20)
            s00.d r1 = (s00.C110692d) r1
            java.lang.String r1 = r1.mo35329zJ(r7)
            long r4 = com.tencent.xweb.FileReaderHelper.reportFileSize(r1, r8)
            com.tencent.xweb.FileReaderHelper.reportPVUV(r8, r10)
            com.tencent.xweb.FileReaderHelper$OpenFileReportData r10 = new com.tencent.xweb.FileReaderHelper$OpenFileReportData
            r7 = -1
            if (r52 == 0) goto L_0x0663
            goto L_0x0669
        L_0x0663:
            java.lang.String r1 = com.tencent.xweb.FileReaderHelper.convertOpenFileFrom(r16)
            r17 = r1
        L_0x0669:
            java.lang.String r6 = "qb"
            r1 = r10
            r2 = r51
            r3 = r48
            r8 = r17
            r1.<init>(r2, r3, r4, r6, r7, r8)
            long r1 = com.tencent.xweb.FileReaderHelper.getCurrentProcessMemory(r14)
            long r3 = java.lang.System.currentTimeMillis()
            r10.markStart(r1, r3)
            com.tencent.xweb.FileReaderHelper.reportOpenFile(r10)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x06f2 }
            k20.a r6 = new k20.a     // Catch:{ Exception -> 0x06f2 }
            r6.<init>()     // Catch:{ Exception -> 0x06f2 }
            r6.mo10233c(r0)     // Catch:{ Exception -> 0x06f2 }
            java.lang.Object[] r21 = r6.mo10232b()     // Catch:{ Exception -> 0x06f2 }
            java.lang.String r22 = "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil"
            java.lang.String r23 = "startByQb"
            java.lang.String r24 = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/tencent/mm/protocal/protobuf/CommonMultiTaskData;)Z"
            java.lang.String r25 = "Undefined"
            java.lang.String r26 = "startActivity"
            java.lang.String r27 = "(Landroid/content/Intent;)V"
            r20 = r5
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x06f2 }
            r7 = 0
            java.lang.Object r0 = r6.mo10231a(r7)     // Catch:{ Exception -> 0x06f2 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x06f2 }
            r5.startActivity(r0)     // Catch:{ Exception -> 0x06f2 }
            java.lang.String r21 = "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil"
            java.lang.String r22 = "startByQb"
            java.lang.String r23 = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/tencent/mm/protocal/protobuf/CommonMultiTaskData;)Z"
            java.lang.String r24 = "Undefined"
            java.lang.String r25 = "startActivity"
            java.lang.String r26 = "(Landroid/content/Intent;)V"
            r20 = r5
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x06f2 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x06f2 }
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x06f0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x06f2 }
            r7 = 0
            r6[r7] = r5     // Catch:{ Exception -> 0x06f2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r51)     // Catch:{ Exception -> 0x06f2 }
            r7 = 1
            r6[r7] = r5     // Catch:{ Exception -> 0x06f2 }
            r0.mo160131h(r15, r6)     // Catch:{ Exception -> 0x06f2 }
            r0 = 0
            java.lang.String r5 = "success"
            r47 = r10
            r48 = r1
            r50 = r3
            r52 = r0
            r53 = r5
            r47.markEnd(r48, r50, r52, r53)     // Catch:{ Exception -> 0x06f2 }
            com.tencent.xweb.FileReaderHelper.reportOpenFileRet(r10)     // Catch:{ Exception -> 0x06f2 }
            r1 = 0
            return r1
        L_0x06f0:
            r0 = move-exception
            goto L_0x06f4
        L_0x06f2:
            r0 = move-exception
            r5 = 2
        L_0x06f4:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = r0.getMessage()
            r7 = 1
            r5[r7] = r6
            java.lang.String r6 = "startByQb() (by QQBrowserIntent) Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r6, r5)
            r5 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = r46
            r6.append(r7)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r47 = r10
            r48 = r1
            r50 = r3
            r52 = r5
            r53 = r0
            r47.markEnd(r48, r50, r52, r53)
            com.tencent.xweb.FileReaderHelper.reportOpenFileRet(r10)
            goto L_0x0036
        L_0x0737:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C19556e.m20964k(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, te3.ry):boolean");
    }

    /* renamed from: l */
    public static boolean m20965l(Activity activity, String str, String str2, int i, int i2) {
        String e = m20958e(str2);
        String str3 = "";
        Uri uriForFile = FileProviderHelper.getUriForFile(activity, new C86009m1(str == null ? str3 : str));
        Bundle bundle = new Bundle();
        Intent b = m20955b(activity, e, str);
        if (uriForFile != null) {
            str3 = uriForFile.toString();
        }
        bundle.putString("targeturl", str3);
        bundle.putString("filepath", str);
        bundle.putString("fileext", str2);
        bundle.putParcelable("targetintent", b);
        Intent intent = new Intent(activity, AppChooserUI.class);
        intent.putExtra("type", 0);
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, activity.getResources().getString(C0966R.string.bd6));
        intent.putExtra("mimetype", e);
        intent.putExtra("targetintent", b);
        intent.putExtra("transferback", bundle);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
        intent.putExtra("enter_scene", i2);
        intent.putExtra("openWay", true);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(2);
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "startChooseWayActivity", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;II)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    /* renamed from: m */
    public static void m20966m(MMActivity mMActivity, String str, String str2, int i) {
        String e = m20958e(str2);
        m20954a(e, 0);
        Uri uriForFile = FileProviderHelper.getUriForFile(mMActivity, new C86009m1(str == null ? "" : str));
        Bundle bundle = new Bundle();
        Intent b = m20955b(mMActivity, e, str);
        bundle.putString("targeturl", uriForFile.toString());
        bundle.putString("filepath", str);
        bundle.putString("fileext", str2);
        bundle.putParcelable("targetintent", b);
        Intent intent = new Intent();
        intent.putExtra("type", 0);
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, mMActivity.getResources().getString(C0966R.string.bd6));
        intent.putExtra("mimetype", e);
        intent.putExtra("targetintent", b);
        intent.putExtra("transferback", bundle);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
        intent.putExtra("openWay", true);
        C88144b.m109803u(mMActivity, ".pluginsdk.ui.tools.AppChooserUI", intent, 2, new C19557a(mMActivity, i));
    }
}
