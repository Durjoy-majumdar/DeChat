package com.tencent.p014mm.plugin.appbrand.page;

/* renamed from: com.tencent.mm.plugin.appbrand.page.q1 */
public class C68629q1 {
    /* renamed from: a */
    public static String m80872a(String str) {
        int i = 0;
        String str2 = "";
        while (true) {
            int indexOf = str.indexOf("<script>", i);
            int indexOf2 = str.indexOf("</script>", i);
            if (indexOf == -1 || indexOf2 == -1 || indexOf2 <= indexOf) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i > 0 ? ";" : "");
            sb.append(str.substring(indexOf + 8, indexOf2));
            str2 = sb.toString();
            i = indexOf2 + 9;
        }
        return str2;
    }
}
