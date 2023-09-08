package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_service_bubble_logo */
public class app_brand_service_bubble_logo extends C24542c {
    private final int height = 30;
    private final int width = 30;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 30;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                instancePaint3.setColor(-9074981);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -350.0f, 0.0f, 1.0f, -661.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(372.0f, 661.0f);
                Path path = instancePath;
                path.cubicTo(369.8465f, 661.0f, 368.307f, 661.45575f, 367.0f, 662.0f);
                path.cubicTo(364.6025f, 663.65375f, 363.0f, 666.1686f, 363.0f, 669.0f);
                instancePath.lineTo(363.0f, 681.0f);
                Path path2 = instancePath;
                path2.cubicTo(363.0f, 683.11066f, 360.985f, 684.85187f, 359.0f, 685.0f);
                path2.cubicTo(356.0145f, 684.85187f, 354.0f, 683.11066f, 354.0f, 681.0f);
                path2.cubicTo(354.0f, 679.4344f, 355.023f, 678.1158f, 357.0f, 677.0f);
                path2.cubicTo(356.6145f, 677.43445f, 356.723f, 677.39087f, 357.0f, 677.0f);
                path2.cubicTo(357.769f, 676.9636f, 358.5705f, 676.2336f, 359.0f, 675.0f);
                path2.cubicTo(359.3075f, 674.1341f, 358.4895f, 673.1199f, 357.0f, 673.0f);
                path2.cubicTo(356.6805f, 673.1199f, 356.3145f, 673.1831f, 356.0f, 673.0f);
                path2.cubicTo(355.96f, 673.2977f, 355.9585f, 673.2982f, 356.0f, 673.0f);
                path2.cubicTo(353.863f, 673.922f, 352.1155f, 675.2888f, 351.0f, 677.0f);
                path2.cubicTo(350.389f, 678.2278f, 350.0f, 679.5526f, 350.0f, 681.0f);
                path2.cubicTo(350.0f, 685.3947f, 353.813f, 689.0f, 359.0f, 689.0f);
                path2.cubicTo(360.1535f, 689.0f, 361.693f, 688.54425f, 363.0f, 688.0f);
                path2.cubicTo(365.3975f, 686.34625f, 367.0f, 683.8314f, 367.0f, 681.0f);
                instancePath.lineTo(367.0f, 669.0f);
                Path path3 = instancePath;
                path3.cubicTo(367.0f, 666.88934f, 369.0145f, 665.14813f, 372.0f, 665.0f);
                path3.cubicTo(373.985f, 665.14813f, 376.0f, 666.88934f, 376.0f, 669.0f);
                path3.cubicTo(376.0f, 670.631f, 374.8905f, 672.0009f, 373.0f, 673.0f);
                path3.cubicTo(372.2775f, 672.9576f, 371.438f, 673.7265f, 371.0f, 675.0f);
                path3.cubicTo(370.681f, 675.88306f, 371.495f, 676.8931f, 373.0f, 677.0f);
                path3.cubicTo(373.263f, 676.8931f, 373.593f, 676.835f, 374.0f, 677.0f);
                path3.cubicTo(373.967f, 676.72565f, 374.019f, 676.70905f, 374.0f, 677.0f);
                path3.cubicTo(376.152f, 676.0661f, 377.889f, 674.7034f, 379.0f, 673.0f);
                path3.cubicTo(379.611f, 671.77277f, 380.0f, 670.4474f, 380.0f, 669.0f);
                path3.cubicTo(380.0f, 664.6053f, 376.187f, 661.0f, 372.0f, 661.0f);
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
