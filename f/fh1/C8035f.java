package fh1;

import gy3.C87412m;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rx3.C13604l;
import te3.C48770aw0;

/* renamed from: fh1.f */
public final class C8035f {

    /* renamed from: a */
    public static final C8035f f26736a = new C8035f();

    /* renamed from: b */
    public static int f26737b = 1;

    /* renamed from: c */
    public static boolean f26738c;

    /* renamed from: a */
    public final C48770aw0 mo9117a(C48770aw0 aw02) {
        C87412m.m108594g(aw02, "<this>");
        C48770aw0 aw03 = new C48770aw0();
        aw03.f130789d = aw02.f130789d;
        aw03.f130790e = aw02.f130790e;
        aw03.f130791f = aw02.f130791f;
        aw03.f130792g = aw02.f130792g;
        aw03.f130793h = aw02.f130793h;
        aw03.f130794i = aw02.f130794i;
        return aw03;
    }

    /* renamed from: b */
    public final C13604l<Integer, Integer> mo9118b(String str) {
        Matcher matcher = Pattern.compile("(.*?)粉丝团弹幕(\\d+)级(.*?)").matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(2);
            C87412m.m108593f(group, "matcher.group(2)");
            return new C13604l<>(4, Integer.valueOf(Integer.parseInt(group)));
        }
        Matcher matcher2 = Pattern.compile("(.*?)等级弹幕(\\d+)级(.*?)").matcher(str);
        if (!matcher2.matches()) {
            return new C13604l<>(0, -1);
        }
        String group2 = matcher2.group(2);
        C87412m.m108593f(group2, "matcher.group(2)");
        return new C13604l<>(2, Integer.valueOf(Integer.parseInt(group2)));
    }
}
