package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mp_logo */
public class mp_logo extends C24542c {
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
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(16.288736f, 3.8258588f);
                Path path = instancePath2;
                path.cubicTo(15.286312f, 1.7646466f, 12.750555f, 4.042769E-4f, 9.879645f, -7.177199E-16f);
                path.cubicTo(8.373181f, -4.0380392E-4f, 6.071767f, 0.5167679f, 4.351969f, 2.5963638f);
                path.cubicTo(3.203484f, 3.9850507f, 2.8168173f, 5.6103034f, 3.0588377f, 7.2311115f);
                path.cubicTo(3.2251003f, 8.344646f, 3.8453023f, 9.813738f, 4.732777f, 10.743031f);
                path.cubicTo(5.0673223f, 8.387273f, 6.3081307f, 6.534546f, 7.934999f, 5.1727276f);
                path.cubicTo(10.872373f, 2.928687f, 14.008332f, 3.0557578f, 16.288736f, 3.8258588f);
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath3 = C24542c.instancePath(looper);
                instancePath3.moveTo(18.580696f, 7.3600206f);
                Path path2 = instancePath3;
                path2.cubicTo(16.783524f, 5.027697f, 13.676858f, 4.375172f, 10.872414f, 5.415172f);
                path2.cubicTo(10.962918f, 5.442445f, 11.053222f, 5.469313f, 11.143323f, 5.4998183f);
                path2.cubicTo(15.295444f, 6.914364f, 17.539484f, 11.418808f, 16.155645f, 15.560626f);
                path2.cubicTo(15.787363f, 16.662445f, 15.197868f, 17.626081f, 14.455241f, 18.422647f);
                path2.cubicTo(15.349787f, 18.17497f, 16.265343f, 17.82083f, 17.050797f, 17.215576f);
                path2.cubicTo(20.21302f, 14.779011f, 20.835443f, 10.286081f, 18.580696f, 7.3600206f);
                WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath4 = C24542c.instancePath(looper);
                instancePath4.moveTo(9.871726f, 14.810808f);
                Path path3 = instancePath4;
                path3.cubicTo(9.240817f, 14.810808f, 8.629706f, 14.738283f, 8.041827f, 14.60697f);
                path3.cubicTo(7.9701104f, 14.592222f, 7.896171f, 14.583535f, 7.819403f, 14.58697f);
                path3.cubicTo(7.645262f, 14.594444f, 7.4891005f, 14.654647f, 7.3432417f, 14.748182f);
                instancePath4.lineTo(5.4042516f, 15.991213f);
                Path path4 = instancePath4;
                path4.cubicTo(5.3499084f, 16.025759f, 5.297383f, 16.052828f, 5.2315245f, 16.055656f);
                path4.cubicTo(5.0640497f, 16.06293f, 4.9226356f, 15.931818f, 4.915363f, 15.763738f);
                path4.cubicTo(4.9121304f, 15.687778f, 4.938999f, 15.611213f, 4.9547567f, 15.538283f);
                path4.cubicTo(4.9642515f, 15.494647f, 5.1697063f, 14.562728f, 5.297787f, 13.981314f);
                path4.cubicTo(5.3127365f, 13.915859f, 5.324454f, 13.852828f, 5.3216257f, 13.785556f);
                path4.cubicTo(5.3129387f, 13.583334f, 5.206676f, 13.4085865f, 5.0513225f, 13.30394f);
                path4.cubicTo(3.007888f, 11.910404f, 1.606272f, 9.720707f, 1.2979891f, 7.469394f);
                path4.cubicTo(0.78404975f, 8.277273f, 0.5103124f, 8.919293f, 0.24243356f, 9.855253f);
                path4.cubicTo(-0.75655633f, 13.347576f, 1.4299083f, 17.531414f, 4.997989f, 18.703333f);
                path4.cubicTo(9.101423f, 20.05101f, 13.016979f, 18.538282f, 14.369504f, 15.048384f);
                path4.cubicTo(14.533949f, 14.624546f, 14.713747f, 13.904748f, 14.750918f, 13.306767f);
                path4.cubicTo(13.313949f, 14.363939f, 11.792535f, 14.810808f, 9.871726f, 14.810808f);
                WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
                canvas.drawPath(instancePath4, instancePaint6);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
