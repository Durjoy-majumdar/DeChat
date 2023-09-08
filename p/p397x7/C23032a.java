package p397x7;

import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p333e8.C20541m;
import p383t7.C22439a;
import p383t7.C22440b;
import p383t7.C22442d;

/* renamed from: x7.a */
public final class C23032a extends C22440b {

    /* renamed from: n */
    public static final Pattern f66228n = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");

    /* renamed from: m */
    public final StringBuilder f66229m = new StringBuilder();

    public C23032a() {
        super("SubripDecoder");
    }

    /* renamed from: g */
    public static long m27350g(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    /* renamed from: f */
    public C22442d mo14895f(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        long[] jArr = new long[32];
        C20541m mVar = new C20541m(bArr, i);
        int i2 = 0;
        while (true) {
            String d = mVar.mo32093d();
            if (d == null) {
                break;
            } else if (d.length() != 0) {
                try {
                    Integer.parseInt(d);
                    String d2 = mVar.mo32093d();
                    if (d2 == null) {
                        break;
                    }
                    Matcher matcher = f66228n.matcher(d2);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        long g = m27350g(matcher, 1);
                        if (i2 == jArr.length) {
                            jArr = Arrays.copyOf(jArr, i2 * 2);
                        }
                        int i3 = i2 + 1;
                        jArr[i2] = g;
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            long g2 = m27350g(matcher, 6);
                            if (i3 == jArr.length) {
                                jArr = Arrays.copyOf(jArr, i3 * 2);
                            }
                            i2 = i3 + 1;
                            jArr[i3] = g2;
                        } else {
                            i2 = i3;
                            z2 = false;
                        }
                        this.f66229m.setLength(0);
                        while (true) {
                            String d3 = mVar.mo32093d();
                            if (TextUtils.isEmpty(d3)) {
                                break;
                            }
                            if (this.f66229m.length() > 0) {
                                this.f66229m.append("<br>");
                            }
                            this.f66229m.append(d3.trim());
                        }
                        arrayList.add(new C22439a(Html.fromHtml(this.f66229m.toString())));
                        if (z2) {
                            arrayList.add((Object) null);
                        }
                    }
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        C22439a[] aVarArr = new C22439a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return new C23033b(aVarArr, Arrays.copyOf(jArr, i2));
    }
}
