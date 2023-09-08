package ct0;

import android.view.MotionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ct0.a */
public final class C86128a {
    /* renamed from: a */
    public static String m106642a(int i) {
        switch (i) {
            case 0:
                return "ACTION_DOWN";
            case 1:
                return "ACTION_UP";
            case 2:
                return "ACTION_MOVE";
            case 3:
                return "ACTION_CANCEL";
            case 4:
                return "ACTION_OUTSIDE";
            case 7:
                return "ACTION_HOVER_MOVE";
            case 8:
                return "ACTION_SCROLL";
            case 9:
                return "ACTION_HOVER_ENTER";
            case 10:
                return "ACTION_HOVER_EXIT";
            case 11:
                return "ACTION_BUTTON_PRESS";
            case 12:
                return "ACTION_BUTTON_RELEASE";
            default:
                int i2 = (65280 & i) >> 8;
                int i3 = i & 255;
                if (i3 == 5) {
                    return "ACTION_POINTER_DOWN(" + i2 + ")";
                } else if (i3 != 6) {
                    return Integer.toString(i);
                } else {
                    return "ACTION_POINTER_UP(" + i2 + ")";
                }
        }
    }

    /* renamed from: b */
    public static String m106643b(MotionEvent motionEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("MotionEvent { action=");
        sb.append(m106642a(motionEvent.getAction()));
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            sb.append(", x[");
            sb.append(i);
            sb.append("]=");
            sb.append(motionEvent.getX(i));
            sb.append(", y[");
            sb.append(i);
            sb.append("]=");
            sb.append(motionEvent.getY(i));
        }
        sb.append(", downTime=");
        sb.append(motionEvent.getDownTime());
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: c */
    public static void m106644c(String str, String str2, MotionEvent motionEvent) {
        if (Log.getLogLevel() < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(' ');
            sb.append("[apptouch] MotionEvent { action=");
            sb.append(m106642a(motionEvent.getAction()));
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 0; i < pointerCount; i++) {
                sb.append(", x[");
                sb.append(i);
                sb.append("]=");
                sb.append(motionEvent.getX(i));
                sb.append(", y[");
                sb.append(i);
                sb.append("]=");
                sb.append(motionEvent.getY(i));
            }
            sb.append(", downTime=");
            sb.append(motionEvent.getDownTime());
            sb.append(" }");
            Log.m105926v(str, sb.toString());
        }
    }
}
