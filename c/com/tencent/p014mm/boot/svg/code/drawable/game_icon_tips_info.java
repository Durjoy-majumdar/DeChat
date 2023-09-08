package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import com.tencent.xweb.util.WXWebReporter;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_icon_tips_info */
public class game_icon_tips_info extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                canvas.saveLayerAlpha((RectF) null, WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED, 31);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(Integer.MIN_VALUE);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -16.0f, 0.0f, 1.0f, -104.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 80.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray3);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray4);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(10.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(15.522847f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
                path.cubicTo(20.0f, 15.522847f, 15.522847f, 20.0f, 10.0f, 20.0f);
                path.cubicTo(4.4771523f, 20.0f, 0.0f, 15.522847f, 0.0f, 10.0f);
                path.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(10.0f, 1.2f);
                Path path2 = instancePath;
                path2.cubicTo(5.139894f, 1.2f, 1.2f, 5.139894f, 1.2f, 10.0f);
                path2.cubicTo(1.2f, 14.8601055f, 5.139894f, 18.8f, 10.0f, 18.8f);
                path2.cubicTo(14.8601055f, 18.8f, 18.8f, 14.8601055f, 18.8f, 10.0f);
                path2.cubicTo(18.8f, 5.139894f, 14.8601055f, 1.2f, 10.0f, 1.2f);
                instancePath.close();
                instancePath.moveTo(10.599999f, 8.0f);
                instancePath.lineTo(10.599999f, 15.0f);
                instancePath.lineTo(9.4f, 15.0f);
                instancePath.lineTo(9.4f, 8.0f);
                instancePath.lineTo(10.599999f, 8.0f);
                instancePath.close();
                instancePath.moveTo(10.0f, 5.0f);
                Path path3 = instancePath;
                path3.cubicTo(10.552284f, 5.0f, 11.0f, 5.4477153f, 11.0f, 6.0f);
                path3.cubicTo(11.0f, 6.5522847f, 10.552284f, 7.0f, 10.0f, 7.0f);
                path3.cubicTo(9.447715f, 7.0f, 9.0f, 6.5522847f, 9.0f, 6.0f);
                path3.cubicTo(9.0f, 5.4477153f, 9.447715f, 5.0f, 10.0f, 5.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
