package v51;

import android.text.SpannableString;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import go3.C76003c;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import rx3.C13603j;
import sx3.C110821n;
import vl3.C102226d;

/* renamed from: v51.h */
public final class C78336h {

    /* renamed from: a */
    public final String f229543a;

    /* renamed from: b */
    public final ArrayList<C37669b> f229544b = new ArrayList<>();

    /* renamed from: v51.h$b */
    public static final class C37669b {

        /* renamed from: a */
        public final int f99843a;

        /* renamed from: b */
        public final int f99844b;

        /* renamed from: c */
        public final C37670c f99845c;

        /* renamed from: d */
        public final String f99846d;

        public C37669b(int i, int i2, C37670c cVar, String str) {
            C87412m.m108594g(cVar, "type");
            C87412m.m108594g(str, "content");
            this.f99843a = i;
            this.f99844b = i2;
            this.f99845c = cVar;
            this.f99846d = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37669b)) {
                return false;
            }
            C37669b bVar = (C37669b) obj;
            return this.f99843a == bVar.f99843a && this.f99844b == bVar.f99844b && this.f99845c == bVar.f99845c && C87412m.m108589b(this.f99846d, bVar.f99846d);
        }

        public int hashCode() {
            return (((((this.f99843a * 31) + this.f99844b) * 31) + this.f99845c.hashCode()) * 31) + this.f99846d.hashCode();
        }

        public String toString() {
            return "Clip(start=" + this.f99843a + ", end=" + this.f99844b + ", type=" + this.f99845c + ", content=" + this.f99846d + ')';
        }
    }

    /* renamed from: v51.h$c */
    public enum C37670c {
        EMOJI,
        WORD
    }

    /* renamed from: v51.h$a */
    public static final class C78337a<T> implements Comparator {

        /* renamed from: d */
        public final /* synthetic */ CharSequence f229545d;

        public C78337a(CharSequence charSequence) {
            this.f229545d = charSequence;
        }

        public int compare(Object obj, Object obj2) {
            return ((SpannableString) this.f229545d).getSpanStart((C76003c) obj) - ((SpannableString) this.f229545d).getSpanStart((C76003c) obj2);
        }
    }

    public C78336h(String str, int i) {
        C37670c cVar = C37670c.WORD;
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.ORIGIN);
        this.f229543a = str;
        CharSequence a = C102226d.m134696a(MMApplicationContext.getContext(), str);
        if (a instanceof SpannableString) {
            int i2 = 0;
            C76003c[] cVarArr = (C76003c[]) ((SpannableString) a).getSpans(0, a.length(), C76003c.class);
            C87412m.m108593f(cVarArr, "fixImageSpanList");
            C110821n.m150973t(cVarArr, new C78337a(a));
            int length = cVarArr.length;
            int i3 = 0;
            while (i2 < length) {
                C76003c cVar2 = cVarArr[i2];
                SpannableString spannableString = (SpannableString) a;
                int spanStart = spannableString.getSpanStart(cVar2);
                int spanEnd = spannableString.getSpanEnd(cVar2);
                if (i3 < spanStart) {
                    ArrayList<C37669b> arrayList = this.f229544b;
                    String substring = this.f229543a.substring(i3, spanStart);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(new C37669b(i3, spanStart, cVar, substring));
                }
                ArrayList<C37669b> arrayList2 = this.f229544b;
                C37670c cVar3 = C37670c.EMOJI;
                String substring2 = this.f229543a.substring(spanStart, spanEnd);
                C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList2.add(new C37669b(spanStart, spanEnd, cVar3, substring2));
                i2++;
                i3 = spanEnd;
            }
            if (i3 < this.f229543a.length()) {
                ArrayList<C37669b> arrayList3 = this.f229544b;
                int length2 = this.f229543a.length();
                String str2 = this.f229543a;
                String substring3 = str2.substring(i3, str2.length());
                C87412m.m108593f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList3.add(new C37669b(i3, length2, cVar, substring3));
            }
        }
    }

    /* renamed from: a */
    public final int mo108328a(C45078p0.C45079a aVar) {
        int i;
        C87412m.m108594g(aVar, "mode");
        int i2 = 0;
        for (C37669b bVar : this.f229544b) {
            int ordinal = bVar.f99845c.ordinal();
            if (ordinal == 0) {
                i = 2;
            } else if (ordinal == 1) {
                i = C45078p0.m49926e(bVar.f99846d, aVar);
            } else {
                throw new C13603j();
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: b */
    public final String mo108329b(int i, C45078p0.C45079a aVar) {
        int i2;
        C87412m.m108594g(aVar, "mode");
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<T> it = this.f229544b.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C37669b bVar = (C37669b) it.next();
            int ordinal = bVar.f99845c.ordinal();
            if (ordinal == 0) {
                i2 = 2;
            } else if (ordinal == 1) {
                i2 = C45078p0.m49926e(bVar.f99846d, aVar);
            } else {
                throw new C13603j();
            }
            int i4 = i2 + i3;
            if (i4 <= i) {
                stringBuffer.append(bVar.f99846d);
            } else if (i4 > i) {
                if (bVar.f99845c == C37670c.WORD && i3 < i) {
                    stringBuffer.append(C45078p0.m49929h(bVar.f99846d, i - i3));
                }
            }
            i3 = i4;
        }
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "outputBuffer.toString()");
        return stringBuffer2;
    }
}
