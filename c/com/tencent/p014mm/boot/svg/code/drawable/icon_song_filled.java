package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_song_filled */
public class icon_song_filled extends C24542c {
    private final int height = 28;
    private final int width = 28;

    public int doCommand(int i, Object... objArr) {
        int i2 = 28;
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
                instancePath.moveTo(13.391385f, 13.647132f);
                Path path = instancePath;
                path.cubicTo(14.090538f, 14.355895f, 14.909674f, 14.993623f, 15.832559f, 15.52645f);
                path.cubicTo(16.755602f, 16.05937f, 17.717628f, 16.44994f, 18.68118f, 16.701038f);
                instancePath.lineTo(12.830994f, 25.39198f);
                Path path2 = instancePath;
                path2.cubicTo(11.442651f, 26.07844f, 9.76069f, 25.509453f, 9.074228f, 24.121109f);
                path2.cubicTo(8.942947f, 23.855598f, 8.854767f, 23.571392f, 8.812546f, 23.27916f);
                instancePath.lineTo(8.789542f, 23.058645f);
                instancePath.lineTo(13.391385f, 13.647132f);
                instancePath.close();
                instancePath.moveTo(21.60756f, 5.5238566f);
                Path path3 = instancePath;
                path3.cubicTo(24.118595f, 6.973604f, 24.97894f, 10.184454f, 23.529192f, 12.69549f);
                path3.cubicTo(22.702835f, 14.1267805f, 21.304296f, 15.021762f, 19.789322f, 15.258317f);
                path3.cubicTo(18.742023f, 15.080867f, 17.671057f, 14.701897f, 16.649225f, 14.111942f);
                path3.cubicTo(15.627394f, 13.521988f, 14.763712f, 12.783988f, 14.08619f, 11.965796f);
                path3.cubicTo(13.533762f, 10.53544f, 13.609569f, 8.8767805f, 14.435925f, 7.4454904f);
                path3.cubicTo(15.885673f, 4.934454f, 19.096521f, 4.074109f, 21.60756f, 5.5238566f);
                instancePath.close();
                instancePath.moveTo(6.1101856f, 3.5035331f);
                instancePath.lineTo(6.2154303f, 3.5440981f);
                instancePath.lineTo(7.5789495f, 4.2650495f);
                Path path4 = instancePath;
                path4.cubicTo(7.915642f, 4.419798f, 8.302591f, 4.5403852f, 8.899452f, 4.4323163f);
                path4.cubicTo(9.266715f, 4.3339086f, 9.569953f, 4.2226405f, 9.809167f, 4.098513f);
                path4.cubicTo(9.899176f, 4.767828f, 9.797203f, 5.237121f, 9.503249f, 5.5063915f);
                path4.cubicTo(9.037343f, 5.9331756f, 8.516535f, 6.024547f, 7.9027996f, 5.9352307f);
                instancePath.lineTo(7.760335f, 5.908841f);
                instancePath.lineTo(9.616253f, 9.123384f);
                instancePath.lineTo(9.635493f, 9.164044f);
                instancePath.lineTo(9.684869f, 9.24223f);
                instancePath.cubicTo(10.302354f, 10.311747f, 9.976908f, 11.666911f, 8.966469f, 12.345084f);
                instancePath.lineTo(8.83081f, 12.429624f);
                Path path5 = instancePath;
                path5.cubicTo(7.714793f, 13.073956f, 6.287749f, 12.69158f, 5.643417f, 11.575564f);
                path5.cubicTo(4.9990845f, 10.459548f, 5.3814597f, 9.032504f, 6.497476f, 8.388171f);
                path5.cubicTo(6.733909f, 8.251667f, 6.9843016f, 8.161243f, 7.238254f, 8.114114f);
                instancePath.lineTo(5.250011f, 4.671943f);
                instancePath.cubicTo(4.87415f, 4.0209327f, 5.4475408f, 3.2965672f, 6.1101856f, 3.5035331f);
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
