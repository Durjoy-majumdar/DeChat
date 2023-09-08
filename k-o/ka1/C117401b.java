package ka1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import gy3.C8480h;
import gy3.C87412m;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51189s12;

/* renamed from: ka1.b */
public final class C117401b {

    /* renamed from: a */
    public static final C117402a f351443a = new C117402a((C8480h) null);

    /* renamed from: ka1.b$a */
    public static final class C117402a {
        public C117402a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo182085a(C51189s12 s122) {
            try {
                if (s122.BaseResponse == null) {
                    C49966ja jaVar = new C49966ja();
                    s122.BaseResponse = jaVar;
                    jaVar.f135955d = 0;
                    jaVar.f135956e = new C51163rv3();
                    C51163rv3 rv32 = s122.BaseResponse.f135956e;
                    if (rv32 != null) {
                        rv32.mo73357f("");
                    }
                }
                byte[] byteArray = s122.toByteArray();
                C87412m.m108593f(byteArray, "resp.toByteArray()");
                C116850b.m164834d("hell_resp_mkv_key", byteArray);
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellResponseDao", e, "HellResponseDao, write: " + e.getMessage(), new Object[0]);
            }
        }
    }
}
