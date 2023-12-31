package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_outline_at */
public class finder_outline_at extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 24;
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
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(24.0f, 0.0f);
            instancePath.lineTo(24.0f, 24.0f);
            instancePath.lineTo(0.0f, 24.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-436207616);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(11.948242f, 20.896484f);
            instancePath2.cubicTo(13.387695f, 20.896484f, 14.655273f, 20.72461f, 15.525391f, 20.423828f);
            instancePath2.lineTo(15.525391f, 19.360352f);
            Path path = instancePath2;
            path.cubicTo(14.794922f, 19.65039f, 13.40918f, 19.833008f, 11.958984f, 19.833008f);
            path.cubicTo(7.46875f, 19.833008f, 4.1816406f, 16.889648f, 4.1816406f, 11.958984f);
            path.cubicTo(4.1816406f, 7.361328f, 7.3720703f, 4.0634766f, 11.744141f, 4.0634766f);
            path.cubicTo(16.180664f, 4.0634766f, 19.263672f, 6.8671875f, 19.263672f, 10.970703f);
            path.cubicTo(19.263672f, 13.860352f, 18.286133f, 15.503906f, 16.857422f, 15.503906f);
            path.cubicTo(15.879883f, 15.503906f, 15.364258f, 14.859375f, 15.364258f, 13.881836f);
            instancePath2.lineTo(15.364258f, 7.7373047f);
            instancePath2.lineTo(14.118164f, 7.7373047f);
            instancePath2.lineTo(14.118164f, 9.251953f);
            instancePath2.lineTo(14.042969f, 9.251953f);
            Path path2 = instancePath2;
            path2.cubicTo(13.645508f, 8.199219f, 12.560547f, 7.522461f, 11.314453f, 7.522461f);
            path2.cubicTo(9.123047f, 7.522461f, 7.5976562f, 9.348633f, 7.5976562f, 11.991211f);
            path2.cubicTo(7.5976562f, 14.698242f, 9.1015625f, 16.524414f, 11.314453f, 16.524414f);
            path2.cubicTo(12.646484f, 16.524414f, 13.645508f, 15.847656f, 14.128906f, 14.623047f);
            instancePath2.lineTo(14.204102f, 14.623047f);
            Path path3 = instancePath2;
            path3.cubicTo(14.365234f, 15.826172f, 15.375f, 16.59961f, 16.65332f, 16.59961f);
            path3.cubicTo(19.016602f, 16.59961f, 20.43457f, 14.408203f, 20.43457f, 10.9921875f);
            path3.cubicTo(20.43457f, 6.2333984f, 16.857422f, 3.0f, 11.84082f, 3.0f);
            path3.cubicTo(6.663086f, 3.0f, 3.0f, 6.6416016f, 3.0f, 11.916016f);
            path3.cubicTo(3.0f, 17.544922f, 6.7382812f, 20.896484f, 11.948242f, 20.896484f);
            instancePath2.close();
            instancePath2.moveTo(11.486328f, 15.353516f);
            Path path4 = instancePath2;
            path4.cubicTo(9.928711f, 15.353516f, 8.9296875f, 14.042969f, 8.9296875f, 12.0234375f);
            path4.cubicTo(8.9296875f, 9.993164f, 9.939453f, 8.671875f, 11.49707f, 8.671875f);
            path4.cubicTo(13.097656f, 8.671875f, 14.09668f, 9.950195f, 14.09668f, 11.969727f);
            path4.cubicTo(14.09668f, 14.021484f, 13.076172f, 15.353516f, 11.486328f, 15.353516f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
