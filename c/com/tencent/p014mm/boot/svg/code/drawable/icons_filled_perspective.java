package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_perspective */
public class icons_filled_perspective extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(1.7444222f, 13.075094f);
        instancePath.lineTo(2.900169f, 13.7084465f);
        instancePath.lineTo(2.8152144f, 13.817159f);
        Path path = instancePath;
        path.cubicTo(2.601401f, 14.107789f, 2.5f, 14.388497f, 2.5f, 14.662903f);
        path.cubicTo(2.5f, 15.848881f, 3.7140377f, 16.826565f, 7.0625525f, 17.677277f);
        path.cubicTo(8.15938f, 18.020527f, 9.721863f, 18.192152f, 11.75f, 18.192152f);
        path.cubicTo(13.778137f, 18.192152f, 15.34062f, 18.020527f, 16.437447f, 17.677277f);
        path.cubicTo(19.697308f, 16.950954f, 21.0f, 16.171692f, 21.0f, 14.985714f);
        path.cubicTo(21.0f, 14.763237f, 20.933401f, 14.2140045f, 20.794292f, 13.981349f);
        instancePath.lineTo(20.702078f, 13.840989f);
        instancePath.lineTo(21.921894f, 13.290846f);
        Path path2 = instancePath;
        path2.cubicTo(22.298481f, 13.817065f, 22.5f, 14.389988f, 22.5f, 14.985714f);
        path2.cubicTo(22.5f, 17.940617f, 17.644772f, 20.02143f, 11.75f, 20.02143f);
        path2.cubicTo(5.855228f, 20.02143f, 1.0f, 17.940617f, 1.0f, 14.985714f);
        path2.cubicTo(1.0f, 14.37469f, 1.2119075f, 13.788066f, 1.6069653f, 13.251075f);
        instancePath.lineTo(1.7444222f, 13.075094f);
        instancePath.close();
        instancePath.moveTo(13.605779f, 3.0f);
        path2.cubicTo(14.26852f, 3.0f, 14.805779f, 3.5372584f, 14.805779f, 4.2f);
        instancePath.lineTo(14.805779f, 4.2f);
        instancePath.lineTo(14.805779f, 11.2f);
        instancePath.cubicTo(14.805779f, 11.862741f, 14.26852f, 12.4f, 13.605779f, 12.4f);
        instancePath.lineTo(13.605779f, 12.4f);
        instancePath.lineTo(5.45f, 12.4f);
        instancePath.cubicTo(4.787258f, 12.4f, 4.25f, 11.862741f, 4.25f, 11.2f);
        instancePath.lineTo(4.25f, 11.2f);
        instancePath.lineTo(4.25f, 4.2f);
        instancePath.cubicTo(4.25f, 3.5372584f, 4.787258f, 3.0f, 5.45f, 3.0f);
        instancePath.lineTo(5.45f, 3.0f);
        instancePath.close();
        instancePath.moveTo(18.531435f, 4.155346f);
        Path path3 = instancePath;
        path3.cubicTo(18.897507f, 3.8614635f, 19.432507f, 3.9199853f, 19.726389f, 4.286058f);
        path3.cubicTo(19.847528f, 4.436956f, 19.913555f, 4.624671f, 19.913555f, 4.8181787f);
        instancePath.lineTo(19.913555f, 4.8181787f);
        instancePath.lineTo(19.913555f, 10.57694f);
        Path path4 = instancePath;
        path4.cubicTo(19.913555f, 11.046382f, 19.532997f, 11.42694f, 19.063555f, 11.42694f);
        path4.cubicTo(18.87039f, 11.42694f, 18.682983f, 11.361146f, 18.532211f, 11.240396f);
        instancePath.lineTo(18.532211f, 11.240396f);
        instancePath.lineTo(15.75f, 9.012193f);
        instancePath.lineTo(15.75f, 6.388275f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
