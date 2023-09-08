package qe3;

import com.tencent.p014mm.sdk.platformtools.Log;
import qe3.C89631w;
import te3.C50659oc;

/* renamed from: qe3.y */
public class C47822y extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C50659oc f128386a = new C50659oc();

    public int fromProtoBuf(byte[] bArr) {
        this.f128386a = (C50659oc) new C50659oc().parseFrom(bArr);
        Log.m105918d("MicroMsg.MMBgFg", "retcode:" + this.f128386a.f139083d);
        return this.f128386a.f139083d;
    }

    public int getCmdId() {
        return 1000000312;
    }

    public boolean isRawData() {
        return true;
    }
}
