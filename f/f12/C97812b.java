package f12;

import android.graphics.BitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: f12.b */
public class C97812b {

    /* renamed from: a */
    public String f286934a;

    /* renamed from: b */
    public String f286935b;

    /* renamed from: c */
    public int f286936c;

    /* renamed from: d */
    public int f286937d;

    /* renamed from: e */
    public int f286938e;

    /* renamed from: f */
    public int f286939f;

    /* renamed from: g */
    public int f286940g;

    /* renamed from: h */
    public int f286941h;

    /* renamed from: i */
    public String f286942i;

    /* renamed from: a */
    public String mo137148a(String str) {
        return Util.isNullOrNil(str) ? "" : str.replace(",", ";");
    }

    /* renamed from: b */
    public int mo137149b(String str) {
        int i = 0;
        try {
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
            if (imageOptions != null) {
                String str2 = imageOptions.outMimeType;
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase();
                    if (lowerCase.indexOf("png") >= 0) {
                        i = 1;
                    } else {
                        if (lowerCase.indexOf("jpg") < 0) {
                            if (lowerCase.indexOf("jpeg") < 0) {
                                if (lowerCase.indexOf("wxam") >= 0) {
                                    i = 4;
                                }
                            }
                        }
                        i = 2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (str.indexOf("png") >= 0) {
            return 1;
        }
        if (str.indexOf("jpg") >= 0 || str.indexOf("jpeg") >= 0) {
            return 2;
        }
        if (str.indexOf("mp4") >= 0) {
            return 3;
        }
        if (str.indexOf("wxam") >= 0) {
            return 4;
        }
        return i;
    }
}
