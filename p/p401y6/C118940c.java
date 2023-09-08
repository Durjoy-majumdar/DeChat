package p401y6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

/* renamed from: y6.c */
public final class C118940c {

    /* renamed from: c */
    public static final C118940c f356246c = new C118940c(new int[]{2}, 2);

    /* renamed from: a */
    public final int[] f356247a;

    /* renamed from: b */
    public final int f356248b;

    public C118940c(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f356247a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f356247a = new int[0];
        }
        this.f356248b = i;
    }

    /* renamed from: a */
    public static C118940c m167684a(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        return (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f356246c : new C118940c(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C118940c)) {
            return false;
        }
        C118940c cVar = (C118940c) obj;
        return Arrays.equals(this.f356247a, cVar.f356247a) && this.f356248b == cVar.f356248b;
    }

    public int hashCode() {
        return this.f356248b + (Arrays.hashCode(this.f356247a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f356248b + ", supportedEncodings=" + Arrays.toString(this.f356247a) + "]";
    }
}
