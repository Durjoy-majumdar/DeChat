package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_finder_guarantee */
public class icons_outlined_finder_guarantee extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(19.085281f, 11.3f);
                instancePath.lineTo(20.114f, 13.785f);
                instancePath.lineTo(22.6f, 14.814718f);
                instancePath.lineTo(21.57f, 17.3f);
                instancePath.lineTo(22.6f, 19.785282f);
                instancePath.lineTo(20.114f, 20.815f);
                instancePath.lineTo(19.085281f, 23.3f);
                instancePath.lineTo(16.601f, 22.27f);
                instancePath.lineTo(14.114718f, 23.3f);
                instancePath.lineTo(13.085f, 20.814f);
                instancePath.lineTo(10.6f, 19.785282f);
                instancePath.lineTo(11.629f, 17.3f);
                instancePath.lineTo(10.6f, 14.814718f);
                instancePath.lineTo(13.085f, 13.785f);
                instancePath.lineTo(14.114718f, 11.3f);
                instancePath.lineTo(16.6f, 12.329f);
                instancePath.lineTo(19.085281f, 11.3f);
                instancePath.close();
                instancePath.moveTo(10.9f, 2.0f);
                instancePath.cubicTo(13.094873f, 2.0f, 14.888303f, 3.7272098f, 14.99498f, 5.895662f);
                instancePath.lineTo(15.0f, 6.1002073f);
                instancePath.lineTo(15.0f, 7.810186f);
                instancePath.cubicTo(15.0f, 8.378009f, 14.8549595f, 9.064487f, 14.619086f, 9.721629f);
                instancePath.lineTo(12.666573f, 9.722405f);
                instancePath.cubicTo(12.936394f, 9.18022f, 13.148006f, 8.503905f, 13.1917f, 7.9933066f);
                instancePath.lineTo(13.2f, 7.810186f);
                instancePath.lineTo(13.2f, 6.1002073f);
                Path path = instancePath;
                path.cubicTo(13.2f, 4.8308916f, 12.169283f, 3.8f, 10.9f, 3.8f);
                path.cubicTo(9.684916f, 3.8f, 8.686417f, 4.7475257f, 8.605318f, 5.9423842f);
                instancePath.lineTo(8.6f, 6.0995803f);
                instancePath.lineTo(8.6f, 7.8092904f);
                instancePath.cubicTo(8.6f, 8.490754f, 8.986784f, 9.600282f, 9.421697f, 10.211891f);
                instancePath.lineTo(9.531231f, 10.353884f);
                instancePath.lineTo(9.892763f, 10.782385f);
                instancePath.cubicTo(10.038452f, 10.95506f, 10.162149f, 11.135617f, 10.264423f, 11.321381f);
                instancePath.lineTo(10.338748f, 14.021461f);
                instancePath.cubicTo(10.08699f, 14.52508f, 9.680304f, 14.967156f, 9.132157f, 15.284082f);
                instancePath.lineTo(8.919998f, 15.396938f);
                instancePath.lineTo(3.259645f, 18.159128f);
                instancePath.cubicTo(3.2344224f, 18.171436f, 3.1473832f, 18.305244f, 3.1135764f, 18.376564f);
                instancePath.lineTo(3.105f, 18.399f);
                instancePath.lineTo(8.999f, 18.399f);
                instancePath.lineTo(8.999f, 20.2f);
                instancePath.lineTo(2.4014297f, 20.2f);
                instancePath.cubicTo(1.8344731f, 20.2f, 1.3663678f, 19.774776f, 1.3064736f, 19.221884f);
                instancePath.lineTo(1.3f, 19.101562f);
                instancePath.lineTo(1.3f, 18.415462f);
                instancePath.cubicTo(1.3f, 17.740154f, 1.7531078f, 16.969309f, 2.3420715f, 16.611605f);
                instancePath.lineTo(2.4702418f, 16.541462f);
                instancePath.lineTo(8.130595f, 13.779273f);
                instancePath.cubicTo(8.852521f, 13.426981f, 9.045517f, 12.683131f, 8.601926f, 12.053035f);
                instancePath.lineTo(8.5170145f, 11.943125f);
                instancePath.lineTo(8.155482f, 11.514624f);
                instancePath.cubicTo(7.451301f, 10.680003f, 6.8761177f, 9.176112f, 6.8069706f, 8.032833f);
                instancePath.lineTo(6.8f, 7.8092904f);
                instancePath.lineTo(6.8f, 6.0995803f);
                instancePath.cubicTo(6.8f, 3.8374517f, 8.63812f, 2.0f, 10.9f, 2.0f);
                instancePath.close();
                instancePath.moveTo(18.629467f, 15.427956f);
                instancePath.lineTo(16.01531f, 18.04132f);
                instancePath.lineTo(14.67788f, 16.704155f);
                instancePath.lineTo(13.852379f, 17.529655f);
                instancePath.lineTo(16.015574f, 19.692852f);
                instancePath.lineTo(19.45497f, 16.253456f);
                instancePath.lineTo(18.629467f, 15.427956f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
