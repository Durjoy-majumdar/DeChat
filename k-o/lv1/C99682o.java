package lv1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import kv1.C99249c;

/* renamed from: lv1.o */
public class C99682o extends C99681n {
    /* renamed from: a */
    public void mo139048a() {
        String str;
        int i;
        if (!Util.isNullOrNil(this.f292155i)) {
            switch (this.f292148b) {
                case 131072:
                case StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON:
                case 131081:
                case 262144:
                case 327680:
                    int i2 = this.f292149c;
                    if (i2 == 2 || i2 == 3 || i2 == 6 || i2 == 7) {
                        try {
                            String[] split = C99249c.C99250a.f291020b.split(this.f292155i);
                            mo139053f(C99249c.C99250a.f291023e);
                            int binarySearch = Arrays.binarySearch(this.f292159m, new String(this.f292154h.getBytes(), 0, Integer.valueOf(split[1]).intValue()).length());
                            this.f292156j = binarySearch;
                            if (binarySearch < 0) {
                                this.f292156j = (-binarySearch) - 2;
                            }
                            this.f292157k = this.f292158l[this.f292156j];
                            return;
                        } catch (Exception unused) {
                            this.f292156j = Integer.MAX_VALUE;
                            this.f292157k = "";
                            return;
                        }
                    } else if (i2 == 11 || i2 == 51) {
                        this.f292156j = Integer.MAX_VALUE;
                        this.f292157k = "";
                        return;
                    } else {
                        try {
                            this.f292156j = new String(this.f292154h.getBytes(), 0, Integer.valueOf(C99249c.C99250a.f291020b.split(this.f292155i)[1]).intValue()).length();
                            this.f292157k = this.f292154h;
                            return;
                        } catch (Exception unused2) {
                            this.f292156j = Integer.MAX_VALUE;
                            this.f292157k = "";
                            return;
                        }
                    }
                case 131075:
                    if (this.f292149c == 38) {
                        ArrayList arrayList = new ArrayList();
                        mo139053f(C99249c.C99250a.f291021c);
                        String[] split2 = C99249c.C99250a.f291020b.split(this.f292155i);
                        byte[] bytes = this.f292154h.getBytes();
                        for (int i3 = 0; i3 < split2.length - 1; i3 += 2) {
                            int intValue = Integer.valueOf(split2[i3]).intValue();
                            int length = new String(bytes, 0, Integer.valueOf(split2[i3 + 1]).intValue()).length();
                            int binarySearch2 = Arrays.binarySearch(this.f292159m, length);
                            if (binarySearch2 < 0) {
                                binarySearch2 = (-binarySearch2) - 2;
                            }
                            int i4 = binarySearch2;
                            String[] split3 = C99249c.C99250a.f291022d.split(this.f292158l[i4]);
                            int i5 = length - this.f292159m[i4];
                            int i6 = 0;
                            while (true) {
                                if (i6 < split3.length) {
                                    i5 = (i5 - split3[i6].length()) - 1;
                                    if (i5 < 0) {
                                        String str2 = split3[i6];
                                        i = C99249c.f291015m[i6];
                                        str = str2;
                                    } else {
                                        i6++;
                                    }
                                } else {
                                    str = null;
                                    i = -1;
                                }
                            }
                            if (i > 0) {
                                arrayList.add(new C99671h(i4, intValue, i, str, split3[split3.length - 1]));
                            }
                        }
                        this.f292160n = arrayList;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public void mo139049b(C99672i iVar) {
        if (iVar.f292122c.length > 1) {
            this.f292164r = 1;
        } else {
            this.f292164r = 0;
        }
        int i = this.f292148b;
        if (i == 131075) {
            if (System.currentTimeMillis() - this.f292152f < 1209600000) {
                this.f292162p += 50;
                String s = C75592q0.m90789s();
                if (this.f292149c == 38) {
                    HashSet hashSet = new HashSet();
                    List<C99671h> list = this.f292160n;
                    if (list != null) {
                        for (C99671h next : list) {
                            if (!s.equals(next.f292112d)) {
                                hashSet.add(Integer.valueOf(next.f292109a));
                            }
                        }
                    }
                    if (((long) hashSet.size()) >= this.f292150d - 1) {
                        this.f292162p += 20;
                        this.f292165s = true;
                    }
                    if (iVar.f292122c.length > 1 && this.f292154h.contains(iVar.f292120a)) {
                        this.f292164r = 2;
                        this.f292162p += 5;
                    }
                    if (this.f292150d <= 15) {
                        this.f292167u = 1;
                    }
                }
                int i2 = this.f292149c;
                if ((i2 == 5 || i2 == 1) && this.f292154h.contains(iVar.f292120a)) {
                    if (iVar.f292122c.length > 1) {
                        this.f292164r = 2;
                    }
                    this.f292162p += 10;
                }
            }
        } else if (i == 131072) {
            if (System.currentTimeMillis() - this.f292152f < 1105032704) {
                this.f292162p += 50;
            }
            int i3 = this.f292149c;
            if ((i3 == 5 || i3 == 1) && this.f292154h.contains(iVar.f292120a)) {
                if (iVar.f292122c.length > 1) {
                    this.f292164r = 2;
                }
                this.f292162p += 10;
            }
        }
    }

    /* renamed from: c */
    public C99682o mo139050c(Cursor cursor) {
        this.f292147a = cursor.getLong(0);
        this.f292148b = cursor.getInt(1);
        this.f292149c = cursor.getInt(2);
        this.f292150d = cursor.getLong(3);
        this.f292151e = cursor.getString(4);
        this.f292152f = cursor.getLong(5);
        if (cursor.getColumnCount() >= 7) {
            this.f292154h = cursor.getString(6);
        }
        if (cursor.getColumnCount() >= 8) {
            this.f292155i = cursor.getString(7);
        }
        return this;
    }

    /* renamed from: d */
    public C99682o mo139051d(Cursor cursor) {
        this.f292147a = cursor.getLong(0);
        this.f292148b = cursor.getInt(1);
        this.f292149c = cursor.getInt(2);
        this.f292150d = cursor.getLong(3);
        this.f292151e = cursor.getString(4);
        this.f292152f = cursor.getLong(5);
        this.f292153g = cursor.getString(6);
        return this;
    }

    /* renamed from: e */
    public C99682o mo139052e(Cursor cursor) {
        this.f292147a = cursor.getLong(0);
        this.f292148b = cursor.getInt(1);
        this.f292149c = cursor.getInt(2);
        this.f292150d = cursor.getLong(3);
        this.f292151e = cursor.getString(4);
        this.f292152f = cursor.getLong(5);
        this.f292154h = cursor.getString(6);
        this.f292155i = cursor.getString(7);
        this.f292163q = cursor.getLong(8);
        return this;
    }

    /* renamed from: f */
    public final void mo139053f(Pattern pattern) {
        String[] split = pattern.split(this.f292154h);
        this.f292158l = split;
        this.f292159m = new int[split.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f292159m;
            if (i < iArr.length) {
                iArr[i] = i2;
                i2 += this.f292158l[i].length() + 1;
                i++;
            } else {
                return;
            }
        }
    }
}
