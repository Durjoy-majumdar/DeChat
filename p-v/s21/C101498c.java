package s21;

import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.spans.BoldSpan;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import java.util.SortedSet;
import java.util.Stack;
import u21.C101956h;
import w21.C102303a;
import w21.C102318o;

/* renamed from: s21.c */
public class C101498c {
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m133261a(android.text.Spanned r19) {
        /*
            r0 = r19
            w21.o r1 = w21.C102318o.NOTEUL
            w21.o r2 = w21.C102318o.NOTEOL
            if (r0 == 0) goto L_0x01e2
            java.lang.String r3 = r19.toString()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0014
            goto L_0x01e2
        L_0x0014:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            w21.o r4 = w21.C102318o.NONE
            w21.o r5 = w21.C102318o.NOTETODO
            u21.i r6 = new u21.i
            r6.<init>(r0)
            java.util.ArrayList<w21.l> r6 = r6.f300159e
            java.util.Stack r7 = new java.util.Stack
            r7.<init>()
            int r8 = r6.size()
            r10 = 0
        L_0x002e:
            if (r10 >= r8) goto L_0x01d3
            java.lang.Object r11 = r6.get(r10)
            w21.l r11 = (w21.C102314l) r11
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            int r13 = r11.f300151d
            int r14 = r11.f300152e
            java.lang.Class<android.text.style.ParagraphStyle> r15 = android.text.style.ParagraphStyle.class
            java.lang.Object[] r13 = r0.getSpans(r13, r14, r15)
            android.text.style.ParagraphStyle[] r13 = (android.text.style.ParagraphStyle[]) r13
            int r14 = r13.length
            r15 = 0
        L_0x0049:
            r16 = 0
            if (r15 >= r14) goto L_0x0078
            r9 = r13[r15]
            r17 = r4
            boolean r4 = r9 instanceof w21.C102306d
            if (r4 == 0) goto L_0x0057
            r4 = r1
            goto L_0x0065
        L_0x0057:
            boolean r4 = r9 instanceof w21.C102313k
            if (r4 == 0) goto L_0x005d
            r4 = r2
            goto L_0x0065
        L_0x005d:
            boolean r4 = r9 instanceof w21.C102322s
            if (r4 == 0) goto L_0x0063
            r4 = r5
            goto L_0x0065
        L_0x0063:
            r4 = r16
        L_0x0065:
            r18 = r5
            if (r4 == 0) goto L_0x0071
            w21.p r5 = new w21.p
            r5.<init>(r4, r9)
            r12.add(r5)
        L_0x0071:
            int r15 = r15 + 1
            r4 = r17
            r5 = r18
            goto L_0x0049
        L_0x0078:
            r17 = r4
            r18 = r5
            java.util.Iterator r4 = r12.iterator()
        L_0x0080:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0093
            java.lang.Object r5 = r4.next()
            w21.p r5 = (w21.C102319p) r5
            w21.o r5 = r5.f301349d
            boolean r9 = r5.f301344f
            if (r9 == 0) goto L_0x0080
            goto L_0x0095
        L_0x0093:
            r5 = r16
        L_0x0095:
            java.util.Iterator r4 = r12.iterator()
            r9 = r17
            r12 = 0
        L_0x009c:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0126
            java.lang.Object r13 = r4.next()
            w21.p r13 = (w21.C102319p) r13
            w21.o r15 = r13.f301349d
            r15.getClass()
            if (r15 != r1) goto L_0x00b1
            r15 = 1
            goto L_0x00b2
        L_0x00b1:
            r15 = 0
        L_0x00b2:
            if (r15 != 0) goto L_0x00cb
            w21.o r15 = r13.f301349d
            r15.getClass()
            if (r15 != r2) goto L_0x00bd
            r15 = 1
            goto L_0x00be
        L_0x00bd:
            r15 = 0
        L_0x00be:
            if (r15 != 0) goto L_0x00cb
            w21.o r15 = r13.f301349d
            boolean r15 = r15.mo141868a()
            if (r15 == 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r15 = 0
            goto L_0x00cc
        L_0x00cb:
            r15 = 1
        L_0x00cc:
            int r12 = r12 + r15
            w21.o r15 = r13.f301349d
            r15.getClass()
            if (r15 != r1) goto L_0x00d7
            r16 = 1
            goto L_0x00d9
        L_0x00d7:
            r16 = 0
        L_0x00d9:
            if (r16 == 0) goto L_0x00e2
            android.text.style.ParagraphStyle r13 = r13.f301350e
            w21.d r13 = (w21.C102306d) r13
            boolean r13 = r13.f301323e
            goto L_0x0105
        L_0x00e2:
            w21.o r14 = r13.f301349d
            r14.getClass()
            if (r14 != r2) goto L_0x00eb
            r14 = 1
            goto L_0x00ec
        L_0x00eb:
            r14 = 0
        L_0x00ec:
            if (r14 == 0) goto L_0x00f5
            android.text.style.ParagraphStyle r13 = r13.f301350e
            w21.k r13 = (w21.C102313k) r13
            boolean r13 = r13.f301329f
            goto L_0x0105
        L_0x00f5:
            w21.o r14 = r13.f301349d
            boolean r14 = r14.mo141868a()
            if (r14 == 0) goto L_0x0104
            android.text.style.ParagraphStyle r13 = r13.f301350e
            w21.s r13 = (w21.C102322s) r13
            boolean r13 = r13.f301359h
            goto L_0x0105
        L_0x0104:
            r13 = 1
        L_0x0105:
            if (r13 == 0) goto L_0x010a
            r9 = r17
            goto L_0x009c
        L_0x010a:
            if (r15 != r1) goto L_0x010e
            r13 = 1
            goto L_0x010f
        L_0x010e:
            r13 = 0
        L_0x010f:
            if (r13 == 0) goto L_0x0113
            r9 = r1
            goto L_0x009c
        L_0x0113:
            if (r15 != r2) goto L_0x0117
            r14 = 1
            goto L_0x0118
        L_0x0117:
            r14 = 0
        L_0x0118:
            if (r14 == 0) goto L_0x011c
            r9 = r2
            goto L_0x009c
        L_0x011c:
            boolean r13 = r15.mo141868a()
            if (r13 == 0) goto L_0x009c
            r9 = r18
            goto L_0x009c
        L_0x0126:
            w21.a r4 = new w21.a
            r13 = 0
            r4.<init>(r9, r12, r13)
            m133264d(r7, r3, r4)
            boolean r4 = r9.mo141868a()
            if (r4 == 0) goto L_0x018d
            int r4 = r11.f300151d
            int r12 = r11.f300152e
            java.lang.Class<w21.s> r14 = w21.C102322s.class
            java.lang.Object[] r4 = r0.getSpans(r4, r12, r14)
            w21.s[] r4 = (w21.C102322s[]) r4
            int r12 = r4.length
            if (r12 <= 0) goto L_0x018d
            r4 = r4[r13]
            boolean r4 = r4.f301360i
            r9.f301348j = r4
            java.lang.String r4 = r9.f301345g
            java.lang.String r12 = "\""
            int r4 = r4.indexOf(r12)
            r14 = 1
            int r4 = r4 + r14
            java.lang.String r14 = r9.f301345g
            int r12 = r14.lastIndexOf(r12)
            if (r4 >= r12) goto L_0x018d
            java.lang.String r14 = r9.f301345g
            java.lang.String r4 = r14.substring(r4, r12)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r12 != 0) goto L_0x018d
            java.lang.String r12 = r4.trim()
            boolean r14 = r9.f301348j
            java.lang.String r15 = "1"
            java.lang.String r16 = "0"
            if (r14 == 0) goto L_0x0176
            r14 = r15
            goto L_0x0178
        L_0x0176:
            r14 = r16
        L_0x0178:
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x018d
            java.lang.String r12 = r9.f301345g
            boolean r14 = r9.f301348j
            if (r14 == 0) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            r15 = r16
        L_0x0187:
            java.lang.String r4 = r12.replaceAll(r4, r15)
            r9.f301345g = r4
        L_0x018d:
            java.lang.String r4 = r9.f301345g
            r3.append(r4)
            if (r5 == 0) goto L_0x0199
            java.lang.String r4 = r5.f301342d
            r3.append(r4)
        L_0x0199:
            int r4 = r11.f300151d
            int r11 = r11.f300152e
            java.util.TreeSet r12 = new java.util.TreeSet
            s21.b r14 = new s21.b
            r14.<init>(r0)
            r12.<init>(r14)
            java.lang.Class<android.text.style.CharacterStyle> r14 = android.text.style.CharacterStyle.class
            java.lang.Object[] r14 = r0.getSpans(r4, r11, r14)
            android.text.style.CharacterStyle[] r14 = (android.text.style.CharacterStyle[]) r14
            java.util.List r14 = java.util.Arrays.asList(r14)
            r12.addAll(r14)
            m133262b(r0, r3, r4, r11, r12)
            if (r5 == 0) goto L_0x01c3
            m133266f(r3, r5)
            java.lang.String r4 = r5.f301343e
            r3.append(r4)
        L_0x01c3:
            m133266f(r3, r9)
            java.lang.String r4 = r9.f301346h
            r3.append(r4)
            int r10 = r10 + 1
            r4 = r17
            r5 = r18
            goto L_0x002e
        L_0x01d3:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x01dd
            m133265e(r7, r3)
            goto L_0x01d3
        L_0x01dd:
            java.lang.String r0 = r3.toString()
            return r0
        L_0x01e2:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s21.C101498c.m133261a(android.text.Spanned):java.lang.String");
    }

    /* renamed from: b */
    public static void m133262b(Spanned spanned, StringBuilder sb, int i, int i2, SortedSet<CharacterStyle> sortedSet) {
        while (i < i2) {
            CharacterStyle first = sortedSet.isEmpty() ? null : sortedSet.first();
            int i3 = Integer.MAX_VALUE;
            int spanStart = first == null ? Integer.MAX_VALUE : spanned.getSpanStart(first);
            if (first != null) {
                i3 = spanned.getSpanEnd(first);
            }
            if (i < spanStart) {
                m133263c(spanned, sb, i, Math.min(i2, spanStart));
                i = spanStart;
            } else {
                sortedSet.remove(first);
                boolean z = first instanceof BoldSpan;
                if (z) {
                    sb.append("<wx-b>");
                } else {
                    boolean z2 = first instanceof StyleSpan;
                    if (z2 && ((StyleSpan) first).getStyle() == 1) {
                        sb.append("<wx-b>");
                    } else if (z2 && ((StyleSpan) first).getStyle() == 2) {
                        sb.append("<i>");
                    } else if (first instanceof UnderlineSpan) {
                        sb.append("<u>");
                    } else if (first instanceof RelativeSizeSpan) {
                        sb.append("<wx-font style=\"font-size:");
                        sb.append((float) Math.round(((float) ((int) (((RelativeSizeSpan) first).getSizeChange() * C101956h.f300156d))) / C101956h.m134204a()));
                        sb.append("px\">");
                    } else if (first instanceof AbsoluteSizeSpan) {
                        sb.append("<wx-font style=\"font-size:");
                        sb.append(Math.round(((float) ((AbsoluteSizeSpan) first).getSize()) / C101956h.m134204a()));
                        sb.append("px\">");
                    } else if (first instanceof ForegroundColorSpan) {
                        sb.append("<wx-font style=\"color:#");
                        String hexString = Integer.toHexString(((ForegroundColorSpan) first).getForegroundColor() + TPMediaCodecProfileLevel.HEVCMainTierLevel62);
                        while (hexString.length() < 6) {
                            hexString = "0" + hexString;
                        }
                        sb.append(hexString);
                        sb.append("\">");
                    } else if (first instanceof BackgroundColorSpan) {
                        sb.append("<wx-font style=\"background-color:#");
                        String hexString2 = Integer.toHexString(((BackgroundColorSpan) first).getBackgroundColor() + TPMediaCodecProfileLevel.HEVCMainTierLevel62);
                        while (hexString2.length() < 6) {
                            hexString2 = "0" + hexString2;
                        }
                        sb.append(hexString2);
                        sb.append("\">");
                    }
                }
                m133262b(spanned, sb, Math.max(spanStart, i), Math.min(i3, i2), sortedSet);
                if (first instanceof ForegroundColorSpan) {
                    sb.append("</wx-font>");
                } else if (first instanceof BackgroundColorSpan) {
                    sb.append("</wx-font>");
                } else if (first instanceof AbsoluteSizeSpan) {
                    sb.append("</wx-font>");
                } else if (first instanceof UnderlineSpan) {
                    sb.append("</u>");
                } else if (z) {
                    sb.append("</wx-b>");
                } else {
                    boolean z3 = first instanceof StyleSpan;
                    if (z3 && ((StyleSpan) first).getStyle() == 2) {
                        sb.append("</i>");
                    } else if (z3 && ((StyleSpan) first).getStyle() == 1) {
                        sb.append("</wx-b>");
                    } else if (first instanceof RelativeSizeSpan) {
                        sb.append("</wx-font>");
                    }
                }
                i = i3;
            }
        }
    }

    /* renamed from: c */
    public static void m133263c(CharSequence charSequence, StringBuilder sb, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt == 10) {
                sb.append("<br/>");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else if (charAt == ' ') {
                while (true) {
                    int i3 = i + 1;
                    if (i3 >= i2 || charSequence.charAt(i3) != ' ') {
                        sb.append(' ');
                    } else {
                        sb.append("&nbsp;");
                        i = i3;
                    }
                }
                sb.append(' ');
            } else if (charAt < ' ') {
                sb.append("&#" + charAt + ";");
            } else {
                sb.append(charAt);
            }
            i++;
        }
    }

    /* renamed from: d */
    public static void m133264d(Stack<C102303a> stack, StringBuilder sb, C102303a aVar) {
        int i;
        C102318o oVar = C102318o.NONE;
        int i2 = 0;
        if (!stack.isEmpty()) {
            C102303a peek = stack.peek();
            i = peek.f301318b;
            oVar = peek.f301317a;
        } else {
            i = 0;
        }
        int i3 = aVar.f301318b;
        if (i3 > i) {
            int i4 = i3 - i;
            aVar.f301319c = i4;
            String str = aVar.f301317a.f301342d;
            while (i2 < i4) {
                sb.append(str);
                i2++;
            }
            stack.push(aVar);
        } else if (i3 < i) {
            m133265e(stack, sb);
            m133264d(stack, sb, aVar);
        } else if (aVar.f301317a != oVar) {
            int e = m133265e(stack, sb);
            aVar.f301319c = e;
            String str2 = aVar.f301317a.f301342d;
            while (i2 < e) {
                sb.append(str2);
                i2++;
            }
            stack.push(aVar);
        }
    }

    /* renamed from: e */
    public static int m133265e(Stack<C102303a> stack, StringBuilder sb) {
        if (stack.isEmpty()) {
            return 0;
        }
        C102303a pop = stack.pop();
        String str = pop.f301317a.f301343e;
        int i = pop.f301319c;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str);
        }
        return pop.f301319c;
    }

    /* renamed from: f */
    public static void m133266f(StringBuilder sb, C102318o oVar) {
        if (oVar.f301347i && sb.length() >= 5) {
            int length = sb.length() - 5;
            int length2 = sb.length();
            if (sb.subSequence(length, length2).equals("<br/>")) {
                sb.delete(length, length2);
            }
        }
    }
}
