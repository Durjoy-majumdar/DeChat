package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_mvlist */
public class icons_filled_mvlist extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(15.75f, 14.685259f);
                Path path = instancePath;
                path.cubicTo(15.794264f, 14.685259f, 15.837733f, 14.697011f, 15.875968f, 14.719315f);
                instancePath.lineTo(21.129808f, 17.784056f);
                path.cubicTo(21.249071f, 17.853626f, 21.289356f, 18.006704f, 21.219786f, 18.125967f);
                path.cubicTo(21.198057f, 18.16322f, 21.16706f, 18.194216f, 21.129808f, 18.215944f);
                instancePath.lineTo(15.875968f, 21.280685f);
                path.cubicTo(15.756704f, 21.350256f, 15.603625f, 21.30997f, 15.534056f, 21.190708f);
                path.cubicTo(15.511752f, 21.152475f, 15.5f, 21.109005f, 15.5f, 21.064741f);
                instancePath.lineTo(15.5f, 14.935259f);
                path.cubicTo(15.5f, 14.797188f, 15.611929f, 14.685259f, 15.75f, 14.685259f);
                instancePath.close();
                instancePath.moveTo(12.0f, 16.5f);
                path.cubicTo(12.552284f, 16.5f, 13.0f, 16.947716f, 13.0f, 17.5f);
                path.cubicTo(13.0f, 18.052284f, 12.552284f, 18.5f, 12.0f, 18.5f);
                instancePath.lineTo(4.0f, 18.5f);
                Path path2 = instancePath;
                path2.cubicTo(3.4477153f, 18.5f, 3.0f, 18.052284f, 3.0f, 17.5f);
                path2.cubicTo(3.0f, 16.947716f, 3.4477153f, 16.5f, 4.0f, 16.5f);
                instancePath.lineTo(12.0f, 16.5f);
                instancePath.close();
                instancePath.moveTo(20.0f, 10.5f);
                path2.cubicTo(20.552284f, 10.5f, 21.0f, 10.947716f, 21.0f, 11.5f);
                path2.cubicTo(21.0f, 12.052284f, 20.552284f, 12.5f, 20.0f, 12.5f);
                instancePath.lineTo(4.0f, 12.5f);
                Path path3 = instancePath;
                path3.cubicTo(3.4477153f, 12.5f, 3.0f, 12.052284f, 3.0f, 11.5f);
                path3.cubicTo(3.0f, 10.947716f, 3.4477153f, 10.5f, 4.0f, 10.5f);
                instancePath.lineTo(20.0f, 10.5f);
                instancePath.close();
                instancePath.moveTo(20.0f, 4.5f);
                path3.cubicTo(20.552284f, 4.5f, 21.0f, 4.9477153f, 21.0f, 5.5f);
                path3.cubicTo(21.0f, 6.0522847f, 20.552284f, 6.5f, 20.0f, 6.5f);
                instancePath.lineTo(4.0f, 6.5f);
                Path path4 = instancePath;
                path4.cubicTo(3.4477153f, 6.5f, 3.0f, 6.0522847f, 3.0f, 5.5f);
                path4.cubicTo(3.0f, 4.9477153f, 3.4477153f, 4.5f, 4.0f, 4.5f);
                instancePath.lineTo(20.0f, 4.5f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
