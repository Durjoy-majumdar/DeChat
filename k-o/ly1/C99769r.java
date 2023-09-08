package ly1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.MediaStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ly1.r */
public class C99769r {

    /* renamed from: b */
    public static C99769r f292411b;

    /* renamed from: c */
    public static Object f292412c = new Object();

    /* renamed from: a */
    public ContentResolver f292413a = MMApplicationContext.getContext().getContentResolver();

    /* renamed from: b */
    public static C99769r m130217b() {
        if (f292411b == null) {
            synchronized (f292412c) {
                if (f292411b == null) {
                    f292411b = new C99769r();
                }
            }
        }
        return f292411b;
    }

    /* renamed from: a */
    public int mo139131a(LinkedList<String> linkedList, long j, long j2) {
        Cursor query = this.f292413a.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, mo139132c(linkedList, j, j2), (String[]) null, (String) null);
        if (query == null || !query.moveToNext()) {
            return 0;
        }
        int i = query.getInt(0);
        query.close();
        return i;
    }

    /* renamed from: c */
    public String mo139132c(LinkedList<String> linkedList, long j, long j2) {
        String str;
        int i;
        Object[] objArr = new Object[6];
        objArr[0] = "bucket_display_name";
        if (Util.isNullOrNil((List) linkedList)) {
            str = "()";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            int size = linkedList.size();
            int i2 = 0;
            while (true) {
                i = size - 1;
                if (i2 >= i) {
                    break;
                }
                sb.append("'" + linkedList.get(i2) + "'");
                sb.append(",");
                i2++;
            }
            sb.append("'" + linkedList.get(i) + "'");
            sb.append(")");
            str = sb.toString();
        }
        objArr[1] = str;
        objArr[2] = "datetaken";
        objArr[3] = Long.valueOf(j);
        objArr[4] = "datetaken";
        objArr[5] = Long.valueOf(j2);
        String format = String.format("%s in %s and %s<=%d AND %s>=%d", objArr);
        Log.m105919d("MicroMsg.GameLocalVideoQuery", "where %s", format);
        return format;
    }
}
