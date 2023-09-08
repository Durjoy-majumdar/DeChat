package at3;

import android.hardware.SensorEvent;
import java.util.Arrays;

/* renamed from: at3.h */
public class C113078h {

    /* renamed from: a */
    public final int f338480a;

    /* renamed from: b */
    public final long f338481b;

    /* renamed from: c */
    public final float[] f338482c;

    public C113078h(SensorEvent sensorEvent, long j) {
        this.f338480a = sensorEvent.sensor.getType();
        this.f338481b = j;
        float[] fArr = sensorEvent.values;
        this.f338482c = Arrays.copyOf(fArr, fArr.length);
    }
}
