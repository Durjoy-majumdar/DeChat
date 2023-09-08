package na1;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.expt.resource.MMResReporter;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import gy3.C87412m;
import j20.C21152b;
import j20.C21153d;
import z04.C112551y;

/* renamed from: na1.c */
public final class C34749c {

    /* renamed from: a */
    public static final C34749c f93410a = new C34749c();

    /* renamed from: b */
    public static final C21152b f93411b = new C34752c();

    /* renamed from: c */
    public static final C21153d f93412c = new C34753d();

    /* renamed from: d */
    public static final C34750a f93413d = new C34750a();

    /* renamed from: e */
    public static final C114668z.C104589a f93414e = new C34751b();

    /* renamed from: na1.c$a */
    public static final class C34750a implements C21153d {
        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            MMResReporter.C29899b bVar = MMResReporter.C29899b.onDestroy;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1401315045:
                        if (str2.equals("onDestroy")) {
                            MMResReporter.f80989a.mo56980e(bVar);
                            return;
                        }
                        return;
                    case -1064374413:
                        if (str2.equals("onActivityPreCreated")) {
                            Activity activity = null;
                            Activity activity2 = objArr != null ? objArr[0] : null;
                            if (activity2 instanceof Activity) {
                                activity = activity2;
                            }
                            if (activity != null) {
                                try {
                                    MMHandlerThread.postToMainThread(new C34745a(activity, System.nanoTime(), 7));
                                    return;
                                } catch (Throwable th) {
                                    Log.printErrStackTrace("ActivityStartReportHelper", th, "handleActivityOnCreate err", new Object[0]);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 497594859:
                        if (str2.equals("onActivityPostDestroyed")) {
                            if (objArr != null) {
                                Object obj2 = objArr[0];
                            }
                            MMResReporter.f80989a.mo56980e(bVar);
                            return;
                        }
                        return;
                    case 1046116283:
                        str2.equals("onCreate");
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: na1.c$b */
    public static final class C34751b extends C114668z.C104589a {
        public void onAppBackground(String str) {
            Log.m105918d("AssetMonitor", "onAppBackground isMain:" + MMApplicationContext.isMainProcess() + " activity = " + str);
            MMResReporter mMResReporter = MMResReporter.f80989a;
            Log.m105918d("MMResReporter", "tryReportByBroadCast() called");
            Intent intent = new Intent();
            intent.setAction("com.tencent.mm.plugin.expt.resource.MMResReporter");
            MMApplicationContext.getContext().sendBroadcast(intent);
        }

        public void onAppForeground(String str) {
            Log.m105918d("AssetMonitor", "onAppForeground() called with: activity = " + str);
        }
    }

    /* renamed from: na1.c$c */
    public static final class C34752c implements C21152b {

        /* renamed from: a */
        public long f93415a = -1;

        /* renamed from: b */
        public String f93416b = "";

        /* renamed from: a */
        public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
            if (Log.getLogLevel() <= 1) {
                Log.m105918d("AssetMonitor", "erunOnEnter() called with: innerClassName = " + str + ", innerMethodName = " + str2 + ", innerMethodDesc = " + str3 + ", methodName = " + str4 + ", methodDec = " + str5 + ", caller = " + obj + ", args = " + C34749c.f93410a.mo59724a(objArr, "args"));
            }
            if (C87412m.m108589b(str4, WeChatBrands.Business.GROUP_OPEN) && objArr != null) {
                if (!(objArr.length == 0)) {
                    String str6 = objArr[0];
                    String str7 = str6 instanceof String ? str6 : null;
                    if (str7 != null) {
                        this.f93415a = System.nanoTime();
                        this.f93416b = str7;
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
            String str6 = this.f93416b;
            long nanoTime = this.f93415a != -1 ? System.nanoTime() - this.f93415a : -1;
            this.f93415a = -1;
            this.f93416b = "";
            if (nanoTime != -1) {
                if (!(str6 == null || C112551y.m153811k(str6))) {
                    float f = ((float) nanoTime) / ((float) 1000000);
                    if (Log.getLogLevel() <= 1) {
                        Log.m105918d("AssetMonitor", "erunOnExit() assetOpen costMs=" + f + " costNs=" + nanoTime + " assetName:" + str6);
                    }
                    MMResReporter mMResReporter = MMResReporter.f80989a;
                    C87412m.m108594g(str6, "resName");
                    MMResReporter.f80991c.add(new MMResReporter.C29898a(str6, nanoTime, 4, -1));
                }
            }
        }
    }

    /* renamed from: na1.c$d */
    public static final class C34753d implements C21153d {

        /* renamed from: a */
        public long f93417a = -1;

        /* renamed from: b */
        public int f93418b = -1;

        /* renamed from: c */
        public int f93419c;

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
            int i = this.f93418b;
            int i2 = this.f93419c;
            long nanoTime = this.f93417a != -1 ? System.nanoTime() - this.f93417a : -1;
            this.f93417a = -1;
            this.f93418b = -1;
            this.f93419c = 0;
            if (i != -1 && nanoTime != -1 && i2 != 0) {
                float f = ((float) nanoTime) / ((float) 1000000);
                if (Log.getLogLevel() <= 1) {
                    Log.m105918d("AssetMonitor", "mrunOnExit() called with: costMs=" + f + " costNs=" + nanoTime + ", methodName = " + str2 + ", methodDec = " + str3 + ", caller = " + obj + ", retVal = " + obj2);
                }
                MMResReporter mMResReporter = MMResReporter.f80989a;
                MMResReporter.f80991c.add(new MMResReporter.C29898a("", nanoTime, i2, i));
            }
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo32410b(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Object r7, java.lang.Object[] r8) {
            /*
                r3 = this;
                int r0 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
                r1 = 1
                if (r0 > r1) goto L_0x0045
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "mrunOnEnter() called with: className = "
                r0.append(r2)
                r0.append(r4)
                java.lang.String r4 = ", methodName = "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = ", methodDec = "
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ", caller = "
                r0.append(r4)
                r0.append(r7)
                java.lang.String r4 = ", args = "
                r0.append(r4)
                na1.c r4 = na1.C34749c.f93410a
                java.lang.String r6 = "a:"
                java.lang.String r4 = r4.mo59724a(r8, r6)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.String r6 = "AssetMonitor"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            L_0x0045:
                r4 = 0
                if (r8 == 0) goto L_0x0053
                int r6 = r8.length
                if (r6 != 0) goto L_0x004d
                r6 = 1
                goto L_0x004e
            L_0x004d:
                r6 = 0
            L_0x004e:
                if (r6 == 0) goto L_0x0051
                goto L_0x0053
            L_0x0051:
                r6 = 0
                goto L_0x0054
            L_0x0053:
                r6 = 1
            L_0x0054:
                if (r6 == 0) goto L_0x0059
            L_0x0056:
                r1 = 0
                goto L_0x00db
            L_0x0059:
                if (r5 == 0) goto L_0x0056
                int r6 = r5.hashCode()
                r7 = 0
                switch(r6) {
                    case -1249345311: goto L_0x00be;
                    case -43291373: goto L_0x00a1;
                    case 1268565932: goto L_0x0082;
                    case 1945326087: goto L_0x0064;
                    default: goto L_0x0063;
                }
            L_0x0063:
                goto L_0x0056
            L_0x0064:
                java.lang.String r6 = "inflate"
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L_0x006d
                goto L_0x0056
            L_0x006d:
                r5 = r8[r4]
                boolean r6 = r5 instanceof java.lang.Integer
                if (r6 == 0) goto L_0x0076
                r7 = r5
                java.lang.Integer r7 = (java.lang.Integer) r7
            L_0x0076:
                if (r7 == 0) goto L_0x0056
                int r4 = r7.intValue()
                r3.f93418b = r4
                r4 = 5
                r3.f93419c = r4
                goto L_0x00db
            L_0x0082:
                java.lang.String r6 = "openRawResource"
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L_0x008c
                goto L_0x0056
            L_0x008c:
                r5 = r8[r4]
                boolean r6 = r5 instanceof java.lang.Integer
                if (r6 == 0) goto L_0x0095
                r7 = r5
                java.lang.Integer r7 = (java.lang.Integer) r7
            L_0x0095:
                if (r7 == 0) goto L_0x0056
                int r4 = r7.intValue()
                r3.f93418b = r4
                r4 = 2
                r3.f93419c = r4
                goto L_0x00db
            L_0x00a1:
                java.lang.String r6 = "getDrawableForDensity"
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L_0x00aa
                goto L_0x0056
            L_0x00aa:
                r5 = r8[r4]
                boolean r6 = r5 instanceof java.lang.Integer
                if (r6 == 0) goto L_0x00b3
                r7 = r5
                java.lang.Integer r7 = (java.lang.Integer) r7
            L_0x00b3:
                if (r7 == 0) goto L_0x0056
                int r4 = r7.intValue()
                r3.f93418b = r4
                r3.f93419c = r1
                goto L_0x00db
            L_0x00be:
                java.lang.String r6 = "getXml"
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L_0x00c7
                goto L_0x0056
            L_0x00c7:
                r5 = r8[r4]
                boolean r6 = r5 instanceof java.lang.Integer
                if (r6 == 0) goto L_0x00d0
                r7 = r5
                java.lang.Integer r7 = (java.lang.Integer) r7
            L_0x00d0:
                if (r7 == 0) goto L_0x0056
                int r4 = r7.intValue()
                r3.f93418b = r4
                r4 = 3
                r3.f93419c = r4
            L_0x00db:
                if (r1 == 0) goto L_0x00e3
                long r4 = java.lang.System.nanoTime()
                r3.f93417a = r4
            L_0x00e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: na1.C34749c.C34753d.mo32410b(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[]):void");
        }
    }

    /* renamed from: a */
    public final String mo59724a(Object[] objArr, String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        StringBuilder sb = new StringBuilder(str);
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Object obj = objArr[i];
                sb.append("i:" + i2 + " v:" + obj);
                i++;
                i2++;
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder(title).app…   }\n        }.toString()");
        return sb4;
    }
}
