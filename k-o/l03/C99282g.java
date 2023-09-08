package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13598b0;

/* renamed from: l03.g */
public final class C99282g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f291140d;

    /* renamed from: e */
    public final /* synthetic */ C10446d f291141e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99282g(String str, C10446d dVar) {
        super(0);
        this.f291140d = str;
        this.f291141e = dVar;
    }

    public Object invoke() {
        MomentsVideoDownloadSourceStruct momentsVideoDownloadSourceStruct;
        HashMap<String, MomentsVideoDownloadSourceStruct> hashMap = C99279f.f291125b;
        MomentsVideoDownloadSourceStruct momentsVideoDownloadSourceStruct2 = hashMap.get(this.f291140d);
        if (momentsVideoDownloadSourceStruct2 != null) {
            String str = this.f291140d;
            C10446d dVar = this.f291141e;
            Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "SnsVideoDownloadReporter to report " + str + ", >> " + momentsVideoDownloadSourceStruct2.mo1006q() + ' ' + dVar + ' ' + Thread.currentThread().getName());
            if (momentsVideoDownloadSourceStruct2.f265706F > 0 || momentsVideoDownloadSourceStruct2.f265708H > 0) {
                momentsVideoDownloadSourceStruct2.mo86054n();
                momentsVideoDownloadSourceStruct = hashMap.remove(str);
            } else {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "struct is no to download, " + str);
                hashMap.remove(str);
                return C13598b0.f38549a;
            }
        } else {
            momentsVideoDownloadSourceStruct = null;
        }
        if (momentsVideoDownloadSourceStruct == null) {
            String str2 = this.f291140d;
            C10446d dVar2 = this.f291141e;
            Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "report >> " + str2 + " >> is no have struct, " + dVar2);
        }
        return C13598b0.f38549a;
    }
}
