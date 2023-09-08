package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_eyes_off */
public class icons_outlined_eyes_off extends C24542c {
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(56.010414f, 50.919243f);
        instancePath.lineTo(64.27494f, 59.183765f);
        instancePath.lineTo(61.72935f, 61.72935f);
        instancePath.lineTo(11.545586f, 11.545585f);
        instancePath.lineTo(14.09117f, 9.0f);
        instancePath.lineTo(22.657404f, 17.566235f);
        Path path = instancePath;
        path.cubicTo(26.795906f, 15.908959f, 31.295248f, 15.0f, 36.0f, 15.0f);
        path.cubicTo(50.42337f, 15.0f, 62.91619f, 23.542883f, 69.0f, 36.0f);
        path.cubicTo(66.02669f, 42.08811f, 61.522564f, 47.241302f, 56.010414f, 50.919243f);
        instancePath.close();
        instancePath.moveTo(25.45887f, 20.3677f);
        instancePath.lineTo(30.449322f, 25.35815f);
        Path path2 = instancePath;
        path2.cubicTo(32.109215f, 24.490591f, 33.997314f, 24.0f, 36.0f, 24.0f);
        path2.cubicTo(42.62742f, 24.0f, 48.0f, 29.372583f, 48.0f, 36.0f);
        path2.cubicTo(48.0f, 38.002686f, 47.50941f, 39.890785f, 46.64185f, 41.55068f);
        instancePath.lineTo(53.409218f, 48.31805f);
        Path path3 = instancePath;
        path3.cubicTo(58.13192f, 45.318756f, 62.12102f, 41.10788f, 64.94362f, 36.0f);
        path3.cubicTo(59.058674f, 25.350376f, 48.102955f, 18.6f, 36.0f, 18.6f);
        path3.cubicTo(32.345703f, 18.6f, 28.795996f, 19.215393f, 25.45887f, 20.3677f);
        instancePath.close();
        instancePath.moveTo(43.913937f, 38.82277f);
        path3.cubicTo(44.228634f, 37.94056f, 44.399998f, 36.99029f, 44.399998f, 36.0f);
        path3.cubicTo(44.399998f, 31.360807f, 40.63919f, 27.599998f, 36.0f, 27.599998f);
        path3.cubicTo(35.009705f, 27.599998f, 34.059437f, 27.771364f, 33.17723f, 28.08606f);
        instancePath.lineTo(43.913937f, 38.82277f);
        instancePath.close();
        instancePath.moveTo(49.342594f, 54.433765f);
        path3.cubicTo(45.204094f, 56.09104f, 40.704754f, 57.0f, 36.0f, 57.0f);
        path3.cubicTo(21.576628f, 57.0f, 9.08381f, 48.45712f, 3.0f, 36.0f);
        path3.cubicTo(5.973314f, 29.911886f, 10.477438f, 24.7587f, 15.989586f, 21.080757f);
        instancePath.lineTo(18.59078f, 23.681952f);
        Path path4 = instancePath;
        path4.cubicTo(13.868081f, 26.681242f, 9.878979f, 30.89212f, 7.0563836f, 36.0f);
        path4.cubicTo(12.941325f, 46.649624f, 23.897047f, 53.4f, 36.0f, 53.4f);
        path4.cubicTo(39.654297f, 53.4f, 43.204006f, 52.784607f, 46.54113f, 51.6323f);
        instancePath.lineTo(49.342594f, 54.433765f);
        instancePath.close();
        instancePath.moveTo(25.35815f, 30.449322f);
        instancePath.lineTo(28.08606f, 33.17723f);
        Path path5 = instancePath;
        path5.cubicTo(27.771364f, 34.059437f, 27.599998f, 35.009705f, 27.599998f, 36.0f);
        path5.cubicTo(27.599998f, 40.63919f, 31.360807f, 44.399998f, 36.0f, 44.399998f);
        path5.cubicTo(36.99029f, 44.399998f, 37.94056f, 44.228634f, 38.82277f, 43.913937f);
        instancePath.lineTo(41.55068f, 46.64185f);
        Path path6 = instancePath;
        path6.cubicTo(39.890785f, 47.50941f, 38.002686f, 48.0f, 36.0f, 48.0f);
        path6.cubicTo(29.372583f, 48.0f, 24.0f, 42.62742f, 24.0f, 36.0f);
        path6.cubicTo(24.0f, 33.997314f, 24.490591f, 32.109215f, 25.35815f, 30.449322f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
