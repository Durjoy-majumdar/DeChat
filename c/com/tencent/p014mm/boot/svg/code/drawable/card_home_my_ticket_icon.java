package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.card_home_my_ticket_icon */
public class card_home_my_ticket_icon extends C24542c {
    private final int height = 48;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 66;
        }
        if (i2 == 1) {
            return 48;
        }
        if (i2 == 2) {
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
            instancePaint3.setColor(-16896);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(1.492238E-12f, 4.7575727f);
            instancePath.lineTo(1.4921397E-12f, 1.44f);
            instancePath.lineTo(1.4923618E-12f, 1.44f);
            instancePath.cubicTo(1.4922644E-12f, 0.64470994f, 0.64470994f, 5.0310737E-15f, 1.44f, 4.8849813E-15f);
            instancePath.lineTo(1.44f, 7.1054274E-15f);
            instancePath.lineTo(64.185f, 7.1054274E-15f);
            instancePath.lineTo(64.185f, 7.327472E-15f);
            instancePath.cubicTo(64.98029f, 7.18138E-15f, 65.625f, 0.64470994f, 65.625f, 1.44f);
            instancePath.lineTo(65.625f, 4.7563457f);
            Path path = instancePath;
            path.cubicTo(63.938255f, 4.842435f, 62.5987f, 6.156979f, 62.5987f, 7.7659883f);
            path.cubicTo(62.5987f, 9.374997f, 63.938255f, 10.689542f, 65.625f, 10.775631f);
            instancePath.lineTo(65.625f, 15.712849f);
            Path path2 = instancePath;
            path2.cubicTo(63.938255f, 15.798938f, 62.5987f, 17.113482f, 62.5987f, 18.72249f);
            path2.cubicTo(62.5987f, 20.331501f, 63.938255f, 21.646044f, 65.625f, 21.732134f);
            instancePath.lineTo(65.625f, 26.669352f);
            Path path3 = instancePath;
            path3.cubicTo(63.938255f, 26.75544f, 62.5987f, 28.069984f, 62.5987f, 29.678993f);
            path3.cubicTo(62.5987f, 31.288002f, 63.938255f, 32.602547f, 65.625f, 32.688637f);
            instancePath.lineTo(65.625f, 37.625854f);
            Path path4 = instancePath;
            path4.cubicTo(63.938255f, 37.71194f, 62.5987f, 39.026485f, 62.5987f, 40.635494f);
            path4.cubicTo(62.5987f, 42.244507f, 63.938255f, 43.559048f, 65.625f, 43.645138f);
            instancePath.lineTo(65.625f, 46.442352f);
            instancePath.cubicTo(65.625f, 47.237644f, 64.98029f, 47.882355f, 64.185f, 47.882355f);
            instancePath.lineTo(1.44f, 47.882355f);
            instancePath.lineTo(1.44f, 47.882355f);
            instancePath.cubicTo(0.64470994f, 47.882355f, 1.4935694E-12f, 47.237644f, 1.493472E-12f, 46.442352f);
            instancePath.lineTo(1.4933892E-12f, 43.643913f);
            Path path5 = instancePath;
            path5.cubicTo(1.6761057f, 43.547302f, 3.0037231f, 42.23732f, 3.0037231f, 40.635494f);
            path5.cubicTo(3.0037231f, 39.033672f, 1.6761057f, 37.72369f, 1.5209084E-12f, 37.62708f);
            instancePath.lineTo(1.4930648E-12f, 32.68741f);
            Path path6 = instancePath;
            path6.cubicTo(1.6761057f, 32.5908f, 3.0037231f, 31.280817f, 3.0037231f, 29.678993f);
            path6.cubicTo(3.0037231f, 28.07717f, 1.6761057f, 26.767185f, 1.5221574E-12f, 26.670578f);
            instancePath.lineTo(1.4927405E-12f, 21.730906f);
            Path path7 = instancePath;
            path7.cubicTo(1.6761057f, 21.634298f, 3.0037231f, 20.324316f, 3.0037231f, 18.72249f);
            path7.cubicTo(3.0037231f, 17.120667f, 1.6761057f, 15.810683f, 1.5217966E-12f, 15.714075f);
            instancePath.lineTo(1.4924161E-12f, 10.774404f);
            Path path8 = instancePath;
            path8.cubicTo(1.6761057f, 10.677795f, 3.0037231f, 9.367813f, 3.0037231f, 7.7659883f);
            path8.cubicTo(3.0037231f, 6.1641636f, 1.6761057f, 4.854181f, 1.5213941E-12f, 4.7575727f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(28.410238f, 24.652752f);
            Path path9 = instancePath2;
            path9.cubicTo(30.052023f, 27.348827f, 27.201754f, 28.510988f, 25.74895f, 29.66224f);
            path9.cubicTo(20.890003f, 31.898764f, 18.652174f, 32.92579f, 18.652174f, 33.83681f);
            instancePath2.lineTo(18.652174f, 36.25749f);
            instancePath2.lineTo(18.652174f, 36.25749f);
            instancePath2.cubicTo(18.652174f, 36.76503f, 19.063616f, 37.17647f, 19.571156f, 37.17647f);
            instancePath2.lineTo(45.233192f, 37.17647f);
            instancePath2.lineTo(45.233192f, 37.17647f);
            instancePath2.cubicTo(45.74073f, 37.17647f, 46.152172f, 36.76503f, 46.152172f, 36.25749f);
            instancePath2.lineTo(46.152172f, 33.83681f);
            Path path10 = instancePath2;
            path10.cubicTo(46.152172f, 32.92579f, 43.914345f, 31.898764f, 39.0554f, 29.66224f);
            path10.cubicTo(37.602592f, 28.510988f, 34.752323f, 27.348827f, 36.394108f, 24.652752f);
            path10.cubicTo(37.99367f, 22.651222f, 39.1833f, 21.783226f, 39.0554f, 17.973434f);
            path10.cubicTo(39.1833f, 14.838071f, 36.5257f, 11.294118f, 32.845722f, 11.294118f);
            path10.cubicTo(28.27865f, 11.294118f, 25.62105f, 14.838071f, 25.74895f, 17.973434f);
            path10.cubicTo(25.62105f, 21.783226f, 26.810677f, 22.651222f, 28.410238f, 24.652752f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
