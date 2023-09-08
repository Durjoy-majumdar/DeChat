package w30;

import android.content.Context;
import com.tencent.p014mm.kara.localfewshotlearning.xgb.XGBoost;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import u30.C90601a;

/* renamed from: w30.b */
public class C90895b extends C90892a {

    /* renamed from: b */
    public final String f260876b;

    /* renamed from: c */
    public final String f260877c;

    /* renamed from: d */
    public final String f260878d;

    /* renamed from: e */
    public final String f260879e;

    /* renamed from: f */
    public int f260880f = 0;

    /* renamed from: g */
    public int f260881g = 0;

    /* renamed from: h */
    public int f260882h = 0;

    /* renamed from: i */
    public int f260883i = 0;

    public C90895b(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + "/public/kara/fewshot/xgboost/temp/";
        this.f260876b = str;
        new File(str).mkdirs();
        this.f260877c = str + "train.data";
        this.f260878d = str + "test.data";
        this.f260879e = str + "model.json";
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d A[SYNTHETIC, Splitter:B:50:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2 A[Catch:{ Exception -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9 A[SYNTHETIC, Splitter:B:59:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ae A[Catch:{ Exception -> 0x00b1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo124989a() {
        /*
            r7 = this;
            w30.a$a r0 = r7.f260872a
            r1 = 0
            if (r0 == 0) goto L_0x00b1
            u30.a$a r0 = (u30.C90601a.C90602a) r0
            java.util.Map r0 = r0.f260324c
            if (r0 != 0) goto L_0x000d
            goto L_0x00b1
        L_0x000d:
            r0 = 0
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x00a6, all -> 0x0097 }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ Exception -> 0x00a6, all -> 0x0097 }
            java.lang.String r4 = r7.f260877c     // Catch:{ Exception -> 0x00a6, all -> 0x0097 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00a6, all -> 0x0097 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a6, all -> 0x0097 }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0094, all -> 0x0091 }
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x0094, all -> 0x0091 }
            java.lang.String r5 = r7.f260878d     // Catch:{ Exception -> 0x0094, all -> 0x0091 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0094, all -> 0x0091 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0094, all -> 0x0091 }
        L_0x0026:
            w30.a$a r0 = r7.f260872a     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            r4 = r0
            u30.a$a r4 = (u30.C90601a.C90602a) r4     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            java.util.Map r4 = r4.f260324c     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            w30.a$a$a r0 = r0.mo124754a(r4)     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            r4 = 1
            if (r0 != 0) goto L_0x003b
            r2.close()     // Catch:{ Exception -> 0x003a }
            r3.close()     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            return r4
        L_0x003b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            r5.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            int r6 = r0.f260875c     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            r5.append(r6)     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            java.lang.String r6 = " "
            r5.append(r6)     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            java.lang.String r6 = r0.f260873a     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            r5.append(r6)     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            boolean r6 = r0.f260874b     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            if (r6 == 0) goto L_0x005b
            r2.write(r5)     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            goto L_0x005e
        L_0x005b:
            r3.write(r5)     // Catch:{ Exception -> 0x0095, all -> 0x008f }
        L_0x005e:
            int r5 = r0.f260875c     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            if (r5 != r4) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            boolean r0 = r0.f260874b     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            if (r5 == 0) goto L_0x0071
            if (r0 == 0) goto L_0x0071
            int r0 = r7.f260882h     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            int r0 = r0 + r4
            r7.f260882h = r0     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            goto L_0x0026
        L_0x0071:
            if (r5 == 0) goto L_0x007b
            if (r0 != 0) goto L_0x007b
            int r0 = r7.f260883i     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            int r0 = r0 + r4
            r7.f260883i = r0     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            goto L_0x0026
        L_0x007b:
            if (r5 != 0) goto L_0x0085
            if (r0 == 0) goto L_0x0085
            int r0 = r7.f260880f     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            int r0 = r0 + r4
            r7.f260880f = r0     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            goto L_0x0026
        L_0x0085:
            if (r5 != 0) goto L_0x0026
            if (r0 != 0) goto L_0x0026
            int r0 = r7.f260881g     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            int r0 = r0 + r4
            r7.f260881g = r0     // Catch:{ Exception -> 0x0095, all -> 0x008f }
            goto L_0x0026
        L_0x008f:
            r0 = move-exception
            goto L_0x009b
        L_0x0091:
            r1 = move-exception
            r3 = r0
            goto L_0x009a
        L_0x0094:
            r3 = r0
        L_0x0095:
            r0 = r2
            goto L_0x00a7
        L_0x0097:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L_0x009a:
            r0 = r1
        L_0x009b:
            if (r2 == 0) goto L_0x00a0
            r2.close()     // Catch:{ Exception -> 0x00a5 }
        L_0x00a0:
            if (r2 == 0) goto L_0x00a5
            r3.close()     // Catch:{ Exception -> 0x00a5 }
        L_0x00a5:
            throw r0
        L_0x00a6:
            r3 = r0
        L_0x00a7:
            if (r0 == 0) goto L_0x00ac
            r0.close()     // Catch:{ Exception -> 0x00b1 }
        L_0x00ac:
            if (r0 == 0) goto L_0x00b1
            r3.close()     // Catch:{ Exception -> 0x00b1 }
        L_0x00b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w30.C90895b.mo124989a():boolean");
    }

    /* renamed from: b */
    public boolean mo124990b(String str) {
        int i = this.f260882h * this.f260880f * this.f260881g;
        int i2 = this.f260883i;
        if (i * i2 == 0 || i2 < 20) {
            return false;
        }
        Map map = ((C90601a.C90602a) this.f260872a).f260324c;
        ArrayList arrayList = new ArrayList(Collections.nCopies(map.size(), ""));
        if (map.size() != arrayList.size()) {
            return false;
        }
        for (String str2 : map.keySet()) {
            arrayList.set(((Integer) map.get(str2)).intValue(), str2);
        }
        boolean b = XGBoost.m98816b(arrayList, this.f260877c, this.f260878d, this.f260879e, ((float) this.f260881g) / ((float) this.f260883i));
        if (b) {
            new File(this.f260879e).renameTo(new File(str));
        }
        return b;
    }
}
