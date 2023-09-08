package yy0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import f40.C86709a0;
import java.nio.ByteBuffer;
import java.util.UUID;
import p749xh.C102643ea;

/* renamed from: yy0.a */
public class C102970a extends C102643ea {

    /* renamed from: F */
    public static IAutoDBItem.MAutoDBInfo f303861F = C102643ea.initAutoDBInfo(C102643ea.class);

    /* renamed from: G */
    public static final int[] f303862G = {1, 3, 4, 20, 23, 26, 27, 28, 30, 32, 34, 39, 41};

    /* renamed from: H */
    public static final int[] f303863H = {20, 23, 26, 27, 28, 30};

    /* renamed from: I */
    public static final int[] f303864I = {20, 21, 22, 23, 24, 25, 26, 27, 28, 30, 31};

    /* renamed from: J */
    public static final int[] f303865J = {1, 3, 4};

    /* renamed from: K */
    public static final int[] f303866K = {1, 2, 3, 4};

    /* renamed from: L */
    public static final int[] f303867L = {32, 34};

    /* renamed from: M */
    public static final int[] f303868M = {32, 33, 34, 35};

    /* renamed from: m2 */
    public static String m136114m2(String str) {
        if (str.startsWith("/") || str.startsWith("wcf://")) {
            return str;
        }
        return C86709a0.m107535s().f251805c + str;
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f303861F;
    }

    /* renamed from: l2 */
    public String mo142683l2() {
        return m136114m2(this.field_path);
    }

    /* renamed from: n2 */
    public UUID mo142684n2(String str) {
        if (str == null) {
            this.field_linkUUID = null;
            return null;
        }
        UUID fromString = UUID.fromString(str);
        this.field_linkUUID = ByteBuffer.allocate(16).putLong(fromString.getMostSignificantBits()).putLong(fromString.getLeastSignificantBits()).array();
        return fromString;
    }

    public String toString() {
        return "{ rowId: " + this.systemRowid + ", msgId: " + this.field_msgId + ", talker: " + this.field_username + ", msgType: " + this.field_msgType + ", msgSubType: " + this.field_msgSubType + ", path: " + this.field_path + ", size: " + this.field_size + ", diskSpace: " + this.field_diskSpace + ", msgtime: " + this.field_msgtime + " }";
    }
}
