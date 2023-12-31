package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_nearby */
public class default_nearby extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 192;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-14187817);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(192.0f, 0.0f);
        instancePath.lineTo(192.0f, 192.0f);
        instancePath.lineTo(0.0f, 192.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(57.156643f, 93.206894f);
        instancePath2.lineTo(57.156643f, 95.11902f);
        instancePath2.lineTo(57.156643f, 95.11902f);
        instancePath2.lineTo(30.811815f, 142.92213f);
        instancePath2.cubicTo(30.298296f, 145.2748f, 30.921196f, 147.50424f, 32.69359f, 148.65851f);
        instancePath2.lineTo(38.33891f, 152.48276f);
        Path path = instancePath2;
        path.cubicTo(39.435417f, 152.49355f, 40.410313f, 152.62009f, 42.102455f, 152.48276f);
        path.cubicTo(42.45778f, 152.0469f, 43.228115f, 151.43279f, 43.98423f, 150.57063f);
        instancePath2.lineTo(65.69183f, 111.18185f);
        instancePath2.lineTo(65.69183f, 111.18185f);
        instancePath2.lineTo(90.23086f, 150.57063f);
        Path path2 = instancePath2;
        path2.cubicTo(91.16817f, 151.4467f, 93.29706f, 152.75879f, 95.025116f, 152.65048f);
        path2.cubicTo(96.75389f, 152.76245f, 98.885605f, 151.45566f, 99.82381f, 150.63039f);
        instancePath2.lineTo(124.29417f, 111.057236f);
        instancePath2.lineTo(124.29417f, 111.057236f);
        instancePath2.lineTo(146.07043f, 150.57063f);
        Path path3 = instancePath2;
        path3.cubicTo(146.82886f, 151.43279f, 147.59917f, 152.0469f, 147.95221f, 152.48276f);
        path3.cubicTo(149.64471f, 152.62009f, 150.61957f, 152.49355f, 151.71576f, 152.48276f);
        instancePath2.lineTo(157.36108f, 148.65851f);
        Path path4 = instancePath2;
        path4.cubicTo(159.13347f, 147.50615f, 159.75635f, 145.27484f, 159.24284f, 142.92213f);
        instancePath2.lineTo(132.89803f, 95.11902f);
        instancePath2.lineTo(132.89803f, 95.11902f);
        instancePath2.lineTo(132.89803f, 93.206894f);
        instancePath2.lineTo(152.09935f, 93.206894f);
        path4.cubicTo(153.16206f, 93.206894f, 155.94975f, 90.2287f, 155.94975f, 89.090515f);
        instancePath2.lineTo(155.94975f, 80.85776f);
        instancePath2.cubicTo(155.94975f, 78.58552f, 154.22476f, 76.74138f, 152.09935f, 76.74138f);
        instancePath2.lineTo(34.662212f, 76.74138f);
        Path path5 = instancePath2;
        path5.cubicTo(33.599503f, 76.74138f, 30.811815f, 79.71958f, 30.811815f, 80.85776f);
        instancePath2.lineTo(30.811815f, 89.090515f);
        path5.cubicTo(30.811815f, 91.362755f, 32.536793f, 93.206894f, 34.662212f, 93.206894f);
        instancePath2.lineTo(57.156643f, 93.206894f);
        instancePath2.close();
        instancePath2.moveTo(73.62216f, 93.206894f);
        instancePath2.lineTo(73.62216f, 95.34885f);
        instancePath2.lineTo(95.089294f, 129.8068f);
        instancePath2.lineTo(95.089294f, 129.8068f);
        instancePath2.lineTo(116.4325f, 95.29082f);
        instancePath2.lineTo(116.4325f, 93.206894f);
        instancePath2.lineTo(73.62216f, 93.206894f);
        instancePath2.close();
        instancePath2.moveTo(66.26111f, 40.517242f);
        Path path6 = instancePath2;
        path6.cubicTo(73.57296f, 40.517242f, 80.20837f, 47.15091f, 80.20837f, 56.207912f);
        path6.cubicTo(80.20837f, 63.521507f, 73.57296f, 70.155174f, 66.26111f, 70.155174f);
        path6.cubicTo(57.2041f, 70.155174f, 50.57044f, 63.519764f, 50.57044f, 56.207912f);
        path6.cubicTo(50.57044f, 47.15091f, 57.2041f, 40.517242f, 66.26111f, 40.517242f);
        instancePath2.close();
        instancePath2.moveTo(125.536964f, 40.517242f);
        path6.cubicTo(132.84882f, 40.517242f, 139.48422f, 47.15091f, 139.48422f, 56.207912f);
        path6.cubicTo(139.48422f, 63.521507f, 132.84882f, 70.155174f, 125.536964f, 70.155174f);
        path6.cubicTo(116.479965f, 70.155174f, 109.8463f, 63.519764f, 109.8463f, 56.207912f);
        path6.cubicTo(109.8463f, 47.15091f, 116.479965f, 40.517242f, 125.536964f, 40.517242f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
