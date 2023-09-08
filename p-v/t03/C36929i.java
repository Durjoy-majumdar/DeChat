package t03;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import s03.C36614d;

/* renamed from: t03.i */
public class C36929i implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C36614d f97978d;

    /* renamed from: e */
    public final /* synthetic */ Context f97979e;

    public C36929i(C36614d dVar, Context context) {
        this.f97978d = dVar;
        this.f97979e = context;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89137b0 d = C86709a0.m107524d();
        this.f97978d.getClass();
        d.mo123470p(2830, this);
        if (i == 0 && i2 == 0) {
            String str2 = ((C36614d) yVar).getResponse().f137283d;
            Intent intent = new Intent();
            intent.putExtra("Contact_User", str2);
            intent.putExtra("Contact_Scene", 3);
            if (str2 != null && str2.length() > 0) {
                C88144b.m109791i(this.f97979e, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                return;
            }
            return;
        }
        Log.m105921e("MicroMsg.TopStory.TopStoryUILogic", "goUserProfile failed, NetSceneTopStoryGetUsername errType:%s, errCode:%s, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
    }
}
