package em3;

import android.graphics.RectF;
import android.view.View;
import ck3.C67391b;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import fm3.C75776a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: em3.j */
public class C86585j {

    /* renamed from: n */
    public static final Map<String, String> f251504n = new HashMap(100);

    /* renamed from: a */
    public long f251505a;

    /* renamed from: b */
    public RectF f251506b;

    /* renamed from: c */
    public boolean f251507c;

    /* renamed from: d */
    public String f251508d;

    /* renamed from: e */
    public String f251509e;

    /* renamed from: f */
    public long f251510f;

    /* renamed from: g */
    public int f251511g;

    /* renamed from: h */
    public String f251512h;

    /* renamed from: i */
    public String f251513i;

    /* renamed from: j */
    public String f251514j;

    /* renamed from: k */
    public String f251515k;

    /* renamed from: l */
    public int f251516l;

    /* renamed from: m */
    public C72963f4 f251517m;

    /* renamed from: a */
    public static C86585j m107402a(long j, String str, String str2, boolean z, boolean z2, C67391b bVar, View view) {
        if (j >= 0) {
            return m107403b(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j), str, str2, z, z2, bVar, view);
        }
        Log.m105920e("MicroMsg.MagicEmojiMsgMeta", "hy: not valid msgId");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0183  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static em3.C86585j m107403b(com.tencent.p014mm.storage.C72963f4 r16, java.lang.String r17, java.lang.String r18, boolean r19, boolean r20, ck3.C67391b r21, android.view.View r22) {
        /*
            r1 = r16
            r2 = r17
            r3 = r21
            r4 = r22
            boolean r0 = r16.mo101020w3()
            if (r0 == 0) goto L_0x0011
            r0 = 49
            goto L_0x0015
        L_0x0011:
            int r0 = r16.getType()
        L_0x0015:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = "MicroMsg.MagicEmojiMsgMeta"
            java.lang.String r9 = "hy: start get msg info with msg type: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r9, r6)
            em3.j r6 = new em3.j
            r6.<init>()
            r6.f251517m = r1
            long r9 = r16.getMsgId()
            r6.f251505a = r9
            r6.f251512h = r2
            uk.g$a r9 = p1048uk.C102051g.f300534a
            java.lang.String r9 = r9.mo141551b(r1)
            r6.f251508d = r9
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x0059
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            long r12 = r16.getMsgId()
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            goto L_0x005a
        L_0x0059:
            r10 = r2
        L_0x005a:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            if (r12 != 0) goto L_0x006b
            java.util.Map<java.lang.String, java.lang.String> r9 = f251504n
            java.util.HashMap r9 = (java.util.HashMap) r9
            r12 = r18
            r9.put(r10, r12)
            r9 = r12
            goto L_0x0094
        L_0x006b:
            java.util.Map<java.lang.String, java.lang.String> r12 = f251504n
            java.util.HashMap r12 = (java.util.HashMap) r12
            boolean r13 = r12.containsKey(r10)
            if (r13 == 0) goto L_0x007c
            java.lang.Object r9 = r12.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0094
        L_0x007c:
            java.lang.String r13 = "hy: get emoji that has never fired"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r13)
            java.lang.Class<bq.d1> r13 = p008bq.C67305d1.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            bq.d1 r13 = (p008bq.C67305d1) r13
            java.lang.String r9 = r13.mo91431n8(r9)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            r12.put(r10, r9)
        L_0x0094:
            r6.f251509e = r9
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r10 = 0
            if (r9 == 0) goto L_0x009e
            goto L_0x00cf
        L_0x009e:
            java.lang.String r9 = r6.f251509e
            java.lang.String r12 = "key"
            gy3.C87412m.m108594g(r9, r12)
            uk.b r12 = p1048uk.C102051g.f300538e
            java.util.ArrayList<uk.b$a> r12 = r12.f300528c
            java.util.Iterator r12 = r12.iterator()
        L_0x00ad:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c3
            java.lang.Object r13 = r12.next()
            r14 = r13
            uk.b$a r14 = (p1048uk.C102048b.C102049a) r14
            java.lang.String r14 = r14.f300529b
            boolean r14 = gy3.C87412m.m108589b(r14, r9)
            if (r14 == 0) goto L_0x00ad
            goto L_0x00c4
        L_0x00c3:
            r13 = r10
        L_0x00c4:
            uk.b$a r13 = (p1048uk.C102048b.C102049a) r13
            if (r13 == 0) goto L_0x00cf
            uk.b$b r9 = r13.f300531d
            if (r9 == 0) goto L_0x00cf
            int r9 = r9.f300533c
            goto L_0x00d0
        L_0x00cf:
            r9 = 0
        L_0x00d0:
            r6.f251516l = r9
            int r9 = r16.mo108769t2()
            if (r9 == r5) goto L_0x00da
            r9 = 1
            goto L_0x00db
        L_0x00da:
            r9 = 0
        L_0x00db:
            r6.f251507c = r9
            long r12 = r16.getCreateTime()
            r6.f251510f = r12
            int r9 = r16.mo108769t2()
            if (r9 != r5) goto L_0x00ee
            java.lang.String r11 = eb0.C75592q0.m90789s()
            goto L_0x0129
        L_0x00ee:
            java.lang.String r9 = r16.mo108768t()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r9 == 0) goto L_0x0125
            java.lang.String r9 = r16.getContent()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            java.lang.String r12 = "MicroMsg.MagicEmojiUtils"
            if (r9 != 0) goto L_0x011f
            java.lang.String r9 = r16.getContent()
            java.lang.String r13 = ":"
            int r9 = r9.indexOf(r13)
            if (r9 <= 0) goto L_0x0119
            java.lang.String r11 = r16.getContent()
            java.lang.String r11 = r11.substring(r8, r9)
            goto L_0x0129
        L_0x0119:
            java.lang.String r9 = "hy: can not retrieve username from group chat content"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r9)
            goto L_0x0129
        L_0x011f:
            java.lang.String r9 = "hy: msg content lost"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r9)
            goto L_0x0129
        L_0x0125:
            java.lang.String r11 = r16.mo108768t()
        L_0x0129:
            r6.f251513i = r11
            int r9 = r16.mo108769t2()
            if (r9 != r5) goto L_0x0136
            java.lang.String r9 = r16.mo108768t()
            goto L_0x0149
        L_0x0136:
            java.lang.String r9 = r16.mo108768t()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r9 == 0) goto L_0x0145
            java.lang.String r9 = r16.mo108768t()
            goto L_0x0149
        L_0x0145:
            java.lang.String r9 = eb0.C75592q0.m90789s()
        L_0x0149:
            r6.f251514j = r9
            r6.f251511g = r0
            com.tencent.mm.storage.f4 r0 = r6.f251517m
            boolean r0 = r0.mo101020w3()
            if (r0 == 0) goto L_0x0181
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            com.tencent.mm.storage.f4 r0 = r6.f251517m     // Catch:{ JSONException -> 0x0173 }
            int r0 = com.tencent.p014mm.message.C40339m.m43520a(r0)     // Catch:{ JSONException -> 0x0173 }
            java.lang.String r11 = "hy: appmsg inner type is %d"
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ JSONException -> 0x0173 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0173 }
            r12[r8] = r13     // Catch:{ JSONException -> 0x0173 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r12)     // Catch:{ JSONException -> 0x0173 }
            java.lang.String r11 = "appMsgInnerType"
            r9.put(r11, r0)     // Catch:{ JSONException -> 0x0173 }
            goto L_0x017b
        L_0x0173:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.String r12 = "hy: failed getting msg inner type"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r12, r11)
        L_0x017b:
            java.lang.String r0 = r9.toString()
            r6.f251515k = r0
        L_0x0181:
            if (r19 == 0) goto L_0x025f
            long r11 = r16.getMsgId()
            java.lang.Class<zj3.l> r0 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r9 = r3.f193278b
            xi.d r0 = r9.mo102812a(r0)
            zj3.l r0 = (zj3.C79368l) r0
            android.view.View r0 = r0.mo108212v(r11)
            if (r0 == 0) goto L_0x019e
            java.lang.Object r0 = r0.getTag()
            com.tencent.mm.ui.chatting.viewitems.i$c r0 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c) r0
            goto L_0x019f
        L_0x019e:
            r0 = r10
        L_0x019f:
            if (r0 != 0) goto L_0x01a8
            java.lang.String r0 = "hy: msg item not found!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x0257
        L_0x01a8:
            r9 = 2
            int[] r11 = new int[r9]
            if (r4 != 0) goto L_0x01b2
            r11[r5] = r8
            r11[r8] = r8
            goto L_0x01b5
        L_0x01b2:
            r4.getLocationInWindow(r11)
        L_0x01b5:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            if (r12 == 0) goto L_0x01d6
            android.view.View r0 = r0.getMainContainerView()
            if (r0 != 0) goto L_0x01c8
            java.lang.String r0 = "hy: not having main view"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x0257
        L_0x01c8:
            int[] r1 = new int[r9]
            r0.getLocationInWindow(r1)
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            goto L_0x0202
        L_0x01d6:
            java.lang.Class<zj3.t> r0 = zj3.C79382t.class
            com.tencent.mm.ui.chatting.manager.a r3 = r3.f193278b
            xi.d r0 = r3.mo102812a(r0)
            zj3.t r0 = (zj3.C79382t) r0
            uk.a r0 = r0.mo109367I5()
            long r12 = r16.getMsgId()
            android.graphics.RectF r0 = r0.mo124819w(r12, r2)
            int[] r1 = new int[r9]
            float r2 = r0.left
            int r2 = (int) r2
            r1[r8] = r2
            float r2 = r0.top
            int r2 = (int) r2
            r1[r5] = r2
            float r2 = r0.width()
            int r2 = (int) r2
            float r0 = r0.height()
            int r0 = (int) r0
        L_0x0202:
            if (r20 == 0) goto L_0x0239
            android.graphics.Point r3 = new android.graphics.Point
            int r12 = r22.getWidth()
            int r4 = r22.getHeight()
            r3.<init>(r12, r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            r12 = r11[r8]
            r13 = r11[r5]
            int r14 = r3.x
            int r14 = r14 + r12
            int r3 = r3.y
            int r3 = r3 + r13
            r4.<init>(r12, r13, r14, r3)
            android.graphics.Rect r3 = new android.graphics.Rect
            r12 = r1[r8]
            r13 = r1[r5]
            int r14 = r2 + r12
            int r15 = r0 + r13
            r3.<init>(r12, r13, r14, r15)
            boolean r3 = r3.intersect(r4)
            if (r3 != 0) goto L_0x0239
            java.lang.String r0 = "hy: main view not in the window location"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x0257
        L_0x0239:
            int r3 = r1.length
            if (r3 < r9) goto L_0x0252
            r3 = r1[r8]
            r4 = r11[r8]
            int r3 = r3 - r4
            float r3 = (float) r3
            r1 = r1[r5]
            r4 = r11[r5]
            int r1 = r1 - r4
            float r1 = (float) r1
            android.graphics.RectF r4 = new android.graphics.RectF
            float r2 = (float) r2
            float r2 = r2 + r3
            float r0 = (float) r0
            float r0 = r0 + r1
            r4.<init>(r3, r1, r2, r0)
            goto L_0x0258
        L_0x0252:
            java.lang.String r0 = "hy: window or view lost"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x0257:
            r4 = r10
        L_0x0258:
            if (r20 == 0) goto L_0x025d
            if (r4 != 0) goto L_0x025d
            return r10
        L_0x025d:
            r6.f251506b = r4
        L_0x025f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: em3.C86585j.m107403b(com.tencent.mm.storage.f4, java.lang.String, java.lang.String, boolean, boolean, ck3.b, android.view.View):em3.j");
    }

    /* renamed from: c */
    public Map<String, Object> mo121027c(boolean z) {
        HashMap hashMap = new HashMap(5);
        hashMap.put("msgId", Long.valueOf(this.f251505a));
        hashMap.put("ID", this.f251512h);
        hashMap.put("isFrom", Boolean.valueOf(this.f251507c));
        hashMap.put("msgType", Integer.valueOf(this.f251511g));
        hashMap.put("content", this.f251508d);
        hashMap.put("emojiKey", this.f251509e);
        hashMap.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.f251510f));
        hashMap.put("fromUserName", this.f251513i);
        hashMap.put("toUserName", this.f251514j);
        hashMap.put("emojiConfigVersion", Integer.valueOf(this.f251516l));
        hashMap.put("ext", this.f251515k);
        if (this.f251506b != null) {
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("x", Float.valueOf(C75776a.m91027a(this.f251506b.left, z)));
            hashMap2.put("y", Float.valueOf(C75776a.m91027a(this.f251506b.top, z)));
            hashMap2.put("w", Float.valueOf(C75776a.m91027a(this.f251506b.width(), z)));
            hashMap2.put("h", Float.valueOf(C75776a.m91027a(this.f251506b.height(), z)));
            hashMap.put("frame", hashMap2);
        }
        return hashMap;
    }

    public String toString() {
        return "MagicEmojiMsgMeta{msgId=" + this.f251505a + ", frame=" + this.f251506b + ", isFrom=" + this.f251507c + ", content='" + this.f251508d + '\'' + ", emojiKey='" + this.f251509e + '\'' + ", timestamp=" + this.f251510f + ", msgType=" + this.f251511g + ", emojiID='" + this.f251512h + '\'' + ", fromUserName='" + this.f251513i + '\'' + ", toUserName='" + this.f251514j + '\'' + ", extData='" + this.f251515k + '\'' + ", emojiConfigVersion=" + this.f251516l + ", mMsgInfo=" + this.f251517m + '}';
    }
}
