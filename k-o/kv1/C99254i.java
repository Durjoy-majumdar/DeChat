package kv1;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lv1.C99667f;
import lv1.C99670g;
import lv1.C99672i;
import p255vr.C65873e;

/* renamed from: kv1.i */
public class C99254i {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        r2 = 0;
        r4 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m129304a(java.util.List<java.util.List<java.lang.String>> r7, java.util.List<java.lang.String> r8) {
        /*
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0003:
            int r3 = r7.size()
            int r4 = r8.size()
            int r3 = r3 - r4
            r4 = 1
            int r3 = r3 + r4
            if (r1 >= r3) goto L_0x0058
        L_0x0010:
            int r3 = r8.size()
            if (r2 >= r3) goto L_0x0052
            int r3 = r1 + r2
            java.lang.Object r3 = r7.get(r3)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r5 = r8.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r3.contains(r5)
            if (r6 == 0) goto L_0x002b
            goto L_0x004d
        L_0x002b:
            int r6 = r8.size()
            int r6 = r6 - r4
            if (r2 != r6) goto L_0x0050
            java.util.Iterator r3 = r3.iterator()
        L_0x0036:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x004a
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r6.startsWith(r5)
            if (r6 == 0) goto L_0x0036
            r3 = 1
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x0050
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0050:
            r2 = 0
            r4 = 0
        L_0x0052:
            if (r4 == 0) goto L_0x0055
            goto L_0x0059
        L_0x0055:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x0058:
            r1 = -1
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kv1.C99254i.m129304a(java.util.List, java.util.List):int");
    }

    /* renamed from: b */
    public static List<List<String>> m129305b(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            ArrayList arrayList2 = new ArrayList(2);
            if (C99255j.m129317a(charAt)) {
                String[] strArr = C99255j.f291049l.get(String.valueOf(charAt));
                if (strArr == null || strArr.length <= 0 || strArr[0].length() <= 0) {
                    arrayList.add(arrayList2);
                } else {
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        String str2 = strArr[i2];
                        if (z) {
                            str2 = str2.substring(0, 1);
                        }
                        if (!arrayList2.contains(str2)) {
                            arrayList2.add(str2);
                        }
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    @Deprecated
    /* renamed from: c */
    public static Spannable m129306c(Context context, CharSequence charSequence, String str) {
        C99670g e = m129308e(C99667f.m130088a(charSequence, str, false, false));
        CharSequence charSequence2 = e.f292107a;
        return charSequence2 instanceof Spannable ? (Spannable) charSequence2 : new SpannableString(e.f292107a);
    }

    /* renamed from: d */
    public static final C99670g m129307d(String str, String str2, C99667f fVar) {
        C99670g e = m129308e(fVar);
        e.f292107a = TextUtils.concat(new CharSequence[]{str, e.f292107a, str2});
        return e;
    }

    /* renamed from: e */
    public static final C99670g m129308e(C99667f fVar) {
        C99670g gVar = new C99670g();
        SpannableString spannableString = new SpannableString(TextUtils.concat(new CharSequence[]{fVar.f292096i, fVar.f292088a, fVar.f292097j}));
        gVar.f292108b = -1;
        gVar.f292107a = spannableString;
        if (!(!Util.isNullOrNil(fVar.f292088a) && fVar.f292089b != null)) {
            return gVar;
        }
        String la02 = ((C65873e) C86312j.m106911c(C65873e.class)).la0(fVar.f292088a.toString());
        List arrayList = new ArrayList();
        if (fVar.f292090c) {
            arrayList = m129305b(la02, fVar.f292091d);
        }
        if (((ArrayList) fVar.f292089b.f292124e).size() == 1 || m129309f(spannableString, fVar)) {
            C99667f.C99669b bVar = new C99667f.C99669b();
            if (((ArrayList) fVar.f292089b.f292124e).size() == 1) {
                bVar.f292104d = (C99672i.C99676d) ((ArrayList) fVar.f292089b.f292124e).get(0);
                if (fVar.f292090c) {
                    m129313j(arrayList, bVar, fVar);
                } else {
                    m129312i(la02, bVar, fVar);
                }
                if (!bVar.mo139041a()) {
                    return gVar;
                }
                try {
                    return m129314k(spannableString, bVar, fVar);
                } catch (Exception unused) {
                    gVar.f292107a = spannableString;
                    return gVar;
                }
            } else {
                bVar.f292104d = (C99672i.C99676d) ((ArrayList) fVar.f292089b.f292124e).get(0);
                if (fVar.f292090c) {
                    m129313j(arrayList, bVar, fVar);
                } else {
                    m129312i(la02, bVar, fVar);
                }
                if (bVar.mo139041a()) {
                    try {
                        gVar = m129314k(spannableString, bVar, fVar);
                    } catch (Exception unused2) {
                        gVar.f292107a = spannableString;
                    }
                }
                String charSequence = gVar.f292107a.toString();
                List arrayList2 = new ArrayList();
                if (fVar.f292090c) {
                    arrayList2 = m129305b(charSequence, fVar.f292091d);
                }
                for (int i = 1; i < ((ArrayList) fVar.f292089b.f292124e).size(); i++) {
                    bVar.f292104d = (C99672i.C99676d) ((ArrayList) fVar.f292089b.f292124e).get(i);
                    if (fVar.f292090c) {
                        m129313j(arrayList2, bVar, fVar);
                    } else {
                        m129312i(charSequence, bVar, fVar);
                    }
                    if (bVar.mo139041a()) {
                        try {
                            gVar = m129314k((Spannable) gVar.f292107a, bVar, fVar);
                        } catch (Exception unused3) {
                            gVar.f292107a = spannableString;
                        }
                    }
                }
                return gVar;
            }
        } else {
            C99667f.C99669b bVar2 = new C99667f.C99669b();
            bVar2.f292104d = new C99672i.C99676d();
            C99672i.C99675c cVar = new C99672i.C99675c();
            cVar.f292125a = C99672i.C99677e.OTHER;
            cVar.f292126b = fVar.f292089b.f292121b;
            ((ArrayList) bVar2.f292104d.f292128a).add(cVar);
            if (fVar.f292090c) {
                m129313j(arrayList, bVar2, fVar);
            } else {
                m129312i(la02, bVar2, fVar);
            }
            if (bVar2.mo139041a()) {
                try {
                    return m129314k(spannableString, bVar2, fVar);
                } catch (Exception unused4) {
                    gVar.f292107a = spannableString;
                    return gVar;
                }
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((ArrayList) fVar.f292089b.f292124e).iterator();
                while (it.hasNext()) {
                    C99667f.C99669b bVar3 = new C99667f.C99669b();
                    bVar3.f292104d = (C99672i.C99676d) it.next();
                    arrayList3.add(bVar3);
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    C99667f.C99669b bVar4 = (C99667f.C99669b) it4.next();
                    if (fVar.f292090c) {
                        m129313j(arrayList, bVar4, fVar);
                    } else {
                        m129312i(la02, bVar4, fVar);
                    }
                }
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    C99667f.C99669b bVar5 = (C99667f.C99669b) it5.next();
                    if (bVar5.mo139041a()) {
                        C99670g k = m129314k(spannableString, bVar5, fVar);
                        if (k.f292108b == 0) {
                            gVar = k;
                        }
                    }
                }
                return gVar;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r5.f292095h;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m129309f(android.text.Spannable r4, lv1.C99667f r5) {
        /*
            float r0 = r5.f292094g
            r1 = 0
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0024
            android.text.TextPaint r2 = r5.f292095h
            if (r2 == 0) goto L_0x0024
            float r2 = r2.getTextSize()
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            float r0 = r0 - r2
            android.text.TextPaint r5 = r5.f292095h
            java.lang.String r4 = r4.toString()
            float r4 = r5.measureText(r4)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0024
            r1 = 1
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kv1.C99254i.m129309f(android.text.Spannable, lv1.f):boolean");
    }

    /* renamed from: g */
    public static CharSequence m129310g(String str) {
        return Util.isNullOrNil(str) ? "" : Html.fromHtml(str.replaceAll("<em class=\"highlight\">", "<font color=\"#06AD56\">").replaceAll("</em>", "</font>"));
    }

    /* renamed from: h */
    public static C99670g m129311h(Spannable spannable, C99667f.C99669b bVar, C99667f fVar) {
        C99670g gVar = new C99670g();
        C99667f.C99668a aVar = fVar.f292092e;
        if (aVar == C99667f.C99668a.CustomTag) {
            String obj = spannable.toString();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(obj.substring(0, bVar.f292105e));
            stringBuffer.append(fVar.f292098k);
            stringBuffer.append(obj.substring(bVar.f292105e, bVar.f292106f));
            stringBuffer.append(fVar.f292099l);
            if (bVar.f292106f < obj.length()) {
                stringBuffer.append(obj.substring(bVar.f292106f, obj.length()));
            }
            gVar.f292107a = stringBuffer.toString();
            gVar.f292108b = 0;
        } else {
            try {
                spannable.setSpan(aVar == C99667f.C99668a.Background ? new BackgroundColorSpan(fVar.f292093f) : new ForegroundColorSpan(fVar.f292093f), bVar.f292105e, bVar.f292106f, 33);
                gVar.f292107a = spannable;
                gVar.f292108b = 0;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FTS.FTSUIHLLogic", e, "setSpan %s", bVar.toString());
                gVar.f292107a = spannable;
                gVar.f292108b = -1;
            }
        }
        return gVar;
    }

    /* renamed from: i */
    public static void m129312i(String str, C99667f.C99669b bVar, C99667f fVar) {
        String str2;
        CharSequence charSequence;
        C99672i.C99676d dVar = bVar.f292104d;
        if (dVar != null && ((ArrayList) dVar.f292128a).size() > 0) {
            Iterator it = ((ArrayList) bVar.f292104d.f292128a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C99672i.C99675c cVar = (C99672i.C99675c) it.next();
                if (cVar.f292125a == C99672i.C99677e.OTHER) {
                    str2 = cVar.f292126b;
                    break;
                }
            }
        }
        str2 = null;
        if (!Util.isNullOrNil(str2)) {
            int indexOf = str.indexOf(str2);
            if (indexOf >= 0) {
                bVar.f292105e = indexOf;
                bVar.f292106f = indexOf + str2.length();
            }
            if (bVar.mo139041a() && (charSequence = fVar.f292096i) != null) {
                bVar.f292105e += charSequence.length();
                bVar.f292106f += fVar.f292096i.length();
            }
        }
    }

    /* renamed from: j */
    public static void m129313j(List<List<String>> list, C99667f.C99669b bVar, C99667f fVar) {
        CharSequence charSequence;
        int a;
        if (!fVar.f292091d) {
            Iterator it = ((ArrayList) bVar.f292104d.f292128a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C99672i.C99675c cVar = (C99672i.C99675c) it.next();
                if (cVar.f292125a == C99672i.C99677e.FullPY && (a = m129304a(list, cVar.f292127c)) >= 0) {
                    bVar.f292105e = a;
                    bVar.f292106f = a + cVar.f292127c.size();
                    break;
                }
            }
        } else {
            C99672i.C99675c cVar2 = null;
            Iterator it4 = ((ArrayList) bVar.f292104d.f292128a).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C99672i.C99675c cVar3 = (C99672i.C99675c) it4.next();
                if (cVar3.f292125a == C99672i.C99677e.ShortPY) {
                    cVar2 = cVar3;
                    break;
                }
            }
            if (cVar2 != null) {
                int a2 = m129304a(list, cVar2.f292127c);
                if (a2 >= 0) {
                    bVar.f292105e = a2;
                    bVar.f292106f = a2 + cVar2.f292127c.size();
                }
            } else {
                return;
            }
        }
        if (bVar.mo139041a() && (charSequence = fVar.f292096i) != null) {
            bVar.f292105e += charSequence.length();
            bVar.f292106f += fVar.f292096i.length();
        }
    }

    /* renamed from: k */
    public static C99670g m129314k(Spannable spannable, C99667f.C99669b bVar, C99667f fVar) {
        SpannableString spannableString;
        Spannable spannable2 = spannable;
        C99667f.C99669b bVar2 = bVar;
        C99667f fVar2 = fVar;
        if (!m129309f(spannable2, fVar2)) {
            return m129311h(spannable, bVar, fVar);
        }
        C99670g gVar = new C99670g();
        float textSize = fVar2.f292094g - (fVar2.f292095h.getTextSize() * 2.0f);
        float measureText = fVar2.f292095h.measureText("…");
        float measureText2 = fVar2.f292095h.measureText(spannable2, 0, bVar2.f292105e);
        float measureText3 = fVar2.f292095h.measureText(spannable2, bVar2.f292105e, bVar2.f292106f);
        float measureText4 = fVar2.f292095h.measureText(spannable2, bVar2.f292106f, spannable.length());
        float f = measureText2 + measureText3;
        if (f + measureText4 < textSize) {
            return m129311h(spannable, bVar, fVar);
        }
        CharSequence subSequence = spannable2.subSequence(bVar2.f292105e, bVar2.f292106f);
        C99667f.C99668a aVar = fVar2.f292092e;
        if (aVar == C99667f.C99668a.CustomTag) {
            spannableString = new SpannableString(TextUtils.concat(new CharSequence[]{fVar2.f292098k, subSequence, fVar2.f292099l}));
        } else {
            Object backgroundColorSpan = aVar == C99667f.C99668a.Background ? new BackgroundColorSpan(fVar2.f292093f) : new ForegroundColorSpan(fVar2.f292093f);
            spannableString = new SpannableString(subSequence);
            try {
                spannableString.setSpan(backgroundColorSpan, 0, spannableString.length(), 33);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FTS.FTSUIHLLogic", e, "setSpan %s", bVar.toString());
                gVar.f292108b = -1;
                gVar.f292107a = spannable2;
                return gVar;
            }
        }
        if (f + measureText < textSize) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable2, 0, bVar2.f292105e);
            spannableStringBuilder.append(spannableString);
            spannableStringBuilder.append(TextUtils.ellipsize(spannable2.subSequence(bVar2.f292106f, spannable.length()), fVar2.f292095h, (textSize - measureText2) - measureText3, TextUtils.TruncateAt.END));
            gVar.f292107a = spannableStringBuilder;
        } else {
            float f2 = measureText + measureText3;
            if (f2 + measureText4 < textSize) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append(TextUtils.ellipsize(spannable2.subSequence(0, bVar2.f292105e), fVar2.f292095h, (textSize - measureText3) - measureText4, TextUtils.TruncateAt.START));
                spannableStringBuilder2.append(spannableString);
                spannableStringBuilder2.append(spannable2, bVar2.f292106f, spannable.length());
                gVar.f292107a = spannableStringBuilder2;
            } else if (f2 + measureText >= textSize) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                spannableStringBuilder3.append(TextUtils.ellipsize(spannableString, fVar2.f292095h, textSize, TextUtils.TruncateAt.END));
                gVar.f292107a = spannableStringBuilder3;
            } else {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                float f3 = (textSize - measureText3) / 2.0f;
                CharSequence subSequence2 = spannable2.subSequence(0, bVar2.f292105e);
                CharSequence subSequence3 = spannable2.subSequence(bVar2.f292106f, spannable.length());
                spannableStringBuilder4.append(TextUtils.ellipsize(subSequence2, fVar2.f292095h, f3, TextUtils.TruncateAt.START));
                spannableStringBuilder4.append(spannableString);
                spannableStringBuilder4.append(TextUtils.ellipsize(subSequence3, fVar2.f292095h, f3, TextUtils.TruncateAt.END));
                gVar.f292107a = spannableStringBuilder4;
            }
        }
        gVar.f292108b = 0;
        return gVar;
    }

    /* renamed from: l */
    public static final SpannableString m129315l(CharSequence charSequence, int i, int i2) {
        SpannableString spannableString = new SpannableString(charSequence);
        C99667f.C99669b bVar = new C99667f.C99669b();
        bVar.f292105e = i;
        bVar.f292106f = i2;
        m129314k(spannableString, bVar, new C99667f());
        return spannableString;
    }

    /* renamed from: m */
    public static final SpannableString m129316m(String str, String str2, CharSequence charSequence) {
        return m129315l(str + charSequence + str2, str.length(), str.length() + charSequence.length());
    }
}
