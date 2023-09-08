package je1;

import android.content.Context;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import it1.C60628i;
import nj3.C76912y0;
import ob0.C11385n;

/* renamed from: je1.o4 */
public final class C9358o4 extends C60628i {

    /* renamed from: g */
    public C11385n f29229g;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29229g = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return 3844;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderTopicFollow", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).xx0(0);
        } else if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            Context context = MMApplicationContext.getContext();
            C76912y0.makeText(context, (CharSequence) "is debug info FinderTopicFollow: " + i2 + ' ' + i3, 1).show();
        }
        C11385n nVar = this.f29229g;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
