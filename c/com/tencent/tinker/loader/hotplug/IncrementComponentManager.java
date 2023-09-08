package com.tencent.tinker.loader.hotplug;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.eclipsesource.mmv8.Platform;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class IncrementComponentManager {
    private static final AttrTranslator<ActivityInfo> ACTIVITY_INFO_ATTR_TRANSLATOR = new AttrTranslator<ActivityInfo>() {
        private int parseLaunchMode(String str) {
            if ("standard".equalsIgnoreCase(str)) {
                return 0;
            }
            if ("singleTop".equalsIgnoreCase(str)) {
                return 1;
            }
            if ("singleTask".equalsIgnoreCase(str)) {
                return 2;
            }
            if ("singleInstance".equalsIgnoreCase(str)) {
                return 3;
            }
            ShareTinkerLog.m106534w(IncrementComponentManager.TAG, "Unknown launchMode: " + str, new Object[0]);
            return 0;
        }

        private int parseScreenOrientation(String str) {
            if ("unspecified".equalsIgnoreCase(str)) {
                return -1;
            }
            if ("behind".equalsIgnoreCase(str)) {
                return 3;
            }
            if ("landscape".equalsIgnoreCase(str)) {
                return 0;
            }
            if ("portrait".equalsIgnoreCase(str)) {
                return 1;
            }
            if ("reverseLandscape".equalsIgnoreCase(str)) {
                return 8;
            }
            if ("reversePortrait".equalsIgnoreCase(str)) {
                return 9;
            }
            if ("sensorLandscape".equalsIgnoreCase(str)) {
                return 6;
            }
            if ("sensorPortrait".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("sensor".equalsIgnoreCase(str)) {
                return 4;
            }
            if ("fullSensor".equalsIgnoreCase(str)) {
                return 10;
            }
            if ("nosensor".equalsIgnoreCase(str)) {
                return 5;
            }
            if ("user".equalsIgnoreCase(str)) {
                return 2;
            }
            if ("fullUser".equalsIgnoreCase(str)) {
                return 13;
            }
            if ("locked".equalsIgnoreCase(str)) {
                return 14;
            }
            if ("userLandscape".equalsIgnoreCase(str)) {
                return 11;
            }
            return "userPortrait".equalsIgnoreCase(str) ? 12 : -1;
        }

        public void onInit(Context context, int i, XmlPullParser xmlPullParser) {
            if (i == 0) {
                try {
                    if (xmlPullParser.getEventType() != 2 || !EnvConsts.ACTIVITY_MANAGER_SRVNAME.equals(xmlPullParser.getName())) {
                        throw new IllegalStateException("unexpected xml parser state when parsing incremental component manifest.");
                    }
                } catch (XmlPullParserException e) {
                    throw new IllegalStateException(e);
                }
            }
        }

        public void onTranslate(Context context, int i, String str, String str2, ActivityInfo activityInfo) {
            int i2 = 0;
            if ("name".equals(str)) {
                if (str2.charAt(0) == '.') {
                    activityInfo.name = context.getPackageName() + str2;
                    return;
                }
                activityInfo.name = str2;
            } else if ("parentActivityName".equals(str)) {
                if (str2.charAt(0) == '.') {
                    activityInfo.parentActivityName = context.getPackageName() + str2;
                    return;
                }
                activityInfo.parentActivityName = str2;
            } else if ("exported".equals(str)) {
                activityInfo.exported = "true".equalsIgnoreCase(str2);
            } else if ("launchMode".equals(str)) {
                activityInfo.launchMode = parseLaunchMode(str2);
            } else if ("theme".equals(str)) {
                activityInfo.theme = context.getResources().getIdentifier(str2, "style", context.getPackageName());
            } else if ("uiOptions".equals(str)) {
                activityInfo.uiOptions = Integer.decode(str2).intValue();
            } else if ("permission".equals(str)) {
                activityInfo.permission = str2;
            } else if ("taskAffinity".equals(str)) {
                activityInfo.taskAffinity = str2;
            } else if ("multiprocess".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 1;
                } else {
                    activityInfo.flags &= -2;
                }
            } else if ("finishOnTaskLaunch".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 2;
                } else {
                    activityInfo.flags &= -3;
                }
            } else if ("clearTaskOnLaunch".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 4;
                } else {
                    activityInfo.flags &= -5;
                }
            } else if ("noHistory".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 128;
                } else {
                    activityInfo.flags &= -129;
                }
            } else if ("alwaysRetainTaskState".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 8;
                } else {
                    activityInfo.flags &= -9;
                }
            } else if ("stateNotNeeded".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 16;
                } else {
                    activityInfo.flags &= -17;
                }
            } else if ("excludeFromRecents".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 32;
                } else {
                    activityInfo.flags &= -33;
                }
            } else if ("allowTaskReparenting".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 64;
                } else {
                    activityInfo.flags &= -65;
                }
            } else if ("finishOnCloseSystemDialogs".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 256;
                } else {
                    activityInfo.flags &= -257;
                }
            } else if ("showOnLockScreen".equals(str) || "showForAllUsers".equals(str)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    int valueOfStaticIntField = ShareReflectUtil.getValueOfStaticIntField(ActivityInfo.class, "FLAG_SHOW_FOR_ALL_USERS", 0);
                    if ("true".equalsIgnoreCase(str2)) {
                        activityInfo.flags = valueOfStaticIntField | activityInfo.flags;
                        return;
                    }
                    activityInfo.flags = (~valueOfStaticIntField) & activityInfo.flags;
                }
            } else if ("immersive".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 2048;
                } else {
                    activityInfo.flags &= -2049;
                }
            } else if ("hardwareAccelerated".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 512;
                } else {
                    activityInfo.flags &= -513;
                }
            } else if ("documentLaunchMode".equals(str)) {
                activityInfo.documentLaunchMode = Integer.decode(str2).intValue();
            } else if ("maxRecents".equals(str)) {
                activityInfo.maxRecents = Integer.decode(str2).intValue();
            } else if ("configChanges".equals(str)) {
                activityInfo.configChanges = Integer.decode(str2).intValue();
            } else if ("windowSoftInputMode".equals(str)) {
                activityInfo.softInputMode = Integer.decode(str2).intValue();
            } else if ("persistableMode".equals(str)) {
                activityInfo.persistableMode = Integer.decode(str2).intValue();
            } else if ("allowEmbedded".equals(str)) {
                int valueOfStaticIntField2 = ShareReflectUtil.getValueOfStaticIntField(ActivityInfo.class, "FLAG_ALLOW_EMBEDDED", 0);
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags = valueOfStaticIntField2 | activityInfo.flags;
                    return;
                }
                activityInfo.flags = (~valueOfStaticIntField2) & activityInfo.flags;
            } else if ("autoRemoveFromRecents".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 8192;
                } else {
                    activityInfo.flags &= -8193;
                }
            } else if ("relinquishTaskIdentity".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 4096;
                } else {
                    activityInfo.flags &= -4097;
                }
            } else if ("resumeWhilePausing".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 16384;
                } else {
                    activityInfo.flags &= -16385;
                }
            } else if ("screenOrientation".equals(str)) {
                activityInfo.screenOrientation = parseScreenOrientation(str2);
            } else if ("label".equals(str)) {
                try {
                    i2 = context.getResources().getIdentifier(str2, "string", IncrementComponentManager.sPackageName);
                } catch (Throwable unused) {
                }
                if (i2 != 0) {
                    activityInfo.labelRes = i2;
                } else {
                    activityInfo.nonLocalizedLabel = str2;
                }
            } else if ("icon".equals(str)) {
                try {
                    activityInfo.icon = context.getResources().getIdentifier(str2, (String) null, IncrementComponentManager.sPackageName);
                } catch (Throwable unused2) {
                }
            } else if ("banner".equals(str)) {
                activityInfo.banner = context.getResources().getIdentifier(str2, (String) null, IncrementComponentManager.sPackageName);
            } else if ("logo".equals(str)) {
                activityInfo.logo = context.getResources().getIdentifier(str2, (String) null, IncrementComponentManager.sPackageName);
            }
        }
    };
    private static final Map<String, ActivityInfo> CLASS_NAME_TO_ACTIVITY_INFO_MAP = new HashMap();
    private static final Map<String, IntentFilter> CLASS_NAME_TO_INTENT_FILTER_MAP = new HashMap();
    private static final String TAG = "Tinker.IncrementCompMgr";
    private static final int TAG_ACTIVITY = 0;
    private static final int TAG_PROVIDER = 2;
    private static final int TAG_RECEIVER = 3;
    private static final int TAG_SERVICE = 1;
    private static Context sContext;
    private static volatile boolean sInitialized;
    /* access modifiers changed from: private */
    public static String sPackageName;

    public static abstract class AttrTranslator<T_RESULT> {
        private AttrTranslator() {
        }

        public void onInit(Context context, int i, XmlPullParser xmlPullParser) {
        }

        public abstract void onTranslate(Context context, int i, String str, String str2, T_RESULT t_result);

        public final void translate(Context context, int i, XmlPullParser xmlPullParser, T_RESULT t_result) {
            onInit(context, i, xmlPullParser);
            int attributeCount = xmlPullParser.getAttributeCount();
            for (int i2 = 0; i2 < attributeCount; i2++) {
                if (Platform.ANDROID.equals(xmlPullParser.getAttributePrefix(i2))) {
                    onTranslate(context, i, xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2), t_result);
                }
            }
        }
    }

    private IncrementComponentManager() {
        throw new UnsupportedOperationException();
    }

    private static synchronized void ensureInitialized() {
        synchronized (IncrementComponentManager.class) {
            if (!sInitialized) {
                throw new IllegalStateException("Not initialized!!");
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0094 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00ad */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00aa A[SYNTHETIC, Splitter:B:54:0x00aa] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean init(android.content.Context r6, com.tencent.tinker.loader.shareutil.ShareSecurityCheck r7) {
        /*
            java.lang.Class<com.tencent.tinker.loader.hotplug.IncrementComponentManager> r0 = com.tencent.tinker.loader.hotplug.IncrementComponentManager.class
            monitor-enter(r0)
            java.util.HashMap r1 = r7.getMetaContentMap()     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "assets/inc_component_meta.txt"
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x001c
            java.lang.String r6 = "Tinker.IncrementCompMgr"
            java.lang.String r7 = "package has no incremental component meta, skip init."
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b1 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r6, r7, r2)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)
            return r1
        L_0x001c:
            boolean r1 = r6 instanceof android.content.ContextWrapper     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x002c
            r1 = r6
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1     // Catch:{ all -> 0x00b1 }
            android.content.Context r1 = r1.getBaseContext()     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r6 = r1
            goto L_0x001c
        L_0x002c:
            sContext = r6     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = r6.getPackageName()     // Catch:{ all -> 0x00b1 }
            sPackageName = r1     // Catch:{ all -> 0x00b1 }
            java.util.HashMap r7 = r7.getMetaContentMap()     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "assets/inc_component_meta.txt"
            java.lang.Object r7 = r7.get(r1)     // Catch:{ all -> 0x00b1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00b1 }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ all -> 0x00b1 }
            r1.<init>(r7)     // Catch:{ all -> 0x00b1 }
            r7 = 0
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x00a0, all -> 0x009d }
            r2.setInput(r1)     // Catch:{ XmlPullParserException -> 0x009b }
            int r3 = r2.getEventType()     // Catch:{ XmlPullParserException -> 0x009b }
        L_0x0051:
            r4 = 1
            if (r3 == r4) goto L_0x008f
            r4 = 2
            if (r3 == r4) goto L_0x0058
            goto L_0x008a
        L_0x0058:
            java.lang.String r3 = r2.getName()     // Catch:{ XmlPullParserException -> 0x009b }
            java.lang.String r4 = "activity"
            boolean r4 = r4.equalsIgnoreCase(r3)     // Catch:{ XmlPullParserException -> 0x009b }
            if (r4 == 0) goto L_0x0070
            android.content.pm.ActivityInfo r3 = parseActivity(r6, r2)     // Catch:{ XmlPullParserException -> 0x009b }
            java.util.Map<java.lang.String, android.content.pm.ActivityInfo> r4 = CLASS_NAME_TO_ACTIVITY_INFO_MAP     // Catch:{ XmlPullParserException -> 0x009b }
            java.lang.String r5 = r3.name     // Catch:{ XmlPullParserException -> 0x009b }
            r4.put(r5, r3)     // Catch:{ XmlPullParserException -> 0x009b }
            goto L_0x008a
        L_0x0070:
            java.lang.String r4 = "service"
            boolean r4 = r4.equalsIgnoreCase(r3)     // Catch:{ XmlPullParserException -> 0x009b }
            if (r4 == 0) goto L_0x007a
            goto L_0x008a
        L_0x007a:
            java.lang.String r4 = "receiver"
            boolean r4 = r4.equalsIgnoreCase(r3)     // Catch:{ XmlPullParserException -> 0x009b }
            if (r4 == 0) goto L_0x0084
            goto L_0x008a
        L_0x0084:
            java.lang.String r4 = "provider"
            r4.equalsIgnoreCase(r3)     // Catch:{ XmlPullParserException -> 0x009b }
        L_0x008a:
            int r3 = r2.next()     // Catch:{ XmlPullParserException -> 0x009b }
            goto L_0x0051
        L_0x008f:
            sInitialized = r4     // Catch:{ XmlPullParserException -> 0x009b }
            r2.setInput(r7)     // Catch:{ all -> 0x0094 }
        L_0x0094:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r1)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)
            return r4
        L_0x0099:
            r6 = move-exception
            goto L_0x00a8
        L_0x009b:
            r6 = move-exception
            goto L_0x00a2
        L_0x009d:
            r6 = move-exception
            r2 = r7
            goto L_0x00a8
        L_0x00a0:
            r6 = move-exception
            r2 = r7
        L_0x00a2:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0099 }
            r3.<init>(r6)     // Catch:{ all -> 0x0099 }
            throw r3     // Catch:{ all -> 0x0099 }
        L_0x00a8:
            if (r2 == 0) goto L_0x00ad
            r2.setInput(r7)     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r1)     // Catch:{ all -> 0x00b1 }
            throw r6     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.hotplug.IncrementComponentManager.init(android.content.Context, com.tencent.tinker.loader.shareutil.ShareSecurityCheck):boolean");
    }

    public static boolean isIncrementActivity(String str) {
        ensureInitialized();
        return str != null && CLASS_NAME_TO_ACTIVITY_INFO_MAP.containsKey(str);
    }

    private static synchronized ActivityInfo parseActivity(Context context, XmlPullParser xmlPullParser) {
        ActivityInfo activityInfo;
        synchronized (IncrementComponentManager.class) {
            activityInfo = new ActivityInfo();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            activityInfo.applicationInfo = applicationInfo;
            activityInfo.packageName = sPackageName;
            activityInfo.processName = applicationInfo.processName;
            activityInfo.launchMode = 0;
            activityInfo.permission = applicationInfo.permission;
            activityInfo.screenOrientation = -1;
            activityInfo.taskAffinity = applicationInfo.taskAffinity;
            if ((applicationInfo.flags & 536870912) != 0) {
                activityInfo.flags |= 512;
            }
            activityInfo.documentLaunchMode = 0;
            activityInfo.uiOptions = applicationInfo.uiOptions;
            ACTIVITY_INFO_ATTR_TRANSLATOR.translate(context, 0, xmlPullParser, activityInfo);
            int depth = xmlPullParser.getDepth();
            while (true) {
                int next = xmlPullParser.next();
                if (next != 1) {
                    if (next == 3 && xmlPullParser.getDepth() <= depth) {
                        break;
                    } else if (next != 3) {
                        if (next != 4) {
                            String name = xmlPullParser.getName();
                            if ("intent-filter".equalsIgnoreCase(name)) {
                                parseIntentFilter(context, activityInfo.name, xmlPullParser);
                            } else if ("meta-data".equalsIgnoreCase(name)) {
                                parseMetaData(context, activityInfo, xmlPullParser);
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return activityInfo;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:2|3|(1:5)|6|7|(3:9|10|11)|12|13|(2:14|(1:77)(2:16|(2:(1:79)(2:22|(2:24|80)(4:25|(2:27|(1:29))(2:30|(2:32|(1:34))(2:35|(18:37|(2:39|40)|45|(1:47)|48|(1:50)|51|(1:53)|54|(1:56)|57|(1:59)|60|(1:62)|63|(1:65)|66|(1:68))))|69|81))|76)(2:78|20)))|70|71) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0050 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[Catch:{ MalformedMimeTypeException -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0122 A[EDGE_INSN: B:77:0x0122->B:70:0x0122 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void parseIntentFilter(android.content.Context r9, java.lang.String r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            java.lang.Class<com.tencent.tinker.loader.hotplug.IncrementComponentManager> r9 = com.tencent.tinker.loader.hotplug.IncrementComponentManager.class
            monitor-enter(r9)
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x0129 }
            r0.<init>()     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = "priority"
            r2 = 0
            java.lang.String r1 = r11.getAttributeValue(r2, r1)     // Catch:{ all -> 0x0129 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0129 }
            if (r3 != 0) goto L_0x0021
            java.lang.Integer r1 = java.lang.Integer.decode(r1)     // Catch:{ all -> 0x0129 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0129 }
            r0.setPriority(r1)     // Catch:{ all -> 0x0129 }
        L_0x0021:
            java.lang.String r1 = "autoVerify"
            java.lang.String r1 = r11.getAttributeValue(r2, r1)     // Catch:{ all -> 0x0129 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0129 }
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0050
            java.lang.Class<android.content.IntentFilter> r3 = android.content.IntentFilter.class
            java.lang.String r6 = "setAutoVerify"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x0050 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0050 }
            r7[r4] = r8     // Catch:{ all -> 0x0050 }
            java.lang.reflect.Method r3 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod((java.lang.Class<?>) r3, (java.lang.String) r6, (java.lang.Class<?>[]) r7)     // Catch:{ all -> 0x0050 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0050 }
            java.lang.String r7 = "true"
            boolean r1 = r7.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0050 }
            r6[r4] = r1     // Catch:{ all -> 0x0050 }
            r3.invoke(r0, r6)     // Catch:{ all -> 0x0050 }
        L_0x0050:
            int r1 = r11.getDepth()     // Catch:{ all -> 0x0129 }
        L_0x0054:
            int r3 = r11.next()     // Catch:{ all -> 0x0129 }
            if (r3 == r5) goto L_0x0122
            r6 = 3
            if (r3 != r6) goto L_0x0065
            int r7 = r11.getDepth()     // Catch:{ all -> 0x0129 }
            if (r7 > r1) goto L_0x0065
            goto L_0x0122
        L_0x0065:
            if (r3 == r6) goto L_0x0054
            r6 = 4
            if (r3 != r6) goto L_0x006b
            goto L_0x0054
        L_0x006b:
            java.lang.String r3 = r11.getName()     // Catch:{ all -> 0x0129 }
            java.lang.String r6 = "action"
            boolean r6 = r6.equals(r3)     // Catch:{ all -> 0x0129 }
            if (r6 == 0) goto L_0x0084
            java.lang.String r3 = "name"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x011d
            r0.addAction(r3)     // Catch:{ all -> 0x0129 }
            goto L_0x011d
        L_0x0084:
            java.lang.String r6 = "category"
            boolean r6 = r6.equals(r3)     // Catch:{ all -> 0x0129 }
            if (r6 == 0) goto L_0x0099
            java.lang.String r3 = "name"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x011d
            r0.addCategory(r3)     // Catch:{ all -> 0x0129 }
            goto L_0x011d
        L_0x0099:
            java.lang.String r6 = "data"
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x011d
            java.lang.String r3 = "mimeType"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x00b6
            r0.addDataType(r3)     // Catch:{ MalformedMimeTypeException -> 0x00ad }
            goto L_0x00b6
        L_0x00ad:
            r10 = move-exception
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = "bad mimeType"
            r0.<init>(r1, r11, r10)     // Catch:{ all -> 0x0129 }
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x00b6:
            java.lang.String r3 = "scheme"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x00c2
            r0.addDataScheme(r3)     // Catch:{ all -> 0x0129 }
        L_0x00c2:
            java.lang.String r3 = "ssp"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x00ce
            r0.addDataSchemeSpecificPart(r3, r4)     // Catch:{ all -> 0x0129 }
        L_0x00ce:
            java.lang.String r3 = "sspPrefix"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x00da
            r0.addDataSchemeSpecificPart(r3, r5)     // Catch:{ all -> 0x0129 }
        L_0x00da:
            java.lang.String r3 = "sspPattern"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            r6 = 2
            if (r3 == 0) goto L_0x00e7
            r0.addDataSchemeSpecificPart(r3, r6)     // Catch:{ all -> 0x0129 }
        L_0x00e7:
            java.lang.String r3 = "host"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            java.lang.String r7 = "port"
            java.lang.String r7 = r11.getAttributeValue(r2, r7)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x00f9
            r0.addDataAuthority(r3, r7)     // Catch:{ all -> 0x0129 }
        L_0x00f9:
            java.lang.String r3 = "path"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x0105
            r0.addDataPath(r3, r4)     // Catch:{ all -> 0x0129 }
        L_0x0105:
            java.lang.String r3 = "pathPrefix"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x0111
            r0.addDataPath(r3, r5)     // Catch:{ all -> 0x0129 }
        L_0x0111:
            java.lang.String r3 = "pathPattern"
            java.lang.String r3 = r11.getAttributeValue(r2, r3)     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x011d
            r0.addDataPath(r3, r6)     // Catch:{ all -> 0x0129 }
        L_0x011d:
            skipCurrentTag(r11)     // Catch:{ all -> 0x0129 }
            goto L_0x0054
        L_0x0122:
            java.util.Map<java.lang.String, android.content.IntentFilter> r11 = CLASS_NAME_TO_INTENT_FILTER_MAP     // Catch:{ all -> 0x0129 }
            r11.put(r10, r0)     // Catch:{ all -> 0x0129 }
            monitor-exit(r9)
            return
        L_0x0129:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.hotplug.IncrementComponentManager.parseIntentFilter(android.content.Context, java.lang.String, org.xmlpull.v1.XmlPullParser):void");
    }

    private static synchronized void parseMetaData(Context context, ActivityInfo activityInfo, XmlPullParser xmlPullParser) {
        Class<IncrementComponentManager> cls = IncrementComponentManager.class;
        synchronized (cls) {
            ClassLoader classLoader = cls.getClassLoader();
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "name");
            String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "value");
            if (!TextUtils.isEmpty(attributeValue)) {
                if (activityInfo.metaData == null) {
                    activityInfo.metaData = new Bundle(classLoader);
                }
                activityInfo.metaData.putString(attributeValue, attributeValue2);
            }
        }
    }

    public static ActivityInfo queryActivityInfo(String str) {
        ensureInitialized();
        if (str != null) {
            return CLASS_NAME_TO_ACTIVITY_INFO_MAP.get(str);
        }
        return null;
    }

    public static ResolveInfo resolveIntent(Intent intent) {
        IntentFilter intentFilter;
        String str;
        ensureInitialized();
        ComponentName component = intent.getComponent();
        int i = -1;
        int i2 = 0;
        if (component != null) {
            str = component.getClassName();
            if (CLASS_NAME_TO_ACTIVITY_INFO_MAP.containsKey(str)) {
                i = 0;
            } else {
                str = null;
            }
            intentFilter = null;
        } else {
            String str2 = null;
            intentFilter = null;
            int i3 = -1;
            int i4 = 0;
            for (Map.Entry next : CLASS_NAME_TO_INTENT_FILTER_MAP.entrySet()) {
                String str3 = (String) next.getKey();
                IntentFilter intentFilter2 = (IntentFilter) next.getValue();
                int match = intentFilter2.match(intent.getAction(), intent.getType(), intent.getScheme(), intent.getData(), intent.getCategories(), TAG);
                boolean z = (match == -3 || match == -4 || match == -2 || match == -1) ? false : true;
                int priority = intentFilter2.getPriority();
                if (z && priority > i3) {
                    intentFilter = intentFilter2;
                    str2 = str3;
                    i4 = match;
                    i3 = priority;
                }
            }
            str = str2;
            i = i3;
            i2 = i4;
        }
        if (str == null) {
            return null;
        }
        ResolveInfo resolveInfo = new ResolveInfo();
        ActivityInfo activityInfo = CLASS_NAME_TO_ACTIVITY_INFO_MAP.get(str);
        resolveInfo.activityInfo = activityInfo;
        resolveInfo.filter = intentFilter;
        resolveInfo.match = i2;
        resolveInfo.priority = i;
        resolveInfo.resolvePackageName = sPackageName;
        resolveInfo.icon = activityInfo.icon;
        resolveInfo.labelRes = activityInfo.labelRes;
        return resolveInfo;
    }

    private static void skipCurrentTag(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }
}
