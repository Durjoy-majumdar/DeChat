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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.live_user_level_1_9 */
public class live_user_level_1_9 extends C24542c {
    private final int height = 24;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 16;
        }
        if (i2 == 1) {
            return 24;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 10.828426f, 0.70710677f, 0.70710677f, -2.1421351f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(8.0f, 14.4f);
        instancePath.lineTo(4.6876235f, 15.8386135f);
        Path path = instancePath;
        path.cubicTo(4.4849954f, 15.926618f, 4.249391f, 15.833697f, 4.1613865f, 15.631068f);
        path.cubicTo(4.117241f, 15.529425f, 4.117241f, 15.414021f, 4.1613865f, 15.312377f);
        instancePath.lineTo(5.6f, 12.0f);
        instancePath.lineTo(5.6f, 12.0f);
        instancePath.lineTo(4.1613865f, 8.687623f);
        Path path2 = instancePath;
        path2.cubicTo(4.0733824f, 8.484995f, 4.166303f, 8.249391f, 4.3689313f, 8.1613865f);
        path2.cubicTo(4.470576f, 8.117241f, 4.585979f, 8.117241f, 4.6876235f, 8.1613865f);
        instancePath.lineTo(8.0f, 9.6f);
        instancePath.lineTo(8.0f, 9.6f);
        instancePath.lineTo(11.312377f, 8.1613865f);
        Path path3 = instancePath;
        path3.cubicTo(11.515005f, 8.073382f, 11.750609f, 8.166303f, 11.8386135f, 8.368932f);
        path3.cubicTo(11.882759f, 8.470575f, 11.882759f, 8.585979f, 11.8386135f, 8.687623f);
        instancePath.lineTo(10.4f, 12.0f);
        instancePath.lineTo(10.4f, 12.0f);
        instancePath.lineTo(11.8386135f, 15.312377f);
        Path path4 = instancePath;
        path4.cubicTo(11.926618f, 15.515005f, 11.833697f, 15.750609f, 11.631068f, 15.8386135f);
        path4.cubicTo(11.529425f, 15.882759f, 11.414021f, 15.882759f, 11.312377f, 15.8386135f);
        instancePath.lineTo(8.0f, 14.4f);
        instancePath.lineTo(8.0f, 14.4f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-2565928);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(16.0f, 0.0f);
        instancePath2.lineTo(16.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath2, C24542c.instancePaint(instancePaint4, looper));
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
