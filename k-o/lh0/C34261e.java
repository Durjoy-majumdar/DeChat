package lh0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p823sg.C101614i;
import sf0.C90189z;

/* renamed from: lh0.e */
public class C34261e extends C34256a<C34258b> {

    /* renamed from: f */
    public static final String[] f92362f = {MAutoStorage.getCreateSQLs(C34258b.f92357L, "AiFinderRedDotInfo")};

    /* renamed from: g */
    public static final String[] f92363g = new String[0];

    /* renamed from: e */
    public LruCache<String, C34258b> f92364e = new C101614i(30);

    public C34261e(C90189z.C90190a aVar) {
        super(aVar, C34258b.f92357L, "AiFinderRedDotInfo", f92363g);
    }

    /* renamed from: Lo */
    public int mo59517Lo() {
        return 14;
    }

    /* renamed from: Ow */
    public boolean mo59524Ow(C34258b bVar) {
        long currentTicks = Util.currentTicks();
        if (bVar == null) {
            return false;
        }
        boolean replace = super.replace(bVar, false);
        if (replace) {
            this.f92364e.put(bVar.field_tipsId, bVar);
        }
        Log.m105927v("MicroMsg.AiFinderRedDotInfoStorage", "replace flag[%b] cost[%d] info[%s]", Boolean.valueOf(replace), Long.valueOf(Util.ticksToNow(currentTicks)), bVar);
        return replace;
    }

    /* renamed from: Yt */
    public C34258b mo59525Yt(String str) {
        long currentTicks = Util.currentTicks();
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C34258b bVar = this.f92364e.get(str);
        if (bVar != null) {
            return bVar;
        }
        C34258b bVar2 = new C34258b(str);
        boolean z = super.get(bVar2, new String[0]);
        if (z) {
            this.f92364e.put(str, bVar2);
        }
        Log.m105927v("MicroMsg.AiFinderRedDotInfoStorage", "get by tipsId flag[%b] cost[%d] tipsId[%s]", Boolean.valueOf(z), Long.valueOf(Util.ticksToNow(currentTicks)), str);
        return bVar2;
    }

    /* renamed from: bD */
    public boolean mo59526bD(C34258b bVar) {
        long currentTicks = Util.currentTicks();
        if (bVar == null || bVar.systemRowid <= 0) {
            return false;
        }
        this.f92364e.remove(bVar.field_tipsId);
        boolean updateNotify = super.updateNotify(bVar, false, new String[0]);
        if (updateNotify) {
            this.f92364e.put(bVar.field_tipsId, bVar);
        }
        Log.m105927v("MicroMsg.AiFinderRedDotInfoStorage", "update flag[%b] cost[%d] info[%s]", Boolean.valueOf(updateNotify), Long.valueOf(Util.ticksToNow(currentTicks)), bVar);
        return updateNotify;
    }

    /* renamed from: jo */
    public String mo59518jo() {
        return "ds";
    }

    /* renamed from: qq */
    public String mo59519qq() {
        return "AiFinderRedDotInfo";
    }
}
