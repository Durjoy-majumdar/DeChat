package com.tencent.p014mm.splash;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.splash.f */
public final class C44650f {

    /* renamed from: a */
    public static final boolean f121058a;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(property);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.m105924i("MicroMsg.MultiDex", sb.toString());
        f121058a = z;
    }
}
