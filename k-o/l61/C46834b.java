package l61;

import com.tencent.p014mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.p014mm.plugin.emoji.sync.C41062e;
import com.tencent.p014mm.plugin.emoji.sync.C41063f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import di3.C86312j;
import p441aq.C92054g;

/* renamed from: l61.b */
public class C46834b extends C41062e {

    /* renamed from: d */
    public C41063f f125976d;

    /* renamed from: e */
    public String f125977e;

    public C46834b(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "[cpan] empty productid");
        }
        this.f125977e = str;
    }

    /* renamed from: a */
    public void mo64105a() {
    }

    /* renamed from: b */
    public void mo64106b(C41063f fVar) {
        this.f125976d = fVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C46834b)) {
            return false;
        }
        C46834b bVar = (C46834b) obj;
        return !Util.isNullOrNil(this.f125977e) && !Util.isNullOrNil(bVar.getKey()) && this.f125977e.equals(bVar.getKey());
    }

    public String getKey() {
        String str = this.f125977e;
        return str == null ? "" : str;
    }

    public void run() {
        Class cls = C92054g.class;
        if (this.f125976d != null) {
            Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", getKey());
        } else {
            Log.m105928w("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "call back is null");
        }
        ((C92054g) C86312j.m106911c(cls)).getClass();
        EmojiGroupInfo bF = C30790w2.m39221h().mo57715b().mo142025bF("17", false);
        bF.field_flag = 0;
        ((C92054g) C86312j.m106911c(cls)).getClass();
        C30790w2.m39221h().mo57715b().replace(bF);
        C41063f fVar = this.f125976d;
        if (fVar != null) {
            ((BKGLoaderManager) fVar).mo64095d(getKey(), 2, true);
        }
    }
}
