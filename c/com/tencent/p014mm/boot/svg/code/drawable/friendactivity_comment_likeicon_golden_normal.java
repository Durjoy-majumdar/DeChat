package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_comment_likeicon_golden_normal */
public class friendactivity_comment_likeicon_golden_normal extends C24542c {
    private final int height = 48;
    private final int width = 52;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 52;
        }
        if (i == 1) {
            return 48;
        }
        if (i == 2) {
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
            instancePaint3.setColor(-7503);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(14.181818f, 0.0f);
            Path path = instancePath;
            path.cubicTo(7.043382f, 0.0f, 2.0274723E-7f, 6.794741f, 0.0f, 19.047619f);
            path.cubicTo(-2.0274723E-7f, 30.949684f, 12.336814f, 43.475533f, 26.0f, 48.0f);
            path.cubicTo(40.098804f, 43.475533f, 52.0f, 30.618835f, 52.0f, 19.047619f);
            path.cubicTo(52.0f, 6.463891f, 45.245247f, 1.657497E-7f, 37.81818f, 0.0f);
            path.cubicTo(31.004267f, -1.4875212E-7f, 28.267746f, 2.4507387f, 26.0f, 4.7619047f);
            path.cubicTo(23.75256f, 2.4507387f, 20.412228f, 0.0f, 14.181818f, 0.0f);
            instancePath.close();
            instancePath.moveTo(15.702877f, 6.3492064f);
            Path path2 = instancePath;
            path2.cubicTo(11.534709f, 6.3492064f, 6.3030305f, 10.766748f, 6.3030305f, 18.896448f);
            path2.cubicTo(6.3030305f, 27.026146f, 14.82103f, 37.12266f, 26.0f, 40.857143f);
            path2.cubicTo(37.535385f, 37.12266f, 45.696968f, 25.122057f, 45.696968f, 18.896448f);
            path2.cubicTo(45.696968f, 12.670838f, 41.74611f, 6.3492064f, 35.669422f, 6.3492064f);
            path2.cubicTo(30.0944f, 6.3492064f, 27.220886f, 12.0678f, 26.0f, 14.285714f);
            path2.cubicTo(24.840904f, 12.0678f, 19.871044f, 6.3492064f, 15.702877f, 6.3492064f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
