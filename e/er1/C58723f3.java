package er1;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p629ny.C76979h;
import rx3.C13598b0;
import te3.C50717oq2;
import te3.C51833wh0;

/* renamed from: er1.f3 */
public final class C58723f3 {

    /* renamed from: a */
    public static final C58723f3 f168122a = new C58723f3();

    /* renamed from: b */
    public static final String f168123b = ('<' + "finder" + '>');

    /* renamed from: c */
    public static final String f168124c = ("</" + "finder" + '>');

    /* renamed from: d */
    public static final String f168125d = ('<' + "style" + '>');

    /* renamed from: e */
    public static final String f168126e = ("</" + "style" + '>');

    /* renamed from: f */
    public static final String f168127f = ('<' + "at" + '>');

    /* renamed from: g */
    public static final String f168128g = ("</" + "at" + '>');

    /* renamed from: h */
    public static final String f168129h = "<![CDATA[%s]]>";

    /* renamed from: i */
    public static final String f168130i = ('<' + "valuecount" + ">%d</" + "valuecount" + '>');

    /* renamed from: j */
    public static final String f168131j;

    /* renamed from: k */
    public static final String f168132k = ("</" + "value" + "%d>");

    /* renamed from: l */
    public static final String f168133l = ('<' + "topic" + ">%s</" + "topic" + '>');

    /* renamed from: m */
    public static final String f168134m = ('<' + ProviderConstants.API_COLNAME_FEATURE_VERSION + ">%d</" + ProviderConstants.API_COLNAME_FEATURE_VERSION + '>');

    /* renamed from: n */
    public static final int f168135n = MMApplicationContext.getColor(C0966R.color.f3585yj);

    /* renamed from: er1.f3$a */
    public static final class C58724a {

        /* renamed from: b */
        public static final ThreadLocal<XmlPullParser> f168136b = new ThreadLocal<>();

        /* renamed from: a */
        public C58726c f168137a;

        /* renamed from: a */
        public final void mo83642a(XmlPullParser xmlPullParser, StringBuilder sb, ArrayList<C50717oq2> arrayList) {
            String name = xmlPullParser.getName();
            C58726c cVar = this.f168137a;
            if (cVar != null && cVar.f168140b != null) {
                if (!C87412m.m108589b(name, cVar.f168139a)) {
                    sb.append(cVar.f168140b);
                } else if (C87412m.m108589b(cVar.f168139a, "_finder_keyword_")) {
                    C51833wh0 wh02 = cVar.f168141c;
                    String str = cVar.f168140b;
                    if (!(wh02 == null || str == null)) {
                        if (str.length() > 0) {
                            C50717oq2 oq22 = new C50717oq2();
                            oq22.f139314d = sb.length();
                            oq22.f139315e = str.length();
                            oq22.f139316f = wh02;
                            sb.append(cVar.f168140b);
                            sb.append("#");
                            arrayList.add(oq22);
                        }
                    }
                }
                this.f168137a = null;
            }
        }

        /* renamed from: b */
        public final void mo83643b(XmlPullParser xmlPullParser, StringBuilder sb) {
            String name = xmlPullParser.getName();
            C58726c cVar = this.f168137a;
            if (!(name == null || name.length() == 0)) {
                if ((cVar != null ? cVar.f168140b : null) != null) {
                    sb.append(cVar.f168140b);
                    this.f168137a = null;
                }
                if (C87412m.m108589b(name, "_finder_keyword_")) {
                    int attributeCount = xmlPullParser.getAttributeCount();
                    Long l = null;
                    for (int i = 0; i < attributeCount; i++) {
                        if (C87412m.m108589b(xmlPullParser.getAttributeName(i), "keyword_id")) {
                            String attributeValue = xmlPullParser.getAttributeValue(i);
                            try {
                                C87412m.m108593f(attributeValue, "value");
                                l = Long.valueOf(Long.parseLong(attributeValue));
                            } catch (NumberFormatException unused) {
                                Log.m105920e("FinderCommentSearchParser", "NumberFormatException: input = " + attributeValue);
                            }
                        }
                    }
                    if (l != null) {
                        this.f168137a = new C58725b("_finder_keyword_", (String) null, l.longValue());
                        return;
                    }
                    return;
                }
                this.f168137a = null;
            }
        }

        /* renamed from: c */
        public final void mo83644c(XmlPullParser xmlPullParser, StringBuilder sb, LinkedList<C51833wh0> linkedList) {
            T t;
            boolean z;
            String text = xmlPullParser.getText();
            C58726c cVar = this.f168137a;
            if (cVar == null) {
                sb.append(text);
            } else if (C87412m.m108589b(cVar.f168139a, "_finder_keyword_")) {
                C58725b bVar = (C58725b) cVar;
                long j = bVar.f168138d;
                C87412m.m108593f(text, MimeTypes.BASE_TYPE_TEXT);
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    C51833wh0 wh02 = (C51833wh0) t;
                    if (wh02.f144049d != j || !C87412m.m108589b(wh02.f144050e, text)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C51833wh0 wh03 = (C51833wh0) t;
                if (wh03 != null) {
                    bVar.f168140b = text;
                    bVar.f168141c = wh03;
                    return;
                }
                sb.append(text);
                this.f168137a = null;
            } else {
                sb.append(text);
                this.f168137a = null;
            }
        }
    }

    /* renamed from: er1.f3$b */
    public static final class C58725b extends C58726c {

        /* renamed from: d */
        public long f168138d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58725b(String str, String str2, long j) {
            super(str, str2);
            C87412m.m108594g(str, "tag");
            this.f168138d = j;
        }
    }

    /* renamed from: er1.f3$c */
    public static abstract class C58726c {

        /* renamed from: a */
        public final String f168139a;

        /* renamed from: b */
        public String f168140b;

        /* renamed from: c */
        public C51833wh0 f168141c;

        public C58726c(String str, String str2) {
            C87412m.m108594g(str, "tag");
            this.f168139a = str;
            this.f168140b = str2;
        }
    }

    /* renamed from: er1.f3$d */
    public static final class C58727d extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<String, C7840n, C13598b0> f168142d;

        /* renamed from: e */
        public final /* synthetic */ long f168143e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58727d(C32227p<? super String, ? super C7840n, C13598b0> pVar, long j) {
            super(1);
            this.f168142d = pVar;
            this.f168143e = j;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "topic");
            this.f168142d.invoke(str, new C7840n(this.f168143e, 0, (WeakReference) null, (Boolean) null, 14, (C8480h) null));
            return C13598b0.f38549a;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        sb.append("value");
        sb.append("%d>");
        f168131j = sb.toString();
    }

    /* renamed from: a */
    public final void mo83639a(StringBuilder sb, String str, int i) {
        String format = String.format(f168131j, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        sb.append(format);
        String format2 = String.format(f168129h, Arrays.copyOf(new Object[]{str}, 1));
        C87412m.m108593f(format2, "format(format, *args)");
        sb.append(format2);
        String format3 = String.format(f168132k, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C87412m.m108593f(format3, "format(format, *args)");
        sb.append(format3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: er1.q5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo83640b(java.lang.String r21, java.util.HashMap<java.lang.String, te3.C64589nq2> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "curDesc"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "atContactMap"
            gy3.C87412m.m108594g(r2, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0019
            return r4
        L_0x0019:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            up1.f r7 = up1.C37521f.f99374d
            boolean r8 = r7.mo61175c()
            r9 = 0
            if (r8 == 0) goto L_0x0039
            er1.t r6 = er1.C58775t.f168276a
            rx3.l r2 = r6.mo83825f(r1, r2, r9)
            B r6 = r2.f38556e
        L_0x0039:
            boolean r2 = r7.mo61158L()
            if (r2 == 0) goto L_0x0048
            er1.q3 r2 = er1.C58771q3.f168268a
            r5 = r6
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.List r5 = r2.mo83813d(r1, r5, r9)
        L_0x0048:
            java.lang.String r2 = f168123b
            r3.append(r2)
            boolean r2 = r5.isEmpty()
            java.lang.String r7 = "Finder.FinderStyleUtil"
            java.lang.String r8 = "format(format, *args)"
            r10 = 0
            r11 = 1
            if (r2 == 0) goto L_0x0081
            r2 = r6
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0081
            java.lang.String r2 = f168130i
            java.lang.Object[] r4 = new java.lang.Object[r11]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r4[r10] = r5
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r11)
            java.lang.String r2 = java.lang.String.format(r2, r4)
            gy3.C87412m.m108593f(r2, r8)
            r3.append(r2)
            r0.mo83639a(r3, r1, r10)
            r2 = 1
            r6 = 0
            goto L_0x028d
        L_0x0081:
            r2 = 0
            r12 = 0
            r13 = 0
        L_0x0084:
            int r14 = r21.length()
            java.lang.String r15 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r2 >= r14) goto L_0x022f
            boolean r14 = r5.isEmpty()
            java.lang.String r9 = ", startIndex:"
            java.lang.String r10 = "topicStart:"
            if (r14 != 0) goto L_0x0173
            int r14 = r5.size()
            r11 = 0
        L_0x009d:
            if (r11 >= r14) goto L_0x00be
            java.lang.Object r17 = r5.get(r11)
            r18 = r14
            r14 = r17
            er1.q5 r14 = (er1.C58773q5) r14
            r17 = r4
            int r4 = r14.f168272a
            r16 = 1
            int r4 = r4 + -1
            if (r4 != r2) goto L_0x00b4
            goto L_0x00c1
        L_0x00b4:
            if (r4 <= r2) goto L_0x00b7
            goto L_0x00c0
        L_0x00b7:
            int r11 = r11 + 1
            r4 = r17
            r14 = r18
            goto L_0x009d
        L_0x00be:
            r17 = r4
        L_0x00c0:
            r14 = 0
        L_0x00c1:
            if (r14 == 0) goto L_0x0175
            r5.remove(r14)
            int r4 = r14.f168272a
            r11 = 1
            int r4 = r4 - r11
            int r14 = r14.f168273b
            int r14 = r14 + r4
            int r14 = r14 + r11
            if (r4 < r12) goto L_0x015a
            if (r4 <= r12) goto L_0x00df
            java.lang.String r2 = r1.substring(r12, r4)
            gy3.C87412m.m108593f(r2, r15)
            int r9 = r13 + 1
            r0.mo83639a(r3, r2, r13)
            r13 = r9
        L_0x00df:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r1.substring(r4, r14)
            gy3.C87412m.m108593f(r4, r15)
            r2.append(r4)
            r4 = 35
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            int r4 = r13 + 1
            java.lang.String r9 = f168131j
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r15 = 0
            r11[r15] = r12
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r10)
            java.lang.String r9 = java.lang.String.format(r9, r11)
            gy3.C87412m.m108593f(r9, r8)
            r3.append(r9)
            java.lang.String r9 = f168133l
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r12 = f168129h
            r18 = r4
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r15] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r10)
            java.lang.String r2 = java.lang.String.format(r12, r2)
            gy3.C87412m.m108593f(r2, r8)
            r11[r15] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r11, r10)
            java.lang.String r2 = java.lang.String.format(r9, r2)
            gy3.C87412m.m108593f(r2, r8)
            r3.append(r2)
            java.lang.String r2 = f168132k
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r4[r15] = r9
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r10)
            java.lang.String r2 = java.lang.String.format(r2, r4)
            gy3.C87412m.m108593f(r2, r8)
            r3.append(r2)
            r2 = r14
            r12 = r2
            r4 = r17
            r13 = r18
            goto L_0x022a
        L_0x015a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r4)
            r11.append(r9)
            r11.append(r12)
            java.lang.String r4 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r4)
            goto L_0x0175
        L_0x0173:
            r17 = r4
        L_0x0175:
            r4 = r6
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r11 = r4.isEmpty()
            if (r11 != 0) goto L_0x021d
            int r11 = r4.size()
            r14 = 0
        L_0x0183:
            r18 = r5
            if (r14 >= r11) goto L_0x01a3
            java.lang.Object r5 = r4.get(r14)
            r19 = r6
            java.lang.String r6 = "atContactList[atIndex]"
            gy3.C87412m.m108593f(r5, r6)
            er1.t$a r5 = (er1.C58775t.C58776a) r5
            int r6 = r5.f168279a
            if (r6 != r2) goto L_0x0199
            goto L_0x01a6
        L_0x0199:
            if (r6 <= r2) goto L_0x019c
            goto L_0x01a5
        L_0x019c:
            int r14 = r14 + 1
            r5 = r18
            r6 = r19
            goto L_0x0183
        L_0x01a3:
            r19 = r6
        L_0x01a5:
            r5 = 0
        L_0x01a6:
            if (r5 == 0) goto L_0x0221
            r4.remove(r5)
            int r4 = r5.f168279a
            int r5 = r5.f168280b
            if (r4 < r12) goto L_0x0202
            if (r4 <= r12) goto L_0x01c0
            java.lang.String r2 = r1.substring(r12, r4)
            gy3.C87412m.m108593f(r2, r15)
            int r6 = r13 + 1
            r0.mo83639a(r3, r2, r13)
            r13 = r6
        L_0x01c0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r1.substring(r4, r5)
            gy3.C87412m.m108593f(r4, r15)
            r2.append(r4)
            r4 = 8197(0x2005, float:1.1486E-41)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            int r4 = r13 + 1
            r0.mo83639a(r3, r2, r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r6 = r17
            r2.append(r6)
            int r6 = r4 + -1
            r2.append(r6)
            r6 = 44
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r13 = r4
            r12 = r5
            r6 = r19
            r9 = 0
            r10 = 0
            r11 = 1
            r4 = r2
            r2 = r12
            r5 = r18
            goto L_0x0084
        L_0x0202:
            r6 = r17
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            r5.append(r4)
            r5.append(r9)
            r5.append(r12)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r4)
            goto L_0x0223
        L_0x021d:
            r18 = r5
            r19 = r6
        L_0x0221:
            r6 = r17
        L_0x0223:
            int r2 = r2 + 1
            r4 = r6
            r5 = r18
            r6 = r19
        L_0x022a:
            r9 = 0
            r10 = 0
            r11 = 1
            goto L_0x0084
        L_0x022f:
            r6 = r4
            int r2 = r21.length()
            if (r12 >= r2) goto L_0x0247
            int r2 = r21.length()
            java.lang.String r1 = r1.substring(r12, r2)
            gy3.C87412m.m108593f(r1, r15)
            int r2 = r13 + 1
            r0.mo83639a(r3, r1, r13)
            r13 = r2
        L_0x0247:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r1 == 0) goto L_0x024e
            goto L_0x0273
        L_0x024e:
            java.lang.String r1 = f168125d
            r3.append(r1)
            java.lang.String r1 = f168127f
            r3.append(r1)
            int r1 = r6.length()
            int r1 = r1 + -1
            r2 = 0
            java.lang.String r1 = r6.substring(r2, r1)
            gy3.C87412m.m108593f(r1, r15)
            r3.append(r1)
            java.lang.String r1 = f168128g
            r3.append(r1)
            java.lang.String r1 = f168126e
            r3.append(r1)
        L_0x0273:
            java.lang.String r1 = f168130i
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r6 = 0
            r4[r6] = r5
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r1 = java.lang.String.format(r1, r4)
            gy3.C87412m.m108593f(r1, r8)
            r3.append(r1)
        L_0x028d:
            java.lang.String r1 = f168134m
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4[r6] = r5
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            gy3.C87412m.m108593f(r1, r8)
            r3.append(r1)
            java.lang.String r1 = f168124c
            r3.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "xml:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "xml.toString()"
            gy3.C87412m.m108593f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58723f3.mo83640b(java.lang.String, java.util.HashMap):java.lang.String");
    }

    /* renamed from: c */
    public final SpannableString mo83641c(String str, SpannableString spannableString, List<C58773q5> list, C32227p<? super String, ? super C7840n, C13598b0> pVar, long j) {
        if (!Util.isNullOrNil(str)) {
            return spannableString;
        }
        C58771q3 q3Var = C58771q3.f168268a;
        String spannableString2 = spannableString.toString();
        C87412m.m108593f(spannableString2, "defaultDesc.toString()");
        for (C58773q5 q5Var : q3Var.mo83813d(spannableString2, new ArrayList(), (C32227p<? super Integer, ? super Integer, C13598b0>) null)) {
            int i = q5Var.f168272a - 1;
            if (i < 0) {
                i = 0;
            }
            list.add(new C58773q5(i, q5Var.f168273b + 1, '#' + q5Var.f168274c));
        }
        SpannableString valueOf = SpannableString.valueOf(new SpannableStringBuilder(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), spannableString.toString())));
        for (C58773q5 q5Var2 : list) {
            String substring = q5Var2.f168274c.substring(1);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            C4059g5 g5Var = new C4059g5(substring, f168135n, MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2), false, true, new C58727d(pVar, j));
            int i2 = q5Var2.f168272a;
            valueOf.setSpan(g5Var, i2, q5Var2.f168273b + i2, 17);
        }
        C87412m.m108593f(valueOf, "ret");
        return valueOf;
    }
}
