package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_one_day_blue_video */
public class icons_outlined_one_day_blue_video extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            instancePaint3.setColor(-15683841);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(53.062035f, 26.549711f);
            Path path = instancePath;
            path.cubicTo(52.459232f, 25.463072f, 52.85146f, 24.09351f, 53.938095f, 23.490705f);
            path.cubicTo(55.024734f, 22.887901f, 56.3943f, 23.280127f, 56.997105f, 24.366766f);
            path.cubicTo(62.150024f, 33.65563f, 60.592953f, 45.350697f, 52.970562f, 52.97309f);
            path.cubicTo(43.59798f, 62.345673f, 28.40202f, 62.345673f, 19.029438f, 52.97309f);
            path.cubicTo(9.656855f, 43.600506f, 9.656855f, 28.404547f, 19.029438f, 19.031963f);
            path.cubicTo(26.651829f, 11.409573f, 38.346897f, 9.852504f, 47.63576f, 15.005424f);
            path.cubicTo(48.7224f, 15.608228f, 49.114624f, 16.97779f, 48.51182f, 18.06443f);
            path.cubicTo(47.90902f, 19.151068f, 46.539455f, 19.543295f, 45.452816f, 18.94049f);
            path.cubicTo(37.908688f, 14.755447f, 28.404543f, 16.02082f, 22.211418f, 22.213943f);
            path.cubicTo(14.596194f, 29.829168f, 14.596194f, 42.175884f, 22.211418f, 49.791107f);
            path.cubicTo(29.826641f, 57.406334f, 42.17336f, 57.406334f, 49.78858f, 49.791107f);
            path.cubicTo(55.98171f, 43.597984f, 57.247078f, 34.093838f, 53.062035f, 26.549711f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
