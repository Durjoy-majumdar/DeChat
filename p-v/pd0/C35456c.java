package pd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import te3.C49189dt3;
import te3.C51163rv3;

/* renamed from: pd0.c */
public class C35456c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f94874d;

    /* renamed from: e */
    public final /* synthetic */ String f94875e;

    /* renamed from: f */
    public final /* synthetic */ String f94876f;

    /* renamed from: g */
    public final /* synthetic */ int f94877g;

    /* renamed from: h */
    public final /* synthetic */ C35457d f94878h;

    public C35456c(C35457d dVar, List list, String str, String str2, int i) {
        this.f94878h = dVar;
        this.f94874d = list;
        this.f94875e = str;
        this.f94876f = str2;
        this.f94877g = i;
    }

    public void run() {
        LinkedList linkedList = new LinkedList();
        for (String str : this.f94874d) {
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = str;
            rv32.f141176e = true;
            linkedList.add(rv32);
            Log.m105919d("MicroMsg.NewVoiceInputReportManager", "mVoiceIdSet Id = %s", str);
        }
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = this.f94875e;
        rv33.f141176e = true;
        C51163rv3 rv34 = new C51163rv3();
        rv34.f141175d = this.f94876f;
        rv34.f141176e = true;
        C86709a0.m107524d().mo123455a(228, this.f94878h);
        C35454a aVar = new C35454a(linkedList.size(), linkedList, rv33, rv34);
        int i = this.f94877g;
        C49189dt3 dt32 = aVar.f94869f;
        if (dt32 != null) {
            dt32.f132528h = i;
        }
        C86709a0.m107524d().mo123460f(aVar);
    }
}
