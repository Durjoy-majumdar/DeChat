package p402y7;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: y7.b */
public final class C23256b {

    /* renamed from: a */
    public final String f66826a;

    /* renamed from: b */
    public final String f66827b;

    /* renamed from: c */
    public final boolean f66828c;

    /* renamed from: d */
    public final long f66829d;

    /* renamed from: e */
    public final long f66830e;

    /* renamed from: f */
    public final C23258d f66831f;

    /* renamed from: g */
    public final String f66832g;

    /* renamed from: h */
    public final String[] f66833h;

    /* renamed from: i */
    public final HashMap<String, Integer> f66834i;

    /* renamed from: j */
    public final HashMap<String, Integer> f66835j;

    /* renamed from: k */
    public List<C23256b> f66836k;

    public C23256b(String str, String str2, long j, long j2, C23258d dVar, String[] strArr, String str3) {
        this.f66826a = str;
        this.f66827b = str2;
        this.f66831f = dVar;
        this.f66833h = strArr;
        this.f66828c = str2 != null;
        this.f66829d = j;
        this.f66830e = j2;
        str3.getClass();
        this.f66832g = str3;
        this.f66834i = new HashMap<>();
        this.f66835j = new HashMap<>();
    }

    /* renamed from: a */
    public static C23256b m27714a(String str) {
        return new C23256b((String) null, str.replaceAll(APLogFileUtil.SEPARATOR_LINE, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, (C23258d) null, (String[]) null, "");
    }

    /* renamed from: c */
    public static SpannableStringBuilder m27715c(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    /* renamed from: b */
    public final void mo36730b(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f66826a);
        if (z || equals) {
            long j = this.f66829d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f66830e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f66836k != null) {
            for (int i = 0; i < ((ArrayList) this.f66836k).size(); i++) {
                ((C23256b) ((ArrayList) this.f66836k).get(i)).mo36730b(treeSet, z || equals);
            }
        }
    }

    /* renamed from: d */
    public final void mo36731d(Map<String, C23258d> map, Map<String, SpannableStringBuilder> map2) {
        char c;
        for (Map.Entry next : this.f66835j.entrySet()) {
            String str = (String) next.getKey();
            int intValue = this.f66834i.containsKey(str) ? this.f66834i.get(str).intValue() : 0;
            SpannableStringBuilder spannableStringBuilder = map2.get(str);
            int intValue2 = ((Integer) next.getValue()).intValue();
            if (intValue != intValue2) {
                C23258d dVar = this.f66831f;
                String[] strArr = this.f66833h;
                if (dVar == null && strArr == null) {
                    dVar = null;
                } else if (dVar == null && strArr.length == 1) {
                    dVar = map.get(strArr[0]);
                } else if (dVar == null && strArr.length > 1) {
                    dVar = new C23258d();
                    for (String str2 : strArr) {
                        dVar.mo36733a(map.get(str2));
                    }
                } else if (dVar != null && strArr != null && strArr.length == 1) {
                    dVar.mo36733a(map.get(strArr[0]));
                } else if (!(dVar == null || strArr == null || strArr.length <= 1)) {
                    for (String str3 : strArr) {
                        dVar.mo36733a(map.get(str3));
                    }
                }
                if (dVar != null) {
                    int i = dVar.f66850h;
                    int i2 = -1;
                    if (i == -1 && dVar.f66851i == -1) {
                        c = 65535;
                    } else {
                        c = (i == 1 ? (char) 1 : 0) | (dVar.f66851i == 1 ? (char) 2 : 0);
                    }
                    if (c != 65535) {
                        int i3 = dVar.f66850h;
                        if (!(i3 == -1 && dVar.f66851i == -1)) {
                            i2 = (i3 == 1 ? 1 : 0) | (dVar.f66851i == 1 ? 2 : 0);
                        }
                        spannableStringBuilder.setSpan(new StyleSpan(i2), intValue, intValue2, 33);
                    }
                    if (dVar.f66848f == 1) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                    }
                    if (dVar.f66849g == 1) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                    }
                    if (dVar.f66845c) {
                        if (dVar.f66845c) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.f66844b), intValue, intValue2, 33);
                        } else {
                            throw new IllegalStateException("Font color has not been defined.");
                        }
                    }
                    if (dVar.f66847e) {
                        if (dVar.f66847e) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.f66846d), intValue, intValue2, 33);
                        } else {
                            throw new IllegalStateException("Background color has not been defined.");
                        }
                    }
                    if (dVar.f66843a != null) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(dVar.f66843a), intValue, intValue2, 33);
                    }
                    if (dVar.f66855m != null) {
                        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(dVar.f66855m), intValue, intValue2, 33);
                    }
                    int i4 = dVar.f66852j;
                    if (i4 == 1) {
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) dVar.f66853k, true), intValue, intValue2, 33);
                    } else if (i4 == 2) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.f66853k), intValue, intValue2, 33);
                    } else if (i4 == 3) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.f66853k / 100.0f), intValue, intValue2, 33);
                    }
                }
            }
            int i5 = 0;
            while (true) {
                List<C23256b> list = this.f66836k;
                if (i5 < (list == null ? 0 : ((ArrayList) list).size())) {
                    List<C23256b> list2 = this.f66836k;
                    if (list2 != null) {
                        ((C23256b) ((ArrayList) list2).get(i5)).mo36731d(map, map2);
                        i5++;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo36732e(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        int i;
        Map<String, SpannableStringBuilder> map2 = map;
        this.f66834i.clear();
        this.f66835j.clear();
        String str2 = this.f66832g;
        String str3 = "".equals(str2) ? str : str2;
        if (this.f66828c && z) {
            m27715c(str3, map2).append(this.f66827b);
        } else if ("br".equals(this.f66826a) && z) {
            m27715c(str3, map2).append(10);
        } else if (!"metadata".equals(this.f66826a)) {
            long j2 = this.f66829d;
            int i2 = (j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1));
            if ((i2 == 0 && this.f66830e == -9223372036854775807L) || (j2 <= j && this.f66830e == -9223372036854775807L) || ((i2 == 0 && j < this.f66830e) || (i <= 0 && j < this.f66830e))) {
                boolean equals = "p".equals(this.f66826a);
                for (Map.Entry next : map.entrySet()) {
                    this.f66834i.put(next.getKey(), Integer.valueOf(((SpannableStringBuilder) next.getValue()).length()));
                }
                int i3 = 0;
                while (true) {
                    List<C23256b> list = this.f66836k;
                    if (i3 < (list == null ? 0 : ((ArrayList) list).size())) {
                        List<C23256b> list2 = this.f66836k;
                        if (list2 != null) {
                            ((C23256b) ((ArrayList) list2).get(i3)).mo36732e(j, z || equals, str3, map);
                            i3++;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        if (equals) {
                            SpannableStringBuilder c = m27715c(str3, map2);
                            int length = c.length();
                            do {
                                length--;
                                if (length < 0 || c.charAt(length) != ' ') {
                                    if (length >= 0 && c.charAt(length) != 10) {
                                        c.append(10);
                                    }
                                }
                                length--;
                                break;
                            } while (c.charAt(length) != ' ');
                            c.append(10);
                        }
                        for (Map.Entry next2 : map.entrySet()) {
                            this.f66835j.put(next2.getKey(), Integer.valueOf(((SpannableStringBuilder) next2.getValue()).length()));
                        }
                        return;
                    }
                }
            }
        }
    }
}
