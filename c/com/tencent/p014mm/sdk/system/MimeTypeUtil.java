package com.tencent.p014mm.sdk.system;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.FileReaderHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.sdk.system.MimeTypeUtil */
public class MimeTypeUtil {
    private static final Map<String, String> MyMimeMapExtToMime;
    private static final Map<String, String> MyMimeMapMimeToExt;

    /* renamed from: com.tencent.mm.sdk.system.MimeTypeUtil$ContentType */
    public static final class ContentType {
        private static final String CHARSET_EQ = "charset=";
        public static final String DEFAULT_CHARSET = "UTF-8";
        private static final Pattern MIMETYPE_PATTERN = Pattern.compile("([a-zA-Z*-.0-9]+/[a-zA-Z*-.0-9]+)");
        public final String charset;
        public final String mimeType;

        private ContentType(String str, String str2) {
            this.mimeType = str;
            this.charset = str2;
        }

        public static ContentType obtain(String str) {
            String str2 = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Matcher matcher = MIMETYPE_PATTERN.matcher(str);
            if (!matcher.find()) {
                return null;
            }
            String group = matcher.group(0);
            if (str.contains(CHARSET_EQ)) {
                str2 = str.substring(str.indexOf(CHARSET_EQ) + 8).trim();
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "UTF-8";
            }
            return new ContentType(group, str2);
        }

        public String toString() {
            return "ContentType{mimeType='" + this.mimeType + '\'' + ", charset='" + this.charset + '\'' + '}';
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("silk", "audio/silk"));
        arrayList.add(new Pair("jpg", "image/jpeg"));
        arrayList.add(new Pair("json", "application/json"));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            hashMap.put((String) pair.first, (String) pair.second);
            hashMap2.put((String) pair.second, (String) pair.first);
        }
        MyMimeMapExtToMime = Collections.unmodifiableMap(hashMap);
        MyMimeMapMimeToExt = Collections.unmodifiableMap(hashMap2);
    }

    public static String getExtByMimeType(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        String str2 = MyMimeMapMimeToExt.get(lowerCase);
        if (TextUtils.isEmpty(str2)) {
            str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return (!MimeTypes.AUDIO_MPEG.equals(lowerCase) && !"audio/mp3".equals(lowerCase)) ? MimeTypes.AUDIO_MP4.equals(lowerCase) ? "mp4" : "application/pdf".equals(lowerCase) ? FileReaderHelper.PDF_EXT : (!"image/jpeg".equals(lowerCase) && !"image/jpg".equals(lowerCase)) ? str2 : "jpg" : FileReaderHelper.MP3_EXT;
        }
    }

    public static String getFileExtByFilePath(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(46)) >= 0 && lastIndexOf < str.length() - 1) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static String getMimeTypeByFileExt(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = MyMimeMapExtToMime.get(str.toLowerCase());
        if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return (!TextUtils.isEmpty(str2) || !FileReaderHelper.MP3_EXT.equals(str)) ? str2 : MimeTypes.AUDIO_MPEG;
    }

    public static String getMimeTypeByFilePath(String str) {
        return getMimeTypeByFileExt(getFileExtByFilePath(str));
    }
}
