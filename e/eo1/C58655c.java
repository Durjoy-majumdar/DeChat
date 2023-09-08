package eo1;

import com.tencent.p014mm.sdk.platformtools.Log;
import e03.C58470j;
import p1081gi.C98121d;

/* renamed from: eo1.c */
public final class C58655c implements C58470j {

    /* renamed from: a */
    public final /* synthetic */ C58638b f167924a;

    /* renamed from: b */
    public final /* synthetic */ String f167925b;

    /* renamed from: c */
    public final /* synthetic */ String f167926c;

    public C58655c(C58638b bVar, String str, String str2) {
        this.f167924a = bVar;
        this.f167925b = str;
        this.f167926c = str2;
    }

    /* renamed from: a */
    public void mo79503a(int i, C98121d dVar) {
        String str = this.f167924a.f167881j;
        Log.m105924i(str, "cancel " + this.f167925b + " preload task on Stop " + this.f167926c + ' ' + i);
    }
}
