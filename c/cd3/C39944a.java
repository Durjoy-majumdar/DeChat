package cd3;

import android.database.MatrixCursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import va1.C52807a;

/* renamed from: cd3.a */
public class C39944a {

    /* renamed from: a */
    public static final String[] f107085a = {"retCode", "url"};

    /* renamed from: a */
    public static MatrixCursor m42754a(int i) {
        Log.m105924i("MicroMsg.ExtCommonUtils", "returnMatrix = " + i);
        MatrixCursor matrixCursor = new MatrixCursor(C52807a.f147535a);
        matrixCursor.addRow(new Object[]{Integer.valueOf(i)});
        return matrixCursor;
    }

    /* renamed from: b */
    public static MatrixCursor m42755b(int i, String str) {
        Log.m105924i("MicroMsg.ExtCommonUtils", "returnMatrix = " + i);
        MatrixCursor matrixCursor = new MatrixCursor(f107085a);
        matrixCursor.addRow(new Object[]{Integer.valueOf(i), str});
        return matrixCursor;
    }
}
