package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.live_user_level_20_29 */
public class live_user_level_20_29 extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(6.6f, 15.599999f);
        Path path = instancePath;
        instancePath.cubicTo(7.5941124f, 15.599999f, 8.4f, 16.405888f, 8.4f, 17.4f);
        Path path2 = path;
        path2.cubicTo(8.4f, 18.394112f, 7.5941124f, 19.199999f, 6.6f, 19.199999f);
        path2.cubicTo(5.6058874f, 19.199999f, 4.8f, 18.394112f, 4.8f, 17.4f);
        path2.cubicTo(4.8f, 16.405888f, 5.6058874f, 15.599999f, 6.6f, 15.599999f);
        path.close();
        canvas.drawPath(path2, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(17.4f, 15.599999f);
        Path path3 = instancePath2;
        instancePath2.cubicTo(18.394112f, 15.599999f, 19.199999f, 16.405888f, 19.199999f, 17.4f);
        Path path4 = path3;
        path4.cubicTo(19.199999f, 18.394112f, 18.394112f, 19.199999f, 17.4f, 19.199999f);
        path4.cubicTo(16.405888f, 19.199999f, 15.599999f, 18.394112f, 15.599999f, 17.4f);
        path4.cubicTo(15.599999f, 16.405888f, 16.405888f, 15.599999f, 17.4f, 15.599999f);
        path3.close();
        canvas.drawPath(path3, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 12.0f, 0.70710677f, 0.70710677f, -4.970562f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(12.0f, 14.4f);
        instancePath3.lineTo(8.687623f, 15.8386135f);
        Path path5 = instancePath3;
        path5.cubicTo(8.484995f, 15.926618f, 8.249391f, 15.833697f, 8.1613865f, 15.631068f);
        path5.cubicTo(8.117241f, 15.529425f, 8.117241f, 15.414021f, 8.1613865f, 15.312377f);
        instancePath3.lineTo(9.6f, 12.0f);
        instancePath3.lineTo(9.6f, 12.0f);
        instancePath3.lineTo(8.1613865f, 8.687623f);
        path5.cubicTo(8.073382f, 8.484995f, 8.166303f, 8.249391f, 8.368932f, 8.1613865f);
        path5.cubicTo(8.470575f, 8.117241f, 8.585979f, 8.117241f, 8.687623f, 8.1613865f);
        instancePath3.lineTo(12.0f, 9.6f);
        instancePath3.lineTo(12.0f, 9.6f);
        instancePath3.lineTo(15.312377f, 8.1613865f);
        path5.cubicTo(15.515005f, 8.073382f, 15.750609f, 8.166303f, 15.8386135f, 8.368932f);
        path5.cubicTo(15.882759f, 8.470575f, 15.882759f, 8.585979f, 15.8386135f, 8.687623f);
        instancePath3.lineTo(14.4f, 12.0f);
        instancePath3.lineTo(14.4f, 12.0f);
        instancePath3.lineTo(15.8386135f, 15.312377f);
        path5.cubicTo(15.926618f, 15.515005f, 15.833697f, 15.750609f, 15.631068f, 15.8386135f);
        path5.cubicTo(15.529425f, 15.882759f, 15.414021f, 15.882759f, 15.312377f, 15.8386135f);
        instancePath3.lineTo(12.0f, 14.4f);
        instancePath3.lineTo(12.0f, 14.4f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(6.6f, 4.8f);
        Path path6 = instancePath4;
        path6.cubicTo(7.5941124f, 4.8f, 8.4f, 5.6058874f, 8.4f, 6.6f);
        path6.cubicTo(8.4f, 7.5941124f, 7.5941124f, 8.4f, 6.6f, 8.4f);
        path6.cubicTo(5.6058874f, 8.4f, 4.8f, 7.5941124f, 4.8f, 6.6f);
        path6.cubicTo(4.8f, 5.6058874f, 5.6058874f, 4.8f, 6.6f, 4.8f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-1);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(17.4f, 4.8f);
        Path path7 = instancePath5;
        path7.cubicTo(18.394112f, 4.8f, 19.199999f, 5.6058874f, 19.199999f, 6.6f);
        path7.cubicTo(19.199999f, 7.5941124f, 18.394112f, 8.4f, 17.4f, 8.4f);
        path7.cubicTo(16.405888f, 8.4f, 15.599999f, 7.5941124f, 15.599999f, 6.6f);
        path7.cubicTo(15.599999f, 5.6058874f, 16.405888f, 4.8f, 17.4f, 4.8f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
