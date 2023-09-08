package q41;

import android.database.Cursor;
import com.tencent.wcdb.repair.RepairKit;
import com.tencent.youtu.sdkkitframework.common.StateEvent;

public class f$$f implements RepairKit.Callback {

    /* renamed from: a */
    public int f353264a = 0;

    /* renamed from: b */
    public int f353265b = 0;

    /* renamed from: c */
    public boolean f353266c = false;

    /* renamed from: d */
    public final /* synthetic */ int[] f353267d;

    /* renamed from: e */
    public final /* synthetic */ C118169f f353268e;

    public f$$f(C118169f fVar, int[] iArr) {
        this.f353268e = fVar;
        this.f353267d = iArr;
    }

    public int onProgress(String str, int i, Cursor cursor) {
        int i2 = this.f353264a;
        if (i2 == 0) {
            if (!str.equalsIgnoreCase(StateEvent.Name.MESSAGE)) {
                return 0;
            }
            this.f353264a = i;
        } else if (i2 != i) {
            if (!this.f353266c) {
                this.f353266c = true;
                this.f353268e.publishProgress(new Integer[]{3});
            }
            return 0;
        }
        int i3 = this.f353265b;
        this.f353265b = i3 + 1;
        if (i3 % 1000 == 0) {
            this.f353268e.publishProgress(new Integer[]{2, Integer.valueOf(this.f353265b - 1), Integer.valueOf(this.f353268e.f353232q)});
        }
        int[] iArr = this.f353267d;
        iArr[0] = iArr[0] + 1;
        return 0;
    }
}
