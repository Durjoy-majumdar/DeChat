package pb1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.hilive.mediasdk.SdkInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FavForwardQualityStruct;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.fav.p047ui.C93604g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C75592q0;
import eb0.C86493v0;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C101834rc0;
import te3.e44;
import te3.f44;

/* renamed from: pb1.s1 */
public class C100743s1 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f295146d;

    /* renamed from: e */
    public C11385n f295147e = null;

    /* renamed from: f */
    public String f295148f;

    /* renamed from: g */
    public int f295149g;

    /* renamed from: h */
    public List<Integer> f295150h;

    /* renamed from: i */
    public int f295151i;

    /* renamed from: j */
    public C100744a f295152j = null;

    /* renamed from: n */
    public SparseArray<String> f295153n = new SparseArray<>();

    /* renamed from: pb1.s1$a */
    public interface C100744a {
    }

    public C100743s1(String str, int i, List<Integer> list, C100744a aVar, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new e44();
        bVar.f127067b = new f44();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sharefav";
        bVar.f127069d = SdkInfo.ErrCode.kErrCodeNotFound;
        bVar.f127070e = WXWebReporter.KEY_NEW_FAILED_CANT_FIX;
        bVar.f127071f = 1000000246;
        this.f295146d = bVar.mo72403a();
        this.f295148f = str;
        this.f295149g = i;
        this.f295150h = list;
        this.f295152j = aVar;
        this.f295151i = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        e44 e44 = (e44) this.f295146d.f127055a.f127080a;
        e44.f132688d = this.f295148f;
        e44.f132689e = this.f295149g;
        LinkedList<Integer> linkedList = new LinkedList<>(this.f295150h);
        e44.f132691g = linkedList;
        e44.f132690f = linkedList.size();
        Log.m105919d("MicroMsg.NetSceneShareFavItem", "do scene %s %d %s %d", e44.f132688d, Integer.valueOf(e44.f132689e), e44.f132691g, Integer.valueOf(e44.f132690f));
        this.f295147e = nVar;
        return dispatch(gVar, this.f295146d, this);
    }

    public int getType() {
        return SdkInfo.ErrCode.kErrCodeNotFound;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105918d("MicroMsg.NetSceneShareFavItem", "netId : " + i + " errType :" + i4 + " errCode: " + i5 + " errMsg :" + str2);
        this.f295153n.clear();
        if (i4 == 4 && i5 != 0) {
            C100745t.m131894f(10003, i5, str2);
        }
        boolean z = i4 == 0 && i5 == 0;
        HashSet<String> hashSet = C100745t.f295154a;
        C100698b0 b0Var = C100698b0.f295038a;
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("MircoMsg.FavReport", "[createReportSession] create report session = " + currentTimeMillis);
        b0Var.mo140130f(3, currentTimeMillis);
        Log.m105924i("MicroMsg.FavApiUtil", "[startFavForwardReportEnv] session = " + currentTimeMillis);
        int i6 = this.f295151i;
        long d = b0Var.mo140128d(3);
        FavForwardQualityStruct c = b0Var.mo140127c();
        if (c == null || d == -4369) {
            Log.m105920e("MicroMsg.FavApiUtil", "[reportFavForwardQualityForSns] struct == null, session = " + d + ", return");
        } else {
            c.f265523d = i6;
            c.f265524e = 2;
            if (z) {
                c.f265525f = 0;
            } else {
                c.f265525f = -1;
                c.f265526g = i4;
                c.f265527h = i5;
            }
        }
        b0Var.mo140127c().mo86054n();
        b0Var.mo140131g(3);
        Log.m105924i("MicroMsg.FavApiUtil", "[endFavForwardReportEnv] session");
        if (i4 == 0 && i5 == 0) {
            f44 f44 = (f44) ((C47350c) uVar).f127056b.f127083a;
            if (f44.f133291d != this.f295150h.size()) {
                Log.m105929w("MicroMsg.NetSceneShareFavItem", "get url error, request count %d, response count %d", Integer.valueOf(this.f295150h.size()), Integer.valueOf(f44.f133291d));
            }
            int i7 = 0;
            while (i7 < f44.f133292e.size() && i7 < this.f295150h.size()) {
                Log.m105919d("MicroMsg.NetSceneShareFavItem", "id[%d] url=%s", this.f295150h.get(i7), f44.f133292e.get(i7));
                this.f295153n.put(this.f295150h.get(i7).intValue(), f44.f133292e.get(i7).f141175d);
                i7++;
            }
        }
        this.f295147e.onSceneEnd(i4, i5, str2, this);
        C100744a aVar = this.f295152j;
        if (aVar != null) {
            C93604g1 g1Var = (C93604g1) aVar;
            String str3 = this.f295153n.get(g1Var.f270299a.field_id);
            Log.m105919d("MicroMsg.FavSendLogic", "on finish, favid %d, url %s", Integer.valueOf(g1Var.f270299a.field_id), str3);
            if (!Util.isNullOrNil(str3)) {
                C100755z zVar = g1Var.f270299a;
                int i8 = zVar.field_type;
                if (4 == i8) {
                    C101834rc0 D = C100734q.m131813D(zVar);
                    String nullAs = Util.nullAs(D.f299297d, g1Var.f270300b.getString(C0966R.string.cs8));
                    Intent intent = new Intent();
                    intent.putExtra("Ksnsupload_link", str3);
                    intent.putExtra("Ksnsupload_title", nullAs);
                    intent.putExtra("Ksnsupload_imgbuf", C86013q1.m106433O(C100734q.m131826Q(D), 0, -1));
                    Context context = g1Var.f270300b;
                    if (context != null) {
                        intent.putExtra("Ksnsupload_type", 1);
                        C88144b.m109791i(context, "sns", ".ui.SnsUploadUI", intent, (Bundle) null);
                    }
                    String str4 = "fav_" + C75592q0.m90789s() + "_" + g1Var.f270299a.field_id;
                    String a = C86493v0.m107223a(str4);
                    C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", str4);
                    intent.putExtra("reportSessionId", a);
                    C100695a0.m131729d(g1Var.f270299a.field_localId, 0, 0, -1);
                } else {
                    Log.m105929w("MicroMsg.FavSendLogic", "unknown type %d, fav id %d", Integer.valueOf(i8), Integer.valueOf(g1Var.f270299a.field_id));
                }
            }
            Runnable runnable = g1Var.f270301c;
            if (runnable != null) {
                MMHandlerThread.postToMainThread(runnable);
            }
        }
    }
}
