package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.connect_mac_popup */
public class connect_mac_popup extends C24542c {
    private final int height = 204;
    private final int width = CdnLogic.kGroupNoticeCDNAppType;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return CdnLogic.kGroupNoticeCDNAppType;
        }
        if (i2 == 1) {
            return 204;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-13158344);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(245.998f, 169.0001f);
        instancePath.lineTo(152.0f, 169.0001f);
        instancePath.lineTo(152.0f, 169.0001f);
        instancePath.lineTo(108.0f, 169.0001f);
        instancePath.lineTo(108.0f, 169.0001f);
        instancePath.lineTo(14.002f, 169.0001f);
        instancePath.cubicTo(7.936f, 169.0001f, 3.0f, 164.0641f, 3.0f, 157.9971f);
        instancePath.lineTo(3.0f, 138.0001f);
        instancePath.lineTo(257.0f, 138.0001f);
        instancePath.lineTo(257.0f, 157.9971f);
        Path path = instancePath;
        path.cubicTo(257.0f, 164.0641f, 252.064f, 169.0001f, 245.998f, 169.0001f);
        instancePath.lineTo(245.998f, 169.0001f);
        instancePath.close();
        instancePath.moveTo(14.002f, 3.0001f);
        instancePath.lineTo(245.998f, 3.0001f);
        path.cubicTo(252.064f, 3.0001f, 257.0f, 7.9361f, 257.0f, 14.0021f);
        instancePath.lineTo(257.0f, 136.0001f);
        instancePath.lineTo(3.0f, 136.0001f);
        instancePath.lineTo(3.0f, 14.0021f);
        instancePath.cubicTo(3.0f, 7.9361f, 7.936f, 3.0001f, 14.002f, 3.0001f);
        instancePath.lineTo(14.002f, 3.0001f);
        instancePath.close();
        instancePath.moveTo(164.703f, 197.0001f);
        instancePath.lineTo(95.297f, 197.0001f);
        instancePath.lineTo(107.697f, 194.5201f);
        instancePath.lineTo(110.634f, 172.0001f);
        instancePath.lineTo(149.366f, 172.0001f);
        instancePath.lineTo(152.303f, 194.5201f);
        instancePath.lineTo(164.703f, 197.0001f);
        instancePath.close();
        instancePath.moveTo(245.998f, 1.0E-4f);
        instancePath.lineTo(14.002f, 1.0E-4f);
        instancePath.cubicTo(6.266f, 1.0E-4f, 0.0f, 6.2691f, 0.0f, 14.0021f);
        instancePath.lineTo(0.0f, 157.9971f);
        instancePath.cubicTo(0.0f, 165.7261f, 6.269f, 172.0001f, 14.002f, 172.0001f);
        instancePath.lineTo(107.609f, 172.0001f);
        instancePath.lineTo(105.0f, 192.0001f);
        instancePath.lineTo(90.0f, 195.0001f);
        instancePath.lineTo(90.0f, 200.0001f);
        instancePath.lineTo(170.0f, 200.0001f);
        instancePath.lineTo(170.0f, 195.0001f);
        instancePath.lineTo(155.0f, 192.0001f);
        instancePath.lineTo(152.391f, 172.0001f);
        instancePath.lineTo(245.998f, 172.0001f);
        instancePath.cubicTo(253.734f, 172.0001f, 260.0f, 165.7311f, 260.0f, 157.9971f);
        instancePath.lineTo(260.0f, 14.0021f);
        instancePath.cubicTo(260.0f, 6.2741f, 253.731f, 1.0E-4f, 245.998f, 1.0E-4f);
        instancePath.lineTo(245.998f, 1.0E-4f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
