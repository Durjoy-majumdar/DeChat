package y02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.internal.ConstValue;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import te3.C90430p93;
import te3.C90435r93;
import te3.C90439s93;
import te3.C90441u93;
import te3.C90448yt3;
import tw0.C90586i;
import tw0.C90587j;

/* renamed from: y02.c */
public class C91359c extends C91357a {

    /* renamed from: p */
    public String f262036p;

    /* renamed from: q */
    public C90586i f262037q;

    public C91359c(String str, String str2, String str3, boolean z, C90586i iVar) {
        if (!z) {
            this.f262033o = 1;
        } else {
            this.f262033o = 0;
        }
        this.f262036p = str;
        this.f262027f = str2;
        this.f262028g = str3;
        this.f262030i = "mbconfig_" + str;
        this.f262037q = iVar;
        this.f262029h.addAll(C91363f.m114614b());
        LinkedList<C90430p93> linkedList = this.f262029h;
        C90430p93 p932 = new C90430p93();
        p932.f259737d = "package_id";
        p932.f259738e = "wechat-android";
        linkedList.add(p932);
        Log.m105925i("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "PackageId:%s BaseID:%s type:%s ", this.f262036p, this.f262027f, this.f262030i);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(24470, this.f262030i, this.f262036p, Integer.valueOf(this.f262033o), Boolean.FALSE);
        nVar.mo175911u(1821, 3);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C90587j jVar;
        Log.m105925i("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "errType:%d errCode:%d errMsg:%s ", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C90435r93 r932 = (C90435r93) ((C47350c) uVar).f127056b.f127083a;
            C90441u93 u932 = r932.f259789d;
            Log.m105918d("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "node is no empty. try to process");
            jVar = new C90587j();
            if (u932 != null) {
                C90448yt3 yt32 = u932.f259857i;
                if (yt32 != null) {
                    jVar.f260273e = yt32.f259943d;
                    jVar.f260272d = yt32.f259945f;
                    jVar.f260276h = yt32.f259950n;
                }
                jVar.f260270b = Integer.valueOf(u932.f259853e);
                jVar.f260271c = Integer.valueOf(u932.f259855g);
                jVar.f260274f = u932.f259852d;
                jVar.f260278j = this.f262036p;
                LinkedList<C90439s93> linkedList = u932.f259859n;
                if (linkedList != null && !linkedList.isEmpty()) {
                    Iterator<C90439s93> it = u932.f259859n.iterator();
                    while (it.hasNext()) {
                        C90439s93 next = it.next();
                        if (next != null && !Util.isNullOrNil(next.f259833d)) {
                            if (next.f259833d.equalsIgnoreCase("newApkMd5") || next.f259833d.equalsIgnoreCase("mbMd5")) {
                                jVar.f260279k = next.f259834e;
                            } else if (!next.f259833d.equalsIgnoreCase("oldApkMd5")) {
                                if (next.f259833d.equalsIgnoreCase(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION) || next.f259833d.equalsIgnoreCase(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE)) {
                                    jVar.f260280l = next.f259834e;
                                } else if (next.f259833d.equalsIgnoreCase("originalName")) {
                                    jVar.f260281m = next.f259834e;
                                }
                            }
                        }
                    }
                }
            } else {
                Log.m105925i("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "node is nil prerrcode:%d ", Integer.valueOf(r932.f259794i));
            }
            jVar.f260277i = r932.f259794i;
        } else {
            Log.m105918d("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "check tinker update failed.");
            jVar = new C90587j();
            jVar.f260277i = -1;
        }
        this.f262037q.mo122088b(jVar);
        this.f262026e.onSceneEnd(i2, i3, str, this);
    }
}
