package p195li;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import p203mi.C61478v;
import te3.C77955jv3;

/* renamed from: li.e */
public class C61288e implements C11385n {
    public C61288e() {
        C86709a0.m107524d().mo123455a(3618, this);
        C86709a0.m107524d().mo123455a(3854, this);
    }

    /* renamed from: a */
    public void mo86267a(String str, int i, C77955jv3 jv32) {
        C86709a0.m107524d().mo123460f(new C61478v(str, i, jv32));
    }

    public void finalize() {
        C86709a0.m107524d().mo123470p(3618, this);
        C86709a0.m107524d().mo123470p(3854, this);
        super.finalize();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.roomTodo.RoomTodoMsg", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
    }
}
