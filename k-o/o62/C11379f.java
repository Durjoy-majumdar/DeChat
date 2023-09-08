package o62;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;

/* renamed from: o62.f */
public class C11379f {

    /* renamed from: o62.f$a */
    public static class C11380a {

        /* renamed from: a */
        public int f33505a;

        /* renamed from: b */
        public String f33506b;

        public C11380a(int i, String str) {
            this.f33505a = i;
            this.f33506b = str;
        }
    }

    /* renamed from: a */
    public static ArrayList<C11380a> m11201a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.SysMsgTemplateParser", "hy: null text!!");
            return null;
        }
        ArrayList<C11380a> arrayList = new ArrayList<>();
        String[] split = str.split("\\$");
        for (int i = 0; i < split.length; i++) {
            arrayList.add(i % 2 == 0 ? new C11380a(0, split[i]) : new C11380a(1, split[i]));
        }
        return arrayList;
    }
}
