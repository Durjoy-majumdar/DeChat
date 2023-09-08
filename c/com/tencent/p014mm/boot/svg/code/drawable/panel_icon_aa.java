package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_aa */
public class panel_icon_aa extends C24542c {
    private final int height = 80;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 66;
        }
        if (i2 == 1) {
            return 80;
        }
        if (i2 == 2) {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-8617594);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -416.0f, 0.0f, 1.0f, -1269.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(482.0f, 1311.7202f);
            instancePath.lineTo(482.0f, 1271.9901f);
            instancePath.cubicTo(482.0f, 1270.3384f, 480.65353f, 1269.0f, 478.9926f, 1269.0f);
            instancePath.lineTo(419.0074f, 1269.0f);
            instancePath.cubicTo(417.3483f, 1269.0f, 416.0f, 1270.3387f, 416.0f, 1271.9901f);
            instancePath.lineTo(416.0f, 1346.0099f);
            instancePath.cubicTo(416.0f, 1347.6616f, 417.34647f, 1349.0f, 419.0074f, 1349.0f);
            instancePath.lineTo(478.9926f, 1349.0f);
            instancePath.cubicTo(480.6517f, 1349.0f, 482.0f, 1347.6613f, 482.0f, 1346.0099f);
            instancePath.lineTo(482.0f, 1316.9371f);
            instancePath.lineTo(449.52548f, 1336.6007f);
            instancePath.lineTo(449.2816f, 1336.748f);
            Path path = instancePath;
            path.cubicTo(448.97964f, 1336.9077f, 448.63965f, 1337.0f, 448.2788f, 1337.0f);
            path.cubicTo(447.44376f, 1337.0f, 446.71753f, 1336.517f, 446.33582f, 1335.8048f);
            instancePath.lineTo(446.18982f, 1335.4691f);
            instancePath.lineTo(440.107f, 1321.471f);
            Path path2 = instancePath;
            path2.cubicTo(440.0408f, 1321.3179f, 440.0f, 1321.1458f, 440.0f, 1320.9784f);
            path2.cubicTo(440.0f, 1320.3337f, 440.49866f, 1319.8098f, 441.1143f, 1319.8098f);
            path2.cubicTo(441.36453f, 1319.8098f, 441.59482f, 1319.8964f, 441.7807f, 1320.0417f);
            instancePath.lineTo(448.9588f, 1325.4017f);
            Path path3 = instancePath;
            path3.cubicTo(449.48376f, 1325.7621f, 450.11026f, 1325.9731f, 450.78394f, 1325.9731f);
            path3.cubicTo(451.18558f, 1325.9731f, 451.5691f, 1325.8942f, 451.92633f, 1325.7583f);
            instancePath.lineTo(482.0f, 1311.7202f);
            instancePath.close();
            instancePath.moveTo(428.0f, 1294.5f);
            instancePath.lineTo(452.0f, 1294.5f);
            instancePath.lineTo(452.0f, 1299.0f);
            instancePath.lineTo(428.0f, 1299.0f);
            instancePath.lineTo(428.0f, 1294.5f);
            instancePath.close();
            instancePath.moveTo(428.0f, 1281.0f);
            instancePath.lineTo(452.0f, 1281.0f);
            instancePath.lineTo(452.0f, 1285.5f);
            instancePath.lineTo(428.0f, 1285.5f);
            instancePath.lineTo(428.0f, 1281.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
