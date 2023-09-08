package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.video_icon_in_gird */
public class video_icon_in_gird extends C24542c {
    private final int height = 80;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 80;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 19.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.6294041f);
                instancePath.lineTo(44.081802f, 0.6294054f);
                instancePath.lineTo(44.081802f, 41.746845f);
                instancePath.lineTo(0.0f, 41.74684f);
                instancePath.lineTo(0.0f, 0.6294041f);
                instancePath.close();
                instancePath.moveTo(5.0f, 5.629404f);
                instancePath.lineTo(39.0f, 5.6294045f);
                instancePath.lineTo(39.0f, 36.629406f);
                instancePath.lineTo(5.0f, 36.629402f);
                instancePath.lineTo(5.0f, 5.629404f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 47.88276f, 0.0f, 1.0f, 1.922839f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(17.238659f, 3.8456779f);
                instancePath2.lineTo(21.276552f, 3.8456774f);
                instancePath2.lineTo(21.276552f, 34.611103f);
                instancePath2.lineTo(17.238659f, 34.611107f);
                instancePath2.lineTo(17.238659f, 3.8456779f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath3 = C24542c.instancePath(looper);
                instancePath3.moveTo(0.2687733f, 13.459874f);
                instancePath3.lineTo(4.221509f, 13.459874f);
                instancePath3.lineTo(4.221509f, 24.99691f);
                instancePath3.lineTo(0.2687733f, 24.99691f);
                instancePath3.lineTo(0.2687733f, 13.459874f);
                instancePath3.close();
                WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint6);
                canvas.restore();
                canvas.save();
                Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath4 = C24542c.instancePath(looper);
                instancePath4.moveTo(0.0f, 13.459874f);
                instancePath4.lineTo(21.388449f, 0.0f);
                instancePath4.lineTo(21.388449f, 5.171436f);
                instancePath4.lineTo(0.0f, 18.63131f);
                instancePath4.lineTo(0.0f, 13.459874f);
                instancePath4.close();
                WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
                canvas.drawPath(instancePath4, instancePaint7);
                canvas.restore();
                canvas.save();
                Paint instancePaint8 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath5 = C24542c.instancePath(looper);
                instancePath5.moveTo(21.388449f, 33.285347f);
                instancePath5.lineTo(0.0f, 19.825474f);
                instancePath5.lineTo(0.0f, 24.99691f);
                instancePath5.lineTo(21.388449f, 38.456783f);
                instancePath5.lineTo(21.388449f, 33.285347f);
                instancePath5.close();
                WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
                canvas.drawPath(instancePath5, instancePaint8);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
