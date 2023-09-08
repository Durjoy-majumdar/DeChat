package e21;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: e21.u */
public class C75492u {
    /* renamed from: a */
    public static String m90528a(Context context, long j, int i) {
        long j2 = j * 1000;
        return i == 0 ? new SimpleDateFormat(context.getString(C0966R.string.bfp)).format(new Date(j2)) : i == 1 ? new SimpleDateFormat(context.getString(C0966R.string.bfq)).format(new Date(j2)) : new SimpleDateFormat(context.getString(C0966R.string.bfr)).format(new Date(j2));
    }

    /* renamed from: b */
    public static String m90529b(int i) {
        return String.format("%.2f", new Object[]{Double.valueOf(((double) i) / 100.0d)});
    }
}
