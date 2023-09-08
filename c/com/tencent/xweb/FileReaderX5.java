package com.tencent.xweb;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.util.XWebLog;
import java.util.HashMap;

public class FileReaderX5 {
    public static final int ERR_CODE_DISABLE = -100005;
    public static final int ERR_CODE_INIT_FAILED = -100003;
    public static final int ERR_CODE_NOT_SUPPORT = -100002;
    public static final int ERR_CODE_NOT_SUPPORT_64 = -100004;
    public static final int ERR_CODE_PARAM = -100001;
    private static final String TAG = "FileReaderX5";

    public static void finishReadFile(Context context, String str, String str2) {
    }

    public static void readFile(int i, Context context, String str, String str2, String str3, boolean z, HashMap<String, String> hashMap, ValueCallback<String> valueCallback, ValueCallback<Integer> valueCallback2) {
        String str4 = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("readFile by x5, fileExt: ");
        String str5 = "null";
        sb.append(str4 != null ? str4 : str5);
        XWebLog.m21911i(TAG, sb.toString());
        long reportFileSize = FileReaderHelper.reportFileSize(str, str2);
        FileReaderHelper.reportPVUV(str4, FileReaderHelper.ReaderType.X5.name());
        int i2 = i;
        FileReaderHelper.reportReadByX5Scene(str4, i);
        FileReaderHelper.OpenFileReportData openFileReportData = new FileReaderHelper.OpenFileReportData(FileReaderHelper.getOpenFileScene(hashMap), str2, reportFileSize, FileReaderHelper.READER_TYPE_MINIQB, -1, FileReaderHelper.convertOpenFileFrom(i));
        Context context2 = context;
        openFileReportData.markStart(context);
        FileReaderHelper.reportOpenFile(openFileReportData);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("readFile by x5, disable x5, fileExt: ");
        if (str4 != null) {
            str5 = str4;
        }
        sb4.append(str5);
        XWebLog.m21911i(TAG, sb4.toString());
        FileReaderHelper.reportX5ErrorCode(str2, ERR_CODE_DISABLE, true, i, context, openFileReportData);
        valueCallback2.onReceiveValue(-102);
    }
}
