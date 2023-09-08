package com.tencent.p014mm.permission;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MicrophoneMuteDlgEvent;
import com.tencent.p014mm.autogen.events.PermissionOpMarkEvent;
import com.tencent.p014mm.autogen.events.PermissionShowDlgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import f40.C86709a0;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import lc3.C10485b;
import p206nj.C76861g;

/* renamed from: com.tencent.mm.permission.PermissionMgr */
public class PermissionMgr {

    /* renamed from: d */
    public static Map<Integer, C92874a> f267542d;

    /* renamed from: a */
    public IListener f267543a;

    /* renamed from: b */
    public IListener f267544b;

    /* renamed from: c */
    public IListener f267545c;

    /* renamed from: com.tencent.mm.permission.PermissionMgr$a */
    public static class C92874a {

        /* renamed from: a */
        public int f267546a;

        /* renamed from: b */
        public int f267547b;

        public C92874a(int i, int i2, int i3, int i4, int i5) {
            this.f267546a = i;
            this.f267547b = i2;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f267542d = hashMap;
        hashMap.put(1, new C92874a(38, 40, 41, C0966R.string.a1m, C0966R.string.a1e));
        f267542d.put(2, new C92874a(43, 44, 45, C0966R.string.a1l, C0966R.string.a1f));
    }

    public PermissionMgr() {
        C40008f fVar = C40008f.f107254d;
        this.f267543a = new IListener<PermissionOpMarkEvent>(this, fVar) {
            {
                this.__eventId = 1740184941;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:61:0x021e, code lost:
                if (r8 != null) goto L_0x0220;
             */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x0218 A[Catch:{ all -> 0x020d }] */
            /* JADX WARNING: Removed duplicated region for block: B:68:0x0238  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x0280  */
            /* JADX WARNING: Removed duplicated region for block: B:88:0x0287  */
            /* JADX WARNING: Removed duplicated region for block: B:96:0x02a7 A[SYNTHETIC, Splitter:B:96:0x02a7] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r17) {
                /*
                    r16 = this;
                    r0 = r17
                    com.tencent.mm.autogen.events.PermissionOpMarkEvent r0 = (com.tencent.p014mm.autogen.events.PermissionOpMarkEvent) r0
                    com.tencent.mm.autogen.events.PermissionOpMarkEvent$a r1 = r0.f264983d
                    boolean r2 = r1.f264985a
                    r3 = 1
                    r4 = 0
                    if (r3 != r2) goto L_0x02b1
                    int r1 = r1.f264986b
                    java.util.Map<java.lang.Integer, com.tencent.mm.permission.PermissionMgr$a> r2 = com.tencent.p014mm.permission.PermissionMgr.f267542d
                    com.tencent.mm.storage.u1 r2 = eb0.C97625j3.m125818h()
                    java.util.Map<java.lang.Integer, com.tencent.mm.permission.PermissionMgr$a> r5 = com.tencent.p014mm.permission.PermissionMgr.f267542d
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.util.HashMap r5 = (java.util.HashMap) r5
                    java.lang.Object r1 = r5.get(r1)
                    com.tencent.mm.permission.PermissionMgr$a r1 = (com.tencent.p014mm.permission.PermissionMgr.C92874a) r1
                    int r1 = r1.f267546a
                    int r1 = r2.mo119662c(r1, r4)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r5 = "current mark status: "
                    r2.append(r5)
                    r2.append(r1)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r5 = "MicroMsg.PermissionMgr"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                    if (r1 != 0) goto L_0x0042
                    r1 = 1
                    goto L_0x0043
                L_0x0042:
                    r1 = 0
                L_0x0043:
                    if (r1 != 0) goto L_0x02ab
                    java.lang.Boolean r1 = p903ij.C98696a.f289423a
                    if (r1 == 0) goto L_0x004f
                    boolean r1 = r1.booleanValue()
                    goto L_0x0295
                L_0x004f:
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = a70.C112760b.m154225d()
                    r5.append(r6)
                    java.lang.String r6 = "permissioncfg.cfg"
                    r5.append(r6)
                    java.lang.String r5 = r5.toString()
                    boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
                    java.lang.String r7 = "MicroMsg.PermissionConfig"
                    if (r6 != 0) goto L_0x007e
                    java.lang.String r2 = "file is not exists"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
                    goto L_0x0223
                L_0x007e:
                    java.lang.String r6 = ".perm.values."
                    java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
                    java.lang.String r9 = "zh_CN"
                    boolean r10 = r8.equals(r9)
                    java.lang.String r11 = "zh_TW"
                    if (r10 == 0) goto L_0x0091
                    goto L_0x00a5
                L_0x0091:
                    boolean r9 = r8.equals(r11)
                    if (r9 != 0) goto L_0x00a4
                    java.lang.String r9 = "zh_HK"
                    boolean r8 = r8.equals(r9)
                    if (r8 == 0) goto L_0x00a1
                    goto L_0x00a4
                L_0x00a1:
                    java.lang.String r9 = "en"
                    goto L_0x00a5
                L_0x00a4:
                    r9 = r11
                L_0x00a5:
                    r8 = 0
                    java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0219, IOException -> 0x0210 }
                    com.tencent.mm.vfs.t1 r11 = new com.tencent.mm.vfs.t1     // Catch:{ FileNotFoundException -> 0x0219, IOException -> 0x0210 }
                    r11.<init>((java.lang.String) r5)     // Catch:{ FileNotFoundException -> 0x0219, IOException -> 0x0210 }
                    r10.<init>(r11)     // Catch:{ FileNotFoundException -> 0x0219, IOException -> 0x0210 }
                L_0x00b0:
                    java.lang.String r5 = r10.readLine()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    if (r5 == 0) goto L_0x0202
                    java.lang.String r5 = r5.trim()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    int r11 = r5.length()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    if (r11 != 0) goto L_0x00c1
                    goto L_0x00b0
                L_0x00c1:
                    java.lang.String r11 = "perm"
                    java.util.Map r11 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r11, r8)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    if (r11 != 0) goto L_0x00e0
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r11.<init>()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = "unable to parse xml, "
                    r11.append(r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r11.append(r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r5 = r11.toString()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    goto L_0x00b0
                L_0x00e0:
                    java.lang.String r12 = ".perm.type"
                    java.lang.Object r12 = r11.get(r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = (java.lang.String) r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    if (r12 != 0) goto L_0x0100
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r11.<init>()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = "invalid config, "
                    r11.append(r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r11.append(r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r5 = r11.toString()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    goto L_0x00b0
                L_0x0100:
                    java.lang.String r5 = "1"
                    boolean r5 = r12.equals(r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r13 = ".perm.check_exception"
                    java.lang.String r14 = "camera."
                    r15 = 2
                    if (r5 == 0) goto L_0x017f
                    ij.a$c r5 = new ij.a$c     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r5.<init>()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    android.util.SparseArray r12 = new android.util.SparseArray     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.<init>()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r5.f289433e = r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = ".perm.manufacture"
                    java.lang.Object r12 = r11.get(r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = (java.lang.String) r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r5.f289429a = r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = ".perm.model"
                    java.lang.Object r12 = r11.get(r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = (java.lang.String) r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r5.f289430b = r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = ".perm.version_release"
                    java.lang.Object r12 = r11.get(r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = (java.lang.String) r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r5.f289431c = r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    android.util.SparseArray<java.lang.String> r12 = r5.f289433e     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r4.<init>()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r4.append(r6)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r4.append(r9)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.Object r4 = r11.get(r4)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r4 = (java.lang.String) r4     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.append(r3, r4)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    android.util.SparseArray<java.lang.String> r4 = r5.f289433e     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.<init>()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.append(r6)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.append(r14)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.append(r9)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = r12.toString()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.Object r12 = r11.get(r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = (java.lang.String) r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r4.append(r15, r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.Object r4 = r11.get(r13)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r4 = (java.lang.String) r4     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r5.f289432d = r4     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r1.add(r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    goto L_0x01ff
                L_0x017f:
                    java.lang.String r4 = "2"
                    boolean r4 = r12.equals(r4)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    if (r4 == 0) goto L_0x01ff
                    ij.a$b r4 = new ij.a$b     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r4.<init>(r8)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    android.util.SparseArray r5 = new android.util.SparseArray     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r5.<init>()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r4.f289428e = r5     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r5 = ".perm.package"
                    java.lang.Object r5 = r11.get(r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r5 = (java.lang.String) r5     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r4.f289424a = r5     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r5 = ".perm.min_versioncode"
                    java.lang.Object r5 = r11.get(r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r5 = (java.lang.String) r5     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r4.f289425b = r5     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r5 = ".perm.max_versioncode"
                    java.lang.Object r5 = r11.get(r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r5 = (java.lang.String) r5     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r4.f289426c = r5     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    android.util.SparseArray<java.lang.String> r5 = r4.f289428e     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.<init>()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.append(r6)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.append(r9)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = r12.toString()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.Object r12 = r11.get(r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = (java.lang.String) r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r5.append(r3, r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    android.util.SparseArray<java.lang.String> r5 = r4.f289428e     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.<init>()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.append(r6)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.append(r14)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r12.append(r9)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = r12.toString()     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.Object r12 = r11.get(r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r12 = (java.lang.String) r12     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r5.append(r15, r12)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.Object r5 = r11.get(r13)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    java.lang.String r5 = (java.lang.String) r5     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r4.f289427d = r5     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                    r2.add(r4)     // Catch:{ FileNotFoundException -> 0x020b, IOException -> 0x0209, all -> 0x0206 }
                L_0x01ff:
                    r4 = 0
                    goto L_0x00b0
                L_0x0202:
                    r10.close()     // Catch:{ IOException -> 0x0223 }
                    goto L_0x0223
                L_0x0206:
                    r0 = move-exception
                    goto L_0x02a5
                L_0x0209:
                    r8 = r10
                    goto L_0x0210
                L_0x020b:
                    r8 = r10
                    goto L_0x0219
                L_0x020d:
                    r0 = move-exception
                    goto L_0x02a4
                L_0x0210:
                    java.lang.String r2 = "read permission config file failed"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)     // Catch:{ all -> 0x020d }
                    if (r8 == 0) goto L_0x0223
                    goto L_0x0220
                L_0x0219:
                    java.lang.String r2 = "file not found exception"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)     // Catch:{ all -> 0x020d }
                    if (r8 == 0) goto L_0x0223
                L_0x0220:
                    r8.close()     // Catch:{ IOException -> 0x0223 }
                L_0x0223:
                    com.tencent.mm.pointers.PInt r2 = new com.tencent.mm.pointers.PInt
                    r4 = 0
                    r2.<init>(r4)
                    com.tencent.mm.pointers.PBool r5 = new com.tencent.mm.pointers.PBool
                    r5.<init>()
                    java.util.Iterator r1 = r1.iterator()
                L_0x0232:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L_0x0276
                    java.lang.Object r6 = r1.next()
                    ij.a$c r6 = (p903ij.C98696a.C98699c) r6
                    r2.value = r4
                    r5.value = r3
                    java.lang.String r4 = android.os.Build.MANUFACTURER
                    java.lang.String r7 = r6.f289429a
                    boolean r4 = p903ij.C98696a.m128468a(r4, r7, r2, r5)
                    if (r4 == 0) goto L_0x025f
                    java.lang.String r4 = p156gj.C87203t.m108275k()
                    java.lang.String r7 = r6.f289430b
                    boolean r4 = p903ij.C98696a.m128468a(r4, r7, r2, r5)
                    if (r4 == 0) goto L_0x025f
                    java.lang.String r4 = android.os.Build.VERSION.RELEASE
                    java.lang.String r7 = r6.f289431c
                    p903ij.C98696a.m128468a(r4, r7, r2, r5)
                L_0x025f:
                    boolean r4 = r5.value
                    if (r4 == 0) goto L_0x0274
                    int r4 = r2.value
                    if (r4 <= 0) goto L_0x0274
                    int r4 = r6.f289432d
                    if (r3 != r4) goto L_0x026d
                    r4 = 1
                    goto L_0x026e
                L_0x026d:
                    r4 = 0
                L_0x026e:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                    p903ij.C98696a.f289423a = r4
                L_0x0274:
                    r4 = 0
                    goto L_0x0232
                L_0x0276:
                    java.lang.Boolean r1 = p903ij.C98696a.f289423a
                    if (r1 == 0) goto L_0x0287
                    boolean r1 = r1.booleanValue()
                    if (r3 != r1) goto L_0x0287
                    java.lang.Boolean r1 = p903ij.C98696a.f289423a
                    boolean r1 = r1.booleanValue()
                    goto L_0x0295
                L_0x0287:
                    java.lang.Boolean r1 = p903ij.C98696a.f289423a
                    if (r1 != 0) goto L_0x028f
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    p903ij.C98696a.f289423a = r1
                L_0x028f:
                    java.lang.Boolean r1 = p903ij.C98696a.f289423a
                    boolean r1 = r1.booleanValue()
                L_0x0295:
                    if (r1 == 0) goto L_0x02ab
                    com.tencent.mm.autogen.events.PermissionOpMarkEvent$b r1 = r0.f264984e
                    com.tencent.mm.autogen.events.PermissionOpMarkEvent$a r0 = r0.f264983d
                    int r0 = r0.f264986b
                    com.tencent.p014mm.permission.PermissionMgr.m117199a(r0, r3)
                    r1.getClass()
                    goto L_0x02b6
                L_0x02a4:
                    r10 = r8
                L_0x02a5:
                    if (r10 == 0) goto L_0x02aa
                    r10.close()     // Catch:{ IOException -> 0x02aa }
                L_0x02aa:
                    throw r0
                L_0x02ab:
                    com.tencent.mm.autogen.events.PermissionOpMarkEvent$b r0 = r0.f264984e
                    r0.getClass()
                    goto L_0x02b6
                L_0x02b1:
                    com.tencent.mm.autogen.events.PermissionOpMarkEvent$b r0 = r0.f264984e
                    r0.getClass()
                L_0x02b6:
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.permission.PermissionMgr.C928721.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f267544b = new IListener<PermissionShowDlgEvent>(this, fVar) {
            {
                this.__eventId = -126342985;
            }

            public boolean callback(IEvent iEvent) {
                PermissionShowDlgEvent permissionShowDlgEvent = (PermissionShowDlgEvent) iEvent;
                PermissionShowDlgEvent.C92544b bVar = permissionShowDlgEvent.f264989e;
                PermissionMgr.m117199a(permissionShowDlgEvent.f264988d.f264990a, false);
                bVar.getClass();
                return false;
            }
        };
        this.f267545c = new IListener<MicrophoneMuteDlgEvent>(this, fVar) {
            {
                this.__eventId = -1844812114;
            }

            public boolean callback(IEvent iEvent) {
                MicrophoneMuteDlgEvent microphoneMuteDlgEvent = (MicrophoneMuteDlgEvent) iEvent;
                Log.m105924i("MicroMsg.PermissionMgr", "show mute dlg");
                Context context = MMApplicationContext.getContext();
                int i = PermissionWarningDialog.f267548g;
                Intent intent = new Intent(context, PermissionWarningDialog.class);
                intent.putExtra("warning_type", 3);
                intent.addFlags(805306368);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/permission/PermissionWarningDialog", "showMicroPhoneMuteAlert", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/permission/PermissionWarningDialog", "showMicroPhoneMuteAlert", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
        };
        this.f267543a.alive();
        this.f267544b.alive();
        this.f267545c.alive();
    }

    /* renamed from: a */
    public static boolean m117199a(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        C76861g.C47263a aVar = new C76861g.C47263a();
        boolean z2 = true;
        if (C97625j3.m125811a()) {
            i4 = m117200b("ShowPermissionDialog", 0);
            i3 = m117200b("OnlyScanRunningService", 0);
            i2 = m117200b("Interval4ShowPmsDialog", 0);
        } else {
            i2 = 3600000;
            i4 = 1;
            i3 = 1;
        }
        Log.m105925i("MicroMsg.PermissionMgr", "showDlg: %d, filter: %d, interval: %d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2));
        long j = 0;
        for (C92874a aVar2 : ((HashMap) f267542d).values()) {
            long d = C97625j3.m125818h().mo118846d(aVar2.f267547b, 0);
            if (j < d) {
                j = d;
            }
        }
        boolean z3 = 1 == i4 && System.currentTimeMillis() - j >= ((long) i2);
        if (z3) {
            C97625j3.m125818h().mo119667h(((C92874a) ((HashMap) f267542d).get(Integer.valueOf(i))).f267547b, System.currentTimeMillis());
            Log.m105925i("MicroMsg.PermissionMgr", "tryDirectlyShowDefaultPermissionDialog, chkType: %s, filter: %s, dueToException: %s", Integer.valueOf(i), Integer.valueOf(i3), Boolean.valueOf(z));
            if (1 == i) {
                C97625j3.m125818h().mo119667h(42, System.currentTimeMillis());
                Context context = MMApplicationContext.getContext();
                if (1 != i3) {
                    z2 = false;
                }
                int i5 = PermissionWarningDialog.f267548g;
                Intent intent = new Intent(context, PermissionWarningDialog.class);
                intent.putExtra("warning_type", 2);
                intent.putExtra("warning_filter", z2);
                intent.putExtra("warning_due2Exception", z);
                intent.addFlags(805306368);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar3.mo10232b(), "com/tencent/mm/permission/PermissionWarningDialog", "showReportAppListAlert", "(Landroid/content/Context;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar3.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/permission/PermissionWarningDialog", "showReportAppListAlert", "(Landroid/content/Context;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        Log.m105924i("MicroMsg.PermissionMgr", "showPermissionDialog cost: " + aVar.mo72288a() + ", needShowDlg: " + z3);
        return false;
    }

    /* renamed from: b */
    public static int m117200b(String str, int i) {
        try {
            return Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str), i);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.PermissionMgr", "getIntValFromDynamicConfig parseInt failed, val: " + str);
            return i;
        }
    }
}
