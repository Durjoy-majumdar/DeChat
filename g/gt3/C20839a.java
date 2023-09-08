package gt3;

import android.content.Context;
import android.graphics.Point;
import com.tencent.qbar.QbarNative;
import com.tencent.scanlib.model.DetectCode;
import com.tencent.stubs.logger.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gt3.a */
public class C20839a {

    /* renamed from: a */
    public static String f58851a = "";

    /* renamed from: b */
    public static String f58852b = null;

    /* renamed from: c */
    public static String f58853c = null;

    /* renamed from: d */
    public static String f58854d = null;

    /* renamed from: e */
    public static String f58855e = null;

    /* renamed from: f */
    public static volatile boolean f58856f = false;

    /* renamed from: g */
    public static String f58857g = null;

    /* renamed from: h */
    public static String f58858h = null;

    /* renamed from: i */
    public static volatile int f58859i = 1;

    /* renamed from: j */
    public static volatile boolean f58860j = true;

    /* renamed from: k */
    public static volatile boolean f58861k = true;

    /* renamed from: l */
    public static volatile boolean f58862l = true;

    /* renamed from: m */
    public static volatile boolean f58863m = true;

    /* renamed from: n */
    public static final Object f58864n = new Object();

    /* renamed from: a */
    public static QbarNative.QbarAiModelParam m22865a(Context context) {
        try {
            QbarNative.QbarAiModelParam qbarAiModelParam = new QbarNative.QbarAiModelParam();
            if (f58859i == 1) {
                qbarAiModelParam.detect_model_param_path_ = "";
                qbarAiModelParam.superresolution_model_param_path_ = "";
                qbarAiModelParam.detect_model_bin_path_ = f58853c;
                qbarAiModelParam.detectModelVersion = f58852b;
                qbarAiModelParam.superresolution_model_bin_path_ = f58855e;
                qbarAiModelParam.superResolutionModelVersion = f58854d;
                qbarAiModelParam.enable_seg = f58856f;
                if (f58856f) {
                    qbarAiModelParam.qbar_segmentation_model_path_ = f58858h;
                } else {
                    qbarAiModelParam.qbar_segmentation_model_path_ = "";
                }
            } else {
                qbarAiModelParam.detect_model_bin_path_ = "";
                qbarAiModelParam.detect_model_param_path_ = "";
                qbarAiModelParam.superresolution_model_bin_path_ = "";
                qbarAiModelParam.superresolution_model_param_path_ = "";
                qbarAiModelParam.detectModelVersion = "";
                qbarAiModelParam.superResolutionModelVersion = "";
            }
            Log.m106506i("ScanUtil", "getAiModelParam detectModelBinPath: %s, detectModelParamPath: %s, srModelBinPath: %S, srModelParamPath: %s, currentDetectModelVersion: %s, currentSRModelVersion: %s,enableSeg: %s, segmentationModelPath: %s, segmentationModelVersion: %s", qbarAiModelParam.detect_model_bin_path_, qbarAiModelParam.detect_model_param_path_, qbarAiModelParam.superresolution_model_bin_path_, qbarAiModelParam.superresolution_model_param_path_, qbarAiModelParam.detectModelVersion, qbarAiModelParam.superResolutionModelVersion, Boolean.valueOf(qbarAiModelParam.enable_seg), qbarAiModelParam.qbar_segmentation_model_path_, f58857g);
            return qbarAiModelParam;
        } catch (Exception e) {
            Log.m106497e("ScanUtil", "copy qbar ai model file error! " + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static ArrayList<DetectCode> m22866b(List<QbarNative.QBarCodeDetectInfo> list, List<QbarNative.QBarPoint> list2) {
        ArrayList<DetectCode> arrayList = new ArrayList<>();
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                QbarNative.QBarCodeDetectInfo qBarCodeDetectInfo = list.get(i);
                QbarNative.QBarPoint qBarPoint = list2.get(i);
                ArrayList arrayList2 = new ArrayList(qBarPoint.point_cnt);
                if (qBarPoint.point_cnt > 0) {
                    arrayList2.add(new Point((int) qBarPoint.f56815x0, (int) qBarPoint.f56819y0));
                }
                if (qBarPoint.point_cnt > 1) {
                    arrayList2.add(new Point((int) qBarPoint.f56816x1, (int) qBarPoint.f56820y1));
                }
                if (qBarPoint.point_cnt > 2) {
                    arrayList2.add(new Point((int) qBarPoint.f56817x2, (int) qBarPoint.f56821y2));
                }
                if (qBarPoint.point_cnt > 3) {
                    arrayList2.add(new Point((int) qBarPoint.f56818x3, (int) qBarPoint.f56822y3));
                }
                arrayList.add(new DetectCode(qBarCodeDetectInfo.readerId, arrayList2, qBarCodeDetectInfo.prob));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static String m22867c(Context context) {
        try {
            String str = f58851a;
            if (str == null || str.isEmpty()) {
                f58851a = context.getFilesDir().getAbsolutePath() + "/" + "qbar" + "/";
            }
            Log.m106505i("ScanUtil", "getQBarAIDataDir :" + f58851a);
            return f58851a;
        } catch (Exception e) {
            Log.m106497e("ScanUtil", "getQBarAIDataDir " + e);
            return "";
        }
    }

    /* renamed from: d */
    public static boolean m22868d(String str) {
        return str == null || str.length() == 0;
    }
}
