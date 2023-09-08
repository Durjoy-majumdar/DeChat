package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_makesticker */
public class icons_filled_makesticker extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(45.778526f, 30.214539f);
                Path path = instancePath;
                path.cubicTo(49.081486f, 30.84791f, 51.450775f, 33.253143f, 52.8864f, 37.430233f);
                path.cubicTo(55.8525f, 45.68331f, 56.51553f, 52.588856f, 54.875492f, 58.146873f);
                path.cubicTo(52.415436f, 66.4839f, 44.39303f, 70.101944f, 38.50005f, 68.708694f);
                path.cubicTo(34.571396f, 67.77986f, 29.517519f, 64.68938f, 23.338419f, 59.437252f);
                path.cubicTo(24.350294f, 59.059837f, 25.613247f, 57.688484f, 27.12728f, 55.323193f);
                path.cubicTo(29.323425f, 51.892273f, 31.253998f, 48.912968f, 32.919f, 46.38527f);
                path.cubicTo(33.888855f, 46.39802f, 34.672478f, 46.35123f, 35.26987f, 46.2449f);
                path.cubicTo(35.867268f, 46.138565f, 36.6064f, 45.914318f, 37.48727f, 45.572155f);
                path.cubicTo(37.40213f, 46.584316f, 37.32685f, 48.072098f, 37.261433f, 50.035503f);
                path.cubicTo(37.241043f, 50.647446f, 37.312336f, 51.659504f, 37.47531f, 53.07168f);
                instancePath.lineTo(41.148655f, 52.354572f);
                Path path2 = instancePath;
                path2.cubicTo(40.914017f, 50.71583f, 40.85609f, 49.006424f, 40.974865f, 47.226345f);
                path2.cubicTo(41.093643f, 45.446266f, 41.48562f, 42.85337f, 42.150784f, 39.44766f);
                path2.cubicTo(40.5247f, 40.950073f, 38.015854f, 42.039837f, 34.62424f, 42.716946f);
                path2.cubicTo(31.232626f, 43.394054f, 28.46228f, 41.32225f, 26.3132f, 36.50153f);
                path2.cubicTo(28.04107f, 35.125057f, 30.099058f, 33.957783f, 32.487164f, 32.999714f);
                path2.cubicTo(39.954815f, 30.003813f, 43.4097f, 29.760296f, 45.778526f, 30.214539f);
                instancePath.close();
                instancePath.moveTo(22.620173f, 39.109573f);
                Path path3 = instancePath;
                path3.cubicTo(23.714043f, 41.023975f, 24.638653f, 42.432095f, 25.394f, 43.33393f);
                path3.cubicTo(26.086401f, 44.160618f, 27.076878f, 44.968838f, 28.365427f, 45.758595f);
                instancePath.lineTo(28.72424f, 45.973526f);
                instancePath.lineTo(22.198887f, 55.95263f);
                Path path4 = instancePath;
                path4.cubicTo(21.884142f, 56.72923f, 21.067291f, 56.90888f, 19.748337f, 56.491573f);
                path4.cubicTo(18.429382f, 56.07427f, 17.06819f, 55.019695f, 15.664758f, 53.32785f);
                path4.cubicTo(14.953229f, 52.681393f, 15.718515f, 50.320522f, 17.960617f, 46.245247f);
                path4.cubicTo(20.202719f, 42.16997f, 21.755903f, 39.791412f, 22.620173f, 39.109573f);
                instancePath.close();
                instancePath.moveTo(34.474457f, 4.6062756f);
                instancePath.lineTo(34.574173f, 4.789221f);
                instancePath.lineTo(43.63032f, 26.455156f);
                Path path5 = instancePath;
                path5.cubicTo(39.38776f, 26.774252f, 35.454304f, 27.664724f, 31.829952f, 29.12657f);
                path5.cubicTo(28.432121f, 30.49705f, 25.461699f, 32.108444f, 22.918678f, 33.960754f);
                instancePath.lineTo(22.415773f, 34.33443f);
                instancePath.lineTo(9.578569f, 20.993546f);
                Path path6 = instancePath;
                path6.cubicTo(8.683188f, 18.704235f, 8.827061f, 17.106443f, 10.010185f, 16.200167f);
                path6.cubicTo(11.19331f, 15.293893f, 12.580303f, 15.235321f, 14.1711645f, 16.024452f);
                path6.cubicTo(16.817709f, 18.395409f, 20.184057f, 21.316442f, 24.270212f, 24.787556f);
                path6.cubicTo(26.427685f, 26.620287f, 27.761436f, 25.698898f, 29.636843f, 24.913223f);
                path6.cubicTo(31.51225f, 24.127548f, 32.828293f, 22.56533f, 32.121174f, 20.134615f);
                path6.cubicTo(31.058271f, 16.480904f, 29.788193f, 11.989088f, 28.310938f, 6.659167f);
                path6.cubicTo(28.101292f, 4.825618f, 28.88989f, 3.664162f, 30.676737f, 3.1747994f);
                path6.cubicTo(32.39211f, 2.7050111f, 33.658016f, 3.18217f, 34.474457f, 4.6062756f);
                instancePath.close();
                instancePath.moveTo(53.591957f, 3.6470444f);
                instancePath.cubicTo(53.8487f, 3.7227223f, 54.049496f, 3.9235163f, 54.12517f, 4.1802573f);
                instancePath.lineTo(55.354355f, 8.350333f);
                instancePath.lineTo(59.46684f, 9.677218f);
                Path path7 = instancePath;
                path7.cubicTo(59.88114f, 9.810892f, 60.108635f, 10.255113f, 59.97496f, 10.669414f);
                path7.cubicTo(59.897133f, 10.910631f, 59.708057f, 11.099707f, 59.46684f, 11.177535f);
                instancePath.lineTo(55.354355f, 12.50442f);
                instancePath.lineTo(54.12517f, 16.674496f);
                Path path8 = instancePath;
                path8.cubicTo(54.002087f, 17.092066f, 53.5638f, 17.330793f, 53.146233f, 17.207708f);
                path8.cubicTo(52.889492f, 17.13203f, 52.688698f, 16.931238f, 52.613018f, 16.674496f);
                instancePath.lineTo(51.383835f, 12.50442f);
                instancePath.lineTo(47.27135f, 11.177535f);
                Path path9 = instancePath;
                path9.cubicTo(46.85705f, 11.043861f, 46.629555f, 10.599641f, 46.76323f, 10.18534f);
                path9.cubicTo(46.841057f, 9.944122f, 47.030132f, 9.755047f, 47.27135f, 9.677218f);
                instancePath.lineTo(51.383835f, 8.350333f);
                instancePath.lineTo(52.613018f, 4.1802573f);
                instancePath.cubicTo(52.736103f, 3.762688f, 53.17439f, 3.5239604f, 53.591957f, 3.6470444f);
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
