package com.tencent.p014mm.sdk.platformtools;

import p823sg.C90192e;

/* renamed from: com.tencent.mm.sdk.platformtools.TagDecrypter */
public class TagDecrypter {
    private static final String TAG = "MicroMsg.TagDecrypter";
    private final C90192e des;
    private LruCache<String, String> tagLruCache = new LruCache<>(256);

    public TagDecrypter(String str) {
        this.des = new C90192e(str);
    }

    public String decryptTag(String str) {
        try {
            if (!str.startsWith("!")) {
                return str;
            }
            if (this.tagLruCache.check(str)) {
                return this.tagLruCache.get(str);
            }
            String substring = str.substring(1);
            try {
                String[] split = substring.split("@");
                if (split.length <= 1) {
                    return substring;
                }
                String str2 = split[0];
                int intValue = Integer.valueOf(str2).intValue();
                String substring2 = substring.substring(str2.length() + 1, str2.length() + 1 + intValue);
                String str3 = this.des.mo124436a(substring2) + substring.substring(str2.length() + 1 + intValue);
                this.tagLruCache.put(str, str3);
                return str3;
            } catch (Exception e) {
                e = e;
                str = substring;
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
                return "[td]" + str;
            }
        } catch (Exception e2) {
            e = e2;
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return "[td]" + str;
        }
    }
}
