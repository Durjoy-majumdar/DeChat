package p393w7;

import com.tencent.tav.coremedia.TimeUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p333e8.C20528a;
import p333e8.C20541m;
import p383t7.C22439a;
import p383t7.C22440b;
import p383t7.C22442d;

/* renamed from: w7.a */
public final class C22875a extends C22440b {

    /* renamed from: r */
    public static final Pattern f65762r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");

    /* renamed from: m */
    public final boolean f65763m;

    /* renamed from: n */
    public int f65764n;

    /* renamed from: o */
    public int f65765o;

    /* renamed from: p */
    public int f65766p;

    /* renamed from: q */
    public int f65767q;

    public C22875a(List<byte[]> list) {
        super("SsaDecoder");
        String d;
        if (list != null) {
            this.f65763m = true;
            String str = new String(list.get(0));
            C20528a.m22237a(str.startsWith("Format: "));
            mo36047g(str);
            C20541m mVar = new C20541m(list.get(1));
            do {
                d = mVar.mo32093d();
                if (d == null || d.startsWith("[Events]")) {
                    return;
                }
                d = mVar.mo32093d();
                return;
            } while (d.startsWith("[Events]"));
            return;
        }
        this.f65763m = false;
    }

    /* renamed from: h */
    public static long m26847h(String str) {
        Matcher matcher = f65762r.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * TimeUtil.SECOND_TO_US) + (Long.parseLong(matcher.group(2)) * 60 * TimeUtil.SECOND_TO_US) + (Long.parseLong(matcher.group(3)) * TimeUtil.SECOND_TO_US) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* renamed from: f */
    public C22442d mo14895f(byte[] bArr, int i, boolean z) {
        long j;
        String d;
        ArrayList arrayList = new ArrayList();
        long[] jArr = new long[32];
        C20541m mVar = new C20541m(bArr, i);
        if (!this.f65763m) {
            do {
                d = mVar.mo32093d();
                if (d == null) {
                    break;
                }
            } while (d.startsWith("[Events]"));
        }
        int i2 = 0;
        while (true) {
            String d2 = mVar.mo32093d();
            if (d2 == null) {
                C22439a[] aVarArr = new C22439a[arrayList.size()];
                arrayList.toArray(aVarArr);
                return new C22876b(aVarArr, Arrays.copyOf(jArr, i2));
            } else if (!this.f65763m && d2.startsWith("Format: ")) {
                mo36047g(d2);
            } else if (d2.startsWith("Dialogue: ") && this.f65764n != 0) {
                String[] split = d2.substring(10).split(",", this.f65764n);
                long h = m26847h(split[this.f65765o]);
                if (h != -9223372036854775807L) {
                    String str = split[this.f65766p];
                    if (!str.trim().isEmpty()) {
                        j = m26847h(str);
                        if (j == -9223372036854775807L) {
                        }
                    } else {
                        j = -9223372036854775807L;
                    }
                    arrayList.add(new C22439a(split[this.f65767q].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
                    if (i2 == jArr.length) {
                        jArr = Arrays.copyOf(jArr, i2 * 2);
                    }
                    int i3 = i2 + 1;
                    jArr[i2] = h;
                    if (j != -9223372036854775807L) {
                        arrayList.add((Object) null);
                        if (i3 == jArr.length) {
                            jArr = Arrays.copyOf(jArr, i3 * 2);
                        }
                        i2 = i3 + 1;
                        jArr[i3] = j;
                    } else {
                        i2 = i3;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36047g(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 8
            java.lang.String r6 = r6.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r6 = android.text.TextUtils.split(r6, r0)
            int r0 = r6.length
            r5.f65764n = r0
            r0 = -1
            r5.f65765o = r0
            r5.f65766p = r0
            r5.f65767q = r0
            r1 = 0
            r2 = 0
        L_0x0018:
            int r3 = r5.f65764n
            if (r2 >= r3) goto L_0x0063
            r3 = r6[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = p333e8.C20551y.m22322l(r3)
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case 100571: goto L_0x004a;
                case 3556653: goto L_0x003e;
                case 109757538: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            r3 = -1
            goto L_0x0054
        L_0x0032:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x003c
            goto L_0x0030
        L_0x003c:
            r3 = 2
            goto L_0x0054
        L_0x003e:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0048
            goto L_0x0030
        L_0x0048:
            r3 = 1
            goto L_0x0054
        L_0x004a:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0053
            goto L_0x0030
        L_0x0053:
            r3 = 0
        L_0x0054:
            switch(r3) {
                case 0: goto L_0x005e;
                case 1: goto L_0x005b;
                case 2: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x0060
        L_0x0058:
            r5.f65765o = r2
            goto L_0x0060
        L_0x005b:
            r5.f65767q = r2
            goto L_0x0060
        L_0x005e:
            r5.f65766p = r2
        L_0x0060:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p393w7.C22875a.mo36047g(java.lang.String):void");
    }
}
