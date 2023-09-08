package com.tencent.p014mm.sdk.platformtools;

import com.tencent.xweb.FileReaderHelper;

/* renamed from: com.tencent.mm.sdk.platformtools.FileExplorerUtil */
public class FileExplorerUtil {
    public static boolean isCompressFile(String str) {
        String lowerCase = Util.nullAsNil(str).toLowerCase();
        return lowerCase.endsWith(".rar") || lowerCase.endsWith(".zip") || lowerCase.endsWith(".7z") || lowerCase.endsWith("tar") || lowerCase.endsWith(".iso");
    }

    public static boolean isDoc(String str) {
        String lowerCase = Util.nullAsNil(str).toLowerCase();
        return lowerCase.endsWith(".doc") || lowerCase.endsWith(".docx") || lowerCase.endsWith(FileReaderHelper.WPS_EXT);
    }

    public static boolean isImg(String str) {
        String lowerCase = Util.nullAsNil(str).toLowerCase();
        return lowerCase.endsWith(".bmp") || lowerCase.endsWith(".png") || lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".gif");
    }

    public static boolean isMedia(String str) {
        String lowerCase = Util.nullAsNil(str).toLowerCase();
        return lowerCase.endsWith(".mp3") || lowerCase.endsWith(".wma") || lowerCase.endsWith(".mp4") || lowerCase.endsWith(".rm");
    }

    public static boolean isOfd(String str) {
        return Util.nullAsNil(str).toLowerCase().endsWith(".ofd");
    }

    public static boolean isPdf(String str) {
        return Util.nullAsNil(str).toLowerCase().endsWith(".pdf");
    }

    public static boolean isPpt(String str) {
        String lowerCase = Util.nullAsNil(str).toLowerCase();
        return lowerCase.endsWith(".ppt") || lowerCase.endsWith(".pptx");
    }

    public static boolean isTxt(String str) {
        String lowerCase = Util.nullAsNil(str).toLowerCase();
        return lowerCase.endsWith(".txt") || lowerCase.endsWith(".rtf");
    }

    public static boolean isXls(String str) {
        String lowerCase = Util.nullAsNil(str).toLowerCase();
        return lowerCase.endsWith(".xls") || lowerCase.endsWith(".xlsx");
    }
}
