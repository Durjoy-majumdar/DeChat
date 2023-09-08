package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_call */
public class icons_outlined_call extends C24542c {
    private final int height = 21;
    private final int width = 21;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 21;
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
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -1.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(5.7529464f, 2.394282f);
                instancePath.cubicTo(6.489619f, 2.4188328f, 7.1277194f, 2.8459287f, 7.4194765f, 3.535975f);
                instancePath.lineTo(8.754774f, 7.081084f);
                Path path = instancePath;
                path.cubicTo(8.8916645f, 7.456967f, 8.841324f, 7.741802f, 8.641868f, 8.106636f);
                path.cubicTo(8.2835655f, 8.732723f, 7.545223f, 10.09377f, 7.1610365f, 10.846381f);
                path.cubicTo(7.103841f, 10.952442f, 7.072458f, 11.073608f, 7.072458f, 11.187264f);
                path.cubicTo(7.072458f, 11.297828f, 7.1092515f, 11.422331f, 7.179179f, 11.536042f);
                path.cubicTo(7.872036f, 12.710522f, 8.624343f, 13.71457f, 9.45807f, 14.54708f);
                path.cubicTo(10.281277f, 15.382983f, 11.280091f, 16.132816f, 12.477061f, 16.836973f);
                path.cubicTo(12.586091f, 16.903969f, 12.695989f, 16.936888f, 12.816102f, 16.936888f);
                path.cubicTo(12.939275f, 16.936888f, 13.045776f, 16.908903f, 13.168065f, 16.843245f);
                path.cubicTo(13.860176f, 16.484419f, 15.162746f, 15.779919f, 15.914768f, 15.362781f);
                path.cubicTo(16.26628f, 15.171335f, 16.528221f, 15.123781f, 16.90962f, 15.250723f);
                instancePath.lineTo(20.50418f, 16.600704f);
                Path path2 = instancePath;
                path2.cubicTo(21.16023f, 16.877846f, 21.587082f, 17.503412f, 21.634863f, 18.2205f);
                path2.cubicTo(21.640322f, 18.285902f, 21.64029f, 18.351053f, 21.63567f, 18.416325f);
                path2.cubicTo(21.626163f, 18.55064f, 21.598545f, 18.67826f, 21.558342f, 18.80728f);
                path2.cubicTo(21.537958f, 18.872692f, 21.514357f, 18.937244f, 21.500172f, 18.97439f);
                path2.cubicTo(20.82259f, 20.816149f, 19.08117f, 22.062641f, 17.096186f, 22.062641f);
                path2.cubicTo(16.640055f, 22.062641f, 16.164055f, 21.983427f, 15.890008f, 21.904203f);
                path2.cubicTo(12.524341f, 21.136063f, 9.461503f, 19.424955f, 7.0223465f, 16.989462f);
                path2.cubicTo(4.583081f, 14.553859f, 2.8692455f, 11.495343f, 2.0892596f, 8.077249f);
                path2.cubicTo(2.0900238f, 8.082589f, 2.0674288f, 7.9773f, 2.046598f, 7.8740797f);
                instancePath.lineTo(2.024055f, 7.758421f);
                instancePath.lineTo(2.024055f, 7.758421f);
                Path path3 = instancePath;
                path3.cubicTo(1.971568f, 7.4737234f, 1.9411017f, 7.202685f, 1.9411017f, 6.9292607f);
                path3.cubicTo(1.9411017f, 4.9462905f, 3.1897345f, 3.2071157f, 5.05394f, 2.5236752f);
                path3.cubicTo(5.105157f, 2.5059714f, 5.16578f, 2.4864817f, 5.2385054f, 2.466725f);
                path3.cubicTo(5.347758f, 2.4370458f, 5.4563212f, 2.4148316f, 5.566505f, 2.4029834f);
                path3.cubicTo(5.621234f, 2.3970985f, 5.6755004f, 2.3939266f, 5.7529464f, 2.394282f);
                instancePath.close();
                instancePath.moveTo(5.729661f, 3.5939267f);
                Path path4 = instancePath;
                path4.cubicTo(5.654815f, 3.6004052f, 5.60584f, 3.6104264f, 5.553095f, 3.6247551f);
                path4.cubicTo(5.511534f, 3.6360455f, 5.4792686f, 3.6464186f, 5.4471807f, 3.6572716f);
                path4.cubicTo(4.0698066f, 4.162486f, 3.1411016f, 5.456045f, 3.1411016f, 6.9292607f);
                path4.cubicTo(3.1411016f, 7.1198153f, 3.163843f, 7.3221292f, 3.2041674f, 7.540854f);
                path4.cubicTo(3.2191515f, 7.622131f, 3.2712946f, 7.866273f, 3.2695963f, 7.8665357f);
                path4.cubicTo(3.9880865f, 11.005211f, 5.5893555f, 13.86284f, 7.870237f, 16.140297f);
                path4.cubicTo(10.1511965f, 18.41783f, 13.01332f, 20.016806f, 16.182932f, 20.740934f);
                path4.cubicTo(16.39398f, 20.801144f, 16.763521f, 20.86264f, 17.096186f, 20.86264f);
                path4.cubicTo(18.57231f, 20.86264f, 19.868078f, 19.935143f, 20.36895f, 18.57437f);
                path4.cubicTo(20.392302f, 18.51065f, 20.402878f, 18.481724f, 20.412676f, 18.450277f);
                path4.cubicTo(20.427557f, 18.402521f, 20.436604f, 18.36072f, 20.438663f, 18.331602f);
                path4.cubicTo(20.419348f, 18.026707f, 20.266768f, 17.803091f, 20.055996f, 17.713608f);
                instancePath.lineTo(16.53087f, 16.389778f);
                Path path5 = instancePath;
                path5.cubicTo(15.73581f, 16.834293f, 14.423949f, 17.543818f, 13.727028f, 17.905073f);
                path5.cubicTo(13.442929f, 18.05782f, 13.142019f, 18.136889f, 12.816102f, 18.136889f);
                path5.cubicTo(12.467393f, 18.136889f, 12.141651f, 18.039312f, 11.857108f, 17.864363f);
                path5.cubicTo(10.586833f, 17.11724f, 9.505595f, 16.30553f, 8.606034f, 15.392072f);
                path5.cubicTo(7.6994367f, 14.4868355f, 6.8871217f, 13.4026985f, 6.150618f, 12.154048f);
                path5.cubicTo(5.9733634f, 11.866443f, 5.8724575f, 11.524997f, 5.8724575f, 11.187264f);
                path5.cubicTo(5.8724575f, 10.872168f, 5.9544263f, 10.5556965f, 6.0995336f, 10.286891f);
                path5.cubicTo(6.485279f, 9.530824f, 7.232756f, 8.152938f, 7.5955257f, 7.519242f);
                path5.cubicTo(7.6046176f, 7.502599f, 7.1741185f, 6.3221145f, 6.3040285f, 3.9777896f);
                path5.cubicTo(6.2073374f, 3.7495906f, 5.9880295f, 3.6028028f, 5.729661f, 3.5939267f);
                instancePath.close();
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
