package com.tencent.p014mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: com.tencent.mm.sdk.platformtools.SensorController */
public class SensorController extends BroadcastReceiver implements SensorEventListener {
    private static final float DEFAULT_NEAR_FAR_DIVIDE_RATIO = 3.0f;
    private static final float DEFAULT_NEAR_FAR_MAX_VALUE = 10.0f;
    private static final float DEFAULT_PROXIMITY_TRIGGER = 0.5f;
    private static final String TAG = "MicroMsg.SensorController";
    public static double configNearFarDivideRatio = -1.0d;
    private static float minValue = 4.2949673E9f;
    private static float proximityTrig = 0.5f;
    public static boolean sensorNearFar;
    private Context context;
    private boolean isHeadSetPlug = false;
    private boolean isRegistered = false;
    private final boolean isSensorEnable;
    private float lastProximity;
    private float lastValue = -1.0f;
    private float maxValue = -1.0f;
    private Sensor proximitySensor;
    private SensorEventCallBack sensorEventCallBack;
    private SensorManager sensorManager;

    /* renamed from: com.tencent.mm.sdk.platformtools.SensorController$SensorEventCallBack */
    public interface SensorEventCallBack {
        void onSensorEvent(boolean z);
    }

    public SensorController(Context context2) {
        boolean z = false;
        if (context2 == null) {
            this.isSensorEnable = false;
            return;
        }
        this.context = context2;
        SensorManager sensorManager2 = (SensorManager) context2.getSystemService("sensor");
        this.sensorManager = sensorManager2;
        Sensor defaultSensor = sensorManager2.getDefaultSensor(8);
        this.proximitySensor = defaultSensor;
        if (defaultSensor != null) {
            this.maxValue = Math.min(DEFAULT_NEAR_FAR_MAX_VALUE, defaultSensor.getMaximumRange());
        }
        float f = this.maxValue;
        if (f < 0.0f) {
            Log.m105921e(TAG, "error, getMaximumRange return %s, set to 1", Float.valueOf(f));
            this.maxValue = 1.0f;
        }
        this.isSensorEnable = this.proximitySensor != null ? true : z;
        this.lastProximity = proximityTrig + 1.0f;
    }

    public boolean hasRegistered() {
        return this.isRegistered;
    }

    public boolean isSensorEnable() {
        return this.isSensorEnable;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Context context2, Intent intent) {
        String action;
        if (intent != null && (action = intent.getAction()) != null && action.equals("android.intent.action.HEADSET_PLUG")) {
            int intExtra = intent.getIntExtra("state", 0);
            if (intExtra == 1) {
                this.isHeadSetPlug = true;
            }
            if (intExtra == 0) {
                this.isHeadSetPlug = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (r4 < 0.0f) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSensorChanged(android.hardware.SensorEvent r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x00c4
            android.hardware.Sensor r0 = r13.sensor
            if (r0 == 0) goto L_0x00c4
            android.hardware.Sensor r0 = r12.proximitySensor
            if (r0 != 0) goto L_0x000c
            goto L_0x00c4
        L_0x000c:
            boolean r0 = r12.isHeadSetPlug
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            float[] r0 = r13.values
            r1 = 0
            r0 = r0[r1]
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            r4[r1] = r5
            float r5 = r12.maxValue
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6 = 1
            r4[r6] = r5
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            r7 = 2
            r4[r7] = r5
            r5 = 3
            double r8 = configNearFarDivideRatio
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r4[r5] = r8
            r5 = 4
            float r8 = r12.lastValue
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r4[r5] = r8
            r5 = 5
            android.hardware.Sensor r8 = r12.proximitySensor
            float r8 = r8.getMaximumRange()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r4[r5] = r8
            java.lang.String r5 = "MicroMsg.SensorController"
            java.lang.String r8 = "newValue: %s, maxValue: %s, divideRatio: %s, configNearFarDivideRatio: %s, lastValue: %s, maxRange: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r4)
            double r8 = configNearFarDivideRatio
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0061
            r2 = r8
        L_0x0061:
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x006c
            float r4 = r12.maxValue
            r8 = 0
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0072
        L_0x006c:
            android.hardware.Sensor r4 = r12.proximitySensor
            float r4 = r4.getMaximumRange()
        L_0x0072:
            double r8 = (double) r4
            double r8 = r8 / r2
            float r2 = (float) r8
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = java.lang.Math.max(r3, r2)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Float r7 = java.lang.Float.valueOf(r2)
            r3[r1] = r7
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3[r6] = r4
            java.lang.String r4 = "onSensorChanged, near threshold: %s, max: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            android.hardware.Sensor r13 = r13.sensor
            int r13 = r13.getType()
            r3 = 8
            if (r13 == r3) goto L_0x009b
            goto L_0x00c4
        L_0x009b:
            com.tencent.mm.sdk.platformtools.SensorController$SensorEventCallBack r13 = r12.sensorEventCallBack
            if (r13 != 0) goto L_0x00a0
            return
        L_0x00a0:
            float r13 = r12.lastValue
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00a7
            return
        L_0x00a7:
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x00b7
            java.lang.String r13 = "sensor near-far event near false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            com.tencent.mm.sdk.platformtools.SensorController$SensorEventCallBack r13 = r12.sensorEventCallBack
            r13.onSensorEvent(r1)
            goto L_0x00c2
        L_0x00b7:
            java.lang.String r13 = "sensor near-far event far true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            com.tencent.mm.sdk.platformtools.SensorController$SensorEventCallBack r13 = r12.sensorEventCallBack
            r13.onSensorEvent(r6)
        L_0x00c2:
            r12.lastValue = r0
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.SensorController.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public void removeSensorCallBack() {
        Log.m105924i(TAG, "sensor callback removed");
        try {
            this.context.unregisterReceiver(this);
        } catch (Exception unused) {
            Log.m105926v(TAG, "sensor receiver has already unregistered");
        }
        this.sensorManager.unregisterListener(this, this.proximitySensor);
        this.sensorManager.unregisterListener(this);
        this.isRegistered = false;
        this.sensorEventCallBack = null;
        this.lastValue = -1.0f;
    }

    public void setSensorCallBack(SensorEventCallBack sensorEventCallBack2) {
        Log.m105924i(TAG, "sensor callback set, isRegistered:" + this.isRegistered + ", proximitySensor: " + this.proximitySensor + ", maxValue: " + this.maxValue);
        if (!this.isRegistered) {
            this.lastValue = -1.0f;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            this.context.registerReceiver(this, intentFilter);
            this.sensorManager.registerListener(this, this.proximitySensor, 2);
            this.isRegistered = true;
        }
        this.sensorEventCallBack = sensorEventCallBack2;
    }
}
