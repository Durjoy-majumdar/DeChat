package com.tencent.p014mm.kara.localfewshotlearning.xgb;

import j20.C117292a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import k20.C9556a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.kara.localfewshotlearning.xgb.XGBoost */
public class XGBoost {

    /* renamed from: a */
    public static final /* synthetic */ int f237798a = 0;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("LocalFewShotLearning");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/kara/localfewshotlearning/xgb/XGBoost", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/kara/localfewshotlearning/xgb/XGBoost", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: a */
    public static int m98815a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return new JSONObject(sb.toString()).getJSONObject("learner").getJSONObject("learner_model_param").getInt("num_feature");
                }
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m98816b(java.util.List<java.lang.String> r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, float r8) {
        /*
            float r5 = trainNative(r5, r6, r7, r8)
            r6 = 0
            r8 = 0
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0099
            int r8 = r4.size()
            int r0 = m98815a(r7)
            if (r8 != r0) goto L_0x0099
            double r0 = (double) r5
            java.io.File r5 = new java.io.File
            r5.<init>(r7)
            boolean r8 = r5.exists()
            r2 = 1
            if (r8 != 0) goto L_0x0023
        L_0x0021:
            r4 = 0
            goto L_0x0096
        L_0x0023:
            int r8 = r4.size()
            if (r8 != 0) goto L_0x002a
            goto L_0x0021
        L_0x002a:
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0021 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0021 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0021 }
            r8.<init>(r3)     // Catch:{ Exception -> 0x0021 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0021 }
            r5.<init>()     // Catch:{ Exception -> 0x0021 }
        L_0x0039:
            java.lang.String r3 = r8.readLine()     // Catch:{ Exception -> 0x0021 }
            if (r3 == 0) goto L_0x0043
            r5.append(r3)     // Catch:{ Exception -> 0x0021 }
            goto L_0x0039
        L_0x0043:
            r8.close()     // Catch:{ Exception -> 0x0021 }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x0021 }
            r8.<init>()     // Catch:{ Exception -> 0x0021 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0021 }
        L_0x004f:
            boolean r3 = r4.hasNext()     // Catch:{ Exception -> 0x0021 }
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r4.next()     // Catch:{ Exception -> 0x0021 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0021 }
            r8.put(r3)     // Catch:{ Exception -> 0x0021 }
            goto L_0x004f
        L_0x005f:
            int r4 = r5.length()     // Catch:{ Exception -> 0x0021 }
            int r4 = r4 - r2
            r5.deleteCharAt(r4)     // Catch:{ Exception -> 0x0021 }
            java.lang.String r4 = ",\"wechat_feature_names\":"
            r5.append(r4)     // Catch:{ Exception -> 0x0021 }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x0021 }
            r5.append(r4)     // Catch:{ Exception -> 0x0021 }
            java.lang.String r4 = ",\"predict_threshold\":"
            r5.append(r4)     // Catch:{ Exception -> 0x0021 }
            r5.append(r0)     // Catch:{ Exception -> 0x0021 }
            java.lang.String r4 = "}"
            r5.append(r4)     // Catch:{ Exception -> 0x0021 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0021 }
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0021 }
            java.io.FileWriter r8 = new java.io.FileWriter     // Catch:{ Exception -> 0x0021 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0021 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x0021 }
            r5.write(r4)     // Catch:{ Exception -> 0x0021 }
            r5.close()     // Catch:{ Exception -> 0x0021 }
            r4 = 1
        L_0x0096:
            if (r4 == 0) goto L_0x0099
            return r2
        L_0x0099:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.kara.localfewshotlearning.xgb.XGBoost.m98816b(java.util.List, java.lang.String, java.lang.String, java.lang.String, float):boolean");
    }

    public static native void destoryModel(long j);

    public static native int getFeaturesCnt(long j);

    public static native long initModel(String str);

    public static native float predictPositive(long j, float[] fArr);

    private static native float trainNative(String str, String str2, String str3, float f);
}
