package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatto_voice_playing_f3 */
public class chatto_voice_playing_f3 extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 72.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.restore();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 72.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(42.834522f, 12.0f);
        Path path = instancePath;
        path.cubicTo(48.80635f, 18.142136f, 52.5f, 26.627417f, 52.5f, 36.0f);
        path.cubicTo(52.5f, 45.37258f, 48.80635f, 53.857864f, 42.834522f, 60.0f);
        instancePath.lineTo(39.334347f, 56.4f);
        Path path2 = instancePath;
        path2.cubicTo(44.410397f, 51.179184f, 47.55f, 43.966694f, 47.55f, 36.0f);
        path2.cubicTo(47.55f, 28.033304f, 44.410397f, 20.820816f, 39.334347f, 15.6f);
        instancePath.lineTo(42.834522f, 12.0f);
        instancePath.close();
        instancePath.moveTo(34.667442f, 20.4f);
        path2.cubicTo(38.549126f, 24.392387f, 40.95f, 29.907822f, 40.95f, 36.0f);
        path2.cubicTo(40.95f, 42.09218f, 38.549126f, 47.607613f, 34.667442f, 51.6f);
        instancePath.lineTo(31.167261f, 48.0f);
        Path path3 = instancePath;
        path3.cubicTo(34.153175f, 44.928932f, 36.0f, 40.68629f, 36.0f, 36.0f);
        path3.cubicTo(36.0f, 31.31371f, 34.153175f, 27.071068f, 31.167261f, 24.0f);
        instancePath.lineTo(34.667442f, 20.4f);
        instancePath.close();
        instancePath.moveTo(26.500357f, 28.8f);
        path3.cubicTo(28.291904f, 30.642641f, 29.4f, 33.188225f, 29.4f, 36.0f);
        path3.cubicTo(29.4f, 38.811775f, 28.291904f, 41.35736f, 26.500357f, 43.2f);
        instancePath.lineTo(19.5f, 36.0f);
        instancePath.lineTo(26.500357f, 28.8f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
