package com.tencent.p014mm.wexnet;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import java.io.File;

/* renamed from: com.tencent.mm.wexnet.c */
public final class C86024c {

    /* renamed from: a */
    public static final C86025a f250512a = new C86025a((C8480h) null);

    /* renamed from: com.tencent.mm.wexnet.c$a */
    public static final class C86025a {
        public C86025a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo120045a() {
            StringBuilder sb = new StringBuilder();
            sb.append(C112760b.m154230f0());
            String str = File.separator;
            sb.append(str);
            sb.append("Xnet");
            sb.append(str);
            sb.append("lib");
            sb.append(str);
            sb.append("debug");
            sb.append(str);
            return sb.toString();
        }

        /* renamed from: b */
        public final String mo120046b() {
            return MMApplicationContext.getContext().getFilesDir().getAbsolutePath() + File.separator + "XNetLibDebug";
        }
    }
}
