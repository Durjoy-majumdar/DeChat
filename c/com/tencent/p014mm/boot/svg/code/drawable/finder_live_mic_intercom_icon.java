package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_mic_intercom_icon */
public class finder_live_mic_intercom_icon extends C24542c {
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(10.7668085f, 4.0802436f);
                instancePath.cubicTo(10.78734f, 4.121306f, 10.806451f, 4.1630626f, 10.824108f, 4.20544f);
                instancePath.lineTo(14.586214f, 13.234493f);
                Path path = instancePath;
                path.cubicTo(14.798631f, 13.744294f, 14.557553f, 14.329768f, 14.047752f, 14.542186f);
                path.cubicTo(14.025275f, 14.551551f, 14.002464f, 14.560092f, 13.979364f, 14.567792f);
                instancePath.lineTo(12.0f, 15.22758f);
                instancePath.lineTo(11.418852f, 18.71447f);
                Path path2 = instancePath;
                path2.cubicTo(11.237262f, 19.80401f, 10.206806f, 20.54005f, 9.117266f, 20.35846f);
                path2.cubicTo(8.959423f, 20.332153f, 8.805307f, 20.286997f, 8.658225f, 20.223963f);
                instancePath.lineTo(4.6060805f, 18.48733f);
                Path path3 = instancePath;
                path3.cubicTo(4.2383966f, 18.32975f, 4.0f, 17.968212f, 4.0f, 17.568184f);
                instancePath.lineTo(4.0f, 5.845614f);
                path3.cubicTo(4.0f, 5.466842f, 4.2140026f, 5.120579f, 4.5527864f, 4.9511867f);
                instancePath.lineTo(8.083528f, 3.1858165f);
                path3.cubicTo(9.071485f, 2.691838f, 10.27283f, 3.0922866f, 10.7668085f, 4.0802436f);
                instancePath.close();
                instancePath.moveTo(18.656855f, 7.060303f);
                instancePath.lineTo(18.798275f, 7.2017245f);
                Path path4 = instancePath;
                path4.cubicTo(20.32602f, 8.729468f, 21.2f, 10.795791f, 21.2f, 13.0f);
                path4.cubicTo(21.2f, 15.204209f, 20.32602f, 17.270533f, 18.798275f, 18.798275f);
                instancePath.lineTo(18.656855f, 18.939697f);
                instancePath.lineTo(17.525484f, 17.808327f);
                instancePath.lineTo(17.666904f, 17.666904f);
                Path path5 = instancePath;
                path5.cubicTo(18.906757f, 16.427052f, 19.6f, 14.762647f, 19.6f, 13.0f);
                path5.cubicTo(19.6f, 11.237353f, 18.906757f, 9.5729475f, 17.666904f, 8.333096f);
                instancePath.lineTo(17.525484f, 8.191674f);
                instancePath.lineTo(18.656855f, 7.060303f);
                instancePath.close();
                instancePath.moveTo(16.676956f, 9.040202f);
                instancePath.lineTo(16.818377f, 9.181623f);
                Path path6 = instancePath;
                path6.cubicTo(17.824408f, 10.1876545f, 18.4f, 11.548508f, 18.4f, 13.0f);
                path6.cubicTo(18.4f, 14.451492f, 17.824408f, 15.8123455f, 16.818377f, 16.818377f);
                instancePath.lineTo(16.676956f, 16.959799f);
                instancePath.lineTo(15.545585f, 15.828427f);
                instancePath.lineTo(15.687006f, 15.687006f);
                Path path7 = instancePath;
                path7.cubicTo(16.401245f, 14.972767f, 16.8f, 14.015393f, 16.8f, 13.0f);
                path7.cubicTo(16.8f, 11.984607f, 16.401245f, 11.027233f, 15.687006f, 10.312994f);
                instancePath.lineTo(15.545585f, 10.171573f);
                instancePath.lineTo(16.676956f, 9.040202f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
