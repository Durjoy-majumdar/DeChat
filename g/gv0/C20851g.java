package gv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import zu0.C23586p;
import zu0.s$$c;

/* renamed from: gv0.g */
public class C20851g implements C23586p<C20849e> {

    /* renamed from: a */
    public final /* synthetic */ e$$e f58917a;

    /* renamed from: b */
    public final /* synthetic */ LinkedList f58918b;

    /* renamed from: c */
    public final /* synthetic */ e$$d f58919c;

    /* renamed from: d */
    public final /* synthetic */ String f58920d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f58921e;

    public C20851g(e$$e e__e, LinkedList linkedList, e$$d e__d, String str, byte[] bArr) {
        this.f58917a = e__e;
        this.f58918b = linkedList;
        this.f58919c = e__d;
        this.f58920d = str;
        this.f58921e = bArr;
    }

    /* renamed from: a */
    public void mo32554a(Object obj) {
        ((s$$c) this.f58917a).mo37065a((C20849e) obj);
        int i = C20849e.f58894A;
        Log.m105925i("MicroMsg.BackupDataPushScene", "out backupList:%d", Integer.valueOf(this.f58918b.size()));
    }

    public Object run() {
        return new C20849e(this.f58919c, this.f58920d, this.f58918b, this.f58921e, (C20850f) null);
    }
}
