package ix1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.game.autogen.chatroom.CancelTickleRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.CancelTickleResponse;
import gy3.C87412m;
import java.util.HashMap;
import nj3.C11184p0;
import ob0.C47350c;
import ob0.C89144l0;
import rx3.C13604l;

public final /* synthetic */ class n$$c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124881d;

    /* renamed from: e */
    public final /* synthetic */ long f124882e;

    /* renamed from: f */
    public final /* synthetic */ String f124883f;

    public /* synthetic */ n$$c(C46337n nVar, long j, String str) {
        this.f124881d = nVar;
        this.f124882e = j;
        this.f124883f = str;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C46337n nVar = this.f124881d;
        long j = this.f124882e;
        String str = this.f124883f;
        nVar.getClass();
        if (menuItem.getItemId() == 10001) {
            String str2 = nVar.f124869Z0;
            HashMap<C13604l<String, String>, Long> hashMap = C46326i0.f124817a;
            C87412m.m108594g(str2, "chatroomName");
            C87412m.m108594g(str, "userName");
            CancelTickleRequest cancelTickleRequest = new CancelTickleRequest();
            cancelTickleRequest.chatroom_name = str2;
            cancelTickleRequest.seq = j;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = cancelTickleRequest;
            bVar.f127067b = new CancelTickleResponse();
            bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/canceltickle";
            bVar.f127069d = 1968;
            C89144l0.m111429e(bVar.mo72403a(), new C46321g0(str2, str, j), false);
        }
    }
}
