package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_filters */
public class icons_filled_filters extends C24542c {
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.0f, 9.0f);
            Path path = instancePath;
            path.cubicTo(45.112698f, 9.0f, 52.5f, 16.387302f, 52.5f, 25.5f);
            path.cubicTo(52.5f, 26.96958f, 52.306953f, 28.412785f, 51.933395f, 29.800037f);
            path.cubicTo(53.30406f, 30.165613f, 54.652054f, 30.71621f, 55.94134f, 31.46058f);
            path.cubicTo(63.83317f, 36.01693f, 66.53711f, 46.108173f, 61.980762f, 54.0f);
            path.cubicTo(57.42441f, 61.891827f, 47.33317f, 64.59577f, 39.44134f, 60.03942f);
            path.cubicTo(38.168823f, 59.30473f, 37.015408f, 58.41598f, 36.000526f, 57.398525f);
            path.cubicTo(34.9979f, 58.40363f, 33.847458f, 59.29533f, 32.55866f, 60.03942f);
            path.cubicTo(24.666828f, 64.59577f, 14.575587f, 61.891827f, 10.0192375f, 54.0f);
            path.cubicTo(5.4628887f, 46.108173f, 8.166829f, 36.01693f, 16.058657f, 31.46058f);
            path.cubicTo(17.332155f, 30.725327f, 18.679089f, 30.170908f, 20.067213f, 29.800909f);
            path.cubicTo(19.697054f, 28.430622f, 19.5f, 26.988323f, 19.5f, 25.5f);
            path.cubicTo(19.5f, 16.387302f, 26.887302f, 9.0f, 36.0f, 9.0f);
            instancePath.close();
            instancePath.moveTo(22.769762f, 35.361233f);
            instancePath.lineTo(22.706964f, 35.369072f);
            Path path2 = instancePath;
            path2.cubicTo(21.43808f, 35.564476f, 20.204403f, 35.995235f, 19.058657f, 36.656734f);
            path2.cubicTo(14.036585f, 39.55623f, 12.315895f, 45.97793f, 15.21539f, 51.0f);
            path2.cubicTo(18.114885f, 56.02207f, 24.536585f, 57.742764f, 29.558657f, 54.843266f);
            path2.cubicTo(34.128056f, 52.205124f, 35.9644f, 46.65112f, 34.074333f, 41.88853f);
            path2.cubicTo(29.453474f, 41.35135f, 25.4161f, 38.90592f, 22.769762f, 35.361233f);
            instancePath.close();
            instancePath.moveTo(52.94134f, 36.656734f);
            Path path3 = instancePath;
            path3.cubicTo(48.371662f, 34.018425f, 42.643154f, 35.205418f, 39.463787f, 39.22416f);
            path3.cubicTo(41.309498f, 43.49351f, 41.210495f, 48.21247f, 39.46412f, 52.276493f);
            path3.cubicTo(40.273495f, 53.301186f, 41.27709f, 54.171085f, 42.44134f, 54.843266f);
            path3.cubicTo(47.463417f, 57.742764f, 53.885117f, 56.02207f, 56.78461f, 51.0f);
            path3.cubicTo(59.684105f, 45.97793f, 57.963417f, 39.55623f, 52.94134f, 36.656734f);
            instancePath.close();
            instancePath.moveTo(36.0f, 15.0f);
            Path path4 = instancePath;
            path4.cubicTo(30.20101f, 15.0f, 25.5f, 19.70101f, 25.5f, 25.5f);
            path4.cubicTo(25.5f, 30.776478f, 29.392015f, 35.143925f, 34.46184f, 35.888138f);
            path4.cubicTo(37.23666f, 32.155037f, 41.373226f, 29.881166f, 45.766277f, 29.361673f);
            path4.cubicTo(46.24827f, 28.148956f, 46.5f, 26.844667f, 46.5f, 25.5f);
            path4.cubicTo(46.5f, 19.70101f, 41.79899f, 15.0f, 36.0f, 15.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
