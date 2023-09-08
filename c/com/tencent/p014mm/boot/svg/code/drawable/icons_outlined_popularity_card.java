package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_popularity_card */
public class icons_outlined_popularity_card extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(4.60863f, 5.0f);
        instancePath.lineTo(27.3914f, 5.0f);
        Path path = instancePath;
        path.cubicTo(28.0803f, 5.0f, 28.4577f, 5.07142f, 28.8514f, 5.27769f);
        path.cubicTo(29.2222f, 5.47198f, 29.5182f, 5.76198f, 29.7166f, 6.12528f);
        path.cubicTo(29.9271f, 6.51097f, 30.0f, 6.8808f, 30.0f, 7.55572f);
        instancePath.lineTo(30.0f, 24.4443f);
        Path path2 = instancePath;
        path2.cubicTo(30.0f, 25.1192f, 29.9271f, 25.489f, 29.7166f, 25.8747f);
        path2.cubicTo(29.5182f, 26.238f, 29.2222f, 26.528f, 28.8514f, 26.7223f);
        path2.cubicTo(28.4577f, 26.9286f, 28.0803f, 27.0f, 27.3914f, 27.0f);
        instancePath.lineTo(4.60863f, 27.0f);
        Path path3 = instancePath;
        path3.cubicTo(3.91974f, 27.0f, 3.54225f, 26.9286f, 3.14858f, 26.7223f);
        path3.cubicTo(2.77775f, 26.528f, 2.48176f, 26.238f, 2.28344f, 25.8747f);
        path3.cubicTo(2.0729f, 25.489f, 2.0f, 25.1192f, 2.0f, 24.4443f);
        instancePath.lineTo(2.0f, 7.55572f);
        Path path4 = instancePath;
        path4.cubicTo(2.0f, 6.8808f, 2.0729f, 6.51097f, 2.28344f, 6.12528f);
        path4.cubicTo(2.48176f, 5.76198f, 2.77775f, 5.47198f, 3.14858f, 5.27769f);
        path4.cubicTo(3.54225f, 5.07142f, 3.91974f, 5.0f, 4.60863f, 5.0f);
        instancePath.close();
        instancePath.moveTo(27.5411f, 6.63074f);
        instancePath.lineTo(4.45874f, 6.63074f);
        instancePath.lineTo(4.23398f, 6.64003f);
        instancePath.lineTo(4.0839f, 6.66024f);
        Path path5 = instancePath;
        path5.cubicTo(4.02252f, 6.67336f, 3.97785f, 6.69121f, 3.93294f, 6.71474f);
        path5.cubicTo(3.85199f, 6.75716f, 3.79343f, 6.81453f, 3.75013f, 6.89384f);
        instancePath.lineTo(3.70954f, 6.98645f);
        Path path6 = instancePath;
        path6.cubicTo(3.6984f, 7.02049f, 3.68954f, 7.05935f, 3.68269f, 7.10795f);
        instancePath.lineTo(3.66785f, 7.28788f);
        path6.cubicTo(3.66471f, 7.36087f, 3.66328f, 7.44852f, 3.66328f, 7.55575f);
        instancePath.lineTo(3.66328f, 24.4443f);
        instancePath.lineTo(3.66785f, 24.7122f);
        instancePath.lineTo(3.68269f, 24.8921f);
        instancePath.cubicTo(3.68954f, 24.9407f, 3.6984f, 24.9796f, 3.70954f, 25.0136f);
        instancePath.lineTo(3.75013f, 25.1062f);
        Path path7 = instancePath;
        path7.cubicTo(3.79343f, 25.1855f, 3.85199f, 25.2429f, 3.93294f, 25.2853f);
        path7.cubicTo(4.00779f, 25.3245f, 4.08198f, 25.348f, 4.23398f, 25.36f);
        instancePath.lineTo(4.45874f, 25.3693f);
        instancePath.lineTo(27.5411f, 25.3693f);
        instancePath.lineTo(27.7659f, 25.36f);
        path7.cubicTo(27.9179f, 25.348f, 27.992f, 25.3245f, 28.0669f, 25.2853f);
        path7.cubicTo(28.1478f, 25.2429f, 28.2064f, 25.1855f, 28.2497f, 25.1062f);
        instancePath.lineTo(28.2903f, 25.0136f);
        instancePath.lineTo(28.3171f, 24.8921f);
        instancePath.lineTo(28.332f, 24.7122f);
        path7.cubicTo(28.3351f, 24.6392f, 28.3365f, 24.5515f, 28.3365f, 24.4443f);
        instancePath.lineTo(28.3365f, 7.55575f);
        instancePath.lineTo(28.332f, 7.28788f);
        instancePath.lineTo(28.3171f, 7.10795f);
        instancePath.lineTo(28.2903f, 6.98645f);
        instancePath.lineTo(28.2497f, 6.89384f);
        Path path8 = instancePath;
        path8.cubicTo(28.2064f, 6.81453f, 28.1478f, 6.75716f, 28.0669f, 6.71474f);
        path8.cubicTo(28.022f, 6.69121f, 27.9773f, 6.67336f, 27.9159f, 6.66024f);
        instancePath.lineTo(27.7659f, 6.64003f);
        instancePath.lineTo(27.5411f, 6.63074f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint4.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(0.25f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(20.5114f, 20.377f);
        instancePath2.lineTo(20.5114f, 20.575f);
        instancePath2.lineTo(9.44318f, 20.575f);
        instancePath2.lineTo(9.44318f, 20.377f);
        Path path9 = instancePath2;
        path9.cubicTo(9.44318f, 20.3367f, 9.46878f, 20.26f, 9.52168f, 20.1771f);
        path9.cubicTo(9.5744f, 20.0945f, 9.63389f, 20.0376f, 9.67226f, 20.0193f);
        instancePath2.lineTo(13.5316f, 18.1779f);
        Path path10 = instancePath2;
        path10.cubicTo(14.0841f, 17.9142f, 14.4359f, 17.4596f, 14.5461f, 16.9493f);
        path10.cubicTo(14.6563f, 16.4388f, 14.5226f, 15.8827f, 14.1246f, 15.4215f);
        instancePath2.lineTo(13.8781f, 15.1359f);
        Path path11 = instancePath2;
        path11.cubicTo(13.7026f, 14.9325f, 13.5302f, 14.6122f, 13.4014f, 14.2682f);
        path11.cubicTo(13.2726f, 13.924f, 13.1932f, 13.5712f, 13.1932f, 13.3062f);
        instancePath2.lineTo(13.1932f, 12.1664f);
        Path path12 = instancePath2;
        path12.cubicTo(13.1932f, 11.2085f, 13.9911f, 10.425f, 14.9773f, 10.425f);
        path12.cubicTo(15.9647f, 10.425f, 16.7614f, 11.2083f, 16.7614f, 12.1668f);
        instancePath2.lineTo(16.7614f, 13.3068f);
        Path path13 = instancePath2;
        path13.cubicTo(16.7614f, 13.571f, 16.6816f, 13.9243f, 16.5526f, 14.269f);
        path13.cubicTo(16.4236f, 14.6136f, 16.2512f, 14.9343f, 16.0764f, 15.1369f);
        instancePath2.lineTo(15.8299f, 15.4226f);
        Path path14 = instancePath2;
        path14.cubicTo(15.4327f, 15.8829f, 15.2987f, 16.4388f, 15.4085f, 16.9494f);
        path14.cubicTo(15.5184f, 17.4599f, 15.8698f, 17.915f, 16.4231f, 18.1789f);
        instancePath2.lineTo(20.2824f, 20.0195f);
        Path path15 = instancePath2;
        path15.cubicTo(20.3216f, 20.0382f, 20.381f, 20.0949f, 20.4333f, 20.1768f);
        path15.cubicTo(20.4858f, 20.2589f, 20.5114f, 20.3355f, 20.5114f, 20.377f);
        instancePath2.close();
        instancePath2.moveTo(12.125f, 13.3062f);
        Path path16 = instancePath2;
        path16.cubicTo(12.125f, 13.7057f, 12.2312f, 14.1825f, 12.3989f, 14.6307f);
        path16.cubicTo(12.5667f, 15.079f, 12.8002f, 15.51f, 13.0635f, 15.8151f);
        instancePath2.lineTo(13.31f, 16.1008f);
        Path path17 = instancePath2;
        path17.cubicTo(13.4901f, 16.3095f, 13.5436f, 16.5354f, 13.5011f, 16.7316f);
        path17.cubicTo(13.4585f, 16.9282f, 13.3154f, 17.1138f, 13.0651f, 17.2333f);
        instancePath2.lineTo(9.20578f, 19.0747f);
        Path path18 = instancePath2;
        path18.cubicTo(8.97036f, 19.1871f, 8.76408f, 19.3884f, 8.61696f, 19.6189f);
        path18.cubicTo(8.46992f, 19.8492f, 8.375f, 20.1195f, 8.375f, 20.377f);
        instancePath2.lineTo(8.375f, 20.8344f);
        instancePath2.cubicTo(8.375f, 21.2761f, 8.73991f, 21.625f, 9.18279f, 21.625f);
        instancePath2.lineTo(20.7718f, 21.625f);
        instancePath2.cubicTo(21.2129f, 21.625f, 21.5795f, 21.2742f, 21.5795f, 20.8344f);
        instancePath2.lineTo(21.5795f, 20.377f);
        instancePath2.cubicTo(21.5795f, 20.3486f, 21.5784f, 20.3202f, 21.5762f, 20.2917f);
        instancePath2.lineTo(22.925f, 20.2917f);
        instancePath2.cubicTo(23.3056f, 20.2917f, 23.625f, 19.9918f, 23.625f, 19.612f);
        instancePath2.lineTo(23.625f, 19.2308f);
        Path path19 = instancePath2;
        path19.cubicTo(23.625f, 19.0097f, 23.5432f, 18.7803f, 23.4176f, 18.5861f);
        path19.cubicTo(23.2919f, 18.3918f, 23.1155f, 18.222f, 22.9137f, 18.1267f);
        instancePath2.lineTo(19.6637f, 16.5928f);
        Path path20 = instancePath2;
        path20.cubicTo(19.4565f, 16.495f, 19.3416f, 16.3446f, 19.3078f, 16.1883f);
        path20.cubicTo(19.274f, 16.0323f, 19.3169f, 15.851f, 19.464f, 15.6822f);
        instancePath2.lineTo(19.6716f, 15.4441f);
        Path path21 = instancePath2;
        path21.cubicTo(19.8946f, 15.1884f, 20.0924f, 14.8265f, 20.2344f, 14.4511f);
        path21.cubicTo(20.3764f, 14.0757f, 20.4671f, 13.6752f, 20.4671f, 13.339f);
        instancePath2.lineTo(20.4671f, 12.389f);
        Path path22 = instancePath2;
        path22.cubicTo(20.4671f, 11.0899f, 19.379f, 10.0417f, 18.0455f, 10.0417f);
        path22.cubicTo(17.6911f, 10.0417f, 17.3538f, 10.1158f, 17.0497f, 10.2491f);
        path22.cubicTo(16.5296f, 9.71085f, 15.7932f, 9.375f, 14.9773f, 9.375f);
        path22.cubicTo(13.4078f, 9.375f, 12.125f, 10.622f, 12.125f, 12.1664f);
        instancePath2.lineTo(12.125f, 13.3062f);
        instancePath2.close();
        instancePath2.moveTo(17.8295f, 12.1668f);
        Path path23 = instancePath2;
        path23.cubicTo(17.8295f, 11.8092f, 17.7607f, 11.4671f, 17.6352f, 11.1525f);
        path23.cubicTo(17.7645f, 11.113f, 17.9022f, 11.0917f, 18.0455f, 11.0917f);
        path23.cubicTo(18.7988f, 11.0917f, 19.3989f, 11.6794f, 19.3989f, 12.389f);
        instancePath2.lineTo(19.3989f, 13.339f);
        Path path24 = instancePath2;
        path24.cubicTo(19.3989f, 13.5386f, 19.3358f, 13.814f, 19.2332f, 14.0852f);
        path24.cubicTo(19.1306f, 14.3563f, 18.9947f, 14.6069f, 18.8605f, 14.7608f);
        instancePath2.lineTo(18.6529f, 14.9989f);
        instancePath2.cubicTo(17.9102f, 15.8508f, 18.173f, 17.054f, 19.2013f, 17.5393f);
        instancePath2.lineTo(22.4513f, 19.0732f);
        Path path25 = instancePath2;
        path25.cubicTo(22.4509f, 19.0731f, 22.4508f, 19.073f, 22.4509f, 19.0731f);
        path25.cubicTo(22.4515f, 19.0736f, 22.4589f, 19.0784f, 22.472f, 19.0923f);
        path25.cubicTo(22.486f, 19.1071f, 22.5014f, 19.1268f, 22.5157f, 19.1487f);
        path25.cubicTo(22.5299f, 19.1706f, 22.5415f, 19.1922f, 22.549f, 19.2102f);
        path25.cubicTo(22.5548f, 19.2241f, 22.5564f, 19.2314f, 22.5567f, 19.2328f);
        path25.cubicTo(22.5568f, 19.233f, 22.5568f, 19.233f, 22.5568f, 19.2331f);
        instancePath2.lineTo(22.5568f, 19.2417f);
        instancePath2.lineTo(21.0074f, 19.2417f);
        instancePath2.cubicTo(20.927f, 19.1754f, 20.8402f, 19.1185f, 20.7487f, 19.0749f);
        instancePath2.lineTo(16.8894f, 17.2342f);
        Path path26 = instancePath2;
        path26.cubicTo(16.6381f, 17.1143f, 16.4956f, 16.9282f, 16.4535f, 16.7315f);
        path26.cubicTo(16.4114f, 16.535f, 16.4655f, 16.3093f, 16.6446f, 16.1017f);
        instancePath2.lineTo(16.8911f, 15.816f);
        Path path27 = instancePath2;
        path27.cubicTo(17.1534f, 15.512f, 17.387f, 15.0807f, 17.5549f, 14.632f);
        path27.cubicTo(17.7229f, 14.1834f, 17.8295f, 13.706f, 17.8295f, 13.3068f);
        instancePath2.lineTo(17.8295f, 12.1668f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
