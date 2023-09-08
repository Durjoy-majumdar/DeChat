package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: com.tencent.mm.storage.o2 */
public class C72989o2 {

    /* renamed from: a */
    public String f212818a;

    /* renamed from: b */
    public long f212819b;

    /* renamed from: c */
    public boolean f212820c;

    /* renamed from: d */
    public String f212821d = "-1";

    /* renamed from: e */
    public boolean f212822e;

    /* renamed from: f */
    public String f212823f = "";

    public C72989o2(String str) {
        String str2;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. content is null.");
            return;
        }
        try {
            if (str.endsWith("\n")) {
                str2 = str.substring(0, str.length() - 1);
            } else {
                this.f212823f = str.replace(XVFSFile.PATH_SEPARATOR, "*#*");
                str2 = str;
            }
            String[] split = str2.split(XVFSFile.PATH_SEPARATOR, 6);
            if (split.length > 0) {
                this.f212818a = split[0];
            }
            if (split.length > 1) {
                this.f212819b = Util.getLong(split[1], 0);
            }
            if (split.length > 2) {
                this.f212820c = split[2].equals("1");
            }
            if (split.length > 3) {
                this.f212821d = split[3];
            }
            if (split.length > 4) {
                this.f212823f = split[4].replace("*#*", XVFSFile.PATH_SEPARATOR);
            }
            if (split.length > 5) {
                this.f212822e = split[5].equals("1");
            }
        } catch (Exception e) {
            this.f212819b = 0;
            Log.m105921e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. Content:%s Excpetion:%s", str, Util.stackTraceToString(e));
        }
    }

    /* renamed from: a */
    public static C72989o2 m85758a(String str) {
        return new C72989o2(str);
    }

    /* renamed from: f */
    public static String m85759f(String str, long j, boolean z, String str2, boolean z2, String str3) {
        String replace = str3.replace(XVFSFile.PATH_SEPARATOR, "*#*");
        return str + XVFSFile.PATH_SEPARATOR + j + XVFSFile.PATH_SEPARATOR + (z ? 1 : 0) + XVFSFile.PATH_SEPARATOR + str2 + XVFSFile.PATH_SEPARATOR + replace + XVFSFile.PATH_SEPARATOR + (z2 ? 1 : 0) + "\n";
    }

    /* renamed from: b */
    public String mo101195b() {
        return this.f212818a;
    }

    /* renamed from: c */
    public String mo101196c() {
        return this.f212821d;
    }

    /* renamed from: d */
    public String mo101197d() {
        return this.f212823f;
    }

    /* renamed from: e */
    public String mo101198e() {
        return this.f212818a + XVFSFile.PATH_SEPARATOR + this.f212819b + XVFSFile.PATH_SEPARATOR + (this.f212820c ? 1 : 0) + XVFSFile.PATH_SEPARATOR + this.f212821d + XVFSFile.PATH_SEPARATOR + this.f212823f + XVFSFile.PATH_SEPARATOR + (this.f212822e ? 1 : 0) + "\n";
    }
}
