package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_filled_food */
public class finder_icons_filled_food extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(48.0f, 6.0f);
        Path path = instancePath;
        path.cubicTo(52.970562f, 6.0f, 57.0f, 12.54353f, 57.0f, 20.615385f);
        path.cubicTo(57.0f, 26.726633f, 54.69029f, 31.961832f, 51.411133f, 34.14448f);
        instancePath.lineTo(53.501728f, 59.867413f);
        Path path2 = instancePath;
        path2.cubicTo(53.754936f, 62.98384f, 51.496998f, 65.72074f, 48.458477f, 65.98044f);
        path2.cubicTo(48.30598f, 65.99348f, 48.153023f, 66.0f, 48.0f, 66.0f);
        path2.cubicTo(44.950947f, 66.0f, 42.479202f, 63.464878f, 42.479202f, 60.337643f);
        instancePath.lineTo(42.48397f, 60.102325f);
        instancePath.lineTo(42.48397f, 60.102325f);
        instancePath.lineTo(44.59192f, 34.14651f);
        Path path3 = instancePath;
        path3.cubicTo(41.311146f, 31.96508f, 39.0f, 26.728529f, 39.0f, 20.615385f);
        path3.cubicTo(39.0f, 12.54353f, 43.029438f, 6.0f, 48.0f, 6.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(30.71397f, 6.0f);
        instancePath2.cubicTo(31.547329f, 6.0f, 32.231766f, 6.6788335f, 32.26397f, 7.537312f);
        instancePath2.lineTo(32.996647f, 27.066935f);
        instancePath2.cubicTo(33.056046f, 28.65031f, 32.323395f, 30.154406f, 31.056025f, 31.050928f);
        instancePath2.lineTo(27.368408f, 33.658463f);
        instancePath2.lineTo(29.487246f, 59.867413f);
        Path path4 = instancePath2;
        path4.cubicTo(29.73916f, 62.98384f, 27.492771f, 65.72074f, 24.469793f, 65.98044f);
        path4.cubicTo(24.318079f, 65.99348f, 24.165903f, 66.0f, 24.013662f, 66.0f);
        path4.cubicTo(20.980206f, 66.0f, 18.521105f, 63.464878f, 18.521105f, 60.337643f);
        instancePath2.lineTo(18.525848f, 60.102325f);
        instancePath2.lineTo(18.525848f, 60.102325f);
        instancePath2.lineTo(20.65592f, 33.68f);
        instancePath2.lineTo(16.943102f, 31.051023f);
        instancePath2.cubicTo(15.676247f, 30.15441f, 14.943968f, 28.650635f, 15.003355f, 27.067648f);
        instancePath2.lineTo(15.736055f, 7.537312f);
        Path path5 = instancePath2;
        path5.cubicTo(15.768262f, 6.6788335f, 16.452698f, 6.0f, 17.286057f, 6.0f);
        path5.cubicTo(18.117031f, 6.0f, 18.79721f, 6.6815224f, 18.820866f, 7.537838f);
        instancePath2.lineTo(19.179539f, 20.521557f);
        Path path6 = instancePath2;
        path6.cubicTo(19.20225f, 21.34367f, 19.855263f, 21.997972f, 20.653048f, 21.997972f);
        path6.cubicTo(21.450737f, 21.997972f, 22.103586f, 21.343567f, 22.125967f, 20.52154f);
        instancePath2.lineTo(22.479464f, 7.537856f);
        Path path7 = instancePath2;
        path7.cubicTo(22.502775f, 6.68163f, 23.182785f, 6.0f, 24.013662f, 6.0f);
        path7.cubicTo(24.844635f, 6.0f, 25.524817f, 6.6815224f, 25.548471f, 7.537838f);
        instancePath2.lineTo(25.907623f, 20.538906f);
        Path path8 = instancePath2;
        path8.cubicTo(25.930067f, 21.351358f, 26.575407f, 21.997972f, 27.363815f, 21.997972f);
        path8.cubicTo(28.152224f, 21.997972f, 28.797564f, 21.351358f, 28.820007f, 20.538906f);
        instancePath2.lineTo(29.179161f, 7.537838f);
        instancePath2.cubicTo(29.202816f, 6.6815224f, 29.882998f, 6.0f, 30.71397f, 6.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
