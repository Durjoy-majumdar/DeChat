package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_wechatpay */
public class icons_outlined_wechatpay extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 == 2) {
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
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(30.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(46.568542f, 0.0f, 60.0f, 11.404438f, 60.0f, 25.472527f);
            path.cubicTo(60.0f, 39.540615f, 46.568542f, 50.945053f, 30.0f, 50.945053f);
            path.cubicTo(26.61305f, 50.945053f, 23.357191f, 50.468487f, 20.320362f, 49.59002f);
            instancePath.lineTo(11.421126f, 53.8527f);
            Path path2 = instancePath;
            path2.cubicTo(11.1579275f, 53.97877f, 10.863624f, 54.025394f, 10.574291f, 53.98685f);
            path2.cubicTo(9.753134f, 53.877464f, 9.176225f, 53.123825f, 9.285729f, 52.303555f);
            instancePath.lineTo(10.302671f, 44.68589f);
            Path path3 = instancePath;
            path3.cubicTo(3.989763f, 40.01606f, 0.0f, 33.139908f, 0.0f, 25.472527f);
            path3.cubicTo(0.0f, 11.404438f, 13.4314575f, 0.0f, 30.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(30.0f, 3.6f);
            Path path4 = instancePath;
            path4.cubicTo(15.301022f, 3.6f, 3.6f, 13.535152f, 3.6f, 25.472527f);
            path4.cubicTo(3.6f, 31.746346f, 6.8269978f, 37.636932f, 12.443596f, 41.791683f);
            instancePath.lineTo(14.152247f, 43.05562f);
            instancePath.lineTo(13.368248f, 48.928364f);
            instancePath.lineTo(20.002657f, 45.750523f);
            instancePath.lineTo(21.320723f, 46.1318f);
            Path path5 = instancePath;
            path5.cubicTo(24.084929f, 46.931404f, 27.006273f, 47.34505f, 30.0f, 47.34505f);
            path5.cubicTo(44.69898f, 47.34505f, 56.4f, 37.4099f, 56.4f, 25.472527f);
            path5.cubicTo(56.4f, 21.823044f, 55.306374f, 18.360697f, 53.3678f, 15.31216f);
            instancePath.lineTo(22.040222f, 34.05198f);
            instancePath.lineTo(21.820826f, 34.18168f);
            Path path6 = instancePath;
            path6.cubicTo(21.549904f, 34.319855f, 21.24491f, 34.401234f, 20.921633f, 34.401234f);
            path6.cubicTo(20.171196f, 34.401234f, 19.518824f, 33.979923f, 19.176432f, 33.357704f);
            instancePath.lineTo(19.045958f, 33.06609f);
            instancePath.lineTo(13.583479f, 20.840412f);
            Path path7 = instancePath;
            path7.cubicTo(13.524474f, 20.707321f, 13.487908f, 20.556429f, 13.487908f, 20.409775f);
            path7.cubicTo(13.487908f, 19.846895f, 13.935843f, 19.390827f, 14.4876585f, 19.390827f);
            path7.cubicTo(14.713704f, 19.390827f, 14.918973f, 19.466274f, 15.086844f, 19.59343f);
            instancePath.lineTo(21.531622f, 24.27364f);
            Path path8 = instancePath;
            path8.cubicTo(22.001163f, 24.587292f, 22.565445f, 24.772093f, 23.170448f, 24.772093f);
            path8.cubicTo(23.530293f, 24.772093f, 23.875177f, 24.704277f, 24.19513f, 24.58475f);
            instancePath.lineTo(51.22305f, 12.4838505f);
            instancePath.cubicTo(46.433304f, 7.118606f, 38.747524f, 3.6f, 30.0f, 3.6f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
