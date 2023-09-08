package pd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import te3.C51163rv3;

/* renamed from: pd0.b */
public class C35455b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f94870d;

    /* renamed from: e */
    public final /* synthetic */ String f94871e;

    /* renamed from: f */
    public final /* synthetic */ String f94872f;

    /* renamed from: g */
    public final /* synthetic */ C35457d f94873g;

    public C35455b(C35457d dVar, List list, String str, String str2) {
        this.f94873g = dVar;
        this.f94870d = list;
        this.f94871e = str;
        this.f94872f = str2;
    }

    public void run() {
        LinkedList linkedList = new LinkedList();
        for (String str : this.f94870d) {
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = str;
            rv32.f141176e = true;
            linkedList.add(rv32);
            Log.m105919d("MicroMsg.NewVoiceInputReportManager", "mVoiceIdSet Id = %s", str);
        }
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = this.f94871e;
        rv33.f141176e = true;
        C51163rv3 rv34 = new C51163rv3();
        rv34.f141175d = this.f94872f;
        rv34.f141176e = true;
        C86709a0.m107524d().mo123455a(228, this.f94873g);
        C86709a0.m107524d().mo123460f(new C35454a(linkedList.size(), linkedList, rv33, rv34));
    }
}
