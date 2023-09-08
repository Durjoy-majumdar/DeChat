package com.tencent.p014mm.sdk.platformtools;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p823sg.C90194m;

/* renamed from: com.tencent.mm.sdk.platformtools.LogDecryptor */
public class LogDecryptor {
    private static final Pattern ENCRYPTED_STR_PREFIX_PATTERN = Pattern.compile(newTagPatternDeobfuscate("⍆[0-9]+@"));
    private static final char NEW_OBFUSCATED_MAGIC_CHAR = '⍆';
    private static final char OBFUSCATED_MASK = '?';
    private static final char OLD_OBFUSCATED_MAGIC_CHAR = '?';
    private static final String TAG = "MicroMsg.LogDecryptor";
    private final LruCache<String, String> decryptedStrLruCache = new LruCache<>(256);
    private byte[] key;
    private final TagDecrypter oldTagDecryptor;

    public LogDecryptor(String str) {
        try {
            this.key = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            this.key = str.getBytes();
        }
        this.oldTagDecryptor = new TagDecrypter(str);
    }

    private String decryptImpl(String str, int i, int i2) {
        String substring = str.substring(i, i2);
        if (this.decryptedStrLruCache.checkAndUpTime(substring)) {
            return this.decryptedStrLruCache.get(substring);
        }
        int i3 = i + 1;
        int indexOf = str.indexOf(64, i3);
        int i4 = indexOf + 1;
        try {
            String str2 = new String(C90194m.m112881b(Base64.decode(str.substring(i4, Integer.parseInt(str.substring(i3, indexOf)) + i4), 0), this.key), "UTF-8");
            this.decryptedStrLruCache.put(substring, str2);
            return str2;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return "[TD]" + substring;
        }
    }

    private static String newTagPatternDeobfuscate(String str) {
        return ((char) (str.charAt(0) ^ OBFUSCATED_MASK)) + str.substring(1);
    }

    public String decryptContent(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Matcher matcher = ENCRYPTED_STR_PREFIX_PATTERN.matcher(str);
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!matcher.find(i)) {
                    sb.append(str.substring(i));
                    break;
                }
                if (matcher.start() != i) {
                    sb.append(str.substring(i, matcher.start()));
                }
                int start = matcher.start();
                int end = matcher.end();
                int parseInt = end + Integer.parseInt(str.substring(start + 1, end - 1));
                sb.append(decryptImpl(str, start, parseInt));
                i = parseInt;
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public String decryptTag(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0) ^ OBFUSCATED_MASK;
        return charAt != 9030 ? charAt != 56475 ? str : this.oldTagDecryptor.decryptTag(str) : decryptImpl(str, 0, str.length());
    }
}
