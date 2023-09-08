package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import a11.C39479c;
import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C45628s0;
import eb0.C86493v0;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lb0.C88394b;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import s90.C77626a;
import te3.ch4;
import te3.h44;
import te3.k55;
import te3.l55;
import te3.v45;
import te3.w45;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask */
public class SendAppMessageTask extends MainProcessTask {
    public static final Parcelable.Creator<SendAppMessageTask> CREATOR = new C82946c();

    /* renamed from: A */
    public String f242503A;

    /* renamed from: B */
    public int f242504B = 1;

    /* renamed from: C */
    public int f242505C = 2;

    /* renamed from: D */
    public String f242506D;

    /* renamed from: E */
    public String f242507E;

    /* renamed from: F */
    public int f242508F;

    /* renamed from: G */
    public int f242509G = 0;

    /* renamed from: H */
    public String f242510H;

    /* renamed from: I */
    public String f242511I;

    /* renamed from: J */
    public int f242512J;

    /* renamed from: K */
    public int f242513K = 1000;

    /* renamed from: L */
    public String f242514L;

    /* renamed from: M */
    public String f242515M;

    /* renamed from: N */
    public String f242516N;

    /* renamed from: P */
    public String f242517P;

    /* renamed from: Q */
    public boolean f242518Q;

    /* renamed from: Q0 */
    public String f242519Q0;

    /* renamed from: R */
    public boolean f242520R;

    /* renamed from: R0 */
    public String f242521R0;

    /* renamed from: S */
    public boolean f242522S;

    /* renamed from: S0 */
    public String f242523S0;

    /* renamed from: T */
    public boolean f242524T;

    /* renamed from: T0 */
    public String f242525T0;

    /* renamed from: U */
    public boolean f242526U;

    /* renamed from: U0 */
    public String f242527U0;

    /* renamed from: V */
    public String f242528V;

    /* renamed from: V0 */
    public String f242529V0;

    /* renamed from: W */
    public String f242530W;

    /* renamed from: W0 */
    public ArrayList<ShareInfo> f242531W0;

    /* renamed from: X */
    public String f242532X;

    /* renamed from: X0 */
    public Runnable f242533X0;

    /* renamed from: Y */
    public int f242534Y;

    /* renamed from: Y0 */
    public int f242535Y0;

    /* renamed from: Z */
    public int f242536Z;

    /* renamed from: Z0 */
    public boolean f242537Z0;

    /* renamed from: a1 */
    public String f242538a1;

    /* renamed from: b1 */
    public boolean f242539b1;

    /* renamed from: c1 */
    public boolean f242540c1 = false;

    /* renamed from: d1 */
    public int f242541d1;

    /* renamed from: e1 */
    public int f242542e1;

    /* renamed from: f */
    public String f242543f;

    /* renamed from: g */
    public String f242544g;

    /* renamed from: h */
    public String f242545h;

    /* renamed from: i */
    public String f242546i;

    /* renamed from: j */
    public String f242547j;

    /* renamed from: n */
    public String f242548n;

    /* renamed from: o */
    public String f242549o;

    /* renamed from: p */
    public String f242550p;

    /* renamed from: p0 */
    public String f242551p0;

    /* renamed from: q */
    public String f242552q;

    /* renamed from: r */
    public String f242553r;

    /* renamed from: s */
    public boolean f242554s;

    /* renamed from: t */
    public String f242555t;

    /* renamed from: u */
    public int f242556u;

    /* renamed from: v */
    public String f242557v;

    /* renamed from: w */
    public int f242558w;

    /* renamed from: x */
    public int f242559x;

    /* renamed from: x0 */
    public String f242560x0;

    /* renamed from: y */
    public String f242561y;

    /* renamed from: y0 */
    public String f242562y0;

    /* renamed from: z */
    public String f242563z;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask$a */
    public class C68621a implements C88394b.C88405h {

        /* renamed from: d */
        public final /* synthetic */ C68070l.C68072b f197096d;

        /* renamed from: e */
        public final /* synthetic */ StringBuilder f197097e;

        /* renamed from: f */
        public final /* synthetic */ boolean f197098f;

        /* renamed from: g */
        public final /* synthetic */ Bitmap f197099g;

        /* renamed from: h */
        public final /* synthetic */ byte[] f197100h;

        public C68621a(C68070l.C68072b bVar, StringBuilder sb, boolean z, Bitmap bitmap, byte[] bArr) {
            this.f197096d = bVar;
            this.f197097e = sb;
            this.f197098f = z;
            this.f197099g = bitmap;
            this.f197100h = bArr;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap mo94301a(java.io.InputStream r21) {
            /*
                r20 = this;
                r1 = r20
                r0 = r21
                java.lang.String r3 = "MicroMsg.SendAppMessageTask"
                if (r0 == 0) goto L_0x014a
                java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
                r4.<init>()
                r5 = 1024(0x400, float:1.435E-42)
                byte[] r5 = new byte[r5]
            L_0x0011:
                r6 = 2
                r7 = 1
                r8 = 0
                int r9 = r0.read(r5)     // Catch:{ IOException -> 0x0043 }
                r10 = -1
                if (r9 <= r10) goto L_0x001f
                r4.write(r5, r8, r9)     // Catch:{ IOException -> 0x0043 }
                goto L_0x0011
            L_0x001f:
                r4.flush()     // Catch:{ IOException -> 0x0043 }
                byte[] r4 = r4.toByteArray()     // Catch:{ IOException -> 0x0043 }
                com.tenpay.ndk.MessageDigestUtil r0 = new com.tenpay.ndk.MessageDigestUtil     // Catch:{ IOException -> 0x0041 }
                r0.<init>()     // Catch:{ IOException -> 0x0041 }
                java.lang.String r0 = r0.getSHA256Hex(r4)     // Catch:{ IOException -> 0x0041 }
                java.lang.String r5 = "sha256Hex:%s， length:%d"
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0041 }
                r9[r8] = r0     // Catch:{ IOException -> 0x0041 }
                int r0 = r4.length     // Catch:{ IOException -> 0x0041 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0041 }
                r9[r7] = r0     // Catch:{ IOException -> 0x0041 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r9)     // Catch:{ IOException -> 0x0041 }
                goto L_0x004c
            L_0x0041:
                r0 = move-exception
                goto L_0x0045
            L_0x0043:
                r0 = move-exception
                r4 = 0
            L_0x0045:
                java.lang.Object[] r5 = new java.lang.Object[r8]
                java.lang.String r9 = "read bmp buffer"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r9, r5)
            L_0x004c:
                r12 = r4
                java.lang.String r0 = "decodeBitmap thumb image finish, doSendAppMsgWithShareTicket"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask r10 = com.tencent.p014mm.plugin.appbrand.jsapi.share.SendAppMessageTask.this
                com.tencent.mm.message.l$b r11 = r1.f197096d
                java.lang.StringBuilder r13 = r1.f197097e
                int r14 = r10.f242513K
                boolean r15 = r10.f242522S
                boolean r0 = r10.f242524T
                java.lang.String r4 = r10.f242528V
                java.lang.String r5 = r10.f242510H
                boolean r9 = r1.f197098f
                android.graphics.Bitmap r2 = r1.f197099g
                r10.getClass()
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.Boolean r17 = java.lang.Boolean.valueOf(r9)
                r6[r8] = r17
                if (r2 == 0) goto L_0x0077
                r17 = 1
                goto L_0x0079
            L_0x0077:
                r17 = 0
            L_0x0079:
                java.lang.Boolean r17 = java.lang.Boolean.valueOf(r17)
                r6[r7] = r17
                if (r12 == 0) goto L_0x0082
                r8 = 1
            L_0x0082:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                r16 = 2
                r6[r16] = r8
                java.lang.String r8 = "hasSignature:%b, thumbBmp valid:%b, thumbData valid:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r6)
                if (r9 == 0) goto L_0x013e
                if (r2 == 0) goto L_0x013e
                boolean r3 = r2.isRecycled()
                if (r3 != 0) goto L_0x013e
                if (r12 == 0) goto L_0x013e
                int r3 = r12.length
                if (r3 <= r7) goto L_0x013e
                te3.l55 r3 = new te3.l55
                r3.<init>()
                int r6 = r2.getWidth()
                r3.f137190e = r6
                int r2 = r2.getHeight()
                r3.f137191f = r2
                int r2 = r12.length
                r3.f137192g = r2
                te3.f7 r2 = new te3.f7
                r2.<init>()
                r3.f137189d = r2
                r6 = 6
                r2.f133322d = r6
                java.lang.String r6 = r10.f242511I
                r2.f133324f = r6
                java.util.LinkedList r6 = new java.util.LinkedList
                r6.<init>()
                te3.g54 r7 = new te3.g54
                r7.<init>()
                java.lang.String r8 = "appid"
                r7.f133870d = r8
                java.lang.String r8 = r10.f242543f
                r7.f133871e = r8
                r6.add(r7)
                te3.g54 r7 = new te3.g54
                r7.<init>()
                java.lang.String r8 = "title"
                r7.f133870d = r8
                java.lang.String r8 = r10.f242545h
                java.lang.String r9 = ""
                if (r8 == 0) goto L_0x00e6
                goto L_0x00e7
            L_0x00e6:
                r8 = r9
            L_0x00e7:
                r7.f133871e = r8
                r6.add(r7)
                te3.g54 r7 = new te3.g54
                r7.<init>()
                java.lang.String r8 = "description"
                r7.f133870d = r8
                java.lang.String r8 = r10.f242546i
                if (r8 == 0) goto L_0x00fa
                goto L_0x00fb
            L_0x00fa:
                r8 = r9
            L_0x00fb:
                r7.f133871e = r8
                r6.add(r7)
                te3.g54 r7 = new te3.g54
                r7.<init>()
                java.lang.String r8 = "thumbDataHash"
                r7.f133870d = r8
                java.lang.String r8 = r10.f242510H
                r7.f133871e = r8
                r6.add(r7)
                te3.g54 r7 = new te3.g54
                r7.<init>()
                java.lang.String r8 = "userName"
                r7.f133870d = r8
                java.lang.String r8 = r10.f242544g
                if (r8 == 0) goto L_0x0120
                goto L_0x0121
            L_0x0120:
                r8 = r9
            L_0x0121:
                r7.f133871e = r8
                r6.add(r7)
                te3.g54 r7 = new te3.g54
                r7.<init>()
                java.lang.String r8 = "path"
                r7.f133870d = r8
                java.lang.String r8 = r10.f242555t
                if (r8 == 0) goto L_0x0134
                r9 = r8
            L_0x0134:
                r7.f133871e = r9
                r6.add(r7)
                r2.f133323e = r6
                r19 = r3
                goto L_0x0140
            L_0x013e:
                r19 = 0
            L_0x0140:
                r16 = r0
                r17 = r4
                r18 = r5
                r10.mo115226u(r11, r12, r13, r14, r15, r16, r17, r18, r19)
                goto L_0x0165
            L_0x014a:
                java.lang.String r0 = "decodeBitmap fail, inputStream is null , doSendAppMsgWithShareTicket"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask r4 = com.tencent.p014mm.plugin.appbrand.jsapi.share.SendAppMessageTask.this
                com.tencent.mm.message.l$b r5 = r1.f197096d
                byte[] r6 = r1.f197100h
                java.lang.StringBuilder r7 = r1.f197097e
                int r8 = r4.f242513K
                boolean r9 = r4.f242522S
                boolean r10 = r4.f242524T
                java.lang.String r11 = r4.f242528V
                java.lang.String r12 = r4.f242510H
                r13 = 0
                r4.mo115226u(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            L_0x0165:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.share.SendAppMessageTask.C68621a.mo94301a(java.io.InputStream):android.graphics.Bitmap");
        }

        public String key() {
            return "WxaIcon" + hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask$b */
    public class C82945b implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ LinkedList f242564d;

        /* renamed from: e */
        public final /* synthetic */ C68070l.C68072b f242565e;

        /* renamed from: f */
        public final /* synthetic */ int f242566f;

        /* renamed from: g */
        public final /* synthetic */ String f242567g;

        /* renamed from: h */
        public final /* synthetic */ byte[] f242568h;

        /* renamed from: i */
        public final /* synthetic */ StringBuilder f242569i;

        public C82945b(LinkedList linkedList, C68070l.C68072b bVar, int i, String str, byte[] bArr, StringBuilder sb) {
            this.f242564d = linkedList;
            this.f242565e = bVar;
            this.f242566f = i;
            this.f242567g = str;
            this.f242568h = bArr;
            this.f242569i = sb;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            ch4 ch4;
            h44 h44;
            Log.m105925i("MicroMsg.SendAppMessageTask", "callback, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            w45 w45 = (w45) cVar.f127056b.f127083a;
            if (i != 0 || i2 != 0 || w45 == null || Util.isNullOrNil((List) w45.f143857d)) {
                C68070l.C68072b bVar = this.f242565e;
                if (bVar.f195581h2 == 3) {
                    bVar.f195581h2 = 2;
                }
                Iterator it = this.f242564d.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (w45 != null) {
                        SendAppMessageTask.m101739q(SendAppMessageTask.this, this.f242565e, this.f242567g, w45.f143859f);
                    }
                    SendAppMessageTask.this.mo115225t(this.f242565e, this.f242568h, str2, this.f242569i, this.f242566f);
                }
            } else {
                LinkedList<k55> linkedList = w45.f143857d;
                SendAppMessageTask.this.f242531W0 = new ArrayList<>();
                int i3 = 0;
                while (i3 < this.f242564d.size()) {
                    k55 k55 = i3 < linkedList.size() ? linkedList.get(i3) : new k55();
                    C68070l.C68072b bVar2 = this.f242565e;
                    String str3 = k55.f136570e;
                    bVar2.f195593k2 = str3;
                    SendAppMessageTask.this.f242531W0.add(new ShareInfo(str3, k55.f136569d));
                    C80995a aVar = (C80995a) this.f242565e.mo93555w(C80995a.class);
                    boolean z = k55.f136572g;
                    aVar.f237896e = z;
                    aVar.f237912u = k55.f136575j;
                    if (z && (h44 = k55.f136571f) != null) {
                        aVar.f237897f = h44.f259542d;
                        aVar.f237898g = h44.f259543e;
                        aVar.f237899h = h44.f259544f;
                        aVar.f237900i = h44.f259545g;
                        aVar.f237901j = h44.f259546h;
                        aVar.f237902k = h44.f259549n;
                        aVar.f237904m = h44.f259548j;
                        aVar.f237903l = h44.f259547i;
                        WxaUpdatableMsgReportStruct wxaUpdatableMsgReportStruct = new WxaUpdatableMsgReportStruct();
                        wxaUpdatableMsgReportStruct.f237460d = wxaUpdatableMsgReportStruct.mo86045b("AppId", SendAppMessageTask.this.f242543f, true);
                        wxaUpdatableMsgReportStruct.f237461e = wxaUpdatableMsgReportStruct.mo86045b("PageId", SendAppMessageTask.this.f242555t, true);
                        wxaUpdatableMsgReportStruct.f237463g = wxaUpdatableMsgReportStruct.mo86045b("ShareTicket", k55.f136570e, true);
                        wxaUpdatableMsgReportStruct.f237464h = wxaUpdatableMsgReportStruct.mo86045b("ChattingId", (String) this.f242564d.get(i3), true);
                        wxaUpdatableMsgReportStruct.f237465i = ((String) this.f242564d.get(i3)).toLowerCase().endsWith("@chatroom") ? WxaUpdatableMsgReportStruct.C80797c.YES : WxaUpdatableMsgReportStruct.C80797c.NO;
                        wxaUpdatableMsgReportStruct.f237466j = WxaUpdatableMsgReportStruct.C80796b.SHAREAPPMSG;
                        wxaUpdatableMsgReportStruct.f237467k = (long) this.f242566f;
                        wxaUpdatableMsgReportStruct.f237468l = wxaUpdatableMsgReportStruct.mo86045b("SceneNote", SendAppMessageTask.this.f242514L, true);
                        wxaUpdatableMsgReportStruct.f237471o = WxaUpdatableMsgReportStruct.C80795a.m98639a(SendAppMessageTask.this.f242534Y + 1000);
                        long nowMilliSecond = Util.nowMilliSecond();
                        wxaUpdatableMsgReportStruct.f237462f = nowMilliSecond;
                        wxaUpdatableMsgReportStruct.mo86048e("ActionTimeStampMs", nowMilliSecond);
                        wxaUpdatableMsgReportStruct.f237469m = WxaUpdatableMsgReportStruct.C80798d.DOING;
                        wxaUpdatableMsgReportStruct.f237470n = WxaUpdatableMsgReportStruct.C80799e.NOTSUBSCRIBE;
                        wxaUpdatableMsgReportStruct.mo86054n();
                    }
                    if (k55.f136573h && (ch4 = k55.f136574i) != null && ch4.f131729d) {
                        aVar.f237909r = ch4.f131730e;
                    }
                    SendAppMessageTask.m101739q(SendAppMessageTask.this, this.f242565e, this.f242567g, w45.f143859f);
                    SendAppMessageTask.this.mo115225t(this.f242565e, this.f242568h, (String) this.f242564d.get(i3), this.f242569i, this.f242566f);
                    i3++;
                }
            }
            SendAppMessageTask.this.mo114394b();
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask$c */
    public class C82946c implements Parcelable.Creator<SendAppMessageTask> {
        public Object createFromParcel(Parcel parcel) {
            return new SendAppMessageTask(parcel);
        }

        public Object[] newArray(int i) {
            return new SendAppMessageTask[i];
        }
    }

    public SendAppMessageTask() {
    }

    /* renamed from: q */
    public static void m101739q(SendAppMessageTask sendAppMessageTask, C68070l.C68072b bVar, String str, String str2) {
        sendAppMessageTask.getClass();
        Log.m105925i("MicroMsg.SendAppMessageTask", "checkAddSignature thumbDataHash:%s, platformSignature:%s", str, str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C77626a aVar = new C77626a();
            aVar.f226289d = str2;
            aVar.f226287b = str;
            bVar.mo93545f(aVar);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f242543f = parcel.readString();
        this.f242544g = parcel.readString();
        this.f242545h = parcel.readString();
        this.f242546i = parcel.readString();
        this.f242547j = parcel.readString();
        this.f242548n = parcel.readString();
        this.f242549o = parcel.readString();
        this.f242555t = parcel.readString();
        this.f242559x = parcel.readInt();
        this.f242550p = parcel.readString();
        this.f242552q = parcel.readString();
        this.f242553r = parcel.readString();
        boolean z = false;
        this.f242554s = parcel.readInt() == 1;
        this.f242556u = parcel.readInt();
        this.f242557v = parcel.readString();
        this.f242558w = parcel.readInt();
        this.f242561y = parcel.readString();
        this.f242512J = parcel.readInt();
        this.f242513K = parcel.readInt();
        this.f242514L = parcel.readString();
        this.f242515M = parcel.readString();
        this.f242516N = parcel.readString();
        this.f242517P = parcel.readString();
        this.f242518Q = parcel.readByte() == 1;
        this.f242520R = parcel.readInt() == 1;
        this.f242522S = parcel.readInt() == 1;
        this.f242528V = parcel.readString();
        this.f242524T = parcel.readInt() == 1;
        this.f242530W = parcel.readString();
        this.f242534Y = parcel.readInt();
        this.f242532X = parcel.readString();
        this.f242531W0 = parcel.readArrayList(SendAppMessageTask.class.getClassLoader());
        this.f242563z = parcel.readString();
        this.f242536Z = parcel.readInt();
        this.f242505C = parcel.readInt();
        this.f242503A = parcel.readString();
        this.f242508F = parcel.readInt();
        this.f242504B = parcel.readInt();
        this.f242551p0 = parcel.readString();
        this.f242560x0 = parcel.readString();
        this.f242562y0 = parcel.readString();
        this.f242519Q0 = parcel.readString();
        this.f242526U = parcel.readInt() == 1;
        this.f242521R0 = parcel.readString();
        this.f242523S0 = parcel.readString();
        this.f242525T0 = parcel.readString();
        this.f242527U0 = parcel.readString();
        this.f242529V0 = parcel.readString();
        this.f242535Y0 = parcel.readInt();
        this.f242539b1 = parcel.readInt() == 1;
        this.f242538a1 = parcel.readString();
        this.f242540c1 = parcel.readInt() == 1;
        this.f242509G = parcel.readInt();
        this.f242506D = parcel.readString();
        this.f242507E = parcel.readString();
        this.f242541d1 = parcel.readInt();
        this.f242542e1 = parcel.readInt();
        this.f242510H = parcel.readString();
        this.f242511I = parcel.readString();
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f242537Z0 = z;
    }

    /* renamed from: i */
    public void mo1552i() {
        Runnable runnable = this.f242533X0;
        if (runnable != null) {
            ((C82960f) runnable).run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        Bitmap bitmap;
        byte[] bArr;
        Log.m105925i("MicroMsg.SendAppMessageTask", "username = %s, thumbIconUrl = %s", this.f242544g, this.f242550p);
        byte[] bArr2 = new byte[0];
        if (!Util.isNullOrNil(this.f242550p) && (this.f242550p.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || this.f242550p.startsWith(HttpWrapperBase.PROTOCAL_HTTPS))) {
            String str = C88394b.f255384g;
            bitmap = C88394b.C88418q.f255427a.mo122791g(this.f242550p, (C88394b.C88405h) null);
        } else if (!Util.isNullOrNil(this.f242553r)) {
            bitmap = BitmapUtil.getBitmapNative(this.f242553r);
            if (this.f242554s) {
                Log.m105927v("MicroMsg.SendAppMessageTask", "decode thumb icon bitmap by path(%s), and deleted(%s) file.", this.f242553r, Boolean.valueOf(C86013q1.m106447h(this.f242553r)));
            } else {
                Log.m105927v("MicroMsg.SendAppMessageTask", "decode thumb icon bitmap by path(%s)", this.f242553r);
            }
        } else {
            bitmap = null;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            Log.m105920e("MicroMsg.SendAppMessageTask", "thumb image is null");
            bArr = bArr2;
        } else {
            Log.m105924i("MicroMsg.SendAppMessageTask", "thumb image is not null ");
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
            Log.m105925i("MicroMsg.SendAppMessageTask", "bitmap recycle %s", createBitmap);
            createBitmap.recycle();
        }
        Log.m105925i("MicroMsg.SendAppMessageTask", "doSendMessage, appId : %s, title = %s, description = %s ,username = %s ,path = %s, thumbIconUrl = %s", this.f242543f, this.f242545h, this.f242546i, this.f242544g, this.f242555t, this.f242550p);
        C86493v0.m107224d().mo120947c(C86493v0.m107223a("wxapp_" + this.f242543f + this.f242555t), true).mo120962i("prePublishId", "wxapp_" + this.f242543f + this.f242555t);
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195570f = this.f242545h;
        bVar.f195574g = this.f242546i;
        bVar.f195573f2 = this.f242544g;
        bVar.f195569e2 = this.f242555t;
        bVar.f195577g2 = this.f242543f;
        bVar.f195653z2 = this.f242556u;
        bVar.f195467A2 = this.f242558w;
        bVar.f195585i2 = this.f242557v;
        bVar.f195581h2 = this.f242559x;
        bVar.f195605n2 = this.f242508F;
        int i = this.f242542e1;
        bVar.f195617q2 = i;
        if (i != 0) {
            bVar.f195605n2 = 1;
        }
        bVar.f195586j = this.f242549o;
        bVar.f195471B2 = this.f242552q;
        bVar.f195494H1 = "wxapp_" + this.f242543f + this.f242555t;
        bVar.f195634v = this.f242544g;
        bVar.f195638w = this.f242561y;
        C80995a aVar = new C80995a();
        aVar.f237893b = this.f242520R;
        aVar.f237894c = this.f242530W;
        aVar.f237895d = this.f242534Y;
        aVar.f237896e = this.f242522S;
        aVar.f237910s = this.f242563z;
        String str2 = this.f242550p;
        aVar.f237913v = str2;
        aVar.f237914w = Util.isNullOrNil(str2);
        aVar.f237906o = this.f242535Y0;
        aVar.f237907p = this.f242537Z0;
        aVar.f237892I = this.f242540c1;
        aVar.f237911t = this.f242509G;
        bVar.mo93545f(aVar);
        StringBuilder a = C82967h0.m101762a(this.f242543f, this.f242512J);
        bVar.f195589j2 = a.toString();
        C82970i0 i0Var = new C82970i0();
        i0Var.f242601b = 1;
        i0Var.f242602c = this.f242545h;
        i0Var.f242603d = this.f242555t;
        i0Var.f242604e = this.f242550p;
        i0Var.f242605f = this.f242541d1;
        C82972j0.m101772b(bVar.f195589j2, i0Var);
        int i2 = this.f242504B;
        if (1 == i2) {
            bVar.f195582i = 33;
        } else if (2 == i2) {
            bVar.f195582i = 44;
            bVar.f195597l2 = this.f242505C;
            bVar.f195601m2 = this.f242503A;
            bVar.f195609o2 = this.f242506D;
            bVar.f195613p2 = this.f242507E;
        } else if (i2 == 3) {
            bVar.f195582i = 46;
            bVar.f195562d = this.f242551p0;
            bVar.f195484F = this.f242560x0;
            bVar.f195634v = this.f242562y0;
            bVar.f195638w = null;
            aVar.f237884A = this.f242519Q0;
        } else if (i2 == 4) {
            bVar.f195582i = 48;
            FilePathGenerator.checkMkdir(C112760b.m154199G());
            String str3 = C112760b.m154199G() + this.f242523S0;
            if (!str3.equals(this.f242521R0)) {
                Log.m105925i("MicroMsg.SendAppMessageTask", "hy: copy upload file to %s, len is %d", str3, Long.valueOf(C86013q1.m106443d(this.f242521R0, str3, false)));
            }
            aVar.f237886C = str3;
            aVar.f237887D = this.f242523S0;
            aVar.f237889F = this.f242527U0;
            aVar.f237891H = this.f242529V0;
        } else if (i2 == 5) {
            bVar.f195582i = 5;
            bVar.f195646y = this.f242550p;
        }
        boolean z = !TextUtils.isEmpty(this.f242510H) && !TextUtils.isEmpty(this.f242511I) && !TextUtils.isEmpty(this.f242550p);
        Log.m105925i("MicroMsg.SendAppMessageTask", "hasSignature:%b", Boolean.valueOf(z));
        Log.m105925i("MicroMsg.SendAppMessageTask", "doSendMessage isUpdateMsg:%b, withShareTicket:%b, isToDoMessage:%b isPrivateMsg:%b", Boolean.valueOf(this.f242522S), Boolean.valueOf(this.f242518Q), Boolean.valueOf(this.f242539b1), Boolean.valueOf(this.f242524T));
        if ((!this.f242522S || !this.f242518Q) && !this.f242518Q && !this.f242539b1 && !this.f242524T && !z) {
            Iterator it = new LinkedList(Util.stringsToList(this.f242548n.split(","))).iterator();
            while (it.hasNext()) {
                mo115225t(bVar, bArr, (String) it.next(), a, this.f242513K);
            }
        } else if (!z || bitmap == null || bitmap.isRecycled()) {
            mo115226u(bVar, bArr, a, this.f242513K, this.f242522S, this.f242524T, this.f242528V, this.f242510H, (l55) null);
        } else {
            Log.m105924i("MicroMsg.SendAppMessageTask", "load thumb inputStream");
            String str4 = this.f242553r;
            if (this.f242550p.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || this.f242550p.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                str4 = this.f242550p;
            }
            String str5 = str4;
            String str6 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122791g(str5, new C68621a(bVar, a, z, bitmap, bArr));
        }
    }

    /* renamed from: t */
    public final void mo115225t(C68070l.C68072b bVar, byte[] bArr, String str, StringBuilder sb, int i) {
        int i2;
        String str2 = str;
        C80996q.C1279a.m1369a().mo112827qE(bVar, this.f242543f, this.f242545h, str, (String) null, bArr);
        int i3 = 0;
        if (!Util.isNullOrNil(this.f242547j)) {
            SendMsgEvent sendMsgEvent = new SendMsgEvent();
            SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
            aVar.f9497a = str2;
            aVar.f9498b = this.f242547j;
            aVar.f9499c = C45628s0.m50810y(str);
            sendMsgEvent.f9496d.f9500d = 0;
            sendMsgEvent.publish();
        }
        if (str.toLowerCase().endsWith("@chatroom")) {
            List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(str2);
            if (bD != null) {
                i3 = ((LinkedList) bD).size();
            }
            i2 = i3;
        } else {
            i2 = 1;
        }
        C82967h0.m101765d(this.f242543f, i, this.f242514L, this.f242515M, str, this.f242545h, this.f242555t, this.f242516N, this.f242517P, i2, sb.toString(), this.f242532X, this.f242534Y, this.f242550p, this.f242536Z, C72996z1.m85820U5(str) ? 2 : 1, this.f242563z);
    }

    /* renamed from: u */
    public final void mo115226u(C68070l.C68072b bVar, byte[] bArr, StringBuilder sb, int i, boolean z, boolean z2, String str, String str2, l55 l55) {
        boolean z3 = z2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 1118;
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo";
        v45 v45 = new v45();
        v45.f259867d = this.f242543f;
        LinkedList<String> linkedList = new LinkedList<>(Util.stringsToList(this.f242548n.split(",")));
        v45.f259868e = linkedList;
        v45.f259870g = str;
        v45.f259869f = z;
        v45.f259871h = this.f242539b1;
        v45.f259872i = this.f242538a1;
        v45.f259873j = z3;
        v45.f259874n = z3 ? 3 : 0;
        v45.f259875o = l55;
        bVar2.f127066a = v45;
        bVar2.f127067b = new w45();
        C89144l0.m111429e(bVar2.mo72403a(), new C82945b(linkedList, bVar, i, str2, bArr, sb), false);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242543f);
        parcel.writeString(this.f242544g);
        parcel.writeString(this.f242545h);
        parcel.writeString(this.f242546i);
        parcel.writeString(this.f242547j);
        parcel.writeString(this.f242548n);
        parcel.writeString(this.f242549o);
        parcel.writeString(this.f242555t);
        parcel.writeInt(this.f242559x);
        parcel.writeString(this.f242550p);
        parcel.writeString(this.f242552q);
        parcel.writeString(this.f242553r);
        parcel.writeInt(this.f242554s ? 1 : 0);
        parcel.writeInt(this.f242556u);
        parcel.writeString(this.f242557v);
        parcel.writeInt(this.f242558w);
        parcel.writeString(this.f242561y);
        parcel.writeInt(this.f242512J);
        parcel.writeInt(this.f242513K);
        parcel.writeString(this.f242514L);
        parcel.writeString(this.f242515M);
        parcel.writeString(this.f242516N);
        parcel.writeString(this.f242517P);
        parcel.writeByte(this.f242518Q ? (byte) 1 : 0);
        parcel.writeInt(this.f242520R ? 1 : 0);
        parcel.writeInt(this.f242522S ? 1 : 0);
        parcel.writeString(this.f242528V);
        parcel.writeInt(this.f242524T ? 1 : 0);
        parcel.writeString(this.f242530W);
        parcel.writeInt(this.f242534Y);
        parcel.writeString(this.f242532X);
        parcel.writeList(this.f242531W0);
        parcel.writeString(this.f242563z);
        parcel.writeInt(this.f242536Z);
        parcel.writeInt(this.f242505C);
        parcel.writeString(this.f242503A);
        parcel.writeInt(this.f242508F);
        parcel.writeInt(this.f242504B);
        parcel.writeString(this.f242551p0);
        parcel.writeString(this.f242560x0);
        parcel.writeString(this.f242562y0);
        parcel.writeString(this.f242519Q0);
        parcel.writeInt(this.f242526U ? 1 : 0);
        parcel.writeString(this.f242521R0);
        parcel.writeString(this.f242523S0);
        parcel.writeString(this.f242525T0);
        parcel.writeString(this.f242527U0);
        parcel.writeString(this.f242529V0);
        parcel.writeInt(this.f242535Y0);
        parcel.writeInt(this.f242539b1 ? 1 : 0);
        parcel.writeString(this.f242538a1);
        parcel.writeInt(this.f242540c1 ? 1 : 0);
        parcel.writeInt(this.f242509G);
        parcel.writeString(this.f242506D);
        parcel.writeString(this.f242507E);
        parcel.writeInt(this.f242541d1);
        parcel.writeInt(this.f242542e1);
        parcel.writeString(this.f242510H);
        parcel.writeString(this.f242511I);
        parcel.writeInt(this.f242537Z0 ? 1 : 0);
    }

    public SendAppMessageTask(Parcel parcel) {
        mo1551g(parcel);
    }
}
