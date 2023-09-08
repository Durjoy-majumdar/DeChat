package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.widget.BaseAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.ui.i1 */
public abstract class C6975i1<T> extends BaseAdapter implements MStorage.IOnStorageChange, MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public T f24695d;

    /* renamed from: e */
    public Context f24696e;

    /* renamed from: f */
    public Cursor f24697f = null;

    /* renamed from: g */
    public Map<Integer, T> f24698g = null;

    /* renamed from: h */
    public C6977b f24699h;

    /* renamed from: i */
    public int f24700i;

    /* renamed from: j */
    public MMHandler f24701j = new MMHandler(Looper.getMainLooper());

    /* renamed from: n */
    public Runnable f24702n = new C6976a();

    /* renamed from: com.tencent.mm.ui.i1$a */
    public class C6976a implements Runnable {
        public C6976a() {
        }

        public void run() {
            C6975i1.this.getClass();
            Log.m105918d("MicroMsg.MListAdapter", "ashutest:: do resetCursorJob");
            C6975i1 i1Var = C6975i1.this;
            i1Var.getClass();
            i1Var.mo7991f();
        }
    }

    /* renamed from: com.tencent.mm.ui.i1$b */
    public interface C6977b {
        /* renamed from: a */
        void mo1327a(Object obj);

        /* renamed from: b */
        void mo1328b(Object obj);
    }

    public C6975i1(Context context, T t) {
        this.f24695d = t;
        this.f24696e = context;
        this.f24700i = -1;
    }

    /* renamed from: b */
    public void mo5580b() {
        Map<Integer, T> map = this.f24698g;
        if (map != null) {
            map.clear();
        }
        Cursor cursor = this.f24697f;
        if (cursor != null) {
            cursor.close();
        }
        this.f24700i = -1;
    }

    /* renamed from: d */
    public abstract T mo1330d(T t, Cursor cursor);

    /* renamed from: f */
    public final void mo7991f() {
        Log.m105926v("MicroMsg.MListAdapter", "ashutest:: on UI, directly call resetCursor Job");
        C6977b bVar = this.f24699h;
        if (bVar != null) {
            bVar.mo1328b(this);
        }
        mo5580b();
        mo1333o();
        C6977b bVar2 = this.f24699h;
        if (bVar2 != null) {
            bVar2.mo1327a(this);
        }
    }

    /* renamed from: g */
    public Cursor mo7992g() {
        Cursor cursor = this.f24697f;
        if (cursor == null || cursor.isClosed()) {
            mo1332l();
            Assert.assertNotNull(this.f24697f);
        }
        return this.f24697f;
    }

    public int getCount() {
        if (this.f24700i < 0) {
            this.f24700i = mo7992g().getCount();
        }
        return this.f24700i + mo6470i();
    }

    public T getItem(int i) {
        T t;
        if (mo7996n(i)) {
            return mo7995k();
        }
        Map<Integer, T> map = this.f24698g;
        if (map != null && (t = ((HashMap) map).get(Integer.valueOf(i))) != null) {
            return t;
        }
        if (i < 0 || !mo7992g().moveToPosition(i)) {
            return null;
        }
        if (this.f24698g == null) {
            return mo1330d(this.f24695d, mo7992g());
        }
        T d = mo1330d((Object) null, mo7992g());
        ((HashMap) this.f24698g).put(Integer.valueOf(i), d);
        return d;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* renamed from: h */
    public int mo7994h() {
        if (this.f24700i < 0) {
            this.f24700i = mo7992g().getCount();
        }
        return this.f24700i;
    }

    /* renamed from: i */
    public int mo6470i() {
        return 0;
    }

    /* renamed from: k */
    public T mo7995k() {
        return this.f24695d;
    }

    /* renamed from: l */
    public abstract void mo1332l();

    /* renamed from: n */
    public boolean mo7996n(int i) {
        int i2 = this.f24700i;
        return i >= i2 && i < i2 + mo6470i();
    }

    /* renamed from: o */
    public abstract void mo1333o();

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            Log.m105919d("MicroMsg.MListAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        onNotifyChange((String) obj, (MStorageEventData) null);
    }

    /* renamed from: q */
    public void mo7997q(boolean z) {
        if (!z) {
            Map<Integer, T> map = this.f24698g;
            if (map != null) {
                map.clear();
                this.f24698g = null;
            }
        } else if (this.f24698g == null) {
            this.f24698g = new HashMap();
        }
    }

    /* renamed from: r */
    public void mo7998r(Cursor cursor) {
        this.f24697f = cursor;
        this.f24700i = -1;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        mo7991f();
    }
}
