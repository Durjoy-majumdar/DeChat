package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ipcall_conpous_bg */
public class ipcall_conpous_bg extends C24542c {
    private final int height = 384;
    private final int width = JsApiInstallDownloadTask.CTRL_INDEX;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return JsApiInstallDownloadTask.CTRL_INDEX;
        }
        if (i2 == 1) {
            return 384;
        }
        if (i2 != 2) {
            return 0;
        }
        Canvas canvas = objArr[0];
        Looper looper = objArr[1];
        Matrix instanceMatrix = C24542c.instanceMatrix(looper);
        float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -638.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(1080.0f, 0.0f);
        instancePath.lineTo(1080.0f, 384.0f);
        instancePath.lineTo(0.0f, 384.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(700.6798f, 213.73169f);
        Path path = instancePath2;
        path.cubicTo(697.973f, 173.42755f, 710.4088f, 134.17123f, 738.70874f, 105.26089f);
        path.cubicTo(796.09906f, 46.63267f, 896.9981f, 52.75353f, 964.07306f, 118.932205f);
        path.cubicTo(1031.1481f, 185.11089f, 1038.999f, 286.28687f, 981.6087f, 344.91507f);
        path.cubicTo(950.7191f, 376.47092f, 907.22516f, 389.26904f, 863.185f, 384.04095f);
        path.cubicTo(858.7008f, 393.6198f, 852.6391f, 402.50076f, 844.97217f, 410.33347f);
        path.cubicTo(803.2441f, 452.9637f, 729.76733f, 448.40085f, 680.8573f, 400.142f);
        path.cubicTo(631.94727f, 351.88315f, 626.1251f, 278.20294f, 667.8532f, 235.5727f);
        path.cubicTo(677.36743f, 225.85278f, 688.53217f, 218.58626f, 700.6798f, 213.73169f);
        instancePath2.close();
        instancePath2.moveTo(700.6798f, 213.73169f);
        path.cubicTo(703.4623f, 255.16158f, 722.245f, 297.69867f, 756.2444f, 331.24374f);
        path.cubicTo(787.21716f, 361.80264f, 825.4021f, 379.55566f, 863.185f, 384.04095f);
        path.cubicTo(883.1062f, 341.486f, 871.8916f, 285.15613f, 831.9681f, 245.76416f);
        path.cubicTo(794.2098f, 208.50858f, 741.8103f, 197.29474f, 700.6798f, 213.73169f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 7, 31);
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
