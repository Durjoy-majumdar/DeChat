package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import com.tencent.wxmm.v2helper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wechat_appicon */
public class wechat_appicon extends C24542c {
    private final int height = v2helper.VOIP_ENC_HEIGHT_LV1;
    private final int width = v2helper.VOIP_ENC_HEIGHT_LV1;

    public int doCommand(int i, Object... objArr) {
        int i2 = v2helper.VOIP_ENC_HEIGHT_LV1;
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
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(34.0f, 149.90361f);
                Path path = instancePath;
                path.cubicTo(34.0f, 176.09787f, 48.20221f, 199.87598f, 70.5679f, 216.00713f);
                path.cubicTo(72.2153f, 217.21967f, 73.09682f, 218.60667f, 73.09616f, 220.93523f);
                path.cubicTo(73.09669f, 221.57909f, 73.00636f, 222.2616f, 72.82791f, 223.09119f);
                instancePath.lineTo(68.45821f, 241.32338f);
                instancePath.lineTo(68.45821f, 241.32338f);
                Path path2 = instancePath;
                path2.cubicTo(68.1624f, 242.49634f, 67.696075f, 243.27773f, 67.75499f, 244.13629f);
                path2.cubicTo(67.696075f, 246.08324f, 69.26602f, 247.65244f, 71.27113f, 247.65244f);
                path2.cubicTo(71.97204f, 247.65244f, 72.596504f, 247.36713f, 73.38082f, 246.9492f);
                instancePath.lineTo(96.58737f, 233.58786f);
                Path path3 = instancePath;
                path3.cubicTo(98.056656f, 232.69884f, 99.705894f, 232.24063f, 100.81911f, 232.24063f);
                path3.cubicTo(101.93233f, 232.24063f, 103.79032f, 232.58623f, 105.02612f, 232.88463f);
                path3.cubicTo(115.784966f, 235.63449f, 127.401535f, 237.35384f, 139.48434f, 237.104f);
                path3.cubicTo(141.37552f, 237.35384f, 143.3041f, 237.30379f, 145.11017f, 237.104f);
                path3.cubicTo(142.93292f, 230.37633f, 141.68149f, 223.17357f, 141.59402f, 216.00713f);
                path3.cubicTo(141.68149f, 171.568f, 184.7295f, 135.76443f, 237.93639f, 135.83904f);
                path3.cubicTo(239.76025f, 135.76443f, 241.66374f, 135.82451f, 243.56221f, 135.83904f);
                path3.cubicTo(235.62222f, 94.032f, 192.02998f, 62.0f, 139.48434f, 62.0f);
                path3.cubicTo(81.2036f, 62.0f, 34.0f, 101.25728f, 34.0f, 149.90361f);
                instancePath.close();
                instancePath.moveTo(103.61966f, 135.83904f);
                Path path4 = instancePath;
                path4.cubicTo(95.8509f, 135.83904f, 89.555084f, 129.5438f, 89.555084f, 121.77446f);
                path4.cubicTo(89.555084f, 114.00764f, 95.8509f, 107.70988f, 103.61966f, 107.70988f);
                path4.cubicTo(111.38843f, 107.70988f, 117.68424f, 114.00764f, 117.68424f, 121.77446f);
                path4.cubicTo(117.68424f, 129.5438f, 111.38843f, 135.83904f, 103.61966f, 135.83904f);
                instancePath.close();
                instancePath.moveTo(237.93639f, 142.87132f);
                Path path5 = instancePath;
                path5.cubicTo(286.48123f, 142.87132f, 325.84f, 175.58182f, 325.84f, 216.00713f);
                path5.cubicTo(325.84f, 237.94698f, 313.99673f, 257.766f, 295.60117f, 270.85898f);
                path5.cubicTo(293.9761f, 272.22168f, 293.22433f, 273.7804f, 293.22433f, 275.23184f);
                path5.cubicTo(293.22433f, 276.6833f, 293.31876f, 277.1246f, 293.49146f, 277.89127f);
                instancePath.lineTo(293.91864f, 279.72702f);
                instancePath.cubicTo(295.19144f, 285.05353f, 297.0894f, 291.95926f, 297.27335f, 292.58093f);
                instancePath.lineTo(297.52615f, 293.4125f);
                Path path6 = instancePath;
                path6.cubicTo(297.64383f, 293.83292f, 297.73126f, 294.27014f, 297.71085f, 294.76877f);
                path6.cubicTo(297.74487f, 296.27277f, 296.4376f, 297.5817f, 294.89792f, 297.5817f);
                path6.cubicTo(294.2991f, 297.5817f, 293.84036f, 297.4183f, 293.19815f, 297.09305f);
                instancePath.lineTo(292.78824f, 296.87845f);
                instancePath.lineTo(273.80106f, 285.6268f);
                instancePath.lineTo(272.9753f, 285.19626f);
                instancePath.cubicTo(271.84116f, 284.6254f, 270.5732f, 284.12613f, 269.15796f, 284.40378f);
                instancePath.lineTo(267.4173f, 284.7566f);
                Path path7 = instancePath;
                path7.cubicTo(267.20474f, 284.8057f, 267.0502f, 284.84824f, 266.76877f, 284.92355f);
                path7.cubicTo(257.6509f, 287.56833f, 247.96552f, 288.99738f, 237.93639f, 289.14294f);
                path7.cubicTo(189.38904f, 288.99738f, 150.03278f, 256.2869f, 150.03278f, 216.00713f);
                path7.cubicTo(150.03278f, 175.58182f, 189.38904f, 142.87132f, 237.93639f, 142.87132f);
                instancePath.close();
                instancePath.moveTo(208.05981f, 180.84569f);
                Path path8 = instancePath;
                path8.cubicTo(202.18839f, 180.84569f, 197.14911f, 185.88443f, 197.14911f, 191.7564f);
                path8.cubicTo(197.14911f, 198.31268f, 202.18839f, 203.34901f, 208.05981f, 203.34901f);
                path8.cubicTo(214.61797f, 203.34901f, 219.65244f, 198.31268f, 219.65244f, 191.7564f);
                path8.cubicTo(219.65244f, 185.88443f, 214.61797f, 180.84569f, 208.05981f, 180.84569f);
                instancePath.close();
                instancePath.moveTo(266.42783f, 180.84569f);
                Path path9 = instancePath;
                path9.cubicTo(260.5564f, 180.84569f, 255.5171f, 185.88443f, 255.5171f, 191.7564f);
                path9.cubicTo(255.5171f, 198.31268f, 260.5564f, 203.34901f, 266.42783f, 203.34901f);
                path9.cubicTo(272.98596f, 203.34901f, 278.02045f, 198.31268f, 278.02045f, 191.7564f);
                path9.cubicTo(278.02045f, 185.88443f, 272.98596f, 180.84569f, 266.42783f, 180.84569f);
                instancePath.close();
                instancePath.moveTo(173.94255f, 107.70988f);
                Path path10 = instancePath;
                path10.cubicTo(181.70937f, 107.70988f, 188.00713f, 114.00764f, 188.00713f, 121.77446f);
                path10.cubicTo(188.00713f, 129.5438f, 181.70937f, 135.83904f, 173.94255f, 135.83904f);
                path10.cubicTo(166.17323f, 135.83904f, 159.87798f, 129.5438f, 159.87798f, 121.77446f);
                path10.cubicTo(159.87798f, 114.00764f, 166.17323f, 107.70988f, 173.94255f, 107.70988f);
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
