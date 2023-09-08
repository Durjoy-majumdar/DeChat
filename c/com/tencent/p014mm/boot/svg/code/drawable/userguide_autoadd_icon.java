package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.userguide_autoadd_icon */
public class userguide_autoadd_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
        }
        if (i2 != 2) {
            return 0;
        }
        Canvas canvas = objArr[0];
        Looper looper = objArr[1];
        C24542c.instanceMatrix(looper);
        C24542c.instanceMatrixArray(looper);
        Paint instancePaint = C24542c.instancePaint(looper);
        instancePaint.setFlags(385);
        instancePaint.setStyle(Paint.Style.FILL);
        Paint instancePaint2 = C24542c.instancePaint(looper);
        instancePaint2.setFlags(385);
        instancePaint2.setStyle(Paint.Style.STROKE);
        instancePaint.setColor(-16777216);
        instancePaint2.setStrokeWidth(1.0f);
        instancePaint2.setStrokeCap(Paint.Cap.BUTT);
        instancePaint2.setStrokeJoin(Paint.Join.MITER);
        instancePaint2.setStrokeMiter(4.0f);
        instancePaint2.setPathEffect((PathEffect) null);
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-12799249);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(50.84191f, 59.49536f);
        Path path = instancePath;
        path.cubicTo(47.724426f, 57.772156f, 41.15026f, 55.058155f, 45.487812f, 48.812294f);
        path.cubicTo(45.827f, 48.324017f, 46.040638f, 47.82964f, 46.16315f, 47.33831f);
        path.cubicTo(48.77236f, 44.24183f, 50.68801f, 40.193207f, 50.818626f, 36.43043f);
        instancePath.lineTo(50.842926f, 36.43043f);
        instancePath.lineTo(50.842926f, 31.067535f);
        instancePath.lineTo(50.78015f, 31.067535f);
        Path path2 = instancePath;
        path2.cubicTo(50.14734f, 22.466759f, 43.100338f, 19.0f, 37.45565f, 19.0f);
        path2.cubicTo(31.803875f, 19.0f, 24.748775f, 22.271448f, 24.128113f, 31.067535f);
        instancePath.lineTo(24.06635f, 31.067535f);
        instancePath.lineTo(24.06635f, 36.43043f);
        instancePath.lineTo(24.091663f, 36.43043f);
        Path path3 = instancePath;
        path3.cubicTo(24.222275f, 40.19626f, 26.13185f, 44.243862f, 28.751188f, 47.343395f);
        path3.cubicTo(28.872688f, 47.83269f, 29.082275f, 48.325035f, 29.42045f, 48.812294f);
        path3.cubicTo(33.759014f, 55.058155f, 27.183838f, 57.772156f, 24.06635f, 59.49536f);
        path3.cubicTo(12.092525f, 66.114555f, 9.04085f, 68.203964f, 8.265275f, 71.00036f);
        path3.cubicTo(8.10125f, 71.29434f, 8.0f, 71.62698f, 8.0f, 71.98708f);
        instancePath.lineTo(8.0f, 75.9645f);
        instancePath.cubicTo(8.0f, 77.08753f, 8.9072f, 77.998985f, 10.025f, 77.998985f);
        instancePath.lineTo(64.88428f, 77.998985f);
        instancePath.cubicTo(66.002075f, 77.998985f, 66.90927f, 77.08753f, 66.90927f, 75.9645f);
        instancePath.lineTo(66.90927f, 71.98708f);
        Path path4 = instancePath;
        path4.cubicTo(66.90927f, 71.62698f, 66.80802f, 71.29333f, 66.644f, 71.00036f);
        path4.cubicTo(65.86741f, 68.203964f, 62.814724f, 66.11353f, 50.84191f, 59.49536f);
        instancePath.lineTo(50.84191f, 59.49536f);
        instancePath.close();
        instancePath.moveTo(88.94229f, 67.34948f);
        path4.cubicTo(88.65676f, 64.82062f, 86.95677f, 63.506344f, 76.94923f, 57.975605f);
        path4.cubicTo(74.61035f, 56.68269f, 69.679474f, 54.64617f, 72.93365f, 49.961777f);
        path4.cubicTo(73.186775f, 49.596584f, 73.34473f, 49.22733f, 73.43585f, 48.860104f);
        path4.cubicTo(75.399086f, 46.535706f, 76.83177f, 43.50026f, 76.929985f, 40.676395f);
        instancePath.lineTo(76.94923f, 40.676395f);
        instancePath.lineTo(76.94923f, 36.653206f);
        instancePath.lineTo(76.90265f, 36.653206f);
        Path path5 = instancePath;
        path5.cubicTo(76.42779f, 30.202879f, 71.14355f, 27.60281f, 66.908264f, 27.60281f);
        path5.cubicTo(62.669937f, 27.60281f, 57.378613f, 30.057413f, 56.91286f, 36.653206f);
        instancePath.lineTo(56.8673f, 36.653206f);
        instancePath.lineTo(56.8673f, 40.676395f);
        instancePath.lineTo(56.886536f, 40.676395f);
        Path path6 = instancePath;
        path6.cubicTo(56.98475f, 43.50026f, 58.41744f, 46.536724f, 60.381687f, 48.860104f);
        path6.cubicTo(60.472813f, 49.22733f, 60.62975f, 49.596584f, 60.88389f, 49.961777f);
        path6.cubicTo(63.809f, 54.173157f, 60.1235f, 56.241207f, 57.64895f, 57.5565f);
        path6.cubicTo(73.08755f, 66.09421f, 74.19523f, 67.36474f, 74.26711f, 71.85179f);
        instancePath.lineTo(87.02056f, 71.85179f);
        instancePath.cubicTo(88.11406f, 71.85179f, 89.0f, 70.96272f, 89.0f, 69.86512f);
        instancePath.lineTo(89.0f, 67.80724f);
        instancePath.cubicTo(88.998985f, 67.64855f, 88.976715f, 67.49699f, 88.94229f, 67.34948f);
        instancePath.lineTo(88.94229f, 67.34948f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
