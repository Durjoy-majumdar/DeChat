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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatto_voice_playing_f2 */
public class chatto_voice_playing_f2 extends C24542c {
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
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 83.55f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(46.21744f, 20.4f);
        Path path = instancePath;
        path.cubicTo(50.09913f, 24.392387f, 52.5f, 29.907822f, 52.5f, 36.0f);
        path.cubicTo(52.5f, 42.09218f, 50.09913f, 47.607613f, 46.21744f, 51.6f);
        instancePath.lineTo(42.717262f, 48.0f);
        Path path2 = instancePath;
        path2.cubicTo(45.703175f, 44.928932f, 47.55f, 40.68629f, 47.55f, 36.0f);
        path2.cubicTo(47.55f, 31.31371f, 45.703175f, 27.071068f, 42.717262f, 24.0f);
        instancePath.lineTo(46.21744f, 20.4f);
        instancePath.close();
        instancePath.moveTo(38.050358f, 28.8f);
        path2.cubicTo(39.841904f, 30.642641f, 40.95f, 33.188225f, 40.95f, 36.0f);
        path2.cubicTo(40.95f, 38.811775f, 39.841904f, 41.35736f, 38.050358f, 43.2f);
        instancePath.lineTo(31.05f, 36.0f);
        instancePath.lineTo(38.050358f, 28.8f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
