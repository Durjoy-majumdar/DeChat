package aw0;

import com.tencent.p014mm.C0966R;
import com.tencent.xweb.FileReaderHelper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aw0.m */
public class C92162m {

    /* renamed from: a */
    public static Map<String, Integer> f263793a;

    static {
        HashMap hashMap = new HashMap();
        f263793a = hashMap;
        Integer valueOf = Integer.valueOf(C0966R.raw.file_float_ball_icon_word);
        hashMap.put(FileReaderHelper.DOC_EXT, valueOf);
        f263793a.put(FileReaderHelper.DOCX_EXT, valueOf);
        Map<String, Integer> map = f263793a;
        Integer valueOf2 = Integer.valueOf(C0966R.raw.file_float_ball_icon_ppt);
        map.put(FileReaderHelper.PPT_EXT, valueOf2);
        f263793a.put(FileReaderHelper.PPTX_EXT, valueOf2);
        Map<String, Integer> map2 = f263793a;
        Integer valueOf3 = Integer.valueOf(C0966R.raw.file_float_ball_icon_excel);
        map2.put(FileReaderHelper.XLS_EXT, valueOf3);
        f263793a.put(FileReaderHelper.XLSX_EXT, valueOf3);
        f263793a.put(FileReaderHelper.PDF_EXT, Integer.valueOf(C0966R.raw.file_float_ball_icon_pdf));
        f263793a.put("numbers", Integer.valueOf(C0966R.raw.file_float_ball_icon_numbers));
        f263793a.put("pages", Integer.valueOf(C0966R.raw.file_float_ball_icon_pages));
        f263793a.put("key", Integer.valueOf(C0966R.raw.file_float_ball_icon_key));
        f263793a.put(FileReaderHelper.TXT_EXT, Integer.valueOf(C0966R.raw.file_float_ball_icon_txt));
        f263793a.put("unknown", Integer.valueOf(C0966R.raw.file_float_ball_icon_default));
        f263793a.put("ofd", Integer.valueOf(C0966R.raw.file_float_ball_icon_ofd));
    }

    /* renamed from: a */
    public static Integer m115833a(String str) {
        return (Integer) ((HashMap) f263793a).get(str);
    }
}
