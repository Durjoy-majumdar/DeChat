package wc3;

import com.tencent.xweb.FileReaderHelper;
import java.util.HashMap;

/* renamed from: wc3.i */
public final class C102428i {

    /* renamed from: a */
    public static final HashMap<String, Long> f301679a;

    static {
        HashMap<String, Long> hashMap = new HashMap<>();
        f301679a = hashMap;
        hashMap.put(FileReaderHelper.DOC_EXT, 64L);
        hashMap.put(FileReaderHelper.DOCX_EXT, 128L);
        hashMap.put(FileReaderHelper.PPT_EXT, 256L);
        hashMap.put(FileReaderHelper.PPTX_EXT, 512L);
        hashMap.put(FileReaderHelper.XLS_EXT, 1024L);
        hashMap.put(FileReaderHelper.XLSX_EXT, 2048L);
        hashMap.put(FileReaderHelper.PDF_EXT, 4096L);
        hashMap.put("1", 1L);
        hashMap.put("3", 2L);
        hashMap.put("48", 4L);
        hashMap.put("43", 8L);
        hashMap.put(FileReaderHelper.MP3_EXT, 16L);
        hashMap.put(FileReaderHelper.WAV_EXT, 16L);
        hashMap.put("wma", 16L);
        hashMap.put("avi", 8L);
        hashMap.put("rmvb", 8L);
        hashMap.put("rm", 8L);
        hashMap.put("mpg", 8L);
        hashMap.put("mpeg", 8L);
        hashMap.put("wmv", 8L);
        hashMap.put("mp4", 8L);
        hashMap.put("mkv", 8L);
    }

    /* renamed from: a */
    public static Long m135144a(String str) {
        if (str == null) {
            return null;
        }
        return f301679a.get(str.toLowerCase());
    }
}
