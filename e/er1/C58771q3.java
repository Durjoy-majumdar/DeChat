package er1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lc3.C10485b;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C64311db1;
import te3.C64633pn1;
import te3.C64726td1;
import te3.C64770ve1;
import up1.C37521f;
import vp1.C65834e;
import z04.C112550d0;
import z04.C66723k;

/* renamed from: er1.q3 */
public final class C58771q3 {

    /* renamed from: a */
    public static final C58771q3 f168268a = new C58771q3();

    /* renamed from: b */
    public static ArrayList<C66723k> f168269b;

    /* renamed from: er1.q3$a */
    public static final class C58772a {

        /* renamed from: a */
        public final int f168270a;

        /* renamed from: b */
        public final int f168271b;

        public C58772a(int i, int i2) {
            this.f168270a = i;
            this.f168271b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C58772a)) {
                return false;
            }
            C58772a aVar = (C58772a) obj;
            return this.f168270a == aVar.f168270a && this.f168271b == aVar.f168271b;
        }

        public int hashCode() {
            return (this.f168270a * 31) + this.f168271b;
        }

        public String toString() {
            return "SmileySpanInfo(start=" + this.f168270a + ", count=" + this.f168271b + ')';
        }
    }

    static {
        List<String> list;
        ArrayList<C66723k> arrayList = new ArrayList<>();
        C37521f.f99374d.getClass();
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderTopicInputStopTokenList");
        if (!(c instanceof String)) {
            c = null;
        }
        String str = c;
        if (str == null || C87412m.m108589b(str, "")) {
            list = C64197v.m75537f("\\s", "\\n", "#", "@", "\\t");
        } else {
            List U = C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList();
            for (Object next : U) {
                if (!Util.isNullOrNil((String) next)) {
                    arrayList2.add(next);
                }
            }
            Log.m105924i("FinderConfig", "endchars: " + arrayList2);
            list = arrayList2;
        }
        for (String kVar : list) {
            arrayList.add(new C66723k(kVar));
        }
        f168269b = arrayList;
    }

    /* renamed from: a */
    public final String mo83810a(FinderItem finderItem) {
        String str;
        FinderObjectDesc finderObjectDesc;
        C64311db1 db12;
        String str2;
        C64633pn1 pn12;
        C87412m.m108594g(finderItem, "finderItem");
        FinderObjectDesc finderObjectDesc2 = finderItem.getFeedObject().objectDesc;
        if (finderObjectDesc2 == null || (pn12 = finderObjectDesc2.topic) == null || (str = pn12.f184865d) == null) {
            str = "";
        }
        Map<String, String> parseXml = XmlParser.parseXml(str, "finder", (String) null);
        if (parseXml == null) {
            return "[]";
        }
        C58723f3 f3Var = C58723f3.f168122a;
        int i = Util.getInt(parseXml.get(".finder.valuecount"), -1);
        if (i < 0) {
            return "[]";
        }
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append('.');
            C58723f3 f3Var2 = C58723f3.f168122a;
            sb.append("finder");
            sb.append('.');
            sb.append("value");
            sb.append(i2);
            sb.append('.');
            sb.append("topic");
            String str3 = parseXml.get(sb.toString());
            if (!Util.isNullOrNil(str3)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("topic", str3);
                    jSONObject.put("type", 1);
                    jSONObject.put("count", 0);
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
            }
        }
        FinderObject feedObject = finderItem.getFeedObject();
        if (!(feedObject == null || (finderObjectDesc = feedObject.objectDesc) == null || (db12 = finderObjectDesc.location) == null || (str2 = db12.f182663f) == null)) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("topic", str2);
                jSONObject2.put("type", 2);
                jSONObject2.put("count", 0);
                jSONArray.put(jSONObject2);
            } catch (Exception unused2) {
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "reportArray.toString()");
        return jSONArray2;
    }

    /* renamed from: b */
    public final String mo83811b(String str, int i, long j) {
        C87412m.m108594g(str, "topic");
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            if (i == 2) {
                String str2 = (String) C112550d0.m153785U(str, new String[]{"·"}, false, 0, 6, (Object) null).get(0);
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("topic", str2);
            } else {
                jSONObject.put("topic", str);
            }
            jSONObject.put("type", i);
            jSONObject.put("count", j);
            jSONArray.put(jSONObject);
        } catch (Exception unused) {
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "reportArray.toString()");
        return jSONArray2;
    }

    /* renamed from: c */
    public final void mo83812c(Context context, C64770ve1 ve12, Long l, int i) {
        String str;
        C87412m.m108594g(context, "context");
        Intent intent = new Intent();
        boolean z = true;
        if (ve12 == null) {
            ve12 = new C64770ve1();
            ve12.f185875f = 1;
        }
        intent.putExtra("key_topic_type", 4);
        C64726td1 td12 = ve12.f185873d;
        String str2 = null;
        String str3 = td12 != null ? td12.f185536f : null;
        if (!(str3 == null || str3.length() == 0)) {
            C64726td1 td13 = ve12.f185873d;
            if (td13 != null) {
                str2 = td13.f185536f;
            }
            intent.putExtra("key_topic_title", str2);
        } else {
            FinderItem e = C65834e.f189316a.mo89871e(l != null ? l.longValue() : 0);
            if (e != null) {
                str2 = e.getNickName();
            }
            intent.putExtra("key_topic_title", MMApplicationContext.getContext().getString(C0966R.string.d_x, new Object[]{str2}));
        }
        String str4 = ve12.f185874e;
        if (!(str4 == null || str4.length() == 0)) {
            z = false;
        }
        if (z) {
            str = C61926c.m72691p(l != null ? l.longValue() : -1);
        } else {
            str = ve12.f185874e;
            if (str == null) {
                str = "";
            }
        }
        intent.putExtra("KEY_FOLLOW_ID", str);
        intent.putExtra("key_ref_object_id", l);
        intent.putExtra("KEY_TAB_TYPE", i);
        ((C58684b) C86312j.m106911c(C58684b.class)).F50(context, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        if (r5 < 0) goto L_0x0180;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<er1.C58773q5> mo83813d(java.lang.String r19, java.util.ArrayList<er1.C58775t.C58776a> r20, fy3.C32227p<? super java.lang.Integer, ? super java.lang.Integer, rx3.C13598b0> r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r21
            java.lang.String r2 = "curDesc"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "atStringInfoList"
            r3 = r20
            gy3.C87412m.m108594g(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r4 == 0) goto L_0x001c
            return r2
        L_0x001c:
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.text.SpannableString r4 = r4.mo107057T1(r5, r0)
            int r5 = r4.length()
            java.lang.Class<android.text.style.ImageSpan> r6 = android.text.style.ImageSpan.class
            r7 = 0
            java.lang.Object[] r5 = r4.getSpans(r7, r5, r6)
            android.text.style.ImageSpan[] r5 = (android.text.style.ImageSpan[]) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r8 = "smileySpanList"
            gy3.C87412m.m108593f(r5, r8)
            int r8 = r5.length
            r9 = 0
        L_0x0046:
            r10 = -1
            r11 = 1
            if (r9 >= r8) goto L_0x0088
            r12 = r5[r9]
            int r13 = r4.getSpanStart(r12)
            int r14 = r4.getSpanEnd(r12)
            int r12 = r4.getSpanFlags(r12)
            r15 = r12 & 18
            if (r15 == 0) goto L_0x005f
            int r14 = r14 - r13
            int r14 = r14 + r11
            goto L_0x0064
        L_0x005f:
            r11 = r12 & 17
            if (r11 == 0) goto L_0x0066
            int r14 = r14 - r13
        L_0x0064:
            r10 = r13
            goto L_0x0079
        L_0x0066:
            r11 = r12 & 34
            if (r11 == 0) goto L_0x006e
            int r10 = r13 + 1
            int r14 = r14 - r13
            goto L_0x0079
        L_0x006e:
            r11 = r12 & 33
            if (r11 == 0) goto L_0x0078
            int r11 = r13 + 1
            int r14 = r14 - r13
            int r14 = r14 + r10
            r10 = r11
            goto L_0x0079
        L_0x0078:
            r14 = 0
        L_0x0079:
            if (r10 < 0) goto L_0x0085
            if (r14 <= 0) goto L_0x0085
            er1.q3$a r11 = new er1.q3$a
            r11.<init>(r10, r14)
            r6.add(r11)
        L_0x0085:
            int r9 = r9 + 1
            goto L_0x0046
        L_0x0088:
            r4 = 0
            r5 = -1
        L_0x008a:
            int r8 = r19.length()
            if (r4 >= r8) goto L_0x01ed
            int r8 = r0.codePointAt(r4)
            int r8 = java.lang.Character.charCount(r8)
            java.util.Iterator r9 = r6.iterator()
        L_0x009c:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00af
            java.lang.Object r12 = r9.next()
            er1.q3$a r12 = (er1.C58771q3.C58772a) r12
            int r13 = r12.f168270a
            if (r4 != r13) goto L_0x009c
            int r8 = r12.f168271b
            goto L_0x009c
        L_0x00af:
            char r9 = r0.charAt(r4)
            int r12 = r19.length()
            r13 = 35
            if (r8 != r11) goto L_0x00c6
            if (r9 != r13) goto L_0x00bf
            r14 = 1
            goto L_0x00c0
        L_0x00bf:
            r14 = 0
        L_0x00c0:
            if (r14 == 0) goto L_0x00c6
            if (r5 >= 0) goto L_0x00c6
            goto L_0x0180
        L_0x00c6:
            java.lang.String r14 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r8 != r11) goto L_0x0184
            java.lang.Character r15 = java.lang.Character.valueOf(r9)
            if (r15 != 0) goto L_0x00d2
            goto L_0x00f5
        L_0x00d2:
            java.lang.String r15 = r15.toString()
            java.util.ArrayList<z04.k> r16 = f168269b
            java.util.Iterator r16 = r16.iterator()
        L_0x00dc:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x00f4
            java.lang.Object r17 = r16.next()
            r7 = r17
            z04.k r7 = (z04.C66723k) r7
            boolean r7 = r7.mo90759d(r15)
            if (r7 == 0) goto L_0x00f2
            r7 = 1
            goto L_0x00f5
        L_0x00f2:
            r7 = 0
            goto L_0x00dc
        L_0x00f4:
            r7 = 0
        L_0x00f5:
            if (r7 == 0) goto L_0x0184
            if (r5 < 0) goto L_0x0184
            int r7 = r4 - r5
            if (r7 <= r11) goto L_0x011e
            up1.f r7 = up1.C37521f.f99374d
            r7.getClass()
            pe1.c<java.lang.Integer> r7 = up1.C37521f.f99202J1
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r7 = r7 * 2
            int r12 = r5 + 1
            java.lang.String r12 = r0.substring(r12, r4)
            gy3.C87412m.m108593f(r12, r14)
            int r7 = com.tencent.p014mm.p136ui.tools.C45078p0.m49923b(r7, r12)
            goto L_0x011f
        L_0x011e:
            r7 = -1
        L_0x011f:
            if (r7 < 0) goto L_0x0179
            int r7 = r5 + 1
            java.util.Iterator r12 = r20.iterator()
        L_0x0127:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0140
            java.lang.Object r15 = r12.next()
            er1.t$a r15 = (er1.C58775t.C58776a) r15
            int r15 = r15.f168279a
            if (r7 > r15) goto L_0x013b
            if (r15 >= r4) goto L_0x013b
            r15 = 1
            goto L_0x013c
        L_0x013b:
            r15 = 0
        L_0x013c:
            if (r15 == 0) goto L_0x0127
            r12 = 1
            goto L_0x0141
        L_0x0140:
            r12 = 0
        L_0x0141:
            if (r12 != 0) goto L_0x0179
            er1.q5 r12 = new er1.q5
            int r15 = r4 - r7
            java.lang.String r10 = r0.substring(r7, r4)
            gy3.C87412m.m108593f(r10, r14)
            r12.<init>(r7, r15, r10)
            r2.add(r12)
            if (r1 == 0) goto L_0x0161
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r1.invoke(r5, r7)
        L_0x0161:
            int r5 = r2.size()
            up1.f r7 = up1.C37521f.f99374d
            r7.getClass()
            pe1.c<java.lang.Integer> r7 = up1.C37521f.f99554x1
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r5 < r7) goto L_0x0179
            return r2
        L_0x0179:
            if (r9 != r13) goto L_0x017d
            r5 = 1
            goto L_0x017e
        L_0x017d:
            r5 = 0
        L_0x017e:
            if (r5 == 0) goto L_0x0182
        L_0x0180:
            r5 = r4
            goto L_0x01e8
        L_0x0182:
            r5 = -1
            goto L_0x01e8
        L_0x0184:
            int r7 = r4 + r8
            if (r7 != r12) goto L_0x018a
            r9 = 1
            goto L_0x018b
        L_0x018a:
            r9 = 0
        L_0x018b:
            if (r9 == 0) goto L_0x01e8
            if (r5 < 0) goto L_0x01e8
            int r9 = r5 + 1
            java.util.Iterator r10 = r20.iterator()
        L_0x0195:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x01ae
            java.lang.Object r12 = r10.next()
            er1.t$a r12 = (er1.C58775t.C58776a) r12
            int r12 = r12.f168279a
            if (r9 > r12) goto L_0x01a9
            if (r12 >= r4) goto L_0x01a9
            r12 = 1
            goto L_0x01aa
        L_0x01a9:
            r12 = 0
        L_0x01aa:
            if (r12 == 0) goto L_0x0195
            r10 = 1
            goto L_0x01af
        L_0x01ae:
            r10 = 0
        L_0x01af:
            if (r10 != 0) goto L_0x01e8
            er1.q5 r10 = new er1.q5
            int r12 = r4 - r9
            int r12 = r12 + r8
            java.lang.String r13 = r0.substring(r9, r7)
            gy3.C87412m.m108593f(r13, r14)
            r10.<init>(r9, r12, r13)
            r2.add(r10)
            if (r1 == 0) goto L_0x01d0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.invoke(r9, r7)
        L_0x01d0:
            int r7 = r2.size()
            up1.f r9 = up1.C37521f.f99374d
            r9.getClass()
            pe1.c<java.lang.Integer> r9 = up1.C37521f.f99554x1
            java.lang.Object r9 = r9.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r7 < r9) goto L_0x01e8
            return r2
        L_0x01e8:
            int r4 = r4 + r8
            r7 = 0
            r10 = -1
            goto L_0x008a
        L_0x01ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58771q3.mo83813d(java.lang.String, java.util.ArrayList, fy3.p):java.util.List");
    }
}
