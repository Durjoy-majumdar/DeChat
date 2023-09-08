package vk3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import hk3.C76227e;
import java.util.List;

/* renamed from: vk3.h */
public class C37746h implements C78430l<C72963f4> {

    /* renamed from: a */
    public Cursor f99972a;

    /* renamed from: b */
    public String f99973b;

    /* renamed from: c */
    public int f99974c;

    /* renamed from: d */
    public int f99975d;

    /* renamed from: e */
    public long f99976e;

    public C37746h(String str, int i, int i2, long j) {
        this.f99973b = str;
        this.f99974c = i;
        this.f99975d = i2;
        this.f99976e = j;
    }

    public void close() {
        this.f99972a.close();
    }

    /* renamed from: p */
    public int mo61317p() {
        return this.f99975d;
    }

    /* renamed from: q */
    public void mo61318q(List<C72963f4> list) {
        try {
            this.f99972a.moveToFirst();
            while (!this.f99972a.isAfterLast()) {
                C72963f4 f4Var = new C72963f4();
                f4Var.convertFrom(this.f99972a);
                list.add(f4Var);
                this.f99972a.moveToNext();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingNormalDataSource", e, "", new Object[0]);
        }
        if (Log.isDebug()) {
            Log.m105919d("MicroMsg.ChattingLoader.ChattingNormalDataSource", "after fillItem:%s", Integer.valueOf(list.size()));
        }
    }

    /* renamed from: r */
    public void mo61319r(C76227e.C32942b bVar) {
        Log.m105919d("MicroMsg.ChattingLoader.ChattingNormalDataSource", "[ChattingNormalDataSource] talker:%s count:%d mTotalCount:%d createTime:%d", this.f99973b, Integer.valueOf(this.f99974c), Integer.valueOf(this.f99975d), Long.valueOf(this.f99976e));
        this.f99972a = ((C72972g4) C97625j3.m125812b().mo105911z()).zx0(this.f99973b, this.f99974c, this.f99976e);
        bVar.next();
    }

    /* renamed from: s */
    public long mo61320s() {
        return this.f99976e;
    }
}
