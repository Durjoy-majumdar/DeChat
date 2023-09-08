package p1037t6;

import java.util.HashMap;
import java.util.Map;
import p1024q6.C89484c;

/* renamed from: t6.c */
public class C90377c {

    /* renamed from: a */
    public static final Map<String, C89484c> f259389a;

    static {
        HashMap hashMap = new HashMap(6);
        f259389a = hashMap;
        hashMap.put("image/jpeg", C89484c.JPG);
        hashMap.put("image/gif", C89484c.GIF);
        hashMap.put("image/png", C89484c.PNG);
        C89484c cVar = C89484c.BMP;
        hashMap.put("image/x-ms-bmp", cVar);
        hashMap.put("image/bmp", cVar);
        hashMap.put("image/webp", C89484c.WEBP);
    }
}
