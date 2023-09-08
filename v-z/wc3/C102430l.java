package wc3;

import com.tencent.p014mm.C0966R;
import com.tencent.xweb.FileReaderHelper;
import java.util.HashMap;

/* renamed from: wc3.l */
public class C102430l {

    /* renamed from: a */
    public static HashMap<String, Integer> f301680a;

    /* renamed from: a */
    public static int m135146a(String str) {
        if (f301680a == null) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            f301680a = hashMap;
            hashMap.put("avi", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("m4v", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("vob", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("mpeg", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("mpe", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("asx", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("asf", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("f4v", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("flv", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("mkv", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("wmv", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("wm", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("3gp", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("mp4", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("rmvb", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("rm", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("ra", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("ram", Integer.valueOf(C0966R.raw.app_attach_file_icon_video));
            f301680a.put("mp3pro", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("vqf", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("cd", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("md", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("mod", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("vorbis", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("au", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("amr", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("silk", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("wma", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("mmf", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("mid", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("midi", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put(FileReaderHelper.MP3_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put(FileReaderHelper.AAC_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("ape", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("aiff", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("aif", Integer.valueOf(C0966R.raw.app_attach_file_icon_music));
            f301680a.put("jfif", Integer.valueOf(C0966R.C0969drawable.btu));
            f301680a.put("tiff", Integer.valueOf(C0966R.C0969drawable.btu));
            f301680a.put("tif", Integer.valueOf(C0966R.C0969drawable.btu));
            f301680a.put("jpe", Integer.valueOf(C0966R.C0969drawable.btu));
            f301680a.put("dib", Integer.valueOf(C0966R.C0969drawable.btu));
            f301680a.put("jpeg", Integer.valueOf(C0966R.C0969drawable.btu));
            f301680a.put("jpg", Integer.valueOf(C0966R.C0969drawable.btu));
            f301680a.put("png", Integer.valueOf(C0966R.C0969drawable.btu));
            f301680a.put("bmp", Integer.valueOf(C0966R.C0969drawable.btu));
            f301680a.put("gif", Integer.valueOf(C0966R.C0969drawable.btu));
            f301680a.put("rar", Integer.valueOf(C0966R.raw.app_attach_file_icon_rar));
            f301680a.put("zip", Integer.valueOf(C0966R.raw.app_attach_file_icon_rar));
            f301680a.put("7z", Integer.valueOf(C0966R.raw.app_attach_file_icon_rar));
            f301680a.put("iso", Integer.valueOf(C0966R.raw.app_attach_file_icon_rar));
            f301680a.put("cab", Integer.valueOf(C0966R.raw.app_attach_file_icon_rar));
            f301680a.put(FileReaderHelper.DOC_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_word));
            f301680a.put(FileReaderHelper.DOCX_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_word));
            f301680a.put(FileReaderHelper.PPT_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_ppt));
            f301680a.put(FileReaderHelper.PPTX_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_ppt));
            f301680a.put(FileReaderHelper.XLS_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_excel));
            f301680a.put(FileReaderHelper.XLSX_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_excel));
            f301680a.put(FileReaderHelper.TXT_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_txt));
            f301680a.put("rtf", Integer.valueOf(C0966R.raw.app_attach_file_icon_txt));
            f301680a.put(FileReaderHelper.PDF_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_pdf));
            f301680a.put("ofd", Integer.valueOf(C0966R.raw.app_attach_file_icon_ofd));
        }
        Integer num = f301680a.get(str);
        return num == null ? C0966R.raw.app_attach_file_icon_unknow : num.intValue();
    }
}
