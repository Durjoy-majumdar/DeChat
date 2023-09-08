package androidx.media;

import java.util.Arrays;
import vl0.C90830d;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f306547a = 0;

    /* renamed from: b */
    public int f306548b = 0;

    /* renamed from: c */
    public int f306549c = 0;

    /* renamed from: d */
    public int f306550d = -1;

    /* renamed from: a */
    public int mo16916a() {
        int i = this.f306550d;
        return i != -1 ? i : AudioAttributesCompat.m138181c(false, this.f306549c, this.f306547a);
    }

    /* renamed from: b */
    public Object mo16917b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f306548b != audioAttributesImplBase.f306548b) {
            return false;
        }
        int i = this.f306549c;
        int i2 = audioAttributesImplBase.f306549c;
        int a = audioAttributesImplBase.mo16916a();
        if (a == 6) {
            i2 |= 4;
        } else if (a == 7) {
            i2 |= 1;
        }
        return i == (i2 & C90830d.CTRL_INDEX) && this.f306547a == audioAttributesImplBase.f306547a && this.f306550d == audioAttributesImplBase.f306550d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f306548b), Integer.valueOf(this.f306549c), Integer.valueOf(this.f306547a), Integer.valueOf(this.f306550d)});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f306550d != -1) {
            sb.append(" stream=");
            sb.append(this.f306550d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f306547a;
        int i2 = AudioAttributesCompat.f306545b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = "unknown usage " + i;
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f306548b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f306549c).toUpperCase());
        return sb.toString();
    }
}
