package dp3;

import android.database.Cursor;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.vending.base.C97311a;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

/* renamed from: dp3.b */
public abstract class C97515b<_Struct, _Item> extends C97311a<_Struct, Cursor> {

    /* renamed from: g */
    public C97516a f286196g;

    /* renamed from: h */
    public _Item f286197h;

    /* renamed from: i */
    public Cursor f286198i = null;

    /* renamed from: j */
    public Map<Integer, _Item> f286199j = null;

    /* renamed from: n */
    public int f286200n;

    /* renamed from: dp3.b$a */
    public interface C97516a {
    }

    public C97515b(_Item _item) {
        this.f286197h = _item;
        this.f286200n = -1;
        mo136790j(true);
    }

    /* renamed from: c */
    public void mo136785c() {
        Map<Integer, _Item> map = this.f286199j;
        if (map != null) {
            map.clear();
        }
        Cursor cursor = this.f286198i;
        if (cursor != null) {
            cursor.close();
        }
        this.f286200n = -1;
    }

    /* renamed from: f */
    public abstract _Item mo136786f(_Item _item, Cursor cursor);

    /* renamed from: g */
    public Cursor mo136787g() {
        Cursor cursor = this.f286198i;
        if (cursor == null || cursor.isClosed()) {
            Assert.assertNotNull(this.f286198i);
        }
        return this.f286198i;
    }

    /* renamed from: h */
    public _Item mo136788h(int i) {
        _Item _item;
        Map<Integer, _Item> map = this.f286199j;
        if (map != null && (_item = ((HashMap) map).get(Integer.valueOf(i))) != null) {
            return _item;
        }
        if (i < 0 || !mo136787g().moveToPosition(i)) {
            return null;
        }
        if (this.f286199j == null) {
            return mo136786f(this.f286197h, mo136787g());
        }
        _Item f = mo136786f((Object) null, mo136787g());
        ((HashMap) this.f286199j).put(Integer.valueOf(i), f);
        return f;
    }

    /* renamed from: i */
    public abstract Cursor mo136789i();

    /* renamed from: j */
    public void mo136790j(boolean z) {
        if (!z) {
            Map<Integer, _Item> map = this.f286199j;
            if (map != null) {
                map.clear();
                this.f286199j = null;
            }
        } else if (this.f286199j == null) {
            this.f286199j = new HashMap();
        }
    }

    public Object prepareVendingDataAsynchronous() {
        if (this.f286196g != null) {
            SnsMethodCalculate.markStartTimeMs("onBeforeAsynchronous", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$51");
            C85405m.m105411a(14);
            SnsMethodCalculate.markEndTimeMs("onBeforeAsynchronous", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$51");
        }
        Cursor i = mo136789i();
        if (this.f286196g != null) {
            SnsMethodCalculate.markStartTimeMs("onAfterAsynchronous", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$51");
            C85405m.m105412b(14);
            SnsMethodCalculate.markEndTimeMs("onAfterAsynchronous", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$51");
        }
        return i;
    }
}
