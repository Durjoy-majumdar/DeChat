package ai3;

import ai3.C112789a;
import ai3.C112793f;
import android.database.sqlite.SQLiteClosable;
import android.util.SparseArray;
import com.tencent.p014mm.p136ui.C75029y;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ai3.b */
public abstract class C112790b<T extends C112789a> extends SQLiteClosable {

    /* renamed from: d */
    public SparseArray<Object> f337728d = new SparseArray<>();

    /* renamed from: e */
    public HashMap<Object, T> f337729e = new HashMap<>();

    /* renamed from: f */
    public ArrayList<Object> f337730f;

    /* renamed from: g */
    public T f337731g;

    public C112790b(boolean z) {
    }

    /* renamed from: N */
    public boolean mo164549N(Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 1) {
                HashMap<Object, T> hashMap = this.f337729e;
                return hashMap != null && hashMap.containsKey(objArr[0]);
            }
        }
        HashMap<Object, T> hashMap2 = this.f337729e;
        return hashMap2 != null && hashMap2.containsKey(obj);
    }

    /* renamed from: a */
    public void mo164550a(int i, int i2) {
        if (i2 != 0) {
            Log.m105921e("MicroMsg.CursorDataWindow", "newcursor rowEnd with error %d rowNum : %d", Integer.valueOf(i2), Integer.valueOf(i));
            this.f337728d.remove(i);
            return;
        }
        T t = this.f337731g;
        if (t != null) {
            Object key = t.getKey();
            this.f337729e.put(key, this.f337731g);
            this.f337728d.put(i, key);
        }
    }

    /* renamed from: b */
    public void mo164551b(int i) {
        C112793f.C67050c cVar = C112793f.this.f337748j;
        this.f337731g = cVar != null ? C75029y.this.mo103510h() : null;
    }

    public void onAllReferencesReleased() {
        Log.m105924i("MicroMsg.CursorDataWindow", "clearData");
        this.f337728d.clear();
        this.f337729e.clear();
    }
}
