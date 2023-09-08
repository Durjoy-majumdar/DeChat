package ra1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExtAgentLifeEvent;
import com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager;
import com.tencent.p014mm.pluginsdk.model.C44596s0;
import com.tencent.p014mm.pluginsdk.model.C44599z0;
import com.tencent.p014mm.pluginsdk.model.app.C44551e1;
import com.tencent.p014mm.pluginsdk.model.app.C44552f;
import com.tencent.p014mm.pluginsdk.model.app.C44554g;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30733e5;
import com.tencent.p014mm.storage.C30739f5;
import com.tencent.p014mm.storage.C30759m4;
import com.tencent.p014mm.storage.C30761n4;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import di3.C86301e;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import g62.C75875l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import p156gj.C107842p;
import p206nj.C11171e;
import p206nj.C88957l;
import p763ym.C53543s;
import p763ym.C79138l;
import sa1.C36646a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ra1.b */
public class C47958b extends C86301e {

    /* renamed from: t */
    public static boolean f128650t = false;

    /* renamed from: d */
    public C85801v1 f128651d;

    /* renamed from: e */
    public C30761n4 f128652e;

    /* renamed from: f */
    public C30739f5 f128653f;

    /* renamed from: g */
    public C36646a f128654g;

    /* renamed from: h */
    public HashMap<String, Integer> f128655h = new HashMap<>();

    /* renamed from: i */
    public C44596s0.C44597a f128656i = new C47959a();

    /* renamed from: j */
    public MMHandler f128657j = new C36271b(Looper.getMainLooper());

    /* renamed from: n */
    public LinkedList<String> f128658n = new LinkedList<>();

    /* renamed from: o */
    public MMHandler f128659o = new C36272c(Looper.getMainLooper());

    /* renamed from: p */
    public MStorage.IOnStorageChange f128660p = new C36273d();

    /* renamed from: q */
    public MStorageEx.IOnStorageChange f128661q = new C36274e();

    /* renamed from: r */
    public boolean f128662r = true;

    /* renamed from: s */
    public boolean f128663s = false;

    /* renamed from: ra1.b$b */
    public class C36271b extends MMHandler {
        public C36271b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (MMApplicationContext.getContext() == null || !C97625j3.m125811a()) {
                Log.m105928w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler wrong status");
                return;
            }
            Cursor rawQuery = C47958b.zx0().rawQuery("select * from OpenMsgListener where (status = ?) ", "1");
            if (rawQuery == null) {
                Log.m105924i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler getValidOpenMsgListener cu == null");
                return;
            }
            Log.m105919d("MicroMsg.SubCoreExt", "notifyMsgChangeHandler listener count = %s", Integer.valueOf(rawQuery.getCount()));
            if (rawQuery.getCount() <= 0) {
                rawQuery.close();
                Log.m105924i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler cu.getCount() <= 0");
                return;
            }
            try {
                if (rawQuery.moveToFirst()) {
                    HashMap hashMap = new HashMap();
                    synchronized (C47958b.this) {
                        hashMap.putAll(C47958b.this.f128655h);
                        C47958b.this.f128655h.clear();
                    }
                    do {
                        LinkedList linkedList = new LinkedList();
                        ArrayList arrayList = new ArrayList();
                        if (hashMap.entrySet() == null) {
                            Log.m105928w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler waitForNotify.entrySet() == null");
                            return;
                        }
                        C30759m4 m4Var = new C30759m4();
                        m4Var.convertFrom(rawQuery);
                        if (!Util.isNullOrNil(m4Var.field_appId)) {
                            if (!Util.isNullOrNil(m4Var.field_packageName)) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    String nullAsNil = Util.nullAsNil((String) entry.getKey());
                                    Integer num = (Integer) entry.getValue();
                                    C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(nullAsNil);
                                    if (j != null && !Util.isNullOrNil(j.getUsername()) && j.mo108786G2() <= 0) {
                                        Log.m105924i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler no unread in conversation");
                                    } else if (!C45628s0.m50751P(nullAsNil)) {
                                        if (!C72996z1.m85820U5(nullAsNil)) {
                                            if (!C45628s0.m50738C(nullAsNil)) {
                                                C30733e5 jo = C47958b.Ax0().mo57648jo(m4Var.field_appId, nullAsNil);
                                                if (jo != null && !Util.isNullOrNil(jo.field_openId)) {
                                                    if (!Util.isNullOrNil(jo.field_username)) {
                                                        Log.m105927v("MicroMsg.SubCoreExt", "username[%s], appId[%s], openId[%s]", jo.field_username, jo.field_appId, jo.field_openId);
                                                        arrayList.add(String.format("%s,%s,%s", new Object[]{jo.field_openId, num, Long.valueOf(System.currentTimeMillis() - 1600)}));
                                                    }
                                                }
                                                Log.m105918d("MicroMsg.SubCoreExt", "notifyMsgChangeHandler openId is null, go get it.");
                                                Integer num2 = C47958b.this.f128655h.get(nullAsNil);
                                                if (num2 == null) {
                                                    C47958b.this.f128655h.put(nullAsNil, num);
                                                } else {
                                                    C47958b.this.f128655h.put(nullAsNil, Integer.valueOf(num2.intValue() + num.intValue()));
                                                }
                                                linkedList.add(nullAsNil);
                                            }
                                        }
                                    }
                                }
                                if (linkedList.size() > 0) {
                                    Log.m105924i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler doGetGetUserInfoInApp");
                                    C47958b.this.vx0(m4Var.field_appId, linkedList);
                                }
                                if (arrayList.size() <= 0) {
                                    rawQuery.close();
                                    Log.m105924i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler userDataList.size() <= 0");
                                    return;
                                }
                                if (!(m4Var.field_status == 1)) {
                                    Log.m105929w("MicroMsg.SubCoreExt", "invalid msgListener, appid = %s, package = %s", m4Var.field_appId, m4Var.field_packageName);
                                } else if (!Util.isNullOrNil(m4Var.field_appId) && !Util.isNullOrNil(m4Var.field_packageName)) {
                                    Log.m105925i("MicroMsg.SubCoreExt", "notify app, appId = %s, package = %s", m4Var.field_appId, m4Var.field_packageName);
                                    Intent intent = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_NOTIFY_MSG");
                                    intent.addCategory("com.tencent.mm.category." + m4Var.field_packageName);
                                    if (C11171e.m11046c(12)) {
                                        intent.setFlags(32);
                                    }
                                    intent.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "NEW_MESSAGE");
                                    intent.putStringArrayListExtra("EXTRA_EXT_OPEN_USER_DATA", arrayList);
                                    MMApplicationContext.getContext().sendBroadcast(intent);
                                }
                            }
                        }
                        Log.m105929w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler wrong msgListener, appid = %s, package = %s", m4Var.field_appId, m4Var.field_packageName);
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SubCoreExt", "Exception in handleMessage, %s", e.getMessage());
                rawQuery.close();
            }
        }
    }

    /* renamed from: ra1.b$c */
    public class C36272c extends MMHandler {
        public C36272c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            try {
                if (C47958b.this.f128658n.size() > 0) {
                    Iterator<String> it = C47958b.this.f128658n.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (!"*".equals(next)) {
                            C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(next, false);
                            if (GW == null) {
                                Log.m105928w("MicroMsg.SubCoreExt", "appInfo is null");
                            } else if (Util.isNullOrNil(GW.field_appId)) {
                                Log.m105928w("MicroMsg.SubCoreExt", "appId is null");
                            } else {
                                Log.m105919d("MicroMsg.SubCoreExt", "onAppInfoStgChange, notify[%s], appFlag[%s], id[%s]", next, Integer.valueOf(GW.field_appInfoFlag), GW.field_appId);
                                C30759m4 jo = C47958b.zx0().mo57671jo(GW.field_appId);
                                if (jo == null) {
                                    Log.m105929w("MicroMsg.SubCoreExt", "openMsgListener is null, appId = %s", GW.field_appId);
                                } else {
                                    if (C44565l.m48983c(GW)) {
                                        if (jo.field_status != 1) {
                                            jo.field_status = 1;
                                        }
                                    } else if (jo.field_status != 0) {
                                        jo.field_status = 0;
                                    }
                                    C47958b.zx0().mo57670Lo(GW.field_appId, jo);
                                }
                            }
                        }
                    }
                    C47958b.this.f128658n.clear();
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SubCoreExt", "exception in onAppInfoStgChange, %s", e.getMessage());
            }
        }
    }

    /* renamed from: ra1.b$d */
    public class C36273d implements MStorage.IOnStorageChange {
        public C36273d() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (!C47958b.this.f128658n.contains(str)) {
                C47958b.this.f128658n.add(str);
            }
            C47958b.this.f128659o.removeMessages(0);
            C47958b.this.f128659o.sendEmptyMessageDelayed(0, 60);
        }
    }

    /* renamed from: ra1.b$e */
    public class C36274e implements MStorageEx.IOnStorageChange {
        public C36274e() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            if (obj == null || !(obj instanceof String)) {
                Log.m105919d("MicroMsg.SubCoreExt", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            } else if (!C97625j3.m125811a()) {
                Log.m105924i("MicroMsg.SubCoreExt", "onNotifyChange acc not ready");
            } else if (mStorageEx == C97625j3.m125812b().mo105907v()) {
                C47958b.this.Bx0(false);
            }
        }
    }

    /* renamed from: ra1.b$a */
    public class C47959a implements C44596s0.C44597a {
        public C47959a() {
        }
    }

    /* renamed from: ra1.b$f */
    public class C47960f implements Runnable {
        public C47960f() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[SYNTHETIC, Splitter:B:22:0x008c] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0190 A[Catch:{ Exception -> 0x01b8 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r1 = r18
                java.lang.Class<lc3.b> r0 = lc3.C10485b.class
                java.lang.String r2 = "MicroMsg.SubCoreExt"
                r3 = 0
                r4 = 1
                k40.a r5 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x01b8 }
                lc3.b r5 = (lc3.C10485b) r5     // Catch:{ Exception -> 0x01b8 }
                pj.f r5 = r5.vh0()     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r6 = "VoiceRecognizeSprSoMD5"
                java.lang.String r5 = r5.mo107405c(r6)     // Catch:{ Exception -> 0x01b8 }
                k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x01b8 }
                lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x01b8 }
                pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r6 = "VoiceRecognizeSprDataMD5"
                java.lang.String r0 = r0.mo107405c(r6)     // Catch:{ Exception -> 0x01b8 }
                r6 = 2
                if (r5 == 0) goto L_0x01a8
                if (r0 == 0) goto L_0x01a8
                boolean r7 = p156gj.C87203t.m108279o()     // Catch:{ Exception -> 0x01b8 }
                if (r7 == 0) goto L_0x0035
                goto L_0x01a8
            L_0x0035:
                java.lang.String r7 = "/system/lib/"
                int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01b8 }
                r9 = 24
                if (r8 < r9) goto L_0x003f
                java.lang.String r7 = "/vendor/lib/"
            L_0x003f:
                java.lang.String r8 = "mMd5So:%s,  mMd5Data:%s,  mSoPath:%s"
                r9 = 3
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01b8 }
                r9[r3] = r5     // Catch:{ Exception -> 0x01b8 }
                r9[r4] = r0     // Catch:{ Exception -> 0x01b8 }
                r9[r6] = r7     // Catch:{ Exception -> 0x01b8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r9)     // Catch:{ Exception -> 0x01b8 }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b8 }
                q9.b r10 = p820q9.C47781b.C47782a.f128311a     // Catch:{ Exception -> 0x01b8 }
                android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01b8 }
                q9.e r10 = r10.f128310a     // Catch:{ Exception -> 0x01b8 }
                boolean r12 = r10.f128321d     // Catch:{ Exception -> 0x01b8 }
                if (r12 == 0) goto L_0x005e
                goto L_0x0069
            L_0x005e:
                com.qq.wx.voice.embed.recognizer.Grammar r12 = r10.f128318a     // Catch:{ Exception -> 0x01b8 }
                int r0 = r12.checkFiles(r11, r7, r5, r0)     // Catch:{ Exception -> 0x01b8 }
                if (r0 >= 0) goto L_0x0067
                goto L_0x006a
            L_0x0067:
                r10.f128321d = r4     // Catch:{ Exception -> 0x01b8 }
            L_0x0069:
                r0 = 0
            L_0x006a:
                android.content.SharedPreferences r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r7 = "checkFiles ret:%s,use time:%s"
                java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01b8 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01b8 }
                r10[r3] = r11     // Catch:{ Exception -> 0x01b8 }
                long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b8 }
                long r11 = r11 - r8
                java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x01b8 }
                r10[r4] = r8     // Catch:{ Exception -> 0x01b8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r10)     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r7 = "hasTryToInitVoiceControlData"
                java.lang.String r8 = "hasInitVoiceControlData"
                if (r0 != 0) goto L_0x0190
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b8 }
                java.util.LinkedList r14 = new java.util.LinkedList     // Catch:{ Exception -> 0x01b8 }
                r14.<init>()     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r0 = "tmessage"
                r14.add(r0)     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r0 = "officialaccounts"
                r14.add(r0)     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r0 = "helper_entry"
                r14.add(r0)     // Catch:{ Exception -> 0x01b8 }
                eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x01b8 }
                g62.p r0 = r0.mo105877C()     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r11 = "@t.qq.com"
                com.tencent.mm.storage.s4 r0 = (com.tencent.p014mm.storage.C44667s4) r0     // Catch:{ Exception -> 0x01b8 }
                com.tencent.mm.storage.r4 r0 = r0.mo69821jo(r11)     // Catch:{ Exception -> 0x01b8 }
                if (r0 == 0) goto L_0x00bc
                java.lang.String r0 = r0.f121095b     // Catch:{ Exception -> 0x01b8 }
                r14.add(r0)     // Catch:{ Exception -> 0x01b8 }
            L_0x00bc:
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x01b8 }
                r0.<init>()     // Catch:{ Exception -> 0x01b8 }
                eb0.c r11 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x01b8 }
                com.tencent.mm.storage.u3 r11 = r11.mo105907v()     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r12 = "@all.contact.android"
                r13 = 0
                r15 = 0
                r16 = 1
                r17 = 1
                android.database.Cursor r11 = r11.mo69651D3(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01b8 }
                if (r11 != 0) goto L_0x00e1
                java.lang.String r0 = "initLocalVoiceControl cu is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ Exception -> 0x01b8 }
                ra1.b r0 = ra1.C47958b.this     // Catch:{ Exception -> 0x01b8 }
                r0.f128662r = r4     // Catch:{ Exception -> 0x01b8 }
                return
            L_0x00e1:
                boolean r12 = r11.moveToFirst()     // Catch:{ Exception -> 0x01b8 }
                if (r12 == 0) goto L_0x010b
            L_0x00e7:
                boolean r12 = r11.isAfterLast()     // Catch:{ Exception -> 0x01b8 }
                if (r12 != 0) goto L_0x010b
                com.tencent.mm.storage.f r12 = new com.tencent.mm.storage.f     // Catch:{ Exception -> 0x01b8 }
                r12.<init>()     // Catch:{ Exception -> 0x01b8 }
                r12.mo69638a(r11)     // Catch:{ Exception -> 0x01b8 }
                q9.d r13 = new q9.d     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r14 = r12.mo69642d()     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r15 = r12.mo69640c()     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r12 = r12.field_conRemark     // Catch:{ Exception -> 0x01b8 }
                r13.<init>(r14, r15, r12)     // Catch:{ Exception -> 0x01b8 }
                r0.add(r13)     // Catch:{ Exception -> 0x01b8 }
                r11.moveToNext()     // Catch:{ Exception -> 0x01b8 }
                goto L_0x00e7
            L_0x010b:
                r11.close()     // Catch:{ Exception -> 0x01b8 }
                java.lang.String r12 = "init cusor,count:%s,use time:%s"
                java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01b8 }
                int r11 = r11.getCount()     // Catch:{ Exception -> 0x01b8 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x01b8 }
                r13[r3] = r11     // Catch:{ Exception -> 0x01b8 }
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b8 }
                long r14 = r14 - r9
                java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x01b8 }
                r13[r4] = r9     // Catch:{ Exception -> 0x01b8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r13)     // Catch:{ Exception -> 0x01b8 }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b8 }
                q9.b r11 = p820q9.C47781b.C47782a.f128311a     // Catch:{ Exception -> 0x01b8 }
                q9.e r11 = r11.f128310a     // Catch:{ Exception -> 0x01b8 }
                boolean r12 = r11.f128321d     // Catch:{ Exception -> 0x01b8 }
                if (r12 != 0) goto L_0x0139
                r0 = -304(0xfffffffffffffed0, float:NaN)
                goto L_0x0152
            L_0x0139:
                boolean r12 = r11.f128322e     // Catch:{ Exception -> 0x01b8 }
                if (r12 == 0) goto L_0x0146
                com.qq.wx.voice.embed.recognizer.Grammar r11 = r11.f128318a     // Catch:{ Exception -> 0x01b8 }
                int r0 = r11.update(r0)     // Catch:{ Exception -> 0x01b8 }
                if (r0 >= 0) goto L_0x0151
                goto L_0x0152
            L_0x0146:
                com.qq.wx.voice.embed.recognizer.Grammar r12 = r11.f128318a     // Catch:{ Exception -> 0x01b8 }
                int r0 = r12.init(r0)     // Catch:{ Exception -> 0x01b8 }
                if (r0 >= 0) goto L_0x014f
                goto L_0x0152
            L_0x014f:
                r11.f128322e = r4     // Catch:{ Exception -> 0x01b8 }
            L_0x0151:
                r0 = 0
            L_0x0152:
                if (r0 != 0) goto L_0x0168
                android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ Exception -> 0x01b8 }
                android.content.SharedPreferences$Editor r5 = r5.putBoolean(r8, r4)     // Catch:{ Exception -> 0x01b8 }
                android.content.SharedPreferences$Editor r5 = r5.putBoolean(r7, r4)     // Catch:{ Exception -> 0x01b8 }
                r5.commit()     // Catch:{ Exception -> 0x01b8 }
                ra1.b r5 = ra1.C47958b.this     // Catch:{ Exception -> 0x01b8 }
                r5.f128663s = r4     // Catch:{ Exception -> 0x01b8 }
                goto L_0x0173
            L_0x0168:
                android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ Exception -> 0x01b8 }
                android.content.SharedPreferences$Editor r5 = r5.putBoolean(r8, r3)     // Catch:{ Exception -> 0x01b8 }
                r5.commit()     // Catch:{ Exception -> 0x01b8 }
            L_0x0173:
                java.lang.String r5 = "init ret:%s,use time:%s"
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01b8 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01b8 }
                r6[r3] = r0     // Catch:{ Exception -> 0x01b8 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b8 }
                long r7 = r7 - r9
                java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x01b8 }
                r6[r4] = r0     // Catch:{ Exception -> 0x01b8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r6)     // Catch:{ Exception -> 0x01b8 }
                ra1.b r0 = ra1.C47958b.this     // Catch:{ Exception -> 0x01b8 }
                r0.f128662r = r4     // Catch:{ Exception -> 0x01b8 }
                goto L_0x01a3
            L_0x0190:
                android.content.SharedPreferences$Editor r0 = r5.edit()     // Catch:{ Exception -> 0x01b8 }
                android.content.SharedPreferences$Editor r0 = r0.putBoolean(r8, r3)     // Catch:{ Exception -> 0x01b8 }
                android.content.SharedPreferences$Editor r0 = r0.putBoolean(r7, r4)     // Catch:{ Exception -> 0x01b8 }
                r0.commit()     // Catch:{ Exception -> 0x01b8 }
                ra1.b r0 = ra1.C47958b.this     // Catch:{ Exception -> 0x01b8 }
                r0.f128663s = r4     // Catch:{ Exception -> 0x01b8 }
            L_0x01a3:
                ra1.b r0 = ra1.C47958b.this     // Catch:{ Exception -> 0x01b8 }
                r0.f128662r = r4     // Catch:{ Exception -> 0x01b8 }
                goto L_0x01c6
            L_0x01a8:
                java.lang.String r7 = "error mMd5So:%s,  mMd5Data:%s"
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01b8 }
                r6[r3] = r5     // Catch:{ Exception -> 0x01b8 }
                r6[r4] = r0     // Catch:{ Exception -> 0x01b8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r6)     // Catch:{ Exception -> 0x01b8 }
                ra1.b r0 = ra1.C47958b.this     // Catch:{ Exception -> 0x01b8 }
                r0.f128662r = r4     // Catch:{ Exception -> 0x01b8 }
                return
            L_0x01b8:
                r0 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r0 = r0.getMessage()
                r4[r3] = r0
                java.lang.String r0 = "initLocalVoiceControl Exception:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)
            L_0x01c6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ra1.C47958b.C47960f.run():void");
        }
    }

    static {
        int a = C107842p.m146108a();
        try {
            if (!Build.CPU_ABI.contains("armeabi")) {
                Log.m105920e("hakon SilkCodec", "x86 machines not supported.");
            } else if ((a & 1024) != 0) {
                C88957l.m111079o("wechatvoicesilk", C47958b.class.getClassLoader());
            } else if ((a & 512) != 0) {
                Log.m105920e("hakon SilkCodec", "load library failed! silk don't support armv6!!!!");
            } else {
                Log.m105920e("hakon SilkCodec", "load library failed! silk don't support armv5!!!!");
            }
        } catch (Exception unused) {
            Log.m105920e("hakon SilkCodec", "load library failed!");
        }
    }

    public static C30739f5 Ax0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f128653f == null) {
            xx0().f128653f = new C30739f5(C97625j3.m125812b().mo105909x());
        }
        return xx0().f128653f;
    }

    public static C85801v1 wx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f128651d == null) {
            xx0().f128651d = new C85801v1(C97625j3.m125812b().mo105909x());
        }
        return xx0().f128651d;
    }

    public static C47958b xx0() {
        return (C47958b) C86312j.m106911c(C47958b.class);
    }

    public static C36646a yx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f128654g == null) {
            xx0().f128654g = new C36646a(C97625j3.m125812b().mo105909x());
        }
        return xx0().f128654g;
    }

    public static C30761n4 zx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f128652e == null) {
            xx0().f128652e = new C30761n4(C97625j3.m125812b().mo105909x());
        }
        return xx0().f128652e;
    }

    public final void Bx0(boolean z) {
        if (this.f128662r) {
            if (z && this.f128663s) {
                Log.m105924i("MicroMsg.SubCoreExt", "fromStartApp and already try to init");
            } else if (z || f128650t) {
                Log.m105925i("MicroMsg.SubCoreExt", "initLocalVoiceControl,fromStartApp:%s,hasTryToInit:%s,hasCallApi:%s", Boolean.valueOf(z), Boolean.valueOf(this.f128663s), Boolean.valueOf(f128650t));
                this.f128662r = false;
                C86709a0.m107525e().postToWorkerDelayed(new C47960f(), 10000);
            }
        }
    }

    public void Cx0(long j) {
        boolean z;
        if (j > 0) {
            try {
                C72972g4 g4Var = (C72972g4) C97625j3.m125812b().mo105911z();
                int i = 0;
                while (true) {
                    if (i >= ((LinkedList) g4Var.f212769g).size()) {
                        z = false;
                        break;
                    } else if (((C75875l.C75878d) ((LinkedList) g4Var.f212769g).get(i)).mo106148d(j)) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    ((C72972g4) C97625j3.m125812b().mo105911z()).ty0(((C72972g4) C97625j3.m125812b().mo105911z()).b00(j));
                    return;
                }
                Log.m105920e("MicroMsg.SubCoreExt", "msgId is out of range, " + j);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SubCoreExt", e.getMessage());
                Log.printErrStackTrace("MicroMsg.SubCoreExt", e, "", new Object[0]);
            }
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C44579p yx02 = C72709y1.yx0();
        if (yx02 != null) {
            yx02.add(this.f128660p);
        }
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        this.f128663s = defaultPreference.getBoolean("hasTryToInitVoiceControlData", false);
        f128650t = defaultPreference.getBoolean("hasCallVoiceControlApi", false);
        Log.m105925i("MicroMsg.SubCoreExt", "onAccountPostReset,hasTryToInit:%s,hasCallApi:%s", Boolean.valueOf(this.f128663s), Boolean.valueOf(f128650t));
        C97625j3.m125812b().mo105907v().add(this.f128661q);
        Bx0(true);
        ExtQbarDataManager.m117943d();
        ExtQbarDataManager.f269551d.alive();
        Uri n = C116299g2.m163858n(C86709a0.m107535s().f251806d);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        Uri n2 = C116299g2.m163858n(C86709a0.m107535s().f251806d + "image/ext/pcm");
        String path2 = n2.getPath();
        if (path2 != null) {
            String k2 = C116299g2.m163855k(path2, false, false);
            if (!n2.getPath().equals(k2)) {
                n2 = n2.buildUpon().path(k2).build();
            }
        }
        C116281f0.C116288h l3 = f0Var.mo177799l(n2, (C116281f0.C116288h) null);
        if (!(!l3.mo177810a() ? false : l3.f348991a.mo119948x(l3.f348992b))) {
            C116281f0.C116288h l4 = f0Var.mo177799l(n2, l3);
            if (l4.mo177810a()) {
                l4.f348991a.mo119937g(l4.f348992b);
            }
        }
        Log.m105925i("MicroMsg.SubCoreExt", "summerpcm accPath[%s] [%s]", C86709a0.m107535s().f251806d, Util.getStack());
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C44579p yx02 = C72709y1.yx0();
        if (yx02 != null) {
            yx02.remove(this.f128660p);
        }
        ExtAgentLifeEvent extAgentLifeEvent = new ExtAgentLifeEvent();
        extAgentLifeEvent.f107514d.f107515a = 2;
        if (!extAgentLifeEvent.publish()) {
            Log.m105920e("MicroMsg.SubCoreExt", "ExtAgentLifeEvent event fail in onAccountRelease");
        }
        if (C44596s0.f120910f == null) {
            C44596s0.f120910f = new C44596s0();
        }
        C44596s0 s0Var = C44596s0.f120910f;
        s0Var.getClass();
        if (C97625j3.m125811a()) {
            C44596s0.f120909e = false;
            C72709y1.wx0().mo69347a(14, s0Var);
        }
        C97625j3.m125812b().mo105907v().remove(this.f128661q);
        ExtQbarDataManager.f269551d.dead();
    }

    public void vx0(String str, LinkedList<String> linkedList) {
        if (!Util.isNullOrNil(str) && linkedList != null && linkedList.size() > 0) {
            if (C44596s0.f120910f == null) {
                C44596s0.f120910f = new C44596s0();
            }
            C44596s0 s0Var = C44596s0.f120910f;
            Context context = MMApplicationContext.getContext();
            C44596s0.C44597a aVar = this.f128656i;
            s0Var.getClass();
            Log.m105918d("MicroMsg.GetUserInfoInAppLogic", "getGetUserInfoInApp");
            if (!C44596s0.f120909e && C97625j3.m125811a()) {
                C44552f fVar = (C44552f) ((C53543s) C86312j.m106911c(C53543s.class)).mo74027t8();
                fVar.getClass();
                MMHandlerThread.postToMainThread(new C44554g(fVar, 14, s0Var));
                C44596s0.f120909e = true;
            }
            if (!C97625j3.m125811a() || context == null) {
                return;
            }
            if (linkedList.size() == 0) {
                Log.m105918d("MicroMsg.GetUserInfoInAppLogic", "userNameList empty");
                return;
            }
            s0Var.f120911d = aVar;
            C44599z0 z0Var = new C44599z0(str, linkedList);
            C72709y1.wx0().getClass();
            C86709a0.m107529k().f251779b.mo123460f(new C44551e1(14, z0Var));
        }
    }
}
