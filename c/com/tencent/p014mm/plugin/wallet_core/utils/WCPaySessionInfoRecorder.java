package com.tencent.p014mm.plugin.wallet_core.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import sx3.C110818d0;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder */
public final class WCPaySessionInfoRecorder {

    /* renamed from: a */
    public static final WCPaySessionInfoRecorder f210858a = new WCPaySessionInfoRecorder();

    /* renamed from: b */
    public static Map<String, JsApiPayInfo> f210859b = new LinkedHashMap();

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a */
    public enum C72488a {
        Unknown(0),
        Single(1),
        EnterpriseSingle(2),
        Group(3),
        EnterpriseGroup(4),
        Timeline(5),
        EnterpriseTimeline(6);
        

        /* renamed from: d */
        public final int f210873d;

        /* renamed from: com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a$a */
        public static final class C72489a {
            public C72489a(C8480h hVar) {
            }
        }

        /* access modifiers changed from: public */
        static {
            new C72489a((C8480h) null);
        }

        /* access modifiers changed from: public */
        C72488a(int i) {
            this.f210873d = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$b */
    public enum C72490b {
        Unknown(0),
        Timeline(3);
        

        /* renamed from: d */
        public final int f210877d;

        /* access modifiers changed from: public */
        C72490b(int i) {
            this.f210877d = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c */
    public enum C72491c {
        Unknown(0),
        Enterprise(1),
        Common(2);
        

        /* renamed from: d */
        public final int f210882d;

        /* access modifiers changed from: public */
        C72491c(int i) {
            this.f210882d = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$d */
    public static final class C72492d extends C87413o implements C32226l<StackTraceElement, CharSequence> {

        /* renamed from: d */
        public static final C72492d f210883d = new C72492d();

        public C72492d() {
            super(1);
        }

        public Object invoke(Object obj) {
            StackTraceElement stackTraceElement = (StackTraceElement) obj;
            return stackTraceElement.getFileName() + XVFSFile.PATH_SEPARATOR_CHAR + stackTraceElement.getLineNumber() + XVFSFile.SEPARATOR_CHAR + stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$e */
    public static final class C72493e extends C87413o implements C32226l<StackTraceElement, CharSequence> {

        /* renamed from: d */
        public static final C72493e f210884d = new C72493e();

        public C72493e() {
            super(1);
        }

        public Object invoke(Object obj) {
            StackTraceElement stackTraceElement = (StackTraceElement) obj;
            return stackTraceElement.getFileName() + XVFSFile.PATH_SEPARATOR_CHAR + stackTraceElement.getLineNumber() + XVFSFile.SEPARATOR_CHAR + stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        if (r11 == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r11 == false) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final rx3.C13604l<java.lang.Integer, java.lang.Integer> m84831b(int r21, java.lang.String r22, java.lang.String r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c r3 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72491c.Enterprise
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c r4 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72491c.Unknown
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c r5 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72491c.Common
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r6 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.Unknown
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "try get types from scan code, scene="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = ", talker=\""
            r7.append(r8)
            r7.append(r1)
            java.lang.String r8 = "\", sender=\""
            r7.append(r8)
            r7.append(r2)
            r8 = 34
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.WCPaySessionInfoRecorder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            r7 = 38
            r9 = 1
            r10 = 0
            if (r0 != r7) goto L_0x0053
            if (r1 == 0) goto L_0x004f
            int r11 = r22.length()
            if (r11 != 0) goto L_0x004a
            r11 = 1
            goto L_0x004b
        L_0x004a:
            r11 = 0
        L_0x004b:
            if (r11 != r9) goto L_0x004f
            r11 = 1
            goto L_0x0050
        L_0x004f:
            r11 = 0
        L_0x0050:
            if (r11 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0053:
            if (r2 == 0) goto L_0x0073
            int r11 = r23.length()
            if (r11 != 0) goto L_0x005d
            r11 = 1
            goto L_0x005e
        L_0x005d:
            r11 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x006d
            int r12 = r22.length()
            if (r12 <= 0) goto L_0x0068
            r12 = 1
            goto L_0x0069
        L_0x0068:
            r12 = 0
        L_0x0069:
            if (r12 != r9) goto L_0x006d
            r12 = 1
            goto L_0x006e
        L_0x006d:
            r12 = 0
        L_0x006e:
            r12 = r12 & r9
            if (r11 != r12) goto L_0x0073
            r11 = 1
            goto L_0x0074
        L_0x0073:
            r11 = 0
        L_0x0074:
            if (r11 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r9 = 0
        L_0x0078:
            if (r9 == 0) goto L_0x00c2
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r9 = r9.getStackTrace()
            java.lang.String r11 = "currentThread().stackTrace"
            gy3.C87412m.m108593f(r9, r11)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r11 = r9.length
            r13 = 0
        L_0x008e:
            if (r13 >= r11) goto L_0x00ab
            r14 = r9[r13]
            java.lang.String r15 = r14.getClassName()
            java.lang.String r7 = "it.className"
            gy3.C87412m.m108593f(r15, r7)
            java.lang.String r7 = "com.tencent"
            boolean r7 = z04.C112550d0.m153801u(r15, r7, r10)
            if (r7 == 0) goto L_0x00a6
            r12.add(r14)
        L_0x00a6:
            int r13 = r13 + 1
            r7 = 38
            goto L_0x008e
        L_0x00ab:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$e r18 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72493e.f210884d
            r19 = 30
            r20 = 0
            java.lang.String r13 = "\n"
            java.lang.String r7 = sx3.C110818d0.m150921S(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            r7 = 38
        L_0x00c2:
            if (r0 != r7) goto L_0x00f7
            rx3.l r0 = new rx3.l
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85843n5(r23)
            if (r1 == 0) goto L_0x00cf
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r6 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.EnterpriseTimeline
            goto L_0x00d7
        L_0x00cf:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85809L5(r23)
            if (r1 == 0) goto L_0x00d7
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r6 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.Timeline
        L_0x00d7:
            int r1 = r6.f210873d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85809L5(r23)
            if (r6 == 0) goto L_0x00e5
            r3 = r5
            goto L_0x00ed
        L_0x00e5:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r23)
            if (r2 == 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r3 = r4
        L_0x00ed:
            int r2 = r3.f210882d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r2)
            goto L_0x013b
        L_0x00f7:
            rx3.l r0 = new rx3.l
            boolean r7 = eb0.C45628s0.m50748M(r22)
            if (r7 == 0) goto L_0x0102
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r6 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.EnterpriseGroup
            goto L_0x011c
        L_0x0102:
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85843n5(r22)
            if (r7 == 0) goto L_0x010b
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r6 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.EnterpriseSingle
            goto L_0x011c
        L_0x010b:
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85807K5(r22)
            if (r7 == 0) goto L_0x0114
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r6 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.Group
            goto L_0x011c
        L_0x0114:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85809L5(r22)
            if (r1 == 0) goto L_0x011c
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r6 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.Single
        L_0x011c:
            int r1 = r6.f210873d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85809L5(r23)
            if (r6 == 0) goto L_0x012a
            r3 = r5
            goto L_0x0132
        L_0x012a:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r23)
            if (r2 == 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r3 = r4
        L_0x0132:
            int r2 = r3.f210882d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r2)
        L_0x013b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.m84831b(int, java.lang.String, java.lang.String):rx3.l");
    }

    /* renamed from: a */
    public final void mo99898a(String str, JsApiPayInfo jsApiPayInfo) {
        C72491c cVar = C72491c.Unknown;
        C87412m.m108594g(jsApiPayInfo, "info");
        if (str != null) {
            Log.m105924i("MicroMsg.WCPaySessionInfoRecorder", "update chatType=" + jsApiPayInfo.f210860d + ", sendType=" + jsApiPayInfo.f210861e + " for " + str);
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            C87412m.m108593f(stackTrace, "currentThread().stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                C87412m.m108593f(className, "it.className");
                if (C112550d0.m153801u(className, "com.tencent", false)) {
                    arrayList.add(stackTraceElement);
                }
            }
            Log.m105924i("MicroMsg.WCPaySessionInfoRecorder", C110818d0.m150921S(arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C72492d.f210883d, 30, (Object) null));
            if (jsApiPayInfo.f210861e == C72491c.Enterprise) {
                if (jsApiPayInfo.f210860d == C72488a.Single) {
                    Log.m105924i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .enterprise correction: chatType single");
                    jsApiPayInfo.f210860d = C72488a.EnterpriseSingle;
                }
                if (jsApiPayInfo.f210860d == C72488a.Group) {
                    Log.m105924i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .enterprise correction: chatType group");
                    jsApiPayInfo.f210860d = C72488a.EnterpriseGroup;
                }
                if (jsApiPayInfo.f210860d == C72488a.Timeline) {
                    Log.m105924i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .enterprise correction: chatType timeline");
                    jsApiPayInfo.f210860d = C72488a.EnterpriseTimeline;
                }
            }
            C72488a aVar = jsApiPayInfo.f210860d;
            C72488a aVar2 = C72488a.Unknown;
            if (aVar == aVar2 && jsApiPayInfo.f210861e != cVar) {
                Log.m105924i("MicroMsg.WCPaySessionInfoRecorder", "chatType == .unknown correction: sendType from " + jsApiPayInfo.f210861e + " to unknown");
                jsApiPayInfo.f210861e = cVar;
            }
            if (jsApiPayInfo.f210861e == cVar && jsApiPayInfo.f210860d != aVar2) {
                Log.m105924i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .unknown correction: sendType from " + jsApiPayInfo.f210860d + " to unknown");
                jsApiPayInfo.f210860d = aVar2;
            }
            f210859b.put(str, jsApiPayInfo);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet_core/utils/WCPaySessionInfoRecorder$JsApiPayInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "wallet-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo */
    public static final class JsApiPayInfo implements Parcelable {
        public static final C72487a CREATOR = new C72487a((C8480h) null);

        /* renamed from: d */
        public C72488a f210860d;

        /* renamed from: e */
        public C72491c f210861e;

        /* renamed from: f */
        public final C72490b f210862f;

        /* renamed from: g */
        public final String f210863g;

        /* renamed from: h */
        public final String f210864h;

        /* renamed from: com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo$a */
        public static final class C72487a implements Parcelable.Creator<JsApiPayInfo> {
            public C72487a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C72490b bVar;
                C72488a aVar;
                C72491c cVar;
                C87412m.m108594g(parcel, "parcel");
                int readInt = parcel.readInt();
                C72488a[] values = C72488a.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    bVar = null;
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i];
                    if (aVar.f210873d == readInt) {
                        break;
                    }
                    i++;
                }
                C72488a aVar2 = aVar == null ? C72488a.Unknown : aVar;
                int readInt2 = parcel.readInt();
                C72491c[] values2 = C72491c.values();
                int length2 = values2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        cVar = null;
                        break;
                    }
                    cVar = values2[i2];
                    if (cVar.f210882d == readInt2) {
                        break;
                    }
                    i2++;
                }
                C72491c cVar2 = cVar == null ? C72491c.Unknown : cVar;
                int readInt3 = parcel.readInt();
                C72490b[] values3 = C72490b.values();
                int length3 = values3.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        break;
                    }
                    C72490b bVar2 = values3[i3];
                    if (bVar2.f210877d == readInt3) {
                        bVar = bVar2;
                        break;
                    }
                    i3++;
                }
                C72490b bVar3 = bVar == null ? C72490b.Unknown : bVar;
                String readString = parcel.readString();
                String str = readString == null ? "" : readString;
                String readString2 = parcel.readString();
                if (readString2 == null) {
                    readString2 = "";
                }
                return new JsApiPayInfo(aVar2, cVar2, bVar3, str, readString2);
            }

            public Object[] newArray(int i) {
                return new JsApiPayInfo[i];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public JsApiPayInfo(java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10) {
            /*
                r6 = this;
                boolean r0 = eb0.C45628s0.m50748M(r7)
                if (r0 == 0) goto L_0x000a
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.EnterpriseGroup
            L_0x0008:
                r1 = r7
                goto L_0x0028
            L_0x000a:
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r7)
                if (r0 == 0) goto L_0x0013
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.EnterpriseSingle
                goto L_0x0008
            L_0x0013:
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r7)
                if (r0 == 0) goto L_0x001c
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.Group
                goto L_0x0008
            L_0x001c:
                boolean r7 = com.tencent.p014mm.storage.C72996z1.m85809L5(r7)
                if (r7 == 0) goto L_0x0025
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.Single
                goto L_0x0008
            L_0x0025:
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.Unknown
                goto L_0x0008
            L_0x0028:
                boolean r7 = com.tencent.p014mm.storage.C72996z1.m85809L5(r8)
                if (r7 == 0) goto L_0x0032
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72491c.Common
            L_0x0030:
                r2 = r7
                goto L_0x003e
            L_0x0032:
                boolean r7 = com.tencent.p014mm.storage.C72996z1.m85843n5(r8)
                if (r7 == 0) goto L_0x003b
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72491c.Enterprise
                goto L_0x0030
            L_0x003b:
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72491c.Unknown
                goto L_0x0030
            L_0x003e:
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$b[] r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72490b.values()
                int r8 = r7.length
                r0 = 0
                r3 = 0
            L_0x0045:
                if (r3 >= r8) goto L_0x0056
                r4 = r7[r3]
                int r5 = r4.f210877d
                if (r5 != r9) goto L_0x004f
                r5 = 1
                goto L_0x0050
            L_0x004f:
                r5 = 0
            L_0x0050:
                if (r5 == 0) goto L_0x0053
                goto L_0x0057
            L_0x0053:
                int r3 = r3 + 1
                goto L_0x0045
            L_0x0056:
                r4 = 0
            L_0x0057:
                if (r4 != 0) goto L_0x005d
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$b r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72490b.Unknown
                r3 = r7
                goto L_0x005e
            L_0x005d:
                r3 = r4
            L_0x005e:
                if (r10 != 0) goto L_0x0062
                java.lang.String r10 = ""
            L_0x0062:
                r4 = r10
                java.lang.String r5 = ""
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.JsApiPayInfo.<init>(java.lang.String, java.lang.String, int, java.lang.String):void");
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JsApiPayInfo)) {
                return false;
            }
            JsApiPayInfo jsApiPayInfo = (JsApiPayInfo) obj;
            return this.f210860d == jsApiPayInfo.f210860d && this.f210861e == jsApiPayInfo.f210861e && this.f210862f == jsApiPayInfo.f210862f && C87412m.m108589b(this.f210863g, jsApiPayInfo.f210863g) && C87412m.m108589b(this.f210864h, jsApiPayInfo.f210864h);
        }

        public int hashCode() {
            return (((((((this.f210860d.hashCode() * 31) + this.f210861e.hashCode()) * 31) + this.f210862f.hashCode()) * 31) + this.f210863g.hashCode()) * 31) + this.f210864h.hashCode();
        }

        public String toString() {
            return "JsApiPayInfo(chatType=" + this.f210860d + ", sendType=" + this.f210861e + ", sessionType=" + this.f210862f + ", sessionName=" + this.f210863g + ", timelineObjId=" + this.f210864h + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (parcel != null) {
                parcel.writeInt(this.f210860d.f210873d);
            }
            if (parcel != null) {
                parcel.writeInt(this.f210861e.f210882d);
            }
            if (parcel != null) {
                parcel.writeInt(this.f210862f.f210877d);
            }
            if (parcel != null) {
                parcel.writeString(this.f210863g);
            }
            if (parcel != null) {
                parcel.writeString(this.f210864h);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public JsApiPayInfo(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r8)
                if (r0 == 0) goto L_0x000a
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r0 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.EnterpriseTimeline
            L_0x0008:
                r2 = r0
                goto L_0x0016
            L_0x000a:
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85809L5(r8)
                if (r0 == 0) goto L_0x0013
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r0 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.Timeline
                goto L_0x0008
            L_0x0013:
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r0 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72488a.Unknown
                goto L_0x0008
            L_0x0016:
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85809L5(r8)
                if (r0 == 0) goto L_0x0020
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c r0 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72491c.Common
            L_0x001e:
                r3 = r0
                goto L_0x002c
            L_0x0020:
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r8)
                if (r0 == 0) goto L_0x0029
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c r0 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72491c.Enterprise
                goto L_0x001e
            L_0x0029:
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c r0 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72491c.Unknown
                goto L_0x001e
            L_0x002c:
                com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$b r4 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.C72490b.Timeline
                java.lang.String r0 = ""
                if (r8 != 0) goto L_0x0034
                r5 = r0
                goto L_0x0035
            L_0x0034:
                r5 = r8
            L_0x0035:
                if (r9 != 0) goto L_0x0039
                r6 = r0
                goto L_0x003a
            L_0x0039:
                r6 = r9
            L_0x003a:
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.JsApiPayInfo.<init>(java.lang.String, java.lang.String):void");
        }

        public JsApiPayInfo(C72488a aVar, C72491c cVar, C72490b bVar, String str, String str2) {
            C87412m.m108594g(aVar, "chatType");
            C87412m.m108594g(cVar, "sendType");
            C87412m.m108594g(bVar, "sessionType");
            C87412m.m108594g(str, "sessionName");
            C87412m.m108594g(str2, "timelineObjId");
            this.f210860d = aVar;
            this.f210861e = cVar;
            this.f210862f = bVar;
            this.f210863g = str;
            this.f210864h = str2;
        }
    }
}
